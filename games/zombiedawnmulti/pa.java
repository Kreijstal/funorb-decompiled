/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class pa extends ek {
    int field_N;
    int field_W;
    int field_R;
    static cj field_O;
    int field_cb;
    static String field_bb;
    int field_Q;
    static ja field_T;
    static String field_Y;
    int field_ab;
    int field_db;
    private int field_U;
    boolean field_X;
    boolean field_Z;
    boolean field_S;
    int field_L;
    private int field_P;
    int field_V;
    int field_M;

    final boolean b(int param0, int param1) {
        int var4;
        var4 = ZombieDawnMulti.field_E ? 1 : 0;
        this.field_M = 1;
        if (param1 > -14) {
          pa.i((byte) -35);
          this.field_P = this.field_A.field_m.a((byte) 32, param0, 600);
          if (!(this instanceof lm)) {
            if (this.field_Q != 5) {
              if (this.field_Q != 7) {
                if (this.field_Q == 1) {
                  this.c(-60, this.field_M * 71680);
                }
              } else {
                this.c(99, this.field_M * 57344);
              }
            } else {
              this.c(-70, 28672 * this.field_M);
            }
          } else {
            this.field_P = this.field_P * 2;
            if (this.field_Q == 5) {
              this.c(-70, 28672 * this.field_M);
            } else {
              if (this.field_Q == 7) {
                this.c(99, this.field_M * 57344);
              } else {
                if (this.field_Q == 1) {
                  this.c(-60, this.field_M * 71680);
                }
              }
            }
          }
        } else {
          this.field_P = this.field_A.field_m.a((byte) 32, param0, 600);
          if (this instanceof lm) {
            this.field_P = this.field_P * 2;
          }
          if (this.field_Q == 5) {
            this.c(-70, 28672 * this.field_M);
          } else {
            if (this.field_Q == 7) {
              this.c(99, this.field_M * 57344);
            } else {
              if (this.field_Q == 1) {
                this.c(-60, this.field_M * 71680);
              }
            }
          }
        }
        this.field_S = true;
        return true;
    }

    final boolean c(byte param0, int param1) {
        int var4 = ZombieDawnMulti.field_E ? 1 : 0;
        this.field_M = 4;
        if (param0 != -68) {
          this.k(106);
          this.field_P = this.field_A.field_m.a((byte) 32, param1, 600);
          if (5 == this.field_Q) {
            this.c(93, 28672 * this.field_M);
            this.field_S = true;
            return true;
          }
          if (this.field_Q == 7) {
            this.c(113, 57344 * this.field_M);
            this.field_S = true;
            return true;
          }
          if (this.field_Q == 1) {
            this.c(param0 ^ -31, this.field_M * 71680);
            this.field_S = true;
            return true;
          }
          this.field_S = true;
          return true;
        }
        this.field_P = this.field_A.field_m.a((byte) 32, param1, 600);
        if (5 == this.field_Q) {
          this.c(93, 28672 * this.field_M);
          this.field_S = true;
          return true;
        }
        if (this.field_Q == 7) {
          this.c(113, 57344 * this.field_M);
          this.field_S = true;
          return true;
        }
        if (this.field_Q == 1) {
          this.c(param0 ^ -31, this.field_M * 71680);
          this.field_S = true;
          return true;
        }
        this.field_S = true;
        return true;
    }

    final boolean k(int param0) {
        int stackIn_17_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_66_0 = 0;
        int stackIn_78_0 = 0;
        int stackIn_111_0 = 0;
        int stackIn_160_0 = 0;
        int stackIn_194_0 = 0;
        int stackIn_243_0 = 0;
        int stackIn_270_0 = 0;
        int stackIn_282_0 = 0;
        int stackIn_318_0 = 0;
        int stackIn_426_0 = 0;
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var2Lifetime1;
        int var3Lifetime1;
        int var4Lifetime1;
        int var4Lifetime2;
        int var4Lifetime3;
        int var4Lifetime4;
        int var4Lifetime5;
        int var5Lifetime1;
        int var5Lifetime2;
        int var5Lifetime3;
        int var5Lifetime4;
        int var5Lifetime5;
        int var4Lifetime3Lifetime1;
        int var5Lifetime2Lifetime1;
        int var5Lifetime3Lifetime1;
        int var5Lifetime3Lifetime2;
        var6 = ZombieDawnMulti.field_E ? 1 : 0;
        if (param0 != 2) {
          this.field_W = 29;
          var2 = this.field_N << 16;
          var3 = this.field_ab << 16;
          if (0 == this.field_R &&
            0 == this.field_W) {
            return false;
          }
          if (this.field_R != 0) {
            if (0 < this.field_R &&
              this.field_G > var2) {
              stackIn_17_0 = 1;
            } else {
              if (0 > this.field_R) {
                stackIn_17_0 = (var2 > this.field_G) ? 1 : 0;
              } else {
                stackIn_17_0 = 0;
              }
            }
          } else {
            stackIn_17_0 = 1;
          }
          var4 = stackIn_17_0;
          if (this.field_W != 0) {
            if (this.field_W > 0 &&
              var3 < this.field_E) {
              stackIn_29_0 = 1;
            } else {
              if (this.field_W < 0) {
                stackIn_29_0 = (var3 > this.field_E) ? 1 : 0;
              } else {
                stackIn_29_0 = 0;
              }
            }
          } else {
            stackIn_29_0 = 1;
          }
          var5 = stackIn_29_0;
          if (Math.abs(-var2 + this.field_G) < ho.field_s &&
            Math.abs(this.field_E - var3) < ho.field_s) {
            var5 = 1;
            var4 = 1;
          }
          if (var4 != 0 &&
            var5 == 0) {
            if (this.field_R != 0) {
              this.field_S = true;
            }
            this.field_R = 0;
            return false;
          }
          if (var4 == 0 &&
            var5 != 0) {
            if (0 != this.field_W) {
              this.field_S = true;
            }
            this.field_W = 0;
          } else {
            if (var4 == 0) {
              return false;
            }
            if (var5 != 0) {
              this.field_W = 0;
              this.field_S = true;
              this.field_G = this.field_N << 16;
              this.field_R = 0;
              this.field_E = this.field_ab << 16;
              return true;
            }
          }
          return false;
        }
        var2Lifetime1 = this.field_N << 16;
        var3Lifetime1 = this.field_ab << 16;
        if (0 == this.field_R) {
          if (0 == this.field_W) {
            return false;
          }
          if (this.field_R != 0) {
            if (0 < this.field_R &&
              this.field_G > var2Lifetime1) {
              stackIn_66_0 = 1;
            } else {
              if (0 > this.field_R) {
                stackIn_66_0 = (var2Lifetime1 > this.field_G) ? 1 : 0;
              } else {
                stackIn_66_0 = 0;
              }
            }
          } else {
            stackIn_66_0 = 1;
          }
          var4Lifetime1 = stackIn_66_0;
          if (this.field_W != 0) {
            if (this.field_W > 0 &&
              var3Lifetime1 < this.field_E) {
              stackIn_78_0 = 1;
            } else {
              if (this.field_W < 0) {
                stackIn_78_0 = (var3Lifetime1 > this.field_E) ? 1 : 0;
              } else {
                stackIn_78_0 = 0;
              }
            }
          } else {
            stackIn_78_0 = 1;
          }
          var5Lifetime1 = stackIn_78_0;
          if (Math.abs(-var2Lifetime1 + this.field_G) < ho.field_s &&
            Math.abs(this.field_E - var3Lifetime1) < ho.field_s) {
            var5Lifetime1 = 1;
            var4Lifetime1 = 1;
          }
          if (var4Lifetime1 != 0 &&
            var5Lifetime1 == 0) {
            if (this.field_R != 0) {
              this.field_S = true;
            }
            this.field_R = 0;
          } else if (var4Lifetime1 == 0 &&
            var5Lifetime1 != 0) {
            if (0 != this.field_W) {
              this.field_S = true;
            }
            this.field_W = 0;
          } else {
            if (var4Lifetime1 == 0) {
              return false;
            }
            if (var5Lifetime1 != 0) {
              this.field_W = 0;
              this.field_S = true;
              this.field_G = this.field_N << 16;
              this.field_R = 0;
              this.field_E = this.field_ab << 16;
              return true;
            }
          }
          return false;
        }
        if (this.field_R == 0) {
          var4Lifetime2 = 1;
          if (this.field_W != 0) {
            if (this.field_W <= 0) {
              if (this.field_W < 0 &&
                var3Lifetime1 > this.field_E) {
                var5Lifetime2 = 1;
                if (Math.abs(-var2Lifetime1 + this.field_G) < ho.field_s &&
                  Math.abs(this.field_E - var3Lifetime1) < ho.field_s) {
                  var5Lifetime2 = 1;
                  var4Lifetime2 = 1;
                }
                if (var4Lifetime2 != 0 &&
                  var5Lifetime2 == 0) {
                  if (this.field_R != 0) {
                    this.field_S = true;
                  }
                  this.field_R = 0;
                } else if (var4Lifetime2 == 0 &&
                  var5Lifetime2 != 0) {
                  if (0 != this.field_W) {
                    this.field_S = true;
                  }
                  this.field_W = 0;
                } else {
                  if (var4Lifetime2 == 0) {
                    return false;
                  }
                  if (var5Lifetime2 != 0) {
                    this.field_W = 0;
                    this.field_S = true;
                    this.field_G = this.field_N << 16;
                    this.field_R = 0;
                    this.field_E = this.field_ab << 16;
                    return true;
                  }
                }
                return false;
              }
              stackIn_160_0 = 0;
            } else {
              if (var3Lifetime1 >= this.field_E) {
                if (this.field_W < 0) {
                  stackIn_111_0 = (var3Lifetime1 <= this.field_E) ? 0 : 1;
                } else {
                  stackIn_111_0 = 0;
                }
                var5Lifetime2 = stackIn_111_0;
                if (Math.abs(-var2Lifetime1 + this.field_G) < ho.field_s &&
                  Math.abs(this.field_E - var3Lifetime1) < ho.field_s) {
                  var5Lifetime2 = 1;
                  var4Lifetime2 = 1;
                }
                if (var4Lifetime2 != 0 &&
                  var5Lifetime2 == 0) {
                  if (this.field_R != 0) {
                    this.field_S = true;
                  }
                  this.field_R = 0;
                } else if (var4Lifetime2 == 0 &&
                  var5Lifetime2 != 0) {
                  if (0 != this.field_W) {
                    this.field_S = true;
                  }
                  this.field_W = 0;
                } else {
                  if (var4Lifetime2 == 0) {
                    return false;
                  }
                  if (var5Lifetime2 != 0) {
                    this.field_W = 0;
                    this.field_S = true;
                    this.field_G = this.field_N << 16;
                    this.field_R = 0;
                    this.field_E = this.field_ab << 16;
                    return true;
                  }
                }
                return false;
              }
              stackIn_160_0 = 1;
            }
          } else {
            stackIn_160_0 = 1;
          }
          var5Lifetime2Lifetime1 = stackIn_160_0;
          if (Math.abs(-var2Lifetime1 + this.field_G) < ho.field_s &&
            Math.abs(this.field_E - var3Lifetime1) < ho.field_s) {
            var5Lifetime2Lifetime1 = 1;
            var4Lifetime2 = 1;
          }
          if (var4Lifetime2 != 0 &&
            var5Lifetime2Lifetime1 == 0) {
            if (this.field_R != 0) {
              this.field_S = true;
            }
            this.field_R = 0;
          } else if (var4Lifetime2 == 0 &&
            var5Lifetime2Lifetime1 != 0) {
            if (0 != this.field_W) {
              this.field_S = true;
            }
            this.field_W = 0;
          } else {
            if (var4Lifetime2 == 0) {
              return false;
            }
            if (var5Lifetime2Lifetime1 != 0) {
              this.field_W = 0;
              this.field_S = true;
              this.field_G = this.field_N << 16;
              this.field_R = 0;
              this.field_E = this.field_ab << 16;
              return true;
            }
          }
          return false;
        }
        if (0 < this.field_R) {
          if (this.field_G <= var2Lifetime1) {
            if (0 > this.field_R) {
              stackIn_270_0 = (var2Lifetime1 <= this.field_G) ? 0 : 1;
            } else {
              stackIn_270_0 = 0;
            }
            var4Lifetime3 = stackIn_270_0;
            if (this.field_W == 0) {
              stackIn_282_0 = 1;
            } else {
              if (this.field_W > 0 &&
                var3Lifetime1 < this.field_E) {
                stackIn_282_0 = 1;
              } else {
                if (this.field_W < 0) {
                  stackIn_282_0 = (var3Lifetime1 > this.field_E) ? 1 : 0;
                } else {
                  stackIn_282_0 = 0;
                }
              }
            }
            var5Lifetime3 = stackIn_282_0;
            if (Math.abs(-var2Lifetime1 + this.field_G) < ho.field_s &&
              Math.abs(this.field_E - var3Lifetime1) < ho.field_s) {
              var5Lifetime3 = 1;
              var4Lifetime3 = 1;
            }
            if (var4Lifetime3 != 0 &&
              var5Lifetime3 == 0) {
              if (this.field_R != 0) {
                this.field_S = true;
              }
              this.field_R = 0;
            } else if (var4Lifetime3 == 0 &&
              var5Lifetime3 != 0) {
              if (0 != this.field_W) {
                this.field_S = true;
              }
              this.field_W = 0;
            } else {
              if (var4Lifetime3 == 0) {
                return false;
              }
              if (var5Lifetime3 != 0) {
                this.field_W = 0;
                this.field_S = true;
                this.field_G = this.field_N << 16;
                this.field_R = 0;
                this.field_E = this.field_ab << 16;
                return true;
              }
            }
            return false;
          }
          var4Lifetime3Lifetime1 = 1;
          if (this.field_W != 0) {
            if (this.field_W <= 0) {
              if (this.field_W < 0 &&
                var3Lifetime1 > this.field_E) {
                var5Lifetime3Lifetime1 = 1;
                if (Math.abs(-var2Lifetime1 + this.field_G) < ho.field_s &&
                  Math.abs(this.field_E - var3Lifetime1) < ho.field_s) {
                  var5Lifetime3Lifetime1 = 1;
                  var4Lifetime3Lifetime1 = 1;
                }
                if (var4Lifetime3Lifetime1 != 0 &&
                  var5Lifetime3Lifetime1 == 0) {
                  if (this.field_R != 0) {
                    this.field_S = true;
                  }
                  this.field_R = 0;
                } else if (var4Lifetime3Lifetime1 == 0 &&
                  var5Lifetime3Lifetime1 != 0) {
                  if (0 != this.field_W) {
                    this.field_S = true;
                  }
                  this.field_W = 0;
                } else {
                  if (var4Lifetime3Lifetime1 == 0) {
                    return false;
                  }
                  if (var5Lifetime3Lifetime1 != 0) {
                    this.field_W = 0;
                    this.field_S = true;
                    this.field_G = this.field_N << 16;
                    this.field_R = 0;
                    this.field_E = this.field_ab << 16;
                    return true;
                  }
                }
                return false;
              }
              stackIn_243_0 = 0;
            } else {
              if (var3Lifetime1 >= this.field_E) {
                if (this.field_W < 0) {
                  stackIn_194_0 = (var3Lifetime1 <= this.field_E) ? 0 : 1;
                } else {
                  stackIn_194_0 = 0;
                }
                var5Lifetime3Lifetime1 = stackIn_194_0;
                if (Math.abs(-var2Lifetime1 + this.field_G) < ho.field_s &&
                  Math.abs(this.field_E - var3Lifetime1) < ho.field_s) {
                  var5Lifetime3Lifetime1 = 1;
                  var4Lifetime3Lifetime1 = 1;
                }
                if (var4Lifetime3Lifetime1 != 0 &&
                  var5Lifetime3Lifetime1 == 0) {
                  if (this.field_R != 0) {
                    this.field_S = true;
                  }
                  this.field_R = 0;
                } else if (var4Lifetime3Lifetime1 == 0 &&
                  var5Lifetime3Lifetime1 != 0) {
                  if (0 != this.field_W) {
                    this.field_S = true;
                  }
                  this.field_W = 0;
                } else {
                  if (var4Lifetime3Lifetime1 == 0) {
                    return false;
                  }
                  if (var5Lifetime3Lifetime1 != 0) {
                    this.field_W = 0;
                    this.field_S = true;
                    this.field_G = this.field_N << 16;
                    this.field_R = 0;
                    this.field_E = this.field_ab << 16;
                    return true;
                  }
                }
                return false;
              }
              stackIn_243_0 = 1;
            }
          } else {
            stackIn_243_0 = 1;
          }
          var5Lifetime3Lifetime2 = stackIn_243_0;
          if (Math.abs(-var2Lifetime1 + this.field_G) < ho.field_s &&
            Math.abs(this.field_E - var3Lifetime1) < ho.field_s) {
            var5Lifetime3Lifetime2 = 1;
            var4Lifetime3Lifetime1 = 1;
          }
          if (var4Lifetime3Lifetime1 != 0 &&
            var5Lifetime3Lifetime2 == 0) {
            if (this.field_R != 0) {
              this.field_S = true;
            }
            this.field_R = 0;
          } else if (var4Lifetime3Lifetime1 == 0 &&
            var5Lifetime3Lifetime2 != 0) {
            if (0 != this.field_W) {
              this.field_S = true;
            }
            this.field_W = 0;
          } else {
            if (var4Lifetime3Lifetime1 == 0) {
              return false;
            }
            if (var5Lifetime3Lifetime2 != 0) {
              this.field_W = 0;
              this.field_S = true;
              this.field_G = this.field_N << 16;
              this.field_R = 0;
              this.field_E = this.field_ab << 16;
              return true;
            }
          }
          return false;
        }
        if (0 > this.field_R &&
          var2Lifetime1 > this.field_G) {
          var4Lifetime4 = 1;
          if (this.field_W == 0) {
            stackIn_318_0 = 1;
          } else {
            if (this.field_W > 0 &&
              var3Lifetime1 < this.field_E) {
              stackIn_318_0 = 1;
            } else {
              if (this.field_W < 0) {
                stackIn_318_0 = (var3Lifetime1 > this.field_E) ? 1 : 0;
              } else {
                stackIn_318_0 = 0;
              }
            }
          }
          var5Lifetime4 = stackIn_318_0;
          if (Math.abs(-var2Lifetime1 + this.field_G) < ho.field_s &&
            Math.abs(this.field_E - var3Lifetime1) < ho.field_s) {
            var5Lifetime4 = 1;
            var4Lifetime4 = 1;
          }
          if (var4Lifetime4 != 0 &&
            var5Lifetime4 == 0) {
            if (this.field_R != 0) {
              this.field_S = true;
            }
            this.field_R = 0;
          } else if (var4Lifetime4 == 0 &&
            var5Lifetime4 != 0) {
            if (0 != this.field_W) {
              this.field_S = true;
            }
            this.field_W = 0;
          } else {
            if (var4Lifetime4 == 0) {
              return false;
            }
            if (var5Lifetime4 != 0) {
              this.field_W = 0;
              this.field_S = true;
              this.field_G = this.field_N << 16;
              this.field_R = 0;
              this.field_E = this.field_ab << 16;
              return true;
            }
          }
          return false;
        }
        var4Lifetime5 = 0;
        if (this.field_W == 0) {
          var5Lifetime5 = 1;
          if (Math.abs(-var2Lifetime1 + this.field_G) < ho.field_s) {
            if (Math.abs(this.field_E - var3Lifetime1) >= ho.field_s) {
              if (var4Lifetime5 != 0 &&
                var5Lifetime5 == 0) {
                if (this.field_R != 0) {
                  this.field_S = true;
                }
                this.field_R = 0;
              } else if (var4Lifetime5 == 0 &&
                var5Lifetime5 != 0) {
                if (0 != this.field_W) {
                  this.field_S = true;
                }
                this.field_W = 0;
              } else {
                if (var4Lifetime5 == 0) {
                  return false;
                }
                if (var5Lifetime5 != 0) {
                  this.field_W = 0;
                  this.field_S = true;
                  this.field_G = this.field_N << 16;
                  this.field_R = 0;
                  this.field_E = this.field_ab << 16;
                  return true;
                }
              }
              return false;
            }
            var5Lifetime5 = 1;
            var4Lifetime5 = 1;
          }
        } else {
          if (this.field_W <= 0) {
            if (this.field_W < 0 &&
              var3Lifetime1 > this.field_E) {
              var5Lifetime5 = 1;
            } else {
              var5Lifetime5 = 0;
            }
            if (Math.abs(-var2Lifetime1 + this.field_G) < ho.field_s &&
              Math.abs(this.field_E - var3Lifetime1) < ho.field_s) {
              var5Lifetime5 = 1;
              var4Lifetime5 = 1;
            }
          } else {
            if (var3Lifetime1 >= this.field_E) {
              if (this.field_W < 0) {
                stackIn_426_0 = (var3Lifetime1 <= this.field_E) ? 0 : 1;
              } else {
                stackIn_426_0 = 0;
              }
              var5Lifetime5 = stackIn_426_0;
              if (Math.abs(-var2Lifetime1 + this.field_G) < ho.field_s &&
                Math.abs(this.field_E - var3Lifetime1) < ho.field_s) {
                var5Lifetime5 = 1;
                var4Lifetime5 = 1;
              }
              if (var4Lifetime5 != 0 &&
                var5Lifetime5 == 0) {
                if (this.field_R != 0) {
                  this.field_S = true;
                }
                this.field_R = 0;
              } else if (var4Lifetime5 == 0 &&
                var5Lifetime5 != 0) {
                if (0 != this.field_W) {
                  this.field_S = true;
                }
                this.field_W = 0;
              } else {
                if (var4Lifetime5 == 0) {
                  return false;
                }
                if (var5Lifetime5 != 0) {
                  this.field_W = 0;
                  this.field_S = true;
                  this.field_G = this.field_N << 16;
                  this.field_R = 0;
                  this.field_E = this.field_ab << 16;
                  return true;
                }
              }
              return false;
            }
            var5Lifetime5 = 1;
            if (Math.abs(-var2Lifetime1 + this.field_G) < ho.field_s) {
              if (Math.abs(this.field_E - var3Lifetime1) >= ho.field_s) {
                if (var4Lifetime5 != 0 &&
                  var5Lifetime5 == 0) {
                  if (this.field_R != 0) {
                    this.field_S = true;
                  }
                  this.field_R = 0;
                } else if (var4Lifetime5 == 0 &&
                  var5Lifetime5 != 0) {
                  if (0 != this.field_W) {
                    this.field_S = true;
                  }
                  this.field_W = 0;
                } else {
                  if (var4Lifetime5 == 0) {
                    return false;
                  }
                  if (var5Lifetime5 != 0) {
                    this.field_W = 0;
                    this.field_S = true;
                    this.field_G = this.field_N << 16;
                    this.field_R = 0;
                    this.field_E = this.field_ab << 16;
                    return true;
                  }
                }
                return false;
              }
              var5Lifetime5 = 1;
              var4Lifetime5 = 1;
            }
          }
        }
        if (var4Lifetime5 != 0 &&
          var5Lifetime5 == 0) {
          if (this.field_R != 0) {
            this.field_S = true;
          }
          this.field_R = 0;
          return false;
        }
        if (var4Lifetime5 == 0 &&
          var5Lifetime5 != 0) {
          if (0 != this.field_W) {
            this.field_S = true;
          }
          this.field_W = 0;
          return false;
        }
        if (var4Lifetime5 == 0) {
          return false;
        }
        if (var5Lifetime5 == 0) {
          return false;
        }
        this.field_W = 0;
        this.field_S = true;
        this.field_G = this.field_N << 16;
        this.field_R = 0;
        this.field_E = this.field_ab << 16;
        return true;
    }

    final static hq g(byte param0) {
        int var1 = 0;
        int var1Lifetime1;
        if (hj.field_d != null) {
          var1 = -122 % ((53 - param0) / 62);
          return hj.field_d;
        }
        hj.field_d = new hq(cp.field_H, 20, 0, 0, 0, 11579568, -1, 0, 0, cp.field_H.field_C, -1, 2147483647, true);
        var1Lifetime1 = -122 % ((53 - param0) / 62);
        return hj.field_d;
    }

    pa(int param0, int param1, int param2, int param3) {
        super(param0, param1, param2);
        this.field_Q = this instanceof lm ? 0 : 4;
        this.field_X = false;
        hp.a((byte) 105, g.field_a, 2);
        this.field_V = 0;
        this.field_Z = false;
        this.field_P = 400;
        this.field_L = 0;
        this.field_M = 2;
        this.field_cb = param3;
    }

    public static void i(byte param0) {
        field_O = null;
        if (param0 != -86) {
          return;
        }
        field_Y = null;
        field_T = null;
        field_bb = null;
    }

    private final void a(int param0, byte param1, int param2) {
        if (param1 < -101) {
          this.field_R = param2;
          this.field_W = param0;
          return;
        }
        this.field_db = -89;
        this.field_R = param2;
        this.field_W = param0;
    }

    final void h(byte param0) {
        this.field_E = this.field_E + this.field_W;
        this.field_G = this.field_G + this.field_R;
        this.d((byte) -117);
        if (param0 <= 27) {
          this.a(-4, (byte) -29);
        }
    }

    void j(int param0) {
        this.field_Z = true;
        this.a(true);
        if (param0 == 18) {
          this.a(param0 - 4582);
          return;
        }
        this.field_N = -127;
        this.a(param0 - 4582);
    }

    final void c(int param0, int param1) {
        int stackIn_6_1 = 0;
        int stackIn_11_1 = 0;
        int stackIn_16_1 = 0;
        int stackIn_21_1 = 0;
        int stackIn_27_1 = 0;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var6Lifetime1;
        int var6Lifetime2;
        int var6Lifetime3;
        int var6Lifetime4;
        int var6Lifetime5;
        int var6Lifetime6;
        int var6Lifetime7;
        var7 = ZombieDawnMulti.field_E ? 1 : 0;
        this.field_S = true;
        this.field_db = param1;
        var3 = this.field_N - this.e((byte) -112);
        var4 = this.field_ab - this.g(1829947600);
        var5 = g.b(var3 * var3 + var4 * var4);
        if (var5 != 0) {
          var6 = param1 / var5;
          this.a(var6 * var4, (byte) -127, var3 * var6);
          var6Lifetime7 = 124 % ((19 - param0) / 63);
          return;
        }
        if (this.field_Q == 1) {
          if (!(this instanceof lm)) {
            stackIn_6_1 = 4;
          } else {
            stackIn_6_1 = 0;
          }
          this.a(stackIn_6_1, (byte) -89);
          var6Lifetime1 = 124 % ((19 - param0) / 63);
          return;
        }
        if (this.field_Q == 5) {
          if (!(this instanceof lm)) {
            stackIn_11_1 = 4;
          } else {
            stackIn_11_1 = 0;
          }
          this.a(stackIn_11_1, (byte) -89);
          var6Lifetime2 = 124 % ((19 - param0) / 63);
          return;
        }
        if (this.field_Q == 6) {
          if (!(this instanceof lm)) {
            stackIn_16_1 = 4;
          } else {
            stackIn_16_1 = 0;
          }
          this.a(stackIn_16_1, (byte) -89);
          var6Lifetime3 = 124 % ((19 - param0) / 63);
          return;
        }
        if (7 == this.field_Q) {
          if (!(this instanceof lm)) {
            stackIn_21_1 = 4;
          } else {
            stackIn_21_1 = 0;
          }
          this.a(stackIn_21_1, (byte) -89);
          var6Lifetime4 = 124 % ((19 - param0) / 63);
          return;
        }
        if (this.field_Q != 8) {
          this.a(0, (byte) -121, 0);
          var6Lifetime5 = 124 % ((19 - param0) / 63);
          return;
        }
        if (!(this instanceof lm)) {
          stackIn_27_1 = 4;
        } else {
          stackIn_27_1 = 0;
        }
        this.a(stackIn_27_1, (byte) -89);
        var6Lifetime6 = 124 % ((19 - param0) / 63);
        return;
    }

    final void b(byte param0, int param1) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        if (!(this.field_V < gg.field_j[param1])) {
          this.field_V = 0;
        }
        int var3 = gg.field_b[param1];
        if (param0 <= 116) {
          this.b(55, -76);
          if (2 > this.field_M) {
            var3 = var3 * 2;
          }
          fieldTemp$0 = this.field_L + 1;
          this.field_L = this.field_L + 1;
          if (fieldTemp$0 <= var3) {
            return;
          }
          fieldTemp$1 = this.field_V + 1;
          this.field_V = this.field_V + 1;
          if (fieldTemp$1 == gg.field_j[param1]) {
            this.field_V = 0;
          } else {
            this.field_L = 0;
            return;
          }
          this.field_L = 0;
          return;
        }
        if (2 > this.field_M) {
          var3 = var3 * 2;
        }
        int fieldTemp$2 = this.field_L + 1;
        this.field_L = this.field_L + 1;
        if (fieldTemp$2 <= var3) {
          return;
        }
        int fieldTemp$3 = this.field_V + 1;
        this.field_V = this.field_V + 1;
        if (fieldTemp$3 == gg.field_j[param1]) {
          this.field_V = 0;
        } else {
          this.field_L = 0;
          return;
        }
        this.field_L = 0;
    }

    void h(int param0) {
        if (this.field_Q == 21) {
          this.field_U = this.field_U - 4;
          if (this.field_U != 0) {
            return;
          }
          this.a(true);
          this.a(-4564);
          this.field_E = 262144000;
          this.field_G = 262144000;
          return;
        }
        if (this.field_P <= 0) {
          if (param0 >= 30) {
            if (this.field_A.a(this, (byte) 105)) {
              this.a(21, (byte) -89);
            }
            return;
          }
          this.field_U = -28;
        } else {
          this.field_P = this.field_P - 1;
          if (this.field_P == 0) {
            this.field_M = 2;
            this.c(-90, this.field_db / 2);
          }
          if (param0 < 30) {
            this.field_U = -28;
          }
        }
        if (!this.field_A.a(this, (byte) 105)) {
          return;
        }
        this.a(21, (byte) -89);
    }

    final void b(boolean param0) {
        if (this.field_M <= 2) {
          this.field_db = this.field_db * (2 / this.field_M);
          this.field_M = 2;
          this.c(-48, this.field_db);
          if (!param0) {
            this.field_S = true;
            return;
          }
          return;
        }
        this.field_db = this.field_db / (this.field_M / 2);
        this.field_M = 2;
        this.c(-48, this.field_db);
        if (!param0) {
          this.field_S = true;
          return;
        }
    }

    void a(int param0, byte param1) {
        if (this.field_Q == 30) {
        }
        this.field_L = 0;
        this.field_V = 0;
        this.field_Q = param0;
        if (param1 == -89) {
          if (param0 == 21) {
            this.a(-4564);
            this.field_U = 256;
          }
          return;
        }
        field_bb = (String) null;
        if (param0 == 21) {
          this.a(-4564);
          this.field_U = 256;
        }
    }

    static {
        field_bb = "Use this on a clueless human for instant zombification! The victim will become one of your zombies.";
        field_Y = "Unfortunately we are unable to create an account for you at this time.";
    }
}
