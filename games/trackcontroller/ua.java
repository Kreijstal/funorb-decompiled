/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ua extends rh {
    private eh field_I;
    static ri field_L;
    static String field_K;
    private int field_J;

    final String e(int param0) {
        if (this.field_q) {
          return this.field_I.c(15914);
        }
        if (param0 != 0) {
          this.e(-5);
          return null;
        }
        return null;
    }

    final boolean a(byte param0, al param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 < -104) {
            return false;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("ua.QA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw sl.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    public static void j(int param0) {
        if (param0 > -109) {
          ua.j(37);
          field_L = null;
          field_K = null;
          return;
        }
        field_L = null;
        field_K = null;
    }

    final void a(int param0, int param1, byte param2, al param3) {
        try {
          this.field_J = this.field_J + 1;
          super.a(param0, param1, param2, param3);
        } catch (RuntimeException runtimeException) {
          throw sl.a((Throwable) ((Object) runtimeException), "ua.EA(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var5;
        int var6;
        ud var8;
        int var9;
        int var10;
        int var11;
        qj var13;
        qj var14;
        qj var15;
        qj var16;
        int var9Lifetime1;
        int var10Lifetime1;
        var11 = TrackController.field_F ? 1 : 0;
        super.a(param0, param1, param2, param3);
        if (param0 != 0) {
          return;
        }
        var5 = param1 + this.field_p + (this.field_x >> 1);
        var6 = (this.field_u >> 1) + this.field_m + param2;
        var8 = this.field_I.a((byte) -58);
        if (lh.field_x == var8) {
          var16 = TrackController.field_D[0];
          var9 = var16.field_s << 1;
          var10 = var16.field_v << 1;
          if (bl.field_a == null) {
            bl.field_a = new qj(var9, var10);
            mb.a((byte) 122, bl.field_a);
          } else {
            if (var9 > bl.field_a.field_t) {
              bl.field_a = new qj(var9, var10);
              mb.a((byte) 122, bl.field_a);
            } else {
              if (bl.field_a.field_q >= var10) {
                mb.a((byte) -103, bl.field_a);
                ll.a();
              } else {
                bl.field_a = new qj(var9, var10);
                mb.a((byte) 122, bl.field_a);
              }
            }
          }
          var16.a(112, 144, var16.field_s << 4, var16.field_v << 4, -this.field_J << 10, 4096);
          ch.m(-74);
          bl.field_a.a(-var16.field_s + var5, -var16.field_v + var6, 256);
          return;
        }
        if (tk.field_t != var8) {
          if (var8 == ef.field_b) {
            var13 = TrackController.field_D[2];
            var13.a(-(var13.field_t >> 1) + var5, var6 - (var13.field_q >> 1), 256);
            return;
          }
          if (TrackController.field_G != var8) {
            return;
          }
          var14 = TrackController.field_D[1];
          var14.a(-(var14.field_t >> 1) + var5, -(var14.field_q >> 1) + var6, 256);
          return;
        }
        var15 = TrackController.field_D[0];
        var9Lifetime1 = var15.field_s << 1;
        var10Lifetime1 = var15.field_v << 1;
        if (bl.field_a == null) {
          bl.field_a = new qj(var9Lifetime1, var10Lifetime1);
          mb.a((byte) 122, bl.field_a);
        } else {
          if (var9Lifetime1 > bl.field_a.field_t) {
            bl.field_a = new qj(var9Lifetime1, var10Lifetime1);
            mb.a((byte) 122, bl.field_a);
          } else {
            if (bl.field_a.field_q >= var10Lifetime1) {
              mb.a((byte) -103, bl.field_a);
              ll.a();
            } else {
              bl.field_a = new qj(var9Lifetime1, var10Lifetime1);
              mb.a((byte) 122, bl.field_a);
            }
          }
        }
        var15.a(112, 144, var15.field_s << 4, var15.field_v << 4, -this.field_J << 10, 4096);
        ch.m(-74);
        bl.field_a.a(-var15.field_s + var5, -var15.field_v + var6, 256);
    }

    ua(eh param0) {
        try {
          this.field_I = param0;
        } catch (RuntimeException runtimeException) {
          throw sl.a((Throwable) ((Object) runtimeException), "ua.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_K = "Fullscreen";
    }
}
