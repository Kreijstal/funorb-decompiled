/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gp extends ps {
    private String field_f;
    static int[] field_g;
    private String field_h;
    static int field_i;

    final kj a(byte param0) {
        if (param0 > -77) {
          iw var3 = (iw) null;
          this.a((iw) null, -96);
        }
        return qq.field_K;
    }

    public static void c(int param0) {
        int var1 = -123 % ((param0 + 53) / 59);
        field_g = null;
    }

    final static void b(byte param0) {
        ag var1 = null;
        int var2 = 0;
        boolean stackIn_15_0 = false;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1_ref = null;
        ag var1Lifetime1;
        var2 = Kickabout.field_G;
        try {
          cb.field_d.d();
          if (param0 != -28) {
            gp.c(-80);
          }
          pg.field_d.d();
          ri.field_r = ri.field_r - 1;
          if (ri.field_r == 0) {
            ri.field_r = 200;
            var1 = (ag) (ps.field_a.g(param0 + 24037));
            while (var1 != null) {
              if (!var1.field_k.e((byte) -113)) {
                var1.c((byte) -109);
              }
              var1 = (ag) (ps.field_a.c(param0 ^ -59));
            }
            if (null == qd.field_c) {
              return;
            }
            var1Lifetime1 = (ag) (qd.field_c.g(24009));
            while (var1Lifetime1 != null) {
              stackIn_15_0 = var1Lifetime1.field_k.e((byte) -113);
              if (!stackIn_15_0) {
                var1Lifetime1.c((byte) -109);
              }
              var1Lifetime1 = (ag) (qd.field_c.c(33));
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw nb.a((Throwable) ((Object) var1_ref), "gp.M(" + param0 + ')');
        }
    }

    final static void a(boolean param0, byte param1) {
        g.field_a.a(97, param0);
        ib var2 = la.field_a;
        if (param1 >= -27) {
          gp.b((byte) 111);
        }
        if (var2 != null) {
          var2.a(g.field_a.field_T, g.field_a.field_F, (byte) -120);
        }
    }

    final static ld a(byte param0, String param1) {
        ld stackIn_4_0 = null;
        ld stackIn_8_0 = null;
        ld stackIn_14_0 = null;
        int stackIn_22_0 = 0;
        ld stackIn_26_0 = null;
        ld stackIn_39_0 = null;
        ld stackIn_44_0 = null;
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        String stackIn_51_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var4Lifetime1;
        int var5Lifetime1;
        int var6Lifetime1;
        var7 = Kickabout.field_G;
        try {
          var3 = -34 % ((param0 - 38) / 57);
          var2_int = param1.length();
          if (0 == var2_int) {
            stackIn_4_0 = ld.field_b;
            return stackIn_4_0;
          }
          if (var2_int > 64) {
            stackIn_8_0 = st.field_j;
            return stackIn_8_0;
          }
          if (param1.charAt(0) == 34) {
            if (param1.charAt(-1 + var2_int) != 34) {
              stackIn_14_0 = lm.field_F;
              return stackIn_14_0;
            }
            var4 = 0;
            for (var5 = 1; var5 < -1 + var2_int; var5++) {
              var6 = param1.charAt(var5);
              if (var6 != 92) {
                if (var6 == 34 &&
                  var4 == 0) {
                  stackIn_26_0 = lm.field_F;
                  return stackIn_26_0;
                }
                var4 = 0;
              } else {
                stackIn_22_0 = (var4 != 0) ? 0 : 1;
                var4 = stackIn_22_0;
              }
            }
            return null;
          }
          var4Lifetime1 = 0;
          for (var5Lifetime1 = 0; var2_int > var5Lifetime1; var5Lifetime1++) {
            boolean decompiledFrameRemainder0 = true;
            var6Lifetime1 = param1.charAt(var5Lifetime1);
            if (var6Lifetime1 == 46) {
              if (var5Lifetime1 != 0 &&
                var5Lifetime1 != var2_int - 1 &&
                var4Lifetime1 == 0) {
                var4Lifetime1 = 1;
                decompiledFrameRemainder0 = false;
              }
              else {
                stackIn_39_0 = lm.field_F;
                return stackIn_39_0;
              }
            }
            if (decompiledFrameRemainder0) {
              if (ua.field_i.indexOf(var6Lifetime1) == -1) {
                stackIn_44_0 = lm.field_F;
                return stackIn_44_0;
              }
              var4Lifetime1 = 0;
            }
          }
          return null;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_50_0 = var2;
          stackIn_50_1 = new StringBuilder().append("gp.J(").append(param0).append(',');
          if (param1 == null) {
            stackIn_51_2 = "null";
          } else {
            stackIn_51_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_50_0), ((StringBuilder) (Object) stackIn_50_1).append(stackIn_51_2).append(')').toString());
        }
    }

    final static boolean a(byte param0, String param1, boolean param2, String param3, ae param4, int param5, String param6) {
        RuntimeException var7 = null;
        jn var8 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (wk.field_f != vj.field_a) {
            return false;
          }
          var8 = new jn(wd.field_l, param4);
          wd.field_l.a(var8, false);
          if (!wq.c((byte) 59)) {
            kl.field_a = null;
            n.field_c = param2;
            tn.field_b = param5;
            wn.field_i = param6;
            wk.field_f = nr.field_f;
            ld.field_a = param1;
            qr.field_f = param3;
          } else {
            var8.t(17);
          }
          if (param0 >= 98) {
            return true;
          }
          field_g = (int[]) null;
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_16_0 = var7;
          stackIn_16_1 = new StringBuilder().append("gp.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          stackIn_22_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',');
          if (param4 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          stackIn_25_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(')').toString());
        }
    }

    final static void a(int param0, int param1, int param2, int param3, String param4, String param5) {
        ml var9 = null;
        int var7 = 0;
        try {
          var9 = or.field_d;
          ml var6 = var9;
          var9.b(param3, (byte) 104);
          var9.field_n = var9.field_n + 1;
          int var8 = 39 / ((param1 - 14) / 61);
          var7 = var9.field_n;
          var9.a(113, param2);
          if (param2 == 2) {
            var9.a(14190, param4);
          }
          if (param5 == null) {
            var9.g(-1207444472, param0);
          } else {
            cu.a((byte) 104, param5, var9);
          }
          var9.c(62, -var7 + var9.field_n);
        } catch (RuntimeException runtimeException) {
          throw nb.a((Throwable) ((Object) runtimeException), "gp.I(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(iw param0, int param1) {
        param0.a(this.field_f, (byte) -126);
        if (param1 != 17053) {
          return;
        }
        try {
          param0.a((byte) 124, this.field_h);
        } catch (RuntimeException runtimeException) {
          throw nb.a((Throwable) ((Object) runtimeException), "gp.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static int a(up param0, int param1) {
        int var4 = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        fn var5 = null;
        int var6 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3Lifetime1;
        var6 = Kickabout.field_G;
        try {
          var2_int = 0;
          if (param1 != -576054046) {
            field_i = 81;
          }
          for (var3 = 0; param0.field_h.length > var3; var3++) {
            var2_int = var2_int + (pa.field_g[param0.field_h[var3]].field_e >> 1);
          }
          var3Lifetime1 = p.a(param1 + 576054974, param0);
          if (15 <= var3Lifetime1) {
            var2_int = (452 * ((var3Lifetime1 - 15) * (var3Lifetime1 - 15)) >> 5) + 10;
            for (var4 = 0; param0.field_h.length > var4; var4++) {
              var5 = pa.field_g[param0.field_h[var4]];
              var2_int = var2_int + fn.field_g[var5.field_k];
              var2_int = var2_int + (var5.field_e >> 2);
            }
          }
          stackIn_11_0 = var2_int;
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_14_0 = var2;
          stackIn_14_1 = new StringBuilder().append("gp.K(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(')').toString());
        }
    }

    gp(String param0, String param1) {
        try {
          this.field_h = param1;
          this.field_f = param0;
        } catch (RuntimeException runtimeException) {
          throw nb.a((Throwable) ((Object) runtimeException), "gp.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_g = new int[8192];
    }
}
