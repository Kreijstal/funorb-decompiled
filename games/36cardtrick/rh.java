/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rh extends qb {
    int field_i;
    static int field_k;
    static String field_g;
    static boolean field_j;
    static gf field_l;
    static int[] field_h;

    final static void a(int param0) {
        int fieldTemp$1 = 0;
        int fieldTemp$0 = 0;
        int stackIn_14_0 = 0;
        RuntimeException decompiledCaughtException = null;
        w var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        Object var3 = null;
        int var3_int = 0;
        String var4_ref_String = null;
        int var4 = 0;
        String var5 = null;
        aa var5_ref = null;
        aa var6 = null;
        String var6_ref = null;
        aa var7 = null;
        String var7_ref = null;
        int var8 = 0;
        Object var3Lifetime1;
        String var4_ref_StringLifetime1;
        var8 = Main.field_T;
        try {
          if (param0 != 0) {
            return;
          }
          var1 = rd.field_j;
          var2 = var1.f(-102);
          if (var2 == 0) {
            if (sl.field_b == null) {
              sl.field_b = new ph(128);
              de.field_b = 0;
            }
            stackIn_14_0 = (var1.f(15) != 1) ? 0 : 1;
            var3_int = stackIn_14_0;
            var4_ref_String = var1.c(false);
            if (var3_int != 0) {
              var1.c(false);
            }
            var5_ref = hb.a((byte) -118, var4_ref_String);
            var6_ref = var1.c(false);
            var7_ref = ff.a((byte) 116, (CharSequence) ((Object) var4_ref_String));
            if (null == var7_ref) {
              var7_ref = var4_ref_String;
            }
            if (var5_ref == null) {
              var5_ref = hb.a((byte) -41, var6_ref);
              if (null != var5_ref) {
                sl.field_b.a(var5_ref, (long)var7_ref.hashCode(), 6144);
              }
            }
            if (var5_ref == null) {
              var5_ref = new aa();
              sl.field_b.a(var5_ref, (long)var7_ref.hashCode(), 6144);
              fieldTemp$1 = de.field_b;
              de.field_b = de.field_b + 1;
              var5_ref.field_eb = fieldTemp$1;
              cd.field_b.a(var5_ref, 27362);
            }
            var5_ref.field_gb = var4_ref_String;
            return;
          }
          if (1 != var2) {
            if (var2 == 2) {
              if (ii.field_c == 1) {
                ii.field_c = 2;
              }
              return;
            }
            if (var2 == 3) {
              if (2 == ii.field_c) {
                ii.field_c = 1;
              }
              return;
            }
            if (var2 != 4) {
              k.a((Throwable) null, (byte) -108, "F1: " + aj.a((byte) 92));
              mc.a((byte) -125);
              return;
            }
            ii.field_c = 1;
            var3 = var1.c(false);
            bc.field_b = ((String) (var3)).intern();
            var4 = var1.f(121);
            sl.a((byte) 99, var4);
            return;
          }
          if (rf.field_d == null) {
            rf.field_d = new ph(128);
            ok.field_b = 0;
          }
          var3Lifetime1 = var1.c(false);
          if (((String) (var3Lifetime1)).equals("")) {
            var3Lifetime1 = null;
          }
          var4_ref_StringLifetime1 = var1.c(false);
          var5 = var1.c(false);
          var6 = jf.a(0, var4_ref_StringLifetime1);
          if (var6 == null) {
            var6 = jf.a(param0 + 0, var5);
            if (null != var6) {
              rf.field_d.a(var6, (long)ff.a((byte) 116, (CharSequence) ((Object) var4_ref_StringLifetime1)).hashCode(), 6144);
            }
          }
          if (var6 == null) {
            var6 = new aa();
            rf.field_d.a(var6, (long)ff.a((byte) 116, (CharSequence) ((Object) var4_ref_StringLifetime1)).hashCode(), 6144);
            fieldTemp$0 = ok.field_b;
            ok.field_b = ok.field_b + 1;
            var6.field_eb = fieldTemp$0;
            kh.field_c.a(var6, param0 ^ 27362);
          }
          if (var3Lifetime1 != null) {
            var3Lifetime1 = ((String) (var3Lifetime1)).intern();
          }
          var6.field_gb = var4_ref_StringLifetime1;
          var6.field_cb = (String) (var3Lifetime1);
          var6.c(82);
          var7 = (aa) (kh.field_c.a((byte) 74));
          while (null != var7) {
            if (rl.a((byte) 127, var7, var6)) {
              var7 = (aa) (kh.field_c.b((byte) -109));
              if (var8 == 0) {
                continue;
              }
            }
            break;
          }
          if (null == var7) {
            kh.field_c.a(var6, param0 ^ 27362);
            if (var8 == 0) {
              return;
            }
          }
          ce.a(var7, param0 ^ 0, var6);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw ma.a((Throwable) ((Object) var1_ref), "rh.A(" + param0 + ')');
        }
    }

    final static void d(int param0) {
        try {
          ml.field_b = null;
          hb.field_a = null;
          na.field_q = null;
          rd.field_k = (byte[][]) null;
          jf.field_i = null;
          int var1_int = 5 / ((-88 - param0) / 33);
          kb.field_c = null;
        } catch (RuntimeException runtimeException) {
          throw ma.a((Throwable) ((Object) runtimeException), "rh.D(" + param0 + ')');
        }
    }

    private rh() throws Throwable {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          throw new Error();
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ma.a((Throwable) ((Object) var1), "rh.<init>()");
        }
    }

    final static String[] a(char param0, String param1, int param2) {
        int incrementValue$1 = 0;
        int var3_int = 0;
        RuntimeException var3 = null;
        String[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        String[] stackIn_17_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        var9 = Main.field_T;
        try {
          var3_int = qd.a((byte) -118, param0, (CharSequence) ((Object) param1));
          var4 = new String[var3_int + 1];
          var5 = 0;
          if (param2 >= -24) {
            field_k = -6;
          }
          var6 = 0;
          var7 = 0;
          L1: while (true) {
            if (var3_int > var7) {
              if (var9 != 0) {
                break L1;
              }
              var8 = var6;
              while (param0 != param1.charAt(var8)) {
                var8++;
              }
              incrementValue$1 = var5;
              var5++;
              var4[incrementValue$1] = param1.substring(var6, var8);
              var6 = 1 + var8;
              var7++;
              continue L1;
            }
            var4[var3_int] = param1.substring(var6);
            break;
          }
          stackIn_17_0 = var4;
          return stackIn_17_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_21_0 = var3;
          stackIn_21_1 = new StringBuilder().append("rh.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param2).append(')').toString());
        }
    }

    public static void b(byte param0) {
        if (param0 >= -91) {
          return;
        }
        try {
          field_g = null;
          field_l = null;
          field_h = null;
        } catch (RuntimeException runtimeException) {
          throw ma.a((Throwable) ((Object) runtimeException), "rh.E(" + param0 + ')');
        }
    }

    final static kc a(int param0, qk param1, int param2, int param3) {
        RuntimeException var4 = null;
        kc stackIn_2_0 = null;
        Object stackIn_7_0 = null;
        kc stackIn_9_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3 != -30851) {
            stackIn_2_0 = (kc) null;
            return stackIn_2_0;
          }
          if (!tc.a(param2, param0, 25479, param1)) {
            stackIn_7_0 = null;
            return (kc) (stackIn_7_0);
          }
          stackIn_9_0 = sj.b((byte) 35);
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_13_0 = var4;
          stackIn_13_1 = new StringBuilder().append("rh.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    static {
        field_j = false;
        field_k = 0;
        field_g = "Data server full or too many connections from your address. Please try again in a few minutes.";
        field_h = new int[12];
    }
}
