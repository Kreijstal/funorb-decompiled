/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pg extends java.awt.Canvas {
    static mk field_a;
    private java.awt.Component field_d;
    static String[] field_e;
    static String field_c;
    static String field_b;

    public static void a(byte param0) {
        field_c = null;
        field_a = null;
        field_b = null;
        if (param0 > -104) {
            db var2 = (db) null;
            pg.a((byte) 1, (db) null, false, (db) null, (db) null);
        }
        field_e = null;
    }

    final static int a(int param0, int param1, int param2) {
        int var3_int = 0;
        int var4 = 0;
        int stackIn_13_0 = 0;
        int stackIn_15_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = CrazyCrystals.field_B;
        try {
          L0: {
            L1: {
              if (param2 == -2) {
                break L1;
              } else {
                field_a = (mk) null;
                break L1;
              }
            }
            var3_int = 1;
            L2: while (true) {
              if ((param1 ^ -1) >= -2) {
                if (param1 == 1) {
                  stackIn_13_0 = param0 * var3_int;
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  stackIn_15_0 = var3_int;
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              } else {
                L3: {
                  if (0 != (1 & param1)) {
                    var3_int = var3_int * param0;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                param0 = param0 * param0;
                param1 = param1 >> 1;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw dn.a((Throwable) ((Object) var3), "pg.D(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_13_0;
        } else {
          return stackIn_15_0;
        }
    }

    final static void a(byte param0, db param1, boolean param2, db param3, db param4) {
        try {
            if (param0 >= -96) {
                db var6 = (db) null;
                pg.a((byte) 43, (db) null, false, (db) null, (db) null);
            }
            gk.field_e = lc.a("", (byte) 51);
            gk.field_e.a(106, false);
            e.a(4, param1, param4, param3);
            hm.a(-3121);
            sg.field_b = tl.field_e;
            lc.field_c = tl.field_e;
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) ((Object) runtimeException), "pg.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    final static java.awt.Frame a(byte param0, int param1, int param2, int param3, un param4, int param5) {
        Object stackIn_3_0 = null;
        Object stackIn_7_0 = null;
        Object stackIn_31_0 = null;
        Object stackIn_34_0 = null;
        java.awt.Frame stackIn_36_0 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_40_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        al[] var6 = null;
        RuntimeException var6_ref = null;
        int var7_int = 0;
        java.awt.Frame var7 = null;
        int var8 = 0;
        int var9 = 0;
        al[] var10 = null;
        gb var11 = null;
        var9 = CrazyCrystals.field_B;
        try {
          L0: {
            if (param4.b(5)) {
              L1: {
                if (param5 != 0) {
                  break L1;
                } else {
                  var10 = ri.a(param4, (byte) 27);
                  var6 = var10;
                  if (var6 != null) {
                    var7_int = 0;
                    var8 = 0;
                    L2: while (true) {
                      if (var8 >= var10.length) {
                        if (var7_int != 0) {
                          break L1;
                        } else {
                          return null;
                        }
                      } else {
                        if (param2 == var10[var8].field_i) {
                          if (param1 == var10[var8].field_g) {
                            L3: {
                              if (0 == param3) {
                                break L3;
                              } else {
                                if (var10[var8].field_e == param3) {
                                  break L3;
                                } else {
                                  var8++;
                                  continue L2;
                                }
                              }
                            }
                            L4: {
                              L5: {
                                if (var7_int == 0) {
                                  break L5;
                                } else {
                                  if (param5 < var10[var8].field_b) {
                                    break L5;
                                  } else {
                                    break L4;
                                  }
                                }
                              }
                              param5 = var10[var8].field_b;
                              var7_int = 1;
                              break L4;
                            }
                            var8++;
                            continue L2;
                          } else {
                            var8++;
                            continue L2;
                          }
                        } else {
                          var8++;
                          continue L2;
                        }
                      }
                    }
                  } else {
                    stackIn_7_0 = null;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              }
              var11 = param4.a(param2, param1, param5, param3, (byte) 4);
              L6: while (true) {
                if (0 != var11.field_a) {
                  var7 = (java.awt.Frame) (var11.field_b);
                  if (var7 != null) {
                    var8 = 101 % ((param0 - 14) / 62);
                    if (2 != var11.field_a) {
                      stackIn_36_0 = (java.awt.Frame) (var7);
                      decompiledRegionSelector0 = 4;
                      break L0;
                    } else {
                      bo.a(param4, var7, 1);
                      stackIn_34_0 = null;
                      decompiledRegionSelector0 = 3;
                      break L0;
                    }
                  } else {
                    stackIn_31_0 = null;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  }
                } else {
                  fh.a(true, 10L);
                  continue L6;
                }
              }
            } else {
              stackIn_3_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var6_ref = decompiledCaughtException;
            stackIn_39_0 = (RuntimeException) (var6_ref);

            stackIn_39_1 = new StringBuilder().append("pg.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_40_0 = (RuntimeException) ((Object) stackIn_39_0);
              stackIn_40_1 = (StringBuilder) ((Object) stackIn_39_1);
              stackIn_40_2 = "null";
              break L7;
            } else {
              stackIn_40_0 = (RuntimeException) ((Object) stackIn_39_0);
              stackIn_40_1 = (StringBuilder) ((Object) stackIn_39_1);
              stackIn_40_2 = "{...}";
              break L7;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_40_0), stackIn_40_2 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (java.awt.Frame) ((Object) stackIn_3_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (java.awt.Frame) ((Object) stackIn_7_0);
          } else {
            if (decompiledRegionSelector0 == 2) {
              return (java.awt.Frame) ((Object) stackIn_31_0);
            } else {
              if (decompiledRegionSelector0 == 3) {
                return (java.awt.Frame) ((Object) stackIn_34_0);
              } else {
                return stackIn_36_0;
              }
            }
          }
        }
    }

    public final void update(java.awt.Graphics param0) {
        try {
            this.field_d.update(param0);
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) ((Object) runtimeException), "pg.update(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    pg(java.awt.Component param0) {
        try {
            this.field_d = param0;
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) ((Object) runtimeException), "pg.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final void paint(java.awt.Graphics param0) {
        try {
            this.field_d.paint(param0);
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) ((Object) runtimeException), "pg.paint(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_e = new String[]{"Teleroom", "Sacrifice", "Crystal Beyond", "Shufflesworth", "City", "Double Trouble", "Mining", "Bomb Tower", "The Pit", "Come Again Rock", "Which Way?", "Stop Pushing!"};
        field_c = "Create your own free Jagex account";
        field_b = "Play free version";
        field_a = new mk();
    }
}
