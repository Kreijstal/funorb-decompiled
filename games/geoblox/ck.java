/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ck {
    int field_b;
    static String field_d;
    int field_a;
    static int[] field_c;
    static boolean field_e;

    final static boolean b() {
        return true;
    }

    final static void a(byte param0) {
        RuntimeException var1 = null;
        int var1_int = 0;
        int[] var2 = null;
        int var3 = 0;
        int var4 = 0;
        nf var4_ref_nf = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10_int = 0;
        double var10 = 0.0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17_int = 0;
        nf var17 = null;
        int var18 = 0;
        int var19 = 0;
        int[] var20 = null;
        int[] var21 = null;
        int[] var22 = null;
        int[] var23 = null;
        RuntimeException decompiledCaughtException = null;
        var19 = Geoblox.field_C;
        try {
          L0: {
            am.field_a = new int[]{0, 0, -8144, 65536, 0, 0, 0, -65536, 0, 0, 0, 65536};
            var1_int = bm.field_l.length;
            var23 = new int[var1_int];
            var22 = var23;
            var21 = var22;
            var20 = var21;
            var2 = var20;
            var3 = 0;
            L1: while (true) {
              if (var1_int <= var3) {
                L2: {
                  var3 = am.field_a[9] >> 8;
                  var4 = am.field_a[10] >> 8;
                  var5 = am.field_a[11] >> 8;
                  var6 = gb.field_f << 4;
                  var7 = 0;
                  var8 = bh.a((byte) 81, var6) >> 8;
                  var9 = fi.a(var6, 2048) >> 8;
                  if (qa.field_a == -1) {
                    break L2;
                  } else {
                    if (ue.field_e != -1) {
                      var7 = -320 + qa.field_a;
                      var9 = -128;
                      var8 = -ue.field_e + 240;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                }
                var10 = 256.0 / Math.sqrt((double)(var8 * var8 + (var7 * var7 + var9 * var9)));
                var8 = (int)((double)var8 * var10);
                var7 = (int)((double)var7 * var10);
                var9 = (int)((double)var9 * var10);
                var12 = var7 + -var3;
                var13 = var8 - var4;
                var14 = -var5 + var9;
                var10 = 256.0 / Math.sqrt((double)(var14 * var14 + (var13 * var13 + var12 * var12)));
                var14 = (int)((double)var14 * var10);
                var12 = (int)((double)var12 * var10);
                var13 = (int)((double)var13 * var10);
                var15 = 0;
                L3: while (true) {
                  if (bm.field_l.length <= var15) {
                    var15 = 123 / ((48 - param0) / 59);
                    break L0;
                  } else {
                    var16 = 0;
                    var17_int = 1;
                    L4: while (true) {
                      if (bm.field_l.length <= var17_int) {
                        var23[var16] = -2147483648;
                        var17 = bm.field_l[var16];
                        Geoblox.a((byte) -112, var16);
                        var18 = 0;
                        L5: while (true) {
                          if (var18 >= 3) {
                            int discarded$4 = 1;
                            int discarded$5 = 0;
                            int discarded$6 = 0;
                            int discarded$7 = 1;
                            p.a(am.field_a, lk.field_f, var17);
                            hi.a(var14, var9, var12, 6562, var7, var17, var13, var8);
                            var15++;
                            continue L3;
                          } else {
                            lk.field_f[var18] = lk.field_f[var18] + pi.field_R[var15][var18];
                            var18++;
                            continue L5;
                          }
                        }
                      } else {
                        L6: {
                          if (var23[var17_int] <= var23[var16]) {
                            break L6;
                          } else {
                            break L6;
                          }
                        }
                        var17_int++;
                        continue L4;
                      }
                    }
                  }
                }
              } else {
                var4_ref_nf = bm.field_l[var3];
                var4_ref_nf.a((byte) -99);
                Geoblox.a((byte) -112, var3);
                var5 = var4_ref_nf.field_Q + var4_ref_nf.field_I >> 1;
                var6 = var4_ref_nf.field_s + var4_ref_nf.field_H >> 1;
                var7 = var4_ref_nf.field_N + var4_ref_nf.field_F >> 1;
                var8 = am.field_a[9] >> 2;
                var9 = am.field_a[10] >> 2;
                var10_int = am.field_a[11] >> 2;
                var11 = var10_int * lk.field_f[5] + var8 * lk.field_f[3] + lk.field_f[4] * var9 >> 14;
                var12 = var9 * lk.field_f[7] + (var8 * lk.field_f[6] + lk.field_f[8] * var10_int) >> 14;
                var13 = var10_int * lk.field_f[11] + (var8 * lk.field_f[9] - -(lk.field_f[10] * var9)) >> 14;
                var2[var3] = var5 * var11 - -(var12 * var6) + var13 * var7 >> 16;
                var3++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw t.a((Throwable) (Object) var1, "ck.D(" + param0 + 41);
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    public static void a() {
        int var1 = 0;
        field_c = null;
        field_d = null;
    }

    final static void c() {
        RuntimeException var1 = null;
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        var2 = Geoblox.field_C;
        try {
          L0: {
            int discarded$19 = 124;
            if (tf.a()) {
              boolean discarded$20 = oh.field_b.a(true, 127, dk.field_c, ni.field_I);
              oh.field_b.i(-50);
              L1: while (true) {
                if (!hh.a(125)) {
                  break L0;
                } else {
                  boolean discarded$21 = oh.field_b.a((byte) -126, te.field_a, ki.field_d);
                  continue L1;
                }
              }
            } else {
              L2: {
                if (vl.field_n == null) {
                  break L2;
                } else {
                  if (vl.field_n.field_c) {
                    jk.a((byte) -87);
                    oh.field_b.a(false, (el) (Object) new ij(oh.field_b, ei.field_hb));
                    break L2;
                  } else {
                    break L2;
                  }
                }
              }
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw t.a((Throwable) (Object) var1, "ck.B(" + 1 + 41);
        }
    }

    ck(int param0, int param1, int param2, int param3) {
        ((ck) this).field_b = param0;
        ((ck) this).field_a = param3;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        field_d = "Cancel";
        field_c = new int[33];
        for (var0 = 0; var0 < 3; var0++) {
            field_c[var0 + 10] = 4;
            field_c[13 + var0] = 3;
            field_c[7 + var0] = 1;
            field_c[var0 + 1] = 0;
            field_c[var0 + 4] = 6;
            field_c[16 + var0] = 5;
            field_c[19 + var0] = 2;
        }
    }
}
