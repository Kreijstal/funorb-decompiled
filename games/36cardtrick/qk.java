/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qk {
    static String field_h;
    static kc[] field_a;
    private int field_f;
    private boolean field_e;
    static String field_i;
    private pe field_d;
    private Object[] field_g;
    private d field_c;
    private Object[][] field_b;

    private final synchronized boolean a(int param0, int param1, int[] param2, int param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int[] var6 = null;
        Object[] var7 = null;
        int var8 = 0;
        Object var9 = null;
        int var9_int = 0;
        byte[] var9_array = null;
        int var10 = 0;
        RuntimeException var11_ref_RuntimeException = null;
        int var11 = 0;
        int var12 = 0;
        int[] var14 = null;
        int var14_int = 0;
        int var15_int = 0;
        byte[][] var15 = null;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        byte[] var23 = null;
        int[] var24 = null;
        byte[] var25 = null;
        pb var26 = null;
        byte[] var27 = null;
        pb var29 = null;
        pb var31 = null;
        int[] var32 = null;
        byte[][] var33 = null;
        int[] var34 = null;
        byte[] var35 = null;
        byte[] var36 = null;
        int[] var39 = null;
        byte[][] var40 = null;
        int[] var41 = null;
        byte[] var42 = null;
        byte[] var43 = null;
        int[] var46 = null;
        byte[][] var47 = null;
        int[] var48 = null;
        byte[] var49 = null;
        byte[] var50 = null;
        byte[] var51 = null;
        byte[] var52 = null;
        int[] var53 = null;
        byte[][] var54 = null;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_22_0 = 0;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        int stackIn_38_2 = 0;
        int stackIn_57_0 = 0;
        int stackIn_101_0 = 0;
        RuntimeException stackIn_103_0 = null;
        StringBuilder stackIn_103_1 = null;
        RuntimeException stackIn_104_0 = null;
        StringBuilder stackIn_104_1 = null;
        RuntimeException stackIn_105_0 = null;
        StringBuilder stackIn_105_1 = null;
        String stackIn_105_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_21_0 = 0;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        int stackOut_37_2 = 0;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        int stackOut_36_2 = 0;
        int stackOut_56_0 = 0;
        int stackOut_100_0 = 0;
        int stackOut_6_0 = 0;
        RuntimeException stackOut_102_0 = null;
        StringBuilder stackOut_102_1 = null;
        RuntimeException stackOut_104_0 = null;
        StringBuilder stackOut_104_1 = null;
        String stackOut_104_2 = null;
        RuntimeException stackOut_103_0 = null;
        StringBuilder stackOut_103_1 = null;
        String stackOut_103_2 = null;
        var22 = Main.field_T;
        try {
          L0: {
            if (!this.b(param1, (byte) -44)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            } else {
              if (null != ((qk) this).field_g[param1]) {
                L1: {
                  var5_int = ((qk) this).field_c.field_q[param1];
                  var48 = ((qk) this).field_c.field_o[param1];
                  var41 = var48;
                  var34 = var41;
                  var24 = var34;
                  var6 = var24;
                  if (((qk) this).field_b[param1] == null) {
                    ((qk) this).field_b[param1] = new Object[((qk) this).field_c.field_f[param1]];
                    break L1;
                  } else {
                    break L1;
                  }
                }
                var7 = ((qk) this).field_b[param1];
                var8 = 1;
                var9_int = 0;
                L2: while (true) {
                  L3: {
                    if (var5_int <= var9_int) {
                      break L3;
                    } else {
                      L4: {
                        if (var6 != null) {
                          var10 = var48[var9_int];
                          break L4;
                        } else {
                          var10 = var9_int;
                          break L4;
                        }
                      }
                      if (var7[var10] != null) {
                        var9_int++;
                        continue L2;
                      } else {
                        var8 = 0;
                        break L3;
                      }
                    }
                  }
                  if (var8 != 0) {
                    stackOut_21_0 = 1;
                    stackIn_22_0 = stackOut_21_0;
                    return stackIn_22_0 != 0;
                  } else {
                    L5: {
                      L6: {
                        if (param2 == null) {
                          break L6;
                        } else {
                          L7: {
                            if (param2[0] != 0) {
                              break L7;
                            } else {
                              if (0 != param2[1]) {
                                break L7;
                              } else {
                                if (0 != param2[2]) {
                                  break L7;
                                } else {
                                  if (param2[3] != 0) {
                                    break L7;
                                  } else {
                                    break L6;
                                  }
                                }
                              }
                            }
                          }
                          var49 = ce.a(true, 0, ((qk) this).field_g[param1]);
                          var42 = var49;
                          var35 = var42;
                          var25 = var35;
                          var9_array = var25;
                          var26 = new pb(var49);
                          var26.a(5, var26.field_g.length, -115, param2);
                          break L5;
                        }
                      }
                      var9_array = ce.a(false, 0, ((qk) this).field_g[param1]);
                      break L5;
                    }
                    L8: {
                      if (param0 >= 84) {
                        break L8;
                      } else {
                        byte[] discarded$1 = ((qk) this).a(-69, ((byte[]) ((Object[]) ((qk) this).field_g[4])[0])[1], -74);
                        break L8;
                      }
                    }
                    try {
                      L9: {
                        var50 = ac.a(-89, var9_array);
                        var43 = var50;
                        var36 = var43;
                        var27 = var36;
                        var23 = var27;
                        var51 = var23;
                        break L9;
                      }
                    } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L10: {
                        var11_ref_RuntimeException = decompiledCaughtException;
                        stackOut_35_0 = (RuntimeException) var11_ref_RuntimeException;
                        stackOut_35_1 = new StringBuilder();
                        stackIn_37_0 = stackOut_35_0;
                        stackIn_37_1 = stackOut_35_1;
                        stackIn_36_0 = stackOut_35_0;
                        stackIn_36_1 = stackOut_35_1;
                        if (param2 == null) {
                          stackOut_37_0 = (RuntimeException) (Object) stackIn_37_0;
                          stackOut_37_1 = (StringBuilder) (Object) stackIn_37_1;
                          stackOut_37_2 = 0;
                          stackIn_38_0 = stackOut_37_0;
                          stackIn_38_1 = stackOut_37_1;
                          stackIn_38_2 = stackOut_37_2;
                          break L10;
                        } else {
                          stackOut_36_0 = (RuntimeException) (Object) stackIn_36_0;
                          stackOut_36_1 = (StringBuilder) (Object) stackIn_36_1;
                          stackOut_36_2 = 1;
                          stackIn_38_0 = stackOut_36_0;
                          stackIn_38_1 = stackOut_36_1;
                          stackIn_38_2 = stackOut_36_2;
                          break L10;
                        }
                      }
                      throw ma.a((Throwable) (Object) stackIn_38_0, (stackIn_38_2 != 0) + " " + param1 + " " + param2.length + " " + uh.a((byte) 124, param2.length, var9_array) + " " + uh.a((byte) 114, -2 + param2.length, var9_array) + " " + ((qk) this).field_c.field_i[param1] + " " + ((qk) this).field_c.field_g);
                    }
                    L11: {
                      if (!((qk) this).field_e) {
                        break L11;
                      } else {
                        ((qk) this).field_g[param1] = null;
                        break L11;
                      }
                    }
                    L12: {
                      if (var5_int <= 1) {
                        L13: {
                          if (var6 == null) {
                            var11 = 0;
                            break L13;
                          } else {
                            var11 = var48[0];
                            break L13;
                          }
                        }
                        if (((qk) this).field_f == 0) {
                          var7[var11] = sj.a(false, 136, var51);
                          break L12;
                        } else {
                          var7[var11] = (Object) (Object) var50;
                          break L12;
                        }
                      } else {
                        if (((qk) this).field_f != 2) {
                          var11 = var50.length;
                          var11--;
                          var12 = 255 & var23[var11];
                          var11 = var11 - 4 * var5_int * var12;
                          var31 = new pb(var51);
                          var31.field_i = var11;
                          var53 = new int[var5_int];
                          var46 = var53;
                          var39 = var46;
                          var32 = var39;
                          var14 = var32;
                          var15_int = 0;
                          L14: while (true) {
                            if (var15_int >= var12) {
                              var54 = new byte[var5_int][];
                              var47 = var54;
                              var40 = var47;
                              var33 = var40;
                              var15 = var33;
                              var16 = 0;
                              L15: while (true) {
                                if (var16 >= var5_int) {
                                  var31.field_i = var11;
                                  var16 = 0;
                                  var17 = 0;
                                  L16: while (true) {
                                    if (var12 <= var17) {
                                      var17 = 0;
                                      L17: while (true) {
                                        if (var5_int <= var17) {
                                          break L12;
                                        } else {
                                          L18: {
                                            if (var6 != null) {
                                              var18 = var48[var17];
                                              break L18;
                                            } else {
                                              var18 = var17;
                                              break L18;
                                            }
                                          }
                                          L19: {
                                            if (0 == ((qk) this).field_f) {
                                              var7[var18] = sj.a(false, 136, var54[var17]);
                                              break L19;
                                            } else {
                                              var7[var18] = (Object) (Object) var54[var17];
                                              break L19;
                                            }
                                          }
                                          var17++;
                                          continue L17;
                                        }
                                      }
                                    } else {
                                      var18 = 0;
                                      var19 = 0;
                                      L20: while (true) {
                                        if (var19 >= var5_int) {
                                          var17++;
                                          continue L16;
                                        } else {
                                          var18 = var18 + var31.e((byte) 126);
                                          og.a(var51, var16, var54[var19], var53[var19], var18);
                                          var16 = var16 + var18;
                                          var14[var19] = var14[var19] + var18;
                                          var19++;
                                          continue L20;
                                        }
                                      }
                                    }
                                  }
                                } else {
                                  var15[var16] = new byte[var53[var16]];
                                  var53[var16] = 0;
                                  var16++;
                                  continue L15;
                                }
                              }
                            } else {
                              var16 = 0;
                              var17 = 0;
                              L21: while (true) {
                                if (var17 >= var5_int) {
                                  var15_int++;
                                  continue L14;
                                } else {
                                  var16 = var16 + var31.e((byte) 124);
                                  var14[var17] = var14[var17] + var16;
                                  var17++;
                                  continue L21;
                                }
                              }
                            }
                          }
                        } else {
                          var11 = var50.length;
                          var11--;
                          var12 = 255 & var23[var11];
                          var11 = var11 - var5_int * (var12 * 4);
                          var29 = new pb(var51);
                          var14_int = 0;
                          var29.field_i = var11;
                          var15_int = 0;
                          var16 = 0;
                          L22: while (true) {
                            if (var16 >= var12) {
                              if (var14_int != 0) {
                                var52 = new byte[var14_int];
                                var29.field_i = var11;
                                var14_int = 0;
                                var17 = 0;
                                var18 = 0;
                                L23: while (true) {
                                  if (var12 <= var18) {
                                    var7[var15_int] = (Object) (Object) var52;
                                    return true;
                                  } else {
                                    var19 = 0;
                                    var20 = 0;
                                    L24: while (true) {
                                      if (var20 >= var5_int) {
                                        var18++;
                                        continue L23;
                                      } else {
                                        L25: {
                                          var19 = var19 + var29.e((byte) 127);
                                          if (var6 == null) {
                                            var21 = var20;
                                            break L25;
                                          } else {
                                            var21 = var48[var20];
                                            break L25;
                                          }
                                        }
                                        L26: {
                                          if (var21 != param3) {
                                            break L26;
                                          } else {
                                            og.a(var51, var17, var52, var14_int, var19);
                                            var14_int = var14_int + var19;
                                            break L26;
                                          }
                                        }
                                        var17 = var17 + var19;
                                        var20++;
                                        continue L24;
                                      }
                                    }
                                  }
                                }
                              } else {
                                stackOut_56_0 = 1;
                                stackIn_57_0 = stackOut_56_0;
                                return stackIn_57_0 != 0;
                              }
                            } else {
                              var17 = 0;
                              var18 = 0;
                              L27: while (true) {
                                if (var18 >= var5_int) {
                                  var16++;
                                  continue L22;
                                } else {
                                  L28: {
                                    var17 = var17 + var29.e((byte) 125);
                                    if (var6 == null) {
                                      var19 = var18;
                                      break L28;
                                    } else {
                                      var19 = var48[var18];
                                      break L28;
                                    }
                                  }
                                  L29: {
                                    if (var19 == param3) {
                                      var15_int = var19;
                                      var14_int = var14_int + var17;
                                      break L29;
                                    } else {
                                      break L29;
                                    }
                                  }
                                  var18++;
                                  continue L27;
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                    stackOut_100_0 = 1;
                    stackIn_101_0 = stackOut_100_0;
                    break L0;
                  }
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
          L30: {
            var5 = decompiledCaughtException;
            stackOut_102_0 = (RuntimeException) var5;
            stackOut_102_1 = new StringBuilder().append("qk.Q(").append(param0).append(',').append(param1).append(',');
            stackIn_104_0 = stackOut_102_0;
            stackIn_104_1 = stackOut_102_1;
            stackIn_103_0 = stackOut_102_0;
            stackIn_103_1 = stackOut_102_1;
            if (param2 == null) {
              stackOut_104_0 = (RuntimeException) (Object) stackIn_104_0;
              stackOut_104_1 = (StringBuilder) (Object) stackIn_104_1;
              stackOut_104_2 = "null";
              stackIn_105_0 = stackOut_104_0;
              stackIn_105_1 = stackOut_104_1;
              stackIn_105_2 = stackOut_104_2;
              break L30;
            } else {
              stackOut_103_0 = (RuntimeException) (Object) stackIn_103_0;
              stackOut_103_1 = (StringBuilder) (Object) stackIn_103_1;
              stackOut_103_2 = "{...}";
              stackIn_105_0 = stackOut_103_0;
              stackIn_105_1 = stackOut_103_1;
              stackIn_105_2 = stackOut_103_2;
              break L30;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_105_0, stackIn_105_2 + ',' + param3 + ')');
        }
        return stackIn_101_0 != 0;
    }

    final byte[] a(int param0, byte param1, int param2) {
        if (param1 != -115) {
            return null;
        }
        return this.a((int[]) null, param2, (byte) 125, param0);
    }

    private final synchronized boolean a(int param0, int param1, int param2) {
        if (((qk) this).b(4)) {
          if (param1 == 0) {
            L0: {
              if (param0 < 0) {
                break L0;
              } else {
                if (param2 < 0) {
                  break L0;
                } else {
                  if (((qk) this).field_c.field_f.length <= param0) {
                    break L0;
                  } else {
                    if (((qk) this).field_c.field_f[param0] > param2) {
                      return true;
                    } else {
                      break L0;
                    }
                  }
                }
              }
            }
            if (!rh.field_j) {
              return false;
            } else {
              throw new IllegalArgumentException(param0 + " " + param2);
            }
          } else {
            return true;
          }
        } else {
          return false;
        }
    }

    final boolean b(int param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        int stackIn_2_0 = 0;
        boolean stackIn_6_0 = false;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_5_0 = false;
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
            if (((qk) this).b(param0)) {
              L1: {
                if (param0 == 4) {
                  break L1;
                } else {
                  boolean discarded$2 = ((qk) this).a(-13, ((int[]) ((Object[]) ((qk) this).field_g[7])[0])[7]);
                  break L1;
                }
              }
              param1 = param1.toLowerCase();
              var4 = (CharSequence) (Object) param1;
              var3_int = ((qk) this).field_c.field_h.a((byte) -100, ta.a(109, var4));
              stackOut_5_0 = ((qk) this).a(var3_int, 105);
              stackIn_6_0 = stackOut_5_0;
              break L0;
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var3;
            stackOut_7_1 = new StringBuilder().append("qk.J(").append(param0).append(',');
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
          throw ma.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ')');
        }
        return stackIn_6_0;
    }

    final synchronized int a(byte param0, int param1) {
        if (!(this.b(param1, (byte) -26))) {
            return 0;
        }
        if (param0 != 60) {
            Object var4 = null;
            byte[] discarded$0 = ((qk) this).a((byte) 42, (String) null, (String) null);
        }
        if (null != ((qk) this).field_g[param1]) {
            return 100;
        }
        return ((qk) this).field_d.a(param1, param0 ^ 123);
    }

    final boolean c(int param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
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
            if (((qk) this).b(4)) {
              param1 = param1.toLowerCase();
              var4 = (CharSequence) (Object) param1;
              var3_int = ((qk) this).field_c.field_h.a((byte) -100, ta.a(98, var4));
              if (param0 > var3_int) {
                stackOut_5_0 = 0;
                stackIn_6_0 = stackOut_5_0;
                break L0;
              } else {
                return true;
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
            var3 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var3;
            stackOut_7_1 = new StringBuilder().append("qk.K(").append(param0).append(',');
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
          throw ma.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ')');
        }
        return stackIn_6_0 != 0;
    }

    final synchronized boolean a(int param0, int param1) {
        if (!(this.b(param0, (byte) -124))) {
            return false;
        }
        if (param1 <= 17) {
            return false;
        }
        if (!(null == ((qk) this).field_g[param0])) {
            return true;
        }
        this.a(param0, (byte) -92);
        if (null != ((qk) this).field_g[param0]) {
            return true;
        }
        return false;
    }

    final synchronized int a(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = Main.field_T;
        if (!((qk) this).b(4)) {
          return 0;
        } else {
          var2 = 0;
          var3 = 0;
          var4 = 0;
          L0: while (true) {
            if (((qk) this).field_g.length <= var4) {
              L1: {
                if (param0 == 2) {
                  break L1;
                } else {
                  ((qk) this).field_d = (pe) ((qk) this).field_g[7];
                  break L1;
                }
              }
              if (var2 != 0) {
                var4 = 100 * var3 / var2;
                return var4;
              } else {
                return 100;
              }
            } else {
              if (((qk) this).field_c.field_q[var4] > 0) {
                var3 = var3 + ((qk) this).a((byte) 60, var4);
                var2 += 100;
                var4++;
                continue L0;
              } else {
                var4++;
                continue L0;
              }
            }
          }
        }
    }

    final boolean a(String param0, String param1, byte param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        boolean stackIn_11_0 = false;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_6_0 = 0;
        boolean stackOut_10_0 = false;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        try {
          L0: {
            if (!((qk) this).b(4)) {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            } else {
              param0 = param0.toLowerCase();
              param1 = param1.toLowerCase();
              var6 = (CharSequence) (Object) param0;
              var4_int = ((qk) this).field_c.field_h.a((byte) -100, ta.a(param2 + -7, var6));
              if (!this.b(var4_int, (byte) -112)) {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0 != 0;
              } else {
                L1: {
                  var7 = (CharSequence) (Object) param1;
                  var5 = ((qk) this).field_c.field_p[var4_int].a((byte) -100, ta.a(90, var7));
                  if (param2 == -44) {
                    break L1;
                  } else {
                    ((qk) this).field_b = null;
                    break L1;
                  }
                }
                stackOut_10_0 = ((qk) this).b(27493, var4_int, var5);
                stackIn_11_0 = stackOut_10_0;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var4;
            stackOut_12_1 = new StringBuilder().append("qk.O(");
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L2;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L2;
            }
          }
          L3: {
            stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
            stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',');
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param1 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L3;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L3;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + ',' + param2 + ')');
        }
        return stackIn_11_0;
    }

    final synchronized boolean b(int param0, int param1, int param2) {
        if (param0 != 27493) {
            return ((boolean[]) ((qk) this).field_g[3])[13];
        }
        if (!(this.a(param1, param0 + -27493, param2))) {
            return false;
        }
        if (((qk) this).field_b[param1] != null) {
            if (null != ((qk) this).field_b[param1][param2]) {
                return true;
            }
        }
        if (!(null == ((qk) this).field_g[param1])) {
            return true;
        }
        this.a(param1, (byte) 119);
        if (((qk) this).field_g[param1] != null) {
            return true;
        }
        return false;
    }

    final int a(int param0, String param1, byte param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        CharSequence var5 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
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
        int stackOut_4_0 = 0;
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
            if (this.b(param0, (byte) -122)) {
              param1 = param1.toLowerCase();
              var5 = (CharSequence) (Object) param1;
              var4_int = ((qk) this).field_c.field_p[param0].a((byte) -100, ta.a(param2 ^ 99, var5));
              if (this.a(param0, 0, var4_int)) {
                L1: {
                  if (param2 == 7) {
                    break L1;
                  } else {
                    field_i = (String) ((qk) this).field_g[1];
                    break L1;
                  }
                }
                stackOut_8_0 = var4_int;
                stackIn_9_0 = stackOut_8_0;
                break L0;
              } else {
                stackOut_4_0 = -1;
                stackIn_5_0 = stackOut_4_0;
                return stackIn_5_0;
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
            stackOut_10_1 = new StringBuilder().append("qk.D(").append(param0).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
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
          throw ma.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ',' + param2 + ')');
        }
        return stackIn_9_0;
    }

    final synchronized byte[] a(byte param0, String param1, String param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        Object stackIn_2_0 = null;
        byte[] stackIn_10_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_9_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        try {
          L0: {
            if (param0 == 7) {
              if (((qk) this).b(4)) {
                param2 = param2.toLowerCase();
                param1 = param1.toLowerCase();
                var6 = (CharSequence) (Object) param2;
                var4_int = ((qk) this).field_c.field_h.a((byte) -100, ta.a(param0 + -94, var6));
                if (this.b(var4_int, (byte) -47)) {
                  var7 = (CharSequence) (Object) param1;
                  var5 = ((qk) this).field_c.field_p[var4_int].a((byte) -100, ta.a(57, var7));
                  stackOut_9_0 = ((qk) this).a(var5, (byte) -115, var4_int);
                  stackIn_10_0 = stackOut_9_0;
                  break L0;
                } else {
                  return null;
                }
              } else {
                return null;
              }
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (byte[]) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var4;
            stackOut_11_1 = new StringBuilder().append("qk.A(").append(param0).append(',');
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
          L2: {
            stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
            stackOut_14_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param2 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L2;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L2;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ')');
        }
        return stackIn_10_0;
    }

    final synchronized boolean b(int param0) {
        if (!(null != ((qk) this).field_c)) {
            ((qk) this).field_c = ((qk) this).field_d.b((byte) -126);
            if (null == ((qk) this).field_c) {
                return false;
            }
            ((qk) this).field_b = new Object[((qk) this).field_c.field_b][];
            ((qk) this).field_g = new Object[((qk) this).field_c.field_b];
        }
        if (param0 != 4) {
            int discarded$0 = ((qk) this).a(((byte[]) ((Object[]) ((Object[]) ((qk) this).field_g[17])[6])[4])[1], -41);
            return true;
        }
        return true;
    }

    private final synchronized boolean b(int param0, byte param1) {
        if (!((qk) this).b(4)) {
          return false;
        } else {
          if (param1 < -6) {
            L0: {
              if (0 > param0) {
                break L0;
              } else {
                if (((qk) this).field_c.field_f.length <= param0) {
                  break L0;
                } else {
                  if (0 != ((qk) this).field_c.field_f[param0]) {
                    return true;
                  } else {
                    break L0;
                  }
                }
              }
            }
            if (rh.field_j) {
              throw new IllegalArgumentException(Integer.toString(param0));
            } else {
              return false;
            }
          } else {
            return true;
          }
        }
    }

    private final synchronized byte[] a(int[] param0, int param1, byte param2, int param3) {
        Object var5 = null;
        byte[] var7 = null;
        Object stackIn_2_0 = null;
        Object stackIn_11_0 = null;
        Object stackIn_26_0 = null;
        Object stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        Object stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        Object stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_10_0 = null;
        Object stackOut_25_0 = null;
        Object stackOut_1_0 = null;
        Object stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        Object stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        Object stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        try {
          L0: {
            if (this.a(param1, 0, param3)) {
              L1: {
                L2: {
                  var5 = null;
                  if (((qk) this).field_b[param1] == null) {
                    break L2;
                  } else {
                    if (null != ((qk) this).field_b[param1][param3]) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                if (!this.a(119, param1, param0, param3)) {
                  this.a(param1, (byte) -111);
                  if (this.a(86, param1, param0, param3)) {
                    break L1;
                  } else {
                    stackOut_10_0 = null;
                    stackIn_11_0 = stackOut_10_0;
                    return (byte[]) (Object) stackIn_11_0;
                  }
                } else {
                  break L1;
                }
              }
              if (((qk) this).field_b[param1] != null) {
                L3: {
                  if (((qk) this).field_b[param1][param3] == null) {
                    break L3;
                  } else {
                    var7 = ce.a(false, 0, ((qk) this).field_b[param1][param3]);
                    var5 = (Object) (Object) var7;
                    if (var7 == null) {
                      throw new RuntimeException("");
                    } else {
                      break L3;
                    }
                  }
                }
                L4: {
                  if (var5 == null) {
                    break L4;
                  } else {
                    if (((qk) this).field_f == 1) {
                      ((qk) this).field_b[param1][param3] = null;
                      if (((qk) this).field_c.field_f[param1] == 1) {
                        ((qk) this).field_b[param1] = null;
                        break L4;
                      } else {
                        break L4;
                      }
                    } else {
                      if (2 != ((qk) this).field_f) {
                        break L4;
                      } else {
                        ((qk) this).field_b[param1] = null;
                        break L4;
                      }
                    }
                  }
                }
                stackOut_25_0 = var5;
                stackIn_26_0 = stackOut_25_0;
                break L0;
              } else {
                throw new RuntimeException("");
              }
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (byte[]) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5 = (Object) (Object) decompiledCaughtException;
            stackOut_27_0 = var5;
            stackOut_27_1 = new StringBuilder().append("qk.N(");
            stackIn_29_0 = stackOut_27_0;
            stackIn_29_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param0 == null) {
              stackOut_29_0 = stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L5;
            } else {
              stackOut_28_0 = stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "{...}";
              stackIn_30_0 = stackOut_28_0;
              stackIn_30_1 = stackOut_28_1;
              stackIn_30_2 = stackOut_28_2;
              break L5;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_30_0, stackIn_30_2 + ',' + param1 + ',' + 125 + ',' + param3 + ')');
        }
        return (byte[]) (Object) stackIn_26_0;
    }

    public static void c(int param0) {
        int var1 = 123;
        field_i = null;
        field_h = null;
        field_a = null;
    }

    final int a(String param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
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
            if (((qk) this).b(param1 + 4)) {
              L1: {
                param0 = param0.toLowerCase();
                if (param1 == 0) {
                  break L1;
                } else {
                  field_i = (String) ((qk) this).field_g[5];
                  break L1;
                }
              }
              var4 = (CharSequence) (Object) param0;
              var3_int = ((qk) this).field_c.field_h.a((byte) -100, ta.a(-54, var4));
              stackOut_5_0 = ((qk) this).a((byte) 60, var3_int);
              stackIn_6_0 = stackOut_5_0;
              break L0;
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var3;
            stackOut_7_1 = new StringBuilder().append("qk.I(");
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
          throw ma.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ',' + param1 + ')');
        }
        return stackIn_6_0;
    }

    final int a(int param0, String param1) {
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
            if (!((qk) this).b(4)) {
              stackOut_2_0 = -1;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            } else {
              L1: {
                param1 = param1.toLowerCase();
                var4 = (CharSequence) (Object) param1;
                var3_int = ((qk) this).field_c.field_h.a((byte) -100, ta.a(-62, var4));
                if (param0 == 18659) {
                  break L1;
                } else {
                  boolean discarded$2 = this.b(-2, (byte) 61);
                  break L1;
                }
              }
              if (this.b(var3_int, (byte) -126)) {
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
            stackOut_11_1 = new StringBuilder().append("qk.R(").append(param0).append(',');
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
          throw ma.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ')');
        }
        return stackIn_10_0;
    }

    private final synchronized void a(int param0, byte param1) {
        if (!((qk) this).field_e) {
            ((qk) this).field_g[param0] = sj.a(false, 136, ((qk) this).field_d.a(param0, true));
        } else {
            ((qk) this).field_g[param0] = (Object) (Object) ((qk) this).field_d.a(param0, true);
        }
        int var3 = 78 / ((72 - param1) / 41);
    }

    qk(pe param0, boolean param1, int param2) {
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
        ((qk) this).field_c = null;
        try {
          L0: {
            L1: {
              if (0 > param2) {
                break L1;
              } else {
                if (param2 <= 2) {
                  L2: {
                    ((qk) this).field_d = param0;
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
                  ((qk) this).field_e = stackIn_7_1 != 0;
                  ((qk) this).field_f = param2;
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
            stackOut_9_1 = new StringBuilder().append("qk.<init>(");
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
          throw ma.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final synchronized boolean a(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = Main.field_T;
        if (!((qk) this).b(4)) {
          return false;
        } else {
          var2 = 1;
          if (param0 >= 15) {
            var3 = 0;
            L0: while (true) {
              if (((qk) this).field_c.field_d.length <= var3) {
                return var2 != 0;
              } else {
                var4 = ((qk) this).field_c.field_d[var3];
                if (null == ((qk) this).field_g[var4]) {
                  this.a(var4, (byte) -81);
                  if (((qk) this).field_g[var4] == null) {
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
            return true;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = "Create";
        field_i = "Unfortunately we are unable to create an account for you at this time.";
    }
}
