/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ch extends l {
    static int field_y;
    private kj[] field_v;
    static String field_t;
    static String field_u;
    static int field_B;
    private kj field_x;
    static nh[] field_z;
    static String field_w;
    static int field_A;

    public static void b(byte param0) {
        field_z = null;
        field_u = null;
        field_w = null;
        if (param0 <= 69) {
          field_t = (String) null;
        }
        field_t = null;
    }

    final void a(int param0, nh[] param1) {
        int var4 = 0;
        kj[] var3 = null;
        kj var5 = null;
        int var6 = 0;
        kj[] var7 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var6 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          var7 = this.field_v;
          var3 = var7;
          for (var4 = param0; var4 < var7.length; var4++) {
            var5 = var7[var4];
            if (var5 != null) {
              var5.field_c = param1;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_9_0 = var3_ref;
          stackIn_9_1 = new StringBuilder().append("ch.V(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final static void c(int param0) {
        sh.field_e = false;
        wg.field_h = null;
        if (param0 != 3) {
          field_B = 33;
        }
        ga.field_i = null;
        ng.field_d = null;
        lk.field_i = null;
    }

    public ch() {
        this.field_v = new kj[6];
        this.field_x = new kj();
        kj dupTemp$0 = new kj();
        this.field_v[0] = dupTemp$0;
        kj var1 = dupTemp$0;
        var1.b(0);
    }

    final void a(nh[] param0, int param1, int param2) {
        int var4_int = 0;
        try {
          var4_int = param1;
          if (this.field_v[var4_int] == null) {
            this.field_v[var4_int] = new kj();
          }
          if (param2 < 116) {
            field_t = (String) null;
          }
          this.field_v[param1].field_c = param0;
        } catch (RuntimeException runtimeException) {
          throw ie.a((Throwable) ((Object) runtimeException), "ch.BA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    ch(ch param0, boolean param1) {
        this();
        try {
          param0.a(this, param1, 28905);
        } catch (RuntimeException runtimeException) {
          throw ie.a((Throwable) ((Object) runtimeException), "ch.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final kj a(byte param0, int param1) {
        if (param0 <= 54) {
          this.field_v = (kj[]) null;
        }
        kj dupTemp$0 = new kj();
        this.field_v[param1] = dupTemp$0;
        return dupTemp$0;
    }

    final void a(int param0, nh param1) {
        int var4 = 0;
        kj[] var3 = null;
        kj var5 = null;
        int var6 = 0;
        ch var7 = null;
        kj[] var8 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var6 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          var8 = this.field_v;
          var3 = var8;
          if (param0 != -32680) {
            var7 = (ch) null;
            this.a((ch) null, false, 11);
          }
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
          stackIn_12_1 = new StringBuilder().append("ch.CA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    public final void a(boolean param0, int param1, vg param2, int param3, int param4) {
        vg stackIn_3_0 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        kj var7 = null;
        kj var9 = null;
        nh[] var10 = null;
        hf var11 = null;
        kj var12 = null;
        kj var13 = null;
        kj var14 = null;
        kj var15 = null;
        try {
          if (param2 instanceof hf) {
            stackIn_3_0 = (vg) (param2);
          } else {
            stackIn_3_0 = null;
          }
          var11 = (hf) (stackIn_3_0);
          ib.a(param3 + param2.field_m, param2.field_m + (param3 + param2.field_k), (byte) 16, param4 + param2.field_o + param2.field_w, param4 + param2.field_o);
          if (var11 != null) {
            param0 = param0 & var11.field_E;
          }
          var7 = this.field_v[0];
          this.field_x.b(0);
          var7.a(param4, this, true, param3, param2, this.field_x);
          if (var11 != null) {
            if (var11.field_A) {
              var12 = this.field_v[1];
              if (var12 != null) {
                var12.a(param4, this, true, param3, param2, this.field_x);
              }
            }
            if (var11.field_n) {
              var13 = this.field_v[3];
              if (var11.field_y != 0 &&
                var13 != null) {
                var13.a(param4, this, true, param3, param2, this.field_x);
              } else {
                var9 = this.field_v[2];
                if (var9 != null) {
                  var9.a(param4, this, true, param3, param2, this.field_x);
                }
              }
            }
          }
          if (param2.a(true)) {
            var14 = this.field_v[5];
            if (var14 != null) {
              var14.a(param4, this, true, param3, param2, this.field_x);
            }
          }
          if (!param0) {
            var15 = this.field_v[4];
            if (var15 != null) {
              var15.a(param4, this, true, param3, param2, this.field_x);
            }
          }
          this.field_x.a(this, param2, true, param3, param4);
          if (param1 <= 94) {
            var10 = (nh[]) null;
            this.a((nh[]) null, -43, 125);
          }
          cl.d((byte) -110);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_31_0 = var6;
          stackIn_31_1 = new StringBuilder().append("ch.J(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_31_0), ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    private final void a(ch param0, boolean param1, int param2) {
        int var4_int = 0;
        kj dupTemp$0 = null;
        kj stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        kj stackIn_10_2 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        kj var5 = null;
        kj var6 = null;
        int var7 = 0;
        var7 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          super.a(param0, 117);
          if (param2 != 28905) {
            return;
          }
          if (param1) {
            for (var4_int = 0; var4_int < 6; var4_int++) {
              var5 = this.field_v[var4_int];
              if (var5 == null) {
                param0.field_v[var4_int] = null;
              } else {
                var6 = param0.field_v[var4_int];
                stackIn_9_0 = var5;
                stackIn_9_1 = -7;
                if (var6 == null) {
                  dupTemp$0 = new kj();
                  param0.field_v[var4_int] = dupTemp$0;
                  stackIn_10_2 = dupTemp$0;
                } else {
                  stackIn_10_2 = var6;
                }
                ((kj) (Object) stackIn_9_0).a((byte) stackIn_9_1, stackIn_10_2);
              }
            }
            return;
          }
          kg.a(this.field_v, 0, param0.field_v, 0, 6);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_17_0 = var4;
          stackIn_17_1 = new StringBuilder().append("ch.DA(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    static {
        field_t = "Suggested names: ";
        field_u = "Type your password again to make sure it's correct";
        field_w = "Select weapon";
    }
}
