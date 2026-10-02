/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sl {
    String[] field_a;
    boolean field_d;
    boolean field_g;
    String field_e;
    static tf field_k;
    int field_j;
    static String field_i;
    static String field_h;
    static dm[] field_f;
    static String field_b;
    static rh field_l;
    static dm field_c;

    final static void a(java.awt.Canvas param0, int param1) {
        RuntimeException var2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          hj.a((byte) -85, (java.awt.Component) ((Object) param0));
          if (param1 == 57) {
            fk.a((java.awt.Component) ((Object) param0), param1 - 56);
            if (null != vc.field_f) {
              vc.field_f.a(124, (java.awt.Component) ((Object) param0));
              return;
            } else {
              return;
            }
          } else {
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_8_0 = (RuntimeException) (var2);

          stackIn_8_1 = new StringBuilder().append("sl.D(");

          if (param0 == null) {
            stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
            stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
            stackIn_9_2 = "null";
          } else {
            stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
            stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
            stackIn_9_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    final static String a(CharSequence param0, int param1) {
        int var2_int = 0;
        char[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        java.awt.Canvas var6 = null;
        char[] var7 = null;
        char[] var8 = null;
        String stackIn_20_0 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          var2_int = param0.length();
          if (20 < var2_int) {
            var2_int = 20;
          }
          var8 = new char[var2_int];
          var7 = var8;
          var3 = var7;
          var4 = 0;
          if (param1 != 48) {
            var6 = (java.awt.Canvas) null;
            sl.a((java.awt.Canvas) null, 58);
          }
          L2: while (var2_int > var4) {
            L3: {
              var5 = param0.charAt(var4);
              if (var5 >= 65) {
                if (var5 <= 90) {
                  var3[var4] = (char)(-65 + (var5 + 97));
                  break L3;
                }
              }
              L5: {
                if (var5 >= 97) {
                  if (var5 <= 122) {
                    break L5;
                  }
                }
                if (var5 >= 48) {
                  if (var5 <= 57) {
                    break L5;
                  }
                }
                var3[var4] = (char)95;
                break L3;
              }
              var3[var4] = (char)var5;
            }
            var4++;
          }
          stackIn_20_0 = new String(var8);
          return stackIn_20_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_23_0 = (RuntimeException) (var2);

          stackIn_23_1 = new StringBuilder().append("sl.A(");

          if (param0 == null) {
            stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
            stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
            stackIn_24_2 = "null";
          } else {
            stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
            stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
            stackIn_24_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_24_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_i = null;
        field_c = null;
        field_l = null;
        field_k = null;
        int var1 = -39 % ((48 - param0) / 43);
        field_b = null;
        field_h = null;
        field_f = null;
    }

    sl(boolean param0) {
        this.field_g = param0 ? true : false;
    }

    final static int a(boolean param0, wf param1, boolean param2) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2) {
            field_l = (rh) null;
          }
          stackIn_3_0 = param1.a(param0, -17978);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = (RuntimeException) (var3);

          stackIn_6_1 = new StringBuilder().append("sl.B(").append(param0).append(',');

          if (param1 == null) {
            stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
            stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
            stackIn_7_2 = "null";
          } else {
            stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
            stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
            stackIn_7_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',').append(param2).append(')').toString());
        }
    }

    static {
        field_k = new tf();
        field_i = "Please enter your age in years";
        field_h = "Orb points: <%0>";
        field_b = "Email: ";
    }
}
