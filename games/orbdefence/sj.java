/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sj extends jc {
    static int field_x;
    static String[] field_u;
    private sa field_w;
    private sa[] field_v;

    final static String b(boolean param0) {
        int var2 = 0;
        String var1;
        int var3;
        int var4;
        int var5;
        String var6;
        String var7;
        String var8;
        var5 = OrbDefence.field_D ? 1 : 0;
        if (!param0) {
          return (String) null;
        }
        var6 = "(" + lh.field_c + " " + fe.field_b + " " + ce.field_d + ") " + ab.field_l;
        var1 = var6;
        if (0 < tf.field_c) {
          var1 = var6 + ":";
          for (var2 = 0; tf.field_c > var2; var2++) {
            var7 = var1 + ' ';
            var3 = 255 & cd.field_t.field_j[var2];
            var4 = var3 >> 4;
            if (var4 < 10) {
              var4 += 48;
            } else {
              var4 += 55;
            }
            var3 = var3 & 15;
            var8 = var7 + (char)var4;
            if (var3 >= 10) {
              var3 += 55;
            } else {
              var3 += 48;
            }
            var1 = var8 + (char)var3;
          }
        }
        return var1;
    }

    public sj() {
        this.field_v = new sa[6];
        this.field_w = new sa();
        sa dupTemp$0 = new sa();
        this.field_v[0] = dupTemp$0;
        sa var1 = dupTemp$0;
        var1.b((byte) -31);
    }

    final void a(int param0, hj param1) {
        int var4 = 0;
        sa[] var3 = null;
        sa var5 = null;
        int var6 = 0;
        sj var7 = null;
        sa[] var8 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var6 = OrbDefence.field_D ? 1 : 0;
        try {
          if (param0 != -1) {
            var7 = (sj) null;
            this.a(true, -7, (sj) null);
          }
          var8 = this.field_v;
          var3 = var8;
          for (var4 = 0; var8.length > var4; var4++) {
            var5 = var8[var4];
            if (var5 != null) {
              var5.field_e = param1;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_12_0 = var3_ref;
          stackIn_12_1 = new StringBuilder().append("sj.CA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    private final void a(boolean param0, int param1, sj param2) {
        int var4_int = 0;
        sa dupTemp$0 = null;
        sa stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        sa stackIn_10_2 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        sa var5 = null;
        sa var6 = null;
        int var7 = 0;
        var7 = OrbDefence.field_D ? 1 : 0;
        try {
          super.a((byte) 81, param2);
          if (param1 != -19056) {
            return;
          }
          if (param0) {
            for (var4_int = 0; 6 > var4_int; var4_int++) {
              var5 = this.field_v[var4_int];
              if (var5 == null) {
                param2.field_v[var4_int] = null;
              } else {
                var6 = param2.field_v[var4_int];
                stackIn_9_0 = var5;
                stackIn_9_1 = -110;
                if (var6 != null) {
                  stackIn_10_2 = var6;
                } else {
                  dupTemp$0 = new sa();
                  param2.field_v[var4_int] = dupTemp$0;
                  stackIn_10_2 = dupTemp$0;
                }
                ((sa) (Object) stackIn_9_0).a((byte) stackIn_9_1, stackIn_10_2);
              }
            }
            return;
          }
          mk.a(this.field_v, 0, param2.field_v, 0, 6);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_17_0 = var4;
          stackIn_17_1 = new StringBuilder().append("sj.GA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    final static sh a(boolean param0, String param1, boolean param2, String param3) {
        long var4_long = 0L;
        RuntimeException var4 = null;
        Object var6 = null;
        String var7 = null;
        CharSequence var8 = null;
        sh stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_long = 0L;
          if (!param0) {
            var7 = (String) null;
            sj.a(true, (String) null, false, (String) null);
          }
          var6 = null;
          if (param1.indexOf('@') == -1) {
            var8 = (CharSequence) ((Object) param1);
            var4_long = bk.a(125, var8);
          } else {
            var6 = param1;
          }
          stackIn_6_0 = f.a(param2, var4_long, (String) (var6), 17470, param3);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_9_0 = var4;
          stackIn_9_1 = new StringBuilder().append("sj.W(").append(param0).append(',');
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
          throw dd.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final void a(int param0, hj[] param1, int param2) {
        int var4_int = 0;
        if (param2 <= 85) {
          return;
        }
        try {
          var4_int = param0;
          if (null == this.field_v[var4_int]) {
            this.field_v[var4_int] = new sa();
          }
          this.field_v[param0].field_b = param1;
        } catch (RuntimeException runtimeException) {
          throw dd.a((Throwable) ((Object) runtimeException), "sj.BA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    sj(sj param0, boolean param1) {
        this();
        try {
          param0.a(param1, -19056, this);
        } catch (RuntimeException runtimeException) {
          throw dd.a((Throwable) ((Object) runtimeException), "sj.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(int param0, hj[] param1) {
        int var4 = 0;
        sa[] var3 = null;
        sa var5 = null;
        int var6 = 0;
        sa[] var7 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var6 = OrbDefence.field_D ? 1 : 0;
        try {
          if (param0 < 34) {
            return;
          }
          var7 = this.field_v;
          var3 = var7;
          for (var4 = 0; var4 < var7.length; var4++) {
            var5 = var7[var4];
            if (var5 != null) {
              var5.field_b = param1;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_11_0 = var3_ref;
          stackIn_11_1 = new StringBuilder().append("sj.FA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    final sa a(int param0, boolean param1) {
        if (!param1) {
          return (sa) null;
        }
        sa dupTemp$0 = new sa();
        this.field_v[param0] = dupTemp$0;
        return dupTemp$0;
    }

    public static void b(byte param0) {
        field_u = null;
        int var1 = 8 % ((-5 - param0) / 61);
    }

    public final void a(int param0, int param1, pj param2, int param3, boolean param4) {
        pj stackIn_3_0 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        sa var7 = null;
        sa var9 = null;
        String var10 = null;
        s var11 = null;
        sa var12 = null;
        sa var13 = null;
        sa var14 = null;
        sa var15 = null;
        try {
          if (!(param2 instanceof s)) {
            stackIn_3_0 = null;
          } else {
            stackIn_3_0 = (pj) (param2);
          }
          var11 = (s) (stackIn_3_0);
          id.a(param2.field_s + (param1 + param2.field_m), param2.field_s + param1, param2.field_r + param0 + param2.field_n, param0 + param2.field_n, param3 ^ -5112);
          if (var11 != null) {
            param4 = param4 & var11.field_F;
          }
          var7 = this.field_v[0];
          this.field_w.b((byte) -31);
          var7.a(false, param0, param1, this.field_w, this, param2);
          if (param3 != -4394) {
            var10 = (String) null;
            sj.a(true, (String) null, false, (String) null);
          }
          if (var11 != null) {
            if (var11.field_D) {
              var12 = this.field_v[1];
              if (var12 != null) {
                var12.a(false, param0, param1, this.field_w, this, param2);
              }
            }
            if (var11.field_t) {
              var13 = this.field_v[3];
              if (var11.field_v != 0 &&
                var13 != null) {
                var13.a(false, param0, param1, this.field_w, this, param2);
              } else {
                var9 = this.field_v[2];
                if (var9 != null) {
                  var9.a(false, param0, param1, this.field_w, this, param2);
                }
              }
            }
          }
          if (param2.d(param3 ^ 4473)) {
            var14 = this.field_v[5];
            if (var14 != null) {
              var14.a(false, param0, param1, this.field_w, this, param2);
            }
          }
          if (!param4) {
            var15 = this.field_v[4];
            if (var15 != null) {
              var15.a(false, param0, param1, this.field_w, this, param2);
            }
          }
          this.field_w.a(this, param0, param1, param2, param3 + 28577);
          oc.g((byte) -105);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_32_0 = var6;
          stackIn_32_1 = new StringBuilder().append("sj.A(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_32_0), ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    static {
    }
}
