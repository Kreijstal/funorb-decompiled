/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gl extends al {
    static rf field_j;
    private long field_n;
    private long field_m;
    static ak field_l;
    private long[] field_q;
    private int field_s;
    static boolean[][] field_x;
    static kg field_t;
    private long field_k;
    static gh field_u;
    private int field_o;
    static String field_r;
    static int field_p;
    static gh field_y;
    static char[] field_w;
    static int field_v;

    final void c(byte param0) {
        gk discarded$0 = null;
        this.field_n = 0L;
        if ((this.field_k ^ -1L) > (this.field_m ^ -1L)) {
            this.field_k = this.field_k + (-this.field_k + this.field_m);
        }
        if (param0 >= -116) {
            String var3 = (String) null;
            discarded$0 = gl.a((cm) null, (byte) 47, (String) null, (String) null);
        }
    }

    final static gk a(cm param0, byte param1, String param2, String param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        gk stackIn_2_0 = null;
        gk stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        gk stackOut_3_0 = null;
        gk stackOut_1_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            var4_int = param0.a(param2, 44);
            if (param1 == 85) {
              var5 = param0.a(var4_int, -32759, param3);
              stackOut_3_0 = va.a(var4_int, param0, true, var5);
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = (gk) null;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var4);
            stackOut_5_1 = new StringBuilder().append("gl.L(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          L2: {
            stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',').append(param1).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param2 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          L3: {
            stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
            stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param3 == null) {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L3;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    final long a(byte param0) {
        this.field_k = this.field_k + this.d((byte) -84);
        if (!(this.field_k >= this.field_m)) {
            return (-this.field_k + this.field_m) / 1000000L;
        }
        if (param0 <= 98) {
            this.field_k = -123L;
        }
        return 0L;
    }

    public static void c(int param0) {
        java.awt.Canvas discarded$0 = null;
        field_l = null;
        field_j = null;
        if (param0 != 0) {
            discarded$0 = gl.a(false);
        }
        field_y = null;
        field_t = null;
        field_x = (boolean[][]) null;
        field_u = null;
        field_w = null;
        field_r = null;
    }

    final static java.awt.Canvas a(boolean param0) {
        if (param0) {
            field_w = (char[]) null;
        }
        return null == wb.field_c ? sl.field_n : (java.awt.Canvas) ((Object) wb.field_c);
    }

    final int a(long param0, byte param1) {
        int var4 = 0;
        int var5 = 0;
        var5 = SteelSentinels.field_G;
        if (param1 == -97) {
          if ((this.field_k ^ -1L) > (this.field_m ^ -1L)) {
            this.field_n = this.field_n + (-this.field_k + this.field_m);
            this.field_k = this.field_k + (-this.field_k + this.field_m);
            this.field_m = this.field_m + param0;
            return 1;
          } else {
            var4 = 0;
            L0: while (true) {
              L1: {
                var4++;
                this.field_m = this.field_m + param0;
                if (var4 >= 10) {
                  break L1;
                } else {
                  if ((this.field_k ^ -1L) < (this.field_m ^ -1L)) {
                    continue L0;
                  } else {
                    break L1;
                  }
                }
              }
              L2: {
                if ((this.field_m ^ -1L) > (this.field_k ^ -1L)) {
                  this.field_m = this.field_k;
                  break L2;
                } else {
                  break L2;
                }
              }
              return var4;
            }
          }
        } else {
          return 92;
        }
    }

    private final long d(byte param0) {
        int var9 = SteelSentinels.field_G;
        long var2 = System.nanoTime();
        long var4 = -this.field_n + var2;
        this.field_n = var2;
        if (var4 > -5000000000L) {
            if (!(-5000000001L >= (var4 ^ -1L))) {
                this.field_q[this.field_o] = var4;
                if (!((this.field_s ^ -1) <= -2)) {
                    this.field_s = this.field_s + 1;
                }
                this.field_o = (1 + this.field_o) % 10;
            }
        }
        long var6 = 0L;
        int var8 = 1;
        if (param0 >= -38) {
            return 114L;
        }
        while (var8 <= this.field_s) {
            var6 = var6 + this.field_q[(10 + this.field_o - var8) % 10];
            var8++;
        }
        return var6 / (long)this.field_s;
    }

    gl() {
        this.field_n = 0L;
        this.field_m = 0L;
        this.field_k = 0L;
        this.field_s = 1;
        this.field_q = new long[10];
        this.field_o = 0;
        this.field_k = System.nanoTime();
        this.field_m = System.nanoTime();
    }

    static {
        field_j = new rf();
        field_r = "<%1> was too close to a bomb intercepted by <%0>";
        field_w = new char[]{(char)8364, (char)0, (char)8218, (char)402, (char)8222, (char)8230, (char)8224, (char)8225, (char)710, (char)8240, (char)352, (char)8249, (char)338, (char)0, (char)381, (char)0, (char)0, (char)8216, (char)8217, (char)8220, (char)8221, (char)8226, (char)8211, (char)8212, (char)732, (char)8482, (char)353, (char)8250, (char)339, (char)0, (char)382, (char)376};
    }
}
