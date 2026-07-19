/*
 * Decompiled by CFR-JS 0.4.0.
 */
class ma {
    static String field_f;
    static String field_j;
    static int field_g;
    ma field_k;
    static bl[][][] field_b;
    long field_c;
    static vh field_e;
    static int[] field_h;
    static jg field_a;
    static ko field_i;
    ma field_d;

    public static void b(byte param0) {
        field_f = null;
        if (param0 < 56) {
          ma.b((byte) -106);
          field_b = (bl[][][]) null;
          field_a = null;
          field_h = null;
          field_j = null;
          field_i = null;
          field_e = null;
          return;
        } else {
          field_b = (bl[][][]) null;
          field_a = null;
          field_h = null;
          field_j = null;
          field_i = null;
          field_e = null;
          return;
        }
    }

    final void a(byte param0) {
        int[] var3 = null;
        if (this.field_k != null) {
          this.field_k.field_d = this.field_d;
          this.field_d.field_k = this.field_k;
          this.field_d = null;
          if (param0 != -117) {
            var3 = (int[]) null;
            ma.a(97, (int[]) null, (int[]) null);
            this.field_k = null;
            return;
          } else {
            this.field_k = null;
            return;
          }
        } else {
          return;
        }
    }

    final static void a(int param0, int[] param1, int[] param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        long var10 = 0L;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            L1: {
              var3_int = -param2[0] + param1[0];
              var4 = param1[1] + -param2[1];
              var5 = param1[2] + -param2[param0];
              var6 = var5 * param2[5] + param2[4] * var4 + var3_int * param2[3] >> -1504745840;
              var7 = var4 * param2[7] + var3_int * param2[6] - -(param2[8] * var5) >> 1109184304;
              var8 = var5 * param2[11] + var3_int * param2[9] - -(param2[10] * var4) >> 320678896;
              var9 = rf.a(var7 * var7 + var8 * var8 >> -247526416, -125);
              if (var9 < 0) {
                var9 = -var9;
                break L1;
              } else {
                break L1;
              }
            }
            br.field_I = 128 + (tj.c(var9, var6, param0 ^ 4098) >> -897266236);
            var10 = bm.a(-112, (long)var7 * (long)var7 + ((long)var6 * (long)var6 + (long)var8 * (long)var8) >> 1426161424);
            if ((var10 ^ -1L) < ((long)re.field_a ^ -1L)) {
              mn.field_g = (int)((long)(256 * ue.field_e) / ((long)ue.field_e + ((long)ap.field_G * (var10 + -(long)re.field_a) >> 238097352)));
              break L0;
            } else {
              mn.field_g = 256;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (var3);
            stackOut_7_1 = new StringBuilder().append("ma.CB(").append(param0).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          L3: {
            stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param2 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
        }
    }

    final boolean b(int param0) {
        if (param0 <= -106) {
          if (this.field_k == null) {
            return false;
          } else {
            return true;
          }
        } else {
          this.field_c = -125L;
          if (this.field_k == null) {
            return false;
          } else {
            return true;
          }
        }
    }

    static {
        field_f = "Inviting <%0>";
    }
}
