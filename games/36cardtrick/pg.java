/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class pg {
    private va field_g;
    private int field_d;
    static Random field_a;
    private ed field_c;
    private int field_e;
    static String field_f;
    static String field_b;

    final static void a(boolean param0, int param1) {
        RuntimeException var2 = null;
        int var3 = 0;
        ad var4 = null;
        uh var5 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = Main.field_T;
        try {
          L0: {
            L1: {
              if (param0) {
                break L1;
              } else {
                pg.a(false, 127);
                break L1;
              }
            }
            var4 = (ad) (Object) od.field_b.a((byte) 74);
            L2: while (true) {
              if (var4 == null) {
                var5 = (uh) (Object) tl.field_a.a((byte) 74);
                L3: while (true) {
                  if (var5 == null) {
                    break L0;
                  } else {
                    ei.a(-64, var5, param1);
                    var5 = (uh) (Object) tl.field_a.b((byte) -113);
                    continue L3;
                  }
                }
              } else {
                aa.a(var4, 3298, param1);
                var4 = (ad) (Object) od.field_b.b((byte) -103);
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ma.a((Throwable) (Object) var2, "pg.C(" + param0 + ',' + param1 + ')');
        }
    }

    final void a(int param0, Object param1, long param2) {
        RuntimeException runtimeException = null;
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
              this.a(param2, 1, 10, param1);
              if (param0 > 118) {
                break L1;
              } else {
                field_a = null;
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
            stackOut_3_1 = new StringBuilder().append("pg.E(").append(param0).append(',');
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
          throw ma.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ',' + param2 + ')');
        }
    }

    public static void a(byte param0) {
        field_f = null;
        if (param0 != -85) {
            pg.a((byte) -89);
            field_b = null;
            field_a = null;
            return;
        }
        field_b = null;
        field_a = null;
    }

    private final void a(long param0, int param1, int param2, Object param3) {
        pd var6 = null;
        tf var6_ref = null;
        int var7 = Main.field_T;
        try {
            if (!(((pg) this).field_d >= 1)) {
                throw new IllegalStateException();
            }
            this.a(param0, (byte) 124);
            ((pg) this).field_e = ((pg) this).field_e - 1;
            while (((pg) this).field_e < 0) {
                var6 = (pd) (Object) ((pg) this).field_g.a(false);
                this.a((byte) 107, var6);
            }
            var6_ref = new tf(param3, 1);
            ((pg) this).field_c.a(-102, param0, (qb) (Object) var6_ref);
            ((pg) this).field_g.a(-102, (he) (Object) var6_ref);
            ((pd) (Object) var6_ref).field_j = 0L;
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) (Object) runtimeException, "pg.H(" + param0 + ',' + 1 + ',' + 10 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    private final void a(byte param0, pd param1) {
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
              param1.c(109);
              param1.d(12);
              ((pg) this).field_e = ((pg) this).field_e + param1.field_k;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) var3;
            stackOut_3_1 = new StringBuilder().append("pg.D(").append(107).append(',');
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
          throw ma.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ')');
        }
    }

    final static boolean a(boolean param0, CharSequence param1) {
        RuntimeException var2 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_2_0 = false;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            stackOut_2_0 = te.a(10, 117, param1, true);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var2;
            stackOut_4_1 = new StringBuilder().append("pg.F(").append(false).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L1;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    final Object a(long param0, int param1) {
        pd var4 = null;
        Object var5 = null;
        tf var6 = null;
        var4 = (pd) (Object) ((pg) this).field_c.a((byte) 120, param0);
        if (var4 != null) {
          var5 = var4.e(param1);
          if (var5 == null) {
            var4.c(100);
            var4.d(12);
            ((pg) this).field_e = ((pg) this).field_e + var4.field_k;
            return null;
          } else {
            if (var4.f(param1)) {
              var6 = new tf(var5, var4.field_k);
              ((pg) this).field_c.a(-96, var4.field_e, (qb) (Object) var6);
              ((pg) this).field_g.a(-82, (he) (Object) var6);
              ((pd) (Object) var6).field_j = 0L;
              var4.c(105);
              var4.d(12);
              return var5;
            } else {
              ((pg) this).field_g.a(-91, (he) (Object) var4);
              var4.field_j = 0L;
              return var5;
            }
          }
        } else {
          return null;
        }
    }

    private pg() throws Throwable {
        throw new Error();
    }

    private final void a(long param0, byte param1) {
        pd var4 = (pd) (Object) ((pg) this).field_c.a((byte) 83, param0);
        this.a((byte) 107, var4);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new Random();
        field_f = "Quit to website";
        field_b = "Fullscreen";
    }
}
