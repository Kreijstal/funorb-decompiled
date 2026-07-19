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
        if (!param0) {
            return 73;
        }
        return 1;
    }

    final void a(Object param0, int param1, long param2) {
        try {
            this.a((byte) 121, param0, param2, param1);
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) ((Object) runtimeException), "gd.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final Object a(long param0, int param1) {
        int var5 = 0;
        Object var6 = null;
        ej var7 = null;
        mi var8 = null;
        var5 = -27 % ((param1 - -2) / 51);
        var8 = (mi) ((Object) this.field_b.a(param0, 1));
        if (var8 != null) {
          var6 = var8.d((byte) 100);
          if (var6 == null) {
            var8.b(4);
            var8.a(-6242);
            this.field_f = this.field_f + var8.field_p;
            return null;
          } else {
            L0: {
              if (var8.e(1)) {
                var7 = new ej(var6, var8.field_p);
                this.field_b.a(var8.field_b, -1, var7);
                this.field_e.a(var7, 25184);
                ((mi) ((Object) var7)).field_j = 0L;
                var8.b(4);
                var8.a(-6242);
                break L0;
              } else {
                this.field_e.a(var8, 25184);
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
                se.field_p.field_g = se.field_p.field_g + param0;
                return;
              }
              se.field_p.field_g = se.field_p.field_g + param0;
              return;
            } else {
              se.field_p.field_g = se.field_p.field_g + param0;
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
            if (!(this.field_c >= param3)) {
                throw new IllegalStateException();
            }
            this.b(param2, -31649);
            if (param0 < 113) {
                this.field_c = 73;
            }
            this.field_f = this.field_f - param3;
            while (this.field_f < 0) {
                var6 = (mi) ((Object) this.field_e.b(-57));
                this.a((byte) 23, var6);
            }
            var6_ref = new ej(param1, param3);
            this.field_b.a(param2, -1, var6_ref);
            this.field_e.a(var6_ref, 25184);
            ((mi) ((Object) var6_ref)).field_j = 0L;
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) ((Object) runtimeException), "gd.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    private gd() throws Throwable {
        throw new Error();
    }

    private final void b(long param0, int param1) {
        int discarded$2 = 0;
        mi var4 = null;
        var4 = (mi) ((Object) this.field_b.a(param0, 1));
        if (param1 != -31649) {
          discarded$2 = gd.a(false);
          this.a((byte) 23, var4);
          return;
        } else {
          this.a((byte) 23, var4);
          return;
        }
    }

    private final void a(byte param0, mi param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == 23) {
                break L1;
              } else {
                this.a((byte) 101, (Object) null, -29L, -99);
                break L1;
              }
            }
            if (param1 == null) {
              break L0;
            } else {
              param1.b(param0 + -19);
              param1.a(-6242);
              this.field_f = this.field_f + param1.field_p;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var3);
            stackOut_5_1 = new StringBuilder().append("gd.A(").append(param0).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
    }

    public static void a(byte param0) {
        field_a = null;
        if (param0 <= 82) {
            gd.a(87);
        }
    }

    static {
        field_g = true;
    }
}
