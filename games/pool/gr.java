/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class gr extends rg {
    static hj field_G;
    static vh field_y;
    static String field_A;
    static int field_z;
    static dd[] field_I;
    static int[] field_w;
    volatile boolean field_F;
    static int[] field_B;
    boolean field_C;
    static String field_H;
    boolean field_x;
    static String field_D;
    static byte[] field_E;

    final static void g(int param0) {
        if (param0 <= 92) {
          gr.f(4);
          lk.field_o = false;
          rq.field_H = null;
          hk.field_n = null;
          va.field_W = null;
          fo.field_a = null;
          return;
        } else {
          lk.field_o = false;
          rq.field_H = null;
          hk.field_n = null;
          va.field_W = null;
          fo.field_a = null;
          return;
        }
    }

    abstract byte[] b(boolean param0);

    public static void f(int param0) {
        field_G = null;
        field_y = null;
        field_E = null;
        if (param0 >= -119) {
          field_B = (int[]) null;
          field_D = null;
          field_A = null;
          field_I = null;
          field_B = null;
          field_w = null;
          field_H = null;
          return;
        } else {
          field_D = null;
          field_A = null;
          field_I = null;
          field_B = null;
          field_w = null;
          field_H = null;
          return;
        }
    }

    final static qb[] a(di param0, String param1, int param2, String param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        qb[] stackIn_2_0 = null;
        qb[] stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var4_int = param0.b(param1, -1);
            var5 = param0.a(var4_int, 0, param3);
            if (param2 == -24155) {
              stackIn_4_0 = pn.a(var5, param0, var4_int, 120);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (qb[]) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var4);

            stackIn_7_1 = new StringBuilder().append("gr.A(");

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
          L3: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L3;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L3;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_8_0), stackIn_14_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    abstract int e(int param0);

    gr() {
        this.field_F = true;
    }

    static {
        field_H = "Enter multiplayer lobby";
        field_D = "Game options";
        field_w = new int[12];
        field_A = "<%0>: Two shots!";
        field_G = new hj(0, 2, 2, 1);
    }
}
