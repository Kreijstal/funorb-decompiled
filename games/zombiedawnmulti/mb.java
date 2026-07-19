/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mb extends br {
    int field_m;
    int field_v;
    static String field_g;
    int field_i;
    int field_E;
    static boolean[][] field_k;
    int field_t;
    static ja field_j;
    static int[] field_n;
    int field_o;
    uj field_C;
    int field_B;
    nj field_h;
    int field_l;
    po field_x;
    int field_D;
    int field_A;
    int field_p;
    int field_q;
    int field_w;
    static String field_u;
    int field_y;
    jd field_f;
    int field_r;
    int field_s;
    int field_z;

    final static int a(fm param0, boolean param1, String param2, String[] param3, int param4) {
        int incrementValue$3 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
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
        int var14 = 0;
        int var15 = 0;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_28_0 = 0;
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
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_38_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_7_0 = 0;
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
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        String stackOut_37_2 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        String stackOut_36_2 = null;
        var13 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              var5_int = param0.a(param2);
              if (var5_int > param4) {
                break L1;
              } else {
                if ((param2.indexOf("<br>") ^ -1) == 0) {
                  param3[0] = param2;
                  stackOut_4_0 = 1;
                  stackIn_5_0 = stackOut_4_0;
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            var6 = (param4 + (var5_int + -1)) / param4;
            param4 = var5_int / var6;
            if (!param1) {
              var6 = 0;
              var7 = 0;
              var8 = param2.length();
              var9 = 0;
              L2: while (true) {
                L3: {
                  L4: {
                    L5: {
                      if (var9 >= var8) {
                        break L5;
                      } else {
                        var10 = param2.charAt(var9);
                        var15 = var10 ^ -1;
                        var14 = -33;
                        if (var13 != 0) {
                          if (var14 < var15) {
                            break L4;
                          } else {
                            break L3;
                          }
                        } else {
                          L6: {
                            L7: {
                              if (var14 == var15) {
                                break L7;
                              } else {
                                if (var10 != 45) {
                                  break L6;
                                } else {
                                  break L7;
                                }
                              }
                            }
                            var11 = param2.substring(var7, 1 + var9).trim();
                            var12 = param0.a(var11);
                            if (var12 < param4) {
                              break L6;
                            } else {
                              var7 = 1 + var9;
                              incrementValue$3 = var6;
                              var6++;
                              param3[incrementValue$3] = var11;
                              break L6;
                            }
                          }
                          L8: {
                            if (var10 != 62) {
                              break L8;
                            } else {
                              if (!param2.regionMatches(var9 + -3, "<br>", 0, 4)) {
                                break L8;
                              } else {
                                incrementValue$4 = var6;
                                var6++;
                                param3[incrementValue$4] = param2.substring(var7, -3 + var9).trim();
                                var7 = var9 - -1;
                                break L8;
                              }
                            }
                          }
                          var9++;
                          if (var13 == 0) {
                            continue L2;
                          } else {
                            break L5;
                          }
                        }
                      }
                    }
                    if (var8 > var7) {
                      break L4;
                    } else {
                      break L3;
                    }
                  }
                  incrementValue$5 = var6;
                  var6++;
                  param3[incrementValue$5] = param2.substring(var7, var8).trim();
                  break L3;
                }
                stackOut_27_0 = var6;
                stackIn_28_0 = stackOut_27_0;
                decompiledRegionSelector0 = 2;
                break L0;
              }
            } else {
              stackOut_7_0 = 66;
              stackIn_8_0 = stackOut_7_0;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var5 = decompiledCaughtException;
            stackOut_29_0 = (RuntimeException) (var5);
            stackOut_29_1 = new StringBuilder().append("mb.A(");
            stackIn_31_0 = stackOut_29_0;
            stackIn_31_1 = stackOut_29_1;
            stackIn_30_0 = stackOut_29_0;
            stackIn_30_1 = stackOut_29_1;
            if (param0 == null) {
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
            stackOut_32_1 = ((StringBuilder) (Object) stackIn_32_1).append(stackIn_32_2).append(',').append(param1).append(',');
            stackIn_34_0 = stackOut_32_0;
            stackIn_34_1 = stackOut_32_1;
            stackIn_33_0 = stackOut_32_0;
            stackIn_33_1 = stackOut_32_1;
            if (param2 == null) {
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
          L11: {
            stackOut_35_0 = (RuntimeException) ((Object) stackIn_35_0);
            stackOut_35_1 = ((StringBuilder) (Object) stackIn_35_1).append(stackIn_35_2).append(',');
            stackIn_37_0 = stackOut_35_0;
            stackIn_37_1 = stackOut_35_1;
            stackIn_36_0 = stackOut_35_0;
            stackIn_36_1 = stackOut_35_1;
            if (param3 == null) {
              stackOut_37_0 = (RuntimeException) ((Object) stackIn_37_0);
              stackOut_37_1 = (StringBuilder) ((Object) stackIn_37_1);
              stackOut_37_2 = "null";
              stackIn_38_0 = stackOut_37_0;
              stackIn_38_1 = stackOut_37_1;
              stackIn_38_2 = stackOut_37_2;
              break L11;
            } else {
              stackOut_36_0 = (RuntimeException) ((Object) stackIn_36_0);
              stackOut_36_1 = (StringBuilder) ((Object) stackIn_36_1);
              stackOut_36_2 = "{...}";
              stackIn_38_0 = stackOut_36_0;
              stackIn_38_1 = stackOut_36_1;
              stackIn_38_2 = stackOut_36_2;
              break L11;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_38_0), stackIn_38_2 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0;
          } else {
            return stackIn_28_0;
          }
        }
    }

    final static int a(byte param0, int param1) {
        int var2 = 0;
        if (param0 == -31) {
          var2 = 0;
          if (param1 >= 0) {
            if ((param1 ^ -1) <= -65537) {
              L0: {
                var2 += 16;
                param1 = param1 >>> 16;
                if ((param1 ^ -1) <= -257) {
                  param1 = param1 >>> 8;
                  var2 += 8;
                  break L0;
                } else {
                  break L0;
                }
              }
              L1: {
                if (param1 < 16) {
                  break L1;
                } else {
                  param1 = param1 >>> 4;
                  var2 += 4;
                  break L1;
                }
              }
              L2: {
                if (4 > param1) {
                  break L2;
                } else {
                  var2 += 2;
                  param1 = param1 >>> 2;
                  break L2;
                }
              }
              L3: {
                if (1 > param1) {
                  break L3;
                } else {
                  var2++;
                  param1 = param1 >>> 1;
                  break L3;
                }
              }
              return var2 - -param1;
            } else {
              L4: {
                if ((param1 ^ -1) <= -257) {
                  param1 = param1 >>> 8;
                  var2 += 8;
                  break L4;
                } else {
                  break L4;
                }
              }
              L5: {
                if (param1 < 16) {
                  break L5;
                } else {
                  param1 = param1 >>> 4;
                  var2 += 4;
                  break L5;
                }
              }
              L6: {
                if (4 > param1) {
                  break L6;
                } else {
                  var2 += 2;
                  param1 = param1 >>> 2;
                  break L6;
                }
              }
              L7: {
                if (1 > param1) {
                  break L7;
                } else {
                  var2++;
                  param1 = param1 >>> 1;
                  break L7;
                }
              }
              return var2 - -param1;
            }
          } else {
            L8: {
              var2 += 16;
              param1 = param1 >>> 16;
              if ((param1 ^ -1) <= -257) {
                param1 = param1 >>> 8;
                var2 += 8;
                break L8;
              } else {
                break L8;
              }
            }
            L9: {
              if (param1 < 16) {
                break L9;
              } else {
                param1 = param1 >>> 4;
                var2 += 4;
                break L9;
              }
            }
            L10: {
              if (4 > param1) {
                break L10;
              } else {
                var2 += 2;
                param1 = param1 >>> 2;
                break L10;
              }
            }
            L11: {
              if (1 > param1) {
                break L11;
              } else {
                var2++;
                param1 = param1 >>> 1;
                break L11;
              }
            }
            return var2 - -param1;
          }
        } else {
          return -96;
        }
    }

    final void a(byte param0) {
        this.field_x = null;
        if (param0 != 71) {
          this.field_l = -91;
          this.field_f = null;
          this.field_h = null;
          this.field_C = null;
          return;
        } else {
          this.field_f = null;
          this.field_h = null;
          this.field_C = null;
          return;
        }
    }

    public static void b(boolean param0) {
        field_n = null;
        if (param0) {
          field_j = (ja) null;
          field_k = (boolean[][]) null;
          field_j = null;
          field_g = null;
          field_u = null;
          return;
        } else {
          field_k = (boolean[][]) null;
          field_j = null;
          field_g = null;
          field_u = null;
          return;
        }
    }

    mb() {
    }

    static {
        field_g = "Please log in to access this feature.";
        field_n = new int[]{0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, 2147483647, -1};
        field_u = "The following settings need to be changed:  ";
    }
}
