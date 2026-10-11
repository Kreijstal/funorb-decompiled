/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mh extends ik {
    static String field_m;
    static int[] field_l;
    static String field_j;
    static int field_h;
    private String field_i;
    int field_k;

    final void a(boolean param0, int param1, int param2) {
        il.a(this.field_c, param0, this.field_d, this.field_a, this.field_b, false);
        int var4 = 0;
        if (param1 == 16777215) {
          var4 = 1;
        }
        if (param1 == 16760896) {
          var4 = 2;
        }
        if (param2 != 1) {
          return;
        }
        gj.field_m.a(this.field_i, this.field_k + this.field_a, 17 + this.field_d, var4, -1);
    }

    final static void a(byte param0, String param1, String param2) {
        try {
          if (param0 != 1) {
            mh.c(-13);
          }
          wk.a(param1, false, param2, false);
        } catch (RuntimeException runtimeException) {
          throw dn.a((Throwable) ((Object) runtimeException), "mh.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    public static void c(int param0) {
        if (param0 >= -53) {
          field_h = 63;
        }
        field_j = null;
        field_m = null;
        field_l = null;
    }

    final static short[] a(byte param0, md param1, int param2, short[] param3) {
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        short[] stackIn_3_0 = null;
        short[] stackIn_19_0 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var8 = CrazyCrystals.field_B;
        try {
          var4_int = param1.d((byte) -114, param2);
          if (param0 != -2) {
            stackIn_3_0 = (short[]) null;
            return stackIn_3_0;
          }
          if (var4_int == 0) {
            return null;
          }
          if (param3 == null ||
            param3.length != var4_int) {
            param3 = new short[var4_int];
          }
          var5 = param1.d((byte) -63, 4);
          var6 = (short)param1.d((byte) -94, 16);
          if (var5 <= 0) {
            for (var7 = 0; var7 < var4_int; var7++) {
              param3[var7] = (short)var6;
            }
          } else {
            for (var7 = 0; var7 < var4_int; var7++) {
              param3[var7] = (short)(var6 + param1.d((byte) -51, var5));
            }
          }
          stackIn_19_0 = (short[]) (param3);
          return stackIn_19_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_22_0 = var4;
          stackIn_22_1 = new StringBuilder().append("mh.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          stackIn_25_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(')').toString());
        }
    }

    mh(int param0, int param1, String param2, int param3) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        this.field_k = 9;
        try {
          this.field_i = param2;
          this.field_a = param0 - 9;
          this.field_d = param1 - 4;
          this.field_b = go.field_l.a(param2) + 20;
          this.field_c = 26;
          if (param3 != 1) {
            if (param3 == 2) {
              this.field_a = this.field_a - (-10 + this.field_b / 2);
            }
          } else {
            this.field_a = this.field_a - (-20 + this.field_b);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_8_0 = var5;
          stackIn_8_1 = new StringBuilder().append("mh.<init>(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param3).append(')').toString());
        }
    }

    mh(int param0, int param1, int param2, String param3, int param4) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        this.field_k = 9;
        try {
          this.field_c = 26;
          this.field_i = param3;
          this.field_d = -4 + param1;
          this.field_a = param0 - 9;
          this.field_b = param2 + 20;
          if (param4 != 1) {
            if (param4 == 2) {
              this.field_k = this.field_k + (-go.field_l.a(param3) + param2) / 2;
            }
          } else {
            this.field_k = this.field_k + (param2 - go.field_l.a(param3));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_8_0 = var6;
          stackIn_8_1 = new StringBuilder().append("mh.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param4).append(')').toString());
        }
    }

    final static void a(int param0, int param1, int param2) {
        if (param1 != -20) {
          short[] var4 = (short[]) null;
          mh.a((byte) -79, (md) null, 13, (short[]) null);
        }
        oa.field_b = param0;
        rn.field_n = param2;
    }

    static {
        field_j = "Fullscreen mode";
        field_m = "Start Game";
    }
}
