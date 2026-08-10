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
        qc var7 = (qc) ((Object) this.field_f.a(param0, (byte) 27));
        if (var7 == null) {
            return null;
        }
        if (param1 < 36) {
            return (Object) null;
        }
        Object var5 = var7.a((byte) 121);
        if (!(var5 != null)) {
            var7.c(2);
            var7.a(-121);
            this.field_c = this.field_c + var7.field_C;
            return null;
        }
        if (!var7.i(0)) {
            this.field_e.a((byte) 118, var7);
            var7.field_n = 0L;
        } else {
            var6 = new oq(var5, var7.field_C);
            this.field_f.a(var7.field_k, var6, 120);
            this.field_e.a((byte) 102, var6);
            ((qc) ((Object) var6)).field_n = 0L;
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
                this.field_c = this.field_c + param0.field_C;
            }
            int var3_int = 4 % ((param1 - -12) / 48);
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) ((Object) runtimeException), "lo.F(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    private final void a(long param0, byte param1) {
        qc var4 = (qc) ((Object) this.field_f.a(param0, (byte) 32));
        int var5 = 56 % ((2 - param1) / 33);
        this.a(var4, 118);
    }

    public static void a(byte param0) {
        int var1 = -47 / ((param0 - -63) / 36);
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
            if (!(param1 <= this.field_h)) {
                throw new IllegalStateException();
            }
            this.a(param3, (byte) 126);
            this.field_c = this.field_c - param1;
            while (this.field_c < 0) {
                var9 = (qc) ((Object) this.field_e.a(param0 ^ -66));
                this.a(var9, 56);
            }
            if (param0 != 89) {
                Object var8 = (Object) null;
                this.a(101L, (Object) null, (byte) -113);
            }
            var6 = new oq(param2, param1);
            this.field_f.a(param3, var6, param0 ^ 32);
            this.field_e.a((byte) 35, var6);
            ((qc) ((Object) var6)).field_n = 0L;
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) ((Object) runtimeException), "lo.C(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final void a(long param0, Object param1, byte param2) {
        try {
            this.a((byte) 89, 1, param1, param0);
            if (param2 >= -25) {
                this.a((byte) 79, 30, (Object) null, 93L);
            }
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) ((Object) runtimeException), "lo.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static void a(int param0) {
        to.field_c = 0;
        if (param0 != 8537) {
            field_b = (String) null;
        }
    }

    lo(int param0) {
        this(param0, param0);
    }

    private lo(int param0, int param1) {
        int var3;
        this.field_e = new sr();
        this.field_c = param0;
        this.field_h = param0;
        var3 = 1;
        L0: while (true) {
          if (var3 + var3 < param0) {
            if (var3 < param1) {
              var3 = var3 + var3;
              continue L0;
            } else {
              this.field_f = new el(var3);
              return;
            }
          } else {
            this.field_f = new el(var3);
            return;
          }
        }
    }

    static {
        field_a = "You do not have a suitable number of players for the current options.";
        field_g = "On";
        field_b = "Loading music";
    }
}
