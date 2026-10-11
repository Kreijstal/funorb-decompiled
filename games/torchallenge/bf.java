/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bf {
    static k field_g;
    static int[][] field_o;
    int field_b;
    private boolean field_i;
    int field_k;
    private long field_e;
    static fe[][] field_c;
    private String field_a;
    String field_n;
    static int[] field_f;
    private int field_h;
    int[] field_j;
    static int[][] field_d;
    static int[] field_l;
    int field_m;

    public static void a(int param0) {
        field_f = null;
        field_g = null;
        field_l = null;
        if (param0 != -14471) {
          bf.a(-119, 98, (byte) 12);
        }
        field_o = (int[][]) null;
        field_d = (int[][]) null;
        field_c = (fe[][]) null;
    }

    final static ka[] a(int param0, byte param1, int param2, int param3, int param4) {
        if (param1 <= 30) {
          return (ka[]) null;
        }
        return e.a(3, param2, 1, 1065, 1, param4, param3, param0, 1);
    }

    final int a(byte param0) {
        if (!this.field_i && (this.field_b != 2 ||
          0 >= this.field_h)) {
          if (jl.field_h == this.field_e) {
            return 1;
          }
          if (param0 != -116) {
            return -107;
          }
          if (2 != oj.field_f) {
            return 0;
          }
          if (ta.a(-93, this.field_a)) {
            return 1;
          }
          return 0;
        }
        return 2;
    }

    final static void a(int param0, int param1, byte param2) {
        int var3;
        int var4;
        int var8;
        int var5;
        int var6;
        int var7;
        var8 = TorChallenge.field_F ? 1 : 0;
        var4 = 7 % ((param2 + 45) / 32);
        if (0 != param1) {
          if (param1 != 1) {
            return;
          }
          var3 = nk.field_h;
        } else {
          var3 = sh.field_r;
        }
        if (var3 > param0 >> 3) {
          var5 = var3 % (param0 >> 3);
          if (0 == var5) {
            var5 = param0 >> 3;
          }
          var6 = var3 - var5;
          var7 = param0 - (param0 >> 3 << 3);
          if (var7 >= param0 - var6) {
            var6 = (7 * param0 >> 3) - var5;
          }
          if (0 == param1) {
            vk.a(var6, (byte) 74);
          } else {
            if (param1 == 1) {
              nb.b(var6, -1);
            }
          }
        } else {
          if (param1 != 0) {
            if (param1 == 1) {
              nb.b(0, -1);
            }
          } else {
            vk.a(0, (byte) 81);
          }
        }
    }

    bf(boolean param0) {
        this.field_e = ik.field_b;
        this.field_k = hc.field_O;
        this.field_b = uk.field_L;
        this.field_a = lk.field_b;
        if (!param0) {
          this.field_j = null;
        } else {
          this.field_j = eb.field_k;
        }
        this.field_h = ih.field_K;
        this.field_n = td.field_q;
        this.field_i = o.field_m;
        this.field_m = hf.field_e;
    }

    static {
        field_o = new int[][]{new int[]{15, 16}, new int[]{46, 47}};
        field_c = new fe[3][9];
        field_f = new int[]{40, 60, 35};
        field_d = new int[][]{new int[]{256, 256, 256}, new int[]{256, 256, 256}, new int[]{256, 256, 256}, new int[]{256, 256, 256}, new int[]{256, 224, 256}, new int[]{256, 256, 256}, new int[]{256, 256, 256}, new int[]{256, 256, 256}, new int[]{256, 256, 256}};
        field_l = new int[4];
        field_g = new k(9, 0, 4, 1);
    }
}
