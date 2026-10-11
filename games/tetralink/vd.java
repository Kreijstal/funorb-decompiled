/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vd {
    private int[] field_d;
    static mi field_c;
    private boolean field_f;
    static String field_h;
    private int field_j;
    private int field_e;
    static String field_i;
    static int field_a;
    static String field_g;
    static String field_b;

    private final void a(boolean param0, int param1) {
        int[] var4 = null;
        int[] var3 = null;
        int[] var4Lifetime1;
        int[] var3Lifetime1;
        if (param0) {
          var4 = new int[this.b(0, param1)];
          var3 = var4;
          rd.a(this.field_d, 0, var4, 0, this.field_d.length);
          this.field_d = var4;
          return;
        }
        this.field_j = 31;
        var4Lifetime1 = new int[this.b(0, param1)];
        var3Lifetime1 = var4Lifetime1;
        rd.a(this.field_d, 0, var4Lifetime1, 0, this.field_d.length);
        this.field_d = var4Lifetime1;
    }

    public static void a(byte param0) {
        field_i = null;
        field_c = null;
        if (param0 >= 32) {
          field_h = null;
          field_b = null;
          field_g = null;
          return;
        }
        vd.a((byte) -56);
        field_h = null;
        field_b = null;
        field_g = null;
    }

    final void a(int param0, int param1) {
        if (param0 != 0) {
          this.a(false, 25);
          if (param1 < 0) {
            throw new ArrayIndexOutOfBoundsException(param1);
          }
          if (param1 > this.field_j) {
            throw new ArrayIndexOutOfBoundsException(param1);
          }
          if (this.field_j != param1) {
            rd.a(this.field_d, param1 + 1, this.field_d, param1, this.field_j - param1);
            this.field_j = this.field_j - 1;
            return;
          }
          this.field_j = this.field_j - 1;
          return;
        }
        if (param1 < 0) {
          throw new ArrayIndexOutOfBoundsException(param1);
        }
        if (param1 > this.field_j) {
          throw new ArrayIndexOutOfBoundsException(param1);
        }
        if (this.field_j == param1) {
          this.field_j = this.field_j - 1;
          return;
        }
        rd.a(this.field_d, param1 + 1, this.field_d, param1, this.field_j - param1);
        this.field_j = this.field_j - 1;
    }

    final int a(int param0, byte param1) {
        if (this.field_j < param0) {
          throw new ArrayIndexOutOfBoundsException(param0);
        }
        if (param1 == 11) {
          return this.field_d[param0];
        }
        vd.b(true, 17);
        return this.field_d[param0];
    }

    private vd() throws Throwable {
        throw new Error();
    }

    final void a(byte param0, int param1) {
        if (param0 > 79) {
          this.a(false, param1, this.field_j + 1);
          return;
        }
        this.a(-79, (byte) 90);
        this.a(false, param1, this.field_j + 1);
    }

    final static void b(boolean param0, int param1) {
        hl stackIn_7_0 = null;
        boolean stackIn_8_1 = false;
        hl stackIn_11_0 = null;
        boolean stackIn_12_1 = false;
        hl stackIn_20_0 = null;
        boolean stackIn_21_1 = false;
        hl stackIn_24_0 = null;
        boolean stackIn_25_1 = false;
        hl stackIn_33_0 = null;
        boolean stackIn_34_1 = false;
        hl stackIn_37_0 = null;
        boolean stackIn_38_1 = false;
        hl stackIn_47_0 = null;
        boolean stackIn_48_1 = false;
        hl stackIn_51_0 = null;
        boolean stackIn_52_1 = false;
        hl stackIn_61_0 = null;
        boolean stackIn_62_1 = false;
        hl stackIn_65_0 = null;
        boolean stackIn_66_1 = false;
        kl.a(640 + ra.field_f >> 1, ra.field_e, 0, (byte) -79, -640 + ra.field_f >> 1);
        if (qd.field_ab <= 0) {
          if (ng.field_t > param1) {
            if (hd.field_r != null) {
              hd.field_r.b(tl.field_P.field_M, 0);
            }
            stackIn_47_0 = tl.field_P;
            stackIn_48_1 = (param0) && (!lg.field_S);
            ((hl) (Object) stackIn_47_0).a(stackIn_48_1, 256);
            stackIn_51_0 = fk.field_V;
            stackIn_52_1 = (param0) && (!lg.field_S);
            ((hl) (Object) stackIn_51_0).a(stackIn_52_1, param1 + 256);
          } else {
            if (am.field_f > 0) {
              if (hd.field_r != null) {
                hd.field_r.b(tl.field_P.field_M, 0);
              }
              stackIn_61_0 = tl.field_P;
              stackIn_62_1 = (param0) && (!lg.field_S);
              ((hl) (Object) stackIn_61_0).a(stackIn_62_1, 256);
              stackIn_65_0 = fk.field_V;
              stackIn_66_1 = (param0) && (!lg.field_S);
              ((hl) (Object) stackIn_65_0).a(stackIn_66_1, param1 + 256);
            }
          }
        } else {
          if (null != hd.field_r) {
            hd.field_r.b(hn.field_P.field_M, 0);
          }
          stackIn_7_0 = hn.field_P;
          stackIn_8_1 = (param0) && (!hm.field_b);
          ((hl) (Object) stackIn_7_0).a(stackIn_8_1, 256);
          stackIn_11_0 = qe.field_c;
          stackIn_12_1 = (param0) && (!hm.field_b);
          ((hl) (Object) stackIn_11_0).a(stackIn_12_1, 256);
          if (ng.field_t > param1) {
            if (hd.field_r != null) {
              hd.field_r.b(tl.field_P.field_M, 0);
            }
            stackIn_33_0 = tl.field_P;
            stackIn_34_1 = (param0) && (!lg.field_S);
            ((hl) (Object) stackIn_33_0).a(stackIn_34_1, 256);
            stackIn_37_0 = fk.field_V;
            stackIn_38_1 = (param0) && (!lg.field_S);
            ((hl) (Object) stackIn_37_0).a(stackIn_38_1, param1 + 256);
          } else {
            if (am.field_f > 0) {
              if (hd.field_r != null) {
                hd.field_r.b(tl.field_P.field_M, 0);
              }
              stackIn_20_0 = tl.field_P;
              stackIn_21_1 = (param0) && (!lg.field_S);
              ((hl) (Object) stackIn_20_0).a(stackIn_21_1, 256);
              stackIn_24_0 = fk.field_V;
              stackIn_25_1 = (param0) && (!lg.field_S);
              ((hl) (Object) stackIn_24_0).a(stackIn_25_1, param1 + 256);
            }
          }
        }
        dh.a(-581);
    }

    private final int b(int param0, int param1) {
        int var3;
        int var4;
        var4 = TetraLink.field_J;
        var3 = this.field_d.length;
        while (var3 <= param1) {
          if (!this.field_f) {
            var3 = var3 + this.field_e;
            continue;
          }
          if (0 != var3) {
            var3 = var3 * this.field_e;
            continue;
          }
          var3 = 1;
        }
        if (param0 == 0) {
          return var3;
        }
        vd.a((byte) -117);
        return var3;
    }

    final int a(boolean param0) {
        if (param0) {
          vd.a((byte) -40);
          return 1 + this.field_j;
        }
        return 1 + this.field_j;
    }

    private final void a(boolean param0, int param1, int param2) {
        if (param2 > this.field_j) {
          this.field_j = param2;
          if (this.field_d.length > param2) {
            this.field_d[param2] = param1;
            if (!param0) {
              return;
            }
            this.a(26, (byte) 120);
            return;
          }
          this.a(true, param2);
          this.field_d[param2] = param1;
          if (param0) {
            this.a(26, (byte) 120);
            return;
          }
          return;
        }
        if (this.field_d.length <= param2) {
          this.a(true, param2);
          this.field_d[param2] = param1;
          if (!param0) {
            return;
          }
          this.a(26, (byte) 120);
          return;
        }
        this.field_d[param2] = param1;
        if (!param0) {
          return;
        }
        this.a(26, (byte) 120);
    }

    static {
        field_i = "<%0> might change the options - wait and see.";
        field_g = "Toggle fullscreen mode";
        field_b = "To <%0>: ";
    }
}
