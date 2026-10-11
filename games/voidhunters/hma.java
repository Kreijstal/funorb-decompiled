/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hma {
    private int field_b;
    private boolean field_e;
    private int field_a;
    private int[] field_c;
    static int[] field_d;

    public static void a(int param0) {
        field_d = null;
        if (param0 != -1) {
          field_d = (int[]) null;
        }
    }

    final void a(byte param0, int param1) {
        this.a(this.field_a + 1, -15220, param1);
        if (param0 >= -66) {
          field_d = (int[]) null;
        }
    }

    final static phb[] a(String param0, int param1, asb param2, String param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        phb[] stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_int = param2.b(param0, -112);
          var6 = -104 / ((-47 - param1) / 40);
          var5 = param2.a(true, var4_int, param3);
          stackIn_1_0 = dmb.a(var5, (byte) 75, param2, var4_int);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_4_0 = var4;
          stackIn_4_1 = new StringBuilder().append("hma.G(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param3 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    private final int a(int param0, int param1) {
        int var3;
        int var4;
        var4 = VoidHunters.field_G;
        var3 = this.field_c.length;
        while (param1 >= var3) {
          if (!this.field_e) {
            var3 = var3 + this.field_b;
            continue;
          }
          if (var3 == 0) {
            var3 = 1;
            continue;
          }
          var3 = var3 * this.field_b;
        }
        if (param0 == 0) {
          return var3;
        }
        this.field_a = 102;
        return var3;
    }

    private final void b(byte param0, int param1) {
        int[] var4 = null;
        int[] var3 = null;
        int[] var4Lifetime1;
        int[] var3Lifetime1;
        if (param0 > 110) {
          var4 = new int[this.a(0, param1)];
          var3 = var4;
          cua.a(this.field_c, 0, var4, 0, this.field_c.length);
          this.field_c = var4;
          return;
        }
        field_d = (int[]) null;
        var4Lifetime1 = new int[this.a(0, param1)];
        var3Lifetime1 = var4Lifetime1;
        cua.a(this.field_c, 0, var4Lifetime1, 0, this.field_c.length);
        this.field_c = var4Lifetime1;
    }

    final int b(int param0, byte param1) {
        if (param0 > this.field_a) {
          throw new ArrayIndexOutOfBoundsException(param0);
        }
        if (param1 == 106) {
          return this.field_c[param0];
        }
        return -67;
    }

    final void a(int param0, byte param1) {
        if (param0 < 0) {
          throw new ArrayIndexOutOfBoundsException(param0);
        }
        if (param0 > this.field_a) {
          throw new ArrayIndexOutOfBoundsException(param0);
        }
        if (param1 == 70) {
          if (param0 != this.field_a) {
            cua.a(this.field_c, 1 + param0, this.field_c, param0, this.field_a - param0);
          }
          this.field_a = this.field_a - 1;
          return;
        }
    }

    final int a(byte param0) {
        int var2 = -107 / ((param0 + 16) / 43);
        return 1 + this.field_a;
    }

    private final void a(int param0, int param1, int param2) {
        if (param0 > this.field_a) {
          this.field_a = param0;
        }
        if (param1 != -15220) {
          return;
        }
        if (param0 < this.field_c.length) {
          this.field_c[param0] = param2;
          return;
        }
        this.b((byte) 116, param0);
        this.field_c[param0] = param2;
    }

    private hma() throws Throwable {
        throw new Error();
    }

    static {
    }
}
