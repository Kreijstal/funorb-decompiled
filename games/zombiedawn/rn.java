/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rn {
    static lg field_b;
    static String field_a;

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
        de var16 = null;
        de var17 = null;
        byte[] var18 = null;
        byte[] var19 = null;
        byte[] var20 = null;
        byte[] var21 = null;
        byte[] var22 = null;
        byte[] var23 = null;
        byte[] var24 = null;
        byte[] var25 = null;
        int stackIn_33_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_35_0 = 0;
        int stackIn_35_1 = 0;
        int stackIn_51_0 = 0;
        int stackIn_52_0 = 0;
        int stackIn_53_0 = 0;
        int stackIn_53_1 = 0;
        int stackOut_32_0 = 0;
        int stackOut_34_0 = 0;
        int stackOut_34_1 = 0;
        int stackOut_33_0 = 0;
        int stackOut_33_1 = 0;
        int stackOut_50_0 = 0;
        int stackOut_52_0 = 0;
        int stackOut_52_1 = 0;
        int stackOut_51_0 = 0;
        int stackOut_51_1 = 0;
        var15 = ZombieDawn.field_J;
        var16 = new de(param0);
        var17 = var16;
        var17.field_j = -2 + param0.length;
        t.field_h = var17.f(param1 + 2);
        bn.field_c = new int[t.field_h];
        uf.field_n = new int[t.field_h];
        sl.field_d = new int[t.field_h];
        ka.field_f = new byte[t.field_h][];
        vj.field_m = new byte[t.field_h][];
        jc.field_r = new boolean[t.field_h];
        bo.field_o = new int[t.field_h];
        var17.field_j = -7 + (param0.length + -(t.field_h * 8));
        gl.field_F = var17.f(2);
        kd.field_pb = var17.f(2);
        var3 = (255 & var17.d((byte) -125)) + 1;
        var4 = 0;
        L0: while (true) {
          L1: {
            if (var4 >= t.field_h) {
              break L1;
            } else {
              sl.field_d[var4] = var16.f(2);
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
              if (t.field_h <= var4) {
                break L3;
              } else {
                bo.field_o[var4] = var16.f(2);
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
                if (var4 >= t.field_h) {
                  break L5;
                } else {
                  bn.field_c[var4] = var16.f(2);
                  var4++;
                  if (0 == 0) {
                    continue L4;
                  } else {
                    break L5;
                  }
                }
              }
              var4 = param1;
              L6: while (true) {
                L7: {
                  if (t.field_h <= var4) {
                    break L7;
                  } else {
                    uf.field_n[var4] = var16.f(2);
                    var4++;
                    if (0 == 0) {
                      continue L6;
                    } else {
                      break L7;
                    }
                  }
                }
                var17.field_j = -(t.field_h * 8) + -7 + param0.length - (var3 + -1) * 3;
                j.field_a = new int[var3];
                var4 = 1;
                L8: while (true) {
                  L9: {
                    if (var3 <= var4) {
                      break L9;
                    } else {
                      L10: {
                        j.field_a[var4] = var16.g(-1875);
                        if (j.field_a[var4] != 0) {
                          break L10;
                        } else {
                          j.field_a[var4] = 1;
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
                  var17.field_j = 0;
                  var4 = 0;
                  L11: while (true) {
                    L12: {
                      if (var4 >= t.field_h) {
                        break L12;
                      } else {
                        L13: {
                          L14: {
                            var5 = bn.field_c[var4];
                            var6 = uf.field_n[var4];
                            var7 = var6 * var5;
                            var24 = new byte[var7];
                            var22 = var24;
                            var20 = var22;
                            var18 = var20;
                            var8 = var18;
                            vj.field_m[var4] = var24;
                            var25 = new byte[var7];
                            var23 = var25;
                            var21 = var23;
                            var19 = var21;
                            var9 = var19;
                            ka.field_f[var4] = var25;
                            var10 = 0;
                            var11 = var17.d((byte) -115);
                            if (-1 != (1 & var11 ^ -1)) {
                              break L14;
                            } else {
                              var12 = 0;
                              L15: while (true) {
                                L16: {
                                  if (var7 <= var12) {
                                    break L16;
                                  } else {
                                    var8[var12] = var16.e((byte) 116);
                                    var12++;
                                    if (0 == 0) {
                                      continue L15;
                                    } else {
                                      break L16;
                                    }
                                  }
                                }
                                if ((var11 & 2) != 0) {
                                  var12 = 0;
                                  L17: while (true) {
                                    L18: {
                                      if (var7 <= var12) {
                                        break L18;
                                      } else {
                                        L19: {
                                          var9[var12] = var16.e((byte) 116);
                                          var13 = var16.e((byte) 116);
                                          stackOut_32_0 = var10;
                                          stackIn_34_0 = stackOut_32_0;
                                          stackIn_33_0 = stackOut_32_0;
                                          if (0 == (var13 ^ -1)) {
                                            stackOut_34_0 = stackIn_34_0;
                                            stackOut_34_1 = 0;
                                            stackIn_35_0 = stackOut_34_0;
                                            stackIn_35_1 = stackOut_34_1;
                                            break L19;
                                          } else {
                                            stackOut_33_0 = stackIn_33_0;
                                            stackOut_33_1 = 1;
                                            stackIn_35_0 = stackOut_33_0;
                                            stackIn_35_1 = stackOut_33_1;
                                            break L19;
                                          }
                                        }
                                        var10 = stackIn_35_0 | stackIn_35_1;
                                        var12++;
                                        if (0 == 0) {
                                          continue L17;
                                        } else {
                                          break L18;
                                        }
                                      }
                                    }
                                    if (0 == 0) {
                                      break L13;
                                    } else {
                                      break L14;
                                    }
                                  }
                                } else {
                                  break L13;
                                }
                              }
                            }
                          }
                          var12 = 0;
                          L20: while (true) {
                            L21: {
                              if (var5 <= var12) {
                                break L21;
                              } else {
                                var13 = 0;
                                L22: while (true) {
                                  L23: {
                                    if (var13 >= var6) {
                                      break L23;
                                    } else {
                                      var8[var13 * var5 + var12] = var16.e((byte) 116);
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
                            if (-1 != (var11 & 2 ^ -1)) {
                              var12 = 0;
                              L24: while (true) {
                                if (var5 <= var12) {
                                  break L13;
                                } else {
                                  var13 = 0;
                                  L25: while (true) {
                                    L26: {
                                      if (var13 >= var6) {
                                        break L26;
                                      } else {
                                        L27: {
                                          var9[var13 * var5 + var12] = var16.e((byte) 116);
                                          var14 = var16.e((byte) 116);
                                          stackOut_50_0 = var10;
                                          stackIn_52_0 = stackOut_50_0;
                                          stackIn_51_0 = stackOut_50_0;
                                          if (-1 == var14) {
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
                                        var13++;
                                        if (0 == 0) {
                                          continue L25;
                                        } else {
                                          break L26;
                                        }
                                      }
                                    }
                                    var12++;
                                    if (0 == 0) {
                                      continue L24;
                                    } else {
                                      break L13;
                                    }
                                  }
                                }
                              }
                            } else {
                              break L13;
                            }
                          }
                        }
                        jc.field_r[var4] = var10 != 0;
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

    public static void a(int param0) {
        field_a = null;
        field_b = null;
        if (param0 != -12637) {
            Object var2 = null;
            rn.a((byte[]) null, -33);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Create a free account to start using this feature";
        field_b = null;
    }
}
