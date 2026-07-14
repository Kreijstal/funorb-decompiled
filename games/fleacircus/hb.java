/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hb extends e {
    private te[] field_s;
    static int field_t;
    static String field_q;
    private te field_r;

    private final void a(boolean param0, hb param1, byte param2) {
        int var4 = 0;
        te var5 = null;
        te var6 = null;
        int var7 = 0;
        te stackIn_8_0 = null;
        te stackIn_9_0 = null;
        te stackIn_10_0 = null;
        te stackIn_10_1 = null;
        te stackOut_7_0 = null;
        te stackOut_9_0 = null;
        te stackOut_9_1 = null;
        te stackOut_8_0 = null;
        te stackOut_8_1 = null;
        var7 = fleas.field_A ? 1 : 0;
        super.a(2, (e) (Object) param1);
        if (param2 == 70) {
          L0: {
            if (param0) {
              var4 = 0;
              L1: while (true) {
                if (6 <= var4) {
                  break L0;
                } else {
                  var5 = ((hb) this).field_s[var4];
                  if (var5 == null) {
                    param1.field_s[var4] = null;
                    var4++;
                    continue L1;
                  } else {
                    L2: {
                      var6 = param1.field_s[var4];
                      stackOut_7_0 = (te) var5;
                      stackIn_9_0 = stackOut_7_0;
                      stackIn_8_0 = stackOut_7_0;
                      if (var6 == null) {
                        param1.field_s[var4] = new te();
                        stackOut_9_0 = (te) (Object) stackIn_9_0;
                        stackOut_9_1 = new te();
                        stackIn_10_0 = stackOut_9_0;
                        stackIn_10_1 = stackOut_9_1;
                        break L2;
                      } else {
                        stackOut_8_0 = (te) (Object) stackIn_8_0;
                        stackOut_8_1 = (te) var6;
                        stackIn_10_0 = stackOut_8_0;
                        stackIn_10_1 = stackOut_8_1;
                        break L2;
                      }
                    }
                    ((te) (Object) stackIn_10_0).a(stackIn_10_1, 33);
                    var4++;
                    continue L1;
                  }
                }
              }
            } else {
              dm.a((Object[]) (Object) ((hb) this).field_s, 0, (Object[]) (Object) param1.field_s, 0, 6);
              break L0;
            }
          }
          return;
        } else {
          return;
        }
    }

    public final void a(int param0, int param1, boolean param2, qa param3, int param4) {
        te var7 = null;
        te var9 = null;
        bb var10 = null;
        te var11 = null;
        te var12 = null;
        te var13 = null;
        te var14 = null;
        qa stackIn_3_0 = null;
        qa stackOut_2_0 = null;
        Object stackOut_1_0 = null;
        L0: {
          if (param3 instanceof bb) {
            stackOut_2_0 = (qa) param3;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = null;
            stackIn_3_0 = (qa) (Object) stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var10 = (bb) (Object) stackIn_3_0;
          mi.a((byte) -52, param1 + (param3.field_y - -param3.field_u), param3.field_y + param1, param4 + (param3.field_z + param3.field_j), param4 + param3.field_z);
          if (var10 != null) {
            param2 = param2 & var10.field_D;
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          if (param0 <= -36) {
            break L2;
          } else {
            te discarded$1 = ((hb) this).a(3, 55);
            break L2;
          }
        }
        L3: {
          var7 = ((hb) this).field_s[0];
          ((hb) this).field_r.a(0);
          var7.a(((hb) this).field_r, param4, param3, (hb) this, param1, -2);
          if (var10 == null) {
            break L3;
          } else {
            L4: {
              if (var10.field_G) {
                var11 = ((hb) this).field_s[1];
                if (var11 == null) {
                  break L4;
                } else {
                  var11.a(((hb) this).field_r, param4, param3, (hb) this, param1, -2);
                  break L4;
                }
              } else {
                break L4;
              }
            }
            if (var10.field_x) {
              L5: {
                var12 = ((hb) this).field_s[3];
                if (0 == var10.field_v) {
                  break L5;
                } else {
                  if (var12 != null) {
                    var12.a(((hb) this).field_r, param4, param3, (hb) this, param1, -2);
                    break L3;
                  } else {
                    break L5;
                  }
                }
              }
              var9 = ((hb) this).field_s[2];
              if (var9 != null) {
                var9.a(((hb) this).field_r, param4, param3, (hb) this, param1, -2);
                break L3;
              } else {
                break L3;
              }
            } else {
              break L3;
            }
          }
        }
        L6: {
          if (param3.e(1)) {
            var13 = ((hb) this).field_s[5];
            if (var13 == null) {
              break L6;
            } else {
              var13.a(((hb) this).field_r, param4, param3, (hb) this, param1, -2);
              break L6;
            }
          } else {
            break L6;
          }
        }
        L7: {
          if (param2) {
            break L7;
          } else {
            var14 = ((hb) this).field_s[4];
            if (var14 == null) {
              break L7;
            } else {
              var14.a(((hb) this).field_r, param4, param3, (hb) this, param1, -2);
              break L7;
            }
          }
        }
        ((hb) this).field_r.a((hb) this, param3, 0, param4, param1);
        ia.a(-85);
    }

    final void a(dd[] param0, int param1, int param2) {
        if (param1 > -27) {
            field_t = -122;
        }
        int var4 = param2;
        if (((hb) this).field_s[var4] == null) {
            ((hb) this).field_s[var4] = new te();
        }
        ((hb) this).field_s[param2].field_g = param0;
    }

    public hb() {
        ((hb) this).field_s = new te[6];
        ((hb) this).field_r = new te();
        ((hb) this).field_s[0] = new te();
        te var1 = new te();
        var1.a(0);
    }

    final te a(int param0, int param1) {
        if (param1 != -17562) {
            return null;
        }
        ((hb) this).field_s[param0] = new te();
        return new te();
    }

    hb(hb param0, boolean param1) {
        this();
        param0.a(param1, (hb) this, (byte) 70);
    }

    final void a(dd param0, int param1) {
        te[] var3 = null;
        int var4 = 0;
        te var5 = null;
        int var6 = 0;
        te[] var7 = null;
        var6 = fleas.field_A ? 1 : 0;
        var7 = ((hb) this).field_s;
        var3 = var7;
        var4 = param1;
        L0: while (true) {
          if (var4 >= var7.length) {
            return;
          } else {
            var5 = var7[var4];
            if (var5 != null) {
              var5.field_c = param0;
              var4++;
              continue L0;
            } else {
              var4++;
              continue L0;
            }
          }
        }
    }

    public static void c(byte param0) {
        field_q = null;
        int var1 = -65 / ((param0 - -36) / 56);
    }

    final void a(byte param0, dd[] param1) {
        te[] var3 = null;
        int var4 = 0;
        te var5 = null;
        int var6 = 0;
        te[] var7 = null;
        var6 = fleas.field_A ? 1 : 0;
        var7 = ((hb) this).field_s;
        var3 = var7;
        var4 = 0;
        L0: while (true) {
          if (var4 >= var7.length) {
            L1: {
              if (param0 == 61) {
                break L1;
              } else {
                te discarded$1 = ((hb) this).a(77, -61);
                break L1;
              }
            }
            return;
          } else {
            var5 = var7[var4];
            if (var5 != null) {
              var5.field_g = param1;
              var4++;
              continue L0;
            } else {
              var4++;
              continue L0;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = "From only <%0>/month";
    }
}
