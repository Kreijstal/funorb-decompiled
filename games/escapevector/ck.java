/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ck extends TextWidgetPainter {
    static fc field_A;
    private int field_w;
    private Sprite[] field_s;
    private int field_z;
    static hf field_t;
    static ResourceArchive field_x;
    static GameKeyHandler field_v;
    private int field_y;
    static String[] field_u;
    static String field_r;
    static long field_q;

    final static void a(int param0, byte param1) {
        int var3 = EscapeVector.obfuscationControl;
        try {
          ik var4 = (ik) (vj.field_d.first(false));
          while (var4 != null) {
            ig.a(param1 - 209, param0, var4);
            var4 = (ik) (vj.field_d.next((byte) 70));
          }
          if (param1 != 105) {
            field_q = -25L;
          }
          ij var5 = (ij) (qd.field_n.first(false));
          while (var5 != null) {
            aj.a(42, param0, var5);
            var5 = (ij) (qd.field_n.next((byte) 70));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var2 = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var2), "ck.K(" + param0 + ',' + param1 + ')');
        }
    }

    public static void releaseStatics(byte guard) {
        field_r = null;
        field_u = null;
        field_v = null;
        field_x = null;
        field_A = null;
        field_t = null;
        if (guard != -31) {
          ck.releaseStatics((byte) 116);
        }
    }

    public final void drawWidget(int originX, int originY, int guard, UiComponent component, boolean enabled) {
        boolean stackIn_6_0 = false;
        int stackIn_13_0 = 0;
        String stackIn_23_2 = null;
        try {
          if (!component.hovered) {
            stackIn_6_0 = (component.isFocused(0));
          } else {
            stackIn_6_0 = true;
          }
          boolean var6_int = stackIn_6_0;
          if (component instanceof TextButton) {
            enabled = enabled & ((TextButton) (component)).enabled;
          }
          if (!enabled) {
            stackIn_13_0 = this.field_z;
          } else if (var6_int) {
            stackIn_13_0 = this.field_w;
          } else {
            stackIn_13_0 = this.field_y;
          }
          int var7 = stackIn_13_0;
          int stackIn_16_0 = (!enabled) ? 7105644 : 16777215;
          int var8 = stackIn_16_0;
          if (guard >= -14) {
            this.field_w = -93;
          }
          qe.a(-100, component.y + (originY + (-this.field_s[0].fullHeight + component.height >> 1)), component.width, this.field_s, var7, originX + component.x);
          this.font.a(component.text, originX + component.x, component.y + originY - 2, component.width, component.height, var8, -1, 1, 1, this.font.field_r);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var6 = decompiledCaughtException;
          RuntimeException stackIn_22_0 = var6;
          StringBuilder stackIn_22_1 = new StringBuilder().append("ck.M(").append(originX).append(',').append(originY).append(',').append(guard).append(',');
          if (component == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(enabled).append(')').toString());
        }
    }

    public ck() {
        this(2188450, 2591221, 9543);
    }

    private ck(int param0, int param1, int param2) {
        this.field_z = param2;
        this.field_w = param1;
        this.field_s = fk.field_f;
        this.font = dl.field_b;
        this.field_y = param0;
    }

    final static void a(int param0, int param1) {
        if (bk.field_r != null) {
          bk.field_r.b(-1, param1);
        }
        if (param0 < 42) {
          field_q = -72L;
          return;
        }
    }

    static {
        field_A = new fc();
        field_t = new hf();
        field_u = new String[]{"Anti-gravity", "Breach", "Cataclysm", "Dash", "Deep Vertigo", "Divided", "Explosive Exit", "Gravity Chamber", "Mine Field", "Orb", "Pinball", "Pulse", "Slanted Mines", "Upwards and Onwards", "Asteroids Normal", "Asteroids"};
        field_v = new GameKeyHandler();
    }
}
