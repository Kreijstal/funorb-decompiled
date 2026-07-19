/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vd {
    static ie[] field_d;
    private static String field_e;
    static String field_a;
    static int field_b;
    static int field_c;

    final static byte[] a(String param0, int param1) {
        RuntimeException var2 = null;
        byte[] stackIn_2_0 = null;
        byte[] stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_3_0 = null;
        byte[] stackOut_1_0 = null;
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
            if (param1 == 4) {
              stackOut_3_0 = me.field_e.a(4, "", param0);
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = (byte[]) null;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var2);
            stackOut_5_1 = new StringBuilder().append("vd.A(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
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
          throw fc.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    final static hf a(int param0, boolean param1) {
        int discarded$4 = 0;
        String discarded$5 = null;
        int discarded$6 = 0;
        String discarded$7 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Exception var6 = null;
        int var7 = 0;
        jd var8 = null;
        ba var9 = null;
        int stackIn_3_0 = 0;
        int stackIn_11_0 = 0;
        int[] stackIn_26_0 = null;
        Throwable decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        int[] stackOut_25_0 = null;
        Object stackOut_24_0 = null;
        L0: {
          var7 = SolKnight.field_L ? 1 : 0;
          var8 = te.field_N;
          var3 = var8.j(255);
          if ((var3 & 128) == 0) {
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 1;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          ml.field_e = stackIn_3_0 != 0;
          qk.field_m = 127 & var3;
          th.field_I = var8.j(255);
          q.field_b = var8.a(10526);
          if (-3 != (qk.field_m ^ -1)) {
            ah.field_c = 0;
            hc.field_b = 0;
            break L1;
          } else {
            hc.field_b = var8.i(-127);
            ah.field_c = var8.b(false);
            if (var7 == 0) {
              break L1;
            } else {
              ah.field_c = 0;
              hc.field_b = 0;
              break L1;
            }
          }
        }
        L2: {
          if ((var8.j(255) ^ -1) != -2) {
            stackOut_10_0 = 0;
            stackIn_11_0 = stackOut_10_0;
            break L2;
          } else {
            stackOut_9_0 = 1;
            stackIn_11_0 = stackOut_9_0;
            break L2;
          }
        }
        L3: {
          var4 = stackIn_11_0;
          field_e = var8.h(40);
          if (var4 != 0) {
            field_a = var8.h(112);
            break L3;
          } else {
            field_a = field_e;
            if (var7 == 0) {
              break L3;
            } else {
              field_a = var8.h(112);
              break L3;
            }
          }
        }
        L4: {
          if (1 == qk.field_m) {
            discarded$4 = var8.i(-117);
            discarded$5 = var8.h(27);
            break L4;
          } else {
            if (4 != qk.field_m) {
              break L4;
            } else {
              discarded$6 = var8.i(-117);
              discarded$7 = var8.h(27);
              break L4;
            }
          }
        }
        if (!param1) {
          ek.field_a = a.a(var8, 80, false);
          qe.field_G = null;
          var5 = -3 / ((-23 - param0) / 57);
          return new hf(param1);
        } else {
          var5 = var8.i(12);
          try {
            L5: {
              L6: {
                var9 = bf.field_f.a((byte) -109, var5);
                ek.field_a = var9.a((byte) 100);
                if (!field_a.equals(ne.field_g)) {
                  stackOut_25_0 = var9.field_n;
                  stackIn_26_0 = stackOut_25_0;
                  break L6;
                } else {
                  stackOut_24_0 = null;
                  stackIn_26_0 = (int[]) ((Object) stackOut_24_0);
                  break L6;
                }
              }
              qe.field_G = stackIn_26_0;
              break L5;
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            L7: {
              var6 = (Exception) (Object) decompiledCaughtException;
              hi.a((Throwable) ((Object) var6), "CC1", 1);
              qe.field_G = null;
              ek.field_a = null;
              break L7;
            }
          }
          if (var7 != 0) {
            ek.field_a = a.a(var8, 80, false);
            qe.field_G = null;
            var5 = -3 / ((-23 - param0) / 57);
            return new hf(param1);
          } else {
            var5 = -3 / ((-23 - param0) / 57);
            return new hf(param1);
          }
        }
    }

    final static String a(byte[] param0, int param1, int param2, int param3) {
        int incrementValue$2 = 0;
        char[] var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        char[] var10 = null;
        String stackIn_15_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_14_0 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        var9 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param3 == 160) {
                break L1;
              } else {
                vd.a((byte) 114);
                break L1;
              }
            }
            var10 = new char[param2];
            var4 = var10;
            var5 = 0;
            var6 = 0;
            L2: while (true) {
              L3: {
                if (var6 >= param2) {
                  break L3;
                } else {
                  L4: {
                    var7 = param0[var6 + param1] & 255;
                    if (var7 == 0) {
                      break L4;
                    } else {
                      L5: {
                        if (var7 < 128) {
                          break L5;
                        } else {
                          if (var7 < 160) {
                            L6: {
                              var8 = vk.field_e[-128 + var7];
                              if (var8 != 0) {
                                break L6;
                              } else {
                                var8 = 63;
                                break L6;
                              }
                            }
                            var7 = var8;
                            break L5;
                          } else {
                            break L5;
                          }
                        }
                      }
                      incrementValue$2 = var5;
                      var5++;
                      var10[incrementValue$2] = (char)var7;
                      break L4;
                    }
                  }
                  var6++;
                  if (var9 == 0) {
                    continue L2;
                  } else {
                    break L3;
                  }
                }
              }
              stackOut_14_0 = new String(var10, 0, var5);
              stackIn_15_0 = stackOut_14_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var4_ref = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) (var4_ref);
            stackOut_16_1 = new StringBuilder().append("vd.D(");
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param0 == null) {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L7;
            } else {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L7;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_15_0;
    }

    public static void a(byte param0) {
        field_e = null;
        if (param0 <= 9) {
            field_e = (String) null;
            field_d = null;
            field_a = null;
            return;
        }
        field_d = null;
        field_a = null;
    }

    static {
        field_d = new ie[10];
    }
}
