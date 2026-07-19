/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vf extends r {
    static String field_n;
    static volatile int field_p;
    private boolean field_q;
    private String field_o;

    vf(c param0) {
        super(param0);
        this.field_q = false;
    }

    final String a(byte param0, String param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        mk var4_ref_mk = null;
        int var4 = 0;
        CharSequence var5 = null;
        String stackIn_3_0 = null;
        Object stackIn_10_0 = null;
        String stackIn_14_0 = null;
        String stackIn_16_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        String stackOut_2_0 = null;
        Object stackOut_9_0 = null;
        String stackOut_15_0 = null;
        String stackOut_13_0 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        try {
          L0: {
            var5 = (CharSequence) ((Object) param1);
            var3 = q.a(var5, true);
            if (var3 != null) {
              stackOut_2_0 = (String) (var3);
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (!param1.equals(this.field_o)) {
                  var4_ref_mk = jd.a(param1, 8947848);
                  if (var4_ref_mk != null) {
                    if (null == var4_ref_mk.field_b) {
                      this.field_q = var4_ref_mk.field_k;
                      this.field_o = param1;
                      break L1;
                    } else {
                      stackOut_9_0 = null;
                      stackIn_10_0 = stackOut_9_0;
                      decompiledRegionSelector0 = 1;
                      break L0;
                    }
                  } else {
                    return null;
                  }
                } else {
                  break L1;
                }
              }
              var4 = 47 % ((24 - param0) / 46);
              if (this.field_q) {
                stackOut_15_0 = lf.field_c;
                stackIn_16_0 = stackOut_15_0;
                decompiledRegionSelector0 = 3;
                break L0;
              } else {
                stackOut_13_0 = de.field_o;
                stackIn_14_0 = stackOut_13_0;
                decompiledRegionSelector0 = 2;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) (var3_ref);
            stackOut_17_1 = new StringBuilder().append("vf.A(").append(param0).append(',');
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param1 == null) {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L2;
            } else {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L2;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (String) ((Object) stackIn_10_0);
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_14_0;
            } else {
              return stackIn_16_0;
            }
          }
        }
    }

    final static boolean c(byte param0) {
        boolean discarded$5 = false;
        if (param0 == -5) {
          if (null != mg.field_a) {
            if (null == mg.field_a.l(-63)) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          discarded$5 = vf.c((byte) -24);
          if (null != mg.field_a) {
            if (null == mg.field_a.l(-63)) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    final static int a(int param0, byte param1, CharSequence param2) {
        int discarded$2 = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
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
              if (param1 > 38) {
                break L1;
              } else {
                var4 = (CharSequence) null;
                discarded$2 = vf.a(-32, (byte) -88, (CharSequence) null);
                break L1;
              }
            }
            stackOut_2_0 = jc.a(param0, 119, true, param2);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var3);
            stackOut_4_1 = new StringBuilder().append("vf.B(").append(param0).append(',').append(param1).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param2 == null) {
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
          throw pf.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    final static void e(int param0) {
        RuntimeException runtimeException = null;
        int var1_int = 0;
        int var2 = 0;
        int var3 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        String[] stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        String[] stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        String[] stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        String stackIn_12_2 = null;
        int stackIn_20_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        String[] stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        String[] stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        String stackOut_11_2 = null;
        String[] stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        String stackOut_10_2 = null;
        int stackOut_19_0 = 0;
        var3 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              rh.field_c.field_z = new String[wj.field_c[fleas.field_E].length];
              rh.field_c.field_t = new boolean[rh.field_c.field_z.length];
              if (param0 == -6359) {
                break L1;
              } else {
                vf.c(true);
                break L1;
              }
            }
            var1_int = 0;
            L2: while (true) {
              L3: {
                L4: {
                  if (var1_int >= rh.field_c.field_t.length) {
                    break L4;
                  } else {
                    stackOut_5_0 = hj.field_a[fleas.field_E] ^ -1;
                    stackIn_20_0 = stackOut_5_0;
                    stackIn_6_0 = stackOut_5_0;
                    if (var3 != 0) {
                      break L3;
                    } else {
                      L5: {
                        if (stackIn_6_0 > (var1_int ^ -1)) {
                          stackOut_8_0 = 0;
                          stackIn_9_0 = stackOut_8_0;
                          break L5;
                        } else {
                          stackOut_7_0 = 1;
                          stackIn_9_0 = stackOut_7_0;
                          break L5;
                        }
                      }
                      L6: {
                        var2 = stackIn_9_0;
                        stackOut_9_0 = rh.field_c.field_z;
                        stackOut_9_1 = var1_int;
                        stackIn_11_0 = stackOut_9_0;
                        stackIn_11_1 = stackOut_9_1;
                        stackIn_10_0 = stackOut_9_0;
                        stackIn_10_1 = stackOut_9_1;
                        if (var2 != 0) {
                          stackOut_11_0 = (String[]) ((Object) stackIn_11_0);
                          stackOut_11_1 = stackIn_11_1;
                          stackOut_11_2 = wj.field_c[fleas.field_E][var1_int];
                          stackIn_12_0 = stackOut_11_0;
                          stackIn_12_1 = stackOut_11_1;
                          stackIn_12_2 = stackOut_11_2;
                          break L6;
                        } else {
                          stackOut_10_0 = (String[]) ((Object) stackIn_10_0);
                          stackOut_10_1 = stackIn_10_1;
                          stackOut_10_2 = ik.field_C;
                          stackIn_12_0 = stackOut_10_0;
                          stackIn_12_1 = stackOut_10_1;
                          stackIn_12_2 = stackOut_10_2;
                          break L6;
                        }
                      }
                      L7: {
                        stackIn_12_0[stackIn_12_1] = stackIn_12_2;
                        if (0 != fleas.field_E) {
                          break L7;
                        } else {
                          if (-16 < (var1_int ^ -1)) {
                            break L7;
                          } else {
                            L8: {
                              if (qh.c((byte) 107)) {
                                break L8;
                              } else {
                                if (0 < wc.field_q) {
                                  break L7;
                                } else {
                                  break L8;
                                }
                              }
                            }
                            rh.field_c.field_z[var1_int] = nb.field_e;
                            var2 = 0;
                            break L7;
                          }
                        }
                      }
                      rh.field_c.field_t[var1_int] = var2 != 0;
                      var1_int++;
                      if (var3 == 0) {
                        continue L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                rh.field_c.field_x = 0;
                rh.field_c.field_S = 0;
                stackOut_19_0 = 336;
                stackIn_20_0 = stackOut_19_0;
                break L3;
              }
              ll.d(stackIn_20_0);
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw pf.a((Throwable) ((Object) runtimeException), "vf.K(" + param0 + ')');
        }
    }

    public static void c(boolean param0) {
        field_n = null;
        if (param0) {
            field_p = 114;
        }
    }

    final void d(boolean param0) {
        if (!param0) {
            vf.c(false);
            this.field_o = null;
            return;
        }
        this.field_o = null;
    }

    final wd a(int param0, String param1) {
        mk var3 = null;
        RuntimeException var3_ref = null;
        CharSequence var4 = null;
        wd stackIn_5_0 = null;
        wd stackIn_12_0 = null;
        wd stackIn_17_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        wd stackOut_4_0 = null;
        wd stackOut_11_0 = null;
        wd stackOut_16_0 = null;
        wd stackOut_15_0 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == 160) {
                break L1;
              } else {
                this.field_q = true;
                break L1;
              }
            }
            var4 = (CharSequence) ((Object) param1);
            if (!ud.a(1560, var4)) {
              stackOut_4_0 = ml.field_K;
              stackIn_5_0 = stackOut_4_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L2: {
                if (!param1.equals(this.field_o)) {
                  L3: {
                    var3 = jd.a(param1, 8947848);
                    if (var3 == null) {
                      break L3;
                    } else {
                      if (null == var3.field_b) {
                        this.field_q = var3.field_k;
                        this.field_o = param1;
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  stackOut_11_0 = w.field_e;
                  stackIn_12_0 = stackOut_11_0;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  break L2;
                }
              }
              L4: {
                if (this.field_q) {
                  stackOut_16_0 = hm.field_b;
                  stackIn_17_0 = stackOut_16_0;
                  break L4;
                } else {
                  stackOut_15_0 = ml.field_K;
                  stackIn_17_0 = stackOut_15_0;
                  break L4;
                }
              }
              decompiledRegionSelector0 = 2;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3_ref = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) (var3_ref);
            stackOut_18_1 = new StringBuilder().append("vf.D(").append(param0).append(',');
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param1 == null) {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L5;
            } else {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L5;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_12_0;
          } else {
            return stackIn_17_0;
          }
        }
    }

    static {
        field_p = -1;
        field_n = "Loading sound effects";
    }
}
