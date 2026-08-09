/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mb {
    static String field_c;
    static oj field_b;
    static String field_a;

    final static void a(int param0, byte[] param1) {
        byte dupTemp$0 = 0;
        byte dupTemp$1 = 0;
        int stackIn_22_0 = 0;
        int stackIn_22_1 = 0;
        int stackIn_37_0 = 0;
        int stackIn_38_0 = 0;
        int stackIn_38_1 = 0;
        int stackIn_49_0 = 0;
        int stackIn_50_0 = 0;
        int stackIn_50_1 = 0;
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        RuntimeException stackIn_56_0 = null;
        StringBuilder stackIn_56_1 = null;
        String stackIn_56_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        byte[] var8 = null;
        byte[] var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        ka var16 = null;
        ka var17 = null;
        byte[] var18 = null;
        byte[] var19 = null;
        byte[] var20 = null;
        byte[] var21 = null;
        var15 = stellarshard.field_B;
        try {
          L0: {
            var16 = new ka(param1);
            var17 = var16;
            var17.field_k = -2 + param1.length;
            sb.field_b = var17.c((byte) 40);
            ih.field_d = new int[sb.field_b];
            ih.field_b = new byte[sb.field_b][];
            vc.field_b = new int[sb.field_b];
            lj.field_D = new byte[sb.field_b][];
            ak.field_c = new int[sb.field_b];
            sk.field_c = new boolean[sb.field_b];
            vi.field_c = new int[sb.field_b];
            var17.field_k = param1.length + (-7 - sb.field_b * 8);
            nc.field_G = var17.c((byte) 86);
            wd.field_b = var17.c((byte) 39);
            var3 = 1 + (var17.f(4) & 255);
            var4 = 0;
            L1: while (true) {
              if (sb.field_b <= var4) {
                var4 = 0;
                L2: while (true) {
                  if (sb.field_b <= var4) {
                    var4 = 0;
                    L3: while (true) {
                      if (sb.field_b <= var4) {
                        var4 = 0;
                        L4: while (true) {
                          if (var4 >= sb.field_b) {
                            var17.field_k = -(3 * (-1 + var3)) + param1.length + (-7 + -(sb.field_b * 8));
                            gj.field_w = new int[var3];
                            var4 = 1;
                            L5: while (true) {
                              if (var3 <= var4) {
                                var17.field_k = param0;
                                var4 = 0;
                                L6: while (true) {
                                  if (sb.field_b <= var4) {
                                    break L0;
                                  } else {
                                    var5 = vc.field_b[var4];
                                    var6 = ih.field_d[var4];
                                    var7 = var6 * var5;
                                    var20 = new byte[var7];
                                    var18 = var20;
                                    var8 = var18;
                                    ih.field_b[var4] = var20;
                                    var21 = new byte[var7];
                                    var19 = var21;
                                    var9 = var19;
                                    lj.field_D[var4] = var21;
                                    var10 = 0;
                                    var11 = var17.f(4);
                                    stackIn_22_0 = 0;
                                    stackIn_22_1 = 1 & var11;
                                    L7: {
                                      if (stackIn_22_0 == stackIn_22_1) {
                                        var12 = 0;
                                        L8: while (true) {
                                          if (var12 >= var7) {
                                            if ((2 & var11) != 0) {
                                              var12 = 0;
                                              L9: while (true) {
                                                if (var7 <= var12) {
                                                  break L7;
                                                } else {
                                                  L10: {
                                                    dupTemp$0 = var17.g(-81);
                                                    var9[var12] = dupTemp$0;
                                                    var13 = dupTemp$0;
                                                    stackIn_49_0 = var10;

                                                    if (0 == (var13 ^ -1)) {
                                                      stackIn_50_0 = stackIn_49_0;
                                                      stackIn_50_1 = 0;
                                                      break L10;
                                                    } else {
                                                      stackIn_50_0 = stackIn_49_0;
                                                      stackIn_50_1 = 1;
                                                      break L10;
                                                    }
                                                  }
                                                  var10 = stackIn_50_0 | stackIn_50_1;
                                                  var12++;
                                                  continue L9;
                                                }
                                              }
                                            } else {
                                              break L7;
                                            }
                                          } else {
                                            var8[var12] = var17.g(110);
                                            var12++;
                                            continue L8;
                                          }
                                        }
                                      } else {
                                        var12 = 0;
                                        L11: while (true) {
                                          if (var5 <= var12) {
                                            if ((2 & var11) != 0) {
                                              var12 = 0;
                                              L12: while (true) {
                                                if (var12 >= var5) {
                                                  break L7;
                                                } else {
                                                  var13 = 0;
                                                  L13: while (true) {
                                                    if (var13 >= var6) {
                                                      var12++;
                                                      continue L12;
                                                    } else {
                                                      L14: {
                                                        dupTemp$1 = var17.g(ih.a(param0, 102));
                                                        var9[var12 + var13 * var5] = dupTemp$1;
                                                        var14 = dupTemp$1;
                                                        stackIn_37_0 = var10;

                                                        if (var14 == -1) {
                                                          stackIn_38_0 = stackIn_37_0;
                                                          stackIn_38_1 = 0;
                                                          break L14;
                                                        } else {
                                                          stackIn_38_0 = stackIn_37_0;
                                                          stackIn_38_1 = 1;
                                                          break L14;
                                                        }
                                                      }
                                                      var10 = stackIn_38_0 | stackIn_38_1;
                                                      var13++;
                                                      continue L13;
                                                    }
                                                  }
                                                }
                                              }
                                            } else {
                                              break L7;
                                            }
                                          } else {
                                            var13 = 0;
                                            L15: while (true) {
                                              if (var13 >= var6) {
                                                var12++;
                                                continue L11;
                                              } else {
                                                var8[var13 * var5 + var12] = var17.g(-62);
                                                var13++;
                                                continue L15;
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                    sk.field_c[var4] = var10 != 0;
                                    var4++;
                                    continue L6;
                                  }
                                }
                              } else {
                                L16: {
                                  gj.field_w[var4] = var17.c(true);
                                  if ((gj.field_w[var4] ^ -1) != -1) {
                                    break L16;
                                  } else {
                                    gj.field_w[var4] = 1;
                                    break L16;
                                  }
                                }
                                var4++;
                                continue L5;
                              }
                            }
                          } else {
                            ih.field_d[var4] = var17.c((byte) 83);
                            var4++;
                            continue L4;
                          }
                        }
                      } else {
                        vc.field_b[var4] = var17.c((byte) 30);
                        var4++;
                        continue L3;
                      }
                    }
                  } else {
                    vi.field_c[var4] = var17.c((byte) 95);
                    var4++;
                    continue L2;
                  }
                }
              } else {
                ak.field_c[var4] = var16.c((byte) 30);
                var4++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L17: {
            var2 = decompiledCaughtException;
            stackIn_55_0 = (RuntimeException) (var2);

            stackIn_55_1 = new StringBuilder().append("mb.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_56_0 = (RuntimeException) ((Object) stackIn_55_0);
              stackIn_56_1 = (StringBuilder) ((Object) stackIn_55_1);
              stackIn_56_2 = "null";
              break L17;
            } else {
              stackIn_56_0 = (RuntimeException) ((Object) stackIn_55_0);
              stackIn_56_1 = (StringBuilder) ((Object) stackIn_55_1);
              stackIn_56_2 = "{...}";
              break L17;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_56_0), stackIn_56_2 + ')');
        }
    }

    public static void a(boolean param0) {
        field_b = null;
        field_a = null;
        field_c = null;
        if (param0) {
            field_a = (String) null;
        }
    }

    final static boolean a(String param0, byte param1, String param2) {
        String var3 = null;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          L0: {
            L1: {
              if (param1 >= 108) {
                break L1;
              } else {
                field_a = (String) null;
                break L1;
              }
            }
            L2: {
              L3: {
                param2 = ci.a(param2, '_', "", 2619);
                var3 = la.a(param2, (byte) 79);
                if (0 != (param0.indexOf(param2) ^ -1)) {
                  break L3;
                } else {
                  if (-1 == param0.indexOf(var3)) {
                    stackIn_7_0 = 0;
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              stackIn_7_0 = 1;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var3_ref);

            stackIn_10_1 = new StringBuilder().append("mb.C(");

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
          L5: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L5;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L5;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_11_0), stackIn_14_2 + ')');
        }
        return stackIn_7_0 != 0;
    }

    static {
        field_c = "Waiting for fonts";
        field_b = new oj();
        field_a = "Account created successfully!";
    }
}
