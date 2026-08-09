/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tw {
    int field_B;
    int field_M;
    private sfa field_z;
    static String field_g;
    pna field_u;
    boolean field_h;
    static byte[][] field_f;
    int field_L;
    Runnable field_b;
    int field_D;
    boolean field_J;
    boolean field_n;
    int[] field_p;
    ww field_e;
    int[] field_a;
    int[] field_l;
    ww field_t;
    int field_o;
    float[] field_d;
    int[] field_s;
    int[] field_G;
    ww field_r;
    int[] field_k;
    int[] field_c;
    ww field_K;
    iua field_v;
    ww field_C;
    ww field_E;
    int[] field_I;
    int[] field_A;
    int[] field_i;
    int[] field_j;
    int field_y;
    int field_H;
    ww field_F;
    ww field_x;
    ww field_w;
    ww field_m;
    int[] field_q;

    final static hja[] a(byte param0, String param1, String param2, cn param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        hja[] stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var4_int = param3.b(param2, -7768);
            var6 = 86 % ((param0 - 78) / 45);
            var5 = param3.a(true, param1, var4_int);
            stackIn_1_0 = rea.a(param3, var4_int, var5, (byte) 42);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var4);

            stackIn_4_1 = new StringBuilder().append("tw.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "null";
              break L1;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_7_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(',');

            if (param2 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L2;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',');

            if (param3 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_5_0), stackIn_11_2 + ')');
        }
        return stackIn_1_0;
    }

    final void a(Runnable param0, byte param1) {
        try {
            this.field_b = param0;
            if (param1 <= 25) {
                this.field_B = 90;
            }
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "tw.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(int param0) {
        this.field_v = new iua(this.field_z, (tw) (this));
        int var2 = -88 % ((param0 - 32) / 60);
    }

    public static void b(int param0) {
        if (param0 <= 111) {
            field_g = (String) null;
            field_g = null;
            field_f = (byte[][]) null;
            return;
        }
        field_g = null;
        field_f = (byte[][]) null;
    }

    tw(sfa param0) {
        int var2_int = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        this.field_M = 0;
        this.field_D = 0;
        this.field_L = 0;
        this.field_h = false;
        this.field_n = true;
        this.field_u = new pna();
        this.field_p = new int[ww.field_q];
        this.field_d = new float[2];
        this.field_G = new int[ww.field_q];
        this.field_I = new int[10];
        this.field_a = new int[ww.field_q];
        this.field_c = new int[ww.field_q];
        this.field_A = new int[ww.field_q];
        this.field_q = new int[10];
        this.field_s = new int[10];
        this.field_k = new int[ww.field_q];
        this.field_i = new int[10];
        this.field_j = new int[ww.field_q];
        try {
          L0: {
            this.field_z = param0;
            this.field_B = -255 + this.field_z.field_U;
            this.field_v = new iua(param0, (tw) (this));
            this.field_C = new ww(this.field_z);
            this.field_t = new ww(this.field_z);
            this.field_m = new ww(this.field_z);
            this.field_K = new ww(this.field_z);
            this.field_x = new ww(this.field_z);
            this.field_E = new ww(this.field_z);
            this.field_w = new ww(this.field_z);
            this.field_F = new ww(this.field_z);
            this.field_e = new ww(this.field_z);
            this.field_r = new ww(this.field_z);
            this.field_l = new int[ww.field_G];
            var2_int = 0;
            L1: while (true) {
              if (ww.field_G <= var2_int) {
                break L0;
              } else {
                this.field_l[var2_int] = -1;
                var2_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var2);

            stackIn_7_1 = new StringBuilder().append("tw.<init>(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L2;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
    }

    static {
        field_g = "Staff impersonation";
        field_f = new byte[250][];
    }
}
