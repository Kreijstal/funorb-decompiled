/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class FlagSet {
    static boolean field_c;
    static String field_b;
    static String field_d;
    private boolean[] flags;

    final void setAll(int[] param0, int param1) {
        int var4 = 0;
        int[] var3 = null;
        int var5 = 0;
        int var6 = 0;
        int[] var7 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var6 = TombRacer.field_G ? 1 : 0;
        try {
          var7 = param0;
          var3 = var7;
          for (var4 = param1; var4 < var7.length; var4++) {
            var5 = var7[var4];
            this.flags[var5] = true;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_7_0 = var3_ref;
          stackIn_7_1 = new StringBuilder().append("kpa.C(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw tba.wrapException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    FlagSet(int param0, int param1, BitPacketBuffer param2) {
        this(param0);
        int var5 = 0;
        int var4_int = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          var4_int = param2.readBits((byte) 44, param0);
          for (var5 = param0 - 1; 0 <= var5; var5--) {
            if ((1 & var4_int) > 0) {
              this.flags[var5] = true;
              var4_int--;
            }
            var4_int = var4_int >> 1;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_9_0 = var4;
          stackIn_9_1 = new StringBuilder().append("kpa.<init>(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw tba.wrapException((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final void set(int param0, int param1, boolean param2) {
        if (param1 != -17075) {
          return;
        }
        this.flags[param0] = param2;
    }

    final void setAll(boolean param0, int param1) {
        int var3 = 0;
        int var4 = TombRacer.field_G ? 1 : 0;
        for (var3 = 0; this.flags.length > var3; var3++) {
          this.flags[var3] = param0;
        }
        if (param1 < 62) {
          this.flags = (boolean[]) null;
        }
    }

    final boolean get(int param0, int param1) {
        if (param0 != 0) {
          FlagSet.releaseStatics(116);
        }
        return this.flags[param1];
    }

    final void encode(BitPacketBuffer param0, byte param1) {
        int var3_int = 0;
        int var4 = 0;
        int var5 = TombRacer.field_G ? 1 : 0;
        try {
          if (param1 > -113) {
            this.toString();
          }
          var3_int = 0;
          for (var4 = 0; this.flags.length > var4; var4++) {
            var3_int = var3_int << 1;
            if (this.flags[var4]) {
              var3_int++;
            }
          }
          param0.writeBits((byte) 112, var3_int, this.flags.length);
        } catch (RuntimeException runtimeException) {
          throw tba.wrapException((Throwable) ((Object) runtimeException), "kpa.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final String toString() {
        int var2 = 0;
        String var1;
        int var3;
        var3 = TombRacer.field_G ? 1 : 0;
        var1 = "flags:";
        for (var2 = 0; var2 < this.flags.length; var2++) {
          if (!this.flags[var2]) {
            var1 = var1 + "0";
          } else {
            var1 = var1 + "1";
          }
        }
        return var1;
    }

    public static void releaseStatics(int param0) {
        if (param0 <= 57) {
          field_b = (String) null;
        }
        field_d = null;
        field_b = null;
    }

    FlagSet(int param0) {
        this.flags = new boolean[param0];
    }

    static {
        field_b = "Shortcut Reference";
        field_c = false;
        field_d = "<%0> must play 1 more rated game before playing with the current options.";
    }
}
