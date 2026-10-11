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
          return this.field_e >> 16;
        }
        return this.field_e >> 16;
    }

    final int a(byte param0) {
        if (param0 != 25) {
          this.field_e = 18;
          return this.field_b >> 16;
        }
        return this.field_b >> 16;
    }

    final void b(int param0, int param1, int param2) {
        ura.a(-10985);
        hp.a(2048, this.field_f, 1900, this.field_c.b((byte) 74), -1918106173, (this.field_e >> 16) + param1, param0 + (this.field_b >> 16));
        se.f((byte) -6);
        int var4 = -43 / ((param2 - 6) / 58);
    }

    final void c(int param0) {
        int stackIn_5_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_32_0 = 0;
        int var2;
        int var3;
        int var3Lifetime1;
        if (oj.field_tb[kda.field_hd]) {
          stackIn_5_0 = -1;
        } else {
          stackIn_5_0 = (!oj.field_tb[mf.field_a]) ? 0 : 1;
        }
        var2 = stackIn_5_0;
        if (param0 >= 120) {
          if (!oj.field_tb[mi.field_k]) {
            stackIn_32_0 = (!oj.field_tb[fp.field_a]) ? 0 : 1;
          } else {
            stackIn_32_0 = -1;
          }
          var3 = stackIn_32_0;
          if (var2 != 0) {
            if (!this.field_d) {
              this.field_c.a(0, false, 0, 1, true);
            }
            this.field_e = this.field_e + (var3 << 17);
            this.field_b = this.field_b + (var2 << 17);
            this.field_d = true;
            this.field_f = (tia.a(var3 << 8, var2 << 8, -29543) >> 2) - 512;
          } else {
            if (var3 == 0) {
              if (this.field_d) {
                this.field_c.a(0, false, 0, 0, true);
                this.field_d = false;
                this.field_f = 0;
              }
            } else {
              if (!this.field_d) {
                this.field_c.a(0, false, 0, 1, true);
              }
              this.field_e = this.field_e + (var3 << 17);
              this.field_b = this.field_b + (var2 << 17);
              this.field_d = true;
              this.field_f = (tia.a(var3 << 8, var2 << 8, -29543) >> 2) - 512;
            }
          }
          this.field_c.a(0);
          return;
        }
        this.field_e = 123;
        if (!oj.field_tb[mi.field_k]) {
          stackIn_11_0 = (!oj.field_tb[fp.field_a]) ? 0 : 1;
        } else {
          stackIn_11_0 = -1;
        }
        var3Lifetime1 = stackIn_11_0;
        if (var2 != 0) {
          if (!this.field_d) {
            this.field_c.a(0, false, 0, 1, true);
          }
          this.field_e = this.field_e + (var3Lifetime1 << 17);
          this.field_b = this.field_b + (var2 << 17);
          this.field_d = true;
          this.field_f = (tia.a(var3Lifetime1 << 8, var2 << 8, -29543) >> 2) - 512;
        } else {
          if (var3Lifetime1 == 0) {
            if (this.field_d) {
              this.field_c.a(0, false, 0, 0, true);
              this.field_d = false;
              this.field_f = 0;
            }
          } else {
            if (!this.field_d) {
              this.field_c.a(0, false, 0, 1, true);
            }
            this.field_e = this.field_e + (var3Lifetime1 << 17);
            this.field_b = this.field_b + (var2 << 17);
            this.field_d = true;
            this.field_f = (tia.a(var3Lifetime1 << 8, var2 << 8, -29543) >> 2) - 512;
          }
        }
        this.field_c.a(0);
    }

    final void a(int param0, int param1, int param2) {
        this.field_e = param1 << 16;
        this.field_b = param0 << 16;
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
