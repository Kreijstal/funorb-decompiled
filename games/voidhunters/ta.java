/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ta {
    static dja field_a;
    static int[] field_b;

    final static void a(byte param0, int param1) {
        wp.field_a = maa.field_o;
        if (param0 > -101) {
            ta.a((byte) -35);
            pw.field_a = param1;
            return;
        }
        pw.field_a = param1;
    }

    public static void a(byte param0) {
        field_a = null;
        field_b = null;
        if (param0 != -109) {
            field_b = (int[]) null;
        }
    }

    final static void a(int[] param0, int param1, wfb param2) {
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        var20 = VoidHunters.field_G;
        try {
          L0: {
            if (param1 > 113) {
              var3_int = 0;
              L1: while (true) {
                if (var3_int >= param0.length) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  L2: {
                    L3: {
                      var4 = param0[var3_int];
                      var5 = param0[1 + var3_int];
                      var6 = param0[(2 + var3_int) % param0.length];
                      var7 = param0[(var3_int - -3) % param0.length];
                      var8 = (var6 + var4) / 2;
                      var9 = (var5 - -var7) / 2;
                      var10 = var6 - var4;
                      var11 = -var5 + var7;
                      var12 = var11;
                      var13 = -var10;
                      var14 = ecb.a(var13, (byte) -77, var12);
                      var15 = 1;
                      if (param2.field_b != 0) {
                        break L3;
                      } else {
                        if (-1 != (param2.field_i ^ -1)) {
                          break L3;
                        } else {
                          break L2;
                        }
                      }
                    }
                    var16 = param2.field_b - var8;
                    var17 = param2.field_i - var9;
                    var18 = ar.a(var16, (byte) 119, var17);
                    var19 = ar.a(var10, (byte) 117, var11);
                    if (var18 >= var19 >> 1754395553) {
                      break L2;
                    } else {
                      var15 = 0;
                      break L2;
                    }
                  }
                  L4: {
                    if (var15 != 0) {
                      param2.a(-124, new lsb(var8, var9, var14));
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  var3_int += 2;
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
          L5: {
            var3 = decompiledCaughtException;
            stackIn_18_0 = (RuntimeException) (var3);

            stackIn_18_1 = new StringBuilder().append("ta.C(");

            if (param0 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L5;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_21_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L6;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L6;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_19_0), stackIn_22_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    static {
        field_a = (dja) ((Object) new lka());
        field_b = new int[256];
    }
}
