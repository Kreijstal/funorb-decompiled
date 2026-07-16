/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kn extends ec {
    static String field_F;
    static int field_B;
    static int field_I;
    static byte[] field_E;
    static int[] field_K;
    static String field_L;
    static String field_G;
    int field_H;
    static String field_J;

    final static void g(int param0) {
        la.field_g = 0;
        if (param0 != 20128) {
            u discarded$0 = kn.f(-95);
        }
    }

    public static void h(int param0) {
        field_E = null;
        field_F = null;
        field_J = null;
        if (param0 != 0) {
            boolean discarded$0 = kn.a('ﾬ', (byte) 74);
        }
        field_L = null;
        field_G = null;
        field_K = null;
    }

    final void a(byte param0, int param1, int param2, int param3) {
        if (!(param3 == 0)) {
            return;
        }
        if (((kn) this).field_x == null) {
            return;
        }
        if (-1 == (((kn) this).field_H ^ -1)) {
            return;
        }
        if (!(256 != ((kn) this).field_H)) {
            ((kn) this).field_x.a((byte) 37, param1 - -((kn) this).field_l, ((kn) this).field_u + param2, param3);
            return;
        }
        mg var5 = new mg(((kn) this).field_x.field_g, ((kn) this).field_x.field_m);
        kb.a(var5, 16865);
        ((kn) this).field_x.a(param0, 0, 0, param3);
        ai.a(true);
        var5.a(param1 - -((kn) this).field_l, ((kn) this).field_u + param2, ((kn) this).field_H);
    }

    public kn() {
        super(0, 0, 0, 0, (ol) null, (cd) null);
        ((kn) this).field_H = 256;
    }

    final static void a(boolean param0, int param1, int param2, int param3, int param4, int param5, int param6, he param7) {
        int var8 = 0;
        hk[] var8_ref_hk__ = null;
        int var9 = 0;
        int[] var10 = null;
        int var10_int = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        hk var13_ref_hk = null;
        int var14 = 0;
        int var15 = 0;
        hk[] var16 = null;
        hk[] var17 = null;
        int[] var18 = null;
        int[] var19 = null;
        int[] var20 = null;
        int[] var21 = null;
        hk[][] stackIn_2_0 = null;
        hk[][] stackIn_3_0 = null;
        hk[][] stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        int stackIn_21_0 = 0;
        int stackIn_44_0 = 0;
        hk[][] stackOut_1_0 = null;
        hk[][] stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        hk[][] stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        int stackOut_20_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_43_0 = 0;
        int stackOut_42_0 = 0;
        int stackOut_40_0 = 0;
        int stackOut_39_0 = 0;
        L0: {
          var15 = Virogrid.field_F ? 1 : 0;
          if (param6 >= param3) {
            var8 = 1;
            var9 = 0;
            L1: while (true) {
              if (var9 >= nb.field_q.length) {
                if (var8 != 0) {
                  ud.field_b = true;
                  break L0;
                } else {
                  break L0;
                }
              } else {
                var21 = nb.field_q[var9];
                var20 = var21;
                var19 = var20;
                var18 = var19;
                var10 = var18;
                var11 = 0;
                var12 = 0;
                L2: while (true) {
                  if (var12 >= var21.length) {
                    L3: {
                      if (var11 != 0) {
                        break L3;
                      } else {
                        if (vb.field_h == param6) {
                          break L3;
                        } else {
                          var9++;
                          continue L1;
                        }
                      }
                    }
                    var8 = 0;
                    var12 = 0;
                    L4: while (true) {
                      if (var21.length > var12) {
                        var13 = var21[var12];
                        if (var13 != -1) {
                          if (param6 > var13) {
                            hk.field_Lb[var13] = true;
                            var12 += 2;
                            continue L4;
                          } else {
                            var12 += 2;
                            continue L4;
                          }
                        } else {
                          vi.field_l = true;
                          var12 += 2;
                          continue L4;
                        }
                      } else {
                        var9++;
                        continue L1;
                      }
                    }
                  } else {
                    L5: {
                      var13 = var21[var12];
                      var14 = var10[var12 - -1];
                      if ((var13 ^ -1) == 0) {
                        if (var14 != vj.field_b[param2]) {
                          break L5;
                        } else {
                          var12 += 2;
                          continue L2;
                        }
                      } else {
                        L6: {
                          if (param6 != var13) {
                            break L6;
                          } else {
                            if (param1 != var14) {
                              break L6;
                            } else {
                              var11 = 1;
                              var12 += 2;
                              continue L2;
                            }
                          }
                        }
                        if (var13 < param6) {
                          if (var14 != (ub.field_D[var13] & 255)) {
                            break L5;
                          } else {
                            var12 += 2;
                            continue L2;
                          }
                        } else {
                          var9++;
                          continue L1;
                        }
                      }
                    }
                    var12 = var12;
                    var9++;
                    continue L1;
                  }
                }
              }
            }
          } else {
            L7: {
              stackOut_1_0 = oe.field_b;
              stackIn_3_0 = stackOut_1_0;
              stackIn_2_0 = stackOut_1_0;
              if (0 != (param6 ^ -1)) {
                stackOut_3_0 = (hk[][]) (Object) stackIn_3_0;
                stackOut_3_1 = param6 + 4;
                stackIn_4_0 = stackOut_3_0;
                stackIn_4_1 = stackOut_3_1;
                break L7;
              } else {
                stackOut_2_0 = (hk[][]) (Object) stackIn_2_0;
                stackOut_2_1 = 1;
                stackIn_4_0 = stackOut_2_0;
                stackIn_4_1 = stackOut_2_1;
                break L7;
              }
            }
            L8: {
              var16 = stackIn_4_0[stackIn_4_1];
              var17 = var16;
              var8_ref_hk__ = var17;
              var9 = 1;
              if (!param0) {
                break L8;
              } else {
                if (-1 != param6) {
                  var16 = var17;
                  var10_int = 0;
                  L9: while (true) {
                    L10: {
                      if (var10_int >= var16.length + -1) {
                        break L10;
                      } else {
                        if ((pm.field_p[(var10_int + param4) / 8] & 1 << (param4 + var10_int & 7)) == 0) {
                          var10_int++;
                          continue L9;
                        } else {
                          var9 = 0;
                          break L10;
                        }
                      }
                    }
                    param4 = param4 + (lk.field_Pb[param6] & 255);
                    break L8;
                  }
                } else {
                  var10_int = 0;
                  L11: while (true) {
                    if (vj.field_b.length <= var10_int) {
                      break L8;
                    } else {
                      if ((field_E[var10_int / 8] & 1 << (7 & var10_int)) == 0) {
                        var10_int++;
                        continue L11;
                      } else {
                        var9 = 0;
                        break L8;
                      }
                    }
                  }
                }
              }
            }
            var10_int = 0;
            var11 = 0;
            L12: while (true) {
              L13: {
                if (-1 != param6) {
                  stackOut_20_0 = var17.length + -1;
                  stackIn_21_0 = stackOut_20_0;
                  break L13;
                } else {
                  stackOut_19_0 = vj.field_b.length;
                  stackIn_21_0 = stackOut_19_0;
                  break L13;
                }
              }
              if ((stackIn_21_0 ^ -1) >= (var11 ^ -1)) {
                if (var10_int == 0) {
                  var11 = 0;
                  L14: while (true) {
                    if (-1 + var17.length <= var11) {
                      break L0;
                    } else {
                      L15: {
                        if ((param6 ^ -1) != 0) {
                          ub.field_D[param6] = (byte)var11;
                          break L15;
                        } else {
                          param2 = var11;
                          break L15;
                        }
                      }
                      kn.a(param0, param1, param2, param3, param4, 8, param6 - -1, param7);
                      if (!ud.field_b) {
                        var11++;
                        continue L14;
                      } else {
                        return;
                      }
                    }
                  }
                } else {
                  break L0;
                }
              } else {
                L16: {
                  if (param6 != 0) {
                    ub.field_D[param6] = (byte)var11;
                    break L16;
                  } else {
                    param2 = var11;
                    break L16;
                  }
                }
                L17: {
                  L18: {
                    if (param6 != -1) {
                      break L18;
                    } else {
                      if (-2 != vj.field_b.length) {
                        break L18;
                      } else {
                        var12 = 1;
                        break L17;
                      }
                    }
                  }
                  var13_ref_hk = var8_ref_hk__[var11 + 1];
                  if (!param0) {
                    L19: {
                      if (0 == (param6 ^ -1)) {
                        if (wl.field_d.field_vc != vj.field_b[var11]) {
                          stackOut_43_0 = 0;
                          stackIn_44_0 = stackOut_43_0;
                          break L19;
                        } else {
                          stackOut_42_0 = 1;
                          stackIn_44_0 = stackOut_42_0;
                          break L19;
                        }
                      } else {
                        if ((255 & wl.field_d.field_Pb[param6]) != var11) {
                          stackOut_40_0 = 0;
                          stackIn_44_0 = stackOut_40_0;
                          break L19;
                        } else {
                          stackOut_39_0 = 1;
                          stackIn_44_0 = stackOut_39_0;
                          break L19;
                        }
                      }
                    }
                    var12 = stackIn_44_0;
                    break L17;
                  } else {
                    if (!var13_ref_hk.field_xb) {
                      if (var9 != 0) {
                        if (var13_ref_hk.field_Y) {
                          var12 = 1;
                          break L17;
                        } else {
                          var12 = 0;
                          break L17;
                        }
                      } else {
                        var12 = 0;
                        break L17;
                      }
                    } else {
                      var12 = 1;
                      break L17;
                    }
                  }
                }
                L20: {
                  if (var12 == 0) {
                    break L20;
                  } else {
                    kn.a(param0, param1, param2, param3, param4, param5 + 0, 1 + param6, param7);
                    var10_int = 1;
                    break L20;
                  }
                }
                if (ud.field_b) {
                  return;
                } else {
                  var11++;
                  continue L12;
                }
              }
            }
          }
        }
        L21: {
          if (param5 == 8) {
            break L21;
          } else {
            boolean discarded$1 = kn.a('', (byte) -102);
            break L21;
          }
        }
    }

    final static String a(String param0, byte param1, String param2, String param3) {
        int var5 = Virogrid.field_F ? 1 : 0;
        if (param1 != -33) {
            return null;
        }
        int var4 = param0.indexOf(param3);
        while (var4 != -1) {
            param0 = param0.substring(0, var4) + param2 + param0.substring(var4 + param3.length());
            var4 = param0.indexOf(param3, param2.length() + var4);
        }
        return param0;
    }

    final static boolean a(char param0, byte param1) {
        int stackIn_13_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        L0: {
          if (param1 == -69) {
            break L0;
          } else {
            field_I = 27;
            break L0;
          }
        }
        L1: {
          L2: {
            L3: {
              if (param0 < 48) {
                break L3;
              } else {
                if (param0 <= 57) {
                  break L2;
                } else {
                  break L3;
                }
              }
            }
            L4: {
              if (param0 < 65) {
                break L4;
              } else {
                if (param0 <= 90) {
                  break L2;
                } else {
                  break L4;
                }
              }
            }
            L5: {
              if (param0 < 97) {
                break L5;
              } else {
                if (param0 > 122) {
                  break L5;
                } else {
                  break L2;
                }
              }
            }
            stackOut_12_0 = 0;
            stackIn_13_0 = stackOut_12_0;
            break L1;
          }
          stackOut_11_0 = 1;
          stackIn_13_0 = stackOut_11_0;
          break L1;
        }
        return stackIn_13_0 != 0;
    }

    final static u f(int param0) {
        int var1_int = 0;
        IllegalArgumentException var1 = null;
        u var2 = null;
        u stackIn_5_0 = null;
        Throwable decompiledCaughtException = null;
        u stackOut_4_0 = null;
        try {
          L0: {
            var1_int = 0;
            if (param0 == 256) {
              break L0;
            } else {
              field_L = null;
              break L0;
            }
          }
          L1: while (true) {
            var2 = dm.field_v.a(var1_int, (byte) 35);
            if (var2.field_o) {
              stackOut_4_0 = (u) var2;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0;
            } else {
              var1_int++;
              continue L1;
            }
          }
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = (IllegalArgumentException) (Object) decompiledCaughtException;
          return null;
        }
    }

    kn(fi param0) {
        super(param0.field_l, param0.field_u, param0.field_g, param0.field_m, (ol) null, (cd) null);
        param0.a(((kn) this).field_m, true, 0, 0, ((kn) this).field_g);
        ((kn) this).field_H = 256;
        ((kn) this).field_x = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_F = "Breaking real-world laws";
        field_B = -1;
        field_K = new int[4];
        field_L = "Mouse over an icon for details";
        field_G = "This password is part of your Player Name, and would be easy to guess";
    }
}
