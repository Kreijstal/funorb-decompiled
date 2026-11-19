/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lh {
    static int field_b;
    static LoginForm field_a;

    final static void a(java.awt.Component param0, boolean param1) {
        param0.removeKeyListener(MusicCrossfadeStream.field_n);
        param0.removeFocusListener(MusicCrossfadeStream.field_n);
        if (param1) {
          return;
        }
        try {
          DraggableWidget.field_J = -1;
        } catch (RuntimeException runtimeException) {
          throw EntitySound.wrapException((Throwable) ((Object) runtimeException), "lh.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static SocketConnector a(int param0, String param1, int param2) {
        ProxySocketConnector var3 = null;
        RuntimeException var3_ref = null;
        SocketConnector stackIn_2_0 = null;
        ProxySocketConnector stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = new ProxySocketConnector();
          ((SocketConnector) ((Object) var3)).field_d = param0;
          ((SocketConnector) ((Object) var3)).field_c = param1;
          if (param2 == -1) {
            stackIn_4_0 = var3;
            return (SocketConnector) ((Object) stackIn_4_0);
          }
          stackIn_2_0 = (SocketConnector) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_7_0 = var3_ref;
          stackIn_7_1 = new StringBuilder().append("lh.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param2).append(')').toString());
        }
    }

    final static void a(PlatformTaskDispatcher param0, int param1, java.awt.Component param2) {
        try {
          SecondaryNodeDequeIterator.field_d = new MusicCrossfadeStream();
          SecondaryNodeDequeIterator.field_d.field_q.d(128, -13549, 9);
          SecondaryNodeDequeIterator.field_d.field_q.a(NanoTickClock.field_e, false);
          SecondaryNodeDequeIterator.field_d.field_C.d(128, -13549, 9);
          SecondaryNodeDequeIterator.field_d.field_C.a(NanoTickClock.field_e, false);
          int var3_int = -54 % ((param1 - 11) / 55);
          TrackCurve.a((byte) -111, param0, param2, 22050, 1102, true, 22050, SecondaryNodeDequeIterator.field_d);
          ll.a(-114, 160);
          pc.field_h = 256;
          MovingEntity var4 = (MovingEntity) null;
          sa.a((MovingEntity) null, -15676);
        } catch (RuntimeException runtimeException) {
          throw EntitySound.wrapException((Throwable) ((Object) runtimeException), "lh.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    public static void clearSharedReferences(byte param0) {
        field_a = null;
        if (param0 > -29) {
          lh.clearSharedReferences((byte) 28);
        }
    }

    static {
    }
}
