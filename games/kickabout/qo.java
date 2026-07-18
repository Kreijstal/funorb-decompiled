/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.lang.String;

final class qo extends jd {
    static hu field_k;
    static eg[] field_l;
    static String field_j;

    final static tf d() {
        tf var1 = new tf();
        var1.a((gn) (Object) new hm("sumIntegers", new Class[1], (String) null), 3);
        var1.a((gn) (Object) new kb("writeIntegers", new Class[1], (String) null), 3);
        var1.a((gn) (Object) new jo("demoIntegers", new Class[0], (String) null), 3);
        var1.a((gn) (Object) new jf("doSomething", new Class[1], "Do something clever to a string to annoy TdR."), 3);
        var1.a((gn) (Object) new ir("three", new Class[0], (String) null), 3);
        var1.a((gn) (Object) new pb("isSix", new Class[1], (String) null), 3);
        var1.a((gn) (Object) new tq("not", new Class[1], (String) null), 3);
        var1.a((gn) (Object) new ik("intDouble", new Class[1], (String) null), 3);
        var1.a((gn) (Object) new uc("intTriple", new Class[1], (String) null), 3);
        var1.a((gn) (Object) new ev("LongPlusOne", new Class[1], "Returns a long value. Useful for testing the auto-casts."), 3);
        var1.a((gn) (Object) new el("BytePlusOne", new Class[1], "Returns a byte. Should lose precision."), 3);
        var1.a((gn) (Object) new ls("big", new Class[0], (String) null), 3);
        var1.a((gn) (Object) new uj("set_lag", new Class[1], (String) null), 3);
        var1.a((gn) (Object) new lh("broadcast_server", new Class[1], "Send a broadcast to ALL players in games and the lobby. Only for emergencies, it's filtered too incase someone tries to swear."), 3);
        return var1;
    }

    final rv a(String param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        rv stackIn_7_0 = null;
        rv stackIn_9_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        rv stackOut_8_0 = null;
        rv stackOut_6_0 = null;
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
              if (null != gf.a(64, param0)) {
                stackOut_2_0 = 0;
                stackIn_3_0 = stackOut_2_0;
                break L1;
              } else {
                stackOut_1_0 = 1;
                stackIn_3_0 = stackOut_1_0;
                break L1;
              }
            }
            L2: {
              var3_int = stackIn_3_0;
              if (param1 == -5) {
                break L2;
              } else {
                boolean discarded$2 = qo.c((byte) -62);
                break L2;
              }
            }
            if (var3_int != 0) {
              stackOut_8_0 = he.field_yb;
              stackIn_9_0 = stackOut_8_0;
              break L0;
            } else {
              stackOut_6_0 = jt.field_Bb;
              stackIn_7_0 = stackOut_6_0;
              return stackIn_7_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var3;
            stackOut_10_1 = new StringBuilder().append("qo.E(");
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ',' + param1 + ')');
        }
        return stackIn_9_0;
    }

    final static int a(int param0, long param1, long param2) {
        if (param0 != -8905) {
            int discarded$0 = qo.e((byte) 58);
        }
        return (int)(param1 * param2 >> 16);
    }

    final static ot g(int param0) {
        int var2_int = 0;
        int var3 = 0;
        int var4 = Kickabout.field_G;
        ut var6 = new ut(108, 108);
        iw.a(-110, var6);
        on.d(54, 54, 51, 204);
        for (var2_int = 43; var2_int > 0; var2_int--) {
            var3 = 119 * var2_int / 43 + 34;
            on.d(54, 54, var2_int, var3);
        }
        if (param0 != -22976) {
            ot discarded$0 = qo.g(126);
        }
        ta.e(param0 ^ -22987);
        ot var2 = new ot(54, 54);
        iw.a(param0 ^ -23017, (ut) (Object) var2);
        var6.f(0, 0);
        ta.e(125);
        int var5 = 0;
        var3 = var5;
        while (var5 < var2.field_y.length) {
            var2.field_y[var5] = hf.a(var2.field_y[var5] << 24, 16777215);
            var5++;
        }
        return var2;
    }

    final String a(byte param0, String param1) {
        RuntimeException var3 = null;
        String stackIn_2_0 = null;
        String stackIn_6_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_5_0 = null;
        String stackOut_1_0 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            if (((qo) this).a(param1, param0 ^ -30) != jt.field_Bb) {
              L1: {
                if (param0 == 25) {
                  break L1;
                } else {
                  field_j = null;
                  break L1;
                }
              }
              stackOut_5_0 = dl.field_g;
              stackIn_6_0 = stackOut_5_0;
              break L0;
            } else {
              stackOut_1_0 = tk.field_Cb;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var3;
            stackOut_7_1 = new StringBuilder().append("qo.A(").append(param0).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ')');
        }
        return stackIn_6_0;
    }

    public static void f() {
        field_k = null;
        field_l = null;
        field_j = null;
    }

    final static boolean a(boolean param0, byte param1) {
        try {
            ml var2_ref_ml = null;
            if (!(wt.field_A != null)) {
                wt.field_A = vl.field_c.a(true, uc.field_E, rl.field_o);
            }
            if (wt.field_A.field_a == 0) {
                return false;
            }
            long dupTemp$0 = nj.a(-100);
            mp.field_i = dupTemp$0;
            ci.field_c = dupTemp$0;
            if (1 != wt.field_A.field_a) {
                un.field_c = cp.field_h;
            } else {
                {
                    op.field_y = new bh((java.net.Socket) wt.field_A.field_b, vl.field_c);
                    or.field_d.field_n = 0;
                    var2_ref_ml = un.field_e;
                    un.field_c = sd.field_d;
                    var2_ref_ml.field_n = 0;
                    dj.field_A = param0 ? -2 : -1;
                    wb.field_n = param0 ? -2 : -1;
                    kq.field_Ab = param0 ? -2 : -1;
                    dh.a(fp.field_g, il.field_g, (iw) (Object) or.field_d, -3210, s.field_E);
                    int discarded$1 = 0;
                    c.a(-1);
                }
            }
            wt.field_A = null;
            int var2 = -53 / ((-57 - param1) / 43);
            return true;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    qo(ga param0) {
        super(param0);
    }

    final static boolean c(byte param0) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        if (param0 == -42) {
          L0: {
            L1: {
              if (null == oo.field_c) {
                break L1;
              } else {
                if (!oo.field_c.field_l) {
                  break L1;
                } else {
                  stackOut_4_0 = 1;
                  stackIn_6_0 = stackOut_4_0;
                  break L0;
                }
              }
            }
            stackOut_5_0 = 0;
            stackIn_6_0 = stackOut_5_0;
            break L0;
          }
          return stackIn_6_0 != 0;
        } else {
          return true;
        }
    }

    final static int e(byte param0) {
        if (param0 != 18) {
            field_j = null;
        }
        return fr.field_G;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = new eg[9];
        field_j = "You have been removed from <%0>'s game.";
    }
}
