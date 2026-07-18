/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.lang.String;

final class oo extends se {
    private ga field_j;
    static int field_i;

    final oi a(String param0, byte param1) {
        n var3 = null;
        RuntimeException var3_ref = null;
        oi stackIn_8_0 = null;
        oi stackIn_12_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        oi stackOut_7_0 = null;
        oi stackOut_11_0 = null;
        oi stackOut_10_0 = null;
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
              if (param1 == -122) {
                break L1;
              } else {
                int discarded$2 = oo.e((byte) 2);
                break L1;
              }
            }
            L2: {
              if (((oo) this).field_j instanceof lf) {
                var3 = ((lf) (Object) ((oo) this).field_j).a(-117);
                if (var3 == null) {
                  break L2;
                } else {
                  if (var3.c((byte) 45) != ih.field_b) {
                    stackOut_7_0 = rk.field_c;
                    stackIn_8_0 = stackOut_7_0;
                    return stackIn_8_0;
                  } else {
                    break L2;
                  }
                }
              } else {
                break L2;
              }
            }
            L3: {
              if (!param0.equals((Object) (Object) ((oo) this).field_j.field_o)) {
                stackOut_11_0 = rk.field_c;
                stackIn_12_0 = stackOut_11_0;
                break L3;
              } else {
                stackOut_10_0 = ih.field_b;
                stackIn_12_0 = stackOut_10_0;
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var3_ref;
            stackOut_13_1 = new StringBuilder().append("oo.G(");
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
              break L4;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L4;
            }
          }
          throw dn.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ',' + param1 + ')');
        }
        return stackIn_12_0;
    }

    final String a(String param0, int param1) {
        n var3 = null;
        int var3_int = 0;
        RuntimeException var3_ref = null;
        String stackIn_7_0 = null;
        String stackIn_9_0 = null;
        String stackIn_13_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_6_0 = null;
        String stackOut_8_0 = null;
        String stackOut_12_0 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        try {
          L0: {
            L1: {
              if (((oo) this).field_j instanceof lf) {
                var3 = ((lf) (Object) ((oo) this).field_j).a(-81);
                if (var3 != null) {
                  L2: {
                    if (var3.c((byte) 45) != ih.field_b) {
                      break L2;
                    } else {
                      if (param0.equals((Object) (Object) ((oo) this).field_j.field_o)) {
                        break L2;
                      } else {
                        stackOut_6_0 = lj.field_a;
                        stackIn_7_0 = stackOut_6_0;
                        return stackIn_7_0;
                      }
                    }
                  }
                  stackOut_8_0 = var3.a(-16774);
                  stackIn_9_0 = stackOut_8_0;
                  return stackIn_9_0;
                } else {
                  break L1;
                }
              } else {
                break L1;
              }
            }
            var3_int = -53 % ((param1 - 41) / 49);
            if (!param0.equals((Object) (Object) ((oo) this).field_j.field_o)) {
              stackOut_12_0 = lj.field_a;
              stackIn_13_0 = stackOut_12_0;
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var3_ref;
            stackOut_15_1 = new StringBuilder().append("oo.H(");
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param0 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L3;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L3;
            }
          }
          throw dn.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + ',' + param1 + ')');
        }
        return stackIn_13_0;
    }

    oo(ga param0, ga param1) {
        super(param0);
        try {
            ((oo) this).field_j = param1;
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) (Object) runtimeException, "oo.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean b(boolean param0) {
        return ne.field_d;
    }

    final static String a(byte param0, Throwable param1) throws IOException {
        String var2 = null;
        int var4 = 0;
        PrintWriter var5 = null;
        String var6 = null;
        BufferedReader var7 = null;
        String var8 = null;
        String var9 = null;
        int var10 = 0;
        int var11 = 0;
        String var12 = null;
        int var13 = 0;
        int var14 = 0;
        ub var15 = null;
        StringWriter var16 = null;
        String var17 = null;
        String var18 = null;
        String var19 = null;
        String var20 = null;
        L0: {
          var14 = CrazyCrystals.field_B;
          if (!(param1 instanceof ub)) {
            var2 = "";
            var12 = var2;
            var2 = var12;
            var12 = var2;
            break L0;
          } else {
            var15 = (ub) (Object) param1;
            var2 = var15.field_a + " | ";
            param1 = var15.field_c;
            break L0;
          }
        }
        var4 = -3;
        var16 = new StringWriter();
        var5 = new PrintWriter((Writer) (Object) var16);
        param1.printStackTrace(var5);
        var5.close();
        var6 = var16.toString();
        var12 = var6;
        var2 = var12;
        var12 = var6;
        var7 = new BufferedReader((Reader) (Object) new StringReader(var6));
        var8 = var7.readLine();
        var12 = var8;
        var2 = var12;
        var12 = var8;
        L1: while (true) {
          var9 = var7.readLine();
          var12 = var9;
          var2 = var12;
          var12 = var9;
          if (var9 == null) {
            var2 = var2 + "| " + var8;
            return var2;
          } else {
            L2: {
              var10 = var9.indexOf('(');
              var11 = var9.indexOf(')', var10 - -1);
              if (var10 == -1) {
                var12 = var9;
                var2 = var12;
                var2 = var12;
                break L2;
              } else {
                var12 = var9.substring(0, var10);
                break L2;
              }
            }
            L3: {
              var17 = var12.trim();
              var2 = var17;
              var2 = var17;
              var18 = var17.substring(1 + var17.lastIndexOf(' '));
              var2 = var18;
              var2 = var18;
              var19 = var18.substring(1 + var18.lastIndexOf('\t'));
              var2 = var19;
              var2 = var19;
              var20 = var2 + var19;
              var2 = var20;
              var2 = var20;
              if (var10 == -1) {
                break L3;
              } else {
                if (var11 == 0) {
                  break L3;
                } else {
                  var13 = var9.indexOf(".java:", var10);
                  if (-1 > var13) {
                    break L3;
                  } else {
                    var2 = var20 + var9.substring(5 + var13, var11);
                    break L3;
                  }
                }
              }
            }
            var2 = var2 + ' ';
            continue L1;
          }
        }
    }

    final static int e(byte param0) {
        if (2 > eq.field_j) {
          return 0;
        } else {
          if (ul.field_g != 0) {
            if (be.field_e != null) {
              if (!be.field_e.a((byte) 102)) {
                return 14;
              } else {
                if (be.field_e.c("", -46)) {
                  if (be.field_e.a(-20402, "")) {
                    if (rb.field_k.a((byte) 102)) {
                      if (!rb.field_k.a(-20402, "commonui")) {
                        return 57;
                      } else {
                        if (!ok.field_c.a((byte) 102)) {
                          return 71;
                        } else {
                          if (ok.field_c.a(-20402, "commonui")) {
                            if (dd.field_a.a((byte) 102)) {
                              if (dd.field_a.a(false)) {
                                if (param0 > -6) {
                                  int discarded$3 = oo.e((byte) 119);
                                  return 100;
                                } else {
                                  return 100;
                                }
                              } else {
                                return 86;
                              }
                            } else {
                              return 82;
                            }
                          } else {
                            return 80;
                          }
                        }
                      }
                    } else {
                      return 43;
                    }
                  } else {
                    return 29;
                  }
                } else {
                  return 29;
                }
              }
            } else {
              if (rb.field_k.a((byte) 102)) {
                if (!rb.field_k.a(-20402, "commonui")) {
                  return 57;
                } else {
                  if (!ok.field_c.a((byte) 102)) {
                    return 71;
                  } else {
                    if (ok.field_c.a(-20402, "commonui")) {
                      if (dd.field_a.a((byte) 102)) {
                        if (dd.field_a.a(false)) {
                          if (param0 > -6) {
                            int discarded$4 = oo.e((byte) 119);
                            return 100;
                          } else {
                            return 100;
                          }
                        } else {
                          return 86;
                        }
                      } else {
                        return 82;
                      }
                    } else {
                      return 80;
                    }
                  }
                }
              } else {
                return 43;
              }
            }
          } else {
            if (rb.field_k.a((byte) 102)) {
              if (!rb.field_k.a(-20402, "commonui")) {
                return 40;
              } else {
                if (ok.field_c.a((byte) 102)) {
                  if (ok.field_c.a(-20402, "commonui")) {
                    if (dd.field_a.a((byte) 102)) {
                      if (dd.field_a.a(false)) {
                        if (param0 <= -6) {
                          return 100;
                        } else {
                          int discarded$5 = oo.e((byte) 119);
                          return 100;
                        }
                      } else {
                        return 80;
                      }
                    } else {
                      return 70;
                    }
                  } else {
                    return 60;
                  }
                } else {
                  return 50;
                }
              }
            } else {
              return 20;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = 39;
    }
}
