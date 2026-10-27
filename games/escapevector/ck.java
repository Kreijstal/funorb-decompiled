/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ck extends k {
    static fc field_A;
    private int field_w;
    private Sprite[] field_s;
    private int field_z;
    static hf field_t;
    static mf field_x;
    static ag field_v;
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

    public static void a(byte param0) {
        field_r = null;
        field_u = null;
        field_v = null;
        field_x = null;
        field_A = null;
        field_t = null;
        if (param0 != -31) {
          ck.a((byte) 116);
        }
    }

    public final void a(int param0, int param1, int param2, hm param3, boolean param4) {
        boolean stackIn_6_0 = false;
        int stackIn_13_0 = 0;
        String stackIn_23_2 = null;
        try {
          if (!param3.field_u) {
            stackIn_6_0 = (param3.h(0));
          } else {
            stackIn_6_0 = true;
          }
          boolean var6_int = stackIn_6_0;
          if (param3 instanceof hc) {
            param4 = param4 & ((hc) (param3)).field_y;
          }
          if (!param4) {
            stackIn_13_0 = this.field_z;
          } else if (var6_int) {
            stackIn_13_0 = this.field_w;
          } else {
            stackIn_13_0 = this.field_y;
          }
          int var7 = stackIn_13_0;
          int stackIn_16_0 = (!param4) ? 7105644 : 16777215;
          int var8 = stackIn_16_0;
          if (param2 >= -14) {
            this.field_w = -93;
          }
          qe.a(-100, param3.field_j + (param1 + (-this.field_s[0].fullHeight + param3.field_x >> 1)), param3.field_g, this.field_s, var7, param0 + param3.field_k);
          this.field_l.a(param3.field_l, param0 + param3.field_k, param3.field_j + param1 - 2, param3.field_g, param3.field_x, var8, -1, 1, 1, this.field_l.field_r);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var6 = decompiledCaughtException;
          RuntimeException stackIn_22_0 = var6;
          StringBuilder stackIn_22_1 = new StringBuilder().append("ck.M(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param4).append(')').toString());
        }
    }

    public ck() {
        this(2188450, 2591221, 9543);
    }

    private ck(int param0, int param1, int param2) {
        this.field_z = param2;
        this.field_w = param1;
        this.field_s = fk.field_f;
        this.field_l = dl.field_b;
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
        field_v = new ag();
    }
}
