/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gg {
    static String field_b;
    private le[] field_a;

    final static String a(String[] args, String param1, boolean param2) {
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
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
        byte[] var12 = null;
        int var5Lifetime1;
        int var8Lifetime1;
        var11 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          var3_int = param1.length();
          var4 = var3_int;
          var5 = 0;
          while (true) {
            var6_int = param1.indexOf("<%", var5);
            if (var6_int >= 0) {
              for (var5 = 2 + var6_int; var5 < var3_int; var5++) {
                if (re.a(-49, param1.charAt(var5))) {
                  continue;
                }
                break;
              }
              var7_ref_String = param1.substring(var6_int + 2, var5);
              if (!ra.a((CharSequence) ((Object) var7_ref_String), (byte) 84)) {
                continue;
              }
              if (var3_int <= var5) {
                continue;
              }
              if (62 != param1.charAt(var5)) {
                continue;
              }
              var5++;
              var8 = vi.a(61, (CharSequence) ((Object) var7_ref_String));
              var4 = var4 + (args[var8].length() + var6_int - var5);
              continue;
            }
            break;
          }
          var6 = new StringBuilder(var4);
          var7 = 0;
          var5Lifetime1 = 0;
          while (true) {
            var8Lifetime1 = param1.indexOf("<%", var5Lifetime1);
            if (0 > var8Lifetime1) {
              discarded$0 = var6.append(param1.substring(var7));
              if (!param2) {
                var12 = (byte[]) null;
                gg.a((int[]) null, 25, (byte[]) null, 86, -42);
              }
              stackIn_27_0 = var6.toString();
              return stackIn_27_0;
            }
            for (var5Lifetime1 = 2 + var8Lifetime1; var3_int > var5Lifetime1; var5Lifetime1++) {
              if (re.a(-49, param1.charAt(var5Lifetime1))) {
                continue;
              }
              break;
            }
            var9 = param1.substring(var8Lifetime1 + 2, var5Lifetime1);
            if (!ra.a((CharSequence) ((Object) var9), (byte) -128)) {
              continue;
            }
            if (var5Lifetime1 >= var3_int) {
              continue;
            }
            if (param1.charAt(var5Lifetime1) != 62) {
              continue;
            }
            var5Lifetime1++;
            var10 = vi.a(43, (CharSequence) ((Object) var9));
            discarded$1 = var6.append(param1.substring(var7, var8Lifetime1));
            discarded$2 = var6.append(args[var10]);
            var7 = var5Lifetime1;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_30_0 = var3;
          stackIn_30_1 = new StringBuilder().append("gg.F(");
          if (args == null) {
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
          throw la.a((Throwable) ((Object) stackIn_30_0), ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(',').append(param2).append(')').toString());
        }
    }

    final static void a(int[] param0, int param1, byte[] param2, int param3, int param4) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        byte dupTemp$2 = 0;
        int dupTemp$3 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        String var8 = null;
        var7 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          if (param4 <= 71) {
            var8 = (String) null;
            gg.a((String[]) null, (String) null, false);
          }
          var5_int = 0;
          while (true) {
            if (var5_int >= hb.field_l.length) {
              return;
            }
            param3 = hb.field_l[var5_int];
            var6 = var5_int << 4;
            while (true) {
              incrementValue$0 = param3;
              param3--;
              if (incrementValue$0 == 0) {
                var5_int++;
                break;
              }
              incrementValue$1 = var6;
              var6++;
              param1 = dj.field_c[incrementValue$1];
              dupTemp$2 = param2[param1];
              dupTemp$3 = param0[dupTemp$2];
              param0[dupTemp$2] = dupTemp$3 + 1;
              dj.field_c[dupTemp$3] = param1;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_12_0 = var5;
          stackIn_12_1 = new StringBuilder().append("gg.B(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    public static void a(int param0) {
        if (param0 < 5) {
          field_b = (String) null;
        }
        field_b = null;
    }

    final void a(int param0, int param1, boolean param2, int param3, int param4) {
        lb.a(param1, param0, (byte) -123, this.field_a, param3, param4);
        if (param2) {
          this.field_a = (le[]) null;
        }
    }

    final static int c(int param0) {
        if (param0 != 0) {
          field_b = (String) null;
        }
        return (int)(1000000000L / ed.field_d);
    }

    final static dk b(int param0) {
        if (param0 != -11451) {
          return (dk) null;
        }
        if (null == ok.field_f) {
          ok.field_f = new dk();
          ok.field_f.a(t.field_z, false);
          ok.field_f.field_m = pf.field_c;
          ok.field_f.field_p = 6;
          ok.field_f.field_f = 4;
          ok.field_f.field_b = 14;
          ok.field_f.field_r = 7697781;
          ok.field_f.field_k = 0;
          ok.field_f.field_n = 5;
          ok.field_f.field_s = 2763306;
        }
        return ok.field_f;
    }

    gg(le[] param0) {
        try {
          this.field_a = param0;
        } catch (RuntimeException runtimeException) {
          throw la.a((Throwable) ((Object) runtimeException), "gg.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_b = "Log in / Create account";
    }
}
