/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mqb extends anb implements ntb, utb {
    private boolean field_z;
    private int field_v;
    static String field_x;
    private int field_B;
    private int field_A;
    private int field_u;
    private int field_y;
    private int field_w;
    static llb field_C;

    final void a(int param0, boolean param1) {
        int var3 = -47 / ((param0 - 56) / 50);
        ((mqb) this).field_z = param1 ? true : false;
    }

    public final void a(tv param0, int param1) {
        RuntimeException var3 = null;
        int var4 = 0;
        mqb var5 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        try {
          L0: {
            L1: {
              var5 = (mqb) (Object) param0;
              super.a(param0, -34);
              var4 = 0;
              if (var5.field_B == var5.field_B) {
                break L1;
              } else {
                System.out.println("int grabbed_object_id has changed. before=" + var5.field_B + ", now=" + var5.field_B);
                var4 = 1;
                break L1;
              }
            }
            L2: {
              if (var5.field_u == var5.field_u) {
                break L2;
              } else {
                System.out.println("int grabbed_component_id has changed. before=" + var5.field_u + ", now=" + var5.field_u);
                var4 = 1;
                break L2;
              }
            }
            if (param1 < -19) {
              L3: {
                if (var5.field_w == var5.field_w) {
                  break L3;
                } else {
                  System.out.println("int grabbed_component_offsetx has changed. before=" + var5.field_w + ", now=" + var5.field_w);
                  var4 = 1;
                  break L3;
                }
              }
              L4: {
                if (var5.field_y != var5.field_y) {
                  System.out.println("int grabbed_component_offsety has changed. before=" + var5.field_y + ", now=" + var5.field_y);
                  var4 = 1;
                  break L4;
                } else {
                  break L4;
                }
              }
              L5: {
                if (var5.field_v != var5.field_v) {
                  var4 = 1;
                  System.out.println("int fired_from_id has changed. before=" + var5.field_v + ", now=" + var5.field_v);
                  break L5;
                } else {
                  break L5;
                }
              }
              L6: {
                if (var5.field_A == var5.field_A) {
                  break L6;
                } else {
                  var4 = 1;
                  System.out.println("int fired_from_player has changed. before=" + var5.field_A + ", now=" + var5.field_A);
                  break L6;
                }
              }
              L7: {
                if (var5.field_z != var5.field_z) {
                  var4 = 1;
                  System.out.println("boolean retracting has changed. before=" + var5.field_z + ", now=" + var5.field_z);
                  break L7;
                } else {
                  break L7;
                }
              }
              if (var4 != 0) {
                System.out.println("This instance of GrapplingHook has changed");
                break L0;
              } else {
                return;
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var3 = decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) var3;
            stackOut_23_1 = new StringBuilder().append("mqb.F(");
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param0 == null) {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L8;
            } else {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L8;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_26_0, stackIn_26_2 + 44 + param1 + 41);
        }
    }

    final int q(int param0) {
        if (param0 != 32) {
            return -77;
        }
        return ((mqb) this).field_y;
    }

    final void d(int param0, int param1, int param2, int param3, int param4) {
        if (param3 < 43) {
          return;
        } else {
          ((mqb) this).field_y = param2;
          ((mqb) this).field_u = param0;
          ((mqb) this).field_B = 1 + param4;
          ((mqb) this).field_w = param1;
          return;
        }
    }

    final int l(byte param0) {
        int var2 = 59 / ((66 - param0) / 49);
        return -1 + ((mqb) this).field_B;
    }

    final int m(int param0) {
        if (param0 != 32) {
            Object var3 = null;
            ((mqb) this).a((tv) null, -15);
            return ((mqb) this).field_A;
        }
        return ((mqb) this).field_A;
    }

    final int l(int param0) {
        int var2 = 78 % ((39 - param0) / 46);
        return ((mqb) this).field_u;
    }

    public final void a(faa param0, byte param1) {
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
              super.a(param0, (byte) -115);
              param0.a(-632, ((mqb) this).field_B, 32);
              param0.a(-632, ((mqb) this).field_u, 32);
              param0.a(-632, ((mqb) this).field_w, 32);
              param0.a(-632, ((mqb) this).field_y, 32);
              param0.a(-632, ((mqb) this).field_v, 32);
              param0.a(-632, ((mqb) this).field_A, 32);
              boolean discarded$4 = vq.a(param0, -98, ((mqb) this).field_z);
              if (param1 <= -91) {
                break L1;
              } else {
                int discarded$5 = ((mqb) this).o(-128);
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
            stackOut_3_1 = new StringBuilder().append("mqb.E(");
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

    final int o(int param0) {
        if (param0 != 23463) {
            int discarded$0 = ((mqb) this).l((byte) -122);
            return ((mqb) this).field_w;
        }
        return ((mqb) this).field_w;
    }

    public static void j(byte param0) {
        field_x = null;
        field_C = null;
    }

    public final void a(faa param0, int param1) {
        try {
            super.a(param0, 32);
            ((mqb) this).field_B = param0.i(0, 32);
            ((mqb) this).field_u = param0.i(param1 ^ 32, 32);
            ((mqb) this).field_w = param0.i(0, 32);
            ((mqb) this).field_y = param0.i(0, param1);
            ((mqb) this).field_v = param0.i(param1 ^ 32, 32);
            ((mqb) this).field_A = param0.i(0, 32);
            ((mqb) this).field_z = kv.a(false, param0);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "mqb.L(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    final void f(boolean param0) {
        if (!param0) {
            ((mqb) this).field_A = -107;
            ((mqb) this).field_B = 0;
            return;
        }
        ((mqb) this).field_B = 0;
    }

    final int p(int param0) {
        if (param0 != 32) {
            ((mqb) this).d(87, 119, -79, -18, -61);
            return ((mqb) this).field_v;
        }
        return ((mqb) this).field_v;
    }

    final void n(int param0) {
        if (param0 != 620) {
            return;
        }
        int discarded$0 = ((mqb) this).field_k.a(((mqb) this).field_k.i((byte) -112).field_p, (byte) 92);
    }

    public final void b(faa param0, int param1) {
        super.b(param0, -126);
        if (param1 >= -109) {
            return;
        }
        try {
            param0.a(-632, ((mqb) this).field_B, 32);
            param0.a(-632, ((mqb) this).field_u, 32);
            param0.a(-632, ((mqb) this).field_w, 32);
            param0.a(-632, ((mqb) this).field_y, 32);
            param0.a(-632, ((mqb) this).field_v, 32);
            param0.a(-632, ((mqb) this).field_A, 32);
            boolean discarded$0 = vq.a(param0, -123, ((mqb) this).field_z);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "mqb.B(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    public final void b(byte param0, tv param1) {
        mqb var4 = (mqb) (Object) param1;
        mqb var3 = var4;
        super.b((byte) 82, param1);
        if (param0 < 54) {
            return;
        }
        try {
            var4.field_B = var4.field_B;
            var4.field_u = var4.field_u;
            var4.field_A = var4.field_A;
            var4.field_w = var4.field_w;
            var4.field_v = var4.field_v;
            var4.field_z = var4.field_z;
            var4.field_y = var4.field_y;
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "mqb.D(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final boolean k(byte param0) {
        if (param0 >= -1) {
            return true;
        }
        return ((mqb) this).field_z;
    }

    public final boolean a(byte param0, tv param1) {
        RuntimeException var3 = null;
        int var4 = 0;
        mqb var5 = null;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        try {
          L0: {
            L1: {
              L2: {
                var4 = 66 % ((param0 - 22) / 59);
                var5 = (mqb) (Object) param1;
                if (super.a((byte) 111, param1)) {
                  break L2;
                } else {
                  if (var5.field_B != var5.field_B) {
                    break L2;
                  } else {
                    if (var5.field_u != var5.field_u) {
                      break L2;
                    } else {
                      if (var5.field_w != var5.field_w) {
                        break L2;
                      } else {
                        if (var5.field_y != var5.field_y) {
                          break L2;
                        } else {
                          if (var5.field_v != var5.field_v) {
                            break L2;
                          } else {
                            if (var5.field_A != var5.field_A) {
                              break L2;
                            } else {
                              L3: {
                                if (var5.field_z) {
                                  stackOut_9_0 = 0;
                                  stackIn_10_0 = stackOut_9_0;
                                  break L3;
                                } else {
                                  stackOut_8_0 = 1;
                                  stackIn_10_0 = stackOut_8_0;
                                  break L3;
                                }
                              }
                              if (stackIn_10_0 != (var5.field_z ? 1 : 0)) {
                                stackOut_12_0 = 0;
                                stackIn_13_0 = stackOut_12_0;
                                break L1;
                              } else {
                                break L2;
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
              stackOut_11_0 = 1;
              stackIn_13_0 = stackOut_11_0;
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var3;
            stackOut_14_1 = new StringBuilder().append("mqb.C(").append(param0).append(44);
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param1 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L4;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L4;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 41);
        }
        return stackIn_13_0 != 0;
    }

    public final void a(faa param0, boolean param1) {
        try {
            super.a(param0, false);
            ((mqb) this).field_B = param0.i(0, 32);
            ((mqb) this).field_u = param0.i(0, 32);
            ((mqb) this).field_w = param0.i(0, 32);
            ((mqb) this).field_y = param0.i(0, 32);
            ((mqb) this).field_v = param0.i(0, 32);
            ((mqb) this).field_A = param0.i(0, 32);
            ((mqb) this).field_z = kv.a(param1, param0);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "mqb.H(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    mqb() {
    }

    mqb(ml param0, int param1, int param2) {
        try {
            ((mqb) this).field_k = param0;
            ((mqb) this).e((byte) 119);
            ((mqb) this).field_A = param2;
            ((mqb) this).field_v = param1;
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "mqb.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 41);
        }
    }

    static {
    }
}
