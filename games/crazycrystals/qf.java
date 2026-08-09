/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class qf extends ea {
    static ko field_w;
    boolean field_u;
    private boolean field_v;
    static String[] field_t;

    final static void a(int param0, int param1, boolean param2, int param3) {
        int var4;
        fl.field_a.a(param3, param0);
        if (param1 == -1) {
          if (param2) {
            L0: {
              var4 = hl.field_g % fl.field_a.field_l * 2;
              if (fl.field_a.field_l <= var4) {
                var4 = fl.field_a.field_l - var4 + fl.field_a.field_l;
                break L0;
              } else {
                break L0;
              }
            }
            if (var4 >= 10) {
              if (var4 > -40 + fl.field_a.field_l) {
                var4 = fl.field_a.field_l + -40;
                wm.a(var4, param0, fl.field_a, param3, 480, 0, 30, 80, 0);
                return;
              } else {
                wm.a(var4, param0, fl.field_a, param3, 480, 0, 30, 80, 0);
                return;
              }
            } else {
              var4 = 10;
              wm.a(var4, param0, fl.field_a, param3, 480, 0, 30, 80, 0);
              return;
            }
          } else {
            return;
          }
        } else {
          field_t = (String[]) null;
          if (param2) {
            L1: {
              var4 = hl.field_g % fl.field_a.field_l * 2;
              if (fl.field_a.field_l <= var4) {
                var4 = fl.field_a.field_l - var4 + fl.field_a.field_l;
                break L1;
              } else {
                break L1;
              }
            }
            if (var4 >= 10) {
              if (var4 > -40 + fl.field_a.field_l) {
                var4 = fl.field_a.field_l + -40;
                wm.a(var4, param0, fl.field_a, param3, 480, 0, 30, 80, 0);
                return;
              } else {
                wm.a(var4, param0, fl.field_a, param3, 480, 0, 30, 80, 0);
                return;
              }
            } else {
              var4 = 10;
              wm.a(var4, param0, fl.field_a, param3, 480, 0, 30, 80, 0);
              return;
            }
          } else {
            return;
          }
        }
    }

    boolean c(f[][] param0, int param1, byte param2, int param3) {
        RuntimeException var5 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param2 < 0) {
              stackIn_4_0 = 0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var5);

            stackIn_7_1 = new StringBuilder().append("qf.KA(");

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
          throw dn.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_4_0 != 0;
        }
    }

    final boolean g(int param0) {
        if (param0 != 0) {
            this.field_v = false;
            return false;
        }
        return false;
    }

    void f(int param0, int param1, f[][] param2, int param3) {
        int stackIn_8_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_30_0 = 0;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_41_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = CrazyCrystals.field_B;
        try {
          L0: {
            this.field_u = false;
            var5_int = param2[param1 - -1][param3].a(true, false);
            if (param0 == 1) {
              if ((var5_int & 2) != 0) {
                this.a(param2, param1, false, 1, param3, 0);
                return;
              } else {
                L1: {
                  if (!this.field_v) {
                    this.a((byte) 52, param2[1 + param1][param3]);
                    this.field_l.a((byte) 89, param2[1 + param1][param3]);
                    break L1;
                  } else {
                    L2: {
                      this.field_v = false;
                      if (!this.c(param2, param1, (byte) -31, param3)) {
                        stackIn_8_0 = 0;
                        break L2;
                      } else {
                        stackIn_8_0 = 1;
                        break L2;
                      }
                    }
                    var6 = stackIn_8_0;
                    param2[1 + param1][param3] = param2[param1 - -1][param3].a(1 + param1, param3, param2, (f) (this), (byte) 12);
                    this.a((byte) 122, param2[1 + param1][param3]);
                    this.field_l.a((byte) 121, param2[1 + param1][param3]);
                    je.field_j = je.field_j + -1;
                    we.field_h = we.field_h + -2;
                    fp.field_a = fp.field_a + -2;
                    b.field_a = b.field_a + -1;
                    mb.field_g = mb.field_g - ob.field_l;
                    wd.field_j = wd.field_j - 1;
                    if (var6 != 0) {
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      break L1;
                    }
                  }
                }
                L3: {
                  if (-1 == (4 & var5_int ^ -1)) {
                    stackIn_16_0 = 0;
                    break L3;
                  } else {
                    stackIn_16_0 = 1;
                    break L3;
                  }
                }
                L4: {
                  var6 = stackIn_16_0;
                  if ((var5_int & 8) == 0) {
                    stackIn_19_0 = 0;
                    break L4;
                  } else {
                    stackIn_19_0 = 1;
                    break L4;
                  }
                }
                L5: {
                  var7 = stackIn_19_0;
                  if (var6 != 0) {
                    L6: {
                      if (!this.a(param3 - 1, (byte) 94, param2, param1)) {
                        stackIn_24_0 = 0;
                        break L6;
                      } else {
                        stackIn_24_0 = 1;
                        break L6;
                      }
                    }
                    var6 = stackIn_24_0;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                L7: {
                  if (var7 != 0) {
                    L8: {
                      if (!this.a(param3 + 1, (byte) 94, param2, param1)) {
                        stackIn_30_0 = 0;
                        break L8;
                      } else {
                        stackIn_30_0 = 1;
                        break L8;
                      }
                    }
                    var7 = stackIn_30_0;
                    break L7;
                  } else {
                    break L7;
                  }
                }
                if (var7 == 0) {
                  if (var6 != 0) {
                    this.a(param2, param1, false, 0, param3, -1);
                    return;
                  } else {
                    this.field_u = this.a((byte) 68, param1, param3, param2);
                    return;
                  }
                } else {
                  this.a(param2, param1, false, 0, param3, 1);
                  return;
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var5 = decompiledCaughtException;
            stackIn_40_0 = (RuntimeException) (var5);

            stackIn_40_1 = new StringBuilder().append("qf.LA(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
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
          throw dn.a((Throwable) ((Object) stackIn_41_0), stackIn_41_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static void a(String param0, int param1) {
        System.out.println("Error: " + ca.a("\n", 0, param0, "%0a"));
        if (param1 != 1) {
            qf.h(77);
        }
    }

    final int a(boolean param0, int param1) {
        if (param1 == 0) {
          if (this.field_s != 0) {
            if (-1 <= (this.field_s ^ -1)) {
              return 0;
            } else {
              return 2;
            }
          } else {
            return 12;
          }
        } else {
          qf.h(24);
          if (this.field_s != 0) {
            if (-1 <= (this.field_s ^ -1)) {
              return 0;
            } else {
              return 2;
            }
          } else {
            return 12;
          }
        }
    }

    private final boolean c(int param0, int param1, int param2, f[][] param3) {
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if ((1 & param3[param1][param2].a(true, true)) == 0) {
              stackIn_3_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if ((2 & param3[param1 - -1][param2].a(true, true)) == param0) {
                stackIn_7_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                return true;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var5);

            stackIn_10_1 = new StringBuilder().append("qf.CA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L1;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L1;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          return stackIn_7_0 != 0;
        }
    }

    qf(f param0) {
        super(param0);
        this.field_v = false;
        try {
            this.field_p = 4;
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) ((Object) runtimeException), "qf.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    boolean a(int param0, int param1, int param2, f[][] param3, int param4, fq param5, int param6) {
        RuntimeException var8 = null;
        String var9 = null;
        int stackIn_3_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 != 0) {
              stackIn_3_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (param1 == -1) {
                  break L1;
                } else {
                  var9 = (String) null;
                  qf.a((String) null, 3);
                  break L1;
                }
              }
              L2: {
                if ((1 & param3[param2][2 * param4 + param6].a(true, false)) == 0) {
                  stackIn_9_0 = 0;
                  break L2;
                } else {
                  stackIn_9_0 = 1;
                  break L2;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var8 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var8);

            stackIn_12_1 = new StringBuilder().append("qf.U(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L3;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L4;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L4;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_13_0), stackIn_16_2 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          return stackIn_9_0 != 0;
        }
    }

    final static void h(int param0) {
        int var1_int = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        var4 = CrazyCrystals.field_B;
        try {
          L0: {
            L1: {
              var1_int = ga.field_J[0];
              if (param0 == -30693) {
                break L1;
              } else {
                qf.e((byte) 69);
                break L1;
              }
            }
            var2 = 1;
            L2: while (true) {
              if (ga.field_J.length <= var2) {
                break L0;
              } else {
                var3 = ga.field_J[var2];
                eg.a(gh.field_E, var2 << -912507484, gh.field_E, var1_int, var3);
                var1_int = var1_int + var3;
                var2++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw dn.a((Throwable) ((Object) var1), "qf.BA(" + param0 + ')');
        }
    }

    private final boolean a(byte param0, int param1, int param2, f[][] param3) {
        int stackIn_2_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_35_0 = 0;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_39_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        try {
          L0: {
            if (0 == (this.field_o | this.field_s)) {
              if (this.field_j) {
                stackIn_6_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (param0 == 68) {
                  var5_int = param3[param1 + 1][param2].a(true, true);
                  if (0 == (var5_int & 2)) {
                    L1: {
                      if (-1 == (4 & var5_int ^ -1)) {
                        stackIn_16_0 = 0;
                        break L1;
                      } else {
                        stackIn_16_0 = 1;
                        break L1;
                      }
                    }
                    L2: {
                      var6 = stackIn_16_0;
                      if (0 == (var5_int & 8)) {
                        stackIn_19_0 = 0;
                        break L2;
                      } else {
                        stackIn_19_0 = 1;
                        break L2;
                      }
                    }
                    L3: {
                      var7 = stackIn_19_0;
                      if (var6 != 0) {
                        L4: {
                          if (!this.c(0, param1, -1 + param2, param3)) {
                            stackIn_24_0 = 0;
                            break L4;
                          } else {
                            stackIn_24_0 = 1;
                            break L4;
                          }
                        }
                        var6 = stackIn_24_0;
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    L5: {
                      if (var7 == 0) {
                        break L5;
                      } else {
                        L6: {
                          if (!this.c(0, param1, 1 + param2, param3)) {
                            stackIn_29_0 = 0;
                            break L6;
                          } else {
                            stackIn_29_0 = 1;
                            break L6;
                          }
                        }
                        var7 = stackIn_29_0;
                        break L5;
                      }
                    }
                    L7: {
                      L8: {
                        if (var6 != 0) {
                          break L8;
                        } else {
                          if (var7 == 0) {
                            stackIn_35_0 = 0;
                            break L7;
                          } else {
                            break L8;
                          }
                        }
                      }
                      stackIn_35_0 = 1;
                      break L7;
                    }
                    decompiledRegionSelector0 = 4;
                    break L0;
                  } else {
                    stackIn_12_0 = 1;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  }
                } else {
                  stackIn_9_0 = 1;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              }
            } else {
              stackIn_2_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var5 = decompiledCaughtException;
            stackIn_38_0 = (RuntimeException) (var5);

            stackIn_38_1 = new StringBuilder().append("qf.JA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_39_0 = (RuntimeException) ((Object) stackIn_38_0);
              stackIn_39_1 = (StringBuilder) ((Object) stackIn_38_1);
              stackIn_39_2 = "null";
              break L9;
            } else {
              stackIn_39_0 = (RuntimeException) ((Object) stackIn_38_0);
              stackIn_39_1 = (StringBuilder) ((Object) stackIn_38_1);
              stackIn_39_2 = "{...}";
              break L9;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_39_0), stackIn_39_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_9_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_12_0 != 0;
              } else {
                return stackIn_35_0 != 0;
              }
            }
          }
        }
    }

    public static void e(byte param0) {
        field_t = null;
        if (param0 != -72) {
            field_t = (String[]) null;
            field_w = null;
            return;
        }
        field_w = null;
    }

    sl a(f[][] param0, int param1, boolean param2, int param3, int param4, int param5) {
        RuntimeException var7 = null;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        sl stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              mb.field_g = mb.field_g + ob.field_l;
              wd.field_j = wd.field_j + 1;
              b.field_a = b.field_a + -2;
              je.field_j = je.field_j + -2;
              fp.field_a = fp.field_a + -4;
              we.field_h = we.field_h + -4;
              stackIn_2_0 = this;

              if (!param2) {
                stackIn_3_0 = this;
                stackIn_3_1 = 0;
                break L1;
              } else {
                stackIn_3_0 = this;
                stackIn_3_1 = 1;
                break L1;
              }
            }
            ((qf) (this)).field_v = stackIn_3_1 != 0;
            this.field_u = false;
            stackIn_4_0 = super.a(param0, param1, false, param3, param4, param5);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var7 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var7);

            stackIn_7_1 = new StringBuilder().append("qf.R(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L2;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        return stackIn_4_0;
    }

    final f a(sl param0, f[][] param1, int param2, int param3, int param4, int param5, int param6) {
        RuntimeException var8 = null;
        f stackIn_5_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param4 == 17512) {
                break L1;
              } else {
                field_w = (ko) null;
                break L1;
              }
            }
            L2: {
              if (1 != param5) {
                break L2;
              } else {
                this.field_v = true;
                break L2;
              }
            }
            stackIn_5_0 = super.a(param0, param1, param2, param3, 17512, param5, param6);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var8 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var8);

            stackIn_8_1 = new StringBuilder().append("qf.I(");

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
          L4: {


            stackIn_11_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',');

            if (param1 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L4;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L4;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_9_0), stackIn_12_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        return stackIn_5_0;
    }

    private final boolean a(int param0, byte param1, f[][] param2, int param3) {
        int stackIn_2_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_19_0 = 0;
        Object stackIn_23_0 = null;
        int stackIn_23_1 = 0;
        int stackIn_23_2 = 0;
        Object stackIn_24_0 = null;
        int stackIn_24_1 = 0;
        int stackIn_24_2 = 0;
        int stackIn_24_3 = 0;
        f stackIn_26_0 = null;
        int stackIn_26_1 = 0;
        int stackIn_26_2 = 0;
        f stackIn_27_0;
        int stackIn_27_1;
        int stackIn_27_2;
        int stackIn_27_3;
        int stackIn_29_0 = 0;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        try {
          L0: {
            if (param1 == 94) {
              L1: {
                if (0 != (param2[param3][param0].a(true, false) & 1)) {
                  stackIn_6_0 = 0;
                  break L1;
                } else {
                  stackIn_6_0 = 1;
                  break L1;
                }
              }
              L2: {
                var5_int = stackIn_6_0;
                if (-1 != (2 & param2[param3 + 1][param0].a(true, false) ^ -1)) {
                  stackIn_9_0 = 0;
                  break L2;
                } else {
                  stackIn_9_0 = 1;
                  break L2;
                }
              }
              L3: {
                var6 = stackIn_9_0;
                if (var5_int == 0) {
                  break L3;
                } else {
                  if (var6 != 0) {
                    L4: {
                      var7 = param2[param3][param0].a(false) & param2[1 + param3][param0].a(false);
                      if (var7 == 0) {
                        break L4;
                      } else {
                        L5: {
                          var8 = param2[param3][param0].b(-3445);
                          var9 = param2[1 + param3][param0].b(-3445);
                          stackIn_23_0 = this;

                          stackIn_23_1 = var7;

                          stackIn_23_2 = 1;

                          if (var8 > var9) {
                            stackIn_24_0 = this;
                            stackIn_24_1 = stackIn_23_1;
                            stackIn_24_2 = stackIn_23_2;
                            stackIn_24_3 = var8;
                            break L5;
                          } else {
                            stackIn_24_0 = this;
                            stackIn_24_1 = stackIn_23_1;
                            stackIn_24_2 = stackIn_23_2;
                            stackIn_24_3 = var9;
                            break L5;
                          }
                        }
                        L6: {
                          this.a(stackIn_24_1, stackIn_24_2 != 0, stackIn_24_3);
                          stackIn_26_0 = this.field_l;

                          stackIn_26_1 = var7;

                          stackIn_26_2 = 1;

                          if (var8 <= var9) {
                            stackIn_27_0 = (f) ((Object) stackIn_26_0);
                            stackIn_27_1 = stackIn_26_1;
                            stackIn_27_2 = stackIn_26_2;
                            stackIn_27_3 = var9;
                            break L6;
                          } else {
                            stackIn_27_0 = (f) ((Object) stackIn_26_0);
                            stackIn_27_1 = stackIn_26_1;
                            stackIn_27_2 = stackIn_26_2;
                            stackIn_27_3 = var8;
                            break L6;
                          }
                        }
                        ((f) (Object) stackIn_27_0).a(stackIn_27_1, stackIn_27_2 != 0, stackIn_27_3);
                        break L4;
                      }
                    }
                    stackIn_29_0 = 0;
                    decompiledRegionSelector0 = 4;
                    break L0;
                  } else {
                    break L3;
                  }
                }
              }
              if (var5_int != 0) {
                this.a((byte) 97, param2[param3][param0]);
                this.field_l.a((byte) 90, param2[param3][param0]);
                stackIn_19_0 = 0;
                decompiledRegionSelector0 = 3;
                break L0;
              } else {
                if (var6 != 0) {
                  this.a((byte) 112, param2[param3 + 1][param0]);
                  this.field_l.a((byte) 71, param2[1 + param3][param0]);
                  stackIn_17_0 = 0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  stackIn_15_0 = 1;
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
            } else {
              stackIn_2_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var5 = decompiledCaughtException;
            stackIn_32_0 = (RuntimeException) (var5);

            stackIn_32_1 = new StringBuilder().append("qf.DA(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_33_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "null";
              break L7;
            } else {
              stackIn_33_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "{...}";
              break L7;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_33_0), stackIn_33_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_15_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_17_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_19_0 != 0;
              } else {
                return stackIn_29_0 != 0;
              }
            }
          }
        }
    }

    final f a(int param0, int param1, f[][] param2, int param3, int param4, int param5, ea param6) {
        RuntimeException var8 = null;
        am stackIn_6_0 = null;
        Object stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param3 == -31135) {
                break L1;
              } else {
                qf.e((byte) 15);
                break L1;
              }
            }
            L2: {
              if (0 != (this.field_o | this.field_s)) {
                break L2;
              } else {
                L3: {
                  fp.field_a = fp.field_a + 10;
                  we.field_h = we.field_h + 10;
                  b.field_a = b.field_a + 5;
                  je.field_j = je.field_j + 5;
                  mb.field_g = mb.field_g + 12;
                  fn.field_j = fn.field_j + 12;
                  if (!(this instanceof cj)) {
                    stackIn_6_0 = td.field_e;
                    break L3;
                  } else {
                    stackIn_6_0 = dn.field_d;
                    break L3;
                  }
                }
                ((am) (Object) stackIn_6_0).a(128, 12 * param1, param4 * 12, 60, (byte) -111);
                this.a((byte) 111, param6);
                this.field_l.a((byte) 83, param6);
                this.a(param2, param4, false, param0, param1, param5);
                break L2;
              }
            }
            stackIn_8_0 = this;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var8 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var8);

            stackIn_11_1 = new StringBuilder().append("qf.P(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L4;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_14_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');

            if (param6 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L5;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L5;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_12_0), stackIn_15_2 + ')');
        }
        return (f) (this);
    }

    static {
        field_t = new String[]{"£3.20", "€4.25", "US$ 5.00", "Can$ 4.95", "Aus$ 6.50", "Krn 29.95", "", "Rp 160", "Rng 17.95", "NZ$ 7.95", "SG$ 6.95", "Krn 44.95", "R$ 7,00"};
    }
}
