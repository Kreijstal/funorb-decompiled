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

    public static void c(byte param0) {
        int var1 = 82 % ((-38 - param0) / 51);
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
        return this.field_m.a((byte) -115) + this.field_a.a((byte) -105);
    }

    final boolean b(byte param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        if (param0 < 100) {
          L0: {
            this.d((byte) 105);
            if ((this.d(-21033) ^ -1) > -21) {
              stackIn_8_0 = 0;
              break L0;
            } else {
              stackIn_8_0 = 1;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if ((this.d(-21033) ^ -1) > -21) {
              stackIn_4_0 = 0;
              break L1;
            } else {
              stackIn_4_0 = 1;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    final int d(int param0) {
        if (param0 != -21033) {
          this.a(124);
          return this.field_j.a((byte) -102) - -this.field_p.a((byte) -85);
        } else {
          return this.field_j.a((byte) -102) - -this.field_p.a((byte) -85);
        }
    }

    final static boolean a(long param0, int[] param1, String param2, int param3, int param4) {
        RuntimeException var6 = null;
        int stackIn_2_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param4 == -21) {
              L1: {
                L2: {
                  if (param1 == null) {
                    break L2;
                  } else {
                    L3: {
                      if ((param3 ^ -1) != -3) {
                        break L3;
                      } else {
                        if (!qm.a((byte) -31, param2, param0)) {
                          break L2;
                        } else {
                          break L3;
                        }
                      }
                    }
                    stackIn_9_0 = 1;
                    break L1;
                  }
                }
                stackIn_9_0 = 0;
                break L1;
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var6 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var6);

            stackIn_12_1 = new StringBuilder().append("vk.R(").append(param0).append(',');

            if (param1 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');

            if (param2 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L5;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L5;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_13_0), stackIn_16_2 + ',' + param3 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_9_0 != 0;
        }
    }

    abstract boolean d(byte param0);

    abstract void a(Object param0, boolean param1, int param2);

    abstract void b(int param0);

    final static void a(boolean param0) {
        pc var1 = null;
        int var2 = 0;
        boolean stackIn_19_0 = false;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1_ref = null;
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
                field_s = (int[]) null;
                break L1;
              }
            }
            L2: {
              if (la.field_b != 0) {
                break L2;
              } else {
                la.field_b = 200;
                var1 = (pc) ((Object) mm.field_b.e(13058));
                L3: while (true) {
                  if (var1 == null) {
                    if (null == rl.field_c) {
                      break L2;
                    } else {
                      var1 = (pc) ((Object) rl.field_c.e(13058));
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
                          var1 = (pc) ((Object) rl.field_c.a((byte) -6));
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
                    var1 = (pc) ((Object) mm.field_b.a((byte) -101));
                    continue L3;
                  }
                }
              }
            }
            L7: {
              if (null == q.field_f) {
                break L7;
              } else {
                stackIn_19_0 = q.field_f.d((byte) 90);
                if (!stackIn_19_0) {
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
          throw ci.a((Throwable) ((Object) var1_ref), "vk.N(" + param0 + ')');
        }
    }

    abstract void a(int param0);

    final boolean c(int param0) {
        int var2 = -117 / ((-48 - param0) / 41);
        return 20 <= this.a((byte) 16) ? true : false;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, ak param6, byte param7, mi param8, int param9, ak param10, int param11, int param12, int param13, int param14, int param15, int param16, int param17, mi param18, ak param19, int param20) {
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var21_int = 0;
        RuntimeException var21 = null;
        try {
          L0: {
            var21_int = 87 % ((-55 - param7) / 51);
            kg.a(2048, param8, param18, param11);
            he.a(false, param14, param0, param17, param9);
            sf.a(52, param13, param1);
            hf.a(param10, param2, param3, param6, -125, param16);
            qe.a(param19, param12, param20, 3);
            ph.a(param4, param5, param15, -97);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var21 = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var21);

            stackIn_4_1 = new StringBuilder().append("vk.O(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');

            if (param6 == null) {
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
          L2: {


            stackIn_7_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(',').append(param7).append(',');

            if (param8 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L2;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',').append(param9).append(',');

            if (param10 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',').append(param11).append(',').append(param12).append(',').append(param13).append(',').append(param14).append(',').append(param15).append(',').append(param16).append(',').append(param17).append(',');

            if (param18 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L4;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_16_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',');

            if (param19 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L5;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L5;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_5_0), stackIn_17_2 + ',' + param20 + ')');
        }
    }

    final qa a(byte param0, int param1, int param2, boolean param3, byte param4) {
        long var6 = ((long)param1 << -17987872) - -(long)param2;
        qa var8 = new qa();
        var8.field_w = var6;
        int var9 = 90 / ((param4 - -46) / 45);
        var8.field_K = param0;
        var8.field_B = param3 ? true : false;
        if (param3) {
            if (-21 >= (this.a((byte) 16) ^ -1)) {
                throw new RuntimeException();
            }
            this.field_m.a((byte) 96, var8);
        } else {
            if (!(-21 < (this.d(-21033) ^ -1))) {
                throw new RuntimeException();
            }
            this.field_j.a((byte) 47, var8);
        }
        return var8;
    }

    vk() {
        this.field_m = new ra();
        this.field_a = new ra();
        this.field_j = new ra();
        this.field_p = new ra();
        this.field_o = new gi(6);
        this.field_n = (byte) 0;
        this.field_f = 0;
        this.field_t = 0;
        this.field_c = new gi(10);
    }

    static {
        field_b = "Enter name of friend to delete from list";
        field_s = new int[]{84, 104, 29, 87, 29, 24, 24, 24, 86, 85, 47, 17, 3, 8, 31, 29, 16, 13, 17, -1};
        field_k = "You have 1 unread message!";
        field_h = new int[]{100, 25};
    }
}
