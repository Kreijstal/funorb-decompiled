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
        int fieldTemp$1 = 0;
        wf var1;
        int var2;
        var2 = Transmogrify.field_A ? 1 : 0;
        if (this.field_b.field_d[this.field_c + -1] != this.field_d) {
          var1 = this.field_d;
          this.field_e = var1;
          this.field_d = var1.field_b;
          return var1;
        } else {
          L0: while (true) {
            if (this.field_b.field_c > this.field_c) {
              fieldTemp$1 = this.field_c;
              this.field_c = this.field_c + 1;
              var1 = this.field_b.field_d[fieldTemp$1].field_b;
              if (this.field_b.field_d[-1 + this.field_c] != var1) {
                this.field_d = var1.field_b;
                this.field_e = var1;
                return var1;
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
        int fieldTemp$2 = 0;
        int var2;
        var2 = Transmogrify.field_A ? 1 : 0;
        if (this.field_b.field_d[-1 + this.field_c] == this.field_d) {
          L0: while (true) {
            if (this.field_b.field_c <= this.field_c) {
              return false;
            } else {
              fieldTemp$2 = this.field_c;
              this.field_c = this.field_c + 1;
              if (this.field_b.field_d[fieldTemp$2].field_b != this.field_b.field_d[-1 + this.field_c]) {
                this.field_d = this.field_b.field_d[-1 + this.field_c].field_b;
                return true;
              } else {
                this.field_d = this.field_b.field_d[this.field_c + -1];
                continue L0;
              }
            }
          }
        } else {
          return true;
        }
    }

    private final void a(byte param0) {
        this.field_c = 1;
        if (param0 != -75) {
            return;
        }
        this.field_d = this.field_b.field_d[0].field_b;
        this.field_e = null;
    }

    final static sj a(j param0, int param1, nf param2, byte param3, char param4) {
        sj stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        sj var5 = null;
        RuntimeException var5_ref = null;
        sj var6 = null;
        nf var7 = null;
        try {
          L0: {
            L1: {
              if (param3 > 24) {
                break L1;
              } else {
                var7 = (nf) null;
                w.a((j) null, -111, (nf) null, (byte) -120, '￬');
                break L1;
              }
            }
            L2: {
              var5 = (sj) ((Object) ab.field_c.c(-126));
              if (var5 == null) {
                var5 = new sj();
                break L2;
              } else {
                break L2;
              }
            }
            ch.field_e.a(var5, -112);
            var5.field_i = param4;
            var5.field_n = param2;
            var5.field_v = param2.field_p[param4 & 255];
            var6 = var5;
            var5.field_l = 0;
            var5.field_p = param0.field_c;
            var5.field_g = param0.field_d + 32 * param1;
            var5.field_q = param0.field_c;
            var6.field_h = 0;
            var5.field_k = param0;
            var5.field_o = param0;
            var5.field_j = param1 * 32 + param0.field_d;
            var5.field_s = param1;
            var5.field_t = param1;
            stackIn_6_0 = (sj) (var5);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5_ref = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var5_ref);

            stackIn_9_1 = new StringBuilder().append("w.E(");

            if (param0 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_10_0), stackIn_13_2 + ',' + param3 + ',' + param4 + ')');
        }
        return stackIn_6_0;
    }

    public final void remove() {
        if (!(null != this.field_e)) {
            throw new IllegalStateException();
        }
        this.field_e.c(5);
        this.field_e = null;
    }

    final static sj a(byte param0, boolean param1) {
        Object var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        L0: {
          var6 = Transmogrify.field_A ? 1 : 0;
          if (!param1) {
            break L0;
          } else {
            field_a = (String) null;
            break L0;
          }
        }
        var2 = null;
        var3 = -1;
        var4 = -1;
        var5 = 0;
        L1: while (true) {
          if (12 <= var5) {
            var7 = 0;
            var5 = var7;
            L2: while (true) {
              if ((var7 ^ -1) <= -9) {
                if (var2 != null) {
                  return ((j) (var2)).field_e[var3];
                } else {
                  return null;
                }
              } else {
                if (si.field_i.field_e[var7] != null) {
                  if (param0 == si.field_i.field_e[var7].field_i) {
                    L3: {
                      if (si.field_i.field_e[var7].field_l > var4) {
                        var3 = var7;
                        var2 = si.field_i;
                        var4 = si.field_i.field_e[var7].field_l;
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    if (si.field_i.field_e[var7].field_x) {
                      var3 = var7;
                      var4 = 2147483647;
                      var2 = si.field_i;
                      var7++;
                      continue L2;
                    } else {
                      var7++;
                      continue L2;
                    }
                  } else {
                    var7++;
                    continue L2;
                  }
                } else {
                  var7++;
                  continue L2;
                }
              }
            }
          } else {
            if (null != wk.field_a.field_e[var5]) {
              if (wk.field_a.field_e[var5].field_i == param0) {
                L4: {
                  if (var4 < wk.field_a.field_e[var5].field_l) {
                    var3 = var5;
                    var2 = wk.field_a;
                    var4 = wk.field_a.field_e[var5].field_l;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                if (wk.field_a.field_e[var5].field_x) {
                  var3 = var5;
                  var4 = 2147483647;
                  var2 = wk.field_a;
                  var5++;
                  continue L1;
                } else {
                  var5++;
                  continue L1;
                }
              } else {
                var5++;
                continue L1;
              }
            } else {
              var5++;
              continue L1;
            }
          }
        }
    }

    final static boolean a(int param0, hj param1) {
        RuntimeException var2 = null;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
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
                stackIn_5_0 = 0;
                break L2;
              } else {
                stackIn_5_0 = 1;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var2);

            stackIn_8_1 = new StringBuilder().append("w.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L3;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L3;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
        return stackIn_5_0 != 0;
    }

    public static void b(byte param0) {
        field_a = null;
        if (param0 > -84) {
            field_a = (String) null;
        }
    }

    w(vi param0) {
        this.field_e = null;
        try {
            this.field_b = param0;
            this.a((byte) -75);
        } catch (RuntimeException runtimeException) {
            throw ch.a((Throwable) ((Object) runtimeException), "w.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
