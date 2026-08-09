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
        if (param0 != 0) {
          field_c = (int[]) null;
          field_c = null;
          field_b = null;
          field_i = null;
          return;
        } else {
          field_c = null;
          field_b = null;
          field_i = null;
          return;
        }
    }

    final static void a(kv param0, gj param1, byte param2) {
        int stackIn_6_0 = 0;
        String stackIn_9_0 = null;
        int stackIn_27_0 = 0;
        int stackIn_28_0 = 0;
        int[] stackIn_28_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_36_2 = null;
        StringBuilder stackIn_38_1 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_39_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        ad[] var4_ref_ad__ = null;
        int var4 = 0;
        int var5 = 0;
        ad var6 = null;
        int var7 = 0;
        gj var8 = null;
        var7 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              pu.field_j = param1;
              rga.field_a = pu.field_j.field_G;
              if (param2 == -111) {
                break L1;
              } else {
                var8 = (gj) null;
                eq.a((kv) null, (gj) null, (byte) 68);
                break L1;
              }
            }
            L2: {
              var3_int = pu.field_j.field_h.field_b;
              if (var3_int != pu.field_j.field_n) {
                stackIn_6_0 = 0;
                break L2;
              } else {
                stackIn_6_0 = 1;
                break L2;
              }
            }
            L3: {
              li.field_m = stackIn_6_0 != 0;
              if (-1 < (var3_int ^ -1)) {
                stackIn_9_0 = null;
                break L3;
              } else {
                stackIn_9_0 = pu.field_j.field_h.field_y[pu.field_j.field_h.field_b];
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
                    raa.field_F = 0;
                    var4 = 0;
                    L6: while (true) {
                      if (rga.field_a.length <= var4) {
                        hia.c((byte) -117);
                        break L4;
                      } else {
                        L7: {
                          if (rga.field_a[var4] == null) {
                            break L7;
                          } else {
                            raa.field_F = raa.field_F + 1;
                            break L7;
                          }
                        }
                        var4++;
                        continue L6;
                      }
                    }
                  } else {
                    L8: {
                      var6 = var4_ref_ad__[var5];
                      if (var6 != null) {
                        var6.b(false);
                        break L8;
                      } else {
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
              stackIn_27_0 = 1;

              if (1 != pu.field_j.field_h.field_o) {
                stackIn_28_0 = stackIn_27_0;
                stackIn_28_1 = ina.field_o;
                break L9;
              } else {
                stackIn_28_0 = stackIn_27_0;
                stackIn_28_1 = wj.field_l;
                break L9;
              }
            }
            L10: {
              hi.a(stackIn_28_0 != 0, stackIn_28_1);
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
            stackIn_35_0 = (RuntimeException) (var3);

            stackIn_35_1 = new StringBuilder().append("eq.A(");

            if (param0 == null) {
              stackIn_36_0 = (RuntimeException) ((Object) stackIn_35_0);
              stackIn_36_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackIn_36_2 = "null";
              break L11;
            } else {
              stackIn_36_0 = (RuntimeException) ((Object) stackIn_35_0);
              stackIn_36_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackIn_36_2 = "{...}";
              break L11;
            }
          }
          L12: {


            stackIn_38_1 = ((StringBuilder) (Object) stackIn_36_1).append(stackIn_36_2).append(',');

            if (param1 == null) {
              stackIn_36_0 = (RuntimeException) ((Object) stackIn_36_0);
              stackIn_39_1 = (StringBuilder) ((Object) stackIn_38_1);
              stackIn_39_2 = "null";
              break L12;
            } else {
              stackIn_36_0 = (RuntimeException) ((Object) stackIn_36_0);
              stackIn_39_1 = (StringBuilder) ((Object) stackIn_38_1);
              stackIn_39_2 = "{...}";
              break L12;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_36_0), stackIn_39_2 + ',' + param2 + ')');
        }
    }

    eq(boolean param0) {
        this.field_e = param0 ? true : false;
    }

    static {
        field_i = "Change display name";
        field_f = "You need to choose a name before you can log in. This is the name that will be displayed to other players.";
        field_c = new int[]{75, 165, 244, 324, 403};
    }
}
