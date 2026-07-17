/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class hg extends to {
    static String field_z;
    static ca field_y;
    private int field_v;
    private int field_u;
    private int field_A;
    private boolean field_E;
    private boolean field_w;
    private int field_B;
    static gk field_x;
    static int field_D;
    static int[] field_C;

    final boolean a(int param0, int param1, int param2, int param3, int param4, ea param5, int param6) {
        int var8_int = 0;
        RuntimeException var8 = null;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_5_0 = 0;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            L1: {
              var8_int = super.a((int) (char)param0, param1, param2, param3, param4, param5, param6) ? 1 : 0;
              if (var8_int == 0) {
                break L1;
              } else {
                if (!((hg) this).field_E) {
                  break L1;
                } else {
                  stackOut_2_0 = 1;
                  stackIn_3_0 = stackOut_2_0;
                  return stackIn_3_0 != 0;
                }
              }
            }
            if (((hg) this).a(param6, param4, -73, param1, param2)) {
              ((hg) this).field_i = param3;
              if (param3 != 1) {
                stackOut_9_0 = 1;
                stackIn_10_0 = stackOut_9_0;
                break L0;
              } else {
                ((hg) this).field_A = -param4 + (param6 + -((hg) this).field_h);
                mm.field_a = (hg) this;
                ((hg) this).field_B = -param1 + (-((hg) this).field_p + param2);
                return true;
              }
            } else {
              stackOut_5_0 = var8_int;
              stackIn_6_0 = stackOut_5_0;
              return stackIn_6_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var8 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var8;
            stackOut_11_1 = new StringBuilder().append("hg.O(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44).append(param4).append(44);
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param5 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L2;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L2;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 44 + param6 + 41);
        }
        return stackIn_10_0 != 0;
    }

    final static fr a(int param0, String param1) {
        RuntimeException var2 = null;
        fr stackIn_8_0 = null;
        Object stackIn_10_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        fr stackOut_7_0 = null;
        Object stackOut_9_0 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == 2147483647) {
                break L1;
              } else {
                hg.j(-34);
                break L1;
              }
            }
            if (nb.field_c != jq.field_fb) {
              L2: {
                if (uk.field_j != nb.field_c) {
                  break L2;
                } else {
                  if (!param1.equals((Object) (Object) ua.field_j)) {
                    break L2;
                  } else {
                    nb.field_c = dk.field_h;
                    stackOut_7_0 = vb.field_l;
                    stackIn_8_0 = stackOut_7_0;
                    return stackIn_8_0;
                  }
                }
              }
              vb.field_l = null;
              ua.field_j = param1;
              nb.field_c = jq.field_fb;
              stackOut_9_0 = null;
              stackIn_10_0 = stackOut_9_0;
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var2;
            stackOut_11_1 = new StringBuilder().append("hg.AA(").append(param0).append(44);
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L3;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 41);
        }
        return (fr) (Object) stackIn_10_0;
    }

    final StringBuilder a(StringBuilder param0, int param1, int param2, Hashtable param3) {
        RuntimeException var5 = null;
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
              if (!((hg) this).a(param0, param2, false, param3)) {
                break L1;
              } else {
                ((hg) this).a(param0, 0, param3, param2);
                ((hg) this).a(param0, param3, (byte) -24, param2);
                StringBuilder discarded$26 = param0.append(" revert=").append(((hg) this).field_w);
                if (((hg) this).field_u == 2147483647) {
                  break L1;
                } else {
                  if (2147483647 != ((hg) this).field_v) {
                    StringBuilder discarded$27 = param0.append(" to ").append(((hg) this).field_u).append(44).append(((hg) this).field_v);
                    break L1;
                  } else {
                    break L1;
                  }
                }
              }
            }
            L2: {
              if (param1 == 32462) {
                break L2;
              } else {
                ((hg) this).field_w = false;
                break L2;
              }
            }
            stackOut_7_0 = (StringBuilder) param0;
            stackIn_8_0 = stackOut_7_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var5;
            stackOut_9_1 = new StringBuilder().append("hg.A(");
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
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
            stackOut_12_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(44).append(param1).append(44).append(param2).append(44);
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
          throw pn.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 41);
        }
        return stackIn_8_0;
    }

    final static void a(boolean param0, boolean param1, boolean param2) {
        int discarded$0 = -61;
        hr.a(param2, (String) null, param0);
    }

    private hg(int param0, int param1, int param2, int param3, ir param4, no param5, ea param6, boolean param7, boolean param8) {
        super(param0, param1, param2, param3, param4, param5);
        ((hg) this).field_u = 2147483647;
        ((hg) this).field_v = 2147483647;
        try {
            ((hg) this).field_E = param8 ? true : false;
            ((hg) this).field_s = param6;
            ((hg) this).field_w = param7 ? true : false;
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) (Object) runtimeException, "hg.<init>(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + (param4 != null ? "{...}" : "null") + 44 + (param5 != null ? "{...}" : "null") + 44 + (param6 != null ? "{...}" : "null") + 44 + param7 + 44 + param8 + 41);
        }
    }

    final void a(byte param0, ea param1, int param2, int param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        Object stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        Object stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        Object stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        Object stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        Object stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        int stackIn_12_2 = 0;
        Object stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        Object stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        Object stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        Object stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        Object stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        int stackIn_20_2 = 0;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        Object stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        int stackOut_11_2 = 0;
        Object stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        Object stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        int stackOut_10_2 = 0;
        Object stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        int stackOut_9_2 = 0;
        Object stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        Object stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        Object stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        int stackOut_19_2 = 0;
        Object stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        int stackOut_18_2 = 0;
        Object stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        int stackOut_16_2 = 0;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        try {
          L0: {
            L1: {
              L2: {
                L3: {
                  if (!(((hg) this).field_s instanceof mi)) {
                    break L3;
                  } else {
                    if (!((mi) (Object) ((hg) this).field_s).field_u) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                if (((hg) this).field_i == 1) {
                  L4: {
                    var5_int = -param3 + (-((hg) this).field_B + ic.field_b);
                    var6 = -param2 + cf.field_g - ((hg) this).field_A;
                    if (((hg) this).field_p != var5_int) {
                      break L4;
                    } else {
                      if (var6 == ((hg) this).field_h) {
                        break L1;
                      } else {
                        break L4;
                      }
                    }
                  }
                  ((hg) this).field_h = var6;
                  ((hg) this).field_p = var5_int;
                  if (!(((hg) this).field_o instanceof ih)) {
                    break L1;
                  } else {
                    ((ih) (Object) ((hg) this).field_o).a((hg) this, param2, param3, (byte) -105);
                    break L1;
                  }
                } else {
                  break L2;
                }
              }
              if (!((hg) this).field_w) {
                break L1;
              } else {
                L5: {
                  if (((hg) this).field_p == ((hg) this).field_u) {
                    break L5;
                  } else {
                    L6: {
                      var5_int = ((hg) this).field_u - ((hg) this).field_p;
                      stackOut_7_0 = this;
                      stackOut_7_1 = ((hg) this).field_p;
                      stackIn_11_0 = stackOut_7_0;
                      stackIn_11_1 = stackOut_7_1;
                      stackIn_8_0 = stackOut_7_0;
                      stackIn_8_1 = stackOut_7_1;
                      if (Math.abs(var5_int) > 2) {
                        stackOut_11_0 = this;
                        stackOut_11_1 = stackIn_11_1;
                        stackOut_11_2 = var5_int >> 1;
                        stackIn_12_0 = stackOut_11_0;
                        stackIn_12_1 = stackOut_11_1;
                        stackIn_12_2 = stackOut_11_2;
                        break L6;
                      } else {
                        stackOut_8_0 = this;
                        stackOut_8_1 = stackIn_8_1;
                        stackIn_10_0 = stackOut_8_0;
                        stackIn_10_1 = stackOut_8_1;
                        stackIn_9_0 = stackOut_8_0;
                        stackIn_9_1 = stackOut_8_1;
                        if (var5_int > 0) {
                          stackOut_10_0 = this;
                          stackOut_10_1 = stackIn_10_1;
                          stackOut_10_2 = 1;
                          stackIn_12_0 = stackOut_10_0;
                          stackIn_12_1 = stackOut_10_1;
                          stackIn_12_2 = stackOut_10_2;
                          break L6;
                        } else {
                          stackOut_9_0 = this;
                          stackOut_9_1 = stackIn_9_1;
                          stackOut_9_2 = -1;
                          stackIn_12_0 = stackOut_9_0;
                          stackIn_12_1 = stackOut_9_1;
                          stackIn_12_2 = stackOut_9_2;
                          break L6;
                        }
                      }
                    }
                    ((hg) this).field_p = stackIn_12_1 + stackIn_12_2;
                    break L5;
                  }
                }
                if (((hg) this).field_v != ((hg) this).field_h) {
                  L7: {
                    var5_int = -((hg) this).field_h + ((hg) this).field_v;
                    stackOut_15_0 = this;
                    stackOut_15_1 = ((hg) this).field_h;
                    stackIn_17_0 = stackOut_15_0;
                    stackIn_17_1 = stackOut_15_1;
                    stackIn_16_0 = stackOut_15_0;
                    stackIn_16_1 = stackOut_15_1;
                    if (Math.abs(var5_int) <= 2) {
                      stackOut_17_0 = this;
                      stackOut_17_1 = stackIn_17_1;
                      stackIn_19_0 = stackOut_17_0;
                      stackIn_19_1 = stackOut_17_1;
                      stackIn_18_0 = stackOut_17_0;
                      stackIn_18_1 = stackOut_17_1;
                      if (0 >= var5_int) {
                        stackOut_19_0 = this;
                        stackOut_19_1 = stackIn_19_1;
                        stackOut_19_2 = -1;
                        stackIn_20_0 = stackOut_19_0;
                        stackIn_20_1 = stackOut_19_1;
                        stackIn_20_2 = stackOut_19_2;
                        break L7;
                      } else {
                        stackOut_18_0 = this;
                        stackOut_18_1 = stackIn_18_1;
                        stackOut_18_2 = 1;
                        stackIn_20_0 = stackOut_18_0;
                        stackIn_20_1 = stackOut_18_1;
                        stackIn_20_2 = stackOut_18_2;
                        break L7;
                      }
                    } else {
                      stackOut_16_0 = this;
                      stackOut_16_1 = stackIn_16_1;
                      stackOut_16_2 = var5_int >> 1;
                      stackIn_20_0 = stackOut_16_0;
                      stackIn_20_1 = stackOut_16_1;
                      stackIn_20_2 = stackOut_16_2;
                      break L7;
                    }
                  }
                  ((hg) this).field_h = stackIn_20_1 + stackIn_20_2;
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            L8: {
              super.a((byte) 40, param1, param2, param3);
              if (param0 >= 13) {
                break L8;
              } else {
                ((hg) this).field_w = false;
                break L8;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var5 = decompiledCaughtException;
            stackOut_29_0 = (RuntimeException) var5;
            stackOut_29_1 = new StringBuilder().append("hg.S(").append(param0).append(44);
            stackIn_31_0 = stackOut_29_0;
            stackIn_31_1 = stackOut_29_1;
            stackIn_30_0 = stackOut_29_0;
            stackIn_30_1 = stackOut_29_1;
            if (param1 == null) {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "null";
              stackIn_32_0 = stackOut_31_0;
              stackIn_32_1 = stackOut_31_1;
              stackIn_32_2 = stackOut_31_2;
              break L9;
            } else {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "{...}";
              stackIn_32_0 = stackOut_30_0;
              stackIn_32_1 = stackOut_30_1;
              stackIn_32_2 = stackOut_30_2;
              break L9;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_32_0, stackIn_32_2 + 44 + param2 + 44 + param3 + 41);
        }
    }

    public static void j(int param0) {
        field_y = null;
        field_C = null;
        field_x = null;
        if (param0 != 65793) {
            field_D = 4;
        }
        field_z = null;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, wu param7) {
        RuntimeException var8 = null;
        int[] var8_array = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        Object var21 = null;
        me var21_ref = null;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        int var39 = 0;
        int var40 = 0;
        int[] var41 = null;
        int var44 = 0;
        wu var45 = null;
        int[] var50 = null;
        int[] var55 = null;
        int[] var60 = null;
        byte[] var62 = null;
        int[] var63 = null;
        int[] var64 = null;
        int[] var65 = null;
        int[] var66 = null;
        int[] var67 = null;
        int stackIn_14_0 = 0;
        int[] stackIn_15_0 = null;
        int[] stackIn_16_0 = null;
        int[] stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        int stackIn_25_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_31_0 = 0;
        me stackIn_38_0 = null;
        int stackIn_43_0 = 0;
        int stackIn_47_0 = 0;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        String stackIn_53_2 = null;
        RuntimeException decompiledCaughtException = null;
        short stackOut_24_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_27_0 = 0;
        short stackOut_26_0 = 0;
        int stackOut_30_0 = 0;
        short stackOut_29_0 = 0;
        me stackOut_36_0 = null;
        Object stackOut_37_0 = null;
        int stackOut_42_0 = 0;
        int stackOut_41_0 = 0;
        int stackOut_46_0 = 0;
        int stackOut_45_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        int[] stackOut_14_0 = null;
        int[] stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        int[] stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        RuntimeException stackOut_50_0 = null;
        StringBuilder stackOut_50_1 = null;
        RuntimeException stackOut_52_0 = null;
        StringBuilder stackOut_52_1 = null;
        String stackOut_52_2 = null;
        RuntimeException stackOut_51_0 = null;
        StringBuilder stackOut_51_1 = null;
        String stackOut_51_2 = null;
        var40 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                var45 = param7;
                if (var45.field_x == null) {
                  break L2;
                } else {
                  if (1 >= var45.field_f) {
                    break L2;
                  } else {
                    var62 = var45.field_x;
                    nr.a(hs.field_a, false, var62, 0, 0);
                    break L1;
                  }
                }
              }
              pn.a(true);
              break L1;
            }
            var66 = new int[param7.field_q];
            var60 = var66;
            var55 = var60;
            var50 = var55;
            var41 = var50;
            var8_array = var41;
            var67 = new int[param7.field_q];
            var64 = ip.field_b;
            var63 = ql.field_o;
            var65 = dq.field_c;
            var13 = 0;
            L3: while (true) {
              if (var13 >= param7.field_q) {
                var44 = 0;
                var13 = var44;
                L4: while (true) {
                  if (gb.field_k <= var44) {
                    break L0;
                  } else {
                    L5: {
                      var14 = jr.field_n[var44];
                      var15 = param7.field_I[var14];
                      var16 = param7.field_t[var14];
                      var17 = param7.field_m[var14];
                      if (ip.field_b.length > param7.field_B[var14]) {
                        stackOut_24_0 = param7.field_B[var14];
                        stackIn_25_0 = stackOut_24_0;
                        break L5;
                      } else {
                        stackOut_23_0 = -1;
                        stackIn_25_0 = stackOut_23_0;
                        break L5;
                      }
                    }
                    L6: {
                      var18 = stackIn_25_0;
                      if (param7.field_g[var14] >= ip.field_b.length) {
                        stackOut_27_0 = -1;
                        stackIn_28_0 = stackOut_27_0;
                        break L6;
                      } else {
                        stackOut_26_0 = param7.field_g[var14];
                        stackIn_28_0 = stackOut_26_0;
                        break L6;
                      }
                    }
                    L7: {
                      var19 = stackIn_28_0;
                      if (ip.field_b.length <= param7.field_D[var14]) {
                        stackOut_30_0 = -1;
                        stackIn_31_0 = stackOut_30_0;
                        break L7;
                      } else {
                        stackOut_29_0 = param7.field_D[var14];
                        stackIn_31_0 = stackOut_29_0;
                        break L7;
                      }
                    }
                    L8: {
                      L9: {
                        var20 = stackIn_31_0;
                        if (null == gj.field_a) {
                          break L9;
                        } else {
                          if (null == param7.field_u) {
                            break L9;
                          } else {
                            if (var14 >= param7.field_u.length) {
                              break L9;
                            } else {
                              if (-1 == param7.field_u[var14]) {
                                break L9;
                              } else {
                                if (param7.field_u[var14] >= gj.field_a.length) {
                                  break L9;
                                } else {
                                  stackOut_36_0 = gj.field_a[param7.field_u[var14]];
                                  stackIn_38_0 = stackOut_36_0;
                                  break L8;
                                }
                              }
                            }
                          }
                        }
                      }
                      stackOut_37_0 = null;
                      stackIn_38_0 = (me) (Object) stackOut_37_0;
                      break L8;
                    }
                    L10: {
                      L11: {
                        var21_ref = stackIn_38_0;
                        var22 = qj.field_t[var15];
                        var23 = ro.field_t[var15];
                        var24 = qj.field_t[var16];
                        var25 = ro.field_t[var16];
                        var26 = qj.field_t[var17];
                        var27 = ro.field_t[var17];
                        if (var18 != var19) {
                          break L11;
                        } else {
                          if (var20 != var19) {
                            break L11;
                          } else {
                            L12: {
                              var28 = var66[var18];
                              var29 = var67[var18];
                              if (var21_ref != null) {
                                stackOut_42_0 = var21_ref.field_c;
                                stackIn_43_0 = stackOut_42_0;
                                break L12;
                              } else {
                                stackOut_41_0 = 8355711;
                                stackIn_43_0 = stackOut_41_0;
                                break L12;
                              }
                            }
                            var30 = stackIn_43_0;
                            var31 = var30 & 16711935;
                            var32 = 65280 & var30;
                            var33 = var32 * var28 >>> 8 & -872349952 | (var31 * var28 & -16711822) >>> 8;
                            var33 = var33 + var29 * 65793;
                            gq.a((byte) 114, var26, var22, var23, var24, var27, (var33 & 16711422) >> 1, var25);
                            break L10;
                          }
                        }
                      }
                      L13: {
                        var28 = var66[var18];
                        var29 = var66[var19];
                        var30 = var66[var20];
                        var31 = var67[var18];
                        var32 = var67[var19];
                        var33 = var67[var20];
                        if (var21_ref != null) {
                          stackOut_46_0 = var21_ref.field_c;
                          stackIn_47_0 = stackOut_46_0;
                          break L13;
                        } else {
                          stackOut_45_0 = 8355711;
                          stackIn_47_0 = stackOut_45_0;
                          break L13;
                        }
                      }
                      var34 = stackIn_47_0;
                      var35 = var34 & 16711935;
                      var36 = 65280 & var34;
                      var37 = (-16711791 & var35 * var28) >>> 8 | 1191247616 & var28 * var36 >>> 8;
                      var38 = var29 * var36 >>> 8 & -369033472 | (-16711873 & var29 * var35) >>> 8;
                      var37 = var37 + var31 * 65793;
                      var39 = (var30 * var36 & 16711894) >>> 8 | (var35 * var30 & -16711830) >>> 8;
                      var38 = var38 + 65793 * var32;
                      var39 = var39 + 65793 * var33;
                      int discarded$1 = 0;
                      pl.a(var37 & 255, var23, var22, var24, var27, 255 & var37 >> 8, var38 >> 8 & 255, var39 >> 16, var25, var39 & 255, var37 >> 16, 255 & var38, (var39 & 65506) >> 8, var38 >> 16, var26);
                      break L10;
                    }
                    var44++;
                    continue L4;
                  }
                }
              } else {
                L14: {
                  var14 = param1 * var63[var13] + var64[var13] * param6 - -(var65[var13] * param4) >> 8;
                  if (0 <= var14) {
                    break L14;
                  } else {
                    var14 = -var14;
                    break L14;
                  }
                }
                L15: {
                  if (var14 < 0) {
                    stackOut_13_0 = 128;
                    stackIn_14_0 = stackOut_13_0;
                    break L15;
                  } else {
                    if (128 <= var14) {
                      stackOut_12_0 = 256;
                      stackIn_14_0 = stackOut_12_0;
                      break L15;
                    } else {
                      stackOut_11_0 = 128 - -var14;
                      stackIn_14_0 = stackOut_11_0;
                      break L15;
                    }
                  }
                }
                L16: {
                  var14 = stackIn_14_0;
                  var15 = var65[var13] * param0 + var63[var13] * param2 + param3 * var64[var13] >> 8;
                  stackOut_14_0 = em.field_b;
                  stackIn_16_0 = stackOut_14_0;
                  stackIn_15_0 = stackOut_14_0;
                  if (var15 < 0) {
                    stackOut_16_0 = (int[]) (Object) stackIn_16_0;
                    stackOut_16_1 = -var15;
                    stackIn_17_0 = stackOut_16_0;
                    stackIn_17_1 = stackOut_16_1;
                    break L16;
                  } else {
                    stackOut_15_0 = (int[]) (Object) stackIn_15_0;
                    stackOut_15_1 = var15;
                    stackIn_17_0 = stackOut_15_0;
                    stackIn_17_1 = stackOut_15_1;
                    break L16;
                  }
                }
                var15 = stackIn_17_0[stackIn_17_1];
                var14 = (256 - var15) * var14 >>> 8;
                var66[var13] = var14;
                var67[var13] = var15;
                var13++;
                continue L3;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L17: {
            var8 = decompiledCaughtException;
            stackOut_50_0 = (RuntimeException) var8;
            stackOut_50_1 = new StringBuilder().append("hg.LA(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44).append(param4).append(44).append(255).append(44).append(param6).append(44);
            stackIn_52_0 = stackOut_50_0;
            stackIn_52_1 = stackOut_50_1;
            stackIn_51_0 = stackOut_50_0;
            stackIn_51_1 = stackOut_50_1;
            if (param7 == null) {
              stackOut_52_0 = (RuntimeException) (Object) stackIn_52_0;
              stackOut_52_1 = (StringBuilder) (Object) stackIn_52_1;
              stackOut_52_2 = "null";
              stackIn_53_0 = stackOut_52_0;
              stackIn_53_1 = stackOut_52_1;
              stackIn_53_2 = stackOut_52_2;
              break L17;
            } else {
              stackOut_51_0 = (RuntimeException) (Object) stackIn_51_0;
              stackOut_51_1 = (StringBuilder) (Object) stackIn_51_1;
              stackOut_51_2 = "{...}";
              stackIn_53_0 = stackOut_51_0;
              stackIn_53_1 = stackOut_51_1;
              stackIn_53_2 = stackOut_51_2;
              break L17;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_53_0, stackIn_53_2 + 41);
        }
    }

    final void a(int param0, int param1, int param2, int param3, ea param4, byte param5) {
        try {
            super.a(param0, param1, param2, param3, param4, param5);
            ((hg) this).field_i = 0;
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) (Object) runtimeException, "hg.F(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + (param4 != null ? "{...}" : "null") + 44 + param5 + 41);
        }
    }

    final void a(byte param0) {
        super.a((byte) -112);
        int var2 = 117 % ((-13 - param0) / 50);
        ((hg) this).field_s.a(((hg) this).field_n, 0, 0, ((hg) this).field_q, (byte) 127);
        ((hg) this).field_v = ((hg) this).field_h;
        ((hg) this).field_u = ((hg) this).field_p;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_z = "Retry";
    }
}
