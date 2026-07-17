/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class af implements rc {
    static o field_b;
    private long field_c;
    static String[] field_d;
    static int field_a;

    final static void d(int param0) {
        RuntimeException var1 = null;
        int var1_int = 0;
        int[] var2 = null;
        int var3 = 0;
        int var4 = 0;
        ee var4_ref_ee = null;
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
        ee var17 = null;
        int var18 = 0;
        int var19 = 0;
        int[] var20 = null;
        int[] var21 = null;
        int[] var22 = null;
        int[] var23 = null;
        RuntimeException decompiledCaughtException = null;
        var19 = Terraphoenix.field_V;
        try {
          L0: {
            ik.field_c = new int[]{0, 0, -8144, 65536, 0, 0, 0, -65536, 0, 0, 0, 65536};
            var1_int = cm.field_b.length;
            var23 = new int[var1_int];
            var22 = var23;
            var21 = var22;
            var20 = var21;
            var2 = var20;
            var3 = 0;
            L1: while (true) {
              if (var3 >= var1_int) {
                L2: {
                  var3 = ik.field_c[9] >> 8;
                  var4 = ik.field_c[10] >> 8;
                  var5 = ik.field_c[11] >> 8;
                  var6 = kf.field_f << 4;
                  var7 = 0;
                  var8 = bk.a((byte) 92, var6) >> 8;
                  var9 = im.a(var6, true) >> 8;
                  if (-1 == ef.field_j) {
                    break L2;
                  } else {
                    if (jb.field_b != -1) {
                      var9 = -128;
                      var8 = 240 - jb.field_b;
                      var7 = -320 + ef.field_j;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                }
                var10 = 256.0 / Math.sqrt((double)(var9 * var9 + (var8 * var8 + var7 * var7)));
                var8 = (int)((double)var8 * var10);
                var7 = (int)((double)var7 * var10);
                var9 = (int)((double)var9 * var10);
                var12 = var7 + -var3;
                var13 = -var4 + var8;
                var14 = -var5 + var9;
                var10 = 256.0 / Math.sqrt((double)(var14 * var14 + var12 * var12 + var13 * var13));
                var14 = (int)((double)var14 * var10);
                var13 = (int)((double)var13 * var10);
                var12 = (int)((double)var12 * var10);
                var15 = 0;
                L3: while (true) {
                  if (var15 >= cm.field_b.length) {
                    break L0;
                  } else {
                    var16 = 0;
                    var17_int = 1;
                    L4: while (true) {
                      if (var17_int >= cm.field_b.length) {
                        var23[var16] = -2147483648;
                        var17 = cm.field_b[var16];
                        ad.a(var16, -6);
                        var18 = 0;
                        L5: while (true) {
                          if (3 <= var18) {
                            nd.a(var17, true, ik.field_c, 37, false, ld.field_a, false);
                            lm.a(var17, var13, var7, var12, var9, 0, var8, var14);
                            var15++;
                            continue L3;
                          } else {
                            ld.field_a[var18] = ld.field_a[var18] + vh.field_j[var15][var18];
                            var18++;
                            continue L5;
                          }
                        }
                      } else {
                        L6: {
                          if (var23[var17_int] > var23[var16]) {
                            var16 = var17_int;
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
                var4_ref_ee = cm.field_b[var3];
                var4_ref_ee.c((byte) 41);
                ad.a(var3, -6);
                var5 = var4_ref_ee.field_r + var4_ref_ee.field_K >> 1;
                var6 = var4_ref_ee.field_M + var4_ref_ee.field_a >> 1;
                var7 = var4_ref_ee.field_t + var4_ref_ee.field_v >> 1;
                var8 = ik.field_c[9] >> 2;
                var9 = ik.field_c[10] >> 2;
                var10_int = ik.field_c[11] >> 2;
                var11 = ld.field_a[5] * var10_int + (ld.field_a[3] * var8 - -(ld.field_a[4] * var9)) >> 14;
                var12 = var8 * ld.field_a[6] - (-(ld.field_a[7] * var9) + -(ld.field_a[8] * var10_int)) >> 14;
                var13 = ld.field_a[9] * var8 - (-(ld.field_a[10] * var9) - ld.field_a[11] * var10_int) >> 14;
                var2[var3] = var5 * var11 + (var6 * var12 + var7 * var13) >> 16;
                var3++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw qk.a((Throwable) (Object) var1, "af.S(" + -2766 + 41);
        }
    }

    final static void a(boolean param0, boolean param1) {
        if (!param0) {
            return;
        }
        vc.field_a.a(param1, -125);
    }

    abstract im e(int param0);

    public final String b(byte param0) {
        if (((af) this).a((byte) 117)) {
            return null;
        }
        if (~(((af) this).field_c + 350L) < ~ll.a(1000)) {
            return null;
        }
        int var2 = 86 / ((param0 - 40) / 61);
        return ((af) this).c(0);
    }

    public final im a(int param0) {
        if (((af) this).a((byte) 117)) {
            return ab.field_d;
        }
        if (~ll.a(1000) > ~(350L + ((af) this).field_c)) {
            return kj.field_d;
        }
        if (param0 != -16323) {
            String discarded$0 = ((af) this).b((byte) 22);
        }
        return ((af) this).e(0);
    }

    final static int a(String param0, pk param1, int param2, String[] param3, int param4) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        String var11 = null;
        int var12 = 0;
        int var13 = 0;
        Object var14 = null;
        int stackIn_4_0 = 0;
        int stackIn_22_0 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_21_0 = 0;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        var13 = Terraphoenix.field_V;
        try {
          L0: {
            L1: {
              var5_int = param1.b(param0);
              if (param4 < var5_int) {
                break L1;
              } else {
                if (param0.indexOf("<br>") != -1) {
                  break L1;
                } else {
                  param3[0] = (String) (Object) param3;
                  stackOut_3_0 = 1;
                  stackIn_4_0 = stackOut_3_0;
                  return stackIn_4_0;
                }
              }
            }
            L2: {
              if (param2 == -3) {
                break L2;
              } else {
                var14 = null;
                int discarded$3 = af.a((String) null, (pk) null, 80, (String[]) null, 47);
                break L2;
              }
            }
            var6 = (-1 + var5_int - -param4) / param4;
            param4 = var5_int / var6;
            var6 = 0;
            var7 = 0;
            var8 = param0.length();
            var9 = 0;
            L3: while (true) {
              if (var8 <= var9) {
                L4: {
                  if (var8 > var7) {
                    int incrementValue$4 = var6;
                    var6++;
                    param3[incrementValue$4] = param0.substring(var7, var8).trim();
                    break L4;
                  } else {
                    break L4;
                  }
                }
                stackOut_21_0 = var6;
                stackIn_22_0 = stackOut_21_0;
                break L0;
              } else {
                L5: {
                  L6: {
                    var10 = param0.charAt(var9);
                    if (var10 == 32) {
                      break L6;
                    } else {
                      if (var10 != 45) {
                        break L5;
                      } else {
                        break L6;
                      }
                    }
                  }
                  var11 = param0.substring(var7, 1 + var9).trim();
                  var12 = param1.b(var11);
                  if (var12 >= param4) {
                    int incrementValue$5 = var6;
                    var6++;
                    param3[incrementValue$5] = var11;
                    var7 = 1 + var9;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                L7: {
                  if (var10 != 62) {
                    break L7;
                  } else {
                    break L7;
                  }
                }
                var9++;
                continue L3;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var5 = decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) var5;
            stackOut_23_1 = new StringBuilder().append("af.W(");
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param0 == null) {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L8;
            } else {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L8;
            }
          }
          L9: {
            stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
            stackOut_26_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_26_2).append(44);
            stackIn_28_0 = stackOut_26_0;
            stackIn_28_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param1 == null) {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L9;
            } else {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "{...}";
              stackIn_29_0 = stackOut_27_0;
              stackIn_29_1 = stackOut_27_1;
              stackIn_29_2 = stackOut_27_2;
              break L9;
            }
          }
          L10: {
            stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
            stackOut_29_1 = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_29_2).append(44).append(param2).append(44);
            stackIn_31_0 = stackOut_29_0;
            stackIn_31_1 = stackOut_29_1;
            stackIn_30_0 = stackOut_29_0;
            stackIn_30_1 = stackOut_29_1;
            if (param3 == null) {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "null";
              stackIn_32_0 = stackOut_31_0;
              stackIn_32_1 = stackOut_31_1;
              stackIn_32_2 = stackOut_31_2;
              break L10;
            } else {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "{...}";
              stackIn_32_0 = stackOut_30_0;
              stackIn_32_1 = stackOut_30_1;
              stackIn_32_2 = stackOut_30_2;
              break L10;
            }
          }
          throw qk.a((Throwable) (Object) stackIn_32_0, stackIn_32_2 + 44 + param4 + 41);
        }
        return stackIn_22_0;
    }

    public static void b(int param0) {
        field_b = null;
        field_d = null;
    }

    public final void c(byte param0) {
        if (param0 < 11) {
            String discarded$0 = ((af) this).b((byte) -21);
        }
        ((af) this).field_c = ll.a(1000);
    }

    abstract String c(int param0);

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new String[]{"Allen", "Anderson", "Badger", "Baxter", "Bragshawe", "Brandon", "Brown", "Cambell", "Carter", "Cartwright", "Corrall", "Churchill", "Clay", "Cougan", "Cullock", "Davis", "Davies", "de Rivaz", "de Coursey", "de Waal", "England", "Falcon", "Faulkner", "Fitzpatrick", "Foxton", "Fuller", "Gratham", "Hammonds", "Holland", "Hun", "Hyde", "Jackson", "Jones", "Kerensky", "Lancaster", "Langley", "Lamprell", "Lee", "Lewis", "Martin", "Martinez", "Mayor", "McDonald", "McIntyre", "Miller", "Morris", "Nabrinski", "O'Connor", "O'Reilly", "Parker", "Peterson", "Philips", "Piercy", "Pritchard", "Rapier", "Richards", "Richter", "Ritter", "Reader", "Roud", "Schaeffer", "Singh", "Small", "Smith", "Smoke", "Stark", "Steiner", "Stour", "Stukov", "Sung", "Sutton", "Symons", "Taylor", "Thompson", "Thomson", "Vielmont", "Ward", "Wayne", "York", "Xavier"};
        field_b = new o();
    }
}
