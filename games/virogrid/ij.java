/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ij extends l {
    static km field_m;
    static String field_i;
    int field_o;
    boolean field_p;
    int field_l;
    static km field_k;
    static nh[] field_n;
    static String field_h;
    static int field_q;
    int field_g;
    static na field_j;

    public static void a(int param0) {
        field_m = null;
        if (param0 != -25621) {
            field_n = null;
        }
        field_k = null;
        field_h = null;
        field_n = null;
        field_j = null;
        field_i = null;
    }

    final static int a(int param0, int param1, int param2) {
        if (param2 != 1) {
            return 48;
        }
        if ((param1 ^ -1) <= -3) {
            return 2;
        }
        if ((param0 ^ -1) <= -6) {
            return 1;
        }
        return 0;
    }

    final static void a(int[] param0, int param1, int param2, int param3, int[] param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int stackIn_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        L0: {
          var14 = Virogrid.field_F ? 1 : 0;
          var5 = -42 % ((param2 - -82) / 42);
          if (param1 >= param3) {
            break L0;
          } else {
            L1: {
              var6 = (param3 + param1) / 2;
              var7 = param1;
              var8 = param0[var6];
              param0[var6] = param0[param3];
              param0[param3] = var8;
              var9 = param4[var6];
              param4[var6] = param4[param3];
              param4[param3] = var9;
              if (-2147483648 != (var8 ^ -1)) {
                stackOut_3_0 = 1;
                stackIn_4_0 = stackOut_3_0;
                break L1;
              } else {
                stackOut_2_0 = 0;
                stackIn_4_0 = stackOut_2_0;
                break L1;
              }
            }
            var10 = stackIn_4_0;
            var11 = param1;
            L2: while (true) {
              if (var11 >= param3) {
                param0[param3] = param0[var7];
                param0[var7] = var8;
                param4[param3] = param4[var7];
                param4[var7] = var9;
                ij.a(param0, param1, 40, var7 - 1, param4);
                ij.a(param0, 1 + var7, -127, param3, param4);
                break L0;
              } else {
                if (param0[var11] > -(var10 & var11) + var8) {
                  var12 = param0[var11];
                  param0[var11] = param0[var7];
                  param0[var7] = var12;
                  var13 = param4[var11];
                  param4[var11] = param4[var7];
                  var7++;
                  param4[var7] = var13;
                  var11++;
                  continue L2;
                } else {
                  var11++;
                  continue L2;
                }
              }
            }
          }
        }
    }

    final static byte a(char param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        var3 = Virogrid.field_F ? 1 : 0;
        if (param1 == 4290) {
          L0: {
            L1: {
              L2: {
                if (param0 <= 0) {
                  break L2;
                } else {
                  if (param0 < 128) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              L3: {
                if (param0 < 160) {
                  break L3;
                } else {
                  if (param0 > 255) {
                    break L3;
                  } else {
                    break L1;
                  }
                }
              }
              if (8364 != param0) {
                if (8218 == param0) {
                  var2 = -126;
                  break L0;
                } else {
                  if (402 != param0) {
                    if (param0 == 8222) {
                      var2 = -124;
                      break L0;
                    } else {
                      if (param0 != 8230) {
                        if (8224 != param0) {
                          if (8225 != param0) {
                            if (param0 != 710) {
                              if (param0 != 8240) {
                                if (param0 != 352) {
                                  if (param0 != 8249) {
                                    if (param0 == 338) {
                                      var2 = -116;
                                      break L0;
                                    } else {
                                      if (param0 != 381) {
                                        if (param0 != 8216) {
                                          if (param0 != 8217) {
                                            if (8220 != param0) {
                                              if (8221 == param0) {
                                                var2 = -108;
                                                break L0;
                                              } else {
                                                if (param0 != 8226) {
                                                  if (8211 != param0) {
                                                    if (param0 == 8212) {
                                                      var2 = -105;
                                                      break L0;
                                                    } else {
                                                      if (param0 == 732) {
                                                        var2 = -104;
                                                        break L0;
                                                      } else {
                                                        if (param0 != 8482) {
                                                          if (param0 != 353) {
                                                            if (param0 == 8250) {
                                                              var2 = -101;
                                                              break L0;
                                                            } else {
                                                              if (param0 != 339) {
                                                                if (382 == param0) {
                                                                  var2 = -98;
                                                                  break L0;
                                                                } else {
                                                                  if (376 != param0) {
                                                                    var2 = 63;
                                                                    break L0;
                                                                  } else {
                                                                    var2 = -97;
                                                                    break L0;
                                                                  }
                                                                }
                                                              } else {
                                                                var2 = -100;
                                                                break L0;
                                                              }
                                                            }
                                                          } else {
                                                            var2 = -102;
                                                            break L0;
                                                          }
                                                        } else {
                                                          var2 = -103;
                                                          break L0;
                                                        }
                                                      }
                                                    }
                                                  } else {
                                                    var2 = -106;
                                                    break L0;
                                                  }
                                                } else {
                                                  var2 = -107;
                                                  break L0;
                                                }
                                              }
                                            } else {
                                              var2 = -109;
                                              break L0;
                                            }
                                          } else {
                                            var2 = -110;
                                            break L0;
                                          }
                                        } else {
                                          var2 = -111;
                                          break L0;
                                        }
                                      } else {
                                        var2 = -114;
                                        break L0;
                                      }
                                    }
                                  } else {
                                    var2 = -117;
                                    break L0;
                                  }
                                } else {
                                  var2 = -118;
                                  break L0;
                                }
                              } else {
                                var2 = -119;
                                break L0;
                              }
                            } else {
                              var2 = -120;
                              break L0;
                            }
                          } else {
                            var2 = -121;
                            break L0;
                          }
                        } else {
                          var2 = -122;
                          break L0;
                        }
                      } else {
                        var2 = -123;
                        break L0;
                      }
                    }
                  } else {
                    var2 = -125;
                    break L0;
                  }
                }
              } else {
                var2 = -128;
                break L0;
              }
            }
            var2 = (byte)param0;
            break L0;
          }
          return (byte) var2;
        } else {
          return (byte) -125;
        }
    }

    ij(int param0, boolean param1, int param2) {
        ((ij) this).field_g = param0;
        ((ij) this).field_l = param2;
        ((ij) this).field_p = param1 ? true : false;
        ((ij) this).field_o = 0;
    }

    final static void a(byte param0) {
        int var1 = id.field_r / 2;
        String var2 = jk.field_e;
        if (db.b((byte) 13, 0)) {
            var2 = ge.field_a;
        }
        String var3 = var2.substring(0, var1 <= var2.length() ? var1 : var2.length());
        int discarded$14 = mc.field_b.a(var3, 120, 100, 400, 200, 1141646, -1, 0, 0, 0);
        if (param0 != 105) {
            Object var4 = null;
            ij.a((int[]) null, 50, -10, -91, (int[]) null);
        }
    }

    final static void a(int param0, int param1) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = Virogrid.field_F ? 1 : 0;
        int var2 = 0;
        int var3 = 21 / ((-72 - param0) / 41);
        for (var4 = -(df.field_e * df.field_f); -1 < (var4 ^ -1); var4++) {
            var5 = df.field_d[var2];
            var6 = var5 & 16711935;
            var5 = var5 & 65280;
            var6 = var6 * param1;
            var6 = var6 & -16711936;
            var5 = var5 * param1;
            var5 = var5 & 16711680;
            var5 = (var6 | var5) >> -204613496;
            var2++;
            df.field_d[var2] = var5;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = "No spectators";
        field_h = "Please try changing the following settings:  ";
    }
}
