/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class uf extends wl {
    private int field_v;
    private ee field_u;
    private int field_x;
    static int field_A;
    static vj field_z;
    static ck field_w;
    static String field_t;
    static ck[] field_y;
    static String[] field_B;

    uf(byte[] param0) {
        super(param0);
    }

    final int i(byte param0) {
        int var2 = -7 / ((param0 - -78) / 33);
        ((uf) this).field_n = ((uf) this).field_n + 1;
        return ((uf) this).field_r[((uf) this).field_n] - ((uf) this).field_u.a(false) & 255;
    }

    final void l(int param0) {
        ((uf) this).field_r[((uf) this).field_n] = (byte) 0;
        ((uf) this).field_v = 8;
        if (param0 <= 44) {
            String discarded$0 = uf.a((byte) 40, -33L);
        }
    }

    final void j(int param0) {
        if (-9 < (((uf) this).field_v ^ -1)) {
            ((uf) this).field_n = ((uf) this).field_n + 1;
            ((uf) this).field_v = 8;
        }
        if (param0 != 20) {
            int discarded$0 = ((uf) this).i((byte) -104);
        }
    }

    uf(int param0) {
        super(param0);
    }

    final void a(int param0, int param1, int param2) {
        int var5 = client.field_A ? 1 : 0;
        param2 = param2 & ee.field_b[param0];
        if (param1 != 0) {
            field_w = null;
        }
        while (param0 > ((uf) this).field_v) {
            param0 = param0 - ((uf) this).field_v;
            ((uf) this).field_n = ((uf) this).field_n + 1;
            ((uf) this).field_r[((uf) this).field_n] = (byte)(((uf) this).field_r[((uf) this).field_n] + (param2 >>> param0));
            ((uf) this).field_r[((uf) this).field_n] = (byte) 0;
            ((uf) this).field_v = 8;
        }
        if (((uf) this).field_v != param0) {
            ((uf) this).field_v = ((uf) this).field_v - param0;
            ((uf) this).field_r[((uf) this).field_n] = (byte)(((uf) this).field_r[((uf) this).field_n] + (param2 << ((uf) this).field_v));
        } else {
            ((uf) this).field_n = ((uf) this).field_n + 1;
            ((uf) this).field_r[((uf) this).field_n] = (byte)(((uf) this).field_r[((uf) this).field_n] + param2);
            ((uf) this).field_r[((uf) this).field_n] = (byte) 0;
            ((uf) this).field_v = 8;
        }
    }

    final static void g(int param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        L0: {
          var7 = client.field_A ? 1 : 0;
          if (param1 == -2093) {
            break L0;
          } else {
            field_w = null;
            break L0;
          }
        }
        fl.a(130, 256, 16694016, mb.field_e, param0 + 80, (mm) (Object) w.field_kb);
        var2 = 140;
        var3 = 0;
        var4 = 0;
        L1: while (true) {
          if (var4 >= 6) {
            return;
          } else {
            L2: {
              var5 = 245 * (var4 % 2) + (80 + param0);
              fl.a(var2 - -14, 256, 16777215, nk.field_d[var4][0], var5, (mm) (Object) w.field_kb);
              tg.a(true, var4).c(var5 - -param0, 20 + var2, 18, 18);
              var6 = ga.a(211, 0, var2 + 20, nk.field_d[var4][1], 16, 64, 16777215, (mm) (Object) se.field_S, (byte) -128, 0, var5 + 24);
              if (var3 < var6) {
                var3 = var6;
                break L2;
              } else {
                break L2;
              }
            }
            if (-2 == (var4 % 2 ^ -1)) {
              var2 = var2 + (16 * var3 + 20 - -8);
              var3 = 0;
              if ((var4 ^ -1) > -5) {
                hk.a(param0 + 80, -5 + var2, 480, 394758);
                hk.a(param0 + 80, -4 + var2, 480, 6316128);
                var4++;
                continue L1;
              } else {
                var4++;
                continue L1;
              }
            } else {
              var4++;
              continue L1;
            }
          }
        }
    }

    final void j(byte param0) {
        ((uf) this).field_x = 8 * ((uf) this).field_n;
        if (param0 != -108) {
            ((uf) this).j(119);
        }
    }

    final static void k(int param0) {
        int var2 = client.field_A ? 1 : 0;
        if (lg.field_W > 0) {
            lg.field_W = lg.field_W - 1;
        } else {
            if (bf.field_r < -1) {
                bf.field_r = bf.field_r - 1;
            } else {
                if (-1 < tg.field_e) {
                    tg.field_e = tg.field_e - 1;
                }
            }
        }
        if (!((lg.field_W ^ -1) >= -1)) {
            pa.g((byte) -89);
        }
        if (bf.field_r > 0) {
            qf.a(bf.field_r, 114);
        }
        if (!((tg.field_e ^ -1) >= -1)) {
            qf.a(tg.field_e, 112);
        }
        if (param0 != -4840) {
            uf.h((byte) 73);
        }
    }

    final void a(int param0, byte[] param1, int param2, int param3) {
        int var5 = 0;
        int var7 = client.field_A ? 1 : 0;
        int var6 = 55 / ((5 - param0) / 45);
        for (var5 = 0; var5 < param2; var5++) {
            ((uf) this).field_n = ((uf) this).field_n + 1;
            param1[param3 + var5] = (byte)(((uf) this).field_r[((uf) this).field_n] + -((uf) this).field_u.a(false));
        }
    }

    final void k(byte param0) {
        ((uf) this).field_n = (7 + ((uf) this).field_x) / 8;
        if (param0 >= -97) {
            field_w = null;
        }
    }

    public static void h(byte param0) {
        field_z = null;
        field_y = null;
        if (param0 <= 111) {
            field_A = -90;
        }
        field_t = null;
        field_w = null;
        field_B = null;
    }

    final void f(int param0, int param1) {
        ((uf) this).field_n = ((uf) this).field_n + 1;
        ((uf) this).field_r[((uf) this).field_n] = (byte)(param0 + ((uf) this).field_u.a(false));
        if (param1 != -4) {
            field_y = null;
        }
    }

    final int a(int param0, byte param1) {
        int var6 = client.field_A ? 1 : 0;
        if (param1 <= 39) {
            return 9;
        }
        int var3 = ((uf) this).field_x >> 227270371;
        int var4 = -(7 & ((uf) this).field_x) + 8;
        int var5 = 0;
        ((uf) this).field_x = ((uf) this).field_x + param0;
        while (var4 < param0) {
            var3++;
            var5 = var5 + ((ee.field_b[var4] & ((uf) this).field_r[var3]) << param0 + -var4);
            param0 = param0 - var4;
            var4 = 8;
        }
        if (param0 != var4) {
            var5 = var5 + (((uf) this).field_r[var3] >> -param0 + var4 & ee.field_b[param0]);
        } else {
            var5 = var5 + (ee.field_b[var4] & ((uf) this).field_r[var3]);
        }
        return var5;
    }

    final static String a(byte param0, long param1) {
        ed.field_a.setTime(new Date(param1));
        int var3 = ed.field_a.get(7);
        int var4 = ed.field_a.get(5);
        int var5 = ed.field_a.get(2);
        int var6 = ed.field_a.get(1);
        int var7 = ed.field_a.get(11);
        if (param0 != 60) {
            String discarded$0 = uf.a((byte) -1, 45L);
        }
        int var8 = ed.field_a.get(12);
        int var9 = ed.field_a.get(13);
        return tm.field_f[-1 + var3] + ", " + var4 / 10 + var4 % 10 + "-" + db.field_e[var5] + "-" + var6 + " " + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + " GMT";
    }

    final void a(int[] param0, byte param1) {
        ((uf) this).field_u = new ee(param0);
        if (param1 <= 61) {
            int discarded$0 = ((uf) this).i((byte) -25);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_t = "Concluded";
        field_B = new String[]{"[BACKSPACE]", "[HOME]", "[F9]", "[F10]", "[F11]", "[ESC]"};
    }
}
