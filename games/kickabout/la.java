/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class la {
    private int field_b;
    private int field_h;
    private int field_j;
    static ut field_e;
    private int field_g;
    private int field_i;
    private int field_l;
    static int[][] field_k;
    static double field_d;
    static String field_f;
    static ib field_a;
    static int field_c;

    final static boolean b(int param0) {
        if (param0 != 820907312) {
          field_k = (int[][]) null;
          return n.field_c;
        }
        return n.field_c;
    }

    public static void a(byte param0) {
        field_a = null;
        field_f = null;
        field_e = null;
        if (param0 > -96) {
          return;
        }
        field_k = (int[][]) null;
    }

    final void a(int param0, int param1) {
        int var3 = ug.a(param0 ^ -2943, this.field_g >> 16);
        int var4 = lf.a((byte) -123, this.field_b >> 16);
        int var5 = -var3 + ug.a(param0 ^ param0, this.field_i >> 16);
        int var6 = -var4 + lf.a((byte) -117, this.field_h >> 16);
        on.a(var3, var4, var5, var6, param1, 50);
        on.e(var3, var4, var5, var6, param1);
    }

    final static void a(nu param0, int param1) {
        try {
          ja.field_O = true;
          et.field_d = param0;
          if (null == ss.field_b) {
            ss.field_b = gt.c(0);
          }
          ld.field_f = (gm) (et.field_d.field_P[0][3]);
          fc.field_c = (gm) (et.field_d.field_P[0][4]);
          mc.field_a = 0;
          cq.field_g = 640;
          mh.field_k = (gm) (et.field_d.field_P[param1][1]);
          jw.c(1, false);
        } catch (RuntimeException runtimeException) {
          throw nb.a((Throwable) ((Object) runtimeException), "la.F(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final boolean a(int param0, int param1, int param2, int param3) {
        boolean stackIn_15_0 = false;
        boolean stackIn_21_0 = false;
        boolean stackIn_41_0 = false;
        if (param2 == 703166480) {
          if (param0 < this.field_g) {
            return false;
          }
          if (param1 < this.field_b) {
            return false;
          }
          if (this.field_i < param0) {
            return false;
          }
          if (param1 > this.field_h) {
            return false;
          }
          if (this.field_j != this.field_l) {
            if (this.field_l > param3) {
              return false;
            }
            if (param3 > this.field_j) {
              return false;
            }
            return true;
          }
          if (0 <= param3) {
            return true;
          }
          stackIn_41_0 = (this.field_l <= param3) && (param3 <= this.field_j);
          return stackIn_41_0;
        }
        this.a(-14, 82);
        if (param0 < this.field_g) {
          return false;
        }
        if (param1 < this.field_b) {
          return false;
        }
        if (this.field_i < param0) {
          return false;
        }
        if (param1 > this.field_h) {
          return false;
        }
        if (this.field_j != this.field_l) {
          stackIn_15_0 = (this.field_l <= param3) && (param3 <= this.field_j);
          return stackIn_15_0;
        }
        if (0 <= param3) {
          return true;
        }
        stackIn_21_0 = (this.field_l <= param3) && (param3 <= this.field_j);
        return stackIn_21_0;
    }

    final static boolean a(int param0) {
        if (param0 != 100) {
          la.b(78);
          return nb.field_f;
        }
        return nb.field_f;
    }

    la(int param0, int param1, int param2, int param3) {
        this(param0, param1, param2, param3, 0, 0);
    }

    final static void a(boolean param0) {
        ad.a(gk.field_h, (byte) -49);
        if (!param0) {
          field_e = (ut) null;
        }
    }

    la(int param0, int param1, int param2, int param3, int param4, int param5) {
        this.field_i = param2 << 16;
        this.field_j = param5 << 16;
        this.field_h = param3 << 16;
        this.field_l = param4 << 16;
        this.field_b = param1 << 16;
        this.field_g = param0 << 16;
    }

    static {
        field_e = new ut(100, 100);
        field_f = "You can't auction this player as his value is £0";
    }
}
