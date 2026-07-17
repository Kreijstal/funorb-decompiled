/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fpb extends mfb {
    static String field_b;
    static String field_c;
    static byte[][] field_d;

    final int k(int param0) {
        if (param0 != 0) {
            int discarded$0 = ((fpb) this).f((byte) -51);
            return 0;
        }
        return 0;
    }

    final int a(int param0) {
        if (param0 != 0) {
            int discarded$0 = ((fpb) this).b(true);
        }
        return sbb.field_p;
    }

    final static void a(pgb param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        var5 = VoidHunters.field_G;
        try {
          L0: {
            var2_int = 0;
            L1: while (true) {
              if (var2_int >= 3) {
                var2_int = 0;
                L2: while (true) {
                  if (var2_int >= ou.field_q) {
                    int dupTemp$4 = param0.a(1);
                    dca.field_q[dupTemp$4] = dca.field_q[dupTemp$4] + 1;
                    var2_int = 0;
                    var3 = 0;
                    L3: while (true) {
                      if (ou.field_q <= var3) {
                        ou.field_q = var2_int;
                        int fieldTemp$5 = ou.field_q;
                        ou.field_q = ou.field_q + 1;
                        nrb.field_b[fieldTemp$5] = param0;
                        break L0;
                      } else {
                        L4: {
                          L5: {
                            if (nrb.field_b[var3].field_a == param0.field_a) {
                              var4 = nrb.field_b[var3].a(1);
                              if (dca.field_q[var4] <= hab.field_k) {
                                break L5;
                              } else {
                                dca.field_q[var4] = dca.field_q[var4] - 1;
                                break L4;
                              }
                            } else {
                              break L5;
                            }
                          }
                          int incrementValue$6 = var2_int;
                          var2_int++;
                          nrb.field_b[incrementValue$6] = nrb.field_b[var3];
                          break L4;
                        }
                        var3++;
                        continue L3;
                      }
                    }
                  } else {
                    L6: {
                      if (param0.field_a == nrb.field_b[var2_int].field_a) {
                        int dupTemp$7 = nrb.field_b[var2_int].a(1);
                        dca.field_q[dupTemp$7] = dca.field_q[dupTemp$7] + 1;
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    var2_int++;
                    continue L2;
                  }
                }
              } else {
                dca.field_q[var2_int] = 0;
                var2_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var2 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) var2;
            stackOut_20_1 = new StringBuilder().append("fpb.P(");
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param0 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L7;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L7;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + 44 + 0 + 41);
        }
    }

    public static void l() {
        field_c = null;
        field_b = null;
        field_d = null;
    }

    final int b(int param0) {
        int var2 = -52 / ((param0 - 7) / 47);
        return sib.field_i;
    }

    final static String d() {
        if (!(dw.field_c != dn.field_r)) {
            return mqb.field_x;
        }
        return ht.field_h;
    }

    final int a(boolean param0) {
        if (param0) {
            int discarded$0 = ((fpb) this).k(-51);
        }
        return 35;
    }

    final int g(byte param0) {
        if (param0 > -12) {
            return 70;
        }
        return aea.field_a;
    }

    final int d(byte param0) {
        if (param0 >= -52) {
            field_d = null;
        }
        return adb.field_a;
    }

    final int b(boolean param0) {
        if (param0) {
            field_d = null;
        }
        return fd.field_p;
    }

    fpb() {
    }

    final int f(byte param0) {
        if (param0 < 0) {
            int discarded$0 = ((fpb) this).d((byte) -39);
        }
        return ujb.field_h;
    }

    final int c(int param0) {
        if (param0 != 0) {
            return 14;
        }
        return qca.field_wb;
    }

    final int g(int param0) {
        if (param0 != 2769) {
            field_c = null;
        }
        return ls.field_p;
    }

    final int a(byte param0) {
        int var2 = 43 / ((param0 - -48) / 43);
        return oq.field_x;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "<%0> cannot join; the game is full.";
        field_c = "Hold the component to deplete the enemy's score";
        field_d = new byte[1000][];
    }
}
