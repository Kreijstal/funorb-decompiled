/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class jba extends ana {
    private taa field_y;
    static String field_w;
    static int field_x;
    private uj field_z;
    static sna field_A;
    private boolean field_v;

    final boolean c(byte param0) {
        int fieldTemp$1 = 0;
        int var2;
        if (this.field_m.a((byte) -106)) {
          return false;
        }
        if (this.field_y.a((byte) -106)) {
          return false;
        }
        fieldTemp$1 = this.field_l - 1;
        this.field_l = this.field_l - 1;
        if (fieldTemp$1 <= 0) {
          var2 = 92 % ((param0 - 71) / 47);
          this.b(true);
          return true;
        }
        if (!this.field_v) {
          this.e((byte) 47);
        }
        return false;
    }

    private final void b(boolean param0) {
        this.f((byte) -125);
        if (!param0) {
          field_A = (sna) null;
        }
    }

    private final void e(byte param0) {
        int var11 = 0;
        int var12 = 0;
        int stackIn_15_0 = 0;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var13;
        int var14;
        int var15;
        kw var16;
        int var17;
        int[][] var21;
        var17 = BachelorFridge.field_y;
        var21 = this.field_z.d(1);
        var3 = this.field_z.field_q;
        var4 = this.field_z.field_t;
        var5 = 17;
        var6 = 17;
        var7 = var5 - 1 >> 1;
        if (param0 != 47) {
          jba.d(-36);
        }
        var8 = var6 - 1 >> 1;
        var9 = kla.a(513, m.field_a, -2147483648) - 256;
        var10 = -128 + kla.a(257, m.field_a, param0 + 2147483601);
        for (var11 = 0; var5 > var11; var11++) {
          for (var12 = 0; var12 < var6; var12++) {
            if (var21[var11][var12] == 1) {
              var13 = var11 + (-var7 + var3);
              var14 = var4 - (-var12 + var8);
              if (this.field_q.field_h.a(var13, var14, (byte) 61)) {
                stackIn_15_0 = (this.field_q.field_h.field_a[var13][var14].field_l != null) ? 0 : 1;
                var15 = stackIn_15_0;
                var16 = new kw(this.field_q, var13, var14, var9, var10, var15 != 0);
                ((kj) ((Object) var16)).a(0);
              }
            }
          }
        }
        this.field_v = true;
    }

    jba(gj param0, uj param1) {
        super(param0, param1);
        try {
          this.field_z = param1;
          this.field_y = new taa(this.field_q, this.field_z.field_q, this.field_z.field_t);
          this.a(27799, this.field_y);
          this.field_l = 80;
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "jba.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void d(int param0) {
        field_w = null;
        if (param0 != -128) {
          return;
        }
        field_A = null;
    }

    final static void a(it param0, jfa param1, int param2) {
        int var3_int = 0;
        if (bp.e(-29919)) {
          return;
        }
        try {
          sja.field_fb.c(param2, (byte) 109);
          sja.field_fb.field_g = sja.field_fb.field_g + 2;
          var3_int = sja.field_fb.field_g;
          rha.a(param1.field_g, sja.field_fb, (byte) -93);
          oe.a(-21332, sja.field_fb, param0);
          sja.field_fb.a((byte) -88, sja.field_fb.field_g - var3_int);
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "jba.E(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    private final void f(byte param0) {
        ad var4 = null;
        int var5 = BachelorFridge.field_y;
        aga var2 = this.field_z.field_l.a(param0 + 178, this.field_q.field_h);
        if (param0 != -125) {
          return;
        }
        if (var2.i(84)) {
          return;
        }
        pp var3 = (pp) (this.field_z.field_o.b((byte) 90));
        while (var3 != null) {
          var4 = var3.field_h.a(param0 - 27324, this.field_q);
          var4.b(param0 + 124, 6);
          var3.a(var2, this.field_q.field_h, 12);
          this.a(27799, new ek(this.field_q, var4, var3.field_f));
          var3 = (pp) (this.field_z.field_o.c(0));
        }
    }

    final static void a(int param0, java.awt.Component param1) {
        try {
          param1.addMouseListener(uc.field_m);
          if (param0 != -30229) {
            jfa var3 = (jfa) null;
            jba.a((it) null, (jfa) null, -106);
          }
          param1.addMouseMotionListener(uc.field_m);
          param1.addFocusListener(uc.field_m);
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "jba.G(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_w = "Withdraw invitation to <%0> to join this game";
        field_x = 2;
    }
}
