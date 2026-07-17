/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class be extends im {
    private boolean field_h;
    private int[] field_l;
    private byte[] field_n;
    private int field_k;
    private int field_m;
    static cg field_i;
    static int field_j;

    final void a(boolean param0) {
        ((be) this).field_m = 0;
        ((be) this).field_k = 0;
        if (param0) {
            ((be) this).a((byte) -3);
        }
    }

    public static void c() {
        field_i = null;
    }

    final byte[] c(int param0, int param1, int param2) {
        ((be) this).field_n = new byte[param0 * param1];
        ((be) this).b(param0, param1, -9394);
        if (param2 >= -18) {
            return null;
        }
        return ((be) this).field_n;
    }

    final void a(int param0, int param1, int param2) {
        if (param2 != -25466) {
            return;
        }
        ((be) this).field_m = ((be) this).field_m + (((be) this).field_l[param0] * param1 >> 12);
    }

    final static vk a(String param0, byte param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        vk stackIn_4_0 = null;
        vk stackIn_7_0 = null;
        vk stackIn_11_0 = null;
        int stackIn_20_0 = 0;
        vk stackIn_25_0 = null;
        Object stackIn_31_0 = null;
        vk stackIn_41_0 = null;
        vk stackIn_45_0 = null;
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        String stackIn_52_2 = null;
        RuntimeException decompiledCaughtException = null;
        vk stackOut_3_0 = null;
        vk stackOut_44_0 = null;
        vk stackOut_40_0 = null;
        Object stackOut_30_0 = null;
        int stackOut_19_0 = 0;
        int stackOut_18_0 = 0;
        vk stackOut_24_0 = null;
        vk stackOut_10_0 = null;
        vk stackOut_6_0 = null;
        RuntimeException stackOut_49_0 = null;
        StringBuilder stackOut_49_1 = null;
        RuntimeException stackOut_51_0 = null;
        StringBuilder stackOut_51_1 = null;
        String stackOut_51_2 = null;
        RuntimeException stackOut_50_0 = null;
        StringBuilder stackOut_50_1 = null;
        String stackOut_50_2 = null;
        var6 = ZombieDawn.field_J;
        try {
          var2_int = param0.length();
          if (0 == var2_int) {
            stackOut_3_0 = bg.field_l;
            stackIn_4_0 = stackOut_3_0;
            return stackIn_4_0;
          } else {
            if (var2_int <= 64) {
              if (param0.charAt(0) != 34) {
                var3 = 0;
                if (param1 <= -47) {
                  var4 = 0;
                  L0: while (true) {
                    if (var4 < var2_int) {
                      L1: {
                        var5 = param0.charAt(var4);
                        if (46 != var5) {
                          if (-1 != mc.field_i.indexOf(var5)) {
                            var3 = 0;
                            break L1;
                          } else {
                            stackOut_44_0 = vl.field_m;
                            stackIn_45_0 = stackOut_44_0;
                            return stackIn_45_0;
                          }
                        } else {
                          L2: {
                            if (var4 == 0) {
                              break L2;
                            } else {
                              if (var2_int - 1 == var4) {
                                break L2;
                              } else {
                                if (var3 == 0) {
                                  var3 = 1;
                                  break L1;
                                } else {
                                  break L2;
                                }
                              }
                            }
                          }
                          stackOut_40_0 = vl.field_m;
                          stackIn_41_0 = stackOut_40_0;
                          return stackIn_41_0;
                        }
                      }
                      var4++;
                      continue L0;
                    } else {
                      return null;
                    }
                  }
                } else {
                  stackOut_30_0 = null;
                  stackIn_31_0 = stackOut_30_0;
                  return (vk) (Object) stackIn_31_0;
                }
              } else {
                if (param0.charAt(-1 + var2_int) == 34) {
                  var3 = 0;
                  var4 = 1;
                  L3: while (true) {
                    if (var2_int - 1 > var4) {
                      L4: {
                        var5 = param0.charAt(var4);
                        if (var5 == 92) {
                          L5: {
                            if (var3 != 0) {
                              stackOut_19_0 = 0;
                              stackIn_20_0 = stackOut_19_0;
                              break L5;
                            } else {
                              stackOut_18_0 = 1;
                              stackIn_20_0 = stackOut_18_0;
                              break L5;
                            }
                          }
                          var3 = stackIn_20_0;
                          break L4;
                        } else {
                          L6: {
                            if (var5 != 34) {
                              break L6;
                            } else {
                              if (var3 == 0) {
                                stackOut_24_0 = vl.field_m;
                                stackIn_25_0 = stackOut_24_0;
                                return stackIn_25_0;
                              } else {
                                break L6;
                              }
                            }
                          }
                          var3 = 0;
                          break L4;
                        }
                      }
                      var4++;
                      continue L3;
                    } else {
                      return null;
                    }
                  }
                } else {
                  stackOut_10_0 = vl.field_m;
                  stackIn_11_0 = stackOut_10_0;
                  return stackIn_11_0;
                }
              }
            } else {
              stackOut_6_0 = fg.field_m;
              stackIn_7_0 = stackOut_6_0;
              return stackIn_7_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var2 = decompiledCaughtException;
            stackOut_49_0 = (RuntimeException) var2;
            stackOut_49_1 = new StringBuilder().append("be.H(");
            stackIn_51_0 = stackOut_49_0;
            stackIn_51_1 = stackOut_49_1;
            stackIn_50_0 = stackOut_49_0;
            stackIn_50_1 = stackOut_49_1;
            if (param0 == null) {
              stackOut_51_0 = (RuntimeException) (Object) stackIn_51_0;
              stackOut_51_1 = (StringBuilder) (Object) stackIn_51_1;
              stackOut_51_2 = "null";
              stackIn_52_0 = stackOut_51_0;
              stackIn_52_1 = stackOut_51_1;
              stackIn_52_2 = stackOut_51_2;
              break L7;
            } else {
              stackOut_50_0 = (RuntimeException) (Object) stackIn_50_0;
              stackOut_50_1 = (StringBuilder) (Object) stackIn_50_1;
              stackOut_50_2 = "{...}";
              stackIn_52_0 = stackOut_50_0;
              stackIn_52_1 = stackOut_50_1;
              stackIn_52_2 = stackOut_50_2;
              break L7;
            }
          }
          throw sh.a((Throwable) (Object) stackIn_52_0, stackIn_52_2 + 44 + param1 + 41);
        }
    }

    be(int param0, int param1, int param2, int param3, int param4, float param5, boolean param6) {
        super(param0, param1, param2, param3, param4);
        int var8 = 0;
        ((be) this).field_l = new int[((be) this).field_g];
        ((be) this).field_h = param6 ? true : false;
        for (var8 = 0; ((be) this).field_g > var8; var8++) {
            ((be) this).field_l[var8] = (short)(int)(4096.0 * Math.pow((double)param5, (double)var8));
        }
    }

    final void a(byte param0) {
        Object var3 = null;
        byte[] stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        byte[] stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        byte[] stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        int stackIn_9_2 = 0;
        byte[] stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        byte[] stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        int stackOut_8_2 = 0;
        byte[] stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        int stackOut_7_2 = 0;
        L0: {
          if (param0 == 44) {
            break L0;
          } else {
            var3 = null;
            vk discarded$4 = be.a((String) null, (byte) -57);
            break L0;
          }
        }
        L1: {
          if (((be) this).field_m < -4096) {
            ((be) this).field_m = -4096;
            break L1;
          } else {
            if (((be) this).field_m <= 4096) {
              break L1;
            } else {
              ((be) this).field_m = 4096;
              break L1;
            }
          }
        }
        L2: {
          int fieldTemp$5 = ((be) this).field_k;
          ((be) this).field_k = ((be) this).field_k + 1;
          stackOut_6_0 = ((be) this).field_n;
          stackOut_6_1 = fieldTemp$5;
          stackIn_8_0 = stackOut_6_0;
          stackIn_8_1 = stackOut_6_1;
          stackIn_7_0 = stackOut_6_0;
          stackIn_7_1 = stackOut_6_1;
          if (!((be) this).field_h) {
            stackOut_8_0 = (byte[]) (Object) stackIn_8_0;
            stackOut_8_1 = stackIn_8_1;
            stackOut_8_2 = ((be) this).field_m;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            stackIn_9_2 = stackOut_8_2;
            break L2;
          } else {
            stackOut_7_0 = (byte[]) (Object) stackIn_7_0;
            stackOut_7_1 = stackIn_7_1;
            stackOut_7_2 = 2048 + (((be) this).field_m >> 1);
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_9_2 = stackOut_7_2;
            break L2;
          }
        }
        stackIn_9_0[stackIn_9_1] = (byte)(stackIn_9_2 >> 4);
        ((be) this).field_m = 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = new cg(11, 0, 1, 2);
    }
}
