/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ae extends br {
    int field_f;
    static ao field_h;
    static String field_g;

    abstract void a(int param0, qd param1);

    final static int a(k param0, String param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        byte[] var4 = null;
        CharSequence var5 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var3_int = param0.field_j;
            var5 = (CharSequence) ((Object) param1);
            var4 = qo.a(var5, (byte) -116);
            if (param2 == -31746) {
              param0.c(var4.length, (byte) 78);
              param0.field_j = param0.field_j + r.field_a.a(var4.length, (byte) -62, 0, param0.field_m, param0.field_j, var4);
              stackIn_4_0 = -var3_int + param0.field_j;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 73;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var3);

            stackIn_7_1 = new StringBuilder().append("ae.T(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',');

            if (param1 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_8_0), stackIn_11_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    final void a(int param0, int param1) {
        if (param0 != 0) {
            field_g = (String) null;
            this.field_f = param1;
            return;
        }
        this.field_f = param1;
    }

    ae() {
    }

    final static ja[] a(ja param0, int param1) {
        ja[] var2 = null;
        RuntimeException var2_ref = null;
        ja[] var3 = null;
        ja[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var3 = new ja[9];
              var2 = var3;
              var3[4] = param0;
              if (param1 == 27117) {
                break L1;
              } else {
                field_g = (String) null;
                break L1;
              }
            }
            stackIn_3_0 = (ja[]) (var2);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var2_ref);

            stackIn_6_1 = new StringBuilder().append("ae.U(");

            if (param0 == null) {
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
          throw fa.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    public static void b(boolean param0) {
        String var2;
        if (param0) {
          var2 = (String) null;
          ae.a((k) null, (String) null, -18);
          field_g = null;
          field_h = null;
          return;
        } else {
          field_g = null;
          field_h = null;
          return;
        }
    }

    void a(byte param0) {
        if (param0 >= -47) {
            qd var3 = (qd) null;
            this.a(-7, (qd) null);
            this.a(true);
            return;
        }
        this.a(true);
    }

    ae(int param0) {
        this.a(0, param0);
    }

    abstract void a(int param0, boolean param1, int param2, int param3);

    static {
        field_g = "<%0>'s game";
        field_h = new ao(7, 0, 1, 1);
    }
}
