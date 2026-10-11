/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ld implements el {
    static ce field_e;
    private int field_h;
    private int field_c;
    static int field_l;
    private int field_a;
    private int field_i;
    private int field_g;
    private int field_f;
    static int field_k;
    private int field_d;
    private uc field_j;
    static String field_b;

    public final void a(int param0, int param1, int param2, boolean param3, gm param4) {
        va var6 = null;
        int var7 = 0;
        int var8 = 0;
        double var9 = 0.0;
        int var11 = 0;
        int var12 = 0;
        gm stackIn_7_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6_ref = null;
        int var13 = 0;
        double var9Lifetime1;
        int var11Lifetime1;
        int var12Lifetime1;
        try {
          if (param0 < 89) {
            this.field_a = -98;
          }
          if (param4 instanceof va) {
            stackIn_7_0 = (gm) (param4);
          } else {
            stackIn_7_0 = null;
          }
          var6 = (va) (stackIn_7_0);
          if (var6 == null) {
          }
          ph.d(param4.field_w + param2, param4.field_k + param1, param4.field_p, param4.field_o, this.field_h);
          var7 = param2 + param4.field_w + var6.field_G;
          var8 = var6.field_F + (param1 + param4.field_k);
          ph.d(var7, var8, var6.field_C, this.field_a);
          if (var6.field_I != -1) {
            var9 = 2.0 * ((double)var6.field_I * 3.141592653589793) / (double)var6.field_E;
            var11 = (int)(-Math.sin(var9) * (double)var6.field_C);
            var12 = (int)(Math.cos(var9) * (double)var6.field_C);
            ph.d(var11 + var7, var12 + var8, 1, this.field_g);
          }
          ph.d(var7, var8, 2, 1);
          var9Lifetime1 = 2.0 * (3.141592653589793 * (double)var6.field_D) / (double)var6.field_E;
          var11Lifetime1 = (int)(-Math.sin(var9Lifetime1) * (double)var6.field_C);
          var12Lifetime1 = (int)(Math.cos(var9Lifetime1) * (double)var6.field_C);
          ph.a(var7, var8, var7 + var11Lifetime1, var12Lifetime1 + var8, 1);
          if (this.field_j != null) {
            var13 = this.field_c + var6.field_C + var6.field_G;
            this.field_j.a(param4.field_m, var13 + (param2 + param4.field_w), this.field_d + (param1 + param4.field_k), -this.field_c - var13 + param4.field_p, -(this.field_c << 1) + param4.field_o, this.field_i, this.field_f, 1, 1, 0);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_20_0 = var6_ref;
          stackIn_20_1 = new StringBuilder().append("ld.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    final static void a(byte param0) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int stackIn_14_0 = 0;
        RuntimeException decompiledCaughtException = null;
        df var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3_int = 0;
        Object var3 = null;
        String var4_ref_String = null;
        int var4 = 0;
        ae var5 = null;
        String var5_ref = null;
        String var6 = null;
        ae var6_ref = null;
        String var7 = null;
        ae var7_ref = null;
        int var8 = 0;
        Object var3Lifetime1;
        String var4_ref_StringLifetime1;
        var8 = Torquing.field_u;
        try {
          var1 = kj.field_d;
          if (param0 != 123) {
            field_b = (String) null;
          }
          var2 = var1.i((byte) -101);
          if (var2 == 0) {
            if (ed.field_c == null) {
              ed.field_c = new uk(128);
              vf.field_d = 0;
            }
            stackIn_14_0 = (var1.i((byte) -101) != 1) ? 0 : 1;
            var3_int = stackIn_14_0;
            var4_ref_String = var1.h((byte) 124);
            if (var3_int != 0) {
              var1.h((byte) 120);
            }
            var5 = ac.a(var4_ref_String, 0);
            var6 = var1.h((byte) 116);
            var7 = hf.a((CharSequence) ((Object) var4_ref_String), 121);
            if (null == var7) {
              var7 = var4_ref_String;
            }
            if (var5 == null) {
              var5 = ac.a(var6, 0);
              if (null != var5) {
                ed.field_c.a(var5, (long)var7.hashCode(), 0);
              }
            }
            if (null == var5) {
              var5 = new ae();
              ed.field_c.a(var5, (long)var7.hashCode(), 0);
              fieldTemp$0 = vf.field_d;
              vf.field_d = vf.field_d + 1;
              var5.field_kb = fieldTemp$0;
              eh.field_b.a((byte) 54, var5);
            }
            var5.field_ob = var4_ref_String;
            return;
          }
          if (var2 != 1) {
            if (var2 == 2) {
              if (cn.field_b == 1) {
                cn.field_b = 2;
              }
              return;
            }
            if (3 == var2) {
              if (cn.field_b == 2) {
                cn.field_b = 1;
              }
              return;
            }
            if (var2 != 4) {
              nn.a("F1: " + me.a(-1), (Throwable) null, param0 - 10081);
              ih.b(true);
              return;
            }
            cn.field_b = 1;
            var3 = var1.h((byte) 116);
            og.field_m = ((String) (var3)).intern();
            var4 = var1.i((byte) -101);
            rf.a(var4, 64);
            return;
          }
          if (sh.field_a == null) {
            sh.field_a = new uk(128);
            mm.field_g = 0;
          }
          var3Lifetime1 = var1.h((byte) 124);
          if (((String) (var3Lifetime1)).equals("")) {
            var3Lifetime1 = null;
          }
          var4_ref_StringLifetime1 = var1.h((byte) 122);
          var5_ref = var1.h((byte) 124);
          var6_ref = qm.a(var4_ref_StringLifetime1, (byte) 45);
          if (null == var6_ref) {
            var6_ref = qm.a(var5_ref, (byte) 45);
            if (var6_ref != null) {
              sh.field_a.a(var6_ref, (long)hf.a((CharSequence) ((Object) var4_ref_StringLifetime1), 114).hashCode(), 0);
            }
          }
          if (null == var6_ref) {
            var6_ref = new ae();
            sh.field_a.a(var6_ref, (long)hf.a((CharSequence) ((Object) var4_ref_StringLifetime1), 118).hashCode(), 0);
            fieldTemp$1 = mm.field_g;
            mm.field_g = mm.field_g + 1;
            var6_ref.field_kb = fieldTemp$1;
            wf.field_x.a((byte) 54, var6_ref);
          }
          if (null != var3Lifetime1) {
            var3Lifetime1 = ((String) (var3Lifetime1)).intern();
          }
          var6_ref.field_jb = (String) (var3Lifetime1);
          var6_ref.field_ob = var4_ref_StringLifetime1;
          var6_ref.f(param0 - 123);
          var7_ref = (ae) (wf.field_x.b(0));
          while (null != var7_ref) {
            if (ha.a((byte) 75, var6_ref, var7_ref)) {
              var7_ref = (ae) (wf.field_x.f(-24059));
              if (var8 == 0) {
                continue;
              }
            }
            break;
          }
          if (var7_ref != null) {
            fi.a(var6_ref, var7_ref, -1240266932);
            if (var8 == 0) {
              return;
            }
          }
          wf.field_x.a((byte) 54, var6_ref);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw rb.a((Throwable) ((Object) var1_ref), "ld.C(" + param0 + ')');
        }
    }

    public static void b(byte param0) {
        try {
          field_e = null;
          field_b = null;
          if (param0 != -21) {
            ld.b((byte) 5);
          }
        } catch (RuntimeException runtimeException) {
          throw rb.a((Throwable) ((Object) runtimeException), "ld.D(" + param0 + ')');
        }
    }

    final static void a(int param0, int param1, int param2, int param3, byte param4) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          bp.a((byte) -49);
          if (param4 > -90) {
            ld.b((byte) -123);
          }
          ph.f(param1, param3, param0, param2);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw rb.a((Throwable) ((Object) var5), "ld.B(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    ld(uc param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.field_c = param1;
          this.field_h = param7;
          this.field_f = param4;
          this.field_i = param3;
          this.field_j = param0;
          this.field_a = param5;
          this.field_g = param6;
          this.field_d = param2;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_6_0 = runtimeException;
          stackIn_6_1 = new StringBuilder().append("ld.<init>(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(')').toString());
        }
    }

    static {
        field_e = new ce();
        field_b = "6 more worlds";
    }
}
