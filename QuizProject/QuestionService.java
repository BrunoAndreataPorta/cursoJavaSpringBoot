import java.util.Scanner;

public class QuestionService {

    Question[] questions = new Question[5];
    String userAnswer[] = new String[5];

    public QuestionService()
    {
        questions[0] = new Question(1, "Qual linguagem de programacao foi escrito esse quiz?", "Java", "Cpp", "Python", "Csharp", "Java");
        questions[1] = new Question(2, "Qual e o maior planeta do nosso sistema solar?", "Terra", "Venus", "Jupiter", "Marte", "Jupiter");
        questions[2] = new Question(3, "Qual e o animal terrestre mais rapido?", "Leao", "Guepardo", "Lobo", "Leopardo", "Guepardo");
        questions[3] = new Question(4, "Se voce esta correndo em uma corrida e ultrapassa o segundo colocado, qual é a sua posição agora?", "Primeiro", "Segundo", "Terceiro", "Quarto", "Segundo");
        questions[4] = new Question(5, "Qual e a capital do Brasil?", "Sao Paulo", "Rio de Janeiro", "Brasilia", "Salvador", "Brasilia");

    }

    public void playQuiz()
    {
        for(int i = 0; i < 5; i++){
            System.out.println("Pergunta no." + questions[i].getId());
            System.out.println(questions[i].getQuestion());
            System.out.println(questions[i].getOp1());
            System.out.println(questions[i].getOp2());
            System.out.println(questions[i].getOp3());
            System.out.println(questions[i].getOp4());
            Scanner sc = new Scanner(System.in);
            userAnswer[i] = sc.nextLine();
        }

        for(int i = 0; i < 5; i++)
        {
            System.out.println(userAnswer[i]);
        }

    }

    public void printScore()
    {
        int score = 0;

        for(int i = 0; i < 5; i++)
        {
            Question que = questions[i];
            String actualAnswer = que.getAnswer();

            String Answer = userAnswer[i];

            if(actualAnswer.equals(Answer))
            {
                score++;
            }
        }
        System.out.println("Voce acertou: " + score + " de 5 questoes");
    }
}
