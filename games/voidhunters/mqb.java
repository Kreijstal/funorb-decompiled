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
        int var4 = 0;
        mqb var5 = null;
        L0: {
          var5 = (mqb) (Object) param0;
          super.a(param0, -34);
          var4 = 0;
          if (var5.field_B == var5.field_B) {
            break L0;
          } else {
            System.out.println("int grabbed_object_id has changed. before=" + var5.field_B + ", now=" + var5.field_B);
            var4 = 1;
            break L0;
          }
        }
        L1: {
          if (var5.field_u == var5.field_u) {
            break L1;
          } else {
            System.out.println("int grabbed_component_id has changed. before=" + var5.field_u + ", now=" + var5.field_u);
            var4 = 1;
            break L1;
          }
        }
        if (param1 >= -19) {
          return;
        } else {
          L2: {
            if (var5.field_w == var5.field_w) {
              break L2;
            } else {
              System.out.println("int grabbed_component_offsetx has changed. before=" + var5.field_w + ", now=" + var5.field_w);
              var4 = 1;
              break L2;
            }
          }
          L3: {
            if (var5.field_y != var5.field_y) {
              System.out.println("int grabbed_component_offsety has changed. before=" + var5.field_y + ", now=" + var5.field_y);
              var4 = 1;
              break L3;
            } else {
              break L3;
            }
          }
          L4: {
            if (var5.field_v != var5.field_v) {
              var4 = 1;
              System.out.println("int fired_from_id has changed. before=" + var5.field_v + ", now=" + var5.field_v);
              break L4;
            } else {
              break L4;
            }
          }
          L5: {
            if (var5.field_A == var5.field_A) {
              break L5;
            } else {
              var4 = 1;
              System.out.println("int fired_from_player has changed. before=" + var5.field_A + ", now=" + var5.field_A);
              break L5;
            }
          }
          L6: {
            if (var5.field_z != var5.field_z) {
              var4 = 1;
              System.out.println("boolean retracting has changed. before=" + var5.field_z + ", now=" + var5.field_z);
              break L6;
            } else {
              break L6;
            }
          }
          L7: {
            if (var4 != 0) {
              System.out.println("This instance of GrapplingHook has changed");
              break L7;
            } else {
              break L7;
            }
          }
          return;
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
        super.a(param0, (byte) -115);
        param0.a(-632, ((mqb) this).field_B, 32);
        param0.a(-632, ((mqb) this).field_u, 32);
        param0.a(-632, ((mqb) this).field_w, 32);
        param0.a(-632, ((mqb) this).field_y, 32);
        param0.a(-632, ((mqb) this).field_v, 32);
        param0.a(-632, ((mqb) this).field_A, 32);
        boolean discarded$42 = vq.a(param0, -98, ((mqb) this).field_z);
        if (param1 > -91) {
            int discarded$43 = ((mqb) this).o(-128);
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
        if (param0 != -116) {
            return;
        }
        field_x = null;
        field_C = null;
    }

    public final void a(faa param0, int param1) {
        super.a(param0, 32);
        ((mqb) this).field_B = param0.i(0, 32);
        ((mqb) this).field_u = param0.i(param1 ^ 32, 32);
        ((mqb) this).field_w = param0.i(0, 32);
        ((mqb) this).field_y = param0.i(0, param1);
        ((mqb) this).field_v = param0.i(param1 ^ 32, 32);
        ((mqb) this).field_A = param0.i(0, 32);
        ((mqb) this).field_z = kv.a(false, param0);
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
        } else {
          param0.a(-632, ((mqb) this).field_B, 32);
          param0.a(-632, ((mqb) this).field_u, 32);
          param0.a(-632, ((mqb) this).field_w, 32);
          param0.a(-632, ((mqb) this).field_y, 32);
          param0.a(-632, ((mqb) this).field_v, 32);
          param0.a(-632, ((mqb) this).field_A, 32);
          boolean discarded$1 = vq.a(param0, -123, ((mqb) this).field_z);
          return;
        }
    }

    public final void b(byte param0, tv param1) {
        mqb var5 = null;
        mqb var6 = null;
        var5 = (mqb) (Object) param1;
        var6 = var5;
        super.b((byte) 82, param1);
        if (param0 < 54) {
          return;
        } else {
          var6.field_B = var5.field_B;
          var6.field_u = var5.field_u;
          var6.field_A = var5.field_A;
          var6.field_w = var5.field_w;
          var6.field_v = var5.field_v;
          var6.field_z = var5.field_z;
          var6.field_y = var5.field_y;
          return;
        }
    }

    final boolean k(byte param0) {
        if (param0 >= -1) {
            return true;
        }
        return ((mqb) this).field_z;
    }

    public final boolean a(byte param0, tv param1) {
        int var4 = 0;
        mqb var5 = null;
        int stackIn_15_0 = 0;
        int stackIn_18_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_16_0 = 0;
        var4 = 66 % ((param0 - 22) / 59);
        var5 = (mqb) (Object) param1;
        if (!super.a((byte) 111, param1)) {
          if (var5.field_B == var5.field_B) {
            if (var5.field_u == var5.field_u) {
              if (var5.field_w == var5.field_w) {
                if (var5.field_y == var5.field_y) {
                  if (var5.field_v != var5.field_v) {
                    return true;
                  } else {
                    L0: {
                      L1: {
                        if (var5.field_A != var5.field_A) {
                          break L1;
                        } else {
                          L2: {
                            if (var5.field_z) {
                              stackOut_14_0 = 0;
                              stackIn_15_0 = stackOut_14_0;
                              break L2;
                            } else {
                              stackOut_13_0 = 1;
                              stackIn_15_0 = stackOut_13_0;
                              break L2;
                            }
                          }
                          if (stackIn_15_0 != (var5.field_z ? 1 : 0)) {
                            stackOut_17_0 = 0;
                            stackIn_18_0 = stackOut_17_0;
                            break L0;
                          } else {
                            break L1;
                          }
                        }
                      }
                      stackOut_16_0 = 1;
                      stackIn_18_0 = stackOut_16_0;
                      break L0;
                    }
                    return stackIn_18_0 != 0;
                  }
                } else {
                  return true;
                }
              } else {
                return true;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        } else {
          return true;
        }
    }

    public final void a(faa param0, boolean param1) {
        super.a(param0, false);
        ((mqb) this).field_B = param0.i(0, 32);
        ((mqb) this).field_u = param0.i(0, 32);
        ((mqb) this).field_w = param0.i(0, 32);
        ((mqb) this).field_y = param0.i(0, 32);
        ((mqb) this).field_v = param0.i(0, 32);
        ((mqb) this).field_A = param0.i(0, 32);
        ((mqb) this).field_z = kv.a(param1, param0);
    }

    mqb() {
    }

    mqb(ml param0, int param1, int param2) {
        ((mqb) this).field_k = param0;
        ((mqb) this).e((byte) 119);
        ((mqb) this).field_A = param2;
        ((mqb) this).field_v = param1;
    }

    static {
    }
}
