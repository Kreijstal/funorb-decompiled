/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ka {
    static dm[][][] field_m;
    int field_k;
    int field_e;
    static float field_c;
    int field_d;
    static d field_i;
    static int field_h;
    int field_b;
    private int field_f;
    boolean field_g;
    boolean field_l;
    static long field_a;
    private int field_j;

    final static na[] a(String param0, String param1, boolean param2, rh param3) {
        if (!param2) {
            return null;
        }
        int var4 = param3.a((byte) 126, param0);
        int var5 = param3.a(param1, -89, var4);
        return sd.a(true, param3, var5, var4);
    }

    abstract void a(byte param0, int param1);

    void a(int param0, int param1) {
        int var4 = Geoblox.field_C;
        if (param1 >= -26) {
            ((ka) this).field_j = 8;
        }
        if (-97 == ki.field_d) {
            ((ka) this).a(param0, (byte) -7);
        } else {
            if (-98 != ki.field_d) {
                if (ki.field_d != 84) {
                    // if_icmpne L87
                }
                ((ka) this).b(param0, (byte) -2);
            } else {
                ((ka) this).a((byte) 90, param0);
            }
        }
    }

    void a(int param0, int param1, boolean param2, int param3, boolean param4, int param5) {
        int var8 = Geoblox.field_C;
        if (!param4) {
            if (1 != param5) {
                ((ka) this).a(param0, (byte) -121);
            } else {
                ((ka) this).b(param0, (byte) -2);
            }
            s.field_H = lj.field_a;
        } else {
            s.field_H = s.field_H - 1;
            if (s.field_H <= 0) {
                if (-2 == (param5 ^ -1)) {
                    ((ka) this).b(param0, (byte) -2);
                } else {
                    ((ka) this).a(param0, (byte) 6);
                }
                s.field_H = fj.field_o;
            }
        }
        if (param2) {
            ((ka) this).field_l = false;
        }
    }

    abstract void a(boolean param0, byte param1, int param2, int param3);

    public static void a(byte param0) {
        int var1 = -15 / ((param0 - 75) / 32);
        field_m = null;
        field_i = null;
    }

    int a(int param0, int param1, byte param2) {
        if (((ka) this).field_j <= param0) {
            // if_icmpge L27
            // if_icmpgt L27
        } else {
            return -1;
        }
        if (param2 < 20) {
            return 81;
        }
        int var4 = (param1 + -((ka) this).field_k) / ((ka) this).field_d;
        if (((ka) this).field_e <= var4) {
            return -1;
        }
        return var4;
    }

    abstract void b(int param0, byte param1);

    final void a(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        Object stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        int stackIn_15_2 = 0;
        Object stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        int stackIn_16_2 = 0;
        Object stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        int stackIn_17_2 = 0;
        int stackIn_17_3 = 0;
        Object stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        int stackOut_14_2 = 0;
        Object stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        int stackOut_16_2 = 0;
        int stackOut_16_3 = 0;
        Object stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        int stackOut_15_2 = 0;
        int stackOut_15_3 = 0;
        L0: {
          var3 = Geoblox.field_C;
          if (bi.field_g != 0) {
            var2 = ((ka) this).a(mc.field_a, he.field_d, (byte) 28);
            ((ka) this).field_b = var2;
            if (var2 != -1) {
              L1: {
                ((ka) this).field_g = true;
                stackOut_14_0 = this;
                stackOut_14_1 = var2;
                stackOut_14_2 = mc.field_a;
                stackIn_16_0 = stackOut_14_0;
                stackIn_16_1 = stackOut_14_1;
                stackIn_16_2 = stackOut_14_2;
                stackIn_15_0 = stackOut_14_0;
                stackIn_15_1 = stackOut_14_1;
                stackIn_15_2 = stackOut_14_2;
                if (param0) {
                  stackOut_16_0 = this;
                  stackOut_16_1 = stackIn_16_1;
                  stackOut_16_2 = stackIn_16_2;
                  stackOut_16_3 = 0;
                  stackIn_17_0 = stackOut_16_0;
                  stackIn_17_1 = stackOut_16_1;
                  stackIn_17_2 = stackOut_16_2;
                  stackIn_17_3 = stackOut_16_3;
                  break L1;
                } else {
                  stackOut_15_0 = this;
                  stackOut_15_1 = stackIn_15_1;
                  stackOut_15_2 = stackIn_15_2;
                  stackOut_15_3 = 1;
                  stackIn_17_0 = stackOut_15_0;
                  stackIn_17_1 = stackOut_15_1;
                  stackIn_17_2 = stackOut_15_2;
                  stackIn_17_3 = stackOut_15_3;
                  break L1;
                }
              }
              ((ka) this).a(stackIn_17_1, stackIn_17_2, stackIn_17_3 != 0, -(var2 * ((ka) this).field_d) + -((ka) this).field_k + he.field_d, false, bi.field_g);
              break L0;
            } else {
              ((ka) this).field_g = false;
              break L0;
            }
          } else {
            L2: {
              if (gf.field_a == 0) {
                break L2;
              } else {
                if (!((ka) this).field_g) {
                  break L2;
                } else {
                  var2 = ((ka) this).field_b;
                  if (var2 != -1) {
                    ((ka) this).a(var2, qa.field_a, false, -(((ka) this).field_d * var2) + (ue.field_e - ((ka) this).field_k), true, gf.field_a);
                    break L0;
                  } else {
                    break L0;
                  }
                }
              }
            }
            ((ka) this).field_g = false;
            if (!wb.field_a) {
              break L0;
            } else {
              var2 = ((ka) this).a(qa.field_a, ue.field_e, (byte) 126);
              if (var2 != -1) {
                ((ka) this).field_b = var2;
                ((ka) this).field_l = false;
                break L0;
              } else {
                if (((ka) this).field_l) {
                  break L0;
                } else {
                  ((ka) this).field_b = var2;
                  ((ka) this).field_l = false;
                  break L0;
                }
              }
            }
          }
        }
        L3: {
          if (param0) {
            break L3;
          } else {
            ((ka) this).field_j = 56;
            break L3;
          }
        }
    }

    ka(int param0, int param1, int param2, int param3, int param4) {
        ((ka) this).field_l = true;
        ((ka) this).field_b = 0;
        ((ka) this).field_j = param1;
        ((ka) this).field_d = param4;
        ((ka) this).field_f = param2;
        ((ka) this).field_e = param0;
        ((ka) this).field_k = param3;
    }

    abstract void a(int param0, byte param1);

    void a(int param0) {
        int var4 = Geoblox.field_C;
        int var2 = 0;
        if (param0 != -28750) {
            ((ka) this).a(false);
        }
        int var3 = ((ka) this).field_k;
        while (var2 < ((ka) this).field_e) {
            ((ka) this).a(((ka) this).field_b == var2 ? true : false, (byte) -112, var2, var3);
            var3 = var3 + ((ka) this).field_d;
            var2++;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = new dm[7][7][4];
        field_h = 0;
        field_a = 0L;
    }
}
