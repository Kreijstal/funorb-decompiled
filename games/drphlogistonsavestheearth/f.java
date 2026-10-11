/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class f extends gi {
    boolean field_l;
    int field_j;
    static String field_m;
    static volatile int field_h;
    int[] field_k;
    static nh[] field_i;

    public static void d(int param0) {
        if (param0 != -1) {
          String var2 = (String) null;
          f.a(11, -55, true, (String) null, (String) null, false);
        }
        field_m = null;
        field_i = null;
    }

    final static int a(int param0, int param1, boolean param2, String param3, String param4, boolean param5) {
        try {
          int stackIn_4_0 = 0;
          int stackIn_31_0 = 0;
          boolean stackIn_43_0 = false;
          boolean stackIn_46_0 = false;
          int stackIn_75_0 = 0;
          int stackIn_85_0 = 0;
          int stackIn_87_0 = 0;
          int stackIn_96_0 = 0;
          int stackIn_98_0 = 0;
          RuntimeException stackIn_101_0 = null;
          StringBuilder stackIn_101_1 = null;
          String stackIn_102_2 = null;
          StringBuilder stackIn_104_1 = null;
          String stackIn_105_2 = null;
          Throwable decompiledCaughtException = null;
          int var6_int = 0;
          RuntimeException var6 = null;
          int var7 = 0;
          String var7_ref_String = null;
          int var8 = 0;
          int var9 = 0;
          Throwable var9_ref_Throwable = null;
          int var10 = 0;
          String var11 = null;
          CharSequence var12 = null;
          int var7Lifetime1;
          int var7Lifetime2;
          int var9Lifetime1;
          var10 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
          try {
            if (uj.field_j == null &&
              !ek.a(true, param2)) {
              stackIn_4_0 = -1;
              return stackIn_4_0;
            }
            var6_int = -105 % ((param1 - 4) / 34);
            if (hh.field_b == tl.field_O) {
              if (param2) {
                var11 = (String) null;
                dl.field_H = tc.a(ld.field_b, param3, (String) null, 0, false);
              } else {
                dl.field_H = wi.a(param4, 7957, false, param3);
              }
              nj.field_p.field_j = 0;
              nj.field_p.c(14, (byte) -107);
              nj.field_p.c(dl.field_H.b((byte) -98).field_c, (byte) -115);
              qj.a(-1, 14656);
              tl.field_O = i.field_b;
            }
            if (i.field_b == tl.field_O &&
              jd.a(1, 5929)) {
              var7 = dh.field_N.l(31760);
              if (var7 == 0) {
                tl.field_O = bd.field_T;
              } else {
                t.field_b = var7;
                gf.field_C = -1;
                tl.field_O = tf.field_qb;
              }
              dh.field_N.field_j = 0;
            }
            if (tl.field_O == bd.field_T &&
              jd.a(8, 5929)) {
              s.field_c = dh.field_N.a((byte) -53);
              dh.field_N.field_j = 0;
              le.a(dl.field_H, param5, param0, param2, 16);
              tl.field_O = uf.field_c;
            }
            boolean decompiledFrameRemainder0 = true;
            if (tl.field_O == uf.field_c &&
              jd.a(1, 5929)) {
              var7Lifetime1 = dh.field_N.l(31760);
              dh.field_N.field_j = 0;
              cj.field_i = null;
              t.field_b = var7Lifetime1;
              if (0 != var7Lifetime1 &&
                var7Lifetime1 != 1) {
                if (var7Lifetime1 != 8) {
                  tl.field_O = tf.field_qb;
                  gf.field_C = -1;
                  decompiledFrameRemainder0 = false;
                }
                else {
                  eg.a((byte) 126);
                  dk.field_b = false;
                  stackIn_31_0 = var7Lifetime1;
                  return stackIn_31_0;
                }
              }
              if (decompiledFrameRemainder0) {
                tl.field_O = sg.field_d;
                gf.field_C = -1;
              }
            }
            if (sg.field_d == tl.field_O &&
              li.d(-29427)) {
              ld.field_b = dh.field_N.a((byte) -53);
              nj.field_j = dh.field_N.l(31760);
              dh.field_N.l(31760);
              hb.field_g = dh.field_N.j(-788751192);
              var7_ref_String = dh.field_N.i(715718304);
              var8 = dh.field_N.l(31760);
              if ((1 & var8) != 0) {
                cd.a(4);
              }
              if (!param2) {
                stackIn_43_0 = (0 != (8 & var8));
                fl.field_i = stackIn_43_0;
                stackIn_46_0 = (0 != (var8 & 4));
                ka.field_r = stackIn_46_0;
                if (!fl.field_i) {
                }
              }
              if (wg.field_d) {
                dh.field_N.l(31760);
                dh.field_N.l(31760);
                dh.field_N.h(-108);
                ka.field_n = dh.field_N.j(-788751192);
                cf.field_b = new byte[ka.field_n];
                for (var9 = 0; var9 < ka.field_n; var9++) {
                  cf.field_b[var9] = dh.field_N.n(-82);
                }
              }
              oa.field_d = dh.field_N.b((byte) -64);
              var12 = (CharSequence) ((Object) oa.field_d);
              tf.field_pb = rh.a(117, var12);
              rh.field_a = dh.field_N.l(31760);
              tl.field_O = ik.field_d;
              if (dl.field_H.b((byte) -98) == ll.field_p) {
                p.field_d.a(nb.a(108), (byte) -50);
              } else {
                if (dl.field_H.b((byte) -98) == si.field_A) {
                  ka.field_q.a(nb.a(124), (byte) -50);
                }
              }
              dk.field_b = false;
              if (var7_ref_String != null) {
                aj.a(nb.a(113), 110, var7_ref_String);
              }
              if (hb.field_g <= 0 &&
                !ka.field_r) {
                try {
                  pb.a("unzap", nb.a(-114), true);
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var9_ref_Throwable = decompiledCaughtException;
                }
              } else {
                try {
                  pb.a(nb.a(-128), -11455, new Object[]{lf.a(ld.field_b, (byte) 105)}, "zap");
                } catch (java.lang.Throwable decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  var9_ref_Throwable = decompiledCaughtException;
                }
              }
              if (0 < hb.field_g) {
                bd.field_N = true;
              }
              nj.field_p.a((byte) -101, fb.field_b);
              for (var9Lifetime1 = 0; 4 > var9Lifetime1; var9Lifetime1++) {
                fb.field_b[var9Lifetime1] = fb.field_b[var9Lifetime1] + 50;
              }
              dh.field_N.a((byte) -105, fb.field_b);
              stackIn_75_0 = t.field_b;
              return stackIn_75_0;
            }
            if (tl.field_O == tf.field_qb &&
              li.d(-29427)) {
              eg.a((byte) 126);
              if (t.field_b == 7 &&
                !dk.field_b) {
                dk.field_b = true;
                stackIn_87_0 = -1;
                return stackIn_87_0;
              }
              if (t.field_b == 7) {
                t.field_b = 3;
              }
              cc.field_p = dh.field_N.b((byte) -107);
              dk.field_b = false;
              stackIn_85_0 = t.field_b;
              return stackIn_85_0;
            }
            if (null == uj.field_j) {
              if (dk.field_b) {
                if (30000L < of.a((byte) -96)) {
                  cc.field_p = dg.field_a;
                } else {
                  cc.field_p = lf.field_f;
                }
                dk.field_b = false;
                stackIn_96_0 = 3;
                return stackIn_96_0;
              }
              var7Lifetime2 = ei.field_o;
              ei.field_o = ia.field_c;
              dk.field_b = true;
              ia.field_c = var7Lifetime2;
            }
            stackIn_98_0 = -1;
            return stackIn_98_0;
          } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
            decompiledCaughtException = decompiledCaughtParameter2;
            var6 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_101_0 = var6;
            stackIn_101_1 = new StringBuilder().append("f.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            if (param3 == null) {
              stackIn_102_2 = "null";
            } else {
              stackIn_102_2 = "{...}";
            }
            stackIn_104_1 = ((StringBuilder) (Object) stackIn_101_1).append(stackIn_102_2).append(',');
            if (param4 == null) {
              stackIn_105_2 = "null";
            } else {
              stackIn_105_2 = "{...}";
            }
            throw ie.a((Throwable) ((Object) stackIn_101_0), ((StringBuilder) (Object) stackIn_104_1).append(stackIn_105_2).append(',').append(param5).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    f() {
        this.field_l = false;
    }

    static {
        field_h = 0;
        field_m = "Back";
    }
}
