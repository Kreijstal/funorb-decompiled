/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cb {
    static String field_d;
    static int[][] field_c;
    static int[] field_e;
    static int field_g;
    static boolean[][][] field_b;
    static String field_a;
    static ka field_f;

    final static void a(int param0) {
        Object var1 = null;
        Throwable var2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var1 = (Object) (Object) te.field_b;
                    // monitorenter te.field_b
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        sj.field_L = sj.field_L + 1;
                        wh.field_e = jc.field_h;
                        kc.field_u = bj.field_c;
                        ph.field_d = qb.field_g;
                        ek.field_P = ua.field_c;
                        ua.field_c = false;
                        vb.field_n = e.field_o;
                        ik.field_a = aa.field_a;
                        if (param0 == 30210) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 5;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        cb.a(71, 118, (byte) -25, 29);
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 5;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        ci.field_m = ll.field_g;
                        e.field_o = 0;
                        // monitorexit var1
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 5;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var2 = caughtException;
                        // monitorexit var1
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 5;
                        continue stateLoop;
                    }
                }
                case 6: {
                    throw (RuntimeException) (Object) var2;
                }
                case 7: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void b(int param0) {
        field_c = null;
        field_b = null;
        field_e = null;
        if (param0 != -9386) {
          return;
        } else {
          field_f = null;
          field_a = null;
          field_d = null;
          return;
        }
    }

    final static void a(int param0, int param1, byte param2, int param3) {
        Object var4 = null;
        qe var4_ref = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        qe var10 = null;
        qe var13 = null;
        qe var14 = null;
        qe var15 = null;
        qe var16 = null;
        qe var17 = null;
        qe var21 = null;
        qe var22 = null;
        qe var38 = null;
        qe var39 = null;
        qe var40 = null;
        qe var41 = null;
        qe var42 = null;
        var8 = TorChallenge.field_F ? 1 : 0;
        var4 = null;
        var5 = -1;
        if (ea.field_g.length > lh.field_s) {
          L0: {
            if ((lh.field_s ^ -1) >= -1) {
              break L0;
            } else {
              var4_ref = ea.field_g[lh.field_s];
              break L0;
            }
          }
          if (param2 > 87) {
            L1: {
              if (var4_ref == null) {
                break L1;
              } else {
                var5 = ue.a(var4_ref.field_o, param3, var4_ref.field_H, param1, (byte) 79);
                break L1;
              }
            }
            var7 = 0;
            L2: while (true) {
              if (ea.field_g.length <= var7) {
                if (lh.field_s >= 0) {
                  if (hc.field_Q) {
                    if (hc.field_Q) {
                      if (ea.field_g.length > lh.field_s) {
                        var42 = ea.field_g[lh.field_s];
                        if (var42 == null) {
                          sd.a(122);
                          return;
                        } else {
                          if ((var42.field_F ^ -1) == -5) {
                            L3: {
                              dg.a(var42.field_o, dg.field_T[var42.field_F], var42.field_V, 1, param0, var42.field_y, var42.field_H, param1, (byte) -72, param3);
                              if (nj.field_g != 0) {
                                break L3;
                              } else {
                                sd.a(121);
                                break L3;
                              }
                            }
                            return;
                          } else {
                            sd.a(122);
                            return;
                          }
                        }
                      } else {
                        sd.a(123);
                        return;
                      }
                    } else {
                      return;
                    }
                  } else {
                    if (ea.field_g.length > lh.field_s) {
                      var41 = ea.field_g[lh.field_s];
                      var40 = var41;
                      if (var40 == null) {
                        sd.a(122);
                        return;
                      } else {
                        if ((var40.field_F ^ -1) == -5) {
                          uc.a(var40.field_y, var40.field_o, var40.field_H, param1, 1, var40.field_V, param3, dg.field_T[var41.field_F], true, param0);
                          return;
                        } else {
                          sd.a(122);
                          return;
                        }
                      }
                    } else {
                      sd.a(121);
                      return;
                    }
                  }
                } else {
                  sd.a(126);
                  return;
                }
              } else {
                if (null != ea.field_g[var7]) {
                  var39 = ea.field_g[var7];
                  if (4 == var39.field_F) {
                    var6 = ue.a(var39.field_o, param3, var39.field_H, param1, (byte) 79);
                    if (-1 >= (var6 ^ -1)) {
                      if (var5 > var6) {
                        if (0 < var5) {
                          var5 = var6;
                          lh.field_s = var39.field_y;
                          var7++;
                          continue L2;
                        } else {
                          var7++;
                          continue L2;
                        }
                      } else {
                        var7++;
                        continue L2;
                      }
                    } else {
                      var7++;
                      continue L2;
                    }
                  } else {
                    var7++;
                    continue L2;
                  }
                } else {
                  var7++;
                  continue L2;
                }
              }
            }
          } else {
            L4: {
              field_f = null;
              if (var4_ref == null) {
                break L4;
              } else {
                var5 = ue.a(var4_ref.field_o, param3, var4_ref.field_H, param1, (byte) 79);
                break L4;
              }
            }
            L5: {
              var7 = 0;
              if (ea.field_g.length <= var7) {
                break L5;
              } else {
                L6: {
                  L7: {
                    L8: {
                      L9: {
                        L10: {
                          if (null == ea.field_g[var7]) {
                            var7++;
                            break L10;
                          } else {
                            var17 = ea.field_g[var7];
                            var10 = var17;
                            if (4 == var17.field_F) {
                              var6 = ue.a(var17.field_o, param3, var17.field_H, param1, (byte) 79);
                              if (-1 < (var6 ^ -1)) {
                                break L9;
                              } else {
                                if (var5 <= var6) {
                                  break L8;
                                } else {
                                  if (0 < var5) {
                                    var5 = var6;
                                    lh.field_s = var17.field_y;
                                    break L6;
                                  } else {
                                    break L7;
                                  }
                                }
                              }
                            } else {
                              break L10;
                            }
                          }
                        }
                        var7++;
                        break L9;
                      }
                      var7++;
                      break L8;
                    }
                    var7++;
                    break L7;
                  }
                  var7++;
                  break L6;
                }
                var7++;
                var7++;
                var7++;
                var7++;
                var7++;
                var7++;
                var7++;
                break L5;
              }
            }
            if (lh.field_s >= 0) {
              if (hc.field_Q) {
                if (hc.field_Q) {
                  if (ea.field_g.length > lh.field_s) {
                    var38 = ea.field_g[lh.field_s];
                    if (var38 != null) {
                      if ((var38.field_F ^ -1) == -5) {
                        L11: {
                          dg.a(var38.field_o, dg.field_T[var38.field_F], var38.field_V, 1, param0, var38.field_y, var38.field_H, param1, (byte) -72, param3);
                          if (nj.field_g != 0) {
                            break L11;
                          } else {
                            sd.a(121);
                            break L11;
                          }
                        }
                        return;
                      } else {
                        sd.a(122);
                        return;
                      }
                    } else {
                      sd.a(122);
                      return;
                    }
                  } else {
                    sd.a(123);
                    return;
                  }
                } else {
                  return;
                }
              } else {
                if (ea.field_g.length > lh.field_s) {
                  var22 = ea.field_g[lh.field_s];
                  var21 = var22;
                  if (var21 != null) {
                    if ((var21.field_F ^ -1) != -5) {
                      sd.a(122);
                      return;
                    } else {
                      uc.a(var21.field_y, var21.field_o, var21.field_H, param1, 1, var21.field_V, param3, dg.field_T[var22.field_F], true, param0);
                      return;
                    }
                  } else {
                    sd.a(122);
                    return;
                  }
                } else {
                  sd.a(121);
                  return;
                }
              }
            } else {
              sd.a(126);
              return;
            }
          }
        } else {
          L12: {
            lh.field_s = -1;
            if ((lh.field_s ^ -1) >= -1) {
              break L12;
            } else {
              var4_ref = ea.field_g[lh.field_s];
              break L12;
            }
          }
          L13: {
            if (param2 > 87) {
              break L13;
            } else {
              field_f = null;
              break L13;
            }
          }
          L14: {
            if (var4_ref == null) {
              break L14;
            } else {
              var5 = ue.a(var4_ref.field_o, param3, var4_ref.field_H, param1, (byte) 79);
              break L14;
            }
          }
          L15: {
            var7 = 0;
            if (ea.field_g.length <= var7) {
              break L15;
            } else {
              L16: {
                L17: {
                  L18: {
                    L19: {
                      L20: {
                        if (null == ea.field_g[var7]) {
                          var7++;
                          break L20;
                        } else {
                          var13 = ea.field_g[var7];
                          if (4 == var13.field_F) {
                            var6 = ue.a(var13.field_o, param3, var13.field_H, param1, (byte) 79);
                            if (-1 < (var6 ^ -1)) {
                              break L19;
                            } else {
                              if (var5 <= var6) {
                                break L18;
                              } else {
                                if (0 < var5) {
                                  var5 = var6;
                                  lh.field_s = var13.field_y;
                                  break L16;
                                } else {
                                  break L17;
                                }
                              }
                            }
                          } else {
                            break L20;
                          }
                        }
                      }
                      var7++;
                      break L19;
                    }
                    var7++;
                    break L18;
                  }
                  var7++;
                  break L17;
                }
                var7++;
                break L16;
              }
              var7++;
              var7++;
              var7++;
              var7++;
              var7++;
              var7++;
              var7++;
              break L15;
            }
          }
          if (lh.field_s >= 0) {
            L21: {
              if (hc.field_Q) {
                if (hc.field_Q) {
                  if (ea.field_g.length > lh.field_s) {
                    var16 = ea.field_g[lh.field_s];
                    if (var16 != null) {
                      if ((var16.field_F ^ -1) != -5) {
                        sd.a(122);
                        return;
                      } else {
                        L22: {
                          dg.a(var16.field_o, dg.field_T[var16.field_F], var16.field_V, 1, param0, var16.field_y, var16.field_H, param1, (byte) -72, param3);
                          if (nj.field_g != 0) {
                            break L22;
                          } else {
                            sd.a(121);
                            break L22;
                          }
                        }
                        return;
                      }
                    } else {
                      sd.a(122);
                      return;
                    }
                  } else {
                    sd.a(123);
                    return;
                  }
                } else {
                  break L21;
                }
              } else {
                if (ea.field_g.length > lh.field_s) {
                  L23: {
                    var15 = ea.field_g[lh.field_s];
                    var14 = var15;
                    if (var14 == null) {
                      break L23;
                    } else {
                      if ((var14.field_F ^ -1) == -5) {
                        uc.a(var14.field_y, var14.field_o, var14.field_H, param1, 1, var14.field_V, param3, dg.field_T[var15.field_F], true, param0);
                        break L21;
                      } else {
                        break L23;
                      }
                    }
                  }
                  sd.a(122);
                  return;
                } else {
                  sd.a(121);
                  return;
                }
              }
            }
            return;
          } else {
            sd.a(126);
            return;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new boolean[][][]{new boolean[7][], new boolean[7][], new boolean[7][]};
        field_d = "Members";
        field_g = -1;
        field_a = "Waiting for sound effects";
        field_f = null;
    }
}
