/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class b extends tc {
    boolean field_m;
    static la field_n;
    int[] field_l;
    static int field_k;

    final static void a(byte[] param0, int param1) {
        byte dupTemp$0 = 0;
        byte dupTemp$1 = 0;
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
        vh var16 = null;
        vh var17 = null;
        byte[] var18 = null;
        byte[] var19 = null;
        byte[] var20 = null;
        byte[] var21 = null;
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
            var3 = 1 + (255 & var17.k(param1 + 1));
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
                            L5: {
                              if (param1 == -1) {
                                break L5;
                              } else {
                                field_n = (la) null;
                                break L5;
                              }
                            }
                            var17.field_q = 3 + (-(var3 * 3) + (-(8 * iw.field_n) + -7) + param0.length);
                            qv.field_j = new int[var3];
                            var4 = 1;
                            L6: while (true) {
                              if (var4 >= var3) {
                                var17.field_q = 0;
                                var4 = 0;
                                L7: while (true) {
                                  if (var4 >= iw.field_n) {
                                    break L0;
                                  } else {
                                    L8: {
                                      var5 = qm.field_K[var4];
                                      var6 = c.field_e[var4];
                                      var7 = var6 * var5;
                                      var20 = new byte[var7];
                                      var18 = var20;
                                      var8 = var18;
                                      vj.field_j[var4] = var20;
                                      var21 = new byte[var7];
                                      var19 = var21;
                                      var9 = var19;
                                      cq.field_z[var4] = var21;
                                      var10 = 0;
                                      var11 = var17.k(0);
                                      if ((1 & var11) == 0) {
                                        var12 = 0;
                                        L9: while (true) {
                                          if (var12 >= var7) {
                                            if (-1 != (var11 & 2 ^ -1)) {
                                              var12 = 0;
                                              L10: while (true) {
                                                if (var12 >= var7) {
                                                  break L8;
                                                } else {
                                                  L11: {
                                                    dupTemp$0 = var17.a((byte) 102);
                                                    var9[var12] = dupTemp$0;
                                                    var13 = dupTemp$0;
                                                    stackIn_49_0 = var10;

                                                    if (var13 == -1) {
                                                      stackIn_50_0 = stackIn_49_0;
                                                      stackIn_50_1 = 0;
                                                      break L11;
                                                    } else {
                                                      stackIn_50_0 = stackIn_49_0;
                                                      stackIn_50_1 = 1;
                                                      break L11;
                                                    }
                                                  }
                                                  var10 = stackIn_50_0 | stackIn_50_1;
                                                  var12++;
                                                  continue L10;
                                                }
                                              }
                                            } else {
                                              break L8;
                                            }
                                          } else {
                                            var8[var12] = var17.a((byte) -90);
                                            var12++;
                                            continue L9;
                                          }
                                        }
                                      } else {
                                        var12 = 0;
                                        L12: while (true) {
                                          if (var5 <= var12) {
                                            if ((2 & var11) != 0) {
                                              var12 = 0;
                                              L13: while (true) {
                                                if (var12 >= var5) {
                                                  break L8;
                                                } else {
                                                  var13 = 0;
                                                  L14: while (true) {
                                                    if (var6 <= var13) {
                                                      var12++;
                                                      continue L13;
                                                    } else {
                                                      L15: {
                                                        dupTemp$1 = var17.a((byte) -67);
                                                        var9[var12 - -(var5 * var13)] = dupTemp$1;
                                                        var14 = dupTemp$1;
                                                        stackIn_37_0 = var10;

                                                        if ((var14 ^ -1) == 0) {
                                                          stackIn_38_0 = stackIn_37_0;
                                                          stackIn_38_1 = 0;
                                                          break L15;
                                                        } else {
                                                          stackIn_38_0 = stackIn_37_0;
                                                          stackIn_38_1 = 1;
                                                          break L15;
                                                        }
                                                      }
                                                      var10 = stackIn_38_0 | stackIn_38_1;
                                                      var13++;
                                                      continue L14;
                                                    }
                                                  }
                                                }
                                              }
                                            } else {
                                              break L8;
                                            }
                                          } else {
                                            var13 = 0;
                                            L16: while (true) {
                                              if (var6 <= var13) {
                                                var12++;
                                                continue L12;
                                              } else {
                                                var8[var13 * var5 + var12] = var17.a((byte) -106);
                                                var13++;
                                                continue L16;
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                    ne.field_e[var4] = var10 != 0;
                                    var4++;
                                    continue L7;
                                  }
                                }
                              } else {
                                L17: {
                                  qv.field_j[var4] = var17.d((byte) -13);
                                  if ((qv.field_j[var4] ^ -1) != -1) {
                                    break L17;
                                  } else {
                                    qv.field_j[var4] = 1;
                                    break L17;
                                  }
                                }
                                var4++;
                                continue L6;
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
          L18: {
            var2 = decompiledCaughtException;
            stackIn_55_0 = (RuntimeException) (var2);

            stackIn_55_1 = new StringBuilder().append("b.B(");

            if (param0 == null) {
              stackIn_56_0 = (RuntimeException) ((Object) stackIn_55_0);
              stackIn_56_1 = (StringBuilder) ((Object) stackIn_55_1);
              stackIn_56_2 = "null";
              break L18;
            } else {
              stackIn_56_0 = (RuntimeException) ((Object) stackIn_55_0);
              stackIn_56_1 = (StringBuilder) ((Object) stackIn_55_1);
              stackIn_56_2 = "{...}";
              break L18;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_56_0), stackIn_56_2 + ',' + param1 + ')');
        }
    }

    public static void a(boolean param0) {
        field_n = null;
        if (!param0) {
            b.a(94, 33, -110, (byte) 28, -37);
        }
    }

    final static int a(int param0, int param1, int param2, byte param3, int param4) {
        int var5;
        int var6;
        int var7;
        if (-1 == (param0 ^ -1)) {
          return 1;
        } else {
          if (param1 != 0) {
            if (param3 == 25) {
              L0: {
                var5 = (-param4 + param0 * 2) * 500 / param0;
                var5 = Math.max(0, var5);
                if (-501 > (var5 ^ -1)) {
                  var6 = var5 - 500;
                  var5 = var6 / 3 + 500;
                  if ((var5 ^ -1) < -1001) {
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
                  if ((var6 ^ -1) >= -1001) {
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
              return -81;
            }
          } else {
            return 1;
          }
        }
    }

    b() {
        this.field_m = false;
    }

    final static int a(boolean param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int stackIn_10_0 = 0;
        int stackIn_14_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              if (!param0) {
                break L1;
              } else {
                field_n = (la) null;
                break L1;
              }
            }
            var2_int = 0;
            L2: while (true) {
              if (var2_int >= wp.field_H.length) {
                stackIn_14_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                var3 = 0;
                L3: while (true) {
                  if (wp.field_H[var2_int].length <= var3) {
                    var2_int++;
                    continue L2;
                  } else {
                    if ((wp.field_H[var2_int][var3] ^ -1) == (param1 ^ -1)) {
                      stackIn_10_0 = var3;
                      decompiledRegionSelector0 = 0;
                      break L0;
                    } else {
                      var3++;
                      continue L3;
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var2), "b.A(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_10_0;
        } else {
          return stackIn_14_0;
        }
    }

    static {
    }
}
