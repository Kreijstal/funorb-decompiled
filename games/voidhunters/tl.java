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
        if (param1 != -22699) {
            tl.e((byte) -97);
            alb.field_b = param2;
            pba.field_r = param0;
            return;
        }
        alb.field_b = param2;
        pba.field_r = param0;
    }

    final nc a(nc[] param0, int param1) {
        boolean discarded$2 = false;
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
                discarded$2 = tl.b(125, -116, 41);
                break L1;
              }
            }
            si.a(231, 62, param0[0].a(21));
            stackOut_2_0 = new nc("void");
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var3);
            stackOut_4_1 = new StringBuilder().append("tl.A(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    public static void e(byte param0) {
        boolean discarded$0 = false;
        field_o = null;
        if (param0 != -15) {
            discarded$0 = tl.b(-46, 57, -52);
            field_q = null;
            return;
        }
        field_q = null;
    }

    final static boolean b(int param0, int param1, int param2) {
        StringBuilder discarded$9 = null;
        StringBuilder discarded$10 = null;
        StringBuilder discarded$11 = null;
        StringBuilder discarded$12 = null;
        StringBuilder discarded$13 = null;
        StringBuilder discarded$14 = null;
        StringBuilder discarded$15 = null;
        StringBuilder discarded$16 = null;
        StringBuilder discarded$17 = null;
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
        String var17 = null;
        String var18 = null;
        String var19 = null;
        String var35 = null;
        String var36 = null;
        String var37 = null;
        String var38 = null;
        String var39 = null;
        String var40 = null;
        String var41 = null;
        String var42 = null;
        String var43 = null;
        String var44 = null;
        String var45 = null;
        Object var46 = null;
        CharSequence var47 = null;
        L0: {
          var46 = null;
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
        if (param2 == (pma.field_o ^ -1)) {
          if (var3 != 0) {
            if ((awa.field_p.length() ^ -1) >= -1) {
              dr.a(26718);
              return true;
            } else {
              L3: {
                var4_ref_String = awa.field_p.toString();
                if (!hnb.a((byte) -92, var4_ref_String)) {
                  L4: {
                    var5 = ow.field_b;
                    if (-1 != (var5 ^ -1)) {
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
                    if (2 == jia.a(var5, (byte) 19)) {
                      mea.a(1, (byte) -76, param1, var5);
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  va.a(var4_ref_String, param2 + -25634, -1, param0, ow.field_b, waa.field_x);
                  break L3;
                } else {
                  var13 = (String) null;
                  var12 = (String) null;
                  lh.a((byte) -70, 0, (String) null, (String) null, wl.field_p, 2);
                  var15 = (String) null;
                  var14 = (String) null;
                  lh.a((byte) -62, 0, (String) null, (String) null, lv.field_o, 2);
                  break L3;
                }
              }
              dr.a(26718);
              return true;
            }
          } else {
            if (ow.field_b != 0) {
              dr.a(26718);
              return true;
            } else {
              return true;
            }
          }
        } else {
          if (pma.field_o != 85) {
            var4 = jl.field_r;
            if (oga.a((char) var4, (byte) 32)) {
              if (var3 != 0) {
                if (awa.field_p.length() < 80) {
                  L6: {
                    discarded$9 = awa.field_p.append((char) var4);
                    var5 = 485;
                    var17 = kca.field_a;
                    var16 = gfb.a(1, var17);
                    var19 = var16;
                    if ((ow.field_b ^ -1) != -3) {
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
                                        var36 = "[" + isa.a(wt.field_b, new String[]{lqa.field_o.field_Vb}, 80) + "] ";
                                        var37 = var36 + var19 + ": ";
                                        var5 = var5 - ej.field_c.b(var37);
                                        if (var5 >= ej.field_c.b(awa.field_p.toString())) {
                                          break L9;
                                        } else {
                                          discarded$10 = npa.a(awa.field_p.length() - 1, false, awa.field_p, ' ');
                                          break L9;
                                        }
                                      }
                                      return true;
                                    }
                                  } else {
                                    L10: {
                                      var38 = "[" + isa.a(wt.field_b, new String[]{lqa.field_o.field_Vb}, 80) + "] ";
                                      var39 = var38 + var19 + ": ";
                                      var5 = var5 - ej.field_c.b(var39);
                                      if (var5 >= ej.field_c.b(awa.field_p.toString())) {
                                        break L10;
                                      } else {
                                        discarded$11 = npa.a(awa.field_p.length() - 1, false, awa.field_p, ' ');
                                        break L10;
                                      }
                                    }
                                    return true;
                                  }
                                }
                              }
                              var40 = var7 + var19 + ": ";
                              var5 = var5 - ej.field_c.b(var40);
                              if (var5 < ej.field_c.b(awa.field_p.toString())) {
                                discarded$12 = npa.a(awa.field_p.length() - 1, false, awa.field_p, ' ');
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
                              var43 = "[" + isa.a(wt.field_b, new String[]{lqa.field_o.field_Vb}, 80) + "] ";
                              var44 = var43 + var19 + ": ";
                              var5 = var5 - ej.field_c.b(var44);
                              if (var5 < ej.field_c.b(awa.field_p.toString())) {
                                discarded$13 = npa.a(awa.field_p.length() - 1, false, awa.field_p, ' ');
                                return true;
                              } else {
                                return true;
                              }
                            } else {
                              if (null != vla.field_E) {
                                var7 = "[" + vla.field_E + "] ";
                                break L11;
                              } else {
                                var41 = "[" + isa.a(wt.field_b, new String[]{lqa.field_o.field_Vb}, 80) + "] ";
                                var42 = var41 + var19 + ": ";
                                var5 = var5 - ej.field_c.b(var42);
                                if (var5 < ej.field_c.b(awa.field_p.toString())) {
                                  discarded$14 = npa.a(awa.field_p.length() - 1, false, awa.field_p, ' ');
                                  return true;
                                } else {
                                  return true;
                                }
                              }
                            }
                          }
                        }
                        var45 = var7 + var19 + ": ";
                        var5 = var5 - ej.field_c.b(var45);
                        break L6;
                      } else {
                        var35 = var7 + var19 + ": ";
                        var5 = var5 - ej.field_c.b(var35);
                        if (var5 < ej.field_c.b(awa.field_p.toString())) {
                          discarded$15 = npa.a(awa.field_p.length() - 1, false, awa.field_p, ' ');
                          return true;
                        } else {
                          return true;
                        }
                      }
                    } else {
                      var47 = (CharSequence) ((Object) waa.field_x);
                      var18 = isa.a(tia.field_G, new String[]{joa.a(var47, false)}, 108);
                      var8 = isa.a(ejb.field_o, new String[]{var16}, param2 ^ -30);
                      var9 = ej.field_c.b(var18);
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
                    discarded$16 = npa.a(awa.field_p.length() - 1, false, awa.field_p, ' ');
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
                  discarded$17 = npa.a(-1 + awa.field_p.length(), false, awa.field_p, ' ');
                  break L12;
                }
              }
            }
            return true;
          }
        }
    }

    static {
        field_o = "Fullscreen mode was cancelled after a delay of 10 seconds. If you were unable to accept fullscreen mode during this time, there may be a problem with your configuration. You could try restarting your browser and trying again.";
        field_q = "Small defence chassis";
    }
}
