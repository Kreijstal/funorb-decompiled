/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uk implements cg {
    static int field_g;
    static nh field_f;
    static he[] field_b;
    private rf field_c;
    private int field_a;
    static int field_e;
    private int field_d;
    static he field_h;

    final static void a(int param0) {
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        h var4 = null;
        int var4_int = 0;
        nl var5_ref_nl = null;
        int var5 = 0;
        int[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        lh var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        int[] var13 = null;
        RuntimeException decompiledCaughtException = null;
        var8 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              var9 = dh.field_N;
              var2 = var9.l(31760);
              var3 = var9.l(31760);
              if (0 == var2) {
                var4 = (h) (Object) eg.field_c.h(-11151);
                if (var4 == null) {
                  eg.a((byte) 126);
                  return;
                } else {
                  L2: {
                    var5 = gf.field_C + -var9.field_j;
                    var13 = var4.field_j;
                    var12 = var13;
                    var11 = var12;
                    var10 = var11;
                    var6 = var10;
                    if (var5 > var13.length << 2) {
                      var5 = var13.length << 2;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  var7 = 0;
                  L3: while (true) {
                    if (var7 >= var5) {
                      var4.field_i = true;
                      var4.a(-16175);
                      break L1;
                    } else {
                      var6[var7 >> 2] = var6[var7 >> 2] + (var9.l(31760) << (rk.a(var7, 3) << 8));
                      var7++;
                      continue L3;
                    }
                  }
                }
              } else {
                if (var2 != 1) {
                  gb.a((Throwable) null, "LR1: " + al.a(-71), 10);
                  eg.a((byte) 126);
                  break L1;
                } else {
                  var4_int = var9.f(2350);
                  var5_ref_nl = (nl) (Object) gf.field_A.h(-11151);
                  L4: while (true) {
                    L5: {
                      if (var5_ref_nl == null) {
                        break L5;
                      } else {
                        L6: {
                          if (var3 != var5_ref_nl.field_j) {
                            break L6;
                          } else {
                            if (var5_ref_nl.field_l != var4_int) {
                              break L6;
                            } else {
                              break L5;
                            }
                          }
                        }
                        var5_ref_nl = (nl) (Object) gf.field_A.e(0);
                        continue L4;
                      }
                    }
                    if (var5_ref_nl == null) {
                      eg.a((byte) 126);
                      return;
                    } else {
                      var5_ref_nl.a(-16175);
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
          var1 = decompiledCaughtException;
          throw ie.a((Throwable) (Object) var1, "uk.B(" + -31114 + 41);
        }
    }

    public static void a(boolean param0) {
        field_f = null;
        field_h = null;
        if (param0) {
            uk.a(true);
        }
        field_b = null;
    }

    public final void a(boolean param0, int param1, vg param2, int param3, int param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        var11 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 >= 94) {
                break L1;
              } else {
                field_b = null;
                break L1;
              }
            }
            L2: {
              L3: {
                if (param2.field_n) {
                  break L3;
                } else {
                  if (!param2.a(true)) {
                    stackOut_7_0 = 2188450;
                    stackIn_8_0 = stackOut_7_0;
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              stackOut_6_0 = 3249872;
              stackIn_8_0 = stackOut_6_0;
              break L2;
            }
            L4: {
              var6_int = stackIn_8_0;
              int discarded$1 = ((uk) this).field_c.a("<u=" + Integer.toString(var6_int, 16) + ">" + param2.field_p + "</u>", param4 - -param2.field_o, param2.field_m + param3, param2.field_w, param2.field_k, var6_int, -1, ((uk) this).field_d, ((uk) this).field_a, ((uk) this).field_c.field_S + ((uk) this).field_c.field_x);
              if (param2.a(true)) {
                L5: {
                  var7 = ((uk) this).field_c.b(param2.field_p);
                  var8 = ((uk) this).field_c.field_S + ((uk) this).field_c.field_x;
                  var9 = param4 + param2.field_o;
                  if (2 == ((uk) this).field_d) {
                    var9 = var9 + (param2.field_w - var7);
                    break L5;
                  } else {
                    if (((uk) this).field_d == 1) {
                      var9 = var9 + (-var7 + param2.field_w >> 1);
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                }
                L6: {
                  var10 = param2.field_m + param3;
                  if (2 != ((uk) this).field_a) {
                    if (((uk) this).field_a != 1) {
                      break L6;
                    } else {
                      var10 = var10 + (param2.field_k + -var8 >> 1);
                      break L6;
                    }
                  } else {
                    var10 = var10 + (-var8 + param2.field_k);
                    break L6;
                  }
                }
                ce.a(var8, -2 + var9, -16579, var7 - -4, 2 + var10);
                break L4;
              } else {
                break L4;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var6 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) var6;
            stackOut_21_1 = new StringBuilder().append("uk.J(").append(param0).append(44).append(param1).append(44);
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param2 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L7;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L7;
            }
          }
          throw ie.a((Throwable) (Object) stackIn_24_0, stackIn_24_2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    public uk() {
        ((uk) this).field_d = 1;
        ((uk) this).field_a = 1;
        ((uk) this).field_c = uh.field_i;
    }

    uk(rf param0, int param1, int param2) {
        try {
            ((uk) this).field_a = param2;
            ((uk) this).field_d = param1;
            ((uk) this).field_c = param0;
        } catch (RuntimeException runtimeException) {
            throw ie.a((Throwable) (Object) runtimeException, "uk.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = 20;
    }
}
