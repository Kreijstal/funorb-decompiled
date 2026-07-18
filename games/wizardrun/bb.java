/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

class bb extends uh {
    static String field_g;
    private long field_m;
    static kl field_h;
    static String field_j;
    static int field_k;
    static String field_l;
    private String field_i;

    sd a(boolean param0) {
        if (!param0) {
            return null;
        }
        return ud.field_c;
    }

    public static void c(int param0) {
        field_g = null;
        field_j = null;
        field_l = null;
        field_h = null;
    }

    final static void a(int param0, int param1, byte param2, qj param3) {
        try {
            ii.field_c = 12;
            ic.field_c = 12;
            tl.field_c = param3;
        } catch (RuntimeException runtimeException) {
            throw bd.a((Throwable) (Object) runtimeException, "bb.G(" + 12 + ',' + 12 + ',' + -13 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final static void b(byte param0) {
        if (!oa.a(param0 ^ 25325)) {
            return;
        }
        le.a(false, 4, 15991);
        if (param0 != -100) {
            bb.b((byte) 126);
        }
    }

    final static String a(CharSequence param0, int param1, boolean param2) {
        String var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        String stackIn_4_0 = null;
        String stackIn_10_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_3_0 = null;
        String stackOut_9_0 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var5 = wizardrun.field_H;
        try {
          var3 = hg.a(param0, (byte) -118, false);
          if (var3 != null) {
            stackOut_3_0 = (String) var3;
            stackIn_4_0 = stackOut_3_0;
            return stackIn_4_0;
          } else {
            var4 = 0;
            L0: while (true) {
              if (param0.length() > var4) {
                if (df.a(param0.charAt(var4), true)) {
                  var4++;
                  continue L0;
                } else {
                  stackOut_9_0 = nk.field_Q;
                  stackIn_10_0 = stackOut_9_0;
                  return stackIn_10_0;
                }
              } else {
                return null;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var3_ref;
            stackOut_13_1 = new StringBuilder().append("bb.L(");
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L1;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L1;
            }
          }
          throw bd.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ',' + 0 + ',' + false + ')');
        }
    }

    final static void b(int param0) {
        ei var1 = (ei) (Object) lh.field_b.c(8192);
        if (!(var1 != null)) {
            throw new IllegalStateException();
        }
        ed.a(var1.field_q, var1.field_v, var1.field_o);
        ed.c(var1.field_r, var1.field_u, var1.field_s, var1.field_p);
        var1.field_q = null;
        qa.field_q.a((wl) (Object) var1, false);
    }

    final void a(int param0, va param1) {
        RuntimeException runtimeException = null;
        Object var4 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              param1.b(param0 + 1290648724, ((bb) this).field_m);
              param1.a(((bb) this).field_i, -66);
              if (param0 == 4) {
                break L1;
              } else {
                var4 = null;
                ((bb) this).a(-43, (va) null);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("bb.J(").append(param0).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw bd.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ')');
        }
    }

    bb(long param0, String param1) {
        try {
            ((bb) this).field_m = param0;
            ((bb) this).field_i = param1;
        } catch (RuntimeException runtimeException) {
            throw bd.a((Throwable) (Object) runtimeException, "bb.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = "STARPOWER";
        field_l = "Name";
    }
}
