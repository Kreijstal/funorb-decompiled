/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class al implements hf {
    static gl field_f;
    int field_g;
    private woa field_c;
    float[] field_b;
    static String field_a;
    int[] field_e;
    int field_d;

    final static void a(int param0) {
        CharSequence var2 = null;
        CharSequence var3 = null;
        if (param0 >= -84) {
          field_a = null;
          kca.field_a = qga.field_b.a(-1);
          var2 = (CharSequence) (Object) kca.field_a;
          ffb.field_e = jwa.a(false, var2);
          return;
        } else {
          kca.field_a = qga.field_b.a(-1);
          var3 = (CharSequence) (Object) kca.field_a;
          ffb.field_e = jwa.a(false, var3);
          return;
        }
    }

    final static void a(ksa param0, ksa param1, int param2) {
        Object var4 = null;
        L0: {
          if (param0.field_a != null) {
            param0.b(-3846);
            break L0;
          } else {
            break L0;
          }
        }
        param0.field_a = param1.field_a;
        param0.field_c = param1;
        param0.field_a.field_c = param0;
        if (param2 != 2) {
          var4 = null;
          al.a((ksa) null, (ksa) null, 44);
          param0.field_c.field_a = param0;
          return;
        } else {
          param0.field_c.field_a = param0;
          return;
        }
    }

    al(sob param0, aja param1, woa param2) {
        sda var5 = null;
        wfa var6 = null;
        L0: {
          if (!(param1 instanceof sda)) {
            if (param1 instanceof wfa) {
              var6 = (wfa) (Object) param1;
              ((al) this).field_e = var6.field_F;
              ((al) this).field_g = var6.field_q;
              ((al) this).field_d = var6.field_e;
              break L0;
            } else {
              throw new RuntimeException();
            }
          } else {
            var5 = (sda) (Object) param1;
            ((al) this).field_d = var5.field_e;
            ((al) this).field_g = var5.field_q;
            ((al) this).field_e = var5.field_F;
            break L0;
          }
        }
        L1: {
          if (param2 == null) {
            break L1;
          } else {
            L2: {
              ((al) this).field_c = param2;
              if (((al) this).field_d != ((al) this).field_c.field_a) {
                break L2;
              } else {
                if (((al) this).field_g == ((al) this).field_c.field_c) {
                  ((al) this).field_b = ((al) this).field_c.field_d;
                  break L1;
                } else {
                  break L2;
                }
              }
            }
            throw new RuntimeException();
          }
        }
    }

    public static void a(boolean param0) {
        if (!param0) {
            al.a(-57);
            field_f = null;
            field_a = null;
            return;
        }
        field_f = null;
        field_a = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = new gl(2);
    }
}
