/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dd extends u {
    static boolean field_j;
    static String field_o;
    private String field_i;
    static int field_l;
    static int[] field_k;
    static int[] field_h;
    static String field_n;
    private String field_m;
    static ah field_g;

    final db b(byte param0) {
        if (param0 != -98) {
            this.b((byte) 93);
        }
        return ll.field_p;
    }

    public static void a(boolean param0) {
        field_g = null;
        if (param0) {
            return;
        }
        field_h = null;
        field_k = null;
        field_n = null;
        field_o = null;
    }

    final void a(od param0, int param1) {
        try {
            param0.a(-23805, this.field_m);
            if (param1 < 19) {
                dd.a(true);
            }
            param0.b(1, this.field_i);
        } catch (RuntimeException runtimeException) {
            throw ie.a((Throwable) ((Object) runtimeException), "dd.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void a(byte param0, java.applet.Applet param1) {
        String var2 = null;
        String var3 = null;
        long var4 = 0L;
        try {
            if (param0 < 44) {
                dd.a(false);
            }
            aj.field_c = true;
            var2 = "tuhstatbut";
            var3 = "rvnadlm";
            var4 = -1L;
            jk.a(0, var3, var4, param1, var2);
        } catch (RuntimeException runtimeException) {
            throw ie.a((Throwable) ((Object) runtimeException), "dd.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    dd(String param0, String param1) {
        try {
            this.field_i = param1;
            this.field_m = param0;
        } catch (RuntimeException runtimeException) {
            throw ie.a((Throwable) ((Object) runtimeException), "dd.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, byte param6, ja param7) {
        int stackIn_17_0 = 0;
        int[] stackIn_19_0 = null;
        int[] stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        int stackIn_26_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_32_0 = 0;
        ej stackIn_39_0 = null;
        int stackIn_44_0 = 0;
        int stackIn_48_0 = 0;
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        RuntimeException stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        String stackIn_54_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] var8 = null;
        RuntimeException var8_ref = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        ej var21 = null;
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
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        int var39 = 0;
        int var40 = 0;
        int[] var41 = null;
        ja var44 = null;
        int[] var49 = null;
        int[] var54 = null;
        byte[] var60 = null;
        int[] var61 = null;
        int[] var62 = null;
        int[] var63 = null;
        int[] var64 = null;
        var40 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                var44 = param7;
                if (var44.field_O == null) {
                  break L2;
                } else {
                  if ((var44.field_G ^ -1) < -2) {
                    var60 = var44.field_O;
                    li.a(var60, 63, uh.field_h, 0, 0);
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              qb.a(0);
              break L1;
            }
            L3: {
              var54 = new int[param7.field_H];
              var49 = var54;
              var41 = var49;
              var8 = var41;
              var64 = new int[param7.field_H];
              var62 = jd.field_L;
              if (param6 == -81) {
                break L3;
              } else {
                field_g = (ah) null;
                break L3;
              }
            }
            var61 = k.field_I;
            var63 = field_k;
            var13 = 0;
            L4: while (true) {
              if (param7.field_H <= var13) {
                var13 = 0;
                L5: while (true) {
                  if (eg.field_i <= var13) {
                    break L0;
                  } else {
                    L6: {
                      var14 = p.field_c[var13];
                      var15 = param7.field_h[var14];
                      var16 = param7.field_a[var14];
                      var17 = param7.field_K[var14];
                      if (jd.field_L.length <= param7.field_A[var14]) {
                        stackIn_26_0 = -1;
                        break L6;
                      } else {
                        stackIn_26_0 = param7.field_A[var14];
                        break L6;
                      }
                    }
                    L7: {
                      var18 = stackIn_26_0;
                      if (jd.field_L.length <= param7.field_l[var14]) {
                        stackIn_29_0 = -1;
                        break L7;
                      } else {
                        stackIn_29_0 = param7.field_l[var14];
                        break L7;
                      }
                    }
                    L8: {
                      var19 = stackIn_29_0;
                      if (jd.field_L.length > param7.field_e[var14]) {
                        stackIn_32_0 = param7.field_e[var14];
                        break L8;
                      } else {
                        stackIn_32_0 = -1;
                        break L8;
                      }
                    }
                    L9: {
                      L10: {
                        var20 = stackIn_32_0;
                        if (dm.field_B == null) {
                          break L10;
                        } else {
                          if (param7.field_M == null) {
                            break L10;
                          } else {
                            if (var14 >= param7.field_M.length) {
                              break L10;
                            } else {
                              if ((param7.field_M[var14] ^ -1) == 0) {
                                break L10;
                              } else {
                                if (param7.field_M[var14] >= dm.field_B.length) {
                                  break L10;
                                } else {
                                  stackIn_39_0 = dm.field_B[param7.field_M[var14]];
                                  break L9;
                                }
                              }
                            }
                          }
                        }
                      }
                      stackIn_39_0 = null;
                      break L9;
                    }
                    L11: {
                      L12: {
                        var21 = stackIn_39_0;
                        var22 = fa.field_j[var15];
                        var23 = gf.field_p[var15];
                        var24 = fa.field_j[var16];
                        var25 = gf.field_p[var16];
                        var26 = fa.field_j[var17];
                        var27 = gf.field_p[var17];
                        if (var18 != var19) {
                          break L12;
                        } else {
                          if (var19 != var20) {
                            break L12;
                          } else {
                            L13: {
                              var28 = var54[var18];
                              var29 = var64[var18];
                              if (var21 == null) {
                                stackIn_44_0 = 8355711;
                                break L13;
                              } else {
                                stackIn_44_0 = var21.field_d;
                                break L13;
                              }
                            }
                            var30 = stackIn_44_0;
                            var31 = var30 & 16711935;
                            var32 = 65280 & var30;
                            var33 = -620822273 & var28 * var31 >>> -1188867864 | var28 * var32 >>> -2040585368 & -486473984;
                            var33 = var33 + var29 * 65793;
                            kc.a(var33 >> -590145471 & 8355711, var22, var24, var25, var27, var23, var26, 28183);
                            break L11;
                          }
                        }
                      }
                      L14: {
                        var28 = var54[var18];
                        var29 = var54[var19];
                        var30 = var54[var20];
                        var31 = var64[var18];
                        var32 = var64[var19];
                        var33 = var64[var20];
                        if (var21 == null) {
                          stackIn_48_0 = 8355711;
                          break L14;
                        } else {
                          stackIn_48_0 = var21.field_d;
                          break L14;
                        }
                      }
                      var34 = stackIn_48_0;
                      var35 = var34 & 16711935;
                      var36 = var34 & 65280;
                      var37 = 1895760127 & var28 * var35 >>> 1821534664 | (var36 * var28 & 16711786) >>> -400371672;
                      var38 = 1627324671 & var29 * var35 >>> -1785578808 | var29 * var36 >>> 283541512 & -1845428480;
                      var39 = (-16711848 & var30 * var35) >>> 759354056 | (var30 * var36 & 16711791) >>> 1042819112;
                      var37 = var37 + var31 * 65793;
                      var38 = var38 + var32 * 65793;
                      var39 = var39 + var33 * 65793;
                      ie.a(var24, var23, (var39 & 65516) >> -1776054264, var22, (byte) -38, var37 >> -2068565048 & 255, var38 >> -1063008496, var37 & 255, var37 >> 901474416, var39 >> -1759881552, 255 & var39, (var38 & 65513) >> -802365816, 255 & var38, var25, var27, var26);
                      break L11;
                    }
                    var13++;
                    continue L5;
                  }
                }
              } else {
                L15: {
                  var14 = param0 * var61[var13] + (param3 * var62[var13] + var63[var13] * param4) >> 1879963144;
                  if (-1 >= (var14 ^ -1)) {
                    break L15;
                  } else {
                    var14 = -var14;
                    break L15;
                  }
                }
                L16: {
                  if (var14 < 0) {
                    stackIn_17_0 = 128;
                    break L16;
                  } else {
                    if (-129 >= (var14 ^ -1)) {
                      stackIn_17_0 = 256;
                      break L16;
                    } else {
                      stackIn_17_0 = 128 - -var14;
                      break L16;
                    }
                  }
                }
                L17: {
                  var14 = stackIn_17_0;
                  var15 = param2 * var63[var13] + param5 * var62[var13] + var61[var13] * param1 >> 1940694440;
                  stackIn_19_0 = fc.field_b;

                  if (-1 >= (var15 ^ -1)) {
                    stackIn_20_0 = (int[]) ((Object) stackIn_19_0);
                    stackIn_20_1 = var15;
                    break L17;
                  } else {
                    stackIn_20_0 = (int[]) ((Object) stackIn_19_0);
                    stackIn_20_1 = -var15;
                    break L17;
                  }
                }
                var15 = stackIn_20_0[stackIn_20_1];
                var14 = (-var15 + 256) * var14 >>> 1816208904;
                var54[var13] = var14;
                var64[var13] = var15;
                var13++;
                continue L4;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L18: {
            var8_ref = decompiledCaughtException;
            stackIn_53_0 = (RuntimeException) (var8_ref);

            stackIn_53_1 = new StringBuilder().append("dd.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',');

            if (param7 == null) {
              stackIn_54_0 = (RuntimeException) ((Object) stackIn_53_0);
              stackIn_54_1 = (StringBuilder) ((Object) stackIn_53_1);
              stackIn_54_2 = "null";
              break L18;
            } else {
              stackIn_54_0 = (RuntimeException) ((Object) stackIn_53_0);
              stackIn_54_1 = (StringBuilder) ((Object) stackIn_53_1);
              stackIn_54_2 = "{...}";
              break L18;
            }
          }
          throw ie.a((Throwable) ((Object) stackIn_54_0), stackIn_54_2 + ')');
        }
    }

    static {
        field_l = 0;
        field_o = "Service unavailable";
        field_k = new int[8192];
        field_h = new int[]{30, 14, 5, 0, 8, 0, 0, 0, 0, 0, 0, 6, 0, 56, 54, 1, 6, 3, 2, 25, 25, 25, 25, 25, 25, 25, 25, 56, 0, 56, 25, 0, 0, 0, 0, 30, 0, 0, 14, 5, 8, 0, 0, 0, 0, 0, 0, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 25, 25, 25, 25, 25, 25, 25, 25, 56, 25, 56, 25};
        field_n = "Unfortunately we are unable to create an account for you at this time.";
    }
}
