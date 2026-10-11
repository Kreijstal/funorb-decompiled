/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ok extends wi {
    private int field_N;
    static boolean field_w;
    private int field_K;
    private int field_t;
    private int field_q;
    int field_G;
    private int field_D;
    private int field_O;
    static int[] field_s;
    static int field_L;
    private int field_E;
    private int field_M;
    private int field_u;
    private String field_v;
    int field_H;
    int field_z;
    int field_J;
    private int field_F;
    static bd field_x;
    private int field_r;
    private fa field_I;
    static String field_B;
    int field_C;
    private boolean field_A;
    static dd field_y;

    final boolean a(byte param0) {
        if (param0 < 67) {
          this.c(-58);
          if (this.field_C > ag.field_f) {
            return false;
          }
          if (this.field_H > kc.field_b) {
            return false;
          }
          if (ag.field_f > this.field_C + this.field_G) {
            return false;
          }
          if (this.field_H + this.field_z >= kc.field_b) {
            return true;
          }
          return false;
        }
        if (this.field_C > ag.field_f) {
          return false;
        }
        if (this.field_H > kc.field_b) {
          return false;
        }
        if (ag.field_f > this.field_C + this.field_G) {
          return false;
        }
        if (this.field_H + this.field_z >= kc.field_b) {
          return true;
        }
        return false;
    }

    final void d(int param0) {
        int stackIn_28_1 = 0;
        int stackIn_40_1 = 0;
        int stackIn_62_1 = 0;
        if (!this.field_k) {
          this.field_c = false;
          this.field_J = 0;
          return;
        }
        boolean decompiledFrameRemainder0 = true;
        if (this.a((byte) 70)) {
          if (this.field_A) {
            if (this.field_A &&
              !this.a((byte) 71)) {
              if (this.field_J <= 50) {
                stackIn_28_1 = this.field_J;
              } else {
                stackIn_28_1 = 50;
              }
              this.field_J = stackIn_28_1;
            }
            decompiledFrameRemainder0 = false;
          }
          else {
            if (this.field_J >= 0) {
              stackIn_40_1 = this.field_J;
            } else {
              stackIn_40_1 = -50;
            }
            this.field_J = stackIn_40_1;
          }
        }
        if ((decompiledFrameRemainder0) && (this.field_A &&
          !this.a((byte) 71))) {
          if (this.field_J <= 50) {
            stackIn_62_1 = this.field_J;
          } else {
            stackIn_62_1 = 50;
          }
          this.field_J = stackIn_62_1;
        }
        if (!this.a((byte) 77)) {
          this.field_J = this.field_J - 1;
        } else {
          this.field_J = this.field_J + 1;
        }
        if (param0 < 63) {
          return;
        }
        this.field_A = this.a((byte) 112);
    }

    public static void b(boolean param0) {
        field_y = null;
        field_s = null;
        field_B = null;
        if (param0) {
          return;
        }
        field_x = null;
    }

    final void c(int param0) {
        int var2 = 5 * this.field_J;
        int var3 = 123 % ((-41 - param0) / 48);
        if (var2 < 0) {
          var2 = 0;
        }
        if (255 < var2) {
          var2 = 255;
        }
        if (0 != var2) {
          gb.a(ia.field_q);
          gb.a(this.field_l, this.field_a, this.field_l + this.field_n, this.field_a + this.field_d);
          gb.g(1 + this.field_l, 1 + this.field_a, -2 + this.field_n, -2 + this.field_d, k.field_a & this.field_E, (this.field_E >>> ii.field_b) * var2 >>> 8);
          this.field_I.a(this.field_v, this.field_l + this.field_O, 1 + this.field_a + this.field_t, -this.field_O + (-this.field_q + this.field_n), -2 + this.field_d, this.field_N & k.field_a, this.field_r & k.field_a, (this.field_N >>> ii.field_b) * var2 >>> 8, this.field_u, this.field_K, this.field_D);
          gb.e(this.field_l, this.field_a, this.field_n, this.field_d, this.field_F & k.field_a, (this.field_F >>> ii.field_b) * var2 >>> 8);
          gb.b(ia.field_q);
          gb.g(this.field_l, this.field_a + this.field_d, this.field_n, k.field_a & this.field_M, (this.field_M >>> ii.field_b) * var2 >>> 8);
          gb.c(this.field_l + this.field_n, this.field_a, this.field_d - 1, k.field_a & this.field_M, (this.field_M >>> ii.field_b) * var2 >>> 8);
          return;
        }
    }

    ok(int param0, int param1, String param2, fa param3) {
        this.field_K = 0;
        this.field_N = -16777216;
        this.field_O = 5;
        this.field_E = -63;
        this.field_u = 0;
        this.field_M = -2147483648;
        this.field_t = 0;
        this.field_J = 0;
        this.field_F = -16777216;
        this.field_r = -1;
        this.field_q = 5;
        try {
          this.field_I = param3;
          this.field_a = param1;
          this.field_v = param2;
          this.field_l = param0;
          this.field_n = this.field_q - (-this.field_O + (-(this.field_I.b(this.field_v) / 3) - 5));
          this.field_D = this.field_I.field_N;
          this.field_d = (int)((double)this.field_I.field_N * ((double)this.field_I.a(this.field_v, -this.field_O - this.field_q + this.field_n) + 0.5));
        } catch (RuntimeException runtimeException) {
          throw pf.a((Throwable) ((Object) runtimeException), "ok.<init>(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_s = new int[150];
        field_w = false;
        field_B = "Connection timed out. Please try using a different server.";
    }
}
