/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gl extends ok {
    static int field_I;
    int field_H;
    static vl field_E;

    public static void j(int param0) {
        if (param0 != -101) {
          return;
        }
        field_E = null;
    }

    final void a(int param0, int param1, int param2, int param3) {
        if (param0 != 0) {
          return;
        }
        if (null == this.field_B) {
          return;
        }
        if (this.field_H == 0) {
          return;
        }
        if (this.field_H == 256) {
          this.field_B.a(param0, param1 + this.field_p, this.field_m + param2, param3 + 0);
          return;
        }
        qj var6 = new qj(this.field_B.field_x, this.field_B.field_u);
        if (param3 == 29221) {
          mb.a((byte) -12, var6);
          this.field_B.a(param0, 0, 0, param3 + 0);
          ch.m(param3 - 29294);
          var6.d(this.field_p + param1, this.field_m + param2, this.field_H);
          return;
        }
    }

    public gl() {
        super(0, 0, 0, 0, (t) null, (tg) null);
        this.field_H = 256;
    }

    final static void a(String param0, String[] param1, int param2, byte param3) {
        int var5 = 0;
        boolean stackIn_5_0 = false;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var5 = TrackController.field_F ? 1 : 0;
        try {
          fd.field_h = cj.field_e;
          if (param2 != 255) {
            if (param2 < 100) {
              h.field_c = wg.a((byte) 54, param2, param0);
            } else {
              if (param2 > 105) {
                h.field_c = wg.a((byte) 54, param2, param0);
              } else {
                h.field_c = qg.a(param1, 91);
              }
            }
          } else {
            stackIn_5_0 = !(da.field_o >= 13);
            h.field_c = oc.a(stackIn_5_0, -21017);
          }
          if (param3 >= 93) {
            return;
          }
          field_I = -52;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_16_0 = var4;
          stackIn_16_1 = new StringBuilder().append("gl.A(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',');
          if (param1 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw sl.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static qj[] b(int param0, int param1, int param2, int param3, int param4) {
        qj[] var7 = new qj[9];
        qj[] var5 = var7;
        qj dupTemp$0 = ee.a(param0, param1, (byte) 104);
        var7[6] = dupTemp$0;
        var5[3] = dupTemp$0;
        var5[2] = dupTemp$0;
        var5[1] = dupTemp$0;
        var5[0] = dupTemp$0;
        qj dupTemp$1 = ee.a(param2, param1, (byte) -74);
        var7[8] = dupTemp$1;
        var5[7] = dupTemp$1;
        var5[5] = dupTemp$1;
        int var6 = 87 % ((-23 - param3) / 37);
        if (param4 != 0) {
          var7[4] = ee.a(param4, 64, (byte) 104);
        }
        return var5;
    }

    gl(al param0) {
        super(param0.field_p, param0.field_m, param0.field_x, param0.field_u, (t) null, (tg) null);
        try {
          param0.a(this.field_u, -3050, 0, this.field_x, 0);
          this.field_H = 256;
          this.field_B = param0;
        } catch (RuntimeException runtimeException) {
          throw sl.a((Throwable) ((Object) runtimeException), "gl.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
