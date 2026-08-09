/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class nn {
    private int field_x;
    static me field_c;
    private boolean field_g;
    private int[] field_h;
    int field_n;
    private boolean field_t;
    static String field_s;
    int[] field_q;
    int field_y;
    private ha field_r;
    int[] field_e;
    int field_b;
    boolean field_f;
    jd field_i;
    int field_l;
    int field_j;
    boolean field_a;
    private int field_o;
    int field_p;
    int field_m;
    boolean field_u;
    int[] field_k;
    private int field_A;
    private int field_d;
    static dl field_z;
    static String field_v;
    boolean field_w;

    final int a(bv param0, byte param1, jd param2) {
        int stackIn_3_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_15_1 = 0;
        int stackIn_16_0 = 0;
        int stackIn_16_1 = 0;
        int stackIn_16_2 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        try {
          L0: {
            L1: {
              if (!this.field_t) {
                break L1;
              } else {
                if (!this.field_u) {
                  break L1;
                } else {
                  param0.h(32161, 65);
                  var4_int = 9;
                  param0.b(1, var4_int);
                  param0.b(1, 96);
                  param0.b(1, param2.field_J);
                  param0.b(1, param2.field_w);
                  param0.b(1, 0);
                  param0.b(1, 0);
                  param0.b(1, this.field_i.field_J);
                  param0.b(1, this.field_i.field_w);
                  pd.a(this.field_l, this.field_j, param0, -100);
                  stackIn_3_0 = var4_int;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            }
            L2: {
              if (this.field_h == null) {
                this.field_m = 0;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (-1 != (this.field_m ^ -1)) {
                break L3;
              } else {
                if (0 != this.field_l) {
                  break L3;
                } else {
                  if (this.field_j == 0) {
                    stackIn_12_0 = -1;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    break L3;
                  }
                }
              }
            }
            L4: {
              stackIn_15_0 = 4;

              stackIn_15_1 = -(this.field_m / 4);

              if (-1 > (this.field_m % 4 ^ -1)) {
                stackIn_16_0 = stackIn_15_0;
                stackIn_16_1 = stackIn_15_1;
                stackIn_16_2 = 1;
                break L4;
              } else {
                stackIn_16_0 = stackIn_15_0;
                stackIn_16_1 = stackIn_15_1;
                stackIn_16_2 = 0;
                break L4;
              }
            }
            L5: {
              var4_int = stackIn_16_0 - (stackIn_16_1 - (stackIn_16_2 - -5));
              if (param1 <= -24) {
                break L5;
              } else {
                this.a(-36, 76, -91);
                break L5;
              }
            }
            param0.h(32161, 65);
            param0.b(1, var4_int);
            param0.b(1, 96);
            param0.b(1, param2.field_J);
            param0.b(1, param2.field_w);
            param0.b(1, (135 | this.field_m) >> 949768328);
            param0.b(1, 255 & this.field_m);
            param0.b(1, this.field_i.field_J);
            param0.b(1, this.field_i.field_w);
            jj.a((byte) -112, this.field_m, param0, this.field_h);
            pd.a(this.field_l, this.field_j, param0, -73);
            stackIn_19_0 = var4_int;
            decompiledRegionSelector0 = 2;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackIn_22_0 = (RuntimeException) (var4);

            stackIn_22_1 = new StringBuilder().append("nn.N(");

            if (param0 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L6;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L6;
            }
          }
          L7: {


            stackIn_25_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_23_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "null";
              break L7;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "{...}";
              break L7;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_23_0), stackIn_26_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_12_0;
          } else {
            return stackIn_19_0;
          }
        }
    }

    private final void a(boolean param0, int param1, int param2) {
        int var4;
        int var5;
        ne var6;
        int var6_int;
        ne var7;
        int var8;
        jd var9;
        int var10;
        L0: {
          var8 = ArmiesOfGielinor.field_M ? 1 : 0;
          if (0 == (4 & this.field_r.b(31, this.field_i.field_w, this.field_i.field_J, this.field_i.field_O))) {
            break L0;
          } else {
            param1 = 0;
            break L0;
          }
        }
        L1: {
          if (-1 < (param1 ^ -1)) {
            var4 = 0;
            L2: while (true) {
              if (var4 >= this.field_x) {
                break L1;
              } else {
                var10 = 0;
                var5 = var10;
                L3: while (true) {
                  if (this.field_A <= var10) {
                    var4++;
                    continue L2;
                  } else {
                    var6 = this.field_r.field_Eb[var4 - -(var10 * this.field_x)];
                    if (var6.field_h != 2) {
                      if (7 != var6.field_h) {
                        if (var6.field_h != 11) {
                          if (-5 != (var6.field_h ^ -1)) {
                            if (6 != var6.field_h) {
                              L4: {
                                if (var6.field_c == null) {
                                  break L4;
                                } else {
                                  if (param0) {
                                    break L4;
                                  } else {
                                    var10++;
                                    continue L3;
                                  }
                                }
                              }
                              this.field_q[var4 + this.field_x * var10] = 0;
                              var10++;
                              continue L3;
                            } else {
                              var10++;
                              continue L3;
                            }
                          } else {
                            var10++;
                            continue L3;
                          }
                        } else {
                          var10++;
                          continue L3;
                        }
                      } else {
                        var10++;
                        continue L3;
                      }
                    } else {
                      var10++;
                      continue L3;
                    }
                  }
                }
              }
            }
          } else {
            L5: {
              if (param0) {
                if (-8 == (this.field_i.field_P ^ -1)) {
                  param1 = param1 >> 1;
                  break L5;
                } else {
                  if (this.field_i.field_P != 8) {
                    break L5;
                  } else {
                    param1 = 0;
                    break L5;
                  }
                }
              } else {
                break L5;
              }
            }
            var4 = -param1;
            L6: while (true) {
              if (var4 > param1) {
                break L1;
              } else {
                var5 = -param1;
                L7: while (true) {
                  if (var5 > param1) {
                    var4++;
                    continue L6;
                  } else {
                    var6_int = Math.abs(var4) + Math.abs(var5);
                    if ((var4 + this.field_i.field_J ^ -1) < 0) {
                      if (var4 + this.field_i.field_J < this.field_x) {
                        if ((this.field_i.field_w + var5 ^ -1) < 0) {
                          if (var5 - -this.field_i.field_w < this.field_A) {
                            var7 = this.field_r.field_Eb[this.field_x * (this.field_i.field_w + var5) + (this.field_i.field_J + var4)];
                            if (2 != var7.field_h) {
                              L8: {
                                L9: {
                                  if (var7.field_h == 7) {
                                    break L9;
                                  } else {
                                    if (-12 != (var7.field_h ^ -1)) {
                                      break L8;
                                    } else {
                                      break L9;
                                    }
                                  }
                                }
                                if (param0) {
                                  break L8;
                                } else {
                                  var5++;
                                  continue L7;
                                }
                              }
                              if (4 != var7.field_h) {
                                if (6 != var7.field_h) {
                                  if (var6_int <= param1) {
                                    L10: {
                                      if (null == var7.field_c) {
                                        break L10;
                                      } else {
                                        if (param0) {
                                          break L10;
                                        } else {
                                          var5++;
                                          continue L7;
                                        }
                                      }
                                    }
                                    this.field_q[this.field_x * (var5 - -this.field_i.field_w) + (var4 - -this.field_i.field_J)] = 0;
                                    var5++;
                                    continue L7;
                                  } else {
                                    var5++;
                                    continue L7;
                                  }
                                } else {
                                  var5++;
                                  continue L7;
                                }
                              } else {
                                var5++;
                                continue L7;
                              }
                            } else {
                              var5++;
                              continue L7;
                            }
                          } else {
                            var5++;
                            continue L7;
                          }
                        } else {
                          var5++;
                          continue L7;
                        }
                      } else {
                        var5++;
                        continue L7;
                      }
                    } else {
                      var5++;
                      continue L7;
                    }
                  }
                }
              }
            }
          }
        }
        L11: {
          if (param2 > 65) {
            break L11;
          } else {
            var9 = (jd) null;
            this.a(true, 39, -101, (jd) null, -116, -60);
            break L11;
          }
        }
    }

    final void a(int param0, boolean param1, int param2, byte param3) {
        int var5;
        jd var6;
        int var7;
        var7 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (this.field_i == null) {
          return;
        } else {
          L0: {
            if (this.field_o == this.field_i.field_O) {
              break L0;
            } else {
              if (param1) {
                break L0;
              } else {
                if (-37 != (this.field_p ^ -1)) {
                  return;
                } else {
                  break L0;
                }
              }
            }
          }
          L1: {
            if (0 > param0) {
              break L1;
            } else {
              if (0 > param2) {
                break L1;
              } else {
                if (this.field_x <= param2) {
                  break L1;
                } else {
                  if (param0 < this.field_A) {
                    L2: {
                      L3: {
                        this.field_g = false;
                        this.field_u = false;
                        this.field_b = param0;
                        this.field_j = 0;
                        this.field_t = false;
                        var5 = -124 / ((-19 - param3) / 60);
                        this.field_h = null;
                        this.field_l = 0;
                        this.field_n = param2;
                        if (-52 == (this.field_i.field_N ^ -1)) {
                          break L3;
                        } else {
                          L4: {
                            if (this.field_p <= -1) {
                              break L4;
                            } else {
                              if (-25 == (uc.field_d[this.field_p][5] ^ -1)) {
                                break L3;
                              } else {
                                break L4;
                              }
                            }
                          }
                          var6 = this.field_r.c(param0, true, param2);
                          if (var6 != null) {
                            L5: {
                              if (var6.field_O != this.field_o) {
                                break L5;
                              } else {
                                if (!this.field_a) {
                                  break L2;
                                } else {
                                  break L5;
                                }
                              }
                            }
                            this.a(param0, param2, (byte) -120);
                            break L2;
                          } else {
                            this.a(param0, (byte) -116, param2);
                            break L2;
                          }
                        }
                      }
                      this.a(param0, param2, 0);
                      break L2;
                    }
                    return;
                  } else {
                    break L1;
                  }
                }
              }
            }
          }
          this.e(-116);
          return;
        }
    }

    final void a(int param0, byte param1, int param2) {
        Object stackIn_37_0 = null;
        Object stackIn_38_0 = null;
        int stackIn_38_1 = 0;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        L0: {
          var11 = ArmiesOfGielinor.field_M ? 1 : 0;
          var4 = param0 * this.field_x + param2;
          var5 = var4;
          var6 = param2;
          var7 = param0;
          if (!this.field_i.field_W) {
            break L0;
          } else {
            if (this.field_i.field_N != 0) {
              break L0;
            } else {
              break L0;
            }
          }
        }
        L1: {
          var8 = 0;
          this.field_g = true;
          if (-1 >= this.field_p) {
            break L1;
          } else {
            if (uc.field_d[this.field_p][5] == 18) {
              break L1;
            } else {
              break L1;
            }
          }
        }
        L2: while (true) {
          L3: {
            if (-1 <= (this.field_q[var5] ^ -1)) {
              var7 = param0;
              var6 = param2;
              var5 = var4;
              this.field_h = new int[var8];
              var8--;
              L4: while (true) {
                if (0 >= this.field_q[var5]) {
                  L5: {
                    this.field_m = this.field_h.length;
                    stackIn_37_0 = this;

                    if (this.field_i.field_s) {
                      stackIn_38_0 = this;
                      stackIn_38_1 = 0;
                      break L5;
                    } else {
                      stackIn_38_0 = this;
                      stackIn_38_1 = 1;
                      break L5;
                    }
                  }
                  ((nn) (this)).field_u = stackIn_38_1 != 0;
                  break L3;
                } else {
                  var9 = this.a(var5, (byte) 39, var6, var7);
                  this.field_h[var8] = kf.b(3, var9);
                  var10 = var9;
                  if (1 == var10) {
                    var5 = var5 - this.field_x;
                    var7--;
                    var8--;
                    continue L4;
                  } else {
                    if (-1 != (var10 ^ -1)) {
                      if (-3 != (var10 ^ -1)) {
                        if (-4 == (var10 ^ -1)) {
                          var6--;
                          var5--;
                          var8--;
                          continue L4;
                        } else {
                          var8--;
                          continue L4;
                        }
                      } else {
                        var5 = var5 + this.field_x;
                        var7++;
                        var8--;
                        continue L4;
                      }
                    } else {
                      var5++;
                      var6++;
                      var8--;
                      continue L4;
                    }
                  }
                }
              }
            } else {
              L6: {
                var9 = this.a(var5, (byte) 84, var6, var7);
                var10 = var9;
                if (-2 == (var10 ^ -1)) {
                  var7--;
                  var5 = var5 - this.field_x;
                  break L6;
                } else {
                  if (-1 != (var10 ^ -1)) {
                    if (2 != var10) {
                      if (3 != var10) {
                        break L6;
                      } else {
                        var6--;
                        var5--;
                        break L6;
                      }
                    } else {
                      var7++;
                      var5 = var5 + this.field_x;
                      break L6;
                    }
                  } else {
                    var6++;
                    var5++;
                    break L6;
                  }
                }
              }
              var8++;
              if (99 >= var8) {
                continue L2;
              } else {
                this.field_h = null;
                break L3;
              }
            }
          }
          L7: {
            this.field_f = true;
            if (param1 == -116) {
              break L7;
            } else {
              this.field_w = false;
              break L7;
            }
          }
          return;
        }
    }

    private final void a(int param0, int param1, byte param2) {
        Object stackIn_31_0 = null;
        Object stackIn_32_0 = null;
        int stackIn_32_1 = 0;
        ul stackIn_66_0;
        int stackIn_66_1;
        int stackIn_66_2;
        int stackIn_66_3;
        ul stackIn_67_0 = null;
        int stackIn_67_1 = 0;
        int stackIn_67_2 = 0;
        int stackIn_67_3 = 0;
        int stackIn_67_4 = 0;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        L0: {
          var12 = ArmiesOfGielinor.field_M ? 1 : 0;
          if (this.field_i.field_J != param1) {
            break L0;
          } else {
            if (param0 == this.field_i.field_w) {
              return;
            } else {
              break L0;
            }
          }
        }
        if (-1 != (4 & this.field_e[param1 + param0 * this.field_x] ^ -1)) {
          L1: {
            var4 = bw.field_m[this.field_i.field_N][7];
            var5 = bw.field_m[this.field_i.field_N][6];
            if (param2 == -120) {
              break L1;
            } else {
              this.field_A = 82;
              break L1;
            }
          }
          L2: {
            if (!this.field_i.field_W) {
              break L2;
            } else {
              if ((this.field_i.field_N ^ -1) == -35) {
                var4 = 7;
                var5 = 2;
                if (3 == this.field_i.j(20640)) {
                  var4 = var4 + this.field_i.d(1, 115);
                  break L2;
                } else {
                  break L2;
                }
              } else {
                break L2;
              }
            }
          }
          L3: {
            L4: {
              L5: {
                if ((this.field_i.field_N ^ -1) == -82) {
                  break L5;
                } else {
                  if (4 == this.field_i.field_N) {
                    break L5;
                  } else {
                    if (74 != this.field_i.field_N) {
                      break L4;
                    } else {
                      break L5;
                    }
                  }
                }
              }
              if (this.field_i.j(20640) == 3) {
                var4 = var4 + this.field_i.d(1, param2 ^ 21);
                break L3;
              } else {
                break L4;
              }
            }
            L6: {
              if (3 != this.field_i.g(0)) {
                break L6;
              } else {
                if ((this.field_i.j(param2 ^ -20696) ^ -1) != -3) {
                  break L6;
                } else {
                  var4 = var4 + this.field_i.d(1, -87);
                  break L3;
                }
              }
            }
            if (-3 != (this.field_i.g(0) ^ -1)) {
              break L3;
            } else {
              if (-2 == (this.field_i.j(20640) ^ -1)) {
                var4 = var4 + this.field_i.d(1, param2 ^ 41);
                break L3;
              } else {
                break L3;
              }
            }
          }
          L7: {
            if (-2 != (1 & this.field_e[param0 * this.field_x + param1] ^ -1)) {
              L8: {
                var6 = 3 * bw.field_m[this.field_i.field_N][3];
                if (!this.field_i.field_W) {
                  break L8;
                } else {
                  if (-1 == (this.field_i.field_N ^ -1)) {
                    break L8;
                  } else {
                    var6 = 0;
                    break L8;
                  }
                }
              }
              L9: {
                if (this.field_p <= -1) {
                  break L9;
                } else {
                  if ((uc.field_d[this.field_p][5] ^ -1) != -19) {
                    break L9;
                  } else {
                    var6 = var6 << 1;
                    break L9;
                  }
                }
              }
              var7 = this.field_i.field_J;
              this.field_g = true;
              var8 = this.field_i.field_w;
              var9 = -var4;
              L10: while (true) {
                if (var4 < var9) {
                  if (!this.field_u) {
                    break L7;
                  } else {
                    this.a(var8, (byte) -116, var7);
                    this.field_l = -var7 + param1;
                    this.field_j = param0 + -var8;
                    break L7;
                  }
                } else {
                  var10 = -var4;
                  L11: while (true) {
                    if (var4 < var10) {
                      var9++;
                      continue L10;
                    } else {
                      var11 = Math.abs(var9) + Math.abs(var10);
                      if (-1 < var9 + param1) {
                        if (this.field_x > var9 - -param1) {
                          if ((param0 + var10 ^ -1) < 0) {
                            if (this.field_A > param0 + var10) {
                              if (var11 <= var4) {
                                if (var5 <= var11) {
                                  L12: {
                                    if (1 != var11) {
                                      if (-1 == (2 & this.field_r.b(31, var10 - -param0, param1 + var9, this.field_i.field_O) ^ -1)) {
                                        if (0 == (this.field_r.b(31, param0, param1, this.field_i.field_O) & 2)) {
                                          break L12;
                                        } else {
                                          var10++;
                                          continue L11;
                                        }
                                      } else {
                                        var10++;
                                        continue L11;
                                      }
                                    } else {
                                      break L12;
                                    }
                                  }
                                  if (this.field_q[param1 + (var9 + this.field_x * (param0 + var10))] <= var6) {
                                    L13: {
                                      stackIn_66_0 = this.field_r.field_j;

                                      stackIn_66_1 = var10 - -param0;

                                      stackIn_66_2 = param1;

                                      stackIn_66_3 = param1 + var9;

                                      if (-5 != (this.field_i.g(0) ^ -1)) {
                                        stackIn_67_0 = (ul) ((Object) stackIn_66_0);
                                        stackIn_67_1 = stackIn_66_1;
                                        stackIn_67_2 = stackIn_66_2;
                                        stackIn_67_3 = stackIn_66_3;
                                        stackIn_67_4 = 0;
                                        break L13;
                                      } else {
                                        stackIn_67_0 = (ul) ((Object) stackIn_66_0);
                                        stackIn_67_1 = stackIn_66_1;
                                        stackIn_67_2 = stackIn_66_2;
                                        stackIn_67_3 = stackIn_66_3;
                                        stackIn_67_4 = 1;
                                        break L13;
                                      }
                                    }
                                    if (((ul) (Object) stackIn_67_0).a(stackIn_67_1, stackIn_67_2, stackIn_67_3, stackIn_67_4 != 0, var4, param0, (byte) 86)) {
                                      var6 = this.field_q[param1 + var9 - -(this.field_x * (param0 + var10))];
                                      var8 = var10 + param0;
                                      var7 = var9 - -param1;
                                      this.field_u = true;
                                      var10++;
                                      continue L11;
                                    } else {
                                      var10++;
                                      continue L11;
                                    }
                                  } else {
                                    var10++;
                                    continue L11;
                                  }
                                } else {
                                  var10++;
                                  continue L11;
                                }
                              } else {
                                var10++;
                                continue L11;
                              }
                            } else {
                              var10++;
                              continue L11;
                            }
                          } else {
                            var10++;
                            continue L11;
                          }
                        } else {
                          var10++;
                          continue L11;
                        }
                      } else {
                        var10++;
                        continue L11;
                      }
                    }
                  }
                }
              }
            } else {
              L14: {
                stackIn_31_0 = this;

                if (-1 <= (this.field_i.field_B ^ -1)) {
                  stackIn_32_0 = this;
                  stackIn_32_1 = 0;
                  break L14;
                } else {
                  stackIn_32_0 = this;
                  stackIn_32_1 = 1;
                  break L14;
                }
              }
              ((nn) (this)).field_u = stackIn_32_1 != 0;
              this.field_j = param0 - this.field_i.field_w;
              this.field_l = param1 - this.field_i.field_J;
              break L7;
            }
          }
          this.field_f = true;
          return;
        } else {
          this.field_u = false;
          return;
        }
    }

    private final void a(int param0, int param1, int param2) {
        this.field_t = true;
        if (param2 == this.field_q[this.field_x * param0 + param1]) {
            this.field_u = true;
            this.field_j = -this.field_i.field_w + param0;
            this.field_l = param1 + -this.field_i.field_J;
        } else {
            this.field_u = false;
        }
        this.field_f = true;
        this.field_u = this.field_u & (!this.field_i.field_s ? true : false);
    }

    final void a(v param0, int param1) {
        wk[] stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        wk[] stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        int stackIn_7_2 = 0;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_43_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        var14 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              param0.field_c[0] = this.field_i.field_J;
              param0.field_c[1] = this.field_i.field_w;
              param0.c(9470337);
              if (param1 == -4) {
                break L1;
              } else {
                field_v = (String) null;
                break L1;
              }
            }
            L2: {
              var3_int = param0.field_e[0];
              var4 = param0.field_e[1];
              sc.field_f[10].g(var3_int, var4);
              param0.field_c[1] = this.field_b;
              param0.field_c[0] = this.field_n;
              param0.c(param1 + 9470341);
              var5 = param0.field_e[0];
              var6 = param0.field_e[1];
              var7 = this.c(27732);
              var8 = 0;
              if (!this.field_t) {
                L3: {
                  if (!this.field_g) {
                    break L3;
                  } else {
                    L4: {
                      var9 = 0;
                      if (!this.field_u) {
                        break L4;
                      } else {
                        if (this.field_o == this.field_r.field_gb) {
                          var9 += 6;
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                    }
                    L5: {
                      if (null != this.field_h) {
                        var10 = 0;
                        L6: while (true) {
                          if (this.field_h.length <= var10) {
                            break L5;
                          } else {
                            L7: {
                              var11 = 0;
                              var12 = 0;
                              var13 = this.field_h[var10];
                              if (1 == var13) {
                                var11 = -10;
                                var12 = -5;
                                break L7;
                              } else {
                                if (var13 != 0) {
                                  if (2 == var13) {
                                    var11 = 10;
                                    var12 = 5;
                                    break L7;
                                  } else {
                                    if (-4 != (var13 ^ -1)) {
                                      break L7;
                                    } else {
                                      var11 = -10;
                                      var12 = 5;
                                      break L7;
                                    }
                                  }
                                } else {
                                  var11 = 10;
                                  var12 = -5;
                                  break L7;
                                }
                              }
                            }
                            L8: {
                              sc.field_f[this.field_h[var10] + var9].e(var3_int, var4, 128);
                              sc.field_f[this.field_h[var10] - -var9].e(var11 + var3_int, var4 - -var12, 128);
                              sc.field_f[this.field_h[var10] - -var9].e(var3_int - -(var11 << 220673601), (var12 << -1402085503) + var4, 128);
                              if (var10 >= this.field_h.length - 1) {
                                break L8;
                              } else {
                                if (this.field_h[1 + var10] != this.field_h[var10]) {
                                  break L8;
                                } else {
                                  sc.field_f[this.field_h[var10] + var9].e(var3_int + 3 * var11, 3 * var12 + var4, 128);
                                  break L8;
                                }
                              }
                            }
                            var4 = var4 + (var12 << 1666990850);
                            var3_int = var3_int + (var11 << 2129854690);
                            if (var8 == 0) {
                              param0.field_e[1] = var12 + 16 + var4;
                              param0.field_e[0] = 32 + var3_int - -var11;
                              param0.c(false);
                              if (this.field_u) {
                                L9: {
                                  if (this.field_q[param0.field_c[0] - -(param0.field_c[1] * this.field_x)] > var7) {
                                    var9 = 0;
                                    var8 = 1;
                                    break L9;
                                  } else {
                                    break L9;
                                  }
                                }
                                var10++;
                                continue L6;
                              } else {
                                var10++;
                                continue L6;
                              }
                            } else {
                              var10++;
                              continue L6;
                            }
                          }
                        }
                      } else {
                        break L5;
                      }
                    }
                    sc.field_f[var9 + 5].e(var5, var6, 128);
                    break L3;
                  }
                }
                break L2;
              } else {
                L10: {
                  stackIn_6_0 = sc.field_f;

                  stackIn_6_1 = 5;

                  if (!this.field_u) {
                    stackIn_7_0 = (wk[]) ((Object) stackIn_6_0);
                    stackIn_7_1 = stackIn_6_1;
                    stackIn_7_2 = 0;
                    break L10;
                  } else {
                    stackIn_7_0 = (wk[]) ((Object) stackIn_6_0);
                    stackIn_7_1 = stackIn_6_1;
                    stackIn_7_2 = 6;
                    break L10;
                  }
                }
                ((wk) (Object) stackIn_7_0[stackIn_7_1 + stackIn_7_2]).g(var5, var6);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var3 = decompiledCaughtException;
            stackIn_42_0 = (RuntimeException) (var3);

            stackIn_42_1 = new StringBuilder().append("nn.O(");

            if (param0 == null) {
              stackIn_43_0 = (RuntimeException) ((Object) stackIn_42_0);
              stackIn_43_1 = (StringBuilder) ((Object) stackIn_42_1);
              stackIn_43_2 = "null";
              break L11;
            } else {
              stackIn_43_0 = (RuntimeException) ((Object) stackIn_42_0);
              stackIn_43_1 = (StringBuilder) ((Object) stackIn_42_1);
              stackIn_43_2 = "{...}";
              break L11;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_43_0), stackIn_43_2 + ',' + param1 + ')');
        }
    }

    final void d(int param0) {
        this.e(-42);
        this.field_i = null;
        this.field_p = -1;
        if (param0 >= -14) {
            return;
        }
        this.a(0);
    }

    final void e(int param0) {
        int var2 = -37 / ((param0 - 49) / 52);
        this.field_f = false;
        this.field_h = null;
    }

    private final int a(int param0, byte param1, int param2, int param3) {
        int var5;
        int var6;
        int var7;
        L0: {
          var5 = this.field_q[param0];
          var7 = 30 % ((-18 - param1) / 38);
          var6 = -1;
          if (-1 <= (param2 ^ -1)) {
            break L0;
          } else {
            if (this.field_q[-1 + param0] >= var5) {
              break L0;
            } else {
              if (this.field_r.a(param0 - 1, -16, param0, this.field_i.field_O, this.field_i, true) == this.field_q[param0] + -this.field_q[param0 + -1]) {
                var6 = 3;
                var5 = this.field_q[param0 + -1];
                break L0;
              } else {
                break L0;
              }
            }
          }
        }
        L1: {
          if (param2 >= -1 + this.field_x) {
            break L1;
          } else {
            if (this.field_q[1 + param0] >= var5) {
              break L1;
            } else {
              if (this.field_r.a(1 + param0, -16, param0, this.field_i.field_O, this.field_i, true) == -this.field_q[1 + param0] + this.field_q[param0]) {
                var6 = 0;
                var5 = this.field_q[1 + param0];
                break L1;
              } else {
                break L1;
              }
            }
          }
        }
        L2: {
          if (param3 <= 0) {
            break L2;
          } else {
            if (var5 > this.field_q[param0 - this.field_x]) {
              if (this.field_r.a(-this.field_x + param0, -16, param0, this.field_i.field_O, this.field_i, true) != -this.field_q[param0 + -this.field_x] + this.field_q[param0]) {
                break L2;
              } else {
                var6 = 1;
                var5 = this.field_q[param0 - this.field_x];
                break L2;
              }
            } else {
              break L2;
            }
          }
        }
        L3: {
          if (this.field_x - 1 <= param3) {
            break L3;
          } else {
            if (var5 <= this.field_q[param0 - -this.field_x]) {
              break L3;
            } else {
              if (this.field_r.a(param0 + this.field_x, -16, param0, this.field_i.field_O, this.field_i, true) != -this.field_q[param0 - -this.field_x] + this.field_q[param0]) {
                break L3;
              } else {
                var6 = 2;
                var5 = this.field_q[this.field_x + param0];
                break L3;
              }
            }
          }
        }
        return var6;
    }

    final int c(int param0) {
        int discarded$0 = 0;
        if (param0 != 27732) {
            discarded$0 = this.a(-31, (byte) 81, -84, 42);
        }
        int var2 = 3 * bw.field_m[this.field_d][3];
        if (this.field_p > -1) {
            if (!(18 != uc.field_d[this.field_p][5])) {
                var2 = var2 << 1;
            }
        }
        if (this.field_i != null) {
            if (7 == this.field_i.field_P) {
                var2 = var2 >> 1;
            } else {
                if (!(this.field_i.field_P != 8)) {
                    var2 = 0;
                }
            }
            if (-1 != (4 & this.field_r.b(31, this.field_i.field_w, this.field_i.field_J, this.field_i.field_O) ^ -1)) {
                var2 = 0;
            }
        }
        return var2;
    }

    public static void b(int param0) {
        if (param0 >= -30) {
            nn.b(51);
        }
        field_s = null;
        field_c = null;
        field_z = null;
        field_v = null;
    }

    final void a(boolean param0, int param1, int param2, jd param3, int param4, int param5) {
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        int[] stackIn_32_0 = null;
        int stackIn_35_0 = 0;
        int stackIn_75_0 = 0;
        int stackIn_78_0 = 0;
        RuntimeException stackIn_84_0 = null;
        StringBuilder stackIn_84_1 = null;
        RuntimeException stackIn_85_0 = null;
        StringBuilder stackIn_85_1 = null;
        String stackIn_85_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int[] var20 = null;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        bv var25 = null;
        int[] var26 = null;
        int[] var27 = null;
        var24 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              this.field_o = param2;
              this.field_p = param5;
              this.field_f = false;
              this.field_y = param4;
              stackIn_3_0 = this;

              if (this.field_o == param3.field_O) {
                stackIn_4_0 = this;
                stackIn_4_1 = 0;
                break L1;
              } else {
                stackIn_4_0 = this;
                stackIn_4_1 = 1;
                break L1;
              }
            }
            L2: {
              L3: {
                ((nn) (this)).field_a = stackIn_4_1 != 0;
                this.field_i = param3;
                stackIn_7_0 = this;

                if (!param0) {
                  break L3;
                } else {
                  stackIn_7_0 = this;

                  if (!this.field_a) {
                    break L3;
                  } else {
                    stackIn_8_0 = this;
                    stackIn_8_1 = 1;
                    break L2;
                  }
                }
              }
              stackIn_8_0 = this;
              stackIn_8_1 = 0;
              break L2;
            }
            L4: {
              ((nn) (this)).field_w = stackIn_8_1 != 0;
              if (param1 > 10) {
                break L4;
              } else {
                var25 = (bv) null;
                this.a(true, (bv) null);
                break L4;
              }
            }
            L5: {
              this.field_d = this.field_i.field_N;
              var7_int = this.field_i.B(3257);
              var8 = this.field_i.l((byte) -79);
              this.a(0);
              if ((this.field_p ^ -1) >= 0) {
                break L5;
              } else {
                if (24 == uc.field_d[this.field_p][5]) {
                  this.a(false, uc.field_d[this.field_p][6], 93);
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  break L5;
                }
              }
            }
            if ((this.field_d ^ -1) != -52) {
              L6: {
                L7: {
                  var9 = this.c(27732);
                  var10 = this.field_i.field_J;
                  var11 = this.field_i.field_J;
                  var12 = this.field_i.field_w;
                  var13 = this.field_i.field_w;
                  this.field_q[this.field_i.field_J - -(this.field_x * this.field_i.field_w)] = 0;
                  this.field_k[this.field_i.field_J - -(this.field_x * this.field_i.field_w)] = 0;
                  if (!this.field_i.field_W) {
                    break L7;
                  } else {
                    if (-1 == (this.field_i.field_N ^ -1)) {
                      break L7;
                    } else {
                      break L6;
                    }
                  }
                }
                var14 = 0;
                L8: while (true) {
                  if (var14 >= 500) {
                    break L6;
                  } else {
                    var15 = 0;
                    var16 = 0;
                    var17 = 0;
                    L9: while (true) {
                      if (var17 >= this.field_x) {
                        if (0 != var15) {
                          var14++;
                          continue L8;
                        } else {
                          break L6;
                        }
                      } else {
                        var18 = 0;
                        L10: while (true) {
                          if (var18 >= this.field_A) {
                            var17++;
                            continue L9;
                          } else {
                            var19 = 0;
                            L11: while (true) {
                              if (var19 >= 2) {
                                var16++;
                                var18++;
                                continue L10;
                              } else {
                                L12: {
                                  if (var19 == 0) {
                                    stackIn_32_0 = this.field_q;
                                    break L12;
                                  } else {
                                    stackIn_32_0 = this.field_k;
                                    break L12;
                                  }
                                }
                                L13: {
                                  var27 = stackIn_32_0;
                                  var26 = var27;
                                  var20 = var26;
                                  if ((var19 ^ -1) != -2) {
                                    stackIn_35_0 = 0;
                                    break L13;
                                  } else {
                                    stackIn_35_0 = 1;
                                    break L13;
                                  }
                                }
                                L14: {
                                  var21 = stackIn_35_0;
                                  var22 = 1000000;
                                  if ((var18 ^ -1) < -1) {
                                    var23 = this.field_r.a(this.field_i, var21 != 0, 14336, true, var16, -1 + var16, this.field_i.field_O);
                                    if (var22 <= var23 + var20[-1 + var16]) {
                                      break L14;
                                    } else {
                                      var22 = var23 + var20[-1 + var16];
                                      if (var11 >= var18) {
                                        break L14;
                                      } else {
                                        if (var9 >= var22) {
                                          var11 = var18;
                                          break L14;
                                        } else {
                                          break L14;
                                        }
                                      }
                                    }
                                  } else {
                                    break L14;
                                  }
                                }
                                L15: {
                                  if ((var17 ^ -1) >= -1) {
                                    break L15;
                                  } else {
                                    var23 = this.field_r.a(this.field_i, var21 != 0, 14336, true, var16, -this.field_x + var16, this.field_i.field_O);
                                    if (-1 <= (var17 ^ -1)) {
                                      break L15;
                                    } else {
                                      if (var20[var16 - this.field_x] - -var23 >= var22) {
                                        break L15;
                                      } else {
                                        var22 = var20[var16 - this.field_x] + var23;
                                        break L15;
                                      }
                                    }
                                  }
                                }
                                L16: {
                                  if (var18 >= -1 + this.field_x) {
                                    break L16;
                                  } else {
                                    var23 = this.field_r.a(this.field_i, var21 != 0, 14336, true, var16, var16 - -1, this.field_i.field_O);
                                    if (var22 <= var20[var16 - -1] - -var23) {
                                      break L16;
                                    } else {
                                      var22 = var20[var16 - -1] - -var23;
                                      break L16;
                                    }
                                  }
                                }
                                L17: {
                                  if (var17 >= this.field_A - 1) {
                                    break L17;
                                  } else {
                                    var23 = this.field_r.a(this.field_i, var21 != 0, 14336, true, var16, var16 - -this.field_x, this.field_i.field_O);
                                    if (var20[this.field_x + var16] - -var23 >= var22) {
                                      break L17;
                                    } else {
                                      var22 = var20[var16 + this.field_x] - -var23;
                                      break L17;
                                    }
                                  }
                                }
                                L18: {
                                  if (var22 < var27[var16]) {
                                    L19: {
                                      if (var10 <= var18) {
                                        break L19;
                                      } else {
                                        var10 = var18;
                                        break L19;
                                      }
                                    }
                                    L20: {
                                      if (var18 > var11) {
                                        var11 = var18;
                                        break L20;
                                      } else {
                                        break L20;
                                      }
                                    }
                                    L21: {
                                      if (var15 >= var22) {
                                        break L21;
                                      } else {
                                        var15 = var22;
                                        break L21;
                                      }
                                    }
                                    L22: {
                                      if (var17 <= var13) {
                                        break L22;
                                      } else {
                                        var13 = var17;
                                        break L22;
                                      }
                                    }
                                    var27[var16] = var22;
                                    if (var12 > var17) {
                                      var12 = var17;
                                      break L18;
                                    } else {
                                      break L18;
                                    }
                                  } else {
                                    break L18;
                                  }
                                }
                                var19++;
                                continue L11;
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
              L23: {
                if (4 != bw.field_m[param3.field_N][0]) {
                  stackIn_75_0 = 0;
                  break L23;
                } else {
                  stackIn_75_0 = 1;
                  break L23;
                }
              }
              L24: {
                var14 = stackIn_75_0;
                if (!this.field_i.j((byte) 102)) {
                  stackIn_78_0 = 0;
                  break L24;
                } else {
                  stackIn_78_0 = 1;
                  break L24;
                }
              }
              L25: {
                L26: {
                  var15 = stackIn_78_0;
                  this.field_r.field_j.a(var8, var15 != 0, -1, var10, var13, this.field_i.field_O, this.field_a, this.field_q, var7_int, var11, var14 != 0, this.field_e, var9, var12);
                  if (!this.field_i.field_W) {
                    break L26;
                  } else {
                    if (this.field_i.field_N == 0) {
                      break L26;
                    } else {
                      this.field_q[this.field_i.field_J - -(this.field_i.field_w * this.field_x)] = 1000000;
                      break L25;
                    }
                  }
                }
                break L25;
              }
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              this.a(true, bw.field_m[this.field_d][3], 112);
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L27: {
            var7 = decompiledCaughtException;
            stackIn_84_0 = (RuntimeException) (var7);

            stackIn_84_1 = new StringBuilder().append("nn.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_85_0 = (RuntimeException) ((Object) stackIn_84_0);
              stackIn_85_1 = (StringBuilder) ((Object) stackIn_84_1);
              stackIn_85_2 = "null";
              break L27;
            } else {
              stackIn_85_0 = (RuntimeException) ((Object) stackIn_84_0);
              stackIn_85_1 = (StringBuilder) ((Object) stackIn_84_1);
              stackIn_85_2 = "{...}";
              break L27;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_85_0), stackIn_85_2 + ',' + param4 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    final mn a(int param0, int param1) {
        int[] var3;
        int var4_int;
        int var6;
        int[] var7;
        am var4;
        int var5;
        L0: {
          var6 = ArmiesOfGielinor.field_M ? 1 : 0;
          var7 = new int[this.field_m];
          var3 = var7;
          if (this.field_h == null) {
            var3 = new int[]{};
            break L0;
          } else {
            var4_int = 0;
            L1: while (true) {
              if (this.field_m <= var4_int) {
                break L0;
              } else {
                var7[var4_int] = this.field_h[var4_int];
                var4_int++;
                continue L1;
              }
            }
          }
        }
        var5 = 51 / ((-19 - param1) / 39);
        var4 = new am(param0, this.field_m, var3, this.field_i.field_J, this.field_i.field_w, this.field_l, this.field_j);
        if ((this.field_p ^ -1) < 0) {
          this.field_r.field_J = true;
          return (mn) ((Object) new to(new ra(this.field_p, var4), this.field_y, param0));
        } else {
          return (mn) ((Object) var4);
        }
    }

    final static void a(byte param0, ha param1) {
        RuntimeException stackIn_178_0 = null;
        StringBuilder stackIn_178_1 = null;
        RuntimeException stackIn_179_0 = null;
        StringBuilder stackIn_179_1 = null;
        String stackIn_179_2 = null;
        int decompiledRegionSelector0 = 0;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        ha var2 = null;
        int var2_int = 0;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        Random var13 = null;
        var12 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            if (-5 == (param1.field_cb ^ -1)) {
              var2 = param1;
              param1.field_db = 10;
              param1.field_Eb = new ne[100];
              var2.field_v = 10;
              var3 = 0;
              L1: while (true) {
                if (var3 >= 100) {
                  param1.field_t[0].a((byte) -119, (tc) (new jd(3, 3, 0, 0, 10, 10, 9, 0, 0, param1, 0, 0, -1, false, 0)));
                  param1.field_t[1].a((byte) -119, (tc) (new jd(6, 6, 0, 1, 10, 10, 9, 0, 0, param1, 0, 0, -1, false, 0)));
                  param1.a((byte) -110, param1.field_v, param1.field_db, param1.field_Eb);
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  L2: {
                    L3: {
                      L4: {
                        var4 = var3 % 10;
                        var5 = var3 / 10;
                        if (var4 == 1) {
                          break L4;
                        } else {
                          if (-9 != (var4 ^ -1)) {
                            break L3;
                          } else {
                            break L4;
                          }
                        }
                      }
                      L5: {
                        if (1 == var5) {
                          break L5;
                        } else {
                          if ((var5 ^ -1) != -9) {
                            break L3;
                          } else {
                            break L5;
                          }
                        }
                      }
                      param1.field_Eb[var3] = new ne(7, param1);
                      break L2;
                    }
                    L6: {
                      L7: {
                        L8: {
                          if (-2 == (var4 ^ -1)) {
                            break L8;
                          } else {
                            if (-9 != (var4 ^ -1)) {
                              break L7;
                            } else {
                              break L8;
                            }
                          }
                        }
                        if (-10 >= (var5 ^ -1)) {
                          break L7;
                        } else {
                          if (-1 > (var5 ^ -1)) {
                            break L6;
                          } else {
                            break L7;
                          }
                        }
                      }
                      L9: {
                        L10: {
                          if ((var5 ^ -1) == -2) {
                            break L10;
                          } else {
                            if (-9 != (var5 ^ -1)) {
                              break L9;
                            } else {
                              break L10;
                            }
                          }
                        }
                        if (var4 >= 9) {
                          break L9;
                        } else {
                          if (-1 > (var4 ^ -1)) {
                            break L6;
                          } else {
                            break L9;
                          }
                        }
                      }
                      L11: {
                        L12: {
                          if (2 == var4) {
                            break L12;
                          } else {
                            if (var4 != 7) {
                              break L11;
                            } else {
                              break L12;
                            }
                          }
                        }
                        L13: {
                          if (var5 == 2) {
                            break L13;
                          } else {
                            if (7 != var5) {
                              break L11;
                            } else {
                              break L13;
                            }
                          }
                        }
                        param1.field_Eb[var3] = new ne(9, param1);
                        break L2;
                      }
                      L14: {
                        L15: {
                          if ((var4 ^ -1) == -4) {
                            break L15;
                          } else {
                            if (-7 != (var4 ^ -1)) {
                              break L14;
                            } else {
                              break L15;
                            }
                          }
                        }
                        L16: {
                          if (-3 == (var5 ^ -1)) {
                            break L16;
                          } else {
                            if (-8 != (var5 ^ -1)) {
                              break L14;
                            } else {
                              break L16;
                            }
                          }
                        }
                        param1.field_Eb[var3] = new ne(8, param1);
                        break L2;
                      }
                      L17: {
                        L18: {
                          if (var4 == 2) {
                            break L18;
                          } else {
                            if (7 != var4) {
                              break L17;
                            } else {
                              break L18;
                            }
                          }
                        }
                        L19: {
                          if ((var5 ^ -1) == -4) {
                            break L19;
                          } else {
                            if (6 != var5) {
                              break L17;
                            } else {
                              break L19;
                            }
                          }
                        }
                        param1.field_Eb[var3] = new ne(8, param1);
                        break L2;
                      }
                      L20: {
                        L21: {
                          if (4 != var4) {
                            break L21;
                          } else {
                            if (var5 < 4) {
                              break L20;
                            } else {
                              break L21;
                            }
                          }
                        }
                        L22: {
                          if (-6 != (var4 ^ -1)) {
                            break L22;
                          } else {
                            if (-6 > (var5 ^ -1)) {
                              break L20;
                            } else {
                              break L22;
                            }
                          }
                        }
                        L23: {
                          L24: {
                            if (4 == var4) {
                              break L24;
                            } else {
                              if (5 != var4) {
                                break L23;
                              } else {
                                break L24;
                              }
                            }
                          }
                          L25: {
                            if (var5 == 4) {
                              break L25;
                            } else {
                              if (-6 == (var5 ^ -1)) {
                                break L25;
                              } else {
                                break L23;
                              }
                            }
                          }
                          param1.field_Eb[var3] = new ne(6, param1);
                          break L2;
                        }
                        param1.field_Eb[var3] = new ne(0, param1);
                        break L2;
                      }
                      param1.field_Eb[var3] = new ne(4, param1);
                      break L2;
                    }
                    L26: {
                      L27: {
                        if (-5 != (var4 ^ -1)) {
                          break L27;
                        } else {
                          if (var5 == 1) {
                            break L26;
                          } else {
                            break L27;
                          }
                        }
                      }
                      L28: {
                        if (5 != var4) {
                          break L28;
                        } else {
                          if (var5 == 8) {
                            break L26;
                          } else {
                            break L28;
                          }
                        }
                      }
                      param1.field_Eb[var3] = new ne(1, param1);
                      break L2;
                    }
                    param1.field_Eb[var3] = new ne(10, param1);
                    break L2;
                  }
                  var3++;
                  continue L1;
                }
              }
            } else {
              param1.field_Eb = new ne[param1.field_v * param1.field_db];
              var2_int = 0;
              L29: while (true) {
                if (var2_int >= param1.field_db * param1.field_v) {
                  L30: {
                    if (param0 > 40) {
                      break L30;
                    } else {
                      nn.b(69);
                      break L30;
                    }
                  }
                  L31: {
                    var13 = new Random((long)param1.field_jb);
                    var3 = 3;
                    var4 = 4 - -ns.a(false, 4, var13);
                    var5 = ns.a(false, 100, var13);
                    if (param1.field_hb == 0) {
                      if (10 > var5) {
                        var3 = 5;
                        break L31;
                      } else {
                        if (30 <= var5) {
                          if (-61 < (var5 ^ -1)) {
                            var3 = 1;
                            break L31;
                          } else {
                            if (-71 >= (var5 ^ -1)) {
                              break L31;
                            } else {
                              var3 = 6;
                              break L31;
                            }
                          }
                        } else {
                          var3 = 4;
                          break L31;
                        }
                      }
                    } else {
                      if (-3 != (param1.field_hb ^ -1)) {
                        if ((var5 ^ -1) <= -31) {
                          if (var5 >= 60) {
                            if (-81 < (var5 ^ -1)) {
                              var3 = 6;
                              break L31;
                            } else {
                              break L31;
                            }
                          } else {
                            var3 = 4;
                            break L31;
                          }
                        } else {
                          var3 = 0;
                          break L31;
                        }
                      } else {
                        if (-31 >= (var5 ^ -1)) {
                          if (60 > var5) {
                            var3 = 4;
                            break L31;
                          } else {
                            if (var5 < 80) {
                              var3 = 2;
                              break L31;
                            } else {
                              break L31;
                            }
                          }
                        } else {
                          var3 = 5;
                          break L31;
                        }
                      }
                    }
                  }
                  var6 = -1;
                  L32: while (true) {
                    if (var6 >= 2) {
                      var6 = 0;
                      L33: while (true) {
                        if (var6 >= param1.field_db * param1.field_v) {
                          L34: {
                            var6 = -1;
                            if (-6 != (var3 ^ -1)) {
                              break L34;
                            } else {
                              var6 = 3;
                              break L34;
                            }
                          }
                          var7 = -1;
                          L35: while (true) {
                            if (var7 >= 2) {
                              L36: {
                                if ((var3 ^ -1) == -3) {
                                  var6 = 5;
                                  break L36;
                                } else {
                                  break L36;
                                }
                              }
                              on.a(param1, var6, false, var13);
                              param1.a((byte) -119, param1.field_v, param1.field_db, param1.field_Eb);
                              decompiledRegionSelector0 = 1;
                              break L0;
                            } else {
                              var8 = -1;
                              L37: while (true) {
                                if (2 <= var8) {
                                  var7++;
                                  continue L35;
                                } else {
                                  L38: {
                                    L39: {
                                      var9 = 0;
                                      if (0 == var7) {
                                        break L39;
                                      } else {
                                        if (-1 != (var8 ^ -1)) {
                                          L40: {
                                            if (var7 == var8) {
                                              break L40;
                                            } else {
                                              var9 += 2;
                                              break L40;
                                            }
                                          }
                                          if ((var8 ^ -1) != -2) {
                                            break L38;
                                          } else {
                                            var9++;
                                            break L38;
                                          }
                                        } else {
                                          break L39;
                                        }
                                      }
                                    }
                                    L41: {
                                      L42: {
                                        var9 += 4;
                                        if (1 == var8) {
                                          break L42;
                                        } else {
                                          if (var7 == 1) {
                                            break L42;
                                          } else {
                                            break L41;
                                          }
                                        }
                                      }
                                      var9++;
                                      break L41;
                                    }
                                    if (var8 == 0) {
                                      var9 += 2;
                                      break L38;
                                    } else {
                                      break L38;
                                    }
                                  }
                                  L43: {
                                    L44: {
                                      if (-1 != (var7 ^ -1)) {
                                        break L44;
                                      } else {
                                        if (-1 != (var8 ^ -1)) {
                                          break L44;
                                        } else {
                                          break L43;
                                        }
                                      }
                                    }
                                    if (var9 < param1.field_W) {
                                      L45: {
                                        L46: {
                                          var10 = 20 * (1 + var7) - -10;
                                          var11 = 10 + 20 * (1 + var8);
                                          if (var7 == 0) {
                                            break L46;
                                          } else {
                                            if (var8 != 0) {
                                              var10 = var10 + (-1 + ns.a(false, 2, var13));
                                              var11 = var11 + (-1 + ns.a(false, 2, var13));
                                              break L45;
                                            } else {
                                              break L46;
                                            }
                                          }
                                        }
                                        var10 = 10 + (ns.a(false, 4, var13) + 5) * var7 + (20 + 20 * var7);
                                        var11 = 10 + var8 * (ns.a(false, 4, var13) + 5) + (20 + 20 * var8);
                                        break L45;
                                      }
                                      L47: while (true) {
                                        L48: {
                                          if (param1.field_Eb[param1.field_v * var11 + var10].field_h == 0) {
                                            break L48;
                                          } else {
                                            if (1 == param1.field_Eb[var10 + param1.field_v * var11].field_h) {
                                              break L48;
                                            } else {
                                              L49: {
                                                var11 = 20 + (var8 * 20 - -10);
                                                var10 = (1 + var7) * 20 + 10;
                                                if (var7 == 0) {
                                                  break L49;
                                                } else {
                                                  if (0 != var8) {
                                                    var10 = var10 + (ns.a(false, 4, var13) + -2);
                                                    var11 = var11 + (ns.a(false, 4, var13) - 2);
                                                    continue L47;
                                                  } else {
                                                    break L49;
                                                  }
                                                }
                                              }
                                              var10 = var7 * (ns.a(false, 4, var13) + 5) - -10 - (-20 + -(var7 * 20));
                                              var11 = (ns.a(false, 4, var13) + 5) * var8 - -10 - (-20 + -(20 * var8));
                                              continue L47;
                                            }
                                          }
                                        }
                                        param1.field_t[var9].a((byte) -119, (tc) (new jd(var10, var11, 0, var9, 10, 10, 9, 0, 0, param1, 0, 0, -1, false, 0)));
                                        break L43;
                                      }
                                    } else {
                                      var8++;
                                      continue L37;
                                    }
                                  }
                                  var8++;
                                  continue L37;
                                }
                              }
                            }
                          }
                        } else {
                          L50: {
                            if (param1.field_Eb[var6] == null) {
                              param1.field_Eb[var6] = new ne(0, param1);
                              break L50;
                            } else {
                              break L50;
                            }
                          }
                          var6++;
                          continue L33;
                        }
                      }
                    } else {
                      var7 = -1;
                      L51: while (true) {
                        if ((var7 ^ -1) <= -3) {
                          var6++;
                          continue L32;
                        } else {
                          L52: {
                            L53: {
                              if (var6 != 0) {
                                break L53;
                              } else {
                                if (-1 != (var7 ^ -1)) {
                                  break L53;
                                } else {
                                  ul.a(var13, param1, (byte) 85, var3);
                                  break L52;
                                }
                              }
                            }
                            L54: {
                              L55: {
                                var8 = var6 * 20 - -20 + 10;
                                var9 = 20 * (var7 + 1) + 10;
                                param1.field_Eb[param1.field_v * var9 + var8] = new ne(1, param1);
                                if (-1 == (var6 ^ -1)) {
                                  break L55;
                                } else {
                                  if (-1 == (var7 ^ -1)) {
                                    break L55;
                                  } else {
                                    var8 = var8 + (-1 + ns.a(false, 2, var13));
                                    var9 = var9 + (-1 + ns.a(false, 2, var13));
                                    break L54;
                                  }
                                }
                              }
                              var8 = var6 * (ns.a(false, 4, var13) + 5) - (-10 - (1 + var6) * 20);
                              var9 = (5 + ns.a(false, 4, var13)) * var7 + 10 + 20 * (var7 - -1);
                              break L54;
                            }
                            L56: {
                              param1.field_Eb[param1.field_v * var9 + var8] = new ne(7, param1);
                              if (0 != var3) {
                                fi.a(var8, (byte) 101, 1, var9, 20 * (var6 + 1) + 10, false, (var7 + 1) * 20 + 10, param1, var13);
                                break L56;
                              } else {
                                break L56;
                              }
                            }
                            var10 = 0;
                            L57: while (true) {
                              if (var10 >= var4) {
                                break L52;
                              } else {
                                L58: while (true) {
                                  L59: {
                                    if (null == param1.field_Eb[var9 * param1.field_v + var8]) {
                                      break L59;
                                    } else {
                                      if ((param1.field_Eb[var8 - -(param1.field_v * var9)].field_h ^ -1) == -1) {
                                        break L59;
                                      } else {
                                        if (-2 == (param1.field_Eb[var9 * param1.field_v + var8].field_h ^ -1)) {
                                          break L59;
                                        } else {
                                          var8 = ns.a(false, 7, var13) * 2 + (20 * (var6 + 1) + 3);
                                          var9 = (1 + var7) * 20 - (-(2 * ns.a(false, 7, var13)) - 3);
                                          continue L58;
                                        }
                                      }
                                    }
                                  }
                                  L60: {
                                    param1.field_Eb[var8 + var9 * param1.field_v] = new ne(8, param1);
                                    if (var3 == 0) {
                                      break L60;
                                    } else {
                                      qp.a(var9, 20 * (1 + var6) + 10, -1, var7 * 20 - -30, var8, 0, param1, 1, var13);
                                      break L60;
                                    }
                                  }
                                  var10++;
                                  continue L57;
                                }
                              }
                            }
                          }
                          var7++;
                          continue L51;
                        }
                      }
                    }
                  }
                } else {
                  param1.field_Eb[var2_int] = null;
                  var2_int++;
                  continue L29;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L61: {
            var2_ref = decompiledCaughtException;
            stackIn_178_0 = (RuntimeException) (var2_ref);

            stackIn_178_1 = new StringBuilder().append("nn.H(").append(param0).append(',');

            if (param1 == null) {
              stackIn_179_0 = (RuntimeException) ((Object) stackIn_178_0);
              stackIn_179_1 = (StringBuilder) ((Object) stackIn_178_1);
              stackIn_179_2 = "null";
              break L61;
            } else {
              stackIn_179_0 = (RuntimeException) ((Object) stackIn_178_0);
              stackIn_179_1 = (StringBuilder) ((Object) stackIn_178_1);
              stackIn_179_2 = "{...}";
              break L61;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_179_0), stackIn_179_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final int a(boolean param0, bv param1) {
        int stackIn_7_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_20_0 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              if (!this.field_t) {
                break L1;
              } else {
                if (!this.field_u) {
                  break L1;
                } else {
                  L2: {
                    var3_int = 6;
                    if (0 <= (this.field_p ^ -1)) {
                      param1.h(32161, 65);
                      param1.b(1, var3_int);
                      break L2;
                    } else {
                      param1.h(32161, 65);
                      param1.b(1, var3_int + 4);
                      param1.b(1, 160);
                      param1.b(1, this.field_y);
                      param1.b(true, this.field_p);
                      break L2;
                    }
                  }
                  param1.b(1, 0);
                  param1.b(1, 0);
                  param1.b(1, this.field_i.field_J);
                  param1.b(1, this.field_i.field_w);
                  pd.a(this.field_l, this.field_j, param1, 127);
                  stackIn_7_0 = var3_int;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            }
            L3: {
              if (null == this.field_h) {
                this.field_m = 0;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (0 < this.field_m % 4) {
                stackIn_14_0 = 1;
                break L4;
              } else {
                stackIn_14_0 = 0;
                break L4;
              }
            }
            L5: {
              var3_int = stackIn_14_0 + (6 + this.field_m / 4);
              if (0 <= (this.field_p ^ -1)) {
                param1.h(32161, 65);
                param1.b(1, var3_int);
                break L5;
              } else {
                param1.h(32161, 65);
                param1.b(1, 4 + var3_int);
                param1.b(1, 160);
                param1.b(1, this.field_y);
                param1.b(true, this.field_p);
                this.field_r.field_J = true;
                break L5;
              }
            }
            L6: {
              param1.b(1, this.field_m >> -963064696 | 0);
              param1.b(1, this.field_m & 255);
              param1.b(1, this.field_i.field_J);
              param1.b(1, this.field_i.field_w);
              jj.a((byte) -27, this.field_m, param1, this.field_h);
              if (param0) {
                break L6;
              } else {
                this.a(-21);
                break L6;
              }
            }
            pd.a(this.field_l, this.field_j, param1, -78);
            stackIn_20_0 = var3_int;
            decompiledRegionSelector0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3 = decompiledCaughtException;
            stackIn_23_0 = (RuntimeException) (var3);

            stackIn_23_1 = new StringBuilder().append("nn.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L7;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L7;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_7_0;
        } else {
          return stackIn_20_0;
        }
    }

    private final void a(int param0) {
        int var2 = 0;
        int var3 = ArmiesOfGielinor.field_M ? 1 : 0;
        for (var2 = param0; this.field_q.length > var2; var2++) {
            this.field_q[var2] = 1000000;
            this.field_k[var2] = 1000000;
            this.field_e[var2] = 0;
        }
    }

    nn(ha param0) {
        this.field_y = -1;
        this.field_p = -1;
        try {
            this.field_r = param0;
            this.field_A = this.field_r.field_db;
            this.field_x = this.field_r.field_v;
            this.field_q = new int[this.field_A * this.field_x];
            this.field_k = new int[this.field_x * this.field_A];
            this.field_e = new int[this.field_x * this.field_A];
            this.a(0);
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "nn.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_s = "Show chat (<%0> unread messages)";
        field_c = new me(7, 0, 1, 1);
        field_v = "You can only use a further <%0> runes of trinkets in this game. This trinket is worth <%1>.";
        field_z = new dl(1);
    }
}
