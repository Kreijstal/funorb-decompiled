/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pj extends ob {
    static ko field_H;
    static ie field_K;
    static kb field_J;
    static String field_I;

    final static Object a(boolean param0, int param1, byte[] param2) {
        hi var3 = null;
        RuntimeException var3_ref = null;
        hi stackIn_8_0 = null;
        byte[] stackIn_11_0 = null;
        byte[] stackIn_13_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 >= -26) {
            field_K = (ie) null;
          }
          if (param2 == null) {
            return null;
          }
          if (param2.length > 136) {
            var3 = new hi();
            ((mb) ((Object) var3)).a(param2, (byte) 2);
            stackIn_8_0 = var3;
            return stackIn_8_0;
          }
          if (!param0) {
            stackIn_13_0 = (byte[]) (param2);
            return stackIn_13_0;
          }
          stackIn_11_0 = jj.a(param2, (byte) 91);
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_16_0 = var3_ref;
          stackIn_16_1 = new StringBuilder().append("pj.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    final static void a(boolean param0, re param1, boolean param2, int param3, int param4) {
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        String var7 = null;
        try {
          Pool.field_L[0] = lc.field_P.nextInt();
          Pool.field_L[1] = lc.field_P.nextInt();
          Pool.field_L[2] = (int)(Pool.field_Q >> 32);
          Pool.field_L[3] = (int)Pool.field_Q;
          bc.field_b.field_v = 0;
          bc.field_b.a(true, Pool.field_L[0]);
          bc.field_b.a(true, Pool.field_L[1]);
          bc.field_b.a(true, Pool.field_L[2]);
          bc.field_b.a(true, Pool.field_L[3]);
          be.a(bc.field_b, 0);
          bc.field_b.a((byte) -81, param4);
          param1.a((byte) 121, bc.field_b);
          ej.field_j.field_v = 0;
          if (param0) {
            ej.field_j.a(18, false);
          } else {
            ej.field_j.a(16, false);
          }
          ej.field_j.field_v = ej.field_j.field_v + 2;
          var5_int = ej.field_j.field_v;
          ej.field_j.a(true, im.field_ec);
          ej.field_j.a(kn.field_j, (byte) -80);
          var6 = 0;
          if (bf.field_g) {
            var6 = var6 | 1;
          }
          if (hk.field_s) {
            var6 = var6 | 4;
          }
          if (param2) {
            var6 = var6 | 8;
          }
          if (ri.field_N != null) {
            var6 = var6 | 16;
          }
          ej.field_j.a(var6, false);
          var7 = eq.a(hk.d(90), (byte) 120);
          if (var7 == null) {
            var7 = "";
          }
          ej.field_j.a(-9946, var7);
          if (null != ri.field_N) {
            ej.field_j.a(false, ri.field_N);
          }
          ad.a((byte) 93, rb.field_l, bc.field_b, ei.field_q, ej.field_j);
          ej.field_j.c(ej.field_j.field_v - var5_int, (byte) -92);
          de.a(-1, 0);
          if (param3 != -98300704) {
            pj.b(false);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_24_0 = var5;
          stackIn_24_1 = new StringBuilder().append("pj.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    pj(int param0, int param1, int param2, int param3, int param4, int[] param5) {
        super((dd) null, param0, param1, param2, param3, param4, param5);
    }

    final void c(int param0) {
        super.c(46);
        if (param0 <= 36) {
          return;
        }
        this.a(mc.field_e, new int[]{mc.field_e.field_G}, 100, -16097, ng.field_B, 320, 4);
        this.b(100, false);
    }

    public static void b(boolean param0) {
        field_I = null;
        field_H = null;
        if (param0) {
          return;
        }
        field_K = null;
        field_J = null;
    }

    final static void f(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2_int = 0;
        Object var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        dd var6 = null;
        dd var7 = null;
        dd var8 = null;
        int var3Lifetime1;
        var4 = Pool.field_O;
        try {
          qh.b(243, 197, 369, 143, 16777215);
          qh.f(244, 198, 367, 141, 0);
          if (nf.field_V == null) {
            if (null != so.field_h) {
              so.field_h.a(o.field_A, 245, 199, 365, 139, 16777215, -1, 1, 1, 0);
            }
            return;
          }
          var6 = nf.field_V[rj.field_f];
          if (param0 != -1) {
            field_K = (ie) null;
          }
          if (var6 != null) {
            var6.c(245, 199);
          } else {
            if (so.field_h != null) {
              so.field_h.a(o.field_A, 245, 199, 365, 139, 16777215, -1, 1, 1, 0);
            }
          }
          if (ug.field_u < hj.field_l) {
            var7 = nf.field_V[cf.field_b];
            if (var7 != null) {
              var2_int = (var7.field_w + 60) * ug.field_u / hj.field_l;
              var3 = var2_int - 30;
              if (!b.field_K) {
                ml.a(var3 * -256 / 30, (byte) 63, 245, 199, var7, (var7.field_w - var3) * 256 / 30);
              } else {
                ml.a((-var3 + var7.field_w) * 256 / 30, (byte) 117, 245, 199, var7, var3 * -256 / 30);
              }
            }
          }
          if (so.field_h != null) {
            var2 = null;
            var5 = 0;
            var3Lifetime1 = var5;
            while (var5 < nf.field_V.length) {
              var8 = nf.field_V[var5];
              if (var8 != null && (365 != var8.field_w ||
                var8.field_y != 139)) {
                if (var2 != null) {
                  var2 = (String) (var2) + ", " + var5;
                } else {
                  var2 = Integer.toString(var5);
                }
              }
              var5++;
            }
            if (var2 != null) {
              so.field_h.a("Screenshot(s) " + (String) (var2) + " is/are the wrong size! Should be " + 365 + "<times>" + 139, 245, 199, 365, 139, 16737843, 0, 1, 1, 0);
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var1), "pj.E(" + param0 + ')');
        }
    }

    static {
        field_H = new ko();
        field_K = new ie();
        field_I = null;
    }
}
