/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class tk extends nc {
    static int field_m;
    static cj field_l;
    static int field_n;
    static String field_o;
    static java.awt.Canvas field_q;
    private int field_p;

    private final void e(int param0) {
        if (param0 >= -88) {
            this.e(-105);
        }
        on.field_bb = new ki[63];
    }

    private final void b(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int stackIn_14_0 = 0;
        int stackIn_14_1 = 0;
        int stackIn_14_2 = 0;
        int stackIn_14_3 = 0;
        int stackIn_15_0 = 0;
        int stackIn_15_1 = 0;
        int stackIn_15_2 = 0;
        int stackIn_15_3 = 0;
        int stackIn_16_0 = 0;
        int stackIn_16_1 = 0;
        int stackIn_16_2 = 0;
        int stackIn_16_3 = 0;
        int stackIn_16_4 = 0;
        int stackOut_13_0 = 0;
        int stackOut_13_1 = 0;
        int stackOut_13_2 = 0;
        int stackOut_13_3 = 0;
        int stackOut_15_0 = 0;
        int stackOut_15_1 = 0;
        int stackOut_15_2 = 0;
        int stackOut_15_3 = 0;
        int stackOut_15_4 = 0;
        int stackOut_14_0 = 0;
        int stackOut_14_1 = 0;
        int stackOut_14_2 = 0;
        int stackOut_14_3 = 0;
        int stackOut_14_4 = 0;
        L0: {
          var9 = ZombieDawnMulti.field_E ? 1 : 0;
          if (param2 == -2939) {
            break L0;
          } else {
            field_o = (String) null;
            break L0;
          }
        }
        var4 = 0;
        L1: while (true) {
          L2: {
            if (var4 >= 3) {
              break L2;
            } else {
              var5 = var4 * 73;
              s.field_c.a(420 - -var5, 341);
              if (var9 != 0) {
                break L2;
              } else {
                L3: {
                  if (!s.field_c.b(var5 + 420, 341, bd.field_g, bo.field_d)) {
                    break L3;
                  } else {
                    q.field_d = 5 + var4;
                    break L3;
                  }
                }
                L4: {
                  var6 = ll.field_k.field_s[var4];
                  if (255 == var6) {
                    break L4;
                  } else {
                    if (-64 < (var6 ^ -1)) {
                      L5: {
                        var7 = ll.field_k.d(var6, param2 + 2992) ? 1 : 0;
                        wa.field_b[var6 + -18].g(429 + var5, 357);
                        var8 = ll.field_k.field_t[var6];
                        if (ll.field_k.d(var6, 53)) {
                          var8 = cr.a(var6, -97);
                          break L5;
                        } else {
                          break L5;
                        }
                      }
                      L6: {
                        var8 = var8 * 29 / cr.a(var6, -109);
                        stackOut_13_0 = 473 - -var5;
                        stackOut_13_1 = -var8 + 386;
                        stackOut_13_2 = 7;
                        stackOut_13_3 = var8;
                        stackIn_15_0 = stackOut_13_0;
                        stackIn_15_1 = stackOut_13_1;
                        stackIn_15_2 = stackOut_13_2;
                        stackIn_15_3 = stackOut_13_3;
                        stackIn_14_0 = stackOut_13_0;
                        stackIn_14_1 = stackOut_13_1;
                        stackIn_14_2 = stackOut_13_2;
                        stackIn_14_3 = stackOut_13_3;
                        if (var7 == 0) {
                          stackOut_15_0 = stackIn_15_0;
                          stackOut_15_1 = stackIn_15_1;
                          stackOut_15_2 = stackIn_15_2;
                          stackOut_15_3 = stackIn_15_3;
                          stackOut_15_4 = param1;
                          stackIn_16_0 = stackOut_15_0;
                          stackIn_16_1 = stackOut_15_1;
                          stackIn_16_2 = stackOut_15_2;
                          stackIn_16_3 = stackOut_15_3;
                          stackIn_16_4 = stackOut_15_4;
                          break L6;
                        } else {
                          stackOut_14_0 = stackIn_14_0;
                          stackOut_14_1 = stackIn_14_1;
                          stackOut_14_2 = stackIn_14_2;
                          stackOut_14_3 = stackIn_14_3;
                          stackOut_14_4 = param0;
                          stackIn_16_0 = stackOut_14_0;
                          stackIn_16_1 = stackOut_14_1;
                          stackIn_16_2 = stackOut_14_2;
                          stackIn_16_3 = stackOut_14_3;
                          stackIn_16_4 = stackOut_14_4;
                          break L6;
                        }
                      }
                      oo.e(stackIn_16_0, stackIn_16_1, stackIn_16_2, stackIn_16_3, stackIn_16_4);
                      if (!h.i(51603)) {
                        break L4;
                      } else {
                        if (!jk.a((byte) -70, var6)) {
                          break L4;
                        } else {
                          el.field_E.a(var5 + 419, 345);
                          break L4;
                        }
                      }
                    } else {
                      break L4;
                    }
                  }
                }
                var4++;
                if (var9 == 0) {
                  continue L1;
                } else {
                  break L2;
                }
              }
            }
          }
          return;
        }
    }

    final void a(boolean param0) {
        int discarded$2 = 0;
        int discarded$3 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        Object var6 = null;
        int var7 = 0;
        int stackIn_3_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_32_0 = 0;
        int stackIn_32_1 = 0;
        int stackIn_32_2 = 0;
        int stackIn_32_3 = 0;
        int stackIn_33_0 = 0;
        int stackIn_33_1 = 0;
        int stackIn_33_2 = 0;
        int stackIn_33_3 = 0;
        int stackIn_34_0 = 0;
        int stackIn_34_1 = 0;
        int stackIn_34_2 = 0;
        int stackIn_34_3 = 0;
        int stackIn_34_4 = 0;
        int stackIn_35_0 = 0;
        int stackIn_35_1 = 0;
        int stackIn_35_2 = 0;
        int stackIn_35_3 = 0;
        int stackIn_36_0 = 0;
        int stackIn_36_1 = 0;
        int stackIn_36_2 = 0;
        int stackIn_36_3 = 0;
        int stackIn_37_0 = 0;
        int stackIn_37_1 = 0;
        int stackIn_37_2 = 0;
        int stackIn_37_3 = 0;
        int stackIn_37_4 = 0;
        int stackOut_2_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_31_1 = 0;
        int stackOut_31_2 = 0;
        int stackOut_31_3 = 0;
        int stackOut_33_0 = 0;
        int stackOut_33_1 = 0;
        int stackOut_33_2 = 0;
        int stackOut_33_3 = 0;
        int stackOut_33_4 = 0;
        int stackOut_32_0 = 0;
        int stackOut_32_1 = 0;
        int stackOut_32_2 = 0;
        int stackOut_32_3 = 0;
        int stackOut_32_4 = 0;
        int stackOut_34_0 = 0;
        int stackOut_34_1 = 0;
        int stackOut_34_2 = 0;
        int stackOut_34_3 = 0;
        int stackOut_36_0 = 0;
        int stackOut_36_1 = 0;
        int stackOut_36_2 = 0;
        int stackOut_36_3 = 0;
        int stackOut_36_4 = 0;
        int stackOut_35_0 = 0;
        int stackOut_35_1 = 0;
        int stackOut_35_2 = 0;
        int stackOut_35_3 = 0;
        int stackOut_35_4 = 0;
        var7 = ZombieDawnMulti.field_E ? 1 : 0;
        super.a(param0);
        b.field_a.a(41, b.field_a.field_zb, 850, wa.field_g);
        b.field_a.c(false, -1);
        cp.field_O = -1;
        kn.field_b = -1;
        q.field_d = -1;
        oo.h(0, 53, 640, 85);
        var2 = 112;
        var3 = 0;
        L0: while (true) {
          L1: {
            L2: {
              if (var3 >= 3) {
                break L2;
              } else {
                stackOut_2_0 = bo.field_d;
                stackIn_16_0 = stackOut_2_0;
                stackIn_3_0 = stackOut_2_0;
                if (var7 != 0) {
                  break L1;
                } else {
                  L3: {
                    if (stackIn_3_0 < 43) {
                      break L3;
                    } else {
                      if ((bo.field_d ^ -1) < -79) {
                        break L3;
                      } else {
                        if ((var2 ^ -1) < (bd.field_g ^ -1)) {
                          break L3;
                        } else {
                          if (var2 + 120 < bd.field_g) {
                            break L3;
                          } else {
                            kn.field_b = var3;
                            break L3;
                          }
                        }
                      }
                    }
                  }
                  L4: {
                    L5: {
                      if (var3 == ao.field_d) {
                        break L5;
                      } else {
                        L6: {
                          if (var3 != kn.field_b) {
                            break L6;
                          } else {
                            if (ud.field_S) {
                              break L6;
                            } else {
                              var6_int = 3884288;
                              var5 = 3202868;
                              var4 = 16768544;
                              if (var7 == 0) {
                                break L4;
                              } else {
                                break L6;
                              }
                            }
                          }
                        }
                        var4 = 8886132;
                        var6_int = 1774864;
                        var5 = 44800;
                        if (var7 == 0) {
                          break L4;
                        } else {
                          break L5;
                        }
                      }
                    }
                    var5 = 65280;
                    var4 = 16768512;
                    var6_int = 1783040;
                    break L4;
                  }
                  oo.e(var2, 43, 120, 35, 10, var4);
                  oo.a(var2 - -2, 45, 116, 31, 10, var5, var6_int);
                  pb.field_e.b(fl.field_b[var3], 60 + var2, 69, 16646020, -1);
                  var2 += 141;
                  var3++;
                  if (var7 == 0) {
                    continue L0;
                  } else {
                    break L2;
                  }
                }
              }
            }
            this.a(56, 86, 172, 18, (byte) -92);
            var3 = 0;
            stackOut_15_0 = 0;
            stackIn_16_0 = stackOut_15_0;
            break L1;
          }
          L7: {
            var4 = stackIn_16_0;
            var5 = 0;
            if (-256 != (lh.field_l ^ -1)) {
              L8: {
                L9: {
                  if (32 > lh.field_l) {
                    break L9;
                  } else {
                    if (-39 > (lh.field_l ^ -1)) {
                      break L9;
                    } else {
                      stackOut_20_0 = 1;
                      stackIn_22_0 = stackOut_20_0;
                      break L8;
                    }
                  }
                }
                stackOut_21_0 = 0;
                stackIn_22_0 = stackOut_21_0;
                break L8;
              }
              L10: {
                L11: {
                  var5 = stackIn_22_0;
                  if (lh.field_l < 44) {
                    break L11;
                  } else {
                    if ((lh.field_l ^ -1) < -63) {
                      break L11;
                    } else {
                      stackOut_24_0 = 1;
                      stackIn_26_0 = stackOut_24_0;
                      break L10;
                    }
                  }
                }
                stackOut_25_0 = 0;
                stackIn_26_0 = stackOut_25_0;
                break L10;
              }
              L12: {
                L13: {
                  var4 = stackIn_26_0;
                  if (lh.field_l < 0) {
                    break L13;
                  } else {
                    if ((lh.field_l ^ -1) <= -20) {
                      break L13;
                    } else {
                      stackOut_28_0 = 1;
                      stackIn_30_0 = stackOut_28_0;
                      break L12;
                    }
                  }
                }
                stackOut_29_0 = 0;
                stackIn_30_0 = stackOut_29_0;
                break L12;
              }
              var3 = stackIn_30_0;
              break L7;
            } else {
              break L7;
            }
          }
          L14: {
            stackOut_31_0 = 7;
            stackOut_31_1 = 337;
            stackOut_31_2 = 328;
            stackOut_31_3 = 80;
            stackIn_33_0 = stackOut_31_0;
            stackIn_33_1 = stackOut_31_1;
            stackIn_33_2 = stackOut_31_2;
            stackIn_33_3 = stackOut_31_3;
            stackIn_32_0 = stackOut_31_0;
            stackIn_32_1 = stackOut_31_1;
            stackIn_32_2 = stackOut_31_2;
            stackIn_32_3 = stackOut_31_3;
            if (var3 != 0) {
              stackOut_33_0 = stackIn_33_0;
              stackOut_33_1 = stackIn_33_1;
              stackOut_33_2 = stackIn_33_2;
              stackOut_33_3 = stackIn_33_3;
              stackOut_33_4 = 16711680;
              stackIn_34_0 = stackOut_33_0;
              stackIn_34_1 = stackOut_33_1;
              stackIn_34_2 = stackOut_33_2;
              stackIn_34_3 = stackOut_33_3;
              stackIn_34_4 = stackOut_33_4;
              break L14;
            } else {
              stackOut_32_0 = stackIn_32_0;
              stackOut_32_1 = stackIn_32_1;
              stackOut_32_2 = stackIn_32_2;
              stackOut_32_3 = stackIn_32_3;
              stackOut_32_4 = 0;
              stackIn_34_0 = stackOut_32_0;
              stackIn_34_1 = stackOut_32_1;
              stackIn_34_2 = stackOut_32_2;
              stackIn_34_3 = stackOut_32_3;
              stackIn_34_4 = stackOut_32_4;
              break L14;
            }
          }
          L15: {
            oo.f(stackIn_34_0, stackIn_34_1, stackIn_34_2, stackIn_34_3, stackIn_34_4, 128);
            stackOut_34_0 = 337;
            stackOut_34_1 = 337;
            stackOut_34_2 = 296;
            stackOut_34_3 = 80;
            stackIn_36_0 = stackOut_34_0;
            stackIn_36_1 = stackOut_34_1;
            stackIn_36_2 = stackOut_34_2;
            stackIn_36_3 = stackOut_34_3;
            stackIn_35_0 = stackOut_34_0;
            stackIn_35_1 = stackOut_34_1;
            stackIn_35_2 = stackOut_34_2;
            stackIn_35_3 = stackOut_34_3;
            if (var4 == 0) {
              stackOut_36_0 = stackIn_36_0;
              stackOut_36_1 = stackIn_36_1;
              stackOut_36_2 = stackIn_36_2;
              stackOut_36_3 = stackIn_36_3;
              stackOut_36_4 = 0;
              stackIn_37_0 = stackOut_36_0;
              stackIn_37_1 = stackOut_36_1;
              stackIn_37_2 = stackOut_36_2;
              stackIn_37_3 = stackOut_36_3;
              stackIn_37_4 = stackOut_36_4;
              break L15;
            } else {
              stackOut_35_0 = stackIn_35_0;
              stackOut_35_1 = stackIn_35_1;
              stackOut_35_2 = stackIn_35_2;
              stackOut_35_3 = stackIn_35_3;
              stackOut_35_4 = 16711680;
              stackIn_37_0 = stackOut_35_0;
              stackIn_37_1 = stackOut_35_1;
              stackIn_37_2 = stackOut_35_2;
              stackIn_37_3 = stackOut_35_3;
              stackIn_37_4 = stackOut_35_4;
              break L15;
            }
          }
          L16: {
            oo.f(stackIn_37_0, stackIn_37_1, stackIn_37_2, stackIn_37_3, stackIn_37_4, 128);
            oo.a(9, 339, 74, 76, 0);
            oo.a(10, 340, 72, 74, 6575425, 3354915);
            oo.a(339, 339, 74, 76, 0);
            oo.a(340, 340, 72, 74, 1989419, 597262);
            discarded$2 = qp.field_w.a(ve.field_a, 10, 340, 72, 74, 16777215, -1, 1, 1, 0);
            discarded$3 = qp.field_w.a(en.field_f, 339, 339, 72, 74, 16777215, -1, 1, 1, 0);
            this.a(var5 != 0, (byte) -120, 14680064, 53248);
            this.b(14680064, 53248, -2939);
            this.d((byte) -104);
            this.e((byte) -67);
            if (-256 == (lh.field_l ^ -1)) {
              break L16;
            } else {
              L17: {
                L18: {
                  var6 = null;
                  if (lh.field_l < 0) {
                    break L18;
                  } else {
                    if ((lh.field_l ^ -1) > -20) {
                      var6 = wa.field_b[lh.field_l];
                      break L17;
                    } else {
                      break L18;
                    }
                  }
                }
                L19: {
                  if (32 > lh.field_l) {
                    break L19;
                  } else {
                    if (lh.field_l <= 38) {
                      var6 = wa.field_b[lh.field_l + -32 - -19];
                      break L17;
                    } else {
                      break L19;
                    }
                  }
                }
                if (lh.field_l < 44) {
                  break L17;
                } else {
                  if (lh.field_l > 62) {
                    break L17;
                  } else {
                    var6 = wa.field_b[-44 + (lh.field_l + 26)];
                    break L17;
                  }
                }
              }
              if (var6 == null) {
                break L16;
              } else {
                ((ja) (var6)).c(bd.field_g + -8, bo.field_d - 8, 200);
                break L16;
              }
            }
          }
          return;
        }
    }

    final void c(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int[] var11 = null;
        int[] var12 = null;
        int stackIn_3_0 = 0;
        boolean stackIn_17_0 = false;
        int stackIn_26_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        boolean stackOut_16_0 = false;
        int stackOut_25_0 = 0;
        L0: {
          var10 = ZombieDawnMulti.field_E ? 1 : 0;
          if ((kj.field_q ^ -1) > -3) {
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 1;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          L2: {
            L3: {
              L4: {
                L5: {
                  var2 = stackIn_3_0;
                  var7 = sj.field_p;
                  if (var7 == 1) {
                    if (var2 == 0) {
                      break L3;
                    } else {
                      var4 = 8;
                      var7 = 0;
                      L6: while (true) {
                        L7: {
                          L8: {
                            if (var7 >= 5) {
                              break L8;
                            } else {
                              var3 = ll.field_k.field_m[var7];
                              stackOut_16_0 = ll.field_k.c(127, var3);
                              stackIn_26_0 = stackOut_16_0 ? 1 : 0;
                              stackIn_17_0 = stackOut_16_0;
                              if (var10 != 0) {
                                break L7;
                              } else {
                                L9: {
                                  if (!stackIn_17_0) {
                                    break L9;
                                  } else {
                                    if (!ll.field_k.d(var3, 53)) {
                                      ll.field_k.a(34, var4, var3);
                                      break L9;
                                    } else {
                                      break L9;
                                    }
                                  }
                                }
                                L10: {
                                  var3 = ll.field_k.field_g[var7];
                                  if (!ll.field_k.c(127, var3)) {
                                    break L10;
                                  } else {
                                    if (ll.field_k.d(var3, 53)) {
                                      break L10;
                                    } else {
                                      ll.field_k.a(-88, var4, var3);
                                      break L10;
                                    }
                                  }
                                }
                                var7++;
                                if (var10 == 0) {
                                  continue L6;
                                } else {
                                  break L8;
                                }
                              }
                            }
                          }
                          stackOut_25_0 = 0;
                          stackIn_26_0 = stackOut_25_0;
                          break L7;
                        }
                        var7 = stackIn_26_0;
                        L11: while (true) {
                          L12: {
                            L13: {
                              if ((var7 ^ -1) <= -4) {
                                break L13;
                              } else {
                                var3 = ll.field_k.field_s[var7];
                                if (var10 != 0) {
                                  break L12;
                                } else {
                                  L14: {
                                    if (!ll.field_k.c(127, var3)) {
                                      break L14;
                                    } else {
                                      if (!ll.field_k.d(var3, 53)) {
                                        ll.field_k.a(-98, var4, var3);
                                        break L14;
                                      } else {
                                        break L14;
                                      }
                                    }
                                  }
                                  var7++;
                                  if (var10 == 0) {
                                    continue L11;
                                  } else {
                                    break L13;
                                  }
                                }
                              }
                            }
                            this.e(-100);
                            break L12;
                          }
                          if (var10 == 0) {
                            break L3;
                          } else {
                            break L5;
                          }
                        }
                      }
                    }
                  } else {
                    if (10 == var7) {
                      break L5;
                    } else {
                      L15: {
                        if (11 != var7) {
                          break L15;
                        } else {
                          if (var10 == 0) {
                            break L4;
                          } else {
                            break L15;
                          }
                        }
                      }
                      L16: {
                        if ((var7 ^ -1) != -6) {
                          break L16;
                        } else {
                          if (var10 == 0) {
                            if (var2 == 0) {
                              break L3;
                            } else {
                              var6 = new int[]{58, 0, 53, 59, 8, 32, 3, 52, 9, 2, 56, 10, 51, 1, 61, 60, 4, 54, 57, 34, 55, 50, 11, 49, 33, 7, 16};
                              var11 = var6;
                              var8 = 0;
                              L17: while (true) {
                                if (var11.length <= var8) {
                                  break L3;
                                } else {
                                  var9 = var11[var8];
                                  ll.field_k.a(-86, 9999, var9);
                                  var8++;
                                  if (var10 != 0) {
                                    break L1;
                                  } else {
                                    if (var10 == 0) {
                                      continue L17;
                                    } else {
                                      break L3;
                                    }
                                  }
                                }
                              }
                            }
                          } else {
                            break L16;
                          }
                        }
                      }
                      if (var7 == 12) {
                        L18: {
                          if (var2 != 0) {
                            break L18;
                          } else {
                            if (var10 == 0) {
                              break L3;
                            } else {
                              break L18;
                            }
                          }
                        }
                        ll.field_k.e(-6821, 33);
                        ll.field_k.e(-6821, 2);
                        ll.field_k.e(-6821, 57);
                        ll.field_k.e(-6821, 0);
                        ll.field_k.e(-6821, 1);
                        ll.field_k.e(-6821, 58);
                        ll.field_k.c((byte) -93);
                        ll.field_k.e(-6821, 16);
                        var7 = 0;
                        L19: while (true) {
                          L20: {
                            L21: {
                              if (-20 >= (var7 ^ -1)) {
                                break L21;
                              } else {
                                ll.field_k.e(-6821, var7);
                                var7++;
                                if (var10 != 0) {
                                  break L20;
                                } else {
                                  if (var10 == 0) {
                                    continue L19;
                                  } else {
                                    break L21;
                                  }
                                }
                              }
                            }
                            var7 = 44;
                            break L20;
                          }
                          L22: while (true) {
                            L23: {
                              L24: {
                                if ((var7 ^ -1) <= -63) {
                                  break L24;
                                } else {
                                  ll.field_k.e(-6821, var7);
                                  var7++;
                                  if (var10 != 0) {
                                    break L23;
                                  } else {
                                    if (var10 == 0) {
                                      continue L22;
                                    } else {
                                      break L24;
                                    }
                                  }
                                }
                              }
                              var7 = 32;
                              break L23;
                            }
                            L25: while (true) {
                              L26: {
                                if (var7 > 38) {
                                  break L26;
                                } else {
                                  ll.field_k.e(-6821, var7);
                                  var7++;
                                  if (var10 != 0) {
                                    break L2;
                                  } else {
                                    if (var10 == 0) {
                                      continue L25;
                                    } else {
                                      break L26;
                                    }
                                  }
                                }
                              }
                              this.e(-109);
                              break L3;
                            }
                          }
                        }
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                L27: {
                  if (var2 != 0) {
                    break L27;
                  } else {
                    if (var10 == 0) {
                      break L3;
                    } else {
                      break L27;
                    }
                  }
                }
                L28: {
                  var5 = hp.a((byte) 29, g.field_a, 63);
                  if (!ll.field_k.c(127, var5)) {
                    break L28;
                  } else {
                    if (ll.field_k.d(var5, 53)) {
                      break L28;
                    } else {
                      ll.field_k.a(40, 10, var5);
                      this.e(-125);
                      break L28;
                    }
                  }
                }
                L29: {
                  var5 = hp.a((byte) -77, g.field_a, 63);
                  if (!ll.field_k.c(127, var5)) {
                    break L29;
                  } else {
                    if (!ll.field_k.d(var5, 53)) {
                      ll.field_k.a(-106, 10, var5);
                      this.e(-106);
                      break L29;
                    } else {
                      break L29;
                    }
                  }
                }
                L30: {
                  var5 = hp.a((byte) -74, g.field_a, 63);
                  if (!ll.field_k.c(127, var5)) {
                    break L30;
                  } else {
                    if (ll.field_k.d(var5, 53)) {
                      break L30;
                    } else {
                      ll.field_k.a(91, 10, var5);
                      this.e(-95);
                      break L30;
                    }
                  }
                }
                L31: {
                  var5 = hp.a((byte) -91, g.field_a, 63);
                  if (!ll.field_k.c(127, var5)) {
                    break L31;
                  } else {
                    if (ll.field_k.d(var5, 53)) {
                      break L31;
                    } else {
                      ll.field_k.a(117, 10, var5);
                      this.e(-121);
                      break L31;
                    }
                  }
                }
                L32: {
                  var5 = hp.a((byte) 123, g.field_a, 63);
                  if (!ll.field_k.c(127, var5)) {
                    break L32;
                  } else {
                    if (!ll.field_k.d(var5, 53)) {
                      ll.field_k.a(125, 10, var5);
                      this.e(-122);
                      break L32;
                    } else {
                      break L32;
                    }
                  }
                }
                L33: {
                  var5 = hp.a((byte) -115, g.field_a, 63);
                  if (!ll.field_k.c(127, var5)) {
                    break L33;
                  } else {
                    if (!ll.field_k.d(var5, 53)) {
                      ll.field_k.a(-100, 10, var5);
                      this.e(-90);
                      break L33;
                    } else {
                      break L33;
                    }
                  }
                }
                L34: {
                  var5 = hp.a((byte) -69, g.field_a, 63);
                  if (!ll.field_k.c(127, var5)) {
                    break L34;
                  } else {
                    if (!ll.field_k.d(var5, 53)) {
                      ll.field_k.a(56, 10, var5);
                      this.e(-100);
                      break L34;
                    } else {
                      break L34;
                    }
                  }
                }
                L35: {
                  var5 = hp.a((byte) -125, g.field_a, 63);
                  if (!ll.field_k.c(127, var5)) {
                    break L35;
                  } else {
                    if (ll.field_k.d(var5, 53)) {
                      break L35;
                    } else {
                      ll.field_k.a(97, 10, var5);
                      this.e(-117);
                      break L35;
                    }
                  }
                }
                L36: {
                  var5 = hp.a((byte) 82, g.field_a, 63);
                  if (!ll.field_k.c(127, var5)) {
                    break L36;
                  } else {
                    if (ll.field_k.d(var5, 53)) {
                      break L36;
                    } else {
                      ll.field_k.a(76, 10, var5);
                      this.e(-101);
                      break L36;
                    }
                  }
                }
                L37: {
                  var5 = hp.a((byte) 104, g.field_a, 63);
                  if (!ll.field_k.c(127, var5)) {
                    break L37;
                  } else {
                    if (!ll.field_k.d(var5, 53)) {
                      ll.field_k.a(76, 10, var5);
                      this.e(-109);
                      break L37;
                    } else {
                      break L37;
                    }
                  }
                }
                L38: {
                  var5 = hp.a((byte) -85, g.field_a, 63);
                  if (!ll.field_k.c(127, var5)) {
                    break L38;
                  } else {
                    if (!ll.field_k.d(var5, 53)) {
                      ll.field_k.a(-100, 10, var5);
                      this.e(-92);
                      break L38;
                    } else {
                      break L38;
                    }
                  }
                }
                ll.field_k.c((byte) -108);
                if (var10 == 0) {
                  break L3;
                } else {
                  break L4;
                }
              }
              L39: {
                if (var2 != 0) {
                  break L39;
                } else {
                  if (var10 == 0) {
                    break L3;
                  } else {
                    break L39;
                  }
                }
              }
              ll.field_k.field_f = 0L;
              ll.field_k.field_n = ej.a((byte) 120);
              var7 = 0;
              L40: while (true) {
                L41: {
                  L42: {
                    if ((ll.field_k.field_t.length ^ -1) >= (var7 ^ -1)) {
                      break L42;
                    } else {
                      ll.field_k.field_t[var7] = 0;
                      var7++;
                      if (var10 != 0) {
                        break L41;
                      } else {
                        if (var10 == 0) {
                          continue L40;
                        } else {
                          break L42;
                        }
                      }
                    }
                  }
                  this.e(-100);
                  break L41;
                }
                if (var10 == 0) {
                  break L3;
                } else {
                  if (var2 == 0) {
                    break L3;
                  } else {
                    var6 = new int[]{58, 0, 53, 59, 8, 32, 3, 52, 9, 2, 56, 10, 51, 1, 61, 60, 4, 54, 57, 34, 55, 50, 11, 49, 33, 7, 16};
                    var12 = var6;
                    var8 = 0;
                    L43: while (true) {
                      if (var12.length <= var8) {
                        break L3;
                      } else {
                        var9 = var12[var8];
                        ll.field_k.a(-86, 9999, var9);
                        var8++;
                        if (var10 != 0) {
                          break L1;
                        } else {
                          if (var10 == 0) {
                            continue L43;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
            super.c(param0);
            break L2;
          }
          break L1;
        }
    }

    private final void a(boolean param0, byte param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int stackIn_20_0 = 0;
        int stackIn_20_1 = 0;
        int stackIn_20_2 = 0;
        int stackIn_20_3 = 0;
        int stackIn_21_0 = 0;
        int stackIn_21_1 = 0;
        int stackIn_21_2 = 0;
        int stackIn_21_3 = 0;
        int stackIn_22_0 = 0;
        int stackIn_22_1 = 0;
        int stackIn_22_2 = 0;
        int stackIn_22_3 = 0;
        int stackIn_22_4 = 0;
        int stackIn_30_0 = 0;
        int stackIn_30_1 = 0;
        int stackIn_30_2 = 0;
        int stackIn_30_3 = 0;
        int stackIn_31_0 = 0;
        int stackIn_31_1 = 0;
        int stackIn_31_2 = 0;
        int stackIn_31_3 = 0;
        int stackIn_32_0 = 0;
        int stackIn_32_1 = 0;
        int stackIn_32_2 = 0;
        int stackIn_32_3 = 0;
        int stackIn_32_4 = 0;
        int stackOut_19_0 = 0;
        int stackOut_19_1 = 0;
        int stackOut_19_2 = 0;
        int stackOut_19_3 = 0;
        int stackOut_21_0 = 0;
        int stackOut_21_1 = 0;
        int stackOut_21_2 = 0;
        int stackOut_21_3 = 0;
        int stackOut_21_4 = 0;
        int stackOut_20_0 = 0;
        int stackOut_20_1 = 0;
        int stackOut_20_2 = 0;
        int stackOut_20_3 = 0;
        int stackOut_20_4 = 0;
        int stackOut_29_0 = 0;
        int stackOut_29_1 = 0;
        int stackOut_29_2 = 0;
        int stackOut_29_3 = 0;
        int stackOut_31_0 = 0;
        int stackOut_31_1 = 0;
        int stackOut_31_2 = 0;
        int stackOut_31_3 = 0;
        int stackOut_31_4 = 0;
        int stackOut_30_0 = 0;
        int stackOut_30_1 = 0;
        int stackOut_30_2 = 0;
        int stackOut_30_3 = 0;
        int stackOut_30_4 = 0;
        var13 = ZombieDawnMulti.field_E ? 1 : 0;
        var5 = ll.field_k.g((byte) 125);
        var6 = 0;
        if (param1 == -120) {
          L0: while (true) {
            L1: {
              if (-6 >= (var6 ^ -1)) {
                break L1;
              } else {
                var7 = 50 * var6;
                if (var13 != 0) {
                  break L1;
                } else {
                  L2: {
                    if (!pf.field_a.b(84 + var7, 340, bd.field_g, bo.field_d)) {
                      break L2;
                    } else {
                      q.field_d = var6;
                      break L2;
                    }
                  }
                  L3: {
                    L4: {
                      if (var5 > var6) {
                        break L4;
                      } else {
                        pf.field_a.a(var7 + 84, 340, 32);
                        if (var13 == 0) {
                          break L3;
                        } else {
                          break L4;
                        }
                      }
                    }
                    L5: {
                      L6: {
                        L7: {
                          if (!param0) {
                            break L7;
                          } else {
                            if (pb.a(ll.field_k.field_m[var6], -20, lh.field_l)) {
                              break L6;
                            } else {
                              break L7;
                            }
                          }
                        }
                        pf.field_a.a(var7 + 84, 340);
                        if (var13 == 0) {
                          break L5;
                        } else {
                          break L6;
                        }
                      }
                      pf.field_a.a(var7 + 84, 340, 128, 8388608);
                      break L5;
                    }
                    L8: {
                      var8 = ll.field_k.field_m[var6];
                      var9 = ll.field_k.field_g[var6];
                      if (-256 == (var8 ^ -1)) {
                        break L8;
                      } else {
                        if (-64 >= (var8 ^ -1)) {
                          break L8;
                        } else {
                          L9: {
                            var10 = ll.field_k.d(var8, 53) ? 1 : 0;
                            var11 = ll.field_k.d(var9, param1 ^ -67) ? 1 : 0;
                            wa.field_b[var8].g(90 - -var7, 354);
                            var12 = ll.field_k.field_t[var8];
                            if (var10 == 0) {
                              break L9;
                            } else {
                              var12 = cr.a(var8, -111);
                              break L9;
                            }
                          }
                          L10: {
                            var12 = 28 * var12 / cr.a(var8, -112);
                            stackOut_19_0 = var7 + 120;
                            stackOut_19_1 = 378 - var12;
                            stackOut_19_2 = 8;
                            stackOut_19_3 = var12;
                            stackIn_21_0 = stackOut_19_0;
                            stackIn_21_1 = stackOut_19_1;
                            stackIn_21_2 = stackOut_19_2;
                            stackIn_21_3 = stackOut_19_3;
                            stackIn_20_0 = stackOut_19_0;
                            stackIn_20_1 = stackOut_19_1;
                            stackIn_20_2 = stackOut_19_2;
                            stackIn_20_3 = stackOut_19_3;
                            if (var10 != 0) {
                              stackOut_21_0 = stackIn_21_0;
                              stackOut_21_1 = stackIn_21_1;
                              stackOut_21_2 = stackIn_21_2;
                              stackOut_21_3 = stackIn_21_3;
                              stackOut_21_4 = param2;
                              stackIn_22_0 = stackOut_21_0;
                              stackIn_22_1 = stackOut_21_1;
                              stackIn_22_2 = stackOut_21_2;
                              stackIn_22_3 = stackOut_21_3;
                              stackIn_22_4 = stackOut_21_4;
                              break L10;
                            } else {
                              stackOut_20_0 = stackIn_20_0;
                              stackOut_20_1 = stackIn_20_1;
                              stackOut_20_2 = stackIn_20_2;
                              stackOut_20_3 = stackIn_20_3;
                              stackOut_20_4 = param3;
                              stackIn_22_0 = stackOut_20_0;
                              stackIn_22_1 = stackOut_20_1;
                              stackIn_22_2 = stackOut_20_2;
                              stackIn_22_3 = stackOut_20_3;
                              stackIn_22_4 = stackOut_20_4;
                              break L10;
                            }
                          }
                          oo.e(stackIn_22_0, stackIn_22_1, stackIn_22_2, stackIn_22_3, stackIn_22_4);
                          if ((var9 ^ -1) == -256) {
                            break L8;
                          } else {
                            if (63 > var9) {
                              L11: {
                                wa.field_b[-13 + var9].g(90 + var7, 384);
                                if (var6 != q.field_d) {
                                  break L11;
                                } else {
                                  break L11;
                                }
                              }
                              L12: {
                                var12 = ll.field_k.field_t[var9];
                                if (ll.field_k.d(var9, 53)) {
                                  var12 = cr.a(var9, param1 ^ 10);
                                  break L12;
                                } else {
                                  break L12;
                                }
                              }
                              L13: {
                                var12 = var12 * 28 / cr.a(var9, -115);
                                stackOut_29_0 = 120 - -var7;
                                stackOut_29_1 = -var12 + 410;
                                stackOut_29_2 = 8;
                                stackOut_29_3 = var12;
                                stackIn_31_0 = stackOut_29_0;
                                stackIn_31_1 = stackOut_29_1;
                                stackIn_31_2 = stackOut_29_2;
                                stackIn_31_3 = stackOut_29_3;
                                stackIn_30_0 = stackOut_29_0;
                                stackIn_30_1 = stackOut_29_1;
                                stackIn_30_2 = stackOut_29_2;
                                stackIn_30_3 = stackOut_29_3;
                                if (var11 != 0) {
                                  stackOut_31_0 = stackIn_31_0;
                                  stackOut_31_1 = stackIn_31_1;
                                  stackOut_31_2 = stackIn_31_2;
                                  stackOut_31_3 = stackIn_31_3;
                                  stackOut_31_4 = param2;
                                  stackIn_32_0 = stackOut_31_0;
                                  stackIn_32_1 = stackOut_31_1;
                                  stackIn_32_2 = stackOut_31_2;
                                  stackIn_32_3 = stackOut_31_3;
                                  stackIn_32_4 = stackOut_31_4;
                                  break L13;
                                } else {
                                  stackOut_30_0 = stackIn_30_0;
                                  stackOut_30_1 = stackIn_30_1;
                                  stackOut_30_2 = stackIn_30_2;
                                  stackOut_30_3 = stackIn_30_3;
                                  stackOut_30_4 = param3;
                                  stackIn_32_0 = stackOut_30_0;
                                  stackIn_32_1 = stackOut_30_1;
                                  stackIn_32_2 = stackOut_30_2;
                                  stackIn_32_3 = stackOut_30_3;
                                  stackIn_32_4 = stackOut_30_4;
                                  break L13;
                                }
                              }
                              oo.e(stackIn_32_0, stackIn_32_1, stackIn_32_2, stackIn_32_3, stackIn_32_4);
                              break L8;
                            } else {
                              break L8;
                            }
                          }
                        }
                      }
                    }
                    L14: {
                      if (!ll.field_k.a(45, -126)) {
                        break L14;
                      } else {
                        if (var8 == 255) {
                          break L14;
                        } else {
                          if (17 == var8) {
                            break L14;
                          } else {
                            el.field_E.a(84 - -var7, 340);
                            break L14;
                          }
                        }
                      }
                    }
                    if (!h.i(51603)) {
                      break L3;
                    } else {
                      L15: {
                        if (jk.a((byte) -51, var8)) {
                          break L15;
                        } else {
                          if (jk.a((byte) -103, var9)) {
                            break L15;
                          } else {
                            break L3;
                          }
                        }
                      }
                      el.field_E.a(84 + var7, 340);
                      break L3;
                    }
                  }
                  var6++;
                  if (var13 == 0) {
                    continue L0;
                  } else {
                    break L1;
                  }
                }
              }
            }
            return;
          }
        } else {
          return;
        }
    }

    final void a(int param0, boolean param1, int param2) {
        super.a(param0, param1, param2);
        this.e(-107);
        this.field_p = 0;
    }

    final void b(byte param0) {
        th.b((byte) -61);
        super.b(param0);
    }

    tk(int param0, boolean param1, int param2, int param3, int param4, int param5, int[] param6) {
        super(param0, param1, param2, param3, param4, param5, param6);
        RuntimeException runtimeException = null;
        ja var9 = null;
        int var10 = 0;
        int var11 = 0;
        ja var12 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        var11 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            on.field_bb = new ki[63];
            lh.field_l = 255;
            var12 = fq.field_k;
            var9 = fq.field_k.f();
            rq.field_u = new int[255];
            var10 = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (var10 >= 255) {
                    break L3;
                  } else {
                    rq.field_u[var10] = var10 * 65793;
                    var10++;
                    if (var11 != 0) {
                      break L2;
                    } else {
                      if (var11 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                bp.field_u.field_ab = wc.field_M;
                cr.field_i.field_ab = df.field_Q;
                b.field_a = new mj(0L, ih.field_d, var12, var9, bp.field_u, cr.field_i, false);
                b.field_a.field_Q = 315;
                b.field_a.field_zb = 631;
                this.field_p = 0;
                b.field_a.field_x = 5;
                b.field_a.field_z = 15;
                break L2;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            runtimeException = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (runtimeException);
            stackOut_7_1 = new StringBuilder().append("tk.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param6 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L4;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L4;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
    }

    private final void b(int param0, int param1, int param2, int param3, int param4, int param5) {
        if (param1 != -562798775) {
            this.field_p = 119;
        }
        int var7 = ((wf.field_m << -1066238943) / 3 - -(10 * param2)) % 29;
        int var8 = -var7 + 29;
        int var9 = q.a((byte) -126, (var7 << 1347089130) / 29) >> -562798775;
        int var10 = (var7 * param0 - -(param5 * var8) << 2099132868) / 29;
        int var11 = (param3 * var7 - -(var8 * param4) << 2052546500) / 29;
        oo.a(var10, var11, 64, var9, rq.field_u);
    }

    private final void e(byte param0) {
        int discarded$2 = 0;
        int discarded$3 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        rp var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        String var10 = null;
        ef var11 = null;
        int var12 = 0;
        int var13 = 0;
        String[] var14 = null;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        String var20 = null;
        int[] var24 = null;
        int stackIn_37_0 = 0;
        int stackIn_60_0 = 0;
        int stackIn_64_0 = 0;
        int stackOut_36_0 = 0;
        int stackOut_35_0 = 0;
        int stackOut_59_0 = 0;
        int stackOut_63_0 = 0;
        var19 = ZombieDawnMulti.field_E ? 1 : 0;
        if (!ud.field_S) {
          if (param0 == -67) {
            L0: {
              L1: {
                L2: {
                  var6 = ll.field_k;
                  var7 = -1;
                  var8 = -1;
                  if ((cp.field_O ^ -1) == -256) {
                    break L2;
                  } else {
                    if (0 != (cp.field_O ^ -1)) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                L3: {
                  L4: {
                    if (-6 < (q.field_d ^ -1)) {
                      break L4;
                    } else {
                      var7 = var6.field_s[-5 + q.field_d];
                      if (var19 == 0) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                  if (0 > q.field_d) {
                    break L3;
                  } else {
                    L5: {
                      if ((q.field_d ^ -1) <= (var6.g((byte) -80) ^ -1)) {
                        break L5;
                      } else {
                        var8 = var6.field_g[q.field_d];
                        var7 = var6.field_m[q.field_d];
                        if (var19 == 0) {
                          break L3;
                        } else {
                          break L5;
                        }
                      }
                    }
                    var7 = -2;
                    break L3;
                  }
                }
                if (!h.i(51603)) {
                  break L0;
                } else {
                  if (jk.a((byte) -51, var7)) {
                    var7 = -3;
                    if (var19 == 0) {
                      break L0;
                    } else {
                      break L1;
                    }
                  } else {
                    break L0;
                  }
                }
              }
              var7 = cp.field_O;
              break L0;
            }
            L6: {
              if (255 == var7) {
                var7 = -1;
                break L6;
              } else {
                break L6;
              }
            }
            L7: {
              if (-256 == (var8 ^ -1)) {
                var8 = -1;
                break L7;
              } else {
                break L7;
              }
            }
            L8: {
              L9: {
                if (-1 == var7) {
                  break L9;
                } else {
                  L10: {
                    if (gf.field_f != 0) {
                      break L10;
                    } else {
                      if (10 < b.a(true)) {
                        gf.field_f = gf.field_f + 1;
                        break L10;
                      } else {
                        break L10;
                      }
                    }
                  }
                  if (gf.field_f > 0) {
                    L11: {
                      gf.field_f = gf.field_f + 2;
                      if (255 < gf.field_f) {
                        gf.field_f = 255;
                        break L11;
                      } else {
                        break L11;
                      }
                    }
                    L12: {
                      if (!var6.c(127, var7)) {
                        stackOut_36_0 = 0;
                        stackIn_37_0 = stackOut_36_0;
                        break L12;
                      } else {
                        stackOut_35_0 = 1;
                        stackIn_37_0 = stackOut_35_0;
                        break L12;
                      }
                    }
                    L13: {
                      L14: {
                        var9 = stackIn_37_0;
                        if (var7 == -2) {
                          break L14;
                        } else {
                          L15: {
                            if (var7 == -3) {
                              break L15;
                            } else {
                              var20 = wq.field_g[var7][var9];
                              var10 = var20;
                              if (-1 != var8) {
                                var10 = var20 + ii.field_b + wq.field_g[var8][var9];
                                if (var19 == 0) {
                                  break L13;
                                } else {
                                  break L15;
                                }
                              } else {
                                break L13;
                              }
                            }
                          }
                          var10 = ik.field_b;
                          if (var19 == 0) {
                            break L13;
                          } else {
                            break L14;
                          }
                        }
                      }
                      var10 = vc.field_b;
                      break L13;
                    }
                    L16: {
                      var11 = qp.field_w;
                      var12 = var11.a(var10);
                      var13 = 8 * gf.field_f;
                      var4 = qp.field_w.field_w * (1 - -ro.a(-124, '<', (CharSequence) ((Object) var10)));
                      if (var13 > 255) {
                        var13 = 255;
                        break L16;
                      } else {
                        break L16;
                      }
                    }
                    L17: while (true) {
                      L18: {
                        if (400 >= var12) {
                          break L18;
                        } else {
                          var12 = var12 / 2;
                          var4 = var4 * 2;
                          if (var19 != 0) {
                            break L8;
                          } else {
                            if (var19 == 0) {
                              continue L17;
                            } else {
                              break L18;
                            }
                          }
                        }
                      }
                      var14 = new String[var11.b(var10, var12)];
                      var24 = new int[var14.length];
                      var16 = 0;
                      L19: while (true) {
                        L20: {
                          L21: {
                            if (var16 >= var14.length) {
                              break L21;
                            } else {
                              var24[var16] = var12;
                              var16++;
                              if (var19 != 0) {
                                break L20;
                              } else {
                                if (var19 == 0) {
                                  continue L19;
                                } else {
                                  break L21;
                                }
                              }
                            }
                          }
                          discarded$2 = var11.a(var10, var24, var14);
                          var16 = 0;
                          break L20;
                        }
                        var17 = 0;
                        L22: while (true) {
                          L23: {
                            L24: {
                              if ((var14.length ^ -1) >= (var17 ^ -1)) {
                                break L24;
                              } else {
                                var18 = var11.a(var14[var17]);
                                stackOut_59_0 = var16 ^ -1;
                                stackIn_64_0 = stackOut_59_0;
                                stackIn_60_0 = stackOut_59_0;
                                if (var19 != 0) {
                                  break L23;
                                } else {
                                  L25: {
                                    if (stackIn_60_0 <= (var18 ^ -1)) {
                                      break L25;
                                    } else {
                                      var16 = var18;
                                      break L25;
                                    }
                                  }
                                  var17++;
                                  if (var19 == 0) {
                                    continue L22;
                                  } else {
                                    break L24;
                                  }
                                }
                              }
                            }
                            stackOut_63_0 = var16;
                            stackIn_64_0 = stackOut_63_0;
                            break L23;
                          }
                          L26: {
                            L27: {
                              var5 = stackIn_64_0;
                              var4 = var14.length * qp.field_w.field_w;
                              var2 = bd.field_g;
                              var3 = 32 + bo.field_d;
                              if (var2 >= 0) {
                                break L27;
                              } else {
                                var2 = 0;
                                if (var19 == 0) {
                                  break L26;
                                } else {
                                  break L27;
                                }
                              }
                            }
                            if ((var5 + var2 ^ -1) < -636) {
                              var2 = -var5 + 640 + -5;
                              break L26;
                            } else {
                              break L26;
                            }
                          }
                          L28: {
                            if (var3 - -var4 > 475) {
                              var3 = -5 + (-var4 + 480);
                              break L28;
                            } else {
                              break L28;
                            }
                          }
                          oo.b(var2 - 2, -2 + var3, var5 - -8, var4 + 8, 4, 0, var13 / 2);
                          oo.b(-4 + var2, var3 + -4, 8 + var5, var4 + 8, 4, 5005603, var13);
                          discarded$3 = var11.a(var10, var2, var3, var5, var4, 16777215, 0, var13, 1, 1, 0);
                          if (var19 == 0) {
                            break L8;
                          } else {
                            break L9;
                          }
                        }
                      }
                    }
                  } else {
                    break L8;
                  }
                }
              }
              gf.field_f = 0;
              break L8;
            }
            return;
          } else {
            return;
          }
        } else {
          return;
        }
    }

    final static void a(hp param0, int param1, int param2) {
        ga var6 = null;
        int var4 = 0;
        int discarded$0 = 0;
        try {
            if (param1 < 13) {
                hp var5 = (hp) null;
                tk.a((hp) null, -88, 107);
            }
            var6 = ma.field_a;
            var6.b((byte) -35, param2);
            var6.field_j = var6.field_j + 1;
            var4 = var6.field_j;
            var6.a(121, 1);
            var6.a(127, param0.field_v);
            var6.c(param0.field_f, 0);
            var6.b(-118, param0.field_q);
            var6.b(92, param0.field_u);
            var6.b(-115, param0.field_r);
            var6.b(100, param0.field_n);
            discarded$0 = var6.f(var4, 115);
            var6.e(70, var6.field_j + -var4);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "tk.F(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void a(int param0, int param1, int param2, int param3, byte param4) {
        int[][] var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int[][] var25 = null;
        int[][] var26 = null;
        int[][] var29 = null;
        int[] var34 = null;
        int[] var35 = null;
        int stackIn_2_0 = 0;
        int stackIn_2_1 = 0;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        int stackIn_13_0 = 0;
        int stackIn_13_1 = 0;
        int stackIn_16_0 = 0;
        int stackIn_16_1 = 0;
        int stackIn_18_0 = 0;
        int stackIn_18_1 = 0;
        ki stackIn_21_0 = null;
        int stackIn_35_0 = 0;
        int stackIn_35_1 = 0;
        ki stackIn_42_0 = null;
        int stackOut_1_0 = 0;
        int stackOut_1_1 = 0;
        int stackOut_6_0 = 0;
        int stackOut_6_1 = 0;
        int stackOut_12_0 = 0;
        int stackOut_12_1 = 0;
        int stackOut_15_0 = 0;
        int stackOut_15_1 = 0;
        int stackOut_17_0 = 0;
        int stackOut_17_1 = 0;
        ki stackOut_20_0 = null;
        int stackOut_34_0 = 0;
        int stackOut_34_1 = 0;
        ki stackOut_41_0 = null;
        var24 = ZombieDawnMulti.field_E ? 1 : 0;
        oo.h(5, 54, 635, 330);
        var29 = em.field_Y[ao.field_d];
        var26 = var29;
        var25 = var26;
        var6 = var25;
        var7 = 0;
        var8 = -9 / ((-16 - param4) / 50);
        L0: while (true) {
          stackOut_1_0 = var7;
          stackOut_1_1 = var29.length;
          stackIn_2_0 = stackOut_1_0;
          stackIn_2_1 = stackOut_1_1;
          L1: while (true) {
            L2: {
              L3: {
                if (stackIn_2_0 >= stackIn_2_1) {
                  break L3;
                } else {
                  var34 = var29[var7];
                  var10 = var34.length;
                  if (var24 != 0) {
                    break L2;
                  } else {
                    var11 = 0;
                    L4: while (true) {
                      L5: {
                        L6: {
                          if ((var11 ^ -1) <= (var10 ^ -1)) {
                            break L6;
                          } else {
                            var12 = var34[var11];
                            stackOut_6_0 = var12;
                            stackOut_6_1 = 255;
                            stackIn_13_0 = stackOut_6_0;
                            stackIn_13_1 = stackOut_6_1;
                            stackIn_7_0 = stackOut_6_0;
                            stackIn_7_1 = stackOut_6_1;
                            if (var24 != 0) {
                              break L5;
                            } else {
                              L7: {
                                if (stackIn_7_0 == stackIn_7_1) {
                                  var10 = var11;
                                  if (var24 == 0) {
                                    break L6;
                                  } else {
                                    break L7;
                                  }
                                } else {
                                  break L7;
                                }
                              }
                              var11++;
                              if (var24 == 0) {
                                continue L4;
                              } else {
                                break L6;
                              }
                            }
                          }
                        }
                        var11 = (-var10 + var34.length) * param0 / 2;
                        stackOut_12_0 = 0;
                        stackOut_12_1 = var10;
                        stackIn_13_0 = stackOut_12_0;
                        stackIn_13_1 = stackOut_12_1;
                        break L5;
                      }
                      L8: {
                        if (stackIn_13_0 == stackIn_13_1) {
                          break L8;
                        } else {
                          var12 = 0;
                          L9: while (true) {
                            stackOut_15_0 = var10;
                            stackOut_15_1 = var12;
                            stackIn_16_0 = stackOut_15_0;
                            stackIn_16_1 = stackOut_15_1;
                            L10: while (true) {
                              if (stackIn_16_0 <= stackIn_16_1) {
                                break L8;
                              } else {
                                var13 = var34[var12];
                                stackOut_17_0 = 255;
                                stackOut_17_1 = var13;
                                stackIn_2_0 = stackOut_17_0;
                                stackIn_2_1 = stackOut_17_1;
                                stackIn_18_0 = stackOut_17_0;
                                stackIn_18_1 = stackOut_17_1;
                                if (var24 != 0) {
                                  continue L1;
                                } else {
                                  L11: {
                                    if (stackIn_18_0 == stackIn_18_1) {
                                      break L11;
                                    } else {
                                      if (!ll.field_k.g(var13, 4)) {
                                        break L11;
                                      } else {
                                        stackOut_20_0 = on.field_bb[var13];
                                        stackIn_21_0 = stackOut_20_0;
                                        L12: while (true) {
                                          L13: {
                                            if (stackIn_21_0 == null) {
                                              var14 = param3 + var7 * param2 - wa.field_g;
                                              var15 = var11 + param1 - -(var12 * param0);
                                              on.field_bb[var13] = new ki(var13, var14, var15);
                                              break L13;
                                            } else {
                                              break L13;
                                            }
                                          }
                                          L14: {
                                            on.field_bb[var13].field_q = -wa.field_g + (param3 - -(var7 * param2));
                                            on.field_bb[var13].a(true);
                                            if (!on.field_bb[var13].b((byte) 39)) {
                                              break L14;
                                            } else {
                                              if ((lh.field_l ^ -1) != -256) {
                                                break L14;
                                              } else {
                                                if (!ud.field_S) {
                                                  cp.field_O = var13;
                                                  on.field_bb[var13].field_b.e(on.field_bb[var13].field_q, on.field_bb[var13].field_g, (q.a((byte) -60, wf.field_m << -610265308) >> -522875959) + 128);
                                                  break L14;
                                                } else {
                                                  break L14;
                                                }
                                              }
                                            }
                                          }
                                          L15: {
                                            var14 = on.field_bb[var13].field_c;
                                            if (ll.field_k.g(var14, 4)) {
                                              break L15;
                                            } else {
                                              if (var24 == 0) {
                                                break L11;
                                              } else {
                                                break L15;
                                              }
                                            }
                                          }
                                          var35 = em.field_ab[var14];
                                          var16 = 0;
                                          L16: while (true) {
                                            if (var35.length <= var16) {
                                              break L11;
                                            } else {
                                              var17 = var35[var16];
                                              stackOut_34_0 = var17 ^ -1;
                                              stackOut_34_1 = -256;
                                              stackIn_16_0 = stackOut_34_0;
                                              stackIn_16_1 = stackOut_34_1;
                                              stackIn_35_0 = stackOut_34_0;
                                              stackIn_35_1 = stackOut_34_1;
                                              if (var24 != 0) {
                                                continue L10;
                                              } else {
                                                L17: {
                                                  L18: {
                                                    if (stackIn_35_0 != stackIn_35_1) {
                                                      break L18;
                                                    } else {
                                                      if (var24 == 0) {
                                                        break L17;
                                                      } else {
                                                        break L18;
                                                      }
                                                    }
                                                  }
                                                  if (!ll.field_k.g(var17, 4)) {
                                                    break L17;
                                                  } else {
                                                    var18 = -1;
                                                    var19 = 0;
                                                    L19: while (true) {
                                                      L20: {
                                                        if (var19 >= on.field_bb.length) {
                                                          break L20;
                                                        } else {
                                                          stackOut_41_0 = on.field_bb[var19];
                                                          stackIn_21_0 = stackOut_41_0;
                                                          stackIn_42_0 = stackOut_41_0;
                                                          if (var24 != 0) {
                                                            continue L12;
                                                          } else {
                                                            L21: {
                                                              if (stackIn_42_0 == null) {
                                                                break L21;
                                                              } else {
                                                                if ((var17 ^ -1) != (on.field_bb[var19].field_c ^ -1)) {
                                                                  break L21;
                                                                } else {
                                                                  var18 = var19;
                                                                  var19 = on.field_bb.length;
                                                                  break L21;
                                                                }
                                                              }
                                                            }
                                                            var19++;
                                                            if (var24 == 0) {
                                                              continue L19;
                                                            } else {
                                                              break L20;
                                                            }
                                                          }
                                                        }
                                                      }
                                                      if ((var18 ^ -1) == 0) {
                                                        break L17;
                                                      } else {
                                                        L22: {
                                                          if (on.field_bb[var18] != null) {
                                                            break L22;
                                                          } else {
                                                            if (var24 == 0) {
                                                              break L17;
                                                            } else {
                                                              break L22;
                                                            }
                                                          }
                                                        }
                                                        var19 = -3 + on.field_bb[var13].field_q;
                                                        var20 = on.field_bb[var13].field_b.field_w / 2 + on.field_bb[var13].field_g;
                                                        var21 = on.field_bb[var13].field_b.field_x + (on.field_bb[var18].field_q + 3);
                                                        var22 = on.field_bb[var13].field_b.field_w / 2 + on.field_bb[var18].field_g;
                                                        var23 = -1;
                                                        L23: while (true) {
                                                          L24: {
                                                            L25: {
                                                              L26: {
                                                                L27: {
                                                                  if (-2 >= (var23 ^ -1)) {
                                                                    break L27;
                                                                  } else {
                                                                    oo.g(var19, var20 + var23, var21, var23 + var22, 11528032);
                                                                    var23++;
                                                                    if (var24 != 0) {
                                                                      break L26;
                                                                    } else {
                                                                      if (var24 == 0) {
                                                                        continue L23;
                                                                      } else {
                                                                        break L27;
                                                                      }
                                                                    }
                                                                  }
                                                                }
                                                                if (ll.field_k.c(127, var14)) {
                                                                  break L26;
                                                                } else {
                                                                  break L25;
                                                                }
                                                              }
                                                              var23 = 0;
                                                              L28: while (true) {
                                                                if (var23 >= 3) {
                                                                  break L25;
                                                                } else {
                                                                  this.b(var19, -562798775, var23, var20, var22, var21);
                                                                  var23++;
                                                                  if (var24 != 0) {
                                                                    break L24;
                                                                  } else {
                                                                    if (var24 == 0) {
                                                                      continue L28;
                                                                    } else {
                                                                      break L25;
                                                                    }
                                                                  }
                                                                }
                                                              }
                                                            }
                                                            oo.a(var19, -4 + var20, 4, 9, 1);
                                                            oo.a(var19 - -1, -3 + var20, 2, 7, 11316396, 5066061);
                                                            oo.a(var21 + -4, -4 + var22, 4, 9, 1);
                                                            break L24;
                                                          }
                                                          oo.a(-3 + var21, -3 + var22, 2, 7, 11316396, 5066061);
                                                          break L17;
                                                        }
                                                      }
                                                    }
                                                  }
                                                }
                                                var16++;
                                                if (var24 == 0) {
                                                  continue L16;
                                                } else {
                                                  break L11;
                                                }
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                  var12++;
                                  if (var24 == 0) {
                                    continue L9;
                                  } else {
                                    break L8;
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                      var7++;
                      if (var24 == 0) {
                        continue L0;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
              }
              oo.c();
              break L2;
            }
            return;
          }
        }
    }

    public static void c(byte param0) {
        field_o = null;
        field_l = null;
        field_q = null;
        if (param0 >= -62) {
            hp var2 = (hp) null;
            tk.a((hp) null, -91, 7);
        }
    }

    private final void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        oo.h(param5, param2, param4 + param5 + (param1 << -124016383), (param1 << 139151681) + param2 + param0);
        o.field_h.c(param5, param2);
        oo.f(param5, param2, param4 - -(param1 << -2047811167), param0 + (param1 << 1921606209), 2560, 160);
        ak.a((param1 << 814062817) + param4, param0 - -(param1 << 840826433), -5, param5, param2);
        oo.c();
        if (param3 >= -55) {
            this.b((byte) 22);
        }
    }

    final void a(int param0) {
        uj discarded$11 = null;
        uj discarded$12 = null;
        uj discarded$13 = null;
        uj discarded$14 = null;
        uj discarded$15 = null;
        uj discarded$16 = null;
        uj discarded$17 = null;
        uj discarded$18 = null;
        uj discarded$19 = null;
        uj discarded$20 = null;
        uj discarded$21 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        rp var8 = null;
        rp var9 = null;
        int stackIn_6_0 = 0;
        boolean stackIn_11_0 = false;
        int stackIn_16_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_58_0 = 0;
        int stackIn_62_0 = 0;
        int stackIn_72_0 = 0;
        int stackIn_72_1 = 0;
        int stackIn_80_0 = 0;
        int stackIn_80_1 = 0;
        int stackIn_92_0 = 0;
        int stackIn_92_1 = 0;
        int stackIn_102_0 = 0;
        int stackIn_102_1 = 0;
        int stackIn_108_0 = 0;
        int stackIn_108_1 = 0;
        int stackIn_170_0 = 0;
        int stackIn_170_1 = 0;
        int stackIn_175_0 = 0;
        int stackIn_175_1 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        boolean stackOut_10_0 = false;
        int stackOut_15_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_57_0 = 0;
        int stackOut_56_0 = 0;
        int stackOut_61_0 = 0;
        int stackOut_60_0 = 0;
        int stackOut_91_0 = 0;
        int stackOut_91_1 = 0;
        int stackOut_71_0 = 0;
        int stackOut_71_1 = 0;
        int stackOut_79_0 = 0;
        int stackOut_79_1 = 0;
        int stackOut_101_0 = 0;
        int stackOut_101_1 = 0;
        int stackOut_107_0 = 0;
        int stackOut_107_1 = 0;
        int stackOut_169_0 = 0;
        int stackOut_169_1 = 0;
        int stackOut_174_0 = 0;
        int stackOut_174_1 = 0;
        L0: {
          L1: {
            var7 = ZombieDawnMulti.field_E ? 1 : 0;
            if (-601 < (bd.field_g ^ -1)) {
              break L1;
            } else {
              if (620 <= bd.field_g) {
                break L1;
              } else {
                if (-11 < (bo.field_d ^ -1)) {
                  break L1;
                } else {
                  if ((bo.field_d ^ -1) < -31) {
                    break L1;
                  } else {
                    stackOut_4_0 = 1;
                    stackIn_6_0 = stackOut_4_0;
                    break L0;
                  }
                }
              }
            }
          }
          stackOut_5_0 = 0;
          stackIn_6_0 = stackOut_5_0;
          break L0;
        }
        u.field_i = stackIn_6_0 != 0;
        if (ud.field_S) {
          this.field_p = this.field_p + 1;
          var2 = 0;
          var3 = 0;
          L2: while (true) {
            L3: {
              L4: {
                if ((var3 ^ -1) <= (lc.field_m.length ^ -1)) {
                  break L4;
                } else {
                  stackOut_10_0 = lc.field_m[var3];
                  stackIn_16_0 = stackOut_10_0 ? 1 : 0;
                  stackIn_11_0 = stackOut_10_0;
                  if (var7 != 0) {
                    break L3;
                  } else {
                    L5: {
                      if (stackIn_11_0) {
                        var2 = 1;
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    var3++;
                    if (var7 == 0) {
                      continue L2;
                    } else {
                      break L4;
                    }
                  }
                }
              }
              stackOut_15_0 = var2;
              stackIn_16_0 = stackOut_15_0;
              break L3;
            }
            L6: {
              if (stackIn_16_0 == 0) {
                break L6;
              } else {
                ud.field_S = false;
                break L6;
              }
            }
            L7: {
              if ((kd.field_b ^ -1) == -2) {
                ud.field_S = false;
                break L7;
              } else {
                break L7;
              }
            }
            return;
          }
        } else {
          L8: {
            this.field_p = 0;
            if (kd.field_b != 1) {
              break L8;
            } else {
              if (u.field_i) {
                L9: {
                  if (ud.field_S) {
                    stackOut_27_0 = 0;
                    stackIn_28_0 = stackOut_27_0;
                    break L9;
                  } else {
                    stackOut_26_0 = 1;
                    stackIn_28_0 = stackOut_26_0;
                    break L9;
                  }
                }
                ud.field_S = stackIn_28_0 != 0;
                this.field_p = 2000;
                break L8;
              } else {
                break L8;
              }
            }
          }
          L10: {
            super.a(param0 ^ 0);
            var8 = ll.field_k;
            var9 = var8;
            var3 = var9.g((byte) 123);
            en.a(param0 ^ -1, 4);
            if (lh.field_l == 255) {
              break L10;
            } else {
              if (0 == (q.field_d ^ -1)) {
                break L10;
              } else {
                L11: {
                  L12: {
                    if (lh.field_l < 44) {
                      break L12;
                    } else {
                      if (lh.field_l <= 62) {
                        break L11;
                      } else {
                        break L12;
                      }
                    }
                  }
                  L13: {
                    if (0 > lh.field_l) {
                      break L13;
                    } else {
                      if (-20 >= (lh.field_l ^ -1)) {
                        break L13;
                      } else {
                        if (var3 <= q.field_d) {
                          en.a(-1, 6);
                          if (var7 == 0) {
                            break L10;
                          } else {
                            break L13;
                          }
                        } else {
                          break L10;
                        }
                      }
                    }
                  }
                  if (32 > lh.field_l) {
                    break L10;
                  } else {
                    if (-39 >= (lh.field_l ^ -1)) {
                      break L10;
                    } else {
                      L14: {
                        if (q.field_d < 0) {
                          break L14;
                        } else {
                          if ((var3 ^ -1) >= (q.field_d ^ -1)) {
                            break L14;
                          } else {
                            if (!pb.a(var8.field_m[q.field_d], -20, lh.field_l)) {
                              break L14;
                            } else {
                              break L10;
                            }
                          }
                        }
                      }
                      en.a(param0 + -1, 6);
                      if (var7 == 0) {
                        break L10;
                      } else {
                        break L11;
                      }
                    }
                  }
                }
                if (0 > q.field_d) {
                  break L10;
                } else {
                  if (q.field_d < 5) {
                    en.a(-1, 6);
                    break L10;
                  } else {
                    break L10;
                  }
                }
              }
            }
          }
          L15: {
            L16: {
              L17: {
                if (!c.field_b) {
                  break L17;
                } else {
                  if (-1 != (pq.field_f ^ -1)) {
                    break L16;
                  } else {
                    break L17;
                  }
                }
              }
              kk.field_u = false;
              if (var7 == 0) {
                break L15;
              } else {
                break L16;
              }
            }
            L18: {
              if (wf.field_m + -sq.field_S >= 25) {
                stackOut_57_0 = 0;
                stackIn_58_0 = stackOut_57_0;
                break L18;
              } else {
                stackOut_56_0 = 1;
                stackIn_58_0 = stackOut_56_0;
                break L18;
              }
            }
            kk.field_u = stackIn_58_0 != 0;
            sq.field_S = wf.field_m;
            break L15;
          }
          L19: {
            if (pq.field_f != param0) {
              stackOut_61_0 = 0;
              stackIn_62_0 = stackOut_61_0;
              break L19;
            } else {
              stackOut_60_0 = 1;
              stackIn_62_0 = stackOut_60_0;
              break L19;
            }
          }
          L20: {
            c.field_b = stackIn_62_0 != 0;
            if (!kk.field_u) {
              break L20;
            } else {
              L21: {
                L22: {
                  if (!ll.field_k.c(127, cp.field_O)) {
                    break L22;
                  } else {
                    L23: {
                      if (0 > cp.field_O) {
                        break L23;
                      } else {
                        if ((cp.field_O ^ -1) > -20) {
                          var4 = var9.g((byte) -42);
                          var5 = 0;
                          if (var5 == 0) {
                            var6 = 0;
                            L24: while (true) {
                              if ((var6 ^ -1) <= (var4 ^ -1)) {
                                break L22;
                              } else {
                                stackOut_91_0 = var8.field_m[var6] ^ -1;
                                stackOut_91_1 = -256;
                                stackIn_108_0 = stackOut_91_0;
                                stackIn_108_1 = stackOut_91_1;
                                stackIn_92_0 = stackOut_91_0;
                                stackIn_92_1 = stackOut_91_1;
                                if (var7 != 0) {
                                  break L21;
                                } else {
                                  L25: {
                                    if (stackIn_92_0 != stackIn_92_1) {
                                      break L25;
                                    } else {
                                      var8.field_m[var6] = cp.field_O;
                                      discarded$11 = nm.b(-128, 87);
                                      if (var7 == 0) {
                                        break L22;
                                      } else {
                                        break L25;
                                      }
                                    }
                                  }
                                  var6++;
                                  if (var7 == 0) {
                                    continue L24;
                                  } else {
                                    break L22;
                                  }
                                }
                              }
                            }
                          } else {
                            break L22;
                          }
                        } else {
                          break L23;
                        }
                      }
                    }
                    if (cp.field_O < 44) {
                      break L22;
                    } else {
                      if ((cp.field_O ^ -1) < -63) {
                        break L22;
                      } else {
                        var4 = 0;
                        var5 = 0;
                        L26: while (true) {
                          L27: {
                            if ((var5 ^ -1) <= -4) {
                              break L27;
                            } else {
                              stackOut_71_0 = var8.field_s[var5];
                              stackOut_71_1 = cp.field_O;
                              stackIn_108_0 = stackOut_71_0;
                              stackIn_108_1 = stackOut_71_1;
                              stackIn_72_0 = stackOut_71_0;
                              stackIn_72_1 = stackOut_71_1;
                              if (var7 != 0) {
                                break L21;
                              } else {
                                L28: {
                                  if (stackIn_72_0 != stackIn_72_1) {
                                    break L28;
                                  } else {
                                    var4 = 1;
                                    if (var7 == 0) {
                                      break L27;
                                    } else {
                                      break L28;
                                    }
                                  }
                                }
                                var5++;
                                if (var7 == 0) {
                                  continue L26;
                                } else {
                                  break L27;
                                }
                              }
                            }
                          }
                          L29: {
                            if (var4 != 0) {
                              break L29;
                            } else {
                              var5 = 0;
                              L30: while (true) {
                                if (3 <= var5) {
                                  break L29;
                                } else {
                                  stackOut_79_0 = 255;
                                  stackOut_79_1 = var8.field_s[var5];
                                  stackIn_108_0 = stackOut_79_0;
                                  stackIn_108_1 = stackOut_79_1;
                                  stackIn_80_0 = stackOut_79_0;
                                  stackIn_80_1 = stackOut_79_1;
                                  if (var7 != 0) {
                                    break L21;
                                  } else {
                                    L31: {
                                      if (stackIn_80_0 != stackIn_80_1) {
                                        break L31;
                                      } else {
                                        var8.field_s[var5] = cp.field_O;
                                        discarded$12 = nm.b(-127, 87);
                                        if (var7 == 0) {
                                          break L29;
                                        } else {
                                          break L31;
                                        }
                                      }
                                    }
                                    var5++;
                                    if (var7 == 0) {
                                      continue L30;
                                    } else {
                                      break L29;
                                    }
                                  }
                                }
                              }
                            }
                          }
                          if (var7 == 0) {
                            break L22;
                          } else {
                            var4 = var9.g((byte) -42);
                            var5 = 0;
                            if (var5 == 0) {
                              var6 = 0;
                              L32: while (true) {
                                if ((var6 ^ -1) <= (var4 ^ -1)) {
                                  break L22;
                                } else {
                                  stackOut_101_0 = var8.field_m[var6] ^ -1;
                                  stackOut_101_1 = -256;
                                  stackIn_108_0 = stackOut_101_0;
                                  stackIn_108_1 = stackOut_101_1;
                                  stackIn_102_0 = stackOut_101_0;
                                  stackIn_102_1 = stackOut_101_1;
                                  if (var7 != 0) {
                                    break L21;
                                  } else {
                                    L33: {
                                      if (stackIn_102_0 != stackIn_102_1) {
                                        break L33;
                                      } else {
                                        var8.field_m[var6] = cp.field_O;
                                        discarded$13 = nm.b(-128, 87);
                                        if (var7 == 0) {
                                          break L22;
                                        } else {
                                          break L33;
                                        }
                                      }
                                    }
                                    var6++;
                                    if (var7 == 0) {
                                      continue L32;
                                    } else {
                                      break L22;
                                    }
                                  }
                                }
                              }
                            } else {
                              break L22;
                            }
                          }
                        }
                      }
                    }
                  }
                }
                stackOut_107_0 = -1;
                stackOut_107_1 = q.field_d ^ -1;
                stackIn_108_0 = stackOut_107_0;
                stackIn_108_1 = stackOut_107_1;
                break L21;
              }
              L34: {
                L35: {
                  if (stackIn_108_0 < stackIn_108_1) {
                    break L35;
                  } else {
                    if (-6 < (q.field_d ^ -1)) {
                      break L34;
                    } else {
                      break L35;
                    }
                  }
                }
                if (-6 >= (q.field_d ^ -1)) {
                  var8.field_s[-5 + q.field_d] = 255;
                  if (var7 == 0) {
                    break L20;
                  } else {
                    break L34;
                  }
                } else {
                  break L20;
                }
              }
              L36: {
                if (380 >= bo.field_d) {
                  break L36;
                } else {
                  var8.field_g[q.field_d] = 255;
                  break L36;
                }
              }
              var8.field_m[q.field_d] = 255;
              break L20;
            }
          }
          L37: {
            b.field_a.a(-11838, true);
            wa.field_g = b.field_a.a(850, b.field_a.field_zb, -18367);
            var4 = -10;
            wa.field_g = wa.field_g + var4 * t.field_d;
            var5 = -100;
            if (!b.field_a.k(20)) {
              break L37;
            } else {
              wa.field_g = wa.field_g + var4;
              break L37;
            }
          }
          L38: {
            if (!b.field_a.h(4690)) {
              break L38;
            } else {
              wa.field_g = wa.field_g - var4;
              break L38;
            }
          }
          L39: {
            if (!b.field_a.j(param0 ^ 64)) {
              break L39;
            } else {
              wa.field_g = wa.field_g + var5;
              break L39;
            }
          }
          L40: {
            if (!b.field_a.c((byte) -104)) {
              break L40;
            } else {
              wa.field_g = wa.field_g - var5;
              break L40;
            }
          }
          L41: {
            if ((wa.field_g ^ -1) > -1) {
              wa.field_g = 0;
              break L41;
            } else {
              break L41;
            }
          }
          L42: {
            if (wa.field_g <= -b.field_a.field_zb + 850) {
              break L42;
            } else {
              wa.field_g = -b.field_a.field_zb + 850;
              break L42;
            }
          }
          L43: {
            if (1 != kd.field_b) {
              break L43;
            } else {
              L44: {
                if (255 == cp.field_O) {
                  break L44;
                } else {
                  if (var9.c(127, cp.field_O)) {
                    lh.field_l = cp.field_O;
                    discarded$14 = nm.b(-126, 90);
                    break L44;
                  } else {
                    break L44;
                  }
                }
              }
              L45: {
                if ((kn.field_b ^ -1) == 0) {
                  break L45;
                } else {
                  ao.field_d = kn.field_b;
                  discarded$15 = nm.b(-126, 91);
                  if (var7 == 0) {
                    break L43;
                  } else {
                    break L45;
                  }
                }
              }
              if (-256 != (lh.field_l ^ -1)) {
                break L43;
              } else {
                if ((q.field_d ^ -1) == 0) {
                  break L43;
                } else {
                  L46: {
                    if ((q.field_d ^ -1) > -6) {
                      break L46;
                    } else {
                      lh.field_l = var8.field_s[q.field_d - 5];
                      discarded$16 = nm.b(-128, 90);
                      var8.field_s[q.field_d + -5] = 255;
                      if (var7 == 0) {
                        break L43;
                      } else {
                        break L46;
                      }
                    }
                  }
                  L47: {
                    if ((bo.field_d ^ -1) <= -381) {
                      break L47;
                    } else {
                      lh.field_l = var8.field_m[q.field_d];
                      discarded$17 = nm.b(-128, 90);
                      var8.field_m[q.field_d] = 255;
                      var8.field_g[q.field_d] = 255;
                      if (var7 == 0) {
                        break L43;
                      } else {
                        break L47;
                      }
                    }
                  }
                  lh.field_l = var8.field_g[q.field_d];
                  discarded$18 = nm.b(param0 ^ -128, 90);
                  var8.field_g[q.field_d] = 255;
                  break L43;
                }
              }
            }
          }
          L48: {
            if ((pq.field_f ^ -1) == -2) {
              break L48;
            } else {
              L49: {
                if (0 == (q.field_d ^ -1)) {
                  break L49;
                } else {
                  if ((lh.field_l ^ -1) == -256) {
                    break L49;
                  } else {
                    L50: {
                      if ((q.field_d ^ -1) <= -6) {
                        break L50;
                      } else {
                        if (q.field_d < var3) {
                          L51: {
                            if (-1 < (lh.field_l ^ -1)) {
                              break L51;
                            } else {
                              if (lh.field_l >= 19) {
                                break L51;
                              } else {
                                var8.field_m[q.field_d] = lh.field_l;
                                if (!pb.a(lh.field_l, -20, var8.field_g[q.field_d])) {
                                  var8.field_g[q.field_d] = 255;
                                  discarded$19 = nm.b(-126, 87);
                                  if (var7 == 0) {
                                    break L49;
                                  } else {
                                    break L51;
                                  }
                                } else {
                                  break L49;
                                }
                              }
                            }
                          }
                          if (-33 < (lh.field_l ^ -1)) {
                            break L49;
                          } else {
                            if (-39 <= (lh.field_l ^ -1)) {
                              if (!pb.a(var8.field_m[q.field_d], -20, lh.field_l)) {
                                break L49;
                              } else {
                                var8.field_g[q.field_d] = lh.field_l;
                                discarded$20 = nm.b(-128, 87);
                                if (var7 == 0) {
                                  break L49;
                                } else {
                                  break L50;
                                }
                              }
                            } else {
                              break L49;
                            }
                          }
                        } else {
                          break L49;
                        }
                      }
                    }
                    if ((lh.field_l ^ -1) > -45) {
                      break L49;
                    } else {
                      if (lh.field_l <= 62) {
                        var6 = 0;
                        L52: while (true) {
                          L53: {
                            L54: {
                              if (3 <= var6) {
                                break L54;
                              } else {
                                stackOut_169_0 = lh.field_l ^ -1;
                                stackOut_169_1 = var8.field_s[var6] ^ -1;
                                stackIn_175_0 = stackOut_169_0;
                                stackIn_175_1 = stackOut_169_1;
                                stackIn_170_0 = stackOut_169_0;
                                stackIn_170_1 = stackOut_169_1;
                                if (var7 != 0) {
                                  break L53;
                                } else {
                                  L55: {
                                    if (stackIn_170_0 == stackIn_170_1) {
                                      var8.field_s[var6] = 255;
                                      break L55;
                                    } else {
                                      break L55;
                                    }
                                  }
                                  var6++;
                                  if (var7 == 0) {
                                    continue L52;
                                  } else {
                                    break L54;
                                  }
                                }
                              }
                            }
                            var8.field_s[-5 + q.field_d] = lh.field_l;
                            stackOut_174_0 = param0 + -127;
                            stackOut_174_1 = 87;
                            stackIn_175_0 = stackOut_174_0;
                            stackIn_175_1 = stackOut_174_1;
                            break L53;
                          }
                          discarded$21 = nm.b(stackIn_175_0, stackIn_175_1);
                          break L49;
                        }
                      } else {
                        break L49;
                      }
                    }
                  }
                }
              }
              lh.field_l = 255;
              break L48;
            }
          }
          return;
        }
    }

    private final void d(byte param0) {
        int discarded$5 = 0;
        int discarded$6 = 0;
        int discarded$7 = 0;
        int discarded$8 = 0;
        int discarded$9 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        L0: {
          L1: {
            var7 = ZombieDawnMulti.field_E ? 1 : 0;
            if (u.field_i) {
              break L1;
            } else {
              L2: {
                if (ud.field_S) {
                  break L2;
                } else {
                  oo.d(610, 20, 9, 16711680, (q.a((byte) -104, wf.field_m << 174035877) >> -556021271) + 128);
                  if (var7 == 0) {
                    break L0;
                  } else {
                    break L2;
                  }
                }
              }
              oo.d(610, 20, 9, 65280);
              if (var7 == 0) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          oo.d(610, 20, 9, 16777215);
          break L0;
        }
        L3: {
          if (param0 < -85) {
            break L3;
          } else {
            field_n = 43;
            break L3;
          }
        }
        L4: {
          jl.field_u.c(600, 10);
          if (!ud.field_S) {
            break L4;
          } else {
            L5: {
              oo.f(0, 0, 640, 480, 0, 64);
              var6 = 10;
              var2 = 445;
              var3 = 2;
              var4 = 120;
              var5 = pb.field_e.a(cc.field_a, var4, 0);
              this.a(var5, var6, var3, -79, var4, var2);
              discarded$5 = pb.field_e.a(cc.field_a, var2 - -var6, var6 + var3, var4, var5, 16777215, -1, 0, 0, 0);
              lh.field_m.a(-3 + ((var6 << 1842328065) + (var2 - -var4)), 8 + var3);
              if ((this.field_p ^ -1) < -1) {
                var2 = 200;
                var4 = 390;
                var3 = 100;
                var5 = pb.field_e.a(uc.field_g, var4, 0);
                this.a(var5, var6, var3, -105, var4, var2);
                discarded$6 = pb.field_e.a(uc.field_g, var2 + var6, var3 + var6, var4, var5, 16777215, -1, 0, 0, 0);
                ip.field_e.a(var2 - -50, var3 - -3 + -ip.field_e.field_b);
                oi.field_k.a(var2 + 50, var5 + var3 + -3 - -(var6 << 1705362977));
                lh.field_m.a(var2 - (-var4 + -(var6 << 1178440097) - -3), var3 + (var5 >> 215109665));
                uo.field_n.a(var2 + (-var6 + -1), (var5 >> 1410202977) + var3);
                break L5;
              } else {
                break L5;
              }
            }
            L6: {
              if ((this.field_p ^ -1) < -101) {
                var2 = 50;
                var5 = 80;
                var4 = 250;
                var3 = 280;
                var5 = pb.field_e.a(wq.field_d, var4, 0);
                this.a(var5, var6, var3, -126, var4, var2);
                discarded$7 = pb.field_e.a(wq.field_d, var6 + var2, var3 - -var6, var4, var5, 16777215, -1, 0, 0, 0);
                oi.field_k.a(var2 - -50, var5 + var3 + (-3 - -(var6 << 386190529)));
                break L6;
              } else {
                break L6;
              }
            }
            L7: {
              if (-301 <= (this.field_p ^ -1)) {
                break L7;
              } else {
                L8: {
                  L9: {
                    var5 = 80;
                    var3 = 400;
                    var4 = 250;
                    var2 = 50;
                    if (-2 == (p.field_e ^ -1)) {
                      break L9;
                    } else {
                      if (-3 != (p.field_e ^ -1)) {
                        break L8;
                      } else {
                        break L9;
                      }
                    }
                  }
                  var3 -= 10;
                  break L8;
                }
                var5 = pb.field_e.a(jf.field_c, var4, 0);
                this.a(var5, var6, var3, -71, var4, var2);
                discarded$8 = pb.field_e.a(jf.field_c, var6 + var2, var3 - -var6, var4, var5, 16777215, -1, 0, 0, 0);
                ip.field_e.a(50 + var2, -ip.field_e.field_b + (var3 + 3));
                break L7;
              }
            }
            L10: {
              if (this.field_p <= 200) {
                break L10;
              } else {
                var3 = 280;
                var4 = 250;
                var5 = 80;
                var2 = 350;
                var5 = pb.field_e.a(pi.field_h, var4, 0);
                this.a(var5, var6, var3, -118, var4, var2);
                discarded$9 = pb.field_e.a(pi.field_h, var2 + var6, var6 + var3, var4, var5, 16777215, -1, 0, 0, 0);
                oi.field_k.a(80 + var2, var5 + -3 + (var3 + (var6 << 1871587905)));
                break L10;
              }
            }
            break L4;
          }
        }
    }

    static {
        field_o = "Show lobby chat from my friends";
    }
}
