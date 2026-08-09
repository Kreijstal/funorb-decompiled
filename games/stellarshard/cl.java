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
        int var1 = 19 % ((38 - param0) / 55);
    }

    final static void a(String param0, byte param1) {
        int stackIn_17_0 = 0;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        String stackIn_45_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        var3 = stellarshard.field_B;
        try {
          L0: {
            L1: {
              ki.field_v = ki.field_v + 1;
              if (vk.field_b != -1) {
                break L1;
              } else {
                if (-1 == wg.field_c) {
                  wg.field_c = eb.field_a;
                  vk.field_b = ni.field_e;
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              L3: {
                if (param0 != null) {
                  if (param0.equals(hk.field_m)) {
                    break L2;
                  } else {
                    break L3;
                  }
                } else {
                  if (null != hk.field_m) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              L4: {
                if (!wk.field_c) {
                  if (pc.field_g <= ki.field_v) {
                    if (ki.field_v < pc.field_g + ul.field_D) {
                      stackIn_17_0 = 1;
                      break L4;
                    } else {
                      stackIn_17_0 = 0;
                      break L4;
                    }
                  } else {
                    stackIn_17_0 = 0;
                    break L4;
                  }
                } else {
                  stackIn_17_0 = 0;
                  break L4;
                }
              }
              L5: {
                var2_int = stackIn_17_0;
                if (param0 == null) {
                  ki.field_v = 0;
                  break L5;
                } else {
                  if (wk.field_c) {
                    ki.field_v = pc.field_g;
                    break L5;
                  } else {
                    if (var2_int == 0) {
                      ki.field_v = 0;
                      break L5;
                    } else {
                      ki.field_v = pc.field_g;
                      break L5;
                    }
                  }
                }
              }
              L6: {
                am.field_f = vk.field_b;
                if (param0 == null) {
                  if (var2_int != 0) {
                    wk.field_c = true;
                    break L6;
                  } else {
                    break L6;
                  }
                } else {
                  wk.field_c = false;
                  break L6;
                }
              }
              h.field_c = wg.field_c;
              break L2;
            }
            L7: {
              if (wk.field_c) {
                break L7;
              } else {
                if (pc.field_g <= ki.field_v) {
                  break L7;
                } else {
                  if (qc.field_a) {
                    am.field_f = vk.field_b;
                    ki.field_v = 0;
                    h.field_c = wg.field_c;
                    break L7;
                  } else {
                    break L7;
                  }
                }
              }
            }
            L8: {
              hk.field_m = param0;
              if (!wk.field_c) {
                break L8;
              } else {
                if (ki.field_v != td.field_b) {
                  break L8;
                } else {
                  ki.field_v = 0;
                  wk.field_c = false;
                  break L8;
                }
              }
            }
            vk.field_b = -1;
            wg.field_c = -1;
            if (param1 > 79) {
              break L0;
            } else {
              cl.a(-42, 42, 30);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var2 = decompiledCaughtException;
            stackIn_44_0 = (RuntimeException) (var2);

            stackIn_44_1 = new StringBuilder().append("cl.D(");

            if (param0 == null) {
              stackIn_45_0 = (RuntimeException) ((Object) stackIn_44_0);
              stackIn_45_1 = (StringBuilder) ((Object) stackIn_44_1);
              stackIn_45_2 = "null";
              break L9;
            } else {
              stackIn_45_0 = (RuntimeException) ((Object) stackIn_44_0);
              stackIn_45_1 = (StringBuilder) ((Object) stackIn_44_1);
              stackIn_45_2 = "{...}";
              break L9;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_45_0), stackIn_45_2 + ',' + param1 + ')');
        }
    }

    final static byte[] a(int param0, byte[] param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        byte[] var3 = null;
        byte[] stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var2_int = param1.length;
            var3 = new byte[var2_int];
            ri.a(param1, param0, var3, 0, var2_int);
            stackIn_1_0 = (byte[]) (var3);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var2);

            stackIn_4_1 = new StringBuilder().append("cl.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "null";
              break L1;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "{...}";
              break L1;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ')');
        }
        return stackIn_1_0;
    }

    static {
        field_a = -1605303501;
    }
}
