/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class on {
    static int field_a;
    static String field_b;
    static int field_e;
    static int[] field_g;
    static String field_c;
    static String field_d;
    static String[] field_f;

    final static void a(mf param0, int param1) {
        in.a(param0.a(-4, "", "headers.packvorbis"));
        in var2 = in.a(param0, "jagex logo2.packvorbis", "");
        if (param1 != -58) {
            field_c = null;
        }
        hh discarded$0 = var2.b();
    }

    final static int a(dk[] param0, int param1) {
        int var2 = 0;
        dk[] var3 = null;
        int var4 = 0;
        dk var5 = null;
        int var6 = 0;
        int var7 = 0;
        L0: {
          var7 = EscapeVector.field_A;
          var2 = -2147483648;
          var3 = param0;
          if (param1 == -49) {
            break L0;
          } else {
            boolean discarded$2 = on.a('', true);
            break L0;
          }
        }
        var4 = 0;
        L1: while (true) {
          if (var4 >= var3.length) {
            if (-2147483648 != var2) {
              return var2;
            } else {
              return 0;
            }
          } else {
            var5 = var3[var4];
            var6 = var5.field_f - -var5.field_p;
            if (var6 > var2) {
              var2 = var6;
              var4++;
              continue L1;
            } else {
              var4++;
              continue L1;
            }
          }
        }
    }

    final static void b(int param0) {
        if (param0 > -65) {
            field_f = null;
        }
    }

    final static boolean a(char param0, boolean param1) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        if (!param1) {
          L0: {
            L1: {
              if (param0 < 48) {
                break L1;
              } else {
                if (param0 > 57) {
                  break L1;
                } else {
                  stackOut_4_0 = 1;
                  stackIn_6_0 = stackOut_4_0;
                  break L0;
                }
              }
            }
            stackOut_5_0 = 0;
            stackIn_6_0 = stackOut_5_0;
            break L0;
          }
          return stackIn_6_0 != 0;
        } else {
          return false;
        }
    }

    public static void a(int param0) {
        field_d = null;
        field_b = null;
        field_g = null;
        field_c = null;
        if (param0 <= 72) {
            Object var2 = null;
            on.a((mf) null, -94);
        }
        field_f = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Enter the caves, find the containers, land next to them to attach your tether,<br>and steer them out and up to the mothership.";
        field_g = new int[8192];
        field_d = "Cannot load power-up - please land beside it";
        field_b = null;
        field_f = new String[]{"infracstructure_asteroid", "infracstructure_ice", "infracstructure_moon", "infracstructure_alien", null};
    }
}
