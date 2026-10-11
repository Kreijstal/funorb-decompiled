/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qa extends dj {
    static hd field_E;
    static hd field_H;
    static String field_F;
    static String field_G;

    final static int a(tv param0, int param1) {
        int var2_int = 0;
        int var3 = 0;
        int stackIn_17_0 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var2_intLifetime1;
        var3 = Kickabout.field_G;
        try {
          if (param1 != 31100) {
            field_G = (String) null;
          }
          var2_int = ag.field_e;
          if (param0.field_c == 2) {
            if (param0.field_m) {
              var2_intLifetime1 = ag.field_e;
            } else {
              if (param0.field_j == 0 &&
                param0.field_p == 0) {
                var2_intLifetime1 = sg.field_c[param0.field_c];
              } else {
                var2_intLifetime1 = sb.field_h[param0.field_c];
              }
            }
          } else {
            if (4 == param0.field_c) {
              var2_intLifetime1 = sb.field_h[param0.field_c];
            } else {
              if (param0.field_d == dd.field_c) {
                var2_intLifetime1 = sg.field_c[param0.field_c];
              } else {
                var2_intLifetime1 = sb.field_h[param0.field_c];
              }
            }
          }
          stackIn_17_0 = var2_intLifetime1;
          return stackIn_17_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_20_0 = var2;
          stackIn_20_1 = new StringBuilder().append("qa.I(");
          if (param0 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param1).append(')').toString());
        }
    }

    qa() {
    }

    public static void g(int param0) {
        field_E = null;
        field_F = null;
        field_H = null;
        if (param0 != 60) {
          qa.h(-115);
        }
        field_G = null;
    }

    final static wc h(int param0) {
        if (param0 >= -58) {
          field_E = (hd) null;
        }
        if (wb.field_p == null) {
          wb.field_p = new wc();
          wb.field_p.a(gf.field_a, 3422);
          wb.field_p.field_a = qo.field_k;
          wb.field_p.field_m = 0;
          wb.field_p.field_p = 4;
          wb.field_p.field_d = 5;
          wb.field_p.field_i = 6;
          wb.field_p.field_j = 7697781;
          wb.field_p.field_t = 2763306;
          wb.field_p.field_f = 14;
        }
        return wb.field_p;
    }

    final void a(int param0, boolean param1) {
        int stackIn_15_0 = 0;
        int stackIn_18_0 = 0;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        String var8;
        int var9;
        int var10;
        int var11;
        int var3Lifetime1;
        int var4Lifetime1;
        int var4Lifetime2;
        int var4Lifetime1Lifetime1;
        var10 = Kickabout.field_G;
        super.a(param0, param1);
        if (0 == this.field_C) {
          ms.a(cd.field_b, 40 + this.field_j, 280, true, 0, 263);
          on.a(350 + this.field_j, 144, 226, 232, 10, 65793, 140);
          un.field_d.a(ic.field_b.toLowerCase(), 370 + this.field_j, 172, 16777215, -1);
          var3 = this.field_j + 370;
          on.a(var3, 186, 184, 174, 16777215, 30);
          on.h(var3 - 1, 185, 186, 176, 16777215, 128);
          for (var4 = 0; var4 < 6; var4++) {
            pb.field_C.c(q.field_h[var4 + 1], 120 + var3, 180 + (var4 + 1) * 28, 16777215, -1);
            pb.field_C.a(Integer.toString(ps.field_d[1 + var4]), 134 + var3, var4 * 28 + 28 + 180, 16777215, -1);
          }
          on.f(var3 + 127, 186, 174, 16777215, 128);
          for (var4Lifetime2 = 0; var4Lifetime2 < 5; var4Lifetime2++) {
            on.c(var3 + 4, 187 + 28 * var4Lifetime2 + 28, 174, 16777215, 30);
          }
          lo.a(206, this.field_j + 180, 100);
        }
        if (this.field_C == 1) {
          var11 = 0;
          var3Lifetime1 = var11;
          for (var4Lifetime1 = 0; 2 > var4Lifetime1; var4Lifetime1++) {
            stackIn_15_0 = (1 == var4Lifetime1) ? 1 : 0;
            var5 = stackIn_15_0;
            stackIn_18_0 = (var5 == 0) ? 50 : 345;
            var6 = stackIn_18_0;
            var6 = var6 + this.field_j;
            var7 = 146;
            on.a(var6 - 10, 126, 265, 270, 10, 65793, 140);
            if (var4Lifetime1 == 0) {
              var7 += 60;
            }
            while (var11 < tm.field_q.length) {
              var8 = tm.field_q[var11];
              var9 = pb.field_C.c(var8, 245, 16);
              if (var7 + var9 <= 396) {
                var11++;
                var7 = var7 + (16 * pb.field_C.a(var8, var6, var7, 245, 999, 16777215, -1, 0, 0, 16) + 25);
                continue;
              }
              break;
            }
          }
          for (var4Lifetime1Lifetime1 = 0; kb.field_E.length > var4Lifetime1Lifetime1; var4Lifetime1Lifetime1++) {
            kb.field_E[var4Lifetime1Lifetime1].d(30 * var4Lifetime1Lifetime1 + this.field_j + 50, 150);
          }
        }
    }

    final static void i(int param0) {
        int var1_int = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        gm var2_ref_gm = null;
        Object var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var5Lifetime1;
        var9 = Kickabout.field_G;
        try {
          for (var1_int = 0; var1_int < mn.field_b.length; var1_int++) {
            var2_ref_gm = (gm) (sh.field_a.field_P[ae.field_G][1 + var1_int]);
            var3 = null;
            var4 = 0;
            if (var2_ref_gm.field_C > 0) {
              var5 = Math.min(-1 + kj.field_b.length, 210 * var2_ref_gm.field_C / var2_ref_gm.a((byte) -99));
              var4 = 72;
              var3 = kj.field_b[var5];
            } else {
              if (mn.field_b[var1_int] > 0) {
                var4 = qi.field_n[-1 + mn.field_b[var1_int]];
                var3 = ac.field_a[mn.field_b[var1_int] - 1];
              }
            }
            if (var3 != null) {
              var5Lifetime1 = ug.a(0, var2_ref_gm.field_kb >> 16);
              var6 = lf.a((byte) -114, var2_ref_gm.field_bb >> 16);
              if (hw.field_i == 256) {
                var7 = var4 >> 1;
                eo.a((byte[]) (var3), -var7 + var5Lifetime1, -var7 + var6, var4);
              } else {
                var7 = hw.field_i * var4 >> 8;
                var8 = var7 >> 1;
                eo.a((byte[]) (var3), -var8 + var5Lifetime1, -var8 + var6, var4, var7);
              }
            }
          }
          var2 = 118 / ((param0 + 70) / 44);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw nb.a((Throwable) ((Object) var1), "qa.K(" + param0 + ')');
        }
    }

    static {
        field_F = "to the Semi-Finals";
        field_G = "Warning: The Auction House takes a 10% commission on all sales";
    }
}
