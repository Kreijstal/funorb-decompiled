/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wi {
    static nh field_a;
    static rf field_e;
    static he[] field_c;
    private int[] field_g;
    static java.applet.Applet field_d;
    static int[] field_f;
    static long[] field_b;
    static String field_h;

    final static int b(int param0) {
        boolean discarded$12 = false;
        boolean discarded$13 = false;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_20_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_19_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_5_0 = 0;
        var2 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            discarded$12 = ng.field_c.a(nl.field_m, ri.field_d, true, 0);
            ng.field_c.b(false);
            L1: while (true) {
              if (!th.a(param0 + -94)) {
                if (param0 == pe.field_b) {
                  if (!oi.field_c) {
                    if (hg.field_ub != lc.field_h) {
                      if (ib.field_f.a(false)) {
                        if (hg.field_ub != fk.field_q) {
                          stackOut_19_0 = -1;
                          stackIn_20_0 = stackOut_19_0;
                          decompiledRegionSelector0 = 5;
                          break L0;
                        } else {
                          stackOut_17_0 = 2;
                          stackIn_18_0 = stackOut_17_0;
                          decompiledRegionSelector0 = 4;
                          break L0;
                        }
                      } else {
                        stackOut_14_0 = 1;
                        stackIn_15_0 = stackOut_14_0;
                        decompiledRegionSelector0 = 3;
                        break L0;
                      }
                    } else {
                      stackOut_11_0 = 1;
                      stackIn_12_0 = stackOut_11_0;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    }
                  } else {
                    stackOut_8_0 = 3;
                    stackIn_9_0 = stackOut_8_0;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                } else {
                  var1_int = pe.field_b;
                  sf.a(-1, param0 + 11650);
                  stackOut_5_0 = var1_int;
                  stackIn_6_0 = stackOut_5_0;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              } else {
                discarded$13 = ng.field_c.a(di.field_c, sj.field_g, 127);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ie.a((Throwable) ((Object) var1), "wi.C(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_9_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_12_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_15_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_18_0;
                } else {
                  return stackIn_20_0;
                }
              }
            }
          }
        }
    }

    final static u a(String param0, int param1, boolean param2, String param3) {
        long var4_long = 0L;
        RuntimeException var4 = null;
        Object var6 = null;
        CharSequence var7 = null;
        u stackIn_6_0 = null;
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
        u stackOut_5_0 = null;
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
              var4_long = 0L;
              if (param1 == 7957) {
                break L1;
              } else {
                field_h = (String) null;
                break L1;
              }
            }
            L2: {
              var6 = null;
              if (param0.indexOf('@') == -1) {
                var7 = (CharSequence) ((Object) param0);
                var4_long = ub.a(109, var7);
                break L2;
              } else {
                var6 = param0;
                break L2;
              }
            }
            stackOut_5_0 = tc.a(var4_long, param3, (String) (var6), 0, param2);
            stackIn_6_0 = stackOut_5_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (var4);
            stackOut_7_1 = new StringBuilder().append("wi.A(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
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
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param3 == null) {
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
          throw ie.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
        }
        return stackIn_6_0;
    }

    final static vk a(int param0, int param1, int param2) {
        int discarded$1 = 0;
        vk var3 = null;
        byte[] var4 = null;
        double var5 = 0.0;
        int var7 = 0;
        int var8 = 0;
        var8 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        var3 = new vk(22050, param0);
        if (param2 != 100) {
          discarded$1 = wi.b(-9);
          var4 = var3.field_i;
          var5 = (double)param1 * 6.283185307179586 / 22050.0;
          var7 = -1 + param0;
          L0: while (true) {
            if (var7 < 0) {
              return var3;
            } else {
              var4[var7] = (byte)(int)(100.0 * ji.a(65535, var5 * (double)var7) + ji.a(65535, 2.0 * ((double)var7 * var5)) * 27.0);
              var7--;
              continue L0;
            }
          }
        } else {
          var4 = var3.field_i;
          var5 = (double)param1 * 6.283185307179586 / 22050.0;
          var7 = -1 + param0;
          L1: while (true) {
            if (var7 < 0) {
              return var3;
            } else {
              var4[var7] = (byte)(int)(100.0 * ji.a(65535, var5 * (double)var7) + ji.a(65535, 2.0 * ((double)var7 * var5)) * 27.0);
              var7--;
              continue L1;
            }
          }
        }
    }

    public static void a(int param0) {
        field_b = null;
        field_c = null;
        field_a = null;
        field_h = null;
        field_d = null;
        if (param0 != 2) {
          field_b = (long[]) null;
          field_f = null;
          field_e = null;
          return;
        } else {
          field_f = null;
          field_e = null;
          return;
        }
    }

    final static void a(int param0, int param1, int param2, int param3, String param4, int param5, bl param6, int param7, int param8) {
        vk discarded$0 = null;
        try {
            oi.field_e = param6;
            j.field_ib = param0;
            tb.field_a = param1;
            gi.field_c = param7;
            mi.field_j = param3;
            g.field_r = param4;
            vc.field_e = param5;
            pk.field_q = param2;
            if (param8 < 48) {
                discarded$0 = wi.a(88, 114, -72);
            }
            p.field_a = (gb) ((Object) new cl());
            pd.field_d = new n(param6);
            fl.field_a = new df(p.field_a, pd.field_d);
        } catch (RuntimeException runtimeException) {
            throw ie.a((Throwable) ((Object) runtimeException), "wi.D(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ',' + (param6 != null ? "{...}" : "null") + ',' + param7 + ',' + param8 + ')');
        }
    }

    final int a(int param0, byte[] param1, int param2, int param3, int param4, byte[] param5) {
        int incrementValue$8 = 0;
        int incrementValue$9 = 0;
        int incrementValue$10 = 0;
        int incrementValue$11 = 0;
        int incrementValue$12 = 0;
        int incrementValue$13 = 0;
        int incrementValue$14 = 0;
        int incrementValue$15 = 0;
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_4_0 = 0;
        int stackIn_67_0 = 0;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        String stackIn_71_2 = null;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        String stackIn_74_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_66_0 = 0;
        RuntimeException stackOut_68_0 = null;
        StringBuilder stackOut_68_1 = null;
        RuntimeException stackOut_70_0 = null;
        StringBuilder stackOut_70_1 = null;
        String stackOut_70_2 = null;
        RuntimeException stackOut_69_0 = null;
        StringBuilder stackOut_69_1 = null;
        String stackOut_69_2 = null;
        RuntimeException stackOut_71_0 = null;
        StringBuilder stackOut_71_1 = null;
        RuntimeException stackOut_73_0 = null;
        StringBuilder stackOut_73_1 = null;
        String stackOut_73_2 = null;
        RuntimeException stackOut_72_0 = null;
        StringBuilder stackOut_72_1 = null;
        String stackOut_72_2 = null;
        var11 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            if (-1 == (param0 ^ -1)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              var7_int = param2;
              param0 = param0 + param4;
              var8 = param3;
              L1: while (true) {
                L2: {
                  var9 = param1[var8];
                  if (0 <= var9) {
                    var7_int++;
                    break L2;
                  } else {
                    var7_int = this.field_g[var7_int];
                    break L2;
                  }
                }
                L3: {
                  L4: {
                    var10 = this.field_g[var7_int];
                    if (0 <= this.field_g[var7_int]) {
                      break L4;
                    } else {
                      incrementValue$8 = param4;
                      param4++;
                      param5[incrementValue$8] = (byte)(var10 ^ -1);
                      if (param0 > param4) {
                        var7_int = 0;
                        break L4;
                      } else {
                        break L3;
                      }
                    }
                  }
                  L5: {
                    if ((var9 & 64) == 0) {
                      var7_int++;
                      break L5;
                    } else {
                      var7_int = this.field_g[var7_int];
                      break L5;
                    }
                  }
                  L6: {
                    var10 = this.field_g[var7_int];
                    if (-1 < (this.field_g[var7_int] ^ -1)) {
                      incrementValue$9 = param4;
                      param4++;
                      param5[incrementValue$9] = (byte)(var10 ^ -1);
                      if (param0 > param4) {
                        var7_int = 0;
                        break L6;
                      } else {
                        break L3;
                      }
                    } else {
                      break L6;
                    }
                  }
                  L7: {
                    if (-1 != (32 & var9 ^ -1)) {
                      var7_int = this.field_g[var7_int];
                      break L7;
                    } else {
                      var7_int++;
                      break L7;
                    }
                  }
                  L8: {
                    var10 = this.field_g[var7_int];
                    if (0 > this.field_g[var7_int]) {
                      incrementValue$10 = param4;
                      param4++;
                      param5[incrementValue$10] = (byte)(var10 ^ -1);
                      if (param4 < param0) {
                        var7_int = 0;
                        break L8;
                      } else {
                        break L3;
                      }
                    } else {
                      break L8;
                    }
                  }
                  L9: {
                    if ((16 & var9) == 0) {
                      var7_int++;
                      break L9;
                    } else {
                      var7_int = this.field_g[var7_int];
                      break L9;
                    }
                  }
                  L10: {
                    var10 = this.field_g[var7_int];
                    if (this.field_g[var7_int] >= 0) {
                      break L10;
                    } else {
                      incrementValue$11 = param4;
                      param4++;
                      param5[incrementValue$11] = (byte)(var10 ^ -1);
                      if (param0 <= param4) {
                        break L3;
                      } else {
                        var7_int = 0;
                        break L10;
                      }
                    }
                  }
                  L11: {
                    if ((var9 & 8) == 0) {
                      var7_int++;
                      break L11;
                    } else {
                      var7_int = this.field_g[var7_int];
                      break L11;
                    }
                  }
                  L12: {
                    var10 = this.field_g[var7_int];
                    if (this.field_g[var7_int] >= 0) {
                      break L12;
                    } else {
                      incrementValue$12 = param4;
                      param4++;
                      param5[incrementValue$12] = (byte)(var10 ^ -1);
                      if (param0 > param4) {
                        var7_int = 0;
                        break L12;
                      } else {
                        return 1 + (var8 - param3);
                      }
                    }
                  }
                  L13: {
                    if (0 != (4 & var9)) {
                      var7_int = this.field_g[var7_int];
                      break L13;
                    } else {
                      var7_int++;
                      break L13;
                    }
                  }
                  L14: {
                    var10 = this.field_g[var7_int];
                    if (-1 < (this.field_g[var7_int] ^ -1)) {
                      incrementValue$13 = param4;
                      param4++;
                      param5[incrementValue$13] = (byte)(var10 ^ -1);
                      if (param0 <= param4) {
                        break L3;
                      } else {
                        var7_int = 0;
                        break L14;
                      }
                    } else {
                      break L14;
                    }
                  }
                  L15: {
                    if (0 == (var9 & 2)) {
                      var7_int++;
                      break L15;
                    } else {
                      var7_int = this.field_g[var7_int];
                      break L15;
                    }
                  }
                  L16: {
                    var10 = this.field_g[var7_int];
                    if (this.field_g[var7_int] < 0) {
                      incrementValue$14 = param4;
                      param4++;
                      param5[incrementValue$14] = (byte)(var10 ^ -1);
                      if (param0 <= param4) {
                        break L3;
                      } else {
                        var7_int = 0;
                        break L16;
                      }
                    } else {
                      break L16;
                    }
                  }
                  L17: {
                    if ((var9 & 1) != 0) {
                      var7_int = this.field_g[var7_int];
                      break L17;
                    } else {
                      var7_int++;
                      break L17;
                    }
                  }
                  L18: {
                    var10 = this.field_g[var7_int];
                    if (this.field_g[var7_int] < 0) {
                      incrementValue$15 = param4;
                      param4++;
                      param5[incrementValue$15] = (byte)(var10 ^ -1);
                      if (param0 > param4) {
                        var7_int = 0;
                        break L18;
                      } else {
                        break L3;
                      }
                    } else {
                      break L18;
                    }
                  }
                  var8++;
                  continue L1;
                }
                stackOut_66_0 = 1 + (var8 - param3);
                stackIn_67_0 = stackOut_66_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L19: {
            var7 = decompiledCaughtException;
            stackOut_68_0 = (RuntimeException) (var7);
            stackOut_68_1 = new StringBuilder().append("wi.B(").append(param0).append(',');
            stackIn_70_0 = stackOut_68_0;
            stackIn_70_1 = stackOut_68_1;
            stackIn_69_0 = stackOut_68_0;
            stackIn_69_1 = stackOut_68_1;
            if (param1 == null) {
              stackOut_70_0 = (RuntimeException) ((Object) stackIn_70_0);
              stackOut_70_1 = (StringBuilder) ((Object) stackIn_70_1);
              stackOut_70_2 = "null";
              stackIn_71_0 = stackOut_70_0;
              stackIn_71_1 = stackOut_70_1;
              stackIn_71_2 = stackOut_70_2;
              break L19;
            } else {
              stackOut_69_0 = (RuntimeException) ((Object) stackIn_69_0);
              stackOut_69_1 = (StringBuilder) ((Object) stackIn_69_1);
              stackOut_69_2 = "{...}";
              stackIn_71_0 = stackOut_69_0;
              stackIn_71_1 = stackOut_69_1;
              stackIn_71_2 = stackOut_69_2;
              break L19;
            }
          }
          L20: {
            stackOut_71_0 = (RuntimeException) ((Object) stackIn_71_0);
            stackOut_71_1 = ((StringBuilder) (Object) stackIn_71_1).append(stackIn_71_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
            stackIn_73_0 = stackOut_71_0;
            stackIn_73_1 = stackOut_71_1;
            stackIn_72_0 = stackOut_71_0;
            stackIn_72_1 = stackOut_71_1;
            if (param5 == null) {
              stackOut_73_0 = (RuntimeException) ((Object) stackIn_73_0);
              stackOut_73_1 = (StringBuilder) ((Object) stackIn_73_1);
              stackOut_73_2 = "null";
              stackIn_74_0 = stackOut_73_0;
              stackIn_74_1 = stackOut_73_1;
              stackIn_74_2 = stackOut_73_2;
              break L20;
            } else {
              stackOut_72_0 = (RuntimeException) ((Object) stackIn_72_0);
              stackOut_72_1 = (StringBuilder) ((Object) stackIn_72_1);
              stackOut_72_2 = "{...}";
              stackIn_74_0 = stackOut_72_0;
              stackIn_74_1 = stackOut_72_1;
              stackIn_74_2 = stackOut_72_2;
              break L20;
            }
          }
          throw ie.a((Throwable) ((Object) stackIn_74_0), stackIn_74_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          return stackIn_67_0;
        }
    }

    private wi() throws Throwable {
        throw new Error();
    }

    static {
        field_f = new int[75];
        field_b = new long[32];
        field_h = "Waiting for sound effects";
    }
}
