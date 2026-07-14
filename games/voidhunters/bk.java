/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bk extends mc {
    static faa field_w;
    static jra field_v;

    final void a(int param0) {
        int var2 = 43 / ((-80 - param0) / 42);
        ((bk) this).field_t.a(false);
    }

    final void b(int param0, int param1, int param2, int param3) {
        L0: {
          if (param1 != -1) {
            break L0;
          } else {
            if (null != ((bk) this).field_q) {
              ((bk) this).field_q.a(92, (shb) this, param0, param3, true);
              break L0;
            } else {
              if (param2 >= 47) {
                if (-1 != ((bk) this).field_h) {
                  if (-1 == (((bk) this).field_f ^ -1)) {
                    return;
                  } else {
                    msa.field_s.a(((bk) this).field_r + param3 - -((bk) this).field_f, (byte) 123, ((bk) this).field_h + ((bk) this).field_g + param0, param3 + ((bk) this).field_r, param0 - -((bk) this).field_g);
                    ((bk) this).field_t.b(param0 + ((bk) this).field_g, param1, 63, param3 + ((bk) this).field_r);
                    msa.field_s.a((byte) 92);
                    return;
                  }
                } else {
                  return;
                }
              } else {
                return;
              }
            }
          }
        }
        if (param2 >= 47) {
          if (-1 != ((bk) this).field_h) {
            if (-1 == ((bk) this).field_f) {
              return;
            } else {
              msa.field_s.a(((bk) this).field_r + param3 - -((bk) this).field_f, (byte) 123, ((bk) this).field_h + ((bk) this).field_g + param0, param3 + ((bk) this).field_r, param0 - -((bk) this).field_g);
              ((bk) this).field_t.b(param0 + ((bk) this).field_g, param1, 63, param3 + ((bk) this).field_r);
              msa.field_s.a((byte) 92);
              return;
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    public static void e(int param0) {
        field_v = null;
        if (param0 <= 40) {
            bk.e(87);
            field_w = null;
            return;
        }
        field_w = null;
    }

    final boolean a(int param0, int param1, int param2, int param3, shb param4, int param5, byte param6) {
        if (param6 < -17) {
          if (((bk) this).a(param2, param1, param0, param5, (byte) 22)) {
            if (!super.a(param0, param1, param2, param3, param4, param5, (byte) -123)) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          ((bk) this).b(90, -56, -39, 108);
          if (((bk) this).a(param2, param1, param0, param5, (byte) 22)) {
            if (!super.a(param0, param1, param2, param3, param4, param5, (byte) -123)) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    bk(int param0, int param1, int param2, int param3, wwa param4, shb param5) {
        super(param0, param1, param2, param3, param4, (sba) null);
        ((bk) this).field_t = param5;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_w = new faa(1048576);
        field_v = new jra();
    }
}
