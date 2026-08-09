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
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
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
            stackIn_3_0 = (sna) (var13);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var13_ref = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var13_ref);

            stackIn_6_1 = new StringBuilder().append("qla.J(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',');

            if (param7 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param8 + ',' + param9 + ',' + param10 + ',' + param11 + ',' + param12 + ')');
        }
        return stackIn_3_0;
    }

    final boolean b(int param0) {
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
        po var3;
        int stackIn_4_0 = 0;
        if (param0 < 21) {
          var3 = (po) null;
          qla.a(96, -29, 54, -43, 95, 72, 56, (po) null, -23, -63, 97, 106, -33);
          fieldTemp$2 = this.field_i + 1;
          this.field_i = this.field_i + 1;
          if ((fieldTemp$2 ^ -1) > -65) {
            return false;
          } else {
            return true;
          }
        } else {
          L0: {
            fieldTemp$3 = this.field_i + 1;
            this.field_i = this.field_i + 1;
            if ((fieldTemp$3 ^ -1) <= -65) {
              stackIn_4_0 = 1;
              break L0;
            } else {
              stackIn_4_0 = 0;
              break L0;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    qla(gj param0, int param1, int param2, int param3) {
        super(param0, param1, param2);
        try {
            this.field_h = param3;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "qla.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void a(int param0, boolean param1, int param2) {
        am.field_M[this.field_h].c(-24 + (param2 - -64), -this.field_i + -24 + param0 + -32, am.field_M[this.field_h].field_q << -1875116991, am.field_M[this.field_h].field_p << -1972427935, 256 - (this.field_i << 844622914));
        if (!param1) {
            this.a(43, 82, 108);
        }
    }

    final static void d(int param0) {
        eaa.f(31883);
        nm.f(-21522);
        uc.b(-103);
        if (param0 != -64) {
            field_g = (kv[]) null;
        }
    }

    final void a(int param0, int param1, int param2) {
        if (param1 != 0) {
            this.a(-97, false, -128);
        }
    }

    public static void c(int param0) {
        if (param0 != -24) {
            field_f = -125;
            field_g = null;
            return;
        }
        field_g = null;
    }

    final static boolean a(byte param0, lu param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int stackIn_3_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var2_int = param1.b(16711935);
              if (var2_int == 1) {
                stackIn_3_0 = 1;
                break L1;
              } else {
                stackIn_3_0 = 0;
                break L1;
              }
            }
            var3 = stackIn_3_0;
            if (param0 > 79) {
              stackIn_7_0 = var3;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_5_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var2);

            stackIn_10_1 = new StringBuilder().append("qla.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0 != 0;
        } else {
          return stackIn_7_0 != 0;
        }
    }

    static {
    }
}
