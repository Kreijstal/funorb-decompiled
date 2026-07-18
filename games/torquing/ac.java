/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ac extends nk {
    byte field_y;
    int field_x;
    fj field_z;
    static String field_A;

    public static void c(int param0) {
        field_A = null;
        if (param0 != 0) {
            field_A = null;
        }
    }

    final static String a(int param0, CharSequence[] param1) {
        RuntimeException var2 = null;
        String stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_0_0 = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            stackOut_0_0 = wi.a(0, 0, param1.length, param1);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var2;
            stackOut_2_1 = new StringBuilder().append("ac.E(").append(-115).append(',');
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw rb.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + ')');
        }
        return stackIn_1_0;
    }

    final static int d() {
        return jl.field_S;
    }

    final byte[] c(byte param0) {
        if (param0 > 102) {
          if (!((ac) this).field_r) {
            if (((ac) this).field_z.field_j.length + -((ac) this).field_y > ((ac) this).field_z.field_n) {
              throw new RuntimeException();
            } else {
              return ((ac) this).field_z.field_j;
            }
          } else {
            throw new RuntimeException();
          }
        } else {
          ((ac) this).field_z = null;
          if (!((ac) this).field_r) {
            if (((ac) this).field_z.field_j.length + -((ac) this).field_y > ((ac) this).field_z.field_n) {
              throw new RuntimeException();
            } else {
              return ((ac) this).field_z.field_j;
            }
          } else {
            throw new RuntimeException();
          }
        }
    }

    final static ae a(String param0) {
        Object var2 = null;
        ae var3 = null;
        String var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        ae stackIn_14_0 = null;
        Object stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        Object stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        Object stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        ae stackOut_13_0 = null;
        Object stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        Object stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        Object stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        var5 = Torquing.field_u;
        try {
          if (null != ed.field_c) {
            L0: {
              var6 = (CharSequence) (Object) param0;
              var2 = (Object) (Object) hf.a(var6, 102);
              if (var2 != null) {
                break L0;
              } else {
                var2 = (Object) (Object) var6;
                break L0;
              }
            }
            var3 = (ae) (Object) ed.field_c.a((long)((String) var2).hashCode(), -56);
            L1: while (true) {
              if (var3 != null) {
                L2: {
                  var7 = (CharSequence) (Object) var3.field_ob;
                  var4 = hf.a(var7, 118);
                  if (var4 == null) {
                    var4 = var3.field_ob;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                if (!var4.equals(var2)) {
                  var3 = (ae) (Object) ed.field_c.b(-1);
                  continue L1;
                } else {
                  stackOut_13_0 = (ae) var3;
                  stackIn_14_0 = stackOut_13_0;
                  return stackIn_14_0;
                }
              } else {
                return null;
              }
            }
          } else {
            return null;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = (Object) (Object) decompiledCaughtException;
            stackOut_17_0 = var2;
            stackOut_17_1 = new StringBuilder().append("ac.H(");
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param0 == null) {
              stackOut_19_0 = stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L3;
            } else {
              stackOut_18_0 = stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L3;
            }
          }
          throw rb.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + ',' + 0 + ')');
        }
    }

    final int b(int param0) {
        if (param0 < 91) {
            ((ac) this).field_x = -38;
            if (!(((ac) this).field_z != null)) {
                return 0;
            }
            return 100 * ((ac) this).field_z.field_n / (((ac) this).field_z.field_j.length - ((ac) this).field_y);
        }
        if (!(((ac) this).field_z != null)) {
            return 0;
        }
        return 100 * ((ac) this).field_z.field_n / (((ac) this).field_z.field_j.length - ((ac) this).field_y);
    }

    ac() {
    }

    final static boolean a(fj param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        Object var4 = null;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_5_0 = 0;
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
              var2_int = param0.i((byte) -101);
              if (var2_int == 1) {
                stackOut_2_0 = 1;
                stackIn_3_0 = stackOut_2_0;
                break L1;
              } else {
                stackOut_1_0 = 0;
                stackIn_3_0 = stackOut_1_0;
                break L1;
              }
            }
            L2: {
              var3 = stackIn_3_0;
              if (param1 == 28066) {
                break L2;
              } else {
                var4 = null;
                boolean discarded$2 = ac.a((fj) null, -59);
                break L2;
              }
            }
            stackOut_5_0 = var3;
            stackIn_6_0 = stackOut_5_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var2;
            stackOut_7_1 = new StringBuilder().append("ac.G(");
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
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw rb.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ',' + param1 + ')');
        }
        return stackIn_6_0 != 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_A = "Loading music";
    }
}
