/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class al {
    int field_d;
    int field_a;
    private int field_h;
    boolean field_f;
    private int field_g;
    static kg field_i;
    private int field_c;
    private int field_e;
    private int field_b;

    final void a(int param0, int param1, int param2) {
        if (param2 >= this.field_a) {
          throw new IllegalArgumentException();
        }
        if (this.field_a <= param1) {
          throw new IllegalArgumentException();
        }
        this.field_h = 0;
        this.field_b = 0;
        this.field_c = 0;
        if (tg.field_d != 0) {
          this.field_f = true;
          this.field_e = tg.field_d;
          this.field_d = param1;
          this.field_c = tg.field_d;
          this.field_h = tg.field_d;
          this.field_g = uf.field_a;
        }
        if (this.field_e == 0) {
          if (tg.field_d == 0) {
            if (b.field_k != 0) {
              if (param0 > -105) {
                this.b((byte) 29);
              }
              if (0 != this.field_e) {
                return;
              }
              if (!this.field_f &&
                !tl.field_a) {
                return;
              }
              if (param2 >= 0) {
                if (param2 != this.field_d) {
                  this.field_d = param2;
                  this.field_f = true;
                  return;
                }
                this.field_d = param2;
                this.field_f = true;
                return;
              }
              if (!this.field_f) {
                return;
              }
              this.field_d = -1;
              return;
            }
            this.field_e = 0;
          }
          if (param0 <= -105) {
            if (0 != this.field_e) {
              return;
            }
            if (!this.field_f &&
              !tl.field_a) {
              return;
            }
            if (param2 < 0) {
              if (!this.field_f) {
                return;
              }
              this.field_d = -1;
              return;
            }
            if (param2 != this.field_d) {
            }
            this.field_d = param2;
            this.field_f = true;
            return;
          }
          this.b((byte) 29);
          if (0 != this.field_e) {
            return;
          }
          if (!this.field_f &&
            !tl.field_a) {
            return;
          }
          if (param2 >= 0) {
            if (param2 != this.field_d) {
              this.field_d = param2;
              this.field_f = true;
              return;
            }
            this.field_d = param2;
            this.field_f = true;
            return;
          }
          if (!this.field_f) {
            return;
          }
          this.field_d = -1;
          return;
        }
        if (b.field_k != 0) {
          if (this.field_g <= 0) {
            this.field_c = this.field_e;
            this.field_g = se.field_v;
            this.field_g = this.field_g - 1;
          } else {
            this.field_g = this.field_g - 1;
            if (tg.field_d != 0) {
              if (param0 > -105) {
                this.b((byte) 29);
              }
              if (0 != this.field_e) {
                return;
              }
              if (!this.field_f &&
                !tl.field_a) {
                return;
              }
              if (param2 >= 0) {
                if (param2 != this.field_d) {
                  this.field_d = param2;
                  this.field_f = true;
                  return;
                }
                this.field_d = param2;
                this.field_f = true;
                return;
              }
              if (!this.field_f) {
                return;
              }
              this.field_d = -1;
              return;
            }
            if (b.field_k == 0) {
              this.field_e = 0;
            }
            if (param0 > -105) {
              this.b((byte) 29);
            }
            if (0 != this.field_e) {
              return;
            }
            if (!this.field_f &&
              !tl.field_a) {
              return;
            }
            if (param2 >= 0) {
              if (param2 != this.field_d) {
                this.field_d = param2;
                this.field_f = true;
                return;
              }
              this.field_d = param2;
              this.field_f = true;
              return;
            }
            if (!this.field_f) {
              return;
            }
            this.field_d = -1;
            return;
          }
        }
        if (tg.field_d == 0 &&
          b.field_k == 0) {
          this.field_e = 0;
        }
        if (param0 > -105) {
          this.b((byte) 29);
        }
        if (0 != this.field_e) {
          return;
        }
        if (!this.field_f &&
          !tl.field_a) {
          return;
        }
        if (param2 < 0) {
          if (!this.field_f) {
            return;
          }
          this.field_d = -1;
          return;
        }
        if (param2 != this.field_d) {
        }
        this.field_d = param2;
        this.field_f = true;
    }

    final boolean a(byte param0) {
        if (param0 != -112) {
          return false;
        }
        if (this.field_c == 2) {
          return true;
        }
        if (this.field_b != 96) {
          return false;
        }
        return true;
    }

    final void a(int param0, int param1, byte param2, boolean param3) {
        this.field_f = param3 ? true : false;
        int var5 = -91 % ((param2 - 7) / 39);
        this.field_e = 0;
        if (this.field_f) {
          this.field_d = param0;
          return;
        }
        this.field_d = param1;
    }

    final boolean f(int param0) {
        if (param0 != -9112) {
          return false;
        }
        if (this.field_c != 0) {
          return true;
        }
        if (this.field_b == 84) {
          return true;
        }
        if (83 != this.field_b) {
          return false;
        }
        return true;
    }

    final boolean d(int param0) {
        if (param0 <= 38) {
          this.field_c = -105;
          if (this.field_c == 1) {
            return true;
          }
          if (this.field_b == 97) {
            return true;
          }
          if (this.field_b == 84) {
            return true;
          }
          if (this.field_b != 83) {
            return false;
          }
          return true;
        }
        if (this.field_c == 1) {
          return true;
        }
        if (this.field_b == 97) {
          return true;
        }
        if (this.field_b == 84) {
          return true;
        }
        if (this.field_b != 83) {
          return false;
        }
        return true;
    }

    final boolean c(boolean param0) {
        if (param0) {
          return this.field_b == 96 ? true : false;
        }
        al.a(25);
        return this.field_b == 96 ? true : false;
    }

    final void b(boolean param0) {
        this.field_h = 0;
        this.field_b = 0;
        this.field_c = 0;
        if (param0) {
          return;
        }
        if (this.field_e == 0) {
          this.field_b = ch.field_d;
        }
        if (this.field_e == 0 &&
          96 == ch.field_d) {
          if (this.field_d <= 0) {
            this.field_d = this.field_a;
          }
          this.field_f = false;
          this.field_d = this.field_d - 1;
        }
        if (this.field_e != 0) {
          return;
        }
        if (97 != ch.field_d) {
          return;
        }
        this.field_d = this.field_d + 1;
        this.field_f = false;
        if (this.field_a > this.field_d) {
          return;
        }
        this.field_d = 0;
    }

    final boolean e(int param0) {
        if (param0 == 0) {
          return this.field_b == 102 ? true : false;
        }
        this.field_c = -84;
        return this.field_b == 102 ? true : false;
    }

    final void d(byte param0) {
        this.field_h = 0;
        this.field_b = 0;
        this.field_c = 0;
        if (this.field_e != 0) {
          if (this.field_e == 0) {
            this.field_b = ch.field_d;
            if (this.field_e == 0 &&
              ch.field_d == 99) {
              this.field_d = this.field_d + 1;
              this.field_f = false;
              if (this.field_a <= this.field_d) {
                this.field_d = 0;
              }
            }
            if (param0 != -6) {
              this.field_h = 119;
            }
            return;
          }
          if (this.field_e == 0) {
            if (ch.field_d != 99) {
              if (param0 != -6) {
                this.field_h = 119;
              }
              return;
            }
            this.field_d = this.field_d + 1;
            this.field_f = false;
            if (this.field_a > this.field_d) {
              if (param0 != -6) {
                this.field_h = 119;
              }
              return;
            }
            this.field_d = 0;
          }
        } else {
          if (ch.field_d == 98) {
            if (0 < this.field_d) {
              this.field_d = this.field_d - 1;
              this.field_f = false;
              if (this.field_e == 0) {
                this.field_b = ch.field_d;
              }
              if (this.field_e == 0 &&
                ch.field_d == 99) {
                this.field_d = this.field_d + 1;
                this.field_f = false;
                if (this.field_a <= this.field_d) {
                  this.field_d = 0;
                }
              }
              if (param0 != -6) {
                this.field_h = 119;
              }
              return;
            }
            this.field_d = this.field_a;
            this.field_d = this.field_d - 1;
            this.field_f = false;
          }
          if (this.field_e == 0) {
            this.field_b = ch.field_d;
          }
          if (this.field_e == 0 &&
            ch.field_d == 99) {
            this.field_d = this.field_d + 1;
            this.field_f = false;
            if (this.field_a <= this.field_d) {
              this.field_d = 0;
            }
          }
        }
        if (param0 == -6) {
          return;
        }
        this.field_h = 119;
    }

    final boolean c(byte param0) {
        if (param0 != -72) {
          return true;
        }
        return this.field_b == 97 ? true : false;
    }

    final boolean b(byte param0) {
        if (param0 > 69) {
          return this.field_e != 0 ? true : false;
        }
        al.a(-25);
        return this.field_e != 0 ? true : false;
    }

    final boolean b(int param0) {
        if (param0 != 31552) {
          return true;
        }
        if (0 != this.field_h) {
          return true;
        }
        if (this.field_b == 84) {
          return true;
        }
        if (83 != this.field_b) {
          return false;
        }
        return true;
    }

    public static void a(int param0) {
        if (param0 != -84) {
          return;
        }
        field_i = null;
    }

    final void a(boolean param0) {
        this.field_b = 0;
        if (!param0) {
          this.field_c = 0;
          this.field_h = 0;
          if (this.field_e == 0) {
            this.field_b = ch.field_d;
          }
          return;
        }
        this.a(-34, -95, (byte) -94, false);
        this.field_c = 0;
        this.field_h = 0;
        if (this.field_e == 0) {
          this.field_b = ch.field_d;
        }
    }

    al(int param0) {
        this.field_d = 0;
        this.field_f = false;
        this.field_a = param0;
    }

    final boolean c(int param0) {
        if (param0 != -4135) {
          return true;
        }
        return this.field_b == 103 ? true : false;
    }

    static {
    }
}
