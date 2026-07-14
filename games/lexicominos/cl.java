/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cl extends rl implements nd {
    static String field_Q;
    private int field_R;
    static le field_T;
    static int[] field_U;
    static db field_S;
    private ma field_V;
    static he field_P;

    cl(String param0, vd param1, int param2) {
        super(param0, param1, param2);
    }

    final static boolean a(sh param0, sh param1, sh param2, byte param3) {
        if (param3 < 117) {
            Object var5 = null;
            boolean discarded$0 = cl.a((sh) null, (sh) null, (sh) null, (byte) -3);
        }
        if (param1.c(89)) {
            // ifeq L54
        } else {
            return false;
        }
        if (param2.c(-53)) {
            // ifeq L80
        } else {
            return false;
        }
        if (param0.c(74)) {
            if (param0.a("button.gif", 10762)) {
                return true;
            }
        }
        return false;
    }

    final static void a(byte param0, String param1, String param2) {
        if (param0 != 41) {
            Object var4 = null;
            nj[] discarded$0 = cl.a((th) null, -73);
        }
        if (jj.field_a != null) {
            jj.field_a.g(true);
        }
        eb.field_b = new ti(param2, param1, false, true, true);
        di.field_x.b(120, (w) (Object) eb.field_b);
    }

    final static nj[] a(th param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        nj[] var4 = null;
        int var5 = 0;
        int var6_int = 0;
        nj var6 = null;
        int var7 = 0;
        Object var8 = null;
        var7 = Lexicominos.field_L ? 1 : 0;
        var2 = param0.g(8, 26527);
        if ((var2 ^ -1) >= -1) {
          L0: {
            var3 = param0.g(12, 26527);
            if (param1 < -81) {
              break L0;
            } else {
              var8 = null;
              cl.a((byte) 101, (String) null, (String) null);
              break L0;
            }
          }
          var4 = new nj[var3];
          var5 = 0;
          L1: while (true) {
            if (var5 >= var3) {
              return var4;
            } else {
              if (hl.a(true, param0)) {
                var6 = new nj();
                int discarded$6 = param0.g(24, 26527);
                int discarded$7 = param0.g(24, 26527);
                var6.field_c = param0.g(24, 26527);
                int discarded$8 = param0.g(9, 26527);
                int discarded$9 = param0.g(12, 26527);
                int discarded$10 = param0.g(12, 26527);
                int discarded$11 = param0.g(12, 26527);
                var4[var5] = var6;
                var5++;
                continue L1;
              } else {
                var6_int = param0.g(dd.a((byte) 34, var5 - 1), 26527);
                var4[var5] = var4[var6_int];
                var5++;
                continue L1;
              }
            }
          }
        } else {
          return null;
        }
    }

    public static void o(int param0) {
        field_S = null;
        field_U = null;
        field_Q = null;
        if (param0 >= -45) {
            return;
        }
        field_P = null;
        field_T = null;
    }

    final void f(boolean param0) {
        super.f(param0);
        if (((cl) this).field_V != null) {
            ((cl) this).field_V.a(true);
        }
    }

    final String b(int param0) {
        if (param0 <= 121) {
            Object var3 = null;
            ((cl) this).a((byte) 68, (w) null, 113, 107);
        }
        if (!((cl) this).field_m) {
            return null;
        }
        if (((cl) this).field_q == null) {
            return null;
        }
        ta.a(sh.field_e, 112, bk.field_b + ((cl) this).field_j - ((cl) this).field_R);
        return ((cl) this).field_q;
    }

    final static sh a(boolean param0, byte param1, boolean param2, int param3, int param4) {
        int var5 = -35 % ((46 - param1) / 55);
        return il.a(param0, 12317, false, param3, param2, param4);
    }

    final static byte[] a(byte param0, CharSequence param1) {
        int var2 = 0;
        byte[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        Object var7 = null;
        L0: {
          var6 = Lexicominos.field_L ? 1 : 0;
          var2 = param1.length();
          if (param0 == -98) {
            break L0;
          } else {
            var7 = null;
            nj[] discarded$1 = cl.a((th) null, -87);
            break L0;
          }
        }
        var3 = new byte[var2];
        var4 = 0;
        L1: while (true) {
          if (var2 <= var4) {
            return var3;
          } else {
            L2: {
              L3: {
                L4: {
                  var5 = param1.charAt(var4);
                  if (0 >= var5) {
                    break L4;
                  } else {
                    if (var5 < 128) {
                      break L3;
                    } else {
                      break L4;
                    }
                  }
                }
                L5: {
                  if (160 > var5) {
                    break L5;
                  } else {
                    if (var5 <= 255) {
                      break L3;
                    } else {
                      break L5;
                    }
                  }
                }
                if (var5 == 8364) {
                  var3[var4] = (byte)-128;
                  break L2;
                } else {
                  if (var5 != 8218) {
                    if (var5 == 402) {
                      var3[var4] = (byte)-125;
                      break L2;
                    } else {
                      if (var5 == 8222) {
                        var3[var4] = (byte)-124;
                        break L2;
                      } else {
                        if (var5 == 8230) {
                          var3[var4] = (byte)-123;
                          break L2;
                        } else {
                          if (var5 == 8224) {
                            var3[var4] = (byte)-122;
                            break L2;
                          } else {
                            if (var5 == 8225) {
                              var3[var4] = (byte)-121;
                              break L2;
                            } else {
                              if (var5 == 710) {
                                var3[var4] = (byte)-120;
                                break L2;
                              } else {
                                if (8240 == var5) {
                                  var3[var4] = (byte)-119;
                                  break L2;
                                } else {
                                  if (var5 == 352) {
                                    var3[var4] = (byte)-118;
                                    break L2;
                                  } else {
                                    if (var5 == 8249) {
                                      var3[var4] = (byte)-117;
                                      break L2;
                                    } else {
                                      if (var5 != 338) {
                                        if (var5 != 381) {
                                          if (var5 != 8216) {
                                            if (var5 == 8217) {
                                              var3[var4] = (byte)-110;
                                              break L2;
                                            } else {
                                              if (var5 == 8220) {
                                                var3[var4] = (byte)-109;
                                                break L2;
                                              } else {
                                                if (8221 != var5) {
                                                  if (8226 != var5) {
                                                    if (8211 == var5) {
                                                      var3[var4] = (byte)-106;
                                                      break L2;
                                                    } else {
                                                      if (var5 != 8212) {
                                                        if (var5 != 732) {
                                                          if (8482 == var5) {
                                                            var3[var4] = (byte)-103;
                                                            break L2;
                                                          } else {
                                                            if (353 == var5) {
                                                              var3[var4] = (byte)-102;
                                                              break L2;
                                                            } else {
                                                              if (var5 == 8250) {
                                                                var3[var4] = (byte)-101;
                                                                break L2;
                                                              } else {
                                                                if (var5 == 339) {
                                                                  var3[var4] = (byte)-100;
                                                                  break L2;
                                                                } else {
                                                                  if (var5 == 382) {
                                                                    var3[var4] = (byte)-98;
                                                                    break L2;
                                                                  } else {
                                                                    if (var5 == 376) {
                                                                      var3[var4] = (byte)-97;
                                                                      break L2;
                                                                    } else {
                                                                      var3[var4] = (byte)63;
                                                                      break L2;
                                                                    }
                                                                  }
                                                                }
                                                              }
                                                            }
                                                          }
                                                        } else {
                                                          var3[var4] = (byte)-104;
                                                          break L2;
                                                        }
                                                      } else {
                                                        var3[var4] = (byte)-105;
                                                        break L2;
                                                      }
                                                    }
                                                  } else {
                                                    var3[var4] = (byte)-107;
                                                    break L2;
                                                  }
                                                } else {
                                                  var3[var4] = (byte)-108;
                                                  break L2;
                                                }
                                              }
                                            }
                                          } else {
                                            var3[var4] = (byte)-111;
                                            break L2;
                                          }
                                        } else {
                                          var3[var4] = (byte)-114;
                                          break L2;
                                        }
                                      } else {
                                        var3[var4] = (byte)-116;
                                        break L2;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  } else {
                    var3[var4] = (byte)-126;
                    break L2;
                  }
                }
              }
              var3[var4] = (byte)var5;
              break L2;
            }
            var4++;
            continue L1;
          }
        }
    }

    final static int p(int param0) {
        if (param0 >= -122) {
            return 47;
        }
        return (int)(1000000000L / ca.field_h);
    }

    public final ma a(byte param0) {
        int var2 = -48 / ((param0 - 56) / 36);
        return ((cl) this).field_V;
    }

    final void a(ma param0, byte param1) {
        if (param1 != 23) {
            cl.o(-17);
        }
        ((cl) this).field_V = param0;
    }

    final void a(byte param0, w param1, int param2, int param3) {
        super.a(param0, param1, param2, param3);
        ((cl) this).field_R = -((cl) this).field_t + (bk.field_b + -param3);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_U = new int[8192];
        field_Q = "Enter the name you'd prefer. This is the name displayed to other players.";
        field_S = new db(311, 450);
    }
}
