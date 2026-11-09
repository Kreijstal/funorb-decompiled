/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SessionStatisticsSubmission extends IntrusiveNode {
    int field_k;
    int[] values;
    int field_n;
    long entryId;
    int field_p;
    int field_o;
    int tableId;
    static String returnToGameText;
    int variantId;
    int requestId;

    public static void releaseStatics(boolean param0) {
        returnToGameText = null;
        if (param0) {
          returnToGameText = (String) null;
        }
    }

    final static ToolkitRasterBuffer createToolkitRasterBuffer(int width, int height, java.awt.Canvas canvas, int guard) {
        try {
          Class var4 = null;
          Throwable var4_ref = null;
          RuntimeException var4_ref2 = null;
          ToolkitRasterBuffer var5 = null;
          ToolkitImageProducerBuffer var5_ref = null;
          ToolkitRasterBuffer stackIn_3_0 = null;
          ToolkitImageProducerBuffer stackIn_5_0 = null;
          RuntimeException stackIn_8_0 = null;
          StringBuilder stackIn_8_1 = null;
          String stackIn_9_2 = null;
          Throwable decompiledCaughtException = null;
          try {
            try {
              var4 = Class.forName("ToolkitBufferedImageBuffer");
              if (guard > -83) {
                returnToGameText = (String) null;
              }
              var5 = (ToolkitRasterBuffer) (var4.newInstance());
              var5.initialize(canvas, height, width, 122);
              stackIn_3_0 = var5;
              return stackIn_3_0;
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var4_ref = decompiledCaughtException;
              var5_ref = new ToolkitImageProducerBuffer();
              ((ToolkitRasterBuffer) ((Object) var5_ref)).initialize(canvas, height, width, -108);
              stackIn_5_0 = var5_ref;
              return (ToolkitRasterBuffer) ((Object) stackIn_5_0);
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var4_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_8_0 = var4_ref2;
            stackIn_8_1 = new StringBuilder().append("id.A(").append(width).append(',').append(height).append(',');
            if (canvas == null) {
              stackIn_9_2 = "null";
            } else {
              stackIn_9_2 = "{...}";
            }
            throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(guard).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    SessionStatisticsSubmission(int tableId, int variantId, int firstCounter, int secondCounter, int thirdCounter, int fourthCounter, int[] values) {
        int fieldTemp$0 = 0;
        try {
          this.field_n = firstCounter;
          this.values = values;
          fieldTemp$0 = DropDownWidget.field_D;
          DropDownWidget.field_D = DropDownWidget.field_D + 1;
          this.requestId = 65535 & fieldTemp$0;
          this.variantId = variantId;
          this.field_p = thirdCounter;
          this.field_o = secondCounter;
          this.field_k = fourthCounter;
          this.tableId = tableId;
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "id.<init>(" + tableId + ',' + variantId + ',' + firstCounter + ',' + secondCounter + ',' + thirdCounter + ',' + fourthCounter + ',' + (values != null ? "{...}" : "null") + ')');
        }
    }

    static {
        returnToGameText = "Return to game";
    }
}
