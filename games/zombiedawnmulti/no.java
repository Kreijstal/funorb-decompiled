/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class no extends cj {
    static String field_Fb;
    static int field_Gb;
    static ja[][] field_Hb;
    private cj field_Ib;
    static String field_Kb;
    static ri field_Jb;

    final static void c(byte param0) {
        int var1 = -7 % ((-1 - param0) / 63);
        if (null != sb.field_k) {
            String var2 = sb.field_k;
            cf.a((byte) -61, vl.a(lp.field_h, new String[1], 2));
            sb.field_k = null;
        }
    }

    final static String a(boolean param0, int param1, CharSequence param2) {
        int var3 = 0;
        String var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = ZombieDawnMulti.field_E ? 1 : 0;
        if (param2 == null) {
          return bg.field_q;
        } else {
          L0: {
            var3 = param2.length();
            if (-2 < var3) {
              break L0;
            } else {
              if (-13 >= var3) {
                L1: {
                  var4 = tg.a(param2, false);
                  if (var4 == null) {
                    break L1;
                  } else {
                    if (var4.length() < 1) {
                      break L1;
                    } else {
                      L2: {
                        if (eb.a((byte) -104, var4.charAt(0))) {
                          break L2;
                        } else {
                          if (eb.a((byte) -119, var4.charAt(-1 + var4.length()))) {
                            break L2;
                          } else {
                            var5 = 0;
                            if (param1 < -11) {
                              var6 = 0;
                              L3: while (true) {
                                if (var6 >= param2.length()) {
                                  if (0 < var5) {
                                    return th.field_a;
                                  } else {
                                    return null;
                                  }
                                } else {
                                  L4: {
                                    var7 = param2.charAt(var6);
                                    if (eb.a((byte) 94, (char) var7)) {
                                      var5++;
                                      break L4;
                                    } else {
                                      var5 = 0;
                                      break L4;
                                    }
                                  }
                                  if (2 <= var5) {
                                    if (!param0) {
                                      return hn.field_a;
                                    } else {
                                      var6++;
                                      continue L3;
                                    }
                                  } else {
                                    var6++;
                                    continue L3;
                                  }
                                }
                              }
                            } else {
                              return null;
                            }
                          }
                        }
                      }
                      return th.field_a;
                    }
                  }
                }
                return bg.field_q;
              } else {
                break L0;
              }
            }
          }
          return bg.field_q;
        }
    }

    final static bm a(byte param0, byte[] param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int[] var6 = null;
        int[] var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var13 = 0;
        int[] var14 = null;
        int var14_int = 0;
        int var15 = 0;
        int var16 = 0;
        int[] var18 = null;
        int[] var19 = null;
        int[] var20 = null;
        int[] var22 = null;
        int[] var23 = null;
        int[] var24 = null;
        int[] var26 = null;
        int[] var27 = null;
        int[] var28 = null;
        int[][] var29 = null;
        int[] var30 = null;
        int[] var31 = null;
        int[] var32 = null;
        var16 = ZombieDawnMulti.field_E ? 1 : 0;
        var2 = 1;
        var2++;
        var3 = re.a(param1, var2, (byte) 86);
        var2++;
        var4 = re.a(param1, var2, (byte) 99);
        var2++;
        var5 = re.a(param1, var2, (byte) 113);
        var31 = new int[4];
        var27 = var31;
        var23 = var27;
        var19 = var23;
        var6 = var19;
        var32 = new int[4];
        var28 = var32;
        var24 = var28;
        var20 = var24;
        var7 = var20;
        var8 = 0;
        L0: while (true) {
          if (-5 >= (var8 ^ -1)) {
            var2++;
            var8 = re.a(param1, var2, (byte) 75);
            var2++;
            var9 = re.a(param1, var2, (byte) 112);
            var2++;
            var10 = re.a(param1, var2, (byte) 113);
            var2++;
            var11 = re.a(param1, var2, (byte) 67);
            var29 = new int[var11][var10];
            var13 = 0;
            L1: while (true) {
              if (var13 >= var11) {
                var2++;
                var13 = re.a(param1, var2, (byte) 59);
                var30 = new int[var13 * 4];
                var26 = var30;
                var22 = var26;
                var18 = var22;
                var14 = var18;
                var15 = 0;
                L2: while (true) {
                  if (var15 >= 4 * var13) {
                    L3: {
                      if (param0 == 104) {
                        break L3;
                      } else {
                        field_Hb = null;
                        break L3;
                      }
                    }
                    return new bm(var29, var30, var3, var4, var5, var31, var32, var8, var9);
                  } else {
                    var2++;
                    var14[var15] = re.a(param1, var2, (byte) 62);
                    var15++;
                    continue L2;
                  }
                }
              } else {
                var14_int = 0;
                L4: while (true) {
                  if (var14_int >= var10) {
                    var13++;
                    continue L1;
                  } else {
                    var2++;
                    var29[var13][var14_int] = re.a(param1, var2, (byte) 71);
                    var14_int++;
                    continue L4;
                  }
                }
              }
            }
          } else {
            var2++;
            var6[var8] = re.a(param1, var2, (byte) 56);
            var2++;
            var7[var8] = re.a(param1, var2, (byte) 88);
            var8++;
            continue L0;
          }
        }
    }

    public static void h(int param0) {
        field_Fb = null;
        field_Jb = null;
        if (param0 != 15) {
            Object var2 = null;
            String discarded$0 = no.a(false, -117, (CharSequence) null);
        }
        field_Hb = null;
        field_Kb = null;
    }

    final boolean b(int param0, boolean param1) {
        int stackIn_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        if (param0 == 0) {
          L0: {
            L1: {
              L2: {
                ((no) this).a(param0 ^ -11838, true);
                if (kd.field_b == 0) {
                  break L2;
                } else {
                  if (((no) this).field_T == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              if (-1 == (((no) this).field_Ib.field_T ^ -1)) {
                stackOut_8_0 = 0;
                stackIn_9_0 = stackOut_8_0;
                break L0;
              } else {
                break L1;
              }
            }
            stackOut_7_0 = 1;
            stackIn_9_0 = stackOut_7_0;
            break L0;
          }
          return stackIn_9_0 != 0;
        } else {
          return true;
        }
    }

    no(cj param0, cj param1, cj param2, cj param3, cj param4, cj param5) {
        int var12 = 0;
        cj var13 = null;
        cj var14 = null;
        int var15 = 0;
        cj var17 = new cj(0L, param1, le.field_I.toUpperCase());
        var17.field_R = 1;
        ((no) this).field_Ib = new cj(0L, param2);
        cj var8 = new cj(0L, param3);
        cj var9 = new cj(0L, param3, qa.field_j);
        var9.field_R = 1;
        int var10 = 50;
        int var11 = 0;
        for (var12 = 0; lj.field_h.length > var12; var12++) {
            var13 = new cj(0L, param3, cm.field_c[var12]);
            var14 = new cj(0L, param3, lj.field_h[var12]);
            var15 = param3.field_yb.a(lj.field_h[var12]);
            var13.a(15, var10, 65, 20, -3344);
            if (var11 < var15) {
                var11 = var15;
            }
            var14.a(15, var10, 640, 90, -3344);
            var8.a((byte) 50, var13);
            var8.a((byte) 50, var14);
            var10 += 30;
        }
        var10 += 15;
        var17.a(24, 0, 20 + var11 - -90, 0, -3344);
        ((no) this).a(var10 + var17.field_z, 100, var17.field_zb, 100, -3344);
        ((no) this).field_Ib.a(15, 5, 15, -20 + var17.field_zb, -3344);
        var8.a(((no) this).field_z - var17.field_z, var17.field_z, ((no) this).field_zb, 0, -3344);
        var9.a(15, 20, ((no) this).field_zb, 0, -3344);
        var8.field_ab = tg.a(2105376, var8.field_z, 8421504, 3, 11579568, 102);
        var17.a((byte) 50, ((no) this).field_Ib);
        var8.a((byte) 50, var9);
        ((no) this).a((byte) 50, var17);
        ((no) this).a((byte) 50, var8);
        var10 = -(((no) this).field_z >> -617126399) + 240;
        ((no) this).field_x = 320 + -(((no) this).field_zb >> -1388909887);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Fb = "Left-click or press 'ESC' to skip cutscene";
        field_Hb = new ja[2][];
        field_Kb = "Make them tremble and shake.";
    }
}
