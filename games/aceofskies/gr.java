/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gr {
    private int field_d;
    int field_g;
    private int field_e;
    private int field_j;
    private boolean field_f;
    static en field_b;
    static int field_h;
    static wp[] field_i;
    private int field_a;
    int field_c;

    final void a(boolean param0) {
        this.field_e = 0;
        if (param0) {
          this.field_a = 0;
          if (this.field_d == 0 &&
            98 == bk.field_f) {
            if (this.field_g <= 0) {
              this.field_g = this.field_c;
            }
            this.field_g = this.field_g - 1;
            this.field_f = false;
          }
          if (this.field_d == 0) {
            this.field_e = bk.field_f;
          }
          if (0 == this.field_d) {
            if (99 != bk.field_f) {
              return;
            }
            this.field_g = this.field_g + 1;
            this.field_f = false;
            if (this.field_c > this.field_g) {
              return;
            }
            this.field_g = 0;
          }
          return;
        }
        this.a(true);
        this.field_a = 0;
        if (this.field_d != 0) {
          if (this.field_d == 0) {
            this.field_e = bk.field_f;
          }
        } else {
          if (98 == bk.field_f) {
            if (this.field_g <= 0) {
              this.field_g = this.field_c;
            }
            this.field_g = this.field_g - 1;
            this.field_f = false;
          }
          if (this.field_d == 0) {
            this.field_e = bk.field_f;
            if (0 != this.field_d) {
              return;
            }
            if (99 == bk.field_f) {
              this.field_g = this.field_g + 1;
              this.field_f = false;
              if (this.field_c > this.field_g) {
                return;
              }
              this.field_g = 0;
            }
            return;
          }
        }
        if (0 != this.field_d) {
          return;
        }
        if (99 != bk.field_f) {
          return;
        }
        this.field_g = this.field_g + 1;
        this.field_f = false;
        if (this.field_c > this.field_g) {
          return;
        }
        this.field_g = 0;
    }

    final boolean d(int param0) {
        if (param0 > 50) {
          return 102 == this.field_e ? true : false;
        }
        this.a(-96);
        return 102 == this.field_e ? true : false;
    }

    final boolean e(byte param0) {
        if (param0 <= 80) {
          this.field_c = -21;
          if (this.field_a != 0) {
            return true;
          }
          if (this.field_e != 84) {
            return this.field_e == 83 ? true : false;
          }
          return true;
        }
        if (this.field_a != 0) {
          return true;
        }
        if (this.field_e == 84) {
          return true;
        }
        if (this.field_e != 83) {
          return false;
        }
        return true;
    }

    final void a(byte param0, int param1) {
        if (0 == this.field_d) {
          this.field_f = false;
          this.field_g = param1;
          if (param0 >= -98) {
            field_h = 4;
            return;
          }
          return;
        }
        if (param0 < -98) {
          return;
        }
        field_h = 4;
    }

    final boolean a(int param0) {
        int var2 = 39 / ((71 - param0) / 37);
        return this.field_e == 96 ? true : false;
    }

    final void d(byte param0) {
        this.field_a = 0;
        this.field_e = 0;
        if (this.field_d == 0) {
          this.field_e = bk.field_f;
          if (param0 <= 122) {
            field_b = (en) null;
            return;
          }
          return;
        }
        if (param0 > 122) {
          return;
        }
        field_b = (en) null;
    }

    final void c(byte param0) {
        this.field_e = 0;
        if (param0 > -47) {
          this.field_e = 73;
        }
        this.field_a = 0;
        if (this.field_d == 0) {
          this.field_e = bk.field_f;
        }
        if (0 == this.field_d &&
          bk.field_f == 96) {
          if (this.field_g <= 0) {
            this.field_g = this.field_c;
          }
          this.field_g = this.field_g - 1;
          this.field_f = false;
        }
        if (this.field_d != 0) {
          return;
        }
        if (bk.field_f != 97) {
          return;
        }
        this.field_g = this.field_g + 1;
        if (this.field_c <= this.field_g) {
          this.field_g = 0;
        }
        this.field_f = false;
    }

    final boolean a(byte param0) {
        if (param0 >= 22) {
          return this.field_d != 0 ? true : false;
        }
        this.d(-16);
        return this.field_d != 0 ? true : false;
    }

    final void a(boolean param0, int param1, int param2, int param3) {
        this.field_f = param0 ? true : false;
        this.field_d = param2;
        if (this.field_f) {
          this.field_g = param1;
          return;
        }
        this.field_g = param3;
    }

    public static void c(int param0) {
        field_i = null;
        field_b = null;
        if (param0 >= -117) {
          field_b = (en) null;
        }
    }

    final void a(int param0, int param1, int param2) {
        if (this.field_c <= param1) {
          throw new IllegalArgumentException();
        }
        if (this.field_c <= param0) {
          throw new IllegalArgumentException();
        }
        this.field_a = 0;
        this.field_e = 0;
        if (0 != vj.field_d) {
          this.field_j = pn.field_d;
          this.field_a = vj.field_d;
          this.field_f = true;
          this.field_d = vj.field_d;
          this.field_g = param0;
        }
        if (param2 != -24702) {
          return;
        }
        if (this.field_d == 0) {
          if (0 == vj.field_d) {
            if (vu.field_f != 0) {
              if (0 == this.field_d) {
                if (!this.field_f &&
                  !uu.field_e) {
                  return;
                }
                if (0 > param1) {
                  if (this.field_f) {
                    this.field_g = -1;
                  }
                } else {
                  if (this.field_g == param1) {
                    this.field_g = param1;
                    this.field_f = true;
                  } else {
                    this.field_g = param1;
                    this.field_f = true;
                  }
                }
              }
              return;
            }
            this.field_d = 0;
          }
          if (0 != this.field_d) {
            return;
          }
          if (!this.field_f &&
            !uu.field_e) {
            return;
          }
          if (0 > param1) {
            if (!this.field_f) {
              return;
            }
            this.field_g = -1;
            return;
          }
          if (this.field_g == param1) {
          }
          this.field_g = param1;
          this.field_f = true;
          return;
        }
        if (0 == vu.field_f) {
          if (0 == vj.field_d &&
            vu.field_f == 0) {
            this.field_d = 0;
          }
          if (0 != this.field_d) {
            return;
          }
          if (!this.field_f &&
            !uu.field_e) {
            return;
          }
          if (0 > param1) {
            if (!this.field_f) {
              return;
            }
            this.field_g = -1;
            return;
          }
          if (this.field_g == param1) {
          }
          this.field_g = param1;
          this.field_f = true;
          return;
        }
        if (this.field_j > 0) {
          this.field_j = this.field_j - 1;
          if (0 == vj.field_d &&
            vu.field_f == 0) {
            this.field_d = 0;
          }
          if (0 != this.field_d) {
            return;
          }
          if (!this.field_f &&
            !uu.field_e) {
            return;
          }
          if (0 > param1) {
            if (!this.field_f) {
              return;
            }
            this.field_g = -1;
            return;
          }
          if (this.field_g == param1) {
          }
          this.field_g = param1;
          this.field_f = true;
          return;
        }
        this.field_j = wm.field_h;
        this.field_j = this.field_j - 1;
        if (0 != vj.field_d) {
          if (0 != this.field_d) {
            return;
          }
          if (!this.field_f &&
            !uu.field_e) {
            return;
          }
          if (0 > param1) {
            if (!this.field_f) {
              return;
            }
            this.field_g = -1;
            return;
          }
          if (this.field_g == param1) {
          }
          this.field_g = param1;
          this.field_f = true;
          return;
        }
        if (vu.field_f == 0) {
          this.field_d = 0;
        }
        if (0 == this.field_d) {
          if (!this.field_f &&
            !uu.field_e) {
            return;
          }
          if (0 <= param1) {
            if (this.field_g == param1) {
            }
            this.field_g = param1;
            this.field_f = true;
            return;
          }
          if (this.field_f) {
            this.field_g = -1;
            return;
          }
        }
    }

    final boolean b(int param0) {
        if (param0 > -9) {
          return false;
        }
        return this.field_e == 103 ? true : false;
    }

    gr(int param0) {
        this.field_g = 0;
        this.field_f = false;
        this.field_c = param0;
    }

    final boolean b(byte param0) {
        if (param0 == -102) {
          return this.field_e == 97 ? true : false;
        }
        this.field_f = true;
        return this.field_e == 97 ? true : false;
    }

    static {
        field_h = 0;
    }
}
