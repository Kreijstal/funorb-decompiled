/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class al {
    static int[] field_d;
    static String field_f;
    static int[] field_e;
    private lj field_h;
    static String field_c;
    private vl field_a;
    private int field_b;
    private int field_g;

    final static int a(double param0, byte param1) {
        int var3 = 109 % ((-50 - param1) / 50);
        return (int)(0.5 + param0);
    }

    private final void a(d param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              if (param0 != null) {
                param0.f(0);
                param0.h(0);
                this.field_g = this.field_g + param0.field_t;
                break L1;
              } else {
                break L1;
              }
            }
            if (param1 > 51) {
              break L0;
            } else {
              this.field_h = (lj) null;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) (var3);
            stackOut_6_1 = new StringBuilder().append("al.C(");
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          throw rb.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ')');
        }
    }

    public static void a(byte param0) {
        field_c = null;
        field_d = null;
        field_e = null;
        field_f = null;
        if (param0 != 20) {
            al.a((byte) -68);
        }
    }

    final void a(long param0, Object param1, byte param2) {
        int discarded$0 = 0;
        try {
            if (param2 != 116) {
                discarded$0 = al.a(0.6495872916691957, (byte) 34);
            }
            this.a(1, param0, param1, true);
        } catch (RuntimeException runtimeException) {
            throw rb.a((Throwable) ((Object) runtimeException), "al.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    private final void a(int param0, long param1, Object param2, boolean param3) {
        d var6 = null;
        en var6_ref = null;
        int var7 = Torquing.field_u;
        try {
            if (this.field_b < param0) {
                throw new IllegalStateException();
            }
            this.a(param1, 18998);
            if (!param3) {
                al.a((byte) 76);
            }
            this.field_g = this.field_g - param0;
            while (0 > this.field_g) {
                var6 = (d) ((Object) this.field_h.a(4));
                this.a(var6, 111);
            }
            var6_ref = new en(param2, param0);
            this.field_a.a(param1, (byte) 92, var6_ref);
            this.field_h.a(var6_ref, (byte) -60);
            ((d) ((Object) var6_ref)).field_l = 0L;
        } catch (RuntimeException runtimeException) {
            throw rb.a((Throwable) ((Object) runtimeException), "al.A(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    private final void a(long param0, int param1) {
        Object discarded$2 = null;
        d var4 = null;
        var4 = (d) ((Object) this.field_a.a(param0, param1 + -19110));
        this.a(var4, 111);
        if (param1 != 18998) {
          discarded$2 = this.a(30, 43L);
          return;
        } else {
          return;
        }
    }

    final Object a(int param0, long param1) {
        Object var5 = null;
        en var6 = null;
        d var7 = null;
        var7 = (d) ((Object) this.field_a.a(param1, 115));
        if (param0 <= -122) {
          if (var7 != null) {
            var5 = var7.b(12);
            if (var5 == null) {
              var7.f(0);
              var7.h(0);
              this.field_g = this.field_g + var7.field_t;
              return null;
            } else {
              if (var7.c((byte) 37)) {
                var6 = new en(var5, var7.field_t);
                this.field_a.a(var7.field_f, (byte) 75, var6);
                this.field_h.a(var6, (byte) -66);
                ((d) ((Object) var6)).field_l = 0L;
                var7.f(0);
                var7.h(0);
                return var5;
              } else {
                this.field_h.a(var7, (byte) -48);
                var7.field_l = 0L;
                return var5;
              }
            }
          } else {
            return null;
          }
        } else {
          return (Object) null;
        }
    }

    private al() throws Throwable {
        throw new Error();
    }

    static {
        field_f = "Secret achievement";
        field_d = new int[4];
        field_e = new int[32];
        int[] var0 = field_e;
        field_e[7] = 31;
        var0[0] = 31;
        field_c = "Exit fullscreen mode and quit";
    }
}
