/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ba extends sr {
    static dg field_p;
    static int[] field_q;
    static kk[] field_n;
    static String field_o;

    final int a(int param0, Object param1, Object param2) {
        int var8 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        up var5 = null;
        int var6 = 0;
        int var7 = 0;
        fn var8_ref_fn = null;
        fn var9 = null;
        int var10 = 0;
        up var11 = null;
        up var12 = null;
        int var7Lifetime1;
        var10 = Kickabout.field_G;
        try {
          var11 = ((sp) (param1)).field_Sb;
          var12 = var11;
          var5 = ((sp) (param2)).field_Sb;
          var6 = var12.field_h.length;
          for (var7 = 0; var7 < var12.field_h.length; var7++) {
            var8_ref_fn = pa.field_g[var11.field_h[var7]];
            var6 = var6 + (var8_ref_fn.field_h + var8_ref_fn.field_k);
          }
          var7Lifetime1 = var5.field_h.length;
          if (param0 != 2) {
            field_n = (kk[]) null;
          }
          for (var8 = 0; var5.field_h.length > var8; var8++) {
            var9 = pa.field_g[var5.field_h[var8]];
            var7Lifetime1 = var7Lifetime1 + (var9.field_k + var9.field_h);
          }
          stackIn_10_0 = this.field_i << 31 ^ var6 - var7Lifetime1;
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_13_0 = var4;
          stackIn_13_1 = new StringBuilder().append("ba.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',');
          if (param2 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    final static ut[] a(int param0, int param1, int param2, byte param3) {
        int var4 = -62 / ((param3 + 13) / 55);
        return te.a(1, param2, param0, false, param1);
    }

    final int a(int param0) {
        if (param0 >= -69) {
          field_o = (String) null;
        }
        return 2;
    }

    final static void a(boolean param0, int param1, int param2) {
        int stackIn_22_0 = 0;
        int stackIn_25_0 = 0;
        String[] stackIn_32_0 = null;
        int stackIn_32_1 = 0;
        String stackIn_33_2 = null;
        String[] stackIn_37_0 = null;
        int stackIn_37_1 = 0;
        int stackIn_37_2 = 0;
        int stackIn_37_3 = 0;
        String stackIn_40_2 = null;
        int stackIn_90_0 = 0;
        String stackIn_90_1 = null;
        boolean stackIn_91_2 = false;
        int stackIn_114_0 = 0;
        int stackIn_115_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        String[] var4_ref_String__ = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        String[] var10 = null;
        String var11 = null;
        String var12 = null;
        String[] var4_ref_String__Lifetime1;
        int var5Lifetime1;
        int var5Lifetime2;
        int var5Lifetime3;
        int var6Lifetime1;
        int var8Lifetime1;
        int var3_intLifetime1;
        int var4Lifetime1;
        int var4Lifetime2;
        int var4Lifetime3;
        int var7Lifetime1;
        int var7Lifetime2;
        int var8Lifetime2;
        int var8Lifetime3;
        int var5Lifetime2Lifetime1;
        int var7Lifetime1Lifetime1;
        var9 = Kickabout.field_G;
        try {
          nn.field_D = true;
          ck.field_a = param2;
          if (ck.field_a == 0) {
            var3_int = lu.a(cv.field_f, tt.field_a, -46, ta.field_C, vp.field_k);
            var4 = 3 + var3_int;
            dk.field_g = new int[var4];
            eq.field_c = new String[var4];
            for (var5 = 0; var4 > var5; var5++) {
              dk.field_g[var5] = -1;
            }
            sh.field_f = new int[2];
            for (var5 = 0; var5 < var3_int; var5++) {
              eq.field_c[var5] = ta.field_C[var5];
            }
            eq.field_c[-3 + var4] = "";
            eq.field_c[var4 - 2] = tk.field_Jb;
            dk.field_g[-2 + var4] = 0;
            sh.field_f[0] = 4;
            eq.field_c[var4 - 1] = pg.field_c;
            dk.field_g[-1 + var4] = 1;
            sh.field_f[1] = 5;
          } else if (ck.field_a == 1) {
            var3_int = lu.a(cv.field_f, tt.field_a, param1 ^ -44, ta.field_C, vp.field_k);
            var4 = 2 + var3_int;
            eq.field_c = new String[var4];
            dk.field_g = new int[var4];
            for (var5 = 0; var5 < var4; var5++) {
              dk.field_g[var5] = -1;
            }
            sh.field_f = new int[1];
            for (var5 = 0; var3_int > var5; var5++) {
              eq.field_c[var5] = ta.field_C[var5];
            }
            eq.field_c[-2 + var4] = "";
            eq.field_c[var4 - 1] = pg.field_c;
            dk.field_g[-1 + var4] = 0;
            sh.field_f[0] = 5;
          } else if (2 != ck.field_a) {
            if (ck.field_a == 3) {
              if (!oo.field_c.field_l) {
                var3_int = lu.a(cv.field_f, mr.field_bb, -46, ta.field_C, vp.field_k);
              } else {
                var3_int = lu.a(cv.field_f, fu.field_a, param1 - 52, ta.field_C, vp.field_k);
              }
              var4 = 2 + var3_int;
              eq.field_c = new String[var4];
              dk.field_g = new int[var4];
              for (var5 = 0; var4 > var5; var5++) {
                dk.field_g[var5] = -1;
              }
              sh.field_f = new int[1];
              for (var5 = 0; var3_int > var5; var5++) {
                eq.field_c[var5] = ta.field_C[var5];
              }
              eq.field_c[-2 + var4] = "";
              eq.field_c[var4 - 1] = pg.field_c;
              dk.field_g[-1 + var4] = 0;
              sh.field_f[0] = 5;
            } else if (ck.field_a == 4) {
              var3_int = lu.a(cv.field_f, je.field_n, -46, ta.field_C, vp.field_k);
              var4 = var3_int + 2;
              dk.field_g = new int[var4];
              eq.field_c = new String[var4];
              for (var5 = 0; var4 > var5; var5++) {
                dk.field_g[var5] = -1;
              }
              sh.field_f = new int[1];
              for (var5 = 0; var3_int > var5; var5++) {
                eq.field_c[var5] = ta.field_C[var5];
              }
              eq.field_c[var4 - 2] = "";
              eq.field_c[var4 - 1] = pg.field_c;
              dk.field_g[-1 + var4] = 0;
              sh.field_f[0] = 5;
            } else {
              if (ck.field_a != 5) {
                throw new IllegalArgumentException();
              }
              var3_int = lu.a(cv.field_f, dr.field_b, -46, ta.field_C, vp.field_k);
              var4 = 3 + var3_int;
              eq.field_c = new String[var4];
              dk.field_g = new int[var4];
              for (var5 = 0; var4 > var5; var5++) {
                dk.field_g[var5] = -1;
              }
              sh.field_f = new int[2];
              for (var5 = 0; var3_int > var5; var5++) {
                eq.field_c[var5] = ta.field_C[var5];
              }
              eq.field_c[-3 + var4] = "";
              eq.field_c[var4 - 2] = mi.field_c;
              dk.field_g[var4 - 2] = 0;
              sh.field_f[0] = 3;
              eq.field_c[-1 + var4] = pg.field_c;
              dk.field_g[-1 + var4] = 1;
              sh.field_f[1] = 5;
            }
          } else {
            var3_int = lu.a(cv.field_f, vo.$cfr$intArgs$a$53ce4ab4c593(-18, vg.field_Kb, new String[]{"<br><%0><br>"}), -46, ta.field_C, vp.field_k);
            var4 = -1;
            for (var5 = 0; var3_int > var5; var5++) {
              if (!"<%0>".equals(ta.field_C[var5])) {
                continue;
              }
              var4 = var5;
              break;
            }
            if (var4 == -1) {
              throw new IllegalStateException();
            }
            dn.field_Eb = new String[var4];
            dv.a(ta.field_C, 0, dn.field_Eb, 0, var4);
            pg.field_a = new String[-1 + (-var4 + var3_int)];
            dv.a(ta.field_C, var4 + 1, pg.field_a, 0, -var4 + (var3_int - 1));
            var4 = -1;
            var3_int = lu.a(cv.field_f, vo.$cfr$intArgs$a$53ce4ab4c593(-18, lr.field_o, new String[]{"<br><%0><br>"}), -46, ta.field_C, vp.field_k);
            for (var5 = 0; var3_int > var5; var5++) {
              if (!"<%0>".equals(ta.field_C[var5])) {
                continue;
              }
              var4 = var5;
              break;
            }
            if (var4 == -1) {
              throw new IllegalStateException();
            }
            pn.field_D = new String[var4];
            dv.a(ta.field_C, 0, pn.field_D, 0, var4);
            cg.field_E = new String[var3_int - var4 - 1];
            dv.a(ta.field_C, 1 + var4, cg.field_E, 0, -var4 + (var3_int - 1));
            if (pn.field_D.length > dn.field_Eb.length) {
              stackIn_22_0 = pn.field_D.length;
            } else {
              stackIn_22_0 = dn.field_Eb.length;
            }
            var5 = stackIn_22_0;
            if (pg.field_a.length >= cg.field_E.length) {
              stackIn_25_0 = pg.field_a.length;
            } else {
              stackIn_25_0 = cg.field_E.length;
            }
            var6 = stackIn_25_0;
            var7 = var6 + 7 + var5;
            dk.field_g = new int[var7];
            eq.field_c = new String[var7];
            for (var8 = 0; var8 < var7; var8++) {
              dk.field_g[var8] = -1;
            }
            sh.field_f = new int[2];
            eq.field_c[1] = mn.field_f;
            eq.field_c[0] = ec.field_a;
            dk.field_g[1] = 0;
            dk.field_g[3] = 1;
            eq.field_c[5] = "";
            eq.field_c[2] = vj.field_d;
            eq.field_c[4] = tv.field_k;
            sh.field_f[1] = 2;
            sh.field_f[0] = 5;
            eq.field_c[3] = cr.field_g;
            for (var8Lifetime2 = 0; var8Lifetime2 < var5; var8Lifetime2++) {
              stackIn_32_0 = eq.field_c;
              stackIn_32_1 = var8Lifetime2 + 6;
              if (pn.field_D.length + var8Lifetime2 - var5 < 0) {
                stackIn_33_2 = "";
              } else {
                stackIn_33_2 = pn.field_D[-var5 + (var8Lifetime2 + pn.field_D.length)];
              }
              stackIn_32_0[stackIn_32_1] = stackIn_33_2;
            }
            eq.field_c[var5 + 6] = null;
            dk.field_g[6 + var5] = -2;
            for (var8Lifetime3 = 0; var6 > var8Lifetime3; var8Lifetime3++) {
              stackIn_37_0 = eq.field_c;
              stackIn_37_1 = var8Lifetime3 + var5 + 7;
              stackIn_37_2 = var8Lifetime3;
              stackIn_37_3 = cg.field_E.length;
              if (stackIn_37_2 < stackIn_37_3) {
                stackIn_40_2 = cg.field_E[var8Lifetime3];
              } else {
                stackIn_40_2 = "";
              }
              stackIn_37_0[stackIn_37_1] = stackIn_40_2;
            }
            va.field_o = nj.a(90);
          }
          ll.field_k.field_a = sh.field_f.length;
          var3_intLifetime1 = 0;
          if (param1 != 6) {
            return;
          }
          for (var4Lifetime1 = 0; eq.field_c.length > var4Lifetime1; var4Lifetime1++) {
            stackIn_90_0 = 10;
            stackIn_90_1 = eq.field_c[var4Lifetime1];
            stackIn_91_2 = !(dk.field_g[var4Lifetime1] < 0);
            var5Lifetime1 = ud.a(stackIn_90_0, stackIn_90_1, stackIn_91_2);
            if (var3_intLifetime1 < var5Lifetime1) {
              var3_intLifetime1 = var5Lifetime1;
            }
          }
          if (2 == ck.field_a) {
            var10 = dn.field_Eb;
            var4_ref_String__ = var10;
            for (var5Lifetime2 = 0; var10.length > var5Lifetime2; var5Lifetime2++) {
              var11 = var10[var5Lifetime2];
              var7Lifetime1 = ud.a(10, var11, false);
              if (var7Lifetime1 > var3_intLifetime1) {
                var3_intLifetime1 = var7Lifetime1;
              }
            }
            var4_ref_String__Lifetime1 = pg.field_a;
            for (var5Lifetime2Lifetime1 = 0; var4_ref_String__Lifetime1.length > var5Lifetime2Lifetime1; var5Lifetime2Lifetime1++) {
              var12 = var4_ref_String__Lifetime1[var5Lifetime2Lifetime1];
              var7Lifetime1Lifetime1 = ud.a(10, var12, false);
              if (var7Lifetime1Lifetime1 > var3_intLifetime1) {
                var3_intLifetime1 = var7Lifetime1Lifetime1;
              }
            }
          }
          bh.field_j = ll.field_k.field_a * (pr.field_d + aj.field_a << 1);
          ka.field_a = -(var3_intLifetime1 >> 1) + ta.field_A;
          bh.field_l = var3_intLifetime1 + (ta.field_A - (var3_intLifetime1 >> 1));
          for (var4Lifetime2 = 0; var4Lifetime2 < eq.field_c.length; var4Lifetime2++) {
            stackIn_114_0 = bh.field_j;
            if (dk.field_g[var4Lifetime2] >= 0) {
              stackIn_115_1 = nr.field_j;
            } else {
              stackIn_115_1 = la.field_c;
            }
            bh.field_j = stackIn_114_0 + stackIn_115_1;
          }
          uq.field_c = -(bh.field_j >> 1) + tb.field_s;
          ld.field_j = new int[eq.field_c.length][];
          var4Lifetime3 = 0;
          var5Lifetime3 = uq.field_c;
          while (eq.field_c.length > var4Lifetime3) {
            var6Lifetime1 = dk.field_g[var4Lifetime3];
            if (var6Lifetime1 < 0) {
              var5Lifetime3 = var5Lifetime3 + la.field_c;
            } else {
              var7Lifetime2 = ud.a(10, eq.field_c[var4Lifetime3], true);
              var8Lifetime1 = ta.field_A - (var7Lifetime2 >> 1);
              var5Lifetime3 = var5Lifetime3 + aj.field_a;
              ld.field_j[var4Lifetime3] = new int[4];
              ld.field_j[var4Lifetime3][0] = -eb.field_d + var8Lifetime1;
              ld.field_j[var4Lifetime3][1] = var5Lifetime3;
              ld.field_j[var4Lifetime3][2] = (eb.field_d << 1) + var7Lifetime2;
              var5Lifetime3 = var5Lifetime3 + (nr.field_j + ((pr.field_d << 1) + aj.field_a));
              ld.field_j[var4Lifetime3][3] = nr.field_j + (pr.field_d << 1);
            }
            var4Lifetime3++;
          }
          if (ck.field_a == 2) {
            ll.field_k.a(-1, 0, -1, param0);
          } else {
            ll.field_k.a(sj.a(el.field_A, n.field_m, (byte) -127), param1 ^ 6, 0, param0);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw nb.a((Throwable) ((Object) var3), "ba.A(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    ba() {
    }

    final static void a(int param0, boolean param1) {
        if (!n.a(false)) {
          return;
        }
        if (param1) {
          on.a(0, 0, on.field_g, on.field_f, 0, 192);
        }
        mr.field_Z.a(0, 0, (byte) -103);
        if (param0 <= 108) {
          field_n = (kk[]) null;
        }
    }

    public static void c(byte param0) {
        field_n = null;
        field_q = null;
        field_p = null;
        if (param0 != -35) {
          ba.a(27, -30, 62, (byte) -107);
        }
        field_o = null;
    }

    final static void b(byte param0) {
        try {
          int var1_int = 0;
          IOException iOException = null;
          int var3 = 0;
          Throwable decompiledCaughtException = null;
          RuntimeException var1 = null;
          IOException var2 = null;
          var3 = Kickabout.field_G;
          try {
            if (null != gt.field_t) {
              gt.field_t.b((byte) 109);
            }
            if (null != e.field_i) {
              e.field_i.b(109);
            }
            if (ao.field_h != null) {
              try {
                ao.field_h.c(1);
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                iOException = (IOException) (Object) decompiledCaughtException;
              }
            }
            if (u.field_j != null) {
              for (var1_int = 0; u.field_j.length > var1_int; var1_int++) {
                if (u.field_j[var1_int] != null) {
                  try {
                    u.field_j[var1_int].c(param0 - 43);
                  } catch (java.io.IOException decompiledCaughtParameter1) {
                    decompiledCaughtException = decompiledCaughtParameter1;
                    var2 = (IOException) (Object) decompiledCaughtException;
                  }
                }
              }
            }
            if (param0 != 44) {
              field_n = (kk[]) null;
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
            decompiledCaughtException = decompiledCaughtParameter2;
            var1 = (RuntimeException) (Object) decompiledCaughtException;
            throw nb.a((Throwable) ((Object) var1), "ba.E(" + param0 + ')');
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_q = new int[8192];
        field_o = "Just play";
    }
}
