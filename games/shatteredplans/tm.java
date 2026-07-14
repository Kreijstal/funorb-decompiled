/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tm extends oh {
    private int field_m;
    private int field_q;
    private int field_s;
    private String field_l;
    private boolean field_n;
    static bi field_r;
    static ds field_p;
    static qh field_k;
    static java.awt.Canvas field_i;
    static int field_h;
    static String field_j;
    static String field_o;
    static qr field_t;

    public static void d(int param0) {
        field_j = null;
        if (param0 != -30032) {
            Object var2 = null;
            short[] discarded$0 = tm.a((byte) -113, (sl) null, 17, (short[]) null);
        }
        field_k = null;
        field_t = null;
        field_r = null;
        field_p = null;
        field_i = null;
        field_o = null;
    }

    final void a(int param0) {
        int var2 = 0;
        if (((tm) this).field_n) {
            ((tm) this).field_q = 256;
            return;
        }
        if (param0 != 256) {
            ((tm) this).field_l = null;
        }
        if (((tm) this).field_m <= -601) {
            ((tm) this).field_q = 0;
            return;
        }
        ((tm) this).field_m = ((tm) this).field_m + 1;
        if (-501 >= ((tm) this).field_m) {
        } else {
            var2 = 100 + (-((tm) this).field_m + 500);
            if ((var2 ^ -1) > -1) {
                ((tm) this).field_q = 0;
            } else {
                ((tm) this).field_q = (var2 << -208410008) / 100;
            }
        }
    }

    final void a(int param0, int param1) {
        if (-1 == (((tm) this).field_q ^ -1)) {
            return;
        }
        gf.a(88, 1 + param1, ((tm) this).field_s, 17, 6, 0, ((tm) this).field_q);
        if (param0 != -208410008) {
            field_r = null;
        }
        if (-257 != (((tm) this).field_q ^ -1)) {
            ss.field_b.d(((tm) this).field_l, 100, param1 + 14, 16777215, -1, ((tm) this).field_q);
        } else {
            ss.field_b.d(((tm) this).field_l, 100, 14 + param1, 16777215, -1);
        }
    }

    tm(String param0, boolean param1) {
        ((tm) this).field_n = param1 ? true : false;
        ((tm) this).field_q = 256;
        ((tm) this).field_l = param0;
        ((tm) this).field_m = !((tm) this).field_n ? 0 : 500;
        int var3 = 20 + ss.field_b.c(((tm) this).field_l);
        ((tm) this).field_s = Math.max(400, var3);
    }

    final static short[] a(byte param0, sl param1, int param2, short[] param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        Object var9 = null;
        L0: {
          var8 = ShatteredPlansClient.field_F ? 1 : 0;
          if (param0 == 39) {
            break L0;
          } else {
            var9 = null;
            short[] discarded$2 = tm.a((byte) -7, (sl) null, 123, (short[]) null);
            break L0;
          }
        }
        var4 = param1.b((byte) 101, param2);
        if (-1 != (var4 ^ -1)) {
          L1: {
            L2: {
              if (param3 == null) {
                break L2;
              } else {
                if (param3.length == var4) {
                  break L1;
                } else {
                  break L2;
                }
              }
            }
            param3 = new short[var4];
            break L1;
          }
          L3: {
            var5 = param1.b((byte) 99, 4);
            var6 = (short)param1.b((byte) 86, 16);
            if (var5 > 0) {
              var7 = 0;
              L4: while (true) {
                if (var7 >= var4) {
                  break L3;
                } else {
                  param3[var7] = (short)(param1.b((byte) 93, var5) + var6);
                  var7++;
                  continue L4;
                }
              }
            } else {
              var7 = 0;
              L5: while (true) {
                if (var7 >= var4) {
                  break L3;
                } else {
                  param3[var7] = (short)var6;
                  var7++;
                  continue L5;
                }
              }
            }
          }
          return param3;
        } else {
          return null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = "Invalid name";
        field_h = 0;
        field_o = "Return to lobby";
        field_p = new ds(0);
    }
}
