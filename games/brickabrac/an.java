/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class an extends pj implements hf, ph {
    ug field_l;
    static String[] field_j;
    static String field_g;
    static QuickChatParameterType field_i;
    static int field_h;
    static long field_k;

    public static void c(byte param0) {
        field_j = null;
        field_i = null;
        field_g = null;
        if (param0 >= -22) {
          an.c((byte) 116);
        }
    }

    final qh c(int param0) {
        int var2_int = 0;
        NumberFormatException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        qh stackIn_2_0 = null;
        qh stackIn_6_0 = null;
        qh stackIn_9_0 = null;
        qh stackIn_13_0 = null;
        Throwable decompiledCaughtException = null;
        try {
          var2_int = this.field_l.a((byte) -89);
          if (param0 != 4) {
            stackIn_2_0 = (qh) null;
            return stackIn_2_0;
          }
          var3 = this.field_l.i((byte) -117);
          var4 = this.field_l.i(5390);
          var5 = un.a(1);
          if (1890 > var4) {
            stackIn_6_0 = lp.field_xb;
            return stackIn_6_0;
          }
          if (var4 > -3 + var5) {
            stackIn_9_0 = lp.field_xb;
            return stackIn_9_0;
          }
          if (!PlayerInputBatch.a((byte) -49, var2_int, var4, var3)) {
            stackIn_13_0 = lp.field_xb;
            return stackIn_13_0;
          }
        } catch (java.lang.NumberFormatException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (NumberFormatException) (Object) decompiledCaughtException;
          return lp.field_xb;
        }
        return DualLinkIterator.field_c;
    }

    public final void a(vb param0, int param1) {
        try {
          if (param1 != -40) {
            field_i = (QuickChatParameterType) null;
          }
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "an.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final void a(vb param0, byte param1) {
        try {
          this.a(false);
          if (param1 > -39) {
            this.c(113);
          }
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "an.I(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final String b(int param0) {
        int var2_int = 0;
        NumberFormatException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        String stackIn_2_0 = null;
        String stackIn_7_0 = null;
        Object stackIn_10_0 = null;
        Throwable decompiledCaughtException = null;
        try {
          var2_int = this.field_l.a((byte) -93);
          var3 = this.field_l.i((byte) -117);
          var4 = this.field_l.i(5390);
          if (param0 != 28600) {
            stackIn_2_0 = (String) null;
            return stackIn_2_0;
          }
          var5 = un.a(1);
          if (var4 >= 1890 &&
            var5 - 3 >= var4) {
            if (PlayerInputBatch.a((byte) -49, var2_int, var4, var3)) {
              stackIn_10_0 = null;
              return (String) (stackIn_10_0);
            }
          } else {
            stackIn_7_0 = rd.a(ig.field_J, new String[]{"1890", Integer.toString(-3 + var5)}, (byte) 103);
            return stackIn_7_0;
          }
        } catch (java.lang.NumberFormatException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (NumberFormatException) (Object) decompiledCaughtException;
        }
        return ScrollPaneWithFooter.field_Rb;
    }

    final static void d(byte param0) {
        int var1_int = 0;
        int var2 = BrickABrac.field_J ? 1 : 0;
        try {
          for (var1_int = 0; var1_int < ScrollPane.field_Sb; var1_int++) {
            UnderwaterBackground.field_s[var1_int] = null;
          }
          if (param0 != -56) {
            field_i = (QuickChatParameterType) null;
          }
          ScrollPane.field_Sb = 0;
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "an.R(" + param0 + ')');
        }
    }

    public final boolean a(byte param0) {
        if (param0 > -27) {
          field_k = 93L;
        }
        return this.field_l.h((byte) -124);
    }

    public an() {
    }

    static {
        field_g = "Show chat (1 unread message)";
        field_i = new QuickChatParameterType(4, 1, 1, 1);
    }
}
