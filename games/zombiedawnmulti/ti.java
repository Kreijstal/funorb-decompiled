/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class ti extends id {
    int field_L;
    static int field_Y;
    private int field_T;
    private boolean field_R;
    int field_K;
    static int field_J;
    static String[] field_M;
    int field_O;
    int field_P;
    static String field_H;
    int field_S;
    int field_G;
    uj field_U;
    static int field_I;
    int field_N;
    int field_bb;
    static String field_Z;
    int field_X;
    static int field_W;
    int field_V;
    int field_F;
    int field_ab;
    int field_Q;

    final void j(int param0) {
        this.field_G = param0;
    }

    final boolean a(int param0, boolean param1, int param2) {
        int var4 = this.field_z >> 16;
        if (!param1) {
          return true;
        }
        int var5 = this.field_E >> 16;
        if (-7 + (var4 + 24) <= param0) {
          return false;
        }
        if (7 + var4 - 24 >= param0) {
          return false;
        }
        if (param2 <= -48 + var5 + 5) {
          return false;
        }
        if (var5 + 2 > param2) {
          return true;
        }
        return false;
    }

    void f(byte param0) {
        if (this.field_G > 0) {
          this.field_G = this.field_G - 1;
        }
        if (this.field_K != 21) {
          if (param0 > -79) {
            field_W = 92;
          }
          return;
        }
        this.field_N = this.field_N - 4;
        if (this.field_N != 0) {
          return;
        }
        this.a(true);
        this.a(-4564);
    }

    final void e(int param0, int param1) {
        int var3 = 0;
        if (param1 == 2) {
          var3 = 600;
          if (this instanceof gm) {
            var3 = var3 * 2;
          }
          this.field_G = op.field_m.a((byte) 32, param0, var3);
          return;
        }
    }

    final static boolean a(byte param0, CharSequence param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        boolean stackIn_1_0 = false;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_int = -115 / ((param0 + 53) / 59);
          stackIn_1_0 = ng.a(-49, true, param1, 10);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_4_0 = var2;
          stackIn_4_1 = new StringBuilder().append("ti.MA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(')').toString());
        }
    }

    final void i(int param0) {
        this.field_E = this.field_E + this.field_S;
        this.field_z = this.field_z + this.field_X;
        if (param0 != 5197) {
          this.c(20, -102);
        }
    }

    void b(int param0, int param1) {
        if (this.field_K == 32) {
          return;
        }
        if (20 == this.field_K) {
          if (param0 != 18) {
            return;
          }
          this.field_Q = 0;
          this.field_ab = 0;
          this.field_K = param0;
          if (param0 != 21) {
            if (param1 == -27655) {
              return;
            }
            field_Z = (String) null;
            return;
          }
          this.a(-4564);
          this.field_N = 256;
          if (param1 != -27655) {
            field_Z = (String) null;
            return;
          }
          return;
        }
        this.field_Q = 0;
        this.field_ab = 0;
        this.field_K = param0;
        if (param0 == 21) {
          this.a(-4564);
          this.field_N = 256;
          if (param1 == -27655) {
            return;
          }
          field_Z = (String) null;
          return;
        }
        if (param1 == -27655) {
          return;
        }
        field_Z = (String) null;
    }

    ti(int param0, int param1, int param2, int param3) {
        super(param0, param1, param2);
        this.field_U = null;
        this.field_K = !(this instanceof gm) ? 4 : 0;
        this.field_F = 1 != hp.a((byte) 21, g.field_a, 2) ? 1 : 3;
        this.field_ab = 0;
        this.field_Q = 0;
        this.field_bb = param3;
    }

    final void a(int param0, int param1, int param2, byte param3, int param4, int param5) {
        int var7 = -88 % ((param3 + 32) / 57);
        this.field_R = false;
        this.field_z = param0;
        this.field_O = param5;
        this.field_P = param2;
        this.field_E = param1;
        this.d(6, param4);
    }

    final boolean k(int param0) {
        int stackIn_16_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_62_0 = 0;
        int stackIn_107_0 = 0;
        int stackIn_139_0 = 0;
        int stackIn_184_0 = 0;
        int stackIn_209_0 = 0;
        int stackIn_221_0 = 0;
        int stackIn_255_0 = 0;
        int stackIn_341_0 = 0;
        int var2;
        int var3;
        int var4;
        int var5;
        int var2Lifetime1;
        int var3Lifetime1;
        int var4Lifetime1;
        int var4Lifetime2;
        int var4Lifetime3;
        int var4Lifetime4;
        int var5Lifetime1;
        int var5Lifetime2;
        int var5Lifetime3;
        int var5Lifetime4;
        int var5Lifetime5;
        int var5Lifetime6;
        int var4Lifetime2Lifetime1;
        int var5Lifetime1Lifetime1;
        int var5Lifetime2Lifetime1;
        int var5Lifetime2Lifetime2;
        int var5Lifetime5Lifetime1;
        if (param0 >= -69) {
          this.field_X = 119;
          var2 = this.field_O << 16;
          var3 = this.field_P << 16;
          if (this.field_X == 0 &&
            this.field_S == 0) {
            return false;
          }
          if (this.field_X != 0) {
            if (this.field_X > 0 &&
              this.field_z > var2) {
              stackIn_16_0 = 1;
            } else {
              if (this.field_X < 0) {
                stackIn_16_0 = (this.field_z < var2) ? 1 : 0;
              } else {
                stackIn_16_0 = 0;
              }
            }
          } else {
            stackIn_16_0 = 1;
          }
          var4 = stackIn_16_0;
          if (this.field_S != 0) {
            if (this.field_S > 0 &&
              this.field_E > var3) {
              stackIn_28_0 = 1;
            } else {
              if (this.field_S < 0) {
                stackIn_28_0 = (var3 > this.field_E) ? 1 : 0;
              } else {
                stackIn_28_0 = 0;
              }
            }
          } else {
            stackIn_28_0 = 1;
          }
          var5 = stackIn_28_0;
          if (Math.abs(-var2 + this.field_z) < wc.field_O &&
            Math.abs(this.field_E - var3) < wc.field_O) {
            var4 = 1;
            var5 = 1;
          }
          if (var4 != 0 &&
            var5 == 0) {
            this.field_X = 0;
            return false;
          }
          if (var4 == 0 &&
            var5 != 0) {
            this.field_S = 0;
            return false;
          }
          if (var4 == 0) {
            return false;
          }
          if (var5 == 0) {
            return false;
          }
          this.field_E = this.field_P << 16;
          this.field_z = this.field_O << 16;
          if (!this.field_R) {
            return true;
          }
          this.field_R = false;
          this.field_O = this.field_V;
          this.field_P = this.field_L;
          this.d(6, this.field_T);
          return false;
        }
        var2Lifetime1 = this.field_O << 16;
        var3Lifetime1 = this.field_P << 16;
        if (this.field_X == 0 &&
          this.field_S == 0) {
          return false;
        }
        if (this.field_X == 0) {
          var4Lifetime1 = 1;
          if (this.field_S != 0) {
            if (this.field_S <= 0) {
              if (this.field_S < 0 &&
                var3Lifetime1 > this.field_E) {
                var5Lifetime1 = 1;
                if (Math.abs(-var2Lifetime1 + this.field_z) < wc.field_O &&
                  Math.abs(this.field_E - var3Lifetime1) < wc.field_O) {
                  var4Lifetime1 = 1;
                  var5Lifetime1 = 1;
                }
                if (var4Lifetime1 != 0 &&
                  var5Lifetime1 == 0) {
                  this.field_X = 0;
                  return false;
                }
                if (var4Lifetime1 == 0 &&
                  var5Lifetime1 != 0) {
                  this.field_S = 0;
                } else {
                  if (var4Lifetime1 == 0) {
                    return false;
                  }
                  if (var5Lifetime1 != 0) {
                    this.field_E = this.field_P << 16;
                    this.field_z = this.field_O << 16;
                    if (!this.field_R) {
                      return true;
                    }
                    this.field_R = false;
                    this.field_O = this.field_V;
                    this.field_P = this.field_L;
                    this.d(6, this.field_T);
                    return false;
                  }
                }
                return false;
              }
              stackIn_107_0 = 0;
            } else {
              if (this.field_E <= var3Lifetime1) {
                if (this.field_S < 0) {
                  stackIn_62_0 = (var3Lifetime1 <= this.field_E) ? 0 : 1;
                } else {
                  stackIn_62_0 = 0;
                }
                var5Lifetime1 = stackIn_62_0;
                if (Math.abs(-var2Lifetime1 + this.field_z) < wc.field_O &&
                  Math.abs(this.field_E - var3Lifetime1) < wc.field_O) {
                  var4Lifetime1 = 1;
                  var5Lifetime1 = 1;
                }
                if (var4Lifetime1 != 0 &&
                  var5Lifetime1 == 0) {
                  this.field_X = 0;
                  return false;
                }
                if (var4Lifetime1 == 0 &&
                  var5Lifetime1 != 0) {
                  this.field_S = 0;
                } else {
                  if (var4Lifetime1 == 0) {
                    return false;
                  }
                  if (var5Lifetime1 != 0) {
                    this.field_E = this.field_P << 16;
                    this.field_z = this.field_O << 16;
                    if (!this.field_R) {
                      return true;
                    }
                    this.field_R = false;
                    this.field_O = this.field_V;
                    this.field_P = this.field_L;
                    this.d(6, this.field_T);
                    return false;
                  }
                }
                return false;
              }
              stackIn_107_0 = 1;
            }
          } else {
            stackIn_107_0 = 1;
          }
          var5Lifetime1Lifetime1 = stackIn_107_0;
          if (Math.abs(-var2Lifetime1 + this.field_z) < wc.field_O &&
            Math.abs(this.field_E - var3Lifetime1) < wc.field_O) {
            var4Lifetime1 = 1;
            var5Lifetime1Lifetime1 = 1;
          }
          if (var4Lifetime1 != 0 &&
            var5Lifetime1Lifetime1 == 0) {
            this.field_X = 0;
            return false;
          }
          if (var4Lifetime1 == 0 &&
            var5Lifetime1Lifetime1 != 0) {
            this.field_S = 0;
          } else {
            if (var4Lifetime1 == 0) {
              return false;
            }
            if (var5Lifetime1Lifetime1 != 0) {
              this.field_E = this.field_P << 16;
              this.field_z = this.field_O << 16;
              if (!this.field_R) {
                return true;
              }
              this.field_R = false;
              this.field_O = this.field_V;
              this.field_P = this.field_L;
              this.d(6, this.field_T);
              return false;
            }
          }
          return false;
        }
        if (this.field_X > 0) {
          if (this.field_z <= var2Lifetime1) {
            if (this.field_X < 0) {
              stackIn_209_0 = (this.field_z >= var2Lifetime1) ? 0 : 1;
            } else {
              stackIn_209_0 = 0;
            }
            var4Lifetime2 = stackIn_209_0;
            if (this.field_S != 0) {
              if (this.field_S > 0 &&
                this.field_E > var3Lifetime1) {
                stackIn_221_0 = 1;
              } else {
                if (this.field_S < 0) {
                  stackIn_221_0 = (var3Lifetime1 > this.field_E) ? 1 : 0;
                } else {
                  stackIn_221_0 = 0;
                }
              }
            } else {
              stackIn_221_0 = 1;
            }
            var5Lifetime2 = stackIn_221_0;
            if (Math.abs(-var2Lifetime1 + this.field_z) < wc.field_O &&
              Math.abs(this.field_E - var3Lifetime1) < wc.field_O) {
              var4Lifetime2 = 1;
              var5Lifetime2 = 1;
            }
            if (var4Lifetime2 != 0 &&
              var5Lifetime2 == 0) {
              this.field_X = 0;
              return false;
            }
            if (var4Lifetime2 == 0 &&
              var5Lifetime2 != 0) {
              this.field_S = 0;
            } else {
              if (var4Lifetime2 == 0) {
                return false;
              }
              if (var5Lifetime2 != 0) {
                this.field_E = this.field_P << 16;
                this.field_z = this.field_O << 16;
                if (!this.field_R) {
                  return true;
                }
                this.field_R = false;
                this.field_O = this.field_V;
                this.field_P = this.field_L;
                this.d(6, this.field_T);
                return false;
              }
            }
            return false;
          }
          var4Lifetime2Lifetime1 = 1;
          if (this.field_S != 0) {
            if (this.field_S <= 0) {
              if (this.field_S < 0 &&
                var3Lifetime1 > this.field_E) {
                var5Lifetime2Lifetime1 = 1;
                if (Math.abs(-var2Lifetime1 + this.field_z) < wc.field_O &&
                  Math.abs(this.field_E - var3Lifetime1) < wc.field_O) {
                  var4Lifetime2Lifetime1 = 1;
                  var5Lifetime2Lifetime1 = 1;
                }
                if (var4Lifetime2Lifetime1 != 0 &&
                  var5Lifetime2Lifetime1 == 0) {
                  this.field_X = 0;
                  return false;
                }
                if (var4Lifetime2Lifetime1 == 0 &&
                  var5Lifetime2Lifetime1 != 0) {
                  this.field_S = 0;
                } else {
                  if (var4Lifetime2Lifetime1 == 0) {
                    return false;
                  }
                  if (var5Lifetime2Lifetime1 != 0) {
                    this.field_E = this.field_P << 16;
                    this.field_z = this.field_O << 16;
                    if (!this.field_R) {
                      return true;
                    }
                    this.field_R = false;
                    this.field_O = this.field_V;
                    this.field_P = this.field_L;
                    this.d(6, this.field_T);
                    return false;
                  }
                }
                return false;
              }
              stackIn_184_0 = 0;
            } else {
              if (this.field_E <= var3Lifetime1) {
                if (this.field_S < 0) {
                  stackIn_139_0 = (var3Lifetime1 <= this.field_E) ? 0 : 1;
                } else {
                  stackIn_139_0 = 0;
                }
                var5Lifetime2Lifetime1 = stackIn_139_0;
                if (Math.abs(-var2Lifetime1 + this.field_z) < wc.field_O &&
                  Math.abs(this.field_E - var3Lifetime1) < wc.field_O) {
                  var4Lifetime2Lifetime1 = 1;
                  var5Lifetime2Lifetime1 = 1;
                }
                if (var4Lifetime2Lifetime1 != 0 &&
                  var5Lifetime2Lifetime1 == 0) {
                  this.field_X = 0;
                  return false;
                }
                if (var4Lifetime2Lifetime1 == 0 &&
                  var5Lifetime2Lifetime1 != 0) {
                  this.field_S = 0;
                } else {
                  if (var4Lifetime2Lifetime1 == 0) {
                    return false;
                  }
                  if (var5Lifetime2Lifetime1 != 0) {
                    this.field_E = this.field_P << 16;
                    this.field_z = this.field_O << 16;
                    if (!this.field_R) {
                      return true;
                    }
                    this.field_R = false;
                    this.field_O = this.field_V;
                    this.field_P = this.field_L;
                    this.d(6, this.field_T);
                    return false;
                  }
                }
                return false;
              }
              stackIn_184_0 = 1;
            }
          } else {
            stackIn_184_0 = 1;
          }
          var5Lifetime2Lifetime2 = stackIn_184_0;
          if (Math.abs(-var2Lifetime1 + this.field_z) < wc.field_O &&
            Math.abs(this.field_E - var3Lifetime1) < wc.field_O) {
            var4Lifetime2Lifetime1 = 1;
            var5Lifetime2Lifetime2 = 1;
          }
          if (var4Lifetime2Lifetime1 != 0 &&
            var5Lifetime2Lifetime2 == 0) {
            this.field_X = 0;
            return false;
          }
          if (var4Lifetime2Lifetime1 == 0 &&
            var5Lifetime2Lifetime2 != 0) {
            this.field_S = 0;
          } else {
            if (var4Lifetime2Lifetime1 == 0) {
              return false;
            }
            if (var5Lifetime2Lifetime2 != 0) {
              this.field_E = this.field_P << 16;
              this.field_z = this.field_O << 16;
              if (!this.field_R) {
                return true;
              }
              this.field_R = false;
              this.field_O = this.field_V;
              this.field_P = this.field_L;
              this.d(6, this.field_T);
              return false;
            }
          }
          return false;
        }
        if (this.field_X < 0 &&
          this.field_z < var2Lifetime1) {
          var4Lifetime3 = 1;
          if (this.field_S != 0) {
            if (this.field_S > 0 &&
              this.field_E > var3Lifetime1) {
              stackIn_255_0 = 1;
            } else {
              if (this.field_S < 0) {
                stackIn_255_0 = (var3Lifetime1 > this.field_E) ? 1 : 0;
              } else {
                stackIn_255_0 = 0;
              }
            }
          } else {
            stackIn_255_0 = 1;
          }
          var5Lifetime3 = stackIn_255_0;
          if (Math.abs(-var2Lifetime1 + this.field_z) < wc.field_O &&
            Math.abs(this.field_E - var3Lifetime1) < wc.field_O) {
            var4Lifetime3 = 1;
            var5Lifetime3 = 1;
          }
          if (var4Lifetime3 != 0 &&
            var5Lifetime3 == 0) {
            this.field_X = 0;
            return false;
          }
          if (var4Lifetime3 == 0 &&
            var5Lifetime3 != 0) {
            this.field_S = 0;
          } else {
            if (var4Lifetime3 == 0) {
              return false;
            }
            if (var5Lifetime3 != 0) {
              this.field_E = this.field_P << 16;
              this.field_z = this.field_O << 16;
              if (!this.field_R) {
                return true;
              }
              this.field_R = false;
              this.field_O = this.field_V;
              this.field_P = this.field_L;
              this.d(6, this.field_T);
              return false;
            }
          }
          return false;
        }
        var4Lifetime4 = 0;
        if (this.field_S == 0) {
          var5Lifetime4 = 1;
          if (Math.abs(-var2Lifetime1 + this.field_z) < wc.field_O &&
            Math.abs(this.field_E - var3Lifetime1) < wc.field_O) {
            var4Lifetime4 = 1;
            var5Lifetime4 = 1;
          }
          if (var4Lifetime4 == 0) {
            if (var4Lifetime4 == 0 &&
              var5Lifetime4 != 0) {
              this.field_S = 0;
              return false;
            }
            if (var4Lifetime4 == 0) {
              return false;
            }
            if (var5Lifetime4 == 0) {
              return false;
            }
            this.field_E = this.field_P << 16;
            this.field_z = this.field_O << 16;
            if (!this.field_R) {
              return true;
            }
            this.field_R = false;
            this.field_O = this.field_V;
            this.field_P = this.field_L;
            this.d(6, this.field_T);
            return false;
          }
          if (var5Lifetime4 == 0) {
            this.field_X = 0;
            return false;
          }
          if (var4Lifetime4 != 0) {
            if (var4Lifetime4 == 0) {
              return false;
            }
            this.field_E = this.field_P << 16;
            this.field_z = this.field_O << 16;
            if (!this.field_R) {
              return true;
            }
            this.field_R = false;
            this.field_O = this.field_V;
            this.field_P = this.field_L;
            this.d(6, this.field_T);
            return false;
          } else {
            this.field_S = 0;
          }
          return false;
        }
        if (this.field_S > 0) {
          if (this.field_E <= var3Lifetime1) {
            if (this.field_S < 0) {
              stackIn_341_0 = (var3Lifetime1 <= this.field_E) ? 0 : 1;
            } else {
              stackIn_341_0 = 0;
            }
            var5Lifetime5 = stackIn_341_0;
            if (Math.abs(-var2Lifetime1 + this.field_z) < wc.field_O &&
              Math.abs(this.field_E - var3Lifetime1) < wc.field_O) {
              var4Lifetime4 = 1;
              var5Lifetime5 = 1;
            }
            if (var4Lifetime4 != 0 &&
              var5Lifetime5 == 0) {
              this.field_X = 0;
            } else if (var4Lifetime4 == 0 &&
              var5Lifetime5 != 0) {
              this.field_S = 0;
            } else {
              if (var4Lifetime4 != 0 &&
                var5Lifetime5 != 0) {
                this.field_E = this.field_P << 16;
                this.field_z = this.field_O << 16;
                if (!this.field_R) {
                  return true;
                }
                this.field_R = false;
                this.field_O = this.field_V;
                this.field_P = this.field_L;
                this.d(6, this.field_T);
                return false;
              }
            }
            return false;
          }
          var5Lifetime5Lifetime1 = 1;
          if (Math.abs(-var2Lifetime1 + this.field_z) < wc.field_O &&
            Math.abs(this.field_E - var3Lifetime1) < wc.field_O) {
            var4Lifetime4 = 1;
            var5Lifetime5Lifetime1 = 1;
          }
          if (var4Lifetime4 == 0) {
            if (var4Lifetime4 == 0 &&
              var5Lifetime5Lifetime1 != 0) {
              this.field_S = 0;
              return false;
            }
            if (var4Lifetime4 == 0) {
              return false;
            }
            if (var5Lifetime5Lifetime1 == 0) {
              return false;
            }
            this.field_E = this.field_P << 16;
            this.field_z = this.field_O << 16;
            if (!this.field_R) {
              return true;
            }
            this.field_R = false;
            this.field_O = this.field_V;
            this.field_P = this.field_L;
            this.d(6, this.field_T);
            return false;
          }
          if (var5Lifetime5Lifetime1 == 0) {
            this.field_X = 0;
            return false;
          }
          if (var4Lifetime4 != 0) {
            if (var4Lifetime4 == 0) {
              return false;
            }
            this.field_E = this.field_P << 16;
            this.field_z = this.field_O << 16;
            if (!this.field_R) {
              return true;
            }
            this.field_R = false;
            this.field_O = this.field_V;
            this.field_P = this.field_L;
            this.d(6, this.field_T);
            return false;
          } else {
            this.field_S = 0;
          }
          return false;
        }
        sharedTailExit_0: {
          if (this.field_S < 0 &&
            var3Lifetime1 > this.field_E) {
            var5Lifetime6 = 1;
            if (Math.abs(-var2Lifetime1 + this.field_z) < wc.field_O &&
              Math.abs(this.field_E - var3Lifetime1) < wc.field_O) {
              var4Lifetime4 = 1;
              var5Lifetime6 = 1;
            }
            if (var4Lifetime4 == 0) {
              if (var4Lifetime4 == 0 &&
                var5Lifetime6 != 0) {
                this.field_S = 0;
                return false;
              }
              if (var4Lifetime4 != 0) {
                break sharedTailExit_0;
              }
            } else {
              if (var5Lifetime6 != 0) {
                if (var4Lifetime4 != 0) {
                  if (var4Lifetime4 != 0 &&
                    var5Lifetime6 != 0) {
                    this.field_E = this.field_P << 16;
                    this.field_z = this.field_O << 16;
                    if (!this.field_R) {
                      return true;
                    }
                    this.field_R = false;
                    this.field_O = this.field_V;
                    this.field_P = this.field_L;
                    this.d(6, this.field_T);
                    return false;
                  }
                } else {
                  this.field_S = 0;
                }
                return false;
              }
              this.field_X = 0;
            }
            return false;
          }
          var5Lifetime6 = 0;
          if (Math.abs(-var2Lifetime1 + this.field_z) < wc.field_O &&
            Math.abs(this.field_E - var3Lifetime1) < wc.field_O) {
            var4Lifetime4 = 1;
            var5Lifetime6 = 1;
          }
          if (var4Lifetime4 == 0) {
            if (var5Lifetime6 != 0) {
              this.field_S = 0;
              return false;
            }
          } else {
            if (var5Lifetime6 == 0) {
              this.field_X = 0;
              return false;
            }
          }
          if (var4Lifetime4 == 0) {
            return false;
          }
        }
        if (var5Lifetime6 == 0) {
          return false;
        }
        this.field_E = this.field_P << 16;
        this.field_z = this.field_O << 16;
        if (!this.field_R) {
          return true;
        }
        this.field_R = false;
        this.field_O = this.field_V;
        this.field_P = this.field_L;
        this.d(6, this.field_T);
        return false;
    }

    public static void g(byte param0) {
        field_H = null;
        field_M = null;
        if (param0 < 23) {
          return;
        }
        field_Z = null;
    }

    final void d(int param0, int param1) {
        int stackIn_8_1 = 0;
        int stackIn_13_1 = 0;
        int stackIn_18_1 = 0;
        int stackIn_24_1 = 0;
        int var3;
        int var4;
        int var5;
        int var6;
        var3 = this.field_O - this.g(param0 + 68);
        var4 = this.field_P - this.h(-80);
        var5 = g.b(var3 * var3 + var4 * var4);
        if (param0 != 6) {
          this.c(-72, 91);
        }
        if (var5 != 0) {
          var6 = param1 / var5;
          this.a(var6 * var4, var6 * var3, (byte) -121);
          return;
        }
        if (this.field_K == 1) {
          if (!(this instanceof gm)) {
            stackIn_8_1 = 4;
          } else {
            stackIn_8_1 = 0;
          }
          this.b(stackIn_8_1, param0 - 27661);
          return;
        }
        if (5 == this.field_K) {
          if (!(this instanceof gm)) {
            stackIn_13_1 = 4;
          } else {
            stackIn_13_1 = 0;
          }
          this.b(stackIn_13_1, param0 - 27661);
          return;
        }
        if (6 == this.field_K) {
          if (!(this instanceof gm)) {
            stackIn_18_1 = 4;
          } else {
            stackIn_18_1 = 0;
          }
          this.b(stackIn_18_1, param0 - 27661);
          return;
        }
        if (this.field_K != 7) {
          return;
        }
        if (!(this instanceof gm)) {
          stackIn_24_1 = 4;
        } else {
          stackIn_24_1 = 0;
        }
        this.b(stackIn_24_1, param0 - 27661);
    }

    private final void a(int param0, int param1, byte param2) {
        if (param2 <= -120) {
          this.field_S = param0;
          this.field_X = param1;
          this.field_F = 0 < param1 ? 1 : 3;
          return;
        }
        this.field_bb = -7;
        this.field_S = param0;
        this.field_X = param1;
        this.field_F = 0 < param1 ? 1 : 3;
    }

    final void c(int param0, int param1) {
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int fieldTemp$4 = 0;
        int fieldTemp$5 = 0;
        int fieldTemp$6 = 0;
        int fieldTemp$7 = 0;
        int var3;
        int var3Lifetime1;
        int var3Lifetime2;
        int var3Lifetime3;
        if (gg.field_j[param1] > this.field_ab) {
          if (param0 == 30818) {
            var3 = gg.field_b[param1];
            if (0 < this.field_G) {
              var3 = var3 * 2;
            }
            fieldTemp$2 = this.field_Q + 1;
            this.field_Q = this.field_Q + 1;
            if (var3 < fieldTemp$2) {
              fieldTemp$3 = this.field_ab + 1;
              this.field_ab = this.field_ab + 1;
              if (fieldTemp$3 == gg.field_j[param1]) {
                this.field_ab = 0;
              }
              this.field_Q = 0;
            }
            return;
          }
          field_Y = 103;
          var3Lifetime3 = gg.field_b[param1];
          if (0 < this.field_G) {
            var3Lifetime3 = var3Lifetime3 * 2;
          }
          fieldTemp$0 = this.field_Q + 1;
          this.field_Q = this.field_Q + 1;
          if (var3Lifetime3 < fieldTemp$0) {
            fieldTemp$1 = this.field_ab + 1;
            this.field_ab = this.field_ab + 1;
            if (fieldTemp$1 == gg.field_j[param1]) {
              this.field_ab = 0;
            }
            this.field_Q = 0;
          }
          return;
        }
        this.field_ab = 0;
        if (param0 == 30818) {
          var3Lifetime1 = gg.field_b[param1];
          if (0 < this.field_G) {
            var3Lifetime1 = var3Lifetime1 * 2;
          }
          fieldTemp$4 = this.field_Q + 1;
          this.field_Q = this.field_Q + 1;
          if (var3Lifetime1 < fieldTemp$4) {
            fieldTemp$5 = this.field_ab + 1;
            this.field_ab = this.field_ab + 1;
            if (fieldTemp$5 == gg.field_j[param1]) {
              this.field_ab = 0;
            }
            this.field_Q = 0;
          }
          return;
        }
        field_Y = 103;
        var3Lifetime2 = gg.field_b[param1];
        if (0 < this.field_G) {
          var3Lifetime2 = var3Lifetime2 * 2;
        }
        fieldTemp$6 = this.field_Q + 1;
        this.field_Q = this.field_Q + 1;
        if (var3Lifetime2 < fieldTemp$6) {
          fieldTemp$7 = this.field_ab + 1;
          this.field_ab = this.field_ab + 1;
          if (fieldTemp$7 == gg.field_j[param1]) {
            this.field_ab = 0;
          }
          this.field_Q = 0;
        }
        return;
    }

    static {
        field_J = 3;
        field_Y = 0;
        field_H = "Creating a Jagex account is simple and free. Your account will remember your progress, highscores and achievements in every game. You can also use it to play some of our multiplayer games - and Jagex's other games!<br><br><col=2164A2>Please note - if you have a RuneScape account, you can click 'Go Back' and use your existing account to log in!</col>";
        field_I = 10;
        field_Z = "Whisk your zombies across time and space. Well, maybe not time.";
        field_M = new String[]{"The Mall", "Power Plant", "Police Precinct", "White House"};
    }
}
