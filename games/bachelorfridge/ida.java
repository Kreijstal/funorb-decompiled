/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ida extends at {
    static String field_o;
    int field_l;
    int field_j;
    int field_q;
    int field_r;
    int field_k;
    gj field_s;
    int field_n;
    int field_m;
    nq field_p;

    final static String a(int param0, byte[] param1, int param2, int param3) {
        RuntimeException var4 = null;
        char[] var4_array = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        char[] var11 = null;
        char[] var12 = null;
        char[] var13 = null;
        char[] var14 = null;
        char[] var15 = null;
        String stackIn_37_0 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_41_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_36_0 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        String stackOut_40_2 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        String stackOut_39_2 = null;
        var10 = BachelorFridge.field_y;
        try {
          L0: {
            var15 = new char[param0];
            var14 = var15;
            var13 = var14;
            var12 = var13;
            var11 = var12;
            var4_array = var11;
            var5 = 0;
            var6 = param2;
            var7 = param2 - -param0;
            L1: while (true) {
              if (var7 <= var6) {
                stackOut_36_0 = new String(var15, 0, var5);
                stackIn_37_0 = stackOut_36_0;
                break L0;
              } else {
                L2: {
                  int incrementValue$8 = var6;
                  var6++;
                  var8 = param1[incrementValue$8] & 255;
                  if (var8 >= 128) {
                    if (var8 >= 192) {
                      if (var8 >= 224) {
                        if (240 > var8) {
                          L3: {
                            if (1 + var6 >= var7) {
                              break L3;
                            } else {
                              if ((192 & param1[var6]) != 128) {
                                break L3;
                              } else {
                                if ((param1[1 + var6] & 192) == 128) {
                                  int incrementValue$9 = var6;
                                  var6++;
                                  int incrementValue$10 = var6;
                                  var6++;
                                  var9 = param1[incrementValue$9] << 6 & 4032 | var8 << 12 & 61440 | 63 & param1[incrementValue$10];
                                  if (var9 >= 2048) {
                                    break L2;
                                  } else {
                                    var9 = 65533;
                                    break L2;
                                  }
                                } else {
                                  break L3;
                                }
                              }
                            }
                          }
                          var9 = 65533;
                          break L2;
                        } else {
                          if (var8 >= 248) {
                            var9 = 65533;
                            break L2;
                          } else {
                            L4: {
                              if (~(var6 - -2) <= ~var7) {
                                break L4;
                              } else {
                                if (128 != (192 & param1[var6])) {
                                  break L4;
                                } else {
                                  if ((param1[1 + var6] & 192) != 128) {
                                    break L4;
                                  } else {
                                    if ((param1[2 + var6] & 192) != 128) {
                                      break L4;
                                    } else {
                                      L5: {
                                        int incrementValue$11 = var6;
                                        var6++;
                                        int incrementValue$12 = var6;
                                        var6++;
                                        int incrementValue$13 = var6;
                                        var6++;
                                        var9 = 258048 & param1[incrementValue$11] << 12 | 1835008 & var8 << 18 | 4032 & param1[incrementValue$12] << 6 | param1[incrementValue$13] & 63;
                                        if (var9 < 65536) {
                                          break L5;
                                        } else {
                                          if (var9 > 1114111) {
                                            break L5;
                                          } else {
                                            var9 = 65533;
                                            break L2;
                                          }
                                        }
                                      }
                                      var9 = 65533;
                                      break L2;
                                    }
                                  }
                                }
                              }
                            }
                            var9 = 65533;
                            break L2;
                          }
                        }
                      } else {
                        L6: {
                          if (var7 <= var6) {
                            break L6;
                          } else {
                            if (128 != (192 & param1[var6])) {
                              break L6;
                            } else {
                              int incrementValue$14 = var6;
                              var6++;
                              var9 = (var8 & 31) << 6 | 63 & param1[incrementValue$14];
                              if (var9 < 128) {
                                var9 = 65533;
                                break L2;
                              } else {
                                break L2;
                              }
                            }
                          }
                        }
                        var9 = 65533;
                        break L2;
                      }
                    } else {
                      var9 = 65533;
                      break L2;
                    }
                  } else {
                    if (0 != var8) {
                      var9 = var8;
                      break L2;
                    } else {
                      var9 = 65533;
                      break L2;
                    }
                  }
                }
                int incrementValue$15 = var5;
                var5++;
                var11[incrementValue$15] = (char)var9;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var4 = decompiledCaughtException;
            stackOut_38_0 = (RuntimeException) var4;
            stackOut_38_1 = new StringBuilder().append("ida.G(").append(param0).append(44);
            stackIn_40_0 = stackOut_38_0;
            stackIn_40_1 = stackOut_38_1;
            stackIn_39_0 = stackOut_38_0;
            stackIn_39_1 = stackOut_38_1;
            if (param1 == null) {
              stackOut_40_0 = (RuntimeException) (Object) stackIn_40_0;
              stackOut_40_1 = (StringBuilder) (Object) stackIn_40_1;
              stackOut_40_2 = "null";
              stackIn_41_0 = stackOut_40_0;
              stackIn_41_1 = stackOut_40_1;
              stackIn_41_2 = stackOut_40_2;
              break L7;
            } else {
              stackOut_39_0 = (RuntimeException) (Object) stackIn_39_0;
              stackOut_39_1 = (StringBuilder) (Object) stackIn_39_1;
              stackOut_39_2 = "{...}";
              stackIn_41_0 = stackOut_39_0;
              stackIn_41_1 = stackOut_39_1;
              stackIn_41_2 = stackOut_39_2;
              break L7;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_41_0, stackIn_41_2 + 44 + param2 + 44 + 258048 + 41);
        }
        return stackIn_37_0;
    }

    public static void b(boolean param0) {
        field_o = null;
    }

    final static kv[] a(int param0, int param1, int param2, int param3) {
        if (param1 > -13) {
            return null;
        }
        return to.a(param0, param2, -25974, 1, param3);
    }

    final static pn a(int param0, vr param1, int param2) {
        RuntimeException var3 = null;
        pn stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        pn stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == 0) {
                break L1;
              } else {
                field_o = null;
                break L1;
              }
            }
            stackOut_2_0 = vw.field_a[param2];
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("ida.F(").append(param0).append(44);
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + param2 + 41);
        }
        return stackIn_3_0;
    }

    final boolean d(byte param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 >= -109) {
          L0: {
            ((ida) this).field_l = 82;
            if (((ida) this).field_n <= ((ida) this).field_q) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (((ida) this).field_n <= ((ida) this).field_q) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    final void a(int param0, int param1, int param2) {
        int var5 = BachelorFridge.field_y;
        aga var4 = ((ida) this).field_p.a(64, ((ida) this).field_s.field_h);
        ad discarded$0 = ((ida) this).field_s.b(var4, -23990);
        ((ida) this).field_l = 0;
        ((ida) this).field_j = 0;
        ((ida) this).field_n = 0;
        if (param0 == 2) {
            ((ida) this).field_l = -param1;
            return;
        }
        if (param0 != 1) {
            if (4 == param0) {
                ((ida) this).field_l = param1;
                return;
            }
            if (param0 != 3) {
                return;
            }
            ((ida) this).field_j = param1;
            return;
        }
        ((ida) this).field_j = -param1;
    }

    final static n a(String param0, int param1) {
        RuntimeException var2 = null;
        Object var3 = null;
        n stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        n stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == -203) {
                break L1;
              } else {
                var3 = null;
                n discarded$2 = ida.a((String) null, -32);
                break L1;
              }
            }
            stackOut_2_0 = new n(param0);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var2;
            stackOut_4_1 = new StringBuilder().append("ida.C(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + param1 + 41);
        }
        return stackIn_3_0;
    }

    ida(gj param0, nq param1, int param2, int param3) {
        try {
            ((ida) this).field_k = param2;
            ((ida) this).field_s = param0;
            ((ida) this).field_r = param3;
            ((ida) this).field_p = param1;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "ida.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 44 + param3 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = "Actions";
    }
}
