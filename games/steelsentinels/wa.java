/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wa extends cn {
    private ke field_q;
    static int field_p;
    static String field_o;
    private ke[] field_r;

    final void a(wk param0, byte param1) {
        ke[] var3 = null;
        int var4 = 0;
        ke var5 = null;
        int var6 = 0;
        ke[] var7 = null;
        var6 = SteelSentinels.field_G;
        if (param1 == 88) {
          var7 = ((wa) this).field_r;
          var3 = var7;
          var4 = 0;
          L0: while (true) {
            if (var7.length <= var4) {
              return;
            } else {
              var5 = var7[var4];
              if (var5 != null) {
                var5.field_a = param0;
                var4++;
                continue L0;
              } else {
                var4++;
                continue L0;
              }
            }
          }
        } else {
          return;
        }
    }

    final static void a(cm param0, int param1, cm param2) {
        java.awt.Canvas var3 = null;
        L0: {
          var3 = gl.a(false);
          if (var3 == null) {
            var3 = new java.awt.Canvas();
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          kc.field_x = new wk[5][];
          if (param0 == null) {
            break L1;
          } else {
            kc.field_x[0] = new wk[7];
            kc.field_x[0][0] = (wk) (Object) new ek(param0.a("wz_foreground_01.png", -742, "warzone/"), (java.awt.Component) (Object) var3);
            kc.field_x[0][1] = (wk) (Object) new ek(param0.a("wz_foreground_02.png", -742, "warzone/"), (java.awt.Component) (Object) var3);
            kc.field_x[0][2] = (wk) (Object) new ek(param0.a("wz_foreground_03.png", -742, "warzone/"), (java.awt.Component) (Object) var3);
            kc.field_x[0][3] = (wk) (Object) new ek(param0.a("wz_foreground_04.png", -742, "warzone/"), (java.awt.Component) (Object) var3);
            kc.field_x[0][4] = (wk) (Object) new ek(param0.a("wz_foreground_05.png", -742, "warzone/"), (java.awt.Component) (Object) var3);
            kc.field_x[0][5] = (wk) (Object) new ek(param0.a("wz_foreground_06.png", -742, "warzone/"), (java.awt.Component) (Object) var3);
            kc.field_x[0][6] = (wk) (Object) new ek(param0.a("wz_foreground_07.png", bi.a(param1, -744), "warzone/"), (java.awt.Component) (Object) var3);
            kc.field_x[1] = new wk[6];
            kc.field_x[1][0] = (wk) (Object) new ek(param0.a("sb_foreground_01.png", param1 + -744, "fleetbattle/"), (java.awt.Component) (Object) var3);
            kc.field_x[1][1] = (wk) (Object) new ek(param0.a("sb_foreground_02.png", -742, "fleetbattle/"), (java.awt.Component) (Object) var3);
            kc.field_x[1][2] = (wk) (Object) new ek(param0.a("sb_foreground_03.png", bi.a(param1, -744), "fleetbattle/"), (java.awt.Component) (Object) var3);
            kc.field_x[1][3] = (wk) (Object) new ek(param0.a("sb_foreground_04.png", -742, "fleetbattle/"), (java.awt.Component) (Object) var3);
            kc.field_x[1][4] = (wk) (Object) new ek(param0.a("sb_foreground_05.png", -742, "fleetbattle/"), (java.awt.Component) (Object) var3);
            kc.field_x[1][5] = (wk) (Object) new ek(param0.a("sb_foreground_06.png", -742, "fleetbattle/"), (java.awt.Component) (Object) var3);
            break L1;
          }
        }
        kc.field_x[2] = new wk[6];
        kc.field_x[2][0] = rl.a(param2, "basic", "ct_foreground_01", false);
        kc.field_x[2][1] = rl.a(param2, "basic", "ct_foreground_02", false);
        kc.field_x[2][2] = rl.a(param2, "basic", "ct_foreground_03", false);
        kc.field_x[2][3] = rl.a(param2, "basic", "ct_foreground_04", false);
        kc.field_x[param1][4] = rl.a(param2, "basic", "ct_foreground_05", false);
        kc.field_x[2][5] = rl.a(param2, "basic", "ct_foreground_06", false);
        kc.field_x[4] = new wk[2];
        kc.field_x[4][0] = rl.a(param2, "basic", "starcruiser_base", false);
        kc.field_x[4][1] = rl.a(param2, "basic", "starcruiser_top", false);
    }

    public static void c(int param0) {
        if (param0 != -21121) {
            String discarded$0 = wa.a((byte) 56);
        }
        field_o = null;
    }

    public final void a(int param0, lh param1, byte param2, boolean param3, int param4) {
        ke var7 = null;
        ke var9 = null;
        oa var10 = null;
        ke var11 = null;
        ke var12 = null;
        ke var13 = null;
        ke var14 = null;
        lh stackIn_3_0 = null;
        Object stackOut_2_0 = null;
        lh stackOut_1_0 = null;
        L0: {
          if (!(param1 instanceof oa)) {
            stackOut_2_0 = null;
            stackIn_3_0 = (lh) (Object) stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = (lh) param1;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var10 = (oa) (Object) stackIn_3_0;
          fe.a(param1.field_o + param0, param1.field_z + param4, -111, param1.field_x + param0 - -param1.field_o, param1.field_E + param4 - -param1.field_z);
          if (var10 == null) {
            break L1;
          } else {
            param3 = param3 & var10.field_K;
            break L1;
          }
        }
        L2: {
          var7 = ((wa) this).field_r[0];
          ((wa) this).field_q.a((byte) -107);
          var7.a(((wa) this).field_q, (wa) this, (byte) -91, param4, param1, param0);
          if (var10 != null) {
            L3: {
              if (!var10.field_T) {
                break L3;
              } else {
                var11 = ((wa) this).field_r[1];
                if (var11 == null) {
                  break L3;
                } else {
                  var11.a(((wa) this).field_q, (wa) this, (byte) -117, param4, param1, param0);
                  break L3;
                }
              }
            }
            if (var10.field_C) {
              L4: {
                var12 = ((wa) this).field_r[3];
                if (var10.field_w == 0) {
                  break L4;
                } else {
                  if (var12 == null) {
                    break L4;
                  } else {
                    var12.a(((wa) this).field_q, (wa) this, (byte) -116, param4, param1, param0);
                    break L2;
                  }
                }
              }
              var9 = ((wa) this).field_r[2];
              if (var9 == null) {
                break L2;
              } else {
                var9.a(((wa) this).field_q, (wa) this, (byte) -96, param4, param1, param0);
                break L2;
              }
            } else {
              break L2;
            }
          } else {
            break L2;
          }
        }
        L5: {
          if (!param1.d(0)) {
            break L5;
          } else {
            var13 = ((wa) this).field_r[5];
            if (var13 != null) {
              var13.a(((wa) this).field_q, (wa) this, (byte) -122, param4, param1, param0);
              break L5;
            } else {
              break L5;
            }
          }
        }
        L6: {
          if (!param3) {
            var14 = ((wa) this).field_r[4];
            if (var14 == null) {
              break L6;
            } else {
              var14.a(((wa) this).field_q, (wa) this, (byte) -125, param4, param1, param0);
              break L6;
            }
          } else {
            break L6;
          }
        }
        if (param2 == -30) {
          ((wa) this).field_q.a(param0, param1, param4, (wa) this, false);
          tk.f((byte) 127);
          return;
        } else {
          return;
        }
    }

    public wa() {
        ((wa) this).field_r = new ke[6];
        ((wa) this).field_q = new ke();
        ((wa) this).field_r[0] = new ke();
        ke var1 = new ke();
        var1.a((byte) -107);
    }

    final static boolean b(byte param0) {
        if (param0 > -9) {
            wa.b(54);
        }
        return qm.a((byte) -31, bk.field_U, ti.field_p);
    }

    final static String a(byte param0) {
        if (null == g.field_l) {
            return "";
        }
        if (param0 != -43) {
            boolean discarded$0 = wa.b((byte) 117);
        }
        return g.field_l;
    }

    final static boolean a(byte param0, int param1, int param2, cm param3) {
        if (param0 != 30) {
            field_o = null;
        }
        byte[] var5 = param3.a(param2, (byte) 92, param1);
        byte[] var4 = var5;
        if (var5 == null) {
            return false;
        }
        ve.a(16, var5);
        return true;
    }

    final void a(wk[] param0, boolean param1, int param2) {
        int var4 = param2;
        if (((wa) this).field_r[var4] == null) {
            ((wa) this).field_r[var4] = new ke();
        }
        if (param1) {
            field_o = null;
        }
        ((wa) this).field_r[param2].field_h = param0;
    }

    wa(wa param0, boolean param1) {
        this();
        param0.a((wa) this, 65535, param1);
    }

    final ke a(int param0, int param1) {
        if (param0 != -25088) {
            ((wa) this).field_q = null;
        }
        ((wa) this).field_r[param1] = new ke();
        return new ke();
    }

    final static void b(int param0) {
        g.field_l = rf.field_d.h(1);
        CharSequence var2 = (CharSequence) (Object) g.field_l;
        ng.field_r = ui.a(1, var2);
        if (param0 > -47) {
            wa.b(-63);
        }
    }

    final static int a(int param0, int param1, byte param2) {
        int var3 = param0 >> -981678896;
        if (param2 != -27) {
            wa.c(60);
        }
        int var4 = 65535 & param0;
        int var5 = param1 >> -2085649968;
        int var6 = 65535 & param1;
        return param1 * var3 + (var4 * var5 + (var4 * var6 >> 70427056));
    }

    private final void a(wa param0, int param1, boolean param2) {
        int var4 = 0;
        ke var5 = null;
        ke var6 = null;
        int var7 = 0;
        ke stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        ke stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        ke stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        ke stackIn_10_2 = null;
        ke stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        ke stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        ke stackOut_9_2 = null;
        ke stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        ke stackOut_8_2 = null;
        var7 = SteelSentinels.field_G;
        if (param1 == 65535) {
          L0: {
            super.a((cn) (Object) param0, -3);
            if (!param2) {
              ii.a((Object[]) (Object) ((wa) this).field_r, 0, (Object[]) (Object) param0.field_r, 0, 6);
              break L0;
            } else {
              var4 = 0;
              L1: while (true) {
                if ((var4 ^ -1) <= -7) {
                  break L0;
                } else {
                  var5 = ((wa) this).field_r[var4];
                  if (var5 != null) {
                    L2: {
                      var6 = param0.field_r[var4];
                      stackOut_7_0 = (ke) var5;
                      stackOut_7_1 = -123;
                      stackIn_9_0 = stackOut_7_0;
                      stackIn_9_1 = stackOut_7_1;
                      stackIn_8_0 = stackOut_7_0;
                      stackIn_8_1 = stackOut_7_1;
                      if (var6 == null) {
                        param0.field_r[var4] = new ke();
                        stackOut_9_0 = (ke) (Object) stackIn_9_0;
                        stackOut_9_1 = stackIn_9_1;
                        stackOut_9_2 = new ke();
                        stackIn_10_0 = stackOut_9_0;
                        stackIn_10_1 = stackOut_9_1;
                        stackIn_10_2 = stackOut_9_2;
                        break L2;
                      } else {
                        stackOut_8_0 = (ke) (Object) stackIn_8_0;
                        stackOut_8_1 = stackIn_8_1;
                        stackOut_8_2 = (ke) var6;
                        stackIn_10_0 = stackOut_8_0;
                        stackIn_10_1 = stackOut_8_1;
                        stackIn_10_2 = stackOut_8_2;
                        break L2;
                      }
                    }
                    ((ke) (Object) stackIn_10_0).a((byte) stackIn_10_1, stackIn_10_2);
                    var4++;
                    continue L1;
                  } else {
                    param0.field_r[var4] = null;
                    var4++;
                    continue L1;
                  }
                }
              }
            }
          }
          return;
        } else {
          return;
        }
    }

    final void a(boolean param0, wk[] param1) {
        ke[] var3 = null;
        int var4 = 0;
        ke var5 = null;
        int var6 = 0;
        L0: {
          var6 = SteelSentinels.field_G;
          var3 = ((wa) this).field_r;
          var4 = 0;
          if (!param0) {
            break L0;
          } else {
            ((wa) this).field_r = null;
            break L0;
          }
        }
        L1: while (true) {
          if (var3.length <= var4) {
            return;
          } else {
            var5 = var3[var4];
            if (var5 != null) {
              var5.field_h = param1;
              var4++;
              continue L1;
            } else {
              var4++;
              continue L1;
            }
          }
        }
    }

    final static fm b(int param0, int param1) {
        int var3 = 0;
        int var4 = SteelSentinels.field_G;
        fm[] var5 = gb.b(false);
        fm[] var2 = var5;
        for (var3 = 0; var3 < var5.length; var3++) {
            if (!(param0 != var5[var3].field_c)) {
                return var5[var3];
            }
        }
        var3 = 71 % ((-1 - param1) / 61);
        return null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = "MODULES:";
    }
}
