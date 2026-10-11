/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ij {
    static bk field_h;
    static String[] field_a;
    static String field_d;
    static boolean field_g;
    static nc field_i;
    static int field_e;
    static int[] field_c;
    static String field_b;
    static vg field_f;

    final static String a(byte param0) {
        if (jc.field_P == hh.field_g) {
          return ji.field_b;
        }
        if (hh.field_g == ei.field_d) {
          return dj.field_e;
        }
        if (!wh.field_a.a(640)) {
          return dj.field_e;
        }
        if (param0 > 109) {
          return ng.field_y;
        }
        java.awt.Component var2 = (java.awt.Component) null;
        ij.a(-89, (java.awt.Component) null, 47, 123);
        return ng.field_y;
    }

    final static kh a(int param0, java.awt.Component param1, int param2, int param3) {
        try {
          Class var4 = null;
          Throwable var4_ref = null;
          RuntimeException var4_ref2 = null;
          kh var5 = null;
          jf var5_ref = null;
          kh stackIn_2_0 = null;
          kh stackIn_4_0 = null;
          jf stackIn_6_0 = null;
          RuntimeException stackIn_9_0 = null;
          StringBuilder stackIn_9_1 = null;
          String stackIn_10_2 = null;
          Throwable decompiledCaughtException = null;
          try {
            try {
              var4 = Class.forName("el");
              if (param0 > -49) {
                stackIn_2_0 = (kh) null;
                return stackIn_2_0;
              }
              var5 = (kh) (var4.newInstance());
              var5.a(param1, param2, (byte) 68, param3);
              stackIn_4_0 = var5;
              return stackIn_4_0;
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var4_ref = decompiledCaughtException;
              var5_ref = new jf();
              ((kh) ((Object) var5_ref)).a(param1, param2, (byte) 68, param3);
              stackIn_6_0 = var5_ref;
              return (kh) ((Object) stackIn_6_0);
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var4_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_9_0 = var4_ref2;
            stackIn_9_1 = new StringBuilder().append("ij.B(").append(param0).append(',');
            if (param1 == null) {
              stackIn_10_2 = "null";
            } else {
              stackIn_10_2 = "{...}";
            }
            throw ma.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(',').append(param3).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(int param0) {
        field_c = null;
        field_i = null;
        if (param0 == 3) {
          field_a = null;
          field_f = null;
          field_h = null;
          field_b = null;
          field_d = null;
          return;
        }
    }

    final static void a(kc param0, byte param1) {
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int var9 = Main.field_T;
        if ((3 & (param0.field_n | (param0.field_q | (param0.field_p | param0.field_o)))) == 0) {
          return;
        }
        int var2_int = (3 & param0.field_q) + param0.field_p;
        int var3 = param0.field_o + (3 & param0.field_n);
        var2_int = 4 - (3 & var2_int) + var2_int;
        if (param1 < 113) {
          return;
        }
        try {
          var3 = var3 - (3 & var3) + 4;
          var4 = new int[var2_int * var3];
          var5 = 0;
          var6 = (3 & param0.field_q) + (param0.field_n & 3) * var2_int;
          for (var7 = 0; param0.field_o > var7; var7++) {
            for (var8 = 0; param0.field_p > var8; var8++) {
              incrementValue$0 = var6;
              var6++;
              incrementValue$1 = var5;
              var5++;
              var4[incrementValue$0] = param0.field_r[incrementValue$1];
            }
            var6 = var6 + (-param0.field_p + var2_int);
          }
          param0.field_n = param0.field_n & -4;
          param0.field_p = var2_int;
          param0.field_r = var4;
          param0.field_o = var3;
          param0.field_q = param0.field_q & -4;
        } catch (RuntimeException runtimeException) {
          throw ma.a((Throwable) ((Object) runtimeException), "ij.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        field_h = new bk();
        field_a = new String[16];
        field_d = "Friends can be added in multiplayer<nbsp>games";
        field_e = 0;
        field_g = false;
        field_b = "Fullscreen mode was cancelled after a delay of 10 seconds. If you were unable to accept fullscreen mode during this time, there may be a problem with your configuration. You could try restarting your browser and trying again.";
        field_i = new nc();
    }
}
