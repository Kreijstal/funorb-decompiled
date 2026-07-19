/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class dl extends lh implements lm {
    static byte[] field_O;
    static String[][] field_N;
    static int field_M;
    static ka field_J;
    ul field_K;
    static String[] field_I;
    static String[][] field_H;
    static byte[][] field_L;
    static int field_G;

    lh h(int param0) {
        boolean discarded$2 = false;
        jc var2 = null;
        lh var3 = null;
        int var4 = 0;
        L0: {
          var4 = SteelSentinels.field_G;
          var2 = new jc(this.field_K);
          if (param0 == -1) {
            break L0;
          } else {
            discarded$2 = dl.f(-120);
            break L0;
          }
        }
        var3 = (lh) ((Object) var2.b(2));
        L1: while (true) {
          if (var3 != null) {
            if (!var3.d(param0 ^ -1)) {
              var3 = (lh) ((Object) var2.d(param0 + 3));
              continue L1;
            } else {
              return var3;
            }
          } else {
            return null;
          }
        }
    }

    boolean a(int param0, int param1, char param2, lh param3) {
        int discarded$2 = 0;
        RuntimeException var5 = null;
        lh var6_ref_lh = null;
        int var6 = 0;
        int var7 = 0;
        jc var8 = null;
        int stackIn_9_0 = 0;
        boolean stackIn_15_0 = false;
        int stackIn_17_0 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_8_0 = 0;
        int stackOut_16_0 = 0;
        boolean stackOut_14_0 = false;
        boolean stackOut_13_0 = false;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        var7 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              var8 = new jc(this.field_K);
              var6_ref_lh = (lh) ((Object) var8.b(2));
              if (param0 == 30373) {
                break L1;
              } else {
                discarded$2 = dl.a(76, 69, -95, -115);
                break L1;
              }
            }
            L2: while (true) {
              L3: {
                if (var6_ref_lh == null) {
                  break L3;
                } else {
                  if (!var6_ref_lh.b((byte) -12)) {
                    break L3;
                  } else {
                    L4: {
                      if (!var6_ref_lh.d(0)) {
                        break L4;
                      } else {
                        if (var6_ref_lh.a(param0 ^ 0, param1, param2, param3)) {
                          stackOut_8_0 = 1;
                          stackIn_9_0 = stackOut_8_0;
                          decompiledRegionSelector0 = 0;
                          break L0;
                        } else {
                          break L4;
                        }
                      }
                    }
                    var6_ref_lh = (lh) ((Object) var8.d(2));
                    continue L2;
                  }
                }
              }
              var6 = param1;
              if ((var6 ^ -1) != -81) {
                stackOut_16_0 = 0;
                stackIn_17_0 = stackOut_16_0;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                L5: {
                  if (fc.field_e[81]) {
                    stackOut_14_0 = this.b(param3, 79);
                    stackIn_15_0 = stackOut_14_0;
                    break L5;
                  } else {
                    stackOut_13_0 = this.b(-11963, param3);
                    stackIn_15_0 = stackOut_13_0;
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
            stackOut_18_0 = (RuntimeException) (var5);
            stackOut_18_1 = new StringBuilder().append("dl.R(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param3 == null) {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L6;
            } else {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L6;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_9_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_15_0;
          } else {
            return stackIn_17_0 != 0;
          }
        }
    }

    final void a(lh param0, int param1) {
        boolean discarded$0 = false;
        try {
            if (param1 > -82) {
                lh var4 = (lh) null;
                discarded$0 = this.a(-93, (lh) null);
            }
            this.field_K.a(3, param0);
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) ((Object) runtimeException), "dl.IC(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static int a(int param0, int param1, int param2, int param3) {
        boolean discarded$0 = false;
        if (param2 - -param3 <= pb.field_c) {
            return param2;
        }
        if (param1 != 127) {
            discarded$0 = dl.f(-101);
        }
        if (-param3 + param0 + param2 >= 0) {
            return -param3 + (param0 + param2);
        }
        return pb.field_c - param3;
    }

    void a(int param0, byte param1, int param2, int param3) {
        int var7 = SteelSentinels.field_G;
        if (param3 == 0) {
            if (!(this.field_p == null)) {
                this.field_p.a(param2, (lh) (this), (byte) -30, true, param0);
            }
        }
        jc var5 = new jc(this.field_K);
        lh var6 = (lh) ((Object) var5.c(2));
        while (var6 != null) {
            var6.a(this.field_z + param0, (byte) -109, this.field_o + param2, param3);
            var6 = (lh) ((Object) var5.a(true));
        }
        if (param1 > -99) {
            StringBuilder var8 = (StringBuilder) null;
            this.a((byte) -85, (Hashtable) null, (StringBuilder) null, 76);
        }
    }

    dl(int param0, int param1, int param2, int param3, qk param4) {
        super(param0, param1, param2, param3, param4, (tn) null);
        this.field_K = new ul();
    }

    void a(int param0, int param1, lh param2, int param3) {
        jc var5 = null;
        RuntimeException var5_ref = null;
        lh var6 = null;
        int var7 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        var7 = SteelSentinels.field_G;
        try {
          L0: {
            super.a(param0, 108, param2, param3);
            var5 = new jc(this.field_K);
            if (param1 > 56) {
              var6 = (lh) ((Object) var5.b(2));
              L1: while (true) {
                L2: {
                  if (var6 == null) {
                    break L2;
                  } else {
                    if (!var6.b((byte) -12)) {
                      break L2;
                    } else {
                      var6.a(this.field_o + param0, 112, param2, param3 + this.field_z);
                      var6 = (lh) ((Object) var5.d(2));
                      continue L1;
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
            var5_ref = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) (var5_ref);
            stackOut_8_1 = new StringBuilder().append("dl.H(").append(param0).append(',').append(param1).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param2 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final boolean a(int param0, lh param1) {
        StringBuilder discarded$2 = null;
        jc var3 = null;
        RuntimeException var3_ref = null;
        lh var4 = null;
        int var5 = 0;
        StringBuilder var6 = null;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_7_0 = 0;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var5 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              if (param0 == 1) {
                break L1;
              } else {
                var6 = (StringBuilder) null;
                discarded$2 = this.a((Hashtable) null, (StringBuilder) null, (byte) -47, 62);
                break L1;
              }
            }
            var3 = new jc(this.field_K);
            var4 = (lh) ((Object) var3.b(2));
            L2: while (true) {
              if (var4 == null) {
                stackOut_10_0 = 0;
                stackIn_11_0 = stackOut_10_0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (var4.a(1, param1)) {
                  stackOut_7_0 = 1;
                  stackIn_8_0 = stackOut_7_0;
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  var4 = (lh) ((Object) var3.d(param0 + 1));
                  continue L2;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) (var3_ref);
            stackOut_12_1 = new StringBuilder().append("dl.E(").append(param0).append(',');
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
              break L3;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L3;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_8_0 != 0;
        } else {
          return stackIn_11_0 != 0;
        }
    }

    final boolean b(int param0, lh param1) {
        ck discarded$2 = null;
        RuntimeException var3 = null;
        lh var4 = null;
        jc var5 = null;
        lh var6 = null;
        int var7 = 0;
        jc var8 = null;
        int stackIn_3_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_18_0 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_17_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        var7 = SteelSentinels.field_G;
        try {
          L0: {
            if (!this.field_K.f(param0 + 11970)) {
              var8 = new jc(this.field_K);
              var4 = (lh) ((Object) var8.b(2));
              L1: while (true) {
                if (var4 == null) {
                  if (param0 == -11963) {
                    stackOut_17_0 = 0;
                    stackIn_18_0 = stackOut_17_0;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    field_L = (byte[][]) null;
                    return false;
                  }
                } else {
                  L2: {
                    if (!var4.d(0)) {
                      break L2;
                    } else {
                      var5 = new jc(this.field_K);
                      discarded$2 = var5.a(false, var4);
                      var6 = (lh) ((Object) var5.d(2));
                      L3: while (true) {
                        if (var6 == null) {
                          break L2;
                        } else {
                          if (var6.a(param0 ^ -11964, param1)) {
                            stackOut_11_0 = 1;
                            stackIn_12_0 = stackOut_11_0;
                            decompiledRegionSelector0 = 1;
                            break L0;
                          } else {
                            var6 = (lh) ((Object) var5.d(2));
                            continue L3;
                          }
                        }
                      }
                    }
                  }
                  var4 = (lh) ((Object) var8.d(param0 + 11965));
                  continue L1;
                }
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) (var3);
            stackOut_19_1 = new StringBuilder().append("dl.JC(").append(param0).append(',');
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param1 == null) {
              stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L4;
            } else {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L4;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_12_0 != 0;
          } else {
            return stackIn_18_0 != 0;
          }
        }
    }

    public static void g(int param0) {
        field_J = null;
        field_O = null;
        field_L = (byte[][]) null;
        field_N = (String[][]) null;
        field_H = (String[][]) null;
        field_I = null;
        if (param0 != -19969) {
            field_G = 67;
        }
    }

    final StringBuilder a(Hashtable param0, StringBuilder param1, byte param2, int param3) {
        RuntimeException var5 = null;
        StringBuilder stackIn_2_0 = null;
        StringBuilder stackIn_6_0 = null;
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
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        StringBuilder stackOut_5_0 = null;
        StringBuilder stackOut_1_0 = null;
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
        try {
          L0: {
            if (param2 < -104) {
              L1: {
                if (!this.a(param1, (byte) -91, param3, param0)) {
                  break L1;
                } else {
                  this.a(param3, param0, false, param1);
                  this.a((byte) 77, param0, param1, param3);
                  break L1;
                }
              }
              stackOut_5_0 = (StringBuilder) (param1);
              stackIn_6_0 = stackOut_5_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = (StringBuilder) null;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (var5);
            stackOut_7_1 = new StringBuilder().append("dl.D(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          L3: {
            stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_6_0;
        }
    }

    void a(int param0, byte param1, int param2, int param3, int param4) {
        super.a(param0, (byte) -116, param2, param3, param4);
        if (param1 > -71) {
            field_N = (String[][]) null;
        }
        this.f((byte) 45);
    }

    final boolean b(lh param0, int param1) {
        ck discarded$2 = null;
        jc var3 = null;
        RuntimeException var3_ref = null;
        lh var4 = null;
        jc var5 = null;
        lh var6 = null;
        int var7 = 0;
        int stackIn_5_0 = 0;
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
        RuntimeException decompiledCaughtException = null;
        int stackOut_18_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_4_0 = 0;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        var7 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              if (param1 > 55) {
                break L1;
              } else {
                field_O = (byte[]) null;
                break L1;
              }
            }
            if (!this.field_K.f(7)) {
              var3 = new jc(this.field_K);
              var4 = (lh) ((Object) var3.c(2));
              L2: while (true) {
                if (var4 == null) {
                  stackOut_18_0 = 0;
                  stackIn_19_0 = stackOut_18_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  L3: {
                    if (var4.d(0)) {
                      var5 = new jc(this.field_K);
                      discarded$2 = var5.a(24192, var4);
                      var6 = (lh) ((Object) var5.a(true));
                      L4: while (true) {
                        if (var6 == null) {
                          break L3;
                        } else {
                          if (var6.a(1, param0)) {
                            stackOut_14_0 = 1;
                            stackIn_15_0 = stackOut_14_0;
                            decompiledRegionSelector0 = 1;
                            break L0;
                          } else {
                            var6 = (lh) ((Object) var5.a(true));
                            continue L4;
                          }
                        }
                      }
                    } else {
                      break L3;
                    }
                  }
                  var4 = (lh) ((Object) var3.a(true));
                  continue L2;
                }
              }
            } else {
              stackOut_4_0 = 0;
              stackIn_5_0 = stackOut_4_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3_ref = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) (var3_ref);
            stackOut_20_1 = new StringBuilder().append("dl.GC(");
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param0 == null) {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L5;
            } else {
              stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L5;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_15_0 != 0;
          } else {
            return stackIn_19_0 != 0;
          }
        }
    }

    final static al g(byte param0) {
        if (param0 != 3) {
            dl.a(106, -66, -3, true, 74, -85, -31, 4);
        }
        return (al) ((Object) new gl());
    }

    final void a(byte param0, int param1, int param2, int param3, lh param4, int param5) {
        jc var7 = null;
        RuntimeException var7_ref = null;
        lh var8 = null;
        int var9 = 0;
        int var10 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        var10 = SteelSentinels.field_G;
        try {
          L0: {
            var7 = new jc(this.field_K);
            var8 = (lh) ((Object) var7.b(2));
            var9 = -102 / ((param0 - 36) / 32);
            L1: while (true) {
              L2: {
                if (var8 == null) {
                  break L2;
                } else {
                  if (!var8.b((byte) -12)) {
                    break L2;
                  } else {
                    var8.a((byte) -128, param1, this.field_z + param2, param3 + this.field_o, param4, param5);
                    var8 = (lh) ((Object) var7.d(2));
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
            var7_ref = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) (var7_ref);
            stackOut_6_1 = new StringBuilder().append("dl.P(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param4 == null) {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param5 + ')');
        }
    }

    final static void a(int param0, int param1, int param2, boolean param3, int param4, int param5, int param6, int param7) {
        RuntimeException var8 = null;
        int var8_int = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        RuntimeException decompiledCaughtException = null;
        var11 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              pb.d(param1, param5, param2, param0, param4);
              pb.d(param2, param0, param7, param6, param4);
              pb.d(param7, param6, param1, param5, param4);
              if (param0 >= param5) {
                break L1;
              } else {
                var8_int = param1;
                param1 = param2;
                param2 = var8_int;
                var8_int = param5;
                param5 = param0;
                param0 = var8_int;
                break L1;
              }
            }
            L2: {
              if (param6 < param5) {
                var8_int = param1;
                param1 = param7;
                param7 = var8_int;
                var8_int = param5;
                param5 = param6;
                param6 = var8_int;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (param0 > param6) {
                var8_int = param2;
                param2 = param7;
                param7 = var8_int;
                var8_int = param0;
                param0 = param6;
                param6 = var8_int;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (param2 < param7) {
                var10 = param5;
                L5: while (true) {
                  if (param0 <= var10) {
                    var10 = param0;
                    L6: while (true) {
                      if (var10 >= param6) {
                        break L4;
                      } else {
                        var9 = (-param5 + var10) * (-param1 + param7) / (-param5 + param6) + param1;
                        var8_int = param2 - -((param7 + -param2) * (-param0 + var10) / (param6 - param0));
                        pb.g(var8_int, var10, 1 + (-var8_int + var9), param4);
                        var10++;
                        continue L6;
                      }
                    }
                  } else {
                    var9 = param1 - -((var10 - param5) * (-param1 + param7) / (param6 + -param5));
                    var8_int = (param2 + -param1) * (-param5 + var10) / (-param5 + param0) + param1;
                    pb.g(var8_int, var10, -var8_int + (var9 + 1), param4);
                    var10++;
                    continue L5;
                  }
                }
              } else {
                var10 = param5;
                L7: while (true) {
                  if (param0 <= var10) {
                    var10 = param0;
                    L8: while (true) {
                      if (param6 <= var10) {
                        break L4;
                      } else {
                        var9 = param2 + (-param2 + param7) * (var10 + -param0) / (param6 + -param0);
                        var8_int = param1 + (var10 + -param5) * (-param1 + param7) / (-param5 + param6);
                        pb.g(var8_int, var10, 1 + -var8_int + var9, param4);
                        var10++;
                        continue L8;
                      }
                    }
                  } else {
                    var9 = (param2 + -param1) * (-param5 + var10) / (param0 - param5) + param1;
                    var8_int = (param7 + -param1) * (var10 - param5) / (-param5 + param6) + param1;
                    pb.g(var8_int, var10, 1 + -var8_int + var9, param4);
                    var10++;
                    continue L7;
                  }
                }
              }
            }
            L9: {
              if (param3) {
                break L9;
              } else {
                dl.g(64);
                break L9;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var8), "dl.EC(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    final boolean a(int param0, lh param1, int param2, int param3, int param4, boolean param5, int param6) {
        jc var8 = null;
        RuntimeException var8_ref = null;
        lh var9 = null;
        int var10 = 0;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_10_0 = 0;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var10 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              var8 = new jc(this.field_K);
              if (param5) {
                break L1;
              } else {
                field_M = 17;
                break L1;
              }
            }
            var9 = (lh) ((Object) var8.b(2));
            L2: while (true) {
              L3: {
                if (var9 == null) {
                  break L3;
                } else {
                  if (!var9.b((byte) -12)) {
                    break L3;
                  } else {
                    if (!var9.a(param0, param1, this.field_o + param2, param3, this.field_z + param4, true, param6)) {
                      var9 = (lh) ((Object) var8.d(2));
                      continue L2;
                    } else {
                      stackOut_7_0 = 1;
                      stackIn_8_0 = stackOut_7_0;
                      decompiledRegionSelector0 = 0;
                      break L0;
                    }
                  }
                }
              }
              stackOut_10_0 = 0;
              stackIn_11_0 = stackOut_10_0;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var8_ref = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) (var8_ref);
            stackOut_12_1 = new StringBuilder().append("dl.I(").append(param0).append(',');
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
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L4;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_8_0 != 0;
        } else {
          return stackIn_11_0 != 0;
        }
    }

    final boolean a(byte param0, int param1, int param2, int param3, lh param4, int param5, int param6) {
        jc var8 = null;
        RuntimeException var8_ref = null;
        lh var9 = null;
        int var10 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_12_0 = 0;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        var10 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              if (param0 <= -34) {
                break L1;
              } else {
                this.a(-58, (byte) 107, -39, -11);
                break L1;
              }
            }
            var8 = new jc(this.field_K);
            var9 = (lh) ((Object) var8.b(2));
            L2: while (true) {
              L3: {
                if (var9 == null) {
                  break L3;
                } else {
                  if (!var9.b((byte) -12)) {
                    break L3;
                  } else {
                    L4: {
                      if (!var9.d(0)) {
                        break L4;
                      } else {
                        if (var9.a((byte) -83, param1, param2, param3, param4, param5, param6)) {
                          stackOut_9_0 = 1;
                          stackIn_10_0 = stackOut_9_0;
                          decompiledRegionSelector0 = 0;
                          break L0;
                        } else {
                          break L4;
                        }
                      }
                    }
                    var9 = (lh) ((Object) var8.d(2));
                    continue L2;
                  }
                }
              }
              stackOut_12_0 = 0;
              stackIn_13_0 = stackOut_12_0;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var8_ref = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) (var8_ref);
            stackOut_14_1 = new StringBuilder().append("dl.F(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param4 == null) {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L5;
            } else {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L5;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_10_0 != 0;
        } else {
          return stackIn_13_0 != 0;
        }
    }

    final static boolean f(int param0) {
        Object var1 = null;
        Object var1_ref = null;
        Throwable var2 = null;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_2_0 = 0;
        var1_ref = wc.field_i;
        synchronized (var1_ref) {
          L0: {
            if (ad.field_b != mn.field_y) {
              L1: {
                if (param0 == 22759) {
                  break L1;
                } else {
                  field_G = -52;
                  break L1;
                }
              }
              ei.field_q = kk.field_b[ad.field_b];
              de.field_c = pi.field_b[ad.field_b];
              ad.field_b = 127 & 1 + ad.field_b;
              stackOut_6_0 = 1;
              stackIn_7_0 = stackOut_6_0;
              break L0;
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            }
          }
        }
        return stackIn_7_0 != 0;
    }

    final boolean d(int param0) {
        if (param0 != 0) {
            field_J = (ka) null;
        }
        return this.h(-1) != null ? true : false;
    }

    final void d(byte param0) {
        int var4 = SteelSentinels.field_G;
        if (param0 != -45) {
            field_N = (String[][]) null;
        }
        jc var2 = new jc(this.field_K);
        lh var3 = (lh) ((Object) var2.b(param0 + 47));
        while (var3 != null) {
            var3.d((byte) -45);
            var3 = (lh) ((Object) var2.d(2));
        }
    }

    final static boolean a(long param0, int[] param1, int param2, int param3, String param4) {
        mg var6 = null;
        RuntimeException var6_ref = null;
        CharSequence var7 = null;
        int stackIn_2_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_9_0 = 0;
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
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_8_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_1_0 = 0;
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
            if (vk.a(param0, param1, param4, param3, -21)) {
              L1: {
                if ((param3 ^ -1) != -2) {
                  break L1;
                } else {
                  param3 = 0;
                  break L1;
                }
              }
              ib.field_b = param3;
              en.field_e = param4;
              var7 = (CharSequence) ((Object) param4);
              bk.field_U = ui.a(1, var7);
              ti.field_p = param0;
              if (param2 < -113) {
                var6 = um.a(ea.field_f, fb.field_l, pg.field_u, param1, -90);
                pa.a(12105, var6);
                stackOut_8_0 = 1;
                stackIn_9_0 = stackOut_8_0;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6_ref = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) (var6_ref);
            stackOut_10_1 = new StringBuilder().append("dl.HC(").append(param0).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L2;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L2;
            }
          }
          L3: {
            stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',').append(param2).append(',').append(param3).append(',');
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
              break L3;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L3;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0 != 0;
          } else {
            return stackIn_9_0 != 0;
          }
        }
    }

    private final void a(byte param0, Hashtable param1, StringBuilder param2, int param3) {
        StringBuilder discarded$12 = null;
        StringBuilder discarded$13 = null;
        StringBuilder discarded$14 = null;
        jc var5 = null;
        RuntimeException var5_ref = null;
        lh var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var9 = SteelSentinels.field_G;
        try {
          L0: {
            var5 = new jc(this.field_K);
            var7 = -34 % ((-2 - param0) / 43);
            var6 = (lh) ((Object) var5.b(2));
            L1: while (true) {
              if (var6 == null) {
                break L0;
              } else {
                discarded$12 = param2.append('\n');
                var8 = 0;
                L2: while (true) {
                  if (param3 < var8) {
                    discarded$13 = var6.a(param1, param2, (byte) -114, 1 + param3);
                    var6 = (lh) ((Object) var5.d(2));
                    continue L1;
                  } else {
                    discarded$14 = param2.append(' ');
                    var8++;
                    continue L2;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5_ref = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) (var5_ref);
            stackOut_8_1 = new StringBuilder().append("dl.DC(").append(param0).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          L4: {
            stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
            stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param2 == null) {
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
          throw ci.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param3 + ')');
        }
    }

    final int b(boolean param0) {
        int var5 = 0;
        int var6 = SteelSentinels.field_G;
        int var2 = 0;
        if (!param0) {
            field_L = (byte[][]) null;
        }
        jc var3 = new jc(this.field_K);
        lh var4 = (lh) ((Object) var3.b(2));
        while (var4 != null) {
            var5 = var4.b(true);
            if (var5 > var2) {
                var2 = var5;
            }
            var4 = (lh) ((Object) var3.d(2));
        }
        return var2;
    }

    String e(int param0) {
        jc var2 = null;
        lh var3 = null;
        String var4 = null;
        int var5 = 0;
        var5 = SteelSentinels.field_G;
        var2 = new jc(this.field_K);
        if (param0 == 0) {
          var3 = (lh) ((Object) var2.b(2));
          L0: while (true) {
            if (var3 != null) {
              var4 = var3.e(param0 ^ 0);
              if (var4 != null) {
                return var4;
              } else {
                var3 = (lh) ((Object) var2.d(2));
                continue L0;
              }
            } else {
              return null;
            }
          }
        } else {
          return (String) null;
        }
    }

    private final void f(byte param0) {
        int var4 = SteelSentinels.field_G;
        if (param0 != 45) {
            return;
        }
        jc var2 = new jc(this.field_K);
        lh var3 = (lh) ((Object) var2.b(2));
        while (var3 != null) {
            var3.e((byte) 102);
            var3 = (lh) ((Object) var2.d(2));
        }
    }

    static {
        field_N = new String[][]{new String[]{"Introduction", "Walking", "Walking", "Walking", "Walking", "Camera control", "Jumping", "Jumping", "Shooting", "Shooting", "Shooting", "Complete"}, new String[]{"Introduction", "Weapon selection", "Rockets", "Power-up", "Rockets", "Camera control", "Camera control", "Sniping", "Camera control", "Moving targets", "Rocket Defence", "AMARDS", "AMARDS", "Combat", "Complete"}, null, new String[]{"Introduction", "Thrust", "Flight", "Energy loss", "Flight", "Lasers", "Complete"}, null, new String[]{"Targeting", "Missiles", "Combat", "Combat", "Complete"}, null, new String[]{"Introduction", "Heavy rocket", "Missed", "Hit", "Cannon", "Moving targets", "Complete"}, null, new String[]{"Introduction", "Flak", "Rocket defence", "Rocket defence", "Airburst", "Complete"}, null};
        field_H = new String[][]{new String[]{"Welcome to basic control and navigation training. First you will learn to move your sentinel along the ground. For this you will be using an unarmed Slave-class sentinel.", "Press <img=20> to continue.", "Tap the 'A' key to tell your sentinel to start moving left.", "Press 'A' once to start moving left.", "Since you are remotely piloting your sentinel, there is a short delay between when you issue an order and when the sentinel receives and acts upon it. <br>Tap the 'D' key to instruct your sentinel to start moving right.", "Press 'D' once to start moving right.", "In the absence of other orders, your sentinel will carry on walking. Press 'S' to tell it to halt.", "Press 'S' to stop moving.", "At the bottom of your screen is the minimap. This shows the locations of sentinels on the battlefield. The blue circle is your sentinel, and the flashing red circle is a training drone. Walk your sentinel to the training drone and stop as close to it as possible.", "Use 'A', 'S', 'D' to position your sentinel at the training drone.", "You can move the camera by holding down the right mouse button and moving the mouse. The buttons on the right offer some options for changing the controls.<br>Try them out and choose the one you prefer.", "Press <img=20> to continue.", "The Slave also has the ability to jump. To instruct your sentinel to jump, press 'W'.", "Use 'W' to jump.", "While you hold 'W', the projected path of your jump is displayed on your screen. This allows you to aim your jump precisely by moving the mouse.<br>There are now three drones in elevated positions on the battlefield. Reach them all by jumping.", "Hold 'W' and move the mouse to plan the trajectory of your jump.<br>Reach all the drones by jumping.", "Your Slave will now be equipped with its standard complement of close-assault guns. These are short-range, direct-fire weapons.<br>Move the mouse to aim your weapons. The white 'trajectory line' emitted from your sentinel indicates the projected path of your weapon-fire.", "Press <img=20> to continue.", "Every weapon has a limited firing arc, which you can see as a thick blue arc displayed next to your sentinel. Your weapon will only fire in directions inside this arc.<br>Use the left mouse button to fire your weapons. Holding the button down will fire at the weapon's optimal firing rate. Use the close-assault guns to destroy the training drone.", "Fire with the left mouse button.<br>Destroy the training drone with your guns.", "Some mobile drones have been placed on the training field. Destroy them all. Keep in mind that your guns have a limited range and a restricted firing arc.<br>Remember, you can move your sentinel to a better position using the move keys ('A', 'S', 'D') or by jumping ('W').", "Hold down the left mouse button to keep firing.<br>Destroy all the training drones.", "Well done, you have completed the first training mission.", ""}, new String[]{"Welcome to your second training mission. In this program you will learn about combat using rockets. Initially, a barrier will confine your sentinel to a ledge on the edge of the battlefield so you can practise shooting from a distance.", "Press <img=20> to continue.", "The Slave-class sentinel is equipped with a batch of piercer rockets, though not normally as many as this. These are cheap, light rockets that are nonetheless deadly in salvoes.<br>Pressing 'Q' or 'E' changes your currently selected weapon.", "Press 'E' to select your piercer rockets.", "Rockets detonate when they strike ground or another solid object. Anything caught in the explosion receives damage.<br>Use the white trajectory line to visualise the rocket's trajectory.", "Fire rockets at the drone.", "Any rocket-equipped sentinel has a limited number to fire before it runs out. Over time, new rockets will be loaded and then the sentinel can fire again.<br>For expediency, in this tutorial you will have access to a speed-loader. This module reduces reload times for rockets and missiles.", "Pick up the speed-loader power-up by walking over it.", "More drones have been placed on the battlefield, at increasing distances from your sentinel. Use your rockets to destroy them. Beware that rocket explosions can damage your sentinel too.<br>If you run out of rockets, your cursor will turn red, indicating that you cannot fire until your rockets have been reloaded.", "Destroy the drones with rockets.", "There is one more drone, on the left hand side of the battlefield. Scroll left (by holding the right mouse button and dragging the mouse) to find it.", "Hold the right mouse button and drag to move the camera left.", "When your sentinel is off-screen, the inset display appears at the screen edge closest to your sentinel, to remind you where your sentinel is. Click and drag the right mouse button to move the camera around, and the highlighted box on your minimap shows what part of the battlefield you are currently viewing.", "Right click and drag the mouse to move the camera around.", "Now, position the camera so that you can see the training drone on the left of the map, and destroy it with your rockets.", "Destroy the drone with rockets.", "Well done. To bring your sentinel back into view wherever it is, press 'V'.", "Press 'V' to move the camera back to your sentinel.", "The next drones are moving targets. Try to anticipate their positions so that your rockets intercept them.", "Destroy the moving drones with rockets.", "Next you will learn about rocket defence using AMARDS. For this you will be back in the standard model Slave.", "Press <img=20> to continue.", "The Slave-class sentinel comes with Automatic Missile And Rocket Defence Systems (AMARDS). This fires the Slave's guns at incoming rockets and missiles to detonate them before they get too close. Approach the nearby rocket drone to activate AMARDS.", "Approach the rocket drone.", "AMARDS only works when your sentinel is facing the direction of an attack. <br>It can destroy a hostile sentinel by detonating its rockets at launch.<br>Approach the rocket drone so your AMARDS can destroy it.", "Destroy the rocket drone.", "Destroy the drones to complete the mission. They will become aggressive when you fire on them.", "Destroy all hostile forces.", "Well done, you have completed Slave rocket training.", ""}, new String[]{}, new String[]{"For the following missions, you will be using an Aquila-class sentinel. The Aquila is a fast, lightweight sentinel, capable of aerial thrust.", "Press <img=20> to continue.", "To thrust, use 'W' and perform a jump. Then, while in the air, use 'W' and jump again.", "Use 'W' and the mouse in the air to thrust.", "Now, by thrusting multiple times, try and stay in the air for as long as possible.", "Use 'W' and the mouse in the air to thrust.", "Your sentinel has run out of energy. When this happens, it cannot move until it recovers. <br>Thrusting expends energy, but energy recharges quickly if your sentinel is still. <br>Be aware of your energy gauge and try to avoid 'energy loss' state.", "Press <img=20> to continue.", "Some floating drones have been dropped into the battlefield. Use your Aquila's thrust to fly to them. Try not to exhaust your energy.", "Fly to the floating beacons.", "Your Aquila's pulse laser has now been activated. Lasers fire in a straight line, and inflict energy damage. However, every shot drains some of your energy reserves, so firing in rapid succession can lead to energy loss.<br>Fire the lasers at the drones.", "Destroy the drones with lasers.", "Well done, you have completed Aquila energy training.", ""}, new String[]{}, new String[]{"Your sentinel is now a full default Aquila. In addition to the lasers, it has missiles and a targeting system.<br>To target an enemy, hold the 'ALT' key and click the left mouse button on the enemy.", "Hold 'ALT' and click on an enemy to target it.", "The red markers around the enemy indicate your target lock. When the markers disappear, the target lock has expired. Getting a target lock uses 1 unit of energy.<br>Select your missiles ('E') and fire them upwards, avoiding any nearby obstacles. They will home in on your current target.", "Destroy the drones with missiles.", "While you have a target lock, any direct-fire weapons (such as lasers) will automatically aim towards your target.<br>If you ever need to drop a target lock, click on the targeting icon at the bottom-right of your interface, or click the right mouse button while holding 'ALT'.<br>Destroy the next batch of drones with your lasers. Target locks make it easier to hit moving enemies.", "Destroy the drones with lasers.", "Well done, you have completed the Aquila targeting mission.", ""}, new String[]{}, new String[]{"The most powerful weapon in a Golem's arsenal is the heavy rocket. This is a long-range rocket with an explosion that can severely damage your sentinel if it detonates too close.<br>The Golem's scanner extends trajectory lines, allowing long-range weapons to be fired across the whole battlefield with accuracy.", "Select your heavy rocket using 'Q' and 'E'.", "There is a training drone on the left side of the battlefield. Move the camera to find it, and fire your heavy rocket at it.", "Select your heavy rocket and fire it at the training drone.", "Your shot was unsuccessful. Heavy rockets normally take a long time to reload, but for now this will be accelerated so that you can try again.<br>Try and use the white trajectory line to see where the rocket is going to land, before you fire it.", "Fire at the training drone.", "Well done. The next phase of training uses the Golem's cannons. Select them as your current weapon.", "Select cannons.", "The cannon is an explosive ballistic weapon. Cannon fire follows a parabolic arc and causes explosive damage on impact. If you hold down the mouse button, the cannon will fire at its optimum rate.<br>Destroy the nearby drones with your cannons.", "Destroy the drones with cannons.", "The barrier confining your sentinel has now been lifted. Destroy the remaining drones with either of your available weapons.", "Destroy the drones.", "Well done, you have completed the training mission.", ""}, new String[]{}, new String[]{"Flak is a useful defensive weapon against rockets and enemy sentinels. Flak forms a cloud in the air where it is fired, which damages anything passing through it.", "Select flak as your current weapon.", "A drone is being placed in the battlefield. Fire flak in front of it and observe the results. Be careful not to move your sentinel into the flak cloud, or it will receive damage.", "Destroy the drone with flak.", "Flak can also destroy incoming rockets. A rocket Slave will be dropped into the battlefield. Use flak to defend yourself against its rockets.<br>Rockets that detonate close enough to the Slave will cause it damage.", "Press <img=20> to begin.", "", "Destroy the Slave.", "The Golem is armed with airburst rockets. These create a cloud of flak when they detonate, which can damage and bring down aerial enemies.", "Select airburst rockets as your current weapon.", "Fire airburst into the path of the aerial drones to bring them down. You can also destroy them with guns or your other weapons, if you can hit them.<br>Destroy them all to complete the mission.", "Destroy the drones.", "Well done. You have completed Golem training.", ""}};
        field_I = new String[]{"never", "once", "twice", "<%0> times"};
    }
}
