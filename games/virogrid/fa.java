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
        RuntimeException var1 = null;
        int var1_int = 0;
        int var2 = 0;
        int var3_int = 0;
        String var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        Object var8 = null;
        Object var9 = null;
        int var10 = 0;
        int stackIn_6_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_5_0 = false;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        var10 = Virogrid.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (vg.field_I != null) {
                stackOut_5_0 = vg.field_I.field_g;
                stackIn_6_0 = stackOut_5_0 ? 1 : 0;
                break L1;
              } else {
                if (ei.field_b == null) {
                  stackOut_4_0 = 0;
                  stackIn_6_0 = stackOut_4_0;
                  break L1;
                } else {
                  stackOut_3_0 = 1;
                  stackIn_6_0 = stackOut_3_0;
                  break L1;
                }
              }
            }
            L2: {
              var1_int = stackIn_6_0;
              if (param0 == -30265) {
                break L2;
              } else {
                field_l = -90L;
                break L2;
              }
            }
            L3: {
              if (var1_int != 0) {
                stackOut_10_0 = we.field_c.field_J;
                stackIn_11_0 = stackOut_10_0;
                break L3;
              } else {
                stackOut_9_0 = 480;
                stackIn_11_0 = stackOut_9_0;
                break L3;
              }
            }
            var2 = stackIn_11_0;
            if (i.field_y != 10) {
              L4: {
                L5: {
                  if (he.field_ec != 0) {
                    break L5;
                  } else {
                    if (wn.field_C != 0) {
                      break L5;
                    } else {
                      break L4;
                    }
                  }
                }
                L6: {
                  var3_int = 1141646;
                  if (wn.field_C != 0) {
                    break L6;
                  } else {
                    break L6;
                  }
                }
                L7: {
                  if (qa.field_e != 0) {
                    break L7;
                  } else {
                    var3_int = 16777215;
                    break L7;
                  }
                }
                L8: {
                  L9: {
                    var4 = (int)kd.field_t;
                    var5 = 21;
                    if (2 == he.field_ec) {
                      break L9;
                    } else {
                      if (wn.field_C != 2) {
                        break L8;
                      } else {
                        break L9;
                      }
                    }
                  }
                  var5 += 19;
                  break L8;
                }
                L10: {
                  if (~var5 < ~pe.field_k) {
                    pe.field_k = pe.field_k + 8;
                    if (pe.field_k <= var5) {
                      break L10;
                    } else {
                      pe.field_k = var5;
                      break L10;
                    }
                  } else {
                    if (~var5 <= ~pe.field_k) {
                      break L10;
                    } else {
                      pe.field_k = pe.field_k - 1;
                      break L10;
                    }
                  }
                }
                L11: {
                  df.a(651 + (-var4 - 8), -pe.field_k + var2, 8 + var4, 52, 4, 0, 200);
                  var6 = (int)kd.field_t - 8;
                  var7 = 16;
                  if (var6 <= 8) {
                    break L11;
                  } else {
                    if (var7 <= 8) {
                      break L11;
                    } else {
                      df.e(646 + -(int)kd.field_t, 2 + (var2 + -20), var6, var7, 4, 1141646);
                      break L11;
                    }
                  }
                }
                L12: {
                  var8 = null;
                  if (he.field_ec == 1) {
                    var8 = (Object) (Object) o.field_a.toUpperCase();
                    break L12;
                  } else {
                    break L12;
                  }
                }
                L13: {
                  if (he.field_ec != 2) {
                    break L13;
                  } else {
                    var8 = (Object) (Object) sl.field_a.toUpperCase();
                    break L13;
                  }
                }
                if (0 == ai.field_f) {
                  vg.field_H.b((String) var8, -((int)kd.field_t >> 1) + (642 + -(vg.field_H.a((String) var8) >> 1)), -vg.field_H.field_G + (var2 - 4), var3_int, -1);
                  break L4;
                } else {
                  L14: {
                    var9 = null;
                    if (wn.field_C == 1) {
                      var9 = (Object) (Object) o.field_a.toUpperCase();
                      break L14;
                    } else {
                      break L14;
                    }
                  }
                  L15: {
                    if (2 != wn.field_C) {
                      break L15;
                    } else {
                      var9 = (Object) (Object) sl.field_a.toUpperCase();
                      break L15;
                    }
                  }
                  vg.field_H.c((String) var8, 642 + -((int)kd.field_t >> 1) + -(vg.field_H.a((String) var8) >> 1), -2 + -vg.field_H.field_G + (var2 - 2), var3_int, -1, 256 + -ai.field_f);
                  vg.field_H.c((String) var9, -((int)kd.field_t >> 1) + 642 - (vg.field_H.a((String) var8) >> 1), -2 + -vg.field_H.field_G + (-2 + var2), var3_int, -1, ai.field_f);
                  break L4;
                }
              }
              L16: {
                L17: {
                  if (he.field_ec == 2) {
                    break L17;
                  } else {
                    if (wn.field_C != 2) {
                      break L16;
                    } else {
                      break L17;
                    }
                  }
                }
                L18: {
                  var2 -= 20;
                  var3_int = 256;
                  if (he.field_ec != 2) {
                    var3_int = ai.field_f;
                    break L18;
                  } else {
                    break L18;
                  }
                }
                L19: {
                  if (wn.field_C == 2) {
                    break L19;
                  } else {
                    var3_int = 256 + -ai.field_f;
                    break L19;
                  }
                }
                var4 = 0;
                L20: while (true) {
                  if (var4 >= 5) {
                    break L16;
                  } else {
                    L21: {
                      var5 = 1141646;
                      if (~qa.field_e != ~(1 + var4)) {
                        break L21;
                      } else {
                        var5 = 16777215;
                        break L21;
                      }
                    }
                    L22: {
                      var6 = 26 * var4 + 764 + -((int)kd.field_t * 2) - -10;
                      df.e(6 + var6, var2 - 16, 22, 16, 4, 1141646);
                      if (var3_int != 256) {
                        kd.field_p[var4].b(var6 + 12, var2 - 13, var5);
                        break L22;
                      } else {
                        kd.field_p[var4].b(12 + var6, -13 + var2, var5);
                        break L22;
                      }
                    }
                    var4++;
                    continue L20;
                  }
                }
              }
              L23: {
                L24: {
                  if (0 == qa.field_e) {
                    break L24;
                  } else {
                    if (0 > qa.field_e) {
                      break L23;
                    } else {
                      if (2 != wn.field_C) {
                        break L23;
                      } else {
                        break L24;
                      }
                    }
                  }
                }
                L25: {
                  var3 = "";
                  var4 = qa.field_e;
                  if (var4 == 0) {
                    var3 = um.field_Kb;
                    break L25;
                  } else {
                    if (var4 == 1) {
                      var3 = mc.field_d;
                      break L25;
                    } else {
                      if (2 == var4) {
                        var3 = pn.field_C;
                        break L25;
                      } else {
                        if (3 == var4) {
                          var3 = vb.field_i;
                          break L25;
                        } else {
                          if (4 == var4) {
                            var3 = cb.field_b;
                            break L25;
                          } else {
                            if (var4 == 5) {
                              var3 = ia.field_a;
                              break L25;
                            } else {
                              break L25;
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
                break L23;
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw kg.a((Throwable) (Object) var1, "fa.A(" + param0 + ')');
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
