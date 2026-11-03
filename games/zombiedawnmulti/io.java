/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class io {
    static boolean field_b;
    private int field_f;
    private IterableNodeHashTable field_j;
    static String field_e;
    static boolean field_g;
    private int field_i;
    private SecondaryNodeDeque field_c;
    static String field_d;
    static String field_a;
    static String field_h;

    private final void a(int param0, Object param1, long param2, int param3) {
        kk var9 = null;
        eg var6 = null;
        int var8 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          if (this.field_i < param0) {
            throw new IllegalStateException();
          }
          this.a(param2, false);
          this.field_f = this.field_f - param0;
          while (this.field_f < 0) {
            var9 = (kk) (this.field_c.a(false));
            this.a(1, var9);
          }
          var6 = new eg(param1, param0);
          this.field_j.a(param2, (byte) -19, var6);
          this.field_c.a(var6, (byte) 94);
          int var7 = 91 / ((param3 - 82) / 44);
          ((kk) ((Object) var6)).secondaryKey = 0L;
        } catch (RuntimeException runtimeException) {
          throw fa.a((Throwable) ((Object) runtimeException), "io.I(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    io(int param0) {
        this(param0, param0);
    }

    final static void a(int param0, UiComponent param1, UiComponent param2, UiComponent param3, UiComponent param4) {
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        String var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        String var7 = null;
        var6 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          if (NavigationGrid.field_m != null) {
            return;
          }
          sq.field_N = false;
          if (nh.field_m) {
            var5 = t.field_a;
          } else {
            if (SimPortal.field_L) {
              var5 = GameScreen.field_v;
            } else {
              var5 = pd.field_e;
            }
          }
          var7 = (String) null;
          IterableNodeHashTable.a(6, wj.field_g, 0, var5, (String) null);
          ke.field_j = ua.field_E;
          NavigationGrid.field_m = ec.field_b;
          ec.field_b.field_xb = (8355711 & qq.field_f.field_xb >> 1) + wj.field_g - (8355711 & wj.field_g >> 1);
          ec.field_b.field_Db = (8355711 & qq.field_f.field_Db >> 1) + (wj.field_g - (8355711 & wj.field_g >> 1));
          ec.field_b.field_ob = wj.field_g - (8355711 & wj.field_g >> 1) + (qq.field_f.field_ob >> 1 & param0);
          lj.field_v = new UiComponent(0L, param3);
          SpriteState.field_t = new UiComponent(0L, param2);
          re.field_a = new UiComponent(0L, (UiComponent) null);
          IntrusiveNode.field_c = new UiComponent(0L, param1);
          ec.field_b = new UiComponent(0L, param4);
          ec.field_b.field_yb = w.field_A;
          IntrusiveNode.field_c.a((byte) 50, ec.field_b);
          ua.field_E = new UiComponent(0L, ke.field_j);
          IntrusiveNode.field_c.a((byte) 50, ua.field_E);
          dp.field_c = new UiComponent(0L, qq.field_f, bg.field_o);
          jk.field_d = new UiComponent(0L, qq.field_f);
          lj.field_v.a((byte) 50, SpriteState.field_t);
          lj.field_v.a((byte) 50, re.field_a);
          re.field_a.a((byte) 50, IntrusiveNode.field_c);
          re.field_a.a((byte) 50, dp.field_c);
          re.field_a.a((byte) 50, jk.field_d);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_12_0 = var5_ref;
          stackIn_12_1 = new StringBuilder().append("io.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param2 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',');
          if (param3 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',');
          if (param4 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(')').toString());
        }
    }

    final static void a(int param0, boolean param1, boolean param2) {
        String var5 = (String) null;
        oi.$cfr$intArgs$a$88c6728ee5b1((String) null, param2, -67, param1);
        if (param0 != -21113) {
          UiComponent var4 = (UiComponent) null;
          io.a(3, (UiComponent) null, (UiComponent) null, (UiComponent) null, (UiComponent) null);
        }
    }

    public static void a(byte param0) {
        field_a = null;
        if (param0 == 8) {
          field_h = null;
          field_d = null;
          field_e = null;
          return;
        }
        field_e = (String) null;
        field_h = null;
        field_d = null;
        field_e = null;
    }

    final static boolean a(int param0, int param1, byte param2, Camera param3) {
        RuntimeException var4 = null;
        Camera var5 = null;
        boolean stackIn_8_0 = false;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 > -72) {
            var5 = (Camera) null;
            io.a(-88, -65, (byte) 96, (Camera) null);
          }
          stackIn_8_0 = (param0 > -48) && (param0 > -48) && (640.0f * param3.zoom > (float)param0) && (param3.zoom * 480.0f > (float)param1);
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_11_0 = var4;
          stackIn_11_1 = new StringBuilder().append("io.F(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    private final void a(long param0, boolean param1) {
        kk var4 = (kk) (this.field_j.get(param0, 72));
        this.a(1, var4);
        if (!param1) {
          return;
        }
        UiComponent var5 = (UiComponent) null;
        io.a(-49, (UiComponent) null, (UiComponent) null, (UiComponent) null, (UiComponent) null);
    }

    private final void a(int param0, kk param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 1) {
            return;
          }
          if (param1 == null) {
            return;
          }
          param1.unlink(true);
          param1.a(param0 ^ -4563);
          this.field_f = this.field_f + param1.field_t;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("io.J(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    final static bo[] a(boolean param0) {
        if (param0) {
          return new bo[]{wp.field_b, RasterBuffer.field_c, wi.field_h};
        }
        return (bo[]) null;
    }

    final void a(Object param0, long param1, int param2) {
        try {
          this.a(param2, param0, param1, -107);
        } catch (RuntimeException runtimeException) {
          throw fa.a((Throwable) ((Object) runtimeException), "io.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    private io(int param0, int param1) {
        int var3;
        this.field_c = new SecondaryNodeDeque();
        this.field_f = param0;
        this.field_i = param0;
        var3 = 1;
        while (true) {
          if (var3 + var3 >= param0) {
            this.field_j = new IterableNodeHashTable(var3);
            return;
          }
          if (var3 < param1) {
            var3 = var3 + var3;
            continue;
          }
          break;
        }
        this.field_j = new IterableNodeHashTable(var3);
        return;
    }

    final Object a(byte param0, long param1) {
        eg var6 = null;
        if (param0 <= 121) {
          return (Object) null;
        }
        kk var7 = (kk) (this.field_j.get(param1, 64));
        if (var7 == null) {
          return null;
        }
        Object var5 = var7.e(-111);
        if (var5 != null) {
          if (!var7.f(1000)) {
            this.field_c.a(var7, (byte) 106);
            var7.secondaryKey = 0L;
          } else {
            var6 = new eg(var5, var7.field_t);
            this.field_j.a(var7.key, (byte) -86, var6);
            this.field_c.a(var6, (byte) 109);
            ((kk) ((Object) var6)).secondaryKey = 0L;
            var7.unlink(true);
            var7.a(-4564);
          }
          return var5;
        }
        var7.unlink(true);
        var7.a(-4564);
        this.field_f = this.field_f + var7.field_t;
        return null;
    }

    static {
        field_e = "ESC - cancel this line";
        field_d = "Resigned";
        field_h = "Show all game chat";
        field_a = "This option cannot be combined with the current '<%0>' setting.";
    }
}
