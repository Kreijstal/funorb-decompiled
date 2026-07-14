/*
 * Decompiled by CFR-JS 0.4.0.
 */
class o extends rg {
    static String field_D;
    static String field_z;
    static dd field_C;
    static wh field_x;
    static int field_y;
    static String field_A;
    static String field_B;
    static String field_w;

    o() {
    }

    final static int a(int param0, byte param1) {
        int var2 = 0;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        param0 = param0 & 8191;
        var2 = 13 / ((param1 - -21) / 41);
        if (-4097 >= param0) {
          L0: {
            if (-6145 <= param0) {
              stackOut_7_0 = wf.field_b[-6144 + param0];
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = -wf.field_b[6144 - param0];
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0;
        } else {
          L1: {
            if (param0 < 2048) {
              stackOut_3_0 = wf.field_b[2048 - param0];
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = -wf.field_b[param0 + -2048];
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0;
        }
    }

    final static String a(char param0, String param1, String param2, int param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8_int = 0;
        StringBuilder var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = Pool.field_O;
        var4 = param2.length();
        var5 = param1.length();
        var6 = var4;
        var7 = var5 + -1;
        if (param3 == 1) {
          if (var7 != 0) {
            var8_int = 0;
            L0: while (true) {
              var8_int = param2.indexOf((int) param0, var8_int);
              if (-1 >= (var8_int ^ -1)) {
                var8_int++;
                var6 = var6 + var7;
                continue L0;
              } else {
                var8 = new StringBuilder(var6);
                var9 = 0;
                L1: while (true) {
                  var10 = param2.indexOf((int) param0, var9);
                  if ((var10 ^ -1) <= -1) {
                    StringBuilder discarded$6 = var8.append(param2.substring(var9, var10));
                    StringBuilder discarded$7 = var8.append(param1);
                    var9 = 1 + var10;
                    continue L1;
                  } else {
                    StringBuilder discarded$8 = var8.append(param2.substring(var9));
                    return var8.toString();
                  }
                }
              }
            }
          } else {
            var8 = new StringBuilder(var6);
            var9 = 0;
            L2: while (true) {
              var10 = param2.indexOf((int) param0, var9);
              if ((var10 ^ -1) <= -1) {
                StringBuilder discarded$9 = var8.append(param2.substring(var9, var10));
                StringBuilder discarded$10 = var8.append(param1);
                var9 = 1 + var10;
                continue L2;
              } else {
                StringBuilder discarded$11 = var8.append(param2.substring(var9));
                return var8.toString();
              }
            }
          }
        } else {
          return null;
        }
    }

    public static void e(int param0) {
        field_B = null;
        field_D = null;
        if (param0 <= 89) {
          return;
        } else {
          field_C = null;
          field_x = null;
          field_z = null;
          field_A = null;
          field_w = null;
          return;
        }
    }

    final static void c(byte param0) {
        if (gk.field_kb) {
          mf.field_o = true;
          ii.a(true, 0);
          fk.field_ab = 0;
          if (param0 <= 18) {
            field_z = null;
            return;
          } else {
            return;
          }
        } else {
          throw new IllegalStateException();
        }
    }

    final static int a(byte[] param0, CharSequence param1, int param2, int param3, int param4, int param5) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var6 = -param4 + param3;
        var7 = 0;
        L0: while (true) {
          if (var6 <= var7) {
            if (param2 != -24984) {
              o.e(82);
              return var6;
            } else {
              return var6;
            }
          } else {
            L1: {
              L2: {
                var8 = param1.charAt(param4 + var7);
                if (var8 <= 0) {
                  break L2;
                } else {
                  if (var8 < 128) {
                    param0[var7 + param5] = (byte)var8;
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              L3: {
                if (var8 < 160) {
                  break L3;
                } else {
                  if (var8 <= 255) {
                    param0[var7 + param5] = (byte)var8;
                    break L1;
                  } else {
                    break L3;
                  }
                }
              }
              if (var8 != 8364) {
                if (var8 == 8218) {
                  param0[var7 + param5] = (byte)-126;
                  break L1;
                } else {
                  if (var8 == 402) {
                    param0[param5 - -var7] = (byte)-125;
                    break L1;
                  } else {
                    if (8222 == var8) {
                      param0[var7 + param5] = (byte)-124;
                      break L1;
                    } else {
                      if (8230 != var8) {
                        if (8224 != var8) {
                          if (var8 == 8225) {
                            param0[var7 + param5] = (byte)-121;
                            break L1;
                          } else {
                            if (var8 != 710) {
                              if (var8 != 8240) {
                                if (352 != var8) {
                                  if (8249 != var8) {
                                    if (338 == var8) {
                                      param0[param5 + var7] = (byte)-116;
                                      break L1;
                                    } else {
                                      if (var8 != 381) {
                                        if (8216 == var8) {
                                          param0[var7 + param5] = (byte)-111;
                                          break L1;
                                        } else {
                                          if (var8 != 8217) {
                                            if (8220 != var8) {
                                              if (var8 != 8221) {
                                                if (8226 == var8) {
                                                  param0[var7 + param5] = (byte)-107;
                                                  break L1;
                                                } else {
                                                  if (8211 == var8) {
                                                    param0[var7 + param5] = (byte)-106;
                                                    break L1;
                                                  } else {
                                                    if (8212 != var8) {
                                                      if (var8 != 732) {
                                                        if (var8 != 8482) {
                                                          if (var8 == 353) {
                                                            param0[var7 + param5] = (byte)-102;
                                                            break L1;
                                                          } else {
                                                            if (8250 == var8) {
                                                              param0[param5 - -var7] = (byte)-101;
                                                              break L1;
                                                            } else {
                                                              if (339 == var8) {
                                                                param0[param5 + var7] = (byte)-100;
                                                                break L1;
                                                              } else {
                                                                if (var8 != 382) {
                                                                  if (var8 == 376) {
                                                                    param0[var7 + param5] = (byte)-97;
                                                                    break L1;
                                                                  } else {
                                                                    param0[param5 + var7] = (byte)63;
                                                                    break L1;
                                                                  }
                                                                } else {
                                                                  param0[var7 + param5] = (byte)-98;
                                                                  break L1;
                                                                }
                                                              }
                                                            }
                                                          }
                                                        } else {
                                                          param0[var7 + param5] = (byte)-103;
                                                          break L1;
                                                        }
                                                      } else {
                                                        param0[param5 - -var7] = (byte)-104;
                                                        break L1;
                                                      }
                                                    } else {
                                                      param0[var7 + param5] = (byte)-105;
                                                      break L1;
                                                    }
                                                  }
                                                }
                                              } else {
                                                param0[var7 + param5] = (byte)-108;
                                                break L1;
                                              }
                                            } else {
                                              param0[param5 - -var7] = (byte)-109;
                                              break L1;
                                            }
                                          } else {
                                            param0[param5 - -var7] = (byte)-110;
                                            break L1;
                                          }
                                        }
                                      } else {
                                        param0[param5 - -var7] = (byte)-114;
                                        break L1;
                                      }
                                    }
                                  } else {
                                    param0[var7 + param5] = (byte)-117;
                                    break L1;
                                  }
                                } else {
                                  param0[var7 + param5] = (byte)-118;
                                  break L1;
                                }
                              } else {
                                param0[var7 + param5] = (byte)-119;
                                break L1;
                              }
                            } else {
                              param0[param5 + var7] = (byte)-120;
                              break L1;
                            }
                          }
                        } else {
                          param0[param5 - -var7] = (byte)-122;
                          break L1;
                        }
                      } else {
                        param0[param5 - -var7] = (byte)-123;
                        break L1;
                      }
                    }
                  }
                }
              } else {
                param0[var7 + param5] = (byte)-128;
                break L1;
              }
            }
            var7++;
            continue L0;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_z = "Staff impersonation";
        field_D = "You lost 1 life!";
        field_y = 0;
        field_B = "You<%0> are all offering a rematch.";
        field_w = "To server list";
        field_A = "Loading...";
    }
}
