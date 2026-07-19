/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kh extends ip {
    private boolean field_p;
    private String field_o;
    private static long[] field_q;
    static cn field_r;
    static int field_t;
    static int field_n;
    static en field_u;
    static boolean field_s;
    static cn[] field_m;

    final void e(boolean param0) {
        if (!param0) {
            return;
        }
        this.field_o = null;
    }

    public static void e(byte param0) {
        field_q = null;
        field_m = null;
        int var1 = -44 / ((-37 - param0) / 44);
        field_r = null;
        field_u = null;
    }

    final static void e(int param0) {
        RuntimeException var1 = null;
        int var1_int = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        RuntimeException decompiledCaughtException = null;
        var7 = DungeonAssault.field_K;
        try {
          L0: {
            L1: {
              jh.c();
              if (null != wm.field_c) {
                break L1;
              } else {
                bn.field_f = new cn(378, 300);
                wm.field_c = new cn(410, 332);
                wm.field_c.field_A = -16;
                wm.field_c.field_w = -16;
                break L1;
              }
            }
            bn.field_f.e();
            gf.a();
            var1_int = 0;
            L2: while (true) {
              if (-8 >= (var1_int ^ -1)) {
                var1_int = 7;
                L3: while (true) {
                  if (13 <= var1_int) {
                    L4: {
                      wm.field_c.e();
                      gf.a();
                      if (param0 >= 35) {
                        break L4;
                      } else {
                        field_t = -99;
                        break L4;
                      }
                    }
                    bn.field_f.e(16, 16, 8454143);
                    gf.d(8, 8, 0, 0, wm.field_c.field_y, wm.field_c.field_v);
                    bn.field_f.e(16, 16, 0);
                    jh.b();
                    break L0;
                  } else {
                    var2 = -162 + 27 * var1_int;
                    var3 = 20 * var1_int;
                    var8 = var1_int * 7 - 42;
                    var4 = var8;
                    var5 = 0;
                    L5: while (true) {
                      if (13 - var1_int <= var5) {
                        var1_int++;
                        continue L3;
                      } else {
                        L6: {
                          var6 = 16777215;
                          if (null != qj.field_c[var8]) {
                            rl.field_d[5].e(var2, var3, var6);
                            rl.field_d[4].e(27 + var2, var3, var6);
                            ed.a(var3, var2, var8, (byte) -93, var6);
                            rl.field_d[5].e(27 + var2, var3 - -20 + 0, var6);
                            rl.field_d[4].e(var2, var3 - -20 - 0, var6);
                            break L6;
                          } else {
                            break L6;
                          }
                        }
                        var8 += 8;
                        var5++;
                        var2 += 54;
                        continue L5;
                      }
                    }
                  }
                }
              } else {
                var2 = 27 * (-var1_int - -6);
                var3 = 20 * var1_int;
                var4 = -var1_int + 6;
                var5 = 0;
                L7: while (true) {
                  if (1 + var1_int <= var5) {
                    var1_int++;
                    continue L2;
                  } else {
                    var6 = 16777215;
                    if (null != qj.field_c[var4]) {
                      L8: {
                        if (var4 == 0) {
                          break L8;
                        } else {
                          if ((var4 ^ -1) == -7) {
                            break L8;
                          } else {
                            rl.field_d[5].e(var2, var3, var6);
                            break L8;
                          }
                        }
                      }
                      L9: {
                        if ((var4 ^ -1) == -7) {
                          break L9;
                        } else {
                          if (48 != var4) {
                            rl.field_d[4].e(27 + var2, var3, var6);
                            break L9;
                          } else {
                            break L9;
                          }
                        }
                      }
                      ed.a(var3, var2, var4, (byte) -127, var6);
                      rl.field_d[4].e(var2, var3 + 20, var6);
                      rl.field_d[5].e(27 + var2, 20 + var3, var6);
                      var4 += 8;
                      var5++;
                      var2 += 54;
                      continue L7;
                    } else {
                      var4 += 8;
                      var5++;
                      var2 += 54;
                      continue L7;
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw vk.a((Throwable) ((Object) var1), "kh.E(" + param0 + ')');
        }
    }

    final static boolean d(byte param0) {
        if (!(-1 != nj.field_b)) {
            if (!(oi.a(-12929, 1))) {
                return false;
            }
            nj.field_b = ra.field_c.c(true);
            ra.field_c.field_o = 0;
        }
        if ((nj.field_b ^ -1) == 1) {
            if (!oi.a(-12929, 2)) {
                return false;
            }
            nj.field_b = ra.field_c.k(0);
            ra.field_c.field_o = 0;
        }
        if (param0 > -59) {
            field_q = (long[]) null;
        }
        return oi.a(-12929, nj.field_b);
    }

    final static boolean d(boolean param0) {
        int stackIn_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        L0: {
          if (param0) {
            break L0;
          } else {
            field_r = (cn) null;
            break L0;
          }
        }
        L1: {
          L2: {
            if (null != gi.field_S) {
              break L2;
            } else {
              if (uc.g(127)) {
                break L2;
              } else {
                if (null != mh.field_e) {
                  break L2;
                } else {
                  if (!ck.g(-1)) {
                    stackOut_8_0 = 0;
                    stackIn_9_0 = stackOut_8_0;
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
            }
          }
          stackOut_7_0 = 1;
          stackIn_9_0 = stackOut_7_0;
          break L1;
        }
        return stackIn_9_0 != 0;
    }

    final od a(String param0, int param1) {
        vk var3 = null;
        int var3_int = 0;
        RuntimeException var3_ref = null;
        CharSequence var4 = null;
        od stackIn_3_0 = null;
        od stackIn_9_0 = null;
        od stackIn_14_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        od stackOut_2_0 = null;
        od stackOut_8_0 = null;
        od stackOut_13_0 = null;
        od stackOut_12_0 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        try {
          L0: {
            var4 = (CharSequence) ((Object) param0);
            if (!o.a((byte) 31, var4)) {
              stackOut_2_0 = pd.field_J;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (param0.equals(this.field_o)) {
                  break L1;
                } else {
                  L2: {
                    var3 = vk.a((byte) -126, param0);
                    if (var3 == null) {
                      break L2;
                    } else {
                      if (null == var3.field_g) {
                        this.field_p = var3.field_a;
                        this.field_o = param0;
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                  stackOut_8_0 = oc.field_A;
                  stackIn_9_0 = stackOut_8_0;
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
              L3: {
                var3_int = 108 % ((5 - param1) / 44);
                if (this.field_p) {
                  stackOut_13_0 = c.field_d;
                  stackIn_14_0 = stackOut_13_0;
                  break L3;
                } else {
                  stackOut_12_0 = pd.field_J;
                  stackIn_14_0 = stackOut_12_0;
                  break L3;
                }
              }
              decompiledRegionSelector0 = 2;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) (var3_ref);
            stackOut_15_1 = new StringBuilder().append("kh.C(");
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param0 == null) {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L4;
            } else {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L4;
            }
          }
          throw vk.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_9_0;
          } else {
            return stackIn_14_0;
          }
        }
    }

    final String a(byte param0, String param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        vk var4 = null;
        CharSequence var5 = null;
        String stackIn_2_0 = null;
        String stackIn_14_0 = null;
        String stackIn_17_0 = null;
        String stackIn_19_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        String stackOut_13_0 = null;
        String stackOut_18_0 = null;
        String stackOut_16_0 = null;
        String stackOut_1_0 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        try {
          L0: {
            var5 = (CharSequence) ((Object) param1);
            var3 = jg.a(104, var5);
            if (var3 == null) {
              L1: {
                if (!param1.equals(this.field_o)) {
                  var4 = vk.a((byte) -126, param1);
                  if (var4 != null) {
                    if (null == var4.field_g) {
                      this.field_p = var4.field_a;
                      this.field_o = param1;
                      break L1;
                    } else {
                      return null;
                    }
                  } else {
                    return null;
                  }
                } else {
                  break L1;
                }
              }
              if (!this.field_p) {
                stackOut_13_0 = fp.field_a;
                stackIn_14_0 = stackOut_13_0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (param0 >= 44) {
                  stackOut_18_0 = ng.field_N;
                  stackIn_19_0 = stackOut_18_0;
                  decompiledRegionSelector0 = 3;
                  break L0;
                } else {
                  stackOut_16_0 = (String) null;
                  stackIn_17_0 = stackOut_16_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              }
            } else {
              stackOut_1_0 = (String) (var3);
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) (var3_ref);
            stackOut_20_1 = new StringBuilder().append("kh.D(").append(param0).append(',');
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param1 == null) {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L2;
            } else {
              stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L2;
            }
          }
          throw vk.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_14_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_17_0;
            } else {
              return stackIn_19_0;
            }
          }
        }
    }

    kh(rm param0) {
        super(param0);
        this.field_p = false;
    }

    static {
        $cfr$clinit: {
            long var0 = 0L;
            int var2 = 0;
            int var3 = 0;
            field_q = new long[256];
            var2 = 0;
            L0: while (true) {
              if ((var2 ^ -1) <= -257) {
                break $cfr$clinit;
              } else {
                var0 = (long)var2;
                var3 = 0;
                L1: while (true) {
                  if (var3 >= 8) {
                    field_q[var2] = var0;
                    var2++;
                    continue L0;
                  } else {
                    if ((1L & var0 ^ -1L) != -2L) {
                      var0 = var0 >>> 1;
                      var3++;
                      continue L1;
                    } else {
                      var0 = var0 >>> 1378413441 ^ -3932672073523589310L;
                      var3++;
                      continue L1;
                    }
                  }
                }
              }
            }
        }
    }
}
