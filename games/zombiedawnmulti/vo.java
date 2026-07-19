/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vo extends nc {
    static ja field_r;
    static String field_n;
    private int field_t;
    static cj field_m;
    static String field_s;
    static boolean field_q;
    static ja field_p;
    static di field_o;
    static ip field_l;

    private final void a(String param0, int param1, int param2, int param3) {
        int discarded$0 = 0;
        int discarded$1 = 0;
        try {
            fn.field_e.a();
            oo.b();
            if (param1 != -5) {
                this.h(-39);
            }
            discarded$0 = ah.field_e.a(param0, 60, param3, 520, 200, 4, 0, 1, 0, param2);
            g.a(16777215);
            g.a(16777215);
            g.a(16777215);
            g.a(16777215);
            oo.i(5, 5, 0, 0, 640, 480);
            discarded$1 = ah.field_e.a(param0, 60, param3, 520, 200, 5, 0, 1, 0, param2);
            dl.field_h.b((byte) 100);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "vo.I(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static ca a(byte param0, String param1, String param2, ul param3, ul param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        ca stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        ca stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            L1: {
              var5_int = param4.a(param1, (byte) -97);
              var6 = param4.a(param2, var5_int, -1);
              if (param0 == -46) {
                break L1;
              } else {
                field_q = false;
                break L1;
              }
            }
            stackOut_2_0 = ZombieDawnMulti.a(var5_int, (byte) -19, param3, param4, var6);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var5);
            stackOut_4_1 = new StringBuilder().append("vo.D(").append(param0).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          L3: {
            stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param2 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          L4: {
            stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param3 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          L5: {
            stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param4 == null) {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L5;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L5;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ')');
        }
        return stackIn_3_0;
    }

    final void a(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        L0: {
          var4 = ZombieDawnMulti.field_E ? 1 : 0;
          this.field_t = this.field_t + 1;
          if (-2 != (kd.field_b ^ -1)) {
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 1;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        var2 = stackIn_3_0;
        L1: while (true) {
          L2: {
            L3: {
              if (!ba.c(-1)) {
                if ((this.field_t ^ -1) > -2153) {
                  break L2;
                } else {
                  break L3;
                }
              } else {
                var6 = 13;
                var5 = sj.field_p;
                if (var4 == 0) {
                  if (var5 == var6) {
                    var2 = 1;
                    continue L1;
                  } else {
                    continue L1;
                  }
                } else {
                  if (var5 <= var6) {
                    break L3;
                  } else {
                    L4: {
                      if (var2 == 0) {
                        break L4;
                      } else {
                        if (100 < this.field_t) {
                          this.h(-115);
                          break L4;
                        } else {
                          L5: {
                            if (1896 >= this.field_t) {
                              break L5;
                            } else {
                              if (-2153 < (this.field_t ^ -1)) {
                                var3 = -this.field_t + 2152;
                                if (var3 < 0) {
                                  var3 = 0;
                                  break L5;
                                } else {
                                  break L5;
                                }
                              } else {
                                break L5;
                              }
                            }
                          }
                          if (param0 == 0) {
                            return;
                          } else {
                            field_l = (ip) null;
                            return;
                          }
                        }
                      }
                    }
                    L6: {
                      if (1896 >= this.field_t) {
                        break L6;
                      } else {
                        if (-2153 < (this.field_t ^ -1)) {
                          var3 = -this.field_t + 2152;
                          if (var3 < 0) {
                            var3 = 0;
                            break L6;
                          } else {
                            if (param0 == 0) {
                              return;
                            } else {
                              field_l = (ip) null;
                              return;
                            }
                          }
                        } else {
                          if (param0 == 0) {
                            return;
                          } else {
                            field_l = (ip) null;
                            return;
                          }
                        }
                      }
                    }
                    if (param0 == 0) {
                      return;
                    } else {
                      field_l = (ip) null;
                      return;
                    }
                  }
                }
              }
            }
            var2 = 1;
            break L2;
          }
          L7: {
            if (var2 == 0) {
              break L7;
            } else {
              if (100 < this.field_t) {
                this.h(-115);
                break L7;
              } else {
                if (1896 < this.field_t) {
                  if (-2153 < (this.field_t ^ -1)) {
                    var3 = -this.field_t + 2152;
                    if (var3 < 0) {
                      var3 = 0;
                      if (param0 != 0) {
                        field_l = (ip) null;
                        return;
                      } else {
                        return;
                      }
                    } else {
                      if (param0 != 0) {
                        field_l = (ip) null;
                        return;
                      } else {
                        return;
                      }
                    }
                  } else {
                    if (param0 != 0) {
                      field_l = (ip) null;
                      return;
                    } else {
                      return;
                    }
                  }
                } else {
                  if (param0 != 0) {
                    field_l = (ip) null;
                    return;
                  } else {
                    return;
                  }
                }
              }
            }
          }
          L8: {
            if (1896 >= this.field_t) {
              break L8;
            } else {
              if (-2153 < (this.field_t ^ -1)) {
                var3 = -this.field_t + 2152;
                if (var3 < 0) {
                  var3 = 0;
                  break L8;
                } else {
                  if (param0 != 0) {
                    field_l = (ip) null;
                    return;
                  } else {
                    return;
                  }
                }
              } else {
                if (param0 != 0) {
                  field_l = (ip) null;
                  return;
                } else {
                  return;
                }
              }
            }
          }
          if (param0 != 0) {
            field_l = (ip) null;
            return;
          } else {
            return;
          }
        }
    }

    final void b(byte param0) {
        if (param0 != 69) {
          field_o = (di) null;
          bl.field_g = null;
          wd.field_P = null;
          jo.field_d = null;
          eq.field_c = null;
          return;
        } else {
          bl.field_g = null;
          wd.field_P = null;
          jo.field_d = null;
          eq.field_c = null;
          return;
        }
    }

    vo(int param0, boolean param1, int param2, int param3, int param4, int param5, int[] param6) {
        super(param0, param1, param2, param3, param4, param5, param6);
        this.field_t = 0;
    }

    private final void h(int param0) {
        if (param0 > -59) {
            field_o = (di) null;
            bm.a(true, 1, 127, sp.field_g);
            return;
        }
        bm.a(true, 1, 127, sp.field_g);
    }

    private final void b(int param0, int param1, int param2) {
        jo.field_d.g(param0, param1);
        e.field_e.field_k = param2 + -param0;
        e.field_e.field_g = param1 + -80;
        kk.field_w.a(param2 + -10021, e.field_e);
        eq.field_c.a(param0 - -150, param1 - -50);
    }

    final void a(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = ZombieDawnMulti.field_E ? 1 : 0;
        if (param0) {
          L0: {
            oo.b();
            if (260 > this.field_t) {
              break L0;
            } else {
              L1: {
                if ((this.field_t ^ -1) <= -389) {
                  break L1;
                } else {
                  this.b(0, 0, -115);
                  wd.field_P.a(0, -wd.field_P.field_a + 480);
                  oo.f(0, 0, 640, 480, 0, 256 - (-520 + 2 * this.field_t));
                  if (var5 == 0) {
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
              L2: {
                if (508 > this.field_t) {
                  break L2;
                } else {
                  L3: {
                    if (this.field_t >= 1564) {
                      break L3;
                    } else {
                      var2 = -508 + this.field_t;
                      this.b(-(var2 >> -970948766), 0, -115);
                      var3 = var2 * 7 >> -1069579389;
                      var4 = 9 * var2 >> 1816671268;
                      wd.field_P.a(-var4, -wd.field_P.field_a + 480);
                      bl.field_g.a(-var3 + 622, 0);
                      if (var5 == 0) {
                        break L0;
                      } else {
                        break L3;
                      }
                    }
                  }
                  L4: {
                    if (1724 > this.field_t) {
                      break L4;
                    } else {
                      if (-1853 < (this.field_t ^ -1)) {
                        var2 = 924;
                        this.b(-264, 0, -115);
                        bl.field_g.a(622 + -var2, 0);
                        oo.f(0, 0, 640, 480, 0, 2 * (-1724 + this.field_t));
                        if (var5 == 0) {
                          break L0;
                        } else {
                          break L4;
                        }
                      } else {
                        if (-2153 < (this.field_t ^ -1)) {
                          break L0;
                        } else {
                          break L0;
                        }
                      }
                    }
                  }
                  this.b(-264, 0, -115);
                  var2 = 924;
                  bl.field_g.a(-var2 + 622, 0);
                  if (var5 == 0) {
                    break L0;
                  } else {
                    break L2;
                  }
                }
              }
              this.b(0, 0, -115);
              wd.field_P.a(0, 480 - wd.field_P.field_a);
              break L0;
            }
          }
          this.g(520);
          if (this.field_t <= 120) {
            return;
          } else {
            L5: {
              if (this.field_t >= 388) {
                break L5;
              } else {
                pb.field_e.b(no.field_Fb, 320, 460, 16777215, 0);
                break L5;
              }
            }
            return;
          }
        } else {
          field_m = (cj) null;
          oo.b();
          if (260 <= this.field_t) {
            if ((this.field_t ^ -1) > -389) {
              L6: {
                this.b(0, 0, -115);
                wd.field_P.a(0, -wd.field_P.field_a + 480);
                oo.f(0, 0, 640, 480, 0, 256 - (-520 + 2 * this.field_t));
                if (var5 == 0) {
                  break L6;
                } else {
                  L7: {
                    if (508 > this.field_t) {
                      break L7;
                    } else {
                      L8: {
                        if (this.field_t >= 1564) {
                          break L8;
                        } else {
                          var2 = -508 + this.field_t;
                          this.b(-(var2 >> -970948766), 0, -115);
                          var3 = var2 * 7 >> -1069579389;
                          var4 = 9 * var2 >> 1816671268;
                          wd.field_P.a(-var4, -wd.field_P.field_a + 480);
                          bl.field_g.a(-var3 + 622, 0);
                          break L8;
                        }
                      }
                      L9: {
                        if (1724 > this.field_t) {
                          break L9;
                        } else {
                          if (-1853 < (this.field_t ^ -1)) {
                            var2 = 924;
                            this.b(-264, 0, -115);
                            bl.field_g.a(622 + -var2, 0);
                            oo.f(0, 0, 640, 480, 0, 2 * (-1724 + this.field_t));
                            if (var5 == 0) {
                              break L6;
                            } else {
                              break L9;
                            }
                          } else {
                            if (-2153 < (this.field_t ^ -1)) {
                              break L6;
                            } else {
                              break L6;
                            }
                          }
                        }
                      }
                      this.b(-264, 0, -115);
                      var2 = 924;
                      bl.field_g.a(-var2 + 622, 0);
                      if (var5 == 0) {
                        break L6;
                      } else {
                        break L7;
                      }
                    }
                  }
                  this.b(0, 0, -115);
                  wd.field_P.a(0, 480 - wd.field_P.field_a);
                  break L6;
                }
              }
              this.g(520);
              if (this.field_t > 120) {
                if (this.field_t < 388) {
                  pb.field_e.b(no.field_Fb, 320, 460, 16777215, 0);
                  return;
                } else {
                  return;
                }
              } else {
                return;
              }
            } else {
              L10: {
                L11: {
                  if (508 > this.field_t) {
                    break L11;
                  } else {
                    L12: {
                      if (this.field_t >= 1564) {
                        break L12;
                      } else {
                        var2 = -508 + this.field_t;
                        this.b(-(var2 >> -970948766), 0, -115);
                        var3 = var2 * 7 >> -1069579389;
                        var4 = 9 * var2 >> 1816671268;
                        wd.field_P.a(-var4, -wd.field_P.field_a + 480);
                        bl.field_g.a(-var3 + 622, 0);
                        if (var5 == 0) {
                          break L10;
                        } else {
                          break L12;
                        }
                      }
                    }
                    L13: {
                      if (1724 > this.field_t) {
                        break L13;
                      } else {
                        if (-1853 < (this.field_t ^ -1)) {
                          var2 = 924;
                          this.b(-264, 0, -115);
                          bl.field_g.a(622 + -var2, 0);
                          oo.f(0, 0, 640, 480, 0, 2 * (-1724 + this.field_t));
                          if (var5 == 0) {
                            break L10;
                          } else {
                            break L13;
                          }
                        } else {
                          if (-2153 < (this.field_t ^ -1)) {
                            break L10;
                          } else {
                            break L10;
                          }
                        }
                      }
                    }
                    this.b(-264, 0, -115);
                    var2 = 924;
                    bl.field_g.a(-var2 + 622, 0);
                    if (var5 == 0) {
                      break L10;
                    } else {
                      break L11;
                    }
                  }
                }
                this.b(0, 0, -115);
                wd.field_P.a(0, 480 - wd.field_P.field_a);
                break L10;
              }
              this.g(520);
              if (this.field_t <= 120) {
                return;
              } else {
                L14: {
                  if (this.field_t >= 388) {
                    break L14;
                  } else {
                    pb.field_e.b(no.field_Fb, 320, 460, 16777215, 0);
                    break L14;
                  }
                }
                return;
              }
            }
          } else {
            this.g(520);
            if (this.field_t <= 120) {
              return;
            } else {
              L15: {
                if (this.field_t >= 388) {
                  break L15;
                } else {
                  pb.field_e.b(no.field_Fb, 320, 460, 16777215, 0);
                  break L15;
                }
              }
              return;
            }
          }
        }
    }

    public static void f(int param0) {
        field_l = null;
        field_n = null;
        field_r = null;
        if (param0 != -14680) {
          field_s = (String) null;
          field_m = null;
          field_o = null;
          field_p = null;
          field_s = null;
          return;
        } else {
          field_m = null;
          field_o = null;
          field_p = null;
          field_s = null;
          return;
        }
    }

    private final void g(int param0) {
        boolean discarded$20 = false;
        int discarded$21 = 0;
        int discarded$22 = 0;
        int discarded$23 = 0;
        int discarded$24 = 0;
        int discarded$25 = 0;
        int discarded$26 = 0;
        int discarded$27 = 0;
        int discarded$28 = 0;
        int discarded$29 = 0;
        int discarded$30 = 0;
        int discarded$31 = 0;
        int discarded$32 = 0;
        int discarded$33 = 0;
        int discarded$34 = 0;
        int discarded$35 = 0;
        Object var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        Object var8 = null;
        Object var10 = null;
        int stackIn_4_0 = 0;
        int stackIn_4_1 = 0;
        int stackIn_16_0 = 0;
        int stackIn_16_1 = 0;
        int stackIn_19_0 = 0;
        int stackIn_58_0 = 0;
        int stackIn_58_1 = 0;
        int stackIn_70_0 = 0;
        int stackIn_70_1 = 0;
        int stackIn_73_0 = 0;
        int stackOut_57_0 = 0;
        int stackOut_57_1 = 0;
        int stackOut_69_0 = 0;
        int stackOut_69_1 = 0;
        int stackOut_72_0 = 0;
        int stackOut_71_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_3_1 = 0;
        int stackOut_15_0 = 0;
        int stackOut_15_1 = 0;
        int stackOut_18_0 = 0;
        int stackOut_17_0 = 0;
        var7 = ZombieDawnMulti.field_E ? 1 : 0;
        var2 = null;
        var3 = 0;
        var4 = 50;
        var5 = 0;
        if (param0 != 520) {
          discarded$20 = vo.e(108);
          L0: while (true) {
            L1: {
              L2: {
                if (var5 >= ah.field_c.length) {
                  break L2;
                } else {
                  var6 = -ah.field_c[var5] + this.field_t;
                  stackOut_57_0 = var6 ^ -1;
                  stackOut_57_1 = -1;
                  stackIn_70_0 = stackOut_57_0;
                  stackIn_70_1 = stackOut_57_1;
                  stackIn_58_0 = stackOut_57_0;
                  stackIn_58_1 = stackOut_57_1;
                  if (var7 != 0) {
                    break L1;
                  } else {
                    L3: {
                      if (stackIn_58_0 >= stackIn_58_1) {
                        break L3;
                      } else {
                        if (50 + (10 - -ui.field_f[var5]) <= var6) {
                          break L3;
                        } else {
                          L4: {
                            var3 = 256;
                            if (10 <= var6) {
                              break L4;
                            } else {
                              var3 = (var6 << 1649809224) / 10;
                              break L4;
                            }
                          }
                          L5: {
                            if (ui.field_f[var5] + 10 < var6) {
                              var3 = 256 - (-ui.field_f[var5] + var6 + -10 << 626754440) / 50;
                              break L5;
                            } else {
                              break L5;
                            }
                          }
                          var2 = cp.field_R[var5];
                          var10 = var2;
                          var2 = var10;
                          var10 = var2;
                          var2 = var10;
                          break L3;
                        }
                      }
                    }
                    var5++;
                    if (var7 == 0) {
                      continue L0;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              if (var2 != null) {
                stackOut_69_0 = ah.field_e.field_C - -ah.field_e.field_r;
                stackOut_69_1 = -5;
                stackIn_70_0 = stackOut_69_0;
                stackIn_70_1 = stackOut_69_1;
                break L1;
              } else {
                ml.field_Ob = (String) (var2);
                return;
              }
            }
            L6: {
              var5 = stackIn_70_0 + stackIn_70_1;
              if (var2 != cp.field_R[5]) {
                stackOut_72_0 = 0;
                stackIn_73_0 = stackOut_72_0;
                break L6;
              } else {
                stackOut_71_0 = 1;
                stackIn_73_0 = stackOut_71_0;
                break L6;
              }
            }
            var6 = stackIn_73_0;
            if (var6 == 0) {
              L7: {
                if (cp.field_R[5] != var2) {
                  break L7;
                } else {
                  var4 = 180;
                  break L7;
                }
              }
              if (var6 != 0) {
                L8: {
                  L9: {
                    discarded$21 = ah.field_e.a(cp.field_R[5], 60, var4, 520, 200, 1, 0, 1, 0, var5);
                    if (ml.field_Ob == null) {
                      break L9;
                    } else {
                      if (ml.field_Ob != var2) {
                        break L9;
                      } else {
                        break L8;
                      }
                    }
                  }
                  this.a((String) (var2), -5, var5, var4);
                  break L8;
                }
                if (-257 < (var3 ^ -1)) {
                  discarded$22 = ah.field_e.a((String) (var2), 60, var4, 520, 200, 1, 0, var3, 1, 0, var5);
                  if (var6 != 0) {
                    ml.field_Ob = (String) (var2);
                    return;
                  } else {
                    g.a(fn.field_e, 0, 0, var3);
                    ml.field_Ob = (String) (var2);
                    return;
                  }
                } else {
                  discarded$23 = ah.field_e.a((String) (var2), 60, var4, 520, 200, 1, 0, 1, 0, var5);
                  if (var6 != 0) {
                    ml.field_Ob = (String) (var2);
                    return;
                  } else {
                    g.a(fn.field_e, 0, 0);
                    if (var7 == 0) {
                      ml.field_Ob = (String) (var2);
                      return;
                    } else {
                      discarded$24 = ah.field_e.a((String) (var2), 60, var4, 520, 200, 1, 0, var3, 1, 0, var5);
                      g.a(fn.field_e, 0, 0, var3);
                      ml.field_Ob = (String) (var2);
                      return;
                    }
                  }
                }
              } else {
                L10: {
                  L11: {
                    if (ml.field_Ob == null) {
                      break L11;
                    } else {
                      if (ml.field_Ob != var2) {
                        break L11;
                      } else {
                        break L10;
                      }
                    }
                  }
                  this.a((String) (var2), -5, var5, var4);
                  break L10;
                }
                L12: {
                  if (-257 < (var3 ^ -1)) {
                    break L12;
                  } else {
                    discarded$25 = ah.field_e.a((String) (var2), 60, var4, 520, 200, 1, 0, 1, 0, var5);
                    if (var6 != 0) {
                      ml.field_Ob = (String) (var2);
                      return;
                    } else {
                      g.a(fn.field_e, 0, 0);
                      if (var7 == 0) {
                        ml.field_Ob = (String) (var2);
                        return;
                      } else {
                        break L12;
                      }
                    }
                  }
                }
                discarded$26 = ah.field_e.a((String) (var2), 60, var4, 520, 200, 1, 0, var3, 1, 0, var5);
                if (var6 != 0) {
                  ml.field_Ob = (String) (var2);
                  return;
                } else {
                  g.a(fn.field_e, 0, 0, var3);
                  ml.field_Ob = (String) (var2);
                  return;
                }
              }
            } else {
              var4 = 180;
              discarded$27 = ah.field_e.a(cp.field_R[5], 60, var4, 520, 200, 1, 0, 1, 0, var5);
              L13: {
                L14: {
                  if (ml.field_Ob == null) {
                    break L14;
                  } else {
                    if (ml.field_Ob != var2) {
                      break L14;
                    } else {
                      break L13;
                    }
                  }
                }
                this.a((String) (var2), -5, var5, var4);
                break L13;
              }
              L15: {
                if (-257 < (var3 ^ -1)) {
                  break L15;
                } else {
                  discarded$28 = ah.field_e.a((String) (var2), 60, var4, 520, 200, 1, 0, 1, 0, var5);
                  if (var6 == 0) {
                    g.a(fn.field_e, 0, 0);
                    if (var7 != 0) {
                      break L15;
                    } else {
                      ml.field_Ob = (String) (var2);
                      return;
                    }
                  } else {
                    ml.field_Ob = (String) (var2);
                    return;
                  }
                }
              }
              discarded$29 = ah.field_e.a((String) (var2), 60, var4, 520, 200, 1, 0, var3, 1, 0, var5);
              if (var6 == 0) {
                g.a(fn.field_e, 0, 0, var3);
                ml.field_Ob = (String) (var2);
                return;
              } else {
                ml.field_Ob = (String) (var2);
                return;
              }
            }
          }
        } else {
          L16: while (true) {
            L17: {
              L18: {
                if (var5 >= ah.field_c.length) {
                  break L18;
                } else {
                  var6 = -ah.field_c[var5] + this.field_t;
                  stackOut_3_0 = var6 ^ -1;
                  stackOut_3_1 = -1;
                  stackIn_16_0 = stackOut_3_0;
                  stackIn_16_1 = stackOut_3_1;
                  stackIn_4_0 = stackOut_3_0;
                  stackIn_4_1 = stackOut_3_1;
                  if (var7 != 0) {
                    break L17;
                  } else {
                    L19: {
                      if (stackIn_4_0 >= stackIn_4_1) {
                        break L19;
                      } else {
                        if (50 + (10 - -ui.field_f[var5]) <= var6) {
                          break L19;
                        } else {
                          L20: {
                            var3 = 256;
                            if (10 <= var6) {
                              break L20;
                            } else {
                              var3 = (var6 << 1649809224) / 10;
                              break L20;
                            }
                          }
                          L21: {
                            if (ui.field_f[var5] + 10 < var6) {
                              var3 = 256 - (-ui.field_f[var5] + var6 + -10 << 626754440) / 50;
                              break L21;
                            } else {
                              break L21;
                            }
                          }
                          var2 = cp.field_R[var5];
                          var8 = var2;
                          var2 = var8;
                          break L19;
                        }
                      }
                    }
                    var5++;
                    if (var7 == 0) {
                      continue L16;
                    } else {
                      break L18;
                    }
                  }
                }
              }
              if (var2 != null) {
                stackOut_15_0 = ah.field_e.field_C - -ah.field_e.field_r;
                stackOut_15_1 = -5;
                stackIn_16_0 = stackOut_15_0;
                stackIn_16_1 = stackOut_15_1;
                break L17;
              } else {
                ml.field_Ob = (String) (var2);
                return;
              }
            }
            L22: {
              var5 = stackIn_16_0 + stackIn_16_1;
              if (var2 != cp.field_R[5]) {
                stackOut_18_0 = 0;
                stackIn_19_0 = stackOut_18_0;
                break L22;
              } else {
                stackOut_17_0 = 1;
                stackIn_19_0 = stackOut_17_0;
                break L22;
              }
            }
            L23: {
              L24: {
                var6 = stackIn_19_0;
                if (var6 != 0) {
                  break L24;
                } else {
                  if (cp.field_R[5] != var2) {
                    break L23;
                  } else {
                    break L24;
                  }
                }
              }
              var4 = 180;
              break L23;
            }
            L25: {
              if (var6 == 0) {
                break L25;
              } else {
                discarded$30 = ah.field_e.a(cp.field_R[5], 60, var4, 520, 200, 1, 0, 1, 0, var5);
                break L25;
              }
            }
            L26: {
              if (ml.field_Ob == null) {
                this.a((String) (var2), -5, var5, var4);
                break L26;
              } else {
                if (ml.field_Ob != var2) {
                  L27: {
                    this.a((String) (var2), -5, var5, var4);
                    if (-257 < (var3 ^ -1)) {
                      break L27;
                    } else {
                      discarded$31 = ah.field_e.a((String) (var2), 60, var4, 520, 200, 1, 0, 1, 0, var5);
                      if (var6 == 0) {
                        g.a(fn.field_e, 0, 0);
                        if (var7 != 0) {
                          break L27;
                        } else {
                          ml.field_Ob = (String) (var2);
                          return;
                        }
                      } else {
                        ml.field_Ob = (String) (var2);
                        return;
                      }
                    }
                  }
                  discarded$32 = ah.field_e.a((String) (var2), 60, var4, 520, 200, 1, 0, var3, 1, 0, var5);
                  if (var6 == 0) {
                    g.a(fn.field_e, 0, 0, var3);
                    ml.field_Ob = (String) (var2);
                    return;
                  } else {
                    ml.field_Ob = (String) (var2);
                    return;
                  }
                } else {
                  break L26;
                }
              }
            }
            if (-257 < (var3 ^ -1)) {
              discarded$33 = ah.field_e.a((String) (var2), 60, var4, 520, 200, 1, 0, var3, 1, 0, var5);
              if (var6 == 0) {
                g.a(fn.field_e, 0, 0, var3);
                ml.field_Ob = (String) (var2);
                return;
              } else {
                ml.field_Ob = (String) (var2);
                return;
              }
            } else {
              discarded$34 = ah.field_e.a((String) (var2), 60, var4, 520, 200, 1, 0, 1, 0, var5);
              if (var6 == 0) {
                g.a(fn.field_e, 0, 0);
                if (var7 != 0) {
                  discarded$35 = ah.field_e.a((String) (var2), 60, var4, 520, 200, 1, 0, var3, 1, 0, var5);
                  g.a(fn.field_e, 0, 0, var3);
                  ml.field_Ob = (String) (var2);
                  return;
                } else {
                  ml.field_Ob = (String) (var2);
                  return;
                }
              } else {
                ml.field_Ob = (String) (var2);
                return;
              }
            }
          }
        }
    }

    final static boolean e(int param0) {
        if (param0 == 1) {
          if (null != ki.field_h) {
            if (pi.field_a != field_l) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          field_r = (ja) null;
          if (null != ki.field_h) {
            if (pi.field_a != field_l) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    static {
        field_s = "Open";
        field_n = "Researched!";
    }
}
