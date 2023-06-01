import javax.swing.*;

 class GUI extends JFrame {
        public GUI(){
            super("VEGA");
            setBounds(100, 100, 200, 200); //Если не выставить
            //размер и положение
            //то окно будет мелкое и незаметное
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //это нужно для того чтобы при
            //закрытии окна закрывалась и программа,
            //иначе она останется висеть в процессах
        }

        public static void main(String[] args) { //эта функция может быть и в другом классе
            GUI app = new GUI(); //Создаем экземпляр нашего приложения
            app.setVisible(true);
        }
    }

