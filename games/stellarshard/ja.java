/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ja extends gg {
    static String field_k;
    ja field_p;
    int field_o;
    int field_l;
    int field_n;
    int field_r;
    static int field_t;
    int field_s;
    static jb field_m;
    static int field_q;

    final static void a(int param0, int param1, int param2, int param3, boolean param4, int param5, int param6, int param7) {
        RuntimeException var8 = null;
        int var8_int = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int[] var12 = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        pb var17 = null;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int[] var32 = null;
        int[] var33 = null;
        int[] var34 = null;
        int[] var35 = null;
        RuntimeException decompiledCaughtException = null;
        var31 = stellarshard.field_B;
        try {
          L0: {
            if (!param4) {
              L1: {
                var8_int = -param2 + -param1 + param0;
                var9 = -param1 + param3 + -param2;
                var10 = param2 + param1 + param0;
                if (var10 > ti.field_c) {
                  var10 = ti.field_c;
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                var11 = param2 + (param3 - -param1);
                if (var8_int < ti.field_e) {
                  var8_int = ti.field_e;
                  break L2;
                } else {
                  break L2;
                }
              }
              L3: {
                if (ti.field_f > var9) {
                  var9 = ti.field_f;
                  break L3;
                } else {
                  break L3;
                }
              }
              L4: {
                if (var11 <= ti.field_l) {
                  break L4;
                } else {
                  var11 = ti.field_l;
                  break L4;
                }
              }
              var35 = new int[32];
              var34 = var35;
              var33 = var34;
              var32 = var33;
              var12 = var32;
              var13 = param7 & 16711935;
              var14 = 65280 & param7;
              var15 = 0;
              L5: while (true) {
                if (var15 >= 16) {
                  L6: {
                    var15 = -var8_int + var10;
                    var16 = var11 + -var9;
                    if (0 >= var15) {
                      break L6;
                    } else {
                      if (var16 > 0) {
                        var17 = new pb(var15, var16);
                        var18 = param1 * param1;
                        var19 = (param1 + param2) * (param1 + param2);
                        var20 = 0;
                        var21 = var9 + -param3;
                        var22 = 0;
                        L7: while (true) {
                          if (var22 >= var16) {
                            var17.d(var8_int, var9);
                            ti.b(param0 << 4, param3 << 4, param1 + param2 << 4, 255, var35);
                            break L0;
                          } else {
                            var23 = var8_int + -param0;
                            var24 = var23 * var23 + var21 * var21;
                            var25 = 0;
                            L8: while (true) {
                              if (var25 >= var15) {
                                var21++;
                                var22++;
                                continue L7;
                              } else {
                                L9: {
                                  var26 = var22 + var9;
                                  var27 = var25 + var8_int;
                                  if (var24 == 0) {
                                    break L9;
                                  } else {
                                    if (var24 >= var18) {
                                      if (var24 < var19) {
                                        L10: {
                                          var28 = ma.a((byte) -124, var24 << 12);
                                          var29 = var28 + -(param1 << 6);
                                          var30 = -(param5 * (65536 + -lc.a((var29 << 7) / param2, false)) >> 11) + var28;
                                          var27 = param0 - -(var23 * var30 / var28);
                                          var26 = param3 - -(var21 * var30 / var28);
                                          if (var26 >= ti.field_f) {
                                            break L10;
                                          } else {
                                            var26 = ti.field_f;
                                            break L10;
                                          }
                                        }
                                        L11: {
                                          if (ti.field_e > var27) {
                                            var27 = ti.field_e;
                                            break L11;
                                          } else {
                                            break L11;
                                          }
                                        }
                                        L12: {
                                          if (var26 >= ti.field_l) {
                                            var26 = ti.field_l;
                                            break L12;
                                          } else {
                                            break L12;
                                          }
                                        }
                                        if (var27 < ti.field_c) {
                                          break L9;
                                        } else {
                                          var27 = ti.field_c;
                                          break L9;
                                        }
                                      } else {
                                        var17.field_z[var20] = ti.field_a[var26 * ti.field_i - -var27];
                                        var20++;
                                        var25++;
                                        var23++;
                                        var24 = var24 + (var23 * 2 - 1);
                                        continue L8;
                                      }
                                    } else {
                                      L13: {
                                        var28 = ma.a((byte) -118, var24 << 12);
                                        var29 = -var28 + (param1 << 6);
                                        var30 = var28 - ((-lc.a((var29 << 7) / param1, param4) + 65536) * param5 >> 11);
                                        var26 = param3 - -(var30 * var21 / var28);
                                        var27 = param0 + var30 * var23 / var28;
                                        if (var26 >= ti.field_f) {
                                          break L13;
                                        } else {
                                          var26 = ti.field_f;
                                          break L13;
                                        }
                                      }
                                      L14: {
                                        if (var27 < ti.field_e) {
                                          var27 = ti.field_e;
                                          break L14;
                                        } else {
                                          break L14;
                                        }
                                      }
                                      L15: {
                                        if (ti.field_l > var26) {
                                          break L15;
                                        } else {
                                          var26 = ti.field_l;
                                          break L15;
                                        }
                                      }
                                      if (ti.field_c <= var27) {
                                        var27 = ti.field_c;
                                        break L9;
                                      } else {
                                        break L9;
                                      }
                                    }
                                  }
                                }
                                var17.field_z[var20] = ti.field_a[var26 * ti.field_i - -var27];
                                var20++;
                                var25++;
                                var23++;
                                var24 = var24 + (var23 * 2 - 1);
                                continue L8;
                              }
                            }
                          }
                        }
                      } else {
                        break L6;
                      }
                    }
                  }
                  return;
                } else {
                  var16 = param6 * var15 >> 4;
                  var12[var15] = vf.b(sa.a(16711680, var16 * var14), sa.a(-16711936, var16 * var13)) >>> 8;
                  var12[31 - var15] = vf.b(sa.a(var14 * var16, 16711680), sa.a(var16 * var13, -16711936)) >>> 8;
                  var15++;
                  continue L5;
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          throw ma.a((Throwable) (Object) var8, "ja.B(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    public static void a(byte param0) {
        field_m = null;
        int var1 = 0;
        field_k = null;
    }

    final static void a(int param0) {
        RuntimeException var1 = null;
        int var1_int = 0;
        int[] var2 = null;
        int var3 = 0;
        int var4 = 0;
        n var4_ref_n = null;
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
        n var17 = null;
        int var18 = 0;
        int var19 = 0;
        int[] var20 = null;
        int[] var21 = null;
        int[] var22 = null;
        int[] var23 = null;
        RuntimeException decompiledCaughtException = null;
        var19 = stellarshard.field_B;
        try {
          L0: {
            sl.field_a = new int[]{0, 0, -8144, 65536, 0, 0, 0, -65536, 0, 0, 0, 65536};
            var1_int = sj.field_B.length;
            var23 = new int[var1_int];
            var22 = var23;
            var21 = var22;
            var20 = var21;
            var2 = var20;
            var3 = 0;
            L1: while (true) {
              if (var3 >= var1_int) {
                var3 = sl.field_a[9] >> 8;
                var4 = sl.field_a[10] >> 8;
                var5 = sl.field_a[11] >> 8;
                var6 = ni.field_d << 4;
                L2: {
                  var7 = 0;
                  var8 = hd.a(var6, 99) >> 8;
                  var9 = lc.a(var6, false) >> 8;
                  if (-1 == ni.field_e) {
                    break L2;
                  } else {
                    if (-1 != eb.field_a) {
                      var8 = -eb.field_a + 240;
                      var9 = -128;
                      var7 = -320 + ni.field_e;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                }
                var10 = 256.0 / Math.sqrt((double)(var8 * var8 + var7 * var7 - -(var9 * var9)));
                var8 = (int)((double)var8 * var10);
                var9 = (int)((double)var9 * var10);
                var7 = (int)((double)var7 * var10);
                var12 = var7 - var3;
                var13 = -var4 + var8;
                var14 = -var5 + var9;
                var10 = 256.0 / Math.sqrt((double)(var14 * var14 + (var12 * var12 + var13 * var13)));
                var12 = (int)((double)var12 * var10);
                var13 = (int)((double)var13 * var10);
                var14 = (int)((double)var14 * var10);
                var15 = 0;
                L3: while (true) {
                  if (var15 >= sj.field_B.length) {
                    break L0;
                  } else {
                    var16 = 0;
                    var17_int = 1;
                    L4: while (true) {
                      if (sj.field_B.length <= var17_int) {
                        var23[var16] = -2147483648;
                        var17 = sj.field_B[var16];
                        kb.a(var16, 112);
                        var18 = 0;
                        L5: while (true) {
                          if (var18 >= 3) {
                            vi.a(var17, (byte) -116, pd.field_u, true, false, sl.field_a, false);
                            kf.a(-62, var8, var13, var7, var12, var14, var17, var9);
                            var15++;
                            continue L3;
                          } else {
                            pd.field_u[var18] = pd.field_u[var18] + bi.field_s[var15][var18];
                            var18++;
                            continue L5;
                          }
                        }
                      } else {
                        L6: {
                          if (var23[var16] >= var23[var17_int]) {
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
                var4_ref_n = sj.field_B[var3];
                var4_ref_n.b((byte) -53);
                kb.a(var3, -128);
                var5 = var4_ref_n.field_t + var4_ref_n.field_F >> 1;
                var6 = var4_ref_n.field_x - -var4_ref_n.field_G >> 1;
                var7 = var4_ref_n.field_u - -var4_ref_n.field_k >> 1;
                var8 = sl.field_a[9] >> 2;
                var9 = sl.field_a[10] >> 2;
                var10_int = sl.field_a[11] >> 2;
                var11 = pd.field_u[5] * var10_int + var8 * pd.field_u[3] - -(pd.field_u[4] * var9) >> 14;
                var12 = pd.field_u[8] * var10_int + (var8 * pd.field_u[6] + var9 * pd.field_u[7]) >> 14;
                var13 = var8 * pd.field_u[9] + (pd.field_u[10] * var9 - -(pd.field_u[11] * var10_int)) >> 14;
                var2[var3] = var12 * var6 + (var11 * var5 + var13 * var7) >> 16;
                var3++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ma.a((Throwable) (Object) var1, "ja.A(" + 4 + ')');
        }
    }

    ja(int param0, int param1, int param2, int param3, int param4) {
        ((ja) this).field_l = param0;
        ((ja) this).field_s = param1;
        ((ja) this).field_o = param4;
        ((ja) this).field_r = param2;
        ((ja) this).field_n = param3;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = "Lightning gun";
        field_t = -1;
        field_m = null;
        field_q = 0;
    }
}
