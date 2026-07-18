/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cf extends wf {
    int field_g;
    int field_h;

    final static ti a(byte param0) {
        int[] var1 = null;
        ti var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_6_1 = 0;
        int stackIn_12_0 = 0;
        int stackIn_12_1 = 0;
        int stackIn_14_0 = 0;
        ti stackIn_15_0 = null;
        ti stackIn_16_0 = null;
        ti stackIn_17_0 = null;
        ti stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        ti stackIn_19_0 = null;
        int stackOut_2_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_5_1 = 0;
        int stackOut_11_0 = 0;
        int stackOut_11_1 = 0;
        int stackOut_13_0 = 0;
        ti stackOut_14_0 = null;
        ti stackOut_15_0 = null;
        ti stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        ti stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        ti stackOut_18_0 = null;
        var9 = Transmogrify.field_A ? 1 : 0;
        var1 = new int[]{5872575, 5872575, 5872319, 5806782, 5806782, 5806526, 5806526, 5740989, 5740989, 5740733, 5740733, 5675196, 5674940, 5674940, 5674939, 5609147, 5609147, 5609147, 5543354, 5543354, 5543354, 5477561, 5477561, 5477561, 5411768, 5411768, 5411768, 5411768, 5345975, 5345975, 5345975, 5280182, 5280182, 5280182, 5214389, 5214389, 5214133, 5214133, 5148596, 5148340, 5148340, 5148340, 5082547, 5082547, 5082291, 5082291, 5016754, 5016498, 5016498, 5016498, 4950705, 4950705, 4950705, 4884912, 4884912, 4884912, 4819119, 4819119, 4819119, 4819119, 4753326, 4753326, 4753326, 4687533, 4687533, 4687533, 4621740, 4621740, 4621740, 4621484, 4555947, 4555947, 4555691, 4555691, 4490154, 4489898, 4489898, 4489898, 4424361, 4424105, 4424105, 4424105, 4358312, 4358312, 4358312, 4292519, 4292519, 4292519, 4226726, 4226726, 4226726, 4160933, 4160933, 4160933, 4160933, 4095140, 4095140, 4095140, 4029347, 4029347, 4029091, 4029091, 3963554, 3963298, 3963298, 3963298, 3897505, 3897505, 3897249, 3897249, 3831712, 3831456, 3831456, 3831456, 3765663, 3765663, 3765663, 3699870, 3699870, 3699870, 3634077, 3634077, 3634077, 3568284, 3568284, 3568284, 3568284, 3502491, 3502491, 3502491, 3436698, 3436698, 3436698, 3436442, 3370905, 3370905, 3370649, 3370649, 3305112, 3304856, 3304856, 3304856, 3239063, 3239063, 3239063, 3239063, 3173270, 3173270, 3173270, 3107477, 3107477, 3107477, 3041684, 3041684, 3041684, 2975891, 2975891, 2975891, 2910098, 2910098, 2910098, 2909842, 2844305, 2844305, 2844049, 2844049, 2778512, 2778256, 2778256, 2778000, 2712463, 2712463, 2712207, 2712207, 2646670, 2646414, 2646414, 2646414, 2580621, 2580621, 2580621, 2514828, 2514828, 2514828, 2449035, 2449035, 2449035, 2383242, 2383242, 2383242, 2317449, 2317449, 2317449, 2317449, 2251656, 2251656, 2251656, 2251400, 2185863, 2185863, 2185607, 2185607, 2120070, 2119814, 2119814, 2119814, 2054021, 2054021, 2054021, 1988228, 1988228, 1988228, 1988228, 1922435, 1922435, 1922435, 1856642, 1856642, 1856642, 1790849, 1790849, 1790849, 1725056, 1725056, 1725056, 1724800, 1659263, 1659263, 1659007, 1659007, 1593214, 1593214, 1593214, 1592958, 1527421, 1527421, 1527165, 1527165, 1461372, 1461372, 1461372, 1395579, 1395579, 1395579, 1395579, 1329786, 1329786, 1329786, 1263993, 1263993, 1263993, 1198200, 1198200, 1198200, 1132407, 1132407, 1132407, 1132151, 1066614, 1066614, 1066614, 1066358, 1000821, 1000821, 1000565, 1000565, 935028, 934772, 934772, 934772, 868979, 868979, 868979, 803186, 803186, 803186, 737393, 737393, 737137, 737137, 671600, 671344, 671344, 605807, 605551, 605551, 539758, 539758, 539758, 539502, 473965, 473965, 473709, 473709, 408172, 408172, 407916, 407916, 342379, 342123, 342123, 342123, 276330, 276330, 276330, 276330, 210537, 210537, 210537, 210537, 144744, 144744, 144744, 144744, 78951, 78951, 78951, 78950, 13158, 13158};
        var2 = new ti(640, 480);
        var2.e();
        var3 = 0;
        var4 = 637762;
        var5 = 0;
        L0: while (true) {
          L1: {
            L2: {
              if (var5 >= 480) {
                break L2;
              } else {
                var6 = var4;
                stackOut_2_0 = 0;
                stackIn_14_0 = stackOut_2_0;
                stackIn_3_0 = stackOut_2_0;
                if (var9 != 0) {
                  break L1;
                } else {
                  var7 = stackIn_3_0;
                  L3: while (true) {
                    L4: {
                      L5: {
                        if (var7 >= 640) {
                          break L5;
                        } else {
                          var8 = (int)(Math.sqrt((double)var6) / 2.0);
                          stackOut_5_0 = var1.length;
                          stackOut_5_1 = var8;
                          stackIn_12_0 = stackOut_5_0;
                          stackIn_12_1 = stackOut_5_1;
                          stackIn_6_0 = stackOut_5_0;
                          stackIn_6_1 = stackOut_5_1;
                          if (var9 != 0) {
                            break L4;
                          } else {
                            L6: {
                              if (stackIn_6_0 <= stackIn_6_1) {
                                var8 = -1 + var1.length;
                                break L6;
                              } else {
                                break L6;
                              }
                            }
                            int incrementValue$1 = var3;
                            var3++;
                            sb.field_h[incrementValue$1] = var1[var8];
                            var6 = 1 + var6 - (-(var7 * 8) + 2556);
                            var7++;
                            if (var9 == 0) {
                              continue L3;
                            } else {
                              break L5;
                            }
                          }
                        }
                      }
                      stackOut_11_0 = -1915 + 8 * var5;
                      stackOut_11_1 = var4;
                      stackIn_12_0 = stackOut_11_0;
                      stackIn_12_1 = stackOut_11_1;
                      break L4;
                    }
                    var4 = stackIn_12_0 + stackIn_12_1;
                    var5++;
                    if (var9 == 0) {
                      continue L0;
                    } else {
                      break L2;
                    }
                  }
                }
              }
            }
            var6 = 90 / ((param0 - -67) / 50);
            sb.d(0, 0, 640, 480, 65793);
            stackOut_13_0 = 1;
            stackIn_14_0 = stackOut_13_0;
            break L1;
          }
          L7: {
            sb.d(stackIn_14_0, 1, 638, 478, 16711422);
            stackOut_14_0 = (ti) var2;
            stackIn_19_0 = stackOut_14_0;
            stackIn_15_0 = stackOut_14_0;
            if (!fa.field_b) {
              break L7;
            } else {
              L8: {
                stackOut_15_0 = (ti) (Object) stackIn_15_0;
                stackIn_17_0 = stackOut_15_0;
                stackIn_16_0 = stackOut_15_0;
                if (var9 == 0) {
                  stackOut_17_0 = (ti) (Object) stackIn_17_0;
                  stackOut_17_1 = 1;
                  stackIn_18_0 = stackOut_17_0;
                  stackIn_18_1 = stackOut_17_1;
                  break L8;
                } else {
                  stackOut_16_0 = (ti) (Object) stackIn_16_0;
                  stackOut_16_1 = 0;
                  stackIn_18_0 = stackOut_16_0;
                  stackIn_18_1 = stackOut_16_1;
                  break L8;
                }
              }
              Transmogrify.field_A = stackIn_18_1 != 0;
              stackOut_18_0 = (ti) (Object) stackIn_18_0;
              stackIn_19_0 = stackOut_18_0;
              break L7;
            }
          }
          return stackIn_19_0;
        }
    }

    final static boolean d(int param0) {
        RuntimeException var1 = null;
        int stackIn_7_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_4_0 = 0;
        try {
          L0: {
            L1: {
              if (param0 == 4819119) {
                break L1;
              } else {
                byte[] discarded$2 = cf.a((Object) null, true, (byte) 13);
                break L1;
              }
            }
            L2: {
              if (db.field_a != of.field_d) {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                break L2;
              } else {
                stackOut_4_0 = 1;
                stackIn_7_0 = stackOut_4_0;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ch.a((Throwable) (Object) var1, "cf.D(" + param0 + ')');
        }
        return stackIn_7_0 != 0;
    }

    final static void a(int param0, int param1) {
        try {
            vj.field_a = id.field_a[param1];
            dj.field_c = je.field_b[param1];
            od.field_h = ei.field_a[param1];
            if (param0 != 1856642) {
                cf.a(96, -117);
            }
        } catch (RuntimeException runtimeException) {
            throw ch.a((Throwable) (Object) runtimeException, "cf.E(" + param0 + ',' + param1 + ')');
        }
    }

    final static void a(ci param0, ci param1, ci param2, boolean param3, byte param4) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        try {
          L0: {
            dl.field_l = bh.a(-70, "");
            if (param4 >= 93) {
              dl.field_l.a(false, false);
              aj.a(param0, param1, param2, 2394342);
              eg.a(81);
              db.field_a = jh.field_n;
              rh.field_v = jh.field_n;
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) runtimeException;
            stackOut_4_1 = new StringBuilder().append("cf.A(");
            stackIn_7_0 = stackOut_4_0;
            stackIn_7_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_8_0 = stackOut_5_0;
              stackIn_8_1 = stackOut_5_1;
              stackIn_8_2 = stackOut_5_2;
              break L1;
            }
          }
          L2: {
            stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',');
            stackIn_11_0 = stackOut_8_0;
            stackIn_11_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_12_0 = stackOut_9_0;
              stackIn_12_1 = stackOut_9_1;
              stackIn_12_2 = stackOut_9_2;
              break L2;
            }
          }
          L3: {
            stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
            stackOut_12_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',');
            stackIn_15_0 = stackOut_12_0;
            stackIn_15_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param2 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L3;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_16_0 = stackOut_13_0;
              stackIn_16_1 = stackOut_13_1;
              stackIn_16_2 = stackOut_13_2;
              break L3;
            }
          }
          throw ch.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static byte[] a(Object param0, boolean param1, byte param2) {
        byte[] var3 = null;
        dj var3_ref = null;
        RuntimeException var3_ref2 = null;
        Object stackIn_4_0 = null;
        Object stackIn_7_0 = null;
        byte[] stackIn_11_0 = null;
        byte[] stackIn_13_0 = null;
        byte[] stackIn_16_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_3_0 = null;
        byte[] stackOut_15_0 = null;
        byte[] stackOut_12_0 = null;
        byte[] stackOut_10_0 = null;
        Object stackOut_6_0 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        try {
          if (null == param0) {
            stackOut_3_0 = null;
            stackIn_4_0 = stackOut_3_0;
            return (byte[]) (Object) stackIn_4_0;
          } else {
            if (param2 == 16) {
              if (!(param0 instanceof byte[])) {
                if (!(param0 instanceof dj)) {
                  throw new IllegalArgumentException();
                } else {
                  var3_ref = (dj) param0;
                  stackOut_15_0 = var3_ref.a(false);
                  stackIn_16_0 = stackOut_15_0;
                  return stackIn_16_0;
                }
              } else {
                var3 = (byte[]) param0;
                if (!param1) {
                  stackOut_12_0 = (byte[]) var3;
                  stackIn_13_0 = stackOut_12_0;
                  return stackIn_13_0;
                } else {
                  stackOut_10_0 = pi.a((byte) -29, var3);
                  stackIn_11_0 = stackOut_10_0;
                  return stackIn_11_0;
                }
              }
            } else {
              stackOut_6_0 = null;
              stackIn_7_0 = stackOut_6_0;
              return (byte[]) (Object) stackIn_7_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L0: {
            var3_ref2 = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) var3_ref2;
            stackOut_18_1 = new StringBuilder().append("cf.C(");
            stackIn_21_0 = stackOut_18_0;
            stackIn_21_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param0 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L0;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_22_0 = stackOut_19_0;
              stackIn_22_1 = stackOut_19_1;
              stackIn_22_2 = stackOut_19_2;
              break L0;
            }
          }
          throw ch.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private cf() throws Throwable {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          throw new Error();
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ch.a((Throwable) (Object) var1, "cf.<init>()");
        }
    }

    static {
    }
}
