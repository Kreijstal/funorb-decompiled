/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class da {
    static String field_c;
    static boolean field_d;
    il[] field_h;
    static RgbSprite[] field_e;
    static String field_a;
    static vi field_b;
    static RgbSprite field_f;
    static String field_i;
    static int field_g;

    final static boolean a(ResourceArchive param0, ResourceArchive param1, int param2, ResourceArchive param3) {
        RuntimeException var4 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0.ensureIndex(true) &&
            param0.a("commonui", (byte) 90)) {
            if (param3.ensureIndex(true) &&
              param3.a("commonui", (byte) 90)) {
              if (param1.ensureIndex(true) &&
                param1.a("button.gif", (byte) 90)) {
                if (param2 == -1) {
                  return true;
                }
                return false;
              }
              return false;
            }
            return false;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_22_0 = var4;
          stackIn_22_1 = new StringBuilder().append("da.K(");
          if (param0 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          stackIn_25_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',');
          if (param1 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          stackIn_28_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(')').toString());
        }
    }

    final int a(int param0, int param1, int param2) {
        int var5 = 0;
        int var4;
        il var6;
        int var7;
        int var8;
        var8 = SteelSentinels.obfuscationControl;
        if (null != this.field_h &&
          0 != this.field_h.length &&
          param2 >= this.field_h[0].field_h) {
          if (this.field_h[-1 + this.field_h.length].field_a < param2) {
            return -1;
          }
          if (1 == this.field_h.length) {
            return this.field_h[0].a((byte) 105, param1);
          }
          var4 = param0;
          for (var5 = 0; var5 < this.field_h.length; var5++) {
            var6 = this.field_h[var5];
            if (var6.field_h <= param2 &&
              var6.field_a >= param2) {
              var7 = var6.a((byte) 125, param1);
              if (var7 == -1) {
                return -1;
              }
              return var7 + var4;
            }
            var4 = var4 + (-1 + var6.field_f.length);
          }
          return -1;
        }
        return -1;
    }

    final static void a(ResourceArchive param0, int param1, int param2, wg param3) {
        try {
          if (param1 <= 67) {
            da.a(true, -102);
          }
          vc.field_c = param2 * sj.a((byte) -108) / 1000;
          Sprite.a(param0, 1728986241);
          nl.a((byte) 90, param0);
          ah.a(77, param0);
          lk.a(true);
          CombatWorld.a(true);
          vn.field_h = 0 - vc.field_c;
        } catch (RuntimeException runtimeException) {
          throw ci.a((Throwable) ((Object) runtimeException), "da.I(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final int b(byte param0) {
        int var4 = 0;
        int var2;
        il[] var3;
        il var5;
        int var7;
        int var6;
        var7 = SteelSentinels.obfuscationControl;
        if (param0 != -100) {
          field_g = -5;
        }
        var2 = -1;
        if (null != this.field_h) {
          var3 = this.field_h;
          for (var4 = 0; var3.length > var4; var4++) {
            var5 = var3[var4];
            if (var5 != null) {
              var6 = var5.b(-1);
              if (var2 < var6) {
                var2 = var6;
              }
            }
          }
        }
        return var2;
    }

    final static ah a(String param0, byte param1) {
        String var2 = null;
        ah var3 = null;
        String var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        Object stackIn_3_0 = null;
        ah stackIn_9_0 = null;
        ah stackIn_17_0 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var5 = SteelSentinels.obfuscationControl;
        try {
          if (null == db.field_h) {
            stackIn_3_0 = null;
            return (ah) (stackIn_3_0);
          }
          var6 = (CharSequence) ((Object) param0);
          var2 = ui.a(param1 ^ -42, var6);
          if (var2 == null) {
            var2 = param0;
          }
          if (param1 != -41) {
            stackIn_9_0 = (ah) null;
            return stackIn_9_0;
          }
          var3 = (ah) (db.field_h.a((long)var2.hashCode(), (byte) -81));
          while (true) {
            if (var3 == null) {
              return null;
            }
            var7 = (CharSequence) ((Object) var3.field_dc);
            var4 = ui.a(1, var7);
            if (var4 == null) {
              var4 = var3.field_dc;
            }
            if (!var4.equals(var2)) {
              var3 = (ah) (db.field_h.c((byte) 116));
              continue;
            }
            break;
          }
          stackIn_17_0 = var3;
          return stackIn_17_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_22_0 = var2_ref;
          stackIn_22_1 = new StringBuilder().append("da.D(");
          if (param0 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param1).append(')').toString());
        }
    }

    final int b(int param0, int param1) {
        int var3 = 0;
        il var4 = null;
        int var5 = SteelSentinels.obfuscationControl;
        if (param0 != -1) {
          ResourceArchive var6 = (ResourceArchive) null;
          da.a((ResourceArchive) null, (ResourceArchive) null, -88, (ResourceArchive) null);
        }
        for (var3 = 0; var3 < this.field_h.length; var3++) {
          var4 = this.field_h[var3];
          if (!(var4.field_f.length <= param1)) {
            return var3;
          }
          param1 = param1 - (-1 + var4.field_f.length);
        }
        return this.field_h.length;
    }

    final int a(byte param0) {
        int stackIn_7_0 = 0;
        if (param0 != 24) {
          this.a(114, 23, 65);
        }
        if (this.field_h != null &&
          this.field_h.length > 0) {
          stackIn_7_0 = this.field_h[this.field_h.length - 1].field_a - this.field_h[0].field_h;
        } else {
          stackIn_7_0 = 0;
        }
        return stackIn_7_0;
    }

    final int a(String param0, int param1, int param2, byte param3) {
        int var8 = 0;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var9 = 0;
        int var10 = 0;
        int stackIn_21_0 = 0;
        int stackIn_23_0 = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var10 = SteelSentinels.obfuscationControl;
        try {
          var5_int = 0;
          var6 = 0;
          var7 = param0.length();
          if (param3 < 94) {
            field_i = (String) null;
          }
          for (var8 = 0; var7 > var8; var8++) {
            var9 = param0.charAt(var8);
            if (var9 != 60) {
              if (var9 == 62) {
                var6 = 0;
              } else {
                if (var6 == 0 &&
                  32 == var9) {
                  var5_int++;
                }
              }
            } else {
              var6 = 1;
            }
          }
          if (var5_int <= 0) {
            stackIn_23_0 = 0;
            return stackIn_23_0;
          }
          stackIn_21_0 = (-param2 + param1 << 8) / var5_int;
          return stackIn_21_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_26_0 = var5;
          stackIn_26_1 = new StringBuilder().append("da.B(");
          if (param0 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final int a(int param0, int param1) {
        int var4 = 0;
        il var5 = null;
        int var6 = SteelSentinels.obfuscationControl;
        if (param0 != 1) {
          field_b = (vi) null;
        }
        il[] var7 = this.field_h;
        il[] var3 = var7;
        for (var4 = 0; var7.length > var4; var4++) {
          var5 = var7[var4];
          if (var5.field_f.length > param1) {
            return var5.field_f[param1];
          }
          param1 = param1 - (var5.field_f.length - 1);
        }
        return 0;
    }

    final static void a(boolean param0, int param1) {
        if (param1 != 25104) {
          return;
        }
        if (NodeIterator.a(2)) {
          param0 = false;
        }
        bf.a((byte) -112, param0);
        if (di.field_b) {
          SoftwareRaster.f(fg.field_Tb.field_d.field_Y, fg.field_Tb.field_d.field_eb, fg.field_Tb.field_d.field_zb, fg.field_Tb.field_d.field_Lb);
          fg.field_Tb.field_d.a(param0, (byte) 127);
        }
        il.a(param0, (byte) -125);
    }

    public static void a(boolean param0) {
        field_e = null;
        field_a = null;
        field_i = null;
        field_b = null;
        if (!param0) {
          field_b = (vi) null;
        }
        field_f = null;
        field_c = null;
    }

    static {
        field_c = "This is your RuneScape clan if you have one.";
        field_a = "Invalid date";
        field_i = ", and was finished off by a rock";
    }
}
