/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class a {
    private String field_d;
    static jb field_g;
    static java.math.BigInteger field_b;
    static String field_c;
    static byte[][] field_e;
    static String[] field_a;
    private boolean field_h;
    static String field_f;
    static int field_i;

    final static he a(he param0, int[] param1, byte param2) {
        he var3 = null;
        RuntimeException var3_ref = null;
        String[] var4 = null;
        he stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = new he(0, 0, 0);
          var3.field_m = param0.field_m;
          var3.field_c = param0.field_c;
          var3.field_f = param0.field_f;
          var3.field_d = param0.field_d;
          if (param2 != -122) {
            var4 = (String[]) null;
            a.a(-35, (String) null, (String[]) null);
          }
          var3.field_l = param1;
          var3.field_a = param0.field_a;
          var3.field_k = param0.field_k;
          var3.field_h = param0.field_h;
          stackIn_3_0 = var3;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_6_0 = var3_ref;
          stackIn_6_1 = new StringBuilder().append("a.C(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(')').toString());
        }
    }

    final String c(int param0) {
        int var2 = 73 % ((29 - param0) / 37);
        return this.field_d;
    }

    final boolean a(byte param0) {
        if (param0 > -107) {
          return false;
        }
        return this.field_h;
    }

    final static void a(int param0, int param1, byte param2) {
        ji.field_f = param1;
        sa.field_f = param0;
        int var3 = -90 % ((param2 - 7) / 57);
    }

    public static void b(int param0) {
        if (param0 != 2) {
          return;
        }
        field_g = null;
        field_b = null;
        field_f = null;
        field_a = null;
        field_c = null;
        field_e = (byte[][]) null;
    }

    a(String param0) {
        this(param0, false);
    }

    final static String a(int param0, String param1, String[] param2) {
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        String stackIn_26_0 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
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
        var11 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          var3_int = param1.length();
          var4 = var3_int;
          if (param0 != 5044) {
            a.a((byte) -22, false);
          }
          var5 = 0;
          while (true) {
            var6_int = param1.indexOf("<%", var5);
            if (0 <= var6_int) {
              for (var5 = 2 + var6_int; var3_int > var5; var5++) {
                if (lb.a(param1.charAt(var5), true)) {
                  continue;
                }
                break;
              }
              var7_ref_String = param1.substring(var6_int + 2, var5);
              if (!jf.a((CharSequence) ((Object) var7_ref_String), 7552)) {
                continue;
              }
              if (var5 >= var3_int) {
                continue;
              }
              if (62 != param1.charAt(var5)) {
                continue;
              }
              var5++;
              var8 = hh.a(10, (CharSequence) ((Object) var7_ref_String));
              var4 = var4 + (param2[var8].length() + (var6_int - var5));
              continue;
            }
            break;
          }
          var6 = new StringBuilder(var4);
          var5Lifetime1 = 0;
          var7 = 0;
          while (true) {
            var8Lifetime1 = param1.indexOf("<%", var5Lifetime1);
            if (var8Lifetime1 < 0) {
              discarded$0 = var6.append(param1.substring(var7));
              stackIn_26_0 = var6.toString();
              return stackIn_26_0;
            }
            for (var5Lifetime1 = 2 + var8Lifetime1; var5Lifetime1 < var3_int; var5Lifetime1++) {
              if (lb.a(param1.charAt(var5Lifetime1), true)) {
                continue;
              }
              break;
            }
            var9 = param1.substring(2 + var8Lifetime1, var5Lifetime1);
            if (!jf.a((CharSequence) ((Object) var9), 7552)) {
              continue;
            }
            if (var3_int <= var5Lifetime1) {
              continue;
            }
            if (62 != param1.charAt(var5Lifetime1)) {
              continue;
            }
            var5Lifetime1++;
            var10 = hh.a(param0 - 5034, (CharSequence) ((Object) var9));
            discarded$1 = var6.append(param1.substring(var7, var8Lifetime1));
            discarded$2 = var6.append(param2[var10]);
            var7 = var5Lifetime1;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_29_0 = var3;
          stackIn_29_1 = new StringBuilder().append("a.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          stackIn_32_1 = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',');
          if (param2 == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_29_0), ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(')').toString());
        }
    }

    final static boolean a(int param0) {
        boolean stackIn_9_0 = false;
        if (param0 != -27365) {
          field_f = (String) null;
        }
        stackIn_9_0 = ((aj.field_e &&
          vi.field_c == null) ||
          oh.a(param0 + 27365));
        return stackIn_9_0;
    }

    final static void a(byte param0, boolean param1) {
        int var2 = -114 / ((37 - param0) / 59);
        ng.field_c.a(0, 0, 0);
    }

    a(String param0, boolean param1) {
        boolean stackIn_4_1 = false;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          this.field_d = param0;
          stackIn_4_1 = (param1);
          this.field_h = stackIn_4_1;
          if (this.field_d == null) {
            this.field_d = "";
          }
          if (0 == this.field_d.length()) {
            this.field_h = false;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_11_0 = var3;
          stackIn_11_1 = new StringBuilder().append("a.<init>(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_a = new String[]{"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        field_b = new java.math.BigInteger("6757747274818513864204534133465045479284128469717186816691454417744823753827902036844748836683348383638677747113757906301249837209713747402067689777172847");
        field_f = "Get ready!";
    }
}
