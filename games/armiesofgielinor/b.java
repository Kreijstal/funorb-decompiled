/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class b extends tc {
    boolean field_m;
    static la field_n;
    int[] field_l;
    static int field_k;

    final static void a(byte[] param0, int param1) {
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
        int stackIn_40_0 = 0;
        int stackIn_41_0 = 0;
        int stackIn_42_0 = 0;
        int stackIn_42_1 = 0;
        int stackIn_54_0 = 0;
        int stackIn_55_0 = 0;
        int stackIn_56_0 = 0;
        int stackIn_56_1 = 0;
        int stackOut_39_0 = 0;
        int stackOut_41_0 = 0;
        int stackOut_41_1 = 0;
        int stackOut_40_0 = 0;
        int stackOut_40_1 = 0;
        int stackOut_53_0 = 0;
        int stackOut_55_0 = 0;
        int stackOut_55_1 = 0;
        int stackOut_54_0 = 0;
        int stackOut_54_1 = 0;
        var15 = ArmiesOfGielinor.field_M ? 1 : 0;
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
        L0: while (true) {
          L1: {
            if (iw.field_n <= var4) {
              break L1;
            } else {
              j.field_e[var4] = var16.e((byte) -104);
              var4++;
              if (0 == 0) {
                continue L0;
              } else {
                break L1;
              }
            }
          }
          var4 = 0;
          L2: while (true) {
            L3: {
              if (var4 >= iw.field_n) {
                break L3;
              } else {
                iq.field_g[var4] = var16.e((byte) -104);
                var4++;
                if (0 == 0) {
                  continue L2;
                } else {
                  break L3;
                }
              }
            }
            var4 = 0;
            L4: while (true) {
              L5: {
                if (iw.field_n <= var4) {
                  break L5;
                } else {
                  qm.field_K[var4] = var16.e((byte) -104);
                  var4++;
                  if (0 == 0) {
                    continue L4;
                  } else {
                    break L5;
                  }
                }
              }
              var4 = 0;
              L6: while (true) {
                L7: {
                  if (var4 >= iw.field_n) {
                    break L7;
                  } else {
                    c.field_e[var4] = var16.e((byte) -104);
                    var4++;
                    if (0 == 0) {
                      continue L6;
                    } else {
                      break L7;
                    }
                  }
                }
                L8: {
                  if (param1 == -1) {
                    break L8;
                  } else {
                    field_n = null;
                    break L8;
                  }
                }
                var17.field_q = 3 + (-(var3 * 3) + (-(8 * iw.field_n) + -7) + param0.length);
                qv.field_j = new int[var3];
                var4 = 1;
                L9: while (true) {
                  L10: {
                    if (var4 >= var3) {
                      break L10;
                    } else {
                      L11: {
                        qv.field_j[var4] = var16.d((byte) -13);
                        if ((qv.field_j[var4] ^ -1) != -1) {
                          break L11;
                        } else {
                          qv.field_j[var4] = 1;
                          break L11;
                        }
                      }
                      var4++;
                      if (0 == 0) {
                        continue L9;
                      } else {
                        break L10;
                      }
                    }
                  }
                  var17.field_q = 0;
                  var4 = 0;
                  L12: while (true) {
                    L13: {
                      if (var4 >= iw.field_n) {
                        break L13;
                      } else {
                        L14: {
                          L15: {
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
                              break L15;
                            } else {
                              var12 = 0;
                              L16: while (true) {
                                L17: {
                                  if (var5 <= var12) {
                                    break L17;
                                  } else {
                                    var13 = 0;
                                    L18: while (true) {
                                      L19: {
                                        if (var6 <= var13) {
                                          break L19;
                                        } else {
                                          var8[var13 * var5 + var12] = var16.a((byte) -106);
                                          var13++;
                                          if (0 == 0) {
                                            continue L18;
                                          } else {
                                            break L19;
                                          }
                                        }
                                      }
                                      var12++;
                                      if (0 == 0) {
                                        continue L16;
                                      } else {
                                        break L17;
                                      }
                                    }
                                  }
                                }
                                if ((2 & var11) != 0) {
                                  var12 = 0;
                                  L20: while (true) {
                                    L21: {
                                      if (var12 >= var5) {
                                        break L21;
                                      } else {
                                        var13 = 0;
                                        L22: while (true) {
                                          L23: {
                                            if (var6 <= var13) {
                                              break L23;
                                            } else {
                                              L24: {
                                                var9[var12 - -(var5 * var13)] = var16.a((byte) -67);
                                                var14 = var16.a((byte) -67);
                                                stackOut_39_0 = var10;
                                                stackIn_41_0 = stackOut_39_0;
                                                stackIn_40_0 = stackOut_39_0;
                                                if ((var14 ^ -1) == 0) {
                                                  stackOut_41_0 = stackIn_41_0;
                                                  stackOut_41_1 = 0;
                                                  stackIn_42_0 = stackOut_41_0;
                                                  stackIn_42_1 = stackOut_41_1;
                                                  break L24;
                                                } else {
                                                  stackOut_40_0 = stackIn_40_0;
                                                  stackOut_40_1 = 1;
                                                  stackIn_42_0 = stackOut_40_0;
                                                  stackIn_42_1 = stackOut_40_1;
                                                  break L24;
                                                }
                                              }
                                              var10 = stackIn_42_0 | stackIn_42_1;
                                              var13++;
                                              if (0 == 0) {
                                                continue L22;
                                              } else {
                                                break L23;
                                              }
                                            }
                                          }
                                          var12++;
                                          if (0 == 0) {
                                            continue L20;
                                          } else {
                                            break L21;
                                          }
                                        }
                                      }
                                    }
                                    if (0 == 0) {
                                      break L14;
                                    } else {
                                      break L15;
                                    }
                                  }
                                } else {
                                  break L14;
                                }
                              }
                            }
                          }
                          var12 = 0;
                          L25: while (true) {
                            L26: {
                              if (var12 >= var7) {
                                break L26;
                              } else {
                                var8[var12] = var16.a((byte) -90);
                                var12++;
                                if (0 == 0) {
                                  continue L25;
                                } else {
                                  break L26;
                                }
                              }
                            }
                            if (-1 != (var11 & 2 ^ -1)) {
                              var12 = 0;
                              L27: while (true) {
                                if (var12 >= var7) {
                                  break L14;
                                } else {
                                  L28: {
                                    var9[var12] = var16.a((byte) 102);
                                    var13 = var16.a((byte) 102);
                                    stackOut_53_0 = var10;
                                    stackIn_55_0 = stackOut_53_0;
                                    stackIn_54_0 = stackOut_53_0;
                                    if (var13 == -1) {
                                      stackOut_55_0 = stackIn_55_0;
                                      stackOut_55_1 = 0;
                                      stackIn_56_0 = stackOut_55_0;
                                      stackIn_56_1 = stackOut_55_1;
                                      break L28;
                                    } else {
                                      stackOut_54_0 = stackIn_54_0;
                                      stackOut_54_1 = 1;
                                      stackIn_56_0 = stackOut_54_0;
                                      stackIn_56_1 = stackOut_54_1;
                                      break L28;
                                    }
                                  }
                                  var10 = stackIn_56_0 | stackIn_56_1;
                                  var12++;
                                  if (0 == 0) {
                                    continue L27;
                                  } else {
                                    break L14;
                                  }
                                }
                              }
                            } else {
                              break L14;
                            }
                          }
                        }
                        ne.field_e[var4] = var10 != 0;
                        var4++;
                        if (0 == 0) {
                          continue L12;
                        } else {
                          break L13;
                        }
                      }
                    }
                    return;
                  }
                }
              }
            }
          }
        }
    }

    public static void a(boolean param0) {
        field_n = null;
        if (!param0) {
            int discarded$0 = b.a(94, 33, -110, (byte) 28, -37);
        }
    }

    final static int a(int param0, int param1, int param2, byte param3, int param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
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
        ((b) this).field_m = false;
    }

    final static int a(boolean param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (param0) {
            field_n = null;
        }
        for (var2 = 0; var2 < wp.field_H.length; var2++) {
            for (var3 = 0; wp.field_H[var2].length > var3; var3++) {
                if (!(wp.field_H[var2][var3] != param1)) {
                    return var3;
                }
            }
        }
        return 0;
    }

    static {
    }
}
