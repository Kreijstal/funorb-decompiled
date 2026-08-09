/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class td extends al implements je {
    ja field_B;

    final StringBuilder a(boolean param0, Hashtable param1, StringBuilder param2, int param3) {
        RuntimeException var5 = null;
        StringBuilder stackIn_5_0 = null;
        StringBuilder stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (this.a((byte) 122, param3, param2, param1)) {
                this.a(34, param2, param3, param1);
                this.a((byte) -62, param3, param1, param2);
                break L1;
              } else {
                break L1;
              }
            }
            if (!param0) {
              stackIn_7_0 = (StringBuilder) (param2);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_5_0 = (StringBuilder) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var5);

            stackIn_10_1 = new StringBuilder().append("td.BB(").append(param0).append(',');

            if (param1 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');

            if (param2 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L3;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L3;
            }
          }
          throw sl.a((Throwable) ((Object) stackIn_11_0), stackIn_14_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0;
        } else {
          return stackIn_7_0;
        }
    }

    td(int param0, int param1, int param2, int param3, t param4) {
        super(param0, param1, param2, param3, param4, (tg) null);
        this.field_B = new ja();
    }

    final boolean a(al param0, int param1) {
        RuntimeException var3 = null;
        int var4 = 0;
        al var5 = null;
        ue var6 = null;
        al var7 = null;
        int var8 = 0;
        ue var9 = null;
        int stackIn_4_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_18_0 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var8 = TrackController.field_F ? 1 : 0;
        try {
          L0: {
            if (this.field_B.b(false)) {
              stackIn_4_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              var9 = new ue(this.field_B);
              var4 = 61 % ((53 - param1) / 47);
              var5 = (al) ((Object) var9.a(53));
              L1: while (true) {
                if (var5 == null) {
                  stackIn_18_0 = 0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  L2: {
                    if (var5.h(-118)) {
                      var6 = new ue(this.field_B);
                      var6.a(true, var5);
                      var7 = (al) ((Object) var6.c(-114));
                      L3: while (true) {
                        if (var7 == null) {
                          break L2;
                        } else {
                          if (var7.a((byte) -127, param0)) {
                            stackIn_14_0 = 1;
                            decompiledRegionSelector0 = 1;
                            break L0;
                          } else {
                            var7 = (al) ((Object) var6.c(-128));
                            continue L3;
                          }
                        }
                      }
                    } else {
                      break L2;
                    }
                  }
                  var5 = (al) ((Object) var9.c(-106));
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackIn_21_0 = (RuntimeException) (var3);

            stackIn_21_1 = new StringBuilder().append("td.CC(");

            if (param0 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L4;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L4;
            }
          }
          throw sl.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_14_0 != 0;
          } else {
            return stackIn_18_0 != 0;
          }
        }
    }

    final boolean a(al param0, boolean param1) {
        RuntimeException var3 = null;
        al var4 = null;
        ue var5 = null;
        al var6 = null;
        int var7 = 0;
        ue var8 = null;
        int stackIn_3_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_17_0 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var7 = TrackController.field_F ? 1 : 0;
        try {
          L0: {
            if (!this.field_B.b(false)) {
              var8 = new ue(this.field_B);
              var4 = (al) ((Object) var8.d(-47));
              L1: while (true) {
                if (var4 == null) {
                  if (param1) {
                    stackIn_17_0 = 0;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    this.field_B = (ja) null;
                    return false;
                  }
                } else {
                  L2: {
                    if (!var4.h(-92)) {
                      break L2;
                    } else {
                      var5 = new ue(this.field_B);
                      var5.a((byte) -37, var4);
                      var6 = (al) ((Object) var5.e(37));
                      L3: while (true) {
                        if (var6 == null) {
                          break L2;
                        } else {
                          if (!var6.a((byte) -123, param0)) {
                            var6 = (al) ((Object) var5.e(37));
                            continue L3;
                          } else {
                            stackIn_11_0 = 1;
                            decompiledRegionSelector0 = 1;
                            break L0;
                          }
                        }
                      }
                    }
                  }
                  var4 = (al) ((Object) var8.e(37));
                  continue L1;
                }
              }
            } else {
              stackIn_3_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackIn_20_0 = (RuntimeException) (var3);

            stackIn_20_1 = new StringBuilder().append("td.DC(");

            if (param0 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L4;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L4;
            }
          }
          throw sl.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_11_0 != 0;
          } else {
            return stackIn_17_0 != 0;
          }
        }
    }

    private final void i(int param0) {
        int var4 = TrackController.field_F ? 1 : 0;
        if (param0 != 0) {
            this.a(67, 29, 21, 61, -112);
        }
        ue var2 = new ue(this.field_B);
        al var3 = (al) ((Object) var2.d(120));
        while (var3 != null) {
            var3.g(119);
            var3 = (al) ((Object) var2.e(param0 ^ 37));
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        super.a(param0, param1, param2, param3, param4);
        this.i(0);
    }

    final boolean a(int param0, int param1, int param2, int param3, int param4, al param5, byte param6) {
        ue var8 = null;
        RuntimeException var8_ref = null;
        al var9 = null;
        int var10 = 0;
        int stackIn_3_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var10 = TrackController.field_F ? 1 : 0;
        try {
          L0: {
            var8 = new ue(this.field_B);
            var9 = (al) ((Object) var8.d(81));
            if (param6 == 127) {
              L1: while (true) {
                L2: {
                  if (var9 == null) {
                    break L2;
                  } else {
                    if (!var9.b(param6 + 10000409)) {
                      break L2;
                    } else {
                      L3: {
                        if (!var9.h(-85)) {
                          break L3;
                        } else {
                          if (var9.a(param0, param1, param2, param3, param4, param5, (byte) 127)) {
                            stackIn_10_0 = 1;
                            decompiledRegionSelector0 = 1;
                            break L0;
                          } else {
                            break L3;
                          }
                        }
                      }
                      var9 = (al) ((Object) var8.e(37));
                      continue L1;
                    }
                  }
                }
                stackIn_13_0 = 0;
                decompiledRegionSelector0 = 2;
                break L0;
              }
            } else {
              stackIn_3_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var8_ref = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var8_ref);

            stackIn_16_1 = new StringBuilder().append("td.PA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L4;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L4;
            }
          }
          throw sl.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_10_0 != 0;
          } else {
            return stackIn_13_0 != 0;
          }
        }
    }

    final boolean a(al param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        ue var8 = null;
        RuntimeException var8_ref = null;
        al var9 = null;
        int var10 = 0;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var10 = TrackController.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              var8 = new ue(this.field_B);
              if (param4 == 0) {
                break L1;
              } else {
                this.field_B = (ja) null;
                break L1;
              }
            }
            var9 = (al) ((Object) var8.d(-126));
            L2: while (true) {
              L3: {
                if (var9 == null) {
                  break L3;
                } else {
                  if (!var9.b(10000536)) {
                    break L3;
                  } else {
                    if (!var9.a(param0, param1, param2, param3, param4 ^ 0, param5 + this.field_p, this.field_m + param6)) {
                      var9 = (al) ((Object) var8.e(37));
                      continue L2;
                    } else {
                      stackIn_8_0 = 1;
                      decompiledRegionSelector0 = 0;
                      break L0;
                    }
                  }
                }
              }
              stackIn_11_0 = 0;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var8_ref = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var8_ref);

            stackIn_14_1 = new StringBuilder().append("td.R(");

            if (param0 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L4;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L4;
            }
          }
          throw sl.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_8_0 != 0;
        } else {
          return stackIn_11_0 != 0;
        }
    }

    final int c(byte param0) {
        int var2;
        ue var3;
        al var4;
        int var5;
        int var6;
        var6 = TrackController.field_F ? 1 : 0;
        var2 = 0;
        var3 = new ue(this.field_B);
        var4 = (al) ((Object) var3.d(0));
        L0: while (true) {
          if (var4 == null) {
            L1: {
              if (param0 == -14) {
                break L1;
              } else {
                this.a(123, 7, -116, -2);
                break L1;
              }
            }
            return var2;
          } else {
            L2: {
              var5 = var4.c((byte) -14);
              if ((var2 ^ -1) > (var5 ^ -1)) {
                var2 = var5;
                break L2;
              } else {
                break L2;
              }
            }
            var4 = (al) ((Object) var3.e(37));
            continue L0;
          }
        }
    }

    al d(byte param0) {
        int var4 = TrackController.field_F ? 1 : 0;
        ue var2 = new ue(this.field_B);
        al var3 = (al) ((Object) var2.d(124));
        while (var3 != null) {
            if (!(!var3.h(-94))) {
                return var3;
            }
            var3 = (al) ((Object) var2.e(37));
        }
        if (param0 < -124) {
            return null;
        }
        this.field_B = (ja) null;
        return null;
    }

    final void a(boolean param0, al param1) {
        try {
            if (param0) {
                this.field_B = (ja) null;
            }
            this.field_B.a((byte) -125, param1);
        } catch (RuntimeException runtimeException) {
            throw sl.a((Throwable) ((Object) runtimeException), "td.EC(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final String e(int param0) {
        ue var2;
        al var3;
        String var4;
        int var5;
        al var6;
        L0: {
          var5 = TrackController.field_F ? 1 : 0;
          if (param0 == 0) {
            break L0;
          } else {
            var6 = (al) null;
            this.a((al) null, -92, 62, 7, -56, 58, -36);
            break L0;
          }
        }
        var2 = new ue(this.field_B);
        var3 = (al) ((Object) var2.d(86));
        L1: while (true) {
          if (var3 != null) {
            var4 = var3.e(0);
            if (var4 == null) {
              var3 = (al) ((Object) var2.e(param0 + 37));
              continue L1;
            } else {
              return var4;
            }
          } else {
            return null;
          }
        }
    }

    final void a(al param0, boolean param1, int param2, int param3, int param4, int param5) {
        ue var7 = null;
        al var8 = null;
        int var9 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7_ref = null;
        var9 = TrackController.field_F ? 1 : 0;
        try {
          L0: {
            var7 = new ue(this.field_B);
            var8 = (al) ((Object) var7.d(127));
            L1: while (true) {
              L2: {
                if (var8 == null) {
                  break L2;
                } else {
                  if (!var8.b(10000536)) {
                    break L2;
                  } else {
                    var8.a(param0, param1, param2, param3 + this.field_m, param4, param5 + this.field_p);
                    var8 = (al) ((Object) var7.e(37));
                    continue L1;
                  }
                }
              }
              L3: {
                if (!param1) {
                  break L3;
                } else {
                  this.f(77);
                  break L3;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var7_ref = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var7_ref);

            stackIn_10_1 = new StringBuilder().append("td.GB(");

            if (param0 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L4;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L4;
            }
          }
          throw sl.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final void f(int param0) {
        int var4 = TrackController.field_F ? 1 : 0;
        ue var2 = new ue(this.field_B);
        al var3 = (al) ((Object) var2.d(-58));
        while (var3 != null) {
            var3.f(-24174);
            var3 = (al) ((Object) var2.e(param0 ^ -24137));
        }
        if (param0 != -24174) {
            this.a(73, -81, 6, -13, -113);
        }
    }

    boolean a(byte param0, char param1, al param2, int param3) {
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        al var9 = null;
        ue var10 = null;
        int stackIn_7_0 = 0;
        boolean stackIn_14_0 = false;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var8 = TrackController.field_F ? 1 : 0;
        try {
          L0: {
            var6 = -126 % ((17 - param0) / 51);
            var10 = new ue(this.field_B);
            var9 = (al) ((Object) var10.d(125));
            L1: while (true) {
              L2: {
                if (var9 == null) {
                  break L2;
                } else {
                  if (!var9.b(10000536)) {
                    break L2;
                  } else {
                    L3: {
                      if (!var9.h(-119)) {
                        break L3;
                      } else {
                        if (!var9.a((byte) 103, param1, param2, param3)) {
                          break L3;
                        } else {
                          stackIn_7_0 = 1;
                          decompiledRegionSelector0 = 0;
                          break L0;
                        }
                      }
                    }
                    var9 = (al) ((Object) var10.e(37));
                    continue L1;
                  }
                }
              }
              var7 = param3;
              if (var7 == 80) {
                L4: {
                  if (!ni.field_m[81]) {
                    stackIn_14_0 = this.a(param2, true);
                    break L4;
                  } else {
                    stackIn_14_0 = this.a(param2, -27);
                    break L4;
                  }
                }
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                return false;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5 = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var5);

            stackIn_17_1 = new StringBuilder().append("td.GA(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L5;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L5;
            }
          }
          throw sl.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_7_0 != 0;
        } else {
          return stackIn_14_0;
        }
    }

    private final void a(byte param0, int param1, Hashtable param2, StringBuilder param3) {
        StringBuilder discarded$3 = null;
        StringBuilder discarded$4 = null;
        ue var5 = null;
        al var6 = null;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5_ref = null;
        var8 = TrackController.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == -62) {
                break L1;
              } else {
                this.field_B = (ja) null;
                break L1;
              }
            }
            var5 = new ue(this.field_B);
            var6 = (al) ((Object) var5.d(-99));
            L2: while (true) {
              if (var6 == null) {
                break L0;
              } else {
                discarded$3 = param3.append('\n');
                var7 = 0;
                L3: while (true) {
                  if (var7 > param1) {
                    var6.a(false, param2, param3, param1 + 1);
                    var6 = (al) ((Object) var5.e(37));
                    continue L2;
                  } else {
                    discarded$4 = param3.append(' ');
                    var7++;
                    continue L3;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5_ref = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var5_ref);

            stackIn_12_1 = new StringBuilder().append("td.FC(").append(param0).append(',').append(param1).append(',');

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
          throw sl.a((Throwable) ((Object) stackIn_13_0), stackIn_16_2 + ')');
        }
    }

    void a(int param0, int param1, int param2, int param3) {
        int var7 = TrackController.field_F ? 1 : 0;
        if (0 == param0) {
            if (!(null == this.field_y)) {
                this.field_y.a(-24969, (al) (this), param2, true, param1);
            }
        }
        ue var5 = new ue(this.field_B);
        al var6 = (al) ((Object) var5.a(79));
        while (var6 != null) {
            var6.a(param0, this.field_p + param1, this.field_m + param2, 29221);
            var6 = (al) ((Object) var5.c(param3 ^ -29291));
        }
        if (param3 != 29221) {
            this.field_B = (ja) null;
        }
    }

    final boolean a(byte param0, al param1) {
        ue var3 = null;
        RuntimeException var3_ref = null;
        al var4 = null;
        int var5 = 0;
        al var6 = null;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = TrackController.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              var3 = new ue(this.field_B);
              var4 = (al) ((Object) var3.d(-122));
              if (param0 < -104) {
                break L1;
              } else {
                var6 = (al) null;
                this.a(false, (al) null);
                break L1;
              }
            }
            L2: while (true) {
              if (var4 == null) {
                stackIn_9_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (!var4.a((byte) -114, param1)) {
                  var4 = (al) ((Object) var3.e(37));
                  continue L2;
                } else {
                  stackIn_6_0 = 1;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var3_ref);

            stackIn_12_1 = new StringBuilder().append("td.QA(").append(param0).append(',');

            if (param1 == null) {
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
          throw sl.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0 != 0;
        } else {
          return stackIn_9_0 != 0;
        }
    }

    final boolean h(int param0) {
        if (param0 > -83) {
            return true;
        }
        return this.d((byte) -127) != null ? true : false;
    }

    void a(int param0, int param1, byte param2, al param3) {
        ue var5 = null;
        al var6 = null;
        int var7 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5_ref = null;
        var7 = TrackController.field_F ? 1 : 0;
        try {
          L0: {
            super.a(param0, param1, param2, param3);
            var5 = new ue(this.field_B);
            var6 = (al) ((Object) var5.d(-66));
            L1: while (true) {
              L2: {
                if (var6 == null) {
                  break L2;
                } else {
                  if (!var6.b(10000536)) {
                    break L2;
                  } else {
                    var6.a(param0 - -this.field_m, this.field_p + param1, (byte) -124, param3);
                    var6 = (al) ((Object) var5.e(param2 ^ -95));
                    continue L1;
                  }
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5_ref = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var5_ref);

            stackIn_8_1 = new StringBuilder().append("td.EA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
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
          throw sl.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
    }

    static {
    }
}
