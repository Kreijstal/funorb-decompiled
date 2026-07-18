/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qk {
    static pk field_e;
    static pk field_a;
    static int field_b;
    private tc field_d;
    static String field_g;
    static int field_i;
    static dj[] field_l;
    private ce field_c;
    static String field_k;
    static String field_f;
    private int field_h;
    private int field_j;

    public static void a(int param0) {
        field_k = null;
        field_l = null;
        field_e = null;
        if (param0 != 1) {
          qk.a(60);
          field_g = null;
          field_a = null;
          field_f = null;
          return;
        } else {
          field_g = null;
          field_a = null;
          field_f = null;
          return;
        }
    }

    final Object a(long param0, int param1) {
        Object var5 = null;
        be var6 = null;
        wc var7 = null;
        var7 = (wc) (Object) ((qk) this).field_c.a(param0, (byte) -21);
        if (var7 != null) {
          var5 = var7.d((byte) -125);
          if (var5 == null) {
            var7.b((byte) 12);
            var7.c((byte) 13);
            ((qk) this).field_h = ((qk) this).field_h + var7.field_q;
            return null;
          } else {
            if (param1 != -24469) {
              L0: {
                ((qk) this).field_h = -10;
                if (var7.d(123)) {
                  var6 = new be(var5, var7.field_q);
                  ((qk) this).field_c.a((uf) (Object) var6, (byte) -118, var7.field_g);
                  ((qk) this).field_d.a((vh) (Object) var6, (byte) 17);
                  ((wc) (Object) var6).field_m = 0L;
                  var7.b((byte) 12);
                  var7.c((byte) 13);
                  break L0;
                } else {
                  ((qk) this).field_d.a((vh) (Object) var7, (byte) -3);
                  var7.field_m = 0L;
                  break L0;
                }
              }
              return var5;
            } else {
              L1: {
                if (var7.d(123)) {
                  var6 = new be(var5, var7.field_q);
                  ((qk) this).field_c.a((uf) (Object) var6, (byte) -118, var7.field_g);
                  ((qk) this).field_d.a((vh) (Object) var6, (byte) 17);
                  ((wc) (Object) var6).field_m = 0L;
                  var7.b((byte) 12);
                  var7.c((byte) 13);
                  break L1;
                } else {
                  ((qk) this).field_d.a((vh) (Object) var7, (byte) -3);
                  var7.field_m = 0L;
                  break L1;
                }
              }
              return var5;
            }
          }
        } else {
          return null;
        }
    }

    final void a(byte param0, Object param1, long param2) {
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
              int discarded$6 = -107;
              int discarded$7 = 1;
              this.a(param1, param2);
              if (param0 == -3) {
                break L1;
              } else {
                Object discarded$8 = ((qk) this).a(19L, 96);
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
            stackOut_3_1 = new StringBuilder().append("qk.A(").append(param0).append(',');
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
          throw qk.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ',' + param2 + ')');
        }
    }

    private final void a(byte param0, long param1) {
        wc var4 = (wc) (Object) ((qk) this).field_c.a(param1, (byte) -21);
        int discarded$0 = 1;
        this.a(var4);
    }

    private final void a(wc param0) {
        RuntimeException var3 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
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
            if (param0 != null) {
              param0.b((byte) 12);
              param0.c((byte) 13);
              ((qk) this).field_h = ((qk) this).field_h + param0.field_q;
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("qk.E(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
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
          throw qk.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ',' + 1 + ')');
        }
    }

    final static el a(Throwable param0, String param1) {
        el var2 = null;
        if (param0 instanceof el) {
            var2 = (el) (Object) param0;
            var2.field_b = var2.field_b + ' ' + param1;
        } else {
            var2 = new el(param0, param1);
        }
        return var2;
    }

    private final void a(Object param0, long param1) {
        wc var6 = null;
        be var6_ref = null;
        int var7 = Terraphoenix.field_V;
        try {
            if (((qk) this).field_j < 1) {
                throw new IllegalStateException();
            }
            this.a((byte) -102, param1);
            ((qk) this).field_h = ((qk) this).field_h - 1;
            while (((qk) this).field_h < 0) {
                var6 = (wc) (Object) ((qk) this).field_d.c(0);
                int discarded$0 = 1;
                this.a(var6);
            }
            var6_ref = new be(param0, 1);
            ((qk) this).field_c.a((uf) (Object) var6_ref, (byte) -50, param1);
            ((qk) this).field_d.a((vh) (Object) var6_ref, (byte) 78);
            ((wc) (Object) var6_ref).field_m = 0L;
        } catch (RuntimeException runtimeException) {
            throw qk.a((Throwable) (Object) runtimeException, "qk.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + 1 + ',' + -107 + ')');
        }
    }

    private qk() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = -1;
        field_g = "Turret";
        field_f = "Connection timed out. Please try using a different server.";
        field_k = "Aim TQ: ";
    }
}
