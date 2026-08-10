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
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var5 = (CharSequence) ((Object) param1);
            var3 = q.a(var5, true);
            if (var3 != null) {
              stackIn_3_0 = (String) (var3);
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
                      stackIn_10_0 = null;
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
                stackIn_16_0 = lf.field_c;
                decompiledRegionSelector0 = 3;
                break L0;
              } else {
                stackIn_14_0 = de.field_o;
                decompiledRegionSelector0 = 2;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackIn_19_0 = (RuntimeException) (var3_ref);

            stackIn_19_1 = new StringBuilder().append("vf.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L2;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
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
        int stackIn_6_0 = 0;
        L0: {
          if (param0 == -5) {
            break L0;
          } else {
            vf.c((byte) -24);
            break L0;
          }
        }
        L1: {
          L2: {
            if (null == mg.field_a) {
              break L2;
            } else {
              if (null == mg.field_a.l(-63)) {
                break L2;
              } else {
                stackIn_6_0 = 1;
                break L1;
              }
            }
          }
          stackIn_6_0 = 0;
          break L1;
        }
        return stackIn_6_0 != 0;
    }

    final static int a(int param0, byte param1, CharSequence param2) {
        RuntimeException var3 = null;
        CharSequence var4 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 > 38) {
                break L1;
              } else {
                var4 = (CharSequence) null;
                vf.a(-32, (byte) -88, (CharSequence) null);
                break L1;
              }
            }
            stackIn_3_0 = jc.a(param0, 119, true, param2);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("vf.B(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    final static void e(int param0) {
        int var1_int = 0;
        int var2 = 0;
        int var3 = fleas.field_A ? 1 : 0;
        try {
            rh.field_c.field_z = new String[wj.field_c[fleas.field_E].length];
            rh.field_c.field_t = new boolean[rh.field_c.field_z.length];
            if (param0 != -6359) {
                vf.c(true);
            }
            for (var1_int = 0; var1_int < rh.field_c.field_t.length; var1_int++) {
                var2 = hj.field_a[fleas.field_E] >= var1_int ? 1 : 0;
                rh.field_c.field_z[var1_int] = var2 == 0 ? ik.field_C : wj.field_c[fleas.field_E][var1_int];
                if (0 == fleas.field_E && -16 >= (var1_int ^ -1)) {
                    if (qh.c((byte) 107) || 0 >= wc.field_q) {
                        rh.field_c.field_z[var1_int] = nb.field_e;
                        var2 = 0;
                    }
                }
                rh.field_c.field_t[var1_int] = var2 != 0;
            }
            rh.field_c.field_x = 0;
            rh.field_c.field_S = 0;
            ll.d(336);
        } catch (RuntimeException runtimeException) {
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
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
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
              stackIn_5_0 = ml.field_K;
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
                  stackIn_12_0 = w.field_e;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  break L2;
                }
              }
              L4: {
                if (this.field_q) {
                  stackIn_17_0 = hm.field_b;
                  break L4;
                } else {
                  stackIn_17_0 = ml.field_K;
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
            stackIn_20_0 = (RuntimeException) (var3_ref);

            stackIn_20_1 = new StringBuilder().append("vf.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L5;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
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
