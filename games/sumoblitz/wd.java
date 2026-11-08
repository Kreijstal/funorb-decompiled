/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wd extends se {
    private String field_i;
    static GameKeyHandler field_e;
    private String field_g;
    static ResourceArchive field_j;
    static String continueText;
    static AudioOutput field_f;

    final static ResourceArchive a(int param0, byte param1) {
        if (param1 == 125) {
          return ng.a(1, -74, true, param0, false, false);
        }
        field_e = (GameKeyHandler) null;
        return ng.a(1, -74, true, param0, false, false);
    }

    final void a(PacketBuffer param0, byte param1) {
        try {
          param0.b(this.field_i, (byte) -105);
          param0.a(this.field_g, 46);
          if (param1 >= -107) {
            PacketBuffer var4 = (PacketBuffer) null;
            this.a((PacketBuffer) null, (byte) 29);
          }
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "wd.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void a(byte param0, int param1) {
        int var2 = -16 / ((18 - param0) / 60);
        fq.field_f.a(-3388, param1);
    }

    final nb a(byte param0) {
        if (param0 < 80) {
          this.a((byte) -128);
          return pb.field_b;
        }
        return pb.field_b;
    }

    public static void releaseStatics(byte param0) {
        if (param0 == 88) {
          field_j = null;
          field_f = null;
          continueText = null;
          field_e = null;
          return;
        }
        continueText = (String) null;
        field_j = null;
        field_f = null;
        continueText = null;
        field_e = null;
    }

    final static boolean c(int param0) {
        Object var1 = null;
        Object var1_ref = null;
        Throwable var2 = null;
        boolean stackIn_7_0 = false;
        Throwable decompiledCaughtException = null;
        var1_ref = field_e;
        synchronized (var1_ref) {
          if (param0 > -20) {
            continueText = (String) null;
          }
          if (ua.field_a == bj.field_a) {
            return false;
          }
          tg.field_a = cp.field_c[bj.field_a];
          np.field_c = SpriteMask.field_c[bj.field_a];
          bj.field_a = bj.field_a + 1 & 127;
          stackIn_7_0 = true;
        }
        return stackIn_7_0;
    }

    wd(String param0, String param1) {
        try {
          this.field_i = param0;
          this.field_g = param1;
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "wd.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_e = new GameKeyHandler();
        continueText = "Continue";
    }
}
