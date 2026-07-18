/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gl extends jl {
    static String field_r;
    private int field_v;
    static String field_s;
    private String[] field_u;
    private int field_q;
    private String[] field_t;

    final static void a(byte param0, java.applet.Applet param1) {
        try {
            Throwable var2 = null;
            RuntimeException var2_ref = null;
            String var3 = null;
            java.net.URL var4 = null;
            RuntimeException stackIn_5_0 = null;
            StringBuilder stackIn_5_1 = null;
            RuntimeException stackIn_6_0 = null;
            StringBuilder stackIn_6_1 = null;
            RuntimeException stackIn_7_0 = null;
            StringBuilder stackIn_7_1 = null;
            String stackIn_7_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_4_0 = null;
            StringBuilder stackOut_4_1 = null;
            RuntimeException stackOut_6_0 = null;
            StringBuilder stackOut_6_1 = null;
            String stackOut_6_2 = null;
            RuntimeException stackOut_5_0 = null;
            StringBuilder stackOut_5_1 = null;
            String stackOut_5_2 = null;
            try {
              L0: {
                try {
                  L1: {
                    var4 = param1.getCodeBase();
                    var3 = sh.a((byte) 104, param1, var4).getFile();
                    Object discarded$6 = sd.a((byte) 119, param1, new Object[2], "updatelinks");
                    Object discarded$7 = sd.a((byte) 107, param1, new Object[2], "updatelinks");
                    Object discarded$8 = sd.a((byte) 112, param1, new Object[2], "updatelinks");
                    Object discarded$9 = sd.a((byte) 110, param1, new Object[2], "updatelinks");
                    Object discarded$10 = sd.a((byte) 104, param1, new Object[2], "updatelinks");
                    Object discarded$11 = sd.a((byte) 123, param1, new Object[2], "updatelinks");
                    break L1;
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L2: {
                    var2 = decompiledCaughtException;
                    break L2;
                  }
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L3: {
                var2_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_4_0 = (RuntimeException) var2_ref;
                stackOut_4_1 = new StringBuilder().append("gl.B(").append(15).append(',');
                stackIn_6_0 = stackOut_4_0;
                stackIn_6_1 = stackOut_4_1;
                stackIn_5_0 = stackOut_4_0;
                stackIn_5_1 = stackOut_4_1;
                if (param1 == null) {
                  stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
                  stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
                  stackOut_6_2 = "null";
                  stackIn_7_0 = stackOut_6_0;
                  stackIn_7_1 = stackOut_6_1;
                  stackIn_7_2 = stackOut_6_2;
                  break L3;
                } else {
                  stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
                  stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
                  stackOut_5_2 = "{...}";
                  stackIn_7_0 = stackOut_5_0;
                  stackIn_7_1 = stackOut_5_1;
                  stackIn_7_2 = stackOut_5_2;
                  break L3;
                }
              }
              throw t.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void b() {
        field_s = null;
        field_r = null;
    }

    gl(String param0, String[] param1, String[] param2) {
        super(param0, param1);
        try {
            ((gl) this).field_u = param1;
            ((gl) this).field_t = param2;
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) (Object) runtimeException, "gl.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    private final void d() {
        int var2 = 0;
        int var3 = 640;
        int var4 = ((gl) this).a(((gl) this).field_u, 0);
        int var5 = ((gl) this).a(((gl) this).field_t, 0);
        ((gl) this).field_o = var4 + var5;
        ((gl) this).field_d = (-((gl) this).field_o + var3) / 2 + var4;
    }

    final static k c() {
        if (!(null != vg.field_U)) {
            vg.field_U = new k(ke.field_c, 20, 0, 0, 0, 11579568, -1, 0, 0, ke.field_c.field_r, -1, 2147483647, true);
        }
        return vg.field_U;
    }

    final void a(int param0, int param1, int param2, byte param3, ih param4) {
        super.a(0, param4, param2, -101);
        if (param3 != -92) {
            return;
        }
        try {
            ((gl) this).field_v = param0;
            ((gl) this).field_q = param1;
            int discarded$0 = 38;
            this.d();
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) (Object) runtimeException, "gl.C(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    private final void a(int param0, int param1, int param2, String[] param3, int param4) {
        String[] var6 = null;
        RuntimeException var6_ref = null;
        int var7 = 0;
        String var8 = null;
        int var9 = 0;
        String[] var10 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        var9 = EscapeVector.field_A;
        try {
          L0: {
            if (((gl) this).field_h != null) {
              if (param3 != null) {
                if (0 != param3.length) {
                  var10 = param3;
                  var6 = var10;
                  var7 = 0;
                  L1: while (true) {
                    if (var7 >= var10.length) {
                      break L0;
                    } else {
                      L2: {
                        var8 = var10[var7];
                        if (var8 == null) {
                          break L2;
                        } else {
                          if (var8.length() <= 0) {
                            break L2;
                          } else {
                            L3: {
                              if (0 <= param2) {
                                break L3;
                              } else {
                                ((gl) this).field_h.a(var8, ((gl) this).field_d, param1, param4, -1);
                                break L3;
                              }
                            }
                            if (0 >= param2) {
                              break L2;
                            } else {
                              ((gl) this).field_h.b(var8, ((gl) this).field_d, param1, param4, -1);
                              break L2;
                            }
                          }
                        }
                      }
                      param1 = param1 + ((gl) this).field_f;
                      var7++;
                      continue L1;
                    }
                  }
                } else {
                  return;
                }
              } else {
                return;
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var6_ref = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) var6_ref;
            stackOut_17_1 = new StringBuilder().append("gl.F(").append(-1).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param3 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L4;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L4;
            }
          }
          throw t.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + ',' + param4 + ')');
        }
    }

    final void a(int param0, int param1) {
        if (!(null != ((gl) this).field_h)) {
            return;
        }
        if (param1 != 3) {
            int discarded$0 = 0;
            gl.b();
        }
        int var3 = ((gl) this).field_h.field_r;
        param0 = param0 + var3;
        param0 = param0 + ((gl) this).b(param0, param1 + 13944);
        this.a(-1, param0, 1, ((gl) this).field_u, ((gl) this).field_q);
        this.a(-1, param0, -1, ((gl) this).field_t, ((gl) this).field_v);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_r = "Destroy all the alien infrastructure";
        field_s = "Retribution objectives";
    }
}
