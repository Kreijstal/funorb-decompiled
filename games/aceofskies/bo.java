/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bo {
    static int field_h;
    static String field_g;
    private fo field_b;
    private pa field_d;
    static kp field_i;
    static hc field_a;
    private int[] field_e;
    private ha field_c;
    private fo field_f;

    final static boolean a(byte param0) {
        if (param0 == 102) {
          if (hr.field_e != null) {
            if (null == hr.field_e.d((byte) -112)) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          boolean discarded$5 = bo.a((byte) -128);
          if (hr.field_e != null) {
            if (null == hr.field_e.d((byte) -112)) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    final static rh a(al[] param0, int param1, int param2) {
        RuntimeException var3 = null;
        rh stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        rh stackOut_0_0 = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            stackOut_0_0 = gg.a(param0[qq.a(20, param0.length)], param1, -27227);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var3;
            stackOut_2_1 = new StringBuilder().append("bo.A(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + 44 + param1 + 44 + 23187 + 41);
        }
        return stackIn_1_0;
    }

    final void a(boolean param0) {
        fo var2 = null;
        fo var3 = null;
        if (((bo) this).field_b.field_b == ((bo) this).field_d) {
          if (!param0) {
            bo.a(65);
            ((bo) this).field_c.KA(((bo) this).field_b.field_d, ((bo) this).field_b.field_g, ((bo) this).field_b.field_a, ((bo) this).field_b.field_e);
            var3 = ((bo) this).field_b;
            var2 = var3;
            ((bo) this).field_b = ((bo) this).field_b.field_c;
            var3.field_c = ((bo) this).field_f;
            var3.field_b = null;
            ((bo) this).field_f = var3;
            return;
          } else {
            ((bo) this).field_c.KA(((bo) this).field_b.field_d, ((bo) this).field_b.field_g, ((bo) this).field_b.field_a, ((bo) this).field_b.field_e);
            var3 = ((bo) this).field_b;
            var2 = var3;
            ((bo) this).field_b = ((bo) this).field_b.field_c;
            var3.field_c = ((bo) this).field_f;
            var3.field_b = null;
            ((bo) this).field_f = var3;
            return;
          }
        } else {
          ((bo) this).field_c.a();
          if (null == ((bo) this).field_b.field_b) {
            ((bo) this).field_d = ((bo) this).field_b.field_b;
            if (param0) {
              ((bo) this).field_c.KA(((bo) this).field_b.field_d, ((bo) this).field_b.field_g, ((bo) this).field_b.field_a, ((bo) this).field_b.field_e);
              var3 = ((bo) this).field_b;
              var2 = var3;
              ((bo) this).field_b = ((bo) this).field_b.field_c;
              var3.field_c = ((bo) this).field_f;
              var3.field_b = null;
              ((bo) this).field_f = var3;
              return;
            } else {
              bo.a(65);
              ((bo) this).field_c.KA(((bo) this).field_b.field_d, ((bo) this).field_b.field_g, ((bo) this).field_b.field_a, ((bo) this).field_b.field_e);
              var3 = ((bo) this).field_b;
              var2 = var3;
              ((bo) this).field_b = ((bo) this).field_b.field_c;
              var3.field_c = ((bo) this).field_f;
              var3.field_b = null;
              ((bo) this).field_f = var3;
              return;
            }
          } else {
            ((bo) this).field_c.a(((bo) this).field_b.field_b, true);
            ((bo) this).field_d = ((bo) this).field_b.field_b;
            if (param0) {
              ((bo) this).field_c.KA(((bo) this).field_b.field_d, ((bo) this).field_b.field_g, ((bo) this).field_b.field_a, ((bo) this).field_b.field_e);
              var3 = ((bo) this).field_b;
              var2 = var3;
              ((bo) this).field_b = ((bo) this).field_b.field_c;
              var3.field_c = ((bo) this).field_f;
              var3.field_b = null;
              ((bo) this).field_f = var3;
              return;
            } else {
              bo.a(65);
              ((bo) this).field_c.KA(((bo) this).field_b.field_d, ((bo) this).field_b.field_g, ((bo) this).field_b.field_a, ((bo) this).field_b.field_e);
              var3 = ((bo) this).field_b;
              var2 = var3;
              ((bo) this).field_b = ((bo) this).field_b.field_c;
              var3.field_c = ((bo) this).field_f;
              var3.field_b = null;
              ((bo) this).field_f = var3;
              return;
            }
          }
        }
    }

    private final void b(int param0) {
        fo var2 = null;
        ((bo) this).field_c.K(((bo) this).field_e);
        if (null != ((bo) this).field_f) {
            var2 = ((bo) this).field_f;
            ((bo) this).field_f = ((bo) this).field_f.field_c;
        } else {
            var2 = new fo();
        }
        var2.a((byte) 46, ((bo) this).field_e[3], ((bo) this).field_e[2], ((bo) this).field_b, ((bo) this).field_e[1], ((bo) this).field_d, ((bo) this).field_e[0]);
        ((bo) this).field_b = var2;
    }

    public static void a(int param0) {
        field_i = null;
        if (param0 != 18598) {
            field_i = null;
            field_g = null;
            field_a = null;
            return;
        }
        field_g = null;
        field_a = null;
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        int var6 = 120 % ((param4 - 25) / 44);
        this.b(884);
        ((bo) this).field_c.T(param1, param3, param0, param2);
    }

    bo(ha param0) {
        ((bo) this).field_d = null;
        ((bo) this).field_e = new int[4];
        try {
            ((bo) this).field_c = param0;
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) (Object) runtimeException, "bo.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = "Loading extra data";
        field_i = new kp();
    }
}
