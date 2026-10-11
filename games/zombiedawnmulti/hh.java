/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hh {
    private boolean field_a;
    static boolean field_b;
    static boolean field_m;
    private int field_k;
    private int field_j;
    static ja field_h;
    private int field_f;
    private int field_i;
    private int field_g;
    static volatile int field_e;
    int field_c;
    int field_d;
    static cj[] field_l;

    final boolean b(boolean param0) {
        if (!param0) {
          return this.field_k != 0 ? true : false;
        }
        field_m = true;
        return this.field_k != 0 ? true : false;
    }

    final boolean g(int param0) {
        int var2 = -121 % ((param0 + 74) / 35);
        return this.field_i == 102 ? true : false;
    }

    final boolean c(int param0) {
        if (param0 != -85) {
          this.b(false);
          if (this.field_g != 0) {
            return true;
          }
          if (this.field_i != 84) {
            return this.field_i == 83 ? true : false;
          }
          return true;
        }
        if (this.field_g != 0) {
          return true;
        }
        if (this.field_i == 84) {
          return true;
        }
        if (this.field_i != 83) {
          return false;
        }
        return true;
    }

    final void a(int param0, boolean param1, int param2) {
        this.field_a = param1 ? true : false;
        if (param0 == -9049) {
          this.field_k = 0;
          if (this.field_a) {
            this.field_d = param2;
          }
          return;
        }
        field_h = (ja) null;
        this.field_k = 0;
        if (this.field_a) {
          this.field_d = param2;
        }
    }

    final boolean b(byte param0) {
        if (param0 != -66) {
          return true;
        }
        if (this.field_f == 2) {
          return true;
        }
        if (this.field_i != 96) {
          return false;
        }
        return true;
    }

    final boolean a(int param0) {
        if (param0 != 97) {
          return true;
        }
        return this.field_i == 97 ? true : false;
    }

    final boolean e(int param0) {
        if (param0 == 96) {
          return this.field_i == 96 ? true : false;
        }
        this.field_j = 40;
        return this.field_i == 96 ? true : false;
    }

    final void d(int param0) {
        if (param0 != 99) {
          return;
        }
        this.field_i = 0;
        this.field_g = 0;
        this.field_f = 0;
        if (this.field_k == 0) {
          this.field_i = sj.field_p;
        }
        if (this.field_k == 0 &&
          sj.field_p == 98) {
          if (this.field_d <= 0) {
            this.field_d = this.field_c;
          }
          this.field_d = this.field_d - 1;
          this.field_a = false;
        }
        if (this.field_k != 0) {
          return;
        }
        if (sj.field_p != 99) {
          return;
        }
        this.field_d = this.field_d + 1;
        if (this.field_d >= this.field_c) {
          this.field_d = 0;
        }
        this.field_a = false;
    }

    final void a(int param0, int param1, int param2) {
        if (param1 >= 41) {
          if (this.field_c <= param0) {
            throw new IllegalArgumentException();
          }
          if (param2 >= this.field_c) {
            throw new IllegalArgumentException();
          }
          this.field_f = 0;
          this.field_g = 0;
          this.field_i = 0;
          if (0 != kd.field_b) {
            this.field_d = param2;
            this.field_j = aa.field_o;
            this.field_a = true;
            this.field_k = kd.field_b;
            this.field_f = kd.field_b;
            this.field_g = kd.field_b;
            if (this.field_k != 0 &&
              pq.field_f != 0) {
              if (0 >= this.field_j) {
                this.field_f = this.field_k;
                this.field_j = dj.field_m;
              }
              this.field_j = this.field_j - 1;
            }
            if (kd.field_b == 0 &&
              0 == pq.field_f) {
              this.field_k = 0;
            }
            if (this.field_k == 0) {
              if (!this.field_a &&
                !wc.field_J) {
                return;
              }
              if (param0 < 0) {
                if (this.field_a) {
                  this.field_d = -1;
                }
              } else {
                if (param0 == this.field_d) {
                  this.field_d = param0;
                  this.field_a = true;
                } else {
                  this.field_d = param0;
                  this.field_a = true;
                }
              }
            }
            return;
          }
          if (this.field_k != 0 &&
            pq.field_f != 0) {
            if (0 >= this.field_j) {
              this.field_f = this.field_k;
              this.field_j = dj.field_m;
            }
            this.field_j = this.field_j - 1;
          }
          if (kd.field_b == 0) {
            if (0 != pq.field_f) {
              if (this.field_k == 0) {
                if (!this.field_a &&
                  !wc.field_J) {
                  return;
                }
                if (param0 < 0) {
                  if (this.field_a) {
                    this.field_d = -1;
                  }
                } else {
                  if (param0 == this.field_d) {
                    this.field_d = param0;
                    this.field_a = true;
                  } else {
                    this.field_d = param0;
                    this.field_a = true;
                  }
                }
              }
              return;
            }
            this.field_k = 0;
          }
          if (this.field_k != 0) {
            return;
          }
          if (this.field_a) {
            if (param0 < 0) {
              if (!this.field_a) {
                return;
              }
              this.field_d = -1;
              return;
            }
            if (param0 == this.field_d) {
            }
            this.field_d = param0;
            this.field_a = true;
            return;
          }
          if (!wc.field_J) {
            return;
          }
          if (param0 < 0) {
            if (this.field_a) {
              this.field_d = -1;
            }
          } else {
            if (param0 == this.field_d) {
            }
            this.field_d = param0;
            this.field_a = true;
          }
          return;
        }
        this.field_f = 8;
        if (this.field_c <= param0) {
          throw new IllegalArgumentException();
        }
        if (param2 >= this.field_c) {
          throw new IllegalArgumentException();
        }
        this.field_f = 0;
        this.field_g = 0;
        this.field_i = 0;
        if (0 != kd.field_b) {
          this.field_d = param2;
          this.field_j = aa.field_o;
          this.field_a = true;
          this.field_k = kd.field_b;
          this.field_f = kd.field_b;
          this.field_g = kd.field_b;
          if (this.field_k == 0) {
            if (kd.field_b == 0 &&
              0 == pq.field_f) {
              this.field_k = 0;
            }
            if (this.field_k == 0) {
              if (!this.field_a &&
                !wc.field_J) {
                return;
              }
              if (param0 < 0) {
                if (this.field_a) {
                  this.field_d = -1;
                }
              } else {
                if (param0 == this.field_d) {
                  this.field_d = param0;
                  this.field_a = true;
                } else {
                  this.field_d = param0;
                  this.field_a = true;
                }
              }
            }
            return;
          }
          if (pq.field_f != 0) {
            if (0 >= this.field_j) {
              this.field_f = this.field_k;
              this.field_j = dj.field_m;
            }
            this.field_j = this.field_j - 1;
          }
          if (kd.field_b == 0 &&
            0 == pq.field_f) {
            this.field_k = 0;
          }
          if (this.field_k == 0) {
            if (!this.field_a &&
              !wc.field_J) {
              return;
            }
            if (param0 < 0) {
              if (this.field_a) {
                this.field_d = -1;
              }
            } else {
              if (param0 == this.field_d) {
                this.field_d = param0;
                this.field_a = true;
              } else {
                this.field_d = param0;
                this.field_a = true;
              }
            }
          }
          return;
        }
        if (this.field_k == 0) {
          boolean decompiledFrameRemainder0 = true;
          if (kd.field_b == 0) {
            if (0 != pq.field_f) {
              if (this.field_k != 0) {
                return;
              }
              if (!this.field_a &&
                !wc.field_J) {
                return;
              }
              decompiledFrameRemainder0 = false;
            }
            else {
              this.field_k = 0;
            }
          }
          if (decompiledFrameRemainder0) {
            if (this.field_k != 0) {
              return;
            }
            if (!this.field_a &&
              !wc.field_J) {
              return;
            }
          }
          if (param0 < 0) {
            if (!this.field_a) {
              return;
            }
            this.field_d = -1;
            return;
          }
          if (param0 == this.field_d) {
          }
          this.field_d = param0;
          this.field_a = true;
          return;
        }
        if (pq.field_f == 0) {
          if (kd.field_b == 0) {
            if (0 != pq.field_f) {
              if (this.field_k != 0) {
                return;
              }
              if (!this.field_a &&
                !wc.field_J) {
                return;
              }
              if (param0 < 0) {
                if (!this.field_a) {
                  return;
                }
                this.field_d = -1;
                return;
              }
              if (param0 == this.field_d) {
              }
              this.field_d = param0;
              this.field_a = true;
              return;
            }
            this.field_k = 0;
          }
        } else {
          if (0 >= this.field_j) {
            this.field_f = this.field_k;
            this.field_j = dj.field_m;
          }
          this.field_j = this.field_j - 1;
          if (kd.field_b == 0) {
            if (0 != pq.field_f) {
              if (this.field_k == 0) {
                if (!this.field_a &&
                  !wc.field_J) {
                  return;
                }
                if (param0 >= 0) {
                  if (param0 == this.field_d) {
                    this.field_d = param0;
                    this.field_a = true;
                    return;
                  }
                  this.field_d = param0;
                  this.field_a = true;
                  return;
                }
                if (!this.field_a) {
                  return;
                }
                this.field_d = -1;
              }
              return;
            }
            this.field_k = 0;
          }
        }
        if (this.field_k == 0) {
          if (this.field_a) {
            if (param0 >= 0) {
              if (param0 == this.field_d) {
              }
              this.field_d = param0;
              this.field_a = true;
              return;
            }
            if (!this.field_a) {
              return;
            }
            this.field_d = -1;
          } else {
            if (wc.field_J) {
              if (param0 < 0) {
                if (!this.field_a) {
                  return;
                }
                this.field_d = -1;
                return;
              }
              if (param0 == this.field_d) {
              }
              this.field_d = param0;
              this.field_a = true;
              return;
            }
          }
        }
    }

    final void a(int param0, boolean param1, int param2, int param3) {
        this.field_a = param1 ? true : false;
        if (param2 != -31458) {
          hh.b(-34);
          this.field_k = 0;
          if (this.field_a) {
            this.field_d = param3;
            return;
          }
          this.field_d = param0;
          return;
        }
        this.field_k = 0;
        if (this.field_a) {
          this.field_d = param3;
          return;
        }
        this.field_d = param0;
    }

    final static void b(int param0) {
        int var2;
        var2 = ZombieDawnMulti.field_E ? 1 : 0;
        if (mh.field_h > 0) {
          mh.field_h = mh.field_h - 1;
        } else {
          if (sq.field_Q > 0) {
            sq.field_Q = sq.field_Q - 1;
          } else {
            if (da.field_a > 0) {
              da.field_a = da.field_a - 1;
            }
          }
        }
        if (mh.field_h > 0) {
          v.a(param0 + 199);
        }
        if (sq.field_Q > 0) {
          mf.a(sq.field_Q, false);
        }
        if (param0 >= da.field_a) {
          return;
        }
        mf.a(da.field_a, false);
    }

    public static void a(boolean param0) {
        field_h = null;
        if (!param0) {
          field_e = -10;
          field_l = null;
          return;
        }
        field_l = null;
    }

    final boolean f(int param0) {
        if (param0 != -23954) {
          return false;
        }
        return this.field_i == 103 ? true : false;
    }

    final void a(int param0, boolean param1) {
        this.field_i = 0;
        this.field_f = 0;
        this.field_g = 0;
        if (0 == this.field_k) {
          this.field_i = sj.field_p;
        }
        boolean decompiledFrameRemainder0 = true;
        if (this.field_k == 0) {
          if (sj.field_p != 96) {
            if (this.field_k != 0) {
              if (0 == this.field_k && (98 == sj.field_p ||
                sj.field_p == 99)) {
                this.field_a = false;
                if (this.field_d < 0) {
                  this.field_d = param0;
                }
              }
              if (param1) {
                field_m = false;
              }
              return;
            }
            if (sj.field_p != 97) {
              if (0 == this.field_k && (98 == sj.field_p ||
                sj.field_p == 99)) {
                this.field_a = false;
                if (this.field_d < 0) {
                  this.field_d = param0;
                }
              }
              if (param1) {
                field_m = false;
              }
              return;
            }
            this.field_d = this.field_d + 1;
            if (this.field_d >= this.field_c) {
              this.field_d = 0;
            }
            this.field_a = false;
            if (0 == this.field_k) {
              if (98 != sj.field_p &&
                sj.field_p != 99) {
                if (param1) {
                  field_m = false;
                }
                return;
              }
              this.field_a = false;
              if (this.field_d < 0) {
                this.field_d = param0;
              }
            }
            decompiledFrameRemainder0 = false;
          }
          else {
            if (this.field_d <= 0) {
              this.field_d = this.field_c;
            }
            this.field_a = false;
            this.field_d = this.field_d - 1;
          }
        }
        if (decompiledFrameRemainder0) {
          if (this.field_k == 0 &&
            sj.field_p == 97) {
            this.field_d = this.field_d + 1;
            if (this.field_d >= this.field_c) {
              this.field_d = 0;
            }
            this.field_a = false;
          }
          if (0 == this.field_k &&
            (98 == sj.field_p ||
            sj.field_p == 99)) {
            this.field_a = false;
            if (this.field_d < 0) {
              this.field_d = param0;
            }
          }
        }
        if (!param1) {
          return;
        }
        field_m = false;
    }

    final void a(int param0, int param1) {
        if (param1 == -1) {
          if (this.field_k == 0) {
            this.field_d = param0;
            this.field_a = false;
          }
          return;
        }
        this.g(-127);
        if (this.field_k == 0) {
          this.field_d = param0;
          this.field_a = false;
        }
    }

    hh(int param0) {
        this.field_a = false;
        this.field_d = 0;
        this.field_c = param0;
    }

    final boolean a(byte param0) {
        if (param0 != -106) {
          return false;
        }
        if (this.field_f == 1) {
          return true;
        }
        if (97 == this.field_i) {
          return true;
        }
        if (84 == this.field_i) {
          return true;
        }
        if (this.field_i != 83) {
          return false;
        }
        return true;
    }

    static {
        field_e = 0;
    }
}
