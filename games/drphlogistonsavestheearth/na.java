/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

abstract class na {
    java.awt.Image field_h;
    static String field_d;
    static char[] field_a;
    int field_f;
    int[] field_e;
    static String field_b;
    static he field_c;
    int field_g;

    final static boolean b(int param0) {
        if (param0 != -1) {
          na.a((byte) 110);
          return sg.field_a;
        }
        return sg.field_a;
    }

    final static boolean a(hg param0, byte param1, hg param2) {
        int var3_int = 0;
        int var4 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          var3_int = param2.field_tb - param0.field_tb;
          if (param2.field_qb != rc.field_e) {
            if (null == param2.field_qb) {
              var3_int += 200;
            }
          } else {
            var3_int -= 200;
          }
          if (param0.field_qb == rc.field_e) {
            var3_int += 200;
          } else {
            if (null == param0.field_qb) {
              var3_int -= 200;
            }
          }
          if (param1 != -95) {
            field_b = (String) null;
          }
          return !(var3_int <= 0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_18_0 = var3;
          stackIn_18_1 = new StringBuilder().append("na.F(");
          if (param0 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(')').toString());
        }
    }

    abstract void a(java.awt.Graphics param0, int param1, int param2, int param3);

    final static vj a(boolean param0, int param1, boolean param2, boolean param3, boolean param4, int param5) {
        try {
          Object var6 = null;
          Object var7 = null;
          de var8 = null;
          vj stackIn_13_0 = null;
          Throwable decompiledCaughtException = null;
          try {
            var6 = null;
            if (!param4) {
              na.a(false, -5, true, true, true, -73);
            }
            var7 = null;
            if (null != oi.field_e.field_d) {
              uj.field_h = new ge(oi.field_e.field_d, 5200, 0);
              oi.field_e.field_d = null;
              var6 = new ik(255, uj.field_h, new ge(oi.field_e.field_b, 12000, 0), 2097152);
            }
            if (uj.field_h != null) {
              if (rc.field_d == null) {
                rc.field_d = new ge[oi.field_e.field_c.length];
              }
              if (null == rc.field_d[param1]) {
                rc.field_d[param1] = new ge(oi.field_e.field_c[param1], 12000, 0);
                oi.field_e.field_c[param1] = null;
              }
              var7 = new ik(param1, uj.field_h, rc.field_d[param1], 2097152);
            }
            var8 = fl.field_a.a(param1, param2, (ik) (var6), (ik) (var7), (byte) 75);
            if (param3) {
              var8.f(107);
            }
            stackIn_13_0 = new vj(var8, param0, param5);
            return stackIn_13_0;
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var6 = (IOException) (Object) decompiledCaughtException;
            throw new RuntimeException(((IOException) (var6)).toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(byte param0) {
        if (param0 == -33) {
          field_b = null;
          field_c = null;
          field_a = null;
          field_d = null;
          return;
        }
        hg var2 = (hg) null;
        na.$cfr$intArgs$a$0163a84c1fcf((hg) null, -50, (hg) null);
        field_b = null;
        field_c = null;
        field_a = null;
        field_d = null;
    }

    final void a(int param0) {
        if (param0 >= 94) {
          wj.a(this.field_e, this.field_f, this.field_g);
          return;
        }
        na.a((byte) -78);
        wj.a(this.field_e, this.field_f, this.field_g);
    }

    abstract void a(int param0, int param1, byte param2, java.awt.Component param3);

    static {
        field_d = "Click";
        field_a = new char[128];
        field_b = "Weapon unavailable";
    }

    /* Full JVM integer arguments; original narrow signature preserved. */
    final static boolean $cfr$intArgs$a$0163a84c1fcf(hg param0, int param1, hg param2) {
        int var3_int = 0;
        int var4 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          var3_int = param2.field_tb - param0.field_tb;
          if (param2.field_qb != rc.field_e) {
            if (null == param2.field_qb) {
              var3_int += 200;
            }
          } else {
            var3_int -= 200;
          }
          if (param0.field_qb == rc.field_e) {
            var3_int += 200;
          } else {
            if (null == param0.field_qb) {
              var3_int -= 200;
            }
          }
          if (param1 != -95) {
            field_b = (String) null;
          }
          return !(var3_int <= 0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_18_0 = var3;
          stackIn_18_1 = new StringBuilder().append("na.F(");
          if (param0 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(')').toString());
        }
    }
}
