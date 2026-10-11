/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mr extends kj {
    static kv field_f;
    private ns field_i;
    static String field_h;
    private int field_g;

    mr(gj param0, ns param1, int param2, int param3) {
        super(param0, param2, param3);
        try {
          this.field_i = param1;
          this.field_g = -25;
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "mr.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    public static void c(int param0) {
        field_f = null;
        if (param0 != 0) {
          return;
        }
        field_h = null;
    }

    final void a(int param0, boolean param1, int param2) {
        int stackIn_5_0 = 0;
        int stackIn_10_0 = 0;
        int var4;
        int var5;
        ee var6;
        int var7;
        int var8;
        var8 = BachelorFridge.field_y;
        if (this.field_g < 0) {
          stackIn_5_0 = this.field_g * -20;
        } else {
          if (this.field_g <= 30) {
            stackIn_5_0 = 0;
          } else {
            stackIn_5_0 = 16 * this.field_g - 480;
          }
        }
        var4 = stackIn_5_0;
        if (this.field_g < 0) {
          stackIn_10_0 = 0;
        } else {
          stackIn_10_0 = (this.field_g >= 15) ? 2 : 1;
        }
        var5 = stackIn_10_0;
        var6 = ou.field_d[var5];
        var7 = 64 + (param0 - var4) - var6.field_b;
        var6.a(param2, var7);
        if (param1) {
          while (var7 > 0) {
            var7 -= 64;
            vi.field_f.a(param2, var7);
          }
        } else {
          field_f = (kv) null;
          while (var7 > 0) {
            var7 -= 64;
            vi.field_f.a(param2, var7);
          }
        }
    }

    final boolean b(int param0) {
        int fieldTemp$0 = this.field_g + 1;
        this.field_g = this.field_g + 1;
        if (fieldTemp$0 >= 65) {
          return true;
        }
        if (this.field_g == 35) {
          wf.a(44, (byte) 20);
          this.field_e.a(this.field_c, false, this.field_d).field_j = 0;
          this.field_i.a(false, this.field_e.field_h);
        }
        if (param0 >= 21) {
          return false;
        }
        return false;
    }

    static {
        field_h = "Checking";
    }
}
