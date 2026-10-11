/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gv extends gn {
    private boolean field_j;
    private int field_e;
    private int field_i;
    private String field_f;
    static int field_h;
    private int field_g;

    final static void a(int param0, int param1, ni param2) {
        ml var3 = null;
        try {
          var3 = or.field_d;
          var3.b(param0, (byte) 73);
          var3.a(115, 5);
          var3.a(118, 0);
          if (param1 <= 71) {
            field_h = -27;
          }
          var3.g(-1207444472, param2.field_o);
          var3.a(116, param2.field_g);
          var3.a(102, param2.field_j);
        } catch (RuntimeException runtimeException) {
          throw nb.a((Throwable) ((Object) runtimeException), "gv.B(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, int param1) {
        int var3 = -121 / ((37 - param0) / 47);
        if (this.field_g == 0) {
          return;
        }
        int var4 = al.a(true, (byte) -120);
        on.a(95, param1 + 1, this.field_e, 17, 6, 0, var4 * this.field_g >> 8);
        if (256 != this.field_g) {
          cq.field_e.b(this.field_f, 107, -4 + (18 + param1), 16777215, -1, this.field_g);
        } else {
          cq.field_e.a(this.field_f, 107, -4 + (param1 + 18), 16777215, -1);
        }
    }

    final void a(int param0) {
        int var2 = 0;
        if (param0 != 0) {
          this.field_g = 22;
        }
        if (this.field_j) {
          this.field_g = 256;
          return;
        }
        if (this.field_i >= 600) {
          this.field_g = 0;
          return;
        }
        this.field_i = this.field_i + 1;
        if (500 >= this.field_i) {
        } else {
          var2 = 100 - this.field_i + 500;
          if (0 <= var2) {
            this.field_g = (var2 << 8) / 100;
          } else {
            this.field_g = 0;
          }
        }
    }

    final static boolean a(boolean param0, CharSequence param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = Kickabout.field_G;
        try {
          if (!hw.a(param1, param2 ^ -26200, param0)) {
            return false;
          }
          for (var3_int = param2; var3_int < param1.length(); var3_int++) {
            if (!jw.a(param1.charAt(var3_int), 160)) {
              return false;
            }
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_16_0 = var3;
          stackIn_16_1 = new StringBuilder().append("gv.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param2).append(')').toString());
        }
    }

    gv(String param0, boolean param1) {
        int var3_int = 0;
        try {
          this.field_g = 256;
          this.field_j = param1 ? true : false;
          this.field_f = param0;
          this.field_i = this.field_j ? 500 : 0;
          var3_int = 20 + cq.field_e.a(this.field_f);
          this.field_e = Math.max(400, var3_int);
        } catch (RuntimeException runtimeException) {
          throw nb.a((Throwable) ((Object) runtimeException), "gv.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        field_h = -1;
    }
}
