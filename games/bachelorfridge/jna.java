/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jna extends bw {
    static int[] field_f;

    final static void a(int param0, int param1, int param2, boolean param3, String param4, int param5, int param6, int param7) {
        RuntimeException var8 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (0 != oi.field_w.field_R &&
            !hl.field_I) {
            if (sea.field_j) {
              fk.d(120);
            } else {
              lna.field_q = true;
            }
          }
          if (lna.field_q) {
            qfa.a(param0, param6, param7, (byte) -115, param6, param4, param5, param1, 20);
            bi.field_h.a(19842, param3);
            if (param3) {
              if (ub.field_k.field_R != 0) {
                lna.field_q = false;
              }
              if (qq.field_k.field_R != 0) {
                bea.d(param2 ^ 125);
                lna.field_q = false;
              }
            }
          }
          if (param2 == -1) {
            return;
          }
          jna.a(20);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_20_0 = var8;
          stackIn_20_1 = new StringBuilder().append("jna.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(')').toString());
        }
    }

    final void a(int param0, lu param1) {
        try {
          this.field_c = param1.c(-99);
          if (param0 > -43) {
            field_f = (int[]) null;
          }
          param1.f(-55);
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "jna.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static kv[] a(int param0, int param1, byte param2, int param3) {
        int var6 = BachelorFridge.field_y;
        kv[] var7 = new kv[9];
        kv[] var4 = var7;
        var7[0] = ik.b(param1, param3, 2);
        int var5 = 1;
        if (param2 != 106) {
          return (kv[]) null;
        }
        while (9 > var5) {
          var7[var5] = var7[0];
          var5++;
        }
        var4[4] = ik.b(64, param0, 2);
        return var4;
    }

    jna() {
    }

    public static void a(int param0) {
        if (param0 == 30862) {
          field_f = null;
          return;
        }
        String var2 = (String) null;
        jna.a(-29, 74, 14, false, (String) null, -5, 108, 69);
        field_f = null;
    }

    final static void a(boolean param0, boolean param1) {
        wia.a(param1, (byte) 31);
        kh.a((byte) -74, param1);
        if (param0) {
          return;
        }
        field_f = (int[]) null;
    }

    static {
        field_f = new int[256];
    }
}
