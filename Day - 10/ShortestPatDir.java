public class ShortestPatDir {
        public static float shortestPath(String path) {
                int y = 0, x = 0;
                for (int i = 0; i < path.length(); i++) {
                        if (path.charAt(i) == 'N' || path.charAt(i) == 'n') {
                                y++;
                        } else if (path.charAt(i) == 'S' || path.charAt(i) == 's') {
                                y--;
                        } else if (path.charAt(i) == 'E' || path.charAt(i) == 'e') {
                                x++;
                        } else {
                                x--;
                        }
                }

                float res = (float) (Math.sqrt(x * x + y * y));

                return res;
        }

        public static void main(String args[]) {
                String path = "WNEENESENNN";
                System.out.println(shortestPath(path));

        }
}
