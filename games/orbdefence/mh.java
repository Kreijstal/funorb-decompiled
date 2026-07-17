/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mh {
    private ca field_g;
    private int field_h;
    private int field_d;
    private ca[] field_e;
    private ca field_c;
    static java.awt.Frame field_b;
    static String field_f;
    static dl[] field_a;

    final void a(long param0, byte param1, ca param2) {
        ca var5 = null;
        try {
            if (!(param2.field_c == null)) {
                param2.b(57);
            }
            var5 = ((mh) this).field_e[(int)((long)(((mh) this).field_d + -1) & param0)];
            param2.field_c = var5.field_c;
            param2.field_e = var5;
            param2.field_c.field_e = param2;
            int var6 = 4 / ((param1 - -48) / 34);
            param2.field_e.field_c = param2;
            param2.field_d = param0;
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) (Object) runtimeException, "mh.D(" + param0 + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 41);
        }
    }

    final ca c(byte param0) {
        int var3 = 0;
        ca var4 = null;
        ca var5 = null;
        ca var17 = null;
        ca var18 = null;
        ca var22 = null;
        ca var31 = null;
        var3 = OrbDefence.field_D ? 1 : 0;
        if (((mh) this).field_h > 0) {
          if (((mh) this).field_e[-1 + ((mh) this).field_h] != ((mh) this).field_c) {
            var31 = ((mh) this).field_c;
            ((mh) this).field_c = var31.field_e;
            return var31;
          } else {
            if (param0 >= -55) {
              ca discarded$6 = ((mh) this).a((byte) 19);
              L0: while (true) {
                if (((mh) this).field_h < ((mh) this).field_d) {
                  int fieldTemp$7 = ((mh) this).field_h;
                  ((mh) this).field_h = ((mh) this).field_h + 1;
                  var4 = ((mh) this).field_e[fieldTemp$7].field_e;
                  var22 = var4;
                  if (var4 != ((mh) this).field_e[((mh) this).field_h - 1]) {
                    ((mh) this).field_c = var22.field_e;
                    return var22;
                  } else {
                    continue L0;
                  }
                } else {
                  return null;
                }
              }
            } else {
              L1: while (true) {
                if (((mh) this).field_h < ((mh) this).field_d) {
                  int fieldTemp$8 = ((mh) this).field_h;
                  ((mh) this).field_h = ((mh) this).field_h + 1;
                  var4 = ((mh) this).field_e[fieldTemp$8].field_e;
                  var18 = var4;
                  if (var4 != ((mh) this).field_e[((mh) this).field_h - 1]) {
                    ((mh) this).field_c = var18.field_e;
                    return var18;
                  } else {
                    continue L1;
                  }
                } else {
                  return null;
                }
              }
            }
          }
        } else {
          if (param0 < -55) {
            L2: while (true) {
              if (((mh) this).field_h < ((mh) this).field_d) {
                int fieldTemp$9 = ((mh) this).field_h;
                ((mh) this).field_h = ((mh) this).field_h + 1;
                var4 = ((mh) this).field_e[fieldTemp$9].field_e;
                var17 = var4;
                if (var4 != ((mh) this).field_e[((mh) this).field_h - 1]) {
                  ((mh) this).field_c = var17.field_e;
                  return var17;
                } else {
                  continue L2;
                }
              } else {
                return null;
              }
            }
          } else {
            ca discarded$10 = ((mh) this).a((byte) 19);
            L3: while (true) {
              if (((mh) this).field_h < ((mh) this).field_d) {
                int fieldTemp$11 = ((mh) this).field_h;
                ((mh) this).field_h = ((mh) this).field_h + 1;
                var4 = ((mh) this).field_e[fieldTemp$11].field_e;
                var5 = var4;
                if (var4 != ((mh) this).field_e[((mh) this).field_h - 1]) {
                  ((mh) this).field_c = var5.field_e;
                  return var5;
                } else {
                  continue L3;
                }
              } else {
                return null;
              }
            }
          }
        }
    }

    final static void b(byte param0) {
        pc.a(-1, sk.field_G, of.field_H, true);
        jc.field_j = true;
        if (param0 == -57) {
            return;
        }
        mh.b((byte) -116);
    }

    public static void a() {
        field_f = null;
        field_a = null;
        field_b = null;
    }

    final ca a(byte param0) {
        if (param0 < 115) {
            ca discarded$0 = ((mh) this).a((byte) -8);
            ((mh) this).field_h = 0;
            return ((mh) this).c((byte) -108);
        }
        ((mh) this).field_h = 0;
        return ((mh) this).c((byte) -108);
    }

    mh(int param0) {
        int var2 = 0;
        ca var3 = null;
        ((mh) this).field_h = 0;
        ((mh) this).field_d = param0;
        ((mh) this).field_e = new ca[param0];
        var2 = 0;
        L0: while (true) {
          if (var2 < param0) {
            ca dupTemp$2 = new ca();
            var3 = dupTemp$2;
            ((mh) this).field_e[var2] = dupTemp$2;
            var3.field_e = var3;
            var3.field_c = var3;
            var2++;
            continue L0;
          } else {
            return;
          }
        }
    }

    final ca a(long param0, int param1) {
        ca var5 = null;
        int var6 = OrbDefence.field_D ? 1 : 0;
        if (param1 != -1) {
            return null;
        }
        ca var4 = ((mh) this).field_e[(int)(param0 & (long)(-1 + ((mh) this).field_d))];
        ((mh) this).field_g = var4.field_e;
        while (((mh) this).field_g != var4) {
            if (~((mh) this).field_g.field_d == ~param0) {
                var5 = ((mh) this).field_g;
                ((mh) this).field_g = ((mh) this).field_g.field_e;
                return var5;
            }
            ((mh) this).field_g = ((mh) this).field_g.field_e;
        }
        ((mh) this).field_g = null;
        return null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "Please try again in a few minutes.";
    }
}
