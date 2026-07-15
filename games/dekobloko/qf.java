/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qf extends ba implements qh, tn {
    static String field_l;
    static ck[] field_h;
    static String field_j;
    static String field_k;
    static String field_m;
    vb field_g;
    static int[] field_i;

    final tb b(int param0) {
        int var2_int = 0;
        NumberFormatException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        tb stackIn_3_0 = null;
        tb stackIn_6_0 = null;
        Object stackIn_9_0 = null;
        tb stackIn_13_0 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        tb stackOut_2_0 = null;
        tb stackOut_12_0 = null;
        Object stackOut_8_0 = null;
        tb stackOut_5_0 = null;
        try {
          L0: {
            var2_int = ((qf) this).field_g.i(-22079);
            var3 = ((qf) this).field_g.b(false);
            var4 = ((qf) this).field_g.f((byte) 48);
            var5 = jj.a(-110);
            if ((var4 ^ -1) > -1891) {
              stackOut_2_0 = vm.field_u;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            } else {
              if (var4 <= var5 - 3) {
                if (param0 == -5520) {
                  if (!un.a(var4, var3, var2_int, (byte) 52)) {
                    stackOut_12_0 = vm.field_u;
                    stackIn_13_0 = stackOut_12_0;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    decompiledRegionSelector0 = 0;
                    break L0;
                  }
                } else {
                  stackOut_8_0 = null;
                  stackIn_9_0 = stackOut_8_0;
                  return (tb) (Object) stackIn_9_0;
                }
              } else {
                stackOut_5_0 = vm.field_u;
                stackIn_6_0 = stackOut_5_0;
                return stackIn_6_0;
              }
            }
          }
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (NumberFormatException) (Object) decompiledCaughtException;
          return vm.field_u;
        }
        if (decompiledRegionSelector0 == 0) {
          return dc.field_b;
        } else {
          return stackIn_13_0;
        }
    }

    final String e(byte param0) {
        int var2_int = 0;
        NumberFormatException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Object var6 = null;
        String stackIn_6_0 = null;
        Object stackIn_9_0 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        Object stackOut_8_0 = null;
        String stackOut_5_0 = null;
        try {
          L0: {
            L1: {
              if (param0 > 2) {
                break L1;
              } else {
                var6 = null;
                qf.a((ji) null, (ji) null, -5);
                break L1;
              }
            }
            L2: {
              var2_int = ((qf) this).field_g.i(-22079);
              var3 = ((qf) this).field_g.b(false);
              var4 = ((qf) this).field_g.f((byte) 48);
              var5 = jj.a(-125);
              if (var4 < 1890) {
                break L2;
              } else {
                if (var4 <= var5 - 3) {
                  if (!un.a(var4, var3, var2_int, (byte) 52)) {
                    decompiledRegionSelector0 = 0;
                    break L0;
                  } else {
                    stackOut_8_0 = null;
                    stackIn_9_0 = stackOut_8_0;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                } else {
                  break L2;
                }
              }
            }
            stackOut_5_0 = cm.a((byte) 99, ad.field_b, new String[2]);
            stackIn_6_0 = stackOut_5_0;
            return stackIn_6_0;
          }
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = (NumberFormatException) (Object) decompiledCaughtException;
            decompiledRegionSelector0 = 0;
            break L3;
          }
        }
        if (decompiledRegionSelector0 == 0) {
          return bf.field_q;
        } else {
          return (String) (Object) stackIn_9_0;
        }
    }

    public final void a(int param0, rk param1) {
        if (param0 != 16737894) {
            field_m = null;
            ((qf) this).c((byte) -51);
            return;
        }
        ((qf) this).c((byte) -51);
    }

    final static void a(String param0, int param1, String param2) {
        if (cl.field_r == null) {
          if (param1 >= -10) {
            field_l = null;
            dm.field_c = new he(param0, param2, false, true, true);
            de.field_W.c((ce) (Object) dm.field_c, (byte) 91);
            return;
          } else {
            dm.field_c = new he(param0, param2, false, true, true);
            de.field_W.c((ce) (Object) dm.field_c, (byte) 91);
            return;
          }
        } else {
          cl.field_r.n(-120);
          if (param1 < -10) {
            dm.field_c = new he(param0, param2, false, true, true);
            de.field_W.c((ce) (Object) dm.field_c, (byte) 91);
            return;
          } else {
            field_l = null;
            dm.field_c = new he(param0, param2, false, true, true);
            de.field_W.c((ce) (Object) dm.field_c, (byte) 91);
            return;
          }
        }
    }

    public final void b(int param0, rk param1) {
        if (param0 != -2569) {
            field_i = null;
        }
    }

    final static void a(byte param0, java.awt.Component param1) {
        param1.removeMouseListener((java.awt.event.MouseListener) (Object) ik.field_f);
        param1.removeMouseMotionListener((java.awt.event.MouseMotionListener) (Object) ik.field_f);
        param1.removeFocusListener((java.awt.event.FocusListener) (Object) ik.field_f);
        if (param0 != -35) {
          field_j = null;
          pa.field_bb = 0;
          return;
        } else {
          pa.field_bb = 0;
          return;
        }
    }

    final static void a(int param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var2 = (wj.field_Lb + -640) / 2;
        if (param1 <= 95) {
          field_j = null;
          var3 = dl.field_M * dl.field_M;
          var4 = var3 - param0 * param0;
          ee.field_i.a(199, 0, 90, -4 + hk.field_i - 210, var2 - 199 * var4 / var3);
          oh.field_d.a(438, 0, 0, hk.field_i - 124, var2 - -202 + var4 * 438 / var3);
          return;
        } else {
          var3 = dl.field_M * dl.field_M;
          var4 = var3 - param0 * param0;
          ee.field_i.a(199, 0, 90, -4 + hk.field_i - 210, var2 - 199 * var4 / var3);
          oh.field_d.a(438, 0, 0, hk.field_i - 124, var2 - -202 + var4 * 438 / var3);
          return;
        }
    }

    final static boolean a(String param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var4 = client.field_A ? 1 : 0;
        var2 = param1;
        L0: while (true) {
          if (param0.length() > var2) {
            var3 = param0.charAt(var2);
            if (v.a((char) var3, -24380)) {
              var2++;
              var2++;
              var2++;
              continue L0;
            } else {
              if (!fl.a((char) var3, (byte) 23)) {
                return true;
              } else {
                var2++;
                var2++;
                continue L0;
              }
            }
          } else {
            return false;
          }
        }
    }

    final static void a(boolean param0) {
        String var1 = null;
        if (!vb.field_Z) {
          throw new IllegalStateException();
        } else {
          L0: {
            if (cl.field_r != null) {
              cl.field_r.n(8);
              break L0;
            } else {
              break L0;
            }
          }
          var1 = qe.a((byte) 103);
          dm.field_c = new he(var1, (String) null, param0, false, false);
          ah.field_c.a((byte) -107, (ce) (Object) de.field_W);
          de.field_W.c((ce) (Object) dm.field_c, (byte) 101);
          de.field_W.j(100);
          return;
        }
    }

    public final boolean a(byte param0) {
        int var2 = -5 / ((72 - param0) / 40);
        return ((qf) this).field_g.k(111);
    }

    final static void a(ji param0, ji param1, int param2) {
        eb.field_k = param1;
        if (param2 >= -46) {
            qf.c(8);
            le.field_E = param0;
            return;
        }
        le.field_E = param0;
    }

    final static void a(String param0, String[] param1, int param2, int param3) {
        int var5 = 0;
        Object var6 = null;
        String[] var7 = null;
        int stackIn_4_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_6_1 = 0;
        int stackOut_3_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_5_1 = 0;
        int stackOut_4_0 = 0;
        int stackOut_4_1 = 0;
        L0: {
          var5 = client.field_A ? 1 : 0;
          ka.field_P = kl.field_z;
          if (param3 == -677) {
            break L0;
          } else {
            qf.a(false);
            break L0;
          }
        }
        if ((param2 ^ -1) != -256) {
          if ((param2 ^ -1) <= -101) {
            if (105 < param2) {
              je.field_b = un.a(param2, param0, param3 + 780);
              return;
            } else {
              var7 = param1;
              gf.a(var7, false);
              je.field_b = wi.a(param1, param3 + 674);
              return;
            }
          } else {
            je.field_b = un.a(param2, param0, param3 + 780);
            return;
          }
        } else {
          L1: {
            stackOut_3_0 = 0;
            stackIn_5_0 = stackOut_3_0;
            stackIn_4_0 = stackOut_3_0;
            if (13 <= jk.field_e) {
              stackOut_5_0 = stackIn_5_0;
              stackOut_5_1 = 0;
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              break L1;
            } else {
              stackOut_4_0 = stackIn_4_0;
              stackOut_4_1 = 1;
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              break L1;
            }
          }
          je.field_b = bn.a(stackIn_6_0 != 0, stackIn_6_1 != 0);
          var6 = null;
          gf.a((String[]) null, false);
          return;
        }
    }

    public static void c(int param0) {
        field_l = null;
        field_j = null;
        field_h = null;
        if (param0 < 110) {
            return;
        }
        field_i = null;
        field_k = null;
        field_m = null;
    }

    public qf() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = "Show chat (<%0> unread messages)";
        field_k = "Achievements This Game";
        field_m = "<%0> must play 1 more rated game before playing with the current options.";
        field_j = "Names cannot start or end with space or underscore";
    }
}
