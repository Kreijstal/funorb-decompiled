/*
 * Decompiled by CFR-JS 0.4.0.
 */
class nm {
    nm field_b;
    nm field_e;
    static th field_c;
    static String field_a;
    static jp[] field_f;
    static jp field_d;
    static int[] field_h;
    long field_g;

    final boolean b(int param0) {
        if (param0 == 0) {
          if (null == this.field_b) {
            return false;
          } else {
            return true;
          }
        } else {
          this.b((byte) 95);
          if (null == this.field_b) {
            return false;
          } else {
            return true;
          }
        }
    }

    final static String a(CharSequence[] param0, boolean param1) {
        RuntimeException var2 = null;
        String stackIn_2_0 = null;
        String stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        String stackOut_3_0 = null;
        String stackOut_1_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            if (param1) {
              stackOut_3_0 = ao.a(0, param0.length, 19166, param0);
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = (String) null;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var2);
            stackOut_5_1 = new StringBuilder().append("nm.DB(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    final void b(byte param0) {
        if (this.field_b == null) {
          return;
        } else {
          if (param0 != 111) {
            field_a = (String) null;
            this.field_b.field_e = this.field_e;
            this.field_e.field_b = this.field_b;
            this.field_b = null;
            this.field_e = null;
            return;
          } else {
            this.field_b.field_e = this.field_e;
            this.field_e.field_b = this.field_b;
            this.field_b = null;
            this.field_e = null;
            return;
          }
        }
    }

    public static void a(boolean param0) {
        field_f = null;
        field_c = null;
        if (!param0) {
            return;
        }
        field_h = null;
        field_a = null;
        field_d = null;
    }

    static {
        field_c = new th(1, 2, 2, 0);
        field_a = "Waiting for <%0> to start the game...";
        field_h = new int[]{26679, 10200253, 12658477, 16494651, 16711935};
    }
}
