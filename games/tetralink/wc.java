/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wc extends mb {
    private Object field_F;
    static je field_E;
    static String field_H;
    static String field_K;
    static int field_J;
    static int field_I;
    static String field_G;
    static hl field_D;

    public static void c(byte param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          field_H = null;
          field_K = null;
          if (param0 != -103) {
            field_G = (String) null;
          }
          field_G = null;
          field_E = null;
          field_D = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw oi.a((Throwable) ((Object) var1), "wc.H(" + param0 + ')');
        }
    }

    final static void h(int param0) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int stackIn_11_0 = 0;
        ud stackIn_59_0 = null;
        int stackIn_59_1 = 0;
        ud stackIn_59_2 = null;
        RuntimeException decompiledCaughtException = null;
        bc var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3_int = 0;
        Object var3 = null;
        String var4_ref_String = null;
        int var4 = 0;
        String var5 = null;
        ud var6 = null;
        String var7 = null;
        ud var7_ref = null;
        String var8 = null;
        int var9 = 0;
        Object var3Lifetime1;
        String var4_ref_StringLifetime1;
        String var5Lifetime1;
        ud var6Lifetime1;
        var9 = TetraLink.field_J;
        try {
          var1 = kb.field_q;
          var2 = var1.d((byte) -99);
          if (0 == var2) {
            if (null == sd.field_nb) {
              sd.field_nb = new kd(128);
              ca.field_c = 0;
            }
            stackIn_11_0 = (var1.d((byte) -99) != 1) ? 0 : 1;
            var3_int = stackIn_11_0;
            var4_ref_String = var1.g((byte) 81);
            if (var3_int == 0) {
              var5 = var4_ref_String;
            }
            if (var3_int != 0 ||
              var9 != 0) {
              var5 = var1.g((byte) 81);
            }
            var6 = fh.a(-32055, var4_ref_String);
            var7 = var1.g((byte) 81);
            var8 = cc.a((CharSequence) ((Object) var4_ref_String), (byte) 98);
            if (var8 == null) {
              var8 = var4_ref_String;
            }
            if (var6 == null) {
              var6 = fh.a(-32055, var7);
              if (null != var6) {
                sd.field_nb.a((long)var8.hashCode(), var6, param0 + 104);
              }
            }
            if (var6 == null) {
              var6 = new ud();
              sd.field_nb.a((long)var8.hashCode(), var6, 113);
              fieldTemp$0 = ca.field_c;
              ca.field_c = ca.field_c + 1;
              var6.field_Rb = fieldTemp$0;
              mm.field_s.a(var6, false);
            }
            var6.field_Lb = var5;
            var6.field_Vb = var7;
            var6.field_Mb = var4_ref_String;
            return;
          }
          if (param0 != var2) {
            if (var2 == 2) {
              if (1 == ji.field_Tb) {
                ji.field_Tb = 2;
              }
              return;
            }
            if (3 == var2) {
              if (2 == ji.field_Tb) {
                ji.field_Tb = 1;
              }
              return;
            }
            if (4 != var2) {
              fk.a(-97, (Throwable) null, "F1: " + hc.a(false));
              mk.a(false);
              return;
            }
            ji.field_Tb = 1;
            var3 = var1.g((byte) 81);
            ul.field_e = ((String) (var3)).intern();
            var4 = var1.d((byte) -99);
            gd.d(var4, 3);
            return;
          }
          if (null == wb.field_f) {
            wb.field_f = new kd(128);
            qi.field_q = 0;
          }
          var3Lifetime1 = var1.g((byte) 81);
          if (((String) (var3Lifetime1)).equals("")) {
            var3Lifetime1 = null;
          }
          var4_ref_StringLifetime1 = var1.g((byte) 81);
          var5Lifetime1 = var1.g((byte) 81);
          var6Lifetime1 = ke.a(var4_ref_StringLifetime1, false);
          if (null == var6Lifetime1) {
            var6Lifetime1 = ke.a(var5Lifetime1, false);
            if (null != var6Lifetime1) {
              wb.field_f.a((long)cc.a((CharSequence) ((Object) var4_ref_StringLifetime1), (byte) 124).hashCode(), var6Lifetime1, 106);
            }
          }
          if (null == var6Lifetime1) {
            var6Lifetime1 = new ud();
            wb.field_f.a((long)cc.a((CharSequence) ((Object) var4_ref_StringLifetime1), (byte) 95).hashCode(), var6Lifetime1, 96);
            fieldTemp$1 = qi.field_q;
            qi.field_q = qi.field_q + 1;
            var6Lifetime1.field_Rb = fieldTemp$1;
            og.field_j.a(var6Lifetime1, false);
          }
          if (var3Lifetime1 != null) {
            var3Lifetime1 = ((String) (var3Lifetime1)).intern();
          }
          var6Lifetime1.field_Mb = var4_ref_StringLifetime1;
          var6Lifetime1.field_Ub = (String) (var3Lifetime1);
          var6Lifetime1.field_Vb = var5Lifetime1;
          var6Lifetime1.b(false);
          var7_ref = (ud) (og.field_j.c(false));
          L14: while (true) {
            if (null != var7_ref) {
              stackIn_59_0 = var6Lifetime1;
              stackIn_59_1 = 126;
              stackIn_59_2 = var7_ref;
              if (var9 != 0) {
                break L14;
              }
              if (om.$cfr$intArgs$a$b4eb2ef2f0cf(stackIn_59_0, stackIn_59_1, stackIn_59_2)) {
                var7_ref = (ud) (og.field_j.a((byte) -70));
                continue;
              }
            }
            if (var7_ref == null) {
              og.field_j.a(var6Lifetime1, false);
              if (var9 == 0) {
                return;
              }
            }
            stackIn_59_0 = var7_ref;
            stackIn_59_1 = 10;
            stackIn_59_2 = var6Lifetime1;
            break;
          }
          cl.a(stackIn_59_0, stackIn_59_1, stackIn_59_2);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw oi.a((Throwable) ((Object) var1_ref), "wc.F(" + param0 + ')');
        }
    }

    final Object g(int param0) {
        RuntimeException var2 = null;
        Object stackIn_2_0 = null;
        Object stackIn_4_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == 22850) {
            stackIn_4_0 = this.field_F;
            return stackIn_4_0;
          }
          stackIn_2_0 = (Object) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw oi.a((Throwable) ((Object) var2), "wc.B(" + param0 + ')');
        }
    }

    wc(Object param0, int param1) {
        super(param1);
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.field_F = param0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_6_0 = runtimeException;
          stackIn_6_1 = new StringBuilder().append("wc.<init>(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void i(int param0) {
        RuntimeException runtimeException = null;
        int[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = TetraLink.field_J;
        try {
          var1 = c.field_m;
          var2 = 0;
          var3 = var1.length;
          while (var3 > var2) {
            var1[var2++] = 0;
            var1[var2++] = 0;
            var1[var2++] = 0;
            var1[var2++] = 0;
            var1[var2++] = 0;
            var1[var2++] = 0;
            var1[var2++] = 0;
            var1[var2++] = 0;
            if (var4 != 0) {
              return;
            }
          }
          if (param0 != 3) {
            wc.c((byte) 12);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw oi.a((Throwable) ((Object) runtimeException), "wc.G(" + param0 + ')');
        }
    }

    final boolean f(int param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 > 37) {
            return false;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw oi.a((Throwable) ((Object) var2), "wc.A(" + param0 + ')');
        }
    }

    static {
        field_E = new je();
        field_K = "Unfortunately you are not eligible to create an account.";
        field_H = "You have resigned and are offering a rematch.";
        field_G = "Connection timed out. Please try using a different server.";
    }
}
