/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class kc {
    static int field_c;
    static pj field_a;
    static Boolean field_b;
    static int field_d;

    abstract void a(int param0, gk param1);

    final static void b(boolean param0) {
        if (null != ha.field_Z) {
          if (ha.field_Z.h()) {
            L0: {
              ha.field_Z = li.a(ke.field_h[4], 100, 96);
              na.a((byte) 60, ha.field_Z);
              if (param0) {
                break L0;
              } else {
                field_b = (Boolean) null;
                break L0;
              }
            }
            return;
          } else {
            return;
          }
        } else {
          L1: {
            ha.field_Z = li.a(ke.field_h[4], 100, 96);
            na.a((byte) 60, ha.field_Z);
            if (param0) {
              break L1;
            } else {
              field_b = (Boolean) null;
              break L1;
            }
          }
          return;
        }
    }

    public static void a(int param0) {
        if (param0 != 4) {
            return;
        }
        field_b = null;
        field_a = null;
    }

    final static void a(byte param0) {
        RuntimeException var1 = null;
        Object var1_ref = null;
        int var2 = 0;
        Throwable var3 = null;
        int var4 = 0;
        int stackIn_7_0 = 0;
        int stackIn_19_0 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_18_0 = 0;
        var4 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            var1_ref = wj.field_k;
            synchronized (var1_ref) {
              L1: {
                L2: {
                  o.field_b = bh.field_e;
                  je.field_c = je.field_c + 1;
                  if (param0 >= 86) {
                    break L2;
                  } else {
                    field_b = (Boolean) null;
                    break L2;
                  }
                }
                L3: {
                  L4: {
                    L5: {
                      L6: {
                        if (0 > vf.field_a) {
                          break L6;
                        } else {
                          L7: while (true) {
                            if (sl.field_j == vf.field_a) {
                              break L5;
                            } else {
                              var2 = ia.field_g[sl.field_j];
                              sl.field_j = 127 & sl.field_j + 1;
                              stackOut_6_0 = -1;
                              stackIn_19_0 = stackOut_6_0;
                              stackIn_7_0 = stackOut_6_0;
                              if (var4 != 0) {
                                break L4;
                              } else {
                                L8: {
                                  L9: {
                                    if (stackIn_7_0 < (var2 ^ -1)) {
                                      break L9;
                                    } else {
                                      dl.field_c[var2] = true;
                                      if (var4 == 0) {
                                        break L8;
                                      } else {
                                        break L9;
                                      }
                                    }
                                  }
                                  dl.field_c[var2 ^ -1] = false;
                                  break L8;
                                }
                                if (var4 == 0) {
                                  continue L7;
                                } else {
                                  break L6;
                                }
                              }
                            }
                          }
                        }
                      }
                      var2 = 0;
                      L10: while (true) {
                        L11: {
                          if (112 <= var2) {
                            break L11;
                          } else {
                            dl.field_c[var2] = false;
                            var2++;
                            if (var4 != 0) {
                              break L3;
                            } else {
                              if (var4 == 0) {
                                continue L10;
                              } else {
                                break L11;
                              }
                            }
                          }
                        }
                        vf.field_a = sl.field_j;
                        break L5;
                      }
                    }
                    stackOut_18_0 = jk.field_w;
                    stackIn_19_0 = stackOut_18_0;
                    break L4;
                  }
                  bh.field_e = stackIn_19_0;
                  break L3;
                }
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = (RuntimeException) (Object) decompiledCaughtException;
          throw la.a((Throwable) ((Object) var1), "kc.I(" + param0 + ')');
        }
    }

    abstract fk a(boolean param0);

    static {
        field_d = 0;
    }
}
