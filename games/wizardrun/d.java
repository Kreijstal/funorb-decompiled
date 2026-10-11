/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class d {
    static String field_b;
    static String field_a;
    static int[] field_c;

    final static void a(String param0, int param1) {
        int stackIn_16_0 = 0;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        String stackIn_43_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        var3 = wizardrun.field_H;
        try {
          if (og.field_O == -1 &&
            ee.field_r == -1) {
            og.field_O = pg.field_n;
            ee.field_r = fi.field_B;
          }
          boolean decompiledFrameRemainder0 = true;
          gj.field_b = gj.field_b + 1;
          if (param0 != null) {
            decompiledFrameRemainder0 = !(param0.equals(vb.field_I));
          } else {
            decompiledFrameRemainder0 = (null == vb.field_I);
          }
          if (decompiledFrameRemainder0) {
            if (!ol.field_b) {
              if (jc.field_I <= gj.field_b) {
                stackIn_16_0 = (jc.field_I + ll.field_o > gj.field_b) ? 1 : 0;
              } else {
                stackIn_16_0 = 0;
              }
            } else {
              stackIn_16_0 = 0;
            }
            var2_int = stackIn_16_0;
            if (param0 == null) {
              gj.field_b = 0;
            } else {
              if (ol.field_b) {
                gj.field_b = jc.field_I;
              } else {
                if (var2_int == 0) {
                  gj.field_b = 0;
                } else {
                  gj.field_b = jc.field_I;
                }
              }
            }
            uc.field_a = og.field_O;
            if (param0 == null) {
              if (var2_int != 0) {
                ol.field_b = true;
              }
            } else {
              ol.field_b = false;
            }
            ag.field_u = ee.field_r;
          }
          if (!ol.field_b &&
            jc.field_I > gj.field_b &&
            ih.field_a) {
            ag.field_u = ee.field_r;
            uc.field_a = og.field_O;
            gj.field_b = 0;
          }
          vb.field_I = param0;
          ee.field_r = -1;
          og.field_O = -1;
          if (param1 != 0) {
            d.a(false, 'b');
          }
          if (ol.field_b &&
            q.field_b == gj.field_b) {
            ol.field_b = false;
            gj.field_b = 0;
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_42_0 = var2;
          stackIn_42_1 = new StringBuilder().append("d.D(");
          if (param0 == null) {
            stackIn_43_2 = "null";
          } else {
            stackIn_43_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_42_0), ((StringBuilder) (Object) stackIn_42_1).append(stackIn_43_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void a(int param0) {
        if (param0 == -5309) {
          field_c = null;
          field_b = null;
          field_a = null;
          return;
        }
        d.a((byte) 113);
        field_c = null;
        field_b = null;
        field_a = null;
    }

    final synchronized static long a(byte param0) {
        if (param0 < 16) {
          return 0L;
        }
        long var1 = System.currentTimeMillis();
        if (var1 >= sj.field_k) {
          sj.field_k = var1;
          return rb.field_d + var1;
        }
        rb.field_d = rb.field_d + (-var1 + sj.field_k);
        sj.field_k = var1;
        return rb.field_d + var1;
    }

    final static boolean a(boolean param0, char param1) {
        if (!param0) {
          d.a(87);
          if (160 == param1) {
            return true;
          }
          if (param1 == 32) {
            return true;
          }
          if (param1 == 95) {
            return true;
          }
          if (param1 != 45) {
            return false;
          }
          return true;
        }
        if (160 == param1) {
          return true;
        }
        if (param1 == 32) {
          return true;
        }
        if (param1 == 95) {
          return true;
        }
        if (param1 != 45) {
          return false;
        }
        return true;
    }

    static {
        field_b = "Player names can be up to 12 letters, numbers and underscores";
        field_c = new int[8192];
    }
}
