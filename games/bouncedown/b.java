/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class b {
    static int field_a;
    static uf field_b;
    static String field_c;

    final static int a(byte param0, int param1, String param2, String param3, boolean param4, boolean param5) {
        try {
          int stackIn_4_0 = 0;
          int stackIn_29_0 = 0;
          boolean stackIn_43_0 = false;
          boolean stackIn_46_0 = false;
          int stackIn_74_0 = 0;
          int stackIn_81_0 = 0;
          int stackIn_86_0 = 0;
          int stackIn_96_0 = 0;
          int stackIn_99_0 = 0;
          RuntimeException stackIn_102_0 = null;
          StringBuilder stackIn_102_1 = null;
          String stackIn_103_2 = null;
          StringBuilder stackIn_105_1 = null;
          String stackIn_106_2 = null;
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
          var9 = Bounce.field_N;
          try {
            if (null == dh.field_a &&
              !ok.a(param5, 118)) {
              stackIn_4_0 = -1;
              return stackIn_4_0;
            }
            if (ga.field_c == pj.field_a) {
              if (param5) {
                var10 = (String) null;
                bj.field_E = ck.a(param3, (String) null, l.field_b, 107, false);
              } else {
                bj.field_E = jl.a(param3, false, param0 + 7154, param2);
              }
              hh.field_p.field_h = 0;
              hh.field_p.a(14, (byte) 121);
              hh.field_p.a(bj.field_E.b((byte) -101).field_a, (byte) 64);
              jj.a(-1, true);
              pj.field_a = qb.field_h;
            }
            if (qb.field_h == pj.field_a &&
              qb.a(1, 3)) {
              var6_int = jc.field_g.d((byte) -103);
              if (var6_int == 0) {
                pj.field_a = qf.field_a;
              } else {
                pe.field_d = -1;
                wa.field_d = var6_int;
                pj.field_a = eg.field_q;
              }
              jc.field_g.field_h = 0;
            }
            if (pj.field_a == qf.field_a &&
              qb.a(8, 3)) {
              qa.field_i = jc.field_g.f((byte) -121);
              jc.field_g.field_h = 0;
              vf.a(param1, bj.field_E, param5, param4, -93);
              pj.field_a = ae.field_g;
            }
            boolean decompiledFrameRemainder0 = true;
            if (ae.field_g == pj.field_a &&
              qb.a(1, 3)) {
              var6_intLifetime1 = jc.field_g.d((byte) -75);
              mc.field_d = null;
              jc.field_g.field_h = 0;
              wa.field_d = var6_intLifetime1;
              if (var6_intLifetime1 != 0 &&
                1 != var6_intLifetime1) {
                if (var6_intLifetime1 != 8) {
                  pe.field_d = -1;
                  pj.field_a = eg.field_q;
                  decompiledFrameRemainder0 = false;
                }
                else {
                  kc.a((byte) 18);
                  fa.field_a = false;
                  stackIn_29_0 = var6_intLifetime1;
                  return stackIn_29_0;
                }
              }
              if (decompiledFrameRemainder0) {
                pj.field_a = dg.field_e;
                pe.field_d = -1;
              }
            }
            if (dg.field_e == pj.field_a &&
              va.b(1)) {
              l.field_b = jc.field_g.f((byte) -121);
              hi.field_c = jc.field_g.d((byte) -75);
              jc.field_g.d((byte) -118);
              ui.field_m = jc.field_g.a(-1640531527);
              var11 = jc.field_g.g((byte) -95);
              var7 = jc.field_g.d((byte) -110);
              if ((1 & var7) != 0) {
                qc.a(-17184);
              }
              if (!param5) {
                stackIn_43_0 = ((var7 & 8) != 0);
                hf.field_b = stackIn_43_0;
                stackIn_46_0 = ((4 & var7) != 0);
                vk.field_a = stackIn_46_0;
                if (!hf.field_b) {
                }
              }
              if (tc.field_t) {
                jc.field_g.d((byte) -122);
                jc.field_g.d((byte) -108);
                jc.field_g.j(-3);
                ok.field_a = jc.field_g.a(-1640531527);
                hh.field_q = new byte[ok.field_a];
                for (var8 = 0; ok.field_a > var8; var8++) {
                  hh.field_q[var8] = jc.field_g.k(96);
                }
              }
              ja.field_b = jc.field_g.b(true);
              var12 = (CharSequence) ((Object) ja.field_b);
              qe.field_e = ce.a(var12, 0);
              nb.field_d = jc.field_g.d((byte) -94);
              pj.field_a = field_b;
              if (bj.field_E.b((byte) -124) != jf.field_h) {
                if (bj.field_E.b((byte) -113) == pg.field_b) {
                  w.field_g.a(1, vi.b(0));
                }
              } else {
                nj.field_k.a(1, vi.b(0));
              }
              fa.field_a = false;
              if (var11 != null) {
                jd.a(0, vi.b(0), var11);
              }
              if (0 >= ui.field_m &&
                !vk.field_a) {
                try {
                  ac.a(vi.b(0), "unzap", -31185);
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var8_ref_Throwable = decompiledCaughtException;
                }
              } else {
                try {
                  ac.a(true, new Object[]{pa.a(l.field_b, 7)}, vi.b(0), "zap");
                } catch (java.lang.Throwable decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  var8_ref_Throwable = decompiledCaughtException;
                }
              }
              if (ui.field_m > 0) {
                ba.field_B = true;
              }
              hh.field_p.b(tc.field_r, 126);
              for (var8Lifetime1 = 0; var8Lifetime1 < 4; var8Lifetime1++) {
                tc.field_r[var8Lifetime1] = tc.field_r[var8Lifetime1] + 50;
              }
              jc.field_g.b(tc.field_r, 98);
              stackIn_74_0 = wa.field_d;
              return stackIn_74_0;
            }
            if (eg.field_q == pj.field_a &&
              va.b(1)) {
              kc.a((byte) 18);
              if (wa.field_d == 7 &&
                !fa.field_a) {
                fa.field_a = true;
                stackIn_81_0 = -1;
                return stackIn_81_0;
              }
              if (wa.field_d == 7) {
                wa.field_d = 3;
              }
              ib.field_o = jc.field_g.b(true);
              fa.field_a = false;
              stackIn_86_0 = wa.field_d;
              return stackIn_86_0;
            }
            if (param0 != -37) {
              field_c = (String) null;
            }
            if (null == dh.field_a) {
              if (fa.field_a) {
                if (ph.a((byte) -110) > 30000L) {
                  ib.field_o = jh.field_t;
                } else {
                  ib.field_o = dg.field_k;
                }
                fa.field_a = false;
                stackIn_96_0 = 3;
                return stackIn_96_0;
              }
              var6_intLifetime2 = td.field_b;
              td.field_b = wa.field_b;
              wa.field_b = var6_intLifetime2;
              fa.field_a = true;
            }
            stackIn_99_0 = -1;
            return stackIn_99_0;
          } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
            decompiledCaughtException = decompiledCaughtParameter2;
            var6 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_102_0 = var6;
            stackIn_102_1 = new StringBuilder().append("b.A(").append(param0).append(',').append(param1).append(',');
            if (param2 == null) {
              stackIn_103_2 = "null";
            } else {
              stackIn_103_2 = "{...}";
            }
            stackIn_105_1 = ((StringBuilder) (Object) stackIn_102_1).append(stackIn_103_2).append(',');
            if (param3 == null) {
              stackIn_106_2 = "null";
            } else {
              stackIn_106_2 = "{...}";
            }
            throw ii.a((Throwable) ((Object) stackIn_102_0), ((StringBuilder) (Object) stackIn_105_1).append(stackIn_106_2).append(',').append(param4).append(',').append(param5).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(int param0) {
        field_b = null;
        field_c = null;
        if (param0 < 17) {
          field_a = 12;
        }
    }

    static {
        field_b = new uf();
        field_c = "Not yet achieved";
    }
}
