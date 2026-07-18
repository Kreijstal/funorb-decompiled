/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gd {
    private bh field_e;
    static boolean field_g;
    private int field_f;
    private int field_c;
    static wd field_a;
    private ek field_b;
    static int field_d;

    final static int a(boolean param0) {
        return 1;
    }

    final void a(Object param0, int param1, long param2) {
        try {
            this.a((byte) 121, param0, param2, param1);
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) (Object) runtimeException, "gd.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final Object a(long param0, int param1) {
        int var5 = 0;
        Object var6 = null;
        ej var7 = null;
        mi var8 = null;
        var5 = -27 % ((param1 - -2) / 51);
        var8 = (mi) (Object) ((gd) this).field_b.a(param0, 1);
        if (var8 != null) {
          var6 = var8.d((byte) 100);
          if (var6 == null) {
            var8.b(4);
            var8.a(-6242);
            ((gd) this).field_f = ((gd) this).field_f + var8.field_p;
            return null;
          } else {
            L0: {
              if (var8.e(1)) {
                var7 = new ej(var6, var8.field_p);
                ((gd) this).field_b.a(var8.field_b, -1, (rf) (Object) var7);
                ((gd) this).field_e.a((uh) (Object) var7, 25184);
                ((mi) (Object) var7).field_j = 0L;
                var8.b(4);
                var8.a(-6242);
                break L0;
              } else {
                ((gd) this).field_e.a((uh) (Object) var8, 25184);
                var8.field_j = 0L;
                break L0;
              }
            }
            return var6;
          }
        } else {
          return null;
        }
    }

    final static void a(int param0) {
        try {
            Exception var1 = null;
            Throwable decompiledCaughtException = null;
            if (null != mf.field_c) {
              try {
                L0: {
                  mf.field_c.a(0L, 0);
                  mf.field_c.a(se.field_p.field_g, 24, false, se.field_p.field_f);
                  break L0;
                }
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var1 = (Exception) (Object) decompiledCaughtException;
                se.field_p.field_g = se.field_p.field_g + 24;
                return;
              }
              se.field_p.field_g = se.field_p.field_g + 24;
              return;
            } else {
              se.field_p.field_g = se.field_p.field_g + 24;
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void a(byte param0, Object param1, long param2, int param3) {
        mi var6 = null;
        ej var6_ref = null;
        int var7 = StarCannon.field_A;
        try {
            if (!(((gd) this).field_c >= param3)) {
                throw new IllegalStateException();
            }
            this.b(param2, -31649);
            ((gd) this).field_f = ((gd) this).field_f - param3;
            while (((gd) this).field_f < 0) {
                var6 = (mi) (Object) ((gd) this).field_e.b(-57);
                this.a((byte) 23, var6);
            }
            var6_ref = new ej(param1, param3);
            ((gd) this).field_b.a(param2, -1, (rf) (Object) var6_ref);
            ((gd) this).field_e.a((uh) (Object) var6_ref, 25184);
            ((mi) (Object) var6_ref).field_j = 0L;
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) (Object) runtimeException, "gd.F(" + 121 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    private gd() throws Throwable {
        throw new Error();
    }

    private final void b(long param0, int param1) {
        mi var4 = (mi) (Object) ((gd) this).field_b.a(param0, 1);
        this.a((byte) 23, var4);
    }

    private final void a(byte param0, mi param1) {
        RuntimeException var3 = null;
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
            if (param1 == null) {
              break L0;
            } else {
              param1.b(4);
              param1.a(-6242);
              ((gd) this).field_f = ((gd) this).field_f + param1.field_p;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) var3;
            stackOut_3_1 = new StringBuilder().append("gd.A(").append(23).append(',');
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
              break L1;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L1;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ')');
        }
    }

    public static void a(byte param0) {
        field_a = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = true;
    }
}
