/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wra extends rqa {
    static int field_p;
    static String field_o;

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
                wra.a(85);
                break L1;
              }
            }
            stackIn_3_0 = new nc(frb.a(169, 94));
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("wra.A(");

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

    wra(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    public static void a(int param0) {
        if (param0 != 0) {
            field_o = (String) null;
        }
        field_o = null;
    }

    final static of a(ts[] param0, byte param1, qfa param2) {
        Object stackIn_25_0 = null;
        of stackIn_27_0 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        StringBuilder stackIn_33_1 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        long var3_long = 0L;
        RuntimeException var3 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        byte[] var11 = null;
        var6 = VoidHunters.field_G;
        try {
          L0: {
            var3_int = 0;
            L1: while (true) {
              if (param0.length <= var3_int) {
                L2: {
                  if (param1 == 107) {
                    break L2;
                  } else {
                    wra.a(-108);
                    break L2;
                  }
                }
                var3_long = jaggl.OpenGL.glCreateProgramObjectARB();
                var5 = 0;
                L3: while (true) {
                  if (var5 >= param0.length) {
                    L4: {
                      jaggl.OpenGL.glLinkProgramARB(var3_long);
                      jaggl.OpenGL.glGetObjectParameterivARB(var3_long, 35714, grb.field_j, 0);
                      if (0 != grb.field_j[0]) {
                        break L4;
                      } else {
                        L5: {
                          if (0 != grb.field_j[0]) {
                            break L5;
                          } else {
                            System.out.println("Shader linking failed:");
                            break L5;
                          }
                        }
                        L6: {
                          jaggl.OpenGL.glGetObjectParameterivARB(var3_long, 35716, grb.field_j, 1);
                          if (1 < grb.field_j[1]) {
                            var11 = new byte[grb.field_j[1]];
                            jaggl.OpenGL.glGetInfoLogARB(var3_long, grb.field_j[1], grb.field_j, 0, var11, 0);
                            System.out.println(new String(var11));
                            break L6;
                          } else {
                            break L6;
                          }
                        }
                        if (grb.field_j[0] != 0) {
                          break L4;
                        } else {
                          var7 = 0;
                          var5 = var7;
                          L7: while (true) {
                            if (var7 >= param0.length) {
                              jaggl.OpenGL.glDeleteObjectARB(var3_long);
                              stackIn_25_0 = null;
                              decompiledRegionSelector0 = 0;
                              break L0;
                            } else {
                              jaggl.OpenGL.glDetachObjectARB(var3_long, param0[var7].field_c);
                              var7++;
                              continue L7;
                            }
                          }
                        }
                      }
                    }
                    stackIn_27_0 = new of(param2, var3_long, param0);
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    jaggl.OpenGL.glAttachObjectARB(var3_long, param0[var5].field_c);
                    var5++;
                    continue L3;
                  }
                }
              } else {
                if (null != param0[var3_int]) {
                  if (-1L > (param0[var3_int].field_c ^ -1L)) {
                    var3_int++;
                    continue L1;
                  } else {
                    return null;
                  }
                } else {
                  return null;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var3 = decompiledCaughtException;
            stackIn_30_0 = (RuntimeException) (var3);

            stackIn_30_1 = new StringBuilder().append("wra.C(");

            if (param0 == null) {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "null";
              break L8;
            } else {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "{...}";
              break L8;
            }
          }
          L9: {


            stackIn_33_1 = ((StringBuilder) (Object) stackIn_31_1).append(stackIn_31_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "null";
              break L9;
            } else {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "{...}";
              break L9;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_31_0), stackIn_34_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (of) ((Object) stackIn_25_0);
        } else {
          return stackIn_27_0;
        }
    }

    static {
        field_p = 20;
        field_o = "Double Assault";
    }
}
