/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oi extends rk {
    pm field_r;
    boolean field_w;
    static String[] field_s;
    static int field_q;
    double field_u;
    double field_p;
    double field_m;
    double field_t;
    double field_o;
    double field_v;
    double field_n;
    double field_x;

    final static int a(boolean param0, boolean param1, String param2, int param3, String param4, byte param5) {
        try {
          int stackIn_6_0 = 0;
          int stackIn_34_0 = 0;
          boolean stackIn_45_0 = false;
          boolean stackIn_48_0 = false;
          int stackIn_76_0 = 0;
          int stackIn_82_0 = 0;
          int stackIn_87_0 = 0;
          int stackIn_95_0 = 0;
          int stackIn_98_0 = 0;
          RuntimeException stackIn_101_0 = null;
          StringBuilder stackIn_101_1 = null;
          String stackIn_102_2 = null;
          StringBuilder stackIn_104_1 = null;
          String stackIn_105_2 = null;
          Throwable decompiledCaughtException = null;
          int var6_int = 0;
          String var6 = null;
          RuntimeException var6_ref = null;
          int var7 = 0;
          int var8 = 0;
          Throwable var8_ref_Throwable = null;
          int var9 = 0;
          String var10 = null;
          CharSequence var11 = null;
          int var6_intLifetime1;
          int var6_intLifetime2;
          int var8Lifetime1;
          var9 = Confined.field_J ? 1 : 0;
          try {
            if (param5 > -68) {
              field_s = (String[]) null;
            }
            if (null == kl.field_G &&
              !mb.a(param0, (byte) 17)) {
              stackIn_6_0 = -1;
              return stackIn_6_0;
            }
            if (si.field_g == lk.field_d) {
              if (param0) {
                var10 = (String) null;
                kg.field_o = g.a(-26547, vb.field_d, false, (String) null, param2);
              } else {
                kg.field_o = sh.a(12831, param4, param2, false);
              }
              vh.field_a.field_n = 0;
              vh.field_a.f(93, 14);
              vh.field_a.f(90, kg.field_o.b((byte) -42).field_c);
              tb.a(-1, 111);
              lk.field_d = oe.field_U;
            }
            if (lk.field_d == oe.field_U &&
              jj.a(1, (byte) 118)) {
              var6_int = e.field_c.c(32);
              if (var6_int == 0) {
                lk.field_d = tb.field_a;
              } else {
                lk.field_d = ga.field_J;
                Confined.field_F = var6_int;
                ai.field_i = -1;
              }
              e.field_c.field_n = 0;
            }
            if (lk.field_d == tb.field_a &&
              jj.a(8, (byte) -120)) {
              uh.field_b = e.field_c.h((byte) -68);
              e.field_c.field_n = 0;
              wb.a(param3, kg.field_o, param0, 25444, param1);
              lk.field_d = rh.field_ab;
            }
            boolean decompiledFrameRemainder0 = true;
            if (lk.field_d == rh.field_ab &&
              jj.a(1, (byte) 8)) {
              var6_intLifetime1 = e.field_c.c(32);
              ag.field_e = null;
              e.field_c.field_n = 0;
              Confined.field_F = var6_intLifetime1;
              if (var6_intLifetime1 != 0 &&
                var6_intLifetime1 != 1) {
                if (var6_intLifetime1 != 8) {
                  lk.field_d = ga.field_J;
                  ai.field_i = -1;
                  decompiledFrameRemainder0 = false;
                }
                else {
                  dc.d(109);
                  sg.field_y = false;
                  stackIn_34_0 = var6_intLifetime1;
                  return stackIn_34_0;
                }
              }
              if (decompiledFrameRemainder0) {
                lk.field_d = fm.field_a;
                ai.field_i = -1;
              }
            }
            if (fm.field_a == lk.field_d &&
              jc.a(-72)) {
              vb.field_d = e.field_c.h((byte) -68);
              e.field_c.c(32);
              e.field_c.c(32);
              sg.field_x = e.field_c.a((byte) 25);
              var6 = e.field_c.e((byte) 102);
              var7 = e.field_c.c(32);
              if (0 != (var7 & 1)) {
                wl.a(1607962024);
              }
              if (!param0) {
                stackIn_45_0 = (0 != (var7 & 8));
                da.field_i = stackIn_45_0;
                stackIn_48_0 = (0 != (4 & var7));
                ul.field_W = stackIn_48_0;
                if (!da.field_i) {
                }
              }
              if (na.field_W) {
                e.field_c.c(32);
                e.field_c.c(32);
                e.field_c.f((byte) 51);
                hd.field_b = e.field_c.a((byte) 25);
                ka.field_F = new byte[hd.field_b];
                for (var8 = 0; var8 < hd.field_b; var8++) {
                  ka.field_F[var8] = e.field_c.b(true);
                }
              }
              qc.field_m = e.field_c.d(true);
              var11 = (CharSequence) ((Object) qc.field_m);
              dc.field_J = hh.a(0, var11);
              field_q = e.field_c.c(32);
              lk.field_d = wd.field_f;
              if (kg.field_o.b((byte) -113) != gh.field_a) {
                if (kg.field_o.b((byte) 126) == vf.field_e) {
                  tj.field_n.a(ii.b(false), (byte) 49);
                }
              } else {
                pi.field_T.a(ii.b(false), (byte) 49);
              }
              sg.field_y = false;
              if (var6 != null) {
                qc.a(var6, ii.b(false), -1);
              }
              if (sg.field_x <= 0 &&
                !ul.field_W) {
                try {
                  kf.a(93, "unzap", ii.b(false));
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var8_ref_Throwable = decompiledCaughtException;
                }
              } else {
                try {
                  kf.a((byte) 53, "zap", ii.b(false), new Object[]{hd.a(vb.field_d, (byte) 62)});
                } catch (java.lang.Throwable decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  var8_ref_Throwable = decompiledCaughtException;
                }
              }
              if (sg.field_x > 0) {
                d.field_d = true;
              }
              vh.field_a.a(ha.field_c, -55);
              for (var8Lifetime1 = 0; 4 > var8Lifetime1; var8Lifetime1++) {
                ha.field_c[var8Lifetime1] = ha.field_c[var8Lifetime1] + 50;
              }
              e.field_c.a(ha.field_c, -121);
              stackIn_76_0 = Confined.field_F;
              return stackIn_76_0;
            }
            if (ga.field_J == lk.field_d &&
              jc.a(-93)) {
              dc.d(113);
              if (Confined.field_F == 7 &&
                !sg.field_y) {
                sg.field_y = true;
                stackIn_82_0 = -1;
                return stackIn_82_0;
              }
              if (7 == Confined.field_F) {
                Confined.field_F = 3;
              }
              gl.field_k = e.field_c.d(true);
              sg.field_y = false;
              stackIn_87_0 = Confined.field_F;
              return stackIn_87_0;
            }
            if (kl.field_G == null) {
              if (sg.field_y) {
                if (30000L < la.h(124)) {
                  gl.field_k = hf.field_S;
                } else {
                  gl.field_k = ka.field_G;
                }
                sg.field_y = false;
                stackIn_95_0 = 3;
                return stackIn_95_0;
              }
              var6_intLifetime2 = nd.field_s;
              nd.field_s = ac.field_b;
              ac.field_b = var6_intLifetime2;
              sg.field_y = true;
            }
            stackIn_98_0 = -1;
            return stackIn_98_0;
          } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
            decompiledCaughtException = decompiledCaughtParameter2;
            var6_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_101_0 = var6_ref;
            stackIn_101_1 = new StringBuilder().append("oi.B(").append(param0).append(',').append(param1).append(',');
            if (param2 == null) {
              stackIn_102_2 = "null";
            } else {
              stackIn_102_2 = "{...}";
            }
            stackIn_104_1 = ((StringBuilder) (Object) stackIn_101_1).append(stackIn_102_2).append(',').append(param3).append(',');
            if (param4 == null) {
              stackIn_105_2 = "null";
            } else {
              stackIn_105_2 = "{...}";
            }
            throw sd.a((Throwable) ((Object) stackIn_101_0), ((StringBuilder) (Object) stackIn_104_1).append(stackIn_105_2).append(',').append(param5).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void b(boolean param0) {
        field_s = null;
        if (param0) {
          oi.b(true);
        }
    }

    oi(pm param0) {
        try {
          this.field_r = param0;
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "oi.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_s = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
    }
}
