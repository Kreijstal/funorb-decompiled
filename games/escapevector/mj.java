/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mj {
    static ed field_b;
    static String field_a;
    static int field_d;
    static String field_c;
    static ed field_f;
    static String[] field_e;

    final static int a(int param0, int param1, String param2, String param3, boolean param4, boolean param5) {
        try {
          int stackIn_5_0 = 0;
          int stackIn_8_0 = 0;
          int stackIn_36_0 = 0;
          boolean stackIn_48_0 = false;
          boolean stackIn_51_0 = false;
          int stackIn_81_0 = 0;
          int stackIn_88_0 = 0;
          int stackIn_93_0 = 0;
          int stackIn_102_0 = 0;
          int stackIn_104_0 = 0;
          RuntimeException stackIn_107_0 = null;
          StringBuilder stackIn_107_1 = null;
          String stackIn_108_2 = null;
          StringBuilder stackIn_110_1 = null;
          String stackIn_111_2 = null;
          Throwable decompiledCaughtException = null;
          int var6_int = 0;
          String var6 = null;
          RuntimeException var6_ref = null;
          int var7 = 0;
          int var8 = 0;
          Throwable var8_ref_Throwable = null;
          int var9 = 0;
          CharSequence var11 = null;
          int var6_intLifetime1;
          int var6_intLifetime2;
          int var8Lifetime1;
          var9 = EscapeVector.field_A;
          try {
            if (null == pg.field_c &&
              !sl.a(param4, (byte) 0)) {
              stackIn_5_0 = -1;
              return stackIn_5_0;
            }
            if (param0 != 1) {
              stackIn_8_0 = 2;
              return stackIn_8_0;
            }
            if (sf.field_d == al.field_d) {
              if (!param4) {
                f.field_m = bo.a(param3, false, 24564, param2);
              } else {
                f.field_m = ei.a(param0 - 1, false, mg.field_d, (String) null, param2);
              }
              om.field_c.field_m = 0;
              om.field_c.f(14, -123);
              om.field_c.f(f.field_m.a((byte) 32).field_d, -123);
              rn.a(-1, 30785);
              al.field_d = tc.field_p;
            }
            if (al.field_d == tc.field_p &&
              bo.a(30000, 1)) {
              var6_int = om.field_g.e(0);
              om.field_g.field_m = 0;
              if (0 == var6_int) {
                al.field_d = ha.field_c;
              } else {
                al.field_d = hn.field_q;
                cd.field_v = var6_int;
                hi.field_r = -1;
              }
            }
            if (al.field_d == ha.field_c &&
              bo.a(30000, 8)) {
              va.field_b = om.field_g.i(param0 - 800509814);
              om.field_g.field_m = 0;
              oh.a(f.field_m, param4, param1, param5, (byte) -99);
              al.field_d = mc.field_b;
            }
            boolean decompiledFrameRemainder0 = true;
            if (mc.field_b == al.field_d &&
              bo.a(30000, 1)) {
              var6_intLifetime1 = om.field_g.e(0);
              cd.field_v = var6_intLifetime1;
              p.field_i = null;
              om.field_g.field_m = 0;
              if (0 != var6_intLifetime1 &&
                var6_intLifetime1 != 1) {
                if (8 != var6_intLifetime1) {
                  al.field_d = hn.field_q;
                  hi.field_r = -1;
                  decompiledFrameRemainder0 = false;
                }
                else {
                  nm.a(16);
                  e.field_c = false;
                  stackIn_36_0 = var6_intLifetime1;
                  return stackIn_36_0;
                }
              }
              if (decompiledFrameRemainder0) {
                al.field_d = rn.field_c;
                hi.field_r = -1;
              }
            }
            if (al.field_d == rn.field_c &&
              ll.d(param0 + 10549)) {
              mg.field_d = om.field_g.i(-800509813);
              mg.field_b = om.field_g.e(0);
              om.field_g.e(0);
              s.field_x = om.field_g.f(1952);
              var6 = om.field_g.d(-15208);
              var7 = om.field_g.e(0);
              if ((1 & var7) != 0) {
                lm.a((byte) -63);
              }
              if (!param4) {
                stackIn_48_0 = ((8 & var7) != 0);
                dl.field_a = stackIn_48_0;
                stackIn_51_0 = ((4 & var7) != 0);
                ff.field_g = stackIn_51_0;
                if (dl.field_a) {
                }
              }
              if (jc.field_b) {
                om.field_g.e(param0 ^ 1);
                om.field_g.e(0);
                om.field_g.g(param0 - 5054);
                kb.field_e = om.field_g.f(1952);
                lf.field_K = new byte[kb.field_e];
                for (var8 = 0; var8 < kb.field_e; var8++) {
                  lf.field_K[var8] = om.field_g.a(false);
                }
              }
              ck.field_r = om.field_g.c(false);
              var11 = (CharSequence) ((Object) ck.field_r);
              cc.field_k = sf.a(-83, var11);
              am.field_g = om.field_g.e(param0 - 1);
              al.field_d = ck.field_t;
              if (f.field_m.a((byte) 32) == md.field_E) {
                kf.field_q.a(27002, oc.d((byte) -114));
              } else {
                if (f.field_m.a((byte) 32) == ja.field_a) {
                  oh.field_n.a(27002, oc.d((byte) -71));
                }
              }
              e.field_c = false;
              if (var6 != null) {
                ag.a(var6, (byte) 30, oc.d((byte) -119));
              }
              if (s.field_x <= 0 &&
                !ff.field_g) {
                try {
                  sd.a(oc.d((byte) -107), "unzap", param0 - 29156);
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var8_ref_Throwable = decompiledCaughtException;
                }
              } else {
                try {
                  sd.a((byte) 116, oc.d((byte) -128), new Object[]{jb.a(mg.field_d, (byte) 29)}, "zap");
                } catch (java.lang.Throwable decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  var8_ref_Throwable = decompiledCaughtException;
                }
              }
              if (s.field_x > 0) {
                ej.field_d = true;
              }
              om.field_c.a(rh.field_O, (byte) 107);
              for (var8Lifetime1 = 0; var8Lifetime1 < 4; var8Lifetime1++) {
                rh.field_O[var8Lifetime1] = rh.field_O[var8Lifetime1] + 50;
              }
              om.field_g.a(rh.field_O, (byte) 85);
              stackIn_81_0 = cd.field_v;
              return stackIn_81_0;
            }
            if (hn.field_q == al.field_d &&
              ll.d(param0 + 10549)) {
              nm.a(16);
              if (cd.field_v == 7 &&
                !e.field_c) {
                e.field_c = true;
                stackIn_88_0 = -1;
                return stackIn_88_0;
              }
              if (cd.field_v == 7) {
                cd.field_v = 3;
              }
              ca.field_a = om.field_g.c(false);
              e.field_c = false;
              stackIn_93_0 = cd.field_v;
              return stackIn_93_0;
            }
            if (null == pg.field_c) {
              if (e.field_c) {
                if (un.e(64655) > 30000L) {
                  ca.field_a = fl.field_l;
                } else {
                  ca.field_a = wk.field_a;
                }
                e.field_c = false;
                stackIn_102_0 = 3;
                return stackIn_102_0;
              }
              var6_intLifetime2 = ej.field_b;
              ej.field_b = sj.field_i;
              e.field_c = true;
              sj.field_i = var6_intLifetime2;
            }
            stackIn_104_0 = -1;
            return stackIn_104_0;
          } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
            decompiledCaughtException = decompiledCaughtParameter2;
            var6_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_107_0 = var6_ref;
            stackIn_107_1 = new StringBuilder().append("mj.B(").append(param0).append(',').append(param1).append(',');
            if (param2 == null) {
              stackIn_108_2 = "null";
            } else {
              stackIn_108_2 = "{...}";
            }
            stackIn_110_1 = ((StringBuilder) (Object) stackIn_107_1).append(stackIn_108_2).append(',');
            if (param3 == null) {
              stackIn_111_2 = "null";
            } else {
              stackIn_111_2 = "{...}";
            }
            throw t.a((Throwable) ((Object) stackIn_107_0), ((StringBuilder) (Object) stackIn_110_1).append(stackIn_111_2).append(',').append(param4).append(',').append(param5).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(boolean param0) {
        field_a = null;
        field_b = null;
        field_f = null;
        if (!param0) {
          field_e = (String[]) null;
        }
        field_e = null;
        field_c = null;
    }

    final static mf a(int param0, int param1) {
        if (param1 >= -122) {
          mj.a((byte) 58);
        }
        return ji.a(false, param0, false, 1, true, (byte) 114);
    }

    final static boolean a(byte param0) {
        if (param0 < 54) {
          String var2 = (String) null;
          mj.a(100, -96, (String) null, (String) null, false, true);
        }
        return tb.field_D;
    }

    static {
        field_b = new ed(320, 24);
        field_a = "Unfortunately you are not eligible to create an account.";
        field_c = " - thrust";
    }
}
