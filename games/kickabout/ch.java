/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ch extends gn {
    private int field_e;
    private int field_m;
    private int field_i;
    private int field_p;
    int field_t;
    static ut field_o;
    int field_k;
    private int field_r;
    private int field_q;
    int field_s;
    int field_l;
    private int field_j;
    private boolean field_n;
    private int field_h;
    int field_f;
    private int field_g;

    final static void a(ut param0, ot param1, ot param2, int param3) {
        int var4 = 0;
        int var5 = Kickabout.field_G;
        ra.field_L = param1;
        pn.field_w = param2;
        qe.field_i = new ot[73];
        for (var4 = 0; var4 < qe.field_i.length; var4++) {
            qe.field_i[var4] = param2;
        }
        qs.field_R = new ut(32, 32);
        iw.a(-49, qs.field_R);
        var4 = 88 / ((param3 - -76) / 44);
        param0.b(0, 0, 32, 32);
        ta.e(123);
    }

    final void a(iw param0, byte param1) {
        ((ch) this).field_s = param0.h((byte) -109);
        ((ch) this).field_k = param0.h((byte) -113);
        ((ch) this).field_g = param0.h((byte) -122);
        ((ch) this).field_f = param0.h((byte) -114);
        ((ch) this).field_q = param0.a((byte) 81);
        ((ch) this).field_r = param0.a((byte) 81);
        int var3 = -82 / ((-7 - param1) / 53);
        ((ch) this).field_t = param0.h((byte) -127);
        ((ch) this).field_i = param0.h((byte) -110);
        ((ch) this).field_n = -2 == (param0.h((byte) -123) ^ -1) ? true : false;
        ((ch) this).field_h = param0.h((byte) -105);
        ((ch) this).field_j = param0.h((byte) -120);
        ((ch) this).field_m = param0.a((byte) 81);
        ((ch) this).field_p = param0.a((byte) 81);
        ((ch) this).field_e = param0.h((byte) -118);
        ((ch) this).field_l = param0.a((byte) 81);
    }

    public final String toString() {
        StringBuilder var1 = null;
        int var2 = 0;
        StringBuilder var3 = null;
        L0: {
          var2 = Kickabout.field_G;
          var3 = new StringBuilder();
          var1 = var3;
          StringBuilder discarded$9 = var3.append(" p=(" + ((ch) this).field_q + "," + ((ch) this).field_r + ")/" + ((ch) this).field_k + "/" + ((ch) this).field_g + "/" + ((ch) this).field_f);
          StringBuilder discarded$10 = var3.append(" b=(" + ((ch) this).field_h + "," + ((ch) this).field_j + ")");
          if (-1 == (((ch) this).field_t ^ -1)) {
            StringBuilder discarded$11 = var3.append(" !!null!!");
            break L0;
          } else {
            if (2 == ((ch) this).field_t) {
              StringBuilder discarded$12 = var3.append(" cross");
              break L0;
            } else {
              if (((ch) this).field_t != -4) {
                if (-2 != ((ch) this).field_t) {
                  StringBuilder discarded$13 = var3.append(" invalid_goaltype/" + ((ch) this).field_t);
                  break L0;
                } else {
                  StringBuilder discarded$14 = var3.append(" kick/" + ((ch) this).field_i + "/" + ((ch) this).field_n);
                  break L0;
                }
              } else {
                StringBuilder discarded$15 = var3.append(" header");
                break L0;
              }
            }
          }
        }
        StringBuilder discarded$16 = var3.append(" g=(" + ((ch) this).field_m + "," + ((ch) this).field_p + ")/" + ((ch) this).field_e);
        StringBuilder discarded$17 = var3.append(" time=" + ((ch) this).field_l);
        return "LoggedGoal{" + var3 + "}";
    }

    public static void a(byte param0) {
        field_o = null;
        int var1 = -25 / ((28 - param0) / 44);
    }

    final void a(nu param0, int param1, int param2, int param3, nl param4, int param5, nl param6, int param7, int param8) {
        this.a(param7, param2, param3, 1, param5, param0, param1 + 87, param8);
        if (param1 != 32) {
            ((ch) this).field_j = -65;
        }
    }

    final void a(int param0, ch param1) {
        ((ch) this).field_n = param1.field_n;
        ((ch) this).field_i = param1.field_i;
        ((ch) this).field_e = param1.field_e;
        ((ch) this).field_l = param1.field_l;
        ((ch) this).field_m = param1.field_m;
        ((ch) this).field_p = param1.field_p;
        ((ch) this).field_t = param1.field_t;
        ((ch) this).field_r = param1.field_r;
        ((ch) this).field_k = param1.field_k;
        ((ch) this).field_q = param1.field_q;
        ((ch) this).field_h = param1.field_h;
        ((ch) this).field_g = param1.field_g;
        ((ch) this).field_s = param1.field_s;
        ((ch) this).field_j = param1.field_j;
        if (param0 != -4) {
            Object var4 = null;
            boolean discarded$0 = ch.a(-13, (sj) null);
        }
    }

    private final void a(int param0, int param1, int param2, int param3, int param4, nu param5, int param6, int param7) {
        nl var10 = null;
        int var11 = 0;
        nl var12 = null;
        var11 = Kickabout.field_G;
        var12 = param5.field_P[param2][param7];
        if (param6 >= 109) {
          L0: {
            var10 = param5.field_P[1 - param2][0];
            ((ch) this).field_s = param0;
            ((ch) this).field_k = param2;
            ((ch) this).field_g = param7;
            ((ch) this).field_q = var12.f(-124);
            ((ch) this).field_r = var12.a(true);
            if (param3 == 2) {
              ((ch) this).field_j = var12.field_m;
              ((ch) this).field_t = 2;
              ((ch) this).field_n = false;
              ((ch) this).field_i = 0;
              ((ch) this).field_h = var12.field_k;
              break L0;
            } else {
              if (3 != param3) {
                ((ch) this).field_i = param4;
                ((ch) this).field_h = var12.field_x;
                ((ch) this).field_t = 1;
                ((ch) this).field_n = var12.field_O;
                ((ch) this).field_j = var12.field_P;
                break L0;
              } else {
                ((ch) this).field_t = 3;
                ((ch) this).field_i = 0;
                ((ch) this).field_h = var12.field_k;
                ((ch) this).field_n = false;
                ((ch) this).field_j = var12.field_m;
                break L0;
              }
            }
          }
          ((ch) this).field_m = var10.f(-93);
          ((ch) this).field_p = var10.a(true);
          ((ch) this).field_l = param1;
          ((ch) this).field_e = var10.field_o;
          L1: while (true) {
            L2: {
              if (127 < Math.abs(((ch) this).field_h)) {
                break L2;
              } else {
                if (-128 <= (Math.abs(((ch) this).field_j) ^ -1)) {
                  return;
                } else {
                  break L2;
                }
              }
            }
            ((ch) this).field_h = ((ch) this).field_h / 2;
            ((ch) this).field_j = ((ch) this).field_j / 2;
            continue L1;
          }
        } else {
          return;
        }
    }

    final void a(byte param0, int param1, nl param2, int param3, int param4, int param5, int param6, nu param7, nl param8) {
        if (param0 != 35) {
            return;
        }
        this.a(param1, param4, param6, param5, 0, param7, param0 ^ 91, param3);
    }

    final static boolean a(int param0, sj param1) {
        if (param0 != -2) {
            field_o = null;
        }
        return param1.a(false);
    }

    public ch() {
        ((ch) this).field_t = 0;
    }

    static {
    }
}
