/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class oga extends rqa {
    static int field_o;

    oga(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        nc stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        nc stackOut_3_0 = null;
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
            L1: {
              if (param1 <= -119) {
                break L1;
              } else {
                nc discarded$2 = ((oga) this).a((nc[]) null, 8);
                break L1;
              }
            }
            stackOut_3_0 = new nc((Object) (Object) frb.a(32, 118));
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3;
            stackOut_5_1 = new StringBuilder().append("oga.A(");
            stackIn_8_0 = stackOut_5_0;
            stackIn_8_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_9_0 = stackOut_6_0;
              stackIn_9_1 = stackOut_6_1;
              stackIn_9_2 = stackOut_6_2;
              break L2;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ',' + param1 + ')');
        }
        return stackIn_4_0;
    }

    final static boolean a(int param0, int param1, int param2, int param3, int param4, int param5, boolean param6) {
        RuntimeException var7 = null;
        boolean stackIn_13_0 = false;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_12_0 = false;
        try {
          L0: {
            L1: {
              if (param0 > 27) {
                break L1;
              } else {
                boolean discarded$2 = oga.a(23, 89, -52, 81, -123, -26, false);
                break L1;
              }
            }
            L2: {
              if (wq.e((byte) 105)) {
                L3: {
                  gaa.a(param2, 11343, param4, param6);
                  if (null == cka.field_o) {
                    break L3;
                  } else {
                    if (!cka.field_o.a(param6, -11, param1, param4, param3)) {
                      break L3;
                    } else {
                      lnb.d(0);
                      param6 = false;
                      break L3;
                    }
                  }
                }
                jra.a(param4, param6, 19717);
                oj.a((byte) -127, param6, param5);
                param6 = false;
                break L2;
              } else {
                break L2;
              }
            }
            stackOut_12_0 = param6;
            stackIn_13_0 = stackOut_12_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw rta.a((Throwable) (Object) var7, "oga.B(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        return stackIn_13_0;
    }

    final static boolean a(char param0, byte param1) {
        RuntimeException var2 = null;
        int stackIn_7_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_32_0 = 0;
        int stackIn_35_0 = 0;
        int stackIn_37_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_36_0 = 0;
        int stackOut_34_0 = 0;
        int stackOut_31_0 = 0;
        try {
          L0: {
            L1: {
              if (param0 < 32) {
                break L1;
              } else {
                if (param0 <= 126) {
                  stackOut_6_0 = 1;
                  stackIn_7_0 = stackOut_6_0;
                  return stackIn_7_0 != 0;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              if (160 > param0) {
                break L2;
              } else {
                if (param0 <= 255) {
                  stackOut_14_0 = 1;
                  stackIn_15_0 = stackOut_14_0;
                  return stackIn_15_0 != 0;
                } else {
                  break L2;
                }
              }
            }
            L3: {
              if (param0 == 8364) {
                break L3;
              } else {
                if (param0 == 338) {
                  break L3;
                } else {
                  if (8212 == param0) {
                    break L3;
                  } else {
                    if (param0 == 339) {
                      break L3;
                    } else {
                      if (param0 == 376) {
                        break L3;
                      } else {
                        if (param1 == 32) {
                          stackOut_36_0 = 0;
                          stackIn_37_0 = stackOut_36_0;
                          break L0;
                        } else {
                          stackOut_34_0 = 0;
                          stackIn_35_0 = stackOut_34_0;
                          return stackIn_35_0 != 0;
                        }
                      }
                    }
                  }
                }
              }
            }
            stackOut_31_0 = 1;
            stackIn_32_0 = stackOut_31_0;
            return stackIn_32_0 != 0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw rta.a((Throwable) (Object) var2, "oga.C(" + param0 + ',' + param1 + ')');
        }
        return stackIn_37_0 != 0;
    }

    final static void a(int param0) {
        try {
            IOException var1 = null;
            RuntimeException var1_ref = null;
            int var1_int = 0;
            IOException var2 = null;
            int var3 = 0;
            Throwable decompiledCaughtException = null;
            var3 = VoidHunters.field_G;
            try {
              L0: {
                L1: {
                  if (param0 == 16928) {
                    break L1;
                  } else {
                    field_o = -75;
                    break L1;
                  }
                }
                L2: {
                  if (ff.field_o == null) {
                    break L2;
                  } else {
                    ff.field_o.a(116);
                    break L2;
                  }
                }
                L3: {
                  if (nj.field_a == null) {
                    break L3;
                  } else {
                    nj.field_a.a(23474);
                    break L3;
                  }
                }
                L4: {
                  if (cba.field_e != null) {
                    {
                      L5: {
                        cba.field_e.a(true);
                        break L5;
                      }
                    }
                    break L4;
                  } else {
                    break L4;
                  }
                }
                L7: {
                  L8: {
                    if (null != btb.field_d) {
                      var1_int = 0;
                      L9: while (true) {
                        if (var1_int >= btb.field_d.length) {
                          break L8;
                        } else {
                          if (var3 != 0) {
                            break L7;
                          } else {
                            L10: {
                              if (null == btb.field_d[var1_int]) {
                                break L10;
                              } else {
                                {
                                  L11: {
                                    btb.field_d[var1_int].a(true);
                                    break L11;
                                  }
                                }
                                break L10;
                              }
                            }
                            var1_int++;
                            if (var3 == 0) {
                              continue L9;
                            } else {
                              break L8;
                            }
                          }
                        }
                      }
                    } else {
                      break L8;
                    }
                  }
                  break L7;
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              var1_ref = (RuntimeException) (Object) decompiledCaughtException;
              throw rta.a((Throwable) (Object) var1_ref, "oga.D(" + param0 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = 0;
    }
}
