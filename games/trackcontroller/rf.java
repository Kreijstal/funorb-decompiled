/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rf {
    static int field_c;
    static int[] field_a;
    static int field_b;
    static String field_d;
    static fj field_e;

    public static void a(int param0) {
        ji[] discarded$0 = null;
        field_a = null;
        field_d = null;
        field_e = null;
        if (param0 != 0) {
            uf var2 = (uf) null;
            discarded$0 = rf.a((uf) null, false);
        }
    }

    final static void a(int param0, int param1) {
        RuntimeException var2 = null;
        int var3 = 0;
        aj var4 = null;
        ti var5 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = TrackController.field_F ? 1 : 0;
        try {
          L0: {
            var4 = (aj) ((Object) ub.field_e.b(param1 + 2));
            L1: while (true) {
              if (var4 == null) {
                L2: {
                  if (param1 == 0) {
                    break L2;
                  } else {
                    field_d = (String) null;
                    break L2;
                  }
                }
                var5 = (ti) ((Object) ea.field_s.b(2));
                L3: while (true) {
                  if (var5 == null) {
                    break L0;
                  } else {
                    mc.a(false, param0, var5);
                    var5 = (ti) ((Object) ea.field_s.a(10));
                    continue L3;
                  }
                }
              } else {
                we.a(param0, var4, (byte) -47);
                var4 = (aj) ((Object) ub.field_e.a(10));
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw sl.a((Throwable) ((Object) var2), "rf.E(" + param0 + ',' + param1 + ')');
        }
    }

    final static boolean b(int param0) {
        int var1 = 0;
        var1 = 70 / ((param0 - 57) / 63);
        if (null != tk.field_u) {
          if (!tk.field_u.a(32130)) {
            return false;
          } else {
            return true;
          }
        } else {
          return false;
        }
    }

    final static void a(boolean param0) {
        r.field_j = -1;
        if (!param0) {
            return;
        }
        nl.field_f = null;
        cd.field_j = false;
        aj.field_m = -1;
        vl.field_H = 0;
    }

    final static ji[] a(uf param0, boolean param1) {
        ji[] discarded$1 = null;
        RuntimeException var2 = null;
        int[] var3 = null;
        ji[] var4 = null;
        int var5 = 0;
        ji var6 = null;
        int var7 = 0;
        uf var8 = null;
        ce var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        ji[] stackIn_4_0 = null;
        ji[] stackIn_10_0 = null;
        ji[] stackIn_17_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        ji[] stackOut_3_0 = null;
        ji[] stackOut_16_0 = null;
        ji[] stackOut_9_0 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        var7 = TrackController.field_F ? 1 : 0;
        try {
          L0: {
            if (!param0.b(-4)) {
              stackOut_3_0 = new ji[]{};
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              var9 = param0.a(75);
              L1: while (true) {
                if (-1 != (var9.field_f ^ -1)) {
                  if (var9.field_f != 2) {
                    L2: {
                      var11 = (int[]) (var9.field_e);
                      var10 = var11;
                      var3 = var10;
                      var4 = new ji[var11.length >> -403853758];
                      if (!param1) {
                        break L2;
                      } else {
                        var8 = (uf) null;
                        discarded$1 = rf.a((uf) null, false);
                        break L2;
                      }
                    }
                    var5 = 0;
                    L3: while (true) {
                      if (var4.length <= var5) {
                        stackOut_16_0 = (ji[]) (var4);
                        stackIn_17_0 = stackOut_16_0;
                        decompiledRegionSelector0 = 2;
                        break L0;
                      } else {
                        var6 = new ji();
                        var4[var5] = var6;
                        var6.field_f = var3[var5 << -1420101182];
                        var6.field_c = var3[(var5 << 1047566082) - -1];
                        var6.field_b = var3[2 + (var5 << -451239390)];
                        var6.field_g = var3[(var5 << -1482664574) + 3];
                        var5++;
                        continue L3;
                      }
                    }
                  } else {
                    stackOut_9_0 = new ji[]{};
                    stackIn_10_0 = stackOut_9_0;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                } else {
                  wl.a(10L, false);
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) (var2);
            stackOut_18_1 = new StringBuilder().append("rf.A(");
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param0 == null) {
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
          throw sl.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_10_0;
          } else {
            return stackIn_17_0;
          }
        }
    }

    static {
        field_d = "Password: ";
        field_a = new int[1024];
    }
}
