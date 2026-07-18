/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;
import java.lang.String;

final class mj {
    private int[] field_a;
    static String field_i;
    private ma field_f;
    static int field_b;
    static pf field_c;
    static int field_j;
    private int field_d;
    static int field_k;
    static String field_g;
    static String field_h;
    static String field_e;

    final void a(byte param0) {
        ((mj) this).field_f.c(2);
        if (param0 != -8) {
            field_i = null;
        }
    }

    final void b(int param0) {
        ((mj) this).field_f.a(12804, false);
        int fieldTemp$2 = ((mj) this).field_d;
        ((mj) this).field_d = ((mj) this).field_d + 1;
        if (fieldTemp$2 == 60) {
          ((mj) this).field_a[0] = ok.a(ea.field_b, -100, 300) + 300;
          ((mj) this).field_a[1] = 0;
          if (param0 != 300) {
            mj.c(43);
            return;
          } else {
            return;
          }
        } else {
          if (120 < ((mj) this).field_d) {
            ((mj) this).field_a[0] = 0;
            ((mj) this).field_a[1] = 300 - -ok.a(ea.field_b, bn.a(param0, -327), 300);
            ((mj) this).field_d = 0;
            if (param0 == 300) {
              return;
            } else {
              mj.c(43);
              return;
            }
          } else {
            if (param0 == 300) {
              return;
            } else {
              mj.c(43);
              return;
            }
          }
        }
    }

    public static void a(int param0) {
        field_e = null;
        field_c = null;
        field_g = null;
        field_h = null;
        if (param0 != 21651) {
          mj.c(-11);
          field_i = null;
          return;
        } else {
          field_i = null;
          return;
        }
    }

    final static void a(int param0, sb param1, int param2, int param3, int param4, sb param5) {
        try {
            uo.field_m = param1;
            uf.field_a = param2;
            lf.field_b = param4;
            wg.field_d = param5;
            if (param3 != 300) {
                Object var7 = null;
                mj.a(-68, (sb) null, -42, 67, -94, (sb) null);
            }
            ki.field_e = param0;
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "mj.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    final static String a(int param0, int param1) {
        return param1 - -1 + "/" + ln.field_m.length;
    }

    final static String a(int param0, String param1, int param2) {
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        pc var6 = null;
        CharSequence var7 = null;
        String stackIn_3_0 = null;
        String stackIn_6_0 = null;
        String stackIn_9_0 = null;
        String stackIn_13_0 = null;
        String stackIn_17_0 = null;
        String stackIn_20_0 = null;
        Object stackIn_22_0 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_2_0 = null;
        String stackOut_12_0 = null;
        String stackOut_16_0 = null;
        Object stackOut_21_0 = null;
        String stackOut_19_0 = null;
        String stackOut_8_0 = null;
        String stackOut_5_0 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        try {
          L0: {
            var7 = (CharSequence) (Object) param1;
            if (!ai.a((byte) -128, var7)) {
              stackOut_2_0 = qn.field_n;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            } else {
              if (!sm.a(param1, -1)) {
                if (gk.field_db == 2) {
                  if (i.a(-640, param1)) {
                    stackOut_12_0 = sd.a(cf.field_H, 45, new String[1]);
                    stackIn_13_0 = stackOut_12_0;
                    return stackIn_13_0;
                  } else {
                    if (aj.field_t >= 100) {
                      stackOut_16_0 = co.field_k;
                      stackIn_17_0 = stackOut_16_0;
                      return stackIn_17_0;
                    } else {
                      int discarded$1 = 37;
                      if (!ha.a(param1)) {
                        var6 = aa.field_f;
                        var6.g(param2, 15514);
                        var6.field_m = var6.field_m + 1;
                        var4 = var6.field_m;
                        var6.e(160, 2);
                        var6.b((byte) -41, param1);
                        var6.f(var6.field_m + -var4, -1);
                        var5 = 55 / ((param0 - 16) / 45);
                        stackOut_21_0 = null;
                        stackIn_22_0 = stackOut_21_0;
                        break L0;
                      } else {
                        stackOut_19_0 = sd.a(jp.field_b, 89, new String[1]);
                        stackIn_20_0 = stackOut_19_0;
                        return stackIn_20_0;
                      }
                    }
                  }
                } else {
                  stackOut_8_0 = le.field_d;
                  stackIn_9_0 = stackOut_8_0;
                  return stackIn_9_0;
                }
              } else {
                stackOut_5_0 = wd.field_h;
                stackIn_6_0 = stackOut_5_0;
                return stackIn_6_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) var3;
            stackOut_23_1 = new StringBuilder().append("mj.E(").append(param0).append(',');
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param1 == null) {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L1;
            } else {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L1;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_26_0, stackIn_26_2 + ',' + param2 + ')');
        }
        return (String) (Object) stackIn_22_0;
    }

    public mj() {
        ((mj) this).field_a = new int[2];
        ((mj) this).field_a[0] = 0;
        ((mj) this).field_a[1] = 0;
        ((mj) this).field_f = new ma(((mj) this).field_a, false, 500, 330);
        ((mj) this).field_f.a(196608, -115);
    }

    final static void c(int param0) {
        ph.field_l.c((ng) (Object) new jh(), -115);
        if (param0 != 24496) {
            Object var2 = null;
            String discarded$0 = mj.a(-69, (String) null, 1);
        }
    }

    final static void a() {
        un.field_l = false;
        if (null != bo.field_h) {
          L0: {
            bo.field_h.l(17872);
            if (0 != ce.field_d) {
              nd.a((byte) -124);
              break L0;
            } else {
              break L0;
            }
          }
          di.field_a = 0;
          return;
        } else {
          L1: {
            if (0 != ce.field_d) {
              nd.a((byte) -124);
              break L1;
            } else {
              break L1;
            }
          }
          di.field_a = 0;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = "Discard";
        field_h = "Create a free account to start using this feature";
        field_g = "Please wait while we search.<br>Games usually start within a minute, provided the server is busy enough.<br><br>The longer you are forced to wait, the earlier in the list of players you are likely to appear.<br><br>If the game doesn't start, click 'Cancel' and then try choosing 'Don't mind' for more options or switching to a busier lobby.";
        field_c = new pf(1);
        field_e = "Music: ";
    }
}
