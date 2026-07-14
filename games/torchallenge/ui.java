/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ui implements wd {
    static String field_e;
    static ka[] field_i;
    static boolean field_b;
    static rl field_c;
    private long field_a;
    static String[] field_h;
    static int[] field_f;
    static String field_g;
    static String field_d;

    public final void a(boolean param0) {
        if (!param0) {
            rj discarded$0 = ((ui) this).b(66);
        }
        ((ui) this).field_a = ol.a(256);
    }

    public static void c(byte param0) {
        if (param0 >= -120) {
            field_e = null;
        }
        field_i = null;
        field_c = null;
        field_g = null;
        field_f = null;
        field_d = null;
        field_e = null;
        field_h = null;
    }

    abstract rj b(byte param0);

    public final String a(byte param0) {
        if (param0 != -10) {
            String discarded$0 = ((ui) this).a((byte) 50);
        }
        if (((ui) this).a(6650)) {
            return null;
        }
        if (ol.a(256) < 350L + ((ui) this).field_a) {
            return null;
        }
        return ((ui) this).d(5);
    }

    final static short[] a(pa param0, int param1, short[] param2, int param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        L0: {
          var8 = TorChallenge.field_F ? 1 : 0;
          if (param1 <= -91) {
            break L0;
          } else {
            ui.c((byte) -111);
            break L0;
          }
        }
        var4 = param0.e(param3, -126);
        if (0 != var4) {
          L1: {
            L2: {
              if (param2 == null) {
                break L2;
              } else {
                if (param2.length == var4) {
                  break L1;
                } else {
                  break L2;
                }
              }
            }
            param2 = new short[var4];
            break L1;
          }
          L3: {
            var5 = param0.e(4, -13);
            var6 = (short)param0.e(16, 107);
            if (-1 <= (var5 ^ -1)) {
              var7 = 0;
              L4: while (true) {
                if (var7 >= var4) {
                  break L3;
                } else {
                  param2[var7] = (short)var6;
                  var7++;
                  continue L4;
                }
              }
            } else {
              var7 = 0;
              L5: while (true) {
                if (var4 <= var7) {
                  break L3;
                } else {
                  param2[var7] = (short)(var6 + param0.e(var5, -32));
                  var7++;
                  continue L5;
                }
              }
            }
          }
          return param2;
        } else {
          return null;
        }
    }

    abstract String d(int param0);

    final static void c(int param0) {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        var3 = TorChallenge.field_F ? 1 : 0;
        qf.field_e = new ge[8];
        qf.field_e[1] = ua.field_d[1];
        qf.field_e[0] = ua.field_d[0];
        qf.field_e[3] = ua.field_d[3];
        qf.field_e[2] = ua.field_d[2];
        qf.field_e[4] = ua.field_d[5];
        qf.field_e[7] = ua.field_d[4];
        qf.field_e[5] = dj.field_V[0];
        e.field_p = new int[8][];
        wc.field_d = new int[8];
        qf.field_e[6] = dj.field_V[1];
        var1 = 0;
        L0: while (true) {
          if (var1 >= 8) {
            ag.field_e.a((jc[]) (Object) qf.field_e, wc.field_d);
            if (param0 <= -89) {
              return;
            } else {
              return;
            }
          } else {
            L1: {
              wc.field_d[var1] = qf.field_e[var1].field_d;
              if (var1 == 0) {
                break L1;
              } else {
                if ((var1 ^ -1) == -6) {
                  break L1;
                } else {
                  var1++;
                  continue L0;
                }
              }
            }
            e.field_p[var1] = new int[qf.field_e[var1].field_l.length];
            var2 = 0;
            L2: while (true) {
              if (var2 < e.field_p[var1].length) {
                e.field_p[var1][var2] = qf.field_e[var1].field_l[var2];
                var2++;
                continue L2;
              } else {
                var1++;
                continue L0;
              }
            }
          }
        }
    }

    public final rj b(int param0) {
        if (!(!((ui) this).a(6650))) {
            return mh.field_b;
        }
        if (ol.a(256) < ((ui) this).field_a + 350L) {
            return bl.field_S;
        }
        int var2 = -47 / ((param0 - 33) / 61);
        return ((ui) this).b((byte) 109);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "Loading music";
        field_h = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        field_c = new rl(1);
        field_f = new int[4];
        field_g = "Instructions";
        field_d = "Skip";
    }
}
