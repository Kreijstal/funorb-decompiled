/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ql {
    private int field_d;
    private double[] field_z;
    private boolean field_c;
    boolean field_j;
    private int field_y;
    private int field_h;
    private int field_l;
    private hn field_i;
    private int field_w;
    private double field_r;
    private int field_v;
    int field_n;
    static va field_k;
    int field_q;
    double field_b;
    int field_e;
    static int field_u;
    int field_o;
    int field_p;
    static String field_t;
    private int field_f;
    static String field_A;
    private int field_x;
    private int field_s;
    private double[] field_g;
    int field_m;
    double field_B;
    private int[] field_a;

    public static void b(int param0) {
        if (param0 != 14293) {
            field_A = (String) null;
        }
        field_A = null;
        field_t = null;
        field_k = null;
    }

    final static void a(int param0, kg param1, int param2, byte param3, int param4) {
        try {
            param1.f(param3 ^ 119, 12);
            param1.c(17, param3 ^ 32);
            param1.c(param2, 8);
            if (param3 != 40) {
                field_u = 11;
            }
            param1.c(param0, 8);
            param1.f(127, param4);
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) ((Object) runtimeException), "ql.I(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static void a(boolean param0) {
        sd.field_f = null;
        if (param0) {
            return;
        }
        rj.field_f = (byte[][]) null;
        jl.field_p = null;
        ij.field_r = null;
        an.field_p = null;
        rg.field_I = null;
    }

    final void b(int param0, int param1) {
        if (!(8 != param0)) {
            this.field_s = this.field_s + 1;
        }
        if (!(-17 != (param0 ^ -1))) {
            this.field_x = this.field_x + 1;
        }
        if ((param0 ^ -1) == -18) {
            this.field_d = this.field_d + 1;
        }
        if (param1 < 43) {
            return;
        }
        if (param0 == 15) {
            this.field_w = this.field_w + 1;
        }
        if (!(param0 != 13)) {
            this.field_j = false;
        }
        if (-8 == (param0 ^ -1)) {
            this.field_l = this.field_l + 1;
        }
        if (!((param0 ^ -1) != -10)) {
            this.field_m = 1 + this.field_o;
            if (this.field_i.field_Q != null) {
                this.field_e = 1 + this.field_o;
            }
        }
    }

    final boolean a(int param0, int param1) {
        int stackIn_7_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_35_0 = 0;
        int stackIn_49_0 = 0;
        int stackIn_56_0 = 0;
        int stackIn_61_0 = 0;
        int stackIn_66_0 = 0;
        int stackIn_71_0 = 0;
        int stackIn_76_0 = 0;
        int stackIn_82_0 = 0;
        int stackIn_90_0 = 0;
        int var3;
        int var4;
        int var5;
        var5 = Confined.field_J ? 1 : 0;
        if (this.field_o < wl.field_c[param1]) {
          return false;
        } else {
          if (param1 != 0) {
            if (param1 == 1) {
              L0: {
                if (this.field_i.field_B.field_Eb) {
                  stackIn_13_0 = 0;
                  break L0;
                } else {
                  stackIn_13_0 = 1;
                  break L0;
                }
              }
              return stackIn_13_0 != 0;
            } else {
              if (param1 != 2) {
                if (param1 != 3) {
                  if (5 == param1) {
                    L1: {
                      if (this.field_i.field_B.field_eb) {
                        stackIn_29_0 = 0;
                        break L1;
                      } else {
                        stackIn_29_0 = 1;
                        break L1;
                      }
                    }
                    return stackIn_29_0 != 0;
                  } else {
                    if ((param1 ^ -1) == param0) {
                      L2: {
                        if (this.field_i.field_B.field_rb) {
                          stackIn_35_0 = 0;
                          break L2;
                        } else {
                          stackIn_35_0 = 1;
                          break L2;
                        }
                      }
                      return stackIn_35_0 != 0;
                    } else {
                      if ((param1 ^ -1) == -7) {
                        var3 = 0;
                        var4 = 0;
                        L3: while (true) {
                          if (5 <= var4) {
                            L4: {
                              if ((var3 ^ -1) <= -6) {
                                stackIn_49_0 = 0;
                                break L4;
                              } else {
                                if (this.field_o < qi.field_h[var3]) {
                                  stackIn_49_0 = 0;
                                  break L4;
                                } else {
                                  stackIn_49_0 = 1;
                                  break L4;
                                }
                              }
                            }
                            return stackIn_49_0 != 0;
                          } else {
                            if (this.field_i.field_B.field_Nb[var4] != null) {
                              var3++;
                              var4++;
                              continue L3;
                            } else {
                              var4++;
                              continue L3;
                            }
                          }
                        }
                      } else {
                        if (-15 != (param1 ^ -1)) {
                          if (8 != param1) {
                            if (-8 != (param1 ^ -1)) {
                              if ((param1 ^ -1) != -16) {
                                if (-17 != (param1 ^ -1)) {
                                  if (-18 == (param1 ^ -1)) {
                                    L5: {
                                      if (this.field_i.field_h < 10000 + 10000 * this.field_d) {
                                        stackIn_82_0 = 0;
                                        break L5;
                                      } else {
                                        stackIn_82_0 = 1;
                                        break L5;
                                      }
                                    }
                                    return stackIn_82_0 != 0;
                                  } else {
                                    if ((param1 ^ -1) != -10) {
                                      if ((param1 ^ -1) == -14) {
                                        return this.field_j;
                                      } else {
                                        return true;
                                      }
                                    } else {
                                      L6: {
                                        L7: {
                                          if (this.field_m <= this.field_o) {
                                            break L7;
                                          } else {
                                            L8: {
                                              if (this.field_i.field_Q == null) {
                                                break L8;
                                              } else {
                                                if (this.field_e > this.field_o) {
                                                  break L8;
                                                } else {
                                                  break L7;
                                                }
                                              }
                                            }
                                            stackIn_90_0 = 0;
                                            break L6;
                                          }
                                        }
                                        stackIn_90_0 = 1;
                                        break L6;
                                      }
                                      return stackIn_90_0 != 0;
                                    }
                                  }
                                } else {
                                  L9: {
                                    if (this.field_i.field_h < this.field_x * 20000 + 25000) {
                                      stackIn_76_0 = 0;
                                      break L9;
                                    } else {
                                      stackIn_76_0 = 1;
                                      break L9;
                                    }
                                  }
                                  return stackIn_76_0 != 0;
                                }
                              } else {
                                L10: {
                                  if (this.field_i.field_h < this.field_w * 40000 + 35000) {
                                    stackIn_71_0 = 0;
                                    break L10;
                                  } else {
                                    stackIn_71_0 = 1;
                                    break L10;
                                  }
                                }
                                return stackIn_71_0 != 0;
                              }
                            } else {
                              L11: {
                                if (this.field_i.field_h < 40000 * this.field_l + 55000) {
                                  stackIn_66_0 = 0;
                                  break L11;
                                } else {
                                  stackIn_66_0 = 1;
                                  break L11;
                                }
                              }
                              return stackIn_66_0 != 0;
                            }
                          } else {
                            L12: {
                              if (this.field_i.field_h < 20000 + 20000 * this.field_s) {
                                stackIn_61_0 = 0;
                                break L12;
                              } else {
                                stackIn_61_0 = 1;
                                break L12;
                              }
                            }
                            return stackIn_61_0 != 0;
                          }
                        } else {
                          if (16384 < this.field_i.field_B.field_Bb.field_d) {
                            L13: {
                              var3 = -8 + this.field_i.field_B.field_Bb.field_b;
                              if (var3 >= this.a(-2)) {
                                stackIn_56_0 = 0;
                                break L13;
                              } else {
                                stackIn_56_0 = 1;
                                break L13;
                              }
                            }
                            return stackIn_56_0 != 0;
                          } else {
                            return true;
                          }
                        }
                      }
                    }
                  }
                } else {
                  L14: {
                    if (this.field_i.field_B.field_cb) {
                      stackIn_23_0 = 0;
                      break L14;
                    } else {
                      stackIn_23_0 = 1;
                      break L14;
                    }
                  }
                  return stackIn_23_0 != 0;
                }
              } else {
                L15: {
                  if (this.field_i.field_B.field_Sb) {
                    stackIn_18_0 = 0;
                    break L15;
                  } else {
                    stackIn_18_0 = 1;
                    break L15;
                  }
                }
                return stackIn_18_0 != 0;
              }
            }
          } else {
            L16: {
              if (this.field_i.field_B.field_mb) {
                stackIn_7_0 = 0;
                break L16;
              } else {
                stackIn_7_0 = 1;
                break L16;
              }
            }
            return stackIn_7_0 != 0;
          }
        }
    }

    final void a(int param0, boolean param1) {
        int stackIn_28_0 = 0;
        int stackIn_36_0 = 0;
        int[] stackIn_83_0 = null;
        int stackIn_83_1 = 0;
        int[] stackIn_84_0 = null;
        int stackIn_84_1 = 0;
        int stackIn_84_2 = 0;
        int[] stackIn_86_0 = null;
        int stackIn_86_1 = 0;
        int[] stackIn_87_0 = null;
        int stackIn_87_1 = 0;
        int stackIn_87_2 = 0;
        int[] stackIn_89_0 = null;
        int stackIn_89_1 = 0;
        int[] stackIn_90_0 = null;
        int stackIn_90_1 = 0;
        int stackIn_90_2 = 0;
        int[] stackIn_92_0 = null;
        int stackIn_92_1 = 0;
        int[] stackIn_93_0 = null;
        int stackIn_93_1 = 0;
        int stackIn_93_2 = 0;
        Object stackIn_136_0 = null;
        Object stackIn_137_0 = null;
        Object stackIn_138_0 = null;
        int stackIn_138_1 = 0;
        int var3;
        int var4;
        int var5_int;
        double[] var5;
        int var6;
        L0: {
          var6 = Confined.field_J ? 1 : 0;
          if (!param1) {
            break L0;
          } else {
            if (h.field_R != null) {
              h.field_R.b(ig.field_j[this.field_o], 32);
              break L0;
            } else {
              break L0;
            }
          }
        }
        L1: {
          if (-21 != (this.field_o ^ -1)) {
            break L1;
          } else {
            if (!this.field_i.field_t) {
              di.a(param0 + -43498, 238, 17);
              break L1;
            } else {
              break L1;
            }
          }
        }
        if ((this.field_o ^ -1) < -25) {
          L2: {
            this.field_i.field_K = new un(this.field_i);
            sg.f((byte) 122);
            if (!this.field_i.field_v) {
              di.a(-30867, 237, 18);
              break L2;
            } else {
              break L2;
            }
          }
          L3: {
            if (pa.field_c) {
              di.a(param0 + -43498, 249, 6);
              break L3;
            } else {
              break L3;
            }
          }
          if ((this.field_i.field_B.field_ab ^ -1) > -5) {
            return;
          } else {
            di.a(-30867, 239, 16);
            return;
          }
        } else {
          this.field_i.field_x.a((byte) -123, (ql) (this));
          var3 = 0;
          var4 = 0;
          this.field_f = -1 + this.field_o >> -1902696766;
          this.field_c = true;
          if (param0 == 12631) {
            L4: {
              if ((this.field_f ^ -1) > -5) {
                break L4;
              } else {
                this.field_f = 3;
                break L4;
              }
            }
            L5: {
              this.field_b = 0.0020833333333333333 * (double)this.field_o + 0.02;
              if (-17 >= (this.field_o ^ -1)) {
                L6: {
                  if ((this.field_o ^ -1) == -17) {
                    break L6;
                  } else {
                    if ((this.field_o ^ -1) == -21) {
                      break L6;
                    } else {
                      if (this.field_o == 23) {
                        break L6;
                      } else {
                        var3 = 50;
                        var4 = 100;
                        break L5;
                      }
                    }
                  }
                }
                L7: {
                  var3 = 20;
                  if (pa.field_c) {
                    stackIn_36_0 = 1000;
                    break L7;
                  } else {
                    stackIn_36_0 = 600;
                    break L7;
                  }
                }
                var4 = stackIn_36_0;
                this.field_c = false;
                break L5;
              } else {
                if (0 == (3 & this.field_o)) {
                  L8: {
                    if (!pa.field_c) {
                      stackIn_28_0 = 600;
                      break L8;
                    } else {
                      stackIn_28_0 = 1000;
                      break L8;
                    }
                  }
                  var4 = stackIn_28_0;
                  break L5;
                } else {
                  var3 = 50;
                  break L5;
                }
              }
            }
            L9: {
              this.field_q = 1;
              if ((this.field_o ^ -1) <= -4) {
                this.field_q = 2;
                break L9;
              } else {
                break L9;
              }
            }
            L10: {
              L11: {
                L12: {
                  if (9 > this.field_o) {
                    break L12;
                  } else {
                    if ((this.field_o ^ -1) >= -12) {
                      break L11;
                    } else {
                      break L12;
                    }
                  }
                }
                if (15 == this.field_o) {
                  break L11;
                } else {
                  if (21 > this.field_o) {
                    break L10;
                  } else {
                    break L11;
                  }
                }
              }
              var3 = var3 >> 1;
              break L10;
            }
            L13: {
              if (11 > this.field_o) {
                if (-11 < (this.field_o ^ -1)) {
                  if (-10 >= (this.field_o ^ -1)) {
                    this.field_q = 8;
                    break L13;
                  } else {
                    break L13;
                  }
                } else {
                  this.field_q = 9;
                  break L13;
                }
              } else {
                this.field_q = this.field_q | 8;
                break L13;
              }
            }
            L14: {
              if (2 > this.field_o) {
                break L14;
              } else {
                this.field_q = this.field_q | 16384;
                break L14;
              }
            }
            L15: {
              if (6 > this.field_o) {
                break L15;
              } else {
                this.field_q = this.field_q | 32768;
                break L15;
              }
            }
            L16: {
              if (7 <= this.field_o) {
                this.field_q = this.field_q | 16;
                break L16;
              } else {
                break L16;
              }
            }
            L17: {
              if (-14 < (this.field_o ^ -1)) {
                break L17;
              } else {
                this.field_q = this.field_q | 64;
                break L17;
              }
            }
            L18: {
              if (-16 >= (this.field_o ^ -1)) {
                this.field_q = this.field_q | 128;
                break L18;
              } else {
                break L18;
              }
            }
            L19: {
              if ((this.field_o ^ -1) <= -17) {
                this.field_q = this.field_q | 4;
                break L19;
              } else {
                break L19;
              }
            }
            L20: {
              if (this.field_o < 18) {
                break L20;
              } else {
                this.field_q = this.field_q | 2048;
                break L20;
              }
            }
            L21: {
              if (-20 < (this.field_o ^ -1)) {
                break L21;
              } else {
                this.field_q = this.field_q | 1024;
                break L21;
              }
            }
            L22: {
              if (21 > this.field_o) {
                break L22;
              } else {
                this.field_q = this.field_q | 32;
                break L22;
              }
            }
            L23: {
              if (-23 >= (this.field_o ^ -1)) {
                this.field_q = this.field_q | 256;
                break L23;
              } else {
                break L23;
              }
            }
            L24: {
              if (24 <= this.field_o) {
                this.field_q = this.field_q | 8192;
                break L24;
              } else {
                break L24;
              }
            }
            L25: {
              this.field_y = var4;
              this.field_r = 500.0;
              stackIn_83_0 = this.field_a;

              stackIn_83_1 = 2;

              if (-1 != (va.a(this.field_q, 4) ^ -1)) {
                stackIn_84_0 = (int[]) ((Object) stackIn_83_0);
                stackIn_84_1 = stackIn_83_1;
                stackIn_84_2 = var3 >> -1735360029;
                break L25;
              } else {
                stackIn_84_0 = (int[]) ((Object) stackIn_83_0);
                stackIn_84_1 = stackIn_83_1;
                stackIn_84_2 = 0;
                break L25;
              }
            }
            L26: {
              stackIn_84_0[stackIn_84_1] = stackIn_84_2;
              stackIn_86_0 = this.field_a;

              stackIn_86_1 = 1;

              if (va.a(this.field_q, 2) != 0) {
                stackIn_87_0 = (int[]) ((Object) stackIn_86_0);
                stackIn_87_1 = stackIn_86_1;
                stackIn_87_2 = var3;
                break L26;
              } else {
                stackIn_87_0 = (int[]) ((Object) stackIn_86_0);
                stackIn_87_1 = stackIn_86_1;
                stackIn_87_2 = 0;
                break L26;
              }
            }
            L27: {
              stackIn_87_0[stackIn_87_1] = stackIn_87_2;
              stackIn_89_0 = this.field_a;

              stackIn_89_1 = 0;

              if (0 != va.a(1, this.field_q)) {
                stackIn_90_0 = (int[]) ((Object) stackIn_89_0);
                stackIn_90_1 = stackIn_89_1;
                stackIn_90_2 = var3;
                break L27;
              } else {
                stackIn_90_0 = (int[]) ((Object) stackIn_89_0);
                stackIn_90_1 = stackIn_89_1;
                stackIn_90_2 = 0;
                break L27;
              }
            }
            L28: {
              stackIn_90_0[stackIn_90_1] = stackIn_90_2;
              stackIn_92_0 = this.field_a;

              stackIn_92_1 = 3;

              if (va.a(this.field_q, 8) == 0) {
                stackIn_93_0 = (int[]) ((Object) stackIn_92_0);
                stackIn_93_1 = stackIn_92_1;
                stackIn_93_2 = 0;
                break L28;
              } else {
                stackIn_93_0 = (int[]) ((Object) stackIn_92_0);
                stackIn_93_1 = stackIn_92_1;
                stackIn_93_2 = var3 << -1951859839;
                break L28;
              }
            }
            L29: {
              stackIn_93_0[stackIn_93_1] = stackIn_93_2;
              if (this.field_o >= wl.field_c[4] - -1) {
                break L29;
              } else {
                var5_int = 0;
                L30: while (true) {
                  if (var5_int >= 4) {
                    break L29;
                  } else {
                    if (0 != (gh.field_c[var5_int] & this.field_q)) {
                      this.field_a[var5_int] = this.field_a[var5_int] >> 1;
                      var5_int++;
                      continue L30;
                    } else {
                      var5_int++;
                      continue L30;
                    }
                  }
                }
              }
            }
            L31: {
              L32: {
                L33: {
                  this.field_g[3] = this.field_r * 5.0 / (double)this.field_a[3];
                  this.field_g[0] = this.field_r * 5.0 / (double)this.field_a[0];
                  this.field_g[1] = 5.0 * this.field_r / (double)this.field_a[1];
                  this.field_g[2] = this.field_r / (double)this.field_a[2];
                  this.field_z[1] = 0.75 * this.field_g[1];
                  this.field_z[0] = this.field_g[0] * 0.25;
                  var5 = this.field_z;
                  this.field_z[3] = 0.0;
                  var5[2] = 0.0;
                  this.field_B = (double)(-1 + this.field_o) * 0.043478260869565216;
                  if (21 <= this.field_o) {
                    if (-25 != (this.field_o ^ -1)) {
                      break L32;
                    } else {
                      break L33;
                    }
                  } else {
                    if (-4 != (3 & this.field_o ^ -1)) {
                      break L32;
                    } else {
                      break L33;
                    }
                  }
                }
                L34: {
                  this.field_n = 2080;
                  if (-4 < (this.field_o ^ -1)) {
                    break L34;
                  } else {
                    this.field_n = this.field_n | 1;
                    break L34;
                  }
                }
                L35: {
                  if (5 > this.field_o) {
                    break L35;
                  } else {
                    this.field_n = this.field_n | 4;
                    break L35;
                  }
                }
                L36: {
                  if (-10 >= (this.field_o ^ -1)) {
                    this.field_n = this.field_n | 8;
                    break L36;
                  } else {
                    break L36;
                  }
                }
                L37: {
                  if (10 <= this.field_o) {
                    this.field_n = this.field_n | 16;
                    break L37;
                  } else {
                    break L37;
                  }
                }
                L38: {
                  if (13 <= this.field_o) {
                    this.field_n = this.field_n | 2;
                    break L38;
                  } else {
                    break L38;
                  }
                }
                L39: {
                  if (this.field_o < 19) {
                    break L39;
                  } else {
                    this.field_n = this.field_n | 64;
                    break L39;
                  }
                }
                L40: {
                  if (this.field_o < 17) {
                    break L40;
                  } else {
                    this.field_n = -17 & (256 | this.field_n);
                    break L40;
                  }
                }
                L41: {
                  if (-16 >= (this.field_o ^ -1)) {
                    this.field_n = this.field_n | 1024;
                    break L41;
                  } else {
                    if (this.field_o >= 7) {
                      this.field_n = this.field_n | 512;
                      break L41;
                    } else {
                      break L41;
                    }
                  }
                }
                L42: {
                  if (21 <= this.field_o) {
                    this.field_n = this.field_n | 128;
                    break L42;
                  } else {
                    break L42;
                  }
                }
                L43: {
                  if (this.field_o <= 7) {
                    this.field_v = this.field_o >> -105490270;
                    break L43;
                  } else {
                    if (-20 > (this.field_o ^ -1)) {
                      this.field_v = 3;
                      break L43;
                    } else {
                      this.field_v = this.field_o + -11 >> 1348835522;
                      break L43;
                    }
                  }
                }
                L44: {
                  stackIn_137_0 = this;

                  if (this.field_o >= 19) {
                    stackIn_138_0 = this;
                    stackIn_138_1 = 2;
                    break L44;
                  } else {
                    stackIn_136_0 = this;

                    if (15 > this.field_o) {
                      stackIn_138_0 = this;
                      stackIn_138_1 = 0;
                      break L44;
                    } else {
                      stackIn_138_0 = this;
                      stackIn_138_1 = 1;
                      break L44;
                    }
                  }
                }
                ((ql) (this)).field_p = stackIn_138_1;
                if ((this.field_o ^ -1) == -25) {
                  this.field_h = 35;
                  break L31;
                } else {
                  if (this.field_o == 19) {
                    this.field_h = 35;
                    break L31;
                  } else {
                    if ((this.field_o ^ -1) == -16) {
                      this.field_h = 28;
                      break L31;
                    } else {
                      if (-12 != (this.field_o ^ -1)) {
                        if (-8 == (this.field_o ^ -1)) {
                          this.field_h = 22;
                          break L31;
                        } else {
                          this.field_h = 17;
                          break L31;
                        }
                      } else {
                        this.field_h = 27;
                        break L31;
                      }
                    }
                  }
                }
              }
              this.field_n = 0;
              break L31;
            }
            return;
          } else {
            return;
          }
        }
    }

    final int a(int param0) {
        if (param0 != -2) {
            return 4;
        }
        return (this.field_o + 3) / 4;
    }

    final void a(byte param0, double param1) {
        int stackIn_3_0 = 0;
        int stackIn_32_0 = 0;
        int stackIn_80_0 = 0;
        int stackIn_80_1 = 0;
        double var4;
        int var6;
        double var7;
        double var9;
        int var11;
        lc var12;
        int var13;
        double var14;
        double var16;
        int var18;
        int var19;
        double var19_double;
        int var20;
        int var21;
        u var21_ref_u;
        int var22;
        double var22_double;
        Object var23;
        double var24;
        int var24_int;
        int var25;
        int var26;
        int var27;
        rd var27_ref_rd;
        int var28;
        boolean[] var29;
        int var30;
        rd var31;
        int var32;
        L0: {
          var32 = Confined.field_J ? 1 : 0;
          var4 = this.field_r - param1;
          if (var4 >= 0.0) {
            stackIn_3_0 = 0;
            break L0;
          } else {
            stackIn_3_0 = 1;
            break L0;
          }
        }
        L1: {
          var6 = stackIn_3_0;
          if (param0 == -46) {
            break L1;
          } else {
            this.a((byte) -6, -0.5374462764865461);
            break L1;
          }
        }
        L2: {
          var7 = param1 / this.field_r;
          var12 = this.field_i.field_x;
          var13 = var12.field_a - 2;
          var14 = var12.field_r[var13];
          var16 = var12.field_r[1 + var13] - var14;
          if (var6 != 0) {
            var11 = this.field_y;
            break L2;
          } else {
            L3: {
              var9 = (double)this.field_y * var7;
              var11 = (int)var9;
              if (Math.random() < var9 - (double)var11) {
                var11++;
                break L3;
              } else {
                break L3;
              }
            }
            if (var11 > this.field_y) {
              var11 = this.field_y;
              break L2;
            } else {
              break L2;
            }
          }
        }
        var18 = 0;
        L4: while (true) {
          if (var18 >= var11) {
            L5: {
              if (!this.field_c) {
                break L5;
              } else {
                var18 = 0;
                L6: while (true) {
                  if (4 <= var18) {
                    break L5;
                  } else {
                    L7: {
                      if (2 == var18) {
                        stackIn_32_0 = 1;
                        break L7;
                      } else {
                        stackIn_32_0 = 5;
                        break L7;
                      }
                    }
                    L8: {
                      var19 = stackIn_32_0;
                      var20 = this.field_a[var18] / var19;
                      if (var6 != 0) {
                        var11 = var20;
                        break L8;
                      } else {
                        this.field_z[var18] = this.field_z[var18] - param1;
                        var11 = 0;
                        L9: while (true) {
                          L10: {
                            if (var20 <= var11) {
                              break L10;
                            } else {
                              if (this.field_z[var18] >= 0.0) {
                                break L10;
                              } else {
                                this.field_z[var18] = this.field_z[var18] + this.field_g[var18];
                                var11++;
                                continue L9;
                              }
                            }
                          }
                          if (this.field_z[var18] < 0.0) {
                            this.field_z[var18] = 0.0;
                            break L8;
                          } else {
                            break L8;
                          }
                        }
                      }
                    }
                    var21 = 0;
                    L11: while (true) {
                      if (var21 >= var11) {
                        this.field_a[var18] = this.field_a[var18] - var19 * var11;
                        var18++;
                        continue L6;
                      } else {
                        L12: {
                          L13: {
                            var22 = var18;
                            var23 = null;
                            if (0 == (1024 & this.field_q)) {
                              break L13;
                            } else {
                              L14: {
                                if (var22 == 1) {
                                  break L14;
                                } else {
                                  if ((var22 ^ -1) != -4) {
                                    break L13;
                                  } else {
                                    break L14;
                                  }
                                }
                              }
                              if (Math.random() < 0.1) {
                                var24 = -2.0;
                                var26 = 0;
                                break L12;
                              } else {
                                break L13;
                              }
                            }
                          }
                          var26 = var13;
                          var24 = var14 + Math.random() * var16;
                          break L12;
                        }
                        var27 = (int)(0.6 / this.field_b);
                        var28 = (int)(Math.random() * (double)bf.field_L[var22].length);
                        var29 = new boolean[]{true};
                        var30 = 0;
                        L15: while (true) {
                          if (var30 >= var19) {
                            L16: while (true) {
                              if (var23 == null) {
                                var21++;
                                continue L11;
                              } else {
                                ((rd) (var23)).d(var13, -53);
                                var23 = ((rd) (var23)).field_Tb;
                                continue L16;
                              }
                            }
                          } else {
                            L17: {
                              var31 = this.a(var24, var27, 0.0, 0.0, false, bf.field_L[var22][var28], (u) null, this.field_o, 583, var22, (rd) (var23), false, var29);
                              if (var23 == null) {
                                var31.a(Math.random(), Math.random(), var26, this.field_f, Math.random(), Math.random(), 76, Math.random(), Math.random(), this.field_b);
                                break L17;
                              } else {
                                var31.d((byte) -123, var26);
                                break L17;
                              }
                            }
                            L18: {
                              this.field_i.field_g.a((rk) (var31), (byte) 67);
                              if ((var22 ^ -1) == -2) {
                                if ((32768 & this.field_q) != 0) {
                                  L19: {
                                    if (var23 != null) {
                                      var31.field_Bb = (var31.field_wb >> -1721697791) + ((rd) (var23)).field_Bb;
                                      break L19;
                                    } else {
                                      break L19;
                                    }
                                  }
                                  var31.field_wb = (var31.field_wb >> 1329834017) * var19;
                                  break L18;
                                } else {
                                  var22 = 0;
                                  break L18;
                                }
                              } else {
                                break L18;
                              }
                            }
                            L20: {
                              if (var22 != 3) {
                                var23 = var31;
                                break L20;
                              } else {
                                var31.d(var26, param0 ^ 65);
                                break L20;
                              }
                            }
                            L21: {
                              if (-2 <= (this.field_o ^ -1)) {
                                this.field_i.field_j = this.field_i.field_j + 1;
                                break L21;
                              } else {
                                break L21;
                              }
                            }
                            var24 = var24 + (double)var27 * var31.field_C * 0.4;
                            if (-3 <= (this.field_o ^ -1)) {
                              this.field_i.field_c = this.field_i.field_c + 1;
                              var30++;
                              continue L15;
                            } else {
                              var30++;
                              continue L15;
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
            L22: {
              this.field_r = var4;
              if (var6 == 0) {
                break L22;
              } else {
                stackIn_80_0 = 2048;
                stackIn_80_1 = this.field_n;
                if ((stackIn_80_0 & stackIn_80_1) == 0) {
                  d.field_a = d.field_a - 1;
                  this.field_o = this.field_o + 1;
                  this.a(12631, true);
                  break L22;
                } else {
                  this.field_i.field_o = 0;
                  this.field_i.field_Q = new wc(this.field_i, var13, var12.field_r[-1 + var12.field_a], this.field_v, this.field_h);
                  this.field_i.field_g.a((rk) (this.field_i.field_Q), (byte) 97);
                  break L22;
                }
              }
            }
            return;
          } else {
            L23: {
              var19_double = var14 + var16 * Math.random();
              var12.a(var19_double, 0.4, 0, var13);
              var21_ref_u = new u(this.field_i, pn.field_h, fa.field_R, var19_double);
              this.field_i.field_g.a((rk) (var21_ref_u), (byte) 100);
              if (!this.field_c) {
                var22_double = Math.random() * (double)this.field_y;
                var24_int = 0;
                var25 = 0;
                L24: while (true) {
                  if (-5 >= (var25 ^ -1)) {
                    break L23;
                  } else {
                    if ((this.field_a[var25] ^ -1) < -1) {
                      var24_int = var24_int + this.field_a[var25];
                      if ((double)var24_int > var22_double) {
                        var26 = (int)(Math.random() * (double)bf.field_L[var25].length);
                        var27_ref_rd = this.a(0.0, 0, 0.0, 0.0, false, bf.field_L[var25][var26], var21_ref_u, this.field_o, 583, var25, (rd) null, false, new boolean[]{true});
                        this.field_i.field_g.a((rk) (var27_ref_rd), (byte) -93);
                        this.field_a[var25] = this.field_a[var25] - 1;
                        break L23;
                      } else {
                        var25++;
                        continue L24;
                      }
                    } else {
                      var25++;
                      continue L24;
                    }
                  }
                }
              } else {
                break L23;
              }
            }
            this.field_y = this.field_y - 1;
            var18++;
            continue L4;
          }
        }
    }

    final rd a(double param0, int param1, double param2, double param3, boolean param4, int param5, u param6, int param7, int param8, int param9, rd param10, boolean param11, boolean[] param12) {
        rd stackIn_6_0;
        rd stackIn_6_1;
        hn stackIn_6_2;
        double stackIn_6_3;
        double stackIn_6_4;
        double stackIn_6_5;
        boolean stackIn_6_6;
        int stackIn_6_7;
        int stackIn_6_8;
        rd stackIn_6_9;
        int stackIn_6_10;
        rd stackIn_7_0 = null;
        rd stackIn_7_1 = null;
        hn stackIn_7_2 = null;
        double stackIn_7_3 = 0.0;
        double stackIn_7_4 = 0.0;
        double stackIn_7_5 = 0.0;
        boolean stackIn_7_6 = false;
        int stackIn_7_7 = 0;
        int stackIn_7_8 = 0;
        rd stackIn_7_9 = null;
        int stackIn_7_10 = 0;
        int stackIn_7_11 = 0;
        int stackIn_11_12;
        int stackIn_12_12 = 0;
        int stackIn_12_13 = 0;
        rd stackIn_16_0 = null;
        rd stackIn_16_1 = null;
        hn stackIn_16_2 = null;
        double stackIn_16_3 = 0.0;
        double stackIn_16_4 = 0.0;
        double stackIn_16_5 = 0.0;
        boolean stackIn_16_6 = false;
        int stackIn_16_7 = 0;
        int stackIn_16_8 = 0;
        rd stackIn_16_9 = null;
        int stackIn_16_10 = 0;
        int stackIn_16_11 = 0;
        int stackIn_16_12 = 0;
        int stackIn_16_13 = 0;
        int stackIn_16_14 = 0;
        int stackIn_19_15 = 0;
        double stackIn_21_16;
        double stackIn_22_16 = 0.0;
        int stackIn_22_17 = 0;
        int stackIn_25_18;
        rd stackIn_26_0 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        StringBuilder stackIn_32_1 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        StringBuilder stackIn_35_1 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_36_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var17_int = 0;
        RuntimeException var17 = null;
        boolean[] var18 = null;
        try {
          L0: {
            L1: {
              var17_int = param7 - 20;
              if ((param9 ^ -1) != -4) {
                break L1;
              } else {
                var17_int -= 8;
                break L1;
              }
            }
            L2: {
              if (param8 == 583) {
                break L2;
              } else {
                var18 = (boolean[]) null;
                this.a(-0.8910612503013482, 106, 0.0031770300817687874, 0.5136535241639608, false, 7, (u) null, 105, -125, -6, (rd) null, true, (boolean[]) null);
                break L2;
              }
            }
            L3: {
              stackIn_6_0 = null;

              stackIn_6_1 = null;

              stackIn_6_2 = this.field_i;

              stackIn_6_3 = param2;

              stackIn_6_4 = param3;

              stackIn_6_5 = param0;

              stackIn_6_6 = param4;

              stackIn_6_7 = param9;

              stackIn_6_8 = param5;

              stackIn_6_9 = (rd) (param10);

              stackIn_6_10 = param1;

              if ((this.field_q & 16384) == 0) {
                stackIn_7_0 = null;
                stackIn_7_1 = null;
                stackIn_7_2 = (hn) ((Object) stackIn_6_2);
                stackIn_7_3 = stackIn_6_3;
                stackIn_7_4 = stackIn_6_4;
                stackIn_7_5 = stackIn_6_5;
                stackIn_7_6 = stackIn_6_6;
                stackIn_7_7 = stackIn_6_7;
                stackIn_7_8 = stackIn_6_8;
                stackIn_7_9 = (rd) ((Object) stackIn_6_9);
                stackIn_7_10 = stackIn_6_10;
                stackIn_7_11 = 0;
                break L3;
              } else {
                stackIn_7_0 = null;
                stackIn_7_1 = null;
                stackIn_7_2 = (hn) ((Object) stackIn_6_2);
                stackIn_7_3 = stackIn_6_3;
                stackIn_7_4 = stackIn_6_4;
                stackIn_7_5 = stackIn_6_5;
                stackIn_7_6 = stackIn_6_6;
                stackIn_7_7 = stackIn_6_7;
                stackIn_7_8 = stackIn_6_8;
                stackIn_7_9 = (rd) ((Object) stackIn_6_9);
                stackIn_7_10 = stackIn_6_10;
                stackIn_7_11 = 1;
                break L3;
              }
            }
            L4: {
























              stackIn_11_12 = var17_int;

              if ((32 & this.field_q) != 0) {
                stackIn_7_0 = null;
                stackIn_7_1 = null;
                stackIn_7_2 = (hn) ((Object) stackIn_7_2);






                stackIn_7_9 = (rd) ((Object) stackIn_7_9);


                stackIn_12_12 = stackIn_11_12;
                stackIn_12_13 = 2;
                break L4;
              } else {


























                if (-1 != (16 & this.field_q ^ -1)) {
                  stackIn_7_0 = null;
                  stackIn_7_1 = null;
                  stackIn_7_2 = (hn) ((Object) stackIn_7_2);






                  stackIn_7_9 = (rd) ((Object) stackIn_7_9);


                  stackIn_12_12 = stackIn_11_12;
                  stackIn_12_13 = 1;
                  break L4;
                } else {
                  stackIn_7_0 = null;
                  stackIn_7_1 = null;
                  stackIn_7_2 = (hn) ((Object) stackIn_7_2);






                  stackIn_7_9 = (rd) ((Object) stackIn_7_9);


                  stackIn_12_12 = stackIn_11_12;
                  stackIn_12_13 = 0;
                  break L4;
                }
              }
            }
            L5: {
              L6: {
                stackIn_7_0 = null;

                stackIn_7_1 = null;

                stackIn_7_2 = (hn) ((Object) stackIn_7_2);

                stackIn_7_9 = (rd) ((Object) stackIn_7_9);

                if (-1 == (this.field_q & gh.field_c[param9] ^ -1)) {
                  break L6;
                } else {
                  stackIn_7_0 = null;

                  stackIn_7_1 = null;

                  stackIn_7_2 = (hn) ((Object) stackIn_7_2);

                  stackIn_7_9 = (rd) ((Object) stackIn_7_9);

                  if (param6 != null) {
                    break L6;
                  } else {
                    stackIn_16_0 = null;
                    stackIn_16_1 = null;
                    stackIn_16_2 = (hn) ((Object) stackIn_7_2);
                    stackIn_16_3 = stackIn_7_3;
                    stackIn_16_4 = stackIn_7_4;
                    stackIn_16_5 = stackIn_7_5;
                    stackIn_16_6 = stackIn_7_6;
                    stackIn_16_7 = stackIn_7_7;
                    stackIn_16_8 = stackIn_7_8;
                    stackIn_16_9 = (rd) ((Object) stackIn_7_9);
                    stackIn_16_10 = stackIn_7_10;
                    stackIn_16_11 = stackIn_7_11;
                    stackIn_16_12 = stackIn_12_12;
                    stackIn_16_13 = stackIn_12_13;
                    stackIn_16_14 = 1;
                    break L5;
                  }
                }
              }
              stackIn_16_0 = null;
              stackIn_16_1 = null;
              stackIn_16_2 = (hn) ((Object) stackIn_7_2);
              stackIn_16_3 = stackIn_7_3;
              stackIn_16_4 = stackIn_7_4;
              stackIn_16_5 = stackIn_7_5;
              stackIn_16_6 = stackIn_7_6;
              stackIn_16_7 = stackIn_7_7;
              stackIn_16_8 = stackIn_7_8;
              stackIn_16_9 = (rd) ((Object) stackIn_7_9);
              stackIn_16_10 = stackIn_7_10;
              stackIn_16_11 = stackIn_7_11;
              stackIn_16_12 = stackIn_12_12;
              stackIn_16_13 = stackIn_12_13;
              stackIn_16_14 = 0;
              break L5;
            }
            L7: {






























              if (-1 == (8192 & this.field_q ^ -1)) {
                stackIn_16_0 = null;
                stackIn_16_1 = null;
                stackIn_16_2 = (hn) ((Object) stackIn_16_2);






                stackIn_16_9 = (rd) ((Object) stackIn_16_9);





                stackIn_19_15 = 0;
                break L7;
              } else {
                stackIn_16_0 = null;
                stackIn_16_1 = null;
                stackIn_16_2 = (hn) ((Object) stackIn_16_2);






                stackIn_16_9 = (rd) ((Object) stackIn_16_9);





                stackIn_19_15 = 1;
                break L7;
              }
            }
            L8: {
































              stackIn_21_16 = this.field_B;

              if (0 == (this.field_q & 2048)) {
                stackIn_16_0 = null;
                stackIn_16_1 = null;
                stackIn_16_2 = (hn) ((Object) stackIn_16_2);






                stackIn_16_9 = (rd) ((Object) stackIn_16_9);






                stackIn_22_16 = stackIn_21_16;
                stackIn_22_17 = 0;
                break L8;
              } else {
                stackIn_16_0 = null;
                stackIn_16_1 = null;
                stackIn_16_2 = (hn) ((Object) stackIn_16_2);






                stackIn_16_9 = (rd) ((Object) stackIn_16_9);






                stackIn_22_16 = stackIn_21_16;
                stackIn_22_17 = 1;
                break L8;
              }
            }
            L9: {




































              if (0 == (this.field_q & 4096)) {
                stackIn_16_0 = null;
                stackIn_16_1 = null;
                stackIn_16_2 = (hn) ((Object) stackIn_16_2);






                stackIn_16_9 = (rd) ((Object) stackIn_16_9);








                stackIn_25_18 = 0;
                break L9;
              } else {
                stackIn_16_0 = null;
                stackIn_16_1 = null;
                stackIn_16_2 = (hn) ((Object) stackIn_16_2);






                stackIn_16_9 = (rd) ((Object) stackIn_16_9);








                stackIn_25_18 = 1;
                break L9;
              }
            }
            stackIn_26_0 = new rd(stackIn_16_2, stackIn_16_3, stackIn_16_4, stackIn_16_5, stackIn_16_6, stackIn_16_7, stackIn_16_8, stackIn_16_9, stackIn_16_10, stackIn_16_11 != 0, stackIn_16_12, stackIn_16_13, stackIn_16_14 != 0, stackIn_19_15 != 0, stackIn_22_16, stackIn_22_17 != 0, stackIn_25_18 != 0, param6, param11, param12, param7);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var17 = decompiledCaughtException;
            stackIn_29_0 = (RuntimeException) (var17);

            stackIn_29_1 = new StringBuilder().append("ql.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');

            if (param6 == null) {
              stackIn_30_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "null";
              break L10;
            } else {
              stackIn_30_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "{...}";
              break L10;
            }
          }
          L11: {


            stackIn_32_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_30_2).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',');

            if (param10 == null) {
              stackIn_30_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "null";
              break L11;
            } else {
              stackIn_30_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "{...}";
              break L11;
            }
          }
          L12: {


            stackIn_35_1 = ((StringBuilder) (Object) stackIn_33_1).append(stackIn_33_2).append(',').append(param11).append(',');

            if (param12 == null) {
              stackIn_30_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_36_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackIn_36_2 = "null";
              break L12;
            } else {
              stackIn_30_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_36_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackIn_36_2 = "{...}";
              break L12;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_30_0), stackIn_36_2 + ')');
        }
        return stackIn_26_0;
    }

    final static bm[] a(String param0, byte param1, String param2, mi param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        bm[] stackIn_2_0 = null;
        bm[] stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 == 90) {
              var4_int = param3.a(-118, param0);
              var5 = param3.a(var4_int, param2, -107);
              stackIn_4_0 = kj.a(param3, var4_int, var5, false);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (bm[]) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var4);

            stackIn_7_1 = new StringBuilder().append("ql.F(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');

            if (param3 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L3;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L3;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_8_0), stackIn_14_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    ql(hn param0) {
        this.field_d = 0;
        this.field_j = false;
        this.field_z = new double[13];
        this.field_l = 0;
        this.field_e = 0;
        this.field_x = 0;
        this.field_s = 0;
        this.field_o = 0;
        this.field_m = 0;
        this.field_g = new double[13];
        this.field_a = new int[4];
        this.field_w = 0;
        try {
            this.field_i = param0;
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) ((Object) runtimeException), "ql.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_k = new va();
        field_u = 64;
        field_A = "Fullscreen mode was cancelled after a delay of 10 seconds. If you were unable to accept fullscreen mode during this time, there may be a problem with your configuration. You could try restarting your browser and trying again.";
    }
}
