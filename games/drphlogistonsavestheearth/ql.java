/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ql {
    private int field_c;
    int field_e;
    boolean field_g;
    private int field_d;
    int field_f;
    private int field_a;
    private int field_h;
    static int[] field_b;
    private int field_j;
    static vd field_i;

    final void a(int param0, byte param1) {
        int var3;
        var3 = -25 % ((30 - param1) / 45);
        this.field_h = 0;
        this.field_c = 0;
        this.field_j = 0;
        boolean decompiledFrameRemainder0 = true;
        if (this.field_a == 0) {
          if (di.field_c != 96) {
            if (this.field_a != 0) {
              if (this.field_a == 0 &&
                di.field_c == 97) {
                this.field_f = this.field_f + 1;
                if (this.field_f >= this.field_e) {
                  this.field_f = 0;
                }
                this.field_g = false;
              }
              if (0 == this.field_a) {
                if (di.field_c != 98 &&
                  di.field_c != 99) {
                  return;
                }
                this.field_g = false;
                if (this.field_f < 0) {
                  this.field_f = param0;
                }
              }
              return;
            }
            this.field_h = di.field_c;
            if (this.field_a != 0) {
              if (0 == this.field_a) {
                if (di.field_c != 98 &&
                  di.field_c != 99) {
                  return;
                }
                this.field_g = false;
                if (this.field_f < 0) {
                  this.field_f = param0;
                }
              }
              return;
            }
            if (di.field_c == 97) {
              this.field_f = this.field_f + 1;
              if (this.field_f >= this.field_e) {
                this.field_f = 0;
              }
              this.field_g = false;
            }
            if (0 != this.field_a) {
              return;
            }
            decompiledFrameRemainder0 = (di.field_c != 98);
            if (decompiledFrameRemainder0) {
              if (di.field_c != 99) {
                return;
              }
              this.field_g = false;
              if (this.field_f < 0) {
                this.field_f = param0;
              }
              return;
            }
          }
          if (decompiledFrameRemainder0) {
            if (this.field_f <= 0) {
              this.field_f = this.field_e;
            }
            this.field_g = false;
            this.field_f = this.field_f - 1;
          }
        }
        if (decompiledFrameRemainder0) {
          if (this.field_a == 0) {
            this.field_h = di.field_c;
          }
          if (this.field_a == 0 &&
            di.field_c == 97) {
            this.field_f = this.field_f + 1;
            if (this.field_f >= this.field_e) {
              this.field_f = 0;
            }
            this.field_g = false;
          }
          if (0 != this.field_a) {
            return;
          }
          if (di.field_c != 98 &&
            di.field_c != 99) {
            return;
          }
        }
        this.field_g = false;
        if (this.field_f >= 0) {
          return;
        }
        this.field_f = param0;
    }

    final void d(int param0) {
        this.field_j = 0;
        this.field_c = 0;
        this.field_h = 0;
        if (this.field_a == 0) {
          this.field_h = di.field_c;
        }
        if (0 == this.field_a &&
          96 == di.field_c) {
          if (this.field_f <= 0) {
            this.field_f = this.field_e;
          }
          this.field_g = false;
          this.field_f = this.field_f - 1;
        }
        if (param0 != ~this.field_a) {
          return;
        }
        if (97 != di.field_c) {
          return;
        }
        this.field_f = this.field_f + 1;
        this.field_g = false;
        if (this.field_f < this.field_e) {
          return;
        }
        this.field_f = 0;
    }

    final void f(int param0) {
        this.field_h = 0;
        this.field_c = 0;
        if (param0 == 50) {
          this.field_j = 0;
          if (this.field_a == 0) {
            this.field_h = di.field_c;
          }
          return;
        }
    }

    final void c(int param0) {
        int var2;
        int var2Lifetime1;
        this.field_j = 0;
        this.field_h = 0;
        this.field_c = 0;
        if (this.field_a != 0) {
          if (0 == this.field_a) {
            this.field_h = di.field_c;
          }
          if (this.field_a == 0 &&
            99 == di.field_c) {
            this.field_f = this.field_f + 1;
            this.field_g = false;
            if (this.field_f >= this.field_e) {
              this.field_f = 0;
            }
          }
        } else {
          if (di.field_c != 98) {
            if (0 == this.field_a) {
              this.field_h = di.field_c;
            }
            if (this.field_a == 0 &&
              99 == di.field_c) {
              this.field_f = this.field_f + 1;
              this.field_g = false;
              if (this.field_f >= this.field_e) {
                this.field_f = 0;
              }
            }
          } else {
            if (this.field_f > 0) {
              this.field_f = this.field_f - 1;
              this.field_g = false;
              if (0 == this.field_a) {
                this.field_h = di.field_c;
              }
              if (this.field_a == 0 &&
                99 == di.field_c) {
                this.field_f = this.field_f + 1;
                this.field_g = false;
                if (this.field_f < this.field_e) {
                  var2 = -7 % ((-13 - param0) / 49);
                  return;
                }
                this.field_f = 0;
              }
            } else {
              this.field_f = this.field_e;
              this.field_f = this.field_f - 1;
              this.field_g = false;
              if (0 == this.field_a) {
                this.field_h = di.field_c;
              }
              if (this.field_a == 0 &&
                99 == di.field_c) {
                this.field_f = this.field_f + 1;
                this.field_g = false;
                if (this.field_f >= this.field_e) {
                  this.field_f = 0;
                }
              }
            }
          }
        }
        var2Lifetime1 = -7 % ((-13 - param0) / 49);
    }

    final boolean c(byte param0) {
        if (param0 != -82) {
          this.field_c = 13;
          if (0 != this.field_c) {
            return true;
          }
          if (84 != this.field_h) {
            return this.field_h == 83 ? true : false;
          }
          return true;
        }
        if (0 != this.field_c) {
          return true;
        }
        if (84 == this.field_h) {
          return true;
        }
        if (this.field_h != 83) {
          return false;
        }
        return true;
    }

    final boolean h(int param0) {
        int var2 = 50 % ((0 - param0) / 55);
        return 96 == this.field_h ? true : false;
    }

    final boolean i(int param0) {
        int var2 = -15 / ((57 - param0) / 54);
        return this.field_h == 103 ? true : false;
    }

    final boolean b(byte param0) {
        if (param0 < 16) {
          this.c((byte) -22);
          if (this.field_j == 1) {
            return true;
          }
          if (this.field_h == 97) {
            return true;
          }
          if (this.field_h == 84) {
            return true;
          }
          if (this.field_h != 83) {
            return false;
          }
          return true;
        }
        if (this.field_j == 1) {
          return true;
        }
        if (this.field_h == 97) {
          return true;
        }
        if (this.field_h == 84) {
          return true;
        }
        if (this.field_h != 83) {
          return false;
        }
        return true;
    }

    final boolean e(int param0) {
        if (param0 != -748) {
          this.b(-81);
          if (this.field_j != 0) {
            return true;
          }
          if (this.field_h != 84) {
            return this.field_h == 83 ? true : false;
          }
          return true;
        }
        if (this.field_j != 0) {
          return true;
        }
        if (this.field_h == 84) {
          return true;
        }
        if (this.field_h != 83) {
          return false;
        }
        return true;
    }

    final void a(int param0, byte param1, boolean param2) {
        this.field_a = 0;
        this.field_g = param2 ? true : false;
        if (param1 != 3) {
          field_i = (vd) null;
          if (this.field_g) {
            this.field_f = param0;
            return;
          }
          return;
        }
        if (!this.field_g) {
          return;
        }
        this.field_f = param0;
    }

    final void a(int param0, int param1, int param2) {
        if (param1 >= this.field_e) {
          throw new IllegalArgumentException();
        }
        if (this.field_e <= param2) {
          throw new IllegalArgumentException();
        }
        this.field_h = 0;
        this.field_j = 0;
        this.field_c = 0;
        if (mh.field_f != 0) {
          this.field_d = bb.field_c;
          this.field_j = mh.field_f;
          this.field_c = mh.field_f;
          this.field_g = true;
          this.field_f = param2;
          this.field_a = mh.field_f;
        }
        if (this.field_a == 0) {
          if (mh.field_f == 0) {
            if (db.field_a != 0) {
              if (this.field_a == param0) {
                if (!this.field_g &&
                  !df.field_o) {
                  return;
                }
                if (0 > param1) {
                  if (this.field_g) {
                    this.field_f = -1;
                  }
                } else {
                  if (param1 != this.field_f) {
                    this.field_g = true;
                    this.field_f = param1;
                  } else {
                    this.field_g = true;
                    this.field_f = param1;
                  }
                }
              }
              return;
            }
            this.field_a = 0;
          }
          if (this.field_a != param0) {
            return;
          }
          if (!this.field_g &&
            !df.field_o) {
            return;
          }
          if (0 > param1) {
            if (!this.field_g) {
              return;
            }
            this.field_f = -1;
            return;
          }
          if (param1 != this.field_f) {
          }
          this.field_g = true;
          this.field_f = param1;
          return;
        }
        if (0 == db.field_a) {
          if (mh.field_f == 0) {
            if (db.field_a != 0) {
              if (this.field_a == param0) {
                if (!this.field_g &&
                  !df.field_o) {
                  return;
                }
                if (0 > param1) {
                  if (this.field_g) {
                    this.field_f = -1;
                  }
                } else {
                  if (param1 != this.field_f) {
                    this.field_g = true;
                    this.field_f = param1;
                  } else {
                    this.field_g = true;
                    this.field_f = param1;
                  }
                }
              }
              return;
            }
            this.field_a = 0;
          }
          if (this.field_a != param0) {
            return;
          }
          if (!this.field_g &&
            !df.field_o) {
            return;
          }
          if (0 > param1) {
            if (!this.field_g) {
              return;
            }
            this.field_f = -1;
            return;
          }
          if (param1 != this.field_f) {
          }
          this.field_g = true;
          this.field_f = param1;
          return;
        }
        if (this.field_d > 0) {
          this.field_d = this.field_d - 1;
          if (mh.field_f == 0 &&
            db.field_a == 0) {
            this.field_a = 0;
          }
          if (this.field_a != param0) {
            return;
          }
          if (!this.field_g &&
            !df.field_o) {
            return;
          }
          if (0 > param1) {
            if (!this.field_g) {
              return;
            }
            this.field_f = -1;
            return;
          }
          if (param1 != this.field_f) {
          }
          this.field_g = true;
          this.field_f = param1;
          return;
        }
        this.field_d = eg.field_e;
        this.field_j = this.field_a;
        this.field_d = this.field_d - 1;
        if (mh.field_f != 0) {
          if (this.field_a != param0) {
            return;
          }
          if (!this.field_g &&
            !df.field_o) {
            return;
          }
          if (0 > param1) {
            if (!this.field_g) {
              return;
            }
            this.field_f = -1;
            return;
          }
          if (param1 == this.field_f) {
            this.field_g = true;
            this.field_f = param1;
            return;
          }
          this.field_g = true;
          this.field_f = param1;
          return;
        }
        if (db.field_a == 0) {
          this.field_a = 0;
        }
        if (this.field_a != param0) {
          return;
        }
        if (this.field_g ||
          df.field_o) {
          if (0 > param1) {
            if (!this.field_g) {
              return;
            }
            this.field_f = -1;
            return;
          }
          if (param1 == this.field_f) {
            this.field_g = true;
            this.field_f = param1;
            return;
          }
          this.field_g = true;
          this.field_f = param1;
        }
    }

    final boolean a(int param0) {
        if (param0 != -14164) {
          return true;
        }
        return 0 != this.field_a ? true : false;
    }

    final boolean a(boolean param0) {
        if (!param0) {
          return this.field_h == 102 ? true : false;
        }
        ql.a((byte) 15);
        return this.field_h == 102 ? true : false;
    }

    final void a(int param0, int param1) {
        if (param1 != 100) {
          return;
        }
        if (this.field_a == 0) {
          this.field_g = false;
          this.field_f = param0;
        }
    }

    public static void a(byte param0) {
        if (param0 > -112) {
          return;
        }
        field_i = null;
        field_b = null;
    }

    final boolean b(int param0) {
        if (param0 < 84) {
          return false;
        }
        return this.field_h == 97 ? true : false;
    }

    final boolean g(int param0) {
        if (param0 != -85) {
          return true;
        }
        if (this.field_j == 2) {
          return true;
        }
        if (this.field_h != 96) {
          return false;
        }
        return true;
    }

    final void a(int param0, int param1, boolean param2, int param3) {
        this.field_a = 0;
        int var5 = -77 % ((param3 - 1) / 39);
        this.field_g = param2 ? true : false;
        if (this.field_g) {
          this.field_f = param1;
          return;
        }
        this.field_f = param0;
    }

    ql(int param0) {
        this.field_f = 0;
        this.field_g = false;
        this.field_e = param0;
    }

    static {
        field_b = new int[]{100, 10, 45, 20, 20, 3200, 1, 50, 20, 50, 200, 10000, 80, 50, 65, 40, 65, 10000, 15000, 150, 50, 50, 150, 100, 100, 200, 150, 175, 100, 50, 50, 100, 100, 100, 100, 100, 2400, 20, 15, 30, 4, 40, 200, 200, 500, 500, 50, 45, 1, 1, 1, 20, 20, 20, 20, 20, 1, 1, 1, 45, 45, 80, 80, 130, 1, 250, 50, 150, 200, 100, 100, 200, 150, 175, 100, 50, 50};
        field_i = new vd();
    }
}
