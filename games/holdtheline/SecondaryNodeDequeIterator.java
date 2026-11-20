/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class SecondaryNodeDequeIterator implements Iterator {
    static MusicCrossfadeStream field_d;
    static Vector2f field_c;
    static int[] field_h;
    private IterableSecondaryNodeDeque field_e;
    private DualLinkNode field_f;
    private DualLinkNode field_b;
    static PacketBuffer field_a;
    static String field_g;

    public final Object next() {
        Object var1 = this.field_b;
        if (this.field_e.field_i != var1) {
          this.field_b = ((DualLinkNode) (var1)).secondaryNext;
        } else {
          this.field_b = null;
          var1 = null;
        }
        this.field_f = (DualLinkNode) (var1);
        return var1;
    }

    public final void remove() {
        if (this.field_f == null) {
          throw new IllegalStateException();
        }
        this.field_f.unlinkSecondary((byte) -42);
        this.field_f = null;
    }

    public static void clearSharedReferences(byte param0) {
        field_h = null;
        field_a = null;
        field_d = null;
        field_g = null;
        if (param0 != 68) {
          return;
        }
        field_c = null;
    }

    public final boolean hasNext() {
        return this.field_e.field_i != this.field_b;
    }

    final static void a(int param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = HoldTheLine.field_D;
        try {
          if (param0 != 0) {
            field_h = (int[]) null;
          }
          if (MusicPatchPcmStream.field_r != null) {
            MusicPatchPcmStream.field_r.a();
            return;
          }
          SoftwareRasterizer.clear();
          LoadProgressDialog.field_hb.drawScaled(224, 112, 192, 256);
          for (var1_int = 0; 32 > var1_int; var1_int++) {
            var2 = OutlinedRoadStripRenderer.a(-14646, nm.field_b);
            SoftwareRasterizer.drawHorizontalLine(var1_int / 2 + 184, 398 - var1_int, var2, 12517567);
            SoftwareRasterizer.drawHorizontalLine(var2 + (var1_int / 2 + 184), 398 - var1_int, -var2 + 256, 7274607);
          }
          nm.field_c.drawCentered(CheckboxRenderer.field_q, 320, 392, 0, -1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw EntitySound.wrapException((Throwable) ((Object) var1), "vl.A(" + param0 + ')');
        }
    }

    SecondaryNodeDequeIterator(IterableSecondaryNodeDeque param0) {
        this.field_f = null;
        try {
          this.field_e = param0;
          this.field_b = this.field_e.field_i.secondaryNext;
          this.field_f = null;
        } catch (RuntimeException runtimeException) {
          throw EntitySound.wrapException((Throwable) ((Object) runtimeException), "vl.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_a = new PacketBuffer(256);
    }
}
