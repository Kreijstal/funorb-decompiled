/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bo extends li {
    boolean field_n;
    private int field_r;
    int field_q;
    int[] field_o;
    static String field_p;
    int field_s;

    private final int a(byte param0, int param1) {
        if (param0 != 117) {
            boolean discarded$0 = ((bo) this).a((byte) -58);
        }
        return param1;
    }

    private final void e(int param0) {
        ((bo) this).field_r = 0;
        if (param0 > -67) {
            Object var3 = null;
            ((bo) this).a(13, (mi) null);
        }
    }

    final boolean a(byte param0) {
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0 == 76) {
            break L0;
          } else {
            int discarded$2 = this.a((byte) -101, 83);
            break L0;
          }
        }
        L1: {
          L2: {
            if (-11 == (((bo) this).field_r ^ -1)) {
              break L2;
            } else {
              if (!((bo) this).field_n) {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                break L1;
              } else {
                break L2;
              }
            }
          }
          stackOut_5_0 = 1;
          stackIn_7_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_7_0 != 0;
    }

    final boolean b(int param0, int param1) {
        ((bo) this).field_r = ((bo) this).field_r + 1;
        ((bo) this).field_o[((bo) this).field_r] = param0;
        if (param1 != -11) {
            ((bo) this).field_n = false;
        }
        return (((bo) this).field_r ^ -1) == -11 ? true : false;
    }

    public static void a(int param0) {
        field_p = null;
        if (param0 <= 65) {
            Object var2 = null;
            byte[] discarded$0 = bo.a((CharSequence) null, 23);
        }
    }

    final static byte[] a(CharSequence param0, int param1) {
        int var2 = 0;
        byte[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = Vertigo2.field_L ? 1 : 0;
        var2 = param0.length();
        var3 = new byte[var2];
        if (param1 == -711) {
          var4 = 0;
          L0: while (true) {
            if (var4 >= var2) {
              return var3;
            } else {
              L1: {
                L2: {
                  L3: {
                    var5 = param0.charAt(var4);
                    if (var5 <= 0) {
                      break L3;
                    } else {
                      if (var5 < 128) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  L4: {
                    if (var5 < 160) {
                      break L4;
                    } else {
                      if (255 < var5) {
                        break L4;
                      } else {
                        break L2;
                      }
                    }
                  }
                  if (8364 != var5) {
                    if (8218 != var5) {
                      if (402 == var5) {
                        var3[var4] = (byte)-125;
                        break L1;
                      } else {
                        if (var5 == 8222) {
                          var3[var4] = (byte)-124;
                          break L1;
                        } else {
                          if (var5 == 8230) {
                            var3[var4] = (byte)-123;
                            break L1;
                          } else {
                            if (8224 == var5) {
                              var3[var4] = (byte)-122;
                              break L1;
                            } else {
                              if (8225 == var5) {
                                var3[var4] = (byte)-121;
                                break L1;
                              } else {
                                if (var5 == 710) {
                                  var3[var4] = (byte)-120;
                                  break L1;
                                } else {
                                  if (var5 == 8240) {
                                    var3[var4] = (byte)-119;
                                    break L1;
                                  } else {
                                    if (352 == var5) {
                                      var3[var4] = (byte)-118;
                                      break L1;
                                    } else {
                                      if (8249 != var5) {
                                        if (var5 != 338) {
                                          if (var5 != 381) {
                                            if (var5 == 8216) {
                                              var3[var4] = (byte)-111;
                                              break L1;
                                            } else {
                                              if (8217 == var5) {
                                                var3[var4] = (byte)-110;
                                                break L1;
                                              } else {
                                                if (var5 != 8220) {
                                                  if (8221 == var5) {
                                                    var3[var4] = (byte)-108;
                                                    break L1;
                                                  } else {
                                                    if (var5 == 8226) {
                                                      var3[var4] = (byte)-107;
                                                      break L1;
                                                    } else {
                                                      if (8211 == var5) {
                                                        var3[var4] = (byte)-106;
                                                        break L1;
                                                      } else {
                                                        if (var5 == 8212) {
                                                          var3[var4] = (byte)-105;
                                                          break L1;
                                                        } else {
                                                          if (732 == var5) {
                                                            var3[var4] = (byte)-104;
                                                            break L1;
                                                          } else {
                                                            if (8482 != var5) {
                                                              if (var5 == 353) {
                                                                var3[var4] = (byte)-102;
                                                                break L1;
                                                              } else {
                                                                if (var5 == 8250) {
                                                                  var3[var4] = (byte)-101;
                                                                  break L1;
                                                                } else {
                                                                  if (339 != var5) {
                                                                    if (var5 == 382) {
                                                                      var3[var4] = (byte)-98;
                                                                      break L1;
                                                                    } else {
                                                                      if (var5 != 376) {
                                                                        var3[var4] = (byte)63;
                                                                        break L1;
                                                                      } else {
                                                                        var3[var4] = (byte)-97;
                                                                        break L1;
                                                                      }
                                                                    }
                                                                  } else {
                                                                    var3[var4] = (byte)-100;
                                                                    break L1;
                                                                  }
                                                                }
                                                              }
                                                            } else {
                                                              var3[var4] = (byte)-103;
                                                              break L1;
                                                            }
                                                          }
                                                        }
                                                      }
                                                    }
                                                  }
                                                } else {
                                                  var3[var4] = (byte)-109;
                                                  break L1;
                                                }
                                              }
                                            }
                                          } else {
                                            var3[var4] = (byte)-114;
                                            break L1;
                                          }
                                        } else {
                                          var3[var4] = (byte)-116;
                                          break L1;
                                        }
                                      } else {
                                        var3[var4] = (byte)-117;
                                        break L1;
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
                      break L1;
                    }
                  } else {
                    var3[var4] = (byte)-128;
                    break L1;
                  }
                }
                var3[var4] = (byte)var5;
                break L1;
              }
              var4++;
              continue L0;
            }
          }
        } else {
          return null;
        }
    }

    private final void f(int param0) {
        ((bo) this).field_o = new int[10];
        if (param0 != -7307) {
            ((bo) this).field_n = false;
        }
    }

    final void a(int param0, mi param1) {
        int var3 = 0;
        int var4 = Vertigo2.field_L ? 1 : 0;
        param1.j(63, param0 + 124);
        param1.d(false);
        param1.a((byte) 114, 8, ((bo) this).field_q);
        for (var3 = param0; var3 < 10; var3++) {
            param1.a((byte) 118, 6, this.a((byte) 117, ((bo) this).field_o[var3]));
        }
        param1.q(param0 + -9);
        this.e(-85);
    }

    bo(int param0, int param1) {
        ((bo) this).field_s = param1;
        sk.field_a = (short)(sk.field_a + 1);
        ((bo) this).field_q = sk.field_a % 255;
        this.f(-7307);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = "Disruptive behaviour";
    }
}
