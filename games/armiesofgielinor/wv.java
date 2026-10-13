/*
 * Decompiled by CFR-JS 0.4.0.
 */
class wv extends af {
    private long field_f;
    static RgbSprite[] field_h;
    static String field_d;
    private String field_i;
    static int[] field_g;
    static String field_e;

    final void a(PacketBuffer param0, int param1) {
        try {
          param0.writeLong(this.field_f, 38359632);
          param0.a(-28, this.field_i);
          if (param1 != -11436) {
            PacketBuffer var4 = (PacketBuffer) null;
            this.a((PacketBuffer) null, 16);
          }
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "wv.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void c(byte param0) {
        field_h = null;
        if (param0 == -3) {
          field_e = null;
          field_g = null;
          field_d = null;
          return;
        }
        wv.c((byte) 69);
        field_e = null;
        field_g = null;
        field_d = null;
    }

    final static void a(String param0, int param1, int param2) {
        int var3_int = 0;
        try {
          if (param1 != 10) {
            String var4 = (String) null;
            wv.a((String) null, -77, -29);
          }
          DeployAction.field_A = false;
          ac.field_n = false;
          if (qc.field_a != null &&
            qc.field_a.open) {
            if (8 != param2) {
            } else {
              if (!fh.field_i) {
                param0 = rs.field_x;
              } else {
                param0 = ConsoleTextNode.field_o;
              }
              param2 = 2;
              ContextActionMenu.field_Qb.a(-17376, IsaacRandom.field_d);
            }
            var3_int = 1;
            if (param2 == 10) {
              ek.a((byte) -99);
              var3_int = 0;
            }
            if (var3_int != 0) {
              if (DeployAction.field_A) {
                param0 = fo.a(4800, field_d, new String[]{param0});
              }
              if (se.field_f) {
                param0 = SummonAction.field_D;
              }
              qc.field_a.a(param2, (byte) 98, param0);
            }
            if (param2 != 256 &&
              10 != param2 &&
              !fh.field_i) {
              ContextActionMenu.field_Qb.a((byte) -111);
              return;
            }
          }
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "wv.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    h a(byte param0) {
        int var2 = -93 / ((param0 + 63) / 45);
        return fl.field_u;
    }

    wv(long param0, String param1) {
        try {
          this.field_i = param1;
          this.field_f = param0;
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "wv.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_g = new int[]{0, 130, 0, 0, 10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 80, 0, 0, 0, 0, 0, 0, 0, 0, 0, 100, 0, 0, 0, 0, 0, 0, 0, 0, -30, 120, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 50, 0, 0, 0, 0, 0, 0, 0, 30, 0, 0, 30, -30, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        field_d = "Connection lost. <%0>";
        field_e = "Purchase";
    }
}
