/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class je extends vf {
    private int field_y;
    private int field_w;
    static String field_v;
    private int field_x;
    private nf[] field_u;

    public static void c(int param0) {
        field_v = null;
        if (param0 >= -67) {
            field_v = null;
        }
    }

    final static boolean a(int param0, boolean param1, CharSequence param2) {
        RuntimeException var3 = null;
        int var3_int = 0;
        String var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_4_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_34_0 = 0;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_38_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_33_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_8_0 = 0;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        String stackOut_37_2 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        String stackOut_36_2 = null;
        var8 = Confined.field_J ? 1 : 0;
        try {
          L0: {
            if (param2 == null) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            } else {
              L1: {
                var3_int = param2.length();
                if (var3_int < 1) {
                  break L1;
                } else {
                  if (var3_int > 12) {
                    break L1;
                  } else {
                    L2: {
                      var4 = hh.a(0, param2);
                      if (var4 == null) {
                        break L2;
                      } else {
                        if (var4.length() < 1) {
                          break L2;
                        } else {
                          L3: {
                            if (bg.a(175, var4.charAt(0))) {
                              break L3;
                            } else {
                              if (bg.a(param0 ^ 175, var4.charAt(var4.length() - 1))) {
                                break L3;
                              } else {
                                var5 = 0;
                                var6 = param0;
                                L4: while (true) {
                                  if (~var6 <= ~param2.length()) {
                                    if (var5 > 0) {
                                      stackOut_33_0 = 0;
                                      stackIn_34_0 = stackOut_33_0;
                                      break L0;
                                    } else {
                                      return true;
                                    }
                                  } else {
                                    L5: {
                                      var7 = param2.charAt(var6);
                                      if (!bg.a(param0 ^ 175, (char) var7)) {
                                        var5 = 0;
                                        break L5;
                                      } else {
                                        var5++;
                                        break L5;
                                      }
                                    }
                                    L6: {
                                      if (var5 < 2) {
                                        break L6;
                                      } else {
                                        if (!param1) {
                                          stackOut_28_0 = 0;
                                          stackIn_29_0 = stackOut_28_0;
                                          return stackIn_29_0 != 0;
                                        } else {
                                          break L6;
                                        }
                                      }
                                    }
                                    var6++;
                                    continue L4;
                                  }
                                }
                              }
                            }
                          }
                          stackOut_18_0 = 0;
                          stackIn_19_0 = stackOut_18_0;
                          return stackIn_19_0 != 0;
                        }
                      }
                    }
                    stackOut_13_0 = 0;
                    stackIn_14_0 = stackOut_13_0;
                    return stackIn_14_0 != 0;
                  }
                }
              }
              stackOut_8_0 = 0;
              stackIn_9_0 = stackOut_8_0;
              return stackIn_9_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3 = decompiledCaughtException;
            stackOut_35_0 = (RuntimeException) var3;
            stackOut_35_1 = new StringBuilder().append("je.A(").append(param0).append(44).append(param1).append(44);
            stackIn_37_0 = stackOut_35_0;
            stackIn_37_1 = stackOut_35_1;
            stackIn_36_0 = stackOut_35_0;
            stackIn_36_1 = stackOut_35_1;
            if (param2 == null) {
              stackOut_37_0 = (RuntimeException) (Object) stackIn_37_0;
              stackOut_37_1 = (StringBuilder) (Object) stackIn_37_1;
              stackOut_37_2 = "null";
              stackIn_38_0 = stackOut_37_0;
              stackIn_38_1 = stackOut_37_1;
              stackIn_38_2 = stackOut_37_2;
              break L7;
            } else {
              stackOut_36_0 = (RuntimeException) (Object) stackIn_36_0;
              stackOut_36_1 = (StringBuilder) (Object) stackIn_36_1;
              stackOut_36_2 = "{...}";
              stackIn_38_0 = stackOut_36_0;
              stackIn_38_1 = stackOut_36_1;
              stackIn_38_2 = stackOut_36_2;
              break L7;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_38_0, stackIn_38_2 + 41);
        }
        return stackIn_34_0 != 0;
    }

    public final void a(byte param0, int param1, boolean param2, fj param3, int param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        Object var9 = null;
        int stackIn_8_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_17_0 = 0;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        try {
          L0: {
            L1: {
              if (param0 <= -97) {
                break L1;
              } else {
                var9 = null;
                boolean discarded$2 = je.a(126, true, (CharSequence) null);
                break L1;
              }
            }
            L2: {
              if (!param3.field_w) {
                if (param3.e((byte) -18)) {
                  stackOut_6_0 = 1;
                  stackIn_8_0 = stackOut_6_0;
                  break L2;
                } else {
                  stackOut_5_0 = 0;
                  stackIn_8_0 = stackOut_5_0;
                  break L2;
                }
              } else {
                stackOut_3_0 = 1;
                stackIn_8_0 = stackOut_3_0;
                break L2;
              }
            }
            L3: {
              var6_int = stackIn_8_0;
              if (param3 instanceof rg) {
                param2 = param2 & ((rg) (Object) param3).field_L;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (param2) {
                if (var6_int != 0) {
                  stackOut_15_0 = ((je) this).field_x;
                  stackIn_16_0 = stackOut_15_0;
                  break L4;
                } else {
                  stackOut_14_0 = ((je) this).field_y;
                  stackIn_16_0 = stackOut_14_0;
                  break L4;
                }
              } else {
                stackOut_12_0 = ((je) this).field_w;
                stackIn_16_0 = stackOut_12_0;
                break L4;
              }
            }
            L5: {
              var7 = stackIn_16_0;
              if (param2) {
                stackOut_18_0 = 16777215;
                stackIn_19_0 = stackOut_18_0;
                break L5;
              } else {
                stackOut_17_0 = 7105644;
                stackIn_19_0 = stackOut_17_0;
                break L5;
              }
            }
            var8 = stackIn_19_0;
            qj.a(((je) this).field_u, param3.field_m + param4 - -(param3.field_z - ((je) this).field_u[0].field_x >> 1), param3.field_F, 55, param1 - -param3.field_q, var7);
            int discarded$3 = ((je) this).field_a.a(param3.field_B, param1 - -param3.field_q, param4 + param3.field_m - 2, param3.field_F, param3.field_z, var8, -1, 1, 1, ((je) this).field_a.field_C);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var6 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) var6;
            stackOut_21_1 = new StringBuilder().append("je.C(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param3 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L6;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L6;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_24_0, stackIn_24_2 + 44 + param4 + 41);
        }
    }

    public je() {
        this(2188450, 2591221, 9543);
    }

    private je(int param0, int param1, int param2) {
        ((je) this).field_w = param2;
        ((je) this).field_x = param1;
        ((je) this).field_u = em.field_d;
        ((je) this).field_y = param0;
        ((je) this).field_a = fd.field_k;
    }

    static {
    }
}
