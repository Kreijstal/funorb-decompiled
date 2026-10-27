/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sk {
    private java.math.BigInteger field_c;
    static la field_d;
    private hk[] field_e;
    private PacketBuffer field_b;
    private s field_h;
    private kk field_a;
    private sb field_f;
    private java.math.BigInteger field_g;

    public static void b(boolean param0) {
        if (!param0) {
          field_d = (la) null;
          field_d = null;
          return;
        }
        field_d = null;
    }

    final void a(byte param0) {
        int var3 = EscapeVector.obfuscationControl;
        if (this.field_e == null) {
          return;
        }
        for (int var2 = 0; this.field_e.length > var2; var2++) {
          if (null != this.field_e[var2]) {
            this.field_e[var2].d(param0 - 13);
          }
        }
        int var4 = 0;
        int var2Lifetime1 = var4;
        while (this.field_e.length > var4) {
          if (this.field_e[var4] != null) {
            this.field_e[var4].c(-26);
          }
          var4++;
        }
        if (param0 == 12) {
          return;
        }
        this.a(false);
        return;
    }

    final hk a(boolean param0, int param1, jg param2, int param3, jg param4) {
        String stackIn_17_2 = null;
        String stackIn_20_2 = null;
        try {
          if (this.field_b == null) {
            throw new RuntimeException();
          }
          if (0 <= param3 &&
            param3 < this.field_e.length) {
            if (this.field_e[param3] != null) {
              hk stackIn_8_0 = this.field_e[param3];
              return stackIn_8_0;
            }
            this.field_b.position = 6 + param3 * 72;
            int var6_int = this.field_b.readInt(param1 ^ -4932);
            int var7 = this.field_b.readInt(-5053);
            byte[] var13 = new byte[64];
            this.field_b.a(var13, (byte) -96, 0, 64);
            hk var9 = new hk(param3, param4, param2, this.field_f, this.field_a, var6_int, var13, var7, param0);
            if (param1 != 255) {
              hk stackIn_11_0 = (hk) null;
              return stackIn_11_0;
            }
            this.field_e[param3] = var9;
            hk stackIn_13_0 = var9;
            return stackIn_13_0;
          }
          throw new RuntimeException();
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var6 = decompiledCaughtException;
          RuntimeException stackIn_16_0 = var6;
          StringBuilder stackIn_16_1 = new StringBuilder().append("sk.A(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          StringBuilder stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
        }
    }

    sk(sb param0, kk param1) {
        this(param0, param1, (java.math.BigInteger) null, (java.math.BigInteger) null);
    }

    final boolean a(boolean param0) {
        byte[] var5;
        int var8 = EscapeVector.obfuscationControl;
        if (null != this.field_b) {
          return true;
        }
        if (null == this.field_h) {
          if (this.field_f.c(20)) {
            return false;
          }
          this.field_h = this.field_f.a(255, true, (byte) 0, 255, (byte) 0);
        }
        if (this.field_h.field_u) {
          return false;
        }
        PacketBuffer var10 = new PacketBuffer(this.field_h.a(true));
        var10.position = 5;
        int var3 = var10.readUnsignedByte(0);
        var10.position = var10.position + 72 * var3;
        byte[] var13 = new byte[var10.payload.length - var10.position];
        byte[] var11 = var13;
        byte[] var4 = var11;
        var10.a(var4, (byte) -96, 0, var13.length);
        if (this.field_g == null) {
          var5 = var4;
        } else {
          if (null == this.field_c) {
            var5 = var4;
            if (65 != var5.length) {
              throw new RuntimeException();
            }
            if (param0) {
              return true;
            }
            byte[] var16 = vn.a(var10.payload, 5, -5 + (-var13.length + var10.position), 0);
            for (int var7 = 0; var7 < 64; var7++) {
              if (var5[1 + var7] != var16[var7]) {
                throw new RuntimeException();
              }
            }
            this.field_e = new hk[var3];
            this.field_b = var10;
            return true;
          }
          java.math.BigInteger var12 = new java.math.BigInteger(var13);
          java.math.BigInteger var7_ref_java_math_BigInteger = var12.modPow(this.field_g, this.field_c);
          var5 = var7_ref_java_math_BigInteger.toByteArray();
        }
        if (65 != var5.length) {
          throw new RuntimeException();
        }
        if (param0) {
          return true;
        }
        byte[] var17 = vn.a(var10.payload, 5, -5 + (-var13.length + var10.position), 0);
        for (int var7Lifetime1 = 0; var7Lifetime1 < 64; var7Lifetime1++) {
          if (var5[1 + var7Lifetime1] != var17[var7Lifetime1]) {
            throw new RuntimeException();
          }
        }
        this.field_e = new hk[var3];
        this.field_b = var10;
        return true;
    }

    private sk(sb param0, kk param1, java.math.BigInteger param2, java.math.BigInteger param3) {
        String stackIn_8_2 = null;
        String stackIn_11_2 = null;
        String stackIn_14_2 = null;
        String stackIn_17_2 = null;
        try {
          this.field_a = param1;
          this.field_f = param0;
          this.field_c = param3;
          this.field_g = param2;
          if (this.field_f.c(20)) {
            return;
          }
          this.field_h = this.field_f.a(255, true, (byte) 0, 255, (byte) 0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var5 = decompiledCaughtException;
          RuntimeException stackIn_7_0 = var5;
          StringBuilder stackIn_7_1 = new StringBuilder().append("sk.<init>(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          StringBuilder stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          StringBuilder stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          StringBuilder stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',');
          if (param3 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    static {
    }
}
