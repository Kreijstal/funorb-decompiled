/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cn extends java.awt.Canvas {
    static int field_d;
    static jd[][] field_a;
    static String field_b;
    private java.awt.Component field_c;

    final static wl a(di param0, int param1, int param2, di param3, int param4) {
        RuntimeException var5 = null;
        Object stackIn_4_0 = null;
        wl stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param4 == 24888) {
                break L1;
              } else {
                field_b = (String) null;
                break L1;
              }
            }
            if (vj.a(param2, param0, param1, (byte) 121)) {
              stackIn_6_0 = cl.a(param3.a(param4 + -24766, param1, param2), true);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_4_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var5);

            stackIn_9_1 = new StringBuilder().append("cn.D(");

            if (param0 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L3;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L3;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_10_0), stackIn_13_2 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (wl) ((Object) stackIn_4_0);
        } else {
          return stackIn_6_0;
        }
    }

    final static void a(int param0) {
        sn.field_m = new vh(0L, (vh) null);
        if (!(!tq.field_p)) {
            sn.field_m.a(21, pm.field_m);
        }
        sn.field_m.a(39, c.field_e);
        kg.field_l = new vn(sn.field_l, sn.field_m);
        ir.field_a = new vh(0L, (vh) null);
        ir.field_a.a(-117, kg.field_l.field_i);
        ir.field_a.a(-120, gj.field_K);
        f.a(48);
        int var1 = 106 / ((-83 - param0) / 35);
    }

    public final void paint(java.awt.Graphics param0) {
        try {
            this.field_c.paint(param0);
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) ((Object) runtimeException), "cn.paint(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean a(byte param0) {
        if (param0 < 33) {
            di var2 = (di) null;
            cn.a((di) null, 9, -34, (di) null, -113);
        }
        return qi.field_c;
    }

    public static void b(byte param0) {
        field_a = (jd[][]) null;
        if (param0 != 38) {
            field_b = (String) null;
        }
        field_b = null;
    }

    public final void update(java.awt.Graphics param0) {
        try {
            this.field_c.update(param0);
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) ((Object) runtimeException), "cn.update(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static String a(int param0, CharSequence param1) {
        int var2_int = 0;
        int var3 = 0;
        char[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        String stackIn_17_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            L1: {
              var2_int = 115 / ((param0 - 73) / 39);
              var3 = param1.length();
              if (var3 <= 20) {
                break L1;
              } else {
                var3 = 20;
                break L1;
              }
            }
            var4 = new char[var3];
            var5 = 0;
            L2: while (true) {
              if (var5 >= var3) {
                stackIn_17_0 = new String(var4);
                break L0;
              } else {
                L3: {
                  L4: {
                    var6 = param1.charAt(var5);
                    if (65 > var6) {
                      break L4;
                    } else {
                      if (var6 > 90) {
                        break L4;
                      } else {
                        var4[var5] = (char)(var6 + 32);
                        break L3;
                      }
                    }
                  }
                  L5: {
                    L6: {
                      if (var6 < 97) {
                        break L6;
                      } else {
                        if (var6 <= 122) {
                          break L5;
                        } else {
                          break L6;
                        }
                      }
                    }
                    L7: {
                      if (48 > var6) {
                        break L7;
                      } else {
                        if (var6 <= 57) {
                          break L5;
                        } else {
                          break L7;
                        }
                      }
                    }
                    var4[var5] = (char)95;
                    break L3;
                  }
                  var4[var5] = (char)var6;
                  break L3;
                }
                var5++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var2 = decompiledCaughtException;
            stackIn_20_0 = (RuntimeException) (var2);

            stackIn_20_1 = new StringBuilder().append("cn.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L8;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L8;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ')');
        }
        return stackIn_17_0;
    }

    cn(java.awt.Component param0) {
        try {
            this.field_c = param0;
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) ((Object) runtimeException), "cn.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_b = "Open in popup window";
    }
}
