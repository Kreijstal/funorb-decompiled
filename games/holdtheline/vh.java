/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vh implements dh {
    private int field_b;
    private int field_k;
    private int field_j;
    private int field_c;
    private int field_e;
    static rd field_f;
    private int field_g;
    private int field_d;
    private qi field_h;
    static ll field_a;
    static uf field_i;

    public static void a(boolean param0) {
        field_i = null;
        field_f = null;
        if (!param0) {
            return;
        }
        field_a = null;
    }

    vh(qi param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        ((vh) this).field_h = param0;
        ((vh) this).field_g = param2;
        ((vh) this).field_c = param4;
        ((vh) this).field_k = param7;
        ((vh) this).field_b = param6;
        ((vh) this).field_j = param5;
        ((vh) this).field_e = param3;
        ((vh) this).field_d = param1;
    }

    final static int a(int param0, String param1) {
        if (!param1.equalsIgnoreCase("red")) {
          if (!param1.equalsIgnoreCase("weapons")) {
            if (param0 > 93) {
              L0: {
                if (param1.equalsIgnoreCase("green")) {
                  break L0;
                } else {
                  if (param1.equalsIgnoreCase("speed")) {
                    break L0;
                  } else {
                    L1: {
                      if (param1.equalsIgnoreCase("blue")) {
                        break L1;
                      } else {
                        if (param1.equalsIgnoreCase("shields")) {
                          break L1;
                        } else {
                          if (param1.equalsIgnoreCase("black")) {
                            return 3;
                          } else {
                            throw new IllegalArgumentException();
                          }
                        }
                      }
                    }
                    return 2;
                  }
                }
              }
              return 1;
            } else {
              vh.a(true);
              if (!param1.equalsIgnoreCase("green")) {
                if (!param1.equalsIgnoreCase("speed")) {
                  L2: {
                    if (param1.equalsIgnoreCase("blue")) {
                      break L2;
                    } else {
                      if (param1.equalsIgnoreCase("shields")) {
                        break L2;
                      } else {
                        if (param1.equalsIgnoreCase("black")) {
                          return 3;
                        } else {
                          throw new IllegalArgumentException();
                        }
                      }
                    }
                  }
                  return 2;
                } else {
                  return 1;
                }
              } else {
                return 1;
              }
            }
          } else {
            return 0;
          }
        } else {
          return 0;
        }
    }

    public final void a(boolean param0, int param1, int param2, n param3, int param4) {
        int var7 = 0;
        int var8 = 0;
        double var9 = 0.0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        hg var14 = null;
        n stackIn_3_0 = null;
        Object stackOut_2_0 = null;
        n stackOut_1_0 = null;
        L0: {
          if (!(param3 instanceof hg)) {
            stackOut_2_0 = null;
            stackIn_3_0 = (n) (Object) stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = (n) param3;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var14 = (hg) (Object) stackIn_3_0;
          if (var14 == null) {
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          tc.f(param3.field_k + param1, param4 - -param3.field_o, param3.field_x, param3.field_u, ((vh) this).field_k);
          var7 = var14.field_G + (param3.field_k + param1);
          var8 = var14.field_J + (param4 - -param3.field_o);
          tc.d(var7, var8, var14.field_P, ((vh) this).field_j);
          if ((var14.field_L ^ -1) == 0) {
            break L2;
          } else {
            var9 = 2.0 * ((double)var14.field_L * 3.141592653589793) / (double)var14.field_O;
            var11 = (int)(-Math.sin(var9) * (double)var14.field_P);
            var12 = (int)(Math.cos(var9) * (double)var14.field_P);
            tc.d(var7 - -var11, var12 + var8, 1, ((vh) this).field_b);
            break L2;
          }
        }
        tc.d(var7, var8, 2, 1);
        var9 = 2.0 * ((double)var14.field_K * 3.141592653589793) / (double)var14.field_O;
        var11 = (int)(-Math.sin(var9) * (double)var14.field_P);
        if (param2 > -48) {
          L3: {
            ((vh) this).field_g = -87;
            var12 = (int)(Math.cos(var9) * (double)var14.field_P);
            tc.d(var7, var8, var7 + var11, var8 + var12, 1);
            if (((vh) this).field_h != null) {
              var13 = var14.field_P + var14.field_G - -((vh) this).field_d;
              int discarded$2 = ((vh) this).field_h.a(param3.field_q, param1 + (param3.field_k + var13), param4 + param3.field_o - -((vh) this).field_g, -((vh) this).field_d + (-var13 + param3.field_x), param3.field_u - (((vh) this).field_d << -1442656095), ((vh) this).field_e, ((vh) this).field_c, 1, 1, 0);
              break L3;
            } else {
              break L3;
            }
          }
          return;
        } else {
          L4: {
            var12 = (int)(Math.cos(var9) * (double)var14.field_P);
            tc.d(var7, var8, var7 + var11, var8 + var12, 1);
            if (((vh) this).field_h != null) {
              var13 = var14.field_P + var14.field_G - -((vh) this).field_d;
              int discarded$3 = ((vh) this).field_h.a(param3.field_q, param1 + (param3.field_k + var13), param4 + param3.field_o - -((vh) this).field_g, -((vh) this).field_d + (-var13 + param3.field_x), param3.field_u - (((vh) this).field_d << -1442656095), ((vh) this).field_e, ((vh) this).field_c, 1, 1, 0);
              break L4;
            } else {
              break L4;
            }
          }
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = (rd) (Object) new le(7, 30.0f, new int[2]);
        field_a = new ll();
    }
}
