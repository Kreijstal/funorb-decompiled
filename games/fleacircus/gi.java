/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

abstract class gi {
    static byte[] field_c;
    static uc field_b;
    static String[] field_a;
    static sf field_d;

    final static boolean a(int param0, char param1) {
        if (!Character.isISOControl(param1)) {
          if (ii.a(1, param1)) {
            return true;
          } else {
            L0: {
              if (param1 == 45) {
                break L0;
              } else {
                if (160 == param1) {
                  break L0;
                } else {
                  if (32 == param1) {
                    break L0;
                  } else {
                    if (95 != param1) {
                      return false;
                    } else {
                      return true;
                    }
                  }
                }
              }
            }
            return true;
          }
        } else {
          return false;
        }
    }

    final static boolean a(int param0, boolean param1) {
        try {
            if (ae.field_a.field_i >= param0) {
                return true;
            }
            if (!(null != sg.field_h)) {
                return false;
            }
            int var2_int = sg.field_h.e(-114);
            if (var2_int > 0) {
                if (!(var2_int <= param0 + -ae.field_a.field_i)) {
                    var2_int = param0 - ae.field_a.field_i;
                }
                sg.field_h.a(var2_int, ae.field_a.field_k, ae.field_a.field_i, false);
                ug.field_d = lj.a((byte) -128);
                ae.field_a.field_i = ae.field_a.field_i + var2_int;
                if (ae.field_a.field_i < param0) {
                    return false;
                }
                ae.field_a.field_i = 0;
                return true;
            }
            {
                if (var2_int >= 0) {
                    if (h.b(115) <= 30000L) {
                        return false;
                    }
                }
                k.c(-28354);
            }
            return false;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    abstract int a(int param0, byte param1);

    final static void a(boolean param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int stackIn_24_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_23_0 = 0;
        int stackOut_22_0 = 0;
        var14 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            if (param5 <= param1) {
              return;
            } else {
              if (param1 - -1 < param2) {
                L1: {
                  if (param2 <= 5 + param1) {
                    break L1;
                  } else {
                    if (param6 == param4) {
                      break L1;
                    } else {
                      var7_int = (1 & (param6 & param4)) + ((param6 >> 1) + (param4 >> 1));
                      var8 = param1;
                      var9 = param4;
                      var10 = param6;
                      var11 = param1;
                      L2: while (true) {
                        if (param2 <= var11) {
                          gi.a(param0, param1, var8, param3, param4, param5, var9);
                          gi.a(param0, var8, param2, -3300, var10, param5, param6);
                          break L0;
                        } else {
                          L3: {
                            var12 = mh.field_y[var11];
                            if (!param0) {
                              stackOut_23_0 = uj.field_a[var12];
                              stackIn_24_0 = stackOut_23_0;
                              break L3;
                            } else {
                              stackOut_22_0 = jl.field_b[var12];
                              stackIn_24_0 = stackOut_22_0;
                              break L3;
                            }
                          }
                          var13 = stackIn_24_0;
                          if (var7_int >= var13) {
                            L4: {
                              if (var10 >= var13) {
                                break L4;
                              } else {
                                break L4;
                              }
                            }
                            var11++;
                            continue L2;
                          } else {
                            L5: {
                              mh.field_y[var11] = mh.field_y[var8];
                              int incrementValue$1 = var8;
                              var8++;
                              mh.field_y[incrementValue$1] = var12;
                              if (var9 <= var13) {
                                break L5;
                              } else {
                                break L5;
                              }
                            }
                            var11++;
                            continue L2;
                          }
                        }
                      }
                    }
                  }
                }
                var7_int = param2 - 1;
                L6: while (true) {
                  if (param1 >= var7_int) {
                    return;
                  } else {
                    var8 = param1;
                    L7: while (true) {
                      if (var8 >= var7_int) {
                        var7_int--;
                        continue L6;
                      } else {
                        L8: {
                          var9 = mh.field_y[var8];
                          var10 = mh.field_y[1 + var8];
                          if (ob.a(param0, var9, true, var10)) {
                            mh.field_y[var8] = var10;
                            mh.field_y[1 + var8] = var9;
                            break L8;
                          } else {
                            break L8;
                          }
                        }
                        var8++;
                        continue L7;
                      }
                    }
                  }
                }
              } else {
                return;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw pf.a((Throwable) (Object) var7, "gi.O(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    final static boolean a(CharSequence param0) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_19_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_34_0 = 0;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_38_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_33_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_29_0 = 0;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        String stackOut_37_2 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        String stackOut_36_2 = null;
        var11 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            var4_int = 0;
            var5 = 0;
            var6 = 0;
            var7 = param0.length();
            var8 = 0;
            L1: while (true) {
              if (var8 >= var7) {
                stackOut_33_0 = var5;
                stackIn_34_0 = stackOut_33_0;
                break L0;
              } else {
                L2: {
                  L3: {
                    var9 = param0.charAt(var8);
                    if (var8 == 0) {
                      if (var9 != 45) {
                        if (var9 != 43) {
                          break L3;
                        } else {
                          break L2;
                        }
                      } else {
                        var4_int = 1;
                        break L2;
                      }
                    } else {
                      break L3;
                    }
                  }
                  L4: {
                    L5: {
                      if (var9 < 48) {
                        break L5;
                      } else {
                        if (var9 <= 57) {
                          var9 -= 48;
                          break L4;
                        } else {
                          break L5;
                        }
                      }
                    }
                    L6: {
                      if (var9 < 65) {
                        break L6;
                      } else {
                        if (var9 > 90) {
                          break L6;
                        } else {
                          var9 -= 55;
                          break L4;
                        }
                      }
                    }
                    if (var9 < 97) {
                      stackOut_18_0 = 0;
                      stackIn_19_0 = stackOut_18_0;
                      return stackIn_19_0 != 0;
                    } else {
                      if (var9 <= 122) {
                        var9 -= 87;
                        break L4;
                      } else {
                        return false;
                      }
                    }
                  }
                  if (var9 >= 10) {
                    stackOut_24_0 = 0;
                    stackIn_25_0 = stackOut_24_0;
                    return stackIn_25_0 != 0;
                  } else {
                    L7: {
                      if (var4_int == 0) {
                        break L7;
                      } else {
                        var9 = -var9;
                        break L7;
                      }
                    }
                    var10 = 10 * var6 - -var9;
                    if (var10 / 10 == var6) {
                      var5 = 1;
                      var6 = var10;
                      break L2;
                    } else {
                      stackOut_29_0 = 0;
                      stackIn_30_0 = stackOut_29_0;
                      return stackIn_30_0 != 0;
                    }
                  }
                }
                var8++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var4 = decompiledCaughtException;
            stackOut_35_0 = (RuntimeException) var4;
            stackOut_35_1 = new StringBuilder().append("gi.L(");
            stackIn_37_0 = stackOut_35_0;
            stackIn_37_1 = stackOut_35_1;
            stackIn_36_0 = stackOut_35_0;
            stackIn_36_1 = stackOut_35_1;
            if (param0 == null) {
              stackOut_37_0 = (RuntimeException) (Object) stackIn_37_0;
              stackOut_37_1 = (StringBuilder) (Object) stackIn_37_1;
              stackOut_37_2 = "null";
              stackIn_38_0 = stackOut_37_0;
              stackIn_38_1 = stackOut_37_1;
              stackIn_38_2 = stackOut_37_2;
              break L8;
            } else {
              stackOut_36_0 = (RuntimeException) (Object) stackIn_36_0;
              stackOut_36_1 = (StringBuilder) (Object) stackIn_36_1;
              stackOut_36_2 = "{...}";
              stackIn_38_0 = stackOut_36_0;
              stackIn_38_1 = stackOut_36_1;
              stackIn_38_2 = stackOut_36_2;
              break L8;
            }
          }
          throw pf.a((Throwable) (Object) stackIn_38_0, stackIn_38_2 + ',' + true + ',' + 0 + ',' + 10 + ')');
        }
        return stackIn_34_0 != 0;
    }

    abstract byte[] b(int param0, boolean param1);

    abstract rf a(int param0);

    public static void a() {
        field_a = null;
        field_c = null;
        field_d = null;
        field_b = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new String[]{null, "to discard it and<nbsp>continue.", "to discard it and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue."};
    }
}
