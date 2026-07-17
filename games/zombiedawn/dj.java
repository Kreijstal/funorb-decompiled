/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dj {
    private Object[] field_j;
    static vo field_l;
    private int field_d;
    private w field_h;
    static String field_a;
    private boolean field_f;
    static vo field_m;
    static int[] field_g;
    private Object[][] field_c;
    static hi field_e;
    private jh field_b;
    static vn[] field_k;
    static int[] field_i;

    private final synchronized boolean a(int[] param0, int param1, int param2, byte param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int[] var6 = null;
        Object[] var7 = null;
        int var8 = 0;
        Object var9 = null;
        int var9_int = 0;
        byte[] var9_array = null;
        int var10_int = 0;
        de var10 = null;
        byte[] var10_array = null;
        RuntimeException var11_ref_RuntimeException = null;
        int var11 = 0;
        int var12 = 0;
        de var13 = null;
        int[] var14 = null;
        int var14_int = 0;
        int var15_int = 0;
        byte[][] var15 = null;
        int var16 = 0;
        byte[] var16_ref_byte__ = null;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        Object var23 = null;
        byte[] var24 = null;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_23_0 = 0;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        int stackIn_39_2 = 0;
        int stackIn_65_0 = 0;
        int stackIn_104_0 = 0;
        RuntimeException stackIn_106_0 = null;
        StringBuilder stackIn_106_1 = null;
        RuntimeException stackIn_107_0 = null;
        StringBuilder stackIn_107_1 = null;
        RuntimeException stackIn_108_0 = null;
        StringBuilder stackIn_108_1 = null;
        String stackIn_108_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_22_0 = 0;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        int stackOut_38_2 = 0;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        int stackOut_37_2 = 0;
        int stackOut_64_0 = 0;
        int stackOut_103_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_105_0 = null;
        StringBuilder stackOut_105_1 = null;
        RuntimeException stackOut_107_0 = null;
        StringBuilder stackOut_107_1 = null;
        String stackOut_107_2 = null;
        RuntimeException stackOut_106_0 = null;
        StringBuilder stackOut_106_1 = null;
        String stackOut_106_2 = null;
        var22 = ZombieDawn.field_J;
        try {
          L0: {
            if (this.b(param2, (byte) -82)) {
              if (((dj) this).field_j[param2] == null) {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0 != 0;
              } else {
                L1: {
                  var5_int = ((dj) this).field_b.field_t[param2];
                  var6 = ((dj) this).field_b.field_p[param2];
                  if (((dj) this).field_c[param2] == null) {
                    ((dj) this).field_c[param2] = new Object[((dj) this).field_b.field_d[param2]];
                    break L1;
                  } else {
                    break L1;
                  }
                }
                var7 = ((dj) this).field_c[param2];
                var8 = 1;
                var9_int = 0;
                L2: while (true) {
                  L3: {
                    if (var5_int <= var9_int) {
                      break L3;
                    } else {
                      L4: {
                        if (var6 == null) {
                          var10_int = var9_int;
                          break L4;
                        } else {
                          var10_int = var6[var9_int];
                          break L4;
                        }
                      }
                      if (var7[var10_int] == null) {
                        var8 = 0;
                        break L3;
                      } else {
                        var9_int++;
                        continue L2;
                      }
                    }
                  }
                  if (var8 != 0) {
                    stackOut_22_0 = 1;
                    stackIn_23_0 = stackOut_22_0;
                    return stackIn_23_0 != 0;
                  } else {
                    L5: {
                      L6: {
                        if (param0 == null) {
                          break L6;
                        } else {
                          L7: {
                            if (param0[0] != 0) {
                              break L7;
                            } else {
                              if (param0[1] != 0) {
                                break L7;
                              } else {
                                if (0 != param0[2]) {
                                  break L7;
                                } else {
                                  if (param0[3] == 0) {
                                    break L6;
                                  } else {
                                    break L7;
                                  }
                                }
                              }
                            }
                          }
                          var9_array = ag.a(((dj) this).field_j[param2], (byte) 125, true);
                          var10 = new de(var9_array);
                          var10.a(153818020, var10.field_h.length, param0, 5);
                          break L5;
                        }
                      }
                      var9_array = ag.a(((dj) this).field_j[param2], (byte) 88, false);
                      break L5;
                    }
                    L8: {
                      if (param3 <= -28) {
                        break L8;
                      } else {
                        var23 = null;
                        byte[] discarded$1 = ((dj) this).a((String) ((dj) this).field_j[2], -6, (String) null);
                        break L8;
                      }
                    }
                    try {
                      L9: {
                        var24 = va.a((byte) -112, var9_array);
                        var10_array = var24;
                        break L9;
                      }
                    } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L10: {
                        var11_ref_RuntimeException = decompiledCaughtException;
                        stackOut_36_0 = (RuntimeException) var11_ref_RuntimeException;
                        stackOut_36_1 = new StringBuilder();
                        stackIn_38_0 = stackOut_36_0;
                        stackIn_38_1 = stackOut_36_1;
                        stackIn_37_0 = stackOut_36_0;
                        stackIn_37_1 = stackOut_36_1;
                        if (param0 == null) {
                          stackOut_38_0 = (RuntimeException) (Object) stackIn_38_0;
                          stackOut_38_1 = (StringBuilder) (Object) stackIn_38_1;
                          stackOut_38_2 = 0;
                          stackIn_39_0 = stackOut_38_0;
                          stackIn_39_1 = stackOut_38_1;
                          stackIn_39_2 = stackOut_38_2;
                          break L10;
                        } else {
                          stackOut_37_0 = (RuntimeException) (Object) stackIn_37_0;
                          stackOut_37_1 = (StringBuilder) (Object) stackIn_37_1;
                          stackOut_37_2 = 1;
                          stackIn_39_0 = stackOut_37_0;
                          stackIn_39_1 = stackOut_37_1;
                          stackIn_39_2 = stackOut_37_2;
                          break L10;
                        }
                      }
                      throw sh.a((Throwable) (Object) stackIn_39_0, stackIn_39_2 + " " + param2 + " " + param0.length + " " + ii.a(8099, param0.length, var9_array) + " " + ii.a(8099, param0.length - 2, var9_array) + " " + ((dj) this).field_b.field_j[param2] + " " + ((dj) this).field_b.field_m);
                    }
                    L11: {
                      if (!((dj) this).field_f) {
                        break L11;
                      } else {
                        ((dj) this).field_j[param2] = null;
                        break L11;
                      }
                    }
                    L12: {
                      if (1 < var5_int) {
                        if (((dj) this).field_d != 2) {
                          var11 = var24.length;
                          var11--;
                          var12 = 255 & var24[var11];
                          var11 = var11 - 4 * (var12 * var5_int);
                          var13 = new de(var10_array);
                          var14 = new int[var5_int];
                          var13.field_j = var11;
                          var15_int = 0;
                          L13: while (true) {
                            if (var15_int >= var12) {
                              var15 = new byte[var5_int][];
                              var16 = 0;
                              L14: while (true) {
                                if (var16 >= var5_int) {
                                  var13.field_j = var11;
                                  var16 = 0;
                                  var17 = 0;
                                  L15: while (true) {
                                    if (var12 <= var17) {
                                      var17 = 0;
                                      L16: while (true) {
                                        if (var5_int <= var17) {
                                          break L12;
                                        } else {
                                          L17: {
                                            if (var6 == null) {
                                              var18 = var17;
                                              break L17;
                                            } else {
                                              var18 = var6[var17];
                                              break L17;
                                            }
                                          }
                                          L18: {
                                            if (((dj) this).field_d != 0) {
                                              var7[var18] = (Object) (Object) var15[var17];
                                              break L18;
                                            } else {
                                              var7[var18] = el.a((byte) 94, false, var15[var17]);
                                              break L18;
                                            }
                                          }
                                          var17++;
                                          continue L16;
                                        }
                                      }
                                    } else {
                                      var18 = 0;
                                      var19 = 0;
                                      L19: while (true) {
                                        if (var5_int <= var19) {
                                          var17++;
                                          continue L15;
                                        } else {
                                          var18 = var18 + var13.c(-48);
                                          gp.a(var10_array, var16, var15[var19], var14[var19], var18);
                                          var14[var19] = var14[var19] + var18;
                                          var16 = var16 + var18;
                                          var19++;
                                          continue L19;
                                        }
                                      }
                                    }
                                  }
                                } else {
                                  var15[var16] = new byte[var14[var16]];
                                  var14[var16] = 0;
                                  var16++;
                                  continue L14;
                                }
                              }
                            } else {
                              var16 = 0;
                              var17 = 0;
                              L20: while (true) {
                                if (var17 >= var5_int) {
                                  var15_int++;
                                  continue L13;
                                } else {
                                  var16 = var16 + var13.c(124);
                                  var14[var17] = var14[var17] + var16;
                                  var17++;
                                  continue L20;
                                }
                              }
                            }
                          }
                        } else {
                          var11 = var24.length;
                          var11--;
                          var12 = 255 & var24[var11];
                          var11 = var11 - var12 * (var5_int * 4);
                          var13 = new de(var10_array);
                          var14_int = 0;
                          var13.field_j = var11;
                          var15_int = 0;
                          var16 = 0;
                          L21: while (true) {
                            if (var12 <= var16) {
                              if (var14_int == 0) {
                                stackOut_64_0 = 1;
                                stackIn_65_0 = stackOut_64_0;
                                return stackIn_65_0 != 0;
                              } else {
                                var16_ref_byte__ = new byte[var14_int];
                                var14_int = 0;
                                var13.field_j = var11;
                                var17 = 0;
                                var18 = 0;
                                L22: while (true) {
                                  if (var12 <= var18) {
                                    var7[var15_int] = (Object) (Object) var16_ref_byte__;
                                    break L12;
                                  } else {
                                    var19 = 0;
                                    var20 = 0;
                                    L23: while (true) {
                                      if (var20 >= var5_int) {
                                        var18++;
                                        continue L22;
                                      } else {
                                        L24: {
                                          var19 = var19 + var13.c(-44);
                                          if (var6 == null) {
                                            var21 = var20;
                                            break L24;
                                          } else {
                                            var21 = var6[var20];
                                            break L24;
                                          }
                                        }
                                        L25: {
                                          if (var21 == param1) {
                                            gp.a(var10_array, var17, var16_ref_byte__, var14_int, var19);
                                            var14_int = var14_int + var19;
                                            break L25;
                                          } else {
                                            break L25;
                                          }
                                        }
                                        var17 = var17 + var19;
                                        var20++;
                                        continue L23;
                                      }
                                    }
                                  }
                                }
                              }
                            } else {
                              var17 = 0;
                              var18 = 0;
                              L26: while (true) {
                                if (var5_int <= var18) {
                                  var16++;
                                  continue L21;
                                } else {
                                  L27: {
                                    var17 = var17 + var13.c(100);
                                    if (var6 != null) {
                                      var19 = var6[var18];
                                      break L27;
                                    } else {
                                      var19 = var18;
                                      break L27;
                                    }
                                  }
                                  L28: {
                                    if (var19 == param1) {
                                      var14_int = var14_int + var17;
                                      var15_int = var19;
                                      break L28;
                                    } else {
                                      break L28;
                                    }
                                  }
                                  var18++;
                                  continue L26;
                                }
                              }
                            }
                          }
                        }
                      } else {
                        L29: {
                          if (var6 == null) {
                            var11 = 0;
                            break L29;
                          } else {
                            var11 = var6[0];
                            break L29;
                          }
                        }
                        if (((dj) this).field_d == 0) {
                          var7[var11] = el.a((byte) 94, false, var10_array);
                          break L12;
                        } else {
                          var7[var11] = (Object) (Object) var24;
                          return true;
                        }
                      }
                    }
                    stackOut_103_0 = 1;
                    stackIn_104_0 = stackOut_103_0;
                    break L0;
                  }
                }
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L30: {
            var5 = decompiledCaughtException;
            stackOut_105_0 = (RuntimeException) var5;
            stackOut_105_1 = new StringBuilder().append("dj.A(");
            stackIn_107_0 = stackOut_105_0;
            stackIn_107_1 = stackOut_105_1;
            stackIn_106_0 = stackOut_105_0;
            stackIn_106_1 = stackOut_105_1;
            if (param0 == null) {
              stackOut_107_0 = (RuntimeException) (Object) stackIn_107_0;
              stackOut_107_1 = (StringBuilder) (Object) stackIn_107_1;
              stackOut_107_2 = "null";
              stackIn_108_0 = stackOut_107_0;
              stackIn_108_1 = stackOut_107_1;
              stackIn_108_2 = stackOut_107_2;
              break L30;
            } else {
              stackOut_106_0 = (RuntimeException) (Object) stackIn_106_0;
              stackOut_106_1 = (StringBuilder) (Object) stackIn_106_1;
              stackOut_106_2 = "{...}";
              stackIn_108_0 = stackOut_106_0;
              stackIn_108_1 = stackOut_106_1;
              stackIn_108_2 = stackOut_106_2;
              break L30;
            }
          }
          throw sh.a((Throwable) (Object) stackIn_108_0, stackIn_108_2 + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
        return stackIn_104_0 != 0;
    }

    final boolean a(String param0, byte param1, String param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        int stackIn_2_0 = 0;
        int stackIn_7_0 = 0;
        boolean stackIn_9_0 = false;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_8_0 = false;
        int stackOut_6_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            if (((dj) this).a((byte) 73)) {
              L1: {
                param0 = param0.toLowerCase();
                if (param1 < -9) {
                  break L1;
                } else {
                  boolean discarded$2 = ((dj) this).a(76, (byte) -89, 2);
                  break L1;
                }
              }
              param2 = param2.toLowerCase();
              var6 = (CharSequence) (Object) param0;
              var4_int = ((dj) this).field_b.field_g.a(1, tc.a(var6, 14));
              if (this.b(var4_int, (byte) -82)) {
                var7 = (CharSequence) (Object) param2;
                var5 = ((dj) this).field_b.field_a[var4_int].a(1, tc.a(var7, 14));
                stackOut_8_0 = ((dj) this).a(var5, (byte) -128, var4_int);
                stackIn_9_0 = stackOut_8_0;
                break L0;
              } else {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0 != 0;
              }
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var4;
            stackOut_10_1 = new StringBuilder().append("dj.B(");
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L2;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L2;
            }
          }
          L3: {
            stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(44).append(param1).append(44);
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param2 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L3;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L3;
            }
          }
          throw sh.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 41);
        }
        return stackIn_9_0;
    }

    final int d(int param0) {
        if (!((dj) this).a((byte) 73)) {
            return -1;
        }
        if (param0 != -1) {
            field_l = null;
        }
        return ((dj) this).field_b.field_d.length;
    }

    private final synchronized byte[] a(int[] param0, int param1, int param2, int param3) {
        Object var5 = null;
        byte[] var7 = null;
        Object stackIn_4_0 = null;
        Object stackIn_11_0 = null;
        Object stackIn_27_0 = null;
        Object stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        Object stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        Object stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_10_0 = null;
        Object stackOut_26_0 = null;
        Object stackOut_3_0 = null;
        Object stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        Object stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        Object stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        try {
          L0: {
            L1: {
              if (param3 >= 124) {
                break L1;
              } else {
                ((dj) this).field_b = (jh) ((Object[]) ((dj) this).field_j[16])[1];
                break L1;
              }
            }
            if (this.a(param1, param2, 105)) {
              L2: {
                L3: {
                  var5 = null;
                  if (((dj) this).field_c[param2] == null) {
                    break L3;
                  } else {
                    if (((dj) this).field_c[param2][param1] != null) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                if (this.a(param0, param1, param2, (byte) -57)) {
                  break L2;
                } else {
                  this.c(4, param2);
                  if (this.a(param0, param1, param2, (byte) -85)) {
                    break L2;
                  } else {
                    stackOut_10_0 = null;
                    stackIn_11_0 = stackOut_10_0;
                    return (byte[]) (Object) stackIn_11_0;
                  }
                }
              }
              if (((dj) this).field_c[param2] == null) {
                throw new RuntimeException("");
              } else {
                L4: {
                  if (null == ((dj) this).field_c[param2][param1]) {
                    break L4;
                  } else {
                    var7 = ag.a(((dj) this).field_c[param2][param1], (byte) 98, false);
                    var5 = (Object) (Object) var7;
                    if (var7 == null) {
                      throw new RuntimeException("");
                    } else {
                      break L4;
                    }
                  }
                }
                L5: {
                  if (var5 != null) {
                    if (1 != ((dj) this).field_d) {
                      if (((dj) this).field_d != 2) {
                        break L5;
                      } else {
                        ((dj) this).field_c[param2] = null;
                        break L5;
                      }
                    } else {
                      ((dj) this).field_c[param2][param1] = null;
                      if (((dj) this).field_b.field_d[param2] != 1) {
                        break L5;
                      } else {
                        ((dj) this).field_c[param2] = null;
                        break L5;
                      }
                    }
                  } else {
                    break L5;
                  }
                }
                stackOut_26_0 = var5;
                stackIn_27_0 = stackOut_26_0;
                break L0;
              }
            } else {
              stackOut_3_0 = null;
              stackIn_4_0 = stackOut_3_0;
              return (byte[]) (Object) stackIn_4_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var5 = (Object) (Object) decompiledCaughtException;
            stackOut_28_0 = var5;
            stackOut_28_1 = new StringBuilder().append("dj.D(");
            stackIn_30_0 = stackOut_28_0;
            stackIn_30_1 = stackOut_28_1;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            if (param0 == null) {
              stackOut_30_0 = stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L6;
            } else {
              stackOut_29_0 = stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "{...}";
              stackIn_31_0 = stackOut_29_0;
              stackIn_31_1 = stackOut_29_1;
              stackIn_31_2 = stackOut_29_2;
              break L6;
            }
          }
          throw sh.a((Throwable) (Object) stackIn_31_0, stackIn_31_2 + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
        return (byte[]) (Object) stackIn_27_0;
    }

    final synchronized boolean a(byte param0) {
        if (param0 != 73) {
            ((dj) this).field_b = (jh) ((dj) this).field_j[19];
        }
        if (((dj) this).field_b != null) {
            return true;
        }
        ((dj) this).field_b = ((dj) this).field_h.b((byte) 106);
        if (null == ((dj) this).field_b) {
            return false;
        }
        ((dj) this).field_j = new Object[((dj) this).field_b.field_s];
        ((dj) this).field_c = new Object[((dj) this).field_b.field_s][];
        return true;
    }

    final static void a(int param0) {
        int discarded$0 = -901373652;
        jm.a((String) null, "");
        int var1 = -106 % ((67 - param0) / 40);
    }

    final synchronized int e(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = ZombieDawn.field_J;
        if (((dj) this).a((byte) 73)) {
          L0: {
            var2 = 0;
            if (param0 < -79) {
              break L0;
            } else {
              int discarded$2 = ((dj) this).a((byte) -52, 65);
              break L0;
            }
          }
          var3 = 0;
          var4 = 0;
          L1: while (true) {
            if (((dj) this).field_j.length <= var4) {
              if (var2 != 0) {
                var4 = var3 * 100 / var2;
                return var4;
              } else {
                return 100;
              }
            } else {
              if (0 < ((dj) this).field_b.field_t[var4]) {
                var3 = var3 + ((dj) this).a(var4, -5366);
                var2 += 100;
                var4++;
                continue L1;
              } else {
                var4++;
                continue L1;
              }
            }
          }
        } else {
          return 0;
        }
    }

    final int a(int param0, String param1, boolean param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        CharSequence var5 = null;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_5_0 = 0;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            if (!this.b(param0, (byte) -82)) {
              stackOut_2_0 = -1;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            } else {
              param1 = param1.toLowerCase();
              if (param2) {
                var5 = (CharSequence) (Object) param1;
                var4_int = ((dj) this).field_b.field_a[param0].a(1, tc.a(var5, 14));
                if (!this.a(var4_int, param0, 126)) {
                  stackOut_9_0 = -1;
                  stackIn_10_0 = stackOut_9_0;
                  break L0;
                } else {
                  return var4_int;
                }
              } else {
                stackOut_5_0 = 8;
                stackIn_6_0 = stackOut_5_0;
                return stackIn_6_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var4;
            stackOut_11_1 = new StringBuilder().append("dj.Q(").append(param0).append(44);
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L1;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L1;
            }
          }
          throw sh.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 44 + param2 + 41);
        }
        return stackIn_10_0;
    }

    final int b(String param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_6_0 = 0;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            if (!((dj) this).a((byte) 73)) {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            } else {
              L1: {
                if (param1 > 83) {
                  break L1;
                } else {
                  ((dj) this).field_d = -4;
                  break L1;
                }
              }
              param0 = param0.toLowerCase();
              var4 = (CharSequence) (Object) param0;
              var3_int = ((dj) this).field_b.field_g.a(1, tc.a(var4, 14));
              stackOut_6_0 = ((dj) this).a(var3_int, -5366);
              stackIn_7_0 = stackOut_6_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var3;
            stackOut_8_1 = new StringBuilder().append("dj.V(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          throw sh.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 44 + param1 + 41);
        }
        return stackIn_7_0;
    }

    final synchronized boolean a(int param0, byte param1, int param2) {
        if (!this.a(param0, param2, 113)) {
            return false;
        }
        int var4 = -105 / ((-38 - param1) / 58);
        if (((dj) this).field_c[param2] != null) {
            if (null != ((dj) this).field_c[param2][param0]) {
                return true;
            }
        }
        if (!(null == ((dj) this).field_j[param2])) {
            return true;
        }
        this.c(4, param2);
        if (((dj) this).field_j[param2] == null) {
            return false;
        }
        return true;
    }

    final synchronized byte[] a(String param0, int param1, String param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        Object stackIn_2_0 = null;
        Object stackIn_7_0 = null;
        byte[] stackIn_9_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_8_0 = null;
        Object stackOut_6_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            if (((dj) this).a((byte) 73)) {
              L1: {
                if (param1 < -82) {
                  break L1;
                } else {
                  boolean discarded$2 = ((dj) this).a((String) null, (byte) 28, (String) ((dj) this).field_j[1]);
                  break L1;
                }
              }
              param2 = param2.toLowerCase();
              param0 = param0.toLowerCase();
              var6 = (CharSequence) (Object) param2;
              var4_int = ((dj) this).field_b.field_g.a(1, tc.a(var6, 14));
              if (this.b(var4_int, (byte) -82)) {
                var7 = (CharSequence) (Object) param0;
                var5 = ((dj) this).field_b.field_a[var4_int].a(1, tc.a(var7, 14));
                stackOut_8_0 = ((dj) this).a((byte) 51, var4_int, var5);
                stackIn_9_0 = stackOut_8_0;
                break L0;
              } else {
                stackOut_6_0 = null;
                stackIn_7_0 = stackOut_6_0;
                return (byte[]) (Object) stackIn_7_0;
              }
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (byte[]) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var4;
            stackOut_10_1 = new StringBuilder().append("dj.AA(");
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L2;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L2;
            }
          }
          L3: {
            stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(44).append(param1).append(44);
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param2 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L3;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L3;
            }
          }
          throw sh.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 41);
        }
        return stackIn_9_0;
    }

    final boolean a(int param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        int stackIn_3_0 = 0;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        boolean stackOut_6_0 = false;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            if (!((dj) this).a((byte) 73)) {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            } else {
              L1: {
                param1 = param1.toLowerCase();
                if (param0 == -1) {
                  break L1;
                } else {
                  int discarded$2 = ((dj) this).a(((int[]) ((dj) this).field_j[7])[0], -46);
                  break L1;
                }
              }
              var4 = (CharSequence) (Object) param1;
              var3_int = ((dj) this).field_b.field_g.a(1, tc.a(var4, param0 + 15));
              stackOut_6_0 = ((dj) this).b(-29092, var3_int);
              stackIn_7_0 = stackOut_6_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var3;
            stackOut_8_1 = new StringBuilder().append("dj.U(").append(param0).append(44);
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          throw sh.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 41);
        }
        return stackIn_7_0;
    }

    private final synchronized void c(int param0, int param1) {
        if (param0 != 4) {
            return;
        }
        if (((dj) this).field_f) {
            ((dj) this).field_j[param1] = (Object) (Object) ((dj) this).field_h.a(param1, (byte) 112);
        } else {
            ((dj) this).field_j[param1] = el.a((byte) 94, false, ((dj) this).field_h.a(param1, (byte) 112));
        }
    }

    private final synchronized boolean b(int param0, byte param1) {
        if (((dj) this).a((byte) 73)) {
          L0: {
            if (param0 < 0) {
              break L0;
            } else {
              if (~param0 <= ~((dj) this).field_b.field_d.length) {
                break L0;
              } else {
                if (((dj) this).field_b.field_d[param0] != 0) {
                  return true;
                } else {
                  break L0;
                }
              }
            }
          }
          if (!sg.field_ib) {
            return false;
          } else {
            throw new IllegalArgumentException(Integer.toString(param0));
          }
        } else {
          return false;
        }
    }

    final byte[] a(byte param0, int param1, int param2) {
        if (param0 != 51) {
            ((dj) this).field_d = -23;
        }
        return this.a((int[]) null, param2, param1, param0 ^ 77);
    }

    public static void b() {
        field_k = null;
        field_i = null;
        field_a = null;
        field_m = null;
        field_l = null;
        field_e = null;
        field_g = null;
    }

    final int a(byte param0, int param1) {
        if (param0 < 53) {
            return 18;
        }
        if (!(this.b(param1, (byte) -82))) {
            return 0;
        }
        return ((dj) this).field_b.field_d[param1];
    }

    final synchronized int a(int param0, int param1) {
        if (!this.b(param0, (byte) -82)) {
            return 0;
        }
        if (!(((dj) this).field_j[param0] == null)) {
            return 100;
        }
        if (param1 != -5366) {
            byte[] discarded$0 = ((dj) this).a((String) null, -127, (String) ((dj) this).field_j[4]);
        }
        return ((dj) this).field_h.a(-90, param0);
    }

    final boolean a(String param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_5_0 = 0;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            if (!((dj) this).a((byte) 73)) {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            } else {
              param0 = param0.toLowerCase();
              var4 = (CharSequence) (Object) param0;
              var3_int = ((dj) this).field_b.field_g.a(1, tc.a(var4, 14));
              if (param1 <= var3_int) {
                stackOut_7_0 = 1;
                stackIn_8_0 = stackOut_7_0;
                break L0;
              } else {
                stackOut_5_0 = 0;
                stackIn_6_0 = stackOut_5_0;
                return stackIn_6_0 != 0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var3;
            stackOut_9_1 = new StringBuilder().append("dj.O(");
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L1;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L1;
            }
          }
          throw sh.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 44 + param1 + 41);
        }
        return stackIn_8_0 != 0;
    }

    private final synchronized boolean a(int param0, int param1, int param2) {
        int var4 = 0;
        if (!((dj) this).a((byte) 73)) {
          return false;
        } else {
          L0: {
            if (0 > param1) {
              break L0;
            } else {
              if (param0 < 0) {
                break L0;
              } else {
                if (param1 >= ((dj) this).field_b.field_d.length) {
                  break L0;
                } else {
                  if (param0 >= ((dj) this).field_b.field_d[param1]) {
                    break L0;
                  } else {
                    var4 = -60 % ((63 - param2) / 41);
                    return true;
                  }
                }
              }
            }
          }
          if (!sg.field_ib) {
            return false;
          } else {
            throw new IllegalArgumentException(param1 + " " + param0);
          }
        }
    }

    final synchronized byte[] a(int param0, byte param1) {
        if (!((dj) this).a((byte) 73)) {
            return null;
        }
        if (1 == ((dj) this).field_b.field_d.length) {
            return ((dj) this).a((byte) 51, 0, param0);
        }
        int var3 = 84 % ((-21 - param1) / 37);
        if (!this.b(param0, (byte) -82)) {
            return null;
        }
        if (!(((dj) this).field_b.field_d[param0] != 1)) {
            return ((dj) this).a((byte) 51, param0, 0);
        }
        throw new RuntimeException();
    }

    final int a(String param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        int stackIn_3_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_7_0 = 0;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            if (!((dj) this).a((byte) 73)) {
              stackOut_2_0 = -1;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            } else {
              L1: {
                param0 = param0.toLowerCase();
                if (param1 == 8) {
                  break L1;
                } else {
                  field_a = null;
                  break L1;
                }
              }
              var4 = (CharSequence) (Object) param0;
              var3_int = ((dj) this).field_b.field_g.a(param1 ^ 9, tc.a(var4, 14));
              if (this.b(var3_int, (byte) -82)) {
                stackOut_9_0 = var3_int;
                stackIn_10_0 = stackOut_9_0;
                break L0;
              } else {
                stackOut_7_0 = -1;
                stackIn_8_0 = stackOut_7_0;
                return stackIn_8_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var3;
            stackOut_11_1 = new StringBuilder().append("dj.L(");
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L2;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L2;
            }
          }
          throw sh.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 44 + param1 + 41);
        }
        return stackIn_10_0;
    }

    final synchronized boolean b(int param0, int param1) {
        if (!(this.b(param1, (byte) -82))) {
            return false;
        }
        if (param0 != -29092) {
            return false;
        }
        if (null != ((dj) this).field_j[param1]) {
            return true;
        }
        this.c(4, param1);
        if (((dj) this).field_j[param1] == null) {
            return false;
        }
        return true;
    }

    final synchronized boolean c(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = ZombieDawn.field_J;
        if (((dj) this).a((byte) 73)) {
          var2 = 1;
          var3 = 0;
          L0: while (true) {
            if (((dj) this).field_b.field_n.length <= var3) {
              L1: {
                if (param0 == 9001) {
                  break L1;
                } else {
                  boolean discarded$1 = ((dj) this).a(70, ((byte[]) ((dj) this).field_j[19])[2], 26);
                  break L1;
                }
              }
              return var2 != 0;
            } else {
              var4 = ((dj) this).field_b.field_n[var3];
              if (((dj) this).field_j[var4] == null) {
                this.c(param0 + -8997, var4);
                if (null == ((dj) this).field_j[var4]) {
                  var2 = 0;
                  var3++;
                  continue L0;
                } else {
                  var3++;
                  continue L0;
                }
              } else {
                var3++;
                continue L0;
              }
            }
          }
        } else {
          return false;
        }
    }

    dj(w param0, boolean param1, int param2) {
        RuntimeException runtimeException = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_4_0 = null;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        ((dj) this).field_b = null;
        try {
          L0: {
            L1: {
              if (param2 < 0) {
                break L1;
              } else {
                if (param2 <= 2) {
                  L2: {
                    stackOut_4_0 = this;
                    stackIn_6_0 = stackOut_4_0;
                    stackIn_5_0 = stackOut_4_0;
                    if (!param1) {
                      stackOut_6_0 = this;
                      stackOut_6_1 = 0;
                      stackIn_7_0 = stackOut_6_0;
                      stackIn_7_1 = stackOut_6_1;
                      break L2;
                    } else {
                      stackOut_5_0 = this;
                      stackOut_5_1 = 1;
                      stackIn_7_0 = stackOut_5_0;
                      stackIn_7_1 = stackOut_5_1;
                      break L2;
                    }
                  }
                  ((dj) this).field_f = stackIn_7_1 != 0;
                  ((dj) this).field_d = param2;
                  ((dj) this).field_h = param0;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            throw new IllegalArgumentException("");
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            runtimeException = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) runtimeException;
            stackOut_9_1 = new StringBuilder().append("dj.<init>(");
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          throw sh.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 44 + param1 + 44 + param2 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Passwords can only contain letters and numbers";
        field_l = new vo();
        int discarded$0 = 14821;
        field_i = ae.a();
    }
}
