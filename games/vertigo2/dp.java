/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class dp extends ji {
    static String[] field_F;
    private int field_z;
    static int[] field_A;
    private int field_y;
    private int[] field_D;
    private int[] field_B;
    private int field_C;

    final void a(byte param0, int param1, ed param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        var5 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              var4_int = param1;
              if (var4_int == 0) {
                ((dp) this).field_z = param2.h(-11);
                break L1;
              } else {
                if (1 == var4_int) {
                  ((dp) this).field_C = param2.a((byte) -11);
                  break L1;
                } else {
                  if (var4_int != 2) {
                    break L1;
                  } else {
                    ((dp) this).field_y = param2.h(-11);
                    break L1;
                  }
                }
              }
            }
            L2: {
              if (param0 == 110) {
                break L2;
              } else {
                ((dp) this).field_D = null;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var4;
            stackOut_15_1 = new StringBuilder().append("dp.C(").append(param0).append(44).append(param1).append(44);
            stackIn_18_0 = stackOut_15_0;
            stackIn_18_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param2 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L3;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_19_0 = stackOut_16_0;
              stackIn_19_1 = stackOut_16_1;
              stackIn_19_2 = stackOut_16_2;
              break L3;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + 41);
        }
    }

    final int[] c(int param0, int param1) {
        int[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int[] var12 = null;
        int[] var13 = null;
        int[] var14 = null;
        int[] var15 = null;
        L0: {
          var10 = Vertigo2.field_L ? 1 : 0;
          var15 = ((dp) this).field_x.a(param0, (byte) -124);
          var14 = var15;
          var13 = var14;
          var12 = var13;
          var3 = var12;
          if (!((dp) this).field_x.field_i) {
            break L0;
          } else {
            var4 = lf.field_y[param0];
            if (((dp) this).field_y != 0) {
              var5 = 0;
              L1: while (true) {
                if (var5 >= we.field_M) {
                  break L0;
                } else {
                  L2: {
                    var6 = 0;
                    var7 = 0;
                    var8 = rh.field_O[var5];
                    var9 = ((dp) this).field_y;
                    if (var9 == 1) {
                      var6 = var8;
                      break L2;
                    } else {
                      if (var9 == 2) {
                        var6 = (-4096 + var4 + var8 >> 1) + 2048;
                        break L2;
                      } else {
                        if (var9 != 3) {
                          break L2;
                        } else {
                          var6 = 2048 + (-var4 + var8 >> 1);
                          break L2;
                        }
                      }
                    }
                  }
                  var11 = 0;
                  var9 = var11;
                  L3: while (true) {
                    L4: {
                      if (var11 >= ((dp) this).field_z) {
                        break L4;
                      } else {
                        if (var6 >= ((dp) this).field_B[var11]) {
                          if (((dp) this).field_B[var11 + 1] > var6) {
                            if (((dp) this).field_D[var11] <= var6) {
                              break L4;
                            } else {
                              var7 = 4096;
                              break L4;
                            }
                          } else {
                            var11++;
                            continue L3;
                          }
                        } else {
                          var11++;
                          continue L3;
                        }
                      }
                    }
                    var15 = var14;
                    var15[var5] = var7;
                    var5++;
                    continue L1;
                  }
                }
              }
            } else {
              var5 = 0;
              var6 = 0;
              L5: while (true) {
                L6: {
                  if (var6 >= ((dp) this).field_z) {
                    break L6;
                  } else {
                    if (((dp) this).field_B[var6] <= var4) {
                      if (((dp) this).field_B[1 + var6] > var4) {
                        if (((dp) this).field_D[var6] <= var4) {
                          break L6;
                        } else {
                          var5 = 4096;
                          qq.a(var15, 0, we.field_M, var5);
                          break L0;
                        }
                      } else {
                        var6++;
                        continue L5;
                      }
                    } else {
                      var6++;
                      continue L5;
                    }
                  }
                }
                qq.a(var15, 0, we.field_M, var5);
                break L0;
              }
            }
          }
        }
        L7: {
          if (param1 > 91) {
            break L7;
          } else {
            ((dp) this).field_C = 10;
            break L7;
          }
        }
        return var3;
    }

    final void a(int param0) {
        if (param0 > -98) {
            int discarded$0 = 0;
            String discarded$1 = dp.a((CharSequence) null, true);
        }
        int discarded$2 = 4096;
        this.g();
    }

    final static String a(CharSequence param0, boolean param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        String var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        String stackIn_3_0 = null;
        String stackIn_9_0 = null;
        String stackIn_14_0 = null;
        String stackIn_20_0 = null;
        String stackIn_33_0 = null;
        String stackIn_38_0 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_43_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_37_0 = null;
        String stackOut_32_0 = null;
        String stackOut_19_0 = null;
        String stackOut_13_0 = null;
        String stackOut_8_0 = null;
        String stackOut_2_0 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        String stackOut_42_2 = null;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        String stackOut_40_2 = null;
        var8 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            if (param0 != null) {
              L1: {
                var3_int = param0.length();
                if (var3_int < 1) {
                  break L1;
                } else {
                  if (var3_int > 12) {
                    break L1;
                  } else {
                    L2: {
                      var4 = rc.a(param0, 320);
                      if (null == var4) {
                        break L2;
                      } else {
                        if (var4.length() >= 1) {
                          L3: {
                            int discarded$3 = -96;
                            if (jq.a(var4.charAt(0))) {
                              break L3;
                            } else {
                              int discarded$4 = -96;
                              if (jq.a(var4.charAt(-1 + var4.length()))) {
                                break L3;
                              } else {
                                L4: {
                                  var5 = 0;
                                  if (!param1) {
                                    break L4;
                                  } else {
                                    dp.h(-57);
                                    break L4;
                                  }
                                }
                                var6 = 0;
                                L5: while (true) {
                                  if (param0.length() <= var6) {
                                    if (0 < var5) {
                                      stackOut_37_0 = vq.field_p;
                                      stackIn_38_0 = stackOut_37_0;
                                      break L0;
                                    } else {
                                      return null;
                                    }
                                  } else {
                                    L6: {
                                      var7 = param0.charAt(var6);
                                      int discarded$5 = -96;
                                      if (!jq.a((char) var7)) {
                                        var5 = 0;
                                        break L6;
                                      } else {
                                        var5++;
                                        break L6;
                                      }
                                    }
                                    if (var5 < 2) {
                                      var6++;
                                      continue L5;
                                    } else {
                                      stackOut_32_0 = mo.field_a;
                                      stackIn_33_0 = stackOut_32_0;
                                      return stackIn_33_0;
                                    }
                                  }
                                }
                              }
                            }
                          }
                          stackOut_19_0 = vq.field_p;
                          stackIn_20_0 = stackOut_19_0;
                          return stackIn_20_0;
                        } else {
                          break L2;
                        }
                      }
                    }
                    stackOut_13_0 = jn.field_d;
                    stackIn_14_0 = stackOut_13_0;
                    return stackIn_14_0;
                  }
                }
              }
              stackOut_8_0 = jn.field_d;
              stackIn_9_0 = stackOut_8_0;
              return stackIn_9_0;
            } else {
              stackOut_2_0 = jn.field_d;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3 = decompiledCaughtException;
            stackOut_39_0 = (RuntimeException) var3;
            stackOut_39_1 = new StringBuilder().append("dp.B(");
            stackIn_42_0 = stackOut_39_0;
            stackIn_42_1 = stackOut_39_1;
            stackIn_40_0 = stackOut_39_0;
            stackIn_40_1 = stackOut_39_1;
            if (param0 == null) {
              stackOut_42_0 = (RuntimeException) (Object) stackIn_42_0;
              stackOut_42_1 = (StringBuilder) (Object) stackIn_42_1;
              stackOut_42_2 = "null";
              stackIn_43_0 = stackOut_42_0;
              stackIn_43_1 = stackOut_42_1;
              stackIn_43_2 = stackOut_42_2;
              break L7;
            } else {
              stackOut_40_0 = (RuntimeException) (Object) stackIn_40_0;
              stackOut_40_1 = (StringBuilder) (Object) stackIn_40_1;
              stackOut_40_2 = "{...}";
              stackIn_43_0 = stackOut_40_0;
              stackIn_43_1 = stackOut_40_1;
              stackIn_43_2 = stackOut_40_2;
              break L7;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_43_0, stackIn_43_2 + 44 + param1 + 44 + 0 + 41);
        }
        return stackIn_38_0;
    }

    public static void h(int param0) {
        if (param0 >= -68) {
            return;
        }
        field_F = null;
        field_A = null;
    }

    public dp() {
        super(0, true);
        ((dp) this).field_y = 0;
        ((dp) this).field_z = 10;
        ((dp) this).field_C = 2048;
    }

    private final void g() {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = Vertigo2.field_L ? 1 : 0;
        var2 = 0;
        ((dp) this).field_D = new int[1 + ((dp) this).field_z];
        ((dp) this).field_B = new int[1 + ((dp) this).field_z];
        var3 = 4096 / ((dp) this).field_z;
        var4 = ((dp) this).field_C * var3 >> 12;
        var5 = 0;
        L0: while (true) {
          if (((dp) this).field_z <= var5) {
            ((dp) this).field_B[((dp) this).field_z] = 4096;
            ((dp) this).field_D[((dp) this).field_z] = ((dp) this).field_D[0] + 4096;
            return;
          } else {
            ((dp) this).field_B[var5] = var2;
            ((dp) this).field_D[var5] = var4 + var2;
            var2 = var2 + var3;
            var5++;
            continue L0;
          }
        }
    }

    final static void b() {
        Object var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        Throwable var3 = null;
        int var4 = 0;
        int var5 = 0;
        Throwable decompiledCaughtException = null;
        var4 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            var1 = (Object) (Object) kb.field_a;
            synchronized (var1) {
              L1: {
                L2: {
                  mm.field_a = mm.field_a + 1;
                  rq.field_B = ah.field_l;
                  if (fh.field_w < 0) {
                    var5 = 0;
                    var2 = var5;
                    L3: while (true) {
                      if (var5 >= 112) {
                        fh.field_w = bd.field_f;
                        break L2;
                      } else {
                        cr.field_eb[var5] = false;
                        var5++;
                        continue L3;
                      }
                    }
                  } else {
                    L4: while (true) {
                      if (bd.field_f == fh.field_w) {
                        break L2;
                      } else {
                        var2 = bq.field_D[bd.field_f];
                        bd.field_f = 127 & bd.field_f - -1;
                        if (var2 >= 0) {
                          cr.field_eb[var2] = true;
                          continue L4;
                        } else {
                          cr.field_eb[~var2] = false;
                          continue L4;
                        }
                      }
                    }
                  }
                }
                ah.field_l = ro.field_e;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = (RuntimeException) (Object) decompiledCaughtException;
          throw wn.a((Throwable) (Object) var1_ref, "dp.F(" + 124 + 41);
        }
    }

    final static v a(String param0, String param1, byte param2, boolean param3, long param4) {
        RuntimeException var6 = null;
        wi stackIn_3_0 = null;
        c stackIn_10_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        wi stackOut_2_0 = null;
        c stackOut_9_0 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        try {
          L0: {
            L1: {
              if (0L != param4) {
                break L1;
              } else {
                if (param1 == null) {
                  break L1;
                } else {
                  stackOut_2_0 = new wi(param1, param0);
                  stackIn_3_0 = stackOut_2_0;
                  return (v) (Object) stackIn_3_0;
                }
              }
            }
            stackOut_9_0 = new c(param4, param0);
            stackIn_10_0 = stackOut_9_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var6;
            stackOut_11_1 = new StringBuilder().append("dp.E(");
            stackIn_14_0 = stackOut_11_0;
            stackIn_14_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L2;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_15_0 = stackOut_12_0;
              stackIn_15_1 = stackOut_12_1;
              stackIn_15_2 = stackOut_12_2;
              break L2;
            }
          }
          L3: {
            stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
            stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(44);
            stackIn_18_0 = stackOut_15_0;
            stackIn_18_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param1 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L3;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_19_0 = stackOut_16_0;
              stackIn_19_1 = stackOut_16_1;
              stackIn_19_2 = stackOut_16_2;
              break L3;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + 44 + -7 + 44 + 0 + 44 + param4 + 41);
        }
        return (v) (Object) stackIn_10_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_F = new String[]{"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        field_A = new int[8192];
    }
}
