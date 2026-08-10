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
        tb stackIn_9_0 = null;
        tb stackIn_13_0 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        try {
          L0: {
            var2_int = this.field_g.i(-22079);
            var3 = this.field_g.b(false);
            var4 = this.field_g.f((byte) 48);
            var5 = jj.a(-110);
            if ((var4 ^ -1) > -1891) {
              stackIn_3_0 = vm.field_u;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (var4 <= var5 - 3) {
                if (param0 == -5520) {
                  if (!un.a(var4, var3, var2_int, (byte) 52)) {
                    stackIn_13_0 = vm.field_u;
                    decompiledRegionSelector0 = 4;
                    break L0;
                  } else {
                    decompiledRegionSelector0 = 3;
                    break L0;
                  }
                } else {
                  stackIn_9_0 = (tb) null;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                stackIn_6_0 = vm.field_u;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.NumberFormatException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (NumberFormatException) (Object) decompiledCaughtException;
          return vm.field_u;
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_9_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return dc.field_b;
              } else {
                return stackIn_13_0;
              }
            }
          }
        }
    }

    final String e(byte param0) {
        int var2_int = 0;
        NumberFormatException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        ji var6 = null;
        String stackIn_6_0 = null;
        Object stackIn_9_0 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 > 2) {
                break L1;
              } else {
                var6 = (ji) null;
                qf.a((ji) null, (ji) null, -5);
                break L1;
              }
            }
            L2: {
              var2_int = this.field_g.i(-22079);
              var3 = this.field_g.b(false);
              var4 = this.field_g.f((byte) 48);
              var5 = jj.a(-125);
              if (var4 < 1890) {
                break L2;
              } else {
                if (var4 <= var5 - 3) {
                  if (!un.a(var4, var3, var2_int, (byte) 52)) {
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    stackIn_9_0 = null;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  }
                } else {
                  break L2;
                }
              }
            }
            stackIn_6_0 = cm.a((byte) 99, ad.field_b, new String[]{"1890", Integer.toString(var5 - 3)});
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.NumberFormatException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = (NumberFormatException) (Object) decompiledCaughtException;
            decompiledRegionSelector0 = 1;
            break L3;
          }
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return bf.field_q;
          } else {
            return (String) ((Object) stackIn_9_0);
          }
        }
    }

    public final void a(int param0, rk param1) {
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          L0: {
            L1: {
              if (param0 != 16737894) {
                field_m = (String) null;
                this.c((byte) -51);
                break L1;
              } else {
                this.c((byte) -51);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var3);

            stackIn_7_1 = new StringBuilder().append("qf.N(").append(param0).append(',');

            if (param1 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L2;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
    }

    final static void a(String param0, int param1, String param2) {
        try {
            if (cl.field_r != null) {
                cl.field_r.n(-120);
            }
            if (param1 >= -10) {
                field_l = (String) null;
            }
            dm.field_c = new he(param0, param2, false, true, true);
            de.field_W.c(dm.field_c, (byte) 91);
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) ((Object) runtimeException), "qf.I(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    public final void b(int param0, rk param1) {
        try {
            if (param0 != -2569) {
                field_i = (int[]) null;
            }
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) ((Object) runtimeException), "qf.K(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(byte param0, java.awt.Component param1) {
        try {
            param1.removeMouseListener(ik.field_f);
            param1.removeMouseMotionListener(ik.field_f);
            param1.removeFocusListener(ik.field_f);
            if (param0 != -35) {
                field_j = (String) null;
            }
            pa.field_bb = 0;
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) ((Object) runtimeException), "qf.L(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0, int param1) {
        int var2;
        int var3;
        int var4;
        var2 = (wj.field_Lb + -640) / 2;
        if (param1 <= 95) {
          field_j = (String) null;
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
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = client.field_A ? 1 : 0;
        try {
          L0: {
            var2_int = param1;
            L1: while (true) {
              if (param0.length() <= var2_int) {
                stackIn_10_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                L2: {
                  var3 = param0.charAt(var2_int);
                  if (v.a((char) var3, -24380)) {
                    break L2;
                  } else {
                    if (!fl.a((char) var3, (byte) 23)) {
                      stackIn_7_0 = 1;
                      decompiledRegionSelector0 = 0;
                      break L0;
                    } else {
                      break L2;
                    }
                  }
                }
                var2_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var2);

            stackIn_13_1 = new StringBuilder().append("qf.T(");

            if (param0 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L3;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L3;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_7_0 != 0;
        } else {
          return stackIn_10_0 != 0;
        }
    }

    final static void a(boolean param0) {
        String var1;
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
          ah.field_c.a((byte) -107, de.field_W);
          de.field_W.c(dm.field_c, (byte) 101);
          de.field_W.j(100);
          return;
        }
    }

    public final boolean a(byte param0) {
        int var2 = -5 / ((72 - param0) / 40);
        return this.field_g.k(111);
    }

    final static void a(ji param0, ji param1, int param2) {
        try {
            eb.field_k = param1;
            if (param2 >= -46) {
                qf.c(8);
            }
            le.field_E = param0;
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) ((Object) runtimeException), "qf.G(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static void a(String param0, String[] param1, int param2, int param3) {
        String[] var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        String[] var6 = null;
        int stackIn_6_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = client.field_A ? 1 : 0;
        try {
          L0: {
            ka.field_P = kl.field_z;
            if (param3 == -677) {
              break L0;
            } else {
              qf.a(false);
              break L0;
            }
          }
          if ((param2 ^ -1) != -256) {
            L1: {
              if ((param2 ^ -1) > -101) {
                break L1;
              } else {
                if (105 < param2) {
                  break L1;
                } else {
                  var4 = param1;
                  gf.a(var4, false);
                  je.field_b = wi.a(param1, param3 + 674);
                  return;
                }
              }
            }
            je.field_b = un.a(param2, param0, param3 + 780);
            return;
          } else {
            L2: {
              stackIn_6_0 = 0;

              if (13 <= jk.field_e) {
                stackIn_7_0 = stackIn_6_0;
                stackIn_7_1 = 0;
                break L2;
              } else {
                stackIn_7_0 = stackIn_6_0;
                stackIn_7_1 = 1;
                break L2;
              }
            }
            je.field_b = bn.a(stackIn_7_0 != 0, stackIn_7_1 != 0);
            var6 = (String[]) null;
            gf.a((String[]) null, false);
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4_ref = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var4_ref);

            stackIn_15_1 = new StringBuilder().append("qf.S(");

            if (param0 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L3;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_18_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',');

            if (param1 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L4;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L4;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_16_0), stackIn_19_2 + ',' + param2 + ',' + param3 + ')');
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
        field_l = "Show chat (<%0> unread messages)";
        field_k = "Achievements This Game";
        field_m = "<%0> must play 1 more rated game before playing with the current options.";
        field_j = "Names cannot start or end with space or underscore";
    }
}
