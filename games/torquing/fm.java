/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fm extends hn implements ng {
    private lg field_C;
    static int field_E;
    private lg field_D;
    private lg field_B;
    static la field_F;

    final boolean a(int param0, gm param1, char param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        boolean stackIn_6_0 = false;
        boolean stackIn_9_0 = false;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5_int = 61 / ((param3 + 33) / 57);
          if (super.a(param0, param1, param2, -94)) {
            return true;
          }
          if (param0 == 98) {
            stackIn_6_0 = this.a((byte) -91, param1);
            return stackIn_6_0;
          }
          if (99 != param0) {
            return false;
          }
          stackIn_9_0 = this.b(param1, -9928);
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_14_0 = var5;
          stackIn_14_1 = new StringBuilder().append("fm.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final void a(int param0, byte param1, int param2, int param3) {
        int var5 = param3 + this.field_w;
        int var6 = param2 + this.field_k;
        if (param1 > -7) {
          field_E = 119;
        }
        dg.field_e.a(jl.field_U, 20 + var5, var6 + 20, -40 + this.field_p, -50 + this.field_o, 16777215, -1, 1, 0, dg.field_e.field_x);
        super.a(param0, (byte) -112, param2, param3);
    }

    final static int a(int param0, char param1, CharSequence param2) {
        int var5 = 0;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var6 = 0;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = Torquing.field_u;
        try {
          var3_int = param0;
          var4 = param2.length();
          for (var5 = 0; var4 > var5; var5++) {
            if (param2.charAt(var5) == param1) {
              var3_int++;
            }
          }
          stackIn_8_0 = var3_int;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_11_0 = var3;
          stackIn_11_1 = new StringBuilder().append("fm.C(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    final static boolean a(byte param0, char param1) {
        int var3 = 0;
        char[] var2 = null;
        RuntimeException var2_ref = null;
        int var4 = 0;
        int var5 = 0;
        char[] var6 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = Torquing.field_u;
        try {
          if (param0 != 32) {
            field_E = -78;
          }
          if ((0 >= param1 ||
            param1 >= 128) &&
            (param1 < 160 ||
            param1 > 255)) {
            if (param1 != 0) {
              var6 = ef.field_c;
              var2 = var6;
              for (var3 = 0; var3 < var6.length; var3++) {
                var4 = var6[var3];
                if (param1 == var4) {
                  return true;
                }
              }
            }
            return false;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw rb.a((Throwable) ((Object) var2_ref), "fm.E(" + param0 + ',' + param1 + ')');
        }
    }

    final static void a(boolean param0, int param1, String param2, String param3) {
        eo.field_a = param3;
        vo.field_g = param2;
        if (param1 != -78) {
          return;
        }
        try {
          jk.a(ii.field_m, (byte) -79, param0);
        } catch (RuntimeException runtimeException) {
          throw rb.a((Throwable) ((Object) runtimeException), "fm.F(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    public final void a(byte param0, lg param1, int param2, int param3, int param4) {
        int var7 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var7 = Torquing.field_u;
        try {
          if (param0 > -85) {
            return;
          }
          if (this.field_D != param1) {
            if (param1 != this.field_C) {
              if (this.field_B == param1) {
                eh.c((byte) 90);
              }
            } else {
              m.a(11);
            }
          } else {
            og.a(9);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_13_0 = var6;
          stackIn_13_1 = new StringBuilder().append("fm.NA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    public fm() {
        super(0, 0, 476, 225, (el) null);
        this.field_C = new lg(qh.field_e, (ca) null);
        this.field_D = new lg(cm.field_k, (ca) null);
        this.field_B = new lg(ha.field_c, (ca) null);
        rf var1 = new rf();
        this.field_C.field_q = (el) ((Object) var1);
        this.field_D.field_q = (el) ((Object) var1);
        this.field_B.field_q = (el) ((Object) var1);
        int var2 = 4;
        int var3 = 326;
        int var4 = var3 - var2 >> 1;
        this.field_D.a((byte) -52, this.field_p - var3 >> 1, -var2 + (-48 + this.field_o), 30, var4);
        this.field_B.a((byte) 126, (this.field_p - var3 >> 1) + var4 + var2, -var2 + (-48 + this.field_o), 30, var4);
        this.field_C.a((byte) 124, -var3 + this.field_p >> 1, -78 + this.field_o - var2 * 2, 30, var3);
        this.field_D.field_t = (ca) (this);
        this.field_C.field_t = (ca) (this);
        this.field_B.field_t = (ca) (this);
        this.field_C.field_n = um.field_q;
        this.field_B.field_n = ll.field_m;
        this.a(this.field_D, -6938);
        this.a(this.field_C, -6938);
        this.a(this.field_B, -6938);
    }

    public static void h(int param0) {
        if (param0 >= -11) {
          fm.a((byte) -83, 'K');
        }
        field_F = null;
    }

    final static boolean a(byte param0, String param1) {
        int var3 = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var4 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = Torquing.field_u;
        try {
          var2_int = param1.charAt(0);
          for (var3 = 1; param1.length() > var3; var3++) {
            if (var2_int != param1.charAt(var3)) {
              return false;
            }
          }
          if (param0 > -66) {
            field_F = (la) null;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_14_0 = var2;
          stackIn_14_1 = new StringBuilder().append("fm.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    static {
    }
}
