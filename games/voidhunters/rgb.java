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
        int var4 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          L0: {
            L1: {
              L2: {
                var4 = 106 / ((param0 - 22) / 59);
                var3 = (rgb) ((Object) param1);
                if (super.a((byte) -50, param1)) {
                  break L2;
                } else {
                  if (this.field_g != var3.field_g) {
                    break L2;
                  } else {
                    if (var3.field_d != this.field_d) {
                      break L2;
                    } else {
                      if (var3.field_e == this.field_e) {
                        stackIn_7_0 = 0;
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                }
              }
              stackIn_7_0 = 1;
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var3_ref);

            stackIn_10_1 = new StringBuilder().append("rgb.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
        return stackIn_7_0 != 0;
    }

    public final void b(byte param0, tv param1) {
        rgb var5 = null;
        rgb var6 = null;
        try {
            if (param0 < 54) {
                field_f = (soa) null;
            }
            super.b((byte) 98, param1);
            var5 = (rgb) ((Object) param1);
            var6 = var5;
            var6.field_d = this.field_d;
            var6.field_e = this.field_e;
            var6.field_g = this.field_g;
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "rgb.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(boolean param0) {
        if (!param0) {
            field_f = (soa) null;
            field_f = null;
            return;
        }
        field_f = null;
    }

    public final void a(faa param0, boolean param1) {
        try {
            super.a(param0, param1);
            this.field_g = param0.i(0, 32);
            this.field_d = param0.i(0, 32);
            this.field_e = param0.i(0, 32);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "rgb.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(pe param0, boolean param1) {
        try {
            if (!param1) {
                pe var4 = (pe) null;
                this.a((pe) null, true);
            }
            param0.a((byte) -99, false, this.field_d, this.field_g, this.field_e);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "rgb.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final void a(tv param0, int param1) {
        RuntimeException var3 = null;
        int var4 = 0;
        rgb var5 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 <= -19) {
                break L1;
              } else {
                this.field_g = 46;
                break L1;
              }
            }
            L2: {
              var5 = (rgb) ((Object) param0);
              super.a(param0, -59);
              var4 = 0;
              if (this.field_g == var5.field_g) {
                break L2;
              } else {
                var4 = 1;
                System.out.println("int x has changed. before=" + var5.field_g + ", now=" + this.field_g);
                break L2;
              }
            }
            L3: {
              if (var5.field_d == this.field_d) {
                break L3;
              } else {
                System.out.println("int y has changed. before=" + var5.field_d + ", now=" + this.field_d);
                var4 = 1;
                break L3;
              }
            }
            L4: {
              if (this.field_e == var5.field_e) {
                break L4;
              } else {
                var4 = 1;
                System.out.println("int radius has changed. before=" + var5.field_e + ", now=" + this.field_e);
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
            stackIn_13_0 = (RuntimeException) (var3);

            stackIn_13_1 = new StringBuilder().append("rgb.F(");

            if (param0 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L5;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L5;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param1 + ')');
        }
    }

    public final void b(faa param0, int param1) {
        try {
            super.b(param0, -123);
            param0.a(-632, this.field_g, 32);
            param0.a(-632, this.field_d, 32);
            if (param1 > -109) {
                faa var4 = (faa) null;
                this.b((faa) null, -92);
            }
            param0.a(-632, this.field_e, 32);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "rgb.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    rgb() {
    }

    rgb(int param0, int param1, int param2) {
        this.field_e = param2;
        this.field_d = param1;
        this.field_g = param0;
    }

    static {
    }
}
