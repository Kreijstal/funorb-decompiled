/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class im {
    static GraphicsToolkit field_c;
    static ToolkitSprite field_a;
    static IntrusiveDeque field_b;

    public static void releaseStatics(boolean param0) {
        if (!param0) {
          return;
        }
        field_a = null;
        field_b = null;
        field_c = null;
    }

    final static AccountServiceResult pollNameAvailability(byte guard, String name) {
        RuntimeException var2 = null;
        Object stackIn_4_0 = null;
        AccountServiceResult stackIn_8_0 = null;
        Object stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (guard > -23) {
            field_c = (GraphicsToolkit) null;
          }
          if (LegacyOpenGlGraphicsHeap.PENDING == vm.nameAvailabilityState) {
            stackIn_4_0 = null;
            return (AccountServiceResult) (stackIn_4_0);
          }
          if (DropTargetWidget.COMPLETE == vm.nameAvailabilityState &&
            name.equals(PowerupPickup.field_s)) {
            vm.nameAvailabilityState = AccountRequestDefaults.IDLE;
            stackIn_8_0 = DraggableWidget.field_z;
            return stackIn_8_0;
          }
          DraggableWidget.field_z = null;
          vm.nameAvailabilityState = LegacyOpenGlGraphicsHeap.PENDING;
          PowerupPickup.field_s = name;
          stackIn_10_0 = null;
          return (AccountServiceResult) (stackIn_10_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_13_0 = var2;
          stackIn_13_1 = new StringBuilder().append("im.A(").append(guard).append(',');
          if (name == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    static {
        field_c = null;
    }
}
