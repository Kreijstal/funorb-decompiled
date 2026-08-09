/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mo {
    private jc field_b;
    int field_d;
    static int[] field_c;
    static w field_a;

    final static io a(int param0, jc param1, vj[] param2) {
        Object stackIn_24_0 = null;
        io stackIn_26_0 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        StringBuilder stackIn_32_1 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        long var3_long = 0L;
        RuntimeException var3 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        byte[] var11 = null;
        var6 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            var3_int = 0;
            L1: while (true) {
              if (var3_int >= param2.length) {
                var3_long = jaggl.OpenGL.glCreateProgramObjectARB();
                var5 = 0;
                L2: while (true) {
                  if (param2.length <= var5) {
                    L3: {
                      jaggl.OpenGL.glLinkProgramARB(var3_long);
                      jaggl.OpenGL.glGetObjectParameterivARB(var3_long, 35714, ee.field_d, 0);
                      if (ee.field_d[param0] == 0) {
                        L4: {
                          if (ee.field_d[0] == 0) {
                            System.out.println("Shader linking failed:");
                            break L4;
                          } else {
                            break L4;
                          }
                        }
                        L5: {
                          jaggl.OpenGL.glGetObjectParameterivARB(var3_long, 35716, ee.field_d, 1);
                          if (1 >= ee.field_d[1]) {
                            break L5;
                          } else {
                            var11 = new byte[ee.field_d[1]];
                            jaggl.OpenGL.glGetInfoLogARB(var3_long, ee.field_d[1], ee.field_d, 0, var11, 0);
                            System.out.println(new String(var11));
                            break L5;
                          }
                        }
                        if (-1 != (ee.field_d[0] ^ -1)) {
                          break L3;
                        } else {
                          var7 = 0;
                          var5 = var7;
                          L6: while (true) {
                            if (var7 >= param2.length) {
                              jaggl.OpenGL.glDeleteObjectARB(var3_long);
                              stackIn_24_0 = null;
                              decompiledRegionSelector0 = 0;
                              break L0;
                            } else {
                              jaggl.OpenGL.glDetachObjectARB(var3_long, param2[var7].field_c);
                              var7++;
                              continue L6;
                            }
                          }
                        }
                      } else {
                        break L3;
                      }
                    }
                    stackIn_26_0 = new io(param1, var3_long, param2);
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    jaggl.OpenGL.glAttachObjectARB(var3_long, param2[var5].field_c);
                    var5++;
                    continue L2;
                  }
                }
              } else {
                if (null != param2[var3_int]) {
                  if (param2[var3_int].field_c > 0L) {
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
          L7: {
            var3 = decompiledCaughtException;
            stackIn_29_0 = (RuntimeException) (var3);

            stackIn_29_1 = new StringBuilder().append("mo.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_30_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "null";
              break L7;
            } else {
              stackIn_30_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "{...}";
              break L7;
            }
          }
          L8: {


            stackIn_32_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_30_2).append(',');

            if (param2 == null) {
              stackIn_30_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "null";
              break L8;
            } else {
              stackIn_30_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "{...}";
              break L8;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_30_0), stackIn_33_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (io) ((Object) stackIn_24_0);
        } else {
          return stackIn_26_0;
        }
    }

    final static void a(int param0) {
        if (!ks.field_b) {
            throw new IllegalStateException();
        }
        nq.field_a = true;
        ep.a(false, param0 ^ param0);
        ob.field_d = 0;
    }

    public static void b(int param0) {
        field_a = null;
        field_c = null;
        int var1 = -16 / ((param0 - -33) / 39);
    }

    mo(jc param0, int param1, int param2) {
        try {
            this.field_d = param2;
            this.field_b = param0;
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) ((Object) runtimeException), "mo.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    protected final void finalize() throws Throwable {
        this.field_b.c(110, this.field_d);
        super.finalize();
    }

    static {
        field_a = new w();
    }
}
