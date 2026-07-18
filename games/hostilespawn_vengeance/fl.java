/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fl {
    static String field_b;
    private vl field_c;
    private am field_a;
    static String field_d;

    final am a(am param0, boolean param1) {
        am var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_2_0 = null;
        Object stackIn_9_0 = null;
        am stackIn_11_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_8_0 = null;
        am stackOut_10_0 = null;
        Object stackOut_1_0 = null;
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
            if (!param1) {
              L1: {
                if (param0 == null) {
                  var3 = ((fl) this).field_c.field_b.field_g;
                  break L1;
                } else {
                  var3 = param0;
                  break L1;
                }
              }
              if (((fl) this).field_c.field_b == var3) {
                ((fl) this).field_a = null;
                stackOut_8_0 = null;
                stackIn_9_0 = stackOut_8_0;
                return (am) (Object) stackIn_9_0;
              } else {
                ((fl) this).field_a = var3.field_g;
                stackOut_10_0 = (am) var3;
                stackIn_11_0 = stackOut_10_0;
                break L0;
              }
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (am) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var3_ref;
            stackOut_12_1 = new StringBuilder().append("fl.A(");
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
          throw wg.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ',' + param1 + ')');
        }
        return stackIn_11_0;
    }

    public static void a(byte param0) {
        if (param0 >= -25) {
            return;
        }
        field_b = null;
        field_d = null;
    }

    final static int d(int param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int stackIn_4_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_10_0 = 0;
        var2 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            if (sg.field_i < 50) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            } else {
              L1: {
                if (param0 < -60) {
                  break L1;
                } else {
                  fl.a((byte) 15);
                  break L1;
                }
              }
              var1_int = 1;
              L2: while (true) {
                if (pm.field_g.length <= var1_int) {
                  stackOut_13_0 = pm.field_g.length + -1;
                  stackIn_14_0 = stackOut_13_0;
                  break L0;
                } else {
                  if (pm.field_g[var1_int] <= vj.field_s) {
                    var1_int++;
                    continue L2;
                  } else {
                    stackOut_10_0 = -1 + var1_int;
                    stackIn_11_0 = stackOut_10_0;
                    return stackIn_11_0;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw wg.a((Throwable) (Object) var1, "fl.H(" + param0 + ')');
        }
        return stackIn_14_0;
    }

    final am a(boolean param0) {
        am var2 = null;
        var2 = ((fl) this).field_a;
        if (((fl) this).field_c.field_b != var2) {
          if (param0) {
            field_b = null;
            ((fl) this).field_a = var2.field_f;
            return var2;
          } else {
            ((fl) this).field_a = var2.field_f;
            return var2;
          }
        } else {
          ((fl) this).field_a = null;
          return null;
        }
    }

    final am a(int param0) {
        if (param0 != 0) {
            return null;
        }
        am var2 = ((fl) this).field_c.field_b.field_f;
        if (!(var2 != ((fl) this).field_c.field_b)) {
            ((fl) this).field_a = null;
            return null;
        }
        ((fl) this).field_a = var2.field_f;
        return var2;
    }

    final am a(int param0, am param1) {
        am var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_7_0 = null;
        am stackIn_9_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        am stackOut_8_0 = null;
        Object stackOut_6_0 = null;
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
            L1: {
              if (param0 == -1) {
                break L1;
              } else {
                ((fl) this).field_a = null;
                break L1;
              }
            }
            L2: {
              if (param1 == null) {
                var3 = ((fl) this).field_c.field_b.field_f;
                break L2;
              } else {
                var3 = param1;
                break L2;
              }
            }
            if (((fl) this).field_c.field_b != var3) {
              ((fl) this).field_a = var3.field_f;
              stackOut_8_0 = (am) var3;
              stackIn_9_0 = stackOut_8_0;
              break L0;
            } else {
              ((fl) this).field_a = null;
              stackOut_6_0 = null;
              stackIn_7_0 = stackOut_6_0;
              return (am) (Object) stackIn_7_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var3_ref;
            stackOut_10_1 = new StringBuilder().append("fl.B(").append(param0).append(',');
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
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ')');
        }
        return stackIn_9_0;
    }

    final am c(int param0) {
        am var2 = null;
        var2 = ((fl) this).field_a;
        if (var2 != ((fl) this).field_c.field_b) {
          if (param0 != 0) {
            field_d = null;
            ((fl) this).field_a = var2.field_g;
            return var2;
          } else {
            ((fl) this).field_a = var2.field_g;
            return var2;
          }
        } else {
          ((fl) this).field_a = null;
          return null;
        }
    }

    fl(vl param0) {
        try {
            ((fl) this).field_c = param0;
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) (Object) runtimeException, "fl.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final am b(int param0) {
        am var2 = null;
        var2 = ((fl) this).field_c.field_b.field_g;
        if (((fl) this).field_c.field_b == var2) {
          ((fl) this).field_a = null;
          return null;
        } else {
          if (param0 != 1) {
            return null;
          } else {
            ((fl) this).field_a = var2.field_g;
            return var2;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Error connecting to server. Please try using a different server.";
    }
}
