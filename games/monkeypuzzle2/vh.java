/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vh extends t {
    static float[] field_C;
    static String field_F;
    private int field_D;
    static float[] field_H;
    static int field_I;
    static va field_B;
    static le[] field_E;
    static String field_L;
    static String field_K;
    private kf field_J;

    final void a(int param0, int param1, int param2, int param3) {
        int var5;
        int var6;
        na var8;
        int var9;
        int var10;
        int var11;
        le var12;
        le var13;
        le var14;
        var11 = MonkeyPuzzle2.field_F ? 1 : 0;
        super.a(param0, param1, param2, param3);
        if (param1 != 0) {
          return;
        }
        L0: {
          var5 = param3 + this.field_r + (this.field_l >> 1);
          var6 = (this.field_p >> 1) + this.field_e + param2;
          var8 = this.field_J.b(false);
          if (var8 != ke.field_d &&
            f.field_g != var8) {
            if (ol.field_h == var8) {
              var14 = hk.field_i[2];
              var14.c(-(var14.field_k >> 1) + var5, var6 - (var14.field_j >> 1), 256);
            } else {
              if (var8 == wj.field_i) {
                var13 = hk.field_i[1];
                var13.c(var5 - (var13.field_k >> 1), -(var13.field_j >> 1) + var6, 256);
                break L0;
              }
            }
            break L0;
          }
          var12 = hk.field_i[0];
          var9 = var12.field_m << 1;
          var10 = var12.field_n << 1;
          if (null != wi.field_e &&
            wi.field_e.field_k >= var9 &&
            wi.field_e.field_j >= var10) {
            mc.a(param0 ^ -8495, wi.field_e);
            ge.d();
          } else {
            wi.field_e = new le(var9, var10);
            mc.a(-8497, wi.field_e);
          }
          var12.b(112, 144, var12.field_m << 4, var12.field_n << 4, -this.field_D << 10, 4096);
          tj.b(653);
          wi.field_e.c(-var12.field_m + var5, -var12.field_n + var6, 256);
        }
    }

    final String a(byte param0) {
        if (this.field_g) {
          return this.field_J.b((byte) 82);
        }
        if (param0 == 54) {
          return null;
        }
        vh.a(-25);
        return null;
    }

    final static boolean a(int[] param0, byte param1) {
        int var5_int = 0;
        int var6 = 0;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_41_2 = null;
        RuntimeException decompiledCaughtException = null;
        long var2_long = 0L;
        RuntimeException var2 = null;
        nh var4_ref_nh = null;
        int var4 = 0;
        nh var5 = null;
        int var7 = 0;
        var7 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          if (wh.field_b != dk.field_h) {
            return false;
          }
          var2_long = pf.a(0);
          if (ff.field_g != 0 &&
            sb.field_f < 0) {
            var4_ref_nh = (nh) (cb.field_a.a((byte) -117));
            if (var4_ref_nh != null &&
              var2_long > var4_ref_nh.field_e) {
              var4_ref_nh.c(-19822);
              rc.field_f = var4_ref_nh.field_h.length;
              MonkeyPuzzle2.field_D.field_h = 0;
              for (var5_int = 0; var5_int < rc.field_f; var5_int++) {
                MonkeyPuzzle2.field_D.field_g[var5_int] = var4_ref_nh.field_h[var5_int];
              }
              bk.field_f = il.field_e;
              il.field_e = hk.field_l;
              hk.field_l = wk.field_a;
              wk.field_a = var4_ref_nh.field_g;
              return true;
            }
          }
          if (param1 <= 120) {
            return true;
          }
          while (true) {
            if (sb.field_f < 0) {
              MonkeyPuzzle2.field_D.field_h = 0;
              if (!hj.a(1, true)) {
                return false;
              }
              sb.field_f = MonkeyPuzzle2.field_D.r(-118);
              MonkeyPuzzle2.field_D.field_h = 0;
              rc.field_f = param0[sb.field_f];
            }
            if (!gb.a(true)) {
              return false;
            }
            if (ff.field_g == 0) {
              bk.field_f = il.field_e;
              il.field_e = hk.field_l;
              hk.field_l = wk.field_a;
              wk.field_a = sb.field_f;
              sb.field_f = -1;
              return true;
            }
            var4 = ff.field_g;
            if (rc.field_l != 0.0) {
              var4 = (int)((double)var4 + pi.field_l.nextGaussian() * rc.field_l);
              if (var4 < 0) {
                var4 = 0;
              }
            }
            var5 = new nh(var2_long + (long)var4, sb.field_f, new byte[rc.field_f]);
            for (var6 = 0; rc.field_f > var6; var6++) {
              var5.field_h[var6] = MonkeyPuzzle2.field_D.field_g[var6];
            }
            cb.field_a.a(-8212, var5);
            sb.field_f = -1;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_40_0 = var2;
          stackIn_40_1 = new StringBuilder().append("vh.D(");
          if (param0 == null) {
            stackIn_41_2 = "null";
          } else {
            stackIn_41_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_40_0), ((StringBuilder) (Object) stackIn_40_1).append(stackIn_41_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(java.awt.Canvas param0, byte param1) {
        int var2_int = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          var2_int = -111 / ((-67 - param1) / 48);
          ni.a((java.awt.Component) ((Object) param0), (byte) -124);
          ac.a(-117, (java.awt.Component) ((Object) param0));
          if (null != eb.field_A) {
            eb.field_A.a(0, (java.awt.Component) ((Object) param0));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_5_0 = var2;
          stackIn_5_1 = new StringBuilder().append("vh.A(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(String param0, String param1, byte param2) {
        try {
          int var3_int = -14 % ((16 - param2) / 63);
          if (me.field_f != null) {
            me.field_f.g((byte) -75);
          }
          j.field_e = new qi(param0, param1, false, true, true);
          jh.field_C.c((byte) 67, j.field_e);
        } catch (RuntimeException runtimeException) {
          throw la.a((Throwable) ((Object) runtimeException), "vh.G(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final void a(we param0, int param1, int param2, byte param3) {
        try {
          this.field_D = this.field_D + 1;
          if (param3 >= -13) {
            int[] var6 = (int[]) null;
            vh.a((int[]) null, (byte) -48);
          }
          super.a(param0, param1, param2, (byte) -44);
        } catch (RuntimeException runtimeException) {
          throw la.a((Throwable) ((Object) runtimeException), "vh.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static boolean c(byte param0) {
        boolean stackIn_6_0 = false;
        if (param0 >= -23) {
          field_C = (float[]) null;
        }
        stackIn_6_0 = (si.field_o != null) && (null != si.field_o.j(-50));
        return stackIn_6_0;
    }

    final boolean a(we param0, boolean param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param1) {
            return false;
          }
          field_I = -126;
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("vh.AA(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_B = null;
        field_H = null;
        field_F = null;
        field_E = null;
        field_C = null;
        field_K = null;
        if (param0 != -9473) {
          vh.a(-33);
        }
        field_L = null;
    }

    vh(kf param0) {
        try {
          this.field_J = param0;
        } catch (RuntimeException runtimeException) {
          throw la.a((Throwable) ((Object) runtimeException), "vh.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        int var0 = 0;
        field_F = "Fullscreen";
        field_C = new float[65536];
        field_H = new float[65536];
        for (var0 = 0; var0 < 65536; var0++) {
          field_C[var0] = (float)Math.sin(3.141592653589793 * (double)var0 / 32768.0);
          field_H[var0] = (float)Math.cos((double)var0 * 3.141592653589793 / 32768.0);
        }
        field_E = new le[5];
        field_L = "Quit to website";
        field_K = "You need to choose a name before you can log in. This is the name that will be displayed to other players.";
    }
}
