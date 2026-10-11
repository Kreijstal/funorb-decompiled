/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class db extends IOException {
    static char[] field_g;
    static w field_c;
    static String[] field_e;
    static int[] field_b;
    static boolean field_d;
    static ck field_f;
    static int field_a;

    public static void a(byte param0) {
        field_b = null;
        field_c = null;
        field_g = null;
        field_f = null;
        if (param0 > 40) {
          field_e = null;
          return;
        }
        String var2 = (String) null;
        db.a(-81, (String) null, (String) null, false);
        field_e = null;
    }

    final static void a(int param0, String param1, String param2, boolean param3) {
        try {
          tc.field_Qb = param2;
          if (param0 >= -125) {
            java.awt.Component var5 = (java.awt.Component) null;
            db.a((java.awt.Component) null, true);
          }
          hb.field_Ob = param1;
          wi.a(param3, -83, jc.field_a);
        } catch (RuntimeException runtimeException) {
          throw dh.a((Throwable) ((Object) runtimeException), "db.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final static void a(java.awt.Component param0, boolean param1) {
        try {
          param0.setFocusTraversalKeysEnabled(param1);
          param0.addKeyListener(f.field_r);
          param0.addFocusListener(f.field_r);
        } catch (RuntimeException runtimeException) {
          throw dh.a((Throwable) ((Object) runtimeException), "db.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static String b(byte param0) {
        if (oa.field_f == null) {
          return "";
        }
        if (param0 < 59) {
          return (String) null;
        }
        return oa.field_f;
    }

    final static void a(boolean param0) {
        vh.field_h = null;
        if (!param0) {
          db.a(true);
        }
    }

    final static String a(CharSequence[] param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_int = 81 / ((param1 - 44) / 62);
          stackIn_1_0 = hf.a(param0.length, 0, param0, (byte) 74);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_4_0 = var2;
          stackIn_4_1 = new StringBuilder().append("db.E(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param1).append(')').toString());
        }
    }

    db(String param0) {
        super(param0);
    }

    final static void a(int param0, Object param1, fd param2) {
        int var3_int = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        Throwable decompiledCaughtException = null;
        Exception var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        var4 = client.field_A ? 1 : 0;
        try {
          if (param2.field_w == null) {
            return;
          }
          for (var3_int = 0; var3_int < 50; var3_int++) {
            if (null != param2.field_w.peekEvent()) {
              ua.a(1L, -128);
              continue;
            }
            break;
          }
          try {
            if (param0 >= -33) {
              db.a((CharSequence[]) null, -126);
            }
            if (param1 == null) {
              return;
            }
            param2.field_w.postEvent((java.awt.AWTEvent) ((Object) new java.awt.event.ActionEvent(param1, 1001, "dummy")));
            return;
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3 = (Exception) (Object) decompiledCaughtException;
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var3_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_16_0 = var3_ref;
          stackIn_16_1 = new StringBuilder().append("db.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',');
          if (param2 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
        }
    }

    final static ck[] a(String param0, String param1, ji param2, boolean param3, String param4) {
        ck dupTemp$3 = null;
        ck dupTemp$4 = null;
        ck dupTemp$5 = null;
        ck[] var5 = null;
        RuntimeException var5_ref = null;
        ck[] stackIn_2_0 = null;
        ck[] stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5 = new ck[9];
          if (!param3) {
            stackIn_2_0 = (ck[]) null;
            return stackIn_2_0;
          }
          dupTemp$3 = id.a(param2, param4, "", 8192);
          var5[8] = dupTemp$3;
          var5[6] = dupTemp$3;
          var5[2] = dupTemp$3;
          var5[0] = dupTemp$3;
          dupTemp$4 = id.a(param2, param1, "", 8192);
          var5[7] = dupTemp$4;
          var5[1] = dupTemp$4;
          dupTemp$5 = id.a(param2, param0, "", 8192);
          var5[5] = dupTemp$5;
          var5[3] = dupTemp$5;
          stackIn_4_0 = var5;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_7_0 = var5_ref;
          stackIn_7_1 = new StringBuilder().append("db.D(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
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
          throw dh.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    static {
        field_g = new char[]{(char)95, (char)97, (char)98, (char)99, (char)100, (char)101, (char)102, (char)103, (char)104, (char)105, (char)106, (char)107, (char)108, (char)109, (char)110, (char)111, (char)112, (char)113, (char)114, (char)115, (char)116, (char)117, (char)118, (char)119, (char)120, (char)121, (char)122, (char)48, (char)49, (char)50, (char)51, (char)52, (char)53, (char)54, (char)55, (char)56, (char)57};
        field_e = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
    }
}
