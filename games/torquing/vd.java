/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vd {
    static String field_d;
    static wl field_c;
    static la field_e;
    static int field_f;
    static String field_b;
    static String field_a;

    final static void a(int param0, byte param1, int param2, int param3, int param4, int param5) {
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int[] var10 = null;
        int var11 = 0;
        int[] var12 = null;
        int[] var13 = null;
        RuntimeException decompiledCaughtException = null;
        var11 = Torquing.field_u;
        try {
          L0: {
            L1: {
              var6_int = 72 % ((param1 - -9) / 50);
              if (qk.field_p < param0) {
                break L1;
              } else {
                if (j.field_q > param5) {
                  break L1;
                } else {
                  L2: {
                    if (param4 < kn.field_e) {
                      param4 = kn.field_e;
                      var7 = 0;
                      break L2;
                    } else {
                      if (qg.field_z < param4) {
                        var7 = 0;
                        param4 = qg.field_z;
                        break L2;
                      } else {
                        var7 = 1;
                        break L2;
                      }
                    }
                  }
                  L3: {
                    if (param2 < kn.field_e) {
                      var8 = 0;
                      param2 = kn.field_e;
                      break L3;
                    } else {
                      if (qg.field_z < param2) {
                        param2 = qg.field_z;
                        var8 = 0;
                        break L3;
                      } else {
                        var8 = 1;
                        break L3;
                      }
                    }
                  }
                  L4: {
                    if (param0 < j.field_q) {
                      param0 = j.field_q;
                      break L4;
                    } else {
                      incrementValue$2 = param0;
                      param0++;
                      di.a(param4, (byte) -101, param3, qd.field_a[incrementValue$2], param2);
                      break L4;
                    }
                  }
                  L5: {
                    if (qk.field_p < param5) {
                      param5 = qk.field_p;
                      break L5;
                    } else {
                      incrementValue$3 = param5;
                      param5--;
                      di.a(param4, (byte) 113, param3, qd.field_a[incrementValue$3], param2);
                      break L5;
                    }
                  }
                  L6: {
                    if (var7 == 0) {
                      break L6;
                    } else {
                      if (var8 != 0) {
                        var9 = param0;
                        L7: while (true) {
                          if (var9 > param5) {
                            break L1;
                          } else {
                            var13 = qd.field_a[var9];
                            var12 = var13;
                            var10 = var12;
                            var13[param2] = param3;
                            var10[param4] = param3;
                            var9++;
                            continue L7;
                          }
                        }
                      } else {
                        break L6;
                      }
                    }
                  }
                  if (var7 != 0) {
                    var9 = param0;
                    L8: while (true) {
                      if (var9 > param5) {
                        break L1;
                      } else {
                        qd.field_a[var9][param4] = param3;
                        var9++;
                        continue L8;
                      }
                    }
                  } else {
                    if (var8 != 0) {
                      var9 = param0;
                      L9: while (true) {
                        if (param5 < var9) {
                          break L1;
                        } else {
                          qd.field_a[var9][param2] = param3;
                          var9++;
                          continue L9;
                        }
                      }
                    } else {
                      break L1;
                    }
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw rb.a((Throwable) ((Object) var6), "vd.B(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    public static void a(boolean param0) {
        field_e = null;
        if (param0) {
            field_a = (String) null;
        }
        field_d = null;
        field_a = null;
        field_b = null;
        field_c = null;
    }

    final static void a(int param0) {
        RuntimeException var1 = null;
        int var2 = 0;
        int[] var3 = null;
        int[] var4 = null;
        df var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int[] var9 = null;
        int[] var10 = null;
        qp var11 = null;
        df var12 = null;
        int[] var13 = null;
        nh var14 = null;
        nh var15 = null;
        int[] var16 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var8 = Torquing.field_u;
        try {
          L0: {
            L1: {
              var12 = kj.field_d;
              if (param0 == 27912) {
                break L1;
              } else {
                field_b = (String) null;
                break L1;
              }
            }
            L2: {
              var2 = var12.i((byte) -101);
              if (var2 != 0) {
                if ((var2 ^ -1) != -2) {
                  if (2 != var2) {
                    nn.a("A1: " + me.a(-1), (Throwable) null, param0 + -37870);
                    ih.b(true);
                    break L2;
                  } else {
                    var15 = (nh) ((Object) to.field_q.b(param0 + -27912));
                    if (var15 == null) {
                      ih.b(true);
                      decompiledRegionSelector0 = 3;
                      break L0;
                    } else {
                      var15.field_r = kb.a((byte) -91);
                      var15.field_m = var15.field_r[0];
                      var15.field_n = true;
                      var15.f(0);
                      break L2;
                    }
                  }
                } else {
                  var11 = (qp) ((Object) tl.field_p.b(0));
                  if (var11 != null) {
                    var11.f(0);
                    break L2;
                  } else {
                    ih.b(true);
                    decompiledRegionSelector0 = 2;
                    break L0;
                  }
                }
              } else {
                var10 = kb.a((byte) -84);
                var16 = var10;
                var13 = var16;
                var3 = var13;
                var9 = var10;
                var4 = var9;
                var5 = var12;
                var6 = ((fj) ((Object) var5)).i((byte) -101);
                var7 = 0;
                L3: while (true) {
                  if (var6 <= var7) {
                    var14 = (nh) ((Object) to.field_q.b(0));
                    if (var14 != null) {
                      var14.field_r = var3;
                      var14.field_n = true;
                      var14.field_m = var16[0];
                      var14.f(0);
                      break L2;
                    } else {
                      ih.b(true);
                      decompiledRegionSelector0 = 0;
                      break L0;
                    }
                  } else {
                    var9[var7] = ((fj) ((Object) var5)).c((byte) -65);
                    var7++;
                    continue L3;
                  }
                }
              }
            }
            decompiledRegionSelector0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw rb.a((Throwable) ((Object) var1), "vd.A(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return;
            } else {
              return;
            }
          }
        }
    }

    final static String a(int param0, CharSequence param1, boolean param2) {
        String var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        String stackIn_6_0 = null;
        String stackIn_12_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        String stackOut_5_0 = null;
        String stackOut_11_0 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        var5 = Torquing.field_u;
        try {
          L0: {
            L1: {
              var3 = lk.a(param2, 23, param1);
              if (param0 < -92) {
                break L1;
              } else {
                field_a = (String) null;
                break L1;
              }
            }
            if (var3 != null) {
              stackOut_5_0 = (String) (var3);
              stackIn_6_0 = stackOut_5_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              var4 = 0;
              L2: while (true) {
                if (var4 < param1.length()) {
                  if (co.a(-112, param1.charAt(var4))) {
                    var4++;
                    continue L2;
                  } else {
                    stackOut_11_0 = wc.field_s;
                    stackIn_12_0 = stackOut_11_0;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                } else {
                  return null;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) (var3_ref);
            stackOut_15_1 = new StringBuilder().append("vd.D(").append(param0).append(',');
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param1 == null) {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L3;
            } else {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L3;
            }
          }
          throw rb.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0;
        } else {
          return stackIn_12_0;
        }
    }

    static {
        field_d = "Continue";
        field_f = -2147483648;
        field_a = "Guide <col=2>Torquing</col> to the flag across the maze of platforms. Be careful not to run out of time or fall to your doom!";
    }
}
