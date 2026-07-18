/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class me {
    static String[] field_a;

    abstract fd b(byte param0);

    abstract int a(int param0, int param1);

    final static String a(int param0) {
        RuntimeException var1 = null;
        String var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        String stackIn_5_0 = null;
        String stackIn_19_0 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_4_0 = null;
        String stackOut_18_0 = null;
        var5 = Torquing.field_u;
        try {
          L0: {
            L1: {
              L2: {
                var1_ref = "(" + mm.field_d + " " + eb.field_f + " " + wk.field_h + ") " + fa.field_e;
                if (param0 <= ~oo.field_a) {
                  break L2;
                } else {
                  var1_ref = var1_ref + ":";
                  var2 = 0;
                  L3: while (true) {
                    if (var2 >= oo.field_a) {
                      break L2;
                    } else {
                      stackOut_4_0 = var1_ref + ' ';
                      stackIn_19_0 = stackOut_4_0;
                      stackIn_5_0 = stackOut_4_0;
                      if (var5 != 0) {
                        break L1;
                      } else {
                        L4: {
                          L5: {
                            var1_ref = stackIn_5_0;
                            var3 = kj.field_d.field_j[var2] & 255;
                            var4 = var3 >> -12710428;
                            var3 = var3 & 15;
                            if (var4 >= 10) {
                              break L5;
                            } else {
                              var4 += 48;
                              if (var5 == 0) {
                                break L4;
                              } else {
                                break L5;
                              }
                            }
                          }
                          var4 += 55;
                          break L4;
                        }
                        L6: {
                          L7: {
                            if (var3 < 10) {
                              break L7;
                            } else {
                              var3 += 55;
                              if (var5 == 0) {
                                break L6;
                              } else {
                                break L7;
                              }
                            }
                          }
                          var3 += 48;
                          break L6;
                        }
                        var1_ref = var1_ref + (char)var4;
                        var1_ref = var1_ref + (char)var3;
                        var2++;
                        if (var5 == 0) {
                          continue L3;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                }
              }
              stackOut_18_0 = (String) var1_ref;
              stackIn_19_0 = stackOut_18_0;
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw rb.a((Throwable) (Object) var1, "me.J(" + param0 + ')');
        }
        return stackIn_19_0;
    }

    public static void a(byte param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 >= 1) {
                break L1;
              } else {
                String discarded$2 = me.a(-64);
                break L1;
              }
            }
            field_a = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw rb.a((Throwable) (Object) var1, "me.I(" + param0 + ')');
        }
    }

    abstract byte[] a(int param0, boolean param1);

    static {
    }
}
