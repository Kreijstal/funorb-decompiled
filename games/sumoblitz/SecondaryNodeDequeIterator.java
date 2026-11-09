/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class SecondaryNodeDequeIterator implements Iterator {
    private DualLinkNode field_e;
    private DualLinkNode field_c;
    static ToolkitSprite[] field_a;
    private SecondaryNodeDeque field_d;
    static ul field_b;

    public final Object next() {
        Object var1 = this.field_c;
        if (this.field_d.sentinel == var1) {
          var1 = null;
          this.field_c = null;
        } else {
          this.field_c = ((DualLinkNode) (var1)).secondaryNext;
        }
        this.field_e = (DualLinkNode) (var1);
        return var1;
    }

    public final boolean hasNext() {
        return this.field_c != this.field_d.sentinel;
    }

    public final void remove() {
        if (this.field_e == null) {
          throw new IllegalStateException();
        }
        this.field_e.unlinkSecondary(-5106);
        this.field_e = null;
    }

    final static void a(int param0, int param1, int param2) {
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var3_intLifetime1;
        var4 = Sumoblitz.field_L ? 1 : 0;
        try {
          if (ws.field_b != param1) {
            gs.field_b = new int[param1];
            for (var3_int = 0; var3_int < param1; var3_int++) {
              gs.field_b[var3_int] = (var3_int << 12) / param1;
            }
            ws.field_b = param1;
          }
          if (param0 != -1203350004) {
            SecondaryNodeDequeIterator.releaseStatics(86);
          }
          if (ts.field_c != param2) {
            if (ws.field_b != param2) {
              SpriteOptionRenderer.field_o = new int[param2];
              var5 = 0;
              var3_intLifetime1 = var5;
              while (param2 > var5) {
                SpriteOptionRenderer.field_o[var5] = (var5 << 12) / param2;
                var5++;
              }
            } else {
              SpriteOptionRenderer.field_o = gs.field_b;
            }
            ts.field_c = param2;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) var3), "vv.A(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    SecondaryNodeDequeIterator(SecondaryNodeDeque param0) {
        this.field_e = null;
        try {
          this.field_d = param0;
          this.field_e = null;
          this.field_c = this.field_d.sentinel.secondaryNext;
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "vv.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public static void releaseStatics(int param0) {
        field_b = null;
        field_a = null;
        if (param0 > -91) {
          field_a = (ToolkitSprite[]) null;
        }
    }

    static {
        field_b = null;
    }
}
