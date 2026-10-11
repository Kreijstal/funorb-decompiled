/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class va {
    static qj field_c;
    static String field_i;
    static fh field_j;
    static rj field_h;
    static int[] field_f;
    static int field_e;
    static String field_a;
    static int field_d;
    static String field_g;
    static int[] field_k;
    static int field_b;

    final static IndexedSprite a(int param0, cm param1, boolean param2, int param3) {
        RuntimeException var4 = null;
        Object stackIn_4_0 = null;
        IndexedSprite stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param2) {
            field_k = (int[]) null;
          }
          if (wa.a((byte) 30, param3, param0, param1)) {
            stackIn_6_0 = NodeDeque.d((byte) 51);
            return stackIn_6_0;
          }
          stackIn_4_0 = null;
          return (IndexedSprite) (stackIn_4_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_9_0 = var4;
          stackIn_9_1 = new StringBuilder().append("va.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    public static void a(boolean param0) {
        field_i = null;
        field_h = null;
        field_j = null;
        field_a = null;
        field_f = null;
        field_k = null;
        field_c = null;
        field_g = null;
        if (param0) {
          field_d = -118;
        }
    }

    final static void a(int param0) {
        ql.j(-29713);
        rg.field_e = true;
        if (param0 == 29) {
          de.field_d = true;
          ag.field_p.h(param0 + 95);
          bf.a((byte) -83, false, pf.field_f);
          return;
        }
    }

    final static String a(CharSequence param0, int param1) {
        RuntimeException var2 = null;
        String stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != -1) {
            va.a(false);
          }
          stackIn_3_0 = ln.a(param0, false, -16121);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("va.B(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(int param0, int param1, BitmapFont param2, int param3, int param4, int param5, RgbSprite[] param6, RgbSprite[] param7, int param8, int param9, int param10, int param11, int param12, int param13, int param14, int param15, RgbSprite[] param16, int param17, BitmapFont param18, int param19) {
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var20 = null;
        try {
          ia.a(new ak(param7), new ak(param16), new ak(param6), param2, param17, param13, param8, param4, param9, param5, param19, param11, param10, param3, param12, param1, param0, param14, param18, param15);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var20 = decompiledCaughtException;
          stackIn_4_0 = var20;
          stackIn_4_1 = new StringBuilder().append("va.D(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param7 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(',').append(param11).append(',').append(param12).append(',').append(param13).append(',').append(param14).append(',').append(param15).append(',');
          if (param16 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param17).append(',');
          if (param18 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param19).append(')').toString());
        }
    }

    static {
        field_i = "The <%0> module has already been engineered.";
        field_f = new int[]{107, 29, -1, -1, -1, -1, -1, -1, -1, -1};
        field_g = "Enter name of player to delete from list";
        field_a = "Withdraw invitation to <%0> to join this game";
        field_k = new int[4];
        field_d = -1;
        field_b = 360;
    }
}
