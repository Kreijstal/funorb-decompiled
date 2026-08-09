/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tr {
    static st field_a;

    final static void a(s param0, int param1) {
        int dupTemp$0 = 0;
        int fieldTemp$1 = 0;
        int incrementValue$2 = 0;
        int dupTemp$3 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
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
                    field_a = (st) null;
                    break L2;
                  }
                }
                var2_int = 0;
                L3: while (true) {
                  if (var2_int >= dd.field_a) {
                    dupTemp$0 = param0.a(0);
                    aa.field_c[dupTemp$0] = aa.field_c[dupTemp$0] + 1;
                    var2_int = 0;
                    var3 = 0;
                    L4: while (true) {
                      if (dd.field_a <= var3) {
                        dd.field_a = var2_int;
                        fieldTemp$1 = dd.field_a;
                        dd.field_a = dd.field_a + 1;
                        ve.field_b[fieldTemp$1] = param0;
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
                          incrementValue$2 = var2_int;
                          var2_int++;
                          ve.field_b[incrementValue$2] = ve.field_b[var3];
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
                        dupTemp$3 = ve.field_b[var2_int].a(0);
                        aa.field_c[dupTemp$3] = aa.field_c[dupTemp$3] + 1;
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
            stackIn_24_0 = (RuntimeException) (var2);

            stackIn_24_1 = new StringBuilder().append("tr.B(");

            if (param0 == null) {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L8;
            } else {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L8;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ',' + param1 + ')');
        }
    }

    public static void a(int param0) {
        if (param0 > -67) {
            tr.a(118);
        }
        field_a = null;
    }

    final static void a(gk param0, byte param1) {
        ll var2 = new ll(param0.a("final_frame.jpg", (byte) -71, ""), (java.awt.Component) ((Object) ci.field_f));
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
        if (param1 > -64) {
            return;
        }
        try {
            sl.c(2765);
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) ((Object) runtimeException), "tr.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void a(rb param0, int param1, int param2, int param3, int param4) {
        RuntimeException runtimeException = null;
        rb var6 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
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
                var6 = (rb) null;
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
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("tr.D(");

            if (param0 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L2;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    static {
        field_a = new st();
    }
}
