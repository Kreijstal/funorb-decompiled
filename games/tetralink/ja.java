/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ja implements m {
    static String field_d;
    static int field_g;
    static volatile boolean field_h;
    static int field_a;
    private ah field_c;
    static oh field_i;
    static int field_f;
    static String field_e;
    static int[] field_l;
    private jn[] field_b;
    static String field_k;
    static int field_j;

    public final int b(int param0, int param1) {
        if (param0 != 6092) {
          ja.a((byte) -102);
        }
        if (null == this.field_b[param1]) {
          return 0;
        }
        return this.field_b[param1].field_b;
    }

    final static int c(int param0, int param1) {
        int var2;
        var2 = 0;
        if (param1 < 0 ||
          65536 <= param1) {
          param1 = param1 >>> 16;
          var2 += 16;
        }
        if (param1 >= 256) {
          var2 += 8;
          param1 = param1 >>> 8;
        }
        if (param1 >= 16) {
          var2 += 4;
          param1 = param1 >>> 4;
        }
        if (param0 != -7422) {
          ja.b(false, 94);
        }
        if (4 <= param1) {
          param1 = param1 >>> 2;
          var2 += 2;
        }
        if (param1 >= 1) {
          param1 = param1 >>> 1;
          var2++;
        }
        return var2 + param1;
    }

    final static boolean b(boolean param0, int param1) {
        if (param0) {
          return true;
        }
        return 2 == param1 ? true : false;
    }

    private final void a(byte param0, jn param1, float param2) {
        kh var10 = null;
        byte[] var16 = null;
        int[] var13 = null;
        int[] var11 = null;
        int[] var6 = null;
        int var9 = 0;
        int var7 = 0;
        int var8 = TetraLink.field_J;
        int var7Lifetime1;
        try {
          var10 = hd.a(param0 - 5, param1.field_e, this.field_c);
          var10.a();
          var16 = var10.field_o;
          var13 = var10.field_p;
          var11 = var13;
          var6 = var11;
          for (var7 = 0; var7 < var13.length; var7++) {
            var6[var7] = oa.a(var13[var7], (double)param2, (byte) 45);
          }
          param1.field_c = new int[16384];
          if (128 != var10.field_b) {
            throw new RuntimeException();
          }
          var9 = 0;
          var7Lifetime1 = var9;
          while (16384 > var9) {
            param1.field_c[var9] = var6[pl.a(255, (int) var16[var9])];
            var9++;
          }
          if (param0 != 6) {
            ja.a((byte) 125);
          }
          param1.field_f = param2;
        } catch (RuntimeException runtimeException) {
          throw oi.a((Throwable) ((Object) runtimeException), "ja.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    public static void a(byte param0) {
        field_k = null;
        field_l = null;
        field_e = null;
        field_d = null;
        if (param0 < 57) {
          return;
        }
        field_i = null;
    }

    public final boolean a(boolean param0, int param1) {
        if (!param0) {
          this.field_c = (ah) null;
          return true;
        }
        return true;
    }

    final static void a(int param0) {
        if (ch.field_q != null) {
          ch.field_q.b();
        }
        if (null != hc.field_v) {
          hc.field_v.b();
        }
        if (param0 != 0) {
          ja.c(104, -23);
        }
    }

    public final int a(int param0, int param1) {
        if (param1 != 0) {
          field_f = 67;
          return 0;
        }
        return 0;
    }

    public final boolean a(byte param0, int param1) {
        if (param0 != -37) {
          return false;
        }
        return false;
    }

    ja(ah param0, ah param1) {
        int var5 = 0;
        int[] var3 = null;
        int var4 = 0;
        bh var6 = null;
        int[] var8 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          this.field_c = param1;
          var8 = param0.c(0, 0);
          var3 = var8;
          var4 = var8.length;
          this.field_b = new jn[param0.b(-23126, 0)];
          for (var5 = 0; var5 < var4; var5++) {
            var6 = new bh(param0.a(50, var8[var5], 0));
            this.field_b[var8[var5]] = new jn(var6);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_7_0 = var3_ref;
          stackIn_7_1 = new StringBuilder().append("ja.<init>(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    public final int[] a(float param0, int param1, boolean param2) {
        int var8 = 0;
        int[] var5;
        int var6;
        int var7;
        int var9;
        int var10;
        int var11;
        jn var12;
        int[] var13;
        int[] var14;
        var11 = TetraLink.field_J;
        var12 = this.field_b[param1];
        if (var12 == null) {
          return null;
        }
        if (var12.field_f != param0) {
          var12.field_c = null;
        }
        if (null == var12.field_c) {
          this.a((byte) 6, var12, param0);
        }
        if (5 == param1) {
          return var12.field_c;
        }
        if (!param2) {
          ja.a((byte) 74);
        }
        var14 = cc.field_a.field_C;
        var13 = var14;
        var5 = var13;
        var6 = dh.field_e + ui.a(16, 1692) & 127;
        rd.a(var12.field_c, 0, var5, var6 * 128, -(128 * var6) + 16384);
        rd.a(var12.field_c, 128 * (-var6 + 128), var14, 0, 128 * var6);
        var7 = (3 * param1 + 17) * dh.field_e & 255;
        if (var7 < 128) {
          var7 = var7 >> 2;
        }
        for (var8 = 0; var8 < 16384; var8++) {
          var9 = var14[var8];
          var10 = var9 & 65280;
          var10 = var7 * var10 & 16711680;
          var9 = var9 & 16711935;
          var9 = -16711936 & var9 * var7;
          var5[var8] = mc.a(var9, var10) >>> 8;
        }
        return var5;
    }

    static {
        field_d = "Error connecting to server. Please try using a different server.";
        field_a = 64;
        field_f = 360;
        field_k = "Day";
        field_h = true;
        field_e = "Mute this player for 48 hours";
    }
}
