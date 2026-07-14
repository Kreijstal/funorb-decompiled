/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class o {
    int field_a;
    int field_d;
    static String field_b;
    static String field_c;

    final static id a(ue param0, String param1, String param2, boolean param3) {
        int var4 = param0.a(param1, param3);
        int var5 = param0.a(param2, true, var4);
        return jl.a(var4, param0, (byte) 64, var5);
    }

    final static void a(int param0, rb param1) {
        int var2 = 0;
        ta.field_e = param1.i(-1174051992) << -452086747;
        var2 = param1.j(7909);
        mc.field_f = (var2 & 7) << -637150030;
        if (param0 != -20954) {
          return;
        } else {
          ta.field_e = ta.field_e + (var2 >> 1554978883);
          mc.field_f = mc.field_f + (param1.i(param0 ^ 1174064462) << -1783119678);
          var2 = param1.j(param0 + 28863);
          rb.field_i = var2 << 196490575 & 2064384;
          mc.field_f = mc.field_f + (var2 >> -859134074);
          rb.field_i = rb.field_i + (param1.j(7909) << -345154649);
          var2 = param1.j(7909);
          og.field_f = (var2 & 1) << -714094512;
          rb.field_i = rb.field_i + (var2 >> -1974975775);
          og.field_f = og.field_f + param1.i(param0 + -1174031038);
          return;
        }
    }

    o(int param0, int param1, int param2, int param3) {
        ((o) this).field_d = param0;
        ((o) this).field_a = param3;
    }

    final static void a(boolean param0) {
        mj.field_c = new String[22];
        mj.field_c[12] = vc.field_f;
        mj.field_c[6] = StarCannon.field_C;
        mj.field_c[2] = gi.field_c;
        mj.field_c[14] = pe.field_b;
        mj.field_c[5] = StarCannon.field_C;
        mj.field_c[1] = rd.field_n;
        mj.field_c[4] = nc.field_e;
        mj.field_c[15] = oi.field_n;
        mj.field_c[11] = cf.field_j;
        mj.field_c[13] = ta.field_g;
        mj.field_c[7] = mf.field_b;
        mj.field_c[0] = fl.field_i;
        mj.field_c[3] = vg.field_c;
        if (param0) {
          field_b = null;
          mj.field_c[16] = qb.field_l;
          mj.field_c[17] = vb.field_j;
          mj.field_c[8] = hj.field_b[0];
          mj.field_c[10] = hj.field_b[2];
          mj.field_c[18] = ck.field_b;
          mj.field_c[9] = hj.field_b[1];
          return;
        } else {
          mj.field_c[16] = qb.field_l;
          mj.field_c[17] = vb.field_j;
          mj.field_c[8] = hj.field_b[0];
          mj.field_c[10] = hj.field_b[2];
          mj.field_c[18] = ck.field_b;
          mj.field_c[9] = hj.field_b[1];
          return;
        }
    }

    public static void a(int param0) {
        if (param0 != 4432) {
            field_c = null;
            field_c = null;
            field_b = null;
            return;
        }
        field_c = null;
        field_b = null;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static int a(int param0, int param1, CharSequence param2, int param3, byte param4, byte[] param5) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var6 = param1 - param3;
        var7 = 0;
        L0: while (true) {
          if (var6 <= var7) {
            if (param4 >= -26) {
              return -122;
            } else {
              return var6;
            }
          } else {
            L1: {
              L2: {
                L3: {
                  var8 = param2.charAt(var7 + param3);
                  if (var8 <= 0) {
                    break L3;
                  } else {
                    if (var8 < 128) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                L4: {
                  if (var8 < 160) {
                    break L4;
                  } else {
                    if (var8 <= 255) {
                      break L2;
                    } else {
                      break L4;
                    }
                  }
                }
                if (var8 != 8364) {
                  if (8218 == var8) {
                    param5[var7 + param0] = (byte)-126;
                    break L1;
                  } else {
                    if (var8 != 402) {
                      if (var8 == 8222) {
                        param5[var7 + param0] = (byte)-124;
                        break L1;
                      } else {
                        if (8230 == var8) {
                          param5[param0 + var7] = (byte)-123;
                          break L1;
                        } else {
                          if (var8 != 8224) {
                            if (var8 != 8225) {
                              if (710 == var8) {
                                param5[var7 + param0] = (byte)-120;
                                break L1;
                              } else {
                                if (var8 == 8240) {
                                  param5[var7 + param0] = (byte)-119;
                                  break L1;
                                } else {
                                  if (var8 != 352) {
                                    if (8249 != var8) {
                                      if (var8 != 338) {
                                        if (var8 != 381) {
                                          if (var8 == 8216) {
                                            param5[param0 - -var7] = (byte)-111;
                                            break L1;
                                          } else {
                                            if (var8 == 8217) {
                                              param5[param0 - -var7] = (byte)-110;
                                              break L1;
                                            } else {
                                              if (var8 == 8220) {
                                                param5[var7 + param0] = (byte)-109;
                                                break L1;
                                              } else {
                                                if (var8 != 8221) {
                                                  if (var8 != 8226) {
                                                    if (8211 != var8) {
                                                      if (var8 != 8212) {
                                                        if (732 == var8) {
                                                          param5[param0 + var7] = (byte)-104;
                                                          break L1;
                                                        } else {
                                                          if (var8 == 8482) {
                                                            param5[param0 + var7] = (byte)-103;
                                                            break L1;
                                                          } else {
                                                            if (var8 == 353) {
                                                              param5[var7 + param0] = (byte)-102;
                                                              break L1;
                                                            } else {
                                                              if (var8 != 8250) {
                                                                if (var8 != 339) {
                                                                  if (var8 == 382) {
                                                                    param5[var7 + param0] = (byte)-98;
                                                                    break L1;
                                                                  } else {
                                                                    if (376 != var8) {
                                                                      param5[var7 + param0] = (byte)63;
                                                                      break L1;
                                                                    } else {
                                                                      param5[var7 + param0] = (byte)-97;
                                                                      break L1;
                                                                    }
                                                                  }
                                                                } else {
                                                                  param5[var7 + param0] = (byte)-100;
                                                                  break L1;
                                                                }
                                                              } else {
                                                                param5[var7 + param0] = (byte)-101;
                                                                break L1;
                                                              }
                                                            }
                                                          }
                                                        }
                                                      } else {
                                                        param5[param0 - -var7] = (byte)-105;
                                                        break L1;
                                                      }
                                                    } else {
                                                      param5[param0 - -var7] = (byte)-106;
                                                      break L1;
                                                    }
                                                  } else {
                                                    param5[var7 + param0] = (byte)-107;
                                                    break L1;
                                                  }
                                                } else {
                                                  param5[param0 - -var7] = (byte)-108;
                                                  break L1;
                                                }
                                              }
                                            }
                                          }
                                        } else {
                                          param5[var7 + param0] = (byte)-114;
                                          break L1;
                                        }
                                      } else {
                                        param5[var7 + param0] = (byte)-116;
                                        break L1;
                                      }
                                    } else {
                                      param5[var7 + param0] = (byte)-117;
                                      break L1;
                                    }
                                  } else {
                                    param5[var7 + param0] = (byte)-118;
                                    break L1;
                                  }
                                }
                              }
                            } else {
                              param5[param0 - -var7] = (byte)-121;
                              break L1;
                            }
                          } else {
                            param5[var7 + param0] = (byte)-122;
                            break L1;
                          }
                        }
                      }
                    } else {
                      param5[var7 + param0] = (byte)-125;
                      break L1;
                    }
                  }
                } else {
                  param5[var7 + param0] = (byte)-128;
                  break L1;
                }
              }
              param5[var7 + param0] = (byte)var8;
              break L1;
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
        field_c = "Try again";
    }
}
