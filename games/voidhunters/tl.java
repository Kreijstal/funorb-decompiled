/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tl extends rqa {
    static int field_p;
    static String field_q;
    static String field_o;

    tl(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static void a(int param0, int param1, int param2) {
        alb.field_b = param2;
        pba.field_r = param0;
    }

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        nc stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        nc stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param1 < -119) {
                break L1;
              } else {
                boolean discarded$2 = tl.b(125, -116, 41);
                break L1;
              }
            }
            si.a(231, 62, param0[0].a(21));
            stackOut_2_0 = new nc((Object) (Object) "void");
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("tl.A(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    public static void e() {
        field_o = null;
        field_q = null;
    }

    final static boolean b(int param0, int param1, int param2) {
        int var3 = 0;
        String var4_ref_String = null;
        int var4 = 0;
        int var5 = 0;
        String var7 = null;
        String var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        String var12 = null;
        String var13 = null;
        String var14 = null;
        String var15 = null;
        String var16 = null;
        Object var17 = null;
        CharSequence var18 = null;
        L0: {
          var17 = null;
          var11 = VoidHunters.field_G;
          var3 = 1;
          if (lf.field_o) {
            break L0;
          } else {
            if (qw.field_l == null) {
              var3 = 0;
              break L0;
            } else {
              break L0;
            }
          }
        }
        L1: {
          if (0 != ow.field_b) {
            break L1;
          } else {
            if (ohb.field_o == null) {
              break L1;
            } else {
              var3 = 0;
              break L1;
            }
          }
        }
        L2: {
          if (2 != ow.field_b) {
            break L2;
          } else {
            if (ws.a(param2 + 85)) {
              break L2;
            } else {
              var3 = 0;
              break L2;
            }
          }
        }
        if (param2 == ~pma.field_o) {
          if (var3 != 0) {
            if (awa.field_p.length() <= 0) {
              int discarded$25 = 26718;
              dr.a();
              return true;
            } else {
              L3: {
                var4_ref_String = awa.field_p.toString();
                if (!hnb.a((byte) -92, var4_ref_String)) {
                  L4: {
                    var5 = ow.field_b;
                    if (var5 != 0) {
                      break L4;
                    } else {
                      if (lqa.field_o != null) {
                        var5 = 1;
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                  }
                  L5: {
                    int discarded$26 = 19;
                    if (2 == jia.a(var5)) {
                      mea.a(1, (byte) -76, param1, var5);
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  va.a(var4_ref_String, param2 + -25634, -1, param0, ow.field_b, waa.field_x);
                  break L3;
                } else {
                  int discarded$27 = 2;
                  lh.a((byte) -70, 0, (String) null, (String) null, wl.field_p);
                  int discarded$28 = 2;
                  lh.a((byte) -62, 0, (String) null, (String) null, lv.field_o);
                  break L3;
                }
              }
              int discarded$29 = 26718;
              dr.a();
              return true;
            }
          } else {
            if (ow.field_b != 0) {
              int discarded$30 = 26718;
              dr.a();
              return true;
            } else {
              return true;
            }
          }
        } else {
          if (pma.field_o != 85) {
            var4 = jl.field_r;
            int discarded$31 = 32;
            if (oga.a((char) var4)) {
              if (var3 != 0) {
                if (awa.field_p.length() < 80) {
                  L6: {
                    StringBuilder discarded$32 = awa.field_p.append((char) var4);
                    var5 = 485;
                    var13 = kca.field_a;
                    var7 = var13;
                    var7 = var13;
                    var12 = gfb.a(1, var13);
                    var7 = var12;
                    var7 = var12;
                    var15 = var12;
                    var7 = var15;
                    var7 = var15;
                    if (ow.field_b != 2) {
                      var7 = "";
                      if (0 == ow.field_b) {
                        L7: {
                          if (lqa.field_o != null) {
                            break L7;
                          } else {
                            if (cqb.field_e) {
                              var7 = "[" + bib.field_e + "] ";
                              break L7;
                            } else {
                              L8: {
                                if (lqa.field_o == null) {
                                  break L8;
                                } else {
                                  if (nv.field_n) {
                                    if (null != vla.field_E) {
                                      var7 = "[" + vla.field_E + "] ";
                                      break L8;
                                    } else {
                                      L9: {
                                        var7 = "[" + isa.a(wt.field_b, new String[1], 80) + "] ";
                                        var16 = var7 + var15 + ": ";
                                        var5 = var5 - ej.field_c.b(var16);
                                        if (var5 >= ej.field_c.b(awa.field_p.toString())) {
                                          break L9;
                                        } else {
                                          int discarded$33 = 32;
                                          StringBuilder discarded$34 = npa.a(awa.field_p.length() - 1, false, awa.field_p);
                                          break L9;
                                        }
                                      }
                                      return true;
                                    }
                                  } else {
                                    L10: {
                                      var7 = "[" + isa.a(wt.field_b, new String[1], 80) + "] ";
                                      var16 = var7 + var15 + ": ";
                                      var5 = var5 - ej.field_c.b(var16);
                                      if (var5 >= ej.field_c.b(awa.field_p.toString())) {
                                        break L10;
                                      } else {
                                        int discarded$35 = 32;
                                        StringBuilder discarded$36 = npa.a(awa.field_p.length() - 1, false, awa.field_p);
                                        break L10;
                                      }
                                    }
                                    return true;
                                  }
                                }
                              }
                              var16 = var7 + var15 + ": ";
                              var7 = var16;
                              var7 = var16;
                              var5 = var5 - ej.field_c.b(var16);
                              if (var5 < ej.field_c.b(awa.field_p.toString())) {
                                int discarded$37 = 32;
                                StringBuilder discarded$38 = npa.a(awa.field_p.length() - 1, false, awa.field_p);
                                return true;
                              } else {
                                return true;
                              }
                            }
                          }
                        }
                        L11: {
                          if (lqa.field_o == null) {
                            break L11;
                          } else {
                            if (!nv.field_n) {
                              var7 = "[" + isa.a(wt.field_b, new String[1], 80) + "] ";
                              var16 = var7 + var15 + ": ";
                              var5 = var5 - ej.field_c.b(var16);
                              if (var5 < ej.field_c.b(awa.field_p.toString())) {
                                int discarded$39 = 32;
                                StringBuilder discarded$40 = npa.a(awa.field_p.length() - 1, false, awa.field_p);
                                return true;
                              } else {
                                return true;
                              }
                            } else {
                              if (null != vla.field_E) {
                                var7 = "[" + vla.field_E + "] ";
                                break L11;
                              } else {
                                var7 = "[" + isa.a(wt.field_b, new String[1], 80) + "] ";
                                var16 = var7 + var15 + ": ";
                                var5 = var5 - ej.field_c.b(var16);
                                if (var5 < ej.field_c.b(awa.field_p.toString())) {
                                  int discarded$41 = 32;
                                  StringBuilder discarded$42 = npa.a(awa.field_p.length() - 1, false, awa.field_p);
                                  return true;
                                } else {
                                  return true;
                                }
                              }
                            }
                          }
                        }
                        var16 = var7 + var15 + ": ";
                        var5 = var5 - ej.field_c.b(var16);
                        break L6;
                      } else {
                        var16 = var7 + var15 + ": ";
                        var7 = var16;
                        var7 = var16;
                        var5 = var5 - ej.field_c.b(var16);
                        if (var5 < ej.field_c.b(awa.field_p.toString())) {
                          int discarded$43 = 32;
                          StringBuilder discarded$44 = npa.a(awa.field_p.length() - 1, false, awa.field_p);
                          return true;
                        } else {
                          return true;
                        }
                      }
                    } else {
                      var18 = (CharSequence) (Object) waa.field_x;
                      int discarded$45 = 0;
                      var14 = isa.a(tia.field_G, new String[1], 108);
                      var7 = var14;
                      var7 = var14;
                      var8 = isa.a(ejb.field_o, new String[1], param2 ^ -30);
                      var7 = var8;
                      var7 = var8;
                      var9 = ej.field_c.b(var14);
                      var10 = ej.field_c.b(var8);
                      if (var10 >= var9) {
                        var5 = var5 - var10;
                        break L6;
                      } else {
                        var5 = var5 - var9;
                        break L6;
                      }
                    }
                  }
                  if (var5 < ej.field_c.b(awa.field_p.toString())) {
                    int discarded$46 = 32;
                    StringBuilder discarded$47 = npa.a(awa.field_p.length() - 1, false, awa.field_p);
                    return true;
                  } else {
                    return true;
                  }
                } else {
                  return true;
                }
              } else {
                return true;
              }
            } else {
              return false;
            }
          } else {
            L12: {
              if (var3 == 0) {
                break L12;
              } else {
                if (awa.field_p.length() <= 0) {
                  break L12;
                } else {
                  int discarded$48 = 32;
                  StringBuilder discarded$49 = npa.a(-1 + awa.field_p.length(), false, awa.field_p);
                  break L12;
                }
              }
            }
            return true;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = "Fullscreen mode was cancelled after a delay of 10 seconds. If you were unable to accept fullscreen mode during this time, there may be a problem with your configuration. You could try restarting your browser and trying again.";
        field_q = "Small defence chassis";
    }
}
