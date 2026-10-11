/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class co {
    static RgbSprite[] field_d;
    private cm field_e;
    private cm field_b;
    static SceneWidget field_c;
    static long field_f;
    private nc field_a;

    final static boolean a(boolean param0) {
        if (param0) {
          return false;
        }
        if (ln.field_h) {
          if (df.field_I) {
            return true;
          }
          return ni.b(56) ? true : false;
        }
        if (!ni.b(56)) {
          return false;
        }
        return true;
    }

    public static void a(byte param0) {
        field_c = null;
        field_d = null;
        if (param0 != -13) {
          field_f = -49L;
        }
    }

    final mn a(byte param0, int param1) {
        mn var3;
        byte[] var4;
        mn var3Lifetime1;
        var3 = (mn) (this.field_a.a((long)param1, -100));
        if (var3 != null) {
          return var3;
        }
        if (param1 >= 32768) {
          var4 = this.field_e.a(0, (byte) 126, param1 & 32767);
        } else {
          var4 = this.field_b.a(0, (byte) 40, param1);
        }
        if (param0 != -13) {
          return (mn) null;
        }
        var3Lifetime1 = new mn();
        if (var4 != null) {
          var3Lifetime1.a(106, new PacketBuffer(var4));
        }
        if (param1 >= 32768) {
          var3Lifetime1.c((byte) -3);
        }
        this.field_a.a((long)param1, var3Lifetime1, 1);
        return var3Lifetime1;
    }

    final static byte[] a(byte param0, int param1, int param2, byte[] param3) {
        int var5_int = 0;
        byte[] var4 = null;
        int var7 = 0;
        byte[] var8 = null;
        byte[] stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4_ref = null;
        ig var5 = null;
        byte[] var6 = null;
        var7 = SteelSentinels.obfuscationControl;
        try {
          if (param0 != -37) {
            co.a((byte) -53);
          }
          if (param2 > 0) {
            var8 = new byte[param1];
            var4 = var8;
            for (var5_int = 0; param1 > var5_int; var5_int++) {
              var8[var5_int] = param3[param2 + var5_int];
            }
          } else {
            var4 = param3;
          }
          var5 = new ig();
          var5.a(-635160440);
          var5.a((byte) 90, (long)(8 * param1), var4);
          var6 = new byte[64];
          var5.a(var6, true, 0);
          stackIn_9_0 = var6;
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_12_0 = var4_ref;
          stackIn_12_1 = new StringBuilder().append("co.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    co(int param0, cm param1, cm param2) {
        RuntimeException var4 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        this.field_a = new nc(64);
        try {
          this.field_b = param1;
          this.field_e = param2;
          if (this.field_b != null) {
            this.field_b.a(true, 0);
          }
          if (null == this.field_e) {
            return;
          }
          this.field_e.a(true, 0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_8_0 = var4;
          stackIn_8_1 = new StringBuilder().append("co.<init>(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',');
          if (param2 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    static {
    }
}
