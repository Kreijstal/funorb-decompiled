/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class id extends pn {
    static String field_g;
    static kv field_h;
    static String field_j;
    static js field_i;

    id(vr param0) {
        try {
          this.field_b = bla.a(29611, "basic", "tiles_pizza", param0);
          this.a(128);
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "id.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static void e(int param0, int param1) {
        ol.a(pja.field_a[param1][kla.a(3, m.field_a, -2147483648)], true);
        if (param0 != 49) {
          id.e(68, -5);
        }
    }

    final static void a(int param0, cq param1) {
        try {
          int var2_int = -125 % ((-18 - param0) / 55);
          saa.field_a.b(param1.field_i);
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "id.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private final void a(int param0) {
        this.field_a = new kv[4];
        kv var6 = new kv(384, 192);
        kv var2 = var6;
        var6.b();
        this.field_b[48].a(64, 32);
        this.field_b[49].a(0, 64);
        this.field_b[0].a(128, 64);
        this.field_b[8].a(64, 96);
        this.field_b[1].a(192, 96);
        this.field_a[0] = var6;
        kv var3 = new kv(384, 192);
        var3.b();
        this.field_b[49].a(128, 0);
        this.field_b[49].a(64, 32);
        this.field_b[13].a(192, 32);
        this.field_b[50].a(0, 64);
        this.field_b[14].a(128, 64);
        this.field_b[40].a(64, 96);
        this.field_b[24].a(192, 96);
        this.field_b[41].a(128, param0);
        this.field_a[1] = var3;
        kv var4 = new kv(384, 192);
        var4.b();
        this.field_b[6].a(64, 32);
        this.field_b[7].a(128, 64);
        this.field_b[16].a(64, 96);
        this.field_b[32].a(192, 96);
        this.field_b[33].a(128, 128);
        this.field_a[3] = var4;
        kv var5 = new kv(384, 192);
        var5.b();
        this.field_b[29].a(64, 32);
        this.field_b[21].a(192, 32);
        this.field_b[42].a(0, 64);
        this.field_b[22].a(128, 64);
        this.field_b[34].a(256, 64);
        this.field_b[42].a(64, 96);
        this.field_b[34].a(192, 96);
        this.field_b[35].a(128, 128);
        this.field_a[2] = var5;
    }

    public static void b(int param0) {
        field_i = null;
        field_g = null;
        if (param0 != 35) {
          field_i = (js) null;
        }
        field_h = null;
        field_j = null;
    }

    final static void a(vr param0, int param1) {
        dv var2 = null;
        try {
          dv.b(param0.a((byte) 123, "", "headers.packvorbis"));
          if (param1 != 64) {
            id.b(-45);
          }
          var2 = dv.a(param0, "jagex logo2.packvorbis", "");
          var2.b();
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "id.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void b(jo param0, int param1) {
        int var5 = 0;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_39_2 = null;
        RuntimeException decompiledCaughtException = null;
        aj var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var6 = 0;
        aj var7 = null;
        aj var8 = null;
        aj var9 = null;
        aj var10 = null;
        aj var11 = null;
        aj var12 = null;
        aj var13 = null;
        aj var14 = null;
        aj var15 = null;
        int var4Lifetime1;
        int var4Lifetime2;
        var6 = BachelorFridge.field_y;
        try {
          var3 = new aj(0, 0);
          for (var4 = -1; var4 < param0.field_a - 1; var4++) {
            var7 = param0.a(0, (byte) 70, var4);
            this.field_b[2 + var4 % 3].a(var7.field_c + 128, var7.field_a);
            var8 = param0.a(param0.field_z, (byte) -128, var4);
            if (var4 > 0) {
              this.field_b[25 + var4 % 2].a(var8.field_c, var8.field_a);
            }
            if (var4 >= 0) {
              this.field_b[42].a(var8.field_c, 64 + var8.field_a);
            }
          }
          for (var4Lifetime1 = -1; -1 + param0.field_z > var4Lifetime1; var4Lifetime1++) {
            var9 = param0.a(var4Lifetime1, (byte) -104, 0);
            if ((param0.field_z - 2) > var4Lifetime1) {
              this.field_b[9 + var4Lifetime1 % 3 + 1].a(var9.field_c - 128, var9.field_a);
            }
            if (var4Lifetime1 >= 0) {
              this.field_b[49].a(-128 + var9.field_c, -64 + var9.field_a);
            }
            var10 = param0.a(var4Lifetime1, (byte) 47, param0.field_a);
            if (var4Lifetime1 > 0) {
              this.field_b[var4Lifetime1 % 3 + 17].a(var10.field_c, var10.field_a);
            }
            if (var4Lifetime1 >= 0) {
              this.field_b[34].a(var10.field_c, var10.field_a + 64);
            }
          }
          if (param1 != -13319) {
            id.b(-37);
          }
          for (var4Lifetime2 = -3; var4Lifetime2 > -8; var4Lifetime2--) {
            for (var5 = 0; 1 + param0.field_z > var5; var5++) {
              var11 = param0.a(var5, (byte) 72, var4Lifetime2);
              if (0 == var5) {
                this.field_b[48].a(var11.field_c + 64, -32 + var11.field_a);
              }
              if (var5 == param0.field_z) {
                this.field_b[50].a(var11.field_c - 64, 32 + var11.field_a);
              }
              this.field_b[49].a(var11.field_c, var11.field_a);
            }
          }
          var12 = param0.a(0, (byte) -90, 0);
          this.field_a[0].e(var12.field_c - 128, -128 + var12.field_a);
          var13 = param0.a(0, (byte) 98, param0.field_a);
          this.field_a[3].e(var13.field_c - 64, -128 + (var13.field_a + 32));
          var14 = param0.a(param0.field_z, (byte) 35, param0.field_a);
          this.field_a[2].e(-128 + var14.field_c, -64 + var14.field_a);
          var15 = param0.a(param0.field_z, (byte) -98, 0);
          this.field_a[1].e(-192 + var15.field_c, 32 + (-128 + var15.field_a));
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_38_0 = var3_ref;
          stackIn_38_1 = new StringBuilder().append("id.B(");
          if (param0 == null) {
            stackIn_39_2 = "null";
          } else {
            stackIn_39_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_38_0), ((StringBuilder) (Object) stackIn_38_1).append(stackIn_39_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_g = "<col=ff0000>Failed!</col>";
        field_j = "Eating. Try dropping foods into your fridge.";
    }
}
