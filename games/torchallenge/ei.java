/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ei {
    int field_b;
    byte[] field_F;
    int[][] field_q;
    byte field_E;
    int field_t;
    int field_x;
    int field_u;
    int field_l;
    static String field_y;
    int field_m;
    static ka[] field_w;
    byte[] field_f;
    int field_D;
    byte[][] field_g;
    int field_B;
    int[][] field_s;
    byte[] field_A;
    int[] field_i;
    int field_n;
    boolean[] field_v;
    int field_d;
    byte[] field_r;
    int field_G;
    byte[] field_j;
    int[] field_c;
    byte[] field_h;
    boolean[] field_H;
    int[] field_p;
    int field_C;
    int field_a;
    int field_k;
    int[] field_z;
    int[][] field_e;
    int field_o;

    final static void a(byte param0, int param1, int param2) {
        int var3;
        int var4;
        int var3Lifetime1;
        int var4Lifetime1;
        if (param1 >= 0 &&
          14 > param1) {
          if (param0 == 66) {
            var3 = rb.field_c[param1];
            if (var3 < 0) {
              return;
            }
            if (var3 >= 6) {
              return;
            }
            var4 = kc.field_p[var3];
            if (var4 < wa.field_sb[var3]) {
              wa.field_sb[var3] = var4;
            }
            if (wa.field_sb[var3] < 0) {
              wh.a(param2, param1, -112);
              wa.field_sb[var3] = var4;
            }
            return;
          }
          field_y = (String) null;
          var3Lifetime1 = rb.field_c[param1];
          if (var3Lifetime1 < 0) {
            return;
          }
          if (var3Lifetime1 >= 6) {
            return;
          }
          var4Lifetime1 = kc.field_p[var3Lifetime1];
          if (var4Lifetime1 < wa.field_sb[var3Lifetime1]) {
            wa.field_sb[var3Lifetime1] = var4Lifetime1;
          }
          if (wa.field_sb[var3Lifetime1] < 0) {
            wh.a(param2, param1, -112);
            wa.field_sb[var3Lifetime1] = var4Lifetime1;
          }
          return;
        }
    }

    final static boolean a(byte param0, CharSequence param1) {
        RuntimeException var2 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -117) {
            ei.a(68);
          }
          stackIn_3_0 = ci.a(10, param1, -18, true);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("ei.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_w = null;
        if (param0 >= -35) {
          return;
        }
        field_y = null;
    }

    ei() {
        this.field_l = 0;
        this.field_D = 0;
        this.field_q = new int[6][258];
        this.field_j = new byte[256];
        this.field_F = new byte[18002];
        this.field_s = new int[6][258];
        this.field_v = new boolean[16];
        this.field_g = new byte[6][258];
        this.field_r = new byte[18002];
        this.field_H = new boolean[256];
        this.field_i = new int[6];
        this.field_z = new int[257];
        this.field_p = new int[256];
        this.field_A = new byte[4096];
        this.field_e = new int[6][258];
        this.field_c = new int[16];
    }

    static {
        field_y = "CRC mismatch - unable to get a valid download. Please check any firewall/antivirus/filtering software.";
    }
}
