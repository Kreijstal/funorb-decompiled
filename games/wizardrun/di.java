/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class di {
    private gj field_b;
    private int field_f;
    private de field_d;
    static String field_a;
    private int field_c;
    static boolean[] field_g;
    static int field_e;

    final Object a(byte param0, long param1) {
        ag var6 = null;
        ig var7 = (ig) (this.field_b.a(false, param1));
        if (var7 == null) {
          return null;
        }
        Object var5 = var7.e(1);
        if (param0 < 60) {
          this.a((byte) 14, 32L);
        }
        if (var5 == null) {
          var7.a(false);
          var7.b(false);
          this.field_c = this.field_c + var7.field_p;
          return null;
        }
        if (var7.d(-9861)) {
          var6 = new ag(var5, var7.field_p);
          this.field_b.a(var7.field_e, var6, (byte) -106);
          this.field_d.a(var6, 10);
          ((ig) ((Object) var6)).field_o = 0L;
          var7.a(false);
          var7.b(false);
        } else {
          this.field_d.a(var7, 10);
          var7.field_o = 0L;
        }
        return var5;
    }

    public static void b(byte param0) {
        field_a = null;
        int var1 = 4 / ((param0 - 15) / 62);
        field_g = null;
    }

    final static void a(boolean param0, boolean param1, int param2) {
        String var4 = (String) null;
        ai.$cfr$intArgs$a$87b210a2f664(param1, 126, (String) null, param0);
        if (param2 <= 106) {
          di.a(-92L, -11);
        }
    }

    final void a(long param0, int param1, Object param2) {
        try {
          this.a((byte) -30, param1, param0, param2);
        } catch (RuntimeException runtimeException) {
          throw bd.a((Throwable) ((Object) runtimeException), "di.G(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static String a(String[] args, byte param1, String param2) {
        StringBuilder discarded$2 = null;
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        String stackIn_13_0 = null;
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
        var11 = wizardrun.field_H;
        try {
          var3_int = param2.length();
          var4 = var3_int;
          var5 = 0;
          while (true) {
            var6_int = param2.indexOf("<%", var5);
            if (0 <= var6_int) {
              for (var5 = 2 + var6_int; var3_int > var5; var5++) {
                if (vl.a(param2.charAt(var5), -5717)) {
                  continue;
                }
                break;
              }
              var7_ref_String = param2.substring(var6_int + 2, var5);
              if (!af.a((CharSequence) ((Object) var7_ref_String), (byte) 78)) {
                continue;
              }
              if (var3_int <= var5) {
                continue;
              }
              if (param2.charAt(var5) != 62) {
                continue;
              }
              var5++;
              var8 = ph.a(1124, (CharSequence) ((Object) var7_ref_String));
              var4 = var4 + (args[var8].length() - var5 + var6_int);
              continue;
            }
            break;
          }
          var6 = new StringBuilder(var4);
          if (param1 < 24) {
            stackIn_13_0 = (String) null;
            return stackIn_13_0;
          }
          var7 = 0;
          var5Lifetime1 = 0;
          while (true) {
            var8Lifetime1 = param2.indexOf("<%", var5Lifetime1);
            if (0 > var8Lifetime1) {
              discarded$2 = var6.append(param2.substring(var7));
              stackIn_27_0 = var6.toString();
              return stackIn_27_0;
            }
            for (var5Lifetime1 = var8Lifetime1 + 2; var5Lifetime1 < var3_int; var5Lifetime1++) {
              if (vl.a(param2.charAt(var5Lifetime1), -5717)) {
                continue;
              }
              break;
            }
            var9 = param2.substring(2 + var8Lifetime1, var5Lifetime1);
            if (!af.a((CharSequence) ((Object) var9), (byte) 78)) {
              continue;
            }
            if (var5Lifetime1 >= var3_int) {
              continue;
            }
            if (62 != param2.charAt(var5Lifetime1)) {
              continue;
            }
            var5Lifetime1++;
            var10 = ph.a(1124, (CharSequence) ((Object) var9));
            discarded$0 = var6.append(param2.substring(var7, var8Lifetime1));
            var7 = var5Lifetime1;
            discarded$1 = var6.append(args[var10]);
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_30_0 = var3;
          stackIn_30_1 = new StringBuilder().append("di.A(");
          if (args == null) {
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
          throw bd.a((Throwable) ((Object) stackIn_30_0), ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(')').toString());
        }
    }

    final static String a(long param0, int param1) {
        long var7 = 0L;
        int var9 = 0;
        int var10 = 0;
        StringBuilder discarded$0 = null;
        int var11 = wizardrun.field_H;
        if (param0 <= 0L) {
          return null;
        }
        if (param0 >= 6582952005840035281L) {
          return null;
        }
        if (param0 % 37L == 0L) {
          return null;
        }
        if (param1 < 32) {
          di.a(true, false, -92);
        }
        int var3 = 0;
        long var4 = param0;
        while (var4 != 0L) {
          var3++;
          var4 = var4 / 37L;
        }
        StringBuilder var6 = new StringBuilder(var3);
        while (param0 != 0L) {
          var7 = param0;
          param0 = param0 / 37L;
          var9 = jk.field_c[(int)(-(37L * param0) + var7)];
          if (var9 == 95) {
            var10 = -1 + var6.length();
            var6.setCharAt(var10, Character.toUpperCase(var6.charAt(var10)));
            var9 = 160;
          }
          discarded$0 = var6.append((char) var9);
        }
        var6.reverse();
        var6.setCharAt(0, Character.toUpperCase(var6.charAt(0)));
        return var6.toString();
    }

    final static void a(int param0) {
        int fieldTemp$0 = 0;
        RuntimeException decompiledCaughtException = null;
        mg var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        var3 = wizardrun.field_H;
        try {
          var1 = n.field_b;
          if (param0 != 8) {
            field_g = (boolean[]) null;
          }
          while (ac.a((byte) 125)) {
            var1.c((byte) 49, 8);
            fieldTemp$0 = var1.field_m + 1;
            var1.field_m = var1.field_m + 1;
            var2 = fieldTemp$0;
            kb.a(39, var1);
            n.field_b.a(-var2 + var1.field_m, -57);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw bd.a((Throwable) ((Object) var1_ref), "di.E(" + param0 + ')');
        }
    }

    private final void b(long param0, int param1) {
        if (param1 <= 75) {
          this.b(26L, 18);
        }
        ig var4 = (ig) (this.field_b.a(false, param0));
        this.a(var4, -111);
    }

    private final void a(ig param0, int param1) {
        String var4 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (param0 != null) {
            param0.a(false);
            param0.b(false);
            this.field_c = this.field_c + param0.field_p;
          }
          if (param1 >= -16) {
            var4 = (String) null;
            di.a((String[]) null, (byte) -84, (String) null);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("di.H(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    private di() throws Throwable {
        throw new Error();
    }

    final static void a(of param0, int param1, byte param2) {
        mg var3 = null;
        if (param2 > -71) {
          return;
        }
        try {
          var3 = n.field_b;
          var3.c((byte) 124, param1);
          var3.b((byte) 11, param0.field_j);
          var3.b((byte) 11, param0.field_i);
        } catch (RuntimeException runtimeException) {
          throw bd.a((Throwable) ((Object) runtimeException), "di.F(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void a(byte param0) {
        if (ki.field_E == null) {
          return;
        }
        ka.a(ki.field_E, 8053);
        ki.field_E.a(ld.field_g, (byte) 19);
        ki.field_E = null;
        if (oa.field_c != null) {
          oa.field_c.a(127);
        }
        wizardrun.field_G.requestFocus();
        if (param0 != 60) {
          field_g = (boolean[]) null;
        }
    }

    private final void a(byte param0, int param1, long param2, Object param3) {
        ig var6 = null;
        ag var6_ref = null;
        int var7 = wizardrun.field_H;
        if (param0 != -30) {
          return;
        }
        try {
          if (param1 > this.field_f) {
            throw new IllegalStateException();
          }
          this.b(param2, 104);
          this.field_c = this.field_c - param1;
          while (this.field_c < 0) {
            var6 = (ig) (this.field_d.b((byte) -115));
            this.a(var6, -26);
          }
          var6_ref = new ag(param3, param1);
          this.field_b.a(param2, var6_ref, (byte) -117);
          this.field_d.a(var6_ref, 10);
          ((ig) ((Object) var6_ref)).field_o = 0L;
        } catch (RuntimeException runtimeException) {
          throw bd.a((Throwable) ((Object) runtimeException), "di.L(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_a = "Please enter your age in years";
        field_e = 2;
    }
}
