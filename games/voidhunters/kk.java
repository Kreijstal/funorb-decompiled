/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kk extends rqa {
    static oe field_o;
    static String field_p;

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
            oaa.field_i = param0[0].a(8);
            if (param1 < -119) {
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

            stackIn_7_1 = new StringBuilder().append("kk.A(");

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

    final static ij a(ij param0, ij param1, int param2, dja param3, int param4) {
        Object stackIn_3_0 = null;
        ij stackIn_27_0 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        StringBuilder stackIn_33_1 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        StringBuilder stackIn_36_1 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_37_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6_int = 0;
        tv var6 = null;
        int var7 = 0;
        tv var8 = null;
        int var9 = 0;
        tv var10 = null;
        tv var11 = null;
        int var12 = 0;
        var12 = VoidHunters.field_G;
        try {
          L0: {
            if (param1 != null) {
              L1: {
                if (param0 == null) {
                  param0 = new ij();
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                var5_int = param1.c(3) + -param0.c(3);
                if ((var5_int ^ -1) < -1) {
                  var6_int = 0;
                  L3: while (true) {
                    if (var5_int <= var6_int) {
                      break L2;
                    } else {
                      param0.b(-10258, (ksa) ((Object) param3.a((byte) 6)));
                      var6_int++;
                      continue L3;
                    }
                  }
                } else {
                  if ((var5_int ^ -1) > -1) {
                    var5_int = -var5_int;
                    var6_int = 0;
                    L4: while (true) {
                      if (var6_int >= var5_int) {
                        break L2;
                      } else {
                        param0.c((byte) -104);
                        var6_int++;
                        continue L4;
                      }
                    }
                  } else {
                    break L2;
                  }
                }
              }
              var6 = (tv) ((Object) param0.d(0));
              var7 = 80 / ((param4 - -6) / 48);
              var8 = (tv) ((Object) param1.d(0));
              L5: while (true) {
                if (var8 == null) {
                  stackIn_27_0 = (ij) (param0);
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  L6: {
                    var9 = param2;
                    var10 = var8;
                    var11 = var6;
                    if (-2 != (var9 ^ -1)) {
                      if (-3 == (var9 ^ -1)) {
                        ((tva) ((Object) var10)).a(var11, 29106);
                        break L6;
                      } else {
                        if (var9 == 3) {
                          ((sjb) ((Object) var10)).a(var11, (byte) 39);
                          break L6;
                        } else {
                          var6 = (tv) ((Object) param0.a((byte) 94));
                          var8 = (tv) ((Object) param1.a((byte) 116));
                          continue L5;
                        }
                      }
                    } else {
                      var10.b((byte) 105, var11);
                      break L6;
                    }
                  }
                  var6 = (tv) ((Object) param0.a((byte) 94));
                  var8 = (tv) ((Object) param1.a((byte) 116));
                  continue L5;
                }
              }
            } else {
              stackIn_3_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var5 = decompiledCaughtException;
            stackIn_30_0 = (RuntimeException) (var5);

            stackIn_30_1 = new StringBuilder().append("kk.B(");

            if (param0 == null) {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "null";
              break L7;
            } else {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "{...}";
              break L7;
            }
          }
          L8: {


            stackIn_33_1 = ((StringBuilder) (Object) stackIn_31_1).append(stackIn_31_2).append(',');

            if (param1 == null) {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "null";
              break L8;
            } else {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "{...}";
              break L8;
            }
          }
          L9: {


            stackIn_36_1 = ((StringBuilder) (Object) stackIn_34_1).append(stackIn_34_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_37_1 = (StringBuilder) ((Object) stackIn_36_1);
              stackIn_37_2 = "null";
              break L9;
            } else {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_37_1 = (StringBuilder) ((Object) stackIn_36_1);
              stackIn_37_2 = "{...}";
              break L9;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_31_0), stackIn_37_2 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (ij) ((Object) stackIn_3_0);
        } else {
          return stackIn_27_0;
        }
    }

    public static void e(byte param0) {
        field_o = null;
        field_p = null;
        if (param0 <= 94) {
            dja var2 = (dja) null;
            kk.a((ij) null, (ij) null, 83, (dja) null, 17);
        }
    }

    kk(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
        field_p = "Fighters";
        field_o = new oe();
    }
}
