/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gqa {
    String field_g;
    long field_i;
    String field_b;
    int[] field_h;
    String field_f;
    static String field_a;
    jea field_l;
    int field_n;
    int field_o;
    static String field_k;
    int field_c;
    boolean field_m;
    int field_d;
    String field_j;
    int field_e;

    final int a(boolean param0) {
        if (this.field_m) {
          return 2;
        }
        if (this.field_d == 2) {
          if (this.field_n > 0) {
            return 2;
          }
          if (~this.field_i == ~rb.field_r) {
            return 1;
          }
          if (ae.field_g == 2 &&
            dda.a(false, this.field_j)) {
            return 1;
          }
          if (!param0) {
            return 0;
          }
          return 11;
        }
        if (~this.field_i == ~rb.field_r) {
          return 1;
        }
        if (ae.field_g == 2 &&
          dda.a(false, this.field_j)) {
          return 1;
        }
        if (!param0) {
          return 0;
        }
        return 11;
    }

    final static int a(int param0, byte param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var3 = param0 >> 16;
        int var4Lifetime1;
        int var5Lifetime1;
        int var6Lifetime1;
        if (param1 == 24) {
          var4 = 65535 & param0;
          var5 = param2 >> 16;
          var6 = param2 & 65535;
          return var3 * param2 - (-(var5 * var4) - (var6 * var4 >> 16));
        }
        field_k = (String) null;
        var4Lifetime1 = 65535 & param0;
        var5Lifetime1 = param2 >> 16;
        var6Lifetime1 = param2 & 65535;
        return var3 * param2 - (-(var5Lifetime1 * var4Lifetime1) - (var6Lifetime1 * var4Lifetime1 >> 16));
    }

    final static void a(byte param0) {
        um.field_l.a(75, new tha());
        if (param0 < 0) {
          field_k = (String) null;
        }
    }

    final static void a(int param0, int param1, int param2, int param3, ka param4, int param5) {
        try {
          via.a(param4, param0, 0, param5, param3, param2, 51, 0);
          if (param1 != -83584144) {
            field_a = (String) null;
          }
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "gqa.B(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ')');
        }
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 < 67) {
          field_a = (String) null;
          field_k = null;
          return;
        }
        field_k = null;
    }

    gqa(boolean param0) {
        this.field_i = cca.field_z;
        this.field_d = gja.field_x;
        this.field_m = sb.field_b;
        this.field_o = ega.field_b;
        this.field_f = hi.field_p;
        this.field_g = esa.field_c;
        this.field_c = gb.field_a;
        this.field_n = jda.field_m;
        this.field_e = era.field_a;
        if (!param0) {
          this.field_h = null;
        } else {
          this.field_h = qra.field_e;
        }
        this.field_b = dga.field_a;
        this.field_j = gia.field_q;
    }

    gqa(int param0, String param1, int param2, String param3, String param4) {
        try {
          this.field_g = param1;
          this.field_o = 0;
          this.field_f = param4;
          this.field_c = 0;
          this.field_e = param2;
          this.field_n = 0;
          this.field_i = 0L;
          this.field_j = param1;
          this.field_m = true;
          this.field_d = param0;
          this.field_b = param3;
          this.field_h = null;
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "gqa.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_k = "Searching for an opponent";
        field_a = "Shotgun";
    }
}
