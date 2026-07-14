/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kc {
    static int field_b;
    static int field_a;

    final static int a(boolean param0) {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        var3 = TombRacer.field_G ? 1 : 0;
        var1 = 0;
        L0: while (true) {
          if (!es.a(true)) {
            if (param0) {
              L1: {
                lp.field_h.a(fk.a(jm.field_m, (byte) -113, lba.field_p), 35, fk.a(jba.field_j, (byte) -113, sta.field_B));
                if (!lp.field_h.a(false)) {
                  break L1;
                } else {
                  var1 = 1;
                  break L1;
                }
              }
              var2 = 0;
              if (var1 != 0) {
                if (lp.field_h.field_h <= -1) {
                  var2 = rga.field_b[lp.field_h.field_h];
                  if (-3 != var2) {
                    return var2;
                  } else {
                    qfa.a(-103);
                    return var2;
                  }
                } else {
                  return var2;
                }
              } else {
                return var2;
              }
            } else {
              return -17;
            }
          } else {
            lp.field_h.c(18);
            if (lp.field_h.a(false)) {
              var1 = 1;
              continue L0;
            } else {
              continue L0;
            }
          }
        }
    }

    final static String a(String param0, int param1, boolean param2, String param3) {
        kh var5 = null;
        int var6 = 0;
        mu var7 = null;
        CharSequence var8 = null;
        int stackIn_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        L0: {
          if (param2) {
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 1;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        var8 = (CharSequence) (Object) param0;
        if (fs.a(stackIn_3_0 == 0, var8)) {
          return pk.field_v;
        } else {
          if ((ae.field_g ^ -1) == -3) {
            var7 = uh.a(param3, 115);
            if (var7 == null) {
              return gl.a((byte) 119, uqa.field_A, new String[1]);
            } else {
              var7.p(105);
              var7.c(-7975);
              tba.field_k = tba.field_k - 1;
              var5 = ql.field_k;
              var5.k(param1, -2988);
              var5.field_h = var5.field_h + 1;
              var6 = var5.field_h;
              var5.i(3, 0);
              var5.a(param0, param2);
              var5.d(-var6 + var5.field_h, (byte) 117);
              return null;
            }
          } else {
            return rt.field_n;
          }
        }
    }

    static {
    }
}
