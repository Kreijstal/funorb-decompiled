/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class cda extends dg {
    private boolean field_r;
    private boolean field_t;
    private boolean field_q;
    private int field_m;
    private int field_v;
    private int field_s;
    static String field_u;
    private int field_o;
    static volatile int field_p;
    private int field_n;

    public static void n(byte param0) {
        if (param0 < 0) {
          cda.a(-97, true);
          field_u = null;
          return;
        }
        field_u = null;
    }

    cda(int param0, la param1, kh param2) {
        super(param0, param1, param2);
        this.field_r = true;
    }

    final boolean a(boolean param0) {
        if (!param0) {
          this.field_t = true;
          return this.field_q;
        }
        return this.field_q;
    }

    void d(int param0) {
        int stackIn_8_0 = 0;
        int stackIn_16_0 = 0;
        boolean stackIn_21_1 = false;
        boolean stackIn_24_0 = false;
        int stackIn_25_1 = 0;
        boolean stackIn_29_1 = false;
        int stackIn_37_0 = 0;
        boolean stackIn_42_1 = false;
        boolean stackIn_45_0 = false;
        int stackIn_46_1 = 0;
        boolean stackIn_50_1 = false;
        int stackIn_55_0 = 0;
        int stackIn_59_0 = 0;
        boolean stackIn_64_1 = false;
        boolean stackIn_67_0 = false;
        int stackIn_68_1 = 0;
        boolean stackIn_72_1 = false;
        int stackIn_79_0 = 0;
        boolean stackIn_84_1 = false;
        boolean stackIn_87_0 = false;
        int stackIn_88_1 = 0;
        boolean stackIn_92_1 = false;
        int stackIn_99_0 = 0;
        boolean stackIn_104_1 = false;
        boolean stackIn_107_0 = false;
        int stackIn_108_1 = 0;
        boolean stackIn_112_1 = false;
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        fsa var7;
        int var8;
        int var4Lifetime1;
        int var5Lifetime1;
        int var6Lifetime1;
        var8 = TombRacer.field_G ? 1 : 0;
        super.d(param0);
        var2 = 0;
        var3 = 0;
        var4 = 0;
        var5 = 0;
        var6 = 0;
        if (!(this.field_h instanceof fsa)) {
          var4Lifetime1 = this.field_h.d(3);
          var5Lifetime1 = this.field_h.e(9648);
          var6Lifetime1 = this.field_h.g(-25787);
        } else {
          var7 = (fsa) (this.field_h);
          var4Lifetime1 = var7.s(25745);
          var5Lifetime1 = var7.e(false);
          var6Lifetime1 = var7.q((byte) -80);
        }
        if (this.field_r) {
          this.field_t = false;
          this.field_n = 1;
          this.field_r = false;
          this.field_o = 0;
          this.field_q = false;
          this.field_m = var6Lifetime1;
          stackIn_99_0 = (var3 != 0) ? 0 : 1;
          if (stackIn_99_0 == (this.field_t ? 1 : 0)) {
            stackIn_104_1 = (var3 != 0);
            this.field_t = stackIn_104_1;
          }
          stackIn_107_0 = this.field_q;
          stackIn_108_1 = (var2 != 0) ? 0 : 1;
          if ((stackIn_107_0 ? 1 : 0) != stackIn_108_1) {
            this.field_n = this.field_n + 1;
          } else {
            stackIn_112_1 = (var2 != 0);
            this.field_q = stackIn_112_1;
            this.field_n = 1;
          }
        } else {
          stackIn_8_0 = (this.field_m == var6Lifetime1) ? 0 : 1;
          var3 = stackIn_8_0;
          if (this.field_s == var4Lifetime1) {
            if (var5Lifetime1 != this.field_v) {
              var2 = 1;
              this.field_o = dfa.a(-this.field_m + var6Lifetime1, 8192, -60);
              if (this.field_o <= 4096) {
                this.field_m = var6Lifetime1;
                stackIn_37_0 = (var3 != 0) ? 0 : 1;
                if (stackIn_37_0 == (this.field_t ? 1 : 0)) {
                  stackIn_42_1 = (var3 != 0);
                  this.field_t = stackIn_42_1;
                }
                stackIn_45_0 = this.field_q;
                stackIn_46_1 = (var2 != 0) ? 0 : 1;
                if ((stackIn_45_0 ? 1 : 0) != stackIn_46_1) {
                  this.field_n = this.field_n + 1;
                } else {
                  stackIn_50_1 = (var2 != 0);
                  this.field_q = stackIn_50_1;
                  this.field_n = 1;
                }
              } else {
                this.field_o = -this.field_o + 8192;
                this.field_m = var6Lifetime1;
                stackIn_16_0 = (var3 != 0) ? 0 : 1;
                if (stackIn_16_0 == (this.field_t ? 1 : 0)) {
                  stackIn_21_1 = (var3 != 0);
                  this.field_t = stackIn_21_1;
                }
                stackIn_24_0 = this.field_q;
                stackIn_25_1 = (var2 != 0) ? 0 : 1;
                if ((stackIn_24_0 ? 1 : 0) != stackIn_25_1) {
                  this.field_n = this.field_n + 1;
                } else {
                  stackIn_29_1 = (var2 != 0);
                  this.field_q = stackIn_29_1;
                  this.field_n = 1;
                }
              }
              this.field_s = var4Lifetime1;
              this.field_v = var5Lifetime1;
              return;
            }
            stackIn_55_0 = 0;
          } else {
            stackIn_55_0 = 1;
          }
          var2 = stackIn_55_0;
          this.field_o = dfa.a(-this.field_m + var6Lifetime1, 8192, -60);
          if (this.field_o <= 4096) {
            this.field_m = var6Lifetime1;
            stackIn_59_0 = (var3 != 0) ? 0 : 1;
            if (stackIn_59_0 == (this.field_t ? 1 : 0)) {
              stackIn_64_1 = (var3 != 0);
              this.field_t = stackIn_64_1;
            }
            stackIn_67_0 = this.field_q;
            stackIn_68_1 = (var2 != 0) ? 0 : 1;
            if ((stackIn_67_0 ? 1 : 0) != stackIn_68_1) {
              this.field_n = this.field_n + 1;
            } else {
              stackIn_72_1 = (var2 != 0);
              this.field_q = stackIn_72_1;
              this.field_n = 1;
            }
          } else {
            this.field_o = -this.field_o + 8192;
            this.field_m = var6Lifetime1;
            stackIn_79_0 = (var3 != 0) ? 0 : 1;
            if (stackIn_79_0 == (this.field_t ? 1 : 0)) {
              stackIn_84_1 = (var3 != 0);
              this.field_t = stackIn_84_1;
            }
            stackIn_87_0 = this.field_q;
            stackIn_88_1 = (var2 != 0) ? 0 : 1;
            if ((stackIn_87_0 ? 1 : 0) != stackIn_88_1) {
              this.field_n = this.field_n + 1;
            } else {
              stackIn_92_1 = (var2 != 0);
              this.field_q = stackIn_92_1;
              this.field_n = 1;
            }
          }
        }
        this.field_s = var4Lifetime1;
        this.field_v = var5Lifetime1;
    }

    final static void a(int param0, boolean param1) {
        ira.a(param1, hb.field_t.field_d, (byte) -100);
        if (param0 != 0) {
          cda.a(50, false);
        }
    }

    cda(int param0) {
        super(param0);
        this.field_r = true;
    }

    final int b(boolean param0) {
        if (param0) {
          this.field_r = false;
          return this.field_n;
        }
        return this.field_n;
    }

    static {
        field_p = 0;
        field_u = "Encouraging rule breaking";
    }
}
