/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gi extends ic {
    private qi[] field_s;
    static int field_r;
    private qi field_p;
    static aa field_q;
    static int field_o;

    final qi a(byte param0, int param1) {
        if (param0 != 118) {
            field_o = -123;
        }
        ((gi) this).field_s[param1] = new qi();
        return new qi();
    }

    private final void a(boolean param0, gi param1, int param2) {
        int var4 = 0;
        qi var5 = null;
        qi var6 = null;
        int var7 = 0;
        qi stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        qi stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        qi stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        qi stackIn_9_2 = null;
        qi stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        qi stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        qi stackOut_8_2 = null;
        qi stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        qi stackOut_7_2 = null;
        L0: {
          var7 = TrackController.field_F ? 1 : 0;
          super.a(-19397, (ic) (Object) param1);
          if (param2 == 11) {
            break L0;
          } else {
            ((gi) this).field_s = null;
            break L0;
          }
        }
        L1: {
          if (!param0) {
            pd.a((Object[]) (Object) ((gi) this).field_s, 0, (Object[]) (Object) param1.field_s, 0, 6);
            break L1;
          } else {
            var4 = 0;
            L2: while (true) {
              if (6 <= var4) {
                break L1;
              } else {
                var5 = ((gi) this).field_s[var4];
                if (var5 == null) {
                  param1.field_s[var4] = null;
                  var4++;
                  continue L2;
                } else {
                  L3: {
                    var6 = param1.field_s[var4];
                    stackOut_6_0 = (qi) var5;
                    stackOut_6_1 = 0;
                    stackIn_8_0 = stackOut_6_0;
                    stackIn_8_1 = stackOut_6_1;
                    stackIn_7_0 = stackOut_6_0;
                    stackIn_7_1 = stackOut_6_1;
                    if (var6 == null) {
                      param1.field_s[var4] = new qi();
                      stackOut_8_0 = (qi) (Object) stackIn_8_0;
                      stackOut_8_1 = stackIn_8_1;
                      stackOut_8_2 = new qi();
                      stackIn_9_0 = stackOut_8_0;
                      stackIn_9_1 = stackOut_8_1;
                      stackIn_9_2 = stackOut_8_2;
                      break L3;
                    } else {
                      stackOut_7_0 = (qi) (Object) stackIn_7_0;
                      stackOut_7_1 = stackIn_7_1;
                      stackOut_7_2 = (qi) var6;
                      stackIn_9_0 = stackOut_7_0;
                      stackIn_9_1 = stackOut_7_1;
                      stackIn_9_2 = stackOut_7_2;
                      break L3;
                    }
                  }
                  ((qi) (Object) stackIn_9_0).a(stackIn_9_1 != 0, stackIn_9_2);
                  var4++;
                  continue L2;
                }
              }
            }
          }
        }
    }

    gi(gi param0, boolean param1) {
        this();
        param0.a(param1, (gi) this, 11);
    }

    final void a(qj param0, int param1) {
        qi[] var3 = null;
        int var4 = 0;
        qi var5 = null;
        int var6 = 0;
        qi[] var7 = null;
        var6 = TrackController.field_F ? 1 : 0;
        var7 = ((gi) this).field_s;
        var3 = var7;
        var4 = 0;
        L0: while (true) {
          if (var7.length <= var4) {
            L1: {
              if (param1 < -109) {
                break L1;
              } else {
                field_o = 45;
                break L1;
              }
            }
            return;
          } else {
            var5 = var7[var4];
            if (var5 != null) {
              var5.field_g = param0;
              var4++;
              continue L0;
            } else {
              var4++;
              continue L0;
            }
          }
        }
    }

    final void a(int param0, qj[] param1) {
        qi[] var3 = null;
        int var4 = 0;
        qi var5 = null;
        int var6 = 0;
        qi[] var7 = null;
        var6 = TrackController.field_F ? 1 : 0;
        var7 = ((gi) this).field_s;
        var3 = var7;
        if (param0 <= -45) {
          var4 = 0;
          L0: while (true) {
            if (var4 >= var7.length) {
              return;
            } else {
              var5 = var7[var4];
              if (var5 != null) {
                var5.field_i = param1;
                var4++;
                continue L0;
              } else {
                var4++;
                continue L0;
              }
            }
          }
        } else {
          return;
        }
    }

    public final void a(int param0, al param1, int param2, boolean param3, int param4) {
        qi var7 = null;
        qi var9 = null;
        rh var10 = null;
        qi var11 = null;
        qi var12 = null;
        qi var13 = null;
        qi var14 = null;
        al stackIn_3_0 = null;
        Object stackOut_2_0 = null;
        al stackOut_1_0 = null;
        L0: {
          if (!(param1 instanceof rh)) {
            stackOut_2_0 = null;
            stackIn_3_0 = (al) (Object) stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = (al) param1;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var10 = (rh) (Object) stackIn_3_0;
          mb.a(param4 - -param1.field_p, param1.field_m + param2, param2 + param1.field_m + param1.field_u, (byte) -41, param1.field_p + (param4 + param1.field_x));
          if (var10 == null) {
            break L1;
          } else {
            param3 = param3 & var10.field_B;
            break L1;
          }
        }
        L2: {
          var7 = ((gi) this).field_s[0];
          ((gi) this).field_p.a((byte) 76);
          if (param0 == -24969) {
            break L2;
          } else {
            gi.c((byte) -116);
            break L2;
          }
        }
        L3: {
          var7.a((gi) this, param2, param1, -1, ((gi) this).field_p, param4);
          if (var10 == null) {
            break L3;
          } else {
            L4: {
              if (var10.field_G) {
                var11 = ((gi) this).field_s[1];
                if (var11 == null) {
                  break L4;
                } else {
                  var11.a((gi) this, param2, param1, -1, ((gi) this).field_p, param4);
                  break L4;
                }
              } else {
                break L4;
              }
            }
            if (!var10.field_q) {
              break L3;
            } else {
              L5: {
                var12 = ((gi) this).field_s[3];
                if (var10.field_r == 0) {
                  break L5;
                } else {
                  if (var12 != null) {
                    var12.a((gi) this, param2, param1, param0 ^ 24968, ((gi) this).field_p, param4);
                    break L3;
                  } else {
                    break L5;
                  }
                }
              }
              var9 = ((gi) this).field_s[2];
              if (var9 != null) {
                var9.a((gi) this, param2, param1, -1, ((gi) this).field_p, param4);
                break L3;
              } else {
                break L3;
              }
            }
          }
        }
        L6: {
          if (!param1.h(-115)) {
            break L6;
          } else {
            var13 = ((gi) this).field_s[5];
            if (var13 != null) {
              var13.a((gi) this, param2, param1, param0 ^ 24968, ((gi) this).field_p, param4);
              break L6;
            } else {
              break L6;
            }
          }
        }
        L7: {
          if (param3) {
            break L7;
          } else {
            var14 = ((gi) this).field_s[4];
            if (var14 == null) {
              break L7;
            } else {
              var14.a((gi) this, param2, param1, param0 + 24968, ((gi) this).field_p, param4);
              break L7;
            }
          }
        }
        ((gi) this).field_p.a(param4, param2, param1, -16711924, (gi) this);
        ch.m(35);
    }

    final void a(int param0, qj[] param1, byte param2) {
        int var4 = param0;
        if (param2 != -33) {
            Object var5 = null;
            ((gi) this).a(111, (al) null, -5, true, -65);
        }
        if (null == ((gi) this).field_s[var4]) {
            ((gi) this).field_s[var4] = new qi();
        }
        ((gi) this).field_s[param0].field_i = param1;
    }

    public gi() {
        ((gi) this).field_s = new qi[6];
        ((gi) this).field_p = new qi();
        ((gi) this).field_s[0] = new qi();
        qi var1 = new qi();
        var1.a((byte) 127);
    }

    public static void c(byte param0) {
        field_q = null;
        if (param0 >= -107) {
            gi.c((byte) 60);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = new aa(11, 0, 1, 2);
    }
}
