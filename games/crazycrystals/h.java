/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class h {
    static int field_b;
    static int field_a;
    static int field_c;
    static dl[] field_d;

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
        ng var16 = null;
        ng var17 = null;
        byte[] var18 = null;
        byte[] var19 = null;
        byte[] var20 = null;
        byte[] var21 = null;
        byte[] var22 = null;
        byte[] var23 = null;
        byte[] var24 = null;
        byte[] var25 = null;
        int stackIn_39_0 = 0;
        int stackIn_40_0 = 0;
        int stackIn_41_0 = 0;
        int stackIn_41_1 = 0;
        int stackIn_53_0 = 0;
        int stackIn_54_0 = 0;
        int stackIn_55_0 = 0;
        int stackIn_55_1 = 0;
        int stackOut_38_0 = 0;
        int stackOut_40_0 = 0;
        int stackOut_40_1 = 0;
        int stackOut_39_0 = 0;
        int stackOut_39_1 = 0;
        int stackOut_52_0 = 0;
        int stackOut_54_0 = 0;
        int stackOut_54_1 = 0;
        int stackOut_53_0 = 0;
        int stackOut_53_1 = 0;
        L0: {
          var15 = CrazyCrystals.field_B;
          var16 = new ng(param0);
          var17 = var16;
          var17.field_f = -2 + param0.length;
          mg.field_a = var17.c((byte) -7);
          jm.field_a = new int[mg.field_a];
          uo.field_k = new int[mg.field_a];
          ng.field_g = new byte[mg.field_a][];
          rh.field_a = new boolean[mg.field_a];
          je.field_c = new int[mg.field_a];
          ui.field_c = new byte[mg.field_a][];
          uo.field_l = new int[mg.field_a];
          var17.field_f = param0.length - (7 - -(mg.field_a * 8));
          km.field_c = var17.c((byte) -7);
          if (param1) {
            break L0;
          } else {
            byte[] discarded$3 = h.a((byte) 24, 15);
            break L0;
          }
        }
        bo.field_o = var17.c((byte) -7);
        var3 = (255 & var17.h(255)) - -1;
        var4 = 0;
        L1: while (true) {
          L2: {
            if (mg.field_a <= var4) {
              break L2;
            } else {
              uo.field_k[var4] = var16.c((byte) -7);
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
              if (mg.field_a <= var4) {
                break L4;
              } else {
                jm.field_a[var4] = var16.c((byte) -7);
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
                if (mg.field_a <= var4) {
                  break L6;
                } else {
                  uo.field_l[var4] = var16.c((byte) -7);
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
                  if (var4 >= mg.field_a) {
                    break L8;
                  } else {
                    je.field_c[var4] = var16.c((byte) -7);
                    var4++;
                    if (0 == 0) {
                      continue L7;
                    } else {
                      break L8;
                    }
                  }
                }
                var17.field_f = -(mg.field_a * 8) + -7 + (param0.length + -(var3 * 3) - -3);
                gh.field_z = new int[var3];
                var4 = 1;
                L9: while (true) {
                  L10: {
                    if (var3 <= var4) {
                      break L10;
                    } else {
                      L11: {
                        gh.field_z[var4] = var16.b(false);
                        if ((gh.field_z[var4] ^ -1) != -1) {
                          break L11;
                        } else {
                          gh.field_z[var4] = 1;
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
                  var17.field_f = 0;
                  var4 = 0;
                  L12: while (true) {
                    L13: {
                      if (mg.field_a <= var4) {
                        break L13;
                      } else {
                        L14: {
                          L15: {
                            var5 = uo.field_l[var4];
                            var6 = je.field_c[var4];
                            var7 = var5 * var6;
                            var24 = new byte[var7];
                            var22 = var24;
                            var20 = var22;
                            var18 = var20;
                            var8 = var18;
                            ui.field_c[var4] = var24;
                            var25 = new byte[var7];
                            var23 = var25;
                            var21 = var23;
                            var19 = var21;
                            var9 = var19;
                            ng.field_g[var4] = var25;
                            var10 = 0;
                            var11 = var17.h(255);
                            if (0 == (1 & var11)) {
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
                                        if (var13 >= var6) {
                                          break L19;
                                        } else {
                                          var8[var12 - -(var13 * var5)] = var16.d((byte) -33);
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
                                if (0 == (2 & var11)) {
                                  break L14;
                                } else {
                                  var12 = 0;
                                  L20: while (true) {
                                    L21: {
                                      if (var5 <= var12) {
                                        break L21;
                                      } else {
                                        var13 = 0;
                                        L22: while (true) {
                                          L23: {
                                            if (var6 <= var13) {
                                              break L23;
                                            } else {
                                              L24: {
                                                byte dupTemp$4 = var16.d((byte) 119);
                                                var9[var13 * var5 + var12] = dupTemp$4;
                                                var14 = dupTemp$4;
                                                stackOut_38_0 = var10;
                                                stackIn_40_0 = stackOut_38_0;
                                                stackIn_39_0 = stackOut_38_0;
                                                if (var14 == -1) {
                                                  stackOut_40_0 = stackIn_40_0;
                                                  stackOut_40_1 = 0;
                                                  stackIn_41_0 = stackOut_40_0;
                                                  stackIn_41_1 = stackOut_40_1;
                                                  break L24;
                                                } else {
                                                  stackOut_39_0 = stackIn_39_0;
                                                  stackOut_39_1 = 1;
                                                  stackIn_41_0 = stackOut_39_0;
                                                  stackIn_41_1 = stackOut_39_1;
                                                  break L24;
                                                }
                                              }
                                              var10 = stackIn_41_0 | stackIn_41_1;
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
                                var8[var12] = var16.d((byte) 124);
                                var12++;
                                if (0 == 0) {
                                  continue L25;
                                } else {
                                  break L26;
                                }
                              }
                            }
                            if (-1 != (2 & var11 ^ -1)) {
                              var12 = 0;
                              L27: while (true) {
                                if (var7 <= var12) {
                                  break L14;
                                } else {
                                  L28: {
                                    byte dupTemp$5 = var16.d((byte) -113);
                                    var9[var12] = dupTemp$5;
                                    var13 = dupTemp$5;
                                    stackOut_52_0 = var10;
                                    stackIn_54_0 = stackOut_52_0;
                                    stackIn_53_0 = stackOut_52_0;
                                    if (0 == (var13 ^ -1)) {
                                      stackOut_54_0 = stackIn_54_0;
                                      stackOut_54_1 = 0;
                                      stackIn_55_0 = stackOut_54_0;
                                      stackIn_55_1 = stackOut_54_1;
                                      break L28;
                                    } else {
                                      stackOut_53_0 = stackIn_53_0;
                                      stackOut_53_1 = 1;
                                      stackIn_55_0 = stackOut_53_0;
                                      stackIn_55_1 = stackOut_53_1;
                                      break L28;
                                    }
                                  }
                                  var10 = stackIn_55_0 | stackIn_55_1;
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
                        rh.field_a[var4] = var10 != 0;
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

    public static void a(int param0) {
        field_d = null;
        if (param0 != 0) {
            h.a(-16);
        }
    }

    final synchronized static byte[] a(byte param0, int param1) {
        byte[] var2_ref_byte__ = null;
        int var2 = 0;
        byte[] var3 = null;
        L0: {
          if (-101 != (param1 ^ -1)) {
            break L0;
          } else {
            if (-1 <= (so.field_e ^ -1)) {
              break L0;
            } else {
              int fieldTemp$4 = so.field_e - 1;
              so.field_e = so.field_e - 1;
              var2_ref_byte__ = mn.field_i[fieldTemp$4];
              mn.field_i[so.field_e] = null;
              return var2_ref_byte__;
            }
          }
        }
        L1: {
          if (param1 != 5000) {
            break L1;
          } else {
            if ((je.field_e ^ -1) >= -1) {
              break L1;
            } else {
              byte[][] fieldTemp$5 = tg.field_e;
              int fieldTemp$6 = je.field_e - 1;
              je.field_e = je.field_e - 1;
              var2_ref_byte__ = fieldTemp$5[fieldTemp$6];
              tg.field_e[je.field_e] = null;
              return var2_ref_byte__;
            }
          }
        }
        L2: {
          if (param0 == 26) {
            break L2;
          } else {
            field_d = null;
            break L2;
          }
        }
        L3: {
          if ((param1 ^ -1) != -30001) {
            break L3;
          } else {
            if (-1 > (ed.field_z ^ -1)) {
              int fieldTemp$7 = ed.field_z - 1;
              ed.field_z = ed.field_z - 1;
              var2_ref_byte__ = oc.field_a[fieldTemp$7];
              oc.field_a[ed.field_z] = null;
              return var2_ref_byte__;
            } else {
              break L3;
            }
          }
        }
        L4: {
          if (null == lp.field_a) {
            break L4;
          } else {
            var2 = 0;
            L5: while (true) {
              if ((kk.field_e.length ^ -1) >= (var2 ^ -1)) {
                break L4;
              } else {
                L6: {
                  if ((kk.field_e[var2] ^ -1) != (param1 ^ -1)) {
                    break L6;
                  } else {
                    if ((jd.field_K[var2] ^ -1) >= -1) {
                      break L6;
                    } else {
                      jd.field_K[var2] = jd.field_K[var2] - 1;
                      var3 = lp.field_a[var2][jd.field_K[var2] - 1];
                      lp.field_a[var2][jd.field_K[var2]] = null;
                      return var3;
                    }
                  }
                }
                var2++;
                continue L5;
              }
            }
          }
        }
        return new byte[param1];
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        qd.a(-82, 50);
    }
}
