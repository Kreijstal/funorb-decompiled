/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class er extends fe {
    static int field_W;
    static String field_N;
    int field_P;
    int field_Y;
    int field_V;
    int field_U;
    int field_O;
    static String field_Q;
    static int field_X;
    int field_Z;
    static int field_S;
    static String field_T;
    static int field_R;

    public static void g() {
        field_T = null;
        field_N = null;
        field_Q = null;
        int var1 = 0;
    }

    final static void a() {
        int var8 = 0;
        var8 = Pool.field_O;
        if (im.field_fc < 0) {
          return;
        } else {
          return;
        }
    }

    final static void a(im param0, int param1) {
        im var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var3 = Pool.field_O;
        try {
          L0: {
            param0.a((byte) -117);
            if (param1 < -89) {
              var2 = (im) (Object) ma.field_i.c((byte) 124);
              L1: while (true) {
                L2: {
                  if (var2 == null) {
                    break L2;
                  } else {
                    if (!var2.a(param0, (byte) -97)) {
                      break L2;
                    } else {
                      var2 = (im) (Object) ma.field_i.f((byte) -5);
                      continue L1;
                    }
                  }
                }
                L3: {
                  if (var2 == null) {
                    ma.field_i.b((byte) -11, (ma) (Object) param0);
                    break L3;
                  } else {
                    vj.a((ma) (Object) param0, (byte) -119, (ma) (Object) var2);
                    break L3;
                  }
                }
                break L0;
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2_ref = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var2_ref;
            stackOut_12_1 = new StringBuilder().append("er.F(");
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
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L4;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ',' + param1 + ')');
        }
    }

    final static void a(int param0, String param1, int param2, int param3, lr param4, boolean param5, int param6) {
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        try {
          L0: {
            L1: {
              var7_int = param4.b(param1) + 6;
              var8 = param4.field_w + param4.field_C - -6;
              var9 = param2 + -(var7_int / 2);
              if (var9 >= 0) {
                if (var9 + var7_int <= 640) {
                  break L1;
                } else {
                  param2 = param2 - (-640 + (var7_int + var9));
                  var9 = -var7_int + 640;
                  break L1;
                }
              } else {
                param2 = param2 - var9;
                var9 = 0;
                break L1;
              }
            }
            L2: {
              if (param5) {
                break L2;
              } else {
                field_X = 49;
                break L2;
              }
            }
            L3: {
              var10 = -3 + (-param4.field_C + param0);
              if (var10 < 0) {
                param0 = param0 - var10;
                var10 = 0;
                break L3;
              } else {
                if (480 < var10 - -var8) {
                  param0 = param0 - (var10 + (var8 + -480));
                  var10 = 480 + -var8;
                  break L3;
                } else {
                  break L3;
                }
              }
            }
            qh.a(var9, var10, var7_int, var8, 3, 0, 128);
            param4.b(param1, param2, param0, param6, param3);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var7 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var7;
            stackOut_13_1 = new StringBuilder().append("er.B(").append(param0).append(',');
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
              break L4;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L4;
            }
          }
          L5: {
            stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
            stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param4 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L5;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L5;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + ',' + param5 + ',' + param6 + ')');
        }
    }

    private er() throws Throwable {
        throw new Error();
    }

    final boolean a(ei param0, int param1, boolean param2, int param3, int param4, int param5, int param6) {
        RuntimeException var8 = null;
        int var8_int = 0;
        int var9 = 0;
        double var10 = 0.0;
        int var12 = 0;
        int stackIn_15_0 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_14_0 = 0;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        var12 = Pool.field_O;
        try {
          L0: {
            if (super.a(param0, param1, param2, param3, param4, param5, param6)) {
              L1: {
                var8_int = -((er) this).field_U + (-((er) this).field_C + -param1 + param6);
                var9 = -((er) this).field_P + -((er) this).field_D + -param5 + param4;
                if (((er) this).field_O * ((er) this).field_O <= var8_int * var8_int + var9 * var9) {
                  break L1;
                } else {
                  L2: {
                    var10 = Math.atan2((double)var9, (double)var8_int) - pp.field_d;
                    if (0.0 > var10) {
                      var10 = var10 - 3.141592653589793 / (double)((er) this).field_Z;
                      break L2;
                    } else {
                      if (var10 <= 0.0) {
                        break L2;
                      } else {
                        var10 = var10 + 3.141592653589793 / (double)((er) this).field_Z;
                        break L2;
                      }
                    }
                  }
                  ((er) this).field_Y = (int)((double)((er) this).field_Z * var10 / 6.283185307179586);
                  L3: while (true) {
                    if (((er) this).field_Z > ((er) this).field_Y) {
                      L4: while (true) {
                        if (((er) this).field_Y >= 0) {
                          break L1;
                        } else {
                          ((er) this).field_Y = ((er) this).field_Y + ((er) this).field_Z;
                          continue L4;
                        }
                      }
                    } else {
                      ((er) this).field_Y = ((er) this).field_Y - ((er) this).field_Z;
                      continue L3;
                    }
                  }
                }
              }
              stackOut_14_0 = 1;
              stackIn_15_0 = stackOut_14_0;
              break L0;
            } else {
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var8 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var8;
            stackOut_16_1 = new StringBuilder().append("er.AA(");
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param0 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L5;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L5;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        return stackIn_15_0 != 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_N = "Accept rematch";
        field_Q = "Error connecting to server. Please try using a different server.";
        field_T = "Mute this player for 48 hours";
    }
}
