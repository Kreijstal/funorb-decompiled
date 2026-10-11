/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ld extends kf {
    static int[] field_M;
    static String field_O;
    private int field_R;
    private int field_P;
    private int field_N;
    private int field_Q;
    private int field_L;
    private int field_K;

    ld(i param0, int param1, int param2) {
        super(param0, param1, param2);
        this.field_P = 0;
        this.field_L = 0;
    }

    final void b(int param0, int param1, int param2, int param3) {
        if (0 >= param2) {
          this.b(param3, -2038584927, param0);
          return;
        }
        this.field_L = param2;
        this.field_K = this.field_x;
        this.field_N = param0;
        this.field_Q = this.field_t;
        this.field_R = param3;
        this.field_P = param1;
    }

    final static lf j(int param0) {
        try {
          Throwable var1 = null;
          lf stackIn_3_0 = null;
          Throwable decompiledCaughtException = null;
          if (param0 != 0) {
            ld.c(-118, -71, 91);
          }
          try {
            stackIn_3_0 = (lf) (Class.forName("sc").newInstance());
            return stackIn_3_0;
          } catch (java.lang.Throwable decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var1 = decompiledCaughtException;
            return null;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void k(int param0) {
        field_O = null;
        field_M = null;
        int var1 = -31 % ((-28 - param0) / 50);
    }

    void a(int param0, byte param1, int param2) {
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        int var16;
        int var17;
        int var4Lifetime1;
        int var4Lifetime2;
        int var5Lifetime1;
        int var5Lifetime2;
        int var7Lifetime1;
        int var7Lifetime2;
        int var8Lifetime1;
        int var8Lifetime2;
        int var9Lifetime1;
        int var9Lifetime2;
        int var10Lifetime1;
        int var10Lifetime2;
        int var13Lifetime1;
        int var14Lifetime1;
        var17 = SolKnight.field_L ? 1 : 0;
        mi.e(param0 + 6, 35 + param2, -12 + this.field_t, this.field_x - 40, 2105376, 0);
        var5 = 211;
        var6 = -45 % ((param1 + 55) / 39);
        var4 = 35;
        var7 = 194;
        var8 = 0;
        var9 = param2;
        while (var8 < var4) {
          if (mi.field_l <= var9 &&
            var9 < mi.field_e) {
            var10 = (-var5 + var7) * var8 / var4 + var5;
            var11 = 0;
            var12 = this.field_t;
            if (var8 <= 20) {
              while (20 >= var11) {
                var13 = (20 - var8) * (-var8 + 20) + (20 - var11) * (20 - var11);
                if (var13 <= 462) {
                  if (var13 < 420) {
                    break;
                  }
                  var14 = (462 - var13) * var10 / 42;
                  var14 = var14 | (var14 << 8 | var14 << 16);
                  mi.field_f[var11 + (param0 + var9 * mi.field_a)] = var14;
                }
                var11++;
              }
            }
            if (var8 <= 20) {
              var13Lifetime1 = var12;
              var12 -= 21;
              for (var14Lifetime1 = 0; var14Lifetime1 <= 20; var14Lifetime1++) {
                var15 = var14Lifetime1 * var14Lifetime1 + (-var8 + 20) * (20 - var8);
                if (var15 <= 462) {
                  if (var15 >= 420) {
                    var16 = var10 * (-var15 + 462) / 42;
                    var16 = var16 | (var16 << 16 | var16 << 8);
                    mi.field_f[var12 + var9 * mi.field_a + param0] = var16;
                  } else {
                    var13Lifetime1 = 1 + var12;
                  }
                  var12++;
                  continue;
                }
                break;
              }
              var12 = var13Lifetime1;
            }
            var10 = var10 | (var10 << 16 | var10 << 8);
            mi.b(var11 + param0, var9, -var11 + var12, var10);
          }
          var9++;
          var8++;
        }
        var5Lifetime1 = 194;
        var4Lifetime1 = 22;
        var7Lifetime1 = 169;
        var8Lifetime1 = 0;
        var9Lifetime1 = param2 + 35;
        while (var4Lifetime1 > var8Lifetime1) {
          var10Lifetime1 = var5Lifetime1 + (-var5Lifetime1 + var7Lifetime1) * var8Lifetime1 / var4Lifetime1;
          var10Lifetime1 = var10Lifetime1 | (var10Lifetime1 << 8 | var10Lifetime1 << 16);
          mi.b(param0, var9Lifetime1, 6, var10Lifetime1);
          mi.b(-6 + (this.field_t + param0), var9Lifetime1, 6, var10Lifetime1);
          var9Lifetime1++;
          var8Lifetime1++;
        }
        fa.field_b.d(param0 - (-this.field_t + 90), param2 + 10);
        je.a(fi.field_a, 5 + param0, param2 + 35, this.field_t - 10, (byte) 93);
        je.a(qk.field_l, param0, -22 + (this.field_x + param2), this.field_t, (byte) 114);
        var7Lifetime2 = 127;
        var4Lifetime2 = -79 + this.field_x;
        var5Lifetime2 = 169;
        var8Lifetime2 = 0;
        var9Lifetime2 = param2 + 57;
        while (var4Lifetime2 > var8Lifetime2) {
          var10Lifetime2 = var5Lifetime2 + var8Lifetime2 * (-var5Lifetime2 + var7Lifetime2) / var4Lifetime2;
          var10Lifetime2 = var10Lifetime2 | (var10Lifetime2 << 8 | var10Lifetime2 << 16);
          mi.b(param0, var9Lifetime2, 6, var10Lifetime2);
          mi.b(-6 + (this.field_t + param0), var9Lifetime2, 6, var10Lifetime2);
          var8Lifetime2++;
          var9Lifetime2++;
        }
    }

    boolean h(int param0) {
        int var2 = 0;
        int var3 = 0;
        int fieldTemp$0 = 0;
        int var4 = 0;
        int var5 = 0;
        if (param0 != 1784) {
          this.field_K = 81;
        }
        if (this.field_L <= 0) {
        } else {
          var2 = this.field_R;
          var3 = this.field_N;
          fieldTemp$0 = this.field_P + 1;
          this.field_P = this.field_P + 1;
          if (fieldTemp$0 >= this.field_L) {
            this.field_L = 0;
            this.l(7107);
          } else {
            var4 = this.field_P * (-this.field_P + 2 * this.field_L);
            var5 = this.field_L * this.field_L;
            var3 = var4 * (-this.field_K + this.field_N) / var5 + this.field_K;
            var2 = this.field_Q + var4 * (-this.field_Q + this.field_R) / var5;
          }
          this.b(var2, -2038584927, var3);
        }
        return super.h(param0 + 0);
    }

    final static void c(int param0, int param1, int param2) {
        if (null == vg.field_I ||
          !(param1 <= vg.field_I.length)) {
          vg.field_I = new int[2 * param1];
        }
        if (qg.field_c == null ||
          !(param1 <= qg.field_c.length)) {
          qg.field_c = new int[2 * param1];
        }
        if (null == eh.field_a ||
          !(param1 <= eh.field_a.length)) {
          eh.field_a = new int[param1 * 2];
        }
        if (field_M == null ||
          !(param1 <= field_M.length)) {
          field_M = new int[param1 * 2];
        }
        if (null == ma.field_n ||
          !(ma.field_n.length >= param1)) {
          ma.field_n = new int[param1 * 2];
        }
        if (null == l.field_a ||
          !(l.field_a.length >= param1)) {
          l.field_a = new int[param1 * 2];
        }
        if (null == pd.field_e ||
          !(param0 + param1 <= pd.field_e.length)) {
          pd.field_e = new int[(param0 + param1) * 2];
        }
        if (null == vc.field_a ||
          !(param1 <= vc.field_a.length)) {
          vc.field_a = new boolean[2 * param1];
        }
        bb.field_G = 2147483647;
        if (param2 != 42) {
          return;
        }
        dc.field_o = -2147483648;
        be.field_I = -2147483648;
        kg.field_c = 0;
        bi.field_e = 2147483647;
    }

    void e(boolean param0) {
        if (!param0) {
          ld.j(31);
        }
        if (this.field_L <= 0) {
          return;
        }
        this.b(this.field_R, -2038584927, this.field_N);
        this.field_L = 0;
        this.l(7107);
    }

    boolean e(byte param0) {
        if (param0 != 124) {
          this.e((byte) 24);
        }
        this.e(true);
        return super.e((byte) 124);
    }

    void l(int param0) {
        if (param0 != 7107) {
          this.field_L = -126;
        }
    }

    static {
        field_O = "Password: ";
    }
}
