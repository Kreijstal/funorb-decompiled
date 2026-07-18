/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oc {
    private da field_c;
    static java.awt.Frame field_a;
    private da field_b;
    static String field_e;
    private v field_d;

    final ba a(byte param0, int param1) {
        ba var3 = null;
        RuntimeException var3_ref = null;
        byte[] var4 = null;
        ba stackIn_4_0 = null;
        Object stackIn_10_0 = null;
        ba stackIn_18_0 = null;
        RuntimeException decompiledCaughtException = null;
        ba stackOut_3_0 = null;
        ba stackOut_17_0 = null;
        Object stackOut_9_0 = null;
        try {
          L0: {
            var3 = (ba) ((oc) this).field_d.a(0, (long)param1);
            if (null != var3) {
              stackOut_3_0 = (ba) var3;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            } else {
              L1: {
                L2: {
                  if (param1 >= 32768) {
                    break L2;
                  } else {
                    var4 = ((oc) this).field_c.b(1, param0 + 12366, param1);
                    if (!SolKnight.field_L) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                var4 = ((oc) this).field_b.b(1, 12257, param1 & 32767);
                break L1;
              }
              var3 = new ba();
              if (param0 == -109) {
                L3: {
                  if (null == var4) {
                    break L3;
                  } else {
                    var3.a(new gb(var4), false);
                    break L3;
                  }
                }
                L4: {
                  if (32768 > param1) {
                    break L4;
                  } else {
                    var3.g(39);
                    break L4;
                  }
                }
                ((oc) this).field_d.a(87, (Object) (Object) var3, (long)param1);
                stackOut_17_0 = (ba) var3;
                stackIn_18_0 = stackOut_17_0;
                break L0;
              } else {
                stackOut_9_0 = null;
                stackIn_10_0 = stackOut_9_0;
                return (ba) (Object) stackIn_10_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw fc.a((Throwable) (Object) var3_ref, "oc.A(" + param0 + ',' + param1 + ')');
        }
        return stackIn_18_0;
    }

    public static void a(int param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              field_e = null;
              if (param0 == 255) {
                break L1;
              } else {
                field_e = null;
                break L1;
              }
            }
            field_a = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw fc.a((Throwable) (Object) var1, "oc.B(" + param0 + ')');
        }
    }

    final static String a(boolean param0) {
        RuntimeException var1 = null;
        String var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        String stackIn_10_0 = null;
        String stackIn_24_0 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_9_0 = null;
        String stackOut_23_0 = null;
        var5 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              var1_ref = "(" + nf.field_U + " " + kl.field_b + " " + jg.field_e + ") " + ob.field_h;
              if (!param0) {
                break L1;
              } else {
                field_a = null;
                break L1;
              }
            }
            L2: {
              L3: {
                if (te.field_O > 0) {
                  var1_ref = var1_ref + ":";
                  var2 = 0;
                  L4: while (true) {
                    if (te.field_O <= var2) {
                      break L3;
                    } else {
                      stackOut_9_0 = var1_ref + ' ';
                      stackIn_24_0 = stackOut_9_0;
                      stackIn_10_0 = stackOut_9_0;
                      if (var5 != 0) {
                        break L2;
                      } else {
                        L5: {
                          L6: {
                            var1_ref = stackIn_10_0;
                            var3 = te.field_N.field_l[var2] & 255;
                            var4 = var3 >> -1918280092;
                            var3 = var3 & 15;
                            if (10 <= var4) {
                              break L6;
                            } else {
                              var4 += 48;
                              if (var5 == 0) {
                                break L5;
                              } else {
                                break L6;
                              }
                            }
                          }
                          var4 += 55;
                          break L5;
                        }
                        L7: {
                          L8: {
                            var1_ref = var1_ref + (char)var4;
                            if (var3 >= 10) {
                              break L8;
                            } else {
                              var3 += 48;
                              if (var5 == 0) {
                                break L7;
                              } else {
                                break L8;
                              }
                            }
                          }
                          var3 += 55;
                          break L7;
                        }
                        var1_ref = var1_ref + (char)var3;
                        var2++;
                        if (var5 == 0) {
                          continue L4;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                } else {
                  break L3;
                }
              }
              stackOut_23_0 = (String) var1_ref;
              stackIn_24_0 = stackOut_23_0;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw fc.a((Throwable) (Object) var1, "oc.C(" + param0 + ')');
        }
        return stackIn_24_0;
    }

    private oc() throws Throwable {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          throw new Error();
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw fc.a((Throwable) (Object) var1, "oc.<init>()");
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "The account name you use to access RuneScape and other Jagex.com games";
    }
}
