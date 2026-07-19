/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eb {
    static he[] field_c;
    static String[] field_d;
    static int[] field_b;
    static he[] field_a;
    static byte[][] field_f;
    static nh[] field_e;
    static nh field_g;

    public static void a(int param0) {
        field_f = (byte[][]) null;
        field_a = null;
        field_c = null;
        if (param0 != 5) {
            String var2 = (String) null;
            eb.a((String) null, false, true, -94);
        }
        field_d = null;
        field_b = null;
        field_g = null;
        field_e = null;
    }

    final static void a(String param0, boolean param1, boolean param2, int param3) {
        cf.a((byte) -107);
        ng.field_c.j(300);
        pi.field_O = new wa(qf.field_c, (String) null, sg.field_a, param1, param2);
        fb.field_e = new el(ng.field_c, pi.field_O);
        if (param3 != 10) {
            return;
        }
        try {
            ng.field_c.a((byte) -125, (vg) (fb.field_e));
        } catch (RuntimeException runtimeException) {
            throw ie.a((Throwable) ((Object) runtimeException), "eb.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static void a(byte param0) {
        nl var3 = null;
        int var2 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        if (param0 != 20) {
            return;
        }
        try {
            var3 = (nl) ((Object) dl.field_M.h(param0 ^ -11163));
            while (var3 != null) {
                rc.a(5, var3, -11659);
                var3 = (nl) ((Object) dl.field_M.e(0));
            }
            vi.field_c = ck.a(0, 5, 1, true);
        } catch (RuntimeException runtimeException) {
            throw ie.a((Throwable) ((Object) runtimeException), "eb.B(" + param0 + ')');
        }
    }

    final static boolean a(od param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int stackIn_2_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            var2_int = param0.l(31760);
            if (param1 >= 6) {
              L1: {
                if ((var2_int ^ -1) != -2) {
                  stackOut_5_0 = 0;
                  stackIn_6_0 = stackOut_5_0;
                  break L1;
                } else {
                  stackOut_4_0 = 1;
                  stackIn_6_0 = stackOut_4_0;
                  break L1;
                }
              }
              var3 = stackIn_6_0;
              stackOut_6_0 = var3;
              stackIn_7_0 = stackOut_6_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = 1;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) (var2);
            stackOut_8_1 = new StringBuilder().append("eb.C(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          throw ie.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_7_0 != 0;
        }
    }

    final static fl[] a(bl param0, boolean param1) {
        RuntimeException var2 = null;
        int[] var3 = null;
        fl[] var4 = null;
        int var5 = 0;
        fl var6 = null;
        int var7 = 0;
        il var8 = null;
        int[] var9 = null;
        int[] var10 = null;
        fl[] stackIn_3_0 = null;
        fl[] stackIn_7_0 = null;
        fl[] stackIn_14_0 = null;
        fl[] stackIn_19_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        fl[] stackOut_6_0 = null;
        fl[] stackOut_13_0 = null;
        fl[] stackOut_18_0 = null;
        fl[] stackOut_2_0 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        var7 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            if (param1) {
              if (!param0.a(-20)) {
                stackOut_6_0 = new fl[]{};
                stackIn_7_0 = stackOut_6_0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                var8 = param0.a((byte) -107);
                L1: while (true) {
                  if (var8.field_b != 0) {
                    if ((var8.field_b ^ -1) == -3) {
                      stackOut_13_0 = new fl[]{};
                      stackIn_14_0 = stackOut_13_0;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    } else {
                      var10 = (int[]) (var8.field_g);
                      var9 = var10;
                      var3 = var9;
                      var4 = new fl[var10.length >> 1061568130];
                      var5 = 0;
                      L2: while (true) {
                        if (var5 >= var4.length) {
                          stackOut_18_0 = (fl[]) (var4);
                          stackIn_19_0 = stackOut_18_0;
                          decompiledRegionSelector0 = 3;
                          break L0;
                        } else {
                          var6 = new fl();
                          var4[var5] = var6;
                          var6.field_g = var3[var5 << 698699138];
                          var6.field_h = var3[(var5 << -86045406) - -1];
                          var6.field_b = var3[2 + (var5 << 484328738)];
                          var6.field_c = var3[(var5 << 793747810) - -3];
                          var5++;
                          continue L2;
                        }
                      }
                    }
                  } else {
                    kk.a(10L, true);
                    continue L1;
                  }
                }
              }
            } else {
              stackOut_2_0 = (fl[]) null;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) (var2);
            stackOut_20_1 = new StringBuilder().append("eb.A(");
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param0 == null) {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L3;
            } else {
              stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L3;
            }
          }
          throw ie.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_14_0;
            } else {
              return stackIn_19_0;
            }
          }
        }
    }

    static {
        field_d = new String[]{"Connecting to update server", "Verbinde mit Aktualisierungsserver", "Connexion au serveur de mise à jour", "Conectando ao servidor de atualização", "Met updateserver verbinden", "Connecting to update server (untranslated)"};
        field_f = new byte[250][];
        field_e = new nh[9];
    }
}
