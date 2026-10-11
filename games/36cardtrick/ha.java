/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ha {
    int field_b;
    static bk field_d;
    private static cc field_a;
    static String field_c;

    final static String a(CharSequence param0, int param1, boolean param2) {
        String var3 = null;
        int var4 = 0;
        int var5 = 0;
        CharSequence var6 = null;
        String stackIn_3_0 = null;
        String stackIn_11_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var5 = Main.field_T;
        try {
          var3 = jl.a(false, param0, param2);
          if (var3 != null) {
            stackIn_3_0 = var3;
            return stackIn_3_0;
          }
          if (param1 != -30773) {
            var6 = (CharSequence) null;
            ha.a((CharSequence) null, 19, false);
          }
          var4 = 0;
          while (true) {
            if (var4 >= param0.length()) {
              return null;
            }
            if (fd.a(true, param0.charAt(var4))) {
              var4++;
              continue;
            }
            break;
          }
          stackIn_11_0 = nf.field_a;
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_16_0 = var3_ref;
          stackIn_16_1 = new StringBuilder().append("ha.C(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final static int a(boolean param0, String param1, int param2, boolean param3, int param4, String param5) {
        try {
          int stackIn_6_0 = 0;
          int stackIn_29_0 = 0;
          boolean stackIn_43_0 = false;
          boolean stackIn_46_0 = false;
          int stackIn_73_0 = 0;
          int stackIn_79_0 = 0;
          int stackIn_84_0 = 0;
          int stackIn_95_0 = 0;
          int stackIn_97_0 = 0;
          RuntimeException stackIn_100_0 = null;
          StringBuilder stackIn_100_1 = null;
          String stackIn_101_2 = null;
          StringBuilder stackIn_103_1 = null;
          String stackIn_104_2 = null;
          Throwable decompiledCaughtException = null;
          int var6_int = 0;
          RuntimeException var6 = null;
          int var7 = 0;
          int var8 = 0;
          Throwable var8_ref_Throwable = null;
          int var9 = 0;
          String var10 = null;
          String var11 = null;
          CharSequence var12 = null;
          int var6_intLifetime1;
          int var6_intLifetime2;
          int var8Lifetime1;
          var9 = Main.field_T;
          try {
            if (null == cb.field_j &&
              !md.a(113, param3)) {
              stackIn_6_0 = -1;
              return stackIn_6_0;
            }
            if (vf.field_a == ra.field_b) {
              if (param3) {
                var10 = (String) null;
                sh.field_k = nk.a(-108, false, cd.field_a, (String) null, param1);
              } else {
                sh.field_k = tb.a(param1, param5, (byte) -18, false);
              }
              na.field_r.field_i = 0;
              na.field_r.b(-9469, 14);
              na.field_r.b(-9469, sh.field_k.a((byte) -24).field_b);
              fe.a((byte) -118, -1);
              ra.field_b = vd.field_q;
            }
            if (ra.field_b == vd.field_q &&
              r.a(1, (byte) 122)) {
              var6_int = rd.field_j.f(94);
              if (var6_int == 0) {
                ra.field_b = ab.field_w;
              } else {
                ra.field_b = field_a;
                al.field_a = -1;
                pd.field_l = var6_int;
              }
              rd.field_j.field_i = 0;
            }
            if (ab.field_w == ra.field_b &&
              r.a(8, (byte) 127)) {
              hb.field_b = rd.field_j.d(true);
              rd.field_j.field_i = 0;
              jc.a(param4, (byte) -111, param3, sh.field_k, param0);
              ra.field_b = rk.field_eb;
            }
            boolean decompiledFrameRemainder0 = true;
            if (rk.field_eb == ra.field_b &&
              r.a(1, (byte) 121)) {
              var6_intLifetime1 = rd.field_j.f(34);
              pd.field_l = var6_intLifetime1;
              ia.field_b = null;
              rd.field_j.field_i = 0;
              if (0 != var6_intLifetime1 &&
                1 != var6_intLifetime1) {
                if (var6_intLifetime1 != 8) {
                  al.field_a = -1;
                  ra.field_b = field_a;
                  decompiledFrameRemainder0 = false;
                }
                else {
                  mc.a((byte) -126);
                  lk.field_w = false;
                  stackIn_29_0 = var6_intLifetime1;
                  return stackIn_29_0;
                }
              }
              if (decompiledFrameRemainder0) {
                al.field_a = -1;
                ra.field_b = vg.field_a;
              }
            }
            if (ra.field_b == vg.field_a &&
              gl.a(false)) {
              cd.field_a = rd.field_j.d(true);
              ec.field_f = rd.field_j.f(-109);
              rd.field_j.f(-103);
              d.field_c = rd.field_j.d((byte) 72);
              var11 = rd.field_j.f((byte) 29);
              var7 = rd.field_j.f(113);
              if (0 != (var7 & 1)) {
                bd.d((byte) -86);
              }
              if (!param3) {
                stackIn_43_0 = ((var7 & 4) != 0);
                bi.field_c = stackIn_43_0;
                stackIn_46_0 = ((8 & var7) != 0);
                da.field_b = stackIn_46_0;
                if (da.field_b) {
                }
              }
              if (bj.field_m) {
                rd.field_j.f(124);
                rd.field_j.f(101);
                rd.field_j.e((byte) 125);
                pb.field_j = rd.field_j.d((byte) 72);
                fb.field_d = new byte[pb.field_j];
                for (var8 = 0; var8 < pb.field_j; var8++) {
                  fb.field_d[var8] = rd.field_j.a(true);
                }
              }
              ri.field_c = rd.field_j.c(false);
              var12 = (CharSequence) ((Object) ri.field_c);
              aa.field_fb = ff.a((byte) 116, var12);
              qb.field_b = rd.field_j.f(-117);
              ra.field_b = ad.field_q;
              if (sh.field_k.a((byte) -24) != tf.field_o) {
                if (sh.field_k.a((byte) -24) == hc.field_h) {
                  oj.field_e.a(mk.g(-120), 0);
                }
              } else {
                ke.field_c.a(mk.g(-125), 0);
              }
              lk.field_w = false;
              if (var11 != null) {
                lk.a(mk.g(-128), 0, var11);
              }
              if (d.field_c <= 0 &&
                !bi.field_c) {
                try {
                  vh.a("unzap", -12151, mk.g(-125));
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var8_ref_Throwable = decompiledCaughtException;
                }
              } else {
                try {
                  vh.a(new Object[]{eh.a(0, cd.field_a)}, "zap", (byte) 111, mk.g(-125));
                } catch (java.lang.Throwable decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  var8_ref_Throwable = decompiledCaughtException;
                }
              }
              if (d.field_c > 0) {
                dg.field_F = true;
              }
              na.field_r.b(kb.field_e, 8);
              for (var8Lifetime1 = 0; var8Lifetime1 < 4; var8Lifetime1++) {
                kb.field_e[var8Lifetime1] = kb.field_e[var8Lifetime1] + 50;
              }
              rd.field_j.b(kb.field_e, 8);
              stackIn_73_0 = pd.field_l;
              return stackIn_73_0;
            }
            if (field_a == ra.field_b &&
              gl.a(false)) {
              mc.a((byte) -125);
              if (7 == pd.field_l &&
                !lk.field_w) {
                lk.field_w = true;
                stackIn_79_0 = -1;
                return stackIn_79_0;
              }
              if (pd.field_l == 7) {
                pd.field_l = 3;
              }
              e.field_a = rd.field_j.c(false);
              lk.field_w = false;
              stackIn_84_0 = pd.field_l;
              return stackIn_84_0;
            }
            if (param2 < 7) {
              ha.a(-3);
            }
            if (cb.field_j == null) {
              if (lk.field_w) {
                if (we.a((byte) 79) > 30000L) {
                  e.field_a = jf.field_k;
                } else {
                  e.field_a = e.field_f;
                }
                lk.field_w = false;
                stackIn_95_0 = 3;
                return stackIn_95_0;
              }
              var6_intLifetime2 = ag.field_e;
              ag.field_e = hj.field_l;
              lk.field_w = true;
              hj.field_l = var6_intLifetime2;
            }
            stackIn_97_0 = -1;
            return stackIn_97_0;
          } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
            decompiledCaughtException = decompiledCaughtParameter2;
            var6 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_100_0 = var6;
            stackIn_100_1 = new StringBuilder().append("ha.B(").append(param0).append(',');
            if (param1 == null) {
              stackIn_101_2 = "null";
            } else {
              stackIn_101_2 = "{...}";
            }
            stackIn_103_1 = ((StringBuilder) (Object) stackIn_100_1).append(stackIn_101_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
            if (param5 == null) {
              stackIn_104_2 = "null";
            } else {
              stackIn_104_2 = "{...}";
            }
            throw ma.a((Throwable) ((Object) stackIn_100_0), ((StringBuilder) (Object) stackIn_103_1).append(stackIn_104_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(int param0) {
        if (param0 >= -98) {
          field_c = (String) null;
        }
        field_a = null;
        field_d = null;
        field_c = null;
    }

    static {
        field_d = new bk();
        field_a = new cc();
        field_c = "Please check if address is correct";
    }
}
