/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class b extends tc {
    boolean field_m;
    static la field_n;
    int[] field_l;
    static int field_k;

    final static void a(byte[] param0) {
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
        vh var16 = null;
        vh var17 = null;
        byte[] var18 = null;
        byte[] var19 = null;
        byte[] var20 = null;
        byte[] var21 = null;
        byte[] var22 = null;
        byte[] var23 = null;
        byte[] var24 = null;
        byte[] var25 = null;
        int stackIn_34_0 = 0;
        int stackIn_35_0 = 0;
        int stackIn_36_0 = 0;
        int stackIn_36_1 = 0;
        int stackIn_46_0 = 0;
        int stackIn_47_0 = 0;
        int stackIn_48_0 = 0;
        int stackIn_48_1 = 0;
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        RuntimeException stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        String stackIn_54_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_45_0 = 0;
        int stackOut_47_0 = 0;
        int stackOut_47_1 = 0;
        int stackOut_46_0 = 0;
        int stackOut_46_1 = 0;
        int stackOut_33_0 = 0;
        int stackOut_35_0 = 0;
        int stackOut_35_1 = 0;
        int stackOut_34_0 = 0;
        int stackOut_34_1 = 0;
        RuntimeException stackOut_51_0 = null;
        StringBuilder stackOut_51_1 = null;
        RuntimeException stackOut_53_0 = null;
        StringBuilder stackOut_53_1 = null;
        String stackOut_53_2 = null;
        RuntimeException stackOut_52_0 = null;
        StringBuilder stackOut_52_1 = null;
        String stackOut_52_2 = null;
        var15 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            var16 = new vh(param0);
            var17 = var16;
            var17.field_q = param0.length - 2;
            iw.field_n = var17.e((byte) -104);
            j.field_e = new int[iw.field_n];
            c.field_e = new int[iw.field_n];
            iq.field_g = new int[iw.field_n];
            ne.field_e = new boolean[iw.field_n];
            qm.field_K = new int[iw.field_n];
            vj.field_j = new byte[iw.field_n][];
            cq.field_z = new byte[iw.field_n][];
            var17.field_q = -(iw.field_n * 8) + -7 + param0.length;
            lg.field_d = var17.e((byte) -104);
            wr.field_J = var17.e((byte) -104);
            var3 = 1 + (255 & var17.k(0));
            var4 = 0;
            L1: while (true) {
              if (iw.field_n <= var4) {
                var4 = 0;
                L2: while (true) {
                  if (var4 >= iw.field_n) {
                    var4 = 0;
                    L3: while (true) {
                      if (iw.field_n <= var4) {
                        var4 = 0;
                        L4: while (true) {
                          if (var4 >= iw.field_n) {
                            var17.field_q = 3 + (-(var3 * 3) + (-(8 * iw.field_n) + -7) + param0.length);
                            qv.field_j = new int[var3];
                            var4 = 1;
                            L5: while (true) {
                              if (var4 >= var3) {
                                var17.field_q = 0;
                                var4 = 0;
                                L6: while (true) {
                                  if (var4 >= iw.field_n) {
                                    break L0;
                                  } else {
                                    L7: {
                                      var5 = qm.field_K[var4];
                                      var6 = c.field_e[var4];
                                      var7 = var6 * var5;
                                      var24 = new byte[var7];
                                      var22 = var24;
                                      var20 = var22;
                                      var18 = var20;
                                      var8 = var18;
                                      vj.field_j[var4] = var24;
                                      var25 = new byte[var7];
                                      var23 = var25;
                                      var21 = var23;
                                      var19 = var21;
                                      var9 = var19;
                                      cq.field_z[var4] = var25;
                                      var10 = 0;
                                      var11 = var17.k(0);
                                      if ((1 & var11) == 0) {
                                        var12 = 0;
                                        L8: while (true) {
                                          if (var12 >= var7) {
                                            if ((var11 & 2) != 0) {
                                              var12 = 0;
                                              L9: while (true) {
                                                if (var12 >= var7) {
                                                  break L7;
                                                } else {
                                                  L10: {
                                                    byte dupTemp$2 = var17.a((byte) 102);
                                                    var9[var12] = dupTemp$2;
                                                    var13 = dupTemp$2;
                                                    stackOut_45_0 = var10;
                                                    stackIn_47_0 = stackOut_45_0;
                                                    stackIn_46_0 = stackOut_45_0;
                                                    if (var13 == -1) {
                                                      stackOut_47_0 = stackIn_47_0;
                                                      stackOut_47_1 = 0;
                                                      stackIn_48_0 = stackOut_47_0;
                                                      stackIn_48_1 = stackOut_47_1;
                                                      break L10;
                                                    } else {
                                                      stackOut_46_0 = stackIn_46_0;
                                                      stackOut_46_1 = 1;
                                                      stackIn_48_0 = stackOut_46_0;
                                                      stackIn_48_1 = stackOut_46_1;
                                                      break L10;
                                                    }
                                                  }
                                                  var10 = stackIn_48_0 | stackIn_48_1;
                                                  var12++;
                                                  continue L9;
                                                }
                                              }
                                            } else {
                                              break L7;
                                            }
                                          } else {
                                            var8[var12] = var17.a((byte) -90);
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
                                                    if (var6 <= var13) {
                                                      var12++;
                                                      continue L12;
                                                    } else {
                                                      L14: {
                                                        byte dupTemp$3 = var17.a((byte) -67);
                                                        var9[var12 - -(var5 * var13)] = dupTemp$3;
                                                        var14 = dupTemp$3;
                                                        stackOut_33_0 = var10;
                                                        stackIn_35_0 = stackOut_33_0;
                                                        stackIn_34_0 = stackOut_33_0;
                                                        if (var14 == -1) {
                                                          stackOut_35_0 = stackIn_35_0;
                                                          stackOut_35_1 = 0;
                                                          stackIn_36_0 = stackOut_35_0;
                                                          stackIn_36_1 = stackOut_35_1;
                                                          break L14;
                                                        } else {
                                                          stackOut_34_0 = stackIn_34_0;
                                                          stackOut_34_1 = 1;
                                                          stackIn_36_0 = stackOut_34_0;
                                                          stackIn_36_1 = stackOut_34_1;
                                                          break L14;
                                                        }
                                                      }
                                                      var10 = stackIn_36_0 | stackIn_36_1;
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
                                              if (var6 <= var13) {
                                                var12++;
                                                continue L11;
                                              } else {
                                                var8[var13 * var5 + var12] = var17.a((byte) -106);
                                                var13++;
                                                continue L15;
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                    ne.field_e[var4] = var10 != 0;
                                    var4++;
                                    continue L6;
                                  }
                                }
                              } else {
                                L16: {
                                  qv.field_j[var4] = var17.d((byte) -13);
                                  if (qv.field_j[var4] != 0) {
                                    break L16;
                                  } else {
                                    qv.field_j[var4] = 1;
                                    break L16;
                                  }
                                }
                                var4++;
                                continue L5;
                              }
                            }
                          } else {
                            c.field_e[var4] = var17.e((byte) -104);
                            var4++;
                            continue L4;
                          }
                        }
                      } else {
                        qm.field_K[var4] = var17.e((byte) -104);
                        var4++;
                        continue L3;
                      }
                    }
                  } else {
                    iq.field_g[var4] = var17.e((byte) -104);
                    var4++;
                    continue L2;
                  }
                }
              } else {
                j.field_e[var4] = var16.e((byte) -104);
                var4++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L17: {
            var2 = decompiledCaughtException;
            stackOut_51_0 = (RuntimeException) var2;
            stackOut_51_1 = new StringBuilder().append("b.B(");
            stackIn_53_0 = stackOut_51_0;
            stackIn_53_1 = stackOut_51_1;
            stackIn_52_0 = stackOut_51_0;
            stackIn_52_1 = stackOut_51_1;
            if (param0 == null) {
              stackOut_53_0 = (RuntimeException) (Object) stackIn_53_0;
              stackOut_53_1 = (StringBuilder) (Object) stackIn_53_1;
              stackOut_53_2 = "null";
              stackIn_54_0 = stackOut_53_0;
              stackIn_54_1 = stackOut_53_1;
              stackIn_54_2 = stackOut_53_2;
              break L17;
            } else {
              stackOut_52_0 = (RuntimeException) (Object) stackIn_52_0;
              stackOut_52_1 = (StringBuilder) (Object) stackIn_52_1;
              stackOut_52_2 = "{...}";
              stackIn_54_0 = stackOut_52_0;
              stackIn_54_1 = stackOut_52_1;
              stackIn_54_2 = stackOut_52_2;
              break L17;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_54_0, stackIn_54_2 + ',' + -1 + ')');
        }
    }

    public static void a() {
        field_n = null;
    }

    final static int a(int param0, int param1, int param2, byte param3, int param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (param0 == 0) {
          return 1;
        } else {
          if (param1 != 0) {
            L0: {
              var5 = (-param4 + param0 * 2) * 500 / param0;
              var5 = Math.max(0, var5);
              if (var5 > 500) {
                var6 = var5 - 500;
                var5 = var6 / 3 + 500;
                if (var5 > 1000) {
                  var5 = 1000;
                  break L0;
                } else {
                  break L0;
                }
              } else {
                break L0;
              }
            }
            L1: {
              var6 = (2 * param1 - param2) * 500 / param1;
              var6 = Math.max(0, var6);
              if (var6 > 500) {
                var7 = var6 + -500;
                var6 = 500 + var7 / 2;
                if (var6 <= 1000) {
                  break L1;
                } else {
                  var6 = 1000;
                  break L1;
                }
              } else {
                break L1;
              }
            }
            return Math.max(100, Math.min(var5 - -var6, 2000));
          } else {
            return 1;
          }
        }
    }

    b() {
        ((b) this).field_m = false;
    }

    final static int a(boolean param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int stackIn_8_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_11_0 = 0;
        int stackOut_7_0 = 0;
        var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            var2_int = 0;
            L1: while (true) {
              if (var2_int >= wp.field_H.length) {
                stackOut_11_0 = 0;
                stackIn_12_0 = stackOut_11_0;
                break L0;
              } else {
                var3 = 0;
                L2: while (true) {
                  if (wp.field_H[var2_int].length <= var3) {
                    var2_int++;
                    continue L1;
                  } else {
                    if (wp.field_H[var2_int][var3] == param1) {
                      stackOut_7_0 = var3;
                      stackIn_8_0 = stackOut_7_0;
                      return stackIn_8_0;
                    } else {
                      var3++;
                      continue L2;
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var2, "b.A(" + false + ',' + param1 + ')');
        }
        return stackIn_12_0;
    }

    static {
    }
}
