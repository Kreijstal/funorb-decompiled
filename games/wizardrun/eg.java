/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eg extends qh {
    int field_n;
    static long field_C;
    int field_x;
    static String field_t;
    o field_q;
    private int field_m;
    int field_o;
    int field_w;
    int field_z;
    static int field_v;
    int field_p;
    int field_A;
    static kl field_u;
    int field_r;
    int field_s;
    int field_B;
    int field_y;

    private final void a(int param0, int param1, boolean param2, String param3, int param4) {
        jj.field_b.b(param3, -1 + param1, param4, 0, -1);
        jj.field_b.b(param3, param1 + 1, param4, 0, -1);
        jj.field_b.b(param3, param1, -1 + param4, 0, -1);
        jj.field_b.b(param3, param1, 1 + param4, 0, -1);
        if (!param2) {
            return;
        }
        try {
            jj.field_b.b(param3, param1, param4, param0, -1);
        } catch (RuntimeException runtimeException) {
            throw bd.a((Throwable) ((Object) runtimeException), "eg.CA(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
        }
    }

    private final void a(boolean param0, int param1, tg param2) {
        Object stackIn_86_0 = null;
        Object stackIn_87_0 = null;
        int stackIn_87_1 = 0;
        int stackIn_92_0 = 0;
        RuntimeException stackIn_98_0 = null;
        StringBuilder stackIn_98_1 = null;
        RuntimeException stackIn_99_0 = null;
        StringBuilder stackIn_99_1 = null;
        String stackIn_99_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        Object var7 = null;
        int var8 = 0;
        var8 = wizardrun.field_H;
        try {
          L0: {
            this.field_h = this.field_m;
            if (param1 == 120) {
              L1: {
                this.a(20, tl.field_a, pk.field_s, si.field_j, (byte) -15, param2);
                this.field_o = 6;
                this.field_w = this.field_w + 1;
                if (param0) {
                  L2: {
                    if (this.field_n < 31) {
                      this.field_n = 31;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  L3: {
                    if (this.field_n <= 34) {
                      break L3;
                    } else {
                      this.field_n = 31;
                      break L3;
                    }
                  }
                  this.field_z = this.field_z + 1;
                  if (5 < this.field_z) {
                    this.field_z = 0;
                    if (this.field_n >= 34) {
                      break L1;
                    } else {
                      this.field_n = this.field_n + 1;
                      break L1;
                    }
                  } else {
                    break L1;
                  }
                } else {
                  this.field_n = 31;
                  if (0 <= this.field_e) {
                    break L1;
                  } else {
                    this.field_n = 32;
                    break L1;
                  }
                }
              }
              L4: {
                L5: {
                  if (this.field_i.field_a < -2) {
                    break L5;
                  } else {
                    if (0 > this.field_i.field_b) {
                      break L5;
                    } else {
                      if (20 < this.field_i.field_b) {
                        break L5;
                      } else {
                        if (this.field_e <= -30) {
                          break L5;
                        } else {
                          if (this.field_k != 1) {
                            break L4;
                          } else {
                            break L5;
                          }
                        }
                      }
                    }
                  }
                }
                L6: {
                  if (1 == this.field_k) {
                    this.field_i.field_b = (int)(Math.random() * 18.0) - -1;
                    this.field_i.field_a = 17;
                    this.field_k = 0;
                    break L6;
                  } else {
                    if (this.field_i.field_a < -2) {
                      this.field_i.field_a = 17;
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                }
                L7: {
                  this.field_o = 0;
                  if (param0) {
                    var4_int = 0;
                    L8: while (true) {
                      if (1000 <= var4_int) {
                        var4_int = 0;
                        L9: while (true) {
                          if (var4_int >= 300) {
                            L10: {
                              var4_int = 0;
                              var5 = 6;
                              if (this.field_B != 12) {
                                break L10;
                              } else {
                                var5 = 10;
                                var4_int = 1;
                                break L10;
                              }
                            }
                            L11: {
                              if (17 == this.field_B) {
                                var5 = 10;
                                var4_int = 2;
                                break L11;
                              } else {
                                break L11;
                              }
                            }
                            L12: {
                              if (26 != this.field_B) {
                                break L12;
                              } else {
                                var5 = 10;
                                var4_int = 3;
                                break L12;
                              }
                            }
                            L13: {
                              if (-34 != (this.field_B ^ -1)) {
                                break L13;
                              } else {
                                var5 = 10;
                                var4_int = 4;
                                break L13;
                              }
                            }
                            L14: {
                              if (this.field_B == 40) {
                                var4_int = 5;
                                var5 = 20;
                                if (!da.field_g) {
                                  ql.a(1, 245, 10);
                                  break L14;
                                } else {
                                  break L14;
                                }
                              } else {
                                break L14;
                              }
                            }
                            var6 = 0;
                            L15: while (true) {
                              if (var6 >= var5) {
                                ra.a(2);
                                break L7;
                              } else {
                                L16: {
                                  var7 = this;
                                  if (var6 == 0) {
                                    break L16;
                                  } else {
                                    ii.field_e[od.field_k].a(param1 + 9027, 21, new ob(this.field_i));
                                    var7 = ii.field_e[od.field_k];
                                    od.field_k = od.field_k + 1;
                                    break L16;
                                  }
                                }
                                L17: {
                                  ((eg) (var7)).a(9147, 21, this.field_i);
                                  ((eg) (var7)).field_f.a(param1 + -246, this.field_f);
                                  ((eg) (var7)).field_f.field_b = ((eg) (var7)).field_f.field_b + (int)(Math.sin(6.28 * (double)var6 / (double)var5) * 64.0);
                                  ((eg) (var7)).field_f.field_a = ((eg) (var7)).field_f.field_a + (int)(64.0 * Math.cos((double)var6 * 6.28 / (double)var5));
                                  ((eg) (var7)).field_e = 0;
                                  ((eg) (var7)).field_o = var4_int;
                                  stackIn_86_0 = var7;

                                  if (var5 / 2 <= var6) {
                                    stackIn_87_0 = stackIn_86_0;
                                    stackIn_87_1 = 1;
                                    break L17;
                                  } else {
                                    stackIn_87_0 = stackIn_86_0;
                                    stackIn_87_1 = -1;
                                    break L17;
                                  }
                                }
                                ((eg) ((Object) stackIn_87_0)).field_h = stackIn_87_1;
                                var6++;
                                continue L15;
                              }
                            }
                          } else {
                            L18: {
                              if (!param2.field_d[var4_int]) {
                                break L18;
                              } else {
                                param2.field_d[var4_int] = false;
                                break L18;
                              }
                            }
                            var4_int++;
                            continue L9;
                          }
                        }
                      } else {
                        L19: {
                          if (null != ii.field_e[var4_int]) {
                            if (ii.field_e[var4_int].field_B > 2) {
                              if (21 != ii.field_e[var4_int].field_B) {
                                if (-21 != (ii.field_e[var4_int].field_B ^ -1)) {
                                  ii.field_e[var4_int].field_p = 0;
                                  break L19;
                                } else {
                                  break L19;
                                }
                              } else {
                                var4_int++;
                                continue L8;
                              }
                            } else {
                              var4_int++;
                              continue L8;
                            }
                          } else {
                            break L19;
                          }
                        }
                        var4_int++;
                        continue L8;
                      }
                    }
                  } else {
                    L20: {
                      if ((this.field_B ^ -1) == -9) {
                        break L20;
                      } else {
                        if ((this.field_B ^ -1) != -37) {
                          L21: {
                            this.field_o = 0;
                            if ((this.field_d ^ -1) == -33) {
                              this.field_o = 0;
                              break L21;
                            } else {
                              break L21;
                            }
                          }
                          L22: {
                            if ((this.field_d ^ -1) != -49) {
                              break L22;
                            } else {
                              this.field_o = 1;
                              break L22;
                            }
                          }
                          L23: {
                            if (64 != this.field_d) {
                              break L23;
                            } else {
                              this.field_o = 2;
                              break L23;
                            }
                          }
                          L24: {
                            if (80 != this.field_d) {
                              break L24;
                            } else {
                              this.field_o = 3;
                              break L24;
                            }
                          }
                          L25: {
                            if (-97 != (this.field_d ^ -1)) {
                              break L25;
                            } else {
                              this.field_o = 5;
                              break L25;
                            }
                          }
                          L26: {
                            if (1 >= qh.field_l) {
                              break L26;
                            } else {
                              if (-6 >= (this.field_o ^ -1)) {
                                break L26;
                              } else {
                                this.field_o = this.field_o + 1;
                                break L26;
                              }
                            }
                          }
                          L27: {
                            this.field_B = 21;
                            if (3 >= qh.field_l) {
                              break L27;
                            } else {
                              if (5 <= this.field_o) {
                                break L27;
                              } else {
                                this.field_o = this.field_o + 1;
                                break L27;
                              }
                            }
                          }
                          this.field_d = 32;
                          break L7;
                        } else {
                          break L20;
                        }
                      }
                    }
                    this.field_k = 1;
                    break L7;
                  }
                }
                L28: {
                  if (pk.field_s) {
                    stackIn_92_0 = 0;
                    break L28;
                  } else {
                    stackIn_92_0 = 1;
                    break L28;
                  }
                }
                if (stackIn_92_0 != 1) {
                  tl.field_a.a(si.field_j[6], 100, 256 * ee.field_p / 100);
                  break L4;
                } else {
                  break L4;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L29: {
            var4 = decompiledCaughtException;
            stackIn_98_0 = (RuntimeException) (var4);

            stackIn_98_1 = new StringBuilder().append("eg.J(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_99_0 = (RuntimeException) ((Object) stackIn_98_0);
              stackIn_99_1 = (StringBuilder) ((Object) stackIn_98_1);
              stackIn_99_2 = "null";
              break L29;
            } else {
              stackIn_99_0 = (RuntimeException) ((Object) stackIn_98_0);
              stackIn_99_1 = (StringBuilder) ((Object) stackIn_98_1);
              stackIn_99_2 = "{...}";
              break L29;
            }
          }
          throw bd.a((Throwable) ((Object) stackIn_99_0), stackIn_99_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final void d(int param0) {
        boolean discarded$0 = false;
        nj.field_r = nj.field_r - 1;
        if (param0 != -1569) {
            tg var3 = (tg) null;
            discarded$0 = this.a(false, (tg) null, 6);
        }
        if (!(155 < nj.field_r)) {
            ql.a(param0 ^ -1570, 244, 11);
        }
    }

    public static void a(int param0) {
        field_t = null;
        int var1 = -76 / ((param0 - 4) / 50);
        field_u = null;
    }

    private final void b(int param0) {
        int stackIn_34_0 = 0;
        ob var3;
        ob var4;
        ob var5;
        L0: {
          var4 = new ob();
          var5 = var4;
          var3 = new ob();
          var5.field_a = this.field_A;
          var4.field_b = this.field_y;
          var3.field_b = ii.field_e[0].field_y;
          var3.field_a = ii.field_e[0].field_A;
          if (param0 == 5) {
            break L0;
          } else {
            this.d(69);
            break L0;
          }
        }
        L1: {
          if (ii.field_e[0].field_s != 0) {
            break L1;
          } else {
            if (this.field_q == null) {
              break L1;
            } else {
              if (null == ii.field_e[0].field_q) {
                break L1;
              } else {
                if (!j.a(this.field_q, var5.field_b, var4.field_a, ii.field_e[0].field_q, var3.field_b, var3.field_a)) {
                  break L1;
                } else {
                  if ((this.field_B ^ -1) != -22) {
                    L2: {
                      this.field_e = 40;
                      this.field_r = 0;
                      this.field_B = 21;
                      this.field_o = 0;
                      if (-33 == (this.field_d ^ -1)) {
                        this.field_o = 0;
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                    L3: {
                      if (-49 != (this.field_d ^ -1)) {
                        break L3;
                      } else {
                        this.field_o = 1;
                        break L3;
                      }
                    }
                    L4: {
                      if (64 != this.field_d) {
                        break L4;
                      } else {
                        this.field_o = 2;
                        break L4;
                      }
                    }
                    L5: {
                      if (qh.field_l <= 1) {
                        break L5;
                      } else {
                        if ((this.field_o ^ -1) > -6) {
                          this.field_o = this.field_o + 1;
                          break L5;
                        } else {
                          break L5;
                        }
                      }
                    }
                    L6: {
                      if (3 >= qh.field_l) {
                        break L6;
                      } else {
                        if (this.field_o < 5) {
                          this.field_o = this.field_o + 1;
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                    }
                    this.field_d = 32;
                    this.field_o = this.field_o + 1;
                    this.field_p = 0;
                    if (!pk.field_s) {
                      break L1;
                    } else {
                      tl.field_a.a(si.field_j[6], 100, 256 * ee.field_p / 100);
                      break L1;
                    }
                  } else {
                    L7: {
                      if (this.field_o == 0) {
                        hi.field_c = hi.field_c + 640;
                        sg.field_f = sg.field_f + 10;
                        if (-6 != (qh.field_l ^ -1)) {
                          break L7;
                        } else {
                          if (!ve.a((byte) 110, 0)) {
                            break L7;
                          } else {
                            this.d(-1569);
                            break L7;
                          }
                        }
                      } else {
                        break L7;
                      }
                    }
                    L8: {
                      if (this.field_o != 1) {
                        break L8;
                      } else {
                        sg.field_f = sg.field_f + 25;
                        wg.field_b = wg.field_b + 1600;
                        break L8;
                      }
                    }
                    L9: {
                      if (this.field_o != 2) {
                        break L9;
                      } else {
                        me.field_f = me.field_f - 3200;
                        sg.field_f = sg.field_f + 50;
                        if (5 != qh.field_l) {
                          break L9;
                        } else {
                          if (!ve.a((byte) 89, 0)) {
                            break L9;
                          } else {
                            this.d(param0 ^ -1574);
                            break L9;
                          }
                        }
                      }
                    }
                    L10: {
                      if (-4 != (this.field_o ^ -1)) {
                        break L10;
                      } else {
                        sg.field_f = sg.field_f + 75;
                        ic.field_a = ic.field_a - 4800;
                        break L10;
                      }
                    }
                    L11: {
                      if ((this.field_o ^ -1) == -5) {
                        sg.field_f = sg.field_f + 100;
                        hi.field_c = hi.field_c + 6400;
                        break L11;
                      } else {
                        break L11;
                      }
                    }
                    L12: {
                      if (-6 != (this.field_o ^ -1)) {
                        break L12;
                      } else {
                        wg.field_b = wg.field_b + 9600;
                        sg.field_f = sg.field_f + 150;
                        break L12;
                      }
                    }
                    L13: {
                      if (6 == this.field_o) {
                        me.field_f = me.field_f - 16000;
                        sg.field_f = sg.field_f + 250;
                        break L13;
                      } else {
                        break L13;
                      }
                    }
                    L14: {
                      if (this.field_o == 7) {
                        ic.field_a = ic.field_a - 32000;
                        sg.field_f = sg.field_f + 500;
                        break L14;
                      } else {
                        break L14;
                      }
                    }
                    L15: {
                      if (pk.field_s) {
                        stackIn_34_0 = 0;
                        break L15;
                      } else {
                        stackIn_34_0 = 1;
                        break L15;
                      }
                    }
                    L16: {
                      if (stackIn_34_0 != 0) {
                        break L16;
                      } else {
                        tl.field_a.a(si.field_j[7], 100, ee.field_p * 256 / 100);
                        break L16;
                      }
                    }
                    this.field_w = 0;
                    this.field_B = 44;
                    break L1;
                  }
                }
              }
            }
          }
        }
    }

    final void d(boolean param0) {
        Object stackIn_86_0 = null;
        Object stackIn_87_0 = null;
        int stackIn_87_1 = 0;
        Object stackIn_89_0 = null;
        Object stackIn_90_0 = null;
        int stackIn_90_1 = 0;
        Object stackIn_102_0 = null;
        Object stackIn_103_0 = null;
        int stackIn_103_1 = 0;
        Object stackIn_114_0 = null;
        Object stackIn_115_0 = null;
        int stackIn_115_1 = 0;
        Object stackIn_124_0 = null;
        Object stackIn_125_0 = null;
        int stackIn_125_1 = 0;
        int var2;
        int var3;
        int var4;
        int var5;
        double var6;
        int var8;
        int var9;
        int var10;
        int var11;
        double var11_double;
        int var12;
        int var13;
        int var14;
        int var15;
        L0: {
          var15 = wizardrun.field_H;
          this.field_q = null;
          var2 = 32 * this.field_f.field_b / 240 + 32 * this.field_i.field_b;
          var3 = 32 * (-1 + (15 + -this.field_i.field_a)) - 32 * this.field_f.field_a / 240;
          var3 = var3 - (this.field_d + -32);
          if (param0) {
            break L0;
          } else {
            this.a(-46, -3, (byte) 15);
            break L0;
          }
        }
        L1: {
          var11 = this.field_B;
          if (var11 != 0) {
            if ((var11 ^ -1) == -2) {
              L2: {
                var5 = this.field_f.field_b + (240 * this.field_i.field_b - -this.field_w);
                if (0 > this.field_w) {
                  break L2;
                } else {
                  if (-11 > (this.field_w ^ -1)) {
                    break L2;
                  } else {
                    ob.field_c.a(12 + var2, var3 + 12, -87, 128, var5);
                    break L2;
                  }
                }
              }
              L3: {
                if (10 >= this.field_w) {
                  break L3;
                } else {
                  if (this.field_w <= 15) {
                    ob.field_c.a(12 + var2, var3 - -12, -119, 112, var5);
                    break L3;
                  } else {
                    break L3;
                  }
                }
              }
              L4: {
                if ((this.field_w ^ -1) >= -16) {
                  break L4;
                } else {
                  if (20 >= this.field_w) {
                    ob.field_c.a(var2 - -12, var3 - -12, -96, 96, var5);
                    break L4;
                  } else {
                    break L4;
                  }
                }
              }
              L5: {
                if ((this.field_w ^ -1) >= -21) {
                  if (this.field_w <= 25) {
                    break L5;
                  } else {
                    if (30 < this.field_w) {
                      break L5;
                    } else {
                      ob.field_c.a(12 + var2, 12 + var3, -121, 64, var5);
                      break L5;
                    }
                  }
                } else {
                  if (this.field_w <= 25) {
                    break L5;
                  } else {
                    if (30 < this.field_w) {
                      break L5;
                    } else {
                      ob.field_c.a(12 + var2, 12 + var3, -121, 64, var5);
                      break L5;
                    }
                  }
                }
              }
              this.field_q = ob.field_c;
              this.field_A = var3;
              this.field_y = var2;
              break L1;
            } else {
              if (-3 == (var11 ^ -1)) {
                var11 = 0;
                L6: while (true) {
                  if (10 <= var11) {
                    this.field_A = var3;
                    this.field_y = var2;
                    this.field_q = ec.field_b;
                    break L1;
                  } else {
                    var6 = 6.28 * (double)var11 / 10.0 + (double)this.field_w;
                    ob.field_c.d(-6 + (var2 - -(int)(32.0 * Math.cos(var6) + 32.0)), -6 + (var3 - -(int)(32.0 + 32.0 * Math.sin(var6))), 12, 12, 255 - 10 * var11);
                    var11++;
                    continue L6;
                  }
                }
              } else {
                if (3 != var11) {
                  if (var11 == 4) {
                    this.a(32, 1, (byte) 62);
                    break L1;
                  } else {
                    if (5 == var11) {
                      this.a(40, 2, (byte) 62);
                      break L1;
                    } else {
                      if (var11 == 6) {
                        this.a(40, 4, (byte) 62);
                        break L1;
                      } else {
                        if (var11 != 7) {
                          if (8 == var11) {
                            this.a(32, 1, (byte) 62);
                            break L1;
                          } else {
                            if (-10 == (var11 ^ -1)) {
                              this.a(32, 2, (byte) 62);
                              break L1;
                            } else {
                              if (-11 == (var11 ^ -1)) {
                                this.a(40, 3, (byte) 62);
                                break L1;
                              } else {
                                if (var11 == 11) {
                                  if (0 != (this.field_h ^ -1)) {
                                    oc.field_b[3][29].d(var2, var3);
                                    this.field_q = oc.field_b[3][29].c();
                                    this.field_A = var3;
                                    this.field_y = var2;
                                    break L1;
                                  } else {
                                    oc.field_b[3][29].e(var2, var3);
                                    this.field_y = var2;
                                    this.field_A = var3;
                                    this.field_q = oc.field_b[3][29];
                                    break L1;
                                  }
                                } else {
                                  if (var11 != 12) {
                                    if (var11 == 13) {
                                      this.a(32, 0, (byte) 62);
                                      break L1;
                                    } else {
                                      if (14 != var11) {
                                        if (-16 == (var11 ^ -1)) {
                                          this.a(40, 2, (byte) 62);
                                          break L1;
                                        } else {
                                          if ((var11 ^ -1) != -17) {
                                            if (-18 != (var11 ^ -1)) {
                                              if (18 != var11) {
                                                if ((var11 ^ -1) == -20) {
                                                  L7: {
                                                    if (37 <= this.field_n) {
                                                      break L7;
                                                    } else {
                                                      this.field_n = 37;
                                                      break L7;
                                                    }
                                                  }
                                                  if ((this.field_h ^ -1) != -2) {
                                                    oc.field_b[3][this.field_n].d(var2, var3);
                                                    this.field_q = oc.field_b[3][this.field_n].c();
                                                    this.field_y = var2;
                                                    this.field_A = var3;
                                                    break L1;
                                                  } else {
                                                    oc.field_b[3][this.field_n].e(var2, var3);
                                                    this.field_q = oc.field_b[3][this.field_n];
                                                    this.field_A = var3;
                                                    this.field_y = var2;
                                                    break L1;
                                                  }
                                                } else {
                                                  if (var11 == 25) {
                                                    L8: {
                                                      if (-37 >= (this.field_n ^ -1)) {
                                                        break L8;
                                                      } else {
                                                        this.field_n = 36;
                                                        break L8;
                                                      }
                                                    }
                                                    if (0 != (this.field_h ^ -1)) {
                                                      oc.field_b[4][this.field_n].d(var2, var3);
                                                      this.field_q = oc.field_b[4][this.field_n].c();
                                                      this.field_A = var3;
                                                      this.field_y = var2;
                                                      break L1;
                                                    } else {
                                                      oc.field_b[4][this.field_n].e(var2, var3);
                                                      this.field_q = oc.field_b[4][this.field_n];
                                                      this.field_y = var2;
                                                      this.field_A = var3;
                                                      break L1;
                                                    }
                                                  } else {
                                                    if (-21 != (var11 ^ -1)) {
                                                      if (21 == var11) {
                                                        L9: {
                                                          if (0 <= this.field_o) {
                                                            break L9;
                                                          } else {
                                                            this.field_o = 0;
                                                            break L9;
                                                          }
                                                        }
                                                        L10: {
                                                          if ((this.field_o ^ -1) < -8) {
                                                            this.field_o = 7;
                                                            break L10;
                                                          } else {
                                                            break L10;
                                                          }
                                                        }
                                                        L11: {
                                                          L12: {
                                                            L13: {
                                                              if (this.field_o == 0) {
                                                                break L13;
                                                              } else {
                                                                if (-3 != (this.field_o ^ -1)) {
                                                                  break L12;
                                                                } else {
                                                                  break L13;
                                                                }
                                                              }
                                                            }
                                                            if (-6 != (qh.field_l ^ -1)) {
                                                              break L12;
                                                            } else {
                                                              if (ve.a((byte) 123, 0)) {
                                                                jj.field_a[8].e(var2, var3);
                                                                break L11;
                                                              } else {
                                                                break L12;
                                                              }
                                                            }
                                                          }
                                                          jj.field_a[this.field_o].e(var2, var3);
                                                          break L11;
                                                        }
                                                        this.field_q = jj.field_a[this.field_o];
                                                        this.field_y = var2;
                                                        this.field_A = var3;
                                                        break L1;
                                                      } else {
                                                        if (22 == var11) {
                                                          this.a(40, 0, (byte) 62);
                                                          break L1;
                                                        } else {
                                                          if (23 != var11) {
                                                            if (24 != var11) {
                                                              if (-27 != (var11 ^ -1)) {
                                                                if (var11 != 27) {
                                                                  if (-29 == (var11 ^ -1)) {
                                                                    oc.field_b[4][36].e(var2, var3);
                                                                    this.field_y = var2;
                                                                    this.field_q = oc.field_b[4][36];
                                                                    this.field_A = var3;
                                                                    break L1;
                                                                  } else {
                                                                    if (-30 == (var11 ^ -1)) {
                                                                      this.a(40, 0, (byte) 62);
                                                                      break L1;
                                                                    } else {
                                                                      if (-31 == (var11 ^ -1)) {
                                                                        this.a(40, 1, (byte) 62);
                                                                        break L1;
                                                                      } else {
                                                                        if ((var11 ^ -1) != -32) {
                                                                          if (var11 != 32) {
                                                                            if (-34 != (var11 ^ -1)) {
                                                                              if (-35 == (var11 ^ -1)) {
                                                                                if (-1 != this.field_h) {
                                                                                  oc.field_b[0][37].d(var2, var3);
                                                                                  this.field_q = oc.field_b[0][37].c();
                                                                                  this.field_y = var2;
                                                                                  this.field_A = var3;
                                                                                  break L1;
                                                                                } else {
                                                                                  oc.field_b[0][37].e(var2, var3);
                                                                                  this.field_q = oc.field_b[0][37];
                                                                                  this.field_y = var2;
                                                                                  this.field_A = var3;
                                                                                  break L1;
                                                                                }
                                                                              } else {
                                                                                L14: {
                                                                                  if (35 != var11) {
                                                                                    if ((var11 ^ -1) != -43) {
                                                                                      if ((var11 ^ -1) == -44) {
                                                                                        L15: {
                                                                                          var9 = 37;
                                                                                          if (-3 <= (this.field_w ^ -1)) {
                                                                                            break L15;
                                                                                          } else {
                                                                                            var9 = 36;
                                                                                            break L15;
                                                                                          }
                                                                                        }
                                                                                        L16: {
                                                                                          if (20 < this.field_w) {
                                                                                            var9 = 35;
                                                                                            break L16;
                                                                                          } else {
                                                                                            break L16;
                                                                                          }
                                                                                        }
                                                                                        if ((this.field_h ^ -1) == -2) {
                                                                                          oc.field_b[4][var9].e(var2, var3);
                                                                                          this.field_q = oc.field_b[4][var9];
                                                                                          this.field_y = var2;
                                                                                          this.field_A = var3;
                                                                                          break L1;
                                                                                        } else {
                                                                                          oc.field_b[4][var9].d(var2, var3);
                                                                                          this.field_q = oc.field_b[4][var9].c();
                                                                                          this.field_y = var2;
                                                                                          this.field_A = var3;
                                                                                          break L1;
                                                                                        }
                                                                                      } else {
                                                                                        if (-37 == (var11 ^ -1)) {
                                                                                          this.a(24, 0, (byte) 62);
                                                                                          break L1;
                                                                                        } else {
                                                                                          if (37 == var11) {
                                                                                            this.a(56, 1, (byte) 62);
                                                                                            break L1;
                                                                                          } else {
                                                                                            if (-39 != (var11 ^ -1)) {
                                                                                              if ((var11 ^ -1) != -40) {
                                                                                                if ((var11 ^ -1) != -41) {
                                                                                                  if (var11 != 41) {
                                                                                                    if (-45 != (var11 ^ -1)) {
                                                                                                      if (var11 != 45) {
                                                                                                        break L1;
                                                                                                      } else {
                                                                                                        this.a(40, 4, (byte) 62);
                                                                                                        break L1;
                                                                                                      }
                                                                                                    } else {
                                                                                                      L17: {
                                                                                                        var10 = 0;
                                                                                                        if (this.field_o != 0) {
                                                                                                          break L17;
                                                                                                        } else {
                                                                                                          var10 = 10;
                                                                                                          break L17;
                                                                                                        }
                                                                                                      }
                                                                                                      L18: {
                                                                                                        if (this.field_o == 1) {
                                                                                                          var10 = 25;
                                                                                                          break L18;
                                                                                                        } else {
                                                                                                          break L18;
                                                                                                        }
                                                                                                      }
                                                                                                      L19: {
                                                                                                        if (-3 != (this.field_o ^ -1)) {
                                                                                                          break L19;
                                                                                                        } else {
                                                                                                          var10 = 50;
                                                                                                          break L19;
                                                                                                        }
                                                                                                      }
                                                                                                      L20: {
                                                                                                        if (-4 != (this.field_o ^ -1)) {
                                                                                                          break L20;
                                                                                                        } else {
                                                                                                          var10 = 75;
                                                                                                          break L20;
                                                                                                        }
                                                                                                      }
                                                                                                      L21: {
                                                                                                        if (4 != this.field_o) {
                                                                                                          break L21;
                                                                                                        } else {
                                                                                                          var10 = 100;
                                                                                                          break L21;
                                                                                                        }
                                                                                                      }
                                                                                                      L22: {
                                                                                                        if (5 == this.field_o) {
                                                                                                          var10 = 150;
                                                                                                          break L22;
                                                                                                        } else {
                                                                                                          break L22;
                                                                                                        }
                                                                                                      }
                                                                                                      L23: {
                                                                                                        if ((this.field_o ^ -1) != -7) {
                                                                                                          break L23;
                                                                                                        } else {
                                                                                                          var10 = 250;
                                                                                                          break L23;
                                                                                                        }
                                                                                                      }
                                                                                                      L24: {
                                                                                                        if ((this.field_o ^ -1) == -8) {
                                                                                                          var10 = 500;
                                                                                                          break L24;
                                                                                                        } else {
                                                                                                          break L24;
                                                                                                        }
                                                                                                      }
                                                                                                      a.field_a.b(Integer.toString(var10), 16 + var2, var3 - 1, 0, -1);
                                                                                                      a.field_a.b(Integer.toString(var10), 16 + var2, var3 - -1, 0, -1);
                                                                                                      a.field_a.b(Integer.toString(var10), var2 - -16 - 1, var3, 0, -1);
                                                                                                      a.field_a.b(Integer.toString(var10), 17 + var2, var3, 0, -1);
                                                                                                      a.field_a.b(Integer.toString(var10), var2 - -16, var3, 16777215, -1);
                                                                                                      break L1;
                                                                                                    }
                                                                                                  } else {
                                                                                                    if (0 == (this.field_h ^ -1)) {
                                                                                                      h.field_j[this.field_n].e(var2, var3);
                                                                                                      this.field_q = h.field_j[this.field_n];
                                                                                                      this.field_A = var3;
                                                                                                      this.field_y = var2;
                                                                                                      break L1;
                                                                                                    } else {
                                                                                                      h.field_j[this.field_n].d(var2, var3);
                                                                                                      this.field_q = h.field_j[this.field_n].c();
                                                                                                      this.field_A = var3;
                                                                                                      this.field_y = var2;
                                                                                                      break L1;
                                                                                                    }
                                                                                                  }
                                                                                                } else {
                                                                                                  this.a(40, 4, (byte) 62);
                                                                                                  break L1;
                                                                                                }
                                                                                              } else {
                                                                                                this.a(40, 3, (byte) 62);
                                                                                                break L1;
                                                                                              }
                                                                                            } else {
                                                                                              this.a(40, 2, (byte) 62);
                                                                                              break L1;
                                                                                            }
                                                                                          }
                                                                                        }
                                                                                      }
                                                                                    } else {
                                                                                      break L14;
                                                                                    }
                                                                                  } else {
                                                                                    break L14;
                                                                                  }
                                                                                }
                                                                                L25: {
                                                                                  var9 = 37;
                                                                                  if (-3 <= (this.field_w ^ -1)) {
                                                                                    break L25;
                                                                                  } else {
                                                                                    var9 = 36;
                                                                                    break L25;
                                                                                  }
                                                                                }
                                                                                L26: {
                                                                                  if ((this.field_w ^ -1) >= -21) {
                                                                                    break L26;
                                                                                  } else {
                                                                                    var9 = 35;
                                                                                    break L26;
                                                                                  }
                                                                                }
                                                                                if (-1 == this.field_h) {
                                                                                  oc.field_b[1][var9].e(var2, var3);
                                                                                  this.field_q = oc.field_b[1][var9];
                                                                                  this.field_A = var3;
                                                                                  this.field_y = var2;
                                                                                  break L1;
                                                                                } else {
                                                                                  oc.field_b[1][var9].d(var2, var3);
                                                                                  this.field_q = oc.field_b[1][var9].c();
                                                                                  this.field_A = var3;
                                                                                  this.field_y = var2;
                                                                                  break L1;
                                                                                }
                                                                              }
                                                                            } else {
                                                                              this.field_h = -this.field_h;
                                                                              this.a(56, 4, (byte) 62);
                                                                              this.field_h = -this.field_h;
                                                                              break L1;
                                                                            }
                                                                          } else {
                                                                            this.a(56, 3, (byte) 62);
                                                                            break L1;
                                                                          }
                                                                        } else {
                                                                          this.a(56, 2, (byte) 62);
                                                                          break L1;
                                                                        }
                                                                      }
                                                                    }
                                                                  }
                                                                } else {
                                                                  oc.field_b[4][37].e(var2, var3);
                                                                  this.field_A = var3;
                                                                  this.field_y = var2;
                                                                  this.field_q = oc.field_b[4][37];
                                                                  break L1;
                                                                }
                                                              } else {
                                                                this.a(96, 4, (byte) 62);
                                                                break L1;
                                                              }
                                                            } else {
                                                              this.a(40, 2, (byte) 62);
                                                              break L1;
                                                            }
                                                          } else {
                                                            this.a(80, 1, (byte) 62);
                                                            break L1;
                                                          }
                                                        }
                                                      }
                                                    } else {
                                                      L27: {
                                                        this.field_w = this.field_w + 2;
                                                        var8 = this.field_w;
                                                        var4 = -this.field_w + 128;
                                                        if (-1 <= (var4 ^ -1)) {
                                                          break L27;
                                                        } else {
                                                          rk.field_m.d(var2 + -var8, var3 - var8, 2 * var8, var8 * 2, var4);
                                                          break L27;
                                                        }
                                                      }
                                                      if ((this.field_w ^ -1) >= -121) {
                                                        break L1;
                                                      } else {
                                                        this.field_k = 1;
                                                        break L1;
                                                      }
                                                    }
                                                  }
                                                }
                                              } else {
                                                L28: {
                                                  if (this.field_n < 34) {
                                                    this.field_n = 34;
                                                    break L28;
                                                  } else {
                                                    break L28;
                                                  }
                                                }
                                                if (-2 == (this.field_h ^ -1)) {
                                                  oc.field_b[2][this.field_n].e(var2, var3);
                                                  this.field_q = oc.field_b[2][this.field_n];
                                                  this.field_y = var2;
                                                  this.field_A = var3;
                                                  break L1;
                                                } else {
                                                  oc.field_b[2][this.field_n].d(var2 + -24, var3);
                                                  this.field_q = oc.field_b[2][this.field_n].c();
                                                  this.field_y = -24 + var2;
                                                  this.field_A = var3;
                                                  break L1;
                                                }
                                              }
                                            } else {
                                              this.a(80, 4, (byte) 62);
                                              break L1;
                                            }
                                          } else {
                                            this.a(40, 3, (byte) 62);
                                            break L1;
                                          }
                                        }
                                      } else {
                                        this.field_h = -this.field_h;
                                        this.a(40, 1, (byte) 62);
                                        this.field_h = -this.field_h;
                                        break L1;
                                      }
                                    }
                                  } else {
                                    this.field_h = -this.field_h;
                                    this.a(40, 4, (byte) 62);
                                    this.field_h = -this.field_h;
                                    break L1;
                                  }
                                }
                              }
                            }
                          }
                        } else {
                          this.a(40, 0, (byte) 62);
                          break L1;
                        }
                      }
                    }
                  }
                } else {
                  this.a(32, 0, (byte) 62);
                  break L1;
                }
              }
            }
          } else {
            if (0 > qh.field_g) {
              break L1;
            } else {
              if (!pg.field_q) {
                L29: {
                  if ((this.field_h ^ -1) == 0) {
                    ve.field_c[this.field_n].e(var2, var3);
                    this.field_q = ra.field_m[this.field_n];
                    this.field_y = var2;
                    this.field_A = var3;
                    break L29;
                  } else {
                    ve.field_c[this.field_n].d(var2, var3);
                    this.field_q = ra.field_m[this.field_n].c();
                    this.field_A = var3;
                    this.field_y = var2;
                    break L29;
                  }
                }
                L30: {
                  if (0 > nk.field_T) {
                    break L30;
                  } else {
                    if (300 <= nk.field_T) {
                      break L30;
                    } else {
                      if (250 >= sj.field_l) {
                        break L30;
                      } else {
                        L31: {
                          if (-1 < (nk.field_T ^ -1)) {
                            break L31;
                          } else {
                            if (nk.field_T < 50) {
                              L32: {
                                stackIn_86_0 = this;

                                if ((uc.field_g ^ -1) > -21) {
                                  stackIn_87_0 = this;
                                  stackIn_87_1 = 16711680;
                                  break L32;
                                } else {
                                  stackIn_87_0 = this;
                                  stackIn_87_1 = 16776960;
                                  break L32;
                                }
                              }
                              L33: {
                                this.a(stackIn_87_1, var2, true, "(", 32 + var3);
                                stackIn_89_0 = this;

                                if ((uc.field_g ^ -1) > -21) {
                                  stackIn_90_0 = this;
                                  stackIn_90_1 = 16711680;
                                  break L33;
                                } else {
                                  stackIn_90_0 = this;
                                  stackIn_90_1 = 16776960;
                                  break L33;
                                }
                              }
                              this.a(stackIn_90_1, ve.field_c[this.field_n].field_x + var2, true, ")", 32 + var3);
                              break L31;
                            } else {
                              break L31;
                            }
                          }
                        }
                        L34: {
                          if ((nk.field_T ^ -1) > -51) {
                            break L34;
                          } else {
                            if ((nk.field_T ^ -1) > -101) {
                              L35: {
                                var11 = jj.field_b.b(di.a(new String[]{wl.field_h[hh.field_S], wl.field_h[nf.field_d]}, (byte) 126, ka.field_g));
                                var12 = var2 - -(ve.field_c[this.field_n].field_x / 2);
                                if (var12 < var11 / 2) {
                                  var12 = var11 / 2;
                                  break L35;
                                } else {
                                  break L35;
                                }
                              }
                              L36: {
                                if (var12 > 640 + -(var11 / 2)) {
                                  var12 = -(var11 / 2) + 640;
                                  break L36;
                                } else {
                                  break L36;
                                }
                              }
                              L37: {
                                stackIn_102_0 = this;

                                if (uc.field_g < 20) {
                                  stackIn_103_0 = this;
                                  stackIn_103_1 = 16711680;
                                  break L37;
                                } else {
                                  stackIn_103_0 = this;
                                  stackIn_103_1 = 16776960;
                                  break L37;
                                }
                              }
                              this.a(stackIn_103_1, var12, true, di.a(new String[]{wl.field_h[hh.field_S], wl.field_h[nf.field_d]}, (byte) 107, ka.field_g), -4 + var3);
                              break L34;
                            } else {
                              break L34;
                            }
                          }
                        }
                        L38: {
                          if (nk.field_T < 100) {
                            break L38;
                          } else {
                            if (nk.field_T < 150) {
                              L39: {
                                var11 = jj.field_b.b(di.a(new String[]{wl.field_h[hh.field_S], wl.field_h[nf.field_d]}, (byte) 59, wb.field_a));
                                var12 = var2 + ve.field_c[this.field_n].field_x / 2;
                                if (var11 / 2 <= var12) {
                                  break L39;
                                } else {
                                  var12 = var11 / 2;
                                  break L39;
                                }
                              }
                              L40: {
                                if (var12 > -(var11 / 2) + 640) {
                                  var12 = -(var11 / 2) + 640;
                                  break L40;
                                } else {
                                  break L40;
                                }
                              }
                              L41: {
                                stackIn_114_0 = this;

                                if (-21 >= (uc.field_g ^ -1)) {
                                  stackIn_115_0 = this;
                                  stackIn_115_1 = 16776960;
                                  break L41;
                                } else {
                                  stackIn_115_0 = this;
                                  stackIn_115_1 = 16711680;
                                  break L41;
                                }
                              }
                              this.a(stackIn_115_1, var12, true, di.a(new String[]{wl.field_h[hh.field_S], wl.field_h[nf.field_d]}, (byte) 61, wb.field_a), var3 - 4);
                              break L38;
                            } else {
                              break L38;
                            }
                          }
                        }
                        if (-151 < (nk.field_T ^ -1)) {
                          break L30;
                        } else {
                          if (-201 >= (nk.field_T ^ -1)) {
                            break L30;
                          } else {
                            L42: {
                              var11 = jj.field_b.b(di.a(new String[]{wl.field_h[hh.field_S], wl.field_h[nf.field_d]}, (byte) 66, ei.field_m));
                              var12 = var2 - -(ve.field_c[this.field_n].field_x / 2);
                              if (var11 / 2 <= var12) {
                                break L42;
                              } else {
                                var12 = var11 / 2;
                                break L42;
                              }
                            }
                            L43: {
                              if (-(var11 / 2) + 640 >= var12) {
                                break L43;
                              } else {
                                var12 = -(var11 / 2) + 640;
                                break L43;
                              }
                            }
                            L44: {
                              stackIn_124_0 = this;

                              if (20 > uc.field_g) {
                                stackIn_125_0 = this;
                                stackIn_125_1 = 16711680;
                                break L44;
                              } else {
                                stackIn_125_0 = this;
                                stackIn_125_1 = 16776960;
                                break L44;
                              }
                            }
                            this.a(stackIn_125_1, var12, true, di.a(new String[]{wl.field_h[hh.field_S], wl.field_h[nf.field_d]}, (byte) 46, ei.field_m), -4 + var3);
                            break L30;
                          }
                        }
                      }
                    }
                  }
                }
                L45: {
                  if (-1 <= (cd.field_e ^ -1)) {
                    break L45;
                  } else {
                    if (7 <= cd.field_e % 10) {
                      break L45;
                    } else {
                      if (1 < cd.field_e % 10) {
                        if ((this.field_h ^ -1) != 0) {
                          ve.field_c[this.field_n].c().b(var2, var3, 16777215);
                          break L45;
                        } else {
                          ve.field_c[this.field_n].b(var2, var3, 16777215);
                          break L45;
                        }
                      } else {
                        break L45;
                      }
                    }
                  }
                }
                if (120 <= fi.field_x) {
                  break L1;
                } else {
                  var4 = 256 * fi.field_x / 120;
                  var11_double = 0.0;
                  var13 = 0;
                  L46: while (true) {
                    if (var13 >= 5) {
                      break L1;
                    } else {
                      L47: {
                        var11_double = (double)fi.field_x + 6.28 * (double)var13 / 5.0;
                        var14 = 32;
                        if (100 >= fi.field_x) {
                          break L47;
                        } else {
                          var14 = var14 + (10 - Math.abs(-110 + fi.field_x));
                          break L47;
                        }
                      }
                      ob.field_c.d(-6 + var2 + (int)(Math.cos(var11_double) * (double)var14 + 32.0), -6 + ((int)(32.0 + Math.sin(var11_double) * (double)var14) + var3), 12, 12, var4);
                      var13++;
                      continue L46;
                    }
                  }
                }
              } else {
                break L1;
              }
            }
          }
        }
    }

    private final void c(int param0) {
        tl.field_a.a(si.field_j[10], 100, ee.field_p * 256 / 100);
        if (param0 != 1) {
            tg var3 = (tg) null;
            this.a(-123, (byte) -40, (tg) null, true);
        }
    }

    private final boolean a(boolean param0, tg param1, int param2) {
        int stackIn_22_0 = 0;
        int stackIn_35_0 = 0;
        int stackIn_37_0 = 0;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_41_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          L0: {
            L1: {
              this.field_z = this.field_z + 1;
              this.field_n = param2;
              if ((this.field_s ^ -1) >= -1) {
                break L1;
              } else {
                if (!param0) {
                  L2: {
                    this.field_s = this.field_s - 1;
                    this.field_p = this.field_p - 1;
                    if (-1 > (this.field_p ^ -1)) {
                      if (!pk.field_s) {
                        break L2;
                      } else {
                        if (!param0) {
                          this.c(param2 ^ 24);
                          break L2;
                        } else {
                          break L2;
                        }
                      }
                    } else {
                      if (!pk.field_s) {
                        break L2;
                      } else {
                        if (!param0) {
                          this.c(false);
                          break L2;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                  if (0 < this.field_p) {
                    break L1;
                  } else {
                    this.field_e = 60;
                    break L1;
                  }
                } else {
                  break L1;
                }
              }
            }
            if (param0) {
              L3: {
                if (this.field_z <= 15) {
                  break L3;
                } else {
                  this.field_n = 26;
                  break L3;
                }
              }
              L4: {
                if (this.field_z <= 30) {
                  break L4;
                } else {
                  this.field_n = 27;
                  break L4;
                }
              }
              L5: {
                if ((this.field_z ^ -1) >= -41) {
                  break L5;
                } else {
                  this.field_n = 28;
                  break L5;
                }
              }
              L6: {
                if ((this.field_z ^ -1) < -51) {
                  this.field_z = 0;
                  this.field_x = 0;
                  break L6;
                } else {
                  break L6;
                }
              }
              if (this.field_z == 40) {
                stackIn_35_0 = 1;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                return false;
              }
            } else {
              L7: {
                if (-36 > (this.field_z ^ -1)) {
                  this.field_n = 26;
                  break L7;
                } else {
                  break L7;
                }
              }
              L8: {
                if (this.field_z <= 50) {
                  break L8;
                } else {
                  this.field_x = 0;
                  this.field_z = 0;
                  break L8;
                }
              }
              if ((this.field_z ^ -1) != -36) {
                stackIn_37_0 = 0;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackIn_22_0 = 1;
                decompiledRegionSelector0 = 0;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var4 = decompiledCaughtException;
            stackIn_40_0 = (RuntimeException) (var4);

            stackIn_40_1 = new StringBuilder().append("eg.AA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_41_0 = (RuntimeException) ((Object) stackIn_40_0);
              stackIn_41_1 = (StringBuilder) ((Object) stackIn_40_1);
              stackIn_41_2 = "null";
              break L9;
            } else {
              stackIn_41_0 = (RuntimeException) ((Object) stackIn_40_0);
              stackIn_41_1 = (StringBuilder) ((Object) stackIn_40_1);
              stackIn_41_2 = "{...}";
              break L9;
            }
          }
          throw bd.a((Throwable) ((Object) stackIn_41_0), stackIn_41_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_22_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_35_0 != 0;
          } else {
            return stackIn_37_0 != 0;
          }
        }
    }

    private final void a(int param0, byte param1, tg param2, boolean param3) {
        int fieldTemp$0 = 0;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_43_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        ob var7 = null;
        ob var8 = null;
        var6 = wizardrun.field_H;
        try {
          L0: {
            L1: {
              if (0 <= this.field_e) {
                L2: {
                  L3: {
                    this.field_e = this.field_e + 3;
                    var7 = new ob(this.field_i);
                    var8 = var7;
                    var8.field_a = var8.field_a + 1;
                    if (param2.field_f[var7.a((byte) -68)] == 1) {
                      break L3;
                    } else {
                      if ((var8.field_a ^ -1) > -15) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  this.field_e = -Math.abs(this.field_e);
                  break L2;
                }
                if (-21 > (this.field_e ^ -1)) {
                  this.field_e = 5;
                  break L1;
                } else {
                  break L1;
                }
              } else {
                if (19 < (this.field_e ^ -1)) {
                  this.field_e = -5;
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            L4: {
              var5_int = 64 % ((param1 - 58) / 56);
              fieldTemp$0 = this.field_z;
              this.field_z = this.field_z - 1;
              if (0 < fieldTemp$0) {
                break L4;
              } else {
                L5: {
                  this.field_o = this.field_o + 1;
                  this.field_z = 5;
                  if (1 < this.field_o) {
                    this.field_o = 0;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                L6: {
                  this.field_n = this.field_n + 1;
                  if (param3) {
                    this.field_z = 5;
                    if (9 < this.field_n) {
                      this.field_n = 2;
                      break L6;
                    } else {
                      break L6;
                    }
                  } else {
                    if (5 < this.field_n) {
                      this.field_n = 2;
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                }
                if ((this.field_n ^ -1) <= -3) {
                  break L4;
                } else {
                  this.field_n = 2;
                  break L4;
                }
              }
            }
            L7: {
              if (this.field_e == 0) {
                this.field_e = 20;
                break L7;
              } else {
                break L7;
              }
            }
            L8: {
              this.a(1, si.field_j, param2, 1, param0, 1, tl.field_a, pk.field_s, (byte) 127);
              if ((this.field_s ^ -1) >= -1) {
                break L8;
              } else {
                if (param3) {
                  break L8;
                } else {
                  L9: {
                    this.field_s = this.field_s - 1;
                    this.field_p = this.field_p - 1;
                    if (0 >= this.field_p) {
                      if (!pk.field_s) {
                        break L9;
                      } else {
                        if (!param3) {
                          this.c(false);
                          break L9;
                        } else {
                          break L9;
                        }
                      }
                    } else {
                      if (!pk.field_s) {
                        break L9;
                      } else {
                        this.c(1);
                        break L9;
                      }
                    }
                  }
                  if (-1 > (this.field_p ^ -1)) {
                    break L8;
                  } else {
                    this.field_e = 60;
                    break L8;
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var5 = decompiledCaughtException;
            stackIn_42_0 = (RuntimeException) (var5);

            stackIn_42_1 = new StringBuilder().append("eg.K(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_43_0 = (RuntimeException) ((Object) stackIn_42_0);
              stackIn_43_1 = (StringBuilder) ((Object) stackIn_42_1);
              stackIn_43_2 = "null";
              break L10;
            } else {
              stackIn_43_0 = (RuntimeException) ((Object) stackIn_42_0);
              stackIn_43_1 = (StringBuilder) ((Object) stackIn_42_1);
              stackIn_43_2 = "{...}";
              break L10;
            }
          }
          throw bd.a((Throwable) ((Object) stackIn_43_0), stackIn_43_2 + ',' + param3 + ')');
        }
    }

    private final void a(int param0, tg param1) {
        this.field_e = this.field_e + 1;
        this.field_w = this.field_w + 1;
        if (!(this.field_w <= 1000)) {
            this.field_w = 0;
            this.field_r = 0;
            if (!(!pk.field_s)) {
                tl.field_a.a(si.field_j[6], 100, ee.field_p * 256 / 100);
            }
        }
        this.a(1, si.field_j, param1, 1, 5, 1, tl.field_a, pk.field_s, (byte) -57);
        if (1 == this.b(param1, -4)) {
            if (!(-1 != (this.field_f.field_a ^ -1))) {
                this.field_e = 20;
                if (pk.field_s) {
                    tl.field_a.a(si.field_j[2], 100, ee.field_p * 64 / 100);
                }
            }
        }
        this.field_n = 31;
        this.field_o = 7;
        if (param0 <= 13) {
            return;
        }
        try {
            this.b(5);
        } catch (RuntimeException runtimeException) {
            throw bd.a((Throwable) ((Object) runtimeException), "eg.S(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private final void e(boolean param0) {
        ob var4 = null;
        ob var2 = null;
        ob var3 = null;
        if (param0) {
            return;
        }
        if (0 == ii.field_e[0].field_s && this.field_q != null && ii.field_e[0].field_q != null) {
            var4 = new ob();
            var2 = var4;
            var3 = new ob();
            var2.field_b = this.field_y;
            var4.field_a = this.field_A;
            var3.field_b = ii.field_e[0].field_y;
            var3.field_a = ii.field_e[0].field_A;
            if (j.a(this.field_q, var2.field_b, var4.field_a, ii.field_e[0].field_q, var3.field_b, var3.field_a)) {
                ii.field_e[0].field_s = 1;
            }
        }
    }

    private final void c(boolean param0) {
        String var3;
        ol.field_e = true;
        if (3 == this.field_B) {
          tl.field_a.a(nl.field_q[3], 100, ee.field_p * 256 / 100);
          return;
        } else {
          if (-5 != (this.field_B ^ -1)) {
            if (5 == this.field_B) {
              tl.field_a.a(nl.field_q[5], 100, ee.field_p * 256 / 100);
              return;
            } else {
              if (-7 == (this.field_B ^ -1)) {
                tl.field_a.a(nl.field_q[7], 100, ee.field_p * 256 / 100);
                return;
              } else {
                if ((this.field_B ^ -1) != -9) {
                  if (this.field_B != 7) {
                    if ((this.field_B ^ -1) == -10) {
                      tl.field_a.a(nl.field_q[10], 100, 256 * ee.field_p / 100);
                      return;
                    } else {
                      if (this.field_B == 10) {
                        tl.field_a.a(nl.field_q[11], 100, 256 * ee.field_p / 100);
                        return;
                      } else {
                        if (this.field_B != 12) {
                          if (-15 == (this.field_B ^ -1)) {
                            tl.field_a.a(nl.field_q[14], 100, ee.field_p * 256 / 100);
                            return;
                          } else {
                            if (-14 != (this.field_B ^ -1)) {
                              if (this.field_B != 15) {
                                if ((this.field_B ^ -1) == -17) {
                                  tl.field_a.a(nl.field_q[19], 100, ee.field_p * 256 / 100);
                                  return;
                                } else {
                                  if ((this.field_B ^ -1) != -18) {
                                    if (22 != this.field_B) {
                                      if ((this.field_B ^ -1) != -25) {
                                        if (this.field_B == 23) {
                                          tl.field_a.a(nl.field_q[24], 100, ee.field_p * 256 / 100);
                                          return;
                                        } else {
                                          if (26 == this.field_B) {
                                            tl.field_a.a(nl.field_q[26], 100, ee.field_p * 256 / 100);
                                            return;
                                          } else {
                                            if (this.field_B != 29) {
                                              if (31 != this.field_B) {
                                                if (30 == this.field_B) {
                                                  tl.field_a.a(nl.field_q[29], 100, 256 * ee.field_p / 100);
                                                  return;
                                                } else {
                                                  if (this.field_B == 32) {
                                                    tl.field_a.a(nl.field_q[30], 100, 256 * ee.field_p / 100);
                                                    return;
                                                  } else {
                                                    if ((this.field_B ^ -1) != -34) {
                                                      if ((this.field_B ^ -1) == -37) {
                                                        tl.field_a.a(nl.field_q[32], 100, 256 * ee.field_p / 100);
                                                        return;
                                                      } else {
                                                        L0: {
                                                          if (!param0) {
                                                            break L0;
                                                          } else {
                                                            var3 = (String) null;
                                                            this.a(-17, 111, false, (String) null, 55);
                                                            break L0;
                                                          }
                                                        }
                                                        if ((this.field_B ^ -1) != -39) {
                                                          if ((this.field_B ^ -1) == -38) {
                                                            tl.field_a.a(nl.field_q[34], 100, ee.field_p * 256 / 100);
                                                            return;
                                                          } else {
                                                            if (39 == this.field_B) {
                                                              tl.field_a.a(nl.field_q[35], 100, ee.field_p * 256 / 100);
                                                              return;
                                                            } else {
                                                              if (-41 == (this.field_B ^ -1)) {
                                                                tl.field_a.a(nl.field_q[37], 100, 256 * ee.field_p / 100);
                                                                return;
                                                              } else {
                                                                tl.field_a.a(si.field_j[9], 100, ee.field_p * 256 / 100);
                                                                return;
                                                              }
                                                            }
                                                          }
                                                        } else {
                                                          tl.field_a.a(nl.field_q[33], 100, ee.field_p * 256 / 100);
                                                          return;
                                                        }
                                                      }
                                                    } else {
                                                      tl.field_a.a(nl.field_q[31], 100, 256 * ee.field_p / 100);
                                                      return;
                                                    }
                                                  }
                                                }
                                              } else {
                                                tl.field_a.a(nl.field_q[28], 100, ee.field_p * 256 / 100);
                                                return;
                                              }
                                            } else {
                                              tl.field_a.a(nl.field_q[27], 100, 256 * ee.field_p / 100);
                                              return;
                                            }
                                          }
                                        }
                                      } else {
                                        tl.field_a.a(nl.field_q[23], 100, 256 * ee.field_p / 100);
                                        return;
                                      }
                                    } else {
                                      tl.field_a.a(nl.field_q[22], 100, ee.field_p * 256 / 100);
                                      return;
                                    }
                                  } else {
                                    tl.field_a.a(nl.field_q[21], 100, 256 * ee.field_p / 100);
                                    return;
                                  }
                                }
                              } else {
                                tl.field_a.a(nl.field_q[16], 100, 256 * ee.field_p / 100);
                                return;
                              }
                            } else {
                              tl.field_a.a(nl.field_q[15], 100, 256 * ee.field_p / 100);
                              return;
                            }
                          }
                        } else {
                          tl.field_a.a(nl.field_q[13], 100, ee.field_p * 256 / 100);
                          return;
                        }
                      }
                    }
                  } else {
                    tl.field_a.a(nl.field_q[9], 100, 256 * ee.field_p / 100);
                    return;
                  }
                } else {
                  tl.field_a.a(nl.field_q[8], 100, 256 * ee.field_p / 100);
                  return;
                }
              }
            }
          } else {
            tl.field_a.a(nl.field_q[4], 100, ee.field_p * 256 / 100);
            return;
          }
        }
    }

    final void a(byte param0, tg param1) {
        int fieldTemp$0 = 0;
        ob dupTemp$1 = null;
        ob dupTemp$2 = null;
        ob dupTemp$3 = null;
        ob dupTemp$4 = null;
        ob dupTemp$5 = null;
        ob dupTemp$6 = null;
        ob dupTemp$7 = null;
        ob dupTemp$8 = null;
        ob dupTemp$9 = null;
        ob dupTemp$10 = null;
        ob dupTemp$11 = null;
        ob dupTemp$12 = null;
        ob dupTemp$13 = null;
        eg dupTemp$14 = null;
        eg dupTemp$15 = null;
        int fieldTemp$16 = 0;
        int fieldTemp$17 = 0;
        int fieldTemp$18 = 0;
        int fieldTemp$19 = 0;
        ob dupTemp$20 = null;
        ob dupTemp$21 = null;
        int fieldTemp$22 = 0;
        int fieldTemp$23 = 0;
        ob dupTemp$24 = null;
        ob dupTemp$25 = null;
        int fieldTemp$26 = 0;
        int fieldTemp$27 = 0;
        int fieldTemp$28 = 0;
        int fieldTemp$29 = 0;
        int fieldTemp$30 = 0;
        int fieldTemp$31 = 0;
        ob dupTemp$32 = null;
        ob dupTemp$33 = null;
        int fieldTemp$34 = 0;
        int fieldTemp$35 = 0;
        ob dupTemp$36 = null;
        ob dupTemp$37 = null;
        int fieldTemp$38 = 0;
        int fieldTemp$39 = 0;
        int fieldTemp$40 = 0;
        ob dupTemp$41 = null;
        ob dupTemp$42 = null;
        int fieldTemp$43 = 0;
        int fieldTemp$44 = 0;
        int fieldTemp$45 = 0;
        ob dupTemp$46 = null;
        ob dupTemp$47 = null;
        int fieldTemp$48 = 0;
        int fieldTemp$49 = 0;
        int fieldTemp$50 = 0;
        int fieldTemp$51 = 0;
        int fieldTemp$52 = 0;
        ob dupTemp$53 = null;
        ob dupTemp$54 = null;
        int fieldTemp$55 = 0;
        int fieldTemp$56 = 0;
        int fieldTemp$57 = 0;
        ob dupTemp$58 = null;
        ob dupTemp$59 = null;
        int fieldTemp$60 = 0;
        int fieldTemp$61 = 0;
        ob dupTemp$62 = null;
        ob dupTemp$63 = null;
        int fieldTemp$64 = 0;
        int fieldTemp$65 = 0;
        int fieldTemp$66 = 0;
        int fieldTemp$67 = 0;
        int fieldTemp$68 = 0;
        int fieldTemp$69 = 0;
        int fieldTemp$70 = 0;
        ob dupTemp$71 = null;
        ob dupTemp$72 = null;
        int fieldTemp$73 = 0;
        int fieldTemp$74 = 0;
        int fieldTemp$75 = 0;
        int fieldTemp$76 = 0;
        int fieldTemp$77 = 0;
        int stackIn_83_0 = 0;
        int stackIn_84_0 = 0;
        int stackIn_84_1 = 0;
        int stackIn_183_0 = 0;
        int stackIn_195_0 = 0;
        int stackIn_239_0 = 0;
        int stackIn_240_0 = 0;
        int stackIn_240_1 = 0;
        Object stackIn_267_0 = null;
        int stackIn_267_1 = 0;
        Object stackIn_268_0 = null;
        int stackIn_268_1 = 0;
        int stackIn_268_2 = 0;
        int stackIn_392_0 = 0;
        int stackIn_431_0 = 0;
        int stackIn_448_0 = 0;
        Object stackIn_497_0 = null;
        Object stackIn_498_0 = null;
        int stackIn_498_1 = 0;
        int stackIn_526_0 = 0;
        Object stackIn_541_0 = null;
        Object stackIn_542_0 = null;
        int stackIn_542_1 = 0;
        Object stackIn_545_0 = null;
        Object stackIn_546_0 = null;
        int stackIn_546_1 = 0;
        int stackIn_565_0 = 0;
        Object stackIn_580_0 = null;
        Object stackIn_581_0 = null;
        int stackIn_581_1 = 0;
        Object stackIn_648_0 = null;
        Object stackIn_649_0 = null;
        int stackIn_649_1 = 0;
        Object stackIn_706_0 = null;
        Object stackIn_707_0 = null;
        int stackIn_707_1 = 0;
        int stackIn_764_0 = 0;
        int stackIn_765_0 = 0;
        int stackIn_765_1 = 0;
        int stackIn_775_0 = 0;
        int stackIn_799_0 = 0;
        int stackIn_808_0 = 0;
        Object stackIn_823_0 = null;
        Object stackIn_824_0 = null;
        int stackIn_824_1 = 0;
        Object stackIn_861_0 = null;
        Object stackIn_862_0 = null;
        int stackIn_862_1 = 0;
        Object stackIn_865_0 = null;
        Object stackIn_866_0 = null;
        int stackIn_866_1 = 0;
        int stackIn_887_0 = 0;
        int stackIn_888_0 = 0;
        int stackIn_888_1 = 0;
        Object stackIn_962_0 = null;
        Object stackIn_963_0 = null;
        int stackIn_963_1 = 0;
        int stackIn_991_0 = 0;
        int stackIn_992_0 = 0;
        int stackIn_992_1 = 0;
        Object stackIn_1033_0 = null;
        Object stackIn_1034_0 = null;
        int stackIn_1034_1 = 0;
        Object stackIn_1061_0 = null;
        Object stackIn_1062_0 = null;
        int stackIn_1062_1 = 0;
        Object stackIn_1147_0 = null;
        Object stackIn_1148_0 = null;
        int stackIn_1148_1 = 0;
        int stackIn_1175_0 = 0;
        int stackIn_1176_0 = 0;
        int stackIn_1176_1 = 0;
        Object stackIn_1215_0 = null;
        Object stackIn_1216_0 = null;
        int stackIn_1216_1 = 0;
        int stackIn_1218_0 = 0;
        int stackIn_1219_0 = 0;
        int stackIn_1219_1 = 0;
        int stackIn_1230_0 = 0;
        int stackIn_1231_0 = 0;
        int stackIn_1231_1 = 0;
        RuntimeException stackIn_1260_0 = null;
        StringBuilder stackIn_1260_1 = null;
        RuntimeException stackIn_1261_0 = null;
        StringBuilder stackIn_1261_1 = null;
        String stackIn_1261_2 = null;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        eg var4_ref_eg = null;
        int var7 = 0;
        ob var8 = null;
        ob var9 = null;
        ob var10 = null;
        ob var11 = null;
        var7 = wizardrun.field_H;
        try {
          L0: {
            L1: {
              if (17 >= this.field_i.field_a) {
                break L1;
              } else {
                this.field_i.field_a = -2;
                break L1;
              }
            }
            L2: {
              if (this.field_i.field_a >= -2) {
                break L2;
              } else {
                this.field_i.field_a = 17;
                break L2;
              }
            }
            L3: {
              var3_int = 15;
              var4 = this.field_B;
              if (var4 == 0) {
                L4: {
                  if ((cd.field_e ^ -1) < -1) {
                    cd.field_e = cd.field_e - 1;
                    this.field_s = 0;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                if (0 == this.field_s) {
                  L5: {
                    var3_int = 0;
                    if (-2 == (sc.field_m.field_b ^ -1)) {
                      var3_int = 30;
                      this.field_h = 1;
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  L6: {
                    if (0 != (sc.field_m.field_b ^ -1)) {
                      break L6;
                    } else {
                      var3_int = 30;
                      this.field_h = -1;
                      break L6;
                    }
                  }
                  L7: {
                    if (sc.field_m.field_f) {
                      if (0 != this.field_f.field_a) {
                        break L7;
                      } else {
                        if (-2 != (this.b(param1, param0 + 119) ^ -1)) {
                          break L7;
                        } else {
                          this.field_e = 70;
                          if (!pk.field_s) {
                            break L7;
                          } else {
                            tl.field_a.a(si.field_j[3], 100, ee.field_p * 256 / 100);
                            break L7;
                          }
                        }
                      }
                    } else {
                      break L7;
                    }
                  }
                  L8: {
                    this.field_f.field_b = this.field_f.field_b + 120;
                    this.field_d = this.field_d / 2;
                    this.a((byte) 114);
                    if (0 != var3_int) {
                      L9: {
                        this.field_w = this.field_w - 1;
                        fieldTemp$0 = this.field_z;
                        this.field_z = this.field_z - 1;
                        if (0 > fieldTemp$0) {
                          this.field_z = 5;
                          this.field_n = this.field_n + 1;
                          if (-4 <= (this.field_n ^ -1)) {
                            break L9;
                          } else {
                            this.field_n = 0;
                            break L9;
                          }
                        } else {
                          break L9;
                        }
                      }
                      L10: {
                        if (0 > this.field_w) {
                          this.field_o = this.field_o + 1;
                          this.field_w = 10;
                          break L10;
                        } else {
                          break L10;
                        }
                      }
                      L11: {
                        if (-4 < (this.field_o ^ -1)) {
                          break L11;
                        } else {
                          if (-7 > (this.field_o ^ -1)) {
                            break L11;
                          } else {
                            break L8;
                          }
                        }
                      }
                      this.field_o = 3;
                      break L8;
                    } else {
                      this.field_o = 0;
                      this.field_z = 0;
                      this.field_n = 1;
                      break L8;
                    }
                  }
                  L12: {
                    L13: {
                      if (0 < this.field_f.field_a) {
                        break L13;
                      } else {
                        if (this.b(param1, param0 ^ 121) == 0) {
                          break L13;
                        } else {
                          break L12;
                        }
                      }
                    }
                    L14: {
                      if (this.field_e > 0) {
                        this.field_n = 9;
                        break L14;
                      } else {
                        break L14;
                      }
                    }
                    L15: {
                      if (this.field_e <= 30) {
                        break L15;
                      } else {
                        this.field_n = 8;
                        break L15;
                      }
                    }
                    L16: {
                      if (this.field_e > 50) {
                        this.field_n = 7;
                        break L16;
                      } else {
                        break L16;
                      }
                    }
                    if (0 < this.field_e) {
                      break L12;
                    } else {
                      this.field_n = 10;
                      break L12;
                    }
                  }
                  L17: {
                    if (0 < p.field_V) {
                      this.field_n = 4;
                      p.field_V = p.field_V - 1;
                      if (p.field_V >= 15) {
                        break L17;
                      } else {
                        this.field_n = 5;
                        break L17;
                      }
                    } else {
                      break L17;
                    }
                  }
                  L18: {
                    if (sc.field_m.field_f) {
                      break L18;
                    } else {
                      if (10 < this.field_e) {
                        this.field_e = this.field_e - 4;
                        break L18;
                      } else {
                        break L18;
                      }
                    }
                  }
                  L19: {
                    this.a(1, si.field_j, param1, 1, var3_int, 1, tl.field_a, pk.field_s, (byte) -104);
                    if (!sc.field_m.field_d) {
                      if (-11 >= (p.field_V ^ -1)) {
                        break L19;
                      } else {
                        L20: {
                          if ((fi.field_x ^ -1) >= -1) {
                            break L20;
                          } else {
                            if (10 <= fi.field_x) {
                              break L20;
                            } else {
                              p.field_V = 25;
                              fi.field_x = 0;
                              ii.field_e[od.field_k].a(9147, 1, this.field_i);
                              ii.field_e[od.field_k].field_f.a(param0 ^ 42, this.field_f);
                              dupTemp$1 = ii.field_e[od.field_k].field_f;
                              dupTemp$1.field_a = dupTemp$1.field_a + 140;
                              ii.field_e[od.field_k].field_h = this.field_h;
                              dupTemp$2 = ii.field_e[od.field_k].field_f;
                              dupTemp$2.field_b = dupTemp$2.field_b + 40;
                              od.field_k = od.field_k + 1;
                              if (pk.field_s) {
                                tl.field_a.a(si.field_j[0], 100, ee.field_p * 256 / 100);
                                break L20;
                              } else {
                                break L20;
                              }
                            }
                          }
                        }
                        L21: {
                          if (fi.field_x < 10) {
                            break L21;
                          } else {
                            if (-41 < (fi.field_x ^ -1)) {
                              L22: {
                                p.field_V = 5;
                                fi.field_x = fi.field_x - 20;
                                if ((fi.field_x ^ -1) <= -1) {
                                  break L22;
                                } else {
                                  fi.field_x = 0;
                                  break L22;
                                }
                              }
                              ii.field_e[od.field_k].a(9147, 1, this.field_i);
                              ii.field_e[od.field_k].field_f.a(param0 ^ 21, this.field_f);
                              dupTemp$3 = ii.field_e[od.field_k].field_f;
                              dupTemp$3.field_a = dupTemp$3.field_a + 140;
                              ii.field_e[od.field_k].field_h = this.field_h;
                              dupTemp$4 = ii.field_e[od.field_k].field_f;
                              dupTemp$4.field_b = dupTemp$4.field_b + 40;
                              ii.field_e[od.field_k].field_e = -10;
                              od.field_k = od.field_k + 1;
                              ii.field_e[od.field_k].a(param0 + 9270, 1, this.field_i);
                              ii.field_e[od.field_k].field_f.a(-112, this.field_f);
                              dupTemp$5 = ii.field_e[od.field_k].field_f;
                              dupTemp$5.field_a = dupTemp$5.field_a + 140;
                              ii.field_e[od.field_k].field_h = this.field_h;
                              dupTemp$6 = ii.field_e[od.field_k].field_f;
                              dupTemp$6.field_b = dupTemp$6.field_b + 40;
                              ii.field_e[od.field_k].field_e = 10;
                              od.field_k = od.field_k + 1;
                              if (pk.field_s) {
                                tl.field_a.a(si.field_j[23], 100, ee.field_p * 256 / 100);
                                break L21;
                              } else {
                                break L21;
                              }
                            } else {
                              break L21;
                            }
                          }
                        }
                        L23: {
                          if ((fi.field_x ^ -1) > -41) {
                            break L23;
                          } else {
                            if (-101 < (fi.field_x ^ -1)) {
                              L24: {
                                p.field_V = 5;
                                fi.field_x = fi.field_x - 30;
                                if ((fi.field_x ^ -1) > -1) {
                                  fi.field_x = 0;
                                  break L24;
                                } else {
                                  break L24;
                                }
                              }
                              ii.field_e[od.field_k].a(9147, 1, this.field_i);
                              ii.field_e[od.field_k].field_f.a(-87, this.field_f);
                              dupTemp$7 = ii.field_e[od.field_k].field_f;
                              dupTemp$7.field_a = dupTemp$7.field_a + 140;
                              ii.field_e[od.field_k].field_h = this.field_h;
                              dupTemp$8 = ii.field_e[od.field_k].field_f;
                              dupTemp$8.field_b = dupTemp$8.field_b + 40;
                              ii.field_e[od.field_k].field_e = 30;
                              od.field_k = od.field_k + 1;
                              ii.field_e[od.field_k].a(9147, 1, this.field_i);
                              ii.field_e[od.field_k].field_f.a(-82, this.field_f);
                              dupTemp$9 = ii.field_e[od.field_k].field_f;
                              dupTemp$9.field_a = dupTemp$9.field_a + 140;
                              ii.field_e[od.field_k].field_h = this.field_h;
                              dupTemp$10 = ii.field_e[od.field_k].field_f;
                              dupTemp$10.field_b = dupTemp$10.field_b + 40;
                              ii.field_e[od.field_k].field_e = 0;
                              od.field_k = od.field_k + 1;
                              ii.field_e[od.field_k].a(9147, 1, this.field_i);
                              ii.field_e[od.field_k].field_f.a(-97, this.field_f);
                              dupTemp$11 = ii.field_e[od.field_k].field_f;
                              dupTemp$11.field_a = dupTemp$11.field_a + 140;
                              ii.field_e[od.field_k].field_h = this.field_h;
                              dupTemp$12 = ii.field_e[od.field_k].field_f;
                              dupTemp$12.field_b = dupTemp$12.field_b + 40;
                              ii.field_e[od.field_k].field_e = -30;
                              od.field_k = od.field_k + 1;
                              if (pk.field_s) {
                                tl.field_a.a(si.field_j[24], 100, ee.field_p * 256 / 100);
                                break L23;
                              } else {
                                break L23;
                              }
                            } else {
                              break L23;
                            }
                          }
                        }
                        if (-101 >= (fi.field_x ^ -1)) {
                          L25: {
                            fi.field_x = 0;
                            p.field_V = 25;
                            if (this.field_e < 0) {
                              break L25;
                            } else {
                              this.field_e = this.field_e - 10;
                              break L25;
                            }
                          }
                          L26: {
                            ii.field_e[od.field_k].a(9147, 2, this.field_i);
                            ii.field_e[od.field_k].field_f.a(-83, this.field_f);
                            ii.field_e[od.field_k].field_h = this.field_h;
                            dupTemp$13 = ii.field_e[od.field_k].field_f;
                            dupTemp$13.field_b = dupTemp$13.field_b + 60 * this.field_h;
                            ii.field_e[od.field_k].field_e = 5 * (fi.field_x / 10);
                            od.field_k = od.field_k + 1;
                            if (pk.field_s) {
                              stackIn_183_0 = 0;
                              break L26;
                            } else {
                              stackIn_183_0 = 1;
                              break L26;
                            }
                          }
                          if (stackIn_183_0 != 0) {
                            break L19;
                          } else {
                            tl.field_a.a(si.field_j[2], 100, 256 * ee.field_p / 100);
                            break L19;
                          }
                        } else {
                          this.field_d = this.field_d * 2;
                          this.field_f.field_b = this.field_f.field_b - 120;
                          this.a((byte) 83);
                          break L3;
                        }
                      }
                    } else {
                      L27: {
                        if ((fi.field_x ^ -1) <= -121) {
                          break L27;
                        } else {
                          fi.field_x = fi.field_x + 1;
                          break L27;
                        }
                      }
                      L28: {
                        if (120 <= fi.field_x) {
                          fi.field_x = fi.field_x - 20;
                          break L28;
                        } else {
                          break L28;
                        }
                      }
                      if (-6 != (fi.field_x % 10 ^ -1)) {
                        break L19;
                      } else {
                        if (pk.field_s) {
                          tl.field_a.a(si.field_j[16], 100, 256 * ee.field_p / 100);
                          break L19;
                        } else {
                          break L19;
                        }
                      }
                    }
                  }
                  this.field_d = this.field_d * 2;
                  this.field_f.field_b = this.field_f.field_b - 120;
                  this.a((byte) 83);
                  break L3;
                } else {
                  L29: {
                    this.field_n = Math.abs(this.field_e) / 10 % 2 + 12;
                    fi.field_x = 0;
                    if (this.field_s == 1) {
                      L30: {
                        this.field_e = -40;
                        this.field_s = 2;
                        stackIn_83_0 = 0;

                        if (pk.field_s) {
                          stackIn_84_0 = stackIn_83_0;
                          stackIn_84_1 = 0;
                          break L30;
                        } else {
                          stackIn_84_0 = stackIn_83_0;
                          stackIn_84_1 = 1;
                          break L30;
                        }
                      }
                      if (stackIn_84_0 != stackIn_84_1) {
                        break L29;
                      } else {
                        tl.field_a.a(si.field_j[8], 100, ee.field_p * 256 / 100);
                        break L29;
                      }
                    } else {
                      break L29;
                    }
                  }
                  L31: {
                    this.field_e = this.field_e + 1;
                    this.field_o = 1;
                    this.field_f.field_a = this.field_f.field_a - this.field_e;
                    if ((this.field_e ^ -1) < -1) {
                      this.field_o = 2;
                      break L31;
                    } else {
                      break L31;
                    }
                  }
                  L32: {
                    if ((this.field_f.field_a ^ -1) <= -1) {
                      break L32;
                    } else {
                      this.field_f.field_a = this.field_f.field_a + 240;
                      this.field_i.field_a = this.field_i.field_a - 1;
                      break L32;
                    }
                  }
                  if (this.field_i.field_a >= -2) {
                    break L3;
                  } else {
                    L33: {
                      this.field_i.field_a = 2;
                      this.field_i.field_b = 2;
                      if (4 != qh.field_l) {
                        break L33;
                      } else {
                        if (ql.field_c == 5) {
                          this.field_i.field_b = this.field_i.field_b + 1;
                          break L33;
                        } else {
                          break L33;
                        }
                      }
                    }
                    gd.field_b = true;
                    cd.field_e = 100;
                    this.field_f.field_a = 0;
                    this.field_s = 0;
                    da.field_g = true;
                    qh.field_g = qh.field_g - 1;
                    hi.field_c = hi.field_c + 1;
                    this.field_h = 1;
                    this.field_e = 0;
                    this.field_f.field_b = 0;
                    if (-1 >= (qh.field_g ^ -1)) {
                      break L3;
                    } else {
                      bb.field_j = me.field_b;
                      hi.field_a = 580;
                      break L3;
                    }
                  }
                }
              } else {
                if (-2 == (var4 ^ -1)) {
                  L34: {
                    if (this.field_e > 0) {
                      break L34;
                    } else {
                      if (1 != this.b(param1, param0 + 119)) {
                        break L34;
                      } else {
                        if (0 == this.field_f.field_a) {
                          this.field_e = 30;
                          if (-1 < (this.field_i.field_b ^ -1)) {
                            break L34;
                          } else {
                            if (-21 >= (this.field_i.field_b ^ -1)) {
                              break L34;
                            } else {
                              L35: {
                                if (pk.field_s) {
                                  stackIn_195_0 = 0;
                                  break L35;
                                } else {
                                  stackIn_195_0 = 1;
                                  break L35;
                                }
                              }
                              if (stackIn_195_0 == 1) {
                                break L34;
                              } else {
                                tl.field_a.a(si.field_j[1], 100, ee.field_p * 128 / 100);
                                break L34;
                              }
                            }
                          }
                        } else {
                          break L34;
                        }
                      }
                    }
                  }
                  L36: {
                    this.field_w = this.field_w + 1;
                    if ((this.field_w ^ -1) < -3) {
                      break L36;
                    } else {
                      this.a(1, si.field_j, param1, 1, 60, 0, tl.field_a, pk.field_s, (byte) -73);
                      if (!pg.field_q) {
                        var4 = 0;
                        L37: while (true) {
                          if (od.field_k <= var4) {
                            break L36;
                          } else {
                            if (ii.field_e[var4].field_p > 0) {
                              if (-1 == (ii.field_e[var4].field_r ^ -1)) {
                                if (null != ii.field_e[var4].field_q) {
                                  if (this.field_q != null) {
                                    var8 = new ob();
                                    var9 = new ob();
                                    var8.field_b = this.field_y;
                                    var8.field_a = this.field_A;
                                    var9.field_b = ii.field_e[var4].field_y;
                                    var9.field_a = ii.field_e[var4].field_A;
                                    if (j.a(this.field_q, var8.field_b, var8.field_a, ii.field_e[var4].field_q, var9.field_b, var9.field_a)) {
                                      L38: {
                                        dupTemp$14 = ii.field_e[var4];
                                        dupTemp$14.field_s = dupTemp$14.field_s + 1;
                                        if (!pk.field_s) {
                                          break L38;
                                        } else {
                                          tl.field_a.a(si.field_j[10], 100, 256 * ee.field_p / 100);
                                          break L38;
                                        }
                                      }
                                      ii.field_e[var4].field_m = this.field_h;
                                      this.field_B = 20;
                                      this.field_w = 4;
                                      var4++;
                                      continue L37;
                                    } else {
                                      var4++;
                                      continue L37;
                                    }
                                  } else {
                                    var4++;
                                    continue L37;
                                  }
                                } else {
                                  var4++;
                                  continue L37;
                                }
                              } else {
                                var4++;
                                continue L37;
                              }
                            } else {
                              var4++;
                              continue L37;
                            }
                          }
                        }
                      } else {
                        break L36;
                      }
                    }
                  }
                  L39: {
                    if (-3 == (this.field_w ^ -1)) {
                      this.field_w = 0;
                      break L39;
                    } else {
                      break L39;
                    }
                  }
                  if (30 <= this.field_w) {
                    this.field_k = 1;
                    break L3;
                  } else {
                    break L3;
                  }
                } else {
                  if (var4 == 2) {
                    L40: {
                      this.field_w = this.field_w + 1;
                      this.field_e = 2;
                      if (-11 < (this.field_w ^ -1)) {
                        L41: {
                          this.field_i.field_a = this.field_i.field_a - 1;
                          if (!param1.field_d[this.field_i.a((byte) -68)]) {
                            break L41;
                          } else {
                            param1.field_d[this.field_i.a((byte) -68)] = false;
                            ii.field_e[od.field_k].a(9147, 21, new ob(this.field_i));
                            var4_ref_eg = ii.field_e[od.field_k];
                            od.field_k = od.field_k + 1;
                            var4_ref_eg.field_f.a(-117, this.field_f);
                            var4_ref_eg.field_o = 0;
                            var4_ref_eg.field_e = 4;
                            var4_ref_eg.field_i.field_a = var4_ref_eg.field_i.field_a + 2;
                            var4_ref_eg.field_h = this.field_h;
                            break L41;
                          }
                        }
                        this.field_i.field_a = this.field_i.field_a + 1;
                        this.a(1, si.field_j, param1, 1, 30, 0, tl.field_a, pk.field_s, (byte) 29);
                        var4 = 0;
                        L42: while (true) {
                          if (var4 >= od.field_k) {
                            break L40;
                          } else {
                            if (-1 > (ii.field_e[var4].field_p ^ -1)) {
                              if (this.field_q != null) {
                                if (null != ii.field_e[var4].field_q) {
                                  L43: {
                                    var10 = new ob();
                                    var11 = new ob();
                                    var10.field_a = this.field_A;
                                    var10.field_b = this.field_y;
                                    var11.field_b = ii.field_e[var4].field_y;
                                    var11.field_a = ii.field_e[var4].field_A;
                                    if (j.a(this.field_q, var10.field_b, var10.field_a, ii.field_e[var4].field_q, var11.field_b, var11.field_a)) {
                                      L44: {
                                        if ((ii.field_e[var4].field_d ^ -1) < -65) {
                                          break L44;
                                        } else {
                                          if ((ii.field_e[var4].field_p ^ -1) < -11) {
                                            break L44;
                                          } else {
                                            L45: {
                                              ii.field_e[var4].field_m = this.field_h;
                                              ii.field_e[var4].field_h = this.field_h;
                                              stackIn_239_0 = 1;

                                              if (pk.field_s) {
                                                stackIn_240_0 = stackIn_239_0;
                                                stackIn_240_1 = 0;
                                                break L45;
                                              } else {
                                                stackIn_240_0 = stackIn_239_0;
                                                stackIn_240_1 = 1;
                                                break L45;
                                              }
                                            }
                                            L46: {
                                              if (stackIn_240_0 == stackIn_240_1) {
                                                break L46;
                                              } else {
                                                if (ii.field_e[var4].field_r > 0) {
                                                  break L46;
                                                } else {
                                                  tl.field_a.a(si.field_j[2], 100, 256 * ee.field_p / 100);
                                                  break L46;
                                                }
                                              }
                                            }
                                            ii.field_e[var4].field_r = 1;
                                            ii.field_e[var4].field_w = 0;
                                            break L43;
                                          }
                                        }
                                      }
                                      L47: {
                                        dupTemp$15 = ii.field_e[var4];
                                        dupTemp$15.field_s = dupTemp$15.field_s + 10;
                                        if (pk.field_s) {
                                          tl.field_a.a(si.field_j[2], 100, 256 * ee.field_p / 100);
                                          break L47;
                                        } else {
                                          break L47;
                                        }
                                      }
                                      L48: {
                                        ii.field_e[var4].field_m = this.field_h;
                                        if (ii.field_e[var4].field_p >= 10) {
                                          break L48;
                                        } else {
                                          if (-65 > (ii.field_e[var4].field_d ^ -1)) {
                                            break L48;
                                          } else {
                                            break L43;
                                          }
                                        }
                                      }
                                      this.field_w = 4;
                                      this.field_B = 20;
                                      break L43;
                                    } else {
                                      break L43;
                                    }
                                  }
                                  var4++;
                                  continue L42;
                                } else {
                                  var4++;
                                  continue L42;
                                }
                              } else {
                                var4++;
                                continue L42;
                              }
                            } else {
                              var4++;
                              continue L42;
                            }
                          }
                        }
                      } else {
                        break L40;
                      }
                    }
                    L49: {
                      if (this.field_w != 3) {
                        break L49;
                      } else {
                        this.field_w = 0;
                        break L49;
                      }
                    }
                    if (60 > this.field_w) {
                      break L3;
                    } else {
                      this.field_k = 1;
                      break L3;
                    }
                  } else {
                    if (-4 != (var4 ^ -1)) {
                      L50: {
                        if (-5 != (var4 ^ -1)) {
                          if (var4 != 9) {
                            if (var4 != 13) {
                              if (24 == var4) {
                                break L50;
                              } else {
                                if (-6 != (var4 ^ -1)) {
                                  if (6 == var4) {
                                    if (-1 > (this.field_p ^ -1)) {
                                      L51: {
                                        if (this.field_o == 7) {
                                          L52: {
                                            this.field_z = this.field_z - 1;
                                            if ((this.field_z ^ -1) >= -1) {
                                              this.field_z = 5;
                                              this.field_n = this.field_n + 1;
                                              break L52;
                                            } else {
                                              break L52;
                                            }
                                          }
                                          L53: {
                                            if (-2 > (this.field_n ^ -1)) {
                                              this.field_n = 0;
                                              break L53;
                                            } else {
                                              break L53;
                                            }
                                          }
                                          L54: {
                                            if (this.field_n >= 0) {
                                              break L54;
                                            } else {
                                              this.field_n = 0;
                                              break L54;
                                            }
                                          }
                                          L55: {
                                            if ((this.field_s ^ -1) < -1) {
                                              this.field_s = this.field_s - 1;
                                              this.field_o = 0;
                                              if (!pk.field_s) {
                                                break L55;
                                              } else {
                                                tl.field_a.a(si.field_j[30], 100, 256 * ee.field_p / 100);
                                                break L55;
                                              }
                                            } else {
                                              break L55;
                                            }
                                          }
                                          w.field_b = w.field_b + 1;
                                          if (250 < w.field_b) {
                                            this.field_o = 0;
                                            break L51;
                                          } else {
                                            this.e(false);
                                            break L3;
                                          }
                                        } else {
                                          L56: {
                                            if (0 != this.field_x) {
                                              break L56;
                                            } else {
                                              L57: {
                                                this.field_n = 19;
                                                if (-26 <= (this.field_w ^ -1)) {
                                                  break L57;
                                                } else {
                                                  this.field_n = 20;
                                                  break L57;
                                                }
                                              }
                                              L58: {
                                                if ((this.field_w ^ -1) >= -41) {
                                                  break L58;
                                                } else {
                                                  this.field_n = 21;
                                                  break L58;
                                                }
                                              }
                                              this.field_z = 0;
                                              fieldTemp$16 = this.field_w;
                                              this.field_w = this.field_w + 1;
                                              if (fieldTemp$16 <= 50) {
                                                break L56;
                                              } else {
                                                L59: {
                                                  this.field_w = 0;
                                                  this.field_e = 100;
                                                  this.field_x = 2;
                                                  if (ii.field_e[0].field_i.field_a != this.field_i.field_a) {
                                                    break L59;
                                                  } else {
                                                    this.field_e = 70;
                                                    break L59;
                                                  }
                                                }
                                                if (this.field_i.field_a > ii.field_e[0].field_i.field_a) {
                                                  this.field_e = -10;
                                                  this.field_i.field_a = this.field_i.field_a - 1;
                                                  this.field_x = 3;
                                                  this.field_f.field_a = this.field_f.field_a + 230;
                                                  break L56;
                                                } else {
                                                  break L56;
                                                }
                                              }
                                            }
                                          }
                                          L60: {
                                            if (-3 == (this.field_x ^ -1)) {
                                              this.a(true, 22, 20, param1);
                                              break L60;
                                            } else {
                                              break L60;
                                            }
                                          }
                                          L61: {
                                            if (this.field_x == 3) {
                                              this.a(20, -94, true, param1);
                                              break L61;
                                            } else {
                                              break L61;
                                            }
                                          }
                                          if ((this.field_s ^ -1) < -1) {
                                            L62: {
                                              this.field_p = this.field_p - 1;
                                              this.field_s = this.field_s - 1;
                                              if (pk.field_s) {
                                                tl.field_a.a(si.field_j[25], 100, ee.field_p * 256 / 100);
                                                break L62;
                                              } else {
                                                break L62;
                                              }
                                            }
                                            if (-1 <= (this.field_p ^ -1)) {
                                              this.c(false);
                                              this.field_e = 80;
                                              break L51;
                                            } else {
                                              this.e(false);
                                              break L3;
                                            }
                                          } else {
                                            break L51;
                                          }
                                        }
                                      }
                                      this.e(false);
                                      break L3;
                                    } else {
                                      this.a(true, param0 + 243, param1);
                                      break L3;
                                    }
                                  } else {
                                    L63: {
                                      if (-8 != (var4 ^ -1)) {
                                        if (var4 != 8) {
                                          if ((var4 ^ -1) != -11) {
                                            if (var4 == 11) {
                                              this.field_e = 2;
                                              this.a(1, si.field_j, param1, 1, 30, 0, tl.field_a, pk.field_s, (byte) 127);
                                              this.e(false);
                                              break L3;
                                            } else {
                                              if (var4 == 12) {
                                                if (0 < this.field_p) {
                                                  L64: {
                                                    if (w.field_b >= 250) {
                                                      L65: {
                                                        if (-1 != (this.field_x ^ -1)) {
                                                          break L65;
                                                        } else {
                                                          L66: {
                                                            this.a(true, 3, 30, (byte) -61, param1);
                                                            if ((this.field_i.field_b ^ -1) >= -2) {
                                                              break L66;
                                                            } else {
                                                              if (17 <= this.field_i.field_b) {
                                                                break L66;
                                                              } else {
                                                                if (this.field_z != 1) {
                                                                  break L65;
                                                                } else {
                                                                  if (this.field_n != 3) {
                                                                    break L65;
                                                                  } else {
                                                                    tl.field_a.a(nl.field_q[12], 100, 256 * ee.field_p / 100);
                                                                    break L65;
                                                                  }
                                                                }
                                                              }
                                                            }
                                                          }
                                                          L67: {
                                                            if (this.field_i.field_b >= ii.field_e[0].field_i.field_b) {
                                                              this.field_h = -1;
                                                              break L67;
                                                            } else {
                                                              this.field_h = 1;
                                                              break L67;
                                                            }
                                                          }
                                                          L68: {
                                                            if (this.field_i.field_a >= ii.field_e[0].field_i.field_a) {
                                                              break L68;
                                                            } else {
                                                              if ((this.field_i.field_a ^ -1) <= -11) {
                                                                break L68;
                                                              } else {
                                                                this.field_x = 1;
                                                                this.field_w = 0;
                                                                break L68;
                                                              }
                                                            }
                                                          }
                                                          if (ii.field_e[0].field_i.field_a >= this.field_i.field_a) {
                                                            break L65;
                                                          } else {
                                                            if ((this.field_i.field_a ^ -1) >= -3) {
                                                              break L65;
                                                            } else {
                                                              this.field_x = 3;
                                                              this.field_i.field_a = this.field_i.field_a - 1;
                                                              this.field_e = -20;
                                                              this.field_f.field_a = this.field_f.field_a + 230;
                                                              break L65;
                                                            }
                                                          }
                                                        }
                                                      }
                                                      L69: {
                                                        if (this.field_x == 1) {
                                                          this.field_n = 19;
                                                          fieldTemp$17 = this.field_w;
                                                          this.field_w = this.field_w + 1;
                                                          if (fieldTemp$17 <= 5) {
                                                            break L69;
                                                          } else {
                                                            this.field_e = 70;
                                                            this.field_x = 2;
                                                            this.field_w = 0;
                                                            break L69;
                                                          }
                                                        } else {
                                                          break L69;
                                                        }
                                                      }
                                                      L70: {
                                                        if (this.field_x != 2) {
                                                          break L70;
                                                        } else {
                                                          this.a(true, 22, 0, param1);
                                                          break L70;
                                                        }
                                                      }
                                                      L71: {
                                                        if (this.field_x == 3) {
                                                          this.a(0, param0 + 31, true, param1);
                                                          break L71;
                                                        } else {
                                                          break L71;
                                                        }
                                                      }
                                                      if (0 < this.field_s) {
                                                        L72: {
                                                          this.field_p = this.field_p - 1;
                                                          this.field_s = this.field_s - 1;
                                                          if (25 != this.field_p) {
                                                            break L72;
                                                          } else {
                                                            ii.field_e[od.field_k].a(9147, 10, this.field_i);
                                                            ii.field_e[od.field_k].field_f.a(-108, this.field_f);
                                                            ii.field_e[od.field_k].field_i.field_b = 0;
                                                            ii.field_e[od.field_k].field_i.field_a = 16;
                                                            ii.field_e[od.field_k].field_f.field_b = 0;
                                                            ii.field_e[od.field_k].field_f.field_a = 0;
                                                            ii.field_e[od.field_k].field_h = 1;
                                                            ii.field_e[od.field_k].field_w = 10;
                                                            od.field_k = od.field_k + 1;
                                                            ii.field_e[od.field_k].a(9147, 10, this.field_i);
                                                            ii.field_e[od.field_k].field_f.a(param0 + 19, this.field_f);
                                                            ii.field_e[od.field_k].field_i.field_b = 19;
                                                            ii.field_e[od.field_k].field_i.field_a = 16;
                                                            ii.field_e[od.field_k].field_f.field_b = 0;
                                                            ii.field_e[od.field_k].field_f.field_a = 0;
                                                            ii.field_e[od.field_k].field_h = -1;
                                                            ii.field_e[od.field_k].field_w = 10;
                                                            od.field_k = od.field_k + 1;
                                                            break L72;
                                                          }
                                                        }
                                                        L73: {
                                                          if (pk.field_s) {
                                                            tl.field_a.a(si.field_j[25], 100, 256 * ee.field_p / 100);
                                                            break L73;
                                                          } else {
                                                            break L73;
                                                          }
                                                        }
                                                        if ((this.field_p ^ -1) >= -1) {
                                                          this.c(false);
                                                          this.field_e = 70;
                                                          break L64;
                                                        } else {
                                                          break L64;
                                                        }
                                                      } else {
                                                        this.e(false);
                                                        break L3;
                                                      }
                                                    } else {
                                                      L74: {
                                                        this.field_o = 7;
                                                        fieldTemp$18 = this.field_z;
                                                        this.field_z = this.field_z - 1;
                                                        if (-1 > (fieldTemp$18 ^ -1)) {
                                                          break L74;
                                                        } else {
                                                          this.field_n = this.field_n + 1;
                                                          this.field_z = 5;
                                                          if (-2 > (this.field_n ^ -1)) {
                                                            this.field_n = 0;
                                                            break L74;
                                                          } else {
                                                            break L74;
                                                          }
                                                        }
                                                      }
                                                      L75: {
                                                        if ((this.field_s ^ -1) >= -1) {
                                                          break L75;
                                                        } else {
                                                          L76: {
                                                            this.field_s = this.field_s - 1;
                                                            w.field_b = 250;
                                                            this.field_x = 0;
                                                            if (pk.field_s) {
                                                              stackIn_448_0 = 0;
                                                              break L76;
                                                            } else {
                                                              stackIn_448_0 = 1;
                                                              break L76;
                                                            }
                                                          }
                                                          if (stackIn_448_0 == 1) {
                                                            break L75;
                                                          } else {
                                                            tl.field_a.a(si.field_j[17], 100, 256 * ee.field_p / 100);
                                                            break L75;
                                                          }
                                                        }
                                                      }
                                                      w.field_b = w.field_b + 1;
                                                      break L64;
                                                    }
                                                  }
                                                  this.e(false);
                                                  break L3;
                                                } else {
                                                  this.a(true, 120, param1);
                                                  break L3;
                                                }
                                              } else {
                                                if (14 != var4) {
                                                  if ((var4 ^ -1) == -16) {
                                                    if ((this.field_p ^ -1) >= -1) {
                                                      this.a(false, param0 + 243, param1);
                                                      break L3;
                                                    } else {
                                                      if (0 == this.field_r) {
                                                        L77: {
                                                          if (0 != this.field_x) {
                                                            break L77;
                                                          } else {
                                                            this.a(15, (byte) -9, param1, false);
                                                            fieldTemp$19 = this.field_w;
                                                            this.field_w = this.field_w + 1;
                                                            if (-101 > (fieldTemp$19 ^ -1)) {
                                                              this.field_x = 1;
                                                              this.field_z = 0;
                                                              this.field_w = 0;
                                                              break L77;
                                                            } else {
                                                              break L77;
                                                            }
                                                          }
                                                        }
                                                        L78: {
                                                          if ((this.field_x ^ -1) == -2) {
                                                            if (this.a(false, param1, 25)) {
                                                              L79: {
                                                                this.field_w = 0;
                                                                ii.field_e[od.field_k].a(9147, 18, this.field_i);
                                                                ii.field_e[od.field_k].field_f.a(-84, this.field_f);
                                                                dupTemp$20 = ii.field_e[od.field_k].field_f;
                                                                dupTemp$20.field_b = dupTemp$20.field_b + (this.field_h * 200 - -120);
                                                                dupTemp$21 = ii.field_e[od.field_k].field_f;
                                                                dupTemp$21.field_a = dupTemp$21.field_a - 40;
                                                                ii.field_e[od.field_k].field_h = this.field_h;
                                                                ii.field_e[od.field_k].field_w = 0;
                                                                ii.field_e[od.field_k].field_o = 8;
                                                                od.field_k = od.field_k + 1;
                                                                if (pk.field_s) {
                                                                  stackIn_526_0 = 0;
                                                                  break L79;
                                                                } else {
                                                                  stackIn_526_0 = 1;
                                                                  break L79;
                                                                }
                                                              }
                                                              if (stackIn_526_0 == 1) {
                                                                break L78;
                                                              } else {
                                                                tl.field_a.a(nl.field_q[17], 100, ee.field_p * 256 / 100);
                                                                break L78;
                                                              }
                                                            } else {
                                                              this.e(false);
                                                              break L3;
                                                            }
                                                          } else {
                                                            break L78;
                                                          }
                                                        }
                                                        this.e(false);
                                                        break L3;
                                                      } else {
                                                        this.a(46, param1);
                                                        break L3;
                                                      }
                                                    }
                                                  } else {
                                                    if (16 == var4) {
                                                      if (-1 <= (this.field_p ^ -1)) {
                                                        this.a(false, 120, param1);
                                                        break L3;
                                                      } else {
                                                        if (0 != this.field_r) {
                                                          this.a(param0 + 163, param1);
                                                          break L3;
                                                        } else {
                                                          L80: {
                                                            if (-1 == (this.field_x ^ -1)) {
                                                              L81: {
                                                                if (ii.field_e[0].field_i.field_a > this.field_i.field_a) {
                                                                  this.field_w = this.field_w + 1;
                                                                  break L81;
                                                                } else {
                                                                  break L81;
                                                                }
                                                              }
                                                              this.a(false, 2, 10, (byte) -105, param1);
                                                              fieldTemp$22 = this.field_w;
                                                              this.field_w = this.field_w + 1;
                                                              if (-201 > (fieldTemp$22 ^ -1)) {
                                                                L82: {
                                                                  this.field_x = 1;
                                                                  this.field_w = 0;
                                                                  stackIn_541_0 = this;

                                                                  if (this.field_i.field_b > ii.field_e[0].field_i.field_b) {
                                                                    stackIn_542_0 = this;
                                                                    stackIn_542_1 = 1;
                                                                    break L82;
                                                                  } else {
                                                                    stackIn_542_0 = this;
                                                                    stackIn_542_1 = -1;
                                                                    break L82;
                                                                  }
                                                                }
                                                                ((eg) (this)).field_h = stackIn_542_1;
                                                                if (50.0 <= 100.0 * Math.random()) {
                                                                  break L80;
                                                                } else {
                                                                  L83: {
                                                                    stackIn_545_0 = this;

                                                                    if (ii.field_e[0].field_i.field_b < this.field_i.field_b) {
                                                                      stackIn_546_0 = this;
                                                                      stackIn_546_1 = -1;
                                                                      break L83;
                                                                    } else {
                                                                      stackIn_546_0 = this;
                                                                      stackIn_546_1 = 1;
                                                                      break L83;
                                                                    }
                                                                  }
                                                                  ((eg) (this)).field_h = stackIn_546_1;
                                                                  this.field_x = 4;
                                                                  break L80;
                                                                }
                                                              } else {
                                                                break L80;
                                                              }
                                                            } else {
                                                              break L80;
                                                            }
                                                          }
                                                          L84: {
                                                            if (this.field_x != 1) {
                                                              break L84;
                                                            } else {
                                                              this.field_n = 19;
                                                              fieldTemp$23 = this.field_w;
                                                              this.field_w = this.field_w + 1;
                                                              if (fieldTemp$23 > 25) {
                                                                this.field_e = 70;
                                                                this.field_x = 2;
                                                                this.field_w = 0;
                                                                break L84;
                                                              } else {
                                                                break L84;
                                                              }
                                                            }
                                                          }
                                                          L85: {
                                                            if (-3 != (this.field_x ^ -1)) {
                                                              break L85;
                                                            } else {
                                                              this.a(false, 22, 15, param1);
                                                              if (this.field_x == 0) {
                                                                this.field_w = (int)(Math.random() * 100.0);
                                                                break L85;
                                                              } else {
                                                                break L85;
                                                              }
                                                            }
                                                          }
                                                          L86: {
                                                            if (this.field_x != 3) {
                                                              break L86;
                                                            } else {
                                                              this.a(15, -102, false, param1);
                                                              if (this.field_x == 0) {
                                                                this.field_w = (int)(100.0 * Math.random());
                                                                break L86;
                                                              } else {
                                                                break L86;
                                                              }
                                                            }
                                                          }
                                                          L87: {
                                                            if (4 == this.field_x) {
                                                              if (!this.a(false, param1, param0 + 148)) {
                                                                break L87;
                                                              } else {
                                                                L88: {
                                                                  ii.field_e[od.field_k].a(9147, 19, this.field_i);
                                                                  ii.field_e[od.field_k].field_f.a(param0 ^ 13, this.field_f);
                                                                  dupTemp$24 = ii.field_e[od.field_k].field_f;
                                                                  dupTemp$24.field_b = dupTemp$24.field_b + (40 + 360 * this.field_h);
                                                                  dupTemp$25 = ii.field_e[od.field_k].field_f;
                                                                  dupTemp$25.field_a = dupTemp$25.field_a + 160;
                                                                  ii.field_e[od.field_k].field_h = this.field_h;
                                                                  ii.field_e[od.field_k].field_w = 0;
                                                                  ii.field_e[od.field_k].field_e = 25;
                                                                  ii.field_e[od.field_k].field_n = 37;
                                                                  od.field_k = od.field_k + 1;
                                                                  if (pk.field_s) {
                                                                    stackIn_565_0 = 0;
                                                                    break L88;
                                                                  } else {
                                                                    stackIn_565_0 = 1;
                                                                    break L88;
                                                                  }
                                                                }
                                                                if (stackIn_565_0 != 0) {
                                                                  break L87;
                                                                } else {
                                                                  tl.field_a.a(nl.field_q[18], 100, ee.field_p * 256 / 100);
                                                                  break L87;
                                                                }
                                                              }
                                                            } else {
                                                              break L87;
                                                            }
                                                          }
                                                          this.e(false);
                                                          break L3;
                                                        }
                                                      }
                                                    } else {
                                                      if (17 == var4) {
                                                        if (0 >= this.field_p) {
                                                          this.a(true, 120, param1);
                                                          break L3;
                                                        } else {
                                                          if (-251 < (w.field_b ^ -1)) {
                                                            L89: {
                                                              this.field_x = 0;
                                                              fieldTemp$26 = this.field_z;
                                                              this.field_z = this.field_z - 1;
                                                              if (-1 > (fieldTemp$26 ^ -1)) {
                                                                break L89;
                                                              } else {
                                                                this.field_n = this.field_n + 1;
                                                                this.field_z = 5;
                                                                if ((this.field_n ^ -1) >= -2) {
                                                                  break L89;
                                                                } else {
                                                                  this.field_n = 0;
                                                                  break L89;
                                                                }
                                                              }
                                                            }
                                                            L90: {
                                                              this.field_o = 7;
                                                              if (this.field_s > 0) {
                                                                w.field_b = 250;
                                                                this.field_s = this.field_s - 1;
                                                                if (pk.field_s) {
                                                                  tl.field_a.a(si.field_j[29], 100, ee.field_p * 256 / 100);
                                                                  break L90;
                                                                } else {
                                                                  break L90;
                                                                }
                                                              } else {
                                                                break L90;
                                                              }
                                                            }
                                                            w.field_b = w.field_b + 1;
                                                            break L3;
                                                          } else {
                                                            L91: {
                                                              if (this.field_x == 0) {
                                                                L92: {
                                                                  if (this.field_i.field_a < ii.field_e[0].field_i.field_a) {
                                                                    this.field_w = this.field_w + 1;
                                                                    break L92;
                                                                  } else {
                                                                    break L92;
                                                                  }
                                                                }
                                                                this.a(true, 1, 25, (byte) -94, param1);
                                                                fieldTemp$27 = this.field_w;
                                                                this.field_w = this.field_w + 1;
                                                                if (-201 <= (fieldTemp$27 ^ -1)) {
                                                                  break L91;
                                                                } else {
                                                                  L93: {
                                                                    this.field_w = 0;
                                                                    stackIn_580_0 = this;

                                                                    if (this.field_i.field_b <= ii.field_e[0].field_i.field_b) {
                                                                      stackIn_581_0 = this;
                                                                      stackIn_581_1 = 1;
                                                                      break L93;
                                                                    } else {
                                                                      stackIn_581_0 = this;
                                                                      stackIn_581_1 = -1;
                                                                      break L93;
                                                                    }
                                                                  }
                                                                  ((eg) (this)).field_h = stackIn_581_1;
                                                                  this.field_x = 1;
                                                                  break L91;
                                                                }
                                                              } else {
                                                                break L91;
                                                              }
                                                            }
                                                            L94: {
                                                              if ((this.field_x ^ -1) != -2) {
                                                                break L94;
                                                              } else {
                                                                this.field_n = 19;
                                                                fieldTemp$28 = this.field_w;
                                                                this.field_w = this.field_w + 1;
                                                                if (25 < fieldTemp$28) {
                                                                  this.field_e = 70;
                                                                  this.field_x = 2;
                                                                  this.field_w = 0;
                                                                  break L94;
                                                                } else {
                                                                  break L94;
                                                                }
                                                              }
                                                            }
                                                            L95: {
                                                              if ((this.field_x ^ -1) != -3) {
                                                                break L95;
                                                              } else {
                                                                this.a(true, 22, 16, param1);
                                                                if (this.field_x == 0) {
                                                                  this.field_w = (int)(Math.random() * 100.0);
                                                                  break L95;
                                                                } else {
                                                                  break L95;
                                                                }
                                                              }
                                                            }
                                                            L96: {
                                                              if (this.field_x != 3) {
                                                                break L96;
                                                              } else {
                                                                this.a(16, -99, true, param1);
                                                                if (0 != this.field_x) {
                                                                  break L96;
                                                                } else {
                                                                  this.field_w = (int)(100.0 * Math.random());
                                                                  break L96;
                                                                }
                                                              }
                                                            }
                                                            L97: {
                                                              if (0 >= this.field_s) {
                                                                break L97;
                                                              } else {
                                                                L98: {
                                                                  this.field_p = this.field_p - 1;
                                                                  this.field_s = this.field_s - 1;
                                                                  if (0 != this.field_p % 10) {
                                                                    break L98;
                                                                  } else {
                                                                    ii.field_e[od.field_k].a(9147, 14, this.field_i);
                                                                    ii.field_e[od.field_k].field_f.a(-102, this.field_f);
                                                                    ii.field_e[od.field_k].field_h = 1;
                                                                    ii.field_e[od.field_k].field_w = 10;
                                                                    od.field_k = od.field_k + 1;
                                                                    break L98;
                                                                  }
                                                                }
                                                                L99: {
                                                                  this.field_o = 1;
                                                                  if (pk.field_s) {
                                                                    tl.field_a.a(si.field_j[29], 100, 256 * ee.field_p / 100);
                                                                    break L99;
                                                                  } else {
                                                                    break L99;
                                                                  }
                                                                }
                                                                if (this.field_p <= 0) {
                                                                  this.c(false);
                                                                  this.field_e = 60;
                                                                  break L97;
                                                                } else {
                                                                  break L97;
                                                                }
                                                              }
                                                            }
                                                            this.e(false);
                                                            break L3;
                                                          }
                                                        }
                                                      } else {
                                                        if (-19 == (var4 ^ -1)) {
                                                          L100: {
                                                            L101: {
                                                              this.e(false);
                                                              if ((this.b(param1, -4) ^ -1) != -2) {
                                                                break L101;
                                                              } else {
                                                                if (-1 == (this.field_f.field_a ^ -1)) {
                                                                  L102: {
                                                                    this.field_w = this.field_w + 1;
                                                                    if (35 >= this.field_n) {
                                                                      break L102;
                                                                    } else {
                                                                      this.field_z = 0;
                                                                      break L102;
                                                                    }
                                                                  }
                                                                  this.field_n = 35;
                                                                  fieldTemp$29 = this.field_z;
                                                                  this.field_z = this.field_z + 1;
                                                                  if ((fieldTemp$29 ^ -1) >= -11) {
                                                                    break L100;
                                                                  } else {
                                                                    this.field_n = 34;
                                                                    break L100;
                                                                  }
                                                                } else {
                                                                  break L101;
                                                                }
                                                              }
                                                            }
                                                            L103: {
                                                              this.a(1, si.field_j, param1, 1, 5, 1, tl.field_a, pk.field_s, (byte) 127);
                                                              if (36 > this.field_n) {
                                                                this.field_n = 36;
                                                                break L103;
                                                              } else {
                                                                break L103;
                                                              }
                                                            }
                                                            L104: {
                                                              this.field_z = this.field_z - 1;
                                                              if (this.field_z <= 5) {
                                                                this.field_n = 37;
                                                                break L104;
                                                              } else {
                                                                break L104;
                                                              }
                                                            }
                                                            if ((this.field_z ^ -1) < -1) {
                                                              break L100;
                                                            } else {
                                                              this.field_z = 10;
                                                              break L100;
                                                            }
                                                          }
                                                          L105: {
                                                            if (-1 < (this.field_f.field_a ^ -1)) {
                                                              this.field_f.field_a = this.field_f.field_a + 240;
                                                              this.field_i.field_a = this.field_i.field_a - 1;
                                                              break L105;
                                                            } else {
                                                              break L105;
                                                            }
                                                          }
                                                          L106: {
                                                            if ((this.field_i.field_a ^ -1) > -1) {
                                                              this.field_w = 21;
                                                              break L106;
                                                            } else {
                                                              break L106;
                                                            }
                                                          }
                                                          this.e(false);
                                                          if (20 < this.field_w) {
                                                            this.field_k = 1;
                                                            break L3;
                                                          } else {
                                                            break L3;
                                                          }
                                                        } else {
                                                          if ((var4 ^ -1) == -20) {
                                                            this.a(1, si.field_j, param1, 1, 25, 0, tl.field_a, pk.field_s, (byte) -120);
                                                            this.e(false);
                                                            this.field_n = 37;
                                                            if (-2 != (this.b(param1, -4) ^ -1)) {
                                                              break L3;
                                                            } else {
                                                              if (this.field_f.field_a != 0) {
                                                                break L3;
                                                              } else {
                                                                this.field_e = 20;
                                                                this.field_n = 37;
                                                                break L3;
                                                              }
                                                            }
                                                          } else {
                                                            if (25 == var4) {
                                                              L107: {
                                                                this.a((byte) 78);
                                                                if (-1 < (this.field_f.field_a ^ -1)) {
                                                                  this.field_f.field_a = this.field_f.field_a + 240;
                                                                  this.field_i.field_a = this.field_i.field_a - 1;
                                                                  break L107;
                                                                } else {
                                                                  break L107;
                                                                }
                                                              }
                                                              L108: {
                                                                this.field_z = this.field_z + 1;
                                                                if (this.field_f.field_a >= 240) {
                                                                  this.field_f.field_a = this.field_f.field_a - 240;
                                                                  this.field_i.field_a = this.field_i.field_a + 1;
                                                                  break L108;
                                                                } else {
                                                                  break L108;
                                                                }
                                                              }
                                                              L109: {
                                                                stackIn_648_0 = this;

                                                                if (-7 < (this.field_z % 10 ^ -1)) {
                                                                  stackIn_649_0 = this;
                                                                  stackIn_649_1 = 36;
                                                                  break L109;
                                                                } else {
                                                                  stackIn_649_0 = this;
                                                                  stackIn_649_1 = 37;
                                                                  break L109;
                                                                }
                                                              }
                                                              L110: {
                                                                ((eg) (this)).field_n = stackIn_649_1;
                                                                if (this.field_z < 20) {
                                                                  L111: {
                                                                    if (this.field_i.field_b >= ii.field_e[0].field_i.field_b) {
                                                                      break L111;
                                                                    } else {
                                                                      this.field_f.field_b = this.field_f.field_b + 15;
                                                                      this.field_h = 1;
                                                                      break L111;
                                                                    }
                                                                  }
                                                                  L112: {
                                                                    if (ii.field_e[0].field_i.field_a <= this.field_i.field_a) {
                                                                      break L112;
                                                                    } else {
                                                                      this.field_f.field_a = this.field_f.field_a + 15;
                                                                      break L112;
                                                                    }
                                                                  }
                                                                  L113: {
                                                                    if (ii.field_e[0].field_i.field_b >= this.field_i.field_b) {
                                                                      break L113;
                                                                    } else {
                                                                      this.field_h = -1;
                                                                      this.field_f.field_b = this.field_f.field_b - 15;
                                                                      break L113;
                                                                    }
                                                                  }
                                                                  if (this.field_i.field_a > ii.field_e[0].field_i.field_a) {
                                                                    this.field_f.field_a = this.field_f.field_a - 15;
                                                                    break L110;
                                                                  } else {
                                                                    break L110;
                                                                  }
                                                                } else {
                                                                  L114: {
                                                                    this.field_f.field_b = this.field_f.field_b + this.field_h * 15;
                                                                    if (this.field_i.field_a >= ii.field_e[0].field_i.field_a) {
                                                                      break L114;
                                                                    } else {
                                                                      this.field_f.field_a = this.field_f.field_a + 18;
                                                                      break L114;
                                                                    }
                                                                  }
                                                                  if (this.field_i.field_a > ii.field_e[0].field_i.field_a) {
                                                                    this.field_f.field_a = this.field_f.field_a - 18;
                                                                    break L110;
                                                                  } else {
                                                                    break L110;
                                                                  }
                                                                }
                                                              }
                                                              this.e(false);
                                                              if (-301 > (this.field_z ^ -1)) {
                                                                this.field_k = 1;
                                                                break L3;
                                                              } else {
                                                                break L3;
                                                              }
                                                            } else {
                                                              if (-21 == (var4 ^ -1)) {
                                                                break L3;
                                                              } else {
                                                                if (var4 == 21) {
                                                                  L115: {
                                                                    if ((this.field_i.field_b ^ -1) > -1) {
                                                                      this.field_h = 1;
                                                                      this.field_i.field_b = 0;
                                                                      this.field_f.field_b = 0;
                                                                      break L115;
                                                                    } else {
                                                                      break L115;
                                                                    }
                                                                  }
                                                                  L116: {
                                                                    if ((this.field_i.field_b ^ -1) <= -21) {
                                                                      this.field_i.field_b = 20;
                                                                      this.field_h = -1;
                                                                      this.field_f.field_b = 0;
                                                                      break L116;
                                                                    } else {
                                                                      break L116;
                                                                    }
                                                                  }
                                                                  L117: {
                                                                    if ((this.b(param1, -4) ^ -1) != -2) {
                                                                      break L117;
                                                                    } else {
                                                                      if (this.field_f.field_a != 0) {
                                                                        break L117;
                                                                      } else {
                                                                        if (this.field_e <= 0) {
                                                                          this.b(5);
                                                                          break L3;
                                                                        } else {
                                                                          break L117;
                                                                        }
                                                                      }
                                                                    }
                                                                  }
                                                                  this.a(1, si.field_j, param1, 1, 30, 1, tl.field_a, pk.field_s, (byte) 126);
                                                                  break L3;
                                                                } else {
                                                                  if (var4 != 22) {
                                                                    L118: {
                                                                      if ((var4 ^ -1) != -24) {
                                                                        if (31 == var4) {
                                                                          break L118;
                                                                        } else {
                                                                          if (-27 != (var4 ^ -1)) {
                                                                            if (var4 != 27) {
                                                                              if (var4 != 28) {
                                                                                if (29 != var4) {
                                                                                  if (var4 == 30) {
                                                                                    if ((this.field_p ^ -1) >= -1) {
                                                                                      this.a(false, 120, param1);
                                                                                      break L3;
                                                                                    } else {
                                                                                      if (-1 != (this.field_r ^ -1)) {
                                                                                        this.a(100, param1);
                                                                                        break L3;
                                                                                      } else {
                                                                                        L119: {
                                                                                          if (this.field_x == 0) {
                                                                                            L120: {
                                                                                              if (this.field_i.field_a < ii.field_e[0].field_i.field_a) {
                                                                                                this.field_w = this.field_w + 1;
                                                                                                break L120;
                                                                                              } else {
                                                                                                break L120;
                                                                                              }
                                                                                            }
                                                                                            this.a(false, 2, 20, (byte) -78, param1);
                                                                                            fieldTemp$30 = this.field_w;
                                                                                            this.field_w = this.field_w + 1;
                                                                                            if (200 >= fieldTemp$30) {
                                                                                              break L119;
                                                                                            } else {
                                                                                              L121: {
                                                                                                this.field_x = 1;
                                                                                                stackIn_861_0 = this;

                                                                                                if (this.field_i.field_b <= ii.field_e[0].field_i.field_b) {
                                                                                                  stackIn_862_0 = this;
                                                                                                  stackIn_862_1 = -1;
                                                                                                  break L121;
                                                                                                } else {
                                                                                                  stackIn_862_0 = this;
                                                                                                  stackIn_862_1 = 1;
                                                                                                  break L121;
                                                                                                }
                                                                                              }
                                                                                              ((eg) (this)).field_h = stackIn_862_1;
                                                                                              this.field_z = 0;
                                                                                              this.field_w = 0;
                                                                                              if (80.0 <= 100.0 * Math.random()) {
                                                                                                break L119;
                                                                                              } else {
                                                                                                L122: {
                                                                                                  this.field_x = 4;
                                                                                                  stackIn_865_0 = this;

                                                                                                  if (ii.field_e[0].field_i.field_b >= this.field_i.field_b) {
                                                                                                    stackIn_866_0 = this;
                                                                                                    stackIn_866_1 = 1;
                                                                                                    break L122;
                                                                                                  } else {
                                                                                                    stackIn_866_0 = this;
                                                                                                    stackIn_866_1 = -1;
                                                                                                    break L122;
                                                                                                  }
                                                                                                }
                                                                                                ((eg) (this)).field_h = stackIn_866_1;
                                                                                                break L119;
                                                                                              }
                                                                                            }
                                                                                          } else {
                                                                                            break L119;
                                                                                          }
                                                                                        }
                                                                                        L123: {
                                                                                          if (-2 == (this.field_x ^ -1)) {
                                                                                            L124: {
                                                                                              fieldTemp$31 = this.field_w;
                                                                                              this.field_w = this.field_w + 1;
                                                                                              if (-26 <= (fieldTemp$31 ^ -1)) {
                                                                                                break L124;
                                                                                              } else {
                                                                                                this.field_e = 70;
                                                                                                this.field_w = 0;
                                                                                                this.field_x = 2;
                                                                                                break L124;
                                                                                              }
                                                                                            }
                                                                                            this.field_n = 19;
                                                                                            break L123;
                                                                                          } else {
                                                                                            break L123;
                                                                                          }
                                                                                        }
                                                                                        L125: {
                                                                                          if (2 != this.field_x) {
                                                                                            break L125;
                                                                                          } else {
                                                                                            this.a(false, 22, 25, param1);
                                                                                            if (this.field_x == 0) {
                                                                                              this.field_z = 0;
                                                                                              this.field_w = (int)(100.0 * Math.random());
                                                                                              break L125;
                                                                                            } else {
                                                                                              break L125;
                                                                                            }
                                                                                          }
                                                                                        }
                                                                                        L126: {
                                                                                          if (this.field_x == 3) {
                                                                                            this.a(25, -128, false, param1);
                                                                                            if (this.field_x == 0) {
                                                                                              this.field_z = 0;
                                                                                              this.field_w = (int)(Math.random() * 100.0);
                                                                                              break L126;
                                                                                            } else {
                                                                                              break L126;
                                                                                            }
                                                                                          } else {
                                                                                            break L126;
                                                                                          }
                                                                                        }
                                                                                        L127: {
                                                                                          if ((this.field_x ^ -1) == -5) {
                                                                                            if (this.a(false, param1, param0 ^ -100)) {
                                                                                              L128: {
                                                                                                ii.field_e[od.field_k].a(9147, 35, this.field_i);
                                                                                                ii.field_e[od.field_k].field_f.a(-103, this.field_f);
                                                                                                dupTemp$32 = ii.field_e[od.field_k].field_f;
                                                                                                dupTemp$32.field_b = dupTemp$32.field_b + (40 + 120 * this.field_h);
                                                                                                dupTemp$33 = ii.field_e[od.field_k].field_f;
                                                                                                dupTemp$33.field_a = dupTemp$33.field_a + 520;
                                                                                                ii.field_e[od.field_k].field_h = this.field_h;
                                                                                                ii.field_e[od.field_k].field_w = 0;
                                                                                                od.field_k = od.field_k + 1;
                                                                                                stackIn_887_0 = 0;

                                                                                                if (pk.field_s) {
                                                                                                  stackIn_888_0 = stackIn_887_0;
                                                                                                  stackIn_888_1 = 0;
                                                                                                  break L128;
                                                                                                } else {
                                                                                                  stackIn_888_0 = stackIn_887_0;
                                                                                                  stackIn_888_1 = 1;
                                                                                                  break L128;
                                                                                                }
                                                                                              }
                                                                                              if (stackIn_888_0 == stackIn_888_1) {
                                                                                                tl.field_a.a(si.field_j[13], 100, ee.field_p * 256 / 100);
                                                                                                break L127;
                                                                                              } else {
                                                                                                break L127;
                                                                                              }
                                                                                            } else {
                                                                                              break L127;
                                                                                            }
                                                                                          } else {
                                                                                            break L127;
                                                                                          }
                                                                                        }
                                                                                        this.e(false);
                                                                                        break L3;
                                                                                      }
                                                                                    }
                                                                                  } else {
                                                                                    if (32 == var4) {
                                                                                      if ((this.field_p ^ -1) < -1) {
                                                                                        if (this.field_r == 0) {
                                                                                          L129: {
                                                                                            if (this.field_x == 0) {
                                                                                              L130: {
                                                                                                if (ii.field_e[0].field_i.field_a > this.field_i.field_a) {
                                                                                                  this.field_w = this.field_w + 1;
                                                                                                  break L130;
                                                                                                } else {
                                                                                                  break L130;
                                                                                                }
                                                                                              }
                                                                                              this.a(false, 2, 20, (byte) -92, param1);
                                                                                              fieldTemp$34 = this.field_w;
                                                                                              this.field_w = this.field_w + 1;
                                                                                              if (200 < fieldTemp$34) {
                                                                                                this.field_w = 0;
                                                                                                this.field_z = 0;
                                                                                                this.field_x = 3;
                                                                                                break L129;
                                                                                              } else {
                                                                                                break L129;
                                                                                              }
                                                                                            } else {
                                                                                              break L129;
                                                                                            }
                                                                                          }
                                                                                          L131: {
                                                                                            if (3 == this.field_x) {
                                                                                              L132: {
                                                                                                this.field_n = this.field_n - 4;
                                                                                                this.a(20, (byte) 116, param1, false);
                                                                                                this.field_n = this.field_n + 4;
                                                                                                fieldTemp$35 = this.field_w;
                                                                                                this.field_w = this.field_w + 1;
                                                                                                if (-301 <= (fieldTemp$35 ^ -1)) {
                                                                                                  break L132;
                                                                                                } else {
                                                                                                  if (1 != this.b(param1, param0 ^ 121)) {
                                                                                                    break L132;
                                                                                                  } else {
                                                                                                    if (this.field_f.field_a == 0) {
                                                                                                      this.field_x = 0;
                                                                                                      this.field_w = 0;
                                                                                                      break L132;
                                                                                                    } else {
                                                                                                      break L132;
                                                                                                    }
                                                                                                  }
                                                                                                }
                                                                                              }
                                                                                              L133: {
                                                                                                if ((this.field_w % 100 ^ -1) == -26) {
                                                                                                  ii.field_e[od.field_k].a(9147, 42, this.field_i);
                                                                                                  ii.field_e[od.field_k].field_f.a(param0 ^ 26, this.field_f);
                                                                                                  dupTemp$36 = ii.field_e[od.field_k].field_f;
                                                                                                  dupTemp$36.field_b = dupTemp$36.field_b + (this.field_h * 120 + 40);
                                                                                                  dupTemp$37 = ii.field_e[od.field_k].field_f;
                                                                                                  dupTemp$37.field_a = dupTemp$37.field_a + 40;
                                                                                                  ii.field_e[od.field_k].field_h = this.field_h;
                                                                                                  ii.field_e[od.field_k].field_w = 0;
                                                                                                  od.field_k = od.field_k + 1;
                                                                                                  if (pk.field_s) {
                                                                                                    tl.field_a.a(si.field_j[13], 100, ee.field_p * 256 / 100);
                                                                                                    break L133;
                                                                                                  } else {
                                                                                                    break L133;
                                                                                                  }
                                                                                                } else {
                                                                                                  break L133;
                                                                                                }
                                                                                              }
                                                                                              L134: {
                                                                                                if (-21 <= (this.field_w % 100 ^ -1)) {
                                                                                                  break L134;
                                                                                                } else {
                                                                                                  if (this.field_w % 100 >= 30) {
                                                                                                    break L134;
                                                                                                  } else {
                                                                                                    this.field_n = 26;
                                                                                                    break L131;
                                                                                                  }
                                                                                                }
                                                                                              }
                                                                                              if (10 < this.field_n) {
                                                                                                this.field_n = 6;
                                                                                                break L131;
                                                                                              } else {
                                                                                                break L131;
                                                                                              }
                                                                                            } else {
                                                                                              break L131;
                                                                                            }
                                                                                          }
                                                                                          this.e(false);
                                                                                          break L3;
                                                                                        } else {
                                                                                          this.a(param0 + 150, param1);
                                                                                          break L3;
                                                                                        }
                                                                                      } else {
                                                                                        this.a(false, param0 ^ -3, param1);
                                                                                        break L3;
                                                                                      }
                                                                                    } else {
                                                                                      if (var4 != 33) {
                                                                                        if (-35 != (var4 ^ -1)) {
                                                                                          L135: {
                                                                                            if (35 != var4) {
                                                                                              if ((var4 ^ -1) == -44) {
                                                                                                break L135;
                                                                                              } else {
                                                                                                if ((var4 ^ -1) == -37) {
                                                                                                  if (-1 <= (this.field_p ^ -1)) {
                                                                                                    this.a(false, param0 ^ -3, param1);
                                                                                                    break L3;
                                                                                                  } else {
                                                                                                    if (this.field_r == 0) {
                                                                                                      L136: {
                                                                                                        if (this.field_x != 0) {
                                                                                                          break L136;
                                                                                                        } else {
                                                                                                          if (ii.field_e[0].field_i.field_a > this.field_i.field_a) {
                                                                                                            L137: {
                                                                                                              this.field_w = 0;
                                                                                                              if (ii.field_e[0].field_i.field_b <= this.field_i.field_b - 5) {
                                                                                                                this.field_h = -1;
                                                                                                                break L137;
                                                                                                              } else {
                                                                                                                break L137;
                                                                                                              }
                                                                                                            }
                                                                                                            this.field_e = 30;
                                                                                                            this.field_x = 2;
                                                                                                            if (this.field_i.field_b - -5 > ii.field_e[0].field_i.field_b) {
                                                                                                              break L136;
                                                                                                            } else {
                                                                                                              this.field_h = 1;
                                                                                                              break L136;
                                                                                                            }
                                                                                                          } else {
                                                                                                            this.a(false, 1, 15, (byte) -102, param1);
                                                                                                            break L136;
                                                                                                          }
                                                                                                        }
                                                                                                      }
                                                                                                      L138: {
                                                                                                        if (2 == this.field_x) {
                                                                                                          this.a(false, 22, 10, param1);
                                                                                                          break L138;
                                                                                                        } else {
                                                                                                          break L138;
                                                                                                        }
                                                                                                      }
                                                                                                      L139: {
                                                                                                        if (3 == this.field_x) {
                                                                                                          this.a(10, param0 ^ 26, false, param1);
                                                                                                          break L139;
                                                                                                        } else {
                                                                                                          break L139;
                                                                                                        }
                                                                                                      }
                                                                                                      L140: {
                                                                                                        if (500 < this.field_w) {
                                                                                                          this.field_p = 0;
                                                                                                          break L140;
                                                                                                        } else {
                                                                                                          break L140;
                                                                                                        }
                                                                                                      }
                                                                                                      this.e(false);
                                                                                                      break L3;
                                                                                                    } else {
                                                                                                      this.field_r = 0;
                                                                                                      this.field_p = 0;
                                                                                                      break L3;
                                                                                                    }
                                                                                                  }
                                                                                                } else {
                                                                                                  if (37 == var4) {
                                                                                                    if ((this.field_p ^ -1) < -1) {
                                                                                                      if (0 == this.field_r) {
                                                                                                        L141: {
                                                                                                          if (this.field_x != 0) {
                                                                                                            break L141;
                                                                                                          } else {
                                                                                                            L142: {
                                                                                                              this.a(false, 1, 15, (byte) -64, param1);
                                                                                                              if (ii.field_e[0].field_i.field_a <= this.field_i.field_a) {
                                                                                                                break L142;
                                                                                                              } else {
                                                                                                                this.field_w = this.field_w + 5;
                                                                                                                break L142;
                                                                                                              }
                                                                                                            }
                                                                                                            fieldTemp$38 = this.field_w;
                                                                                                            this.field_w = this.field_w + 1;
                                                                                                            if (-201 <= (fieldTemp$38 ^ -1)) {
                                                                                                              break L141;
                                                                                                            } else {
                                                                                                              L143: {
                                                                                                                this.field_w = 0;
                                                                                                                stackIn_1033_0 = this;

                                                                                                                if (ii.field_e[0].field_i.field_b < this.field_i.field_b) {
                                                                                                                  stackIn_1034_0 = this;
                                                                                                                  stackIn_1034_1 = -1;
                                                                                                                  break L143;
                                                                                                                } else {
                                                                                                                  stackIn_1034_0 = this;
                                                                                                                  stackIn_1034_1 = 1;
                                                                                                                  break L143;
                                                                                                                }
                                                                                                              }
                                                                                                              ((eg) (this)).field_h = stackIn_1034_1;
                                                                                                              this.field_x = 1;
                                                                                                              break L141;
                                                                                                            }
                                                                                                          }
                                                                                                        }
                                                                                                        L144: {
                                                                                                          if ((this.field_x ^ -1) == -2) {
                                                                                                            this.field_n = 19;
                                                                                                            fieldTemp$39 = this.field_w;
                                                                                                            this.field_w = this.field_w + 1;
                                                                                                            if (80 < fieldTemp$39) {
                                                                                                              this.field_e = 85;
                                                                                                              this.field_x = 2;
                                                                                                              this.field_w = 0;
                                                                                                              if (this.field_i.field_a >= ii.field_e[0].field_i.field_a) {
                                                                                                                this.field_e = 35;
                                                                                                                break L144;
                                                                                                              } else {
                                                                                                                break L144;
                                                                                                              }
                                                                                                            } else {
                                                                                                              break L144;
                                                                                                            }
                                                                                                          } else {
                                                                                                            break L144;
                                                                                                          }
                                                                                                        }
                                                                                                        L145: {
                                                                                                          if (this.field_x != 2) {
                                                                                                            break L145;
                                                                                                          } else {
                                                                                                            this.a(false, 22, 30, param1);
                                                                                                            if (-1 != (this.field_x ^ -1)) {
                                                                                                              break L145;
                                                                                                            } else {
                                                                                                              this.field_w = (int)(Math.random() * 100.0);
                                                                                                              break L145;
                                                                                                            }
                                                                                                          }
                                                                                                        }
                                                                                                        L146: {
                                                                                                          if (3 != this.field_x) {
                                                                                                            break L146;
                                                                                                          } else {
                                                                                                            this.a(15, -80, false, param1);
                                                                                                            if (-1 == (this.field_x ^ -1)) {
                                                                                                              this.field_w = (int)(Math.random() * 100.0);
                                                                                                              break L146;
                                                                                                            } else {
                                                                                                              break L146;
                                                                                                            }
                                                                                                          }
                                                                                                        }
                                                                                                        this.e(false);
                                                                                                        break L3;
                                                                                                      } else {
                                                                                                        this.a(116, param1);
                                                                                                        break L3;
                                                                                                      }
                                                                                                    } else {
                                                                                                      this.a(false, 120, param1);
                                                                                                      break L3;
                                                                                                    }
                                                                                                  } else {
                                                                                                    if (-39 != (var4 ^ -1)) {
                                                                                                      if (-40 != (var4 ^ -1)) {
                                                                                                        if (40 != var4) {
                                                                                                          if (41 != var4) {
                                                                                                            if (42 != var4) {
                                                                                                              if (var4 == 44) {
                                                                                                                L147: {
                                                                                                                  this.field_w = this.field_w + 1;
                                                                                                                  if (this.field_w > 150) {
                                                                                                                    this.field_k = 1;
                                                                                                                    break L147;
                                                                                                                  } else {
                                                                                                                    break L147;
                                                                                                                  }
                                                                                                                }
                                                                                                                this.field_f.field_a = this.field_f.field_a + 4;
                                                                                                                break L3;
                                                                                                              } else {
                                                                                                                if (-46 != (var4 ^ -1)) {
                                                                                                                  break L3;
                                                                                                                } else {
                                                                                                                  L148: {
                                                                                                                    this.field_n = 36;
                                                                                                                    if (-6 <= (this.field_w % 10 ^ -1)) {
                                                                                                                      break L148;
                                                                                                                    } else {
                                                                                                                      this.field_n = 37;
                                                                                                                      break L148;
                                                                                                                    }
                                                                                                                  }
                                                                                                                  L149: {
                                                                                                                    fieldTemp$40 = this.field_w;
                                                                                                                    this.field_w = this.field_w + 1;
                                                                                                                    if ((fieldTemp$40 ^ -1) >= -51) {
                                                                                                                      break L149;
                                                                                                                    } else {
                                                                                                                      this.field_k = 1;
                                                                                                                      break L149;
                                                                                                                    }
                                                                                                                  }
                                                                                                                  this.e(false);
                                                                                                                  break L3;
                                                                                                                }
                                                                                                              }
                                                                                                            } else {
                                                                                                              this.field_e = 2;
                                                                                                              this.a(1, si.field_j, param1, 1, 50, 0, tl.field_a, pk.field_s, (byte) 126);
                                                                                                              this.e(false);
                                                                                                              break L3;
                                                                                                            }
                                                                                                          } else {
                                                                                                            L150: {
                                                                                                              this.field_e = 2;
                                                                                                              this.a(1, si.field_j, param1, 1, 100, 0, tl.field_a, pk.field_s, (byte) -126);
                                                                                                              this.e(false);
                                                                                                              this.field_w = this.field_w + 1;
                                                                                                              if ((this.field_w % 10 ^ -1) <= -6) {
                                                                                                                this.field_n = 37;
                                                                                                                break L150;
                                                                                                              } else {
                                                                                                                this.field_n = 18;
                                                                                                                break L150;
                                                                                                              }
                                                                                                            }
                                                                                                            L151: {
                                                                                                              if (50 > this.field_w % 100) {
                                                                                                                this.field_f.field_a = this.field_f.field_a + (-(this.field_w % 50) + 50 - 25) / 4;
                                                                                                                break L151;
                                                                                                              } else {
                                                                                                                this.field_f.field_a = this.field_f.field_a + (-25 + this.field_w % 50) / 4;
                                                                                                                break L151;
                                                                                                              }
                                                                                                            }
                                                                                                            this.e(false);
                                                                                                            break L3;
                                                                                                          }
                                                                                                        } else {
                                                                                                          if (-1 > (this.field_p ^ -1)) {
                                                                                                            L152: {
                                                                                                              if (-6 < (ql.field_c ^ -1)) {
                                                                                                                me.field_f = me.field_f - 5;
                                                                                                                hi.field_c = hi.field_c - ql.field_c;
                                                                                                                ql.field_c = 5;
                                                                                                                break L152;
                                                                                                              } else {
                                                                                                                break L152;
                                                                                                              }
                                                                                                            }
                                                                                                            L153: {
                                                                                                              if (this.field_s <= 0) {
                                                                                                                break L153;
                                                                                                              } else {
                                                                                                                L154: {
                                                                                                                  if (ql.field_c != 6) {
                                                                                                                    break L154;
                                                                                                                  } else {
                                                                                                                    ii.field_e[od.field_k].a(param0 ^ -9154, 36, this.field_i);
                                                                                                                    ii.field_e[od.field_k].field_f.a(-110, this.field_f);
                                                                                                                    dupTemp$41 = ii.field_e[od.field_k].field_f;
                                                                                                                    dupTemp$41.field_b = dupTemp$41.field_b + (40 + this.field_h * 120);
                                                                                                                    dupTemp$42 = ii.field_e[od.field_k].field_f;
                                                                                                                    dupTemp$42.field_a = dupTemp$42.field_a + 40;
                                                                                                                    ii.field_e[od.field_k].field_h = this.field_h;
                                                                                                                    ii.field_e[od.field_k].field_w = 0;
                                                                                                                    od.field_k = od.field_k + 1;
                                                                                                                    break L154;
                                                                                                                  }
                                                                                                                }
                                                                                                                L155: {
                                                                                                                  this.field_p = this.field_p - 1;
                                                                                                                  this.field_s = this.field_s - 1;
                                                                                                                  if (this.field_p <= 0) {
                                                                                                                    this.c(false);
                                                                                                                    break L155;
                                                                                                                  } else {
                                                                                                                    break L155;
                                                                                                                  }
                                                                                                                }
                                                                                                                if (pk.field_s) {
                                                                                                                  tl.field_a.a(si.field_j[28], 100, 256 * ee.field_p / 100);
                                                                                                                  break L153;
                                                                                                                } else {
                                                                                                                  break L153;
                                                                                                                }
                                                                                                              }
                                                                                                            }
                                                                                                            L156: {
                                                                                                              if (5 == ql.field_c) {
                                                                                                                L157: {
                                                                                                                  this.field_w = this.field_w + 1;
                                                                                                                  this.field_d = 80;
                                                                                                                  fieldTemp$43 = this.field_z;
                                                                                                                  this.field_z = this.field_z - 1;
                                                                                                                  if (0 > fieldTemp$43) {
                                                                                                                    this.field_z = 10;
                                                                                                                    this.field_n = this.field_n + 1;
                                                                                                                    if ((this.field_n ^ -1) >= -4) {
                                                                                                                      break L157;
                                                                                                                    } else {
                                                                                                                      this.field_n = 0;
                                                                                                                      break L157;
                                                                                                                    }
                                                                                                                  } else {
                                                                                                                    break L157;
                                                                                                                  }
                                                                                                                }
                                                                                                                L158: {
                                                                                                                  L159: {
                                                                                                                    if ((this.field_w ^ -1) == -501) {
                                                                                                                      break L159;
                                                                                                                    } else {
                                                                                                                      if (-2501 == (this.field_w ^ -1)) {
                                                                                                                        break L159;
                                                                                                                      } else {
                                                                                                                        break L158;
                                                                                                                      }
                                                                                                                    }
                                                                                                                  }
                                                                                                                  ii.field_e[od.field_k].a(param0 + 9270, 39, this.field_i);
                                                                                                                  ii.field_e[od.field_k].field_i.field_b = 0;
                                                                                                                  ii.field_e[od.field_k].field_i.field_a = 15;
                                                                                                                  ii.field_e[od.field_k].field_h = 1;
                                                                                                                  ii.field_e[od.field_k].field_w = 0;
                                                                                                                  od.field_k = od.field_k + 1;
                                                                                                                  break L158;
                                                                                                                }
                                                                                                                L160: {
                                                                                                                  if (-1501 == (this.field_w ^ -1)) {
                                                                                                                    ii.field_e[od.field_k].a(param0 ^ -9154, 39, this.field_i);
                                                                                                                    ii.field_e[od.field_k].field_i.field_b = 19;
                                                                                                                    ii.field_e[od.field_k].field_i.field_a = 15;
                                                                                                                    ii.field_e[od.field_k].field_h = 1;
                                                                                                                    ii.field_e[od.field_k].field_w = 0;
                                                                                                                    od.field_k = od.field_k + 1;
                                                                                                                    break L160;
                                                                                                                  } else {
                                                                                                                    break L160;
                                                                                                                  }
                                                                                                                }
                                                                                                                L161: {
                                                                                                                  if (3000 < this.field_w) {
                                                                                                                    break L161;
                                                                                                                  } else {
                                                                                                                    if (-151 < (this.field_p ^ -1)) {
                                                                                                                      break L161;
                                                                                                                    } else {
                                                                                                                      break L156;
                                                                                                                    }
                                                                                                                  }
                                                                                                                }
                                                                                                                this.field_d = 96;
                                                                                                                wg.field_b = wg.field_b - ql.field_c;
                                                                                                                ic.field_a = ic.field_a - 6;
                                                                                                                this.field_n = 0;
                                                                                                                this.field_w = 0;
                                                                                                                this.field_f.field_b = this.field_f.field_b - 40;
                                                                                                                ql.field_c = 6;
                                                                                                                this.field_x = 0;
                                                                                                                if (pk.field_s) {
                                                                                                                  tl.field_a.a(si.field_j[22], 100, ee.field_p * 256 / 100);
                                                                                                                  break L156;
                                                                                                                } else {
                                                                                                                  break L156;
                                                                                                                }
                                                                                                              } else {
                                                                                                                break L156;
                                                                                                              }
                                                                                                            }
                                                                                                            L162: {
                                                                                                              if ((ql.field_c ^ -1) != -7) {
                                                                                                                break L162;
                                                                                                              } else {
                                                                                                                L163: {
                                                                                                                  L164: {
                                                                                                                    if (0 == this.field_x) {
                                                                                                                      break L164;
                                                                                                                    } else {
                                                                                                                      if ((this.field_x ^ -1) != -2) {
                                                                                                                        break L163;
                                                                                                                      } else {
                                                                                                                        break L164;
                                                                                                                      }
                                                                                                                    }
                                                                                                                  }
                                                                                                                  L165: {
                                                                                                                    this.field_n = 0;
                                                                                                                    if ((this.field_w ^ -1) <= -1) {
                                                                                                                      break L165;
                                                                                                                    } else {
                                                                                                                      this.field_n = 3;
                                                                                                                      break L165;
                                                                                                                    }
                                                                                                                  }
                                                                                                                  fieldTemp$44 = this.field_w;
                                                                                                                  this.field_w = this.field_w + 1;
                                                                                                                  if (10 >= fieldTemp$44) {
                                                                                                                    break L163;
                                                                                                                  } else {
                                                                                                                    L166: {
                                                                                                                      this.field_w = 0;
                                                                                                                      this.field_e = 100;
                                                                                                                      this.field_x = 2;
                                                                                                                      if (ii.field_e[0].field_i.field_a > this.field_i.field_a) {
                                                                                                                        break L166;
                                                                                                                      } else {
                                                                                                                        this.field_e = 70;
                                                                                                                        break L166;
                                                                                                                      }
                                                                                                                    }
                                                                                                                    L167: {
                                                                                                                      stackIn_1147_0 = this;

                                                                                                                      if (this.field_i.field_b > ii.field_e[0].field_i.field_b) {
                                                                                                                        stackIn_1148_0 = this;
                                                                                                                        stackIn_1148_1 = -1;
                                                                                                                        break L167;
                                                                                                                      } else {
                                                                                                                        stackIn_1148_0 = this;
                                                                                                                        stackIn_1148_1 = 1;
                                                                                                                        break L167;
                                                                                                                      }
                                                                                                                    }
                                                                                                                    ((eg) (this)).field_h = stackIn_1148_1;
                                                                                                                    break L163;
                                                                                                                  }
                                                                                                                }
                                                                                                                L168: {
                                                                                                                  if (2 != this.field_x) {
                                                                                                                    break L168;
                                                                                                                  } else {
                                                                                                                    this.a(true, 22, 15, param1);
                                                                                                                    this.field_n = 1;
                                                                                                                    if (-61 >= (this.field_e ^ -1)) {
                                                                                                                      break L168;
                                                                                                                    } else {
                                                                                                                      this.field_n = 2;
                                                                                                                      break L168;
                                                                                                                    }
                                                                                                                  }
                                                                                                                }
                                                                                                                L169: {
                                                                                                                  if (3 == this.field_x) {
                                                                                                                    this.a(15, param0 + 7, true, param1);
                                                                                                                    this.field_n = 2;
                                                                                                                    if (this.field_x == 0) {
                                                                                                                      L170: {
                                                                                                                        this.field_w = -10;
                                                                                                                        if (this.field_i.field_a <= ii.field_e[0].field_i.field_a) {
                                                                                                                          break L170;
                                                                                                                        } else {
                                                                                                                          if (-3 <= (this.field_i.field_a ^ -1)) {
                                                                                                                            break L170;
                                                                                                                          } else {
                                                                                                                            this.field_i.field_a = this.field_i.field_a - 1;
                                                                                                                            this.field_f.field_a = this.field_f.field_a + 230;
                                                                                                                            this.field_x = 3;
                                                                                                                            break L169;
                                                                                                                          }
                                                                                                                        }
                                                                                                                      }
                                                                                                                      this.field_n = 3;
                                                                                                                      ii.field_e[od.field_k].a(9147, 45, this.field_i);
                                                                                                                      ii.field_e[od.field_k].field_f.a(-88, this.field_f);
                                                                                                                      ii.field_e[od.field_k].field_w = 0;
                                                                                                                      od.field_k = od.field_k + 1;
                                                                                                                      if (!pk.field_s) {
                                                                                                                        break L169;
                                                                                                                      } else {
                                                                                                                        tl.field_a.a(si.field_j[5], 100, ee.field_p * 256 / 100);
                                                                                                                        break L169;
                                                                                                                      }
                                                                                                                    } else {
                                                                                                                      break L169;
                                                                                                                    }
                                                                                                                  } else {
                                                                                                                    break L169;
                                                                                                                  }
                                                                                                                }
                                                                                                                L171: {
                                                                                                                  if (75 <= this.field_p) {
                                                                                                                    break L171;
                                                                                                                  } else {
                                                                                                                    if ((this.field_x ^ -1) != -5) {
                                                                                                                      this.field_e = 60;
                                                                                                                      this.field_x = 4;
                                                                                                                      break L171;
                                                                                                                    } else {
                                                                                                                      break L171;
                                                                                                                    }
                                                                                                                  }
                                                                                                                }
                                                                                                                if (this.field_x != 4) {
                                                                                                                  break L162;
                                                                                                                } else {
                                                                                                                  L172: {
                                                                                                                    this.a(10, param0 ^ 20, true, param1);
                                                                                                                    if (3 == this.field_x) {
                                                                                                                      this.field_x = 4;
                                                                                                                      break L172;
                                                                                                                    } else {
                                                                                                                      break L172;
                                                                                                                    }
                                                                                                                  }
                                                                                                                  this.field_n = 31;
                                                                                                                  if (-1 == (this.field_x ^ -1)) {
                                                                                                                    if (2 >= this.field_i.field_a) {
                                                                                                                      L173: {
                                                                                                                        this.field_i.field_a = 2;
                                                                                                                        this.field_n = 2;
                                                                                                                        this.field_f.field_a = 0;
                                                                                                                        me.field_f = me.field_f + ql.field_c;
                                                                                                                        w.field_b = 0;
                                                                                                                        hi.field_c = hi.field_c + 7;
                                                                                                                        this.field_x = 0;
                                                                                                                        this.field_d = 128;
                                                                                                                        this.field_w = 0;
                                                                                                                        ql.field_c = 7;
                                                                                                                        this.field_f.field_b = this.field_f.field_b - 40;
                                                                                                                        this.field_n = 0;
                                                                                                                        stackIn_1175_0 = 0;

                                                                                                                        if (pk.field_s) {
                                                                                                                          stackIn_1176_0 = stackIn_1175_0;
                                                                                                                          stackIn_1176_1 = 0;
                                                                                                                          break L173;
                                                                                                                        } else {
                                                                                                                          stackIn_1176_0 = stackIn_1175_0;
                                                                                                                          stackIn_1176_1 = 1;
                                                                                                                          break L173;
                                                                                                                        }
                                                                                                                      }
                                                                                                                      if (stackIn_1176_0 != stackIn_1176_1) {
                                                                                                                        break L162;
                                                                                                                      } else {
                                                                                                                        tl.field_a.a(si.field_j[5], 100, 256 * ee.field_p / 100);
                                                                                                                        break L162;
                                                                                                                      }
                                                                                                                    } else {
                                                                                                                      this.field_i.field_a = this.field_i.field_a - 1;
                                                                                                                      this.field_x = 4;
                                                                                                                      this.field_f.field_a = this.field_f.field_a + 230;
                                                                                                                      break L162;
                                                                                                                    }
                                                                                                                  } else {
                                                                                                                    break L162;
                                                                                                                  }
                                                                                                                }
                                                                                                              }
                                                                                                            }
                                                                                                            L174: {
                                                                                                              if (-8 == (ql.field_c ^ -1)) {
                                                                                                                if (w.field_b < 250) {
                                                                                                                  L175: {
                                                                                                                    fieldTemp$45 = this.field_z;
                                                                                                                    this.field_z = this.field_z - 1;
                                                                                                                    if (0 >= fieldTemp$45) {
                                                                                                                      L176: {
                                                                                                                        this.field_n = this.field_n + 1;
                                                                                                                        if (-2 <= (this.field_n ^ -1)) {
                                                                                                                          break L176;
                                                                                                                        } else {
                                                                                                                          this.field_n = 0;
                                                                                                                          break L176;
                                                                                                                        }
                                                                                                                      }
                                                                                                                      this.field_z = 5;
                                                                                                                      break L175;
                                                                                                                    } else {
                                                                                                                      break L175;
                                                                                                                    }
                                                                                                                  }
                                                                                                                  L177: {
                                                                                                                    this.field_o = 7;
                                                                                                                    this.field_p = 75;
                                                                                                                    w.field_b = w.field_b + 1;
                                                                                                                    if (200 >= w.field_b) {
                                                                                                                      break L177;
                                                                                                                    } else {
                                                                                                                      L178: {
                                                                                                                        this.field_n = 23;
                                                                                                                        stackIn_1230_0 = 0;

                                                                                                                        if (pk.field_s) {
                                                                                                                          stackIn_1231_0 = stackIn_1230_0;
                                                                                                                          stackIn_1231_1 = 0;
                                                                                                                          break L178;
                                                                                                                        } else {
                                                                                                                          stackIn_1231_0 = stackIn_1230_0;
                                                                                                                          stackIn_1231_1 = 1;
                                                                                                                          break L178;
                                                                                                                        }
                                                                                                                      }
                                                                                                                      if (stackIn_1231_0 == stackIn_1231_1) {
                                                                                                                        tl.field_a.a(si.field_j[22], 100, 256 * ee.field_p / 100);
                                                                                                                        break L177;
                                                                                                                      } else {
                                                                                                                        break L177;
                                                                                                                      }
                                                                                                                    }
                                                                                                                  }
                                                                                                                  if (250 <= w.field_b) {
                                                                                                                    this.field_z = 0;
                                                                                                                    this.field_x = 0;
                                                                                                                    this.field_w = 0;
                                                                                                                    this.field_n = 25;
                                                                                                                    break L174;
                                                                                                                  } else {
                                                                                                                    break L174;
                                                                                                                  }
                                                                                                                } else {
                                                                                                                  L179: {
                                                                                                                    if (-1 != (this.field_x ^ -1)) {
                                                                                                                      break L179;
                                                                                                                    } else {
                                                                                                                      L180: {
                                                                                                                        this.field_z = this.field_z + 1;
                                                                                                                        if (10 < this.field_z) {
                                                                                                                          L181: {
                                                                                                                            this.field_n = this.field_n + 1;
                                                                                                                            if ((this.field_n ^ -1) == -28) {
                                                                                                                              ii.field_e[od.field_k].a(9147, 41, this.field_i);
                                                                                                                              ii.field_e[od.field_k].field_f.a(-85, this.field_f);
                                                                                                                              dupTemp$46 = ii.field_e[od.field_k].field_f;
                                                                                                                              dupTemp$46.field_b = dupTemp$46.field_b + (40 + this.field_h * 120);
                                                                                                                              dupTemp$47 = ii.field_e[od.field_k].field_f;
                                                                                                                              dupTemp$47.field_a = dupTemp$47.field_a + 40;
                                                                                                                              ii.field_e[od.field_k].field_h = this.field_h;
                                                                                                                              ii.field_e[od.field_k].field_w = (int)(Math.random() * 100.0);
                                                                                                                              od.field_k = od.field_k + 1;
                                                                                                                              if (pk.field_s) {
                                                                                                                                tl.field_a.a(nl.field_q[36], 100, 192 * ee.field_p / 100);
                                                                                                                                break L181;
                                                                                                                              } else {
                                                                                                                                break L181;
                                                                                                                              }
                                                                                                                            } else {
                                                                                                                              break L181;
                                                                                                                            }
                                                                                                                          }
                                                                                                                          L182: {
                                                                                                                            if (25 > this.field_n) {
                                                                                                                              this.field_n = 25;
                                                                                                                              break L182;
                                                                                                                            } else {
                                                                                                                              break L182;
                                                                                                                            }
                                                                                                                          }
                                                                                                                          if ((this.field_n ^ -1) < -28) {
                                                                                                                            this.field_n = 19;
                                                                                                                            this.field_w = this.field_w + 1;
                                                                                                                            break L180;
                                                                                                                          } else {
                                                                                                                            break L180;
                                                                                                                          }
                                                                                                                        } else {
                                                                                                                          break L180;
                                                                                                                        }
                                                                                                                      }
                                                                                                                      if ((this.field_w ^ -1) >= -9) {
                                                                                                                        break L179;
                                                                                                                      } else {
                                                                                                                        L183: {
                                                                                                                          this.field_w = 0;
                                                                                                                          this.field_x = 2;
                                                                                                                          this.field_z = 0;
                                                                                                                          this.field_e = 5;
                                                                                                                          if (ii.field_e[0].field_i.field_a <= 2 + this.field_i.field_a) {
                                                                                                                            break L183;
                                                                                                                          } else {
                                                                                                                            this.field_e = 80;
                                                                                                                            break L183;
                                                                                                                          }
                                                                                                                        }
                                                                                                                        if (ii.field_e[0].field_i.field_a < this.field_i.field_a) {
                                                                                                                          this.field_i.field_a = this.field_i.field_a - 1;
                                                                                                                          this.field_f.field_a = this.field_f.field_a + 230;
                                                                                                                          this.field_e = -5;
                                                                                                                          this.field_x = 3;
                                                                                                                          break L179;
                                                                                                                        } else {
                                                                                                                          break L179;
                                                                                                                        }
                                                                                                                      }
                                                                                                                    }
                                                                                                                  }
                                                                                                                  L184: {
                                                                                                                    if (this.field_x != 2) {
                                                                                                                      break L184;
                                                                                                                    } else {
                                                                                                                      L185: {
                                                                                                                        this.a(false, 22, 25, param1);
                                                                                                                        if ((this.field_e ^ -1) < -1) {
                                                                                                                          break L185;
                                                                                                                        } else {
                                                                                                                          this.field_x = 3;
                                                                                                                          break L185;
                                                                                                                        }
                                                                                                                      }
                                                                                                                      this.field_n = 21;
                                                                                                                      break L184;
                                                                                                                    }
                                                                                                                  }
                                                                                                                  if (-4 != (this.field_x ^ -1)) {
                                                                                                                    break L174;
                                                                                                                  } else {
                                                                                                                    L186: {
                                                                                                                      var4 = 40;
                                                                                                                      if (ii.field_e[0].field_i.field_a < -2 + this.field_i.field_a) {
                                                                                                                        var4 = 20;
                                                                                                                        break L186;
                                                                                                                      } else {
                                                                                                                        break L186;
                                                                                                                      }
                                                                                                                    }
                                                                                                                    this.a(var4, (byte) -82, param1, true);
                                                                                                                    fieldTemp$48 = this.field_w;
                                                                                                                    this.field_w = this.field_w + 1;
                                                                                                                    if (-26 <= (fieldTemp$48 ^ -1)) {
                                                                                                                      break L174;
                                                                                                                    } else {
                                                                                                                      if (this.b(param1, -4) != 1) {
                                                                                                                        break L174;
                                                                                                                      } else {
                                                                                                                        if (-1 == (this.field_f.field_a ^ -1)) {
                                                                                                                          L187: {
                                                                                                                            this.field_n = 25;
                                                                                                                            this.field_w = 0;
                                                                                                                            this.field_z = 0;
                                                                                                                            stackIn_1215_0 = this;

                                                                                                                            if (ii.field_e[0].field_i.field_b >= this.field_i.field_b) {
                                                                                                                              stackIn_1216_0 = this;
                                                                                                                              stackIn_1216_1 = 1;
                                                                                                                              break L187;
                                                                                                                            } else {
                                                                                                                              stackIn_1216_0 = this;
                                                                                                                              stackIn_1216_1 = -1;
                                                                                                                              break L187;
                                                                                                                            }
                                                                                                                          }
                                                                                                                          L188: {
                                                                                                                            ((eg) (this)).field_h = stackIn_1216_1;
                                                                                                                            this.field_x = 0;
                                                                                                                            stackIn_1218_0 = 0;

                                                                                                                            if (pk.field_s) {
                                                                                                                              stackIn_1219_0 = stackIn_1218_0;
                                                                                                                              stackIn_1219_1 = 0;
                                                                                                                              break L188;
                                                                                                                            } else {
                                                                                                                              stackIn_1219_0 = stackIn_1218_0;
                                                                                                                              stackIn_1219_1 = 1;
                                                                                                                              break L188;
                                                                                                                            }
                                                                                                                          }
                                                                                                                          if (stackIn_1219_0 != stackIn_1219_1) {
                                                                                                                            break L174;
                                                                                                                          } else {
                                                                                                                            tl.field_a.a(si.field_j[5], 100, 256 * ee.field_p / 100);
                                                                                                                            break L174;
                                                                                                                          }
                                                                                                                        } else {
                                                                                                                          break L174;
                                                                                                                        }
                                                                                                                      }
                                                                                                                    }
                                                                                                                  }
                                                                                                                }
                                                                                                              } else {
                                                                                                                break L174;
                                                                                                              }
                                                                                                            }
                                                                                                            this.e(false);
                                                                                                            break L3;
                                                                                                          } else {
                                                                                                            this.a(true, 120, param1);
                                                                                                            break L3;
                                                                                                          }
                                                                                                        }
                                                                                                      } else {
                                                                                                        if ((this.field_p ^ -1) < -1) {
                                                                                                          if (-1 != (this.field_r ^ -1)) {
                                                                                                            this.a(35, param1);
                                                                                                            break L3;
                                                                                                          } else {
                                                                                                            L189: {
                                                                                                              if (-1 != (this.field_x ^ -1)) {
                                                                                                                break L189;
                                                                                                              } else {
                                                                                                                L190: {
                                                                                                                  if (ii.field_e[0].field_i.field_a > this.field_i.field_a) {
                                                                                                                    this.field_w = this.field_w + 1;
                                                                                                                    break L190;
                                                                                                                  } else {
                                                                                                                    break L190;
                                                                                                                  }
                                                                                                                }
                                                                                                                this.a(false, 2, 20, (byte) -122, param1);
                                                                                                                fieldTemp$49 = this.field_w;
                                                                                                                this.field_w = this.field_w + 1;
                                                                                                                if (200 < fieldTemp$49) {
                                                                                                                  this.field_x = 3;
                                                                                                                  this.field_z = 0;
                                                                                                                  this.field_w = 0;
                                                                                                                  break L189;
                                                                                                                } else {
                                                                                                                  break L189;
                                                                                                                }
                                                                                                              }
                                                                                                            }
                                                                                                            L191: {
                                                                                                              if (-4 == (this.field_x ^ -1)) {
                                                                                                                L192: {
                                                                                                                  this.field_n = this.field_n - 4;
                                                                                                                  this.a(10, (byte) -13, param1, false);
                                                                                                                  this.a(10, (byte) 118, param1, false);
                                                                                                                  this.field_n = this.field_n + 4;
                                                                                                                  fieldTemp$50 = this.field_w;
                                                                                                                  this.field_w = this.field_w + 1;
                                                                                                                  if (-301 <= (fieldTemp$50 ^ -1)) {
                                                                                                                    break L192;
                                                                                                                  } else {
                                                                                                                    if (this.b(param1, -4) != 1) {
                                                                                                                      break L192;
                                                                                                                    } else {
                                                                                                                      if (this.field_f.field_a == 0) {
                                                                                                                        this.field_w = 0;
                                                                                                                        this.field_x = 0;
                                                                                                                        break L192;
                                                                                                                      } else {
                                                                                                                        break L192;
                                                                                                                      }
                                                                                                                    }
                                                                                                                  }
                                                                                                                }
                                                                                                                if ((this.field_n ^ -1) < -11) {
                                                                                                                  this.field_n = 6;
                                                                                                                  break L191;
                                                                                                                } else {
                                                                                                                  break L191;
                                                                                                                }
                                                                                                              } else {
                                                                                                                break L191;
                                                                                                              }
                                                                                                            }
                                                                                                            this.e(false);
                                                                                                            break L3;
                                                                                                          }
                                                                                                        } else {
                                                                                                          this.a(false, param0 ^ -3, param1);
                                                                                                          break L3;
                                                                                                        }
                                                                                                      }
                                                                                                    } else {
                                                                                                      if (this.field_p <= 0) {
                                                                                                        this.a(false, 120, param1);
                                                                                                        break L3;
                                                                                                      } else {
                                                                                                        if (-1 != (this.field_r ^ -1)) {
                                                                                                          this.a(60, param1);
                                                                                                          break L3;
                                                                                                        } else {
                                                                                                          L193: {
                                                                                                            if (0 == this.field_x) {
                                                                                                              L194: {
                                                                                                                if (this.field_i.field_a < ii.field_e[0].field_i.field_a) {
                                                                                                                  this.field_w = this.field_w + 5;
                                                                                                                  break L194;
                                                                                                                } else {
                                                                                                                  break L194;
                                                                                                                }
                                                                                                              }
                                                                                                              this.a(false, 1, 25, (byte) -90, param1);
                                                                                                              fieldTemp$51 = this.field_w;
                                                                                                              this.field_w = this.field_w + 1;
                                                                                                              if (200 < fieldTemp$51) {
                                                                                                                L195: {
                                                                                                                  stackIn_1061_0 = this;

                                                                                                                  if (this.field_i.field_b <= ii.field_e[0].field_i.field_b) {
                                                                                                                    stackIn_1062_0 = this;
                                                                                                                    stackIn_1062_1 = 1;
                                                                                                                    break L195;
                                                                                                                  } else {
                                                                                                                    stackIn_1062_0 = this;
                                                                                                                    stackIn_1062_1 = -1;
                                                                                                                    break L195;
                                                                                                                  }
                                                                                                                }
                                                                                                                ((eg) (this)).field_h = stackIn_1062_1;
                                                                                                                this.field_x = 1;
                                                                                                                this.field_w = 0;
                                                                                                                break L193;
                                                                                                              } else {
                                                                                                                break L193;
                                                                                                              }
                                                                                                            } else {
                                                                                                              break L193;
                                                                                                            }
                                                                                                          }
                                                                                                          L196: {
                                                                                                            if ((this.field_x ^ -1) == -2) {
                                                                                                              this.field_n = 19;
                                                                                                              fieldTemp$52 = this.field_w;
                                                                                                              this.field_w = this.field_w + 1;
                                                                                                              if (-21 > (fieldTemp$52 ^ -1)) {
                                                                                                                this.field_w = 0;
                                                                                                                this.field_e = 70;
                                                                                                                this.field_x = 2;
                                                                                                                if (this.field_i.field_a >= ii.field_e[0].field_i.field_a) {
                                                                                                                  this.field_e = 40;
                                                                                                                  break L196;
                                                                                                                } else {
                                                                                                                  break L196;
                                                                                                                }
                                                                                                              } else {
                                                                                                                break L196;
                                                                                                              }
                                                                                                            } else {
                                                                                                              break L196;
                                                                                                            }
                                                                                                          }
                                                                                                          L197: {
                                                                                                            if (2 != this.field_x) {
                                                                                                              break L197;
                                                                                                            } else {
                                                                                                              this.a(false, param0 ^ -109, 25, param1);
                                                                                                              if (0 == this.field_x) {
                                                                                                                this.field_w = (int)(100.0 * Math.random());
                                                                                                                break L197;
                                                                                                              } else {
                                                                                                                break L197;
                                                                                                              }
                                                                                                            }
                                                                                                          }
                                                                                                          L198: {
                                                                                                            if ((this.field_x ^ -1) == -4) {
                                                                                                              this.a(25, -81, false, param1);
                                                                                                              if (this.field_x != 0) {
                                                                                                                break L198;
                                                                                                              } else {
                                                                                                                this.field_w = (int)(100.0 * Math.random());
                                                                                                                break L198;
                                                                                                              }
                                                                                                            } else {
                                                                                                              break L198;
                                                                                                            }
                                                                                                          }
                                                                                                          this.e(false);
                                                                                                          break L3;
                                                                                                        }
                                                                                                      }
                                                                                                    }
                                                                                                  }
                                                                                                }
                                                                                              }
                                                                                            } else {
                                                                                              break L135;
                                                                                            }
                                                                                          }
                                                                                          L199: {
                                                                                            if ((this.field_w ^ -1) >= -3) {
                                                                                              this.a(1, si.field_j, param1, 1, 40, 0, tl.field_a, pk.field_s, (byte) -123);
                                                                                              break L199;
                                                                                            } else {
                                                                                              break L199;
                                                                                            }
                                                                                          }
                                                                                          L200: {
                                                                                            this.e(false);
                                                                                            if (1 != this.b(param1, -4)) {
                                                                                              break L200;
                                                                                            } else {
                                                                                              if (0 != this.field_f.field_a) {
                                                                                                break L200;
                                                                                              } else {
                                                                                                if (-3 > (this.field_w ^ -1)) {
                                                                                                  break L200;
                                                                                                } else {
                                                                                                  L201: {
                                                                                                    this.field_e = 5;
                                                                                                    stackIn_991_0 = 0;

                                                                                                    if (pk.field_s) {
                                                                                                      stackIn_992_0 = stackIn_991_0;
                                                                                                      stackIn_992_1 = 0;
                                                                                                      break L201;
                                                                                                    } else {
                                                                                                      stackIn_992_0 = stackIn_991_0;
                                                                                                      stackIn_992_1 = 1;
                                                                                                      break L201;
                                                                                                    }
                                                                                                  }
                                                                                                  L202: {
                                                                                                    if (stackIn_992_0 == stackIn_992_1) {
                                                                                                      tl.field_a.a(si.field_j[14], 100, ee.field_p * 256 / 100);
                                                                                                      break L202;
                                                                                                    } else {
                                                                                                      break L202;
                                                                                                    }
                                                                                                  }
                                                                                                  ii.field_e[od.field_k].a(9147, this.field_B, this.field_i);
                                                                                                  ii.field_e[od.field_k].field_f.a(-112, this.field_f);
                                                                                                  ii.field_e[od.field_k].field_h = this.field_h;
                                                                                                  ii.field_e[od.field_k].field_w = 11;
                                                                                                  od.field_k = od.field_k + 1;
                                                                                                  break L200;
                                                                                                }
                                                                                              }
                                                                                            }
                                                                                          }
                                                                                          L203: {
                                                                                            this.field_w = this.field_w + 1;
                                                                                            if ((this.field_w ^ -1) == -3) {
                                                                                              this.field_w = 0;
                                                                                              break L203;
                                                                                            } else {
                                                                                              break L203;
                                                                                            }
                                                                                          }
                                                                                          if (-31 < (this.field_w ^ -1)) {
                                                                                            break L3;
                                                                                          } else {
                                                                                            this.field_k = 1;
                                                                                            break L3;
                                                                                          }
                                                                                        } else {
                                                                                          this.field_e = 2;
                                                                                          this.a(1, si.field_j, param1, 1, 60, 0, tl.field_a, pk.field_s, (byte) 126);
                                                                                          this.e(false);
                                                                                          break L3;
                                                                                        }
                                                                                      } else {
                                                                                        if (250 <= w.field_b) {
                                                                                          if (this.field_p <= 0) {
                                                                                            this.a(true, 120, param1);
                                                                                            break L3;
                                                                                          } else {
                                                                                            L204: {
                                                                                              var4 = 10;
                                                                                              if (50 > this.field_p) {
                                                                                                var4 = 15;
                                                                                                break L204;
                                                                                              } else {
                                                                                                break L204;
                                                                                              }
                                                                                            }
                                                                                            L205: {
                                                                                              if (15 <= this.field_p) {
                                                                                                break L205;
                                                                                              } else {
                                                                                                var4 = 20;
                                                                                                break L205;
                                                                                              }
                                                                                            }
                                                                                            L206: {
                                                                                              this.a(var4, (byte) -113, param1, true);
                                                                                              this.field_w = this.field_w + 1;
                                                                                              if (25 != this.field_w % 50) {
                                                                                                break L206;
                                                                                              } else {
                                                                                                if (this.field_w < 250) {
                                                                                                  ii.field_e[od.field_k].a(9147, 43, this.field_i);
                                                                                                  ii.field_e[od.field_k].field_f.a(-112, this.field_f);
                                                                                                  dupTemp$53 = ii.field_e[od.field_k].field_f;
                                                                                                  dupTemp$53.field_b = dupTemp$53.field_b + (this.field_h * 120 - -40);
                                                                                                  dupTemp$54 = ii.field_e[od.field_k].field_f;
                                                                                                  dupTemp$54.field_a = dupTemp$54.field_a + 40;
                                                                                                  ii.field_e[od.field_k].field_h = this.field_h;
                                                                                                  ii.field_e[od.field_k].field_w = 0;
                                                                                                  od.field_k = od.field_k + 1;
                                                                                                  if (!pk.field_s) {
                                                                                                    break L206;
                                                                                                  } else {
                                                                                                    tl.field_a.a(si.field_j[13], 100, 256 * ee.field_p / 100);
                                                                                                    break L206;
                                                                                                  }
                                                                                                } else {
                                                                                                  break L206;
                                                                                                }
                                                                                              }
                                                                                            }
                                                                                            L207: {
                                                                                              if ((this.field_w ^ -1) > -251) {
                                                                                                L208: {
                                                                                                  if (this.field_w % 50 <= 5) {
                                                                                                    break L208;
                                                                                                  } else {
                                                                                                    if (this.field_w % 50 >= 10) {
                                                                                                      break L208;
                                                                                                    } else {
                                                                                                      this.field_n = 25;
                                                                                                      break L208;
                                                                                                    }
                                                                                                  }
                                                                                                }
                                                                                                L209: {
                                                                                                  if (this.field_w % 50 <= 15) {
                                                                                                    break L209;
                                                                                                  } else {
                                                                                                    if (-21 >= (this.field_w % 50 ^ -1)) {
                                                                                                      break L209;
                                                                                                    } else {
                                                                                                      this.field_n = 26;
                                                                                                      break L209;
                                                                                                    }
                                                                                                  }
                                                                                                }
                                                                                                L210: {
                                                                                                  if (-21 <= (this.field_w % 50 ^ -1)) {
                                                                                                    break L210;
                                                                                                  } else {
                                                                                                    if ((this.field_w % 50 ^ -1) > -26) {
                                                                                                      this.field_n = 27;
                                                                                                      break L210;
                                                                                                    } else {
                                                                                                      break L210;
                                                                                                    }
                                                                                                  }
                                                                                                }
                                                                                                if (this.field_w % 50 <= 25) {
                                                                                                  break L207;
                                                                                                } else {
                                                                                                  if (30 <= this.field_w % 50) {
                                                                                                    break L207;
                                                                                                  } else {
                                                                                                    L211: {
                                                                                                      stackIn_962_0 = this;

                                                                                                      if (ii.field_e[0].field_i.field_b < this.field_i.field_b) {
                                                                                                        stackIn_963_0 = this;
                                                                                                        stackIn_963_1 = -1;
                                                                                                        break L211;
                                                                                                      } else {
                                                                                                        stackIn_963_0 = this;
                                                                                                        stackIn_963_1 = 1;
                                                                                                        break L211;
                                                                                                      }
                                                                                                    }
                                                                                                    ((eg) (this)).field_h = stackIn_963_1;
                                                                                                    this.field_n = 28;
                                                                                                    break L207;
                                                                                                  }
                                                                                                }
                                                                                              } else {
                                                                                                break L207;
                                                                                              }
                                                                                            }
                                                                                            L212: {
                                                                                              if (this.field_w <= 300) {
                                                                                                break L212;
                                                                                              } else {
                                                                                                if ((this.field_p ^ -1) > -16) {
                                                                                                  this.field_w = this.field_w - 300;
                                                                                                  break L212;
                                                                                                } else {
                                                                                                  break L212;
                                                                                                }
                                                                                              }
                                                                                            }
                                                                                            L213: {
                                                                                              if (400 >= this.field_w) {
                                                                                                break L213;
                                                                                              } else {
                                                                                                this.field_w = this.field_w - 400;
                                                                                                break L213;
                                                                                              }
                                                                                            }
                                                                                            this.e(false);
                                                                                            if ((this.field_s ^ -1) >= -1) {
                                                                                              break L3;
                                                                                            } else {
                                                                                              L214: {
                                                                                                L215: {
                                                                                                  this.field_s = this.field_s - 1;
                                                                                                  this.field_p = this.field_p - 1;
                                                                                                  if (-51 == (this.field_p ^ -1)) {
                                                                                                    break L215;
                                                                                                  } else {
                                                                                                    if ((this.field_p ^ -1) == -31) {
                                                                                                      break L215;
                                                                                                    } else {
                                                                                                      break L214;
                                                                                                    }
                                                                                                  }
                                                                                                }
                                                                                                ii.field_e[od.field_k].a(9147, 32, this.field_i);
                                                                                                ii.field_e[od.field_k].field_f.a(param0 ^ 2, this.field_f);
                                                                                                ii.field_e[od.field_k].field_i.field_b = 10;
                                                                                                ii.field_e[od.field_k].field_i.field_a = 16;
                                                                                                ii.field_e[od.field_k].field_f.field_b = 0;
                                                                                                ii.field_e[od.field_k].field_f.field_a = 0;
                                                                                                ii.field_e[od.field_k].field_h = 1;
                                                                                                ii.field_e[od.field_k].field_w = 10;
                                                                                                od.field_k = od.field_k + 1;
                                                                                                break L214;
                                                                                              }
                                                                                              L216: {
                                                                                                if (pk.field_s) {
                                                                                                  tl.field_a.a(si.field_j[27], 100, 256 * ee.field_p / 100);
                                                                                                  break L216;
                                                                                                } else {
                                                                                                  break L216;
                                                                                                }
                                                                                              }
                                                                                              if ((this.field_p ^ -1) < -1) {
                                                                                                break L3;
                                                                                              } else {
                                                                                                this.c(false);
                                                                                                this.field_e = 70;
                                                                                                break L3;
                                                                                              }
                                                                                            }
                                                                                          }
                                                                                        } else {
                                                                                          L217: {
                                                                                            this.field_o = 7;
                                                                                            fieldTemp$55 = this.field_z;
                                                                                            this.field_z = this.field_z - 1;
                                                                                            if ((fieldTemp$55 ^ -1) < -1) {
                                                                                              break L217;
                                                                                            } else {
                                                                                              L218: {
                                                                                                this.field_n = this.field_n + 1;
                                                                                                if (1 >= this.field_n) {
                                                                                                  break L218;
                                                                                                } else {
                                                                                                  this.field_n = 0;
                                                                                                  break L218;
                                                                                                }
                                                                                              }
                                                                                              this.field_z = 5;
                                                                                              break L217;
                                                                                            }
                                                                                          }
                                                                                          L219: {
                                                                                            if (this.field_s > 0) {
                                                                                              w.field_b = 250;
                                                                                              this.field_s = this.field_s - 1;
                                                                                              this.field_x = 0;
                                                                                              if (!pk.field_s) {
                                                                                                break L219;
                                                                                              } else {
                                                                                                tl.field_a.a(si.field_j[27], 100, ee.field_p * 256 / 100);
                                                                                                break L219;
                                                                                              }
                                                                                            } else {
                                                                                              break L219;
                                                                                            }
                                                                                          }
                                                                                          w.field_b = w.field_b + 1;
                                                                                          break L3;
                                                                                        }
                                                                                      }
                                                                                    }
                                                                                  }
                                                                                } else {
                                                                                  if (0 < this.field_p) {
                                                                                    if (-1 == (this.field_r ^ -1)) {
                                                                                      L220: {
                                                                                        if (0 == this.field_x) {
                                                                                          L221: {
                                                                                            if (ii.field_e[0].field_i.field_a <= this.field_i.field_a) {
                                                                                              break L221;
                                                                                            } else {
                                                                                              this.field_w = this.field_w + 1;
                                                                                              break L221;
                                                                                            }
                                                                                          }
                                                                                          this.a(false, 2, 20, (byte) -88, param1);
                                                                                          fieldTemp$56 = this.field_w;
                                                                                          this.field_w = this.field_w + 1;
                                                                                          if ((fieldTemp$56 ^ -1) < -201) {
                                                                                            L222: {
                                                                                              stackIn_823_0 = this;

                                                                                              if (this.field_i.field_b > ii.field_e[0].field_i.field_b) {
                                                                                                stackIn_824_0 = this;
                                                                                                stackIn_824_1 = -1;
                                                                                                break L222;
                                                                                              } else {
                                                                                                stackIn_824_0 = this;
                                                                                                stackIn_824_1 = 1;
                                                                                                break L222;
                                                                                              }
                                                                                            }
                                                                                            ((eg) (this)).field_h = stackIn_824_1;
                                                                                            this.field_w = 0;
                                                                                            this.field_x = 1;
                                                                                            this.field_z = 0;
                                                                                            if (100.0 * Math.random() < 50.0) {
                                                                                              this.field_x = 4;
                                                                                              break L220;
                                                                                            } else {
                                                                                              break L220;
                                                                                            }
                                                                                          } else {
                                                                                            break L220;
                                                                                          }
                                                                                        } else {
                                                                                          break L220;
                                                                                        }
                                                                                      }
                                                                                      L223: {
                                                                                        if (-2 != (this.field_x ^ -1)) {
                                                                                          break L223;
                                                                                        } else {
                                                                                          L224: {
                                                                                            fieldTemp$57 = this.field_w;
                                                                                            this.field_w = this.field_w + 1;
                                                                                            if ((fieldTemp$57 ^ -1) >= -26) {
                                                                                              break L224;
                                                                                            } else {
                                                                                              this.field_x = 2;
                                                                                              this.field_w = 0;
                                                                                              this.field_e = 70;
                                                                                              break L224;
                                                                                            }
                                                                                          }
                                                                                          this.field_n = 19;
                                                                                          break L223;
                                                                                        }
                                                                                      }
                                                                                      L225: {
                                                                                        if (2 == this.field_x) {
                                                                                          this.a(false, 22, 15, param1);
                                                                                          if (-1 == (this.field_x ^ -1)) {
                                                                                            this.field_z = 0;
                                                                                            this.field_w = (int)(Math.random() * 100.0);
                                                                                            break L225;
                                                                                          } else {
                                                                                            break L225;
                                                                                          }
                                                                                        } else {
                                                                                          break L225;
                                                                                        }
                                                                                      }
                                                                                      L226: {
                                                                                        if (-4 == (this.field_x ^ -1)) {
                                                                                          this.a(15, param0 + 23, false, param1);
                                                                                          if (this.field_x == 0) {
                                                                                            this.field_z = 0;
                                                                                            this.field_w = (int)(100.0 * Math.random());
                                                                                            break L226;
                                                                                          } else {
                                                                                            break L226;
                                                                                          }
                                                                                        } else {
                                                                                          break L226;
                                                                                        }
                                                                                      }
                                                                                      L227: {
                                                                                        if (4 != this.field_x) {
                                                                                          break L227;
                                                                                        } else {
                                                                                          L228: {
                                                                                            if (this.a(false, param1, 25)) {
                                                                                              ii.field_e[od.field_k].a(9147, 34, this.field_i);
                                                                                              ii.field_e[od.field_k].field_f.a(-108, this.field_f);
                                                                                              dupTemp$58 = ii.field_e[od.field_k].field_f;
                                                                                              dupTemp$58.field_b = dupTemp$58.field_b + (this.field_h * 120 + 40);
                                                                                              dupTemp$59 = ii.field_e[od.field_k].field_f;
                                                                                              dupTemp$59.field_a = dupTemp$59.field_a + 40;
                                                                                              ii.field_e[od.field_k].field_h = this.field_h;
                                                                                              ii.field_e[od.field_k].field_w = 10;
                                                                                              od.field_k = od.field_k + 1;
                                                                                              if (pk.field_s) {
                                                                                                tl.field_a.a(si.field_j[13], 100, 256 * ee.field_p / 100);
                                                                                                break L228;
                                                                                              } else {
                                                                                                break L228;
                                                                                              }
                                                                                            } else {
                                                                                              break L228;
                                                                                            }
                                                                                          }
                                                                                          if (-1 == (this.field_x ^ -1)) {
                                                                                            this.field_x = 1;
                                                                                            break L227;
                                                                                          } else {
                                                                                            break L227;
                                                                                          }
                                                                                        }
                                                                                      }
                                                                                      this.e(false);
                                                                                      break L3;
                                                                                    } else {
                                                                                      this.a(120, param1);
                                                                                      break L3;
                                                                                    }
                                                                                  } else {
                                                                                    this.a(false, 120, param1);
                                                                                    break L3;
                                                                                  }
                                                                                }
                                                                              } else {
                                                                                this.a(1, si.field_j, param1, 1, 20, 0, tl.field_a, pk.field_s, (byte) -50);
                                                                                this.e(false);
                                                                                if ((this.b(param1, -4) ^ -1) != -2) {
                                                                                  break L3;
                                                                                } else {
                                                                                  if (this.field_f.field_a == 0) {
                                                                                    L229: {
                                                                                      this.field_k = 1;
                                                                                      if (pk.field_s) {
                                                                                        stackIn_808_0 = 0;
                                                                                        break L229;
                                                                                      } else {
                                                                                        stackIn_808_0 = 1;
                                                                                        break L229;
                                                                                      }
                                                                                    }
                                                                                    if (stackIn_808_0 != 1) {
                                                                                      tl.field_a.a(si.field_j[5], 100, ee.field_p * 256 / 100);
                                                                                      break L3;
                                                                                    } else {
                                                                                      break L3;
                                                                                    }
                                                                                  } else {
                                                                                    break L3;
                                                                                  }
                                                                                }
                                                                              }
                                                                            } else {
                                                                              this.a(1, si.field_j, param1, 1, 40, 0, tl.field_a, pk.field_s, (byte) 126);
                                                                              this.e(false);
                                                                              if (this.b(param1, -4) != 1) {
                                                                                break L3;
                                                                              } else {
                                                                                if (-1 == (this.field_f.field_a ^ -1)) {
                                                                                  L230: {
                                                                                    this.field_d = 24;
                                                                                    this.field_f.field_b = this.field_f.field_b + 40;
                                                                                    this.field_e = 50;
                                                                                    this.field_B = 28;
                                                                                    this.field_f.field_a = this.field_f.field_a + 40;
                                                                                    ii.field_e[od.field_k].a(9147, 28, this.field_i);
                                                                                    ii.field_e[od.field_k].field_f.a(-116, this.field_f);
                                                                                    ii.field_e[od.field_k].field_h = -this.field_h;
                                                                                    ii.field_e[od.field_k].field_w = 0;
                                                                                    ii.field_e[od.field_k].field_e = 50;
                                                                                    ii.field_e[od.field_k].field_o = 5;
                                                                                    od.field_k = od.field_k + 1;
                                                                                    if (pk.field_s) {
                                                                                      stackIn_799_0 = 0;
                                                                                      break L230;
                                                                                    } else {
                                                                                      stackIn_799_0 = 1;
                                                                                      break L230;
                                                                                    }
                                                                                  }
                                                                                  if (stackIn_799_0 != 1) {
                                                                                    tl.field_a.a(si.field_j[5], 100, ee.field_p * 256 / 100);
                                                                                    break L3;
                                                                                  } else {
                                                                                    break L3;
                                                                                  }
                                                                                } else {
                                                                                  break L3;
                                                                                }
                                                                              }
                                                                            }
                                                                          } else {
                                                                            if (0 < this.field_p) {
                                                                              L231: {
                                                                                if (w.field_b < 250) {
                                                                                  L232: {
                                                                                    this.field_o = 7;
                                                                                    fieldTemp$60 = this.field_z;
                                                                                    this.field_z = this.field_z - 1;
                                                                                    if (-1 > (fieldTemp$60 ^ -1)) {
                                                                                      break L232;
                                                                                    } else {
                                                                                      L233: {
                                                                                        this.field_n = this.field_n + 1;
                                                                                        if (-2 > (this.field_n ^ -1)) {
                                                                                          this.field_n = 0;
                                                                                          break L233;
                                                                                        } else {
                                                                                          break L233;
                                                                                        }
                                                                                      }
                                                                                      this.field_z = 5;
                                                                                      break L232;
                                                                                    }
                                                                                  }
                                                                                  L234: {
                                                                                    if (-1 > (this.field_s ^ -1)) {
                                                                                      w.field_b = 250;
                                                                                      this.field_s = this.field_s - 1;
                                                                                      this.field_x = 0;
                                                                                      if (pk.field_s) {
                                                                                        tl.field_a.a(si.field_j[26], 100, 256 * ee.field_p / 100);
                                                                                        break L234;
                                                                                      } else {
                                                                                        break L234;
                                                                                      }
                                                                                    } else {
                                                                                      break L234;
                                                                                    }
                                                                                  }
                                                                                  w.field_b = w.field_b + 1;
                                                                                  break L231;
                                                                                } else {
                                                                                  L235: {
                                                                                    w.field_b = w.field_b + 1;
                                                                                    if (0 != this.field_x) {
                                                                                      break L235;
                                                                                    } else {
                                                                                      L236: {
                                                                                        L237: {
                                                                                          if (-1 <= (this.field_i.field_b ^ -1)) {
                                                                                            break L237;
                                                                                          } else {
                                                                                            if (16 > this.field_i.field_b) {
                                                                                              break L236;
                                                                                            } else {
                                                                                              break L237;
                                                                                            }
                                                                                          }
                                                                                        }
                                                                                        L238: {
                                                                                          if (ii.field_e[0].field_i.field_a > this.field_i.field_a) {
                                                                                            this.field_x = 1;
                                                                                            this.field_w = 0;
                                                                                            break L238;
                                                                                          } else {
                                                                                            break L238;
                                                                                          }
                                                                                        }
                                                                                        L239: {
                                                                                          if (ii.field_e[0].field_i.field_b > this.field_i.field_b) {
                                                                                            this.field_h = 1;
                                                                                            break L239;
                                                                                          } else {
                                                                                            this.field_h = -1;
                                                                                            break L239;
                                                                                          }
                                                                                        }
                                                                                        if (this.field_i.field_a <= ii.field_e[0].field_i.field_a) {
                                                                                          break L236;
                                                                                        } else {
                                                                                          if (-3 <= (this.field_i.field_a ^ -1)) {
                                                                                            break L236;
                                                                                          } else {
                                                                                            this.field_i.field_a = this.field_i.field_a - 1;
                                                                                            this.field_x = 3;
                                                                                            this.field_e = -20;
                                                                                            this.field_f.field_a = this.field_f.field_a + 230;
                                                                                            break L236;
                                                                                          }
                                                                                        }
                                                                                      }
                                                                                      L240: {
                                                                                        if (350 < w.field_b) {
                                                                                          w.field_b = 250;
                                                                                          this.field_x = 4;
                                                                                          break L240;
                                                                                        } else {
                                                                                          break L240;
                                                                                        }
                                                                                      }
                                                                                      L241: {
                                                                                        if (this.field_x != 0) {
                                                                                          break L241;
                                                                                        } else {
                                                                                          this.a(true, 0, 35, (byte) -120, param1);
                                                                                          break L241;
                                                                                        }
                                                                                      }
                                                                                      if (3 == this.field_x) {
                                                                                        this.field_x = 5;
                                                                                        break L235;
                                                                                      } else {
                                                                                        break L235;
                                                                                      }
                                                                                    }
                                                                                  }
                                                                                  L242: {
                                                                                    if (1 != this.field_x) {
                                                                                      break L242;
                                                                                    } else {
                                                                                      L243: {
                                                                                        fieldTemp$61 = this.field_w;
                                                                                        this.field_w = this.field_w + 1;
                                                                                        if (-6 <= (fieldTemp$61 ^ -1)) {
                                                                                          break L243;
                                                                                        } else {
                                                                                          this.field_e = 70;
                                                                                          this.field_x = 2;
                                                                                          this.field_w = 0;
                                                                                          break L243;
                                                                                        }
                                                                                      }
                                                                                      this.field_n = 19;
                                                                                      break L242;
                                                                                    }
                                                                                  }
                                                                                  L244: {
                                                                                    if (this.field_x != 2) {
                                                                                      break L244;
                                                                                    } else {
                                                                                      this.a(true, 22, 0, param1);
                                                                                      break L244;
                                                                                    }
                                                                                  }
                                                                                  L245: {
                                                                                    if (-4 == (this.field_x ^ -1)) {
                                                                                      this.a(0, -82, true, param1);
                                                                                      break L245;
                                                                                    } else {
                                                                                      break L245;
                                                                                    }
                                                                                  }
                                                                                  L246: {
                                                                                    if (this.field_x != 5) {
                                                                                      break L246;
                                                                                    } else {
                                                                                      this.a(25, param0 ^ 41, true, param1);
                                                                                      if ((this.field_x ^ -1) != -4) {
                                                                                        break L246;
                                                                                      } else {
                                                                                        this.field_x = 5;
                                                                                        break L246;
                                                                                      }
                                                                                    }
                                                                                  }
                                                                                  L247: {
                                                                                    if ((this.field_x ^ -1) != -5) {
                                                                                      break L247;
                                                                                    } else {
                                                                                      if (this.a(true, param1, 25)) {
                                                                                        L248: {
                                                                                          ii.field_e[od.field_k].a(9147, 27, this.field_i);
                                                                                          ii.field_e[od.field_k].field_f.a(-81, this.field_f);
                                                                                          dupTemp$62 = ii.field_e[od.field_k].field_f;
                                                                                          dupTemp$62.field_b = dupTemp$62.field_b + (40 + this.field_h * 240);
                                                                                          dupTemp$63 = ii.field_e[od.field_k].field_f;
                                                                                          dupTemp$63.field_a = dupTemp$63.field_a + 80;
                                                                                          ii.field_e[od.field_k].field_h = this.field_h;
                                                                                          ii.field_e[od.field_k].field_w = 0;
                                                                                          ii.field_e[od.field_k].field_e = 40;
                                                                                          ii.field_e[od.field_k].field_o = 5;
                                                                                          od.field_k = od.field_k + 1;
                                                                                          stackIn_764_0 = 0;

                                                                                          if (pk.field_s) {
                                                                                            stackIn_765_0 = stackIn_764_0;
                                                                                            stackIn_765_1 = 0;
                                                                                            break L248;
                                                                                          } else {
                                                                                            stackIn_765_0 = stackIn_764_0;
                                                                                            stackIn_765_1 = 1;
                                                                                            break L248;
                                                                                          }
                                                                                        }
                                                                                        if (stackIn_765_0 != stackIn_765_1) {
                                                                                          break L247;
                                                                                        } else {
                                                                                          tl.field_a.a(nl.field_q[25], 100, ee.field_p * 256 / 100);
                                                                                          break L247;
                                                                                        }
                                                                                      } else {
                                                                                        break L247;
                                                                                      }
                                                                                    }
                                                                                  }
                                                                                  if ((this.field_s ^ -1) >= -1) {
                                                                                    break L231;
                                                                                  } else {
                                                                                    L249: {
                                                                                      L250: {
                                                                                        this.field_p = this.field_p - 1;
                                                                                        this.field_s = this.field_s - 1;
                                                                                        if (-11 == (this.field_p ^ -1)) {
                                                                                          break L250;
                                                                                        } else {
                                                                                          if (-31 == (this.field_p ^ -1)) {
                                                                                            break L250;
                                                                                          } else {
                                                                                            break L249;
                                                                                          }
                                                                                        }
                                                                                      }
                                                                                      ii.field_e[od.field_k].a(param0 + 9270, 23, this.field_i);
                                                                                      ii.field_e[od.field_k].field_f.a(-94, this.field_f);
                                                                                      ii.field_e[od.field_k].field_i.field_b = 0;
                                                                                      ii.field_e[od.field_k].field_i.field_a = 16;
                                                                                      ii.field_e[od.field_k].field_f.field_b = 0;
                                                                                      ii.field_e[od.field_k].field_f.field_a = 0;
                                                                                      ii.field_e[od.field_k].field_h = 1;
                                                                                      ii.field_e[od.field_k].field_w = 10;
                                                                                      od.field_k = od.field_k + 1;
                                                                                      ii.field_e[od.field_k].a(9147, 23, this.field_i);
                                                                                      ii.field_e[od.field_k].field_f.a(-117, this.field_f);
                                                                                      ii.field_e[od.field_k].field_i.field_b = 19;
                                                                                      ii.field_e[od.field_k].field_i.field_a = 16;
                                                                                      ii.field_e[od.field_k].field_f.field_b = 0;
                                                                                      ii.field_e[od.field_k].field_f.field_a = 0;
                                                                                      ii.field_e[od.field_k].field_h = -1;
                                                                                      ii.field_e[od.field_k].field_w = 10;
                                                                                      od.field_k = od.field_k + 1;
                                                                                      break L249;
                                                                                    }
                                                                                    L251: {
                                                                                      if (pk.field_s) {
                                                                                        stackIn_775_0 = 0;
                                                                                        break L251;
                                                                                      } else {
                                                                                        stackIn_775_0 = 1;
                                                                                        break L251;
                                                                                      }
                                                                                    }
                                                                                    L252: {
                                                                                      if (stackIn_775_0 != 1) {
                                                                                        tl.field_a.a(si.field_j[26], 100, ee.field_p * 256 / 100);
                                                                                        break L252;
                                                                                      } else {
                                                                                        break L252;
                                                                                      }
                                                                                    }
                                                                                    if (this.field_p <= 0) {
                                                                                      this.c(false);
                                                                                      this.field_e = 70;
                                                                                      break L231;
                                                                                    } else {
                                                                                      break L231;
                                                                                    }
                                                                                  }
                                                                                }
                                                                              }
                                                                              this.e(false);
                                                                              break L3;
                                                                            } else {
                                                                              this.a(true, 120, param1);
                                                                              break L3;
                                                                            }
                                                                          }
                                                                        }
                                                                      } else {
                                                                        break L118;
                                                                      }
                                                                    }
                                                                    if ((this.field_p ^ -1) < -1) {
                                                                      if (this.field_r != 0) {
                                                                        this.a(param0 ^ -72, param1);
                                                                        break L3;
                                                                      } else {
                                                                        L253: {
                                                                          if (-1 == (this.field_x ^ -1)) {
                                                                            L254: {
                                                                              if (ii.field_e[0].field_i.field_a <= this.field_i.field_a) {
                                                                                break L254;
                                                                              } else {
                                                                                this.field_w = this.field_w + 1;
                                                                                break L254;
                                                                              }
                                                                            }
                                                                            this.a(false, 1, 20, (byte) -67, param1);
                                                                            fieldTemp$64 = this.field_w;
                                                                            this.field_w = this.field_w + 1;
                                                                            if (200 >= fieldTemp$64) {
                                                                              break L253;
                                                                            } else {
                                                                              L255: {
                                                                                this.field_w = 0;
                                                                                stackIn_706_0 = this;

                                                                                if (ii.field_e[0].field_i.field_b < this.field_i.field_b) {
                                                                                  stackIn_707_0 = this;
                                                                                  stackIn_707_1 = -1;
                                                                                  break L255;
                                                                                } else {
                                                                                  stackIn_707_0 = this;
                                                                                  stackIn_707_1 = 1;
                                                                                  break L255;
                                                                                }
                                                                              }
                                                                              ((eg) (this)).field_h = stackIn_707_1;
                                                                              this.field_x = 1;
                                                                              break L253;
                                                                            }
                                                                          } else {
                                                                            break L253;
                                                                          }
                                                                        }
                                                                        L256: {
                                                                          if (1 == this.field_x) {
                                                                            this.field_n = 19;
                                                                            fieldTemp$65 = this.field_w;
                                                                            this.field_w = this.field_w + 1;
                                                                            if ((fieldTemp$65 ^ -1) >= -41) {
                                                                              break L256;
                                                                            } else {
                                                                              this.field_w = 0;
                                                                              this.field_x = 2;
                                                                              this.field_e = 80;
                                                                              if (this.field_i.field_a >= ii.field_e[0].field_i.field_a) {
                                                                                this.field_e = 40;
                                                                                break L256;
                                                                              } else {
                                                                                break L256;
                                                                              }
                                                                            }
                                                                          } else {
                                                                            break L256;
                                                                          }
                                                                        }
                                                                        L257: {
                                                                          if (this.field_x == 2) {
                                                                            this.a(false, 22, 15, param1);
                                                                            if (this.field_x != 0) {
                                                                              break L257;
                                                                            } else {
                                                                              this.field_w = (int)(Math.random() * 100.0);
                                                                              break L257;
                                                                            }
                                                                          } else {
                                                                            break L257;
                                                                          }
                                                                        }
                                                                        L258: {
                                                                          if ((this.field_x ^ -1) != -4) {
                                                                            break L258;
                                                                          } else {
                                                                            this.a(15, -92, false, param1);
                                                                            if (this.field_x != 0) {
                                                                              break L258;
                                                                            } else {
                                                                              this.field_w = (int)(Math.random() * 100.0);
                                                                              break L258;
                                                                            }
                                                                          }
                                                                        }
                                                                        this.e(false);
                                                                        break L3;
                                                                      }
                                                                    } else {
                                                                      this.a(false, 120, param1);
                                                                      break L3;
                                                                    }
                                                                  } else {
                                                                    if (-1 <= (this.field_p ^ -1)) {
                                                                      this.a(false, 120, param1);
                                                                      break L3;
                                                                    } else {
                                                                      if (0 != this.field_r) {
                                                                        this.a(113, param1);
                                                                        break L3;
                                                                      } else {
                                                                        L259: {
                                                                          if (this.field_x != 0) {
                                                                            break L259;
                                                                          } else {
                                                                            L260: {
                                                                              this.field_n = 19;
                                                                              if (15 < this.field_w) {
                                                                                this.field_n = 22;
                                                                                break L260;
                                                                              } else {
                                                                                break L260;
                                                                              }
                                                                            }
                                                                            fieldTemp$66 = this.field_w;
                                                                            this.field_w = this.field_w + 1;
                                                                            if (25 >= fieldTemp$66) {
                                                                              break L259;
                                                                            } else {
                                                                              this.field_x = 2;
                                                                              this.field_e = 70;
                                                                              this.field_w = 0;
                                                                              if (ii.field_e[0].field_i.field_a > this.field_i.field_a) {
                                                                                break L259;
                                                                              } else {
                                                                                this.field_e = 50;
                                                                                break L259;
                                                                              }
                                                                            }
                                                                          }
                                                                        }
                                                                        L261: {
                                                                          if (-3 != (this.field_x ^ -1)) {
                                                                            break L261;
                                                                          } else {
                                                                            this.a(false, param0 ^ -109, 25, param1);
                                                                            break L261;
                                                                          }
                                                                        }
                                                                        L262: {
                                                                          if ((this.field_x ^ -1) == -4) {
                                                                            this.a(25, -92, false, param1);
                                                                            break L262;
                                                                          } else {
                                                                            break L262;
                                                                          }
                                                                        }
                                                                        this.e(false);
                                                                        break L3;
                                                                      }
                                                                    }
                                                                  }
                                                                }
                                                              }
                                                            }
                                                          }
                                                        }
                                                      }
                                                    }
                                                  }
                                                } else {
                                                  if ((this.field_p ^ -1) < -1) {
                                                    if (-1 == (this.field_r ^ -1)) {
                                                      L263: {
                                                        if (this.field_x != 0) {
                                                          break L263;
                                                        } else {
                                                          L264: {
                                                            if (this.field_i.field_a >= ii.field_e[0].field_i.field_a) {
                                                              break L264;
                                                            } else {
                                                              this.field_w = this.field_w + 1;
                                                              break L264;
                                                            }
                                                          }
                                                          this.a(false, 1, 20, (byte) -66, param1);
                                                          fieldTemp$67 = this.field_w;
                                                          this.field_w = this.field_w + 1;
                                                          if (-201 > (fieldTemp$67 ^ -1)) {
                                                            L265: {
                                                              this.field_w = 0;
                                                              this.field_x = 1;
                                                              stackIn_497_0 = this;

                                                              if (ii.field_e[0].field_i.field_b >= this.field_i.field_b) {
                                                                stackIn_498_0 = this;
                                                                stackIn_498_1 = 1;
                                                                break L265;
                                                              } else {
                                                                stackIn_498_0 = this;
                                                                stackIn_498_1 = -1;
                                                                break L265;
                                                              }
                                                            }
                                                            ((eg) (this)).field_h = stackIn_498_1;
                                                            break L263;
                                                          } else {
                                                            break L263;
                                                          }
                                                        }
                                                      }
                                                      L266: {
                                                        if ((this.field_x ^ -1) != -2) {
                                                          break L266;
                                                        } else {
                                                          L267: {
                                                            fieldTemp$68 = this.field_w;
                                                            this.field_w = this.field_w + 1;
                                                            if ((fieldTemp$68 ^ -1) >= -26) {
                                                              break L267;
                                                            } else {
                                                              this.field_w = 0;
                                                              this.field_e = 70;
                                                              this.field_x = 2;
                                                              break L267;
                                                            }
                                                          }
                                                          this.field_n = 19;
                                                          break L266;
                                                        }
                                                      }
                                                      L268: {
                                                        if (2 != this.field_x) {
                                                          break L268;
                                                        } else {
                                                          this.a(false, 22, 16, param1);
                                                          if (this.field_x != 0) {
                                                            break L268;
                                                          } else {
                                                            this.field_w = (int)(Math.random() * 100.0);
                                                            break L268;
                                                          }
                                                        }
                                                      }
                                                      L269: {
                                                        if ((this.field_x ^ -1) == -4) {
                                                          this.a(16, -91, false, param1);
                                                          if (0 == this.field_x) {
                                                            this.field_w = (int)(Math.random() * 100.0);
                                                            break L269;
                                                          } else {
                                                            this.e(false);
                                                            break L3;
                                                          }
                                                        } else {
                                                          break L269;
                                                        }
                                                      }
                                                      this.e(false);
                                                      break L3;
                                                    } else {
                                                      this.a(54, param1);
                                                      break L3;
                                                    }
                                                  } else {
                                                    this.a(false, 120, param1);
                                                    break L3;
                                                  }
                                                }
                                              }
                                            }
                                          } else {
                                            if (-1 > (this.field_p ^ -1)) {
                                              if (-1 != (this.field_r ^ -1)) {
                                                this.a(114, param1);
                                                break L3;
                                              } else {
                                                L270: {
                                                  if (0 != this.field_x) {
                                                    break L270;
                                                  } else {
                                                    L271: {
                                                      if (this.field_i.field_a < ii.field_e[0].field_i.field_a) {
                                                        this.field_w = this.field_w + 1;
                                                        break L271;
                                                      } else {
                                                        break L271;
                                                      }
                                                    }
                                                    this.a(false, 2, 20, (byte) -76, param1);
                                                    fieldTemp$69 = this.field_w;
                                                    this.field_w = this.field_w + 1;
                                                    if (200 >= fieldTemp$69) {
                                                      break L270;
                                                    } else {
                                                      this.field_x = 1;
                                                      this.field_z = 0;
                                                      this.field_w = 0;
                                                      if (Math.random() * 100.0 >= 50.0) {
                                                        break L270;
                                                      } else {
                                                        this.field_x = 4;
                                                        break L270;
                                                      }
                                                    }
                                                  }
                                                }
                                                L272: {
                                                  if (this.field_x != 1) {
                                                    break L272;
                                                  } else {
                                                    L273: {
                                                      fieldTemp$70 = this.field_w;
                                                      this.field_w = this.field_w + 1;
                                                      if (-26 > (fieldTemp$70 ^ -1)) {
                                                        this.field_w = 0;
                                                        this.field_e = 70;
                                                        this.field_x = 2;
                                                        break L273;
                                                      } else {
                                                        break L273;
                                                      }
                                                    }
                                                    this.field_n = 19;
                                                    break L272;
                                                  }
                                                }
                                                L274: {
                                                  if (2 == this.field_x) {
                                                    this.a(false, 22, 15, param1);
                                                    if (-1 == (this.field_x ^ -1)) {
                                                      this.field_z = 0;
                                                      this.field_w = (int)(100.0 * Math.random());
                                                      break L274;
                                                    } else {
                                                      break L274;
                                                    }
                                                  } else {
                                                    break L274;
                                                  }
                                                }
                                                L275: {
                                                  if (-4 == (this.field_x ^ -1)) {
                                                    this.a(15, -117, false, param1);
                                                    if (this.field_x == 0) {
                                                      this.field_z = 0;
                                                      this.field_w = (int)(100.0 * Math.random());
                                                      break L275;
                                                    } else {
                                                      break L275;
                                                    }
                                                  } else {
                                                    break L275;
                                                  }
                                                }
                                                if (this.field_x == 4) {
                                                  if (this.a(false, param1, param0 + 148)) {
                                                    L276: {
                                                      ii.field_e[od.field_k].a(param0 ^ -9154, 11, this.field_i);
                                                      ii.field_e[od.field_k].field_f.a(-82, this.field_f);
                                                      dupTemp$71 = ii.field_e[od.field_k].field_f;
                                                      dupTemp$71.field_b = dupTemp$71.field_b + (this.field_h * 120 - -40);
                                                      dupTemp$72 = ii.field_e[od.field_k].field_f;
                                                      dupTemp$72.field_a = dupTemp$72.field_a + 40;
                                                      ii.field_e[od.field_k].field_h = this.field_h;
                                                      ii.field_e[od.field_k].field_w = 10;
                                                      od.field_k = od.field_k + 1;
                                                      if (pk.field_s) {
                                                        stackIn_431_0 = 0;
                                                        break L276;
                                                      } else {
                                                        stackIn_431_0 = 1;
                                                        break L276;
                                                      }
                                                    }
                                                    if (stackIn_431_0 != 1) {
                                                      tl.field_a.a(si.field_j[13], 100, 256 * ee.field_p / 100);
                                                      this.e(false);
                                                      break L3;
                                                    } else {
                                                      this.e(false);
                                                      break L3;
                                                    }
                                                  } else {
                                                    this.e(false);
                                                    break L3;
                                                  }
                                                } else {
                                                  this.e(false);
                                                  break L3;
                                                }
                                              }
                                            } else {
                                              this.a(false, 120, param1);
                                              break L3;
                                            }
                                          }
                                        } else {
                                          break L63;
                                        }
                                      } else {
                                        break L63;
                                      }
                                    }
                                    if (0 < this.field_p) {
                                      if (0 != this.field_r) {
                                        if (this.field_B == 8) {
                                          this.field_p = 0;
                                          this.field_r = 0;
                                          break L3;
                                        } else {
                                          this.a(98, param1);
                                          break L3;
                                        }
                                      } else {
                                        L277: {
                                          var4 = 15;
                                          if (this.field_B == 7) {
                                            var4 = 10;
                                            break L277;
                                          } else {
                                            break L277;
                                          }
                                        }
                                        L278: {
                                          if (this.field_x != 0) {
                                            break L278;
                                          } else {
                                            L279: {
                                              if (this.field_i.field_a < ii.field_e[0].field_i.field_a) {
                                                this.field_w = this.field_w + 1;
                                                break L279;
                                              } else {
                                                break L279;
                                              }
                                            }
                                            this.a(false, 0, var4, (byte) -68, param1);
                                            fieldTemp$73 = this.field_w;
                                            this.field_w = this.field_w + 1;
                                            if ((fieldTemp$73 ^ -1) >= -101) {
                                              break L278;
                                            } else {
                                              this.field_x = 1;
                                              this.field_w = 0;
                                              this.field_z = 0;
                                              if (100.0 * Math.random() >= 10.0) {
                                                break L278;
                                              } else {
                                                if (7 != this.field_B) {
                                                  break L278;
                                                } else {
                                                  this.field_x = 4;
                                                  break L278;
                                                }
                                              }
                                            }
                                          }
                                        }
                                        L280: {
                                          if (1 == this.field_x) {
                                            L281: {
                                              fieldTemp$74 = this.field_w;
                                              this.field_w = this.field_w + 1;
                                              if (fieldTemp$74 <= 25) {
                                                break L281;
                                              } else {
                                                this.field_x = 2;
                                                this.field_w = 0;
                                                this.field_e = 70;
                                                break L281;
                                              }
                                            }
                                            this.field_n = 19;
                                            break L280;
                                          } else {
                                            break L280;
                                          }
                                        }
                                        L282: {
                                          if (-3 != (this.field_x ^ -1)) {
                                            break L282;
                                          } else {
                                            this.a(false, 22, var4, param1);
                                            if (this.field_x != 0) {
                                              break L282;
                                            } else {
                                              this.field_w = (int)(Math.random() * 100.0);
                                              break L282;
                                            }
                                          }
                                        }
                                        L283: {
                                          if (this.field_x != 3) {
                                            break L283;
                                          } else {
                                            this.a(var4, -82, false, param1);
                                            if (this.field_x == 0) {
                                              this.field_w = (int)(Math.random() * 100.0);
                                              break L283;
                                            } else {
                                              break L283;
                                            }
                                          }
                                        }
                                        L284: {
                                          if ((this.field_x ^ -1) == -5) {
                                            if (this.a(false, param1, 25)) {
                                              if (od.field_k < 100) {
                                                L285: {
                                                  if (pk.field_s) {
                                                    stackIn_392_0 = 0;
                                                    break L285;
                                                  } else {
                                                    stackIn_392_0 = 1;
                                                    break L285;
                                                  }
                                                }
                                                L286: {
                                                  if (stackIn_392_0 == 1) {
                                                    break L286;
                                                  } else {
                                                    tl.field_a.a(si.field_j[12], 100, 256 * ee.field_p / 100);
                                                    break L286;
                                                  }
                                                }
                                                this.field_x = 0;
                                                this.field_w = 0;
                                                ii.field_e[od.field_k].a(param0 ^ -9154, 8, this.field_i);
                                                ii.field_e[od.field_k].field_f.a(-88, this.field_f);
                                                ii.field_e[od.field_k].field_h = this.field_h;
                                                ii.field_e[od.field_k].field_w = 10;
                                                od.field_k = od.field_k + 1;
                                                break L284;
                                              } else {
                                                this.e(false);
                                                break L3;
                                              }
                                            } else {
                                              this.e(false);
                                              break L3;
                                            }
                                          } else {
                                            break L284;
                                          }
                                        }
                                        this.e(false);
                                        break L3;
                                      }
                                    } else {
                                      this.a(false, 120, param1);
                                      break L3;
                                    }
                                  }
                                } else {
                                  if ((this.field_p ^ -1) >= -1) {
                                    this.a(false, param0 + 243, param1);
                                    break L3;
                                  } else {
                                    if (this.field_r == 0) {
                                      L287: {
                                        if (this.field_x != 0) {
                                          break L287;
                                        } else {
                                          L288: {
                                            this.field_n = 19;
                                            if (15 < this.field_w) {
                                              this.field_n = 22;
                                              break L288;
                                            } else {
                                              break L288;
                                            }
                                          }
                                          fieldTemp$75 = this.field_w;
                                          this.field_w = this.field_w + 1;
                                          if (fieldTemp$75 > 25) {
                                            this.field_x = 2;
                                            this.field_e = 85;
                                            this.field_w = 0;
                                            if (this.field_i.field_a >= ii.field_e[0].field_i.field_a) {
                                              this.field_e = 60;
                                              break L287;
                                            } else {
                                              break L287;
                                            }
                                          } else {
                                            break L287;
                                          }
                                        }
                                      }
                                      L289: {
                                        if ((this.field_x ^ -1) == -3) {
                                          this.a(false, param0 ^ -109, 25, param1);
                                          break L289;
                                        } else {
                                          break L289;
                                        }
                                      }
                                      L290: {
                                        if (this.field_x == 3) {
                                          this.a(15, -74, false, param1);
                                          break L290;
                                        } else {
                                          break L290;
                                        }
                                      }
                                      this.e(false);
                                      break L3;
                                    } else {
                                      this.a(77, param1);
                                      break L3;
                                    }
                                  }
                                }
                              }
                            } else {
                              break L50;
                            }
                          } else {
                            break L50;
                          }
                        } else {
                          break L50;
                        }
                      }
                      if (-1 > (this.field_p ^ -1)) {
                        if (0 == this.field_r) {
                          this.a(15, (byte) 127, param1, false);
                          this.e(false);
                          break L3;
                        } else {
                          this.a(param0 + 238, param1);
                          break L3;
                        }
                      } else {
                        this.a(false, 120, param1);
                        break L3;
                      }
                    } else {
                      if (-1 > (this.field_p ^ -1)) {
                        if (this.field_r == 0) {
                          L291: {
                            if (this.field_x == 0) {
                              L292: {
                                if (this.field_i.field_a >= ii.field_e[0].field_i.field_a) {
                                  break L292;
                                } else {
                                  this.field_w = this.field_w + 1;
                                  break L292;
                                }
                              }
                              L293: {
                                L294: {
                                  stackIn_267_0 = this;

                                  stackIn_267_1 = 0;

                                  if (pg.field_q) {
                                    break L294;
                                  } else {
                                    stackIn_267_0 = this;


                                    if (-1 == (ql.field_c ^ -1)) {
                                      break L294;
                                    } else {
                                      stackIn_268_0 = this;
                                      stackIn_268_1 = stackIn_267_1;
                                      stackIn_268_2 = 0;
                                      break L293;
                                    }
                                  }
                                }
                                stackIn_268_0 = this;
                                stackIn_268_1 = stackIn_267_1;
                                stackIn_268_2 = 2;
                                break L293;
                              }
                              this.a(stackIn_268_1 != 0, stackIn_268_2, 15, (byte) -63, param1);
                              if (pg.field_q) {
                                break L291;
                              } else {
                                fieldTemp$76 = this.field_w;
                                this.field_w = this.field_w + 1;
                                if ((fieldTemp$76 ^ -1) >= -251) {
                                  break L291;
                                } else {
                                  if (ql.field_c != 0) {
                                    this.field_x = 1;
                                    this.field_w = 0;
                                    break L291;
                                  } else {
                                    break L291;
                                  }
                                }
                              }
                            } else {
                              break L291;
                            }
                          }
                          L295: {
                            if ((this.field_x ^ -1) == -2) {
                              this.field_n = 19;
                              fieldTemp$77 = this.field_w;
                              this.field_w = this.field_w + 1;
                              if (25 < fieldTemp$77) {
                                this.field_x = 2;
                                this.field_w = 0;
                                this.field_e = 80;
                                break L295;
                              } else {
                                break L295;
                              }
                            } else {
                              break L295;
                            }
                          }
                          L296: {
                            if (2 == this.field_x) {
                              this.a(false, 22, 5, param1);
                              if (this.field_x != 0) {
                                break L296;
                              } else {
                                this.field_w = (int)(100.0 * Math.random());
                                break L296;
                              }
                            } else {
                              break L296;
                            }
                          }
                          if (this.field_x == 3) {
                            this.a(5, param0 + 16, false, param1);
                            if (this.field_x == 0) {
                              this.field_w = (int)(100.0 * Math.random());
                              this.e(false);
                              break L3;
                            } else {
                              this.e(false);
                              break L3;
                            }
                          } else {
                            this.e(false);
                            break L3;
                          }
                        } else {
                          this.a(14, param1);
                          break L3;
                        }
                      } else {
                        this.a(false, param0 + 243, param1);
                        break L3;
                      }
                    }
                  }
                }
              }
            }
            L297: {
              if (param0 == -123) {
                break L297;
              } else {
                this.c(-4);
                break L297;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L298: {
            var3 = decompiledCaughtException;
            stackIn_1260_0 = (RuntimeException) (var3);

            stackIn_1260_1 = new StringBuilder().append("eg.EA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_1261_0 = (RuntimeException) ((Object) stackIn_1260_0);
              stackIn_1261_1 = (StringBuilder) ((Object) stackIn_1260_1);
              stackIn_1261_2 = "null";
              break L298;
            } else {
              stackIn_1261_0 = (RuntimeException) ((Object) stackIn_1260_0);
              stackIn_1261_1 = (StringBuilder) ((Object) stackIn_1260_1);
              stackIn_1261_2 = "{...}";
              break L298;
            }
          }
          throw bd.a((Throwable) ((Object) stackIn_1261_0), stackIn_1261_2 + ')');
        }
    }

    final static void a(kl param0, int param1, kl param2, kl param3) {
        o var16 = null;
        db[] var5 = null;
        db[][] var6 = null;
        int[][] var17 = null;
        int[][] var15 = null;
        int[][] var7 = null;
        db[] var10_ref_db__ = null;
        int var11_int = 0;
        o var11 = null;
        o var12 = null;
        o var13 = null;
        int var8 = 0;
        int var9 = 0;
        int var14 = wizardrun.field_H;
        try {
            ok.field_a = pe.a("commonui", param3, "frame_top", 127);
            ia.field_i = pe.a("commonui", param3, "frame_bottom", 88);
            hg.field_d = vg.a(15, "jagex_logo_grey", param3, "commonui");
            vf.field_j = pe.a("commonui", param3, "button", 121);
            te.field_k = pc.a((byte) 125, "commonui", param3, "validation");
            e.field_b = (vd) ((Object) oc.a(param3, "commonui", "arezzo12", 67, param0));
            gh.field_b = (vd) ((Object) oc.a(param3, "commonui", "arezzo14", 93, param0));
            va.field_i = (vd) ((Object) oc.a(param3, "commonui", "arezzo14bold", 118, param0));
            var16 = new o(param2.a(122, "", "button.gif"), (java.awt.Component) ((Object) wizardrun.field_G));
            mf.a("commonui", "dropdown", param3, (byte) -108);
            var5 = re.a(param3, "commonui", "screen_options", 112);
            gj.field_f = new db[4];
            s.field_c = new db[4];
            nj.field_k = new db[4];
            var6 = new db[][]{gj.field_f, s.field_c, nj.field_k};
            var17 = new int[4][];
            var15 = var17;
            var7 = var15;
            var7[0] = var5[0].field_k;
            for (var8 = 1; var8 < var17.length; var8++) {
                var7[var8] = (int[]) ((Object) var17[0].clone());
            }
            var8 = var5[0].field_l[0];
            var17[2][var8] = 16777215;
            var17[1][var8] = 2394342;
            var17[3][var8] = 4767999;
            for (var9 = 0; (var9 ^ -1) > -4; var9++) {
                var10_ref_db__ = var6[var9];
                for (var11_int = 0; var11_int < var10_ref_db__.length; var11_int++) {
                    var10_ref_db__[var11_int] = eb.a(var5[var9], (byte) -105, var17[var11_int]);
                }
            }
            var9 = var16.field_p;
            ph.d(-31782);
            int var10 = -88 / ((15 - param1) / 44);
            var16.b();
            ed.d(0, 0, ed.field_h, ed.field_d);
            var11 = new o(var9, var9);
            var11.b();
            var16.c(0, 0);
            var12 = new o(var9, var9);
            var12.b();
            var16.c(-var16.field_z + var9, 0);
            var13 = new o(var16.field_z + -(var9 * 2), var9);
            var13.b();
            var16.c(-var9, 0);
            bb.b(4);
            vf.field_j = new o[]{var11, var13, var12};
        } catch (RuntimeException runtimeException) {
            throw bd.a((Throwable) ((Object) runtimeException), "eg.BA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    private final void a(int param0, int param1, byte param2) {
        Object stackIn_20_0 = null;
        Object stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        int var4;
        int var5;
        o[] var6;
        int var7;
        int var8;
        double var9;
        int var11;
        int var12;
        L0: {
          var12 = wizardrun.field_H;
          if (param2 == 62) {
            break L0;
          } else {
            this.field_q = (o) null;
            break L0;
          }
        }
        L1: {
          var4 = this.field_f.field_b * 32 / 240 + 32 * this.field_i.field_b;
          var5 = 32 * (15 - this.field_i.field_a) - (32 + this.field_f.field_a * 32 / 240);
          var5 = var5 - (this.field_d - 32);
          var6 = oc.field_b[param1];
          if ((param1 ^ -1) != -5) {
            break L1;
          } else {
            if (-7 == (ql.field_c ^ -1)) {
              var6 = hh.field_eb;
              break L1;
            } else {
              break L1;
            }
          }
        }
        L2: {
          if (param1 != 4) {
            break L2;
          } else {
            if (7 != ql.field_c) {
              break L2;
            } else {
              var6 = h.field_j;
              break L2;
            }
          }
        }
        L3: {
          if (-1 <= (this.field_p ^ -1)) {
            var7 = 240 * this.field_i.field_b - -this.field_f.field_b;
            var7 = 0;
            var6[this.field_n].a(var4 + this.field_d / 2, var5 + this.field_d / 2, -105, 128, var7);
            break L3;
          } else {
            if (this.field_r != 0) {
              var7 = this.field_i.field_b * 240 - -this.field_f.field_b;
              var8 = this.field_d / 2;
              var6[this.field_n].a(var8 + var4, var8 + var5, -112, 128, var7);
              this.field_q = var6[this.field_n].c();
              this.field_A = var5;
              this.field_y = var4;
              var11 = 0;
              L4: while (true) {
                if (-(var8 * this.field_w / 1000) + var8 <= var11) {
                  break L3;
                } else {
                  var9 = (0.5 * (double)(this.field_f.field_b + this.field_i.field_b * 240) + 6.28 * (double)var11) / (double)var8;
                  ob.field_c.d((int)((double)var8 * Math.cos((double)this.field_h * var9) + (double)var8) + (var4 - 6), var5 + ((int)((double)var8 + Math.sin(var9 * (double)this.field_h) * (double)var8) + -6), 12, 12, 255 + -(var11 % 10 * 25));
                  ob.field_c.d(var4 + -(int)((double)var8 * Math.cos((double)this.field_h * var9) - (double)var8) - 6, -(int)((double)(-var8) + (double)var8 * Math.sin(var9 * (double)this.field_h)) + (var5 - 6), 12, 12, 255 - 25 * (var11 % 10));
                  var11 += 2;
                  continue L4;
                }
              }
            } else {
              L5: {
                if (-1 == this.field_h) {
                  var6[this.field_n].e(var4, var5);
                  this.field_q = var6[this.field_n];
                  this.field_A = var5;
                  this.field_y = var4;
                  break L5;
                } else {
                  var6[this.field_n].d(var4, var5);
                  this.field_q = var6[this.field_n].c();
                  this.field_y = var4;
                  this.field_A = var5;
                  break L5;
                }
              }
              if (nk.field_T < 250) {
                break L3;
              } else {
                if (qh.field_l != 0) {
                  break L3;
                } else {
                  if (-1 != (ql.field_c ^ -1)) {
                    break L3;
                  } else {
                    if ((nk.field_T ^ -1) <= -401) {
                      break L3;
                    } else {
                      L6: {
                        stackIn_20_0 = this;

                        if ((uc.field_g ^ -1) <= -21) {
                          stackIn_21_0 = this;
                          stackIn_21_1 = 16776960;
                          break L6;
                        } else {
                          stackIn_21_0 = this;
                          stackIn_21_1 = 16711680;
                          break L6;
                        }
                      }
                      this.a(stackIn_21_1, var6[this.field_n].field_x / 2 + var4, true, "*", -4 + var5);
                      break L3;
                    }
                  }
                }
              }
            }
          }
        }
    }

    private final void a(int param0, int param1, boolean param2, tg param3) {
        int stackIn_13_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_14_1 = 0;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        String stackIn_47_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        int var6 = 0;
        var6 = wizardrun.field_H;
        try {
          L0: {
            this.a(1, si.field_j, param3, 1, param0, 1, tl.field_a, pk.field_s, (byte) 126);
            if (param1 <= -73) {
              L1: {
                if (this.b(param3, -4) != 1) {
                  break L1;
                } else {
                  if (0 == this.field_e) {
                    this.field_z = 0;
                    this.field_x = 0;
                    if ((this.field_B ^ -1) == -6) {
                      break L1;
                    } else {
                      if ((this.field_B ^ -1) == -23) {
                        break L1;
                      } else {
                        if (38 != this.field_B) {
                          if (64 < this.field_d) {
                            break L1;
                          } else {
                            L2: {
                              stackIn_13_0 = 0;

                              if (pk.field_s) {
                                stackIn_14_0 = stackIn_13_0;
                                stackIn_14_1 = 0;
                                break L2;
                              } else {
                                stackIn_14_0 = stackIn_13_0;
                                stackIn_14_1 = 1;
                                break L2;
                              }
                            }
                            if (stackIn_14_0 != stackIn_14_1) {
                              if (!pk.field_s) {
                                break L1;
                              } else {
                                if (6 == this.field_B) {
                                  tl.field_a.a(nl.field_q[6], 100, 256 * ee.field_p / 100);
                                  break L1;
                                } else {
                                  tl.field_a.a(si.field_j[5], 100, ee.field_p * 256 / 100);
                                  break L1;
                                }
                              }
                            } else {
                              tl.field_a.a(si.field_j[4], 100, ee.field_p * 256 / 100);
                              break L1;
                            }
                          }
                        } else {
                          break L1;
                        }
                      }
                    }
                  } else {
                    break L1;
                  }
                }
              }
              L3: {
                if (param2) {
                  L4: {
                    this.field_z = this.field_z + 1;
                    this.field_n = 21;
                    if (25 >= this.field_z) {
                      break L4;
                    } else {
                      this.field_n = 22;
                      break L4;
                    }
                  }
                  if (-7 != (this.field_B ^ -1)) {
                    break L3;
                  } else {
                    L5: {
                      this.field_n = 22;
                      if (-16 <= (this.field_z ^ -1)) {
                        break L5;
                      } else {
                        this.field_n = 23;
                        break L5;
                      }
                    }
                    if ((this.field_z ^ -1) < -26) {
                      this.field_n = 24;
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                } else {
                  this.field_n = 21;
                  break L3;
                }
              }
              L6: {
                if ((this.field_s ^ -1) >= -1) {
                  break L6;
                } else {
                  if (!param2) {
                    L7: {
                      this.field_s = this.field_s - 1;
                      this.field_p = this.field_p - 1;
                      if (this.field_p > 0) {
                        if (!pk.field_s) {
                          break L7;
                        } else {
                          if (param2) {
                            break L7;
                          } else {
                            this.c(1);
                            break L7;
                          }
                        }
                      } else {
                        if (!pk.field_s) {
                          break L7;
                        } else {
                          if (param2) {
                            break L7;
                          } else {
                            this.c(false);
                            break L7;
                          }
                        }
                      }
                    }
                    if ((this.field_p ^ -1) >= -1) {
                      this.field_e = 60;
                      break L6;
                    } else {
                      break L6;
                    }
                  } else {
                    break L6;
                  }
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var5 = decompiledCaughtException;
            stackIn_46_0 = (RuntimeException) (var5);

            stackIn_46_1 = new StringBuilder().append("eg.P(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_47_0 = (RuntimeException) ((Object) stackIn_46_0);
              stackIn_47_1 = (StringBuilder) ((Object) stackIn_46_1);
              stackIn_47_2 = "null";
              break L8;
            } else {
              stackIn_47_0 = (RuntimeException) ((Object) stackIn_46_0);
              stackIn_47_1 = (StringBuilder) ((Object) stackIn_46_1);
              stackIn_47_2 = "{...}";
              break L8;
            }
          }
          throw bd.a((Throwable) ((Object) stackIn_47_0), stackIn_47_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final void a(boolean param0, int param1, int param2, tg param3) {
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        ob var6 = null;
        try {
          L0: {
            L1: {
              if (param1 == 22) {
                break L1;
              } else {
                var6 = (ob) null;
                this.a(81, 113, (ob) null);
                break L1;
              }
            }
            L2: {
              this.a(1, si.field_j, param3, 1, param2, 1, tl.field_a, pk.field_s, (byte) -37);
              if (this.field_e <= 0) {
                this.field_x = 3;
                this.field_z = 0;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              this.field_n = 20;
              if (6 == this.field_B) {
                this.field_n = 22;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if ((this.field_s ^ -1) >= -1) {
                break L4;
              } else {
                if (!param0) {
                  L5: {
                    this.field_s = this.field_s - 1;
                    this.field_p = this.field_p - 1;
                    if (-1 > (this.field_p ^ -1)) {
                      if (!pk.field_s) {
                        break L5;
                      } else {
                        if (param0) {
                          break L5;
                        } else {
                          this.c(1);
                          break L5;
                        }
                      }
                    } else {
                      if (!pk.field_s) {
                        break L5;
                      } else {
                        if (param0) {
                          break L5;
                        } else {
                          this.c(false);
                          break L5;
                        }
                      }
                    }
                  }
                  if ((this.field_p ^ -1) >= -1) {
                    this.field_e = 60;
                    break L4;
                  } else {
                    break L4;
                  }
                } else {
                  break L4;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var5 = decompiledCaughtException;
            stackIn_24_0 = (RuntimeException) (var5);

            stackIn_24_1 = new StringBuilder().append("eg.L(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L6;
            } else {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L6;
            }
          }
          throw bd.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ')');
        }
    }

    private final void a(boolean param0, int param1, int param2, byte param3, tg param4) {
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        RuntimeException stackIn_60_0 = null;
        StringBuilder stackIn_60_1 = null;
        String stackIn_60_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        int var7 = 0;
        var7 = wizardrun.field_H;
        try {
          L0: {
            L1: {
              if (-1 != (this.b(param4, -4) ^ -1)) {
                break L1;
              } else {
                if (3 != param1) {
                  this.field_x = 3;
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              if (param1 == 3) {
                this.a(2, si.field_j, param4, 0, param2, 1, tl.field_a, pk.field_s, (byte) 126);
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (-1 == (param1 ^ -1)) {
                this.a(1, si.field_j, param4, 0, param2, 1, tl.field_a, pk.field_s, (byte) 126);
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (-3 == (param1 ^ -1)) {
                this.a(0, si.field_j, param4, 0, param2, 1, tl.field_a, pk.field_s, (byte) -117);
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              if ((param1 ^ -1) == -2) {
                L6: {
                  if (this.field_i.field_a > ii.field_e[0].field_i.field_a) {
                    break L6;
                  } else {
                    if (-1 != (this.field_e ^ -1)) {
                      break L6;
                    } else {
                      this.a(0, si.field_j, param4, 0, param2, 1, tl.field_a, pk.field_s, (byte) 127);
                      break L5;
                    }
                  }
                }
                this.a(1, si.field_j, param4, 1, param2, 1, tl.field_a, pk.field_s, (byte) -65);
                break L5;
              } else {
                break L5;
              }
            }
            L7: {
              this.field_z = this.field_z - 1;
              if (0 < this.field_z) {
                break L7;
              } else {
                this.field_z = 5;
                this.field_n = this.field_n + 1;
                if (param0) {
                  this.field_z = 2;
                  break L7;
                } else {
                  break L7;
                }
              }
            }
            L8: {
              if ((this.field_n ^ -1) <= -3) {
                break L8;
              } else {
                this.field_n = 2;
                break L8;
              }
            }
            L9: {
              if (!param0) {
                if (5 < this.field_n) {
                  this.field_n = 2;
                  break L9;
                } else {
                  break L9;
                }
              } else {
                if ((this.field_n ^ -1) < -10) {
                  this.field_n = 2;
                  break L9;
                } else {
                  break L9;
                }
              }
            }
            L10: {
              if (param3 < -58) {
                break L10;
              } else {
                this.a(-80, -12, (byte) -64);
                break L10;
              }
            }
            L11: {
              if (this.field_s <= 0) {
                break L11;
              } else {
                if (!param0) {
                  L12: {
                    this.field_s = this.field_s - 1;
                    this.field_p = this.field_p - 1;
                    if (this.field_p > 0) {
                      if (!pk.field_s) {
                        break L12;
                      } else {
                        if (!param0) {
                          this.c(1);
                          break L12;
                        } else {
                          break L12;
                        }
                      }
                    } else {
                      if (!pk.field_s) {
                        break L12;
                      } else {
                        if (param0) {
                          break L12;
                        } else {
                          this.c(false);
                          break L12;
                        }
                      }
                    }
                  }
                  if (this.field_p <= 0) {
                    L13: {
                      if (this.field_p <= 0) {
                        if (!pk.field_s) {
                          break L13;
                        } else {
                          if (param0) {
                            break L13;
                          } else {
                            this.c(false);
                            break L13;
                          }
                        }
                      } else {
                        if (!pk.field_s) {
                          break L13;
                        } else {
                          if (param0) {
                            break L13;
                          } else {
                            this.c(1);
                            break L13;
                          }
                        }
                      }
                    }
                    this.field_e = 60;
                    break L11;
                  } else {
                    break L11;
                  }
                } else {
                  break L11;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L14: {
            var6 = decompiledCaughtException;
            stackIn_59_0 = (RuntimeException) (var6);

            stackIn_59_1 = new StringBuilder().append("eg.M(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_60_0 = (RuntimeException) ((Object) stackIn_59_0);
              stackIn_60_1 = (StringBuilder) ((Object) stackIn_59_1);
              stackIn_60_2 = "null";
              break L14;
            } else {
              stackIn_60_0 = (RuntimeException) ((Object) stackIn_59_0);
              stackIn_60_1 = (StringBuilder) ((Object) stackIn_59_1);
              stackIn_60_2 = "{...}";
              break L14;
            }
          }
          throw bd.a((Throwable) ((Object) stackIn_60_0), stackIn_60_2 + ')');
        }
    }

    final void a(int param0, int param1, ob param2) {
        RuntimeException stackIn_119_0 = null;
        StringBuilder stackIn_119_1 = null;
        RuntimeException stackIn_120_0 = null;
        StringBuilder stackIn_120_1 = null;
        String stackIn_120_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          L0: {
            L1: {
              this.field_n = 0;
              this.field_w = 0;
              this.field_q = null;
              this.field_z = 0;
              this.field_B = param1;
              this.field_x = 0;
              this.field_i.a(-109, param2);
              this.field_f.b(17939);
              this.field_m = 0;
              this.field_e = 0;
              this.field_z = 0;
              this.field_r = 0;
              this.field_o = 0;
              this.field_d = 32;
              this.field_h = 1;
              this.field_p = 0;
              this.field_k = 0;
              this.field_s = 0;
              if (param1 == 0) {
                this.field_d = 64;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (21 != param1) {
                break L2;
              } else {
                this.field_d = 32;
                break L2;
              }
            }
            L3: {
              if (-2 == (param1 ^ -1)) {
                this.field_d = 24;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if ((param1 ^ -1) == -3) {
                this.field_d = 64;
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              if (3 != param1) {
                break L5;
              } else {
                this.field_p = 1;
                this.field_d = 32;
                break L5;
              }
            }
            L6: {
              if (4 != param1) {
                break L6;
              } else {
                this.field_p = 4;
                this.field_d = 48;
                break L6;
              }
            }
            L7: {
              if (-6 == (param1 ^ -1)) {
                this.field_p = 1;
                this.field_d = 32;
                break L7;
              } else {
                break L7;
              }
            }
            L8: {
              if ((param1 ^ -1) == -7) {
                this.field_d = 65;
                this.field_f.field_b = this.field_f.field_b - 80;
                this.field_p = 50;
                this.field_o = 7;
                break L8;
              } else {
                break L8;
              }
            }
            L9: {
              if (-8 != (param1 ^ -1)) {
                break L9;
              } else {
                this.field_p = 5;
                this.field_d = 48;
                break L9;
              }
            }
            L10: {
              if (-9 == (param1 ^ -1)) {
                this.field_d = 32;
                this.field_p = 1;
                break L10;
              } else {
                break L10;
              }
            }
            L11: {
              if (9 == param1) {
                this.field_d = 48;
                this.field_p = 4;
                break L11;
              } else {
                break L11;
              }
            }
            L12: {
              if (param1 != 10) {
                break L12;
              } else {
                this.field_p = 8;
                this.field_d = 64;
                break L12;
              }
            }
            L13: {
              if (param1 != 11) {
                break L13;
              } else {
                this.field_d = 64;
                break L13;
              }
            }
            L14: {
              if (-13 == (param1 ^ -1)) {
                this.field_d = 65;
                this.field_p = 50;
                break L14;
              } else {
                break L14;
              }
            }
            L15: {
              if (13 == param1) {
                this.field_d = 48;
                this.field_p = 3;
                break L15;
              } else {
                break L15;
              }
            }
            L16: {
              if (param1 != 14) {
                break L16;
              } else {
                this.field_p = 5;
                this.field_d = 48;
                break L16;
              }
            }
            L17: {
              if (15 != param1) {
                break L17;
              } else {
                this.field_d = 48;
                this.field_p = 6;
                break L17;
              }
            }
            L18: {
              if ((param1 ^ -1) == -17) {
                this.field_d = 64;
                this.field_p = 10;
                break L18;
              } else {
                break L18;
              }
            }
            L19: {
              if (17 == param1) {
                this.field_d = 80;
                this.field_p = 75;
                break L19;
              } else {
                break L19;
              }
            }
            L20: {
              if (18 == param1) {
                this.field_d = 24;
                break L20;
              } else {
                break L20;
              }
            }
            L21: {
              if (19 != param1) {
                break L21;
              } else {
                this.field_d = 20;
                break L21;
              }
            }
            L22: {
              if ((param1 ^ -1) != -26) {
                break L22;
              } else {
                this.field_d = 80;
                break L22;
              }
            }
            L23: {
              if (-23 != (param1 ^ -1)) {
                break L23;
              } else {
                this.field_p = 3;
                this.field_d = 32;
                break L23;
              }
            }
            L24: {
              if (param1 == 23) {
                this.field_p = 12;
                this.field_d = 80;
                break L24;
              } else {
                break L24;
              }
            }
            L25: {
              if ((param1 ^ -1) == -25) {
                this.field_p = 6;
                this.field_d = 48;
                break L25;
              } else {
                break L25;
              }
            }
            L26: {
              if (26 == param1) {
                this.field_d = 96;
                this.field_p = 75;
                break L26;
              } else {
                break L26;
              }
            }
            L27: {
              if (param1 != 27) {
                break L27;
              } else {
                this.field_d = 40;
                break L27;
              }
            }
            L28: {
              if (-29 != (param1 ^ -1)) {
                break L28;
              } else {
                this.field_d = 24;
                break L28;
              }
            }
            L29: {
              if ((param1 ^ -1) == -30) {
                this.field_d = 64;
                this.field_p = 6;
                break L29;
              } else {
                break L29;
              }
            }
            L30: {
              if (-31 == (param1 ^ -1)) {
                this.field_d = 64;
                this.field_p = 4;
                break L30;
              } else {
                break L30;
              }
            }
            L31: {
              if ((param1 ^ -1) == -32) {
                this.field_d = 64;
                this.field_p = 15;
                break L31;
              } else {
                break L31;
              }
            }
            L32: {
              if (param1 == 32) {
                this.field_d = 80;
                this.field_p = 12;
                break L32;
              } else {
                break L32;
              }
            }
            L33: {
              if (33 != param1) {
                break L33;
              } else {
                this.field_p = 75;
                this.field_d = 96;
                break L33;
              }
            }
            L34: {
              if ((param1 ^ -1) != -35) {
                break L34;
              } else {
                this.field_d = 64;
                break L34;
              }
            }
            L35: {
              if ((param1 ^ -1) == -36) {
                this.field_d = 64;
                break L35;
              } else {
                break L35;
              }
            }
            L36: {
              if (42 == param1) {
                this.field_d = 64;
                break L36;
              } else {
                break L36;
              }
            }
            L37: {
              if (43 == param1) {
                this.field_d = 96;
                break L37;
              } else {
                break L37;
              }
            }
            L38: {
              if (36 == param1) {
                this.field_p = 1;
                this.field_d = 32;
                break L38;
              } else {
                break L38;
              }
            }
            L39: {
              if (37 == param1) {
                this.field_d = 80;
                this.field_p = 20;
                break L39;
              } else {
                break L39;
              }
            }
            L40: {
              if (param1 != 38) {
                break L40;
              } else {
                this.field_d = 48;
                this.field_p = 6;
                break L40;
              }
            }
            L41: {
              if (39 != param1) {
                break L41;
              } else {
                this.field_d = 64;
                this.field_p = 10;
                break L41;
              }
            }
            L42: {
              if (40 == param1) {
                this.field_d = 80;
                this.field_p = 200;
                break L42;
              } else {
                break L42;
              }
            }
            if (param0 == 9147) {
              L43: {
                if (param1 != 41) {
                  break L43;
                } else {
                  this.field_d = 128;
                  break L43;
                }
              }
              L44: {
                if ((param1 ^ -1) == -46) {
                  this.field_d = 96;
                  break L44;
                } else {
                  break L44;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L45: {
            var4 = decompiledCaughtException;
            stackIn_119_0 = (RuntimeException) (var4);

            stackIn_119_1 = new StringBuilder().append("eg.N(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_120_0 = (RuntimeException) ((Object) stackIn_119_0);
              stackIn_120_1 = (StringBuilder) ((Object) stackIn_119_1);
              stackIn_120_2 = "null";
              break L45;
            } else {
              stackIn_120_0 = (RuntimeException) ((Object) stackIn_119_0);
              stackIn_120_1 = (StringBuilder) ((Object) stackIn_119_1);
              stackIn_120_2 = "{...}";
              break L45;
            }
          }
          throw bd.a((Throwable) ((Object) stackIn_120_0), stackIn_120_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    eg() {
        this.field_k = 0;
        this.field_w = 0;
        this.field_x = 0;
        this.field_B = 0;
        this.field_i.b(17939);
        this.field_f.b(17939);
        this.field_m = 0;
        this.field_p = 0;
        this.field_r = 0;
        this.field_e = 0;
        this.field_h = 1;
        this.field_o = 0;
        this.field_q = null;
        this.field_d = 32;
        this.field_s = 0;
    }

    static {
        field_t = "More suggestions";
    }
}
