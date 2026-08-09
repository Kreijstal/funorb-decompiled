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
        int var4;
        int var5;
        int var6;
        int var7;
        var7 = TombRacer.field_G ? 1 : 0;
        if (param0 < -13) {
          var4 = this.a(0, param2);
          if (0 != (var4 ^ -1)) {
            return;
          } else {
            L0: {
              this.field_a.field_y[param2].a(param1, (byte) 37);
              if (null == this.field_b) {
                break L0;
              } else {
                this.field_b.a(new fm(64, 0, 0, 0), -58);
                break L0;
              }
            }
            L1: {
              if (this.field_a.a(-112)) {
                this.field_e = true;
                var5 = 0;
                L2: while (true) {
                  if (var5 >= this.field_a.field_H.length) {
                    break L1;
                  } else {
                    var6 = 0;
                    L3: while (true) {
                      if (var6 >= this.field_a.field_H.length) {
                        var5++;
                        continue L2;
                      } else {
                        if ((var5 ^ -1) == (var6 ^ -1)) {
                          this.field_a.field_D.a(var5, (byte) -52, this.field_a.field_y[var5].b(80));
                          var6++;
                          continue L3;
                        } else {
                          this.field_a.field_D.a(var5, this.field_a.field_y[var6].b(71), true);
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
            field_f = (String) null;
        }
        return this.field_a.field_y[param1].b(100);
    }

    final void a(int param0) {
        if (!(!this.field_e)) {
            return;
        }
        if (param0 != 32221) {
            return;
        }
        if (!(this.field_b == null)) {
            this.field_b.a(84, false);
        }
    }

    daa(ff param0) {
        try {
            this.field_a = param0;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "daa.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public static void b(int param0) {
        field_f = null;
        field_c = null;
        field_d = null;
        if (param0 != -12224) {
            field_f = (String) null;
        }
    }

    final boolean a(boolean param0) {
        if (param0) {
            return false;
        }
        return this.field_e;
    }

    static {
        field_c = "Email: ";
        field_f = "Use wits and quick timing to navigate each chamber of the temple. Earn points by grabbing treasure and escaping quickly.";
    }
}
