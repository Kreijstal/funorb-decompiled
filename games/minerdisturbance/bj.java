/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bj {
    static gj field_h;
    private vb field_g;
    private int field_j;
    private g field_f;
    static long field_a;
    static ci field_e;
    private Object[][] field_b;
    static String field_c;
    private Object[] field_i;
    private boolean field_d;

    final synchronized boolean a(byte param0) {
        if (((bj) this).field_f == null) {
            ((bj) this).field_f = ((bj) this).field_g.a((byte) 53);
            if (null == ((bj) this).field_f) {
                return false;
            }
            ((bj) this).field_i = new Object[((bj) this).field_f.field_c];
            ((bj) this).field_b = new Object[((bj) this).field_f.field_c][];
        }
        if (param0 < 81) {
            ((bj) this).field_j = -108;
            return true;
        }
        return true;
    }

    private final synchronized void c(int param0, int param1) {
        if (((bj) this).field_d) {
            ((bj) this).field_i[param1] = (Object) (Object) ((bj) this).field_g.a(113, param1);
        } else {
            ((bj) this).field_i[param1] = qh.a((byte) 112, false, ((bj) this).field_g.a(-125, param1));
        }
    }

    private final synchronized boolean a(int param0, int param1) {
        if (!((bj) this).a((byte) 124)) {
            return false;
        }
        if (param1 <= param0) {
            if (param0 < ((bj) this).field_f.field_f.length) {
                if (0 != ((bj) this).field_f.field_f[param0]) {
                    return true;
                }
            }
        }
        if (!em.field_x) {
            return false;
        }
        throw new IllegalArgumentException(Integer.toString(param0));
    }

    final int a(int param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        CharSequence var5 = null;
        int stackIn_2_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            if (((bj) this).a((byte) 84)) {
              var4 = -47 % ((param0 - 66) / 59);
              param1 = param1.toLowerCase();
              var5 = (CharSequence) (Object) param1;
              var3_int = ((bj) this).field_f.field_s.a((byte) -71, jh.a(var5, 0));
              if (!this.a(var3_int, 0)) {
                stackOut_5_0 = -1;
                stackIn_6_0 = stackOut_5_0;
                break L0;
              } else {
                return var3_int;
              }
            } else {
              stackOut_1_0 = -1;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var3;
            stackOut_7_1 = new StringBuilder().append("bj.N(").append(param0).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L1;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L1;
            }
          }
          throw lj.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ')');
        }
        return stackIn_6_0;
    }

    final static int a(int param0, int param1, boolean param2) {
        int var4 = 107;
        int discarded$0 = -27911;
        return s.a();
    }

    final synchronized byte[] e(int param0, int param1) {
        if (!((bj) this).a((byte) 106)) {
            return null;
        }
        if (1 == ((bj) this).field_f.field_f.length) {
            return ((bj) this).a(false, 0, param0);
        }
        if (!this.a(param0, 0)) {
            return null;
        }
        if (param1 == ((bj) this).field_f.field_f[param0]) {
            return ((bj) this).a(false, param0, 0);
        }
        throw new RuntimeException();
    }

    final synchronized boolean a(int param0, int param1, int param2) {
        if (!this.b(param2, param0, param1 + -4397)) {
            return false;
        }
        if (((bj) this).field_b[param0] != null) {
            if (!(null == ((bj) this).field_b[param0][param2])) {
                return true;
            }
        }
        if (param1 != 4397) {
            field_c = null;
        }
        if (!(((bj) this).field_i[param0] == null)) {
            return true;
        }
        this.c(-31132, param0);
        if (null == ((bj) this).field_i[param0]) {
            return false;
        }
        return true;
    }

    final boolean b(boolean param0, String param1) {
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
            if (!((bj) this).a((byte) 99)) {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            } else {
              L1: {
                param1 = param1.toLowerCase();
                var4 = (CharSequence) (Object) param1;
                var3_int = ((bj) this).field_f.field_s.a((byte) -71, jh.a(var4, 0));
                if (!param0) {
                  break L1;
                } else {
                  int discarded$2 = ((bj) this).a(-56, (String) null);
                  break L1;
                }
              }
              if (var3_int >= 0) {
                stackOut_9_0 = 1;
                stackIn_10_0 = stackOut_9_0;
                break L0;
              } else {
                stackOut_7_0 = 0;
                stackIn_8_0 = stackOut_7_0;
                return stackIn_8_0 != 0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var3;
            stackOut_11_1 = new StringBuilder().append("bj.U(").append(param0).append(',');
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
          throw lj.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ')');
        }
        return stackIn_10_0 != 0;
    }

    private final synchronized boolean a(int param0, int param1, int param2, int[] param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int[] var6 = null;
        Object[] var7 = null;
        int var8 = 0;
        Object var9 = null;
        int var9_int = 0;
        byte[] var9_array = null;
        int var10_int = 0;
        byte[] var10 = null;
        sb var10_ref = null;
        RuntimeException var11_ref_RuntimeException = null;
        int var11 = 0;
        int var12 = 0;
        sb var13 = null;
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
        byte[] var23 = null;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_24_0 = 0;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        int stackIn_38_2 = 0;
        int stackIn_58_0 = 0;
        int stackIn_103_0 = 0;
        RuntimeException stackIn_105_0 = null;
        StringBuilder stackIn_105_1 = null;
        RuntimeException stackIn_106_0 = null;
        StringBuilder stackIn_106_1 = null;
        RuntimeException stackIn_107_0 = null;
        StringBuilder stackIn_107_1 = null;
        String stackIn_107_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        int stackOut_37_2 = 0;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        int stackOut_36_2 = 0;
        int stackOut_57_0 = 0;
        int stackOut_102_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_6_0 = 0;
        RuntimeException stackOut_104_0 = null;
        StringBuilder stackOut_104_1 = null;
        RuntimeException stackOut_106_0 = null;
        StringBuilder stackOut_106_1 = null;
        String stackOut_106_2 = null;
        RuntimeException stackOut_105_0 = null;
        StringBuilder stackOut_105_1 = null;
        String stackOut_105_2 = null;
        var22 = MinerDisturbance.field_ab;
        try {
          L0: {
            if (!this.a(param0, 0)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            } else {
              if (null != ((bj) this).field_i[param0]) {
                L1: {
                  var5_int = ((bj) this).field_f.field_d[param0];
                  var6 = ((bj) this).field_f.field_p[param0];
                  if (null != ((bj) this).field_b[param0]) {
                    break L1;
                  } else {
                    ((bj) this).field_b[param0] = new Object[((bj) this).field_f.field_f[param0]];
                    break L1;
                  }
                }
                var7 = ((bj) this).field_b[param0];
                if (param2 <= -118) {
                  var8 = 1;
                  var9_int = 0;
                  L2: while (true) {
                    L3: {
                      if (var9_int >= var5_int) {
                        break L3;
                      } else {
                        L4: {
                          if (var6 != null) {
                            var10_int = var6[var9_int];
                            break L4;
                          } else {
                            var10_int = var9_int;
                            break L4;
                          }
                        }
                        if (null == var7[var10_int]) {
                          var8 = 0;
                          break L3;
                        } else {
                          var9_int++;
                          continue L2;
                        }
                      }
                    }
                    if (var8 == 0) {
                      L5: {
                        L6: {
                          if (param3 == null) {
                            break L6;
                          } else {
                            L7: {
                              if (param3[0] != 0) {
                                break L7;
                              } else {
                                if (param3[1] != -1) {
                                  break L7;
                                } else {
                                  if (0 != param3[2]) {
                                    break L7;
                                  } else {
                                    if (-1 == param3[3]) {
                                      break L6;
                                    } else {
                                      break L7;
                                    }
                                  }
                                }
                              }
                            }
                            var9_array = sc.a(true, true, ((bj) this).field_i[param0]);
                            var10_ref = new sb(var9_array);
                            var10_ref.a(5, var10_ref.field_u.length, param3, true);
                            break L5;
                          }
                        }
                        var9_array = sc.a(false, true, ((bj) this).field_i[param0]);
                        break L5;
                      }
                      try {
                        L8: {
                          int discarded$3 = 0;
                          var23 = in.a(var9_array);
                          var10 = var23;
                          break L8;
                        }
                      } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                        decompiledCaughtException = decompiledCaughtParameter0;
                        L9: {
                          var11_ref_RuntimeException = decompiledCaughtException;
                          stackOut_35_0 = (RuntimeException) var11_ref_RuntimeException;
                          stackOut_35_1 = new StringBuilder();
                          stackIn_37_0 = stackOut_35_0;
                          stackIn_37_1 = stackOut_35_1;
                          stackIn_36_0 = stackOut_35_0;
                          stackIn_36_1 = stackOut_35_1;
                          if (param3 == null) {
                            stackOut_37_0 = (RuntimeException) (Object) stackIn_37_0;
                            stackOut_37_1 = (StringBuilder) (Object) stackIn_37_1;
                            stackOut_37_2 = 0;
                            stackIn_38_0 = stackOut_37_0;
                            stackIn_38_1 = stackOut_37_1;
                            stackIn_38_2 = stackOut_37_2;
                            break L9;
                          } else {
                            stackOut_36_0 = (RuntimeException) (Object) stackIn_36_0;
                            stackOut_36_1 = (StringBuilder) (Object) stackIn_36_1;
                            stackOut_36_2 = 1;
                            stackIn_38_0 = stackOut_36_0;
                            stackIn_38_1 = stackOut_36_1;
                            stackIn_38_2 = stackOut_36_2;
                            break L9;
                          }
                        }
                        int discarded$4 = 1;
                        int discarded$5 = 1;
                        throw lj.a((Throwable) (Object) stackIn_38_0, (stackIn_38_2 != 0) + " " + param0 + " " + param3.length + " " + gn.a(param3.length, var9_array) + " " + gn.a(param3.length + -2, var9_array) + " " + ((bj) this).field_f.field_h[param0] + " " + ((bj) this).field_f.field_b);
                      }
                      L10: {
                        if (!((bj) this).field_d) {
                          break L10;
                        } else {
                          ((bj) this).field_i[param0] = null;
                          break L10;
                        }
                      }
                      L11: {
                        if (var5_int <= 1) {
                          L12: {
                            if (var6 == null) {
                              var11 = 0;
                              break L12;
                            } else {
                              var11 = var6[0];
                              break L12;
                            }
                          }
                          if (((bj) this).field_j == 0) {
                            var7[var11] = qh.a((byte) 112, false, var10);
                            break L11;
                          } else {
                            var7[var11] = (Object) (Object) var23;
                            break L11;
                          }
                        } else {
                          if (((bj) this).field_j != 2) {
                            var11 = var23.length;
                            var11--;
                            var12 = var23[var11] & 255;
                            var11 = var11 - 4 * (var12 * var5_int);
                            var13 = new sb(var10);
                            var14 = new int[var5_int];
                            var13.field_o = var11;
                            var15_int = 0;
                            L13: while (true) {
                              if (var12 <= var15_int) {
                                var15 = new byte[var5_int][];
                                var16 = 0;
                                L14: while (true) {
                                  if (var5_int <= var16) {
                                    var13.field_o = var11;
                                    var16 = 0;
                                    var17 = 0;
                                    L15: while (true) {
                                      if (var12 <= var17) {
                                        var17 = 0;
                                        L16: while (true) {
                                          if (var5_int <= var17) {
                                            break L11;
                                          } else {
                                            L17: {
                                              if (var6 != null) {
                                                var18 = var6[var17];
                                                break L17;
                                              } else {
                                                var18 = var17;
                                                break L17;
                                              }
                                            }
                                            L18: {
                                              if (((bj) this).field_j != 0) {
                                                var7[var18] = (Object) (Object) var15[var17];
                                                break L18;
                                              } else {
                                                var7[var18] = qh.a((byte) 112, false, var15[var17]);
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
                                            var18 = var18 + var13.b((byte) 61);
                                            ai.a(var10, var16, var15[var19], var14[var19], var18);
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
                                    var16 = var16 + var13.b((byte) 47);
                                    var14[var17] = var14[var17] + var16;
                                    var17++;
                                    continue L20;
                                  }
                                }
                              }
                            }
                          } else {
                            var11 = var23.length;
                            var11--;
                            var12 = var23[var11] & 255;
                            var11 = var11 - 4 * var5_int * var12;
                            var13 = new sb(var10);
                            var14_int = 0;
                            var13.field_o = var11;
                            var15_int = 0;
                            var16 = 0;
                            L21: while (true) {
                              if (var12 <= var16) {
                                if (var14_int == 0) {
                                  stackOut_57_0 = 1;
                                  stackIn_58_0 = stackOut_57_0;
                                  return stackIn_58_0 != 0;
                                } else {
                                  var16_ref_byte__ = new byte[var14_int];
                                  var14_int = 0;
                                  var13.field_o = var11;
                                  var17 = 0;
                                  var18 = 0;
                                  L22: while (true) {
                                    if (var18 >= var12) {
                                      var7[var15_int] = (Object) (Object) var16_ref_byte__;
                                      return true;
                                    } else {
                                      var19 = 0;
                                      var20 = 0;
                                      L23: while (true) {
                                        if (var20 >= var5_int) {
                                          var18++;
                                          continue L22;
                                        } else {
                                          L24: {
                                            var19 = var19 + var13.b((byte) 97);
                                            if (var6 != null) {
                                              var21 = var6[var20];
                                              break L24;
                                            } else {
                                              var21 = var20;
                                              break L24;
                                            }
                                          }
                                          L25: {
                                            if (param1 == var21) {
                                              ai.a(var10, var17, var16_ref_byte__, var14_int, var19);
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
                                      var17 = var17 + var13.b((byte) 81);
                                      if (var6 != null) {
                                        var19 = var6[var18];
                                        break L27;
                                      } else {
                                        var19 = var18;
                                        break L27;
                                      }
                                    }
                                    L28: {
                                      if (param1 == var19) {
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
                        }
                      }
                      stackOut_102_0 = 1;
                      stackIn_103_0 = stackOut_102_0;
                      break L0;
                    } else {
                      stackOut_23_0 = 1;
                      stackIn_24_0 = stackOut_23_0;
                      return stackIn_24_0 != 0;
                    }
                  }
                } else {
                  stackOut_11_0 = 1;
                  stackIn_12_0 = stackOut_11_0;
                  return stackIn_12_0 != 0;
                }
              } else {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0 != 0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L29: {
            var5 = decompiledCaughtException;
            stackOut_104_0 = (RuntimeException) var5;
            stackOut_104_1 = new StringBuilder().append("bj.T(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_106_0 = stackOut_104_0;
            stackIn_106_1 = stackOut_104_1;
            stackIn_105_0 = stackOut_104_0;
            stackIn_105_1 = stackOut_104_1;
            if (param3 == null) {
              stackOut_106_0 = (RuntimeException) (Object) stackIn_106_0;
              stackOut_106_1 = (StringBuilder) (Object) stackIn_106_1;
              stackOut_106_2 = "null";
              stackIn_107_0 = stackOut_106_0;
              stackIn_107_1 = stackOut_106_1;
              stackIn_107_2 = stackOut_106_2;
              break L29;
            } else {
              stackOut_105_0 = (RuntimeException) (Object) stackIn_105_0;
              stackOut_105_1 = (StringBuilder) (Object) stackIn_105_1;
              stackOut_105_2 = "{...}";
              stackIn_107_0 = stackOut_105_0;
              stackIn_107_1 = stackOut_105_1;
              stackIn_107_2 = stackOut_105_2;
              break L29;
            }
          }
          throw lj.a((Throwable) (Object) stackIn_107_0, stackIn_107_2 + ')');
        }
        return stackIn_103_0 != 0;
    }

    private final synchronized byte[] a(int[] param0, int param1, int param2) {
        Object var5 = null;
        byte[] var7 = null;
        Object stackIn_9_0 = null;
        Object stackIn_24_0 = null;
        Object stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        Object stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        Object stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_8_0 = null;
        Object stackOut_23_0 = null;
        Object stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        Object stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        Object stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        try {
          L0: {
            if (this.b(param2, param1, 0)) {
              L1: {
                L2: {
                  var5 = null;
                  if (((bj) this).field_b[param1] == null) {
                    break L2;
                  } else {
                    if (null != ((bj) this).field_b[param1][param2]) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                if (this.a(param1, param2, -120, param0)) {
                  break L1;
                } else {
                  this.c(-31132, param1);
                  if (this.a(param1, param2, -119, param0)) {
                    break L1;
                  } else {
                    stackOut_8_0 = null;
                    stackIn_9_0 = stackOut_8_0;
                    return (byte[]) (Object) stackIn_9_0;
                  }
                }
              }
              if (((bj) this).field_b[param1] == null) {
                throw new RuntimeException("");
              } else {
                L3: {
                  if (((bj) this).field_b[param1][param2] == null) {
                    break L3;
                  } else {
                    var7 = sc.a(false, true, ((bj) this).field_b[param1][param2]);
                    var5 = (Object) (Object) var7;
                    if (var7 != null) {
                      break L3;
                    } else {
                      throw new RuntimeException("");
                    }
                  }
                }
                L4: {
                  if (var5 == null) {
                    break L4;
                  } else {
                    if (((bj) this).field_j == 1) {
                      ((bj) this).field_b[param1][param2] = null;
                      if (1 != ((bj) this).field_f.field_f[param1]) {
                        break L4;
                      } else {
                        ((bj) this).field_b[param1] = null;
                        break L4;
                      }
                    } else {
                      if (((bj) this).field_j == 2) {
                        ((bj) this).field_b[param1] = null;
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                stackOut_23_0 = var5;
                stackIn_24_0 = stackOut_23_0;
                break L0;
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5 = (Object) (Object) decompiledCaughtException;
            stackOut_25_0 = var5;
            stackOut_25_1 = new StringBuilder().append("bj.H(");
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param0 == null) {
              stackOut_27_0 = stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L5;
            } else {
              stackOut_26_0 = stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L5;
            }
          }
          throw lj.a((Throwable) (Object) stackIn_28_0, stackIn_28_2 + ',' + param1 + ',' + param2 + ',' + -21331 + ')');
        }
        return (byte[]) (Object) stackIn_24_0;
    }

    final int a(String param0, int param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        CharSequence var5 = null;
        int stackIn_2_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_8_0 = 0;
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
        try {
          L0: {
            if (this.a(param1, 0)) {
              L1: {
                if (param2 <= -46) {
                  break L1;
                } else {
                  ((bj) this).field_d = false;
                  break L1;
                }
              }
              param0 = param0.toLowerCase();
              var5 = (CharSequence) (Object) param0;
              var4_int = ((bj) this).field_f.field_n[param1].a((byte) -71, jh.a(var5, 0));
              if (this.b(var4_int, param1, 0)) {
                stackOut_8_0 = var4_int;
                stackIn_9_0 = stackOut_8_0;
                break L0;
              } else {
                stackOut_6_0 = -1;
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0;
              }
            } else {
              stackOut_1_0 = -1;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var4;
            stackOut_10_1 = new StringBuilder().append("bj.D(");
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
          throw lj.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_9_0;
    }

    final synchronized boolean d(int param0, int param1) {
        if (!(this.a(param0, param1))) {
            return false;
        }
        if (!(((bj) this).field_i[param0] == null)) {
            return true;
        }
        this.c(-31132, param0);
        if (((bj) this).field_i[param0] != null) {
            return true;
        }
        return false;
    }

    final byte[] a(boolean param0, int param1, int param2) {
        if (param0) {
            byte[] discarded$0 = ((bj) this).e(-122, 54);
        }
        int discarded$1 = -21331;
        return this.a((int[]) null, param1, param2);
    }

    final boolean a(String param0, String param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_6_0 = false;
        int stackOut_4_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
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
            if (((bj) this).a((byte) 127)) {
              param0 = param0.toLowerCase();
              param1 = param1.toLowerCase();
              var6 = (CharSequence) (Object) param0;
              var4_int = ((bj) this).field_f.field_s.a((byte) -71, jh.a(var6, param2 ^ param2));
              if (this.a(var4_int, param2 + 16675)) {
                var7 = (CharSequence) (Object) param1;
                var5 = ((bj) this).field_f.field_n[var4_int].a((byte) -71, jh.a(var7, param2 + 16675));
                stackOut_6_0 = ((bj) this).a(var4_int, 4397, var5);
                stackIn_7_0 = stackOut_6_0;
                break L0;
              } else {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                return stackIn_5_0 != 0;
              }
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var4;
            stackOut_8_1 = new StringBuilder().append("bj.C(");
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
              break L1;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L1;
            }
          }
          L2: {
            stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
            stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');
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
          throw lj.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ',' + param2 + ')');
        }
        return stackIn_7_0;
    }

    final int b(byte param0) {
        if (!((bj) this).a((byte) 124)) {
            return -1;
        }
        if (param0 != -71) {
            bj.a(111);
        }
        return ((bj) this).field_f.field_f.length;
    }

    private final synchronized boolean b(int param0, int param1, int param2) {
        if (!((bj) this).a((byte) 101)) {
            return false;
        }
        if (param1 >= param2) {
            if (param0 >= 0) {
                if (param1 < ((bj) this).field_f.field_f.length) {
                    if (param0 < ((bj) this).field_f.field_f[param1]) {
                        return true;
                    }
                }
            }
        }
        if (em.field_x) {
            throw new IllegalArgumentException(param1 + " " + param0);
        }
        return false;
    }

    final synchronized boolean b(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        L0: {
          var5 = MinerDisturbance.field_ab;
          if (param0 == -1) {
            break L0;
          } else {
            int discarded$2 = ((bj) this).a(122, (String) null);
            break L0;
          }
        }
        if (!((bj) this).a((byte) 98)) {
          return false;
        } else {
          var2 = 1;
          var3 = 0;
          L1: while (true) {
            if (((bj) this).field_f.field_t.length <= var3) {
              return var2 != 0;
            } else {
              var4 = ((bj) this).field_f.field_t[var3];
              if (((bj) this).field_i[var4] == null) {
                this.c(-31132, var4);
                if (null == ((bj) this).field_i[var4]) {
                  var2 = 0;
                  var3++;
                  continue L1;
                } else {
                  var3++;
                  continue L1;
                }
              } else {
                var3++;
                continue L1;
              }
            }
          }
        }
    }

    final boolean a(boolean param0, String param1) {
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
            if (!((bj) this).a((byte) 121)) {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            } else {
              L1: {
                param1 = param1.toLowerCase();
                if (!param0) {
                  break L1;
                } else {
                  bj.a(22, (wh) null);
                  break L1;
                }
              }
              var4 = (CharSequence) (Object) param1;
              var3_int = ((bj) this).field_f.field_s.a((byte) -71, jh.a(var4, 0));
              stackOut_6_0 = ((bj) this).d(var3_int, 0);
              stackIn_7_0 = stackOut_6_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var3;
            stackOut_8_1 = new StringBuilder().append("bj.J(").append(param0).append(',');
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
          throw lj.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ')');
        }
        return stackIn_7_0;
    }

    final int a(String param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        int stackIn_4_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_3_0 = 0;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              if (param1 < -117) {
                break L1;
              } else {
                ((long[]) ((Object[]) ((bj) this).field_i[18])[9])[0] = 121L;
                break L1;
              }
            }
            if (((bj) this).a((byte) 94)) {
              param0 = param0.toLowerCase();
              var4 = (CharSequence) (Object) param0;
              var3_int = ((bj) this).field_f.field_s.a((byte) -71, jh.a(var4, 0));
              stackOut_5_0 = ((bj) this).a(var3_int, true);
              stackIn_6_0 = stackOut_5_0;
              break L0;
            } else {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var3;
            stackOut_7_1 = new StringBuilder().append("bj.K(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          throw lj.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ',' + param1 + ')');
        }
        return stackIn_6_0;
    }

    final synchronized byte[] a(String param0, int param1, String param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        Object stackIn_5_0 = null;
        byte[] stackIn_7_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_6_0 = null;
        Object stackOut_4_0 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
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
            if (((bj) this).a((byte) 121)) {
              param2 = param2.toLowerCase();
              param0 = param0.toLowerCase();
              var6 = (CharSequence) (Object) param2;
              var4_int = ((bj) this).field_f.field_s.a((byte) -71, jh.a(var6, 0));
              if (this.a(var4_int, param1)) {
                var7 = (CharSequence) (Object) param0;
                var5 = ((bj) this).field_f.field_n[var4_int].a((byte) -71, jh.a(var7, param1));
                stackOut_6_0 = ((bj) this).a(false, var4_int, var5);
                stackIn_7_0 = stackOut_6_0;
                break L0;
              } else {
                stackOut_4_0 = null;
                stackIn_5_0 = stackOut_4_0;
                return (byte[]) (Object) stackIn_5_0;
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var4;
            stackOut_8_1 = new StringBuilder().append("bj.Q(");
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
              break L1;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L1;
            }
          }
          L2: {
            stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
            stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',').append(param1).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param2 == null) {
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
          throw lj.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ')');
        }
        return stackIn_7_0;
    }

    bj(vb param0, boolean param1, int param2) {
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
        ((bj) this).field_f = null;
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
                  ((bj) this).field_d = stackIn_7_1 != 0;
                  ((bj) this).field_g = param0;
                  ((bj) this).field_j = param2;
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
            stackOut_9_1 = new StringBuilder().append("bj.<init>(");
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
          throw lj.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final synchronized int a(int param0, boolean param1) {
        if (!(this.a(param0, 0))) {
            return 0;
        }
        if (((bj) this).field_i[param0] != null) {
            return 100;
        }
        if (!param1) {
            return -119;
        }
        return ((bj) this).field_g.a((byte) 125, param0);
    }

    public static void c() {
        field_c = null;
        int var1 = 0;
        field_e = null;
        field_h = null;
    }

    final static void a(int param0) {
        if (!(sj.field_h == null)) {
            sj.field_h.s(2121792);
        }
        bh.field_Z = new lm();
        if (param0 != 0) {
            return;
        }
        de.field_a.a((byte) -103, (fe) (Object) bh.field_Z);
    }

    final int b(int param0, int param1) {
        if (!this.a(param0, param1 ^ param1)) {
            return 0;
        }
        return ((bj) this).field_f.field_f[param0];
    }

    final static void a(int param0, wh param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              int discarded$3 = 0;
              mk.a(true, param1);
              if (param0 == -6358) {
                break L1;
              } else {
                field_c = null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("bj.O(").append(param0).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw lj.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ')');
        }
    }

    final synchronized int c(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = MinerDisturbance.field_ab;
        if (((bj) this).a((byte) 107)) {
          var2 = 0;
          var3 = 0;
          var4 = 0;
          L0: while (true) {
            if (var4 >= ((bj) this).field_i.length) {
              L1: {
                if (param0 == -14858) {
                  break L1;
                } else {
                  ((bj) this).field_f = null;
                  break L1;
                }
              }
              if (var2 != 0) {
                var4 = var3 * 100 / var2;
                return var4;
              } else {
                return 100;
              }
            } else {
              if (((bj) this).field_f.field_d[var4] > 0) {
                var3 = var3 + ((bj) this).a(var4, true);
                var2 += 100;
                var4++;
                continue L0;
              } else {
                var4++;
                continue L0;
              }
            }
          }
        } else {
          return 0;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = new gj();
    }
}
