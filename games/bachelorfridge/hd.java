/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hd extends oha {
    private int field_p;
    static int field_m;
    private int field_o;
    private int field_n;
    static String field_r;
    int field_q;

    final boolean e(int param0) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0 == -2) {
            break L0;
          } else {
            ((hd) this).field_p = -128;
            break L0;
          }
        }
        L1: {
          L2: {
            if (-2 < (((hd) this).field_n ^ -1)) {
              break L2;
            } else {
              if (0 > ((hd) this).field_p) {
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

    hd(int param0, int param1, int param2, String param3, String param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11) {
        super(4, param0, param1, param2, 0, param11);
        ((hd) this).field_p = param8;
        ((hd) this).field_f = param3;
        ((hd) this).field_o = param6;
        ((hd) this).field_q = param5;
        ((hd) this).field_k = param4;
        ((hd) this).field_n = param9;
    }

    final int c(int param0) {
        L0: {
          if (param0 == 0) {
            break L0;
          } else {
            field_r = null;
            break L0;
          }
        }
        if (-18 != (((hd) this).field_o ^ -1)) {
          L1: {
            if (((hd) this).field_p != 0) {
              break L1;
            } else {
              if (((hd) this).field_n != 0) {
                break L1;
              } else {
                return 1;
              }
            }
          }
          L2: {
            if ((((hd) this).field_p ^ -1) != -2) {
              break L2;
            } else {
              if (1 == ((hd) this).field_n) {
                return 2;
              } else {
                break L2;
              }
            }
          }
          if (!this.c((byte) -96)) {
            throw new IllegalStateException("This special doesn't have a defined range. Fix it.");
          } else {
            return 0;
          }
        } else {
          return 3;
        }
    }

    final static byte[] a(byte[] param0, pf param1, byte param2, int param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = BachelorFridge.field_y;
        var4 = param1.d(param3, (byte) -108);
        if (0 != var4) {
          L0: {
            L1: {
              if (param0 == null) {
                break L1;
              } else {
                if (var4 != param0.length) {
                  break L1;
                } else {
                  break L0;
                }
              }
            }
            param0 = new byte[var4];
            break L0;
          }
          var5 = param1.d(3, (byte) 87);
          var6 = (byte)param1.d(8, (byte) -117);
          if (param2 > 89) {
            L2: {
              if (0 < var5) {
                var7 = 0;
                L3: while (true) {
                  if (var7 >= var4) {
                    break L2;
                  } else {
                    param0[var7] = (byte)(param1.d(var5, (byte) 48) + var6);
                    var7++;
                    continue L3;
                  }
                }
              } else {
                var7 = 0;
                L4: while (true) {
                  if (var4 <= var7) {
                    break L2;
                  } else {
                    param0[var7] = (byte)var6;
                    var7++;
                    continue L4;
                  }
                }
              }
            }
            return param0;
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    public static void d(int param0) {
        field_r = null;
        if (param0 != 1) {
            field_m = 97;
        }
    }

    private final boolean c(byte param0) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0 == -96) {
            break L0;
          } else {
            field_r = null;
            break L0;
          }
        }
        L1: {
          L2: {
            if (((hd) this).field_p != 0) {
              break L2;
            } else {
              if (((hd) this).field_n != 7) {
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

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_r = "Play free version";
        field_m = -1;
    }
}
