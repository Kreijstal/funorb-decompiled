/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gi extends ic {
    private qi[] field_s;
    static int field_r;
    private qi field_p;
    static aa field_q;
    static int field_o;

    final qi a(byte param0, int param1) {
        if (param0 != 118) {
          field_o = -123;
        }
        qi dupTemp$0 = new qi();
        this.field_s[param1] = dupTemp$0;
        return dupTemp$0;
    }

    private final void a(boolean param0, gi param1, int param2) {
        int var4_int = 0;
        qi dupTemp$0 = null;
        qi stackIn_9_0 = null;
        boolean stackIn_9_1 = false;
        qi stackIn_10_2 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        qi var5 = null;
        qi var6 = null;
        int var7 = 0;
        var7 = TrackController.field_F ? 1 : 0;
        try {
          super.a(-19397, param1);
          if (param2 != 11) {
            this.field_s = (qi[]) null;
          }
          if (param0) {
            for (var4_int = 0; 6 > var4_int; var4_int++) {
              var5 = this.field_s[var4_int];
              if (var5 == null) {
                param1.field_s[var4_int] = null;
              } else {
                var6 = param1.field_s[var4_int];
                stackIn_9_0 = var5;
                stackIn_9_1 = false;
                if (var6 == null) {
                  dupTemp$0 = new qi();
                  param1.field_s[var4_int] = dupTemp$0;
                  stackIn_10_2 = dupTemp$0;
                } else {
                  stackIn_10_2 = var6;
                }
                ((qi) (Object) stackIn_9_0).a(stackIn_9_1, stackIn_10_2);
              }
            }
            return;
          }
          pd.a(this.field_s, 0, param1.field_s, 0, 6);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_17_0 = var4;
          stackIn_17_1 = new StringBuilder().append("gi.P(").append(param0).append(',');
          if (param1 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw sl.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param2).append(')').toString());
        }
    }

    gi(gi param0, boolean param1) {
        this();
        try {
          param0.a(param1, this, 11);
        } catch (RuntimeException runtimeException) {
          throw sl.a((Throwable) ((Object) runtimeException), "gi.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(qj param0, int param1) {
        int var4 = 0;
        qi[] var3 = null;
        qi var5 = null;
        int var6 = 0;
        qi[] var7 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var6 = TrackController.field_F ? 1 : 0;
        try {
          var7 = this.field_s;
          var3 = var7;
          for (var4 = 0; var7.length > var4; var4++) {
            var5 = var7[var4];
            if (var5 != null) {
              var5.field_g = param0;
            }
          }
          if (param1 >= -109) {
            field_o = 45;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_12_0 = var3_ref;
          stackIn_12_1 = new StringBuilder().append("gi.N(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw sl.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(')').toString());
        }
    }

    final void a(int param0, qj[] param1) {
        int var4 = 0;
        qi[] var3 = null;
        qi var5 = null;
        int var6 = 0;
        qi[] var7 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var6 = TrackController.field_F ? 1 : 0;
        try {
          var7 = this.field_s;
          var3 = var7;
          if (param0 > -45) {
            return;
          }
          for (var4 = 0; var4 < var7.length; var4++) {
            var5 = var7[var4];
            if (var5 != null) {
              var5.field_i = param1;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_12_0 = var3_ref;
          stackIn_12_1 = new StringBuilder().append("gi.O(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw sl.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    public final void a(int param0, al param1, int param2, boolean param3, int param4) {
        al stackIn_3_0 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        qi var7 = null;
        qi var9 = null;
        rh var10 = null;
        qi var11 = null;
        qi var12 = null;
        qi var13 = null;
        qi var14 = null;
        try {
          if (!(param1 instanceof rh)) {
            stackIn_3_0 = null;
          } else {
            stackIn_3_0 = (al) (param1);
          }
          var10 = (rh) (stackIn_3_0);
          mb.a(param4 + param1.field_p, param1.field_m + param2, param2 + param1.field_m + param1.field_u, (byte) -41, param1.field_p + (param4 + param1.field_x));
          if (var10 != null) {
            param3 = param3 & var10.field_B;
          }
          var7 = this.field_s[0];
          this.field_p.a((byte) 76);
          if (param0 != -24969) {
            gi.c((byte) -116);
          }
          var7.a(this, param2, param1, -1, this.field_p, param4);
          if (var10 != null) {
            if (var10.field_G) {
              var11 = this.field_s[1];
              if (var11 != null) {
                var11.a(this, param2, param1, -1, this.field_p, param4);
              }
            }
            if (var10.field_q) {
              var12 = this.field_s[3];
              if (var10.field_r != 0 &&
                var12 != null) {
                var12.a(this, param2, param1, param0 ^ 24968, this.field_p, param4);
              } else {
                var9 = this.field_s[2];
                if (var9 != null) {
                  var9.a(this, param2, param1, -1, this.field_p, param4);
                }
              }
            }
          }
          if (param1.h(-115)) {
            var13 = this.field_s[5];
            if (var13 != null) {
              var13.a(this, param2, param1, param0 ^ 24968, this.field_p, param4);
            }
          }
          if (!param3) {
            var14 = this.field_s[4];
            if (var14 != null) {
              var14.a(this, param2, param1, param0 + 24968, this.field_p, param4);
            }
          }
          this.field_p.a(param4, param2, param1, -16711924, this);
          ch.m(35);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_31_0 = var6;
          stackIn_31_1 = new StringBuilder().append("gi.L(").append(param0).append(',');
          if (param1 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          throw sl.a((Throwable) ((Object) stackIn_31_0), ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final void a(int param0, qj[] param1, byte param2) {
        int var4_int = 0;
        try {
          var4_int = param0;
          if (param2 != -33) {
            al var5 = (al) null;
            this.a(111, (al) null, -5, true, -65);
          }
          if (null == this.field_s[var4_int]) {
            this.field_s[var4_int] = new qi();
          }
          this.field_s[param0].field_i = param1;
        } catch (RuntimeException runtimeException) {
          throw sl.a((Throwable) ((Object) runtimeException), "gi.Q(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    public gi() {
        this.field_s = new qi[6];
        this.field_p = new qi();
        qi dupTemp$0 = new qi();
        this.field_s[0] = dupTemp$0;
        qi var1 = dupTemp$0;
        var1.a((byte) 127);
    }

    public static void c(byte param0) {
        field_q = null;
        if (param0 >= -107) {
          gi.c((byte) 60);
        }
    }

    static {
        field_q = new aa(11, 0, 1, 2);
    }
}
