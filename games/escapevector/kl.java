/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kl extends ah {
    static int field_n;
    static String field_o;
    static String field_p;

    public static void g(int param0) {
        if (param0 != -17) {
            field_o = (String) null;
            field_p = null;
            field_o = null;
            return;
        }
        field_p = null;
        field_o = null;
    }

    kl(ul param0) {
        super(param0);
    }

    final static boolean a(String param0, int param1) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 == 0) {
              L1: {
                if (fk.a(-1465, param0) == null) {
                  stackIn_6_0 = 0;
                  break L1;
                } else {
                  stackIn_6_0 = 1;
                  break L1;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var2);

            stackIn_9_1 = new StringBuilder().append("kl.F(");

            if (param0 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_6_0 != 0;
        }
    }

    final static boolean a(int param0, int param1, boolean param2) {
        if (param2) {
          if (hi.a(param1, -2)) {
            if (param0 != 2) {
              if (4 != param0) {
                if (param0 == 8) {
                  return true;
                } else {
                  if ((param0 ^ -1) != -13) {
                    if (16 != param0) {
                      if (2 == param1) {
                        if (4 == param0) {
                          return true;
                        } else {
                          if ((param0 ^ -1) != -9) {
                            if (param0 != 12) {
                              if ((param0 ^ -1) == -17) {
                                return true;
                              } else {
                                return false;
                              }
                            } else {
                              return true;
                            }
                          } else {
                            return true;
                          }
                        }
                      } else {
                        return false;
                      }
                    } else {
                      return true;
                    }
                  } else {
                    return true;
                  }
                }
              } else {
                return true;
              }
            } else {
              return true;
            }
          } else {
            if (2 == param1) {
              if (4 == param0) {
                return true;
              } else {
                if ((param0 ^ -1) != -9) {
                  if (param0 != 12) {
                    if ((param0 ^ -1) == -17) {
                      return true;
                    } else {
                      return false;
                    }
                  } else {
                    return true;
                  }
                } else {
                  return true;
                }
              }
            } else {
              return false;
            }
          }
        } else {
          return false;
        }
    }

    final String a(byte param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        String stackIn_3_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var3_int = 95 / ((param0 - 10) / 51);
            if (this.a(-1, param1) == ob.field_a) {
              stackIn_3_0 = tb.field_E;
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var3);

            stackIn_7_1 = new StringBuilder().append("kl.L(").append(param0).append(',');

            if (param1 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
        return stackIn_3_0;
    }

    final rf a(int param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        CharSequence var5 = null;
        CharSequence var6 = null;
        rf stackIn_2_0 = null;
        rf stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var5 = (CharSequence) ((Object) param1);
            if (fk.a(false, var5)) {
              L1: {
                var6 = (CharSequence) ((Object) param1);
                var3_int = gn.a(param0 ^ -16777216, var6);
                if (param0 == -1) {
                  break L1;
                } else {
                  var4 = (String) null;
                  this.a(-6, (String) null);
                  break L1;
                }
              }
              L2: {
                if (0 >= var3_int) {
                  break L2;
                } else {
                  if (130 < var3_int) {
                    break L2;
                  } else {
                    return df.field_h;
                  }
                }
              }
              stackIn_9_0 = ob.field_a;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = ob.field_a;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var3);

            stackIn_12_1 = new StringBuilder().append("kl.G(").append(param0).append(',');

            if (param1 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L3;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L3;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_9_0;
        }
    }

    static {
        field_p = "Names should contain a maximum of 12 characters";
    }
}
