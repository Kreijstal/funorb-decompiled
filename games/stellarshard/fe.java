/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class fe {
    static boolean field_e;
    static boolean field_b;
    static d field_c;
    static char[] field_g;
    static pb[][] field_d;
    static pb field_a;
    static String field_f;

    abstract void a(int param0, java.awt.Component param1);

    abstract void a(byte param0, java.awt.Component param1);

    final static int a(int param0, int param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        var4 = stellarshard.field_B;
        if (param0 <= -100) {
          if (param2 <= param1) {
            L0: while (true) {
              if (0 == param2) {
                return param1;
              } else {
                var3 = param1 % param2;
                param1 = param2;
                param2 = var3;
                continue L0;
              }
            }
          } else {
            var3 = param1;
            param1 = param2;
            param2 = var3;
            L1: while (true) {
              if (0 == param2) {
                return param1;
              } else {
                var3 = param1 % param2;
                param1 = param2;
                param2 = var3;
                continue L1;
              }
            }
          }
        } else {
          field_f = null;
          if (param2 <= param1) {
            L2: while (true) {
              if (0 == param2) {
                return param1;
              } else {
                var3 = param1 % param2;
                param1 = param2;
                param2 = var3;
                continue L2;
              }
            }
          } else {
            var3 = param1;
            param1 = param2;
            param2 = var3;
            L3: while (true) {
              if (0 == param2) {
                return param1;
              } else {
                var3 = param1 % param2;
                param1 = param2;
                param2 = var3;
                continue L3;
              }
            }
          }
        }
    }

    public static void a(int param0) {
        field_f = null;
        field_g = null;
        if (param0 != 31147) {
          field_g = null;
          field_c = null;
          field_a = null;
          field_d = null;
          return;
        } else {
          field_c = null;
          field_a = null;
          field_d = null;
          return;
        }
    }

    final static void a(ka param0, int param1) {
        int var2 = 0;
        if (param1 != 12726) {
          return;
        } else {
          ci.field_b = param0.c((byte) 86) << -2100393883;
          var2 = param0.f(4);
          rc.field_h = (var2 & 7) << -501015630;
          ci.field_b = ci.field_b + (var2 >> -363528413);
          rc.field_h = rc.field_h + (param0.c((byte) 60) << -775967230);
          var2 = param0.f(4);
          rc.field_h = rc.field_h + (var2 >> -1786230554);
          b.field_t = var2 << 1788458575 & 2064384;
          b.field_t = b.field_t + (param0.f(param1 + -12722) << 1568877031);
          var2 = param0.f(4);
          rb.field_w = 65536 & var2 << -646771856;
          b.field_t = b.field_t + (var2 >> 1008506945);
          rb.field_w = rb.field_w + param0.c((byte) 25);
          return;
        }
    }

    abstract int b(int param0);

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = false;
        field_g = new char[]{(char)91, (char)93, (char)35};
        field_f = "Music          ";
        field_d = new pb[8][128];
    }
}
