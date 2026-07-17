/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class fd implements Iterable {
    static lj field_c;
    static long field_e;
    da[] field_a;
    static int field_f;
    static int field_g;
    private da field_b;
    static ka field_h;
    int field_d;

    final void a(byte param0, da param1, long param2) {
        if (null != param1.field_h) {
            param1.a(true);
        }
        da var5 = ((fd) this).field_a[(int)((long)(((fd) this).field_d - 1) & param2)];
        if (param0 < 2) {
            return;
        }
        try {
            param1.field_f = var5;
            param1.field_h = var5.field_h;
            param1.field_h.field_f = param1;
            param1.field_d = param2;
            param1.field_f.field_h = param1;
        } catch (RuntimeException runtimeException) {
            throw oj.a((Throwable) (Object) runtimeException, "fd.E(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 41);
        }
    }

    public static void b(int param0) {
        field_c = null;
        field_h = null;
    }

    final static void a(byte param0, ka param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var9 = TorChallenge.field_F ? 1 : 0;
        try {
          L0: {
            if ((3 & (param1.field_x | param1.field_u | param1.field_s | param1.field_p)) != 0) {
              L1: {
                var2_int = (3 & param1.field_s) + param1.field_u;
                var2_int = 4 - ((var2_int & 3) - var2_int);
                var3 = param1.field_x - -(param1.field_p & 3);
                var3 = 4 + -(var3 & 3) + var3;
                var4 = new int[var2_int * var3];
                var5 = 0;
                if (param0 == -44) {
                  break L1;
                } else {
                  field_h = null;
                  break L1;
                }
              }
              var6 = (3 & param1.field_p) * var2_int + (param1.field_s & 3);
              var7 = 0;
              L2: while (true) {
                if (param1.field_x <= var7) {
                  param1.field_x = var3;
                  param1.field_u = var2_int;
                  param1.field_p = param1.field_p & -4;
                  param1.field_y = var4;
                  param1.field_s = param1.field_s & -4;
                  break L0;
                } else {
                  var8 = 0;
                  L3: while (true) {
                    if (param1.field_u <= var8) {
                      var6 = var6 + (var2_int + -param1.field_u);
                      var7++;
                      continue L2;
                    } else {
                      int incrementValue$2 = var6;
                      var6++;
                      int incrementValue$3 = var5;
                      var5++;
                      var4[incrementValue$2] = param1.field_y[incrementValue$3];
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
            stackOut_13_0 = (RuntimeException) var2;
            stackOut_13_1 = new StringBuilder().append("fd.G(").append(param0).append(44);
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param1 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L4;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L4;
            }
          }
          throw oj.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 41);
        }
    }

    final static void a(int param0) {
        bg.field_K.c(0, (ee) (Object) new ih());
    }

    final static boolean a(qk param0, int param1, qk param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        Object var5 = null;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        var4 = TorChallenge.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 > 49) {
                break L1;
              } else {
                var5 = null;
                fd.a((byte) -65, (ka) null);
                break L1;
              }
            }
            L2: {
              var3_int = param0.field_ob + -param2.field_ob;
              if (param0.field_mb == me.field_d) {
                var3_int -= 200;
                break L2;
              } else {
                if (null == param0.field_mb) {
                  var3_int += 200;
                  break L2;
                } else {
                  break L2;
                }
              }
            }
            L3: {
              if (me.field_d != param2.field_mb) {
                if (null == param2.field_mb) {
                  var3_int -= 200;
                  break L3;
                } else {
                  break L3;
                }
              } else {
                var3_int += 200;
                break L3;
              }
            }
            L4: {
              if (var3_int <= 0) {
                stackOut_15_0 = 0;
                stackIn_16_0 = stackOut_15_0;
                break L4;
              } else {
                stackOut_14_0 = 1;
                stackIn_16_0 = stackOut_14_0;
                break L4;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) var3;
            stackOut_17_1 = new StringBuilder().append("fd.A(");
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
              break L5;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L5;
            }
          }
          L6: {
            stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
            stackOut_20_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(44).append(param1).append(44);
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param2 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L6;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L6;
            }
          }
          throw oj.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + 41);
        }
        return stackIn_16_0 != 0;
    }

    final da a(int param0, long param1) {
        da var4 = null;
        da var5 = null;
        int var6 = 0;
        Object var7 = null;
        var6 = TorChallenge.field_F ? 1 : 0;
        var4 = ((fd) this).field_a[(int)(param1 & (long)(-1 + ((fd) this).field_d))];
        if (param0 > 72) {
          ((fd) this).field_b = var4.field_f;
          L0: while (true) {
            if (((fd) this).field_b != var4) {
              if (param1 != ((fd) this).field_b.field_d) {
                ((fd) this).field_b = ((fd) this).field_b.field_f;
                continue L0;
              } else {
                var5 = ((fd) this).field_b;
                ((fd) this).field_b = ((fd) this).field_b.field_f;
                return var5;
              }
            } else {
              ((fd) this).field_b = null;
              return null;
            }
          }
        } else {
          var7 = null;
          boolean discarded$1 = fd.a((qk) null, -124, (qk) null);
          ((fd) this).field_b = var4.field_f;
          L1: while (true) {
            if (((fd) this).field_b != var4) {
              if (param1 != ((fd) this).field_b.field_d) {
                ((fd) this).field_b = ((fd) this).field_b.field_f;
                continue L1;
              } else {
                var5 = ((fd) this).field_b;
                ((fd) this).field_b = ((fd) this).field_b.field_f;
                return var5;
              }
            } else {
              ((fd) this).field_b = null;
              return null;
            }
          }
        }
    }

    public final Iterator iterator() {
        return (Iterator) (Object) new md((fd) this);
    }

    final static void a(byte param0) {
        fe var1 = cj.field_h[9];
        int var2 = ab.field_g[9];
        var1.field_l = var1.field_k.length;
        pg.field_p = nc.a(var1, 100, var2);
        pg.field_p.e(-1);
        pg.field_p.e(0, var1.field_k.length);
        ok.field_a = we.a(pg.field_p, 6222);
    }

    private fd() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = 9;
    }
}
