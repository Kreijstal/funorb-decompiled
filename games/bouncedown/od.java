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
            if (param2) {
                ((od) this).field_a = -61;
            }
            ((od) this).field_b.a(-110, param1, (ai) (Object) var6_ref);
            ((od) this).field_e.a(6753, (ug) (Object) var6_ref);
            ((eg) (Object) var6_ref).field_j = 0L;
        } catch (RuntimeException runtimeException) {
            throw ii.a((Throwable) (Object) runtimeException, "od.D(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 44 + param3 + 41);
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
        Object var4 = null;
        eg var5 = null;
        var4 = null;
        if (param0 > -37) {
          od.a(-67);
          var5 = (eg) (Object) ((od) this).field_b.a((byte) 118, param1);
          this.a(0, var5);
          return;
        } else {
          var5 = (eg) (Object) ((od) this).field_b.a((byte) 118, param1);
          this.a(0, var5);
          return;
        }
    }

    final static void a(byte param0) {
        Object var2 = null;
        pk.a((String) null, eb.field_z, -98);
    }

    final void a(Object param0, long param1, int param2) {
        try {
            this.a(param0, param1, false, param2);
        } catch (RuntimeException runtimeException) {
            throw ii.a((Throwable) (Object) runtimeException, "od.C(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 41);
        }
    }

    private final void a(int param0, eg param1) {
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
              if (param0 == 0) {
                break L1;
              } else {
                od.a(68);
                break L1;
              }
            }
            if (param1 == null) {
              break L0;
            } else {
              param1.c(param0 + 2);
              param1.a(109);
              ((od) this).field_a = ((od) this).field_a + param1.field_m;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3;
            stackOut_5_1 = new StringBuilder().append("od.G(").append(param0).append(44);
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw ii.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 41);
        }
    }

    public static void a(int param0) {
        field_f = null;
        field_c = null;
        if (param0 != 0) {
            field_f = null;
        }
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
