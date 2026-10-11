/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qi {
    static String field_d;
    private int field_g;
    int field_k;
    private int field_c;
    private boolean field_e;
    private int field_l;
    private int field_a;
    private int field_f;
    int field_i;
    static int[] field_h;
    static String field_j;
    boolean field_b;

    final boolean g(byte param0) {
        int var2 = -31 / ((-57 - param0) / 37);
        if (this.field_c == 2) {
          return true;
        }
        if (this.field_l != 96) {
          return false;
        }
        return true;
    }

    final boolean e(byte param0) {
        if (param0 == 105) {
          return this.field_l == 96 ? true : false;
        }
        this.a(false, -78, -113);
        return this.field_l == 96 ? true : false;
    }

    final void c(int param0) {
        this.field_c = 0;
        this.field_b = false;
        this.field_f = 0;
        this.field_l = 0;
        if (this.field_a == 0 &&
          98 == gk.field_r) {
          if (this.field_i <= 0) {
            this.field_i = this.field_k;
          }
          this.field_i = this.field_i - 1;
          this.field_e = false;
          this.field_b = true;
        }
        if (this.field_a == 0) {
          this.field_l = gk.field_r;
        }
        if (param0 != ~this.field_a) {
          return;
        }
        if (gk.field_r != 99) {
          return;
        }
        this.field_i = this.field_i + 1;
        if (this.field_k <= this.field_i) {
          this.field_i = 0;
        }
        this.field_e = false;
        this.field_b = true;
    }

    final void a(int param0, int param1) {
        if (param1 == ~this.field_a) {
          this.field_b = true;
          this.field_e = false;
          this.field_i = param0;
        }
    }

    final void a(boolean param0, int param1, int param2) {
        if (param2 >= this.field_k) {
          throw new IllegalArgumentException();
        }
        if (this.field_k <= param1) {
          throw new IllegalArgumentException();
        }
        this.field_c = 0;
        this.field_l = 0;
        this.field_b = false;
        this.field_f = 0;
        if (!param0) {
          return;
        }
        if (0 != rh.field_X) {
          this.field_i = param1;
          this.field_c = rh.field_X;
          this.field_f = rh.field_X;
          this.field_a = rh.field_X;
          this.field_g = em.field_a;
          this.field_e = true;
          if (this.field_a == 0) {
            if (0 == rh.field_X &&
              Confined.field_I == 0) {
              this.field_a = 0;
            }
            if (0 == this.field_a) {
              if (!this.field_e &&
                !hn.field_D) {
                return;
              }
              if (param2 < 0) {
                if (this.field_e) {
                  this.field_i = -1;
                }
              } else {
                if (this.field_i != param2) {
                  this.field_b = true;
                }
                this.field_e = true;
                this.field_i = param2;
              }
            }
            return;
          }
          if (Confined.field_I != 0) {
            if (this.field_g <= 0) {
              this.field_g = gd.field_u;
              this.field_c = this.field_a;
            }
            this.field_g = this.field_g - 1;
          }
          if (0 != rh.field_X) {
            if (0 != this.field_a) {
              return;
            }
            if (!this.field_e &&
              !hn.field_D) {
              return;
            }
            if (param2 < 0) {
              if (!this.field_e) {
                return;
              }
              this.field_i = -1;
              return;
            }
            if (this.field_i != param2) {
              this.field_b = true;
            }
            this.field_e = true;
            this.field_i = param2;
            return;
          }
          if (Confined.field_I != 0) {
            if (0 != this.field_a) {
              return;
            }
            if (!this.field_e &&
              !hn.field_D) {
              return;
            }
            if (param2 < 0) {
              if (!this.field_e) {
                return;
              }
              this.field_i = -1;
              return;
            }
            if (this.field_i != param2) {
              this.field_b = true;
            }
            this.field_e = true;
            this.field_i = param2;
            return;
          }
          this.field_a = 0;
          if (0 == this.field_a) {
            if (!this.field_e &&
              !hn.field_D) {
              return;
            }
            if (param2 < 0) {
              if (this.field_e) {
                this.field_i = -1;
              }
            } else {
              if (this.field_i != param2) {
                this.field_b = true;
              }
              this.field_e = true;
              this.field_i = param2;
            }
          }
          return;
        }
        if (this.field_a != 0) {
          if (Confined.field_I == 0) {
            if (0 == rh.field_X &&
              Confined.field_I == 0) {
              this.field_a = 0;
            }
            if (0 != this.field_a) {
              return;
            }
            if (!this.field_e &&
              !hn.field_D) {
              return;
            }
            if (param2 < 0) {
              if (!this.field_e) {
                return;
              }
              this.field_i = -1;
              return;
            }
            if (this.field_i != param2) {
              this.field_b = true;
            }
            this.field_e = true;
            this.field_i = param2;
            return;
          }
          if (this.field_g <= 0) {
            this.field_g = gd.field_u;
            this.field_c = this.field_a;
          }
          this.field_g = this.field_g - 1;
        }
        if (0 == rh.field_X &&
          Confined.field_I == 0) {
          this.field_a = 0;
        }
        if (0 == this.field_a) {
          if (!this.field_e &&
            !hn.field_D) {
            return;
          }
          if (param2 >= 0) {
            if (this.field_i != param2) {
              this.field_b = true;
            }
            this.field_e = true;
            this.field_i = param2;
            return;
          }
          if (!this.field_e) {
            return;
          }
          this.field_i = -1;
        }
    }

    final boolean b(int param0) {
        int var2 = 23 / ((53 - param0) / 59);
        return this.field_l == 97 ? true : false;
    }

    final boolean f(byte param0) {
        if (param0 > -35) {
          return true;
        }
        return this.field_a != 0 ? true : false;
    }

    final void h(byte param0) {
        if (param0 != -128) {
          this.b(126);
          this.field_f = 0;
          this.field_b = false;
          this.field_l = 0;
          this.field_c = 0;
          if (this.field_a == 0) {
            this.field_l = gk.field_r;
            return;
          }
          return;
        }
        this.field_f = 0;
        this.field_b = false;
        this.field_l = 0;
        this.field_c = 0;
        if (this.field_a != 0) {
          return;
        }
        this.field_l = gk.field_r;
    }

    final boolean a(int param0) {
        if (param0 == 0) {
          return this.field_l == 102 ? true : false;
        }
        field_h = (int[]) null;
        return this.field_l == 102 ? true : false;
    }

    final boolean c(byte param0) {
        int var2 = 56 / ((param0 + 46) / 60);
        return this.field_l == 103 ? true : false;
    }

    final boolean b(byte param0) {
        if (param0 != 36) {
          this.c(11);
          if (this.field_c == 1) {
            return true;
          }
          if (this.field_l == 97) {
            return true;
          }
          if (84 == this.field_l) {
            return true;
          }
          if (this.field_l != 83) {
            return false;
          }
          return true;
        }
        if (this.field_c == 1) {
          return true;
        }
        if (this.field_l == 97) {
          return true;
        }
        if (84 == this.field_l) {
          return true;
        }
        if (this.field_l != 83) {
          return false;
        }
        return true;
    }

    final void a(boolean param0, int param1, int param2, int param3) {
        this.field_a = param1;
        this.field_e = param0 ? true : false;
        if (this.field_e) {
          this.field_i = param3;
          return;
        }
        this.field_i = param2;
    }

    final void a(int param0, boolean param1, int param2) {
        if (param2 <= -73) {
          this.field_a = 0;
          this.field_e = param1 ? true : false;
          if (this.field_e) {
            this.field_i = param0;
          }
          return;
        }
    }

    public qi() {
        this.field_e = false;
        this.field_i = 0;
    }

    qi(int param0) {
        this.field_e = false;
        this.field_i = 0;
        this.field_k = param0;
    }

    public static void a(byte param0) {
        if (param0 == 46) {
          field_d = null;
          field_h = null;
          field_j = null;
          return;
        }
        qi.a((byte) 112);
        field_d = null;
        field_h = null;
        field_j = null;
    }

    final boolean d(byte param0) {
        if (param0 != 55) {
          return true;
        }
        if (this.field_f != 0) {
          return true;
        }
        if (84 == this.field_l) {
          return true;
        }
        if (this.field_l != 83) {
          return false;
        }
        return true;
    }

    static {
        field_d = "<col=FFFFFF>Energy weapons:</col> awarded at various levels, or if you've lost or missed one.";
        field_j = "Age:";
        field_h = new int[]{5, 9, 13, 17, 21};
    }
}
