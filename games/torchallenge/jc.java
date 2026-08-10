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
            field_j = (String[]) null;
        }
        for (var2 = 0; var2 < vl.field_b; var2++) {
            var1[var2] = new ge(ij.field_B, le.field_g, ug.field_e[var2], dd.field_t[var2], pg.field_r[var2], lg.field_e[var2], h.field_a[var2], td.field_m);
        }
        p.a(0);
        return var1;
    }

    final static void a(byte param0, int param1, int param2, int param3, int param4) {
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        var13 = TorChallenge.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              var5_int = param3 + param1;
              var6 = param4 + param2;
              if (param1 <= qg.field_a) {
                stackIn_4_0 = qg.field_a;
                break L1;
              } else {
                stackIn_4_0 = param1;
                break L1;
              }
            }
            L2: {
              var7 = stackIn_4_0;
              if (param4 <= qg.field_k) {
                stackIn_7_0 = qg.field_k;
                break L2;
              } else {
                stackIn_7_0 = param4;
                break L2;
              }
            }
            L3: {
              var8 = stackIn_7_0;
              if (var5_int >= qg.field_c) {
                stackIn_10_0 = qg.field_c;
                break L3;
              } else {
                stackIn_10_0 = var5_int;
                break L3;
              }
            }
            L4: {
              var9 = stackIn_10_0;
              if (var6 < qg.field_l) {
                stackIn_13_0 = var6;
                break L4;
              } else {
                stackIn_13_0 = qg.field_l;
                break L4;
              }
            }
            L5: {
              var10 = stackIn_13_0;
              if (param0 < -114) {
                break L5;
              } else {
                field_i = (ka) null;
                break L5;
              }
            }
            L6: {
              if (param1 < qg.field_a) {
                break L6;
              } else {
                if (param1 >= qg.field_c) {
                  break L6;
                } else {
                  var11 = param1 + var8 * qg.field_g;
                  var12 = 1 - (-var10 - -var8) >> 1519077729;
                  L7: while (true) {
                    var12--;
                    if (var12 < 0) {
                      break L6;
                    } else {
                      qg.field_i[var11] = 16777215;
                      var11 = var11 + 2 * qg.field_g;
                      continue L7;
                    }
                  }
                }
              }
            }
            L8: {
              if (param4 < qg.field_k) {
                break L8;
              } else {
                if (qg.field_l > var6) {
                  var11 = qg.field_g * param4 - -var7;
                  var12 = -var7 + (1 + var9) >> -1733202367;
                  L9: while (true) {
                    var12--;
                    if (-1 < (var12 ^ -1)) {
                      break L8;
                    } else {
                      qg.field_i[var11] = 16777215;
                      var11 += 2;
                      continue L9;
                    }
                  }
                } else {
                  break L8;
                }
              }
            }
            L10: {
              if (qg.field_a > var5_int) {
                break L10;
              } else {
                if (qg.field_c <= var5_int) {
                  break L10;
                } else {
                  var11 = qg.field_g * ((var5_int + -param1 & 1) + var8) + var5_int;
                  var12 = -var8 + (var10 + 1) >> 271911649;
                  L11: while (true) {
                    var12--;
                    if ((var12 ^ -1) > -1) {
                      break L10;
                    } else {
                      qg.field_i[var11] = 16777215;
                      var11 = var11 + qg.field_g * 2;
                      continue L11;
                    }
                  }
                }
              }
            }
            L12: {
              L13: {
                if (param4 < qg.field_k) {
                  break L13;
                } else {
                  if (qg.field_l > var6) {
                    var11 = var7 + (var6 * qg.field_g + (1 & -param4 + var6));
                    var12 = -var7 + (1 + var9) >> 1935860129;
                    L14: while (true) {
                      var12--;
                      if (0 > var12) {
                        break L13;
                      } else {
                        qg.field_i[var11] = 16777215;
                        var11 += 2;
                        continue L14;
                      }
                    }
                  } else {
                    break L12;
                  }
                }
              }
              break L12;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var5), "jc.M(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    public static void a(int param0) {
        if (param0 > -88) {
            field_j = (String[]) null;
        }
        field_i = null;
        field_j = null;
    }

    final static void b(int param0, int param1, int param2) {
        int var3;
        int var4;
        L0: {
          if (param1 == 1) {
            break L0;
          } else {
            field_i = (ka) null;
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
        RuntimeException var2 = null;
        CharSequence var3 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == 26691) {
                break L1;
              } else {
                field_h = -48;
                break L1;
              }
            }
            var3 = (CharSequence) ((Object) param0);
            stackIn_3_0 = td.field_i.equals(il.a(var3, (byte) 21));
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var2);

            stackIn_6_1 = new StringBuilder().append("jc.L(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw oj.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    abstract void a(int param0, int param1, int param2);

    static {
        field_j = new String[]{"Collect every coin on a tower, including those dropped by defeated enemies", "Kill every enemy on any tower but the first", "Collect a jade coin", "Collect all 3 jade coins with one character", "Collect all 3 jade coins with all three characters", "Get a x2 score multiplier", "Get a x4 score multiplier", "Get a x6 score multiplier", "Defeat the first master monk", "Defeat 2 master monks with one character", "Defeat all 3 master monks with one character", "Defeat all 3 master monks with all three characters", "Collect 20 seals with one character", "Collect all 30 seals with one character", "Collect all 30 seals with all three characters", "Collect a seal without taking damage since the last seal, on any tower but the first", "Defeat 150 skull heads during Hallowe'en"};
        field_i = new ka(96, 96);
        field_h = 0;
    }
}
