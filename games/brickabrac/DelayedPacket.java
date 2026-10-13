/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DelayedPacket extends IntrusiveNode {
    static RgbSprite field_p;
    static String field_i;
    static String field_q;
    static String field_n;
    int opcode;
    static int field_m;
    static String field_o;
    byte[] data;
    long deliverAfterMillis;
    static MenuScreen[] menuScreens;

    final static boolean c(int param0) {
        if (param0 <= 57) {
          field_o = (String) null;
          if (!og.h(-26090)) {
            return 0 >= go.field_c ? true : false;
          }
          return true;
        }
        if (og.h(-26090)) {
          return true;
        }
        if (0 < go.field_c) {
          return false;
        }
        return true;
    }

    final static RgbSprite a(RgbSprite param0, int param1, int param2) {
        int var4 = 0;
        RuntimeException var3 = null;
        int var5 = 0;
        RgbSprite var6 = null;
        RgbSprite stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = BrickABrac.field_J ? 1 : 0;
        try {
          if (param2 != -17912) {
            DelayedPacket.c(-48);
          }
          var6 = new RgbSprite(param1 * 2 + param0.width, 2 * param1 + param0.height);
          var6.bindRasterTarget();
          Rasterizer2D.fillRectangle(0, 0, var6.width, var6.height, 16777215);
          for (var4 = 0; param1 > var4; var4++) {
            param0.d(-param0.offsetX + param1, -param0.offsetY + param1, 0);
            Rasterizer2D.e(1, 1, 0, 0, var6.width, var6.height);
          }
          var6.replaceZeroWithOne();
          param0.d(-param0.offsetX + param1, param1 - param0.offsetY, 0);
          BallPulseEffect.framebuffer.bindRaster((byte) 109);
          var6.offsetY = param0.offsetY - param1;
          var6.offsetX = -param1 + param0.offsetX;
          stackIn_7_0 = var6;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("pg.D(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw qb.addExceptionContext((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    public static void a(int param0) {
        menuScreens = null;
        field_o = null;
        field_i = null;
        field_p = null;
        field_q = null;
        field_n = null;
        if (param0 > -123) {
          field_p = (RgbSprite) null;
        }
    }

    final static void d(int param0) {
        if (param0 != 0) {
          return;
        }
        nh.a(642, 482, -40, -1, cd.field_h, -1);
    }

    DelayedPacket(long deliverAfterMillis, int opcode, byte[] data) {
        try {
          this.opcode = opcode;
          this.data = data;
          this.deliverAfterMillis = deliverAfterMillis;
        } catch (RuntimeException runtimeException) {
          throw qb.addExceptionContext((Throwable) ((Object) runtimeException), "pg.<init>(" + deliverAfterMillis + ',' + opcode + ',' + (data != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(boolean param0, String param1) {
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        try {
          var2_int = pq.pointerX;
          var3 = po.pointerY;
          if (param0) {
            String var9 = (String) null;
            DelayedPacket.a(false, (String) null);
          }
          var4 = CappedUrlRequest.field_l.field_O.countWrappedLines(param1, 500);
          var5 = CappedUrlRequest.field_l.field_O.measureWrappedWidth(param1, 500) + 6;
          var6 = 2 + np.field_a * var4;
          var7 = OptionsScreen.a(-1, var5, var2_int, 12);
          var8 = br.a(var6, var3, 20, -30);
          Rasterizer2D.drawRectangle(var7, var8, var5, var6, 0);
          Rasterizer2D.fillRectangle(var7 + 1, 1 + var8, -2 + var5, var6 - 2, 16777088);
          CappedUrlRequest.field_l.field_O.a(param1, 3 + var7, -CappedUrlRequest.field_l.field_O.ascent + (1 + var8) + ok.field_f, 500, 1000, 0, -1, 0, 0, np.field_a);
        } catch (RuntimeException runtimeException) {
          throw qb.addExceptionContext((Throwable) ((Object) runtimeException), "pg.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_n = "Rated game";
        field_q = "Player Two";
        field_i = "Buying or selling an account";
        field_o = "Confirm Email:";
    }
}
