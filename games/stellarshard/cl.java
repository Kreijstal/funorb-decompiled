/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cl {
    static int field_a;

    final static pb a(int param0, int param1, int param2) {
        int var5 = 0;
        int var6 = stellarshard.field_B;
        int var4 = -71 % ((param1 - 61) / 52);
        pb var7 = new pb(param2, param2);
        pb var3 = var7;
        for (var5 = 0; var3.field_z.length > var5; var5++) {
            var7.field_z[var5] = param0;
        }
        return var3;
    }

    final static void a(byte param0) {
        int var1 = 0;
    }

    final static void a(String param0, byte param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int stackIn_17_0 = 0;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        String stackIn_46_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_10_0 = 0;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        RuntimeException stackOut_45_0 = null;
        StringBuilder stackOut_45_1 = null;
        String stackOut_45_2 = null;
        RuntimeException stackOut_44_0 = null;
        StringBuilder stackOut_44_1 = null;
        String stackOut_44_2 = null;
        var3 = stellarshard.field_B;
        try {
          L0: {
            ki.field_v = ki.field_v + 1;
            if (vk.field_b != -1) {
              break L0;
            } else {
              if (-1 == wg.field_c) {
                wg.field_c = eb.field_a;
                vk.field_b = ni.field_e;
                break L0;
              } else {
                break L0;
              }
            }
          }
          L1: {
            L2: {
              if (param0 != null) {
                if (param0.equals((Object) (Object) hk.field_m)) {
                  break L1;
                } else {
                  break L2;
                }
              } else {
                if (null != hk.field_m) {
                  break L1;
                } else {
                  break L2;
                }
              }
            }
            L3: {
              if (!wk.field_c) {
                if (pc.field_g <= ki.field_v) {
                  if (ki.field_v < pc.field_g + ul.field_D) {
                    stackOut_15_0 = 1;
                    stackIn_17_0 = stackOut_15_0;
                    break L3;
                  } else {
                    stackOut_14_0 = 0;
                    stackIn_17_0 = stackOut_14_0;
                    break L3;
                  }
                } else {
                  stackOut_12_0 = 0;
                  stackIn_17_0 = stackOut_12_0;
                  break L3;
                }
              } else {
                stackOut_10_0 = 0;
                stackIn_17_0 = stackOut_10_0;
                break L3;
              }
            }
            L4: {
              var2_int = stackIn_17_0;
              if (param0 == null) {
                ki.field_v = 0;
                break L4;
              } else {
                if (wk.field_c) {
                  ki.field_v = pc.field_g;
                  break L4;
                } else {
                  if (var2_int == 0) {
                    ki.field_v = 0;
                    break L4;
                  } else {
                    ki.field_v = pc.field_g;
                    break L4;
                  }
                }
              }
            }
            L5: {
              am.field_f = vk.field_b;
              if (param0 == null) {
                if (var2_int != 0) {
                  wk.field_c = true;
                  break L5;
                } else {
                  break L5;
                }
              } else {
                wk.field_c = false;
                break L5;
              }
            }
            h.field_c = wg.field_c;
            break L1;
          }
          L6: {
            if (wk.field_c) {
              break L6;
            } else {
              if (pc.field_g <= ki.field_v) {
                break L6;
              } else {
                if (qc.field_a) {
                  am.field_f = vk.field_b;
                  ki.field_v = 0;
                  h.field_c = wg.field_c;
                  break L6;
                } else {
                  break L6;
                }
              }
            }
          }
          hk.field_m = param0;
          if (!wk.field_c) {
            vk.field_b = -1;
            wg.field_c = -1;
            return;
          } else {
            if (ki.field_v != td.field_b) {
              vk.field_b = -1;
              wg.field_c = -1;
              return;
            } else {
              ki.field_v = 0;
              wk.field_c = false;
              vk.field_b = -1;
              wg.field_c = -1;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var2 = decompiledCaughtException;
            stackOut_43_0 = (RuntimeException) var2;
            stackOut_43_1 = new StringBuilder().append("cl.D(");
            stackIn_45_0 = stackOut_43_0;
            stackIn_45_1 = stackOut_43_1;
            stackIn_44_0 = stackOut_43_0;
            stackIn_44_1 = stackOut_43_1;
            if (param0 == null) {
              stackOut_45_0 = (RuntimeException) (Object) stackIn_45_0;
              stackOut_45_1 = (StringBuilder) (Object) stackIn_45_1;
              stackOut_45_2 = "null";
              stackIn_46_0 = stackOut_45_0;
              stackIn_46_1 = stackOut_45_1;
              stackIn_46_2 = stackOut_45_2;
              break L7;
            } else {
              stackOut_44_0 = (RuntimeException) (Object) stackIn_44_0;
              stackOut_44_1 = (StringBuilder) (Object) stackIn_44_1;
              stackOut_44_2 = "{...}";
              stackIn_46_0 = stackOut_44_0;
              stackIn_46_1 = stackOut_44_1;
              stackIn_46_2 = stackOut_44_2;
              break L7;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_46_0, stackIn_46_2 + 44 + 96 + 41);
        }
    }

    final static byte[] a(int param0, byte[] param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        byte[] var3 = null;
        byte[] stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_0_0 = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            var2_int = param1.length;
            var3 = new byte[var2_int];
            ri.a(param1, param0, var3, 0, var2_int);
            stackOut_0_0 = (byte[]) var3;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var2;
            stackOut_2_1 = new StringBuilder().append("cl.B(").append(param0).append(44);
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + 41);
        }
        return stackIn_1_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = -1605303501;
    }
}
