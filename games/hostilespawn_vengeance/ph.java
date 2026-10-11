/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class ph extends ag {
    static String field_y;
    boolean field_D;
    private boolean field_C;
    boolean field_A;
    static String field_z;
    static gb field_F;
    static String field_B;
    private boolean field_E;

    final static jj a(String param0, int param1) {
        RuntimeException var2 = null;
        Object stackIn_4_0 = null;
        Object stackIn_9_0 = null;
        jj stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 > -76) {
            field_z = (String) null;
          }
          if (ti.field_b == ki.field_f) {
            stackIn_4_0 = null;
            return (jj) (stackIn_4_0);
          }
          if (ee.field_b == ki.field_f &&
            param0.equals(uh.field_g)) {
            ki.field_f = e.field_q;
            stackIn_11_0 = nl.field_a;
            return stackIn_11_0;
          }
          nl.field_a = null;
          ki.field_f = ti.field_b;
          uh.field_g = param0;
          stackIn_9_0 = null;
          return (jj) (stackIn_9_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_14_0 = var2;
          stackIn_14_1 = new StringBuilder().append("ph.IB(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(')').toString());
        }
    }

    final void a(int param0, int param1, int param2, int param3, ag param4, int param5) {
        try {
          if (this.field_p != null &&
            this.field_p instanceof hl) {
            ((hl) (this.field_p)).a(param3, (byte) 127, param0, this, param2, param1);
          }
          this.field_r = param5;
        } catch (RuntimeException runtimeException) {
          throw wg.a((Throwable) ((Object) runtimeException), "ph.GA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ')');
        }
    }

    boolean a(byte param0, ag param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!this.field_D) {
            return false;
          }
          if (!this.field_E) {
            return false;
          }
          param1.c((byte) -93);
          this.field_C = true;
          if (param0 >= 0) {
            this.field_C = false;
          }
          if (null != this.field_p &&
            this.field_p instanceof ah) {
            ((ah) (this.field_p)).a(this.field_C, (ag) (this), -111);
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_15_0 = var3;
          stackIn_15_1 = new StringBuilder().append("ph.LA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    void a(int param0, boolean param1, int param2, int param3) {
        if (!param1) {
          this.field_D = true;
          if (this.field_p != null) {
            if (this.field_p instanceof qk) {
              ((qk) (this.field_p)).a(param3, param2, param0, this, (byte) -118);
            }
            return;
          }
          return;
        }
        if (this.field_p == null) {
          return;
        }
        if (this.field_p instanceof qk) {
          ((qk) (this.field_p)).a(param3, param2, param0, this, (byte) -118);
          return;
        }
    }

    void a(ag param0, int param1, int param2, int param3) {
        try {
          super.a(param0, param1, param2 + param2, param3);
          if (this.field_r != 0) {
            if (this.field_r == ig.field_L) {
              return;
            }
            if (this.b(rb.field_m, j.field_c, 255, param1, param3) &&
              ig.field_L == 0) {
              this.a(rb.field_m - param1, true, j.field_c - param3, this.field_r);
            }
            this.a(j.field_c, param1, param3, rb.field_m, param0, 0);
          }
        } catch (RuntimeException runtimeException) {
          throw wg.a((Throwable) ((Object) runtimeException), "ph.W(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    ph(String param0, mh param1) {
        this(param0, gf.field_e.field_e, param1);
    }

    final static void h(int param0) {
        try {
          Throwable decompiledCaughtException = null;
          java.lang.reflect.Method var1 = null;
          Exception var1_ref = null;
          Runtime var2 = null;
          Throwable var2_ref = null;
          Long var3 = null;
          Object[] var4 = null;
          try {
            if (param0 != 1048576) {
              ph.h(-49);
            }
            var1 = Runtime.class.getMethod("maxMemory", new Class[]{});
            if (var1 != null) {
              try {
                var2 = Runtime.getRuntime();
                var4 = (Object[]) null;
                var3 = (Long) (var1.invoke((Object) (var2), (Object[]) null));
                ca.field_d = 1 + (int)(var3.longValue() / 1048576L);
                return;
              } catch (java.lang.Throwable decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var2_ref = decompiledCaughtException;
              }
            }
          } catch (java.lang.Exception decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var1_ref = (Exception) (Object) decompiledCaughtException;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final boolean g(int param0) {
        if (param0 != -9015) {
          return false;
        }
        return this.field_C;
    }

    ph(String param0, nn param1, mh param2) {
        super(param0, param1, param2);
        this.field_D = true;
        this.field_C = false;
        this.field_E = true;
    }

    final StringBuilder a(int param0, Hashtable param1, int param2, StringBuilder param3) {
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        RuntimeException var5 = null;
        ag var6 = null;
        StringBuilder stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.a(param3, param2, false, param1)) {
            this.a(param2, param1, param3, -112);
            if (this.field_A) {
              discarded$2 = param3.append(" active");
            }
            if (!this.field_D) {
              discarded$3 = param3.append(" disabled");
            }
          }
          if (param0 < 73) {
            var6 = (ag) null;
            this.a(79, 19, 55, -17, (byte) -121, (ag) null, 29);
          }
          stackIn_10_0 = (StringBuilder) (param3);
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_13_0 = var5;
          stackIn_13_1 = new StringBuilder().append("ph.IA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    final void c(byte param0) {
        int var2 = 0;
        int var2Lifetime1;
        int var2Lifetime2;
        int var2Lifetime3;
        if (!this.field_C) {
          var2 = -61 / ((param0 + 27) / 39);
          return;
        }
        this.field_C = false;
        if (this.field_p == null) {
          var2Lifetime1 = -61 / ((param0 + 27) / 39);
          return;
        }
        if (this.field_p instanceof ah) {
          ((ah) (this.field_p)).a(this.field_C, (ag) (this), -112);
          var2Lifetime2 = -61 / ((param0 + 27) / 39);
          return;
        }
        var2Lifetime3 = -61 / ((param0 + 27) / 39);
    }

    public static void i(int param0) {
        field_F = null;
        field_z = null;
        if (param0 == 84) {
          field_B = null;
          field_y = null;
          return;
        }
        field_B = (String) null;
        field_B = null;
        field_y = null;
    }

    boolean a(int param0, int param1, int param2, int param3, byte param4, ag param5, int param6) {
        RuntimeException var8 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param4 != 110) {
            return false;
          }
          if (!this.field_D) {
            return false;
          }
          if (!this.b(param3, param0, param4 ^ 145, param2, param1)) {
            return false;
          }
          this.a((byte) -125, param5);
          this.field_r = param6;
          if (null != this.field_p &&
            this.field_p instanceof hl) {
            ((hl) (this.field_p)).a(param3, param0, param6, param1, 115, this, param2);
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_16_0 = var8;
          stackIn_16_1 = new StringBuilder().append("ph.KA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param6).append(')').toString());
        }
    }

    protected ph() {
        this.field_D = true;
        this.field_C = false;
        this.field_E = true;
        this.field_h = gf.field_e.field_d;
    }

    boolean a(int param0, ag param1, int param2, char param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.g(-9015) && (param2 == 84 ||
            param2 == 83)) {
            this.a(-1, true, -1, 1);
            return true;
          }
          if (param0 == 274) {
            return false;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_13_0 = var5;
          stackIn_13_1 = new StringBuilder().append("ph.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    static {
        field_y = "Fullscreen mode was cancelled after a delay of 10 seconds. If you were unable to accept fullscreen mode during this time, there may be a problem with your configuration. You could try restarting your browser and trying again.";
        field_B = "Get back to the lift before the reactor explodes!";
        field_z = "Charges: ";
    }
}
