/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class id implements Serializable {
    int[] field_k;
    int[] field_h;
    int field_d;
    int field_a;
    private qg[] field_x;
    static jf field_s;
    int field_n;
    int[] field_y;
    boolean[] field_r;
    int[] field_j;
    int[] field_z;
    int[] field_v;
    int field_m;
    int[] field_u;
    boolean[] field_q;
    int[] field_c;
    static nc field_A;
    int[] field_i;
    int[] field_g;
    boolean[] field_e;
    static bd[] field_p;
    int[] field_f;
    int[] field_o;
    static ji field_t;
    static String field_l;
    boolean[] field_B;
    static bd field_w;
    static String field_b;

    private final void a(byte[] param0, int param1) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        boolean[] stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        boolean[] stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        int stackIn_16_2 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            if (-60001 == (param0.length ^ -1)) {
              this.a(106, 100, 100);
              var3_int = 0;
              var4 = 0;
              L1: while (true) {
                if (this.field_n <= var4) {
                  var5 = -72 / ((param1 - 41) / 54);
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  L2: {
                    incrementValue$0 = var3_int;
                    var3_int++;
                    this.field_y[var4] = param0[incrementValue$0];
                    if (0 <= this.field_y[var4]) {
                      break L2;
                    } else {
                      this.field_y[var4] = this.field_y[var4] + 256;
                      break L2;
                    }
                  }
                  L3: {
                    incrementValue$1 = var3_int;
                    var3_int++;
                    this.field_y[var4] = this.field_y[var4] + 64 * param0[incrementValue$1];
                    incrementValue$2 = var3_int;
                    var3_int++;
                    this.field_c[var4] = param0[incrementValue$2] * 2;
                    incrementValue$3 = var3_int;
                    var3_int++;
                    this.field_k[var4] = -5 + param0[incrementValue$3];
                    incrementValue$4 = var3_int;
                    var3_int++;
                    this.field_f[var4] = param0[incrementValue$4];
                    this.field_r[var4] = false;
                    if (this.field_f[var4] == 3) {
                      this.field_r[var4] = true;
                      if (this.field_c[var4] == 0) {
                        this.field_f[var4] = 1;
                        break L3;
                      } else {
                        this.field_f[var4] = 0;
                        break L3;
                      }
                    } else {
                      break L3;
                    }
                  }
                  L4: {
                    incrementValue$5 = var3_int;
                    var3_int++;
                    stackIn_15_0 = this.field_B;

                    stackIn_15_1 = var4;

                    if (-2 != (param0[incrementValue$5] ^ -1)) {
                      stackIn_16_0 = (boolean[]) ((Object) stackIn_15_0);
                      stackIn_16_1 = stackIn_15_1;
                      stackIn_16_2 = 0;
                      break L4;
                    } else {
                      stackIn_16_0 = (boolean[]) ((Object) stackIn_15_0);
                      stackIn_16_1 = stackIn_15_1;
                      stackIn_16_2 = 1;
                      break L4;
                    }
                  }
                  stackIn_16_0[stackIn_16_1] = stackIn_16_2 != 0;
                  this.field_u[var4] = 0;
                  this.field_i[var4] = 0;
                  this.field_e[var4] = false;
                  var4++;
                  continue L1;
                }
              }
            } else {
              this.a((byte) 92, param0);
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackIn_21_0 = (RuntimeException) (var3);

            stackIn_21_1 = new StringBuilder().append("id.C(");

            if (param0 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L5;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L5;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final int b(int param0, int param1, int param2) {
        int var4;
        L0: {
          if (this.field_c[param2] <= 1) {
            break L0;
          } else {
            if (5 == this.field_c[param2]) {
              break L0;
            } else {
              return this.field_c[param2];
            }
          }
        }
        L1: {
          if ((param0 ^ -1) >= -1) {
            break L1;
          } else {
            L2: {
              var4 = param2 + -1;
              if (0 > var4) {
                break L2;
              } else {
                if (this.field_c[var4] <= 1) {
                  break L2;
                } else {
                  if (this.field_c[var4] == 5) {
                    break L2;
                  } else {
                    return this.field_c[var4];
                  }
                }
              }
            }
            L3: {
              var4 = -this.field_d + param2;
              if (var4 < 0) {
                break L3;
              } else {
                if ((this.field_c[var4] ^ -1) >= -2) {
                  break L3;
                } else {
                  if (5 != this.field_c[var4]) {
                    return this.field_c[var4];
                  } else {
                    break L3;
                  }
                }
              }
            }
            L4: {
              var4--;
              if (-1 < (var4 ^ -1)) {
                break L4;
              } else {
                if (1 >= this.field_c[var4]) {
                  break L4;
                } else {
                  if (-6 != (this.field_c[var4] ^ -1)) {
                    return this.field_c[var4];
                  } else {
                    break L4;
                  }
                }
              }
            }
            if ((param0 ^ -1) < -2) {
              L5: {
                var4 = param2 + -2;
                if (0 > var4) {
                  break L5;
                } else {
                  if (-2 <= (this.field_c[var4] ^ -1)) {
                    break L5;
                  } else {
                    if (5 == this.field_c[var4]) {
                      break L5;
                    } else {
                      return this.field_c[var4];
                    }
                  }
                }
              }
              L6: {
                var4 = var4 - this.field_d;
                if ((var4 ^ -1) > -1) {
                  break L6;
                } else {
                  if (-2 <= (this.field_c[var4] ^ -1)) {
                    break L6;
                  } else {
                    if (this.field_c[var4] == 5) {
                      break L6;
                    } else {
                      return this.field_c[var4];
                    }
                  }
                }
              }
              L7: {
                var4 = var4 - this.field_d;
                if (var4 < 0) {
                  break L7;
                } else {
                  if (this.field_c[var4] <= 1) {
                    break L7;
                  } else {
                    if (this.field_c[var4] != 5) {
                      return this.field_c[var4];
                    } else {
                      break L7;
                    }
                  }
                }
              }
              L8: {
                var4++;
                if (var4 < 0) {
                  break L8;
                } else {
                  if (-2 <= (this.field_c[var4] ^ -1)) {
                    break L8;
                  } else {
                    if (this.field_c[var4] != 5) {
                      return this.field_c[var4];
                    } else {
                      break L8;
                    }
                  }
                }
              }
              var4++;
              if (-1 < (var4 ^ -1)) {
                break L1;
              } else {
                if (this.field_c[var4] <= 1) {
                  break L1;
                } else {
                  if (this.field_c[var4] == 5) {
                    break L1;
                  } else {
                    return this.field_c[var4];
                  }
                }
              }
            } else {
              break L1;
            }
          }
        }
        if (param1 == 5857) {
          return 0;
        } else {
          return 75;
        }
    }

    final void a(int param0, int param1) {
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        oc var15;
        L0: {
          var14 = HostileSpawn.field_I ? 1 : 0;
          if (param0 == -2) {
            break L0;
          } else {
            field_b = (String) null;
            break L0;
          }
        }
        L1: {
          var15 = mm.field_m[0].field_j;
          var4 = var15.b(-4);
          vf.a(param0 + -83, var4);
          var5 = var15.field_g - 20;
          var6 = 20 + var15.field_g;
          var7 = var15.field_e - 27;
          if (-1 <= (var5 ^ -1)) {
            var5 = 1;
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          if (-1 <= (var7 ^ -1)) {
            var7 = 1;
            break L2;
          } else {
            break L2;
          }
        }
        L3: {
          var8 = 27 + var15.field_e;
          if (var6 >= this.field_a - 1) {
            var6 = this.field_a + -2;
            break L3;
          } else {
            break L3;
          }
        }
        L4: {
          if (var8 < -1 + this.field_d) {
            break L4;
          } else {
            var8 = -2 + this.field_d;
            break L4;
          }
        }
        var10 = this.field_d * var5;
        var11 = var5;
        L5: while (true) {
          if (var11 >= var6) {
            return;
          } else {
            var9 = var7 + var10;
            var12 = var7;
            L6: while (true) {
              if (var8 <= var12) {
                var10 = var10 + this.field_d;
                var11++;
                continue L5;
              } else {
                L7: {
                  if ((this.field_u[var9] ^ -1) >= -1) {
                    break L7;
                  } else {
                    L8: {
                      if ((this.field_u[var9] ^ -1) >= -1) {
                        break L8;
                      } else {
                        this.field_u[var9] = this.field_u[var9] - param1;
                        break L8;
                      }
                    }
                    L9: {
                      var13 = this.field_u[var9] >> -1202191103;
                      if (this.field_u[-1 + var9] >= var13) {
                        break L9;
                      } else {
                        this.field_u[var9 - 1] = var13;
                        break L9;
                      }
                    }
                    L10: {
                      if (this.field_u[var9 - -1] < var13) {
                        this.field_u[1 + var9] = var13;
                        break L10;
                      } else {
                        break L10;
                      }
                    }
                    L11: {
                      if (var13 <= this.field_u[var9 - this.field_d]) {
                        break L11;
                      } else {
                        this.field_u[var9 + -this.field_d] = var13;
                        break L11;
                      }
                    }
                    if (var13 > this.field_u[var9 - -this.field_d]) {
                      this.field_u[this.field_d + var9] = var13;
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                }
                L12: {
                  if (-1 != (this.field_f[var9] ^ -1)) {
                    if (this.field_c[var9] == 2) {
                      break L12;
                    } else {
                      if ((this.field_c[var9] ^ -1) != -5) {
                        this.field_c[var9] = 1;
                        if (-2 < (this.field_f[var9 + -1] ^ -1)) {
                          break L12;
                        } else {
                          if (-2 < (this.field_f[var9 - this.field_d] ^ -1)) {
                            break L12;
                          } else {
                            if (-2 < (this.field_f[var9 + -1 - this.field_d] ^ -1)) {
                              break L12;
                            } else {
                              this.field_c[var9] = 0;
                              break L12;
                            }
                          }
                        }
                      } else {
                        break L12;
                      }
                    }
                  } else {
                    this.field_c[var9] = 2;
                    break L12;
                  }
                }
                if (-1 == (this.field_c[var9] ^ -1)) {
                  L13: {
                    if (this.field_c[var9 - 1] == 2) {
                      break L13;
                    } else {
                      if (4 == this.field_c[var9 - 1]) {
                        break L13;
                      } else {
                        if ((this.field_c[-this.field_d + var9] ^ -1) == -3) {
                          break L13;
                        } else {
                          if (-5 == (this.field_c[-this.field_d + var9] ^ -1)) {
                            break L13;
                          } else {
                            var9++;
                            var12++;
                            continue L6;
                          }
                        }
                      }
                    }
                  }
                  this.field_c[var9] = 1;
                  var9++;
                  var12++;
                  continue L6;
                } else {
                  var9++;
                  var12++;
                  continue L6;
                }
              }
            }
          }
        }
    }

    public static void a(byte param0) {
        field_s = null;
        int var1 = -12 / ((param0 - -14) / 33);
        field_b = null;
        field_l = null;
        field_t = null;
        field_w = null;
        field_p = null;
        field_A = null;
    }

    private final void a(byte param0, byte[] param1) {
        boolean[] stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        boolean[] stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        int stackIn_17_2 = 0;
        boolean[] stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        boolean[] stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        int stackIn_20_2 = 0;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_41_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        vi var10 = null;
        var9 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            L1: {
              var10 = new vi(param1);
              var4 = var10.l(32270);
              if (param0 > 81) {
                break L1;
              } else {
                this.a(-10, 78);
                break L1;
              }
            }
            L2: {
              var5 = var10.e(8);
              var6 = var10.e(8);
              this.a(62, var6, var5);
              if (-4 < (var4 ^ -1)) {
                var10.l(32270);
                break L2;
              } else {
                break L2;
              }
            }
            this.field_m = var10.l(32270);
            var7 = 0;
            L3: while (true) {
              if (var7 >= this.field_n) {
                L4: {
                  if (-8 < (var4 ^ -1)) {
                    break L4;
                  } else {
                    var7 = var10.l(32270) * 2;
                    this.field_v = new int[var7];
                    var8 = 0;
                    L5: while (true) {
                      if (var8 >= var7) {
                        break L4;
                      } else {
                        this.field_v[var8] = var10.e(8);
                        var8++;
                        continue L5;
                      }
                    }
                  }
                }
                L6: {
                  if (var4 >= 8) {
                    var7 = var10.l(32270);
                    this.field_x = new qg[var7];
                    var8 = 0;
                    L7: while (true) {
                      if (var8 >= var7) {
                        break L6;
                      } else {
                        this.field_x[var8] = new qg(var10);
                        var8++;
                        continue L7;
                      }
                    }
                  } else {
                    break L6;
                  }
                }
                break L0;
              } else {
                L8: {
                  this.field_y[var7] = var10.e(8);
                  this.field_c[var7] = var10.l(32270);
                  if (var4 < 9) {
                    this.field_k[var7] = var10.l(32270);
                    break L8;
                  } else {
                    this.field_k[var7] = var10.e(8);
                    break L8;
                  }
                }
                L9: {
                  if ((var4 ^ -1) <= -5) {
                    this.field_j[var7] = var10.l(32270);
                    this.field_z[var7] = var10.l(32270);
                    break L9;
                  } else {
                    break L9;
                  }
                }
                L10: {
                  this.field_f[var7] = var10.l(32270);
                  stackIn_16_0 = this.field_r;

                  stackIn_16_1 = var7;

                  if ((var10.l(32270) ^ -1) != -2) {
                    stackIn_17_0 = (boolean[]) ((Object) stackIn_16_0);
                    stackIn_17_1 = stackIn_16_1;
                    stackIn_17_2 = 0;
                    break L10;
                  } else {
                    stackIn_17_0 = (boolean[]) ((Object) stackIn_16_0);
                    stackIn_17_1 = stackIn_16_1;
                    stackIn_17_2 = 1;
                    break L10;
                  }
                }
                L11: {
                  stackIn_17_0[stackIn_17_1] = stackIn_17_2 != 0;
                  stackIn_19_0 = this.field_B;

                  stackIn_19_1 = var7;

                  if (var10.l(32270) != 1) {
                    stackIn_20_0 = (boolean[]) ((Object) stackIn_19_0);
                    stackIn_20_1 = stackIn_19_1;
                    stackIn_20_2 = 0;
                    break L11;
                  } else {
                    stackIn_20_0 = (boolean[]) ((Object) stackIn_19_0);
                    stackIn_20_1 = stackIn_19_1;
                    stackIn_20_2 = 1;
                    break L11;
                  }
                }
                L12: {
                  stackIn_20_0[stackIn_20_1] = stackIn_20_2 != 0;
                  if (var4 < 1) {
                    this.field_o[var7] = 0;
                    break L12;
                  } else {
                    this.field_o[var7] = var10.b(true);
                    break L12;
                  }
                }
                L13: {
                  if ((var4 ^ -1) > -6) {
                    break L13;
                  } else {
                    this.field_g[var7] = var10.l(32270);
                    break L13;
                  }
                }
                L14: {
                  if ((var4 ^ -1) > -7) {
                    break L14;
                  } else {
                    this.field_h[var7] = var10.l(32270);
                    break L14;
                  }
                }
                this.field_u[var7] = 0;
                this.field_i[var7] = 0;
                this.field_e[var7] = false;
                var7++;
                continue L3;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L15: {
            var3 = decompiledCaughtException;
            stackIn_40_0 = (RuntimeException) (var3);

            stackIn_40_1 = new StringBuilder().append("id.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_41_0 = (RuntimeException) ((Object) stackIn_40_0);
              stackIn_41_1 = (StringBuilder) ((Object) stackIn_40_1);
              stackIn_41_2 = "null";
              break L15;
            } else {
              stackIn_41_0 = (RuntimeException) ((Object) stackIn_40_0);
              stackIn_41_1 = (StringBuilder) ((Object) stackIn_40_1);
              stackIn_41_2 = "{...}";
              break L15;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_41_0), stackIn_41_2 + ')');
        }
    }

    private final void a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = HostileSpawn.field_I ? 1 : 0;
        this.field_a = param1;
        this.field_d = param2;
        this.field_n = this.field_d * this.field_a;
        this.field_h = new int[this.field_n];
        this.field_u = new int[this.field_n];
        if (param0 <= 42) {
            this.field_z = (int[]) null;
        }
        this.field_e = new boolean[this.field_n];
        this.field_g = new int[this.field_n];
        this.field_f = new int[this.field_n];
        this.field_v = new int[]{};
        this.field_i = new int[this.field_n];
        this.field_c = new int[this.field_n];
        this.field_k = new int[this.field_n];
        this.field_r = new boolean[this.field_n];
        this.field_o = new int[this.field_n];
        this.field_y = new int[this.field_n];
        this.field_q = new boolean[this.field_n];
        this.field_B = new boolean[this.field_n];
        this.field_j = new int[this.field_n];
        this.field_z = new int[this.field_n];
        this.field_x = new qg[]{};
        for (var4 = 0; var4 < this.field_n; var4++) {
            this.field_y[var4] = 0;
            this.field_c[var4] = 2;
            this.field_k[var4] = 0;
            this.field_j[var4] = 0;
            this.field_z[var4] = 0;
            this.field_u[var4] = 0;
            this.field_i[var4] = 0;
            this.field_r[var4] = false;
            this.field_e[var4] = false;
            this.field_f[var4] = 0;
            this.field_B[var4] = false;
            this.field_o[var4] = 0;
        }
    }

    final int c(int param0, int param1, int param2) {
        int var4 = 0;
        if (param1 > (this.field_c[param2] ^ -1)) {
            var4 = this.field_c[param2];
        }
        if ((param0 ^ -1) < -1) {
            if (-1 > (param2 ^ -1) && -2 > (this.field_c[-1 + param2] ^ -1)) {
                var4 = this.field_c[-1 + param2];
            }
            if (param2 > this.field_d - -1) {
                if (!((this.field_c[param2 - (1 + this.field_d)] ^ -1) >= -2)) {
                    var4 = this.field_c[-this.field_d + (-1 + param2)];
                }
            }
            if (this.field_d < param2) {
                if (!(-2 <= (this.field_c[param2 - this.field_d] ^ -1))) {
                    var4 = this.field_c[-this.field_d + param2];
                }
            }
        }
        return var4;
    }

    id(byte[] param0) {
        this.field_x = new qg[]{};
        try {
            this.a(param0, 127);
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) ((Object) runtimeException), "id.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_s = new jf();
        field_l = "Connection restored.";
        field_b = "Find the rocket launcher, then use it to destroy the turrets blocking the lift.";
    }
}
