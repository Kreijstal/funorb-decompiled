/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ba {
    static String field_e;
    static int[] field_a;
    static long field_f;
    static String field_d;
    static String[] field_c;
    static oh field_b;

    public final String toString() {
        throw new IllegalStateException();
    }

    final static int a(int param0, boolean param1, String param2, String param3, String param4, int param5, int param6) {
        kh var7 = new kh(param4);
        kh var8 = new kh(param3);
        if (param6 != 0) {
            Object var9 = null;
            boolean discarded$0 = ba.a((String) null, true);
        }
        return me.a(param2, param1, param5, var7, param0, param6 + 92, var8);
    }

    final static boolean a(String param0, boolean param1) {
        int var4 = TrackController.field_F ? 1 : 0;
        int var2 = param0.charAt(0);
        int var3 = 1;
        if (param1) {
            return true;
        }
        while (var3 < param0.length()) {
            if (!(var2 == param0.charAt(var3))) {
                return false;
            }
            var3++;
        }
        return true;
    }

    final boolean a(int param0) {
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        if (param0 == 0) {
          L0: {
            L1: {
              if (this == (Object) (Object) ca.field_b) {
                break L1;
              } else {
                if ((Object) (Object) qe.field_C == this) {
                  break L1;
                } else {
                  if ((Object) (Object) ka.field_b != this) {
                    stackOut_7_0 = 0;
                    stackIn_8_0 = stackOut_7_0;
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
            }
            stackOut_6_0 = 1;
            stackIn_8_0 = stackOut_6_0;
            break L0;
          }
          return stackIn_8_0 != 0;
        } else {
          return false;
        }
    }

    public static void a(byte param0) {
        field_c = null;
        field_a = null;
        field_b = null;
        field_d = null;
        field_e = null;
        if (param0 <= 104) {
            Object var2 = null;
            int discarded$0 = ba.a(-84, true, (String) null, (String) null, (String) null, 4, 89);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "Level value: ";
        field_c = new String[]{"£3.20", "€4.25", "US$ 5.00", "Can$ 4.95", "Aus$ 6.50", "Krn 29.95", "", "Rp 160", "Rng 17.95", "NZ$ 7.95", "SG$ 6.95", "Krn 44.95", "R$ 7,00"};
        field_d = "Invalid Login or Password<br><br>For accounts created after the 24th of November 2010, please use your email address to log in.<br><br>Otherwise please log in with your username.";
        field_f = 20000000L;
    }
}
