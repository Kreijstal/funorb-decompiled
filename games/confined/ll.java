/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ll {
    static double field_b;
    static String field_c;
    static int field_d;
    static int field_a;

    final static va a(byte param0, String param1) {
        int var5 = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
        String[] var3 = null;
        String[] var4 = null;
        String var6 = null;
        va var7 = null;
        int var8 = 0;
        java.awt.Canvas var9 = null;
        va stackIn_5_0 = null;
        va stackIn_9_0 = null;
        va stackIn_12_0 = null;
        va stackIn_18_0 = null;
        va stackIn_21_0 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        var8 = Confined.field_J ? 1 : 0;
        try {
          if (param0 != 57) {
            var9 = (java.awt.Canvas) null;
            ll.a(-57, -32, (java.awt.Canvas) null, 90);
          }
          var2_int = param1.length();
          if (var2_int == 0) {
            stackIn_5_0 = vf.field_q;
            return stackIn_5_0;
          }
          if (var2_int > 255) {
            stackIn_9_0 = m.field_g;
            return stackIn_9_0;
          }
          var3 = ij.a(0, '.', param1);
          if (var3.length < 2) {
            stackIn_12_0 = vf.field_q;
            return stackIn_12_0;
          }
          var4 = var3;
          for (var5 = 0; var4.length > var5; var5++) {
            var6 = var4[var5];
            var7 = ik.a((byte) -126, var6);
            if (var7 != null) {
              stackIn_18_0 = var7;
              return stackIn_18_0;
            }
          }
          stackIn_21_0 = ck.a(var3[var3.length - 1], (byte) 127);
          return stackIn_21_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_24_0 = var2;
          stackIn_24_1 = new StringBuilder().append("ll.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(')').toString());
        }
    }

    final static void a(int param0, int param1, java.awt.Canvas param2, int param3) {
        java.awt.Graphics var4 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        Throwable decompiledCaughtException = null;
        Exception var4_ref = null;
        RuntimeException var4_ref2 = null;
        try {
          if (param3 >= -35) {
            return;
          }
          try {
            var4 = param2.getGraphics();
            pi.field_S.a((byte) 91, var4, param1, param0);
            var4.dispose();
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var4_ref = (Exception) (Object) decompiledCaughtException;
            param2.repaint();
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var4_ref2 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_8_0 = var4_ref2;
          stackIn_8_1 = new StringBuilder().append("ll.D(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param3).append(')').toString());
        }
    }

    final static boolean a(int param0, int param1) {
        if ((param1 << param0 & i.field_o) != 0) {
          return false;
        }
        pn.field_a.b(hl.field_b, 320, 100, 9805732, -1);
        tf.a((byte) 59, param0, 105, i.field_o);
        return true;
    }

    public static void a(boolean param0) {
        if (param0) {
          ll.a(false);
        }
        field_c = null;
    }

    final static va a(String param0, boolean param1) {
        va stackIn_6_0 = null;
        va stackIn_10_0 = null;
        va stackIn_15_0 = null;
        int stackIn_24_0 = 0;
        va stackIn_29_0 = null;
        va stackIn_43_0 = null;
        va stackIn_47_0 = null;
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        String stackIn_54_2 = null;
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
        var6 = Confined.field_J ? 1 : 0;
        try {
          if (!param1) {
            field_c = (String) null;
          }
          var2_int = param0.length();
          if (0 == var2_int) {
            stackIn_6_0 = vf.field_q;
            return stackIn_6_0;
          }
          if (var2_int > 64) {
            stackIn_10_0 = m.field_g;
            return stackIn_10_0;
          }
          if (param0.charAt(0) == 34) {
            if (param0.charAt(-1 + var2_int) != 34) {
              stackIn_15_0 = ql.field_k;
              return stackIn_15_0;
            }
            var3 = 0;
            for (var4 = 1; -1 + var2_int > var4; var4++) {
              var5 = param0.charAt(var4);
              if (var5 == 92) {
                stackIn_24_0 = (var3 != 0) ? 0 : 1;
                var3 = stackIn_24_0;
              } else {
                if (var5 == 34 &&
                  var3 == 0) {
                  stackIn_29_0 = ql.field_k;
                  return stackIn_29_0;
                }
                var3 = 0;
              }
            }
            return null;
          }
          var3Lifetime1 = 0;
          for (var4Lifetime1 = 0; var4Lifetime1 < var2_int; var4Lifetime1++) {
            boolean decompiledFrameRemainder0 = true;
            var5Lifetime1 = param0.charAt(var4Lifetime1);
            if (46 == var5Lifetime1) {
              if (var4Lifetime1 != 0 &&
                -1 + var2_int != var4Lifetime1 &&
                var3Lifetime1 == 0) {
                var3Lifetime1 = 1;
                decompiledFrameRemainder0 = false;
              }
              else {
                stackIn_43_0 = ql.field_k;
                return stackIn_43_0;
              }
            }
            if (decompiledFrameRemainder0) {
              if (ji.field_b.indexOf(var5Lifetime1) == -1) {
                stackIn_47_0 = ql.field_k;
                return stackIn_47_0;
              }
              var3Lifetime1 = 0;
            }
          }
          return null;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_53_0 = var2;
          stackIn_53_1 = new StringBuilder().append("ll.C(");
          if (param0 == null) {
            stackIn_54_2 = "null";
          } else {
            stackIn_54_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_53_0), ((StringBuilder) (Object) stackIn_53_1).append(stackIn_54_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_c = "Level";
    }
}
