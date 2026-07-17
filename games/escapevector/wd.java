/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wd extends jl {
    private String[] field_t;
    private int field_s;
    static int[] field_u;
    private tc[] field_r;
    static String field_q;

    private final void a(byte param0, String[] param1, int param2, int param3, int param4) {
        String[] var6 = null;
        RuntimeException var6_ref = null;
        int var7 = 0;
        String var8 = null;
        int var9 = 0;
        String[] var10 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        var9 = EscapeVector.field_A;
        try {
          L0: {
            if (((wd) this).field_h != null) {
              if (param1 == null) {
                return;
              } else {
                if (param1.length == 0) {
                  return;
                } else {
                  if (param0 == -95) {
                    var10 = param1;
                    var6 = var10;
                    var7 = 0;
                    L1: while (true) {
                      if (var7 >= var10.length) {
                        break L0;
                      } else {
                        L2: {
                          var8 = var10[var7];
                          if (var8 == null) {
                            break L2;
                          } else {
                            if (0 < var8.length()) {
                              ((wd) this).field_h.a(var8, ((wd) this).field_d, param2, param3, -1);
                              break L2;
                            } else {
                              break L2;
                            }
                          }
                        }
                        param2 = param2 + ((wd) this).field_f;
                        var7++;
                        continue L1;
                      }
                    }
                  } else {
                    return;
                  }
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6_ref = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) var6_ref;
            stackOut_21_1 = new StringBuilder().append("wd.B(").append(param0).append(44);
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param1 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L3;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L3;
            }
          }
          throw t.a((Throwable) (Object) stackIn_24_0, stackIn_24_2 + 44 + param2 + 44 + param3 + 44 + -1 + 41);
        }
    }

    private final void c(int param0) {
        int var2 = 640;
        int var3 = this.a(((wd) this).field_r, 0);
        int var4 = ((wd) this).a(((wd) this).field_t, 0);
        int var5 = -45;
        ((wd) this).field_o = var4 + var3;
        ((wd) this).field_d = var3 + (var2 + -((wd) this).field_o) / 2;
    }

    final void a(int param0, int param1) {
        if (null == ((wd) this).field_h) {
            return;
        }
        int var3 = ((wd) this).field_h.field_r;
        if (param1 != 3) {
            return;
        }
        param0 = param0 + var3;
        param0 = param0 + ((wd) this).b(param0, param1 ^ 13944);
        this.a(param0, ((wd) this).field_r, (byte) -121);
        this.a((byte) -95, ((wd) this).field_t, param0, ((wd) this).field_s, -1);
    }

    private final void a(int param0, tc[] param1, byte param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        tc[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        tc var8 = null;
        int var9 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        var9 = EscapeVector.field_A;
        try {
          L0: {
            if (((wd) this).field_h == null) {
              return;
            } else {
              if (param1 == null) {
                return;
              } else {
                if (0 == param1.length) {
                  return;
                } else {
                  var4_int = ((wd) this).field_h.field_r;
                  param0 = param0 - var4_int;
                  var5 = param1;
                  var6 = -101;
                  var7 = 0;
                  L1: while (true) {
                    if (var5.length <= var7) {
                      break L0;
                    } else {
                      L2: {
                        var8 = var5[var7];
                        if (var8 == null) {
                          break L2;
                        } else {
                          var8.a(103, ((wd) this).field_d - var8.d(11384), param0);
                          break L2;
                        }
                      }
                      param0 = param0 + ((wd) this).field_f;
                      var7++;
                      continue L1;
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var4;
            stackOut_16_1 = new StringBuilder().append("wd.E(").append(param0).append(44);
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param1 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L3;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L3;
            }
          }
          throw t.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + 44 + -121 + 41);
        }
    }

    final void a(int param0, ih param1, int param2, int param3) {
        try {
            super.a(0, param1, param2, -80);
            ((wd) this).field_s = param0;
            int var5_int = 77 % ((param3 - 47) / 60);
            this.c(126);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) (Object) runtimeException, "wd.D(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 44 + param3 + 41);
        }
    }

    private final int a(tc[] param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        tc var5 = null;
        int var6 = 0;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        var6 = EscapeVector.field_A;
        try {
          L0: {
            if (param0 != null) {
              if (param0.length == 0) {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0;
              } else {
                var3_int = 0;
                var4 = 0;
                L1: while (true) {
                  if (var4 >= param0.length) {
                    stackOut_13_0 = var3_int;
                    stackIn_14_0 = stackOut_13_0;
                    break L0;
                  } else {
                    L2: {
                      var5 = param0[var4];
                      if (var5 == null) {
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                    var4++;
                    continue L1;
                  }
                }
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var3;
            stackOut_15_1 = new StringBuilder().append("wd.A(");
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param0 == null) {
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
          throw t.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + 44 + 0 + 41);
        }
        return stackIn_14_0;
    }

    public static void d(int param0) {
        field_u = null;
        field_q = null;
        if (param0 < 85) {
            wd.d(-128);
        }
    }

    wd(String param0, tc[] param1, String[] param2) {
        super(param0, param2);
        try {
            ((wd) this).field_t = param2;
            ((wd) this).field_r = param1;
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) (Object) runtimeException, "wd.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + (param2 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_u = new int[256];
        field_q = "Targets";
    }
}
