/*
 * Decompiled by CFR-JS 0.4.0.
 */
class qk extends vd {
    static String field_z;
    static bi[] field_y;
    private int field_w;
    String field_u;
    static String field_v;
    static int field_x;

    final void a(byte param0, String param1) {
        try {
            if (param0 >= -81) {
                this.field_w = 9;
            }
            this.field_u = param1;
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) ((Object) runtimeException), "qk.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    qk(int param0, int param1, String param2) {
        this(param0, param1, rs.field_Cb.c(param2), rs.field_Cb.field_J, param2);
    }

    qk(int param0, int param1, int param2, int param3, String param4) {
        super(param0, param1, param2, param3);
        try {
            this.field_u = param4;
            this.field_w = 16777215;
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) ((Object) runtimeException), "qk.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    final static String[] a(byte[] param0, int param1) {
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        tq var6 = null;
        String[] stackIn_3_0 = null;
        String[] stackIn_20_0 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            if (param1 == 13) {
              var6 = vg.g(param1 + 105);
              var3 = 0;
              var4 = 0;
              L1: while (true) {
                if (var4 >= param0.length) {
                  stackIn_20_0 = var6.a(220);
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  L2: while (true) {
                    L3: {
                      if (var4 >= param0.length) {
                        break L3;
                      } else {
                        if (param0[var4] == 13) {
                          break L3;
                        } else {
                          if (param0[var4] == 10) {
                            break L3;
                          } else {
                            var4++;
                            continue L2;
                          }
                        }
                      }
                    }
                    var6.a(qi.a(param0, -var3 + var4, var3, -118), -126);
                    L4: while (true) {
                      L5: {
                        if (param0.length <= var4) {
                          break L5;
                        } else {
                          L6: {
                            if (13 == param0[var4]) {
                              break L6;
                            } else {
                              if (param0[var4] != 10) {
                                break L5;
                              } else {
                                break L6;
                              }
                            }
                          }
                          var4++;
                          continue L4;
                        }
                      }
                      var3 = var4;
                      continue L1;
                    }
                  }
                }
              }
            } else {
              stackIn_3_0 = (String[]) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var2 = decompiledCaughtException;
            stackIn_23_0 = (RuntimeException) (var2);

            stackIn_23_1 = new StringBuilder().append("qk.F(");

            if (param0 == null) {
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
          throw r.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_20_0;
        }
    }

    final static gm a(qf param0, int param1) {
        RuntimeException var2 = null;
        String var3 = null;
        gm stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 >= 44) {
                break L1;
              } else {
                var3 = (String) null;
                qk.a((String) null, 122, (byte) 75);
                break L1;
              }
            }
            stackIn_3_0 = e.a(param0.field_a, -124, param0.field_f);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var2);

            stackIn_6_1 = new StringBuilder().append("qk.A(");

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
          throw r.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    void a(int param0) {
        if (!(this.field_s)) {
            return;
        }
        int var2 = -21 / ((67 - param0) / 47);
        if (!(null == this.field_u)) {
            rs.field_Cb.c(this.field_u, this.field_m / 2 + this.field_k, 3 * rs.field_Cb.field_J / 4 + this.field_t, this.field_w, -1);
        }
    }

    final static void g(int param0) {
        fe.f(-1);
        oe.field_f = true;
        el.field_b = true;
        le.field_e.k(99);
        if (param0 > -12) {
            return;
        }
        fk.a(we.field_b, -78, false);
    }

    public static void f(int param0) {
        field_y = null;
        field_z = null;
        field_v = null;
        int var1 = -126 / ((param0 - 53) / 36);
    }

    qk(int param0, int param1, int param2, int param3, String param4, int param5) {
        super(param0, param1, param2, param3);
        try {
            this.field_u = param4;
            this.field_w = param5;
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) ((Object) runtimeException), "qk.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ')');
        }
    }

    final static void a(String param0, int param1, byte param2) {
        try {
            if (param2 < 74) {
                qf var4 = (qf) null;
                qk.a((qf) null, 124);
            }
            jb.field_g = po.field_f;
            sh.field_b = param1;
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) ((Object) runtimeException), "qk.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_z = "Message game";
        field_v = "Most fleets controlled at one time.";
    }
}
