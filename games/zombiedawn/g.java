/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class g extends fb {
    int field_W;
    static int[] field_P;
    int field_ab;
    int field_T;
    int field_Z;
    int field_K;
    int field_I;
    int field_D;
    int field_O;
    int field_R;
    static boolean field_Q;
    fn field_U;
    int field_X;
    boolean field_J;
    int field_Y;
    static String field_H;
    int field_E;
    int field_F;
    int field_M;
    int field_S;
    int field_G;
    boolean field_V;
    int field_N;
    private int field_L;

    final va m(int param0) {
        int var4 = 0;
        int var5 = 0;
        int var6 = ZombieDawn.field_J;
        int var4Lifetime1;
        int var5Lifetime1;
        if (!dj.field_e.field_mb.field_e) {
          return null;
        }
        va var7 = ub.a(127, this.l(-95));
        int var3 = 49 % ((param0 - 36) / 50);
        if (var7 == null) {
          return var7;
        }
        this.field_y = this.field_y + var7.field_h;
        this.field_x = this.field_x + var7.field_i;
        if (dj.field_e.field_H.a(false, this.field_x >> 16, this.field_y >> 16, true)) {
          this.d((byte) 12);
        } else {
          this.field_x = this.field_x - var7.field_i;
          this.field_y = this.field_y - var7.field_h;
          if (this.field_F == 6) {
            var4 = this.field_G;
            var5 = this.field_N;
            this.e(4, -6904);
            this.field_N = var5;
            this.field_G = var4;
            return var7;
          }
          if (this.field_F == 5) {
            this.c(0, this.field_L);
            return var7;
          }
          if (this.field_F == 1) {
            this.c(0, this.field_L);
            return var7;
          }
          if (this.field_F == 7) {
            this.c(0, this.field_L);
            return var7;
          }
          return var7;
        }
        if (this.field_F == 6) {
          var4Lifetime1 = this.field_G;
          var5Lifetime1 = this.field_N;
          this.e(4, -6904);
          this.field_N = var5Lifetime1;
          this.field_G = var4Lifetime1;
          return var7;
        }
        if (this.field_F == 5) {
          this.c(0, this.field_L);
          return var7;
        }
        if (this.field_F == 1) {
          this.c(0, this.field_L);
          return var7;
        }
        if (this.field_F == 7) {
          this.c(0, this.field_L);
          return var7;
        }
        return var7;
    }

    final void c(int param0, int param1) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var4Lifetime1;
        int var5Lifetime1;
        int var6Lifetime1;
        this.field_L = param1;
        param1 = param1 * this.field_W / 4;
        int var3 = this.field_Y - this.a(true);
        if (param0 == 0) {
          var4 = this.field_X - this.f(237239984);
          var5 = so.b(var3 * var3 + var4 * var4);
          if (var5 == 0) {
            this.e(this instanceof ah ? 0 : 4, -6904);
          } else {
            var6 = param1 / var5;
            this.field_O = var3 * var6;
            this.field_T = var4 * var6;
            this.field_E = 3 * this.field_O / 4;
            this.field_ab = this.field_T * 3 / 4;
            this.field_S = this.field_O <= 0 ? 3 : 1;
            this.field_M = 2 * this.field_T - this.field_ab;
            this.field_I = -this.field_E + this.field_O * 2;
            this.field_K = (this.field_O - this.field_E) / 2;
            this.field_R = (-this.field_ab + this.field_T) / 2;
          }
          return;
        }
        this.field_D = -90;
        var4Lifetime1 = this.field_X - this.f(237239984);
        var5Lifetime1 = so.b(var3 * var3 + var4Lifetime1 * var4Lifetime1);
        if (var5Lifetime1 == 0) {
          this.e(this instanceof ah ? 0 : 4, -6904);
        } else {
          var6Lifetime1 = param1 / var5Lifetime1;
          this.field_O = var3 * var6Lifetime1;
          this.field_T = var4Lifetime1 * var6Lifetime1;
          this.field_E = 3 * this.field_O / 4;
          this.field_ab = this.field_T * 3 / 4;
          this.field_S = this.field_O <= 0 ? 3 : 1;
          this.field_M = 2 * this.field_T - this.field_ab;
          this.field_I = -this.field_E + this.field_O * 2;
          this.field_K = (this.field_O - this.field_E) / 2;
          this.field_R = (-this.field_ab + this.field_T) / 2;
        }
    }

    final int l(int param0) {
        if (param0 <= -71) {
          return this.b(0, this.a(true), this.f(237239984));
        }
        g.a(false, -39, true, true);
        return this.b(0, this.a(true), this.f(237239984));
    }

    abstract void k(int param0);

    void j(int param0) {
        if (param0 < 66) {
          return;
        }
        this.field_V = true;
    }

    final void d(int param0, int param1) {
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        if (this.field_G >= cg.field_h[param0]) {
          this.field_G = 0;
        }
        if (this.field_W == 4) {
        }
        if (param1 == -26109) {
          fieldTemp$2 = this.field_N + 1;
          this.field_N = this.field_N + 1;
          if (fieldTemp$2 > cg.field_b[param0]) {
            fieldTemp$3 = this.field_G + 1;
            this.field_G = this.field_G + 1;
            if (fieldTemp$3 == cg.field_h[param0]) {
              this.field_G = 0;
            }
            this.field_N = 0;
          }
          return;
        }
        this.b((byte) -24, 107);
        fieldTemp$0 = this.field_N + 1;
        this.field_N = this.field_N + 1;
        if (fieldTemp$0 > cg.field_b[param0]) {
          fieldTemp$1 = this.field_G + 1;
          this.field_G = this.field_G + 1;
          if (fieldTemp$1 == cg.field_h[param0]) {
            this.field_G = 0;
          }
          this.field_N = 0;
        }
        return;
    }

    final void b(byte param0, int param1) {
        int var5 = ZombieDawn.field_J;
        int var3 = -66 / ((param0 - 27) / 46);
        this.field_Z = param1;
        this.field_W = 2;
        int var4 = this.field_F;
        if (var4 != 5) {
          if (var4 == 1) {
            this.c(0, this.field_D);
            return;
          }
          if (7 == var4) {
            this.c(0, 114688);
            return;
          }
          if (var4 == 2) {
            this.c(0, 401408);
            return;
          }
          if (var4 == 6) {
            this.c(0, 28672);
            return;
          }
          if (var4 != 8) {
            return;
          }
          ((kd) (this)).k((byte) 40);
          return;
        }
        this.c(0, 57344);
    }

    void e(int param0, int param1) {
        if (param1 != -6904) {
          this.m(-100);
          if (this.field_F != param0) {
            this.field_G = 0;
            this.field_F = param0;
            this.field_N = 0;
            return;
          }
          return;
        }
        if (this.field_F == param0) {
          return;
        }
        this.field_G = 0;
        this.field_F = param0;
        this.field_N = 0;
    }

    final boolean a(int param0, int param1, int param2) {
        int var4 = 114 % ((-28 - param0) / 37);
        int var5 = this.field_y >> 16;
        int var6 = this.field_x >> 16;
        if (param1 >= -7 + var5 + 24) {
          return false;
        }
        if (var5 - 17 >= param1) {
          return false;
        }
        if (param2 <= 5 + (var6 - 48)) {
          return false;
        }
        if (2 + var6 > param2) {
          return true;
        }
        return false;
    }

    final int b(int param0, int param1, int param2) {
        int var4 = param1 / 24;
        int var5 = param2 / 24;
        int[][] var6 = dj.field_e.field_H.field_A.field_f;
        if (var4 < param0) {
          return 0;
        }
        if (0 > var5) {
          return 0;
        }
        if (var4 >= var6[0].length) {
          return 0;
        }
        if (var5 < var6.length) {
          return var6[var5][var4];
        }
        return 0;
    }

    g(int param0, int param1, int param2, int param3) {
        super(param0, param1, param2);
        this.field_U = null;
        this.field_W = 4;
        this.field_J = false;
        this.field_Z = 0;
        this.field_F = this instanceof ah ? 0 : 4;
        this.field_S = pb.a(so.field_a, 2, 1) != 1 ? 1 : 3;
        this.field_G = 0;
        this.field_N = 0;
        this.field_D = param3;
    }

    final void g(byte param0) {
        if (this.field_V) {
          return;
        }
        this.field_x = this.field_x + this.field_T;
        int var2 = 71 / ((param0 + 41) / 52);
        this.field_y = this.field_y + this.field_O;
        this.d((byte) -18);
    }

    final boolean h(byte param0) {
        int stackIn_15_0 = 0;
        int stackIn_54_0 = 0;
        int stackIn_84_0 = 0;
        int stackIn_123_0 = 0;
        int stackIn_145_0 = 0;
        int stackIn_157_0 = 0;
        int stackIn_188_0 = 0;
        int stackIn_253_0 = 0;
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var4Lifetime1;
        int var4Lifetime2;
        int var4Lifetime3;
        int var5Lifetime1;
        int var5Lifetime2;
        int var5Lifetime3;
        int var5Lifetime4;
        int var6Lifetime1;
        int var6Lifetime2;
        int var6Lifetime3;
        int var6Lifetime4;
        int var5Lifetime5;
        int var6Lifetime5;
        int var4Lifetime1Lifetime1;
        int var5Lifetime1Lifetime1;
        int var5Lifetime1Lifetime2;
        int var6Lifetime1Lifetime1;
        int var6Lifetime1Lifetime2;
        int var6Lifetime4Lifetime1;
        int var6Lifetime4Lifetime2;
        var2 = this.field_Y << 16;
        var3 = this.field_X << 16;
        if (this.field_O == 0 &&
          this.field_T == 0) {
          return false;
        }
        if (this.field_O == 0) {
          var4 = 1;
          if (this.field_T != 0) {
            if (this.field_T <= 0) {
              if (this.field_T < 0 &&
                this.field_x < var3) {
                var5 = 1;
                var6 = 67 % ((-53 - param0) / 32);
                if (Math.abs(-var2 + this.field_y) < hd.field_y &&
                  Math.abs(this.field_x - var3) < hd.field_y) {
                  var4 = 1;
                  var5 = 1;
                }
                if (var4 != 0 &&
                  var5 == 0) {
                  this.field_O = 0;
                } else {
                  if (var4 == 0 &&
                    var5 != 0) {
                    this.field_T = 0;
                    return false;
                  }
                  if (var4 == 0) {
                    return false;
                  }
                  if (var5 != 0) {
                    this.field_x = this.field_X << 16;
                    this.field_y = this.field_Y << 16;
                    return true;
                  }
                }
                return false;
              }
              stackIn_54_0 = 0;
            } else {
              if (this.field_x <= var3) {
                if (this.field_T < 0) {
                  stackIn_15_0 = (this.field_x < var3) ? 1 : 0;
                } else {
                  stackIn_15_0 = 0;
                }
                var5 = stackIn_15_0;
                var6 = 67 % ((-53 - param0) / 32);
                if (Math.abs(-var2 + this.field_y) < hd.field_y &&
                  Math.abs(this.field_x - var3) < hd.field_y) {
                  var4 = 1;
                  var5 = 1;
                }
                if (var4 != 0 &&
                  var5 == 0) {
                  this.field_O = 0;
                  return false;
                }
                if (var4 == 0 &&
                  var5 != 0) {
                  this.field_T = 0;
                  return false;
                }
                if (var4 == 0) {
                  return false;
                }
                if (var5 == 0) {
                  return false;
                }
                this.field_x = this.field_X << 16;
                this.field_y = this.field_Y << 16;
                return true;
              }
              stackIn_54_0 = 1;
            }
          } else {
            stackIn_54_0 = 1;
          }
          var5Lifetime5 = stackIn_54_0;
          var6Lifetime5 = 67 % ((-53 - param0) / 32);
          if (Math.abs(-var2 + this.field_y) < hd.field_y &&
            Math.abs(this.field_x - var3) < hd.field_y) {
            var4 = 1;
            var5Lifetime5 = 1;
          }
          if (var4 != 0 &&
            var5Lifetime5 == 0) {
            this.field_O = 0;
          } else {
            if (var4 == 0 &&
              var5Lifetime5 != 0) {
              this.field_T = 0;
              return false;
            }
            if (var4 == 0) {
              return false;
            }
            if (var5Lifetime5 != 0) {
              this.field_x = this.field_X << 16;
              this.field_y = this.field_Y << 16;
              return true;
            }
          }
          return false;
        }
        if (this.field_O > 0) {
          if (var2 >= this.field_y) {
            if (this.field_O < 0) {
              stackIn_145_0 = (this.field_y >= var2) ? 0 : 1;
            } else {
              stackIn_145_0 = 0;
            }
            var4Lifetime1 = stackIn_145_0;
            if (this.field_T != 0) {
              if (this.field_T > 0 &&
                this.field_x > var3) {
                stackIn_157_0 = 1;
              } else {
                if (this.field_T < 0) {
                  stackIn_157_0 = (this.field_x < var3) ? 1 : 0;
                } else {
                  stackIn_157_0 = 0;
                }
              }
            } else {
              stackIn_157_0 = 1;
            }
            var5Lifetime1 = stackIn_157_0;
            var6Lifetime1 = 67 % ((-53 - param0) / 32);
            if (Math.abs(-var2 + this.field_y) < hd.field_y &&
              Math.abs(this.field_x - var3) < hd.field_y) {
              var4Lifetime1 = 1;
              var5Lifetime1 = 1;
            }
            if (var4Lifetime1 != 0 &&
              var5Lifetime1 == 0) {
              this.field_O = 0;
            } else {
              if (var4Lifetime1 == 0 &&
                var5Lifetime1 != 0) {
                this.field_T = 0;
                return false;
              }
              if (var4Lifetime1 == 0) {
                return false;
              }
              if (var5Lifetime1 != 0) {
                this.field_x = this.field_X << 16;
                this.field_y = this.field_Y << 16;
                return true;
              }
            }
            return false;
          }
          var4Lifetime1Lifetime1 = 1;
          if (this.field_T != 0) {
            if (this.field_T <= 0) {
              if (this.field_T < 0 &&
                this.field_x < var3) {
                var5Lifetime1Lifetime1 = 1;
                var6Lifetime1Lifetime1 = 67 % ((-53 - param0) / 32);
                if (Math.abs(-var2 + this.field_y) < hd.field_y &&
                  Math.abs(this.field_x - var3) < hd.field_y) {
                  var4Lifetime1Lifetime1 = 1;
                  var5Lifetime1Lifetime1 = 1;
                }
                if (var4Lifetime1Lifetime1 != 0 &&
                  var5Lifetime1Lifetime1 == 0) {
                  this.field_O = 0;
                } else {
                  if (var4Lifetime1Lifetime1 == 0 &&
                    var5Lifetime1Lifetime1 != 0) {
                    this.field_T = 0;
                    return false;
                  }
                  if (var4Lifetime1Lifetime1 == 0) {
                    return false;
                  }
                  if (var5Lifetime1Lifetime1 != 0) {
                    this.field_x = this.field_X << 16;
                    this.field_y = this.field_Y << 16;
                    return true;
                  }
                }
                return false;
              }
              stackIn_123_0 = 0;
            } else {
              if (this.field_x <= var3) {
                if (this.field_T < 0) {
                  stackIn_84_0 = (this.field_x < var3) ? 1 : 0;
                } else {
                  stackIn_84_0 = 0;
                }
                var5Lifetime1Lifetime1 = stackIn_84_0;
                var6Lifetime1Lifetime1 = 67 % ((-53 - param0) / 32);
                if (Math.abs(-var2 + this.field_y) < hd.field_y &&
                  Math.abs(this.field_x - var3) < hd.field_y) {
                  var4Lifetime1Lifetime1 = 1;
                  var5Lifetime1Lifetime1 = 1;
                }
                if (var4Lifetime1Lifetime1 != 0 &&
                  var5Lifetime1Lifetime1 == 0) {
                  this.field_O = 0;
                } else {
                  if (var4Lifetime1Lifetime1 == 0 &&
                    var5Lifetime1Lifetime1 != 0) {
                    this.field_T = 0;
                    return false;
                  }
                  if (var4Lifetime1Lifetime1 == 0) {
                    return false;
                  }
                  if (var5Lifetime1Lifetime1 != 0) {
                    this.field_x = this.field_X << 16;
                    this.field_y = this.field_Y << 16;
                    return true;
                  }
                }
                return false;
              }
              stackIn_123_0 = 1;
            }
          } else {
            stackIn_123_0 = 1;
          }
          var5Lifetime1Lifetime2 = stackIn_123_0;
          var6Lifetime1Lifetime2 = 67 % ((-53 - param0) / 32);
          if (Math.abs(-var2 + this.field_y) < hd.field_y &&
            Math.abs(this.field_x - var3) < hd.field_y) {
            var4Lifetime1Lifetime1 = 1;
            var5Lifetime1Lifetime2 = 1;
          }
          if (var4Lifetime1Lifetime1 != 0 &&
            var5Lifetime1Lifetime2 == 0) {
            this.field_O = 0;
          } else {
            if (var4Lifetime1Lifetime1 == 0 &&
              var5Lifetime1Lifetime2 != 0) {
              this.field_T = 0;
              return false;
            }
            if (var4Lifetime1Lifetime1 == 0) {
              return false;
            }
            if (var5Lifetime1Lifetime2 != 0) {
              this.field_x = this.field_X << 16;
              this.field_y = this.field_Y << 16;
              return true;
            }
          }
          return false;
        }
        if (this.field_O < 0 &&
          this.field_y < var2) {
          var4Lifetime2 = 1;
          if (this.field_T != 0) {
            if (this.field_T > 0 &&
              this.field_x > var3) {
              stackIn_188_0 = 1;
            } else {
              if (this.field_T < 0) {
                stackIn_188_0 = (this.field_x < var3) ? 1 : 0;
              } else {
                stackIn_188_0 = 0;
              }
            }
          } else {
            stackIn_188_0 = 1;
          }
          var5Lifetime2 = stackIn_188_0;
          var6Lifetime2 = 67 % ((-53 - param0) / 32);
          if (Math.abs(-var2 + this.field_y) < hd.field_y &&
            Math.abs(this.field_x - var3) < hd.field_y) {
            var4Lifetime2 = 1;
            var5Lifetime2 = 1;
          }
          if (var4Lifetime2 != 0 &&
            var5Lifetime2 == 0) {
            this.field_O = 0;
          } else {
            if (var4Lifetime2 == 0 &&
              var5Lifetime2 != 0) {
              this.field_T = 0;
              return false;
            }
            if (var4Lifetime2 == 0) {
              return false;
            }
            if (var5Lifetime2 != 0) {
              this.field_x = this.field_X << 16;
              this.field_y = this.field_Y << 16;
              return true;
            }
          }
          return false;
        }
        var4Lifetime3 = 0;
        if (this.field_T == 0) {
          var5Lifetime3 = 1;
          var6Lifetime3 = 67 % ((-53 - param0) / 32);
          if (Math.abs(-var2 + this.field_y) < hd.field_y &&
            Math.abs(this.field_x - var3) < hd.field_y) {
            var4Lifetime3 = 1;
            var5Lifetime3 = 1;
          }
          if (var4Lifetime3 != 0 &&
            var5Lifetime3 == 0) {
            this.field_O = 0;
            return false;
          }
          if (var4Lifetime3 == 0) {
            if (var5Lifetime3 != 0) {
              this.field_T = 0;
            } else {
              if (var4Lifetime3 != 0) {
              }
            }
            return false;
          }
          if (var4Lifetime3 == 0) {
            return false;
          }
          if (var5Lifetime3 == 0) {
            return false;
          }
          this.field_x = this.field_X << 16;
          this.field_y = this.field_Y << 16;
          return true;
        }
        sharedTailExit_0: {
          if (this.field_T > 0) {
            if (this.field_x > var3) {
              var5Lifetime4 = 1;
              var6Lifetime4 = 67 % ((-53 - param0) / 32);
              if (Math.abs(-var2 + this.field_y) < hd.field_y &&
                Math.abs(this.field_x - var3) < hd.field_y) {
                var4Lifetime3 = 1;
                var5Lifetime4 = 1;
              }
              if (var4Lifetime3 != 0 &&
                var5Lifetime4 == 0) {
                this.field_O = 0;
                return false;
              }
              if (var4Lifetime3 == 0) {
                if (var5Lifetime4 != 0) {
                  this.field_T = 0;
                } else {
                  if (var4Lifetime3 != 0) {
                  }
                }
                return false;
              }
              break sharedTailExit_0;
            }
            if (this.field_T < 0) {
              stackIn_253_0 = (this.field_x >= var3) ? 0 : 1;
            } else {
              stackIn_253_0 = 0;
            }
            var5Lifetime4 = stackIn_253_0;
            var6Lifetime4Lifetime2 = 67 % ((-53 - param0) / 32);
            if (Math.abs(-var2 + this.field_y) < hd.field_y &&
              Math.abs(this.field_x - var3) < hd.field_y) {
              var4Lifetime3 = 1;
              var5Lifetime4 = 1;
            }
            if (var4Lifetime3 != 0 &&
              var5Lifetime4 == 0) {
              this.field_O = 0;
            } else if (var4Lifetime3 == 0 &&
              var5Lifetime4 != 0) {
              this.field_T = 0;
            } else {
              if (var4Lifetime3 != 0 &&
                var5Lifetime4 != 0) {
                this.field_x = this.field_X << 16;
                this.field_y = this.field_Y << 16;
                return true;
              }
            }
            return false;
          }
          if (this.field_T >= 0) {
            var5Lifetime4 = 0;
          } else {
            if (this.field_x < var3) {
              var5Lifetime4 = 1;
            } else {
              var5Lifetime4 = 0;
            }
          }
          var6Lifetime4Lifetime1 = 67 % ((-53 - param0) / 32);
          if (Math.abs(-var2 + this.field_y) < hd.field_y &&
            Math.abs(this.field_x - var3) < hd.field_y) {
            var4Lifetime3 = 1;
            var5Lifetime4 = 1;
          }
          if (var4Lifetime3 != 0 &&
            var5Lifetime4 == 0) {
            this.field_O = 0;
            return false;
          }
          if (var4Lifetime3 == 0) {
            if (var5Lifetime4 == 0) {
            } else {
              this.field_T = 0;
            }
            return false;
          }
        }
        if (var4Lifetime3 == 0) {
          return false;
        }
        if (var5Lifetime4 == 0) {
          return false;
        }
        this.field_x = this.field_X << 16;
        this.field_y = this.field_Y << 16;
        return true;
    }

    final static String a(boolean param0, int param1, boolean param2, boolean param3) {
        int var4 = 0;
        if (param0) {
          var4 += 4;
          if (param3) {
            var4 += 2;
          }
          if (param1 > -113) {
            return (String) null;
          }
          if (param2) {
            var4++;
            return tk.field_e[var4];
          }
          return tk.field_e[var4];
        }
        if (param3) {
          var4 += 2;
        }
        if (param1 > -113) {
          return (String) null;
        }
        if (!param2) {
          return tk.field_e[var4];
        }
        var4++;
        return tk.field_e[var4];
    }

    public static void i(int param0) {
        field_P = null;
        field_H = null;
        if (param0 != 0) {
          field_H = (String) null;
        }
    }

    final static void a(int param0, byte param1, int param2, int param3, int param4) {
        hk.i(1584);
        bi.c(param4, param0, param2, param3);
        if (param1 != 99) {
          field_P = (int[]) null;
        }
    }

    abstract void f(byte param0);

    static {
        field_P = new int[8192];
        field_Q = false;
    }

    /* Full JVM integer arguments; original narrow signature preserved. */
    final static void $cfr$intArgs$a$3aedf8649552(int param0, int param1, int param2, int param3, int param4) {
        hk.i(1584);
        bi.c(param4, param0, param2, param3);
        if (param1 != 99) {
          field_P = (int[]) null;
        }
    }
}
