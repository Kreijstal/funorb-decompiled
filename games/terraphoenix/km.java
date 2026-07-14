/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class km {
    static pg[] field_q;
    int field_j;
    bc[] field_f;
    static String[] field_c;
    int[] field_o;
    int field_i;
    static String field_m;
    int[] field_b;
    private int field_s;
    private byte[] field_a;
    int[] field_h;
    private int[][] field_n;
    int field_t;
    byte[][] field_p;
    int[] field_k;
    int[] field_d;
    int[][] field_r;
    private int[] field_l;
    static int field_e;
    bc field_g;

    public static void a(byte param0) {
        field_q = null;
        field_c = null;
        if (param0 != 13) {
            field_e = 1;
        }
        field_m = null;
    }

    final static bg a(int param0) {
        if (param0 < 111) {
            km.a((byte) 11);
        }
        bg var1 = new bg(ah.field_A, sb.field_j, ha.field_s[0], hj.field_K[0], sb.field_m[0], rf.field_p[0], qc.field_b[0], wb.field_a);
        mj.a((byte) 79);
        return var1;
    }

    private final void a(int param0, byte[] param1) {
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
        Object var17 = null;
        dh var18 = null;
        byte[] var22 = null;
        int stackIn_10_0 = 0;
        int stackIn_16_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        L0: {
          var16 = Terraphoenix.field_V;
          var18 = new dh(qg.a(-1, param1));
          var4 = var18.a(-16384);
          if (5 > var4) {
            break L0;
          } else {
            if (-8 > (var4 ^ -1)) {
              break L0;
            } else {
              L1: {
                if (6 <= var4) {
                  ((km) this).field_t = var18.f((byte) -107);
                  break L1;
                } else {
                  ((km) this).field_t = 0;
                  break L1;
                }
              }
              L2: {
                var5 = var18.a(-16384);
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
                if (-8 < (var4 ^ -1)) {
                  ((km) this).field_s = var18.i(-25578);
                  break L3;
                } else {
                  ((km) this).field_s = var18.d(-10355);
                  break L3;
                }
              }
              L4: {
                if (0 == (var5 & 2)) {
                  stackOut_15_0 = 0;
                  stackIn_16_0 = stackOut_15_0;
                  break L4;
                } else {
                  stackOut_14_0 = 1;
                  stackIn_16_0 = stackOut_14_0;
                  break L4;
                }
              }
              L5: {
                var7 = stackIn_16_0;
                var8 = 0;
                ((km) this).field_b = new int[((km) this).field_s];
                var9 = -1;
                if (7 <= var4) {
                  var10 = 0;
                  L6: while (true) {
                    if (var10 >= ((km) this).field_s) {
                      break L5;
                    } else {
                      var8 = var8 + var18.d(-10355);
                      ((km) this).field_b[var10] = var8 + var18.d(-10355);
                      if (var9 < ((km) this).field_b[var10]) {
                        var9 = ((km) this).field_b[var10];
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
                    if (var10 >= ((km) this).field_s) {
                      break L5;
                    } else {
                      var8 = var8 + var18.i(-25578);
                      ((km) this).field_b[var10] = var8 + var18.i(-25578);
                      if (((km) this).field_b[var10] > var9) {
                        var9 = ((km) this).field_b[var10];
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
                ((km) this).field_j = 1 + var9;
                ((km) this).field_h = new int[((km) this).field_j];
                if (var7 == 0) {
                  break L8;
                } else {
                  ((km) this).field_p = new byte[((km) this).field_j][];
                  break L8;
                }
              }
              L9: {
                ((km) this).field_r = new int[((km) this).field_j][];
                ((km) this).field_d = new int[((km) this).field_j];
                ((km) this).field_o = new int[((km) this).field_j];
                ((km) this).field_k = new int[((km) this).field_j];
                if (var6 == 0) {
                  break L9;
                } else {
                  ((km) this).field_l = new int[((km) this).field_j];
                  var10 = 0;
                  L10: while (true) {
                    if (((km) this).field_j <= var10) {
                      var10 = 0;
                      L11: while (true) {
                        if (((km) this).field_s <= var10) {
                          ((km) this).field_g = new bc(((km) this).field_l);
                          break L9;
                        } else {
                          ((km) this).field_l[((km) this).field_b[var10]] = var18.f((byte) -107);
                          var10++;
                          continue L11;
                        }
                      }
                    } else {
                      ((km) this).field_l[var10] = -1;
                      var10++;
                      continue L10;
                    }
                  }
                }
              }
              var10 = 0;
              L12: while (true) {
                if (((km) this).field_s <= var10) {
                  L13: {
                    if (param0 >= 37) {
                      break L13;
                    } else {
                      var17 = null;
                      this.a(107, (byte[]) null);
                      break L13;
                    }
                  }
                  L14: {
                    if (var7 == 0) {
                      break L14;
                    } else {
                      var10 = 0;
                      L15: while (true) {
                        if (((km) this).field_s <= var10) {
                          break L14;
                        } else {
                          var22 = new byte[64];
                          var18.a(64, 0, 103, var22);
                          ((km) this).field_p[((km) this).field_b[var10]] = var22;
                          var10++;
                          continue L15;
                        }
                      }
                    }
                  }
                  var10 = 0;
                  L16: while (true) {
                    if (var10 >= ((km) this).field_s) {
                      L17: {
                        if (var4 >= 7) {
                          var10 = 0;
                          L18: while (true) {
                            if (var10 >= ((km) this).field_s) {
                              var10 = 0;
                              L19: while (true) {
                                if (((km) this).field_s <= var10) {
                                  break L17;
                                } else {
                                  var11 = ((km) this).field_b[var10];
                                  var8 = 0;
                                  var12 = ((km) this).field_d[var11];
                                  ((km) this).field_r[var11] = new int[var12];
                                  var13 = -1;
                                  var14 = 0;
                                  L20: while (true) {
                                    if (var14 >= var12) {
                                      ((km) this).field_k[var11] = 1 + var13;
                                      if (var12 == 1 + var13) {
                                        ((km) this).field_r[var11] = null;
                                        var10++;
                                        continue L19;
                                      } else {
                                        var10++;
                                        continue L19;
                                      }
                                    } else {
                                      var8 = var8 + var18.d(-10355);
                                      ((km) this).field_r[var11][var14] = var8 + var18.d(-10355);
                                      var15 = var8 + var18.d(-10355);
                                      if (var15 > var13) {
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
                              ((km) this).field_d[((km) this).field_b[var10]] = var18.d(-10355);
                              var10++;
                              continue L18;
                            }
                          }
                        } else {
                          var10 = 0;
                          L21: while (true) {
                            if (((km) this).field_s <= var10) {
                              var10 = 0;
                              L22: while (true) {
                                if (((km) this).field_s <= var10) {
                                  break L17;
                                } else {
                                  var11 = ((km) this).field_b[var10];
                                  var12 = ((km) this).field_d[var11];
                                  var8 = 0;
                                  var13 = -1;
                                  ((km) this).field_r[var11] = new int[var12];
                                  var14 = 0;
                                  L23: while (true) {
                                    if (var12 <= var14) {
                                      ((km) this).field_k[var11] = 1 + var13;
                                      if (1 + var13 == var12) {
                                        ((km) this).field_r[var11] = null;
                                        var10++;
                                        continue L22;
                                      } else {
                                        var10++;
                                        continue L22;
                                      }
                                    } else {
                                      var8 = var8 + var18.i(-25578);
                                      ((km) this).field_r[var11][var14] = var8 + var18.i(-25578);
                                      var15 = var8 + var18.i(-25578);
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
                              ((km) this).field_d[((km) this).field_b[var10]] = var18.i(-25578);
                              var10++;
                              continue L21;
                            }
                          }
                        }
                      }
                      L24: {
                        if (var6 == 0) {
                          break L24;
                        } else {
                          ((km) this).field_n = new int[1 + var9][];
                          ((km) this).field_f = new bc[1 + var9];
                          var10 = 0;
                          L25: while (true) {
                            if (((km) this).field_s <= var10) {
                              break L24;
                            } else {
                              var11 = ((km) this).field_b[var10];
                              var12 = ((km) this).field_d[var11];
                              ((km) this).field_n[var11] = new int[((km) this).field_k[var11]];
                              var13 = 0;
                              L26: while (true) {
                                if (var13 >= ((km) this).field_k[var11]) {
                                  var13 = 0;
                                  L27: while (true) {
                                    if (var13 >= var12) {
                                      ((km) this).field_f[var11] = new bc(((km) this).field_n[var11]);
                                      var10++;
                                      continue L25;
                                    } else {
                                      L28: {
                                        if (((km) this).field_r[var11] == null) {
                                          var14 = var13;
                                          break L28;
                                        } else {
                                          var14 = ((km) this).field_r[var11][var13];
                                          break L28;
                                        }
                                      }
                                      ((km) this).field_n[var11][var14] = var18.f((byte) -107);
                                      var13++;
                                      continue L27;
                                    }
                                  }
                                } else {
                                  ((km) this).field_n[var11][var13] = -1;
                                  var13++;
                                  continue L26;
                                }
                              }
                            }
                          }
                        }
                      }
                      return;
                    } else {
                      ((km) this).field_o[((km) this).field_b[var10]] = var18.f((byte) -107);
                      var10++;
                      continue L16;
                    }
                  }
                } else {
                  ((km) this).field_h[((km) this).field_b[var10]] = var18.f((byte) -107);
                  var10++;
                  continue L12;
                }
              }
            }
          }
        }
        throw new RuntimeException();
    }

    km(byte[] param0, int param1, byte[] param2) {
        int var4 = 0;
        ((km) this).field_i = j.a(0, param0.length, param0);
        if (((km) this).field_i != param1) {
            throw new RuntimeException();
        }
        if (param2 != null) {
            if (-65 != (param2.length ^ -1)) {
                throw new RuntimeException();
            }
            ((km) this).field_a = tg.a(param0, param0.length, 0, 8);
            for (var4 = 0; (var4 ^ -1) > -65; var4++) {
                if (param2[var4] != ((km) this).field_a[var4]) {
                    throw new RuntimeException();
                }
            }
        }
        this.a(94, param0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = "Names should contain a maximum of 12 characters";
        field_q = new pg[10];
        field_e = 1600;
    }
}
