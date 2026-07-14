/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class dm {
    ed[] field_c;
    static hj[] field_b;
    static int[] field_g;
    static int field_a;
    static int field_e;
    static int field_f;
    static char[] field_d;

    final int a(int param0, byte param1) {
        int var3 = 0;
        ed var4 = null;
        int var5 = OrbDefence.field_D ? 1 : 0;
        if (param1 != 107) {
            dm.a(43, -63, -39);
        }
        for (var3 = 0; ((dm) this).field_c.length > var3; var3++) {
            var4 = ((dm) this).field_c[var3];
            if (!(var4.field_g.length <= param0)) {
                return var3;
            }
            param0 = param0 - (var4.field_g.length + -1);
        }
        return ((dm) this).field_c.length;
    }

    final static void a(int param0, int param1, int param2) {
        if (param0 != 1) {
            dm.a(-96, -106, true, 45, 11, -128, -46);
        }
        lm.field_a = param2;
        kf.field_e = param1;
    }

    final int b(int param0) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0 > 105) {
            break L0;
          } else {
            dm.a(-11, -7, false, 50, 72, -55, -61);
            break L0;
          }
        }
        L1: {
          L2: {
            if (null == ((dm) this).field_c) {
              break L2;
            } else {
              if (0 >= ((dm) this).field_c.length) {
                break L2;
              } else {
                stackOut_4_0 = -((dm) this).field_c[0].field_f + ((dm) this).field_c[-1 + ((dm) this).field_c.length].field_c;
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            }
          }
          stackOut_5_0 = 0;
          stackIn_6_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_6_0;
    }

    final int a(int param0, int param1) {
        ed var5 = null;
        int var6 = OrbDefence.field_D ? 1 : 0;
        ed[] var3 = ((dm) this).field_c;
        int var4 = 0;
        if (param0 > -68) {
            dm.a(-22);
        }
        while (var4 < var3.length) {
            var5 = var3[var4];
            if (var5.field_g.length > param1) {
                return var5.field_g[param1];
            }
            param1 = param1 - (-1 + var5.field_g.length);
            var4++;
        }
        return 0;
    }

    final int a(int param0, int param1, byte param2) {
        int var5 = 0;
        ed var6_ref_ed = null;
        int var7 = 0;
        int var8 = OrbDefence.field_D ? 1 : 0;
        if (((dm) this).field_c != null) {
            // if_icmpeq L39
            // if_icmpgt L39
        } else {
            return -1;
        }
        if (!(((dm) this).field_c[-1 + ((dm) this).field_c.length].field_c >= param0)) {
            return -1;
        }
        if (!(((dm) this).field_c.length != 1)) {
            return ((dm) this).field_c[0].a(param1, -1052047551);
        }
        int var4 = 0;
        for (var5 = 0; var5 < ((dm) this).field_c.length; var5++) {
            var6_ref_ed = ((dm) this).field_c[var5];
            if (param0 >= var6_ref_ed.field_f) {
                if (!(var6_ref_ed.field_c < param0)) {
                    var7 = var6_ref_ed.a(param1, -1052047551);
                    if (0 == (var7 ^ -1)) {
                        return -1;
                    }
                    return var7 + var4;
                }
            }
            var4 = var4 + (var6_ref_ed.field_g.length - 1);
        }
        int var6 = -37 % ((73 - param2) / 44);
        return -1;
    }

    final int a(boolean param0) {
        int var2 = 0;
        ed[] var3 = null;
        int var4 = 0;
        ed var5 = null;
        int var6 = 0;
        int var7 = 0;
        L0: {
          var7 = OrbDefence.field_D ? 1 : 0;
          if (!param0) {
            break L0;
          } else {
            field_a = 108;
            break L0;
          }
        }
        L1: {
          var2 = -1;
          if (null != ((dm) this).field_c) {
            var3 = ((dm) this).field_c;
            var4 = 0;
            L2: while (true) {
              if (var4 >= var3.length) {
                break L1;
              } else {
                var5 = var3[var4];
                if (var5 != null) {
                  var6 = var5.a(param0);
                  if (var6 > var2) {
                    var2 = var6;
                    var4++;
                    continue L2;
                  } else {
                    var4++;
                    continue L2;
                  }
                } else {
                  var4++;
                  continue L2;
                }
              }
            }
          } else {
            break L1;
          }
        }
        return var2;
    }

    final int a(String param0, int param1, int param2, byte param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        L0: {
          var10 = OrbDefence.field_D ? 1 : 0;
          var5 = 0;
          var6 = 0;
          var7 = param0.length();
          if (param3 == 74) {
            break L0;
          } else {
            field_b = null;
            break L0;
          }
        }
        var8 = 0;
        L1: while (true) {
          if (var8 >= var7) {
            if (0 >= var5) {
              return 0;
            } else {
              return (param1 - param2 << 403695336) / var5;
            }
          } else {
            var9 = param0.charAt(var8);
            if (60 != var9) {
              if (var9 != 62) {
                if (var6 == 0) {
                  if (var9 == 32) {
                    var5++;
                    var8++;
                    continue L1;
                  } else {
                    var8++;
                    continue L1;
                  }
                } else {
                  var8++;
                  continue L1;
                }
              } else {
                var6 = 0;
                var8++;
                continue L1;
              }
            } else {
              var6 = 1;
              var8++;
              continue L1;
            }
          }
        }
    }

    final static void a(int param0, int param1, boolean param2, int param3, int param4, int param5, int param6) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int stackIn_20_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_18_0 = 0;
        var15 = OrbDefence.field_D ? 1 : 0;
        if (param0 > param5) {
          if (param5 + 1 < param4) {
            L0: {
              if (5 + param5 >= param4) {
                break L0;
              } else {
                if (param1 == param3) {
                  break L0;
                } else {
                  var7 = (param1 >> -1303985887) - (-(param3 >> 273542273) + -(1 & (param1 & param3)));
                  var8 = param5;
                  var9 = param3;
                  var10 = param1;
                  var11 = -75 % ((-46 - param6) / 49);
                  var12 = param5;
                  L1: while (true) {
                    if (param4 <= var12) {
                      dm.a(param0, var9, param2, param3, var8, param5, 28);
                      dm.a(param0, param1, param2, var10, param4, var8, 126);
                      return;
                    } else {
                      L2: {
                        var13 = bc.field_o[var12];
                        if (!param2) {
                          stackOut_19_0 = rh.field_c[var13];
                          stackIn_20_0 = stackOut_19_0;
                          break L2;
                        } else {
                          stackOut_18_0 = tl.field_d[var13];
                          stackIn_20_0 = stackOut_18_0;
                          break L2;
                        }
                      }
                      var14 = stackIn_20_0;
                      if (var14 > var7) {
                        L3: {
                          bc.field_o[var12] = bc.field_o[var8];
                          if (var14 < var9) {
                            var9 = var14;
                            break L3;
                          } else {
                            break L3;
                          }
                        }
                        var8++;
                        bc.field_o[var8] = var13;
                        var12++;
                        continue L1;
                      } else {
                        if (var10 < var14) {
                          var10 = var14;
                          var12++;
                          continue L1;
                        } else {
                          var12++;
                          continue L1;
                        }
                      }
                    }
                  }
                }
              }
            }
            var7 = -1 + param4;
            L4: while (true) {
              if (param5 >= var7) {
                return;
              } else {
                var8 = param5;
                L5: while (true) {
                  if (var8 >= var7) {
                    var7--;
                    continue L4;
                  } else {
                    var9 = bc.field_o[var8];
                    var10 = bc.field_o[1 + var8];
                    if (hl.a(param2, -122, var10, var9)) {
                      bc.field_o[var8] = var10;
                      bc.field_o[1 + var8] = var9;
                      var8++;
                      continue L5;
                    } else {
                      var8++;
                      continue L5;
                    }
                  }
                }
              }
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    public static void a(int param0) {
        if (param0 != 0) {
            field_g = null;
        }
        field_b = null;
        field_d = null;
        field_g = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new char[]{(char)91, (char)93, (char)35};
        field_g = new int[16384];
    }
}
