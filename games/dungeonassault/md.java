/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class md {
    static int field_b;
    static int field_f;
    static Random field_d;
    ne field_c;
    static String field_a;
    private ne field_e;

    static int b(int param0, int param1) {
        return param0 ^ param1;
    }

    final ne b(byte param0) {
        ne var2 = null;
        var2 = ((md) this).field_c.field_e;
        if (param0 == -124) {
          if (var2 == ((md) this).field_c) {
            return null;
          } else {
            var2.a(false);
            return var2;
          }
        } else {
          ne discarded$7 = ((md) this).a(80);
          if (var2 == ((md) this).field_c) {
            return null;
          } else {
            var2.a(false);
            return var2;
          }
        }
    }

    final void b(int param0) {
        ne var2 = null;
        int var3 = 0;
        Object var4 = null;
        var3 = DungeonAssault.field_K;
        L0: while (true) {
          var2 = ((md) this).field_c.field_e;
          if (var2 != ((md) this).field_c) {
            var2.a(false);
            continue L0;
          } else {
            if (param0 != -4) {
              var4 = null;
              ((md) this).b((ne) null, false);
              ((md) this).field_e = null;
              return;
            } else {
              ((md) this).field_e = null;
              return;
            }
          }
        }
    }

    final ne g(int param0) {
        ne var2 = null;
        Object var3 = null;
        var2 = ((md) this).field_e;
        if (((md) this).field_c == var2) {
          ((md) this).field_e = null;
          return null;
        } else {
          ((md) this).field_e = var2.field_a;
          if (param0 != 20) {
            var3 = null;
            ((md) this).a((ne) null, false);
            return var2;
          } else {
            return var2;
          }
        }
    }

    final static void a(int param0, int param1) {
        mo.field_e = param1;
        if (nk.field_Jb.field_b >= 0) {
          if (!nl.a(nk.field_Jb.field_b, (byte) -124)) {
            nk.field_Jb.field_b = 1;
            if (param0 == 20631) {
              return;
            } else {
              field_b = 78;
              return;
            }
          } else {
            if (param0 == 20631) {
              return;
            } else {
              field_b = 78;
              return;
            }
          }
        } else {
          if (param0 == 20631) {
            return;
          } else {
            field_b = 78;
            return;
          }
        }
    }

    final boolean a(byte param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 > -55) {
          L0: {
            ((md) this).field_c = null;
            if (((md) this).field_c.field_e != ((md) this).field_c) {
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
            if (((md) this).field_c.field_e != ((md) this).field_c) {
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

    final static void a(float param0, float param1, float param2, float param3, float param4, int param5, float param6) {
        L0: {
          if (null == bf.field_h) {
            bf.field_h = new ge((qb) (Object) wa.field_j);
            hm.field_n.a((qb) (Object) bf.field_h);
            break L0;
          } else {
            break L0;
          }
        }
        bf.field_h.f(param4);
        bf.field_h.e(param1);
        bf.field_h.d(param6);
        bf.field_h.a(param3);
        bf.field_h.b(param0);
        bf.field_h.c(param2);
        if (param5 == 0) {
          return;
        } else {
          field_b = 91;
          return;
        }
    }

    final static boolean f(int param0) {
        return null == cm.field_R ? rj.field_o : true;
    }

    public static void h(int param0) {
        field_a = null;
        field_d = null;
        if (param0 == -4) {
            return;
        }
        md.h(69);
    }

    final void a(ne param0, boolean param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              if (param0.field_a != null) {
                param0.a(param1);
                break L1;
              } else {
                break L1;
              }
            }
            param0.field_a = ((md) this).field_c.field_a;
            param0.field_e = ((md) this).field_c;
            param0.field_a.field_e = param0;
            param0.field_e.field_a = param0;
            if (!param1) {
              break L0;
            } else {
              field_d = null;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var3;
            stackOut_6_1 = new StringBuilder().append("md.H(");
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          throw vk.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 44 + param1 + 41);
        }
    }

    final ne a(int param0) {
        ne var2 = null;
        if (param0 != 4) {
            Object var3 = null;
            md.a(-3, (cn) null);
            var2 = ((md) this).field_e;
            if (!(var2 != ((md) this).field_c)) {
                ((md) this).field_e = null;
                return null;
            }
            ((md) this).field_e = var2.field_e;
            return var2;
        }
        var2 = ((md) this).field_e;
        if (!(var2 != ((md) this).field_c)) {
            ((md) this).field_e = null;
            return null;
        }
        ((md) this).field_e = var2.field_e;
        return var2;
    }

    final ne e(int param0) {
        ne var2 = null;
        if (param0 == -24172) {
          var2 = ((md) this).field_c.field_e;
          if (var2 == ((md) this).field_c) {
            ((md) this).field_e = null;
            return null;
          } else {
            ((md) this).field_e = var2.field_e;
            return var2;
          }
        } else {
          field_d = null;
          var2 = ((md) this).field_c.field_e;
          if (var2 == ((md) this).field_c) {
            ((md) this).field_e = null;
            return null;
          } else {
            ((md) this).field_e = var2.field_e;
            return var2;
          }
        }
    }

    final ne c(int param0) {
        ne var2 = null;
        var2 = ((md) this).field_c.field_a;
        if (param0 == 0) {
          if (((md) this).field_c == var2) {
            return null;
          } else {
            var2.a(false);
            return var2;
          }
        } else {
          ((md) this).field_c = null;
          if (((md) this).field_c == var2) {
            return null;
          } else {
            var2.a(false);
            return var2;
          }
        }
    }

    final static void a(int param0, cn param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var9 = DungeonAssault.field_K;
        try {
          L0: {
            if ((3 & (param1.field_A | (param1.field_w | (param1.field_v | param1.field_y)))) != 0) {
              L1: {
                var2_int = (3 & param1.field_w) + param1.field_y;
                var2_int = -(3 & var2_int) + 4 + var2_int;
                var3 = (param1.field_A & 3) + param1.field_v;
                var3 = var3 - ((3 & var3) + -4);
                var4 = new int[var3 * var2_int];
                var5 = 0;
                var6 = (3 & param1.field_w) - -(var2_int * (param1.field_A & 3));
                var7 = 0;
                if (param0 > 42) {
                  break L1;
                } else {
                  field_f = -7;
                  break L1;
                }
              }
              L2: while (true) {
                if (param1.field_v <= var7) {
                  param1.field_y = var2_int;
                  param1.field_w = param1.field_w & -4;
                  param1.field_v = var3;
                  param1.field_A = param1.field_A & -4;
                  param1.field_B = var4;
                  break L0;
                } else {
                  var8 = 0;
                  L3: while (true) {
                    if (param1.field_y <= var8) {
                      var6 = var6 + (var2_int + -param1.field_y);
                      var7++;
                      continue L2;
                    } else {
                      int incrementValue$2 = var6;
                      var6++;
                      int incrementValue$3 = var5;
                      var5++;
                      var4[incrementValue$2] = param1.field_B[incrementValue$3];
                      var8++;
                      continue L3;
                    }
                  }
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var2;
            stackOut_12_1 = new StringBuilder().append("md.O(").append(param0).append(44);
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param1 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L4;
            }
          }
          throw vk.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 41);
        }
    }

    final void b(ne param0, boolean param1) {
        try {
            if (!(null == param0.field_a)) {
                param0.a(false);
            }
            if (param1) {
                field_a = null;
            }
            param0.field_a = ((md) this).field_c;
            param0.field_e = ((md) this).field_c.field_e;
            param0.field_a.field_e = param0;
            param0.field_e.field_a = param0;
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) (Object) runtimeException, "md.L(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    final ne d(int param0) {
        ne var2 = null;
        if (param0 != -14205) {
            field_a = null;
            var2 = ((md) this).field_c.field_a;
            if (!(var2 != ((md) this).field_c)) {
                ((md) this).field_e = null;
                return null;
            }
            ((md) this).field_e = var2.field_a;
            return var2;
        }
        var2 = ((md) this).field_c.field_a;
        if (!(var2 != ((md) this).field_c)) {
            ((md) this).field_e = null;
            return null;
        }
        ((md) this).field_e = var2.field_a;
        return var2;
    }

    public md() {
        ((md) this).field_c = new ne();
        ((md) this).field_c.field_e = ((md) this).field_c;
        ((md) this).field_c.field_a = ((md) this).field_c;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = 20;
        field_a = "FULL ACCESS";
        field_d = new Random(6L);
    }
}
