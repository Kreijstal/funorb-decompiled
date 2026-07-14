/*
 * Decompiled by CFR-JS 0.4.0.
 */
class w implements q {
    private vi field_a;
    private vr field_b;
    static long field_g;
    static int[][] field_h;
    static boolean field_e;
    private gma[] field_c;
    private vr field_d;
    private int field_f;

    on d(int param0, int param1) {
        eo var3 = ((w) this).field_a.a(param1 ^ -23159, (long)param0);
        if (var3 != null) {
            return (on) (Object) var3;
        }
        byte[] var4 = ((w) this).field_d.b(param0, 0);
        if (var4 == null) {
            return null;
        }
        on var5 = new on(new lu(var4));
        ((w) this).field_a.a((eo) (Object) var5, (long)param0, 97);
        if (param1 != -23060) {
            field_h = null;
        }
        return var5;
    }

    public final gma c(int param0, int param1) {
        if (param1 != 0) {
            return null;
        }
        return ((w) this).field_c[param0];
    }

    final static void a(boolean param0) {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        lda var9 = null;
        int var10 = 0;
        int stackIn_10_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_12_1 = 0;
        lda stackIn_17_0 = null;
        int stackOut_9_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_11_1 = 0;
        int stackOut_10_0 = 0;
        int stackOut_10_1 = 0;
        lda stackOut_16_0 = null;
        lda stackOut_15_0 = null;
        L0: {
          var10 = BachelorFridge.field_y;
          if (param0) {
            break L0;
          } else {
            w.a(true);
            break L0;
          }
        }
        var1 = dfa.field_b + -rs.field_a;
        rs.field_a = sd.field_a - (var1 >> -1451153727);
        vka.field_q = -(ula.field_f >> 477840577) + jfa.field_w;
        dfa.field_b = var1 + rs.field_a;
        var2 = vka.field_q;
        var3 = 0;
        L1: while (true) {
          if (pt.field_a.length <= var3) {
            return;
          } else {
            L2: {
              var4 = gn.field_l[var3];
              if (var4 >= 0) {
                if (var4 != fw.field_i.field_g) {
                  var5 = mt.field_v;
                  break L2;
                } else {
                  var5 = ru.field_c;
                  break L2;
                }
              } else {
                var5 = wk.field_f;
                break L2;
              }
            }
            L3: {
              var6 = pt.field_a[var3];
              stackOut_9_0 = 1;
              stackIn_11_0 = stackOut_9_0;
              stackIn_10_0 = stackOut_9_0;
              if (var4 < 0) {
                stackOut_11_0 = stackIn_11_0;
                stackOut_11_1 = 0;
                stackIn_12_0 = stackOut_11_0;
                stackIn_12_1 = stackOut_11_1;
                break L3;
              } else {
                stackOut_10_0 = stackIn_10_0;
                stackOut_10_1 = 1;
                stackIn_12_0 = stackOut_10_0;
                stackIn_12_1 = stackOut_10_1;
                break L3;
              }
            }
            L4: {
              var7 = hka.a(stackIn_12_0 != 0, stackIn_12_1 != 0, var6);
              var8 = -(var7 >> -111540223) + sd.field_a;
              if (var4 >= 0) {
                L5: {
                  if (fw.field_i.field_g == var4) {
                    stackOut_16_0 = nj.field_j;
                    stackIn_17_0 = stackOut_16_0;
                    break L5;
                  } else {
                    stackOut_15_0 = aka.field_x;
                    stackIn_17_0 = stackOut_15_0;
                    break L5;
                  }
                }
                L6: {
                  var9 = (lda) (Object) stackIn_17_0;
                  var2 = var2 + raa.field_J;
                  if (var9 != null) {
                    var9.a(jo.field_t + (pba.field_r << -690463999), 28, -hna.field_k + var8, var2, var7 - -(hna.field_k << 1369786433));
                    break L6;
                  } else {
                    break L6;
                  }
                }
                var2 = var2 + pba.field_r;
                break L4;
              } else {
                break L4;
              }
            }
            if (0 <= var4) {
              lha.field_b.c(var6, var8, var2 + mha.field_g, var5, -1);
              var2 = var2 + (pba.field_r + (raa.field_J + jo.field_t));
              var3++;
              continue L1;
            } else {
              qm.field_a.c(var6, var8, ah.field_l + var2, var5, -1);
              var2 = var2 + un.field_i;
              var3++;
              continue L1;
            }
          }
        }
    }

    public static void a(int param0) {
        field_h = null;
        if (param0 <= 29) {
            w.a(true);
        }
    }

    w(vr param0, vr param1, vr param2) {
        int var5 = 0;
        lu var7 = null;
        gma stackIn_10_0 = null;
        gma stackIn_11_0 = null;
        gma stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        gma stackIn_18_0 = null;
        gma stackIn_19_0 = null;
        gma stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        gma stackIn_71_0 = null;
        gma stackIn_72_0 = null;
        gma stackIn_73_0 = null;
        int stackIn_73_1 = 0;
        gma stackOut_70_0 = null;
        gma stackOut_72_0 = null;
        int stackOut_72_1 = 0;
        gma stackOut_71_0 = null;
        int stackOut_71_1 = 0;
        gma stackOut_17_0 = null;
        gma stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        gma stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        gma stackOut_9_0 = null;
        gma stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        gma stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        ((w) this).field_a = new vi(256);
        ((w) this).field_d = param1;
        ((w) this).field_b = param2;
        var7 = new lu(param0.b(-38, 0, 0));
        ((w) this).field_f = var7.e((byte) 103);
        ((w) this).field_c = new gma[((w) this).field_f];
        var5 = 0;
        L0: while (true) {
          if (((w) this).field_f <= var5) {
            var5 = 0;
            L1: while (true) {
              if (((w) this).field_f <= var5) {
                var5 = 0;
                L2: while (true) {
                  if (var5 >= ((w) this).field_f) {
                    var5 = 0;
                    L3: while (true) {
                      if (((w) this).field_f <= var5) {
                        var5 = 0;
                        L4: while (true) {
                          if (var5 >= ((w) this).field_f) {
                            var5 = 0;
                            L5: while (true) {
                              if (var5 >= ((w) this).field_f) {
                                var5 = 0;
                                L6: while (true) {
                                  if (((w) this).field_f <= var5) {
                                    var5 = 0;
                                    L7: while (true) {
                                      if (((w) this).field_f <= var5) {
                                        var5 = 0;
                                        L8: while (true) {
                                          if (var5 >= ((w) this).field_f) {
                                            var5 = 0;
                                            L9: while (true) {
                                              if (((w) this).field_f <= var5) {
                                                var5 = 0;
                                                L10: while (true) {
                                                  if (var5 >= ((w) this).field_f) {
                                                    var5 = 0;
                                                    L11: while (true) {
                                                      if (((w) this).field_f <= var5) {
                                                        var5 = 0;
                                                        L12: while (true) {
                                                          if (var5 >= ((w) this).field_f) {
                                                            var5 = 0;
                                                            L13: while (true) {
                                                              if (var5 >= ((w) this).field_f) {
                                                                var5 = 0;
                                                                L14: while (true) {
                                                                  if (var5 >= ((w) this).field_f) {
                                                                    var5 = 0;
                                                                    L15: while (true) {
                                                                      if (var5 >= ((w) this).field_f) {
                                                                        var5 = 0;
                                                                        L16: while (true) {
                                                                          if (var5 >= ((w) this).field_f) {
                                                                            var5 = 0;
                                                                            L17: while (true) {
                                                                              if (var5 >= ((w) this).field_f) {
                                                                                var5 = 0;
                                                                                L18: while (true) {
                                                                                  if (var5 >= ((w) this).field_f) {
                                                                                    var5 = 0;
                                                                                    L19: while (true) {
                                                                                      if (((w) this).field_f <= var5) {
                                                                                      } else {
                                                                                        if (null != ((w) this).field_c[var5]) {
                                                                                          ((w) this).field_c[var5].field_b = var7.b(16711935);
                                                                                          var5++;
                                                                                          continue L19;
                                                                                        } else {
                                                                                          var5++;
                                                                                          continue L19;
                                                                                        }
                                                                                      }
                                                                                    }
                                                                                  } else {
                                                                                    if (null != ((w) this).field_c[var5]) {
                                                                                      int discarded$14 = var7.f(57);
                                                                                      var5++;
                                                                                      continue L18;
                                                                                    } else {
                                                                                      var5++;
                                                                                      continue L18;
                                                                                    }
                                                                                  }
                                                                                }
                                                                              } else {
                                                                                if (((w) this).field_c[var5] != null) {
                                                                                  int discarded$15 = var7.b(16711935);
                                                                                  var5++;
                                                                                  continue L17;
                                                                                } else {
                                                                                  var5++;
                                                                                  continue L17;
                                                                                }
                                                                              }
                                                                            }
                                                                          } else {
                                                                            if (null != ((w) this).field_c[var5]) {
                                                                              int discarded$16 = var7.b(16711935);
                                                                              var5++;
                                                                              continue L16;
                                                                            } else {
                                                                              var5++;
                                                                              continue L16;
                                                                            }
                                                                          }
                                                                        }
                                                                      } else {
                                                                        if (((w) this).field_c[var5] != null) {
                                                                          int discarded$17 = var7.b(16711935);
                                                                          var5++;
                                                                          continue L15;
                                                                        } else {
                                                                          var5++;
                                                                          continue L15;
                                                                        }
                                                                      }
                                                                    }
                                                                  } else {
                                                                    if (null != ((w) this).field_c[var5]) {
                                                                      int discarded$18 = var7.b(16711935);
                                                                      var5++;
                                                                      continue L14;
                                                                    } else {
                                                                      var5++;
                                                                      continue L14;
                                                                    }
                                                                  }
                                                                }
                                                              } else {
                                                                if (((w) this).field_c[var5] != null) {
                                                                  byte discarded$19 = var7.b(true);
                                                                  var5++;
                                                                  continue L13;
                                                                } else {
                                                                  var5++;
                                                                  continue L13;
                                                                }
                                                              }
                                                            }
                                                          } else {
                                                            if (((w) this).field_c[var5] != null) {
                                                              L20: {
                                                                stackOut_70_0 = ((w) this).field_c[var5];
                                                                stackIn_72_0 = stackOut_70_0;
                                                                stackIn_71_0 = stackOut_70_0;
                                                                if (-2 != (var7.b(16711935) ^ -1)) {
                                                                  stackOut_72_0 = (gma) (Object) stackIn_72_0;
                                                                  stackOut_72_1 = 0;
                                                                  stackIn_73_0 = stackOut_72_0;
                                                                  stackIn_73_1 = stackOut_72_1;
                                                                  break L20;
                                                                } else {
                                                                  stackOut_71_0 = (gma) (Object) stackIn_71_0;
                                                                  stackOut_71_1 = 1;
                                                                  stackIn_73_0 = stackOut_71_0;
                                                                  stackIn_73_1 = stackOut_71_1;
                                                                  break L20;
                                                                }
                                                              }
                                                              ((gma) (Object) stackIn_73_0).field_a = stackIn_73_1 != 0;
                                                              var5++;
                                                              continue L12;
                                                            } else {
                                                              var5++;
                                                              continue L12;
                                                            }
                                                          }
                                                        }
                                                      } else {
                                                        if (null != ((w) this).field_c[var5]) {
                                                          int discarded$20 = var7.b(16711935);
                                                          var5++;
                                                          continue L11;
                                                        } else {
                                                          var5++;
                                                          continue L11;
                                                        }
                                                      }
                                                    }
                                                  } else {
                                                    if (null != ((w) this).field_c[var5]) {
                                                      byte discarded$21 = var7.b(true);
                                                      var5++;
                                                      continue L10;
                                                    } else {
                                                      var5++;
                                                      continue L10;
                                                    }
                                                  }
                                                }
                                              } else {
                                                if (null != ((w) this).field_c[var5]) {
                                                  byte discarded$22 = var7.b(true);
                                                  var5++;
                                                  continue L9;
                                                } else {
                                                  var5++;
                                                  continue L9;
                                                }
                                              }
                                            }
                                          } else {
                                            if (((w) this).field_c[var5] != null) {
                                              ((w) this).field_c[var5].field_g = (short)var7.e((byte) 77);
                                              var5++;
                                              continue L8;
                                            } else {
                                              var5++;
                                              continue L8;
                                            }
                                          }
                                        }
                                      } else {
                                        if (((w) this).field_c[var5] != null) {
                                          byte discarded$23 = var7.b(true);
                                          var5++;
                                          continue L7;
                                        } else {
                                          var5++;
                                          continue L7;
                                        }
                                      }
                                    }
                                  } else {
                                    if (null != ((w) this).field_c[var5]) {
                                      byte discarded$24 = var7.b(true);
                                      var5++;
                                      continue L6;
                                    } else {
                                      var5++;
                                      continue L6;
                                    }
                                  }
                                }
                              } else {
                                if (((w) this).field_c[var5] != null) {
                                  byte discarded$25 = var7.b(true);
                                  var5++;
                                  continue L5;
                                } else {
                                  var5++;
                                  continue L5;
                                }
                              }
                            }
                          } else {
                            if (((w) this).field_c[var5] != null) {
                              byte discarded$26 = var7.b(true);
                              var5++;
                              continue L4;
                            } else {
                              var5++;
                              continue L4;
                            }
                          }
                        }
                      } else {
                        if (null != ((w) this).field_c[var5]) {
                          int discarded$27 = var7.b(16711935);
                          var5++;
                          continue L3;
                        } else {
                          var5++;
                          continue L3;
                        }
                      }
                    }
                  } else {
                    if (null != ((w) this).field_c[var5]) {
                      L21: {
                        stackOut_17_0 = ((w) this).field_c[var5];
                        stackIn_19_0 = stackOut_17_0;
                        stackIn_18_0 = stackOut_17_0;
                        if (var7.b(16711935) != 1) {
                          stackOut_19_0 = (gma) (Object) stackIn_19_0;
                          stackOut_19_1 = 0;
                          stackIn_20_0 = stackOut_19_0;
                          stackIn_20_1 = stackOut_19_1;
                          break L21;
                        } else {
                          stackOut_18_0 = (gma) (Object) stackIn_18_0;
                          stackOut_18_1 = 1;
                          stackIn_20_0 = stackOut_18_0;
                          stackIn_20_1 = stackOut_18_1;
                          break L21;
                        }
                      }
                      ((gma) (Object) stackIn_20_0).field_d = stackIn_20_1 != 0;
                      var5++;
                      continue L2;
                    } else {
                      var5++;
                      continue L2;
                    }
                  }
                }
              } else {
                if (((w) this).field_c[var5] != null) {
                  L22: {
                    stackOut_9_0 = ((w) this).field_c[var5];
                    stackIn_11_0 = stackOut_9_0;
                    stackIn_10_0 = stackOut_9_0;
                    if (var7.b(16711935) != 0) {
                      stackOut_11_0 = (gma) (Object) stackIn_11_0;
                      stackOut_11_1 = 0;
                      stackIn_12_0 = stackOut_11_0;
                      stackIn_12_1 = stackOut_11_1;
                      break L22;
                    } else {
                      stackOut_10_0 = (gma) (Object) stackIn_10_0;
                      stackOut_10_1 = 1;
                      stackIn_12_0 = stackOut_10_0;
                      stackIn_12_1 = stackOut_10_1;
                      break L22;
                    }
                  }
                  ((gma) (Object) stackIn_12_0).field_f = stackIn_12_1 != 0;
                  var5++;
                  continue L1;
                } else {
                  var5++;
                  continue L1;
                }
              }
            }
          } else {
            if (var7.b(16711935) == 1) {
              ((w) this).field_c[var5] = new gma();
              var5++;
              continue L0;
            } else {
              var5++;
              continue L0;
            }
          }
        }
    }

    public final int[] a(int param0, boolean param1, int param2, float param3, int param4, int param5) {
        if (param0 != 0) {
            return null;
        }
        return ((w) this).d(param4, param0 ^ -23060).a((double)param3, ((w) this).field_c[param4].field_a, (q) this, param5, param2, ((w) this).field_b, param1, -1);
    }

    public final boolean c(byte param0, int param1) {
        on var3 = null;
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          var3 = ((w) this).d(param1, -23060);
          if (param0 < -45) {
            break L0;
          } else {
            gma discarded$2 = ((w) this).c(-79, 92);
            break L0;
          }
        }
        L1: {
          L2: {
            if (var3 == null) {
              break L2;
            } else {
              if (!var3.a((q) this, ((w) this).field_b, -63)) {
                break L2;
              } else {
                stackOut_4_0 = 1;
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            }
          }
          stackOut_5_0 = 0;
          stackIn_6_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_6_0 != 0;
    }

    static {
    }
}
