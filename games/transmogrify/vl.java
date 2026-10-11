/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class vl extends fi {
    static wc field_C;
    static int field_y;
    static int[] field_G;
    static long field_B;
    static int field_A;
    private int field_z;
    private int field_D;
    private boolean field_I;
    private int field_H;
    private int field_E;
    private boolean field_F;

    public static void i(int param0) {
        field_G = null;
        field_C = null;
        if (param0 != 2147483647) {
          field_B = -119L;
        }
    }

    final static void a(byte param0, java.applet.Applet param1) {
        try {
          java.net.URL var2 = null;
          Exception var2_ref = null;
          RuntimeException var2_ref2 = null;
          int var3 = 0;
          RuntimeException stackIn_6_0 = null;
          StringBuilder stackIn_6_1 = null;
          String stackIn_7_2 = null;
          Throwable decompiledCaughtException = null;
          try {
            try {
              var2 = new java.net.URL(param1.getCodeBase(), "quit.ws");
              var3 = -62 / ((param0 - 47) / 43);
              param1.getAppletContext().showDocument(dh.a(param1, (byte) 59, var2), "_top");
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
            stackIn_6_0 = var2_ref2;
            stackIn_6_1 = new StringBuilder().append("vl.A(").append(param0).append(',');
            if (param1 == null) {
              stackIn_7_2 = "null";
            } else {
              stackIn_7_2 = "{...}";
            }
            throw ch.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final boolean b(int param0, int param1, qg param2, int param3, int param4, int param5, int param6) {
        int var8_int = 0;
        RuntimeException var8 = null;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var8_int = super.b(param0, param1, param2, param3, param4, param5, param6) ? 1 : 0;
          if (var8_int != 0 &&
            this.field_I) {
            return true;
          }
          if (!this.b(param3, param6, param4 + 30385, param0, param5)) {
            stackIn_6_0 = var8_int;
            return stackIn_6_0 != 0;
          }
          if (param1 == 1) {
            this.field_H = param5 + (-this.field_n - param6);
            b.field_i = this;
            this.field_E = -param3 + param0 - this.field_p;
          }
          this.field_s = param1;
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_14_0 = var8;
          stackIn_14_1 = new StringBuilder().append("vl.O(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    final void a(byte param0) {
        super.a((byte) 127);
        this.field_v.a(-126, 0, 0, this.field_l, this.field_h);
        int var2 = -38 / ((74 - param0) / 49);
        this.field_D = this.field_p;
        this.field_z = this.field_n;
    }

    final StringBuilder a(int param0, int param1, StringBuilder param2, Hashtable param3) {
        StringBuilder discarded$62 = null;
        StringBuilder discarded$63 = null;
        RuntimeException var5 = null;
        StringBuilder stackIn_2_0 = null;
        StringBuilder stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 >= -20) {
            stackIn_2_0 = (StringBuilder) null;
            return stackIn_2_0;
          }
          if (this.a((byte) -108, param3, param2, param0)) {
            this.a(param2, 84, param0, param3);
            this.a(param2, param0, param3, false);
            discarded$62 = param2.append(" revert=").append(this.field_F);
            if (2147483647 != this.field_D &&
              2147483647 != this.field_z) {
              discarded$63 = param2.append(" to ").append(this.field_D).append(',').append(this.field_z);
            }
          }
          stackIn_9_0 = (StringBuilder) (param2);
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_12_0 = var5;
          stackIn_12_1 = new StringBuilder().append("vl.Q(").append(param0).append(',').append(param1).append(',');
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

    final void a(int param0, int param1, qg param2, int param3, int param4, int param5) {
        try {
          super.a(param0, param1, param2, param3, param4, param5);
          this.field_s = 0;
        } catch (RuntimeException runtimeException) {
          throw ch.a((Throwable) ((Object) runtimeException), "vl.BA(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    private vl(int param0, int param1, int param2, int param3, ui param4, ma param5, qg param6, boolean param7, boolean param8) {
        super(param0, param1, param2, param3, param4, param5);
        this.field_D = 2147483647;
        this.field_z = 2147483647;
        try {
          this.field_I = param8 ? true : false;
          this.field_v = param6;
          this.field_F = param7 ? true : false;
        } catch (RuntimeException runtimeException) {
          throw ch.a((Throwable) ((Object) runtimeException), "vl.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + (param6 != null ? "{...}" : "null") + ',' + param7 + ',' + param8 + ')');
        }
    }

    final static String b(int param0, String param1) {
        int var4 = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
        char[] var3 = null;
        int var5 = 0;
        String stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = Transmogrify.field_A ? 1 : 0;
        try {
          if (param0 != -1) {
            field_B = -34L;
          }
          var2_int = param1.length();
          var3 = new char[var2_int];
          for (var4 = 0; var2_int > var4; var4++) {
            var3[-var4 - 1 + var2_int] = param1.charAt(var4);
          }
          stackIn_7_0 = new String(var3);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_10_0 = var2;
          stackIn_10_1 = new StringBuilder().append("vl.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final static uj a(int param0, String param1) {
        RuntimeException var2 = null;
        Object stackIn_4_0 = null;
        Object stackIn_9_0 = null;
        uj stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 42) {
            field_y = -80;
          }
          if (of.field_d == db.field_a) {
            stackIn_4_0 = null;
            return (uj) (stackIn_4_0);
          }
          if (db.field_a == gd.field_l &&
            param1.equals(jh.field_g)) {
            db.field_a = jh.field_n;
            stackIn_11_0 = de.field_a;
            return stackIn_11_0;
          }
          jh.field_g = param1;
          db.field_a = of.field_d;
          de.field_a = null;
          stackIn_9_0 = null;
          return (uj) (stackIn_9_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_14_0 = var2;
          stackIn_14_1 = new StringBuilder().append("vl.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    final void a(int param0, byte param1, qg param2, int param3) {
        int stackIn_14_1 = 0;
        int stackIn_17_2 = 0;
        int stackIn_22_1 = 0;
        int stackIn_25_2 = 0;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        try {
          if ((!(this.field_v instanceof lj) ||
            ((lj) (this.field_v)).field_t) &&
            this.field_s == 1) {
            var5_int = oa.field_j + (-this.field_E - param3);
            var6 = -this.field_H + bk.field_a - param0;
            if (this.field_p != var5_int ||
              var6 != this.field_n) {
              this.field_n = var6;
              this.field_p = var5_int;
              if (this.field_m instanceof eb) {
                ((eb) (this.field_m)).a(param3, this, param0, true);
              }
            }
          } else {
            if (this.field_F) {
              if (this.field_p != this.field_D) {
                var5_int = this.field_D - this.field_p;
                stackIn_14_1 = this.field_p;
                if (2 >= Math.abs(var5_int)) {
                  if (var5_int > 0) {
                    stackIn_17_2 = 1;
                  } else {
                    stackIn_17_2 = -1;
                  }
                } else {
                  stackIn_17_2 = var5_int >> 1;
                }
                this.field_p = stackIn_14_1 + stackIn_17_2;
              }
              if (this.field_z != this.field_n) {
                var5_int = -this.field_n + this.field_z;
                stackIn_22_1 = this.field_n;
                if (Math.abs(var5_int) <= 2) {
                  if (var5_int <= 0) {
                    stackIn_25_2 = -1;
                  } else {
                    stackIn_25_2 = 1;
                  }
                } else {
                  stackIn_25_2 = var5_int >> 1;
                }
                this.field_n = stackIn_22_1 + stackIn_25_2;
              }
            }
          }
          super.a(param0, param1, param2, param3);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_30_0 = var5;
          stackIn_30_1 = new StringBuilder().append("vl.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_30_0), ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',').append(param3).append(')').toString());
        }
    }

    static {
        field_G = new int[]{44, 40, 43, 45, 46, 40, 45, 40, 44, 40, 42, 49, 49, 49, 46, 40, 42, 49, 39};
    }
}
