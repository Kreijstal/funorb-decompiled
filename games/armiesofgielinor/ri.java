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
        var7 = (uq) ((Object) this.field_g.a(13497, param0));
        if (var7 != null) {
          var5 = var7.b(false);
          if (var5 != null) {
            L0: {
              if (param1 > 121) {
                break L0;
              } else {
                this.a(-102L, 20);
                break L0;
              }
            }
            if (!var7.a(true)) {
              this.field_e.a(-96, var7);
              var7.field_q = 0L;
              if (!ArmiesOfGielinor.field_M) {
                return var5;
              } else {
                var6 = new f(var5, var7.field_z);
                this.field_g.a(var6, false, var7.field_i);
                this.field_e.a(-96, var6);
                ((uq) ((Object) var6)).field_q = 0L;
                var7.d(97);
                var7.c((byte) -76);
                return var5;
              }
            } else {
              var6 = new f(var5, var7.field_z);
              this.field_g.a(var6, false, var7.field_i);
              this.field_e.a(-96, var6);
              ((uq) ((Object) var6)).field_q = 0L;
              var7.d(97);
              var7.c((byte) -76);
              return var5;
            }
          } else {
            var7.d(123);
            var7.c((byte) -76);
            this.field_a = this.field_a + var7.field_z;
            return null;
          }
        } else {
          return null;
        }
    }

    private final void a(uq param0, int param1) {
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
              if (param0 == null) {
                break L1;
              } else {
                param0.d(param1 ^ -115);
                param0.c((byte) -76);
                this.field_a = this.field_a + param0.field_z;
                break L1;
              }
            }
            if (param1 == 0) {
              break L0;
            } else {
              this.field_g = (m) null;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var3);
            stackOut_5_1 = new StringBuilder().append("ri.F(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
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
          throw ig.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ')');
        }
    }

    private final void a(Object param0, byte param1, int param2, long param3) {
        RuntimeException runtimeException = null;
        int var6_int = 0;
        f var7 = null;
        int var8 = 0;
        uq var9 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        var8 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            if (this.field_f < param2) {
              throw new IllegalStateException();
            } else {
              this.a(param3, -75);
              this.field_a = this.field_a - param2;
              L1: while (true) {
                L2: {
                  if (0 <= this.field_a) {
                    break L2;
                  } else {
                    var9 = (uq) ((Object) this.field_e.a(false));
                    this.a(var9, 0);
                    if (var8 == 0) {
                      continue L1;
                    } else {
                      break L2;
                    }
                  }
                }
                var6_int = 105 % ((4 - param1) / 34);
                var7 = new f(param0, param2);
                this.field_g.a(var7, false, param3);
                this.field_e.a(-96, var7);
                ((uq) ((Object) var7)).field_q = 0L;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            runtimeException = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) (runtimeException);
            stackOut_9_1 = new StringBuilder().append("ri.B(");
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final void a(long param0, int param1) {
        if (param1 > -64) {
            return;
        }
        uq var4 = (uq) ((Object) this.field_g.a(13497, param0));
        this.a(var4, 0);
    }

    final void a(Object param0, int param1, long param2) {
        Object discarded$2 = null;
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
                discarded$2 = this.a(64L, (byte) 125);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) (runtimeException);
            stackOut_3_1 = new StringBuilder().append("ri.D(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    public static void a(byte param0) {
        int var1 = -24 % ((14 - param0) / 59);
        field_b = null;
        field_c = null;
    }

    ri(int param0) {
        this(param0, param0);
    }

    private ri(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        this.field_e = new wg();
        this.field_a = param0;
        this.field_f = param0;
        var3 = 1;
        L0: while (true) {
          L1: {
            if (param0 <= var3 + var3) {
              break L1;
            } else {
              if (param1 <= var3) {
                break L1;
              } else {
                var3 = var3 + var3;
                if (var4 == 0) {
                  continue L0;
                } else {
                  break L1;
                }
              }
            }
          }
          this.field_g = new m(var3);
          return;
        }
    }

    static {
        field_c = new int[]{100, 100, 60, 80, 90, 90, 100, 100, 80, 70, 100, 100, 90, 100, 70, 90};
        field_d = 0;
    }
}
