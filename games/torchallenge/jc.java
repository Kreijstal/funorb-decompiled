/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class jc {
    int field_f;
    int field_a;
    static String[] field_j;
    int field_d;
    int field_b;
    int field_g;
    int field_e;
    static ka field_i;
    static int field_c;
    static volatile int field_h;

    abstract void a(int param0, int param1);

    final static ge[] b(int param0) {
        int var2 = 0;
        int var3 = TorChallenge.field_F ? 1 : 0;
        ge[] var1 = new ge[vl.field_b];
        if (param0 >= -33) {
            field_j = null;
        }
        for (var2 = 0; var2 < vl.field_b; var2++) {
            var1[var2] = new ge(ij.field_B, le.field_g, ug.field_e[var2], dd.field_t[var2], pg.field_r[var2], lg.field_e[var2], h.field_a[var2], td.field_m);
        }
        p.a(0);
        return var1;
    }

    final static void a(byte param0, int param1, int param2, int param3, int param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        L0: {
          var13 = TorChallenge.field_F ? 1 : 0;
          var5 = param3 + param1;
          var6 = param4 + param2;
          if (param1 <= qg.field_a) {
            stackOut_2_0 = qg.field_a;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = param1;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var7 = stackIn_3_0;
          if (param4 <= qg.field_k) {
            stackOut_5_0 = qg.field_k;
            stackIn_6_0 = stackOut_5_0;
            break L1;
          } else {
            stackOut_4_0 = param4;
            stackIn_6_0 = stackOut_4_0;
            break L1;
          }
        }
        L2: {
          var8 = stackIn_6_0;
          if (var5 >= qg.field_c) {
            stackOut_8_0 = qg.field_c;
            stackIn_9_0 = stackOut_8_0;
            break L2;
          } else {
            stackOut_7_0 = var5;
            stackIn_9_0 = stackOut_7_0;
            break L2;
          }
        }
        L3: {
          var9 = stackIn_9_0;
          if (var6 < qg.field_l) {
            stackOut_11_0 = var6;
            stackIn_12_0 = stackOut_11_0;
            break L3;
          } else {
            stackOut_10_0 = qg.field_l;
            stackIn_12_0 = stackOut_10_0;
            break L3;
          }
        }
        L4: {
          var10 = stackIn_12_0;
          if (param0 < -114) {
            break L4;
          } else {
            field_i = null;
            break L4;
          }
        }
        L5: {
          if (param1 < qg.field_a) {
            break L5;
          } else {
            if (param1 >= qg.field_c) {
              break L5;
            } else {
              var11 = param1 + var8 * qg.field_g;
              var12 = 1 - (-var10 - -var8) >> 1519077729;
              L6: while (true) {
                var12--;
                if (var12 < 0) {
                  break L5;
                } else {
                  qg.field_i[var11] = 16777215;
                  var11 = var11 + 2 * qg.field_g;
                  continue L6;
                }
              }
            }
          }
        }
        L7: {
          if (param4 < qg.field_k) {
            break L7;
          } else {
            if (qg.field_l > var6) {
              var11 = qg.field_g * param4 - -var7;
              var12 = -var7 + (1 + var9) >> -1733202367;
              L8: while (true) {
                var12--;
                if (-1 < (var12 ^ -1)) {
                  break L7;
                } else {
                  qg.field_i[var11] = 16777215;
                  var11 += 2;
                  continue L8;
                }
              }
            } else {
              break L7;
            }
          }
        }
        L9: {
          if (qg.field_a > var5) {
            break L9;
          } else {
            if (qg.field_c <= var5) {
              break L9;
            } else {
              var11 = qg.field_g * ((var5 + -param1 & 1) + var8) + var5;
              var12 = -var8 + (var10 + 1) >> 271911649;
              L10: while (true) {
                var12--;
                if ((var12 ^ -1) > -1) {
                  break L9;
                } else {
                  qg.field_i[var11] = 16777215;
                  var11 = var11 + qg.field_g * 2;
                  continue L10;
                }
              }
            }
          }
        }
        L11: {
          if (param4 < qg.field_k) {
            break L11;
          } else {
            if (qg.field_l > var6) {
              var11 = var7 + (var6 * qg.field_g + (1 & -param4 + var6));
              var12 = -var7 + (1 + var9) >> 1935860129;
              L12: while (true) {
                var12--;
                if (0 > var12) {
                  break L11;
                } else {
                  qg.field_i[var11] = 16777215;
                  var11 += 2;
                  continue L12;
                }
              }
            } else {
              break L11;
            }
          }
        }
    }

    public static void a(int param0) {
        if (param0 > -88) {
            field_j = null;
        }
        field_i = null;
        field_j = null;
    }

    final static void b(int param0, int param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        L0: {
          if (param1 == 1) {
            break L0;
          } else {
            field_i = null;
            break L0;
          }
        }
        L1: {
          if (0 > param2) {
            break L1;
          } else {
            if (param2 >= 9) {
              break L1;
            } else {
              L2: {
                var3 = rf.field_hb[param2];
                if (0 > var3) {
                  break L2;
                } else {
                  if ((var3 ^ -1) > -6) {
                    L3: {
                      var4 = cl.field_u[var3];
                      if (kd.field_k[var3] <= var4) {
                        break L3;
                      } else {
                        kd.field_k[var3] = var4;
                        break L3;
                      }
                    }
                    L4: {
                      if ((kd.field_k[var3] ^ -1) > -1) {
                        mg.a(true, param2, param0);
                        kd.field_k[var3] = var4;
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    return;
                  } else {
                    break L2;
                  }
                }
              }
              return;
            }
          }
        }
    }

    final static boolean a(String param0, int param1) {
        if (param1 != 26691) {
            field_h = -48;
        }
        CharSequence var3 = (CharSequence) (Object) param0;
        return td.field_i.equals((Object) (Object) il.a(var3, (byte) 21));
    }

    abstract void a(int param0, int param1, int param2);

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = new String[]{"Collect every coin on a tower, including those dropped by defeated enemies", "Kill every enemy on any tower but the first", "Collect a jade coin", "Collect all 3 jade coins with one character", "Collect all 3 jade coins with all three characters", "Get a x2 score multiplier", "Get a x4 score multiplier", "Get a x6 score multiplier", "Defeat the first master monk", "Defeat 2 master monks with one character", "Defeat all 3 master monks with one character", "Defeat all 3 master monks with all three characters", "Collect 20 seals with one character", "Collect all 30 seals with one character", "Collect all 30 seals with all three characters", "Collect a seal without taking damage since the last seal, on any tower but the first", "Defeat 150 skull heads during Hallowe'en"};
        field_i = new ka(96, 96);
        field_h = 0;
    }
}
