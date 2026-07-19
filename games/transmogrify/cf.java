/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cf extends wf {
    int field_g;
    int field_h;

    final static ti a(byte param0) {
        int incrementValue$2 = 0;
        int[] var1 = null;
        ti var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int[] var10 = null;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_6_1 = 0;
        int stackIn_11_0 = 0;
        int stackIn_11_1 = 0;
        int stackIn_13_0 = 0;
        ti stackIn_14_0 = null;
        ti stackIn_15_0 = null;
        ti stackIn_16_0 = null;
        ti stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        ti stackIn_18_0 = null;
        int stackOut_2_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_5_1 = 0;
        int stackOut_10_0 = 0;
        int stackOut_10_1 = 0;
        int stackOut_12_0 = 0;
        ti stackOut_13_0 = null;
        ti stackOut_14_0 = null;
        ti stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        ti stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        ti stackOut_17_0 = null;
        var9 = Transmogrify.field_A ? 1 : 0;
        var10 = new int[]{5872575, 5872575, 5872319, 5806782, 5806782, 5806526, 5806526, 5740989, 5740989, 5740733, 5740733, 5675196, 5674940, 5674940, 5674939, 5609147, 5609147, 5609147, 5543354, 5543354, 5543354, 5477561, 5477561, 5477561, 5411768, 5411768, 5411768, 5411768, 5345975, 5345975, 5345975, 5280182, 5280182, 5280182, 5214389, 5214389, 5214133, 5214133, 5148596, 5148340, 5148340, 5148340, 5082547, 5082547, 5082291, 5082291, 5016754, 5016498, 5016498, 5016498, 4950705, 4950705, 4950705, 4884912, 4884912, 4884912, 4819119, 4819119, 4819119, 4819119, 4753326, 4753326, 4753326, 4687533, 4687533, 4687533, 4621740, 4621740, 4621740, 4621484, 4555947, 4555947, 4555691, 4555691, 4490154, 4489898, 4489898, 4489898, 4424361, 4424105, 4424105, 4424105, 4358312, 4358312, 4358312, 4292519, 4292519, 4292519, 4226726, 4226726, 4226726, 4160933, 4160933, 4160933, 4160933, 4095140, 4095140, 4095140, 4029347, 4029347, 4029091, 4029091, 3963554, 3963298, 3963298, 3963298, 3897505, 3897505, 3897249, 3897249, 3831712, 3831456, 3831456, 3831456, 3765663, 3765663, 3765663, 3699870, 3699870, 3699870, 3634077, 3634077, 3634077, 3568284, 3568284, 3568284, 3568284, 3502491, 3502491, 3502491, 3436698, 3436698, 3436698, 3436442, 3370905, 3370905, 3370649, 3370649, 3305112, 3304856, 3304856, 3304856, 3239063, 3239063, 3239063, 3239063, 3173270, 3173270, 3173270, 3107477, 3107477, 3107477, 3041684, 3041684, 3041684, 2975891, 2975891, 2975891, 2910098, 2910098, 2910098, 2909842, 2844305, 2844305, 2844049, 2844049, 2778512, 2778256, 2778256, 2778000, 2712463, 2712463, 2712207, 2712207, 2646670, 2646414, 2646414, 2646414, 2580621, 2580621, 2580621, 2514828, 2514828, 2514828, 2449035, 2449035, 2449035, 2383242, 2383242, 2383242, 2317449, 2317449, 2317449, 2317449, 2251656, 2251656, 2251656, 2251400, 2185863, 2185863, 2185607, 2185607, 2120070, 2119814, 2119814, 2119814, 2054021, 2054021, 2054021, 1988228, 1988228, 1988228, 1988228, 1922435, 1922435, 1922435, 1856642, 1856642, 1856642, 1790849, 1790849, 1790849, 1725056, 1725056, 1725056, 1724800, 1659263, 1659263, 1659007, 1659007, 1593214, 1593214, 1593214, 1592958, 1527421, 1527421, 1527165, 1527165, 1461372, 1461372, 1461372, 1395579, 1395579, 1395579, 1395579, 1329786, 1329786, 1329786, 1263993, 1263993, 1263993, 1198200, 1198200, 1198200, 1132407, 1132407, 1132407, 1132151, 1066614, 1066614, 1066614, 1066358, 1000821, 1000821, 1000565, 1000565, 935028, 934772, 934772, 934772, 868979, 868979, 868979, 803186, 803186, 803186, 737393, 737393, 737137, 737137, 671600, 671344, 671344, 605807, 605551, 605551, 539758, 539758, 539758, 539502, 473965, 473965, 473709, 473709, 408172, 408172, 407916, 407916, 342379, 342123, 342123, 342123, 276330, 276330, 276330, 276330, 210537, 210537, 210537, 210537, 144744, 144744, 144744, 144744, 78951, 78951, 78951, 78950, 13158, 13158};
        var1 = var10;
        var2 = new ti(640, 480);
        var2.e();
        var3 = 0;
        var4 = 637762;
        var5 = 0;
        L0: while (true) {
          L1: {
            L2: {
              if (-481 >= (var5 ^ -1)) {
                break L2;
              } else {
                var6 = var4;
                stackOut_2_0 = 0;
                stackIn_13_0 = stackOut_2_0;
                stackIn_3_0 = stackOut_2_0;
                if (var9 != 0) {
                  break L1;
                } else {
                  var7 = stackIn_3_0;
                  L3: while (true) {
                    L4: {
                      L5: {
                        if (-641 >= (var7 ^ -1)) {
                          break L5;
                        } else {
                          var8 = (int)(Math.sqrt((double)var6) / 2.0);
                          stackOut_5_0 = var10.length;
                          stackOut_5_1 = var8;
                          stackIn_11_0 = stackOut_5_0;
                          stackIn_11_1 = stackOut_5_1;
                          stackIn_6_0 = stackOut_5_0;
                          stackIn_6_1 = stackOut_5_1;
                          if (var9 != 0) {
                            break L4;
                          } else {
                            L6: {
                              if (stackIn_6_0 <= stackIn_6_1) {
                                var8 = -1 + var10.length;
                                break L6;
                              } else {
                                break L6;
                              }
                            }
                            incrementValue$2 = var3;
                            var3++;
                            sb.field_h[incrementValue$2] = var10[var8];
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
                      stackOut_10_0 = -1915 + 8 * var5;
                      stackOut_10_1 = var4;
                      stackIn_11_0 = stackOut_10_0;
                      stackIn_11_1 = stackOut_10_1;
                      break L4;
                    }
                    var4 = stackIn_11_0 + stackIn_11_1;
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
            stackOut_12_0 = 1;
            stackIn_13_0 = stackOut_12_0;
            break L1;
          }
          L7: {
            sb.d(stackIn_13_0, 1, 638, 478, 16711422);
            stackOut_13_0 = (ti) (var2);
            stackIn_18_0 = stackOut_13_0;
            stackIn_14_0 = stackOut_13_0;
            if (!fa.field_b) {
              break L7;
            } else {
              L8: {
                stackOut_14_0 = (ti) ((Object) stackIn_14_0);
                stackIn_16_0 = stackOut_14_0;
                stackIn_15_0 = stackOut_14_0;
                if (var9 == 0) {
                  stackOut_16_0 = (ti) ((Object) stackIn_16_0);
                  stackOut_16_1 = 1;
                  stackIn_17_0 = stackOut_16_0;
                  stackIn_17_1 = stackOut_16_1;
                  break L8;
                } else {
                  stackOut_15_0 = (ti) ((Object) stackIn_15_0);
                  stackOut_15_1 = 0;
                  stackIn_17_0 = stackOut_15_0;
                  stackIn_17_1 = stackOut_15_1;
                  break L8;
                }
              }
              Transmogrify.field_A = stackIn_17_1 != 0;
              stackOut_17_0 = (ti) ((Object) stackIn_17_0);
              stackIn_18_0 = stackOut_17_0;
              break L7;
            }
          }
          return stackIn_18_0;
        }
    }

    final static boolean d(int param0) {
        byte[] discarded$10 = null;
        Object var2 = null;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != 4819119) {
          L0: {
            var2 = (Object) null;
            discarded$10 = cf.a((Object) null, true, (byte) 13);
            if (db.field_a != of.field_d) {
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
            if (db.field_a != of.field_d) {
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

    final static void a(int param0, int param1) {
        vj.field_a = id.field_a[param1];
        dj.field_c = je.field_b[param1];
        od.field_h = ei.field_a[param1];
        if (param0 != 1856642) {
            cf.a(96, -117);
        }
    }

    final static void a(ci param0, ci param1, ci param2, boolean param3, byte param4) {
        dl.field_l = bh.a(-70, "");
        if (param4 < 93) {
            return;
        }
        try {
            dl.field_l.a(false, false);
            aj.a(param0, param1, param2, 2394342);
            eg.a(81);
            db.field_a = jh.field_n;
            rh.field_v = jh.field_n;
        } catch (RuntimeException runtimeException) {
            throw ch.a((Throwable) ((Object) runtimeException), "cf.A(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static byte[] a(Object param0, boolean param1, byte param2) {
        byte[] var3 = null;
        RuntimeException var3_ref = null;
        dj var4 = null;
        byte[] stackIn_5_0 = null;
        byte[] stackIn_9_0 = null;
        byte[] stackIn_11_0 = null;
        byte[] stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_13_0 = null;
        byte[] stackOut_10_0 = null;
        byte[] stackOut_8_0 = null;
        byte[] stackOut_4_0 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        try {
          L0: {
            if (param0 != null) {
              if (param2 == 16) {
                if (!(param0 instanceof byte[])) {
                  if (!(param0 instanceof dj)) {
                    throw new IllegalArgumentException();
                  } else {
                    var4 = (dj) (param0);
                    stackOut_13_0 = var4.a(false);
                    stackIn_14_0 = stackOut_13_0;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  }
                } else {
                  var3 = (byte[]) (param0);
                  if (!param1) {
                    stackOut_10_0 = (byte[]) (var3);
                    stackIn_11_0 = stackOut_10_0;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    stackOut_8_0 = pi.a((byte) -29, var3);
                    stackIn_9_0 = stackOut_8_0;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              } else {
                stackOut_4_0 = (byte[]) null;
                stackIn_5_0 = stackOut_4_0;
                decompiledRegionSelector0 = 0;
                break L0;
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) (var3_ref);
            stackOut_16_1 = new StringBuilder().append("cf.C(");
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
              break L1;
            } else {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L1;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_9_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_11_0;
            } else {
              return stackIn_14_0;
            }
          }
        }
    }

    private cf() throws Throwable {
        throw new Error();
    }

    static {
    }
}
