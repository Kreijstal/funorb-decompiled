/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class bi extends fc {
    String field_u;
    private boolean field_t;
    static char[] field_s;
    private int field_r;
    private int field_o;
    private boolean field_q;
    private int field_v;
    private long field_w;
    private boolean field_y;
    static int[] field_B;
    static long field_z;
    private int field_x;
    private int field_p;
    private int field_n;

    private final void g(int param0) {
        ok.field_c[8] = -2;
        ok.field_c[5] = -1;
        ok.field_c[2] = -2;
        ok.field_c[4] = -1;
        if (param0 >= -48) {
            int discarded$0 = ((bi) this).a(true, 104);
        }
        ok.field_c[12] = -1;
        ok.field_c[7] = -1;
        ok.field_c[13] = -1;
        ok.field_c[1] = 16;
        ok.field_c[11] = -1;
        ok.field_c[10] = -1;
        ok.field_c[9] = -1;
        ok.field_c[16] = -1;
        ok.field_c[6] = -2;
        ok.field_c[17] = -1;
        ok.field_c[3] = -1;
        ok.field_c[18] = 1;
    }

    public static void d(byte param0) {
        field_B = null;
        int var1 = -73;
        field_s = null;
    }

    final static am a(String param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        am stackIn_12_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        am stackOut_11_0 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var5 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            var2_int = param0.length();
            var3 = 0;
            L1: while (true) {
              if (var2_int <= var3) {
                stackOut_11_0 = lh.field_c;
                stackIn_12_0 = stackOut_11_0;
                break L0;
              } else {
                var4 = param0.charAt(var3);
                if (var4 >= 48) {
                  if (57 >= var4) {
                    var3++;
                    continue L1;
                  } else {
                    return null;
                  }
                } else {
                  return null;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var2;
            stackOut_13_1 = new StringBuilder().append("bi.R(");
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L2;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L2;
            }
          }
          throw la.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ',' + 5000 + ')');
        }
        return stackIn_12_0;
    }

    final int f(int param0) {
        int var2 = 0;
        L0: {
          L1: {
            var2 = this.j(param0 ^ 8214);
            if (var2 == 0) {
              break L1;
            } else {
              if (1 == var2) {
                break L1;
              } else {
                break L0;
              }
            }
          }
          L2: {
            if (eg.field_k[1]) {
              wi.a(2, param0 ^ 1198);
              break L2;
            } else {
              break L2;
            }
          }
          L3: {
            if (!eg.field_k[2]) {
              break L3;
            } else {
              db.a(3, 126);
              break L3;
            }
          }
          L4: {
            if (eg.field_k[3]) {
              d.a(4, param0 + 2);
              break L4;
            } else {
              break L4;
            }
          }
          L5: {
            if (!eg.field_k[4]) {
              break L5;
            } else {
              qi.a(false, 5);
              break L5;
            }
          }
          L6: {
            if (eg.field_k[5]) {
              wd.a(6, true);
              break L6;
            } else {
              break L6;
            }
          }
          L7: {
            if (eg.field_k[6]) {
              sl.a(7, (byte) 63);
              break L7;
            } else {
              break L7;
            }
          }
          if (!eg.field_k[8]) {
            break L0;
          } else {
            df.f((byte) -98);
            break L0;
          }
        }
        L8: {
          if (param0 == 3) {
            break L8;
          } else {
            ((bi) this).field_w = -33L;
            break L8;
          }
        }
        return var2;
    }

    final int a(boolean param0, int param1) {
        if (param1 != 4) {
            this.a(34, true);
        }
        return this.a(true, true, param0);
    }

    private final void d(boolean param0) {
        eg.field_k[4] = true;
    }

    private final void e(byte param0) {
        eg.field_k[2] = true;
    }

    final static boolean a(CharSequence param0, int param1, boolean param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_3_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_32_0 = 0;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_36_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_12_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        String stackOut_35_2 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        var8 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            if (param0 != null) {
              L1: {
                var3_int = param0.length();
                if (var3_int < 1) {
                  break L1;
                } else {
                  if (var3_int > 12) {
                    break L1;
                  } else {
                    var4 = pl.a((byte) 100, param0);
                    if (var4 == null) {
                      stackOut_12_0 = 0;
                      stackIn_13_0 = stackOut_12_0;
                      return stackIn_13_0 != 0;
                    } else {
                      if (var4.length() >= 1) {
                        L2: {
                          if (ok.a(-121, var4.charAt(0))) {
                            break L2;
                          } else {
                            if (ok.a(-77, var4.charAt(var4.length() + -1))) {
                              break L2;
                            } else {
                              var5 = 0;
                              var6 = 0;
                              L3: while (true) {
                                if (~var6 <= ~param0.length()) {
                                  if (var5 <= 0) {
                                    stackOut_31_0 = 1;
                                    stackIn_32_0 = stackOut_31_0;
                                    break L0;
                                  } else {
                                    stackOut_29_0 = 0;
                                    stackIn_30_0 = stackOut_29_0;
                                    return stackIn_30_0 != 0;
                                  }
                                } else {
                                  L4: {
                                    var7 = param0.charAt(var6);
                                    if (ok.a(-113, (char) var7)) {
                                      var5++;
                                      break L4;
                                    } else {
                                      var5 = 0;
                                      break L4;
                                    }
                                  }
                                  if (var5 < 2) {
                                    var6++;
                                    continue L3;
                                  } else {
                                    stackOut_25_0 = 0;
                                    stackIn_26_0 = stackOut_25_0;
                                    return stackIn_26_0 != 0;
                                  }
                                }
                              }
                            }
                          }
                        }
                        stackOut_17_0 = 0;
                        stackIn_18_0 = stackOut_17_0;
                        return stackIn_18_0 != 0;
                      } else {
                        return false;
                      }
                    }
                  }
                }
              }
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              return stackIn_8_0 != 0;
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackOut_33_0 = (RuntimeException) var3;
            stackOut_33_1 = new StringBuilder().append("bi.P(");
            stackIn_35_0 = stackOut_33_0;
            stackIn_35_1 = stackOut_33_1;
            stackIn_34_0 = stackOut_33_0;
            stackIn_34_1 = stackOut_33_1;
            if (param0 == null) {
              stackOut_35_0 = (RuntimeException) (Object) stackIn_35_0;
              stackOut_35_1 = (StringBuilder) (Object) stackIn_35_1;
              stackOut_35_2 = "null";
              stackIn_36_0 = stackOut_35_0;
              stackIn_36_1 = stackOut_35_1;
              stackIn_36_2 = stackOut_35_2;
              break L5;
            } else {
              stackOut_34_0 = (RuntimeException) (Object) stackIn_34_0;
              stackOut_34_1 = (StringBuilder) (Object) stackIn_34_1;
              stackOut_34_2 = "{...}";
              stackIn_36_0 = stackOut_34_0;
              stackIn_36_1 = stackOut_34_1;
              stackIn_36_2 = stackOut_34_2;
              break L5;
            }
          }
          throw la.a((Throwable) (Object) stackIn_36_0, stackIn_36_2 + ',' + 20558 + ',' + false + ')');
        }
        return stackIn_32_0 != 0;
    }

    private final void a(int param0, boolean param1) {
        eg.field_k[18] = true;
        eg.field_k[7] = true;
        eg.field_k[8] = param1;
        eg.field_k[16] = true;
        if (param0 != -2) {
            return;
        }
        eg.field_k[3] = true;
        eg.field_k[17] = true;
        eg.field_k[0] = true;
    }

    final void a(boolean param0, int param1, boolean param2, boolean param3, boolean param4) {
        if (param1 != 4472) {
            return;
        }
        this.a(-2, false);
        if (!(!param0)) {
            this.e(19887);
        }
        if (param2) {
            this.e((byte) -121);
        }
        if (param3) {
            this.d(false);
        }
        if (param4) {
            this.h(9);
        }
    }

    private final void f(byte param0) {
        int var3 = 83;
        String var2 = lh.a((byte) -110);
        mk.a(var2, (byte) -5, ii.a(false));
    }

    final void i(int param0) {
        int var3 = MonkeyPuzzle2.field_F ? 1 : 0;
        if (param0 != 250) {
            return;
        }
        if (vg.c(false)) {
            int discarded$1 = this.a(false, true, null != ba.field_f ? true : false);
        } else {
            if (mc.field_a < 10) {
            } else {
                if (!ub.b(true)) {
                    ak.a((byte) 99);
                } else {
                    if (k.field_g == 0) {
                        int discarded$3 = this.a(false, true, false);
                    } else {
                        b.a(-21342, ab.field_d);
                    }
                }
            }
        }
    }

    private final void a(int param0, int param1, String param2, boolean param3, int param4) {
        Exception var6 = null;
        RuntimeException var6_ref = null;
        String var6_ref2 = null;
        String var7 = null;
        String var8 = null;
        String var9 = null;
        Object var10 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        Throwable decompiledCaughtException = null;
        Object stackOut_2_0 = null;
        Object stackOut_3_0 = null;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        Object stackOut_4_0 = null;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        try {
          try {
            L0: {
              if (((bi) this).b((byte) -66)) {
                L1: {
                  L2: {
                    ((bi) this).field_u = ((bi) this).getCodeBase().getHost();
                    var6_ref2 = ((bi) this).field_u.toLowerCase();
                    stackOut_2_0 = this;
                    stackIn_5_0 = stackOut_2_0;
                    stackIn_3_0 = stackOut_2_0;
                    if (var6_ref2.equals((Object) (Object) "jagex.com")) {
                      break L2;
                    } else {
                      stackOut_3_0 = this;
                      stackIn_6_0 = stackOut_3_0;
                      stackIn_4_0 = stackOut_3_0;
                      if (!var6_ref2.endsWith(".jagex.com")) {
                        stackOut_6_0 = this;
                        stackOut_6_1 = 0;
                        stackIn_7_0 = stackOut_6_0;
                        stackIn_7_1 = stackOut_6_1;
                        break L1;
                      } else {
                        stackOut_4_0 = this;
                        stackIn_5_0 = stackOut_4_0;
                        break L2;
                      }
                    }
                  }
                  stackOut_5_0 = this;
                  stackOut_5_1 = 1;
                  stackIn_7_0 = stackOut_5_0;
                  stackIn_7_1 = stackOut_5_1;
                  break L1;
                }
                L3: {
                  ((bi) this).field_y = stackIn_7_1 != 0;
                  ((bi) this).field_r = Integer.parseInt(((bi) this).getParameter("gameport1"));
                  ((bi) this).field_x = Integer.parseInt(((bi) this).getParameter("gameport2"));
                  var7 = ((bi) this).getParameter("servernum");
                  if (var7 != null) {
                    ((bi) this).field_v = Integer.parseInt(var7);
                    break L3;
                  } else {
                    break L3;
                  }
                }
                L4: {
                  ((bi) this).field_p = Integer.parseInt(((bi) this).getParameter("gamecrc"));
                  ((bi) this).field_w = Long.parseLong(((bi) this).getParameter("instanceid"));
                  ((bi) this).field_t = ((bi) this).getParameter("member").equals((Object) (Object) "yes");
                  var8 = ((bi) this).getParameter("lang");
                  if (var8 == null) {
                    break L4;
                  } else {
                    ((bi) this).field_o = Integer.parseInt(var8);
                    break L4;
                  }
                }
                L5: {
                  if (((bi) this).field_o < 5) {
                    break L5;
                  } else {
                    ((bi) this).field_o = 0;
                    break L5;
                  }
                }
                L6: {
                  var9 = ((bi) this).getParameter("affid");
                  if (var9 == null) {
                    break L6;
                  } else {
                    ((bi) this).field_n = Integer.parseInt(var9);
                    break L6;
                  }
                }
                la.field_o = Boolean.valueOf(((bi) this).getParameter("simplemode")).booleanValue();
                ((bi) this).a(param0, 640, ((bi) this).field_p, 480, 32, param2, (byte) -48);
                break L0;
              } else {
                return;
              }
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            L7: {
              var6 = (Exception) (Object) decompiledCaughtException;
              var10 = null;
              kk.a((String) null, (byte) 110, (Throwable) (Object) var6);
              ((bi) this).a((byte) 87, "crash");
              break L7;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L8: {
            var6_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) var6_ref;
            stackOut_20_1 = new StringBuilder().append("bi.V(").append(param0).append(',').append(480).append(',');
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param2 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L8;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L8;
            }
          }
          throw la.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + ',' + true + ',' + 640 + ')');
        }
    }

    final void a(byte param0, boolean param1) {
        int var3 = 0;
        java.awt.Dimension var4 = null;
        int var5 = 0;
        java.awt.Container var6 = null;
        int stackIn_27_0 = 0;
        int stackIn_110_0 = 0;
        int stackIn_111_0 = 0;
        int stackIn_111_1 = 0;
        int stackIn_112_0 = 0;
        int stackIn_112_1 = 0;
        int stackIn_113_0 = 0;
        int stackIn_113_1 = 0;
        int stackIn_113_2 = 0;
        int stackIn_143_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_109_0 = 0;
        int stackOut_108_0 = 0;
        int stackOut_110_0 = 0;
        int stackOut_110_1 = 0;
        int stackOut_112_0 = 0;
        int stackOut_112_1 = 0;
        int stackOut_112_2 = 0;
        int stackOut_111_0 = 0;
        int stackOut_111_1 = 0;
        int stackOut_111_2 = 0;
        int stackOut_142_0 = 0;
        int stackOut_141_0 = 0;
        L0: {
          var5 = MonkeyPuzzle2.field_F ? 1 : 0;
          if (ci.field_a != null) {
            L1: {
              if (ba.field_f == null) {
                var6 = hd.b(true);
                var4 = var6.getSize();
                ci.field_a.a(-124, var4.width, var4.height);
                break L1;
              } else {
                break L1;
              }
            }
            ci.field_a.b(param0 ^ -73);
            break L0;
          } else {
            break L0;
          }
        }
        L2: {
          kc.a((byte) 93);
          db.a(param0 + -99);
          if (wj.d(-106)) {
            break L2;
          } else {
            if (k.field_g != 11) {
              cd.b(110);
              break L2;
            } else {
              break L2;
            }
          }
        }
        L3: {
          if (eb.field_A != null) {
            ab.field_d = eb.field_A.a(true);
            break L3;
          } else {
            break L3;
          }
        }
        L4: {
          if (param0 == 99) {
            break L4;
          } else {
            ((bi) this).field_v = -121;
            break L4;
          }
        }
        L5: {
          if (!cb.a(false)) {
            break L5;
          } else {
            L6: {
              var3 = 1200 * gg.c(0);
              if (((bi) this).field_q) {
                break L6;
              } else {
                if (var3 >= qa.b(125)) {
                  break L5;
                } else {
                  if (var3 < rh.a(1)) {
                    break L6;
                  } else {
                    break L5;
                  }
                }
              }
            }
            ((bi) this).field_q = false;
            gk.a(-1);
            cf.a((byte) 108);
            pc.a((byte) -46, 2, dc.field_b);
            dd.a(0);
            qj.field_J = true;
            ha.field_ab = 15000L + pf.a(0);
            break L5;
          }
        }
        L7: {
          L8: {
            if (bl.field_m == -1) {
              break L8;
            } else {
              if (bl.field_m != 0) {
                break L7;
              } else {
                break L8;
              }
            }
          }
          L9: {
            if (bl.field_m != -1) {
              stackOut_26_0 = 0;
              stackIn_27_0 = stackOut_26_0;
              break L9;
            } else {
              stackOut_25_0 = 1;
              stackIn_27_0 = stackOut_25_0;
              break L9;
            }
          }
          L10: {
            var3 = stackIn_27_0;
            bl.field_m = kh.a((byte) -93);
            if (var3 == 0) {
              break L10;
            } else {
              if (bl.field_m != 0) {
                break L10;
              } else {
                if (11 != k.field_g) {
                  break L10;
                } else {
                  if (!ld.b(true)) {
                    db.a(false);
                    break L10;
                  } else {
                    break L10;
                  }
                }
              }
            }
          }
          if (bl.field_m == -1) {
            break L7;
          } else {
            if (bl.field_m != 0) {
              ha.field_ab = pf.a(param0 + -99) - -15000L;
              break L7;
            } else {
              break L7;
            }
          }
        }
        L11: {
          if (bl.field_m == -1) {
            break L11;
          } else {
            if (0 != bl.field_m) {
              if (mc.field_a < 10) {
                if (bl.field_m != 3) {
                  if (bl.field_m != 4) {
                    if (bl.field_m != 2) {
                      if (bl.field_m != 5) {
                        ((bi) this).a((byte) 105, "js5connect");
                        break L11;
                      } else {
                        ((bi) this).a((byte) 58, "outofdate");
                        break L11;
                      }
                    } else {
                      ((bi) this).a((byte) 82, "js5connect_full");
                      break L11;
                    }
                  } else {
                    ((bi) this).a((byte) 123, "js5io");
                    break L11;
                  }
                } else {
                  ((bi) this).a((byte) 62, "js5crc");
                  break L11;
                }
              } else {
                if (10 > k.field_g) {
                  break L11;
                } else {
                  L12: {
                    cf.a((byte) 92);
                    if (bl.field_m == 3) {
                      pc.a((byte) -46, 256, qi.field_A);
                      break L12;
                    } else {
                      if (bl.field_m != 4) {
                        if (bl.field_m != 2) {
                          if (5 != bl.field_m) {
                            pc.a((byte) -46, 256, me.field_h);
                            break L12;
                          } else {
                            pc.a((byte) -46, 5, sc.field_b);
                            break L12;
                          }
                        } else {
                          pc.a((byte) -46, 256, vi.field_a);
                          break L12;
                        }
                      } else {
                        pc.a((byte) -46, 256, ia.field_c);
                        break L12;
                      }
                    }
                  }
                  qj.field_J = true;
                  break L11;
                }
              }
            } else {
              break L11;
            }
          }
        }
        L13: {
          L14: {
            L15: {
              if (bl.field_m == -1) {
                break L15;
              } else {
                if (0 != bl.field_m) {
                  break L14;
                } else {
                  break L15;
                }
              }
            }
            if (!ld.b(true)) {
              break L13;
            } else {
              break L14;
            }
          }
          if (pf.a(param0 + -99) >= ha.field_ab) {
            qj.field_J = false;
            if (-1 == bl.field_m) {
              break L13;
            } else {
              if (bl.field_m != 0) {
                bl.field_m = -1;
                ff.a(64);
                break L13;
              } else {
                break L13;
              }
            }
          } else {
            break L13;
          }
        }
        L16: {
          if (bl.field_m != 0) {
            break L16;
          } else {
            if (!ld.b(true)) {
              lh.field_e = false;
              break L16;
            } else {
              break L16;
            }
          }
        }
        L17: {
          if (mc.field_a != 0) {
            break L17;
          } else {
            if (gh.a(false)) {
              mc.field_a = 1;
              break L17;
            } else {
              break L17;
            }
          }
        }
        L18: {
          if (mc.field_a == 1) {
            L19: {
              if (fe.field_h != 0) {
                ec.field_a = ol.a(-107, pl.field_g);
                break L19;
              } else {
                break L19;
              }
            }
            fj.field_B = b.a(false, 1, true, ph.field_c, (byte) 125);
            hf.field_a = b.a(false, 1, true, nd.field_e, (byte) -118);
            ii.field_m = b.a(false, 1, true, uk.field_q, (byte) -51);
            mc.field_a = 2;
            wj.field_j = fj.field_B;
            ri.field_a = hf.field_a;
            break L18;
          } else {
            break L18;
          }
        }
        L20: {
          if (mc.field_a == 2) {
            L21: {
              if (ec.field_a != null) {
                if (ec.field_a.a(73)) {
                  if (!ec.field_a.b("", (byte) -111)) {
                    ec.field_a = null;
                    break L21;
                  } else {
                    if (!ec.field_a.a(0, "")) {
                      break L21;
                    } else {
                      ll.a(2, ec.field_a);
                      ec.field_a = null;
                      oe.a((byte) 119);
                      break L21;
                    }
                  }
                } else {
                  break L21;
                }
              } else {
                break L21;
              }
            }
            if (ec.field_a == null) {
              mc.field_a = 3;
              break L20;
            } else {
              break L20;
            }
          } else {
            break L20;
          }
        }
        L22: {
          if (mc.field_a == 3) {
            if (!di.a(fj.field_B, hf.field_a, ii.field_m, (byte) 104)) {
              break L22;
            } else {
              if (al.a(ii.field_m, (byte) 39)) {
                L23: {
                  L24: {
                    pb.a(false);
                    dj.b(param0 ^ -25469);
                    cf.field_c = false;
                    be.field_d = j.field_h;
                    lc.a(fj.field_B, mb.field_c, hf.field_a, param0 + 3249773, ii.field_m);
                    if (sd.field_d) {
                      break L24;
                    } else {
                      if (kg.field_d == null) {
                        break L23;
                      } else {
                        break L24;
                      }
                    }
                  }
                  L25: {
                    if (sd.field_d) {
                      stackOut_109_0 = 0;
                      stackIn_110_0 = stackOut_109_0;
                      break L25;
                    } else {
                      stackOut_108_0 = 1;
                      stackIn_110_0 = stackOut_108_0;
                      break L25;
                    }
                  }
                  L26: {
                    stackOut_110_0 = stackIn_110_0;
                    stackOut_110_1 = 98;
                    stackIn_112_0 = stackOut_110_0;
                    stackIn_112_1 = stackOut_110_1;
                    stackIn_111_0 = stackOut_110_0;
                    stackIn_111_1 = stackOut_110_1;
                    if (sd.field_d) {
                      stackOut_112_0 = stackIn_112_0;
                      stackOut_112_1 = stackIn_112_1;
                      stackOut_112_2 = 0;
                      stackIn_113_0 = stackOut_112_0;
                      stackIn_113_1 = stackOut_112_1;
                      stackIn_113_2 = stackOut_112_2;
                      break L26;
                    } else {
                      stackOut_111_0 = stackIn_111_0;
                      stackOut_111_1 = stackIn_111_1;
                      stackOut_111_2 = 1;
                      stackIn_113_0 = stackOut_111_0;
                      stackIn_113_1 = stackOut_111_1;
                      stackIn_113_2 = stackOut_111_2;
                      break L26;
                    }
                  }
                  bd.a(stackIn_113_0 != 0, (byte) stackIn_113_1, stackIn_113_2 != 0, kg.field_d);
                  break L23;
                }
                L27: {
                  if (la.field_o) {
                    il.a(true);
                    break L27;
                  } else {
                    break L27;
                  }
                }
                L28: {
                  if (null == dk.field_e) {
                    dk.field_e = vd.a(false);
                    fa.field_p = ne.a(param0 ^ -100);
                    break L28;
                  } else {
                    break L28;
                  }
                }
                fc.a(dk.field_e, (byte) 111, ii.field_m, fa.field_p);
                ii.field_m = null;
                fj.field_B = null;
                hf.field_a = null;
                uc.a((java.applet.Applet) this, 0);
                oe.a((byte) 112);
                mc.field_a = 10;
                break L22;
              } else {
                break L22;
              }
            }
          } else {
            break L22;
          }
        }
        L29: {
          if (mc.field_a != 10) {
            break L29;
          } else {
            L30: {
              if (fe.field_h != 0) {
                ch.field_j = ol.a(-102, r.field_e);
                break L30;
              } else {
                break L30;
              }
            }
            mc.field_a = 11;
            break L29;
          }
        }
        L31: {
          if (mc.field_a == 11) {
            L32: {
              if (ch.field_j == null) {
                break L32;
              } else {
                L33: {
                  if (!ch.field_j.a(-124)) {
                    break L33;
                  } else {
                    if (ch.field_j.b(0)) {
                      break L32;
                    } else {
                      break L33;
                    }
                  }
                }
                ad.a(ec.a(ch.field_j, ug.field_b, tk.field_a, 0), param0 ^ -24150, 0.0f);
                break L31;
              }
            }
            mc.field_a = 12;
            pl.field_d = true;
            break L31;
          } else {
            break L31;
          }
        }
        L34: {
          if (mc.field_a == 12) {
            if (pl.field_d) {
              break L34;
            } else {
              mc.field_a = 13;
              break L34;
            }
          } else {
            break L34;
          }
        }
        L35: {
          if (13 != mc.field_a) {
            break L35;
          } else {
            L36: {
              var3 = 1;
              if (lb.field_C == null) {
                break L36;
              } else {
                L37: {
                  if (!lb.field_C.a(28296)) {
                    stackOut_142_0 = 0;
                    stackIn_143_0 = stackOut_142_0;
                    break L37;
                  } else {
                    stackOut_141_0 = 1;
                    stackIn_143_0 = stackOut_141_0;
                    break L37;
                  }
                }
                var3 = stackIn_143_0;
                ad.a(lb.field_C.field_g, -24119, lb.field_C.field_b);
                break L36;
              }
            }
            if (var3 != 0) {
              mc.field_a = 20;
              break L35;
            } else {
              break L35;
            }
          }
        }
        L38: {
          if (param1) {
            break L38;
          } else {
            if (!aj.field_c) {
              break L38;
            } else {
              vh.a(ie.field_e, (byte) -115);
              ((bi) this).a(false);
              af.a(20, ie.field_e);
              break L38;
            }
          }
        }
        L39: {
          if (eg.field_k[8]) {
            ei.b(param0 + -91);
            break L39;
          } else {
            break L39;
          }
        }
    }

    final void a(int param0, int param1, String param2) {
        RuntimeException runtimeException = null;
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
            L1: {
              this.a(param0, 480, param2, true, 640);
              if (param1 >= 124) {
                break L1;
              } else {
                ((bi) this).field_o = 99;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("bi.O(").append(param0).append(',').append(param1).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param2 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw la.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ')');
        }
    }

    private final void h(int param0) {
        eg.field_k[5] = true;
    }

    final static boolean a(byte param0, gk param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int stackIn_3_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_3_0 = 0;
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
            L1: {
              var2_int = -18;
              var3 = param1.a((byte) 114);
              if (var3 == 1) {
                stackOut_2_0 = 1;
                stackIn_3_0 = stackOut_2_0;
                break L1;
              } else {
                stackOut_1_0 = 0;
                stackIn_3_0 = stackOut_1_0;
                break L1;
              }
            }
            var4 = stackIn_3_0;
            stackOut_3_0 = var4;
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var2;
            stackOut_5_1 = new StringBuilder().append("bi.B(").append(122).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
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
          throw la.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ')');
        }
        return stackIn_4_0 != 0;
    }

    final void a(int param0, int param1, int param2, int param3, int param4, boolean param5, int param6, int param7) {
        java.awt.Frame var10 = new java.awt.Frame("Jagex");
        var10.pack();
        var10.dispose();
        ((bi) this).setBackground(java.awt.Color.black);
        if (param4 != -25172) {
            ((bi) this).field_x = -97;
        }
        fe.field_h = ((bi) this).field_o;
        jg.a(3860, fe.field_h);
        kj.a(fe.field_h, ((bi) this).field_x, ((bi) this).field_t, 5000, param0, ((bi) this).field_p, ((bi) this).field_u, ((bi) this).field_w, param5, 5000, ((bi) this).field_v, (byte) -111, ((bi) this).field_r, rc.field_k);
        ii.a(rc.field_k, ((bi) this).field_u, ((bi) this).field_x, fe.field_h, ((bi) this).field_r, param0, ((bi) this).field_p, ((bi) this).field_v, -2045);
        sj.a(92);
        eb.field_A = cf.a(param4 + 25427);
        af.a(20, ie.field_e);
        pl.field_g = param3;
        r.field_e = param1;
        nd.field_e = param7;
        uk.field_q = param6;
        ph.field_c = param2;
        this.g(param4 ^ 25184);
        re.b(75);
    }

    final void k(int param0) {
        int var2 = 0;
        hl var3 = null;
        int var4 = 0;
        int stackIn_32_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_30_0 = 0;
        L0: {
          var4 = MonkeyPuzzle2.field_F ? 1 : 0;
          var2 = wk.field_a;
          if (var2 >= 64) {
            break L0;
          } else {
            if (!eg.field_k[var2]) {
              break L0;
            } else {
              L1: {
                if (param0 == -28710) {
                  break L1;
                } else {
                  this.g(-13);
                  break L1;
                }
              }
              if (0 == var2) {
                return;
              } else {
                L2: {
                  if (var2 != 1) {
                    if (var2 == 2) {
                      p.b(-79);
                      break L2;
                    } else {
                      if (var2 == 3) {
                        hh.c(true);
                        break L2;
                      } else {
                        if (4 == var2) {
                          gd.a((byte) 8);
                          break L2;
                        } else {
                          if (var2 == 5) {
                            sc.a(false);
                            break L2;
                          } else {
                            if (var2 != 6) {
                              if (var2 == 7) {
                                this.f((byte) 115);
                                break L2;
                              } else {
                                if (8 != var2) {
                                  if (var2 != 16) {
                                    L3: {
                                      if (var2 == 11) {
                                        break L3;
                                      } else {
                                        if (var2 == 12) {
                                          break L3;
                                        } else {
                                          if (var2 == 13) {
                                            rh.l(78);
                                            break L2;
                                          } else {
                                            if (var2 == 17) {
                                              this.l(15);
                                              break L2;
                                            } else {
                                              if (var2 != 18) {
                                                kk.a("MGS1: " + bh.a((byte) -49), (byte) 120, (Throwable) null);
                                                gk.a(-1);
                                                break L2;
                                              } else {
                                                uc.a(62);
                                                break L2;
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                    L4: {
                                      if (var2 != 12) {
                                        stackOut_31_0 = 0;
                                        stackIn_32_0 = stackOut_31_0;
                                        break L4;
                                      } else {
                                        stackOut_30_0 = 1;
                                        stackIn_32_0 = stackOut_30_0;
                                        break L4;
                                      }
                                    }
                                    var3 = si.a(stackIn_32_0 != 0, 0);
                                    cd.a(var3, (byte) 20);
                                    break L2;
                                  } else {
                                    lg.a((byte) 122);
                                    break L2;
                                  }
                                } else {
                                  hk.a((gk) (Object) MonkeyPuzzle2.field_D, rc.field_k, -1, rc.field_f);
                                  break L2;
                                }
                              }
                            } else {
                              m.a((byte) -106);
                              break L2;
                            }
                          }
                        }
                      }
                    }
                  } else {
                    t.i(-118);
                    break L2;
                  }
                }
                return;
              }
            }
          }
        }
        kk.a("MGS2: " + bh.a((byte) -38), (byte) 66, (Throwable) null);
        gk.a(param0 + 28709);
    }

    private final int j(int param0) {
        int var2 = 0;
        if (((bi) this).field_l) {
          return -1;
        } else {
          if (!ld.b(true)) {
            return -1;
          } else {
            if (qj.field_J) {
              return -1;
            } else {
              L0: {
                if (param0 == 8213) {
                  break L0;
                } else {
                  ((bi) this).field_p = -31;
                  break L0;
                }
              }
              var2 = ad.a(((bi) this).field_n, 650, ((bi) this).field_y, true, mk.e(0), lb.d((byte) -56));
              if (var2 != -1) {
                L1: {
                  if (0 == var2) {
                    break L1;
                  } else {
                    if (var2 != 1) {
                      L2: {
                        if (!nd.field_a) {
                          ((bi) this).a((byte) 77, "reconnect");
                          break L2;
                        } else {
                          break L2;
                        }
                      }
                      cf.a((byte) 3);
                      pc.a((byte) -46, var2, sl.field_n);
                      qj.field_J = true;
                      ha.field_ab = pf.a(0) - -15000L;
                      return var2;
                    } else {
                      break L1;
                    }
                  }
                }
                L3: {
                  if (k.field_g != 11) {
                    break L3;
                  } else {
                    if (bl.field_m == 0) {
                      db.a(false);
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                }
                return var2;
              } else {
                return -1;
              }
            }
          }
        }
    }

    private final void l(int param0) {
        int var2 = MonkeyPuzzle2.field_D.a((byte) 114);
        int var3 = 0 != (1 & var2) ? 1 : 0;
        int var4 = rc.field_f + -1;
        byte[] var5 = new byte[var4];
        MonkeyPuzzle2.field_D.a((byte) 118, 0, var4, var5);
        pl.a(var3 != 0, 12430, ii.a(false), be.a(var5, (byte) -49));
    }

    private final int a(boolean param0, boolean param1, boolean param2) {
        try {
            int var4 = 0;
            Exception var5 = null;
            int var5_int = 0;
            String var7 = null;
            int var8 = 0;
            Object var9 = null;
            Object var10 = null;
            Boolean var11 = null;
            gk var12 = null;
            Throwable decompiledCaughtException = null;
            var8 = MonkeyPuzzle2.field_F ? 1 : 0;
            var4 = sg.a(fe.field_h, param2, -128, ab.field_d);
            if (var4 == 0) {
              throw new IllegalStateException();
            } else {
              L0: {
                if (var4 == 1) {
                  L1: {
                    var5_int = hb.a(-7468, qj.l(111), wc.a((byte) 112));
                    if (var5_int == -1) {
                      break L1;
                    } else {
                      p.a(sl.field_n, (byte) 121, var5_int, cm.field_E);
                      sl.field_n = null;
                      cm.field_E = null;
                      break L1;
                    }
                  }
                  var11 = na.a(55);
                  if (var11 != null) {
                    ti.a(0, var11.booleanValue());
                    break L0;
                  } else {
                    break L0;
                  }
                } else {
                  break L0;
                }
              }
              L2: {
                if (var4 == 2) {
                  var5_int = nj.a(ci.a((byte) 78), gh.a(12035), mk.e(0), lb.d((byte) -56), true, ((bi) this).field_n, pl.a((byte) -69));
                  if (var5_int == -1) {
                    break L2;
                  } else {
                    fj.a(cm.field_E, sl.field_n, -27967, var5_int);
                    cm.field_E = null;
                    sl.field_n = null;
                    break L2;
                  }
                } else {
                  break L2;
                }
              }
              L3: {
                if (var4 != 3) {
                  break L3;
                } else {
                  L4: {
                    if (bl.field_m == -1) {
                      break L4;
                    } else {
                      if (bl.field_m != 0) {
                        bl.field_m = -1;
                        ff.a(95);
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                  }
                  if (!param0) {
                    var5_int = ad.a(((bi) this).field_n, 650, ((bi) this).field_y, false, mk.e(0), lb.d((byte) -56));
                    if (var5_int != -1) {
                      if (var5_int != 0) {
                        pc.a((byte) -46, var5_int, sl.field_n);
                        sl.field_n = null;
                        break L3;
                      } else {
                        cc.field_b = ia.field_f;
                        db.a(false);
                        ha.field_db = false;
                        k.field_g = 10;
                        break L3;
                      }
                    } else {
                      break L3;
                    }
                  } else {
                    qj.field_J = false;
                    break L3;
                  }
                }
              }
              L5: {
                if (4 != var4) {
                  break L5;
                } else {
                  if (mb.field_c) {
                    ad.a(ii.a(true), true);
                    break L5;
                  } else {
                    ha.field_db = true;
                    k.field_g = 10;
                    break L5;
                  }
                }
              }
              L6: {
                if (var4 != 5) {
                  break L6;
                } else {
                  hd.a(true, ii.a(false));
                  break L6;
                }
              }
              L7: {
                if (var4 == 6) {
                  if (cf.field_c) {
                    k.field_g = 10;
                    break L7;
                  } else {
                    break L7;
                  }
                } else {
                  break L7;
                }
              }
              L8: {
                if (7 == var4) {
                  aa.a(-126, ii.a(false));
                  break L8;
                } else {
                  break L8;
                }
              }
              L9: {
                if (var4 != 8) {
                  break L9;
                } else {
                  ad.a(ii.a(false), true);
                  break L9;
                }
              }
              L10: {
                if (var4 == 9) {
                  m.a((byte) -79, ii.a(false));
                  break L10;
                } else {
                  break L10;
                }
              }
              L11: {
                if (var4 != 10) {
                  break L11;
                } else {
                  gf.field_c.b(true, 17);
                  break L11;
                }
              }
              L12: {
                if (var4 != 11) {
                  break L12;
                } else {
                  l.a(ii.a(false), -120);
                  break L12;
                }
              }
              L13: {
                if (12 != var4) {
                  break L13;
                } else {
                  k.a(ii.a(false), (byte) 91, pj.b(true));
                  break L13;
                }
              }
              L14: {
                if (13 == var4) {
                  try {
                    L15: {
                      L16: {
                        if (null == ec.field_e) {
                          ec.field_e = new qa(rc.field_k, new java.net.URL(((bi) this).getCodeBase(), "countrylist.ws"), 5000);
                          break L16;
                        } else {
                          break L16;
                        }
                      }
                      L17: {
                        if (ec.field_e.c(90)) {
                          L18: {
                            var12 = ec.field_e.a(18);
                            if (var12 != null) {
                              var7 = sc.a(var12.field_g, var12.field_h, 78, 0);
                              ki.a(-125, var7);
                              break L18;
                            } else {
                              var9 = null;
                              ki.a(44, (String) null);
                              break L18;
                            }
                          }
                          ec.field_e = null;
                          break L17;
                        } else {
                          break L17;
                        }
                      }
                      break L15;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L19: {
                      var5 = (Exception) (Object) decompiledCaughtException;
                      kk.a("S1", (byte) 67, (Throwable) (Object) var5);
                      var10 = null;
                      ki.a(67, (String) null);
                      ec.field_e = null;
                      break L19;
                    }
                  }
                  break L14;
                } else {
                  break L14;
                }
              }
              L20: {
                if (var4 != 15) {
                  break L20;
                } else {
                  k.field_g = 10;
                  break L20;
                }
              }
              if (var4 == 16) {
                return 1;
              } else {
                if (var4 == 17) {
                  return 2;
                } else {
                  return 0;
                }
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void e(int param0) {
        eg.field_k[1] = true;
    }

    protected bi() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_s = new char[]{' ', ' ', '_', '-', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß'};
    }
}
