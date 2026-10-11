/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oc extends vm {
    static String field_o;
    private qn field_q;
    static un field_p;
    static String field_r;
    static int[] field_n;
    static jk field_l;
    static String field_m;

    public static void h(int param0) {
        field_r = null;
        field_p = null;
        field_n = null;
        field_o = null;
        field_l = null;
        field_m = null;
        if (param0 != 0) {
          String[] var2 = (String[]) null;
          oc.a((String) null, (String[]) null, (byte) 51);
          return;
        }
    }

    final static String a(String param0, String[] param1, byte param2) {
        StringBuilder discarded$2 = null;
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        String stackIn_27_0 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        StringBuilder var6 = null;
        int var7 = 0;
        String var7_ref_String = null;
        int var8 = 0;
        String var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var5Lifetime1;
        int var8Lifetime1;
        var11 = Chess.field_G;
        try {
          var3_int = param0.length();
          var4 = var3_int;
          var5 = 0;
          while (true) {
            var6_int = param0.indexOf("<%", var5);
            if (0 <= var6_int) {
              for (var5 = var6_int + 2; var3_int > var5; var5++) {
                if (di.a(-49, param0.charAt(var5))) {
                  continue;
                }
                break;
              }
              var7_ref_String = param0.substring(var6_int + 2, var5);
              if (!lg.a((byte) 72, (CharSequence) ((Object) var7_ref_String))) {
                continue;
              }
              if (var5 >= var3_int) {
                continue;
              }
              if (param0.charAt(var5) != 62) {
                continue;
              }
              var5++;
              var8 = fn.a((CharSequence) ((Object) var7_ref_String), 0);
              var4 = var4 + (var6_int - var5 + param1[var8].length());
              continue;
            }
            break;
          }
          var6 = new StringBuilder(var4);
          var7 = 0;
          var5Lifetime1 = 0;
          while (true) {
            var8Lifetime1 = param0.indexOf("<%", var5Lifetime1);
            if (var8Lifetime1 < 0) {
              discarded$2 = var6.append(param0.substring(var7));
              if (param2 >= -41) {
                field_o = (String) null;
              }
              stackIn_27_0 = var6.toString();
              return stackIn_27_0;
            }
            for (var5Lifetime1 = 2 + var8Lifetime1; var3_int > var5Lifetime1; var5Lifetime1++) {
              if (di.a(-49, param0.charAt(var5Lifetime1))) {
                continue;
              }
              break;
            }
            var9 = param0.substring(2 + var8Lifetime1, var5Lifetime1);
            if (!lg.a((byte) 74, (CharSequence) ((Object) var9))) {
              continue;
            }
            if (var3_int <= var5Lifetime1) {
              continue;
            }
            if (62 != param0.charAt(var5Lifetime1)) {
              continue;
            }
            var5Lifetime1++;
            var10 = fn.a((CharSequence) ((Object) var9), 0);
            discarded$0 = var6.append(param0.substring(var7, var8Lifetime1));
            var7 = var5Lifetime1;
            discarded$1 = var6.append(param1[var10]);
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_30_0 = var3;
          stackIn_30_1 = new StringBuilder().append("oc.C(");
          if (param0 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          stackIn_33_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',');
          if (param1 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_30_0), ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(',').append(param2).append(')').toString());
        }
    }

    final String a(String param0, int param1) {
        vb var3 = null;
        RuntimeException var3_ref = null;
        String stackIn_6_0 = null;
        String stackIn_8_0 = null;
        String stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_q instanceof ee) {
            var3 = ((ee) ((Object) this.field_q)).a(param1 + 9210);
            if (var3 != null) {
              if (var3.a(21314) == oa.field_a &&
                !param0.equals(this.field_q.field_v)) {
                stackIn_6_0 = gg.field_z;
                return stackIn_6_0;
              }
              stackIn_8_0 = var3.a(false);
              return stackIn_8_0;
            }
          }
          if (param1 != -9316) {
            field_r = (String) null;
          }
          if (param0.equals(this.field_q.field_v)) {
            return null;
          }
          stackIn_14_0 = gg.field_z;
          return stackIn_14_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_17_0 = var3_ref;
          stackIn_17_1 = new StringBuilder().append("oc.D(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param1).append(')').toString());
        }
    }

    final static boolean a(String param0, int param1, String param2) {
        String var3 = null;
        String[] var4 = null;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          param2 = qm.a('_', param2, "", (byte) -51);
          if (param1 >= -114) {
            var4 = (String[]) null;
            oc.a((String) null, (String[]) null, (byte) -72);
          }
          var3 = i.a(0, param2);
          stackIn_7_0 = (param0.indexOf(param2) != -1) || (param0.indexOf(var3) != -1);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_10_0 = var3_ref;
          stackIn_10_1 = new StringBuilder().append("oc.A(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final mk a(byte param0, String param1) {
        vb var3 = null;
        int var3_int = 0;
        RuntimeException var3_ref = null;
        mk stackIn_5_0 = null;
        mk stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_q instanceof ee) {
            var3 = ((ee) ((Object) this.field_q)).a(-89);
            if (var3 != null &&
              var3.a(21314) != oa.field_a) {
              stackIn_5_0 = qk.field_b;
              return stackIn_5_0;
            }
          }
          var3_int = 125 % ((param0 + 49) / 62);
          if (!param1.equals(this.field_q.field_v)) {
            stackIn_9_0 = qk.field_b;
          } else {
            stackIn_9_0 = oa.field_a;
          }
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_12_0 = var3_ref;
          stackIn_12_1 = new StringBuilder().append("oc.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    oc(qn param0, qn param1) {
        super(param0);
        try {
          this.field_q = param1;
        } catch (RuntimeException runtimeException) {
          throw fk.a((Throwable) ((Object) runtimeException), "oc.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_r = "Enter name of friend to add to list";
        field_m = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    }
}
