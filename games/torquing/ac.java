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
            L1: {
              if (param0 < -103) {
                break L1;
              } else {
                field_A = null;
                break L1;
              }
            }
            stackOut_2_0 = wi.a(0, 0, param1.length, param1);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var2;
            stackOut_4_1 = new StringBuilder().append("ac.E(").append(param0).append(44);
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
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw rb.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 41);
        }
        return stackIn_3_0;
    }

    final static int d(byte param0) {
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

    final static ae a(String param0, int param1) {
        Object var2 = null;
        ae var3 = null;
        String var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        ae stackIn_16_0 = null;
        Object stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        Object stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        Object stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        ae stackOut_15_0 = null;
        Object stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        Object stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        Object stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
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
            L1: {
              if (param1 == 0) {
                break L1;
              } else {
                field_A = null;
                break L1;
              }
            }
            var3 = (ae) (Object) ed.field_c.a((long)((String) var2).hashCode(), param1 + -56);
            L2: while (true) {
              if (var3 != null) {
                L3: {
                  var7 = (CharSequence) (Object) var3.field_ob;
                  var4 = hf.a(var7, param1 ^ 118);
                  if (var4 == null) {
                    var4 = var3.field_ob;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                if (!var4.equals(var2)) {
                  var3 = (ae) (Object) ed.field_c.b(-1);
                  continue L2;
                } else {
                  stackOut_15_0 = (ae) var3;
                  stackIn_16_0 = stackOut_15_0;
                  return stackIn_16_0;
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
          L4: {
            var2 = (Object) (Object) decompiledCaughtException;
            stackOut_19_0 = var2;
            stackOut_19_1 = new StringBuilder().append("ac.H(");
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param0 == null) {
              stackOut_21_0 = stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L4;
            } else {
              stackOut_20_0 = stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L4;
            }
          }
          throw rb.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + 44 + param1 + 41);
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
          throw rb.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 44 + param1 + 41);
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
