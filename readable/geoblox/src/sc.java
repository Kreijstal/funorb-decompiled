/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class sc {
    int field_a;
    int[] field_d;
    int field_c;
    static int field_f;
    java.awt.Image field_e;
    static fe field_b;

    abstract void a(int param0, java.awt.Graphics param1, int param2, int param3);

    abstract void a(int param0, java.awt.Component param1, int param2, byte param3);

    final static Sprite a(byte param0) {
        int var4_int = 0;
        int var1 = DualLinkNode.field_j[0] * hl.field_K[0];
        byte[] var2 = mj.field_a[0];
        int[] var3 = new int[var1];
        if (param0 != -60) {
            Random var5 = (Random) null;
            sc.a((byte) 50, (Random) null, 37);
        }
        for (var4_int = 0; var4_int < var1; var4_int++) {
            var3[var4_int] = cm.field_j[cd.a(255, (int) var2[var4_int])];
        }
        Sprite var4 = new Sprite(pg.field_b, dd.field_C, GameplaySession.field_m[0], md.field_e[0], DualLinkNode.field_j[0], hl.field_K[0], var3);
        kj.c(true);
        return var4;
    }

    public static void b(byte param0) {
        field_b = null;
        if (param0 != 58) {
            Random var2 = (Random) null;
            sc.a((byte) 47, (Random) null, -73);
        }
    }

    final static int a(byte param0, Random param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_2_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -75) {
            stackIn_2_0 = 102;
            return stackIn_2_0;
          }
          if (param2 <= 0) {
            throw new IllegalArgumentException();
          }
          if (uj.a(true, param2)) {
            stackIn_7_0 = (int)((4294967295L & (long)param1.nextInt()) * (long)param2 >> 32);
            return stackIn_7_0;
          }
          var3_int = -(int)(4294967296L % (long)param2) + -2147483648;
          L0: while (true) {
            var4 = param1.nextInt();
            if (var3_int <= var4) {
              continue L0;
            }
            stackIn_12_0 = jc.a(var4, param2, param0 ^ 121);
            return stackIn_12_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_15_0 = (RuntimeException) (var3);

          stackIn_15_1 = new StringBuilder().append("sc.J(").append(param0).append(',');

          if (param1 == null) {
            stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
            stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
            stackIn_16_2 = "null";
          } else {
            stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
            stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
            stackIn_16_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',').append(param2).append(')').toString());
        }
    }

    final void a(int param0) {
        SoftwareRasterizer.setRasterTarget(this.field_d, this.field_a, this.field_c);
        if (param0 != 255) {
            Random var3 = (Random) null;
            sc.a((byte) -94, (Random) null, 54);
        }
    }

    static {
        field_b = new fe();
    }
}
