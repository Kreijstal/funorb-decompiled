/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class qf extends uc implements si {
    static int field_e;
    static lh field_i;
    static int field_h;
    static int field_g;
    private fe field_f;

    abstract String a(String param0, boolean param1);

    final static o a(int param0, int param1) {
        o[] var2 = null;
        int var3 = 0;
        int var4 = 0;
        o[] var5 = null;
        var4 = StarCannon.field_A;
        var5 = a.b(-23508);
        var2 = var5;
        var3 = param1;
        L0: while (true) {
          if (var3 < var5.length) {
            if (var5[var3].field_d != param0) {
              var3++;
              continue L0;
            } else {
              return var5[var3];
            }
          } else {
            return null;
          }
        }
    }

    public final void a(int param0, fe param1) {
        ((qf) this).a((byte) 106);
        if (param0 != -4312) {
            field_i = null;
        }
    }

    final String b(int param0) {
        if (param0 > -127) {
            return null;
        }
        return ((qf) this).a(((qf) this).field_f.field_k, false);
    }

    public final void a(boolean param0, fe param1) {
        if (param0) {
            field_e = 58;
        }
    }

    abstract p a(String param0, int param1);

    public final boolean a(boolean param0) {
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0) {
            break L0;
          } else {
            field_h = 105;
            break L0;
          }
        }
        L1: {
          L2: {
            if (((qf) this).field_f.field_k == null) {
              break L2;
            } else {
              if (((qf) this).field_f.field_k.length() != 0) {
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

    public static void d(byte param0) {
        if (param0 <= 87) {
            o discarded$0 = qf.a(94, -47);
        }
        field_i = null;
    }

    final p c(int param0) {
        if (param0 != 4096) {
            return null;
        }
        return ((qf) this).a(((qf) this).field_f.field_k, -26188);
    }

    final static int a(int param0, byte param1) {
        if (param1 >= -13) {
            return -31;
        }
        param0 = param0 & 8191;
        if (param0 >= 4096) {
            return param0 < 6144 ? -bd.field_c[param0 - 4096] : -bd.field_c[-param0 + 8192];
        }
        return param0 < 2048 ? bd.field_c[param0] : bd.field_c[4096 - param0];
    }

    qf(fe param0) {
        ((qf) this).field_f = param0;
    }

    static {
    }
}
