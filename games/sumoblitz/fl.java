/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fl extends gm {
    private sm field_t;
    static String field_s;
    static int field_p;
    static int field_n;
    static byte[][] field_o;
    private sm[] field_q;
    static ri[] field_r;

    public static void b(int param0) {
        field_r = null;
        if (param0 != 0) {
          field_s = (String) null;
        }
        field_o = (byte[][]) null;
        field_s = null;
    }

    final static String a(boolean param0, boolean param1, boolean param2, byte param3) {
        int var4 = 0;
        if (param2) {
          var4 += 4;
        }
        if (param1) {
          var4 += 2;
        }
        if (param3 != 63) {
          field_n = 124;
        }
        if (param0) {
          var4++;
        }
        return pl.field_r[var4];
    }

    fl(fl param0, boolean param1) {
        this();
        try {
          param0.a(this, param1, -26407);
        } catch (RuntimeException runtimeException) {
          throw qo.a((Throwable) ((Object) runtimeException), "fl.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final void a(pk param0, int param1, int param2, boolean param3, int param4) {
        pk stackIn_3_0 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_35_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        sm var7 = null;
        sm var9 = null;
        wb[] var10 = null;
        wp var11 = null;
        sm var12 = null;
        sm var13 = null;
        sm var14 = null;
        sm var15 = null;
        try {
          if (!(param0 instanceof wp)) {
            stackIn_3_0 = null;
          } else {
            stackIn_3_0 = (pk) (param0);
          }
          var11 = (wp) (stackIn_3_0);
          kw.a(param1 + param0.field_v + param0.field_p, param1 + param0.field_v, 1, param4 + param0.field_r, param0.field_r + (param4 + param0.field_q));
          if (var11 != null) {
            param3 = param3 & var11.field_x;
          }
          var7 = this.field_q[0];
          this.field_t.a(true);
          var7.a(param4, param0, -28, this, param1, this.field_t);
          if (var11 != null) {
            if (var11.field_C) {
              var12 = this.field_q[1];
              if (var12 != null) {
                var12.a(param4, param0, -75, this, param1, this.field_t);
              }
            }
            if (var11.field_k) {
              var13 = this.field_q[3];
              if (var11.field_l != 0 &&
                var13 != null) {
                var13.a(param4, param0, param2 ^ -5592346, this, param1, this.field_t);
              } else {
                var9 = this.field_q[2];
                if (var9 != null) {
                  var9.a(param4, param0, -97, this, param1, this.field_t);
                }
              }
            }
          }
          if (param2 != 5592405) {
            var10 = (wb[]) null;
            this.a((wb[]) null, -110);
          }
          if (param0.d(-1)) {
            var14 = this.field_q[5];
            if (var14 != null) {
              var14.a(param4, param0, param2 ^ -5592417, this, param1, this.field_t);
            }
          }
          if (!param3) {
            var15 = this.field_q[4];
            if (var15 != null) {
              var15.a(param4, param0, -66, this, param1, this.field_t);
            }
          }
          this.field_t.a(param1, this, param4, -66, param0);
          su.a((byte) -70);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_34_0 = var6;
          stackIn_34_1 = new StringBuilder().append("fl.A(");
          if (param0 == null) {
            stackIn_35_2 = "null";
          } else {
            stackIn_35_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_34_0), ((StringBuilder) (Object) stackIn_34_1).append(stackIn_35_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    private final void a(fl param0, boolean param1, int param2) {
        int var4_int = 0;
        sm dupTemp$0 = null;
        sm stackIn_10_0 = null;
        sm stackIn_11_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        sm var5 = null;
        sm var6 = null;
        int var7 = 0;
        var7 = Sumoblitz.field_L ? 1 : 0;
        try {
          super.a(param0, -123);
          if (param2 != -26407) {
            field_p = -38;
          }
          if (param1) {
            for (var4_int = 0; var4_int < 6; var4_int++) {
              var5 = this.field_q[var4_int];
              if (var5 == null) {
                param0.field_q[var4_int] = null;
              } else {
                var6 = param0.field_q[var4_int];
                stackIn_10_0 = var5;
                if (var6 == null) {
                  dupTemp$0 = new sm();
                  param0.field_q[var4_int] = dupTemp$0;
                  stackIn_11_1 = dupTemp$0;
                } else {
                  stackIn_11_1 = var6;
                }
                ((sm) (Object) stackIn_10_0).a(stackIn_11_1, (byte) 94);
              }
            }
            return;
          }
          la.a(this.field_q, 0, param0.field_q, 0, 6);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_17_0 = var4;
          stackIn_17_1 = new StringBuilder().append("fl.C(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    public fl() {
        this.field_q = new sm[6];
        this.field_t = new sm();
        sm dupTemp$0 = new sm();
        this.field_q[0] = dupTemp$0;
        sm var1 = dupTemp$0;
        var1.a(true);
    }

    final void a(wb[] param0, int param1) {
        int var4 = 0;
        sm[] var3 = null;
        sm var5 = null;
        int var6 = 0;
        sm[] var7 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var6 = Sumoblitz.field_L ? 1 : 0;
        try {
          var7 = this.field_q;
          var3 = var7;
          if (param1 != 28715) {
            this.a(false, 37);
          }
          for (var4 = 0; var7.length > var4; var4++) {
            var5 = var7[var4];
            if (var5 != null) {
              var5.field_j = param0;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_11_0 = var3_ref;
          stackIn_11_1 = new StringBuilder().append("fl.F(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(')').toString());
        }
    }

    final void a(int param0, wb param1) {
        int var5 = 0;
        sm[] var3 = null;
        int var4 = 0;
        sm var6 = null;
        int var7 = 0;
        sm[] var8 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var7 = Sumoblitz.field_L ? 1 : 0;
        try {
          var8 = this.field_q;
          var3 = var8;
          var4 = -50 % ((param0 - 68) / 36);
          for (var5 = 0; var5 < var8.length; var5++) {
            var6 = var8[var5];
            if (var6 != null) {
              var6.field_i = param1;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_9_0 = var3_ref;
          stackIn_9_1 = new StringBuilder().append("fl.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final sm a(boolean param0, int param1) {
        if (param0) {
          wb[] var4 = (wb[]) null;
          this.a((byte) -126, (wb[]) null, -97);
        }
        sm dupTemp$0 = new sm();
        this.field_q[param1] = dupTemp$0;
        return dupTemp$0;
    }

    final void a(byte param0, wb[] param1, int param2) {
        int var4_int = 0;
        int var4_intLifetime1;
        try {
          var4_int = param2;
          if (null == this.field_q[var4_int]) {
            this.field_q[var4_int] = new sm();
          }
          this.field_q[param2].field_j = param1;
          var4_intLifetime1 = -9 % ((param0 - 57) / 52);
        } catch (RuntimeException runtimeException) {
          throw qo.a((Throwable) ((Object) runtimeException), "fl.G(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        field_s = "Waiting for extra data";
        field_n = 0;
        field_p = -1;
    }
}
