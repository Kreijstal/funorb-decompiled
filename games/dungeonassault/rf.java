/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class rf extends ii {
    private ji field_R;
    static String field_L;
    static fm field_K;
    boolean field_T;
    static int field_M;
    static cn field_Q;
    static ob field_O;
    static byte[][] field_P;
    private int field_U;
    static boolean field_S;
    static String[] field_N;

    final void a(int param0, int param1, int param2, int param3) {
        if (((rf) this).field_U == -1) {
            return;
        }
        if (-257 <= ((rf) this).field_U) {
            if (!(param0 == 0)) {
                return;
            }
            ((rf) this).a(param3 + ((rf) this).field_v, param1 + ((rf) this).field_q, false);
            super.a(param0, param1, param2 ^ 0, param3);
            return;
        }
        if (np.field_F != null) {
            // if_icmpgt L92
            // if_icmplt L92
        } else {
            np.field_F = new cn(((rf) this).field_x, ((rf) this).field_s);
        }
        lm.a(np.field_F, (byte) -102);
        gf.a();
        ((rf) this).a(0, 0, false);
        super.a(param0, -param1 + -((rf) this).field_q, param2, -((rf) this).field_v + -param3);
        ti.c(true);
        np.field_F.d(param1 + ((rf) this).field_q, param3 + ((rf) this).field_v, ((rf) this).field_U);
    }

    final void b(int param0, int param1, int param2) {
        int var4 = -125 % ((param0 - 70) / 48);
        ((rf) this).b(0, param2, -param1 + vf.field_x >> 1848386273, -param2 + hn.field_t >> -1321271839, param1);
    }

    final static q[] a(int param0, byte param1, nh param2, int param3) {
        if (!kk.a(param2, 1, param3, param0)) {
            return null;
        }
        if (param1 != -71) {
            return null;
        }
        return vl.d(-89);
    }

    rf(ji param0, int param1, int param2) {
        super(hn.field_t - param1 >> 1971152417, -param2 + vf.field_x >> 1519541057, param1, param2, (ca) null);
        ((rf) this).field_R = param0;
        ((rf) this).field_U = 0;
        ((rf) this).field_T = false;
    }

    final static q a(int param0) {
        int var2 = 0;
        int var3 = DungeonAssault.field_K;
        if (param0 != 10) {
            return null;
        }
        q var4 = new q(14, 11, 2);
        q var1 = var4;
        var4.field_i[1] = 65793;
        for (var2 = 0; (var2 ^ -1) > -7; var2++) {
            og.a(var2 * 2 + 1, (byte) -75, 10 + -var2, var1, 5 - var2, (byte) 1);
        }
        for (var2 = 6; var2 < 11; var2++) {
            og.a(3, (byte) -78, -var2 + 10, var1, 4, (byte) 1);
        }
        return var1;
    }

    public static void b(boolean param0) {
        field_P = null;
        field_N = null;
        field_O = null;
        field_L = null;
        field_Q = null;
        field_K = null;
        if (param0) {
            field_K = null;
        }
    }

    boolean f(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int stackIn_13_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_12_0 = 0;
        L0: {
          var2 = this.j(78);
          if (param0 == -90) {
            break L0;
          } else {
            ((rf) this).field_R = null;
            break L0;
          }
        }
        L1: {
          var3 = -((rf) this).field_U + var2;
          if ((var3 ^ -1) < -1) {
            ((rf) this).field_U = ((rf) this).field_U + (8 + var3 - 1) / 8;
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          if (var3 < 0) {
            ((rf) this).field_U = ((rf) this).field_U + (-15 + var3) / 16;
            break L2;
          } else {
            break L2;
          }
        }
        L3: {
          L4: {
            if (0 != ((rf) this).field_U) {
              break L4;
            } else {
              if (-1 != (var2 ^ -1)) {
                break L4;
              } else {
                if (((rf) this).field_T) {
                  break L4;
                } else {
                  stackOut_11_0 = 1;
                  stackIn_13_0 = stackOut_11_0;
                  break L3;
                }
              }
            }
          }
          stackOut_12_0 = 0;
          stackIn_13_0 = stackOut_12_0;
          break L3;
        }
        return stackIn_13_0 != 0;
    }

    private final int j(int param0) {
        Object var3 = null;
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        L0: {
          if (param0 >= 61) {
            break L0;
          } else {
            var3 = null;
            q[] discarded$2 = rf.a(0, (byte) 10, (nh) null, -24);
            break L0;
          }
        }
        L1: {
          if (!((rf) this).field_T) {
            stackOut_6_0 = 0;
            stackIn_7_0 = stackOut_6_0;
            break L1;
          } else {
            if ((Object) (Object) ((rf) this).field_R.i(32) == this) {
              stackOut_5_0 = 256;
              stackIn_7_0 = stackOut_5_0;
              break L1;
            } else {
              stackOut_4_0 = 0;
              stackIn_7_0 = stackOut_4_0;
              break L1;
            }
          }
        }
        return stackIn_7_0;
    }

    boolean i(int param0) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0 == 462) {
            break L0;
          } else {
            q discarded$2 = rf.a(-12);
            break L0;
          }
        }
        L1: {
          L2: {
            ((rf) this).field_U = this.j(98);
            if (((rf) this).field_U != 0) {
              break L2;
            } else {
              if (((rf) this).field_T) {
                break L2;
              } else {
                stackOut_4_0 = 1;
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            }
          }
          stackOut_5_0 = 0;
          stackIn_6_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_6_0 != 0;
    }

    abstract void a(int param0, int param1, boolean param2);

    final lm g(int param0) {
        lm var2 = super.g(param0 ^ 0);
        if (!(var2 == null)) {
            return var2;
        }
        if (param0 != -20311) {
            boolean discarded$0 = ((rf) this).f((byte) 104);
        }
        return (lm) this;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_L = "Waiting for fonts";
        field_M = 2;
        field_N = new String[]{"Intimidate", "The frenzied, violent babbling of the <%0> does not make it easy for your raiders to sneak around a dungeon, but any monster they do encounter will have their <%attack> reduced by fear."};
    }
}
