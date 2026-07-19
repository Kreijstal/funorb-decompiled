/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rp {
    static ef field_d;
    static byte[][] field_c;
    static String[] field_b;
    static String field_a;
    static java.security.SecureRandom field_g;
    static String[] field_f;
    static String field_h;
    static int[] field_e;

    final static boolean a(char param0, byte param1) {
        if (Character.isISOControl(param0)) {
          return false;
        } else {
          if (pp.a(-111, param0)) {
            return true;
          } else {
            L0: {
              if (param0 == 45) {
                break L0;
              } else {
                if (param0 == 160) {
                  break L0;
                } else {
                  if (param0 == 32) {
                    break L0;
                  } else {
                    if (param0 == 95) {
                      break L0;
                    } else {
                      if (param1 < -102) {
                        return false;
                      } else {
                        field_f = (String[]) null;
                        return false;
                      }
                    }
                  }
                }
              }
            }
            return true;
          }
        }
    }

    final static void a(int param0, int param1, byte param2, int param3, int param4, int[][] param5, int param6) {
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        var8 = DungeonAssault.field_K;
        try {
          L0: {
            jh.a(jh.field_l);
            if (param2 == 108) {
              var7_int = 0;
              L1: while (true) {
                if (var7_int >= param5.length / param0 + 1) {
                  jh.b();
                  var7_int = 0;
                  L2: while (true) {
                    if (var7_int >= param5.length) {
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      te.a(-1 + param3, param6 + -1, 2 + param1, param5[var7_int]);
                      te.b(-1 + param3, param6, param4, param5[var7_int]);
                      te.a(param3 - 1, param6 + param4, 2 + param1, param5[var7_int]);
                      te.b(param1 + param3, param6, param4, param5[var7_int]);
                      var7_int = var7_int + param0;
                      param6--;
                      param4 += 2;
                      param3--;
                      param1 += 2;
                      continue L2;
                    }
                  }
                } else {
                  gf.b(-1 + (-var7_int + param3), param6 - (1 - -var7_int), param1 - -(2 * var7_int) - -2, 59416);
                  gf.c(param3 + (-var7_int - 1), param6 - var7_int, param4 + var7_int * 2, 15204376);
                  gf.b(-1 + (param3 + -var7_int), param4 + (param6 + var7_int), 2 + (param1 - -(var7_int * 2)), 6168);
                  gf.c(var7_int + param3 + param1, -var7_int + param6, 2 * var7_int + param4, 1572888);
                  var7_int++;
                  continue L1;
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var7 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) (var7);
            stackOut_10_1 = new StringBuilder().append("rp.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param5 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          throw vk.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static void a(byte param0) {
        byte[] discarded$0 = null;
        if (!(null == a.field_n)) {
            a.field_n.j((byte) 73);
        }
        if (param0 > -33) {
            String var2 = (String) null;
            discarded$0 = rp.a((String) null, -9);
        }
        pj.field_c = new gk();
        ta.field_a.b(1, pj.field_c);
    }

    final static boolean a(int param0, int param1) {
        boolean discarded$2 = false;
        int stackIn_9_0 = 0;
        int stackIn_15_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_8_0 = 0;
        L0: {
          if (param0 == 15204376) {
            break L0;
          } else {
            discarded$2 = rp.a(-31, -32);
            break L0;
          }
        }
        L1: {
          if (4 == param1) {
            break L1;
          } else {
            if (3 != param1) {
              if (22 != param1) {
                if (23 == param1) {
                  return of.field_k;
                } else {
                  return true;
                }
              } else {
                L2: {
                  L3: {
                    if (gm.field_d.field_m < ak.field_o[0]) {
                      break L3;
                    } else {
                      if (of.field_k) {
                        break L3;
                      } else {
                        stackOut_13_0 = 1;
                        stackIn_15_0 = stackOut_13_0;
                        break L2;
                      }
                    }
                  }
                  stackOut_14_0 = 0;
                  stackIn_15_0 = stackOut_14_0;
                  break L2;
                }
                return stackIn_15_0 != 0;
              }
            } else {
              break L1;
            }
          }
        }
        L4: {
          L5: {
            if (null == gm.field_d) {
              break L5;
            } else {
              if (gm.field_d.field_K == 0) {
                break L5;
              } else {
                stackOut_7_0 = 1;
                stackIn_9_0 = stackOut_7_0;
                break L4;
              }
            }
          }
          stackOut_8_0 = 0;
          stackIn_9_0 = stackOut_8_0;
          break L4;
        }
        return stackIn_9_0 != 0;
    }

    final static byte[] a(String param0, int param1) {
        RuntimeException var2 = null;
        byte[] stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param1 >= 39) {
                break L1;
              } else {
                rp.a(-93, 97, (byte) -14, 21, 98, (int[][]) null, 14);
                break L1;
              }
            }
            stackOut_2_0 = bb.field_b.a("", param0, (byte) -113);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var2);
            stackOut_4_1 = new StringBuilder().append("rp.E(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw vk.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    public static void b(byte param0) {
        field_g = null;
        field_h = null;
        field_d = null;
        field_f = null;
        if (param0 != -68) {
            rp.a((byte) 9);
        }
        field_c = (byte[][]) null;
        field_a = null;
        field_b = null;
        field_e = null;
    }

    static {
        field_d = new ef();
        field_c = new byte[250][];
        field_b = new String[]{"Gift of the Trees", "Double target <%sneak> in the next room. (Single use)"};
        field_a = "Your <col=FF8000><%0></col> was caught and eaten.";
        field_f = new String[]{"Revive", "Return a killed raider to your stable. (Single use)"};
        field_h = "Members' Benefits";
        field_e = new int[4];
    }
}
