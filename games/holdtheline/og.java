/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class og {
    private int field_d;
    private hl field_c;
    private hl[] field_a;
    private int field_e;
    private hl field_b;

    final hl a(byte param0, long param1) {
        hl var4 = null;
        hl var5 = null;
        int var6 = 0;
        var6 = HoldTheLine.field_D;
        if (param0 >= 111) {
          var4 = ((og) this).field_a[(int)(param1 & (long)(((og) this).field_d + -1))];
          ((og) this).field_b = var4.field_h;
          L0: while (true) {
            if (var4 != ((og) this).field_b) {
              if (~((og) this).field_b.field_f == ~param1) {
                var5 = ((og) this).field_b;
                ((og) this).field_b = ((og) this).field_b.field_h;
                return var5;
              } else {
                ((og) this).field_b = ((og) this).field_b.field_h;
                continue L0;
              }
            } else {
              ((og) this).field_b = null;
              return null;
            }
          }
        } else {
          return null;
        }
    }

    final void a(hl param0, long param1, boolean param2) {
        hl var5 = null;
        if (param0.field_a != null) {
            param0.d(0);
        }
        if (param2) {
            return;
        }
        try {
            var5 = ((og) this).field_a[(int)((long)(((og) this).field_d - 1) & param1)];
            param0.field_a = var5.field_a;
            param0.field_h = var5;
            param0.field_a.field_h = param0;
            param0.field_f = param1;
            param0.field_h.field_a = param0;
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) (Object) runtimeException, "og.B(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 41);
        }
    }

    final static void a() {
        sm.field_c.a((n) (Object) new pk(), (byte) 87);
    }

    final hl a(int param0) {
        ((og) this).field_e = param0;
        return ((og) this).b(-1);
    }

    final hl b(int param0) {
        int var3 = 0;
        hl var4 = null;
        hl var5 = null;
        hl var6 = null;
        hl var9 = null;
        var3 = HoldTheLine.field_D;
        if (0 < ((og) this).field_e) {
          if (((og) this).field_a[-1 + ((og) this).field_e] == ((og) this).field_c) {
            L0: while (true) {
              if (((og) this).field_d <= ((og) this).field_e) {
                if (param0 == -1) {
                  return null;
                } else {
                  ((og) this).field_d = -105;
                  return null;
                }
              } else {
                int fieldTemp$2 = ((og) this).field_e;
                ((og) this).field_e = ((og) this).field_e + 1;
                var4 = ((og) this).field_a[fieldTemp$2].field_h;
                var6 = var4;
                if (var4 != ((og) this).field_a[-1 + ((og) this).field_e]) {
                  ((og) this).field_c = var6.field_h;
                  return var6;
                } else {
                  continue L0;
                }
              }
            }
          } else {
            var9 = ((og) this).field_c;
            ((og) this).field_c = var9.field_h;
            return var9;
          }
        } else {
          L1: while (true) {
            if (((og) this).field_d <= ((og) this).field_e) {
              if (param0 == -1) {
                return null;
              } else {
                ((og) this).field_d = -105;
                return null;
              }
            } else {
              int fieldTemp$3 = ((og) this).field_e;
              ((og) this).field_e = ((og) this).field_e + 1;
              var4 = ((og) this).field_a[fieldTemp$3].field_h;
              var5 = var4;
              if (var4 != ((og) this).field_a[-1 + ((og) this).field_e]) {
                ((og) this).field_c = var5.field_h;
                return var5;
              } else {
                continue L1;
              }
            }
          }
        }
    }

    og(int param0) {
        int var2 = 0;
        hl var3 = null;
        ((og) this).field_e = 0;
        ((og) this).field_a = new hl[param0];
        ((og) this).field_d = param0;
        var2 = 0;
        L0: while (true) {
          if (param0 > var2) {
            hl dupTemp$2 = new hl();
            var3 = dupTemp$2;
            ((og) this).field_a[var2] = dupTemp$2;
            var3.field_h = var3;
            var3.field_a = var3;
            var2++;
            continue L0;
          } else {
            return;
          }
        }
    }

    static {
    }
}
