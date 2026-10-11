/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oj extends cj implements ij {
    static int[] field_M;
    static int field_N;
    static int[] field_F;
    static int[][] field_O;
    private nc field_J;
    static int[] field_H;
    static fe field_L;
    private d[] field_G;
    static int[] field_I;
    private String[] field_E;
    static boolean[] field_Q;
    static boolean field_P;

    final boolean a(char param0, int param1, int param2, iq param3) {
        RuntimeException var5 = null;
        boolean stackIn_6_0 = false;
        boolean stackIn_10_0 = false;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (super.a(param0, param1 ^ 0, param2, param3)) {
            return true;
          }
          if (param2 == 98) {
            stackIn_6_0 = this.a(32345, param3);
            return stackIn_6_0;
          }
          if (99 == param2) {
            stackIn_10_0 = this.b((byte) -122, param3);
            return stackIn_10_0;
          }
          if (param1 == 13) {
            return false;
          }
          field_P = true;
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_17_0 = var5;
          stackIn_17_1 = new StringBuilder().append("oj.M(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    public final void a(int param0, d param1, byte param2, int param3, int param4) {
        int var6_int = 0;
        int var7 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        int var6_intLifetime1;
        var7 = Vertigo2.field_L ? 1 : 0;
        try {
          for (var6_int = 0; this.field_E.length > var6_int; var6_int++) {
            if (param1 == this.field_G[var6_int]) {
              this.field_J.a(this.field_E[var6_int], 4944);
            }
          }
          var6_intLifetime1 = 84 % ((-63 - param2) / 51);
          if (param1 == this.field_G[this.field_E.length]) {
            this.field_J.a(-4384);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_14_0 = var6;
          stackIn_14_1 = new StringBuilder().append("oj.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final static void a(int param0, int param1, int param2, int param3, byte param4, int param5, int param6, int param7) {
        int var9;
        var9 = Vertigo2.field_L ? 1 : 0;
        if (param5 >= param6) {
          if (param5 >= param0) {
            if (param6 < param0) {
              hm.a(bi.field_l, param6, param3, param5, param1, (byte) -29, param0, param7, param2);
            } else {
              hm.a(bi.field_l, param0, param2, param5, param1, (byte) -73, param6, param7, param3);
            }
          } else {
            hm.a(bi.field_l, param6, param1, param0, param3, (byte) -125, param5, param7, param2);
          }
        } else {
          if (param0 <= param6) {
            if (param5 < param0) {
              hm.a(bi.field_l, param5, param3, param6, param2, (byte) -54, param0, param7, param1);
            } else {
              hm.a(bi.field_l, param0, param1, param6, param2, (byte) -43, param5, param7, param3);
            }
          } else {
            hm.a(bi.field_l, param5, param2, param0, param3, (byte) -125, param6, param7, param1);
          }
        }
        if (param4 < 80) {
          oj.a(-117, 112, 11, -72, (byte) 107, -108, 19, -31);
        }
    }

    oj(nc param0) {
        super(0, 0, 0, 0, (ur) null);
        try {
          this.field_J = param0;
        } catch (RuntimeException runtimeException) {
          throw wn.a((Throwable) ((Object) runtimeException), "oj.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(String[] param0, int param1) {
        int var4_int = 0;
        int var5 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        jc var4 = null;
        int var6 = 0;
        var6 = Vertigo2.field_L ? 1 : 0;
        try {
          this.field_C.c(0);
          if (param0 != null &&
            0 != param0.length) {
            var3_int = param0.length;
            this.field_E = new String[var3_int];
            for (var4_int = 0; var3_int > var4_int; var4_int++) {
              this.field_E[var4_int] = vj.a((CharSequence) ((Object) param0[var4_int]), (byte) 8).replace(' ', ' ');
            }
            var4 = new jc(qc.field_x, 0, 1);
            if (param1 != -1546) {
              return;
            }
            this.field_G = new d[1 + var3_int];
            for (var5 = 0; var5 < var3_int; var5++) {
              this.field_G[var5] = new d(this.field_E[var5], (uf) (this));
              this.field_G[var5].field_B = (ur) ((Object) var4);
              this.field_G[var5].field_q = og.field_k;
              this.field_G[var5].a(false, 0, 20 + var5 * 16, 15, 80);
              this.c((byte) -29, this.field_G[var5]);
            }
            this.field_G[var3_int] = new d(pl.field_p, (uf) (this));
            this.field_G[var3_int].field_B = (ur) ((Object) var4);
            this.field_G[var3_int].a(false, 0, 20 + (16 * var3_int + 16), 15, 100);
            this.c((byte) -39, this.field_G[var3_int]);
            return;
          }
          this.field_E = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_18_0 = var3;
          stackIn_18_1 = new StringBuilder().append("oj.A(");
          if (param0 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void a(byte param0) {
        field_I = null;
        field_O = (int[][]) null;
        field_H = null;
        if (param0 != -110) {
          return;
        }
        field_F = null;
        field_Q = null;
        field_L = null;
        field_M = null;
    }

    final void a(boolean param0, int param1, int param2, int param3) {
        super.a(param0, param1, param2, param3);
        if (param1 != 0) {
          return;
        }
        cc var5 = qc.field_x;
        if (null != this.field_E) {
          var5.a(jd.field_a, this.field_o + param2, param3 + this.field_t, this.field_n, 20, 16777215, -1, 0, 0, var5.field_M + var5.field_z);
        }
    }

    static {
        field_F = new int[23];
        field_O = new int[23][];
        field_M = new int[23];
        field_H = new int[23];
        field_I = new int[23];
        field_Q = new boolean[23];
        tj.a(new int[]{34, 1, 5, 29, 4, 3, 22, 19}, 600, 36, 360, (byte) -116, 0, 175);
        tj.a(new int[]{2, 20, 21, 30, 5, 9}, 440, 36, 200, (byte) -118, 12, 175);
        tj.a(new int[]{2, 35, 31, 5, 9}, 460, 36, 180, (byte) -96, 1, 180);
        tj.a(new int[]{2, 31, 5, 10, 11, 13}, 460, 36, 180, (byte) -95, 2, 180);
        tj.a(new int[]{2, 31, 5, 13}, 460, 36, 180, (byte) -105, 22, 180);
        tj.a(new int[]{2, 31, 5, 12, 13}, 460, 36, 180, (byte) -65, 3, 180);
        tj.a(new int[]{2, 31, 5, 13}, 460, 36, 180, (byte) -69, 4, 180);
        tj.a(new int[]{23, 7}, 632, 36, 392, (byte) -120, 5, 115);
        cl.a(430, 192, (byte) 83, 220, new int[]{23, 8}, 620, 6);
        cl.a(430, 150, (byte) 124, 320, new int[]{25, 26, 8}, 620, 7);
        tj.a(new int[]{23, 7}, 440, 30, 200, (byte) -110, 8, 320);
        cl.a(430, 150, (byte) 84, 245, new int[]{3, 7}, 620, 9);
        tj.a(new int[]{23, 24}, 440, 100, 200, (byte) -86, 10, 240);
        tj.a(new int[]{7}, 460, 30, 180, (byte) -119, 11, 400);
        cl.a(430, 300, (byte) 126, 20, new int[]{7, 28, 23}, 620, 13);
        tj.a(new int[]{27}, 440, 30, 200, (byte) -80, 14, 400);
        tj.a(new int[]{27}, 440, 30, 200, (byte) -110, 15, 400);
        tj.a(new int[]{27}, 440, 30, 200, (byte) -91, 20, 400);
        tj.a(new int[]{27}, 440, 30, 200, (byte) -117, 16, 400);
        tj.a(new int[]{20, 21, 6, 30, 8}, 440, 36, 200, (byte) -84, 17, 175);
        tj.a(new int[]{20, 21, 30, 8}, 440, 36, 200, (byte) -116, 18, 175);
        cl.a(430, 300, (byte) 81, 20, new int[]{7, 33}, 620, 19);
        tj.a(new int[]{0, 32, 7}, 440, 36, 200, (byte) -127, 21, 210);
    }
}
