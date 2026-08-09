/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wda extends rqa {
    static String field_r;
    static int field_q;
    static int field_p;
    static int field_s;
    static kba field_o;

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
            hb.a((String) (param0[0].field_b), 32);
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

            stackIn_7_1 = new StringBuilder().append("wda.A(");

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

    final static void a(rsb param0, int param1, lta param2, byte param3, lbb param4) {
        bba[] var6 = null;
        int var7 = 0;
        bba var8 = null;
        wm[] var9 = null;
        rna[] var10 = null;
        int var11 = 0;
        int var12 = 0;
        una var13 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var12 = VoidHunters.field_G;
        try {
          L0: {
            if (param3 <= 0) {
              L1: {
                chb.a(0);
                var13 = param0.field_g.e(0);
                if (var13 != null) {
                  var6 = var13.b(1);
                  if (var6 != null) {
                    var7 = 0;
                    L2: while (true) {
                      if (var7 >= var6.length) {
                        break L1;
                      } else {
                        L3: {
                          var8 = var6[var7];
                          var9 = var8.a((byte) -126);
                          var10 = var8.c((byte) -42);
                          if (var9 == null) {
                            break L3;
                          } else {
                            if (var10 == null) {
                              break L3;
                            } else {
                              var11 = ada.a(param0, param4, false, var10);
                              if ((var11 ^ -1) > -1) {
                                break L3;
                              } else {
                                if (var11 >= glb.field_c.length) {
                                  break L3;
                                } else {
                                  aba.a(param4, var9, param2, var11, (byte) 51, param1, param0);
                                  break L3;
                                }
                              }
                            }
                          }
                        }
                        var7++;
                        continue L2;
                      }
                    }
                  } else {
                    break L1;
                  }
                } else {
                  break L1;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackIn_18_0 = (RuntimeException) (var5);

            stackIn_18_1 = new StringBuilder().append("wda.B(");

            if (param0 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L4;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_21_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L5;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_24_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L6;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L6;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_19_0), stackIn_25_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public static void e(byte param0) {
        if (param0 >= -16) {
            field_r = (String) null;
        }
        field_o = null;
        field_r = null;
    }

    wda(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
        field_r = "As a team, reach a total size of 100 components to win";
        field_p = 80;
        field_s = 0;
        field_q = 5;
        field_o = new kba();
    }
}
