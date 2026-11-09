/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ko extends IntrusiveNode {
    private int field_k;
    private int field_o;
    private float field_l;
    private int field_n;
    private int field_r;
    static IntrusiveDeque field_m;
    private int field_q;
    static int field_p;

    final static void resendProgressAndArrayRequests(int guard, int opcode) {
        IntrusiveNode var2 = null;
        int var3 = 0;
        GameProgressUpdate var4 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var3 = Sumoblitz.field_L ? 1 : 0;
        try {
          var4 = (GameProgressUpdate) (SoftwareRenderTarget.field_f.first(-101));
          while (var4 != null) {
            ToolkitRasterStateStack.sendProgressUpdate(opcode, 1, var4);
            var4 = (GameProgressUpdate) (SoftwareRenderTarget.field_f.next((byte) 18));
          }
          if (guard != 0) {
            field_m = (IntrusiveDeque) null;
          }
          var2 = CheckboxWidget.field_E.first(-105);
          while (var2 != null) {
            ScreenNameValidator.sendServerIntArrayRead(125, opcode);
            var2 = CheckboxWidget.field_E.next((byte) 18);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) var2_ref), "ko.A(" + guard + ',' + opcode + ')');
        }
    }

    final int c(byte param0) {
        if (param0 != 50) {
          this.field_l = -3.14526629447937f;
          return this.field_r;
        }
        return this.field_r;
    }

    final int d(byte param0) {
        if (param0 != 109) {
          ko.resendProgressAndArrayRequests(39, 19);
          return this.field_o;
        }
        return this.field_o;
    }

    final int a(byte param0) {
        if (param0 < 71) {
          return -46;
        }
        return this.field_k;
    }

    final int c(int param0) {
        if (param0 != 0) {
          this.c(false);
          return this.field_q;
        }
        return this.field_q;
    }

    public static void d(int param0) {
        if (param0 != 0) {
          ko.resendProgressAndArrayRequests(-33, -26);
          field_m = null;
          return;
        }
        field_m = null;
    }

    private ko() throws Throwable {
        throw new Error();
    }

    final int c(boolean param0) {
        if (!param0) {
          return -61;
        }
        return this.field_n;
    }

    final float a(int param0) {
        if (param0 != 0) {
          this.field_l = 0.354354590177536f;
          return this.field_l;
        }
        return this.field_l;
    }

    static {
        field_m = new IntrusiveDeque();
        field_p = 0;
    }
}
