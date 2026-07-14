/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dp extends ji {
    static String[] field_F;
    private int field_z;
    static int[] field_A;
    private int field_y;
    private int[] field_D;
    private int[] field_B;
    private int field_C;

    final void a(byte param0, int param1, ed param2) {
        int var4 = 0;
        int var5 = 0;
        L0: {
          var5 = Vertigo2.field_L ? 1 : 0;
          var4 = param1;
          if (var4 == 0) {
            ((dp) this).field_z = param2.h(-11);
            break L0;
          } else {
            if (1 == var4) {
              ((dp) this).field_C = param2.a((byte) -11);
              break L0;
            } else {
              if (var4 != 2) {
                break L0;
              } else {
                ((dp) this).field_y = param2.h(-11);
                break L0;
              }
            }
          }
        }
        L1: {
          if (param0 == 110) {
            break L1;
          } else {
            ((dp) this).field_D = null;
            break L1;
          }
        }
    }

    final int[] c(int param0, int param1) {
        int[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int[] var12 = null;
        int[] var13 = null;
        int[] var14 = null;
        int[] var15 = null;
        L0: {
          var10 = Vertigo2.field_L ? 1 : 0;
          var15 = ((dp) this).field_x.a(param0, (byte) -124);
          var14 = var15;
          var13 = var14;
          var12 = var13;
          var3 = var12;
          if (!((dp) this).field_x.field_i) {
            break L0;
          } else {
            var4 = lf.field_y[param0];
            if (((dp) this).field_y != 0) {
              var5 = 0;
              L1: while (true) {
                if (var5 >= we.field_M) {
                  break L0;
                } else {
                  L2: {
                    var6 = 0;
                    var7 = 0;
                    var8 = rh.field_O[var5];
                    var9 = ((dp) this).field_y;
                    if ((var9 ^ -1) == -2) {
                      var6 = var8;
                      break L2;
                    } else {
                      if ((var9 ^ -1) == -3) {
                        var6 = (-4096 + var4 + var8 >> 929258945) + 2048;
                        break L2;
                      } else {
                        if (var9 != 3) {
                          break L2;
                        } else {
                          var6 = 2048 + (-var4 + var8 >> -431928639);
                          break L2;
                        }
                      }
                    }
                  }
                  var11 = 0;
                  var9 = var11;
                  L3: while (true) {
                    L4: {
                      if (var11 >= ((dp) this).field_z) {
                        break L4;
                      } else {
                        if (var6 >= ((dp) this).field_B[var11]) {
                          if (((dp) this).field_B[var11 + 1] > var6) {
                            if (((dp) this).field_D[var11] <= var6) {
                              break L4;
                            } else {
                              var7 = 4096;
                              break L4;
                            }
                          } else {
                            var11++;
                            continue L3;
                          }
                        } else {
                          var11++;
                          continue L3;
                        }
                      }
                    }
                    var15[var5] = var7;
                    var5++;
                    continue L1;
                  }
                }
              }
            } else {
              var5 = 0;
              var6 = 0;
              L5: while (true) {
                L6: {
                  if (var6 >= ((dp) this).field_z) {
                    break L6;
                  } else {
                    if (((dp) this).field_B[var6] <= var4) {
                      if (((dp) this).field_B[1 + var6] > var4) {
                        if (((dp) this).field_D[var6] <= var4) {
                          break L6;
                        } else {
                          var5 = 4096;
                          break L6;
                        }
                      } else {
                        var6++;
                        continue L5;
                      }
                    } else {
                      var6++;
                      continue L5;
                    }
                  }
                }
                qq.a(var15, 0, we.field_M, var5);
                break L0;
              }
            }
          }
        }
        L7: {
          if (param1 > 91) {
            break L7;
          } else {
            ((dp) this).field_C = 10;
            break L7;
          }
        }
        return var3;
    }

    final void a(int param0) {
        if (param0 > -98) {
            Object var3 = null;
            String discarded$0 = dp.a((CharSequence) null, true, false);
        }
        this.g(4096);
    }

    final static String a(CharSequence param0, boolean param1, boolean param2) {
        int var3 = 0;
        String var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = Vertigo2.field_L ? 1 : 0;
        if (param0 != null) {
          L0: {
            var3 = param0.length();
            if (-2 < (var3 ^ -1)) {
              break L0;
            } else {
              if (var3 > 12) {
                break L0;
              } else {
                L1: {
                  var4 = rc.a(param0, 320);
                  if (var4 == null) {
                    break L1;
                  } else {
                    if ((var4.length() ^ -1) <= -2) {
                      L2: {
                        if (jq.a(var4.charAt(0), -96)) {
                          break L2;
                        } else {
                          if (jq.a(var4.charAt(-1 + var4.length()), -96)) {
                            break L2;
                          } else {
                            L3: {
                              var5 = 0;
                              if (!param1) {
                                break L3;
                              } else {
                                dp.h(-57);
                                break L3;
                              }
                            }
                            var6 = 0;
                            L4: while (true) {
                              if (param0.length() <= var6) {
                                if (0 < var5) {
                                  return vq.field_p;
                                } else {
                                  return null;
                                }
                              } else {
                                L5: {
                                  var7 = param0.charAt(var6);
                                  if (!jq.a((char) var7, -96)) {
                                    var5 = 0;
                                    break L5;
                                  } else {
                                    var5++;
                                    break L5;
                                  }
                                }
                                if ((var5 ^ -1) <= -3) {
                                  if (!param2) {
                                    return mo.field_a;
                                  } else {
                                    var6++;
                                    continue L4;
                                  }
                                } else {
                                  var6++;
                                  continue L4;
                                }
                              }
                            }
                          }
                        }
                      }
                      return vq.field_p;
                    } else {
                      break L1;
                    }
                  }
                }
                return jn.field_d;
              }
            }
          }
          return jn.field_d;
        } else {
          return jn.field_d;
        }
    }

    public static void h(int param0) {
        if (param0 >= -68) {
            return;
        }
        field_F = null;
        field_A = null;
    }

    public dp() {
        super(0, true);
        ((dp) this).field_y = 0;
        ((dp) this).field_z = 10;
        ((dp) this).field_C = 2048;
    }

    private final void g(int param0) {
        int var5 = 0;
        int var6 = Vertigo2.field_L ? 1 : 0;
        int var2 = 0;
        ((dp) this).field_D = new int[1 + ((dp) this).field_z];
        ((dp) this).field_B = new int[1 + ((dp) this).field_z];
        int var3 = 4096 / ((dp) this).field_z;
        int var4 = ((dp) this).field_C * var3 >> 281515980;
        for (var5 = 0; ((dp) this).field_z > var5; var5++) {
            ((dp) this).field_B[var5] = var2;
            ((dp) this).field_D[var5] = var4 + var2;
            var2 = var2 + var3;
        }
        ((dp) this).field_B[((dp) this).field_z] = 4096;
        ((dp) this).field_D[((dp) this).field_z] = ((dp) this).field_D[0] + param0;
    }

    final static void b(byte param0) {
        Object var1 = null;
        int var2 = 0;
        Throwable var3 = null;
        int var4 = 0;
        int var5 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = Vertigo2.field_L ? 1 : 0;
                    var1 = (Object) (Object) kb.field_a;
                    // monitorenter kb.field_a
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        mm.field_a = mm.field_a + 1;
                        rq.field_B = ah.field_l;
                        if ((fh.field_w ^ -1) > -1) {
                            statePc = 6;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (bd.field_f == fh.field_w) {
                            statePc = 10;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var2 = bq.field_D[bd.field_f];
                        bd.field_f = 127 & bd.field_f - -1;
                        if ((var2 ^ -1) <= -1) {
                            statePc = 5;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        cr.field_eb[var2 ^ -1] = false;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        cr.field_eb[var2] = true;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var5 = 0;
                        var2 = var5;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if ((var5 ^ -1) <= -113) {
                            statePc = 9;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        cr.field_eb[var5] = false;
                        var5++;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        fh.field_w = bd.field_f;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        ah.field_l = ro.field_e;
                        // monitorexit var1
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var3 = caughtException;
                        // monitorexit var1
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 13: {
                    throw (RuntimeException) (Object) var3;
                }
                case 14: {
                    if (param0 > 97) {
                        statePc = 16;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    field_F = null;
                    statePc = 16;
                    continue stateLoop;
                }
                case 16: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static v a(String param0, String param1, byte param2, boolean param3, long param4) {
        if (0L == param4) {
            if (param1 != null) {
                return (v) (Object) new wi(param1, param0);
            }
        }
        if (!(!param3)) {
            return (v) (Object) new nd(param4, param0);
        }
        if (param2 != -7) {
            dp.b((byte) 42);
        }
        return (v) (Object) new c(param4, param0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_F = new String[]{"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        field_A = new int[8192];
    }
}
