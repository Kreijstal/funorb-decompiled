/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fd extends kk {
    static String field_Q;
    static String field_M;
    static String field_L;
    static long field_K;
    static int field_J;
    static int field_O;
    static String field_H;
    private Object field_N;
    static int field_I;

    public static void i(int param0) {
        if (param0 == 0) {
          field_Q = null;
          field_M = null;
          field_H = null;
          field_L = null;
          return;
        }
        field_H = (String) null;
        field_Q = null;
        field_M = null;
        field_H = null;
        field_L = null;
    }

    final static int a(boolean param0, byte param1) {
        int stackIn_60_0 = 0;
        int stackIn_64_0 = 0;
        int stackIn_71_0 = 0;
        int stackIn_75_0 = 0;
        int stackIn_79_0 = 0;
        int stackIn_81_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = Pool.field_O;
        try {
          li.field_d = li.field_d + 65536;
          while (ng.a(hj.field_f, param1 - 65, li.field_d) >= 65536) {
            li.field_d = li.field_d - hj.field_f;
            uf.field_X = uf.field_X + 1;
          }
          var2_int = -1;
          if (nf.field_V == null) {
            if (jr.field_m != null) {
              var2_int = jr.field_m.length;
            }
          } else {
            var2_int = nf.field_V.length;
          }
          if (param1 != 65) {
            fd.i(38);
          }
          if (var2_int != -1) {
            boolean decompiledFrameRemainder0 = true;
            if (hj.field_g > ug.field_u) {
              ug.field_u = ug.field_u + 1;
              if (ug.field_u > hj.field_l && (nf.field_V == null ||
                nf.field_V[rj.field_f] == null)) {
                ug.field_u = ug.field_u - 1;
                decompiledFrameRemainder0 = false;
              }
              else {
                if (ug.field_u >= hj.field_g &&
                  null == nf.field_V[(1 + rj.field_f) % var2_int]) {
                  ug.field_u = ug.field_u - 1;
                }
              }
            }
            if (ug.field_u >= hj.field_g) {
              cf.field_b = rj.field_f;
              ug.field_u = ug.field_u - hj.field_g;
              if (!b.field_K) {
                rj.field_f = rj.field_f - 1;
                if (rj.field_f < 0) {
                  rj.field_f = rj.field_f + var2_int;
                }
              } else {
                rj.field_f = rj.field_f + 1;
                if (rj.field_f >= var2_int) {
                  rj.field_f = rj.field_f - var2_int;
                }
              }
            }
            if (ug.field_u > hj.field_l) {
              b.field_K = true;
            }
          }
          if (null != vq.field_Yb) {
            var3 = -(vq.field_Yb.field_y / 2) + 357;
            var4 = 0;
            if (0 != ne.field_s &&
              ua.field_o > var3 &&
              var3 + vq.field_Yb.field_A > ua.field_o) {
              if (-vq.field_Yb.field_z + 269 < lq.field_W &&
                269 > lq.field_W) {
                b.field_K = false;
                ug.field_u = hj.field_g;
                var4 = 1;
              }
              if (586 < lq.field_W &&
                lq.field_W < 586 + vq.field_Yb.field_z) {
                var4 = 1;
                b.field_K = true;
                ug.field_u = hj.field_g;
              }
            }
            if (var4 == 0 &&
              hj.field_l < ug.field_u &&
              gg.field_f > var3 &&
              gg.field_f < var3 + vq.field_Yb.field_A) {
              if (-vq.field_Yb.field_z + 269 < wn.field_i &&
                wn.field_i < 269) {
                ug.field_u = hj.field_l;
              }
              if (586 < wn.field_i &&
                wn.field_i < 586 + vq.field_Yb.field_z) {
                ug.field_u = hj.field_l;
              }
            }
          }
          if (!param0) {
            return 0;
          }
          jc.field_j.a(ho.a((byte) -82, lq.field_W, ua.field_o), ho.a((byte) -21, wn.field_i, gg.field_f), param1 - 192);
          if (jc.field_j.b((byte) 62)) {
            if (jc.field_j.field_h == 0) {
              stackIn_60_0 = 3;
              return stackIn_60_0;
            }
            if (jc.field_j.field_h == 1) {
              stackIn_64_0 = 2;
              return stackIn_64_0;
            }
          }
          while (true) {
            if (!n.h(127)) {
              stackIn_81_0 = 0;
              return stackIn_81_0;
            }
            jc.field_j.a(true, 0);
            if (jc.field_j.b((byte) 101)) {
              if (jc.field_j.field_h == 0) {
                stackIn_71_0 = 3;
                return stackIn_71_0;
              }
              if (jc.field_j.field_h == 1) {
                stackIn_75_0 = 1;
                return stackIn_75_0;
              }
            }
            if (qi.field_a != 13) {
              continue;
            }
            break;
          }
          stackIn_79_0 = 1;
          return stackIn_79_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var2), "fd.Q(" + param0 + ',' + param1 + ')');
        }
    }

    final static void h(int param0) {
        int fieldTemp$0 = 0;
        RuntimeException decompiledCaughtException = null;
        oq var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        var3 = Pool.field_O;
        try {
          var1 = ej.field_j;
          if (param0 <= 117) {
            return;
          }
          while (va.g((byte) -120)) {
            var1.b(false, 8);
            fieldTemp$0 = var1.field_v + 1;
            var1.field_v = var1.field_v + 1;
            var2 = fieldTemp$0;
            wn.a(var1, 1);
            ej.field_j.b(var1.field_v - var2, true);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var1_ref), "fd.G(" + param0 + ')');
        }
    }

    fd(Object param0, int param1) {
        super(param1);
        try {
          this.field_N = param0;
        } catch (RuntimeException runtimeException) {
          throw wm.a((Throwable) ((Object) runtimeException), "fd.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void a(int[] param0, int[] param1, byte param2) {
        try {
          th.a(0, param2 ^ 30966, param0, param1, param0.length - 1);
          if (param2 != -54) {
            int[] var4 = (int[]) null;
            fd.a((int[]) null, (int[]) null, (byte) -96);
          }
        } catch (RuntimeException runtimeException) {
          throw wm.a((Throwable) ((Object) runtimeException), "fd.R(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final boolean e(int param0) {
        if (param0 >= -16) {
          fd.i(-107);
          return false;
        }
        return false;
    }

    final static void a(int[] param0, int param1, int param2, int param3, int param4) {
        int[] var8 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        int var7 = 0;
        int[] var9 = null;
        try {
          if (param4 != 2) {
            var8 = (int[]) null;
            fd.a((int[]) null, (int[]) null, (byte) -8);
          }
          param3--;
          while (param3 >= 0) {
            var9 = param0;
            var5 = var9;
            var6 = param2;
            var7 = param1;
            var9[var6] = var7 + rb.b(8355711, var9[var6] >> 1);
            param2++;
            param3--;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_9_0 = var5_ref;
          stackIn_9_1 = new StringBuilder().append("fd.S(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final Object c(byte param0) {
        if (param0 <= 119) {
          return (Object) null;
        }
        return this.field_N;
    }

    static {
        field_M = "<%0> has declined the invitation.";
        field_O = 0;
        field_Q = "Eight-ball";
        field_J = 360;
        field_H = "<%0> all want to draw.";
        field_L = "Mouse over an icon for details";
        field_I = 0;
    }
}
