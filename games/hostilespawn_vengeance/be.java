/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class be {
    private int field_h;
    int field_f;
    private int field_d;
    private int field_j;
    private int field_a;
    static int field_i;
    static int field_e;
    int field_b;
    static td field_g;
    private boolean field_c;

    final void a(byte param0, int param1, int param2) {
        if (param0 <= -22) {
          if (param1 >= this.field_b) {
            throw new IllegalArgumentException();
          }
          if (this.field_b <= param2) {
            throw new IllegalArgumentException();
          }
          this.field_d = 0;
          this.field_a = 0;
          if (pf.field_o != 0) {
            this.field_h = pf.field_o;
            this.field_d = pf.field_o;
            this.field_j = an.field_q;
            this.field_f = param2;
            this.field_c = true;
          }
          if (0 != this.field_h &&
            ig.field_L != 0) {
            if (this.field_j <= 0) {
              this.field_j = pk.field_l;
            }
            this.field_j = this.field_j - 1;
          }
          boolean decompiledFrameRemainder0 = true;
          if (0 == pf.field_o) {
            if (ig.field_L != 0) {
              if (this.field_h != 0) {
                return;
              }
              if (!this.field_c &&
                !um.field_d) {
                return;
              }
              decompiledFrameRemainder0 = false;
            }
            else {
              this.field_h = 0;
            }
          }
          if (decompiledFrameRemainder0) {
            if (this.field_h != 0) {
              return;
            }
            if (!this.field_c &&
              !um.field_d) {
              return;
            }
          }
          if (0 > param1) {
            if (!this.field_c) {
              return;
            }
            this.field_f = -1;
            return;
          }
          if (param1 != this.field_f) {
          }
          this.field_c = true;
          this.field_f = param1;
          return;
        }
        this.field_h = 117;
        if (param1 >= this.field_b) {
          throw new IllegalArgumentException();
        }
        if (this.field_b <= param2) {
          throw new IllegalArgumentException();
        }
        this.field_d = 0;
        this.field_a = 0;
        if (pf.field_o != 0) {
          this.field_h = pf.field_o;
          this.field_d = pf.field_o;
          this.field_j = an.field_q;
          this.field_f = param2;
          this.field_c = true;
        }
        if (0 == this.field_h) {
          if (0 == pf.field_o &&
            ig.field_L == 0) {
            this.field_h = 0;
          }
          if (this.field_h == 0) {
            if (!this.field_c &&
              !um.field_d) {
              return;
            }
            if (0 > param1) {
              if (this.field_c) {
                this.field_f = -1;
              }
            } else {
              if (param1 != this.field_f) {
                this.field_c = true;
                this.field_f = param1;
              } else {
                this.field_c = true;
                this.field_f = param1;
              }
            }
          }
          return;
        }
        if (ig.field_L == 0) {
          if (0 == pf.field_o &&
            ig.field_L == 0) {
            this.field_h = 0;
          }
          if (this.field_h == 0) {
            if (!this.field_c &&
              !um.field_d) {
              return;
            }
            if (0 > param1) {
              if (this.field_c) {
                this.field_f = -1;
              }
            } else {
              if (param1 != this.field_f) {
                this.field_c = true;
                this.field_f = param1;
              } else {
                this.field_c = true;
                this.field_f = param1;
              }
            }
          }
          return;
        }
        if (this.field_j <= 0) {
          this.field_j = pk.field_l;
        }
        this.field_j = this.field_j - 1;
        if (0 == pf.field_o &&
          ig.field_L == 0) {
          this.field_h = 0;
        }
        if (this.field_h != 0) {
          return;
        }
        if (!this.field_c &&
          !um.field_d) {
          return;
        }
        if (0 > param1) {
          if (this.field_c) {
            this.field_f = -1;
          }
        } else {
          if (param1 != this.field_f) {
          }
          this.field_c = true;
          this.field_f = param1;
        }
    }

    public static void a(int param0) {
        if (param0 != 0) {
          be.a(-66);
          field_g = null;
          return;
        }
        field_g = null;
    }

    final void a(boolean param0, int param1, int param2, int param3) {
        this.field_h = param1;
        this.field_c = param0 ? true : false;
        if (this.field_c) {
          this.field_f = param2;
          return;
        }
        this.field_f = param3;
    }

    final void c(int param0) {
        this.field_d = 0;
        this.field_a = param0;
        if (this.field_h == 0) {
          this.field_a = pj.field_e;
        }
        if (this.field_h == 0) {
          if (pj.field_e != 98) {
            if (this.field_h != 0) {
              return;
            }
            if (pj.field_e != 99) {
              return;
            }
            this.field_f = this.field_f + 1;
            this.field_c = false;
            if (this.field_f >= this.field_b) {
              this.field_f = 0;
            }
            return;
          }
          if (0 >= this.field_f) {
            this.field_f = this.field_b;
          }
          this.field_c = false;
          this.field_f = this.field_f - 1;
        }
        if (this.field_h != 0) {
          return;
        }
        if (pj.field_e != 99) {
          return;
        }
        this.field_f = this.field_f + 1;
        this.field_c = false;
        if (this.field_f < this.field_b) {
          return;
        }
        this.field_f = 0;
    }

    public be() {
        this.field_f = 0;
        this.field_c = false;
    }

    final boolean b(int param0) {
        if (param0 != 0) {
          this.a(false, -110, -98, 25);
          if (this.field_d != 0) {
            return true;
          }
          if (this.field_a != 84) {
            return this.field_a == 83 ? true : false;
          }
          return true;
        }
        if (this.field_d != 0) {
          return true;
        }
        if (this.field_a == 84) {
          return true;
        }
        if (this.field_a != 83) {
          return false;
        }
        return true;
    }

    be(int param0) {
        this.field_f = 0;
        this.field_c = false;
        this.field_b = param0;
    }

    static {
        field_i = 48;
    }
}
