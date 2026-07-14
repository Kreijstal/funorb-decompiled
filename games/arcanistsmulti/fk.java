/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fk extends pg {
    static long field_k;
    static String field_i;
    kd field_m;
    static qb[] field_g;
    pg field_n;
    int field_l;
    static int[] field_h;
    static String field_j;

    public static void a(int param0) {
        if (param0 != -1333592895) {
            field_j = null;
        }
        field_i = null;
        field_j = null;
        field_g = null;
        field_h = null;
    }

    final static qb[] a(int param0, int param1, int param2) {
        if (param1 <= 27) {
            Object var4 = null;
            boolean discarded$0 = fk.a((nf) null, -111, (ll) null, 35, (byte) -40, (qb) null);
        }
        return ql.a(1, (byte) 127, param2, param0);
    }

    final static void d(int param0) {
        if (param0 != -11) {
            field_h = null;
        }
        if ((fj.field_j ^ -1) != -11) {
            // ifeq L37
        } else {
            pa.b((byte) 108);
            fj.field_j = 11;
        }
        ii.field_f = true;
    }

    final static boolean a(nf param0, int param1, ll param2, int param3, byte param4, qb param5) {
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
        int[] var18 = null;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int[] var23 = null;
        int[] var25 = null;
        int[] var27 = null;
        byte[] var28 = null;
        int[] var29 = null;
        int stackIn_13_0 = 0;
        int stackIn_19_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_17_0 = 0;
        L0: {
          var21 = ArcanistsMulti.field_G ? 1 : 0;
          param3 = param3 + param5.field_x;
          param1 = param1 + param5.field_o;
          ce.field_k = 0;
          var6 = 0;
          di.field_m = 0;
          jo.field_b = false;
          if (param4 == -1) {
            break L0;
          } else {
            field_k = -23L;
            break L0;
          }
        }
        L1: {
          var7 = param5.field_q;
          var8 = param5.field_y;
          if (param3 >= param0.field_y) {
            break L1;
          } else {
            if (-var7 >= param3) {
              break L1;
            } else {
              if (param1 >= param0.field_H) {
                return false;
              } else {
                if (-var8 < param1) {
                  L2: {
                    if (0 < param3) {
                      stackOut_12_0 = param3;
                      stackIn_13_0 = stackOut_12_0;
                      break L2;
                    } else {
                      stackOut_11_0 = 0;
                      stackIn_13_0 = stackOut_11_0;
                      break L2;
                    }
                  }
                  L3: {
                    var9 = stackIn_13_0;
                    var10 = param3 - -var7;
                    if (param0.field_y < var10) {
                      var10 = param0.field_y;
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  L4: {
                    if (-1 <= (param1 ^ -1)) {
                      stackOut_18_0 = 0;
                      stackIn_19_0 = stackOut_18_0;
                      break L4;
                    } else {
                      stackOut_17_0 = param1;
                      stackIn_19_0 = stackOut_17_0;
                      break L4;
                    }
                  }
                  L5: {
                    var11 = stackIn_19_0;
                    var12 = param1 - -var8;
                    if (param0.field_y < var12) {
                      var12 = param0.field_y;
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  L6: {
                    var10 = var10 - var9;
                    var12 = var12 - var11;
                    if ((var12 & 1) > 0) {
                      var12--;
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                  L7: {
                    if ((1 & var10 ^ -1) < -1) {
                      var10--;
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                  var13 = (var9 >> -1333592895) + (var11 >> 177499585) * param0.field_hb;
                  var14 = param0.field_hb + -(var10 >> -1735026623);
                  var15 = (-param1 + var11) * param5.field_q + -param3 + var9;
                  var16 = var7 + -var10;
                  var16 = var16 + var7;
                  var28 = param2.field_m;
                  var29 = param5.field_A;
                  var27 = var29;
                  var25 = var27;
                  var23 = var25;
                  var18 = var23;
                  var19 = var12;
                  L8: while (true) {
                    if (-1 <= var19) {
                      if ((var6 ^ -1) < -1) {
                        di.field_m = di.field_m / var6;
                        ce.field_k = ce.field_k / var6;
                        return true;
                      } else {
                        return false;
                      }
                    } else {
                      var20 = var10;
                      L9: while (true) {
                        if (var20 <= 0) {
                          var13 = var13 + var14;
                          var15 = var15 + var16;
                          if (var13 >= param2.field_m.length) {
                            return false;
                          } else {
                            var19 -= 2;
                            continue L8;
                          }
                        } else {
                          if (-1 != var28[var13]) {
                            L10: {
                              if (var29[var15] == 0) {
                                break L10;
                              } else {
                                ce.field_k = ce.field_k + (var12 + (var11 + -var19));
                                di.field_m = di.field_m + (-var20 + (var10 + var9));
                                var6++;
                                if (-1 == var28[var13]) {
                                  jo.field_b = true;
                                  break L10;
                                } else {
                                  break L10;
                                }
                              }
                            }
                            L11: {
                              if (var18[var15 - -1] != 0) {
                                L12: {
                                  ce.field_k = ce.field_k + (-var19 + var11 - -var12);
                                  di.field_m = di.field_m + (-var20 + (var9 - -var10 + 1));
                                  if ((var28[var13] ^ -1) == 0) {
                                    jo.field_b = true;
                                    break L12;
                                  } else {
                                    break L12;
                                  }
                                }
                                var6++;
                                break L11;
                              } else {
                                break L11;
                              }
                            }
                            L13: {
                              if (0 != var18[var15 + var7]) {
                                ce.field_k = ce.field_k + (1 + -var19 + (var12 + var11));
                                di.field_m = di.field_m + (-var20 + var10 + var9);
                                var6++;
                                if (var28[var13] == -1) {
                                  jo.field_b = true;
                                  break L13;
                                } else {
                                  break L13;
                                }
                              } else {
                                break L13;
                              }
                            }
                            if (-1 != (var18[1 + (var15 + var7)] ^ -1)) {
                              di.field_m = di.field_m + (-var20 + (var10 + (var9 - -1)));
                              ce.field_k = ce.field_k + (1 + (-var19 + (var12 + var11)));
                              var6++;
                              if (-1 == var28[var13]) {
                                jo.field_b = true;
                                var13++;
                                var15 += 2;
                                var20 -= 2;
                                continue L9;
                              } else {
                                var13++;
                                var15 += 2;
                                var20 -= 2;
                                continue L9;
                              }
                            } else {
                              var13++;
                              var15 += 2;
                              var20 -= 2;
                              continue L9;
                            }
                          } else {
                            var13++;
                            var15 += 2;
                            var20 -= 2;
                            continue L9;
                          }
                        }
                      }
                    }
                  }
                } else {
                  return false;
                }
              }
            }
          }
        }
        return false;
    }

    final static ll[] c(int param0) {
        int var2 = 0;
        int var3 = ArcanistsMulti.field_G ? 1 : 0;
        ll[] var1 = new ll[h.field_J];
        for (var2 = param0; h.field_J > var2; var2++) {
            var1[var2] = new ll(pb.field_g, gn.field_a, hl.field_l[var2], be.field_d[var2], jg.field_p[var2], ho.field_i[var2], ln.field_I[var2], ph.field_c);
        }
        dk.a(-18229);
        return var1;
    }

    final static void a(qb param0, int param1) {
        if (param1 != -23095) {
            Object var3 = null;
            fk.a((qb) null, -12);
        }
        ec.a(65280);
        de.a(param0.field_A, param0.field_n, param0.field_w);
    }

    final static void a(byte param0) {
        int var2 = 0;
        int[] var3 = null;
        int[] var4 = null;
        ab var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int[] var9 = null;
        int[] var10 = null;
        cm var11 = null;
        fe var12 = null;
        ab var13 = null;
        fe var14 = null;
        var8 = ArcanistsMulti.field_G ? 1 : 0;
        if (param0 == -20) {
          L0: {
            var13 = df.field_z;
            var2 = var13.e((byte) 54);
            if (var2 == 0) {
              var10 = la.b((byte) 12);
              var3 = var10;
              var9 = var10;
              var4 = var9;
              var5 = var13;
              var6 = ((wk) (Object) var5).e((byte) -100);
              var7 = 0;
              L1: while (true) {
                if (var7 >= var6) {
                  var12 = (fe) (Object) i.field_e.b(param0 ^ -12637);
                  if (var12 != null) {
                    var12.field_l = true;
                    var12.field_i = var3;
                    var12.a(true);
                    break L0;
                  } else {
                    ka.b(false);
                    return;
                  }
                } else {
                  var9[var7] = ((wk) (Object) var5).d(-10674);
                  var7++;
                  continue L1;
                }
              }
            } else {
              if (-2 == (var2 ^ -1)) {
                var11 = (cm) (Object) cc.field_e.b(12623);
                if (var11 == null) {
                  ka.b(false);
                  return;
                } else {
                  var11.a(true);
                  break L0;
                }
              } else {
                if (var2 != 2) {
                  jh.a((Throwable) null, "A1: " + nn.g((byte) -25), (byte) 20);
                  ka.b(false);
                  break L0;
                } else {
                  var14 = (fe) (Object) i.field_e.b(12623);
                  if (var14 != null) {
                    var14.field_i = la.b((byte) 12);
                    var14.field_l = true;
                    var14.a(true);
                    break L0;
                  } else {
                    ka.b(false);
                    return;
                  }
                }
              }
            }
          }
          return;
        } else {
          return;
        }
    }

    final static void a(java.applet.Applet param0, boolean param1, String param2) {
        try {
            java.net.URL var3 = null;
            Exception var3_ref = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        try {
                            var3 = new java.net.URL(param0.getCodeBase(), param2);
                            var3 = nm.a(param0, var3, -31843);
                            jh.a(var3.toString(), param0, true, (byte) -109);
                            if (!param1) {
                                statePc = 4;
                            } else {
                                statePc = 1;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_0) {
                            caughtException = stateCaught_0;
                            statePc = 3;
                            continue stateLoop;
                        }
                    }
                    case 1: {
                        try {
                            field_i = null;
                            statePc = 4;
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 3;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        var3_ref = (Exception) (Object) caughtException;
                        var3_ref.printStackTrace();
                        statePc = 4;
                        continue stateLoop;
                    }
                    case 4: {
                        return;
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

    final static void a(int param0, String param1) {
        int var2 = an.field_g;
        int var3 = me.field_I;
        int var4 = pg.field_c.field_Z.a(param1, 500);
        int var5 = 6 + pg.field_c.field_Z.c(param1, 500);
        int var6 = 2 + var4 * ga.field_r;
        int var7 = ih.a(var2, var5, 12, 246);
        int var8 = ql.a(param0 + 10, 20, var6, var3);
        de.a(var7, var8, var5, var6, 0);
        de.d(var7 - -1, 1 + var8, -2 + var5, -2 + var6, 16777088);
        int discarded$0 = pg.field_c.field_Z.a(param1, var7 + 3, 1 + (var8 - -oc.field_i - pg.field_c.field_Z.field_C), 500, 1000, 0, -1, param0, 0, ga.field_r);
    }

    fk(kd param0, pg param1) {
        ((fk) this).field_m = param0;
        ((fk) this).field_l = param0.f();
        ((fk) this).field_n = param1;
        ((fk) this).field_m.c(si.field_l * ((fk) this).field_l + 128 >> 2038587784);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = "Down at the bottom-right of the screen you will see the map. You can use this to scan for your enemies and get a general feel of the arena. Click on it to move the view quickly.";
        field_h = new int[]{58, 59, 60};
        field_j = "Change display name";
    }
}
