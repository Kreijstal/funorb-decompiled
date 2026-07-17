/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class ek extends vg implements ni {
    static String field_H;
    static String field_y;
    static bi field_z;
    vg[] field_B;
    static String field_G;
    static int field_A;
    static qr field_E;
    static bc field_D;
    static boolean[] field_F;

    private final boolean a(int param0, int param1, vg param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        vg var6 = null;
        vg var7 = null;
        int var8 = 0;
        int stackIn_3_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_21_0 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_20_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        var8 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            var4_int = 24;
            if (null != ((ek) this).field_B) {
              var5 = ((ek) this).field_B.length - 1;
              L1: while (true) {
                if (var5 < 0) {
                  stackOut_20_0 = 0;
                  stackIn_21_0 = stackOut_20_0;
                  break L0;
                } else {
                  L2: {
                    var6 = ((ek) this).field_B[var5];
                    var7 = var6;
                    var7 = var6;
                    if (null == var6) {
                      break L2;
                    } else {
                      if (var6.f(1)) {
                        var5 = var5 - 1;
                        L3: while (true) {
                          if (var5 < 0) {
                            break L2;
                          } else {
                            L4: {
                              var7 = ((ek) this).field_B[var5];
                              if (null == var7) {
                                break L4;
                              } else {
                                if (var7.a((byte) 123, param2)) {
                                  stackOut_16_0 = 1;
                                  stackIn_17_0 = stackOut_16_0;
                                  return stackIn_17_0 != 0;
                                } else {
                                  break L4;
                                }
                              }
                            }
                            var5 = var5 - 1;
                            continue L3;
                          }
                        }
                      } else {
                        break L2;
                      }
                    }
                  }
                  var5--;
                  continue L1;
                }
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) var4;
            stackOut_22_1 = new StringBuilder().append("ek.H(").append(1).append(44).append(22).append(44);
            stackIn_25_0 = stackOut_22_0;
            stackIn_25_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param2 == null) {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L5;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_26_0 = stackOut_23_0;
              stackIn_26_1 = stackOut_23_1;
              stackIn_26_2 = stackOut_23_2;
              break L5;
            }
          }
          throw r.a((Throwable) (Object) stackIn_26_0, stackIn_26_2 + 41);
        }
        return stackIn_21_0 != 0;
    }

    final boolean a(int param0, int param1, int param2, vg param3, int param4, int param5, int param6) {
        RuntimeException var8 = null;
        vg[] var8_array = null;
        int var9 = 0;
        vg var10 = null;
        int var11 = 0;
        vg[] var12 = null;
        int stackIn_5_0 = 0;
        int stackIn_15_0 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_14_0 = 0;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        var11 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            if (((ek) this).field_B == null) {
              stackOut_4_0 = 0;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0 != 0;
            } else {
              var12 = ((ek) this).field_B;
              var8_array = var12;
              var9 = param0;
              L1: while (true) {
                if (var12.length <= var9) {
                  stackOut_14_0 = 0;
                  stackIn_15_0 = stackOut_14_0;
                  break L0;
                } else {
                  L2: {
                    var10 = var12[var9];
                    if (null == var10) {
                      break L2;
                    } else {
                      if (!var10.f(1)) {
                        break L2;
                      } else {
                        if (!var10.a(param0, param1, param2, param3, param4, param5, param6)) {
                          break L2;
                        } else {
                          return true;
                        }
                      }
                    }
                  }
                  var9++;
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var8 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var8;
            stackOut_16_1 = new StringBuilder().append("ek.MA(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_19_0 = stackOut_16_0;
            stackIn_19_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param3 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L3;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_20_0 = stackOut_17_0;
              stackIn_20_1 = stackOut_17_1;
              stackIn_20_2 = stackOut_17_2;
              break L3;
            }
          }
          throw r.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + 44 + param4 + 44 + param5 + 44 + param6 + 41);
        }
        return stackIn_15_0 != 0;
    }

    ek(int param0, int param1, int param2, int param3, iq param4) {
        super(param0, param1, param2, param3, param4, (ko) null);
    }

    final boolean a(int param0, char param1, int param2, vg param3) {
        vg[] var5 = null;
        RuntimeException var5_ref = null;
        int var5_int = 0;
        int var6 = 0;
        vg var7 = null;
        int var8 = 0;
        vg[] var9 = null;
        int stackIn_3_0 = 0;
        int stackIn_14_0 = 0;
        boolean stackIn_21_0 = false;
        int stackIn_23_0 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_22_0 = 0;
        boolean stackOut_20_0 = false;
        boolean stackOut_18_0 = false;
        int stackOut_13_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        var8 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            if (null != ((ek) this).field_B) {
              L1: {
                if (param2 == 13) {
                  break L1;
                } else {
                  bi[] discarded$2 = ek.a(12, 50, -9, 113, (byte) 82);
                  break L1;
                }
              }
              var9 = ((ek) this).field_B;
              var5 = var9;
              var6 = 0;
              L2: while (true) {
                if (var6 >= var9.length) {
                  var5_int = param0;
                  if (80 != var5_int) {
                    stackOut_22_0 = 0;
                    stackIn_23_0 = stackOut_22_0;
                    break L0;
                  } else {
                    L3: {
                      if (di.field_p[81]) {
                        stackOut_20_0 = this.a(111, param3);
                        stackIn_21_0 = stackOut_20_0;
                        break L3;
                      } else {
                        stackOut_18_0 = this.a(param3, -1);
                        stackIn_21_0 = stackOut_18_0;
                        break L3;
                      }
                    }
                    return stackIn_21_0;
                  }
                } else {
                  L4: {
                    var7 = var9[var6];
                    if (var7 == null) {
                      break L4;
                    } else {
                      if (!var7.f(1)) {
                        break L4;
                      } else {
                        if (var7.a(param0, param1, 13, param3)) {
                          stackOut_13_0 = 1;
                          stackIn_14_0 = stackOut_13_0;
                          return stackIn_14_0 != 0;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                  var6++;
                  continue L2;
                }
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5_ref = decompiledCaughtException;
            stackOut_24_0 = (RuntimeException) var5_ref;
            stackOut_24_1 = new StringBuilder().append("ek.B(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_27_0 = stackOut_24_0;
            stackIn_27_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param3 == null) {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L5;
            } else {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "{...}";
              stackIn_28_0 = stackOut_25_0;
              stackIn_28_1 = stackOut_25_1;
              stackIn_28_2 = stackOut_25_2;
              break L5;
            }
          }
          throw r.a((Throwable) (Object) stackIn_28_0, stackIn_28_2 + 41);
        }
        return stackIn_23_0 != 0;
    }

    private final boolean a(vg param0, int param1) {
        RuntimeException var3 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_2_0 = false;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            int discarded$4 = 1;
            int discarded$5 = -110;
            stackOut_2_0 = this.a(param0);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("ek.A(");
            stackIn_7_0 = stackOut_4_0;
            stackIn_7_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_8_0 = stackOut_5_0;
              stackIn_8_1 = stackOut_5_1;
              stackIn_8_2 = stackOut_5_2;
              break L1;
            }
          }
          throw r.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 44 + -1 + 41);
        }
        return stackIn_3_0;
    }

    private final void a(int param0, StringBuilder param1, Hashtable param2) {
        RuntimeException var5 = null;
        int var6 = 0;
        vg var7 = null;
        int var8 = 0;
        int var9 = 0;
        vg[] var10 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        var9 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            if (((ek) this).field_B != null) {
              var10 = ((ek) this).field_B;
              var6 = 0;
              L1: while (true) {
                if (var6 >= var10.length) {
                  break L0;
                } else {
                  var7 = var10[var6];
                  StringBuilder discarded$29 = param1.append(10);
                  var8 = 0;
                  L2: while (true) {
                    if (param0 < var8) {
                      L3: {
                        if (null == var7) {
                          StringBuilder discarded$30 = param1.append("null");
                          break L3;
                        } else {
                          StringBuilder discarded$31 = var7.a((byte) -28, param2, 1 + param0, param1);
                          break L3;
                        }
                      }
                      var6++;
                      continue L1;
                    } else {
                      StringBuilder discarded$32 = param1.append(32);
                      var8++;
                      continue L2;
                    }
                  }
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var5;
            stackOut_15_1 = new StringBuilder().append("ek.I(").append(param0).append(44);
            stackIn_18_0 = stackOut_15_0;
            stackIn_18_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param1 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L4;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_19_0 = stackOut_16_0;
              stackIn_19_1 = stackOut_16_1;
              stackIn_19_2 = stackOut_16_2;
              break L4;
            }
          }
          L5: {
            stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
            stackOut_19_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(44);
            stackIn_22_0 = stackOut_19_0;
            stackIn_22_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param2 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L5;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_23_0 = stackOut_20_0;
              stackIn_23_1 = stackOut_20_1;
              stackIn_23_2 = stackOut_20_2;
              break L5;
            }
          }
          throw r.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + 44 + 0 + 41);
        }
    }

    final void a(int param0, int param1, byte param2, int param3, int param4) {
        if (param2 <= 99) {
            vg discarded$0 = this.a((byte) 48);
        }
        super.a(param0, param1, (byte) 101, param3, param4);
        ((ek) this).h(116);
    }

    final static bi[] a(int param0, int param1, int param2, int param3, byte param4) {
        if (param4 != -92) {
            field_E = null;
        }
        return pg.a(param2, 1, 1, (byte) -41, param3, param0, 3, 1, param1);
    }

    final static boolean a(int param0, int param1, int param2, byte param3, int param4, int param5, int param6) {
        int stackIn_9_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_8_0 = 0;
        L0: {
          if (param3 < -66) {
            break L0;
          } else {
            ek.a(-78);
            break L0;
          }
        }
        L1: {
          L2: {
            if (param2 > param1) {
              break L2;
            } else {
              if (param2 + param5 <= param1) {
                break L2;
              } else {
                if (param6 < param4) {
                  break L2;
                } else {
                  if (param6 >= param0 + param4) {
                    break L2;
                  } else {
                    stackOut_6_0 = 1;
                    stackIn_9_0 = stackOut_6_0;
                    break L1;
                  }
                }
              }
            }
          }
          stackOut_8_0 = 0;
          stackIn_9_0 = stackOut_8_0;
          break L1;
        }
        return stackIn_9_0 != 0;
    }

    final void e(byte param0) {
        vg[] var2 = null;
        int var3 = 0;
        int var4 = 0;
        vg var5 = null;
        int var6 = 0;
        vg[] var7 = null;
        var6 = ShatteredPlansClient.field_F ? 1 : 0;
        var7 = ((ek) this).field_B;
        var2 = var7;
        var3 = 119 % ((param0 - -84) / 33);
        var4 = 0;
        L0: while (true) {
          if (var7.length <= var4) {
            return;
          } else {
            var5 = var7[var4];
            if (var5 != null) {
              var5.e((byte) 6);
              var4++;
              continue L0;
            } else {
              var4++;
              continue L0;
            }
          }
        }
    }

    public static void a(int param0) {
        field_D = null;
        field_z = null;
        field_F = null;
        field_y = null;
        field_G = null;
        field_E = null;
        if (param0 != -1) {
            field_F = null;
        }
        field_H = null;
    }

    void a(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        vg var6 = null;
        int var7 = 0;
        L0: {
          var7 = ShatteredPlansClient.field_F ? 1 : 0;
          if (param0 != 0) {
            break L0;
          } else {
            if (null == ((ek) this).field_p) {
              break L0;
            } else {
              ((ek) this).field_p.a((vg) this, param3, true, param2, (byte) 12);
              break L0;
            }
          }
        }
        L1: {
          if (param1 == -11857) {
            break L1;
          } else {
            ((ek) this).a(-17, 93, (byte) 121, 115, -79);
            break L1;
          }
        }
        L2: {
          if (((ek) this).field_B != null) {
            var5 = -1 + ((ek) this).field_B.length;
            L3: while (true) {
              if (var5 < 0) {
                break L2;
              } else {
                var6 = ((ek) this).field_B[var5];
                if (null != var6) {
                  var6.a(param0, param1, ((ek) this).field_q + param2, ((ek) this).field_m + param3);
                  var5--;
                  continue L3;
                } else {
                  var5--;
                  continue L3;
                }
              }
            }
          } else {
            break L2;
          }
        }
    }

    final boolean a(int param0, int param1, byte param2, int param3, int param4, int param5, vg param6) {
        vg[] var8 = null;
        RuntimeException var8_ref = null;
        int var9 = 0;
        vg var10 = null;
        int var11 = 0;
        vg[] var12 = null;
        int stackIn_3_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_15_0 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_14_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        var11 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            if (null != ((ek) this).field_B) {
              var12 = ((ek) this).field_B;
              var8 = var12;
              var9 = 0;
              L1: while (true) {
                if (var9 >= var12.length) {
                  if (param2 >= 95) {
                    stackOut_14_0 = 0;
                    stackIn_15_0 = stackOut_14_0;
                    break L0;
                  } else {
                    stackOut_12_0 = 1;
                    stackIn_13_0 = stackOut_12_0;
                    return stackIn_13_0 != 0;
                  }
                } else {
                  L2: {
                    var10 = var12[var9];
                    if (null == var10) {
                      break L2;
                    } else {
                      if (!var10.a(param0, param1, (byte) 111, param3, ((ek) this).field_m + param4, ((ek) this).field_q + param5, param6)) {
                        break L2;
                      } else {
                        return true;
                      }
                    }
                  }
                  var9++;
                  continue L1;
                }
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var8_ref = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var8_ref;
            stackOut_16_1 = new StringBuilder().append("ek.TA(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44).append(param4).append(44).append(param5).append(44);
            stackIn_19_0 = stackOut_16_0;
            stackIn_19_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param6 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L3;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_20_0 = stackOut_17_0;
              stackIn_20_1 = stackOut_17_1;
              stackIn_20_2 = stackOut_17_2;
              break L3;
            }
          }
          throw r.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + 41);
        }
        return stackIn_15_0 != 0;
    }

    private final vg a(byte param0) {
        vg[] var2 = null;
        int var3 = 0;
        vg var4 = null;
        int var5 = 0;
        vg[] var6 = null;
        var5 = ShatteredPlansClient.field_F ? 1 : 0;
        if (null != ((ek) this).field_B) {
          var6 = ((ek) this).field_B;
          var2 = var6;
          var3 = 0;
          L0: while (true) {
            if (var3 >= var6.length) {
              if (param0 != -96) {
                field_z = null;
                return null;
              } else {
                return null;
              }
            } else {
              var4 = var6[var3];
              if (var4 != null) {
                if (var4.f(1)) {
                  return var4;
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
          return null;
        }
    }

    final boolean f(int param0) {
        int stackIn_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_3_0 = 0;
        if (param0 == 1) {
          L0: {
            if (null == this.a((byte) -96)) {
              stackOut_5_0 = 0;
              stackIn_6_0 = stackOut_5_0;
              break L0;
            } else {
              stackOut_3_0 = 1;
              stackIn_6_0 = stackOut_3_0;
              break L0;
            }
          }
          return stackIn_6_0 != 0;
        } else {
          return false;
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, vg param5) {
        vg[] var7 = null;
        RuntimeException var7_ref = null;
        int var8 = 0;
        vg var9 = null;
        int var10 = 0;
        vg[] var11 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var10 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            if (((ek) this).field_B == null) {
              return;
            } else {
              var11 = ((ek) this).field_B;
              var7 = var11;
              var8 = 0;
              L1: while (true) {
                if (var8 >= var11.length) {
                  L2: {
                    if (param4 == -600269855) {
                      break L2;
                    } else {
                      field_E = null;
                      break L2;
                    }
                  }
                  break L0;
                } else {
                  L3: {
                    var9 = var11[var8];
                    if (null == var9) {
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  var8++;
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var7_ref = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var7_ref;
            stackOut_12_1 = new StringBuilder().append("ek.HA(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44).append(param4).append(44);
            stackIn_15_0 = stackOut_12_0;
            stackIn_15_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param5 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_16_0 = stackOut_13_0;
              stackIn_16_1 = stackOut_13_1;
              stackIn_16_2 = stackOut_13_2;
              break L4;
            }
          }
          throw r.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 41);
        }
    }

    abstract void h(int param0);

    final boolean a(byte param0, vg param1) {
        vg[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        vg var6 = null;
        int var7 = 0;
        vg[] var8 = null;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_7_0 = 0;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var7 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            var4 = 101 / ((61 - param0) / 59);
            var8 = ((ek) this).field_B;
            var3 = var8;
            var5 = 0;
            L1: while (true) {
              if (var5 >= var8.length) {
                stackOut_10_0 = 0;
                stackIn_11_0 = stackOut_10_0;
                break L0;
              } else {
                L2: {
                  var6 = var8[var5];
                  if (null == var6) {
                    break L2;
                  } else {
                    if (var6.a((byte) -10, param1)) {
                      stackOut_7_0 = 1;
                      stackIn_8_0 = stackOut_7_0;
                      return stackIn_8_0 != 0;
                    } else {
                      break L2;
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
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var3_ref;
            stackOut_12_1 = new StringBuilder().append("ek.CA(").append(param0).append(44);
            stackIn_15_0 = stackOut_12_0;
            stackIn_15_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param1 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L3;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_16_0 = stackOut_13_0;
              stackIn_16_1 = stackOut_13_1;
              stackIn_16_2 = stackOut_13_2;
              break L3;
            }
          }
          throw r.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 41);
        }
        return stackIn_11_0 != 0;
    }

    private final boolean a(vg param0) {
        RuntimeException var4 = null;
        int var4_int = 0;
        vg var5 = null;
        vg var6 = null;
        int var7 = 0;
        int stackIn_5_0 = 0;
        int stackIn_26_0 = 0;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_25_0 = 0;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        var7 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            if (((ek) this).field_B == null) {
              stackOut_4_0 = 0;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0 != 0;
            } else {
              var4_int = 0;
              L1: while (true) {
                if (((ek) this).field_B.length <= var4_int) {
                  stackOut_25_0 = 0;
                  stackIn_26_0 = stackOut_25_0;
                  break L0;
                } else {
                  L2: {
                    var5 = ((ek) this).field_B[var4_int];
                    var6 = var5;
                    var6 = var5;
                    if (null == var5) {
                      break L2;
                    } else {
                      if (var5.f(1)) {
                        var4_int = var4_int + 1;
                        L3: while (true) {
                          if (var4_int >= ((ek) this).field_B.length) {
                            break L2;
                          } else {
                            L4: {
                              var6 = ((ek) this).field_B[var4_int];
                              if (var6 != null) {
                                if (!var6.a((byte) 126, param0)) {
                                  break L4;
                                } else {
                                  return true;
                                }
                              } else {
                                break L4;
                              }
                            }
                            var4_int = var4_int + 1;
                            continue L3;
                          }
                        }
                      } else {
                        break L2;
                      }
                    }
                  }
                  var4_int++;
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackOut_27_0 = (RuntimeException) var4;
            stackOut_27_1 = new StringBuilder().append("ek.D(");
            stackIn_30_0 = stackOut_27_0;
            stackIn_30_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param0 == null) {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L5;
            } else {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "{...}";
              stackIn_31_0 = stackOut_28_0;
              stackIn_31_1 = stackOut_28_1;
              stackIn_31_2 = stackOut_28_2;
              break L5;
            }
          }
          throw r.a((Throwable) (Object) stackIn_31_0, stackIn_31_2 + 44 + -110 + 44 + 1 + 41);
        }
        return stackIn_26_0 != 0;
    }

    void a(int param0, int param1, vg param2, byte param3) {
        vg[] var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        vg var7 = null;
        int var8 = 0;
        vg[] var9 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        var8 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            super.a(param0, param1, param2, param3);
            if (null == ((ek) this).field_B) {
              return;
            } else {
              var9 = ((ek) this).field_B;
              var5 = var9;
              var6 = 0;
              L1: while (true) {
                if (var6 >= var9.length) {
                  break L0;
                } else {
                  L2: {
                    var7 = var9[var6];
                    if (null == var7) {
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  var6++;
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5_ref = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var5_ref;
            stackOut_10_1 = new StringBuilder().append("ek.PA(").append(param0).append(44).append(param1).append(44);
            stackIn_13_0 = stackOut_10_0;
            stackIn_13_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param2 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_14_0 = stackOut_11_0;
              stackIn_14_1 = stackOut_11_1;
              stackIn_14_2 = stackOut_11_2;
              break L3;
            }
          }
          throw r.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 44 + param3 + 41);
        }
    }

    final int e(int param0) {
        int var2 = 0;
        vg[] var3 = null;
        int var4 = 0;
        vg var5 = null;
        int var6 = 0;
        int var7 = 0;
        var7 = ShatteredPlansClient.field_F ? 1 : 0;
        var2 = 0;
        if (param0 == -600269855) {
          var3 = ((ek) this).field_B;
          var4 = 0;
          L0: while (true) {
            if (var4 >= var3.length) {
              return var2;
            } else {
              var5 = var3[var4];
              if (var5 != null) {
                var6 = var5.e(param0);
                if (var6 > var2) {
                  var2 = var6;
                  var4++;
                  continue L0;
                } else {
                  var4++;
                  continue L0;
                }
              } else {
                var4++;
                continue L0;
              }
            }
          }
        } else {
          return -89;
        }
    }

    private final boolean a(int param0, vg param1) {
        RuntimeException var3 = null;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_3_0 = false;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            stackOut_3_0 = this.a(1, 22, param1);
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3;
            stackOut_5_1 = new StringBuilder().append("ek.J(").append(111).append(44);
            stackIn_8_0 = stackOut_5_0;
            stackIn_8_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_9_0 = stackOut_6_0;
              stackIn_9_1 = stackOut_6_1;
              stackIn_9_2 = stackOut_6_2;
              break L1;
            }
          }
          throw r.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 41);
        }
        return stackIn_4_0;
    }

    final StringBuilder a(byte param0, Hashtable param1, int param2, StringBuilder param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        StringBuilder stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        StringBuilder stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            L1: {
              if (!((ek) this).a(false, param2, param3, param1)) {
                break L1;
              } else {
                ((ek) this).a(param1, param2, false, param3);
                int discarded$2 = 0;
                this.a(param2, param3, param1);
                break L1;
              }
            }
            var5_int = -103 % ((64 - param0) / 61);
            stackOut_2_0 = (StringBuilder) param3;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var5;
            stackOut_4_1 = new StringBuilder().append("ek.NA(").append(param0).append(44);
            stackIn_7_0 = stackOut_4_0;
            stackIn_7_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_8_0 = stackOut_5_0;
              stackIn_8_1 = stackOut_5_1;
              stackIn_8_2 = stackOut_5_2;
              break L2;
            }
          }
          L3: {
            stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(44).append(param2).append(44);
            stackIn_11_0 = stackOut_8_0;
            stackIn_11_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param3 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_12_0 = stackOut_9_0;
              stackIn_12_1 = stackOut_9_1;
              stackIn_12_2 = stackOut_9_2;
              break L3;
            }
          }
          throw r.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 41);
        }
        return stackIn_3_0;
    }

    final String c(boolean param0) {
        vg[] var2 = null;
        int var3 = 0;
        vg var4 = null;
        String var5 = null;
        int var6 = 0;
        Object var7 = null;
        var6 = ShatteredPlansClient.field_F ? 1 : 0;
        if (null != ((ek) this).field_B) {
          var2 = ((ek) this).field_B;
          var3 = 0;
          L0: while (true) {
            if (var3 >= var2.length) {
              if (!param0) {
                var7 = null;
                boolean discarded$1 = ((ek) this).a(115, -37, -38, (vg) null, 68, 55, -109);
                return null;
              } else {
                return null;
              }
            } else {
              var4 = var2[var3];
              if (var4 != null) {
                var5 = var4.c(true);
                if (var5 != null) {
                  return var5;
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
          return null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_y = "<%0> has resigned.";
        field_H = "Year of Great Beginnings";
        field_G = "Unrated game";
    }
}
