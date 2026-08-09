/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tc extends na {
    private dh field_e;
    static hr[] field_j;
    static ri field_i;
    static ck field_g;
    private dh field_h;
    static String field_f;

    final String a(int param0, String param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        String var5 = null;
        Object stackIn_2_0 = null;
        String stackIn_5_0 = null;
        String stackIn_8_0 = null;
        String stackIn_11_0 = null;
        String stackIn_14_0 = null;
        String stackIn_19_0 = null;
        String stackIn_22_0 = null;
        String stackIn_26_0 = null;
        String stackIn_28_0 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var3 = this.field_h.field_m.toLowerCase();
            var4 = param1.toLowerCase();
            if (param0 != var4.length()) {
              var5 = var4;
              if (!ao.a(var5, 30996)) {
                if (!me.a(false, var5)) {
                  if (!hp.a(var5, true)) {
                    if (!this.b(-53, param1)) {
                      if (var3.length() <= 0) {
                        stackIn_28_0 = ka.field_a;
                        decompiledRegionSelector0 = 8;
                        break L0;
                      } else {
                        if (gt.a(var5, var3, 82)) {
                          stackIn_19_0 = vr.field_F;
                          decompiledRegionSelector0 = 5;
                          break L0;
                        } else {
                          if (!jd.a(var5, (byte) 114, var3)) {
                            if (wv.a(false, var5, var3)) {
                              stackIn_26_0 = vr.field_F;
                              decompiledRegionSelector0 = 7;
                              break L0;
                            } else {
                              return sg.field_k;
                            }
                          } else {
                            stackIn_22_0 = mm.field_e;
                            decompiledRegionSelector0 = 6;
                            break L0;
                          }
                        }
                      }
                    } else {
                      stackIn_14_0 = pc.field_a;
                      decompiledRegionSelector0 = 4;
                      break L0;
                    }
                  } else {
                    stackIn_11_0 = mc.field_J;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  }
                } else {
                  stackIn_8_0 = ur.field_X;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                stackIn_5_0 = sg.field_k;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackIn_31_0 = (RuntimeException) (var3_ref);

            stackIn_31_1 = new StringBuilder().append("tc.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "null";
              break L1;
            } else {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "{...}";
              break L1;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_32_0), stackIn_32_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (String) ((Object) stackIn_2_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_8_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_11_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_14_0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_19_0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_22_0;
                    } else {
                      if (decompiledRegionSelector0 == 7) {
                        return stackIn_26_0;
                      } else {
                        return stackIn_28_0;
                      }
                    }
                  }
                }
              }
            }
          }
        }
    }

    final gf a(byte param0, String param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        gf stackIn_2_0 = null;
        gf stackIn_6_0 = null;
        gf stackIn_9_0 = null;
        gf stackIn_13_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var3 = this.field_h.field_m.toLowerCase();
            var4 = param1.toLowerCase();
            if (-1 != (var4.length() ^ -1)) {
              if (!gg.a(var4, var3, -83)) {
                stackIn_6_0 = qr.field_e;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (!this.b(98, param1)) {
                  L1: {
                    if (param0 == 26) {
                      break L1;
                    } else {
                      field_j = (hr[]) null;
                      break L1;
                    }
                  }
                  stackIn_13_0 = qe.field_a;
                  decompiledRegionSelector0 = 3;
                  break L0;
                } else {
                  stackIn_9_0 = qr.field_e;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              }
            } else {
              stackIn_2_0 = qr.field_e;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var3_ref);

            stackIn_16_1 = new StringBuilder().append("tc.E(").append(param0).append(',');

            if (param1 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L2;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L2;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_9_0;
            } else {
              return stackIn_13_0;
            }
          }
        }
    }

    private final boolean b(int param0, String param1) {
        RuntimeException var3 = null;
        String var4 = null;
        int var5 = 0;
        int var6 = 0;
        String var7 = null;
        String var8 = null;
        String var9 = null;
        int stackIn_6_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var9 = this.field_e.field_m.toLowerCase();
              var4 = param1.toLowerCase();
              var5 = -109 % ((10 - param0) / 60);
              if (0 >= var9.length()) {
                break L1;
              } else {
                if (-1 <= (var4.length() ^ -1)) {
                  break L1;
                } else {
                  var6 = var9.lastIndexOf("@");
                  if (-1 < (var6 ^ -1)) {
                    break L1;
                  } else {
                    if (var9.length() - 1 <= var6) {
                      break L1;
                    } else {
                      var7 = var9.substring(0, var6);
                      var8 = var9.substring(var6 - -1);
                      if (-1 < (var4.indexOf(var7) ^ -1)) {
                        if ((var4.indexOf(var8) ^ -1) <= -1) {
                          stackIn_10_0 = 1;
                          decompiledRegionSelector0 = 1;
                          break L0;
                        } else {
                          return false;
                        }
                      } else {
                        stackIn_6_0 = 1;
                        decompiledRegionSelector0 = 0;
                        break L0;
                      }
                    }
                  }
                }
              }
            }
            stackIn_12_0 = 0;
            decompiledRegionSelector0 = 2;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var3);

            stackIn_15_1 = new StringBuilder().append("tc.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L2;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L2;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_10_0 != 0;
          } else {
            return stackIn_12_0 != 0;
          }
        }
    }

    final static void e(int param0) {
        ta.field_b = 0;
        qk.field_T = -1;
        bn.field_P = false;
        ei.field_a = 0;
        if (param0 < 85) {
          return;
        } else {
          cl.field_w = false;
          bi.field_c = 0;
          ew.field_e = 0;
          b.field_c = false;
          hl.field_e = false;
          vb.field_E = false;
          nq.field_i = 0;
          return;
        }
    }

    public static void f(int param0) {
        field_i = null;
        field_j = null;
        if (param0 != -1) {
            return;
        }
        field_g = null;
        field_f = null;
    }

    tc(dh param0, dh param1, dh param2) {
        super(param0);
        try {
            this.field_e = param2;
            this.field_h = param1;
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) ((Object) runtimeException), "tc.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_g = new ck();
    }
}
