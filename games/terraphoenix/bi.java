/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bi {
    static fa field_b;
    static String field_c;
    static String field_a;
    static fa field_d;

    final static oa a(int param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String var3 = null;
        String var4 = null;
        oa var5 = null;
        java.awt.Component var6 = null;
        oa stackIn_4_0 = null;
        oa stackIn_8_0 = null;
        oa stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != null &&
            param1.length() != 0) {
            var2_int = param1.indexOf('@');
            if (-1 == var2_int) {
              stackIn_8_0 = b.field_f;
              return stackIn_8_0;
            }
            if (param0 != -29456) {
              var6 = (java.awt.Component) null;
              bi.a(-98, -86, 70, (java.awt.Component) null);
            }
            var3 = param1.substring(0, var2_int);
            var4 = param1.substring(1 + var2_int);
            var5 = jh.a((byte) 42, var3);
            if (var5 == null) {
              return ma.a(var4, 46);
            }
            stackIn_14_0 = var5;
            return stackIn_14_0;
          }
          stackIn_4_0 = rf.field_w;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_17_0 = var2;
          stackIn_17_1 = new StringBuilder().append("bi.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    final static void a(int param0, String param1, String[] param2, int param3) {
        RuntimeException var4 = null;
        int var5 = 0;
        java.awt.Component var6 = null;
        int stackIn_6_0 = 0;
        boolean stackIn_7_1 = false;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = Terraphoenix.field_V;
        try {
          if (param3 != -14) {
            var6 = (java.awt.Component) null;
            bi.a(-13, 13, 17, (java.awt.Component) null);
          }
          qe.field_f = k.field_b;
          if (param0 != 255) {
            if (param0 < 100) {
              wl.field_Q = aj.a(param0, (byte) 113, param1);
              return;
            }
            if (param0 > 105) {
              wl.field_Q = aj.a(param0, (byte) 113, param1);
              return;
            }
            wl.field_Q = ib.a(true, param2);
            return;
          }
          stackIn_6_0 = param3 ^ -10;
          stackIn_7_1 = !(wf.field_q >= 13);
          wl.field_Q = ia.a(stackIn_6_0, stackIn_7_1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_16_0 = var4;
          stackIn_16_1 = new StringBuilder().append("bi.C(").append(param0).append(',');
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
          throw qk.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param3).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_b = null;
        if (param0 <= -1) {
          field_d = null;
          field_c = null;
          field_a = null;
          return;
        }
        field_d = (fa) null;
        field_d = null;
        field_c = null;
        field_a = null;
    }

    final static te a(int param0, int param1, int param2, java.awt.Component param3) {
        try {
          Class var4 = null;
          Throwable var4_ref = null;
          RuntimeException var4_ref2 = null;
          te var5 = null;
          of var5_ref = null;
          te stackIn_2_0 = null;
          te stackIn_4_0 = null;
          of stackIn_6_0 = null;
          RuntimeException stackIn_9_0 = null;
          StringBuilder stackIn_9_1 = null;
          String stackIn_10_2 = null;
          Throwable decompiledCaughtException = null;
          try {
            try {
              var4 = Class.forName("ri");
              if (param1 >= -70) {
                stackIn_2_0 = (te) null;
                return stackIn_2_0;
              }
              var5 = (te) (var4.newInstance());
              var5.a(param0, param2, (byte) -36, param3);
              stackIn_4_0 = var5;
              return stackIn_4_0;
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var4_ref = decompiledCaughtException;
              var5_ref = new of();
              ((te) ((Object) var5_ref)).a(param0, param2, (byte) -36, param3);
              stackIn_6_0 = var5_ref;
              return (te) ((Object) stackIn_6_0);
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var4_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_9_0 = var4_ref2;
            stackIn_9_1 = new StringBuilder().append("bi.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            if (param3 == null) {
              stackIn_10_2 = "null";
            } else {
              stackIn_10_2 = "{...}";
            }
            throw qk.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_c = "Invalid Login or Password<br><br>For accounts created after the 24th of November 2010, please use your email address to log in.<br><br>Otherwise please log in with your username.";
        field_a = "Difficulty: Hard";
    }
}
