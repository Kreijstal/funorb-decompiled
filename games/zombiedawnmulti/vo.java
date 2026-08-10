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
        try {
            fn.field_e.a();
            oo.b();
            if (param1 != -5) {
                this.h(-39);
            }
            ah.field_e.a(param0, 60, param3, 520, 200, 4, 0, 1, 0, param2);
            g.a(16777215);
            g.a(16777215);
            g.a(16777215);
            g.a(16777215);
            oo.i(5, 5, 0, 0, 640, 480);
            ah.field_e.a(param0, 60, param3, 520, 200, 5, 0, 1, 0, param2);
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
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
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
            stackIn_3_0 = ZombieDawnMulti.a(var5_int, (byte) -19, param3, param4, var6);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var5);

            stackIn_6_1 = new StringBuilder().append("vo.D(").append(param0).append(',');

            if (param1 == null) {
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
          L3: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');

            if (param2 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');

            if (param3 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');

            if (param4 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L5;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L5;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_7_0), stackIn_16_2 + ')');
        }
        return stackIn_3_0;
    }

    final void a(int param0) {
        int var2;
        int var4;
        int stackIn_3_0 = 0;
        int var3;
        L0: {
          var4 = ZombieDawnMulti.field_E ? 1 : 0;
          this.field_t = this.field_t + 1;
          if (-2 != (kd.field_b ^ -1)) {
            stackIn_3_0 = 0;
            break L0;
          } else {
            stackIn_3_0 = 1;
            break L0;
          }
        }
        var2 = stackIn_3_0;
        L1: while (true) {
          if (!ba.c(-1)) {
            L2: {
              if ((this.field_t ^ -1) > -2153) {
                break L2;
              } else {
                var2 = 1;
                break L2;
              }
            }
            L3: {
              if (var2 == 0) {
                break L3;
              } else {
                if (100 < this.field_t) {
                  this.h(-115);
                  break L3;
                } else {
                  break L3;
                }
              }
            }
            L4: {
              if (1896 >= this.field_t) {
                break L4;
              } else {
                if (-2153 < (this.field_t ^ -1)) {
                  var3 = -this.field_t + 2152;
                  if (var3 < 0) {
                    var3 = 0;
                    break L4;
                  } else {
                    break L4;
                  }
                } else {
                  break L4;
                }
              }
            }
            L5: {
              if (param0 == 0) {
                break L5;
              } else {
                field_l = (ip) null;
                break L5;
              }
            }
            return;
          } else {
            if (sj.field_p == 13) {
              var2 = 1;
              continue L1;
            } else {
              continue L1;
            }
          }
        }
    }

    final void b(byte param0) {
        if (param0 != 69) {
            field_o = (di) null;
        }
        bl.field_g = null;
        wd.field_P = null;
        jo.field_d = null;
        eq.field_c = null;
    }

    vo(int param0, boolean param1, int param2, int param3, int param4, int param5, int[] param6) {
        super(param0, param1, param2, param3, param4, param5, param6);
        this.field_t = 0;
    }

    private final void h(int param0) {
        if (param0 > -59) {
            field_o = (di) null;
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
        int var2;
        int var3;
        int var4;
        int var5;
        L0: {
          var5 = ZombieDawnMulti.field_E ? 1 : 0;
          if (param0) {
            break L0;
          } else {
            field_m = (cj) null;
            break L0;
          }
        }
        L1: {
          oo.b();
          if (260 <= this.field_t) {
            L2: {
              if ((this.field_t ^ -1) <= -389) {
                if (508 > this.field_t) {
                  this.b(0, 0, -115);
                  wd.field_P.a(0, 480 - wd.field_P.field_a);
                  break L2;
                } else {
                  if (this.field_t >= 1564) {
                    if (1724 > this.field_t) {
                      this.b(-264, 0, -115);
                      var2 = 924;
                      bl.field_g.a(-var2 + 622, 0);
                      break L2;
                    } else {
                      if (-1853 < (this.field_t ^ -1)) {
                        var2 = 924;
                        this.b(-264, 0, -115);
                        bl.field_g.a(622 + -var2, 0);
                        oo.f(0, 0, 640, 480, 0, 2 * (-1724 + this.field_t));
                        break L2;
                      } else {
                        if (-2153 >= (this.field_t ^ -1)) {
                          break L2;
                        } else {
                          this.g(520);
                          if (this.field_t <= 120) {
                            break L1;
                          } else {
                            if (this.field_t >= 388) {
                              break L1;
                            } else {
                              pb.field_e.b(no.field_Fb, 320, 460, 16777215, 0);
                              break L1;
                            }
                          }
                        }
                      }
                    }
                  } else {
                    var2 = -508 + this.field_t;
                    this.b(-(var2 >> -970948766), 0, -115);
                    var3 = var2 * 7 >> -1069579389;
                    var4 = 9 * var2 >> 1816671268;
                    wd.field_P.a(-var4, -wd.field_P.field_a + 480);
                    bl.field_g.a(-var3 + 622, 0);
                    break L2;
                  }
                }
              } else {
                this.b(0, 0, -115);
                wd.field_P.a(0, -wd.field_P.field_a + 480);
                oo.f(0, 0, 640, 480, 0, 256 - (-520 + 2 * this.field_t));
                break L2;
              }
            }
            this.g(520);
            if (this.field_t <= 120) {
              break L1;
            } else {
              if (this.field_t >= 388) {
                break L1;
              } else {
                pb.field_e.b(no.field_Fb, 320, 460, 16777215, 0);
                break L1;
              }
            }
          } else {
            this.g(520);
            if (this.field_t <= 120) {
              break L1;
            } else {
              if (this.field_t >= 388) {
                break L1;
              } else {
                pb.field_e.b(no.field_Fb, 320, 460, 16777215, 0);
                break L1;
              }
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
        }
        field_m = null;
        field_o = null;
        field_p = null;
        field_s = null;
    }

    private final void g(int param0) {
        int stackIn_15_0 = 0;
        int stackIn_15_1 = 0;
        int stackIn_18_0 = 0;
        Object var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        L0: {
          var7 = ZombieDawnMulti.field_E ? 1 : 0;
          var2 = null;
          var3 = 0;
          var4 = 50;
          var5 = 0;
          if (param0 == 520) {
            break L0;
          } else {
            vo.e(108);
            break L0;
          }
        }
        L1: while (true) {
          if (var5 >= ah.field_c.length) {
            L2: {
              if (var2 == null) {
                break L2;
              } else {
                stackIn_15_0 = ah.field_e.field_C - -ah.field_e.field_r;
                stackIn_15_1 = -5;
                L3: {
                  var5 = stackIn_15_0 + stackIn_15_1;
                  if (var2 != cp.field_R[5]) {
                    stackIn_18_0 = 0;
                    break L3;
                  } else {
                    stackIn_18_0 = 1;
                    break L3;
                  }
                }
                L4: {
                  L5: {
                    var6 = stackIn_18_0;
                    if (var6 != 0) {
                      break L5;
                    } else {
                      if (cp.field_R[5] != var2) {
                        break L4;
                      } else {
                        break L5;
                      }
                    }
                  }
                  var4 = 180;
                  break L4;
                }
                L6: {
                  if (var6 == 0) {
                    break L6;
                  } else {
                    ah.field_e.a(cp.field_R[5], 60, var4, 520, 200, 1, 0, 1, 0, var5);
                    break L6;
                  }
                }
                L7: {
                  L8: {
                    if (ml.field_Ob == null) {
                      break L8;
                    } else {
                      if (ml.field_Ob != var2) {
                        break L8;
                      } else {
                        break L7;
                      }
                    }
                  }
                  this.a((String) (var2), -5, var5, var4);
                  break L7;
                }
                if (-257 < (var3 ^ -1)) {
                  ah.field_e.a((String) (var2), 60, var4, 520, 200, 1, 0, var3, 1, 0, var5);
                  if (var6 != 0) {
                    break L2;
                  } else {
                    g.a(fn.field_e, 0, 0, var3);
                    break L2;
                  }
                } else {
                  ah.field_e.a((String) (var2), 60, var4, 520, 200, 1, 0, 1, 0, var5);
                  if (var6 != 0) {
                    break L2;
                  } else {
                    g.a(fn.field_e, 0, 0);
                    break L2;
                  }
                }
              }
            }
            ml.field_Ob = (String) (var2);
            return;
          } else {
            var6 = -ah.field_c[var5] + this.field_t;
            if ((var6 ^ -1) < -1) {
              if (50 + (10 - -ui.field_f[var5]) > var6) {
                L9: {
                  var3 = 256;
                  if (10 <= var6) {
                    break L9;
                  } else {
                    var3 = (var6 << 1649809224) / 10;
                    break L9;
                  }
                }
                L10: {
                  if (ui.field_f[var5] + 10 < var6) {
                    var3 = 256 - (-ui.field_f[var5] + var6 + -10 << 626754440) / 50;
                    break L10;
                  } else {
                    break L10;
                  }
                }
                var2 = cp.field_R[var5];
                var5++;
                continue L1;
              } else {
                var5++;
                continue L1;
              }
            } else {
              var5++;
              continue L1;
            }
          }
        }
    }

    final static boolean e(int param0) {
        int stackIn_6_0 = 0;
        L0: {
          if (param0 == 1) {
            break L0;
          } else {
            field_r = (ja) null;
            break L0;
          }
        }
        L1: {
          L2: {
            if (null == ki.field_h) {
              break L2;
            } else {
              if (pi.field_a != field_l) {
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

    static {
        field_s = "Open";
        field_n = "Researched!";
    }
}
