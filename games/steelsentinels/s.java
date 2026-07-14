/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class s implements qk {
    static int field_a;
    static String field_b;

    final static void b(int param0) {
        int var1 = 0;
        if (32 < ll.field_q) {
            var1 = ll.field_q % 32;
            if (var1 == 0) {
                var1 = 32;
            }
            ef.a(1, -var1 + ll.field_q);
        } else {
            ef.a(1, 0);
        }
        if (param0 < 124) {
            field_b = null;
        }
    }

    final static void a(gi param0, int param1, int param2, int param3, int param4) {
        param0.a((byte) 112, param1);
        param0.d(17, 77);
        param0.d(param3, 107);
        param0.d(param2, param1 + 108);
        param0.a((byte) 109, param4);
    }

    final static void a(int param0, boolean param1, boolean param2, int param3, int param4, int param5) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        L0: {
          var9 = SteelSentinels.field_G;
          if (param0 == -1) {
            break L0;
          } else {
            var6 = 0;
            L1: while (true) {
              if (11 <= var6) {
                break L0;
              } else {
                L2: {
                  var7 = 10;
                  if ((var6 ^ -1) > -6) {
                    var7 = var6 * 2 + 2;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  if (5 >= var6) {
                    break L3;
                  } else {
                    var7 = (-var6 + 10) * 2 + 2;
                    break L3;
                  }
                }
                if (!param2) {
                  pb.g(param4 - 5, var6 + param3 - 5, var7, param0);
                  var6++;
                  continue L1;
                } else {
                  pb.g(6 + (param4 + -var7), param3 + -5 - -var6, var7, param0);
                  var6++;
                  continue L1;
                }
              }
            }
          }
        }
        L4: {
          if (-1 == param5) {
            break L4;
          } else {
            if (!param2) {
              pb.d(-5 + param4, param3 + -5, 11, param5);
              pb.d(param4 + -4, param3 - 5, 5 + param4, param3, param5);
              pb.d(-4 + param4, 5 + param3, param4 + 5, param3, param5);
              break L4;
            } else {
              pb.d(param4 - -5, param3 + -5, 11, param5);
              pb.d(param4 - -4, param3 - 5, -5 + param4, param3, param5);
              pb.d(4 + param4, 5 + param3, param4 + -5, param3, param5);
              break L4;
            }
          }
        }
        if ((param4 ^ -1) != 0) {
          return;
        } else {
          L5: {
            var6 = param4 + -10;
            var7 = param4 + 10;
            if (param0 != -1) {
              pb.a(var6, -2 + param3, 20, 5, param0);
              var8 = 0;
              L6: while (true) {
                if (5 <= var8) {
                  break L5;
                } else {
                  if (!param2) {
                    pb.d(-var8 + 3 + var7, param3, -7 + (-var8 + 3) + var7, param3 - 7, param0);
                    pb.d(var7 - -3 - var8, param3, -7 + -var8 + (var7 - -3), 7 + param3, param0);
                    var8++;
                    continue L6;
                  } else {
                    pb.d(-3 + var6 - -var8, param3, 7 + var6 + (-3 + var8), param3 + -7, param0);
                    pb.d(var8 + var6 - 3, param3, 7 + (-3 + var6) - -var8, 7 + param3, param0);
                    var8++;
                    continue L6;
                  }
                }
              }
            } else {
              break L5;
            }
          }
          L7: {
            if (param5 == -1) {
              break L7;
            } else {
              if (param2) {
                pb.d(var6 - 3, param3, 4 + var6, -7 + param3, param5);
                pb.g(var6 - -4, param3 + -7, 4, param5);
                pb.d(8 + var6, param3 + -7, var6 + 4, param3 - 3, param5);
                pb.g(4 + var6, param3 - 3, 16, param5);
                pb.d(var6 + -3, param3, 4 + var6, 7 + param3, param5);
                pb.g(4 + var6, 7 + param3, 4, param5);
                pb.d(var6 - -8, 7 + param3, var6 - -4, param3 - -3, param5);
                pb.g(var6 - -4, param3 - -3, 16, param5);
                pb.d(var7 - 1, param3 + -3, 6, param5);
                break L7;
              } else {
                pb.d(3 + var7, param3, -4 + var7, -7 + param3, param5);
                pb.g(-4 + var7 - 4, param3 - 7, 4, param5);
                pb.d(var7 - 8, -7 + param3, var7 - 4, -3 + param3, param5);
                pb.g(-16 + (-4 + var7), param3 + -3, 16, param5);
                pb.d(3 + var7, param3, var7 - 4, 7 + param3, param5);
                pb.g(-8 + var7, 7 + param3, 4, param5);
                pb.d(-8 + var7, param3 + 7, -4 + var7, 3 + param3, param5);
                pb.g(-4 + var7 + -16, param3 + 3, 16, param5);
                pb.d(var6, param3 + -3, 6, param5);
                break L7;
              }
            }
          }
          L8: {
            if (param1) {
              break L8;
            } else {
              s.b(-92);
              break L8;
            }
          }
          return;
        }
    }

    final static int a(int param0, boolean param1) {
        int var2 = 0;
        int var3 = 0;
        L0: {
          var3 = SteelSentinels.field_G;
          if (!param1) {
            break L0;
          } else {
            field_a = 125;
            break L0;
          }
        }
        var2 = param0;
        if (-1 != (var2 ^ -1)) {
          if (1 == var2) {
            return 2;
          } else {
            if (var2 == 2) {
              return 3;
            } else {
              if (var2 != 3) {
                if (var2 == 4) {
                  return 5;
                } else {
                  if ((var2 ^ -1) != -21) {
                    if (var2 == 5) {
                      return 1;
                    } else {
                      if ((var2 ^ -1) == -7) {
                        return 2;
                      } else {
                        if (var2 != 7) {
                          if (var2 != -9) {
                            if (-10 != var2) {
                              if (var2 != 10) {
                                if ((var2 ^ -1) == -12) {
                                  return 2;
                                } else {
                                  if (12 == var2) {
                                    return 5;
                                  } else {
                                    if ((var2 ^ -1) != -14) {
                                      if (14 == var2) {
                                        return 20;
                                      } else {
                                        return 0;
                                      }
                                    } else {
                                      return 10;
                                    }
                                  }
                                }
                              } else {
                                return 1;
                              }
                            } else {
                              return 5;
                            }
                          } else {
                            return 4;
                          }
                        } else {
                          return 3;
                        }
                      }
                    }
                  } else {
                    return 10;
                  }
                }
              } else {
                return 4;
              }
            }
          }
        } else {
          return 1;
        }
    }

    final static void a(int param0) {
        if (ag.field_p != null) {
            ag.field_p.g((byte) 103);
        }
        if (!(r.field_r == null)) {
            r.field_r.m(-13521);
        }
        ca.d(-30603);
        if (param0 != 10) {
            field_b = null;
        }
    }

    public static void a(byte param0) {
        field_b = null;
        int var1 = -115 % ((param0 - 47) / 58);
    }

    public final void a(int param0, lh param1, byte param2, boolean param3, int param4) {
        if (param2 != -30) {
            s.a((byte) -83);
        }
        int var6 = param0 + param1.field_o;
        int var7 = param1.field_z + param4;
        ra.a(var7, param1.field_x, param1.field_E, var6, (byte) 120);
        wk var8 = t.field_i[1];
        if (param1 instanceof oa) {
            if (!(!((oa) (Object) param1).field_T)) {
                var8.a(1 + (var6 + (param1.field_x - var8.field_z >> 375283361)), (-var8.field_B + param1.field_E >> -1234744735) + (1 + var7), 256);
            }
        }
        if (!(!param1.d(0))) {
            ha.a(var6 - -2, -4 + param1.field_x, -4 + param1.field_E, param2 + 30, 2 + var7);
        }
    }

    final static short[] a(short[] param0, int param1, kj param2, boolean param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        Object var9 = null;
        var8 = SteelSentinels.field_G;
        var4 = param2.g(-118, param1);
        if (var4 != 0) {
          L0: {
            L1: {
              if (param0 == null) {
                break L1;
              } else {
                if (param0.length == var4) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            param0 = new short[var4];
            break L0;
          }
          L2: {
            var5 = param2.g(20, 4);
            var6 = (short)param2.g(-91, 16);
            if (!param3) {
              break L2;
            } else {
              var9 = null;
              short[] discarded$2 = s.a((short[]) null, 108, (kj) null, false);
              break L2;
            }
          }
          L3: {
            if (var5 > 0) {
              var7 = 0;
              L4: while (true) {
                if (var7 >= var4) {
                  break L3;
                } else {
                  param0[var7] = (short)(var6 + param2.g(36, var5));
                  var7++;
                  continue L4;
                }
              }
            } else {
              var7 = 0;
              L5: while (true) {
                if (var4 <= var7) {
                  break L3;
                } else {
                  param0[var7] = (short)var6;
                  var7++;
                  continue L5;
                }
              }
            }
          }
          return param0;
        } else {
          return null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = 0;
        field_b = "<%0> has lost connection.";
    }
}
