/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class fc {
    static String field_a;
    static rc field_b;

    public static void a(int param0) {
        if (param0 != 10) {
          fc.a((byte) 69, -69L);
          field_b = null;
          field_a = null;
          return;
        }
        field_b = null;
        field_a = null;
    }

    final static ae a(String param0, int param1) {
        ae stackIn_4_0 = null;
        ae stackIn_7_0 = null;
        ae stackIn_12_0 = null;
        int stackIn_20_0 = 0;
        ae stackIn_24_0 = null;
        ae stackIn_38_0 = null;
        ae stackIn_43_0 = null;
        Object stackIn_52_0 = null;
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        String stackIn_56_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var3Lifetime1;
        int var4Lifetime1;
        int var5Lifetime1;
        var6 = wizardrun.field_H;
        try {
          var2_int = param0.length();
          if (var2_int == 0) {
            stackIn_4_0 = ok.field_f;
            return stackIn_4_0;
          }
          if (64 < var2_int) {
            stackIn_7_0 = kj.field_c;
            return stackIn_7_0;
          }
          if (param0.charAt(0) == 34) {
            if (34 != param0.charAt(var2_int - 1)) {
              stackIn_12_0 = tl.field_d;
              return stackIn_12_0;
            }
            var3 = 0;
            for (var4 = 1; -1 + var2_int > var4; var4++) {
              var5 = param0.charAt(var4);
              if (92 != var5) {
                if (var5 == 34 &&
                  var3 == 0) {
                  stackIn_24_0 = tl.field_d;
                  return stackIn_24_0;
                }
                var3 = 0;
              } else {
                stackIn_20_0 = (var3 != 0) ? 0 : 1;
                var3 = stackIn_20_0;
              }
            }
            return null;
          }
          var3Lifetime1 = 0;
          for (var4Lifetime1 = 0; var2_int > var4Lifetime1; var4Lifetime1++) {
            boolean decompiledFrameRemainder0 = true;
            var5Lifetime1 = param0.charAt(var4Lifetime1);
            if (46 == var5Lifetime1) {
              if (var4Lifetime1 != 0 &&
                var4Lifetime1 != -1 + var2_int &&
                var3Lifetime1 == 0) {
                var3Lifetime1 = 1;
                decompiledFrameRemainder0 = false;
              }
              else {
                stackIn_38_0 = tl.field_d;
                return stackIn_38_0;
              }
            }
            if (decompiledFrameRemainder0) {
              if (sc.field_i.indexOf(var5Lifetime1) == -1) {
                stackIn_43_0 = tl.field_d;
                return stackIn_43_0;
              }
              var3Lifetime1 = 0;
            }
          }
          if (param1 == -1) {
            return null;
          }
          field_a = (String) null;
          stackIn_52_0 = null;
          return (ae) (stackIn_52_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_55_0 = var2;
          stackIn_55_1 = new StringBuilder().append("fc.C(");
          if (param0 == null) {
            stackIn_56_2 = "null";
          } else {
            stackIn_56_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_55_0), ((StringBuilder) (Object) stackIn_55_1).append(stackIn_56_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(String param0, boolean param1, int param2) {
        ga.field_a = param1;
        cf.field_i = true;
        aa.field_lb = new mh(u.field_A, va.field_i, param0, wi.field_J, ga.field_a);
        if (param2 > -119) {
          return;
        }
        try {
          u.field_A.b((ub) (aa.field_lb), (byte) 55);
        } catch (RuntimeException runtimeException) {
          throw bd.a((Throwable) ((Object) runtimeException), "fc.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static String a(byte param0, long param1) {
        int var8 = 0;
        int var9 = 0;
        hl.field_c.setTime(new Date(param1));
        int var3 = hl.field_c.get(7);
        int var4 = hl.field_c.get(5);
        int var5 = hl.field_c.get(2);
        int var6 = hl.field_c.get(1);
        int var7 = hl.field_c.get(11);
        if (param0 <= -3) {
          var8 = hl.field_c.get(12);
          var9 = hl.field_c.get(13);
          return of.field_k[var3 - 1] + ", " + var4 / 10 + var4 % 10 + "-" + rj.field_f[var5] + "-" + var6 + " " + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + " GMT";
        }
        return (String) null;
    }

    final static void a(byte param0, int param1, java.awt.Canvas param2, int param3) {
        java.awt.Graphics var4 = null;
        Exception var4_ref = null;
        RuntimeException var4_ref2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        Throwable decompiledCaughtException = null;
        try {
          try {
            if (param0 != 80) {
              field_a = (String) null;
            }
            var4 = param2.getGraphics();
            hl.field_b.a(var4, -29402, param1, param3);
            var4.dispose();
            return;
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var4_ref = (Exception) (Object) decompiledCaughtException;
            param2.repaint();
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var4_ref2 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_8_0 = var4_ref2;
          stackIn_8_1 = new StringBuilder().append("fc.E(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param3).append(')').toString());
        }
    }

    static {
        field_a = "Invalid Login or Password<br><br>For accounts created after the 24th of November 2010, please use your email address to log in.<br><br>Otherwise please log in with your username.";
        field_b = new rc();
    }
}
