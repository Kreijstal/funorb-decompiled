/*
 * Decompiled by CFR-JS 0.4.0.
 */
class ksa {
    ksa field_c;
    ksa field_a;
    long field_b;

    final boolean b(byte param0) {
        if (param0 != -63) {
          ksa.a(-99, -70, 95, 66);
          if (this.field_a != null) {
            return true;
          }
          return false;
        }
        if (this.field_a != null) {
          return true;
        }
        return false;
    }

    final static void a(phb[] param0, int param1, int param2, phb[] param3, phb[] param4, int param5, int param6, int param7, int param8, no param9, int param10, int param11, int param12, int param13, int param14) {
        int var15_int = param9.field_A + param9.field_o;
        int var16 = param9.field_o;
        if (param13 != -14109) {
          return;
        }
        try {
          dia.a(param6, param1, param2, param9, var16, param3, param5, param14, var15_int, param8, var15_int, param4, param12, var16, param9, param7, param10, param13 + 14192, param11, param0);
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "ksa.OB(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + (param9 != null ? "{...}" : "null") + ',' + param10 + ',' + param11 + ',' + param12 + ',' + param13 + ',' + param14 + ')');
        }
    }

    final static int a(int param0, int param1, int param2, int param3) {
        if (param0 == 31123) {
          return param1 > param3 ? param1 : param3 <= param2 ? param3 : param2;
        }
        ksa.a(-107, -16, 102, -117);
        return param1 > param3 ? param1 : param3 <= param2 ? param3 : param2;
    }

    final void b(int param0) {
        if (this.field_a == null) {
          return;
        }
        this.field_a.field_c = this.field_c;
        if (param0 == -3846) {
          this.field_c.field_a = this.field_a;
          this.field_a = null;
          this.field_c = null;
          return;
        }
    }

    final static faa a(byte param0) {
        if (param0 == -6) {
          return new faa(wi.a((byte) 73, bk.field_w));
        }
        no var2 = (no) null;
        ksa.a((phb[]) null, 27, -49, (phb[]) null, (phb[]) null, 58, 92, 102, -42, (no) null, 125, 6, -7, 73, -90);
        return new faa(wi.a((byte) 73, bk.field_w));
    }

    static {
    }
}
