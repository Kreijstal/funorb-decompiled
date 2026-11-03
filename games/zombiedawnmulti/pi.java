/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pi {
    static String field_c;
    int field_d;
    static String field_b;
    static IndexedSprite field_f;
    static String field_h;
    static String field_e;
    static int field_i;
    static String field_g;
    static ip field_a;

    pi(int param0) {
        this.field_d = param0;
    }

    public static void a(int param0) {
        field_a = null;
        field_h = null;
        field_c = null;
        if (param0 != -19162) {
          field_b = (String) null;
        }
        field_f = null;
        field_g = null;
        field_b = null;
        field_e = null;
    }

    final static void a(int param0, boolean param1, int param2, boolean param3, int[] param4, int param5, int param6, int param7) {
        if (!param3) {
          return;
        }
        try {
          int[] var9 = (int[]) null;
          DialogLayer.a((int[]) null, param1, param6, param2, (byte) -117, param4, param5, param7, param0);
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "pi.A(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    final static void a(byte param0, boolean param1, boolean param2, ic param3, int param4) {
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        String var7 = null;
        try {
          VerticalScrollbar.field_Fb[0] = TertiaryLinkDeque.field_c.nextInt();
          VerticalScrollbar.field_Fb[1] = TertiaryLinkDeque.field_c.nextInt();
          VerticalScrollbar.field_Fb[2] = (int)(Camera.field_c >> 32);
          VerticalScrollbar.field_Fb[3] = (int)Camera.field_c;
          TextInputWidget.field_R.position = 0;
          TextInputWidget.field_R.writeInt(33, VerticalScrollbar.field_Fb[0]);
          TextInputWidget.field_R.writeInt(param0 ^ 84, VerticalScrollbar.field_Fb[1]);
          TextInputWidget.field_R.writeInt(-111, VerticalScrollbar.field_Fb[2]);
          TextInputWidget.field_R.writeInt(param0 ^ 88, VerticalScrollbar.field_Fb[3]);
          jq.a(TextInputWidget.field_R, 13746);
          TextInputWidget.field_R.writeShort(param4, (byte) -54);
          if (param0 != -59) {
            field_c = (String) null;
          }
          param3.a(TextInputWidget.field_R, -1);
          ma.field_a.position = 0;
          if (!param2) {
            ma.field_a.writeByte(param0 ^ -68, 16);
          } else {
            ma.field_a.writeByte(-102, 18);
          }
          ma.field_a.position = ma.field_a.position + 2;
          var5_int = ma.field_a.position;
          ma.field_a.writeInt(95, v.field_f);
          ma.field_a.a(DualLinkNode.field_i, true);
          var6 = 0;
          if (cm.field_e) {
            var6 = var6 | 1;
          }
          if (gj.field_e) {
            var6 = var6 | 4;
          }
          if (param1) {
            var6 = var6 | 8;
          }
          if (null != oe.field_f) {
            var6 = var6 | 16;
          }
          ma.field_a.writeByte(-81, var6);
          var7 = wg.a(0, StatefulTextPainter.b(0));
          if (var7 == null) {
            var7 = "";
          }
          ma.field_a.writeString(var7, (byte) 105);
          if (null != oe.field_f) {
            ma.field_a.b(-16171, oe.field_f);
          }
          EmailAvailabilityValidator.a(ButtonWidget.field_L, (byte) -122, UsernameAvailabilityValidator.field_v, TextInputWidget.field_R, ma.field_a);
          ma.field_a.b(false, -var5_int + ma.field_a.position);
          cb.a(-1, false);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_25_0 = var5;
          stackIn_25_1 = new StringBuilder().append("pi.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param4).append(')').toString());
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static void a(byte param0, int param1, int param2, int param3, int param4, int param5) {
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        var12 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          if (param1 < SoftwareRasterizer.clipLeft) {
            param3 = param3 - (SoftwareRasterizer.clipLeft - param1);
            param1 = SoftwareRasterizer.clipLeft;
          }
          if (SoftwareRasterizer.clipTop > param5) {
            param4 = param4 - (-param5 + SoftwareRasterizer.clipTop);
            param5 = SoftwareRasterizer.clipTop;
          }
          if (SoftwareRasterizer.clipRight < param1 + param3) {
            param3 = SoftwareRasterizer.clipRight - param1;
          }
          if (param0 > -88) {
            return;
          }
          if (SoftwareRasterizer.clipBottom < param4 + param5) {
            param4 = SoftwareRasterizer.clipBottom - param5;
          }
          if (param3 > 0 &&
            param4 > 0) {
            var6_int = SoftwareRasterizer.width * param5 + param1;
            var7 = SoftwareRasterizer.width - param3;
            for (param5 = -param4; param5 < 0; param5++) {
              for (param1 = -param3; param1 < 0; param1++) {
                var8 = SoftwareRasterizer.pixels[var6_int];
                if ((255 & var8 >> 8) > param2 &&
                  (255 & var8 >> 16) <= (var8 & 65280) >> 8) {
                  var9 = ((16711680 & var8) >> 15) - 60;
                  if (var9 > 255) {
                    var9 = 255;
                  }
                  var10 = 65280 & var8;
                  var10 = -(var10 >> 5) + (var10 >> 1) & 65280;
                  var11 = 31 & var8 >> 3;
                  SoftwareRasterizer.pixels[var6_int] = cr.b(cr.b(var9 << 16, var10), var11);
                }
                var6_int++;
              }
              var6_int = var6_int + var7;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) var6), "pi.B(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    static {
        field_c = "Offline";
        field_h = "Traits affect your zombies for the entire match. Drag GREEN (square) research here to apply it.";
        field_b = "Return to lobby";
        field_g = "Suggested names: ";
        field_e = "Message game";
        field_a = new ip();
    }
}
