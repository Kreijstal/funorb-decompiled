/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class me extends ca implements fb {
    private rg field_h;
    static int[] field_i;

    abstract String b(int param0, String param1);

    public final void a(int param0, rg param1) {
        try {
            if (param0 != 1330) {
                field_i = (int[]) null;
            }
        } catch (RuntimeException runtimeException) {
            throw ch.a((Throwable) ((Object) runtimeException), "me.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public final void a(rg param0, int param1) {
        fe var4 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          L0: {
            L1: {
              if (param1 > -55) {
                var4 = (fe) null;
                me.a(120, 109, 17, (String) null, 22, -46, 96, -16, (fe) null);
                this.a(true);
                break L1;
              } else {
                this.a(true);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var3);

            stackIn_7_1 = new StringBuilder().append("me.C(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L2;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ')');
        }
    }

    abstract rc a(int param0, String param1);

    final static void a(boolean param0, int param1, int param2) {
        wd.field_j = param1;
        if (param0) {
            me.a(false, -47, 24);
            lb.field_j = param2;
            return;
        }
        lb.field_j = param2;
    }

    public static void a(byte param0) {
        field_i = null;
        if (param0 <= 118) {
            me.a((byte) 112);
        }
    }

    final String f(int param0) {
        if (param0 != 0) {
            return (String) null;
        }
        return this.b(param0 + -1, this.field_h.field_k);
    }

    final static boolean a(String param0, byte param1, String param2) {
        String var3 = null;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          L0: {
            L1: {
              param0 = hd.a('_', (byte) -81, "", param0);
              var3 = vl.b(-1, param0);
              if (param1 >= 85) {
                break L1;
              } else {
                field_i = (int[]) null;
                break L1;
              }
            }
            L2: {
              L3: {
                if ((param2.indexOf(param0) ^ -1) != 0) {
                  break L3;
                } else {
                  if (-1 == param2.indexOf(var3)) {
                    stackIn_7_0 = 0;
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              stackIn_7_0 = 1;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var3_ref);

            stackIn_10_1 = new StringBuilder().append("me.W(");

            if (param0 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L4;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L5;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L5;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_11_0), stackIn_14_2 + ')');
        }
        return stackIn_7_0 != 0;
    }

    me(rg param0) {
        try {
            this.field_h = param0;
        } catch (RuntimeException runtimeException) {
            throw ch.a((Throwable) ((Object) runtimeException), "me.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final boolean b(int param0) {
        int stackIn_5_0 = 0;
        if (param0 == -16000) {
          if (this.field_h.field_k != null) {
            if (this.field_h.field_k.length() == 0) {
              return true;
            } else {
              return false;
            }
          } else {
            stackIn_5_0 = 1;
            return stackIn_5_0 != 0;
          }
        } else {
          return false;
        }
    }

    final static void a(int param0, int param1, int param2, String param3, int param4, int param5, int param6, int param7, fe param8) {
        try {
            ne.field_b = param6;
            c.field_b = param0;
            nf.field_i = param3;
            qi.field_a = param8;
            if (param2 <= 37) {
                fe var10 = (fe) null;
                me.a(44, 91, 102, (String) null, 8, 17, 66, 2, (fe) null);
            }
            of.field_c = param1;
            tl.field_c = param4;
            dk.field_h = param5;
            uh.field_f = param7;
            oh.field_h = (uh) ((Object) new tj());
            fd.field_d = new cd(param8);
            we.field_j = new dk(oh.field_h, fd.field_d);
        } catch (RuntimeException runtimeException) {
            throw ch.a((Throwable) ((Object) runtimeException), "me.U(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + (param8 != null ? "{...}" : "null") + ')');
        }
    }

    final rc e(int param0) {
        rg var3;
        if (param0 != 20456) {
          var3 = (rg) null;
          this.a(121, (rg) null);
          return this.a(95, this.field_h.field_k);
        } else {
          return this.a(95, this.field_h.field_k);
        }
    }

    static {
        field_i = new int[8192];
    }
}
