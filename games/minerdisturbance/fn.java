/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class fn extends pi {
    static boolean field_o;
    static String field_r;
    String[] field_n;
    static String field_q;
    static int field_p;

    final static int b(boolean param0) {
        try {
          int stackIn_15_0 = 0;
          int stackIn_26_0 = 0;
          int stackIn_29_0 = 0;
          int stackIn_33_0 = 0;
          int stackIn_35_0 = 0;
          Throwable decompiledCaughtException = null;
          int var1_int = 0;
          IOException var1 = null;
          sb var2 = null;
          if (!param0) {
            fn.a(-74, -57);
          }
          if (4 <= aj.field_c.field_o) {
            if (aj.field_c.field_j == -1) {
              return 3;
            }
            if (aj.field_c.field_j != -2) {
              return 1;
            }
            return 4;
          }
          try {
            if (tl.field_m == 0) {
              em.field_B = jl.field_fb.a(fb.field_a, kb.field_a, (byte) 60);
              tl.field_m = tl.field_m + 1;
            }
            if (1 == tl.field_m) {
              if (em.field_B.field_c == 2) {
                stackIn_15_0 = tg.a(-1, -106);
                return stackIn_15_0;
              }
              if (em.field_B.field_c == 1) {
                tl.field_m = tl.field_m + 1;
              }
            }
            if (tl.field_m == 2) {
              mb.field_c = new ll((java.net.Socket) (em.field_B.field_a), jl.field_fb);
              var2 = new sb(13);
              le.a(da.field_a, var2, ph.field_f, i.field_a, -91);
              var2.c(15, 25564);
              var2.a((byte) 120, gd.field_y);
              mb.field_c.a((byte) 104, var2.field_u, 13, 0);
              tl.field_m = tl.field_m + 1;
              sk.field_a = 30000L + sf.a((byte) -54);
            }
            if (tl.field_m == 3) {
              if (mb.field_c.c(0) > 0) {
                var1_int = mb.field_c.a(false);
                if (var1_int != 0) {
                  stackIn_29_0 = tg.a(var1_int, -118);
                  return stackIn_29_0;
                }
                tl.field_m = tl.field_m + 1;
              } else {
                if (sf.a((byte) -5) > sk.field_a) {
                  stackIn_26_0 = tg.a(-2, -115);
                  return stackIn_26_0;
                }
              }
            }
            if (tl.field_m != 4) {
              stackIn_35_0 = -1;
              return stackIn_35_0;
            }
            aj.field_c.a(mb.field_c, gl.field_o, 24458);
            tl.field_m = 0;
            em.field_B = null;
            mb.field_c = null;
            stackIn_33_0 = 0;
            return stackIn_33_0;
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var1 = (IOException) (Object) decompiledCaughtException;
            return tg.a(-3, -74);
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(int param0) {
        int var8_int = 0;
        String[][] dupTemp$0 = null;
        int[][] dupTemp$1 = null;
        int var19 = 0;
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        int incrementValue$4 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        wb var4 = null;
        lc var4_ref = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        String[][] var8 = null;
        String[][] var9 = null;
        int[][] var11 = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var20 = 0;
        String var21 = null;
        long var22 = 0L;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        ld var27 = null;
        long[][] var31 = null;
        int var3Lifetime1;
        int var25Lifetime1;
        int var25Lifetime2;
        var26 = MinerDisturbance.field_ab;
        try {
          var27 = kj.field_a;
          var2 = var27.d((byte) -54);
          if (var2 == param0) {
            var3 = var27.e(-78);
            var4_ref = (lc) (sj.field_g.b(115));
            while (var4_ref != null) {
              if (~var4_ref.field_q != ~var3) {
                var4_ref = (lc) (sj.field_g.b((byte) 56));
                continue;
              }
              break;
            }
            if (var4_ref == null) {
              si.a(param0 ^ -32);
              return;
            }
            var5 = var27.d((byte) -54);
            if (var5 != 0) {
              var6 = var4_ref.field_r;
              fm.field_S[0].field_f = null;
              fm.field_S[0].field_g = false;
              var7 = var4_ref.field_v;
              fm.field_S[0].field_a = ti.field_J;
              for (var8_int = 1; var5 > var8_int; var8_int++) {
                fm.field_S[var8_int].field_a = var27.a(false);
                fm.field_S[var8_int].field_g = false;
                if (1 == var27.d((byte) -54)) {
                  fm.field_S[var8_int].field_f = var27.a(false);
                } else {
                  fm.field_S[var8_int].field_f = null;
                }
              }
              dupTemp$0 = new String[3][var6];
              var4_ref.field_p = dupTemp$0;
              var8 = dupTemp$0;
              var9 = new String[3][var6];
              var31 = new long[3][var6];
              dupTemp$1 = new int[3][var6 * var7];
              var4_ref.field_n = dupTemp$1;
              var11 = dupTemp$1;
              var12 = 0;
              var13 = 0;
              var14 = 0;
              var15 = 0;
              var16 = 0;
              var17 = 0;
              var18 = var27.d((byte) -54);
              if (var18 > 0) {
                for (var19 = 0; var19 < var18; var19++) {
                  var20 = var27.d((byte) -54);
                  var21 = fm.field_S[var20].field_a;
                  var22 = var27.h(65);
                  var24 = var27.field_o;
                  if (var19 < var6) {
                    var8[0][var12] = var21;
                    var9[0][var12] = fm.field_S[var20].field_f;
                    var31[0][var12] = var22;
                    for (var25 = 0; var7 > var25; var25++) {
                      incrementValue$2 = var15;
                      var15++;
                      var11[0][incrementValue$2] = var27.b((byte) 76);
                    }
                    var12++;
                  }
                  if (var21 != null &&
                    ci.a(-27933, var21)) {
                    var8[1][var13] = ti.field_J;
                    var9[1][var13] = null;
                    var31[1][var13] = var22;
                    var13++;
                    var27.field_o = var24;
                    for (var25Lifetime1 = 0; var7 > var25Lifetime1; var25Lifetime1++) {
                      incrementValue$3 = var16;
                      var16++;
                      var11[1][incrementValue$3] = var27.b((byte) 40);
                    }
                  }
                  if (var6 > var14 &&
                    !fm.field_S[var20].field_g) {
                    fm.field_S[var20].field_g = true;
                    var8[2][var14] = var21;
                    var9[2][var14] = fm.field_S[var20].field_f;
                    var31[2][var14] = var22;
                    var14++;
                    var27.field_o = var24;
                    for (var25Lifetime2 = 0; var7 > var25Lifetime2; var25Lifetime2++) {
                      incrementValue$4 = var17;
                      var17++;
                      var11[2][incrementValue$4] = var27.b((byte) 15);
                    }
                  }
                }
              }
            }
            var4_ref.field_t = true;
            var4_ref.b(34);
            return;
          }
          if (var2 == 1) {
            var3Lifetime1 = var27.e(param0 - 89);
            var27.h(99);
            var4 = (wb) (hj.field_k.b(71));
            while (var4 != null) {
              if (~var4.field_w != ~var3Lifetime1) {
                var4 = (wb) (hj.field_k.b((byte) 56));
                continue;
              }
              break;
            }
            if (var4 == null) {
              si.a(param0 - 41);
              return;
            }
            var4.b(34);
            return;
          }
          di.a((Throwable) null, 1, "HS1: " + hj.a((byte) 68));
          si.a(-108);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw lj.a((Throwable) ((Object) var1), "fn.B(" + param0 + ')');
        }
    }

    final static void a(int param0, int param1, int param2) {
        int stackIn_12_0 = 0;
        int var3_int;
        int[] var3;
        int var4;
        int var5;
        int[] var6;
        int[] var7;
        int var4Lifetime1;
        int var4Lifetime2;
        int[] var3Lifetime1;
        if (qm.field_f) {
          return;
        }
        if (null == sj.field_d) {
          sj.field_d = hk.b(param2 ^ 3);
          di.field_x = hk.b(0);
        }
        if (nm.a(param0, sj.field_d, -827843803)) {
          return;
        }
        var3_int = param0;
        if (param2 != 3) {
          field_q = (String) null;
        }
        stackIn_12_0 = (0 == ((1633100126 ^ pe.field_sb) & 1 << var3_int % 32)) ? 0 : 1;
        var4 = stackIn_12_0;
        if (var4 == 0) {
          var5 = pe.field_sb ^ 1633100126;
          pe.field_sb = (var5 | 1 << var3_int) ^ 1633100126;
          pn.field_b = pn.field_b - (1 << var3_int);
        }
        var6 = sj.field_d;
        var3 = var6;
        var4Lifetime1 = param0;
        var3[var4Lifetime1 >> 5] = hi.a(var6[var4Lifetime1 >> 5], 1 << c.a(31, var4Lifetime1));
        var7 = di.field_x;
        var3Lifetime1 = var7;
        var4Lifetime2 = param0;
        var3Lifetime1[var4Lifetime2 >> 5] = hi.a(var7[var4Lifetime2 >> 5], 1 << c.a(var4Lifetime2, 31));
        ce.field_a.a((byte) 40, new cm(param0));
        if (!kj.a(false) &&
          wf.q(89)) {
          qa.a(pn.field_b, hl.field_b, param0, pe.field_sb, (byte) 56, 4, param1, aa.field_b);
          r.field_d = gk.b(4, 1);
          return;
        }
        vb.field_c.a((byte) -116, new sl(param0, param1, pe.field_sb, pn.field_b, aa.field_b, hl.field_b));
        return;
    }

    final static boolean a(boolean param0) {
        if (!param0) {
          byte[] var2 = (byte[]) null;
          fn.a((byte[]) null, false);
        }
        return je.field_O.f(hf.field_t, 2, ca.field_k);
    }

    final static void b(int param0, int param1) {
        sj.field_f = sj.field_f + 1;
        if (25 == sj.field_f) {
          sj.field_f = 0;
        }
        dn.field_t[sj.field_f] = rc.a(re.field_a[18], param1, oc.field_f);
        mg.a(1963987425, dn.field_t[sj.field_f]);
        rb.field_l[sj.field_f] = param0;
    }

    public static void a(byte param0) {
        field_q = null;
        field_r = null;
        int var1 = 124 % ((param0 + 18) / 45);
    }

    final static void a(byte[] param0, boolean param1) {
        if (param0 == null) {
          aa.field_j = new th();
          return;
        }
        if (!param1) {
          fn.a(100);
        }
        ld var2 = new ld(param0);
        if (var2.d((byte) -54) != 2) {
          aa.field_j = new th();
          return;
        }
        try {
          aa.field_j = new th(var2);
        } catch (RuntimeException runtimeException) {
          throw lj.a((Throwable) ((Object) runtimeException), "fn.F(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static af a(int param0, int param1) {
        af var2 = new af();
        ag.field_b.a((byte) 47, var2);
        if (param0 != 0) {
          return (af) null;
        }
        ca.a(param1, 1);
        return var2;
    }

    fn(String[] param0) {
        try {
          this.field_n = param0;
        } catch (RuntimeException runtimeException) {
          throw lj.a((Throwable) ((Object) runtimeException), "fn.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_r = "Ranking: Pit Lord";
        field_q = "Orb points: <%0>";
    }
}
