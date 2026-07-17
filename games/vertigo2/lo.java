/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lo {
    static String field_a;
    static pm field_k;
    static java.awt.Frame field_j;
    private int field_c;
    static String field_b;
    private el field_f;
    static int field_d;
    static String field_g;
    private sr field_e;
    static boolean field_i;
    private int field_h;

    final Object b(long param0, byte param1) {
        oq var6 = null;
        qc var7 = (qc) (Object) ((lo) this).field_f.a(param0, (byte) 27);
        if (var7 == null) {
            return null;
        }
        if (param1 < 36) {
            return null;
        }
        Object var5 = var7.a((byte) 121);
        if (!(var5 != null)) {
            var7.c(2);
            var7.a(-121);
            ((lo) this).field_c = ((lo) this).field_c + var7.field_C;
            return null;
        }
        if (!var7.i(0)) {
            ((lo) this).field_e.a((byte) 118, (gp) (Object) var7);
            var7.field_n = 0L;
        } else {
            var6 = new oq(var5, var7.field_C);
            ((lo) this).field_f.a(var7.field_k, (li) (Object) var6, 120);
            ((lo) this).field_e.a((byte) 102, (gp) (Object) var6);
            ((qc) (Object) var6).field_n = 0L;
            var7.c(2);
            var7.a(-122);
        }
        return var5;
    }

    private final void a(qc param0, int param1) {
        try {
            if (!(param0 == null)) {
                param0.c(2);
                param0.a(-115);
                ((lo) this).field_c = ((lo) this).field_c + param0.field_C;
            }
            int var3_int = 4 % ((param1 - -12) / 48);
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) (Object) runtimeException, "lo.F(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    private final void a(long param0) {
        qc var4 = (qc) (Object) ((lo) this).field_f.a(param0, (byte) 32);
        int var5 = 2;
        this.a(var4, 118);
    }

    public static void a() {
        int var1 = 47;
        field_j = null;
        field_a = null;
        field_g = null;
        field_k = null;
        field_b = null;
    }

    private final void a(byte param0, int param1, Object param2, long param3) {
        qc var9 = null;
        oq var6 = null;
        int var7 = Vertigo2.field_L ? 1 : 0;
        try {
            if (!(param1 <= ((lo) this).field_h)) {
                throw new IllegalStateException();
            }
            int discarded$0 = 126;
            this.a(param3);
            ((lo) this).field_c = ((lo) this).field_c - param1;
            while (((lo) this).field_c < 0) {
                var9 = (qc) (Object) ((lo) this).field_e.a(param0 ^ -66);
                this.a(var9, 56);
            }
            if (param0 != 89) {
                Object var8 = null;
                ((lo) this).a(101L, (Object) null, (byte) -113);
            }
            var6 = new oq(param2, param1);
            ((lo) this).field_f.a(param3, (li) (Object) var6, param0 ^ 32);
            ((lo) this).field_e.a((byte) 35, (gp) (Object) var6);
            ((qc) (Object) var6).field_n = 0L;
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) (Object) runtimeException, "lo.C(" + param0 + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 44 + param3 + 41);
        }
    }

    final void a(long param0, Object param1, byte param2) {
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
              this.a((byte) 89, 1, param1, param0);
              if (param2 < -25) {
                break L1;
              } else {
                this.a((byte) 79, 30, (Object) null, 93L);
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
            stackOut_3_1 = new StringBuilder().append("lo.A(").append(param0).append(44);
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
          throw wn.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 44 + param2 + 41);
        }
    }

    final static void a(int param0) {
        to.field_c = 0;
    }

    lo(int param0) {
        this(param0, param0);
    }

    private lo(int param0, int param1) {
        int var3 = 0;
        ((lo) this).field_e = new sr();
        ((lo) this).field_c = param0;
        ((lo) this).field_h = param0;
        var3 = 1;
        L0: while (true) {
          if (var3 + var3 < param0) {
            if (var3 < param1) {
              var3 = var3 + var3;
              continue L0;
            } else {
              ((lo) this).field_f = new el(var3);
              return;
            }
          } else {
            ((lo) this).field_f = new el(var3);
            return;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "You do not have a suitable number of players for the current options.";
        field_g = "On";
        field_b = "Loading music";
    }
}
