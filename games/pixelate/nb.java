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
        lm var1 = ((nb) this).field_f;
        if (var1 == ((nb) this).field_d.field_a) {
            ((nb) this).field_f = null;
            var1 = null;
        } else {
            ((nb) this).field_f = var1.field_p;
        }
        ((nb) this).field_e = var1;
        return (Object) (Object) var1;
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
                Object var5 = null;
                nb.a(-44, 85, 83, (sb) null);
            }
            nl.field_c = param3;
            ao.field_d = param0;
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "nb.A(" + param0 + 44 + param1 + 44 + param2 + 44 + (param3 != null ? "{...}" : "null") + 41);
        }
    }

    public final boolean hasNext() {
        return ((nb) this).field_d.field_a != ((nb) this).field_f;
    }

    public final void remove() {
        if (((nb) this).field_e == null) {
            throw new IllegalStateException();
        }
        ((nb) this).field_e.e(17);
        ((nb) this).field_e = null;
    }

    final static void a(int param0, tf[] param1, byte param2) {
        RuntimeException var3 = null;
        String var4 = null;
        int var5 = 0;
        tf[] var6 = null;
        tf[] var7 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        var5 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            if (null != kb.field_L) {
              break L0;
            } else {
              kb.field_L = rk.field_e;
              break L0;
            }
          }
          var6 = new tf[]{param1[0], param1[1]};
          var7 = var6;
          var4 = wc.field_m[param0];
          if (param0 != 0) {
            if (1 != param0) {
              if (param0 != 2) {
                if (param0 == 3) {
                  rj.field_C[param0] = (jj) (Object) new lk(var4, var7);
                  return;
                } else {
                  if (param0 != 4) {
                    if (param0 == 5) {
                      rj.field_C[param0] = (jj) (Object) new da(var4, var7);
                      return;
                    } else {
                      if (param0 != 6) {
                        if (param0 == 7) {
                          rj.field_C[param0] = (jj) (Object) new wc(var4, var7);
                          return;
                        } else {
                          return;
                        }
                      } else {
                        rj.field_C[param0] = (jj) (Object) new bm(var4, var7);
                        return;
                      }
                    }
                  } else {
                    rj.field_C[param0] = (jj) (Object) new se(var4, var7);
                    return;
                  }
                }
              } else {
                rj.field_C[param0] = (jj) (Object) new ci(var4, var7);
                return;
              }
            } else {
              rj.field_C[param0] = (jj) (Object) new qi(var4, var7);
              return;
            }
          } else {
            rj.field_C[param0] = (jj) (Object) new ql(var4, var6);
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) var3;
            stackOut_21_1 = new StringBuilder().append("nb.B(").append(param0).append(44);
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param1 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L1;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L1;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_24_0, stackIn_24_2 + 44 + -53 + 41);
        }
    }

    nb(pg param0) {
        ((nb) this).field_e = null;
        try {
            ((nb) this).field_d = param0;
            ((nb) this).field_f = ((nb) this).field_d.field_a.field_p;
            ((nb) this).field_e = null;
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "nb.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "You can spectate this game";
        field_b = "Connection lost - attempting to reconnect";
    }
}
