/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dd {
    private vo field_b;
    private java.math.BigInteger field_h;
    static String field_g;
    static RgbSprite field_k;
    private bm[] field_i;
    private bp field_d;
    private jf field_c;
    private PacketBuffer field_f;
    private java.math.BigInteger field_j;
    static boolean field_a;
    static int field_e;

    final bm a(boolean param0, bc param1, int param2, int param3, bc param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        bm var9 = null;
        byte[] var13 = null;
        bm stackIn_8_0 = null;
        bm stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (null == this.field_f) {
            throw new RuntimeException();
          }
          if (param2 >= 0 &&
            this.field_i.length > param2) {
            if (this.field_i[param2] != null) {
              stackIn_8_0 = this.field_i[param2];
              return stackIn_8_0;
            }
            this.field_f.position = 72 * param2 + 6;
            var6_int = this.field_f.i(1);
            var7 = this.field_f.i(1);
            var13 = new byte[64];
            this.field_f.a(param3, 64, 0, var13);
            var9 = new bm(param2, param1, param4, this.field_d, this.field_b, var6_int, var13, var7, param0);
            this.field_i[param2] = var9;
            stackIn_10_0 = var9;
            return stackIn_10_0;
          }
          throw new RuntimeException();
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_13_0 = var6;
          stackIn_13_1 = new StringBuilder().append("dd.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    final static String a(int param0, int param1) {
        if (param1 != 82) {
          return (String) null;
        }
        if (param0 < 10000) {
          return Integer.toString(param0);
        }
        if (param0 < 1000000) {
          return Integer.toString(param0 / 1000) + "K";
        }
        if (param0 < 1000000000) {
          return Integer.toString(param0 / 1000000) + "M";
        }
        return "A Billion";
    }

    final static int a(boolean param0) {
        if (f.field_E < 2) {
          return 0;
        }
        if (param0) {
          field_a = false;
        }
        if (0 == og.field_m) {
          if (!ps.field_u.a((byte) 82)) {
            return 20;
          }
          if (!ps.field_u.a(28979, "commonui")) {
            return 40;
          }
          if (!sk.field_M.a((byte) 82)) {
            return 50;
          }
          if (!sk.field_M.a(28979, "commonui")) {
            return 60;
          }
          if (!h.field_g.a((byte) 82)) {
            return 70;
          }
          if (!h.field_g.d(-27927)) {
            return 80;
          }
        } else {
          if (nf.field_Nb != null) {
            if (!nf.field_Nb.a((byte) 82)) {
              return 14;
            }
            if (!nf.field_Nb.a((byte) -128, "")) {
              return 29;
            }
            if (!nf.field_Nb.a(28979, "")) {
              return 29;
            }
          }
          if (!ps.field_u.a((byte) 82)) {
            return 43;
          }
          if (!ps.field_u.a(28979, "commonui")) {
            return 57;
          }
          if (!sk.field_M.a((byte) 82)) {
            return 71;
          }
          if (!sk.field_M.a(28979, "commonui")) {
            return 80;
          }
          if (!h.field_g.a((byte) 82)) {
            return 82;
          }
          if (!h.field_g.d(-27927)) {
            return 86;
          }
        }
        return 100;
    }

    final void a(int param0) {
        int var2;
        int var3;
        int var4;
        int var2Lifetime1;
        var3 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        if (this.field_i == null) {
          return;
        }
        for (var2 = 0; this.field_i.length > var2; var2++) {
          if (null != this.field_i[var2]) {
            this.field_i[var2].d(-71);
          }
        }
        if (param0 != 18199) {
          dd.b(30);
        }
        var4 = 0;
        var2Lifetime1 = var4;
        while (var4 < this.field_i.length) {
          if (this.field_i[var4] != null) {
            this.field_i[var4].b(-26132);
          }
          var4++;
        }
        return;
    }

    dd(bp param0, vo param1) {
        this(param0, param1, (java.math.BigInteger) null, (java.math.BigInteger) null);
    }

    public static void b(int param0) {
        if (param0 > -9) {
          return;
        }
        field_k = null;
        field_g = null;
    }

    final boolean a(byte param0) {
        int var7 = 0;
        int var3;
        byte[] var4;
        byte[] var5;
        java.math.BigInteger var7_ref_java_math_BigInteger;
        int var8;
        PacketBuffer var10;
        byte[] var11;
        java.math.BigInteger var12;
        byte[] var13;
        byte[] var15;
        var8 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        if (null != this.field_f) {
          return true;
        }
        if (null == this.field_c) {
          if (this.field_d.d(param0 + 86)) {
            return false;
          }
          this.field_c = this.field_d.a(255, false, 255, (byte) 0, true);
        }
        if (this.field_c.field_x) {
          return false;
        }
        var10 = new PacketBuffer(this.field_c.d((byte) 43));
        if (param0 != 14) {
          return true;
        }
        var10.position = 5;
        var3 = var10.k(0);
        var10.position = var10.position + var3 * 72;
        var13 = new byte[var10.payload.length - var10.position];
        var11 = var13;
        var4 = var11;
        var10.a(0, var13.length, 0, var13);
        if (null != this.field_h &&
          null != this.field_j) {
          var12 = new java.math.BigInteger(var13);
          var7_ref_java_math_BigInteger = var12.modPow(this.field_h, this.field_j);
          var5 = var7_ref_java_math_BigInteger.toByteArray();
        } else {
          var5 = var4;
        }
        if (var5.length != 65) {
          throw new RuntimeException();
        }
        var15 = ua.a(-18423, -5 + (var10.position - var13.length), var10.payload, 5);
        for (var7 = 0; var7 < 64; var7++) {
          if (var5[1 + var7] != var15[var7]) {
            throw new RuntimeException();
          }
        }
        this.field_i = new bm[var3];
        this.field_f = var10;
        return true;
    }

    private dd(bp param0, vo param1, java.math.BigInteger param2, java.math.BigInteger param3) {
        try {
          this.field_d = param0;
          this.field_b = param1;
          this.field_h = param2;
          this.field_j = param3;
          if (!this.field_d.d(119)) {
            this.field_c = this.field_d.a(255, false, 255, (byte) 0, true);
          }
        } catch (RuntimeException runtimeException) {
          throw ig.a((Throwable) ((Object) runtimeException), "dd.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_g = "Equipment";
        field_e = 0;
    }
}
