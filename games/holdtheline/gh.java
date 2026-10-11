/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gh {
    static int field_i;
    static go field_a;
    private int field_f;
    private int field_b;
    private int field_m;
    private int field_c;
    private int field_l;
    private boolean field_h;
    private wf field_r;
    static String[] field_t;
    private int field_d;
    private float field_e;
    private int field_j;
    private int field_o;
    private int field_p;
    static vi[] field_n;
    private int field_q;
    private int field_k;
    private int field_s;
    private int field_g;

    public static void a(int param0) {
        field_t = null;
        if (param0 < 66) {
          return;
        }
        field_n = null;
        field_a = null;
    }

    final void b(byte param0) {
        int fieldTemp$1 = 0;
        int fieldTemp$0 = 0;
        if (cc.field_w != null) {
          return;
        }
        if (fc.field_a > 0) {
          if (this.field_h) {
            fieldTemp$1 = this.field_g - 1;
            this.field_g = this.field_g - 1;
            if (0 < fieldTemp$1) {
              return;
            }
            this.field_g = this.field_p;
            if (this.field_s > d.field_g) {
              this.field_h = false;
            } else {
              if (param0 != -9) {
                this.b(50);
              }
              this.a((byte) 124);
            }
            return;
          }
          if (lj.field_f < this.field_j) {
            vm.field_Bb = (this.field_j - lj.field_f) / 2;
          } else {
            if (this.field_j > 0) {
              vm.field_Bb = 0;
            }
          }
          if (lj.field_f != this.field_b) {
            this.field_r.a(param0 ^ -96, this.field_c, this.field_b);
          } else {
            if (g.field_i != this.field_c) {
              this.field_r.a(param0 ^ -96, this.field_c, this.field_b);
            }
          }
          return;
        }
        this.field_h = false;
        if (this.field_h) {
          fieldTemp$0 = this.field_g - 1;
          this.field_g = this.field_g - 1;
          if (0 < fieldTemp$0) {
            return;
          }
          this.field_g = this.field_p;
          if (this.field_s > d.field_g) {
            this.field_h = false;
          } else {
            if (param0 != -9) {
              this.b(50);
            }
            this.a((byte) 124);
          }
          return;
        }
        if (lj.field_f < this.field_j) {
          vm.field_Bb = (this.field_j - lj.field_f) / 2;
        } else {
          if (this.field_j <= 0) {
            if (lj.field_f != this.field_b) {
              this.field_r.a(param0 ^ -96, this.field_c, this.field_b);
            } else {
              if (g.field_i != this.field_c) {
                this.field_r.a(param0 ^ -96, this.field_c, this.field_b);
              }
            }
            return;
          }
          vm.field_Bb = 0;
        }
        if (lj.field_f == this.field_b &&
          g.field_i == this.field_c) {
          return;
        }
        this.field_r.a(param0 ^ -96, this.field_c, this.field_b);
    }

    final void a(int param0, int param1, byte param2) {
        this.field_j = param0;
        if (param2 < -45) {
          this.field_d = param1;
          return;
        }
        hj var5 = (hj) null;
        gh.a((hj) null, -45, 12, 37, 1.0888298749923706f, -97);
        this.field_d = param1;
    }

    final static void a(hj param0, int param1, int param2, int param3, float param4, int param5) {
        try {
          if (param2 != 0) {
            field_a = (go) null;
          }
          param0.c(param1 - param0.field_o / 2, param5 - param0.field_v / 2, lk.a(param4, -1, param3));
        } catch (RuntimeException runtimeException) {
          throw kk.a((Throwable) ((Object) runtimeException), "gh.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final void b(int param0) {
        int var2 = 114 / ((36 - param0) / 62);
        this.field_r.a(49, this.field_k, this.field_o);
    }

    static long a(long param0, long param1) {
        return param0 & param1;
    }

    final boolean a(boolean param0) {
        if (!param0) {
          return true;
        }
        if (d.field_g < this.field_s) {
          return false;
        }
        if (fc.field_a > 0) {
          return true;
        }
        return false;
    }

    private gh() throws Throwable {
        throw new Error();
    }

    private final void a(byte param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        int var4Lifetime1;
        int var4Lifetime2;
        var5 = HoldTheLine.field_D;
        if (param0 != 124) {
          return;
        }
        var2 = this.field_j;
        var3 = this.field_d;
        if (!this.a(true)) {
          this.field_h = false;
          return;
        }
        if (var2 > this.field_l) {
          var2 = this.field_l;
        } else {
          if (this.field_f <= var2) {
            if (this.field_q < var3) {
              var3 = this.field_q;
              if (0.0f < this.field_e) {
                var4 = (int)(0.5f + (float)var3 * this.field_e);
                if (var4 <= var2) {
                  if (var2 > var4) {
                    var2 = var4;
                  }
                } else {
                  var3 = (int)((float)var2 / this.field_e);
                }
              }
              if (var2 != lj.field_f) {
                this.field_r.a(79, var3, var2);
              } else {
                if (var3 != g.field_i) {
                  this.field_r.a(79, var3, var2);
                }
              }
            } else {
              if (this.field_m <= var3) {
                if (0.0f < this.field_e) {
                  var4 = (int)(0.5f + (float)var3 * this.field_e);
                  if (var4 <= var2) {
                    if (var2 > var4) {
                      var2 = var4;
                    }
                  } else {
                    var3 = (int)((float)var2 / this.field_e);
                  }
                }
                if (var2 != lj.field_f) {
                  this.field_r.a(79, var3, var2);
                } else {
                  if (var3 != g.field_i) {
                    this.field_r.a(79, var3, var2);
                  }
                }
              } else {
                var3 = this.field_m;
                if (0.0f < this.field_e) {
                  var4 = (int)(0.5f + (float)var3 * this.field_e);
                  if (var4 > var2) {
                    var3 = (int)((float)var2 / this.field_e);
                    if (var2 != lj.field_f) {
                      this.field_r.a(79, var3, var2);
                    } else {
                      if (var3 != g.field_i) {
                        this.field_r.a(79, var3, var2);
                      }
                    }
                    if (0 < this.field_j) {
                      vm.field_Bb = (-lj.field_f + this.field_j) / 2;
                    }
                    return;
                  }
                  if (var2 > var4) {
                    var2 = var4;
                  }
                }
                if (var2 == lj.field_f &&
                  var3 == g.field_i) {
                  if (0 >= this.field_j) {
                    return;
                  }
                  vm.field_Bb = (-lj.field_f + this.field_j) / 2;
                  return;
                }
                this.field_r.a(79, var3, var2);
              }
            }
            if (0 < this.field_j) {
              vm.field_Bb = (-lj.field_f + this.field_j) / 2;
            }
            return;
          }
          var2 = this.field_f;
        }
        if (this.field_q < var3) {
          var3 = this.field_q;
          if (0.0f < this.field_e) {
            var4Lifetime1 = (int)(0.5f + (float)var3 * this.field_e);
            if (var4Lifetime1 <= var2) {
              if (var2 > var4Lifetime1) {
                var2 = var4Lifetime1;
              }
            } else {
              var3 = (int)((float)var2 / this.field_e);
            }
          }
          if (var2 != lj.field_f) {
            this.field_r.a(79, var3, var2);
          } else {
            if (var3 != g.field_i) {
              this.field_r.a(79, var3, var2);
            }
          }
          if (0 < this.field_j) {
            vm.field_Bb = (-lj.field_f + this.field_j) / 2;
          }
          return;
        }
        boolean decompiledFrameRemainder0 = true;
        if (this.field_m <= var3) {
          if (0.0f < this.field_e) {
            var4Lifetime2 = (int)(0.5f + (float)var3 * this.field_e);
            if (var4Lifetime2 <= var2) {
              if (var2 > var4Lifetime2) {
                var2 = var4Lifetime2;
              }
            } else {
              var3 = (int)((float)var2 / this.field_e);
            }
          }
        } else {
          var3 = this.field_m;
          if (0.0f < this.field_e) {
            var4Lifetime2 = (int)(0.5f + (float)var3 * this.field_e);
            if (var4Lifetime2 > var2) {
              var3 = (int)((float)var2 / this.field_e);
              if (var2 != lj.field_f) {
                this.field_r.a(79, var3, var2);
                if (0 < this.field_j) {
                  vm.field_Bb = (-lj.field_f + this.field_j) / 2;
                }
                return;
              }
              if (var3 != g.field_i) {
                this.field_r.a(79, var3, var2);
              }
              decompiledFrameRemainder0 = false;
            }
            else {
              if (var2 > var4Lifetime2) {
                var2 = var4Lifetime2;
              }
            }
          }
        }
        if (decompiledFrameRemainder0) {
          if (var2 != lj.field_f) {
            this.field_r.a(79, var3, var2);
          } else {
            if (var3 != g.field_i) {
              this.field_r.a(79, var3, var2);
            }
          }
        }
        if (0 >= this.field_j) {
          return;
        }
        vm.field_Bb = (-lj.field_f + this.field_j) / 2;
        return;
    }

    static {
        field_t = new String[]{"Classic", "Desert", "Alpine", "Night"};
    }
}
