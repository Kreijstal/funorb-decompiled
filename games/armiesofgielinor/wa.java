/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wa extends ik {
    static String field_h;
    static String field_e;
    int field_f;
    int field_g;

    private final void a(int param0, ha param1) {
        jd var5 = null;
        try {
            var5 = param1.c(this.field_f, true, this.field_g);
            jd var3 = var5;
            if (param0 != 0) {
                ha var4 = (ha) null;
                this.b((byte) 119, (ha) null);
            }
            var5.field_P = uc.field_d[this.field_c][5];
            var5.field_o = uc.field_d[this.field_c][6];
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "wa.S(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, vh param1) {
        try {
            param1.b(true, this.field_c);
            param1.b(1, this.field_g);
            param1.b(1, this.field_f);
            if (param0 != -11637) {
                field_e = (String) null;
            }
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "wa.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private final void d(byte param0, ha param1) {
        int var4 = 0;
        jd var5 = null;
        jd var6 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 < -100) {
                break L1;
              } else {
                this.field_f = 58;
                break L1;
              }
            }
            L2: {
              var5 = param1.c(this.field_f, true, this.field_g);
              var6 = var5;
              if (-8 == (uc.field_d[this.field_c][6] ^ -1)) {
                var5.field_I = true;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (uc.field_d[this.field_c][6] != 16) {
                break L3;
              } else {
                if (-1 > (var6.field_cb ^ -1)) {
                  var6.field_cb = var6.field_cb - 1;
                  break L3;
                } else {
                  L4: {
                    L5: {
                      if (34 != var6.field_N) {
                        break L5;
                      } else {
                        if (var6.field_W) {
                          break L4;
                        } else {
                          break L5;
                        }
                      }
                    }
                    var6.field_s = false;
                    break L4;
                  }
                  if (74 != var6.field_N) {
                    var6.field_B = 1;
                    break L3;
                  } else {
                    var6.field_B = 2;
                    break L3;
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3 = decompiledCaughtException;
            stackIn_19_0 = (RuntimeException) (var3);

            stackIn_19_1 = new StringBuilder().append("wa.R(").append(param0).append(',');

            if (param1 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L6;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L6;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ')');
        }
    }

    private final void a(boolean param0, ha param1) {
        int var3_int = 0;
        int var4 = 0;
        ha var5 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0) {
                break L1;
              } else {
                var5 = (ha) null;
                this.a((ha) null, false);
                break L1;
              }
            }
            L2: {
              var3_int = uc.field_d[this.field_c][5];
              if (var3_int != 0) {
                if (var3_int != 64) {
                  this.b(true, param1);
                  break L2;
                } else {
                  this.c((byte) 78, param1);
                  break L2;
                }
              } else {
                this.d((byte) -106, param1);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var3);

            stackIn_13_1 = new StringBuilder().append("wa.M(").append(param0).append(',');

            if (param1 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L3;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L3;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
        }
    }

    private final void b(int param0, ha param1) {
        jd var5 = null;
        try {
            if (param0 <= 80) {
                ha var4 = (ha) null;
                this.a((ha) null, 28);
            }
            var5 = param1.c(this.field_f, true, this.field_g);
            jd var3 = var5;
            var5.field_r = uc.field_d[this.field_c][6] | uc.field_d[this.field_c][5] << -379528731;
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "wa.I(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private final void c(byte param0, ha param1) {
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        jd var6 = null;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var8 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == 78) {
                break L1;
              } else {
                field_h = (String) null;
                break L1;
              }
            }
            var3_int = uc.field_d[this.field_c][7];
            var4 = this.field_g + -var3_int;
            L2: while (true) {
              if (var4 > var3_int + this.field_g) {
                break L0;
              } else {
                var5 = -var3_int + this.field_f;
                L3: while (true) {
                  if (this.field_f + var3_int < var5) {
                    var4++;
                    continue L2;
                  } else {
                    L4: {
                      var6 = param1.c(var5, true, var4);
                      if (var6 != null) {
                        var7 = 0;
                        L5: while (true) {
                          if (uc.field_d[this.field_c][6] <= var7) {
                            var7 = 0;
                            L6: while (true) {
                              if (uc.field_d[this.field_c][6] >= var7) {
                                break L4;
                              } else {
                                param1.field_l.a(750, new st(var6, 4));
                                var7--;
                                continue L6;
                              }
                            }
                          } else {
                            param1.field_l.a(750, new st(var6, 6));
                            var7++;
                            continue L5;
                          }
                        }
                      } else {
                        break L4;
                      }
                    }
                    var5++;
                    continue L3;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3 = decompiledCaughtException;
            stackIn_20_0 = (RuntimeException) (var3);

            stackIn_20_1 = new StringBuilder().append("wa.N(").append(param0).append(',');

            if (param1 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L7;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L7;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ')');
        }
    }

    private final void b(boolean param0, ha param1) {
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        jd var6 = null;
        int var7 = 0;
        int var8 = 0;
        var8 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              var3_int = uc.field_d[this.field_c][7];
              if (param0) {
                break L1;
              } else {
                this.field_g = -123;
                break L1;
              }
            }
            var4 = this.field_g - var3_int;
            L2: while (true) {
              if (var3_int + this.field_g < var4) {
                break L0;
              } else {
                var5 = this.field_f + -var3_int;
                L3: while (true) {
                  if (var3_int + this.field_f < var5) {
                    var4++;
                    continue L2;
                  } else {
                    L4: {
                      var6 = param1.c(var5, true, var4);
                      if (var6 == null) {
                        break L4;
                      } else {
                        if ((uc.field_d[this.field_c][6] ^ -1) < -1) {
                          param1.field_l.a(750, new nw(var6, param1.a(var6, (byte) -128, uc.field_d[this.field_c][5], uc.field_d[this.field_c][6]), false));
                          break L4;
                        } else {
                          var7 = 0;
                          L5: while (true) {
                            if (var7 <= uc.field_d[this.field_c][6]) {
                              break L4;
                            } else {
                              param1.field_l.a(750, new st(var6, 1));
                              var7--;
                              continue L5;
                            }
                          }
                        }
                      }
                    }
                    var5++;
                    continue L3;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3 = decompiledCaughtException;
            stackIn_18_0 = (RuntimeException) (var3);

            stackIn_18_1 = new StringBuilder().append("wa.O(").append(param0).append(',');

            if (param1 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L6;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L6;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ')');
        }
    }

    final static void a(int param0, ok param1) {
        try {
            bd.a((byte) 111, new fj(param1));
            if (param0 < 8) {
                field_h = (String) null;
            }
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "wa.T(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private final void a(byte param0, int param1, ha param2) {
        RuntimeException stackIn_63_0 = null;
        StringBuilder stackIn_63_1 = null;
        RuntimeException stackIn_64_0 = null;
        StringBuilder stackIn_64_1 = null;
        String stackIn_64_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        ne var7_ref_ne = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              if (uc.field_d[this.field_c][5] == 5) {
                var4_int = uc.field_d[this.field_c][7];
                var5 = this.field_g - var4_int;
                L2: while (true) {
                  if (var4_int + this.field_g < var5) {
                    break L1;
                  } else {
                    L3: {
                      if (-1 >= (var5 ^ -1)) {
                        if (param2.field_v > var5) {
                          var6 = -var4_int + this.field_f;
                          L4: while (true) {
                            if (var6 > this.field_f + var4_int) {
                              break L3;
                            } else {
                              L5: {
                                if ((var6 ^ -1) <= -1) {
                                  if (var6 >= param2.field_db) {
                                    break L3;
                                  } else {
                                    var7_ref_ne = param2.field_Eb[var5 + param2.field_v * var6];
                                    var7_ref_ne.b(true, param2.o(param1, -1));
                                    break L5;
                                  }
                                } else {
                                  break L5;
                                }
                              }
                              var6++;
                              continue L4;
                            }
                          }
                        } else {
                          break L1;
                        }
                      } else {
                        break L3;
                      }
                    }
                    var5++;
                    continue L2;
                  }
                }
              } else {
                break L1;
              }
            }
            L6: {
              if (uc.field_d[this.field_c][5] == 6) {
                var4_int = uc.field_d[this.field_c][7];
                var5 = this.field_g - var4_int;
                L7: while (true) {
                  if (this.field_g - -var4_int < var5) {
                    break L6;
                  } else {
                    L8: {
                      if (0 <= var5) {
                        if (param2.field_v > var5) {
                          var6 = this.field_f - var4_int;
                          L9: while (true) {
                            if (this.field_f + var4_int < var6) {
                              break L8;
                            } else {
                              L10: {
                                if (var6 >= 0) {
                                  if (param2.field_db > var6) {
                                    param2.a((byte) 86, param1, var6, var5);
                                    break L10;
                                  } else {
                                    break L8;
                                  }
                                } else {
                                  break L10;
                                }
                              }
                              var6++;
                              continue L9;
                            }
                          }
                        } else {
                          break L6;
                        }
                      } else {
                        break L8;
                      }
                    }
                    var5++;
                    continue L7;
                  }
                }
              } else {
                if (uc.field_d[this.field_c][5] == 3) {
                  var4_int = uc.field_d[this.field_c][7];
                  var5 = -var4_int + this.field_g;
                  L11: while (true) {
                    if (var4_int + this.field_g < var5) {
                      break L6;
                    } else {
                      var6 = this.field_f + -var4_int;
                      L12: while (true) {
                        if (var4_int + this.field_f < var6) {
                          var5++;
                          continue L11;
                        } else {
                          param2.b(var5, true, uc.field_d[this.field_c][6], param1, var6);
                          var6++;
                          continue L12;
                        }
                      }
                    }
                  }
                } else {
                  break L6;
                }
              }
            }
            L13: {
              if (uc.field_d[this.field_c][5] != 4) {
                break L13;
              } else {
                L14: {
                  var4_int = param2.a(this.field_f, 2056, this.field_g);
                  var5 = param2.g(this.field_f, -85, this.field_g);
                  var6 = this.field_g;
                  var7 = this.field_f;
                  var8 = 0;
                  var9 = 0;
                  var10 = var4_int;
                  if (1 != var10) {
                    if (2 == var10) {
                      var8 = 0;
                      var9 = 1;
                      break L14;
                    } else {
                      if (var10 == 3) {
                        var9 = 0;
                        var8 = -1;
                        break L14;
                      } else {
                        if (var10 == 0) {
                          var9 = 0;
                          var8 = 1;
                          break L14;
                        } else {
                          decompiledRegionSelector0 = 0;
                          break L0;
                        }
                      }
                    }
                  } else {
                    var9 = -1;
                    var8 = 0;
                    break L14;
                  }
                }
                L15: while (true) {
                  if (param2.g(var7, -85, var6) != var5) {
                    param2.b(var6, true, 1, param1, var7);
                    param2.b(this.field_g + -var8, true, 1, param1, this.field_f - var9);
                    break L13;
                  } else {
                    param2.b(var6, true, 10, param1, var7);
                    var7 = var7 + var9;
                    var6 = var6 + var8;
                    continue L15;
                  }
                }
              }
            }
            if (param0 == -100) {
              L16: {
                if (uc.field_d[this.field_c][5] != 7) {
                  break L16;
                } else {
                  param2.field_Eb[this.field_f * param2.field_v + this.field_g].field_a = -1;
                  param2.f(-2);
                  param2.b(param0 ^ -98);
                  break L16;
                }
              }
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L17: {
            var4 = decompiledCaughtException;
            stackIn_63_0 = (RuntimeException) (var4);

            stackIn_63_1 = new StringBuilder().append("wa.J(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_64_0 = (RuntimeException) ((Object) stackIn_63_0);
              stackIn_64_1 = (StringBuilder) ((Object) stackIn_63_1);
              stackIn_64_2 = "null";
              break L17;
            } else {
              stackIn_64_0 = (RuntimeException) ((Object) stackIn_63_0);
              stackIn_64_1 = (StringBuilder) ((Object) stackIn_63_1);
              stackIn_64_2 = "{...}";
              break L17;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_64_0), stackIn_64_2 + ')');
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

    final static int a(bv param0, int param1, int param2) {
        RuntimeException var3 = null;
        bv var4 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param2 == 1) {
                break L1;
              } else {
                var4 = (bv) null;
                wa.a((bv) null, 11, -12);
                break L1;
              }
            }
            stackIn_3_0 = (param0.g(param2 + -102, param1) ^ 1 << param1 - 1) + -(1 << param1 - 1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("wa.L(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_3_0;
    }

    final void a(int param0, ha param1, int param2) {
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        jd var4 = null;
        int var4_int = 0;
        RuntimeException var4_ref = null;
        int var5 = 0;
        int var6 = 0;
        var6 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              if (-1 != (uc.field_d[this.field_c][3] ^ -1)) {
                break L1;
              } else {
                var4 = param1.c(this.field_f, true, this.field_g);
                if (var4 == null) {
                  break L1;
                } else {
                  var4.field_D = true;
                  break L1;
                }
              }
            }
            var4_int = uc.field_d[this.field_c][4];
            if (param2 == 26123) {
              L2: {
                var5 = var4_int;
                if (-5 != (var5 ^ -1)) {
                  if ((var5 ^ -1) != -7) {
                    if (var5 != 0) {
                      if (-2 != (var5 ^ -1)) {
                        if ((var5 ^ -1) == -4) {
                          this.b((byte) 51, param1);
                          break L2;
                        } else {
                          if (-3 != (var5 ^ -1)) {
                            break L2;
                          } else {
                            this.a(param1, true);
                            break L2;
                          }
                        }
                      } else {
                        this.b(95, param1);
                        break L2;
                      }
                    } else {
                      this.a(0, param1);
                      break L2;
                    }
                  } else {
                    this.a((byte) -100, param0, param1);
                    break L2;
                  }
                } else {
                  this.a(true, param1);
                  break L2;
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
          L3: {
            var4_ref = decompiledCaughtException;
            stackIn_26_0 = (RuntimeException) (var4_ref);

            stackIn_26_1 = new StringBuilder().append("wa.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "null";
              break L3;
            } else {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "{...}";
              break L3;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_27_0), stackIn_27_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final int a(int param0) {
        if (param0 != 25365) {
            return -57;
        }
        return 4;
    }

    final static void a(int param0, int param1, aj param2) {
        try {
            if (param1 != 1) {
                ok var4 = (ok) null;
                wa.a(-25, (ok) null);
            }
            oj.field_r.a((byte) -119, (tc) (param2));
            wr.a((byte) -57, param2, param0);
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "wa.U(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    private final void b(byte param0, ha param1) {
        jd var3 = null;
        jd var4 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          L0: {
            L1: {
              var4 = param1.c(this.field_f, true, this.field_g);
              var3 = var4;
              if (param0 == 51) {
                break L1;
              } else {
                field_h = (String) null;
                break L1;
              }
            }
            L2: {
              if (var3 != null) {
                var4.field_ab = uc.field_d[this.field_c][5];
                break L2;
              } else {
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var3_ref);

            stackIn_8_1 = new StringBuilder().append("wa.K(").append(param0).append(',');

            if (param1 == null) {
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
          throw ig.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
    }

    final void a(byte param0, ha param1) {
        try {
            if (param0 != -37) {
                this.field_g = 12;
            }
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "wa.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private final void a(ha param0, boolean param1) {
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        jd var4 = null;
        jd var5 = null;
        try {
          L0: {
            L1: {
              L2: {
                L3: {
                  var4 = param0.c(this.field_f, param1, this.field_g);
                  var5 = var4;
                  if (115 != this.field_c) {
                    break L3;
                  } else {
                    if (-64 == (var5.field_N ^ -1)) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                L4: {
                  if (119 != this.field_c) {
                    break L4;
                  } else {
                    if (43 == var5.field_N) {
                      break L2;
                    } else {
                      break L4;
                    }
                  }
                }
                L5: {
                  if (-119 != (this.field_c ^ -1)) {
                    break L5;
                  } else {
                    if (var5.field_N == 59) {
                      break L2;
                    } else {
                      break L5;
                    }
                  }
                }
                L6: {
                  if (-117 != (this.field_c ^ -1)) {
                    break L6;
                  } else {
                    if (-59 == (var5.field_N ^ -1)) {
                      break L2;
                    } else {
                      break L6;
                    }
                  }
                }
                if ((this.field_c ^ -1) != -118) {
                  break L1;
                } else {
                  if (-54 == (var5.field_N ^ -1)) {
                    break L2;
                  } else {
                    break L1;
                  }
                }
              }
              var5.field_F = true;
              param0.a(this.field_f, this.field_g, 0, 3);
              break L1;
            }
            L7: {
              if (-121 == (this.field_c ^ -1)) {
                var4.field_C = true;
                break L7;
              } else {
                break L7;
              }
            }
            L8: {
              if (19 != uc.field_d[this.field_c][5]) {
                break L8;
              } else {
                var5.field_bb = true;
                break L8;
              }
            }
            L9: {
              L10: {
                if ((uc.field_d[this.field_c][5] ^ -1) != -22) {
                  break L10;
                } else {
                  var4.field_cb = var4.field_cb + uc.field_d[this.field_c][6];
                  var5.field_s = true;
                  var5.field_B = 0;
                  if (-101 > (var5.field_cb ^ -1)) {
                    var5.field_cb = 100;
                    break L10;
                  } else {
                    break L9;
                  }
                }
              }
              break L9;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var3 = decompiledCaughtException;
            stackIn_28_0 = (RuntimeException) (var3);

            stackIn_28_1 = new StringBuilder().append("wa.P(");

            if (param0 == null) {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "null";
              break L11;
            } else {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "{...}";
              break L11;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_29_0), stackIn_29_2 + ',' + param1 + ')');
        }
    }

    public static void c(int param0) {
        field_h = null;
        field_e = null;
        if (param0 != 6) {
            field_h = (String) null;
        }
    }

    wa(int param0, int param1, int param2) {
        super(param0);
        this.field_f = param2;
        this.field_g = param1;
    }

    final void a(ha param0, int param1) {
        try {
            if (param1 != -1700635440) {
                field_h = (String) null;
            }
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "wa.G(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        field_h = "(<%0> players want to join)";
    }
}
