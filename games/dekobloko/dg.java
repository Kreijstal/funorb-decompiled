/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class dg implements Iterator {
    static vj field_e;
    private be field_g;
    static ck[][] field_d;
    private uh field_a;
    private be field_f;
    static mi field_c;
    static int field_b;

    public final Object next() {
        be var1 = ((dg) this).field_f;
        if (((dg) this).field_a.field_a != var1) {
            ((dg) this).field_f = var1.field_p;
        } else {
            var1 = null;
            ((dg) this).field_f = null;
        }
        ((dg) this).field_g = var1;
        return (Object) (Object) var1;
    }

    public final void remove() {
        if (!(((dg) this).field_g != null)) {
            throw new IllegalStateException();
        }
        ((dg) this).field_g.e((byte) 81);
        ((dg) this).field_g = null;
    }

    public static void a(int param0) {
        field_e = null;
        field_d = null;
        field_c = null;
    }

    final static void a(int param0, w param1, w param2) {
        RuntimeException var3 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        try {
          L0: {
            L1: {
              if (param2.field_M != null) {
                break L1;
              } else {
                param2.field_M = new vj();
                break L1;
              }
            }
            L2: {
              if (null != param1.field_M) {
                break L2;
              } else {
                param1.field_M = new vj();
                break L2;
              }
            }
            L3: {
              if (null != mc.field_a) {
                break L3;
              } else {
                mc.field_a = new nk(64);
                break L3;
              }
            }
            L4: {
              if (null != hg.field_e) {
                uf.field_z = param1.field_M;
                break L4;
              } else {
                hg.field_e = new nk(64);
                uf.field_z = param1.field_M;
                break L4;
              }
            }
            qi.field_S = param2.field_M;
            d.a(true);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var3;
            stackOut_12_1 = new StringBuilder().append("dg.A(").append(21014).append(',');
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
              break L5;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L5;
            }
          }
          L6: {
            stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
            stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',');
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param2 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L6;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L6;
            }
          }
          throw dh.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + ')');
        }
    }

    final static void a(int param0, int param1) {
        RuntimeException var2 = null;
        int var3 = 0;
        kn var4 = null;
        kc var5 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = client.field_A ? 1 : 0;
        try {
          L0: {
            var4 = (kn) (Object) pb.field_c.c((byte) -80);
            L1: while (true) {
              if (var4 == null) {
                var5 = (kc) (Object) field_e.c((byte) -121);
                L2: while (true) {
                  if (var5 == null) {
                    break L0;
                  } else {
                    wb.a(var5, 3, 60);
                    var5 = (kc) (Object) field_e.d(true);
                    continue L2;
                  }
                }
              } else {
                fm.a((byte) -125, 3, var4);
                var4 = (kn) (Object) pb.field_c.d(true);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw dh.a((Throwable) (Object) var2, "dg.C(" + -111 + ',' + 3 + ')');
        }
    }

    public final boolean hasNext() {
        return ((dg) this).field_f != ((dg) this).field_a.field_a;
    }

    final static boolean b(int param0) {
        return rg.a(se.h(25144), (byte) -78);
    }

    dg(uh param0) {
        ((dg) this).field_g = null;
        try {
            ((dg) this).field_a = param0;
            ((dg) this).field_f = ((dg) this).field_a.field_a.field_p;
            ((dg) this).field_g = null;
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) (Object) runtimeException, "dg.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new ck[8][];
        field_e = new vj();
    }
}
