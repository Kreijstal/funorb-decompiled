/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class rw extends pj {
    boolean field_s;
    volatile boolean field_u;
    boolean field_t;
    static ri[] field_r;

    final static String c(byte param0) {
        if (param0 > -81) {
            return (String) null;
        }
        if (!(nw.field_e != ad.field_p)) {
            return bi.field_d;
        }
        return kh.field_d;
    }

    rw() {
        this.field_u = true;
    }

    abstract int a(int param0);

    abstract byte[] d(boolean param0);

    public static void c(boolean param0) {
        field_r = null;
        if (!param0) {
            field_r = (ri[]) null;
        }
    }

    final static void a(byte param0) {
        wb var1 = null;
        RuntimeException var1_ref = null;
        wb var2 = null;
        int var3 = 0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              var1 = new wb(540, 140);
              jq.a(7161, var1);
              nk.b();
              if (param0 == -90) {
                break L1;
              } else {
                field_r = (ri[]) null;
                break L1;
              }
            }
            lk.b();
            td.field_u = 0;
            ok.b(256);
            var2 = var1.b();
            var3 = 0;
            L2: while (true) {
              L3: {
                if (var3 >= 15) {
                  eh.field_b.d();
                  var1.b(0, 0);
                  su.a((byte) 76);
                  break L3;
                } else {
                  var2.c(-2, -2, 16777215);
                  lk.c(4, 4, 0, 0, 540, 140);
                  var3++;
                  if (var4 != 0) {
                    break L3;
                  } else {
                    continue L2;
                  }
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw qo.a((Throwable) ((Object) var1_ref), "rw.B(" + param0 + ')');
        }
    }

    static {
    }
}
