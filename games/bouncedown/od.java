/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class od {
    private m field_b;
    private int field_a;
    static String field_c;
    private int field_d;
    static ie field_f;
    private wh field_e;

    private final void a(Object param0, long param1, boolean param2, int param3) {
        eg var6 = null;
        t var6_ref = null;
        int var7 = Bounce.field_N;
        try {
            if (param3 > ((od) this).field_d) {
                throw new IllegalStateException();
            }
            this.a(-101, param1);
            ((od) this).field_a = ((od) this).field_a - param3;
            while (((od) this).field_a < 0) {
                var6 = (eg) (Object) ((od) this).field_e.a(14);
                this.a(0, var6);
            }
            var6_ref = new t(param0, param3);
            ((od) this).field_b.a(-110, param1, (ai) (Object) var6_ref);
            ((od) this).field_e.a(6753, (ug) (Object) var6_ref);
            ((eg) (Object) var6_ref).field_j = 0L;
        } catch (RuntimeException runtimeException) {
            throw ii.a((Throwable) (Object) runtimeException, "od.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + false + ',' + param3 + ')');
        }
    }

    final Object a(long param0, int param1) {
        Object var5 = null;
        t var6 = null;
        eg var7 = null;
        var7 = (eg) (Object) ((od) this).field_b.a((byte) -35, param0);
        if (var7 != null) {
          var5 = var7.e(-103);
          if (var5 != null) {
            if (param1 != 1872) {
              L0: {
                ((od) this).field_a = -101;
                if (var7.c((byte) -125)) {
                  var6 = new t(var5, var7.field_m);
                  ((od) this).field_b.a(param1 ^ -1828, var7.field_d, (ai) (Object) var6);
                  ((od) this).field_e.a(6753, (ug) (Object) var6);
                  ((eg) (Object) var6).field_j = 0L;
                  var7.c(param1 + -1870);
                  var7.a(89);
                  break L0;
                } else {
                  ((od) this).field_e.a(6753, (ug) (Object) var7);
                  var7.field_j = 0L;
                  break L0;
                }
              }
              return var5;
            } else {
              L1: {
                if (var7.c((byte) -125)) {
                  var6 = new t(var5, var7.field_m);
                  ((od) this).field_b.a(param1 ^ -1828, var7.field_d, (ai) (Object) var6);
                  ((od) this).field_e.a(6753, (ug) (Object) var6);
                  ((eg) (Object) var6).field_j = 0L;
                  var7.c(param1 + -1870);
                  var7.a(89);
                  break L1;
                } else {
                  ((od) this).field_e.a(6753, (ug) (Object) var7);
                  var7.field_j = 0L;
                  break L1;
                }
              }
              return var5;
            }
          } else {
            var7.c(2);
            var7.a(-122);
            ((od) this).field_a = ((od) this).field_a + var7.field_m;
            return null;
          }
        } else {
          return null;
        }
    }

    private final void a(int param0, long param1) {
        eg var4 = (eg) (Object) ((od) this).field_b.a((byte) 118, param1);
        this.a(0, var4);
    }

    final static void a() {
        Object var2 = null;
        pk.a((String) null, eb.field_z, -98);
    }

    final void a(Object param0, long param1, int param2) {
        try {
            this.a(param0, param1, false, param2);
        } catch (RuntimeException runtimeException) {
            throw ii.a((Throwable) (Object) runtimeException, "od.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void a(int param0, eg param1) {
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
              param1.c(2);
              param1.a(109);
              ((od) this).field_a = ((od) this).field_a + param1.field_m;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) var3;
            stackOut_3_1 = new StringBuilder().append("od.G(").append(0).append(',');
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
          throw ii.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ')');
        }
    }

    public static void a(int param0) {
        field_f = null;
        field_c = null;
    }

    private od() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Prev";
    }
}
