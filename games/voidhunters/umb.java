/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class umb extends ksa implements ntb {
    static llb field_d;
    int field_g;
    boolean field_e;
    int field_f;

    public static void a(int param0) {
        if (param0 != 16214) {
            umb.a(-109);
            field_d = null;
            return;
        }
        field_d = null;
    }

    public final void a(tv param0, int param1) {
        RuntimeException var3 = null;
        int var4 = 0;
        umb var5 = null;
        boolean stackIn_7_0 = false;
        boolean stackIn_8_0 = false;
        int stackIn_8_1 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var5 = (umb) ((Object) param0);
              var4 = 0;
              if (var5.field_f != this.field_f) {
                iva.a(-6940, "int servertick has changed. before=" + var5.field_f + ", now=" + this.field_f);
                var4 = 1;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (var5.field_g == this.field_g) {
                break L2;
              } else {
                iva.a(-6940, "int statecrc has changed. before=" + var5.field_g + ", now=" + this.field_g);
                var4 = 1;
                break L2;
              }
            }
            L3: {
              stackIn_7_0 = this.field_e;

              if (var5.field_e) {
                stackIn_8_0 = stackIn_7_0;
                stackIn_8_1 = 0;
                break L3;
              } else {
                stackIn_8_0 = stackIn_7_0;
                stackIn_8_1 = 1;
                break L3;
              }
            }
            L4: {
              if ((stackIn_8_0 ? 1 : 0) == stackIn_8_1) {
                var4 = 1;
                iva.a(-6940, "boolean client_should_catchup has changed. ");
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              if (param1 <= -19) {
                break L5;
              } else {
                this.field_e = true;
                break L5;
              }
            }
            if (var4 != 0) {
              tfb.a((byte) -82, "This instance of ServerTick has changed");
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3 = decompiledCaughtException;
            stackIn_19_0 = (RuntimeException) (var3);

            stackIn_19_1 = new StringBuilder().append("umb.F(");

            if (param0 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L6;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L6;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ',' + param1 + ')');
        }
    }

    public final void b(faa param0, int param1) {
        try {
            param0.a(-632, this.field_f, 32);
            param0.a(-632, this.field_g, 32);
            if (param1 > -109) {
                field_d = (llb) null;
            }
            vq.a(param0, 43, this.field_e);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "umb.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final boolean a(byte param0, tv param1) {
        umb var3 = null;
        int var4 = 0;
        boolean stackIn_4_0 = false;
        boolean stackIn_5_0 = false;
        int stackIn_5_1 = 0;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          L0: {
            L1: {
              L2: {
                var4 = -52 / ((22 - param0) / 59);
                var3 = (umb) ((Object) param1);
                if (var3.field_f != this.field_f) {
                  break L2;
                } else {
                  if (var3.field_g != this.field_g) {
                    break L2;
                  } else {
                    L3: {
                      stackIn_4_0 = var3.field_e;

                      if (this.field_e) {
                        stackIn_5_0 = stackIn_4_0;
                        stackIn_5_1 = 0;
                        break L3;
                      } else {
                        stackIn_5_0 = stackIn_4_0;
                        stackIn_5_1 = 1;
                        break L3;
                      }
                    }
                    if ((stackIn_5_0 ? 1 : 0) != stackIn_5_1) {
                      stackIn_8_0 = 0;
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              stackIn_8_0 = 1;
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var3_ref);

            stackIn_11_1 = new StringBuilder().append("umb.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L4;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L4;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ')');
        }
        return stackIn_8_0 != 0;
    }

    public final void b(byte param0, tv param1) {
        umb var4 = (umb) ((Object) param1);
        umb var3 = var4;
        var4.field_f = this.field_f;
        if (param0 < 54) {
            return;
        }
        try {
            var4.field_g = this.field_g;
            var4.field_e = this.field_e;
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "umb.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public final void a(faa param0, boolean param1) {
        RuntimeException runtimeException = null;
        tv var4 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              this.field_f = param0.i(0, 32);
              this.field_g = param0.i(0, 32);
              this.field_e = kv.a(param1, param0);
              if (!param1) {
                break L1;
              } else {
                var4 = (tv) null;
                this.a((tv) null, 89);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("umb.H(");

            if (param0 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L2;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param1 + ')');
        }
    }

    umb() {
    }

    static {
    }
}
