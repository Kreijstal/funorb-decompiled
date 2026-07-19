/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gn {
    static String field_b;
    static String field_c;
    static String field_a;

    final static int a(int param0, byte[] param1, boolean param2) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
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
              if (param2) {
                break L1;
              } else {
                gn.a(4);
                break L1;
              }
            }
            stackOut_2_0 = qn.a(-1648911295, 0, param0, param1);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var3);
            stackOut_4_1 = new StringBuilder().append("gn.D(").append(param0).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
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
          throw lj.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param2 + ')');
        }
        return stackIn_3_0;
    }

    final static ea[] a(int param0, int param1, int param2, boolean param3) {
        int discarded$0 = 0;
        if (param3) {
            byte[] var5 = (byte[]) null;
            discarded$0 = gn.a(-10, (byte[]) null, false);
        }
        return lc.a(param2, 1, param1, param0, (byte) 127);
    }

    final static vk[] a(int param0, vf param1) {
        RuntimeException var2 = null;
        int[] var3 = null;
        vk[] var4 = null;
        int var5 = 0;
        vk var6 = null;
        int var7 = 0;
        ia var8 = null;
        int[] var9 = null;
        int[] var10 = null;
        vk[] stackIn_4_0 = null;
        vk[] stackIn_12_0 = null;
        vk[] stackIn_17_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        vk[] stackOut_3_0 = null;
        vk[] stackOut_11_0 = null;
        vk[] stackOut_16_0 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        var7 = MinerDisturbance.field_ab;
        try {
          L0: {
            if (!param1.b((byte) 104)) {
              stackOut_3_0 = new vk[]{};
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                var8 = param1.a((byte) -114);
                if (param0 == -591) {
                  break L1;
                } else {
                  field_b = (String) null;
                  break L1;
                }
              }
              L2: while (true) {
                if (-1 != (var8.field_c ^ -1)) {
                  if ((var8.field_c ^ -1) == -3) {
                    stackOut_11_0 = new vk[]{};
                    stackIn_12_0 = stackOut_11_0;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    var10 = (int[]) (var8.field_a);
                    var9 = var10;
                    var3 = var9;
                    var4 = new vk[var10.length >> 989840002];
                    var5 = 0;
                    L3: while (true) {
                      if (var5 >= var4.length) {
                        stackOut_16_0 = (vk[]) (var4);
                        stackIn_17_0 = stackOut_16_0;
                        decompiledRegionSelector0 = 2;
                        break L0;
                      } else {
                        var6 = new vk();
                        var4[var5] = var6;
                        var6.field_f = var3[var5 << 1451436130];
                        var6.field_c = var3[(var5 << -1048749150) - -1];
                        var6.field_h = var3[2 + (var5 << -418419230)];
                        var6.field_b = var3[(var5 << 1024740450) - -3];
                        var5++;
                        continue L3;
                      }
                    }
                  }
                } else {
                  gf.a(10L, param0 + -9718);
                  continue L2;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) (var2);
            stackOut_18_1 = new StringBuilder().append("gn.C(").append(param0).append(',');
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param1 == null) {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L4;
            } else {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L4;
            }
          }
          throw lj.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_12_0;
          } else {
            return stackIn_17_0;
          }
        }
    }

    public static void a(int param0) {
        field_b = null;
        field_c = null;
        field_a = null;
        if (param0 != 28808) {
            bj var2 = (bj) null;
            gn.a((bj) null, (byte) 33);
        }
    }

    final static void a(bj param0, byte param1) {
        b var3 = null;
        ji discarded$0 = null;
        try {
            int var2_int = 86 % ((param1 - -42) / 57);
            b.a(param0.a("", 0, "headers.packvorbis"));
            var3 = b.a(param0, "jagex logo2.packvorbis", "");
            discarded$0 = var3.a();
        } catch (RuntimeException runtimeException) {
            throw lj.a((Throwable) ((Object) runtimeException), "gn.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        field_b = "Ranking: Worm Chow";
        field_c = "Unfortunately you are not eligible to create an account.";
        field_a = "Volcano";
    }
}
