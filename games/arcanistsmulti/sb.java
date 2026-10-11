/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sb {
    static am field_f;
    static String field_c;
    static String field_b;
    static boolean field_a;
    static qb field_g;
    static int[] field_h;
    static String field_d;
    static int field_e;

    public static void c(int param0) {
        field_b = null;
        field_h = null;
        field_c = null;
        field_g = null;
        field_f = null;
        if (param0 != -1) {
          sb.a(-119);
        }
        field_d = null;
    }

    final static void b(int param0) {
        int var2 = 0;
        int var3 = 0;
        if (param0 <= 42) {
          sb.a(-95);
        }
        rb var4 = (rb) (pb.field_m.b(12623));
        if (var4 != null) {
          var2 = an.field_f / 2;
          var3 = an.field_j - 10;
          if (var4.field_h < 25) {
            var3 = var3 + (12 + tj.field_t.field_C) * (-var4.field_h + 25) / 25;
          }
          if (!(125 >= var4.field_h)) {
            var3 = var3 + (-125 + var4.field_h) * (12 + tj.field_t.field_C) / 25;
          }
          tj.field_t.b(var4.field_j, var2, var3 - 2, 1052688, 1052688);
          tj.field_t.b(var4.field_j, var2 - 2, var3, 1052688, 1052688);
          tj.field_t.b(var4.field_j, -1 + var2, -1 + var3, 1052688, -1);
          tj.field_t.b(var4.field_j, 1 + var2, 1 + var3, 1052688, -1);
          tj.field_t.b(var4.field_j, var2, var3 + 2, 1052688, -1);
          tj.field_t.b(var4.field_j, var2 + 2, var3, 1052688, -1);
          tj.field_t.b(var4.field_j, var2, var3 - 1, 16777215, 12303291);
          tj.field_t.b(var4.field_j, -1 + var2, var3, 14540253, 10066329);
          tj.field_t.b(var4.field_j, var2, var3, var4.field_g, -1);
        }
    }

    final static void a(boolean param0, byte param1, ha param2, int param3) {
        Object var4 = null;
        int var4_int = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        Throwable decompiledCaughtException = null;
        Object var4_ref = null;
        RuntimeException var4_ref2 = null;
        try {
          if (null != gg.field_h) {
            on.a(1048576, param3, param0, true, param2);
          }
          if (null != jl.field_h) {
            var4_ref = oh.field_k;
            synchronized (var4_ref) {
              jl.field_h.b(-1, (byte) 69, param3);
              if (f.field_g == param2) {
                return;
              }
              jl.field_h.a((byte) -128);
              oh.field_k.f();
              f.field_g = param2;
              if (f.field_g != null) {
                jl.field_h.a((byte) -96, param0, f.field_g);
              }
            }
          }
          var4_int = -21 % ((-79 - param1) / 43);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref2 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_18_0 = var4_ref2;
          stackIn_18_1 = new StringBuilder().append("sb.C(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param3).append(')').toString());
        }
    }

    final static void a(boolean param0, int param1) {
        qb stackIn_5_0;
        int stackIn_5_1;
        int stackIn_5_2;
        int[] stackIn_5_3;
        int stackIn_6_4 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        Object var3 = null;
        ml var4_ref_ml = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int[] var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        int var5Lifetime1;
        var9 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          var2_int = n.field_g.field_nb;
          if (bk.field_J.a(-31497) == 8) {
            de.h(0, 0, 391, 480);
          }
          stackIn_5_0 = fe.field_g;
          stackIn_5_1 = 0;
          stackIn_5_2 = 412 + lo.field_q + var2_int - 480;
          stackIn_5_3 = nj.field_n;
          if (0 > bm.field_g.field_I) {
            stackIn_6_4 = 6;
          } else {
            stackIn_6_4 = bm.field_g.field_I;
          }
          ((qb) (Object) stackIn_5_0).d(stackIn_5_1, stackIn_5_2, stackIn_5_3[stackIn_6_4]);
          pm.field_a.c(0, -pm.field_a.field_w + (lo.field_q + var2_int), 128);
          if (param1 >= -38) {
            return;
          }
          uj.field_f.c(0, lo.field_q + (var2_int - uj.field_f.field_w));
          de.a();
          if (mf.field_g != -4) {
            mf.field_g = -1;
          }
          boolean decompiledFrameRemainder1 = true;
          var3 = null;
          if (bm.field_g.field_bb != -1) {
            var4_ref_ml = bk.field_J.a(bm.field_g.field_bb, true);
            if (var4_ref_ml != null) {
              var5 = var4_ref_ml.o(-22625);
              if (17 == var5) {
                var3 = gj.field_c[var4_ref_ml.o(-22625)];
                if (var4_ref_ml.q(26)) {
                  var3 = lj.field_u;
                }
              } else {
                if (var5 != 10) {
                  boolean decompiledFrameRemainder0 = true;
                  if (var5 != 0 &&
                    var5 != 27 &&
                    var5 != 16 &&
                    var5 != 18 &&
                    var5 != 19 &&
                    var5 != 22 &&
                    var5 != 23 &&
                    21 != var5 &&
                    24 != var5 &&
                    20 != var5 &&
                    var5 != 35) {
                    if (var5 != 38) {
                      var3 = gj.field_c[var4_ref_ml.o(-22625)];
                      decompiledFrameRemainder1 = false;
                    }
                    else {
                      var12 = bk.field_J.e(3, var4_ref_ml.y(17571));
                      var11 = var12;
                      var10 = var11;
                      var3 = var10;
                      if (19 == var4_ref_ml.o(-22625)) {
                        for (var5 = 0; var5 < 16; var5++) {
                          if (45 == var12[var5]) {
                            var12[var5] = 152;
                          }
                        }
                        decompiledFrameRemainder0 = false;
                      }
                    }
                  } else {
                    var12 = bk.field_J.e(3, var4_ref_ml.y(17571));
                    var11 = var12;
                    var10 = var11;
                    var3 = var10;
                    if (19 == var4_ref_ml.o(-22625)) {
                      for (var5 = 0; var5 < 16; var5++) {
                        if (45 == var12[var5]) {
                          var12[var5] = 152;
                        }
                      }
                      decompiledFrameRemainder0 = false;
                    }
                  }
                  if ((decompiledFrameRemainder1) &&
                    (decompiledFrameRemainder0)) {
                    for (var5 = 0; var5 < 16; var5++) {
                      if (var12[var5] == 152) {
                        var12[var5] = 45;
                      }
                    }
                  }
                  if ((decompiledFrameRemainder1) &&
                    (var4_ref_ml.i((byte) -106) > bk.field_J.field_H)) {
                    ti.field_N = 4;
                    pn.field_a = th.field_b;
                    var3 = th.field_b;
                    lm.field_f = th.field_b;
                  }
                } else {
                  var3 = gj.field_c[var4_ref_ml.o(-22625)];
                  if (var4_ref_ml.q(72)) {
                    var3 = vi.field_N;
                  }
                }
              }
            }
          }
          if (var3 != pn.field_a) {
            pn.field_a = (int[]) (var3);
            lm.field_f = (int[]) (var3);
            ti.field_N = -1;
          }
          if (bk.field_J.a(true) ||
            bm.field_g.field_I != bk.field_J.d(false) ||
            bk.field_J.c((byte) 89) &&
            !bk.field_J.j(39) ||
            bk.field_J.g(116)) {
            var3 = null;
          }
          if (var3 != null) {
            ej.b(0, param0);
          } else {
            vh.field_n = false;
          }
          if (null != mo.field_f &&
            param0) {
            if (bm.field_g.field_B) {
              mo.field_f = mo.field_f + sk.field_c;
            }
            var4 = 0;
            var5Lifetime1 = 0;
            var6 = mi.field_B.c(mo.field_f, kl.field_A - 32);
            var7 = 32 + mi.field_B.field_C * mi.field_B.a(mo.field_f, -32 + var6);
            var6 += 32;
            var8 = Math.min(-var6 + an.field_f, an.field_f / 2 + 54);
            de.e(-var4 + var8, var5Lifetime1 - var4, var6 + 2 * var4, var4 * 2 + var7, 16777215, 192);
            var4++;
            de.a(-var4 + var8, var5Lifetime1 - var4, 2 * var4 + var6, 2 * var4 + var7, 4799269);
            var4++;
            de.a(var8 - var4, var5Lifetime1 - var4, var6 + var4 * 2, var4 * 2 + var7, 8547138);
            var4++;
            de.a(var8 - var4, var5Lifetime1 - var4, var6 + 2 * var4, var4 * 2 + var7, 11768360);
            var4++;
            de.a(var8 - var4, -var4 + var5Lifetime1, var6 + 2 * var4, 2 * var4 + var7, 0);
            mi.field_B.a(mo.field_f, 16 + var8, var5Lifetime1, -32 + var6, var7, 0, -1, 1, 1, mi.field_B.field_C);
            var4++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var2), "sb.B(" + param0 + ',' + param1 + ')');
        }
    }

    final static void a(int param0) {
        if (null != oh.field_k) {
          oh.field_k.e();
        }
        if (null != lf.field_a) {
          lf.field_a.e();
        }
        if (param0 != 8000) {
          field_b = (String) null;
        }
    }

    static {
        field_a = false;
        field_b = "Click or press F10 to open Quick Chat";
        field_c = "VS.";
        field_d = "This is the Book of Stone. Stone spells focus on the creation and destruction of terrain. You require 5 wands to purchase this spellbook; you currently have ";
        field_h = new int[]{-1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
        field_f = new am();
    }
}
