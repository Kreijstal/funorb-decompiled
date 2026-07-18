/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sdb extends rqa {
    static String field_o;
    static llb field_p;

    final static String a() {
        Object var1 = null;
        Object var2 = null;
        String var3 = null;
        String var4 = null;
        String var5 = null;
        int var6 = 0;
        int var7 = 0;
        String var8 = null;
        int var9 = 0;
        int var10 = 0;
        String stackIn_56_0 = null;
        Object stackIn_94_0 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_55_0 = null;
        String stackOut_53_0 = null;
        Object stackOut_93_0 = null;
        var10 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              var1 = null;
              var2 = null;
              if (ow.field_b != 0) {
                break L1;
              } else {
                if (null == ohb.field_o) {
                  break L1;
                } else {
                  var2 = (Object) (Object) ldb.field_p;
                  break L1;
                }
              }
            }
            L2: {
              if (ow.field_b != 2) {
                break L2;
              } else {
                if (ws.a(0)) {
                  break L2;
                } else {
                  L3: {
                    L4: {
                      if (!uaa.a(nkb.field_o, (byte) -47)) {
                        break L4;
                      } else {
                        var2 = (Object) (Object) isa.a(cc.field_d, new String[1], 78);
                        if (var10 == 0) {
                          break L3;
                        } else {
                          break L4;
                        }
                      }
                    }
                    var2 = (Object) (Object) isa.a(fab.field_b, new String[1], 114);
                    break L3;
                  }
                  if (uga.field_d) {
                    int discarded$4 = 2;
                    lh.a((byte) -112, 0, (String) null, (String) null, (String) var2);
                    fj.b(18444);
                    break L2;
                  } else {
                    break L2;
                  }
                }
              }
            }
            L5: {
              if (null != var2) {
                break L5;
              } else {
                if (lf.field_o) {
                  break L5;
                } else {
                  if (qw.field_l != null) {
                    break L5;
                  } else {
                    var2 = (Object) (Object) tta.field_o;
                    break L5;
                  }
                }
              }
            }
            L6: {
              if (var2 != null) {
                flb.a(19204, (String) var2, 0, (String) null, kmb.field_a);
                break L6;
              } else {
                L7: {
                  L8: {
                    var3 = kca.field_a;
                    var3 = gfb.a(1, var3);
                    var4 = "";
                    var5 = "|";
                    var6 = ow.field_b;
                    var7 = 0;
                    if (var6 != 2) {
                      break L8;
                    } else {
                      L9: {
                        var4 = isa.a(tia.field_G, new String[1], 91);
                        var8 = isa.a(ejb.field_o, new String[1], 79);
                        var7 = fgb.field_l.field_hb + (bpa.field_c.field_hb - 485 + ej.field_c.b(var8)) + -ej.field_c.b(var4);
                        if (0 <= var7) {
                          break L9;
                        } else {
                          var7 = 0;
                          break L9;
                        }
                      }
                      if (var10 == 0) {
                        break L7;
                      } else {
                        break L8;
                      }
                    }
                  }
                  L10: {
                    if (0 != var6) {
                      break L10;
                    } else {
                      L11: {
                        if (null != lqa.field_o) {
                          break L11;
                        } else {
                          if (!cqb.field_e) {
                            break L11;
                          } else {
                            var4 = "[" + bib.field_e + "] ";
                            break L11;
                          }
                        }
                      }
                      if (null == lqa.field_o) {
                        break L10;
                      } else {
                        L12: {
                          var6 = 1;
                          if (!nv.field_n) {
                            break L12;
                          } else {
                            if (vla.field_E == null) {
                              break L12;
                            } else {
                              var4 = "[" + vla.field_E + "] ";
                              if (var10 == 0) {
                                break L10;
                              } else {
                                break L12;
                              }
                            }
                          }
                        }
                        var4 = "[" + isa.a(wt.field_b, new String[1], 110) + "] ";
                        break L10;
                      }
                    }
                  }
                  L13: {
                    int discarded$5 = 0;
                    if (tob.g()) {
                      stackOut_55_0 = ": ";
                      stackIn_56_0 = stackOut_55_0;
                      break L13;
                    } else {
                      stackOut_53_0 = "<img=3>: ";
                      stackIn_56_0 = stackOut_53_0;
                      break L13;
                    }
                  }
                  L14: {
                    L15: {
                      var8 = stackIn_56_0;
                      var4 = var4 + var3 + var8;
                      if (erb.field_p) {
                        break L15;
                      } else {
                        if (hb.field_c) {
                          var5 = "";
                          var4 = "<col=999999>" + var4 + vq.field_y + "</col>";
                          if (var10 == 0) {
                            break L14;
                          } else {
                            break L15;
                          }
                        } else {
                          break L14;
                        }
                      }
                    }
                    var4 = "<col=999999>" + var4 + ocb.field_g + "</col>";
                    var5 = "";
                    break L14;
                  }
                  var9 = ej.field_c.b(var4);
                  int discarded$6 = 0;
                  if (tob.g()) {
                    break L7;
                  } else {
                    L16: {
                      if (!bpa.field_c.field_O) {
                        break L16;
                      } else {
                        if (-bpa.field_c.field_M + kc.field_b >= var9) {
                          break L16;
                        } else {
                          if (!erb.field_p) {
                            var1 = (Object) (Object) vq.field_y;
                            break L16;
                          } else {
                            var1 = (Object) (Object) "Broken!";
                            break L16;
                          }
                        }
                      }
                    }
                    if (bpa.field_c.field_o == 0) {
                      break L7;
                    } else {
                      if (var9 > bpa.field_c.field_r) {
                        if (!erb.field_p) {
                          int discarded$7 = 0;
                          or.a();
                          break L7;
                        } else {
                          break L7;
                        }
                      } else {
                        break L7;
                      }
                    }
                  }
                }
                L17: {
                  flb.a(19204, var4 + no.c(awa.field_p.toString()), var7, var5, rqa.field_m[var6]);
                  if (fva.field_p) {
                    break L17;
                  } else {
                    fgb.field_l.field_O = false;
                    break L17;
                  }
                }
                L18: {
                  if (!fgb.field_l.field_O) {
                    break L18;
                  } else {
                    var1 = (Object) (Object) isa.a(rc.field_a, new String[2], 100);
                    break L18;
                  }
                }
                break L6;
              }
            }
            stackOut_93_0 = var1;
            stackIn_94_0 = stackOut_93_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = (Object) (Object) decompiledCaughtException;
          throw rta.a((Throwable) var1, "sdb.B(" + -8037 + ')');
        }
        return (String) (Object) stackIn_94_0;
    }

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        nc stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        nc stackOut_3_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            L1: {
              if (param1 < -119) {
                break L1;
              } else {
                field_o = null;
                break L1;
              }
            }
            stackOut_3_0 = new nc((Object) (Object) frb.a(48, 117));
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3;
            stackOut_5_1 = new StringBuilder().append("sdb.A(");
            stackIn_8_0 = stackOut_5_0;
            stackIn_8_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_9_0 = stackOut_6_0;
              stackIn_9_1 = stackOut_6_1;
              stackIn_9_2 = stackOut_6_2;
              break L2;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ',' + param1 + ')');
        }
        return stackIn_4_0;
    }

    sdb(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    public static void e() {
        try {
            field_o = null;
            field_p = null;
            int var1_int = 0;
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "sdb.C(" + 87 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = "Scale up map zone";
    }
}
