/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ci extends se {
    static gb field_k;
    static String field_j;
    static db field_i;

    ci(ga param0) {
        super(param0);
    }

    final oi a(String param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        CharSequence var5 = null;
        oi stackIn_2_0 = null;
        oi stackIn_7_0 = null;
        oi stackIn_10_0 = null;
        oi stackIn_12_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var4 = (CharSequence) ((Object) param0);
            if (cd.a(var4, (byte) -117)) {
              L1: {
                var5 = (CharSequence) ((Object) param0);
                var3_int = ti.a(param1 ^ -30, var5);
                if (var3_int <= 0) {
                  break L1;
                } else {
                  if (-131 > (var3_int ^ -1)) {
                    break L1;
                  } else {
                    if (param1 == -122) {
                      stackIn_12_0 = ih.field_b;
                      decompiledRegionSelector0 = 3;
                      break L0;
                    } else {
                      stackIn_10_0 = (oi) null;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    }
                  }
                }
              }
              stackIn_7_0 = rk.field_c;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = rk.field_c;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var3);

            stackIn_15_1 = new StringBuilder().append("ci.G(");

            if (param0 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L2;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L2;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_10_0;
            } else {
              return stackIn_12_0;
            }
          }
        }
    }

    final static dl[] a(int param0, int param1, byte param2, int param3, int param4) {
        if (param2 != -70) {
          field_j = (String) null;
          return rc.a(3, 1, param1, param3, 1, param0, param4, param2 ^ -3020, 1);
        } else {
          return rc.a(3, 1, param1, param3, 1, param0, param4, param2 ^ -3020, 1);
        }
    }

    final static String a(String[] args, String param1, int param2) {
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        String stackIn_13_0 = null;
        int stackIn_19_0 = 0;
        String stackIn_29_0 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        StringBuilder stackIn_35_1 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_36_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        StringBuilder var6 = null;
        int var7 = 0;
        String var7_ref_String = null;
        int var8 = 0;
        String var9 = null;
        int var10 = 0;
        int var11 = 0;
        var11 = CrazyCrystals.field_B;
        try {
          L0: {
            var3_int = param1.length();
            var4 = var3_int;
            var5 = 0;
            L1: while (true) {
              var6_int = param1.indexOf("<%", var5);
              if (-1 < (var6_int ^ -1)) {
                var6 = new StringBuilder(var4);
                var7 = 0;
                if (param2 == 3) {
                  var5 = 0;
                  L2: while (true) {
                    var8 = param1.indexOf("<%", var5);
                    if (0 <= var8) {
                      stackIn_19_0 = var8 + 2;
                      var5 = stackIn_19_0;
                      L3: while (true) {
                        L4: {
                          if (var3_int <= var5) {
                            break L4;
                          } else {
                            if (!ag.a(param1.charAt(var5), 48)) {
                              break L4;
                            } else {
                              var5++;
                              continue L3;
                            }
                          }
                        }
                        var9 = param1.substring(var8 - -2, var5);
                        if (!cd.a((CharSequence) ((Object) var9), (byte) -112)) {
                          continue L2;
                        } else {
                          if ((var3_int ^ -1) >= (var5 ^ -1)) {
                            continue L2;
                          } else {
                            if (param1.charAt(var5) == 62) {
                              var5++;
                              var10 = ti.a(100, (CharSequence) ((Object) var9));
                              discarded$0 = var6.append(param1.substring(var7, var8));
                              var7 = var5;
                              discarded$1 = var6.append(args[var10]);
                              continue L2;
                            } else {
                              continue L2;
                            }
                          }
                        }
                      }
                    } else {
                      discarded$2 = var6.append(param1.substring(var7));
                      stackIn_29_0 = var6.toString();
                      decompiledRegionSelector0 = 1;
                      break L0;
                    }
                  }
                } else {
                  stackIn_13_0 = (String) null;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              } else {
                var5 = var6_int - -2;
                L5: while (true) {
                  L6: {
                    if (var3_int <= var5) {
                      break L6;
                    } else {
                      if (!ag.a(param1.charAt(var5), 48)) {
                        break L6;
                      } else {
                        var5++;
                        continue L5;
                      }
                    }
                  }
                  var7_ref_String = param1.substring(2 + var6_int, var5);
                  if (!cd.a((CharSequence) ((Object) var7_ref_String), (byte) -109)) {
                    continue L1;
                  } else {
                    if (var5 >= var3_int) {
                      continue L1;
                    } else {
                      if (param1.charAt(var5) != 62) {
                        continue L1;
                      } else {
                        var5++;
                        var8 = ti.a(param2 ^ 103, (CharSequence) ((Object) var7_ref_String));
                        var4 = var4 + (args[var8].length() + (var6_int + -var5));
                        continue L1;
                      }
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3 = decompiledCaughtException;
            stackIn_32_0 = (RuntimeException) (var3);

            stackIn_32_1 = new StringBuilder().append("ci.I(");

            if (args == null) {
              stackIn_33_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "null";
              break L7;
            } else {
              stackIn_33_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "{...}";
              break L7;
            }
          }
          L8: {


            stackIn_35_1 = ((StringBuilder) (Object) stackIn_33_1).append(stackIn_33_2).append(',');

            if (param1 == null) {
              stackIn_33_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackIn_36_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackIn_36_2 = "null";
              break L8;
            } else {
              stackIn_33_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackIn_36_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackIn_36_2 = "{...}";
              break L8;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_33_0), stackIn_36_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_13_0;
        } else {
          return stackIn_29_0;
        }
    }

    final String a(String param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        String stackIn_2_0 = null;
        Object stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (this.a(param0, (byte) -122) != rk.field_c) {
              var3_int = 14 / ((41 - param1) / 49);
              stackIn_4_0 = null;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = bh.field_d;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var3);

            stackIn_7_1 = new StringBuilder().append("ci.H(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return (String) ((Object) stackIn_4_0);
        }
    }

    public static void d(int param0) {
        int var1 = -12 % ((param0 - -6) / 48);
        field_i = null;
        field_k = null;
        field_j = null;
    }

    final static void a(int param0, int param1, boolean param2, int param3, int param4) {
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        var13 = CrazyCrystals.field_B;
        try {
          L0: {
            L1: {
              var5_int = param4 + param0;
              var6 = param1 - -param3;
              if (param0 > kh.field_c) {
                stackIn_4_0 = param0;
                break L1;
              } else {
                stackIn_4_0 = kh.field_c;
                break L1;
              }
            }
            L2: {
              var7 = stackIn_4_0;
              if (param1 > kh.field_b) {
                stackIn_7_0 = param1;
                break L2;
              } else {
                stackIn_7_0 = kh.field_b;
                break L2;
              }
            }
            L3: {
              var8 = stackIn_7_0;
              if (var5_int >= kh.field_g) {
                stackIn_10_0 = kh.field_g;
                break L3;
              } else {
                stackIn_10_0 = var5_int;
                break L3;
              }
            }
            L4: {
              var9 = stackIn_10_0;
              if (var6 >= kh.field_j) {
                stackIn_13_0 = kh.field_j;
                break L4;
              } else {
                stackIn_13_0 = var6;
                break L4;
              }
            }
            L5: {
              var10 = stackIn_13_0;
              if (param0 < kh.field_c) {
                break L5;
              } else {
                if (kh.field_g <= param0) {
                  break L5;
                } else {
                  var11 = param0 + kh.field_l * var8;
                  var12 = 1 + var10 + -var8 >> 690746817;
                  L6: while (true) {
                    var12--;
                    if (-1 < (var12 ^ -1)) {
                      break L5;
                    } else {
                      kh.field_i[var11] = 16777215;
                      var11 = var11 + kh.field_l * 2;
                      continue L6;
                    }
                  }
                }
              }
            }
            L7: {
              if (kh.field_b > param1) {
                break L7;
              } else {
                if (kh.field_j > var6) {
                  var11 = param1 * kh.field_l + var7;
                  var12 = -var7 + 1 - -var9 >> -1089102623;
                  L8: while (true) {
                    var12--;
                    if (-1 < (var12 ^ -1)) {
                      break L7;
                    } else {
                      kh.field_i[var11] = 16777215;
                      var11 += 2;
                      continue L8;
                    }
                  }
                } else {
                  break L7;
                }
              }
            }
            L9: {
              if (!param2) {
                break L9;
              } else {
                field_i = (db) null;
                break L9;
              }
            }
            L10: {
              if (var5_int < kh.field_c) {
                break L10;
              } else {
                if (var5_int < kh.field_g) {
                  var11 = (var8 + (1 & -param0 + var5_int)) * kh.field_l + var5_int;
                  var12 = -var8 + 1 + var10 >> 1275402529;
                  L11: while (true) {
                    var12--;
                    if (-1 < (var12 ^ -1)) {
                      break L10;
                    } else {
                      kh.field_i[var11] = 16777215;
                      var11 = var11 + 2 * kh.field_l;
                      continue L11;
                    }
                  }
                } else {
                  break L10;
                }
              }
            }
            L12: {
              if (kh.field_b > param1) {
                break L12;
              } else {
                if (var6 < kh.field_j) {
                  var11 = var7 + (var6 * kh.field_l - -(var6 + -param1 & 1));
                  var12 = -var7 + var9 + 1 >> 1887266785;
                  L13: while (true) {
                    var12--;
                    if ((var12 ^ -1) > -1) {
                      break L12;
                    } else {
                      kh.field_i[var11] = 16777215;
                      var11 += 2;
                      continue L13;
                    }
                  }
                } else {
                  return;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw dn.a((Throwable) ((Object) var5), "ci.E(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    static {
        field_j = "Unable to connect to the data server. Please check any firewall you are using.";
    }
}
