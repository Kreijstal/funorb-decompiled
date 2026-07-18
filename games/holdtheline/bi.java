/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bi {
    static String field_h;
    private im field_d;
    static byte[] field_b;
    private lk field_a;
    private int field_c;
    private int field_f;
    static int field_g;
    static int field_e;

    private final void a(byte param0, int param1, Object param2, long param3) {
        jj var6 = null;
        RuntimeException var6_ref = null;
        int var7 = 0;
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
        var7 = HoldTheLine.field_D;
        try {
          L0: {
            if (((bi) this).field_c < 1) {
              throw new IllegalStateException();
            } else {
              this.a(true, param3);
              ((bi) this).field_f = ((bi) this).field_f - 1;
              L1: while (true) {
                if (((bi) this).field_f >= 0) {
                  break L0;
                } else {
                  var6 = (jj) (Object) ((bi) this).field_a.b((byte) 121);
                  this.a(-3393, var6);
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6_ref = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var6_ref;
            stackOut_9_1 = new StringBuilder().append("bi.C(").append(-7).append(',').append(1).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param2 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L2;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L2;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ',' + param3 + ')');
        }
    }

    private final void a(boolean param0, long param1) {
        jj var4 = (jj) (Object) ((bi) this).field_d.a(param1, -88);
        this.a(-3393, var4);
    }

    final static go a(boolean param0, String param1) {
        RuntimeException var5 = null;
        go stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        go stackOut_2_0 = null;
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
            stackOut_2_0 = new go(param1, 2048, false, false);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var5;
            stackOut_4_1 = new StringBuilder().append("bi.G(").append(false).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
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
          throw kk.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ',' + true + ',' + false + ',' + 2048 + ')');
        }
        return stackIn_3_0;
    }

    private final void a(int param0, jj param1) {
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
          if (param1 != null) {
            param1.d(0);
            param1.a((byte) -42);
            ((bi) this).field_f = ((bi) this).field_f + param1.field_o;
            return;
          } else {
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L0: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("bi.E(").append(-3393).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L0;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L0;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ')');
        }
    }

    public static void a() {
        field_b = null;
        field_h = null;
    }

    final static gn a(int param0, int param1) {
        int var2 = 36 / ((56 - param0) / 61);
        return kh.a(param1, false, true, false, 10600, 1);
    }

    final Object a(long param0, int param1) {
        int var5 = 0;
        Object var6 = null;
        cf var7 = null;
        jj var8 = null;
        var8 = (jj) (Object) ((bi) this).field_d.a(param0, -78);
        if (var8 != null) {
          var5 = -29 / ((-57 - param1) / 46);
          var6 = var8.b((byte) 66);
          if (var6 == null) {
            var8.d(0);
            var8.a((byte) -42);
            ((bi) this).field_f = ((bi) this).field_f + var8.field_o;
            return null;
          } else {
            L0: {
              if (var8.g(-101)) {
                var7 = new cf(var6, var8.field_o);
                ((bi) this).field_d.a((byte) 27, (hl) (Object) var7, var8.field_f);
                ((bi) this).field_a.a((ln) (Object) var7, -29460);
                ((jj) (Object) var7).field_i = 0L;
                var8.d(0);
                var8.a((byte) -42);
                break L0;
              } else {
                ((bi) this).field_a.a((ln) (Object) var8, -29460);
                var8.field_i = 0L;
                break L0;
              }
            }
            return var6;
          }
        } else {
          return null;
        }
    }

    final void a(long param0, Object param1, boolean param2) {
        try {
            if (param2) {
                ((bi) this).field_a = null;
            }
            this.a((byte) -7, 1, param1, param0);
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) (Object) runtimeException, "bi.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    private bi() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = "Achievements This Game";
        field_b = new byte[]{(byte) 49, (byte) 105};
    }
}
