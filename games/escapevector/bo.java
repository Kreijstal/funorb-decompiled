/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class bo extends hc {
    static tb field_F;
    static int field_E;
    static String field_D;
    static int[] field_H;
    static byte[] field_G;

    final void a(int param0, int param1, int param2, int param3) {
        this.field_z = !this.field_z ? true : false;
        if (param0 == -19646) {
          super.a(param0 ^ 0, param1, param2, param3);
          return;
        }
        java.awt.Canvas var6 = (java.awt.Canvas) null;
        bo.a((java.awt.Canvas) null, (byte) 126);
        super.a(param0 ^ 0, param1, param2, param3);
    }

    private bo(String param0, db param1, wn param2) {
        super(param0, param1, param2);
        try {
          this.field_s = mb.field_g.field_k;
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "bo.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(byte param0) {
        field_H = null;
        field_F = null;
        field_D = null;
        if (param0 <= 17) {
          return;
        }
        field_G = null;
    }

    private bo(String param0, wn param1) {
        this(param0, mb.field_g.field_o, param1);
        try {
          this.field_s = mb.field_g.field_k;
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "bo.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static vj a(String param0, boolean param1, int param2, String param3) {
        long var4_long = 0L;
        RuntimeException var4 = null;
        Object var6 = null;
        CharSequence var7 = null;
        vj stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_long = 0L;
          if (param2 != 24564) {
            field_F = (tb) null;
          }
          var6 = null;
          if (param0.indexOf('@') == -1) {
            var7 = (CharSequence) ((Object) param0);
            var4_long = vn.a((byte) 88, var7);
          } else {
            var6 = param0;
          }
          stackIn_6_0 = ei.a(0, param1, var4_long, (String) (var6), param3);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_9_0 = var4;
          stackIn_9_1 = new StringBuilder().append("bo.C(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final static void a(java.awt.Canvas param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          sc.a((byte) -58, (java.awt.Component) ((Object) param0));
          var2_int = 120 / ((param1 - 54) / 57);
          od.a((java.awt.Component) ((Object) param0), (byte) 9);
          if (null == ji.field_b) {
            return;
          }
          ji.field_b.a(-5070, (java.awt.Component) ((Object) param0));
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_5_0 = var2;
          stackIn_5_1 = new StringBuilder().append("bo.D(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(',').append(param1).append(')').toString());
        }
    }

    bo(String param0, wn param1, boolean param2) {
        this(param0, param1);
        try {
          this.field_z = param2 ? true : false;
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "bo.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static boolean a(int param0, int param1) {
        try {
          int var2_int = 0;
          IOException var2 = null;
          Throwable decompiledCaughtException = null;
          if (param0 != 30000) {
            return false;
          }
          if (param1 <= om.field_g.field_m) {
            return true;
          }
          if (null == pg.field_c) {
            return false;
          }
          try {
            var2_int = pg.field_c.b(-124);
            if (var2_int <= 0) {
              if (0 > var2_int) {
                nm.a(16);
                return false;
              }
              if (un.e(param0 + 34655) <= 30000L) {
                return false;
              }
              nm.a(16);
              return false;
            }
            if (var2_int > param1 - om.field_g.field_m) {
              var2_int = param1 - om.field_g.field_m;
            }
            pg.field_c.a(om.field_g.field_m, var2_int, om.field_g.field_g, (byte) -49);
            sl.field_a = td.b(128);
            om.field_g.field_m = om.field_g.field_m + var2_int;
            if (param1 > om.field_g.field_m) {
              return false;
            }
            om.field_g.field_m = 0;
            return true;
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var2 = (IOException) (Object) decompiledCaughtException;
            nm.a(16);
            return false;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_E = 1;
        field_D = "From Level";
        field_G = new byte[520];
    }
}
