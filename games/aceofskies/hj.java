/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hj extends java.awt.Canvas implements java.awt.event.FocusListener {
    java.awt.Frame field_a;
    volatile boolean field_b;

    final static void a(java.awt.Canvas param0, int param1) {
        try {
          if (param1 == ~SoundCache.field_d) {
            st.a((byte) 87);
          }
          hr.a(NetworkGameClient.loadingPercent, 0, w.field_a, dq.loadingMessage);
          ArchiveIndex.a(0, false, param0, 0);
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "hj.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final void focusLost(java.awt.event.FocusEvent param0) {
        try {
          this.field_b = true;
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "hj.focusLost(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final void update(java.awt.Graphics param0) {
    }

    public final void paint(java.awt.Graphics param0) {
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    final void a(byte param0, rk param1) {
        try {
          ke.a(973, param1, this.field_a);
          if (param0 != 87) {
            java.awt.Canvas var4 = (java.awt.Canvas) null;
            hj.a((java.awt.Canvas) null, 95);
          }
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "hj.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static Sprite a(boolean param0, int param1, int param2, ResourceArchive param3) {
        RuntimeException var4 = null;
        Sprite stackIn_2_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0) {
            stackIn_2_0 = (Sprite) null;
            return stackIn_2_0;
          }
          if (tn.a(param3, (byte) -127, param1, param2)) {
            return fu.b(30346);
          }
          return null;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_9_0 = var4;
          stackIn_9_1 = new StringBuilder().append("hj.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    hj() {
    }

    static {
    }
}
