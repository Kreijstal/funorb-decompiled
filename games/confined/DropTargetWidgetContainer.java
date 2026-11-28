/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DropTargetWidgetContainer extends SingleChildWidgetContainer {
    static String field_L;
    static boolean field_K;
    static String field_J;
    static RgbSprite[] field_M;

    public static void clearStaticReferences(byte param0) {
        field_M = null;
        field_J = null;
        field_L = null;
        if (param0 < 57) {
          DropTargetWidgetContainer.clearStaticReferences((byte) -22);
        }
    }

    final void pointerReleased(int param0, int param1, int param2, UiWidget param3, int param4, int param5) {
        DraggableWidgetContainer var7 = null;
        try {
          super.pointerReleased(-51, param1, param2, param3, param4, param5);
          var7 = IntrusiveNode.field_k;
          if (param0 > -18) {
            field_J = (String) null;
          }
          if (var7 != null &&
            this.containsPointer(param2, (byte) 123, param5, param4, param1)) {
            if (this.field_t instanceof WidgetDropListener) {
              ((WidgetDropListener) (this.field_t)).widgetDropped(this, var7, (byte) 105);
              IntrusiveNode.field_k = null;
              return;
            }
            if (!(var7.field_t instanceof WidgetDropListener)) {
              return;
            }
            ((WidgetDropListener) (var7.field_t)).widgetDropped(this, var7, (byte) 105);
            IntrusiveNode.field_k = null;
          }
        } catch (RuntimeException runtimeException) {
          throw TextLineMetrics.a((Throwable) ((Object) runtimeException), "s.K(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ')');
        }
    }

    final static void h(int param0) {
        RuntimeException var1 = null;
        int var2 = 0;
        pe var3_ref_pe = null;
        int var3 = 0;
        int var4_int = 0;
        gg var4 = null;
        Object var5 = null;
        int var6 = 0;
        CipherPacketBuffer var9 = null;
        byte[] var13 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = Confined.field_J ? 1 : 0;
        try {
          var9 = e.field_c;
          var2 = var9.readUnsignedByte(32);
          if (param0 == var2) {
            var3_ref_pe = (pe) (IntrusiveNodeHashTable.field_e.beginForward(param0 + 38));
            if (var3_ref_pe == null) {
              dc.d(111);
              return;
            }
            var4_int = var9.readUnsignedByte(32);
            if (var4_int == 0) {
              var5 = null;
            } else {
              var13 = new byte[var4_int];
              var9.readBytes(0, (byte) 115, var4_int, var13);
            }
            var9.position = var9.position + 4;
            if (var9.verifyCrc32(4)) {
              var3_ref_pe.unlink(true);
              return;
            }
            dc.d(119);
            return;
          }
          if (1 != var2) {
            ShockwaveBlast.a("A1: " + ui.a(10), true, (Throwable) null);
            dc.d(116);
            return;
          }
          var3 = var9.readInt((byte) 36);
          var4 = (gg) (GameCanvas.field_b.beginForward(-117));
          while (var4 != null) {
            if (var4.field_o != var3) {
              var4 = (gg) (GameCanvas.field_b.nextForward(2123));
              continue;
            }
            break;
          }
          if (var4 != null) {
            var4.unlink(true);
            return;
          }
          dc.d(116);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw TextLineMetrics.a((Throwable) ((Object) var1), "s.A(" + param0 + ')');
        }
    }

    private DropTargetWidgetContainer(int param0, int param1, int param2, int param3, WidgetRenderer param4, WidgetEventListener param5, UiWidget param6) {
        super(param0, param1, param2, param3, param4, param5);
        try {
          this.field_H = param6;
        } catch (RuntimeException runtimeException) {
          throw TextLineMetrics.a((Throwable) ((Object) runtimeException), "s.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    final static int a(bn param0, bn param1, byte param2) {
        RuntimeException var3 = null;
        String var4 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 >= -84) {
            DropTargetWidgetContainer.clearStaticReferences((byte) 110);
          }
          var4 = (String) null;
          stackIn_3_0 = ai.a(0, (String) null, param0, false, 0, 126, param1);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("s.B(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw TextLineMetrics.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(')').toString());
        }
    }

    static {
        field_L = "S";
        field_J = "Close";
        field_K = false;
    }
}
