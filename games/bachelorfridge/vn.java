/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vn extends lka implements mca {
    static int[] field_M;
    private int field_P;
    private qu field_N;

    final String c(byte param0) {
        if (!this.field_t) {
          return null;
        }
        if (null == this.field_h) {
          return null;
        }
        if (param0 == 16) {
          ha.a(gd.field_m, mk.field_p - (this.field_P - this.field_p), false);
          return this.field_h;
        }
        this.field_P = 104;
        ha.a(gd.field_m, mk.field_p - (this.field_P - this.field_p), false);
        return this.field_h;
    }

    public final qu a(int param0) {
        if (param0 != 16728128) {
          return (qu) null;
        }
        return this.field_N;
    }

    final void i(byte param0) {
        if (param0 < -87) {
          super.i((byte) -111);
          if (this.field_N != null) {
            this.field_N.a(574);
          }
          return;
        }
        this.field_N = (qu) null;
        super.i((byte) -111);
        if (this.field_N != null) {
          this.field_N.a(574);
        }
    }

    final void a(int param0, int param1, wj param2, int param3) {
        try {
          super.a(param0, param1, param2, param3);
          this.field_P = mk.field_p - this.field_s - param0;
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "vn.O(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    public static void k(int param0) {
        field_M = null;
        if (param0 != -9063) {
          CharSequence var2 = (CharSequence) null;
          vn.a((byte) -1, (CharSequence) null);
        }
    }

    final static boolean a(byte param0, CharSequence param1) {
        RuntimeException var2 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 < 106) {
            vn.k(-80);
          }
          stackIn_3_0 = bf.a(10, -44, true, param1);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("vn.JA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final void a(int param0, qu param1) {
        try {
          if (param0 != 7) {
            this.a(-10);
          }
          this.field_N = param1;
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "vn.IA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static int a(int param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        if (param0 == -9938) {
          var2 = 0;
          if (0 != (param1 & 7)) {
            var2 = 8 - (param1 & 7);
          }
          var3 = param1 + var2;
          return var3;
        }
        return 66;
    }

    vn(String param0, pl param1, int param2) {
        super(param0, param1, param2);
    }

    static {
        field_M = new int[]{16777215, 16728128, 16744448, 16776960};
    }
}
