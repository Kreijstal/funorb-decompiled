/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cq extends ksa implements ntb {
    int field_f;
    int field_d;
    int field_g;
    int field_e;

    public final void b(byte param0, tv param1) {
        cq var5 = null;
        cq var6 = null;
        try {
            if (param0 < 54) {
                ((cq) this).field_g = 98;
            }
            var5 = (cq) (Object) param1;
            var6 = var5;
            var6.field_g = var5.field_g;
            var6.field_e = var5.field_e;
            var6.field_f = var5.field_f;
            var6.field_d = var5.field_d;
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "cq.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean a(int param0, int param1, byte param2) {
        if (param2 == -98) {
          if (((cq) this).field_f <= param1) {
            if (param0 >= ((cq) this).field_g) {
              if (param1 < ((cq) this).field_f + ((cq) this).field_e) {
                if (param0 >= ((cq) this).field_g - -((cq) this).field_d) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        } else {
          return true;
        }
    }

    public final void a(faa param0, boolean param1) {
        RuntimeException runtimeException = null;
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
              ((cq) this).field_f = param0.i(0, 32);
              ((cq) this).field_g = param0.i(0, 32);
              ((cq) this).field_e = param0.i(0, 32);
              ((cq) this).field_d = param0.i(0, 32);
              if (!param1) {
                break L1;
              } else {
                boolean discarded$2 = ((cq) this).a(64, 118, (byte) 59);
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
            stackOut_3_1 = new StringBuilder().append("cq.H(");
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
          throw rta.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ',' + param1 + ')');
        }
    }

    public final void a(tv param0, int param1) {
        RuntimeException var3 = null;
        int var4 = 0;
        cq var5 = null;
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
              var5 = (cq) (Object) param0;
              var4 = 0;
              if (var5.field_f != var5.field_f) {
                var4 = 1;
                System.out.println("int x has changed. before=" + var5.field_f + ", now=" + var5.field_f);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (var5.field_g != var5.field_g) {
                var4 = 1;
                System.out.println("int y has changed. before=" + var5.field_g + ", now=" + var5.field_g);
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (var5.field_e == var5.field_e) {
                break L3;
              } else {
                var4 = 1;
                System.out.println("int width has changed. before=" + var5.field_e + ", now=" + var5.field_e);
                break L3;
              }
            }
            L4: {
              if (var5.field_d == var5.field_d) {
                break L4;
              } else {
                System.out.println("int height has changed. before=" + var5.field_d + ", now=" + var5.field_d);
                var4 = 1;
                break L4;
              }
            }
            if (param1 < -19) {
              L5: {
                if (var4 == 0) {
                  break L5;
                } else {
                  System.out.println("This instance of MapZone has changed");
                  break L5;
                }
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var3;
            stackOut_15_1 = new StringBuilder().append("cq.F(");
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

    public final void b(faa param0, int param1) {
        try {
            param0.a(-632, ((cq) this).field_f, 32);
            param0.a(-632, ((cq) this).field_g, 32);
            param0.a(-632, ((cq) this).field_e, 32);
            if (param1 > -109) {
                Object var4 = null;
                ((cq) this).a(-77, 104, (lta) null);
            }
            param0.a(-632, ((cq) this).field_d, 32);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "cq.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final boolean a(byte param0, tv param1) {
        cq var3 = null;
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
                var3 = (cq) (Object) param1;
                var4 = 86 % ((param0 - 22) / 59);
                if (var3.field_f != var3.field_f) {
                  break L2;
                } else {
                  if (var3.field_g != var3.field_g) {
                    break L2;
                  } else {
                    if (var3.field_e != var3.field_e) {
                      break L2;
                    } else {
                      if (var3.field_d == var3.field_d) {
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
            stackOut_8_1 = new StringBuilder().append("cq.C(").append(param0).append(',');
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

    final void a(int param0, int param1, lta param2) {
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        try {
            var4_int = param2.a(((cq) this).field_f, (byte) 126);
            var5 = param2.b(true, ((cq) this).field_g);
            if (param0 != 32) {
                Object var8 = null;
                ((cq) this).b((faa) null, 76);
            }
            var6 = param2.a(((cq) this).field_e + ((cq) this).field_f, (byte) 125);
            var7 = param2.b(true, ((cq) this).field_d + ((cq) this).field_g);
            ga.a(64, false, var4_int, var5, -var5 + var7, -var4_int + var6, param1);
            uv.a(112, var4_int, -var5 + var7, var5, param1, -var4_int + var6);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "cq.E(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    cq() {
    }

    cq(int param0, int param1) {
        ((cq) this).field_d = 65536;
        ((cq) this).field_f = param0;
        ((cq) this).field_g = param1;
        ((cq) this).field_e = 65536;
    }

    static {
    }
}
