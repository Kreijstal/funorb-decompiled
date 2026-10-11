/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ae extends da {
    static int[] field_w;
    static int field_z;
    int[][] field_l;
    static int[] field_m;
    boolean field_n;
    static int[][] field_j;
    long[][] field_t;
    static int[][][] field_u;
    static int field_x;
    static int[] field_s;
    String[][] field_i;
    static char[] field_p;
    static boolean field_C;
    static int field_k;
    static ka[] field_v;
    static int[] field_A;
    int field_r;
    int field_o;
    int field_q;
    static int[] field_y;

    final static void a(byte param0, String[] param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_int = -91 % ((param0 + 22) / 50);
          if (null != ug.field_n) {
            ug.field_n.field_L.a(-6620, param1);
          }
          if (m.field_j == null) {
            return;
          }
          m.field_j.field_L.a(-6620, param1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("ae.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final static void a(int param0) {
        if (param0 != 4) {
          String[] var2 = (String[]) null;
          ae.a((byte) 91, (String[]) null);
          if (bh.field_o != null) {
            bh.field_o.b();
            if (null != re.field_B) {
              re.field_B.b();
            }
            return;
          }
          if (null != re.field_B) {
            re.field_B.b();
          }
          return;
        }
        if (bh.field_o == null) {
          if (null != re.field_B) {
            re.field_B.b();
          }
          return;
        }
        bh.field_o.b();
        if (null != re.field_B) {
          re.field_B.b();
        }
    }

    final static void a(int param0, bk param1, int param2) {
        pa var5 = null;
        int var4 = 0;
        try {
          var5 = dk.field_s;
          var5.d(25, param0);
          var5.field_q = var5.field_q + 1;
          var4 = var5.field_q;
          var5.d(1, (byte) 122);
          var5.d(param1.field_v, (byte) 122);
          if (param2 != -15024) {
            field_A = (int[]) null;
          }
          var5.c((byte) -89, param1.field_o);
          var5.a(param1.field_m, false);
          var5.a(param1.field_k, false);
          var5.a(param1.field_u, false);
          var5.a(param1.field_j, false);
          var5.b(var4, param2 + 29454);
          var5.a(var5.field_q - var4, -111);
        } catch (RuntimeException runtimeException) {
          throw oj.a((Throwable) ((Object) runtimeException), "ae.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    public static void b(boolean param0) {
        field_v = null;
        field_A = null;
        field_s = null;
        field_y = null;
        field_j = (int[][]) null;
        field_u = (int[][][]) null;
        field_w = null;
        field_m = null;
        if (param0) {
          field_p = null;
          return;
        }
        field_k = 83;
        field_p = null;
    }

    ae() {
    }

    static {
        int var1 = 0;
        int var2 = 0;
        int var0;
        field_w = new int[256];
        field_j = new int[][]{new int[]{21, 26}, new int[]{36, 41}};
        field_s = new int[]{64, 96, 96, 64, 96, 64, 32, 96, 64, 32};
        field_p = new char[]{(char)8364, (char)0, (char)8218, (char)402, (char)8222, (char)8230, (char)8224, (char)8225, (char)710, (char)8240, (char)352, (char)8249, (char)338, (char)0, (char)381, (char)0, (char)0, (char)8216, (char)8217, (char)8220, (char)8221, (char)8226, (char)8211, (char)8212, (char)732, (char)8482, (char)353, (char)8250, (char)339, (char)0, (char)382, (char)376};
        field_C = false;
        field_m = new int[]{18, 22, 26};
        field_u = new int[][][]{new int[][]{new int[]{3, 3, 3}, new int[]{3, 3}, new int[]{3, 3}, new int[]{2, 2, 2, 2, 2, 2}, new int[]{3, 3}, new int[]{0}, new int[]{4, 4, 4, 4, 4, 4}}, new int[][]{new int[]{3, 3}, new int[]{3, 3, 3, 3}, new int[]{3, 2, 2, 6, 3, 8}, new int[]{2, 2, 2, 2, 2, 2}, new int[]{3, 2, 2, 2, 3}, new int[]{4, 4, 4, 4, 4}, new int[]{0}}, new int[][]{new int[]{5, 5, 5}, new int[]{5, 5}, new int[]{5, 5, 5, 5}, new int[]{3, 3, 3, 3, 3, 3}, new int[]{5, 5, 5}, new int[]{0}, new int[]{4, 4, 4, 4, 6, 8}}};
        field_A = new int[]{64, 96, 96, 64, 64, 64, 32, 64, 64, 16};
        for (var1 = 0; var1 < 256; var1++) {
          var0 = var1;
          for (var2 = 0; 8 > var2; var2++) {
            if ((1 & var0) != 1) {
              var0 = var0 >>> 1;
            } else {
              var0 = -306674912 ^ var0 >>> 1;
            }
          }
          field_w[var1] = var0;
        }
        field_y = new int[4];
    }
}
