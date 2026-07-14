/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class oo extends se {
    private ga field_j;
    static int field_i;

    final oi a(String param0, byte param1) {
        n var4 = null;
        n var5 = null;
        oi stackIn_5_0 = null;
        oi stackIn_10_0 = null;
        oi stackIn_16_0 = null;
        oi stackIn_22_0 = null;
        oi stackIn_27_0 = null;
        oi stackIn_33_0 = null;
        oi stackOut_32_0 = null;
        oi stackOut_31_0 = null;
        oi stackOut_26_0 = null;
        oi stackOut_25_0 = null;
        oi stackOut_21_0 = null;
        oi stackOut_20_0 = null;
        oi stackOut_15_0 = null;
        oi stackOut_14_0 = null;
        oi stackOut_9_0 = null;
        oi stackOut_8_0 = null;
        oi stackOut_4_0 = null;
        oi stackOut_3_0 = null;
        if (param1 == -122) {
          if (((oo) this).field_j instanceof lf) {
            var5 = ((lf) (Object) ((oo) this).field_j).a(-117);
            if (var5 != null) {
              if (var5.c((byte) 45) == ih.field_b) {
                L0: {
                  if (!param0.equals((Object) (Object) ((oo) this).field_j.field_o)) {
                    stackOut_32_0 = rk.field_c;
                    stackIn_33_0 = stackOut_32_0;
                    break L0;
                  } else {
                    stackOut_31_0 = ih.field_b;
                    stackIn_33_0 = stackOut_31_0;
                    break L0;
                  }
                }
                return stackIn_33_0;
              } else {
                return rk.field_c;
              }
            } else {
              L1: {
                if (!param0.equals((Object) (Object) ((oo) this).field_j.field_o)) {
                  stackOut_26_0 = rk.field_c;
                  stackIn_27_0 = stackOut_26_0;
                  break L1;
                } else {
                  stackOut_25_0 = ih.field_b;
                  stackIn_27_0 = stackOut_25_0;
                  break L1;
                }
              }
              return stackIn_27_0;
            }
          } else {
            L2: {
              if (!param0.equals((Object) (Object) ((oo) this).field_j.field_o)) {
                stackOut_21_0 = rk.field_c;
                stackIn_22_0 = stackOut_21_0;
                break L2;
              } else {
                stackOut_20_0 = ih.field_b;
                stackIn_22_0 = stackOut_20_0;
                break L2;
              }
            }
            return stackIn_22_0;
          }
        } else {
          int discarded$1 = oo.e((byte) 2);
          if (((oo) this).field_j instanceof lf) {
            var4 = ((lf) (Object) ((oo) this).field_j).a(-117);
            if (var4 != null) {
              if (var4.c((byte) 45) == ih.field_b) {
                L3: {
                  if (!param0.equals((Object) (Object) ((oo) this).field_j.field_o)) {
                    stackOut_15_0 = rk.field_c;
                    stackIn_16_0 = stackOut_15_0;
                    break L3;
                  } else {
                    stackOut_14_0 = ih.field_b;
                    stackIn_16_0 = stackOut_14_0;
                    break L3;
                  }
                }
                return stackIn_16_0;
              } else {
                return rk.field_c;
              }
            } else {
              L4: {
                if (!param0.equals((Object) (Object) ((oo) this).field_j.field_o)) {
                  stackOut_9_0 = rk.field_c;
                  stackIn_10_0 = stackOut_9_0;
                  break L4;
                } else {
                  stackOut_8_0 = ih.field_b;
                  stackIn_10_0 = stackOut_8_0;
                  break L4;
                }
              }
              return stackIn_10_0;
            }
          } else {
            L5: {
              if (!param0.equals((Object) (Object) ((oo) this).field_j.field_o)) {
                stackOut_4_0 = rk.field_c;
                stackIn_5_0 = stackOut_4_0;
                break L5;
              } else {
                stackOut_3_0 = ih.field_b;
                stackIn_5_0 = stackOut_3_0;
                break L5;
              }
            }
            return stackIn_5_0;
          }
        }
    }

    final String a(String param0, int param1) {
        int var3_int = 0;
        n var3 = null;
        if (((oo) this).field_j instanceof lf) {
          var3 = ((lf) (Object) ((oo) this).field_j).a(-81);
          if (var3 != null) {
            if (var3.c((byte) 45) == ih.field_b) {
              if (param0.equals((Object) (Object) ((oo) this).field_j.field_o)) {
                return var3.a(-16774);
              } else {
                return lj.field_a;
              }
            } else {
              return var3.a(-16774);
            }
          } else {
            var3_int = -53 % ((param1 - 41) / 49);
            if (param0.equals((Object) (Object) ((oo) this).field_j.field_o)) {
              return null;
            } else {
              return lj.field_a;
            }
          }
        } else {
          var3_int = -53 % ((param1 - 41) / 49);
          if (param0.equals((Object) (Object) ((oo) this).field_j.field_o)) {
            return null;
          } else {
            return lj.field_a;
          }
        }
    }

    oo(ga param0, ga param1) {
        super(param0);
        ((oo) this).field_j = param1;
    }

    final static boolean b(boolean param0) {
        if (param0) {
            int discarded$0 = oo.e((byte) 86);
            return ne.field_d;
        }
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
        var4 = -43 % ((26 - param0) / 34);
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
              if (0 == (var10 ^ -1)) {
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
            var2 = var2 + 32;
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
