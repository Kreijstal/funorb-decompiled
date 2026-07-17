/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class mk extends cg {
    private hf field_l;
    private hf field_j;
    static String field_k;

    mk(hf param0, hf param1, hf param2) {
        super(param0);
        try {
            ((mk) this).field_j = param2;
            ((mk) this).field_l = param1;
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) (Object) runtimeException, "mk.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + (param2 != null ? "{...}" : "null") + 41);
        }
    }

    final static te c(byte param0) {
        try {
            Throwable var1 = null;
            te stackIn_3_0 = null;
            Throwable decompiledCaughtException = null;
            te stackOut_2_0 = null;
            L0: {
              if (param0 == 100) {
                break L0;
              } else {
                int discarded$2 = mk.h(-40);
                break L0;
              }
            }
            try {
              L1: {
                stackOut_2_0 = (te) Class.forName("bh").newInstance();
                stackIn_3_0 = stackOut_2_0;
                break L1;
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var1 = decompiledCaughtException;
              return null;
            }
            return stackIn_3_0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void b(byte param0) {
        int var1 = -52 / ((param0 - 43) / 36);
        field_k = null;
    }

    final String a(String param0, boolean param1) {
        RuntimeException var3 = null;
        String var4 = null;
        String var5 = null;
        String var6 = null;
        Object stackIn_2_0 = null;
        String stackIn_6_0 = null;
        String stackIn_10_0 = null;
        String stackIn_13_0 = null;
        String stackIn_16_0 = null;
        String stackIn_23_0 = null;
        String stackIn_27_0 = null;
        String stackIn_30_0 = null;
        String stackIn_32_0 = null;
        String stackIn_34_0 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_38_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_5_0 = null;
        String stackOut_9_0 = null;
        String stackOut_33_0 = null;
        String stackOut_22_0 = null;
        String stackOut_26_0 = null;
        String stackOut_31_0 = null;
        String stackOut_29_0 = null;
        String stackOut_15_0 = null;
        String stackOut_12_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        String stackOut_37_2 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        String stackOut_36_2 = null;
        try {
          L0: {
            var6 = ((mk) this).field_l.field_r.toLowerCase();
            var4 = param0.toLowerCase();
            if (0 != var4.length()) {
              var5 = var4;
              if (te.a(param1, var5)) {
                stackOut_5_0 = s.field_b;
                stackIn_6_0 = stackOut_5_0;
                return stackIn_6_0;
              } else {
                if (hi.a(var5, 0)) {
                  stackOut_9_0 = hl.field_C;
                  stackIn_10_0 = stackOut_9_0;
                  return stackIn_10_0;
                } else {
                  if (!lc.a((byte) -33, var5)) {
                    int discarded$9 = 0;
                    if (!this.b(param0)) {
                      L1: {
                        if (!param1) {
                          break L1;
                        } else {
                          ((mk) this).field_l = null;
                          break L1;
                        }
                      }
                      if (var6.length() <= 0) {
                        stackOut_33_0 = ll.field_g;
                        stackIn_34_0 = stackOut_33_0;
                        break L0;
                      } else {
                        if (gi.a(var5, -123, var6)) {
                          stackOut_22_0 = qi.field_F;
                          stackIn_23_0 = stackOut_22_0;
                          return stackIn_23_0;
                        } else {
                          if (la.a(var6, (byte) -115, var5)) {
                            stackOut_26_0 = i.field_b;
                            stackIn_27_0 = stackOut_26_0;
                            return stackIn_27_0;
                          } else {
                            int discarded$10 = -1;
                            if (!g.a(var6, var5)) {
                              stackOut_31_0 = s.field_b;
                              stackIn_32_0 = stackOut_31_0;
                              return stackIn_32_0;
                            } else {
                              stackOut_29_0 = qi.field_F;
                              stackIn_30_0 = stackOut_29_0;
                              return stackIn_30_0;
                            }
                          }
                        }
                      }
                    } else {
                      stackOut_15_0 = bj.field_u;
                      stackIn_16_0 = stackOut_15_0;
                      return stackIn_16_0;
                    }
                  } else {
                    stackOut_12_0 = ta.field_fb;
                    stackIn_13_0 = stackOut_12_0;
                    return stackIn_13_0;
                  }
                }
              }
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (String) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_35_0 = (RuntimeException) var3;
            stackOut_35_1 = new StringBuilder().append("mk.I(");
            stackIn_37_0 = stackOut_35_0;
            stackIn_37_1 = stackOut_35_1;
            stackIn_36_0 = stackOut_35_0;
            stackIn_36_1 = stackOut_35_1;
            if (param0 == null) {
              stackOut_37_0 = (RuntimeException) (Object) stackIn_37_0;
              stackOut_37_1 = (StringBuilder) (Object) stackIn_37_1;
              stackOut_37_2 = "null";
              stackIn_38_0 = stackOut_37_0;
              stackIn_38_1 = stackOut_37_1;
              stackIn_38_2 = stackOut_37_2;
              break L2;
            } else {
              stackOut_36_0 = (RuntimeException) (Object) stackIn_36_0;
              stackOut_36_1 = (StringBuilder) (Object) stackIn_36_1;
              stackOut_36_2 = "{...}";
              stackIn_38_0 = stackOut_36_0;
              stackIn_38_1 = stackOut_36_1;
              stackIn_38_2 = stackOut_36_2;
              break L2;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_38_0, stackIn_38_2 + 44 + param1 + 41);
        }
        return stackIn_34_0;
    }

    final static java.applet.Applet g(int param0) {
        if (uh.field_i != null) {
          return uh.field_i;
        } else {
          if (param0 >= -116) {
            int discarded$4 = 0;
            String discarded$5 = mk.a(-119, false, true);
            return (java.applet.Applet) (Object) jj.field_a;
          } else {
            return (java.applet.Applet) (Object) jj.field_a;
          }
        }
    }

    final static int h(int param0) {
        if (param0 != -1) {
            mk.b((byte) -72);
            return mh.field_b;
        }
        return mh.field_b;
    }

    final sg a(String param0, int param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        sg stackIn_4_0 = null;
        sg stackIn_8_0 = null;
        sg stackIn_11_0 = null;
        sg stackIn_13_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        sg stackOut_7_0 = null;
        sg stackOut_12_0 = null;
        sg stackOut_10_0 = null;
        sg stackOut_3_0 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        try {
          L0: {
            L1: {
              if (param1 <= -58) {
                break L1;
              } else {
                ((mk) this).field_l = null;
                break L1;
              }
            }
            var3 = ((mk) this).field_l.field_r.toLowerCase();
            var4 = param0.toLowerCase();
            if (var4.length() != 0) {
              if (!f.a(var4, 125, var3)) {
                stackOut_7_0 = pe.field_b;
                stackIn_8_0 = stackOut_7_0;
                return stackIn_8_0;
              } else {
                int discarded$2 = 0;
                if (!this.b(param0)) {
                  stackOut_12_0 = ii.field_e;
                  stackIn_13_0 = stackOut_12_0;
                  break L0;
                } else {
                  stackOut_10_0 = pe.field_b;
                  stackIn_11_0 = stackOut_10_0;
                  return stackIn_11_0;
                }
              }
            } else {
              stackOut_3_0 = pe.field_b;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var3_ref;
            stackOut_14_1 = new StringBuilder().append("mk.M(");
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param0 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L2;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L2;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 44 + param1 + 41);
        }
        return stackIn_13_0;
    }

    private final boolean b(String param0) {
        String var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        int var5 = 0;
        String var6 = null;
        String var7 = null;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_11_0 = 0;
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
            L1: {
              var3 = ((mk) this).field_j.field_r.toLowerCase();
              var4 = param0.toLowerCase();
              if (-1 <= var3.length()) {
                break L1;
              } else {
                if (-1 < var4.length()) {
                  var5 = var3.lastIndexOf("@");
                  if (0 > var5) {
                    break L1;
                  } else {
                    if (var5 >= -1 + var3.length()) {
                      break L1;
                    } else {
                      var6 = var3.substring(0, var5);
                      var7 = var3.substring(var5 + 1);
                      if (0 > var4.indexOf(var6)) {
                        if (var4.indexOf(var7) < 0) {
                          break L1;
                        } else {
                          stackOut_9_0 = 1;
                          stackIn_10_0 = stackOut_9_0;
                          return stackIn_10_0 != 0;
                        }
                      } else {
                        stackOut_6_0 = 1;
                        stackIn_7_0 = stackOut_6_0;
                        return stackIn_7_0 != 0;
                      }
                    }
                  }
                } else {
                  return false;
                }
              }
            }
            stackOut_11_0 = 0;
            stackIn_12_0 = stackOut_11_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var3_ref;
            stackOut_13_1 = new StringBuilder().append("mk.N(");
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L2;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L2;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 44 + 0 + 41);
        }
        return stackIn_12_0 != 0;
    }

    final static String a(int param0, boolean param1, boolean param2) {
        int var4 = 0;
        if (param0 >= 106) {
          var4 = 0;
          if (!param2) {
            if (param1) {
              var4 += 2;
              return bf.field_d[var4];
            } else {
              return bf.field_d[var4];
            }
          } else {
            var4 += 4;
            if (param1) {
              var4 += 2;
              return bf.field_d[var4];
            } else {
              return bf.field_d[var4];
            }
          }
        } else {
          te discarded$2 = mk.c((byte) -75);
          var4 = 0;
          if (param2) {
            var4 += 4;
            if (!param1) {
              return bf.field_d[var4];
            } else {
              var4 += 2;
              return bf.field_d[var4];
            }
          } else {
            if (param1) {
              var4 += 2;
              return bf.field_d[var4];
            } else {
              return bf.field_d[var4];
            }
          }
        }
    }

    static {
    }
}
