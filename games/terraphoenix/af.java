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
        RuntimeException decompiledCaughtException = null;
        var19 = Terraphoenix.field_V;
        try {
          L0: {
            ik.field_c = new int[]{0, 0, -8144, 65536, 0, 0, 0, -65536, 0, 0, 0, 65536};
            var1_int = cm.field_b.length;
            var21 = new int[var1_int];
            var20 = var21;
            var2 = var20;
            var3 = 0;
            L1: while (true) {
              if (var3 >= var1_int) {
                L2: {
                  var3 = ik.field_c[9] >> 1124489064;
                  var4 = ik.field_c[10] >> 2094642856;
                  var5 = ik.field_c[11] >> 1059163592;
                  var6 = kf.field_f << -1964618076;
                  var7 = 0;
                  var8 = bk.a((byte) 92, var6) >> -757415160;
                  var9 = im.a(var6, true) >> -27315160;
                  if (-1 == ef.field_j) {
                    break L2;
                  } else {
                    if (0 != (jb.field_b ^ -1)) {
                      var9 = -128;
                      var8 = 240 - jb.field_b;
                      var7 = -320 + ef.field_j;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                }
                L3: {
                  if (param0 == -2766) {
                    break L3;
                  } else {
                    field_b = (o) null;
                    break L3;
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
                L4: while (true) {
                  if (var15 >= cm.field_b.length) {
                    break L0;
                  } else {
                    var16 = 0;
                    var17_int = 1;
                    L5: while (true) {
                      if (var17_int >= cm.field_b.length) {
                        var21[var16] = -2147483648;
                        var17 = cm.field_b[var16];
                        ad.a(var16, -6);
                        var18 = 0;
                        L6: while (true) {
                          if (3 <= var18) {
                            nd.a(var17, true, ik.field_c, 37, false, ld.field_a, false);
                            lm.a(var17, var13, var7, var12, var9, 0, var8, var14);
                            var15++;
                            continue L4;
                          } else {
                            ld.field_a[var18] = ld.field_a[var18] + vh.field_j[var15][var18];
                            var18++;
                            continue L6;
                          }
                        }
                      } else {
                        L7: {
                          if (var21[var17_int] > var21[var16]) {
                            var16 = var17_int;
                            break L7;
                          } else {
                            break L7;
                          }
                        }
                        var17_int++;
                        continue L5;
                      }
                    }
                  }
                }
              } else {
                var4_ref_ee = cm.field_b[var3];
                var4_ref_ee.c((byte) 41);
                ad.a(var3, -6);
                var5 = var4_ref_ee.field_r + var4_ref_ee.field_K >> -737109695;
                var6 = var4_ref_ee.field_M + var4_ref_ee.field_a >> 1304125857;
                var7 = var4_ref_ee.field_t + var4_ref_ee.field_v >> -1105378143;
                var8 = ik.field_c[9] >> 972956610;
                var9 = ik.field_c[10] >> 538711522;
                var10_int = ik.field_c[11] >> -1061680798;
                var11 = ld.field_a[5] * var10_int + (ld.field_a[3] * var8 - -(ld.field_a[4] * var9)) >> -1432925234;
                var12 = var8 * ld.field_a[6] - (-(ld.field_a[7] * var9) + -(ld.field_a[8] * var10_int)) >> 672032622;
                var13 = ld.field_a[9] * var8 - (-(ld.field_a[10] * var9) - ld.field_a[11] * var10_int) >> 238878062;
                var2[var3] = var5 * var11 + (var6 * var12 + var7 * var13) >> -1270898096;
                var3++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw qk.a((Throwable) ((Object) var1), "af.S(" + param0 + ')');
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
        if (this.a((byte) 117)) {
            return null;
        }
        if ((this.field_c + 350L ^ -1L) < (ll.a(1000) ^ -1L)) {
            return null;
        }
        int var2 = 86 / ((param0 - 40) / 61);
        return this.c(0);
    }

    public final im a(int param0) {
        String discarded$0 = null;
        if (this.a((byte) 117)) {
            return ab.field_d;
        }
        if ((ll.a(1000) ^ -1L) > (350L + this.field_c ^ -1L)) {
            return kj.field_d;
        }
        if (param0 != -16323) {
            discarded$0 = this.b((byte) 22);
        }
        return this.e(0);
    }

    final static int a(String param0, pk param1, int param2, String[] param3, int param4) {
        int discarded$4 = 0;
        int incrementValue$5 = 0;
        int incrementValue$6 = 0;
        int incrementValue$7 = 0;
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
        String[] var14 = null;
        int stackIn_4_0 = 0;
        int stackIn_25_0 = 0;
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
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_24_0 = 0;
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
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        var13 = Terraphoenix.field_V;
        try {
          L0: {
            L1: {
              var5_int = param1.b(param0);
              if (param4 < var5_int) {
                break L1;
              } else {
                if ((param0.indexOf("<br>") ^ -1) != 0) {
                  break L1;
                } else {
                  param3[0] = param0;
                  stackOut_3_0 = 1;
                  stackIn_4_0 = stackOut_3_0;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            }
            L2: {
              if (param2 == -3) {
                break L2;
              } else {
                var14 = (String[]) null;
                discarded$4 = af.a((String) null, (pk) null, 80, (String[]) null, 47);
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
                    incrementValue$5 = var6;
                    var6++;
                    param3[incrementValue$5] = param0.substring(var7, var8).trim();
                    break L4;
                  } else {
                    break L4;
                  }
                }
                stackOut_24_0 = var6;
                stackIn_25_0 = stackOut_24_0;
                decompiledRegionSelector0 = 1;
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
                    incrementValue$6 = var6;
                    var6++;
                    param3[incrementValue$6] = var11;
                    var7 = 1 + var9;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                if (var10 == 62) {
                  L7: {
                    if (param0.regionMatches(-3 + var9, "<br>", 0, 4)) {
                      incrementValue$7 = var6;
                      var6++;
                      param3[incrementValue$7] = param0.substring(var7, -3 + var9).trim();
                      var7 = var9 - -1;
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                  var9++;
                  continue L3;
                } else {
                  var9++;
                  continue L3;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var5 = decompiledCaughtException;
            stackOut_26_0 = (RuntimeException) (var5);
            stackOut_26_1 = new StringBuilder().append("af.W(");
            stackIn_28_0 = stackOut_26_0;
            stackIn_28_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param0 == null) {
              stackOut_28_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackOut_28_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L8;
            } else {
              stackOut_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackOut_27_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackOut_27_2 = "{...}";
              stackIn_29_0 = stackOut_27_0;
              stackIn_29_1 = stackOut_27_1;
              stackIn_29_2 = stackOut_27_2;
              break L8;
            }
          }
          L9: {
            stackOut_29_0 = (RuntimeException) ((Object) stackIn_29_0);
            stackOut_29_1 = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_29_2).append(',');
            stackIn_31_0 = stackOut_29_0;
            stackIn_31_1 = stackOut_29_1;
            stackIn_30_0 = stackOut_29_0;
            stackIn_30_1 = stackOut_29_1;
            if (param1 == null) {
              stackOut_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackOut_31_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackOut_31_2 = "null";
              stackIn_32_0 = stackOut_31_0;
              stackIn_32_1 = stackOut_31_1;
              stackIn_32_2 = stackOut_31_2;
              break L9;
            } else {
              stackOut_30_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackOut_30_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackOut_30_2 = "{...}";
              stackIn_32_0 = stackOut_30_0;
              stackIn_32_1 = stackOut_30_1;
              stackIn_32_2 = stackOut_30_2;
              break L9;
            }
          }
          L10: {
            stackOut_32_0 = (RuntimeException) ((Object) stackIn_32_0);
            stackOut_32_1 = ((StringBuilder) (Object) stackIn_32_1).append(stackIn_32_2).append(',').append(param2).append(',');
            stackIn_34_0 = stackOut_32_0;
            stackIn_34_1 = stackOut_32_1;
            stackIn_33_0 = stackOut_32_0;
            stackIn_33_1 = stackOut_32_1;
            if (param3 == null) {
              stackOut_34_0 = (RuntimeException) ((Object) stackIn_34_0);
              stackOut_34_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackOut_34_2 = "null";
              stackIn_35_0 = stackOut_34_0;
              stackIn_35_1 = stackOut_34_1;
              stackIn_35_2 = stackOut_34_2;
              break L10;
            } else {
              stackOut_33_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackOut_33_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackOut_33_2 = "{...}";
              stackIn_35_0 = stackOut_33_0;
              stackIn_35_1 = stackOut_33_1;
              stackIn_35_2 = stackOut_33_2;
              break L10;
            }
          }
          throw qk.a((Throwable) ((Object) stackIn_35_0), stackIn_35_2 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          return stackIn_25_0;
        }
    }

    public static void b(int param0) {
        if (param0 != 8191) {
            af.a(true, false);
        }
        field_b = null;
        field_d = null;
    }

    public final void c(byte param0) {
        String discarded$0 = null;
        if (param0 < 11) {
            discarded$0 = this.b((byte) -21);
        }
        this.field_c = ll.a(1000);
    }

    abstract String c(int param0);

    static {
        field_d = new String[]{"Allen", "Anderson", "Badger", "Baxter", "Bragshawe", "Brandon", "Brown", "Cambell", "Carter", "Cartwright", "Corrall", "Churchill", "Clay", "Cougan", "Cullock", "Davis", "Davies", "de Rivaz", "de Coursey", "de Waal", "England", "Falcon", "Faulkner", "Fitzpatrick", "Foxton", "Fuller", "Gratham", "Hammonds", "Holland", "Hun", "Hyde", "Jackson", "Jones", "Kerensky", "Lancaster", "Langley", "Lamprell", "Lee", "Lewis", "Martin", "Martinez", "Mayor", "McDonald", "McIntyre", "Miller", "Morris", "Nabrinski", "O'Connor", "O'Reilly", "Parker", "Peterson", "Philips", "Piercy", "Pritchard", "Rapier", "Richards", "Richter", "Ritter", "Reader", "Roud", "Schaeffer", "Singh", "Small", "Smith", "Smoke", "Stark", "Steiner", "Stour", "Stukov", "Sung", "Sutton", "Symons", "Taylor", "Thompson", "Thomson", "Vielmont", "Ward", "Wayne", "York", "Xavier"};
        field_b = new o();
    }
}
