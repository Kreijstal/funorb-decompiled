/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ip extends kj {
    static kv[] field_f;
    private int field_g;

    ip(gj param0, int param1, int param2) {
        super(param0, param1, param2);
    }

    final void a(int param0, int param1, int param2) {
        int var4 = this.field_g * (int)((double)param0 / 30.0);
        if (param1 == 0) {
          il.field_a.a((-this.field_g + 30 << 1) + param2, var4, 128 - (30 - this.field_g << 1), 64);
          return;
        }
        field_f = (kv[]) null;
        il.field_a.a((-this.field_g + 30 << 1) + param2, var4, 128 - (30 - this.field_g << 1), 64);
    }

    final void a(int param0, boolean param1, int param2) {
        if (!param1) {
          this.a(-90, true, -97);
        }
    }

    final static String a(String param0, byte param1, int param2) {
        RuntimeException var3 = null;
        int var4 = 0;
        pf var5 = null;
        CharSequence var6 = null;
        String stackIn_3_0 = null;
        String stackIn_6_0 = null;
        String stackIn_9_0 = null;
        String stackIn_12_0 = null;
        String stackIn_15_0 = null;
        String stackIn_18_0 = null;
        Object stackIn_22_0 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var6 = (CharSequence) ((Object) param0);
          if (!wc.a(0, var6)) {
            stackIn_3_0 = mk.field_f;
            return stackIn_3_0;
          }
          if (wb.a((byte) 52, param0)) {
            stackIn_6_0 = cea.field_a;
            return stackIn_6_0;
          }
          if (2 != um.field_c) {
            stackIn_9_0 = bt.field_q;
            return stackIn_9_0;
          }
          if (bna.a((byte) 5, param0)) {
            stackIn_12_0 = lga.a(true, new String[]{param0}, nu.field_d);
            return stackIn_12_0;
          }
          if (100 <= bda.field_l) {
            stackIn_15_0 = c.field_i;
            return stackIn_15_0;
          }
          if (gl.a(3, param0)) {
            stackIn_18_0 = lga.a(true, new String[]{param0}, fja.field_b);
            return stackIn_18_0;
          }
          if (param1 != -80) {
            ip.c((byte) 108);
          }
          var5 = sja.field_fb;
          var5.c(param2, (byte) 107);
          var5.field_g = var5.field_g + 1;
          var4 = var5.field_g;
          var5.d(2, 0);
          var5.a((byte) -50, param0);
          var5.b((byte) 105, var5.field_g - var4);
          stackIn_22_0 = null;
          return (String) (stackIn_22_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_25_0 = var3;
          stackIn_25_1 = new StringBuilder().append("ip.D(");
          if (param0 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    public static void c(byte param0) {
        field_f = null;
        if (param0 != -36) {
          field_f = (kv[]) null;
        }
    }

    final boolean b(int param0) {
        if (0 == this.field_g) {
          wf.a(69, (byte) -91);
        }
        int fieldTemp$0 = this.field_g + 1;
        this.field_g = this.field_g + 1;
        if (30 <= fieldTemp$0) {
          return true;
        }
        if (param0 > 21) {
          return false;
        }
        this.a(-86, -98, -122);
        return false;
    }

    final static void a(byte param0, int param1) {
        int var2;
        int var3;
        var3 = BachelorFridge.field_y;
        if (param0 != 22) {
          ip.a((byte) 109, 122);
        }
        var2 = param1;
        if (var2 == 0) {
          ala.a(26219, wc.field_p);
          return;
        }
        if (var2 == 12) {
          ala.a(26219, jga.field_z);
          return;
        }
        if (-3 == var2) {
          ala.a(26219, eda.field_i);
          return;
        }
        if (var2 != -2) {
          return;
        }
        ala.a(26219, pm.field_z);
        tla.d(-80);
    }

    static {
    }
}
