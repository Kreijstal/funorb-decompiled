/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fk extends hs {
    private boolean field_l;
    static String[] field_j;
    static int[] field_k;

    final static int b(int param0, int param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_11_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        var4 = Kickabout.field_G;
        try {
          L0: {
            var3_int = 1;
            L1: while (true) {
              if (param2 <= 1) {
                L2: {
                  if (param1 == -11934) {
                    break L2;
                  } else {
                    fk.f(-39);
                    break L2;
                  }
                }
                if (param2 == 1) {
                  stackOut_10_0 = var3_int * param0;
                  stackIn_11_0 = stackOut_10_0;
                  break L0;
                } else {
                  return var3_int;
                }
              } else {
                L3: {
                  if ((1 & param2) == 0) {
                    break L3;
                  } else {
                    var3_int = var3_int * param0;
                    break L3;
                  }
                }
                param0 = param0 * param0;
                param2 = param2 >> 1;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw nb.a((Throwable) (Object) var3, "fk.C(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_11_0;
    }

    final void f(int param0, int param1) {
        if (param0 < 98) {
            ((fk) this).field_l = true;
        }
    }

    final void e(int param0) {
        ((fk) this).c(112);
        ((fk) this).a(false, vo.a((byte) -18, mc.field_e, new String[1]));
        ((fk) this).b(param0 + -2352, ((fk) this).field_a.field_v);
        ((fk) this).a(150, 17709);
        if (param0 == 1) {
          if (((fk) this).field_a.field_f) {
            un.field_d.a("FB", 5, 17, 16777215, -1);
            return;
          } else {
            return;
          }
        } else {
          ((fk) this).e(-98);
          if (!((fk) this).field_a.field_f) {
            return;
          } else {
            un.field_d.a("FB", 5, 17, 16777215, -1);
            return;
          }
        }
    }

    public static void f(int param0) {
        field_k = null;
        if (param0 != 1) {
            int discarded$0 = fk.b(76, -73, -121);
            field_j = null;
            return;
        }
        field_j = null;
    }

    final void a(int param0, boolean param1) {
        if (param0 < -92) {
          if (param1) {
            if (((fk) this).field_l) {
              return;
            } else {
              or.field_d.b(75, (byte) 74);
              or.field_d.a(121, 4);
              ((fk) this).field_l = true;
              return;
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    fk(nu param0, int param1, boolean param2) {
        super(param0, param1, param2, (int[]) null);
        ((fk) this).field_l = false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = new String[]{"Current Bid:", "Buyout", "Time Left:"};
        field_k = new int[8192];
    }
}
