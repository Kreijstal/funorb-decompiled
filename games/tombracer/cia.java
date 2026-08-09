/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cia {
    private int field_b;
    static String[] field_a;
    private boolean field_d;
    static eua field_g;
    private int field_e;
    private int field_f;
    private bua field_c;

    final int a(int param0) {
        if (param0 != 617) {
            this.field_d = false;
            return this.field_e >> 2117830480;
        }
        return this.field_e >> 2117830480;
    }

    final int a(byte param0) {
        if (param0 != 25) {
            this.field_e = 18;
            return this.field_b >> -1063178064;
        }
        return this.field_b >> -1063178064;
    }

    final void b(int param0, int param1, int param2) {
        ura.a(-10985);
        hp.a(2048, this.field_f, 1900, this.field_c.b((byte) 74), -1918106173, (this.field_e >> 1790938064) + param1, param0 + (this.field_b >> 767302480));
        se.f((byte) -6);
        int var4 = -43 / ((param2 - 6) / 58);
    }

    final void c(int param0) {
        int stackIn_5_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_32_0 = 0;
        int var2;
        int var3;
        L0: {
          if (oj.field_tb[kda.field_hd]) {
            stackIn_5_0 = -1;
            break L0;
          } else {
            if (!oj.field_tb[mf.field_a]) {
              stackIn_5_0 = 0;
              break L0;
            } else {
              stackIn_5_0 = 1;
              break L0;
            }
          }
        }
        var2 = stackIn_5_0;
        if (param0 >= 120) {
          L1: {
            if (!oj.field_tb[mi.field_k]) {
              if (!oj.field_tb[fp.field_a]) {
                stackIn_32_0 = 0;
                break L1;
              } else {
                stackIn_32_0 = 1;
                break L1;
              }
            } else {
              stackIn_32_0 = -1;
              break L1;
            }
          }
          var3 = stackIn_32_0;
          if (var2 != 0) {
            L2: {
              if (!this.field_d) {
                this.field_c.a(0, false, 0, 1, true);
                break L2;
              } else {
                break L2;
              }
            }
            this.field_e = this.field_e + (var3 << 1836710161);
            this.field_b = this.field_b + (var2 << -382754959);
            this.field_d = true;
            this.field_f = (tia.a(var3 << -1336954328, var2 << 117113064, -29543) >> 454184994) - 512;
            this.field_c.a(0);
            return;
          } else {
            if (var3 == 0) {
              if (this.field_d) {
                this.field_c.a(0, false, 0, 0, true);
                this.field_d = false;
                this.field_f = 0;
                this.field_c.a(0);
                return;
              } else {
                this.field_c.a(0);
                return;
              }
            } else {
              L3: {
                if (!this.field_d) {
                  this.field_c.a(0, false, 0, 1, true);
                  break L3;
                } else {
                  break L3;
                }
              }
              this.field_e = this.field_e + (var3 << 1836710161);
              this.field_b = this.field_b + (var2 << -382754959);
              this.field_d = true;
              this.field_f = (tia.a(var3 << -1336954328, var2 << 117113064, -29543) >> 454184994) - 512;
              this.field_c.a(0);
              return;
            }
          }
        } else {
          L4: {
            this.field_e = 123;
            if (!oj.field_tb[mi.field_k]) {
              if (!oj.field_tb[fp.field_a]) {
                stackIn_11_0 = 0;
                break L4;
              } else {
                stackIn_11_0 = 1;
                break L4;
              }
            } else {
              stackIn_11_0 = -1;
              break L4;
            }
          }
          var3 = stackIn_11_0;
          if (var2 != 0) {
            L5: {
              if (!this.field_d) {
                this.field_c.a(0, false, 0, 1, true);
                break L5;
              } else {
                break L5;
              }
            }
            this.field_e = this.field_e + (var3 << 1836710161);
            this.field_b = this.field_b + (var2 << -382754959);
            this.field_d = true;
            this.field_f = (tia.a(var3 << -1336954328, var2 << 117113064, -29543) >> 454184994) - 512;
            this.field_c.a(0);
            return;
          } else {
            if (var3 == 0) {
              if (this.field_d) {
                this.field_c.a(0, false, 0, 0, true);
                this.field_d = false;
                this.field_f = 0;
                this.field_c.a(0);
                return;
              } else {
                this.field_c.a(0);
                return;
              }
            } else {
              L6: {
                if (!this.field_d) {
                  this.field_c.a(0, false, 0, 1, true);
                  break L6;
                } else {
                  break L6;
                }
              }
              this.field_e = this.field_e + (var3 << 1836710161);
              this.field_b = this.field_b + (var2 << -382754959);
              this.field_d = true;
              this.field_f = (tia.a(var3 << -1336954328, var2 << 117113064, -29543) >> 454184994) - 512;
              this.field_c.a(0);
              return;
            }
          }
        }
    }

    final void a(int param0, int param1, int param2) {
        this.field_e = param1 << -212446672;
        this.field_b = param0 << 1823844912;
        if (param2 != 1823844912) {
            this.b(127, 90, 24);
        }
    }

    cia() {
        this.field_c = new bua(0, 0, 1);
        this.field_c.a(0, false, 0, 0, true);
        this.field_d = false;
    }

    public static void b(int param0) {
        if (param0 != -1) {
            cia.b(42);
            field_a = null;
            field_g = null;
            return;
        }
        field_a = null;
        field_g = null;
    }

    static {
    }
}
