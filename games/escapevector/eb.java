/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eb extends hc {
    int field_N;
    int field_I;
    int field_M;
    static boolean field_H;
    static om field_L;
    int field_F;
    int field_D;
    int field_G;
    static long field_J;
    static int field_K;

    final static void k(int param0) {
        Object var2 = null;
        de.a(kl.field_o, (String) null, 63);
        if (param0 != 0) {
            eb.a(true);
        }
    }

    final static void a(byte[] param0, boolean param1) {
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
        Object var16 = null;
        n var17 = null;
        n var18 = null;
        byte[] var19 = null;
        byte[] var20 = null;
        byte[] var21 = null;
        byte[] var22 = null;
        byte[] var23 = null;
        byte[] var24 = null;
        byte[] var25 = null;
        byte[] var26 = null;
        int stackIn_41_0 = 0;
        int stackIn_42_0 = 0;
        int stackIn_43_0 = 0;
        int stackIn_43_1 = 0;
        int stackIn_55_0 = 0;
        int stackIn_56_0 = 0;
        int stackIn_57_0 = 0;
        int stackIn_57_1 = 0;
        int stackOut_40_0 = 0;
        int stackOut_42_0 = 0;
        int stackOut_42_1 = 0;
        int stackOut_41_0 = 0;
        int stackOut_41_1 = 0;
        int stackOut_54_0 = 0;
        int stackOut_56_0 = 0;
        int stackOut_56_1 = 0;
        int stackOut_55_0 = 0;
        int stackOut_55_1 = 0;
        L0: {
          var15 = EscapeVector.field_A;
          var17 = new n(param0);
          var18 = var17;
          var18.field_m = -2 + param0.length;
          qk.field_j = var18.f(1952);
          gn.field_k = new int[qk.field_j];
          bj.field_E = new boolean[qk.field_j];
          bc.field_a = new int[qk.field_j];
          if (param1) {
            break L0;
          } else {
            var16 = null;
            eb.a((byte[]) null, false);
            break L0;
          }
        }
        hn.field_b = new byte[qk.field_j][];
        gi.field_e = new int[qk.field_j];
        qe.field_a = new byte[qk.field_j][];
        qh.field_k = new int[qk.field_j];
        var18.field_m = -(qk.field_j * 8) + (-7 + param0.length);
        on.field_e = var18.f(1952);
        hd.field_c = var18.f(1952);
        var3 = 1 + (var18.e(0) & 255);
        var4 = 0;
        L1: while (true) {
          L2: {
            if (var4 >= qk.field_j) {
              break L2;
            } else {
              gn.field_k[var4] = var17.f(1952);
              var4++;
              if (0 == 0) {
                continue L1;
              } else {
                break L2;
              }
            }
          }
          var4 = 0;
          L3: while (true) {
            L4: {
              if (qk.field_j <= var4) {
                break L4;
              } else {
                gi.field_e[var4] = var17.f(1952);
                var4++;
                if (0 == 0) {
                  continue L3;
                } else {
                  break L4;
                }
              }
            }
            var4 = 0;
            L5: while (true) {
              L6: {
                if (var4 >= qk.field_j) {
                  break L6;
                } else {
                  qh.field_k[var4] = var17.f(1952);
                  var4++;
                  if (0 == 0) {
                    continue L5;
                  } else {
                    break L6;
                  }
                }
              }
              var4 = 0;
              L7: while (true) {
                L8: {
                  if (qk.field_j <= var4) {
                    break L8;
                  } else {
                    bc.field_a[var4] = var17.f(1952);
                    var4++;
                    if (0 == 0) {
                      continue L7;
                    } else {
                      break L8;
                    }
                  }
                }
                var18.field_m = -(var3 * 3) - (-3 - (param0.length - (7 + qk.field_j * 8)));
                qk.field_f = new int[var3];
                var4 = 1;
                L9: while (true) {
                  L10: {
                    if (var4 >= var3) {
                      break L10;
                    } else {
                      L11: {
                        qk.field_f[var4] = var17.d((byte) -124);
                        if (qk.field_f[var4] == 0) {
                          qk.field_f[var4] = 1;
                          break L11;
                        } else {
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
                  var18.field_m = 0;
                  var4 = 0;
                  L12: while (true) {
                    L13: {
                      if (var4 >= qk.field_j) {
                        break L13;
                      } else {
                        L14: {
                          L15: {
                            var5 = qh.field_k[var4];
                            var6 = bc.field_a[var4];
                            var7 = var6 * var5;
                            var25 = new byte[var7];
                            var23 = var25;
                            var21 = var23;
                            var19 = var21;
                            var8 = var19;
                            qe.field_a[var4] = var25;
                            var26 = new byte[var7];
                            var24 = var26;
                            var22 = var24;
                            var20 = var22;
                            var9 = var20;
                            hn.field_b[var4] = var26;
                            var10 = 0;
                            var11 = var18.e(0);
                            if ((var11 & 1) == 0) {
                              break L15;
                            } else {
                              var12 = 0;
                              L16: while (true) {
                                L17: {
                                  if (var12 >= var5) {
                                    break L17;
                                  } else {
                                    var13 = 0;
                                    L18: while (true) {
                                      L19: {
                                        if (var13 >= var6) {
                                          break L19;
                                        } else {
                                          var8[var13 * var5 + var12] = var17.a(false);
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
                                      if (var5 <= var12) {
                                        break L21;
                                      } else {
                                        var13 = 0;
                                        L22: while (true) {
                                          L23: {
                                            if (var13 >= var6) {
                                              break L23;
                                            } else {
                                              L24: {
                                                byte dupTemp$2 = var17.a(false);
                                                var9[var12 + var5 * var13] = dupTemp$2;
                                                var14 = dupTemp$2;
                                                stackOut_40_0 = var10;
                                                stackIn_42_0 = stackOut_40_0;
                                                stackIn_41_0 = stackOut_40_0;
                                                if (var14 == -1) {
                                                  stackOut_42_0 = stackIn_42_0;
                                                  stackOut_42_1 = 0;
                                                  stackIn_43_0 = stackOut_42_0;
                                                  stackIn_43_1 = stackOut_42_1;
                                                  break L24;
                                                } else {
                                                  stackOut_41_0 = stackIn_41_0;
                                                  stackOut_41_1 = 1;
                                                  stackIn_43_0 = stackOut_41_0;
                                                  stackIn_43_1 = stackOut_41_1;
                                                  break L24;
                                                }
                                              }
                                              var10 = stackIn_43_0 | stackIn_43_1;
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
                              if (var7 <= var12) {
                                break L26;
                              } else {
                                var8[var12] = var17.a(false);
                                var12++;
                                if (0 == 0) {
                                  continue L25;
                                } else {
                                  break L26;
                                }
                              }
                            }
                            if (0 != (2 & var11)) {
                              var12 = 0;
                              L27: while (true) {
                                if (var7 <= var12) {
                                  break L14;
                                } else {
                                  L28: {
                                    byte dupTemp$3 = var17.a(false);
                                    var9[var12] = dupTemp$3;
                                    var13 = dupTemp$3;
                                    stackOut_54_0 = var10;
                                    stackIn_56_0 = stackOut_54_0;
                                    stackIn_55_0 = stackOut_54_0;
                                    if (0 == (var13 ^ -1)) {
                                      stackOut_56_0 = stackIn_56_0;
                                      stackOut_56_1 = 0;
                                      stackIn_57_0 = stackOut_56_0;
                                      stackIn_57_1 = stackOut_56_1;
                                      break L28;
                                    } else {
                                      stackOut_55_0 = stackIn_55_0;
                                      stackOut_55_1 = 1;
                                      stackIn_57_0 = stackOut_55_0;
                                      stackIn_57_1 = stackOut_55_1;
                                      break L28;
                                    }
                                  }
                                  var10 = stackIn_57_0 | stackIn_57_1;
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
                        bj.field_E[var4] = var10 != 0;
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

    final boolean a(int param0, int param1, byte param2, int param3, int param4, hm param5, int param6) {
        int var8 = 0;
        int var9 = 0;
        double var10 = 0.0;
        int var12 = 0;
        var12 = EscapeVector.field_A;
        if (super.a(param0, param1, param2, param3, param4, param5, param6)) {
          var8 = -param4 + -((eb) this).field_k - (((eb) this).field_D - param1);
          var9 = -((eb) this).field_j + (-param0 + (-((eb) this).field_I + param3));
          if (((eb) this).field_N * ((eb) this).field_N <= var8 * var8 - -(var9 * var9)) {
            return true;
          } else {
            L0: {
              var10 = Math.atan2((double)var9, (double)var8) - hf.field_c;
              if (0.0 > var10) {
                var10 = var10 - 3.141592653589793 / (double)((eb) this).field_M;
                break L0;
              } else {
                if (var10 > 0.0) {
                  var10 = var10 + 3.141592653589793 / (double)((eb) this).field_M;
                  break L0;
                } else {
                  break L0;
                }
              }
            }
            ((eb) this).field_F = (int)(var10 * (double)((eb) this).field_M / 6.283185307179586);
            L1: while (true) {
              if (((eb) this).field_M > ((eb) this).field_F) {
                L2: while (true) {
                  if (0 <= ((eb) this).field_F) {
                    return true;
                  } else {
                    ((eb) this).field_F = ((eb) this).field_F + ((eb) this).field_M;
                    continue L2;
                  }
                }
              } else {
                ((eb) this).field_F = ((eb) this).field_F - ((eb) this).field_M;
                continue L1;
              }
            }
          }
        } else {
          return false;
        }
    }

    public static void a(boolean param0) {
        if (!param0) {
            return;
        }
        field_L = null;
    }

    private eb() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_L = new om(2, 4, 4, 0);
        field_K = 0;
    }
}
