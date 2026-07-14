/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class me extends vg {
    boolean field_h;
    qh field_i;
    static String field_f;
    ff field_g;

    abstract boolean a(int param0, char param1, byte param2);

    abstract void a(byte param0);

    abstract boolean a(boolean param0);

    final boolean c(byte param0) {
        if (param0 > -109) {
            me.a(109);
        }
        return ((me) this).field_h;
    }

    public static void a(int param0) {
        if (param0 != 17355) {
            field_f = null;
        }
        field_f = null;
    }

    void b(int param0) {
        if (param0 != -10968) {
            boolean discarded$0 = ((me) this).c((byte) -2);
        }
        ((me) this).field_h = true;
    }

    abstract void b(byte param0);

    me(qh param0) {
        ((me) this).field_i = param0;
        ((me) this).field_g = param0.field_k;
    }

    final static short[] a(byte param0, int param1, kh param2, short[] param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = TombRacer.field_G ? 1 : 0;
        var4 = param2.b((byte) 44, param1);
        if (-1 != (var4 ^ -1)) {
          L0: {
            L1: {
              if (param3 == null) {
                break L1;
              } else {
                if (param3.length == var4) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            param3 = new short[var4];
            break L0;
          }
          L2: {
            var5 = param2.b((byte) 44, 4);
            var6 = (short)param2.b((byte) 44, 16);
            if (-1 > (var5 ^ -1)) {
              var7 = 0;
              L3: while (true) {
                if (var4 <= var7) {
                  break L2;
                } else {
                  param3[var7] = (short)(param2.b((byte) 44, var5) + var6);
                  var7++;
                  continue L3;
                }
              }
            } else {
              var7 = 0;
              L4: while (true) {
                if (var7 >= var4) {
                  break L2;
                } else {
                  param3[var7] = (short)var6;
                  var7++;
                  continue L4;
                }
              }
            }
          }
          L5: {
            if (param0 > 64) {
              break L5;
            } else {
              field_f = null;
              break L5;
            }
          }
          return param3;
        } else {
          return null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "Enter a password for this account. Try to pick a strong password that can't easily be guessed.";
    }
}
