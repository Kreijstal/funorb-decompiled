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
        try {
            ((lpa) this).field_q = 50;
            ((lpa) this).field_n = 50;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "lpa.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
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
        try {
            super.a(param0, param1);
            param1.b((byte) 91, 3);
            param1.a(true, (byte) -119, 1);
            param1.a((byte) -112, true, 2);
            param1.b((byte) 17, param0);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "lpa.Q(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
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
        try {
            super.a(param0, param1);
            param1.a((byte) 36, ((lpa) this).field_n, 8);
            param1.a((byte) 87, ((lpa) this).field_q, 8);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "lpa.F(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final boolean d(boolean param0) {
        if (param0) {
            return true;
        }
        return ((lpa) this).field_u != -1 ? true : false;
    }

    lpa(la param0, kh param1, boolean param2) {
        super(param0, param1, param2);
        RuntimeException var4 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        ((lpa) this).field_u = -1;
        try {
          L0: {
            L1: {
              ((lpa) this).field_n = param1.b((byte) 44, 8);
              ((lpa) this).field_q = param1.b((byte) 44, 8);
              if (param0.field_E < 4) {
                break L1;
              } else {
                if (19 < param0.field_E) {
                  break L1;
                } else {
                  int discarded$2 = param1.b((byte) 44, 1);
                  return;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var4;
            stackOut_5_1 = new StringBuilder().append("lpa.<init>(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          L3: {
            stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(44);
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
          throw tba.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 44 + param2 + 41);
        }
    }

    final static float[] a(int param0, int param1, float[] param2) {
        float[] var3 = null;
        RuntimeException var3_ref = null;
        float[] var4 = null;
        float[] stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        float[] stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == 50) {
                break L1;
              } else {
                field_o = 116;
                break L1;
              }
            }
            var4 = new float[param0];
            var3 = var4;
            lua.a(param2, 0, var4, 0, param0);
            stackOut_2_0 = (float[]) var4;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3_ref;
            stackOut_4_1 = new StringBuilder().append("lpa.H(").append(param0).append(44).append(param1).append(44);
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param2 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 41);
        }
        return stackIn_3_0;
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
            if (((lpa) this).field_n > 0) {
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
            if (((lpa) this).field_u > 0) {
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
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        try {
          L0: {
            super.a(param0, (byte) 101, param2, param3);
            if (((lpa) this).field_r) {
              return;
            } else {
              L1: {
                if (param1 >= 18) {
                  break L1;
                } else {
                  boolean discarded$3 = ((lpa) this).g((byte) -126);
                  break L1;
                }
              }
              if (param3 == 2) {
                L2: {
                  if ((Object) (Object) ((lpa) this).field_g != (Object) (Object) param0) {
                    break L2;
                  } else {
                    var5_int = ((lpa) this).field_g.d(3) + -((lpa) this).field_g.I(-16423);
                    var6 = ((lpa) this).field_g.e(9648) + -((lpa) this).field_g.y((byte) -91);
                    if (var5_int != 0) {
                      boolean discarded$4 = param2.a(125, true, 1, var6, var5_int, 0);
                      break L2;
                    } else {
                      if (var6 == 0) {
                        break L2;
                      } else {
                        boolean discarded$5 = param2.a(125, true, 1, var6, var5_int, 0);
                        break L2;
                      }
                    }
                  }
                }
                if (((lpa) this).field_u != -1) {
                  break L0;
                } else {
                  ((lpa) this).field_t = ((lpa) this).field_t + param2.b(-89);
                  return;
                }
              } else {
                return;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var5;
            stackOut_16_1 = new StringBuilder().append("lpa.SB(");
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param0 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L3;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L3;
            }
          }
          L4: {
            stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
            stackOut_19_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(44).append(param1).append(44);
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param2 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L4;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L4;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + 44 + param3 + 41);
        }
    }

    public static void b(int param0) {
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
