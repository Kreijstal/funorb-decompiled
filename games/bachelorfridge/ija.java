/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ija extends td {
    static String field_p;

    final ii a(op param0, int param1) {
        aga var3 = null;
        RuntimeException var3_ref = null;
        aga var4 = null;
        rb var5 = null;
        gs var6 = null;
        ew stackIn_4_0 = null;
        rb stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var3 = this.field_h.a(91, param0);
              var4 = this.field_j.a(param1 ^ 35, param0);
              if (var4 == null) {
                break L1;
              } else {
                if (!var4.i(-127)) {
                  L2: {
                    var5 = new rb(this.field_g, new nq(var3), this.field_j);
                    if (param1 == 3) {
                      break L2;
                    } else {
                      var6 = (gs) null;
                      ija.a((byte) -120, (gs) null);
                      break L2;
                    }
                  }
                  var5.field_o.a(new iv(new nq(var4), false, 1, 0, 39), true);
                  stackIn_8_0 = (rb) (var5);
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            stackIn_4_0 = new ew(new nq(var3));
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var3_ref);

            stackIn_11_1 = new StringBuilder().append("ija.A(");

            if (param0 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L3;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L3;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (ii) ((Object) stackIn_4_0);
        } else {
          return (ii) ((Object) stackIn_8_0);
        }
    }

    ija(int param0, aga param1, nq param2) {
        super(param0, param1);
        try {
            this.field_j = param2;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "ija.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(byte param0, gs param1) {
        int dupTemp$0 = 0;
        int fieldTemp$1 = 0;
        int incrementValue$2 = 0;
        int dupTemp$3 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = BachelorFridge.field_y;
        try {
          L0: {
            var2_int = 0;
            L1: while (true) {
              if ((var2_int ^ -1) <= -4) {
                var2_int = 0;
                L2: while (true) {
                  if (var2_int >= qs.field_n) {
                    dupTemp$0 = param1.a((byte) 124);
                    oma.field_a[dupTemp$0] = oma.field_a[dupTemp$0] + 1;
                    var2_int = 0;
                    var3 = 0;
                    L3: while (true) {
                      if (qs.field_n <= var3) {
                        var3 = 16 / ((-12 - param0) / 59);
                        qs.field_n = var2_int;
                        fieldTemp$1 = qs.field_n;
                        qs.field_n = qs.field_n + 1;
                        kw.field_k[fieldTemp$1] = param1;
                        break L0;
                      } else {
                        L4: {
                          L5: {
                            if (kw.field_k[var3].field_p == param1.field_p) {
                              var4 = kw.field_k[var3].a((byte) 119);
                              if (oma.field_a[var4] > on.field_t) {
                                oma.field_a[var4] = oma.field_a[var4] - 1;
                                break L4;
                              } else {
                                break L5;
                              }
                            } else {
                              break L5;
                            }
                          }
                          incrementValue$2 = var2_int;
                          var2_int++;
                          kw.field_k[incrementValue$2] = kw.field_k[var3];
                          break L4;
                        }
                        var3++;
                        continue L3;
                      }
                    }
                  } else {
                    L6: {
                      if (param1.field_p == kw.field_k[var2_int].field_p) {
                        dupTemp$3 = kw.field_k[var2_int].a((byte) 124);
                        oma.field_a[dupTemp$3] = oma.field_a[dupTemp$3] + 1;
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    var2_int++;
                    continue L2;
                  }
                }
              } else {
                oma.field_a[var2_int] = 0;
                var2_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var2 = decompiledCaughtException;
            stackIn_23_0 = (RuntimeException) (var2);

            stackIn_23_1 = new StringBuilder().append("ija.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L7;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L7;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ')');
        }
    }

    public static void b(int param0) {
        field_p = null;
        if (param0 != -4) {
            field_p = (String) null;
        }
    }

    static {
        field_p = "Email address is unavailable";
    }
}
