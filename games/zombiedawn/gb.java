/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class gb extends fb {
    private int field_D;
    private int field_E;
    private boolean field_F;

    gb(int param0, int param1, int param2) {
        super(param0, param1, param2);
        this.field_E = 0;
        this.field_D = pb.a(so.field_a, 5, 1);
        this.field_F = true;
        this.d((byte) 121);
    }

    final void a(byte param0, wk param1) {
        int var11 = 0;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        dj var15 = null;
        var14 = ZombieDawn.field_J;
        try {
          if (param0 > -76) {
            var15 = (dj) null;
            gb.a((String) null, -100, (dj) null, (String) null, (dj) null);
          }
          var3_int = 0;
          if (this.field_F) {
            var3_int = this.field_E % 30;
            if (var3_int > 15) {
              var3_int = 30 - var3_int;
            }
            if (var3_int > 8) {
              var3_int = 4;
            } else {
              if (var3_int <= 3) {
                var3_int = (1 >= var3_int) ? 1 : 2;
              } else {
                var3_int = 3;
              }
            }
          }
          var4 = param1.a(this.a(true), (byte) -81);
          var5 = -24 + param1.a(this.f(237239984) - var3_int, 0);
          if (var4 >= -48 &&
            var5 >= -48 &&
            var4 <= qj.field_d &&
            var5 <= me.field_Bb) {
            if (ng.field_e &&
              this.field_C) {
              bi.g(12 + var4, var5 + 12, 14, 16711680);
            }
            if (this.field_F) {
              var6 = -1 + var4 + 12;
              var7 = -1 + var5 + 12;
              var9 = 10;
              var10 = 2;
              for (var11 = 0; var11 < 6; var11++) {
                var8 = (this.field_E + var11 * 6) % 120;
                var12 = var11 * var9;
                var13 = var11 * var10;
                bi.d(gj.field_u[var8] + var6, gj.field_e[var8] + var7, 6, 0, var12);
                bi.a(gj.field_u[var8] + var6 << 4, gj.field_e[var8] + var7 << 4, 96, var13, gj.field_b[this.field_t]);
                var8 = (var8 + 60) % 120;
                bi.d(gj.field_u[var8] + var6, gj.field_e[var8] + var7, 6, 0, var12);
                bi.a(gj.field_u[var8] + var6 << 4, var7 + gj.field_e[var8] << 4, 96, var13, gj.field_b[this.field_t]);
              }
            }
            kb.field_i[this.field_t].b(var4, var5);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_32_0 = var3;
          stackIn_32_1 = new StringBuilder().append("gb.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_32_0), ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(')').toString());
        }
    }

    final static oi a(String param0, int param1, dj param2, String param3, dj param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        oi stackIn_2_0 = null;
        oi stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5_int = param4.a(param3, (byte) 8);
          var6 = param4.a(var5_int, param0, true);
          if (param1 == -1) {
            stackIn_4_0 = la.a(param2, var6, param4, (byte) -126, var5_int);
            return stackIn_4_0;
          }
          stackIn_2_0 = (oi) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_7_0 = var5;
          stackIn_7_1 = new StringBuilder().append("gb.C(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param3 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',');
          if (param4 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    final void g(int param0) {
        int fieldTemp$0 = 0;
        int var2;
        int var3;
        va var4;
        int var5;
        int var6;
        dj var7;
        kd var8;
        int var5Lifetime1;
        boolean decompiledFrameRemainder0 = true;
        var6 = ZombieDawn.field_J;
        if (5 == dj.field_e.field_H.field_A.field_a) {
          var2 = (this.a(true) + 12) / 24;
          var3 = (-1 + this.f(237239984)) / 24;
          if (var2 >= 0 &&
            var3 >= 0 &&
            dj.field_e.field_H.field_A.field_f[0].length > var2 &&
            dj.field_e.field_H.field_A.field_f.length > var3) {
            var4 = ub.a(127, dj.field_e.field_H.field_A.field_f[var3][var2]);
            if ((var4 != null)) {
              if (0 <= var4.field_h) {
                if (var4.field_h <= 0) {
                  this.field_y = this.field_y + var4.field_h;
                } else {
                  var5 = (var4.field_h + this.field_y) % 1572864;
                  if (var4.field_h > var5) {
                    this.field_y = var4.field_h + (-var5 + this.field_y);
                  } else {
                    this.field_y = this.field_y + var4.field_h;
                  }
                }
              } else {
                var5 = this.field_y % 1572864;
                if (-var4.field_h <= var5) {
                  this.field_y = this.field_y + var4.field_h;
                } else {
                  this.field_y = -1 - var5 + this.field_y;
                }
              }
              this.field_F = false;
              if (var4.field_i >= 0) {
                if (var4.field_i > 0) {
                  var5Lifetime1 = (var4.field_i + this.field_x) % 1572864;
                  if (var4.field_i <= var5Lifetime1) {
                    this.field_x = this.field_x + var4.field_i;
                  } else {
                    this.field_x = var4.field_i - (var5Lifetime1 - this.field_x);
                  }
                } else {
                  this.field_x = this.field_x + var4.field_i;
                }
              } else {
                var5Lifetime1 = this.field_x % 1572864;
                if (-var4.field_i <= var5Lifetime1) {
                  this.field_x = this.field_x + var4.field_i;
                } else {
                  this.field_x = this.field_x + (-var5Lifetime1 - 1);
                }
              }
              this.d((byte) 120);
            }
            decompiledFrameRemainder0 = false;
          }
          else {
            return;
          }
        }
        this.field_E = this.field_E + 1;
        if (param0 < 95) {
          var7 = (dj) null;
          gb.a((String) null, 58, (dj) null, (String) null, (dj) null);
        }
        if (this.field_E >= 120) {
          this.field_E = 0;
        }
        fieldTemp$0 = this.field_D;
        this.field_D = this.field_D + 1;
        if (fieldTemp$0 > 5) {
          this.field_D = 0;
          var8 = (kd) (this.a((byte) -74, 36, 2));
          while (var8 != null) {
            if (var8.i((byte) -126) &&
              dj.field_e.field_Q.b(-4149, this.field_t)) {
              kh.a(9, false);
              ck.a(this.field_t, 6836);
              if (dj.field_e.field_q == 4 &&
                dj.field_e.field_h == 0) {
                if (cm.field_c == null &&
                  this.field_t == 12) {
                  cm.field_c = var8;
                } else {
                  if (cm.field_c == var8 &&
                    this.field_t == 0 &&
                    !var8.x(124)) {
                    dj.field_e.a(241, 14, (byte) -23);
                  }
                }
              }
              this.b(-27598);
              return;
            }
            var8 = (kd) (this.e((byte) 32));
          }
        }
    }

    static {
    }
}
