/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qp extends o {
    static String field_v;
    private int field_y;
    private int field_u;
    private bi[] field_t;
    static in field_w;
    private int field_x;

    final static int[] a(boolean param0, int[] param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7_int = 0;
        int[] var7 = null;
        int var8_int = 0;
        int[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int[] var14 = null;
        int[] var15 = null;
        int[] var16 = null;
        int[] var17 = null;
        L0: {
          L1: {
            var13 = ShatteredPlansClient.field_F ? 1 : 0;
            var2 = param1.length;
            if (null == ai.field_b) {
              break L1;
            } else {
              if (ai.field_b.length >= var2 * 2) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          ai.field_b = new int[2 * var2];
          en.field_b = new int[var2 * 2];
          break L0;
        }
        sl.field_r = 0;
        var5 = param1[var2 - 2];
        var6 = param1[-1 + var2];
        var7_int = 0;
        L2: while (true) {
          L3: {
            if (var7_int >= var2) {
              break L3;
            } else {
              L4: {
                L5: {
                  var3 = var5;
                  var4 = var6;
                  var5 = param1[var7_int];
                  var6 = param1[var7_int + 1];
                  if ((gf.field_i ^ -1) >= (var5 ^ -1)) {
                    break L5;
                  } else {
                    if (gf.field_i > var3) {
                      break L4;
                    } else {
                      var8_int = var3;
                      var9 = var4;
                      var10 = var5;
                      var11 = var6;
                      sl.field_r = sl.field_r + 1;
                      ai.field_b[sl.field_r] = gf.field_i;
                      sl.field_r = sl.field_r + 1;
                      ai.field_b[sl.field_r] = var9 - -((var11 + -var9) * (gf.field_i + -var8_int) / (-var8_int + var10));
                      if (0 == 0) {
                        break L4;
                      } else {
                        break L5;
                      }
                    }
                  }
                }
                L6: {
                  if (gf.field_i > var3) {
                    var8_int = var5;
                    var9 = var6;
                    var10 = var3;
                    var11 = var4;
                    sl.field_r = sl.field_r + 1;
                    ai.field_b[sl.field_r] = gf.field_i;
                    sl.field_r = sl.field_r + 1;
                    ai.field_b[sl.field_r] = var9 - -((-var8_int + gf.field_i) * (-var9 + var11) / (var10 + -var8_int));
                    break L6;
                  } else {
                    break L6;
                  }
                }
                sl.field_r = sl.field_r + 1;
                ai.field_b[sl.field_r] = var5;
                sl.field_r = sl.field_r + 1;
                ai.field_b[sl.field_r] = var6;
                break L4;
              }
              var7_int += 2;
              if (0 == 0) {
                continue L2;
              } else {
                break L3;
              }
            }
          }
          if (sl.field_r != 0) {
            var7 = en.field_b;
            en.field_b = ai.field_b;
            ai.field_b = var7;
            var2 = sl.field_r;
            sl.field_r = 0;
            var5 = en.field_b[var2 + -2];
            var6 = en.field_b[-1 + var2];
            var8_int = 0;
            L7: while (true) {
              L8: {
                if (var2 <= var8_int) {
                  break L8;
                } else {
                  L9: {
                    L10: {
                      var3 = var5;
                      var4 = var6;
                      var6 = en.field_b[1 + var8_int];
                      var5 = en.field_b[var8_int];
                      if (gf.field_l > var5) {
                        break L10;
                      } else {
                        if (var3 < gf.field_l) {
                          var9 = var3;
                          var10 = var4;
                          var11 = var5;
                          var12 = var6;
                          sl.field_r = sl.field_r + 1;
                          ai.field_b[sl.field_r] = gf.field_l;
                          sl.field_r = sl.field_r + 1;
                          ai.field_b[sl.field_r] = var10 - -((-var10 + var12) * (gf.field_l + -var9) / (-var9 + var11));
                          if (0 == 0) {
                            break L9;
                          } else {
                            break L10;
                          }
                        } else {
                          break L9;
                        }
                      }
                    }
                    L11: {
                      if (var3 >= gf.field_l) {
                        var9 = var5;
                        var10 = var6;
                        var11 = var3;
                        var12 = var4;
                        sl.field_r = sl.field_r + 1;
                        ai.field_b[sl.field_r] = gf.field_l;
                        sl.field_r = sl.field_r + 1;
                        ai.field_b[sl.field_r] = (var12 - var10) * (-var9 + gf.field_l) / (var11 + -var9) + var10;
                        break L11;
                      } else {
                        break L11;
                      }
                    }
                    sl.field_r = sl.field_r + 1;
                    ai.field_b[sl.field_r] = var5;
                    sl.field_r = sl.field_r + 1;
                    ai.field_b[sl.field_r] = var6;
                    break L9;
                  }
                  var8_int += 2;
                  if (0 == 0) {
                    continue L7;
                  } else {
                    break L8;
                  }
                }
              }
              L12: {
                if (param0) {
                  break L12;
                } else {
                  field_w = null;
                  break L12;
                }
              }
              if (sl.field_r != 0) {
                var7 = en.field_b;
                en.field_b = ai.field_b;
                ai.field_b = var7;
                var2 = sl.field_r;
                sl.field_r = 0;
                var5 = en.field_b[var2 + -2];
                var6 = en.field_b[var2 + -1];
                var8_int = 0;
                L13: while (true) {
                  L14: {
                    if (var2 <= var8_int) {
                      break L14;
                    } else {
                      L15: {
                        L16: {
                          var4 = var6;
                          var3 = var5;
                          var6 = en.field_b[var8_int + 1];
                          var5 = en.field_b[var8_int];
                          if (var6 >= gf.field_a) {
                            break L16;
                          } else {
                            if (var4 >= gf.field_a) {
                              var9 = var3;
                              var10 = var4;
                              var11 = var5;
                              var12 = var6;
                              sl.field_r = sl.field_r + 1;
                              ai.field_b[sl.field_r] = var9 - -((gf.field_a + -var10) * (-var9 + var11) / (-var10 + var12));
                              sl.field_r = sl.field_r + 1;
                              ai.field_b[sl.field_r] = gf.field_a;
                              if (0 == 0) {
                                break L15;
                              } else {
                                break L16;
                              }
                            } else {
                              break L15;
                            }
                          }
                        }
                        L17: {
                          if (var4 < gf.field_a) {
                            var9 = var5;
                            var10 = var6;
                            var11 = var3;
                            var12 = var4;
                            sl.field_r = sl.field_r + 1;
                            ai.field_b[sl.field_r] = var9 + (-var9 + var11) * (-var10 + gf.field_a) / (var12 - var10);
                            sl.field_r = sl.field_r + 1;
                            ai.field_b[sl.field_r] = gf.field_a;
                            break L17;
                          } else {
                            break L17;
                          }
                        }
                        sl.field_r = sl.field_r + 1;
                        ai.field_b[sl.field_r] = var5;
                        sl.field_r = sl.field_r + 1;
                        ai.field_b[sl.field_r] = var6;
                        break L15;
                      }
                      var8_int += 2;
                      if (0 == 0) {
                        continue L13;
                      } else {
                        break L14;
                      }
                    }
                  }
                  if (0 != sl.field_r) {
                    var7 = en.field_b;
                    en.field_b = ai.field_b;
                    var2 = sl.field_r;
                    ai.field_b = var7;
                    sl.field_r = 0;
                    var6 = en.field_b[-1 + var2];
                    var5 = en.field_b[var2 - 2];
                    var8_int = 0;
                    L18: while (true) {
                      L19: {
                        if (var8_int >= var2) {
                          break L19;
                        } else {
                          L20: {
                            L21: {
                              var3 = var5;
                              var4 = var6;
                              var5 = en.field_b[var8_int];
                              var6 = en.field_b[1 + var8_int];
                              if (var6 >= gf.field_f) {
                                break L21;
                              } else {
                                L22: {
                                  if (gf.field_f <= var4) {
                                    var9 = var5;
                                    var10 = var6;
                                    var11 = var3;
                                    var12 = var4;
                                    sl.field_r = sl.field_r + 1;
                                    ai.field_b[sl.field_r] = (-var9 + var11) * (gf.field_f - var10) / (var12 - var10) + var9;
                                    sl.field_r = sl.field_r + 1;
                                    ai.field_b[sl.field_r] = gf.field_f;
                                    break L22;
                                  } else {
                                    break L22;
                                  }
                                }
                                sl.field_r = sl.field_r + 1;
                                ai.field_b[sl.field_r] = var5;
                                sl.field_r = sl.field_r + 1;
                                ai.field_b[sl.field_r] = var6;
                                if (0 == 0) {
                                  break L20;
                                } else {
                                  break L21;
                                }
                              }
                            }
                            if (var4 < gf.field_f) {
                              var9 = var3;
                              var10 = var4;
                              var11 = var5;
                              var12 = var6;
                              sl.field_r = sl.field_r + 1;
                              ai.field_b[sl.field_r] = (gf.field_f - var10) * (var11 + -var9) / (var12 - var10) + var9;
                              sl.field_r = sl.field_r + 1;
                              ai.field_b[sl.field_r] = gf.field_f;
                              break L20;
                            } else {
                              break L20;
                            }
                          }
                          var8_int += 2;
                          if (0 == 0) {
                            continue L18;
                          } else {
                            break L19;
                          }
                        }
                      }
                      if (sl.field_r == 0) {
                        return null;
                      } else {
                        var17 = new int[sl.field_r];
                        var16 = var17;
                        var15 = var16;
                        var14 = var15;
                        var8 = var14;
                        ps.a(ai.field_b, 0, var17, 0, sl.field_r);
                        return var8;
                      }
                    }
                  } else {
                    return null;
                  }
                }
              } else {
                return null;
              }
            }
          } else {
            return null;
          }
        }
    }

    public qp() {
        this(2188450, 2591221, 9543);
    }

    public final void a(vg param0, int param1, boolean param2, int param3, byte param4) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_8_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_19_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_17_0 = 0;
        L0: {
          if (param4 == 12) {
            break L0;
          } else {
            field_v = null;
            break L0;
          }
        }
        L1: {
          if (!param0.field_k) {
            if (param0.f(1)) {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L1;
            } else {
              stackOut_5_0 = 0;
              stackIn_8_0 = stackOut_5_0;
              break L1;
            }
          } else {
            stackOut_3_0 = 1;
            stackIn_8_0 = stackOut_3_0;
            break L1;
          }
        }
        L2: {
          var6 = stackIn_8_0;
          if (param0 instanceof kg) {
            param2 = param2 & ((kg) (Object) param0).field_y;
            break L2;
          } else {
            break L2;
          }
        }
        L3: {
          if (param2) {
            if (var6 != 0) {
              stackOut_15_0 = ((qp) this).field_x;
              stackIn_16_0 = stackOut_15_0;
              break L3;
            } else {
              stackOut_14_0 = ((qp) this).field_y;
              stackIn_16_0 = stackOut_14_0;
              break L3;
            }
          } else {
            stackOut_12_0 = ((qp) this).field_u;
            stackIn_16_0 = stackOut_12_0;
            break L3;
          }
        }
        L4: {
          var7 = stackIn_16_0;
          mj.a(param0.field_x, 2, var7, param3 + param0.field_q + (param0.field_n - ((qp) this).field_t[0].field_p >> -1289075455), param0.field_m + param1, ((qp) this).field_t);
          if (param2) {
            stackOut_18_0 = 16777215;
            stackIn_19_0 = stackOut_18_0;
            break L4;
          } else {
            stackOut_17_0 = 7105644;
            stackIn_19_0 = stackOut_17_0;
            break L4;
          }
        }
        var8 = stackIn_19_0;
        int discarded$2 = ((qp) this).field_c.a(param0.field_s, param1 - -param0.field_m, -2 + param0.field_q + param3, param0.field_x, param0.field_n, var8, -1, 1, 1, ((qp) this).field_c.field_J);
    }

    final static bi[] a(int param0, int param1, int param2) {
        int var3 = 124 % ((-27 - param1) / 41);
        return cr.a(param0, 1, -10, param2);
    }

    public static void b(byte param0) {
        field_w = null;
        if (param0 >= -126) {
            return;
        }
        field_v = null;
    }

    private qp(int param0, int param1, int param2) {
        ((qp) this).field_t = kl.field_q;
        ((qp) this).field_y = param0;
        ((qp) this).field_c = sl.field_p;
        ((qp) this).field_x = param1;
        ((qp) this).field_u = param2;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_v = "Here you can set up a rated game. If you win, your rating will go up. If<nbsp>you lose, it will go down!<br><br>Please specify your preferences and click '<%0>'. Our system will then attempt to find a suitable opponent in under a minute, depending on how busy the lobby<nbsp>is.<br><br>This is an excellent way to get to know new people!";
    }
}
