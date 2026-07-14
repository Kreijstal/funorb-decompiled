/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qd {
    private rn field_j;
    static String[] field_h;
    private java.math.BigInteger field_c;
    private no field_i;
    static int field_k;
    private java.math.BigInteger field_l;
    private ge field_a;
    static int field_g;
    private sp field_d;
    static String field_e;
    private up[] field_f;
    static of field_b;

    final static boolean a(int param0, char param1) {
        int stackIn_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        if (param0 == 0) {
          L0: {
            L1: {
              if (param1 == 160) {
                break L1;
              } else {
                if (param1 == 32) {
                  break L1;
                } else {
                  if (param1 == 95) {
                    break L1;
                  } else {
                    if (param1 != 45) {
                      stackOut_8_0 = 0;
                      stackIn_9_0 = stackOut_8_0;
                      break L0;
                    } else {
                      break L1;
                    }
                  }
                }
              }
            }
            stackOut_7_0 = 1;
            stackIn_9_0 = stackOut_7_0;
            break L0;
          }
          return stackIn_9_0 != 0;
        } else {
          return false;
        }
    }

    final up a(boolean param0, np param1, int param2, byte param3, np param4) {
        if (!(((qd) this).field_a != null)) {
            throw new RuntimeException();
        }
        if ((param2 ^ -1) <= -1) {
            // if_icmple L37
        } else {
            throw new RuntimeException();
        }
        if (!(((qd) this).field_f[param2] == null)) {
            return ((qd) this).field_f[param2];
        }
        ((qd) this).field_a.field_v = 6 + param2 * 72;
        int var6 = ((qd) this).field_a.b(true);
        int var7 = ((qd) this).field_a.b(true);
        byte[] var11 = new byte[64];
        ((qd) this).field_a.a(0, (byte) -115, var11, 64);
        up var9 = new up(param2, param1, param4, ((qd) this).field_i, ((qd) this).field_j, var6, var11, var7, param0);
        ((qd) this).field_f[param2] = var9;
        if (param3 != 0) {
            ((qd) this).field_j = null;
        }
        return var9;
    }

    final void b(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var3 = Pool.field_O;
        if (((qd) this).field_f == null) {
          return;
        } else {
          var2 = 0;
          L0: while (true) {
            if (((qd) this).field_f.length <= var2) {
              if (param0 == -46) {
                var4 = 0;
                var2 = var4;
                L1: while (true) {
                  if (var4 >= ((qd) this).field_f.length) {
                    return;
                  } else {
                    if (null != ((qd) this).field_f[var4]) {
                      ((qd) this).field_f[var4].c((byte) 7);
                      var4++;
                      continue L1;
                    } else {
                      var4++;
                      continue L1;
                    }
                  }
                }
              } else {
                return;
              }
            } else {
              if (((qd) this).field_f[var2] != null) {
                ((qd) this).field_f[var2].c(param0 ^ -67);
                var2++;
                continue L0;
              } else {
                var2++;
                continue L0;
              }
            }
          }
        }
    }

    public static void a(byte param0) {
        field_b = null;
        field_h = null;
        int var1 = 127 % ((param0 - 15) / 58);
        field_e = null;
    }

    qd(no param0, rn param1) {
        this(param0, param1, (java.math.BigInteger) null, (java.math.BigInteger) null);
    }

    final boolean a(boolean param0) {
        int var3 = 0;
        byte[] var4 = null;
        byte[] var5 = null;
        java.math.BigInteger var7_ref = null;
        int var7 = 0;
        int var8 = 0;
        ge var10 = null;
        byte[] var11 = null;
        java.math.BigInteger var12 = null;
        byte[] var13 = null;
        byte[] var14 = null;
        byte[] var16 = null;
        byte[] var17 = null;
        ge stackIn_12_0 = null;
        ge stackIn_12_1 = null;
        sp stackIn_12_2 = null;
        ge stackIn_13_0 = null;
        ge stackIn_13_1 = null;
        sp stackIn_13_2 = null;
        ge stackIn_14_0 = null;
        ge stackIn_14_1 = null;
        sp stackIn_14_2 = null;
        int stackIn_14_3 = 0;
        ge stackOut_11_0 = null;
        ge stackOut_11_1 = null;
        sp stackOut_11_2 = null;
        ge stackOut_13_0 = null;
        ge stackOut_13_1 = null;
        sp stackOut_13_2 = null;
        int stackOut_13_3 = 0;
        ge stackOut_12_0 = null;
        ge stackOut_12_1 = null;
        sp stackOut_12_2 = null;
        int stackOut_12_3 = 0;
        L0: {
          var8 = Pool.field_O;
          if (param0) {
            break L0;
          } else {
            qd.a((byte) 17, -69);
            break L0;
          }
        }
        if (null != ((qd) this).field_a) {
          return true;
        } else {
          L1: {
            if (null != ((qd) this).field_d) {
              break L1;
            } else {
              if (!((qd) this).field_i.b((byte) -125)) {
                ((qd) this).field_d = ((qd) this).field_i.a(255, 255, (byte) 0, true, -154018400);
                break L1;
              } else {
                return false;
              }
            }
          }
          if (!((qd) this).field_d.field_F) {
            L2: {
              stackOut_11_0 = null;
              stackOut_11_1 = null;
              stackOut_11_2 = ((qd) this).field_d;
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              if (param0) {
                stackOut_13_0 = null;
                stackOut_13_1 = null;
                stackOut_13_2 = (sp) (Object) stackIn_13_2;
                stackOut_13_3 = 0;
                stackIn_14_0 = stackOut_13_0;
                stackIn_14_1 = stackOut_13_1;
                stackIn_14_2 = stackOut_13_2;
                stackIn_14_3 = stackOut_13_3;
                break L2;
              } else {
                stackOut_12_0 = null;
                stackOut_12_1 = null;
                stackOut_12_2 = (sp) (Object) stackIn_12_2;
                stackOut_12_3 = 1;
                stackIn_14_0 = stackOut_12_0;
                stackIn_14_1 = stackOut_12_1;
                stackIn_14_2 = stackOut_12_2;
                stackIn_14_3 = stackOut_12_3;
                break L2;
              }
            }
            L3: {
              L4: {
                new ge(((sp) (Object) stackIn_14_2).b(stackIn_14_3 != 0));
                var10 = stackIn_14_0;
                var10.field_v = 5;
                var3 = var10.g(-62);
                var10.field_v = var10.field_v + var3 * 72;
                var16 = new byte[-var10.field_v + var10.field_t.length];
                var14 = var16;
                var13 = var14;
                var11 = var13;
                var4 = var11;
                var10.a(0, (byte) -125, var4, var16.length);
                if (((qd) this).field_c == null) {
                  break L4;
                } else {
                  if (null != ((qd) this).field_l) {
                    var12 = new java.math.BigInteger(var16);
                    var7_ref = var12.modPow(((qd) this).field_c, ((qd) this).field_l);
                    var5 = var7_ref.toByteArray();
                    break L3;
                  } else {
                    break L4;
                  }
                }
              }
              var5 = var4;
              break L3;
            }
            if (65 != var5.length) {
              throw new RuntimeException();
            } else {
              var17 = jr.a(var10.field_v + (-var16.length + -5), (byte) -121, var10.field_t, 5);
              var7 = 0;
              L5: while (true) {
                if (-65 >= (var7 ^ -1)) {
                  ((qd) this).field_f = new up[var3];
                  ((qd) this).field_a = var10;
                  return true;
                } else {
                  if (var17[var7] == var5[var7 + 1]) {
                    var7++;
                    continue L5;
                  } else {
                    throw new RuntimeException();
                  }
                }
              }
            }
          } else {
            return false;
          }
        }
    }

    final static void a(byte param0, int param1) {
        oq var2 = ej.field_j;
        var2.b(false, param1);
        int var3 = -32 / ((param0 - 16) / 57);
        var2.field_v = var2.field_v + 1;
        int var4 = var2.field_v;
        var2.a(2, false);
        var2.a(md.field_c, (byte) 0, 0, md.field_c.length);
        var2.a(pm.field_l, false);
        var2.a(mc.field_l, false);
        var2.a(ka.field_s, (byte) 0, 0, ka.field_s.length);
        var2.b(var2.field_v + -var4, true);
    }

    private qd(no param0, rn param1, java.math.BigInteger param2, java.math.BigInteger param3) {
        ((qd) this).field_c = param2;
        ((qd) this).field_j = param1;
        ((qd) this).field_i = param0;
        ((qd) this).field_l = param3;
        if (!((qd) this).field_i.b((byte) -125)) {
            ((qd) this).field_d = ((qd) this).field_i.a(255, 255, (byte) 0, true, -154018400);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "Quit";
        field_g = 0;
        field_k = -1;
        field_h = new String[]{null, "Or click", "Or click", "Or click", "Or click", "Or click", "Or click", "Or click"};
    }
}
