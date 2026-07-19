/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hl {
    private vh field_f;
    static boolean field_a;
    private vh field_d;
    static rj field_b;
    static String field_e;
    static int[] field_c;

    final static void a(byte param0, String param1, String param2) {
        try {
            if (!(nb.field_b == null)) {
                nb.field_b.h((byte) -126);
            }
            mb.field_s = new uh(param2, param1, false, true, true);
            if (param0 != -93) {
                field_e = (String) null;
            }
            bj.field_f.a(mb.field_s, param0 + 12);
        } catch (RuntimeException runtimeException) {
            throw qk.a((Throwable) ((Object) runtimeException), "hl.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final int a(boolean param0) {
        int var2 = 0;
        vh var3 = null;
        int var4 = 0;
        var4 = Terraphoenix.field_V;
        var2 = 0;
        if (param0) {
          field_b = (rj) null;
          var3 = this.field_f.field_o;
          L0: while (true) {
            if (this.field_f == var3) {
              return var2;
            } else {
              var2++;
              var3 = var3.field_o;
              continue L0;
            }
          }
        } else {
          var3 = this.field_f.field_o;
          L1: while (true) {
            if (this.field_f == var3) {
              return var2;
            } else {
              var2++;
              var3 = var3.field_o;
              continue L1;
            }
          }
        }
    }

    public static void b(int param0) {
        field_e = null;
        if (param0 <= 38) {
            hl.b(-70);
            field_b = null;
            field_c = null;
            return;
        }
        field_b = null;
        field_c = null;
    }

    final vh a(byte param0) {
        vh var2 = null;
        if (param0 <= -28) {
          var2 = this.field_f.field_o;
          if (this.field_f == var2) {
            return null;
          } else {
            var2.c((byte) 13);
            return var2;
          }
        } else {
          return (vh) null;
        }
    }

    final static ci[] a(byte param0, int param1, int param2, int param3) {
        int var4 = -125 / ((param0 - -29) / 46);
        return be.a(80, param3, param1, 1, param2);
    }

    final void a(int param0, vh param1) {
        try {
            if (param1.field_i != null) {
                param1.c((byte) 13);
            }
            if (param0 != 11152) {
                this.field_d = (vh) null;
            }
            param1.field_o = this.field_f;
            param1.field_i = this.field_f.field_i;
            param1.field_i.field_o = param1;
            param1.field_o.field_i = param1;
        } catch (RuntimeException runtimeException) {
            throw qk.a((Throwable) ((Object) runtimeException), "hl.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static ci a(fa param0, int param1, byte param2, int param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          var4_int = -49 % ((param2 - 44) / 37);
          if (vh.a(param3, param1, param0, true)) {
            return mc.a((byte) 113);
          } else {
            return null;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L0: {
            var4 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var4);
            stackOut_4_1 = new StringBuilder().append("hl.D(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L0;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L0;
            }
          }
          throw qk.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    public hl() {
        this.field_f = new vh();
        this.field_f.field_o = this.field_f;
        this.field_f.field_i = this.field_f;
    }

    final vh a(int param0) {
        vh var2 = null;
        var2 = this.field_d;
        if (var2 == this.field_f) {
          this.field_d = null;
          return null;
        } else {
          this.field_d = var2.field_o;
          if (param0 != 6273) {
            field_b = (rj) null;
            return var2;
          } else {
            return var2;
          }
        }
    }

    final vh c(int param0) {
        vh var2 = null;
        var2 = this.field_f.field_o;
        if (param0 == 8192) {
          if (this.field_f == var2) {
            this.field_d = null;
            return null;
          } else {
            this.field_d = var2.field_o;
            return var2;
          }
        } else {
          field_a = false;
          if (this.field_f == var2) {
            this.field_d = null;
            return null;
          } else {
            this.field_d = var2.field_o;
            return var2;
          }
        }
    }

    static {
        field_a = false;
        field_b = new rj();
        field_e = "This entry doesn't match";
        field_c = new int[8192];
    }
}
