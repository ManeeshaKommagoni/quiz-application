import java.awt.*;
import java.awt.event.*;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import javax.swing.*;



class Topics {
    public static List<String> topics() {
        List<String> topics = new ArrayList<>();
        topics.add("Java");
        topics.add("Python");
        topics.add("C");
        return topics;
    }
}


class Question 
{
    private static List<List<String>> resultList;
    Question(String topic) {
        resultList= new ArrayList<>();
        switch (topic.toLowerCase())
         {
            case "java":
                resultList.add(Arrays.asList(
                        "1) Which of the following option leads to the portability and security of Java?",
                        "a) Bytecode is executed by JVM",
                        "b) The applet makes the Java code secure and portable",
                        "c) Use of exception handling",
                        "d) Dynamic binding between objects",
                        "a")); // Correct answer

                resultList.add(Arrays.asList(
                        "2) Which of the following is not a Java feature?",
                        "a) Dynamic",
                        "b) Architecture Neutral",
                        "c) Use of pointers",
                        "d) Object-oriented",
                        "c")); // Correct answer
                
                resultList.add(Arrays.asList(
                        "3) What is the default value of a local variable in Java?",
                        "a) 0",
                        "b) null",
                        "c) Depends on the type of the variable",
                        "d) Not initialized",
                        "d")); // Correct answer
                
                resultList.add(Arrays.asList(
                        "4) Which keyword is used for the inheritance of a class in Java?",
                        "a) super",
                        "b) this",
                        "c) extends",
                        "d) implements",
                        "c")); // Correct answer
                
                resultList.add(Arrays.asList(
                        "5) What is the output of the following code?\nint x = 5;\nSystem.out.println(x++ + x++);",
                        "a) 10",
                        "b) 11",
                        "c) 12",
                        "d) 13",
                        "b")); // Correct answer

                break;

            case "python":
                resultList.add(Arrays.asList(
                        "1) Which of the following is not a keyword in Python?",
                        "a) yield",
                        "b) with",
                        "c) true",
                        "d) try",
                        "c")); // Correct answer

                resultList.add(Arrays.asList(
                        "2) What is the output of '2' + '3' in Python?",
                        "a) 23",
                        "b) 5",
                        "c) '5'",
                        "d) TypeError",
                        "a")); // Correct answer

                resultList.add(Arrays.asList(
                        "3) Which of the following data types is immutable in Python?",
                        "a) list",
                        "b) tuple",
                        "c) dictionary",
                        "d) set",
                        "b")); // Correct answer

                resultList.add(Arrays.asList(
                        "4) What will be the output of the following code?\nfor i in range(3):\n    print(i, end='')",
                        "a) 0 1 2",
                        "b) 012",
                        "c) 321",
                        "d) 012012",
                        "a")); // Correct answer

                resultList.add(Arrays.asList(
                        "5) What is the output of the following code?\nprint(len([1, [2, [3, 4]]]))",
                        "a) 1",
                        "b) 2",
                        "c) 3",
                        "d) 4",
                        "b")); // Correct answer

                break;

            case "c":
                resultList.add(Arrays.asList(
                        "1) What is the size of int data type in C?",
                        "a) 2 bytes",
                        "b) 4 bytes",
                        "c) 8 bytes",
                        "d) Depends on the compiler",
                        "b")); // Correct answer

                resultList.add(Arrays.asList(
                        "2) Which of the following is not a valid variable name in C?",
                        "a) my_variable",
                        "b) _myvariable",
                        "c) 2myvariable",
                        "d) my variable",
                        "c")); // Correct answer

                resultList.add(Arrays.asList(
                        "3) What is the output of the following code?\n#include <stdio.h>\nint main() {\n    int i = 10;\n    int *ptr = &i;\n    printf('%d', *ptr);\n    return 0;\n}",
                        "a) 10",
                        "b) 0",
                        "c) Compiler error",
                        "d) Segmentation fault",
                        "a")); // Correct answer

                resultList.add(Arrays.asList(
                        "4) What is the output of the following code?\n#include <stdio.h>\nint main() {\n    char str[] = 'Hello';\n    printf('%s', str);\n    return 0;\n}",
                        "a) Hello",
                        "b) H",
                        "c) Compiler error",
                        "d) Segmentation fault",
                        "c")); // Correct answer

                resultList.add(Arrays.asList(
                    "4) What of the following keyword not belong to c language?",
                    "a) continue",
                    "b) break",
                    "c) goto",
                    "d) pass",
                    "d")); // Correct answer
                    break;
                 }
                
        }
        public static List<List<String>> getQuestions(String topic)
        {
            new Question(topic);
            return (Question.resultList);
        }
    }
     
    class Admin {
        private JPanel p;
        private JButton b;
        private TextField password;
        private JLabel resultLabel, l, name;
        final String correctPassword = "12345678";
    
        public Admin() {
            JFrame f = new JFrame("Admin");
            f.setLayout(new FlowLayout());
    
            name = new JLabel("ADMIN");
            name.setFont(new Font("Calibri", Font.BOLD, 20));
    
            l = new JLabel("Enter Password");
    
            password = new TextField(15);
            password.setPreferredSize(new Dimension(150, 30)); // Adjust size here
            password.setEchoChar('*');
    
            b = new JButton("Submit");
            b.setPreferredSize(new Dimension(100, 30)); // Adjust size here
    
            resultLabel = new JLabel();
    
            p = new JPanel(new GridLayout(0, 1));
    
            p.add(name);
            p.add(l);
            p.add(password);
            p.add(b);
            p.add(resultLabel);
    
            f.add(p);
            f.setSize(700, 400);
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
            b.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String enteredPassword = password.getText();
                    if (enteredPassword.equals(correctPassword)) {
                        resultLabel.setText("Password is correct!");
                        resultLabel.setForeground(Color.GREEN);
                        AdminActions.adminActions();
                    } else {
                        resultLabel.setText("Incorrect Password!\n Try Again");
                        resultLabel.setForeground(Color.RED);
                    }
                }
            });
    
            f.setVisible(true);
        }
      public static void admin()
      {
        new Admin();
      }
    
    }
    class AdminActions
{
    private JPanel p;
    private JLabel l;
    public AdminActions()
    {
        JFrame f=new JFrame("Admin");
        f.setLayout(new FlowLayout(FlowLayout.LEFT));

        l= new JLabel("Existing Topics");
        l.setFont(new Font("",Font.BOLD,20));
     
      

        List<String> topics = Topics.topics();

        p=new JPanel();
        p = new JPanel(new GridLayout(0, 1)); 
        p.add(l);

        for (int i=0;i<topics.size();i++)
        {
            
            JLabel temp=new JLabel((i+1)+":"+topics.get(i));
            p.add(temp);
        }
        
        f.add(p);
        f.setSize(400,400);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
    public static void adminActions()
    {
        new AdminActions();
    }

}
class Student  {
    private JLabel l,l1;
    private JButton b;
    private JPanel p;
    Student()
    {
        JFrame f = new JFrame("Topics");
        f.setSize(700, 400);
        f.setLayout(new FlowLayout());

        l = new JLabel("Welcome to Quiz");
        l.setFont(new Font("Oswald", Font.PLAIN, 24));
    
        l1= new JLabel("Select your topic");
        l1.setFont(new Font ("Calibri",Font.PLAIN,15));

        b = new JButton("Submit");

        p = new JPanel();
        p.setLayout(new GridLayout(0,1));
        
        List<String> myList = Topics.topics();
        Choice c1 = new Choice();
        c1.setFont(new Font("Calibri",Font.PLAIN,20));
        for (String temp : myList) {
            c1.add(temp);
        }

        p.add(l,BorderLayout.NORTH);
        
        p.add(c1);
        p.add(b);

        f.add(p);
        f.add(p);
        
    
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                List<List<String>> questions = Question.getQuestions(c1.getSelectedItem());
                StartQuiz.startQuiz(questions);
            }
        });

      
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
    public static void student()
    {
          new Student();
    }
}

class StartQuiz {
    static int currentIndex = 0;
    static int score = 0;
    static List<String> selectedAnswers;
    static List<String[]> wrongAnswers;
    
    public static void startQuiz(List<List<String>> questions) {
        selectedAnswers = new ArrayList<>(questions.size());
        wrongAnswers = new ArrayList<>();

        for (int i = 0; i < questions.size(); i++) {
            selectedAnswers.add("");
        }

        JFrame f = new JFrame("Quiz");
        f.setSize(700, 400);
        //f.setLayout(new BorderLayout());

        JPanel questionPanel = new JPanel(new BorderLayout());
        JPanel optionsPanel = new JPanel(new GridLayout(0, 1));

        JLabel questionLabel = new JLabel(questions.get(currentIndex).get(0));
        questionLabel.setFont(new Font("null",Font.BOLD,14));
        questionLabel.setForeground(Color.RED);
        questionPanel.add(questionLabel, BorderLayout.NORTH);

        ButtonGroup options = new ButtonGroup();
        for (int i = 1; i < questions.get(currentIndex).size() - 1; i++) {
            JRadioButton optionButton = new JRadioButton(questions.get(currentIndex).get(i));
            optionButton.addActionListener(e -> {
                selectedAnswers.set(currentIndex, optionButton.getText().substring(0, 1));
            });
            options.add(optionButton);
            optionsPanel.add(optionButton);
        }

        JPanel buttonPanel = new JPanel(new FlowLayout());
        JButton prevButton = new JButton("Previous");
        JButton nextButton = new JButton("Next");
        JButton submitButton = new JButton("Submit");

        prevButton.addActionListener(e -> {
            if (currentIndex > 0) {
                currentIndex--;
                updateQuestion(questionLabel, optionsPanel, options, questions);
            }
        });

        nextButton.addActionListener(e -> {
            if (currentIndex < questions.size() - 1) {
                currentIndex++;
                updateQuestion(questionLabel, optionsPanel, options, questions);
            }
        });

        submitButton.addActionListener(e -> {
            calculateScore(questions);
            Score.showScoreFrame(questions,score, wrongAnswers);
        });

        buttonPanel.add(prevButton);
        buttonPanel.add(nextButton);
        buttonPanel.add(submitButton);

        f.add(questionPanel, BorderLayout.NORTH);
        f.add(optionsPanel, BorderLayout.CENTER);
        f.add(buttonPanel, BorderLayout.SOUTH);

        f.setVisible(true);
    }

    private static void updateQuestion(JLabel questionLabel, JPanel optionsPanel, ButtonGroup options, List<List<String>> questions) {
        questionLabel.setText(questions.get(currentIndex).get(0));
        optionsPanel.removeAll();
        options.clearSelection();
        for (int i = 1; i < questions.get(currentIndex).size() - 1; i++) {
            JRadioButton optionButton = new JRadioButton(questions.get(currentIndex).get(i));
            optionButton.addActionListener(e -> {
                selectedAnswers.set(currentIndex, optionButton.getText().substring(0, 1));
            });
            options.add(optionButton);
            optionsPanel.add(optionButton);
        }
        optionsPanel.revalidate();
        optionsPanel.repaint();
    }

    private static void calculateScore(List<List<String>> questions) {
        score = 0;
        wrongAnswers.clear();
        for (int i = 0; i < questions.size(); i++) {
            if (selectedAnswers.get(i).equals(questions.get(i).get(questions.get(i).size() - 1))) {
                score++;
            } else {
                wrongAnswers.add(new String[]{questions.get(i).get(0), questions.get(i).get(questions.get(i).size() - 1)});
            }
        }
    }

   
}
class Score{
public static void showScoreFrame(List<List<String>> questions,int score,List<String[]> wrongAnswers) {
    JFrame scoreFrame = new JFrame("Quiz Score");
    scoreFrame.setSize(700, 400);
    scoreFrame.setLayout(new FlowLayout());

    JPanel scorePanel = new JPanel(new GridLayout(0, 1,0,20));
    scorePanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

    JLabel scoreLabel = new JLabel("Your score is: " + score + "/" + questions.size());
    scoreLabel.setFont(new Font("Arial",Font.BOLD,20));

   
    double percentage=((double)score/questions.size())*100;
    JProgressBar progressBar=new JProgressBar(0,100);
    progressBar.setValue((int)percentage);
    progressBar.setStringPainted(true);
    progressBar.setBackground(Color.LIGHT_GRAY);
    
    if(score>=4)
    {
        scoreLabel.setForeground(Color.GREEN);
        progressBar.setForeground(Color.GREEN);
    }
    else if(score==3)
    {
        scoreLabel.setForeground(Color.ORANGE);
        progressBar.setForeground(Color.ORANGE);
    }
    else if(score<3)
    {
        scoreLabel.setForeground(Color.RED);
        progressBar.setForeground(Color.RED);
    }
    scorePanel.add(progressBar);
    scorePanel.add(scoreLabel);


    if (!wrongAnswers.isEmpty()) {
        JLabel wrongAnswersLabel = new JLabel("Wrong Answers:");
        wrongAnswersLabel.setFont(new Font("Arial", Font.BOLD, 16));
        scorePanel.add(wrongAnswersLabel);
        for (String[] wrongAnswer : wrongAnswers) {
            JLabel wrongAnswerLabel = new JLabel(wrongAnswer[0] + " ( Correct option: " + wrongAnswer[1] + " )");
            
            scorePanel.add(wrongAnswerLabel);
        }
    }

    scoreFrame.add(scorePanel);
    scoreFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    scoreFrame.setVisible(true);
}
}
 public class QuizApplication  {
    private JLabel l;
    private CheckboxGroup cbg;
    private JPanel p;
    
 
   QuizApplication()
    {
        JFrame f=new JFrame("User");
        f.setLayout(new FlowLayout());

        l=new JLabel("Select User Type");
        l.setFont(new Font("Oswald",Font.PLAIN,30));

        cbg=new CheckboxGroup();
        Checkbox u1=new Checkbox("ADMIN",cbg,false);
        Checkbox u2=new Checkbox("STUDENT",cbg,false);
        u1.setFont(new Font("Oswald",Font.PLAIN,20));
        u2.setFont(new Font("Oswald",Font.PLAIN,20));

        p = new JPanel(new GridLayout(0, 1));
        p.setSize(700,400);
        p.add(l);
        p.add(u1);
        p.add(u2);
        
        f.setSize(500,400);
        f.add(p);
        f.setVisible(true);
 
    
       u1.addItemListener(new ItemListener() 
        {
          public void itemStateChanged(ItemEvent e) 
          {
            if (e.getStateChange() == ItemEvent.SELECTED) 
                  Admin.admin();
                  //System.out.println("Admin");
          }
        });
        u2.addItemListener(new ItemListener()
        {
          public void itemStateChanged(ItemEvent e) 
          {
            if (e.getStateChange() == ItemEvent.SELECTED) 
                 Student.student();
          }
        });
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      }
      public static void main(String args[])
      {
        new QuizApplication();
      }
    }
      
    
    

