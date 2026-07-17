/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class w implements Iterator {
    private wf field_d;
    static int field_f;
    static String field_a;
    private wf field_e;
    private int field_c;
    private vi field_b;

    public final Object next() {
        wf var1 = null;
        int var2 = 0;
        var2 = Transmogrify.field_A ? 1 : 0;
        if (((w) this).field_b.field_d[((w) this).field_c + -1] != ((w) this).field_d) {
          var1 = ((w) this).field_d;
          ((w) this).field_e = var1;
          ((w) this).field_d = var1.field_b;
          return (Object) (Object) var1;
        } else {
          L0: while (true) {
            if (((w) this).field_b.field_c > ((w) this).field_c) {
              int fieldTemp$2 = ((w) this).field_c;
              ((w) this).field_c = ((w) this).field_c + 1;
              var1 = ((w) this).field_b.field_d[fieldTemp$2].field_b;
              if (((w) this).field_b.field_d[-1 + ((w) this).field_c] != var1) {
                ((w) this).field_d = var1.field_b;
                ((w) this).field_e = var1;
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
        var2 = Transmogrify.field_A ? 1 : 0;
        if (((w) this).field_b.field_d[-1 + ((w) this).field_c] == ((w) this).field_d) {
          L0: while (true) {
            if (((w) this).field_b.field_c <= ((w) this).field_c) {
              return false;
            } else {
              int fieldTemp$8 = ((w) this).field_c;
              ((w) this).field_c = ((w) this).field_c + 1;
              if (((w) this).field_b.field_d[fieldTemp$8].field_b != ((w) this).field_b.field_d[-1 + ((w) this).field_c]) {
                ((w) this).field_d = ((w) this).field_b.field_d[-1 + ((w) this).field_c].field_b;
                return true;
              } else {
                ((w) this).field_d = ((w) this).field_b.field_d[((w) this).field_c + -1];
                continue L0;
              }
            }
          }
        } else {
          return true;
        }
    }

    private final void a(byte param0) {
        ((w) this).field_c = 1;
        ((w) this).field_d = ((w) this).field_b.field_d[0].field_b;
        ((w) this).field_e = null;
    }

    final static sj a(j param0, int param1, nf param2, byte param3, char param4) {
        RuntimeException var5 = null;
        sj var5_ref = null;
        sj var6 = null;
        Object var7 = null;
        sj stackIn_6_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        sj stackOut_5_0 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            L1: {
              if (param3 > 24) {
                break L1;
              } else {
                var7 = null;
                sj discarded$1 = w.a((j) null, -111, (nf) null, (byte) -120, '￬');
                break L1;
              }
            }
            L2: {
              var5_ref = (sj) (Object) ab.field_c.c(-126);
              if (var5_ref == null) {
                var5_ref = new sj();
                break L2;
              } else {
                break L2;
              }
            }
            ch.field_e.a((wf) (Object) var5_ref, -112);
            var5_ref.field_i = param4;
            var5_ref.field_n = param2;
            var5_ref.field_v = param2.field_p[param4 & 255];
            var6 = var5_ref;
            var5_ref.field_l = 0;
            var5_ref.field_p = param0.field_c;
            var5_ref.field_g = param0.field_d + 32 * param1;
            var5_ref.field_q = param0.field_c;
            var6.field_h = 0;
            var5_ref.field_k = param0;
            var5_ref.field_o = param0;
            var5_ref.field_j = param1 * 32 + param0.field_d;
            var5_ref.field_s = param1;
            var5_ref.field_t = param1;
            stackOut_5_0 = (sj) var5_ref;
            stackIn_6_0 = stackOut_5_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var5;
            stackOut_7_1 = new StringBuilder().append("w.E(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          L4: {
            stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(44).append(param1).append(44);
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param2 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          throw ch.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 44 + param3 + 44 + param4 + 41);
        }
        return stackIn_6_0;
    }

    public final void remove() {
        if (!(null != ((w) this).field_e)) {
            throw new IllegalStateException();
        }
        ((w) this).field_e.c(5);
        ((w) this).field_e = null;
    }

    final static sj a(byte param0, boolean param1) {
        Object var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var6 = Transmogrify.field_A ? 1 : 0;
        var2 = null;
        var3 = -1;
        var4 = -1;
        var5 = 0;
        L0: while (true) {
          if (12 <= var5) {
            var7 = 0;
            var5 = var7;
            L1: while (true) {
              if (var7 >= 8) {
                if (var2 != null) {
                  return ((j) var2).field_e[var3];
                } else {
                  return null;
                }
              } else {
                if (si.field_i.field_e[var7] != null) {
                  if (param0 == si.field_i.field_e[var7].field_i) {
                    L2: {
                      if (si.field_i.field_e[var7].field_l > var4) {
                        var3 = var7;
                        var2 = (Object) (Object) si.field_i;
                        var4 = si.field_i.field_e[var7].field_l;
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                    if (si.field_i.field_e[var7].field_x) {
                      var3 = var7;
                      var4 = 2147483647;
                      var2 = (Object) (Object) si.field_i;
                      var7++;
                      continue L1;
                    } else {
                      var7++;
                      continue L1;
                    }
                  } else {
                    var7++;
                    continue L1;
                  }
                } else {
                  var7++;
                  continue L1;
                }
              }
            }
          } else {
            if (null != wk.field_a.field_e[var5]) {
              if (wk.field_a.field_e[var5].field_i == param0) {
                L3: {
                  if (var4 < wk.field_a.field_e[var5].field_l) {
                    var3 = var5;
                    var2 = (Object) (Object) wk.field_a;
                    var4 = wk.field_a.field_e[var5].field_l;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                if (wk.field_a.field_e[var5].field_x) {
                  var3 = var5;
                  var4 = 2147483647;
                  var2 = (Object) (Object) wk.field_a;
                  var5++;
                  continue L0;
                } else {
                  var5++;
                  continue L0;
                }
              } else {
                var5++;
                continue L0;
              }
            } else {
              var5++;
              continue L0;
            }
          }
        }
    }

    final static boolean a(int param0, hj param1) {
        RuntimeException var2 = null;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
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
              if (param0 == -1) {
                break L1;
              } else {
                field_f = -99;
                break L1;
              }
            }
            L2: {
              if (param1.k(1, 1522829539) != 1) {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                break L2;
              } else {
                stackOut_3_0 = 1;
                stackIn_5_0 = stackOut_3_0;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var2;
            stackOut_6_1 = new StringBuilder().append("w.D(").append(param0).append(44);
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw ch.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 41);
        }
        return stackIn_5_0 != 0;
    }

    public static void b(byte param0) {
        field_a = null;
    }

    w(vi param0) {
        ((w) this).field_e = null;
        try {
            ((w) this).field_b = param0;
            this.a((byte) -75);
        } catch (RuntimeException runtimeException) {
            throw ch.a((Throwable) (Object) runtimeException, "w.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    static {
    }
}
