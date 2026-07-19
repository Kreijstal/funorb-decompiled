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
        Object var5 = null;
        pb var6 = null;
        wf var7 = null;
        var7 = (wf) ((Object) this.field_h.a(1, param1));
        if (var7 != null) {
          if (param0 <= -2) {
            var5 = var7.d(22698);
            if (var5 == null) {
              var7.a(false);
              var7.b((byte) -2);
              this.field_e = this.field_e + var7.field_A;
              return null;
            } else {
              if (!var7.c((byte) 21)) {
                this.field_c.a(var7, false);
                var7.field_o = 0L;
                if (DungeonAssault.field_K != 0) {
                  var6 = new pb(var5, var7.field_A);
                  this.field_h.a(var7.field_h, (byte) -128, var6);
                  this.field_c.a(var6, false);
                  ((wf) ((Object) var6)).field_o = 0L;
                  var7.a(false);
                  var7.b((byte) -2);
                  return var5;
                } else {
                  return var5;
                }
              } else {
                var6 = new pb(var5, var7.field_A);
                this.field_h.a(var7.field_h, (byte) -128, var6);
                this.field_c.a(var6, false);
                ((wf) ((Object) var6)).field_o = 0L;
                var7.a(false);
                var7.b((byte) -2);
                return var5;
              }
            }
          } else {
            return (Object) null;
          }
        } else {
          return null;
        }
    }

    final static String a(int param0) {
        if (param0 > -4) {
            field_d = 71;
            return ra.field_c.d(-104);
        }
        return ra.field_c.d(-104);
    }

    final static int c(int param0) {
        String discarded$2 = null;
        String var2 = null;
        if (param0 != 1) {
          var2 = (String) null;
          discarded$2 = eg.a((String) null, (String) null, (String) null, false);
          return (int)(1000000000L / hk.field_e);
        } else {
          return (int)(1000000000L / hk.field_e);
        }
    }

    static long a(long param0, long param1) {
        return param0 & param1;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, cn param5, int param6, int param7, int param8, se param9, int param10) {
        ig.field_a = param6;
        e.field_d = param10;
        wm.field_b = param0;
        md.field_f = param8;
        cb.field_b = param3;
        if (param4 != 5) {
            return;
        }
        try {
            je.field_b = param1;
            qc.field_z = param5;
            lj.field_m = param7;
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) ((Object) runtimeException), "eg.K(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ',' + param6 + ',' + param7 + ',' + param8 + ',' + (param9 != null ? "{...}" : "null") + ',' + param10 + ')');
        }
    }

    private final void a(long param0, byte param1) {
        wf var4 = null;
        if (param1 != -110) {
          this.field_h = (qi) null;
          var4 = (wf) ((Object) this.field_h.a(1, param0));
          this.a(var4, (byte) 85);
          return;
        } else {
          var4 = (wf) ((Object) this.field_h.a(1, param0));
          this.a(var4, (byte) 85);
          return;
        }
    }

    private final void a(wf param0, byte param1) {
        try {
            if (!(param0 == null)) {
                param0.a(false);
                param0.b((byte) -2);
                this.field_e = this.field_e + param0.field_A;
            }
            int var3_int = -12 / ((param1 - 44) / 38);
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) ((Object) runtimeException), "eg.L(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
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
        String stackIn_5_0 = null;
        String stackIn_6_0 = null;
        String stackOut_4_0 = null;
        L0: {
          var5 = DungeonAssault.field_K;
          var4 = param0.indexOf(param1);
          if (param3) {
            break L0;
          } else {
            eg.b(-74);
            break L0;
          }
        }
        L1: while (true) {
          if (var4 != -1) {
            param0 = param0.substring(0, var4) + param2 + param0.substring(var4 + param1.length());
            stackOut_4_0 = (String) (param0);
            stackIn_6_0 = stackOut_4_0;
            stackIn_5_0 = stackOut_4_0;
            if (var5 == 0) {
              var4 = ((String) (Object) stackIn_6_0).indexOf(param1, param2.length() + var4);
              continue L1;
            } else {
              return stackIn_5_0;
            }
          } else {
            return param0;
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
            Object[] var4 = null;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                L1: {
                  var1 = Runtime.class.getMethod("maxMemory", new Class[]{});
                  if (var1 == null) {
                    break L1;
                  } else {
                    try {
                      L2: {
                        var2_ref = Runtime.getRuntime();
                        var4 = (Object[]) null;
                        var3 = (Long) (var1.invoke((Object) (var2_ref), (Object[]) null));
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
                stackOut_5_0 = (RuntimeException) (var2_ref2);
                stackOut_5_1 = new StringBuilder().append("eg.D(").append(param0).append(',');
                stackIn_7_0 = stackOut_5_0;
                stackIn_7_1 = stackOut_5_1;
                stackIn_6_0 = stackOut_5_0;
                stackIn_6_1 = stackOut_5_1;
                if (param1 == null) {
                  stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
                  stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
                  stackOut_7_2 = "null";
                  stackIn_8_0 = stackOut_7_0;
                  stackIn_8_1 = stackOut_7_1;
                  stackIn_8_2 = stackOut_7_2;
                  break L3;
                } else {
                  stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
                  stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
                  stackOut_6_2 = "{...}";
                  stackIn_8_0 = stackOut_6_0;
                  stackIn_8_1 = stackOut_6_1;
                  stackIn_8_2 = stackOut_6_2;
                  break L3;
                }
              }
              throw vk.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
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
        int stackIn_17_0 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_16_0 = 0;
        int stackOut_15_0 = 0;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
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
              L3: {
                var3_int = -param2.field_Ib + param0.field_Ib;
                if (param0.field_Nb != gm.field_b) {
                  break L3;
                } else {
                  var3_int -= 200;
                  if (var4 == 0) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              if (param0.field_Nb == null) {
                var3_int += 200;
                break L2;
              } else {
                break L2;
              }
            }
            L4: {
              L5: {
                if (param2.field_Nb == gm.field_b) {
                  break L5;
                } else {
                  if (param2.field_Nb == null) {
                    var3_int -= 200;
                    if (var4 == 0) {
                      break L4;
                    } else {
                      break L5;
                    }
                  } else {
                    break L4;
                  }
                }
              }
              var3_int += 200;
              break L4;
            }
            L6: {
              if ((var3_int ^ -1) >= -1) {
                stackOut_16_0 = 0;
                stackIn_17_0 = stackOut_16_0;
                break L6;
              } else {
                stackOut_15_0 = 1;
                stackIn_17_0 = stackOut_15_0;
                break L6;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3 = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) (var3);
            stackOut_18_1 = new StringBuilder().append("eg.J(");
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param0 == null) {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L7;
            } else {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L7;
            }
          }
          L8: {
            stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
            stackOut_21_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_21_2).append(',').append(param1).append(',');
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param2 == null) {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L8;
            } else {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L8;
            }
          }
          throw vk.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ')');
        }
        return stackIn_17_0 != 0;
    }

    final void a(boolean param0, Object param1, long param2) {
        String discarded$2 = null;
        RuntimeException runtimeException = null;
        String var6 = null;
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
                var6 = (String) null;
                discarded$2 = eg.a((String) null, (String) null, (String) null, false);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) (runtimeException);
            stackOut_3_1 = new StringBuilder().append("eg.F(").append(param0).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw vk.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param2 + ')');
        }
    }

    final static void a(md param0, boolean param1) {
        RuntimeException var2 = null;
        rj var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        md var5 = null;
        rj var6 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_36_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        String stackOut_35_2 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        var4 = DungeonAssault.field_K;
        try {
          L0: {
            L1: {
              if (param1) {
                break L1;
              } else {
                var5 = (md) null;
                eg.a((md) null, true);
                break L1;
              }
            }
            L2: {
              var6 = to.a(hj.field_S, eh.field_h, param0, 0);
              var2_ref = var6;
              if (wi.field_ob != var6) {
                L3: {
                  if (null == wi.field_ob) {
                    break L3;
                  } else {
                    wi.field_ob.field_p = mo.field_a;
                    break L3;
                  }
                }
                wi.field_ob = var6;
                if (wi.field_ob != null) {
                  wi.field_ob.field_m = mo.field_a;
                  break L2;
                } else {
                  break L2;
                }
              } else {
                break L2;
              }
            }
            L4: {
              L5: {
                if (-2 == (no.field_d ^ -1)) {
                  break L5;
                } else {
                  L6: {
                    if ((la.field_g ^ -1) != -2) {
                      break L6;
                    } else {
                      L7: {
                        um.field_h = um.field_h + 1;
                        if (np.field_M != null) {
                          break L7;
                        } else {
                          var3 = (rn.field_a - eh.field_h) * (rn.field_a + -eh.field_h) + (-hj.field_S + kp.field_c) * (-hj.field_S + kp.field_c);
                          if (var3 <= 5) {
                            break L7;
                          } else {
                            if (5 >= um.field_h) {
                              break L7;
                            } else {
                              np.field_M = pa.field_c;
                              break L7;
                            }
                          }
                        }
                      }
                      if (null == np.field_M) {
                        break L4;
                      } else {
                        np.field_M.d(-np.field_M.field_t + hj.field_S, 128, -np.field_M.field_i + eh.field_h);
                        if (var4 == 0) {
                          break L4;
                        } else {
                          break L6;
                        }
                      }
                    }
                  }
                  L8: {
                    L9: {
                      if (np.field_M == null) {
                        break L9;
                      } else {
                        if (-6 >= (um.field_h ^ -1)) {
                          hh.field_s = null;
                          break L8;
                        } else {
                          break L9;
                        }
                      }
                    }
                    hh.field_s = pa.field_c;
                    if (null == hh.field_s) {
                      break L8;
                    } else {
                      hh.field_s.a(-hh.field_s.field_i + eh.field_h, (byte) -98, -hh.field_s.field_t + hj.field_S);
                      if (var4 == 0) {
                        break L8;
                      } else {
                        hh.field_s = null;
                        break L8;
                      }
                    }
                  }
                  np.field_M = null;
                  pa.field_c = null;
                  if (var4 == 0) {
                    break L4;
                  } else {
                    break L5;
                  }
                }
              }
              um.field_h = 0;
              kp.field_c = lc.field_c;
              rn.field_a = hm.field_k;
              pa.field_c = to.a(lc.field_c, hm.field_k, param0, 0);
              break L4;
            }
            L10: {
              if (pj.field_r == 0) {
                break L10;
              } else {
                if (null == wi.field_ob) {
                  break L10;
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
          L11: {
            var2 = decompiledCaughtException;
            stackOut_33_0 = (RuntimeException) (var2);
            stackOut_33_1 = new StringBuilder().append("eg.I(");
            stackIn_35_0 = stackOut_33_0;
            stackIn_35_1 = stackOut_33_1;
            stackIn_34_0 = stackOut_33_0;
            stackIn_34_1 = stackOut_33_1;
            if (param0 == null) {
              stackOut_35_0 = (RuntimeException) ((Object) stackIn_35_0);
              stackOut_35_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackOut_35_2 = "null";
              stackIn_36_0 = stackOut_35_0;
              stackIn_36_1 = stackOut_35_1;
              stackIn_36_2 = stackOut_35_2;
              break L11;
            } else {
              stackOut_34_0 = (RuntimeException) ((Object) stackIn_34_0);
              stackOut_34_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackOut_34_2 = "{...}";
              stackIn_36_0 = stackOut_34_0;
              stackIn_36_1 = stackOut_34_1;
              stackIn_36_2 = stackOut_34_2;
              break L11;
            }
          }
          throw vk.a((Throwable) ((Object) stackIn_36_0), stackIn_36_2 + ',' + param1 + ')');
        }
    }

    private final void a(Object param0, int param1, byte param2, long param3) {
        String discarded$2 = null;
        RuntimeException runtimeException = null;
        pb var6 = null;
        int var7 = 0;
        String var8 = null;
        wf var9 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        var7 = DungeonAssault.field_K;
        try {
          L0: {
            if (this.field_a >= param1) {
              L1: {
                this.a(param3, (byte) -110);
                this.field_e = this.field_e - param1;
                if (param2 < -28) {
                  break L1;
                } else {
                  var8 = (String) null;
                  discarded$2 = eg.a((String) null, (String) null, (String) null, true);
                  break L1;
                }
              }
              L2: while (true) {
                L3: {
                  if (0 <= this.field_e) {
                    break L3;
                  } else {
                    var9 = (wf) ((Object) this.field_c.b(true));
                    this.a(var9, (byte) 120);
                    if (var7 == 0) {
                      continue L2;
                    } else {
                      break L3;
                    }
                  }
                }
                var6 = new pb(param0, param1);
                this.field_h.a(param3, (byte) -128, var6);
                this.field_c.a(var6, false);
                ((wf) ((Object) var6)).field_o = 0L;
                break L0;
              }
            } else {
              throw new IllegalStateException();
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            runtimeException = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) (runtimeException);
            stackOut_9_1 = new StringBuilder().append("eg.E(");
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L4;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L4;
            }
          }
          throw vk.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    static {
        field_b = new String[]{"Monster", "<%highlight>You have encountered a Monster in this room!</col> The statistics of a room are displayed in the bottom-right, opposite your raider's. These statistics are slightly different from those of a raider: <%attack>, <%defence>, <%snare> and <%detect>. A <%monster>, such as <%lastroom>, will usually have high <%attack> and <%defence>."};
        field_g = "<%col_detect>Detect +2 to all monsters.</col>";
        field_f = "Detect";
    }
}
