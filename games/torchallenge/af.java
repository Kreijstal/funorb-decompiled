/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class af {
    static ka[] field_a;
    static ka[] field_b;
    static java.security.SecureRandom field_d;
    static String[] field_c;
    static int[][][] field_e;
    static int[] field_f;

    final static void b(int param0, int param1) {
        pa var2 = dk.field_s;
        var2.d(25, param1);
        if (param0 == 9245) {
          var2.d(1, (byte) 122);
          var2.d(2, (byte) 122);
          return;
        }
        af.b(-81, -34);
        var2.d(1, (byte) 122);
        var2.d(2, (byte) 122);
    }

    public static void a(int param0) {
        field_b = null;
        field_c = null;
        field_f = null;
        field_a = null;
        field_e = (int[][][]) null;
        field_d = null;
        if (param0 != -7604) {
          af.a(1, -16);
        }
    }

    final static boolean a(int param0, int param1) {
        if (param1 == 3) {
          return true;
        }
        if (4 == param1) {
          return true;
        }
        if (param1 == 5) {
          return true;
        }
        if (param0 != -4275) {
          return false;
        }
        if (param1 == 8) {
          return true;
        }
        return false;
    }

    static {
        field_c = new String[]{"Move back to the previous menu level.", "Return to the top level of the menu.", "Auto-respond to the last thing in your chat window.", "Open the Quick Chat menu.", "Repeat the last thing you said.", "Close the Quick Chat menu."};
        field_e = new int[][][]{new int[][]{new int[]{-1}, new int[]{130, 61}, new int[]{116, 51}}, new int[][]{new int[]{-1}, new int[]{130, 64}}, new int[][]{new int[]{-1}, new int[]{105, 79}, new int[]{106, 50}, new int[]{-1, -1}}, new int[][]{new int[]{-1}, new int[]{-1}, new int[]{-1}, new int[]{-1}, new int[]{-1}, new int[]{-1}}, new int[][]{new int[]{-1}, new int[]{53, 79}, new int[]{44, 49}}, new int[][]{new int[]{-1}}, new int[][]{new int[]{-1}, new int[]{-1}, new int[]{-1}, new int[]{-1}, new int[]{-1}, new int[]{-1}}};
        field_f = new int[]{6, 6, 180, 39};
    }
}
