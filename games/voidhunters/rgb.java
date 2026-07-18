/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rgb extends dmb implements ntb {
    private int field_g;
    private int field_d;
    private int field_e;
    static soa field_f;

    public final boolean a(byte param0, tv param1) {
        rgb var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            L1: {
              L2: {
                var4 = 106 / ((param0 - 22) / 59);
                var3 = (rgb) (Object) param1;
                if (super.a((byte) -50, param1)) {
                  break L2;
                } else {
                  if (((rgb) this).field_g != var3.field_g) {
                    break L2;
                  } else {
                    if (var3.field_d != ((rgb) this).field_d) {
                      break L2;
                    } else {
                      if (var3.field_e == ((rgb) this).field_e) {
                        stackOut_6_0 = 0;
                        stackIn_7_0 = stackOut_6_0;
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                }
              }
              stackOut_5_0 = 1;
              stackIn_7_0 = stackOut_5_0;
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var3_ref;
            stackOut_8_1 = new StringBuilder().append("rgb.C(").append(param0).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ')');
        }
        return stackIn_7_0 != 0;
    }

    public final void b(byte param0, tv param1) {
        rgb var5 = null;
        rgb var6 = null;
        try {
            if (param0 < 54) {
                field_f = null;
            }
            super.b((byte) 98, param1);
            var5 = (rgb) (Object) param1;
            var6 = var5;
            var6.field_d = ((rgb) this).field_d;
            var6.field_e = ((rgb) this).field_e;
            var6.field_g = ((rgb) this).field_g;
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "rgb.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(boolean param0) {
        field_f = null;
    }

    public final void a(faa param0, boolean param1) {
        try {
            super.a(param0, param1);
            ((rgb) this).field_g = param0.i(0, 32);
            ((rgb) this).field_d = param0.i(0, 32);
            ((rgb) this).field_e = param0.i(0, 32);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "rgb.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(pe param0, boolean param1) {
        try {
            if (!param1) {
                Object var4 = null;
                ((rgb) this).a((pe) null, true);
            }
            boolean discarded$0 = param0.a((byte) -99, false, ((rgb) this).field_d, ((rgb) this).field_g, ((rgb) this).field_e);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "rgb.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final void a(tv param0, int param1) {
        RuntimeException var3 = null;
        int var4 = 0;
        rgb var5 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            L1: {
              if (param1 <= -19) {
                break L1;
              } else {
                ((rgb) this).field_g = 46;
                break L1;
              }
            }
            L2: {
              var5 = (rgb) (Object) param0;
              super.a(param0, -59);
              var4 = 0;
              if (((rgb) this).field_g == var5.field_g) {
                break L2;
              } else {
                var4 = 1;
                System.out.println("int x has changed. before=" + var5.field_g + ", now=" + ((rgb) this).field_g);
                break L2;
              }
            }
            L3: {
              if (var5.field_d == ((rgb) this).field_d) {
                break L3;
              } else {
                System.out.println("int y has changed. before=" + var5.field_d + ", now=" + ((rgb) this).field_d);
                var4 = 1;
                break L3;
              }
            }
            L4: {
              if (((rgb) this).field_e == var5.field_e) {
                break L4;
              } else {
                var4 = 1;
                System.out.println("int radius has changed. before=" + var5.field_e + ", now=" + ((rgb) this).field_e);
                break L4;
              }
            }
            if (var4 == 0) {
              break L0;
            } else {
              System.out.println("This instance of MapClearanceCircle has changed");
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var3;
            stackOut_11_1 = new StringBuilder().append("rgb.F(");
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L5;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L5;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ',' + param1 + ')');
        }
    }

    public final void b(faa param0, int param1) {
        try {
            super.b(param0, -123);
            param0.a(-632, ((rgb) this).field_g, 32);
            param0.a(-632, ((rgb) this).field_d, 32);
            if (param1 > -109) {
                Object var4 = null;
                ((rgb) this).b((faa) null, -92);
            }
            param0.a(-632, ((rgb) this).field_e, 32);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "rgb.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    rgb() {
    }

    rgb(int param0, int param1, int param2) {
        ((rgb) this).field_e = param2;
        ((rgb) this).field_d = param1;
        ((rgb) this).field_g = param0;
    }

    static {
    }
}
