/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wd extends gha {
    private tc[] field_u;
    private tc field_y;
    static int[] field_x;
    static eaa field_t;
    static sna field_v;
    static kv[] field_w;

    wd(wd param0, boolean param1) {
        this();
        try {
          param0.a(this, (byte) 110, param1);
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "wd.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(int param0, int param1, kv[] param2) {
        int var4_int = 0;
        try {
          var4_int = param0;
          if (param1 <= 62) {
            field_t = (eaa) null;
          }
          if (null == this.field_u[var4_int]) {
            this.field_u[var4_int] = new tc();
          }
          this.field_u[param0].field_c = param2;
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "wd.GA(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    public final void a(int param0, wj param1, int param2, int param3, boolean param4) {
        wj stackIn_3_0 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        tc var7 = null;
        tc var9 = null;
        hf var10 = null;
        tc var11 = null;
        tc var12 = null;
        tc var13 = null;
        tc var14 = null;
        try {
          if (!(param1 instanceof hf)) {
            stackIn_3_0 = null;
          } else {
            stackIn_3_0 = (wj) (param1);
          }
          var10 = (hf) (stackIn_3_0);
          ah.a(param0 + param1.field_s + param1.field_p, (byte) 110, param3 + param1.field_v, param0 + param1.field_s, param1.field_q + param3 + param1.field_v);
          if (var10 != null) {
            param4 = param4 & var10.field_z;
          }
          var7 = this.field_u[0];
          if (param2 != 32679) {
            return;
          }
          this.field_y.a(11);
          var7.a(this, param0, param1, (byte) -105, this.field_y, param3);
          if (var10 != null) {
            if (var10.field_B) {
              var11 = this.field_u[1];
              if (var11 != null) {
                var11.a(this, param0, param1, (byte) -58, this.field_y, param3);
              }
            }
            if (var10.field_t) {
              var12 = this.field_u[3];
              if (var10.field_u != 0 &&
                var12 != null) {
                var12.a(this, param0, param1, (byte) -60, this.field_y, param3);
              } else {
                var9 = this.field_u[2];
                if (var9 != null) {
                  var9.a(this, param0, param1, (byte) -58, this.field_y, param3);
                }
              }
            }
          }
          if (param1.e(1023)) {
            var13 = this.field_u[5];
            if (var13 != null) {
              var13.a(this, param0, param1, (byte) -124, this.field_y, param3);
            }
          }
          if (!param4) {
            var14 = this.field_u[4];
            if (var14 != null) {
              var14.a(this, param0, param1, (byte) 74, this.field_y, param3);
            }
          }
          this.field_y.a(param3, this, param1, param2 - 32752, param0);
          db.b(83);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_30_0 = var6;
          stackIn_30_1 = new StringBuilder().append("wd.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_30_0), ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final tc a(int param0, byte param1) {
        if (param1 != 78) {
          java.awt.Canvas var4 = (java.awt.Canvas) null;
          wd.a((byte) -9, (java.awt.Canvas) null);
        }
        tc dupTemp$0 = new tc();
        this.field_u[param0] = dupTemp$0;
        return dupTemp$0;
    }

    public static void c(int param0) {
        field_w = null;
        field_x = null;
        field_v = null;
        field_t = null;
        if (param0 != 1) {
          java.math.BigInteger var2 = (java.math.BigInteger) null;
          wd.a((java.math.BigInteger) null, (byte) 93, (lu) null, (lu) null, (java.math.BigInteger) null);
        }
    }

    private final void a(wd param0, byte param1, boolean param2) {
        int var5 = 0;
        tc dupTemp$0 = null;
        tc stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        tc stackIn_8_2 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        tc var6 = null;
        tc var7 = null;
        int var8 = 0;
        var8 = BachelorFridge.field_y;
        try {
          var4_int = 99 / ((param1 - 76) / 34);
          super.a(-85, param0);
          if (param2) {
            for (var5 = 0; var5 < 6; var5++) {
              var6 = this.field_u[var5];
              if (var6 == null) {
                param0.field_u[var5] = null;
              } else {
                var7 = param0.field_u[var5];
                stackIn_7_0 = var6;
                stackIn_7_1 = 8;
                if (var7 == null) {
                  dupTemp$0 = new tc();
                  param0.field_u[var5] = dupTemp$0;
                  stackIn_8_2 = dupTemp$0;
                } else {
                  stackIn_8_2 = var7;
                }
                ((tc) (Object) stackIn_7_0).a(stackIn_7_1, stackIn_8_2);
              }
            }
            return;
          }
          bl.a(this.field_u, 0, param0.field_u, 0, 6);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_15_0 = var4;
          stackIn_15_1 = new StringBuilder().append("wd.DA(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final void a(kv param0, int param1) {
        int var4 = 0;
        tc[] var3 = null;
        tc var5 = null;
        int var6 = 0;
        tc[] var7 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var6 = BachelorFridge.field_y;
        try {
          if (param1 >= -73) {
            field_t = (eaa) null;
          }
          var7 = this.field_u;
          var3 = var7;
          for (var4 = 0; var4 < var7.length; var4++) {
            var5 = var7[var4];
            if (var5 != null) {
              var5.field_g = param0;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_12_0 = var3_ref;
          stackIn_12_1 = new StringBuilder().append("wd.D(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(')').toString());
        }
    }

    public wd() {
        this.field_u = new tc[6];
        this.field_y = new tc();
        tc dupTemp$0 = new tc();
        this.field_u[0] = dupTemp$0;
        tc var1 = dupTemp$0;
        var1.a(11);
    }

    final static void a(java.math.BigInteger param0, byte param1, lu param2, lu param3, java.math.BigInteger param4) {
        try {
          fn.a((byte) -68, 0, param0, param4, param2, param3.field_h, param3.field_g);
          if (param1 >= -50) {
            wd.c(36);
          }
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "wd.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(byte param0, kv[] param1) {
        int var4 = 0;
        tc[] var3 = null;
        tc var5 = null;
        int var6 = 0;
        java.awt.Canvas var7 = null;
        tc[] var8 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var6 = BachelorFridge.field_y;
        try {
          var8 = this.field_u;
          var3 = var8;
          for (var4 = 0; var4 < var8.length; var4++) {
            var5 = var8[var4];
            if (var5 != null) {
              var5.field_c = param1;
            }
          }
          if (param0 != 95) {
            var7 = (java.awt.Canvas) null;
            wd.a((byte) -81, (java.awt.Canvas) null);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_11_0 = var3_ref;
          stackIn_11_1 = new StringBuilder().append("wd.CA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    final static void a(byte param0, java.awt.Canvas param1) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          hl.a((byte) -67, (java.awt.Component) ((Object) param1));
          gda.a(-99, (java.awt.Component) ((Object) param1));
          if (param0 != 70) {
            field_w = (kv[]) null;
          }
          if (sd.field_c != null) {
            sd.field_c.a((java.awt.Component) ((Object) param1), true);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_8_0 = var2;
          stackIn_8_1 = new StringBuilder().append("wd.FA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    static {
        field_x = new int[128];
        field_t = new eaa();
    }
}
