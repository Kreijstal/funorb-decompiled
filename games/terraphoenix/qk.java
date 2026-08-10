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
        Object var5;
        be var6;
        wc var7;
        var7 = (wc) ((Object) this.field_c.a(param0, (byte) -21));
        if (var7 != null) {
          var5 = var7.d((byte) -125);
          if (var5 == null) {
            var7.b((byte) 12);
            var7.c((byte) 13);
            this.field_h = this.field_h + var7.field_q;
            return null;
          } else {
            if (param1 != -24469) {
              L0: {
                this.field_h = -10;
                if (var7.d(123)) {
                  var6 = new be(var5, var7.field_q);
                  this.field_c.a(var6, (byte) -118, var7.field_g);
                  this.field_d.a(var6, (byte) 17);
                  ((wc) ((Object) var6)).field_m = 0L;
                  var7.b((byte) 12);
                  var7.c((byte) 13);
                  break L0;
                } else {
                  this.field_d.a(var7, (byte) -3);
                  var7.field_m = 0L;
                  break L0;
                }
              }
              return var5;
            } else {
              L1: {
                if (var7.d(123)) {
                  var6 = new be(var5, var7.field_q);
                  this.field_c.a(var6, (byte) -118, var7.field_g);
                  this.field_d.a(var6, (byte) 17);
                  ((wc) ((Object) var6)).field_m = 0L;
                  var7.b((byte) 12);
                  var7.c((byte) 13);
                  break L1;
                } else {
                  this.field_d.a(var7, (byte) -3);
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
        try {
            this.a(param1, param2, 1, (byte) -107);
            if (param0 != -3) {
                this.a(19L, 96);
            }
        } catch (RuntimeException runtimeException) {
            throw qk.a((Throwable) ((Object) runtimeException), "qk.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    private final void a(byte param0, long param1) {
        wc var4 = (wc) ((Object) this.field_c.a(param1, (byte) -21));
        this.a(var4, 1);
        if (param0 >= -54) {
            qk.a(-85);
            return;
        }
    }

    private final void a(wc param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == 1) {
                break L1;
              } else {
                field_g = (String) null;
                break L1;
              }
            }
            if (param0 != null) {
              param0.b((byte) 12);
              param0.c((byte) 13);
              this.field_h = this.field_h + param0.field_q;
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var3);

            stackIn_8_1 = new StringBuilder().append("qk.E(");

            if (param0 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L2;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L2;
            }
          }
          throw qk.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ')');
        }
    }

    final static el a(Throwable param0, String param1) {
        el var2 = null;
        if (param0 instanceof el) {
            var2 = (el) ((Object) param0);
            var2.field_b = var2.field_b + ' ' + param1;
        } else {
            var2 = new el(param0, param1);
        }
        return var2;
    }

    private final void a(Object param0, long param1, int param2, byte param3) {
        wc var6 = null;
        be var6_ref = null;
        int var7 = Terraphoenix.field_V;
        try {
            if (param3 >= -97) {
                this.field_c = (ce) null;
            }
            if (this.field_j < param2) {
                throw new IllegalStateException();
            }
            this.a((byte) -102, param1);
            this.field_h = this.field_h - param2;
            while (-1 < (this.field_h ^ -1)) {
                var6 = (wc) ((Object) this.field_d.c(0));
                this.a(var6, 1);
            }
            var6_ref = new be(param0, param2);
            this.field_c.a(var6_ref, (byte) -50, param1);
            this.field_d.a(var6_ref, (byte) 78);
            ((wc) ((Object) var6_ref)).field_m = 0L;
        } catch (RuntimeException runtimeException) {
            throw qk.a((Throwable) ((Object) runtimeException), "qk.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    private qk() throws Throwable {
        throw new Error();
    }

    static {
        field_b = -1;
        field_g = "Turret";
        field_f = "Connection timed out. Please try using a different server.";
        field_k = "Aim TQ: ";
    }
}
