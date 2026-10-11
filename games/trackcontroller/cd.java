/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cd {
    private int field_k;
    private int field_l;
    int field_e;
    private int field_m;
    boolean field_a;
    static ja field_h;
    static qj field_c;
    static int field_b;
    private int field_d;
    private int field_f;
    int field_i;
    static boolean field_j;
    static int field_g;

    final boolean d(int param0) {
        if (param0 != 0) {
          this.a(104, 14, true, 13);
          if (0 != this.field_d) {
            return true;
          }
          if (84 != this.field_f) {
            return this.field_f == 83 ? true : false;
          }
          return true;
        }
        if (0 != this.field_d) {
          return true;
        }
        if (84 == this.field_f) {
          return true;
        }
        if (this.field_f != 83) {
          return false;
        }
        return true;
    }

    final void a(int param0, int param1, int param2, boolean param3, int param4) {
        int var6 = this.a(param1, fg.field_a, param4, -85, param0, param2, kf.field_b);
        int var7 = this.a(param1, wg.field_e, param4, -85, param0, param2, db.field_X);
        if (!param3) {
          this.a(-126, var6, var7);
          return;
        }
        int discarded$0 = this.a(-49, 68, -96, -111, -56, 63, 114);
        this.a(-126, var6, var7);
    }

    final boolean a(boolean param0) {
        if (param0) {
          return this.field_f == 102 ? true : false;
        }
        this.b((byte) -61);
        return this.field_f == 102 ? true : false;
    }

    final boolean e(int param0) {
        if (param0 == 0) {
          return this.field_l != 0 ? true : false;
        }
        this.field_d = 58;
        return this.field_l != 0 ? true : false;
    }

    final void a(byte param0) {
        this.field_f = 0;
        this.field_m = 0;
        this.field_d = 0;
        if (0 == this.field_l) {
          this.field_f = kg.field_d;
        }
        if (param0 < 10) {
          return;
        }
        if (0 == this.field_l &&
          kg.field_d == 96) {
          if (this.field_e <= 0) {
            this.field_e = this.field_i;
          }
          this.field_a = false;
          this.field_e = this.field_e - 1;
        }
        if (0 != this.field_l) {
          return;
        }
        if (kg.field_d != 97) {
          return;
        }
        this.field_e = this.field_e + 1;
        this.field_a = false;
        if (this.field_e < this.field_i) {
          return;
        }
        this.field_e = 0;
    }

    final void b(byte param0) {
        if (param0 > -52) {
          return;
        }
        this.field_m = 0;
        this.field_d = 0;
        this.field_f = 0;
        if (this.field_l != 0) {
          if (0 == this.field_l &&
            kg.field_d == 98) {
            if (this.field_e <= 0) {
              this.field_e = this.field_i;
            }
            this.field_a = false;
            this.field_e = this.field_e - 1;
          }
        } else {
          this.field_f = kg.field_d;
          if (0 != this.field_l) {
            if (this.field_l != 0) {
              return;
            }
            if (99 != kg.field_d) {
              return;
            }
            this.field_e = this.field_e + 1;
            if (this.field_e >= this.field_i) {
              this.field_e = 0;
            }
            this.field_a = false;
            return;
          }
          if (kg.field_d == 98) {
            if (this.field_e <= 0) {
              this.field_e = this.field_i;
            }
            this.field_a = false;
            this.field_e = this.field_e - 1;
          }
        }
        if (this.field_l == 0 &&
          99 == kg.field_d) {
          this.field_e = this.field_e + 1;
          if (this.field_e >= this.field_i) {
            this.field_e = 0;
          }
          this.field_a = false;
        }
    }

    final boolean b(int param0) {
        int var2 = 52 % ((31 - param0) / 56);
        return this.field_f == 103 ? true : false;
    }

    final void a(int param0, int param1, boolean param2, int param3) {
        this.field_l = 0;
        this.field_a = param2 ? true : false;
        if (param3 < 96) {
          return;
        }
        if (!this.field_a) {
          this.field_e = param0;
          return;
        }
        this.field_e = param1;
    }

    final boolean a(int param0) {
        if (param0 == 0) {
          return this.field_f == 97 ? true : false;
        }
        this.field_a = false;
        return this.field_f == 97 ? true : false;
    }

    public static void c(int param0) {
        field_c = null;
        field_h = null;
        if (param0 != 11352) {
          field_g = -51;
        }
    }

    final void a(int param0, int param1, int param2) {
        if (this.field_i <= param1) {
          throw new IllegalArgumentException();
        }
        if (param2 >= this.field_i) {
          throw new IllegalArgumentException();
        }
        this.field_m = 0;
        this.field_f = 0;
        this.field_d = 0;
        if (uk.field_a != 0) {
          this.field_e = param2;
          this.field_k = qk.field_N;
          this.field_l = uk.field_a;
          this.field_a = true;
          this.field_m = uk.field_a;
          this.field_d = uk.field_a;
        }
        if (this.field_l == 0) {
          if (uk.field_a == 0) {
            if (rj.field_a != 0) {
              if (0 == this.field_l && (this.field_a ||
                mg.field_a)) {
                if (0 <= param1) {
                  if (this.field_e == param1) {
                    this.field_e = param1;
                    this.field_a = true;
                  } else {
                    this.field_e = param1;
                    this.field_a = true;
                  }
                } else {
                  if (this.field_a) {
                    this.field_e = -1;
                  }
                }
              }
              if (param0 >= -117) {
                this.a(true);
              }
              return;
            }
            this.field_l = 0;
          }
          if (0 == this.field_l) {
            if (this.field_a) {
              if (0 <= param1) {
                if (this.field_e == param1) {
                }
                this.field_e = param1;
                this.field_a = true;
                if (param0 >= -117) {
                  this.a(true);
                }
                return;
              }
              if (this.field_a) {
                this.field_e = -1;
                if (param0 >= -117) {
                  this.a(true);
                }
                return;
              }
            } else {
              if (mg.field_a) {
                if (0 <= param1) {
                  if (this.field_e == param1) {
                  }
                  this.field_e = param1;
                  this.field_a = true;
                } else {
                  if (this.field_a) {
                    this.field_e = -1;
                  }
                }
                if (param0 >= -117) {
                  this.a(true);
                }
                return;
              }
            }
          }
          if (param0 < -117) {
            return;
          }
          this.a(true);
          return;
        }
        if (rj.field_a == 0) {
          boolean decompiledFrameRemainder0 = true;
          if (uk.field_a == 0) {
            if (rj.field_a != 0) {
              if (0 == this.field_l && (this.field_a ||
                mg.field_a)) {
                if (0 <= param1) {
                  if (this.field_e == param1) {
                    this.field_e = param1;
                    this.field_a = true;
                  } else {
                    this.field_e = param1;
                    this.field_a = true;
                  }
                } else {
                  if (this.field_a) {
                    this.field_e = -1;
                  }
                }
              }
              decompiledFrameRemainder0 = false;
            }
            else {
              this.field_l = 0;
            }
          }
          if (decompiledFrameRemainder0) {
            if (0 != this.field_l) {
              if (param0 < -117) {
                return;
              }
              this.a(true);
              return;
            }
            if (!this.field_a) {
              if (!mg.field_a) {
                if (param0 < -117) {
                  return;
                }
                this.a(true);
                return;
              }
              if (0 <= param1) {
                if (this.field_e == param1) {
                }
                this.field_e = param1;
                this.field_a = true;
              } else {
                if (this.field_a) {
                  this.field_e = -1;
                }
              }
            } else {
              if (0 > param1) {
                if (!this.field_a) {
                  if (param0 < -117) {
                    return;
                  }
                  this.a(true);
                  return;
                }
                this.field_e = -1;
              } else {
                if (this.field_e == param1) {
                }
                this.field_e = param1;
                this.field_a = true;
              }
            }
          }
        } else {
          if (0 >= this.field_k) {
            this.field_m = this.field_l;
            this.field_k = f.field_a;
          }
          this.field_k = this.field_k - 1;
          if (uk.field_a == 0) {
            if (rj.field_a != 0) {
              if (0 == this.field_l && (this.field_a ||
                mg.field_a)) {
                if (0 <= param1) {
                  if (this.field_e == param1) {
                    this.field_e = param1;
                    this.field_a = true;
                  } else {
                    this.field_e = param1;
                    this.field_a = true;
                  }
                } else {
                  if (this.field_a) {
                    this.field_e = -1;
                  }
                }
              }
              if (param0 >= -117) {
                this.a(true);
              }
              return;
            }
            this.field_l = 0;
          }
          if (0 != this.field_l) {
            if (param0 < -117) {
              return;
            }
            this.a(true);
            return;
          }
          if (this.field_a) {
            if (0 > param1) {
              if (this.field_a) {
                this.field_e = -1;
              }
            } else {
              if (this.field_e == param1) {
              }
              this.field_e = param1;
              this.field_a = true;
            }
            if (param0 < -117) {
              return;
            }
            this.a(true);
            return;
          }
          if (!mg.field_a) {
            if (param0 < -117) {
              return;
            }
            this.a(true);
            return;
          }
          if (0 > param1) {
            if (this.field_a) {
              this.field_e = -1;
            }
            if (param0 < -117) {
              return;
            }
            this.a(true);
            return;
          }
          if (this.field_e == param1) {
          }
          this.field_e = param1;
          this.field_a = true;
        }
        if (param0 >= -117) {
          this.a(true);
        }
    }

    final void f(int param0) {
        this.field_f = 0;
        this.field_m = 0;
        this.field_d = param0;
        if (this.field_l == 0) {
          this.field_f = kg.field_d;
        }
    }

    final void a(int param0, boolean param1, byte param2) {
        this.field_a = param1 ? true : false;
        this.field_l = 0;
        if (this.field_a) {
          this.field_e = param0;
        }
        if (param2 >= 75) {
          return;
        }
        this.field_k = -27;
    }

    private final int a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        if (param3 != -85) {
          this.field_l = -109;
          if (param0 > param6) {
            return -1;
          }
          if (param6 >= param2) {
            return -1;
          }
          if (param4 > param1) {
            return -1;
          }
          if (param5 * this.field_i + param4 > param1) {
            return (param1 - param4) / param5;
          }
          return -1;
        }
        if (param0 > param6) {
          return -1;
        }
        if (param6 >= param2) {
          return -1;
        }
        if (param4 > param1) {
          return -1;
        }
        if (param5 * this.field_i + param4 > param1) {
          return (param1 - param4) / param5;
        }
        return -1;
    }

    final boolean b(boolean param0) {
        if (param0) {
          return false;
        }
        if (this.field_m != 0) {
          return true;
        }
        if (this.field_f == 84) {
          return true;
        }
        if (this.field_f != 83) {
          return false;
        }
        return true;
    }

    final boolean c(byte param0) {
        if (param0 == 11) {
          return 96 == this.field_f ? true : false;
        }
        this.c((byte) 69);
        return 96 == this.field_f ? true : false;
    }

    cd(int param0) {
        this.field_e = 0;
        this.field_a = false;
        this.field_i = param0;
    }

    static {
        field_h = new ja();
        field_g = 0;
        field_j = false;
    }
}
