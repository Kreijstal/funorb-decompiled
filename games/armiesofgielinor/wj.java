/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wj extends IntrusiveNode {
    int[][] field_m;
    static hd field_n;
    int field_p;
    static volatile boolean field_l;
    boolean field_o;
    int field_k;
    int field_r;
    String[][] field_s;
    static int field_q;

    public static void a(boolean param0) {
        if (!param0) {
          RgbSprite[] var2 = (RgbSprite[]) null;
          wj.a(96, (RgbSprite[]) null);
          field_n = null;
          return;
        }
        field_n = null;
    }

    wj() {
    }

    final static RgbSprite[] a(int param0, RgbSprite[] param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        RgbSprite var3 = null;
        int var4 = 0;
        RgbSprite[] stackIn_3_0 = null;
        RgbSprite[] stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (param0 != -12310) {
            stackIn_3_0 = (RgbSprite[]) null;
            return stackIn_3_0;
          }
          for (var2_int = 0; param1.length > var2_int; var2_int++) {
            var3 = param1[var2_int];
            param1[var2_int].offsetY = 0;
            var3.offsetX = 0;
            param1[var2_int].canvasWidth = param1[var2_int].pixelWidth;
            param1[var2_int].canvasHeight = param1[var2_int].pixelHeight;
          }
          stackIn_8_0 = (RgbSprite[]) (param1);
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_11_0 = var2;
          stackIn_11_1 = new StringBuilder().append("wj.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw ig.addExceptionContext((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    final static void a(int param0) {
        try {
          Exception var1 = null;
          Throwable decompiledCaughtException = null;
          if (null != le.field_d) {
            try {
              le.field_d.seek(-1, 0L);
              le.field_d.write(24, ByteStorage.field_e.position, (byte) 46, ByteStorage.field_e.payload);
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var1 = (Exception) (Object) decompiledCaughtException;
            }
          }
          if (param0 != 0) {
            field_n = (hd) null;
          }
          ByteStorage.field_e.position = ByteStorage.field_e.position + 24;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_l = true;
        field_q = 0;
    }
}
