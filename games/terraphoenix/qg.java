/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qg {
    static int field_a;

    final static byte[] a(int param0, byte[] param1) {
        int var3 = 0;
        int var4 = 0;
        int var5_int = 0;
        byte[] var5 = null;
        byte[] var6 = null;
        Object var7 = null;
        Throwable var8 = null;
        dh var9 = null;
        byte[] var10 = null;
        byte[] var11 = null;
        byte[] var12 = null;
        byte[] var13 = null;
        byte[] var14 = null;
        byte[] var15 = null;
        byte[] var16 = null;
        byte[] var17 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var9 = new dh(param1);
                    var3 = var9.a(-16384);
                    var4 = var9.f((byte) -107);
                    if (0 > var4) {
                        statePc = 4;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    if (-1 == (eg.field_h ^ -1)) {
                        statePc = 5;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    if (var4 <= eg.field_h) {
                        statePc = 5;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    throw new RuntimeException();
                }
                case 5: {
                    if (var3 == param0) {
                        statePc = 19;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    var5_int = var9.f((byte) -107);
                    if (-1 > var5_int) {
                        statePc = 10;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    if (eg.field_h == 0) {
                        statePc = 11;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    if (eg.field_h >= var5_int) {
                        statePc = 11;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    throw new RuntimeException();
                }
                case 11: {
                    var16 = new byte[var5_int];
                    var14 = var16;
                    var12 = var14;
                    var10 = var12;
                    var6 = var10;
                    if (var3 != 1) {
                        statePc = 13;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    int discarded$4 = ih.a(var16, var5_int, param1, var4, 9);
                    statePc = 18;
                    continue stateLoop;
                }
                case 13: {
                    var7 = (Object) (Object) wj.field_c;
                    // monitorenter wj.field_c
                    statePc = 14;
                    continue stateLoop;
                }
                case 14: {
                    try {
                        wj.field_c.a(var9, 10, var16);
                        // monitorexit var7
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        var8 = caughtException;
                        // monitorexit var7
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 17: {
                    throw (RuntimeException) (Object) var8;
                }
                case 18: {
                    return var6;
                }
                case 19: {
                    var17 = new byte[var4];
                    var15 = var17;
                    var13 = var15;
                    var11 = var13;
                    var5 = var11;
                    var9.a(var4, 0, 93, var17);
                    return var5;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final synchronized static byte[] a(int param0, int param1) {
        byte[] var2_ref_byte__ = null;
        int var2 = 0;
        byte[] var3 = null;
        L0: {
          if ((param1 ^ -1) != -101) {
            break L0;
          } else {
            if (0 >= nl.field_b) {
              break L0;
            } else {
              nl.field_b = nl.field_b - 1;
              var2_ref_byte__ = il.field_b[nl.field_b - 1];
              il.field_b[nl.field_b] = null;
              return var2_ref_byte__;
            }
          }
        }
        L1: {
          if (-5001 != (param1 ^ -1)) {
            break L1;
          } else {
            if ((mg.field_o ^ -1) >= -1) {
              break L1;
            } else {
              mg.field_o = mg.field_o - 1;
              var2_ref_byte__ = na.field_Z[mg.field_o - 1];
              na.field_Z[mg.field_o] = null;
              return var2_ref_byte__;
            }
          }
        }
        L2: {
          if (param1 != 30000) {
            break L2;
          } else {
            if (g.field_cb > 0) {
              g.field_cb = g.field_cb - 1;
              var2_ref_byte__ = dg.field_e[g.field_cb - 1];
              dg.field_e[g.field_cb] = null;
              return var2_ref_byte__;
            } else {
              break L2;
            }
          }
        }
        L3: {
          if (null != ol.field_Kb) {
            var2 = 0;
            L4: while (true) {
              if (tc.field_c.length <= var2) {
                break L3;
              } else {
                if (param1 == tc.field_c[var2]) {
                  if (ba.field_g[var2] > 0) {
                    ba.field_g[var2] = ba.field_g[var2] - 1;
                    var3 = ol.field_Kb[var2][ba.field_g[var2] - 1];
                    ol.field_Kb[var2][ba.field_g[var2]] = null;
                    return var3;
                  } else {
                    var2++;
                    continue L4;
                  }
                } else {
                  var2++;
                  continue L4;
                }
              }
            }
          } else {
            break L3;
          }
        }
        L5: {
          if (param0 > 19) {
            break L5;
          } else {
            field_a = -93;
            break L5;
          }
        }
        return new byte[param1];
    }

    final static ud a(byte param0, fa param1, String param2, fa param3, String param4) {
        int var5 = param3.c(-1, param2);
        if (param0 != 94) {
            byte[] discarded$0 = qg.a(83, -23);
        }
        int var6 = param3.a(-128, var5, param4);
        return wl.a(param1, var5, param3, var6, -121);
    }

    final static void a(ci param0, int param1, byte param2, int param3, int param4, int param5) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        L0: {
          var19 = Terraphoenix.field_V;
          param5 = param5 + param4;
          param1 = param1 + param0.field_p;
          param4 = param4 - (-15 + param0.field_u);
          param4 = param4 + param0.field_v;
          var6 = param1 - -(l.field_k * param4);
          var7 = 0;
          var8 = param1;
          var9 = param4;
          var10 = param0.field_t;
          var11 = param0.field_r;
          var12 = -var11 + l.field_k;
          if (param4 >= l.field_d) {
            break L0;
          } else {
            var14 = l.field_d + -param4;
            var10 = var10 - var14;
            var7 = var7 + var14 * var11;
            var6 = var6 + l.field_k * var14;
            param4 = l.field_d;
            var9 = var9 + var14;
            break L0;
          }
        }
        L1: {
          var13 = 0;
          if (param1 < l.field_b) {
            var14 = -param1 + l.field_b;
            var6 = var6 + var14;
            var12 = var12 + var14;
            param1 = l.field_b;
            var13 = var13 + var14;
            var8 = var8 + var14;
            var7 = var7 + var14;
            var11 = var11 - var14;
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          if (param4 + var10 > l.field_c) {
            var10 = var10 - (-l.field_c + (param4 - -var10));
            break L2;
          } else {
            break L2;
          }
        }
        L3: {
          if (var11 + param1 > l.field_f) {
            var14 = -l.field_f + var11 + param1;
            var13 = var13 + var14;
            var12 = var12 + var14;
            var11 = var11 - var14;
            break L3;
          } else {
            break L3;
          }
        }
        L4: {
          if (param2 == 0) {
            break L4;
          } else {
            byte[] discarded$1 = qg.a(113, 32);
            break L4;
          }
        }
        L5: {
          if ((var11 ^ -1) >= -1) {
            break L5;
          } else {
            if (var10 <= 0) {
              break L5;
            } else {
              var14 = var8;
              var16 = -(var11 >> 2071108034);
              var11 = -(var11 & 3);
              var17 = -var10;
              L6: while (true) {
                if (var17 <= -1) {
                  return;
                } else {
                  var18 = var16;
                  L7: while (true) {
                    if (0 <= var18) {
                      var8 = var14;
                      var18 = var11;
                      L8: while (true) {
                        if (var18 >= 0) {
                          L9: {
                            var9++;
                            if (param0.field_t + (param4 - 15) <= var9) {
                              param5++;
                              break L9;
                            } else {
                              break L9;
                            }
                          }
                          var7 = var7 + var13;
                          var6 = var6 + var12;
                          var17++;
                          continue L6;
                        } else {
                          var7++;
                          var15 = param0.field_z[var7];
                          if (0 == var15) {
                            var6++;
                            var18++;
                            continue L8;
                          } else {
                            var6++;
                            pj.a((byte) 106, true, param3, var15, var6);
                            var18++;
                            continue L8;
                          }
                        }
                      }
                    } else {
                      L10: {
                        L11: {
                          var7++;
                          var15 = param0.field_z[var7];
                          if (-1 == var15) {
                            break L11;
                          } else {
                            if (gd.field_a[var8][var9] > param5) {
                              break L11;
                            } else {
                              var8++;
                              gd.field_a[var8][var9] = param5;
                              var6++;
                              pj.a((byte) 95, true, param3, var15, var6);
                              break L10;
                            }
                          }
                        }
                        var8++;
                        var6++;
                        break L10;
                      }
                      L12: {
                        L13: {
                          var7++;
                          var15 = param0.field_z[var7];
                          if (-1 == (var15 ^ -1)) {
                            break L13;
                          } else {
                            if (param5 < gd.field_a[var8][var9]) {
                              break L13;
                            } else {
                              var8++;
                              gd.field_a[var8][var9] = param5;
                              var6++;
                              pj.a((byte) 57, true, param3, var15, var6);
                              break L12;
                            }
                          }
                        }
                        var8++;
                        var6++;
                        break L12;
                      }
                      L14: {
                        L15: {
                          var7++;
                          var15 = param0.field_z[var7];
                          if (-1 == (var15 ^ -1)) {
                            break L15;
                          } else {
                            if (param5 >= gd.field_a[var8][var9]) {
                              var8++;
                              gd.field_a[var8][var9] = param5;
                              var6++;
                              pj.a((byte) 50, true, param3, var15, var6);
                              break L14;
                            } else {
                              break L15;
                            }
                          }
                        }
                        var8++;
                        var6++;
                        break L14;
                      }
                      var7++;
                      var15 = param0.field_z[var7];
                      if (0 != var15) {
                        if (param5 >= gd.field_a[var8][var9]) {
                          var8++;
                          gd.field_a[var8][var9] = param5;
                          var6++;
                          pj.a((byte) 40, true, param3, var15, var6);
                          var18++;
                          continue L7;
                        } else {
                          var6++;
                          var8++;
                          var18++;
                          continue L7;
                        }
                      } else {
                        var6++;
                        var8++;
                        var18++;
                        continue L7;
                      }
                    }
                  }
                }
              }
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = 0;
    }
}
