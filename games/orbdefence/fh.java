/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class fh {
    static String field_b;
    int field_f;
    java.awt.Image field_a;
    int[] field_d;
    static boolean field_c;
    int field_e;

    final void a(int param0) {
        if (param0 != -40) {
          this.field_e = -67;
          ul.a(this.field_d, this.field_e, this.field_f);
          return;
        } else {
          ul.a(this.field_d, this.field_e, this.field_f);
          return;
        }
    }

    final static gj a(int param0, int param1, int param2, int param3, byte param4) {
        gj var5;
        int var6;
        int var7;
        gj var8;
        int stackIn_5_0 = 0;
        int stackIn_5_1 = 0;
        var7 = OrbDefence.field_D ? 1 : 0;
        var5 = (gj) ((Object) cb.field_b.b((byte) -106));
        L0: while (true) {
          if (var5 != null) {
            stackIn_5_0 = var5.field_o;

            stackIn_5_1 = param2;

            if (var7 == 0) {
              if (stackIn_5_0 == stackIn_5_1) {
                return var5;
              } else {
                var5 = (gj) ((Object) cb.field_b.d(853));
                if (var7 == 0) {
                  continue L0;
                } else {
                  var8 = new gj();
                  var5 = var8;
                  var8.field_o = param2;
                  var6 = 102 / ((41 - param4) / 45);
                  var5.field_m = param3;
                  var5.field_n = param0;
                  cb.field_b.a(-92, var5);
                  se.a(var5, param1, -38);
                  return var5;
                }
              }
            } else {
              var6 = stackIn_5_0 / stackIn_5_1;
              var5.field_m = param3;
              var5.field_n = param0;
              cb.field_b.a(-92, var5);
              se.a(var5, param1, -38);
              return var5;
            }
          } else {
            var8 = new gj();
            var5 = var8;
            var8.field_o = param2;
            var6 = 102 / ((41 - param4) / 45);
            var5.field_m = param3;
            var5.field_n = param0;
            cb.field_b.a(-92, var5);
            se.a(var5, param1, -38);
            return var5;
          }
        }
    }

    final static void a(int param0, int param1) {
        try {
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            Throwable var2 = null;
            try {
              L0: {
                if (param0 == 17489) {
                  gm.a(true, "resizing", new Object[]{new Integer(param1)}, uj.b((byte) -120));
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L1: {
                var2 = decompiledCaughtException;
                decompiledRegionSelector0 = 1;
                break L1;
              }
            }
            if (decompiledRegionSelector0 == 0) {
              return;
            } else {
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    abstract void a(int param0, int param1, java.awt.Graphics param2, boolean param3);

    public static void a(byte param0) {
        field_b = null;
        if (param0 > -26) {
            field_c = true;
        }
    }

    final static void a(ki param0, int param1) {
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        wd var5 = null;
        int[] var6 = null;
        int var7 = 0;
        se var8 = null;
        se var9 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var7 = OrbDefence.field_D ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var8 = new se(param0.a("", 1, "logo.fo3d"));
                        var9 = var8;
                        var3 = var9.b((byte) 90);
                        var9.n(9471);
                        cg.field_c = mc.a(12, var9);
                        if (param1 == -237) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        fh.a((byte) -39);
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        tc.field_a = new wd[var3];
                        ne.field_a = new int[var3][];
                        var4 = 0;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (var3 <= var4) {
                            statePc = 8;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        tc.field_a[var4] = f.a(var8, 16);
                        var4++;
                        if (var7 != 0) {
                            statePc = 9;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (var7 == 0) {
                            statePc = 4;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var9.m(param1 ^ -236);
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var4 = 0;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (var3 <= var4) {
                            statePc = 20;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var5 = tc.field_a[var4];
                        var5.a(3940, 6, 6, 6, 1);
                        var5.a(2);
                        var6 = new int[]{var5.field_d + var5.field_P >> -1872967935, var5.field_J + var5.field_F >> -1580754783, var5.field_v - -var5.field_z >> -619516767};
                        ne.field_a[var4] = var6;
                        var5.a((byte) 7, -var6[1], -var6[2], -var6[0]);
                        var4++;
                        if (var7 == 0) {
                            statePc = 13;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        return;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (var7 == 0) {
                            statePc = 10;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        return;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 16: {
                    var2 = (RuntimeException) ((Object) caughtException);
                    stackIn_18_0 = (RuntimeException) (var2);
                    stackIn_17_0 = stackIn_18_0;
                    stackIn_18_1 = new StringBuilder().append("fh.I(");
                    stackIn_17_1 = stackIn_18_1;
                    if (param0 == null) {
                        statePc = 18;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    stackIn_19_0 = (RuntimeException) ((Object) stackIn_17_0);
                    stackIn_19_1 = (StringBuilder) ((Object) stackIn_17_1);
                    stackIn_19_2 = "{...}";
                    statePc = 19;
                    continue stateLoop;
                }
                case 18: {
                    stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
                    stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
                    stackIn_19_2 = "null";
                    statePc = 19;
                    continue stateLoop;
                }
                case 19: {
                    throw dd.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ',' + param1 + ')');
                }
                case 20: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    abstract void a(int param0, int param1, int param2, java.awt.Component param3);

    final static void a(byte param0, int param1, boolean param2, int param3) {
        int var4;
        ki var5;
        bl.field_n.c(param3, param1);
        if (param0 != 8) {
          L0: {
            var5 = (ki) null;
            fh.a((ki) null, 88);
            if (param2) {
              L1: {
                var4 = 2 * (le.field_c % bl.field_n.field_o);
                if (bl.field_n.field_o > var4) {
                  break L1;
                } else {
                  var4 = -var4 + bl.field_n.field_o + bl.field_n.field_o;
                  break L1;
                }
              }
              L2: {
                L3: {
                  if (10 > var4) {
                    break L3;
                  } else {
                    if (-40 + bl.field_n.field_o >= var4) {
                      break L2;
                    } else {
                      var4 = -40 + bl.field_n.field_o;
                      if (!OrbDefence.field_D) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                var4 = 10;
                break L2;
              }
              hb.a(0, var4, 0, 80, param0 ^ -9, param3, 30, param1, bl.field_n);
              break L0;
            } else {
              break L0;
            }
          }
          return;
        } else {
          L4: {
            if (param2) {
              L5: {
                var4 = 2 * (le.field_c % bl.field_n.field_o);
                if (bl.field_n.field_o > var4) {
                  break L5;
                } else {
                  var4 = -var4 + bl.field_n.field_o + bl.field_n.field_o;
                  break L5;
                }
              }
              L6: {
                L7: {
                  if (10 > var4) {
                    break L7;
                  } else {
                    if (-40 + bl.field_n.field_o >= var4) {
                      break L6;
                    } else {
                      var4 = -40 + bl.field_n.field_o;
                      if (!OrbDefence.field_D) {
                        break L6;
                      } else {
                        break L7;
                      }
                    }
                  }
                }
                var4 = 10;
                break L6;
              }
              hb.a(0, var4, 0, 80, param0 ^ -9, param3, 30, param1, bl.field_n);
              break L4;
            } else {
              break L4;
            }
          }
          return;
        }
    }

    final static hj[] a(ki param0, int param1, byte param2, int param3) {
        RuntimeException var4 = null;
        ki var5 = null;
        Object stackIn_4_0 = null;
        hj[] stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param2 <= -74) {
                break L1;
              } else {
                var5 = (ki) null;
                fh.a((ki) null, -76, (byte) -18, -119);
                break L1;
              }
            }
            if (pk.a(-128, param3, param0, param1)) {
              stackIn_6_0 = lm.a(-127);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_4_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var4);

            stackIn_9_1 = new StringBuilder().append("fh.G(");

            if (param0 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (hj[]) ((Object) stackIn_4_0);
        } else {
          return stackIn_6_0;
        }
    }

    static {
        field_b = "You are not currently logged in to the<nbsp>game.";
        field_c = true;
    }
}
