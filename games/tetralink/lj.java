/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class lj implements Iterator {
    private mc field_d;
    private mc field_f;
    private ea field_e;
    static int[] field_a;
    static ah field_c;
    private int field_g;
    static int[] field_b;

    final static id a(int param0, bc param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        id var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        id stackIn_23_0 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        id stackOut_22_0 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        var8 = TetraLink.field_J;
        try {
          L0: {
            var2_int = param1.e(8, (byte) -112);
            if (var2_int > 0) {
              throw new IllegalStateException("" + var2_int);
            } else {
              L1: {
                var3 = bc.a(91, param1) ? 1 : 0;
                var4 = bc.a(77, param1) ? 1 : 0;
                var5 = new id();
                var5.field_q = (short)param1.e(16, (byte) -112);
                var5.field_D = cc.a(var5.field_D, param1, 16, 0);
                var5.field_i = cc.a(var5.field_i, param1, 16, 0);
                var5.field_R = cc.a(var5.field_R, param1, 16, 0);
                var5.field_s = (short)param1.e(16, (byte) -112);
                var5.field_K = cc.a(var5.field_K, param1, 16, 0);
                var5.field_I = cc.a(var5.field_I, param1, 16, 0);
                var5.field_e = cc.a(var5.field_e, param1, 16, 0);
                if (var3 != 0) {
                  var5.field_O = (short)param1.e(16, (byte) -112);
                  var5.field_l = cc.a(var5.field_l, param1, 16, 0);
                  var5.field_d = cc.a(var5.field_d, param1, 16, 0);
                  var5.field_y = cc.a(var5.field_y, param1, 16, 0);
                  var5.field_t = cc.a(var5.field_t, param1, 16, 0);
                  var5.field_b = cc.a(var5.field_b, param1, 16, 0);
                  var5.field_N = cc.a(var5.field_N, param1, 16, 0);
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                if (var4 == 0) {
                  break L2;
                } else {
                  int discarded$1 = param1.e(16, (byte) -112);
                  var5.field_k = cc.a(var5.field_k, param1, 16, 0);
                  var5.field_p = cc.a(var5.field_p, param1, 16, 0);
                  var5.field_A = cc.a(var5.field_A, param1, 16, 0);
                  var5.field_o = cc.a(var5.field_o, param1, 16, 0);
                  var5.field_g = cc.a(var5.field_g, param1, 16, 0);
                  break L2;
                }
              }
              L3: {
                if (bc.a(126, param1)) {
                  var5.field_v = cc.a(var5.field_v, param1, 16, 0);
                  break L3;
                } else {
                  break L3;
                }
              }
              L4: {
                if (bc.a(64, param1)) {
                  var5.field_u = fi.a(16, var5.field_u, param1, (byte) 119);
                  var6 = 0;
                  var7 = 0;
                  L5: while (true) {
                    if (var7 >= var5.field_u.length) {
                      if (0 != var6) {
                        var5.field_Q = (byte)(1 + var6);
                        break L4;
                      } else {
                        var5.field_u = null;
                        break L4;
                      }
                    } else {
                      L6: {
                        if ((var5.field_u[var7] & 255) <= var6) {
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                      var7++;
                      continue L5;
                    }
                  }
                } else {
                  break L4;
                }
              }
              stackOut_22_0 = (id) var5;
              stackIn_23_0 = stackOut_22_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var2 = decompiledCaughtException;
            stackOut_24_0 = (RuntimeException) var2;
            stackOut_24_1 = new StringBuilder().append("lj.A(").append(-16483).append(',');
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param1 == null) {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L7;
            } else {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L7;
            }
          }
          throw oi.a((Throwable) (Object) stackIn_27_0, stackIn_27_2 + ')');
        }
        return stackIn_23_0;
    }

    public final Object next() {
        mc var1 = null;
        int var2 = 0;
        var2 = TetraLink.field_J;
        if (((lj) this).field_e.field_d[-1 + ((lj) this).field_g] != ((lj) this).field_f) {
          var1 = ((lj) this).field_f;
          ((lj) this).field_f = var1.field_j;
          ((lj) this).field_d = var1;
          return (Object) (Object) var1;
        } else {
          L0: while (true) {
            if (((lj) this).field_g < ((lj) this).field_e.field_i) {
              int fieldTemp$2 = ((lj) this).field_g;
              ((lj) this).field_g = ((lj) this).field_g + 1;
              var1 = ((lj) this).field_e.field_d[fieldTemp$2].field_j;
              if (((lj) this).field_e.field_d[((lj) this).field_g - 1] != var1) {
                ((lj) this).field_f = var1.field_j;
                ((lj) this).field_d = var1;
                return (Object) (Object) var1;
              } else {
                continue L0;
              }
            } else {
              return null;
            }
          }
        }
    }

    public final boolean hasNext() {
        int var2 = 0;
        var2 = TetraLink.field_J;
        if (((lj) this).field_e.field_d[((lj) this).field_g + -1] != ((lj) this).field_f) {
          return true;
        } else {
          L0: while (true) {
            if (((lj) this).field_e.field_i <= ((lj) this).field_g) {
              return false;
            } else {
              int fieldTemp$8 = ((lj) this).field_g;
              ((lj) this).field_g = ((lj) this).field_g + 1;
              if (((lj) this).field_e.field_d[fieldTemp$8].field_j != ((lj) this).field_e.field_d[-1 + ((lj) this).field_g]) {
                ((lj) this).field_f = ((lj) this).field_e.field_d[((lj) this).field_g + -1].field_j;
                return true;
              } else {
                ((lj) this).field_f = ((lj) this).field_e.field_d[-1 + ((lj) this).field_g];
                continue L0;
              }
            }
          }
        }
    }

    public static void b(byte param0) {
        field_b = null;
        field_c = null;
        field_a = null;
    }

    private final void a(int param0) {
        ((lj) this).field_f = ((lj) this).field_e.field_d[0].field_j;
        ((lj) this).field_g = 1;
        ((lj) this).field_d = null;
    }

    public final void remove() {
        if (null == ((lj) this).field_d) {
            throw new IllegalStateException();
        }
        ((lj) this).field_d.b(false);
        ((lj) this).field_d = null;
    }

    final static void a(byte param0) {
        int var1 = (cf.field_n - 640) / 2;
        int var2 = ma.field_f * ma.field_f;
        int var3 = -(qd.field_ab * qd.field_ab) + var2;
        if (param0 >= -21) {
            Object var4 = null;
            rm[] discarded$0 = lj.a((bc) null, -52);
        }
        hn.field_P.a((byte) -92, 199, 90, -120 + ra.field_e + -94, var1 - var3 * 199 / var2);
        qe.field_c.a((byte) -124, 438, 0, -4 + ra.field_e - 120, 438 * var3 / var2 + (202 + var1));
    }

    final static rm[] a(bc param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        rm[] var4 = null;
        int var5 = 0;
        int var6_int = 0;
        rm var6 = null;
        int var7 = 0;
        Object stackIn_3_0 = null;
        rm[] stackIn_11_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        rm[] stackOut_10_0 = null;
        Object stackOut_2_0 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var7 = TetraLink.field_J;
        try {
          L0: {
            var2_int = param0.e(8, (byte) -112);
            if (param1 >= var2_int) {
              var3 = param0.e(12, (byte) -112);
              var4 = new rm[var3];
              var5 = 0;
              L1: while (true) {
                if (var3 <= var5) {
                  stackOut_10_0 = (rm[]) var4;
                  stackIn_11_0 = stackOut_10_0;
                  break L0;
                } else {
                  L2: {
                    if (bc.a(100, param0)) {
                      var6 = new rm();
                      int discarded$12 = param0.e(24, (byte) -112);
                      int discarded$13 = param0.e(24, (byte) -112);
                      var6.field_j = param0.e(24, (byte) -112);
                      int discarded$14 = param0.e(9, (byte) -112);
                      int discarded$15 = param0.e(12, (byte) -112);
                      int discarded$16 = param0.e(12, (byte) -112);
                      int discarded$17 = param0.e(12, (byte) -112);
                      var4[var5] = var6;
                      break L2;
                    } else {
                      var6_int = param0.e(rn.a((byte) -127, -1 + var5), (byte) -112);
                      var4[var5] = var4[var6_int];
                      break L2;
                    }
                  }
                  var5++;
                  continue L1;
                }
              }
            } else {
              stackOut_2_0 = null;
              stackIn_3_0 = stackOut_2_0;
              return (rm[]) (Object) stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var2;
            stackOut_12_1 = new StringBuilder().append("lj.C(");
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L3;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L3;
            }
          }
          throw oi.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ',' + param1 + ')');
        }
        return stackIn_11_0;
    }

    lj(ea param0) {
        ((lj) this).field_d = null;
        try {
            ((lj) this).field_e = param0;
            this.a(-1);
        } catch (RuntimeException runtimeException) {
            throw oi.a((Throwable) (Object) runtimeException, "lj.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new int[4];
        field_b = new int[8192];
    }
}
