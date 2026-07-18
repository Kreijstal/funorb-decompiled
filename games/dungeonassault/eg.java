/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eg {
    private int field_a;
    static String field_f;
    static String[] field_b;
    private dh field_c;
    private int field_e;
    private qi field_h;
    static String field_g;
    static int field_d;

    final Object a(int param0, long param1) {
        pb var6 = null;
        wf var7 = (wf) (Object) ((eg) this).field_h.a(1, param1);
        if (var7 == null) {
            return null;
        }
        if (param0 > -2) {
            return null;
        }
        Object var5 = var7.d(22698);
        if (!(var5 != null)) {
            var7.a(false);
            var7.b((byte) -2);
            ((eg) this).field_e = ((eg) this).field_e + var7.field_A;
            return null;
        }
        if (!var7.c((byte) 21)) {
            ((eg) this).field_c.a((ll) (Object) var7, false);
            var7.field_o = 0L;
        } else {
            var6 = new pb(var5, var7.field_A);
            ((eg) this).field_h.a(var7.field_h, (byte) -128, (ne) (Object) var6);
            ((eg) this).field_c.a((ll) (Object) var6, false);
            ((wf) (Object) var6).field_o = 0L;
            var7.a(false);
            var7.b((byte) -2);
        }
        return var5;
    }

    final static String a() {
        return ra.field_c.d(-104);
    }

    final static int c() {
        return (int)(1000000000L / hk.field_e);
    }

    static long a(long param0, long param1) {
        return param0 & param1;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, cn param5, int param6, int param7, int param8, se param9) {
        ig.field_a = 2;
        e.field_d = 80;
        wm.field_b = 80;
        md.field_f = -2400;
        cb.field_b = 40;
        try {
            je.field_b = 15;
            qc.field_z = param5;
            lj.field_m = 40;
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) (Object) runtimeException, "eg.K(" + 80 + ',' + 15 + ',' + 16744576 + ',' + 40 + ',' + 5 + ',' + (param5 != null ? "{...}" : "null") + ',' + 2 + ',' + 40 + ',' + -2400 + ',' + (param9 != null ? "{...}" : "null") + ',' + 80 + ')');
        }
    }

    private final void a(long param0) {
        wf var4 = (wf) (Object) ((eg) this).field_h.a(1, param0);
        this.a(var4, (byte) 85);
    }

    private final void a(wf param0, byte param1) {
        try {
            if (!(param0 == null)) {
                param0.a(false);
                param0.b((byte) -2);
                ((eg) this).field_e = ((eg) this).field_e + param0.field_A;
            }
            int var3_int = -12 / ((param1 - 44) / 38);
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) (Object) runtimeException, "eg.L(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    private eg() throws Throwable {
        throw new Error();
    }

    public static void d(int param0) {
        field_b = null;
        if (param0 != -23658) {
            return;
        }
        field_g = null;
        field_f = null;
    }

    final static String a(String param0, String param1, String param2, boolean param3) {
        int var4 = 0;
        int var5 = 0;
        var5 = DungeonAssault.field_K;
        var4 = param0.indexOf(param1);
        if (param3) {
          L0: while (true) {
            if (var4 == -1) {
              return param0;
            } else {
              param0 = param0.substring(0, var4) + param2 + param0.substring(var4 + param1.length());
              var4 = param0.indexOf(param1, param2.length() + var4);
              continue L0;
            }
          }
        } else {
          eg.b(-74);
          L1: while (true) {
            if (var4 == -1) {
              return param0;
            } else {
              param0 = param0.substring(0, var4) + param2 + param0.substring(var4 + param1.length());
              var4 = param0.indexOf(param1, param2.length() + var4);
              continue L1;
            }
          }
        }
    }

    final static void b(int param0) {
        try {
            java.lang.reflect.Method var1 = null;
            Exception var1_ref = null;
            Throwable var2 = null;
            Runtime var2_ref = null;
            Long var3 = null;
            Object var4 = null;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                L1: {
                  var1 = Runtime.class.getMethod("maxMemory", new Class[0]);
                  if (var1 == null) {
                    break L1;
                  } else {
                    try {
                      L2: {
                        var2_ref = Runtime.getRuntime();
                        var4 = null;
                        var3 = (Long) var1.invoke((Object) (Object) var2_ref, (Object[]) null);
                        sj.field_bb = 1 + (int)(var3.longValue() / 1048576L);
                        break L2;
                      }
                    } catch (java.lang.Throwable decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L3: {
                        var2 = decompiledCaughtException;
                        break L3;
                      }
                    }
                    break L1;
                  }
                }
                if (param0 > 74) {
                  break L0;
                } else {
                  eg.d(92);
                  return;
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L4: {
                var1_ref = (Exception) (Object) decompiledCaughtException;
                break L4;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(byte param0, java.applet.Applet param1) {
        try {
            java.net.URL var2 = null;
            int var2_int = 0;
            Exception var2_ref = null;
            RuntimeException var2_ref2 = null;
            RuntimeException stackIn_6_0 = null;
            StringBuilder stackIn_6_1 = null;
            RuntimeException stackIn_7_0 = null;
            StringBuilder stackIn_7_1 = null;
            RuntimeException stackIn_8_0 = null;
            StringBuilder stackIn_8_1 = null;
            String stackIn_8_2 = null;
            Throwable decompiledCaughtException = null;
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
                try {
                  L1: {
                    var2 = new java.net.URL(param1.getCodeBase(), "quit.ws");
                    param1.getAppletContext().showDocument(j.a((byte) 93, var2, param1), "_top");
                    break L1;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L2: {
                    var2_ref = (Exception) (Object) decompiledCaughtException;
                    var2_ref.printStackTrace();
                    break L2;
                  }
                }
                var2_int = -20 % ((18 - param0) / 45);
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L3: {
                var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_5_0 = (RuntimeException) var2_ref2;
                stackOut_5_1 = new StringBuilder().append("eg.D(").append(param0).append(',');
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
                  break L3;
                } else {
                  stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
                  stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
                  stackOut_6_2 = "{...}";
                  stackIn_8_0 = stackOut_6_0;
                  stackIn_8_1 = stackOut_6_1;
                  stackIn_8_2 = stackOut_6_2;
                  break L3;
                }
              }
              throw vk.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static boolean a(bo param0, int param1, bo param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        var4 = DungeonAssault.field_K;
        try {
          L0: {
            L1: {
              if (param1 == 200) {
                break L1;
              } else {
                eg.b(47);
                break L1;
              }
            }
            L2: {
              var3_int = -param2.field_Ib + param0.field_Ib;
              if (param0.field_Nb != gm.field_b) {
                if (param0.field_Nb == null) {
                  var3_int += 200;
                  break L2;
                } else {
                  break L2;
                }
              } else {
                var3_int -= 200;
                break L2;
              }
            }
            L3: {
              if (param2.field_Nb == gm.field_b) {
                var3_int += 200;
                break L3;
              } else {
                if (param2.field_Nb == null) {
                  var3_int -= 200;
                  break L3;
                } else {
                  break L3;
                }
              }
            }
            L4: {
              if (var3_int <= 0) {
                stackOut_15_0 = 0;
                stackIn_16_0 = stackOut_15_0;
                break L4;
              } else {
                stackOut_14_0 = 1;
                stackIn_16_0 = stackOut_14_0;
                break L4;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) var3;
            stackOut_17_1 = new StringBuilder().append("eg.J(");
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param0 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L5;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L5;
            }
          }
          L6: {
            stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
            stackOut_20_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(',').append(param1).append(',');
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
              break L6;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L6;
            }
          }
          throw vk.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + ')');
        }
        return stackIn_16_0 != 0;
    }

    final void a(boolean param0, Object param1, long param2) {
        RuntimeException runtimeException = null;
        Object var6 = null;
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
              this.a(param1, 1, (byte) -123, param2);
              if (param0) {
                break L1;
              } else {
                var6 = null;
                String discarded$2 = eg.a((String) null, (String) null, (String) null, false);
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
            stackOut_3_1 = new StringBuilder().append("eg.F(").append(param0).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
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
          throw vk.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ',' + param2 + ')');
        }
    }

    final static void a(md param0) {
        RuntimeException var2 = null;
        rj var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        rj var5 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        var4 = DungeonAssault.field_K;
        try {
          L0: {
            L1: {
              int discarded$2 = 0;
              var5 = to.a(hj.field_S, eh.field_h, param0);
              var2_ref = var5;
              if (wi.field_ob != var5) {
                L2: {
                  if (null == wi.field_ob) {
                    break L2;
                  } else {
                    wi.field_ob.field_p = mo.field_a;
                    break L2;
                  }
                }
                wi.field_ob = var5;
                if (wi.field_ob != null) {
                  wi.field_ob.field_m = mo.field_a;
                  break L1;
                } else {
                  break L1;
                }
              } else {
                break L1;
              }
            }
            L3: {
              if (no.field_d == 1) {
                um.field_h = 0;
                kp.field_c = lc.field_c;
                rn.field_a = hm.field_k;
                int discarded$3 = 0;
                pa.field_c = to.a(lc.field_c, hm.field_k, param0);
                break L3;
              } else {
                if (la.field_g != 1) {
                  L4: {
                    if (np.field_M == null) {
                      break L4;
                    } else {
                      if (um.field_h >= 5) {
                        hh.field_s = null;
                        np.field_M = null;
                        pa.field_c = null;
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                  hh.field_s = pa.field_c;
                  if (null == hh.field_s) {
                    np.field_M = null;
                    pa.field_c = null;
                    break L3;
                  } else {
                    hh.field_s.a(-hh.field_s.field_i + eh.field_h, (byte) -98, -hh.field_s.field_t + hj.field_S);
                    np.field_M = null;
                    pa.field_c = null;
                    break L3;
                  }
                } else {
                  L5: {
                    um.field_h = um.field_h + 1;
                    if (np.field_M != null) {
                      break L5;
                    } else {
                      var3 = (rn.field_a - eh.field_h) * (rn.field_a + -eh.field_h) + (-hj.field_S + kp.field_c) * (-hj.field_S + kp.field_c);
                      if (var3 <= 5) {
                        break L5;
                      } else {
                        if (5 >= um.field_h) {
                          break L5;
                        } else {
                          np.field_M = pa.field_c;
                          break L5;
                        }
                      }
                    }
                  }
                  if (null == np.field_M) {
                    break L3;
                  } else {
                    np.field_M.d(-np.field_M.field_t + hj.field_S, 128, -np.field_M.field_i + eh.field_h);
                    break L3;
                  }
                }
              }
            }
            L6: {
              if (pj.field_r == 0) {
                break L6;
              } else {
                if (null == wi.field_ob) {
                  break L6;
                } else {
                  wi.field_ob.a(1, pj.field_r);
                  return;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var2 = decompiledCaughtException;
            stackOut_30_0 = (RuntimeException) var2;
            stackOut_30_1 = new StringBuilder().append("eg.I(");
            stackIn_32_0 = stackOut_30_0;
            stackIn_32_1 = stackOut_30_1;
            stackIn_31_0 = stackOut_30_0;
            stackIn_31_1 = stackOut_30_1;
            if (param0 == null) {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "null";
              stackIn_33_0 = stackOut_32_0;
              stackIn_33_1 = stackOut_32_1;
              stackIn_33_2 = stackOut_32_2;
              break L7;
            } else {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "{...}";
              stackIn_33_0 = stackOut_31_0;
              stackIn_33_1 = stackOut_31_1;
              stackIn_33_2 = stackOut_31_2;
              break L7;
            }
          }
          throw vk.a((Throwable) (Object) stackIn_33_0, stackIn_33_2 + ',' + true + ')');
        }
    }

    private final void a(Object param0, int param1, byte param2, long param3) {
        wf var6 = null;
        pb var6_ref = null;
        int var7 = DungeonAssault.field_K;
        try {
            if (((eg) this).field_a < 1) {
                throw new IllegalStateException();
            }
            int discarded$0 = -110;
            this.a(param3);
            ((eg) this).field_e = ((eg) this).field_e - 1;
            while (0 > ((eg) this).field_e) {
                var6 = (wf) (Object) ((eg) this).field_c.b(true);
                this.a(var6, (byte) 120);
            }
            var6_ref = new pb(param0, 1);
            ((eg) this).field_h.a(param3, (byte) -128, (ne) (Object) var6_ref);
            ((eg) this).field_c.a((ll) (Object) var6_ref, false);
            ((wf) (Object) var6_ref).field_o = 0L;
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) (Object) runtimeException, "eg.E(" + (param0 != null ? "{...}" : "null") + ',' + 1 + ',' + -123 + ',' + param3 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new String[]{"Monster", "<%highlight>You have encountered a Monster in this room!</col> The statistics of a room are displayed in the bottom-right, opposite your raider's. These statistics are slightly different from those of a raider: <%attack>, <%defence>, <%snare> and <%detect>. A <%monster>, such as <%lastroom>, will usually have high <%attack> and <%defence>."};
        field_g = "<%col_detect>Detect +2 to all monsters.</col>";
        field_f = "Detect";
    }
}
