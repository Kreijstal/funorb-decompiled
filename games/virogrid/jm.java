/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jm {
    static String field_a;
    d field_c;
    static km field_b;
    static String field_d;

    final void a(int param0, int param1, int param2, int param3, int param4) {
        int var6 = 24;
        int var7 = 5;
        this.field_c.a(var6, param3, param4, param0 - 22397, var7, param1, param2);
        ee.field_e.a(0, pg.field_e, dg.field_E.field_K, (byte) -90, 0);
        se.field_c.a(0, 18, dg.field_E.field_K + (-oc.field_k - 2 - 82), (byte) -65, pg.field_e + 2);
        if (param0 != 36) {
          jm.a((byte) 30);
        }
        wb.field_m.a(-80 - oc.field_k + (dg.field_E.field_K - 2), 18, oc.field_k + 82, (byte) -45, 2 + pg.field_e);
        ve.field_q.a(dg.field_E.field_K, 0, 2, -20 + (-2 - pg.field_e + dg.field_E.field_ub), oc.field_k, 20 + (2 + pg.field_e), 20, 0);
        lg.field_a.a(oc.field_k, 2, 20, 0);
    }

    public static void a(int param0) {
        field_a = null;
        field_b = null;
        field_d = null;
        if (param0 != 0) {
          field_a = (String) null;
        }
    }

    final static hh a(boolean param0, String param1) {
        int var3 = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var4 = 0;
        int var5 = 0;
        hh stackIn_13_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = Virogrid.field_F ? 1 : 0;
        try {
          var2_int = param1.length();
          for (var3 = 0; var2_int > var3; var3++) {
            var4 = param1.charAt(var3);
            if (48 > var4) {
              return null;
            }
            if (var4 > 57) {
              return null;
            }
          }
          if (!param0) {
            field_a = (String) null;
          }
          stackIn_13_0 = jj.field_f;
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_16_0 = var2;
          stackIn_16_1 = new StringBuilder().append("jm.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    final static void a(int param0, int param1, int param2) {
        if (param2 != -2) {
          field_b = (km) null;
        }
        j.field_b = param0;
        si.field_a = param0;
        tm.field_g = param1;
        si.field_b = param1;
        fk.a(param0, param1);
    }

    final static void a(int param0, byte param1) {
        int var2 = 0;
        int var3 = 0;
        if (param1 != -102) {
          field_b = (km) null;
        }
        vf.field_c = param0;
        if (db.field_D != ve.field_t) {
          var2 = ve.field_t * ve.field_t;
          var3 = -(db.field_D * db.field_D) + var2;
          param0 = param0 + (-param0 + p.field_h) * var3 / var2;
        }
        we.field_c.a(oh.field_f, 120, 640, (byte) -120, param0);
        ql.a((byte) 117, 5, 640, qi.field_d, 0, -24 + p.field_h, dl.field_b);
    }

    final static boolean a(int param0, int param1, boolean param2, CharSequence param3) {
        int var8 = 0;
        int stackIn_43_0 = 0;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        String stackIn_47_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = Virogrid.field_F ? 1 : 0;
        try {
          if (2 <= param0 &&
            36 >= param0) {
            var4_int = 0;
            if (param1 <= 85) {
              jm.a(88);
            }
            var5 = 0;
            var6 = 0;
            var7 = param3.length();
            for (var8 = 0; var8 < var7; var8++) {
              boolean decompiledFrameRemainder0 = true;
              var9 = param3.charAt(var8);
              if ((0 == var8) &&
                (var9 == 45)) {
                var4_int = 1;
                decompiledFrameRemainder0 = false;
              }
              if ((decompiledFrameRemainder0) && (0 != var8 || (var9 != 43 ||
                !param2))) {
                if (48 <= var9 &&
                  var9 <= 57) {
                  var9 -= 48;
                } else if (65 <= var9 &&
                  var9 <= 90) {
                  var9 -= 55;
                } else {
                  if (var9 < 97) {
                    return false;
                  }
                  if (var9 > 122) {
                    return false;
                  }
                  var9 -= 87;
                }
                if (param0 <= var9) {
                  return false;
                }
                if (var4_int != 0) {
                  var9 = -var9;
                }
                var10 = param0 * var6 + var9;
                if (var6 != var10 / param0) {
                  return false;
                }
                var5 = 1;
                var6 = var10;
              }
            }
            stackIn_43_0 = var5;
            return stackIn_43_0 != 0;
          }
          throw new IllegalArgumentException("" + param0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_46_0 = var4;
          stackIn_46_1 = new StringBuilder().append("jm.G(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_47_2 = "null";
          } else {
            stackIn_47_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_46_0), ((StringBuilder) (Object) stackIn_46_1).append(stackIn_47_2).append(')').toString());
        }
    }

    jm(String param0, km param1) {
        String[] var3 = null;
        km[] var4 = null;
        try {
          var3 = new String[]{param0, ng.field_Y, tl.field_k};
          var4 = new km[]{param1, dg.field_E, (km) ((Object) lg.field_a)};
          this.field_c = new d(0L, ve.field_w, var3, sl.field_h, var4, 0);
        } catch (RuntimeException runtimeException) {
          throw kg.a((Throwable) ((Object) runtimeException), "jm.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean a(byte param0) {
        int var1;
        boolean stackIn_5_0 = false;
        var1 = -125 / ((58 - param0) / 50);
        stackIn_5_0 = (an.field_b) || (qm.i(20));
        return stackIn_5_0;
    }

    final static void a(int param0, int[] param1, int param2, boolean param3, int param4) {
        int[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int[] var9 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5_ref = null;
        var8 = Virogrid.field_F ? 1 : 0;
        try {
          while (true) {
            param0--;
            if (param0 < 0) {
              if (!param3) {
                field_a = (String) null;
              }
              return;
            }
            var9 = param1;
            var5 = var9;
            var6 = param2;
            var7 = param4;
            var9[var6] = var7 + rb.a(8355711, var9[var6] >> 1);
            param2++;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_8_0 = var5_ref;
          stackIn_8_1 = new StringBuilder().append("jm.H(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    static {
        field_a = "Connection lost - attempting to reconnect";
        field_d = "Quit";
    }
}
