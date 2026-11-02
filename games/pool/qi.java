/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class qi implements Iterable {
    static String muGameoptInviteXToGame;
    DualLinkNode field_d;
    static int field_a;
    static int field_b;
    static int field_e;
    static int field_g;
    static boolean field_c;
    static PcmSample field_f;

    final static Sprite[] a(int param0, int param1, boolean param2, int param3, int param4, boolean param5) {
        Sprite var20 = null;
        Sprite var21 = null;
        Sprite var22 = null;
        Sprite var18 = null;
        Sprite var19 = null;
        int var8 = 0;
        Object var10 = null;
        Object var11 = null;
        int[] var16 = SoftwareRasterizer.pixels;
        int[] var15 = var16;
        int[] var12 = var15;
        int[] var6 = var12;
        int var7 = SoftwareRasterizer.width;
        int var8Lifetime1;
        if (param4 < -84) {
          var8 = SoftwareRasterizer.height;
          var20 = new Sprite(16, param3);
          var20.e();
          SoftwareRasterizer.fillVerticalGradient(0, 0, 16, param3, param0, param1);
          var10 = null;
          if (param5) {
            var21 = var20.d();
            var10 = var21;
            var21.e();
            SoftwareRasterizer.drawHorizontalLine(0, 0, 5, 0);
            SoftwareRasterizer.drawHorizontalLine(0, 1, 3, 0);
            SoftwareRasterizer.drawHorizontalLine(0, 2, 2, 0);
            SoftwareRasterizer.drawHorizontalLine(0, 3, 1, 0);
            SoftwareRasterizer.drawHorizontalLine(0, 4, 1, 0);
          }
          var11 = null;
          if (param2) {
            var22 = var20.d();
            var11 = var22;
            var22.e();
            SoftwareRasterizer.drawHorizontalLine(11, 0, 5, 0);
            SoftwareRasterizer.drawHorizontalLine(13, 1, 3, 0);
            SoftwareRasterizer.drawHorizontalLine(14, 2, 2, 0);
            SoftwareRasterizer.drawHorizontalLine(15, 3, 1, 0);
            SoftwareRasterizer.drawHorizontalLine(15, 4, 1, 0);
          }
          SoftwareRasterizer.setTarget(var16, var7, var8);
          return new Sprite[]{null, null, null, (Sprite) (var10), var20, (Sprite) (var11), null, null, null};
        }
        field_e = 98;
        var8Lifetime1 = SoftwareRasterizer.height;
        Sprite var17 = new Sprite(16, param3);
        var17.e();
        SoftwareRasterizer.fillVerticalGradient(0, 0, 16, param3, param0, param1);
        var10 = null;
        if (param5) {
          var18 = var17.d();
          var10 = var18;
          var18.e();
          SoftwareRasterizer.drawHorizontalLine(0, 0, 5, 0);
          SoftwareRasterizer.drawHorizontalLine(0, 1, 3, 0);
          SoftwareRasterizer.drawHorizontalLine(0, 2, 2, 0);
          SoftwareRasterizer.drawHorizontalLine(0, 3, 1, 0);
          SoftwareRasterizer.drawHorizontalLine(0, 4, 1, 0);
        }
        var11 = null;
        if (param2) {
          var19 = var17.d();
          var11 = var19;
          var19.e();
          SoftwareRasterizer.drawHorizontalLine(11, 0, 5, 0);
          SoftwareRasterizer.drawHorizontalLine(13, 1, 3, 0);
          SoftwareRasterizer.drawHorizontalLine(14, 2, 2, 0);
          SoftwareRasterizer.drawHorizontalLine(15, 3, 1, 0);
          SoftwareRasterizer.drawHorizontalLine(15, 4, 1, 0);
        }
        SoftwareRasterizer.setTarget(var16, var7, var8Lifetime1);
        return new Sprite[]{null, null, null, (Sprite) (var10), var17, (Sprite) (var11), null, null, null};
    }

    final static void a(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var1 = (-640 + fr.field_s) / 2;
        int var2Lifetime1;
        int var3Lifetime1;
        if (param0 < -71) {
          var2 = BufferedFile.field_h * BufferedFile.field_h;
          var3 = -(NodeHashTableIterator.field_a * NodeHashTableIterator.field_a) + var2;
          BufferedFile.field_a.b(90, 2147483647, -(199 * var3 / var2) + var1, 199, -90 + (SoftwareRasterizer.height - 120) - 4);
          oi.field_n.b(0, 2147483647, var1 + (202 + var3 * 438 / var2), 438, SoftwareRasterizer.height - 120 - 4);
          return;
        }
        field_b = 3;
        var2Lifetime1 = BufferedFile.field_h * BufferedFile.field_h;
        var3Lifetime1 = -(NodeHashTableIterator.field_a * NodeHashTableIterator.field_a) + var2Lifetime1;
        BufferedFile.field_a.b(90, 2147483647, -(199 * var3Lifetime1 / var2Lifetime1) + var1, 199, -90 + (SoftwareRasterizer.height - 120) - 4);
        oi.field_n.b(0, 2147483647, var1 + (202 + var3Lifetime1 * 438 / var2Lifetime1), 438, SoftwareRasterizer.height - 120 - 4);
    }

    final static void a(int param0, String param1) {
        if (param0 <= 68) {
          return;
        }
        try {
          na.a(-58, param1);
          wf.a(false, DebouncedValidationProvider.loggingIn, -128);
        } catch (RuntimeException runtimeException) {
          throw wm.a((Throwable) ((Object) runtimeException), "qi.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void b(int param0) {
        field_f = null;
        if (param0 != 14676) {
          muGameoptInviteXToGame = (String) null;
          muGameoptInviteXToGame = null;
          return;
        }
        muGameoptInviteXToGame = null;
    }

    public final Iterator iterator() {
        return (Iterator) ((Object) new mn(this));
    }

    final DualLinkNode a(int param0) {
        DualLinkNode var2 = null;
        DualLinkNode var2Lifetime1;
        if (param0 >= -87) {
          qi.a((byte) -89);
          var2 = this.field_d.field_q;
          if (this.field_d != var2) {
            var2.a(false);
            return var2;
          }
          return null;
        }
        var2Lifetime1 = this.field_d.field_q;
        if (this.field_d != var2Lifetime1) {
          var2Lifetime1.a(false);
          return var2Lifetime1;
        }
        return null;
    }

    final static boolean a(byte param0, CharSequence param1) {
        RuntimeException var2 = null;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == -64) {
            stackIn_4_0 = w.a(false, param1, (byte) -37);
            return stackIn_4_0;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("qi.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    qi() {
        this.field_d = new DualLinkNode();
        this.field_d.field_n = this.field_d;
        this.field_d.field_q = this.field_d;
    }

    final void a(byte param0, DualLinkNode param1) {
        try {
          if (param1.field_n != null) {
            param1.a(false);
          }
          if (param0 > -31) {
            field_g = -32;
          }
          param1.field_n = this.field_d.field_n;
          param1.field_q = this.field_d;
          param1.field_n.field_q = param1;
          param1.field_q.field_n = param1;
        } catch (RuntimeException runtimeException) {
          throw wm.a((Throwable) ((Object) runtimeException), "qi.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        muGameoptInviteXToGame = "Invite <%0> to this game";
    }
}
