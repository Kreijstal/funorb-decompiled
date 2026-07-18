/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class th {
    int field_F;
    int field_k;
    byte field_t;
    int field_m;
    int[] field_c;
    int[][] field_I;
    int field_b;
    int[][] field_H;
    boolean[] field_d;
    static int field_p;
    int field_e;
    int field_g;
    static int[] field_y;
    int field_u;
    byte[] field_o;
    int field_J;
    byte[] field_z;
    byte[] field_w;
    int field_n;
    int[] field_j;
    int[][] field_a;
    int field_h;
    byte[] field_E;
    int field_C;
    int field_x;
    static int[] field_v;
    byte[][] field_q;
    int field_A;
    int[] field_r;
    static hh field_G;
    boolean[] field_f;
    int field_l;
    byte[] field_D;
    int[] field_B;
    int field_i;
    byte[] field_s;

    public static void a(int param0) {
        field_y = null;
        field_G = null;
        field_v = null;
    }

    final static void a(boolean param0, boolean param1, java.applet.Applet param2, String param3) {
        try {
            java.net.MalformedURLException var4 = null;
            RuntimeException var4_ref = null;
            RuntimeException stackIn_10_0 = null;
            StringBuilder stackIn_10_1 = null;
            RuntimeException stackIn_11_0 = null;
            StringBuilder stackIn_11_1 = null;
            RuntimeException stackIn_12_0 = null;
            StringBuilder stackIn_12_1 = null;
            String stackIn_12_2 = null;
            RuntimeException stackIn_13_0 = null;
            StringBuilder stackIn_13_1 = null;
            RuntimeException stackIn_14_0 = null;
            StringBuilder stackIn_14_1 = null;
            RuntimeException stackIn_15_0 = null;
            StringBuilder stackIn_15_1 = null;
            String stackIn_15_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_9_0 = null;
            StringBuilder stackOut_9_1 = null;
            RuntimeException stackOut_11_0 = null;
            StringBuilder stackOut_11_1 = null;
            String stackOut_11_2 = null;
            RuntimeException stackOut_10_0 = null;
            StringBuilder stackOut_10_1 = null;
            String stackOut_10_2 = null;
            RuntimeException stackOut_12_0 = null;
            StringBuilder stackOut_12_1 = null;
            RuntimeException stackOut_14_0 = null;
            StringBuilder stackOut_14_1 = null;
            String stackOut_14_2 = null;
            RuntimeException stackOut_13_0 = null;
            StringBuilder stackOut_13_1 = null;
            String stackOut_13_2 = null;
            try {
              L0: {
                if (lk.field_e.startsWith("win")) {
                  if (dl.a((byte) 38, param3)) {
                    return;
                  } else {
                    break L0;
                  }
                } else {
                  break L0;
                }
              }
              {
                L1: {
                  param2.getAppletContext().showDocument(new java.net.URL(param3), "_blank");
                  break L1;
                }
              }
              return;
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L2: {
                var4_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_9_0 = (RuntimeException) var4_ref;
                stackOut_9_1 = new StringBuilder().append("th.B(").append(true).append(',').append(param1).append(',');
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
              L3: {
                stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
                stackOut_12_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',');
                stackIn_14_0 = stackOut_12_0;
                stackIn_14_1 = stackOut_12_1;
                stackIn_13_0 = stackOut_12_0;
                stackIn_13_1 = stackOut_12_1;
                if (param3 == null) {
                  stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
                  stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
                  stackOut_14_2 = "null";
                  stackIn_15_0 = stackOut_14_0;
                  stackIn_15_1 = stackOut_14_1;
                  stackIn_15_2 = stackOut_14_2;
                  break L3;
                } else {
                  stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
                  stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
                  stackOut_13_2 = "{...}";
                  stackIn_15_0 = stackOut_13_0;
                  stackIn_15_1 = stackOut_13_1;
                  stackIn_15_2 = stackOut_13_2;
                  break L3;
                }
              }
              throw t.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    th() {
        ((th) this).field_d = new boolean[256];
        ((th) this).field_o = new byte[4096];
        ((th) this).field_I = new int[6][258];
        ((th) this).field_w = new byte[256];
        ((th) this).field_e = 0;
        ((th) this).field_a = new int[6][258];
        ((th) this).field_C = 0;
        ((th) this).field_j = new int[256];
        ((th) this).field_q = new byte[6][258];
        ((th) this).field_H = new int[6][258];
        ((th) this).field_f = new boolean[16];
        ((th) this).field_B = new int[257];
        ((th) this).field_c = new int[6];
        ((th) this).field_r = new int[16];
        ((th) this).field_E = new byte[18002];
        ((th) this).field_s = new byte[18002];
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = 0;
        field_y = new int[8192];
    }
}
