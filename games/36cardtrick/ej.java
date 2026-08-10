/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ej extends ta {
    static volatile long field_jb;
    static int field_kb;

    final void c(lk param0, byte param1) {
        try {
            super.c(param0, (byte) 54);
            if (param1 < 28) {
                field_jb = 54L;
            }
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) ((Object) runtimeException), "ej.J(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static int r(int param0) {
        if (g.field_A >= 2) {
          L0: {
            if (0 != hf.field_I) {
              L1: {
                if (null == lb.field_a) {
                  break L1;
                } else {
                  if (lb.field_a.b(4)) {
                    if (lb.field_a.c(0, "")) {
                      if (!lb.field_a.b(4, "")) {
                        return 29;
                      } else {
                        break L1;
                      }
                    } else {
                      return 29;
                    }
                  } else {
                    return 14;
                  }
                }
              }
              if (jk.field_c.b(4)) {
                if (jk.field_c.b(4, "commonui")) {
                  if (aa.field_db.b(4)) {
                    if (aa.field_db.b(4, "commonui")) {
                      if (!sg.field_a.b(4)) {
                        return 82;
                      } else {
                        if (sg.field_a.a((byte) 32)) {
                          break L0;
                        } else {
                          return 86;
                        }
                      }
                    } else {
                      return 80;
                    }
                  } else {
                    return 71;
                  }
                } else {
                  return 57;
                }
              } else {
                return 43;
              }
            } else {
              if (jk.field_c.b(4)) {
                if (!jk.field_c.b(4, "commonui")) {
                  return 40;
                } else {
                  if (aa.field_db.b(param0 ^ -6549)) {
                    if (!aa.field_db.b(4, "commonui")) {
                      return 60;
                    } else {
                      if (sg.field_a.b(4)) {
                        if (!sg.field_a.a((byte) 109)) {
                          return 80;
                        } else {
                          break L0;
                        }
                      } else {
                        return 70;
                      }
                    }
                  } else {
                    return 50;
                  }
                }
              } else {
                return 20;
              }
            }
          }
          if (param0 == -6545) {
            return 100;
          } else {
            return 97;
          }
        } else {
          return 0;
        }
    }

    ej(j param0, lk param1) {
        super(param0, param1, 33, 20, 30);
    }

    final static java.awt.Frame a(int param0, int param1, le param2, int param3, int param4, int param5) {
        Object stackIn_26_0 = null;
        Object stackIn_36_0 = null;
        java.awt.Frame stackIn_40_0 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        String stackIn_44_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        md[] var6 = null;
        RuntimeException var6_ref = null;
        int var7_int = 0;
        java.awt.Frame var7 = null;
        int var8 = 0;
        int var9 = 0;
        md[] var10 = null;
        vi var11 = null;
        var9 = Main.field_T;
        try {
          L0: {
            if (param2.b((byte) -124)) {
              L1: {
                if (0 == param4) {
                  var10 = gf.a(-2, param2);
                  var6 = var10;
                  if (var6 != null) {
                    var7_int = 0;
                    var8 = 0;
                    L2: while (true) {
                      if (var8 >= var10.length) {
                        if (var7_int != 0) {
                          break L1;
                        } else {
                          stackIn_26_0 = null;
                          decompiledRegionSelector0 = 0;
                          break L0;
                        }
                      } else {
                        if (var10[var8].field_b == param3) {
                          if (param5 == var10[var8].field_a) {
                            L3: {
                              if (param0 == 0) {
                                break L3;
                              } else {
                                if (param0 == var10[var8].field_c) {
                                  break L3;
                                } else {
                                  var8++;
                                  continue L2;
                                }
                              }
                            }
                            L4: {
                              if (var7_int == 0) {
                                break L4;
                              } else {
                                if (var10[var8].field_d > param4) {
                                  break L4;
                                } else {
                                  var8++;
                                  continue L2;
                                }
                              }
                            }
                            var7_int = 1;
                            param4 = var10[var8].field_d;
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
                    return null;
                  }
                } else {
                  break L1;
                }
              }
              var11 = param2.a(param4, param5, param0, (byte) -30, param3);
              L5: while (true) {
                if (var11.field_a != 0) {
                  var7 = (java.awt.Frame) (var11.field_e);
                  if (var7 != null) {
                    if (-3 == (var11.field_a ^ -1)) {
                      rl.a(false, param2, var7);
                      stackIn_36_0 = null;
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      L6: {
                        if (param1 == -3428) {
                          break L6;
                        } else {
                          field_kb = -115;
                          break L6;
                        }
                      }
                      stackIn_40_0 = (java.awt.Frame) (var7);
                      decompiledRegionSelector0 = 2;
                      break L0;
                    }
                  } else {
                    return null;
                  }
                } else {
                  wk.a((byte) -121, 10L);
                  continue L5;
                }
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var6_ref = decompiledCaughtException;
            stackIn_43_0 = (RuntimeException) (var6_ref);

            stackIn_43_1 = new StringBuilder().append("ej.EB(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_44_0 = (RuntimeException) ((Object) stackIn_43_0);
              stackIn_44_1 = (StringBuilder) ((Object) stackIn_43_1);
              stackIn_44_2 = "null";
              break L7;
            } else {
              stackIn_44_0 = (RuntimeException) ((Object) stackIn_43_0);
              stackIn_44_1 = (StringBuilder) ((Object) stackIn_43_1);
              stackIn_44_2 = "{...}";
              break L7;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_44_0), stackIn_44_2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (java.awt.Frame) ((Object) stackIn_26_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (java.awt.Frame) ((Object) stackIn_36_0);
          } else {
            return stackIn_40_0;
          }
        }
    }

    final static void a(byte param0, String param1, String param2, boolean param3) {
        try {
            ng.field_y = param1;
            ja.field_a = param2;
            ca.a(kj.field_q, param3, 16777215);
            if (param0 > -112) {
                String var5 = (String) null;
                ej.a((byte) -128, (String) null, (String) null, false);
            }
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) ((Object) runtimeException), "ej.DB(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final static void a(boolean param0, byte param1, boolean param2) {
        if (param1 != 55) {
            return;
        }
        if (!param0) {
            vj.d();
        } else {
            vj.a(0, 0, vj.field_l, vj.field_g, 0, 192);
        }
        ga.a(param0, param1 + 62);
    }

    static {
        field_jb = 0L;
    }
}
