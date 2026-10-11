/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class eb extends td {
    static String field_q;
    static String field_r;
    static int field_t;
    static String field_s;
    static int[] field_p;

    eb(int param0, aga param1, int param2, int param3) {
        super(param0, param1);
        try {
          this.field_n = param3;
          this.field_k = param2;
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "eb.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    final ii a(op param0, int param1) {
        int var12 = 0;
        ii stackIn_3_0 = null;
        tba stackIn_34_0 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_38_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        tba var4 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var13 = 0;
        int var14 = 0;
        wia var15 = null;
        aga var16 = null;
        iv var17 = null;
        int var18 = 0;
        aga var19 = null;
        int[][] var23 = null;
        var18 = BachelorFridge.field_y;
        try {
          var19 = this.field_h.a(21, param0);
          var4 = new tba(this.field_g, new nq(var19));
          var4.field_q = this.field_k;
          var4.field_s = this.field_n;
          var23 = var4.e(6);
          var6 = 17;
          var7 = 17;
          var8 = var6 - 1 >> 1;
          var9 = -1 + var7 >> 1;
          var10 = 0;
          var11 = 0;
          if (param1 != 3) {
            stackIn_3_0 = (ii) null;
            return stackIn_3_0;
          }
          while (var11 < var6) {
            for (var12 = 0; var12 < var7; var12++) {
              if (1 == var23[var11][var12]) {
                var13 = -var8 - (-var11 - this.field_k);
                var14 = -var9 - (-var12 - this.field_n);
                if (var13 >= 0 &&
                  param0.field_z > var13 &&
                  var14 >= 0 &&
                  var14 < param0.field_B) {
                  var15 = param0.field_a[var13][var14];
                  var16 = var15.field_l;
                  if (6 > var10 &&
                    5 >= kla.a(10, param0.field_w, param1 + 2147483645)) {
                    if (var16 != null) {
                      var17 = new iv(new nq(var16), false, 1, 30, 12);
                      var4.field_o.a(var17, true);
                    }
                    var4.field_t[var10][0] = var13;
                    var4.field_t[var10][1] = var14;
                    var10++;
                  }
                }
              }
            }
            var11++;
          }
          stackIn_34_0 = var4;
          return (ii) ((Object) stackIn_34_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_37_0 = var3;
          stackIn_37_1 = new StringBuilder().append("eb.A(");
          if (param0 == null) {
            stackIn_38_2 = "null";
          } else {
            stackIn_38_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_37_0), ((StringBuilder) (Object) stackIn_37_1).append(stackIn_38_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(boolean param0, int param1) {
        int var2_int = 0;
        fea stackIn_15_0;
        String stackIn_15_1;
        int stackIn_15_2;
        int stackIn_15_3;
        int stackIn_16_4 = 0;
        RuntimeException decompiledCaughtException = null;
        kr var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        String var4 = null;
        String var5 = null;
        var3 = BachelorFridge.field_y;
        try {
          ps.field_q.d(0, 0);
          for (var2_int = 0; 8 > var2_int; var2_int++) {
            jf.field_l.a(14 + var2_int * 77, 89);
            if (se.field_s[var2_int].field_T ||
              baa.field_Q - 1 == var2_int) {
              dr.field_p.a(77 * var2_int + 14, 89);
            }
            nw.field_p[var2_int].e(77 * var2_int + 36, 91);
          }
          qm.field_d.a(true, 7802);
          jha.field_g.c(ak.field_t, 22, 146, 16370176, -1);
          hfa.field_z.c(ak.field_t, 22, 146, 65793, -1);
          if (mg.field_m.field_a >= dea.field_n) {
            fba.field_a.a(48 + bw.field_a.field_kb, 4 + bw.field_a.field_rb);
            if (bw.field_a.field_T) {
              bn.field_h.a(48 + bw.field_a.field_kb, bw.field_a.field_rb + 4);
            }
          } else {
            hfa.field_z.a(vka.field_r, bw.field_a.field_kb + (bw.field_a.field_sb >> 1), 4 + bw.field_a.field_rb + (bw.field_a.field_p >> 1), 16204, -1);
            jha.field_g.a(vka.field_r, bw.field_a.field_kb + (bw.field_a.field_sb >> 1), 4 + ((bw.field_a.field_p >> 1) + bw.field_a.field_rb), 16777215, -1);
          }
          stackIn_15_0 = jha.field_g;
          stackIn_15_1 = ow.field_n;
          stackIn_15_2 = 530;
          stackIn_15_3 = 446;
          if (!lfa.field_l.field_T) {
            stackIn_16_4 = 16777215;
          } else {
            stackIn_16_4 = 16699649;
          }
          ((fea) (Object) stackIn_15_0).a(stackIn_15_1, stackIn_15_2, stackIn_15_3, stackIn_16_4, -1);
          hfa.field_z.a(ow.field_n, 530, 446, 16204, -1);
          ug.field_q.a(true, param1 + 7766);
          if (null != qg.field_b.field_z) {
            dg.a(ug.field_q.field_kb, ug.field_q.field_rb, ug.field_q.field_sb + ug.field_q.field_kb, ug.field_q.field_p + ug.field_q.field_rb);
            var2 = (kr) (qg.field_b.field_z.b((byte) 90));
            while (var2 != null) {
              jha.field_g.c(Integer.toString(var2.field_yb.field_g), ug.field_q.field_kb - (-var2.field_kb - 28), qg.field_b.field_rb + 32 + (ug.field_q.field_rb + var2.field_rb), 16777215, -1);
              hfa.field_z.c(Integer.toString(var2.field_yb.field_g), 28 + var2.field_kb + ug.field_q.field_kb, qg.field_b.field_rb + (32 + (var2.field_rb + ug.field_q.field_rb)), 65793, -1);
              var2 = (kr) (qg.field_b.field_z.c(0));
            }
            dg.c();
          }
          jha.field_g.c(hka.field_g, 452, 306, 65793, -1);
          var4 = lga.a(true, new String[]{ti.a((byte) -118, 2, (long)dea.field_n, kt.field_k, true)}, vla.field_u);
          jha.field_g.b(var4, 600, 306, 16699649, -1);
          hfa.field_z.b(var4, 600, 306, 65793, -1);
          jha.field_g.c(jla.field_c, 452, 400, 65793, -1);
          if (param1 != 36) {
            field_q = (String) null;
          }
          var5 = lga.a(true, new String[]{ti.a((byte) -120, 2, (long)mg.field_m.field_a, kt.field_k, true)}, vla.field_u);
          jha.field_g.b(var5, 600, 400, 16699649, -1);
          hfa.field_z.b(var5, 600, 400, 65793, -1);
          lma.field_y.a(412, 161);
          gha.field_b.a(412, 441);
          lma.field_y.a(598, 166);
          gha.field_b.a(598, 271);
          if (!um.a(true)) {
            kla.b(true);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw pe.a((Throwable) ((Object) var2_ref), "eb.C(" + param0 + ',' + param1 + ')');
        }
    }

    public static void c(byte param0) {
        field_s = null;
        field_q = null;
        if (param0 > -23) {
          eb.a(false, -54);
        }
        field_r = null;
        field_p = null;
    }

    static {
        field_q = "Turn <%0> / <%1>";
        field_r = "Try out your first battle! If you wish to skip this section, click here.  <br><col=BBFF00> Next</col>";
        field_s = "Invalid date";
        field_p = new int[8192];
    }
}
