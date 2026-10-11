/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bo {
    private int[] field_e;
    private int[] field_f;
    private int[] field_a;
    private int[] field_h;
    static String field_c;
    private int[] field_d;
    static RgbSprite field_b;
    static int[] field_g;

    final int a(byte param0, int param1) {
        int var3 = -102 / ((param0 - 44) / 42);
        return this.field_d[param1] + (-640 + so.field_b.field_a >> 1);
    }

    final int a(int param0, byte param1) {
        if (param1 <= -100) {
          return this.field_h[param0] + (so.field_b.field_g - 480 >> 1);
        }
        field_c = (String) null;
        return this.field_h[param0] + (so.field_b.field_g - 480 >> 1);
    }

    final void b(int param0, int param1, int param2) {
        int var4 = 120 / ((param0 + 93) / 33);
        this.field_d[param2] = this.field_d[param2] + (param1 - this.a((byte) -125, param2));
    }

    final void a(int param0, int param1, byte param2, int param3, int param4, int param5, int param6) {
        this.field_a[param6] = param4;
        this.field_d[param6] = param0;
        this.field_h[param6] = param3;
        this.field_f[param6] = param5;
        this.field_e[param6] = param1;
        if (param2 != 18) {
          this.a(-45, 80, (byte) -101, -37, -18, -104, -117);
        }
    }

    final int b(int param0, int param1) {
        if (param1 == 29) {
          return (-640 + so.field_b.field_a >> 1) + this.field_a[param0];
        }
        PacketBuffer var4 = (PacketBuffer) null;
        bo.a(-13, (PacketBuffer) null, 83);
        return (-640 + so.field_b.field_a >> 1) + this.field_a[param0];
    }

    final void a(int param0, int param1, int param2) {
        if (param0 == -1) {
          this.field_a[param2] = this.field_a[param2] + (-this.b(param2, 29) + param1);
          return;
        }
    }

    final static ik a(int param0, PacketBuffer param1, int param2) {
        al stackIn_16_0 = null;
        ra stackIn_21_0 = null;
        al stackIn_23_0 = null;
        wa stackIn_25_0 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        PacketBuffer var6 = null;
        var5 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (param2 != 4368051) {
            var6 = (PacketBuffer) null;
            bo.a(-35, (PacketBuffer) null, 62);
          }
          var3_int = param1.e((byte) -104);
          var4 = uc.spellDefinitions[var3_int][3];
          if (var4 == 4) {
            stackIn_16_0 = new al(var3_int);
            return (ik) ((Object) stackIn_16_0);
          }
          if (var4 != 0 &&
            var4 != 1 &&
            var4 != 2 &&
            8 != var4 &&
            3 != var4 &&
            var4 != 5 &&
            6 != var4 &&
            7 != var4) {
            return null;
          }
          if (uc.spellDefinitions[var3_int][4] != 5) {
            stackIn_25_0 = new wa(var3_int, param1.k(param2 ^ 4368051), param1.k(0));
            return (ik) ((Object) stackIn_25_0);
          }
          if (param0 > -1) {
            stackIn_21_0 = new ra(var3_int, new am(param1, param0));
            return (ik) ((Object) stackIn_21_0);
          }
          stackIn_23_0 = new al(var3_int);
          return (ik) ((Object) stackIn_23_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_29_0 = var3;
          stackIn_29_1 = new StringBuilder().append("bo.J(").append(param0).append(',');
          if (param1 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_29_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',').append(param2).append(')').toString());
        }
    }

    public static void a(int param0) {
        if (param0 == 4368051) {
          field_g = null;
          field_c = null;
          field_b = null;
          return;
        }
        bo.a(false);
        field_g = null;
        field_c = null;
        field_b = null;
    }

    final int b(int param0, byte param1) {
        int var3 = -53 % ((45 - param1) / 61);
        return this.field_f[param0];
    }

    final void a(int param0, int param1, byte param2) {
        if (param2 > 118) {
          this.field_h[param1] = this.field_h[param1] + (param0 - this.a(param1, (byte) -108));
          return;
        }
        this.field_e = (int[]) null;
        this.field_h[param1] = this.field_h[param1] + (param0 - this.a(param1, (byte) -108));
    }

    final static void a(boolean param0) {
        tp.field_e = new NodeDeque();
        if (!param0) {
          field_b = (RgbSprite) null;
        }
    }

    final int a(int param0, int param1) {
        if (param0 == -6) {
          return (so.field_b.field_g - 480 >> 1) + this.field_e[param1];
        }
        this.b(-40, 11, -54);
        return (so.field_b.field_g - 480 >> 1) + this.field_e[param1];
    }

    bo() {
        this.field_a = new int[29];
        this.field_f = new int[29];
        this.field_h = new int[29];
        this.field_e = new int[29];
        this.field_d = new int[29];
    }

    static {
        field_c = "<%0> / <%1> (+<%2>) - Victory in <%3> turns";
        field_g = new int[]{12303291, 740023, 12521488, 8495921, 4368051, 5132314, 10573849};
    }
}
