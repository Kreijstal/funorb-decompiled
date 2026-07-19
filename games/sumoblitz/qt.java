/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class qt {
    private boolean field_b;
    int field_a;

    final static void b(boolean param0) {
        lj discarded$2 = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        double var2 = 0.0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0) {
                break L1;
              } else {
                discarded$2 = qt.a((byte) -32);
                break L1;
              }
            }
            nk.b();
            sq.field_a = new int[260];
            jn.field_b = 11;
            var1_int = 0;
            L2: while (true) {
              L3: {
                L4: {
                  if (-257 >= (var1_int ^ -1)) {
                    break L4;
                  } else {
                    var2 = 15.0;
                    sq.field_a[var1_int] = (int)(255.0 * Math.pow((double)((float)var1_int / 256.0f), var2));
                    var1_int++;
                    if (var4 != 0) {
                      break L3;
                    } else {
                      if (var4 == 0) {
                        continue L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                var1_int = 256;
                break L3;
              }
              L5: while (true) {
                if (var1_int >= sq.field_a.length) {
                  break L0;
                } else {
                  sq.field_a[var1_int] = 255;
                  var1_int++;
                  if (var4 == 0) {
                    continue L5;
                  } else {
                    return;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw qo.a((Throwable) ((Object) var1), "qt.E(" + param0 + ')');
        }
    }

    final static lj a(byte param0) {
        String var1 = null;
        if (param0 != 21) {
          return (lj) null;
        } else {
          L0: {
            var1 = gi.c((byte) -2);
            if (var1 == null) {
              break L0;
            } else {
              if (var1.indexOf('@') < 0) {
                break L0;
              } else {
                var1 = "";
                break L0;
              }
            }
          }
          return new lj(gi.c((byte) -2), kc.a(param0 + -3));
        }
    }

    final void b(byte param0) {
        if (param0 > -126) {
            this.field_b = true;
            this.field_b = false;
            return;
        }
        this.field_b = false;
    }

    final boolean a(boolean param0) {
        if (param0) {
            return true;
        }
        return this.field_b;
    }

    final void a(int param0) {
        if (param0 != 5295) {
            qt.b(false);
            this.field_b = true;
            return;
        }
        this.field_b = true;
    }

    qt() {
        this.field_a = -1;
    }

    static {
    }
}
