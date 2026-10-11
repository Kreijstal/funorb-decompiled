/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class co extends eq {
    private sl field_bb;
    private sl field_eb;
    private sl field_Z;
    static int field_db;
    private boolean field_cb;
    static int[] field_ab;

    final static void a(int param0, int param1, int param2, int param3, int param4, int[] param5, int param6, int param7, int param8, int param9) {
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        param8 = param8 - param5[1];
        param6 = param6 - param5[0];
        param1 = param1 - param5[1];
        param2 = param2 - param5[2];
        param7 = param7 - param5[2];
        param9 = param9 - param5[0];
        int var10_int = param5[9] * param9 + param1 * param5[10] + param7 * param5[11] >> 16;
        if (var10_int <= 0) {
          return;
        }
        int var11 = param6 * param5[9] + param8 * param5[10] + param2 * param5[11] >> 16;
        if (var11 <= 0) {
          return;
        }
        try {
          var12 = param5[4] * param1 + param9 * param5[3] + param7 * param5[5] >> 7;
          var13 = param7 * param5[8] + param1 * param5[7] + param5[6] * param9 >> 7;
          var14 = param5[4] * param8 + (param6 * param5[3] + param2 * param5[5]) >> 7;
          var13 = fb.field_d + (qh.field_c + var13 / var10_int);
          var12 = fb.field_q + (qh.field_b + var12 / var10_int);
          var15 = param8 * param5[param0] + param6 * param5[6] + param2 * param5[8] >> 7;
          var14 = var14 / var11 + fb.field_q + qh.field_b;
          var15 = fb.field_d + qh.field_c + var15 / var11;
          qh.b(var12, var13, var14, var15, param4, param3);
        } catch (RuntimeException runtimeException) {
          throw wm.a((Throwable) ((Object) runtimeException), "co.R(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ')');
        }
    }

    final static boolean a(String param0, byte param1, String param2) {
        String var3 = null;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          if (param1 > -79) {
            field_db = 112;
          }
          param0 = o.a('_', "", param0, 1);
          var3 = qa.a(param2, 0);
          stackIn_7_0 = (param0.indexOf(param2) != -1) || (param0.indexOf(var3) != -1);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_10_0 = var3_ref;
          stackIn_10_1 = new StringBuilder().append("co.P(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    public static void a(boolean param0) {
        if (!param0) {
          field_ab = (int[]) null;
          field_ab = null;
          return;
        }
        field_ab = null;
    }

    final int j(int param0) {
        NumberFormatException var2 = null;
        int stackIn_3_0 = 0;
        Throwable decompiledCaughtException = null;
        if (param0 != 25) {
          this.h((byte) 122);
        }
        try {
          stackIn_3_0 = Integer.parseInt(this.field_bb.field_m) - 1;
          return stackIn_3_0;
        } catch (java.lang.NumberFormatException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (NumberFormatException) (Object) decompiledCaughtException;
          return -1;
        }
    }

    final boolean g(byte param0) {
        if (null == this.field_Z.field_m) {
          return true;
        }
        if (this.field_Z.field_m.length() == 0) {
          return true;
        }
        if (null == this.field_bb.field_m) {
          return true;
        }
        if (this.field_bb.field_m.length() == 0) {
          return true;
        }
        if (null == this.field_eb.field_m) {
          return true;
        }
        if (this.field_eb.field_m.length() == 0) {
          return true;
        }
        if (param0 == 114) {
          return false;
        }
        field_db = -125;
        return false;
    }

    final String e(int param0) {
        if (param0 > -10) {
          return (String) null;
        }
        String var2 = this.field_bb.e(-122);
        if (var2 != null) {
          return var2;
        }
        if (this.field_s) {
          return this.field_p == null ? this.field_m : this.field_p;
        }
        return null;
    }

    co(fp param0, boolean param1, int param2, int param3, int param4, int param5) {
        this(param0, param1);
        try {
          this.a(param4, param2, param5, false, param3);
        } catch (RuntimeException runtimeException) {
          throw wm.a((Throwable) ((Object) runtimeException), "co.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final void a(int param0, int param1, int param2, boolean param3, int param4) {
        super.a(param0, param1, param2, param3, param4);
        int var6 = -130 + param0 >> 1;
        if (!this.field_cb) {
          this.field_Z.a(25, var6, param2, false, 0);
          this.field_bb.a(25, var6 + 45, param2, false, 0);
          this.field_eb.a(40, var6 + 90, param2, false, 0);
          return;
        }
        this.field_bb.a(25, var6, param2, false, 0);
        this.field_Z.a(25, 45 + var6, param2, param3, 0);
        this.field_eb.a(40, var6 + 90, param2, false, 0);
    }

    final int h(int param0) {
        NumberFormatException var2 = null;
        int stackIn_3_0 = 0;
        Throwable decompiledCaughtException = null;
        try {
          if (param0 <= 13) {
            this.field_Z = (sl) null;
          }
          stackIn_3_0 = Integer.parseInt(this.field_eb.field_m);
          return stackIn_3_0;
        } catch (java.lang.NumberFormatException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (NumberFormatException) (Object) decompiledCaughtException;
          return -1;
        }
    }

    final void a(int param0, sn param1) {
        try {
          super.a(param0, param1);
          this.field_Z.field_t = (cc) ((Object) param1);
          this.field_bb.field_t = (cc) ((Object) param1);
          this.field_eb.field_t = (cc) ((Object) param1);
        } catch (RuntimeException runtimeException) {
          throw wm.a((Throwable) ((Object) runtimeException), "co.J(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private co(fp param0, boolean param1) {
        super(0, 0, 0, 0, (fp) null);
        try {
          this.field_Z = (sl) ((Object) new ga("", (cc) null, 2));
          this.field_bb = (sl) ((Object) new ga("", (cc) null, 2));
          this.field_eb = (sl) ((Object) new ga("", (cc) null, 4));
          this.field_cb = param1 ? true : false;
          this.field_eb.field_z = param0;
          this.field_bb.field_z = param0;
          this.field_Z.field_z = param0;
          if (!this.field_cb) {
            this.a(true, this.field_Z);
            this.a(true, this.field_bb);
          } else {
            this.a(true, this.field_bb);
            this.a(true, this.field_Z);
          }
          this.a(true, this.field_eb);
        } catch (RuntimeException runtimeException) {
          throw wm.a((Throwable) ((Object) runtimeException), "co.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final int h(byte param0) {
        NumberFormatException var2 = null;
        sn var3 = null;
        int stackIn_3_0 = 0;
        Throwable decompiledCaughtException = null;
        if (param0 != -119) {
          var3 = (sn) null;
          this.a(-106, (sn) null);
        }
        try {
          stackIn_3_0 = Integer.parseInt(this.field_Z.field_m);
          return stackIn_3_0;
        } catch (java.lang.NumberFormatException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (NumberFormatException) (Object) decompiledCaughtException;
          return -1;
        }
    }

    final void a(int param0, byte param1, int param2, int param3) {
        super.a(param0, (byte) -104, param2, param3);
        if (param0 != 0) {
          return;
        }
        param3 = param3 + this.field_D;
        param2 = param2 + this.field_C;
        int var5 = 30 % ((-42 - param1) / 53);
        this.a(param2, param3, 75, this.field_Z, dp.field_h);
        this.a(param2, param3, 114, this.field_bb, pc.field_c);
        this.a(param2, param3, 91, this.field_eb, bb.field_a);
    }

    private final void a(int param0, int param1, int param2, ei param3, String param4) {
        if (param2 <= 65) {
          return;
        }
        try {
          qk.field_a.b(param4, (param3.field_l >> 1) + param0 + param3.field_C, -5 + (param3.field_D + param1), 16777215, -1);
        } catch (RuntimeException runtimeException) {
          throw wm.a((Throwable) ((Object) runtimeException), "co.N(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_ab = new int[]{0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, 2147483647, -1};
    }
}
