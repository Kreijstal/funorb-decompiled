/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class se extends pc {
    private v field_r;
    private v[] field_q;

    final static byte[] a(byte param0, String param1) {
        RuntimeException var2 = null;
        byte[] stackIn_2_0 = null;
        byte[] stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == -33) {
            stackIn_4_0 = fm.field_F.a(-115, param1, "");
            return stackIn_4_0;
          }
          stackIn_2_0 = (byte[]) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("se.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    public se() {
        this.field_q = new v[6];
        this.field_r = new v();
        v dupTemp$0 = new v();
        this.field_q[0] = dupTemp$0;
        v var1 = dupTemp$0;
        var1.b((byte) -99);
    }

    final void a(int param0, t[] param1) {
        int var4 = 0;
        v[] var3 = null;
        v var5 = null;
        int var6 = 0;
        v[] var7 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var6 = Torquing.field_u;
        try {
          var7 = this.field_q;
          var3 = var7;
          for (var4 = param0; var4 < var7.length; var4++) {
            var5 = var7[var4];
            if (var5 != null) {
              var5.field_g = param1;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_10_0 = var3_ref;
          stackIn_10_1 = new StringBuilder().append("se.P(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final void a(t[] param0, int param1, byte param2) {
        int var4_int = 0;
        try {
          var4_int = param1;
          if (null == this.field_q[var4_int]) {
            this.field_q[var4_int] = new v();
          }
          if (param2 < 82) {
            gm var5 = (gm) null;
            this.a(27, 50, 123, true, (gm) null);
          }
          this.field_q[param1].field_g = param0;
        } catch (RuntimeException runtimeException) {
          throw rb.a((Throwable) ((Object) runtimeException), "se.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    public final void a(int param0, int param1, int param2, boolean param3, gm param4) {
        gm stackIn_3_0 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        v var7 = null;
        v var9 = null;
        t var10 = null;
        lg var11 = null;
        v var12 = null;
        v var13 = null;
        v var14 = null;
        v var15 = null;
        try {
          if (!(param4 instanceof lg)) {
            stackIn_3_0 = null;
          } else {
            stackIn_3_0 = (gm) (param4);
          }
          var11 = (lg) (stackIn_3_0);
          ld.a(param4.field_p + (param4.field_w + param2), param4.field_w + param2, param1 - (-param4.field_k - param4.field_o), param4.field_k + param1, (byte) -108);
          if (param0 < 89) {
            var10 = (t) null;
            this.a((byte) 52, (t) null);
          }
          if (var11 != null) {
            param3 = param3 & var11.field_x;
          }
          var7 = this.field_q[0];
          this.field_r.b((byte) -88);
          var7.a(param1, (byte) 115, param4, this.field_r, param2, this);
          if (var11 != null) {
            if (var11.field_A) {
              var12 = this.field_q[1];
              if (var12 != null) {
                var12.a(param1, (byte) 115, param4, this.field_r, param2, this);
              }
            }
            if (var11.field_s) {
              var13 = this.field_q[3];
              if (0 != var11.field_l &&
                var13 != null) {
                var13.a(param1, (byte) 115, param4, this.field_r, param2, this);
              } else {
                var9 = this.field_q[2];
                if (var9 != null) {
                  var9.a(param1, (byte) 115, param4, this.field_r, param2, this);
                }
              }
            }
          }
          if (param4.g(2)) {
            var14 = this.field_q[5];
            if (var14 != null) {
              var14.a(param1, (byte) 115, param4, this.field_r, param2, this);
            }
          }
          if (!param3) {
            var15 = this.field_q[4];
            if (var15 != null) {
              var15.a(param1, (byte) 115, param4, this.field_r, param2, this);
            }
          }
          this.field_r.a(param1, this, param4, param2, (byte) 113);
          r.a(122);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_32_0 = var6;
          stackIn_32_1 = new StringBuilder().append("se.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_32_0), ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(')').toString());
        }
    }

    final void a(byte param0, t param1) {
        int var4 = 0;
        v[] var3 = null;
        v var5 = null;
        int var6 = 0;
        String var7 = null;
        v[] var8 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var6 = Torquing.field_u;
        try {
          var8 = this.field_q;
          var3 = var8;
          if (param0 != -57) {
            var7 = (String) null;
            se.a((byte) -119, (String) null);
          }
          for (var4 = 0; var4 < var8.length; var4++) {
            var5 = var8[var4];
            if (var5 != null) {
              var5.field_f = param1;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_11_0 = var3_ref;
          stackIn_11_1 = new StringBuilder().append("se.Q(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    se(se param0, boolean param1) {
        this();
        try {
          param0.a(this, 6, param1);
        } catch (RuntimeException runtimeException) {
          throw rb.a((Throwable) ((Object) runtimeException), "se.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    private final void a(se param0, int param1, boolean param2) {
        int var4_int = 0;
        v dupTemp$0 = null;
        v stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        v stackIn_11_2 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        v var5 = null;
        v var6 = null;
        int var7 = 0;
        var7 = Torquing.field_u;
        try {
          super.a(90, param0);
          if (param1 != 6) {
            this.a(57, -12);
          }
          if (param2) {
            for (var4_int = 0; 6 > var4_int; var4_int++) {
              var5 = this.field_q[var4_int];
              if (var5 != null) {
                var6 = param0.field_q[var4_int];
                stackIn_10_0 = var5;
                stackIn_10_1 = -85;
                if (var6 == null) {
                  dupTemp$0 = new v();
                  param0.field_q[var4_int] = dupTemp$0;
                  stackIn_11_2 = dupTemp$0;
                } else {
                  stackIn_11_2 = var6;
                }
                ((v) (Object) stackIn_10_0).a((byte) stackIn_10_1, stackIn_11_2);
              } else {
                param0.field_q[var4_int] = null;
              }
            }
            return;
          }
          dk.a(this.field_q, 0, param0.field_q, 0, 6);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_17_0 = var4;
          stackIn_17_1 = new StringBuilder().append("se.D(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final v a(int param0, int param1) {
        if (param1 != 4) {
          se var4 = (se) null;
          this.a((se) null, 7, true);
        }
        v dupTemp$0 = new v();
        this.field_q[param0] = dupTemp$0;
        return dupTemp$0;
    }

    static {
    }
}
