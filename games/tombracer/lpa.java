/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class lpa extends nv {
    private int field_t;
    private int field_u;
    private int field_q;
    private boolean field_r;
    static Random field_p;
    static il field_s;
    private int field_n;
    static int field_v;
    static boolean field_w;
    static int field_o;

    lpa(la param0, boolean param1) {
        super(param0, param1);
        ((lpa) this).field_u = -1;
        ((lpa) this).field_q = 50;
        ((lpa) this).field_n = 50;
    }

    final int a(int param0, int param1, int param2, int param3, byte param4, int param5) {
        int var7 = 0;
        if (!((lpa) this).field_r) {
          if (param3 == 1) {
            var7 = 0;
            if (param4 < 79) {
              ((lpa) this).field_q = -65;
              return foa.a(param1, param5, ((lpa) this).field_g.e(9648), param2, -var7 + ((lpa) this).field_g.c(-62), (byte) 75, param0, ((lpa) this).field_g.a((byte) 55) + -var7, 16, ((lpa) this).field_g.d(3));
            } else {
              return foa.a(param1, param5, ((lpa) this).field_g.e(9648), param2, -var7 + ((lpa) this).field_g.c(-62), (byte) 75, param0, ((lpa) this).field_g.a((byte) 55) + -var7, 16, ((lpa) this).field_g.d(3));
            }
          } else {
            return 0;
          }
        } else {
          return 0;
        }
    }

    final boolean g(byte param0) {
        Object var3 = null;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 < 63) {
          L0: {
            var3 = null;
            ((lpa) this).a(false, (fsa) null);
            if (-1 > ((lpa) this).field_u) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (-1 < ((lpa) this).field_u) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    final int a(int param0, int param1) {
        if (param1 >= -48) {
            return 39;
        }
        param0 = fs.a((byte) 71, param0, ((lpa) this).field_u);
        return param0;
    }

    final void a(boolean param0, fsa param1) {
        super.a(param0, param1);
        param1.b((byte) 91, 3);
        param1.a(true, (byte) -119, 1);
        param1.a((byte) -112, true, 2);
        param1.b((byte) 17, param0);
    }

    final void b(int param0, int param1) {
        ((lpa) this).field_n = param1;
        if (param0 != -5) {
            int discarded$0 = ((lpa) this).a(3, -95, -50, 37, (byte) -23, 92);
        }
    }

    final int a(boolean param0) {
        if (param0) {
            int discarded$0 = ((lpa) this).a(-87, -106);
            return 9;
        }
        return 9;
    }

    final void a(boolean param0, kh param1) {
        super.a(param0, param1);
        param1.a((byte) 36, ((lpa) this).field_n, 8);
        param1.a((byte) 87, ((lpa) this).field_q, 8);
    }

    final boolean d(boolean param0) {
        if (param0) {
            return true;
        }
        return (((lpa) this).field_u ^ -1) != 0 ? true : false;
    }

    lpa(la param0, kh param1, boolean param2) {
        super(param0, param1, param2);
        ((lpa) this).field_u = -1;
        ((lpa) this).field_n = param1.b((byte) 44, 8);
        ((lpa) this).field_q = param1.b((byte) 44, 8);
        if ((param0.field_E ^ -1) <= -5) {
            if (19 >= param0.field_E) {
                int discarded$0 = param1.b((byte) 44, 1);
            }
        }
    }

    final static float[] a(int param0, int param1, float[] param2) {
        float[] var3 = null;
        float[] var4 = null;
        if (param1 != 50) {
          field_o = 116;
          var4 = new float[param0];
          var3 = var4;
          lua.a(param2, 0, var4, 0, param0);
          return var4;
        } else {
          var4 = new float[param0];
          var3 = var4;
          lua.a(param2, 0, var4, 0, param0);
          return var4;
        }
    }

    final void a(int param0, byte param1) {
        int var3 = -16 % ((16 - param1) / 44);
        ((lpa) this).field_q = param0;
    }

    public final void m(int param0) {
        int var2 = -46 % ((28 - param0) / 49);
        if (((lpa) this).field_k) {
            return;
        }
        super.m(117);
    }

    final void k(int param0) {
        int var3 = 0;
        var3 = TombRacer.field_G ? 1 : 0;
        if (param0 == 5418) {
          if (!((lpa) this).d(false)) {
            if ((((lpa) this).field_n ^ -1) < -1) {
              if (((lpa) this).field_n > ((lpa) this).field_t) {
                ((lpa) this).field_t = 0;
                return;
              } else {
                ((lpa) this).field_u = ((lpa) this).field_q;
                return;
              }
            } else {
              ((lpa) this).field_t = 0;
              return;
            }
          } else {
            ((lpa) this).field_u = ((lpa) this).field_u - 1;
            if (-1 > (((lpa) this).field_u ^ -1)) {
              return;
            } else {
              ((lpa) this).field_r = true;
              ((lpa) this).field_g.i(true);
              return;
            }
          }
        } else {
          return;
        }
    }

    final void a(ffa param0, byte param1, gma param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        super.a(param0, (byte) 101, param2, param3);
        if (((lpa) this).field_r) {
          return;
        } else {
          if (param1 >= 18) {
            if ((param3 ^ -1) == -3) {
              L0: {
                if ((Object) (Object) ((lpa) this).field_g != (Object) (Object) param0) {
                  break L0;
                } else {
                  var5 = ((lpa) this).field_g.d(3) + -((lpa) this).field_g.I(-16423);
                  var6 = ((lpa) this).field_g.e(9648) + -((lpa) this).field_g.y((byte) -91);
                  if (var5 != 0) {
                    boolean discarded$5 = param2.a(125, true, 1, var6, var5, 0);
                    if (((lpa) this).field_u == -1) {
                      ((lpa) this).field_t = ((lpa) this).field_t + param2.b(-89);
                      return;
                    } else {
                      return;
                    }
                  } else {
                    if (var6 == 0) {
                      break L0;
                    } else {
                      boolean discarded$6 = param2.a(125, true, 1, var6, var5, 0);
                      if (((lpa) this).field_u == -1) {
                        ((lpa) this).field_t = ((lpa) this).field_t + param2.b(-89);
                        return;
                      } else {
                        return;
                      }
                    }
                  }
                }
              }
              if (((lpa) this).field_u == -1) {
                ((lpa) this).field_t = ((lpa) this).field_t + param2.b(-89);
                return;
              } else {
                return;
              }
            } else {
              return;
            }
          } else {
            boolean discarded$7 = ((lpa) this).g((byte) -126);
            if ((param3 ^ -1) == -3) {
              if ((Object) (Object) ((lpa) this).field_g == (Object) (Object) param0) {
                var5 = ((lpa) this).field_g.d(3) + -((lpa) this).field_g.I(-16423);
                var6 = ((lpa) this).field_g.e(9648) + -((lpa) this).field_g.y((byte) -91);
                if (var5 != 0) {
                  boolean discarded$8 = param2.a(125, true, 1, var6, var5, 0);
                  if (((lpa) this).field_u != -1) {
                    return;
                  } else {
                    ((lpa) this).field_t = ((lpa) this).field_t + param2.b(-89);
                    return;
                  }
                } else {
                  if (var6 != 0) {
                    boolean discarded$9 = param2.a(125, true, 1, var6, var5, 0);
                    if (((lpa) this).field_u == -1) {
                      ((lpa) this).field_t = ((lpa) this).field_t + param2.b(-89);
                      return;
                    } else {
                      return;
                    }
                  } else {
                    L1: {
                      if (((lpa) this).field_u != -1) {
                        break L1;
                      } else {
                        ((lpa) this).field_t = ((lpa) this).field_t + param2.b(-89);
                        break L1;
                      }
                    }
                    return;
                  }
                }
              } else {
                L2: {
                  if (((lpa) this).field_u != -1) {
                    break L2;
                  } else {
                    ((lpa) this).field_t = ((lpa) this).field_t + param2.b(-89);
                    break L2;
                  }
                }
                return;
              }
            } else {
              return;
            }
          }
        }
    }

    public static void b(int param0) {
        if (param0 != 1) {
            field_p = null;
            field_s = null;
            field_p = null;
            return;
        }
        field_s = null;
        field_p = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = new Random();
        field_v = 0;
        field_o = 0;
    }
}
