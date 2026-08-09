/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class aj extends qg implements pb {
    qj field_u;
    static String field_v;
    static java.awt.Frame field_t;

    final void a(int param0, int param1, int param2, int param3, int param4) {
        int var6 = 9 / ((-29 - param0) / 53);
        super.a(-93, param1, param2, param3, param4);
        this.j(-110);
    }

    final void a(int param0, int param1, qg param2, int param3, int param4, int param5) {
        RuntimeException runtimeException = null;
        tl var7 = null;
        qg var8 = null;
        int var9 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var9 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            var7 = new tl(this.field_u);
            if (param3 == -1) {
              var8 = (qg) ((Object) var7.c(param3 + -90));
              L1: while (true) {
                L2: {
                  if (var8 == null) {
                    break L2;
                  } else {
                    if (!var8.b(8)) {
                      break L2;
                    } else {
                      var8.a(this.field_n + param0, param1, param2, -1, param4, this.field_p + param5);
                      var8 = (qg) ((Object) var7.a(405142401));
                      if (var9 == 0) {
                        continue L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                }
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            runtimeException = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (runtimeException);

            stackIn_10_1 = new StringBuilder().append("aj.BA(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
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
          throw ch.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    void a(int param0, byte param1, qg param2, int param3) {
        RuntimeException runtimeException = null;
        tl var5 = null;
        qg var6 = null;
        int var7 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            super.a(param0, param1, param2, param3);
            var5 = new tl(this.field_u);
            var6 = (qg) ((Object) var5.c(-95));
            L1: while (true) {
              L2: {
                if (var6 == null) {
                  break L2;
                } else {
                  if (!var6.b(8)) {
                    break L2;
                  } else {
                    var6.a(param0 + this.field_n, (byte) -12, param2, param3 - -this.field_p);
                    var6 = (qg) ((Object) var5.a(param1 ^ -405142411));
                    if (var7 == 0) {
                      continue L1;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            runtimeException = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (runtimeException);

            stackIn_8_1 = new StringBuilder().append("aj.B(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
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
          throw ch.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param3 + ')');
        }
    }

    final boolean b(int param0, int param1, qg param2, int param3, int param4, int param5, int param6) {
        RuntimeException var8 = null;
        qg var9 = null;
        int var10 = 0;
        tl var11 = null;
        boolean stackIn_6_0 = false;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_5_0;
        var10 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              var11 = new tl(this.field_u);
              if (param4 == -30386) {
                break L1;
              } else {
                this.f(-5);
                break L1;
              }
            }
            var9 = (qg) ((Object) var11.c(-108));
            L2: while (true) {
              L3: {
                L4: {
                  if (var9 == null) {
                    break L4;
                  } else {
                    stackOut_5_0 = var9.b(8);
                    stackIn_12_0 = stackOut_5_0 ? 1 : 0;
                    stackIn_6_0 = stackOut_5_0;
                    if (var10 != 0) {
                      break L3;
                    } else {
                      if (!stackIn_6_0) {
                        break L4;
                      } else {
                        if (!var9.b(param0, param1, param2, param3 - -this.field_p, -30386, param5, this.field_n + param6)) {
                          var9 = (qg) ((Object) var11.a(405142401));
                          if (var10 == 0) {
                            continue L2;
                          } else {
                            break L4;
                          }
                        } else {
                          stackIn_9_0 = 1;
                          decompiledRegionSelector0 = 1;
                          break L0;
                        }
                      }
                    }
                  }
                }
                stackIn_12_0 = 0;
                break L3;
              }
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var8 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var8);

            stackIn_15_1 = new StringBuilder().append("aj.O(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L5;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L5;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_12_0 != 0;
        } else {
          return stackIn_9_0 != 0;
        }
    }

    final boolean a(qg param0, int param1) {
        tl var3 = null;
        RuntimeException var3_ref = null;
        qg var4 = null;
        int var5 = 0;
        int stackIn_3_0 = 0;
        boolean stackIn_7_0 = false;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_6_0;
        var5 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            var3 = new tl(this.field_u);
            if (param1 <= -11) {
              var4 = (qg) ((Object) var3.c(-117));
              L1: while (true) {
                L2: {
                  L3: {
                    if (var4 == null) {
                      break L3;
                    } else {
                      stackOut_6_0 = var4.a(param0, -87);
                      stackIn_13_0 = stackOut_6_0 ? 1 : 0;
                      stackIn_7_0 = stackOut_6_0;
                      if (var5 != 0) {
                        break L2;
                      } else {
                        if (stackIn_7_0) {
                          stackIn_10_0 = 1;
                          decompiledRegionSelector0 = 2;
                          break L0;
                        } else {
                          var4 = (qg) ((Object) var3.a(405142401));
                          if (var5 == 0) {
                            continue L1;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                  }
                  stackIn_13_0 = 0;
                  break L2;
                }
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_3_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var3_ref);

            stackIn_16_1 = new StringBuilder().append("aj.M(");

            if (param0 == null) {
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
          throw ch.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_13_0 != 0;
          } else {
            return stackIn_10_0 != 0;
          }
        }
    }

    final boolean b(byte param0) {
        int var2 = -52 % ((param0 - -57) / 46);
        return null != this.i(-124) ? true : false;
    }

    qg i(int param0) {
        tl var2;
        qg var3;
        int var4;
        var4 = Transmogrify.field_A ? 1 : 0;
        var2 = new tl(this.field_u);
        var3 = (qg) ((Object) var2.c(-123));
        if (param0 < -112) {
          L0: while (true) {
            if (var3 != null) {
              if (!var3.b((byte) 78)) {
                var3 = (qg) ((Object) var2.a(405142401));
                if (var4 == 0) {
                  continue L0;
                } else {
                  return null;
                }
              } else {
                return var3;
              }
            } else {
              return null;
            }
          }
        } else {
          return (qg) null;
        }
    }

    final StringBuilder a(int param0, int param1, StringBuilder param2, Hashtable param3) {
        RuntimeException var5 = null;
        qg var6 = null;
        StringBuilder stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (this.a((byte) -70, param3, param2, param0)) {
                this.a(param2, 68, param0, param3);
                this.a(-12060, param3, param2, param0);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (param1 <= -20) {
                break L2;
              } else {
                var6 = (qg) null;
                this.a((qg) null, (byte) -109);
                break L2;
              }
            }
            stackIn_6_0 = (StringBuilder) (param2);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var5);

            stackIn_9_1 = new StringBuilder().append("aj.Q(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');

            if (param3 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_10_0), stackIn_13_2 + ')');
        }
        return stackIn_6_0;
    }

    static long a(long param0, long param1) {
        return param0 ^ param1;
    }

    final int g(int param0) {
        int var2;
        tl var3;
        qg var4;
        int var5;
        int var6;
        int stackIn_7_0 = 0;
        var6 = Transmogrify.field_A ? 1 : 0;
        if (param0 < -41) {
          var2 = 0;
          var3 = new tl(this.field_u);
          var4 = (qg) ((Object) var3.c(-127));
          L0: while (true) {
            if (var4 != null) {
              var5 = var4.g(-68);
              stackIn_7_0 = var2 ^ -1;

              if (var6 == 0) {
                L1: {
                  if (stackIn_7_0 <= (var5 ^ -1)) {
                    break L1;
                  } else {
                    var2 = var5;
                    break L1;
                  }
                }
                var4 = (qg) ((Object) var3.a(405142401));
                if (var6 == 0) {
                  continue L0;
                } else {
                  return var2;
                }
              } else {
                return stackIn_7_0;
              }
            } else {
              return var2;
            }
          }
        } else {
          return -79;
        }
    }

    final void a(qg param0, byte param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              this.field_u.a(param0, -111);
              if (param1 < -77) {
                break L1;
              } else {
                field_t = (java.awt.Frame) null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("aj.IB(");

            if (param0 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L2;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param1 + ')');
        }
    }

    final static void k(int param0) {
        oh.field_h.field_p = param0;
        oh.field_h.field_k = 0;
    }

    final static void a(java.awt.Component param0, int param1, int param2, lc param3, boolean param4, int param5, fe param6, int param7) {
        RuntimeException runtimeException = null;
        ci var9 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        StringBuilder stackIn_8_1 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              qh.a(param5, param4, 10);
              re.field_h = qh.a(param6, param0, 0, param1);
              u.field_a = qh.a(param6, param0, 1, param7);
              of.field_a = new jc();
              pc.field_b = param7 * 1000 / param5;
              u.field_a.b(of.field_a);
              jk.field_D = param3;
              jk.field_D.a((byte) 107, lb.field_a);
              re.field_h.b(jk.field_D);
              if (param2 == 22290) {
                break L1;
              } else {
                var9 = (ci) null;
                aj.a((ci) null, (ci) null, (ci) null, -25);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("aj.JB(");

            if (param0 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_8_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L3;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_11_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',').append(param4).append(',').append(param5).append(',');

            if (param6 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L4;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L4;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_6_0), stackIn_12_2 + ',' + param7 + ')');
        }
    }

    final String f(int param0) {
        tl var2;
        qg var3;
        String var4;
        int var5;
        tl var6;
        tl var7;
        var5 = Transmogrify.field_A ? 1 : 0;
        if (param0 == 4) {
          var6 = new tl(this.field_u);
          var3 = (qg) ((Object) var6.c(-95));
          L0: while (true) {
            if (var3 != null) {
              var4 = var3.f(4);
              if (var4 != null) {
                return var4;
              } else {
                var3 = (qg) ((Object) var6.a(param0 + 405142397));
                if (var5 == 0) {
                  continue L0;
                } else {
                  return null;
                }
              }
            } else {
              return null;
            }
          }
        } else {
          aj.a(false, true, true, true);
          var7 = new tl(this.field_u);
          var2 = var7;
          var3 = (qg) ((Object) var7.c(-95));
          L1: while (true) {
            if (var3 != null) {
              var4 = var3.f(4);
              if (var4 != null) {
                return var4;
              } else {
                var3 = (qg) ((Object) var7.a(param0 + 405142397));
                if (var5 == 0) {
                  continue L1;
                } else {
                  return null;
                }
              }
            } else {
              return null;
            }
          }
        }
    }

    public static void h(int param0) {
        field_v = null;
        field_t = null;
        if (param0 == 32) {
            return;
        }
        aj.k(-45);
    }

    final static void a(ci param0, ci param1, ci param2, int param3) {
        int stackIn_10_0 = 0;
        int stackIn_18_0 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        RuntimeException var4 = null;
        ii[] var5 = null;
        ii[][] var6 = null;
        int[][] var7 = null;
        int var8 = 0;
        int var9 = 0;
        ii[] var10 = null;
        int var11_int = 0;
        ti var11 = null;
        ti var12 = null;
        int var13 = 0;
        ii[] var14 = null;
        ti var15 = null;
        int[][] var16 = null;
        ti var17 = null;
        ti var18 = null;
        int[][] var19 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var13 = Transmogrify.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        ua.field_f = kl.a(param2, (byte) 127, "commonui", "frame_top");
                        rh.field_l = kl.a(param2, (byte) 125, "commonui", "frame_bottom");
                        vf.field_a = pc.a("commonui", "jagex_logo_grey", param2, 113);
                        mc.field_b = kl.a(param2, (byte) 125, "commonui", "button");
                        ai.field_b = ik.a("commonui", param2, (byte) -46, "validation");
                        al.field_i = (kg) ((Object) ua.a(param2, "commonui", 32, param1, "arezzo12"));
                        vd.field_h = (kg) ((Object) ua.a(param2, "commonui", 32, param1, "arezzo14"));
                        rh.field_q = (kg) ((Object) ua.a(param2, "commonui", param3 + -2394310, param1, "arezzo14bold"));
                        var17 = new ti(param0.a("", (byte) 100, "button.gif"), (java.awt.Component) ((Object) gd.field_k));
                        gk.a("commonui", param3 ^ -2392393, param2, "dropdown");
                        var5 = ej.a((byte) -43, param2, "screen_options", "commonui");
                        kf.field_h = new ii[4];
                        fj.field_a = new ii[4];
                        eh.field_b = new ii[4];
                        var6 = new ii[][]{fj.field_a, kf.field_h, eh.field_b};
                        var19 = new int[4][];
                        var16 = var19;
                        var7 = var16;
                        var7[0] = var5[0].field_j;
                        var8 = 1;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (var19.length <= var8) {
                            statePc = 6;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var7[var8] = (int[]) ((Object) var19[0].clone());
                        var8++;
                        if (var13 != 0) {
                            statePc = 7;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (var13 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var8 = var5[0].field_i[0];
                        var19[2][var8] = 16777215;
                        var19[1][var8] = param3;
                        var19[3][var8] = 4767999;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var9 = 0;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (var9 >= 3) {
                            statePc = 17;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var14 = var6[var9];
                        var10 = var14;
                        stackIn_18_0 = 0;
                        stackIn_10_0 = stackIn_18_0;
                        if (var13 != 0) {
                            statePc = 18;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        var11_int = stackIn_10_0;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (var11_int >= var14.length) {
                            statePc = 15;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var14[var11_int] = qf.a(var5[var9], var19[var11_int], -2);
                        var11_int++;
                        if (var13 != 0) {
                            statePc = 16;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (var13 == 0) {
                            statePc = 11;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        var9++;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if (var13 == 0) {
                            statePc = 8;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        var9 = var17.field_m;
                        og.a((byte) 108);
                        var17.e();
                        stackIn_18_0 = 0;
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        sb.b(stackIn_18_0, 0, sb.field_c, sb.field_g);
                        var15 = new ti(var9, var9);
                        var18 = var15;
                        var18.e();
                        var17.f(0, 0);
                        var11 = new ti(var9, var9);
                        var11.e();
                        var17.f(-var17.field_n + var9, 0);
                        var12 = new ti(-(2 * var9) + var17.field_n, var9);
                        var12.e();
                        var17.f(-var9, 0);
                        fi.c(true);
                        mc.field_b = new ti[]{var15, var12, var11};
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 20: {
                    var4 = (RuntimeException) ((Object) caughtException);
                    stackIn_22_0 = (RuntimeException) (var4);
                    stackIn_21_0 = stackIn_22_0;
                    stackIn_22_1 = new StringBuilder().append("aj.QB(");
                    stackIn_21_1 = stackIn_22_1;
                    if (param0 == null) {
                        statePc = 22;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 21: {
                    stackIn_23_0 = (RuntimeException) ((Object) stackIn_21_0);
                    stackIn_23_1 = (StringBuilder) ((Object) stackIn_21_1);
                    stackIn_23_2 = "{...}";
                    statePc = 23;
                    continue stateLoop;
                }
                case 22: {
                    stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
                    stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
                    stackIn_23_2 = "null";
                    statePc = 23;
                    continue stateLoop;
                }
                case 23: {
                    stackIn_25_0 = (RuntimeException) ((Object) stackIn_23_0);
                    stackIn_24_0 = stackIn_25_0;
                    stackIn_25_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_23_2).append(',');
                    stackIn_24_1 = stackIn_25_1;
                    if (param1 == null) {
                        statePc = 25;
                    } else {
                        statePc = 24;
                    }
                    continue stateLoop;
                }
                case 24: {
                    stackIn_26_0 = (RuntimeException) ((Object) stackIn_24_0);
                    stackIn_26_1 = (StringBuilder) ((Object) stackIn_24_1);
                    stackIn_26_2 = "{...}";
                    statePc = 26;
                    continue stateLoop;
                }
                case 25: {
                    stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
                    stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
                    stackIn_26_2 = "null";
                    statePc = 26;
                    continue stateLoop;
                }
                case 26: {
                    stackIn_28_0 = (RuntimeException) ((Object) stackIn_26_0);
                    stackIn_27_0 = stackIn_28_0;
                    stackIn_28_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_26_2).append(',');
                    stackIn_27_1 = stackIn_28_1;
                    if (param2 == null) {
                        statePc = 28;
                    } else {
                        statePc = 27;
                    }
                    continue stateLoop;
                }
                case 27: {
                    stackIn_29_0 = (RuntimeException) ((Object) stackIn_27_0);
                    stackIn_29_1 = (StringBuilder) ((Object) stackIn_27_1);
                    stackIn_29_2 = "{...}";
                    statePc = 29;
                    continue stateLoop;
                }
                case 28: {
                    stackIn_29_0 = (RuntimeException) ((Object) stackIn_28_0);
                    stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
                    stackIn_29_2 = "null";
                    statePc = 29;
                    continue stateLoop;
                }
                case 29: {
                    throw ch.a((Throwable) ((Object) stackIn_29_0), stackIn_29_2 + ',' + param3 + ')');
                }
                case 30: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static String a(boolean param0, boolean param1, boolean param2, boolean param3) {
        int var4;
        var4 = 0;
        if (!param1) {
          if (!param3) {
            L0: {
              if (param2) {
                var4++;
                break L0;
              } else {
                break L0;
              }
            }
            if (!param0) {
              return (String) null;
            } else {
              return rf.field_cb[var4];
            }
          } else {
            L1: {
              var4 += 2;
              if (param2) {
                var4++;
                break L1;
              } else {
                break L1;
              }
            }
            if (!param0) {
              return (String) null;
            } else {
              return rf.field_cb[var4];
            }
          }
        } else {
          var4 += 4;
          if (param3) {
            L2: {
              var4 += 2;
              if (param2) {
                var4++;
                break L2;
              } else {
                break L2;
              }
            }
            if (!param0) {
              return (String) null;
            } else {
              return rf.field_cb[var4];
            }
          } else {
            L3: {
              if (param2) {
                var4++;
                break L3;
              } else {
                break L3;
              }
            }
            if (!param0) {
              return (String) null;
            } else {
              return rf.field_cb[var4];
            }
          }
        }
    }

    boolean a(int param0, qg param1, byte param2, char param3) {
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        qg var9 = null;
        tl var10 = null;
        boolean stackIn_4_0 = false;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        boolean stackIn_15_0 = false;
        int stackIn_17_0 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_3_0;
        var8 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            var6 = 26 % ((65 - param2) / 55);
            var10 = new tl(this.field_u);
            var9 = (qg) ((Object) var10.c(-117));
            L1: while (true) {
              L2: {
                L3: {
                  if (var9 == null) {
                    break L3;
                  } else {
                    stackOut_3_0 = var9.b(8);
                    stackIn_11_0 = stackOut_3_0 ? 1 : 0;
                    stackIn_4_0 = stackOut_3_0;
                    if (var8 != 0) {
                      break L2;
                    } else {
                      if (!stackIn_4_0) {
                        break L3;
                      } else {
                        L4: {
                          if (!var9.b((byte) -103)) {
                            break L4;
                          } else {
                            if (!var9.a(param0, param1, (byte) 125, param3)) {
                              break L4;
                            } else {
                              stackIn_8_0 = 1;
                              decompiledRegionSelector0 = 0;
                              break L0;
                            }
                          }
                        }
                        var9 = (qg) ((Object) var10.a(405142401));
                        if (var8 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                }
                stackIn_11_0 = param0;
                break L2;
              }
              var7 = stackIn_11_0;
              if (80 != var7) {
                stackIn_17_0 = 0;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                L5: {
                  if (ve.field_B[81]) {
                    stackIn_15_0 = this.a(2, param1);
                    break L5;
                  } else {
                    stackIn_15_0 = this.b(param1, 56);
                    break L5;
                  }
                }
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var5 = decompiledCaughtException;
            stackIn_20_0 = (RuntimeException) (var5);

            stackIn_20_1 = new StringBuilder().append("aj.K(").append(param0).append(',');

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
          throw ch.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_8_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_15_0;
          } else {
            return stackIn_17_0 != 0;
          }
        }
    }

    private final void j(int param0) {
        int var4 = Transmogrify.field_A ? 1 : 0;
        tl var2 = new tl(this.field_u);
        if (param0 > -72) {
            return;
        }
        qg var3 = (qg) ((Object) var2.c(-125));
        do {
            if (var3 == null) {
                return;
            }
            var3.c((byte) 38);
            var3 = (qg) ((Object) var2.a(405142401));
            if (var4 != 0) {
                return;
            }
        } while (var4 == 0);
    }

    final boolean b(qg param0, int param1) {
        RuntimeException var3 = null;
        qg var4 = null;
        tl var5 = null;
        qg var6 = null;
        int var7 = 0;
        tl var8 = null;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        boolean stackIn_10_0 = false;
        boolean stackIn_14_0 = false;
        int stackIn_17_0 = 0;
        int stackIn_21_0 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        int decompiledRegionSelector0 = 0;
        boolean stackOut_9_0;
        boolean stackOut_13_0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var7 = Transmogrify.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (!this.field_u.d(-1)) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        stackIn_3_0 = 0;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 3: {
                    return stackIn_3_0 != 0;
                }
                case 4: {
                    try {
                        var8 = new tl(this.field_u);
                        if (param1 > 44) {
                            statePc = 7;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        stackIn_6_0 = 1;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 6: {
                    return stackIn_6_0 != 0;
                }
                case 7: {
                    try {
                        var4 = (qg) ((Object) var8.c(-117));
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (var4 == null) {
                            statePc = 20;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        stackOut_9_0 = var4.b((byte) -118);
                        stackIn_21_0 = stackOut_9_0 ? 1 : 0;
                        stackIn_10_0 = stackOut_9_0;
                        if (var7 != 0) {
                            statePc = 21;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (!stackIn_10_0) {
                            statePc = 19;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var5 = new tl(this.field_u);
                        var5.a(var4, 95);
                        var6 = (qg) ((Object) var5.a(405142401));
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (var6 == null) {
                            statePc = 19;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        stackOut_13_0 = var6.a(param0, -30);
                        stackIn_21_0 = stackOut_13_0 ? 1 : 0;
                        stackIn_14_0 = stackOut_13_0;
                        if (var7 != 0) {
                            statePc = 21;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (stackIn_14_0) {
                            statePc = 16;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        stackIn_17_0 = 1;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 17: {
                    return stackIn_17_0 != 0;
                }
                case 18: {
                    try {
                        var6 = (qg) ((Object) var5.a(405142401));
                        if (var7 == 0) {
                            statePc = 12;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        var4 = (qg) ((Object) var8.a(405142401));
                        if (var7 == 0) {
                            statePc = 8;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        stackIn_21_0 = 0;
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 21: {
                    return stackIn_21_0 != 0;
                }
                case 22: {
                    var3 = (RuntimeException) ((Object) caughtException);
                    stackIn_24_0 = (RuntimeException) (var3);
                    stackIn_23_0 = stackIn_24_0;
                    stackIn_24_1 = new StringBuilder().append("aj.MB(");
                    stackIn_23_1 = stackIn_24_1;
                    if (param0 == null) {
                        statePc = 24;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 23: {
                    stackIn_25_0 = (RuntimeException) ((Object) stackIn_23_0);
                    stackIn_25_1 = (StringBuilder) ((Object) stackIn_23_1);
                    stackIn_25_2 = "{...}";
                    statePc = 25;
                    continue stateLoop;
                }
                case 24: {
                    stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
                    stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
                    stackIn_25_2 = "null";
                    statePc = 25;
                    continue stateLoop;
                }
                case 25: {
                    throw ch.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ',' + param1 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void a(int param0, Hashtable param1, StringBuilder param2, int param3) {
        StringBuilder discarded$11 = null;
        StringBuilder discarded$12 = null;
        RuntimeException runtimeException = null;
        qg var6 = null;
        int var7 = 0;
        int var8 = 0;
        tl var9 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var8 = Transmogrify.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var9 = new tl(this.field_u);
                        if (param0 == -12060) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        this.field_u = (qj) null;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var6 = (qg) ((Object) var9.c(param0 + 11962));
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (var6 == null) {
                            statePc = 22;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        discarded$11 = param2.append('\n');
                        if (var8 == 0) {
                            statePc = 7;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        return;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var7 = 0;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (var7 > param3) {
                            statePc = 12;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        discarded$12 = param2.append(' ');
                        var7++;
                        if (var8 != 0) {
                            statePc = 13;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (var8 == 0) {
                            statePc = 8;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var6.a(1 + param3, -43, param2, param1);
                        var6 = (qg) ((Object) var9.a(405142401));
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (var8 == 0) {
                            statePc = 4;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 15: {
                    runtimeException = (RuntimeException) ((Object) caughtException);
                    stackIn_17_0 = (RuntimeException) (runtimeException);
                    stackIn_16_0 = stackIn_17_0;
                    stackIn_17_1 = new StringBuilder().append("aj.HB(").append(param0).append(',');
                    stackIn_16_1 = stackIn_17_1;
                    if (param1 == null) {
                        statePc = 17;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    stackIn_18_0 = (RuntimeException) ((Object) stackIn_16_0);
                    stackIn_18_1 = (StringBuilder) ((Object) stackIn_16_1);
                    stackIn_18_2 = "{...}";
                    statePc = 18;
                    continue stateLoop;
                }
                case 17: {
                    stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
                    stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
                    stackIn_18_2 = "null";
                    statePc = 18;
                    continue stateLoop;
                }
                case 18: {
                    stackIn_20_0 = (RuntimeException) ((Object) stackIn_18_0);
                    stackIn_19_0 = stackIn_20_0;
                    stackIn_20_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',');
                    stackIn_19_1 = stackIn_20_1;
                    if (param2 == null) {
                        statePc = 20;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 19: {
                    stackIn_21_0 = (RuntimeException) ((Object) stackIn_19_0);
                    stackIn_21_1 = (StringBuilder) ((Object) stackIn_19_1);
                    stackIn_21_2 = "{...}";
                    statePc = 21;
                    continue stateLoop;
                }
                case 20: {
                    stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
                    stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
                    stackIn_21_2 = "null";
                    statePc = 21;
                    continue stateLoop;
                }
                case 21: {
                    throw ch.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ',' + param3 + ')');
                }
                case 22: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    void a(int param0, int param1, int param2, byte param3) {
        tl var9 = null;
        qg var7 = null;
        int var8 = Transmogrify.field_A ? 1 : 0;
        int var6 = -80 % ((77 - param3) / 34);
        if (-1 == (param2 ^ -1)) {
            if (this.field_q == null) {
                var9 = new tl(this.field_u);
                var7 = (qg) ((Object) var9.a((byte) 62));
                do {
                    if (var7 == null) {
                        return;
                    }
                    var7.a(param0 - -this.field_p, param1 + this.field_n, param2, (byte) 9);
                    var7 = (qg) ((Object) var9.b(-29339));
                    if (var8 != 0) {
                        return;
                    }
                } while (var8 == 0);
                return;
            }
            this.field_q.a(param0, param1, true, (byte) 103, (qg) (this));
        }
        tl var10 = new tl(this.field_u);
        var7 = (qg) ((Object) var10.a((byte) 62));
        do {
            if (var7 == null) {
                return;
            }
            var7.a(param0 - -this.field_p, param1 + this.field_n, param2, (byte) 9);
            var7 = (qg) ((Object) var10.b(-29339));
            if (var8 != 0) {
                return;
            }
        } while (var8 == 0);
    }

    final boolean a(int param0, qg param1) {
        RuntimeException var3 = null;
        qg var4 = null;
        tl var5 = null;
        qg var6 = null;
        int var7 = 0;
        tl var8 = null;
        int stackIn_3_0 = 0;
        boolean stackIn_9_0 = false;
        boolean stackIn_13_0 = false;
        int stackIn_15_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        int decompiledRegionSelector0 = 0;
        boolean stackOut_8_0;
        boolean stackOut_12_0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var7 = Transmogrify.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (!this.field_u.d(-1)) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        stackIn_3_0 = 0;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 3: {
                    return stackIn_3_0 != 0;
                }
                case 4: {
                    try {
                        var8 = new tl(this.field_u);
                        if (param0 == 2) {
                            statePc = 6;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        this.a(-95, (qg) null, (byte) -47, '￈');
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var4 = (qg) ((Object) var8.a((byte) 62));
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (var4 == null) {
                            statePc = 18;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        stackOut_8_0 = var4.b((byte) -112);
                        stackIn_19_0 = stackOut_8_0 ? 1 : 0;
                        stackIn_9_0 = stackOut_8_0;
                        if (var7 != 0) {
                            statePc = 19;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (!stackIn_9_0) {
                            statePc = 17;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        var5 = new tl(this.field_u);
                        var5.a(var4, true);
                        var6 = (qg) ((Object) var5.b(-29339));
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (var6 == null) {
                            statePc = 17;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        stackOut_12_0 = var6.a(param1, -69);
                        stackIn_19_0 = stackOut_12_0 ? 1 : 0;
                        stackIn_13_0 = stackOut_12_0;
                        if (var7 != 0) {
                            statePc = 19;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (!stackIn_13_0) {
                            statePc = 16;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        stackIn_15_0 = 1;
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 15: {
                    return stackIn_15_0 != 0;
                }
                case 16: {
                    try {
                        var6 = (qg) ((Object) var5.b(-29339));
                        if (var7 == 0) {
                            statePc = 11;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        var4 = (qg) ((Object) var8.b(-29339));
                        if (var7 == 0) {
                            statePc = 7;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        stackIn_19_0 = 0;
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 19: {
                    return stackIn_19_0 != 0;
                }
                case 20: {
                    var3 = (RuntimeException) ((Object) caughtException);
                    stackIn_22_0 = (RuntimeException) (var3);
                    stackIn_21_0 = stackIn_22_0;
                    stackIn_22_1 = new StringBuilder().append("aj.NB(").append(param0).append(',');
                    stackIn_21_1 = stackIn_22_1;
                    if (param1 == null) {
                        statePc = 22;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 21: {
                    stackIn_23_0 = (RuntimeException) ((Object) stackIn_21_0);
                    stackIn_23_1 = (StringBuilder) ((Object) stackIn_21_1);
                    stackIn_23_2 = "{...}";
                    statePc = 23;
                    continue stateLoop;
                }
                case 22: {
                    stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
                    stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
                    stackIn_23_2 = "null";
                    statePc = 23;
                    continue stateLoop;
                }
                case 23: {
                    throw ch.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    aj(int param0, int param1, int param2, int param3, ui param4) {
        super(param0, param1, param2, param3, param4, (ma) null);
        this.field_u = new qj();
    }

    final boolean a(int param0, int param1, qg param2, int param3, int param4, int param5, int param6) {
        tl var8 = null;
        RuntimeException var8_ref = null;
        qg var9 = null;
        int var10 = 0;
        boolean stackIn_4_0 = false;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_3_0;
        var10 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            var8 = new tl(this.field_u);
            var9 = (qg) ((Object) var8.c(param5 ^ 114));
            L1: while (true) {
              L2: {
                L3: {
                  if (var9 == null) {
                    break L3;
                  } else {
                    stackOut_3_0 = var9.b(8);
                    stackIn_12_0 = stackOut_3_0 ? 1 : 0;
                    stackIn_4_0 = stackOut_3_0;
                    if (var10 != 0) {
                      break L2;
                    } else {
                      if (!stackIn_4_0) {
                        break L3;
                      } else {
                        L4: {
                          if (!var9.b((byte) -119)) {
                            break L4;
                          } else {
                            if (var9.a(param0, param1, param2, param3, param4, -17, param6)) {
                              stackIn_9_0 = 1;
                              decompiledRegionSelector0 = 0;
                              break L0;
                            } else {
                              break L4;
                            }
                          }
                        }
                        var9 = (qg) ((Object) var8.a(405142401));
                        if (var10 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                }
                stackIn_12_0 = param5;
                break L2;
              }
              if (stackIn_12_0 == -17) {
                stackIn_16_0 = 0;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackIn_14_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var8_ref = decompiledCaughtException;
            stackIn_19_0 = (RuntimeException) (var8_ref);

            stackIn_19_1 = new StringBuilder().append("aj.R(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L5;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L5;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_9_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_14_0 != 0;
          } else {
            return stackIn_16_0 != 0;
          }
        }
    }

    final void e(int param0) {
        tl var2 = null;
        qg var3 = null;
        int var4 = 0;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = Transmogrify.field_A ? 1 : 0;
                    var2 = new tl(this.field_u);
                    var3 = (qg) ((Object) var2.c(-114));
                    if (param0 != -29113) {
                        statePc = 7;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    if (var3 != null) {
                        statePc = 3;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    return;
                }
                case 3: {
                    var3.e(-29113);
                    var3 = (qg) ((Object) var2.a(param0 ^ -405113402));
                    if (var4 == 0) {
                        statePc = 5;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    return;
                }
                case 5: {
                    if (var4 == 0) {
                        statePc = 1;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    return;
                }
                case 7: {
                    this.field_u = (qj) null;
                    statePc = 8;
                    continue stateLoop;
                }
                case 8: {
                    if (var3 != null) {
                        statePc = 10;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    return;
                }
                case 10: {
                    var3.e(-29113);
                    var3 = (qg) ((Object) var2.a(param0 ^ -405113402));
                    if (var4 == 0) {
                        statePc = 12;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    return;
                }
                case 12: {
                    if (var4 == 0) {
                        statePc = 8;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
        field_v = "Mouse over an icon for details";
    }
}
