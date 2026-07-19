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

    private final String a(int param0) {
        if (param0 != 29917) {
            field_Q = (byte[]) null;
            return "<u=2164A2><col=2164A2>";
        }
        return "<u=2164A2><col=2164A2>";
    }

    public static void c(boolean param0) {
        ak var2 = null;
        field_L = null;
        field_N = null;
        if (param0) {
          var2 = (ak) null;
          ba.a((ak) null, -29, 127);
          field_O = null;
          field_M = null;
          field_P = (tl[][]) null;
          field_Q = null;
          field_R = null;
          return;
        } else {
          field_O = null;
          field_M = null;
          field_P = (tl[][]) null;
          field_Q = null;
          field_R = null;
          return;
        }
    }

    final static void a(ak param0, int param1, int param2) {
        try {
            nc.field_O.a((o) (param0), (byte) 114);
            if (param1 > -58) {
                field_Q = (byte[]) null;
            }
            sj.a(0, param2, param0);
        } catch (RuntimeException runtimeException) {
            throw fk.a((Throwable) ((Object) runtimeException), "ba.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static boolean b(int param0, int param1, int param2) {
        StringBuilder discarded$10 = null;
        StringBuilder discarded$11 = null;
        StringBuilder discarded$12 = null;
        StringBuilder discarded$13 = null;
        StringBuilder discarded$14 = null;
        StringBuilder discarded$15 = null;
        StringBuilder discarded$16 = null;
        StringBuilder discarded$17 = null;
        StringBuilder discarded$18 = null;
        StringBuilder discarded$19 = null;
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
        String var18 = null;
        String var19 = null;
        String var21 = null;
        String var22 = null;
        String var23 = null;
        String var24 = null;
        String var25 = null;
        String var26 = null;
        String var27 = null;
        String var28 = null;
        String var29 = null;
        String var30 = null;
        String var31 = null;
        Object var32 = null;
        CharSequence var33 = null;
        L0: {
          var32 = null;
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
            if (!jd.b((byte) 75)) {
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
            if (sj.a((byte) -122, (char) var5)) {
              if (var3 != 0) {
                if (80 > sg.field_c.length()) {
                  L3: {
                    discarded$10 = sg.field_c.append((char) var5);
                    var6 = 485;
                    var18 = ci.field_J;
                    var17 = on.a(-11307, var18);
                    var19 = var17;
                    if (2 == vk.field_g) {
                      var33 = (CharSequence) ((Object) ij.field_c);
                      var21 = oc.a(vf.field_d, new String[]{rl.a(var33, (byte) -70)}, (byte) -80);
                      var9 = oc.a(sa.field_d, new String[]{var17}, (byte) -74);
                      var10 = sc.field_a.b(var21);
                      var11 = sc.field_a.b(var9);
                      if (var10 > var11) {
                        var6 = var6 - var10;
                        break L3;
                      } else {
                        var6 = var6 - var11;
                        if (var6 < sc.field_a.b(sg.field_c.toString())) {
                          discarded$11 = rb.a(' ', sg.field_c, -1 + sg.field_c.length(), (byte) 116);
                          return true;
                        } else {
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
                                    var8 = "[" + oc.a(fb.field_D, new String[]{pd.field_Rb.field_Gb}, (byte) -125) + "] ";
                                    break L5;
                                  } else {
                                    if (null != kb.field_P) {
                                      var8 = "[" + kb.field_P + "] ";
                                      break L5;
                                    } else {
                                      L6: {
                                        var24 = "[" + oc.a(fb.field_D, new String[]{pd.field_Rb.field_Gb}, (byte) -125) + "] ";
                                        var25 = var24 + var19 + ": ";
                                        var6 = var6 - sc.field_a.b(var25);
                                        if (var6 >= sc.field_a.b(sg.field_c.toString())) {
                                          break L6;
                                        } else {
                                          discarded$12 = rb.a(' ', sg.field_c, -1 + sg.field_c.length(), (byte) 116);
                                          break L6;
                                        }
                                      }
                                      return true;
                                    }
                                  }
                                }
                                var26 = var8 + var19 + ": ";
                                var6 = var6 - sc.field_a.b(var26);
                                if (var6 < sc.field_a.b(sg.field_c.toString())) {
                                  discarded$13 = rb.a(' ', sg.field_c, -1 + sg.field_c.length(), (byte) 116);
                                  return true;
                                } else {
                                  return true;
                                }
                              } else {
                                L7: {
                                  var23 = var8 + var19 + ": ";
                                  var6 = var6 - sc.field_a.b(var23);
                                  if (var6 >= sc.field_a.b(sg.field_c.toString())) {
                                    break L7;
                                  } else {
                                    discarded$14 = rb.a(' ', sg.field_c, -1 + sg.field_c.length(), (byte) 116);
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
                              var29 = "[" + oc.a(fb.field_D, new String[]{pd.field_Rb.field_Gb}, (byte) -125) + "] ";
                              var30 = var29 + var19 + ": ";
                              var6 = var6 - sc.field_a.b(var30);
                              if (var6 < sc.field_a.b(sg.field_c.toString())) {
                                discarded$15 = rb.a(' ', sg.field_c, -1 + sg.field_c.length(), (byte) 116);
                                return true;
                              } else {
                                return true;
                              }
                            } else {
                              if (null != kb.field_P) {
                                var8 = "[" + kb.field_P + "] ";
                                break L8;
                              } else {
                                var27 = "[" + oc.a(fb.field_D, new String[]{pd.field_Rb.field_Gb}, (byte) -125) + "] ";
                                var28 = var27 + var19 + ": ";
                                var6 = var6 - sc.field_a.b(var28);
                                if (var6 < sc.field_a.b(sg.field_c.toString())) {
                                  discarded$16 = rb.a(' ', sg.field_c, -1 + sg.field_c.length(), (byte) 116);
                                  return true;
                                } else {
                                  return true;
                                }
                              }
                            }
                          }
                        }
                        var31 = var8 + var19 + ": ";
                        var6 = var6 - sc.field_a.b(var31);
                        if (var6 < sc.field_a.b(sg.field_c.toString())) {
                          discarded$17 = rb.a(' ', sg.field_c, -1 + sg.field_c.length(), (byte) 116);
                          return true;
                        } else {
                          return true;
                        }
                      } else {
                        var22 = var8 + var19 + ": ";
                        var6 = var6 - sc.field_a.b(var22);
                        break L3;
                      }
                    }
                  }
                  if (var6 >= sc.field_a.b(sg.field_c.toString())) {
                    return true;
                  } else {
                    discarded$18 = rb.a(' ', sg.field_c, -1 + sg.field_c.length(), (byte) 116);
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
            L9: {
              if (var3 == 0) {
                break L9;
              } else {
                if (-1 > (sg.field_c.length() ^ -1)) {
                  discarded$19 = rb.a(' ', sg.field_c, sg.field_c.length() - 1, (byte) 104);
                  break L9;
                } else {
                  break L9;
                }
              }
            }
            return true;
          }
        } else {
          if (var3 == 0) {
            if (vk.field_g == 0) {
              return true;
            } else {
              ml.a(0);
              return true;
            }
          } else {
            L10: {
              if (-1 > (sg.field_c.length() ^ -1)) {
                var5_ref_String = sg.field_c.toString();
                if (!ph.a((byte) -125, var5_ref_String)) {
                  L11: {
                    var6 = vk.field_g;
                    if (-1 != (var6 ^ -1)) {
                      break L11;
                    } else {
                      if (pd.field_Rb == null) {
                        break L11;
                      } else {
                        var6 = 1;
                        break L11;
                      }
                    }
                  }
                  L12: {
                    if (-3 == (lg.a(-74, var6) ^ -1)) {
                      oj.a(var6, (byte) -99, 1, param1);
                      break L12;
                    } else {
                      break L12;
                    }
                  }
                  ke.a(9822, vk.field_g, ij.field_c, param0, -1, var5_ref_String);
                  break L10;
                } else {
                  var14 = (String) null;
                  var13 = (String) null;
                  lc.a((String) null, (String) null, 2, 0, af.field_b, false);
                  var16 = (String) null;
                  var15 = (String) null;
                  lc.a((String) null, (String) null, 2, 0, kd.field_Eb, false);
                  break L10;
                }
              } else {
                break L10;
              }
            }
            ml.a(0);
            return true;
          }
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
            this.field_K = param0;
            this.field_T = new fb(sg.field_e, (rg) null);
            this.field_T.field_n = (jm) ((Object) new sf());
            var7 = oc.a(kl.field_g, new String[]{this.a(29917), this.g((byte) -11)}, (byte) -114);
            var3 = 20;
            var4 = new hl(rb.field_b, 0, 0, 0, 0, 16777215, -1, 3, 0, rb.field_b.field_C, -1, 2147483647, true);
            this.field_S = new se(var7, var4);
            this.field_S.field_j = "";
            this.field_S.a(-23750, 0, ok.field_Gb);
            this.field_S.a(-23750, 1, ok.field_Gb);
            this.field_S.field_p = (rg) (this);
            this.field_S.field_y = -40 + this.field_y;
            this.field_S.b(26, var3, 1, -40 + this.field_y);
            var3 = var3 + (15 + this.field_S.field_C);
            this.b(this.field_S, 95);
            var5 = 4;
            var6 = 200;
            this.field_T.a(var3, 34, 40, var6, 300 - var6 >> -1492480639);
            this.field_T.field_p = (rg) (this);
            this.b(this.field_T, 95);
            this.a(0, 34, var5 + 55 + var3, 300, 0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) (var2);
            stackOut_3_1 = new StringBuilder().append("ba.<init>(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L1;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L1;
            }
          }
          throw fk.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
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
        int decompiledRegionSelector0 = 0;
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
                if (param0 != this.field_T) {
                  break L1;
                } else {
                  ij.a(-128);
                  this.field_K.k((byte) -123);
                  break L1;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (runtimeException);
            stackOut_5_1 = new StringBuilder().append("ba.DA(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw fk.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final String g(byte param0) {
        int var2 = 98 / ((param0 - 46) / 41);
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
        int decompiledRegionSelector0 = 0;
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
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if ((param1 ^ -1) == -99) {
                stackOut_6_0 = this.a(param3, 27964);
                stackIn_7_0 = stackOut_6_0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (param1 != 99) {
                  stackOut_11_0 = 0;
                  stackIn_12_0 = stackOut_11_0;
                  decompiledRegionSelector0 = 3;
                  break L0;
                } else {
                  stackOut_9_0 = this.a(param3, (byte) -73);
                  stackIn_10_0 = stackOut_9_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) (var5);
            stackOut_13_1 = new StringBuilder().append("ba.KA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param3 == null) {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L1;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L1;
            }
          }
          throw fk.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_10_0;
            } else {
              return stackIn_12_0 != 0;
            }
          }
        }
    }

    public final void a(int param0, byte param1, se param2, int param3) {
        boolean discarded$1 = false;
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
                  hb.a("privacy.ws", (byte) -118);
                  break L1;
                } else {
                  if (param0 == 2) {
                    hb.a("conduct.ws", (byte) -118);
                    break L1;
                  } else {
                    break L1;
                  }
                }
              } else {
                hb.a("terms.ws", (byte) -118);
                break L1;
              }
            }
            L2: {
              if (param1 == -108) {
                break L2;
              } else {
                discarded$1 = ba.b(55, 20, -68);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) (var5);
            stackOut_11_1 = new StringBuilder().append("ba.CA(").append(param0).append(',').append(param1).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param2 == null) {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L3;
            }
          }
          throw fk.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param3 + ')');
        }
    }

    static {
        field_M = "Offline";
        field_N = "Selected piece cannot move";
        field_R = "Elapsed time";
    }
}
