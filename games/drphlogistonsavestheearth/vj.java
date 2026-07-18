/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class vj {
    private int field_i;
    private wd field_e;
    private boolean field_c;
    private Object[] field_h;
    private kh field_b;
    private Object[][] field_a;
    static sa field_d;
    static double[] field_f;
    static he[][] field_g;

    private final synchronized void a(byte param0, int param1) {
        if (((vj) this).field_c) {
            ((vj) this).field_h[param1] = (Object) (Object) ((vj) this).field_e.b(param1, 60);
        } else {
            ((vj) this).field_h[param1] = jk.a(false, ((vj) this).field_e.b(param1, 60), (byte) -127);
        }
    }

    final int a(int param0, byte param1) {
        if (param1 <= 125) {
            return 71;
        }
        if (!this.b(param0, (byte) 14)) {
            return 0;
        }
        return ((vj) this).field_b.field_d[param0];
    }

    final synchronized boolean c(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        if (((vj) this).a(0)) {
          L0: {
            var2 = 1;
            var3 = 0;
            if (param0 >= 16) {
              break L0;
            } else {
              ((vj) this).field_e = null;
              break L0;
            }
          }
          L1: while (true) {
            if (var3 >= ((vj) this).field_b.field_r.length) {
              return var2 != 0;
            } else {
              var4 = ((vj) this).field_b.field_r[var3];
              if (((vj) this).field_h[var4] == null) {
                this.a((byte) 109, var4);
                if (null == ((vj) this).field_h[var4]) {
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
        } else {
          return false;
        }
    }

    final synchronized boolean b(int param0, int param1, int param2) {
        if (!(this.a(param0, param1, 0))) {
            return false;
        }
        int var4 = 18 % ((param2 - 13) / 42);
        if (((vj) this).field_a[param0] != null) {
            if (!(null == ((vj) this).field_a[param0][param1])) {
                return true;
            }
        }
        if (!(null == ((vj) this).field_h[param0])) {
            return true;
        }
        this.a((byte) 109, param0);
        if (null != ((vj) this).field_h[param0]) {
            return true;
        }
        return false;
    }

    final synchronized boolean c(int param0, int param1) {
        if (!this.b(param0, (byte) 14)) {
            return false;
        }
        if (!(((vj) this).field_h[param0] == null)) {
            return true;
        }
        this.a((byte) 109, param0);
        if (null != ((vj) this).field_h[param0]) {
            return true;
        }
        if (param1 != 29691) {
            return true;
        }
        return false;
    }

    private final synchronized boolean a(boolean param0, int param1, int param2, int[] param3) {
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
        od var26 = null;
        byte[] var27 = null;
        od var29 = null;
        od var31 = null;
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
        int stackIn_8_0 = 0;
        int stackIn_22_0 = 0;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        int stackIn_36_2 = 0;
        int stackIn_57_0 = 0;
        int stackIn_102_0 = 0;
        RuntimeException stackIn_104_0 = null;
        StringBuilder stackIn_104_1 = null;
        RuntimeException stackIn_105_0 = null;
        StringBuilder stackIn_105_1 = null;
        RuntimeException stackIn_106_0 = null;
        StringBuilder stackIn_106_1 = null;
        String stackIn_106_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_7_0 = 0;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        int stackOut_35_2 = 0;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        int stackOut_34_2 = 0;
        int stackOut_56_0 = 0;
        int stackOut_101_0 = 0;
        int stackOut_21_0 = 0;
        RuntimeException stackOut_103_0 = null;
        StringBuilder stackOut_103_1 = null;
        RuntimeException stackOut_105_0 = null;
        StringBuilder stackOut_105_1 = null;
        String stackOut_105_2 = null;
        RuntimeException stackOut_104_0 = null;
        StringBuilder stackOut_104_1 = null;
        String stackOut_104_2 = null;
        var22 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            if (!this.b(param2, (byte) 14)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            } else {
              if (((vj) this).field_h[param2] == null) {
                stackOut_7_0 = 0;
                stackIn_8_0 = stackOut_7_0;
                return stackIn_8_0 != 0;
              } else {
                L1: {
                  var5_int = ((vj) this).field_b.field_k[param2];
                  var48 = ((vj) this).field_b.field_f[param2];
                  var41 = var48;
                  var34 = var41;
                  var24 = var34;
                  var6 = var24;
                  if (((vj) this).field_a[param2] == null) {
                    ((vj) this).field_a[param2] = new Object[((vj) this).field_b.field_d[param2]];
                    break L1;
                  } else {
                    break L1;
                  }
                }
                var7 = ((vj) this).field_a[param2];
                var8 = 1;
                var9_int = 0;
                L2: while (true) {
                  L3: {
                    if (var9_int >= var5_int) {
                      break L3;
                    } else {
                      L4: {
                        if (var6 == null) {
                          var10 = var9_int;
                          break L4;
                        } else {
                          var10 = var48[var9_int];
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
                              if (param3[1] != 0) {
                                break L7;
                              } else {
                                if (0 != param3[2]) {
                                  break L7;
                                } else {
                                  if (param3[3] != 0) {
                                    break L7;
                                  } else {
                                    break L6;
                                  }
                                }
                              }
                            }
                          }
                          var49 = ji.a(23436, ((vj) this).field_h[param2], true);
                          var42 = var49;
                          var35 = var42;
                          var25 = var35;
                          var9_array = var25;
                          var26 = new od(var49);
                          var26.a(param3, true, 5, var26.field_h.length);
                          break L5;
                        }
                      }
                      var9_array = ji.a(23436, ((vj) this).field_h[param2], false);
                      break L5;
                    }
                    try {
                      L8: {
                        var50 = ce.a(1, var9_array);
                        var43 = var50;
                        var36 = var43;
                        var27 = var36;
                        var23 = var27;
                        var51 = var23;
                        break L8;
                      }
                    } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L9: {
                        var11_ref_RuntimeException = decompiledCaughtException;
                        stackOut_33_0 = (RuntimeException) var11_ref_RuntimeException;
                        stackOut_33_1 = new StringBuilder();
                        stackIn_35_0 = stackOut_33_0;
                        stackIn_35_1 = stackOut_33_1;
                        stackIn_34_0 = stackOut_33_0;
                        stackIn_34_1 = stackOut_33_1;
                        if (param3 == null) {
                          stackOut_35_0 = (RuntimeException) (Object) stackIn_35_0;
                          stackOut_35_1 = (StringBuilder) (Object) stackIn_35_1;
                          stackOut_35_2 = 0;
                          stackIn_36_0 = stackOut_35_0;
                          stackIn_36_1 = stackOut_35_1;
                          stackIn_36_2 = stackOut_35_2;
                          break L9;
                        } else {
                          stackOut_34_0 = (RuntimeException) (Object) stackIn_34_0;
                          stackOut_34_1 = (StringBuilder) (Object) stackIn_34_1;
                          stackOut_34_2 = 1;
                          stackIn_36_0 = stackOut_34_0;
                          stackIn_36_1 = stackOut_34_1;
                          stackIn_36_2 = stackOut_34_2;
                          break L9;
                        }
                      }
                      throw ie.a((Throwable) (Object) stackIn_36_0, (stackIn_36_2 != 0) + " " + param2 + " " + param3.length + " " + th.a(var9_array, (byte) 127, param3.length) + " " + th.a(var9_array, (byte) 125, -2 + param3.length) + " " + ((vj) this).field_b.field_j[param2] + " " + ((vj) this).field_b.field_p);
                    }
                    L10: {
                      if (((vj) this).field_c) {
                        ((vj) this).field_h[param2] = null;
                        break L10;
                      } else {
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
                            var11 = var48[0];
                            break L12;
                          }
                        }
                        if (0 != ((vj) this).field_i) {
                          var7[var11] = (Object) (Object) var51;
                          break L11;
                        } else {
                          var7[var11] = jk.a(false, var50, (byte) -122);
                          break L11;
                        }
                      } else {
                        if (((vj) this).field_i != 2) {
                          var11 = var50.length;
                          var11--;
                          var12 = 255 & var23[var11];
                          var11 = var11 - 4 * var12 * var5_int;
                          var31 = new od(var51);
                          var31.field_j = var11;
                          var53 = new int[var5_int];
                          var46 = var53;
                          var39 = var46;
                          var32 = var39;
                          var14 = var32;
                          var15_int = 0;
                          L13: while (true) {
                            if (var12 <= var15_int) {
                              var54 = new byte[var5_int][];
                              var47 = var54;
                              var40 = var47;
                              var33 = var40;
                              var15 = var33;
                              var16 = 0;
                              L14: while (true) {
                                if (var5_int <= var16) {
                                  var31.field_j = var11;
                                  var16 = 0;
                                  var17 = 0;
                                  L15: while (true) {
                                    if (var12 <= var17) {
                                      var17 = 0;
                                      L16: while (true) {
                                        if (~var17 <= ~var5_int) {
                                          break L11;
                                        } else {
                                          L17: {
                                            if (var6 == null) {
                                              var18 = var17;
                                              break L17;
                                            } else {
                                              var18 = var48[var17];
                                              break L17;
                                            }
                                          }
                                          L18: {
                                            if (((vj) this).field_i != 0) {
                                              var7[var18] = (Object) (Object) var54[var17];
                                              break L18;
                                            } else {
                                              var7[var18] = jk.a(false, var54[var17], (byte) -124);
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
                                        if (~var19 <= ~var5_int) {
                                          var17++;
                                          continue L15;
                                        } else {
                                          var18 = var18 + var31.h(-119);
                                          kg.a(var51, var16, var54[var19], var53[var19], var18);
                                          var16 = var16 + var18;
                                          var14[var19] = var14[var19] + var18;
                                          var19++;
                                          continue L19;
                                        }
                                      }
                                    }
                                  }
                                } else {
                                  var15[var16] = new byte[var53[var16]];
                                  var53[var16] = 0;
                                  var16++;
                                  continue L14;
                                }
                              }
                            } else {
                              var16 = 0;
                              var17 = 0;
                              L20: while (true) {
                                if (var5_int <= var17) {
                                  var15_int++;
                                  continue L13;
                                } else {
                                  var16 = var16 + var31.h(-103);
                                  var14[var17] = var14[var17] + var16;
                                  var17++;
                                  continue L20;
                                }
                              }
                            }
                          }
                        } else {
                          var11 = var50.length;
                          var11--;
                          var12 = 255 & var23[var11];
                          var11 = var11 - var12 * (var5_int * 4);
                          var29 = new od(var51);
                          var14_int = 0;
                          var29.field_j = var11;
                          var15_int = 0;
                          var16 = 0;
                          L21: while (true) {
                            if (~var16 <= ~var12) {
                              if (0 == var14_int) {
                                stackOut_56_0 = 1;
                                stackIn_57_0 = stackOut_56_0;
                                return stackIn_57_0 != 0;
                              } else {
                                var52 = new byte[var14_int];
                                var29.field_j = var11;
                                var14_int = 0;
                                var17 = 0;
                                var18 = 0;
                                L22: while (true) {
                                  if (~var12 >= ~var18) {
                                    var7[var15_int] = (Object) (Object) var52;
                                    return true;
                                  } else {
                                    var19 = 0;
                                    var20 = 0;
                                    L23: while (true) {
                                      if (~var5_int >= ~var20) {
                                        var18++;
                                        continue L22;
                                      } else {
                                        L24: {
                                          var19 = var19 + var29.h(-90);
                                          if (var6 == null) {
                                            var21 = var20;
                                            break L24;
                                          } else {
                                            var21 = var48[var20];
                                            break L24;
                                          }
                                        }
                                        L25: {
                                          if (param1 == var21) {
                                            kg.a(var51, var17, var52, var14_int, var19);
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
                                    var17 = var17 + var29.h(43);
                                    if (var6 == null) {
                                      var19 = var18;
                                      break L27;
                                    } else {
                                      var19 = var48[var18];
                                      break L27;
                                    }
                                  }
                                  L28: {
                                    if (~param1 == ~var19) {
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
                    stackOut_101_0 = 1;
                    stackIn_102_0 = stackOut_101_0;
                    break L0;
                  } else {
                    stackOut_21_0 = 1;
                    stackIn_22_0 = stackOut_21_0;
                    return stackIn_22_0 != 0;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L29: {
            var5 = decompiledCaughtException;
            stackOut_103_0 = (RuntimeException) var5;
            stackOut_103_1 = new StringBuilder().append("vj.J(").append(true).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_105_0 = stackOut_103_0;
            stackIn_105_1 = stackOut_103_1;
            stackIn_104_0 = stackOut_103_0;
            stackIn_104_1 = stackOut_103_1;
            if (param3 == null) {
              stackOut_105_0 = (RuntimeException) (Object) stackIn_105_0;
              stackOut_105_1 = (StringBuilder) (Object) stackIn_105_1;
              stackOut_105_2 = "null";
              stackIn_106_0 = stackOut_105_0;
              stackIn_106_1 = stackOut_105_1;
              stackIn_106_2 = stackOut_105_2;
              break L29;
            } else {
              stackOut_104_0 = (RuntimeException) (Object) stackIn_104_0;
              stackOut_104_1 = (StringBuilder) (Object) stackIn_104_1;
              stackOut_104_2 = "{...}";
              stackIn_106_0 = stackOut_104_0;
              stackIn_106_1 = stackOut_104_1;
              stackIn_106_2 = stackOut_104_2;
              break L29;
            }
          }
          throw ie.a((Throwable) (Object) stackIn_106_0, stackIn_106_2 + ')');
        }
        return stackIn_102_0 != 0;
    }

    final boolean a(int param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
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
        try {
          L0: {
            if (((vj) this).a(0)) {
              if (param0 == 255) {
                param1 = param1.toLowerCase();
                var4 = (CharSequence) (Object) param1;
                var3_int = ((vj) this).field_b.field_s.a(ml.a((byte) -86, var4), param0 + -256);
                stackOut_6_0 = ((vj) this).c(var3_int, 29691);
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
            var3 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var3;
            stackOut_8_1 = new StringBuilder().append("vj.O(").append(param0).append(',');
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
          throw ie.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ')');
        }
        return stackIn_7_0;
    }

    private final synchronized byte[] a(int param0, int param1, int[] param2, int param3) {
        Object var5 = null;
        byte[] var7 = null;
        Object stackIn_2_0 = null;
        Object stackIn_26_0 = null;
        Object stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        Object stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        Object stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
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
            if (this.a(param3, param0, param1 + 14080)) {
              L1: {
                L2: {
                  var5 = null;
                  if (((vj) this).field_a[param3] == null) {
                    break L2;
                  } else {
                    if (null == ((vj) this).field_a[param3][param0]) {
                      break L2;
                    } else {
                      break L1;
                    }
                  }
                }
                if (this.a(true, param0, param3, param2)) {
                  break L1;
                } else {
                  this.a((byte) 109, param3);
                  if (this.a(true, param0, param3, param2)) {
                    break L1;
                  } else {
                    return null;
                  }
                }
              }
              if (null != ((vj) this).field_a[param3]) {
                L3: {
                  if (null != ((vj) this).field_a[param3][param0]) {
                    var7 = ji.a(param1 ^ -28020, ((vj) this).field_a[param3][param0], false);
                    var5 = (Object) (Object) var7;
                    if (var7 != null) {
                      break L3;
                    } else {
                      throw new RuntimeException("");
                    }
                  } else {
                    break L3;
                  }
                }
                L4: {
                  if (param1 == -14080) {
                    break L4;
                  } else {
                    field_g = null;
                    break L4;
                  }
                }
                L5: {
                  if (var5 == null) {
                    break L5;
                  } else {
                    if (((vj) this).field_i == 1) {
                      ((vj) this).field_a[param3][param0] = null;
                      if (((vj) this).field_b.field_d[param3] != 1) {
                        break L5;
                      } else {
                        ((vj) this).field_a[param3] = null;
                        break L5;
                      }
                    } else {
                      if (2 == ((vj) this).field_i) {
                        ((vj) this).field_a[param3] = null;
                        break L5;
                      } else {
                        break L5;
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
          L6: {
            var5 = (Object) (Object) decompiledCaughtException;
            stackOut_27_0 = var5;
            stackOut_27_1 = new StringBuilder().append("vj.A(").append(param0).append(',').append(param1).append(',');
            stackIn_29_0 = stackOut_27_0;
            stackIn_29_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param2 == null) {
              stackOut_29_0 = stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L6;
            } else {
              stackOut_28_0 = stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "{...}";
              stackIn_30_0 = stackOut_28_0;
              stackIn_30_1 = stackOut_28_1;
              stackIn_30_2 = stackOut_28_2;
              break L6;
            }
          }
          throw ie.a((Throwable) (Object) stackIn_30_0, stackIn_30_2 + ',' + param3 + ')');
        }
        return (byte[]) (Object) stackIn_26_0;
    }

    final boolean a(byte param0, String param1) {
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
            if (!((vj) this).a(0)) {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            } else {
              L1: {
                param1 = param1.toLowerCase();
                if (param0 == 12) {
                  break L1;
                } else {
                  int discarded$2 = ((vj) this).a(-107, -32);
                  break L1;
                }
              }
              var4 = (CharSequence) (Object) param1;
              var3_int = ((vj) this).field_b.field_s.a(ml.a((byte) -86, var4), -1);
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
            stackOut_11_1 = new StringBuilder().append("vj.V(").append(param0).append(',');
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
          throw ie.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ')');
        }
        return stackIn_10_0 != 0;
    }

    private final synchronized boolean b(int param0, byte param1) {
        if (!((vj) this).a(0)) {
            return false;
        }
        if (param0 >= 0) {
            if (~((vj) this).field_b.field_d.length < ~param0) {
                if (((vj) this).field_b.field_d[param0] != 0) {
                    return true;
                }
            }
        }
        if (hm.field_f) {
            throw new IllegalArgumentException(Integer.toString(param0));
        }
        return false;
    }

    final synchronized int a(int param0, int param1) {
        if (!this.b(param1, (byte) 14)) {
            return 0;
        }
        if (!(null == ((vj) this).field_h[param1])) {
            return 100;
        }
        int var3 = -97 / ((param0 - -44) / 48);
        return ((vj) this).field_e.a(param1, -1);
    }

    final boolean a(int param0, String param1, String param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        Object var6 = null;
        CharSequence var7 = null;
        CharSequence var8 = null;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        boolean stackIn_10_0 = false;
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
        int stackOut_7_0 = 0;
        boolean stackOut_9_0 = false;
        int stackOut_3_0 = 0;
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
            L1: {
              if (param0 < -10) {
                break L1;
              } else {
                var6 = null;
                byte[] discarded$2 = ((vj) this).a((String) null, (String) null, 89);
                break L1;
              }
            }
            if (((vj) this).a(0)) {
              param1 = param1.toLowerCase();
              param2 = param2.toLowerCase();
              var7 = (CharSequence) (Object) param1;
              var4_int = ((vj) this).field_b.field_s.a(ml.a((byte) -86, var7), -1);
              if (!this.b(var4_int, (byte) 14)) {
                stackOut_7_0 = 0;
                stackIn_8_0 = stackOut_7_0;
                return stackIn_8_0 != 0;
              } else {
                var8 = (CharSequence) (Object) param2;
                var5 = ((vj) this).field_b.field_b[var4_int].a(ml.a((byte) -86, var8), -1);
                stackOut_9_0 = ((vj) this).b(var4_int, var5, -52);
                stackIn_10_0 = stackOut_9_0;
                break L0;
              }
            } else {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var4;
            stackOut_11_1 = new StringBuilder().append("vj.DA(").append(param0).append(',');
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
          L3: {
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
              break L3;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L3;
            }
          }
          throw ie.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ')');
        }
        return stackIn_10_0;
    }

    public static void c(int param0) {
        field_g = null;
        if (param0 != 0) {
            return;
        }
        field_d = null;
        field_f = null;
    }

    final synchronized int d(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        if (((vj) this).a(0)) {
          L0: {
            var2 = 0;
            if (param0 == 95) {
              break L0;
            } else {
              ((boolean[]) ((vj) this).field_h[1])[3] = ((boolean[]) ((vj) this).field_h[3])[1];
              break L0;
            }
          }
          var3 = 0;
          var4 = 0;
          L1: while (true) {
            if (((vj) this).field_h.length <= var4) {
              if (var2 == 0) {
                return 100;
              } else {
                var4 = 100 * var3 / var2;
                return var4;
              }
            } else {
              if (((vj) this).field_b.field_k[var4] > 0) {
                var2 += 100;
                var3 = var3 + ((vj) this).a(-100, var4);
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

    final byte[] a(int param0, int param1, byte param2) {
        if (param2 != 35) {
            int discarded$0 = vj.e((byte) -62);
        }
        return this.a(param1, param2 + -14115, (int[]) null, param0);
    }

    private final synchronized boolean a(int param0, int param1, int param2) {
        if (((vj) this).a(param2 + param2)) {
          L0: {
            if (0 > param0) {
              break L0;
            } else {
              if (param1 < 0) {
                break L0;
              } else {
                if (((vj) this).field_b.field_d.length <= param0) {
                  break L0;
                } else {
                  if (((vj) this).field_b.field_d[param0] > param1) {
                    return true;
                  } else {
                    break L0;
                  }
                }
              }
            }
          }
          if (!hm.field_f) {
            return false;
          } else {
            throw new IllegalArgumentException(param0 + " " + param1);
          }
        } else {
          return false;
        }
    }

    final int b(int param0) {
        if (!((vj) this).a(0)) {
            return -1;
        }
        if (param0 != -16032) {
            ((byte[]) ((vj) this).field_h[1])[8] = (byte) -39;
        }
        return ((vj) this).field_b.field_d.length;
    }

    final synchronized byte[] a(String param0, String param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        Object var6 = null;
        CharSequence var7 = null;
        CharSequence var8 = null;
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
            if (((vj) this).a(0)) {
              L1: {
                param0 = param0.toLowerCase();
                if (param2 == 24874) {
                  break L1;
                } else {
                  var6 = null;
                  int discarded$2 = ((vj) this).a((byte) -82, (String) null, 10);
                  break L1;
                }
              }
              param1 = param1.toLowerCase();
              var7 = (CharSequence) (Object) param0;
              var4_int = ((vj) this).field_b.field_s.a(ml.a((byte) -86, var7), -1);
              if (this.b(var4_int, (byte) 14)) {
                var8 = (CharSequence) (Object) param1;
                var5 = ((vj) this).field_b.field_b[var4_int].a(ml.a((byte) -86, var8), -1);
                stackOut_8_0 = ((vj) this).a(var4_int, var5, (byte) 35);
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
            stackOut_10_1 = new StringBuilder().append("vj.E(");
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
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param1 == null) {
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
          throw ie.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ',' + param2 + ')');
        }
        return stackIn_9_0;
    }

    final static void b(byte param0) {
        if (!pf.a((byte) 97)) {
            return;
        }
        int var1 = 0;
        jk.a((byte) 49, false, 4);
    }

    final synchronized byte[] b(int param0, int param1) {
        if (!((vj) this).a(0)) {
            return null;
        }
        if (!(((vj) this).field_b.field_d.length != 1)) {
            return ((vj) this).a(0, param0, (byte) 35);
        }
        if (!this.b(param0, (byte) 14)) {
            return null;
        }
        if (!(param1 != ~((vj) this).field_b.field_d[param0])) {
            return ((vj) this).a(param0, 0, (byte) 35);
        }
        throw new RuntimeException();
    }

    final static mk a(byte param0) {
        mk var1 = new mk();
        int var2 = 0;
        var1.field_h = new int[1440000];
        return var1;
    }

    final int a(String param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_5_0 = 0;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        try {
          L0: {
            if (!((vj) this).a(0)) {
              stackOut_2_0 = -1;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            } else {
              param0 = param0.toLowerCase();
              if (param1 < -75) {
                var4 = (CharSequence) (Object) param0;
                var3_int = ((vj) this).field_b.field_s.a(ml.a((byte) -86, var4), -1);
                if (this.b(var3_int, (byte) 14)) {
                  stackOut_10_0 = var3_int;
                  stackIn_11_0 = stackOut_10_0;
                  break L0;
                } else {
                  stackOut_8_0 = -1;
                  stackIn_9_0 = stackOut_8_0;
                  return stackIn_9_0;
                }
              } else {
                stackOut_5_0 = -83;
                stackIn_6_0 = stackOut_5_0;
                return stackIn_6_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var3;
            stackOut_12_1 = new StringBuilder().append("vj.R(");
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
              break L1;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L1;
            }
          }
          throw ie.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ',' + param1 + ')');
        }
        return stackIn_11_0;
    }

    final static String a(String param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        char[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        String stackIn_7_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_6_0 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        var5 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              var2_int = param0.length();
              if (param1 <= -110) {
                break L1;
              } else {
                vj.c(4);
                break L1;
              }
            }
            var3 = new char[var2_int];
            var4 = 0;
            L2: while (true) {
              if (var4 >= var2_int) {
                stackOut_6_0 = new String(var3);
                stackIn_7_0 = stackOut_6_0;
                break L0;
              } else {
                var3[var2_int + (-1 + -var4)] = param0.charAt(var4);
                var4++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var2;
            stackOut_8_1 = new StringBuilder().append("vj.U(");
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
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw ie.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ',' + param1 + ')');
        }
        return stackIn_7_0;
    }

    final int b(int param0, String param1) {
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
              if (param0 == 10461) {
                break L1;
              } else {
                ((int[]) ((vj) this).field_h[9])[0] = -80;
                break L1;
              }
            }
            if (((vj) this).a(0)) {
              param1 = param1.toLowerCase();
              var4 = (CharSequence) (Object) param1;
              var3_int = ((vj) this).field_b.field_s.a(ml.a((byte) -86, var4), -1);
              stackOut_5_0 = ((vj) this).a(-100, var3_int);
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
            stackOut_7_1 = new StringBuilder().append("vj.L(").append(param0).append(',');
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
          throw ie.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ')');
        }
        return stackIn_6_0;
    }

    final static String a(boolean param0, CharSequence param1) {
        RuntimeException var2 = null;
        String stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_2_0 = null;
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
            stackOut_2_0 = ge.a((byte) 88, false, param1);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var2;
            stackOut_4_1 = new StringBuilder().append("vj.EA(").append(true).append(',');
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
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L1;
            }
          }
          throw ie.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    final synchronized boolean a(int param0) {
        if (!(null != ((vj) this).field_b)) {
            ((vj) this).field_b = ((vj) this).field_e.a((byte) -116);
            if (!(((vj) this).field_b != null)) {
                return false;
            }
            ((vj) this).field_a = new Object[((vj) this).field_b.field_m][];
            ((vj) this).field_h = new Object[((vj) this).field_b.field_m];
        }
        if (param0 != 0) {
            ((long[]) ((vj) this).field_h[6])[10] = ((long[]) ((Object[]) ((vj) this).field_h[16])[3])[2];
            return true;
        }
        return true;
    }

    final int a(byte param0, String param1, int param2) {
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
            if (this.b(param2, (byte) 14)) {
              param1 = param1.toLowerCase();
              if (param0 < -26) {
                var5 = (CharSequence) (Object) param1;
                var4_int = ((vj) this).field_b.field_b[param2].a(ml.a((byte) -86, var5), -1);
                if (!this.a(param2, var4_int, 0)) {
                  stackOut_8_0 = -1;
                  stackIn_9_0 = stackOut_8_0;
                  break L0;
                } else {
                  return var4_int;
                }
              } else {
                stackOut_4_0 = -38;
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
          L1: {
            var4 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var4;
            stackOut_10_1 = new StringBuilder().append("vj.H(").append(param0).append(',');
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
              break L1;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L1;
            }
          }
          throw ie.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ',' + param2 + ')');
        }
        return stackIn_9_0;
    }

    final static int e(byte param0) {
        try {
            IOException var1 = null;
            int var1_int = 0;
            Object var2 = null;
            od var3 = null;
            int stackIn_12_0 = 0;
            int stackIn_24_0 = 0;
            int stackIn_27_0 = 0;
            int stackIn_34_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_11_0 = 0;
            int stackOut_26_0 = 0;
            int stackOut_23_0 = 0;
            int stackOut_33_0 = 0;
            if (4 > p.field_a.field_c) {
              try {
                L0: {
                  L1: {
                    if (hf.field_C != 0) {
                      break L1;
                    } else {
                      tc.field_e = oi.field_e.a(g.field_r, j.field_ib, 35);
                      hf.field_C = hf.field_C + 1;
                      break L1;
                    }
                  }
                  L2: {
                    if (hf.field_C != 1) {
                      break L2;
                    } else {
                      if (tc.field_e.field_b != 2) {
                        if (tc.field_e.field_b == 1) {
                          hf.field_C = hf.field_C + 1;
                          break L2;
                        } else {
                          break L2;
                        }
                      } else {
                        stackOut_11_0 = uj.a((byte) 85, -1);
                        stackIn_12_0 = stackOut_11_0;
                        return stackIn_12_0;
                      }
                    }
                  }
                  L3: {
                    if (hf.field_C != 2) {
                      break L3;
                    } else {
                      ea.field_a = new qe((java.net.Socket) tc.field_e.field_g, oi.field_e);
                      var3 = new od(13);
                      q.a(tb.field_a, gi.field_c, 26800, pk.field_q, var3);
                      var3.c(15, (byte) -92);
                      var3.a(mi.field_j, (byte) 107);
                      ea.field_a.a(13, -30537, var3.field_h, 0);
                      hf.field_C = hf.field_C + 1;
                      pf.field_a = la.a(false) - -30000L;
                      break L3;
                    }
                  }
                  L4: {
                    if (3 == hf.field_C) {
                      if (0 < ea.field_a.a((byte) 41)) {
                        var1_int = ea.field_a.a(-125);
                        if (var1_int == 0) {
                          hf.field_C = hf.field_C + 1;
                          break L4;
                        } else {
                          stackOut_26_0 = uj.a((byte) 85, var1_int);
                          stackIn_27_0 = stackOut_26_0;
                          return stackIn_27_0;
                        }
                      } else {
                        if (pf.field_a < la.a(false)) {
                          stackOut_23_0 = uj.a((byte) 85, -2);
                          stackIn_24_0 = stackOut_23_0;
                          return stackIn_24_0;
                        } else {
                          break L4;
                        }
                      }
                    } else {
                      break L4;
                    }
                  }
                  L5: {
                    if (param0 < -28) {
                      break L5;
                    } else {
                      var2 = null;
                      String discarded$1 = vj.a(true, (CharSequence) null);
                      break L5;
                    }
                  }
                  if (hf.field_C == 4) {
                    p.field_a.a((Object) (Object) ea.field_a, uf.field_i, (byte) -102);
                    ea.field_a = null;
                    hf.field_C = 0;
                    tc.field_e = null;
                    stackOut_33_0 = 0;
                    stackIn_34_0 = stackOut_33_0;
                    break L0;
                  } else {
                    return -1;
                  }
                }
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var1 = (IOException) (Object) decompiledCaughtException;
                return uj.a((byte) 85, -3);
              }
              return stackIn_34_0;
            } else {
              if (p.field_a.field_h == -1) {
                return 3;
              } else {
                if (-2 == p.field_a.field_h) {
                  return 4;
                } else {
                  return 1;
                }
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    vj(wd param0, boolean param1, int param2) {
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
        ((vj) this).field_b = null;
        try {
          L0: {
            L1: {
              if (param2 < 0) {
                break L1;
              } else {
                if (param2 <= 2) {
                  L2: {
                    ((vj) this).field_e = param0;
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
                  ((vj) this).field_c = stackIn_7_1 != 0;
                  ((vj) this).field_i = param2;
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
            stackOut_9_1 = new StringBuilder().append("vj.<init>(");
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
          throw ie.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new sa(15, 0, 1, 0);
        field_f = new double[2];
        field_g = new he[77][];
    }
}
