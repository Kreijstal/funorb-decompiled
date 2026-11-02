/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fj extends gn {
    static boolean field_M;

    private fj(String param0, bj param1) {
        this(param0, ra.field_o.field_n, param1);
        try {
          this.field_h = ra.field_o.field_k;
        } catch (RuntimeException runtimeException) {
          throw fa.a((Throwable) ((Object) runtimeException), "fj.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private fj(String param0, nl param1, bj param2) {
        super(param0, param1, param2);
        try {
          this.field_h = ra.field_o.field_k;
        } catch (RuntimeException runtimeException) {
          throw fa.a((Throwable) ((Object) runtimeException), "fj.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(byte param0) {
        try {
          if (null != bg.field_e) {
            try {
              bg.field_e.a(0L, (byte) -70);
              bg.field_e.a(-1, 24, s.field_e.position, s.field_e.payload);
            } catch (Exception exception) {
            }
          }
          if (param0 != 85) {
            field_M = true;
          }
          s.field_e.position = s.field_e.position + 24;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(int param0, Sprite param1) {
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int var10 = ZombieDawnMulti.field_E ? 1 : 0;
        int var2_int = 20 % ((-42 - param0) / 36);
        if (((param1.height | param1.width | param1.offsetX | param1.field_y) & 3) == 0) {
          return;
        }
        try {
          var3 = (3 & param1.offsetX) + param1.width;
          var3 = -(var3 & 3) + (4 + var3);
          var4 = (param1.field_y & 3) + param1.height;
          var4 = var4 - (3 & var4) + 4;
          var5 = new int[var3 * var4];
          var6 = 0;
          var7 = (param1.field_y & 3) * var3 + (param1.offsetX & 3);
          for (var8 = 0; var8 < param1.height; var8++) {
            for (var9 = 0; var9 < param1.width; var9++) {
              incrementValue$0 = var7;
              var7++;
              incrementValue$1 = var6;
              var6++;
              var5[incrementValue$0] = param1.pixels[incrementValue$1];
            }
            var7 = var7 + (var3 - param1.width);
          }
          param1.field_y = param1.field_y & -4;
          param1.pixels = var5;
          param1.width = var3;
          param1.offsetX = param1.offsetX & -4;
          param1.height = var4;
        } catch (RuntimeException runtimeException) {
          throw fa.a((Throwable) ((Object) runtimeException), "fj.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    fj(String param0, bj param1, boolean param2) {
        this(param0, param1);
        try {
          this.field_G = param2 ? true : false;
        } catch (RuntimeException runtimeException) {
          throw fa.a((Throwable) ((Object) runtimeException), "fj.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final void a(byte param0, int param1, int param2, int param3) {
        this.field_G = !this.field_G ? true : false;
        super.a(param0, param1, param2, param3);
    }

    final static Sprite[] a(String param0, String param1, int param2, ul param3) {
        Sprite[] var4 = null;
        RuntimeException var4_ref = null;
        Sprite[] var5 = null;
        Sprite[] stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5 = pb.a(param1, param3, -256, param0);
          var4 = var5;
          var5[param2].field_u = var5[3].height;
          var5[1].fullWidth = var5[1].width;
          var5[7].fullWidth = var5[7].width;
          var5[5].field_u = var5[5].height;
          stackIn_1_0 = var4;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_4_0 = var4_ref;
          stackIn_4_1 = new StringBuilder().append("fj.L(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    static {
    }
}
