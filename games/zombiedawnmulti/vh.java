/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vh extends cj {
    static String field_Nb;
    static boolean field_Mb;
    int field_Ob;
    static ej field_Gb;
    private int field_Jb;
    static String field_Fb;
    static boolean field_Hb;
    static ri field_Lb;
    static String[] field_Ib;
    private ja field_Kb;

    final void j(int param0) {
        int var2 = 0;
        int var3 = 0;
        L0: {
          var2 = bd.field_g - ((vh) this).field_x;
          var3 = -((vh) this).field_Q + bo.field_d;
          if ((param0 & jf.field_e) != 0) {
            if (var3 > -1) {
              break L0;
            } else {
              if (var3 < ((vh) this).field_z) {
                if (-1 > var2) {
                  if (4 + ((vh) this).field_zb > var2) {
                    break L0;
                  } else {
                    if (((vh) this).field_zb + 12 <= var2) {
                      break L0;
                    } else {
                      ((vh) this).field_Jb = -(185 * var3 / ((vh) this).field_z) + 255;
                      this.a(((vh) this).field_Kb, 12);
                      break L0;
                    }
                  }
                } else {
                  if (4 + ((vh) this).field_zb > var2) {
                    break L0;
                  } else {
                    if (((vh) this).field_zb + 12 <= var2) {
                      break L0;
                    } else {
                      ((vh) this).field_Jb = -(185 * var3 / ((vh) this).field_z) + 255;
                      this.a(((vh) this).field_Kb, 12);
                      break L0;
                    }
                  }
                }
              } else {
                break L0;
              }
            }
          } else {
            break L0;
          }
        }
    }

    final static int a(boolean param0, int param1, String param2) {
        if (param1 >= -24) {
            field_Hb = false;
        }
        if (param0) {
            return wn.field_u.a(param2);
        }
        return e.field_c.a(param2);
    }

    vh(long param0, cj param1, int param2, int param3, int param4, int param5) {
        super(param0, param1, param2, param3, param4, param5, (String) null);
        ((vh) this).field_Jb = 190;
        ((vh) this).field_Kb = new ja(param4, param5);
        this.a(((vh) this).field_Kb, 12);
    }

    final static boolean a(char param0, byte param1) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param1 == 85) {
            break L0;
          } else {
            field_Mb = true;
            break L0;
          }
        }
        L1: {
          L2: {
            if (param0 < 48) {
              break L2;
            } else {
              if (57 < param0) {
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

    final void i(int param0) {
        ((vh) this).field_Kb.c(((vh) this).field_x, ((vh) this).field_Q);
        oo.a(4 + ((vh) this).field_zb + ((vh) this).field_x, ((vh) this).field_Q, 8, ((vh) this).field_z, 16777215, 4671303);
        int var4 = 18 / ((param0 - 16) / 42);
        int var2 = -((vh) this).field_x + bd.field_g;
        int var3 = bo.field_d - ((vh) this).field_Q;
        if (-1 != (jf.field_e & 1)) {
            if (var3 >= 0) {
                if (!(((vh) this).field_z <= var3)) {
                    if (-1 <= var2) {
                        if (var2 < ((vh) this).field_zb) {
                            oo.c(bd.field_g, bo.field_d, 2, 0);
                        }
                    }
                }
            }
        }
    }

    private final void a(ja param0, int param1) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = ZombieDawnMulti.field_E ? 1 : 0;
        int var3 = 0;
        if (param1 != 12) {
            vh.c((byte) 47);
        }
        while (param0.field_w > var3) {
            for (var4 = 0; var4 < param0.field_x; var4++) {
                var5 = var4 * 256 / param0.field_x;
                var6 = -(var3 * 256 / param0.field_w) + 255;
                param0.field_B[var3 * param0.field_x + var4] = gi.a(var6, ((vh) this).field_Jb, var5, (byte) -115);
            }
            var3++;
        }
    }

    public static void c(byte param0) {
        if (param0 >= -97) {
            return;
        }
        field_Ib = null;
        field_Lb = null;
        field_Fb = null;
        field_Gb = null;
        field_Nb = null;
    }

    final static void a(int param0, int[] param1, Object[] param2) {
        if (param0 != -7255) {
            Object var4 = null;
            vh.a(((int[]) param2[10])[0], (int[]) null, (Object[]) null);
        }
        qf.a(param2, 0, 2, param1.length + -1, param1);
    }

    final static int h(int param0) {
        if (param0 <= 10) {
            return -120;
        }
        return lq.field_d;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Mb = false;
        field_Nb = "Status";
        field_Hb = false;
        field_Ib = new String[]{"Connection lost - attempting to reconnect", "Connection lost - attempting to reconnect.", "Connection lost - attempting to reconnect..", "Connection lost - attempting to reconnect..."};
    }
}
