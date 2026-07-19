/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class kf extends ce implements ra {
    static int field_M;
    static String field_N;
    static qc field_I;
    static String field_R;
    static ud field_P;
    static w field_Q;
    static int field_O;
    static int field_L;
    vj field_H;
    static ke field_G;
    static String field_J;
    static int field_K;

    final boolean a(boolean param0) {
        if (!param0) {
            return false;
        }
        return null != this.e((byte) -74) ? true : false;
    }

    void a(ce param0, int param1, int param2, int param3) {
        boolean discarded$2 = false;
        rd var5 = null;
        RuntimeException var5_ref = null;
        ce var6 = null;
        int var7 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        var7 = client.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 > 38) {
                break L1;
              } else {
                discarded$2 = this.a(false);
                break L1;
              }
            }
            super.a(param0, 68, param2, param3);
            var5 = new rd(this.field_H);
            var6 = (ce) ((Object) var5.a((byte) 71));
            L2: while (true) {
              L3: {
                if (var6 == null) {
                  break L3;
                } else {
                  if (!var6.a((byte) 38)) {
                    break L3;
                  } else {
                    var6.a(param0, 47, this.field_D + param2, param3 - -this.field_u);
                    var6 = (ce) ((Object) var5.a(-62));
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
            var5_ref = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) (var5_ref);
            stackOut_8_1 = new StringBuilder().append("kf.A(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L4;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L4;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void b(ce param0, byte param1) {
        boolean discarded$0 = false;
        try {
            if (param1 != -55) {
                ce var4 = (ce) null;
                discarded$0 = this.a(false, (ce) null);
            }
            this.field_H.a(param0, 2777);
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) ((Object) runtimeException), "kf.KC(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    boolean a(int param0, int param1, ce param2, char param3) {
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        ce var9 = null;
        rd var10 = null;
        int stackIn_8_0 = 0;
        boolean stackIn_15_0 = false;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        boolean stackOut_14_0 = false;
        boolean stackOut_13_0 = false;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        var8 = client.field_A ? 1 : 0;
        try {
          L0: {
            var10 = new rd(this.field_H);
            var6 = 18 % ((-22 - param0) / 49);
            var9 = (ce) ((Object) var10.a((byte) 71));
            L1: while (true) {
              L2: {
                if (var9 == null) {
                  break L2;
                } else {
                  if (!var9.a((byte) 124)) {
                    break L2;
                  } else {
                    L3: {
                      if (!var9.a(true)) {
                        break L3;
                      } else {
                        if (var9.a(-79, param1, param2, param3)) {
                          stackOut_7_0 = 1;
                          stackIn_8_0 = stackOut_7_0;
                          return stackIn_8_0 != 0;
                        } else {
                          break L3;
                        }
                      }
                    }
                    var9 = (ce) ((Object) var10.a(-78));
                    continue L1;
                  }
                }
              }
              var7 = param1;
              if (var7 == 80) {
                L4: {
                  if (!bj.field_d[81]) {
                    stackOut_14_0 = this.a(32, param2);
                    stackIn_15_0 = stackOut_14_0;
                    break L4;
                  } else {
                    stackOut_13_0 = this.a(param2, (byte) -120);
                    stackIn_15_0 = stackOut_13_0;
                    break L4;
                  }
                }
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
            stackOut_16_0 = (RuntimeException) (var5);
            stackOut_16_1 = new StringBuilder().append("kf.QA(").append(param0).append(',').append(param1).append(',');
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param2 == null) {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L5;
            } else {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L5;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ',' + param3 + ')');
        }
        return stackIn_15_0;
    }

    final void a(int param0, int param1, int param2, ce param3, int param4, int param5) {
        rd var7 = null;
        RuntimeException var7_ref = null;
        ce var8 = null;
        int var9 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        var9 = client.field_A ? 1 : 0;
        try {
          L0: {
            var7 = new rd(this.field_H);
            var8 = (ce) ((Object) var7.a((byte) 71));
            L1: while (true) {
              L2: {
                if (var8 == null) {
                  break L2;
                } else {
                  if (!var8.a((byte) 119)) {
                    break L2;
                  } else {
                    var8.a(param0, param1, this.field_u + param2, param3, this.field_D + param4, param5);
                    var8 = (ce) ((Object) var7.a(-126));
                    continue L1;
                  }
                }
              }
              L3: {
                if (param1 == 64) {
                  break L3;
                } else {
                  field_J = (String) null;
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
            stackOut_8_0 = (RuntimeException) (var7_ref);
            stackOut_8_1 = new StringBuilder().append("kf.IB(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param3 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L4;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L4;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final static String a(CharSequence param0, byte param1) {
        StringBuilder discarded$1 = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        StringBuilder var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        Object stackIn_3_0 = null;
        Object stackIn_27_0 = null;
        String stackIn_29_0 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_28_0 = null;
        Object stackOut_26_0 = null;
        Object stackOut_2_0 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        var9 = client.field_A ? 1 : 0;
        try {
          L0: {
            if (param0 != null) {
              var2_int = 0;
              var3 = param0.length();
              L1: while (true) {
                L2: {
                  if (var3 <= var2_int) {
                    break L2;
                  } else {
                    if (!ug.a(param0.charAt(var2_int), 32)) {
                      break L2;
                    } else {
                      var2_int++;
                      continue L1;
                    }
                  }
                }
                L3: while (true) {
                  L4: {
                    if (var2_int >= var3) {
                      break L4;
                    } else {
                      if (!ug.a(param0.charAt(var3 + -1), 32)) {
                        break L4;
                      } else {
                        var3--;
                        continue L3;
                      }
                    }
                  }
                  var4 = -var2_int + var3;
                  if (var4 >= 1) {
                    if (12 >= var4) {
                      var5 = new StringBuilder(var4);
                      var6 = var2_int;
                      L5: while (true) {
                        if (~var3 >= ~var6) {
                          if (0 != var5.length()) {
                            stackOut_28_0 = var5.toString();
                            stackIn_29_0 = stackOut_28_0;
                            break L0;
                          } else {
                            stackOut_26_0 = null;
                            stackIn_27_0 = stackOut_26_0;
                            return (String) ((Object) stackIn_27_0);
                          }
                        } else {
                          L6: {
                            var7 = param0.charAt(var6);
                            if (!oe.a((char) var7, -6237)) {
                              break L6;
                            } else {
                              var8 = un.a(228, (char) var7);
                              if (var8 == 0) {
                                break L6;
                              } else {
                                discarded$1 = var5.append((char) var8);
                                break L6;
                              }
                            }
                          }
                          var6++;
                          continue L5;
                        }
                      }
                    } else {
                      return null;
                    }
                  } else {
                    return null;
                  }
                }
              }
            } else {
              stackOut_2_0 = null;
              stackIn_3_0 = stackOut_2_0;
              return (String) ((Object) stackIn_3_0);
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var2 = decompiledCaughtException;
            stackOut_30_0 = (RuntimeException) (var2);
            stackOut_30_1 = new StringBuilder().append("kf.MC(");
            stackIn_32_0 = stackOut_30_0;
            stackIn_32_1 = stackOut_30_1;
            stackIn_31_0 = stackOut_30_0;
            stackIn_31_1 = stackOut_30_1;
            if (param0 == null) {
              stackOut_32_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackOut_32_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackOut_32_2 = "null";
              stackIn_33_0 = stackOut_32_0;
              stackIn_33_1 = stackOut_32_1;
              stackIn_33_2 = stackOut_32_2;
              break L7;
            } else {
              stackOut_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackOut_31_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackOut_31_2 = "{...}";
              stackIn_33_0 = stackOut_31_0;
              stackIn_33_1 = stackOut_31_1;
              stackIn_33_2 = stackOut_31_2;
              break L7;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_33_0), stackIn_33_2 + ',' + 2 + ')');
        }
        return stackIn_29_0;
    }

    final int d(int param0) {
        int var5 = 0;
        int var6 = client.field_A ? 1 : 0;
        int var2 = 0;
        rd var3 = new rd(this.field_H);
        ce var4 = (ce) ((Object) var3.a((byte) 71));
        while (var4 != null) {
            var5 = var4.d(-31);
            if (!(var2 >= var5)) {
                var2 = var5;
            }
            var4 = (ce) ((Object) var3.a(-61));
        }
        var5 = -18 / ((36 - param0) / 51);
        return var2;
    }

    String c(byte param0) {
        boolean discarded$2 = false;
        rd var2 = null;
        ce var3 = null;
        String var4 = null;
        int var5 = 0;
        ce var6 = null;
        L0: {
          var5 = client.field_A ? 1 : 0;
          var2 = new rd(this.field_H);
          var3 = (ce) ((Object) var2.a((byte) 71));
          if (param0 == 113) {
            break L0;
          } else {
            var6 = (ce) null;
            discarded$2 = this.a(59, 12, 76, (ce) null, -65, -4, true);
            break L0;
          }
        }
        L1: while (true) {
          if (var3 != null) {
            var4 = var3.c((byte) 113);
            if (var4 == null) {
              var3 = (ce) ((Object) var2.a(-47));
              continue L1;
            } else {
              return var4;
            }
          } else {
            return null;
          }
        }
    }

    private final void g(int param0) {
        int var4 = client.field_A ? 1 : 0;
        rd var2 = new rd(this.field_H);
        ce var3 = (ce) ((Object) var2.a((byte) 71));
        while (var3 != null) {
            var3.f(121);
            var3 = (ce) ((Object) var2.a(-57));
        }
    }

    void b(int param0, int param1, int param2, int param3, int param4) {
        boolean discarded$0 = false;
        if (param4 != -16555) {
            ce var7 = (ce) null;
            discarded$0 = this.a((ce) null, (byte) 126);
        }
        super.b(param0, param1, param2, param3, param4);
        this.g(0);
    }

    final boolean a(ce param0, byte param1) {
        bh discarded$2 = null;
        rd var3 = null;
        RuntimeException var3_ref = null;
        ce var4 = null;
        rd var5 = null;
        ce var6 = null;
        int var7 = 0;
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
        var7 = client.field_A ? 1 : 0;
        try {
          L0: {
            if (!this.field_H.b(-105)) {
              var3 = new rd(this.field_H);
              var4 = (ce) ((Object) var3.a(true));
              L1: while (true) {
                if (var4 == null) {
                  if (param1 < -16) {
                    stackOut_17_0 = 0;
                    stackIn_18_0 = stackOut_17_0;
                    break L0;
                  } else {
                    field_Q = (w) null;
                    return false;
                  }
                } else {
                  L2: {
                    if (!var4.a(true)) {
                      break L2;
                    } else {
                      var5 = new rd(this.field_H);
                      discarded$2 = var5.a(var4, (byte) -88);
                      var6 = (ce) ((Object) var5.d(2078965185));
                      L3: while (true) {
                        if (var6 == null) {
                          break L2;
                        } else {
                          if (var6.a(false, param0)) {
                            stackOut_11_0 = 1;
                            stackIn_12_0 = stackOut_11_0;
                            return stackIn_12_0 != 0;
                          } else {
                            var6 = (ce) ((Object) var5.d(2078965185));
                            continue L3;
                          }
                        }
                      }
                    }
                  }
                  var4 = (ce) ((Object) var3.d(2078965185));
                  continue L1;
                }
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) (var3_ref);
            stackOut_19_1 = new StringBuilder().append("kf.QC(");
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param0 == null) {
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
          throw dh.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ',' + param1 + ')');
        }
        return stackIn_18_0 != 0;
    }

    final void d(byte param0) {
        String discarded$0 = null;
        int var4 = client.field_A ? 1 : 0;
        rd var2 = new rd(this.field_H);
        if (param0 != -95) {
            discarded$0 = this.c((byte) 50);
        }
        ce var3 = (ce) ((Object) var2.a((byte) 71));
        while (var3 != null) {
            var3.d((byte) -95);
            var3 = (ce) ((Object) var2.a(-98));
        }
    }

    final boolean a(int param0, int param1, ce param2, int param3, int param4, int param5, byte param6) {
        rd var8 = null;
        RuntimeException var8_ref = null;
        ce var9 = null;
        int var10 = 0;
        int stackIn_3_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_8_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var10 = client.field_A ? 1 : 0;
        try {
          L0: {
            var8 = new rd(this.field_H);
            var9 = (ce) ((Object) var8.a((byte) 71));
            if (param6 == -55) {
              L1: while (true) {
                L2: {
                  if (var9 == null) {
                    break L2;
                  } else {
                    if (!var9.a((byte) 120)) {
                      break L2;
                    } else {
                      if (var9.a(param0, param1, param2, param3, this.field_D + param4, this.field_u + param5, (byte) -55)) {
                        stackOut_8_0 = 1;
                        stackIn_9_0 = stackOut_8_0;
                        return stackIn_9_0 != 0;
                      } else {
                        var9 = (ce) ((Object) var8.a(-113));
                        continue L1;
                      }
                    }
                  }
                }
                stackOut_11_0 = 0;
                stackIn_12_0 = stackOut_11_0;
                break L0;
              }
            } else {
              stackOut_2_0 = 1;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var8_ref = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) (var8_ref);
            stackOut_13_1 = new StringBuilder().append("kf.LB(").append(param0).append(',').append(param1).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param2 == null) {
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
          throw dh.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        return stackIn_12_0 != 0;
    }

    kf(int param0, int param1, int param2, int param3, gl param4) {
        super(param0, param1, param2, param3, param4, (kg) null);
        this.field_H = new vj();
    }

    final boolean a(int param0, int param1, int param2, ce param3, int param4, int param5, boolean param6) {
        boolean discarded$2 = false;
        rd var8 = null;
        RuntimeException var8_ref = null;
        ce var9 = null;
        int var10 = 0;
        ce var11 = null;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
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
        var10 = client.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              var8 = new rd(this.field_H);
              if (!param6) {
                break L1;
              } else {
                var11 = (ce) null;
                discarded$2 = this.a(true, (ce) null);
                break L1;
              }
            }
            var9 = (ce) ((Object) var8.a((byte) 71));
            L2: while (true) {
              L3: {
                if (var9 == null) {
                  break L3;
                } else {
                  if (!var9.a((byte) 67)) {
                    break L3;
                  } else {
                    L4: {
                      if (!var9.a(true)) {
                        break L4;
                      } else {
                        if (var9.a(param0, param1, param2, param3, param4, param5, param6)) {
                          stackOut_9_0 = 1;
                          stackIn_10_0 = stackOut_9_0;
                          return stackIn_10_0 != 0;
                        } else {
                          break L4;
                        }
                      }
                    }
                    var9 = (ce) ((Object) var8.a(-128));
                    continue L2;
                  }
                }
              }
              stackOut_12_0 = 0;
              stackIn_13_0 = stackOut_12_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var8_ref = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) (var8_ref);
            stackOut_14_1 = new StringBuilder().append("kf.FC(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param3 == null) {
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
          throw dh.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        return stackIn_13_0 != 0;
    }

    private final void a(int param0, int param1, StringBuilder param2, Hashtable param3) {
        StringBuilder discarded$12 = null;
        StringBuilder discarded$13 = null;
        StringBuilder discarded$14 = null;
        rd var5 = null;
        RuntimeException var5_ref = null;
        ce var6 = null;
        int var7 = 0;
        int var8 = 0;
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
        var8 = client.field_A ? 1 : 0;
        try {
          L0: {
            var5 = new rd(this.field_H);
            var6 = (ce) ((Object) var5.a((byte) 71));
            L1: while (true) {
              if (var6 == null) {
                break L0;
              } else {
                discarded$12 = param2.append('\n');
                var7 = 0;
                L2: while (true) {
                  if (~var7 < ~param0) {
                    discarded$13 = var6.a(param3, 1 + param0, param2, true);
                    var6 = (ce) ((Object) var5.a(-113));
                    continue L1;
                  } else {
                    discarded$14 = param2.append(' ');
                    var7++;
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
            stackOut_8_1 = new StringBuilder().append("kf.OC(").append(param0).append(',').append(0).append(',');
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
          L4: {
            stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
            stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param3 == null) {
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
          throw dh.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
        }
    }

    void a(int param0, int param1, int param2, int param3) {
        int var7 = client.field_A ? 1 : 0;
        if (param2 == 0) {
            if (this.field_p != null) {
                this.field_p.a(true, param0, param3, (byte) -108, (ce) (this));
            }
        }
        rd var5 = new rd(this.field_H);
        ce var6 = (ce) ((Object) var5.a(true));
        while (var6 != null) {
            var6.a(param0 + this.field_u, -124, param2, param3 - -this.field_D);
            var6 = (ce) ((Object) var5.d(2078965185));
        }
        if (param1 > -103) {
            this.a(59, -115, 20, 76);
        }
    }

    final StringBuilder a(Hashtable param0, int param1, StringBuilder param2, boolean param3) {
        RuntimeException var5 = null;
        StringBuilder stackIn_5_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        StringBuilder stackOut_4_0 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            L1: {
              if (!this.a(0, param1, param0, param2)) {
                break L1;
              } else {
                this.a((byte) 72, param2, param0, param1);
                this.a(param1, 0, param2, param0);
                break L1;
              }
            }
            L2: {
              if (param3) {
                break L2;
              } else {
                field_P = (ud) null;
                break L2;
              }
            }
            stackOut_4_0 = (StringBuilder) (param2);
            stackIn_5_0 = stackOut_4_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) (var5);
            stackOut_6_1 = new StringBuilder().append("kf.MB(");
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
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
          L4: {
            stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
            stackOut_9_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',').append(param1).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param2 == null) {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L4;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L4;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param3 + ')');
        }
        return stackIn_5_0;
    }

    final boolean a(int param0, ce param1) {
        bh discarded$2 = null;
        RuntimeException var3 = null;
        ce var4 = null;
        rd var5 = null;
        ce var6 = null;
        int var7 = 0;
        rd var8 = null;
        int stackIn_4_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_12_0 = 0;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        var7 = client.field_A ? 1 : 0;
        try {
          L0: {
            if (this.field_H.b(-15)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            } else {
              var8 = new rd(this.field_H);
              var4 = (ce) ((Object) var8.a((byte) 71));
              L1: while (true) {
                if (var4 == null) {
                  L2: {
                    if (param0 == 32) {
                      break L2;
                    } else {
                      kf.h(-42);
                      break L2;
                    }
                  }
                  stackOut_18_0 = 0;
                  stackIn_19_0 = stackOut_18_0;
                  break L0;
                } else {
                  L3: {
                    if (!var4.a(true)) {
                      break L3;
                    } else {
                      var5 = new rd(this.field_H);
                      discarded$2 = var5.a(var4, false);
                      var6 = (ce) ((Object) var5.a(param0 ^ -24));
                      L4: while (true) {
                        if (var6 == null) {
                          break L3;
                        } else {
                          if (var6.a(false, param1)) {
                            stackOut_12_0 = 1;
                            stackIn_13_0 = stackOut_12_0;
                            return stackIn_13_0 != 0;
                          } else {
                            var6 = (ce) ((Object) var5.a(param0 + -119));
                            continue L4;
                          }
                        }
                      }
                    }
                  }
                  var4 = (ce) ((Object) var8.a(-109));
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) (var3);
            stackOut_20_1 = new StringBuilder().append("kf.PC(").append(param0).append(',');
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param1 == null) {
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
          throw dh.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ')');
        }
        return stackIn_19_0 != 0;
    }

    public static void h(int param0) {
        if (param0 < 72) {
            kf.h(-51);
        }
        field_P = null;
        field_R = null;
        field_Q = null;
        field_I = null;
        field_J = null;
        field_N = null;
        field_G = null;
    }

    ce e(byte param0) {
        int var4 = client.field_A ? 1 : 0;
        rd var2 = new rd(this.field_H);
        ce var3 = (ce) ((Object) var2.a((byte) 71));
        while (var3 != null) {
            if (!(!var3.a(true))) {
                return var3;
            }
            var3 = (ce) ((Object) var2.a(-92));
        }
        if (param0 == -74) {
            return null;
        }
        field_P = (ud) null;
        return null;
    }

    final boolean a(boolean param0, ce param1) {
        rd var3 = null;
        RuntimeException var3_ref = null;
        ce var4 = null;
        int var5 = 0;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_6_0 = 0;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var5 = client.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              if (!param0) {
                break L1;
              } else {
                field_O = -99;
                break L1;
              }
            }
            var3 = new rd(this.field_H);
            var4 = (ce) ((Object) var3.a((byte) 71));
            L2: while (true) {
              if (var4 == null) {
                stackOut_9_0 = 0;
                stackIn_10_0 = stackOut_9_0;
                break L0;
              } else {
                if (!var4.a(false, param1)) {
                  var4 = (ce) ((Object) var3.a(-69));
                  continue L2;
                } else {
                  stackOut_6_0 = 1;
                  stackIn_7_0 = stackOut_6_0;
                  return stackIn_7_0 != 0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) (var3_ref);
            stackOut_11_1 = new StringBuilder().append("kf.EC(").append(param0).append(',');
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
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L3;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
        }
        return stackIn_10_0 != 0;
    }

    static {
        field_R = "Offer draw";
        field_N = "Unable to connect to the data server. Please check any firewall you are using.";
        field_L = -1;
        field_J = "This is your RuneScape clan if you have one.";
    }
}
