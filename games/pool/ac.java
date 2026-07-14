/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ac extends tm {
    static String field_l;
    static dd field_n;
    static vh field_p;
    static int[] field_r;
    static String field_q;
    static int[] field_o;
    static int field_m;

    final static void a(int param0, boolean param1, boolean param2, cg param3) {
        Object var4 = null;
        Throwable var5 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    if (ij.field_u == param3) {
                        statePc = 8;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    var4 = (Object) (Object) tl.field_N;
                    // monitorenter tl.field_N
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    try {
                        tl.field_N.a((byte) -121, -1, 256);
                        ij.field_u = param3;
                        tl.field_N.a(param3, param1, (byte) -14, param2);
                        // monitorexit var4
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 3: {
                    if (param0 == 256) {
                        statePc = 5;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    field_p = null;
                    statePc = 5;
                    continue stateLoop;
                }
                case 5: {
                    return;
                }
                case 6: {
                    try {
                        var5 = caughtException;
                        // monitorexit var4
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 7: {
                    throw (RuntimeException) (Object) var5;
                }
                case 8: {
                    if (param0 != 256) {
                        statePc = 10;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    return;
                }
                case 10: {
                    field_p = null;
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final int a(int param0, boolean param1) {
        int var3 = 0;
        int var4 = 0;
        Object var5 = null;
        var4 = Pool.field_O;
        if (!param1) {
          var5 = null;
          ((ac) this).a(-117, (di) null);
          var3 = param0;
          if (var3 != 0) {
            if (1 != var3) {
              if (var3 != 2) {
                if (var3 != 3) {
                  if (-5 != (var3 ^ -1)) {
                    if (5 != var3) {
                      if (6 != var3) {
                        if (7 != var3) {
                          if (var3 != 8) {
                            if (-10 != (var3 ^ -1)) {
                              if (10 != var3) {
                                if (var3 != 11) {
                                  if (var3 != -13) {
                                    if (13 != var3) {
                                      if (-15 != var3) {
                                        if ((var3 ^ -1) == -16) {
                                          return this.c(101, 1);
                                        } else {
                                          return 16711935;
                                        }
                                      } else {
                                        return this.c(101, 1);
                                      }
                                    } else {
                                      return this.c(101, 1);
                                    }
                                  } else {
                                    return this.c(101, 1);
                                  }
                                } else {
                                  return this.c(101, 1);
                                }
                              } else {
                                return this.c(101, 1);
                              }
                            } else {
                              return this.c(101, 1);
                            }
                          } else {
                            return 3355443;
                          }
                        } else {
                          return this.c(91, 0);
                        }
                      } else {
                        return this.c(91, 0);
                      }
                    } else {
                      return this.c(91, 0);
                    }
                  } else {
                    return this.c(91, 0);
                  }
                } else {
                  return this.c(91, 0);
                }
              } else {
                return this.c(91, 0);
              }
            } else {
              return this.c(91, 0);
            }
          } else {
            return 13421772;
          }
        } else {
          var3 = param0;
          if (var3 != 0) {
            if (1 != var3) {
              if (var3 != 2) {
                if (var3 != 3) {
                  if (-5 != (var3 ^ -1)) {
                    if (5 != var3) {
                      if (6 != var3) {
                        if (7 != var3) {
                          if (var3 != 8) {
                            if (-10 != (var3 ^ -1)) {
                              if (10 != var3) {
                                if (var3 != 11) {
                                  if (var3 != -13) {
                                    if (13 != var3) {
                                      if (-15 != var3) {
                                        if ((var3 ^ -1) != -16) {
                                          return 16711935;
                                        } else {
                                          return this.c(101, 1);
                                        }
                                      } else {
                                        return this.c(101, 1);
                                      }
                                    } else {
                                      return this.c(101, 1);
                                    }
                                  } else {
                                    return this.c(101, 1);
                                  }
                                } else {
                                  return this.c(101, 1);
                                }
                              } else {
                                return this.c(101, 1);
                              }
                            } else {
                              return this.c(101, 1);
                            }
                          } else {
                            return 3355443;
                          }
                        } else {
                          return this.c(91, 0);
                        }
                      } else {
                        return this.c(91, 0);
                      }
                    } else {
                      return this.c(91, 0);
                    }
                  } else {
                    return this.c(91, 0);
                  }
                } else {
                  return this.c(91, 0);
                }
              } else {
                return this.c(91, 0);
              }
            } else {
              return this.c(91, 0);
            }
          } else {
            return 13421772;
          }
        }
    }

    final String a(byte param0, int param1) {
        if (param0 < 9) {
            return null;
        }
        if ((param1 ^ -1) == -1) {
            return ae.field_b;
        }
        return ae.field_b;
    }

    final boolean c(int param0) {
        if (param0 != 2) {
            field_q = null;
            return false;
        }
        return false;
    }

    public static void i(int param0) {
        if (param0 < 78) {
          ac.i(94);
          field_l = null;
          field_n = null;
          field_q = null;
          field_p = null;
          field_o = null;
          field_r = null;
          return;
        } else {
          field_l = null;
          field_n = null;
          field_q = null;
          field_p = null;
          field_o = null;
          field_r = null;
          return;
        }
    }

    private final int c(int param0, int param1) {
        if (param0 > 75) {
          if (param1 != 0) {
            if ((param1 ^ -1) != -2) {
              return 16777215;
            } else {
              return 6715289;
            }
          } else {
            return 13158;
          }
        } else {
          ac.i(-122);
          if (param1 != 0) {
            if ((param1 ^ -1) != -2) {
              return 16777215;
            } else {
              return 6715289;
            }
          } else {
            return 13158;
          }
        }
    }

    final void a(int param0, di param1) {
        if (param0 != 198123656) {
            boolean discarded$0 = ((ac) this).c(45);
        }
    }

    final static void b(int param0, byte param1) {
        int var2 = 99 % ((-11 - param1) / 49);
        fm.field_M = fm.field_M + param0;
        tq.field_q = (no.field_q.field_y - -sa.field_h.field_C >> 106614625) + fm.field_M;
    }

    final void a(di param0, byte param1) {
        if (((ac) this).field_a == null) {
          ((ac) this).field_a = new eg[16];
          ((ac) this).field_a[0] = ((ac) this).g(-930305852);
          ((ac) this).field_a[15] = eg.a(param0, "", "balls/ball_killer_red");
          ((ac) this).field_a[14] = eg.a(param0, "", "balls/ball_killer_red");
          ((ac) this).field_a[13] = eg.a(param0, "", "balls/ball_killer_red");
          ((ac) this).field_a[12] = eg.a(param0, "", "balls/ball_killer_red");
          ((ac) this).field_a[11] = eg.a(param0, "", "balls/ball_killer_red");
          ((ac) this).field_a[10] = eg.a(param0, "", "balls/ball_killer_red");
          ((ac) this).field_a[9] = eg.a(param0, "", "balls/ball_killer_red");
          ((ac) this).field_a[7] = eg.a(param0, "", "balls/ball_killer_red");
          ((ac) this).field_a[6] = eg.a(param0, "", "balls/ball_killer_red");
          ((ac) this).field_a[5] = eg.a(param0, "", "balls/ball_killer_red");
          ((ac) this).field_a[4] = eg.a(param0, "", "balls/ball_killer_red");
          ((ac) this).field_a[3] = eg.a(param0, "", "balls/ball_killer_red");
          ((ac) this).field_a[2] = eg.a(param0, "", "balls/ball_killer_red");
          ((ac) this).field_a[1] = eg.a(param0, "", "balls/ball_killer_red");
          ((ac) this).field_a[8] = eg.a(param0, "", "balls/ball_killer_black");
          if (param1 != 117) {
            boolean discarded$1 = ((ac) this).c(40);
            ((ac) this).field_a[1].a(8, 8, 8, 4);
            ((ac) this).field_a[8].a(8, 8, 8, 4);
            li.a(((ac) this).field_a[1], 0);
            li.a(((ac) this).field_a[8], 0);
            return;
          } else {
            ((ac) this).field_a[1].a(8, 8, 8, 4);
            ((ac) this).field_a[8].a(8, 8, 8, 4);
            li.a(((ac) this).field_a[1], 0);
            li.a(((ac) this).field_a[8], 0);
            return;
          }
        } else {
          return;
        }
    }

    ac() {
        ((ac) this).field_g = false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        long var4 = 0L;
        long var6 = 0L;
        int var2 = 0;
        int var3 = 0;
        int var1 = 0;
        field_l = "Player Name: ";
        field_q = "Unpacking music";
        field_r = new int[]{2, 20, 21, 49, 6, 5, 9};
        field_o = new int[98304];
        for (var0 = 92682; 46341 <= var0; var0--) {
            var4 = (long)((var0 << 738371457) + -1);
            var6 = (long)((var0 << -604846783) + 1);
            var2 = (int)(-32768L + (var4 * var4 >> -220200046));
            var3 = (int)(-32768L + (var6 * var6 >> 581461202));
            if (field_o.length <= var3) {
                var3 = -1 + field_o.length;
            }
            for (var1 = (var2 ^ -1) <= -1 ? var2 : 0; var3 >= var1; var1++) {
                field_o[var1] = var0;
            }
        }
        field_m = -1;
    }
}
