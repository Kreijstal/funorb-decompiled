/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class nh {
    static String field_c;
    static char[] field_b;
    static vg field_a;

    abstract int a(int param0, int param1);

    public static void a(boolean param0) {
        if (!param0) {
            Object var2 = null;
            nh.a((java.math.BigInteger) null, (java.math.BigInteger) null, 127, (qc) null, (byte[]) null, -60, false);
        }
        field_b = null;
        field_a = null;
        field_c = null;
    }

    abstract bm a(byte param0);

    abstract byte[] b(int param0, int param1);

    final static void a(java.math.BigInteger param0, java.math.BigInteger param1, int param2, qc param3, byte[] param4, int param5, boolean param6) {
        int var7 = 0;
        int[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        int[] var11 = null;
        int[] var12 = null;
        int[] var13 = null;
        int[] var14 = null;
        L0: {
          var7 = ja.b(1221916132, param5);
          if (cl.field_e == null) {
            cl.field_e = new java.security.SecureRandom();
            break L0;
          } else {
            break L0;
          }
        }
        var14 = new int[4];
        var13 = var14;
        var12 = var13;
        var11 = var12;
        var8 = var11;
        var9 = 0;
        L1: while (true) {
          if (var9 >= 4) {
            L2: {
              L3: {
                if (null == fa.field_c) {
                  break L3;
                } else {
                  if (fa.field_c.field_j.length < var7) {
                    break L3;
                  } else {
                    break L2;
                  }
                }
              }
              fa.field_c = new qc(var7);
              break L2;
            }
            L4: {
              L5: {
                fa.field_c.field_f = 0;
                fa.field_c.a(param5, -97, param4, param2);
                fa.field_c.a((byte) -84, var7);
                fa.field_c.a(var14, (byte) -33);
                if (vf.field_I == null) {
                  break L5;
                } else {
                  if ((vf.field_I.field_j.length ^ -1) > -101) {
                    break L5;
                  } else {
                    break L4;
                  }
                }
              }
              vf.field_I = new qc(100);
              break L4;
            }
            vf.field_I.field_f = 0;
            vf.field_I.d((byte) -69, 10);
            var10 = 0;
            var9 = var10;
            L6: while (true) {
              if (var10 >= 4) {
                if (param6) {
                  vf.field_I.e(param5, 28695);
                  vf.field_I.a(0, param0, param1);
                  param3.a(vf.field_I.field_f, -97, vf.field_I.field_j, 0);
                  param3.a(fa.field_c.field_f, -97, fa.field_c.field_j, 0);
                  return;
                } else {
                  return;
                }
              } else {
                vf.field_I.c((byte) 95, var14[var10]);
                var10++;
                continue L6;
              }
            }
          } else {
            var8[var9] = cl.field_e.nextInt();
            var9++;
            continue L1;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Loading...";
        field_b = new char[]{(char)91, (char)93, (char)35};
    }
}
