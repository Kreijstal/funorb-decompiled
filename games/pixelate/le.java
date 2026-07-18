/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class le {
    static int field_j;
    private int field_f;
    static ak field_h;
    private pg field_g;
    static int[] field_b;
    static String field_d;
    static String field_i;
    private kl field_e;
    static int field_c;
    private int field_a;

    private final void a(Object param0, boolean param1, long param2, int param3) {
        ah var6 = null;
        tj var6_ref = null;
        int var7 = Pixelate.field_H ? 1 : 0;
        if (!(((le) this).field_a >= 1)) {
            throw new IllegalStateException();
        }
        this.a(param2, (byte) 11);
        try {
            ((le) this).field_f = ((le) this).field_f - 1;
            while (((le) this).field_f < 0) {
                var6 = (ah) (Object) ((le) this).field_g.a(113);
                this.a(var6, -26133);
            }
            var6_ref = new tj(param0, 1);
            ((le) this).field_e.a((fa) (Object) var6_ref, param2, -1);
            ((le) this).field_g.a((byte) 99, (lm) (Object) var6_ref);
            ((ah) (Object) var6_ref).field_q = 0L;
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "le.A(" + (param0 != null ? "{...}" : "null") + ',' + true + ',' + param2 + ',' + 1 + ')');
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
              this.a(param1, true, param0, 1);
              if (param2 > 75) {
                break L1;
              } else {
                le.a(false);
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
            stackOut_3_1 = new StringBuilder().append("le.H(").append(param0).append(',');
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
          throw aa.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ',' + param2 + ')');
        }
    }

    final static void a(boolean param0) {
        jd.field_r = 0;
        if (!param0) {
            le.a(-100);
        }
    }

    private final void a(long param0, byte param1) {
        ah var4 = (ah) (Object) ((le) this).field_e.a(1, param0);
        this.a(var4, -26133);
    }

    final Object a(long param0, int param1) {
        Object var5 = null;
        tj var6 = null;
        ah var7 = null;
        var7 = (ah) (Object) ((le) this).field_e.a(param1 ^ 1, param0);
        if (var7 != null) {
          var5 = var7.a((byte) -55);
          if (param1 == 0) {
            if (var5 == null) {
              var7.c(2779);
              var7.e(17);
              ((le) this).field_f = ((le) this).field_f + var7.field_t;
              return null;
            } else {
              L0: {
                if (var7.b(true)) {
                  var6 = new tj(var5, var7.field_t);
                  ((le) this).field_e.a((fa) (Object) var6, var7.field_e, -1);
                  ((le) this).field_g.a((byte) 83, (lm) (Object) var6);
                  ((ah) (Object) var6).field_q = 0L;
                  var7.c(2779);
                  var7.e(param1 ^ 17);
                  break L0;
                } else {
                  ((le) this).field_g.a((byte) 91, (lm) (Object) var7);
                  var7.field_q = 0L;
                  break L0;
                }
              }
              return var5;
            }
          } else {
            le.a(107);
            if (var5 == null) {
              var7.c(2779);
              var7.e(17);
              ((le) this).field_f = ((le) this).field_f + var7.field_t;
              return null;
            } else {
              L1: {
                if (var7.b(true)) {
                  var6 = new tj(var5, var7.field_t);
                  ((le) this).field_e.a((fa) (Object) var6, var7.field_e, -1);
                  ((le) this).field_g.a((byte) 83, (lm) (Object) var6);
                  ((ah) (Object) var6).field_q = 0L;
                  var7.c(2779);
                  var7.e(param1 ^ 17);
                  break L1;
                } else {
                  ((le) this).field_g.a((byte) 91, (lm) (Object) var7);
                  var7.field_q = 0L;
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

    private final void a(ah param0, int param1) {
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
              param0.c(2779);
              param0.e(17);
              ((le) this).field_f = ((le) this).field_f + param0.field_t;
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
            stackOut_4_1 = new StringBuilder().append("le.B(");
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
          throw aa.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ',' + -26133 + ')');
        }
    }

    final static int a(CharSequence param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        var6 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            var2_int = param0.length();
            var3 = 0;
            var4 = 0;
            var5 = -16 / ((-26 - param1) / 59);
            L1: while (true) {
              if (var2_int <= var4) {
                stackOut_4_0 = var3;
                stackIn_5_0 = stackOut_4_0;
                break L0;
              } else {
                var3 = (var3 << 5) + -var3 - -pf.a((byte) -118, param0.charAt(var4));
                var4++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var2;
            stackOut_6_1 = new StringBuilder().append("le.C(");
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ',' + param1 + ')');
        }
        return stackIn_5_0;
    }

    public static void a(int param0) {
        field_h = null;
        field_b = null;
        if (param0 != 1) {
          field_d = null;
          field_i = null;
          field_d = null;
          return;
        } else {
          field_i = null;
          field_d = null;
          return;
        }
    }

    le(int param0) {
        this(param0, param0);
    }

    private le(int param0, int param1) {
        int var3 = 0;
        ((le) this).field_g = new pg();
        ((le) this).field_f = param0;
        ((le) this).field_a = param0;
        var3 = 1;
        L0: while (true) {
          if (param0 > var3 + var3) {
            if (param1 > var3) {
              var3 = var3 + var3;
              continue L0;
            } else {
              ((le) this).field_e = new kl(var3);
              return;
            }
          } else {
            ((le) this).field_e = new kl(var3);
            return;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new int[8192];
        field_d = "Unable to add name - system busy";
        field_i = "Try changing the following settings:  ";
        field_c = 0;
    }
}
