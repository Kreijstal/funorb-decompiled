/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ih {
    static String field_b;
    static vh field_e;
    static String[] field_f;
    static int[] field_d;
    static ir field_a;
    static String[] field_c;

    public static void a(int param0) {
        field_f = null;
        field_d = null;
        field_b = null;
        field_e = null;
        if (param0 <= 98) {
          return;
        }
        field_a = null;
        field_c = null;
    }

    final static int a(String param0, byte param1, int param2, boolean param3, ke param4, ke param5, int param6) {
        int var12 = 0;
        int stackIn_4_0 = 0;
        ge stackIn_17_0 = null;
        boolean stackIn_17_1 = false;
        String stackIn_18_2 = null;
        ge stackIn_20_0 = null;
        boolean stackIn_20_1 = false;
        String stackIn_21_2 = null;
        int stackIn_33_0 = 0;
        int stackIn_43_0 = 0;
        int stackIn_53_0 = 0;
        int stackIn_62_0 = 0;
        int stackIn_65_0 = 0;
        RuntimeException stackIn_68_0 = null;
        StringBuilder stackIn_68_1 = null;
        String stackIn_69_2 = null;
        StringBuilder stackIn_71_1 = null;
        String stackIn_72_2 = null;
        StringBuilder stackIn_74_1 = null;
        String stackIn_75_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        String var8 = null;
        int var9 = 0;
        String var9_ref_String = null;
        int var10 = 0;
        String var11_ref_String = null;
        int var11 = 0;
        String var13 = null;
        CharSequence var14 = null;
        int var10Lifetime1;
        int var9Lifetime1;
        int var9Lifetime2;
        int var9Lifetime3;
        try {
          var13 = param4.a((byte) 104);
          var8 = param5.a((byte) 104);
          if (null == jd.field_c &&
            !sa.a((byte) 65, false)) {
            stackIn_4_0 = -1;
            return stackIn_4_0;
          }
          if (no.field_h == tl.field_J) {
            ej.field_j.field_v = 0;
            bq.field_q = null;
            if (param0 == null) {
              bc.field_b.field_v = 0;
              bc.field_b.a(true, lc.field_P.nextInt());
              bc.field_b.a(true, lc.field_P.nextInt());
              stackIn_17_0 = bc.field_b;
              stackIn_17_1 = false;
              if (param4.b(true)) {
                stackIn_18_2 = var13;
              } else {
                stackIn_18_2 = "";
              }
              ((ge) (Object) stackIn_17_0).a(stackIn_17_1, stackIn_18_2);
              stackIn_20_0 = bc.field_b;
              stackIn_20_1 = false;
              if (!param5.b(true)) {
                stackIn_21_2 = "";
              } else {
                stackIn_21_2 = var8;
              }
              ((ge) (Object) stackIn_20_0).a(stackIn_20_1, stackIn_21_2);
              ej.field_j.a(16, false);
              ej.field_j.field_v = ej.field_j.field_v + 1;
              var9 = ej.field_j.field_v;
              ad.a((byte) 93, rb.field_l, bc.field_b, ei.field_q, ej.field_j);
              ej.field_j.b(-var9 + ej.field_j.field_v, true);
            } else {
              var9 = 0;
              if (param3) {
                var9 = var9 | 1;
              }
              bc.field_b.field_v = 0;
              bc.field_b.a(true, lc.field_P.nextInt());
              bc.field_b.a(true, lc.field_P.nextInt());
              bc.field_b.a(false, var13);
              bc.field_b.a(false, var8);
              var14 = (CharSequence) ((Object) param0);
              bc.field_b.a(false, cn.a(-28, var14));
              bc.field_b.a((byte) -81, param2);
              bc.field_b.a(param6, false);
              bc.field_b.a(var9, false);
              ej.field_j.a(18, false);
              ej.field_j.field_v = ej.field_j.field_v + 2;
              var10 = ej.field_j.field_v;
              var11_ref_String = eq.a(hk.d(79), (byte) 112);
              if (var11_ref_String == null) {
                var11_ref_String = "";
              }
              ej.field_j.a(-9946, var11_ref_String);
              ad.a((byte) 93, rb.field_l, bc.field_b, ei.field_q, ej.field_j);
              ej.field_j.c(-var10 + ej.field_j.field_v, (byte) -92);
            }
            de.a(-1, 0);
            tl.field_J = dr.field_a;
          }
          if (tl.field_J == dr.field_a &&
            lq.b((byte) 118, 1)) {
            var9Lifetime1 = kn.field_e.g(-80);
            kn.field_e.field_v = 0;
            if (var9Lifetime1 >= 100 &&
              105 >= var9Lifetime1) {
              bi.field_b = new String[-100 + var9Lifetime1];
              tl.field_J = og.field_L;
            } else {
              if (var9Lifetime1 == 248) {
                cr.a(16, hk.d(71));
                ke.field_g = oe.field_N;
                dn.c(-70);
                we.field_e = false;
                stackIn_33_0 = var9Lifetime1;
                return stackIn_33_0;
              }
              if (99 == var9Lifetime1) {
                lq.b((byte) 63, ld.a(0));
                bq.field_q = new Boolean(de.a((byte) 104, kn.field_e));
                kn.field_e.field_v = 0;
              } else {
                tl.field_J = eh.field_l;
                uq.field_c = var9Lifetime1;
                of.field_Pb = -1;
              }
            }
          }
          if (tl.field_J == og.field_L) {
            var9Lifetime2 = 2;
            if (lq.b((byte) 44, var9Lifetime2)) {
              var10Lifetime1 = kn.field_e.d(-1034);
              kn.field_e.field_v = 0;
              if (lq.b((byte) 49, var10Lifetime1)) {
                var11 = bi.field_b.length;
                for (var12 = 0; var11 > var12; var12++) {
                  bi.field_b[var12] = kn.field_e.a(10762);
                }
                dn.c(53);
                we.field_e = false;
                stackIn_43_0 = var11 + 100;
                return stackIn_43_0;
              }
            }
          }
          if (tl.field_J == eh.field_l &&
            wf.a((byte) 39)) {
            if (uq.field_c != 255) {
              ke.field_g = kn.field_e.j(-122);
            } else {
              var9_ref_String = kn.field_e.m(110);
              if (var9_ref_String != null) {
                fg.a(hk.d(86), -128, var9_ref_String);
              }
            }
            dn.c(55);
            we.field_e = false;
            stackIn_53_0 = uq.field_c;
            return stackIn_53_0;
          }
          if (param1 <= 38) {
            ih.a(-57);
          }
          if (null == jd.field_c) {
            if (we.field_e) {
              if (bf.d((byte) 123) <= 30000L) {
                ke.field_g = er.field_Q;
              } else {
                ke.field_g = wd.field_Rb;
              }
              we.field_e = false;
              stackIn_62_0 = 249;
              return stackIn_62_0;
            }
            var9Lifetime3 = vj.field_d;
            vj.field_d = cq.field_a;
            we.field_e = true;
            cq.field_a = var9Lifetime3;
          }
          stackIn_65_0 = -1;
          return stackIn_65_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_68_0 = var7;
          stackIn_68_1 = new StringBuilder().append("ih.B(");
          if (param0 == null) {
            stackIn_69_2 = "null";
          } else {
            stackIn_69_2 = "{...}";
          }
          stackIn_71_1 = ((StringBuilder) (Object) stackIn_68_1).append(stackIn_69_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_72_2 = "null";
          } else {
            stackIn_72_2 = "{...}";
          }
          stackIn_74_1 = ((StringBuilder) (Object) stackIn_71_1).append(stackIn_72_2).append(',');
          if (param5 == null) {
            stackIn_75_2 = "null";
          } else {
            stackIn_75_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_68_0), ((StringBuilder) (Object) stackIn_74_1).append(stackIn_75_2).append(',').append(param6).append(')').toString());
        }
    }

    final static void a(byte param0) {
        hm var1 = new hm();
        var1.a(86, 0, 0, 65536, 64);
        if (param0 != 46) {
          ke var2 = (ke) null;
          ih.a((String) null, (byte) -72, 28, true, (ke) null, (ke) null, 104);
        }
        var1.b(true);
        jc.field_e.a(param0 ^ 45, var1);
    }

    static {
        field_b = "Unfortunately your configuration doesn't support fullscreen mode.";
        field_f = new String[]{"All scores", "My scores", "Best each"};
        field_c = new String[16];
    }
}
