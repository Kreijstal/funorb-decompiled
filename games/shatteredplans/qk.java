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
                ((qk) this).field_w = 9;
            }
            ((qk) this).field_u = param1;
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) (Object) runtimeException, "qk.D(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    qk(int param0, int param1, String param2) {
        this(param0, param1, rs.field_Cb.c(param2), rs.field_Cb.field_J, param2);
    }

    qk(int param0, int param1, int param2, int param3, String param4) {
        super(param0, param1, param2, param3);
        try {
            ((qk) this).field_u = param4;
            ((qk) this).field_w = 16777215;
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) (Object) runtimeException, "qk.<init>(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + (param4 != null ? "{...}" : "null") + 41);
        }
    }

    final static String[] a(byte[] param0, int param1) {
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        tq var6 = null;
        String[] stackIn_17_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        String[] stackOut_16_0 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        var5 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            var6 = vg.g(118);
            var3 = 0;
            var4 = 0;
            L1: while (true) {
              if (var4 >= param0.length) {
                stackOut_16_0 = var6.a(220);
                stackIn_17_0 = stackOut_16_0;
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
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var2 = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) var2;
            stackOut_18_1 = new StringBuilder().append("qk.F(");
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param0 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L7;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L7;
            }
          }
          throw r.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + 44 + 13 + 41);
        }
        return stackIn_17_0;
    }

    final static gm a(qf param0, int param1) {
        RuntimeException var2 = null;
        Object var3 = null;
        gm stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        gm stackOut_2_0 = null;
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
            L1: {
              if (param1 >= 44) {
                break L1;
              } else {
                var3 = null;
                qk.a((String) null, 122, (byte) 75);
                break L1;
              }
            }
            stackOut_2_0 = e.a(param0.field_a, -124, param0.field_f);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var2;
            stackOut_4_1 = new StringBuilder().append("qk.A(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw r.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + param1 + 41);
        }
        return stackIn_3_0;
    }

    void a(int param0) {
        if (!(((qk) this).field_s)) {
            return;
        }
        int var2 = -21 / ((67 - param0) / 47);
        if (!(null == ((qk) this).field_u)) {
            rs.field_Cb.c(((qk) this).field_u, ((qk) this).field_m / 2 + ((qk) this).field_k, 3 * rs.field_Cb.field_J / 4 + ((qk) this).field_t, ((qk) this).field_w, -1);
        }
    }

    final static void g(int param0) {
        fe.f(-1);
        oe.field_f = true;
        el.field_b = true;
        le.field_e.k(99);
        fk.a(we.field_b, -78, false);
    }

    public static void f(int param0) {
        field_y = null;
        field_z = null;
        field_v = null;
        int var1 = -126;
    }

    qk(int param0, int param1, int param2, int param3, String param4, int param5) {
        super(param0, param1, param2, param3);
        try {
            ((qk) this).field_u = param4;
            ((qk) this).field_w = param5;
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) (Object) runtimeException, "qk.<init>(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + (param4 != null ? "{...}" : "null") + 44 + param5 + 41);
        }
    }

    final static void a(String param0, int param1, byte param2) {
        try {
            if (param2 < 74) {
                Object var4 = null;
                gm discarded$0 = qk.a((qf) null, 124);
            }
            jb.field_g = po.field_f;
            sh.field_b = param1;
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) (Object) runtimeException, "qk.E(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_z = "Message game";
        field_v = "Most fleets controlled at one time.";
    }
}
