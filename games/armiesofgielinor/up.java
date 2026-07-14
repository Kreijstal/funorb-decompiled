/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class up implements lv {
    static String[][] field_b;
    static kl field_e;
    static String[][][][] field_c;
    private int field_a;
    static String[][][] field_g;
    static String field_f;
    private ha field_d;

    public static void d(int param0) {
        field_f = null;
        field_g = null;
        field_b = null;
        field_e = null;
        if (param0 != -12428) {
            return;
        }
        field_c = null;
    }

    final static StringBuilder a(char param0, int param1, StringBuilder param2, boolean param3) {
        int var5 = 0;
        int var6 = ArmiesOfGielinor.field_M ? 1 : 0;
        int var4 = param2.length();
        param2.setLength(param1);
        if (!param3) {
            return null;
        }
        for (var5 = var4; var5 < param1; var5++) {
            param2.setCharAt(var5, param0);
        }
        return param2;
    }

    public final String a(int param0) {
        if (param0 > -122) {
            return null;
        }
        return "Defeat: Total Portal Loss";
    }

    final static String a(bv param0, int param1, byte param2) {
        if (param2 > -79) {
            return null;
        }
        if (param1 == 0) {
            return null;
        }
        param0.n(-2);
        String var3 = param0.h((byte) 121);
        param0.o(72);
        return var3;
    }

    public final boolean b(int param0) {
        if (param0 != 0) {
            return false;
        }
        return false;
    }

    public final boolean c(int param0) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0 <= -121) {
            break L0;
          } else {
            String discarded$2 = ((up) this).a(-22);
            break L0;
          }
        }
        L1: {
          L2: {
            if (((up) this).field_d.b(((up) this).field_a, (byte) -26)) {
              break L2;
            } else {
              if (((up) this).field_d.a(((up) this).field_a, true)) {
                break L2;
              } else {
                stackOut_4_0 = 1;
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            }
          }
          stackOut_5_0 = 0;
          stackIn_6_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_6_0 != 0;
    }

    up(int param0, ha param1) {
        ((up) this).field_a = param0;
        ((up) this).field_d = param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "Movement speed: ";
        field_g = new String[][][]{new String[1][], new String[1][], new String[1][], new String[1][], new String[1][], new String[1][], new String[1][], new String[1][], new String[1][], new String[2][], new String[1][], new String[1][], new String[1][], new String[1][], new String[1][], new String[1][], new String[1][]};
        field_b = new String[][]{new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[2], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1]};
        field_c = new String[][][][]{new String[1][][], new String[1][][], new String[1][][], new String[1][][], new String[1][][], new String[1][][], new String[1][][], new String[1][][], new String[1][][], new String[2][][], new String[1][][], new String[1][][], new String[1][][], new String[1][][], new String[1][][], new String[1][][], new String[1][][]};
    }
}
