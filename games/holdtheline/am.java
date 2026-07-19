/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class am implements dh {
    static go[] field_b;
    static String field_f;
    private int field_g;
    static gn field_d;
    private int field_e;
    private qi field_a;
    static String field_c;

    final static void a(int param0, String param1, boolean param2, ql param3, int param4, int param5) {
        try {
            if (!param2) {
                field_f = (String) null;
            }
            param3.c(param1, param0 - -1, 1 + param4, 8, -1, 114);
            param3.c(param1, param0, param4, param5, -1);
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) ((Object) runtimeException), "am.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ')');
        }
    }

    final static void a(java.awt.Canvas param0, int param1) {
        RuntimeException var2 = null;
        ql var3 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == 114) {
                break L1;
              } else {
                var3 = (ql) null;
                am.a(-98, (String) null, true, (ql) null, 48, -52);
                break L1;
              }
            }
            vd.a((java.awt.Component) ((Object) param0), -116);
            gk.a((java.awt.Component) ((Object) param0), param1 ^ 109);
            if (null == lb.field_u) {
              break L0;
            } else {
              lb.field_u.a((java.awt.Component) ((Object) param0), (byte) 106);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var2);
            stackOut_5_1 = new StringBuilder().append("am.E(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ')');
        }
    }

    public final void a(boolean param0, int param1, int param2, n param3, int param4) {
        int discarded$1 = 0;
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        var11 = HoldTheLine.field_D;
        try {
          L0: {
            L1: {
              if (param2 <= -48) {
                break L1;
              } else {
                field_b = (go[]) null;
                break L1;
              }
            }
            L2: {
              L3: {
                if (param3.field_p) {
                  break L3;
                } else {
                  if (!param3.c((byte) -20)) {
                    stackOut_7_0 = 2188450;
                    stackIn_8_0 = stackOut_7_0;
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              stackOut_6_0 = 3249872;
              stackIn_8_0 = stackOut_6_0;
              break L2;
            }
            L4: {
              var6_int = stackIn_8_0;
              discarded$1 = this.field_a.a("<u=" + Integer.toString(var6_int, 16) + ">" + param3.field_q + "</u>", param3.field_k + param1, param3.field_o + param4, param3.field_x, param3.field_u, var6_int, -1, this.field_e, this.field_g, this.field_a.field_G - -this.field_a.field_I);
              if (!param3.c((byte) -20)) {
                break L4;
              } else {
                L5: {
                  var7 = this.field_a.a(param3.field_q);
                  var8 = this.field_a.field_I + this.field_a.field_G;
                  var9 = param1 + param3.field_k;
                  var10 = param4 - -param3.field_o;
                  if ((this.field_e ^ -1) == -3) {
                    var9 = var9 + (param3.field_x - var7);
                    break L5;
                  } else {
                    if (this.field_e != 1) {
                      break L5;
                    } else {
                      var9 = var9 + (-var7 + param3.field_x >> -1921105503);
                      break L5;
                    }
                  }
                }
                L6: {
                  if (2 == this.field_g) {
                    var10 = var10 + (-var8 + param3.field_u);
                    break L6;
                  } else {
                    if (1 == this.field_g) {
                      var10 = var10 + (param3.field_u + -var8 >> 955315457);
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                }
                ei.a(var8, 4 + var7, -2 + var9, var10 - -2, (byte) 19);
                break L4;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var6 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) (var6);
            stackOut_20_1 = new StringBuilder().append("am.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param3 == null) {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L7;
            } else {
              stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L7;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ',' + param4 + ')');
        }
    }

    public am() {
        this.field_g = 1;
        this.field_e = 1;
        this.field_a = hl.field_g;
    }

    final static void a(int param0, byte param1, fb param2) {
        try {
            bj.field_O.a((byte) -103, param2);
            if (param1 >= -27) {
                fb var4 = (fb) null;
                am.a(-120, (byte) -6, (fb) null);
            }
            dn.a(param2, param0, 118);
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) ((Object) runtimeException), "am.D(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(int param0) {
        field_d = null;
        field_c = null;
        field_b = null;
        field_f = null;
        if (param0 != 1) {
            am.a(-13);
        }
    }

    am(qi param0, int param1, int param2) {
        try {
            this.field_e = param1;
            this.field_a = param0;
            this.field_g = param2;
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) ((Object) runtimeException), "am.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_c = "Single-player controls:";
    }
}
