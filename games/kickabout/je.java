/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class je extends gn {
    int[] field_r;
    static rd[] field_f;
    int field_j;
    int field_l;
    int[][] field_q;
    int[] field_o;
    static String field_n;
    static rd[] field_g;
    static ut field_h;
    private boolean[] field_i;
    static String field_p;
    static bh field_e;
    static int field_k;
    static int field_m;

    public static void a(int param0) {
        field_p = null;
        field_f = null;
        field_n = null;
        field_e = null;
        field_g = null;
        if (param0 != -1) {
            je.a(66);
        }
        field_h = null;
    }

    final static void a(byte param0, pu param1) {
        if (param0 != 100) {
            field_g = null;
        }
        et.field_b = true;
        if (vl.a(false)) {
            return;
        }
        fp.field_e = 6;
        pc.field_a = param1;
    }

    final static int a(boolean param0) {
        L0: {
          if ((ks.field_e ^ -1) != -2) {
            break L0;
          } else {
            if (!sl.field_Eb) {
              return 0;
            } else {
              break L0;
            }
          }
        }
        if (ks.field_e != 2) {
          if ((ks.field_e ^ -1) == -4) {
            return 4;
          } else {
            L1: {
              if (!param0) {
                break L1;
              } else {
                int discarded$1 = je.a(false);
                break L1;
              }
            }
            L2: {
              if (ks.field_e != 4) {
                break L2;
              } else {
                if (sl.field_Eb) {
                  break L2;
                } else {
                  return 5;
                }
              }
            }
            L3: {
              if ((ks.field_e ^ -1) != -6) {
                break L3;
              } else {
                if (!sl.field_Eb) {
                  return 6;
                } else {
                  break L3;
                }
              }
            }
            L4: {
              if (ks.field_e != 6) {
                break L4;
              } else {
                if (sl.field_Eb) {
                  break L4;
                } else {
                  return 7;
                }
              }
            }
            L5: {
              if (ks.field_e != 7) {
                if ((ks.field_e ^ -1) == -9) {
                  if (!sl.field_Eb) {
                    if (sl.field_Eb) {
                      break L5;
                    } else {
                      if (-249 >= (ld.field_f.f(-120) ^ -1)) {
                        break L5;
                      } else {
                        if (400 > ld.field_f.a(true)) {
                          return 11;
                        } else {
                          break L5;
                        }
                      }
                    }
                  } else {
                    return 10;
                  }
                } else {
                  if (-10 == (ks.field_e ^ -1)) {
                    if (sl.field_Eb) {
                      return 12;
                    } else {
                      return 13;
                    }
                  } else {
                    if (10 != ks.field_e) {
                      if (ks.field_e != 11) {
                        if ((ks.field_e ^ -1) == -13) {
                          if ((et.field_d.field_V.field_m ^ -1) != -1) {
                            break L5;
                          } else {
                            return 16;
                          }
                        } else {
                          if (ks.field_e == 13) {
                            if (!sl.field_Eb) {
                              return 17;
                            } else {
                              break L5;
                            }
                          } else {
                            if (ks.field_e == 14) {
                              if (2 == et.field_d.field_u) {
                                return 18;
                              } else {
                                if (et.field_d.field_u == 3) {
                                  return 19;
                                } else {
                                  if ((et.field_d.field_u ^ -1) != -5) {
                                    break L5;
                                  } else {
                                    if (-1 <= (field_m ^ -1)) {
                                      break L5;
                                    } else {
                                      return 20;
                                    }
                                  }
                                }
                              }
                            } else {
                              break L5;
                            }
                          }
                        }
                      } else {
                        return 15;
                      }
                    } else {
                      if (!sl.field_Eb) {
                        return 14;
                      } else {
                        break L5;
                      }
                    }
                  }
                }
              } else {
                if (!sl.field_Eb) {
                  return 9;
                } else {
                  if (!sl.field_Eb) {
                    break L5;
                  } else {
                    if (1 != et.field_d.field_V.field_m) {
                      break L5;
                    } else {
                      if (-1 == (et.field_d.b((byte) -96).field_u ^ -1)) {
                        return 8;
                      } else {
                        break L5;
                      }
                    }
                  }
                }
              }
            }
            return -1;
          }
        } else {
          if ((mh.field_k.a(true) ^ -1) < -478) {
            return 1;
          } else {
            if (-1 > (mh.field_k.field_C ^ -1)) {
              return 2;
            } else {
              return 3;
            }
          }
        }
    }

    je(int param0, byte[] param1) {
        int var4 = 0;
        int var5 = 0;
        iw var7 = null;
        iw var8 = null;
        boolean[] stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        boolean[] stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        boolean[] stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        int stackIn_8_2 = 0;
        boolean[] stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        boolean[] stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        int stackOut_7_2 = 0;
        boolean[] stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        int stackOut_6_2 = 0;
        ((je) this).field_l = param0;
        var7 = new iw(param1);
        var8 = var7;
        ((je) this).field_j = var8.h((byte) -116);
        ((je) this).field_r = new int[((je) this).field_j];
        ((je) this).field_q = new int[((je) this).field_j][];
        ((je) this).field_o = new int[((je) this).field_j];
        ((je) this).field_i = new boolean[((je) this).field_j];
        var4 = 0;
        L0: while (true) {
          if (var4 >= ((je) this).field_j) {
            var4 = 0;
            L1: while (true) {
              if (var4 >= ((je) this).field_j) {
                var4 = 0;
                L2: while (true) {
                  if (((je) this).field_j <= var4) {
                    var4 = 0;
                    L3: while (true) {
                      if (var4 >= ((je) this).field_j) {
                        var4 = 0;
                        L4: while (true) {
                          if (((je) this).field_j <= var4) {
                            return;
                          } else {
                            var5 = 0;
                            L5: while (true) {
                              if (var5 >= ((je) this).field_q[var4].length) {
                                var4++;
                                continue L4;
                              } else {
                                ((je) this).field_q[var4][var5] = var7.h((byte) -105);
                                var5++;
                                continue L5;
                              }
                            }
                          }
                        }
                      } else {
                        ((je) this).field_q[var4] = new int[var7.h((byte) -106)];
                        var4++;
                        continue L3;
                      }
                    }
                  } else {
                    ((je) this).field_r[var4] = var7.a((byte) 81);
                    var4++;
                    continue L2;
                  }
                }
              } else {
                L6: {
                  stackOut_5_0 = ((je) this).field_i;
                  stackOut_5_1 = var4;
                  stackIn_7_0 = stackOut_5_0;
                  stackIn_7_1 = stackOut_5_1;
                  stackIn_6_0 = stackOut_5_0;
                  stackIn_6_1 = stackOut_5_1;
                  if (var8.h((byte) -124) != 1) {
                    stackOut_7_0 = (boolean[]) (Object) stackIn_7_0;
                    stackOut_7_1 = stackIn_7_1;
                    stackOut_7_2 = 0;
                    stackIn_8_0 = stackOut_7_0;
                    stackIn_8_1 = stackOut_7_1;
                    stackIn_8_2 = stackOut_7_2;
                    break L6;
                  } else {
                    stackOut_6_0 = (boolean[]) (Object) stackIn_6_0;
                    stackOut_6_1 = stackIn_6_1;
                    stackOut_6_2 = 1;
                    stackIn_8_0 = stackOut_6_0;
                    stackIn_8_1 = stackOut_6_1;
                    stackIn_8_2 = stackOut_6_2;
                    break L6;
                  }
                }
                stackIn_8_0[stackIn_8_1] = stackIn_8_2 != 0;
                var4++;
                continue L1;
              }
            }
          } else {
            ((je) this).field_o[var4] = var7.h((byte) -107);
            var4++;
            continue L0;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        field_n = "Unfortunately there was a focus problem while setting fullscreen mode. You could try disabling any multiple monitor drivers or window enhancements, if you have any enabled.";
        field_g = new rd[25];
        field_g[0] = new rd(-1, -1, false, -1L, "fefffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff");
        field_g[1] = new rd(-1, -1, false, -1L, "90000000000000000000000000000000000000000000000000000000000000000");
        field_g[2] = new rd(-1, -1, false, -1L, "0e38f0e38f0e38f0e38f0e38f0e38f0ef70f1c70f1c70f1c70f1c70f1c70f1c70");
        field_g[3] = new rd(27, -1, false, -1L, "00000000000000000000000000000000cffffffffffffffffffffffffffffffff");
        field_g[4] = new rd(22, -1, false, -1L, "60f0c30f0c30f0c30f0c30f0c30f0c30f0c30f0c30f0c30f0c30f0c30f0c30f0c");
        field_g[5] = new rd(24, -1, false, -1L, "00000000000000000cfffffffff30000000000000000000000ffffffffff00000");
        field_g[6] = new rd(28, -1, false, -1L, "160e8832e87cd177c1e8832e87cd177cdf1830e083c177cd17832e883e177cd17");
        field_g[7] = new rd(17, -1, false, -1L, "9000000000000008402100012480e100000000008402184000480128700000000");
        field_g[8] = new rd(31, -1, false, -1L, "100000040830b0468112cc0e1870c0030000000010e0c2091648033870e1030c0");
        field_g[9] = new rd(25, -1, false, -1L, "eefffef1f397ecc78f3f78fcc972f3efdffffbf7cf4e933f1efcf1e337e9cf8f7");
        field_g[10] = new rd(-1, 2, false, -1L, "f080066a9966a9966a9966a9966a9966202891668916689166995669956699566");
        field_g[11] = new rd(-1, 3, false, -1L, "60c70f1c70f1c70f1c70f108f0e38f0e38f0e38f0e38f0e38f0ef70f1c70f1c70");
        field_g[12] = new rd(-1, 4, false, -1L, "7effffffffff3f387000000000000000cfffffffff30000000000000000000000");
        field_g[13] = new rd(-1, 5, false, -1L, "7efefbffefbffefbffefbffefbffefbfffdf7ffdf7ffdf7ffdf7ffdf7ffdf7ffd");
        field_g[14] = new rd(-1, 6, false, -1L, "00000fffffff30000cffff30000cffff30000cfffffff00000fffff00000fffff");
        field_g[15] = new rd(-1, 7, false, -1L, "000000040030c10f0c70f3cf1ffcf7ff300000000020c0830f0e3cf8f3ffeffff");
        field_g[16] = new rd(-1, 8, false, -1L, "800000000000000fffffcc033cc03300000000000000000cffff333cc033cc033");
        field_g[17] = new rd(-1, 9, false, -1L, "80000000e1870e1870e1870e1870e1870e1870e1870e1870e1870e1870e1870e1");
        field_g[18] = new rd(-1, 10, false, -1L, "8000000000030e1cf8f7fff3f78f0c1020000000030e1cf8f7fff3f78f0c10200");
        field_g[19] = new rd(-1, 11, false, -1L, "0c0030c0030c003fffff0c0030c0030c060810608106081cffff3608106081060");
        field_g[20] = new rd(-1, 12, false, -1L, "0000000000000e14801248012870000000000000000e148012480128700000000");
        field_g[21] = new rd(-1, -1, true, -1L, "00000000000000048033cf0d24801200000000000000048033cf0d24b01248000");
        field_g[22] = new rd(-1, -1, true, 1272878999115L, "000000000000000cf08103060c00f30000000000cf003060c081030cf00000000");
        field_g[23] = new rd(-1, -1, true, 1272878132285L, "eefffffffffff0cfcf3ffcf3ffcf0cffffffffff70ecfbffcf70ff9ffef930fff");
        field_g[24] = new rd(-1, -1, true, 47096495364430L, "00000000000000000000000000000000000870f34b0f38700087000cc0c0ec937");
        for (var0 = 0; var0 < field_g.length; var0++) {
            field_g[var0].field_m = var0;
        }
        field_f = new rd[]{field_g[0], field_g[1], field_g[2], field_g[10], field_g[11], field_g[12], field_g[13], field_g[14], field_g[15], field_g[16], field_g[17], field_g[18], field_g[19], field_g[20], field_g[3], field_g[4], field_g[5], field_g[6], field_g[7], field_g[8], field_g[9], field_g[21], field_g[22], field_g[23], field_g[24]};
        field_p = "Exhibition game. No experience or league points are awarded.";
        field_k = 0;
    }
}
