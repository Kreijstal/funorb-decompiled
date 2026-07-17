/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tr {
    static st field_a;

    final static void a(s param0, int param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        var5 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            var2_int = 0;
            L1: while (true) {
              if (var2_int >= 3) {
                L2: {
                  if (param1 <= -85) {
                    break L2;
                  } else {
                    field_a = null;
                    break L2;
                  }
                }
                var2_int = 0;
                L3: while (true) {
                  if (var2_int >= dd.field_a) {
                    int dupTemp$4 = param0.a(0);
                    aa.field_c[dupTemp$4] = aa.field_c[dupTemp$4] + 1;
                    var2_int = 0;
                    var3 = 0;
                    L4: while (true) {
                      if (dd.field_a <= var3) {
                        dd.field_a = var2_int;
                        int fieldTemp$5 = dd.field_a;
                        dd.field_a = dd.field_a + 1;
                        ve.field_b[fieldTemp$5] = param0;
                        break L0;
                      } else {
                        L5: {
                          L6: {
                            if (ve.field_b[var3].field_f == param0.field_f) {
                              var4 = ve.field_b[var3].a(0);
                              if (gq.field_a < aa.field_c[var4]) {
                                aa.field_c[var4] = aa.field_c[var4] - 1;
                                break L5;
                              } else {
                                break L6;
                              }
                            } else {
                              break L6;
                            }
                          }
                          int incrementValue$6 = var2_int;
                          var2_int++;
                          ve.field_b[incrementValue$6] = ve.field_b[var3];
                          break L5;
                        }
                        var3++;
                        continue L4;
                      }
                    }
                  } else {
                    L7: {
                      if (param0.field_f != ve.field_b[var2_int].field_f) {
                        break L7;
                      } else {
                        int dupTemp$7 = ve.field_b[var2_int].a(0);
                        aa.field_c[dupTemp$7] = aa.field_c[dupTemp$7] + 1;
                        break L7;
                      }
                    }
                    var2_int++;
                    continue L3;
                  }
                }
              } else {
                aa.field_c[var2_int] = 0;
                var2_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var2 = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) var2;
            stackOut_22_1 = new StringBuilder().append("tr.B(");
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param0 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L8;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L8;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + 44 + param1 + 41);
        }
    }

    public static void a(int param0) {
        if (param0 > -67) {
            tr.a(118);
        }
        field_a = null;
    }

    final static void a(gk param0, byte param1) {
        ll var2 = new ll(param0.a("final_frame.jpg", (byte) -71, ""), (java.awt.Component) (Object) ci.field_f);
        int var3 = var2.field_r;
        int var4 = var2.field_n;
        qk.a((byte) -92);
        gl.field_d = new ll(var3, 3 * var4 / 4);
        gl.field_d.b();
        var2.c(0, 0);
        gt.field_o = new ll(var3, var4 - gl.field_d.field_n);
        gt.field_o.b();
        var2.c(0, -gl.field_d.field_n);
        gt.field_o.field_p = gl.field_d.field_n;
        try {
            sl.c(2765);
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) (Object) runtimeException, "tr.C(" + (param0 != null ? "{...}" : "null") + 44 + -88 + 41);
        }
    }

    final static void a(rb param0, int param1, int param2, int param3, int param4) {
        RuntimeException runtimeException = null;
        Object var6 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              param0.b(-1336879960, 12);
              param0.a(17, 23385);
              param0.a(param3, 23385);
              param0.a(param2, 23385);
              param0.b(-1336879960, param1);
              if (param4 == 0) {
                break L1;
              } else {
                var6 = null;
                tr.a((rb) null, 50, -109, 117, 45);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("tr.D(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new st();
    }
}
