/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ma extends ui implements cc {
    private dj field_l;
    static int field_j;
    static int field_k;

    final static void e(int param0) {
        int var2 = 0;
        int var3 = TorChallenge.field_F ? 1 : 0;
        if (param0 <= 23) {
            field_j = -62;
        }
        pa var1 = dk.field_s;
        while (de.a(-1)) {
            var1.d(25, 8);
            var1.field_q = var1.field_q + 1;
            var2 = var1.field_q + 1;
            hb.a(var1, -95);
            dk.field_s.a(var1.field_q - var2, -111);
        }
    }

    final static vi b(String param0, byte param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = TorChallenge.field_F ? 1 : 0;
        var3 = -46 % ((param1 - 62) / 41);
        var2 = param0.length();
        if (var2 != 0) {
          if (-64 <= (var2 ^ -1)) {
            var4 = 0;
            L0: while (true) {
              if (var4 < var2) {
                var5 = param0.charAt(var4);
                if (45 == var5) {
                  L1: {
                    if (var4 == 0) {
                      break L1;
                    } else {
                      if (var4 == -1 + var2) {
                        break L1;
                      } else {
                        var4++;
                        continue L0;
                      }
                    }
                  }
                  return di.field_g;
                } else {
                  if ((bl.field_Q.indexOf(var5) ^ -1) == 0) {
                    return di.field_g;
                  } else {
                    var4++;
                    continue L0;
                  }
                }
              } else {
                return null;
              }
            }
          } else {
            return uk.field_I;
          }
        } else {
          return dj.field_W;
        }
    }

    public final void b(dj param0, int param1) {
        if (param1 != 3) {
            field_j = -97;
        }
        ((ma) this).a(true);
    }

    final static ka[] a(int param0, int param1, int param2, int param3, boolean param4) {
        if (!param4) {
            return null;
        }
        ka[] var6 = new ka[9];
        ka[] var5 = var6;
        var6[6] = e.a(param1, param2, (byte) -113);
        var5[3] = e.a(param1, param2, (byte) -113);
        var5[2] = e.a(param1, param2, (byte) -113);
        var5[1] = e.a(param1, param2, (byte) -113);
        var5[0] = e.a(param1, param2, (byte) -113);
        var6[8] = e.a(param0, param2, (byte) -100);
        var5[7] = e.a(param0, param2, (byte) -100);
        var5[5] = e.a(param0, param2, (byte) -100);
        if (!(0 == param3)) {
            var6[4] = e.a(param3, 64, (byte) -100);
        }
        return var5;
    }

    ma(dj param0) {
        ((ma) this).field_l = param0;
    }

    public final boolean a(int param0) {
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0 == 6650) {
            break L0;
          } else {
            ((ma) this).field_l = null;
            break L0;
          }
        }
        L1: {
          L2: {
            if (((ma) this).field_l.field_v == null) {
              break L2;
            } else {
              if (((ma) this).field_l.field_v.length() != 0) {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                break L1;
              } else {
                break L2;
              }
            }
          }
          stackOut_5_0 = 1;
          stackIn_7_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_7_0 != 0;
    }

    final rj b(byte param0) {
        if (param0 < 79) {
            field_j = 104;
        }
        return ((ma) this).a((byte) 24, ((ma) this).field_l.field_v);
    }

    abstract String a(String param0, byte param1);

    public final void a(dj param0, int param1) {
        if (param1 != 5) {
            ((ma) this).field_l = null;
        }
    }

    abstract rj a(byte param0, String param1);

    final String d(int param0) {
        if (param0 != 5) {
            return null;
        }
        return ((ma) this).a(((ma) this).field_l.field_v, (byte) -24);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = 0;
        field_k = 0;
    }
}
