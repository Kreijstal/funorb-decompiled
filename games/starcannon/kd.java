/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kd extends vk implements ga {
    private qk field_A;
    static String field_D;
    static boolean field_E;
    static int field_C;
    private dk[] field_y;
    static bb field_B;
    private String[] field_z;

    final void a(int param0, String[] param1) {
        int var4_int = 0;
        int var5 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        wa var4 = null;
        try {
          this.field_u.b(23505);
          if (param1 != null &&
            param1.length != 0) {
            var3_int = param1.length;
            this.field_z = new String[var3_int];
            for (var4_int = 0; var3_int > var4_int; var4_int++) {
              this.field_z[var4_int] = hf.a((CharSequence) ((Object) param1[var4_int]), false).replace(' ', ' ');
            }
            var4 = new wa(nb.field_c, 0, 1);
            this.field_y = new dk[1 + var3_int];
            if (param0 != 1891) {
              field_C = -29;
            }
            for (var5 = 0; var5 < var3_int; var5++) {
              this.field_y[var5] = new dk(this.field_z[var5], (qg) (this));
              this.field_y[var5].field_o = (de) ((Object) var4);
              this.field_y[var5].field_p = fb.field_d;
              this.field_y[var5].a(0, 80, (byte) 119, 15, 20 + var5 * 16);
              this.a(true, this.field_y[var5]);
            }
            this.field_y[var3_int] = new dk(ci.field_d, (qg) (this));
            this.field_y[var3_int].field_o = (de) ((Object) var4);
            this.field_y[var3_int].a(0, 100, (byte) 118, 15, 20 + var3_int * 16 + 16);
            this.a(true, this.field_y[var3_int]);
            return;
          }
          this.field_z = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_17_0 = var3;
          stackIn_17_1 = new StringBuilder().append("kd.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    kd(qk param0) {
        super(0, 0, 0, 0, (de) null);
        try {
          this.field_A = param0;
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "kd.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(int param0) {
        if (param0 != -16) {
          return;
        }
        field_D = null;
        field_B = null;
    }

    final boolean a(uj param0, char param1, byte param2, int param3) {
        RuntimeException var5 = null;
        boolean stackIn_6_0 = false;
        boolean stackIn_9_0 = false;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (super.a(param0, param1, param2, param3)) {
            return true;
          }
          if (98 == param3) {
            stackIn_6_0 = this.b(36, param0);
            return stackIn_6_0;
          }
          if (param3 != 99) {
            return false;
          }
          stackIn_9_0 = this.a((byte) -103, param0);
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_14_0 = var5;
          stackIn_14_1 = new StringBuilder().append("kd.EA(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    public final void a(dk param0, int param1, boolean param2, int param3, int param4) {
        int var6_int = 0;
        int var7 = 0;
        String[] var8 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var7 = StarCannon.field_A;
        try {
          for (var6_int = 0; var6_int < this.field_z.length; var6_int++) {
            if (param0 == this.field_y[var6_int]) {
              this.field_A.a(this.field_z[var6_int], (byte) -125);
            }
          }
          if (this.field_y[this.field_z.length] == param0) {
            this.field_A.a(-12920);
          }
          if (param2) {
            var8 = (String[]) null;
            this.a(53, (String[]) null);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_14_0 = var6;
          stackIn_14_1 = new StringBuilder().append("kd.E(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final void a(int param0, int param1, byte param2, int param3) {
        super.a(param0, param1, param2, param3);
        if (param0 != 0) {
          return;
        }
        qe var5 = nb.field_c;
        if (null != this.field_z) {
          var5.a(ca.field_X, this.field_s + param1, param3 + this.field_j, this.field_i, 20, 16777215, -1, 0, 0, var5.field_q + var5.field_p);
        }
    }

    static {
        field_B = null;
        field_D = "Unfortunately there was a focus problem while setting fullscreen mode. You could try disabling any multiple monitor drivers or window enhancements, if you have any enabled.";
        field_E = false;
    }
}
