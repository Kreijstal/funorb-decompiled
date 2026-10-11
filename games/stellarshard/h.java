/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class h {
    static wb field_a;
    static int field_d;
    static int field_c;
    static int field_b;

    final static String a(String param0, int param1, String[] param2) {
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        int stackIn_6_0 = 0;
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
        String var7_ref_String = null;
        int var7 = 0;
        int var8 = 0;
        String var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var5Lifetime1;
        int var8Lifetime1;
        var11 = stellarshard.field_B;
        try {
          var3_int = param0.length();
          var4 = var3_int;
          var5 = 0;
          while (true) {
            var6_int = param0.indexOf("<%", var5);
            if (var6_int >= 0) {
              stackIn_6_0 = var6_int + 2;
              for (var5 = stackIn_6_0; var3_int > var5; var5++) {
                if (bh.a(param1 - 1, param0.charAt(var5))) {
                  continue;
                }
                break;
              }
              var7_ref_String = param0.substring(2 + var6_int, var5);
              if (!rg.a((byte) 19, (CharSequence) ((Object) var7_ref_String))) {
                continue;
              }
              if (var5 >= var3_int) {
                continue;
              }
              if (param0.charAt(var5) != 62) {
                continue;
              }
              var5++;
              var8 = pf.a((CharSequence) ((Object) var7_ref_String), (byte) 125);
              var4 = var4 + (param2[var8].length() - (var5 - var6_int));
              continue;
            }
            break;
          }
          var6 = new StringBuilder(var4);
          var7 = 0;
          var5Lifetime1 = param1;
          while (true) {
            var8Lifetime1 = param0.indexOf("<%", var5Lifetime1);
            if (var8Lifetime1 < 0) {
              discarded$0 = var6.append(param0.substring(var7));
              stackIn_27_0 = var6.toString();
              return stackIn_27_0;
            }
            for (var5Lifetime1 = 2 + var8Lifetime1; var5Lifetime1 < var3_int; var5Lifetime1++) {
              if (bh.a(-1, param0.charAt(var5Lifetime1))) {
                continue;
              }
              break;
            }
            var9 = param0.substring(2 + var8Lifetime1, var5Lifetime1);
            if (!rg.a((byte) 19, (CharSequence) ((Object) var9))) {
              continue;
            }
            if (var5Lifetime1 >= var3_int) {
              continue;
            }
            if (param0.charAt(var5Lifetime1) != 62) {
              continue;
            }
            var5Lifetime1++;
            var10 = pf.a((CharSequence) ((Object) var9), (byte) 125);
            discarded$1 = var6.append(param0.substring(var7, var8Lifetime1));
            var7 = var5Lifetime1;
            discarded$2 = var6.append(param2[var10]);
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_30_0 = var3;
          stackIn_30_1 = new StringBuilder().append("h.A(");
          if (param0 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          stackIn_33_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_30_0), ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(')').toString());
        }
    }

    final static boolean a(ka param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_int = param0.f(param1 - 31180);
          stackIn_3_0 = (var2_int == 1) ? 1 : 0;
          var3 = stackIn_3_0;
          if (param1 != 31184) {
            field_d = 3;
          }
          stackIn_6_0 = var3;
          return stackIn_6_0 != 0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_9_0 = var2;
          stackIn_9_1 = new StringBuilder().append("h.D(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
        }
    }

    final static sk a(String param0, byte param1, boolean param2, String param3) {
        long var4_long = 0L;
        RuntimeException var4 = null;
        Object var6 = null;
        ka var7 = null;
        CharSequence var8 = null;
        sk stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_long = 0L;
          if (param1 > -95) {
            var7 = (ka) null;
            h.a((ka) null, 24);
          }
          var6 = null;
          if (param3.indexOf('@') != -1) {
            var6 = param3;
          } else {
            var8 = (CharSequence) ((Object) param3);
            var4_long = nd.a(var8, (byte) -35);
          }
          stackIn_6_0 = wf.a(var4_long, (String) (var6), -79, param0, param2);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_9_0 = var4;
          stackIn_9_1 = new StringBuilder().append("h.B(");
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
          throw ma.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    public static void a(byte param0) {
        field_a = null;
        if (param0 < 20) {
          field_c = -122;
        }
    }

    final static void a(int param0, int param1) {
        gg var2 = null;
        int var3 = 0;
        String var4 = null;
        le var5 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var3 = stellarshard.field_B;
        try {
          var5 = (le) (fg.field_G.b(-126));
          while (var5 != null) {
            nh.a(var5, (byte) -30, param1);
            var5 = (le) (fg.field_G.b((byte) -32));
          }
          var2 = gg.field_b.b(-109);
          while (var2 != null) {
            ff.a(1, param1);
            var2 = gg.field_b.b((byte) 103);
          }
          if (param0 > -25) {
            var4 = (String) null;
            h.a((String) null, (byte) 67, false, (String) null);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw ma.a((Throwable) ((Object) var2_ref), "h.C(" + param0 + ',' + param1 + ')');
        }
    }

    static {
        field_a = new wb();
        field_c = -1;
        field_b = 4;
    }
}
