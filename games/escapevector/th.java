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
        if (param0 != 8192) {
            field_y = (int[]) null;
            field_v = null;
            return;
        }
        field_v = null;
    }

    final static void a(boolean param0, boolean param1, java.applet.Applet param2, String param3) {
        try {
            RuntimeException var4 = null;
            RuntimeException stackIn_13_0 = null;
            StringBuilder stackIn_13_1 = null;
            RuntimeException stackIn_14_0 = null;
            StringBuilder stackIn_14_1 = null;
            String stackIn_14_2 = null;
            StringBuilder stackIn_16_1 = null;
            StringBuilder stackIn_17_1 = null;
            String stackIn_17_2 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            java.net.MalformedURLException var4_ref = null;
            try {
              L0: {
                L1: {
                  if (lk.field_e.startsWith("win")) {
                    if (dl.a((byte) 38, param3)) {
                      decompiledRegionSelector0 = 0;
                      break L0;
                    } else {
                      break L1;
                    }
                  } else {
                    break L1;
                  }
                }
                try {
                  L2: {
                    param2.getAppletContext().showDocument(new java.net.URL(param3), "_blank");
                    break L2;
                  }
                } catch (java.net.MalformedURLException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L3: {
                    var4_ref = (java.net.MalformedURLException) (Object) decompiledCaughtException;
                    pf.a(false, "MGR1: " + param3, (Throwable) null);
                    break L3;
                  }
                }
                if (param0) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  field_p = -75;
                  return;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L4: {
                var4 = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_13_0 = (RuntimeException) (var4);

                stackIn_13_1 = new StringBuilder().append("th.B(").append(param0).append(',').append(param1).append(',');

                if (param2 == null) {
                  stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
                  stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
                  stackIn_14_2 = "null";
                  break L4;
                } else {
                  stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
                  stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
                  stackIn_14_2 = "{...}";
                  break L4;
                }
              }
              L5: {


                stackIn_16_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',');

                if (param3 == null) {
                  stackIn_14_0 = (RuntimeException) ((Object) stackIn_14_0);
                  stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
                  stackIn_17_2 = "null";
                  break L5;
                } else {
                  stackIn_14_0 = (RuntimeException) ((Object) stackIn_14_0);
                  stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
                  stackIn_17_2 = "{...}";
                  break L5;
                }
              }
              throw t.a((Throwable) ((Object) stackIn_14_0), stackIn_17_2 + ')');
            }
            if (decompiledRegionSelector0 == 0) {
              return;
            } else {
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    th() {
        this.field_d = new boolean[256];
        this.field_o = new byte[4096];
        this.field_I = new int[6][258];
        this.field_w = new byte[256];
        this.field_e = 0;
        this.field_a = new int[6][258];
        this.field_C = 0;
        this.field_j = new int[256];
        this.field_q = new byte[6][258];
        this.field_H = new int[6][258];
        this.field_f = new boolean[16];
        this.field_B = new int[257];
        this.field_c = new int[6];
        this.field_r = new int[16];
        this.field_E = new byte[18002];
        this.field_s = new byte[18002];
    }

    static {
        field_p = 0;
        field_y = new int[8192];
    }
}
