/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class daa {
    static String field_f;
    static lqa field_d;
    private ff field_a;
    static String field_c;
    w field_b;
    private boolean field_e;

    final void a(byte param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var7 = TombRacer.field_G ? 1 : 0;
        if (param0 < -13) {
          var4 = ((daa) this).a(0, param2);
          if (var4 != -1) {
            return;
          } else {
            L0: {
              ((daa) this).field_a.field_y[param2].a(param1, (byte) 37);
              if (null == ((daa) this).field_b) {
                break L0;
              } else {
                fla discarded$2 = ((daa) this).field_b.a(new fm(64, 0, 0, 0), -58);
                break L0;
              }
            }
            L1: {
              if (((daa) this).field_a.a(-112)) {
                ((daa) this).field_e = true;
                var5 = 0;
                L2: while (true) {
                  if (var5 >= ((daa) this).field_a.field_H.length) {
                    break L1;
                  } else {
                    var6 = 0;
                    L3: while (true) {
                      if (var6 >= ((daa) this).field_a.field_H.length) {
                        var5++;
                        continue L2;
                      } else {
                        if (var5 == var6) {
                          ((daa) this).field_a.field_D.a(var5, (byte) -52, ((daa) this).field_a.field_y[var5].b(80));
                          var6++;
                          continue L3;
                        } else {
                          ((daa) this).field_a.field_D.a(var5, ((daa) this).field_a.field_y[var6].b(71), true);
                          var6++;
                          continue L3;
                        }
                      }
                    }
                  }
                }
              } else {
                break L1;
              }
            }
            return;
          }
        } else {
          return;
        }
    }

    final int a(int param0, int param1) {
        if (param0 != 0) {
            field_f = null;
        }
        return ((daa) this).field_a.field_y[param1].b(100);
    }

    final void a(int param0) {
        if (!(!((daa) this).field_e)) {
            return;
        }
        if (param0 != 32221) {
            return;
        }
        if (!(((daa) this).field_b == null)) {
            ((daa) this).field_b.a(84, false);
        }
    }

    daa(ff param0) {
        try {
            ((daa) this).field_a = param0;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "daa.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    public static void b(int param0) {
        field_f = null;
        field_c = null;
        field_d = null;
    }

    final boolean a(boolean param0) {
        if (param0) {
            return false;
        }
        return ((daa) this).field_e;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Email: ";
        field_f = "Use wits and quick timing to navigate each chamber of the temple. Earn points by grabbing treasure and escaping quickly.";
    }
}
