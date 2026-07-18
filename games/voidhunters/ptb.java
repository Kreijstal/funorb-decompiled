/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ptb extends dmb implements ntb {
    private int field_h;
    static String field_f;
    private int field_d;
    private int field_e;
    private int field_g;

    public final boolean a(byte param0, tv param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        ptb var4 = null;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            L1: {
              L2: {
                var3_int = 122 / ((param0 - 22) / 59);
                var4 = (ptb) (Object) param1;
                if (super.a((byte) 113, param1)) {
                  break L2;
                } else {
                  if (((ptb) this).field_h != var4.field_h) {
                    break L2;
                  } else {
                    if (((ptb) this).field_g != var4.field_g) {
                      break L2;
                    } else {
                      if (((ptb) this).field_e != var4.field_e) {
                        break L2;
                      } else {
                        if (((ptb) this).field_d == var4.field_d) {
                          stackOut_7_0 = 0;
                          stackIn_8_0 = stackOut_7_0;
                          break L1;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                }
              }
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var3;
            stackOut_9_1 = new StringBuilder().append("ptb.C(").append(param0).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param1 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ')');
        }
        return stackIn_8_0 != 0;
    }

    final void a(pe param0, boolean param1) {
        try {
            if (!param1) {
                Object var4 = null;
                boolean discarded$0 = ((ptb) this).a((byte) -16, (tv) null);
            }
            boolean discarded$1 = param0.a(((ptb) this).field_h - -(((ptb) this).field_e / 2), ((ptb) this).field_g - -(((ptb) this).field_d / 2), ((ptb) this).field_g, false, -124, ((ptb) this).field_h);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "ptb.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static int a(byte param0, boolean param1, String param2) {
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_3_0 = 0;
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
            if (!param1) {
              stackOut_5_0 = boa.field_a.b(param2);
              stackIn_6_0 = stackOut_5_0;
              break L0;
            } else {
              stackOut_3_0 = ssa.field_a.b(param2);
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var3;
            stackOut_7_1 = new StringBuilder().append("ptb.J(").append(-107).append(',').append(param1).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param2 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L1;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L1;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ')');
        }
        return stackIn_6_0;
    }

    public final void b(faa param0, int param1) {
        super.b(param0, -124);
        param0.a(-632, ((ptb) this).field_h, 32);
        param0.a(-632, ((ptb) this).field_g, 32);
        if (param1 > -109) {
            return;
        }
        try {
            param0.a(-632, ((ptb) this).field_e, 32);
            param0.a(-632, ((ptb) this).field_d, 32);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "ptb.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void b(byte param0) {
        field_f = null;
    }

    public final void a(faa param0, boolean param1) {
        try {
            super.a(param0, param1);
            ((ptb) this).field_h = param0.i(0, 32);
            ((ptb) this).field_g = param0.i(0, 32);
            ((ptb) this).field_e = param0.i(0, 32);
            ((ptb) this).field_d = param0.i(0, 32);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "ptb.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final void b(byte param0, tv param1) {
        ptb var5 = null;
        ptb var6 = null;
        try {
            super.b((byte) 58, param1);
            var5 = (ptb) (Object) param1;
            var6 = var5;
            if (param0 <= 54) {
                field_f = null;
            }
            var6.field_d = ((ptb) this).field_d;
            var6.field_h = ((ptb) this).field_h;
            var6.field_e = ((ptb) this).field_e;
            var6.field_g = ((ptb) this).field_g;
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "ptb.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    ptb() {
    }

    public final void a(tv param0, int param1) {
        RuntimeException var3 = null;
        int var4 = 0;
        ptb var5 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        try {
          L0: {
            L1: {
              super.a(param0, -57);
              var5 = (ptb) (Object) param0;
              var4 = 0;
              if (((ptb) this).field_h == var5.field_h) {
                break L1;
              } else {
                var4 = 1;
                System.out.println("int x has changed. before=" + var5.field_h + ", now=" + ((ptb) this).field_h);
                break L1;
              }
            }
            L2: {
              if (((ptb) this).field_g == var5.field_g) {
                break L2;
              } else {
                var4 = 1;
                System.out.println("int y has changed. before=" + var5.field_g + ", now=" + ((ptb) this).field_g);
                break L2;
              }
            }
            L3: {
              if (((ptb) this).field_e == var5.field_e) {
                break L3;
              } else {
                System.out.println("int width has changed. before=" + var5.field_e + ", now=" + ((ptb) this).field_e);
                var4 = 1;
                break L3;
              }
            }
            L4: {
              if (var5.field_d != ((ptb) this).field_d) {
                System.out.println("int height has changed. before=" + var5.field_d + ", now=" + ((ptb) this).field_d);
                var4 = 1;
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              if (var4 != 0) {
                System.out.println("This instance of MapClearanceRectangle has changed");
                break L5;
              } else {
                break L5;
              }
            }
            if (param1 < -19) {
              break L0;
            } else {
              ((ptb) this).field_e = 3;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var3;
            stackOut_15_1 = new StringBuilder().append("ptb.F(");
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
              break L6;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L6;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + ',' + param1 + ')');
        }
    }

    ptb(int param0, int param1, int param2, int param3) {
        ((ptb) this).field_h = param0;
        ((ptb) this).field_e = param2;
        ((ptb) this).field_d = param3;
        ((ptb) this).field_g = param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "New";
    }
}
