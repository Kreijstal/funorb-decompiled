/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class vb {
    ii field_c;
    static int[][] field_a;
    static String field_e;
    static int field_n;
    ii field_l;
    static int field_r;
    static String field_m;
    ii field_k;
    static boolean field_q;
    ii field_i;
    int field_g;
    long field_j;
    uf field_d;
    volatile int field_b;
    uf field_o;
    byte field_f;
    volatile int field_h;
    db field_p;

    abstract void a(boolean param0, Object param1, byte param2);

    final boolean a(boolean param0) {
        if (!param0) {
          return false;
        }
        return 20 <= this.c((byte) 99) ? true : false;
    }

    abstract void c(int param0);

    final static String a(boolean param0, boolean param1, boolean param2, boolean param3) {
        int var4 = 0;
        if (param2) {
          var4 += 4;
          if (param1) {
            var4 += 2;
          }
          if (!param3) {
            if (!param0) {
              return rc.field_s[var4];
            }
            return (String) null;
          }
          var4++;
          if (!param0) {
            return rc.field_s[var4];
          }
          return (String) null;
        }
        if (param1) {
          var4 += 2;
        }
        if (param3) {
          var4++;
          if (!param0) {
            return rc.field_s[var4];
          }
          return (String) null;
        }
        if (!param0) {
          return rc.field_s[var4];
        }
        return (String) null;
    }

    final int c(byte param0) {
        if (param0 == 99) {
          return this.field_k.a(true) + this.field_i.a(true);
        }
        vb.d(50);
        return this.field_k.a(true) + this.field_i.a(true);
    }

    final int a(byte param0) {
        if (param0 > 74) {
          return this.field_c.a(true) + this.field_l.a(true);
        }
        vb.d(93);
        return this.field_c.a(true) + this.field_l.a(true);
    }

    final db a(boolean param0, int param1, int param2, byte param3, int param4) {
        db stackIn_3_0 = null;
        boolean stackIn_4_1 = false;
        db stackIn_15_0 = null;
        boolean stackIn_16_1 = false;
        long var6;
        db var8;
        long var6Lifetime1;
        db var8Lifetime1;
        if (param4 > 30) {
          var6 = ((long)param1 << 32) + (long)param2;
          var8 = new db();
          stackIn_15_0 = var8;
          stackIn_16_1 = (!param0) ? false : true;
          stackIn_15_0.field_s = stackIn_16_1;
          var8.field_F = param3;
          var8.field_l = var6;
          if (param0) {
            if (this.a((byte) 114) >= 20) {
              throw new RuntimeException();
            }
            this.field_c.a(var8, 3329);
            return var8;
          }
          if (this.c((byte) 99) >= 20) {
            throw new RuntimeException();
          }
          this.field_k.a(var8, 3329);
          return var8;
        }
        field_r = -38;
        var6Lifetime1 = ((long)param1 << 32) + (long)param2;
        var8Lifetime1 = new db();
        stackIn_3_0 = var8Lifetime1;
        stackIn_4_1 = (!param0) ? false : true;
        stackIn_3_0.field_s = stackIn_4_1;
        var8Lifetime1.field_F = param3;
        var8Lifetime1.field_l = var6Lifetime1;
        if (param0) {
          if (this.a((byte) 114) >= 20) {
            throw new RuntimeException();
          }
          this.field_c.a(var8Lifetime1, 3329);
          return var8Lifetime1;
        }
        if (this.c((byte) 99) >= 20) {
          throw new RuntimeException();
        }
        this.field_k.a(var8Lifetime1, 3329);
        return var8Lifetime1;
    }

    public static void d(int param0) {
        field_m = null;
        field_e = null;
        field_a = (int[][]) null;
        if (param0 != 0) {
          field_n = -48;
        }
    }

    abstract void a(int param0);

    final boolean b(byte param0) {
        if (param0 == 100) {
          return this.a((byte) 116) >= 20 ? true : false;
        }
        this.b(41);
        return this.a((byte) 116) >= 20 ? true : false;
    }

    final static String a(int param0, byte param1, int param2) {
        String[] var4 = null;
        String var3 = null;
        if (null == aa.field_h[param0][param2]) {
          var4 = new String[]{wj.field_d, Integer.toString(param2)};
          var3 = qa.a(122, (CharSequence[]) ((Object) var4));
        } else {
          var3 = aa.field_h[param0][param2];
        }
        if (param1 == 109) {
          return var3;
        }
        field_a = (int[][]) null;
        return var3;
    }

    abstract boolean b(int param0);

    vb() {
        this.field_c = new ii();
        this.field_l = new ii();
        this.field_k = new ii();
        this.field_i = new ii();
        this.field_d = new uf(6);
        this.field_f = (byte) 0;
        this.field_h = 0;
        this.field_b = 0;
        this.field_o = new uf(10);
    }

    static {
        field_a = new int[25][2];
        field_n = 0;
        field_e = "Unpacking graphics";
        field_q = false;
    }
}
