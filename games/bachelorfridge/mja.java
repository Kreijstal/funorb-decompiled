/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mja extends td {
    static String field_r;
    static sna field_q;
    static String field_p;
    static byte[] field_s;
    static sna field_t;

    final ii a(op param0, int param1) {
        oo stackIn_21_0 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        oo var4 = null;
        int var5 = 0;
        int var6 = 0;
        aga var7 = null;
        var6 = BachelorFridge.field_y;
        try {
          if (param1 != 3) {
            field_t = (sna) null;
          }
          var7 = this.field_h.a(69, param0);
          var4 = new oo(this.field_g, new nq(var7), this.field_i);
          if (2 == this.field_i) {
            for (var5 = 0; var7.field_x > var5; var5++) {
              ar.a(var7.field_J, 31546, var5, false, param0, var4);
              ar.a(var7.field_J - 1, 31546, var5, false, param0, var4);
              ar.a(var7.field_J + 1, param1 + 31543, var5, false, param0, var4);
            }
          } else if (this.field_i == 4) {
            for (var5 = 1 + var7.field_x; param0.field_z > var5; var5++) {
              ar.a(var7.field_J, 31546, var5, false, param0, var4);
              ar.a(-1 + var7.field_J, 31546, var5, false, param0, var4);
              ar.a(var7.field_J + 1, 31546, var5, false, param0, var4);
            }
          } else if (1 == this.field_i) {
            for (var5 = 0; var5 < var7.field_J; var5++) {
              ar.a(var5, 31546, var7.field_x, false, param0, var4);
              ar.a(var5, 31546, -1 + var7.field_x, false, param0, var4);
              ar.a(var5, 31546, var7.field_x + 1, false, param0, var4);
            }
          } else {
            if (this.field_i == 3) {
              for (var5 = 1 + var7.field_J; var5 < param0.field_B; var5++) {
                ar.a(var5, 31546, var7.field_x, false, param0, var4);
                ar.a(var5, 31546, var7.field_x - 1, false, param0, var4);
                ar.a(var5, 31546, 1 + var7.field_x, false, param0, var4);
              }
            }
          }
          stackIn_21_0 = var4;
          return (ii) ((Object) stackIn_21_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_24_0 = var3;
          stackIn_24_1 = new StringBuilder().append("mja.A(");
          if (param0 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        if (param2 != 3) {
          field_r = (String) null;
        }
        tca.field_f = param1;
        gaa.field_k = param0;
        mm.field_z = param3;
        hc.field_D = param4;
    }

    mja(int param0, aga param1, int param2) {
        super(param0, param1);
        try {
          this.field_i = param2;
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "mja.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    public static void b(int param0) {
        field_q = null;
        field_r = null;
        int var1 = 25 / ((16 - param0) / 44);
        field_t = null;
        field_s = null;
        field_p = null;
    }

    static {
        field_r = "Accept";
        field_p = "Arrow keys or right click drag to move the camera.  <br><col=BBFF00> Next</col>";
    }
}
