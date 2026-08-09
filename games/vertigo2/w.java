/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class w extends ji {
    static String field_E;
    static String field_B;
    static String field_y;
    static String field_A;
    static String field_D;
    static int field_z;
    static cr[] field_C;

    final static ge a(byte[] param0, boolean param1) {
        ge var2 = null;
        RuntimeException var2_ref = null;
        Object stackIn_2_0 = null;
        ge stackIn_5_0 = null;
        ge stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 != null) {
              var2 = new ge(param0, ca.field_a, pc.field_a, mh.field_c, vi.field_w, in.field_c, se.field_y);
              if (param1) {
                la.a((byte) 123);
                stackIn_7_0 = (ge) (var2);
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackIn_5_0 = (ge) null;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2_ref = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var2_ref);

            stackIn_10_1 = new StringBuilder().append("w.H(");

            if (param0 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L1;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L1;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (ge) ((Object) stackIn_2_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0;
          } else {
            return stackIn_7_0;
          }
        }
    }

    final int[] c(int param0, int param1) {
        int[] var4 = null;
        int[] var3 = null;
        if (param1 < 91) {
            field_z = 115;
            var4 = this.field_x.a(param0, (byte) -54);
            var3 = var4;
            if (!this.field_x.field_i) {
                return var4;
            }
            qq.a(var4, 0, we.field_M, lf.field_y[param0]);
            return var4;
        }
        var4 = this.field_x.a(param0, (byte) -54);
        var3 = var4;
        if (this.field_x.field_i) {
            qq.a(var4, 0, we.field_M, lf.field_y[param0]);
            return var4;
        }
        return var4;
    }

    final static co a(r param0, r param1, String param2, String param3, int param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        String var7 = null;
        co stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param4 > 101) {
                break L1;
              } else {
                var7 = (String) null;
                w.a((r) null, (r) null, (String) null, (String) null, 73);
                break L1;
              }
            }
            var5_int = param1.a((byte) 118, param3);
            var6 = param1.a(var5_int, param2, 113);
            stackIn_3_0 = fi.a(var5_int, param1, param0, var6, (byte) 70);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var5);

            stackIn_6_1 = new StringBuilder().append("w.B(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');

            if (param2 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');

            if (param3 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L5;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L5;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_7_0), stackIn_16_2 + ',' + param4 + ')');
        }
        return stackIn_3_0;
    }

    final static int a(int param0, byte[] param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var3_int = 127 % ((param2 - -57) / 50);
            stackIn_1_0 = om.a(param0, 0, param1, 255);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var3);

            stackIn_4_1 = new StringBuilder().append("w.E(").append(param0).append(',');

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
          throw wn.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ',' + param2 + ')');
        }
        return stackIn_1_0;
    }

    final static void a(r param0, r param1, r param2, byte param3) {
        int var5 = 0;
        int var6 = 0;
        byte[] var7 = null;
        ei var8 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var6 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            tj.field_c = false;
            uk.a(param2, param1, 121);
            var8 = new ei(0);
            L1: while (true) {
              if (var8.a((byte) 70)) {
                L2: {
                  pn.a((byte) 71, var8);
                  ap.field_b[2] = new go(param0, "character", "vertigo_death");
                  ap.field_b[3] = new go(param0, "character", "fall_fan_jump");
                  ap.field_b[0] = new go(param0, "character", "vertigo_idle");
                  ap.field_b[4] = new go(param0, "character", "vertigo_jetpack_idle");
                  ap.field_b[5] = new go(param0, "character", "vertigo_portal_in");
                  ap.field_b[1] = new go(param0, "character", "vertigo_walk");
                  ap.field_b[6] = new go(param0, "character", "vertigo_new_fall");
                  ap.field_b[7] = new go(param0, "character", "vertigo_new_land");
                  ap.field_b[8] = new go(param0, "character", "vertigo_new_mid_jump");
                  ap.field_b[9] = new go(param0, "character", "vertigo_new_peak");
                  ap.field_b[10] = new go(param0, "character", "vertigo_dynamite");
                  ap.field_b[26] = new go(param0, "character", "new_dynamite");
                  ap.field_b[11] = new go(param0, "character", "vertigo_failed_jump");
                  ap.field_b[12] = new go(param0, "character", "vertigo_fan_idle");
                  ap.field_b[13] = new go(param0, "character", "vertigo_portal_out");
                  ap.field_b[14] = new go(param0, "character", "land_fan_jump");
                  ap.field_b[15] = new go(param0, "character", "mid_fan_jump");
                  ap.field_b[16] = new go(param0, "character", "peak_fan_jump");
                  ap.field_b[17] = new go(param0, "character", "new_jetpack_mid_jump");
                  ap.field_b[18] = new go(param0, "character", "new_jetpack_peak_jump");
                  ap.field_b[20] = new go(param0, "character", "electric_death");
                  ap.field_b[21] = new go(param0, "character", "anticipation");
                  ap.field_b[22] = new go(param0, "character", "score_anim");
                  ap.field_b[23] = new go(param0, "character", "game_over");
                  ap.field_b[24] = new go(param0, "character", "placeholder_jump");
                  ap.field_b[25] = new go(param0, "character", "toony_fall");
                  ap.field_b[19] = new go(param0, "character", "idle_sad");
                  ap.field_b[27] = new go(param0, "character", "flames");
                  wi.field_d[2] = new go(param0, "character", "new_fan_spin");
                  wi.field_d[0] = new go(param0, "character", "new_fan_start");
                  wi.field_d[1] = new go(param0, "character", "new_fan_stop");
                  wi.field_d[3] = new go(param0, "character", "portal_in_vortex");
                  wi.field_d[4] = new go(param0, "character", "portal_out_vortex");
                  wi.field_d[5] = new go(param0, "character", "ice_block_break");
                  var5 = 0;
                  if (param3 > 25) {
                    break L2;
                  } else {
                    var7 = (byte[]) null;
                    w.a(-39, (byte[]) null, -98);
                    break L2;
                  }
                }
                L3: while (true) {
                  if ((var5 ^ -1) <= -29) {
                    break L0;
                  } else {
                    na.field_o[var5] = ap.field_b[var5].a((byte) -123, true);
                    var5++;
                    continue L3;
                  }
                }
              } else {
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var4);

            stackIn_11_1 = new StringBuilder().append("w.J(");

            if (param0 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L4;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_14_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',');

            if (param1 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L5;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_17_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',');

            if (param2 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L6;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L6;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_12_0), stackIn_18_2 + ',' + param3 + ')');
        }
    }

    final static boolean a(String param0, String param1, int param2) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_25_0 = 0;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        StringBuilder stackIn_31_1 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (vc.a(-121, param0)) {
              stackIn_3_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (rh.a(param2 ^ 288, param0)) {
                stackIn_7_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (!nh.a(param0, (byte) -113)) {
                  if (param1.length() == param2) {
                    stackIn_14_0 = 1;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    if (tj.a(-22697, param0, param1)) {
                      stackIn_18_0 = 0;
                      decompiledRegionSelector0 = 4;
                      break L0;
                    } else {
                      if (!hl.a((byte) -99, param1, param0)) {
                        if (gm.a(122, param1, param0)) {
                          stackIn_25_0 = 0;
                          decompiledRegionSelector0 = 6;
                          break L0;
                        } else {
                          return true;
                        }
                      } else {
                        stackIn_21_0 = 0;
                        decompiledRegionSelector0 = 5;
                        break L0;
                      }
                    }
                  }
                } else {
                  stackIn_10_0 = 0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_28_0 = (RuntimeException) (var3);

            stackIn_28_1 = new StringBuilder().append("w.F(");

            if (param0 == null) {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "null";
              break L1;
            } else {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_31_1 = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_29_2).append(',');

            if (param1 == null) {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "null";
              break L2;
            } else {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "{...}";
              break L2;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_29_0), stackIn_32_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_10_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_14_0 != 0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_18_0 != 0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_21_0 != 0;
                  } else {
                    return stackIn_25_0 != 0;
                  }
                }
              }
            }
          }
        }
    }

    public w() {
        super(0, true);
    }

    final static StringBuilder a(boolean param0, char param1, int param2, StringBuilder param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        StringBuilder stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0) {
                break L1;
              } else {
                field_B = (String) null;
                break L1;
              }
            }
            var4_int = param3.length();
            param3.setLength(param2);
            var5 = var4_int;
            L2: while (true) {
              if (param2 <= var5) {
                stackIn_7_0 = (StringBuilder) (param3);
                break L0;
              } else {
                param3.setCharAt(var5, param1);
                var5++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var4);

            stackIn_10_1 = new StringBuilder().append("w.I(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
        return stackIn_7_0;
    }

    public static void g(int param0) {
        field_C = null;
        field_B = null;
        field_D = null;
        field_A = null;
        if (param0 != 2) {
            return;
        }
        field_y = null;
        field_E = null;
    }

    static {
        field_E = "Public chat is unavailable while setting up a rated game.";
        field_B = "Lives lost:";
        field_D = "Fullscreen mode was cancelled after a delay of 10 seconds. If you were unable to accept fullscreen mode during this time, there may be a problem with your configuration. You could try restarting your browser and trying again.";
        field_A = "Username: ";
        field_y = "Find opponents";
    }
}
