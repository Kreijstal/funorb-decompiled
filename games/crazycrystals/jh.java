/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jh {
    static String field_d;
    int field_c;
    private int field_h;
    private int field_k;
    boolean field_i;
    int field_b;
    private int field_j;
    static fp field_f;
    static int field_e;
    private int field_a;
    private int field_g;

    final void a(int param0, byte param1) {
        if (param1 != 104) {
          return;
        }
        this.field_g = 0;
        this.field_a = 0;
        this.field_j = 0;
        if (this.field_k == 0) {
          this.field_j = pj.field_q;
        }
        if (0 != this.field_k) {
          if (0 == this.field_k) {
            if (97 != pj.field_q) {
              if (this.field_k == 0) {
                if (pj.field_q != 98 &&
                  99 != pj.field_q) {
                  return;
                }
                this.field_i = false;
                if (0 > this.field_c) {
                  this.field_c = param0;
                }
              }
              return;
            }
            this.field_c = this.field_c + 1;
            if (this.field_b <= this.field_c) {
              this.field_c = 0;
            }
            this.field_i = false;
          }
          if (this.field_k != 0) {
            return;
          }
          if (pj.field_q == 98) {
            this.field_i = false;
            if (0 <= this.field_c) {
              return;
            }
            this.field_c = param0;
            return;
          }
          if (99 != pj.field_q) {
            return;
          }
          this.field_i = false;
          if (0 > this.field_c) {
            this.field_c = param0;
          }
          return;
        }
        if (pj.field_q != 96) {
          if (0 == this.field_k) {
            if (97 != pj.field_q) {
              if (this.field_k == 0) {
                if (pj.field_q != 98 &&
                  99 != pj.field_q) {
                  return;
                }
                this.field_i = false;
                if (0 > this.field_c) {
                  this.field_c = param0;
                }
              }
              return;
            }
            this.field_c = this.field_c + 1;
            if (this.field_b <= this.field_c) {
              this.field_c = 0;
            }
            this.field_i = false;
          }
          if (this.field_k != 0) {
            return;
          }
          if (pj.field_q == 98) {
            this.field_i = false;
            if (0 <= this.field_c) {
              return;
            }
            this.field_c = param0;
            return;
          }
          if (99 != pj.field_q) {
            return;
          }
          this.field_i = false;
          if (0 > this.field_c) {
            this.field_c = param0;
          }
          return;
        }
        if (this.field_c > 0) {
          this.field_c = this.field_c - 1;
          this.field_i = false;
          if (0 == this.field_k) {
            if (97 != pj.field_q) {
              if (this.field_k == 0) {
                if (pj.field_q != 98 &&
                  99 != pj.field_q) {
                  return;
                }
                this.field_i = false;
                if (0 > this.field_c) {
                  this.field_c = param0;
                }
              }
              return;
            }
            this.field_c = this.field_c + 1;
            if (this.field_b <= this.field_c) {
              this.field_c = 0;
            }
            this.field_i = false;
          }
          if (this.field_k != 0) {
            return;
          }
          if (pj.field_q == 98) {
            this.field_i = false;
            if (0 <= this.field_c) {
              return;
            }
            this.field_c = param0;
            return;
          }
          if (99 != pj.field_q) {
            return;
          }
          this.field_i = false;
          if (0 > this.field_c) {
            this.field_c = param0;
          }
          return;
        }
        this.field_c = this.field_b;
        this.field_c = this.field_c - 1;
        this.field_i = false;
        if (0 == this.field_k) {
          if (97 != pj.field_q) {
            if (this.field_k != 0) {
              return;
            }
            if (pj.field_q == 98) {
              this.field_i = false;
              if (0 <= this.field_c) {
                return;
              }
              this.field_c = param0;
              return;
            }
            if (99 != pj.field_q) {
              return;
            }
            this.field_i = false;
            if (0 > this.field_c) {
              this.field_c = param0;
            }
            return;
          }
          this.field_c = this.field_c + 1;
          if (this.field_b <= this.field_c) {
            this.field_c = 0;
          }
          this.field_i = false;
        }
        if (this.field_k == 0) {
          if (pj.field_q == 98) {
            this.field_i = false;
            if (0 <= this.field_c) {
              return;
            }
            this.field_c = param0;
          } else {
            if (99 == pj.field_q) {
              this.field_i = false;
              if (0 > this.field_c) {
                this.field_c = param0;
              }
              return;
            }
          }
        }
    }

    final boolean b(boolean param0) {
        if (param0) {
          return 102 == this.field_j ? true : false;
        }
        this.field_g = 34;
        return 102 == this.field_j ? true : false;
    }

    final boolean d(int param0) {
        if (param0 == 96) {
          return 96 == this.field_j ? true : false;
        }
        this.d(114);
        return 96 == this.field_j ? true : false;
    }

    final boolean c(int param0) {
        if (param0 != 96) {
          this.a(true);
          if (0 != this.field_g) {
            return true;
          }
          if (this.field_j != 84) {
            return 83 == this.field_j ? true : false;
          }
          return true;
        }
        if (0 != this.field_g) {
          return true;
        }
        if (this.field_j == 84) {
          return true;
        }
        if (83 != this.field_j) {
          return false;
        }
        return true;
    }

    final boolean g(int param0) {
        if (param0 != -1) {
          return true;
        }
        return this.field_k != 0 ? true : false;
    }

    final void a(int param0, int param1, int param2, byte param3, int param4) {
        int var6 = this.a((byte) -24, param2, qh.field_i, param4, param1, param0, bm.field_h);
        int var7 = this.a((byte) -24, param2, to.field_a, param4, param1, param0, dp.field_h);
        this.a(0, var7, var6);
        if (param3 == 76) {
          return;
        }
        this.b(true);
    }

    final void a(int param0, int param1, int param2) {
        if (param2 >= this.field_b) {
          throw new IllegalArgumentException();
        }
        if (param1 >= this.field_b) {
          throw new IllegalArgumentException();
        }
        this.field_g = 0;
        this.field_a = 0;
        this.field_j = 0;
        if (pj.field_v != 0) {
          this.field_c = param1;
          this.field_h = me.field_c;
          this.field_g = pj.field_v;
          this.field_a = pj.field_v;
          this.field_i = true;
          this.field_k = pj.field_v;
        }
        if (this.field_k == 0) {
          if (pj.field_v == param0 &&
            gg.field_c == 0) {
            this.field_k = 0;
            if (this.field_k == 0) {
              if (!this.field_i &&
                !ij.field_h) {
                return;
              }
              if (0 > param2) {
                if (this.field_i) {
                  this.field_c = -1;
                }
              } else {
                if (param2 == this.field_c) {
                  this.field_c = param2;
                  this.field_i = true;
                } else {
                  this.field_c = param2;
                  this.field_i = true;
                }
              }
            }
            return;
          }
          if (this.field_k != 0) {
            return;
          }
          if (this.field_i) {
            if (0 > param2) {
              if (!this.field_i) {
                return;
              }
              this.field_c = -1;
              return;
            }
            if (param2 == this.field_c) {
            }
            this.field_c = param2;
            this.field_i = true;
            return;
          }
          if (!ij.field_h) {
            return;
          }
          if (0 > param2) {
            if (this.field_i) {
              this.field_c = -1;
            }
          } else {
            if (param2 == this.field_c) {
            }
            this.field_c = param2;
            this.field_i = true;
          }
          return;
        }
        if (0 == gg.field_c) {
          if (pj.field_v == param0 &&
            gg.field_c == 0) {
            this.field_k = 0;
            if (this.field_k == 0) {
              if (!this.field_i &&
                !ij.field_h) {
                return;
              }
              if (0 > param2) {
                if (this.field_i) {
                  this.field_c = -1;
                }
              } else {
                if (param2 == this.field_c) {
                  this.field_c = param2;
                  this.field_i = true;
                } else {
                  this.field_c = param2;
                  this.field_i = true;
                }
              }
            }
            return;
          }
          if (this.field_k != 0) {
            return;
          }
          if (!this.field_i) {
            if (!ij.field_h) {
              return;
            }
            if (0 > param2) {
              if (this.field_i) {
                this.field_c = -1;
              }
            } else {
              if (param2 == this.field_c) {
              }
              this.field_c = param2;
              this.field_i = true;
            }
            return;
          }
        } else {
          if (this.field_h <= 0) {
            this.field_g = this.field_k;
            this.field_h = on.field_b;
          }
          this.field_h = this.field_h - 1;
          if (pj.field_v == param0 &&
            gg.field_c == 0) {
            this.field_k = 0;
            if (this.field_k != 0) {
              return;
            }
            if (!this.field_i &&
              !ij.field_h) {
              return;
            }
          } else {
            if (this.field_k != 0) {
              return;
            }
            if (!this.field_i &&
              !ij.field_h) {
              return;
            }
          }
        }
        if (0 > param2) {
          if (!this.field_i) {
            return;
          }
          this.field_c = -1;
          return;
        }
        if (param2 == this.field_c) {
        }
        this.field_c = param2;
        this.field_i = true;
    }

    final void a(byte param0, boolean param1, int param2, int param3) {
        this.field_k = 0;
        if (param0 != 41) {
          return;
        }
        this.field_i = param1 ? true : false;
        if (!this.field_i) {
          this.field_c = param3;
          return;
        }
        this.field_c = param2;
    }

    final int a(byte param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        if (param0 != -24) {
          field_f = (fp) null;
          if (param2 < param5) {
            return -1;
          }
          if (param2 >= param3) {
            return -1;
          }
          if (param6 < param4) {
            return -1;
          }
          if (param6 < param4 + param1 * this.field_b) {
            return (-param4 + param6) / param1;
          }
          return -1;
        }
        if (param2 < param5) {
          return -1;
        }
        if (param2 >= param3) {
          return -1;
        }
        if (param6 < param4) {
          return -1;
        }
        if (param6 < param4 + param1 * this.field_b) {
          return (-param4 + param6) / param1;
        }
        return -1;
    }

    final void a(int param0, boolean param1, int param2) {
        this.field_i = param1 ? true : false;
        this.field_k = 0;
        if (param0 == -1) {
          if (this.field_i) {
            this.field_c = param2;
          }
          return;
        }
        this.field_b = -75;
        if (this.field_i) {
          this.field_c = param2;
        }
    }

    final boolean b(int param0) {
        if (param0 > 65) {
          return this.field_j == 97 ? true : false;
        }
        field_e = -53;
        return this.field_j == 97 ? true : false;
    }

    final void f(int param0) {
        this.field_j = 0;
        this.field_g = param0;
        this.field_a = 0;
        if (this.field_k == 0 &&
          pj.field_q == 98) {
          if (0 >= this.field_c) {
            this.field_c = this.field_b;
          }
          this.field_c = this.field_c - 1;
          this.field_i = false;
        }
        if (this.field_k == 0) {
          this.field_j = pj.field_q;
        }
        if (0 != this.field_k) {
          return;
        }
        if (pj.field_q != 99) {
          return;
        }
        this.field_c = this.field_c + 1;
        this.field_i = false;
        if (this.field_c < this.field_b) {
          return;
        }
        this.field_c = 0;
    }

    final boolean e(int param0) {
        if (param0 != -19741) {
          return true;
        }
        return this.field_j == 103 ? true : false;
    }

    final void a(byte param0) {
        this.field_j = 0;
        this.field_a = 0;
        this.field_g = 0;
        if (this.field_k == 0) {
          this.field_j = pj.field_q;
        }
        int var2 = -49 / ((param0 + 70) / 53);
    }

    public static void a(int param0) {
        field_f = null;
        field_d = null;
        if (param0 != 18744) {
          jh.a(-47);
        }
    }

    final boolean a(boolean param0) {
        if (!param0) {
          return false;
        }
        if (this.field_a != 0) {
          return true;
        }
        if (this.field_j == 84) {
          return true;
        }
        if (this.field_j != 83) {
          return false;
        }
        return true;
    }

    jh(int param0) {
        this.field_c = 0;
        this.field_i = false;
        this.field_b = param0;
    }

    static {
        field_d = "This is a teleport.<br>Step on to this square<br>and you will be whisked<br>away to another part of<br>the level, provided<br>there is room at the<br>destination.<br><br>Teleports do not just<br>transport people. They<br>are happy with anything<br>that ends up sitting on<br>them.<br><br>Some teleports can only<br>be used once, others a few<br>times, before they die.";
        field_f = new fp();
    }
}
