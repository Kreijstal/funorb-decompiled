/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nia extends rqa {
    static int field_p;
    static boolean field_o;

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        nc stackIn_2_0 = null;
        nc stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            si.a(150, 62, param0[0].a(127));
            if (param1 <= -119) {
              stackIn_4_0 = new nc("void");
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (nc) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var3);

            stackIn_7_1 = new StringBuilder().append("nia.A(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    final static uca a(int param0, kda param1, faa param2, byte param3) {
        uca stackIn_3_0 = null;
        int stackIn_9_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_25_0 = 0;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        StringBuilder stackIn_37_1 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_38_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] var4 = null;
        RuntimeException var4_ref = null;
        faa var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        String[] var9 = null;
        int var10 = 0;
        int var11_int = 0;
        uca var11 = null;
        int var12 = 0;
        int var13 = 0;
        byte[] var14 = null;
        byte[] var15 = null;
        byte[] var16 = null;
        var13 = VoidHunters.field_G;
        try {
          L0: {
            if (param3 >= 96) {
              var16 = param1.b(param2, 1000);
              var15 = var16;
              var14 = var15;
              var4 = var14;
              if (var14 != null) {
                L1: {
                  var5 = wl.a(9, var16);
                  var6 = var5.e((byte) -95);
                  var7 = var5.h(23);
                  if (var5.e((byte) -101) == 0) {
                    stackIn_9_0 = 0;
                    break L1;
                  } else {
                    stackIn_9_0 = 1;
                    break L1;
                  }
                }
                var8 = stackIn_9_0;
                var9 = new String[var5.e((byte) -105)];
                var11_int = 0;
                L2: while (true) {
                  if (var9.length <= var11_int) {
                    L3: {
                      var10 = -2;
                      var10 = var5.d((byte) -114);
                      if (-1 == var10) {
                        var10 = -2;
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    L4: {
                      var11 = new uca(true, var9, var10, var8 != 0, var6, var7, false);
                      if (-2 != (var5.e((byte) -116) ^ -1)) {
                        stackIn_25_0 = 0;
                        break L4;
                      } else {
                        stackIn_25_0 = 1;
                        break L4;
                      }
                    }
                    L5: {
                      var12 = stackIn_25_0;
                      if (var12 != 0) {
                        var5.p(-23497);
                        var11.field_m.a(-62, var5);
                        var5.f((byte) -81);
                        param1.a(0, idb.field_o, var11.field_m.field_l);
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    var11.field_m.field_j = param1.a(true, -13027);
                    if (!param1.b((byte) 85)) {
                      return var11;
                    } else {
                      return null;
                    }
                  } else {
                    L6: {
                      if (-2 != (var5.e((byte) -114) ^ -1)) {
                        stackIn_14_0 = 0;
                        break L6;
                      } else {
                        stackIn_14_0 = 1;
                        break L6;
                      }
                    }
                    L7: {
                      var12 = stackIn_14_0;
                      if (var12 != 0) {
                        var9[var11_int] = var5.g(-1609246200);
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                    var11_int++;
                    continue L2;
                  }
                }
              } else {
                return null;
              }
            } else {
              stackIn_3_0 = (uca) null;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var4_ref = decompiledCaughtException;
            stackIn_34_0 = (RuntimeException) (var4_ref);

            stackIn_34_1 = new StringBuilder().append("nia.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_35_0 = (RuntimeException) ((Object) stackIn_34_0);
              stackIn_35_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackIn_35_2 = "null";
              break L8;
            } else {
              stackIn_35_0 = (RuntimeException) ((Object) stackIn_34_0);
              stackIn_35_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackIn_35_2 = "{...}";
              break L8;
            }
          }
          L9: {


            stackIn_37_1 = ((StringBuilder) (Object) stackIn_35_1).append(stackIn_35_2).append(',');

            if (param2 == null) {
              stackIn_35_0 = (RuntimeException) ((Object) stackIn_35_0);
              stackIn_38_1 = (StringBuilder) ((Object) stackIn_37_1);
              stackIn_38_2 = "null";
              break L9;
            } else {
              stackIn_35_0 = (RuntimeException) ((Object) stackIn_35_0);
              stackIn_38_1 = (StringBuilder) ((Object) stackIn_37_1);
              stackIn_38_2 = "{...}";
              break L9;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_35_0), stackIn_38_2 + ',' + param3 + ')');
        }
        return stackIn_3_0;
    }

    final static byte[] a(byte[] param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        byte[] var3 = null;
        byte[] stackIn_2_0 = null;
        byte[] stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 <= -95) {
              var2_int = param0.length;
              var3 = new byte[var2_int];
              cua.a(param0, 0, var3, 0, var2_int);
              stackIn_4_0 = (byte[]) (var3);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (byte[]) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var2);

            stackIn_7_1 = new StringBuilder().append("nia.B(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    nia(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
    }
}
