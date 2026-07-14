/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ig extends dk {
    static jd field_q;
    private nj[] field_s;
    static int field_v;
    static float[] field_u;
    private nj field_r;
    static kg field_t;

    final void a(hj[] param0, int param1, int param2) {
        int var4 = param2;
        if (!(((ig) this).field_s[var4] != null)) {
            ((ig) this).field_s[var4] = new nj();
        }
        ((ig) this).field_s[param2].field_j = param0;
        if (param1 != 6821) {
            ((ig) this).field_r = null;
        }
    }

    public final void a(boolean param0, int param1, int param2, n param3, int param4) {
        nj var7 = null;
        nj var9 = null;
        rm var10 = null;
        nj var11 = null;
        nj var12 = null;
        nj var13 = null;
        nj var14 = null;
        n stackIn_3_0 = null;
        Object stackOut_2_0 = null;
        n stackOut_1_0 = null;
        L0: {
          if (!(param3 instanceof rm)) {
            stackOut_2_0 = null;
            stackIn_3_0 = (n) (Object) stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = (n) param3;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var10 = (rm) (Object) stackIn_3_0;
          td.a(param3.field_x + (param3.field_k + param1), param1 + param3.field_k, param3.field_u + param3.field_o + param4, true, param3.field_o + param4);
          if (var10 != null) {
            param0 = param0 & var10.field_D;
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          var7 = ((ig) this).field_s[0];
          ((ig) this).field_r.a((byte) -121);
          var7.a((ig) this, ((ig) this).field_r, param4, param1, -28063, param3);
          if (var10 == null) {
            break L2;
          } else {
            L3: {
              if (var10.field_B) {
                var11 = ((ig) this).field_s[1];
                if (var11 != null) {
                  var11.a((ig) this, ((ig) this).field_r, param4, param1, -28063, param3);
                  break L3;
                } else {
                  break L3;
                }
              } else {
                break L3;
              }
            }
            if (var10.field_p) {
              L4: {
                var12 = ((ig) this).field_s[3];
                if (var10.field_v == 0) {
                  break L4;
                } else {
                  if (var12 == null) {
                    break L4;
                  } else {
                    var12.a((ig) this, ((ig) this).field_r, param4, param1, -28063, param3);
                    break L2;
                  }
                }
              }
              var9 = ((ig) this).field_s[2];
              if (var9 == null) {
                break L2;
              } else {
                var9.a((ig) this, ((ig) this).field_r, param4, param1, -28063, param3);
                break L2;
              }
            } else {
              break L2;
            }
          }
        }
        L5: {
          if (param3.c((byte) -20)) {
            var13 = ((ig) this).field_s[5];
            if (var13 == null) {
              break L5;
            } else {
              var13.a((ig) this, ((ig) this).field_r, param4, param1, -28063, param3);
              break L5;
            }
          } else {
            break L5;
          }
        }
        L6: {
          if (param0) {
            break L6;
          } else {
            var14 = ((ig) this).field_s[4];
            if (var14 == null) {
              break L6;
            } else {
              var14.a((ig) this, ((ig) this).field_r, param4, param1, -28063, param3);
              break L6;
            }
          }
        }
        L7: {
          ((ig) this).field_r.a(param3, param4, param1, -1, (ig) this);
          if (param2 <= -48) {
            break L7;
          } else {
            field_u = null;
            break L7;
          }
        }
        dm.b((byte) -10);
    }

    public static void a(byte param0) {
        int var1 = 29 / ((param0 - 7) / 56);
        field_t = null;
        field_u = null;
        field_q = null;
    }

    ig(ig param0, boolean param1) {
        this();
        param0.a((ig) this, param1, 119);
    }

    final nj a(int param0, int param1) {
        int var3 = 98 % ((-14 - param1) / 45);
        ((ig) this).field_s[param0] = new nj();
        return new nj();
    }

    final void a(byte param0, hj[] param1) {
        nj[] var3 = null;
        int var4 = 0;
        nj var5 = null;
        int var6 = 0;
        nj[] var7 = null;
        var6 = HoldTheLine.field_D;
        var7 = ((ig) this).field_s;
        var3 = var7;
        var4 = 0;
        L0: while (true) {
          if (var4 >= var7.length) {
            L1: {
              if (param0 == -2) {
                break L1;
              } else {
                field_u = null;
                break L1;
              }
            }
            return;
          } else {
            var5 = var7[var4];
            if (var5 != null) {
              var5.field_j = param1;
              var4++;
              continue L0;
            } else {
              var4++;
              continue L0;
            }
          }
        }
    }

    private final void a(ig param0, boolean param1, int param2) {
        int var4 = 0;
        nj var5 = null;
        nj var6 = null;
        nj var6_ref = null;
        int var7 = 0;
        nj stackIn_6_0 = null;
        nj stackIn_7_0 = null;
        nj stackIn_8_0 = null;
        nj stackIn_8_1 = null;
        nj stackOut_5_0 = null;
        nj stackOut_7_0 = null;
        nj stackOut_7_1 = null;
        nj stackOut_6_0 = null;
        nj stackOut_6_1 = null;
        L0: {
          var7 = HoldTheLine.field_D;
          super.a((byte) -119, (dk) (Object) param0);
          if (!param1) {
            bc.a((Object[]) (Object) ((ig) this).field_s, 0, (Object[]) (Object) param0.field_s, 0, 6);
            break L0;
          } else {
            var4 = 0;
            L1: while (true) {
              if ((var4 ^ -1) <= -7) {
                break L0;
              } else {
                var5 = ((ig) this).field_s[var4];
                var6 = var5;
                var6 = var5;
                if (var5 != null) {
                  L2: {
                    var6_ref = param0.field_s[var4];
                    stackOut_5_0 = (nj) var5;
                    stackIn_7_0 = stackOut_5_0;
                    stackIn_6_0 = stackOut_5_0;
                    if (var6_ref != null) {
                      stackOut_7_0 = (nj) (Object) stackIn_7_0;
                      stackOut_7_1 = (nj) var6_ref;
                      stackIn_8_0 = stackOut_7_0;
                      stackIn_8_1 = stackOut_7_1;
                      break L2;
                    } else {
                      param0.field_s[var4] = new nj();
                      stackOut_6_0 = (nj) (Object) stackIn_6_0;
                      stackOut_6_1 = new nj();
                      stackIn_8_0 = stackOut_6_0;
                      stackIn_8_1 = stackOut_6_1;
                      break L2;
                    }
                  }
                  ((nj) (Object) stackIn_8_0).a(stackIn_8_1, -1);
                  var4++;
                  continue L1;
                } else {
                  param0.field_s[var4] = null;
                  var4++;
                  continue L1;
                }
              }
            }
          }
        }
        var4 = 62 % ((param2 - 28) / 32);
    }

    final void a(hj param0, int param1) {
        nj[] var3 = null;
        int var4 = 0;
        nj var5 = null;
        int var6 = 0;
        nj[] var7 = null;
        var6 = HoldTheLine.field_D;
        var7 = ((ig) this).field_s;
        var3 = var7;
        var4 = param1;
        L0: while (true) {
          if (var4 >= var7.length) {
            return;
          } else {
            var5 = var7[var4];
            if (var5 != null) {
              var5.field_b = param0;
              var4++;
              continue L0;
            } else {
              var4++;
              continue L0;
            }
          }
        }
    }

    public ig() {
        ((ig) this).field_s = new nj[6];
        ((ig) this).field_r = new nj();
        ((ig) this).field_s[0] = new nj();
        nj var1 = new nj();
        var1.a((byte) -121);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_u = new float[]{0.800000011920929f, 0.8500000238418579f, 0.8999999761581421f, 0.949999988079071f, 1.0f};
    }
}
