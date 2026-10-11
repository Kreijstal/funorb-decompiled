/*
 * Decompiled by CFR-JS 0.4.0.
 */
class gn {
    long field_a;
    static String field_c;
    gn field_b;
    gn field_d;

    final static boolean a(byte param0, boolean param1, int param2, int param3) {
        int var4;
        int var5;
        int var4Lifetime1;
        int var5Lifetime1;
        if (param1) {
          if (bl.field_m[param2] < bl.field_m[param3]) {
            return true;
          }
          if (bl.field_m[param2] > bl.field_m[param3]) {
            return false;
          }
          if (w.field_a[param3] > w.field_a[param2]) {
            return true;
          }
          if (w.field_a[param2] > w.field_a[param3]) {
            return false;
          }
          var4 = qp.field_G[param2] + (fo.field_j[param2] + ln.field_B[param2]);
          if (param0 != 8) {
            return false;
          }
          var5 = ln.field_B[param3] + qp.field_G[param3] + fo.field_j[param3];
          if (var5 > var4) {
            return true;
          }
          if (var4 > var5) {
            return false;
          }
          return !(param2 >= param3);
        }
        if (w.field_a[param2] < w.field_a[param3]) {
          return true;
        }
        if (w.field_a[param2] > w.field_a[param3]) {
          return false;
        }
        if (bl.field_m[param2] < bl.field_m[param3]) {
          return true;
        }
        if (bl.field_m[param3] < bl.field_m[param2]) {
          return false;
        }
        var4Lifetime1 = qp.field_G[param2] + (fo.field_j[param2] + ln.field_B[param2]);
        if (param0 != 8) {
          return false;
        }
        var5Lifetime1 = ln.field_B[param3] + qp.field_G[param3] + fo.field_j[param3];
        if (var5Lifetime1 > var4Lifetime1) {
          return true;
        }
        if (var4Lifetime1 > var5Lifetime1) {
          return false;
        }
        if (param2 >= param3) {
          return false;
        }
        return true;
    }

    final static int d(byte param0) {
        if (param0 <= 44) {
          field_c = (String) null;
          return bh.field_j;
        }
        return bh.field_j;
    }

    public static void d(int param0) {
        if (param0 <= 114) {
          return;
        }
        field_c = null;
    }

    final boolean e(byte param0) {
        if (null == this.field_b) {
          return false;
        }
        if (param0 != -113) {
          return true;
        }
        return true;
    }

    final static void c(int param0) {
        ow.field_e = un.field_e.a(-117);
        CharSequence var2 = (CharSequence) ((Object) ow.field_e);
        kd.field_w = mo.a(0, var2);
        if (param0 != -49) {
          field_c = (String) null;
        }
    }

    final static void a(int param0, int param1, int param2, StringBuilder param3) {
        int var5 = 0;
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        int var6 = Kickabout.field_G;
        String var4 = Integer.toBinaryString(param0);
        if (param1 != -28745) {
          return;
        }
        try {
          for (var5 = 0; param2 - var4.length() > var5; var5++) {
            discarded$0 = param3.append('0');
          }
          discarded$1 = param3.append(var4);
        } catch (RuntimeException runtimeException) {
          throw nb.a((Throwable) ((Object) runtimeException), "gn.QB(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final void c(byte param0) {
        if (this.field_b == null) {
          return;
        }
        if (param0 == -109) {
          this.field_b.field_d = this.field_d;
          this.field_d.field_b = this.field_b;
          this.field_b = null;
          this.field_d = null;
          return;
        }
        gn.c(80);
        this.field_b.field_d = this.field_d;
        this.field_d.field_b = this.field_b;
        this.field_b = null;
        this.field_d = null;
    }

    final static int b(byte param0) {
        if (param0 >= -52) {
          return -83;
        }
        return mn.field_a;
    }

    final static boolean a(int param0, char param1) {
        if (param0 != 12105) {
          StringBuilder var3 = (StringBuilder) null;
          gn.a(-48, 1, 77, (StringBuilder) null);
          if (param1 < 48) {
            return false;
          }
          if (param1 <= 57) {
            return true;
          }
          return false;
        }
        if (param1 < 48) {
          return false;
        }
        if (param1 <= 57) {
          return true;
        }
        return false;
    }

    static {
        field_c = "Click 'Team Results' to view who won, drew or lost.";
    }
}
