/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class meb implements wwa {
    private int field_a;
    static uja field_d;
    private no field_b;
    private int field_e;
    static float[] field_c;

    public static void a(byte param0) {
        if (param0 != -52) {
          field_c = (float[]) null;
          field_d = null;
          field_c = null;
          return;
        }
        field_d = null;
        field_c = null;
    }

    final static mm a(int param0, int param1) {
        if (param1 == 1) {
          return ks.field_r == null ? null : (mm) (ks.field_r.a(-1, (long)param0));
        }
        meb.a(-8, 53);
        return ks.field_r == null ? null : (mm) (ks.field_r.a(-1, (long)param0));
    }

    public final void a(int param0, shb param1, int param2, int param3, boolean param4) {
        int stackIn_5_0 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        var12 = VoidHunters.field_G;
        try {
          if (!param1.field_e &&
            !param1.e((byte) -120)) {
            stackIn_5_0 = 2188450;
          } else {
            stackIn_5_0 = 3249872;
          }
          var6_int = stackIn_5_0;
          var7 = 122 / ((param0 + 27) / 35);
          this.field_b.a("<u=" + Integer.toString(var6_int, 16) + ">" + param1.field_j + "</u>", param2 + param1.field_g, param3 + param1.field_r, param1.field_h, param1.field_f, var6_int, -1, this.field_e, this.field_a, this.field_b.field_A + this.field_b.field_k);
          if (!param1.e((byte) -120)) {
            return;
          }
          var8 = this.field_b.b(param1.field_j);
          var9 = this.field_b.field_A + this.field_b.field_k;
          var10 = param2 + param1.field_g;
          if (2 != this.field_e) {
            if (this.field_e == 1) {
              var10 = var10 + (-var8 + param1.field_h >> 1);
            }
          } else {
            var10 = var10 + (-var8 + param1.field_h);
          }
          var11 = param1.field_r + param3;
          if (this.field_a == 2) {
            var11 = var11 + (-var9 + param1.field_f);
          } else {
            if (this.field_a == 1) {
              var11 = var11 + (-var9 + param1.field_f >> 1);
            }
          }
          aha.a(var11 + 2, var8 + 4, var10 - 2, var9, (byte) -79);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_19_0 = var6;
          stackIn_19_1 = new StringBuilder().append("meb.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    public meb() {
        this.field_b = loa.field_o;
        this.field_e = 1;
        this.field_a = 1;
    }

    meb(no param0, int param1, int param2) {
        try {
          this.field_a = param2;
          this.field_b = param0;
          this.field_e = param1;
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "meb.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_d = new uja();
        field_c = new float[4];
    }
}
