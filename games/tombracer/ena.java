/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ena extends od {
    private byte[][] field_m;
    private int field_k;
    static vs field_p;
    static jpa field_l;
    rq[] field_o;
    static volatile int field_n;

    final boolean a(byte param0) {
        Object var2_ref_Object = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        Throwable var5_ref_Throwable = null;
        Object var5_ref_Object = null;
        int var5 = 0;
        int var6 = 0;
        Object var7 = null;
        Throwable var8_ref_Throwable = null;
        int var8 = 0;
        Object var9 = null;
        nk var10 = null;
        Object var10_ref = null;
        Throwable var11 = null;
        int var12 = 0;
        uia var15 = null;
        uia var18 = null;
        vna var19 = null;
        int[] var28 = null;
        byte[] var29 = null;
        int[] var30 = null;
        byte[] var31 = null;
        int stackIn_7_0 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        var12 = TombRacer.field_G ? 1 : 0;
        if (null != ((ena) this).field_o) {
          return true;
        } else {
          L0: {
            if (null != ((ena) this).field_m) {
              break L0;
            } else {
              var2_ref_Object = (Object) (Object) dk.field_c;
              synchronized (var2_ref_Object) {
                L1: {
                  if (dk.field_c.e(((ena) this).field_k, param0 ^ -107)) {
                    var28 = dk.field_c.d(param0 + -216, ((ena) this).field_k);
                    ((ena) this).field_m = new byte[var28.length][];
                    var4 = 0;
                    L2: while (true) {
                      if (var28.length <= var4) {
                        break L1;
                      } else {
                        ((ena) this).field_m[var4] = dk.field_c.a(false, ((ena) this).field_k, var28[var4]);
                        var4++;
                        continue L2;
                      }
                    }
                  } else {
                    stackOut_6_0 = 0;
                    stackIn_7_0 = stackOut_6_0;
                    return stackIn_7_0 != 0;
                  }
                }
              }
              break L0;
            }
          }
          L3: {
            if (param0 == 107) {
              break L3;
            } else {
              ((ena) this).field_k = 87;
              break L3;
            }
          }
          var2 = 1;
          var3 = 0;
          L4: while (true) {
            if (var3 >= ((ena) this).field_m.length) {
              if (var2 == 0) {
                return false;
              } else {
                var19 = new vna();
                var5_ref_Object = (Object) (Object) dk.field_c;
                synchronized (var5_ref_Object) {
                  L5: {
                    var6 = dk.field_c.a((byte) -117, ((ena) this).field_k);
                    ((ena) this).field_o = new rq[var6];
                    var30 = dk.field_c.d(-79, ((ena) this).field_k);
                    var5 = 0;
                    break L5;
                  }
                }
                L6: while (true) {
                  if (var30.length <= var5) {
                    ((ena) this).field_m = null;
                    return true;
                  } else {
                    var31 = ((ena) this).field_m[var5];
                    var18 = new uia(var31);
                    var18.field_h = 1;
                    var8 = var18.d(param0 + 18);
                    var9 = null;
                    var10 = (nk) (Object) var19.f(-80);
                    L7: while (true) {
                      L8: {
                        if (var10 == null) {
                          break L8;
                        } else {
                          if (var10.field_l == var8) {
                            var9 = (Object) (Object) var10;
                            break L8;
                          } else {
                            var10 = (nk) (Object) var19.e(param0 + 4);
                            continue L7;
                          }
                        }
                      }
                      L9: {
                        if (var9 == null) {
                          var10_ref = (Object) (Object) jma.field_j;
                          synchronized (var10_ref) {
                            L10: {
                              var9 = (Object) (Object) new nk(var8, jma.field_j.f(var8, -93));
                              break L10;
                            }
                          }
                          var19.b((byte) -124, (vg) var9);
                          break L9;
                        } else {
                          break L9;
                        }
                      }
                      ((ena) this).field_o[var30[var5]] = new rq(var31, (nk) var9);
                      var5++;
                      continue L6;
                    }
                  }
                }
              }
            } else {
              var29 = ((ena) this).field_m[var3];
              var15 = new uia(var29);
              var15.field_h = 1;
              var6 = var15.d(124);
              var7 = (Object) (Object) jma.field_j;
              synchronized (var7) {
                L11: {
                  var2 = var2 != 0 & jma.field_j.a(param0 ^ -15228, var6) ? 1 : 0;
                  var3++;
                  break L11;
                }
              }
              continue L4;
            }
          }
        }
    }

    public static void a(boolean param0) {
        field_p = null;
        field_l = null;
        if (!param0) {
            ena.a(false);
        }
    }

    ena(int param0) {
        ((ena) this).field_k = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = -1;
    }
}
