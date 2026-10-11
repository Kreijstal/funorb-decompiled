/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cq {
    static String field_b;
    static String field_d;
    static int field_f;
    static String field_a;
    static String[] field_e;
    static int[] field_c;

    final static boolean a(int param0) {
        q.field_e = true;
        dl.field_e = bl.a((byte) 115) + (long)param0;
        return a.field_b == 11 ? true : false;
    }

    public static void a(byte param0) {
        field_a = null;
        field_b = null;
        field_d = null;
        field_c = null;
        field_e = null;
        int var1 = -92 % ((param0 + 1) / 54);
    }

    final static void a(java.applet.Applet param0, boolean param1) {
        try {
          java.net.URL var2 = null;
          Exception var2_ref = null;
          RuntimeException var2_ref2 = null;
          java.applet.AppletContext stackIn_4_0 = null;
          java.applet.AppletContext stackIn_4_1 = null;
          boolean stackIn_5_2 = false;
          RuntimeException stackIn_11_0 = null;
          StringBuilder stackIn_11_1 = null;
          String stackIn_12_2 = null;
          Throwable decompiledCaughtException = null;
          try {
            try {
              if (param1) {
                field_c = (int[]) null;
              }
              var2 = new java.net.URL(param0.getCodeBase(), "quit.ws");
              stackIn_4_0 = param0.getAppletContext();
              stackIn_4_1 = (java.applet.AppletContext) ((Object) param0);
              stackIn_5_2 = !(param1);
              ((java.applet.AppletContext) (Object) stackIn_4_0).showDocument(gf.a((java.applet.Applet) ((Object) stackIn_4_1), stackIn_5_2, var2), "_top");
              return;
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2_ref = (Exception) (Object) decompiledCaughtException;
              var2_ref.printStackTrace();
              return;
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_11_0 = var2_ref2;
            stackIn_11_1 = new StringBuilder().append("cq.A(");
            if (param0 == null) {
              stackIn_12_2 = "null";
            } else {
              stackIn_12_2 = "{...}";
            }
            throw fa.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static boolean a(String param0, int param1) {
        RuntimeException var2 = null;
        CharSequence var3 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 > -117) {
            field_c = (int[]) null;
          }
          if (!sq.field_N) {
            return false;
          }
          if (va.field_a == 2 &&
            null != ql.field_a) {
            var3 = (CharSequence) ((Object) param0);
            if (!ql.field_a.equals(tg.a(var3, false))) {
              return false;
            }
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_15_0 = var2;
          stackIn_15_1 = new StringBuilder().append("cq.C(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(')').toString());
        }
    }

    final static long a(int param0, CharSequence param1) {
        int var5 = 0;
        long var2_long = 0L;
        int var4 = 0;
        int var6 = 0;
        int var7 = 0;
        long stackIn_20_0 = 0L;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var7 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          var2_long = (long)param0;
          var4 = param1.length();
          for (var5 = 0; var4 > var5; var5++) {
            var2_long = var2_long * 37L;
            var6 = param1.charAt(var5);
            if (var6 >= 65 &&
              var6 <= 90) {
              var2_long = var2_long + (long)(-65 + (1 + var6));
            } else if (97 <= var6 &&
              var6 <= 122) {
              var2_long = var2_long + (long)(-97 + (1 + var6));
            } else {
              if (var6 >= 48 &&
                var6 <= 57) {
                var2_long = var2_long + (long)(-21 + var6);
              }
            }
            if (var2_long < 177917621779460413L) {
              continue;
            }
            break;
          }
          while (0L == var2_long % 37L) {
            if (var2_long != 0L) {
              var2_long = var2_long / 37L;
              continue;
            }
            break;
          }
          stackIn_20_0 = var2_long;
          return stackIn_20_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_23_0 = var2;
          stackIn_23_1 = new StringBuilder().append("cq.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(')').toString());
        }
    }

    static {
        field_b = "Imposed";
        ja discarded$0 = new ja(48, 48);
        field_d = "Confirm Email:";
        field_e = new String[16];
        field_f = 2;
        field_c = new int[]{38};
        field_a = "to keep fullscreen or";
    }
}
