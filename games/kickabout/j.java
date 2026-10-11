/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class j {
    static String[] field_a;
    private gm field_b;

    public static void a(boolean param0) {
        field_a = null;
        if (!param0) {
          j.a(112);
        }
    }

    final static boolean a(byte param0, String param1, String param2) {
        String var3 = null;
        int var4 = 0;
        boolean stackIn_12_0 = false;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          var3 = bo.a(-1, param1);
          var4 = -111 % ((-20 - param0) / 49);
          if (-1 != param2.indexOf(param1)) {
            return true;
          }
          if (param2.indexOf(var3) != -1) {
            return true;
          }
          stackIn_12_0 = (param2.startsWith(param1)) || (param2.startsWith(var3)) || (param2.endsWith(param1)) || (param2.endsWith(var3));
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_15_0 = var3_ref;
          stackIn_15_1 = new StringBuilder().append("j.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',');
          if (param2 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    final static ut a(int param0) {
        if (param0 != -5275) {
          field_a = (String[]) null;
          return cv.field_b[ih.field_c][rm.field_C];
        }
        return cv.field_b[ih.field_c][rm.field_C];
    }

    final void a(int param0, int param1, int param2) {
        int var4 = this.field_b.field_R;
        if (ia.field_c) {
          this.field_b.field_R = (this.field_b.field_R + 1024) % 2048;
          iw.a(param0 + 39, wa.field_a);
          on.b();
          this.field_b.a(1200, 300, 48, 90, (byte) -105);
          ta.e(127);
          wa.field_a.f(param2 - param0, -47 + param1);
          if (ia.field_c) {
            this.field_b.field_R = var4;
            return;
          }
          return;
        }
        iw.a(param0 + 39, wa.field_a);
        on.b();
        this.field_b.a(1200, 300, 48, 90, (byte) -105);
        ta.e(127);
        wa.field_a.f(param2 - param0, -47 + param1);
        if (!ia.field_c) {
          return;
        }
        this.field_b.field_R = var4;
    }

    final void a(int param0, int param1) {
        if (param0 == 0) {
          this.field_b.field_G = 0;
          this.field_b.field_j = 1;
          this.field_b.field_n = 0;
          if (param0 != 129) {
            this.field_b.a(2, (la[]) null, false, false);
            if (param1 == 1) {
              this.field_b.g((byte) 125);
              return;
            }
            field_a = (String[]) null;
            this.field_b.g((byte) 125);
            return;
          }
          this.field_b.field_G = 3;
          this.field_b.a(2, (la[]) null, false, false);
          if (param1 != 1) {
            field_a = (String[]) null;
            this.field_b.g((byte) 125);
            return;
          }
          this.field_b.g((byte) 125);
          return;
        }
        this.field_b.field_G = 8;
        if (param0 == 129) {
          this.field_b.field_G = 3;
          this.field_b.a(2, (la[]) null, false, false);
          if (param1 == 1) {
            this.field_b.g((byte) 125);
            return;
          }
          field_a = (String[]) null;
          this.field_b.g((byte) 125);
          return;
        }
        this.field_b.a(2, (la[]) null, false, false);
        if (param1 == 1) {
          this.field_b.g((byte) 125);
          return;
        }
        field_a = (String[]) null;
        this.field_b.g((byte) 125);
    }

    j(int param0) {
        int var2 = 3;
        gr var3 = new gr();
        var3.field_w = 4;
        if (param0 != 0) {
          var3.field_k = 10;
          var3.field_R = 31;
        } else {
          var3.field_R = 31;
          var3.field_k = 16;
        }
        vn var4 = fp.a(var3.field_w, var3.field_k, 0, var2, 0, 0, var3.field_R, false, false, false);
        this.field_b = new gm(var4, var2, false);
        this.field_b.field_G = 8;
        this.field_b.field_R = 1536;
        this.field_b.b((byte) -128, 5);
        if (param0 == 0) {
          this.field_b.field_mb.a(10, 126);
        }
    }

    static {
    }
}
