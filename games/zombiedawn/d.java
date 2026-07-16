/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class d {
    static String field_c;
    static int[] field_d;
    static String field_a;
    static int field_b;

    final static boolean a(int param0, boolean param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        L0: {
          if (!df.field_h) {
            break L0;
          } else {
            if (!nm.field_b) {
              break L0;
            } else {
              if (-1 > (vj.field_o ^ -1)) {
                L1: {
                  var3 = nh.field_P * 7 / 8 - te.field_bb;
                  if (!param1) {
                    break L1;
                  } else {
                    field_b = 33;
                    break L1;
                  }
                }
                L2: {
                  var4 = 100 + (vh.field_b - -(-vj.field_o + 400 >> 2024535745));
                  var5 = vj.field_o + 40;
                  if (var4 >= param2) {
                    break L2;
                  } else {
                    if (param0 <= var3) {
                      break L2;
                    } else {
                      if (var5 + var4 <= param2) {
                        break L2;
                      } else {
                        if (te.field_bb + var3 > param0) {
                          L3: {
                            if (-3 == ma.field_r) {
                              vj.field_q = 500;
                              break L3;
                            } else {
                              break L3;
                            }
                          }
                          ck.a(-2, 6836);
                          return true;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                }
                return false;
              } else {
                return false;
              }
            }
          }
        }
        return false;
    }

    public static void a(int param0) {
        field_d = null;
        field_c = null;
        field_a = null;
        if (param0 != 6) {
            field_a = null;
        }
    }

    final static void a(boolean param0) {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        long var3_long = 0L;
        int var4 = 0;
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        mf var9 = null;
        int var10 = 0;
        int stackIn_17_0 = 0;
        String stackIn_22_0 = null;
        int stackIn_26_0 = 0;
        String stackIn_32_0 = null;
        String stackIn_37_0 = null;
        int stackIn_37_1 = 0;
        String stackIn_38_0 = null;
        int stackIn_38_1 = 0;
        String stackIn_39_0 = null;
        int stackIn_39_1 = 0;
        int stackIn_39_2 = 0;
        mf stackIn_43_0 = null;
        int stackOut_16_0 = 0;
        int stackOut_15_0 = 0;
        String stackOut_21_0 = null;
        String stackOut_20_0 = null;
        int stackOut_25_0 = 0;
        int stackOut_24_0 = 0;
        String stackOut_31_0 = null;
        String stackOut_30_0 = null;
        String stackOut_36_0 = null;
        int stackOut_36_1 = 0;
        String stackOut_38_0 = null;
        int stackOut_38_1 = 0;
        int stackOut_38_2 = 0;
        String stackOut_37_0 = null;
        int stackOut_37_1 = 0;
        int stackOut_37_2 = 0;
        mf stackOut_42_0 = null;
        mf stackOut_41_0 = null;
        L0: {
          var10 = ZombieDawn.field_J;
          var1 = wm.field_d;
          var2 = 0;
          if ((pg.field_p ^ -1) != -3) {
            break L0;
          } else {
            var3_long = pd.a(-22826) - ge.field_f;
            var2 = (int)((10999L + -var3_long) / 1000L);
            if ((var2 ^ -1) > -1) {
              var2 = 0;
              break L0;
            } else {
              break L0;
            }
          }
        }
        var3 = 0;
        L1: while (true) {
          if ((var3 ^ -1) <= (cj.field_h.length ^ -1)) {
            L2: {
              if (!param0) {
                break L2;
              } else {
                field_d = null;
                break L2;
              }
            }
            return;
          } else {
            L3: {
              var4 = hd.field_s[var3];
              if (-1 >= (var4 ^ -1)) {
                if ((var4 ^ -1) != (i.field_W.field_d ^ -1)) {
                  var5 = dl.field_f;
                  break L3;
                } else {
                  var5 = ba.field_j;
                  break L3;
                }
              } else {
                var5 = ro.field_c;
                break L3;
              }
            }
            L4: {
              var6 = cj.field_h[var3];
              if (2 != pg.field_p) {
                break L4;
              } else {
                if (-2 == (var2 ^ -1)) {
                  L5: {
                    if ((dl.field_h.length ^ -1) >= (pn.field_R.length ^ -1)) {
                      stackOut_16_0 = pn.field_R.length;
                      stackIn_17_0 = stackOut_16_0;
                      break L5;
                    } else {
                      stackOut_15_0 = dl.field_h.length;
                      stackIn_17_0 = stackOut_15_0;
                      break L5;
                    }
                  }
                  L6: {
                    var7 = stackIn_17_0;
                    if (6 > var3) {
                      break L6;
                    } else {
                      if (var3 >= var7 + 6) {
                        break L6;
                      } else {
                        L7: {
                          if (-1 < (-var7 + pn.field_R.length + -6 + var3 ^ -1)) {
                            stackOut_21_0 = "";
                            stackIn_22_0 = stackOut_21_0;
                            break L7;
                          } else {
                            stackOut_20_0 = pn.field_R[var3 - 6 + (pn.field_R.length - var7)];
                            stackIn_22_0 = stackOut_20_0;
                            break L7;
                          }
                        }
                        var6 = stackIn_22_0;
                        break L6;
                      }
                    }
                  }
                  L8: {
                    if ((bp.field_a.length ^ -1) < (hl.field_b.length ^ -1)) {
                      stackOut_25_0 = bp.field_a.length;
                      stackIn_26_0 = stackOut_25_0;
                      break L8;
                    } else {
                      stackOut_24_0 = hl.field_b.length;
                      stackIn_26_0 = stackOut_24_0;
                      break L8;
                    }
                  }
                  var8 = stackIn_26_0;
                  if (var3 < var7 + 7) {
                    break L4;
                  } else {
                    if ((var7 + (7 + var8) ^ -1) < (var3 ^ -1)) {
                      L9: {
                        if ((hl.field_b.length ^ -1) < (-var7 + -7 + var3 ^ -1)) {
                          stackOut_31_0 = hl.field_b[var3 - 7 + -var7];
                          stackIn_32_0 = stackOut_31_0;
                          break L9;
                        } else {
                          stackOut_30_0 = "";
                          stackIn_32_0 = stackOut_30_0;
                          break L9;
                        }
                      }
                      var6 = stackIn_32_0;
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                } else {
                  break L4;
                }
              }
            }
            L10: {
              if (1 == (var4 ^ -1)) {
                var6 = Integer.toString(var2);
                break L10;
              } else {
                break L10;
              }
            }
            L11: {
              stackOut_36_0 = (String) var6;
              stackOut_36_1 = 1;
              stackIn_38_0 = stackOut_36_0;
              stackIn_38_1 = stackOut_36_1;
              stackIn_37_0 = stackOut_36_0;
              stackIn_37_1 = stackOut_36_1;
              if (0 > var4) {
                stackOut_38_0 = (String) (Object) stackIn_38_0;
                stackOut_38_1 = stackIn_38_1;
                stackOut_38_2 = 0;
                stackIn_39_0 = stackOut_38_0;
                stackIn_39_1 = stackOut_38_1;
                stackIn_39_2 = stackOut_38_2;
                break L11;
              } else {
                stackOut_37_0 = (String) (Object) stackIn_37_0;
                stackOut_37_1 = stackIn_37_1;
                stackOut_37_2 = 1;
                stackIn_39_0 = stackOut_37_0;
                stackIn_39_1 = stackOut_37_1;
                stackIn_39_2 = stackOut_37_2;
                break L11;
              }
            }
            L12: {
              var7 = tk.a(stackIn_39_0, stackIn_39_1 != 0, stackIn_39_2 != 0);
              var8 = mo.field_b - (var7 >> 1389505089);
              if ((var4 ^ -1) > -1) {
                break L12;
              } else {
                L13: {
                  var1 = var1 + fe.field_H;
                  if (var4 != i.field_W.field_d) {
                    stackOut_42_0 = de.field_k;
                    stackIn_43_0 = stackOut_42_0;
                    break L13;
                  } else {
                    stackOut_41_0 = hp.field_B;
                    stackIn_43_0 = stackOut_41_0;
                    break L13;
                  }
                }
                L14: {
                  var9 = stackIn_43_0;
                  if (var9 != null) {
                    var9.a(var7 - -(lk.field_f << 958237921), var1, -lk.field_f + var8, (byte) -127, (cn.field_h << 932843649) + qh.field_f);
                    break L14;
                  } else {
                    break L14;
                  }
                }
                var1 = var1 + cn.field_h;
                break L12;
              }
            }
            L15: {
              if (0 <= var4) {
                q.field_H.c(var6, var8, var1 - -el.field_n, var5, -1);
                var1 = var1 + (qh.field_f + (fe.field_H + cn.field_h));
                break L15;
              } else {
                ZombieDawn.field_K.c(var6, var8, var1 - -mh.field_F, var5, -1);
                var1 = var1 + vl.field_r;
                break L15;
              }
            }
            var3++;
            continue L1;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = 200;
        field_d = new int[8192];
        field_c = "Loading instruments";
        field_a = "Unfortunately there was a focus problem while setting fullscreen mode. You could try disabling any multiple monitor drivers or window enhancements, if you have any enabled.";
    }
}
