/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class to {
    private int field_m;
    static java.math.BigInteger field_g;
    static int field_a;
    private int field_d;
    static String field_l;
    private ji field_c;
    static RgbSprite field_e;
    private DualLinkDeque field_j;
    static int[] field_f;
    static PcmStream primaryActivityLoop;
    static String field_h;
    static int field_b;
    static int field_i;

    final Object a(long param0, boolean param1) {
        sl var4 = (sl) (this.field_c.a(param0, 101));
        if (var4 == null) {
          return null;
        }
        Object var5 = var4.g(1);
        if (var5 == null) {
          var4.unlink((byte) 111);
          var4.unlinkSecondary(3);
          this.field_d = this.field_d + var4.field_u;
          return null;
        }
        if (!var4.b(param1)) {
          this.field_j.addLast(var4, (byte) -126);
          var4.secondaryKey = 0L;
          return var5;
        }
        ej var6 = new ej(var5, var4.field_u);
        this.field_c.a((byte) 44, var4.key, var6);
        this.field_j.addLast(var6, (byte) -119);
        ((sl) ((Object) var6)).secondaryKey = 0L;
        var4.unlink((byte) 111);
        var4.unlinkSecondary(3);
        return var5;
    }

    to(int param0) {
        this(param0, param0);
    }

    private final void a(long param0, int param1) {
        int var4 = -89 % ((-26 - param1) / 48);
        sl var5 = (sl) (this.field_c.a(param0, 121));
        this.a(false, var5);
    }

    private final void a(int param0, long param1, int param2, Object param3) {
        sl var6 = null;
        int var7 = BrickABrac.field_J ? 1 : 0;
        if (param2 > this.field_m) {
          throw new IllegalStateException();
        }
        this.a(param1, 38);
        this.field_d = this.field_d - param2;
        while (this.field_d < 0) {
          var6 = (sl) (this.field_j.removeFirst(false));
          this.a(false, var6);
        }
        ej var6_ref = new ej(param3, param2);
        this.field_c.a((byte) 79, param1, var6_ref);
        this.field_j.addLast(var6_ref, (byte) -123);
        if (param0 != -1) {
          return;
        }
        try {
          ((sl) ((Object) var6_ref)).secondaryKey = 0L;
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "to.C(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(int param0) {
        field_e = null;
        primaryActivityLoop = null;
        int var1 = 77 / ((-29 - param0) / 44);
        field_l = null;
        field_h = null;
        field_f = null;
        field_g = null;
    }

    final void a(int param0, Object param1, long param2) {
        try {
          this.a(-1, param2, 1, param1);
          if (param0 < 60) {
            this.a(35L, -69);
          }
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "to.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static void a(boolean param0, int param1) {
        if (param1 > -127) {
          field_f = (int[]) null;
          ma.field_I.a(param0, 20892);
          return;
        }
        ma.field_I.a(param0, 20892);
    }

    private final void a(boolean param0, sl param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0) {
            field_i = -88;
          }
          if (param1 == null) {
            return;
          }
          param1.unlink((byte) 111);
          param1.unlinkSecondary(3);
          this.field_d = this.field_d + param1.field_u;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("to.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    private to(int param0, int param1) {
        int var3;
        this.field_j = new DualLinkDeque();
        this.field_m = param0;
        this.field_d = param0;
        var3 = 1;
        while (true) {
          if (var3 + var3 >= param0) {
            this.field_c = new ji(var3);
            return;
          }
          if (param1 > var3) {
            var3 = var3 + var3;
            continue;
          }
          break;
        }
        this.field_c = new ji(var3);
        return;
    }

    static {
        field_a = 2;
        field_g = new java.math.BigInteger("6757747274818513864204534133465045479284128469717186816691454417744823753827902036844748836683348383638677747113757906301249837209713747402067689777172847");
        field_h = "<%0> is not on your ignore list.";
        field_l = "Email is valid";
        field_f = new int[29];
        field_f[3] = 5;
        field_f[15] = 2;
        field_f[22] = -1;
        field_f[27] = -1;
        field_f[14] = 5;
        field_f[26] = -1;
        field_f[20] = -1;
        field_f[0] = -1;
        field_f[28] = -1;
        field_f[13] = 2;
        field_f[1] = -1;
        field_f[21] = -1;
        field_f[8] = 2;
        field_f[7] = 2;
        field_f[6] = 5;
        field_f[23] = -1;
        field_f[4] = 5;
        field_f[18] = 10;
        field_f[2] = -1;
        field_f[9] = 2;
        field_f[24] = -1;
        field_f[25] = -1;
        field_f[16] = 5;
        field_f[12] = 10;
        field_f[17] = 2;
        field_f[10] = 5;
        field_f[19] = -1;
        field_f[11] = 2;
        field_f[5] = 10;
        field_i = 0;
    }
}
