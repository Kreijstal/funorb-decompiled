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
        this.field_z = param1 ? true : false;
    }

    public final void a(tv param0, int param1) {
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var4 = 0;
        mqb var5 = null;
        try {
          L0: {
            L1: {
              var5 = (mqb) ((Object) param0);
              super.a(param0, -34);
              var4 = 0;
              if (var5.field_B == this.field_B) {
                break L1;
              } else {
                System.out.println("int grabbed_object_id has changed. before=" + var5.field_B + ", now=" + this.field_B);
                var4 = 1;
                break L1;
              }
            }
            L2: {
              if (var5.field_u == this.field_u) {
                break L2;
              } else {
                System.out.println("int grabbed_component_id has changed. before=" + var5.field_u + ", now=" + this.field_u);
                var4 = 1;
                break L2;
              }
            }
            if (param1 < -19) {
              L3: {
                if (var5.field_w == this.field_w) {
                  break L3;
                } else {
                  System.out.println("int grabbed_component_offsetx has changed. before=" + var5.field_w + ", now=" + this.field_w);
                  var4 = 1;
                  break L3;
                }
              }
              L4: {
                if (this.field_y != var5.field_y) {
                  System.out.println("int grabbed_component_offsety has changed. before=" + var5.field_y + ", now=" + this.field_y);
                  var4 = 1;
                  break L4;
                } else {
                  break L4;
                }
              }
              L5: {
                if (var5.field_v != this.field_v) {
                  var4 = 1;
                  System.out.println("int fired_from_id has changed. before=" + var5.field_v + ", now=" + this.field_v);
                  break L5;
                } else {
                  break L5;
                }
              }
              L6: {
                if (var5.field_A == this.field_A) {
                  break L6;
                } else {
                  var4 = 1;
                  System.out.println("int fired_from_player has changed. before=" + var5.field_A + ", now=" + this.field_A);
                  break L6;
                }
              }
              L7: {
                if (var5.field_z != this.field_z) {
                  var4 = 1;
                  System.out.println("boolean retracting has changed. before=" + var5.field_z + ", now=" + this.field_z);
                  break L7;
                } else {
                  break L7;
                }
              }
              if (var4 != 0) {
                System.out.println("This instance of GrapplingHook has changed");
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                return;
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var3 = decompiledCaughtException;
            stackIn_25_0 = (RuntimeException) (var3);

            stackIn_25_1 = new StringBuilder().append("mqb.F(");

            if (param0 == null) {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "null";
              break L8;
            } else {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "{...}";
              break L8;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_26_0), stackIn_26_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final int q(int param0) {
        if (param0 != 32) {
            return -77;
        }
        return this.field_y;
    }

    final void d(int param0, int param1, int param2, int param3, int param4) {
        if (param3 < 43) {
          return;
        } else {
          this.field_y = param2;
          this.field_u = param0;
          this.field_B = 1 + param4;
          this.field_w = param1;
          return;
        }
    }

    final int l(byte param0) {
        int var2 = 59 / ((66 - param0) / 49);
        return -1 + this.field_B;
    }

    final int m(int param0) {
        if (param0 != 32) {
            tv var3 = (tv) null;
            this.a((tv) null, -15);
            return this.field_A;
        }
        return this.field_A;
    }

    final int l(int param0) {
        int var2 = 78 % ((39 - param0) / 46);
        return this.field_u;
    }

    public final void a(faa param0, byte param1) {
        try {
            super.a(param0, (byte) -115);
            param0.a(-632, this.field_B, 32);
            param0.a(-632, this.field_u, 32);
            param0.a(-632, this.field_w, 32);
            param0.a(-632, this.field_y, 32);
            param0.a(-632, this.field_v, 32);
            param0.a(-632, this.field_A, 32);
            vq.a(param0, -98, this.field_z);
            if (param1 > -91) {
                this.o(-128);
            }
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "mqb.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final int o(int param0) {
        if (param0 != 23463) {
            this.l((byte) -122);
            return this.field_w;
        }
        return this.field_w;
    }

    public static void j(byte param0) {
        if (param0 != -116) {
            return;
        }
        field_x = null;
        field_C = null;
    }

    public final void a(faa param0, int param1) {
        try {
            super.a(param0, 32);
            this.field_B = param0.i(0, 32);
            this.field_u = param0.i(param1 ^ 32, 32);
            this.field_w = param0.i(0, 32);
            this.field_y = param0.i(0, param1);
            this.field_v = param0.i(param1 ^ 32, 32);
            this.field_A = param0.i(0, 32);
            this.field_z = kv.a(false, param0);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "mqb.L(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void f(boolean param0) {
        if (!param0) {
            this.field_A = -107;
            this.field_B = 0;
            return;
        }
        this.field_B = 0;
    }

    final int p(int param0) {
        if (param0 != 32) {
            this.d(87, 119, -79, -18, -61);
            return this.field_v;
        }
        return this.field_v;
    }

    final void n(int param0) {
        if (param0 != 620) {
            return;
        }
        this.field_k.a(this.field_k.i((byte) -112).field_p, (byte) 92);
    }

    public final void b(faa param0, int param1) {
        super.b(param0, -126);
        if (param1 >= -109) {
            return;
        }
        try {
            param0.a(-632, this.field_B, 32);
            param0.a(-632, this.field_u, 32);
            param0.a(-632, this.field_w, 32);
            param0.a(-632, this.field_y, 32);
            param0.a(-632, this.field_v, 32);
            param0.a(-632, this.field_A, 32);
            vq.a(param0, -123, this.field_z);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "mqb.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final void b(byte param0, tv param1) {
        mqb var4 = (mqb) ((Object) param1);
        mqb var3 = var4;
        super.b((byte) 82, param1);
        if (param0 < 54) {
            return;
        }
        try {
            var4.field_B = this.field_B;
            var4.field_u = this.field_u;
            var4.field_A = this.field_A;
            var4.field_w = this.field_w;
            var4.field_v = this.field_v;
            var4.field_z = this.field_z;
            var4.field_y = this.field_y;
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "mqb.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean k(byte param0) {
        if (param0 >= -1) {
            return true;
        }
        return this.field_z;
    }

    public final boolean a(byte param0, tv param1) {
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var4 = 0;
        mqb var5 = null;
        try {
          L0: {
            L1: {
              L2: {
                var4 = 66 % ((param0 - 22) / 59);
                var5 = (mqb) ((Object) param1);
                if (super.a((byte) 111, param1)) {
                  break L2;
                } else {
                  if (this.field_B != var5.field_B) {
                    break L2;
                  } else {
                    if (var5.field_u != this.field_u) {
                      break L2;
                    } else {
                      if (var5.field_w != this.field_w) {
                        break L2;
                      } else {
                        if (this.field_y != var5.field_y) {
                          break L2;
                        } else {
                          if (var5.field_v != this.field_v) {
                            break L2;
                          } else {
                            if (var5.field_A != this.field_A) {
                              break L2;
                            } else {
                              L3: {
                                if (this.field_z) {
                                  stackIn_10_0 = 0;
                                  break L3;
                                } else {
                                  stackIn_10_0 = 1;
                                  break L3;
                                }
                              }
                              if (stackIn_10_0 != (var5.field_z ? 1 : 0)) {
                                stackIn_13_0 = 0;
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
              stackIn_13_0 = 1;
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var3);

            stackIn_16_1 = new StringBuilder().append("mqb.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L4;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L4;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ')');
        }
        return stackIn_13_0 != 0;
    }

    public final void a(faa param0, boolean param1) {
        try {
            super.a(param0, false);
            this.field_B = param0.i(0, 32);
            this.field_u = param0.i(0, 32);
            this.field_w = param0.i(0, 32);
            this.field_y = param0.i(0, 32);
            this.field_v = param0.i(0, 32);
            this.field_A = param0.i(0, 32);
            this.field_z = kv.a(param1, param0);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "mqb.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    mqb() {
    }

    mqb(ml param0, int param1, int param2) {
        try {
            this.field_k = param0;
            this.e((byte) 119);
            this.field_A = param2;
            this.field_v = param1;
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "mqb.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
    }
}
