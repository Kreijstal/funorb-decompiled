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
        int fieldTemp$0 = this.field_n;
        this.field_n = this.field_n + 1;
        return this.field_r[fieldTemp$0] - this.field_u.a(false) & 255;
    }

    final void l(int param0) {
        this.field_r[this.field_n] = (byte) 0;
        this.field_v = 8;
        if (param0 <= 44) {
            uf.a((byte) 40, -33L);
        }
    }

    final void j(int param0) {
        if (-9 < (this.field_v ^ -1)) {
            this.field_n = this.field_n + 1;
            this.field_v = 8;
        }
        if (param0 != 20) {
            this.i((byte) -104);
        }
    }

    uf(int param0) {
        super(param0);
    }

    final void a(int param0, int param1, int param2) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int var5 = client.field_A ? 1 : 0;
        param2 = param2 & ee.field_b[param0];
        if (param1 != 0) {
            field_w = (ck) null;
        }
        while (param0 > this.field_v) {
            param0 = param0 - this.field_v;
            fieldTemp$0 = this.field_n;
            this.field_n = this.field_n + 1;
            this.field_r[fieldTemp$0] = (byte)(this.field_r[fieldTemp$0] + (param2 >>> param0));
            this.field_r[this.field_n] = (byte) 0;
            this.field_v = 8;
        }
        if (this.field_v != param0) {
            this.field_v = this.field_v - param0;
            this.field_r[this.field_n] = (byte)(this.field_r[this.field_n] + (param2 << this.field_v));
        } else {
            fieldTemp$1 = this.field_n;
            this.field_n = this.field_n + 1;
            this.field_r[fieldTemp$1] = (byte)(this.field_r[fieldTemp$1] + param2);
            this.field_r[this.field_n] = (byte) 0;
            this.field_v = 8;
        }
    }

    final static void g(int param0, int param1) {
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var7 = client.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 == -2093) {
                break L1;
              } else {
                field_w = (ck) null;
                break L1;
              }
            }
            fl.a(130, 256, 16694016, mb.field_e, param0 + 80, w.field_kb);
            var2_int = 140;
            var3 = 0;
            var4 = 0;
            L2: while (true) {
              if (var4 >= 6) {
                break L0;
              } else {
                L3: {
                  var5 = 245 * (var4 % 2) + (80 + param0);
                  fl.a(var2_int - -14, 256, 16777215, nk.field_d[var4][0], var5, w.field_kb);
                  tg.a(true, var4).c(var5 - -param0, 20 + var2_int, 18, 18);
                  var6 = ga.a(211, 0, var2_int + 20, nk.field_d[var4][1], 16, 64, 16777215, se.field_S, (byte) -128, 0, var5 + 24);
                  if (var3 < var6) {
                    var3 = var6;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                L4: {
                  if (-2 == (var4 % 2 ^ -1)) {
                    var2_int = var2_int + (16 * var3 + 20 - -8);
                    var3 = 0;
                    if ((var4 ^ -1) > -5) {
                      hk.a(param0 + 80, -5 + var2_int, 480, 394758);
                      hk.a(param0 + 80, -4 + var2_int, 480, 6316128);
                      break L4;
                    } else {
                      break L4;
                    }
                  } else {
                    break L4;
                  }
                }
                var4++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw dh.a((Throwable) ((Object) var2), "uf.NA(" + param0 + ',' + param1 + ')');
        }
    }

    final void j(byte param0) {
        this.field_x = 8 * this.field_n;
        if (param0 != -108) {
            this.j(119);
        }
    }

    final static void k(int param0) {
        int var2 = client.field_A ? 1 : 0;
        if (lg.field_W > 0) {
            lg.field_W = lg.field_W - 1;
        } else {
            if ((bf.field_r ^ -1) < -1) {
                bf.field_r = bf.field_r - 1;
            } else {
                if (-1 > (tg.field_e ^ -1)) {
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
        int fieldTemp$2 = 0;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var7 = client.field_A ? 1 : 0;
        try {
          L0: {
            var6 = 55 / ((5 - param0) / 45);
            var5_int = 0;
            L1: while (true) {
              if (var5_int >= param2) {
                break L0;
              } else {
                fieldTemp$2 = this.field_n;
                this.field_n = this.field_n + 1;
                param1[param3 + var5_int] = (byte)(this.field_r[fieldTemp$2] + -this.field_u.a(false));
                var5_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var5);

            stackIn_7_1 = new StringBuilder().append("uf.TA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L2;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void k(byte param0) {
        this.field_n = (7 + this.field_x) / 8;
        if (param0 >= -97) {
            field_w = (ck) null;
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
        int fieldTemp$0 = this.field_n;
        this.field_n = this.field_n + 1;
        this.field_r[fieldTemp$0] = (byte)(param0 + this.field_u.a(false));
        if (param1 != -4) {
            field_y = (ck[]) null;
        }
    }

    final int a(int param0, byte param1) {
        int incrementValue$0 = 0;
        int var6 = client.field_A ? 1 : 0;
        if (param1 <= 39) {
            return 9;
        }
        int var3 = this.field_x >> 227270371;
        int var4 = -(7 & this.field_x) + 8;
        int var5 = 0;
        this.field_x = this.field_x + param0;
        while (var4 < param0) {
            incrementValue$0 = var3;
            var3++;
            var5 = var5 + ((ee.field_b[var4] & this.field_r[incrementValue$0]) << param0 + -var4);
            param0 = param0 - var4;
            var4 = 8;
        }
        if (param0 != var4) {
            var5 = var5 + (this.field_r[var3] >> -param0 + var4 & ee.field_b[param0]);
        } else {
            var5 = var5 + (ee.field_b[var4] & this.field_r[var3]);
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
            uf.a((byte) -1, 45L);
        }
        int var8 = ed.field_a.get(12);
        int var9 = ed.field_a.get(13);
        return tm.field_f[-1 + var3] + ", " + var4 / 10 + var4 % 10 + "-" + db.field_e[var5] + "-" + var6 + " " + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + " GMT";
    }

    final void a(int[] param0, byte param1) {
        try {
            this.field_u = new ee(param0);
            if (param1 <= 61) {
                this.i((byte) -25);
            }
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) ((Object) runtimeException), "uf.RA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        field_t = "Concluded";
        field_B = new String[]{"[BACKSPACE]", "[HOME]", "[F9]", "[F10]", "[F11]", "[ESC]"};
    }
}
