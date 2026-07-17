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
        jj var8 = null;
        cf var6 = null;
        int var7 = HoldTheLine.field_D;
        if (!(((bi) this).field_c >= param1)) {
            throw new IllegalStateException();
        }
        this.a(true, param3);
        ((bi) this).field_f = ((bi) this).field_f - param1;
        while (((bi) this).field_f < 0) {
            var8 = (jj) (Object) ((bi) this).field_a.b((byte) 121);
            this.a(-3393, var8);
        }
        if (param0 != -7) {
            return;
        }
        try {
            var6 = new cf(param2, param1);
            ((bi) this).field_d.a((byte) 27, (hl) (Object) var6, param3);
            ((bi) this).field_a.a((ln) (Object) var6, -29460);
            ((jj) (Object) var6).field_i = 0L;
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) (Object) runtimeException, "bi.C(" + param0 + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 44 + param3 + 41);
        }
    }

    private final void a(boolean param0, long param1) {
        jj var4 = null;
        var4 = (jj) (Object) ((bi) this).field_d.a(param1, -88);
        this.a(-3393, var4);
        if (!param0) {
          ((bi) this).field_c = 79;
          return;
        } else {
          return;
        }
    }

    final static go a(boolean param0, String param1, boolean param2, boolean param3, int param4) {
        RuntimeException var5 = null;
        Object stackIn_2_0 = null;
        go stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        go stackOut_3_0 = null;
        Object stackOut_1_0 = null;
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
            if (param2) {
              stackOut_3_0 = new go(param1, param4, param3, param0);
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (go) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var5;
            stackOut_5_1 = new StringBuilder().append("bi.G(").append(param0).append(44);
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
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 44 + param2 + 44 + param3 + 44 + param4 + 41);
        }
        return stackIn_4_0;
    }

    private final void a(int param0, jj param1) {
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
              if (param1 != null) {
                param1.d(0);
                param1.a((byte) -42);
                ((bi) this).field_f = ((bi) this).field_f + param1.field_o;
                break L1;
              } else {
                break L1;
              }
            }
            if (param0 == -3393) {
              break L0;
            } else {
              ((bi) this).field_c = -45;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var3;
            stackOut_6_1 = new StringBuilder().append("bi.E(").append(param0).append(44);
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
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
          throw kk.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 41);
        }
    }

    public static void a(boolean param0) {
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
            throw kk.a((Throwable) (Object) runtimeException, "bi.B(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 41);
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
