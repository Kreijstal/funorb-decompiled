/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kg {
    static int field_b;
    static boolean field_f;
    private ig field_g;
    private eg field_e;
    static ec field_h;
    static kc field_c;
    static int[][] field_d;
    private eg field_i;
    static boolean field_a;

    public static void a(int param0) {
        field_h = null;
        field_d = (int[][]) null;
        field_c = null;
        if (param0 != 0) {
          field_a = true;
        }
    }

    final oo a(int param0, int param1) {
        byte[] var4 = null;
        if (param0 != 3) {
          return (oo) null;
        }
        oo var3 = (oo) (this.field_g.a((long)param1, false));
        if (var3 != null) {
          return var3;
        }
        if (32768 <= param1) {
          var4 = this.field_i.b(32767 & param1, 26219, 0);
        } else {
          var4 = this.field_e.b(param1, param0 + 26216, 0);
        }
        oo var5 = new oo();
        if (var4 != null) {
          var5.a((byte) 116, new wk(var4));
          if (param1 >= 32768) {
            var5.f(-94);
            this.field_g.a(var5, (long)param1, -65);
            return var5;
          }
          this.field_g.a(var5, (long)param1, -65);
          return var5;
        }
        if (param1 < 32768) {
          this.field_g.a(var5, (long)param1, -65);
          return var5;
        }
        var5.f(-94);
        this.field_g.a(var5, (long)param1, -65);
        return var5;
    }

    kg(int param0, eg param1, eg param2) {
        RuntimeException var4 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        this.field_g = new ig(64);
        try {
          this.field_i = param2;
          this.field_e = param1;
          if (null != this.field_e) {
            this.field_e.a(0, (byte) -60);
          }
          if (this.field_i == null) {
            return;
          }
          this.field_i.a(0, (byte) -60);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_8_0 = var4;
          stackIn_8_1 = new StringBuilder().append("kg.<init>(").append(param0).append(',');
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
          throw aa.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    final static boolean a(long param0, boolean param1, String param2) {
        wa var4 = null;
        RuntimeException var4_ref = null;
        boolean stackIn_11_0 = false;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param1) {
            field_b = 104;
          }
          var4 = im.a(0, param2);
          if (var4 != null &&
            var4.field_Lb != null) {
            return true;
          }
          stackIn_11_0 = (wi.field_f != null) && (vf.a(param0, 8192) != null);
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_14_0 = var4_ref;
          stackIn_14_1 = new StringBuilder().append("kg.A(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    static {
        field_b = 0;
        field_d = new int[4][3];
    }
}
