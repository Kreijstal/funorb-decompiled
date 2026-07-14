/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wab extends rqa {
    final static void a(int param0, byte[] param1) {
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
        ds var16 = null;
        ds var17 = null;
        byte[] var18 = null;
        byte[] var19 = null;
        byte[] var20 = null;
        byte[] var21 = null;
        byte[] var22 = null;
        byte[] var23 = null;
        byte[] var24 = null;
        byte[] var25 = null;
        int stackIn_37_0 = 0;
        int stackIn_38_0 = 0;
        int stackIn_39_0 = 0;
        int stackIn_39_1 = 0;
        int stackIn_51_0 = 0;
        int stackIn_52_0 = 0;
        int stackIn_53_0 = 0;
        int stackIn_53_1 = 0;
        int stackOut_36_0 = 0;
        int stackOut_38_0 = 0;
        int stackOut_38_1 = 0;
        int stackOut_37_0 = 0;
        int stackOut_37_1 = 0;
        int stackOut_50_0 = 0;
        int stackOut_52_0 = 0;
        int stackOut_52_1 = 0;
        int stackOut_51_0 = 0;
        int stackOut_51_1 = 0;
        var15 = VoidHunters.field_G;
        var16 = new ds(param1);
        var17 = var16;
        var17.field_e = -2 + param1.length;
        mma.field_a = var17.e(1869);
        hla.field_a = new int[mma.field_a];
        hja.field_o = new byte[mma.field_a][];
        sh.field_a = new byte[mma.field_a][];
        mk.field_o = new boolean[mma.field_a];
        so.field_f = new int[mma.field_a];
        nhb.field_o = new int[mma.field_a];
        iib.field_e = new int[mma.field_a];
        var17.field_e = -(mma.field_a * 8) + -7 + param1.length;
        fbb.field_i = var17.e(1869);
        sg.field_H = var17.e(1869);
        var3 = (255 & var17.e((byte) -110)) - -1;
        var4 = 0;
        L0: while (true) {
          L1: {
            if (mma.field_a <= var4) {
              break L1;
            } else {
              iib.field_e[var4] = var16.e(1869);
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
              if (var4 >= mma.field_a) {
                break L3;
              } else {
                so.field_f[var4] = var16.e(1869);
                var4++;
                if (0 == 0) {
                  continue L2;
                } else {
                  break L3;
                }
              }
            }
            var4 = param0;
            L4: while (true) {
              L5: {
                if (mma.field_a <= var4) {
                  break L5;
                } else {
                  nhb.field_o[var4] = var16.e(1869);
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
                  if (var4 >= mma.field_a) {
                    break L7;
                  } else {
                    hla.field_a[var4] = var16.e(1869);
                    var4++;
                    if (0 == 0) {
                      continue L6;
                    } else {
                      break L7;
                    }
                  }
                }
                var17.field_e = -7 + param1.length - 8 * mma.field_a + -((-1 + var3) * 3);
                rlb.field_d = new int[var3];
                var4 = 1;
                L8: while (true) {
                  L9: {
                    if (var4 >= var3) {
                      break L9;
                    } else {
                      L10: {
                        rlb.field_d[var4] = var16.c((byte) -87);
                        if (0 != rlb.field_d[var4]) {
                          break L10;
                        } else {
                          rlb.field_d[var4] = 1;
                          break L10;
                        }
                      }
                      var4++;
                      if (0 == 0) {
                        continue L8;
                      } else {
                        break L9;
                      }
                    }
                  }
                  var17.field_e = 0;
                  var4 = 0;
                  L11: while (true) {
                    L12: {
                      if (mma.field_a <= var4) {
                        break L12;
                      } else {
                        L13: {
                          L14: {
                            var5 = nhb.field_o[var4];
                            var6 = hla.field_a[var4];
                            var7 = var6 * var5;
                            var24 = new byte[var7];
                            var22 = var24;
                            var20 = var22;
                            var18 = var20;
                            var8 = var18;
                            sh.field_a[var4] = var24;
                            var25 = new byte[var7];
                            var23 = var25;
                            var21 = var23;
                            var19 = var21;
                            var9 = var19;
                            hja.field_o[var4] = var25;
                            var10 = 0;
                            var11 = var17.e((byte) -105);
                            if (0 == (1 & var11)) {
                              break L14;
                            } else {
                              var12 = 0;
                              L15: while (true) {
                                L16: {
                                  if (var5 <= var12) {
                                    break L16;
                                  } else {
                                    var13 = 0;
                                    L17: while (true) {
                                      L18: {
                                        if (var13 >= var6) {
                                          break L18;
                                        } else {
                                          var8[var12 + var13 * var5] = var16.d((byte) -114);
                                          var13++;
                                          if (0 == 0) {
                                            continue L17;
                                          } else {
                                            break L18;
                                          }
                                        }
                                      }
                                      var12++;
                                      if (0 == 0) {
                                        continue L15;
                                      } else {
                                        break L16;
                                      }
                                    }
                                  }
                                }
                                if ((var11 & 2) == 0) {
                                  break L13;
                                } else {
                                  var12 = 0;
                                  L19: while (true) {
                                    L20: {
                                      if (var5 <= var12) {
                                        break L20;
                                      } else {
                                        var13 = 0;
                                        L21: while (true) {
                                          L22: {
                                            if (var6 <= var13) {
                                              break L22;
                                            } else {
                                              L23: {
                                                var9[var13 * var5 + var12] = var16.d((byte) -114);
                                                var14 = var16.d((byte) -114);
                                                stackOut_36_0 = var10;
                                                stackIn_38_0 = stackOut_36_0;
                                                stackIn_37_0 = stackOut_36_0;
                                                if (-1 == var14) {
                                                  stackOut_38_0 = stackIn_38_0;
                                                  stackOut_38_1 = 0;
                                                  stackIn_39_0 = stackOut_38_0;
                                                  stackIn_39_1 = stackOut_38_1;
                                                  break L23;
                                                } else {
                                                  stackOut_37_0 = stackIn_37_0;
                                                  stackOut_37_1 = 1;
                                                  stackIn_39_0 = stackOut_37_0;
                                                  stackIn_39_1 = stackOut_37_1;
                                                  break L23;
                                                }
                                              }
                                              var10 = stackIn_39_0 | stackIn_39_1;
                                              var13++;
                                              if (0 == 0) {
                                                continue L21;
                                              } else {
                                                break L22;
                                              }
                                            }
                                          }
                                          var12++;
                                          if (0 == 0) {
                                            continue L19;
                                          } else {
                                            break L20;
                                          }
                                        }
                                      }
                                    }
                                    if (0 == 0) {
                                      break L13;
                                    } else {
                                      break L14;
                                    }
                                  }
                                }
                              }
                            }
                          }
                          var12 = 0;
                          L24: while (true) {
                            L25: {
                              if (var7 <= var12) {
                                break L25;
                              } else {
                                var8[var12] = var16.d((byte) -114);
                                var12++;
                                if (0 == 0) {
                                  continue L24;
                                } else {
                                  break L25;
                                }
                              }
                            }
                            if ((var11 & 2) != 0) {
                              var12 = 0;
                              L26: while (true) {
                                if (var7 <= var12) {
                                  break L13;
                                } else {
                                  L27: {
                                    var9[var12] = var16.d((byte) -114);
                                    var13 = var16.d((byte) -114);
                                    stackOut_50_0 = var10;
                                    stackIn_52_0 = stackOut_50_0;
                                    stackIn_51_0 = stackOut_50_0;
                                    if (-1 == var13) {
                                      stackOut_52_0 = stackIn_52_0;
                                      stackOut_52_1 = 0;
                                      stackIn_53_0 = stackOut_52_0;
                                      stackIn_53_1 = stackOut_52_1;
                                      break L27;
                                    } else {
                                      stackOut_51_0 = stackIn_51_0;
                                      stackOut_51_1 = 1;
                                      stackIn_53_0 = stackOut_51_0;
                                      stackIn_53_1 = stackOut_51_1;
                                      break L27;
                                    }
                                  }
                                  var10 = stackIn_53_0 | stackIn_53_1;
                                  var12++;
                                  if (0 == 0) {
                                    continue L26;
                                  } else {
                                    break L13;
                                  }
                                }
                              }
                            } else {
                              break L13;
                            }
                          }
                        }
                        mk.field_o[var4] = var10 != 0;
                        var4++;
                        if (0 == 0) {
                          continue L11;
                        } else {
                          break L12;
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

    wab(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final nc a(nc[] param0, int param1) {
        if (param1 >= -119) {
            return null;
        }
        ki.field_o = param0[0].a(81);
        return new nc((Object) (Object) "void");
    }

    static {
    }
}
