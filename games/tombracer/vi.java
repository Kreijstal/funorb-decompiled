/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vi {
    private vna field_b;
    static int field_a;

    final void a(int param0) {
        if (param0 == 0) {
          this.field_b.d(param0 ^ 8);
          return;
        }
        tt var3 = (tt) null;
        this.a((byte) 62, (tt) null);
        this.field_b.d(param0 ^ 8);
    }

    final tt a(boolean param0) {
        if (!param0) {
          this.field_b = (vna) null;
          if (!this.field_b.d((byte) 14)) {
            return (tt) (this.field_b.c(-113));
          }
          return null;
        }
        if (!this.field_b.d((byte) 14)) {
          return (tt) (this.field_b.c(-113));
        }
        return null;
    }

    static long a(long param0, long param1) {
        return param0 & param1;
    }

    final boolean a(byte param0, tt param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.field_b.b((byte) -110, param1);
          if (param0 > 9) {
            return true;
          }
          field_a = 94;
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("vi.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final int a(byte param0) {
        int var2 = 35 % ((51 - param0) / 46);
        return this.field_b.a((byte) -16);
    }

    final int a(byte param0, int param1) {
        tt var4 = null;
        int var5 = TombRacer.field_G ? 1 : 0;
        int var3 = 0;
        tt var4Lifetime1;
        if (param0 < 21) {
          this.a((byte) 71, -82);
        } else {
          var4 = (tt) (this.field_b.f(-80));
          while (var4 != null) {
            if (var4.a(false, param1)) {
              var3++;
            }
            var4 = (tt) (this.field_b.e(107));
          }
          return var3;
        }
        var4Lifetime1 = (tt) (this.field_b.f(-80));
        while (var4Lifetime1 != null) {
          if (var4Lifetime1.a(false, param1)) {
            var3++;
          }
          var4Lifetime1 = (tt) (this.field_b.e(107));
        }
        return var3;
    }

    vi() {
        this.field_b = new vna();
    }

    static {
    }
}
