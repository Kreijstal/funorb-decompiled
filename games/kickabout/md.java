/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class md implements hc {
    static String field_h;
    static String field_j;
    static String field_g;
    private char[] field_e;
    private int field_f;
    private gm[] field_i;
    private int field_c;
    private boolean field_a;
    private ut field_b;
    static String field_d;

    private final void a(int param0, int param1) {
        int var4 = 0;
        boolean[][][] var11 = null;
        vn var6 = null;
        int var7 = Kickabout.field_G;
        int var3 = param1 != 0 ? 0 : 1;
        for (var4 = 0; 4 > var4; var4++) {
          var11 = ih.a(21656, rp.field_z[param1][var4]);
          var6 = hs.a(false, var4 % 3, var3, ev.field_B[-(2 * param1) + 12], var11[0], var4 % 3, var11[1], (byte) -89, -var4 + 3, false, ev.field_B[31]);
          this.field_i[var4] = new gm(var6, var3, true);
          this.field_i[var4].field_G = 1;
          this.field_i[var4].g((byte) 127);
          this.field_i[var4].field_mb.a(dq.$cfr$intArgs$a$7f8aad568c81(85, this.field_i[var4].field_mb.a(true), new Random()), 123);
        }
        if (param0 >= -10) {
          this.field_i = (gm[]) null;
        }
    }

    final static boolean d(int param0) {
        int var1;
        int var3;
        int stackIn_12_0 = 0;
        boolean stackIn_13_1 = false;
        int var2;
        var3 = Kickabout.field_G;
        var1 = 0;
        if (n.a(false)) {
          var1 = 1;
          gg.a(-32053);
        } else {
          if (!ng.a(param0 ^ 27302)) {
            if (vi.c(2915)) {
              on.g(0, 0, on.field_g, on.field_f);
              var1 = 1;
              ph.b(true);
            }
          } else {
            var1 = 1;
            ci.a(false);
          }
        }
        if (up.a((byte) -3) &&
          !ng.a(param0 ^ 27302)) {
          stackIn_12_0 = 100;
          if (e.field_m == null) {
            stackIn_13_1 = vb.field_k;
          } else {
            stackIn_13_1 = true;
          }
          ha.c(stackIn_12_0, stackIn_13_1);
          var1 = 1;
        }
        if (nv.i(0)) {
          var2 = (-1 + vo.field_bb << 8) / 16;
          if (0 < var2) {
            var1 = 1;
            on.a(0, 0, on.field_g, on.field_f, 0, var2);
          }
        }
        if (param0 != -27302) {
          md.d(14);
        }
        return var1 != 0;
    }

    public final boolean a(int param0, int param1, char param2) {
        int var4 = 0;
        int var5 = Kickabout.field_G;
        int var4Lifetime1;
        for (var4 = 0; var4 < 3; var4++) {
          this.field_e[var4] = this.field_e[1 + var4];
        }
        this.field_e[3] = Character.toUpperCase(param2);
        var4Lifetime1 = -1;
        if (this.field_e[0] == 90 &&
          this.field_e[1] == 69 &&
          this.field_e[2] == 80 &&
          this.field_e[3] == 72) {
          var4Lifetime1 = 0;
        }
        if (this.field_e[0] == 73 && this.field_e[1] == 65 && 73 == this.field_e[2] &&
          78 == this.field_e[3]) {
          var4Lifetime1 = 1;
        }
        if (-1 != var4Lifetime1) {
          if (!this.field_a) {
            this.b(-98);
          }
          if (var4Lifetime1 != this.field_c) {
            this.a(-18, var4Lifetime1);
          }
          this.field_f = 1;
        }
        if (param0 != 11516) {
          return false;
        }
        return false;
    }

    public final void a(int param0) {
        int stackIn_6_0 = 0;
        float stackIn_13_0 = 0.0f;
        float stackIn_16_0 = 0.0f;
        float var2;
        int var3;
        int var4;
        int var5;
        float var6;
        float var7;
        int var8;
        int var9;
        int var10;
        int var4Lifetime1;
        var10 = Kickabout.field_G;
        if (this.field_f == 0) {
          return;
        }
        var2 = 1.0f + (float)this.field_f * 9.0f / 200.0f;
        stackIn_6_0 = (0 == this.field_c) ? 7000 : 9000;
        var3 = (int)((float)stackIn_6_0 / var2);
        for (var4 = 0; 4 > var4; var4++) {
          var5 = var4;
          if (1 < var5) {
            var5 = -var4 + 3;
          }
          stackIn_13_0 = (var5 != 0) ? 0.30000001192092896f : 0.8999999761581421f;
          var6 = stackIn_13_0 * (float)this.field_f;
          var7 = 1.2000000476837158f * (float)this.field_f;
          if (var4 <= 1) {
            stackIn_16_0 = -var6;
          } else {
            stackIn_16_0 = var6;
          }
          var8 = (int)stackIn_16_0 + 320;
          var9 = (int)var7 + 140;
          iw.a(-102, this.field_b);
          on.b();
          this.field_i[var4].a(var3, 0, on.field_g >> 1, on.field_f, (byte) -105);
          ta.e(120);
          if (this.field_f > 136) {
            this.field_b.b(-(this.field_b.field_o >> 1) + var8, -(this.field_b.field_v >> 1) + var9, 200 - this.field_f << 2);
          } else {
            this.field_b.c(-(this.field_b.field_o >> 1) + var8, var9 - (this.field_b.field_v >> 1));
          }
        }
        var4Lifetime1 = -36 / ((50 - param0) / 45);
        return;
    }

    public static void c(int param0) {
        field_h = null;
        field_g = null;
        field_j = null;
        if (param0 != 32318) {
          return;
        }
        field_d = null;
    }

    public final boolean a(byte param0) {
        if (param0 <= 63) {
          this.a(121, -18, '�');
          return false;
        }
        return false;
    }

    public final void a(int param0, boolean param1) {
        int var3 = 0;
        int var4 = Kickabout.field_G;
        if (this.field_f == 0) {
          return;
        }
        int fieldTemp$0 = this.field_f + 1;
        this.field_f = this.field_f + 1;
        if (fieldTemp$0 >= 200) {
          this.field_f = 0;
          return;
        }
        if (param0 != -25) {
          return;
        }
        for (var3 = 0; var3 < 4; var3++) {
          this.field_i[var3].a(param0 ^ -27, (la[]) null, false, false);
          this.field_i[var3].g((byte) 126);
        }
    }

    private final void b(int param0) {
        this.field_i = new gm[4];
        this.field_b = new ut(100, 200);
        int var2 = 26 / ((43 - param0) / 54);
    }

    md() {
        this.field_f = 0;
        this.field_e = new char[4];
        this.field_c = -1;
        this.field_a = false;
    }

    static {
        field_h = "Connection timed out. Please try using a different server.";
        field_j = "Add name";
        field_g = "<%0> has just resigned and left, <%1> wins the tournament by default!";
        field_d = "Suggested names: ";
    }
}
