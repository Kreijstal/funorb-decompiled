/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fq extends td {
    static wma field_s;
    static String field_r;
    static String field_q;
    static String field_p;

    fq(int param0, aga param1, int param2, int param3) {
        super(param0, param1);
        ((fq) this).field_n = param3;
        ((fq) this).field_k = param2;
    }

    public static void c(byte param0) {
        field_r = null;
        field_q = null;
        field_s = null;
        if (param0 <= 120) {
            field_s = null;
            field_p = null;
            return;
        }
        field_p = null;
    }

    final static void a(int param0, byte param1) {
        pf var2 = null;
        int var3 = 0;
        var2 = sja.field_fb;
        var2.c(param0, (byte) 127);
        var2.field_g = var2.field_g + 1;
        if (param1 > -112) {
          field_r = null;
          var3 = var2.field_g;
          var2.d(2, 0);
          var2.a(0, -125, fia.field_r.length, fia.field_r);
          var2.d(tq.field_h, 0);
          var2.d(ena.field_n, 0);
          var2.a(0, -128, sca.field_c.length, sca.field_c);
          var2.b((byte) 81, var2.field_g - var3);
          return;
        } else {
          var3 = var2.field_g;
          var2.d(2, 0);
          var2.a(0, -125, fia.field_r.length, fia.field_r);
          var2.d(tq.field_h, 0);
          var2.d(ena.field_n, 0);
          var2.a(0, -128, sca.field_c.length, sca.field_c);
          var2.b((byte) 81, var2.field_g - var3);
          return;
        }
    }

    final static String a(int param0, CharSequence param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        StringBuilder var10 = null;
        StringBuilder var11 = null;
        var9 = BachelorFridge.field_y;
        if (param1 != null) {
          var2 = param0;
          var3 = param1.length();
          L0: while (true) {
            if (var3 > var2) {
              if (mp.a(true, param1.charAt(var2))) {
                var2++;
                continue L0;
              } else {
                L1: while (true) {
                  L2: {
                    if (var2 >= var3) {
                      break L2;
                    } else {
                      if (!mp.a(true, param1.charAt(-1 + var3))) {
                        break L2;
                      } else {
                        var3--;
                        continue L1;
                      }
                    }
                  }
                  var4 = var3 - var2;
                  if (-2 >= (var4 ^ -1)) {
                    if ((var4 ^ -1) >= -13) {
                      L3: {
                        var11 = new StringBuilder(var4);
                        var6 = var2;
                        if (var3 <= var6) {
                          break L3;
                        } else {
                          L4: {
                            var7 = param1.charAt(var6);
                            if (io.a(true, (char) var7)) {
                              L5: {
                                var8 = mq.a(4558, (char) var7);
                                if (var8 == 0) {
                                  var6++;
                                  break L5;
                                } else {
                                  StringBuilder discarded$2 = var11.append(var8);
                                  break L5;
                                }
                              }
                              var6++;
                              break L4;
                            } else {
                              var6++;
                              break L4;
                            }
                          }
                          var6++;
                          var6++;
                          var6++;
                          var6++;
                          break L3;
                        }
                      }
                      if (-1 == var11.length()) {
                        return null;
                      } else {
                        return var11.toString();
                      }
                    } else {
                      return null;
                    }
                  } else {
                    return null;
                  }
                }
              }
            } else {
              L6: while (true) {
                L7: {
                  if (var2 >= var3) {
                    break L7;
                  } else {
                    if (!mp.a(true, param1.charAt(-1 + var3))) {
                      break L7;
                    } else {
                      var3--;
                      continue L6;
                    }
                  }
                }
                var4 = var3 - var2;
                if (-2 >= (var4 ^ -1)) {
                  if ((var4 ^ -1) >= -13) {
                    L8: {
                      var10 = new StringBuilder(var4);
                      var6 = var2;
                      if (var3 <= var6) {
                        break L8;
                      } else {
                        L9: {
                          var7 = param1.charAt(var6);
                          if (io.a(true, (char) var7)) {
                            L10: {
                              var8 = mq.a(4558, (char) var7);
                              if (var8 == 0) {
                                var6++;
                                break L10;
                              } else {
                                StringBuilder discarded$3 = var10.append(var8);
                                break L10;
                              }
                            }
                            var6++;
                            break L9;
                          } else {
                            var6++;
                            break L9;
                          }
                        }
                        var6++;
                        var6++;
                        var6++;
                        var6++;
                        break L8;
                      }
                    }
                    if (-1 == (var10.length() ^ -1)) {
                      return null;
                    } else {
                      return var10.toString();
                    }
                  } else {
                    return null;
                  }
                } else {
                  return null;
                }
              }
            }
          }
        } else {
          return null;
        }
    }

    final ii a(op param0, int param1) {
        fk var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        wia var10 = null;
        aga var11 = null;
        int var12 = 0;
        int var13 = 0;
        iv var14 = null;
        int var15 = 0;
        aga var16 = null;
        int stackIn_18_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_21_1 = 0;
        int stackOut_17_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_20_1 = 0;
        int stackOut_19_0 = 0;
        int stackOut_19_1 = 0;
        var15 = BachelorFridge.field_y;
        if (param1 != 3) {
          return null;
        } else {
          var16 = ((fq) this).field_h.a(107, param0);
          var4 = new fk(((fq) this).field_g, new nq(var16), ((fq) this).field_k, ((fq) this).field_n);
          var5 = mp.field_q.length - 1;
          var6 = -var5;
          L0: while (true) {
            if (var5 < var6) {
              return (ii) (Object) var4;
            } else {
              var7 = -var5;
              L1: while (true) {
                if (var5 < var7) {
                  var6++;
                  continue L0;
                } else {
                  var8 = ((fq) this).field_k - -var6;
                  var9 = var7 + ((fq) this).field_n;
                  if (var8 >= 0) {
                    if (var8 < param0.field_z) {
                      if (-1 >= (var9 ^ -1)) {
                        if (param0.field_B > var9) {
                          var10 = param0.field_a[var8][var9];
                          var11 = var10.field_l;
                          if (var11 != null) {
                            L2: {
                              if ((var7 ^ -1) > -1) {
                                stackOut_17_0 = -var7;
                                stackIn_18_0 = stackOut_17_0;
                                break L2;
                              } else {
                                stackOut_16_0 = var7;
                                stackIn_18_0 = stackOut_16_0;
                                break L2;
                              }
                            }
                            L3: {
                              stackOut_18_0 = stackIn_18_0;
                              stackIn_20_0 = stackOut_18_0;
                              stackIn_19_0 = stackOut_18_0;
                              if (var6 < 0) {
                                stackOut_20_0 = stackIn_20_0;
                                stackOut_20_1 = -var6;
                                stackIn_21_0 = stackOut_20_0;
                                stackIn_21_1 = stackOut_20_1;
                                break L3;
                              } else {
                                stackOut_19_0 = stackIn_19_0;
                                stackOut_19_1 = var6;
                                stackIn_21_0 = stackOut_19_0;
                                stackIn_21_1 = stackOut_19_1;
                                break L3;
                              }
                            }
                            var12 = stackIn_21_0 + stackIn_21_1;
                            if (var5 >= var12) {
                              var13 = mp.field_q[var12];
                              var14 = new iv(new nq(var11), false, 1, var13, 0);
                              var4.field_o.a((bw) (Object) var14, true);
                              var7++;
                              continue L1;
                            } else {
                              var7++;
                              continue L1;
                            }
                          } else {
                            var7++;
                            continue L1;
                          }
                        } else {
                          var7++;
                          continue L1;
                        }
                      } else {
                        var7++;
                        continue L1;
                      }
                    } else {
                      var7++;
                      continue L1;
                    }
                  } else {
                    var7++;
                    continue L1;
                  }
                }
              }
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_r = "<%0>'s game";
        field_q = "Sound: ";
        field_p = "Eating a food will always unlock a new ability. Close the shopping bag by clicking the 'X' in the corner of it to continue.";
    }
}
