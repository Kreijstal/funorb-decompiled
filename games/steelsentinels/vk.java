/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class vk {
    static String field_b;
    static int[] field_g;
    ra field_m;
    static wk[] field_l;
    static wk field_r;
    static int[] field_s;
    static wk field_q;
    static String field_k;
    ra field_a;
    static int[] field_h;
    ra field_j;
    ra field_p;
    int field_i;
    gi field_o;
    long field_e;
    byte field_n;
    volatile int field_f;
    gi field_c;
    volatile int field_t;
    qa field_d;

    public static void c() {
        int var1 = 0;
        field_s = null;
        field_b = null;
        field_q = null;
        field_g = null;
        field_l = null;
        field_k = null;
        field_r = null;
        field_h = null;
    }

    final int a(byte param0) {
        if (param0 != 16) {
            return 76;
        }
        return ((vk) this).field_m.a((byte) -115) + ((vk) this).field_a.a((byte) -105);
    }

    final boolean b(byte param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 < 100) {
          L0: {
            boolean discarded$10 = ((vk) this).d((byte) 105);
            if (((vk) this).d(-21033) < 20) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (((vk) this).d(-21033) < 20) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    final int d(int param0) {
        if (param0 != -21033) {
          ((vk) this).a(124);
          return ((vk) this).field_j.a((byte) -102) - -((vk) this).field_p.a((byte) -85);
        } else {
          return ((vk) this).field_j.a((byte) -102) - -((vk) this).field_p.a((byte) -85);
        }
    }

    final static boolean a(long param0, int[] param1, String param2, int param3) {
        RuntimeException var6 = null;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_7_0 = 0;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        try {
          L0: {
            L1: {
              L2: {
                if (param1 == null) {
                  break L2;
                } else {
                  L3: {
                    if (param3 != 2) {
                      break L3;
                    } else {
                      if (!qm.a((byte) -31, param2, param0)) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  stackOut_6_0 = 1;
                  stackIn_8_0 = stackOut_6_0;
                  break L1;
                }
              }
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var6 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var6;
            stackOut_9_1 = new StringBuilder().append("vk.R(").append(param0).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param1 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L4;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L4;
            }
          }
          L5: {
            stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
            stackOut_12_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param2 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L5;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L5;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ',' + param3 + ',' + -21 + ')');
        }
        return stackIn_8_0 != 0;
    }

    abstract boolean d(byte param0);

    abstract void a(Object param0, boolean param1, int param2);

    abstract void b(int param0);

    final static void a(boolean param0) {
        pc var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        var2 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              fc.field_a.b();
              cm.field_j.b();
              la.field_b = la.field_b - 1;
              if (!param0) {
                break L1;
              } else {
                field_s = null;
                break L1;
              }
            }
            L2: {
              if (la.field_b != 0) {
                break L2;
              } else {
                la.field_b = 200;
                var1 = (pc) (Object) mm.field_b.e(13058);
                L3: while (true) {
                  if (var1 == null) {
                    if (null == rl.field_c) {
                      break L2;
                    } else {
                      var1 = (pc) (Object) rl.field_c.e(13058);
                      L4: while (true) {
                        if (var1 == null) {
                          break L2;
                        } else {
                          L5: {
                            if (var1.field_u.b((byte) -12)) {
                              break L5;
                            } else {
                              var1.b(4);
                              break L5;
                            }
                          }
                          var1 = (pc) (Object) rl.field_c.a((byte) -6);
                          continue L4;
                        }
                      }
                    }
                  } else {
                    L6: {
                      if (var1.field_u.b((byte) -12)) {
                        break L6;
                      } else {
                        var1.b(4);
                        break L6;
                      }
                    }
                    var1 = (pc) (Object) mm.field_b.a((byte) -101);
                    continue L3;
                  }
                }
              }
            }
            L7: {
              if (null == q.field_f) {
                break L7;
              } else {
                if (!q.field_f.d((byte) 90)) {
                  ml.field_g = null;
                  break L7;
                } else {
                  return;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw ci.a((Throwable) (Object) var1_ref, "vk.N(" + param0 + ')');
        }
    }

    abstract void a(int param0);

    final boolean c(int param0) {
        int var2 = -117 / ((-48 - param0) / 41);
        return 20 <= ((vk) this).a((byte) 16) ? true : false;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, ak param6, byte param7, mi param8, int param9, ak param10, int param11, int param12, int param13, int param14, int param15, int param16, int param17, mi param18, ak param19) {
        int var21_int = 0;
        RuntimeException var21 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        try {
          L0: {
            var21_int = 0;
            int discarded$4 = 480;
            kg.a(2048, param8, param18);
            he.a(false, param14, param0, param17, param9);
            sf.a(52, 320, 240);
            hf.a(param10, 8, 2, param6, -125, 8);
            int discarded$5 = 3;
            int discarded$6 = 8;
            int discarded$7 = 8;
            qe.a(param19);
            ph.a(0, 16777215, 1146810, -97);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var21 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var21;
            stackOut_2_1 = new StringBuilder().append("vk.O(").append(param0).append(',').append(240).append(',').append(8).append(',').append(2).append(',').append(0).append(',').append(16777215).append(',');
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param6 == null) {
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
          L2: {
            stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
            stackOut_5_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(',').append(-115).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param8 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          L3: {
            stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',').append(param9).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param10 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          L4: {
            stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
            stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',').append(480).append(',').append(8).append(',').append(320).append(',').append(param14).append(',').append(1146810).append(',').append(8).append(',').append(param17).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param18 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L4;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L4;
            }
          }
          L5: {
            stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
            stackOut_14_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param19 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L5;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L5;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ',' + 8 + ')');
        }
    }

    final qa a(byte param0, int param1, int param2, boolean param3, byte param4) {
        long var6 = ((long)param1 << 32) - -(long)param2;
        qa var8 = new qa();
        var8.field_w = var6;
        int var9 = 90 / ((param4 - -46) / 45);
        var8.field_K = param0;
        var8.field_B = param3 ? true : false;
        if (param3) {
            if (-21 >= ((vk) this).a((byte) 16)) {
                throw new RuntimeException();
            }
            ((vk) this).field_m.a((byte) 96, (kd) (Object) var8);
        } else {
            if (!(-21 > ((vk) this).d(-21033))) {
                throw new RuntimeException();
            }
            ((vk) this).field_j.a((byte) 47, (kd) (Object) var8);
        }
        return var8;
    }

    vk() {
        ((vk) this).field_m = new ra();
        ((vk) this).field_a = new ra();
        ((vk) this).field_j = new ra();
        ((vk) this).field_p = new ra();
        ((vk) this).field_o = new gi(6);
        ((vk) this).field_n = (byte) 0;
        ((vk) this).field_f = 0;
        ((vk) this).field_t = 0;
        ((vk) this).field_c = new gi(10);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Enter name of friend to delete from list";
        field_s = new int[]{84, 104, 29, 87, 29, 24, 24, 24, 86, 85, 47, 17, 3, 8, 31, 29, 16, 13, 17, -1};
        field_k = "You have 1 unread message!";
        field_h = new int[]{100, 25};
    }
}
