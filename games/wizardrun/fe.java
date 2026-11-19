/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fe extends TextFieldValidator {
    static int field_l;
    private EditableTextWidget field_k;

    fe(EditableTextWidget param0, EditableTextWidget param1) {
        super(param0);
        try {
          this.field_k = param1;
        } catch (RuntimeException runtimeException) {
          throw ExceptionSupport.wrapException((Throwable) ((Object) runtimeException), "fe.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final ValidationState a(int param0, String param1) {
        Validator var3 = null;
        RuntimeException var3_ref = null;
        ValidationState stackIn_4_0 = null;
        ValidationState stackIn_7_0 = null;
        ValidationState stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_k instanceof ValidatorProvider) {
            var3 = ((ValidatorProvider) ((Object) this.field_k)).getValidator((byte) 119);
            if (var3 != null &&
              var3.getState(true) != gf.field_V) {
              stackIn_4_0 = hg.field_c;
              return stackIn_4_0;
            }
          }
          if (param0 != -1) {
            stackIn_7_0 = (ValidationState) null;
            return stackIn_7_0;
          }
          if (!param1.equals(this.field_k.field_k)) {
            stackIn_11_0 = hg.field_c;
          } else {
            stackIn_11_0 = gf.field_V;
          }
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_14_0 = var3_ref;
          stackIn_14_1 = new StringBuilder().append("fe.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw ExceptionSupport.wrapException((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    final String a(String param0, int param1) {
        Validator var3 = null;
        RuntimeException var3_ref = null;
        String stackIn_8_0 = null;
        String stackIn_10_0 = null;
        String stackIn_16_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_k instanceof ValidatorProvider) {
            var3 = ((ValidatorProvider) ((Object) this.field_k)).getValidator((byte) 113);
            if (var3 != null) {
              if (var3.getState(true) == gf.field_V &&
                !param0.equals(this.field_k.field_k)) {
                stackIn_8_0 = ec.field_h;
                return stackIn_8_0;
              }
              stackIn_10_0 = var3.getMessage(-2864);
              return stackIn_10_0;
            }
          }
          if (param1 != -1) {
            fe.c((byte) -51);
          }
          if (param0.equals(this.field_k.field_k)) {
            return null;
          }
          stackIn_16_0 = ec.field_h;
          return stackIn_16_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_20_0 = var3_ref;
          stackIn_20_1 = new StringBuilder().append("fe.A(");
          if (param0 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw ExceptionSupport.wrapException((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void c(byte param0) {
        GridPoint stackIn_5_0 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        GridPoint var3 = null;
        GridPoint var4 = null;
        var2 = wizardrun.field_H;
        try {
          var3 = new GridPoint();
          var4 = var3;
          var4.column = 0;
          if (param0 <= 91) {
            return;
          }
          stackIn_5_0 = var4;
          while (stackIn_5_0.column < 20) {
            var4.row = 0;
            while (var4.row < 15) {
              if (tc.field_l.field_j[var3.toTileIndex((byte) -68)] > 0) {
                lk.field_b[-1 + tc.field_l.field_j[var3.toTileIndex((byte) -68)]].drawTransparent(32 * var4.column, 32 * (-var4.row + 14));
              }
              if (0 < tc.field_l.field_a[var3.toTileIndex((byte) -68)] &&
                oc.field_b[-1 + tc.field_l.field_a[var3.toTileIndex((byte) -68)]] != null) {
                oc.field_b[-1 + tc.field_l.field_a[var3.toTileIndex((byte) -68)]][0].drawTransparent(var4.column * 32, 32 * (-1 + (15 - var4.row)));
              }
              if (tc.field_l.field_d[var3.toTileIndex((byte) -68)] &&
                ke.field_w) {
                SoftwareRasterizer.fillRectangleBlended(32 * var4.column, -32 + (480 - var4.row * 32), 32, 32, 16777215, 128);
              }
              var4.row = var4.row + 1;
            }
            var4.column = var4.column + 1;
            stackIn_5_0 = var4;
          }
          if (DialogLayer.field_K != 0) {
            return;
          }
          ld.field_d.drawTransparent(aa.field_ib.column * 24, 336 - aa.field_ib.row * 24);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ExceptionSupport.wrapException((Throwable) ((Object) var1), "fe.B(" + param0 + ')');
        }
    }

    static {
    }
}
