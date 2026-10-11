/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ma extends fn implements eg {
    static boolean field_Z;
    private int field_W;
    private n field_bb;
    static String field_Y;
    static String field_X;
    static long field_ab;

    final void d(byte param0) {
        if (param0 >= -114) {
          this.a(-106);
        }
        super.d((byte) -117);
        if (null != this.field_bb) {
          this.field_bb.a(124);
        }
    }

    final String h(int param0) {
        if (!this.field_t) {
          return null;
        }
        if (this.field_s == null) {
          return null;
        }
        ip.a(ko.field_b, this.field_l - this.field_W + sm.field_d, (byte) 113);
        if (param0 != 21384) {
          return (String) null;
        }
        return this.field_s;
    }

    final static ls[] a(int param0, hd param1) {
        int var5 = 0;
        ls[] stackIn_3_0 = null;
        ls[] stackIn_9_0 = null;
        ls[] stackIn_16_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int[] var3 = null;
        ls[] var4 = null;
        ls var6 = null;
        int var7 = 0;
        wo var8 = null;
        int[] var9 = null;
        int[] var10 = null;
        var7 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (!param1.b(false)) {
            stackIn_3_0 = new ls[]{};
            return stackIn_3_0;
          }
          var8 = param1.b(-20681);
          while (0 == var8.field_g) {
            nu.a(10L, 0);
          }
          if (2 == var8.field_g) {
            stackIn_9_0 = new ls[]{};
            return stackIn_9_0;
          }
          var10 = (int[]) (var8.field_f);
          var9 = var10;
          var3 = var9;
          var4 = new ls[var10.length >> 2];
          if (param0 >= -3) {
            field_X = (String) null;
          }
          for (var5 = 0; var5 < var4.length; var5++) {
            var6 = new ls();
            var4[var5] = var6;
            var6.field_b = var3[var5 << 2];
            var6.field_a = var3[(var5 << 2) + 1];
            var6.field_f = var3[(var5 << 2) + 2];
            var6.field_e = var3[(var5 << 2) + 3];
          }
          stackIn_16_0 = var4;
          return stackIn_16_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_19_0 = var2;
          stackIn_19_1 = new StringBuilder().append("ma.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
        }
    }

    public final n a(int param0) {
        if (param0 != -918933630) {
          this.a(-10);
        }
        return this.field_bb;
    }

    final static int a(int param0, int param1, int param2, int param3) {
        if (param1 != 3) {
          ma.a(71, -15, 73, 84);
        }
        return ((param2 & 1) == 0 ? param0 : -param0) + ((param2 & 2) != 0 ? -param3 : param3);
    }

    ma(String param0, qo param1, int param2) {
        super(param0, param1, param2);
    }

    final void a(byte param0, n param1) {
        try {
          this.field_bb = param1;
          if (param0 != 16) {
            n var4 = (n) null;
            this.a((byte) -62, (n) null);
          }
        } catch (RuntimeException runtimeException) {
          throw ig.a((Throwable) ((Object) runtimeException), "ma.G(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, int param1, int param2, kb param3) {
        try {
          if (param0 != 32722) {
            this.field_W = 103;
          }
          super.a(param0 + 0, param1, param2, param3);
          this.field_W = sm.field_d - this.field_B - param1;
        } catch (RuntimeException runtimeException) {
          throw ig.a((Throwable) ((Object) runtimeException), "ma.P(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    public static void g(byte param0) {
        field_X = null;
        field_Y = null;
        int var1 = 21 % ((param0 + 67) / 48);
    }

    static {
        field_Y = "Units";
        field_X = "Items that can be given to units to improve their abilities in battle.";
        field_Z = true;
    }
}
