/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qqb implements ntb {
    private wna[] field_a;
    static int field_b;

    final int a(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        wna var5 = null;
        int var6 = 0;
        L0: {
          var6 = VoidHunters.field_G;
          if (null == ((qqb) this).field_a) {
            break L0;
          } else {
            if (((qqb) this).field_a.length == 0) {
              break L0;
            } else {
              L1: {
                var3 = 0;
                var4 = 0;
                if (param0 <= -49) {
                  break L1;
                } else {
                  qqb.a(-126);
                  break L1;
                }
              }
              L2: while (true) {
                if (((qqb) this).field_a.length <= var4) {
                  return var3;
                } else {
                  var5 = ((qqb) this).field_a[var4];
                  if (var5.field_d == param1) {
                    var3++;
                    var4++;
                    continue L2;
                  } else {
                    var4++;
                    continue L2;
                  }
                }
              }
            }
          }
        }
        return 0;
    }

    public final void b(byte param0, tv param1) {
        qqb var3 = (qqb) (Object) param1;
        var3.field_a = (wna[]) (Object) sqb.a((tv[]) (Object) var3.field_a, (tv[]) (Object) var3.field_a, 1, lm.field_b, false);
        if (param0 < 54) {
            Object var4 = null;
            ((qqb) this).a((tv) null, 79);
        }
    }

    public final void b(faa param0, int param1) {
        faa var3 = null;
        wna[] var4 = null;
        int var5 = 0;
        wna[] var6 = null;
        int var7 = 0;
        wna var8 = null;
        int var9 = 0;
        int stackIn_5_0 = 0;
        faa stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        faa stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        faa stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        int stackIn_11_2 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        faa stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        faa stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        int stackOut_10_2 = 0;
        faa stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        int stackOut_9_2 = 0;
        var9 = VoidHunters.field_G;
        var3 = param0;
        var4 = ((qqb) this).field_a;
        if (param1 < -109) {
          L0: {
            if (var4 == null) {
              stackOut_4_0 = 0;
              stackIn_5_0 = stackOut_4_0;
              break L0;
            } else {
              stackOut_3_0 = var4.length;
              stackIn_5_0 = stackOut_3_0;
              break L0;
            }
          }
          L1: {
            var5 = stackIn_5_0;
            var3.a(-632, var5, 8);
            if (-1 == (var5 ^ -1)) {
              break L1;
            } else {
              var6 = var4;
              var7 = 0;
              L2: while (true) {
                if (var6.length <= var7) {
                  break L1;
                } else {
                  L3: {
                    var8 = var6[var7];
                    stackOut_8_0 = (faa) var3;
                    stackOut_8_1 = 86;
                    stackIn_10_0 = stackOut_8_0;
                    stackIn_10_1 = stackOut_8_1;
                    stackIn_9_0 = stackOut_8_0;
                    stackIn_9_1 = stackOut_8_1;
                    if (var8 == null) {
                      stackOut_10_0 = (faa) (Object) stackIn_10_0;
                      stackOut_10_1 = stackIn_10_1;
                      stackOut_10_2 = 0;
                      stackIn_11_0 = stackOut_10_0;
                      stackIn_11_1 = stackOut_10_1;
                      stackIn_11_2 = stackOut_10_2;
                      break L3;
                    } else {
                      stackOut_9_0 = (faa) (Object) stackIn_9_0;
                      stackOut_9_1 = stackIn_9_1;
                      stackOut_9_2 = 1;
                      stackIn_11_0 = stackOut_9_0;
                      stackIn_11_1 = stackOut_9_1;
                      stackIn_11_2 = stackOut_9_2;
                      break L3;
                    }
                  }
                  if (vq.a(stackIn_11_0, stackIn_11_1, stackIn_11_2 != 0)) {
                    stb.a(2, 1, var3, (tv) (Object) var8);
                    var7++;
                    continue L2;
                  } else {
                    var7++;
                    continue L2;
                  }
                }
              }
            }
          }
          return;
        } else {
          return;
        }
    }

    public final boolean a(byte param0, tv param1) {
        int var4 = -100 / ((22 - param0) / 59);
        qqb var3 = (qqb) (Object) param1;
        return dn.a((tv[]) (Object) var3.field_a, false, 1, (tv[]) (Object) var3.field_a, -39);
    }

    public final void a(faa param0, boolean param1) {
        ((qqb) this).field_a = (wna[]) (Object) kcb.a(8, lm.field_b, param0, 1, -62, (tv[]) (Object) ((qqb) this).field_a);
        if (param1) {
            field_b = 39;
        }
    }

    final int a(int param0, byte param1) {
        int var3 = 0;
        int var4 = 0;
        wna var5 = null;
        int var6 = 0;
        Object var7 = null;
        L0: {
          var6 = VoidHunters.field_G;
          if (((qqb) this).field_a == null) {
            break L0;
          } else {
            if (((qqb) this).field_a.length == 0) {
              break L0;
            } else {
              var3 = 0;
              var4 = 0;
              L1: while (true) {
                if (((qqb) this).field_a.length <= var4) {
                  L2: {
                    if (param1 == -88) {
                      break L2;
                    } else {
                      var7 = null;
                      ((qqb) this).a((faa) null, false);
                      break L2;
                    }
                  }
                  return var3;
                } else {
                  var5 = ((qqb) this).field_a[var4];
                  if (param0 == var5.field_d) {
                    var3 = var3 + var5.field_b;
                    var4++;
                    continue L1;
                  } else {
                    var4++;
                    continue L1;
                  }
                }
              }
            }
          }
        }
        return 0;
    }

    final void a(int param0, wna param1) {
        if (param0 < 87) {
            field_b = 57;
        }
        ((qqb) this).field_a = (wna[]) (Object) ija.a((Object) (Object) param1, (Object[]) (Object) ((qqb) this).field_a, 0, lm.field_b);
    }

    final static void a(int param0) {
        hla.field_a = null;
        if (param0 <= 36) {
            return;
        }
        iib.field_e = null;
        rlb.field_d = null;
        nhb.field_o = null;
        sh.field_a = null;
        so.field_f = null;
    }

    final int a(boolean param0) {
        int var2 = 0;
        int var3_int = 0;
        int[] var3 = null;
        int var5 = 0;
        int var6 = 0;
        wna var6_ref_wna = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int[] var11 = null;
        wna var12 = null;
        int[] var13 = null;
        int[] var14 = null;
        int[] var15 = null;
        int[] var16 = null;
        int[] var17 = null;
        int[] var18 = null;
        L0: {
          var10 = VoidHunters.field_G;
          js.field_o = 0;
          if (null == ((qqb) this).field_a) {
            break L0;
          } else {
            if (0 == ((qqb) this).field_a.length) {
              break L0;
            } else {
              L1: {
                var2 = unb.field_p + -1;
                var3_int = 0;
                if (param0) {
                  break L1;
                } else {
                  field_b = -113;
                  break L1;
                }
              }
              L2: while (true) {
                if (((qqb) this).field_a.length <= var3_int) {
                  var17 = new int[1 + var2];
                  var15 = var17;
                  var14 = var15;
                  var13 = var14;
                  var3 = var13;
                  var18 = new int[var17.length];
                  var16 = var18;
                  var11 = var16;
                  var5 = 0;
                  L3: while (true) {
                    if (((qqb) this).field_a.length <= var5) {
                      var5 = -1;
                      var6 = -2147483648;
                      js.field_o = 1;
                      var7 = 2147483647;
                      var8 = 0;
                      L4: while (true) {
                        if (var8 >= var17.length) {
                          var8 = 0;
                          var9 = 0;
                          L5: while (true) {
                            L6: {
                              if (var17.length <= var9) {
                                break L6;
                              } else {
                                if (var17[var9] == var6) {
                                  var8++;
                                  if (var8 <= -3) {
                                    js.field_o = 2;
                                    break L6;
                                  } else {
                                    var9++;
                                    continue L5;
                                  }
                                } else {
                                  var9++;
                                  continue L5;
                                }
                              }
                            }
                            L7: {
                              if (-2 == ((qqb) this).field_a.length) {
                                js.field_o = 0;
                                break L7;
                              } else {
                                break L7;
                              }
                            }
                            return var5;
                          }
                        } else {
                          if (var17[var8] > var6) {
                            var7 = var18[var8];
                            var5 = var8;
                            var6 = var17[var8];
                            var8++;
                            continue L4;
                          } else {
                            L8: {
                              if (var6 != var17[var8]) {
                                break L8;
                              } else {
                                if (var7 <= var18[var8]) {
                                  break L8;
                                } else {
                                  var5 = var8;
                                  var7 = var18[var8];
                                  var6 = var17[var8];
                                  var8++;
                                  continue L4;
                                }
                              }
                            }
                            if (var6 == var17[var8]) {
                              if (var18[var8] == var7) {
                                var5 = -1;
                                var8++;
                                continue L4;
                              } else {
                                var8++;
                                continue L4;
                              }
                            } else {
                              var8++;
                              continue L4;
                            }
                          }
                        }
                      }
                    } else {
                      var6_ref_wna = ((qqb) this).field_a[var5];
                      var7 = var6_ref_wna.field_d;
                      var8 = var6_ref_wna.field_b;
                      if ((var7 ^ -1) <= -1) {
                        if (var7 < var17.length) {
                          var3[var7] = var3[var7] + 1;
                          var11[var7] = var11[var7] + var8;
                          var5++;
                          continue L3;
                        } else {
                          var5++;
                          continue L3;
                        }
                      } else {
                        var5++;
                        continue L3;
                      }
                    }
                  }
                } else {
                  var12 = ((qqb) this).field_a[var3_int];
                  var5 = var12.field_d;
                  if (var5 > var2) {
                    var2 = var5;
                    var3_int++;
                    continue L2;
                  } else {
                    var3_int++;
                    continue L2;
                  }
                }
              }
            }
          }
        }
        return -1;
    }

    public final void a(tv param0, int param1) {
        if (param1 > -19) {
            Object var5 = null;
            ((qqb) this).a(118, (wna) null);
        }
        qqb var3 = (qqb) (Object) param0;
        boolean discarded$0 = tja.a((ntb[]) (Object) var3.field_a, 1, (ntb[]) (Object) var3.field_a, false, 5547);
        int var4 = 0;
        if (dn.a((tv[]) (Object) var3.field_a, false, 1, (tv[]) (Object) var3.field_a, -12)) {
            System.out.println("RoundResult[] results has changed. ");
            var4 = 1;
        }
        if (var4 != 0) {
            System.out.println("This instance of MatchResults has changed");
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = 10;
    }
}
