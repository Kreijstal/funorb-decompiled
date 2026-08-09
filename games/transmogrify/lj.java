/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class lj extends qg {
    private boolean field_v;
    static bb field_u;
    boolean field_t;
    static double field_x;
    static hi field_z;
    private boolean field_w;
    boolean field_y;

    final static int a(int param0, char param1, CharSequence param2) {
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var6 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            var3_int = 0;
            var4 = param2.length();
            var5 = 0;
            L1: while (true) {
              L2: {
                L3: {
                  L4: {
                    if (var4 <= var5) {
                      break L4;
                    } else {
                      var8 = param1 ^ -1;
                      var7 = param2.charAt(var5) ^ -1;
                      if (var6 != 0) {
                        if (var7 >= var8) {
                          break L2;
                        } else {
                          break L3;
                        }
                      } else {
                        L5: {
                          if (var7 != var8) {
                            break L5;
                          } else {
                            var3_int++;
                            break L5;
                          }
                        }
                        var5++;
                        if (var6 == 0) {
                          continue L1;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                  if (param0 >= 120) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
                field_x = 0.6750055556683646;
                break L2;
              }
              stackIn_13_0 = var3_int;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3 = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var3);

            stackIn_16_1 = new StringBuilder().append("lj.NA(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L6;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L6;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ')');
        }
        return stackIn_13_0;
    }

    public static void c(boolean param0) {
        if (!param0) {
            field_x = -1.0687482226304967;
            field_z = null;
            field_u = null;
            return;
        }
        field_z = null;
        field_u = null;
    }

    boolean a(qg param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (!this.field_t) {
                break L1;
              } else {
                if (!this.field_v) {
                  break L1;
                } else {
                  L2: {
                    param0.e(-29113);
                    this.field_w = true;
                    if (this.field_m == null) {
                      break L2;
                    } else {
                      if (!(this.field_m instanceof la)) {
                        break L2;
                      } else {
                        ((la) ((Object) this.field_m)).a((qg) (this), (byte) -73, this.field_w);
                        break L2;
                      }
                    }
                  }
                  if (param1 < -11) {
                    stackIn_11_0 = 1;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    this.field_t = false;
                    return true;
                  }
                }
              }
            }
            stackIn_4_0 = 0;
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var3);

            stackIn_14_1 = new StringBuilder().append("lj.M(");

            if (param0 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L3;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L3;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          return stackIn_11_0 != 0;
        }
    }

    final static void d(byte param0) {
        int var1 = -62 / ((37 - param0) / 44);
        tb.a(ha.b(119), true);
    }

    lj(String param0, ui param1, ma param2) {
        super(param0, param1, param2);
        this.field_t = true;
        this.field_w = false;
        this.field_v = true;
    }

    lj(String param0, ma param1) {
        this(param0, vi.field_e.field_d, param1);
    }

    boolean a(int param0, qg param1, byte param2, char param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int stackIn_5_0 = 0;
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
            L1: {
              var5_int = 15 % ((param2 - 65) / 55);
              if (!this.b((byte) 109)) {
                break L1;
              } else {
                L2: {
                  if ((param0 ^ -1) == -85) {
                    break L2;
                  } else {
                    if ((param0 ^ -1) != -84) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                this.a((byte) -102, -1, 1, -1);
                stackIn_5_0 = 1;
                decompiledRegionSelector0 = 0;
                break L0;
              }
            }
            stackIn_7_0 = 0;
            decompiledRegionSelector0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var5);

            stackIn_10_1 = new StringBuilder().append("lj.K(").append(param0).append(',');

            if (param1 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0 != 0;
        } else {
          return stackIn_7_0 != 0;
        }
    }

    void a(byte param0, int param1, int param2, int param3) {
        int var5;
        var5 = 23 / ((50 - param0) / 45);
        if (this.field_m != null) {
          if (!(this.field_m instanceof df)) {
            return;
          } else {
            ((df) ((Object) this.field_m)).a((lj) (this), 17, param1, param2, param3);
            return;
          }
        } else {
          return;
        }
    }

    final StringBuilder a(int param0, int param1, StringBuilder param2, Hashtable param3) {
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        RuntimeException var5 = null;
        StringBuilder stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 < -20) {
                break L1;
              } else {
                this.a((byte) 29, 113, 50, 108);
                break L1;
              }
            }
            L2: {
              if (!this.a((byte) -105, param3, param2, param0)) {
                break L2;
              } else {
                L3: {
                  this.a(param2, 74, param0, param3);
                  if (!this.field_y) {
                    break L3;
                  } else {
                    discarded$2 = param2.append(" active");
                    break L3;
                  }
                }
                if (!this.field_t) {
                  discarded$3 = param2.append(" disabled");
                  break L2;
                } else {
                  break L2;
                }
              }
            }
            stackIn_9_0 = (StringBuilder) (param2);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var5);

            stackIn_12_1 = new StringBuilder().append("lj.Q(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');

            if (param3 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L5;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L5;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_13_0), stackIn_16_2 + ')');
        }
        return stackIn_9_0;
    }

    void a(int param0, byte param1, qg param2, int param3) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              super.a(param0, param1, param2, param3);
              if (0 == this.field_s) {
                break L1;
              } else {
                if (this.field_s != b.field_k) {
                  L2: {
                    if (!this.b(param3, param0, param1 + 11, oa.field_j, bk.field_a)) {
                      break L2;
                    } else {
                      if (0 == b.field_k) {
                        this.a((byte) -105, -param0 + bk.field_a, this.field_s, -param3 + oa.field_j);
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                  }
                  this.a(param0, oa.field_j, param2, -1, bk.field_a, param3);
                  break L1;
                } else {
                  return;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            runtimeException = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (runtimeException);

            stackIn_11_1 = new StringBuilder().append("lj.B(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L3;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L3;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param3 + ')');
        }
    }

    boolean b(int param0, int param1, qg param2, int param3, int param4, int param5, int param6) {
        RuntimeException var8 = null;
        int stackIn_6_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (!this.field_t) {
                break L1;
              } else {
                if (!this.b(param3, param6, param4 ^ 30385, param0, param5)) {
                  break L1;
                } else {
                  L2: {
                    this.a(param2, param4 + 30272);
                    this.field_s = param1;
                    if (null == this.field_m) {
                      break L2;
                    } else {
                      if (!(this.field_m instanceof lg)) {
                        break L2;
                      } else {
                        ((lg) ((Object) this.field_m)).a(31298, param0, param5, param3, param1, param6, (lj) (this));
                        break L2;
                      }
                    }
                  }
                  stackIn_6_0 = 1;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            }
            if (param4 == -30386) {
              stackIn_10_0 = 0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              this.field_y = false;
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var8 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var8);

            stackIn_13_1 = new StringBuilder().append("lj.O(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
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
          throw ch.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0 != 0;
        } else {
          return stackIn_10_0 != 0;
        }
    }

    final boolean b(byte param0) {
        int var2 = 10 % ((-57 - param0) / 46);
        return this.field_w;
    }

    final void a(int param0, int param1, qg param2, int param3, int param4, int param5) {
        try {
            if (param3 != -1) {
                lj.d((byte) 20);
            }
            if (this.field_m != null) {
                if (!(!(this.field_m instanceof lg))) {
                    ((lg) ((Object) this.field_m)).a((lj) (this), param1, 9976, param4, param0, param5);
                }
            }
            this.field_s = 0;
        } catch (RuntimeException runtimeException) {
            throw ch.a((Throwable) ((Object) runtimeException), "lj.BA(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final void e(int param0) {
        if (this.field_w) {
          this.field_w = false;
          if (null != this.field_m) {
            if (!(this.field_m instanceof la)) {
              if (param0 != -29113) {
                this.field_y = true;
                return;
              } else {
                return;
              }
            } else {
              ((la) ((Object) this.field_m)).a((qg) (this), (byte) -42, this.field_w);
              if (param0 != -29113) {
                this.field_y = true;
                return;
              } else {
                return;
              }
            }
          } else {
            if (param0 != -29113) {
              this.field_y = true;
              return;
            } else {
              return;
            }
          }
        } else {
          if (param0 != -29113) {
            this.field_y = true;
            return;
          } else {
            return;
          }
        }
    }

    final static String a(boolean param0, String param1, java.applet.Applet param2) {
        try {
            String var3 = null;
            RuntimeException var3_ref = null;
            String[] var4 = null;
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            String stackIn_3_0 = null;
            String stackIn_12_0 = null;
            Object stackIn_17_0 = null;
            RuntimeException stackIn_20_0 = null;
            StringBuilder stackIn_20_1 = null;
            RuntimeException stackIn_21_0 = null;
            StringBuilder stackIn_21_1 = null;
            String stackIn_21_2 = null;
            StringBuilder stackIn_23_1 = null;
            StringBuilder stackIn_24_1 = null;
            String stackIn_24_2 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            Throwable decompiledCaughtException = null;
            Throwable var3_ref2 = null;
            var7 = Transmogrify.field_A ? 1 : 0;
            try {
              L0: {
                try {
                  L1: {
                    if (param0) {
                      var3 = (String) (kj.a(param2, false, "getcookies"));
                      var4 = vi.a(';', var3, 0);
                      var5 = 0;
                      L2: while (true) {
                        L3: {
                          if (var4.length <= var5) {
                            break L3;
                          } else {
                            var6 = var4[var5].indexOf('=');
                            if (var7 == 0) {
                              L4: {
                                if (var6 < 0) {
                                  break L4;
                                } else {
                                  if (var4[var5].substring(0, var6).trim().equals(param1)) {
                                    stackIn_12_0 = var4[var5].substring(1 + var6).trim();
                                    decompiledRegionSelector0 = 2;
                                    break L1;
                                  } else {
                                    break L4;
                                  }
                                }
                              }
                              var5++;
                              if (var7 == 0) {
                                continue L2;
                              } else {
                                break L3;
                              }
                            } else {
                              return null;
                            }
                          }
                        }
                        decompiledRegionSelector0 = 1;
                        break L1;
                      }
                    } else {
                      stackIn_3_0 = (String) null;
                      decompiledRegionSelector0 = 0;
                      break L1;
                    }
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L5: {
                    var3_ref2 = decompiledCaughtException;
                    decompiledRegionSelector0 = 1;
                    break L5;
                  }
                }
                if (decompiledRegionSelector0 == 0) {
                  decompiledRegionSelector1 = 1;
                  break L0;
                } else {
                  if (decompiledRegionSelector0 == 1) {
                    stackIn_17_0 = null;
                    decompiledRegionSelector1 = 0;
                    break L0;
                  } else {
                    decompiledRegionSelector1 = 2;
                    break L0;
                  }
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L6: {
                var3_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_20_0 = (RuntimeException) (var3_ref);

                stackIn_20_1 = new StringBuilder().append("lj.MA(").append(param0).append(',');

                if (param1 == null) {
                  stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
                  stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
                  stackIn_21_2 = "null";
                  break L6;
                } else {
                  stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
                  stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
                  stackIn_21_2 = "{...}";
                  break L6;
                }
              }
              L7: {


                stackIn_23_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_21_2).append(',');

                if (param2 == null) {
                  stackIn_21_0 = (RuntimeException) ((Object) stackIn_21_0);
                  stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
                  stackIn_24_2 = "null";
                  break L7;
                } else {
                  stackIn_21_0 = (RuntimeException) ((Object) stackIn_21_0);
                  stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
                  stackIn_24_2 = "{...}";
                  break L7;
                }
              }
              throw ch.a((Throwable) ((Object) stackIn_21_0), stackIn_24_2 + ')');
            }
            if (decompiledRegionSelector1 == 0) {
              return (String) ((Object) stackIn_17_0);
            } else {
              if (decompiledRegionSelector1 == 1) {
                return stackIn_3_0;
              } else {
                return stackIn_12_0;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    protected lj() {
        this.field_t = true;
        this.field_w = false;
        this.field_v = true;
        this.field_q = vi.field_e.field_o;
    }

    static {
        field_x = 0.0;
    }
}
