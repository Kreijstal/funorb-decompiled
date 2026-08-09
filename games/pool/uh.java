/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uh extends ig {
    static dd field_p;
    static int field_x;
    static int field_q;
    static String field_s;
    static wj field_u;
    static boolean field_o;
    private sl field_m;
    static int field_n;
    static int[] field_t;
    static ge field_r;
    private sl field_v;
    static int field_w;

    final static void a(int param0, vh param1, vh param2, vh param3, vh param4) {
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        String var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        String var7 = null;
        try {
          L0: {
            if (oq.field_z != null) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                rg.field_p = false;
                if (ea.field_z) {
                  var5 = fg.field_e;
                  break L1;
                } else {
                  if (!hr.field_y) {
                    var5 = vc.field_J;
                    break L1;
                  } else {
                    var5 = sk.field_c;
                    break L1;
                  }
                }
              }
              var7 = (String) null;
              dr.a((String) null, 11468, mc.field_g, 0, var5);
              pa.field_J.field_P = (8355711 & kb.field_h.field_P >> 2012807745) + (mc.field_g - (8355711 & mc.field_g >> -1388095295));
              lh.field_i = fj.field_j;
              pa.field_J.field_K = ((kb.field_h.field_K & 16711423) >> 12914017) + (-((16711423 & mc.field_g) >> 725513057) + mc.field_g);
              pa.field_J.field_Bb = -((mc.field_g & 16711422) >> 289165377) + (mc.field_g - -(8355711 & kb.field_h.field_Bb >> -332210079));
              oq.field_z = pa.field_J;
              uq.field_D = new vh(0L, param4);
              ma.field_e = new vh(0L, param3);
              ml.field_e = new vh(0L, (vh) null);
              vi.field_c = new vh(0L, param1);
              pa.field_J = new vh(0L, param2);
              pa.field_J.field_I = m.field_c;
              vi.field_c.a(78, pa.field_J);
              fj.field_j = new vh(0L, lh.field_i);
              vi.field_c.a(113, fj.field_j);
              be.field_L = new vh(0L, kb.field_h, ra.field_d);
              wn.field_g = new vh(0L, kb.field_h);
              var6 = 43 % ((-44 - param0) / 45);
              uq.field_D.a(14, ma.field_e);
              uq.field_D.a(-121, ml.field_e);
              ml.field_e.a(-96, vi.field_c);
              ml.field_e.a(127, be.field_L);
              ml.field_e.a(43, wn.field_g);
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5_ref = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var5_ref);

            stackIn_12_1 = new StringBuilder().append("uh.O(").append(param0).append(',');

            if (param1 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L2;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');

            if (param2 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L3;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_18_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',');

            if (param3 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L4;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_21_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(',');

            if (param4 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L5;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L5;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_13_0), stackIn_22_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final na a(String param0, boolean param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        na stackIn_5_0 = null;
        na stackIn_9_0 = null;
        na stackIn_13_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var3 = this.field_v.field_m.toLowerCase();
              if (param1) {
                break L1;
              } else {
                field_p = (dd) null;
                break L1;
              }
            }
            var4 = param0.toLowerCase();
            if (var4.length() == 0) {
              stackIn_5_0 = gp.field_d;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (!jd.a((byte) -122, var3, var4)) {
                stackIn_9_0 = gp.field_d;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (this.a(-31894, param0)) {
                  stackIn_13_0 = gp.field_d;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  return kr.field_e;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var3_ref);

            stackIn_16_1 = new StringBuilder().append("uh.K(");

            if (param0 == null) {
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
          throw wm.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_9_0;
          } else {
            return stackIn_13_0;
          }
        }
    }

    public static void b(boolean param0) {
        field_t = null;
        field_u = null;
        field_s = null;
        field_p = null;
        field_r = null;
        if (!param0) {
            uh.b(true);
        }
    }

    uh(sl param0, sl param1, sl param2) {
        super(param0);
        try {
            this.field_v = param1;
            this.field_m = param2;
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) ((Object) runtimeException), "uh.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    private final boolean a(int param0, String param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        int var5 = 0;
        String var6 = null;
        String var7 = null;
        int stackIn_11_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_17_0 = 0;
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
              if (param0 == -31894) {
                break L1;
              } else {
                field_w = -85;
                break L1;
              }
            }
            L2: {
              var3 = this.field_m.field_m.toLowerCase();
              var4 = param1.toLowerCase();
              if (var3.length() <= 0) {
                break L2;
              } else {
                if (-1 > (var4.length() ^ -1)) {
                  var5 = var3.lastIndexOf("@");
                  if (-1 < (var5 ^ -1)) {
                    break L2;
                  } else {
                    if (var5 < -1 + var3.length()) {
                      var6 = var3.substring(0, var5);
                      var7 = var3.substring(var5 - -1);
                      if (0 <= var4.indexOf(var6)) {
                        stackIn_11_0 = 1;
                        decompiledRegionSelector0 = 0;
                        break L0;
                      } else {
                        L3: {
                          if (0 <= var4.indexOf(var7)) {
                            stackIn_15_0 = 1;
                            break L3;
                          } else {
                            stackIn_15_0 = 0;
                            break L3;
                          }
                        }
                        decompiledRegionSelector0 = 1;
                        break L0;
                      }
                    } else {
                      break L2;
                    }
                  }
                } else {
                  return false;
                }
              }
            }
            stackIn_17_0 = 0;
            decompiledRegionSelector0 = 2;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackIn_20_0 = (RuntimeException) (var3_ref);

            stackIn_20_1 = new StringBuilder().append("uh.M(").append(param0).append(',');

            if (param1 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L4;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L4;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_11_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_15_0 != 0;
          } else {
            return stackIn_17_0 != 0;
          }
        }
    }

    final String a(String param0, int param1) {
        RuntimeException var3 = null;
        String var4 = null;
        String var5 = null;
        String var6 = null;
        String var7 = null;
        Object stackIn_2_0 = null;
        String stackIn_5_0 = null;
        String stackIn_10_0 = null;
        String stackIn_14_0 = null;
        String stackIn_18_0 = null;
        String stackIn_21_0 = null;
        String stackIn_24_0 = null;
        String stackIn_28_0 = null;
        String stackIn_32_0 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_36_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var7 = this.field_v.field_m.toLowerCase();
            var4 = param0.toLowerCase();
            if (-1 != (var4.length() ^ -1)) {
              var5 = var4;
              if (!gh.a(var5, 28350)) {
                L1: {
                  if (param1 == 0) {
                    break L1;
                  } else {
                    var6 = (String) null;
                    this.a((String) null, -37);
                    break L1;
                  }
                }
                if (!qa.a(1, var5)) {
                  if (bm.a(var5, -113)) {
                    stackIn_14_0 = lh.field_b;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    if (this.a(-31894, param0)) {
                      stackIn_18_0 = l.field_b;
                      decompiledRegionSelector0 = 4;
                      break L0;
                    } else {
                      if (-1 > (var7.length() ^ -1)) {
                        if (!hq.a(var5, var7, 17924)) {
                          if (co.a(var7, (byte) -112, var5)) {
                            stackIn_28_0 = ka.field_m;
                            decompiledRegionSelector0 = 7;
                            break L0;
                          } else {
                            if (wg.a(23138, var7, var5)) {
                              stackIn_32_0 = nk.field_o;
                              decompiledRegionSelector0 = 8;
                              break L0;
                            } else {
                              return uq.field_K;
                            }
                          }
                        } else {
                          stackIn_24_0 = nk.field_o;
                          decompiledRegionSelector0 = 6;
                          break L0;
                        }
                      } else {
                        stackIn_21_0 = hb.field_r;
                        decompiledRegionSelector0 = 5;
                        break L0;
                      }
                    }
                  }
                } else {
                  stackIn_10_0 = bm.field_a;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                stackIn_5_0 = uq.field_K;
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
          L2: {
            var3 = decompiledCaughtException;
            stackIn_35_0 = (RuntimeException) (var3);

            stackIn_35_1 = new StringBuilder().append("uh.L(");

            if (param0 == null) {
              stackIn_36_0 = (RuntimeException) ((Object) stackIn_35_0);
              stackIn_36_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackIn_36_2 = "null";
              break L2;
            } else {
              stackIn_36_0 = (RuntimeException) ((Object) stackIn_35_0);
              stackIn_36_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackIn_36_2 = "{...}";
              break L2;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_36_0), stackIn_36_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (String) ((Object) stackIn_2_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_10_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_14_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_18_0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_21_0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_24_0;
                    } else {
                      if (decompiledRegionSelector0 == 7) {
                        return stackIn_28_0;
                      } else {
                        return stackIn_32_0;
                      }
                    }
                  }
                }
              }
            }
          }
        }
    }

    static {
        field_q = 10485;
        field_s = "Waiting for <%0> to start the game...";
        field_t = new int[3];
        field_w = 128 * field_q / 5;
    }
}
