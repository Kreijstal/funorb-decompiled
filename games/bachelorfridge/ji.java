/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ji extends IntrusiveNode {
    int field_h;
    static int[] field_i;
    static String field_g;
    static jg field_f;

    final static void a(int param0, String param1) {
        int stackIn_19_0 = 0;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_44_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        var3 = BachelorFridge.field_y;
        try {
          if (param0 >= -87) {
            ji.releaseStatics(-69);
          }
          if (ld.field_n == -1 &&
            hda.field_o == -1) {
            ld.field_n = mk.field_p;
            hda.field_o = gd.field_m;
          }
          boolean decompiledFrameRemainder0 = true;
          MoveEvent.field_o = MoveEvent.field_o + 1;
          if (param1 != null) {
            decompiledFrameRemainder0 = !(param1.equals(ov.field_g));
          } else {
            decompiledFrameRemainder0 = (null == ov.field_g);
          }
          if (decompiledFrameRemainder0) {
            if (!b.field_r) {
              if (pv.field_i <= MoveEvent.field_o) {
                stackIn_19_0 = (pv.field_i + MoveDefinition.field_i > MoveEvent.field_o) ? 1 : 0;
              } else {
                stackIn_19_0 = 0;
              }
            } else {
              stackIn_19_0 = 0;
            }
            var2_int = stackIn_19_0;
            if (param1 == null) {
              MoveEvent.field_o = 0;
            } else {
              if (b.field_r) {
                MoveEvent.field_o = pv.field_i;
              } else {
                if (var2_int != 0) {
                  MoveEvent.field_o = pv.field_i;
                } else {
                  MoveEvent.field_o = 0;
                }
              }
            }
            if (param1 != null) {
              b.field_r = false;
            } else {
              if (var2_int != 0) {
                b.field_r = true;
              }
            }
            SuperSpeedEvent.field_s = ld.field_n;
            IntrusiveDeque.field_b = hda.field_o;
          }
          ov.field_g = param1;
          if (!b.field_r &&
            pv.field_i > MoveEvent.field_o &&
            dda.field_f) {
            SuperSpeedEvent.field_s = ld.field_n;
            MoveEvent.field_o = 0;
            IntrusiveDeque.field_b = hda.field_o;
          }
          ld.field_n = -1;
          hda.field_o = -1;
          if (b.field_r &&
            MoveEvent.field_o == lfa.field_o) {
            MoveEvent.field_o = 0;
            b.field_r = false;
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_43_0 = var2;
          stackIn_43_1 = new StringBuilder().append("ji.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_44_2 = "null";
          } else {
            stackIn_44_2 = "{...}";
          }
          throw pe.wrapException((Throwable) ((Object) stackIn_43_0), ((StringBuilder) (Object) stackIn_43_1).append(stackIn_44_2).append(')').toString());
        }
    }

    ji(int param0) {
        this.field_h = param0;
    }

    final static void a(boolean param0, int param1) {
        if (param1 >= 40) {
          jna.a(true, param0);
          hda.a((byte) -91, param0);
          return;
        }
        field_f = (jg) null;
        jna.a(true, param0);
        hda.a((byte) -91, param0);
    }

    public static void releaseStatics(int param0) {
        field_f = null;
        field_g = null;
        if (param0 < 10) {
          ji.releaseStatics(111);
          field_i = null;
          return;
        }
        field_i = null;
    }

    static {
        field_g = "Username: ";
        field_i = new int[8192];
        field_f = new jg();
    }
}
