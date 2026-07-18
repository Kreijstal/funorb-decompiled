/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pn extends vb {
    static String field_fb;
    private rk field_gb;
    static String[] field_bb;
    static int field_ab;
    private rk field_hb;
    private boolean field_cb;
    static boolean field_db;
    static int[] field_eb;
    private rk field_ib;

    final static void a(int param0, long param1, String param2) {
        CharSequence var5 = null;
        try {
            ed.field_c = param2;
            pk.field_r = 2;
            var5 = (CharSequence) (Object) param2;
            cf.field_c = kf.a(var5, (byte) 2);
            int var4_int = 54;
            fm.field_d = param1;
            v.b(0);
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) (Object) runtimeException, "pn.M(" + 38 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        if (param1 > -103) {
            return;
        }
        super.a(param0, -120, param2, param3);
        if (!(param2 == 0)) {
            return;
        }
        param0 = param0 + ((pn) this).field_u;
        param3 = param3 + ((pn) this).field_D;
        this.a(param0, n.field_d, param3, (ce) (Object) ((pn) this).field_gb, 0);
        this.a(param0, ql.field_a, param3, (ce) (Object) ((pn) this).field_hb, 0);
        this.a(param0, pf.field_c, param3, (ce) (Object) ((pn) this).field_ib, 0);
    }

    final static void a(int param0, int param1, boolean param2, int param3, String param4, int param5, int param6, int param7) {
        RuntimeException var8 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        try {
          L0: {
            L1: {
              if (param5 >= 126) {
                break L1;
              } else {
                pn.a(false, true, false);
                break L1;
              }
            }
            L2: {
              if (0 != sk.field_c.field_ob) {
                if (wc.field_n) {
                  break L2;
                } else {
                  if (wl.field_p) {
                    aj.a(-1045);
                    break L2;
                  } else {
                    jg.field_i = true;
                    break L2;
                  }
                }
              } else {
                break L2;
              }
            }
            L3: {
              if (!jg.field_i) {
                break L3;
              } else {
                jb.a(20, param3, 113, param1, param7, param6, param6, param4, param0);
                tf.field_gb.a(false, param2);
                if (param2) {
                  L4: {
                    if (ve.field_vc.field_ob == 0) {
                      break L4;
                    } else {
                      jg.field_i = false;
                      break L4;
                    }
                  }
                  if (bf.field_v.field_ob == 0) {
                    break L3;
                  } else {
                    qk.a((byte) 94);
                    jg.field_i = false;
                    break L3;
                  }
                } else {
                  break L3;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var8 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var8;
            stackOut_16_1 = new StringBuilder().append("pn.N(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param4 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L5;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L5;
            }
          }
          throw dh.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    private pn(gl param0, boolean param1) {
        super(0, 0, 0, 0, (gl) null);
        try {
            ((pn) this).field_gb = (rk) (Object) new og("", (kg) null, 2);
            ((pn) this).field_hb = (rk) (Object) new og("", (kg) null, 2);
            ((pn) this).field_ib = (rk) (Object) new og("", (kg) null, 4);
            ((pn) this).field_ib.field_p = param0;
            ((pn) this).field_hb.field_p = param0;
            ((pn) this).field_gb.field_p = param0;
            ((pn) this).field_cb = param1 ? true : false;
            if (!((pn) this).field_cb) {
                ((pn) this).b((ce) (Object) ((pn) this).field_gb, (byte) -55);
                ((pn) this).b((ce) (Object) ((pn) this).field_hb, (byte) -55);
            } else {
                ((pn) this).b((ce) (Object) ((pn) this).field_hb, (byte) -55);
                ((pn) this).b((ce) (Object) ((pn) this).field_gb, (byte) -55);
            }
            ((pn) this).b((ce) (Object) ((pn) this).field_ib, (byte) -55);
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) (Object) runtimeException, "pn.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final int b(boolean param0) {
        NumberFormatException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (!param0) {
              stackOut_3_0 = -1 + Integer.parseInt(((pn) this).field_hb.field_E);
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = 6;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (NumberFormatException) (Object) decompiledCaughtException;
          return -1;
        }
        return stackIn_4_0;
    }

    final static void a(int param0, wl param1) {
        int var2_int = 0;
        try {
            dj.field_Y = param1.e(3) << 5;
            var2_int = param1.d((byte) -39);
            tj.field_Pb = var2_int << 18 & 1835008;
            dj.field_Y = dj.field_Y + (var2_int >> 3);
            tj.field_Pb = tj.field_Pb + (param1.e(3) << 2);
            var2_int = param1.d((byte) -59);
            oc.field_c = (var2_int & 63) << 15;
            tj.field_Pb = tj.field_Pb + (var2_int >> 6);
            oc.field_c = oc.field_c + (param1.d((byte) -105) << 7);
            var2_int = param1.d((byte) -81);
            vm.field_s = (1 & var2_int) << 16;
            oc.field_c = oc.field_c + (var2_int >> 1);
            vm.field_s = vm.field_s + param1.e(3);
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) (Object) runtimeException, "pn.P(" + 63 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    pn(gl param0, boolean param1, int param2, int param3, int param4, int param5) {
        this(param0, param1);
        try {
            ((pn) this).b(param5, param4, param2, param3, -16555);
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) (Object) runtimeException, "pn.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final String c(byte param0) {
        String var2 = ((pn) this).field_hb.c(param0);
        if (!(var2 == null)) {
            return var2;
        }
        if (!((pn) this).field_q) {
            return null;
        }
        return null == ((pn) this).field_B ? ((pn) this).field_E : ((pn) this).field_B;
    }

    final int i(int param0) {
        NumberFormatException var2 = null;
        int stackIn_3_0 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        L0: {
          if (param0 == -22079) {
            break L0;
          } else {
            ((pn) this).field_ib = null;
            break L0;
          }
        }
        try {
          L1: {
            stackOut_2_0 = Integer.parseInt(((pn) this).field_gb.field_E);
            stackIn_3_0 = stackOut_2_0;
            break L1;
          }
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (NumberFormatException) (Object) decompiledCaughtException;
          return -1;
        }
        return stackIn_3_0;
    }

    final void a(byte param0, qf param1) {
        try {
            super.a((byte) 88, param1);
            if (param0 < 74) {
                Object var4 = null;
                boolean discarded$0 = pn.a((wb) null, (wb) null, true);
            }
            ((pn) this).field_gb.field_v = (kg) (Object) param1;
            ((pn) this).field_hb.field_v = (kg) (Object) param1;
            ((pn) this).field_ib.field_v = (kg) (Object) param1;
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) (Object) runtimeException, "pn.H(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean a(wb param0, wb param1, boolean param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        Object var5 = null;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        var4 = client.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              if (!param2) {
                break L1;
              } else {
                var5 = null;
                boolean discarded$2 = pn.a((wb) null, (wb) null, true);
                break L1;
              }
            }
            L2: {
              var3_int = -param0.field_Xb + param1.field_Xb;
              if (f.field_w != param1.field_Vb) {
                if (param1.field_Vb != null) {
                  break L2;
                } else {
                  var3_int += 200;
                  break L2;
                }
              } else {
                var3_int -= 200;
                break L2;
              }
            }
            L3: {
              if (f.field_w == param0.field_Vb) {
                var3_int += 200;
                break L3;
              } else {
                if (param0.field_Vb != null) {
                  break L3;
                } else {
                  var3_int -= 200;
                  break L3;
                }
              }
            }
            L4: {
              if (var3_int <= 0) {
                stackOut_13_0 = 0;
                stackIn_14_0 = stackOut_13_0;
                break L4;
              } else {
                stackOut_12_0 = 1;
                stackIn_14_0 = stackOut_12_0;
                break L4;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var3;
            stackOut_15_1 = new StringBuilder().append("pn.U(");
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param0 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L5;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L5;
            }
          }
          L6: {
            stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
            stackOut_18_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',');
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param1 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L6;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L6;
            }
          }
          throw dh.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + ',' + param2 + ')');
        }
        return stackIn_14_0 != 0;
    }

    public static void l(int param0) {
        field_bb = null;
        field_eb = null;
        field_fb = null;
    }

    private final void a(int param0, String param1, int param2, ce param3, int param4) {
        try {
            bj.field_f.b(param1, (param3.field_t >> 1) + param3.field_u + param0, param2 + (param3.field_D - 5), 16777215, -1);
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) (Object) runtimeException, "pn.S(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + 0 + ')');
        }
    }

    final void b(int param0, int param1, int param2, int param3, int param4) {
        super.b(param0, param1, param2, param3, -16555);
        int var6 = param1 - 130 >> 1;
        if (((pn) this).field_cb) {
            ((pn) this).field_hb.b(param0, 25, var6, 0, -16555);
            ((pn) this).field_gb.b(param0, 25, 45 + var6, 0, -16555);
        } else {
            ((pn) this).field_gb.b(param0, 25, var6, 0, -16555);
            ((pn) this).field_hb.b(param0, 25, 45 + var6, 0, param4);
        }
        ((pn) this).field_ib.b(param0, 40, var6 - -90, 0, param4);
    }

    final int f(byte param0) {
        NumberFormatException var2 = null;
        int stackIn_3_0 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        L0: {
          if (param0 == 48) {
            break L0;
          } else {
            field_db = false;
            break L0;
          }
        }
        try {
          L1: {
            stackOut_2_0 = Integer.parseInt(((pn) this).field_ib.field_E);
            stackIn_3_0 = stackOut_2_0;
            break L1;
          }
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (NumberFormatException) (Object) decompiledCaughtException;
          return -1;
        }
        return stackIn_3_0;
    }

    final boolean k(int param0) {
        int stackIn_14_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_13_0 = 0;
        if (((pn) this).field_gb.field_E == null) {
          return true;
        } else {
          if (0 != ((pn) this).field_gb.field_E.length()) {
            if (param0 > 64) {
              L0: {
                if (null == ((pn) this).field_hb.field_E) {
                  break L0;
                } else {
                  if (0 != ((pn) this).field_hb.field_E.length()) {
                    L1: {
                      L2: {
                        if (((pn) this).field_ib.field_E == null) {
                          break L2;
                        } else {
                          if (((pn) this).field_ib.field_E.length() == 0) {
                            break L2;
                          } else {
                            stackOut_12_0 = 0;
                            stackIn_14_0 = stackOut_12_0;
                            break L1;
                          }
                        }
                      }
                      stackOut_13_0 = 1;
                      stackIn_14_0 = stackOut_13_0;
                      break L1;
                    }
                    return stackIn_14_0 != 0;
                  } else {
                    break L0;
                  }
                }
              }
              return true;
            } else {
              return true;
            }
          } else {
            return true;
          }
        }
    }

    final static we a(String param0, int param1, int param2) {
        sc var3 = null;
        RuntimeException var3_ref = null;
        sc stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        sc stackOut_0_0 = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            var3 = new sc();
            ((we) (Object) var3).field_d = param0;
            ((we) (Object) var3).field_f = param1;
            stackOut_0_0 = (sc) var3;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var3_ref;
            stackOut_2_1 = new StringBuilder().append("pn.Q(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw dh.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + ',' + param1 + ',' + 23155 + ')');
        }
        return (we) (Object) stackIn_1_0;
    }

    final static void a(boolean param0, boolean param1, boolean param2) {
        int[] var10 = null;
        int[] var9 = null;
        int[] var8 = null;
        int[] var7 = null;
        int[] var6 = null;
        int var4 = 0;
        int var5 = client.field_A ? 1 : 0;
        try {
            cd.a(true);
            gh.field_e = null;
            kf.field_I = new qc(false, 0, false, 0, 0, 3, 0, (String[]) null, 0, false, param1, param0);
            if (!param1) {
                kf.field_I.field_p.a((bh) (Object) new in(sk.field_i, 10, false), 2777);
            } else {
                kf.field_I.field_p.a((bh) (Object) new in(ka.field_M, 10, false), 2777);
            }
            am.field_c = param2;
            gk.field_Ib = false;
            var10 = j.field_d;
            var9 = var10;
            var8 = var9;
            var7 = var8;
            var6 = var7;
            int[] var3 = var6;
            for (var4 = 0; var4 < 8; var4++) {
                var10[var4] = 0;
            }
            nn.a(kf.field_I.b(param2), sb.field_u[0][0], true);
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) (Object) runtimeException, "pn.V(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_ab = 0;
        field_eb = new int[]{40, 33, 27, 22, 18, 15, 12, 10, 8, 7, 6, 5, 4, 3, 2, 1, 0};
    }
}
