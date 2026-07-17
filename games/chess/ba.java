/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ba extends ma implements nn, mj {
    static String field_M;
    private se field_S;
    static java.applet.Applet field_L;
    static on field_O;
    private fb field_T;
    private vd field_K;
    static byte[] field_Q;
    static String field_N;
    static String field_R;
    static tl[][] field_P;

    private final String a() {
        return "<u=2164A2><col=2164A2>";
    }

    public static void c() {
        field_L = null;
        field_N = null;
        field_O = null;
        field_M = null;
        field_P = null;
        field_Q = null;
        field_R = null;
    }

    final static void a(ak param0, int param1) {
        try {
            nc.field_O.a((o) (Object) param0, (byte) 114);
            if (param1 > -58) {
                field_Q = null;
            }
            sj.a(0, 3, param0);
        } catch (RuntimeException runtimeException) {
            throw fk.a((Throwable) (Object) runtimeException, "ba.A(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + 3 + 41);
        }
    }

    final static boolean b(int param0, int param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        String var5_ref_String = null;
        int var6 = 0;
        String var8 = null;
        String var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        String var13 = null;
        String var14 = null;
        String var15 = null;
        String var16 = null;
        String var17 = null;
        Object var18 = null;
        CharSequence var19 = null;
        L0: {
          var18 = null;
          var12 = Chess.field_G;
          var4 = 24 / ((param2 - -31) / 58);
          var3 = 1;
          if (fl.field_j) {
            break L0;
          } else {
            if (ac.field_l != null) {
              break L0;
            } else {
              var3 = 0;
              break L0;
            }
          }
        }
        L1: {
          if (vk.field_g != 0) {
            break L1;
          } else {
            if (ib.field_d != null) {
              var3 = 0;
              break L1;
            } else {
              break L1;
            }
          }
        }
        L2: {
          if (2 != vk.field_g) {
            break L2;
          } else {
            int discarded$14 = 75;
            if (!jd.b()) {
              var3 = 0;
              break L2;
            } else {
              break L2;
            }
          }
        }
        if (vg.field_a != 84) {
          if (85 != vg.field_a) {
            var5 = d.field_Ib;
            if (!sj.a((byte) -122, (char) var5)) {
              return false;
            } else {
              if (var3 != 0) {
                if (80 > sg.field_c.length()) {
                  L3: {
                    StringBuilder discarded$15 = sg.field_c.append(var5);
                    var6 = 485;
                    var14 = ci.field_J;
                    var8 = var14;
                    var8 = var14;
                    var13 = on.a(-11307, var14);
                    var8 = var13;
                    var8 = var13;
                    var15 = var13;
                    var8 = var15;
                    var8 = var15;
                    if (2 == vk.field_g) {
                      var19 = (CharSequence) (Object) ij.field_c;
                      int discarded$16 = -70;
                      var17 = oc.a(vf.field_d, new String[1], (byte) -80);
                      var9 = oc.a(sa.field_d, new String[1], (byte) -74);
                      var10 = sc.field_a.b(var17);
                      var11 = sc.field_a.b(var9);
                      if (var10 > var11) {
                        var6 = var6 - var10;
                        break L3;
                      } else {
                        var6 = var6 - var11;
                        if (var6 >= sc.field_a.b(sg.field_c.toString())) {
                          return true;
                        } else {
                          StringBuilder discarded$17 = rb.a(' ', sg.field_c, -1 + sg.field_c.length(), (byte) 116);
                          return true;
                        }
                      }
                    } else {
                      var8 = "";
                      if (vk.field_g == 0) {
                        L4: {
                          if (null != pd.field_Rb) {
                            break L4;
                          } else {
                            if (dn.field_b) {
                              var8 = "[" + ja.field_c + "] ";
                              break L4;
                            } else {
                              if (null != pd.field_Rb) {
                                L5: {
                                  if (!qj.field_d) {
                                    var8 = "[" + oc.a(fb.field_D, new String[1], (byte) -125) + "] ";
                                    break L5;
                                  } else {
                                    if (null != kb.field_P) {
                                      var8 = "[" + kb.field_P + "] ";
                                      break L5;
                                    } else {
                                      L6: {
                                        var8 = "[" + oc.a(fb.field_D, new String[1], (byte) -125) + "] ";
                                        var16 = var8 + var15 + ": ";
                                        var6 = var6 - sc.field_a.b(var16);
                                        if (var6 >= sc.field_a.b(sg.field_c.toString())) {
                                          break L6;
                                        } else {
                                          StringBuilder discarded$18 = rb.a(' ', sg.field_c, -1 + sg.field_c.length(), (byte) 116);
                                          break L6;
                                        }
                                      }
                                      return true;
                                    }
                                  }
                                }
                                var16 = var8 + var15 + ": ";
                                var8 = var16;
                                var8 = var16;
                                var6 = var6 - sc.field_a.b(var16);
                                if (var6 >= sc.field_a.b(sg.field_c.toString())) {
                                  return true;
                                } else {
                                  StringBuilder discarded$19 = rb.a(' ', sg.field_c, -1 + sg.field_c.length(), (byte) 116);
                                  return true;
                                }
                              } else {
                                L7: {
                                  var16 = var8 + var15 + ": ";
                                  var8 = var16;
                                  var8 = var16;
                                  var6 = var6 - sc.field_a.b(var16);
                                  if (var6 >= sc.field_a.b(sg.field_c.toString())) {
                                    break L7;
                                  } else {
                                    StringBuilder discarded$20 = rb.a(' ', sg.field_c, -1 + sg.field_c.length(), (byte) 116);
                                    break L7;
                                  }
                                }
                                return true;
                              }
                            }
                          }
                        }
                        L8: {
                          if (null == pd.field_Rb) {
                            break L8;
                          } else {
                            if (!qj.field_d) {
                              var8 = "[" + oc.a(fb.field_D, new String[1], (byte) -125) + "] ";
                              var16 = var8 + var15 + ": ";
                              var6 = var6 - sc.field_a.b(var16);
                              if (var6 >= sc.field_a.b(sg.field_c.toString())) {
                                return true;
                              } else {
                                StringBuilder discarded$21 = rb.a(' ', sg.field_c, -1 + sg.field_c.length(), (byte) 116);
                                return true;
                              }
                            } else {
                              if (null != kb.field_P) {
                                var8 = "[" + kb.field_P + "] ";
                                break L8;
                              } else {
                                var8 = "[" + oc.a(fb.field_D, new String[1], (byte) -125) + "] ";
                                var16 = var8 + var15 + ": ";
                                var6 = var6 - sc.field_a.b(var16);
                                if (var6 >= sc.field_a.b(sg.field_c.toString())) {
                                  return true;
                                } else {
                                  StringBuilder discarded$22 = rb.a(' ', sg.field_c, -1 + sg.field_c.length(), (byte) 116);
                                  return true;
                                }
                              }
                            }
                          }
                        }
                        var16 = var8 + var15 + ": ";
                        var6 = var6 - sc.field_a.b(var16);
                        if (var6 >= sc.field_a.b(sg.field_c.toString())) {
                          return true;
                        } else {
                          StringBuilder discarded$23 = rb.a(' ', sg.field_c, -1 + sg.field_c.length(), (byte) 116);
                          return true;
                        }
                      } else {
                        var16 = var8 + var15 + ": ";
                        var6 = var6 - sc.field_a.b(var16);
                        break L3;
                      }
                    }
                  }
                  if (var6 >= sc.field_a.b(sg.field_c.toString())) {
                    return true;
                  } else {
                    StringBuilder discarded$24 = rb.a(' ', sg.field_c, -1 + sg.field_c.length(), (byte) 116);
                    return true;
                  }
                } else {
                  return true;
                }
              } else {
                return true;
              }
            }
          } else {
            L9: {
              if (var3 == 0) {
                break L9;
              } else {
                if (sg.field_c.length() > 0) {
                  StringBuilder discarded$25 = rb.a(' ', sg.field_c, sg.field_c.length() - 1, (byte) 104);
                  break L9;
                } else {
                  break L9;
                }
              }
            }
            return true;
          }
        } else {
          L10: {
            if (var3 != 0) {
              L11: {
                if (sg.field_c.length() > 0) {
                  var5_ref_String = sg.field_c.toString();
                  if (!ph.a((byte) -125, var5_ref_String)) {
                    L12: {
                      var6 = vk.field_g;
                      if (var6 != 0) {
                        break L12;
                      } else {
                        if (pd.field_Rb == null) {
                          break L12;
                        } else {
                          var6 = 1;
                          break L12;
                        }
                      }
                    }
                    L13: {
                      if (lg.a(-74, var6) == 2) {
                        oj.a(var6, (byte) -99, 1, param1);
                        break L13;
                      } else {
                        break L13;
                      }
                    }
                    ke.a(9822, vk.field_g, ij.field_c, param0, -1, var5_ref_String);
                    break L11;
                  } else {
                    int discarded$26 = 0;
                    lc.a((String) null, (String) null, 2, 0, af.field_b);
                    int discarded$27 = 0;
                    lc.a((String) null, (String) null, 2, 0, kd.field_Eb);
                    break L11;
                  }
                } else {
                  break L11;
                }
              }
              ml.a(0);
              break L10;
            } else {
              if (vk.field_g != 0) {
                ml.a(0);
                break L10;
              } else {
                return true;
              }
            }
          }
          return true;
        }
    }

    ba(vd param0) {
        super(0, 0, 288, 0, (jm) null);
        RuntimeException var2 = null;
        int var3 = 0;
        hl var4 = null;
        int var5 = 0;
        int var6 = 0;
        String var7 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            ((ba) this).field_K = param0;
            ((ba) this).field_T = new fb(sg.field_e, (rg) null);
            ((ba) this).field_T.field_n = (jm) (Object) new sf();
            int discarded$2 = 29917;
            int discarded$3 = -11;
            var7 = oc.a(kl.field_g, new String[2], (byte) -114);
            var3 = 20;
            var4 = new hl(rb.field_b, 0, 0, 0, 0, 16777215, -1, 3, 0, rb.field_b.field_C, -1, 2147483647, true);
            ((ba) this).field_S = new se(var7, (jm) (Object) var4);
            ((ba) this).field_S.field_j = "";
            ((ba) this).field_S.a(-23750, 0, ok.field_Gb);
            ((ba) this).field_S.a(-23750, 1, ok.field_Gb);
            ((ba) this).field_S.field_p = (rg) this;
            ((ba) this).field_S.field_y = -40 + ((ba) this).field_y;
            ((ba) this).field_S.b(26, var3, 1, -40 + ((ba) this).field_y);
            var3 = var3 + (15 + ((ba) this).field_S.field_C);
            ((ba) this).b((mf) (Object) ((ba) this).field_S, 95);
            var5 = 4;
            var6 = 200;
            ((ba) this).field_T.a(var3, 34, 40, var6, 300 - var6 >> 1);
            ((ba) this).field_T.field_p = (rg) this;
            ((ba) this).b((mf) (Object) ((ba) this).field_T, 95);
            ((ba) this).a(0, 34, var5 + 55 + var3, 300, 0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) var2;
            stackOut_3_1 = new StringBuilder().append("ba.<init>(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L1;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L1;
            }
          }
          throw fk.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 41);
        }
    }

    public final void a(fb param0, int param1, int param2, int param3, int param4) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            if (param4 == -24221) {
              L1: {
                if (param0 != ((ba) this).field_T) {
                  break L1;
                } else {
                  int discarded$2 = -128;
                  ij.a();
                  ((ba) this).field_K.k((byte) -123);
                  break L1;
                }
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) runtimeException;
            stackOut_5_1 = new StringBuilder().append("ba.DA(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw fk.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    private final String g() {
        int var2 = -98;
        return "</col></u>";
    }

    final boolean a(char param0, int param1, int param2, mf param3) {
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
        boolean stackIn_7_0 = false;
        boolean stackIn_10_0 = false;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        boolean stackOut_6_0 = false;
        int stackOut_11_0 = 0;
        boolean stackOut_9_0 = false;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            if (super.a(param0, param1, param2, param3)) {
              stackOut_2_0 = 1;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            } else {
              if (param1 == 98) {
                stackOut_6_0 = ((ba) this).a(param3, 27964);
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0;
              } else {
                if (param1 != 99) {
                  stackOut_11_0 = 0;
                  stackIn_12_0 = stackOut_11_0;
                  break L0;
                } else {
                  stackOut_9_0 = ((ba) this).a(param3, (byte) -73);
                  stackIn_10_0 = stackOut_9_0;
                  return stackIn_10_0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var5;
            stackOut_13_1 = new StringBuilder().append("ba.KA(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param3 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L1;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L1;
            }
          }
          throw fk.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 41);
        }
        return stackIn_12_0 != 0;
    }

    public final void a(int param0, byte param1, se param2, int param3) {
        RuntimeException var5 = null;
        int var6 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var6 = Chess.field_G;
        try {
          L0: {
            L1: {
              if (0 != param0) {
                if (param0 == 1) {
                  int discarded$20 = -118;
                  hb.a("privacy.ws");
                  break L1;
                } else {
                  if (param0 == 2) {
                    int discarded$21 = -118;
                    hb.a("conduct.ws");
                    break L1;
                  } else {
                    break L1;
                  }
                }
              } else {
                int discarded$22 = -118;
                hb.a("terms.ws");
                break L1;
              }
            }
            L2: {
              if (param1 == -108) {
                break L2;
              } else {
                boolean discarded$23 = ba.b(55, 20, -68);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var5;
            stackOut_11_1 = new StringBuilder().append("ba.CA(").append(param0).append(44).append(param1).append(44);
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param2 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L3;
            }
          }
          throw fk.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 44 + param3 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_M = "Offline";
        field_N = "Selected piece cannot move";
        field_R = "Elapsed time";
    }
}
