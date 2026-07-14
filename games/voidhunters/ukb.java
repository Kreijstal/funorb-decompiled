/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ukb extends rqa {
    static String field_q;
    static llb field_o;
    static String field_p;

    final static String a(String param0, int param1, int param2) {
        int var4 = 0;
        faa var5 = null;
        faa var6 = null;
        faa var7 = null;
        CharSequence var8 = null;
        var8 = (CharSequence) (Object) param0;
        if (!mn.a(var8, (byte) -122)) {
          return tjb.field_Cb;
        } else {
          if (iwa.field_b != 2) {
            return oha.field_p;
          } else {
            if (qja.a((byte) -75, param0)) {
              return oja.field_o;
            } else {
              if (uaa.a(param0, (byte) -23)) {
                return isa.a(dfa.field_b, new String[1], 73);
              } else {
                if (-101 < vob.field_p) {
                  if ((vob.field_p ^ -1) <= -201) {
                    return haa.field_o;
                  } else {
                    if (ltb.a((byte) -94, param0)) {
                      return isa.a(mn.field_a, new String[1], 111);
                    } else {
                      var7 = dpa.field_p;
                      var7.h(24335, param1);
                      var7.field_e = var7.field_e + 1;
                      var4 = var7.field_e;
                      var7.c(0, 0);
                      var7.a(true, param0);
                      if (param2 != 9602) {
                        field_p = null;
                        var7.e(-var4 + var7.field_e, -129);
                        return null;
                      } else {
                        var7.e(-var4 + var7.field_e, -129);
                        return null;
                      }
                    }
                  }
                } else {
                  if (-1 < hcb.field_o) {
                    if ((vob.field_p ^ -1) <= -201) {
                      return haa.field_o;
                    } else {
                      if (ltb.a((byte) -94, param0)) {
                        return isa.a(mn.field_a, new String[1], 111);
                      } else {
                        var6 = dpa.field_p;
                        var5 = var6;
                        var6.h(24335, param1);
                        var6.field_e = var6.field_e + 1;
                        var4 = var6.field_e;
                        var6.c(0, 0);
                        var6.a(true, param0);
                        if (param2 == 9602) {
                          var6.e(-var4 + var6.field_e, -129);
                          return null;
                        } else {
                          field_p = null;
                          var6.e(-var4 + var6.field_e, -129);
                          return null;
                        }
                      }
                    }
                  } else {
                    return haa.field_o;
                  }
                }
              }
            }
          }
        }
    }

    final static void a(String param0, byte param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var2 = kc.field_b;
        var3 = uia.field_b;
        var4 = qc.field_q.field_eb.c(param0, 500);
        var5 = 6 + qc.field_q.field_eb.b(param0, 500);
        var6 = 2 + nna.field_w * var4;
        var7 = jv.a((byte) -109, var2, 12, var5);
        var8 = lma.a(20, var3, var6, (byte) -16);
        dma.b(var7, var8, var5, var6, 0);
        if (param1 <= 9) {
          ukb.e((byte) 26);
          dma.d(1 + var7, 1 + var8, var5 + -2, -2 + var6, 16777088);
          int discarded$2 = qc.field_q.field_eb.a(param0, 3 + var7, var8 + 1 - -atb.field_d - qc.field_q.field_eb.field_k, 500, 1000, 0, -1, 0, 0, nna.field_w);
          return;
        } else {
          dma.d(1 + var7, 1 + var8, var5 + -2, -2 + var6, 16777088);
          int discarded$3 = qc.field_q.field_eb.a(param0, 3 + var7, var8 + 1 - -atb.field_d - qc.field_q.field_eb.field_k, 500, 1000, 0, -1, 0, 0, nna.field_w);
          return;
        }
    }

    public static void e(byte param0) {
        if (param0 >= -36) {
          field_p = null;
          field_q = null;
          field_o = null;
          field_p = null;
          return;
        } else {
          field_q = null;
          field_o = null;
          field_p = null;
          return;
        }
    }

    ukb(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final nc a(nc[] param0, int param1) {
        Object var4 = null;
        if (param1 > -119) {
          var4 = null;
          nc discarded$2 = ((ukb) this).a((nc[]) null, -36);
          si.a(186, 62, param0[0].a(15));
          return new nc((Object) (Object) "void");
        } else {
          si.a(186, 62, param0[0].a(15));
          return new nc((Object) (Object) "void");
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = "Sandbox mode";
        field_q = "Game full";
    }
}
