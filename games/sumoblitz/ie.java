/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class ie extends pk implements ug {
    static int field_x;
    pk field_y;

    private final boolean a(boolean param0, pk param1) {
        RuntimeException var3 = null;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0) {
            this.field_y = (pk) null;
          }
          stackIn_7_0 = (this.field_y != null) && (!this.field_y.d(-1)) && (this.field_y.a(param1, (byte) 61));
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("ie.K(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final static jj[] a(int param0) {
        if (param0 == 32) {
          return new jj[]{go.field_m, tr.field_j, na.field_c};
        }
        java.applet.Applet var2 = (java.applet.Applet) null;
        ie.a(-3, (String) null, (java.applet.Applet) null);
        return new jj[]{go.field_m, tr.field_j, na.field_c};
    }

    final void a(int param0, StringBuilder param1, Hashtable param2, byte param3) {
        StringBuilder discarded$12 = null;
        int var5_int = 0;
        StringBuilder discarded$14 = null;
        StringBuilder discarded$13 = null;
        RuntimeException var5 = null;
        int var6 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = Sumoblitz.field_L ? 1 : 0;
        try {
          discarded$12 = param1.append('\n');
          if (param3 != -43) {
            this.e(-119);
          }
          for (var5_int = 0; param0 >= var5_int; var5_int++) {
            discarded$14 = param1.append(' ');
          }
          if (null != this.field_y) {
            this.field_y.a(1 + param0, param2, param1, 0);
            return;
          }
          discarded$13 = param1.append("null");
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_12_0 = var5;
          stackIn_12_1 = new StringBuilder().append("ie.L(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param2 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param3).append(')').toString());
        }
    }

    boolean a(pk param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        RuntimeException var8 = null;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 >= -42) {
            return false;
          }
          stackIn_7_0 = (this.field_y != null) && (this.field_y.a(param0, -124, param2, param3, param4 + this.field_r, param5, param6 + this.field_v));
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_10_0 = var8;
          stackIn_10_1 = new StringBuilder().append("ie.R(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    final boolean a(pk param0, byte param1) {
        RuntimeException var3 = null;
        boolean stackIn_6_0 = false;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 61) {
            this.a(-20, -76, (byte) -66, -38);
          }
          stackIn_6_0 = (this.field_y != null) && (this.field_y.a(param0, (byte) 61));
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("ie.Q(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
        }
    }

    final void c(byte param0) {
        int var2 = 0;
        int var2Lifetime1;
        if (this.field_y == null) {
          var2 = 71 % ((param0 - 64) / 51);
          return;
        }
        this.field_y.c((byte) 121);
        var2Lifetime1 = 71 % ((param0 - 64) / 51);
    }

    void a(int param0, int param1, byte param2, int param3) {
        if (param3 == 0) {
          if (this.field_w == null) {
            if (null == this.field_y) {
              if (param2 <= -35) {
                return;
              }
              this.e(31);
              return;
            }
            this.field_y.a(this.field_r + param0, this.field_v + param1, (byte) -38, param3);
            if (param2 > -35) {
              this.e(31);
              return;
            }
            return;
          }
          this.field_w.a((pk) (this), param1, 5592405, true, param0);
        }
        if (null != this.field_y) {
          this.field_y.a(this.field_r + param0, this.field_v + param1, (byte) -38, param3);
          if (param2 <= -35) {
            return;
          }
          this.e(31);
          return;
        }
        if (param2 <= -35) {
          return;
        }
        this.e(31);
    }

    final int e(int param0) {
        int var2 = 47 % ((-10 - param0) / 46);
        return this.field_y == null ? 0 : this.field_y.e(-66);
    }

    void d(boolean param0) {
        if (this.field_y != null) {
          this.field_y.c(param0);
        }
        if (param0) {
          field_x = 127;
          return;
        }
    }

    final boolean a(pk param0, char param1, byte param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        boolean stackIn_9_0 = false;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_y != null &&
            this.field_y.d(-1) &&
            this.field_y.a(param0, param1, (byte) 64, param3)) {
            return true;
          }
          var5_int = param3;
          if (var5_int != 80) {
            if (param2 >= 9) {
              return false;
            }
            this.field_y = (pk) null;
            return false;
          }
          if (hw.field_b[81]) {
            stackIn_9_0 = this.a(false, param0);
          } else {
            stackIn_9_0 = this.a(param0, false);
          }
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_16_0 = var5;
          stackIn_16_1 = new StringBuilder().append("ie.KA(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    void a(int param0, int param1, pk param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5_int = -91 / ((param1 + 25) / 45);
          super.a(param0, -84, param2, param3);
          if (null == this.field_y) {
            return;
          }
          this.field_y.a(this.field_r + param0, -109, param2, param3 + this.field_v);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_6_0 = var5;
          stackIn_6_1 = new StringBuilder().append("ie.U(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param3).append(')').toString());
        }
    }

    final boolean d(int param0) {
        if (param0 != -1) {
          return false;
        }
        return this.f(16777216) != null ? true : false;
    }

    final static void a(int param0, String param1, java.applet.Applet param2) {
        try {
          String var7 = null;
          String var5 = null;
          String var8 = null;
          String var6 = null;
          try {
            int var3_int = -31 % ((-22 - param0) / 49);
            js.field_J = param1;
            try {
              var7 = param2.getParameter("cookieprefix");
              var5 = param2.getParameter("cookiehost");
              var8 = var7 + "session=" + param1 + "; version=1; path=/; domain=" + var5;
              var6 = var8;
              if (param1.length() == 0) {
                var6 = var8 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
              }
              tw.a("document.cookie=\"" + var6 + "\"", -15428, param2);
            } catch (Throwable throwable) {
            }
            va.a(false, param2);
          } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) ((Object) runtimeException), "ie.M(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    StringBuilder a(int param0, Hashtable param1, StringBuilder param2, int param3) {
        RuntimeException var5 = null;
        StringBuilder stackIn_5_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.a(param0, param1, 103, param2)) {
            this.a(param0, (byte) -128, param2, param1);
            this.a(param0, param2, param1, (byte) -43);
          }
          if (param3 != 0) {
            this.a(-113, -16, (byte) 74, 71);
          }
          stackIn_5_0 = (StringBuilder) (param2);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_8_0 = var5;
          stackIn_8_1 = new StringBuilder().append("ie.S(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',');
          if (param2 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param3).append(')').toString());
        }
    }

    pk f(int param0) {
        pk var2 = null;
        pk var2Lifetime1;
        if (param0 != 16777216) {
          this.field_y = (pk) null;
          var2 = this.field_y;
          if (var2 == null) {
            return null;
          }
          if (var2.d(-1)) {
            return var2;
          }
          return null;
        }
        var2Lifetime1 = this.field_y;
        if (var2Lifetime1 == null) {
          return null;
        }
        if (var2Lifetime1.d(-1)) {
          return var2Lifetime1;
        }
        return null;
    }

    void a(pk param0, boolean param1, int param2, int param3, int param4, int param5) {
        RuntimeException var7 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_y != null) {
            this.field_y.a(param0, param1, this.field_r + param2, param3, param4, param5 + this.field_v);
          }
          if (!param1) {
            return;
          }
          field_x = -44;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_8_0 = var7;
          stackIn_8_1 = new StringBuilder().append("ie.T(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        int var6 = -17 / ((28 - param0) / 63);
        super.a(117, param1, param2, param3, param4);
        this.d(false);
    }

    ie(int param0, int param1, int param2, int param3, mh param4, qm param5) {
        super(param0, param1, param2, param3, param4, param5);
    }

    String c(int param0) {
        String var2 = super.c(param0);
        if (null == this.field_y) {
          return var2;
        }
        String var3 = this.field_y.c(-6696);
        if (var3 == null) {
          return var2;
        }
        return var3;
    }

    private final boolean a(pk param0, boolean param1) {
        boolean discarded$1 = false;
        RuntimeException var3 = null;
        pk var4 = null;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1) {
            var4 = (pk) null;
            discarded$1 = this.a((pk) null, false);
          }
          stackIn_7_0 = (null != this.field_y) && (!this.field_y.d(-1)) && (this.field_y.a(param0, (byte) 61));
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("ie.N(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    final boolean a(int param0, int param1, int param2, int param3, int param4, pk param5, int param6) {
        RuntimeException var8 = null;
        boolean stackIn_8_0 = false;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 != -1) {
            return false;
          }
          stackIn_8_0 = (null != this.field_y) && (this.field_y.d(-1)) && (this.field_y.a(param0, param1, param2 + 0, param3, param4, param5, param6));
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_11_0 = var8;
          stackIn_11_1 = new StringBuilder().append("ie.RA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param6).append(')').toString());
        }
    }

    static {
    }
}
