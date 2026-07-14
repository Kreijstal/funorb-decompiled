/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ol {
    private int field_b;
    private int[] field_i;
    private int[] field_a;
    private int field_d;
    static na field_h;
    private int field_f;
    private int field_c;
    static id field_g;
    static int field_e;

    public static void a(int param0) {
        field_g = null;
        if (param0 < 108) {
            field_h = null;
        }
        field_h = null;
    }

    final int c(int param0) {
        if (!(param0 != ((ol) this).field_d)) {
            this.b(param0 ^ 0);
            ((ol) this).field_d = 256;
        }
        ((ol) this).field_d = ((ol) this).field_d - 1;
        return ((ol) this).field_a[((ol) this).field_d - 1];
    }

    private final void d(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = MonkeyPuzzle2.field_F ? 1 : 0;
        if (param0 == 8273) {
          var6 = -1640531527;
          var4 = -1640531527;
          var3 = -1640531527;
          var10 = -1640531527;
          var9 = -1640531527;
          var8 = -1640531527;
          var5 = -1640531527;
          var7 = -1640531527;
          var2 = 0;
          L0: while (true) {
            if (4 <= var2) {
              var2 = 0;
              L1: while (true) {
                if ((var2 ^ -1) <= -257) {
                  var2 = 0;
                  L2: while (true) {
                    if ((var2 ^ -1) <= -257) {
                      this.b(0);
                      ((ol) this).field_d = 256;
                      return;
                    } else {
                      var6 = var6 + ((ol) this).field_i[3 + var2];
                      var8 = var8 + ((ol) this).field_i[var2 - -5];
                      var7 = var7 + ((ol) this).field_i[var2 - -4];
                      var3 = var3 + ((ol) this).field_i[var2];
                      var5 = var5 + ((ol) this).field_i[2 + var2];
                      var4 = var4 + ((ol) this).field_i[var2 + 1];
                      var10 = var10 + ((ol) this).field_i[var2 - -7];
                      var9 = var9 + ((ol) this).field_i[var2 + 6];
                      var3 = var3 ^ var4 << -1534587381;
                      var4 = var4 + var5;
                      var6 = var6 + var3;
                      var4 = var4 ^ var5 >>> 585986754;
                      var7 = var7 + var4;
                      var5 = var5 + var6;
                      var5 = var5 ^ var6 << -364741208;
                      var6 = var6 + var7;
                      var8 = var8 + var5;
                      var6 = var6 ^ var7 >>> -531678064;
                      var7 = var7 + var8;
                      var9 = var9 + var6;
                      var7 = var7 ^ var8 << -1428087446;
                      var8 = var8 + var9;
                      var10 = var10 + var7;
                      var8 = var8 ^ var9 >>> -577372732;
                      var9 = var9 + var10;
                      var3 = var3 + var8;
                      var9 = var9 ^ var10 << -1415483064;
                      var4 = var4 + var9;
                      var10 = var10 + var3;
                      var10 = var10 ^ var3 >>> 248481641;
                      var5 = var5 + var10;
                      var3 = var3 + var4;
                      ((ol) this).field_i[var2] = var3;
                      ((ol) this).field_i[1 + var2] = var4;
                      ((ol) this).field_i[2 + var2] = var5;
                      ((ol) this).field_i[var2 + 3] = var6;
                      ((ol) this).field_i[4 + var2] = var7;
                      ((ol) this).field_i[var2 - -5] = var8;
                      ((ol) this).field_i[6 + var2] = var9;
                      ((ol) this).field_i[var2 - -7] = var10;
                      var2 += 8;
                      continue L2;
                    }
                  }
                } else {
                  var5 = var5 + ((ol) this).field_a[2 + var2];
                  var4 = var4 + ((ol) this).field_a[var2 - -1];
                  var6 = var6 + ((ol) this).field_a[var2 + 3];
                  var9 = var9 + ((ol) this).field_a[6 + var2];
                  var7 = var7 + ((ol) this).field_a[4 + var2];
                  var10 = var10 + ((ol) this).field_a[var2 - -7];
                  var3 = var3 + ((ol) this).field_a[var2];
                  var8 = var8 + ((ol) this).field_a[var2 - -5];
                  var3 = var3 ^ var4 << -850095765;
                  var4 = var4 + var5;
                  var6 = var6 + var3;
                  var4 = var4 ^ var5 >>> 1288611490;
                  var7 = var7 + var4;
                  var5 = var5 + var6;
                  var5 = var5 ^ var6 << -914708728;
                  var8 = var8 + var5;
                  var6 = var6 + var7;
                  var6 = var6 ^ var7 >>> 532454032;
                  var9 = var9 + var6;
                  var7 = var7 + var8;
                  var7 = var7 ^ var8 << -1520898710;
                  var8 = var8 + var9;
                  var10 = var10 + var7;
                  var8 = var8 ^ var9 >>> -45382492;
                  var3 = var3 + var8;
                  var9 = var9 + var10;
                  var9 = var9 ^ var10 << 1187904808;
                  var4 = var4 + var9;
                  var10 = var10 + var3;
                  var10 = var10 ^ var3 >>> 2076644009;
                  var3 = var3 + var4;
                  var5 = var5 + var10;
                  ((ol) this).field_i[var2] = var3;
                  ((ol) this).field_i[1 + var2] = var4;
                  ((ol) this).field_i[var2 + 2] = var5;
                  ((ol) this).field_i[3 + var2] = var6;
                  ((ol) this).field_i[4 + var2] = var7;
                  ((ol) this).field_i[5 + var2] = var8;
                  ((ol) this).field_i[6 + var2] = var9;
                  ((ol) this).field_i[var2 - -7] = var10;
                  var2 += 8;
                  continue L1;
                }
              }
            } else {
              var3 = var3 ^ var4 << 573062603;
              var4 = var4 + var5;
              var6 = var6 + var3;
              var4 = var4 ^ var5 >>> 929804802;
              var7 = var7 + var4;
              var5 = var5 + var6;
              var5 = var5 ^ var6 << 19940136;
              var8 = var8 + var5;
              var6 = var6 + var7;
              var6 = var6 ^ var7 >>> 1533786544;
              var9 = var9 + var6;
              var7 = var7 + var8;
              var7 = var7 ^ var8 << 1573691690;
              var8 = var8 + var9;
              var10 = var10 + var7;
              var8 = var8 ^ var9 >>> -1167363356;
              var3 = var3 + var8;
              var9 = var9 + var10;
              var9 = var9 ^ var10 << 1607644456;
              var10 = var10 + var3;
              var4 = var4 + var9;
              var10 = var10 ^ var3 >>> -869402487;
              var3 = var3 + var4;
              var5 = var5 + var10;
              var2++;
              continue L0;
            }
          }
        } else {
          return;
        }
    }

    final static void a(byte[] param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        byte[] var8 = null;
        byte[] var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        gk var16 = null;
        gk var17 = null;
        byte[] var18 = null;
        byte[] var19 = null;
        byte[] var20 = null;
        byte[] var21 = null;
        byte[] var22 = null;
        byte[] var23 = null;
        byte[] var24 = null;
        byte[] var25 = null;
        int stackIn_27_0 = 0;
        int stackIn_27_1 = 0;
        int stackIn_36_0 = 0;
        int stackIn_37_0 = 0;
        int stackIn_38_0 = 0;
        int stackIn_38_1 = 0;
        int stackIn_53_0 = 0;
        int stackIn_54_0 = 0;
        int stackIn_55_0 = 0;
        int stackIn_55_1 = 0;
        int stackOut_25_0 = 0;
        int stackOut_25_1 = 0;
        int stackOut_35_0 = 0;
        int stackOut_37_0 = 0;
        int stackOut_37_1 = 0;
        int stackOut_36_0 = 0;
        int stackOut_36_1 = 0;
        int stackOut_52_0 = 0;
        int stackOut_54_0 = 0;
        int stackOut_54_1 = 0;
        int stackOut_53_0 = 0;
        int stackOut_53_1 = 0;
        var15 = MonkeyPuzzle2.field_F ? 1 : 0;
        var16 = new gk(param0);
        var17 = var16;
        var17.field_h = -2 + param0.length;
        eg.field_c = var17.j(17277);
        ra.field_ab = new int[eg.field_c];
        j.field_d = new boolean[eg.field_c];
        cb.field_b = new byte[eg.field_c][];
        qc.field_P = new int[eg.field_c];
        da.field_c = new int[eg.field_c];
        mb.field_b = new int[eg.field_c];
        jj.field_E = new byte[eg.field_c][];
        var17.field_h = -7 + param0.length - 8 * eg.field_c;
        nj.field_d = var17.j(17277);
        qk.field_a = var17.j(17277);
        var3 = (255 & var17.a((byte) 114)) - -1;
        var4 = 0;
        L0: while (true) {
          L1: {
            if (var4 >= eg.field_c) {
              break L1;
            } else {
              qc.field_P[var4] = var16.j(17277);
              var4++;
              if (0 == 0) {
                continue L0;
              } else {
                break L1;
              }
            }
          }
          L2: {
            if (param1 <= -53) {
              break L2;
            } else {
              field_e = 83;
              break L2;
            }
          }
          var4 = 0;
          L3: while (true) {
            L4: {
              if (var4 >= eg.field_c) {
                break L4;
              } else {
                mb.field_b[var4] = var16.j(17277);
                var4++;
                if (0 == 0) {
                  continue L3;
                } else {
                  break L4;
                }
              }
            }
            var4 = 0;
            L5: while (true) {
              L6: {
                if (var4 >= eg.field_c) {
                  break L6;
                } else {
                  da.field_c[var4] = var16.j(17277);
                  var4++;
                  if (0 == 0) {
                    continue L5;
                  } else {
                    break L6;
                  }
                }
              }
              var4 = 0;
              L7: while (true) {
                L8: {
                  if (var4 >= eg.field_c) {
                    break L8;
                  } else {
                    ra.field_ab[var4] = var16.j(17277);
                    var4++;
                    if (0 == 0) {
                      continue L7;
                    } else {
                      break L8;
                    }
                  }
                }
                var17.field_h = -(3 * (var3 + -1)) + -(8 * eg.field_c) + (-7 + param0.length);
                fk.field_d = new int[var3];
                var4 = 1;
                L9: while (true) {
                  L10: {
                    if (var3 <= var4) {
                      break L10;
                    } else {
                      L11: {
                        fk.field_d[var4] = var16.c((byte) -121);
                        if (fk.field_d[var4] != 0) {
                          break L11;
                        } else {
                          fk.field_d[var4] = 1;
                          break L11;
                        }
                      }
                      var4++;
                      if (0 == 0) {
                        continue L9;
                      } else {
                        break L10;
                      }
                    }
                  }
                  var17.field_h = 0;
                  var4 = 0;
                  L12: while (true) {
                    L13: {
                      if (var4 >= eg.field_c) {
                        break L13;
                      } else {
                        var5 = da.field_c[var4];
                        var6 = ra.field_ab[var4];
                        var7 = var6 * var5;
                        var24 = new byte[var7];
                        var22 = var24;
                        var20 = var22;
                        var18 = var20;
                        var8 = var18;
                        cb.field_b[var4] = var24;
                        var25 = new byte[var7];
                        var23 = var25;
                        var21 = var23;
                        var19 = var21;
                        var9 = var19;
                        jj.field_E[var4] = var25;
                        var10 = 0;
                        var11 = var17.a((byte) 114);
                        stackOut_25_0 = -1;
                        stackOut_25_1 = var11 & 1 ^ -1;
                        stackIn_27_0 = stackOut_25_0;
                        stackIn_27_1 = stackOut_25_1;
                        L14: {
                          L15: {
                            if (stackIn_27_0 != stackIn_27_1) {
                              break L15;
                            } else {
                              var12 = 0;
                              L16: while (true) {
                                L17: {
                                  if (var12 >= var7) {
                                    break L17;
                                  } else {
                                    var8[var12] = var16.k(-77);
                                    var12++;
                                    if (0 == 0) {
                                      continue L16;
                                    } else {
                                      break L17;
                                    }
                                  }
                                }
                                if (0 == (2 & var11)) {
                                  break L14;
                                } else {
                                  var12 = 0;
                                  L18: while (true) {
                                    L19: {
                                      if (var12 >= var7) {
                                        break L19;
                                      } else {
                                        L20: {
                                          var9[var12] = var16.k(-108);
                                          var13 = var16.k(-108);
                                          stackOut_35_0 = var10;
                                          stackIn_37_0 = stackOut_35_0;
                                          stackIn_36_0 = stackOut_35_0;
                                          if ((var13 ^ -1) == 0) {
                                            stackOut_37_0 = stackIn_37_0;
                                            stackOut_37_1 = 0;
                                            stackIn_38_0 = stackOut_37_0;
                                            stackIn_38_1 = stackOut_37_1;
                                            break L20;
                                          } else {
                                            stackOut_36_0 = stackIn_36_0;
                                            stackOut_36_1 = 1;
                                            stackIn_38_0 = stackOut_36_0;
                                            stackIn_38_1 = stackOut_36_1;
                                            break L20;
                                          }
                                        }
                                        var10 = stackIn_38_0 | stackIn_38_1;
                                        var12++;
                                        if (0 == 0) {
                                          continue L18;
                                        } else {
                                          break L19;
                                        }
                                      }
                                    }
                                    if (0 == 0) {
                                      break L14;
                                    } else {
                                      break L15;
                                    }
                                  }
                                }
                              }
                            }
                          }
                          var12 = 0;
                          L21: while (true) {
                            L22: {
                              if (var12 >= var5) {
                                break L22;
                              } else {
                                var13 = 0;
                                L23: while (true) {
                                  L24: {
                                    if (var6 <= var13) {
                                      break L24;
                                    } else {
                                      var8[var12 + var5 * var13] = var16.k(34);
                                      var13++;
                                      if (0 == 0) {
                                        continue L23;
                                      } else {
                                        break L24;
                                      }
                                    }
                                  }
                                  var12++;
                                  if (0 == 0) {
                                    continue L21;
                                  } else {
                                    break L22;
                                  }
                                }
                              }
                            }
                            if (0 == (var11 & 2)) {
                              break L14;
                            } else {
                              var12 = 0;
                              L25: while (true) {
                                if (var12 >= var5) {
                                  break L14;
                                } else {
                                  var13 = 0;
                                  L26: while (true) {
                                    L27: {
                                      if (var6 <= var13) {
                                        break L27;
                                      } else {
                                        L28: {
                                          var9[var5 * var13 + var12] = var16.k(-117);
                                          var14 = var16.k(-117);
                                          stackOut_52_0 = var10;
                                          stackIn_54_0 = stackOut_52_0;
                                          stackIn_53_0 = stackOut_52_0;
                                          if (-1 == var14) {
                                            stackOut_54_0 = stackIn_54_0;
                                            stackOut_54_1 = 0;
                                            stackIn_55_0 = stackOut_54_0;
                                            stackIn_55_1 = stackOut_54_1;
                                            break L28;
                                          } else {
                                            stackOut_53_0 = stackIn_53_0;
                                            stackOut_53_1 = 1;
                                            stackIn_55_0 = stackOut_53_0;
                                            stackIn_55_1 = stackOut_53_1;
                                            break L28;
                                          }
                                        }
                                        var10 = stackIn_55_0 | stackIn_55_1;
                                        var13++;
                                        if (0 == 0) {
                                          continue L26;
                                        } else {
                                          break L27;
                                        }
                                      }
                                    }
                                    var12++;
                                    if (0 == 0) {
                                      continue L25;
                                    } else {
                                      break L14;
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                        j.field_d[var4] = var10 != 0;
                        var4++;
                        if (0 == 0) {
                          continue L12;
                        } else {
                          break L13;
                        }
                      }
                    }
                    return;
                  }
                }
              }
            }
          }
        }
    }

    private final void b(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = MonkeyPuzzle2.field_F ? 1 : 0;
        ((ol) this).field_c = ((ol) this).field_c + 1;
        ((ol) this).field_f = ((ol) this).field_f + (((ol) this).field_c + 1);
        var2 = param0;
        L0: while (true) {
          if (-257 >= (var2 ^ -1)) {
            return;
          } else {
            L1: {
              var3 = ((ol) this).field_i[var2];
              if ((var2 & 2) == 0) {
                if (-1 != (1 & var2 ^ -1)) {
                  ((ol) this).field_b = ((ol) this).field_b ^ ((ol) this).field_b >>> 1428725478;
                  break L1;
                } else {
                  ((ol) this).field_b = ((ol) this).field_b ^ ((ol) this).field_b << 1363682445;
                  break L1;
                }
              } else {
                if (0 != (var2 & 1)) {
                  ((ol) this).field_b = ((ol) this).field_b ^ ((ol) this).field_b >>> 200121584;
                  break L1;
                } else {
                  ((ol) this).field_b = ((ol) this).field_b ^ ((ol) this).field_b << -316251678;
                  break L1;
                }
              }
            }
            ((ol) this).field_b = ((ol) this).field_b + ((ol) this).field_i[var2 - -128 & 255];
            var4 = ((ol) this).field_i[ch.a(1020, var3) >> -765259934] + (((ol) this).field_b - -((ol) this).field_f);
            ((ol) this).field_i[var2] = ((ol) this).field_i[ch.a(1020, var3) >> -765259934] + (((ol) this).field_b - -((ol) this).field_f);
            ((ol) this).field_f = var3 + ((ol) this).field_i[ch.a(var4, 261285) >> 662818120 >> -1828268158];
            ((ol) this).field_a[var2] = var3 + ((ol) this).field_i[ch.a(var4, 261285) >> 662818120 >> -1828268158];
            var2++;
            continue L0;
          }
        }
    }

    ol(int[] param0) {
        int var2 = 0;
        ((ol) this).field_a = new int[256];
        ((ol) this).field_i = new int[256];
        for (var2 = 0; param0.length > var2; var2++) {
            ((ol) this).field_a[var2] = param0[var2];
        }
        this.d(8273);
    }

    final static ad a(int param0, int param1) {
        if (param0 >= -87) {
            field_g = null;
        }
        return em.a(false, param1, false, true, 1, 50);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = new na();
        field_e = 256;
    }
}
