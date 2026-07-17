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
        boolean stackIn_6_0 = false;
        boolean stackIn_7_0 = false;
        boolean stackIn_8_0 = false;
        int stackIn_8_1 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_5_0 = false;
        boolean stackOut_7_0 = false;
        int stackOut_7_1 = 0;
        boolean stackOut_6_0 = false;
        int stackOut_6_1 = 0;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        try {
          L0: {
            L1: {
              var5 = (umb) (Object) param0;
              var4 = 0;
              if (var5.field_f != var5.field_f) {
                iva.a(-6940, "int servertick has changed. before=" + var5.field_f + ", now=" + var5.field_f);
                var4 = 1;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (var5.field_g == var5.field_g) {
                break L2;
              } else {
                iva.a(-6940, "int statecrc has changed. before=" + var5.field_g + ", now=" + var5.field_g);
                var4 = 1;
                break L2;
              }
            }
            L3: {
              stackOut_5_0 = var5.field_e;
              stackIn_7_0 = stackOut_5_0;
              stackIn_6_0 = stackOut_5_0;
              if (var5.field_e) {
                stackOut_7_0 = stackIn_7_0;
                stackOut_7_1 = 0;
                stackIn_8_0 = stackOut_7_0;
                stackIn_8_1 = stackOut_7_1;
                break L3;
              } else {
                stackOut_6_0 = stackIn_6_0;
                stackOut_6_1 = 1;
                stackIn_8_0 = stackOut_6_0;
                stackIn_8_1 = stackOut_6_1;
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
                ((umb) this).field_e = true;
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
            stackOut_17_0 = (RuntimeException) var3;
            stackOut_17_1 = new StringBuilder().append("umb.F(");
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param0 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L6;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L6;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + 44 + param1 + 41);
        }
    }

    public final void b(faa param0, int param1) {
        try {
            param0.a(-632, ((umb) this).field_f, 32);
            param0.a(-632, ((umb) this).field_g, 32);
            if (param1 > -109) {
                field_d = null;
            }
            boolean discarded$0 = vq.a(param0, 43, ((umb) this).field_e);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "umb.B(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    public final boolean a(byte param0, tv param1) {
        umb var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        boolean stackIn_3_0 = false;
        boolean stackIn_4_0 = false;
        boolean stackIn_5_0 = false;
        int stackIn_5_1 = 0;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_2_0 = false;
        boolean stackOut_4_0 = false;
        int stackOut_4_1 = 0;
        boolean stackOut_3_0 = false;
        int stackOut_3_1 = 0;
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
                var4 = -52 / ((22 - param0) / 59);
                var3 = (umb) (Object) param1;
                if (var3.field_f != var3.field_f) {
                  break L2;
                } else {
                  if (var3.field_g != var3.field_g) {
                    break L2;
                  } else {
                    L3: {
                      stackOut_2_0 = var3.field_e;
                      stackIn_4_0 = stackOut_2_0;
                      stackIn_3_0 = stackOut_2_0;
                      if (var3.field_e) {
                        stackOut_4_0 = stackIn_4_0;
                        stackOut_4_1 = 0;
                        stackIn_5_0 = stackOut_4_0;
                        stackIn_5_1 = stackOut_4_1;
                        break L3;
                      } else {
                        stackOut_3_0 = stackIn_3_0;
                        stackOut_3_1 = 1;
                        stackIn_5_0 = stackOut_3_0;
                        stackIn_5_1 = stackOut_3_1;
                        break L3;
                      }
                    }
                    if ((stackIn_5_0 ? 1 : 0) != stackIn_5_1) {
                      stackOut_7_0 = 0;
                      stackIn_8_0 = stackOut_7_0;
                      break L1;
                    } else {
                      break L2;
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
          L4: {
            var3_ref = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var3_ref;
            stackOut_9_1 = new StringBuilder().append("umb.C(").append(param0).append(44);
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
              break L4;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L4;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 41);
        }
        return stackIn_8_0 != 0;
    }

    public final void b(byte param0, tv param1) {
        umb var4 = (umb) (Object) param1;
        umb var3 = var4;
        var4.field_f = var4.field_f;
        if (param0 < 54) {
            return;
        }
        try {
            var4.field_g = var4.field_g;
            var4.field_e = var4.field_e;
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "umb.D(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    public final void a(faa param0, boolean param1) {
        RuntimeException runtimeException = null;
        Object var4 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              ((umb) this).field_f = param0.i(0, 32);
              ((umb) this).field_g = param0.i(0, 32);
              ((umb) this).field_e = kv.a(param1, param0);
              if (!param1) {
                break L1;
              } else {
                var4 = null;
                ((umb) this).a((tv) null, 89);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("umb.H(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 44 + param1 + 41);
        }
    }

    umb() {
    }

    static {
    }
}
