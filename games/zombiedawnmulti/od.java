/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class od extends lm {
    static String field_Cb;
    static String field_zb;
    private boolean field_yb;
    static int field_Db;
    static ja[] field_Fb;
    static String field_Eb;
    static ja[] field_Ab;
    static byte[] field_Gb;
    static String field_Bb;

    od(int param0, int param1, int param2) {
        super(param0, param1, param2, 100352);
        this.field_yb = false;
        if (this.field_D == 2 ||
          this.field_D == 4 ||
          this.field_D == 6) {
          this.field_lb = 17;
          this.field_cb = 71680;
        }
    }

    final void l(byte param0) {
        int stackIn_3_0 = 0;
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var3Lifetime1;
        int var3Lifetime2;
        int var4Lifetime1;
        int var4Lifetime2;
        int var5Lifetime1;
        int var5Lifetime2;
        var6 = ZombieDawnMulti.field_E ? 1 : 0;
        stackIn_3_0 = (this.field_yb) ? 2 : 1;
        var2 = stackIn_3_0 * 250;
        if (this.field_Q != 0) {
          var3 = 0;
          if (null != this.field_nb) {
            var4 = this.field_nb.e((byte) -112) - this.e((byte) -112);
            var5 = this.field_nb.g(1829947600) - this.g(1829947600);
            if (this.field_nb.o(124) &&
              var4 * var4 + var5 * var5 <= 125000) {
              if (this.field_A.field_b.a(this.g(param0 ^ 1829947583), this.e((byte) -112), -17201, this.field_nb.e((byte) -112), this.field_nb.g(1829947600), false, false) != -1) {
                this.a(false, this.field_nb);
                return;
              }
              if (this.field_A.field_b.a(this.g(1829947600) - 48, this.e((byte) -112), -17201, this.field_nb.e((byte) -112), this.field_nb.g(1829947600) - 48, false, false) != -1) {
                this.a(false, this.field_nb);
                return;
              }
            }
            this.field_nb = null;
            this.a(0, (byte) -89);
            this.field_N = this.e((byte) -112);
            this.field_ab = this.g(1829947600);
            this.field_S = true;
            return;
          }
          if (this.b(this.field_yb, var2, -32)) {
            if (!this.d(false)) {
              if (this.field_yb) {
                this.field_yb = false;
              } else {
                if (this.field_Q != 3) {
                  this.a(3, (byte) -89);
                  this.field_S = true;
                }
              }
              if (param0 != 111) {
                field_zb = (String) null;
              }
              return;
            }
            this.field_yb = true;
            if (var3 != 0) {
              if (param0 != 111) {
                field_zb = (String) null;
              }
              return;
            }
          } else {
            this.field_yb = false;
            this.field_nb = this.a(this.field_yb, 250, 5690);
            if (this.field_nb != null) {
              this.a(30, (byte) -89);
              this.b(this.field_ab, (byte) -61, this.field_N);
              this.l((byte) 111);
              if (param0 != 111) {
                field_zb = (String) null;
              }
              return;
            }
            if (3 == this.field_Q) {
              this.a(0, (byte) -89);
              this.field_S = true;
            }
          }
          if (param0 == 111) {
            return;
          }
          field_zb = (String) null;
          return;
        }
        if (this.field_yb) {
          var3Lifetime1 = 0;
          if (null != this.field_nb) {
            var4Lifetime1 = this.field_nb.e((byte) -112) - this.e((byte) -112);
            var5Lifetime1 = this.field_nb.g(1829947600) - this.g(1829947600);
            if (this.field_nb.o(124) &&
              var4Lifetime1 * var4Lifetime1 + var5Lifetime1 * var5Lifetime1 <= 125000) {
              if (this.field_A.field_b.a(this.g(param0 ^ 1829947583), this.e((byte) -112), -17201, this.field_nb.e((byte) -112), this.field_nb.g(1829947600), false, false) != -1) {
                this.a(false, this.field_nb);
                return;
              }
              if (this.field_A.field_b.a(this.g(1829947600) - 48, this.e((byte) -112), -17201, this.field_nb.e((byte) -112), this.field_nb.g(1829947600) - 48, false, false) != -1) {
                this.a(false, this.field_nb);
                return;
              }
            }
            this.field_nb = null;
            this.a(0, (byte) -89);
            this.field_N = this.e((byte) -112);
            this.field_ab = this.g(1829947600);
            this.field_S = true;
            return;
          }
          if (!this.b(this.field_yb, var2, -32)) {
            this.field_yb = false;
            this.field_nb = this.a(this.field_yb, 250, 5690);
            if (this.field_nb != null) {
              this.a(30, (byte) -89);
              this.b(this.field_ab, (byte) -61, this.field_N);
              this.l((byte) 111);
            } else {
              if (3 == this.field_Q) {
                this.a(0, (byte) -89);
                this.field_S = true;
              }
            }
            if (param0 == 111) {
              return;
            }
            field_zb = (String) null;
            return;
          }
          if (this.d(false)) {
            this.field_yb = true;
            if (var3Lifetime1 != 0) {
              if (param0 != 111) {
                field_zb = (String) null;
              }
              return;
            }
            if (param0 == 111) {
              return;
            }
            field_zb = (String) null;
            return;
          }
          if (this.field_yb) {
            this.field_yb = false;
          } else {
            if (this.field_Q == 3) {
              if (param0 == 111) {
                return;
              }
              field_zb = (String) null;
              return;
            }
            this.a(3, (byte) -89);
            this.field_S = true;
          }
          if (param0 != 111) {
            field_zb = (String) null;
          }
          return;
        }
        var3Lifetime2 = 1;
        if (null != this.field_nb) {
          var4Lifetime2 = this.field_nb.e((byte) -112) - this.e((byte) -112);
          var5Lifetime2 = this.field_nb.g(1829947600) - this.g(1829947600);
          if (this.field_nb.o(124) &&
            var4Lifetime2 * var4Lifetime2 + var5Lifetime2 * var5Lifetime2 <= 125000) {
            if (this.field_A.field_b.a(this.g(param0 ^ 1829947583), this.e((byte) -112), -17201, this.field_nb.e((byte) -112), this.field_nb.g(1829947600), false, false) != -1) {
              this.a(false, this.field_nb);
              return;
            }
            if (this.field_A.field_b.a(this.g(1829947600) - 48, this.e((byte) -112), -17201, this.field_nb.e((byte) -112), this.field_nb.g(1829947600) - 48, false, false) != -1) {
              this.a(false, this.field_nb);
              return;
            }
          }
          this.field_nb = null;
          this.a(0, (byte) -89);
          this.field_N = this.e((byte) -112);
          this.field_ab = this.g(1829947600);
          this.field_S = true;
          return;
        }
        if (!this.b(this.field_yb, var2, -32)) {
          this.field_yb = false;
          this.field_nb = this.a(this.field_yb, 250, 5690);
          if (this.field_nb != null) {
            this.a(30, (byte) -89);
            this.b(this.field_ab, (byte) -61, this.field_N);
            this.l((byte) 111);
          } else {
            if (3 == this.field_Q) {
              this.a(0, (byte) -89);
              this.field_S = true;
            }
          }
        } else {
          if (this.d(false)) {
            this.field_yb = true;
            if (var3Lifetime2 == 0) {
            }
          } else {
            if (this.field_yb) {
              this.field_yb = false;
            } else {
              if (this.field_Q != 3) {
                this.a(3, (byte) -89);
                this.field_S = true;
              }
            }
          }
        }
        if (param0 == 111) {
          return;
        }
        field_zb = (String) null;
        return;
    }

    public static void o(byte param0) {
        field_Cb = null;
        field_Eb = null;
        field_Gb = null;
        field_Bb = null;
        field_zb = null;
        if (param0 <= -5) {
          field_Ab = null;
          field_Fb = null;
          return;
        }
    }

    static {
        field_Cb = "Try changing the '<%0>' setting.";
        field_Db = 0;
        field_zb = "To server list";
        field_Eb = "Breach";
    }
}
