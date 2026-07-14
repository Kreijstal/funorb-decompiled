/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class js {
    static ld field_c;
    static int field_d;
    static int field_g;
    static gh field_i;
    static String field_h;
    static ke field_a;
    static sl field_f;
    static int field_j;
    static sq[] field_b;
    static int field_e;

    final static void a(int param0, int param1) {
        int var3 = ShatteredPlansClient.field_F ? 1 : 0;
        tf.field_p = param0;
        if (param1 != 197126152) {
            qr discarded$0 = js.b((byte) -92);
        }
        gm var2 = (gm) (Object) eo.field_ab.d(0);
        while (var2 != null) {
            if (var2.field_n.c(param1 + -197124104)) {
                var2.field_p.e(var2.field_h * tf.field_p - -128 >> 197126152);
            } else {
                var2.b((byte) -75);
            }
            var2 = (gm) (Object) eo.field_ab.a((byte) -71);
        }
        if (nc.field_v != null) {
            var2 = (gm) (Object) nc.field_v.d(0);
            while (var2 != null) {
                if (!var2.field_n.c(param1 + -197124104)) {
                    var2.b((byte) -69);
                } else {
                    var2.field_p.e(128 + tf.field_p * var2.field_h >> 1830650120);
                }
                var2 = (gm) (Object) nc.field_v.a((byte) -71);
            }
        }
    }

    final static int a(int param0, int param1, byte param2) {
        int var4 = ShatteredPlansClient.field_F ? 1 : 0;
        int var3 = 0;
        if (param2 < 3) {
            Object var5 = null;
            js.a(-8, 21, (fb) null, -124, 16, false, 64, -69);
        }
        while (-1 > (param1 ^ -1)) {
            var3 = var3 << -1078106911 | 1 & param0;
            param1--;
            param0 = param0 >>> 1;
        }
        return var3;
    }

    final static boolean a(int param0, java.applet.Applet param1) {
        try {
            int var2 = 0;
            String var3 = null;
            Throwable var3_ref = null;
            String var4 = null;
            String[] var5 = null;
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            int stackIn_7_0 = 0;
            int stackIn_14_0 = 0;
            int stackOut_6_0 = 0;
            int stackOut_12_0 = 0;
            int stackOut_13_0 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var8 = ShatteredPlansClient.field_F ? 1 : 0;
                        var2 = -84 / ((param0 - -5) / 55);
                        if (!sq.field_o) {
                            statePc = 2;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    }
                    case 1: {
                        return true;
                    }
                    case 2: {
                        try {
                            var3 = "tuhstatbut";
                            var4 = (String) ll.a("getcookies", param1, (byte) 127);
                            var5 = so.a(var4, ';', 116);
                            var6 = 0;
                            statePc = 3;
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 10;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            if (var5.length <= var6) {
                                statePc = 11;
                            } else {
                                statePc = 4;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 10;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            var7 = var5[var6].indexOf('=');
                            if (-1 < (var7 ^ -1)) {
                                statePc = 8;
                            } else {
                                statePc = 5;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 10;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            if (!var5[var6].substring(0, var7).trim().equals((Object) (Object) var3)) {
                                statePc = 8;
                            } else {
                                statePc = 6;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 10;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            stackOut_6_0 = 1;
                            stackIn_7_0 = stackOut_6_0;
                            statePc = 7;
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 10;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        return stackIn_7_0 != 0;
                    }
                    case 8: {
                        try {
                            var6++;
                            statePc = 3;
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 10;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        var3_ref = caughtException;
                        statePc = 11;
                        continue stateLoop;
                    }
                    case 11: {
                        if (param1.getParameter("tuhstatbut") == null) {
                            statePc = 13;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    }
                    case 12: {
                        stackOut_12_0 = 1;
                        stackIn_14_0 = stackOut_12_0;
                        statePc = 14;
                        continue stateLoop;
                    }
                    case 13: {
                        stackOut_13_0 = 0;
                        stackIn_14_0 = stackOut_13_0;
                        statePc = 14;
                        continue stateLoop;
                    }
                    case 14: {
                        return stackIn_14_0 != 0;
                    }
                    default: throw new IllegalStateException("invalid CFG state " + statePc);
                }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static qr b(byte param0) {
        if (param0 != 121) {
            return null;
        }
        return d.field_a.field_Eb;
    }

    final static int a(int param0, byte param1) {
        param0--;
        param0 = param0 | param0 >>> 1627333441;
        param0 = param0 | param0 >>> -1114969182;
        param0 = param0 | param0 >>> 1812676996;
        param0 = param0 | param0 >>> 1693466344;
        param0 = param0 | param0 >>> 1315717520;
        if (param1 != 122) {
            js.c((byte) -124);
        }
        return param0 + 1;
    }

    public static void c(byte param0) {
        field_a = null;
        field_h = null;
        field_c = null;
        if (param0 <= 58) {
            return;
        }
        field_f = null;
        field_b = null;
        field_i = null;
    }

    final static void a(int param0, int param1, fb param2, int param3, int param4, boolean param5, int param6, int param7) {
        int var8 = 0;
        sg[] var8_ref_sg__ = null;
        int var9 = 0;
        int[] var10 = null;
        int var10_int = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        sg var13_ref_sg = null;
        int var14 = 0;
        int var15 = 0;
        sg[] var16 = null;
        sg[] var17 = null;
        int[] var18 = null;
        int[] var19 = null;
        int[] var20 = null;
        int[] var21 = null;
        sg[][] stackIn_4_0 = null;
        sg[][] stackIn_5_0 = null;
        sg[][] stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        int stackIn_24_0 = 0;
        int stackIn_47_0 = 0;
        sg[][] stackOut_3_0 = null;
        sg[][] stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        sg[][] stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        int stackOut_23_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_46_0 = 0;
        int stackOut_45_0 = 0;
        L0: {
          var15 = ShatteredPlansClient.field_F ? 1 : 0;
          if (param1 == 1) {
            break L0;
          } else {
            js.a(106, 32);
            break L0;
          }
        }
        L1: {
          if (param3 <= param0) {
            var8 = 1;
            var9 = 0;
            L2: while (true) {
              if (pe.field_D.length <= var9) {
                if (var8 == 0) {
                  break L1;
                } else {
                  wg.field_d = true;
                  break L1;
                }
              } else {
                var21 = pe.field_D[var9];
                var20 = var21;
                var19 = var20;
                var18 = var19;
                var10 = var18;
                var11 = 0;
                var12 = 0;
                L3: while (true) {
                  if (var12 >= var21.length) {
                    L4: {
                      if (var11 != 0) {
                        break L4;
                      } else {
                        if (em.field_k == param0) {
                          break L4;
                        } else {
                          var9++;
                          continue L2;
                        }
                      }
                    }
                    var12 = 0;
                    L5: while (true) {
                      if (var21.length <= var12) {
                        var8 = 0;
                        var9++;
                        continue L2;
                      } else {
                        var13 = var21[var12];
                        if (0 == (var13 ^ -1)) {
                          qd.field_h = true;
                          var12 += 2;
                          continue L5;
                        } else {
                          if (var13 < param0) {
                            ek.field_F[var13] = true;
                            var12 += 2;
                            continue L5;
                          } else {
                            var12 += 2;
                            continue L5;
                          }
                        }
                      }
                    }
                  } else {
                    var13 = var21[var12];
                    var14 = var10[1 + var12];
                    if (var13 != -1) {
                      L6: {
                        if (var13 != param0) {
                          break L6;
                        } else {
                          if (param6 == var14) {
                            var11 = 1;
                            var12 += 2;
                            continue L3;
                          } else {
                            break L6;
                          }
                        }
                      }
                      if (param0 > var13) {
                        if ((lr.field_c[var13] & 255) != var14) {
                          var9++;
                          continue L2;
                        } else {
                          var12 += 2;
                          continue L3;
                        }
                      } else {
                        var9++;
                        continue L2;
                      }
                    } else {
                      if (nl.field_a[param7] == var14) {
                        var12 += 2;
                        continue L3;
                      } else {
                        var9++;
                        continue L2;
                      }
                    }
                  }
                }
              }
            }
          } else {
            L7: {
              stackOut_3_0 = fk.field_p;
              stackIn_5_0 = stackOut_3_0;
              stackIn_4_0 = stackOut_3_0;
              if (-1 == param0) {
                stackOut_5_0 = (sg[][]) (Object) stackIn_5_0;
                stackOut_5_1 = 1;
                stackIn_6_0 = stackOut_5_0;
                stackIn_6_1 = stackOut_5_1;
                break L7;
              } else {
                stackOut_4_0 = (sg[][]) (Object) stackIn_4_0;
                stackOut_4_1 = 4 - -param0;
                stackIn_6_0 = stackOut_4_0;
                stackIn_6_1 = stackOut_4_1;
                break L7;
              }
            }
            L8: {
              var16 = stackIn_6_0[stackIn_6_1];
              var17 = var16;
              var8_ref_sg__ = var17;
              var9 = 1;
              if (!param5) {
                break L8;
              } else {
                if (-1 != param0) {
                  var16 = var17;
                  var10_int = 0;
                  L9: while (true) {
                    L10: {
                      if (var16.length + -1 <= var10_int) {
                        break L10;
                      } else {
                        if ((qj.field_f[(var10_int + param4) / 8] & 1 << (7 & param4 - -var10_int)) == 0) {
                          var10_int++;
                          continue L9;
                        } else {
                          var9 = 0;
                          break L10;
                        }
                      }
                    }
                    param4 = param4 + (ks.field_e[param0] & 255);
                    break L8;
                  }
                } else {
                  var10_int = 0;
                  L11: while (true) {
                    if (nl.field_a.length <= var10_int) {
                      break L8;
                    } else {
                      if ((id.field_c[var10_int / 8] & 1 << (var10_int & 7)) != 0) {
                        var9 = 0;
                        break L8;
                      } else {
                        var10_int++;
                        continue L11;
                      }
                    }
                  }
                }
              }
            }
            var10_int = 0;
            var11 = 0;
            L12: while (true) {
              L13: {
                if (-1 != param0) {
                  stackOut_23_0 = var17.length + -1;
                  stackIn_24_0 = stackOut_23_0;
                  break L13;
                } else {
                  stackOut_22_0 = nl.field_a.length;
                  stackIn_24_0 = stackOut_22_0;
                  break L13;
                }
              }
              if ((stackIn_24_0 ^ -1) >= (var11 ^ -1)) {
                if (var10_int == 0) {
                  var11 = 0;
                  L14: while (true) {
                    if (var11 >= var17.length - 1) {
                      break L1;
                    } else {
                      L15: {
                        if (param0 == -1) {
                          param7 = var11;
                          break L15;
                        } else {
                          lr.field_c[param0] = (byte)var11;
                          break L15;
                        }
                      }
                      js.a(param0 - -1, param1 ^ 0, param2, param3, param4, param5, param6, param7);
                      if (wg.field_d) {
                        return;
                      } else {
                        var11++;
                        continue L14;
                      }
                    }
                  }
                } else {
                  break L1;
                }
              } else {
                L16: {
                  if (param0 != -1) {
                    lr.field_c[param0] = (byte)var11;
                    break L16;
                  } else {
                    param7 = var11;
                    break L16;
                  }
                }
                L17: {
                  L18: {
                    if (param0 != 0) {
                      break L18;
                    } else {
                      if (-2 == nl.field_a.length) {
                        var12 = 1;
                        break L17;
                      } else {
                        break L18;
                      }
                    }
                  }
                  var13_ref_sg = var8_ref_sg__[1 + var11];
                  if (!param5) {
                    if (0 == (param0 ^ -1)) {
                      L19: {
                        if (nl.field_a[var11] != np.field_a.field_Eb) {
                          stackOut_46_0 = 0;
                          stackIn_47_0 = stackOut_46_0;
                          break L19;
                        } else {
                          stackOut_45_0 = 1;
                          stackIn_47_0 = stackOut_45_0;
                          break L19;
                        }
                      }
                      var12 = stackIn_47_0;
                      break L17;
                    } else {
                      if ((255 & np.field_a.field_dc[param0]) != var11) {
                        var12 = 0;
                        break L17;
                      } else {
                        var12 = 1;
                        break L17;
                      }
                    }
                  } else {
                    if (!var13_ref_sg.field_bb) {
                      if (var9 != 0) {
                        if (var13_ref_sg.field_s) {
                          var12 = 1;
                          break L17;
                        } else {
                          var12 = 0;
                          break L17;
                        }
                      } else {
                        var12 = 0;
                        break L17;
                      }
                    } else {
                      var12 = 1;
                      break L17;
                    }
                  }
                }
                L20: {
                  if (var12 != 0) {
                    js.a(1 + param0, 1, param2, param3, param4, param5, param6, param7);
                    var10_int = 1;
                    break L20;
                  } else {
                    break L20;
                  }
                }
                if (!wg.field_d) {
                  var11++;
                  continue L12;
                } else {
                  return;
                }
              }
            }
          }
        }
    }

    final static void a(byte param0) {
        String[] var5 = null;
        int var2 = 0;
        String var3 = null;
        int var4 = ShatteredPlansClient.field_F ? 1 : 0;
        be.field_h = oi.field_a;
        kp.field_j = jb.field_d;
        ph.field_g = false;
        er.field_g = false;
        pc.field_q = tp.field_b;
        ol.field_g = hm.field_q;
        jc.field_r = fe.field_B;
        me.field_j = false;
        td.field_L = false;
        se.field_k = false;
        if (param0 != -10) {
            js.a((byte) 43);
        }
        tl.field_u = false;
        ej.field_m = 0;
        if (null != ol.field_g.field_m) {
            var5 = ol.field_g.field_m;
            String[] var1 = var5;
            for (var2 = 0; var2 < var5.length; var2++) {
                var3 = var5[var2];
                kq.b(var3, param0 ^ -15);
            }
        }
        if (ol.field_g.field_h) {
            ge.field_i = 0;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = null;
        field_d = 0;
        field_h = "Please select an option in the '<%0>' row.";
    }
}
