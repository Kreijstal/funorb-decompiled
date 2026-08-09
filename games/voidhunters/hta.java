/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hta extends rqa {
    static int field_o;

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        nc stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 <= -119) {
                break L1;
              } else {
                field_o = -94;
                break L1;
              }
            }
            stackIn_3_0 = new nc(frb.a(70, 121));
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("hta.A(");

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
          throw rta.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    final static int[] a(String param0, boolean param1, boolean param2) {
        byte[] var3 = null;
        RuntimeException var3_ref = null;
        int var4_int = 0;
        int[] var4 = null;
        int[] var5_ref_int__ = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        String var8 = null;
        byte[] var9 = null;
        byte[] var10 = null;
        int[] var11 = null;
        byte[] var12 = null;
        int[] var13 = null;
        Object stackIn_10_0 = null;
        int[] stackIn_18_0 = null;
        int[] stackIn_23_0 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var7 = VoidHunters.field_G;
        try {
          L0: {
            var12 = ps.a(param0, 1);
            var10 = var12;
            var9 = var10;
            var3 = var9;
            if (var9 != null) {
              L1: {
                if (param2) {
                  break L1;
                } else {
                  var8 = (String) null;
                  hta.a((String) null, false, false);
                  break L1;
                }
              }
              if (param1) {
                if ((var12.length ^ -1) <= -2) {
                  var4_int = var12[0];
                  if (var4_int <= tcb.field_p) {
                    var13 = new int[-1 + var12.length];
                    var11 = var13;
                    var5_ref_int__ = var11;
                    var6 = 0;
                    L2: while (true) {
                      if (var6 >= var13.length) {
                        stackIn_18_0 = (int[]) (var5_ref_int__);
                        decompiledRegionSelector0 = 1;
                        break L0;
                      } else {
                        var5_ref_int__[var6] = var9[1 + var6];
                        var6++;
                        continue L2;
                      }
                    }
                  } else {
                    return null;
                  }
                } else {
                  stackIn_10_0 = null;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              } else {
                var4 = new int[var12.length];
                var5 = 0;
                L3: while (true) {
                  if (var5 >= var12.length) {
                    stackIn_23_0 = (int[]) (var4);
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    var4[var5] = var12[var5];
                    var5++;
                    continue L3;
                  }
                }
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackIn_26_0 = (RuntimeException) (var3_ref);

            stackIn_26_1 = new StringBuilder().append("hta.B(");

            if (param0 == null) {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "null";
              break L4;
            } else {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "{...}";
              break L4;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_27_0), stackIn_27_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (int[]) ((Object) stackIn_10_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_18_0;
          } else {
            return stackIn_23_0;
          }
        }
    }

    hta(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
        field_o = 51;
    }
}
