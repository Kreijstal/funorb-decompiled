/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class uk {
    static int[] field_c;
    static ji field_d;
    static bl field_a;
    static int field_e;
    static String field_b;

    abstract int b(int param0, int param1);

    abstract wc c(int param0);

    abstract byte[] a(byte param0, int param1);

    final static boolean a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        if (param5 >= param0) {
          if (param0 + param2 > param5) {
            if (param1 >= param3) {
              if (param1 >= param3 - -param6) {
                return false;
              } else {
                return true;
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        } else {
          return false;
        }
    }

    public static void b(int param0) {
        if (param0 >= -12) {
          field_c = null;
          field_b = null;
          field_a = null;
          field_c = null;
          field_d = null;
          return;
        } else {
          field_b = null;
          field_a = null;
          field_c = null;
          field_d = null;
          return;
        }
    }

    final static boolean a(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != 27301) {
          L0: {
            field_a = null;
            if (tk.field_e <= 250) {
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
            if (tk.field_e <= 250) {
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

    final static bd[] a(int param0, int param1, byte param2, int param3, int param4) {
        if (param2 < 126) {
          boolean discarded$2 = uk.a(-106);
          return od.a(3, 105, 1, param0, 1, 0, param3, 1, param1);
        } else {
          return od.a(3, 105, 1, param0, 1, 0, param3, 1, param1);
        }
    }

    final static boolean a(int[] param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int stackIn_6_0 = 0;
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
        int stackOut_5_0 = 0;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        var3 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            var2_int = 0;
            L1: while (true) {
              if (8 <= var2_int) {
                stackOut_8_0 = 0;
                stackIn_9_0 = stackOut_8_0;
                break L0;
              } else {
                if (param0[var2_int] != 0) {
                  stackOut_5_0 = 1;
                  stackIn_6_0 = stackOut_5_0;
                  return stackIn_6_0 != 0;
                } else {
                  var2_int++;
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var2;
            stackOut_10_1 = new StringBuilder().append("uk.A(");
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
          throw wg.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ',' + 0 + ')');
        }
        return stackIn_9_0 != 0;
    }

    final static String a(int param0, int param1) {
        if (param1 != 9) {
          if (param0 == 9394) {
            if (param1 == 10) {
              return "levelf2.dat";
            } else {
              if (11 == param1) {
                return "levelf3.dat";
              } else {
                if (param1 == 1) {
                  return "level01.dat";
                } else {
                  if (param1 == 2) {
                    return "level02.dat";
                  } else {
                    if (param1 != 3) {
                      if (param1 == 4) {
                        return "level04.dat";
                      } else {
                        if (param1 == 5) {
                          return "level05.dat";
                        } else {
                          if (6 == param1) {
                            return "level06.dat";
                          } else {
                            if (param1 == 7) {
                              return "level07.dat";
                            } else {
                              return "level00.dat";
                            }
                          }
                        }
                      }
                    } else {
                      return "level03.dat";
                    }
                  }
                }
              }
            }
          } else {
            bd[] discarded$1 = uk.a(43, -82, (byte) -21, -101, 0);
            if (param1 == 10) {
              return "levelf2.dat";
            } else {
              if (11 == param1) {
                return "levelf3.dat";
              } else {
                if (param1 == 1) {
                  return "level01.dat";
                } else {
                  if (param1 == 2) {
                    return "level02.dat";
                  } else {
                    if (param1 != 3) {
                      if (param1 == 4) {
                        return "level04.dat";
                      } else {
                        if (param1 == 5) {
                          return "level05.dat";
                        } else {
                          if (6 == param1) {
                            return "level06.dat";
                          } else {
                            if (param1 == 7) {
                              return "level07.dat";
                            } else {
                              return "level00.dat";
                            }
                          }
                        }
                      }
                    } else {
                      return "level03.dat";
                    }
                  }
                }
              }
            }
          }
        } else {
          return "levelf1.dat";
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = nf.a(false);
        field_a = new bl(3);
        field_e = 0;
        field_b = "Use this alternative as your account name";
    }
}
