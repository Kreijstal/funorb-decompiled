/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oc {
    static aj field_b;
    static int field_j;
    static String field_h;
    static int field_i;
    static kc[] field_f;
    static String field_d;
    private vn field_e;
    private pg field_c;
    static boolean field_g;
    static char[] field_a;

    final pg d(int param0) {
        pg var2 = this.field_c;
        if (this.field_e.field_e == var2) {
          this.field_c = null;
          return null;
        }
        this.field_c = var2.field_b;
        if (param0 != -18502) {
          this.field_e = (vn) null;
        }
        return var2;
    }

    final pg a(boolean param0, pg param1) {
        pg var3 = null;
        RuntimeException var3_ref = null;
        pg stackIn_2_0 = null;
        Object stackIn_8_0 = null;
        pg stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0) {
            stackIn_2_0 = (pg) null;
            return stackIn_2_0;
          }
          if (param1 != null) {
            var3 = param1;
          } else {
            var3 = this.field_e.field_e.field_b;
          }
          if (var3 != this.field_e.field_e) {
            this.field_c = var3.field_b;
            stackIn_10_0 = var3;
            return stackIn_10_0;
          }
          this.field_c = null;
          stackIn_8_0 = null;
          return (pg) (stackIn_8_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_13_0 = var3_ref;
          stackIn_13_1 = new StringBuilder().append("oc.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final static boolean a(int param0) {
        boolean stackIn_9_0 = false;
        if (param0 != -15576) {
          oc.a(-109, -10, 3, -53, 6, 89);
        }
        boolean decompiledFrameRemainder0 = true;
        if (ih.field_f >= 20 &&
          ue.a(125) && (!(0 < dd.field_j) ||
          ke.g(param0 ^ 15587))) {
          stackIn_9_0 = false;
          decompiledFrameRemainder0 = false;
        }
        else {
          stackIn_9_0 = true;
        }
        return stackIn_9_0;
    }

    final pg c(boolean param0) {
        if (!param0) {
          this.field_e = (vn) null;
        }
        pg var2 = this.field_c;
        if (var2 == this.field_e.field_e) {
          this.field_c = null;
          return null;
        }
        this.field_c = var2.field_a;
        return var2;
    }

    final void a(byte param0, vn param1) {
        try {
          if (param0 < 24) {
            field_d = (String) null;
          }
          this.field_e = param1;
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "oc.J(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final pg c(int param0) {
        int var3 = -11 / ((param0 - 41) / 60);
        pg var2 = this.field_e.field_e.field_a;
        if (this.field_e.field_e == var2) {
          this.field_c = null;
          return null;
        }
        this.field_c = var2.field_a;
        return var2;
    }

    public static void b(boolean param0) {
        field_a = null;
        field_h = null;
        field_d = null;
        field_f = null;
        field_b = null;
        if (param0) {
          oc.a(-17, -79, -45, -100, -45, 122);
        }
    }

    final static void a(boolean param0) {
        if (eo.field_c != null &&
          eo.field_c.field_c != null) {
          eo.field_c.field_c.field_ab = false;
        }
        dd.field_h = null;
        eo.field_c = null;
        if (param0) {
          oc.a(-89);
        }
    }

    final pg b(int param0) {
        if (param0 > -30) {
          oc.a(-35);
        }
        pg var2 = this.field_e.field_e.field_b;
        if (this.field_e.field_e == var2) {
          this.field_c = null;
          return null;
        }
        this.field_c = var2.field_b;
        return var2;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        int var12 = 0;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var13 = 0;
        int var14 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        int var7Lifetime1;
        var14 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          var6_int = 16 - (-param3 - 485 - (2 + param1));
          lj.field_t.a(var6_int - 6, 3, 3, n.field_g.field_I - 6, (byte) -120);
          var7 = -5 + lj.field_t.field_I;
          ch.field_d.a(2 + (485 + param3) + param1, 5, -param4 + var7, param4, (byte) -120);
          wn.field_D.a(-sa.field_Cb.field_x - param3 + ch.field_d.field_x, param3, 0, param4, (byte) -120);
          sa.field_Cb.a(sa.field_Cb.field_x, param3 + wn.field_D.field_x, 0, param4, (byte) -120);
          var7 = var7 - (2 + param4);
          qo.field_f.a(5, param1, param1 + param3 + 487, false, 5, var7 - 5, 2);
          if (ln.field_U != null) {
            ln.field_U.a(qo.field_f.field_I, qo.field_f.field_db, qo.field_f.field_x, qo.field_f.field_T, -104);
          }
          var8 = -param3 + (n.field_g.field_x - var6_int);
          var9 = var8 / 2;
          var10 = var9 - (-param2 - param3);
          var11 = 0;
          for (var12 = 0; var12 < 6; var12++) {
            if (var12 >= 5 ||
              null != mn.field_s[var12]) {
              var13 = (2 + (n.field_g.field_I - 6)) * var11 / (1 + lf.field_g) + 3;
              var11++;
              var7Lifetime1 = (-6 + n.field_g.field_I + 2) * var11 / (lf.field_g + 1) + 3 - 2 - var13;
              if (var12 >= 5) {
                g.field_g.a(var8, var6_int, var13, var7Lifetime1, (byte) -120);
              } else {
                mn.field_s[var12].a(var8, var6_int, var13, var7Lifetime1, (byte) -120);
                ta.field_i[var12].a(-param3 + var9, param3, 0, var7Lifetime1, (byte) -120);
                ia.field_b[var12].a(param2, var9, param5, -param5 + var7Lifetime1 - param5, (byte) -120);
                field_f[var12].a(-var10 + (-param3 + var8), var10, param5, -param5 + var7Lifetime1 - param5, (byte) -120);
              }
            }
          }
          if (param0 <= 79) {
            oc.a(true);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var6), "oc.G(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final pg a(int param0, pg param1) {
        pg var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_6_0 = null;
        pg stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == null) {
            var3 = this.field_e.field_e.field_a;
          } else {
            var3 = param1;
          }
          if (this.field_e.field_e == var3) {
            this.field_c = null;
            stackIn_6_0 = null;
            return (pg) (stackIn_6_0);
          }
          this.field_c = var3.field_a;
          if (param0 != 402) {
            field_j = -125;
          }
          stackIn_10_0 = var3;
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_13_0 = var3_ref;
          stackIn_13_1 = new StringBuilder().append("oc.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    public oc() {
    }

    oc(vn param0) {
        try {
          this.field_e = param0;
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "oc.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_b = new aj(2, 4, 4, 0);
        field_d = "Fullscreen play is an option available to subscribing members only. For more details see the website.";
        field_h = "Press 'ESC' to open the menu";
        field_a = new char[]{(char)8364, (char)0, (char)8218, (char)402, (char)8222, (char)8230, (char)8224, (char)8225, (char)710, (char)8240, (char)352, (char)8249, (char)338, (char)0, (char)381, (char)0, (char)0, (char)8216, (char)8217, (char)8220, (char)8221, (char)8226, (char)8211, (char)8212, (char)732, (char)8482, (char)353, (char)8250, (char)339, (char)0, (char)382, (char)376};
    }
}
