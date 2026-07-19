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
        int stackIn_38_0 = 0;
        int stackIn_38_1 = 0;
        int stackIn_43_0 = 0;
        int stackIn_43_1 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_37_0 = 0;
        int stackOut_37_1 = 0;
        int stackOut_42_0 = 0;
        int stackOut_42_1 = 0;
        var12 = TombRacer.field_G ? 1 : 0;
        if (null != this.field_o) {
          return true;
        } else {
          L0: {
            if (null != this.field_m) {
              break L0;
            } else {
              var2_ref_Object = dk.field_c;
              synchronized (var2_ref_Object) {
                L1: {
                  if (dk.field_c.e(this.field_k, param0 ^ -107)) {
                    var28 = dk.field_c.d(param0 + -216, this.field_k);
                    this.field_m = new byte[var28.length][];
                    var4 = 0;
                    L2: while (true) {
                      L3: {
                        L4: {
                          if (var28.length <= var4) {
                            break L4;
                          } else {
                            this.field_m[var4] = dk.field_c.a(false, this.field_k, var28[var4]);
                            var4++;
                            if (var12 != 0) {
                              break L3;
                            } else {
                              if (var12 == 0) {
                                continue L2;
                              } else {
                                break L4;
                              }
                            }
                          }
                        }
                        break L3;
                      }
                      break L1;
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
          L5: {
            if (param0 == 107) {
              break L5;
            } else {
              this.field_k = 87;
              break L5;
            }
          }
          var2 = 1;
          var3 = 0;
          L6: while (true) {
            L7: {
              L8: {
                if (var3 >= this.field_m.length) {
                  break L8;
                } else {
                  var29 = this.field_m[var3];
                  var15 = new uia(var29);
                  var15.field_h = 1;
                  var6 = var15.d(124);
                  var7 = jma.field_j;
                  synchronized (var7) {
                    L9: {
                      var2 = var2 != 0 & jma.field_j.a(param0 ^ -15228, var6) ? 1 : 0;
                      break L9;
                    }
                  }
                  if (var12 != 0) {
                    break L7;
                  } else {
                    var3++;
                    if (var12 == 0) {
                      continue L6;
                    } else {
                      break L8;
                    }
                  }
                }
              }
              if (var2 == 0) {
                break L7;
              } else {
                var19 = new vna();
                var5_ref_Object = dk.field_c;
                synchronized (var5_ref_Object) {
                  L10: {
                    var6 = dk.field_c.a((byte) -117, this.field_k);
                    this.field_o = new rq[var6];
                    var30 = dk.field_c.d(-79, this.field_k);
                    var5 = 0;
                    break L10;
                  }
                }
                L11: while (true) {
                  stackOut_37_0 = var30.length;
                  stackOut_37_1 = var5;
                  stackIn_38_0 = stackOut_37_0;
                  stackIn_38_1 = stackOut_37_1;
                  L12: while (true) {
                    L13: {
                      L14: {
                        if (stackIn_38_0 <= stackIn_38_1) {
                          break L14;
                        } else {
                          var31 = this.field_m[var5];
                          var18 = new uia(var31);
                          var18.field_h = 1;
                          var8 = var18.d(param0 + 18);
                          var9 = null;
                          if (var12 != 0) {
                            break L13;
                          } else {
                            var10 = (nk) ((Object) var19.f(-80));
                            L15: while (true) {
                              L16: {
                                if (var10 == null) {
                                  break L16;
                                } else {
                                  stackOut_42_0 = var10.field_l ^ -1;
                                  stackOut_42_1 = var8 ^ -1;
                                  stackIn_38_0 = stackOut_42_0;
                                  stackIn_38_1 = stackOut_42_1;
                                  stackIn_43_0 = stackOut_42_0;
                                  stackIn_43_1 = stackOut_42_1;
                                  if (var12 != 0) {
                                    continue L12;
                                  } else {
                                    if (stackIn_43_0 == stackIn_43_1) {
                                      var9 = var10;
                                      break L16;
                                    } else {
                                      var10 = (nk) ((Object) var19.e(param0 + 4));
                                      continue L15;
                                    }
                                  }
                                }
                              }
                              L17: {
                                if (var9 == null) {
                                  var10_ref = jma.field_j;
                                  synchronized (var10_ref) {
                                    L18: {
                                      var9 = new nk(var8, jma.field_j.f(var8, -93));
                                      break L18;
                                    }
                                  }
                                  var19.b((byte) -124, (vg) (var9));
                                  break L17;
                                } else {
                                  break L17;
                                }
                              }
                              this.field_o[var30[var5]] = new rq(var31, (nk) (var9));
                              var5++;
                              if (var12 == 0) {
                                continue L11;
                              } else {
                                break L14;
                              }
                            }
                          }
                        }
                      }
                      this.field_m = (byte[][]) null;
                      break L13;
                    }
                    return true;
                  }
                }
              }
            }
            return false;
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
        this.field_k = param0;
    }

    static {
        field_n = -1;
    }
}
