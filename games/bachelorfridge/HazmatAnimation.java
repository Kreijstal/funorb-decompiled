/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class HazmatAnimation extends EventAnimation {
    static String field_w;
    static IntrusiveDeque field_v;
    private HazmatEvent field_x;

    final boolean isFinished(byte param0) {
        uea var2_ref_uea = null;
        int fieldTemp$0 = this.field_l - 1;
        this.field_l = this.field_l - 1;
        if (fieldTemp$0 > 0) {
          if (25 == this.field_l) {
            jja.a(256, -1, 26);
            var2_ref_uea = new uea(this.screen, this.field_x.field_t, this.field_x.field_r, 16777215);
            ((TileEffect) ((Object) var2_ref_uea)).a(0);
            return false;
          }
          return false;
        }
        int var2 = -29 / ((71 - param0) / 47);
        this.e((byte) -64);
        return true;
    }

    private final void e(byte param0) {
        if (param0 == -64) {
          this.field_x.apply(this.screen.field_h, false);
          return;
        }
        field_v = (IntrusiveDeque) null;
        this.field_x.apply(this.screen.field_h, false);
    }

    final static n b(int param0, String param1) {
        RuntimeException var2 = null;
        String var3 = null;
        n stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -26869) {
            var3 = (String) null;
            HazmatAnimation.b(84, (String) null);
          }
          if (ut.field_m.a(false) &&
            !param1.equals(ut.field_m.b(param0 ^ -2930))) {
            ut.field_m = ida.a(param1, param0 ^ 26686);
          }
          stackIn_6_0 = ut.field_m;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_9_0 = var2;
          stackIn_9_1 = new StringBuilder().append("cca.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw pe.wrapException((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final static void a(PacketBuffer param0, int param1, byte param2, int param3, int param4) {
        try {
          param0.writeByte(12, 0);
          int var5_int = 51 / ((param2 + 3) / 61);
          param0.b(17, -114);
          param0.b(param4, -119);
          param0.b(param1, -117);
          param0.writeByte(param3, 0);
        } catch (RuntimeException runtimeException) {
          throw pe.wrapException((Throwable) ((Object) runtimeException), "cca.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    HazmatAnimation(BattleScreen param0, HazmatEvent param1) {
        super(param0, param1);
        try {
          this.field_x = param1;
        } catch (RuntimeException runtimeException) {
          throw pe.wrapException((Throwable) ((Object) runtimeException), "cca.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void releaseStatics(int param0) {
        if (param0 < 71) {
          return;
        }
        field_v = null;
        field_w = null;
    }

    static {
        field_w = "Stamina</col>";
    }
}
