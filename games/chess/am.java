/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class am {
    static dd[] field_c;
    static String field_d;
    static String field_a;
    static String field_b;

    final static boolean a(int param0, char param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (Character.isISOControl(param1)) {
            return false;
          }
          if (la.a(0, param1)) {
            return true;
          }
          if (param1 != 45 &&
            param1 != 160 &&
            param1 != 32 &&
            param1 != 95) {
            var2_int = -76 % ((75 - param0) / 40);
            return false;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fk.a((Throwable) ((Object) var2), "am.E(" + param0 + ',' + param1 + ')');
        }
    }

    final static String a(p param0, int param1, byte param2) {
        int var3_int = 0;
        Exception var3 = null;
        RuntimeException var3_ref = null;
        byte[] var4 = null;
        String var5 = null;
        String stackIn_6_0 = null;
        String stackIn_8_0 = null;
        String stackIn_10_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        Throwable decompiledCaughtException = null;
        try {
          try {
            var3_int = param0.j(111);
            if (param1 < var3_int) {
              var3_int = param1;
            }
            var4 = new byte[var3_int];
            param0.field_l = param0.field_l + cg.field_c.a((byte) 115, param0.field_o, var3_int, param0.field_l, 0, var4);
            var5 = gh.a(var4, 0, -161, var3_int);
            if (param2 >= 54) {
              stackIn_8_0 = var5;
              return stackIn_8_0;
            }
            stackIn_6_0 = (String) null;
            return stackIn_6_0;
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3 = (Exception) (Object) decompiledCaughtException;
            stackIn_10_0 = "Cabbage";
            return stackIn_10_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var3_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_14_0 = var3_ref;
          stackIn_14_1 = new StringBuilder().append("am.D(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final static boolean a(boolean param0, String param1) {
        RuntimeException var2 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!kn.field_L) {
            return false;
          }
          if (param0) {
            field_b = (String) null;
          }
          if (vk.field_g == 2 &&
            ec.field_f != null &&
            ec.field_f.equals(ad.a((CharSequence) ((Object) param1), -2))) {
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_24_0 = var2;
          stackIn_24_1 = new StringBuilder().append("am.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(')').toString());
        }
    }

    final static int a(int param0, int param1, byte param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 >= 0) {
            stackIn_2_0 = -114;
            return stackIn_2_0;
          }
          var3_int = -1 + param1 & param0 >> 31;
          stackIn_4_0 = var3_int + ((param0 >>> 31) + param0) % param1;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw fk.a((Throwable) ((Object) var3), "am.B(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    public static void c(byte param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          field_d = null;
          field_a = null;
          field_c = null;
          if (param0 < 2) {
            field_c = (dd[]) null;
          }
          field_b = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw fk.a((Throwable) ((Object) var1), "am.F(" + param0 + ')');
        }
    }

    final static String b(byte param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        String stackIn_2_0 = null;
        String stackIn_4_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var1_int = -65 % ((8 - param0) / 34);
          if (ci.field_J != null) {
            stackIn_4_0 = ci.field_J;
            return stackIn_4_0;
          }
          stackIn_2_0 = "";
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw fk.a((Throwable) ((Object) var1), "am.C(" + param0 + ')');
        }
    }

    final static void a(byte param0) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int stackIn_14_0 = 0;
        RuntimeException decompiledCaughtException = null;
        nk var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3_int = 0;
        Object var3 = null;
        String var4_ref_String = null;
        int var4 = 0;
        String var5 = null;
        ve var6 = null;
        String var7 = null;
        ve var7_ref = null;
        String var8 = null;
        int var9 = 0;
        Object var3Lifetime1;
        String var4_ref_StringLifetime1;
        String var5Lifetime1;
        ve var6Lifetime1;
        var9 = Chess.field_G;
        try {
          var1 = tk.field_h;
          var2 = var1.i(param0 ^ -22);
          if (param0 != 115) {
            field_a = (String) null;
          }
          if (var2 == 0) {
            if (null == r.field_Ib) {
              r.field_Ib = new dk(128);
              wc.field_v = 0;
            }
            stackIn_14_0 = (var1.i(param0 ^ -40) != 1) ? 0 : 1;
            var3_int = stackIn_14_0;
            var4_ref_String = var1.d(0);
            if (var3_int != 0) {
              var5 = var1.d(0);
            }
            if (var3_int == 0 ||
              var9 != 0) {
              var5 = var4_ref_String;
            }
            var6 = hh.a(param0 ^ -15069, var4_ref_String);
            var7 = var1.d(0);
            var8 = ad.a((CharSequence) ((Object) var4_ref_String), param0 ^ -115);
            if (var8 == null) {
              var8 = var4_ref_String;
            }
            if (var6 == null) {
              var6 = hh.a(-15024, var7);
              if (var6 != null) {
                r.field_Ib.a(true, var6, (long)var8.hashCode());
              }
            }
            if (null == var6) {
              var6 = new ve();
              r.field_Ib.a(true, var6, (long)var8.hashCode());
              fieldTemp$0 = wc.field_v;
              wc.field_v = wc.field_v + 1;
              var6.field_Ib = fieldTemp$0;
              cl.field_e.a((o) (var6), (byte) 127);
            }
            var6.field_Ob = var7;
            var6.field_Kb = var5;
            var6.field_Fb = var4_ref_String;
            return;
          }
          if (var2 != 1) {
            if (var2 == 2) {
              if (ld.field_g == 1) {
                ld.field_g = 2;
              }
              return;
            }
            if (var2 == 3) {
              if (ld.field_g == 2) {
                ld.field_g = 1;
              }
              return;
            }
            if (var2 != 4) {
              fg.a((Throwable) null, (byte) -77, "F1: " + tm.b((byte) -128));
              si.d(65280);
              return;
            }
            ld.field_g = 1;
            var3 = var1.d(0);
            f.field_a = ((String) (var3)).intern();
            var4 = var1.i(-82);
            mh.a(2, var4);
            return;
          }
          if (bf.field_M == null) {
            bf.field_M = new dk(128);
            wg.field_w = 0;
          }
          var3Lifetime1 = var1.d(0);
          if (((String) (var3Lifetime1)).equals("")) {
            var3Lifetime1 = null;
          }
          var4_ref_StringLifetime1 = var1.d(param0 ^ 115);
          var5Lifetime1 = var1.d(param0 - 115);
          var6Lifetime1 = mn.a(-1, var4_ref_StringLifetime1);
          if (null == var6Lifetime1) {
            var6Lifetime1 = mn.a(-1, var5Lifetime1);
            if (null != var6Lifetime1) {
              bf.field_M.a(true, var6Lifetime1, (long)ad.a((CharSequence) ((Object) var4_ref_StringLifetime1), -2).hashCode());
            }
          }
          if (null == var6Lifetime1) {
            var6Lifetime1 = new ve();
            bf.field_M.a(true, var6Lifetime1, (long)ad.a((CharSequence) ((Object) var4_ref_StringLifetime1), -2).hashCode());
            fieldTemp$1 = wg.field_w;
            wg.field_w = wg.field_w + 1;
            var6Lifetime1.field_Ib = fieldTemp$1;
            me.field_e.a((o) (var6Lifetime1), (byte) 126);
          }
          if (null != var3Lifetime1) {
            var3Lifetime1 = ((String) (var3Lifetime1)).intern();
          }
          var6Lifetime1.field_Lb = (String) (var3Lifetime1);
          var6Lifetime1.field_Fb = var4_ref_StringLifetime1;
          var6Lifetime1.field_Ob = var5Lifetime1;
          var6Lifetime1.c(-2193);
          var7_ref = (ve) (me.field_e.g(-18110));
          while (var7_ref != null) {
            if (pd.a((byte) -15, var6Lifetime1, var7_ref)) {
              var7_ref = (ve) (me.field_e.a((byte) -105));
              if (var9 == 0) {
                continue;
              }
            }
            break;
          }
          if (null == var7_ref) {
            me.field_e.a((o) (var6Lifetime1), (byte) -102);
            if (var9 == 0) {
              return;
            }
          }
          he.a(var6Lifetime1, var7_ref, true);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw fk.a((Throwable) ((Object) var1_ref), "am.G(" + param0 + ')');
        }
    }

    static {
        field_a = "Names cannot start or end with space or underscore";
        field_b = "Kick <%0> from this game";
    }
}
