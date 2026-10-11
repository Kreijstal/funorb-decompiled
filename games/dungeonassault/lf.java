/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lf extends kl {
    private String field_r;
    static cn field_x;
    static u[] field_y;
    private pp field_o;
    static String field_v;
    private pp field_s;
    static String field_p;
    static wh field_w;
    boolean field_u;
    static cn field_n;
    private String field_t;
    static String field_m;
    static String field_q;

    final void a(boolean param0) {
        boolean stackIn_7_1 = false;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          super.a(param0);
          if (hh.field_s != null) {
            stackIn_7_1 = (hh.field_s == this.field_o);
            this.field_u = stackIn_7_1;
            this.field_d = true;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw vk.a((Throwable) ((Object) var2), "lf.A(" + param0 + ')');
        }
    }

    public static void d(int param0) {
        try {
          field_w = null;
          int var1_int = 36 / ((-82 - param0) / 35);
          field_v = null;
          field_p = null;
          field_q = null;
          field_y = null;
          field_m = null;
          field_n = null;
          field_x = null;
        } catch (RuntimeException runtimeException) {
          throw vk.a((Throwable) ((Object) runtimeException), "lf.C(" + param0 + ')');
        }
    }

    lf(String param0, String param1) {
        this(param0, param1, 300);
    }

    final void b(int param0) {
        int var3 = 0;
        int var4 = 0;
        try {
          int var2_int = -31 / ((param0 - 41) / 63);
          super.b(-91);
          var3 = this.field_k + (this.field_a >> 1);
          var4 = this.field_j + 10;
          ne.field_c.c(this.field_t, var3, ne.field_c.field_H + var4, 16777215, -1);
          var4 = var4 + ne.field_c.field_H;
          la.field_b.a(this.field_r, 20 + this.field_k, var4, this.field_a - 40, -(jm.field_i.field_v * 2) + (-24 - var4) + (this.field_i + this.field_j), 16777215, -1, 1, 1, la.field_b.field_H);
        } catch (RuntimeException runtimeException) {
          throw vk.a((Throwable) ((Object) runtimeException), "lf.F(" + param0 + ')');
        }
    }

    private lf(String param0, String param1, int param2) {
        RuntimeException runtimeException = null;
        int var4_int = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.field_t = param0;
          this.field_r = param1;
          var4_int = 88 - (-(2 * jm.field_i.field_v) - oj.a(this.field_r, -1, new int[]{300}, la.field_b) * la.field_b.field_H);
          this.a(param2, 0, var4_int);
          this.field_d = false;
          this.field_o = tn.a(this.field_k + (-jm.field_i.field_y + this.field_a >> 1), this.field_i + (this.field_j - 24 - jm.field_i.field_v * 2), ne.field_c, jm.field_i, -81, mp.field_e);
          this.field_s = tn.a(this.field_k + (-jm.field_i.field_y + this.field_a >> 1), -16 + this.field_j - (-this.field_i + jm.field_i.field_v), ne.field_c, jm.field_i, -111, um.field_d);
          this.field_f.a(this.field_o, false);
          this.field_f.a(this.field_s, false);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_6_0 = runtimeException;
          stackIn_6_1 = new StringBuilder().append("lf.<init>(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param2).append(')').toString());
        }
    }

    final static void d(byte param0) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int stackIn_11_0 = 0;
        boolean stackIn_57_0 = false;
        int stackIn_67_0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_56_0;
        wj var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3_int = 0;
        Object var3 = null;
        String var4_ref_String = null;
        int var4 = 0;
        bo var5 = null;
        String var5_ref = null;
        String var6 = null;
        bo var6_ref = null;
        String var7 = null;
        bo var7_ref = null;
        int var8 = 0;
        Object var3Lifetime1;
        String var4_ref_StringLifetime1;
        var8 = DungeonAssault.field_K;
        try {
          var1 = ra.field_c;
          var2 = var1.c(true);
          if (var2 == 0) {
            if (null == lh.field_p) {
              lh.field_p = new tb(128);
              kp.field_e = 0;
            }
            stackIn_11_0 = (var1.c(true) != 1) ? 0 : 1;
            var3_int = stackIn_11_0;
            var4_ref_String = var1.d(-119);
            if (var3_int != 0) {
              var1.d(-103);
            }
            var5 = vj.a(var4_ref_String, 49);
            var6 = var1.d(-99);
            var7 = jm.a((byte) 59, (CharSequence) ((Object) var4_ref_String));
            if (var7 == null) {
              var7 = var4_ref_String;
            }
            if (var5 == null) {
              var5 = vj.a(var6, 116);
              if (var5 != null) {
                lh.field_p.a(var5, (long)var7.hashCode(), -106);
              }
            }
            if (var5 == null) {
              var5 = new bo();
              lh.field_p.a(var5, (long)var7.hashCode(), param0 ^ -59);
              fieldTemp$0 = kp.field_e;
              kp.field_e = kp.field_e + 1;
              var5.field_Ib = fieldTemp$0;
              fm.field_b.a(var5, false);
            }
            var5.field_Hb = var4_ref_String;
            return;
          }
          if (var2 != 1) {
            if (param0 != 123) {
              lf.d((byte) 37);
            }
            if (var2 == 2) {
              if (ke.field_d == 1) {
                ke.field_d = 2;
              }
              return;
            }
            if (var2 == 3) {
              if (ke.field_d == 2) {
                ke.field_d = 1;
              }
              return;
            }
            if (4 != var2) {
              sm.a((Throwable) null, 1, "F1: " + sj.l(param0 + 69));
              tl.a(param0 ^ -61);
              return;
            }
            ke.field_d = 1;
            var3 = var1.d(param0 - 247);
            gm.field_b = ((String) (var3)).intern();
            var4 = var1.c(true);
            r.a((byte) -112, var4);
            return;
          }
          if (fk.field_v == null) {
            fk.field_v = new tb(128);
            o.field_m = 0;
          }
          var3Lifetime1 = var1.d(-127);
          if (((String) (var3Lifetime1)).equals("")) {
            var3Lifetime1 = null;
          }
          var4_ref_StringLifetime1 = var1.d(param0 - 230);
          var5_ref = var1.d(-117);
          var6_ref = ll.a(var4_ref_StringLifetime1, (byte) -47);
          if (null == var6_ref) {
            var6_ref = ll.a(var5_ref, (byte) -47);
            if (null != var6_ref) {
              fk.field_v.a(var6_ref, (long)jm.a((byte) 59, (CharSequence) ((Object) var4_ref_StringLifetime1)).hashCode(), -86);
            }
          }
          if (null == var6_ref) {
            var6_ref = new bo();
            fk.field_v.a(var6_ref, (long)jm.a((byte) 59, (CharSequence) ((Object) var4_ref_StringLifetime1)).hashCode(), param0 ^ -69);
            fieldTemp$1 = o.field_m;
            o.field_m = o.field_m + 1;
            var6_ref.field_Ib = fieldTemp$1;
            jm.field_f.a(var6_ref, false);
          }
          if (var3Lifetime1 != null) {
            var3Lifetime1 = ((String) (var3Lifetime1)).intern();
          }
          var6_ref.field_Nb = (String) (var3Lifetime1);
          var6_ref.field_Hb = var4_ref_StringLifetime1;
          var6_ref.a(false);
          var7_ref = (bo) (jm.field_f.e(-24172));
          L13: while (true) {
            if (var7_ref != null) {
              stackOut_56_0 = eg.a(var6_ref, param0 + 77, var7_ref);
              stackIn_67_0 = stackOut_56_0 ? 1 : 0;
              stackIn_57_0 = stackOut_56_0;
              if (var8 != 0) {
                break L13;
              }
              if (stackIn_57_0) {
                var7_ref = (bo) (jm.field_f.a(param0 - 119));
                continue;
              }
            }
            if (var7_ref == null) {
              jm.field_f.a(var6_ref, false);
              if (var8 == 0) {
                return;
              }
            }
            stackIn_67_0 = 55;
            break;
          }
          so.$cfr$intArgs$a$d4f67f19bfc6(stackIn_67_0, var7_ref, var6_ref);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw vk.a((Throwable) ((Object) var1_ref), "lf.D(" + param0 + ')');
        }
    }

    static {
        field_v = "Ogre Thug";
        field_p = "Berserker";
        field_q = "Please send me news and updates (I can unsubscribe at any time)";
        field_m = "This guardian is lethal.";
    }
}
