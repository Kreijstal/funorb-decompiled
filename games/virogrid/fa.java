/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fa extends l {
    static km field_n;
    static String field_h;
    static long field_l;
    static double field_k;
    int field_i;
    static String field_j;
    byte[] field_g;
    static String field_m;

    final static km c(int param0) {
        if (param0 != 16777215) {
            fa.d(64);
        }
        return rl.d(true);
    }

    public static void d(int param0) {
        field_h = null;
        if (param0 != 0) {
            return;
        }
        field_n = null;
        field_m = null;
        field_j = null;
    }

    final static void a(int param0) {
        int var1 = 0;
        int var2 = 0;
        int var3_int = 0;
        String var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        String var8 = null;
        String var9 = null;
        int var10 = 0;
        int stackIn_5_0 = 0;
        int stackIn_10_0 = 0;
        boolean stackOut_4_0 = false;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        L0: {
          var10 = Virogrid.field_F ? 1 : 0;
          if (vg.field_I != null) {
            stackOut_4_0 = vg.field_I.field_g;
            stackIn_5_0 = stackOut_4_0 ? 1 : 0;
            break L0;
          } else {
            if (ei.field_b == null) {
              stackOut_3_0 = 0;
              stackIn_5_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_2_0 = 1;
              stackIn_5_0 = stackOut_2_0;
              break L0;
            }
          }
        }
        L1: {
          var1 = stackIn_5_0;
          if (param0 == -30265) {
            break L1;
          } else {
            field_l = -90L;
            break L1;
          }
        }
        L2: {
          if (var1 != 0) {
            stackOut_9_0 = we.field_c.field_J;
            stackIn_10_0 = stackOut_9_0;
            break L2;
          } else {
            stackOut_8_0 = 480;
            stackIn_10_0 = stackOut_8_0;
            break L2;
          }
        }
        var2 = stackIn_10_0;
        if (-11 != (i.field_y ^ -1)) {
          L3: {
            if (wn.field_C != -1) {
              L4: {
                var3_int = 1141646;
                if (-1 != wn.field_C) {
                  break L4;
                } else {
                  break L4;
                }
              }
              L5: {
                if (qa.field_e != 0) {
                  break L5;
                } else {
                  var3_int = 16777215;
                  break L5;
                }
              }
              L6: {
                L7: {
                  var4 = (int)kd.field_t;
                  var5 = 21;
                  if (2 == he.field_ec) {
                    break L7;
                  } else {
                    if ((wn.field_C ^ -1) != -3) {
                      break L6;
                    } else {
                      break L7;
                    }
                  }
                }
                var5 += 19;
                break L6;
              }
              L8: {
                if (var5 > pe.field_k) {
                  pe.field_k = pe.field_k + 8;
                  if (pe.field_k <= var5) {
                    break L8;
                  } else {
                    pe.field_k = var5;
                    break L8;
                  }
                } else {
                  if (var5 >= pe.field_k) {
                    break L8;
                  } else {
                    pe.field_k = pe.field_k - 1;
                    break L8;
                  }
                }
              }
              L9: {
                df.a(651 + (-var4 - 8), -pe.field_k + var2, 8 + var4, 52, 4, 0, 200);
                var6 = (int)kd.field_t - 8;
                var7 = 16;
                if ((var6 ^ -1) >= -9) {
                  break L9;
                } else {
                  if ((var7 ^ -1) >= -9) {
                    break L9;
                  } else {
                    df.e(646 + -(int)kd.field_t, 2 + (var2 + -20), var6, var7, 4, 1141646);
                    break L9;
                  }
                }
              }
              L10: {
                var8 = null;
                if (he.field_ec == 1) {
                  var8 = o.field_a.toUpperCase();
                  break L10;
                } else {
                  break L10;
                }
              }
              L11: {
                if (-3 != (he.field_ec ^ -1)) {
                  break L11;
                } else {
                  var8 = sl.field_a.toUpperCase();
                  break L11;
                }
              }
              if (0 == ai.field_f) {
                vg.field_H.b(var8, -((int)kd.field_t >> -1018883999) + (642 + -(vg.field_H.a(var8) >> -1973549151)), -vg.field_H.field_G + (var2 - 2 - 2), var3_int, -1);
                break L3;
              } else {
                L12: {
                  var9 = null;
                  if ((wn.field_C ^ -1) == -2) {
                    var9 = o.field_a.toUpperCase();
                    break L12;
                  } else {
                    break L12;
                  }
                }
                L13: {
                  if (2 != wn.field_C) {
                    break L13;
                  } else {
                    var9 = sl.field_a.toUpperCase();
                    break L13;
                  }
                }
                vg.field_H.c(var8, 642 + -((int)kd.field_t >> -1623385951) + -(vg.field_H.a(var8) >> 1703846945), -2 + -vg.field_H.field_G + (var2 - 2), var3_int, -1, 256 + -ai.field_f);
                vg.field_H.c(var9, -((int)kd.field_t >> -1992377439) + 642 - (vg.field_H.a(var8) >> -480881215), -2 + -vg.field_H.field_G + (-2 + var2), var3_int, -1, ai.field_f);
                break L3;
              }
            } else {
              break L3;
            }
          }
          L14: {
            L15: {
              if (he.field_ec == -3) {
                break L15;
              } else {
                if (-3 != wn.field_C) {
                  break L14;
                } else {
                  break L15;
                }
              }
            }
            L16: {
              var2 -= 20;
              var3_int = 256;
              if (he.field_ec != -3) {
                var3_int = ai.field_f;
                break L16;
              } else {
                break L16;
              }
            }
            L17: {
              if (-3 == wn.field_C) {
                break L17;
              } else {
                var3_int = 256 + -ai.field_f;
                break L17;
              }
            }
            var4 = 0;
            L18: while (true) {
              if ((var4 ^ -1) <= -6) {
                break L14;
              } else {
                L19: {
                  var5 = 1141646;
                  if (qa.field_e != 1 + var4) {
                    break L19;
                  } else {
                    var5 = 16777215;
                    break L19;
                  }
                }
                var6 = 26 * var4 + 764 + -((int)kd.field_t * 2) - -10;
                df.e(6 + var6, var2 - 16, 22, 16, 4, 1141646);
                if ((var3_int ^ -1) != -257) {
                  kd.field_p[var4].b(var6 + 12, var2 - 13, var5);
                  var4++;
                  continue L18;
                } else {
                  kd.field_p[var4].b(12 + var6, -13 + var2, var5);
                  var4++;
                  continue L18;
                }
              }
            }
          }
          L20: {
            L21: {
              if (0 == qa.field_e) {
                break L21;
              } else {
                if (0 > qa.field_e) {
                  break L20;
                } else {
                  if (2 != wn.field_C) {
                    break L20;
                  } else {
                    break L21;
                  }
                }
              }
            }
            L22: {
              var3 = "";
              var4 = qa.field_e;
              if (var4 == -1) {
                var3 = um.field_Kb;
                break L22;
              } else {
                if (-2 == var4) {
                  var3 = mc.field_d;
                  break L22;
                } else {
                  if (2 == var4) {
                    var3 = pn.field_C;
                    break L22;
                  } else {
                    if (3 == var4) {
                      var3 = vb.field_i;
                      break L22;
                    } else {
                      if (4 == var4) {
                        var3 = cb.field_b;
                        break L22;
                      } else {
                        if (-6 == (var4 ^ -1)) {
                          var3 = ia.field_a;
                          break L22;
                        } else {
                          break L22;
                        }
                      }
                    }
                  }
                }
              }
            }
            var4 = 16 + vg.field_H.a(var3);
            var5 = 20;
            var6 = nl.field_u - var4;
            var7 = hk.field_Jb;
            df.c(var6, -var5 + (var7 + 2), var4, var5, 4, 0);
            df.e(var6 - -3, -16 + var7, var4 - 6, 16, 4, 1141646);
            vg.field_H.b(var3, 8 + var6, -2 + var7 + -vg.field_H.field_G, 16777215, -1);
            break L20;
          }
          return;
        } else {
          return;
        }
    }

    private fa() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = "Capture opposing pieces<br>by moving adjacent to them";
        field_m = "Waiting for models";
        field_j = "Public chat is unavailable while setting up a rated game.";
    }
}
