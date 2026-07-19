/*
 * Decompiled by CFR-JS 0.4.0.
 */
class tk extends lg {
    private long field_E;
    private int field_C;
    private int field_I;
    private boolean field_F;
    private int field_D;
    private long field_H;
    private boolean field_J;
    private int field_G;

    private final void f(byte param0) {
        int var3 = 0;
        int var4 = 0;
        int var2 = 2 / ((param0 - 58) / 50);
        if (!(this.field_G == this.field_C)) {
            var3 = this.field_G <= this.field_C ? this.field_G : this.field_C;
            var4 = this.field_C < this.field_G ? this.field_G : this.field_C;
            this.field_G = var3;
            this.field_C = var3;
            this.field_m = this.field_m.substring(0, var3) + this.field_m.substring(var4, this.field_m.length());
            this.l(121);
        }
    }

    private final void j(int param0) {
        if (param0 < 59) {
            this.i((byte) 122);
        }
        if (this.field_t instanceof wm) {
            ((wm) ((Object) this.field_t)).a((tk) (this), (byte) -124);
        }
    }

    private final void a(boolean param0) {
        uj var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        fe var9 = null;
        var8 = Torquing.field_u;
        if (!this.field_J) {
          this.field_j = 0;
          this.field_v = 0;
          return;
        } else {
          if (this.field_q instanceof fe) {
            var9 = (fe) ((Object) this.field_q);
            var3 = var9.b((byte) 105, (gm) (this));
            var4 = var3.a(param0);
            var5 = var9.b((gm) (this), -1);
            var6 = var9.a(false) >> -607291775;
            if (var4 < -var6 + var5) {
              this.field_v = 0;
              this.field_j = 0;
              return;
            } else {
              L0: {
                var7 = this.field_j + var3.a(this.field_G, (byte) -126);
                if (var7 > var5 + -var6) {
                  this.field_j = this.field_j - (-var5 + var6) - var7;
                  break L0;
                } else {
                  if (var7 >= var6) {
                    break L0;
                  } else {
                    this.field_j = this.field_j + var6 + -var7;
                    break L0;
                  }
                }
              }
              L1: {
                if (-1 <= (this.field_j ^ -1)) {
                  if (this.field_j < var6 + -var5) {
                    this.field_j = var6 + -var5;
                    break L1;
                  } else {
                    break L1;
                  }
                } else {
                  this.field_j = 0;
                  break L1;
                }
              }
              return;
            }
          } else {
            return;
          }
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int[] param6, int param7, byte param8) {
        RuntimeException var9 = null;
        int var9_int = 0;
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
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        RuntimeException stackIn_75_0 = null;
        StringBuilder stackIn_75_1 = null;
        RuntimeException stackIn_76_0 = null;
        StringBuilder stackIn_76_1 = null;
        String stackIn_76_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_73_0 = null;
        StringBuilder stackOut_73_1 = null;
        RuntimeException stackOut_75_0 = null;
        StringBuilder stackOut_75_1 = null;
        String stackOut_75_2 = null;
        RuntimeException stackOut_74_0 = null;
        StringBuilder stackOut_74_1 = null;
        String stackOut_74_2 = null;
        var19 = Torquing.field_u;
        try {
          L0: {
            L1: {
              if ((param1 ^ -1) > -1) {
                break L1;
              } else {
                if (param3 < be.field_f) {
                  if (param8 >= 113) {
                    L2: {
                      if (0 <= param0) {
                        break L2;
                      } else {
                        if (param4 >= 0) {
                          break L2;
                        } else {
                          if (0 <= param7) {
                            break L2;
                          } else {
                            decompiledRegionSelector0 = 2;
                            break L0;
                          }
                        }
                      }
                    }
                    L3: {
                      if (be.field_p > param0) {
                        break L3;
                      } else {
                        if (be.field_p > param4) {
                          break L3;
                        } else {
                          if (be.field_p > param7) {
                            break L3;
                          } else {
                            decompiledRegionSelector0 = 3;
                            break L0;
                          }
                        }
                      }
                    }
                    L4: {
                      var14 = -param3 + param1;
                      if (param3 != param5) {
                        L5: {
                          var10 = param0 << -285005520;
                          var9_int = param0 << -285005520;
                          var15 = -param3 + param5;
                          var11 = (-param0 + param4 << -1838223984) / var15;
                          var12 = (-param0 + param7 << -1546429328) / var14;
                          if (var12 > var11) {
                            var13 = 0;
                            break L5;
                          } else {
                            var16 = var11;
                            var11 = var12;
                            var12 = var16;
                            var13 = 1;
                            break L5;
                          }
                        }
                        L6: {
                          L7: {
                            if (param3 >= 0) {
                              break L7;
                            } else {
                              if (0 > param5) {
                                param3 = param5 + -param3;
                                var9_int = var9_int + var11 * param3;
                                var10 = var10 + var12 * param3;
                                param3 = param5;
                                break L6;
                              } else {
                                param3 = -param3;
                                var9_int = var9_int + var11 * param3;
                                var10 = var10 + var12 * param3;
                                param3 = 0;
                                break L7;
                              }
                            }
                          }
                          var16 = be.field_n[param3];
                          L8: while (true) {
                            if (param3 >= param5) {
                              break L6;
                            } else {
                              L9: {
                                var17 = var9_int >> 1982585264;
                                if (be.field_p <= var17) {
                                  break L9;
                                } else {
                                  var18 = -(var9_int >> -610765008) + (var10 >> -599745488);
                                  if (0 != var18) {
                                    L10: {
                                      if (be.field_p > var17 - -var18) {
                                        break L10;
                                      } else {
                                        var18 = -1 + (be.field_p - var17);
                                        break L10;
                                      }
                                    }
                                    if (-1 >= (var17 ^ -1)) {
                                      tm.a(var18, var16 + var17, -98, param6, param2);
                                      break L9;
                                    } else {
                                      tm.a(var18 - -var17, var16, -114, param6, param2);
                                      break L9;
                                    }
                                  } else {
                                    if ((var17 ^ -1) > -1) {
                                      break L9;
                                    } else {
                                      if (var17 >= be.field_p) {
                                        break L9;
                                      } else {
                                        tm.a(var18, var17 - -var16, -104, param6, param2);
                                        break L9;
                                      }
                                    }
                                  }
                                }
                              }
                              param3++;
                              if (be.field_f > param3) {
                                var9_int = var9_int + var11;
                                var16 = var16 + ph.field_j;
                                var10 = var10 + var12;
                                continue L8;
                              } else {
                                decompiledRegionSelector0 = 4;
                                break L0;
                              }
                            }
                          }
                        }
                        var16 = -param5 + param1;
                        if (0 != var16) {
                          L11: {
                            var17 = param7 << 1460410320;
                            if (var13 == 0) {
                              var9_int = param4 << -1353075280;
                              break L11;
                            } else {
                              var10 = param4 << -1843624688;
                              break L11;
                            }
                          }
                          var12 = (var17 - var10) / var16;
                          var11 = (-var9_int + var17) / var16;
                          break L4;
                        } else {
                          var12 = 0;
                          var11 = 0;
                          break L4;
                        }
                      } else {
                        L12: {
                          if (param1 != param3) {
                            var15 = -param5 + param1;
                            if (param0 < param4) {
                              var10 = param4 << 1383135312;
                              var12 = (param7 - param4 << 1927786832) / var15;
                              var9_int = param0 << -1664006000;
                              var11 = (param7 - param0 << -157038608) / var14;
                              break L12;
                            } else {
                              var11 = (param7 - param4 << 961557744) / var15;
                              var12 = (param7 - param0 << -236656752) / var14;
                              var10 = param0 << -1712140560;
                              var9_int = param4 << 860385008;
                              break L12;
                            }
                          } else {
                            var10 = param4 << 8450896;
                            var11 = 0;
                            var12 = 0;
                            var9_int = param0 << 460012624;
                            break L12;
                          }
                        }
                        L13: {
                          if ((param3 ^ -1) <= -1) {
                            break L13;
                          } else {
                            param3 = Math.min(-param3, param5 - param3);
                            var9_int = var9_int + param3 * var11;
                            var10 = var10 + var12 * param3;
                            param3 = 0;
                            break L13;
                          }
                        }
                        var13 = 0;
                        break L4;
                      }
                    }
                    L14: {
                      if (-1 < (param3 ^ -1)) {
                        param3 = -param3;
                        var9_int = var9_int + param3 * var11;
                        var10 = var10 + param3 * var12;
                        param3 = 0;
                        break L14;
                      } else {
                        break L14;
                      }
                    }
                    var15 = be.field_n[param3];
                    L15: while (true) {
                      if (param1 <= param3) {
                        decompiledRegionSelector0 = 5;
                        break L0;
                      } else {
                        L16: {
                          var16 = var9_int >> 485434512;
                          if (be.field_p <= var16) {
                            break L16;
                          } else {
                            var17 = (var10 >> -2009257072) - (var9_int >> -1961568048);
                            if (0 == var17) {
                              if (var16 < 0) {
                                break L16;
                              } else {
                                if (var16 >= be.field_p) {
                                  break L16;
                                } else {
                                  tm.a(var17, var16 - -var15, -98, param6, param2);
                                  break L16;
                                }
                              }
                            } else {
                              L17: {
                                if (var17 + var16 < be.field_p) {
                                  break L17;
                                } else {
                                  var17 = be.field_p + -var16 + -1;
                                  break L17;
                                }
                              }
                              if (0 <= var16) {
                                tm.a(var17, var16 + var15, -114, param6, param2);
                                break L16;
                              } else {
                                tm.a(var17 + var16, var15, -123, param6, param2);
                                break L16;
                              }
                            }
                          }
                        }
                        param3++;
                        if (param3 >= be.field_f) {
                          decompiledRegionSelector0 = 6;
                          break L0;
                        } else {
                          var9_int = var9_int + var11;
                          var10 = var10 + var12;
                          var15 = var15 + ph.field_j;
                          continue L15;
                        }
                      }
                    }
                  } else {
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                } else {
                  break L1;
                }
              }
            }
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L18: {
            var9 = decompiledCaughtException;
            stackOut_73_0 = (RuntimeException) (var9);
            stackOut_73_1 = new StringBuilder().append("tk.BB(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
            stackIn_75_0 = stackOut_73_0;
            stackIn_75_1 = stackOut_73_1;
            stackIn_74_0 = stackOut_73_0;
            stackIn_74_1 = stackOut_73_1;
            if (param6 == null) {
              stackOut_75_0 = (RuntimeException) ((Object) stackIn_75_0);
              stackOut_75_1 = (StringBuilder) ((Object) stackIn_75_1);
              stackOut_75_2 = "null";
              stackIn_76_0 = stackOut_75_0;
              stackIn_76_1 = stackOut_75_1;
              stackIn_76_2 = stackOut_75_2;
              break L18;
            } else {
              stackOut_74_0 = (RuntimeException) ((Object) stackIn_74_0);
              stackOut_74_1 = (StringBuilder) ((Object) stackIn_74_1);
              stackOut_74_2 = "{...}";
              stackIn_76_0 = stackOut_74_0;
              stackIn_76_1 = stackOut_74_1;
              stackIn_76_2 = stackOut_74_2;
              break L18;
            }
          }
          throw rb.a((Throwable) ((Object) stackIn_76_0), stackIn_76_2 + ',' + param7 + ',' + param8 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return;
                  } else {
                    return;
                  }
                }
              }
            }
          }
        }
    }

    final void a(boolean param0, String param1, boolean param2) {
        int dupTemp$2 = 0;
        int var4_int = 0;
        RuntimeException var4 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == null) {
                param1 = "";
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (param2) {
                break L2;
              } else {
                this.field_F = false;
                break L2;
              }
            }
            L3: {
              this.field_m = param1;
              var4_int = param1.length();
              if (this.field_I == -1) {
                break L3;
              } else {
                if (var4_int > this.field_I) {
                  this.field_m = this.field_m.substring(0, this.field_I);
                  break L3;
                } else {
                  break L3;
                }
              }
            }
            L4: {
              dupTemp$2 = this.field_m.length();
              this.field_C = dupTemp$2;
              this.field_G = dupTemp$2;
              if (param0) {
                break L4;
              } else {
                this.l(-120);
                break L4;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) (var4);
            stackOut_12_1 = new StringBuilder().append("tk.TA(").append(param0).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param1 == null) {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L5;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L5;
            }
          }
          throw rb.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param2 + ')');
        }
    }

    final static void a(int param0, int param1, int param2, int param3, boolean param4) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var10 = Torquing.field_u;
        try {
          L0: {
            L1: {
              ph.b(param1, param0, 1 + param3, 10000536);
              ph.b(param1, param0 - -param2, 1 + param3, 12105912);
              var5_int = 1;
              var6 = param2;
              if (var5_int + param0 >= ph.field_c) {
                break L1;
              } else {
                var5_int = -param0 + ph.field_c;
                break L1;
              }
            }
            L2: {
              if (param0 - -var6 <= ph.field_h) {
                break L2;
              } else {
                var6 = -param0 + ph.field_h;
                break L2;
              }
            }
            if (!param4) {
              var7 = var5_int;
              L3: while (true) {
                if (var6 <= var7) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  var8 = 152 - -(var7 * 48 / param2);
                  var9 = var8 << -1416118936 | var8 << -1092572368 | var8;
                  ph.field_e[param1 + ph.field_j * (param0 + var7)] = var9;
                  ph.field_e[param3 + param1 + (param0 - -var7) * ph.field_j] = var9;
                  var7++;
                  continue L3;
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw rb.a((Throwable) ((Object) var5), "tk.OA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    tk(String param0, ca param1, int param2) {
        super(param0, param1);
        this.field_E = 0L;
        this.field_F = false;
        this.field_D = -1;
        try {
            this.field_q = ah.field_c.field_g;
            this.field_I = param2;
            this.a(true, param0, true);
            this.field_J = true;
            this.field_H = km.b(-1);
        } catch (RuntimeException runtimeException) {
            throw rb.a((Throwable) ((Object) runtimeException), "tk.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    private final String n(int param0) {
        int var2 = 0;
        int var3 = 0;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        if (param0 != 1) {
          return (String) null;
        } else {
          L0: {
            if (this.field_G <= this.field_C) {
              stackOut_3_0 = this.field_G;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_2_0 = this.field_C;
              stackIn_4_0 = stackOut_2_0;
              break L0;
            }
          }
          L1: {
            var2 = stackIn_4_0;
            if (this.field_C < this.field_G) {
              stackOut_6_0 = this.field_G;
              stackIn_7_0 = stackOut_6_0;
              break L1;
            } else {
              stackOut_5_0 = this.field_C;
              stackIn_7_0 = stackOut_5_0;
              break L1;
            }
          }
          var3 = stackIn_7_0;
          return this.field_m.substring(var2, var3);
        }
    }

    private final int a(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var4 = Torquing.field_u;
        var2 = this.field_m.length();
        if (var2 == this.field_G) {
          return this.field_G;
        } else {
          var3 = this.field_G + 1;
          L0: while (true) {
            L1: {
              if (var2 <= var3) {
                break L1;
              } else {
                if (this.field_m.charAt(var3 + -1) == 32) {
                  break L1;
                } else {
                  var3++;
                  continue L0;
                }
              }
            }
            if (param0 <= 45) {
              return 26;
            } else {
              return var3;
            }
          }
        }
    }

    void a(int param0, gm param1, int param2, int param3) {
        fe var7 = null;
        int var6 = 0;
        try {
            super.a(124, param1, param2, param3);
            this.a(true);
            if (-2 == (this.field_l ^ -1)) {
                if (!(!(this.field_q instanceof fe))) {
                    var7 = (fe) ((Object) this.field_q);
                    var6 = var7.a(k.field_e, -1, (gm) (this), n.field_t, param2, param3);
                    if ((var6 ^ -1) != 0) {
                        if (this.field_F) {
                            if (this.field_D > var6) {
                                if (this.field_C < var6) {
                                    var6 = this.field_D;
                                }
                            }
                        }
                        this.field_G = var6;
                    }
                }
                this.field_H = km.b(-1);
            }
            int var5_int = -127 / ((-28 - param0) / 43);
        } catch (RuntimeException runtimeException) {
            throw rb.a((Throwable) ((Object) runtimeException), "tk.P(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    final boolean a(int param0, gm param1, char param2, int param3) {
        int dupTemp$1 = 0;
        RuntimeException var5 = null;
        int var5_int = 0;
        int stackIn_4_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_14_0 = 0;
        Object stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        Object stackIn_22_0 = null;
        int stackIn_22_1 = 0;
        Object stackIn_23_0 = null;
        int stackIn_23_1 = 0;
        int stackIn_23_2 = 0;
        int stackIn_24_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_37_0 = 0;
        int stackIn_41_0 = 0;
        int stackIn_45_0 = 0;
        Object stackIn_48_0 = null;
        int stackIn_48_1 = 0;
        Object stackIn_49_0 = null;
        int stackIn_49_1 = 0;
        Object stackIn_50_0 = null;
        int stackIn_50_1 = 0;
        int stackIn_50_2 = 0;
        int stackIn_51_0 = 0;
        int stackIn_53_0 = 0;
        int stackIn_56_0 = 0;
        int stackIn_60_0 = 0;
        int stackIn_71_0 = 0;
        int stackIn_73_0 = 0;
        RuntimeException stackIn_75_0 = null;
        StringBuilder stackIn_75_1 = null;
        RuntimeException stackIn_76_0 = null;
        StringBuilder stackIn_76_1 = null;
        RuntimeException stackIn_77_0 = null;
        StringBuilder stackIn_77_1 = null;
        String stackIn_77_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_70_0 = 0;
        int stackOut_59_0 = 0;
        int stackOut_55_0 = 0;
        int stackOut_52_0 = 0;
        Object stackOut_47_0 = null;
        int stackOut_47_1 = 0;
        Object stackOut_49_0 = null;
        int stackOut_49_1 = 0;
        int stackOut_49_2 = 0;
        Object stackOut_48_0 = null;
        int stackOut_48_1 = 0;
        int stackOut_48_2 = 0;
        int stackOut_50_0 = 0;
        int stackOut_36_0 = 0;
        int stackOut_40_0 = 0;
        int stackOut_44_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_26_0 = 0;
        Object stackOut_20_0 = null;
        int stackOut_20_1 = 0;
        Object stackOut_22_0 = null;
        int stackOut_22_1 = 0;
        int stackOut_22_2 = 0;
        Object stackOut_21_0 = null;
        int stackOut_21_1 = 0;
        int stackOut_21_2 = 0;
        int stackOut_23_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_72_0 = 0;
        RuntimeException stackOut_74_0 = null;
        StringBuilder stackOut_74_1 = null;
        RuntimeException stackOut_76_0 = null;
        StringBuilder stackOut_76_1 = null;
        String stackOut_76_2 = null;
        RuntimeException stackOut_75_0 = null;
        StringBuilder stackOut_75_1 = null;
        String stackOut_75_2 = null;
        try {
          L0: {
            this.field_H = km.b(-1);
            if (param2 == 60) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (62 != param2) {
                L1: {
                  if (param2 < 32) {
                    break L1;
                  } else {
                    if (param2 <= 126) {
                      L2: {
                        if (this.field_G == this.field_C) {
                          break L2;
                        } else {
                          this.f((byte) 127);
                          break L2;
                        }
                      }
                      L3: {
                        L4: {
                          if ((this.field_I ^ -1) == 0) {
                            break L4;
                          } else {
                            if (this.field_m.length() < this.field_I) {
                              break L4;
                            } else {
                              break L3;
                            }
                          }
                        }
                        L5: {
                          if (this.field_G < this.field_m.length()) {
                            this.field_m = this.field_m.substring(0, this.field_G) + param2 + this.field_m.substring(this.field_G, this.field_m.length());
                            this.field_G = this.field_G + 1;
                            this.field_C = this.field_G;
                            break L5;
                          } else {
                            this.field_m = this.field_m + param2;
                            dupTemp$1 = this.field_m.length();
                            this.field_G = dupTemp$1;
                            this.field_C = dupTemp$1;
                            break L5;
                          }
                        }
                        this.l(106);
                        break L3;
                      }
                      stackOut_70_0 = 1;
                      stackIn_71_0 = stackOut_70_0;
                      decompiledRegionSelector0 = 14;
                      break L0;
                    } else {
                      break L1;
                    }
                  }
                }
                L6: {
                  if ((param0 ^ -1) != -86) {
                    if (-102 == (param0 ^ -1)) {
                      if (this.field_G == this.field_C) {
                        if (this.field_G < this.field_m.length()) {
                          this.field_C = this.field_G + 1;
                          this.f((byte) -1);
                          stackOut_59_0 = 1;
                          stackIn_60_0 = stackOut_59_0;
                          decompiledRegionSelector0 = 13;
                          break L0;
                        } else {
                          break L6;
                        }
                      } else {
                        this.f((byte) 119);
                        stackOut_55_0 = 1;
                        stackIn_56_0 = stackOut_55_0;
                        decompiledRegionSelector0 = 12;
                        break L0;
                      }
                    } else {
                      if (param0 == 13) {
                        this.i((byte) 88);
                        stackOut_52_0 = 1;
                        stackIn_53_0 = stackOut_52_0;
                        decompiledRegionSelector0 = 11;
                        break L0;
                      } else {
                        if (param0 == 96) {
                          if (this.field_G <= 0) {
                            break L6;
                          } else {
                            L7: {
                              stackOut_47_0 = this;
                              stackOut_47_1 = -84;
                              stackIn_49_0 = stackOut_47_0;
                              stackIn_49_1 = stackOut_47_1;
                              stackIn_48_0 = stackOut_47_0;
                              stackIn_48_1 = stackOut_47_1;
                              if (!i.field_P[82]) {
                                stackOut_49_0 = this;
                                stackOut_49_1 = stackIn_49_1;
                                stackOut_49_2 = this.field_G - 1;
                                stackIn_50_0 = stackOut_49_0;
                                stackIn_50_1 = stackOut_49_1;
                                stackIn_50_2 = stackOut_49_2;
                                break L7;
                              } else {
                                stackOut_48_0 = this;
                                stackOut_48_1 = stackIn_48_1;
                                stackOut_48_2 = this.g((byte) -127);
                                stackIn_50_0 = stackOut_48_0;
                                stackIn_50_1 = stackOut_48_1;
                                stackIn_50_2 = stackOut_48_2;
                                break L7;
                              }
                            }
                            this.a((byte) stackIn_50_1, stackIn_50_2);
                            stackOut_50_0 = 1;
                            stackIn_51_0 = stackOut_50_0;
                            decompiledRegionSelector0 = 10;
                            break L0;
                          }
                        } else {
                          if ((param0 ^ -1) != -98) {
                            if (-103 != (param0 ^ -1)) {
                              if ((param0 ^ -1) != -104) {
                                if (84 != param0) {
                                  L8: {
                                    if (!i.field_P[82]) {
                                      break L8;
                                    } else {
                                      if (param0 != 65) {
                                        break L8;
                                      } else {
                                        this.m(-1);
                                        stackOut_36_0 = 1;
                                        stackIn_37_0 = stackOut_36_0;
                                        decompiledRegionSelector0 = 7;
                                        break L0;
                                      }
                                    }
                                  }
                                  L9: {
                                    if (!i.field_P[82]) {
                                      break L9;
                                    } else {
                                      if ((param0 ^ -1) != -67) {
                                        break L9;
                                      } else {
                                        this.h((byte) 102);
                                        stackOut_40_0 = 1;
                                        stackIn_41_0 = stackOut_40_0;
                                        decompiledRegionSelector0 = 8;
                                        break L0;
                                      }
                                    }
                                  }
                                  if (!i.field_P[82]) {
                                    break L6;
                                  } else {
                                    if (param0 != 67) {
                                      break L6;
                                    } else {
                                      this.k(-121);
                                      stackOut_44_0 = 1;
                                      stackIn_45_0 = stackOut_44_0;
                                      decompiledRegionSelector0 = 9;
                                      break L0;
                                    }
                                  }
                                } else {
                                  this.j(123);
                                  stackOut_32_0 = 1;
                                  stackIn_33_0 = stackOut_32_0;
                                  decompiledRegionSelector0 = 6;
                                  break L0;
                                }
                              } else {
                                this.a((byte) -78, this.field_m.length());
                                stackOut_29_0 = 1;
                                stackIn_30_0 = stackOut_29_0;
                                decompiledRegionSelector0 = 5;
                                break L0;
                              }
                            } else {
                              this.a((byte) -62, 0);
                              stackOut_26_0 = 1;
                              stackIn_27_0 = stackOut_26_0;
                              decompiledRegionSelector0 = 4;
                              break L0;
                            }
                          } else {
                            if (this.field_G >= this.field_m.length()) {
                              break L6;
                            } else {
                              L10: {
                                stackOut_20_0 = this;
                                stackOut_20_1 = -49;
                                stackIn_22_0 = stackOut_20_0;
                                stackIn_22_1 = stackOut_20_1;
                                stackIn_21_0 = stackOut_20_0;
                                stackIn_21_1 = stackOut_20_1;
                                if (!i.field_P[82]) {
                                  stackOut_22_0 = this;
                                  stackOut_22_1 = stackIn_22_1;
                                  stackOut_22_2 = this.field_G + 1;
                                  stackIn_23_0 = stackOut_22_0;
                                  stackIn_23_1 = stackOut_22_1;
                                  stackIn_23_2 = stackOut_22_2;
                                  break L10;
                                } else {
                                  stackOut_21_0 = this;
                                  stackOut_21_1 = stackIn_21_1;
                                  stackOut_21_2 = this.a((byte) 74);
                                  stackIn_23_0 = stackOut_21_0;
                                  stackIn_23_1 = stackOut_21_1;
                                  stackIn_23_2 = stackOut_21_2;
                                  break L10;
                                }
                              }
                              this.a((byte) stackIn_23_1, stackIn_23_2);
                              stackOut_23_0 = 1;
                              stackIn_24_0 = stackOut_23_0;
                              decompiledRegionSelector0 = 3;
                              break L0;
                            }
                          }
                        }
                      }
                    }
                  } else {
                    if (this.field_G != this.field_C) {
                      this.f((byte) 125);
                      stackOut_13_0 = 1;
                      stackIn_14_0 = stackOut_13_0;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    } else {
                      if (-1 <= (this.field_G ^ -1)) {
                        break L6;
                      } else {
                        this.field_C = this.field_G + -1;
                        this.f((byte) -106);
                        stackOut_11_0 = 1;
                        stackIn_12_0 = stackOut_11_0;
                        decompiledRegionSelector0 = 1;
                        break L0;
                      }
                    }
                  }
                }
                var5_int = -27 / ((param3 - -33) / 57);
                stackOut_72_0 = 0;
                stackIn_73_0 = stackOut_72_0;
                decompiledRegionSelector0 = 15;
                break L0;
              } else {
                return false;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var5 = decompiledCaughtException;
            stackOut_74_0 = (RuntimeException) (var5);
            stackOut_74_1 = new StringBuilder().append("tk.D(").append(param0).append(',');
            stackIn_76_0 = stackOut_74_0;
            stackIn_76_1 = stackOut_74_1;
            stackIn_75_0 = stackOut_74_0;
            stackIn_75_1 = stackOut_74_1;
            if (param1 == null) {
              stackOut_76_0 = (RuntimeException) ((Object) stackIn_76_0);
              stackOut_76_1 = (StringBuilder) ((Object) stackIn_76_1);
              stackOut_76_2 = "null";
              stackIn_77_0 = stackOut_76_0;
              stackIn_77_1 = stackOut_76_1;
              stackIn_77_2 = stackOut_76_2;
              break L11;
            } else {
              stackOut_75_0 = (RuntimeException) ((Object) stackIn_75_0);
              stackOut_75_1 = (StringBuilder) ((Object) stackIn_75_1);
              stackOut_75_2 = "{...}";
              stackIn_77_0 = stackOut_75_0;
              stackIn_77_1 = stackOut_75_1;
              stackIn_77_2 = stackOut_75_2;
              break L11;
            }
          }
          throw rb.a((Throwable) ((Object) stackIn_77_0), stackIn_77_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_12_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_14_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_24_0 != 0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_27_0 != 0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_30_0 != 0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_33_0 != 0;
                    } else {
                      if (decompiledRegionSelector0 == 7) {
                        return stackIn_37_0 != 0;
                      } else {
                        if (decompiledRegionSelector0 == 8) {
                          return stackIn_41_0 != 0;
                        } else {
                          if (decompiledRegionSelector0 == 9) {
                            return stackIn_45_0 != 0;
                          } else {
                            if (decompiledRegionSelector0 == 10) {
                              return stackIn_51_0 != 0;
                            } else {
                              if (decompiledRegionSelector0 == 11) {
                                return stackIn_53_0 != 0;
                              } else {
                                if (decompiledRegionSelector0 == 12) {
                                  return stackIn_56_0 != 0;
                                } else {
                                  if (decompiledRegionSelector0 == 13) {
                                    return stackIn_60_0 != 0;
                                  } else {
                                    if (decompiledRegionSelector0 == 14) {
                                      return stackIn_71_0 != 0;
                                    } else {
                                      return stackIn_73_0 != 0;
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
            }
          }
        }
    }

    private final void h(byte param0) {
        try {
            String var2 = null;
            if (param0 < 91) {
              return;
            } else {
              L0: {
                var2 = this.n(1);
                if (0 < var2.length()) {
                  java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().setContents((java.awt.datatransfer.Transferable) ((Object) new java.awt.datatransfer.StringSelection(this.n(1))), (java.awt.datatransfer.ClipboardOwner) null);
                  break L0;
                } else {
                  break L0;
                }
              }
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(int param0, byte param1, int param2, int param3) {
        fe var9 = null;
        long var6 = 0L;
        if (param1 >= -7) {
            int[] var8 = (int[]) null;
            tk.a(-25, -56, 58, 91, 83, 87, (int[]) null, 74, (byte) 44);
        }
        if (null != this.field_q) {
            if (!(-1 != (param0 ^ -1))) {
                this.field_q.a(114, param2, param3, this.field_x, (gm) (this));
                if (this.field_q instanceof fe) {
                    var9 = (fe) ((Object) this.field_q);
                    if (!(this.field_G == this.field_C)) {
                        var9.a(param3, this.field_G, this.field_C, -1419356520, param2, (gm) (this));
                    }
                    var6 = km.b(-1);
                    if (!((-this.field_H + var6) % 1000L >= 500L)) {
                        var9.a(param3, (gm) (this), this.field_G, false, param2);
                    }
                }
            }
        }
    }

    private final void a(byte param0, int param1) {
        if (param0 > -25) {
            return;
        }
        this.field_G = param1;
        if (!i.field_P[81]) {
            this.field_C = this.field_G;
        }
    }

    final boolean a(int param0, int param1, int param2, int param3, int param4, gm param5, byte param6) {
        RuntimeException var8 = null;
        int var8_int = 0;
        long var8_long = 0L;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        Object stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        int stackIn_6_2 = 0;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        Object stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        int stackIn_16_0 = 0;
        int stackIn_20_0 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        int stackOut_5_2 = 0;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        int stackOut_4_2 = 0;
        Object stackOut_6_0 = null;
        Object stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        int stackOut_15_0 = 0;
        int stackOut_19_0 = 0;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        try {
          L0: {
            L1: {
              if (super.a(param0, param1, param2, param3, param4, param5, (byte) 70)) {
                if (!(this.field_q instanceof fe)) {
                  break L1;
                } else {
                  L2: {
                    var8_int = ((fe) ((Object) this.field_q)).a(k.field_e, -1, (gm) (this), n.field_t, param2, param1);
                    stackOut_3_0 = this;
                    stackOut_3_1 = -94;
                    stackIn_5_0 = stackOut_3_0;
                    stackIn_5_1 = stackOut_3_1;
                    stackIn_4_0 = stackOut_3_0;
                    stackIn_4_1 = stackOut_3_1;
                    if ((var8_int ^ -1) != 0) {
                      stackOut_5_0 = this;
                      stackOut_5_1 = stackIn_5_1;
                      stackOut_5_2 = var8_int;
                      stackIn_6_0 = stackOut_5_0;
                      stackIn_6_1 = stackOut_5_1;
                      stackIn_6_2 = stackOut_5_2;
                      break L2;
                    } else {
                      stackOut_4_0 = this;
                      stackOut_4_1 = stackIn_4_1;
                      stackOut_4_2 = 0;
                      stackIn_6_0 = stackOut_4_0;
                      stackIn_6_1 = stackOut_4_1;
                      stackIn_6_2 = stackOut_4_2;
                      break L2;
                    }
                  }
                  L3: {
                    this.a((byte) stackIn_6_1, stackIn_6_2);
                    var8_long = km.b(-1);
                    stackOut_6_0 = this;
                    stackIn_8_0 = stackOut_6_0;
                    stackIn_7_0 = stackOut_6_0;
                    if (-251L >= (-this.field_E + var8_long ^ -1L)) {
                      stackOut_8_0 = this;
                      stackOut_8_1 = 0;
                      stackIn_9_0 = stackOut_8_0;
                      stackIn_9_1 = stackOut_8_1;
                      break L3;
                    } else {
                      stackOut_7_0 = this;
                      stackOut_7_1 = 1;
                      stackIn_9_0 = stackOut_7_0;
                      stackIn_9_1 = stackOut_7_1;
                      break L3;
                    }
                  }
                  L4: {
                    ((tk) (this)).field_F = stackIn_9_1 != 0;
                    if (!this.field_F) {
                      break L4;
                    } else {
                      L5: {
                        this.field_C = this.g((byte) -122);
                        this.field_G = this.a((byte) 88);
                        if (this.field_G <= 0) {
                          break L5;
                        } else {
                          if (this.field_m.charAt(-1 + this.field_G) == 32) {
                            this.field_G = this.field_G - 1;
                            break L5;
                          } else {
                            break L5;
                          }
                        }
                      }
                      this.field_D = this.field_G;
                      break L4;
                    }
                  }
                  this.field_E = var8_long;
                  stackOut_15_0 = 1;
                  stackIn_16_0 = stackOut_15_0;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              } else {
                break L1;
              }
            }
            if (param6 >= 5) {
              stackOut_19_0 = 0;
              stackIn_20_0 = stackOut_19_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              this.field_D = -86;
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var8 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) (var8);
            stackOut_21_1 = new StringBuilder().append("tk.KA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param5 == null) {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L6;
            } else {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L6;
            }
          }
          throw rb.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_16_0 != 0;
        } else {
          return stackIn_20_0 != 0;
        }
    }

    final void i(byte param0) {
        if (param0 <= 45) {
            this.field_I = -75;
        }
        this.field_m = "";
        this.field_C = 0;
        this.field_G = 0;
        this.l(-102);
    }

    private final void m(int param0) {
        this.h((byte) 111);
        if (param0 != -1) {
            return;
        }
        this.f((byte) 120);
    }

    void l(int param0) {
        int var2 = -107 % ((param0 - -17) / 63);
        if (!(!(this.field_t instanceof wm))) {
            ((wm) ((Object) this.field_t)).a(88, (tk) (this));
        }
    }

    private final void a(int param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            L1: {
              if (-1 == this.field_I) {
                break L1;
              } else {
                var3_int = this.field_I + -this.field_m.length();
                if (var3_int >= 0) {
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  param1 = param1.substring(0, var3_int);
                  break L1;
                }
              }
            }
            L2: {
              if (this.field_G == this.field_m.length()) {
                this.field_m = this.field_m + param1;
                break L2;
              } else {
                this.field_m = this.field_m.substring(0, this.field_G) + param1 + this.field_m.substring(this.field_G, this.field_m.length());
                break L2;
              }
            }
            L3: {
              this.field_G = this.field_G + param1.length();
              this.field_C = this.field_G;
              this.l(param0 ^ -97);
              if (param0 == 0) {
                break L3;
              } else {
                this.field_C = -100;
                break L3;
              }
            }
            decompiledRegionSelector0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) (var3);
            stackOut_11_1 = new StringBuilder().append("tk.RA(").append(param0).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L4;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L4;
            }
          }
          throw rb.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final void k(int param0) {
        try {
            String var2 = null;
            Exception var2_ref = null;
            int var3 = 0;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                var2 = (String) (java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().getContents((Object) null).getTransferData(java.awt.datatransfer.DataFlavor.stringFlavor));
                var3 = -109 / ((46 - param0) / 51);
                this.f((byte) -30);
                this.a(0, var2);
                break L0;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L1: {
                var2_ref = (Exception) (Object) decompiledCaughtException;
                break L1;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final int g(byte param0) {
        int var2 = 0;
        int var3 = 0;
        var3 = Torquing.field_u;
        if (this.field_G == 0) {
          return this.field_G;
        } else {
          var2 = this.field_G + -1;
          L0: while (true) {
            L1: {
              if (-1 <= (var2 ^ -1)) {
                break L1;
              } else {
                if (this.field_m.charAt(var2 - 1) == 32) {
                  break L1;
                } else {
                  var2--;
                  continue L0;
                }
              }
            }
            L2: {
              if (param0 <= -121) {
                break L2;
              } else {
                this.m(52);
                break L2;
              }
            }
            return var2;
          }
        }
    }

    static {
    }
}
