/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ta {
    private fi[] field_j;
    static int field_l;
    private gi field_a;
    private cb field_m;
    private java.math.BigInteger field_k;
    static wk field_e;
    private qa field_h;
    private java.math.BigInteger field_b;
    static gh field_i;
    private vk field_g;
    static cm field_d;
    static String[] field_f;
    static wk[] field_c;

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        int var11 = 0;
        int var9 = 0;
        int var10 = 0;
        int var12 = SteelSentinels.field_G;
        if (param2 != 0) {
            field_e = null;
        }
        for (var11 = param7; var11 < param8 + param7; var11++) {
            var9 = (param1 + -param4) * (-param7 + var11) / param8 + param4;
            var10 = param3 + (-param7 + var11) * (-param3 + param5) / param8;
            pb.c(param6, var11, param0, var9, var10);
        }
    }

    final static boolean a(int param0) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0 < -44) {
            break L0;
          } else {
            ta.a((byte) 65);
            break L0;
          }
        }
        L1: {
          L2: {
            if (null == kc.field_y) {
              break L2;
            } else {
              if (!kc.field_y.d((byte) 76)) {
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

    final boolean b(int param0) {
        int var3 = 0;
        byte[] var4 = null;
        byte[] var5 = null;
        java.math.BigInteger var7_ref = null;
        int var7 = 0;
        int var8 = 0;
        gi var10 = null;
        byte[] var11 = null;
        java.math.BigInteger var12 = null;
        byte[] var13 = null;
        byte[] var14 = null;
        byte[] var16 = null;
        byte[] var17 = null;
        var8 = SteelSentinels.field_G;
        if (((ta) this).field_a != null) {
          return true;
        } else {
          L0: {
            if (null == ((ta) this).field_h) {
              if (((ta) this).field_g.c(105)) {
                return false;
              } else {
                ((ta) this).field_h = ((ta) this).field_g.a((byte) 0, 255, 255, true, (byte) 112);
                break L0;
              }
            } else {
              break L0;
            }
          }
          if (((ta) this).field_h.field_z) {
            return false;
          } else {
            var10 = new gi(((ta) this).field_h.d((byte) -65));
            var10.field_p = 5;
            var3 = var10.f((byte) -103);
            var10.field_p = var10.field_p + var3 * 72;
            var16 = new byte[-var10.field_p + var10.field_t.length];
            var14 = var16;
            var13 = var14;
            var11 = var13;
            var4 = var11;
            var10.a(0, var4, 28, var16.length);
            if (param0 == 64) {
              L1: {
                L2: {
                  if (null == ((ta) this).field_b) {
                    break L2;
                  } else {
                    if (((ta) this).field_k != null) {
                      var12 = new java.math.BigInteger(var16);
                      var7_ref = var12.modPow(((ta) this).field_b, ((ta) this).field_k);
                      var5 = var7_ref.toByteArray();
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                var5 = var4;
                break L1;
              }
              if ((var5.length ^ -1) == -66) {
                var17 = co.a((byte) -37, -5 + var10.field_p - var16.length, 5, var10.field_t);
                var7 = 0;
                L3: while (true) {
                  if (-65 >= (var7 ^ -1)) {
                    ((ta) this).field_j = new fi[var3];
                    ((ta) this).field_a = var10;
                    return true;
                  } else {
                    if (var5[1 + var7] == var17[var7]) {
                      var7++;
                      continue L3;
                    } else {
                      throw new RuntimeException();
                    }
                  }
                }
              } else {
                throw new RuntimeException();
              }
            } else {
              return false;
            }
          }
        }
    }

    final fi a(rc param0, byte param1, boolean param2, rc param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        fi var9 = null;
        Object var10 = null;
        byte[] var14 = null;
        if (null == ((ta) this).field_a) {
          throw new RuntimeException();
        } else {
          L0: {
            if ((param4 ^ -1) > -1) {
              break L0;
            } else {
              if (((ta) this).field_j.length > param4) {
                if (null != ((ta) this).field_j[param4]) {
                  return ((ta) this).field_j[param4];
                } else {
                  L1: {
                    ((ta) this).field_a.field_p = 6 + param4 * 72;
                    if (param1 > 91) {
                      break L1;
                    } else {
                      var10 = null;
                      fi discarded$2 = ((ta) this).a((rc) null, (byte) 104, true, (rc) null, 114);
                      break L1;
                    }
                  }
                  var6 = ((ta) this).field_a.i(0);
                  var7 = ((ta) this).field_a.i(0);
                  var14 = new byte[64];
                  ((ta) this).field_a.a(0, var14, 28, 64);
                  var9 = new fi(param4, param3, param0, ((ta) this).field_g, ((ta) this).field_m, var6, var14, var7, param2);
                  ((ta) this).field_j[param4] = var9;
                  return var9;
                }
              } else {
                break L0;
              }
            }
          }
          throw new RuntimeException();
        }
    }

    public static void a(byte param0) {
        field_i = null;
        field_d = null;
        field_e = null;
        field_c = null;
        if (param0 != -35) {
            return;
        }
        field_f = null;
    }

    final void a(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var3 = SteelSentinels.field_G;
        if (null != ((ta) this).field_j) {
          if (!param0) {
            var2 = 0;
            L0: while (true) {
              if (var2 >= ((ta) this).field_j.length) {
                var4 = 0;
                var2 = var4;
                L1: while (true) {
                  if (((ta) this).field_j.length <= var4) {
                    return;
                  } else {
                    if (((ta) this).field_j[var4] != null) {
                      ((ta) this).field_j[var4].c((byte) -97);
                      var4++;
                      continue L1;
                    } else {
                      var4++;
                      continue L1;
                    }
                  }
                }
              } else {
                if (((ta) this).field_j[var2] != null) {
                  ((ta) this).field_j[var2].d(-119);
                  var2++;
                  continue L0;
                } else {
                  var2++;
                  continue L0;
                }
              }
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    private ta(vk param0, cb param1, java.math.BigInteger param2, java.math.BigInteger param3) {
        ((ta) this).field_m = param1;
        ((ta) this).field_b = param2;
        ((ta) this).field_g = param0;
        ((ta) this).field_k = param3;
        if (!((ta) this).field_g.c(15)) {
            ((ta) this).field_h = ((ta) this).field_g.a((byte) 0, 255, 255, true, (byte) 72);
        }
    }

    ta(vk param0, cb param1) {
        this(param0, param1, (java.math.BigInteger) null, (java.math.BigInteger) null);
    }

    static {
    }
}
