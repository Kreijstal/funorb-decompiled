/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class kj extends ee implements gk {
    static ka[] field_C;
    sl field_F;
    static int field_D;
    static sl field_B;
    static String field_E;
    static String field_H;
    static int field_A;
    static int field_G;
    static boolean[] field_I;

    final boolean a(ee param0, int param1) {
        nj var3 = null;
        RuntimeException var3_ref = null;
        ee var4 = null;
        int var5 = 0;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = TorChallenge.field_F ? 1 : 0;
        try {
          L0: {
            var3 = new nj(this.field_F);
            var4 = (ee) ((Object) var3.c(param1));
            L1: while (true) {
              if (var4 == null) {
                stackIn_8_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (!var4.a(param0, 0)) {
                  var4 = (ee) ((Object) var3.a(false));
                  continue L1;
                } else {
                  stackIn_5_0 = 1;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var3_ref);

            stackIn_11_1 = new StringBuilder().append("kj.RA(");

            if (param0 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L2;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L2;
            }
          }
          throw oj.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0 != 0;
        } else {
          return stackIn_8_0 != 0;
        }
    }

    void a(int param0, int param1, boolean param2, int param3) {
        int var7 = TorChallenge.field_F ? 1 : 0;
        if (0 == param3 && this.field_q != null) {
            this.field_q.a((ee) (this), param0, param1, (byte) 97, true);
        }
        nj var5 = new nj(this.field_F);
        ee var6 = (ee) ((Object) var5.a(-48));
        while (var6 != null) {
            var6.a(this.field_i + param0, param1 - -this.field_m, false, param3);
            var6 = (ee) ((Object) var5.c((byte) -13));
        }
        if (param2) {
            field_E = (String) null;
        }
    }

    final static boolean e(byte param0) {
        Object var1 = null;
        int var2 = 0;
        Throwable var3 = null;
        int stackIn_4_0 = 0;
        int stackIn_6_0 = 0;
        Throwable decompiledCaughtException = null;
        var1 = hl.field_d;
        synchronized (var1) {
          L0: {
            if (kc.field_n == ja.field_f) {
              stackIn_4_0 = 0;
              return stackIn_4_0 != 0;
            } else {
              b.field_J = fj.field_C[ja.field_f];
              di.field_m = ql.field_k[ja.field_f];
              ja.field_f = ja.field_f - -1 & 127;
              var2 = 93 % ((param0 - 48) / 46);
              stackIn_6_0 = 1;
              break L0;
            }
          }
        }
        return stackIn_6_0 != 0;
    }

    final StringBuilder a(Hashtable param0, int param1, StringBuilder param2, boolean param3) {
        RuntimeException var5 = null;
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
              if (this.a(param0, param1, -125, param2)) {
                this.a(param2, 127, param0, param1);
                this.a(param0, param2, param1, 127);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (param3) {
                break L2;
              } else {
                kj.g(7);
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

            stackIn_9_1 = new StringBuilder().append("kj.W(");

            if (param0 == null) {
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


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',').append(param1).append(',');

            if (param2 == null) {
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
          throw oj.a((Throwable) ((Object) stackIn_10_0), stackIn_13_2 + ',' + param3 + ')');
        }
        return stackIn_6_0;
    }

    final int e(int param0) {
        int var5 = 0;
        int var6 = TorChallenge.field_F ? 1 : 0;
        int var2 = 0;
        if (param0 != -15000) {
            return 36;
        }
        nj var3 = new nj(this.field_F);
        ee var4 = (ee) ((Object) var3.c(0));
        while (var4 != null) {
            var5 = var4.e(-15000);
            if (var2 < var5) {
                var2 = var5;
            }
            var4 = (ee) ((Object) var3.a(false));
        }
        return var2;
    }

    kj(int param0, int param1, int param2, int param3, j param4) {
        super(param0, param1, param2, param3, param4, (gg) null);
        this.field_F = new sl();
    }

    final boolean b(int param0, ee param1) {
        RuntimeException var3 = null;
        ee var4 = null;
        nj var5 = null;
        ee var6 = null;
        int var7 = 0;
        StringBuilder var8 = null;
        nj var9 = null;
        int stackIn_5_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_17_0 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var7 = TorChallenge.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 >= 70) {
                break L1;
              } else {
                var8 = (StringBuilder) null;
                this.a((Hashtable) null, -30, (StringBuilder) null, true);
                break L1;
              }
            }
            if (!this.field_F.d(-127)) {
              var9 = new nj(this.field_F);
              var4 = (ee) ((Object) var9.c(0));
              L2: while (true) {
                if (var4 == null) {
                  stackIn_17_0 = 0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  L3: {
                    if (!var4.c(94)) {
                      break L3;
                    } else {
                      var5 = new nj(this.field_F);
                      var5.b(var4, -117);
                      var6 = (ee) ((Object) var5.a(false));
                      L4: while (true) {
                        if (var6 == null) {
                          break L3;
                        } else {
                          if (!var6.a(param1, 0)) {
                            var6 = (ee) ((Object) var5.a(false));
                            continue L4;
                          } else {
                            stackIn_13_0 = 1;
                            decompiledRegionSelector0 = 1;
                            break L0;
                          }
                        }
                      }
                    }
                  }
                  var4 = (ee) ((Object) var9.a(false));
                  continue L2;
                }
              }
            } else {
              stackIn_5_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackIn_20_0 = (RuntimeException) (var3);

            stackIn_20_1 = new StringBuilder().append("kj.DC(").append(param0).append(',');

            if (param1 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L5;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L5;
            }
          }
          throw oj.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_13_0 != 0;
          } else {
            return stackIn_17_0 != 0;
          }
        }
    }

    final String b(boolean param0) {
        nj var2;
        ee var3;
        String var4;
        int var5;
        L0: {
          var5 = TorChallenge.field_F ? 1 : 0;
          var2 = new nj(this.field_F);
          if (!param0) {
            break L0;
          } else {
            field_D = -74;
            break L0;
          }
        }
        var3 = (ee) ((Object) var2.c(0));
        L1: while (true) {
          if (var3 != null) {
            var4 = var3.b(param0);
            if (var4 != null) {
              return var4;
            } else {
              var3 = (ee) ((Object) var2.a(false));
              continue L1;
            }
          } else {
            return null;
          }
        }
    }

    final void a(int param0, byte param1, ee param2, int param3, int param4, int param5) {
        RuntimeException runtimeException = null;
        nj var7 = null;
        ee var8_ref_ee = null;
        int var8 = 0;
        int var9 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        var9 = TorChallenge.field_F ? 1 : 0;
        try {
          L0: {
            var7 = new nj(this.field_F);
            var8_ref_ee = (ee) ((Object) var7.c(0));
            L1: while (true) {
              L2: {
                if (var8_ref_ee == null) {
                  break L2;
                } else {
                  if (!var8_ref_ee.b(11163)) {
                    break L2;
                  } else {
                    var8_ref_ee.a(this.field_i + param0, (byte) 31, param2, param3 - -this.field_m, param4, param5);
                    var8_ref_ee = (ee) ((Object) var7.a(false));
                    continue L1;
                  }
                }
              }
              var8 = -88 % ((-29 - param1) / 39);
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            runtimeException = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (runtimeException);

            stackIn_9_1 = new StringBuilder().append("kj.Q(").append(param0).append(',').append(param1).append(',');

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
          throw oj.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final boolean c(int param0) {
        if (param0 <= 76) {
            return true;
        }
        return null != this.d((byte) 107) ? true : false;
    }

    final static void a(byte param0, java.awt.Component param1) {
        try {
            param1.addMouseListener(te.field_b);
            param1.addMouseMotionListener(te.field_b);
            param1.addFocusListener(te.field_b);
            int var2_int = -85 % ((param0 - -48) / 57);
        } catch (RuntimeException runtimeException) {
            throw oj.a((Throwable) ((Object) runtimeException), "kj.CC(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private final void a(Hashtable param0, StringBuilder param1, int param2, int param3) {
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        nj var5 = null;
        ee var6 = null;
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
        var8 = TorChallenge.field_F ? 1 : 0;
        try {
          L0: {
            var5 = new nj(this.field_F);
            var6 = (ee) ((Object) var5.c(0));
            L1: while (true) {
              if (var6 == null) {
                L2: {
                  if (param3 == 127) {
                    break L2;
                  } else {
                    field_A = 9;
                    break L2;
                  }
                }
                break L0;
              } else {
                discarded$2 = param1.append('\n');
                var7 = 0;
                L3: while (true) {
                  if (var7 > param2) {
                    var6.a(param0, param2 + 1, param1, true);
                    var6 = (ee) ((Object) var5.a(false));
                    continue L1;
                  } else {
                    discarded$3 = param1.append(' ');
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

            stackIn_12_1 = new StringBuilder().append("kj.VB(");

            if (param0 == null) {
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

            if (param1 == null) {
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
          throw oj.a((Throwable) ((Object) stackIn_13_0), stackIn_16_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    ee d(byte param0) {
        nj var2;
        ee var3;
        int var4;
        var4 = TorChallenge.field_F ? 1 : 0;
        var2 = new nj(this.field_F);
        if (param0 == 107) {
          var3 = (ee) ((Object) var2.c(0));
          L0: while (true) {
            if (var3 != null) {
              if (!var3.c(109)) {
                var3 = (ee) ((Object) var2.a(false));
                continue L0;
              } else {
                return var3;
              }
            } else {
              return null;
            }
          }
        } else {
          return (ee) null;
        }
    }

    final void a(int param0, ee param1) {
        try {
            this.field_F.a(param1, param0 + -128);
            if (param0 != 0) {
                StringBuilder var4 = (StringBuilder) null;
                this.a((Hashtable) null, 58, (StringBuilder) null, true);
            }
        } catch (RuntimeException runtimeException) {
            throw oj.a((Throwable) ((Object) runtimeException), "kj.AC(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(byte param0, int param1, int param2, int param3, int param4) {
        if (param0 < 100) {
            field_H = (String) null;
        }
        super.a((byte) 126, param1, param2, param3, param4);
        this.c((byte) 112);
    }

    boolean a(int param0, char param1, byte param2, ee param3) {
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        ee var8 = null;
        nj var9 = null;
        int stackIn_8_0 = 0;
        boolean stackIn_15_0 = false;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var7 = TorChallenge.field_F ? 1 : 0;
        try {
          L0: {
            var9 = new nj(this.field_F);
            var8 = (ee) ((Object) var9.c(0));
            L1: while (true) {
              L2: {
                if (var8 == null) {
                  break L2;
                } else {
                  if (!var8.b(11163)) {
                    break L2;
                  } else {
                    L3: {
                      if (!var8.c(80)) {
                        break L3;
                      } else {
                        if (var8.a(param0, param1, (byte) 73, param3)) {
                          stackIn_8_0 = 1;
                          decompiledRegionSelector0 = 0;
                          break L0;
                        } else {
                          break L3;
                        }
                      }
                    }
                    var8 = (ee) ((Object) var9.a(false));
                    continue L1;
                  }
                }
              }
              var6 = param0;
              if (var6 == 80) {
                L4: {
                  if (nj.field_c[81]) {
                    stackIn_15_0 = this.a(param3, (byte) -16);
                    break L4;
                  } else {
                    stackIn_15_0 = this.b(89, param3);
                    break L4;
                  }
                }
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (param2 >= 9) {
                  stackIn_19_0 = 0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  field_E = (String) null;
                  return false;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5 = decompiledCaughtException;
            stackIn_22_0 = (RuntimeException) (var5);

            stackIn_22_1 = new StringBuilder().append("kj.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L5;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L5;
            }
          }
          throw oj.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_8_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_15_0;
          } else {
            return stackIn_19_0 != 0;
          }
        }
    }

    final boolean a(int param0, int param1, int param2, int param3, ee param4, int param5, int param6) {
        nj var8 = null;
        RuntimeException var8_ref = null;
        ee var9 = null;
        int var10 = 0;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var10 = TorChallenge.field_F ? 1 : 0;
        try {
          L0: {
            var8 = new nj(this.field_F);
            var9 = (ee) ((Object) var8.c(param0));
            L1: while (true) {
              L2: {
                if (var9 == null) {
                  break L2;
                } else {
                  if (!var9.b(11163)) {
                    break L2;
                  } else {
                    L3: {
                      if (!var9.c(103)) {
                        break L3;
                      } else {
                        if (!var9.a(param0 ^ 0, param1, param2, param3, param4, param5, param6)) {
                          break L3;
                        } else {
                          stackIn_7_0 = 1;
                          decompiledRegionSelector0 = 0;
                          break L0;
                        }
                      }
                    }
                    var9 = (ee) ((Object) var8.a(false));
                    continue L1;
                  }
                }
              }
              stackIn_10_0 = 0;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var8_ref = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var8_ref);

            stackIn_13_1 = new StringBuilder().append("kj.BB(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L4;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L4;
            }
          }
          throw oj.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_7_0 != 0;
        } else {
          return stackIn_10_0 != 0;
        }
    }

    void a(ee param0, int param1, byte param2, int param3) {
        RuntimeException runtimeException = null;
        nj var5 = null;
        ee var6 = null;
        int var7 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = TorChallenge.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param2 <= -97) {
                break L1;
              } else {
                this.a(58, 106, true, -8);
                break L1;
              }
            }
            super.a(param0, param1, (byte) -100, param3);
            var5 = new nj(this.field_F);
            var6 = (ee) ((Object) var5.c(0));
            L2: while (true) {
              L3: {
                if (var6 == null) {
                  break L3;
                } else {
                  if (!var6.b(11163)) {
                    break L3;
                  } else {
                    var6.a(param0, this.field_m + param1, (byte) -111, param3 - -this.field_i);
                    var6 = (ee) ((Object) var5.a(false));
                    continue L2;
                  }
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            runtimeException = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (runtimeException);

            stackIn_10_1 = new StringBuilder().append("kj.U(");

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
          throw oj.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void d(int param0) {
        int var4 = TorChallenge.field_F ? 1 : 0;
        nj var2 = new nj(this.field_F);
        if (param0 != 6064) {
            return;
        }
        ee var3 = (ee) ((Object) var2.c(0));
        while (var3 != null) {
            var3.d(6064);
            var3 = (ee) ((Object) var2.a(false));
        }
    }

    private final void c(byte param0) {
        int var4 = TorChallenge.field_F ? 1 : 0;
        if (param0 != 112) {
            ee var5 = (ee) null;
            this.b(20, (ee) null);
        }
        nj var2 = new nj(this.field_F);
        ee var3 = (ee) ((Object) var2.c(param0 + -112));
        while (var3 != null) {
            var3.b((byte) 113);
            var3 = (ee) ((Object) var2.a(false));
        }
    }

    final boolean a(int param0, int param1, int param2, int param3, int param4, int param5, ee param6) {
        nj var8 = null;
        RuntimeException var8_ref = null;
        ee var9 = null;
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
        var10 = TorChallenge.field_F ? 1 : 0;
        try {
          L0: {
            var8 = new nj(this.field_F);
            if (param2 == -81) {
              var9 = (ee) ((Object) var8.c(0));
              L1: while (true) {
                L2: {
                  if (var9 == null) {
                    break L2;
                  } else {
                    if (!var9.b(11163)) {
                      break L2;
                    } else {
                      if (var9.a(param0, param1, -81, param3 - -this.field_i, this.field_m + param4, param5, param6)) {
                        stackIn_10_0 = 1;
                        decompiledRegionSelector0 = 1;
                        break L0;
                      } else {
                        var9 = (ee) ((Object) var8.a(false));
                        continue L1;
                      }
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
          L3: {
            var8_ref = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var8_ref);

            stackIn_16_1 = new StringBuilder().append("kj.CA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');

            if (param6 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L3;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L3;
            }
          }
          throw oj.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ')');
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

    final boolean a(ee param0, byte param1) {
        RuntimeException var3 = null;
        ee var4 = null;
        nj var5 = null;
        ee var6 = null;
        int var7 = 0;
        ee var8 = null;
        nj var9 = null;
        int stackIn_3_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var7 = TorChallenge.field_F ? 1 : 0;
        try {
          L0: {
            if (!this.field_F.d(param1 ^ 116)) {
              L1: {
                var9 = new nj(this.field_F);
                if (param1 == -16) {
                  break L1;
                } else {
                  var8 = (ee) null;
                  this.a(-35, (byte) -17, (ee) null, 41, 16, 15);
                  break L1;
                }
              }
              var4 = (ee) ((Object) var9.a(-108));
              L2: while (true) {
                if (var4 == null) {
                  stackIn_19_0 = 0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  L3: {
                    if (var4.c(110)) {
                      var5 = new nj(this.field_F);
                      var5.a(var4, -61);
                      var6 = (ee) ((Object) var5.c((byte) -13));
                      L4: while (true) {
                        if (var6 == null) {
                          break L3;
                        } else {
                          if (var6.a(param0, 0)) {
                            stackIn_15_0 = 1;
                            decompiledRegionSelector0 = 1;
                            break L0;
                          } else {
                            var6 = (ee) ((Object) var5.c((byte) -13));
                            continue L4;
                          }
                        }
                      }
                    } else {
                      break L3;
                    }
                  }
                  var4 = (ee) ((Object) var9.c((byte) -13));
                  continue L2;
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
          L5: {
            var3 = decompiledCaughtException;
            stackIn_22_0 = (RuntimeException) (var3);

            stackIn_22_1 = new StringBuilder().append("kj.BC(");

            if (param0 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L5;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L5;
            }
          }
          throw oj.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_15_0 != 0;
          } else {
            return stackIn_19_0 != 0;
          }
        }
    }

    final static int a(byte param0, CharSequence param1, int param2) {
        RuntimeException var3 = null;
        CharSequence var4 = null;
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
              if (param0 == 74) {
                break L1;
              } else {
                var4 = (CharSequence) null;
                kj.a((byte) 70, (CharSequence) null, 37);
                break L1;
              }
            }
            stackIn_3_0 = vh.a((byte) 86, true, param2, param1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("kj.EC(").append(param0).append(',');

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
          throw oj.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param2 + ')');
        }
        return stackIn_3_0;
    }

    public static void g(int param0) {
        field_H = null;
        field_I = null;
        field_E = null;
        field_C = null;
        if (param0 != -10365) {
            field_D = 8;
        }
        field_B = null;
    }

    static {
        field_D = 0;
        field_B = new sl();
        field_G = -1;
        field_I = new boolean[6];
        field_H = "Sound: ";
        field_A = -1;
        field_E = "Return to game";
    }
}
