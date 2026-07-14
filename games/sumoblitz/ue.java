/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ue extends gm {
    private int field_n;
    private int field_s;
    private int field_q;
    static ri field_p;
    static volatile boolean field_o;
    private wb[] field_r;

    public ue() {
        this(2188450, 2591221, 9543);
    }

    public static void b(int param0) {
        if (param0 < 100) {
            field_o = true;
        }
        field_p = null;
    }

    public final void a(pk param0, int param1, int param2, boolean param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_5_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_18_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_16_0 = 0;
        L0: {
          L1: {
            if (param0.field_k) {
              break L1;
            } else {
              if (!param0.d(-1)) {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                break L0;
              } else {
                break L1;
              }
            }
          }
          stackOut_3_0 = 1;
          stackIn_5_0 = stackOut_3_0;
          break L0;
        }
        L2: {
          var6 = stackIn_5_0;
          if (param2 == 5592405) {
            break L2;
          } else {
            ((ue) this).field_s = 88;
            break L2;
          }
        }
        L3: {
          if (param0 instanceof wp) {
            param3 = param3 & ((wp) (Object) param0).field_x;
            break L3;
          } else {
            break L3;
          }
        }
        L4: {
          if (!param3) {
            stackOut_14_0 = ((ue) this).field_q;
            stackIn_15_0 = stackOut_14_0;
            break L4;
          } else {
            if (var6 != 0) {
              stackOut_13_0 = ((ue) this).field_s;
              stackIn_15_0 = stackOut_13_0;
              break L4;
            } else {
              stackOut_12_0 = ((ue) this).field_n;
              stackIn_15_0 = stackOut_12_0;
              break L4;
            }
          }
        }
        L5: {
          var7 = stackIn_15_0;
          if (!param3) {
            stackOut_17_0 = 7105644;
            stackIn_18_0 = stackOut_17_0;
            break L5;
          } else {
            stackOut_16_0 = 16777215;
            stackIn_18_0 = stackOut_16_0;
            break L5;
          }
        }
        var8 = stackIn_18_0;
        nn.a(var7, param0.field_q, param0.field_v + (param1 - -(-((ue) this).field_r[0].field_w + param0.field_p >> -1940644703)), 67, ((ue) this).field_r, param0.field_r + param4);
        int discarded$1 = ((ue) this).field_e.a(param0.field_m, param4 - -param0.field_r, param0.field_v + (param1 + -2), param0.field_q, param0.field_p, var8, -1, 1, 1, ((ue) this).field_e.field_s);
    }

    final static void a(byte param0) {
        int var2 = 0;
        int var3 = 0;
        of var4_ref_of = null;
        long var4 = 0L;
        int var5 = 0;
        id var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8_int = 0;
        String[][] var8 = null;
        String[][] var9 = null;
        long[][] var10 = null;
        int[][] var11 = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        String var21 = null;
        long var22 = 0L;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        pl var28 = null;
        L0: {
          var26 = Sumoblitz.field_L ? 1 : 0;
          if (param0 == -70) {
            break L0;
          } else {
            ue.b(-111);
            break L0;
          }
        }
        L1: {
          var28 = ig.field_a;
          var2 = var28.e(-31302);
          if (0 != var2) {
            if (-2 != (var2 ^ -1)) {
              ms.a("HS1: " + di.b((byte) -124), (Throwable) null, 0);
              kk.a((byte) -121);
              break L1;
            } else {
              var3 = var28.a(255);
              var4 = var28.a((byte) 111);
              var6 = (id) (Object) ow.field_f.b(127);
              L2: while (true) {
                L3: {
                  if (var6 == null) {
                    break L3;
                  } else {
                    if ((var6.field_r ^ -1) == (var3 ^ -1)) {
                      break L3;
                    } else {
                      var6 = (id) (Object) ow.field_f.d((byte) 18);
                      continue L2;
                    }
                  }
                }
                if (var6 == null) {
                  kk.a((byte) -121);
                  return;
                } else {
                  var6.field_s = var4;
                  var6.b(false);
                  break L1;
                }
              }
            }
          } else {
            var3 = var28.a(255);
            var4_ref_of = (of) (Object) oi.field_b.b(74);
            L4: while (true) {
              L5: {
                if (var4_ref_of == null) {
                  break L5;
                } else {
                  if (var3 == var4_ref_of.field_p) {
                    break L5;
                  } else {
                    var4_ref_of = (of) (Object) oi.field_b.d((byte) 18);
                    continue L4;
                  }
                }
              }
              if (var4_ref_of == null) {
                kk.a((byte) -124);
                return;
              } else {
                L6: {
                  var5 = var28.e(-31302);
                  if (0 != var5) {
                    var6_int = var4_ref_of.field_l;
                    var7 = var4_ref_of.field_s;
                    jh.field_B[0].field_a = null;
                    jh.field_B[0].field_c = qv.field_o;
                    jh.field_B[0].field_b = false;
                    var8_int = 1;
                    L7: while (true) {
                      if ((var8_int ^ -1) <= (var5 ^ -1)) {
                        var4_ref_of.field_o = new String[3][var6_int];
                        var8 = new String[3][var6_int];
                        var9 = new String[3][var6_int];
                        var4_ref_of.field_r = new long[3][var6_int];
                        var10 = new long[3][var6_int];
                        var4_ref_of.field_m = new int[3][var6_int * var7];
                        var11 = new int[3][var6_int * var7];
                        var12 = 0;
                        var13 = 0;
                        var14 = 0;
                        var15 = 0;
                        var16 = 0;
                        var17 = 0;
                        var18 = var28.e(-31302);
                        if ((var18 ^ -1) < -1) {
                          var19 = 0;
                          L8: while (true) {
                            if ((var19 ^ -1) <= (var18 ^ -1)) {
                              break L6;
                            } else {
                              L9: {
                                var20 = var28.e(-31302);
                                var21 = jh.field_B[var20].field_c;
                                var22 = var28.a((byte) 113);
                                var24 = var28.field_p;
                                if (var6_int > var19) {
                                  var8[0][var12] = var21;
                                  var9[0][var12] = jh.field_B[var20].field_a;
                                  var10[0][var12] = var22;
                                  var25 = 0;
                                  L10: while (true) {
                                    if ((var25 ^ -1) <= (var7 ^ -1)) {
                                      var12++;
                                      break L9;
                                    } else {
                                      var15++;
                                      var11[0][var15] = var28.c(true);
                                      var25++;
                                      continue L10;
                                    }
                                  }
                                } else {
                                  break L9;
                                }
                              }
                              L11: {
                                if (var21 == null) {
                                  break L11;
                                } else {
                                  if (!ea.a(var21, (byte) -25)) {
                                    break L11;
                                  } else {
                                    var8[1][var13] = qv.field_o;
                                    var9[1][var13] = null;
                                    var10[1][var13] = var22;
                                    var28.field_p = var24;
                                    var13++;
                                    var25 = 0;
                                    L12: while (true) {
                                      if ((var25 ^ -1) <= (var7 ^ -1)) {
                                        break L11;
                                      } else {
                                        var16++;
                                        var11[1][var16] = var28.c(true);
                                        var25++;
                                        continue L12;
                                      }
                                    }
                                  }
                                }
                              }
                              L13: {
                                if (var6_int <= var14) {
                                  break L13;
                                } else {
                                  if (!jh.field_B[var20].field_b) {
                                    jh.field_B[var20].field_b = true;
                                    var8[2][var14] = var21;
                                    var9[2][var14] = jh.field_B[var20].field_a;
                                    var10[2][var14] = var22;
                                    var28.field_p = var24;
                                    var14++;
                                    var25 = 0;
                                    L14: while (true) {
                                      if (var7 <= var25) {
                                        break L13;
                                      } else {
                                        var17++;
                                        var11[2][var17] = var28.c(true);
                                        var25++;
                                        continue L14;
                                      }
                                    }
                                  } else {
                                    break L13;
                                  }
                                }
                              }
                              var19++;
                              continue L8;
                            }
                          }
                        } else {
                          break L6;
                        }
                      } else {
                        L15: {
                          jh.field_B[var8_int].field_c = var28.d(-1);
                          jh.field_B[var8_int].field_b = false;
                          if (var28.e(-31302) == 1) {
                            jh.field_B[var8_int].field_a = var28.d(param0 + 69);
                            break L15;
                          } else {
                            jh.field_B[var8_int].field_a = null;
                            break L15;
                          }
                        }
                        var8_int++;
                        continue L7;
                      }
                    }
                  } else {
                    break L6;
                  }
                }
                var4_ref_of.field_q = true;
                var4_ref_of.b(false);
                break L1;
              }
            }
          }
        }
    }

    private ue(int param0, int param1, int param2) {
        ((ue) this).field_q = param2;
        ((ue) this).field_r = jp.field_j;
        ((ue) this).field_e = tq.field_a;
        ((ue) this).field_s = param1;
        ((ue) this).field_n = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = true;
    }
}
