/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ao extends rqa {
    static int field_o;

    ao(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final nc a(nc[] param0, int param1) {
        if (param1 > -119) {
            ao.a((byte) -16, false);
        }
        chb.field_a = param0[0].a(108);
        return new nc((Object) (Object) "void");
    }

    final static kua a(cbb param0, int[] param1, int param2, int param3) {
        Object var4 = null;
        int[] var4_array = null;
        Object var5 = null;
        int[] var5_array = null;
        Object var6 = null;
        int[] var6_array = null;
        Object var7 = null;
        float[][] var7_array = null;
        int var8 = 0;
        int[] var14 = null;
        int var15 = 0;
        int var16 = 0;
        int var17_int = 0;
        float var17 = 0.0f;
        int var18_int = 0;
        float var18 = 0.0f;
        int var19_int = 0;
        float var19 = 0.0f;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int[] var24 = null;
        int[] var25 = null;
        int[] var26 = null;
        int[] var32 = null;
        int[] var38 = null;
        int[] var44 = null;
        int[] var45 = null;
        int[] var46 = null;
        int[] var47 = null;
        int[] var48 = null;
        int[] var49 = null;
        int[] var50 = null;
        L0: {
          var23 = VoidHunters.field_G;
          var4 = null;
          if (param3 == -3) {
            break L0;
          } else {
            field_o = 121;
            break L0;
          }
        }
        L1: {
          var5 = null;
          var6 = null;
          var7 = null;
          if (null == param0.field_M) {
            break L1;
          } else {
            var8 = param0.field_B;
            var45 = new int[var8];
            var46 = new int[var8];
            var47 = new int[var8];
            var48 = new int[var8];
            var49 = new int[var8];
            var50 = new int[var8];
            var44 = var50;
            var38 = var44;
            var32 = var38;
            var14 = var32;
            var15 = 0;
            L2: while (true) {
              L3: {
                if (var8 <= var15) {
                  break L3;
                } else {
                  var45[var15] = 2147483647;
                  var46[var15] = -2147483647;
                  var47[var15] = 2147483647;
                  var48[var15] = -2147483647;
                  var49[var15] = 2147483647;
                  var14[var15] = -2147483647;
                  var15++;
                  if (0 == 0) {
                    continue L2;
                  } else {
                    break L3;
                  }
                }
              }
              var24 = new int[var8];
              var4_array = var24;
              var15 = 0;
              L4: while (true) {
                L5: {
                  if (var15 >= param2) {
                    break L5;
                  } else {
                    L6: {
                      var16 = param1[var15];
                      if (-1 == param0.field_M[var16]) {
                        break L6;
                      } else {
                        var17_int = 255 & param0.field_M[var16];
                        var18_int = 0;
                        L7: while (true) {
                          if (var18_int >= 3) {
                            break L6;
                          } else {
                            L8: {
                              L9: {
                                if ((var18_int ^ -1) != -1) {
                                  break L9;
                                } else {
                                  var19_int = param0.field_k[var16];
                                  if (0 == 0) {
                                    break L8;
                                  } else {
                                    break L9;
                                  }
                                }
                              }
                              L10: {
                                if (var18_int != 1) {
                                  break L10;
                                } else {
                                  var19_int = param0.field_o[var16];
                                  if (0 == 0) {
                                    break L8;
                                  } else {
                                    break L10;
                                  }
                                }
                              }
                              var19_int = param0.field_K[var16];
                              break L8;
                            }
                            L11: {
                              var20 = param0.field_v[var19_int];
                              var21 = param0.field_G[var19_int];
                              var22 = param0.field_x[var19_int];
                              if (var20 >= var45[var17_int]) {
                                break L11;
                              } else {
                                var45[var17_int] = var20;
                                break L11;
                              }
                            }
                            L12: {
                              if (var46[var17_int] >= var20) {
                                break L12;
                              } else {
                                var46[var17_int] = var20;
                                break L12;
                              }
                            }
                            L13: {
                              if (var21 < var47[var17_int]) {
                                var47[var17_int] = var21;
                                break L13;
                              } else {
                                break L13;
                              }
                            }
                            L14: {
                              if (var21 <= var48[var17_int]) {
                                break L14;
                              } else {
                                var48[var17_int] = var21;
                                break L14;
                              }
                            }
                            L15: {
                              if (var22 >= var49[var17_int]) {
                                break L15;
                              } else {
                                var49[var17_int] = var22;
                                break L15;
                              }
                            }
                            L16: {
                              var50 = var44;
                              if (var50[var17_int] < var22) {
                                var50[var17_int] = var22;
                                break L16;
                              } else {
                                break L16;
                              }
                            }
                            var18_int++;
                            if (0 == 0) {
                              continue L7;
                            } else {
                              break L6;
                            }
                          }
                        }
                      }
                    }
                    var15++;
                    if (0 == 0) {
                      continue L4;
                    } else {
                      break L5;
                    }
                  }
                }
                var26 = new int[var8];
                var6_array = var26;
                var25 = new int[var8];
                var5_array = var25;
                var7_array = new float[var8][];
                var15 = 0;
                L17: while (true) {
                  if (var8 <= var15) {
                    break L1;
                  } else {
                    L18: {
                      var16 = param0.field_e[var15];
                      if (var16 > 0) {
                        L19: {
                          L20: {
                            var24[var15] = (var45[var15] - -var46[var15]) / 2;
                            var25[var15] = (var47[var15] - -var48[var15]) / 2;
                            var26[var15] = (var49[var15] + param1[var15]) / 2;
                            if (1 == var16) {
                              break L20;
                            } else {
                              L21: {
                                if (var16 == 2) {
                                  break L21;
                                } else {
                                  var19 = (float)param0.field_C[var15] / 1024.0f;
                                  var18 = (float)param0.field_a[var15] / 1024.0f;
                                  var17 = (float)param0.field_F[var15] / 1024.0f;
                                  if (0 == 0) {
                                    break L19;
                                  } else {
                                    break L21;
                                  }
                                }
                              }
                              var19 = 64.0f / (float)param0.field_C[var15];
                              var18 = 64.0f / (float)param0.field_a[var15];
                              var17 = 64.0f / (float)param0.field_F[var15];
                              if (0 == 0) {
                                break L19;
                              } else {
                                break L20;
                              }
                            }
                          }
                          L22: {
                            L23: {
                              var20 = param0.field_F[var15];
                              if (0 != var20) {
                                break L23;
                              } else {
                                var19 = 1.0f;
                                var17 = 1.0f;
                                if (0 == 0) {
                                  break L22;
                                } else {
                                  break L23;
                                }
                              }
                            }
                            L24: {
                              if (var20 > 0) {
                                break L24;
                              } else {
                                var19 = 1.0f;
                                var17 = (float)(-var20) / 1024.0f;
                                if (0 == 0) {
                                  break L22;
                                } else {
                                  break L24;
                                }
                              }
                            }
                            var19 = (float)var20 / 1024.0f;
                            var17 = 1.0f;
                            break L22;
                          }
                          var18 = 64.0f / (float)param0.field_a[var15];
                          break L19;
                        }
                        var7_array[var15] = ck.a(var19, 0, (int) param0.field_t[var15], dla.a((int) param0.field_J[var15], 255), var18, (int) param0.field_i[var15], (int) param0.field_H[var15], var17);
                        break L18;
                      } else {
                        break L18;
                      }
                    }
                    var15++;
                    if (0 == 0) {
                      continue L17;
                    } else {
                      break L1;
                    }
                  }
                }
              }
            }
          }
        }
        return new kua(var4_array, var5_array, var6_array, var7_array);
    }

    final static void a(byte param0, boolean param1) {
        if (wq.e((byte) 105)) {
            param1 = false;
        }
        mc.a(-119, param1);
        ria.e((byte) 89);
        int var2 = 103 / ((param0 - -19) / 55);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = 0;
    }
}
