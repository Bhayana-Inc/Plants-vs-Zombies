package sample;

import java.io.Serializable;

public class Suntoken implements Serializable {

        private static int value=100;
        public Suntoken()
        {

        }

        public void setValue(int value)
        {
            this.value=value;
        }

        public static int getValue() {
         return value;
        }
}
