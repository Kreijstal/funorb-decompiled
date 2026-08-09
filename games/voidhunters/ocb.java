/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ocb extends eca {
    static String field_j;
    static String[] field_m;
    private uf field_f;
    static int[] field_h;
    private uf field_k;
    static String field_i;
    static String field_g;
    static int field_l;

    final String b(String param0, int param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        String var5 = null;
        Object stackIn_2_0 = null;
        String stackIn_5_0 = null;
        String stackIn_8_0 = null;
        String stackIn_11_0 = null;
        String stackIn_15_0 = null;
        String stackIn_18_0 = null;
        String stackIn_21_0 = null;
        String stackIn_25_0 = null;
        String stackIn_28_0 = null;
        String stackIn_30_0 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var3 = this.field_f.field_j.toLowerCase();
            var4 = param0.toLowerCase();
            if (-1 != (var4.length() ^ -1)) {
              var5 = var4;
              if (!hcb.a(var5, 15)) {
                if (!ws.a((byte) 109, var5)) {
                  if (!mea.a(126, var5)) {
                    if (this.a(param0, false)) {
                      stackIn_15_0 = gnb.field_f;
                      decompiledRegionSelector0 = 4;
                      break L0;
                    } else {
                      if ((var3.length() ^ -1) < param1) {
                        if (!qnb.a(var5, -1, var3)) {
                          if (njb.a(var3, 95, var5)) {
                            stackIn_25_0 = lna.field_p;
                            decompiledRegionSelector0 = 7;
                            break L0;
                          } else {
                            if (!wg.a(var5, var3, true)) {
                              stackIn_30_0 = ema.field_r;
                              decompiledRegionSelector0 = 9;
                              break L0;
                            } else {
                              stackIn_28_0 = jta.field_q;
                              decompiledRegionSelector0 = 8;
                              break L0;
                            }
                          }
                        } else {
                          stackIn_21_0 = jta.field_q;
                          decompiledRegionSelector0 = 6;
                          break L0;
                        }
                      } else {
                        stackIn_18_0 = cqa.field_q;
                        decompiledRegionSelector0 = 5;
                        break L0;
                      }
                    }
                  } else {
                    stackIn_11_0 = qab.field_a;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  }
                } else {
                  stackIn_8_0 = ipa.field_o;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                stackIn_5_0 = ema.field_r;
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
            stackIn_33_0 = (RuntimeException) (var3_ref);

            stackIn_33_1 = new StringBuilder().append("ocb.C(");

            if (param0 == null) {
              stackIn_34_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "null";
              break L1;
            } else {
              stackIn_34_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "{...}";
              break L1;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_34_0), stackIn_34_2 + ',' + param1 + ')');
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
                  return stackIn_15_0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_18_0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_21_0;
                    } else {
                      if (decompiledRegionSelector0 == 7) {
                        return stackIn_25_0;
                      } else {
                        if (decompiledRegionSelector0 == 8) {
                          return stackIn_28_0;
                        } else {
                          return stackIn_30_0;
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
    }

    final static llb a(int param0, int param1, int param2, no param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12) {
        llb var13 = null;
        RuntimeException var13_ref = null;
        llb stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var13 = new llb(0L, (llb) null);
              if (param2 == 10204) {
                break L1;
              } else {
                field_i = (String) null;
                break L1;
              }
            }
            var13.field_gb = va.a(-26998, param4, param11);
            var13.field_mb = va.a(param2 + -37202, param5, param6);
            var13.field_A = va.a(param2 ^ -20138, param12, param9);
            var13.field_nb = va.a(-26998, param7, param1);
            var13.field_ub = va.a(param2 + -37202, param0, param8);
            var13.field_Y = param10;
            var13.field_eb = param3;
            stackIn_3_0 = (llb) (var13);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var13_ref = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var13_ref);

            stackIn_6_1 = new StringBuilder().append("ocb.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
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
          throw rta.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ',' + param10 + ',' + param11 + ',' + param12 + ')');
        }
        return stackIn_3_0;
    }

    final static void a(boolean param0, byte param1, boolean param2) {
        if (!(!param0)) {
            oqa.field_o = oqa.field_o + 1;
            psa.e(param1 + 94);
        }
        if (param2) {
            emb.field_p = emb.field_p + 1;
            vkb.a(param1 + -10726);
        }
        if (param1 != 33) {
            ocb.f(12);
        }
    }

    final static void f(int param0) {
        ulb.a(100);
        if (param0 != -10150) {
            ocb.a(-128, 101, 87, (no) null, 109, 83, -49, -78, 19, -41, 88, -111, 125);
        }
        uda.b(-2283);
        ah.e(-17);
    }

    public static void d(byte param0) {
        field_m = null;
        field_g = null;
        if (param0 < 125) {
            return;
        }
        field_h = null;
        field_i = null;
        field_j = null;
    }

    final static void a(boolean param0, int param1) {
        if (param1 <= 101) {
            field_g = (String) null;
        }
        if (!(wga.field_a == null)) {
            dma.e(dma.field_d, dma.field_c, -dma.field_d + dma.field_a, -dma.field_c + dma.field_f);
            wga.field_a.b(param0, 22);
        }
    }

    ocb(uf param0, uf param1, uf param2) {
        super(param0);
        try {
            this.field_k = param2;
            this.field_f = param1;
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "ocb.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final qrb a(String param0, int param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        qrb stackIn_2_0 = null;
        qrb stackIn_5_0 = null;
        qrb stackIn_9_0 = null;
        qrb stackIn_12_0 = null;
        qrb stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var3 = this.field_f.field_j.toLowerCase();
            if (param1 == 16384) {
              var4 = param0.toLowerCase();
              if (var4.length() != 0) {
                if (!seb.a(var3, var4, -101)) {
                  stackIn_9_0 = cca.field_o;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  if (!this.a(param0, false)) {
                    stackIn_14_0 = lea.field_o;
                    decompiledRegionSelector0 = 4;
                    break L0;
                  } else {
                    stackIn_12_0 = cca.field_o;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  }
                }
              } else {
                stackIn_5_0 = cca.field_o;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = (qrb) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var3_ref);

            stackIn_17_1 = new StringBuilder().append("ocb.B(");

            if (param0 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L1;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L1;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_9_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_12_0;
              } else {
                return stackIn_14_0;
              }
            }
          }
        }
    }

    private final boolean a(String param0, boolean param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        int var5 = 0;
        String var6 = null;
        String var7 = null;
        int stackIn_2_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_18_0 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var3 = this.field_k.field_j.toLowerCase();
            var4 = param0.toLowerCase();
            if (!param1) {
              L1: {
                if ((var3.length() ^ -1) >= -1) {
                  break L1;
                } else {
                  if (0 < var4.length()) {
                    var5 = var3.lastIndexOf("@");
                    if (var5 < 0) {
                      break L1;
                    } else {
                      if (var3.length() + -1 > var5) {
                        var6 = var3.substring(0, var5);
                        var7 = var3.substring(1 + var5);
                        if (0 <= var4.indexOf(var6)) {
                          stackIn_12_0 = 1;
                          decompiledRegionSelector0 = 1;
                          break L0;
                        } else {
                          L2: {
                            if (-1 >= (var4.indexOf(var7) ^ -1)) {
                              stackIn_16_0 = 1;
                              break L2;
                            } else {
                              stackIn_16_0 = 0;
                              break L2;
                            }
                          }
                          decompiledRegionSelector0 = 2;
                          break L0;
                        }
                      } else {
                        break L1;
                      }
                    }
                  } else {
                    return false;
                  }
                }
              }
              stackIn_18_0 = 0;
              decompiledRegionSelector0 = 3;
              break L0;
            } else {
              stackIn_2_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackIn_21_0 = (RuntimeException) (var3_ref);

            stackIn_21_1 = new StringBuilder().append("ocb.Q(");

            if (param0 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L3;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L3;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_12_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_16_0 != 0;
            } else {
              return stackIn_18_0 != 0;
            }
          }
        }
    }

    static {
        int var0 = 0;
        field_j = "Hide game chat";
        field_h = new int[4096];
        for (var0 = 0; (var0 ^ -1) > -4097; var0++) {
            field_h[var0] = gha.a((byte) 60, var0);
        }
        field_g = "Chat is currently disabled.";
    }
}
