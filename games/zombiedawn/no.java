/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class no extends WorldObject {
    static int[] field_G;
    private int field_F;
    private int field_D;
    static String field_E;

    no(int param0, int param1) {
        super(param0, param1, 0);
        this.field_F = 0;
    }

    final static void f(byte param0) {
        sl.field_d = null;
        bo.field_o = null;
        j.field_a = null;
        vj.field_m = (byte[][]) null;
        bn.field_c = null;
        if (param0 >= -15) {
          return;
        }
        uf.field_n = null;
    }

    final void a(byte param0, Camera param1) {
        int var10 = 0;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var11 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        var11 = ZombieDawn.field_J;
        try {
          var3_int = param1.worldToScreenX(this.getX(true), (byte) -91);
          var4 = param1.worldToScreenY(this.getY(237239984), 0) - 183;
          if (0 == this.field_F) {
            return;
          }
          var5 = WorldObject.a(1311979239, (int)(3L * tp.field_p << 5)) >> 15;
          var6 = 7;
          var7 = -var6 + var3_int;
          var8 = -1 + (var3_int + var6);
          Mover.$cfr$intArgs$a$3aedf8649552(var4, 99, 3 + var8, var4 + this.field_F, -2 + var7);
          var9 = 0;
          Rasterizer.drawLine(var7, var4, -var5 + var7, -2 + (var4 + this.field_F), var9);
          Rasterizer.drawLine(var7 + 1, var4, 1 + (-var5 + var7), this.field_F + var4, var9);
          Rasterizer.drawLine(var7 + 2, var4, 2 + (var7 - var5), -2 + var4 + this.field_F, var9);
          Rasterizer.drawLine(var8, var4, var8 - var5, -2 + (var4 + this.field_F), var9);
          Rasterizer.drawLine(var8 - 1, var4, -var5 + var8 - 1, this.field_F + var4, var9);
          Rasterizer.drawLine(var8 - 2, var4, var8 + (-var5 - 2), -2 + this.field_F + var4, var9);
          for (var10 = -3 + this.field_F + var4; var4 <= var10; var10 -= 7) {
            Rasterizer.drawHorizontalLine(var7 + 2, var10, -3 + 2 * var6, var9);
          }
          pa.a(-21189);
          if (param0 <= -76) {
            return;
          }
          no.f((byte) -110);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("no.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw ExceptionWrapper.wrapException((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    public static void releaseStatics(boolean param0) {
        field_G = null;
        if (!param0) {
          no.releaseStatics(false);
          field_E = null;
          return;
        }
        field_E = null;
    }

    final void g(int param0) {
        int fieldTemp$0 = 0;
        if (param0 < 95) {
          return;
        }
        if (hp.field_A.getX(true) <= 18 + this.getX(true)) {
          fieldTemp$0 = this.field_D - 1;
          this.field_D = this.field_D - 1;
          if (fieldTemp$0 <= 0) {
            hp.field_A.field_x = hp.field_A.field_x - 65536;
            this.field_F = this.field_F - 1;
            this.field_D = 1;
            return;
          }
          return;
        }
        if (159 <= this.field_F) {
          return;
        }
        int fieldTemp$1 = this.field_D - 1;
        this.field_D = this.field_D - 1;
        if (fieldTemp$1 <= 0) {
          this.field_F = this.field_F + 1;
          this.field_D = 1;
          return;
        }
    }

    static {
        field_G = new int[]{230, 150, 180, 100};
        field_E = "Checking";
    }
}
