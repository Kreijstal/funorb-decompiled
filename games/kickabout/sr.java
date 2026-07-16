/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class sr {
    static sr field_k;
    static int[] field_j;
    static String field_b;
    int field_i;
    static String field_c;
    static lm field_l;
    static lk[] field_a;
    static em field_f;
    static String field_d;
    static sj field_h;
    static String field_m;
    static String[] field_g;
    static String field_e;

    final static void a(boolean param0, byte param1) {
        cq.a(param0, 0);
        if (param1 >= -20) {
            field_a = null;
        }
        vu.a(true, param0);
    }

    abstract int a(int param0);

    final static kg[] a(int param0, int param1, boolean param2, byte param3, int param4, int param5) {
        kg[] var6 = null;
        kg[][] var7 = null;
        ut[][] var8 = null;
        int var9 = 0;
        int var10 = 0;
        kg var11_ref_kg = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var15 = 0;
        kg var15_ref_kg = null;
        int var16_int = 0;
        ut var16 = null;
        int var17 = 0;
        int var18 = 0;
        nr[] var18_ref_nr__ = null;
        int var19 = 0;
        nr var20 = null;
        int var21 = 0;
        nr[][] var22 = null;
        ut var23 = null;
        nr[][] var24 = null;
        kg[][] stackIn_3_0 = null;
        int stackIn_12_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_26_0 = 0;
        kg[][] stackOut_2_0 = null;
        kg[][] stackOut_1_0 = null;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_24_0 = 0;
        L0: {
          var21 = Kickabout.field_G;
          var6 = new kg[6];
          if (!param2) {
            stackOut_2_0 = ps.field_c;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = bf.field_s;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        var7 = stackIn_3_0;
        var8 = new ut[var7.length][];
        var9 = 0;
        L1: while (true) {
          if (var9 >= var8.length) {
            L2: {
              if (!param2) {
                stackOut_11_0 = 59;
                stackIn_12_0 = stackOut_11_0;
                break L2;
              } else {
                stackOut_10_0 = 50;
                stackIn_12_0 = stackOut_10_0;
                break L2;
              }
            }
            var9 = stackIn_12_0;
            if (param3 <= -65) {
              L3: {
                if (param2) {
                  stackOut_16_0 = 34;
                  stackIn_17_0 = stackOut_16_0;
                  break L3;
                } else {
                  stackOut_15_0 = 33;
                  stackIn_17_0 = stackOut_15_0;
                  break L3;
                }
              }
              L4: {
                var10 = stackIn_17_0;
                if (param2) {
                  stackOut_19_0 = 40;
                  stackIn_20_0 = stackOut_19_0;
                  break L4;
                } else {
                  stackOut_18_0 = 20;
                  stackIn_20_0 = stackOut_18_0;
                  break L4;
                }
              }
              L5: {
                var11 = stackIn_20_0;
                if (!param2) {
                  stackOut_22_0 = 4;
                  stackIn_23_0 = stackOut_22_0;
                  break L5;
                } else {
                  stackOut_21_0 = 0;
                  stackIn_23_0 = stackOut_21_0;
                  break L5;
                }
              }
              L6: {
                var12 = stackIn_23_0;
                if (!param2) {
                  stackOut_25_0 = 5;
                  stackIn_26_0 = stackOut_25_0;
                  break L6;
                } else {
                  stackOut_24_0 = 3;
                  stackIn_26_0 = stackOut_24_0;
                  break L6;
                }
              }
              var13 = stackIn_26_0;
              if (vi.field_n) {
                var22 = new nr[var13][param5 + 2];
                var24 = var22;
                var15 = 0;
                L7: while (true) {
                  if (var22.length <= var15) {
                    var15 = 0;
                    L8: while (true) {
                      if (6 <= var15) {
                        return var6;
                      } else {
                        jm.a(100, 9863, (-param0 + param4) * var15 / 6 + param0);
                        var16 = oa.a(param2, param5, (byte) 95);
                        iw.a(-101, var16);
                        var17 = 0;
                        L9: while (true) {
                          if (var13 <= var17) {
                            ta.e(119);
                            var6[var15] = eo.a(var16);
                            var15++;
                            continue L8;
                          } else {
                            var18_ref_nr__ = var24[var17];
                            var19 = 0;
                            L10: while (true) {
                              if (var19 >= var18_ref_nr__.length) {
                                L11: {
                                  if (!param2) {
                                    break L11;
                                  } else {
                                    if (2 > var17) {
                                      break L11;
                                    } else {
                                      var17++;
                                      continue L9;
                                    }
                                  }
                                }
                                var18 = 0;
                                var8[0][var17].c(var18, 0);
                                var18 = var18 + var8[0][var17].field_o;
                                var19 = 0;
                                L12: while (true) {
                                  if (param5 <= var19) {
                                    var8[2][var17].c(var18, 0);
                                    var17++;
                                    continue L9;
                                  } else {
                                    var8[1][var17].c(var18, 0);
                                    var18 = var18 + var8[1][var17].field_o;
                                    var19++;
                                    continue L12;
                                  }
                                }
                              } else {
                                var20 = var18_ref_nr__[var19];
                                if (var20 != null) {
                                  var20.a(var15, -2);
                                  var19++;
                                  continue L10;
                                } else {
                                  var19++;
                                  continue L10;
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  } else {
                    var16_int = 0;
                    L13: while (true) {
                      if (var16_int >= var22[0].length) {
                        var15++;
                        continue L7;
                      } else {
                        if (p.a((byte) -24, 256) <= param1) {
                          L14: {
                            var17 = 39 - -(var16_int * var10) + var15;
                            var18 = var9 + var15 * var11;
                            var19 = p.a((byte) -24, 5);
                            if (param2) {
                              var18 = var18 + p.a((byte) -24, 5);
                              break L14;
                            } else {
                              if (-1 != (var15 ^ -1)) {
                                break L14;
                              } else {
                                L15: {
                                  if (0 == var19) {
                                    break L15;
                                  } else {
                                    if ((var19 ^ -1) == -3) {
                                      break L15;
                                    } else {
                                      var22[var15][var16_int] = new nr(var17, var18, var12, var19);
                                      var16_int++;
                                      continue L13;
                                    }
                                  }
                                }
                                var19++;
                                break L14;
                              }
                            }
                          }
                          var22[var15][var16_int] = new nr(var17, var18, var12, var19);
                          var16_int++;
                          continue L13;
                        } else {
                          var16_int++;
                          continue L13;
                        }
                      }
                    }
                  }
                }
              } else {
                var23 = oa.a(param2, param5, (byte) 95);
                iw.a(121, var23);
                var15 = 0;
                L16: while (true) {
                  if (var13 <= var15) {
                    ta.e(123);
                    var15_ref_kg = eo.a(var23);
                    var16_int = 0;
                    L17: while (true) {
                      if ((var16_int ^ -1) <= -7) {
                        return var6;
                      } else {
                        var6[var16_int] = var15_ref_kg;
                        var16_int++;
                        continue L17;
                      }
                    }
                  } else {
                    L18: {
                      if (!param2) {
                        break L18;
                      } else {
                        if (-3 < (var15 ^ -1)) {
                          break L18;
                        } else {
                          var15++;
                          continue L16;
                        }
                      }
                    }
                    var16_int = 0;
                    var8[0][var15].c(var16_int, 0);
                    var16_int = var16_int + var8[0][var15].field_o;
                    var17 = 0;
                    L19: while (true) {
                      if (var17 >= param5) {
                        var8[2][var15].c(var16_int, 0);
                        var15++;
                        continue L16;
                      } else {
                        var8[1][var15].c(var16_int, 0);
                        var16_int = var16_int + var8[1][var15].field_o;
                        var17++;
                        continue L19;
                      }
                    }
                  }
                }
              }
            } else {
              return null;
            }
          } else {
            var8[var9] = new ut[var7[var9].length];
            var10 = 0;
            L20: while (true) {
              if (var10 >= var8[var9].length) {
                var9++;
                continue L1;
              } else {
                var11_ref_kg = var7[var9][var10];
                var8[var9][var10] = var11_ref_kg.a();
                pd.a(var8[var9][var10], 20684);
                var10++;
                continue L20;
              }
            }
          }
        }
    }

    public static void a(byte param0) {
        field_l = null;
        field_g = null;
        field_e = null;
        field_a = null;
        field_j = null;
        field_c = null;
        field_b = null;
        if (param0 <= 86) {
            sr.a((byte) -80);
        }
        field_m = null;
        field_f = null;
        field_k = null;
        field_h = null;
        field_d = null;
    }

    abstract int a(int param0, Object param1, Object param2);

    final void a(boolean param0, int param1) {
        if (param1 <= 62) {
            field_c = null;
        }
        if (param0) {
            ((sr) this).field_i = (((sr) this).field_i + 1) % ((sr) this).a(-125);
        } else {
            ((sr) this).field_i = 0;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Enter the name you'd prefer. This is the name displayed to other players.";
        field_j = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        field_m = "This game has been updated! Please reload this page.";
        field_k = (sr) (Object) new od();
        field_e = "<%0> has been removed.";
        field_g = new String[]{"total goals", "posession"};
    }
}
