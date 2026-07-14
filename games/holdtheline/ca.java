/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ca extends ln {
    static int field_s;
    static gn field_p;
    boolean field_q;
    static int field_r;
    static String field_o;
    volatile boolean field_u;
    boolean field_t;

    final static String[] a(byte param0, char param1, String param2) {
        String[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        String[] var7 = null;
        int var8 = 0;
        String[] var9 = null;
        int var10 = 0;
        var8 = HoldTheLine.field_D;
        var9 = fl.a(param2, (byte) -120, param1);
        var3 = var9;
        var6 = -65 % ((param0 - -68) / 35);
        var5 = 0;
        var4 = 0;
        L0: while (true) {
          if (var9.length <= var4) {
            var7 = new String[var5];
            var5 = 0;
            var10 = 0;
            var4 = var10;
            L1: while (true) {
              if (var10 >= var9.length) {
                return var7;
              } else {
                if (0 < var9[var10].trim().length()) {
                  var5++;
                  var7[var5] = var9[var10].trim();
                  var10++;
                  continue L1;
                } else {
                  var10++;
                  continue L1;
                }
              }
            }
          } else {
            if (0 < var9[var4].trim().length()) {
              var5++;
              var4++;
              continue L0;
            } else {
              var4++;
              continue L0;
            }
          }
        }
    }

    final static void h(int param0) {
        if (null == ec.field_D) {
        } else {
            if (lc.field_d != null) {
                // ifeq L33
            } else {
                gn.a(true, ec.field_D, (byte) 69, 30);
                ec.field_D = null;
                lc.field_d = null;
            }
        }
        if (param0 != -11875) {
            field_s = -14;
        }
        sf.a(-1379);
    }

    public static void f(int param0) {
        field_o = null;
        if (param0 != -1010) {
            return;
        }
        field_p = null;
    }

    abstract int g(int param0);

    abstract byte[] i(int param0);

    final static boolean a(qm param0, int param1, qm param2, int param3, in param4, int param5, int param6) {
        in var11 = new in(param2, param0);
        float var8 = param4.a(var11, (byte) -10);
        if ((float)(-(param3 + param5)) > var8) {
            return false;
        }
        if ((float)(param5 + param3) < var8) {
            return false;
        }
        float var9 = param4.a(var11, true);
        if (param6 < 61) {
            Object var10 = null;
            boolean discarded$0 = ca.a((qm) null, -92, (qm) null, -119, (in) null, 62, -87);
        }
        if (!(var9 >= (float)(-(param3 + param1)))) {
            return false;
        }
        if (var9 <= (float)(param3 + param1)) {
            return true;
        }
        return false;
    }

    final static nd a(String[] args, byte param1) {
        nd var2 = new nd(false);
        var2.field_j = args;
        if (param1 <= 87) {
            field_p = null;
        }
        return var2;
    }

    ca() {
        ((ca) this).field_u = true;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = "Main Menu";
    }
}
