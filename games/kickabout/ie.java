/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ie extends i {
    static String field_H;
    private int field_I;
    static int field_F;
    static int field_G;

    final static void g(int param0) {
        int fieldTemp$0 = 0;
        int var7 = 0;
        int stackIn_25_0 = 0;
        int stackIn_47_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        nl var4_ref_nl = null;
        int var5_int = 0;
        boolean[] var5 = null;
        int var6 = 0;
        int var8 = 0;
        boolean[] var9 = null;
        boolean[] var10 = null;
        int var3Lifetime1;
        int var4Lifetime1;
        int var4Lifetime2;
        int var4Lifetime3;
        int var4Lifetime4;
        int var5_intLifetime1;
        int var6Lifetime1;
        int var4Lifetime3Lifetime1;
        var8 = Kickabout.field_G;
        try {
          if (null != et.field_d &&
            et.field_d.field_u == 4 &&
            ks.field_e == 14 &&
            0 < je.field_m) {
            fieldTemp$0 = je.field_m - 1;
            je.field_m = je.field_m - 1;
            if (fieldTemp$0 == 0) {
              gm.a(de.field_a, true, (byte) -118);
            }
          }
          if (null == et.field_d) {
            return;
          }
          if (sl.field_Eb) {
            if (bt.b(105)) {
              sl.field_Eb = false;
              et.field_d.field_R[0].field_g = vb.field_d;
              p.a(false);
              mk.b(-1622);
              no.g(99);
            }
          } else {
            if (qt.d(-8)) {
              jw.c(ks.field_e + 1, false);
            }
          }
          var1_int = je.a(false);
          var2 = ob.a(var1_int, -128);
          if (mc.field_a != var2) {
            dd.field_f = 60;
            var3 = -mc.field_a + (mc.field_a + var2 >> 1);
            if (0 == var3) {
              stackIn_25_0 = (mc.field_a < var2) ? 1 : -1;
              var3 = stackIn_25_0;
            }
            var3 = Math.min(Math.max(-30, var3), 30);
            mc.field_a = mc.field_a + var3;
            if (var3 > 0 &&
              mc.field_a > var2 ||
              var3 < 0 &&
              !(var2 <= mc.field_a)) {
              mc.field_a = var2;
            }
          } else {
            if (dd.field_f > 0) {
              dd.field_f = dd.field_f - 1;
            }
          }
          var3Lifetime1 = 640;
          if (ks.field_e == 1 &&
            !sl.field_Eb &&
            (1050 > mh.field_k.a(true) ||
            640 != cq.field_g) ||
            (2 == ks.field_e ||
            ks.field_e == 3)) {
            var3Lifetime1 = 470;
          }
          if (var3Lifetime1 != cq.field_g) {
            var4 = var3Lifetime1 - cq.field_g >> 2;
            if (var4 == 0) {
              stackIn_47_0 = (cq.field_g >= var3Lifetime1) ? -1 : 1;
              var4 = stackIn_47_0;
            }
            cq.field_g = cq.field_g + var4;
          }
          ul.b(11);
          vc.h((byte) 125);
          if (ks.field_e == 6) {
            o.a((byte) -127);
          }
          boolean decompiledFrameRemainder0 = true;
          if (ks.field_e == 7) {
            for (var4Lifetime1 = 1; var4Lifetime1 < 4; var4Lifetime1++) {
              ig.a(true, (byte) 85, var4Lifetime1, 1);
            }
            ig.a(false, (byte) 23, 1, 0);
            var4_ref_nl = et.field_d.field_P[1][4];
            if (0 == et.field_d.field_V.field_m &&
              var4_ref_nl.field_u == 0) {
              var5_int = var4_ref_nl.f(-111) - ld.field_f.f(-124);
              var6 = var4_ref_nl.a(true) - ld.field_f.a(true);
              if (!(var5_int * var5_int + var6 * var6 >= 3600)) {
                var4_ref_nl.b(0, -1);
                var4_ref_nl.field_G = 0;
              }
              decompiledFrameRemainder0 = false;
            }
            else {
              if (1 == et.field_d.field_V.field_m &&
                var4_ref_nl.field_u == 0) {
                tc.a(12, (byte) 109, 11796480, var4_ref_nl, 36044800);
                if (sl.field_Eb &&
                  ld.field_f.field_u == 0) {
                  ld.field_f.field_G = 0;
                  ld.field_f.a(1, 26214);
                }
              }
            }
          }
          if (ks.field_e == 8) {
            if (!sl.field_Eb) {
              et.field_d.field_R[1].field_g = 0;
              var4Lifetime2 = et.field_d.field_V.a(true);
              var5_intLifetime1 = et.field_d.field_V.c(879306160);
              ik.a((byte) -109, var4Lifetime2, 400, var5_intLifetime1, 100, 348, 0, 648);
              ik.a((byte) -107, var4Lifetime2, 810, var5_intLifetime1, 510, 258, 1, 558);
              ik.a((byte) -118, var4Lifetime2, 1200, var5_intLifetime1, 900, 298, 2, 748);
              ik.a((byte) 45, var4Lifetime2, 1200, var5_intLifetime1, 900, 298, 3, 748);
            } else {
              ig.a(false, (byte) 109, 4, 1);
            }
          }
          if (ks.field_e == 9) {
            for (var4Lifetime3 = 1; var4Lifetime3 < 3; var4Lifetime3++) {
              ig.a(true, (byte) 83, var4Lifetime3, 1);
            }
            for (var4Lifetime3Lifetime1 = 3; var4Lifetime3Lifetime1 < 5; var4Lifetime3Lifetime1++) {
              if (!sl.field_Eb &&
                et.field_d.field_P[1][var4Lifetime3Lifetime1].field_u == 0) {
                et.field_d.field_P[1][var4Lifetime3Lifetime1].a(1, 26214);
              }
            }
            df.d(true);
          }
          var4Lifetime4 = -97 / ((param0 - 88) / 34);
          if (ks.field_e == 10) {
            ig.a(false, (byte) 124, 3, 1);
            ig.a(false, (byte) 90, 4, 1);
            ig.a(false, (byte) 52, 3, 0);
          }
          if (ks.field_e == 11) {
            ig.a(false, (byte) 85, 1, 0);
          }
          if (ks.field_e == 12 &&
            et.field_d.field_X.field_m > 25) {
            et.field_d.field_X.field_m = 0;
            if (et.field_d.field_V.e(-1) == 0) {
              jw.c(13, false);
            }
          }
          if (ks.field_e == 13) {
            if (!sl.field_Eb) {
              if (et.field_d.field_X.field_m > 25) {
                et.field_d.field_X.field_m = 0;
                if (et.field_d.field_V.e(44) == 0) {
                  jw.c(14, false);
                }
              }
            } else {
              et.field_d.field_X.field_m = 0;
              if (et.field_d.field_P[1][0].field_w < 0) {
                qg.a(2235, 2949120, 4, 29360128);
              }
              if (et.field_d.field_V.field_m == 0) {
                et.field_d.field_V.field_m = -1;
              }
              et.field_d.field_R[0].field_g = 0;
            }
          }
          if (ks.field_e == 14 &&
            ja.field_O &&
            et.field_d.field_u == 4) {
            ja.field_O = false;
            var10 = tu.field_E.field_J;
            var9 = var10;
            var5 = var9;
            if (!var5[0]) {
              var5[0] = true;
              if (la.a(100)) {
                return;
              }
              var6Lifetime1 = 0;
              for (var7 = 0; var7 < var10.length; var7++) {
                if (var5[var7]) {
                  var6Lifetime1 = var6Lifetime1 | 1 << var7;
                }
              }
              or.field_d.b(69, (byte) 78);
              or.field_d.b(-78, var6Lifetime1);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw nb.a((Throwable) ((Object) var1), "ie.C(" + param0 + ')');
        }
    }

    final void a(int param0, int param1) {
        super.a(97, param1);
        if (param1 == 0) {
          rp.a(65536, this.field_I);
        }
        if (param0 < 60) {
          field_G = 77;
        }
    }

    final static ld a(String param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String[] var3 = null;
        String[] var4 = null;
        int var5 = 0;
        String var6 = null;
        ld var7 = null;
        int var8 = 0;
        ld stackIn_3_0 = null;
        ld stackIn_7_0 = null;
        ld stackIn_10_0 = null;
        ld stackIn_15_0 = null;
        ld stackIn_18_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        var8 = Kickabout.field_G;
        try {
          var2_int = param0.length();
          if (var2_int == 0) {
            stackIn_3_0 = ld.field_b;
            return stackIn_3_0;
          }
          if (var2_int > 255) {
            stackIn_7_0 = st.field_j;
            return stackIn_7_0;
          }
          var3 = wr.a(param0, 2, '.');
          if (var3.length < 2) {
            stackIn_10_0 = ld.field_b;
            return stackIn_10_0;
          }
          var4 = var3;
          var5 = param1;
          while (true) {
            if (var5 >= var4.length) {
              stackIn_18_0 = mr.a(param1 + 6, var3[var3.length - 1]);
              return stackIn_18_0;
            }
            var6 = var4[var5];
            var7 = no.a(var6, param1 ^ 134217728);
            if (var7 == null) {
              var5++;
              continue;
            }
            break;
          }
          stackIn_15_0 = var7;
          return stackIn_15_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_21_0 = var2;
          stackIn_21_1 = new StringBuilder().append("ie.A(");
          if (param0 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void h(int param0) {
        if (param0 != 24342) {
          ie.h(-101);
        }
        field_H = null;
    }

    ie(int param0, up param1) {
        super(34, param1);
        String var6 = null;
        String var4 = null;
        String var5 = null;
        try {
          this.field_I = param0;
          var6 = param1.d(100);
          String var3 = var6;
          var4 = ad.a(dh.a(param1, true), 26300);
          var5 = vo.$cfr$intArgs$a$53ce4ab4c593(-18, gd.field_e[34], new String[]{var6, var4});
          this.a(var5, this.field_t, this.field_D, -71, this.field_u);
        } catch (RuntimeException runtimeException) {
          throw nb.a((Throwable) ((Object) runtimeException), "ie.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_H = "Chat is currently disabled.";
    }
}
