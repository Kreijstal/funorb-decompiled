/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qha extends ou {
    static int field_f;
    static vna field_g;

    qha(int param0) {
        super(-1 + aq.a(-5640) - -aq.a(-5640), param0);
    }

    public static void c(byte param0) {
        if (param0 >= -84) {
            field_g = (vna) null;
            field_g = null;
            return;
        }
        field_g = null;
    }

    final wea a(byte param0) {
        wea var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var12 = 0;
        g var13 = null;
        g var14 = null;
        int stackIn_15_0 = 0;
        int stackIn_31_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        var12 = TombRacer.field_G ? 1 : 0;
        var2 = new wea(this.field_a);
        var3 = aq.a(-5640);
        var4 = ml.a(57);
        var5 = 0;
        var6 = 0;
        var7 = 1;
        if (param0 != 58) {
          field_f = -112;
          var8 = 0;
          L0: while (true) {
            if (this.field_a <= var8) {
              return var2;
            } else {
              L1: {
                L2: {
                  if (var7 == 0) {
                    break L2;
                  } else {
                    var10 = ak.a(var5, (byte) 127);
                    var13 = ta.d(var10, false);
                    var9 = var13.field_f;
                    if (var12 == 0) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                var9 = hn.b(param0 + -58, var6).field_f;
                break L1;
              }
              L3: {
                L4: {
                  var2.a(var8, var9, this.b((byte) -56), (byte) -63);
                  if (var7 != 0) {
                    break L4;
                  } else {
                    var6++;
                    if (var6 >= var4) {
                      var6 = 0;
                      if (var12 == 0) {
                        break L3;
                      } else {
                        break L4;
                      }
                    } else {
                      break L3;
                    }
                  }
                }
                var5++;
                if (var5 < var3) {
                  break L3;
                } else {
                  var5 = 0;
                  break L3;
                }
              }
              L5: {
                if (var7 != 0) {
                  stackOut_30_0 = 0;
                  stackIn_31_0 = stackOut_30_0;
                  break L5;
                } else {
                  stackOut_29_0 = 1;
                  stackIn_31_0 = stackOut_29_0;
                  break L5;
                }
              }
              var7 = stackIn_31_0;
              var8++;
              continue L0;
            }
          }
        } else {
          var8 = 0;
          L6: while (true) {
            if (this.field_a <= var8) {
              return var2;
            } else {
              L7: {
                L8: {
                  if (var7 == 0) {
                    break L8;
                  } else {
                    var10 = ak.a(var5, (byte) 127);
                    var14 = ta.d(var10, false);
                    var9 = var14.field_f;
                    if (var12 == 0) {
                      break L7;
                    } else {
                      break L8;
                    }
                  }
                }
                var9 = hn.b(param0 + -58, var6).field_f;
                break L7;
              }
              L9: {
                L10: {
                  var2.a(var8, var9, this.b((byte) -56), (byte) -63);
                  if (var7 != 0) {
                    break L10;
                  } else {
                    var6++;
                    if (var6 >= var4) {
                      var6 = 0;
                      if (var12 == 0) {
                        break L9;
                      } else {
                        break L10;
                      }
                    } else {
                      break L9;
                    }
                  }
                }
                var5++;
                if (var5 < var3) {
                  break L9;
                } else {
                  var5 = 0;
                  break L9;
                }
              }
              L11: {
                if (var7 != 0) {
                  stackOut_14_0 = 0;
                  stackIn_15_0 = stackOut_14_0;
                  break L11;
                } else {
                  stackOut_13_0 = 1;
                  stackIn_15_0 = stackOut_13_0;
                  break L11;
                }
              }
              var7 = stackIn_15_0;
              var8++;
              continue L6;
            }
          }
        }
    }

    final static void a(int param0, boolean param1) {
        L0: {
          if (!wqa.r((byte) -73)) {
            break L0;
          } else {
            param1 = false;
            break L0;
          }
        }
        upa.a(param1, param0);
        if (bs.field_g) {
          bea.d(rm.field_e.field_a.field_qb, rm.field_e.field_a.field_T, rm.field_e.field_a.field_G, rm.field_e.field_a.field_t);
          rm.field_e.field_a.b(121, param1);
          ea.a(param1, -16838);
          return;
        } else {
          ea.a(param1, -16838);
          return;
        }
    }

    static {
        field_f = 10;
    }
}
