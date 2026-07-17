/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class dn extends h {
    static mh field_K;
    private int field_H;
    static String field_J;
    private int field_O;
    private int field_G;
    private int field_I;
    static mh field_N;
    private boolean field_L;
    private boolean field_M;

    final boolean a(oc param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int var8_int = 0;
        RuntimeException var8 = null;
        int stackIn_7_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_6_0 = 0;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        try {
          L0: {
            L1: {
              var8_int = super.a(param0, param1, param2, param3, param4, param5, param6) ? 1 : 0;
              if (var8_int == 0) {
                break L1;
              } else {
                if (((dn) this).field_M) {
                  stackOut_10_0 = 1;
                  stackIn_11_0 = stackOut_10_0;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            if (!((dn) this).a(param5, param3, param2, param6 ^ 3, param1)) {
              stackOut_8_0 = var8_int;
              stackIn_9_0 = stackOut_8_0;
              return stackIn_9_0 != 0;
            } else {
              ((dn) this).field_n = param4;
              if (1 != param4) {
                stackOut_6_0 = 1;
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0 != 0;
              } else {
                ((dn) this).field_H = -param3 + (-((dn) this).field_w + param5);
                gd.field_c = (dn) this;
                ((dn) this).field_G = -param2 + -((dn) this).field_o + param1;
                return true;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var8 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var8;
            stackOut_12_1 = new StringBuilder().append("dn.MA(");
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L2;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L2;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + param6 + 41);
        }
        return stackIn_11_0 != 0;
    }

    final static void a(int param0, String param1, ml param2, int param3, dh param4) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        var9 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            L1: {
              var5_int = 0;
              var6 = -1;
              if (param0 == 25293) {
                break L1;
              } else {
                field_N = null;
                break L1;
              }
            }
            var7 = 1;
            L2: while (true) {
              if (var7 >= param1.length()) {
                break L0;
              } else {
                L3: {
                  var8 = param1.charAt(var7);
                  if (60 != var8) {
                    break L3;
                  } else {
                    var6 = param2.field_g[0] + (var5_int >> 8) + param4.c(param1.substring(0, var7));
                    break L3;
                  }
                }
                L4: {
                  if (-1 != var6) {
                    param2.field_g[var7] = var6;
                    break L4;
                  } else {
                    L5: {
                      if (32 == var8) {
                        var5_int = var5_int + param3;
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    param2.field_g[var7] = (var5_int >> 8) - (-param2.field_g[0] - param4.c(param1.substring(0, var7 + 1))) - param4.a((char) var8);
                    break L4;
                  }
                }
                L6: {
                  if (var8 == 62) {
                    var6 = -1;
                    break L6;
                  } else {
                    break L6;
                  }
                }
                var7++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var5 = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) var5;
            stackOut_18_1 = new StringBuilder().append("dn.E(").append(param0).append(44);
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param1 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L7;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L7;
            }
          }
          L8: {
            stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
            stackOut_21_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_21_2).append(44);
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param2 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L8;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L8;
            }
          }
          L9: {
            stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
            stackOut_24_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_24_2).append(44).append(param3).append(44);
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param4 == null) {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L9;
            } else {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L9;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_27_0, stackIn_27_2 + 41);
        }
    }

    final void a(byte param0) {
        super.a((byte) -39);
        ((dn) this).field_E.a(((dn) this).field_s, 0, 0, (byte) -119, ((dn) this).field_t);
        if (param0 > -7) {
            um discarded$0 = dn.g(1);
        }
        ((dn) this).field_I = ((dn) this).field_o;
        ((dn) this).field_O = ((dn) this).field_w;
    }

    private dn(int param0, int param1, int param2, int param3, ub param4, uh param5, oc param6, boolean param7, boolean param8) {
        super(param0, param1, param2, param3, param4, param5);
        ((dn) this).field_O = 2147483647;
        ((dn) this).field_I = 2147483647;
        try {
            ((dn) this).field_L = param7 ? true : false;
            ((dn) this).field_E = param6;
            ((dn) this).field_M = param8 ? true : false;
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) (Object) runtimeException, "dn.<init>(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + (param4 != null ? "{...}" : "null") + 44 + (param5 != null ? "{...}" : "null") + 44 + (param6 != null ? "{...}" : "null") + 44 + param7 + 44 + param8 + 41);
        }
    }

    final void a(oc param0, byte param1, int param2, int param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        Object stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        Object stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        Object stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        Object stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        Object stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        int stackIn_14_2 = 0;
        Object stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        Object stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        Object stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        Object stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        Object stackIn_22_0 = null;
        int stackIn_22_1 = 0;
        int stackIn_22_2 = 0;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        Object stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        Object stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        int stackOut_13_2 = 0;
        Object stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        int stackOut_12_2 = 0;
        Object stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        int stackOut_10_2 = 0;
        Object stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        Object stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        Object stackOut_21_0 = null;
        int stackOut_21_1 = 0;
        int stackOut_21_2 = 0;
        Object stackOut_20_0 = null;
        int stackOut_20_1 = 0;
        int stackOut_20_2 = 0;
        Object stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        int stackOut_18_2 = 0;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        try {
          L0: {
            L1: {
              L2: {
                L3: {
                  L4: {
                    if (!(((dn) this).field_E instanceof d)) {
                      break L4;
                    } else {
                      if (!((d) (Object) ((dn) this).field_E).field_J) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                  if (1 == ((dn) this).field_n) {
                    L5: {
                      var5_int = pq.field_k - ((dn) this).field_G - param2;
                      var6 = po.field_a + (-((dn) this).field_H - param3);
                      if (((dn) this).field_o != var5_int) {
                        break L5;
                      } else {
                        if (var6 != ((dn) this).field_w) {
                          break L5;
                        } else {
                          super.a(param0, param1, param2, param3);
                          break L1;
                        }
                      }
                    }
                    ((dn) this).field_w = var6;
                    ((dn) this).field_o = var5_int;
                    if (((dn) this).field_i instanceof li) {
                      ((li) (Object) ((dn) this).field_i).a((byte) -68, param3, param2, (dn) this);
                      break L2;
                    } else {
                      break L2;
                    }
                  } else {
                    break L3;
                  }
                }
                if (((dn) this).field_L) {
                  L6: {
                    if (((dn) this).field_o != ((dn) this).field_I) {
                      L7: {
                        var5_int = ((dn) this).field_I - ((dn) this).field_o;
                        stackOut_9_0 = this;
                        stackOut_9_1 = ((dn) this).field_o;
                        stackIn_11_0 = stackOut_9_0;
                        stackIn_11_1 = stackOut_9_1;
                        stackIn_10_0 = stackOut_9_0;
                        stackIn_10_1 = stackOut_9_1;
                        if (Math.abs(var5_int) <= 2) {
                          stackOut_11_0 = this;
                          stackOut_11_1 = stackIn_11_1;
                          stackIn_13_0 = stackOut_11_0;
                          stackIn_13_1 = stackOut_11_1;
                          stackIn_12_0 = stackOut_11_0;
                          stackIn_12_1 = stackOut_11_1;
                          if (var5_int <= 0) {
                            stackOut_13_0 = this;
                            stackOut_13_1 = stackIn_13_1;
                            stackOut_13_2 = -1;
                            stackIn_14_0 = stackOut_13_0;
                            stackIn_14_1 = stackOut_13_1;
                            stackIn_14_2 = stackOut_13_2;
                            break L7;
                          } else {
                            stackOut_12_0 = this;
                            stackOut_12_1 = stackIn_12_1;
                            stackOut_12_2 = 1;
                            stackIn_14_0 = stackOut_12_0;
                            stackIn_14_1 = stackOut_12_1;
                            stackIn_14_2 = stackOut_12_2;
                            break L7;
                          }
                        } else {
                          stackOut_10_0 = this;
                          stackOut_10_1 = stackIn_10_1;
                          stackOut_10_2 = var5_int >> 1;
                          stackIn_14_0 = stackOut_10_0;
                          stackIn_14_1 = stackOut_10_1;
                          stackIn_14_2 = stackOut_10_2;
                          break L7;
                        }
                      }
                      ((dn) this).field_o = stackIn_14_1 + stackIn_14_2;
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                  if (((dn) this).field_O != ((dn) this).field_w) {
                    L8: {
                      var5_int = ((dn) this).field_O - ((dn) this).field_w;
                      stackOut_17_0 = this;
                      stackOut_17_1 = ((dn) this).field_w;
                      stackIn_19_0 = stackOut_17_0;
                      stackIn_19_1 = stackOut_17_1;
                      stackIn_18_0 = stackOut_17_0;
                      stackIn_18_1 = stackOut_17_1;
                      if (2 >= Math.abs(var5_int)) {
                        stackOut_19_0 = this;
                        stackOut_19_1 = stackIn_19_1;
                        stackIn_21_0 = stackOut_19_0;
                        stackIn_21_1 = stackOut_19_1;
                        stackIn_20_0 = stackOut_19_0;
                        stackIn_20_1 = stackOut_19_1;
                        if (var5_int <= 0) {
                          stackOut_21_0 = this;
                          stackOut_21_1 = stackIn_21_1;
                          stackOut_21_2 = -1;
                          stackIn_22_0 = stackOut_21_0;
                          stackIn_22_1 = stackOut_21_1;
                          stackIn_22_2 = stackOut_21_2;
                          break L8;
                        } else {
                          stackOut_20_0 = this;
                          stackOut_20_1 = stackIn_20_1;
                          stackOut_20_2 = 1;
                          stackIn_22_0 = stackOut_20_0;
                          stackIn_22_1 = stackOut_20_1;
                          stackIn_22_2 = stackOut_20_2;
                          break L8;
                        }
                      } else {
                        stackOut_18_0 = this;
                        stackOut_18_1 = stackIn_18_1;
                        stackOut_18_2 = var5_int >> 1;
                        stackIn_22_0 = stackOut_18_0;
                        stackIn_22_1 = stackOut_18_1;
                        stackIn_22_2 = stackOut_18_2;
                        break L8;
                      }
                    }
                    ((dn) this).field_w = stackIn_22_1 + stackIn_22_2;
                    break L2;
                  } else {
                    break L2;
                  }
                } else {
                  break L2;
                }
              }
              super.a(param0, param1, param2, param3);
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var5 = decompiledCaughtException;
            stackOut_31_0 = (RuntimeException) var5;
            stackOut_31_1 = new StringBuilder().append("dn.WA(");
            stackIn_33_0 = stackOut_31_0;
            stackIn_33_1 = stackOut_31_1;
            stackIn_32_0 = stackOut_31_0;
            stackIn_32_1 = stackOut_31_1;
            if (param0 == null) {
              stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
              stackOut_33_1 = (StringBuilder) (Object) stackIn_33_1;
              stackOut_33_2 = "null";
              stackIn_34_0 = stackOut_33_0;
              stackIn_34_1 = stackOut_33_1;
              stackIn_34_2 = stackOut_33_2;
              break L9;
            } else {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "{...}";
              stackIn_34_0 = stackOut_32_0;
              stackIn_34_1 = stackOut_32_1;
              stackIn_34_2 = stackOut_32_2;
              break L9;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_34_0, stackIn_34_2 + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
    }

    public static void a() {
        field_J = null;
        field_N = null;
        field_K = null;
    }

    final static um g(int param0) {
        if (param0 != -23009) {
            field_J = null;
        }
        if (ad.field_e == null) {
            ad.field_e = new um(og.field_Yb, 20, 0, 0, 0, 11579568, -1, 0, 0, og.field_Yb.field_F, -1, 2147483647, true);
        }
        return ad.field_e;
    }

    final void a(int param0, int param1, int param2, oc param3, int param4, int param5) {
        try {
            super.a(param0, param1, param2, param3, param4, param5);
            ((dn) this).field_n = 0;
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) (Object) runtimeException, "dn.GA(" + param0 + 44 + param1 + 44 + param2 + 44 + (param3 != null ? "{...}" : "null") + 44 + param4 + 44 + param5 + 41);
        }
    }

    final static void b(int param0, int param1, int param2) {
        int var3 = -51 / ((-23 - param1) / 62);
        pi var4 = k.field_h;
        var4.e(-13413, param2);
        var4.a(-100, 3);
        var4.a(-15, 10);
        var4.b((byte) 122, param0);
    }

    final StringBuilder a(int param0, Hashtable param1, int param2, StringBuilder param3) {
        RuntimeException var5 = null;
        Object var6 = null;
        StringBuilder stackIn_8_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        StringBuilder stackOut_7_0 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        try {
          L0: {
            L1: {
              if (!((dn) this).a(param3, 1595637992, param0, param1)) {
                break L1;
              } else {
                ((dn) this).a(param1, param0, 0, param3);
                ((dn) this).a(param3, true, param1, param0);
                StringBuilder discarded$28 = param3.append(" revert=").append(((dn) this).field_L);
                if (((dn) this).field_I == 2147483647) {
                  break L1;
                } else {
                  if (((dn) this).field_O != 2147483647) {
                    StringBuilder discarded$29 = param3.append(" to ").append(((dn) this).field_I).append(44).append(((dn) this).field_O);
                    break L1;
                  } else {
                    break L1;
                  }
                }
              }
            }
            L2: {
              if (param2 == 24) {
                break L2;
              } else {
                var6 = null;
                StringBuilder discarded$30 = ((dn) this).a(-94, (Hashtable) null, 17, (StringBuilder) null);
                break L2;
              }
            }
            stackOut_7_0 = (StringBuilder) param3;
            stackIn_8_0 = stackOut_7_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var5;
            stackOut_9_1 = new StringBuilder().append("dn.UA(").append(param0).append(44);
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param1 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          L4: {
            stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
            stackOut_12_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(44).append(param2).append(44);
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param3 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L4;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 41);
        }
        return stackIn_8_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_J = "<%0> is already on your ignore list.";
    }
}
