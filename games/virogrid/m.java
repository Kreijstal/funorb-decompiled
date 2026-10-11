/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class m {
    private uf field_l;
    bi field_j;
    int field_e;
    int field_k;
    static mg[] field_f;
    static int[] field_i;
    byte[][] field_d;
    static byte[] field_a;
    private int field_b;
    static int field_m;
    int field_c;
    boolean[][] field_h;
    p field_g;

    final void a(int param0) {
        byte[] stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        int stackIn_17_2 = 0;
        int var2;
        fb var3;
        int var4;
        int var5;
        var5 = Virogrid.field_F ? 1 : 0;
        var2 = 2 % ((-69 - param0) / 55);
        var3 = (fb) (this.field_g.a((byte) -87));
        while (var3 != null) {
          var4 = var3.field_j;
          if (var4 != 0) {
            if (1 != var4) {
              if (var4 == 2) {
                var3.field_n = var3.field_n - 3;
                var3.field_h = var3.field_h - 40;
                if (var3.field_n < 0 &&
                  var3.field_h < 0) {
                  vm.$cfr$intArgs$a$45c25716b3df(30, td.field_d[sh.a(4712, 5)]);
                  stackIn_16_0 = this.field_d[var3.field_g];
                  stackIn_16_1 = var3.field_k;
                  if (!var3.field_q) {
                    stackIn_17_2 = 1;
                  } else {
                    stackIn_17_2 = 0;
                  }
                  stackIn_16_0[stackIn_16_1] = (byte)stackIn_17_2;
                  var3.a(false);
                }
                if (var3.field_n < 0) {
                  var3.field_n = 0;
                }
                if (0 > var3.field_h) {
                  var3.field_h = 0;
                }
              }
            } else {
              var3.field_n = var3.field_n + 4;
              if (var3.field_n > 28) {
                var3.field_n = 28;
                var3.field_j = 2;
              }
            }
          } else {
            var3.field_h = var3.field_h + 40;
            if (var3.field_h > 240) {
              var3.field_h = 240;
              var3.field_j = 1;
            }
          }
          if (this.field_l.field_g &&
            var3.field_j < 1) {
            return;
          }
          var3 = (fb) (this.field_g.a(16213));
        }
        return;
    }

    private final boolean a(int param0, int param1, int param2) {
        boolean stackIn_7_0 = false;
        if (param2 >= -108) {
          this.a(false, -57);
        }
        stackIn_7_0 = (null != this.field_j) && (param0 == this.field_j.field_a) && (this.field_j.field_b == param1);
        return stackIn_7_0;
    }

    final static ka a(byte param0, int param1) {
        if (param0 <= 63) {
          field_f = (mg[]) null;
        }
        ka var2 = new ka();
        tf.field_a.a(var2, (byte) -50);
        fn.a(param1, true);
        return var2;
    }

    final static int b(boolean param0) {
        ql.field_q.b((byte) -116);
        if (!param0) {
          m.a((byte) -1, 53);
        }
        if (!ji.field_e.d(-57)) {
          return dk.b((byte) 108);
        }
        return 0;
    }

    public static void b(int param0) {
        field_a = null;
        field_i = null;
        if (param0 != -314) {
          field_f = (mg[]) null;
        }
        field_f = null;
    }

    final void a(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = Virogrid.field_F ? 1 : 0;
        for (var2 = 0; this.field_d.length > var2; var2++) {
          for (var3 = 0; var3 < this.field_d[0].length; var3++) {
            this.field_d[var2][var3] = this.field_l.field_C[var2][var3];
          }
        }
        this.field_j = null;
        this.field_g.a(param0);
        this.field_l.a(this.field_h, this.field_l.field_A, (byte) 14);
    }

    final void a(boolean param0, int param1) {
        int var7 = 0;
        int var8 = 0;
        boolean discarded$0 = false;
        int stackIn_5_1 = 0;
        int stackIn_5_2 = 0;
        boolean stackIn_6_3 = false;
        int stackIn_28_1 = 0;
        int stackIn_28_2 = 0;
        boolean stackIn_29_3 = false;
        int stackIn_54_1 = 0;
        int stackIn_54_2 = 0;
        boolean stackIn_55_3 = false;
        int var3;
        int var4;
        int var5;
        int var6;
        int var9;
        int var3Lifetime1;
        int var4Lifetime1;
        int var5Lifetime1;
        var9 = Virogrid.field_F ? 1 : 0;
        if (-1 < this.field_l.field_m &&
          -1 < this.field_l.field_w) {
          stackIn_5_1 = this.field_l.field_w;
          stackIn_5_2 = this.field_l.field_m;
          stackIn_6_3 = (this.field_l.field_C[this.field_l.field_m][this.field_l.field_w] == 0);
          if (!this.a(stackIn_5_1, stackIn_5_2, stackIn_6_3, 16238)) {
            this.a(this.field_l.field_m, (byte) 99, this.field_l.field_w);
          }
          var3 = -1 + this.field_l.field_m;
          if (var3 < 0) {
            var3 = 0;
          }
          var4 = this.field_l.field_m + 1;
          if (var4 >= this.field_l.field_C.length) {
            var4 = this.field_l.field_C.length - 1;
          }
          var5 = this.field_l.field_w + 1;
          if (this.field_l.field_C[0].length <= var5) {
            var5 = this.field_l.field_C[0].length - 1;
          }
          var6 = this.field_l.field_w - 1;
          if (var6 < 0) {
            var6 = 0;
          }
          for (var7 = var3; var7 <= var4; var7++) {
            for (var8 = var6; var8 <= var5; var8++) {
              if (1 - this.field_l.field_C[this.field_l.field_m][this.field_l.field_w] == this.field_d[var7][var8]) {
                stackIn_28_1 = var8;
                stackIn_28_2 = var7;
                stackIn_29_3 = (this.field_l.field_C[var7][var8] == 0);
                if (!this.a(stackIn_28_1, stackIn_28_2, stackIn_29_3, 16238)) {
                  this.a(var7, (byte) -119, var8);
                }
              }
            }
          }
        }
        if (param1 != 31626) {
          discarded$0 = this.a(49, 29, 84);
        }
        for (var3Lifetime1 = 0; var3Lifetime1 < this.field_d.length; var3Lifetime1++) {
          for (var4Lifetime1 = 0; this.field_d[0].length > var4Lifetime1; var4Lifetime1++) {
            var5Lifetime1 = this.field_d[var3Lifetime1][var4Lifetime1] ^ this.field_l.field_C[var3Lifetime1][var4Lifetime1];
            if (var5Lifetime1 != 0) {
              if (this.field_l.field_C[var3Lifetime1][var4Lifetime1] == -1) {
                this.field_d[var3Lifetime1][var4Lifetime1] = this.field_l.field_C[var3Lifetime1][var4Lifetime1];
              } else {
                if (0 != var5Lifetime1) {
                  stackIn_54_1 = var4Lifetime1;
                  stackIn_54_2 = var3Lifetime1;
                  stackIn_55_3 = (this.field_l.field_C[var3Lifetime1][var4Lifetime1] == 0);
                  if (!this.a(stackIn_54_1, stackIn_54_2, stackIn_55_3, 16238)) {
                    this.a(var3Lifetime1, (byte) -116, var4Lifetime1);
                  }
                }
              }
            }
          }
        }
        if (param0) {
          this.field_l.a((byte) -78);
        }
        this.field_l.a(this.field_h, -this.field_l.field_A + 1, (byte) 14);
    }

    private final boolean a(int param0, int param1, boolean param2, int param3) {
        int var6 = Virogrid.field_F ? 1 : 0;
        if (param3 != 16238) {
          return true;
        }
        fb var5 = (fb) (this.field_g.a((byte) -68));
        while (var5 != null) {
          if (param2 == var5.field_q &&
            param0 == var5.field_k &&
            var5.field_g == param1) {
            return true;
          }
          var5 = (fb) (this.field_g.a(16213));
        }
        return false;
    }

    private final void a(int param0, byte param1, int param2) {
        int var4;
        int var5;
        var5 = Virogrid.field_F ? 1 : 0;
        var4 = -48 % ((param1 + 36) / 54);
        if (this.field_l.field_C[param0][param2] == 0) {
          if (this.field_b == 0 &&
            this.a(param2, param0, -124)) {
            this.field_g.a(new fb(this.field_j, true), (byte) -100);
            this.field_j = null;
          } else {
            this.field_g.a(new fb(param2, param0, true), (byte) -41);
            vm.$cfr$intArgs$a$45c25716b3df(30, tk.field_c[sh.a(4712, 5)]);
          }
        } else {
          if (this.field_l.field_C[param0][param2] == 1) {
            if (this.field_b == 1 &&
              this.a(param2, param0, -111)) {
              this.field_g.a(new fb(this.field_j, false), (byte) -75);
              this.field_j = null;
            } else {
              this.field_g.a(new fb(param2, param0, false), (byte) -51);
              vm.$cfr$intArgs$a$45c25716b3df(30, tk.field_c[sh.a(4712, 5)]);
            }
          }
        }
    }

    m(uf param0, int param1) {
        int var3_int = 0;
        int var4 = 0;
        this.field_k = -1;
        this.field_c = -1;
        try {
          this.field_b = param1;
          this.field_l = param0;
          this.field_g = new p();
          this.field_d = new byte[this.field_l.field_C.length][this.field_l.field_C[0].length];
          for (var3_int = 0; var3_int < this.field_d.length; var3_int++) {
            for (var4 = 0; this.field_d[0].length > var4; var4++) {
              this.field_d[var3_int][var4] = this.field_l.field_C[var3_int][var4];
            }
          }
          this.field_h = new boolean[this.field_d.length][this.field_d[0].length];
          this.field_e = -1;
          this.field_l.a(this.field_h, this.field_l.field_A, (byte) 14);
        } catch (RuntimeException runtimeException) {
          throw kg.a((Throwable) ((Object) runtimeException), "m.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        field_i = new int[4];
        field_a = new byte[]{(byte)2, (byte) 1};
    }
}
