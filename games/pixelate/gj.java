/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gj extends kb {
    static boolean field_V;
    static wm field_T;
    private c field_Q;
    private c field_O;
    private c field_U;
    private boolean field_S;
    static String[] field_R;
    static long field_P;
    static tf[] field_W;

    final int c(boolean param0) {
        NumberFormatException var2 = null;
        int stackIn_3_0 = 0;
        Throwable decompiledCaughtException = null;
        try {
          if (!param0) {
            this.c(false);
          }
          stackIn_3_0 = Integer.parseInt(this.field_Q.field_q);
          return stackIn_3_0;
        } catch (java.lang.NumberFormatException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (NumberFormatException) (Object) decompiledCaughtException;
          return -1;
        }
    }

    final static void a(String param0, java.applet.Applet param1, boolean param2) {
        try {
          Throwable throwable = null;
          String var3 = null;
          RuntimeException var3_ref = null;
          String var4 = null;
          String var5 = null;
          RuntimeException stackIn_11_0 = null;
          StringBuilder stackIn_11_1 = null;
          String stackIn_12_2 = null;
          StringBuilder stackIn_14_1 = null;
          String stackIn_15_2 = null;
          Throwable decompiledCaughtException = null;
          String var5Lifetime1;
          String var5Lifetime2;
          String var5Lifetime3;
          String var5Lifetime4;
          try {
            bh.field_n = param0;
            try {
              var3 = param1.getParameter("cookieprefix");
              var5 = var3;
              var5Lifetime1 = var3;
              var4 = param1.getParameter("cookiehost");
              var5Lifetime2 = var4;
              var5Lifetime3 = var4;
              var5Lifetime4 = var3 + "session=" + param0 + "; version=1; path=/; domain=" + var4;
              if (param0.length() == 0) {
                var5Lifetime4 = var5Lifetime4 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
              }
              cq.a(param1, (byte) -122, "document.cookie=\"" + var5Lifetime4 + "\"");
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              throwable = decompiledCaughtException;
            }
            ib.a(param1, false);
            if (param2) {
              return;
            }
            field_V = false;
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var3_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_11_0 = var3_ref;
            stackIn_11_1 = new StringBuilder().append("gj.E(");
            if (param0 == null) {
              stackIn_12_2 = "null";
            } else {
              stackIn_12_2 = "{...}";
            }
            stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',');
            if (param1 == null) {
              stackIn_15_2 = "null";
            } else {
              stackIn_15_2 = "{...}";
            }
            throw aa.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    private gj(eb param0, boolean param1) {
        super(0, 0, 0, 0, (eb) null);
        try {
          this.field_U = (c) ((Object) new gk("", (fn) null, 2));
          this.field_O = (c) ((Object) new gk("", (fn) null, 2));
          this.field_Q = (c) ((Object) new gk("", (fn) null, 4));
          this.field_Q.field_y = param0;
          this.field_O.field_y = param0;
          this.field_U.field_y = param0;
          this.field_S = param1 ? true : false;
          if (!this.field_S) {
            this.b(this.field_U, 80);
            this.b(this.field_O, 80);
          } else {
            this.b(this.field_O, 80);
            this.b(this.field_U, 80);
          }
          this.b(this.field_Q, 80);
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "gj.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final int e(byte param0) {
        int stackIn_1_0 = 0;
        Throwable decompiledCaughtException = null;
        int var2_int = 0;
        NumberFormatException var2 = null;
        try {
          var2_int = 11 / ((param0 - 23) / 48);
          stackIn_1_0 = Integer.parseInt(this.field_U.field_q);
          return stackIn_1_0;
        } catch (java.lang.NumberFormatException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (NumberFormatException) (Object) decompiledCaughtException;
          return -1;
        }
    }

    final boolean m(int param0) {
        if (null == this.field_U.field_q) {
          return true;
        }
        if (this.field_U.field_q.length() == 0) {
          return true;
        }
        if (this.field_O.field_q == null) {
          return true;
        }
        if (this.field_O.field_q.length() == 0) {
          return true;
        }
        if (param0 != -1) {
          return true;
        }
        if (this.field_Q.field_q == null) {
          return true;
        }
        if (this.field_Q.field_q.length() != 0) {
          return false;
        }
        return true;
    }

    final void a(int param0, byte param1, int param2, int param3, int param4) {
        super.a(param0, (byte) 77, param2, param3, param4);
        int var6 = param0 - 130 >> 1;
        if (this.field_S) {
          this.field_O.a(25, (byte) 29, 0, var6, param4);
          this.field_U.a(25, (byte) 46, 0, var6 + 45, param4);
          this.field_Q.a(40, (byte) 38, 0, 90 + var6, param4);
          if (param1 < 19) {
            field_P = -61L;
            return;
          }
          return;
        }
        this.field_U.a(25, (byte) 77, 0, var6, param4);
        this.field_O.a(25, (byte) 48, 0, 45 + var6, param4);
        this.field_Q.a(40, (byte) 38, 0, 90 + var6, param4);
        if (param1 < 19) {
          field_P = -61L;
          return;
        }
    }

    final int l(int param0) {
        NumberFormatException var2 = null;
        int stackIn_3_0 = 0;
        Throwable decompiledCaughtException = null;
        if (param0 != 25) {
          return -5;
        }
        try {
          stackIn_3_0 = Integer.parseInt(this.field_O.field_q) - 1;
          return stackIn_3_0;
        } catch (java.lang.NumberFormatException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (NumberFormatException) (Object) decompiledCaughtException;
          return -1;
        }
    }

    final void a(int param0, int param1, int param2, byte param3) {
        super.a(param0, param1, param2, (byte) -123);
        if (param1 == 0) {
          param0 = param0 + this.field_p;
          int var5 = -46 / ((param3 - 70) / 49);
          param2 = param2 + this.field_z;
          this.a(ij.field_r, param0, param2, 0, this.field_U);
          this.a(fc.field_b, param0, param2, 0, this.field_O);
          this.a(ji.field_e, param0, param2, 0, this.field_Q);
          return;
        }
    }

    private final void a(String param0, int param1, int param2, int param3, ng param4) {
        if (param3 != 0) {
          return;
        }
        try {
          ep.field_b.b(param0, param2 + (param4.field_z + (param4.field_E >> 1)), -5 + param4.field_p + param1, 16777215, -1);
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "gj.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(oa param0, int param1) {
        try {
          super.a(param0, param1);
          this.field_U.field_n = (fn) ((Object) param0);
          this.field_O.field_n = (fn) ((Object) param0);
          this.field_Q.field_n = (fn) ((Object) param0);
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "gj.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void f(byte param0) {
        field_T = null;
        if (param0 != -28) {
          field_R = (String[]) null;
          field_W = null;
          field_R = null;
          return;
        }
        field_W = null;
        field_R = null;
    }

    gj(eb param0, boolean param1, int param2, int param3, int param4, int param5) {
        this(param0, param1);
        try {
          this.a(param4, (byte) 21, param3, param2, param5);
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "gj.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final String b(byte param0) {
        String var2 = this.field_O.b((byte) 114);
        if (var2 != null) {
          return var2;
        }
        if (param0 <= 16) {
          this.field_U = (c) null;
          if (this.field_D) {
            return this.field_l == null ? this.field_q : this.field_l;
          }
          return null;
        }
        if (this.field_D) {
          return this.field_l == null ? this.field_q : this.field_l;
        }
        return null;
    }

    static {
        field_R = new String[]{"A slightly different approach is required to complete all fifty pictures in Puzzle Mode. Although the timer bar is gone, you'll only have a <col=FF9900>limited supply of tiles</col> in the list on the right. If you run out of tiles, then the puzzle is failed and you will have to try again. "};
        field_T = new wm(4, 1, 1, 1);
    }
}
