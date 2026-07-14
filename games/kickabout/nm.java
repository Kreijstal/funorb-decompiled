/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nm {
    static Kickabout field_g;
    int[] field_e;
    static oj field_d;
    private static int[] field_b;
    boolean field_j;
    private int[][] field_n;
    int field_f;
    static int[] field_i;
    int[] field_c;
    private int[] field_m;
    static int field_l;
    int field_h;
    static dp field_k;
    static String field_a;

    final static ut a(int param0, int param1, ut param2) {
        int var6 = 0;
        int var7 = 0;
        int var8 = Kickabout.field_G;
        ut var9 = new ut(param2.field_q, param2.field_w);
        ut var10 = var9;
        int var4 = 16711935 & param0;
        int var5 = param0 & 65280;
        if (param1 >= -73) {
            return null;
        }
        for (var6 = 0; var10.field_y.length > var6; var6++) {
            var7 = param2.field_y[var6];
            if (0 != var7) {
                if ((var7 ^ -1) != -65794) {
                    var7 = var7 & 255;
                    var7 = (16711935 & var7 * var4 >> -1457702552) + ((var7 * var5 & 16711798) >> 641963176);
                }
            }
            var9.field_y[var6] = var7;
        }
        return var10;
    }

    final static int a(byte param0, int param1) {
        int var2 = param1 >= gs.field_a.length ? 100 : gs.field_a[param1];
        if (param0 >= -89) {
            return 7;
        }
        return 55 + var2 * 45 / 100;
    }

    private nm(sj param0, int param1, String param2) {
        this(param0, param1, param0.a((byte) -111, param2, param1));
    }

    nm(sj param0, String param1, String param2) {
        this(param0, param0.b(param1, -1), param2);
    }

    public static void a(int param0) {
        field_d = null;
        field_g = null;
        if (param0 != 256) {
            return;
        }
        field_i = null;
        field_a = null;
        field_b = null;
        field_k = null;
    }

    final static void a(int param0, int param1, boolean param2, int param3) {
        boolean stackIn_3_0 = false;
        boolean stackIn_4_0 = false;
        boolean stackIn_5_0 = false;
        boolean stackIn_6_0 = false;
        boolean stackIn_7_0 = false;
        int stackIn_7_1 = 0;
        boolean stackIn_8_0 = false;
        boolean stackIn_9_0 = false;
        boolean stackIn_10_0 = false;
        int stackIn_10_1 = 0;
        int stackIn_13_0 = 0;
        boolean stackOut_2_0 = false;
        boolean stackOut_3_0 = false;
        boolean stackOut_4_0 = false;
        boolean stackOut_6_0 = false;
        int stackOut_6_1 = 0;
        boolean stackOut_5_0 = false;
        int stackOut_5_1 = 0;
        boolean stackOut_7_0 = false;
        boolean stackOut_9_0 = false;
        int stackOut_9_1 = 0;
        boolean stackOut_8_0 = false;
        int stackOut_8_1 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        L0: {
          if (param1 == -76) {
            break L0;
          } else {
            field_b = null;
            break L0;
          }
        }
        L1: {
          L2: {
            stackOut_2_0 = kl.field_t;
            stackIn_8_0 = stackOut_2_0;
            stackIn_3_0 = stackOut_2_0;
            if (param3 != ih.field_c) {
              break L2;
            } else {
              stackOut_3_0 = stackIn_3_0;
              stackIn_8_0 = stackOut_3_0;
              stackIn_4_0 = stackOut_3_0;
              if (rm.field_C != param0) {
                break L2;
              } else {
                L3: {
                  stackOut_4_0 = stackIn_4_0;
                  stackIn_6_0 = stackOut_4_0;
                  stackIn_5_0 = stackOut_4_0;
                  if (param2) {
                    stackOut_6_0 = stackIn_6_0;
                    stackOut_6_1 = 0;
                    stackIn_7_0 = stackOut_6_0;
                    stackIn_7_1 = stackOut_6_1;
                    break L3;
                  } else {
                    stackOut_5_0 = stackIn_5_0;
                    stackOut_5_1 = 1;
                    stackIn_7_0 = stackOut_5_0;
                    stackIn_7_1 = stackOut_5_1;
                    break L3;
                  }
                }
                stackOut_7_0 = stackIn_7_0;
                stackIn_9_0 = stackOut_7_0;
                stackIn_8_0 = stackOut_7_0;
                if (stackIn_7_1 != (vi.field_n ? 1 : 0)) {
                  stackOut_9_0 = stackIn_9_0;
                  stackOut_9_1 = 0;
                  stackIn_10_0 = stackOut_9_0;
                  stackIn_10_1 = stackOut_9_1;
                  break L1;
                } else {
                  break L2;
                }
              }
            }
          }
          stackOut_8_0 = stackIn_8_0;
          stackOut_8_1 = 1;
          stackIn_10_0 = stackOut_8_0;
          stackIn_10_1 = stackOut_8_1;
          break L1;
        }
        L4: {
          kl.field_t = stackIn_10_0 | stackIn_10_1 != 0;
          wh.field_q = true;
          rl.field_r = -1;
          if (!param2) {
            stackOut_12_0 = 0;
            stackIn_13_0 = stackOut_12_0;
            break L4;
          } else {
            stackOut_11_0 = 1;
            stackIn_13_0 = stackOut_11_0;
            break L4;
          }
        }
        vi.field_n = stackIn_13_0 != 0;
        rm.field_C = param0;
        ih.field_c = param3;
    }

    private final void a(int param0, iw param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        L0: {
          L1: {
            var8 = Kickabout.field_G;
            if ((param0 ^ -1) != -2) {
              if (param0 == 2) {
                ((nm) this).field_h = param1.a((byte) 81);
                break L1;
              } else {
                if (param0 == 3) {
                  var4 = param1.h((byte) -122);
                  ((nm) this).field_m = new int[1 + var4];
                  var5 = 0;
                  L2: while (true) {
                    if (var5 >= var4) {
                      ((nm) this).field_m[var4] = 9999999;
                      break L1;
                    } else {
                      ((nm) this).field_m[var5] = param1.h((byte) -115);
                      var5++;
                      continue L2;
                    }
                  }
                } else {
                  if (5 == param0) {
                    int discarded$8 = param1.h((byte) -126);
                    break L1;
                  } else {
                    if (-7 != param0) {
                      if (-8 != param0) {
                        if (param0 != 8) {
                          if (param0 == -10) {
                            int discarded$9 = param1.h((byte) -106);
                            break L1;
                          } else {
                            if (-11 != param0) {
                              if (11 == param0) {
                                int discarded$10 = param1.h((byte) -118);
                                break L1;
                              } else {
                                if (param0 != 12) {
                                  if (-14 == param0) {
                                    var4 = param1.a((byte) 81);
                                    ((nm) this).field_n = new int[var4][];
                                    var5 = 0;
                                    L3: while (true) {
                                      if (var5 >= var4) {
                                        break L1;
                                      } else {
                                        var6 = param1.h((byte) -108);
                                        if ((var6 ^ -1) < -1) {
                                          ((nm) this).field_n[var5] = new int[var6];
                                          ((nm) this).field_n[var5][0] = param1.i(-95);
                                          var7 = 1;
                                          L4: while (true) {
                                            if (var6 > var7) {
                                              ((nm) this).field_n[var5][var7] = param1.a((byte) 81);
                                              var7++;
                                              continue L4;
                                            } else {
                                              var5++;
                                              continue L3;
                                            }
                                          }
                                        } else {
                                          var5++;
                                          continue L3;
                                        }
                                      }
                                    }
                                  } else {
                                    if (param0 != -15) {
                                      if (-16 != param0) {
                                        if (-17 != param0) {
                                          if (18 == param0) {
                                            break L1;
                                          } else {
                                            break L1;
                                          }
                                        } else {
                                          var4 = -111 / ((param2 - -70) / 46);
                                          break L0;
                                        }
                                      } else {
                                        break L1;
                                      }
                                    } else {
                                      break L1;
                                    }
                                  }
                                } else {
                                  var4 = param1.h((byte) -117);
                                  var5 = 0;
                                  L5: while (true) {
                                    if (var4 <= var5) {
                                      var5 = 0;
                                      L6: while (true) {
                                        if (var4 <= var5) {
                                          break L1;
                                        } else {
                                          int discarded$11 = param1.a((byte) 81);
                                          var5++;
                                          continue L6;
                                        }
                                      }
                                    } else {
                                      int discarded$12 = param1.a((byte) 81);
                                      var5++;
                                      continue L5;
                                    }
                                  }
                                }
                              }
                            } else {
                              int discarded$13 = param1.h((byte) -115);
                              break L1;
                            }
                          }
                        } else {
                          ((nm) this).field_f = param1.h((byte) -124);
                          ((nm) this).field_j = false;
                          break L1;
                        }
                      } else {
                        int discarded$14 = param1.a((byte) 81);
                        break L1;
                      }
                    } else {
                      int discarded$15 = param1.a((byte) 81);
                      break L1;
                    }
                  }
                }
              }
            } else {
              var4 = param1.a((byte) 81);
              ((nm) this).field_c = new int[var4];
              var5 = 0;
              L7: while (true) {
                if (var4 <= var5) {
                  ((nm) this).field_e = new int[var4];
                  var5 = 0;
                  L8: while (true) {
                    if (var4 <= var5) {
                      var5 = 0;
                      L9: while (true) {
                        if (var4 <= var5) {
                          break L1;
                        } else {
                          ((nm) this).field_e[var5] = (param1.a((byte) 81) << -735689136) - -((nm) this).field_e[var5];
                          var5++;
                          continue L9;
                        }
                      }
                    } else {
                      ((nm) this).field_e[var5] = param1.a((byte) 81);
                      var5++;
                      continue L8;
                    }
                  }
                } else {
                  ((nm) this).field_c[var5] = param1.a((byte) 81);
                  var5++;
                  continue L7;
                }
              }
            }
          }
          var4 = -111 / ((param2 - -70) / 46);
          break L0;
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, tf param5, byte param6) {
        int var11 = 0;
        int var12 = Kickabout.field_G;
        int var7 = param0 + -param4;
        int var8 = param2 - param3;
        int var9 = de.a(var7 * var7 - -(var8 * var8), (byte) -98);
        int var10 = var9 / param1;
        if (param6 >= -10) {
            return;
        }
        for (var11 = 0; -1 + var10 > var11; var11++) {
            param5.a((gn) (Object) ek.b(true, param4 + (param0 - param4) * var11 / (-1 + var10), param3 - -(var11 * (-param3 + param2) / (-1 + var10))), 3);
        }
    }

    private final void a(int param0, iw param1) {
        int var3 = 0;
        int var4 = 0;
        var4 = Kickabout.field_G;
        L0: while (true) {
          var3 = param1.h((byte) -124);
          if (-1 != (var3 ^ -1)) {
            this.a(var3, param1, param0 ^ 118);
            continue L0;
          } else {
            L1: {
              if (param0 == -1) {
                break L1;
              } else {
                field_l = -19;
                break L1;
              }
            }
            return;
          }
        }
    }

    private nm(sj param0, int param1, int param2) {
        byte[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        byte[] var9 = null;
        byte[] var10 = null;
        byte[] var11 = null;
        L0: {
          ((nm) this).field_f = 0;
          ((nm) this).field_h = -1;
          ((nm) this).field_j = true;
          var11 = param0.b(param1, -32669, param2);
          var10 = var11;
          var9 = var10;
          var4 = var9;
          if (var9 == null) {
            break L0;
          } else {
            this.a(-1, new iw(var11));
            break L0;
          }
        }
        var5 = 0;
        var6 = 0;
        L1: while (true) {
          if (((nm) this).field_e.length <= var6) {
            var6 = 0;
            var7 = 0;
            L2: while (true) {
              if (((nm) this).field_c.length <= var7) {
              } else {
                if (((nm) this).field_c[var7] > var6) {
                  var6 = ((nm) this).field_c[var7];
                  var7++;
                  continue L2;
                } else {
                  var7++;
                  continue L2;
                }
              }
            }
          } else {
            if (var5 < ((nm) this).field_e[var6]) {
              var5 = ((nm) this).field_e[var6];
              var6++;
              continue L1;
            } else {
              var6++;
              continue L1;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        field_i = new int[89];
        field_b = new int[89];
        var0 = 0;
        L0: while (true) {
          if (var0 >= field_i.length) {
            field_l = 0;
            field_a = "All players have left <%0>'s game.";
          } else {
            L1: {
              if (-1 != (var0 ^ -1)) {
                if (1 != var0) {
                  if (2 == var0) {
                    field_i[var0] = 64;
                    break L1;
                  } else {
                    if (-4 != (var0 ^ -1)) {
                      if (var0 != 4) {
                        if (var0 == 5) {
                          field_i[var0] = 20;
                          break L1;
                        } else {
                          if (-7 == var0) {
                            field_i[var0] = 30;
                            break L1;
                          } else {
                            if (var0 != 7) {
                              if (-9 == var0) {
                                field_i[var0] = 30;
                                break L1;
                              } else {
                                if (var0 != 9) {
                                  if (var0 != -11) {
                                    if (var0 == 11) {
                                      field_i[var0] = 30;
                                      break L1;
                                    } else {
                                      if (12 == var0) {
                                        field_i[var0] = 30;
                                        break L1;
                                      } else {
                                        if (-14 != var0) {
                                          if (var0 == -15) {
                                            field_i[var0] = 30;
                                            break L1;
                                          } else {
                                            if (15 != var0) {
                                              if (-17 != var0) {
                                                if ((var0 ^ -1) != -18) {
                                                  if (18 != var0) {
                                                    if (19 == var0) {
                                                      field_i[var0] = 30;
                                                      break L1;
                                                    } else {
                                                      if (var0 == -21) {
                                                        field_i[var0] = 30;
                                                        break L1;
                                                      } else {
                                                        if (21 != var0) {
                                                          if (-23 != var0) {
                                                            if (23 == var0) {
                                                              field_i[var0] = 30;
                                                              break L1;
                                                            } else {
                                                              if (-25 != (var0 ^ -1)) {
                                                                if ((var0 ^ -1) == -26) {
                                                                  field_i[var0] = 30;
                                                                  break L1;
                                                                } else {
                                                                  if ((var0 ^ -1) != -27) {
                                                                    if (27 != var0) {
                                                                      if (28 == var0) {
                                                                        field_i[var0] = 80;
                                                                        break L1;
                                                                      } else {
                                                                        if (-30 == var0) {
                                                                          field_i[var0] = 80;
                                                                          break L1;
                                                                        } else {
                                                                          if (30 == var0) {
                                                                            field_i[var0] = 100;
                                                                            break L1;
                                                                          } else {
                                                                            if (-32 != var0) {
                                                                              if ((var0 ^ -1) != -33) {
                                                                                if ((var0 ^ -1) != -34) {
                                                                                  if (34 == var0) {
                                                                                    field_i[var0] = 64;
                                                                                    break L1;
                                                                                  } else {
                                                                                    if (var0 == 35) {
                                                                                      field_i[var0] = 70;
                                                                                      break L1;
                                                                                    } else {
                                                                                      if (36 != var0) {
                                                                                        if (37 != var0) {
                                                                                          if (38 != var0) {
                                                                                            if (39 != var0) {
                                                                                              if (var0 != -41) {
                                                                                                if (-42 == var0) {
                                                                                                  field_i[var0] = 64;
                                                                                                  break L1;
                                                                                                } else {
                                                                                                  if (var0 == -43) {
                                                                                                    field_i[var0] = 64;
                                                                                                    break L1;
                                                                                                  } else {
                                                                                                    if (var0 != 43) {
                                                                                                      if (-45 != var0) {
                                                                                                        if ((var0 ^ -1) == -46) {
                                                                                                          field_i[var0] = 256;
                                                                                                          break L1;
                                                                                                        } else {
                                                                                                          if ((var0 ^ -1) == -47) {
                                                                                                            field_i[var0] = 256;
                                                                                                            break L1;
                                                                                                          } else {
                                                                                                            if ((var0 ^ -1) != -48) {
                                                                                                              if (var0 != 48) {
                                                                                                                if (var0 != 49) {
                                                                                                                  if ((var0 ^ -1) != -51) {
                                                                                                                    if ((var0 ^ -1) != -52) {
                                                                                                                      if (52 == var0) {
                                                                                                                        field_i[var0] = 256;
                                                                                                                        break L1;
                                                                                                                      } else {
                                                                                                                        if (53 != var0) {
                                                                                                                          if (54 == var0) {
                                                                                                                            field_i[var0] = 256;
                                                                                                                            break L1;
                                                                                                                          } else {
                                                                                                                            if (55 == var0) {
                                                                                                                              field_i[var0] = 256;
                                                                                                                              break L1;
                                                                                                                            } else {
                                                                                                                              if (56 != var0) {
                                                                                                                                if ((var0 ^ -1) != -58) {
                                                                                                                                  if (var0 != 58) {
                                                                                                                                    if (var0 != 59) {
                                                                                                                                      if (60 != var0) {
                                                                                                                                        if ((var0 ^ -1) != -62) {
                                                                                                                                          if (var0 == 62) {
                                                                                                                                            field_i[var0] = 256;
                                                                                                                                            break L1;
                                                                                                                                          } else {
                                                                                                                                            if (var0 != 63) {
                                                                                                                                              if ((var0 ^ -1) != -65) {
                                                                                                                                                if ((var0 ^ -1) != -66) {
                                                                                                                                                  if (66 == var0) {
                                                                                                                                                    field_i[var0] = 256;
                                                                                                                                                    break L1;
                                                                                                                                                  } else {
                                                                                                                                                    if (var0 != 67) {
                                                                                                                                                      if (68 == var0) {
                                                                                                                                                        field_i[var0] = 256;
                                                                                                                                                        break L1;
                                                                                                                                                      } else {
                                                                                                                                                        if (var0 != 69) {
                                                                                                                                                          if (70 == var0) {
                                                                                                                                                            field_i[var0] = 256;
                                                                                                                                                            break L1;
                                                                                                                                                          } else {
                                                                                                                                                            if (-72 != var0) {
                                                                                                                                                              if (-73 == var0) {
                                                                                                                                                                field_i[var0] = 256;
                                                                                                                                                                break L1;
                                                                                                                                                              } else {
                                                                                                                                                                if (-74 != (var0 ^ -1)) {
                                                                                                                                                                  if (var0 != 74) {
                                                                                                                                                                    if ((var0 ^ -1) == -76) {
                                                                                                                                                                      field_i[var0] = 256;
                                                                                                                                                                      break L1;
                                                                                                                                                                    } else {
                                                                                                                                                                      if ((var0 ^ -1) == -77) {
                                                                                                                                                                        field_i[var0] = 256;
                                                                                                                                                                        break L1;
                                                                                                                                                                      } else {
                                                                                                                                                                        if ((var0 ^ -1) != -78) {
                                                                                                                                                                          if ((var0 ^ -1) == -79) {
                                                                                                                                                                            field_i[var0] = 256;
                                                                                                                                                                            break L1;
                                                                                                                                                                          } else {
                                                                                                                                                                            if (79 == var0) {
                                                                                                                                                                              field_i[var0] = 256;
                                                                                                                                                                              break L1;
                                                                                                                                                                            } else {
                                                                                                                                                                              if (80 != var0) {
                                                                                                                                                                                if (var0 == 81) {
                                                                                                                                                                                  field_i[var0] = 50;
                                                                                                                                                                                  break L1;
                                                                                                                                                                                } else {
                                                                                                                                                                                  if (82 != var0) {
                                                                                                                                                                                    if (var0 != -84) {
                                                                                                                                                                                      if (-85 == var0) {
                                                                                                                                                                                        field_i[var0] = 70;
                                                                                                                                                                                        break L1;
                                                                                                                                                                                      } else {
                                                                                                                                                                                        if (var0 == 85) {
                                                                                                                                                                                          field_i[var0] = 70;
                                                                                                                                                                                          break L1;
                                                                                                                                                                                        } else {
                                                                                                                                                                                          if (var0 == -87) {
                                                                                                                                                                                            field_i[var0] = 64;
                                                                                                                                                                                            break L1;
                                                                                                                                                                                          } else {
                                                                                                                                                                                            if (var0 == 87) {
                                                                                                                                                                                              field_i[var0] = 64;
                                                                                                                                                                                              break L1;
                                                                                                                                                                                            } else {
                                                                                                                                                                                              if (-89 == var0) {
                                                                                                                                                                                                field_i[var0] = 64;
                                                                                                                                                                                                break L1;
                                                                                                                                                                                              } else {
                                                                                                                                                                                                field_i[var0] = 256;
                                                                                                                                                                                                break L1;
                                                                                                                                                                                              }
                                                                                                                                                                                            }
                                                                                                                                                                                          }
                                                                                                                                                                                        }
                                                                                                                                                                                      }
                                                                                                                                                                                    } else {
                                                                                                                                                                                      field_i[var0] = 100;
                                                                                                                                                                                      break L1;
                                                                                                                                                                                    }
                                                                                                                                                                                  } else {
                                                                                                                                                                                    field_i[var0] = 100;
                                                                                                                                                                                    break L1;
                                                                                                                                                                                  }
                                                                                                                                                                                }
                                                                                                                                                                              } else {
                                                                                                                                                                                field_i[var0] = 50;
                                                                                                                                                                                break L1;
                                                                                                                                                                              }
                                                                                                                                                                            }
                                                                                                                                                                          }
                                                                                                                                                                        } else {
                                                                                                                                                                          field_i[var0] = 256;
                                                                                                                                                                          break L1;
                                                                                                                                                                        }
                                                                                                                                                                      }
                                                                                                                                                                    }
                                                                                                                                                                  } else {
                                                                                                                                                                    field_i[var0] = 256;
                                                                                                                                                                    break L1;
                                                                                                                                                                  }
                                                                                                                                                                } else {
                                                                                                                                                                  field_i[var0] = 256;
                                                                                                                                                                  break L1;
                                                                                                                                                                }
                                                                                                                                                              }
                                                                                                                                                            } else {
                                                                                                                                                              field_i[var0] = 256;
                                                                                                                                                              break L1;
                                                                                                                                                            }
                                                                                                                                                          }
                                                                                                                                                        } else {
                                                                                                                                                          field_i[var0] = 256;
                                                                                                                                                          break L1;
                                                                                                                                                        }
                                                                                                                                                      }
                                                                                                                                                    } else {
                                                                                                                                                      field_i[var0] = 256;
                                                                                                                                                      break L1;
                                                                                                                                                    }
                                                                                                                                                  }
                                                                                                                                                } else {
                                                                                                                                                  field_i[var0] = 256;
                                                                                                                                                  break L1;
                                                                                                                                                }
                                                                                                                                              } else {
                                                                                                                                                field_i[var0] = 256;
                                                                                                                                                break L1;
                                                                                                                                              }
                                                                                                                                            } else {
                                                                                                                                              field_i[var0] = 256;
                                                                                                                                              break L1;
                                                                                                                                            }
                                                                                                                                          }
                                                                                                                                        } else {
                                                                                                                                          field_i[var0] = 256;
                                                                                                                                          break L1;
                                                                                                                                        }
                                                                                                                                      } else {
                                                                                                                                        field_i[var0] = 256;
                                                                                                                                        break L1;
                                                                                                                                      }
                                                                                                                                    } else {
                                                                                                                                      field_i[var0] = 256;
                                                                                                                                      break L1;
                                                                                                                                    }
                                                                                                                                  } else {
                                                                                                                                    field_i[var0] = 256;
                                                                                                                                    break L1;
                                                                                                                                  }
                                                                                                                                } else {
                                                                                                                                  field_i[var0] = 256;
                                                                                                                                  break L1;
                                                                                                                                }
                                                                                                                              } else {
                                                                                                                                field_i[var0] = 256;
                                                                                                                                break L1;
                                                                                                                              }
                                                                                                                            }
                                                                                                                          }
                                                                                                                        } else {
                                                                                                                          field_i[var0] = 256;
                                                                                                                          break L1;
                                                                                                                        }
                                                                                                                      }
                                                                                                                    } else {
                                                                                                                      field_i[var0] = 256;
                                                                                                                      break L1;
                                                                                                                    }
                                                                                                                  } else {
                                                                                                                    field_i[var0] = 128;
                                                                                                                    break L1;
                                                                                                                  }
                                                                                                                } else {
                                                                                                                  field_i[var0] = 256;
                                                                                                                  break L1;
                                                                                                                }
                                                                                                              } else {
                                                                                                                field_i[var0] = 256;
                                                                                                                break L1;
                                                                                                              }
                                                                                                            } else {
                                                                                                              field_i[var0] = 256;
                                                                                                              break L1;
                                                                                                            }
                                                                                                          }
                                                                                                        }
                                                                                                      } else {
                                                                                                        field_i[var0] = 256;
                                                                                                        break L1;
                                                                                                      }
                                                                                                    } else {
                                                                                                      field_i[var0] = 155;
                                                                                                      break L1;
                                                                                                    }
                                                                                                  }
                                                                                                }
                                                                                              } else {
                                                                                                field_i[var0] = 64;
                                                                                                break L1;
                                                                                              }
                                                                                            } else {
                                                                                              field_i[var0] = 64;
                                                                                              break L1;
                                                                                            }
                                                                                          } else {
                                                                                            field_i[var0] = 64;
                                                                                            break L1;
                                                                                          }
                                                                                        } else {
                                                                                          field_i[var0] = 55;
                                                                                          break L1;
                                                                                        }
                                                                                      } else {
                                                                                        field_i[var0] = 40;
                                                                                        break L1;
                                                                                      }
                                                                                    }
                                                                                  }
                                                                                } else {
                                                                                  field_i[var0] = 64;
                                                                                  break L1;
                                                                                }
                                                                              } else {
                                                                                field_i[var0] = 72;
                                                                                break L1;
                                                                              }
                                                                            } else {
                                                                              field_i[var0] = 50;
                                                                              break L1;
                                                                            }
                                                                          }
                                                                        }
                                                                      }
                                                                    } else {
                                                                      field_i[var0] = 80;
                                                                      break L1;
                                                                    }
                                                                  } else {
                                                                    field_i[var0] = 50;
                                                                    break L1;
                                                                  }
                                                                }
                                                              } else {
                                                                field_i[var0] = 80;
                                                                break L1;
                                                              }
                                                            }
                                                          } else {
                                                            field_i[var0] = 30;
                                                            break L1;
                                                          }
                                                        } else {
                                                          field_i[var0] = 30;
                                                          break L1;
                                                        }
                                                      }
                                                    }
                                                  } else {
                                                    field_i[var0] = 30;
                                                    break L1;
                                                  }
                                                } else {
                                                  field_i[var0] = 30;
                                                  break L1;
                                                }
                                              } else {
                                                field_i[var0] = 30;
                                                break L1;
                                              }
                                            } else {
                                              field_i[var0] = 30;
                                              break L1;
                                            }
                                          }
                                        } else {
                                          field_i[var0] = 30;
                                          break L1;
                                        }
                                      }
                                    }
                                  } else {
                                    field_i[var0] = 30;
                                    break L1;
                                  }
                                } else {
                                  field_i[var0] = 30;
                                  break L1;
                                }
                              }
                            } else {
                              field_i[var0] = 30;
                              break L1;
                            }
                          }
                        }
                      } else {
                        field_i[var0] = 20;
                        break L1;
                      }
                    } else {
                      field_i[var0] = 26;
                      break L1;
                    }
                  }
                } else {
                  field_i[var0] = 64;
                  break L1;
                }
              } else {
                field_i[var0] = 64;
                break L1;
              }
            }
            field_b[var0] = field_i[var0];
            var0++;
            continue L0;
          }
        }
    }
}
