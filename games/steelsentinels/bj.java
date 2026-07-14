/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bj {
    int field_n;
    int field_g;
    static gh field_d;
    int field_e;
    int field_q;
    int field_i;
    byte[] field_p;
    static String field_a;
    static int field_h;
    byte[] field_m;
    static String field_c;
    int field_o;
    static String field_f;
    static String[] field_l;
    static int[] field_b;
    int field_k;
    static int field_j;

    final static void a(int param0, java.applet.Applet param1) {
        String var2 = null;
        String var3 = null;
        long var4 = 0L;
        sn.field_d = true;
        var2 = "tuhstatbut";
        if (param0 >= -48) {
          return;
        } else {
          var3 = "rvnadlm";
          var4 = -1L;
          mm.a(var2, (byte) 97, var3, param1, var4);
          return;
        }
    }

    public static void a(int param0) {
        field_c = null;
        field_d = null;
        field_b = null;
        field_l = null;
        field_a = null;
        if (param0 != 7) {
          bj.a(74);
          field_f = null;
          return;
        } else {
          field_f = null;
          return;
        }
    }

    final static boolean a(int[] param0, int param1, boolean param2, byte param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        Object var9 = null;
        int stackIn_18_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_46_0 = 0;
        int stackIn_56_0 = 0;
        int stackIn_60_0 = 0;
        int stackIn_80_0 = 0;
        int stackIn_90_0 = 0;
        int stackIn_95_0 = 0;
        int stackIn_107_0 = 0;
        int stackIn_117_0 = 0;
        int stackIn_121_0 = 0;
        int stackOut_106_0 = 0;
        int stackOut_105_0 = 0;
        int stackOut_120_0 = 0;
        int stackOut_119_0 = 0;
        int stackOut_116_0 = 0;
        int stackOut_115_0 = 0;
        int stackOut_79_0 = 0;
        int stackOut_78_0 = 0;
        int stackOut_93_0 = 0;
        int stackOut_89_0 = 0;
        int stackOut_88_0 = 0;
        int stackOut_94_0 = 0;
        int stackOut_45_0 = 0;
        int stackOut_44_0 = 0;
        int stackOut_59_0 = 0;
        int stackOut_58_0 = 0;
        int stackOut_55_0 = 0;
        int stackOut_54_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_28_0 = 0;
        var8 = SteelSentinels.field_G;
        if (param3 >= 81) {
          var4 = ul.a((byte) 71, param1);
          if ((var4 ^ -1) > -1) {
            return false;
          } else {
            if (var4 <= -4) {
              if (-7 > var4) {
                var5 = 0;
                var6 = 0;
                L0: while (true) {
                  if (-7 >= (var6 ^ -1)) {
                    if (6 > var4) {
                      L1: {
                        if (var4 >= var5 + 2) {
                          stackOut_106_0 = 0;
                          stackIn_107_0 = stackOut_106_0;
                          break L1;
                        } else {
                          stackOut_105_0 = 1;
                          stackIn_107_0 = stackOut_105_0;
                          break L1;
                        }
                      }
                      return stackIn_107_0 != 0;
                    } else {
                      var6 = 0;
                      var7 = 6;
                      L2: while (true) {
                        if (n.field_z.length <= var7) {
                          var7 = var6 + 7;
                          if (-7 != (var5 ^ -1)) {
                            L3: {
                              if (var4 >= var7) {
                                stackOut_120_0 = 0;
                                stackIn_121_0 = stackOut_120_0;
                                break L3;
                              } else {
                                stackOut_119_0 = 1;
                                stackIn_121_0 = stackOut_119_0;
                                break L3;
                              }
                            }
                            return stackIn_121_0 != 0;
                          } else {
                            L4: {
                              var7++;
                              if (var4 >= var7) {
                                stackOut_116_0 = 0;
                                stackIn_117_0 = stackOut_116_0;
                                break L4;
                              } else {
                                stackOut_115_0 = 1;
                                stackIn_117_0 = stackOut_115_0;
                                break L4;
                              }
                            }
                            return stackIn_117_0 != 0;
                          }
                        } else {
                          if (t.a(param0, n.field_z[var7], -20370)) {
                            var6++;
                            var7++;
                            continue L2;
                          } else {
                            var7++;
                            continue L2;
                          }
                        }
                      }
                    }
                  } else {
                    if (t.a(param0, n.field_z[var6], -20370)) {
                      var5++;
                      var6++;
                      continue L0;
                    } else {
                      var6++;
                      continue L0;
                    }
                  }
                }
              } else {
                L5: {
                  L6: {
                    if (!param2) {
                      break L6;
                    } else {
                      var5 = 0;
                      var6 = 0;
                      L7: while (true) {
                        if (-7 >= (var6 ^ -1)) {
                          if (6 > var4) {
                            L8: {
                              if (var4 >= var5 + 2) {
                                stackOut_79_0 = 0;
                                stackIn_80_0 = stackOut_79_0;
                                break L8;
                              } else {
                                stackOut_78_0 = 1;
                                stackIn_80_0 = stackOut_78_0;
                                break L8;
                              }
                            }
                            return stackIn_80_0 != 0;
                          } else {
                            var6 = 0;
                            var7 = 6;
                            L9: while (true) {
                              if (n.field_z.length <= var7) {
                                var7 = var6 + 7;
                                if (-7 != var5) {
                                  if (var4 >= var7) {
                                    break L6;
                                  } else {
                                    stackOut_93_0 = 1;
                                    stackIn_95_0 = stackOut_93_0;
                                    break L5;
                                  }
                                } else {
                                  L10: {
                                    var7++;
                                    if (var4 >= var7) {
                                      stackOut_89_0 = 0;
                                      stackIn_90_0 = stackOut_89_0;
                                      break L10;
                                    } else {
                                      stackOut_88_0 = 1;
                                      stackIn_90_0 = stackOut_88_0;
                                      break L10;
                                    }
                                  }
                                  return stackIn_90_0 != 0;
                                }
                              } else {
                                if (t.a(param0, n.field_z[var7], -20370)) {
                                  var6++;
                                  var7++;
                                  continue L9;
                                } else {
                                  var7++;
                                  continue L9;
                                }
                              }
                            }
                          }
                        } else {
                          if (t.a(param0, n.field_z[var6], -20370)) {
                            var5++;
                            var6++;
                            continue L7;
                          } else {
                            var6++;
                            continue L7;
                          }
                        }
                      }
                    }
                  }
                  stackOut_94_0 = 0;
                  stackIn_95_0 = stackOut_94_0;
                  break L5;
                }
                return stackIn_95_0 != 0;
              }
            } else {
              return true;
            }
          }
        } else {
          var9 = null;
          boolean discarded$1 = bj.a((int[]) null, 21, true, (byte) -121);
          var4 = ul.a((byte) 71, param1);
          if ((var4 ^ -1) > -1) {
            return false;
          } else {
            if (var4 <= -4) {
              if (-7 <= var4) {
                if (!param2) {
                  return false;
                } else {
                  L11: {
                    var5 = 0;
                    var6 = 0;
                    if (-7 >= (var6 ^ -1)) {
                      break L11;
                    } else {
                      L12: {
                        if (t.a(param0, n.field_z[var6], -20370)) {
                          var5++;
                          break L12;
                        } else {
                          var6++;
                          break L12;
                        }
                      }
                      var6++;
                      var6++;
                      break L11;
                    }
                  }
                  if (6 > var4) {
                    L13: {
                      if (var4 >= var5 + 2) {
                        stackOut_45_0 = 0;
                        stackIn_46_0 = stackOut_45_0;
                        break L13;
                      } else {
                        stackOut_44_0 = 1;
                        stackIn_46_0 = stackOut_44_0;
                        break L13;
                      }
                    }
                    return stackIn_46_0 != 0;
                  } else {
                    var6 = 0;
                    var7 = 6;
                    L14: while (true) {
                      if (n.field_z.length <= var7) {
                        var7 = var6 + 7;
                        if (-7 != var5) {
                          L15: {
                            if (var4 >= var7) {
                              stackOut_59_0 = 0;
                              stackIn_60_0 = stackOut_59_0;
                              break L15;
                            } else {
                              stackOut_58_0 = 1;
                              stackIn_60_0 = stackOut_58_0;
                              break L15;
                            }
                          }
                          return stackIn_60_0 != 0;
                        } else {
                          L16: {
                            var7++;
                            if (var4 >= var7) {
                              stackOut_55_0 = 0;
                              stackIn_56_0 = stackOut_55_0;
                              break L16;
                            } else {
                              stackOut_54_0 = 1;
                              stackIn_56_0 = stackOut_54_0;
                              break L16;
                            }
                          }
                          return stackIn_56_0 != 0;
                        }
                      } else {
                        if (t.a(param0, n.field_z[var7], -20370)) {
                          var6++;
                          var7++;
                          continue L14;
                        } else {
                          var7++;
                          continue L14;
                        }
                      }
                    }
                  }
                }
              } else {
                L17: {
                  var5 = 0;
                  var6 = 0;
                  if (-7 >= (var6 ^ -1)) {
                    break L17;
                  } else {
                    L18: {
                      if (t.a(param0, n.field_z[var6], -20370)) {
                        var5++;
                        break L18;
                      } else {
                        var6++;
                        break L18;
                      }
                    }
                    var6++;
                    var6++;
                    var6++;
                    break L17;
                  }
                }
                if (6 > var4) {
                  L19: {
                    if (var4 >= var5 + 2) {
                      stackOut_17_0 = 0;
                      stackIn_18_0 = stackOut_17_0;
                      break L19;
                    } else {
                      stackOut_16_0 = 1;
                      stackIn_18_0 = stackOut_16_0;
                      break L19;
                    }
                  }
                  return stackIn_18_0 != 0;
                } else {
                  var6 = 0;
                  var7 = 6;
                  L20: while (true) {
                    if (n.field_z.length <= var7) {
                      L21: {
                        var7 = var6 + 7;
                        if (-7 != (var5 ^ -1)) {
                          break L21;
                        } else {
                          var7++;
                          break L21;
                        }
                      }
                      L22: {
                        if (var4 >= var7) {
                          stackOut_29_0 = 0;
                          stackIn_30_0 = stackOut_29_0;
                          break L22;
                        } else {
                          stackOut_28_0 = 1;
                          stackIn_30_0 = stackOut_28_0;
                          break L22;
                        }
                      }
                      return stackIn_30_0 != 0;
                    } else {
                      if (t.a(param0, n.field_z[var7], -20370)) {
                        var6++;
                        var7++;
                        continue L20;
                      } else {
                        var7++;
                        continue L20;
                      }
                    }
                  }
                }
              }
            } else {
              return true;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "This option is restricted. Your rating is currently <%0>.<br>Can you achieve the qualifying rating of <%1>?";
        field_a = "You haven't enough solarite cubes to engineer the <%0> at this time.<br>Earn more solarite cubes by playing Rated games.";
        field_f = "Staff impersonation";
        field_l = new String[]{"Most kills<%0>", " (You got <%0>)", "Most damage dealt<%0>", " (You dealt <%0>)", "Longest killing streak<%0>", " (Yours: <%0>)", "First kill", null, "Fewest deaths<%0>", " (You died <%0>)", "Perfect", " (You died <%0>)", "Sole survivor", null, "Longest flight<%0>", " (Yours: <%0>)", "Highest score", null, "Most interceptions<%0>", " (You got <%0>)", "Best kill combo<%0>", " (Yours: <%0>)", "Most melee kills<%0>", " (You got <%0>)", "Most gun/flak kills<%0>", " (You got <%0>)", "Most cannon/mortar kills<%0>", " (You got <%0>)", "Most rail gun kills<%0>", " (You got <%0>)", "Most beam kills<%0>", " (You got <%0>)", "Most plasma kills<%0>", " (You got <%0>)", "Most rocket/missile kills<%0>", " (You got <%0>)", "Most kills with atomics<%0>", " (You got <%0>)", "Most ship energises<%0>", " (You got <%0>)", "First to energise ship", null, "Killed most energised enemies<%0>", " (You got <%0>)", "Finished with MGFN", null, "Most kills while holding MGFN<%0>", " (You got <%0>)", "Most time with MGFN<%0>", " (Yours: <%0>)", "Highest scoring team<%0>", " (Your team: <%0>)", "Boss killer", null, "Best sniper accuracy<%0>", " (Yours: <%0>)", "Most power-ups<%0>", " (You got <%0>)", "Most kills of MGFN sentinels<%0>", " (You got <%0>)", "Most time in the energy shield<%0>", " (Yours: <%0>)", "Most bat kills<%0>", " (You got <%0>)"};
        field_b = new int[]{17, 18, 3, 22, -1, 8};
    }
}
