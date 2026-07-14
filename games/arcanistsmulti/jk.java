/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jk {
    static int field_u;
    private int[][] field_q;
    byte[][] field_k;
    private int field_w;
    int[] field_h;
    private int[] field_t;
    static qb field_o;
    private byte[] field_x;
    static ll[] field_n;
    int[][] field_e;
    static String field_d;
    static String field_j;
    int[] field_r;
    int[] field_i;
    static ll[] field_m;
    int field_p;
    static int[] field_a;
    static String field_s;
    n[] field_c;
    int field_g;
    int[] field_y;
    int field_f;
    int[] field_b;
    n field_l;
    static String field_v;

    private final void a(byte[] param0, int param1) {
        int var4 = 0;
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
        int var15 = 0;
        int var16 = 0;
        wk var17 = null;
        byte[] var21 = null;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        L0: {
          var16 = ArcanistsMulti.field_G ? 1 : 0;
          var17 = new wk(hb.a(false, param0));
          var4 = var17.e((byte) 31);
          if ((var4 ^ -1) > -6) {
            break L0;
          } else {
            if ((var4 ^ -1) < -8) {
              break L0;
            } else {
              L1: {
                if ((var4 ^ -1) <= -7) {
                  ((jk) this).field_g = var17.d(-10674);
                  break L1;
                } else {
                  ((jk) this).field_g = 0;
                  break L1;
                }
              }
              L2: {
                var5 = var17.e((byte) 94);
                if (0 == (var5 & 1)) {
                  stackOut_9_0 = 0;
                  stackIn_10_0 = stackOut_9_0;
                  break L2;
                } else {
                  stackOut_8_0 = 1;
                  stackIn_10_0 = stackOut_8_0;
                  break L2;
                }
              }
              L3: {
                var6 = stackIn_10_0;
                if ((2 & var5) == 0) {
                  stackOut_12_0 = 0;
                  stackIn_13_0 = stackOut_12_0;
                  break L3;
                } else {
                  stackOut_11_0 = 1;
                  stackIn_13_0 = stackOut_11_0;
                  break L3;
                }
              }
              L4: {
                var7 = stackIn_13_0;
                if (7 > var4) {
                  ((jk) this).field_w = var17.n(param1 ^ -110);
                  break L4;
                } else {
                  ((jk) this).field_w = var17.a((byte) -29);
                  break L4;
                }
              }
              var8 = 0;
              if (param1 == 12) {
                L5: {
                  ((jk) this).field_r = new int[((jk) this).field_w];
                  var9 = -1;
                  if (7 > var4) {
                    var10 = 0;
                    L6: while (true) {
                      if (((jk) this).field_w <= var10) {
                        break L5;
                      } else {
                        var8 = var8 + var17.n(-98);
                        ((jk) this).field_r[var10] = var8 + var17.n(-98);
                        if (((jk) this).field_r[var10] > var9) {
                          var9 = ((jk) this).field_r[var10];
                          var10++;
                          continue L6;
                        } else {
                          var10++;
                          continue L6;
                        }
                      }
                    }
                  } else {
                    var10 = 0;
                    L7: while (true) {
                      if (((jk) this).field_w <= var10) {
                        break L5;
                      } else {
                        var8 = var8 + var17.a((byte) -29);
                        ((jk) this).field_r[var10] = var8 + var17.a((byte) -29);
                        if (var9 < ((jk) this).field_r[var10]) {
                          var9 = ((jk) this).field_r[var10];
                          var10++;
                          continue L7;
                        } else {
                          var10++;
                          continue L7;
                        }
                      }
                    }
                  }
                }
                L8: {
                  ((jk) this).field_f = var9 + 1;
                  ((jk) this).field_e = new int[((jk) this).field_f][];
                  ((jk) this).field_i = new int[((jk) this).field_f];
                  ((jk) this).field_y = new int[((jk) this).field_f];
                  if (var7 == 0) {
                    break L8;
                  } else {
                    ((jk) this).field_k = new byte[((jk) this).field_f][];
                    break L8;
                  }
                }
                L9: {
                  ((jk) this).field_b = new int[((jk) this).field_f];
                  ((jk) this).field_h = new int[((jk) this).field_f];
                  if (var6 != 0) {
                    ((jk) this).field_t = new int[((jk) this).field_f];
                    var10 = 0;
                    L10: while (true) {
                      if (((jk) this).field_f <= var10) {
                        var10 = 0;
                        L11: while (true) {
                          if (var10 >= ((jk) this).field_w) {
                            ((jk) this).field_l = new n(((jk) this).field_t);
                            break L9;
                          } else {
                            ((jk) this).field_t[((jk) this).field_r[var10]] = var17.d(hh.a(param1, -10686));
                            var10++;
                            continue L11;
                          }
                        }
                      } else {
                        ((jk) this).field_t[var10] = -1;
                        var10++;
                        continue L10;
                      }
                    }
                  } else {
                    break L9;
                  }
                }
                var10 = 0;
                L12: while (true) {
                  if (((jk) this).field_w <= var10) {
                    L13: {
                      if (var7 != 0) {
                        var10 = 0;
                        L14: while (true) {
                          if (((jk) this).field_w <= var10) {
                            var10 = 0;
                            L15: while (true) {
                              if (var10 >= ((jk) this).field_w) {
                                break L13;
                              } else {
                                ((jk) this).field_y[((jk) this).field_r[var10]] = var17.d(-10674);
                                var10++;
                                continue L15;
                              }
                            }
                          } else {
                            var21 = new byte[64];
                            var17.a((byte) 45, 0, var21, 64);
                            ((jk) this).field_k[((jk) this).field_r[var10]] = var21;
                            var10++;
                            continue L14;
                          }
                        }
                      } else {
                        var10 = 0;
                        L16: while (true) {
                          if (var10 >= ((jk) this).field_w) {
                            break L13;
                          } else {
                            ((jk) this).field_y[((jk) this).field_r[var10]] = var17.d(-10674);
                            var10++;
                            continue L16;
                          }
                        }
                      }
                    }
                    L17: {
                      if (7 <= var4) {
                        var10 = 0;
                        L18: while (true) {
                          if (((jk) this).field_w <= var10) {
                            var10 = 0;
                            L19: while (true) {
                              if (((jk) this).field_w <= var10) {
                                break L17;
                              } else {
                                var11 = ((jk) this).field_r[var10];
                                var12 = ((jk) this).field_b[var11];
                                var8 = 0;
                                ((jk) this).field_e[var11] = new int[var12];
                                var13 = -1;
                                var14 = 0;
                                L20: while (true) {
                                  if (var12 <= var14) {
                                    ((jk) this).field_i[var11] = var13 - -1;
                                    if (1 + var13 == var12) {
                                      ((jk) this).field_e[var11] = null;
                                      var10++;
                                      continue L19;
                                    } else {
                                      var10++;
                                      continue L19;
                                    }
                                  } else {
                                    var8 = var8 + var17.a((byte) -29);
                                    ((jk) this).field_e[var11][var14] = var8 + var17.a((byte) -29);
                                    var15 = var8 + var17.a((byte) -29);
                                    if (var13 < var15) {
                                      var13 = var15;
                                      var14++;
                                      continue L20;
                                    } else {
                                      var14++;
                                      continue L20;
                                    }
                                  }
                                }
                              }
                            }
                          } else {
                            ((jk) this).field_b[((jk) this).field_r[var10]] = var17.a((byte) -29);
                            var10++;
                            continue L18;
                          }
                        }
                      } else {
                        var10 = 0;
                        L21: while (true) {
                          if (var10 >= ((jk) this).field_w) {
                            var10 = 0;
                            L22: while (true) {
                              if (((jk) this).field_w <= var10) {
                                break L17;
                              } else {
                                var11 = ((jk) this).field_r[var10];
                                var12 = ((jk) this).field_b[var11];
                                var8 = 0;
                                ((jk) this).field_e[var11] = new int[var12];
                                var13 = -1;
                                var14 = 0;
                                L23: while (true) {
                                  if (var14 >= var12) {
                                    ((jk) this).field_i[var11] = 1 + var13;
                                    if (var12 == var13 + 1) {
                                      ((jk) this).field_e[var11] = null;
                                      var10++;
                                      continue L22;
                                    } else {
                                      var10++;
                                      continue L22;
                                    }
                                  } else {
                                    var8 = var8 + var17.n(-98);
                                    ((jk) this).field_e[var11][var14] = var8 + var17.n(-98);
                                    var15 = var8 + var17.n(-98);
                                    if (var13 < var15) {
                                      var13 = var15;
                                      var14++;
                                      continue L23;
                                    } else {
                                      var14++;
                                      continue L23;
                                    }
                                  }
                                }
                              }
                            }
                          } else {
                            ((jk) this).field_b[((jk) this).field_r[var10]] = var17.n(-98);
                            var10++;
                            continue L21;
                          }
                        }
                      }
                    }
                    L24: {
                      if (var6 != 0) {
                        ((jk) this).field_c = new n[var9 - -1];
                        ((jk) this).field_q = new int[var9 - -1][];
                        var10 = 0;
                        L25: while (true) {
                          if (var10 >= ((jk) this).field_w) {
                            break L24;
                          } else {
                            var11 = ((jk) this).field_r[var10];
                            var12 = ((jk) this).field_b[var11];
                            ((jk) this).field_q[var11] = new int[((jk) this).field_i[var11]];
                            var13 = 0;
                            L26: while (true) {
                              if (var13 >= ((jk) this).field_i[var11]) {
                                var13 = 0;
                                L27: while (true) {
                                  if (var13 >= var12) {
                                    ((jk) this).field_c[var11] = new n(((jk) this).field_q[var11]);
                                    var10++;
                                    continue L25;
                                  } else {
                                    L28: {
                                      if (((jk) this).field_e[var11] != null) {
                                        var14 = ((jk) this).field_e[var11][var13];
                                        break L28;
                                      } else {
                                        var14 = var13;
                                        break L28;
                                      }
                                    }
                                    ((jk) this).field_q[var11][var14] = var17.d(hh.a(param1, -10686));
                                    var13++;
                                    continue L27;
                                  }
                                }
                              } else {
                                ((jk) this).field_q[var11][var13] = -1;
                                var13++;
                                continue L26;
                              }
                            }
                          }
                        }
                      } else {
                        break L24;
                      }
                    }
                    return;
                  } else {
                    ((jk) this).field_h[((jk) this).field_r[var10]] = var17.d(-10674);
                    var10++;
                    continue L12;
                  }
                }
              } else {
                return;
              }
            }
          }
        }
        throw new RuntimeException();
    }

    public static void a(int param0) {
        field_m = null;
        field_a = null;
        field_d = null;
        field_s = null;
        field_n = null;
        field_o = null;
        field_j = null;
        if (param0 != 0) {
            Object var2 = null;
            jk.a(2, (v) null);
        }
        field_v = null;
    }

    final static String a(int param0, jg param1) {
        String var2 = null;
        String var3 = null;
        int var4 = 0;
        Object var5 = null;
        String var6 = null;
        L0: {
          var4 = ArcanistsMulti.field_G ? 1 : 0;
          if (param0 == 3) {
            break L0;
          } else {
            var5 = null;
            String discarded$1 = jk.a(-73, (jg) null);
            break L0;
          }
        }
        L1: {
          var2 = null;
          if (param1.field_g != null) {
            L2: {
              var6 = param1.field_g;
              if (1 == param1.field_b) {
                var2 = "<img=0>" + var6;
                break L2;
              } else {
                break L2;
              }
            }
            if (-3 == (param1.field_b ^ -1)) {
              var2 = "<img=1>" + var2;
              break L1;
            } else {
              break L1;
            }
          } else {
            break L1;
          }
        }
        L3: {
          var3 = "";
          if ((param1.field_m ^ -1) != -3) {
            L4: {
              if (0 != param1.field_m) {
                break L4;
              } else {
                if (!hm.field_c) {
                  break L4;
                } else {
                  var3 = "[" + lj.field_p + "] ";
                  break L4;
                }
              }
            }
            L5: {
              if (-2 == (param1.field_m ^ -1)) {
                var3 = "[" + tj.a(-44, new String[1], ul.field_j) + "] ";
                break L5;
              } else {
                break L5;
              }
            }
            L6: {
              if ((param1.field_m ^ -1) != -5) {
                break L6;
              } else {
                if (null == he.field_d) {
                  break L6;
                } else {
                  var3 = "[" + he.field_d + "] ";
                  break L6;
                }
              }
            }
            L7: {
              if (param1.field_m == 3) {
                var3 = "[#" + param1.field_o + "] ";
                break L7;
              } else {
                break L7;
              }
            }
            if (param1.field_i) {
              break L3;
            } else {
              var3 = var3 + var2 + ": ";
              break L3;
            }
          } else {
            if (param1.field_i) {
              break L3;
            } else {
              L8: {
                if (param1.field_d != 0) {
                  break L8;
                } else {
                  if (0 == param1.field_k) {
                    var3 = tj.a(param0 + -130, new String[1], ge.field_n);
                    break L3;
                  } else {
                    break L8;
                  }
                }
              }
              var3 = tj.a(-18, new String[1], pk.field_f);
              break L3;
            }
          }
        }
        return var3;
    }

    final static void a(int param0, v param1) {
        int stackIn_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        L0: {
          L1: {
            ob.field_Y = param1;
            if (ob.field_Y == null) {
              break L1;
            } else {
              if (ob.field_Y.field_l) {
                stackOut_4_0 = 1;
                stackIn_5_0 = stackOut_4_0;
                break L0;
              } else {
                break L1;
              }
            }
          }
          stackOut_3_0 = 0;
          stackIn_5_0 = stackOut_3_0;
          break L0;
        }
        L2: {
          li.a(stackIn_5_0, 0);
          if (param0 <= -110) {
            break L2;
          } else {
            field_s = null;
            break L2;
          }
        }
    }

    final static boolean b(int param0) {
        int var1 = 60 % ((8 - param0) / 48);
        return re.a((byte) -68, cd.e(122));
    }

    final static void a(byte param0) {
        int var2 = 0;
        var2 = ArcanistsMulti.field_G ? 1 : 0;
        if (null == jb.field_z) {
          return;
        } else {
          L0: {
            if (param0 == 121) {
              break L0;
            } else {
              field_v = null;
              break L0;
            }
          }
          L1: {
            if (!jb.field_z.field_i) {
              if ((1 << jb.field_z.field_I & jb.field_z.field_b) == 0) {
                if (jb.field_z.field_b != 0) {
                  ce.field_g[12] = mo.field_g;
                  break L1;
                } else {
                  if ((jb.field_z.field_a | 1 << jb.field_z.field_I) == (1 << jb.field_z.field_V.s(0)) - 1) {
                    ce.field_g[12] = rb.field_m;
                    break L1;
                  } else {
                    ce.field_g[12] = ra.field_n;
                    break L1;
                  }
                }
              } else {
                ce.field_g[12] = eh.field_d;
                break L1;
              }
            } else {
              if (-1 != (1 << jb.field_z.field_I & jb.field_z.field_b ^ -1)) {
                ce.field_g[12] = vm.field_e;
                break L1;
              } else {
                if (0 == jb.field_z.field_b) {
                  if ((1 << jb.field_z.field_I | jb.field_z.field_a) != -1 + (1 << jb.field_z.field_V.s(param0 ^ 121))) {
                    ce.field_g[12] = nl.field_Bb;
                    break L1;
                  } else {
                    ce.field_g[12] = so.field_b;
                    break L1;
                  }
                } else {
                  ce.field_g[12] = ng.field_H;
                  break L1;
                }
              }
            }
          }
          return;
        }
    }

    jk(byte[] param0, int param1, byte[] param2) {
        int var4 = 0;
        ((jk) this).field_p = mj.a(param0.length, (byte) -104, param0);
        if (param1 != ((jk) this).field_p) {
            throw new RuntimeException();
        }
        if (param2 != null) {
            if (-65 != param2.length) {
                throw new RuntimeException();
            }
            ((jk) this).field_x = nn.a(param0.length, (byte) -93, param0, 0);
            for (var4 = 0; -65 > var4; var4++) {
                if (((jk) this).field_x[var4] != param2[var4]) {
                    throw new RuntimeException();
                }
            }
        }
        this.a(param0, 12);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = "Game Options";
        field_s = "Your email address is used to identify this account";
        field_a = new int[]{2, 3, 4, 5, 6};
        field_d = "Not enough wands to buy (";
        field_v = "This is the Book of Underdark. Underdark spells focus on stealing health and turning minions into zombies. You require 5 wands to purchase this spellbook; you currently have ";
    }
}
