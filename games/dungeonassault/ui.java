/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class ui {
    static int field_b;
    static int field_a;

    final static String a(int param0, int param1) {
        String var2 = null;
        String var3 = null;
        String stackIn_16_0 = null;
        String stackOut_15_0 = null;
        String stackOut_14_0 = null;
        L0: {
          if (param1 == 19435) {
            break L0;
          } else {
            String discarded$2 = ui.a(65, -11);
            break L0;
          }
        }
        L1: {
          var2 = ll.field_m[param0];
          if (param0 != 10) {
            break L1;
          } else {
            L2: {
              if (g.field_Hb == 0) {
                break L2;
              } else {
                if (dc.field_z == 0) {
                  break L2;
                } else {
                  if (g.field_Hb == 12) {
                    break L2;
                  } else {
                    if (12 == dc.field_z) {
                      break L2;
                    } else {
                      if (g.field_Hb == 1) {
                        break L2;
                      } else {
                        if (dc.field_z == 1) {
                          break L2;
                        } else {
                          break L1;
                        }
                      }
                    }
                  }
                }
              }
            }
            var2 = ll.field_m[9];
            break L1;
          }
        }
        L3: {
          if (param0 == 28) {
            L4: {
              if (!gl.field_Lb) {
                stackOut_15_0 = ql.field_g;
                stackIn_16_0 = stackOut_15_0;
                break L4;
              } else {
                stackOut_14_0 = go.field_V;
                stackIn_16_0 = stackOut_14_0;
                break L4;
              }
            }
            var3 = stackIn_16_0;
            var2 = uf.field_b + var3;
            break L3;
          } else {
            break L3;
          }
        }
        return var2;
    }

    final static void a(int param0) {
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        al var4 = null;
        fn var4_ref = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8_int = 0;
        String[][] var8 = null;
        String[][] var9 = null;
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
        wj var27 = null;
        long[][] var34 = null;
        int[][] var35 = null;
        RuntimeException decompiledCaughtException = null;
        var26 = DungeonAssault.field_K;
        try {
          L0: {
            L1: {
              var27 = ra.field_c;
              var2 = var27.c(true);
              if (var2 != 0) {
                if (var2 == 1) {
                  var3 = var27.k(0);
                  var4_ref = (fn) (Object) cb.field_a.e(-24172);
                  L2: while (true) {
                    L3: {
                      if (var4_ref == null) {
                        break L3;
                      } else {
                        if (var3 == var4_ref.field_r) {
                          break L3;
                        } else {
                          var4_ref = (fn) (Object) cb.field_a.a(4);
                          continue L2;
                        }
                      }
                    }
                    if (var4_ref != null) {
                      var4_ref.a(false);
                      break L1;
                    } else {
                      tl.a(-96);
                      return;
                    }
                  }
                } else {
                  sm.a((Throwable) null, 1, "HS1: " + sj.l(192));
                  tl.a(-33);
                  break L1;
                }
              } else {
                var3 = var27.k(0);
                var4 = (al) (Object) hg.field_n.e(-24172);
                L4: while (true) {
                  L5: {
                    if (var4 == null) {
                      break L5;
                    } else {
                      if (var3 != var4.field_k) {
                        var4 = (al) (Object) hg.field_n.a(4);
                        continue L4;
                      } else {
                        break L5;
                      }
                    }
                  }
                  if (var4 != null) {
                    var5 = var27.c(true);
                    if (var5 != 0) {
                      var6 = var4.field_l;
                      lg.field_x[0].field_d = null;
                      lg.field_x[0].field_e = false;
                      lg.field_x[0].field_a = tc.field_u;
                      var7 = var4.field_p;
                      var8_int = 1;
                      L6: while (true) {
                        if (var5 <= var8_int) {
                          var8 = new String[3][var6];
                          var9 = new String[3][var6];
                          var34 = new long[3][var6];
                          var35 = new int[3][var7 * var6];
                          var12 = 0;
                          var13 = 0;
                          var14 = 0;
                          var15 = 0;
                          var16 = 0;
                          var17 = 0;
                          var18 = var27.c(true);
                          if (var18 > 0) {
                            var19 = 0;
                            L7: while (true) {
                              if (var18 > var19) {
                                L8: {
                                  var20 = var27.c(true);
                                  var21 = lg.field_x[var20].field_a;
                                  var22 = var27.c((byte) 89);
                                  var24 = var27.field_o;
                                  if (var19 < var6) {
                                    var8[0][var12] = var21;
                                    var9[0][var12] = lg.field_x[var20].field_d;
                                    var34[0][var12] = var22;
                                    var12++;
                                    var25 = 0;
                                    L9: while (true) {
                                      if (var7 <= var25) {
                                        break L8;
                                      } else {
                                        int incrementValue$3 = var15;
                                        var15++;
                                        var35[0][incrementValue$3] = var27.h(-99);
                                        var25++;
                                        continue L9;
                                      }
                                    }
                                  } else {
                                    break L8;
                                  }
                                }
                                L10: {
                                  if (var21 == null) {
                                    break L10;
                                  } else {
                                    if (eh.a(true, var21)) {
                                      var8[1][var13] = tc.field_u;
                                      var9[1][var13] = null;
                                      var34[1][var13] = var22;
                                      var27.field_o = var24;
                                      var13++;
                                      var25 = 0;
                                      L11: while (true) {
                                        if (var7 <= var25) {
                                          break L10;
                                        } else {
                                          int incrementValue$4 = var16;
                                          var16++;
                                          var35[1][incrementValue$4] = var27.h(-37);
                                          var25++;
                                          continue L11;
                                        }
                                      }
                                    } else {
                                      break L10;
                                    }
                                  }
                                }
                                L12: {
                                  if (var14 >= var6) {
                                    break L12;
                                  } else {
                                    if (!lg.field_x[var20].field_e) {
                                      lg.field_x[var20].field_e = true;
                                      var8[2][var14] = var21;
                                      var9[2][var14] = lg.field_x[var20].field_d;
                                      var34[2][var14] = var22;
                                      var27.field_o = var24;
                                      var14++;
                                      var25 = 0;
                                      L13: while (true) {
                                        if (var25 >= var7) {
                                          break L12;
                                        } else {
                                          int incrementValue$5 = var17;
                                          var17++;
                                          var35[2][incrementValue$5] = var27.h(md.b(30592, -30643));
                                          var25++;
                                          continue L13;
                                        }
                                      }
                                    } else {
                                      break L12;
                                    }
                                  }
                                }
                                var19++;
                                continue L7;
                              } else {
                                var4.a(false);
                                break L1;
                              }
                            }
                          } else {
                            var4.a(false);
                            break L1;
                          }
                        } else {
                          L14: {
                            lg.field_x[var8_int].field_a = var27.d(-122);
                            lg.field_x[var8_int].field_e = false;
                            if (var27.c(true) != 1) {
                              lg.field_x[var8_int].field_d = null;
                              break L14;
                            } else {
                              lg.field_x[var8_int].field_d = var27.d(-125);
                              break L14;
                            }
                          }
                          var8_int++;
                          continue L6;
                        }
                      }
                    } else {
                      var4.a(false);
                      break L1;
                    }
                  } else {
                    tl.a(-68);
                    return;
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw vk.a((Throwable) (Object) var1, "ui.A(" + 30592 + 41);
        }
    }

    static {
    }
}
