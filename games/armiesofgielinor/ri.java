/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ri {
    private int field_f;
    private int field_a;
    static int[] field_c;
    static int field_d;
    private wg field_e;
    private m field_g;
    static ll field_b;

    final Object a(long param0, byte param1) {
        Object var5 = null;
        f var6 = null;
        uq var7 = null;
        var7 = (uq) (Object) ((ri) this).field_g.a(13497, param0);
        if (var7 != null) {
          var5 = var7.b(false);
          if (var5 != null) {
            if (param1 <= 121) {
              L0: {
                this.a(-102L, 20);
                if (var7.a(true)) {
                  var6 = new f(var5, var7.field_z);
                  ((ri) this).field_g.a((tc) (Object) var6, false, var7.field_i);
                  ((ri) this).field_e.a(-96, (ms) (Object) var6);
                  ((uq) (Object) var6).field_q = 0L;
                  var7.d(97);
                  var7.c((byte) -76);
                  break L0;
                } else {
                  ((ri) this).field_e.a(-96, (ms) (Object) var7);
                  var7.field_q = 0L;
                  break L0;
                }
              }
              return var5;
            } else {
              L1: {
                if (var7.a(true)) {
                  var6 = new f(var5, var7.field_z);
                  ((ri) this).field_g.a((tc) (Object) var6, false, var7.field_i);
                  ((ri) this).field_e.a(-96, (ms) (Object) var6);
                  ((uq) (Object) var6).field_q = 0L;
                  var7.d(97);
                  var7.c((byte) -76);
                  break L1;
                } else {
                  ((ri) this).field_e.a(-96, (ms) (Object) var7);
                  var7.field_q = 0L;
                  break L1;
                }
              }
              return var5;
            }
          } else {
            var7.d(123);
            var7.c((byte) -76);
            ((ri) this).field_a = ((ri) this).field_a + var7.field_z;
            return null;
          }
        } else {
          return null;
        }
    }

    private final void a(uq param0, int param1) {
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
            if (param0 == null) {
              break L0;
            } else {
              param0.d(-115);
              param0.c((byte) -76);
              ((ri) this).field_a = ((ri) this).field_a + param0.field_z;
              break L0;
            }
          }
          ((ri) this).field_g = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("ri.F(");
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
          throw ig.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + 0 + 41);
        }
    }

    private final void a(Object param0, byte param1, int param2, long param3) {
        uq var9 = null;
        f var7 = null;
        int var8 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
            if (!(((ri) this).field_f >= param2)) {
                throw new IllegalStateException();
            }
            this.a(param3, -75);
            ((ri) this).field_a = ((ri) this).field_a - param2;
            while (0 > ((ri) this).field_a) {
                var9 = (uq) (Object) ((ri) this).field_e.a(false);
                this.a(var9, 0);
            }
            int var6_int = 105 % ((4 - param1) / 34);
            var7 = new f(param0, param2);
            ((ri) this).field_g.a((tc) (Object) var7, false, param3);
            ((ri) this).field_e.a(-96, (ms) (Object) var7);
            ((uq) (Object) var7).field_q = 0L;
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) (Object) runtimeException, "ri.B(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
    }

    private final void a(long param0, int param1) {
        if (param1 > -64) {
            return;
        }
        uq var4 = (uq) (Object) ((ri) this).field_g.a(13497, param0);
        this.a(var4, 0);
    }

    final void a(Object param0, int param1, long param2) {
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
              this.a(param0, (byte) -46, 1, param2);
              if (param1 == 100) {
                break L1;
              } else {
                Object discarded$2 = ((ri) this).a(64L, (byte) 125);
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
            stackOut_3_1 = new StringBuilder().append("ri.D(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
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
          throw ig.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 44 + param1 + 44 + param2 + 41);
        }
    }

    public static void a(byte param0) {
        int var1 = 0;
        field_b = null;
        field_c = null;
    }

    ri(int param0) {
        this(param0, param0);
    }

    private ri(int param0, int param1) {
        int var3 = 0;
        ((ri) this).field_e = new wg();
        ((ri) this).field_a = param0;
        ((ri) this).field_f = param0;
        var3 = 1;
        L0: while (true) {
          if (param0 > var3 + var3) {
            if (param1 > var3) {
              var3 = var3 + var3;
              continue L0;
            } else {
              ((ri) this).field_g = new m(var3);
              return;
            }
          } else {
            ((ri) this).field_g = new m(var3);
            return;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new int[]{100, 100, 60, 80, 90, 90, 100, 100, 80, 70, 100, 100, 90, 100, 70, 90};
        field_d = 0;
    }
}
