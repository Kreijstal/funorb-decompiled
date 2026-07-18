/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eg extends mg {
    private ng field_D;
    static String field_E;
    static String field_F;
    static sh field_C;

    final void h(int param0) {
        int var4 = Lexicominos.field_L ? 1 : 0;
        ta var2 = new ta(((eg) this).field_D);
        if (param0 != 0) {
            return;
        }
        al var3 = (al) (Object) var2.a(param0 ^ 250);
        while (var3 != null) {
            var3.field_D = false;
            var3 = (al) (Object) var2.c(param0 + -73);
        }
        ((eg) this).field_A = null;
    }

    final void f(boolean param0) {
        int var4 = Lexicominos.field_L ? 1 : 0;
        if (!param0) {
            w discarded$0 = ((eg) this).f(127);
        }
        ta var2 = new ta(((eg) this).field_D);
        al var3 = (al) (Object) var2.a(250);
        while (var3 != null) {
            if (!(!var3.f((byte) -77))) {
                var3.b((byte) -121);
            }
            var3 = (al) (Object) var2.c(-124);
        }
        ((eg) this).field_A = (w) (Object) ((eg) this).e(false);
    }

    final void g(boolean param0) {
        int var4 = Lexicominos.field_L ? 1 : 0;
        ta var2 = new ta(((eg) this).field_D);
        al var3 = (al) (Object) var2.a(250);
        if (param0) {
            eg.i(-88);
        }
        while (var3 != null) {
            if (var3.a((byte) 26)) {
                var3.b((byte) -122);
            }
            var3 = (al) (Object) var2.c(-69);
        }
    }

    public static void i(int param0) {
        field_C = null;
        field_E = null;
        field_F = null;
        if (param0 > -59) {
            field_F = null;
        }
    }

    final al e(boolean param0) {
        ta var2 = null;
        al var3 = null;
        int var4 = 0;
        var4 = Lexicominos.field_L ? 1 : 0;
        if (!param0) {
          var2 = new ta(((eg) this).field_D);
          var3 = (al) (Object) var2.a(250);
          L0: while (true) {
            if (var3 != null) {
              if (!var3.field_D) {
                var3 = (al) (Object) var2.c(-53);
                continue L0;
              } else {
                return var3;
              }
            } else {
              return null;
            }
          }
        } else {
          return null;
        }
    }

    final void a(byte param0, int param1, int param2, int param3) {
        int var7 = Lexicominos.field_L ? 1 : 0;
        if (!(((eg) this).field_i == null)) {
            ((eg) this).field_i.a(param1, param2, true, (w) this, param0 + -3169);
        }
        if (param0 != -115) {
            return;
        }
        ta var5 = new ta(((eg) this).field_D);
        w var6 = (w) (Object) var5.b(0);
        while (var6 != null) {
            var6.a((byte) -115, ((eg) this).field_o + param1, param2 + ((eg) this).field_t, param3);
            var6 = (w) (Object) var5.e(31842);
        }
    }

    public eg() {
        super(0, 0, ql.field_O, kg.field_C, (rd) null, (vd) null);
        ((eg) this).field_D = new ng();
    }

    final w f(int param0) {
        int var4 = Lexicominos.field_L ? 1 : 0;
        ta var2 = new ta(((eg) this).field_D);
        al var3 = (al) (Object) var2.a(250);
        while (var3 != null) {
            if (!(!var3.field_D)) {
                return var3.e(-21374);
            }
            var3 = (al) (Object) var2.c(-87);
        }
        if (param0 == 0) {
            return null;
        }
        ((eg) this).f(true);
        return null;
    }

    final void a(int param0, w param1) {
        al var3 = null;
        RuntimeException var3_ref = null;
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
            if (param1 instanceof al) {
              L1: {
                var3 = (al) (Object) param1;
                ((eg) this).field_D.a(param0 + 14484, (kd) (Object) var3);
                var3.field_D = true;
                boolean discarded$10 = var3.a((byte) 44, (w) this);
                if (param0 == -14579) {
                  break L1;
                } else {
                  w discarded$11 = ((eg) this).f(18);
                  break L1;
                }
              }
              break L0;
            } else {
              throw new IllegalArgumentException();
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3_ref;
            stackOut_5_1 = new StringBuilder().append("eg.B(").append(param0).append(',');
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
          throw ld.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ')');
        }
    }

    final static vj a(int param0, int param1, sh param2, sh param3, int param4) {
        RuntimeException var5 = null;
        Object stackIn_2_0 = null;
        vj stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        vj stackOut_3_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            if (nb.a(param1, param0, (byte) -122, param2)) {
              stackOut_3_0 = lj.a(22076, param3.a(param1, -27493, param0));
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (vj) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var5;
            stackOut_5_1 = new StringBuilder().append("eg.F(").append(param0).append(',').append(param1).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param2 == null) {
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
          L2: {
            stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param3 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          throw ld.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ',' + 96 + ')');
        }
        return stackIn_4_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_F = "to keep fullscreen or";
        field_E = "4 of 4";
    }
}
