/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class sg extends ta {
    boolean field_A;
    static int field_B;
    static String field_E;
    private sk field_C;
    static String field_F;
    private int field_D;

    private final int e(boolean param0) {
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        L0: {
          if (!param0) {
            break L0;
          } else {
            ((sg) this).field_A = false;
            break L0;
          }
        }
        L1: {
          if (!((sg) this).field_A) {
            stackOut_6_0 = 0;
            stackIn_7_0 = stackOut_6_0;
            break L1;
          } else {
            if (this == (Object) (Object) ((sg) this).field_C.k(3469)) {
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

    final void a(int param0, byte param1, int param2) {
        ((sg) this).a(ed.field_a + -param2 >> -637529087, lh.field_d + -param0 >> 909497057, param0, (byte) -90, param2);
        if (param1 != -81) {
            field_E = null;
        }
    }

    boolean l(int param0) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0 == 194) {
            break L0;
          } else {
            int discarded$2 = this.e(true);
            break L0;
          }
        }
        L1: {
          L2: {
            ((sg) this).field_D = this.e(false);
            if (((sg) this).field_D != 0) {
              break L2;
            } else {
              if (((sg) this).field_A) {
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

    boolean d(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        int stackIn_9_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_8_0 = 0;
        L0: {
          var2 = this.e(param0);
          var3 = var2 + -((sg) this).field_D;
          if (var3 <= 0) {
            break L0;
          } else {
            ((sg) this).field_D = ((sg) this).field_D + (var3 - -8 + -1) / 8;
            break L0;
          }
        }
        L1: {
          if ((var3 ^ -1) <= -1) {
            break L1;
          } else {
            ((sg) this).field_D = ((sg) this).field_D + (-16 + (var3 - -1)) / 16;
            break L1;
          }
        }
        L2: {
          L3: {
            if (0 != ((sg) this).field_D) {
              break L3;
            } else {
              if (0 != var2) {
                break L3;
              } else {
                if (((sg) this).field_A) {
                  break L3;
                } else {
                  stackOut_7_0 = 1;
                  stackIn_9_0 = stackOut_7_0;
                  break L2;
                }
              }
            }
          }
          stackOut_8_0 = 0;
          stackIn_9_0 = stackOut_8_0;
          break L2;
        }
        return stackIn_9_0 != 0;
    }

    final static void k(int param0) {
        if (param0 != -16) {
            field_E = null;
        }
        ed.a((String) null, param0 + 16, "");
    }

    final void a(int param0, int param1, int param2, int param3) {
        if (((sg) this).field_D == 0) {
          return;
        } else {
          if (((sg) this).field_D < 256) {
            L0: {
              L1: {
                if (me.field_f == null) {
                  break L1;
                } else {
                  if (((sg) this).field_m > me.field_f.field_o) {
                    break L1;
                  } else {
                    if (me.field_f.field_k < ((sg) this).field_r) {
                      break L1;
                    } else {
                      break L0;
                    }
                  }
                }
              }
              me.field_f = new hj(((sg) this).field_m, ((sg) this).field_r);
              break L0;
            }
            de.a(param2 ^ -1048454, me.field_f);
            ul.d();
            ((sg) this).a(0, 0, -9111);
            super.a(-param0 - ((sg) this).field_n, param1, param2, -((sg) this).field_s + -param3);
            oc.g((byte) -105);
            me.field_f.a(param3 + ((sg) this).field_s, param0 - -((sg) this).field_n, ((sg) this).field_D);
            return;
          } else {
            if (param1 == 0) {
              ((sg) this).a(param3 - -((sg) this).field_s, param0 + ((sg) this).field_n, -9111);
              super.a(param0, param1, param2 + 0, param3);
              return;
            } else {
              return;
            }
          }
        }
    }

    sg(sk param0, int param1, int param2) {
        super(ed.field_a + -param1 >> -894401855, -param2 + lh.field_d >> 1855598017, param1, param2, (td) null);
        ((sg) this).field_C = param0;
        ((sg) this).field_A = false;
        ((sg) this).field_D = 0;
    }

    abstract void a(int param0, int param1, int param2);

    final static boolean c(boolean param0) {
        int stackIn_7_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_6_0 = 0;
        if (param0) {
          L0: {
            L1: {
              if (hi.field_k < 10) {
                break L1;
              } else {
                if (d.field_k) {
                  break L1;
                } else {
                  if (p.a(23236)) {
                    break L1;
                  } else {
                    stackOut_5_0 = 1;
                    stackIn_7_0 = stackOut_5_0;
                    break L0;
                  }
                }
              }
            }
            stackOut_6_0 = 0;
            stackIn_7_0 = stackOut_6_0;
            break L0;
          }
          return stackIn_7_0 != 0;
        } else {
          return true;
        }
    }

    final static e a(int param0, String param1) {
        int var5 = 0;
        String var6 = null;
        e var7 = null;
        int var8 = OrbDefence.field_D ? 1 : 0;
        int var2 = param1.length();
        if (!(var2 != 0)) {
            return oc.field_M;
        }
        if (!((var2 ^ -1) >= -256)) {
            return vj.field_c;
        }
        if (param0 != -1326) {
            field_B = -11;
        }
        String[] var3 = g.a(-121, '.', param1);
        if (var3.length < 2) {
            return oc.field_M;
        }
        String[] var4 = var3;
        for (var5 = 0; var5 < var4.length; var5++) {
            var6 = var4[var5];
            var7 = eg.b(0, var6);
            if (var7 != null) {
                return var7;
            }
        }
        return dh.a(var3[-1 + var3.length], (byte) 118);
    }

    final pj b(byte param0) {
        pj var2 = super.b(param0);
        if (!(var2 == null)) {
            return var2;
        }
        return (pj) this;
    }

    public static void a(byte param0) {
        field_F = null;
        field_E = null;
        int var1 = 30 / ((param0 - -17) / 47);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_F = "Passwords must be between 5 and 20 characters long";
    }
}
