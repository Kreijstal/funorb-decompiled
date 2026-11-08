/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class IterableNodeHashTable implements Iterable {
    int field_d;
    static String field_b;
    IntrusiveNode[] buckets;
    static boolean field_c;
    private IntrusiveNode field_e;

    final IntrusiveNode get(long key, int obfuscationGuard) {
        IntrusiveNode var4;
        int var5;
        IntrusiveNode var6;
        int var7;
        var7 = ZombieDawnMulti.field_E ? 1 : 0;
        var4 = this.buckets[(int)(key & (long)(-1 + this.field_d))];
        this.field_e = var4.previous;
        var5 = -79 / ((obfuscationGuard + 3) / 54);
        while (true) {
          if (var4 == this.field_e) {
            this.field_e = null;
            return null;
          }
          if (key != this.field_e.key) {
            this.field_e = this.field_e.previous;
            continue;
          }
          break;
        }
        var6 = this.field_e;
        this.field_e = this.field_e.previous;
        return var6;
    }

    final void a(long param0, byte param1, IntrusiveNode param2) {
        IntrusiveNode var5 = null;
        try {
          if (null != param2.next) {
            param2.unlink(true);
          }
          var5 = this.buckets[(int)(param0 & (long)(this.field_d - 1))];
          param2.previous = var5;
          param2.next = var5.next;
          param2.next.previous = param2;
          param2.key = param0;
          if (param1 > 0) {
            this.field_e = (IntrusiveNode) null;
          }
          param2.previous.next = param2;
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "wh.E(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static LevelData a(byte[] param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        byte[] var3 = null;
        LevelData stackIn_4_0 = null;
        LevelData stackIn_10_0 = null;
        LevelData stackIn_13_0 = null;
        LevelData stackIn_15_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 >= -12) {
            var3 = (byte[]) null;
            IterableNodeHashTable.a((byte[]) null, -96);
          }
          var2_int = ql.a(true, 0, param0);
          if (var2_int == 3) {
            stackIn_4_0 = ee.a(param0, true);
            return stackIn_4_0;
          }
          if (var2_int == 4) {
            stackIn_15_0 = nn.a(-99, param0);
            return stackIn_15_0;
          }
          if (var2_int == 5) {
            stackIn_13_0 = jg.a(30270, param0);
            return stackIn_13_0;
          }
          if (var2_int != 6) {
            return null;
          }
          stackIn_10_0 = gi.a(param0, -115);
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_18_0 = var2;
          stackIn_18_1 = new StringBuilder().append("wh.A(");
          if (param0 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param1).append(')').toString());
        }
    }

    public final Iterator iterator() {
        return (Iterator) ((Object) new NodeHashTableIterator(this));
    }

    public static void releaseStatics(boolean param0) {
        if (param0) {
          byte[] var2 = (byte[]) null;
          IterableNodeHashTable.a((byte[]) null, -107);
          field_b = null;
          return;
        }
        field_b = null;
    }

    final static void a(int param0, int param1, int param2, String param3, String param4) {
        ec.field_b.field_vb = param4;
        ec.field_b.field_wb = param3;
        ec.field_b.field_M = param1;
        ec.field_b.field_zb = ec.field_b.field_zb + DraggableWidget.field_E.field_zb;
        DraggableWidget.field_E.field_x = DraggableWidget.field_E.field_x + DraggableWidget.field_E.field_zb;
        if (param0 != 6) {
          return;
        }
        try {
          DraggableWidget.field_E.field_zb = param2;
          ec.field_b.field_zb = ec.field_b.field_zb - DraggableWidget.field_E.field_zb;
          DraggableWidget.field_E.field_x = DraggableWidget.field_E.field_x - DraggableWidget.field_E.field_zb;
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "wh.B(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    final static Sprite a(int param0, double param1, int param2) {
        int var8 = 0;
        Sprite var9 = new Sprite(640, 75);
        var9.bindAsRenderTarget();
        SoftwareRasterizer.fillRectGradient(0, 5, 640, 55, 16777215, 1);
        Sprite var5 = new Sprite(640, 75);
        var5.bindAsRenderTarget();
        TertiaryLinkNode.field_r.drawCentered(sm.field_g[param2], 320, 65, 53248, 1);
        Sprite var6 = new Sprite(640, 75);
        var6.bindAsRenderTarget();
        int var7 = (int)(param1 * 640.0);
        if (param0 >= 26) {
          var8 = (int)(75.0 * param1);
          var5.drawScaledAveraged((-var7 + 640) / 2, 0, var7, var8);
          var9.drawMultiply(0, 0);
          var6.addOutline(16777215);
          var6.addOutline(16777215);
          var6.addOutline(1);
          var6.addOutline(1);
          SocketConnector.field_h.b((byte) 96);
          return var6;
        }
        return (Sprite) null;
    }

    IterableNodeHashTable(int param0) {
        int var2 = 0;
        IntrusiveNode dupTemp$0 = null;
        IntrusiveNode var3 = null;
        this.buckets = new IntrusiveNode[param0];
        this.field_d = param0;
        for (var2 = 0; param0 > var2; var2++) {
          dupTemp$0 = new IntrusiveNode();
          var3 = dupTemp$0;
          this.buckets[var2] = dupTemp$0;
          var3.previous = var3;
          var3.next = var3;
        }
    }

    static {
        field_c = false;
        field_b = "Miasma";
    }
}
