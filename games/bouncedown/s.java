/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class s extends vc {
    private int field_L;
    private String field_I;
    private uh field_H;
    private tg field_K;

    final void a(int param0, int param1, int param2, int param3) {
        String var5;
        vf var6;
        sf var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        tg var14;
        tg var15;
        tg var16;
        vf var6Lifetime1;
        L0: {
          L1: {
            L2: {
              var13 = Bounce.field_N;
              var6 = this.field_H.a((byte) 122);
              if (ui.field_o != var6 &&
                mi.field_c != var6) {
                var5 = this.field_H.c((byte) 66);
                if (var5 == null) {
                  var5 = this.field_I;
                  break L2;
                }
                if (!var5.equals(this.field_h)) {
                  break L1;
                }
                break L0;
              }
              var5 = he.field_l;
            }
            if (var5.equals(this.field_h)) {
              break L0;
            }
          }
          this.field_h = var5;
          this.a(0);
        }
        super.a(param0, param1, 111, param3);
        var6Lifetime1 = this.field_H.a((byte) 124);
        var8 = (sf) ((Object) this.field_j);
        var9 = param3 + this.field_r;
        if (param2 <= 33) {
          this.a(-109, -117, 123, 87);
        }
        var10 = var8.a(param1, (lk) (this), (byte) 51) + (var8.b((lk) (this), 0).b((byte) 14) >> 1);
        if (var6Lifetime1 != ui.field_o &&
          var6Lifetime1 != mi.field_c) {
          if (a.field_e == var6Lifetime1) {
            var14 = la.field_E[2];
            var14.a(var9, var10 - (var14.field_q >> 1), 256);
          } else if (mc.field_a == var6Lifetime1) {
            var15 = la.field_E[1];
            var15.a(var9, -(var15.field_q >> 1) + var10, 256);
          }
        } else {
          var16 = la.field_E[0];
          var11 = var16.field_t << 1;
          var12 = var16.field_o << 1;
          if (null != this.field_K &&
            this.field_K.field_s >= var11 &&
            this.field_K.field_q >= var12) {
            kh.a(this.field_K, 1);
            na.a();
          } else {
            this.field_K = new tg(var11, var12);
            kh.a(this.field_K, 1);
          }
          var16.b(112, 144, var16.field_t << 4, var16.field_o << 4, -this.field_L << 10, 4096);
          ve.a(-125);
          this.field_K.a(var9 - (var16.field_t >> 1), -var16.field_o + var10, 256);
        }
    }

    final static boolean a(boolean param0, int[] param1) {
        int var5_int = 0;
        int var6 = 0;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_40_2 = null;
        RuntimeException decompiledCaughtException = null;
        long var2_long = 0L;
        RuntimeException var2 = null;
        j var4_ref_j = null;
        int var4 = 0;
        j var5 = null;
        int var7 = 0;
        var7 = Bounce.field_N;
        try {
          if (pj.field_a != b.field_b) {
            return false;
          }
          var2_long = fa.a(-94);
          if (0 != vi.field_c &&
            bh.field_c < 0) {
            var4_ref_j = (j) (ih.field_w.a((byte) -99));
            if (var4_ref_j != null &&
              var4_ref_j.field_h < var2_long) {
              var4_ref_j.c(2);
              pe.field_d = var4_ref_j.field_i.length;
              jc.field_g.field_h = 0;
              for (var5_int = 0; pe.field_d > var5_int; var5_int++) {
                jc.field_g.field_i[var5_int] = var4_ref_j.field_i[var5_int];
              }
              ak.field_z = i.field_f;
              i.field_f = ck.field_b;
              ck.field_b = wa.field_d;
              wa.field_d = var4_ref_j.field_g;
              return true;
            }
          }
          if (!param0) {
            return false;
          }
          while (true) {
            if (bh.field_c < 0) {
              jc.field_g.field_h = 0;
              if (!qb.a(1, 3)) {
                return false;
              }
              bh.field_c = jc.field_g.h((byte) 43);
              jc.field_g.field_h = 0;
              pe.field_d = param1[bh.field_c];
            }
            if (!va.b(1)) {
              return false;
            }
            if (vi.field_c == 0) {
              ak.field_z = i.field_f;
              i.field_f = ck.field_b;
              ck.field_b = wa.field_d;
              wa.field_d = bh.field_c;
              bh.field_c = -1;
              return true;
            }
            var4 = vi.field_c;
            if (oj.field_c != 0.0) {
              var4 = (int)((double)var4 + la.field_C.nextGaussian() * oj.field_c);
              if (var4 < 0) {
                var4 = 0;
              }
            }
            var5 = new j((long)var4 + var2_long, bh.field_c, new byte[pe.field_d]);
            for (var6 = 0; var6 < pe.field_d; var6++) {
              var5.field_i[var6] = jc.field_g.field_i[var6];
            }
            ih.field_w.a(1, var5);
            bh.field_c = -1;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_39_0 = var2;
          stackIn_39_1 = new StringBuilder().append("s.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_40_2 = "null";
          } else {
            stackIn_40_2 = "{...}";
          }
          throw ii.a((Throwable) ((Object) stackIn_39_0), ((StringBuilder) (Object) stackIn_39_1).append(stackIn_40_2).append(')').toString());
        }
    }

    final boolean a(lk param0, boolean param1) {
        RuntimeException var3 = null;
        int[] var4 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param1) {
            return false;
          }
          var4 = (int[]) null;
          s.a(true, (int[]) null);
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("s.PA(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ii.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    s(uh param0, String param1, int param2, int param3, int param4, int param5) {
        super(param1, vd.a(93));
        try {
          this.field_H = param0;
          this.field_I = param1;
          this.b(param5, 80, param4, param2, param3);
        } catch (RuntimeException runtimeException) {
          throw ii.a((Throwable) ((Object) runtimeException), "s.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final String d(int param0) {
        if (param0 == 0) {
          return null;
        }
        this.field_H = (uh) null;
        return null;
    }

    final static we a(gk param0, String param1, int param2, String param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        String var6 = null;
        we stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 != 28576) {
            var6 = (String) null;
            s.a((gk) null, (String) null, 64, (String) null);
          }
          var4_int = param0.a(param3, false);
          var5 = param0.a(var4_int, param1, 102);
          stackIn_3_0 = jd.a(var4_int, param0, 8, var5);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("s.A(");
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
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw ii.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final void a(int param0, int param1, int param2, lk param3) {
        try {
          this.field_L = this.field_L + 1;
          super.a(param0, param1, param2, param3);
        } catch (RuntimeException runtimeException) {
          throw ii.a((Throwable) ((Object) runtimeException), "s.P(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean a(String param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        CharSequence var3 = null;
        boolean stackIn_1_0 = false;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_int = 13 % ((param1 - 68) / 58);
          var3 = (CharSequence) ((Object) param0);
          stackIn_1_0 = qe.field_e.equals(ce.a(var3, 0));
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_4_0 = var2;
          stackIn_4_1 = new StringBuilder().append("s.C(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw ii.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
    }
}
