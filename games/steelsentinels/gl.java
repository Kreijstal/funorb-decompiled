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
    static SceneWidget field_u;
    private int field_o;
    static String field_r;
    static int field_p;
    static SceneWidget field_y;
    static char[] field_w;
    static int field_v;

    final void c(byte param0) {
        this.field_n = 0L;
        if (this.field_k < this.field_m) {
          this.field_k = this.field_k + (-this.field_k + this.field_m);
        }
        if (param0 >= -116) {
          String var3 = (String) null;
          gl.a((ResourceArchive) null, (byte) 47, (String) null, (String) null);
        }
    }

    final static IndexedSprite a(ResourceArchive param0, byte param1, String param2, String param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        IndexedSprite stackIn_2_0 = null;
        IndexedSprite stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_int = param0.getGroupId(param2, 44);
          if (param1 != 85) {
            stackIn_2_0 = (IndexedSprite) null;
            return stackIn_2_0;
          }
          var5 = param0.getFileId(var4_int, -32759, param3);
          stackIn_4_0 = va.a(var4_int, param0, true, var5);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_7_0 = var4;
          stackIn_7_1 = new StringBuilder().append("gl.L(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param3 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final long a(byte param0) {
        this.field_k = this.field_k + this.d((byte) -84);
        if (this.field_k < this.field_m) {
          return (-this.field_k + this.field_m) / 1000000L;
        }
        if (param0 <= 98) {
          this.field_k = -123L;
        }
        return 0L;
    }

    public static void c(int param0) {
        field_l = null;
        field_j = null;
        if (param0 != 0) {
          gl.a(false);
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
        int var4;
        int var5;
        var5 = SteelSentinels.obfuscationControl;
        if (param1 != -97) {
          return 92;
        }
        if (this.field_k < this.field_m) {
          this.field_n = this.field_n + (-this.field_k + this.field_m);
          this.field_k = this.field_k + (-this.field_k + this.field_m);
          this.field_m = this.field_m + param0;
          return 1;
        }
        var4 = 0;
        do {
          var4++;
          this.field_m = this.field_m + param0;
        } while (var4 < 10 &&
          this.field_k > this.field_m);
        if (this.field_m < this.field_k) {
          this.field_m = this.field_k;
        }
        return var4;
    }

    private final long d(byte param0) {
        int var9 = SteelSentinels.obfuscationControl;
        long var2 = System.nanoTime();
        long var4 = -this.field_n + var2;
        this.field_n = var2;
        if (var4 > -5000000000L &&
          var4 < 5000000000L) {
          this.field_q[this.field_o] = var4;
          if (this.field_s < 1) {
            this.field_s = this.field_s + 1;
          }
          this.field_o = (1 + this.field_o) % 10;
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
