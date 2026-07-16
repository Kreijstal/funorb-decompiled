/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sh extends ud {
    static String field_N;
    static boolean[] field_Q;
    static int[] field_O;
    int field_T;
    static iq field_P;
    static String field_S;
    static String field_R;

    final static void h(int param0) {
        ma.field_h = null;
        if (param0 != -1) {
            field_S = null;
        }
        v.field_b = null;
        rc.field_f = null;
        ih.field_d = null;
        pd.field_a = null;
        el.field_I = null;
    }

    final static void a(int param0, int param1, int param2, boolean param3, kh param4, int param5, int param6, boolean param7) {
        int var8 = 0;
        uo[] var8_ref_uo__ = null;
        int var9 = 0;
        int[] var10 = null;
        int var10_int = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        uo var13_ref_uo = null;
        int var14 = 0;
        int var15 = 0;
        uo[] var16 = null;
        uo[] var17 = null;
        int[] var18 = null;
        int[] var19 = null;
        int[] var20 = null;
        int[] var21 = null;
        uo[][] stackIn_2_0 = null;
        uo[][] stackIn_3_0 = null;
        uo[][] stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        int stackIn_24_0 = 0;
        int stackIn_39_0 = 0;
        int stackIn_46_0 = 0;
        uo[][] stackOut_1_0 = null;
        uo[][] stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        uo[][] stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        int stackOut_23_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_45_0 = 0;
        int stackOut_44_0 = 0;
        int stackOut_38_0 = 0;
        int stackOut_37_0 = 0;
        int stackOut_35_0 = 0;
        int stackOut_34_0 = 0;
        L0: {
          var15 = Pool.field_O;
          if ((param5 ^ -1) <= (param1 ^ -1)) {
            var8 = 1;
            var9 = 0;
            L1: while (true) {
              if ((var9 ^ -1) <= (we.field_m.length ^ -1)) {
                if (var8 == 0) {
                  break L0;
                } else {
                  qk.field_b = true;
                  break L0;
                }
              } else {
                var21 = we.field_m[var9];
                var20 = var21;
                var19 = var20;
                var18 = var19;
                var10 = var18;
                var11 = 0;
                var12 = 0;
                L2: while (true) {
                  L3: {
                    if (var21.length <= var12) {
                      L4: {
                        if (var11 != 0) {
                          break L4;
                        } else {
                          if ((dr.field_c ^ -1) == (param5 ^ -1)) {
                            break L4;
                          } else {
                            break L3;
                          }
                        }
                      }
                      var12 = 0;
                      L5: while (true) {
                        if ((var21.length ^ -1) >= (var12 ^ -1)) {
                          var8 = 0;
                          break L3;
                        } else {
                          L6: {
                            var13 = var21[var12];
                            if (-1 != var13) {
                              if ((var13 ^ -1) <= (param5 ^ -1)) {
                                break L6;
                              } else {
                                gf.field_b[var13] = true;
                                break L6;
                              }
                            } else {
                              ln.field_p = true;
                              break L6;
                            }
                          }
                          var12 += 2;
                          continue L5;
                        }
                      }
                    } else {
                      L7: {
                        var13 = var21[var12];
                        var14 = var10[var12 + 1];
                        if (-1 != var13) {
                          L8: {
                            if ((var13 ^ -1) != (param5 ^ -1)) {
                              break L8;
                            } else {
                              if (var14 != param2) {
                                break L8;
                              } else {
                                var11 = 1;
                                break L7;
                              }
                            }
                          }
                          if ((param5 ^ -1) >= (var13 ^ -1)) {
                            break L3;
                          } else {
                            if ((255 & dk.field_j[var13] ^ -1) != (var14 ^ -1)) {
                              break L3;
                            } else {
                              break L7;
                            }
                          }
                        } else {
                          if ((dg.field_T[param6] ^ -1) != (var14 ^ -1)) {
                            break L3;
                          } else {
                            break L7;
                          }
                        }
                      }
                      var12 += 2;
                      continue L2;
                    }
                  }
                  var9++;
                  continue L1;
                }
              }
            }
          } else {
            L9: {
              stackOut_1_0 = mc.field_f;
              stackIn_3_0 = stackOut_1_0;
              stackIn_2_0 = stackOut_1_0;
              if (0 == (param5 ^ -1)) {
                stackOut_3_0 = (uo[][]) (Object) stackIn_3_0;
                stackOut_3_1 = 1;
                stackIn_4_0 = stackOut_3_0;
                stackIn_4_1 = stackOut_3_1;
                break L9;
              } else {
                stackOut_2_0 = (uo[][]) (Object) stackIn_2_0;
                stackOut_2_1 = 4 - -param5;
                stackIn_4_0 = stackOut_2_0;
                stackIn_4_1 = stackOut_2_1;
                break L9;
              }
            }
            L10: {
              var16 = stackIn_4_0[stackIn_4_1];
              var17 = var16;
              var8_ref_uo__ = var17;
              var9 = 1;
              if (param7) {
                if (param5 == -1) {
                  var10_int = 0;
                  L11: while (true) {
                    if (var10_int >= dg.field_T.length) {
                      break L10;
                    } else {
                      if ((md.field_c[var10_int / 8] & 1 << (7 & var10_int)) != 0) {
                        var9 = 0;
                        break L10;
                      } else {
                        var10_int++;
                        continue L11;
                      }
                    }
                  }
                } else {
                  var10_int = 0;
                  L12: while (true) {
                    L13: {
                      if (-1 + var16.length <= var10_int) {
                        break L13;
                      } else {
                        if ((ka.field_s[(param0 - -var10_int) / 8] & 1 << (var10_int + param0 & 7) ^ -1) != -1) {
                          var9 = 0;
                          break L13;
                        } else {
                          var10_int++;
                          continue L12;
                        }
                      }
                    }
                    param0 = param0 + (255 & qf.field_j[param5]);
                    break L10;
                  }
                }
              } else {
                break L10;
              }
            }
            var17 = var8_ref_uo__;
            var10_int = 0;
            var11 = 0;
            L14: while (true) {
              L15: {
                if (0 == (param5 ^ -1)) {
                  stackOut_23_0 = dg.field_T.length;
                  stackIn_24_0 = stackOut_23_0;
                  break L15;
                } else {
                  stackOut_22_0 = -1 + var17.length;
                  stackIn_24_0 = stackOut_22_0;
                  break L15;
                }
              }
              if ((stackIn_24_0 ^ -1) >= (var11 ^ -1)) {
                L16: {
                  if (var10_int != 0) {
                    break L16;
                  } else {
                    var11 = 0;
                    L17: while (true) {
                      if (var11 >= var17.length - 1) {
                        break L16;
                      } else {
                        L18: {
                          if (param5 != -1) {
                            dk.field_j[param5] = (byte)var11;
                            break L18;
                          } else {
                            param6 = var11;
                            break L18;
                          }
                        }
                        sh.a(param0, param1, param2, false, param4, 1 + param5, param6, param7);
                        if (qk.field_b) {
                          return;
                        } else {
                          var11++;
                          continue L17;
                        }
                      }
                    }
                  }
                }
                break L0;
              } else {
                L19: {
                  if ((param5 ^ -1) == 0) {
                    param6 = var11;
                    break L19;
                  } else {
                    dk.field_j[param5] = (byte)var11;
                    break L19;
                  }
                }
                L20: {
                  L21: {
                    if (0 != (param5 ^ -1)) {
                      break L21;
                    } else {
                      if (dg.field_T.length == 1) {
                        var12 = 1;
                        break L20;
                      } else {
                        break L21;
                      }
                    }
                  }
                  var13_ref_uo = var8_ref_uo__[var11 + 1];
                  if (param7) {
                    L22: {
                      L23: {
                        if (var13_ref_uo.field_Ib) {
                          break L23;
                        } else {
                          L24: {
                            if (var9 == 0) {
                              break L24;
                            } else {
                              if (!var13_ref_uo.field_pb) {
                                break L24;
                              } else {
                                break L23;
                              }
                            }
                          }
                          stackOut_45_0 = 0;
                          stackIn_46_0 = stackOut_45_0;
                          break L22;
                        }
                      }
                      stackOut_44_0 = 1;
                      stackIn_46_0 = stackOut_44_0;
                      break L22;
                    }
                    var12 = stackIn_46_0;
                    break L20;
                  } else {
                    L25: {
                      if (param5 == -1) {
                        if ((em.field_L.field_Nb ^ -1) != (dg.field_T[var11] ^ -1)) {
                          stackOut_38_0 = 0;
                          stackIn_39_0 = stackOut_38_0;
                          break L25;
                        } else {
                          stackOut_37_0 = 1;
                          stackIn_39_0 = stackOut_37_0;
                          break L25;
                        }
                      } else {
                        if ((em.field_L.field_tc[param5] & 255) != var11) {
                          stackOut_35_0 = 0;
                          stackIn_39_0 = stackOut_35_0;
                          break L25;
                        } else {
                          stackOut_34_0 = 1;
                          stackIn_39_0 = stackOut_34_0;
                          break L25;
                        }
                      }
                    }
                    var12 = stackIn_39_0;
                    break L20;
                  }
                }
                L26: {
                  if (var12 != 0) {
                    var10_int = 1;
                    sh.a(param0, param1, param2, false, param4, param5 - -1, param6, param7);
                    break L26;
                  } else {
                    break L26;
                  }
                }
                if (qk.field_b) {
                  return;
                } else {
                  var11++;
                  continue L14;
                }
              }
            }
          }
        }
        L27: {
          if (!param3) {
            break L27;
          } else {
            field_Q = null;
            break L27;
          }
        }
    }

    final static boolean h(byte param0) {
        int var1 = 26 % ((-52 - param0) / 32);
        return sm.field_C != null ? true : false;
    }

    public static void g(byte param0) {
        field_R = null;
        field_P = null;
        field_O = null;
        field_N = null;
        if (param0 != 118) {
            Object var2 = null;
            byte[] discarded$0 = sh.a((byte) 52, (byte[]) null, -94);
        }
        field_S = null;
        field_Q = null;
    }

    final void a(int param0, byte param1, int param2, int param3) {
        if (!(param0 == 0)) {
            return;
        }
        if (!(((sh) this).field_L != null)) {
            return;
        }
        int var5 = 53 % ((-42 - param1) / 53);
        if (-1 == (((sh) this).field_T ^ -1)) {
            return;
        }
        if (((sh) this).field_T == 256) {
            ((sh) this).field_L.a(param0, (byte) -128, param2 - -((sh) this).field_C, ((sh) this).field_D + param3);
            return;
        }
        dd var6 = new dd(((sh) this).field_L.field_l, ((sh) this).field_L.field_y);
        kj.a(110, var6);
        ((sh) this).field_L.a(param0, (byte) -126, 0, 0);
        oc.a(118);
        var6.a(param2 - -((sh) this).field_C, ((sh) this).field_D + param3, ((sh) this).field_T);
    }

    public sh() {
        super(0, 0, 0, 0, (fp) null, (cc) null);
        ((sh) this).field_T = 256;
    }

    final static int a(int param0, int param1, int param2, int param3) {
        if (param3 + (param1 + param0) <= qh.field_f) {
            return param3 + param1;
        }
        if ((-param0 + param1 ^ -1) <= param2) {
            return -param0 + param1;
        }
        return qh.field_f + -param0;
    }

    sh(ei param0) {
        super(param0.field_C, param0.field_D, param0.field_l, param0.field_y, (fp) null, (cc) null);
        param0.a(((sh) this).field_l, 0, ((sh) this).field_y, false, 0);
        ((sh) this).field_T = 256;
        ((sh) this).field_L = param0;
    }

    final static void a(di param0, byte param1, di param2) {
        rl.field_c = param2;
        bm.field_k = param0;
        if (param1 != -32) {
            field_N = null;
        }
    }

    final static byte[] a(byte param0, byte[] param1, int param2) {
        if (param0 < 25) {
            int discarded$0 = sh.a(-81, 49, -78, -118);
        }
        return sg.a(-116, param2, param1, (byte) 0);
    }

    final static void a(boolean param0, int param1, boolean param2, int param3, int param4, byte param5, int param6, int param7, boolean param8, int param9, boolean param10, boolean param11) {
        if (param5 != -12) {
            Object var13 = null;
            sh.a(-82, 16, -99, true, (kh) null, -40, 16, false);
        }
        rn.a(param1, param6, param11, param3, param10, param8, param2, param0, 16777215, param9, param4, param7, -124, 16777215);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_N = "You can spectate this game";
        field_O = new int[]{2, 20, 21, 49, 6, 5, 3, 9};
        field_S = "From only <%0>/month";
        field_R = "Wants to draw.";
    }
}
