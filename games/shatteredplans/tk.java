/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tk extends jc {
    int field_A;
    ob field_D;
    static bi field_x;
    static String field_B;
    static long field_z;
    byte field_w;
    static String[] field_v;
    static int field_y;
    static nq field_C;

    final int e(int param0) {
        if (null == this.field_D) {
          return 0;
        }
        if (param0 == 0) {
          return 100 * this.field_D.field_j / (-this.field_w + this.field_D.field_h.length);
        }
        return 19;
    }

    final byte[] e(byte param0) {
        if (this.field_u) {
          throw new RuntimeException();
        }
        if (-this.field_w + this.field_D.field_h.length > this.field_D.field_j) {
          throw new RuntimeException();
        }
        if (param0 > 48) {
          return this.field_D.field_h;
        }
        this.e(92);
        return this.field_D.field_h;
    }

    public static void d(boolean param0) {
        field_x = null;
        field_B = null;
        if (!param0) {
          field_C = null;
          field_v = null;
          return;
        }
        int[] var2 = (int[]) null;
        tk.a(4L, (String) null, true, (int[]) null, 74);
        field_C = null;
        field_v = null;
    }

    tk() {
    }

    final static void a(int param0, int param1, byte param2) {
        sl var3 = null;
        sl var3Lifetime1;
        if (param2 == -2) {
          var3 = js.field_f;
          var3.h(param0, 255);
          var3.c(3, (byte) -71);
          var3.c(9, (byte) -110);
          var3.d(param1, 255);
          return;
        }
        tk.d(false);
        var3Lifetime1 = js.field_f;
        var3Lifetime1.h(param0, 255);
        var3Lifetime1.c(3, (byte) -71);
        var3Lifetime1.c(9, (byte) -110);
        var3Lifetime1.d(param1, 255);
    }

    final static boolean a(long param0, String param1, boolean param2, int[] param3, int param4) {
        vm var6 = null;
        RuntimeException var6_ref = null;
        String stackIn_11_0 = null;
        boolean stackIn_12_1 = false;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!j.a(2, param3, param1, param4, param0)) {
            return false;
          }
          if (param2) {
            return false;
          }
          if (param4 == 1) {
            param4 = 0;
          }
          em.field_h = param4;
          gi.field_a = param1;
          stackIn_11_0 = (String) (param1);
          stackIn_12_1 = !(param2);
          nd.field_k = ji.a((CharSequence) ((Object) stackIn_11_0), stackIn_12_1);
          hd.field_k = param0;
          var6 = bo.a(param3, (byte) -112, nl.field_d, hl.field_I, kh.field_Nb);
          sl.a(0, var6);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_16_0 = var6_ref;
          stackIn_16_1 = new StringBuilder().append("tk.K(").append(param0).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param4).append(')').toString());
        }
    }

    static {
        field_B = "Send private message to <%0>";
    }
}
