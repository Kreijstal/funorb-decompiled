/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tm {
    private ah field_d;
    private hl field_a;
    static String[] field_b;
    static long field_c;

    final hl a(hl param0, byte param1) {
        hl var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_5_0 = null;
        hl stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == null) {
            var3 = this.field_d.field_e.field_h;
          } else {
            var3 = param0;
          }
          if (var3 == this.field_d.field_e) {
            this.field_a = null;
            stackIn_5_0 = null;
            return (hl) (stackIn_5_0);
          }
          this.field_a = var3.field_h;
          if (param1 >= -100) {
            this.field_a = (hl) null;
          }
          stackIn_9_0 = var3;
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_12_0 = var3_ref;
          stackIn_12_1 = new StringBuilder().append("tm.A(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(int param0, String param1, java.applet.Applet param2) {
        try {
          String var6 = null;
          String var5 = null;
          String var4 = null;
          String var7 = null;
          String var5Lifetime1;
          String var5Lifetime2;
          String var5Lifetime3;
          String var5Lifetime4;
          String var5Lifetime5;
          String var5Lifetime6;
          try {
            if (param0 != -32312) {
              tm.b((byte) 13);
            }
            il.field_a = param1;
            try {
              var6 = param2.getParameter("cookieprefix");
              var5 = var6;
              var5Lifetime1 = var6;
              var4 = param2.getParameter("cookiehost");
              var5Lifetime2 = var4;
              var5Lifetime3 = var4;
              var7 = var6 + "settings=" + param1 + "; version=1; path=/; domain=" + var4;
              var5Lifetime4 = var7;
              var5Lifetime5 = var7;
              if (param1.length() == 0) {
                var5Lifetime6 = var7 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
              } else {
                var5Lifetime6 = var7 + "; Expires=" + cd.a(param0 + 32381, bb.b(-1) + 94608000000L) + "; Max-Age=" + 94608000L;
              }
              eo.a(param2, -31645, "document.cookie=\"" + var5Lifetime6 + "\"");
            } catch (Throwable throwable) {
            }
            bb.a(param2, (byte) 49);
          } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) ((Object) runtimeException), "tm.G(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final hl a(int param0) {
        hl var2 = this.field_d.field_e.field_a;
        if (param0 != 8115) {
          return (hl) null;
        }
        if (var2 != this.field_d.field_e) {
          this.field_a = var2.field_a;
          return var2;
        }
        this.field_a = null;
        return null;
    }

    final static boolean b(boolean param0) {
        if (param0) {
          return false;
        }
        return !fj.field_o.a(250) ? true : false;
    }

    final hl a(int param0, hl param1) {
        hl var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_7_0 = null;
        hl stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -10279) {
            field_b = (String[]) null;
          }
          if (param1 == null) {
            var3 = this.field_d.field_e.field_a;
          } else {
            var3 = param1;
          }
          if (var3 != this.field_d.field_e) {
            this.field_a = var3.field_a;
            stackIn_9_0 = var3;
            return stackIn_9_0;
          }
          this.field_a = null;
          stackIn_7_0 = null;
          return (hl) (stackIn_7_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_12_0 = var3_ref;
          stackIn_12_1 = new StringBuilder().append("tm.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    public static void b(byte param0) {
        int var1 = 15 / ((param0 - 73) / 50);
        field_b = null;
    }

    final hl a(boolean param0) {
        hl var2 = this.field_a;
        if (var2 == this.field_d.field_e) {
          this.field_a = null;
          return null;
        }
        if (!param0) {
          this.field_a = var2.field_a;
          return var2;
        }
        return (hl) null;
    }

    final hl a(byte param0) {
        hl var2 = null;
        hl var2Lifetime1;
        if (param0 != -104) {
          hl var3 = (hl) null;
          this.a(-43, (hl) null);
          var2 = this.field_a;
          if (this.field_d.field_e != var2) {
            this.field_a = var2.field_h;
            return var2;
          }
          this.field_a = null;
          return null;
        }
        var2Lifetime1 = this.field_a;
        if (this.field_d.field_e != var2Lifetime1) {
          this.field_a = var2Lifetime1.field_h;
          return var2Lifetime1;
        }
        this.field_a = null;
        return null;
    }

    tm(ah param0) {
        try {
          this.field_d = param0;
        } catch (RuntimeException runtimeException) {
          throw kk.a((Throwable) ((Object) runtimeException), "tm.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final hl c(byte param0) {
        int var3 = -72 % ((param0 + 65) / 49);
        hl var2 = this.field_d.field_e.field_h;
        if (var2 != this.field_d.field_e) {
          this.field_a = var2.field_h;
          return var2;
        }
        this.field_a = null;
        return null;
    }

    static {
        field_c = 20000000L;
        field_b = new String[]{"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
    }
}
