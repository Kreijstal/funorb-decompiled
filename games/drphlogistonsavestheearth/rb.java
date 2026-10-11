/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rb {
    static he[] field_c;
    private boolean field_b;
    static int[] field_e;
    private int field_a;
    private int field_f;
    private int[] field_d;

    final static boolean a(String param0, String param1, int param2) {
        String var3 = null;
        boolean stackIn_12_0 = false;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          var3 = vj.a(param0, -115);
          if (param1.indexOf(param0) == param2 &&
            -1 == param1.indexOf(var3)) {
            stackIn_12_0 = (param1.startsWith(param0)) || (param1.startsWith(var3)) || (param1.endsWith(param0)) || (param1.endsWith(var3));
            return stackIn_12_0;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_15_0 = var3_ref;
          stackIn_15_1 = new StringBuilder().append("rb.J(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',');
          if (param1 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param2).append(')').toString());
        }
    }

    final void d(int param0, int param1) {
        if (param0 >= -11) {
          this.d(-66, 80);
          if (param1 < 0) {
            throw new ArrayIndexOutOfBoundsException(param1);
          }
          if (param1 <= this.field_a) {
            if (param1 != this.field_a) {
              kg.a(this.field_d, 1 + param1, this.field_d, param1, -param1 + this.field_a);
            }
            this.field_a = this.field_a - 1;
            return;
          }
          throw new ArrayIndexOutOfBoundsException(param1);
        }
        if (param1 < 0) {
          throw new ArrayIndexOutOfBoundsException(param1);
        }
        if (param1 <= this.field_a) {
          if (param1 != this.field_a) {
            kg.a(this.field_d, 1 + param1, this.field_d, param1, -param1 + this.field_a);
          }
          this.field_a = this.field_a - 1;
          return;
        }
        throw new ArrayIndexOutOfBoundsException(param1);
    }

    final static void a(int param0, String[] param1, String param2, int param3) {
        String[] var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        String[] var6 = null;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          if (param3 != 105) {
            field_e = (int[]) null;
          }
          lc.field_h = wg.field_u;
          if (param0 == 255) {
            stackIn_7_0 = !(13 <= rd.field_z);
            kf.field_a = b.a(stackIn_7_0, 93);
            var6 = (String[]) null;
            pi.a(true, (String[]) null);
            return;
          }
          if (100 > param0) {
            kf.field_a = kj.a(param0, 4, param2);
            return;
          }
          if (param0 > 105) {
            kf.field_a = kj.a(param0, 4, param2);
            return;
          }
          var4 = param1;
          pi.a(true, var4);
          kf.field_a = sa.a((byte) 3, param1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_17_0 = var4_ref;
          stackIn_17_1 = new StringBuilder().append("rb.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',');
          if (param2 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param3).append(')').toString());
        }
    }

    final static void a(byte param0) {
        pi.field_Q = -1;
        em.field_c = false;
        dd.field_l = 0;
        ie.field_C = null;
        if (param0 != -102) {
          return;
        }
        oh.field_e = -1;
    }

    final void c(int param0, int param1) {
        int var3 = 69 % ((param1 - 69) / 56);
        this.a(21125, this.field_a + 1, param0);
    }

    private final int a(int param0, boolean param1) {
        int var3;
        int var4;
        var4 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        if (!param1) {
          return 83;
        }
        var3 = this.field_d.length;
        while (var3 <= param0) {
          if (!this.field_b) {
            var3 = var3 + this.field_f;
            continue;
          }
          if (var3 != 0) {
            var3 = var3 * this.field_f;
            continue;
          }
          var3 = 1;
        }
        return var3;
    }

    public static void a(int param0) {
        field_e = null;
        field_c = null;
        if (param0 != 0) {
          field_c = (he[]) null;
        }
    }

    private final void a(int param0, int param1) {
        int[] var4 = new int[this.a(param0, true)];
        int[] var3 = var4;
        if (param1 == -1) {
          kg.a(this.field_d, 0, var4, 0, this.field_d.length);
          this.field_d = var4;
          return;
        }
    }

    final int b(int param0, int param1) {
        if (this.field_a < param1) {
          throw new ArrayIndexOutOfBoundsException(param1);
        }
        if (param0 <= -30) {
          return this.field_d[param1];
        }
        this.d(-4, -55);
        return this.field_d[param1];
    }

    final int a(boolean param0) {
        if (param0) {
          this.a(true);
          return this.field_a + 1;
        }
        return this.field_a + 1;
    }

    private rb() throws Throwable {
        throw new Error();
    }

    private final void a(int param0, int param1, int param2) {
        String var5 = null;
        String var5Lifetime1;
        if (this.field_a < param1) {
          this.field_a = param1;
          if (param1 >= this.field_d.length) {
            this.a(param1, -1);
          }
          this.field_d[param1] = param2;
          if (param0 != 21125) {
            var5 = (String) null;
            rb.a((String) null, (String) null, -54);
            return;
          }
          return;
        }
        if (param1 >= this.field_d.length) {
          this.a(param1, -1);
        }
        this.field_d[param1] = param2;
        if (param0 == 21125) {
          return;
        }
        var5Lifetime1 = (String) null;
        rb.a((String) null, (String) null, -54);
    }

    static {
        field_e = new int[4];
    }
}
