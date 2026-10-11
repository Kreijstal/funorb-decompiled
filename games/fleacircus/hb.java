/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hb extends e {
    private te[] field_s;
    static int field_t;
    static String field_q;
    private te field_r;

    private final void a(boolean param0, hb param1, byte param2) {
        int var4_int = 0;
        te dupTemp$0 = null;
        te stackIn_10_0 = null;
        te stackIn_11_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        te var5 = null;
        te var6 = null;
        int var7 = 0;
        var7 = fleas.field_A ? 1 : 0;
        try {
          super.a(2, param1);
          if (param2 != 70) {
            return;
          }
          if (param0) {
            for (var4_int = 0; 6 > var4_int; var4_int++) {
              var5 = this.field_s[var4_int];
              if (var5 == null) {
                param1.field_s[var4_int] = null;
              } else {
                var6 = param1.field_s[var4_int];
                stackIn_10_0 = var5;
                if (var6 == null) {
                  dupTemp$0 = new te();
                  param1.field_s[var4_int] = dupTemp$0;
                  stackIn_11_1 = dupTemp$0;
                } else {
                  stackIn_11_1 = var6;
                }
                ((te) (Object) stackIn_10_0).a(stackIn_11_1, 33);
              }
            }
            return;
          }
          dm.a(this.field_s, 0, param1.field_s, 0, 6);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_17_0 = var4;
          stackIn_17_1 = new StringBuilder().append("hb.O(").append(param0).append(',');
          if (param1 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw pf.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param2).append(')').toString());
        }
    }

    public final void a(int param0, int param1, boolean param2, qa param3, int param4) {
        qa stackIn_3_0 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        te var7 = null;
        te var9 = null;
        bb var10 = null;
        te var11 = null;
        te var12 = null;
        te var13 = null;
        te var14 = null;
        try {
          if (param3 instanceof bb) {
            stackIn_3_0 = (qa) (param3);
          } else {
            stackIn_3_0 = null;
          }
          var10 = (bb) (stackIn_3_0);
          mi.a((byte) -52, param1 + (param3.field_y + param3.field_u), param3.field_y + param1, param4 + (param3.field_z + param3.field_j), param4 + param3.field_z);
          if (var10 != null) {
            param2 = param2 & var10.field_D;
          }
          if (param0 > -36) {
            this.a(3, 55);
          }
          var7 = this.field_s[0];
          this.field_r.a(0);
          var7.a(this.field_r, param4, param3, this, param1, -2);
          if (var10 != null) {
            if (var10.field_G) {
              var11 = this.field_s[1];
              if (var11 != null) {
                var11.a(this.field_r, param4, param3, this, param1, -2);
              }
            }
            if (var10.field_x) {
              var12 = this.field_s[3];
              if (0 != var10.field_v &&
                var12 != null) {
                var12.a(this.field_r, param4, param3, this, param1, -2);
              } else {
                var9 = this.field_s[2];
                if (var9 != null) {
                  var9.a(this.field_r, param4, param3, this, param1, -2);
                }
              }
            }
          }
          if (param3.e(1)) {
            var13 = this.field_s[5];
            if (var13 != null) {
              var13.a(this.field_r, param4, param3, this, param1, -2);
            }
          }
          if (!param2) {
            var14 = this.field_s[4];
            if (var14 != null) {
              var14.a(this.field_r, param4, param3, this, param1, -2);
            }
          }
          this.field_r.a(this, param3, 0, param4, param1);
          ia.a(-85);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_33_0 = var6;
          stackIn_33_1 = new StringBuilder().append("hb.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          throw pf.a((Throwable) ((Object) stackIn_33_0), ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(',').append(param4).append(')').toString());
        }
    }

    final void a(dd[] param0, int param1, int param2) {
        int var4_int = 0;
        try {
          if (param1 > -27) {
            field_t = -122;
          }
          var4_int = param2;
          if (this.field_s[var4_int] == null) {
            this.field_s[var4_int] = new te();
          }
          this.field_s[param2].field_g = param0;
        } catch (RuntimeException runtimeException) {
          throw pf.a((Throwable) ((Object) runtimeException), "hb.M(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    public hb() {
        this.field_s = new te[6];
        this.field_r = new te();
        te dupTemp$0 = new te();
        this.field_s[0] = dupTemp$0;
        te var1 = dupTemp$0;
        var1.a(0);
    }

    final te a(int param0, int param1) {
        if (param1 != -17562) {
          return (te) null;
        }
        te dupTemp$0 = new te();
        this.field_s[param0] = dupTemp$0;
        return dupTemp$0;
    }

    hb(hb param0, boolean param1) {
        this();
        try {
          param0.a(param1, this, (byte) 70);
        } catch (RuntimeException runtimeException) {
          throw pf.a((Throwable) ((Object) runtimeException), "hb.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(dd param0, int param1) {
        int var4 = 0;
        te[] var3 = null;
        te var5 = null;
        int var6 = 0;
        te[] var7 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var6 = fleas.field_A ? 1 : 0;
        try {
          var7 = this.field_s;
          var3 = var7;
          for (var4 = param1; var4 < var7.length; var4++) {
            var5 = var7[var4];
            if (var5 != null) {
              var5.field_c = param0;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_9_0 = var3_ref;
          stackIn_9_1 = new StringBuilder().append("hb.P(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw pf.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void c(byte param0) {
        field_q = null;
        int var1 = -65 / ((param0 + 36) / 56);
    }

    final void a(byte param0, dd[] param1) {
        int var4 = 0;
        te[] var3 = null;
        te var5 = null;
        int var6 = 0;
        te[] var7 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var6 = fleas.field_A ? 1 : 0;
        try {
          var7 = this.field_s;
          var3 = var7;
          for (var4 = 0; var4 < var7.length; var4++) {
            var5 = var7[var4];
            if (var5 != null) {
              var5.field_g = param1;
            }
          }
          if (param0 != 61) {
            this.a(77, -61);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_12_0 = var3_ref;
          stackIn_12_1 = new StringBuilder().append("hb.L(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw pf.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    static {
        field_q = "From only <%0>/month";
    }
}
