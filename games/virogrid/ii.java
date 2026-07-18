/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class ii {
    private byte[] field_c;
    private int[] field_f;
    static pd field_a;
    private int[] field_e;
    static int field_b;
    static km field_d;

    final static void b(byte param0) {
        vi.b((byte) -123);
        co.field_d = true;
        kb.field_c = true;
        tm.field_l.a((byte) 76);
        gk.a(false, jm.field_a, false);
    }

    final int a(int param0, int param1, int param2, int param3, byte[] param4, byte[] param5) {
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_15_0 = 0;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        var15 = Virogrid.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              var7_int = 0;
              if (param2 == -7089) {
                break L1;
              } else {
                field_d = null;
                break L1;
              }
            }
            param0 = param0 + param3;
            var8 = param1 << 3;
            L2: while (true) {
              if (param0 <= param3) {
                stackOut_15_0 = -param1 + (7 + var8 >> 3);
                stackIn_16_0 = stackOut_15_0;
                break L0;
              } else {
                var9 = 255 & param4[param3];
                var10 = ((ii) this).field_e[var9];
                var11 = ((ii) this).field_c[var9];
                if (var11 == 0) {
                  throw new RuntimeException("" + var9);
                } else {
                  L3: {
                    var12 = var8 >> 3;
                    var13 = var8 & 7;
                    var7_int = var7_int & -var13 >> 31;
                    var14 = var12 + (-1 + (var13 + var11) >> 3);
                    var13 += 24;
                    int dupTemp$1 = oh.a(var7_int, var10 >>> var13);
                    var7_int = dupTemp$1;
                    param5[var12] = (byte)dupTemp$1;
                    if (var12 >= var14) {
                      break L3;
                    } else {
                      var13 -= 8;
                      var12++;
                      var7_int = var10 >>> var13;
                      param5[var12] = (byte)(var10 >>> var13);
                      if (var14 > var12) {
                        var12++;
                        var13 -= 8;
                        var7_int = var10 >>> var13;
                        param5[var12] = (byte)(var10 >>> var13);
                        if (var12 >= var14) {
                          break L3;
                        } else {
                          var12++;
                          var13 -= 8;
                          var7_int = var10 >>> var13;
                          param5[var12] = (byte)(var10 >>> var13);
                          if (var12 >= var14) {
                            break L3;
                          } else {
                            var12++;
                            var13 -= 8;
                            var7_int = var10 << -var13;
                            param5[var12] = (byte)(var10 << -var13);
                            break L3;
                          }
                        }
                      } else {
                        break L3;
                      }
                    }
                  }
                  var8 = var8 + var11;
                  param3++;
                  continue L2;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var7 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) var7;
            stackOut_17_1 = new StringBuilder().append("ii.F(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param4 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L4;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L4;
            }
          }
          L5: {
            stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
            stackOut_20_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(',');
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param5 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L5;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L5;
            }
          }
          throw kg.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + ')');
        }
        return stackIn_16_0;
    }

    final int a(byte[] param0, int param1, int param2, int param3, byte[] param4, boolean param5) {
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_3_0 = 0;
        int stackIn_64_0 = 0;
        RuntimeException stackIn_66_0 = null;
        StringBuilder stackIn_66_1 = null;
        RuntimeException stackIn_67_0 = null;
        StringBuilder stackIn_67_1 = null;
        RuntimeException stackIn_68_0 = null;
        StringBuilder stackIn_68_1 = null;
        String stackIn_68_2 = null;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        String stackIn_71_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_63_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_65_0 = null;
        StringBuilder stackOut_65_1 = null;
        RuntimeException stackOut_67_0 = null;
        StringBuilder stackOut_67_1 = null;
        String stackOut_67_2 = null;
        RuntimeException stackOut_66_0 = null;
        StringBuilder stackOut_66_1 = null;
        String stackOut_66_2 = null;
        RuntimeException stackOut_68_0 = null;
        StringBuilder stackOut_68_1 = null;
        RuntimeException stackOut_70_0 = null;
        StringBuilder stackOut_70_1 = null;
        String stackOut_70_2 = null;
        RuntimeException stackOut_69_0 = null;
        StringBuilder stackOut_69_1 = null;
        String stackOut_69_2 = null;
        var11 = Virogrid.field_F ? 1 : 0;
        try {
          L0: {
            if (param3 != 0) {
              L1: {
                param3 = param3 + param2;
                var7_int = 0;
                if (param5) {
                  break L1;
                } else {
                  ((ii) this).field_c = null;
                  break L1;
                }
              }
              var8 = param1;
              L2: while (true) {
                L3: {
                  var9 = param4[var8];
                  if (var9 >= 0) {
                    var7_int++;
                    break L3;
                  } else {
                    var7_int = ((ii) this).field_f[var7_int];
                    break L3;
                  }
                }
                L4: {
                  L5: {
                    var10 = ((ii) this).field_f[var7_int];
                    if (0 > ((ii) this).field_f[var7_int]) {
                      int incrementValue$7 = param2;
                      param2++;
                      param0[incrementValue$7] = (byte)(~var10);
                      if (param2 >= param3) {
                        break L4;
                      } else {
                        var7_int = 0;
                        break L5;
                      }
                    } else {
                      break L5;
                    }
                  }
                  L6: {
                    if (0 != (64 & var9)) {
                      var7_int = ((ii) this).field_f[var7_int];
                      break L6;
                    } else {
                      var7_int++;
                      break L6;
                    }
                  }
                  L7: {
                    var10 = ((ii) this).field_f[var7_int];
                    if (((ii) this).field_f[var7_int] >= 0) {
                      break L7;
                    } else {
                      int incrementValue$8 = param2;
                      param2++;
                      param0[incrementValue$8] = (byte)(~var10);
                      if (param3 > param2) {
                        var7_int = 0;
                        break L7;
                      } else {
                        break L4;
                      }
                    }
                  }
                  L8: {
                    if ((32 & var9) == 0) {
                      var7_int++;
                      break L8;
                    } else {
                      var7_int = ((ii) this).field_f[var7_int];
                      break L8;
                    }
                  }
                  L9: {
                    var10 = ((ii) this).field_f[var7_int];
                    if (0 <= ((ii) this).field_f[var7_int]) {
                      break L9;
                    } else {
                      int incrementValue$9 = param2;
                      param2++;
                      param0[incrementValue$9] = (byte)var10;
                      if (param2 < param3) {
                        var7_int = 0;
                        break L9;
                      } else {
                        break L4;
                      }
                    }
                  }
                  L10: {
                    if (-1 == (16 & var9)) {
                      var7_int++;
                      break L10;
                    } else {
                      var7_int = ((ii) this).field_f[var7_int];
                      break L10;
                    }
                  }
                  L11: {
                    var10 = ((ii) this).field_f[var7_int];
                    if (((ii) this).field_f[var7_int] < 0) {
                      int incrementValue$10 = param2;
                      param2++;
                      param0[incrementValue$10] = (byte)(~var10);
                      if (param2 < param3) {
                        var7_int = 0;
                        break L11;
                      } else {
                        break L4;
                      }
                    } else {
                      break L11;
                    }
                  }
                  L12: {
                    if (0 == (var9 & 8)) {
                      var7_int++;
                      break L12;
                    } else {
                      var7_int = ((ii) this).field_f[var7_int];
                      break L12;
                    }
                  }
                  L13: {
                    var10 = ((ii) this).field_f[var7_int];
                    if (((ii) this).field_f[var7_int] < 0) {
                      int incrementValue$11 = param2;
                      param2++;
                      param0[incrementValue$11] = (byte)var10;
                      if (param2 < param3) {
                        var7_int = 0;
                        break L13;
                      } else {
                        break L4;
                      }
                    } else {
                      break L13;
                    }
                  }
                  L14: {
                    if (-1 == (var9 & 4)) {
                      var7_int++;
                      break L14;
                    } else {
                      var7_int = ((ii) this).field_f[var7_int];
                      break L14;
                    }
                  }
                  L15: {
                    var10 = ((ii) this).field_f[var7_int];
                    if (((ii) this).field_f[var7_int] >= 0) {
                      break L15;
                    } else {
                      int incrementValue$12 = param2;
                      param2++;
                      param0[incrementValue$12] = (byte)(~var10);
                      if (param2 < param3) {
                        var7_int = 0;
                        break L15;
                      } else {
                        return -param1 + (var8 - -1);
                      }
                    }
                  }
                  L16: {
                    if ((2 & var9) != 0) {
                      var7_int = ((ii) this).field_f[var7_int];
                      break L16;
                    } else {
                      var7_int++;
                      break L16;
                    }
                  }
                  L17: {
                    var10 = ((ii) this).field_f[var7_int];
                    if (((ii) this).field_f[var7_int] >= 0) {
                      break L17;
                    } else {
                      int incrementValue$13 = param2;
                      param2++;
                      param0[incrementValue$13] = (byte)(~var10);
                      if (param2 >= param3) {
                        break L4;
                      } else {
                        var7_int = 0;
                        break L17;
                      }
                    }
                  }
                  L18: {
                    if ((1 & var9) == 0) {
                      var7_int++;
                      break L18;
                    } else {
                      var7_int = ((ii) this).field_f[var7_int];
                      break L18;
                    }
                  }
                  L19: {
                    var10 = ((ii) this).field_f[var7_int];
                    if (((ii) this).field_f[var7_int] >= 0) {
                      break L19;
                    } else {
                      break L19;
                    }
                  }
                  var8++;
                  continue L2;
                }
                stackOut_63_0 = -param1 + (var8 - -1);
                stackIn_64_0 = stackOut_63_0;
                break L0;
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L20: {
            var7 = decompiledCaughtException;
            stackOut_65_0 = (RuntimeException) var7;
            stackOut_65_1 = new StringBuilder().append("ii.D(");
            stackIn_67_0 = stackOut_65_0;
            stackIn_67_1 = stackOut_65_1;
            stackIn_66_0 = stackOut_65_0;
            stackIn_66_1 = stackOut_65_1;
            if (param0 == null) {
              stackOut_67_0 = (RuntimeException) (Object) stackIn_67_0;
              stackOut_67_1 = (StringBuilder) (Object) stackIn_67_1;
              stackOut_67_2 = "null";
              stackIn_68_0 = stackOut_67_0;
              stackIn_68_1 = stackOut_67_1;
              stackIn_68_2 = stackOut_67_2;
              break L20;
            } else {
              stackOut_66_0 = (RuntimeException) (Object) stackIn_66_0;
              stackOut_66_1 = (StringBuilder) (Object) stackIn_66_1;
              stackOut_66_2 = "{...}";
              stackIn_68_0 = stackOut_66_0;
              stackIn_68_1 = stackOut_66_1;
              stackIn_68_2 = stackOut_66_2;
              break L20;
            }
          }
          L21: {
            stackOut_68_0 = (RuntimeException) (Object) stackIn_68_0;
            stackOut_68_1 = ((StringBuilder) (Object) stackIn_68_1).append(stackIn_68_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_70_0 = stackOut_68_0;
            stackIn_70_1 = stackOut_68_1;
            stackIn_69_0 = stackOut_68_0;
            stackIn_69_1 = stackOut_68_1;
            if (param4 == null) {
              stackOut_70_0 = (RuntimeException) (Object) stackIn_70_0;
              stackOut_70_1 = (StringBuilder) (Object) stackIn_70_1;
              stackOut_70_2 = "null";
              stackIn_71_0 = stackOut_70_0;
              stackIn_71_1 = stackOut_70_1;
              stackIn_71_2 = stackOut_70_2;
              break L21;
            } else {
              stackOut_69_0 = (RuntimeException) (Object) stackIn_69_0;
              stackOut_69_1 = (StringBuilder) (Object) stackIn_69_1;
              stackOut_69_2 = "{...}";
              stackIn_71_0 = stackOut_69_0;
              stackIn_71_1 = stackOut_69_1;
              stackIn_71_2 = stackOut_69_2;
              break L21;
            }
          }
          throw kg.a((Throwable) (Object) stackIn_71_0, stackIn_71_2 + ',' + param5 + ')');
        }
        return stackIn_64_0;
    }

    final static String a(byte param0, boolean param1, CharSequence param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        String stackIn_3_0 = null;
        String stackIn_8_0 = null;
        String stackIn_15_0 = null;
        String stackIn_20_0 = null;
        String stackIn_28_0 = null;
        String stackIn_33_0 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_37_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_32_0 = null;
        String stackOut_27_0 = null;
        String stackOut_19_0 = null;
        String stackOut_14_0 = null;
        String stackOut_7_0 = null;
        String stackOut_2_0 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        String stackOut_36_2 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        String stackOut_35_2 = null;
        var8 = Virogrid.field_F ? 1 : 0;
        try {
          L0: {
            if (param2 != null) {
              L1: {
                var3_int = param2.length();
                if (var3_int < 1) {
                  break L1;
                } else {
                  if (var3_int > 12) {
                    break L1;
                  } else {
                    var4 = c.a(param2, true);
                    L2: {
                      if (var4 == null) {
                        break L2;
                      } else {
                        if (1 > var4.length()) {
                          break L2;
                        } else {
                          L3: {
                            if (ck.a(var4.charAt(0), -46)) {
                              break L3;
                            } else {
                              if (!ck.a(var4.charAt(-1 + var4.length()), -46)) {
                                var5 = 0;
                                var6 = 0;
                                L4: while (true) {
                                  if (var6 >= param2.length()) {
                                    if (var5 > 0) {
                                      stackOut_32_0 = wa.field_H;
                                      stackIn_33_0 = stackOut_32_0;
                                      break L0;
                                    } else {
                                      return null;
                                    }
                                  } else {
                                    L5: {
                                      var7 = param2.charAt(var6);
                                      if (!ck.a((char) var7, -46)) {
                                        var5 = 0;
                                        break L5;
                                      } else {
                                        var5++;
                                        break L5;
                                      }
                                    }
                                    if (var5 < 2) {
                                      var6++;
                                      continue L4;
                                    } else {
                                      stackOut_27_0 = km.field_P;
                                      stackIn_28_0 = stackOut_27_0;
                                      return stackIn_28_0;
                                    }
                                  }
                                }
                              } else {
                                break L3;
                              }
                            }
                          }
                          stackOut_19_0 = wa.field_H;
                          stackIn_20_0 = stackOut_19_0;
                          return stackIn_20_0;
                        }
                      }
                    }
                    stackOut_14_0 = ti.field_a;
                    stackIn_15_0 = stackOut_14_0;
                    return stackIn_15_0;
                  }
                }
              }
              stackOut_7_0 = ti.field_a;
              stackIn_8_0 = stackOut_7_0;
              return stackIn_8_0;
            } else {
              stackOut_2_0 = ti.field_a;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3 = decompiledCaughtException;
            stackOut_34_0 = (RuntimeException) var3;
            stackOut_34_1 = new StringBuilder().append("ii.B(").append(105).append(',').append(false).append(',');
            stackIn_36_0 = stackOut_34_0;
            stackIn_36_1 = stackOut_34_1;
            stackIn_35_0 = stackOut_34_0;
            stackIn_35_1 = stackOut_34_1;
            if (param2 == null) {
              stackOut_36_0 = (RuntimeException) (Object) stackIn_36_0;
              stackOut_36_1 = (StringBuilder) (Object) stackIn_36_1;
              stackOut_36_2 = "null";
              stackIn_37_0 = stackOut_36_0;
              stackIn_37_1 = stackOut_36_1;
              stackIn_37_2 = stackOut_36_2;
              break L6;
            } else {
              stackOut_35_0 = (RuntimeException) (Object) stackIn_35_0;
              stackOut_35_1 = (StringBuilder) (Object) stackIn_35_1;
              stackOut_35_2 = "{...}";
              stackIn_37_0 = stackOut_35_0;
              stackIn_37_1 = stackOut_35_1;
              stackIn_37_2 = stackOut_35_2;
              break L6;
            }
          }
          throw kg.a((Throwable) (Object) stackIn_37_0, stackIn_37_2 + ')');
        }
        return stackIn_33_0;
    }

    public static void a(byte param0) {
        field_a = null;
        field_d = null;
    }

    ii(byte[] param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int[] var13 = null;
        int var14 = 0;
        int[] var16 = null;
        int[] var17 = null;
        int[] var18 = null;
        int[] var19 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_40_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        String stackOut_39_2 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        String stackOut_38_2 = null;
        try {
          L0: {
            var2_int = param0.length;
            ((ii) this).field_c = param0;
            ((ii) this).field_e = new int[var2_int];
            ((ii) this).field_f = new int[8];
            var19 = new int[33];
            var18 = var19;
            var17 = var18;
            var16 = var17;
            var3 = var16;
            var4 = 0;
            var5 = 0;
            L1: while (true) {
              if (var2_int <= var5) {
                break L0;
              } else {
                L2: {
                  var6 = param0[var5];
                  if (var6 == 0) {
                    break L2;
                  } else {
                    L3: {
                      var7 = 1 << -var6 + 32;
                      var8 = var19[var6];
                      ((ii) this).field_e[var5] = var8;
                      if ((var7 & var8) != 0) {
                        var9 = var3[var6 + -1];
                        break L3;
                      } else {
                        var9 = var8 | var7;
                        var10 = var6 - 1;
                        L4: while (true) {
                          if (var10 < 1) {
                            break L3;
                          } else {
                            var11 = var19[var10];
                            if (var8 != var11) {
                              break L3;
                            } else {
                              var12 = 1 << 32 - var10;
                              if ((var11 & var12) != 0) {
                                var3[var10] = var3[-1 + var10];
                                break L3;
                              } else {
                                var3[var10] = oh.a(var12, var11);
                                var10--;
                                continue L4;
                              }
                            }
                          }
                        }
                      }
                    }
                    var19[var6] = var9;
                    var10 = 1 + var6;
                    L5: while (true) {
                      if (32 < var10) {
                        var10 = 0;
                        var11 = 0;
                        L6: while (true) {
                          if (var6 <= var11) {
                            L7: {
                              if (var10 < var4) {
                                break L7;
                              } else {
                                var4 = var10 + 1;
                                break L7;
                              }
                            }
                            ((ii) this).field_f[var10] = ~var5;
                            break L2;
                          } else {
                            L8: {
                              var12 = -2147483648 >>> var11;
                              if (0 != (var8 & var12)) {
                                L9: {
                                  if (0 != ((ii) this).field_f[var10]) {
                                    break L9;
                                  } else {
                                    ((ii) this).field_f[var10] = var4;
                                    break L9;
                                  }
                                }
                                var10 = ((ii) this).field_f[var10];
                                break L8;
                              } else {
                                var10++;
                                break L8;
                              }
                            }
                            L10: {
                              var12 = var12 >>> 1;
                              if (var10 < ((ii) this).field_f.length) {
                                break L10;
                              } else {
                                var13 = new int[2 * ((ii) this).field_f.length];
                                var14 = 0;
                                L11: while (true) {
                                  if (var14 >= ((ii) this).field_f.length) {
                                    ((ii) this).field_f = var13;
                                    break L10;
                                  } else {
                                    var13[var14] = ((ii) this).field_f[var14];
                                    var14++;
                                    continue L11;
                                  }
                                }
                              }
                            }
                            var11++;
                            continue L6;
                          }
                        }
                      } else {
                        L12: {
                          if (var8 != var19[var10]) {
                            break L12;
                          } else {
                            var19[var10] = var9;
                            break L12;
                          }
                        }
                        var10++;
                        continue L5;
                      }
                    }
                  }
                }
                var5++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L13: {
            var2 = decompiledCaughtException;
            stackOut_37_0 = (RuntimeException) var2;
            stackOut_37_1 = new StringBuilder().append("ii.<init>(");
            stackIn_39_0 = stackOut_37_0;
            stackIn_39_1 = stackOut_37_1;
            stackIn_38_0 = stackOut_37_0;
            stackIn_38_1 = stackOut_37_1;
            if (param0 == null) {
              stackOut_39_0 = (RuntimeException) (Object) stackIn_39_0;
              stackOut_39_1 = (StringBuilder) (Object) stackIn_39_1;
              stackOut_39_2 = "null";
              stackIn_40_0 = stackOut_39_0;
              stackIn_40_1 = stackOut_39_1;
              stackIn_40_2 = stackOut_39_2;
              break L13;
            } else {
              stackOut_38_0 = (RuntimeException) (Object) stackIn_38_0;
              stackOut_38_1 = (StringBuilder) (Object) stackIn_38_1;
              stackOut_38_2 = "{...}";
              stackIn_40_0 = stackOut_38_0;
              stackIn_40_1 = stackOut_38_1;
              stackIn_40_2 = stackOut_38_2;
              break L13;
            }
          }
          throw kg.a((Throwable) (Object) stackIn_40_0, stackIn_40_2 + ')');
        }
    }

    final static int a(uh param0, uh param1, int param2) {
        RuntimeException var3 = null;
        Object var4 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_0_0 = 0;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            var4 = null;
            stackOut_0_0 = wh.a(0, false, 0, true, (String) null, param1, param0);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var3;
            stackOut_2_1 = new StringBuilder().append("ii.C(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          L2: {
            stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
            stackOut_5_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw kg.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ',' + 27984 + ')');
        }
        return stackIn_1_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = 0;
    }
}
