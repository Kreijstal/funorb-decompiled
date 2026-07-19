/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gl extends hl {
    private int field_E;
    private ba field_F;
    static String[] field_G;

    public static void a(int param0) {
        if (param0 != 1) {
            return;
        }
        field_G = null;
    }

    final String b(byte param0) {
        if (this.field_j) {
            return this.field_F.b(26766);
        }
        if (param0 == -79) {
            return null;
        }
        field_G = (String[]) null;
        return null;
    }

    final static boolean b(boolean param0) {
        fd var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        fd var4 = null;
        int stackIn_5_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_20_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_19_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_4_0 = 0;
        var3 = Main.field_T;
        try {
          L0: {
            L1: {
              if (param0) {
                break L1;
              } else {
                field_G = (String[]) null;
                break L1;
              }
            }
            var4 = (fd) ((Object) vb.field_e.a((byte) 74));
            var1 = var4;
            if (var1 != null) {
              var2 = 0;
              L2: while (true) {
                if (var1.field_o <= var2) {
                  stackOut_19_0 = 1;
                  stackIn_20_0 = stackOut_19_0;
                  decompiledRegionSelector0 = 3;
                  break L0;
                } else {
                  L3: {
                    if (null == var4.field_p[var2]) {
                      break L3;
                    } else {
                      if (0 != var4.field_p[var2].field_a) {
                        break L3;
                      } else {
                        stackOut_10_0 = 0;
                        stackIn_11_0 = stackOut_10_0;
                        decompiledRegionSelector0 = 1;
                        break L0;
                      }
                    }
                  }
                  L4: {
                    if (null != var4.field_r[var2]) {
                      if (-1 == (var4.field_r[var2].field_a ^ -1)) {
                        stackOut_16_0 = 0;
                        stackIn_17_0 = stackOut_16_0;
                        decompiledRegionSelector0 = 2;
                        break L0;
                      } else {
                        break L4;
                      }
                    } else {
                      break L4;
                    }
                  }
                  var2++;
                  continue L2;
                }
              }
            } else {
              stackOut_4_0 = 0;
              stackIn_5_0 = stackOut_4_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw ma.a((Throwable) ((Object) var1_ref), "gl.I(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_11_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_17_0 != 0;
            } else {
              return stackIn_20_0 != 0;
            }
          }
        }
    }

    final static boolean a(String param0, int param1) {
        Process discarded$2 = null;
        String var2 = null;
        Exception var2_ref = null;
        RuntimeException var2_ref2 = null;
        int var3 = 0;
        int var4 = 0;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_22_0 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        int decompiledRegionSelector0 = 0;
        int decompiledRegionSelector1 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_21_0 = 0;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        var4 = Main.field_T;
        try {
          L0: {
            try {
              L1: {
                if (param1 == 873140897) {
                  if (!le.field_m.startsWith("win")) {
                    stackOut_6_0 = 0;
                    stackIn_7_0 = stackOut_6_0;
                    decompiledRegionSelector0 = 1;
                    break L1;
                  } else {
                    L2: {
                      if (param0.startsWith("http://")) {
                        break L2;
                      } else {
                        if (!param0.startsWith("https://")) {
                          stackOut_11_0 = 0;
                          stackIn_12_0 = stackOut_11_0;
                          decompiledRegionSelector0 = 2;
                          break L1;
                        } else {
                          break L2;
                        }
                      }
                    }
                    var2 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                    var3 = 0;
                    L3: while (true) {
                      if (param0.length() <= var3) {
                        discarded$2 = Runtime.getRuntime().exec("cmd /c start \"j\" \"" + param0 + "\"");
                        stackOut_19_0 = 1;
                        stackIn_20_0 = stackOut_19_0;
                        decompiledRegionSelector0 = 4;
                        break L1;
                      } else {
                        if (var2.indexOf((int) param0.charAt(var3)) != -1) {
                          var3++;
                          continue L3;
                        } else {
                          stackOut_16_0 = 0;
                          stackIn_17_0 = stackOut_16_0;
                          decompiledRegionSelector0 = 3;
                          break L1;
                        }
                      }
                    }
                  }
                } else {
                  stackOut_2_0 = 1;
                  stackIn_3_0 = stackOut_2_0;
                  decompiledRegionSelector0 = 0;
                  break L1;
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2_ref = (Exception) (Object) decompiledCaughtException;
              stackOut_21_0 = 0;
              stackIn_22_0 = stackOut_21_0;
              return stackIn_22_0 != 0;
            }
            if (decompiledRegionSelector0 == 0) {
              decompiledRegionSelector1 = 0;
              break L0;
            } else {
              if (decompiledRegionSelector0 == 1) {
                decompiledRegionSelector1 = 1;
                break L0;
              } else {
                if (decompiledRegionSelector0 == 2) {
                  decompiledRegionSelector1 = 2;
                  break L0;
                } else {
                  if (decompiledRegionSelector0 == 3) {
                    decompiledRegionSelector1 = 3;
                    break L0;
                  } else {
                    decompiledRegionSelector1 = 4;
                    break L0;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L4: {
            var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) (var2_ref2);
            stackOut_23_1 = new StringBuilder().append("gl.H(");
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param0 == null) {
              stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackOut_25_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L4;
            } else {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L4;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_26_0), stackIn_26_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector1 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector1 == 1) {
            return stackIn_7_0 != 0;
          } else {
            if (decompiledRegionSelector1 == 2) {
              return stackIn_12_0 != 0;
            } else {
              if (decompiledRegionSelector1 == 3) {
                return stackIn_17_0 != 0;
              } else {
                return stackIn_20_0 != 0;
              }
            }
          }
        }
    }

    final void a(int param0, int param1, lk param2, int param3) {
        try {
            this.field_E = this.field_E + 1;
            super.a(param0, param1, param2, param3);
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) ((Object) runtimeException), "gl.E(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final static kc[] a(String param0, qk param1, String param2, int param3) {
        boolean discarded$2 = false;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        String var6 = null;
        kc[] stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        kc[] stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            L1: {
              var4_int = param1.a(18659, param2);
              var5 = param1.a(var4_int, param0, (byte) 7);
              if (param3 == -13244) {
                break L1;
              } else {
                var6 = (String) null;
                discarded$2 = gl.a((String) null, 104);
                break L1;
              }
            }
            stackOut_2_0 = hl.a(param1, 117, var4_int, var5);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var4);
            stackOut_4_1 = new StringBuilder().append("gl.C(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
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
          L3: {
            stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          L4: {
            stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param2 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param3 + ')');
        }
        return stackIn_3_0;
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        sg var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        kc var12 = null;
        kc var13 = null;
        kc var15 = null;
        kc var16 = null;
        var11 = Main.field_T;
        super.a(param0, param1, -1, param3);
        if (param2 != (param3 ^ -1)) {
          return;
        } else {
          var5 = this.field_o + param0 + (this.field_h >> -605328159);
          var6 = (this.field_q >> -1866628191) + this.field_i + param1;
          var8 = this.field_F.a(true);
          if (tb.field_b != var8) {
            if (a.field_n != var8) {
              if (pe.field_b != var8) {
                if (ii.field_e != var8) {
                  return;
                } else {
                  var12 = gh.field_n[1];
                  var12.b(-(var12.field_p >> -605323231) + var5, var6 - (var12.field_o >> -1958899519), 256);
                  return;
                }
              } else {
                var13 = gh.field_n[2];
                var13.b(var5 - (var13.field_p >> 862157121), -(var13.field_o >> -416620415) + var6, 256);
                return;
              }
            } else {
              var16 = gh.field_n[0];
              var9 = var16.field_l << 873140897;
              var10 = var16.field_k << -854242559;
              if (null != hb.field_c) {
                if (var9 <= hb.field_c.field_p) {
                  if (var10 > hb.field_c.field_o) {
                    hb.field_c = new kc(var9, var10);
                    dl.a(97, hb.field_c);
                    var16.a(112, 144, var16.field_l << -2065336412, var16.field_k << 1136977924, -this.field_E << -1455706710, 4096);
                    gg.a(14756);
                    hb.field_c.b(var5 - var16.field_l, -var16.field_k + var6, 256);
                    return;
                  } else {
                    dl.a(param2 + 96, hb.field_c);
                    vj.d();
                    var16.a(112, 144, var16.field_l << -2065336412, var16.field_k << 1136977924, -this.field_E << -1455706710, 4096);
                    gg.a(14756);
                    hb.field_c.b(var5 - var16.field_l, -var16.field_k + var6, 256);
                    return;
                  }
                } else {
                  hb.field_c = new kc(var9, var10);
                  dl.a(97, hb.field_c);
                  var16.a(112, 144, var16.field_l << -2065336412, var16.field_k << 1136977924, -this.field_E << -1455706710, 4096);
                  gg.a(14756);
                  hb.field_c.b(var5 - var16.field_l, -var16.field_k + var6, 256);
                  return;
                }
              } else {
                hb.field_c = new kc(var9, var10);
                dl.a(97, hb.field_c);
                var16.a(112, 144, var16.field_l << -2065336412, var16.field_k << 1136977924, -this.field_E << -1455706710, 4096);
                gg.a(14756);
                hb.field_c.b(var5 - var16.field_l, -var16.field_k + var6, 256);
                return;
              }
            }
          } else {
            var15 = gh.field_n[0];
            var9 = var15.field_l << 873140897;
            var10 = var15.field_k << -854242559;
            if (null != hb.field_c) {
              if (var9 <= hb.field_c.field_p) {
                if (var10 > hb.field_c.field_o) {
                  hb.field_c = new kc(var9, var10);
                  dl.a(97, hb.field_c);
                  var15.a(112, 144, var15.field_l << -2065336412, var15.field_k << 1136977924, -this.field_E << -1455706710, 4096);
                  gg.a(14756);
                  hb.field_c.b(var5 - var15.field_l, -var15.field_k + var6, 256);
                  return;
                } else {
                  dl.a(param2 + 96, hb.field_c);
                  vj.d();
                  var15.a(112, 144, var15.field_l << -2065336412, var15.field_k << 1136977924, -this.field_E << -1455706710, 4096);
                  gg.a(14756);
                  hb.field_c.b(var5 - var15.field_l, -var15.field_k + var6, 256);
                  return;
                }
              } else {
                hb.field_c = new kc(var9, var10);
                dl.a(97, hb.field_c);
                var15.a(112, 144, var15.field_l << -2065336412, var15.field_k << 1136977924, -this.field_E << -1455706710, 4096);
                gg.a(14756);
                hb.field_c.b(var5 - var15.field_l, -var15.field_k + var6, 256);
                return;
              }
            } else {
              hb.field_c = new kc(var9, var10);
              dl.a(97, hb.field_c);
              var15.a(112, 144, var15.field_l << -2065336412, var15.field_k << 1136977924, -this.field_E << -1455706710, 4096);
              gg.a(14756);
              hb.field_c.b(var5 - var15.field_l, -var15.field_k + var6, 256);
              return;
            }
          }
        }
    }

    final boolean a(int param0, lk param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
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
            if (param0 > 71) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = 1;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var3);
            stackOut_5_1 = new StringBuilder().append("gl.B(").append(param0).append(',');
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
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_4_0 != 0;
        }
    }

    final static boolean a(boolean param0) {
        boolean discarded$2 = false;
        String var2 = null;
        L0: {
          if (al.field_a == -1) {
            if (!r.a(1, (byte) 123)) {
              return false;
            } else {
              al.field_a = rd.field_j.f(-97);
              rd.field_j.field_i = 0;
              break L0;
            }
          } else {
            break L0;
          }
        }
        L1: {
          if ((al.field_a ^ -1) != 1) {
            break L1;
          } else {
            if (r.a(2, (byte) 127)) {
              al.field_a = rd.field_j.d((byte) 72);
              rd.field_j.field_i = 0;
              break L1;
            } else {
              return false;
            }
          }
        }
        if (param0) {
          var2 = (String) null;
          discarded$2 = gl.a((String) null, 98);
          return r.a(al.field_a, (byte) 123);
        } else {
          return r.a(al.field_a, (byte) 123);
        }
    }

    final static void a(int param0, ib param1, int param2, int param3) {
        li var4 = null;
        jg var5 = null;
        if (param3 != 804) {
            return;
        }
        try {
            var4 = li.a(param1, 100, param2);
            var5 = ug.a(var4, param3 + -803, param0);
            aj.field_s.a(new gi(var4, var5), 27362);
            bg.field_tb.b(var5);
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) ((Object) runtimeException), "gl.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    gl(ba param0) {
        try {
            this.field_F = param0;
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) ((Object) runtimeException), "gl.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
