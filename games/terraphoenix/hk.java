/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hk {
    int field_m;
    static bg[] field_d;
    int field_i;
    rk field_l;
    int field_k;
    static char[] field_a;
    int field_b;
    static String field_c;
    int field_e;
    int field_f;
    int field_j;
    int field_g;
    int field_h;

    public static void a(boolean param0) {
        field_d = null;
        if (param0) {
          field_c = null;
          field_a = null;
          return;
        }
        java.awt.Canvas var2 = (java.awt.Canvas) null;
        hk.a((java.awt.Canvas) null, (byte) 22);
        field_c = null;
        field_a = null;
    }

    final static void a(int param0, int param1, byte[] param2, int param3, int[] param4) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        byte dupTemp$2 = 0;
        int dupTemp$3 = 0;
        int[] stackIn_5_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        var7 = Terraphoenix.field_V;
        try {
          var5_int = 0;
          if (param1 >= -9) {
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_13_0 = var5;
          stackIn_13_1 = new StringBuilder().append("hk.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
        stackIn_5_0 = fc.field_e;
        try {
          while (true) {
            if (stackIn_5_0.length <= var5_int) {
              return;
            }
            param0 = fc.field_e[var5_int];
            var6 = var5_int << 4;
            while (true) {
              incrementValue$0 = param0;
              param0--;
              if (incrementValue$0 == 0) {
                var5_int++;
                stackIn_5_0 = fc.field_e;
                break;
              }
              incrementValue$1 = var6;
              var6++;
              param3 = qh.field_c[incrementValue$1];
              dupTemp$2 = param2[param3];
              dupTemp$3 = param4[dupTemp$2];
              param4[dupTemp$2] = dupTemp$3 + 1;
              qh.field_c[dupTemp$3] = param3;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var5 = decompiledCaughtException;
          stackIn_13_0 = var5;
          stackIn_13_1 = new StringBuilder().append("hk.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    final static void a(java.awt.Component param0, byte param1) {
        try {
          int var2_int = 45 % ((14 - param1) / 43);
          param0.setFocusTraversalKeysEnabled(false);
          param0.addKeyListener(th.field_g);
          param0.addFocusListener(th.field_g);
        } catch (RuntimeException runtimeException) {
          throw qk.a((Throwable) ((Object) runtimeException), "hk.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void a(String param0, byte param1, java.applet.Applet param2) {
        try {
          RuntimeException stackIn_12_0 = null;
          StringBuilder stackIn_12_1 = null;
          String stackIn_13_2 = null;
          StringBuilder stackIn_15_1 = null;
          String stackIn_16_2 = null;
          Throwable decompiledCaughtException = null;
          Throwable var3 = null;
          RuntimeException var3_ref = null;
          String var4 = null;
          String var5 = null;
          java.awt.Component var6 = null;
          String var7 = null;
          String var8 = null;
          String var5Lifetime1;
          String var5Lifetime2;
          String var5Lifetime3;
          String var5Lifetime4;
          String var5Lifetime5;
          String var5Lifetime6;
          try {
            va.field_g = param0;
            if (param1 != 3) {
              var6 = (java.awt.Component) null;
              hk.a((java.awt.Component) null, (byte) 83);
            }
            try {
              var7 = param2.getParameter("cookieprefix");
              var5 = var7;
              var5Lifetime1 = var7;
              var4 = param2.getParameter("cookiehost");
              var5Lifetime2 = var4;
              var5Lifetime3 = var4;
              var8 = var7 + "settings=" + param0 + "; version=1; path=/; domain=" + var4;
              var5Lifetime4 = var8;
              var5Lifetime5 = var8;
              if (param0.length() != 0) {
                var5Lifetime6 = var8 + "; Expires=" + wc.a(94608000000L + ll.a(1000), -1) + "; Max-Age=" + 94608000L;
              } else {
                var5Lifetime6 = var8 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
              }
              cd.a(param2, param1 ^ 13161, "document.cookie=\"" + var5Lifetime6 + "\"");
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var3 = decompiledCaughtException;
            }
            dh.a(param2, true);
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var3_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_12_0 = var3_ref;
            stackIn_12_1 = new StringBuilder().append("hk.D(");
            if (param0 == null) {
              stackIn_13_2 = "null";
            } else {
              stackIn_13_2 = "{...}";
            }
            stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(',');
            if (param2 == null) {
              stackIn_16_2 = "null";
            } else {
              stackIn_16_2 = "{...}";
            }
            throw qk.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(java.awt.Canvas param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          me.a((java.awt.Component) ((Object) param0), (byte) 126);
          pd.a(-26, (java.awt.Component) ((Object) param0));
          var2_int = 42 % ((param1 - 61) / 32);
          if (lk.field_d == null) {
            return;
          }
          lk.field_d.a((java.awt.Component) ((Object) param0), (byte) -105);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("hk.E(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    hk() {
        this.field_m = 0;
        this.field_i = 0;
        this.field_b = 0;
        this.field_e = 0;
        this.field_h = 0;
        this.field_k = 0;
        this.field_j = 0;
        this.field_f = 0;
        this.field_g = 0;
        this.field_l = new rk();
    }

    static {
        field_c = "Stock: ";
        field_a = new char[]{(char)91, (char)93, (char)35};
    }
}
