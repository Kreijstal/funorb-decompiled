/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class boa implements ntb {
    static no field_a;
    int[] field_c;
    static String field_b;

    public final void b(byte param0, tv param1) {
        boa var3 = null;
        RuntimeException var3_ref = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = (boa) (param1);
          var3.field_c = dob.a(var3.field_c, (byte) -97, this.field_c);
          if (param0 > 54) {
            return;
          }
          boa.a(-115, -119);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_5_0 = var3_ref;
          stackIn_5_1 = new StringBuilder().append("boa.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    final int a(byte param0) {
        if (param0 > 113) {
          return oab.a(-95, 8, this.field_c, null != this.field_c ? this.field_c.length : 0);
        }
        return 100;
    }

    public final void a(faa param0, boolean param1) {
        try {
          this.field_c = wkb.a((byte) 37, this.field_c, param0, 8);
          if (param1) {
            boa.a(-120, 56);
          }
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "boa.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static boolean a(int param0, int param1) {
        try {
          if (qga.field_b.field_e >= param0) {
            return true;
          }
          if (param1 != 30000) {
            boa.a(-32, -68);
          }
          if (null == ov.field_o) {
            return false;
          }
          int var2_int = ov.field_o.c(0);
          if (var2_int > 0) {
            if (var2_int > -qga.field_b.field_e + param0) {
              var2_int = param0 - qga.field_b.field_e;
            }
            ov.field_o.a(param1 ^ -30026, qga.field_b.field_e, var2_int, qga.field_b.field_h);
            cbb.field_q = wt.a(false);
            qga.field_b.field_e = qga.field_b.field_e + var2_int;
            if (param0 > qga.field_b.field_e) {
              return false;
            }
            qga.field_b.field_e = 0;
            return true;
          }
          try {
            if (false) throw (IOException) null;
            if (var2_int >= 0 &&
              30000L >= mw.e(0)) {
              return false;
            }
            ifb.l(param1 ^ -30026);
          } catch (IOException iOException) {
            ifb.l(-126);
          }
          return false;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final void a(tv param0, int param1) {
        boa var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = (boa) (param0);
          var4 = 0;
          if (param1 >= -19) {
            field_a = (no) null;
          }
          if (ikb.a(this.field_c, var3.field_c, false)) {
            var4 = 1;
            System.out.println("int[] description has changed. ");
          }
          if (var4 == 0) {
            return;
          }
          System.out.println("This instance of ShipBlueprint has changed");
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_10_0 = var3_ref;
          stackIn_10_1 = new StringBuilder().append("boa.F(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    public final boolean a(byte param0, tv param1) {
        boa var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        boolean stackIn_1_0 = false;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = (boa) (param1);
          var4 = -3 / ((param0 - 22) / 59);
          stackIn_1_0 = wpb.a(var3.field_c, this.field_c, (byte) 28);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_4_0 = var3_ref;
          stackIn_4_1 = new StringBuilder().append("boa.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(')').toString());
        }
    }

    public static void a(int param0) {
        if (param0 != 0) {
          field_b = (String) null;
          field_a = null;
          field_b = null;
          return;
        }
        field_a = null;
        field_b = null;
    }

    public final void b(faa param0, int param1) {
        RuntimeException var3 = null;
        faa var4 = null;
        int stackIn_2_0 = 0;
        int stackIn_3_1 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          stackIn_2_0 = 8;
          if (null == this.field_c) {
            stackIn_3_1 = 0;
          } else {
            stackIn_3_1 = this.field_c.length;
          }
          pgb.a(stackIn_2_0, stackIn_3_1, 55, param0, this.field_c);
          if (param1 <= -109) {
            return;
          }
          var4 = (faa) null;
          this.b((faa) null, -93);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("boa.B(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_b = "Save your ship design";
    }
}
