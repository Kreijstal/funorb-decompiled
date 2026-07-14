/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bv {
    int field_w;
    static String field_j;
    byte[] field_u;
    static int[] field_G;
    int field_C;
    boolean[] field_f;
    int field_E;
    int field_r;
    byte[] field_D;
    int field_H;
    static String field_d;
    byte[] field_p;
    int[] field_s;
    int[] field_a;
    int field_J;
    int field_z;
    byte field_o;
    int field_v;
    int field_g;
    int[][] field_i;
    int[] field_t;
    int field_q;
    static vr field_B;
    int field_y;
    int[] field_m;
    int[][] field_x;
    boolean[] field_k;
    byte[] field_I;
    byte[][] field_e;
    byte[] field_F;
    int field_c;
    int field_h;
    int field_b;
    byte[] field_n;
    int field_l;
    int[][] field_A;

    final static int a(byte param0) {
        if (param0 >= -6) {
            return 31;
        }
        return qk.field_l;
    }

    final static void b(int param0) {
        int var1 = 0;
        if ((bs.field_k ^ -1) > -225) {
            var1 = bs.field_k % 32;
            gka.a(param0 ^ -16922, 32 + bs.field_k - var1);
        } else {
            gka.a(param0 + -17025, 256);
        }
        if (param0 != 16964) {
            Object var2 = null;
            byte[] discarded$0 = bv.a(-13, (CharSequence) null);
        }
    }

    public static void a(int param0) {
        field_d = null;
        field_G = null;
        field_j = null;
        field_B = null;
        int var1 = -93 / ((24 - param0) / 49);
    }

    final static byte[] a(int param0, CharSequence param1) {
        int var2 = 0;
        byte[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        L0: {
          var6 = BachelorFridge.field_y;
          var2 = param1.length();
          if (param0 == 18019) {
            break L0;
          } else {
            bv.b(-42);
            break L0;
          }
        }
        var3 = new byte[var2];
        var4 = 0;
        L1: while (true) {
          if (var4 >= var2) {
            return var3;
          } else {
            L2: {
              L3: {
                L4: {
                  var5 = param1.charAt(var4);
                  if (var5 <= 0) {
                    break L4;
                  } else {
                    if (128 > var5) {
                      break L3;
                    } else {
                      break L4;
                    }
                  }
                }
                L5: {
                  if (var5 < 160) {
                    break L5;
                  } else {
                    if (255 < var5) {
                      break L5;
                    } else {
                      break L3;
                    }
                  }
                }
                if (var5 == 8364) {
                  var3[var4] = (byte)-128;
                  break L2;
                } else {
                  if (var5 != 8218) {
                    if (var5 != 402) {
                      if (8222 != var5) {
                        if (var5 == 8230) {
                          var3[var4] = (byte)-123;
                          break L2;
                        } else {
                          if (var5 != 8224) {
                            if (var5 != 8225) {
                              if (710 == var5) {
                                var3[var4] = (byte)-120;
                                break L2;
                              } else {
                                if (8240 == var5) {
                                  var3[var4] = (byte)-119;
                                  break L2;
                                } else {
                                  if (var5 != 352) {
                                    if (8249 == var5) {
                                      var3[var4] = (byte)-117;
                                      break L2;
                                    } else {
                                      if (338 != var5) {
                                        if (var5 != 381) {
                                          if (var5 == 8216) {
                                            var3[var4] = (byte)-111;
                                            break L2;
                                          } else {
                                            if (var5 == 8217) {
                                              var3[var4] = (byte)-110;
                                              break L2;
                                            } else {
                                              if (var5 == 8220) {
                                                var3[var4] = (byte)-109;
                                                break L2;
                                              } else {
                                                if (var5 != 8221) {
                                                  if (8226 == var5) {
                                                    var3[var4] = (byte)-107;
                                                    break L2;
                                                  } else {
                                                    if (var5 != 8211) {
                                                      if (var5 == 8212) {
                                                        var3[var4] = (byte)-105;
                                                        break L2;
                                                      } else {
                                                        if (732 != var5) {
                                                          if (var5 == 8482) {
                                                            var3[var4] = (byte)-103;
                                                            break L2;
                                                          } else {
                                                            if (var5 != 353) {
                                                              if (var5 != 8250) {
                                                                if (var5 != 339) {
                                                                  if (var5 == 382) {
                                                                    var3[var4] = (byte)-98;
                                                                    break L2;
                                                                  } else {
                                                                    if (376 != var5) {
                                                                      var3[var4] = (byte)63;
                                                                      break L2;
                                                                    } else {
                                                                      var3[var4] = (byte)-97;
                                                                      break L2;
                                                                    }
                                                                  }
                                                                } else {
                                                                  var3[var4] = (byte)-100;
                                                                  break L2;
                                                                }
                                                              } else {
                                                                var3[var4] = (byte)-101;
                                                                break L2;
                                                              }
                                                            } else {
                                                              var3[var4] = (byte)-102;
                                                              break L2;
                                                            }
                                                          }
                                                        } else {
                                                          var3[var4] = (byte)-104;
                                                          break L2;
                                                        }
                                                      }
                                                    } else {
                                                      var3[var4] = (byte)-106;
                                                      break L2;
                                                    }
                                                  }
                                                } else {
                                                  var3[var4] = (byte)-108;
                                                  break L2;
                                                }
                                              }
                                            }
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
                                  } else {
                                    var3[var4] = (byte)-118;
                                    break L2;
                                  }
                                }
                              }
                            } else {
                              var3[var4] = (byte)-121;
                              break L2;
                            }
                          } else {
                            var3[var4] = (byte)-122;
                            break L2;
                          }
                        }
                      } else {
                        var3[var4] = (byte)-124;
                        break L2;
                      }
                    } else {
                      var3[var4] = (byte)-125;
                      break L2;
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

    bv() {
        ((bv) this).field_u = new byte[18002];
        ((bv) this).field_E = 0;
        ((bv) this).field_H = 0;
        ((bv) this).field_s = new int[257];
        ((bv) this).field_D = new byte[256];
        ((bv) this).field_m = new int[6];
        ((bv) this).field_e = new byte[6][258];
        ((bv) this).field_i = new int[6][258];
        ((bv) this).field_x = new int[6][258];
        ((bv) this).field_f = new boolean[256];
        ((bv) this).field_a = new int[16];
        ((bv) this).field_I = new byte[4096];
        ((bv) this).field_t = new int[256];
        ((bv) this).field_k = new boolean[16];
        ((bv) this).field_n = new byte[18002];
        ((bv) this).field_A = new int[6][258];
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Type your email address again to make sure it's correct";
        field_j = "Email is valid";
        field_G = new int[8192];
    }
}
