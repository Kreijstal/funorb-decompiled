/*
 * Decompiled by CFR-JS 0.4.0.
 */
class DualLinkNode extends IntrusiveNode {
    static p field_g;
    DualLinkNode secondaryNext;
    long field_j;
    DualLinkNode secondaryPrevious;
    static volatile int field_i;
    static pf field_k;
    static String[] field_h;
    static PcmStreamMixer field_l;

    final static String a(int param0, int param1, char param2) {
        int var4 = 0;
        int var5 = StarCannon.field_A;
        char[] var6 = new char[param0];
        char[] var3 = var6;
        for (var4 = param1; param0 > var4; var4++) {
          var6[var4] = param2;
        }
        return new String(var6);
    }

    final static String a(int param0, byte[] param1) {
        RuntimeException var2 = null;
        String stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 <= 111) {
            field_h = (String[]) null;
          }
          stackIn_3_0 = va.a(0, 83, param1, param1.length);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("uh.RB(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    public static void b(byte param0) {
        int var1 = -50 % ((param0 - 2) / 46);
        field_l = null;
        field_k = null;
        field_g = null;
        field_h = null;
    }

    final static Sprite c(byte param0) {
        int var4_int = 0;
        int var5 = StarCannon.field_A;
        int var1 = gg.field_d[0] * gh.field_C[0];
        byte[] var2 = og.field_c[0];
        int[] var3 = new int[var1];
        for (var4_int = 0; var1 > var4_int; var4_int++) {
          var3[var4_int] = of.field_g[w.a(255, (int) var2[var4_int])];
        }
        Sprite var4 = new Sprite(td.field_m, gb.field_w, fc.field_d[0], qd.field_H[0], gg.field_d[0], gh.field_C[0], var3);
        if (param0 >= 2) {
          rc.b((byte) -121);
          return var4;
        }
        field_i = 55;
        rc.b((byte) -121);
        return var4;
    }

    protected DualLinkNode() {
    }

    final void a(int param0) {
        if (this.secondaryPrevious == null) {
          return;
        }
        this.secondaryPrevious.secondaryNext = this.secondaryNext;
        this.secondaryNext.secondaryPrevious = this.secondaryPrevious;
        this.secondaryPrevious = null;
        this.secondaryNext = null;
        if (param0 != -6242) {
          field_h = (String[]) null;
        }
    }

    static {
        field_g = new p();
        field_i = 0;
    }
}
