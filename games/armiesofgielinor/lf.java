/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class lf {
    boolean field_l;
    private boolean field_u;
    int field_s;
    private gd field_A;
    private int field_C;
    static double field_b;
    private int field_w;
    boolean field_e;
    private int[] field_k;
    private int field_G;
    int field_a;
    int field_D;
    boolean field_d;
    boolean field_H;
    private int[] field_F;
    private vj field_x;
    static wk[] field_h;
    private boolean field_B;
    private int[] field_r;
    private boolean field_n;
    int field_j;
    private int field_y;
    private int field_J;
    int field_p;
    int field_m;
    int field_f;
    private int[] field_I;
    private int[] field_o;
    private int[] field_z;
    static String field_v;
    private boolean field_E;
    static pq field_q;
    static java.awt.Font field_g;
    static at field_c;
    static int[] field_i;
    static int field_t;

    final void d(byte param0) {
        int stackIn_9_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_10_1 = 0;
        int stackIn_56_0 = 0;
        int stackIn_57_0 = 0;
        int stackIn_57_1 = 0;
        int stackIn_66_0 = 0;
        int stackIn_66_1 = 0;
        int stackIn_67_0 = 0;
        int stackIn_67_1 = 0;
        int stackIn_67_2 = 0;
        int stackIn_80_0 = 0;
        int stackIn_81_0 = 0;
        int stackIn_81_1 = 0;
        int stackIn_84_0 = 0;
        int stackIn_84_1 = 0;
        int stackIn_85_0 = 0;
        int stackIn_85_1 = 0;
        int stackIn_85_2 = 0;
        int stackIn_90_0 = 0;
        int stackIn_90_1 = 0;
        int stackIn_91_0 = 0;
        int stackIn_91_1 = 0;
        int stackIn_91_2 = 0;
        int stackIn_97_0 = 0;
        int stackIn_98_0 = 0;
        int stackIn_98_1 = 0;
        int stackIn_100_0 = 0;
        int stackIn_100_1 = 0;
        int stackIn_101_0 = 0;
        int stackIn_101_1 = 0;
        int stackIn_101_2 = 0;
        int stackIn_108_0 = 0;
        int stackIn_108_1 = 0;
        int stackIn_109_0 = 0;
        int stackIn_109_1 = 0;
        int stackIn_109_2 = 0;
        int stackIn_111_0 = 0;
        int stackIn_112_0 = 0;
        int stackIn_112_1 = 0;
        int stackIn_118_0 = 0;
        int stackIn_118_1 = 0;
        int stackIn_119_0 = 0;
        int stackIn_119_1 = 0;
        int stackIn_119_2 = 0;
        int stackIn_125_0 = 0;
        int stackIn_126_0 = 0;
        int stackIn_126_1 = 0;
        int stackIn_131_0 = 0;
        int stackIn_132_0 = 0;
        int stackIn_132_1 = 0;
        int stackIn_147_0 = 0;
        int stackIn_148_0 = 0;
        int stackIn_148_1 = 0;
        int stackIn_152_0 = 0;
        int stackIn_153_0 = 0;
        int stackIn_153_1 = 0;
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        L0: {
          var9 = ArmiesOfGielinor.field_M ? 1 : 0;
          this.a((byte) -118);
          this.field_J = this.field_J + 1;
          var2 = 8;
          var3 = -this.field_j + this.field_a;
          var4 = -this.field_p + this.field_s;
          if (param0 == 113) {
            break L0;
          } else {
            this.a(78, -75);
            break L0;
          }
        }
        L1: {
          var5 = (int)Math.sqrt((double)(var4 * var4 + var3 * var3));
          if (-5 == (this.field_D ^ -1)) {
            if (var2 < var5) {
              this.field_s = this.field_s - var4 * var2 / var5;
              this.field_a = this.field_a - var2 * var3 / var5;
              if (this.field_J % 20 != 0) {
                break L1;
              } else {
                L2: {
                  stackIn_9_0 = this.field_s;

                  if (!this.field_u) {
                    stackIn_10_0 = stackIn_9_0;
                    stackIn_10_1 = 1;
                    break L2;
                  } else {
                    stackIn_10_0 = stackIn_9_0;
                    stackIn_10_1 = -1;
                    break L2;
                  }
                }
                jg.a(stackIn_10_0, stackIn_10_1 * this.field_a, 512, 0, this.field_C);
                this.field_J = this.field_J + ns.a(false, 10, li.field_n);
                break L1;
              }
            } else {
              this.field_s = this.field_p;
              this.field_a = this.field_j;
              this.a(0, (byte) -93);
              break L1;
            }
          } else {
            break L1;
          }
        }
        L3: {
          if ((this.field_D ^ -1) == -8) {
            this.field_s = this.field_p;
            this.field_a = this.field_j;
            break L3;
          } else {
            break L3;
          }
        }
        L4: {
          if (this.field_D == 0) {
            L5: {
              if (0 != var3) {
                break L5;
              } else {
                if (-1 != (var4 ^ -1)) {
                  break L5;
                } else {
                  if (this.field_D != 0) {
                    break L4;
                  } else {
                    if (0 == (this.field_f ^ -1)) {
                      break L4;
                    } else {
                      this.field_m = this.field_m - 1;
                      if (0 < this.field_m) {
                        break L4;
                      } else {
                        this.a(this.field_f, (byte) -124);
                        this.field_f = -1;
                        break L4;
                      }
                    }
                  }
                }
              }
            }
            L6: {
              if (-40 == (this.field_C ^ -1)) {
                break L6;
              } else {
                if (-52 != (this.field_C ^ -1)) {
                  this.a(4, (byte) -107);
                  break L4;
                } else {
                  break L6;
                }
              }
            }
            this.a(6, (byte) -125);
            break L4;
          } else {
            if (this.field_D != 0) {
              break L4;
            } else {
              if (0 == (this.field_f ^ -1)) {
                break L4;
              } else {
                this.field_m = this.field_m - 1;
                if (0 < this.field_m) {
                  break L4;
                } else {
                  this.a(this.field_f, (byte) -124);
                  this.field_f = -1;
                  break L4;
                }
              }
            }
          }
        }
        L7: {
          L8: {
            var6 = this.field_y;
            if (!this.field_d) {
              break L8;
            } else {
              if (2 != this.field_D) {
                break L8;
              } else {
                var6 = 7;
                break L7;
              }
            }
          }
          if (this.field_D == 4) {
            var6 = 2;
            break L7;
          } else {
            if (-7 != (this.field_D ^ -1)) {
              if (-8 != (this.field_D ^ -1)) {
                if (-2 == (this.field_D ^ -1)) {
                  var6 = 3;
                  break L7;
                } else {
                  if (2 != this.field_D) {
                    if (3 == this.field_D) {
                      var6 = 4;
                      break L7;
                    } else {
                      if (-6 == (this.field_D ^ -1)) {
                        var6 = 5;
                        break L7;
                      } else {
                        var6 = 0;
                        break L7;
                      }
                    }
                  } else {
                    var6 = 6;
                    break L7;
                  }
                }
              } else {
                var6 = 1;
                break L7;
              }
            } else {
              var6 = 2;
              break L7;
            }
          }
        }
        L9: {
          this.a(var6, 0);
          var7 = this.field_x.a(param0 ^ -13) ? 1 : 0;
          if (1 != this.field_D) {
            break L9;
          } else {
            break L9;
          }
        }
        L10: {
          L11: {
            if (this.field_J != je.field_K[this.field_G][1]) {
              break L11;
            } else {
              if ((this.field_D ^ -1) != -4) {
                break L11;
              } else {
                if (this.field_B) {
                  break L11;
                } else {
                  L12: {
                    stackIn_56_0 = this.field_s;

                    if (this.field_u) {
                      stackIn_57_0 = stackIn_56_0;
                      stackIn_57_1 = -1;
                      break L12;
                    } else {
                      stackIn_57_0 = stackIn_56_0;
                      stackIn_57_1 = 1;
                      break L12;
                    }
                  }
                  jg.a(stackIn_57_0, stackIn_57_1 * this.field_a, 512, 7, this.field_C);
                  this.field_B = true;
                  this.field_l = true;
                  break L10;
                }
              }
            }
          }
          if (3 != this.field_D) {
            break L10;
          } else {
            L13: {
              if (-1 < (je.field_K[this.field_G][1] ^ -1)) {
                break L13;
              } else {
                if (this.field_F[this.field_D] < je.field_K[this.field_G][1]) {
                  break L10;
                } else {
                  break L13;
                }
              }
            }
            if (!this.field_B) {
              L14: {
                stackIn_66_0 = this.field_s;

                stackIn_66_1 = this.field_a;

                if (!this.field_u) {
                  stackIn_67_0 = stackIn_66_0;
                  stackIn_67_1 = stackIn_66_1;
                  stackIn_67_2 = 1;
                  break L14;
                } else {
                  stackIn_67_0 = stackIn_66_0;
                  stackIn_67_1 = stackIn_66_1;
                  stackIn_67_2 = -1;
                  break L14;
                }
              }
              jg.a(stackIn_67_0, stackIn_67_1 * stackIn_67_2, 512, 7, this.field_C);
              this.field_B = true;
              this.field_l = true;
              break L10;
            } else {
              break L10;
            }
          }
        }
        L15: {
          L16: {
            if (this.field_J != je.field_K[this.field_G][0]) {
              break L16;
            } else {
              if (1 != this.field_D) {
                break L16;
              } else {
                if (!this.field_B) {
                  L17: {
                    stackIn_84_0 = this.field_s;

                    stackIn_84_1 = this.field_a;

                    if (this.field_u) {
                      stackIn_85_0 = stackIn_84_0;
                      stackIn_85_1 = stackIn_84_1;
                      stackIn_85_2 = -1;
                      break L17;
                    } else {
                      stackIn_85_0 = stackIn_84_0;
                      stackIn_85_1 = stackIn_84_1;
                      stackIn_85_2 = 1;
                      break L17;
                    }
                  }
                  jg.a(stackIn_85_0, stackIn_85_1 * stackIn_85_2, 512, 4, this.field_C);
                  this.field_e = true;
                  this.field_B = true;
                  break L15;
                } else {
                  break L16;
                }
              }
            }
          }
          if (this.field_D != 1) {
            break L15;
          } else {
            L18: {
              if (je.field_K[this.field_G][0] < 0) {
                break L18;
              } else {
                if (je.field_K[this.field_G][0] > this.field_F[this.field_D]) {
                  break L15;
                } else {
                  break L18;
                }
              }
            }
            if (!this.field_B) {
              L19: {
                stackIn_80_0 = this.field_s;

                if (this.field_u) {
                  stackIn_81_0 = stackIn_80_0;
                  stackIn_81_1 = -1;
                  break L19;
                } else {
                  stackIn_81_0 = stackIn_80_0;
                  stackIn_81_1 = 1;
                  break L19;
                }
              }
              jg.a(stackIn_81_0, stackIn_81_1 * this.field_a, 512, 4, this.field_C);
              this.field_e = true;
              this.field_B = true;
              break L15;
            } else {
              break L15;
            }
          }
        }
        L20: {
          if (1 != this.field_J) {
            break L20;
          } else {
            if (-2 != (this.field_D ^ -1)) {
              break L20;
            } else {
              L21: {
                stackIn_90_0 = this.field_s;

                stackIn_90_1 = this.field_a;

                if (this.field_u) {
                  stackIn_91_0 = stackIn_90_0;
                  stackIn_91_1 = stackIn_90_1;
                  stackIn_91_2 = -1;
                  break L21;
                } else {
                  stackIn_91_0 = stackIn_90_0;
                  stackIn_91_1 = stackIn_90_1;
                  stackIn_91_2 = 1;
                  break L21;
                }
              }
              jg.a(stackIn_91_0, stackIn_91_1 * stackIn_91_2, 512, 3, this.field_C);
              break L20;
            }
          }
        }
        L22: {
          if (1 != this.field_J) {
            break L22;
          } else {
            if ((this.field_D ^ -1) != -3) {
              break L22;
            } else {
              if (!this.field_d) {
                break L22;
              } else {
                L23: {
                  stackIn_97_0 = this.field_s;

                  if (this.field_u) {
                    stackIn_98_0 = stackIn_97_0;
                    stackIn_98_1 = -1;
                    break L23;
                  } else {
                    stackIn_98_0 = stackIn_97_0;
                    stackIn_98_1 = 1;
                    break L23;
                  }
                }
                L24: {
                  jg.a(stackIn_98_0, stackIn_98_1 * this.field_a, 512, 5, this.field_C);
                  stackIn_100_0 = this.field_s;

                  stackIn_100_1 = this.field_a;

                  if (this.field_u) {
                    stackIn_101_0 = stackIn_100_0;
                    stackIn_101_1 = stackIn_100_1;
                    stackIn_101_2 = -1;
                    break L24;
                  } else {
                    stackIn_101_0 = stackIn_100_0;
                    stackIn_101_1 = stackIn_100_1;
                    stackIn_101_2 = 1;
                    break L24;
                  }
                }
                jg.a(stackIn_101_0, stackIn_101_1 * stackIn_101_2, 512, 2, this.field_C);
                break L22;
              }
            }
          }
        }
        L25: {
          if (1 != this.field_J) {
            break L25;
          } else {
            if (2 != this.field_D) {
              break L25;
            } else {
              if (!this.field_d) {
                L26: {
                  stackIn_108_0 = this.field_s;

                  stackIn_108_1 = this.field_a;

                  if (this.field_u) {
                    stackIn_109_0 = stackIn_108_0;
                    stackIn_109_1 = stackIn_108_1;
                    stackIn_109_2 = -1;
                    break L26;
                  } else {
                    stackIn_109_0 = stackIn_108_0;
                    stackIn_109_1 = stackIn_108_1;
                    stackIn_109_2 = 1;
                    break L26;
                  }
                }
                L27: {
                  jg.a(stackIn_109_0, stackIn_109_1 * stackIn_109_2, param0 ^ 625, 1, this.field_C);
                  stackIn_111_0 = this.field_s;

                  if (!this.field_u) {
                    stackIn_112_0 = stackIn_111_0;
                    stackIn_112_1 = 1;
                    break L27;
                  } else {
                    stackIn_112_0 = stackIn_111_0;
                    stackIn_112_1 = -1;
                    break L27;
                  }
                }
                jg.a(stackIn_112_0, stackIn_112_1 * this.field_a, 512, 2, this.field_C);
                break L25;
              } else {
                break L25;
              }
            }
          }
        }
        L28: {
          if ((this.field_J ^ -1) != -2) {
            break L28;
          } else {
            if (this.field_D == 5) {
              L29: {
                stackIn_118_0 = this.field_s;

                stackIn_118_1 = this.field_a;

                if (this.field_u) {
                  stackIn_119_0 = stackIn_118_0;
                  stackIn_119_1 = stackIn_118_1;
                  stackIn_119_2 = -1;
                  break L29;
                } else {
                  stackIn_119_0 = stackIn_118_0;
                  stackIn_119_1 = stackIn_118_1;
                  stackIn_119_2 = 1;
                  break L29;
                }
              }
              jg.a(stackIn_119_0, stackIn_119_1 * stackIn_119_2, param0 ^ 625, 6, this.field_C);
              break L28;
            } else {
              break L28;
            }
          }
        }
        L30: {
          if (1 != this.field_J) {
            break L30;
          } else {
            if (-8 == (this.field_D ^ -1)) {
              L31: {
                stackIn_125_0 = this.field_s;

                if (!this.field_u) {
                  stackIn_126_0 = stackIn_125_0;
                  stackIn_126_1 = 1;
                  break L31;
                } else {
                  stackIn_126_0 = stackIn_125_0;
                  stackIn_126_1 = -1;
                  break L31;
                }
              }
              jg.a(stackIn_126_0, stackIn_126_1 * this.field_a, 512, 0, this.field_C);
              break L30;
            } else {
              break L30;
            }
          }
        }
        L32: {
          if (-2 != (this.field_J ^ -1)) {
            break L32;
          } else {
            if (-7 != (this.field_D ^ -1)) {
              break L32;
            } else {
              L33: {
                stackIn_131_0 = this.field_s;

                if (!this.field_u) {
                  stackIn_132_0 = stackIn_131_0;
                  stackIn_132_1 = 1;
                  break L33;
                } else {
                  stackIn_132_0 = stackIn_131_0;
                  stackIn_132_1 = -1;
                  break L33;
                }
              }
              jg.a(stackIn_132_0, stackIn_132_1 * this.field_a, param0 + 399, 5, this.field_C);
              break L32;
            }
          }
        }
        L34: {
          this.a(param0 ^ -313055231);
          if (var7 != 0) {
            this.field_J = 0;
            if (this.field_y != 5) {
              if (this.field_y != 7) {
                if (this.field_D == 6) {
                  this.a(7, (byte) -122);
                  break L34;
                } else {
                  if ((this.field_D ^ -1) == -4) {
                    L35: {
                      if (this.field_B) {
                        break L35;
                      } else {
                        L36: {
                          stackIn_152_0 = this.field_s;

                          if (this.field_u) {
                            stackIn_153_0 = stackIn_152_0;
                            stackIn_153_1 = -1;
                            break L36;
                          } else {
                            stackIn_153_0 = stackIn_152_0;
                            stackIn_153_1 = 1;
                            break L36;
                          }
                        }
                        jg.a(stackIn_153_0, stackIn_153_1 * this.field_a, 512, 7, this.field_C);
                        this.field_l = true;
                        break L35;
                      }
                    }
                    this.a(0, (byte) -94);
                    break L34;
                  } else {
                    if (this.field_D == 1) {
                      if (!this.field_B) {
                        L37: {
                          stackIn_147_0 = this.field_s;

                          if (this.field_u) {
                            stackIn_148_0 = stackIn_147_0;
                            stackIn_148_1 = -1;
                            break L37;
                          } else {
                            stackIn_148_0 = stackIn_147_0;
                            stackIn_148_1 = 1;
                            break L37;
                          }
                        }
                        jg.a(stackIn_148_0, stackIn_148_1 * this.field_a, param0 ^ 625, 4, this.field_C);
                        this.field_e = true;
                        this.a(0, (byte) -94);
                        break L34;
                      } else {
                        this.a(0, (byte) -94);
                        break L34;
                      }
                    } else {
                      this.a(0, (byte) -94);
                      break L34;
                    }
                  }
                }
              } else {
                this.field_H = true;
                break L34;
              }
            } else {
              this.a(5, (byte) -86);
              this.field_E = true;
              break L34;
            }
          } else {
            break L34;
          }
        }
        var8 = 0;
        L38: while (true) {
          if (var8 >= lb.field_a) {
            return;
          } else {
            if (0 < this.field_k[var8]) {
              this.field_k[var8] = this.field_k[var8] - 1;
              this.field_z[var8] = this.field_z[var8] + this.field_o[var8];
              this.field_I[var8] = this.field_I[var8] + this.field_r[var8];
              this.field_r[var8] = this.field_r[var8] - 10000;
              var8++;
              continue L38;
            } else {
              var8++;
              continue L38;
            }
          }
        }
    }

    private final void a(int param0, int param1) {
        int var3;
        L0: {
          L1: {
            var3 = 0;
            if (param0 != this.field_y) {
              break L1;
            } else {
              if (this.field_E) {
                break L1;
              } else {
                break L0;
              }
            }
          }
          if (0 == (param0 ^ -1)) {
            break L0;
          } else {
            if (param0 < 0) {
              break L0;
            } else {
              if (param0 < 9) {
                var3 = 1;
                this.field_E = false;
                this.field_y = param0;
                break L0;
              } else {
                break L0;
              }
            }
          }
        }
        L2: {
          L3: {
            if ((this.field_y ^ -1) == param1) {
              break L3;
            } else {
              if (this.field_y < 0) {
                break L3;
              } else {
                if (-10 < (this.field_y ^ -1)) {
                  break L2;
                } else {
                  break L3;
                }
              }
            }
          }
          this.field_y = 0;
          var3 = 1;
          break L2;
        }
        L4: {
          if (var3 != 0) {
            this.d(-82);
            this.field_J = 0;
            this.field_B = false;
            break L4;
          } else {
            break L4;
          }
        }
    }

    final boolean b(int param0) {
        int stackIn_6_0 = 0;
        L0: {
          if (param0 == 2166) {
            break L0;
          } else {
            this.d(-90);
            break L0;
          }
        }
        L1: {
          L2: {
            if (this.field_j != this.field_a) {
              break L2;
            } else {
              if (this.field_p != this.field_s) {
                break L2;
              } else {
                stackIn_6_0 = 1;
                break L1;
              }
            }
          }
          stackIn_6_0 = 0;
          break L1;
        }
        return stackIn_6_0 != 0;
    }

    private final void d(int param0) {
        this.field_x.a(-1, pg.a(this.field_y, 176, true, this.field_G));
        this.a(-313055120);
        if (param0 > -77) {
            this.a(-77, 60);
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, byte param6) {
        int var8 = 0;
        int var9 = ArmiesOfGielinor.field_M ? 1 : 0;
        this.field_w = param2;
        if (param6 != 122) {
            this.field_o = (int[]) null;
        }
        for (var8 = 0; lb.field_a > var8; var8++) {
            this.field_z[var8] = param4 << -1562478256;
            this.field_I[var8] = param5 << 1783781008;
            this.field_k[var8] = ns.a(false, param1 >> 1979902561, li.field_n) + param1;
            this.field_o[var8] = (!this.field_u ? 1 : -1) * (param3 << -975881424) + (int)(Math.sin((double)ns.a(false, 256, li.field_n) * 3.141592653589793 / 128.0) * 10000.0 * (double)(param1 - -ns.a(false, param1 >> 1900142497, li.field_n)));
            this.field_r[var8] = (int)(10000.0 * Math.sin(3.141592653589793 * (double)ns.a(false, 256, li.field_n) / 128.0) * (double)(ns.a(false, param1 >> 1521418817, li.field_n) + param1)) + (param0 << -1748970832);
        }
    }

    final static wk[] a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        int var9;
        wk[] var10;
        wk[] var11_ref_wk__;
        int var11;
        int var12;
        wk var13;
        int var14;
        int var15;
        var15 = ArmiesOfGielinor.field_M ? 1 : 0;
        var9 = param7 - -param1 + param3;
        var10 = new wk[]{new wk(var9, var9), new wk(param4, var9), new wk(var9, var9), new wk(var9, param4), new wk(64, 64), new wk(var9, param4), new wk(var9, var9), new wk(param4, var9), new wk(var9, var9)};
        var11_ref_wk__ = var10;
        var12 = 0;
        L0: while (true) {
          if (var11_ref_wk__.length <= var12) {
            var10 = var11_ref_wk__;
            var11 = 0;
            L1: while (true) {
              if (var11 >= param7) {
                L2: {
                  if (param6 == -1) {
                    break L2;
                  } else {
                    field_g = (java.awt.Font) null;
                    break L2;
                  }
                }
                var11 = 0;
                L3: while (true) {
                  if (var11 >= param7) {
                    var11 = 0;
                    L4: while (true) {
                      if (param4 <= var11) {
                        var11 = 0;
                        L5: while (true) {
                          if (var11 >= param4 >> 1726971617) {
                            return var10;
                          } else {
                            var12 = 0;
                            L6: while (true) {
                              if (param3 > var12) {
                                var10[1].field_B[var11 + param4 * (var9 - (var12 - -1))] = param8;
                                var10[3].field_B[var9 * var11 - (var12 + (1 + -var9))] = param8;
                                var10[7].field_B[param4 * var12 + var11] = param8;
                                var10[5].field_B[var11 * var9 + var12] = param8;
                                var12++;
                                continue L6;
                              } else {
                                var11++;
                                continue L5;
                              }
                            }
                          }
                        }
                      } else {
                        var12 = 0;
                        L7: while (true) {
                          if (param7 <= var12) {
                            var11++;
                            continue L4;
                          } else {
                            var10[7].field_B[var11 + (-1 + -var12 + var9) * param4] = param2;
                            var10[5].field_B[-1 + var9 - (var12 - var11 * var9)] = param2;
                            var10[1].field_B[var12 * param4 + var11] = param0;
                            var10[3].field_B[var12 + var11 * var9] = param0;
                            var12++;
                            continue L7;
                          }
                        }
                      }
                    }
                  } else {
                    var12 = 0;
                    L8: while (true) {
                      if (var12 < var9) {
                        var10[0].field_B[var11 * var9 + var12] = param0;
                        var10[0].field_B[var9 * var12 + var11] = param0;
                        if ((var12 ^ -1) > (var9 - var11 ^ -1)) {
                          var10[2].field_B[var12 - -(var11 * var9)] = param0;
                          var10[6].field_B[var11 + var9 * var12] = param0;
                          var12++;
                          continue L8;
                        } else {
                          var12++;
                          continue L8;
                        }
                      } else {
                        var11++;
                        continue L3;
                      }
                    }
                  }
                }
              } else {
                var12 = 0;
                L9: while (true) {
                  if (var9 > var12) {
                    var10[6].field_B[var12 + var9 * (-1 + -var11 + var9)] = param2;
                    var10[8].field_B[var12 + var9 * (-1 + var9 - var11)] = param2;
                    var10[2].field_B[-1 - -var9 + (-var11 + var9 * var12)] = param2;
                    var10[8].field_B[var9 * var12 - (-var9 + (1 - -var11))] = param2;
                    var12++;
                    continue L9;
                  } else {
                    var11++;
                    continue L1;
                  }
                }
              }
            }
          } else {
            var13 = var11_ref_wk__[var12];
            var14 = 0;
            L10: while (true) {
              if (var13.field_B.length <= var14) {
                var12++;
                continue L0;
              } else {
                var13.field_B[var14] = param5;
                var14++;
                continue L10;
              }
            }
          }
        }
    }

    final void a(int param0, int param1, boolean param2) {
        int stackIn_12_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_20_1 = 0;
        gd stackIn_26_0;
        int stackIn_26_1;
        int stackIn_26_2;
        int stackIn_26_3;
        int stackIn_26_4;
        int stackIn_26_5;
        gd stackIn_27_0 = null;
        int stackIn_27_1 = 0;
        int stackIn_27_2 = 0;
        int stackIn_27_3 = 0;
        int stackIn_27_4 = 0;
        int stackIn_27_5 = 0;
        int stackIn_27_6 = 0;
        int stackIn_30_5;
        int stackIn_30_6;
        gd stackIn_31_0 = null;
        int stackIn_31_1 = 0;
        int stackIn_31_2 = 0;
        int stackIn_31_3 = 0;
        int stackIn_31_4 = 0;
        int stackIn_31_5 = 0;
        int stackIn_31_6 = 0;
        int stackIn_31_7 = 0;
        int stackIn_41_0 = 0;
        int stackIn_42_0 = 0;
        int stackIn_42_1 = 0;
        int stackIn_44_2;
        int[] stackIn_44_3;
        int stackIn_45_2 = 0;
        int[] stackIn_45_3 = null;
        int stackIn_45_4 = 0;
        int stackIn_47_5;
        int stackIn_48_5;
        int stackIn_48_6;
        int stackIn_55_0 = 0;
        wk stackIn_55_1 = null;
        int stackIn_56_0 = 0;
        wk stackIn_56_1 = null;
        int stackIn_56_2 = 0;
        int stackIn_58_3;
        int stackIn_59_3;
        int stackIn_59_4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        gd var13;
        var11 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (null != this.field_A) {
          L0: {
            var13 = (gd) ((Object) this.field_x.a(false, true, false, this.field_A));
            if (this.field_G == 75) {
              var13.b(250, 250, 250);
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            if (-77 != (this.field_G ^ -1)) {
              break L1;
            } else {
              var13.b(512, 512, 512);
              break L1;
            }
          }
          L2: {
            var5 = 0;
            if (param1 < -30) {
              break L2;
            } else {
              this.d((byte) -56);
              break L2;
            }
          }
          L3: {
            if (this.field_u) {
              stackIn_12_0 = 1536;
              break L3;
            } else {
              stackIn_12_0 = 512;
              break L3;
            }
          }
          L4: {
            var6 = stackIn_12_0;
            var7 = 0;
            var8 = 150;
            if (4 == this.field_D) {
              L5: {
                var9 = -this.field_j + this.field_a;
                var10 = -this.field_p + this.field_s;
                if (0 != var9) {
                  break L5;
                } else {
                  if (var10 == 0) {
                    break L4;
                  } else {
                    break L5;
                  }
                }
              }
              L6: {
                stackIn_19_0 = (int)(1024.0 * Math.atan2((double)var9, (double)var10) / 3.141592653589793);

                if (!this.field_u) {
                  stackIn_20_0 = stackIn_19_0;
                  stackIn_20_1 = 1;
                  break L6;
                } else {
                  stackIn_20_0 = stackIn_19_0;
                  stackIn_20_1 = -1;
                  break L6;
                }
              }
              var6 = th.a(stackIn_20_0 * stackIn_20_1, 1, 2048);
              break L4;
            } else {
              break L4;
            }
          }
          L7: {
            if (param2) {
              np.a(false, var13);
              break L7;
            } else {
              break L7;
            }
          }
          L8: {
            stackIn_26_0 = (gd) (var13);

            stackIn_26_1 = var5;

            stackIn_26_2 = var6;

            stackIn_26_3 = var7;

            stackIn_26_4 = var8;

            stackIn_26_5 = this.field_a;

            if (!this.field_u) {
              stackIn_27_0 = (gd) ((Object) stackIn_26_0);
              stackIn_27_1 = stackIn_26_1;
              stackIn_27_2 = stackIn_26_2;
              stackIn_27_3 = stackIn_26_3;
              stackIn_27_4 = stackIn_26_4;
              stackIn_27_5 = stackIn_26_5;
              stackIn_27_6 = 1;
              break L8;
            } else {
              stackIn_27_0 = (gd) ((Object) stackIn_26_0);
              stackIn_27_1 = stackIn_26_1;
              stackIn_27_2 = stackIn_26_2;
              stackIn_27_3 = stackIn_26_3;
              stackIn_27_4 = stackIn_26_4;
              stackIn_27_5 = stackIn_26_5;
              stackIn_27_6 = -1;
              break L8;
            }
          }
          L9: {
            L10: {
              stackIn_27_0 = (gd) ((Object) stackIn_27_0);

              stackIn_30_5 = stackIn_27_5 * stackIn_27_6;

              stackIn_30_6 = 600;

              if (param2) {
                break L10;
              } else {
                stackIn_27_0 = (gd) ((Object) stackIn_27_0);

                if (!this.field_n) {
                  break L10;
                } else {
                  stackIn_31_0 = (gd) ((Object) stackIn_27_0);
                  stackIn_31_1 = stackIn_27_1;
                  stackIn_31_2 = stackIn_27_2;
                  stackIn_31_3 = stackIn_27_3;
                  stackIn_31_4 = stackIn_27_4;
                  stackIn_31_5 = stackIn_30_5;
                  stackIn_31_6 = stackIn_30_6;
                  stackIn_31_7 = 100;
                  break L9;
                }
              }
            }
            stackIn_31_0 = (gd) ((Object) stackIn_27_0);
            stackIn_31_1 = stackIn_27_1;
            stackIn_31_2 = stackIn_27_2;
            stackIn_31_3 = stackIn_27_3;
            stackIn_31_4 = stackIn_27_4;
            stackIn_31_5 = stackIn_30_5;
            stackIn_31_6 = stackIn_30_6;
            stackIn_31_7 = 0;
            break L9;
          }
          L11: {
            ((gd) (Object) stackIn_31_0).a(stackIn_31_1, stackIn_31_2, stackIn_31_3, stackIn_31_4, stackIn_31_5, stackIn_31_6 + -stackIn_31_7, this.field_s);
            if (param2) {
              break L11;
            } else {
              if (-2 == (this.field_w ^ -1)) {
                var9 = 0;
                L12: while (true) {
                  if (var9 >= lb.field_a) {
                    break L11;
                  } else {
                    if (0 < this.field_k[var9]) {
                      L13: {
                        stackIn_55_0 = this.field_s;

                        stackIn_55_1 = hs.field_F[this.field_k[var9] % hs.field_F.length];

                        if (255 < this.field_k[var9] << -1999166908) {
                          stackIn_56_0 = stackIn_55_0;
                          stackIn_56_1 = (wk) ((Object) stackIn_55_1);
                          stackIn_56_2 = 256;
                          break L13;
                        } else {
                          stackIn_56_0 = stackIn_55_0;
                          stackIn_56_1 = (wk) ((Object) stackIn_55_1);
                          stackIn_56_2 = this.field_k[var9] << -473583964;
                          break L13;
                        }
                      }
                      L14: {






                        stackIn_58_3 = 122;

                        if (!this.field_u) {

                          stackIn_56_1 = (wk) ((Object) stackIn_56_1);

                          stackIn_59_3 = stackIn_58_3;
                          stackIn_59_4 = 1;
                          break L14;
                        } else {

                          stackIn_56_1 = (wk) ((Object) stackIn_56_1);

                          stackIn_59_3 = stackIn_58_3;
                          stackIn_59_4 = -1;
                          break L14;
                        }
                      }
                      cb.a(stackIn_56_0, stackIn_56_1, stackIn_56_2, stackIn_59_3, stackIn_59_4 * (this.field_a + -(this.field_z[var9] >> 1418222800)), -(this.field_I[var9] >> -573417424) + 600);
                      var9++;
                      continue L12;
                    } else {
                      var9++;
                      continue L12;
                    }
                  }
                }
              } else {
                if (-1 == (this.field_w ^ -1)) {
                  var9 = bw.field_m[this.field_C][1] - -1;
                  var12 = 0;
                  var10 = var12;
                  L15: while (true) {
                    if (var12 >= lb.field_a) {
                      break L11;
                    } else {
                      if (-1 > (this.field_k[var12] ^ -1)) {
                        L16: {
                          stackIn_41_0 = 600 - (this.field_I[var12] >> -1589941776);

                          if (255 >= this.field_k[var12] << 2138602468) {
                            stackIn_42_0 = stackIn_41_0;
                            stackIn_42_1 = this.field_k[var12] << 1374925124;
                            break L16;
                          } else {
                            stackIn_42_0 = stackIn_41_0;
                            stackIn_42_1 = 256;
                            break L16;
                          }
                        }
                        L17: {




                          stackIn_44_2 = 56;

                          stackIn_44_3 = fe.field_o[var9];

                          if ((this.field_k[var12] << -1035630844 ^ -1) >= -64) {


                            stackIn_45_2 = stackIn_44_2;
                            stackIn_45_3 = (int[]) ((Object) stackIn_44_3);
                            stackIn_45_4 = this.field_k[var12] << 779997412;
                            break L17;
                          } else {


                            stackIn_45_2 = stackIn_44_2;
                            stackIn_45_3 = (int[]) ((Object) stackIn_44_3);
                            stackIn_45_4 = 63;
                            break L17;
                          }
                        }
                        L18: {










                          stackIn_47_5 = this.field_a + -(this.field_z[var12] >> -1986112688);

                          if (!this.field_u) {



                            stackIn_45_3 = (int[]) ((Object) stackIn_45_3);

                            stackIn_48_5 = stackIn_47_5;
                            stackIn_48_6 = 1;
                            break L18;
                          } else {



                            stackIn_45_3 = (int[]) ((Object) stackIn_45_3);

                            stackIn_48_5 = stackIn_47_5;
                            stackIn_48_6 = -1;
                            break L18;
                          }
                        }
                        fh.a(stackIn_42_0, stackIn_42_1, (byte) stackIn_45_2, stackIn_45_3, stackIn_45_4, stackIn_48_5 * stackIn_48_6, this.field_s);
                        var12++;
                        continue L15;
                      } else {
                        var12++;
                        continue L15;
                      }
                    }
                  }
                } else {
                  break L11;
                }
              }
            }
          }
          return;
        } else {
          return;
        }
    }

    final boolean b(byte param0) {
        int var2;
        int stackIn_4_0 = 0;
        L0: {
          L1: {
            var2 = -118 / ((param0 - -7) / 36);
            if (this.field_D != 0) {
              break L1;
            } else {
              if (this.field_f != -1) {
                break L1;
              } else {
                stackIn_4_0 = 1;
                break L0;
              }
            }
          }
          stackIn_4_0 = 0;
          break L0;
        }
        return stackIn_4_0 != 0;
    }

    public static void c(int param0) {
        field_i = null;
        field_v = null;
        field_q = null;
        field_c = null;
        field_g = null;
        field_h = null;
        if (param0 != -1) {
            field_g = (java.awt.Font) null;
        }
    }

    private final void a(byte param0) {
        int stackIn_57_0 = 0;
        int var2;
        vj var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        var8 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (param0 < -85) {
          L0: {
            if (this.field_D == 1) {
              break L0;
            } else {
              if (3 == this.field_D) {
                break L0;
              } else {
                return;
              }
            }
          }
          L1: {
            if (null == this.field_F) {
              break L1;
            } else {
              if (-1 < (this.field_D ^ -1)) {
                break L1;
              } else {
                if (this.field_D >= this.field_F.length) {
                  break L1;
                } else {
                  L2: {
                    if (0 > this.field_F[this.field_D]) {
                      L3: {
                        var2 = -1;
                        if (1 == this.field_D) {
                          var2 = 3;
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                      L4: {
                        if (this.field_D != 3) {
                          break L4;
                        } else {
                          var2 = 4;
                          break L4;
                        }
                      }
                      L5: {
                        if (var2 < 0) {
                          break L5;
                        } else {
                          if (this.field_y == var2) {
                            L6: {
                              if (aw.field_j == null) {
                                break L6;
                              } else {
                                if (this.field_G < 0) {
                                  break L6;
                                } else {
                                  if (aw.field_j.length > this.field_G) {
                                    L7: {
                                      if (aw.field_j[this.field_G] == null) {
                                        break L7;
                                      } else {
                                        if (0 > var2) {
                                          break L7;
                                        } else {
                                          if (var2 >= aw.field_j[this.field_G].length) {
                                            break L7;
                                          } else {
                                            L8: {
                                              if (aw.field_j[this.field_G][this.field_y] == null) {
                                                break L8;
                                              } else {
                                                if (-1 != (aw.field_j[this.field_G][this.field_y].length ^ -1)) {
                                                  if (-1 < (aw.field_j[this.field_G][this.field_y][0] ^ -1)) {
                                                    this.field_F[this.field_D] = 0;
                                                    return;
                                                  } else {
                                                    L9: {
                                                      if (null == ck.field_e) {
                                                        break L9;
                                                      } else {
                                                        if (null == sf.field_P) {
                                                          break L9;
                                                        } else {
                                                          if (0 > this.field_G) {
                                                            break L9;
                                                          } else {
                                                            if (sf.field_P.length <= this.field_G) {
                                                              break L9;
                                                            } else {
                                                              L10: {
                                                                if (-1 < (sf.field_P[this.field_G] ^ -1)) {
                                                                  break L10;
                                                                } else {
                                                                  if (sf.field_P[this.field_G] < ck.field_e.length) {
                                                                    L11: {
                                                                      if (null == ck.field_e[sf.field_P[this.field_G]]) {
                                                                        break L11;
                                                                      } else {
                                                                        if (aw.field_j[this.field_G][this.field_y][0] < 0) {
                                                                          break L11;
                                                                        } else {
                                                                          if (aw.field_j[this.field_G][this.field_y][0] < ck.field_e[sf.field_P[this.field_G]].length) {
                                                                            var3 = new vj();
                                                                            this.a(-313055120);
                                                                            var3.a(-1, ck.field_e[sf.field_P[this.field_G]][aw.field_j[this.field_G][this.field_y][0]]);
                                                                            var4 = 0;
                                                                            var5 = 0;
                                                                            var6 = 10000;
                                                                            var7 = 0;
                                                                            L12: while (true) {
                                                                              L13: {
                                                                                if (!var3.a(-111)) {
                                                                                  stackIn_57_0 = 0;
                                                                                  break L13;
                                                                                } else {
                                                                                  stackIn_57_0 = 1;
                                                                                  break L13;
                                                                                }
                                                                              }
                                                                              L14: {
                                                                                var5 = stackIn_57_0;
                                                                                var7++;
                                                                                if (!var3.field_c) {
                                                                                  break L14;
                                                                                } else {
                                                                                  var4++;
                                                                                  break L14;
                                                                                }
                                                                              }
                                                                              if (var6 > var7) {
                                                                                L15: {
                                                                                  if (var5 != 0) {
                                                                                    break L15;
                                                                                  } else {
                                                                                    if (!var3.field_c) {
                                                                                      continue L12;
                                                                                    } else {
                                                                                      if (0 != var3.field_m) {
                                                                                        continue L12;
                                                                                      } else {
                                                                                        break L15;
                                                                                      }
                                                                                    }
                                                                                  }
                                                                                }
                                                                                this.field_F[this.field_D] = var4;
                                                                                break L2;
                                                                              } else {
                                                                                this.field_F[this.field_D] = 0;
                                                                                return;
                                                                              }
                                                                            }
                                                                          } else {
                                                                            break L11;
                                                                          }
                                                                        }
                                                                      }
                                                                    }
                                                                    this.field_F[this.field_D] = 0;
                                                                    return;
                                                                  } else {
                                                                    break L10;
                                                                  }
                                                                }
                                                              }
                                                              this.field_F[this.field_D] = 0;
                                                              return;
                                                            }
                                                          }
                                                        }
                                                      }
                                                    }
                                                    this.field_F[this.field_D] = 0;
                                                    return;
                                                  }
                                                } else {
                                                  break L8;
                                                }
                                              }
                                            }
                                            this.field_F[this.field_D] = 0;
                                            return;
                                          }
                                        }
                                      }
                                    }
                                    this.field_F[this.field_D] = 0;
                                    return;
                                  } else {
                                    break L6;
                                  }
                                }
                              }
                            }
                            this.field_F[this.field_D] = 0;
                            return;
                          } else {
                            break L5;
                          }
                        }
                      }
                      this.field_F[this.field_D] = 0;
                      return;
                    } else {
                      break L2;
                    }
                  }
                  return;
                }
              }
            }
          }
          return;
        } else {
          return;
        }
    }

    final void a(int param0, byte param1) {
        if (param1 > -83) {
            this.field_l = false;
        }
        this.field_D = param0;
    }

    private final void a(int param0) {
        int var2 = this.field_x.field_i >> -313055120;
        wp var3 = we.a(var2, true);
        io.a(var3, (byte) -34);
        if (param0 != -313055120) {
            return;
        }
    }

    final void c(byte param0) {
        this.a(3, (byte) -91);
        this.field_E = true;
        if (param0 != 102) {
            lf.a(-71, 76, -87, 82, -108, 110, 13, -61, -101);
        }
    }

    final static om a(cf param0, bv param1, kl param2, byte param3) {
        om var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        om stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var5 = -81 % ((param3 - 51) / 60);
            var4 = na.a(param1, 44);
            var4.field_G = param0;
            var4.field_H = param2;
            stackIn_1_0 = (om) (var4);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4_ref = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var4_ref);

            stackIn_4_1 = new StringBuilder().append("lf.A(");

            if (param0 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "null";
              break L1;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_7_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(',');

            if (param1 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L2;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',');

            if (param2 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_5_0), stackIn_11_2 + ',' + param3 + ')');
        }
        return stackIn_1_0;
    }

    lf(int param0, boolean param1, int param2, int param3, boolean param4, int param5) {
        Object stackIn_15_0 = null;
        Object stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        int var7;
        int var8;
        L0: {
          this.field_D = 0;
          this.field_d = false;
          this.field_H = false;
          this.field_m = 0;
          this.field_f = -1;
          this.field_w = -1;
          this.field_x = new vj(1);
          this.field_C = param0;
          this.field_G = param0;
          if ((param0 ^ -1) != -44) {
            break L0;
          } else {
            this.field_G = 77;
            break L0;
          }
        }
        L1: {
          if (param4) {
            break L1;
          } else {
            L2: {
              if (16 != param0) {
                break L2;
              } else {
                this.field_G = 78;
                break L2;
              }
            }
            L3: {
              if (25 != param0) {
                break L3;
              } else {
                this.field_G = 79;
                break L3;
              }
            }
            L4: {
              if (48 != param0) {
                break L4;
              } else {
                this.field_G = 80;
                break L4;
              }
            }
            if (param0 != 85) {
              break L1;
            } else {
              this.field_G = 89;
              break L1;
            }
          }
        }
        L5: {
          var7 = ns.a(false, mn.field_k[this.field_G].length, li.field_n);
          this.field_A = (gd) ((Object) mn.field_k[this.field_G][var7]);
          if (null != this.field_A) {
            break L5;
          } else {
            af.a((Throwable) null, 100, "BattleCharacter: no model found - model_index: " + this.field_G + " variation: " + var7);
            break L5;
          }
        }
        L6: {
          this.field_n = nh.field_D[this.field_G];
          this.field_a = param2 - -param5;
          this.field_z = new int[lb.field_a];
          this.field_k = new int[lb.field_a];
          stackIn_15_0 = this;

          if (!param1) {
            stackIn_16_0 = this;
            stackIn_16_1 = 0;
            break L6;
          } else {
            stackIn_16_0 = this;
            stackIn_16_1 = 1;
            break L6;
          }
        }
        ((lf) (this)).field_u = stackIn_16_1 != 0;
        this.field_I = new int[lb.field_a];
        this.field_J = 0;
        this.field_j = param2;
        this.field_p = param3;
        this.field_s = param3;
        this.field_y = 0;
        this.field_r = new int[lb.field_a];
        this.field_o = new int[lb.field_a];
        this.d(-104);
        this.field_F = new int[4];
        var8 = 0;
        L7: while (true) {
          if (var8 >= this.field_F.length) {
            return;
          } else {
            this.field_F[var8] = -1;
            var8++;
            continue L7;
          }
        }
    }

    static {
        field_b = Math.atan2(1.0, 0.0);
        field_v = "The magic of creating Mana.";
        field_q = new pq();
        field_c = new at();
        field_i = new int[]{0, 25, 75, 150, 0};
        field_t = -7;
    }
}
