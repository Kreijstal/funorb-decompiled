/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hi {
    static String field_a;
    static int[] field_c;
    static ll field_d;
    static db[] field_b;

    final static short[] a(th param0, byte param1, int param2, short[] param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = Lexicominos.field_L ? 1 : 0;
        var4 = param0.g(param2, 26527);
        if (0 != var4) {
          L0: {
            L1: {
              if (param3 == null) {
                break L1;
              } else {
                if (param3.length == var4) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            param3 = new short[var4];
            break L0;
          }
          var5 = param0.g(4, 26527);
          if (param1 <= -32) {
            L2: {
              var6 = (short)param0.g(16, 26527);
              if ((var5 ^ -1) < -1) {
                var7 = 0;
                L3: while (true) {
                  if (var4 <= var7) {
                    break L2;
                  } else {
                    param3[var7] = (short)(param0.g(var5, 26527) + var6);
                    var7++;
                    continue L3;
                  }
                }
              } else {
                var7 = 0;
                L4: while (true) {
                  if (var7 >= var4) {
                    break L2;
                  } else {
                    param3[var7] = (short)var6;
                    var7++;
                    continue L4;
                  }
                }
              }
            }
            return param3;
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    final static void b(int param0) {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        long var3_long = 0L;
        int var4 = 0;
        int var5 = 0;
        String var6 = null;
        String var6_ref = null;
        int var7 = 0;
        int var8 = 0;
        wh var9 = null;
        int var10 = 0;
        int stackIn_15_0 = 0;
        int stackIn_18_0 = 0;
        String stackIn_24_0 = null;
        String stackIn_31_0 = null;
        String stackIn_35_0 = null;
        String stackIn_36_0 = null;
        String stackIn_37_0 = null;
        int stackIn_37_1 = 0;
        wh stackIn_42_0 = null;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_16_0 = 0;
        String stackOut_23_0 = null;
        String stackOut_22_0 = null;
        String stackOut_30_0 = null;
        String stackOut_29_0 = null;
        String stackOut_34_0 = null;
        String stackOut_36_0 = null;
        int stackOut_36_1 = 0;
        String stackOut_35_0 = null;
        int stackOut_35_1 = 0;
        wh stackOut_41_0 = null;
        wh stackOut_40_0 = null;
        L0: {
          var10 = Lexicominos.field_L ? 1 : 0;
          var1 = rf.field_c;
          var2 = param0;
          if (-3 != (sh.field_a ^ -1)) {
            break L0;
          } else {
            var3_long = -ug.field_x + rf.c(param0 + 0);
            var2 = (int)((-var3_long + 10999L) / 1000L);
            if (var2 >= 0) {
              break L0;
            } else {
              var2 = 0;
              break L0;
            }
          }
        }
        var3 = 0;
        L1: while (true) {
          if (ee.field_g.length <= var3) {
            return;
          } else {
            L2: {
              var4 = ni.field_a[var3];
              if (var4 >= 0) {
                if (bc.field_H.field_d == var4) {
                  var5 = g.field_n;
                  break L2;
                } else {
                  var5 = ec.field_c;
                  break L2;
                }
              } else {
                var5 = ea.field_b;
                break L2;
              }
            }
            L3: {
              var6 = ee.field_g[var3];
              if (sh.field_a != 2) {
                break L3;
              } else {
                if (var2 != 1) {
                  break L3;
                } else {
                  L4: {
                    if (hf.field_b.length > ed.field_t.length) {
                      stackOut_14_0 = hf.field_b.length;
                      stackIn_15_0 = stackOut_14_0;
                      break L4;
                    } else {
                      stackOut_13_0 = ed.field_t.length;
                      stackIn_15_0 = stackOut_13_0;
                      break L4;
                    }
                  }
                  L5: {
                    var7 = stackIn_15_0;
                    if (qc.field_e.length < nl.field_a.length) {
                      stackOut_17_0 = nl.field_a.length;
                      stackIn_18_0 = stackOut_17_0;
                      break L5;
                    } else {
                      stackOut_16_0 = qc.field_e.length;
                      stackIn_18_0 = stackOut_16_0;
                      break L5;
                    }
                  }
                  L6: {
                    var8 = stackIn_18_0;
                    if (6 > var3) {
                      break L6;
                    } else {
                      if (var7 + 6 > var3) {
                        L7: {
                          if (0 <= var3 - (6 + -ed.field_t.length) + -var7) {
                            stackOut_23_0 = ed.field_t[-var7 + ed.field_t.length + (-6 + var3)];
                            stackIn_24_0 = stackOut_23_0;
                            break L7;
                          } else {
                            stackOut_22_0 = "";
                            stackIn_24_0 = stackOut_22_0;
                            break L7;
                          }
                        }
                        var6_ref = stackIn_24_0;
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                  }
                  if (var7 + 7 > var3) {
                    break L3;
                  } else {
                    if (var8 + (7 - -var7) > var3) {
                      L8: {
                        if (qc.field_e.length <= -var7 + -7 + var3) {
                          stackOut_30_0 = "";
                          stackIn_31_0 = stackOut_30_0;
                          break L8;
                        } else {
                          stackOut_29_0 = qc.field_e[-var7 + (-7 + var3)];
                          stackIn_31_0 = stackOut_29_0;
                          break L8;
                        }
                      }
                      var6_ref = stackIn_31_0;
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                }
              }
            }
            L9: {
              if ((var4 ^ -1) != 1) {
                break L9;
              } else {
                var6_ref = Integer.toString(var2);
                break L9;
              }
            }
            L10: {
              stackOut_34_0 = (String) var6_ref;
              stackIn_36_0 = stackOut_34_0;
              stackIn_35_0 = stackOut_34_0;
              if ((var4 ^ -1) > -1) {
                stackOut_36_0 = (String) (Object) stackIn_36_0;
                stackOut_36_1 = 0;
                stackIn_37_0 = stackOut_36_0;
                stackIn_37_1 = stackOut_36_1;
                break L10;
              } else {
                stackOut_35_0 = (String) (Object) stackIn_35_0;
                stackOut_35_1 = 1;
                stackIn_37_0 = stackOut_35_0;
                stackIn_37_1 = stackOut_35_1;
                break L10;
              }
            }
            L11: {
              var7 = ii.a(stackIn_37_0, stackIn_37_1 != 0, 0);
              var8 = -(var7 >> -1686790367) + uh.field_D;
              if ((var4 ^ -1) <= -1) {
                L12: {
                  if (bc.field_H.field_d != var4) {
                    stackOut_41_0 = sc.field_d;
                    stackIn_42_0 = stackOut_41_0;
                    break L12;
                  } else {
                    stackOut_40_0 = fg.field_c;
                    stackIn_42_0 = stackOut_40_0;
                    break L12;
                  }
                }
                L13: {
                  var9 = stackIn_42_0;
                  var1 = var1 + we.field_l;
                  if (var9 == null) {
                    break L13;
                  } else {
                    var9.a(var1, (oh.field_b << -2026513727) + fb.field_g, var7 - -(jh.field_e << 1912526497), var8 + -jh.field_e, -1160208572);
                    break L13;
                  }
                }
                var1 = var1 + oh.field_b;
                break L11;
              } else {
                break L11;
              }
            }
            if (var4 < 0) {
              pb.field_i.b(var6_ref, var8, var1 + sb.field_f, var5, -1);
              var1 = var1 + hc.field_fb;
              var3++;
              continue L1;
            } else {
              fb.field_m.b(var6_ref, var8, var1 - -kk.field_o, var5, -1);
              var1 = var1 + (oh.field_b - -we.field_l + fb.field_g);
              var3++;
              continue L1;
            }
          }
        }
    }

    public static void a(int param0) {
        field_d = null;
        field_b = null;
        field_a = null;
        field_c = null;
        if (param0 != 5) {
            field_c = null;
        }
    }

    final static boolean a(int param0, char param1) {
        int stackIn_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        L0: {
          if (param0 == 18670) {
            break L0;
          } else {
            field_d = null;
            break L0;
          }
        }
        L1: {
          L2: {
            L3: {
              if (param1 < 65) {
                break L3;
              } else {
                if (90 >= param1) {
                  break L2;
                } else {
                  break L3;
                }
              }
            }
            L4: {
              if (param1 < 97) {
                break L4;
              } else {
                if (param1 > 122) {
                  break L4;
                } else {
                  break L2;
                }
              }
            }
            stackOut_9_0 = 0;
            stackIn_10_0 = stackOut_9_0;
            break L1;
          }
          stackOut_8_0 = 1;
          stackIn_10_0 = stackOut_8_0;
          break L1;
        }
        return stackIn_10_0 != 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new int[]{2, 2, 3, 5, 1, 2, 3, 5, 3, 5, 10, 1, 3, 5, 10, 2};
        field_a = "Create your own free Jagex account";
    }
}
