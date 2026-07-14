/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class of {
    static long[] field_c;
    static int[] field_b;
    static boolean field_a;

    public static void a(byte param0) {
        field_c = null;
        field_b = null;
        if (param0 != 99) {
            field_b = null;
        }
    }

    final static int a(int param0) {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        var7 = Confined.field_J ? 1 : 0;
        var1 = 0;
        var2 = 0;
        L0: while (true) {
          if (!nm.e((byte) -96)) {
            L1: {
              ij.field_q.a(true, ab.a(0, wm.field_hb, m.field_a), ab.a(param0 ^ param0, ld.field_l, jh.field_R));
              if (ij.field_q.d((byte) 55)) {
                var1 = 1;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              L3: {
                var3 = 0;
                if (var1 == 0) {
                  break L3;
                } else {
                  if (0 <= ij.field_q.field_i) {
                    L4: {
                      var3 = uc.field_ab[ij.field_q.field_i];
                      if (2 == var3) {
                        break L4;
                      } else {
                        if (-6 == (var3 ^ -1)) {
                          break L4;
                        } else {
                          break L2;
                        }
                      }
                    }
                    jg.b(15229);
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              if (var2 == 0) {
                break L2;
              } else {
                if (2 == ea.field_a) {
                  break L2;
                } else {
                  jg.b(15229);
                  break L2;
                }
              }
            }
            L5: {
              if (var3 != 0) {
                break L5;
              } else {
                if (2 != ea.field_a) {
                  break L5;
                } else {
                  var4 = ri.a(-3) - ga.field_M;
                  var6 = (int)((10999L + -var4) / 1000L);
                  if (var6 > 0) {
                    break L5;
                  } else {
                    var3 = 2;
                    q.a(5, true, (byte) -98);
                    break L5;
                  }
                }
              }
            }
            return var3;
          } else {
            L6: {
              ij.field_q.c(-1);
              if (!ij.field_q.d((byte) 55)) {
                break L6;
              } else {
                var1 = 1;
                break L6;
              }
            }
            if (13 == gk.field_r) {
              var2 = 1;
              continue L0;
            } else {
              continue L0;
            }
          }
        }
    }

    final static void a(boolean param0) {
        int var1 = 0;
        int[] var2 = null;
        int var3 = 0;
        rm var4_ref_rm = null;
        int var4 = 0;
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
        rm var17 = null;
        int var17_int = 0;
        rm var17_ref = null;
        int var18 = 0;
        int var19 = 0;
        int[] var20 = null;
        int[] var21 = null;
        int[] var22 = null;
        int[] var23 = null;
        var19 = Confined.field_J ? 1 : 0;
        qj.field_c = new int[]{0, 0, -8144, 65536, 0, 0, 0, -65536, 0, 0, 0, 65536};
        var1 = Confined.field_K.length;
        var23 = new int[var1];
        var22 = var23;
        var21 = var22;
        var20 = var21;
        var2 = var20;
        var3 = 0;
        L0: while (true) {
          if (var3 >= var1) {
            L1: {
              if (!param0) {
                break L1;
              } else {
                field_c = null;
                break L1;
              }
            }
            L2: {
              var3 = qj.field_c[9] >> 1646557608;
              var4 = qj.field_c[10] >> -937761432;
              var5 = qj.field_c[11] >> -1551242360;
              var6 = tg.field_H << 1827561668;
              var7 = 0;
              var8 = vh.a(21872, var6) >> -1863666264;
              var9 = si.a(var6, -125) >> -297622104;
              if (0 == (ld.field_l ^ -1)) {
                break L2;
              } else {
                if (-1 == jh.field_R) {
                  break L2;
                } else {
                  var7 = ld.field_l + -320;
                  var9 = -128;
                  var8 = 240 - jh.field_R;
                  break L2;
                }
              }
            }
            var10 = 256.0 / Math.sqrt((double)(var7 * var7 + var8 * var8 - -(var9 * var9)));
            var8 = (int)((double)var8 * var10);
            var7 = (int)((double)var7 * var10);
            var9 = (int)((double)var9 * var10);
            var12 = var7 + -var3;
            var13 = var8 + -var4;
            var14 = -var5 + var9;
            var10 = 256.0 / Math.sqrt((double)(var12 * var12 - (-(var13 * var13) - var14 * var14)));
            var13 = (int)((double)var13 * var10);
            var14 = (int)((double)var14 * var10);
            var12 = (int)((double)var12 * var10);
            var15 = 0;
            L3: while (true) {
              if (var15 >= Confined.field_K.length) {
                return;
              } else {
                var16 = 0;
                var17_int = 1;
                L4: while (true) {
                  if (var17_int >= Confined.field_K.length) {
                    var23[var16] = -2147483648;
                    var17_ref = Confined.field_K[var16];
                    jk.a(var16, -128);
                    var18 = 0;
                    L5: while (true) {
                      if (3 <= var18) {
                        ck.a(qj.field_c, 109, false, gd.field_m, false, true, var17_ref);
                        wl.a(var8, 126, var14, var12, var9, var17_ref, var7, var13);
                        var15++;
                        continue L3;
                      } else {
                        gd.field_m[var18] = gd.field_m[var18] + in.field_b[var15][var18];
                        var18++;
                        continue L5;
                      }
                    }
                  } else {
                    if (var23[var16] < var23[var17_int]) {
                      var16 = var17_int;
                      var17_int++;
                      continue L4;
                    } else {
                      var17_int++;
                      continue L4;
                    }
                  }
                }
              }
            }
          } else {
            var4_ref_rm = Confined.field_K[var3];
            var17 = var4_ref_rm;
            var17 = var4_ref_rm;
            var4_ref_rm.b(27915);
            jk.a(var3, 91);
            var5 = var4_ref_rm.field_I + var4_ref_rm.field_O >> -475133791;
            var6 = var4_ref_rm.field_L - -var4_ref_rm.field_e >> -1296005247;
            var7 = var4_ref_rm.field_t + var4_ref_rm.field_s >> -1856625535;
            var8 = qj.field_c[9] >> -1665827742;
            var9 = qj.field_c[10] >> 705378818;
            var10_int = qj.field_c[11] >> 50809218;
            var11 = var9 * gd.field_m[4] + (gd.field_m[3] * var8 + gd.field_m[5] * var10_int) >> 14189742;
            var12 = gd.field_m[8] * var10_int + (gd.field_m[6] * var8 - -(gd.field_m[7] * var9)) >> 547873550;
            var13 = var10_int * gd.field_m[11] + (gd.field_m[9] * var8 + var9 * gd.field_m[10]) >> 484638222;
            var2[var3] = var7 * var13 + var11 * var5 + var6 * var12 >> -8105840;
            var3++;
            continue L0;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new long[32];
        field_a = false;
        field_b = new int[]{1, 2, 1, 2, 3, 3, 4};
    }
}
