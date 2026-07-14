/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nn extends li {
    int field_u;
    int[] field_n;
    static tj field_w;
    int field_r;
    int field_o;
    int field_v;
    static String[] field_t;
    int field_x;
    static r field_y;
    static String field_p;
    int field_q;
    static int[] field_s;

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        var14 = Vertigo2.field_L ? 1 : 0;
        var6 = param3 + (2 + (485 + (param1 + 8))) + 8;
        ad.field_f.a(89, var6 - 6, -6 + td.field_c.field_db, 3, 3);
        var7 = -5 + ad.field_f.field_db;
        bp.field_C.a(94, 485 + param1 + (2 - -param3), param2, var7 + -param2, 5);
        dj.field_d.a(115, -param1 + bp.field_C.field_Fb - ui.field_b.field_Fb, param2, 0, param1);
        var7 = var7 - (2 + param2);
        ui.field_b.a(82, ui.field_b.field_Fb, param2, 0, param1 + dj.field_d.field_Fb);
        mg.field_R.a(5, 2, param3, var7 - 5, 5, param1 - -485 + (2 - -param3), param0 ^ 3125);
        if (null == lq.field_a) {
          var8 = -param1 + (td.field_c.field_Fb - var6);
          var9 = var8 / 2;
          var10 = param4 + var9 + param1;
          var11 = 0;
          var12 = 0;
          if (param0 != 1) {
            field_s = null;
            L0: while (true) {
              if (-7 < (var12 ^ -1)) {
                L1: {
                  if (var12 >= 5) {
                    break L1;
                  } else {
                    if (hl.field_q[var12] == null) {
                      var12++;
                      var12++;
                      continue L0;
                    } else {
                      break L1;
                    }
                  }
                }
                var13 = var11 * (td.field_c.field_db - 6 - -2) / (1 + sd.field_L) + 3;
                var11++;
                var7 = -var13 + (var11 * (td.field_c.field_db + -6 - -2) / (1 + sd.field_L) + 3) + -2;
                if (-6 >= (var12 ^ -1)) {
                  ea.field_c.a(param0 + 95, var8, var7, var13, var6);
                  var12++;
                  continue L0;
                } else {
                  hl.field_q[var12].a(112, var8, var7, var13, var6);
                  gh.field_d[var12].a(126, -param1 + var9, var7, 0, param1);
                  w.field_C[var12].a(78, param4, -param5 + var7 - param5, param5, var9);
                  mg.field_M[var12].a(param0 ^ 91, -param1 + (var8 - var10), -param5 + -param5 + var7, param5, var10);
                  var12++;
                  continue L0;
                }
              } else {
                return;
              }
            }
          } else {
            L2: while (true) {
              if (-7 < (var12 ^ -1)) {
                L3: {
                  if (var12 >= 5) {
                    break L3;
                  } else {
                    if (hl.field_q[var12] == null) {
                      var12++;
                      var12++;
                      continue L2;
                    } else {
                      break L3;
                    }
                  }
                }
                var13 = var11 * (td.field_c.field_db - 6 - -2) / (1 + sd.field_L) + 3;
                var11++;
                var7 = -var13 + (var11 * (td.field_c.field_db + -6 - -2) / (1 + sd.field_L) + 3) + -2;
                if (-6 >= (var12 ^ -1)) {
                  ea.field_c.a(param0 + 95, var8, var7, var13, var6);
                  var12++;
                  continue L2;
                } else {
                  hl.field_q[var12].a(112, var8, var7, var13, var6);
                  gh.field_d[var12].a(126, -param1 + var9, var7, 0, param1);
                  w.field_C[var12].a(78, param4, -param5 + var7 - param5, param5, var9);
                  mg.field_M[var12].a(param0 ^ 91, -param1 + (var8 - var10), -param5 + -param5 + var7, param5, var10);
                  var12++;
                  continue L2;
                }
              } else {
                return;
              }
            }
          }
        } else {
          L4: {
            lq.field_a.a(false, mg.field_R.field_wb, mg.field_R.field_N, mg.field_R.field_db, mg.field_R.field_Fb);
            var8 = -param1 + (td.field_c.field_Fb - var6);
            var9 = var8 / 2;
            var10 = param4 + var9 + param1;
            var11 = 0;
            var12 = 0;
            if (param0 != 1) {
              break L4;
            } else {
              if (-7 < (var12 ^ -1)) {
                L5: {
                  L6: {
                    if (var12 >= 5) {
                      break L6;
                    } else {
                      if (hl.field_q[var12] == null) {
                        var12++;
                        break L5;
                      } else {
                        break L6;
                      }
                    }
                  }
                  L7: {
                    var13 = var11 * (td.field_c.field_db - 6 - -2) / (1 + sd.field_L) + 3;
                    var11++;
                    var7 = -var13 + (var11 * (td.field_c.field_db + -6 - -2) / (1 + sd.field_L) + 3) + -2;
                    if (-6 >= (var12 ^ -1)) {
                      ea.field_c.a(param0 + 95, var8, var7, var13, var6);
                      break L7;
                    } else {
                      hl.field_q[var12].a(112, var8, var7, var13, var6);
                      gh.field_d[var12].a(126, -param1 + var9, var7, 0, param1);
                      w.field_C[var12].a(78, param4, -param5 + var7 - param5, param5, var9);
                      mg.field_M[var12].a(param0 ^ 91, -param1 + (var8 - var10), -param5 + -param5 + var7, param5, var10);
                      var12++;
                      break L7;
                    }
                  }
                  var12++;
                  break L5;
                }
                var12++;
                var12++;
                var12++;
                var12++;
                if (-7 < (var12 ^ -1)) {
                  L8: {
                    L9: {
                      if (var12 >= 5) {
                        break L9;
                      } else {
                        if (hl.field_q[var12] == null) {
                          var12++;
                          break L8;
                        } else {
                          break L9;
                        }
                      }
                    }
                    L10: {
                      var13 = var11 * (td.field_c.field_db - 6 - -2) / (1 + sd.field_L) + 3;
                      var11++;
                      var7 = -var13 + (var11 * (td.field_c.field_db + -6 - -2) / (1 + sd.field_L) + 3) + -2;
                      if (-6 >= (var12 ^ -1)) {
                        ea.field_c.a(param0 + 95, var8, var7, var13, var6);
                        break L10;
                      } else {
                        hl.field_q[var12].a(112, var8, var7, var13, var6);
                        gh.field_d[var12].a(126, -param1 + var9, var7, 0, param1);
                        w.field_C[var12].a(78, param4, -param5 + var7 - param5, param5, var9);
                        mg.field_M[var12].a(param0 ^ 91, -param1 + (var8 - var10), -param5 + -param5 + var7, param5, var10);
                        var12++;
                        break L10;
                      }
                    }
                    var12++;
                    break L8;
                  }
                  var12++;
                  var12++;
                  var12++;
                  var12++;
                  if (-7 < (var12 ^ -1)) {
                    L11: {
                      L12: {
                        if (var12 >= 5) {
                          break L12;
                        } else {
                          if (hl.field_q[var12] == null) {
                            var12++;
                            break L11;
                          } else {
                            break L12;
                          }
                        }
                      }
                      L13: {
                        var13 = var11 * (td.field_c.field_db - 6 - -2) / (1 + sd.field_L) + 3;
                        var11++;
                        var7 = -var13 + (var11 * (td.field_c.field_db + -6 - -2) / (1 + sd.field_L) + 3) + -2;
                        if (-6 >= (var12 ^ -1)) {
                          ea.field_c.a(param0 + 95, var8, var7, var13, var6);
                          break L13;
                        } else {
                          hl.field_q[var12].a(112, var8, var7, var13, var6);
                          gh.field_d[var12].a(126, -param1 + var9, var7, 0, param1);
                          w.field_C[var12].a(78, param4, -param5 + var7 - param5, param5, var9);
                          mg.field_M[var12].a(param0 ^ 91, -param1 + (var8 - var10), -param5 + -param5 + var7, param5, var10);
                          var12++;
                          break L13;
                        }
                      }
                      var12++;
                      break L11;
                    }
                    var12++;
                    var12++;
                    break L4;
                  } else {
                    return;
                  }
                } else {
                  return;
                }
              } else {
                return;
              }
            }
          }
          field_s = null;
          if (-7 < (var12 ^ -1)) {
            L14: {
              L15: {
                if (var12 >= 5) {
                  break L15;
                } else {
                  if (hl.field_q[var12] == null) {
                    var12++;
                    break L14;
                  } else {
                    break L15;
                  }
                }
              }
              L16: {
                var13 = var11 * (td.field_c.field_db - 6 - -2) / (1 + sd.field_L) + 3;
                var11++;
                var7 = -var13 + (var11 * (td.field_c.field_db + -6 - -2) / (1 + sd.field_L) + 3) + -2;
                if (-6 >= (var12 ^ -1)) {
                  ea.field_c.a(param0 + 95, var8, var7, var13, var6);
                  break L16;
                } else {
                  hl.field_q[var12].a(112, var8, var7, var13, var6);
                  gh.field_d[var12].a(126, -param1 + var9, var7, 0, param1);
                  w.field_C[var12].a(78, param4, -param5 + var7 - param5, param5, var9);
                  mg.field_M[var12].a(param0 ^ 91, -param1 + (var8 - var10), -param5 + -param5 + var7, param5, var10);
                  var12++;
                  break L16;
                }
              }
              var12++;
              break L14;
            }
            var12++;
            var12++;
            L17: while (true) {
              if (-7 < (var12 ^ -1)) {
                L18: {
                  if (var12 >= 5) {
                    break L18;
                  } else {
                    if (hl.field_q[var12] == null) {
                      var12++;
                      var12++;
                      continue L17;
                    } else {
                      break L18;
                    }
                  }
                }
                var13 = var11 * (td.field_c.field_db - 6 - -2) / (1 + sd.field_L) + 3;
                var11++;
                var7 = -var13 + (var11 * (td.field_c.field_db + -6 - -2) / (1 + sd.field_L) + 3) + -2;
                if (-6 >= (var12 ^ -1)) {
                  ea.field_c.a(param0 + 95, var8, var7, var13, var6);
                  var12++;
                  continue L17;
                } else {
                  hl.field_q[var12].a(112, var8, var7, var13, var6);
                  gh.field_d[var12].a(126, -param1 + var9, var7, 0, param1);
                  w.field_C[var12].a(78, param4, -param5 + var7 - param5, param5, var9);
                  mg.field_M[var12].a(param0 ^ 91, -param1 + (var8 - var10), -param5 + -param5 + var7, param5, var10);
                  var12++;
                  continue L17;
                }
              } else {
                return;
              }
            }
          } else {
            return;
          }
        }
    }

    public static void a(int param0) {
        field_s = null;
        field_t = null;
        if (param0 != 5) {
            return;
        }
        field_y = null;
        field_p = null;
        field_w = null;
    }

    final void a(int param0, int param1, int param2, int param3, int[] param4, int param5, int param6, int param7) {
        ((nn) this).field_u = param3;
        ((nn) this).field_q = param0;
        ((nn) this).field_r = param7;
        if (param5 != -550) {
          field_y = null;
          ((nn) this).field_x = param2;
          ((nn) this).field_v = param1;
          ((nn) this).field_o = param6;
          ((nn) this).field_n = param4;
          return;
        } else {
          ((nn) this).field_x = param2;
          ((nn) this).field_v = param1;
          ((nn) this).field_o = param6;
          ((nn) this).field_n = param4;
          return;
        }
    }

    final static lk a(int param0, java.awt.Component param1, boolean param2, int param3) {
        try {
            Class var4 = null;
            Throwable var4_ref = null;
            lk var5 = null;
            ma var5_ref = null;
            lk stackIn_3_0 = null;
            Throwable decompiledCaughtException = null;
            lk stackOut_2_0 = null;
            try {
              L0: {
                if (param2) {
                  break L0;
                } else {
                  nn.a(-77);
                  break L0;
                }
              }
              var4 = Class.forName("em");
              var5 = (lk) var4.newInstance();
              var5.a(param1, -3, param3, param0);
              stackOut_2_0 = (lk) var5;
              stackIn_3_0 = stackOut_2_0;
            } catch (java.lang.Throwable decompiledCaughtParameter) {
              decompiledCaughtException = decompiledCaughtParameter;
              return stackIn_3_0;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
        return null;
    }

    nn() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_t = new String[]{"£3.20", "€4.25", "US$ 5.00", "Can$ 4.95", "Aus$ 6.50", "Krn 29.95", "", "Rp 160", "Rng 17.95", "NZ$ 7.95", "SG$ 6.95", "Krn 44.95", "R$ 7,00"};
        field_w = new tj();
        field_p = "Next";
        field_s = new int[]{60, 60, 60, 90, 90, 90, 90, 90, 90, 105, 105, 60, 90, 90, 90, 105, 105, 90, 105, 105, 90, 90, 90, 120, 90, 105, 105, 90, 90, 90, 105, 105, 90, 90, 90, 90, 105, 105, 105, 90};
    }
}
