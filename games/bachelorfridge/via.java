/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class via implements WidgetRenderer {
    private int field_a;
    private BitmapFont field_i;
    private int field_b;
    private int field_d;
    static String field_c;
    private int field_h;
    private int field_f;
    private int field_g;
    private int field_e;

    final static int a(int param0, byte param1) {
        int stackIn_5_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_19_0 = 0;
        if (param1 > 55) {
          param0 = param0 & 8191;
          if (4096 > param0) {
            if (param0 < 2048) {
              stackIn_19_0 = ed.field_b[param0];
            } else {
              stackIn_19_0 = ed.field_b[4096 - param0];
            }
            return stackIn_19_0;
          }
          if (param0 >= 6144) {
            stackIn_15_0 = -ed.field_b[-param0 + 8192];
          } else {
            stackIn_15_0 = -ed.field_b[-4096 + param0];
          }
          return stackIn_15_0;
        }
        field_c = (String) null;
        param0 = param0 & 8191;
        if (4096 > param0) {
          if (param0 < 2048) {
            stackIn_9_0 = ed.field_b[param0];
          } else {
            stackIn_9_0 = ed.field_b[4096 - param0];
          }
          return stackIn_9_0;
        }
        if (param0 >= 6144) {
          stackIn_5_0 = -ed.field_b[-param0 + 8192];
        } else {
          stackIn_5_0 = -ed.field_b[-4096 + param0];
        }
        return stackIn_5_0;
    }

    final static gs a(int param0, boolean param1) {
        boolean stackIn_5_0 = false;
        int stackIn_11_0 = 0;
        int[] stackIn_25_0 = null;
        Throwable decompiledCaughtException = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Exception var6 = null;
        int var7 = 0;
        BitPacketBuffer var8 = null;
        pda var9 = null;
        var7 = BachelorFridge.field_y;
        var8 = ig.field_m;
        if (param0 != -10183) {
          field_c = (String) null;
        }
        var3 = var8.readUnsignedByte(16711935);
        wka.field_a = var3 & 127;
        stackIn_5_0 = ((128 & var3) != 0);
        OneAnimation.field_x = stackIn_5_0;
        vv.field_d = var8.readUnsignedByte(param0 ^ -16721722);
        sr.field_a = var8.readLong(-108);
        if (wka.field_a == 2) {
          CreatureActor.field_g = var8.readUnsignedShort((byte) 75);
          DisableAnimation.field_w = var8.a(param0 ^ -10182);
        } else {
          CreatureActor.field_g = 0;
          DisableAnimation.field_w = 0;
        }
        stackIn_11_0 = (var8.readUnsignedByte(16711935) != 1) ? 0 : 1;
        var4 = stackIn_11_0;
        gba.field_yb = var8.readString(88);
        if (var4 == 0) {
          qia.field_b = gba.field_yb;
        } else {
          qia.field_b = var8.readString(48);
        }
        if (1 == wka.field_a) {
          laa.field_m = var8.readUnsignedShort((byte) 116);
          to.field_a = var8.readString(87);
        } else {
          if (wka.field_a != 4) {
            to.field_a = null;
            laa.field_m = 0;
          } else {
            laa.field_m = var8.readUnsignedShort((byte) 116);
            to.field_a = var8.readString(87);
          }
        }
        if (!param1) {
          qk.field_n = oka.a(var8, 80, (byte) -68);
          hv.field_a = null;
          return new gs(param1);
        }
        var5 = var8.readUnsignedShort((byte) 123);
        try {
          var9 = cea.field_h.a(-22834, var5);
          qk.field_n = var9.d((byte) 117);
          if (!qia.field_b.equals(cha.field_l)) {
            stackIn_25_0 = var9.field_s;
          } else {
            stackIn_25_0 = null;
          }
          hv.field_a = stackIn_25_0;
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = (Exception) (Object) decompiledCaughtException;
          SpiltMilkEvent.a(1, "CC1", (Throwable) ((Object) var6));
          qk.field_n = null;
          hv.field_a = null;
          return new gs(param1);
        }
        return new gs(param1);
    }

    public final void a(int param0, UiWidget param1, int param2, int param3, boolean param4) {
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        double var9 = 0.0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        km var14 = null;
        UiWidget stackIn_5_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        double var9Lifetime1;
        int var11Lifetime1;
        int var12Lifetime1;
        try {
          if (param2 != 32679) {
            return;
          }
          if (param1 instanceof km) {
            stackIn_5_0 = (UiWidget) (param1);
          } else {
            stackIn_5_0 = null;
          }
          var14 = (km) (stackIn_5_0);
          if (var14 != null) {
          }
          SoftwareRasterizer.fillRectangle(param0 + param1.x, param3 + param1.y, param1.width, param1.height, this.field_e);
          var7 = param1.x + param0 + var14.field_A;
          var8 = param3 + param1.y + var14.field_D;
          SoftwareRasterizer.fillCircle(var7, var8, var14.field_G, this.field_d);
          if (var14.field_J != -1) {
            var9 = (double)var14.field_J * 3.141592653589793 * 2.0 / (double)var14.field_F;
            var11 = (int)(-Math.sin(var9) * (double)var14.field_G);
            var12 = (int)(Math.cos(var9) * (double)var14.field_G);
            SoftwareRasterizer.fillCircle(var11 + var7, var8 + var12, 1, this.field_a);
          }
          SoftwareRasterizer.fillCircle(var7, var8, 2, 1);
          var9Lifetime1 = 3.141592653589793 * (double)var14.field_I * 2.0 / (double)var14.field_F;
          var11Lifetime1 = (int)(-Math.sin(var9Lifetime1) * (double)var14.field_G);
          var12Lifetime1 = (int)(Math.cos(var9Lifetime1) * (double)var14.field_G);
          SoftwareRasterizer.drawLine(var7, var8, var7 + var11Lifetime1, var8 + var12Lifetime1, 1);
          if (this.field_i == null) {
            return;
          }
          var13 = var14.field_G + var14.field_A + this.field_f;
          this.field_i.drawParagraph(param1.text, param0 - (-param1.x - var13), param1.y + (param3 + this.field_g), -var13 + (-this.field_f + param1.width), -(this.field_f << 1) + param1.height, this.field_h, this.field_b, 1, 1, 0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_14_0 = var6;
          stackIn_14_1 = new StringBuilder().append("via.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw pe.wrapException((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    public static void releaseStatics(int param0) {
        if (param0 != 1) {
          field_c = (String) null;
          field_c = null;
          return;
        }
        field_c = null;
    }

    final static String a(int param0, String param1, int param2) {
        String stackIn_4_0 = null;
        String stackIn_8_0 = null;
        String stackIn_11_0 = null;
        Object stackIn_19_0 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var5 = 0;
        int var6 = 0;
        nea var7 = null;
        nea var8 = null;
        BitPacketBuffer var9 = null;
        CharSequence var10 = null;
        var6 = BachelorFridge.field_y;
        try {
          var10 = (CharSequence) ((Object) param1);
          if (!HazmatSpecial.a(0, var10)) {
            stackIn_4_0 = mk.field_f;
            return stackIn_4_0;
          }
          if (2 != um.field_c) {
            stackIn_8_0 = nha.field_d;
            return stackIn_8_0;
          }
          var8 = DisableAnimation.b(-50, param1);
          if (var8 == null) {
            stackIn_11_0 = lga.a(true, new String[]{param1}, OneSpecial.field_q);
            return stackIn_11_0;
          }
          es.field_j.a(var8, 0);
          while (true) {
            var7 = (nea) (es.field_j.c(0));
            if (var7 != null) {
              var7.field_wb = var7.field_wb - 1;
              continue;
            }
            break;
          }
          var8.unlink(false);
          var8.unlinkSecondary(0);
          SuperSpeedAnimation.field_v = SuperSpeedAnimation.field_v - 1;
          var9 = sja.field_fb;
          var9.writeCipheredByte(param0, (byte) 114);
          var9.position = var9.position + 1;
          if (param2 > -40) {
            field_c = (String) null;
          }
          var5 = var9.position;
          var9.writeByte(1, 0);
          var9.writeString((byte) -50, param1);
          var9.writeLengthByte((byte) -63, var9.position - var5);
          stackIn_19_0 = null;
          return (String) (stackIn_19_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_22_0 = var3;
          stackIn_22_1 = new StringBuilder().append("via.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw pe.wrapException((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param2).append(')').toString());
        }
    }

    via(BitmapFont param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        try {
          this.field_i = param0;
          this.field_a = param6;
          this.field_h = param3;
          this.field_f = param1;
          this.field_d = param5;
          this.field_e = param7;
          this.field_g = param2;
          this.field_b = param4;
        } catch (RuntimeException runtimeException) {
          throw pe.wrapException((Throwable) ((Object) runtimeException), "via.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    static {
        field_c = "Arena basics. Click the tooltips to continue.";
    }
}
