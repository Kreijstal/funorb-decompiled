/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class nb implements Iterator {
    static String field_a;
    private lm field_e;
    static int[] field_c;
    private pg field_d;
    private lm field_f;
    static String field_b;

    public final Object next() {
        lm var1 = this.field_f;
        if (var1 == this.field_d.field_a) {
            this.field_f = null;
            var1 = null;
        } else {
            this.field_f = var1.field_p;
        }
        this.field_e = var1;
        return var1;
    }

    public static void a(int param0) {
        field_a = null;
        field_c = null;
        field_b = null;
        int var1 = 121 / ((-48 - param0) / 51);
    }

    final static void a(int param0, int param1, int param2, sb param3) {
        try {
            v.field_d = param1;
            if (param2 != 7) {
                sb var5 = (sb) null;
                nb.a(-44, 85, 83, (sb) null);
            }
            nl.field_c = param3;
            ao.field_d = param0;
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "nb.A(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    public final boolean hasNext() {
        return this.field_d.field_a != this.field_f;
    }

    public final void remove() {
        if (this.field_e == null) {
            throw new IllegalStateException();
        }
        this.field_e.e(17);
        this.field_e = null;
    }

    final static void a(int param0, tf[] param1, byte param2) {
        RuntimeException var3 = null;
        String var4 = null;
        int var5 = 0;
        tf[] var6 = null;
        tf[] var7 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        var5 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            if (param2 == -53) {
              break L0;
            } else {
              field_b = (String) null;
              break L0;
            }
          }
          L1: {
            if (null != kb.field_L) {
              break L1;
            } else {
              kb.field_L = rk.field_e;
              break L1;
            }
          }
          var6 = new tf[]{param1[0], param1[1]};
          var7 = var6;
          var4 = wc.field_m[param0];
          if (-1 != (param0 ^ -1)) {
            if (1 != param0) {
              if (-3 != (param0 ^ -1)) {
                if (-4 == (param0 ^ -1)) {
                  rj.field_C[param0] = (jj) ((Object) new lk(var4, var7));
                  return;
                } else {
                  if ((param0 ^ -1) != -5) {
                    if (param0 == 5) {
                      rj.field_C[param0] = (jj) ((Object) new da(var4, var7));
                      return;
                    } else {
                      if ((param0 ^ -1) != -7) {
                        if (param0 == 7) {
                          rj.field_C[param0] = (jj) ((Object) new wc(var4, var7));
                          return;
                        } else {
                          return;
                        }
                      } else {
                        rj.field_C[param0] = (jj) ((Object) new bm(var4, var7));
                        return;
                      }
                    }
                  } else {
                    rj.field_C[param0] = (jj) ((Object) new se(var4, var7));
                    return;
                  }
                }
              } else {
                rj.field_C[param0] = (jj) ((Object) new ci(var4, var7));
                return;
              }
            } else {
              rj.field_C[param0] = (jj) ((Object) new qi(var4, var7));
              return;
            }
          } else {
            rj.field_C[param0] = (jj) ((Object) new ql(var4, var6));
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) (var3);
            stackOut_23_1 = new StringBuilder().append("nb.B(").append(param0).append(',');
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param1 == null) {
              stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackOut_25_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L2;
            } else {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L2;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_26_0), stackIn_26_2 + ',' + param2 + ')');
        }
    }

    nb(pg param0) {
        this.field_e = null;
        try {
            this.field_d = param0;
            this.field_f = this.field_d.field_a.field_p;
            this.field_e = null;
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "nb.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_a = "You can spectate this game";
        field_b = "Connection lost - attempting to reconnect";
    }
}
