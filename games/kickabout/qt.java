/*
 * Decompiled by CFR-JS 0.4.0.
 */
class qt extends js {
    static int[] field_r;
    private String field_s;
    private int field_p;
    private int field_q;
    static ut field_u;
    private String field_w;
    private io[] field_v;
    private int field_t;
    static String field_z;
    private int field_g;
    ko field_x;
    static String field_k;
    io[] field_i;
    static String field_h;
    int field_j;
    static int field_l;
    static gq field_y;
    private int field_o;
    private boolean field_m;
    static hd field_n;

    private final boolean e(byte param0) {
        int var2 = 0;
        int var3 = Kickabout.field_G;
        if (param0 != 83) {
            field_n = (hd) null;
        }
        for (var2 = 0; this.field_i.length > var2; var2++) {
            if (7 == this.field_i[var2].field_m) {
                return true;
            }
        }
        return false;
    }

    final boolean a(qt param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == -4319) {
                break L1;
              } else {
                this.a(false, -69);
                break L1;
              }
            }
            L2: {
              if (param0.field_q <= this.field_q) {
                stackIn_5_0 = 0;
                break L2;
              } else {
                stackIn_5_0 = 1;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var3);

            stackIn_8_1 = new StringBuilder().append("qt.BA(");

            if (param0 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L3;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L3;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ')');
        }
        return stackIn_5_0 != 0;
    }

    final void d(byte param0) {
        int var2 = 0;
        if ((this.field_c ^ -1) == -25) {
            var2 = 12;
        }
        if (param0 <= 41) {
            field_y = (gq) null;
        }
        if (!(-26 != (this.field_c ^ -1))) {
            var2 = 14;
        }
        if ((this.field_c ^ -1) == -15) {
            var2 = 15;
        }
        if (this.field_c == 23) {
            var2 = 13;
        }
        if (!(16 != this.field_c)) {
            var2 = 16;
        }
        if (!(this.field_c != 15)) {
            var2 = 17;
        }
        kj.a(63, var2);
    }

    int b(int param0, int param1) {
        if (param1 != -22667) {
            this.field_p = -20;
        }
        if (this.field_i[param0].field_m == 37) {
            return wr.field_f + -50;
        }
        return 190;
    }

    void a(int param0, boolean param1) {
        int var3;
        js var3_ref_js;
        int var4;
        js var4_ref_js;
        int var5;
        ut var5_ref_ut;
        int var6;
        int var7;
        ut var8;
        L0: {
          var7 = Kickabout.field_G;
          if (this.field_t != 0) {
            var3 = 14 + (5 * this.field_t - 5);
            var4 = 0;
            L1: while (true) {
              if (this.field_t <= var4) {
                L2: {
                  var4 = this.field_i[0].field_d + 14;
                  if (1 < this.field_g) {
                    var5 = 1;
                    L3: while (true) {
                      if (this.field_g <= var5) {
                        break L2;
                      } else {
                        var4 = var4 + (14 + this.field_i[var5].field_d);
                        var5++;
                        continue L3;
                      }
                    }
                  } else {
                    break L2;
                  }
                }
                var5 = this.b(0, -22667) - (this.field_i[0].field_d >> 1571527937);
                var6 = this.a(60, 0) + -(this.field_i[0].field_h >> 1077054785);
                var5 = var5 - 7 + this.field_j;
                var6 = var6 + -7;
                on.a(var5, var6, var4, var3, 12, 0, 128);
                break L0;
              } else {
                var3 = var3 + this.field_i[var4].field_h;
                var4++;
                continue L1;
              }
            }
          } else {
            break L0;
          }
        }
        if (param0 == -5) {
          L4: {
            if (-1 != this.field_o) {
              var3 = -((this.field_j << -747328762) / 640);
              var8 = ug.field_b[this.field_o][1];
              var5_ref_ut = ug.field_b[this.field_o][0];
              var6 = 0;
              L5: while (true) {
                if (var6 >= wr.field_f - var5_ref_ut.field_o) {
                  L6: {
                    var5_ref_ut.d(-var5_ref_ut.field_o + wr.field_f, var3);
                    var6 = var3 - (-var5_ref_ut.field_v - -18);
                    if (null == this.field_w) {
                      break L6;
                    } else {
                      un.field_d.a(this.field_w, 10, var6, 16777215, -1);
                      break L6;
                    }
                  }
                  if (null == this.field_s) {
                    break L4;
                  } else {
                    un.field_d.c(this.field_s, this.field_p, var6, 16777215, -1);
                    break L4;
                  }
                } else {
                  var8.d(var6, var3);
                  var6 = var6 + var8.field_o;
                  continue L5;
                }
              }
            } else {
              break L4;
            }
          }
          L7: {
            if (!this.field_m) {
              break L7;
            } else {
              var3_ref_js = cq.field_h;
              var4_ref_js = ra.field_G;
              if (var4_ref_js != null) {
                L8: {
                  if (var3_ref_js != this) {
                    break L8;
                  } else {
                    if (!(var4_ref_js instanceof qt)) {
                      break L8;
                    } else {
                      if (!((qt) ((Object) var4_ref_js)).field_m) {
                        break L8;
                      } else {
                        ai.field_E.d(0, 430);
                        break L7;
                      }
                    }
                  }
                }
                L9: {
                  var5 = (ce.field_I << 518080521) / 24;
                  if (256 >= var5) {
                    break L9;
                  } else {
                    var5 = 256;
                    break L9;
                  }
                }
                L10: {
                  if (this != cq.field_h) {
                    break L10;
                  } else {
                    var5 = -var5 + 256;
                    break L10;
                  }
                }
                ai.field_E.b(0, 430, var5);
                break L7;
              } else {
                ai.field_E.d(0, 430);
                break L7;
              }
            }
          }
          var3 = 0;
          L11: while (true) {
            if (var3 >= this.field_x.field_a) {
              return;
            } else {
              if (this.a(var3, (byte) -95)) {
                L12: {
                  var4 = this.b(var3, param0 + -22662) + this.field_j;
                  var5 = this.field_i[var3].field_m;
                  if (-8 == (var5 ^ -1)) {
                    L13: {
                      if (this != cq.field_h) {
                        break L13;
                      } else {
                        if (!(ra.field_G instanceof qt)) {
                          break L13;
                        } else {
                          if (!((qt) ((Object) ra.field_G)).e((byte) 83)) {
                            break L13;
                          } else {
                            var3++;
                            continue L11;
                          }
                        }
                      }
                    }
                    if (ra.field_G != this) {
                      break L12;
                    } else {
                      if (!(cq.field_h instanceof qt)) {
                        break L12;
                      } else {
                        if (!((qt) ((Object) cq.field_h)).e((byte) 83)) {
                          break L12;
                        } else {
                          var4 = var4 - this.field_j;
                          break L12;
                        }
                      }
                    }
                  } else {
                    break L12;
                  }
                }
                L14: {
                  L15: {
                    if (7 == var5) {
                      break L15;
                    } else {
                      if ((var5 ^ -1) == -44) {
                        break L15;
                      } else {
                        if (var5 == 19) {
                          break L15;
                        } else {
                          if ((var5 ^ -1) == -43) {
                            break L15;
                          } else {
                            if (var5 == 21) {
                              break L15;
                            } else {
                              if ((var5 ^ -1) == -23) {
                                break L15;
                              } else {
                                if ((var5 ^ -1) != -38) {
                                  break L14;
                                } else {
                                  break L15;
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                  on.a(-4 + (var4 - (this.field_i[var3].field_d >> -618926815)), this.a(123, var3) + (-(this.field_i[var3].field_h >> -43066271) + -4), 8 + this.field_i[var3].field_d, 8 + this.field_i[var3].field_h, 10, 0, 128);
                  break L14;
                }
                this.field_i[var3].a(this.a(-106, var3), var4, 13800);
                var3++;
                continue L11;
              } else {
                var3++;
                continue L11;
              }
            }
          }
        } else {
          return;
        }
    }

    boolean a(int param0, int param1, char param2) {
        int var4;
        int var5;
        int stackIn_8_0 = 0;
        io stackIn_19_0 = null;
        io stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        L0: {
          var5 = Kickabout.field_G;
          if ((this.field_x.field_e ^ -1) <= -1) {
            if (17 != this.field_i[this.field_x.field_e].field_m) {
              if (16 == this.field_i[this.field_x.field_e].field_m) {
                stackIn_8_0 = 1;
                break L0;
              } else {
                stackIn_8_0 = 0;
                break L0;
              }
            } else {
              stackIn_8_0 = 1;
              break L0;
            }
          } else {
            stackIn_8_0 = 0;
            break L0;
          }
        }
        L1: {
          var4 = stackIn_8_0;
          if ((param0 ^ -1) == -14) {
            this.c(-77);
            break L1;
          } else {
            L2: {
              if (var4 == 0) {
                break L2;
              } else {
                L3: {
                  if (param0 == 96) {
                    break L3;
                  } else {
                    if (-98 == (param0 ^ -1)) {
                      break L3;
                    } else {
                      break L2;
                    }
                  }
                }
                L4: {
                  stackIn_19_0 = this.field_i[this.field_x.field_e];

                  if ((param0 ^ -1) != -97) {
                    stackIn_20_0 = (io) ((Object) stackIn_19_0);
                    stackIn_20_1 = 0;
                    break L4;
                  } else {
                    stackIn_20_0 = (io) ((Object) stackIn_19_0);
                    stackIn_20_1 = 1;
                    break L4;
                  }
                }
                ((io) (Object) stackIn_20_0).a(stackIn_20_1 != 0, -27);
                break L1;
              }
            }
            this.field_x.d(107);
            if (0 > this.field_x.field_e) {
              break L1;
            } else {
              if (this.field_x.c(-1)) {
                this.field_i[this.field_x.field_e].a(-1, false);
                break L1;
              } else {
                break L1;
              }
            }
          }
        }
        if (param1 <= -5) {
          return true;
        } else {
          this.a(-115, 63);
          return true;
        }
    }

    void a(int param0, boolean param1, int param2, js param3) {
        int var5_int = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          L0: {
            L1: {
              if (param3 instanceof qt) {
                L2: {
                  var5_int = -param0 + 256;
                  this.field_j = var5_int * (var5_int * 640) >> -1768038128;
                  if (!param1) {
                    this.field_j = this.field_j - 640;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  L4: {
                    if (param1) {
                      break L4;
                    } else {
                      if (((qt) ((Object) param3)).a((qt) (this), -4319)) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                  if (!param1) {
                    break L1;
                  } else {
                    if (!this.a((qt) ((Object) param3), -4319)) {
                      break L1;
                    } else {
                      break L3;
                    }
                  }
                }
                this.field_j = -this.field_j;
                break L1;
              } else {
                this.field_j = wr.field_f + -po.a((js) (this), -4);
                break L1;
              }
            }
            L5: {
              if (param2 < -28) {
                break L5;
              } else {
                this.field_j = 124;
                break L5;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var5 = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var5);

            stackIn_17_1 = new StringBuilder().append("qt.F(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L6;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L6;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ')');
        }
    }

    final void b(byte param0) {
        if (!(this.field_v == null)) {
            this.a(false, this.field_v);
        }
        if (param0 >= -94) {
            io[] var3 = (io[]) null;
            this.a(false, (io[]) null);
        }
    }

    final void a(String param0, int param1, int param2, int param3, String param4, io[] param5, io[] param6, int param7, boolean param8, int param9, int param10, int param11) {
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var13 = null;
        try {
          L0: {
            L1: {
              this.field_w = param0;
              this.field_g = param2;
              this.field_o = param9;
              this.field_p = param7;
              this.field_q = param11;
              stackIn_2_0 = this;

              if (!param8) {
                stackIn_3_0 = this;
                stackIn_3_1 = 0;
                break L1;
              } else {
                stackIn_3_0 = this;
                stackIn_3_1 = 1;
                break L1;
              }
            }
            L2: {
              ((qt) (this)).field_m = stackIn_3_1 != 0;
              this.field_c = param10;
              if (param3 == -46) {
                break L2;
              } else {
                qt.c((byte) 105);
                break L2;
              }
            }
            L3: {
              this.field_t = param1;
              if (param6 != null) {
                break L3;
              } else {
                param6 = new io[]{};
                break L3;
              }
            }
            L4: {
              this.field_s = param4;
              if (param5 != null) {
                this.a(false, param5);
                this.field_v = param6;
                break L4;
              } else {
                this.a(false, param6);
                break L4;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var13 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var13);

            stackIn_13_1 = new StringBuilder().append("qt.CA(");

            if (param0 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L5;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_16_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L6;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L6;
            }
          }
          L7: {


            stackIn_19_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',');

            if (param5 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L7;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L7;
            }
          }
          L8: {


            stackIn_22_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(',');

            if (param6 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L8;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L8;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_14_0), stackIn_23_2 + ',' + param7 + ',' + param8 + ',' + param9 + ',' + param10 + ',' + param11 + ')');
        }
    }

    void b(int param0) {
        if (param0 != -38) {
            qt var3 = (qt) null;
            this.a((qt) null, 112);
        }
    }

    boolean a(int param0, byte param1) {
        if (param1 != -95) {
            this.a(true, 92);
        }
        return true;
    }

    qt() {
        super(0);
        this.field_j = 0;
    }

    final static boolean d(int param0) {
        int stackIn_6_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_39_0 = 0;
        int stackIn_45_0 = 0;
        int stackIn_49_0 = 0;
        int stackIn_53_0 = 0;
        int stackIn_54_0 = 0;
        int stackIn_54_1 = 0;
        int stackIn_56_0 = 0;
        int stackIn_61_0 = 0;
        int stackIn_66_0 = 0;
        int stackIn_70_0 = 0;
        int stackIn_74_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        var3 = Kickabout.field_G;
        try {
          L0: {
            if (ks.field_e == 1) {
              L1: {
                if (et.field_d.field_V.field_m != 0) {
                  stackIn_70_0 = 0;
                  break L1;
                } else {
                  stackIn_70_0 = 1;
                  break L1;
                }
              }
              decompiledRegionSelector0 = 10;
              break L0;
            } else {
              if (2 != ks.field_e) {
                if (ks.field_e != 3) {
                  if (-5 == (ks.field_e ^ -1)) {
                    L2: {
                      L3: {
                        if (et.field_d.field_V.field_m != 0) {
                          break L3;
                        } else {
                          if (-4 != (et.field_d.field_V.field_s ^ -1)) {
                            break L3;
                          } else {
                            stackIn_66_0 = 1;
                            break L2;
                          }
                        }
                      }
                      stackIn_66_0 = 0;
                      break L2;
                    }
                    decompiledRegionSelector0 = 9;
                    break L0;
                  } else {
                    if (5 != ks.field_e) {
                      if (-7 == (ks.field_e ^ -1)) {
                        L4: {
                          L5: {
                            if (-1 != (et.field_d.field_V.field_m ^ -1)) {
                              break L5;
                            } else {
                              if (3 != et.field_d.field_V.field_s) {
                                break L5;
                              } else {
                                stackIn_61_0 = 1;
                                break L4;
                              }
                            }
                          }
                          stackIn_61_0 = 0;
                          break L4;
                        }
                        decompiledRegionSelector0 = 8;
                        break L0;
                      } else {
                        if ((ks.field_e ^ -1) == -8) {
                          L6: {
                            if (-1 != (et.field_d.field_V.field_m ^ -1)) {
                              stackIn_49_0 = 0;
                              break L6;
                            } else {
                              stackIn_49_0 = 1;
                              break L6;
                            }
                          }
                          var1_int = stackIn_49_0;
                          var2 = 1;
                          L7: while (true) {
                            if (4 <= var2) {
                              stackIn_56_0 = var1_int;
                              decompiledRegionSelector0 = 7;
                              break L0;
                            } else {
                              L8: {
                                stackIn_53_0 = var1_int;

                                if (et.field_d.field_P[1][var2].field_w != fm.a((byte) -27, 1)) {
                                  stackIn_54_0 = stackIn_53_0;
                                  stackIn_54_1 = 0;
                                  break L8;
                                } else {
                                  stackIn_54_0 = stackIn_53_0;
                                  stackIn_54_1 = 1;
                                  break L8;
                                }
                              }
                              var1_int = stackIn_54_0 & stackIn_54_1;
                              var2++;
                              continue L7;
                            }
                          }
                        } else {
                          if (8 != ks.field_e) {
                            if (9 != ks.field_e) {
                              if (ks.field_e != 10) {
                                if (11 == ks.field_e) {
                                  L9: {
                                    if (-1 != (et.field_d.field_V.field_m ^ -1)) {
                                      stackIn_45_0 = 0;
                                      break L9;
                                    } else {
                                      stackIn_45_0 = 1;
                                      break L9;
                                    }
                                  }
                                  decompiledRegionSelector0 = 6;
                                  break L0;
                                } else {
                                  L10: {
                                    if (param0 == -8) {
                                      break L10;
                                    } else {
                                      qt.c((byte) -118);
                                      break L10;
                                    }
                                  }
                                  stackIn_74_0 = 0;
                                  decompiledRegionSelector0 = 11;
                                  break L0;
                                }
                              } else {
                                L11: {
                                  if ((et.field_d.field_R[0].field_g ^ -1) != -5) {
                                    stackIn_39_0 = 0;
                                    break L11;
                                  } else {
                                    stackIn_39_0 = 1;
                                    break L11;
                                  }
                                }
                                decompiledRegionSelector0 = 5;
                                break L0;
                              }
                            } else {
                              L12: {
                                L13: {
                                  if (0 != et.field_d.field_V.field_m) {
                                    break L13;
                                  } else {
                                    if (-2 != (et.field_d.field_V.field_s ^ -1)) {
                                      break L13;
                                    } else {
                                      stackIn_34_0 = 1;
                                      break L12;
                                    }
                                  }
                                }
                                stackIn_34_0 = 0;
                                break L12;
                              }
                              decompiledRegionSelector0 = 4;
                              break L0;
                            }
                          } else {
                            L14: {
                              L15: {
                                if (-1 != (et.field_d.field_V.field_m ^ -1)) {
                                  break L15;
                                } else {
                                  if (-761 <= (ld.field_f.f(-115) ^ -1)) {
                                    break L15;
                                  } else {
                                    if (-1001 <= (ld.field_f.a(true) ^ -1)) {
                                      break L15;
                                    } else {
                                      stackIn_28_0 = 1;
                                      break L14;
                                    }
                                  }
                                }
                              }
                              stackIn_28_0 = 0;
                              break L14;
                            }
                            decompiledRegionSelector0 = 3;
                            break L0;
                          }
                        }
                      }
                    } else {
                      L16: {
                        L17: {
                          if (et.field_d.field_V.field_m != 0) {
                            break L17;
                          } else {
                            if (et.field_d.field_V.field_s != 1) {
                              break L17;
                            } else {
                              stackIn_19_0 = 1;
                              break L16;
                            }
                          }
                        }
                        stackIn_19_0 = 0;
                        break L16;
                      }
                      decompiledRegionSelector0 = 2;
                      break L0;
                    }
                  }
                } else {
                  L18: {
                    L19: {
                      if (790 >= mh.field_k.f(param0 + -85)) {
                        break L19;
                      } else {
                        if (1000 >= mh.field_k.a(true)) {
                          break L19;
                        } else {
                          stackIn_12_0 = 1;
                          break L18;
                        }
                      }
                    }
                    stackIn_12_0 = 0;
                    break L18;
                  }
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              } else {
                L20: {
                  if (-286 >= (mh.field_k.a(true) ^ -1)) {
                    stackIn_6_0 = 0;
                    break L20;
                  } else {
                    stackIn_6_0 = 1;
                    break L20;
                  }
                }
                decompiledRegionSelector0 = 0;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw nb.a((Throwable) ((Object) var1), "qt.V(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_12_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_19_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_28_0 != 0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_34_0 != 0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_39_0 != 0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_45_0 != 0;
                    } else {
                      if (decompiledRegionSelector0 == 7) {
                        return stackIn_56_0 != 0;
                      } else {
                        if (decompiledRegionSelector0 == 8) {
                          return stackIn_61_0 != 0;
                        } else {
                          if (decompiledRegionSelector0 == 9) {
                            return stackIn_66_0 != 0;
                          } else {
                            if (decompiledRegionSelector0 == 10) {
                              return stackIn_70_0 != 0;
                            } else {
                              return stackIn_74_0 != 0;
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
    }

    void a(boolean param0, int param1) {
        if (param1 <= 99) {
            this.field_v = (io[]) null;
        }
    }

    private final int a(int param0, int param1, byte param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = Kickabout.field_G;
        for (var4 = 0; var4 < this.field_i.length; var4++) {
            var5 = this.field_i[var4].field_d;
            var6 = this.field_i[var4].field_h;
            var7 = this.b(var4, -22667) - (var5 >> 104415105) - -this.field_j;
            var8 = -(var6 >> -697512511) + this.a(31, var4);
            if (!(!this.a(var4, (byte) -95))) {
                if (!(param0 < var7)) {
                    if (!(var5 + var7 <= param0)) {
                        if (!(param1 < var8)) {
                            if (!(var8 - -var6 <= param1)) {
                                return var4;
                            }
                        }
                    }
                }
            }
        }
        if (param2 < 29) {
            return 43;
        }
        return -1;
    }

    void a(byte param0, boolean param1) {
        boolean stackIn_3_0 = false;
        boolean stackIn_4_0 = false;
        int stackIn_4_1 = 0;
        int stackIn_11_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_32_0 = 0;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        L0: {
          L1: {
            var8 = Kickabout.field_G;
            stackIn_3_0 = param1;

            if (ec.field_e) {
              break L1;
            } else {

              if (an.field_d) {
                break L1;
              } else {
                stackIn_4_0 = stackIn_3_0;
                stackIn_4_1 = 1;
                break L0;
              }
            }
          }
          stackIn_4_0 = stackIn_3_0;
          stackIn_4_1 = 0;
          break L0;
        }
        L2: {
          param1 = stackIn_4_0 & stackIn_4_1 != 0;
          if (!param1) {
            this.field_x.field_e = -1;
            break L2;
          } else {
            break L2;
          }
        }
        L3: {
          if (!param1) {
            break L3;
          } else {
            L4: {
              var3 = this.a(wt.field_x, us.field_j, (byte) 30);
              this.field_x.a(-21174, var3, this.a(dn.field_yb, kf.field_Eb, (byte) 110));
              if (0 == (var3 ^ -1)) {
                stackIn_11_0 = -1;
                break L4;
              } else {
                stackIn_11_0 = this.field_i[var3].field_m;
                break L4;
              }
            }
            var4 = stackIn_11_0;
            if (var4 == -1) {
              break L3;
            } else {
              if (null != fa.field_g[var4]) {
                qd.a((byte) -67, fa.field_g[var4]);
                break L3;
              } else {
                break L3;
              }
            }
          }
        }
        var9 = 0;
        var3 = var9;
        L5: while (true) {
          if (this.field_i.length <= var9) {
            var4 = -54 % ((38 - param0) / 60);
            return;
          } else {
            L6: {
              if ((var9 ^ -1) != (this.field_x.field_e ^ -1)) {
                stackIn_20_0 = 0;
                break L6;
              } else {
                stackIn_20_0 = 1;
                break L6;
              }
            }
            L7: {
              var4 = stackIn_20_0;
              if (var4 != 0) {
                if (this.field_x.c(-1)) {
                  stackIn_26_0 = 1;
                  break L7;
                } else {
                  stackIn_26_0 = 0;
                  break L7;
                }
              } else {
                stackIn_26_0 = 0;
                break L7;
              }
            }
            L8: {
              var5 = stackIn_26_0;
              if (var4 != 0) {
                if (this.field_x.a(0)) {
                  stackIn_32_0 = 1;
                  break L8;
                } else {
                  stackIn_32_0 = 0;
                  break L8;
                }
              } else {
                stackIn_32_0 = 0;
                break L8;
              }
            }
            var6 = stackIn_32_0;
            var7 = wt.field_x + -this.b(var9, -22667);
            this.field_i[var9].a(var4 != 0, var5 != 0, var6 != 0, 16, var7);
            var9++;
            continue L5;
          }
        }
    }

    final static void a(int param0) {
        np.field_Jb.a(new qq(), 3);
        if (param0 != 16144) {
            qt.d(-47);
        }
    }

    void a(int param0, int param1, boolean param2) {
        int var5 = 0;
        io var6 = null;
        int var7 = Kickabout.field_G;
        this.field_x.a(-1, 0, param1, param2);
        io[] var8 = this.field_i;
        io[] var4 = var8;
        for (var5 = 0; var5 < var8.length; var5++) {
            var6 = var8[var5];
            var6.a(false, false, false, 16, 0);
        }
        if (param0 == this.field_i.length) {
            this.field_x.field_e = -1;
        }
    }

    private final void c(int param0) {
        if (param0 > -67) {
            return;
        }
        if (0 == this.field_c || 18 == this.field_c) {
            return;
        }
        vj.a(106, false);
    }

    public static void c(byte param0) {
        field_y = null;
        field_n = null;
        field_z = null;
        int var1 = 27 % ((param0 - -56) / 45);
        field_h = null;
        field_u = null;
        field_k = null;
        field_r = null;
    }

    int a(int param0, int param1) {
        int var3;
        int var4;
        int var5;
        int var6;
        L0: {
          var6 = Kickabout.field_G;
          if (this.field_i[param1].field_m == 7) {
            break L0;
          } else {
            if (42 == this.field_i[param1].field_m) {
              break L0;
            } else {
              if (-38 == (this.field_i[param1].field_m ^ -1)) {
                break L0;
              } else {
                if ((this.field_i[param1].field_m ^ -1) == -20) {
                  break L0;
                } else {
                  if ((this.field_i[param1].field_m ^ -1) == -44) {
                    break L0;
                  } else {
                    L1: {
                      L2: {
                        var3 = -124 % ((param0 - -49) / 52);
                        var4 = 190;
                        if ((this.field_i[param1].field_m ^ -1) == -47) {
                          break L2;
                        } else {
                          if (48 == this.field_i[param1].field_m) {
                            break L2;
                          } else {
                            if (-46 == (this.field_i[param1].field_m ^ -1)) {
                              break L2;
                            } else {
                              if (this.field_i[param1].field_m == 28) {
                                break L2;
                              } else {
                                if (this.field_i[param1].field_m != 26) {
                                  L3: {
                                    if (25 == this.field_i[param1].field_m) {
                                      break L3;
                                    } else {
                                      if (3 == this.field_i[param1].field_m) {
                                        break L3;
                                      } else {
                                        if (18 == this.field_i[param1].field_m) {
                                          break L3;
                                        } else {
                                          break L1;
                                        }
                                      }
                                    }
                                  }
                                  var4 += 25;
                                  break L1;
                                } else {
                                  break L2;
                                }
                              }
                            }
                          }
                        }
                      }
                      var4 -= 25;
                      break L1;
                    }
                    var5 = 0;
                    L4: while (true) {
                      if (param1 <= var5) {
                        return var4;
                      } else {
                        var4 = var4 + ((this.field_i[var5].field_h >> -741388863) - -5 - -(this.field_i[var5 + 1].field_h >> -2050160319));
                        var5++;
                        continue L4;
                      }
                    }
                  }
                }
              }
            }
          }
        }
        return 469 - (this.field_i[param1].field_h >> -972877759);
    }

    private final void a(boolean param0, io[] param1) {
        this.field_i = param1;
        if (param0) {
            return;
        }
        try {
            this.field_x = new ko(this.field_i.length);
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) ((Object) runtimeException), "qt.T(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static hd f(byte param0) {
        if (param0 != -63) {
            return (hd) null;
        }
        return nq.field_F.field_yb;
    }

    static {
        field_r = new int[]{672, 100, 1294};
        field_h = "scroll down";
        field_z = "Lobby";
        field_k = "Remove friend";
    }
}
