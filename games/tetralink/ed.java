/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ed extends en {
    static int[] field_V;
    private int field_T;
    static int field_O;
    private int field_N;
    static String field_U;
    private boolean field_Q;
    private boolean field_R;
    private int field_W;
    static String field_P;
    private int field_S;

    final boolean a(na param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int var8_int = 0;
        RuntimeException var8 = null;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var8_int = super.a(param0, param1, param2, param3, param4, param5, param6) ? 1 : 0;
          if (var8_int != 0 &&
            this.field_Q) {
            return true;
          }
          if (!this.b(param6, 1343807649, param1, param3, param5)) {
            stackIn_5_0 = var8_int;
            return stackIn_5_0 != 0;
          }
          if (param2 == 1) {
            this.field_S = -param1 - this.field_t + param6;
            this.field_T = -param3 + (-this.field_w + param5);
            gi.field_c = this;
          }
          this.field_x = param2;
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_14_0 = var8;
          stackIn_14_1 = new StringBuilder().append("ed.PA(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    final StringBuilder a(Hashtable param0, StringBuilder param1, int param2, int param3) {
        StringBuilder discarded$62 = null;
        StringBuilder discarded$63 = null;
        RuntimeException var5 = null;
        StringBuilder stackIn_2_0 = null;
        StringBuilder stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3 != -372494750) {
            stackIn_2_0 = (StringBuilder) null;
            return stackIn_2_0;
          }
          if (this.a(param0, param2, param3 ^ -372494832, param1)) {
            this.a(-120, param1, param0, param2);
            this.a(-31857, param2, param1, param0);
            discarded$62 = param1.append(" revert=").append(this.field_R);
            if (2147483647 != this.field_N &&
              this.field_W != 2147483647) {
              discarded$63 = param1.append(" to ").append(this.field_N).append(',').append(this.field_W);
            }
          }
          stackIn_10_0 = (StringBuilder) (param1);
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_13_0 = var5;
          stackIn_13_1 = new StringBuilder().append("ed.WA(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static int a(byte param0, int param1, int param2) {
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        if (null != aa.field_bc) {
          stackIn_5_0 = aa.field_bc.field_b ? 1 : 0;
        } else {
          stackIn_5_0 = (null == ud.field_Qb) ? 0 : 1;
        }
        var3 = stackIn_5_0;
        if (var3 != 0) {
          stackIn_8_0 = oj.field_a.field_z;
        } else {
          stackIn_8_0 = 480;
        }
        var4 = stackIn_8_0;
        var5 = -param2 + var4;
        var6 = -(var5 / 2) - 638 + (int)a.field_d + param1;
        var7 = var5 / 20;
        if (param0 != 101) {
          return -98;
        }
        if (var5 < 0 ||
          0 > var6 ||
          var7 > 1) {
          var7 = -1;
        }
        if (var7 == 1) {
          var7 = 1 + var6 / 26;
        }
        return var7;
    }

    final static int h(int param0) {
        if (param0 != 32768) {
          return 74;
        }
        return hk.field_a;
    }

    private ed(int param0, int param1, int param2, int param3, kg param4, dn param5, na param6, boolean param7, boolean param8) {
        super(param0, param1, param2, param3, param4, param5);
        this.field_N = 2147483647;
        this.field_W = 2147483647;
        try {
          this.field_J = param6;
          this.field_R = param7 ? true : false;
          this.field_Q = param8 ? true : false;
        } catch (RuntimeException runtimeException) {
          throw oi.a((Throwable) ((Object) runtimeException), "ed.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + (param6 != null ? "{...}" : "null") + ',' + param7 + ',' + param8 + ')');
        }
    }

    final void a(int param0, boolean param1, na param2, int param3, int param4, int param5) {
        try {
          super.a(param0, param1, param2, param3, param4, param5);
          this.field_x = 0;
        } catch (RuntimeException runtimeException) {
          throw oi.a((Throwable) ((Object) runtimeException), "ed.AB(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final void d(byte param0) {
        super.d((byte) 122);
        this.field_J.a(this.field_u, 0, 51, 0, this.field_F);
        this.field_W = this.field_w;
        this.field_N = this.field_t;
        if (param0 <= 116) {
          this.field_S = 40;
        }
    }

    final static se e(byte param0) {
        try {
          Throwable var1 = null;
          se stackIn_3_0 = null;
          Throwable decompiledCaughtException = null;
          try {
            if (param0 < 111) {
              ed.f((byte) -107);
            }
            stackIn_3_0 = (se) (Class.forName("tj").newInstance());
            return stackIn_3_0;
          } catch (java.lang.Throwable decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var1 = decompiledCaughtException;
            return null;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(na param0, int param1, int param2, boolean param3) {
        int stackIn_16_1 = 0;
        int stackIn_17_2 = 0;
        int stackIn_22_1 = 0;
        int stackIn_25_2 = 0;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        try {
          if ((!(this.field_J instanceof ae) ||
            ((ae) (this.field_J)).field_K) &&
            this.field_x == 1) {
            var5_int = aa.field_Nb + (-this.field_S - param1);
            var6 = -param2 + (-this.field_T + a.field_a);
            if (this.field_t != var5_int ||
              this.field_w != var6) {
              this.field_w = var6;
              this.field_t = var5_int;
              if (this.field_s instanceof he) {
                ((he) (this.field_s)).a(param1, param2, this, -26289);
              }
            }
          } else {
            if (!this.field_R) {
              super.a(param0, param1, param2, param3);
              return;
            }
            if (this.field_N != this.field_t) {
              var5_int = this.field_N - this.field_t;
              stackIn_16_1 = this.field_t;
              if (Math.abs(var5_int) > 2) {
                stackIn_17_2 = var5_int >> 1;
              } else {
                if (var5_int <= 0) {
                  stackIn_17_2 = -1;
                } else {
                  stackIn_17_2 = 1;
                }
              }
              this.field_t = stackIn_16_1 + stackIn_17_2;
            }
            if (this.field_w != this.field_W) {
              var5_int = -this.field_w + this.field_W;
              stackIn_22_1 = this.field_w;
              if (Math.abs(var5_int) <= 2) {
                if (var5_int <= 0) {
                  stackIn_25_2 = -1;
                } else {
                  stackIn_25_2 = 1;
                }
              } else {
                stackIn_25_2 = var5_int >> 1;
              }
              this.field_w = stackIn_22_1 + stackIn_25_2;
            }
          }
          super.a(param0, param1, param2, param3);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_30_0 = var5;
          stackIn_30_1 = new StringBuilder().append("ed.MA(");
          if (param0 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_30_0), ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    public static void a(boolean param0) {
        field_U = null;
        field_V = null;
        field_P = null;
        if (param0) {
          ed.a((byte) 0, -44, 90);
        }
    }

    final static void f(byte param0) {
        int fieldTemp$4 = 0;
        int fieldTemp$3 = 0;
        int fieldTemp$0 = 0;
        int fieldTemp$2 = 0;
        int fieldTemp$1 = 0;
        kb stackIn_83_0 = null;
        kb stackIn_83_1 = null;
        int stackIn_83_2 = 0;
        kb stackIn_84_0;
        kb stackIn_84_1;
        boolean stackIn_84_3;
        boolean stackIn_102_0 = false;
        int stackIn_132_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        float var1_float = 0.0f;
        ko var1 = null;
        RuntimeException var1_ref = null;
        float var2_float = 0.0f;
        kb var2 = null;
        kb var3 = null;
        int var3_int = 0;
        qi var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        kb var7 = null;
        qi var3_refLifetime1;
        int var1_intLifetime1;
        float var2_floatLifetime1;
        int var4Lifetime1;
        var6 = TetraLink.field_J;
        try {
          if (qe.field_g != va.field_p) {
            var1_int = 1;
            if (!cd.field_d.field_c &&
              wk.field_i.field_c) {
              im.field_e = uk.field_x;
              ok.field_d = mh.field_c;
              cl.field_g = 2;
              var2_float = -dj.field_h + im.field_e;
              while ((double)var2_float < -3.141592653589793) {
                var2_float = (float)((double)var2_float + 6.283185307179586);
              }
              while ((double)var2_float > 3.141592653589793) {
                var2_float = (float)((double)var2_float - 6.283185307179586);
              }
              if ((double)Math.abs(var2_float) > 0.01 ||
                0.05 < (double)Math.abs(-ok.field_d + rn.field_d)) {
                var1_int = 0;
              }
            } else {
              if (cd.field_d.field_c &&
                !wk.field_i.field_c) {
                rn.field_d = mh.field_c;
                dj.field_h = uk.field_x;
                ti.field_g[0] = (double)rn.field_d * Math.sin((double)dj.field_h);
                ti.field_g[2] = (double)rn.field_d * Math.cos((double)dj.field_h);
                wk.field_i.field_c = true;
                eo.a(-30);
              }
            }
            if (cd.field_d.field_n) {
              jl.field_e = jl.field_e - 16384;
              if (0 >= jl.field_e) {
                jl.field_e = 0;
              } else {
                var1_int = 0;
              }
            } else {
              if (wk.field_i.field_n) {
                jl.field_e = 0;
                wk.field_i.field_n = false;
              }
              jl.field_e = jl.field_e + 16384;
              if (jl.field_e < 262144) {
                var1_int = 0;
              } else {
                jl.field_e = 262144;
              }
            }
            wk.field_i.field_g = cd.field_d.field_g;
            if (wk.field_i.field_l < cd.field_d.field_l) {
              wk.field_i.field_l = wk.field_i.field_l + 1;
            } else {
              if (wk.field_i.field_l > cd.field_d.field_l) {
                wk.field_i.field_l = wk.field_i.field_l - 1;
              }
            }
            wk.field_i.field_j = cd.field_d.field_j;
            wk.field_i.field_e = cd.field_d.field_e;
            if (cd.field_d.field_l != wk.field_i.field_l) {
              var1_int = 0;
            }
            if (var1_int != 0) {
              va.field_p = qe.field_g;
              wk.field_i = cd.field_d;
            }
          }
          if (cl.field_g != 0) {
            while (-3.141592653589793 > (double)dj.field_h) {
              dj.field_h = (float)((double)dj.field_h + 6.283185307179586);
            }
            while ((double)dj.field_h > 3.141592653589793) {
              dj.field_h = (float)((double)dj.field_h - 6.283185307179586);
            }
            while ((double)im.field_e < -3.141592653589793) {
              im.field_e = (float)((double)im.field_e + 6.283185307179586);
            }
            while ((double)im.field_e > 3.141592653589793) {
              im.field_e = (float)((double)im.field_e - 6.283185307179586);
            }
            var1_float = im.field_e - dj.field_h;
            while (-3.141592653589793 > (double)var1_float) {
              var1_float = (float)((double)var1_float + 6.283185307179586);
            }
            while ((double)var1_float > 3.141592653589793) {
              var1_float = (float)((double)var1_float - 6.283185307179586);
            }
            dj.field_h = dj.field_h + 0.05000000074505806f * var1_float;
            var2_floatLifetime1 = -rn.field_d + ok.field_d;
            rn.field_d = rn.field_d + 0.05000000074505806f * var2_floatLifetime1;
            ti.field_g[0] = (double)rn.field_d * Math.sin((double)dj.field_h);
            ti.field_g[2] = (double)rn.field_d * Math.cos((double)dj.field_h);
            eo.a(-42);
            if (0.0001 > (double)Math.abs(var1_float) &&
              0.05 > (double)Math.abs(var2_floatLifetime1)) {
              cl.field_g = 0;
            } else {
              if (0.1 > (double)Math.abs(var1_float) &&
                Math.abs(var2_floatLifetime1) < 1.0f) {
                cl.field_g = 1;
              }
            }
          }
          if (field_O == 10) {
            if (50 < dh.field_e) {
              if (dh.field_e <= 100) {
                bo.field_y = (float)(-50 + dh.field_e);
              } else {
                if (dh.field_e <= 350) {
                  var1_intLifetime1 = dh.field_e - 100;
                  ul.field_d = (float)((double)(0.10000000149011612f * (210.0f - 4.0f * s.field_c)) + 3.141592653589793);
                  hi.field_d[0] = Math.cos((double)ul.field_d);
                  hi.field_d[2] = Math.sin((double)ul.field_d);
                  jl.field_e = (var1_intLifetime1 * (4 * var1_intLifetime1 * var1_intLifetime1) / 5000 << 16) / 3125;
                  sk.field_c = 256 - var1_intLifetime1 * var1_intLifetime1 * (var1_intLifetime1 * 128) / 7812500;
                  s.field_c = (float)((long)(var1_intLifetime1 * (var1_intLifetime1 * var1_intLifetime1)) * 210L) / 62500000.0f;
                } else {
                  if (351 == dh.field_e) {
                    jl.field_e = 262144;
                    sk.field_c = 0;
                    hi.field_d[0] = 1.0;
                    s.field_c = 52.5f;
                    hi.field_d[2] = 0.0;
                  }
                }
              }
            } else {
              bo.field_y = 0.0f;
            }
          }
          var1 = (ko) (eg.field_J.c(false));
          while (var1 != null) {
            fieldTemp$4 = var1.field_n - 1;
            var1.field_n = var1.field_n - 1;
            if (0 == fieldTemp$4) {
              var1.b(false);
            }
            var1 = (ko) (eg.field_J.a((byte) -70));
          }
          var2 = (kb) (tb.field_d.c(false));
          while (var2 != null) {
            fieldTemp$3 = var2.field_r + 1;
            var2.field_r = var2.field_r + 1;
            if (83 < fieldTemp$3) {
              var2.b(false);
            }
            var2 = (kb) (tb.field_d.a((byte) -70));
          }
          if (ui.a(40, 1692) == 0) {
            stackIn_83_0 = null;
            stackIn_83_1 = null;
            stackIn_83_2 = ui.a(3, 1692);
            if (ui.a(2, 1692) != 0) {
              stackIn_84_0 = null;
              stackIn_84_1 = null;
              stackIn_84_3 = false;
            } else {
              stackIn_84_0 = null;
              stackIn_84_1 = null;
              stackIn_84_3 = true;
            }
            var7 = new kb(stackIn_83_2, stackIn_84_3, ui.a(64, 1692));
            var3 = (kb) (tb.field_d.c(false));
            while (var3 != null) {
              if (var3.field_s >= var7.field_s) {
                var3 = (kb) (tb.field_d.a((byte) -70));
                continue;
              }
              break;
            }
            if (var3 == null) {
              tb.field_d.a(var7, false);
            } else {
              cl.a(var3, 98, var7);
            }
          }
          if (cf.a(0, (byte) 106)) {
            if (vh.field_d) {
              if (il.field_S < 32) {
                il.field_S = il.field_S + 1;
              } else {
                var3_int = -bl.field_Xb + ki.field_b & 65535;
                if ((32768 & var3_int) != 0) {
                  var3_int = var3_int - 65536;
                }
                var3_int = var3_int >> 5;
                bl.field_Xb = bl.field_Xb + var3_int;
                if ((var3_int & -4) == 0) {
                  ac.field_a.a((byte) 122, go.field_a);
                  vh.field_d = false;
                }
              }
            } else {
              fieldTemp$0 = il.field_S - 1;
              il.field_S = il.field_S - 1;
              if (fieldTemp$0 < 0) {
                il.field_S = 0;
              }
              if (ui.a(200, 1692) == 0) {
                ki.field_b = ui.a(65536, 1692);
                ac.field_a.a((byte) 57, vg.field_Vb);
                vh.field_d = true;
                var3_int = ki.field_b - bl.field_Xb & 65535;
                stackIn_102_0 = ((var3_int & 32768) != 0);
                jo.field_a = stackIn_102_0;
              }
            }
            ac.field_a.a((byte) -125);
          }
          var3_ref = (qi) (nd.field_Sb.c(false));
          if (param0 >= -81) {
            field_V = (int[]) null;
          }
          while (var3_ref != null) {
            fieldTemp$2 = var3_ref.field_s - 1;
            var3_ref.field_s = var3_ref.field_s - 1;
            if (fieldTemp$2 <= 0) {
              var3_ref.b(false);
            } else {
              var3_ref.field_v = var3_ref.field_v + var3_ref.field_r;
              var3_ref.field_t = var3_ref.field_t + var3_ref.field_x;
              var3_ref.field_y = var3_ref.field_y + var3_ref.field_w;
              var3_ref.field_r = var3_ref.field_r + 48;
            }
            var3_ref = (qi) (nd.field_Sb.a((byte) -70));
          }
          if (wk.field_i.field_e > 0 && (wk.field_i.field_e == 1 ||
            ui.a(wk.field_i.field_e, 1692) == 0)) {
            while (true) {
              var4 = ui.a(8193, 1692) - 4096;
              var5 = -4096 + ui.a(8193, 1692);
              if (var4 * var4 + var5 * var5 >= 8388608) {
                continue;
              }
              break;
            }
            var3_refLifetime1 = new qi(0, 1638400, 0, var4, -8192, var5, 150);
            nd.field_Sb.a(var3_refLifetime1, false);
          }
          if (field_O != -4 &&
            field_O != -2) {
            stackIn_132_0 = (!cd.field_d.field_c) ? 1 : 2;
            wk.field_u = stackIn_132_0;
          } else {
            wk.field_u = 0;
          }
          if (wk.field_u == ml.field_ab) {
            wd.field_i = 0;
          } else {
            fieldTemp$1 = wd.field_i + 8;
            wd.field_i = wd.field_i + 8;
            if (fieldTemp$1 >= 256) {
              wd.field_i = 0;
              ml.field_ab = wk.field_u;
            }
          }
          var4Lifetime1 = 0;
          if (wk.field_u == 2) {
            var4Lifetime1 = go.field_g.b(ai.field_c) + 17;
            if (var4Lifetime1 < 135) {
              var4Lifetime1 = 135;
            }
          } else {
            if (wk.field_u == 1) {
              var4Lifetime1 = 17 + go.field_g.b(qf.field_d);
            }
          }
          a.field_d = a.field_d + (-a.field_d + (float)var4Lifetime1) * 0.10000000149011612f;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw oi.a((Throwable) ((Object) var1_ref), "ed.G(" + param0 + ')');
        }
    }

    static {
        field_U = "Names cannot start or end with space or underscore";
        field_P = "Leave game";
    }
}
