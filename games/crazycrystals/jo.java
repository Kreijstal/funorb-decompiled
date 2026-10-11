/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jo extends pn implements Cloneable {
    static am field_p;
    private int field_n;
    private int field_m;
    static int field_o;

    final void c(boolean param0, boolean param1) {
        if (!param0) {
          db var4 = (db) null;
          jo.a(false, -77, (db) null, -90);
          if (!param1) {
            fn.field_j = fn.field_j - ob.field_l;
            wd.field_j = wd.field_j + 1;
            gm.field_c[this.field_n] = gm.field_c[this.field_n] + 1;
            return;
          }
          return;
        }
        if (!param1) {
          fn.field_j = fn.field_j - ob.field_l;
          wd.field_j = wd.field_j + 1;
          gm.field_c[this.field_n] = gm.field_c[this.field_n] + 1;
          return;
        }
    }

    final static dl[] a(boolean param0, int param1, db param2, int param3) {
        RuntimeException var4 = null;
        Object stackIn_2_0 = null;
        dl[] stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (gm.a(param2, param3, param0, param1)) {
            stackIn_4_0 = mn.c(0);
            return stackIn_4_0;
          }
          stackIn_2_0 = null;
          return (dl[]) (stackIn_2_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_7_0 = var4;
          stackIn_7_1 = new StringBuilder().append("jo.K(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param3).append(')').toString());
        }
    }

    final boolean a(byte param0, f[][] param1, int param2, int param3, int param4, fq param5, int param6) {
        RuntimeException var8 = null;
        fq var9 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == -21) {
            return true;
          }
          var9 = (fq) null;
          this.a((byte) -96, (f[][]) null, 127, -74, -22, (fq) null, -77);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_6_0 = var8;
          stackIn_6_1 = new StringBuilder().append("jo.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param6).append(')').toString());
        }
    }

    jo(f param0, int param1) {
        super(param0);
        this.field_m = 0;
        try {
          this.field_n = param1;
        } catch (RuntimeException runtimeException) {
          throw dn.a((Throwable) ((Object) runtimeException), "jo.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final f a(int param0, byte param1, int param2) {
        if (param1 != -110) {
          return (f) null;
        }
        return (f) (this);
    }

    final int a(boolean param0, boolean param1) {
        if (!param0) {
          field_p = (am) null;
          return 12;
        }
        return 12;
    }

    final void c(int param0, int param1, f[][] param2, int param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.field_m = this.field_m + 1;
          if (param1 != 0) {
            return;
          }
          if (vp.field_i[this.field_n].length > this.field_m) {
            return;
          }
          this.field_m = 0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_8_0 = var5;
          stackIn_8_1 = new StringBuilder().append("jo.W(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param3).append(')').toString());
        }
    }

    final f a(int param0, ea param1, int param2, int param3, byte param4, int param5, f[][] param6) {
        int[] dupTemp$0 = null;
        f stackIn_16_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var8 = null;
        int var9 = 0;
        fq var10 = null;
        fq var11 = null;
        var9 = CrazyCrystals.field_B;
        try {
          wd.field_j = wd.field_j - 1;
          mb.field_g = mb.field_g - ob.field_l;
          if (vh.field_a &&
            1 == uo.field_o &&
            param5 + param2 == 6 + w.field_f &&
            9 + ia.field_i == param3 + param0) {
            va.field_c = 1;
          }
          we.field_h = we.field_h - 16;
          b.field_a = b.field_a - 8;
          if (param4 > -87) {
            jo.f(-96);
          }
          fp.field_a = fp.field_a - 16;
          je.field_j = je.field_j - 8;
          ob.field_l = ob.field_l - 1;
          fn.field_j = fn.field_j + wd.field_j;
          sc.field_i[this.field_n].a(128, 12 * (param5 + param2), 12 * (param3 + param0), 0, (byte) -111);
          gm.field_c[this.field_n] = gm.field_c[this.field_n] - 1;
          var10 = (fq) (param1);
          var11 = var10;
          if (null == ab.field_D) {
            dupTemp$0 = q.field_a[var10.field_u].field_e;
            dupTemp$0[this.field_n] = dupTemp$0[this.field_n] + 1;
            if (tm.field_e > jm.field_b) {
              rl.field_h = 1 << var11.field_u;
              jm.field_b = tm.field_e;
            } else {
              rl.field_h = rl.field_h | 1 << var11.field_u;
            }
            if (this.field_n == 0) {
              fn.field_j = fn.field_j + 60;
              mb.field_g = mb.field_g + 50;
            } else {
              fn.field_j = fn.field_j + 800;
              mb.field_g = mb.field_g + 700;
            }
          }
          this.field_l.a(1 << var11.field_u, true, tm.field_e);
          stackIn_16_0 = this.field_l.a(param0, param1, param2, param3, (byte) -92, param5, param6);
          return stackIn_16_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_19_0 = var8;
          stackIn_19_1 = new StringBuilder().append("jo.Q(").append(param0).append(',');
          if (param1 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          stackIn_22_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(')').toString());
        }
    }

    public static void f(int param0) {
        field_p = null;
        if (param0 != 6) {
          field_p = (am) null;
        }
    }

    final int d(byte param0) {
        if (param0 >= -40) {
          this.a(true, true);
          return -2;
        }
        return -2;
    }

    final void b(int param0, int param1, int param2, boolean param3, int param4, int param5) {
        int var7 = 61 % ((param0 - 74) / 41);
        if (param1 != 24) {
          vp.field_i[this.field_n][this.field_m].b(param4, -param2 + param5, 2 * param1, param2 * 3);
          return;
        }
        if (24 == param2) {
          vp.field_i[this.field_n][this.field_m].a(param4, -param2 + param5);
          return;
        }
        vp.field_i[this.field_n][this.field_m].b(param4, -param2 + param5, 2 * param1, param2 * 3);
    }

    final void a(int param0, int param1, int param2, f[][] param3, int param4, int param5, int param6, int param7) {
        try {
          if (param0 <= 92) {
            this.field_m = -82;
          }
        } catch (RuntimeException runtimeException) {
          throw dn.a((Throwable) ((Object) runtimeException), "jo.HA(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    final nj a(int param0, nj param1) {
        RuntimeException var3 = null;
        nj stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 23525) {
            field_o = -68;
          }
          stackIn_3_0 = ng.a(cj.field_y, param1, new jo(new kp(-1), this.field_n), (byte) -83, fa.field_k);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("jo.V(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    static {
    }
}
