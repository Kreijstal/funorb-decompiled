/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wd {
    static Sprite contactProbeRaster;
    static int field_d;
    static int field_a;
    static IntrusiveDeque spawnQueue;
    private DualLinkNode field_g;
    static String field_f;
    private DualLinkNode field_c;

    final DualLinkNode a(int param0) {
        int var3 = -123 % ((param0 - 21) / 32);
        DualLinkNode var2 = this.field_c;
        if (this.field_g != var2) {
            this.field_c = var2.nextSecondaryNode;
            return var2;
        }
        this.field_c = null;
        return null;
    }

    public static void b(int param0) {
        contactProbeRaster = null;
        if (param0 != -10943) {
            field_f = (String) null;
            field_f = null;
            spawnQueue = null;
            return;
        }
        field_f = null;
        spawnQueue = null;
    }

    final void a(DualLinkNode param0, boolean param1) {
        if (!(param0.previousSecondaryNode == null)) {
            param0.unlinkSecondaryNode((byte) 45);
        }
        param0.nextSecondaryNode = this.field_g.nextSecondaryNode;
        param0.previousSecondaryNode = this.field_g;
        if (param1) {
            return;
        }
        try {
            param0.previousSecondaryNode.nextSecondaryNode = param0;
            param0.nextSecondaryNode.previousSecondaryNode = param0;
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "wd.L(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void c(int param0) {
        kb.b(-120);
        if (param0 != 480) {
            field_d = -37;
        }
    }

    final DualLinkNode a(boolean param0) {
        DualLinkNode var2 = this.field_g.nextSecondaryNode;
        if (!param0) {
            wd.a((byte) -92);
            if (this.field_g != var2) {
                var2.unlinkSecondaryNode((byte) 65);
                return var2;
            }
            return null;
        }
        if (this.field_g != var2) {
            var2.unlinkSecondaryNode((byte) 65);
            return var2;
        }
        return null;
    }

    final int b(byte param0) {
        DualLinkNode var3 = null;
        int var4 = Geoblox.field_C;
        int var2 = 0;
        if (param0 == 67) {
            var3 = this.field_g.nextSecondaryNode;
            while (this.field_g != var3) {
                var3 = var3.nextSecondaryNode;
                var2++;
            }
            return var2;
        }
        contactProbeRaster = (Sprite) null;
        var3 = this.field_g.nextSecondaryNode;
        while (this.field_g != var3) {
            var3 = var3.nextSecondaryNode;
            var2++;
        }
        return var2;
    }

    final void a(int param0, DualLinkNode param1) {
        try {
            if (!(param1.previousSecondaryNode == null)) {
                param1.unlinkSecondaryNode((byte) 62);
            }
            int var3_int = -75 % ((param0 - 62) / 46);
            param1.previousSecondaryNode = this.field_g.previousSecondaryNode;
            param1.nextSecondaryNode = this.field_g;
            param1.previousSecondaryNode.nextSecondaryNode = param1;
            param1.nextSecondaryNode.previousSecondaryNode = param1;
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "wd.I(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(byte param0) {
        jk.field_d = 2;
        if (param0 < 45) {
            wd.a(true, -75);
        }
    }

    final static void a(boolean param0, int param1) {
        RuntimeException var2 = null;
        int var3 = 0;
        re var4 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = Geoblox.field_C;
        try {
          L0: {
            var4 = (re) ((Object) PendingActionMarker.field_f.firstForIteration(0));
            L1: while (var4 != null) {
              ik.a(var4, param1, (byte) 107);
              var4 = (re) ((Object) PendingActionMarker.field_f.nextForIteration(1));
            }
            if (param0) {
              break L0;
            } else {
              field_a = -80;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var2), "wd.K(" + param0 + ',' + param1 + ')');
        }
    }

    final static void a(byte param0, String param1) {
        try {
            if (param0 != 69) {
                field_a = 99;
            }
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "wd.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public wd() {
        this.field_g = new DualLinkNode();
        this.field_g.nextSecondaryNode = this.field_g;
        this.field_g.previousSecondaryNode = this.field_g;
    }

    final static df a(boolean param0, long param1, String param2, String param3, boolean param4) {
        RuntimeException var6 = null;
        th stackIn_7_0 = null;
        nk stackIn_9_0 = null;
        lf stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (!param0) {
              field_f = (String) null;
            }
            if (param1 == 0L) {
              if (param2 != null) {
                stackIn_9_0 = new nk(param2, param3);
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
            if (!param4) {
              stackIn_11_0 = new lf(param1, param3);
              decompiledRegionSelector0 = 2;
            } else {
              stackIn_7_0 = new th(param1, param3);
              decompiledRegionSelector0 = 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_14_0 = (RuntimeException) (var6);

          stackIn_14_1 = new StringBuilder().append("wd.G(").append(param0).append(',').append(param1).append(',');

          if (param2 == null) {
            stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
            stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
            stackIn_15_2 = "null";
          } else {
            stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
            stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
            stackIn_15_2 = "{...}";
          }


          stackIn_17_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',');

          if (param3 == null) {
            stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
            stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
            stackIn_18_2 = "null";
          } else {
            stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
            stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
            stackIn_18_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_15_0), stackIn_18_2 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (df) ((Object) stackIn_7_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (df) ((Object) stackIn_9_0);
          } else {
            return (df) ((Object) stackIn_11_0);
          }
        }
    }

    final DualLinkNode c(byte param0) {
        DualLinkNode var2 = this.field_g.nextSecondaryNode;
        if (var2 == this.field_g) {
            this.field_c = null;
            return null;
        }
        this.field_c = var2.nextSecondaryNode;
        if (param0 == 121) {
            return var2;
        }
        wd.b(67);
        return var2;
    }

    static {
        contactProbeRaster = new Sprite(460, 460);
        field_d = (-contactProbeRaster.field_o + 480) / 2;
        field_a = (640 + -contactProbeRaster.field_s) / 2;
        spawnQueue = new IntrusiveDeque();
    }
}
