/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gqb implements ntb {
    int field_c;
    static String field_b;
    static int field_a;

    public final void a(tv param0, int param1) {
        gqb var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            L1: {
              var3 = (gqb) ((Object) param0);
              var4 = 0;
              if (param1 < -19) {
                break L1;
              } else {
                field_b = (String) null;
                break L1;
              }
            }
            L2: {
              if (this.field_c == var3.field_c) {
                break L2;
              } else {
                System.out.println("int cooldown has changed. before=" + var3.field_c + ", now=" + this.field_c);
                var4 = 1;
                break L2;
              }
            }
            if (var4 != 0) {
              System.out.println("This instance of TimedSpecialOrderBehaviour has changed");
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) (var3_ref);
            stackOut_8_1 = new StringBuilder().append("gqb.F(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ')');
        }
    }

    public final boolean a(byte param0, tv param1) {
        gqb var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
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
              var4 = -108 / ((param0 - 22) / 59);
              var3 = (gqb) ((Object) param1);
              if (var3.field_c == this.field_c) {
                stackOut_2_0 = 0;
                stackIn_3_0 = stackOut_2_0;
                break L1;
              } else {
                stackOut_1_0 = 1;
                stackIn_3_0 = stackOut_1_0;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var3_ref);
            stackOut_4_1 = new StringBuilder().append("gqb.C(").append(param0).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0 != 0;
    }

    public final void b(byte param0, tv param1) {
        gqb var5 = null;
        gqb var6 = null;
        if (param0 < 54) {
            return;
        }
        try {
            var5 = (gqb) ((Object) param1);
            var6 = var5;
            var6.field_c = this.field_c;
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "gqb.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public final void b(faa param0, int param1) {
        try {
            if (param1 >= -109) {
                gqb.a(55);
            }
            param0.a(-632, this.field_c, 32);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "gqb.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static sg a(boolean param0) {
        ml var2 = null;
        ml var4 = null;
        ml var5 = null;
        ml var6 = null;
        ml var7 = null;
        ml var8 = null;
        sg var9 = null;
        var9 = new sg();
        var2 = new ml(0);
        var4 = new ml(14);
        var2.a(1, 0, var4);
        var5 = new ml(12);
        var5.field_a = new aqa();
        var5.a((byte) -82, 8);
        var5.field_a.a(true, 1024);
        var2.a(1, 1, var5);
        var6 = new ml(12);
        var6.field_a = new aqa();
        var6.a((byte) -64, 4);
        var6.field_a.a(true, 1024);
        var2.a(1, 2, var6);
        var7 = new ml(12);
        var7.field_a = new aqa();
        var7.a((byte) -113, 2);
        var7.field_a.a(true, 1024);
        var2.a(1, 3, var7);
        var8 = new ml(12);
        if (param0) {
          field_a = 66;
          var8.field_a = new aqa();
          var8.a((byte) -92, 1);
          var8.field_a.a(true, 1024);
          var2.a(1, 4, var8);
          var9.field_k = var2;
          var9.e((byte) 119);
          return var9;
        } else {
          var8.field_a = new aqa();
          var8.a((byte) -92, 1);
          var8.field_a.a(true, 1024);
          var2.a(1, 4, var8);
          var9.field_k = var2;
          var9.e((byte) 119);
          return var9;
        }
    }

    public final void a(faa param0, boolean param1) {
        try {
            if (param1) {
                this.field_c = 57;
            }
            this.field_c = param0.i(0, 32);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "gqb.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void a(int param0) {
        field_b = null;
        if (param0 <= 121) {
            gqb.a(-50);
        }
    }

    static {
        field_b = "Create a free Account";
        field_a = 0;
    }
}
