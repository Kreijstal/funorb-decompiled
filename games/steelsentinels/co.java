/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class co {
    static wk[] field_d;
    private cm field_e;
    private cm field_b;
    static gh field_c;
    static long field_f;
    private nc field_a;

    final static boolean a(boolean param0) {
        int stackIn_6_0 = 0;
        int stackIn_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_4_0 = 0;
        if (!param0) {
          if (!ln.field_h) {
            if (ni.b(56)) {
              return true;
            } else {
              return false;
            }
          } else {
            if (!df.field_I) {
              L0: {
                if (!ni.b(56)) {
                  stackOut_9_0 = 0;
                  stackIn_10_0 = stackOut_9_0;
                  break L0;
                } else {
                  stackOut_8_0 = 1;
                  stackIn_10_0 = stackOut_8_0;
                  break L0;
                }
              }
              return stackIn_10_0 != 0;
            } else {
              stackOut_4_0 = 1;
              stackIn_6_0 = stackOut_4_0;
              return stackIn_6_0 != 0;
            }
          }
        } else {
          return false;
        }
    }

    public static void a(byte param0) {
        field_c = null;
        field_d = null;
        if (param0 != -13) {
            field_f = -49L;
        }
    }

    final mn a(byte param0, int param1) {
        mn var3 = null;
        mn var3_ref = null;
        byte[] var4 = null;
        var3 = (mn) ((co) this).field_a.a((long)param1, -100);
        if (var3 != null) {
          return var3;
        } else {
          L0: {
            if (-32769 >= (param1 ^ -1)) {
              var4 = ((co) this).field_e.a(0, (byte) 126, param1 & 32767);
              break L0;
            } else {
              var4 = ((co) this).field_b.a(0, (byte) 40, param1);
              break L0;
            }
          }
          if (param0 != -13) {
            return null;
          } else {
            L1: {
              var3_ref = new mn();
              if (var4 != null) {
                var3_ref.a(106, new gi(var4));
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (param1 >= 32768) {
                var3_ref.c((byte) -3);
                break L2;
              } else {
                break L2;
              }
            }
            ((co) this).field_a.a((long)param1, (Object) (Object) var3_ref, 1);
            return var3_ref;
          }
        }
    }

    final static byte[] a(byte param0, int param1, int param2, byte[] param3) {
        byte[] var4 = null;
        int var5 = 0;
        byte[] var6 = null;
        int var7 = 0;
        byte[] var8 = null;
        ig var9 = null;
        byte[] var10 = null;
        ig var11 = null;
        byte[] var12 = null;
        byte[] var13 = null;
        byte[] var14 = null;
        var7 = SteelSentinels.field_G;
        if (param0 != -37) {
          L0: {
            co.a((byte) -53);
            if (param2 <= 0) {
              var4 = param3;
              break L0;
            } else {
              var8 = new byte[param1];
              var4 = var8;
              var5 = 0;
              L1: while (true) {
                if (param1 <= var5) {
                  break L0;
                } else {
                  var8[var5] = param3[param2 + var5];
                  var5++;
                  continue L1;
                }
              }
            }
          }
          var9 = new ig();
          var9.a(-635160440);
          var9.a((byte) 90, (long)(8 * param1), var4);
          var13 = new byte[64];
          var10 = var13;
          var6 = var10;
          var9.a(var13, true, 0);
          return var6;
        } else {
          L2: {
            if (param2 <= 0) {
              var4 = param3;
              break L2;
            } else {
              var8 = new byte[param1];
              var4 = var8;
              var5 = 0;
              L3: while (true) {
                if (param1 <= var5) {
                  break L2;
                } else {
                  var8[var5] = param3[param2 + var5];
                  var5++;
                  continue L3;
                }
              }
            }
          }
          var11 = new ig();
          var11.a(-635160440);
          var11.a((byte) 90, (long)(8 * param1), var4);
          var14 = new byte[64];
          var12 = var14;
          var6 = var12;
          var11.a(var14, true, 0);
          return var6;
        }
    }

    co(int param0, cm param1, cm param2) {
        ((co) this).field_a = new nc(64);
        ((co) this).field_b = param1;
        ((co) this).field_e = param2;
        if (((co) this).field_b != null) {
            int discarded$0 = ((co) this).field_b.a(true, 0);
        }
        if (null != ((co) this).field_e) {
            int discarded$1 = ((co) this).field_e.a(true, 0);
        }
    }

    static {
    }
}
