/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qla extends kj {
    static kv[] field_g;
    static int field_f;
    private int field_i;
    private int field_h;

    final static sna a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, po param7, int param8, int param9, int param10, int param11, int param12) {
        sna var13 = null;
        RuntimeException var13_ref = null;
        sna stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        sna stackOut_2_0 = null;
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
            L1: {
              var13 = new sna(0L, (sna) null);
              var13.field_eb = sma.a((byte) -85, param12, param0);
              var13.field_A = sma.a((byte) 119, param1, param5);
              var13.field_db = sma.a((byte) -38, param3, param9);
              var13.field_K = sma.a((byte) -115, param8, param10);
              var13.field_X = sma.a((byte) 73, param4, param11);
              var13.field_jb = param7;
              var13.field_gb = param2;
              if (param6 == -24) {
                break L1;
              } else {
                field_f = -88;
                break L1;
              }
            }
            stackOut_2_0 = (sna) var13;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var13_ref = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var13_ref;
            stackOut_4_1 = new StringBuilder().append("qla.J(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44).append(param4).append(44).append(param5).append(44).append(param6).append(44);
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param7 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + param8 + 44 + param9 + 44 + param10 + 44 + param11 + 44 + param12 + 41);
        }
        return stackIn_3_0;
    }

    final boolean b(int param0) {
        Object var3 = null;
        int stackIn_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 < 21) {
          var3 = null;
          sna discarded$6 = qla.a(96, -29, 54, -43, 95, 72, 56, (po) null, -23, -63, 97, 106, -33);
          int fieldTemp$7 = ((qla) this).field_i + 1;
          ((qla) this).field_i = ((qla) this).field_i + 1;
          if (fieldTemp$7 < 64) {
            return false;
          } else {
            return true;
          }
        } else {
          L0: {
            int fieldTemp$8 = ((qla) this).field_i + 1;
            ((qla) this).field_i = ((qla) this).field_i + 1;
            if (fieldTemp$8 >= 64) {
              stackOut_3_0 = 1;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_2_0 = 0;
              stackIn_4_0 = stackOut_2_0;
              break L0;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    qla(gj param0, int param1, int param2, int param3) {
        super(param0, param1, param2);
        try {
            ((qla) this).field_h = param3;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "qla.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
    }

    final void a(int param0, boolean param1, int param2) {
        am.field_M[((qla) this).field_h].c(-24 + (param2 - -64), -((qla) this).field_i + -24 + param0 + -32, am.field_M[((qla) this).field_h].field_q << 1, am.field_M[((qla) this).field_h].field_p << 1, 256 - (((qla) this).field_i << 2));
        if (!param1) {
            ((qla) this).a(43, 82, 108);
        }
    }

    final static void d() {
        int discarded$0 = 31883;
        eaa.f();
        int discarded$1 = -21522;
        nm.f();
        int discarded$2 = -103;
        uc.b();
    }

    final void a(int param0, int param1, int param2) {
        if (param1 != 0) {
            ((qla) this).a(-97, false, -128);
        }
    }

    public static void c() {
        field_g = null;
    }

    final static boolean a(byte param0, lu param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
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
            var2_int = param1.b(16711935);
            if (var2_int == 1) {
              stackOut_2_0 = 1;
              stackIn_3_0 = stackOut_2_0;
              break L0;
            } else {
              stackOut_1_0 = 0;
              stackIn_3_0 = stackOut_1_0;
              break L0;
            }
          }
          var3 = stackIn_3_0;
          return var3 != 0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var2;
            stackOut_5_1 = new StringBuilder().append("qla.D(").append(112).append(44);
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
          throw pe.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 41);
        }
    }

    static {
    }
}
