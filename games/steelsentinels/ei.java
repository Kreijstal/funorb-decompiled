/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ei extends ia {
    private String field_w;
    static String field_u;
    static int field_t;
    static SceneWidget field_n;
    static String field_x;
    static int field_q;
    static SceneWidget field_o;
    static SceneWidget field_p;
    private boolean field_s;
    static String field_v;
    static String field_r;

    ei(jf param0) {
        super(param0);
        this.field_s = false;
    }

    public static void c(int param0) {
        field_n = null;
        if (param0 != 1) {
          ei.a(83, 71, true);
          field_x = null;
          field_v = null;
          field_r = null;
          field_p = null;
          field_u = null;
          field_o = null;
          return;
        }
        field_x = null;
        field_v = null;
        field_r = null;
        field_p = null;
        field_u = null;
        field_o = null;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        int var7 = 0;
        int var5_int = 0;
        int var6 = 0;
        int var8 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var8 = SteelSentinels.obfuscationControl;
        try {
          SoftwareRaster.h(param0, param1, param2, param3, 12105914);
          SoftwareRaster.e(1 + param0, param1 + 1, -2 + param2, param3 - 2, 16251129, 10461345);
          var6 = -126 / ((param4 - 69) / 50);
          var5_int = 64;
          for (var7 = 1; var7 <= 6; var7++) {
            SoftwareRaster.h(var7 + param0, var7 + param1, -(var7 * 2) + param2, -(var7 * 2) + param3, 16251129, var5_int);
            var5_int = var5_int >> 1;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var5), "ei.H(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final String a(int param0, String param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        e var4 = null;
        CharSequence var5 = null;
        String stackIn_3_0 = null;
        Object stackIn_9_0 = null;
        String stackIn_13_0 = null;
        String stackIn_17_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5 = (CharSequence) ((Object) param1);
          var3 = va.a(var5, -1);
          if (var3 != null) {
            stackIn_3_0 = var3;
            return stackIn_3_0;
          }
          if (!param1.equals(this.field_w)) {
            var4 = b.a(false, param1);
            if (var4 == null) {
              return null;
            }
            if (var4.field_e != null) {
              stackIn_9_0 = null;
              return (String) (stackIn_9_0);
            }
            this.field_s = var4.field_d;
            this.field_w = param1;
          }
          if (param0 != 100) {
            stackIn_13_0 = (String) null;
            return stackIn_13_0;
          }
          if (this.field_s) {
            return hf.field_d;
          }
          stackIn_17_0 = fg.field_Qb;
          return stackIn_17_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_20_0 = var3_ref;
          stackIn_20_1 = new StringBuilder().append("ei.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    final vd a(String param0, int param1) {
        e var3 = null;
        RuntimeException var3_ref = null;
        CharSequence var4 = null;
        vd stackIn_3_0 = null;
        vd stackIn_6_0 = null;
        vd stackIn_13_0 = null;
        vd stackIn_18_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = (CharSequence) ((Object) param0);
          if (!m.a(var4, (byte) 127)) {
            stackIn_3_0 = fa.field_d;
            return stackIn_3_0;
          }
          if (param1 != -1) {
            stackIn_6_0 = (vd) null;
            return stackIn_6_0;
          }
          if (!param0.equals(this.field_w)) {
            var3 = b.a(false, param0);
            if (var3 != null &&
              null == var3.field_e) {
              this.field_w = param0;
              this.field_s = var3.field_d;
            } else {
              stackIn_13_0 = ma.field_Y;
              return stackIn_13_0;
            }
          }
          if (!this.field_s) {
            stackIn_18_0 = fa.field_d;
          } else {
            stackIn_18_0 = vf.field_b;
          }
          return stackIn_18_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_21_0 = var3_ref;
          stackIn_21_1 = new StringBuilder().append("ei.B(");
          if (param0 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(int param0, java.applet.Applet param1) {
        try {
          ic.a(-128, "", param1);
          if (param0 != 0) {
            field_r = (String) null;
          }
          pf.a(param1, 63);
        } catch (RuntimeException runtimeException) {
          throw ci.a((Throwable) ((Object) runtimeException), "ei.L(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void d(int param0) {
        if (param0 < 63) {
          return;
        }
        this.field_w = null;
    }

    final static int a(int param0, int param1) {
        int var2 = 0;
        if (param0 == 0) {
          var2 = sg.field_c;
        }
        if (param0 == param1) {
          var2 = pm.field_Z;
        }
        if (param0 == 2) {
          var2 = fi.field_y;
        }
        return var2;
    }

    final static RgbSprite[] a(int param0, RgbSprite[] param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        RgbSprite var3 = null;
        int var4 = 0;
        RgbSprite[] stackIn_5_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = SteelSentinels.obfuscationControl;
        try {
          for (var2_int = param0; param1.length > var2_int; var2_int++) {
            var3 = param1[var2_int];
            param1[var2_int].field_H = 0;
            var3.field_D = 0;
            param1[var2_int].field_z = param1[var2_int].field_A;
            param1[var2_int].field_B = param1[var2_int].field_F;
          }
          stackIn_5_0 = (RgbSprite[]) (param1);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_8_0 = var2;
          stackIn_8_1 = new StringBuilder().append("ei.J(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    final static void a(int param0, byte param1, int param2) {
        CipherPacketBuffer var3 = mm.field_g;
        var3.writeCipheredOpcode(param2, (byte) -117);
        var3.writeByte((byte) 127, 3);
        if (param1 != -23) {
          field_v = (String) null;
          var3.writeByte((byte) 121, 10);
          var3.writeShort(param0, 98);
          return;
        }
        var3.writeByte((byte) 121, 10);
        var3.writeShort(param0, 98);
    }

    final static int a(int param0, int param1, boolean param2) {
        if (null == bc.field_ub) {
          return -1;
        }
        if (!param2) {
          return 54;
        }
        if (aj.field_s > param1) {
          if (rn.field_u > param1) {
            return -1;
          }
          if (param1 >= rn.field_u + bc.field_ub.field_A) {
            return -1;
          }
          if (od.field_m <= param0) {
            if (bc.field_ub.field_F + od.field_m <= param0) {
              return -1;
            }
            return 1;
          }
          return -1;
        }
        if (aj.field_s + bc.field_ub.field_A <= param1) {
          if (rn.field_u <= param1 &&
            param1 < rn.field_u + bc.field_ub.field_A &&
            od.field_m <= param0) {
            if (bc.field_ub.field_F + od.field_m <= param0) {
              return -1;
            }
            return 1;
          }
          return -1;
        }
        if (mc.field_a <= param0 &&
          mc.field_a + bc.field_ub.field_F > param0) {
          return 0;
        }
        if (rn.field_u <= param1 &&
          param1 < rn.field_u + bc.field_ub.field_A &&
          od.field_m <= param0) {
          if (bc.field_ub.field_F + od.field_m <= param0) {
            return -1;
          }
          return 1;
        }
        return -1;
    }

    static {
        field_u = "Quick Chat lobby";
        field_x = "Invite only";
        field_t = 2;
        field_v = "Please select options in the following rows:  ";
        field_r = "Remove <%0> from friend list";
    }
}
