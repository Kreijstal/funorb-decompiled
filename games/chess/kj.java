/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kj {
    private um field_e;
    private v field_d;
    private um field_b;
    static int field_c;
    static lc field_a;
    static int field_h;
    static String field_f;
    static he field_g;

    final static void a(boolean param0, int param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        int var3Lifetime1;
        int var4Lifetime1;
        if (param2 != 4239) {
          kj.a((byte) -55);
          if (pj.field_h != null) {
            var3 = pj.field_h.b(param0, (byte) -95);
            if (var3 == -2) {
              return;
            }
            if (var3 != -1) {
              var4 = pj.field_h.b(false) ? 1 : 0;
              ng.a(param1, var4 != 0, pj.field_h.field_Lb, var3, pj.field_h.a(true), 79);
            }
            pj.field_h = null;
            fi.a(-393711775);
          }
          return;
        }
        if (pj.field_h == null) {
          return;
        }
        var3Lifetime1 = pj.field_h.b(param0, (byte) -95);
        if (var3Lifetime1 != -2) {
          if (var3Lifetime1 != -1) {
            var4Lifetime1 = pj.field_h.b(false) ? 1 : 0;
            ng.a(param1, var4Lifetime1 != 0, pj.field_h.field_Lb, var3Lifetime1, pj.field_h.a(true), 79);
          }
          pj.field_h = null;
          fi.a(-393711775);
        }
    }

    final j a(int param0, int param1) {
        byte[] var4 = null;
        j var3 = (j) (this.field_d.a((byte) -77, (long)param0));
        if (param1 != 0) {
          return (j) null;
        }
        if (var3 != null) {
          return var3;
        }
        if (param0 >= 32768) {
          var4 = this.field_b.a(0, param0 & 32767, 5847);
        } else {
          var4 = this.field_e.a(0, param0, 5847);
        }
        j var5 = new j();
        if (var4 != null) {
          var5.a(new p(var4), param1 ^ 0);
          if (param0 >= 32768) {
            var5.f(0);
            this.field_d.a((long)param0, 1, var5);
            return var5;
          }
          this.field_d.a((long)param0, 1, var5);
          return var5;
        }
        if (param0 < 32768) {
          this.field_d.a((long)param0, 1, var5);
          return var5;
        }
        var5.f(0);
        this.field_d.a((long)param0, 1, var5);
        return var5;
    }

    public static void a(byte param0) {
        int var1 = -16 % ((param0 + 18) / 61);
        field_f = null;
        field_g = null;
        field_a = null;
    }

    kj(int param0, um param1, um param2) {
        RuntimeException var4 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        this.field_d = new v(64);
        try {
          this.field_e = param1;
          this.field_b = param2;
          if (this.field_e != null) {
            this.field_e.a((byte) -67, 0);
          }
          if (this.field_b == null) {
            return;
          }
          this.field_b.a((byte) -106, 0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_8_0 = var4;
          stackIn_8_1 = new StringBuilder().append("kj.<init>(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',');
          if (param2 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    static {
        field_c = -1;
        field_f = "<%0> is not on your friend list.";
    }
}
