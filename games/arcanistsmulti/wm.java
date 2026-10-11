/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wm extends wn {
    static int field_I;
    static String field_G;
    static qb[] field_H;
    static String field_F;
    static String field_J;

    public static void f(int param0) {
        field_H = null;
        field_F = null;
        field_G = null;
        if (param0 != -5903) {
          field_G = (String) null;
        }
        field_J = null;
    }

    final void a(byte param0, int param1, int param2, int param3) {
        if (param0 >= -52) {
          return;
        }
        if (0 == param2 &&
          this.field_r != null) {
          this.field_r.a((qm) (this), 5592405, param1, param3, true);
        }
        if (this.field_v != 0 &&
          0 != this.field_k) {
          io.field_n.a(param3 - (-this.field_j - this.field_k), this.field_v + this.field_n + param1, 3, param3 + this.field_j, this.field_n + param1);
          this.field_B.a((byte) -99, param1 + this.field_n, param2, param3 + this.field_j);
          io.field_n.a(114);
        }
    }

    final void a(byte param0) {
        if (param0 != -75) {
          return;
        }
        this.field_B.e((byte) 87);
    }

    final static boolean c(boolean param0) {
        if (param0) {
          wm.a(-119, (byte) 118);
        }
        return kg.a(gg.field_e, true, ua.field_S);
    }

    wm(int param0, int param1, int param2, int param3, pf param4, qm param5) {
        super(param0, param1, param2, param3, param4, (wc) null);
        try {
          this.field_B = param5;
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "wm.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    final static int a(int param0, byte param1) {
        if (param0 == 0) {
          return 5864847;
        }
        if (1 == param0) {
          return 3170895;
        }
        if (3 == param0) {
          return 5142648;
        }
        if (param1 > -107) {
          return -8;
        }
        if (param0 == 4) {
          return 5132354;
        }
        if (param0 == 5) {
          return 2174241;
        }
        if (param0 == 6) {
          return 68;
        }
        if (param0 == 7) {
          return 15663103;
        }
        if (param0 == 8) {
          return 8978431;
        }
        return 3153936;
    }

    final static void g(int param0) {
        ba.d(-123);
        if (param0 != 0) {
          field_I = -56;
        }
    }

    final static void g(byte param0) {
        if (0 - sn.field_G != gi.field_a &&
          -sn.field_G + 250 == gi.field_a) {
        }
        if (param0 != 27) {
          return;
        }
        gi.field_a = gi.field_a + 1;
    }

    final boolean a(int param0, int param1, qm param2, int param3, int param4, int param5, int param6) {
        int var8_int = 0;
        RuntimeException var8 = null;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var8_int = -43 / ((-42 - param4) / 35);
          stackIn_4_0 = (this.a((byte) -47, param3, param0, param6, param5)) && (super.a(param0, param1, param2, param3, -111, param5, param6));
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_7_0 = var8;
          stackIn_7_1 = new StringBuilder().append("wm.DA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    static {
        field_F = "Invite only";
        field_G = "Create";
        field_J = "Overview:";
    }
}
