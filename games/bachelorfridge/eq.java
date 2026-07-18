/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eq {
    static kv[] field_b;
    String[] field_a;
    String field_g;
    static String field_i;
    static String field_f;
    boolean field_h;
    int field_d;
    static int[] field_c;
    boolean field_e;

    public static void a(int param0) {
        field_f = null;
        field_c = null;
        field_b = null;
        field_i = null;
    }

    final static void a(kv param0, gj param1, byte param2) {
        RuntimeException var3 = null;
        int var3_int = 0;
        ad[] var4_ref_ad__ = null;
        int var4 = 0;
        int var5 = 0;
        ad var6 = null;
        int var7 = 0;
        Object var8 = null;
        int stackIn_6_0 = 0;
        String stackIn_9_0 = null;
        int stackIn_29_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_31_0 = 0;
        int[] stackIn_31_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_39_2 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        String stackIn_42_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        Object stackOut_8_0 = null;
        String stackOut_7_0 = null;
        int stackOut_28_0 = 0;
        int stackOut_30_0 = 0;
        int[] stackOut_30_1 = null;
        int stackOut_29_0 = 0;
        int[] stackOut_29_1 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        String stackOut_38_2 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        String stackOut_37_2 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        String stackOut_41_2 = null;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        String stackOut_40_2 = null;
        var7 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              pu.field_j = param1;
              rga.field_a = pu.field_j.field_G;
              if (param2 == -111) {
                break L1;
              } else {
                var8 = null;
                eq.a((kv) null, (gj) null, (byte) 68);
                break L1;
              }
            }
            L2: {
              var3_int = pu.field_j.field_h.field_b;
              if (var3_int != pu.field_j.field_n) {
                stackOut_5_0 = 0;
                stackIn_6_0 = stackOut_5_0;
                break L2;
              } else {
                stackOut_4_0 = 1;
                stackIn_6_0 = stackOut_4_0;
                break L2;
              }
            }
            L3: {
              li.field_m = stackIn_6_0 != 0;
              if (var3_int < 0) {
                stackOut_8_0 = null;
                stackIn_9_0 = (String) (Object) stackOut_8_0;
                break L3;
              } else {
                stackOut_7_0 = pu.field_j.field_h.field_y[pu.field_j.field_h.field_b];
                stackIn_9_0 = stackOut_7_0;
                break L3;
              }
            }
            L4: {
              dd.field_G = stackIn_9_0;
              vj.field_m = param0;
              if (null != rga.field_a) {
                var4_ref_ad__ = rga.field_a;
                var5 = 0;
                L5: while (true) {
                  if (var4_ref_ad__.length <= var5) {
                    L6: {
                      raa.field_F = 0;
                      var4 = 0;
                      if (rga.field_a.length <= var4) {
                        break L6;
                      } else {
                        L7: {
                          if (rga.field_a[var4] == null) {
                            var4++;
                            break L7;
                          } else {
                            raa.field_F = raa.field_F + 1;
                            var4++;
                            break L7;
                          }
                        }
                        var4++;
                        var4++;
                        break L6;
                      }
                    }
                    hia.c((byte) -117);
                    break L4;
                  } else {
                    L8: {
                      var6 = var4_ref_ad__[var5];
                      if (var6 != null) {
                        var6.b(false);
                        var5++;
                        break L8;
                      } else {
                        var5++;
                        var5++;
                        break L8;
                      }
                    }
                    var5++;
                    continue L5;
                  }
                }
              } else {
                raa.field_F = 0;
                break L4;
              }
            }
            L9: {
              stackOut_28_0 = 1;
              stackIn_30_0 = stackOut_28_0;
              stackIn_29_0 = stackOut_28_0;
              if (1 != pu.field_j.field_h.field_o) {
                stackOut_30_0 = stackIn_30_0;
                stackOut_30_1 = ina.field_o;
                stackIn_31_0 = stackOut_30_0;
                stackIn_31_1 = stackOut_30_1;
                break L9;
              } else {
                stackOut_29_0 = stackIn_29_0;
                stackOut_29_1 = wj.field_l;
                stackIn_31_0 = stackOut_29_0;
                stackIn_31_1 = stackOut_29_1;
                break L9;
              }
            }
            L10: {
              hi.a(stackIn_31_0 != 0, stackIn_31_1);
              if (li.field_m) {
                pka.a(mu.field_d, false, (byte) 73);
                break L10;
              } else {
                pka.a(nu.field_h, false, (byte) 73);
                break L10;
              }
            }
            wj.field_g = false;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var3 = decompiledCaughtException;
            stackOut_36_0 = (RuntimeException) var3;
            stackOut_36_1 = new StringBuilder().append("eq.A(");
            stackIn_38_0 = stackOut_36_0;
            stackIn_38_1 = stackOut_36_1;
            stackIn_37_0 = stackOut_36_0;
            stackIn_37_1 = stackOut_36_1;
            if (param0 == null) {
              stackOut_38_0 = (RuntimeException) (Object) stackIn_38_0;
              stackOut_38_1 = (StringBuilder) (Object) stackIn_38_1;
              stackOut_38_2 = "null";
              stackIn_39_0 = stackOut_38_0;
              stackIn_39_1 = stackOut_38_1;
              stackIn_39_2 = stackOut_38_2;
              break L11;
            } else {
              stackOut_37_0 = (RuntimeException) (Object) stackIn_37_0;
              stackOut_37_1 = (StringBuilder) (Object) stackIn_37_1;
              stackOut_37_2 = "{...}";
              stackIn_39_0 = stackOut_37_0;
              stackIn_39_1 = stackOut_37_1;
              stackIn_39_2 = stackOut_37_2;
              break L11;
            }
          }
          L12: {
            stackOut_39_0 = (RuntimeException) (Object) stackIn_39_0;
            stackOut_39_1 = ((StringBuilder) (Object) stackIn_39_1).append(stackIn_39_2).append(',');
            stackIn_41_0 = stackOut_39_0;
            stackIn_41_1 = stackOut_39_1;
            stackIn_40_0 = stackOut_39_0;
            stackIn_40_1 = stackOut_39_1;
            if (param1 == null) {
              stackOut_41_0 = (RuntimeException) (Object) stackIn_41_0;
              stackOut_41_1 = (StringBuilder) (Object) stackIn_41_1;
              stackOut_41_2 = "null";
              stackIn_42_0 = stackOut_41_0;
              stackIn_42_1 = stackOut_41_1;
              stackIn_42_2 = stackOut_41_2;
              break L12;
            } else {
              stackOut_40_0 = (RuntimeException) (Object) stackIn_40_0;
              stackOut_40_1 = (StringBuilder) (Object) stackIn_40_1;
              stackOut_40_2 = "{...}";
              stackIn_42_0 = stackOut_40_0;
              stackIn_42_1 = stackOut_40_1;
              stackIn_42_2 = stackOut_40_2;
              break L12;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_42_0, stackIn_42_2 + ',' + param2 + ')');
        }
    }

    eq(boolean param0) {
        ((eq) this).field_e = param0 ? true : false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = "Change display name";
        field_f = "You need to choose a name before you can log in. This is the name that will be displayed to other players.";
        field_c = new int[]{75, 165, 244, 324, 403};
    }
}
