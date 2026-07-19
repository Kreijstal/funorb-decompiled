/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class pc {
    static an field_n;
    int field_a;
    boolean field_k;
    int field_j;
    boolean field_g;
    int field_c;
    static ga field_b;
    static String field_i;
    int field_f;
    static int field_h;
    int field_m;
    private int field_d;
    static int[] field_l;
    static ah field_e;

    abstract void a(int param0, int param1);

    int a(boolean param0, int param1, int param2) {
        if (this.field_m > param2) {
            return -1;
        }
        if (this.field_f <= param2) {
            return -1;
        }
        if (this.field_j > param1) {
            return -1;
        }
        if (param0) {
            return 66;
        }
        int var4 = (param1 + -this.field_j) / this.field_d;
        if (!(var4 < this.field_a)) {
            return -1;
        }
        return var4;
    }

    final void b(int param0) {
        int discarded$1 = 0;
        int var2 = 0;
        int var3 = 0;
        var3 = HoldTheLine.field_D;
        if (param0 != 12515) {
          discarded$1 = this.a(true, 122, -88);
          if (gg.field_J == 0) {
            if (rd.field_f == 0) {
              this.field_k = false;
              if (na.field_k) {
                var2 = this.a(false, rf.field_X, nc.field_g);
                if ((var2 ^ -1) == 0) {
                  if (!this.field_g) {
                    this.field_g = false;
                    this.field_c = var2;
                    return;
                  } else {
                    return;
                  }
                } else {
                  this.field_g = false;
                  this.field_c = var2;
                  return;
                }
              } else {
                return;
              }
            } else {
              if (this.field_k) {
                var2 = this.field_c;
                if (var2 != -1) {
                  this.a(-(this.field_d * var2) + rf.field_X + -this.field_j, var2, rd.field_f, param0 + -12639, nc.field_g, true);
                  return;
                } else {
                  return;
                }
              } else {
                this.field_k = false;
                if (na.field_k) {
                  var2 = this.a(false, rf.field_X, nc.field_g);
                  if ((var2 ^ -1) == 0) {
                    if (!this.field_g) {
                      this.field_g = false;
                      this.field_c = var2;
                      return;
                    } else {
                      return;
                    }
                  } else {
                    this.field_g = false;
                    this.field_c = var2;
                    return;
                  }
                } else {
                  return;
                }
              }
            }
          } else {
            var2 = this.a(false, jb.field_U, lb.field_x);
            this.field_c = var2;
            if ((var2 ^ -1) == 0) {
              this.field_k = false;
              return;
            } else {
              this.field_k = true;
              this.a(-(this.field_d * var2) + (jb.field_U + -this.field_j), var2, gg.field_J, param0 ^ -12428, lb.field_x, false);
              return;
            }
          }
        } else {
          if (gg.field_J == 0) {
            if (rd.field_f == 0) {
              this.field_k = false;
              if (na.field_k) {
                var2 = this.a(false, rf.field_X, nc.field_g);
                if ((var2 ^ -1) == 0) {
                  if (this.field_g) {
                    return;
                  } else {
                    this.field_g = false;
                    this.field_c = var2;
                    return;
                  }
                } else {
                  this.field_g = false;
                  this.field_c = var2;
                  return;
                }
              } else {
                return;
              }
            } else {
              if (this.field_k) {
                var2 = this.field_c;
                if (var2 == -1) {
                  return;
                } else {
                  this.a(-(this.field_d * var2) + rf.field_X + -this.field_j, var2, rd.field_f, param0 + -12639, nc.field_g, true);
                  return;
                }
              } else {
                this.field_k = false;
                if (na.field_k) {
                  var2 = this.a(false, rf.field_X, nc.field_g);
                  if ((var2 ^ -1) == 0) {
                    if (this.field_g) {
                      return;
                    } else {
                      this.field_g = false;
                      this.field_c = var2;
                      return;
                    }
                  } else {
                    this.field_g = false;
                    this.field_c = var2;
                    return;
                  }
                } else {
                  return;
                }
              }
            }
          } else {
            var2 = this.a(false, jb.field_U, lb.field_x);
            this.field_c = var2;
            if ((var2 ^ -1) != 0) {
              this.field_k = true;
              this.a(-(this.field_d * var2) + (jb.field_U + -this.field_j), var2, gg.field_J, param0 ^ -12428, lb.field_x, false);
              return;
            } else {
              this.field_k = false;
              return;
            }
          }
        }
    }

    abstract void d(int param0, int param1);

    public static void c(int param0) {
        if (param0 != -1) {
          pc.c(-52);
          field_l = null;
          field_n = null;
          field_e = null;
          field_b = null;
          field_i = null;
          return;
        } else {
          field_l = null;
          field_n = null;
          field_e = null;
          field_b = null;
          field_i = null;
          return;
        }
    }

    void b(int param0, int param1) {
        int var4 = 0;
        var4 = HoldTheLine.field_D;
        if (param1 == -24489) {
          if (-97 != (aa.field_n ^ -1)) {
            if ((aa.field_n ^ -1) != -98) {
              if (aa.field_n != 84) {
                if (-84 == (aa.field_n ^ -1)) {
                  this.c(param0, -3565);
                  return;
                } else {
                  return;
                }
              } else {
                this.c(param0, -3565);
                return;
              }
            } else {
              this.d(108, param0);
              return;
            }
          } else {
            this.a(1, param0);
            return;
          }
        } else {
          this.field_m = -80;
          if (-97 != (aa.field_n ^ -1)) {
            if ((aa.field_n ^ -1) != -98) {
              if (aa.field_n != 84) {
                if (-84 == (aa.field_n ^ -1)) {
                  this.c(param0, -3565);
                  return;
                } else {
                  return;
                }
              } else {
                this.c(param0, -3565);
                return;
              }
            } else {
              this.d(108, param0);
              return;
            }
          } else {
            this.a(1, param0);
            return;
          }
        }
    }

    void a(int param0, int param1, int param2, int param3, int param4, boolean param5) {
        int var7 = 0;
        int var8 = 0;
        var8 = HoldTheLine.field_D;
        if (param5) {
          r.field_b = r.field_b - 1;
          if (0 >= r.field_b) {
            if (1 != param2) {
              this.a(1, param1);
              r.field_b = ki.field_o;
              var7 = 14 % ((param3 - -51) / 46);
              return;
            } else {
              this.c(param1, -3565);
              r.field_b = ki.field_o;
              var7 = 14 % ((param3 - -51) / 46);
              return;
            }
          } else {
            var7 = 14 % ((param3 - -51) / 46);
            return;
          }
        } else {
          if (1 == param2) {
            this.c(param1, -3565);
            r.field_b = cg.field_i;
            var7 = 14 % ((param3 - -51) / 46);
            return;
          } else {
            this.a(1, param1);
            r.field_b = cg.field_i;
            var7 = 14 % ((param3 - -51) / 46);
            return;
          }
        }
    }

    void a(boolean param0) {
        int var3 = 0;
        var3 = HoldTheLine.field_D;
        if (param0) {
          if (this.field_k) {
            return;
          } else {
            if (aa.field_n != 98) {
              if (99 == aa.field_n) {
                this.field_c = this.field_c + 1;
                if (this.field_c < this.field_a) {
                  this.field_g = true;
                  return;
                } else {
                  this.field_c = 0;
                  this.field_g = true;
                  return;
                }
              } else {
                if ((this.field_c ^ -1) <= -1) {
                  this.b(this.field_c, -24489);
                  return;
                } else {
                  return;
                }
              }
            } else {
              L0: {
                if ((this.field_c ^ -1) >= -1) {
                  this.field_c = this.field_a;
                  break L0;
                } else {
                  break L0;
                }
              }
              this.field_c = this.field_c - 1;
              this.field_g = true;
              return;
            }
          }
        } else {
          return;
        }
    }

    abstract void c(int param0, int param1);

    final void a(byte param0) {
        int var2 = 0;
        if (!this.field_g) {
          this.field_c = -1;
          var2 = -85 / ((param0 - 13) / 45);
          this.field_k = false;
          return;
        } else {
          var2 = -85 / ((param0 - 13) / 45);
          this.field_k = false;
          return;
        }
    }

    void a(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        int stackIn_4_2 = 0;
        Object stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        int stackIn_5_2 = 0;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        int stackIn_6_2 = 0;
        int stackIn_6_3 = 0;
        Object stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        int stackIn_13_2 = 0;
        Object stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        int stackIn_14_2 = 0;
        Object stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        int stackIn_15_2 = 0;
        int stackIn_15_3 = 0;
        Object stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        int stackOut_12_2 = 0;
        Object stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        int stackOut_14_2 = 0;
        int stackOut_14_3 = 0;
        Object stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        int stackOut_13_2 = 0;
        int stackOut_13_3 = 0;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        int stackOut_3_2 = 0;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        int stackOut_5_2 = 0;
        int stackOut_5_3 = 0;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        int stackOut_4_2 = 0;
        int stackOut_4_3 = 0;
        var4 = HoldTheLine.field_D;
        if (param0 != -55) {
          this.field_a = 124;
          var2 = 0;
          var3 = this.field_j;
          L0: while (true) {
            if (var2 < this.field_a) {
              L1: {
                stackOut_12_0 = this;
                stackOut_12_1 = var3;
                stackOut_12_2 = var2;
                stackIn_14_0 = stackOut_12_0;
                stackIn_14_1 = stackOut_12_1;
                stackIn_14_2 = stackOut_12_2;
                stackIn_13_0 = stackOut_12_0;
                stackIn_13_1 = stackOut_12_1;
                stackIn_13_2 = stackOut_12_2;
                if (var2 != this.field_c) {
                  stackOut_14_0 = this;
                  stackOut_14_1 = stackIn_14_1;
                  stackOut_14_2 = stackIn_14_2;
                  stackOut_14_3 = 0;
                  stackIn_15_0 = stackOut_14_0;
                  stackIn_15_1 = stackOut_14_1;
                  stackIn_15_2 = stackOut_14_2;
                  stackIn_15_3 = stackOut_14_3;
                  break L1;
                } else {
                  stackOut_13_0 = this;
                  stackOut_13_1 = stackIn_13_1;
                  stackOut_13_2 = stackIn_13_2;
                  stackOut_13_3 = 1;
                  stackIn_15_0 = stackOut_13_0;
                  stackIn_15_1 = stackOut_13_1;
                  stackIn_15_2 = stackOut_13_2;
                  stackIn_15_3 = stackOut_13_3;
                  break L1;
                }
              }
              this.a(stackIn_15_1, stackIn_15_2, stackIn_15_3 != 0, (byte) -124);
              var2++;
              var3 = var3 + this.field_d;
              continue L0;
            } else {
              return;
            }
          }
        } else {
          var2 = 0;
          var3 = this.field_j;
          L2: while (true) {
            if (var2 >= this.field_a) {
              return;
            } else {
              L3: {
                stackOut_3_0 = this;
                stackOut_3_1 = var3;
                stackOut_3_2 = var2;
                stackIn_5_0 = stackOut_3_0;
                stackIn_5_1 = stackOut_3_1;
                stackIn_5_2 = stackOut_3_2;
                stackIn_4_0 = stackOut_3_0;
                stackIn_4_1 = stackOut_3_1;
                stackIn_4_2 = stackOut_3_2;
                if (var2 != this.field_c) {
                  stackOut_5_0 = this;
                  stackOut_5_1 = stackIn_5_1;
                  stackOut_5_2 = stackIn_5_2;
                  stackOut_5_3 = 0;
                  stackIn_6_0 = stackOut_5_0;
                  stackIn_6_1 = stackOut_5_1;
                  stackIn_6_2 = stackOut_5_2;
                  stackIn_6_3 = stackOut_5_3;
                  break L3;
                } else {
                  stackOut_4_0 = this;
                  stackOut_4_1 = stackIn_4_1;
                  stackOut_4_2 = stackIn_4_2;
                  stackOut_4_3 = 1;
                  stackIn_6_0 = stackOut_4_0;
                  stackIn_6_1 = stackOut_4_1;
                  stackIn_6_2 = stackOut_4_2;
                  stackIn_6_3 = stackOut_4_3;
                  break L3;
                }
              }
              this.a(stackIn_6_1, stackIn_6_2, stackIn_6_3 != 0, (byte) -124);
              var2++;
              var3 = var3 + this.field_d;
              continue L2;
            }
          }
        }
    }

    abstract void a(int param0, int param1, boolean param2, byte param3);

    protected pc() {
        this.field_g = true;
        this.field_c = 0;
    }

    pc(int param0, int param1, int param2, int param3, int param4) {
        this.field_g = true;
        this.field_c = 0;
        this.field_j = param3;
        this.field_d = param4;
        this.field_a = param0;
        this.field_m = param1;
        this.field_f = param2;
    }

    static {
        field_i = "This password contains your email address, and would be easy to guess";
        field_n = new an();
        field_e = new ah();
    }
}
