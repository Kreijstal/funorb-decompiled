/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class je {
    private ec field_n;
    private em field_m;
    static int[] field_d;
    private java.math.BigInteger field_j;
    private cc field_g;
    static String[] field_f;
    private ti[] field_k;
    private bb field_h;
    static String field_l;
    static int field_i;
    private java.math.BigInteger field_e;
    static int field_b;
    static mb field_c;
    static String field_a;

    final static o a(int param0, cf[] param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        o stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_int = oi.b(param0, param1.length);
          stackIn_1_0 = gd.a(64, param1[var2_int]);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_4_0 = var2;
          stackIn_4_1 = new StringBuilder().append("je.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(')').toString());
        }
    }

    final void a(byte param0) {
        int var2;
        int var3;
        int var4;
        int var2Lifetime1;
        var3 = DungeonAssault.field_K;
        if (this.field_k == null) {
          return;
        }
        for (var2 = 0; var2 < this.field_k.length; var2++) {
          if (null != this.field_k[var2]) {
            this.field_k[var2].b(false);
          }
        }
        if (param0 <= 46) {
          return;
        }
        var4 = 0;
        var2Lifetime1 = var4;
        while (this.field_k.length > var4) {
          if (this.field_k[var4] != null) {
            this.field_k[var4].c(-10790);
          }
          var4++;
        }
        return;
    }

    public static void a(boolean param0) {
        field_d = null;
        field_l = null;
        if (!param0) {
          field_c = (mb) null;
        }
        field_c = null;
        field_a = null;
        field_f = null;
    }

    final boolean b(byte param0) {
        int var7 = 0;
        int var3;
        byte[] var4;
        byte[] var5;
        java.math.BigInteger var7_ref_java_math_BigInteger;
        int var8;
        ec var10;
        byte[] var11;
        java.math.BigInteger var12;
        byte[] var13;
        byte[] var15;
        var8 = DungeonAssault.field_K;
        if (null != this.field_n) {
          return true;
        }
        if (null == this.field_m) {
          if (this.field_h.b(-21431)) {
            return false;
          }
          this.field_m = this.field_h.a(true, 255, (byte) 0, 255, (byte) 69);
        }
        if (param0 != 113) {
          return true;
        }
        if (this.field_m.field_v) {
          return false;
        }
        var10 = new ec(this.field_m.b(true));
        var10.field_o = 5;
        var3 = var10.c(true);
        var10.field_o = var10.field_o + 72 * var3;
        var13 = new byte[-var10.field_o + var10.field_m.length];
        var11 = var13;
        var4 = var11;
        var10.a((byte) -105, 0, var13.length, var13);
        if (null != this.field_j &&
          this.field_e != null) {
          var12 = new java.math.BigInteger(var13);
          var7_ref_java_math_BigInteger = var12.modPow(this.field_j, this.field_e);
          var5 = var7_ref_java_math_BigInteger.toByteArray();
        } else {
          var5 = var4;
        }
        if (65 != var5.length) {
          throw new RuntimeException();
        }
        var15 = rn.a(-5 + (var10.field_o - var13.length), 5, 8, var10.field_m);
        for (var7 = 0; var7 < 64; var7++) {
          if (var5[var7 + 1] != var15[var7]) {
            throw new RuntimeException();
          }
        }
        this.field_k = new ti[var3];
        this.field_n = var10;
        return true;
    }

    final ti a(boolean param0, int param1, int param2, ln param3, ln param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        ti var9 = null;
        byte[] var13 = null;
        ti stackIn_9_0 = null;
        ti stackIn_12_0 = null;
        ti stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (null == this.field_n) {
            throw new RuntimeException();
          }
          if (0 <= param2 &&
            param2 < this.field_k.length) {
            if (null != this.field_k[param2]) {
              stackIn_9_0 = this.field_k[param2];
              return stackIn_9_0;
            }
            this.field_n.field_o = 6 + 72 * param2;
            var6_int = this.field_n.h(-31);
            var7 = this.field_n.h(-54);
            var13 = new byte[64];
            this.field_n.a((byte) -117, 0, 64, var13);
            var9 = new ti(param2, param4, param3, this.field_h, this.field_g, var6_int, var13, var7, param0);
            this.field_k[param2] = var9;
            if (param1 == 4210752) {
              stackIn_14_0 = var9;
              return stackIn_14_0;
            }
            stackIn_12_0 = (ti) null;
            return stackIn_12_0;
          }
          throw new RuntimeException();
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_17_0 = var6;
          stackIn_17_1 = new StringBuilder().append("je.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',');
          if (param4 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    je(bb param0, cc param1) {
        this(param0, param1, (java.math.BigInteger) null, (java.math.BigInteger) null);
    }

    final static void a(byte param0, int param1, int param2, cn param3, int param4, int param5) {
        int var6_int = 0;
        int var7 = 0;
        int var8 = DungeonAssault.field_K;
        jh.c();
        gf.e(param4, param2, param4 + param5, param1 + param2);
        for (var6_int = param2; var6_int < param1 + param2; var6_int = var6_int + param3.field_v) {
          for (var7 = param4; var7 < param5 + param4; var7 = var7 + param3.field_y) {
            param3.h(var7, var6_int);
          }
        }
        if (param0 >= -83) {
          return;
        }
        try {
          jh.b();
        } catch (RuntimeException runtimeException) {
          throw vk.a((Throwable) ((Object) runtimeException), "je.E(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ')');
        }
    }

    private je(bb param0, cc param1, java.math.BigInteger param2, java.math.BigInteger param3) {
        try {
          this.field_h = param0;
          this.field_g = param1;
          this.field_j = param2;
          this.field_e = param3;
          if (!this.field_h.b(-21431)) {
            this.field_m = this.field_h.a(true, 255, (byte) 0, 255, (byte) 91);
          }
        } catch (RuntimeException runtimeException) {
          throw vk.a((Throwable) ((Object) runtimeException), "je.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_d = new int[]{4210752, 16711680, 16711680, 255, 65280};
        field_l = "EXCLUSIVE";
        field_f = new String[]{null, "Different raiders are better suited for different types of obstacles within the dungeon. Some are good at disarming <%traps>, others at fighting <%monsters>."};
        field_a = "(Including <%0>)";
        field_i = 0;
    }
}
