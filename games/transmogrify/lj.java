/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class lj extends qg {
    private boolean field_v;
    static bb field_u;
    boolean field_t;
    static double field_x;
    static hi field_z;
    private boolean field_w;
    boolean field_y;

    final static int a(int param0, char param1, CharSequence param2) {
        int var5 = 0;
        int var3_int = 0;
        int var4 = 0;
        int var6 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var6 = Transmogrify.field_A ? 1 : 0;
        try {
          var3_int = 0;
          var4 = param2.length();
          for (var5 = 0; var4 > var5; var5++) {
            if (~param2.charAt(var5) == ~param1) {
              var3_int++;
            }
          }
          if (param0 < 120) {
            field_x = 0.6750055556683646;
          }
          stackIn_12_0 = var3_int;
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_15_0 = var3;
          stackIn_15_1 = new StringBuilder().append("lj.NA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    public static void c(boolean param0) {
        if (!param0) {
          field_x = -1.0687482226304967;
          field_z = null;
          field_u = null;
          return;
        }
        field_z = null;
        field_u = null;
    }

    boolean a(qg param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_t &&
            this.field_v) {
            param0.e(-29113);
            this.field_w = true;
            if (this.field_m != null &&
              this.field_m instanceof la) {
              ((la) (this.field_m)).a((qg) (this), (byte) -73, this.field_w);
            }
            if (param1 < -11) {
              return true;
            }
            this.field_t = false;
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_14_0 = var3;
          stackIn_14_1 = new StringBuilder().append("lj.M(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void d(byte param0) {
        int var1 = -62 / ((37 - param0) / 44);
        tb.a(ha.b(119), true);
    }

    lj(String param0, ui param1, ma param2) {
        super(param0, param1, param2);
        this.field_t = true;
        this.field_w = false;
        this.field_v = true;
    }

    lj(String param0, ma param1) {
        this(param0, vi.field_e.field_d, param1);
    }

    boolean a(int param0, qg param1, byte param2, char param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5_int = 15 % ((param2 - 65) / 55);
          if (this.b((byte) 109) && (param0 == 84 ||
            param0 == 83)) {
            this.a((byte) -102, -1, 1, -1);
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_10_0 = var5;
          stackIn_10_1 = new StringBuilder().append("lj.K(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    void a(byte param0, int param1, int param2, int param3) {
        int var5 = 23 / ((50 - param0) / 45);
        if (this.field_m == null) {
          return;
        }
        if (this.field_m instanceof df) {
          ((df) (this.field_m)).a(this, 17, param1, param2, param3);
          return;
        }
    }

    final StringBuilder a(int param0, int param1, StringBuilder param2, Hashtable param3) {
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        RuntimeException var5 = null;
        StringBuilder stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 >= -20) {
            this.a((byte) 29, 113, 50, 108);
          }
          if (this.a((byte) -105, param3, param2, param0)) {
            this.a(param2, 74, param0, param3);
            if (this.field_y) {
              discarded$2 = param2.append(" active");
            }
            if (!this.field_t) {
              discarded$3 = param2.append(" disabled");
            }
          }
          stackIn_9_0 = (StringBuilder) (param2);
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_12_0 = var5;
          stackIn_12_1 = new StringBuilder().append("lj.Q(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param3 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    void a(int param0, byte param1, qg param2, int param3) {
        try {
          super.a(param0, param1, param2, param3);
          if (0 != this.field_s) {
            if (this.field_s == b.field_k) {
              return;
            }
            if (this.b(param3, param0, param1 + 11, oa.field_j, bk.field_a) &&
              0 == b.field_k) {
              this.a((byte) -105, -param0 + bk.field_a, this.field_s, -param3 + oa.field_j);
            }
            this.a(param0, oa.field_j, param2, -1, bk.field_a, param3);
          }
        } catch (RuntimeException runtimeException) {
          throw ch.a((Throwable) ((Object) runtimeException), "lj.B(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    boolean b(int param0, int param1, qg param2, int param3, int param4, int param5, int param6) {
        RuntimeException var8 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_t &&
            this.b(param3, param6, param4 ^ 30385, param0, param5)) {
            this.a(param2, param4 + 30272);
            this.field_s = param1;
            if (null != this.field_m &&
              this.field_m instanceof lg) {
              ((lg) (this.field_m)).a(31298, param0, param5, param3, param1, param6, this);
            }
            return true;
          }
          if (param4 == -30386) {
            return false;
          }
          this.field_y = false;
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_13_0 = var8;
          stackIn_13_1 = new StringBuilder().append("lj.O(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    final boolean b(byte param0) {
        int var2 = 10 % ((-57 - param0) / 46);
        return this.field_w;
    }

    final void a(int param0, int param1, qg param2, int param3, int param4, int param5) {
        try {
          if (param3 != -1) {
            lj.d((byte) 20);
          }
          if (this.field_m != null &&
            this.field_m instanceof lg) {
            ((lg) (this.field_m)).a(this, param1, 9976, param4, param0, param5);
          }
          this.field_s = 0;
        } catch (RuntimeException runtimeException) {
          throw ch.a((Throwable) ((Object) runtimeException), "lj.BA(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final void e(int param0) {
        if (!this.field_w) {
          if (param0 == -29113) {
            return;
          }
          this.field_y = true;
          return;
        }
        this.field_w = false;
        if (null == this.field_m) {
          if (param0 == -29113) {
            return;
          }
          this.field_y = true;
          return;
        }
        if (this.field_m instanceof la) {
          ((la) (this.field_m)).a((qg) (this), (byte) -42, this.field_w);
          if (param0 == -29113) {
            return;
          }
          this.field_y = true;
          return;
        }
        if (param0 == -29113) {
          return;
        }
        this.field_y = true;
    }

    final static String a(boolean param0, String param1, java.applet.Applet param2) {
        try {
          int var5 = 0;
          String var3 = null;
          String[] var4 = null;
          int var6 = 0;
          int var7 = 0;
          String stackIn_3_0 = null;
          String stackIn_10_0 = null;
          Object stackIn_15_0 = null;
          RuntimeException stackIn_18_0 = null;
          StringBuilder stackIn_18_1 = null;
          String stackIn_19_2 = null;
          StringBuilder stackIn_21_1 = null;
          String stackIn_22_2 = null;
          Throwable decompiledCaughtException = null;
          Throwable var3_ref = null;
          RuntimeException var3_ref2 = null;
          var7 = Transmogrify.field_A ? 1 : 0;
          try {
            try {
              if (!param0) {
                stackIn_3_0 = (String) null;
                return stackIn_3_0;
              }
              var3 = (String) (kj.a(param2, false, "getcookies"));
              var4 = vi.a(';', var3, 0);
              for (var5 = 0; var4.length > var5; var5++) {
                var6 = var4[var5].indexOf('=');
                if (var6 >= 0 &&
                  var4[var5].substring(0, var6).trim().equals(param1)) {
                  stackIn_10_0 = var4[var5].substring(1 + var6).trim();
                  return stackIn_10_0;
                }
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var3_ref = decompiledCaughtException;
            }
            stackIn_15_0 = null;
            return (String) (stackIn_15_0);
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var3_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_18_0 = var3_ref2;
            stackIn_18_1 = new StringBuilder().append("lj.MA(").append(param0).append(',');
            if (param1 == null) {
              stackIn_19_2 = "null";
            } else {
              stackIn_19_2 = "{...}";
            }
            stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',');
            if (param2 == null) {
              stackIn_22_2 = "null";
            } else {
              stackIn_22_2 = "{...}";
            }
            throw ch.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    protected lj() {
        this.field_t = true;
        this.field_w = false;
        this.field_v = true;
        this.field_q = vi.field_e.field_o;
    }

    static {
        field_x = 0.0;
    }
}
