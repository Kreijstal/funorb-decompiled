/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bg {
    static int field_d;
    static String field_a;
    static mm field_g;
    static int field_b;
    static String field_e;
    static String field_c;
    static String field_f;

    final static c a(boolean param0) {
        L0: {
          if (hd.field_r == null) {
            hd.field_r = new c();
            hd.field_r.a(13421772, hh.field_e);
            hd.field_r.field_n = 14;
            hd.field_r.field_p = bj.field_f;
            hd.field_r.field_q = 0;
            hd.field_r.field_d = 5;
            hd.field_r.field_o = 7697781;
            hd.field_r.field_f = 2763306;
            hd.field_r.field_c = 6;
            hd.field_r.field_h = 4;
            break L0;
          } else {
            break L0;
          }
        }
        if (!param0) {
          field_c = null;
          return hd.field_r;
        } else {
          return hd.field_r;
        }
    }

    public static void a(byte param0) {
        field_c = null;
        field_f = null;
        field_g = null;
        field_a = null;
        field_e = null;
        int var1 = -115 / ((param0 - -42) / 57);
    }

    final static void a(int param0) {
        int var1 = 0;
        double var2 = 0.0;
        int var4 = 0;
        int var5 = 0;
        var4 = client.field_A ? 1 : 0;
        qg.b();
        ch.field_b = new int[260];
        if (param0 <= -113) {
          me.field_y = 11;
          var1 = 0;
          L0: while (true) {
            if (256 <= var1) {
              var5 = 256;
              var1 = var5;
              L1: while (true) {
                if (ch.field_b.length > var5) {
                  ch.field_b[var5] = 255;
                  var5++;
                  continue L1;
                } else {
                  return;
                }
              }
            } else {
              var2 = 15.0;
              ch.field_b[var1] = (int)(255.0 * Math.pow((double)((float)var1 / 256.0f), var2));
              var1++;
              continue L0;
            }
          }
        } else {
          bg.a(-59);
          me.field_y = 11;
          var1 = 0;
          L2: while (true) {
            if (256 <= var1) {
              var5 = 256;
              var1 = var5;
              L3: while (true) {
                if (ch.field_b.length > var5) {
                  ch.field_b[var5] = 255;
                  var5++;
                  continue L3;
                } else {
                  return;
                }
              }
            } else {
              var2 = 15.0;
              ch.field_b[var1] = (int)(255.0 * Math.pow((double)((float)var1 / 256.0f), var2));
              var1++;
              continue L2;
            }
          }
        }
    }

    final static void a(byte[] param0, int[] param1, String[] param2, byte[] param3, int param4, String[][] param5, ji param6, int param7, int param8, ji param9, ck[][] param10, ck[][] param11, boolean param12, ji param13, String[][] param14) {
        s.a(param8 ^ 25206, param4, param11, param3, param10, param7, param12, param14, param1, param0, param6, (int[]) null, param9, (pi[]) null, param2, param5, param13);
        if (param8 == 25150) {
          return;
        } else {
          bg.a((byte) 118);
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "<%0> has entered another game.";
        field_f = "This password contains your email address, and would be easy to guess";
        field_c = "Loading extra data";
        field_e = "You do not have a suitable number of players for the current options.";
    }
}
