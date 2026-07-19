/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class gda {
    static int field_b;
    static int field_a;
    static int field_c;
    static jpa[] field_d;

    abstract void b(int param0);

    public static void a(int param0) {
        field_d = null;
        if (param0 != 27316) {
            field_d = (jpa[]) null;
        }
    }

    abstract void a(int param0, int param1, int param2, int param3, int param4, int param5);

    final static int a(int param0, int param1) {
        int discarded$6 = 0;
        int var2 = 0;
        L0: {
          var2 = 0;
          if (-1 != (param0 ^ -1)) {
            break L0;
          } else {
            var2 = k.field_A;
            break L0;
          }
        }
        if (param1 != -20011) {
          L1: {
            discarded$6 = gda.a(-61, -111);
            if ((param0 ^ -1) != -2) {
              break L1;
            } else {
              var2 = nba.field_b;
              break L1;
            }
          }
          L2: {
            if (-3 != (param0 ^ -1)) {
              break L2;
            } else {
              var2 = caa.field_i;
              break L2;
            }
          }
          return var2;
        } else {
          L3: {
            if ((param0 ^ -1) != -2) {
              break L3;
            } else {
              var2 = nba.field_b;
              break L3;
            }
          }
          L4: {
            if (-3 != (param0 ^ -1)) {
              break L4;
            } else {
              var2 = caa.field_i;
              break L4;
            }
          }
          return var2;
        }
    }

    abstract void d(int param0);

    abstract void a(int param0, int param1, int param2);

    final static void a(cn param0, int param1) {
        RuntimeException var2 = null;
        qg[] var2_array = null;
        int var3 = 0;
        qg var4 = null;
        g[] var5 = null;
        int var6 = 0;
        g var7 = null;
        int var9 = 0;
        qg[] var10 = null;
        byte[] var14 = null;
        int stackIn_4_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_11_0 = 0;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        var9 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            hga.a(true, param0.a("", (byte) 124, "roomdata.csv"));
            var10 = cm.field_a;
            var2_array = var10;
            var3 = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (var3 >= var10.length) {
                    break L3;
                  } else {
                    var4 = var10[var3];
                    var5 = var4.field_c;
                    stackOut_3_0 = 0;
                    stackIn_12_0 = stackOut_3_0;
                    stackIn_4_0 = stackOut_3_0;
                    if (var9 != 0) {
                      break L2;
                    } else {
                      var6 = stackIn_4_0;
                      L4: while (true) {
                        L5: {
                          L6: {
                            if (var6 >= var5.length) {
                              break L6;
                            } else {
                              var7 = var5[var6];
                              bt.field_b = bt.field_b + 1;
                              var14 = param0.a(var7.field_g, (byte) 127, var7.field_b);
                              var7.field_c = new kh(var14);
                              var7.field_c.h((byte) -38);
                              var7.field_e = m.a(-1, var7.field_c);
                              var7.field_c.i((byte) 98);
                              var6++;
                              if (var9 != 0) {
                                break L5;
                              } else {
                                if (var9 == 0) {
                                  continue L4;
                                } else {
                                  break L6;
                                }
                              }
                            }
                          }
                          lva.a(var4.field_c, 0, -1 + var4.field_c.length, -1);
                          var3++;
                          break L5;
                        }
                        if (var9 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                }
                stackOut_11_0 = param1;
                stackIn_12_0 = stackOut_11_0;
                break L2;
              }
              L7: {
                if (stackIn_12_0 == 17572) {
                  break L7;
                } else {
                  field_a = 31;
                  break L7;
                }
              }
              du.field_e = true;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var2 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) (var2);
            stackOut_16_1 = new StringBuilder().append("gda.QA(");
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param0 == null) {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L8;
            } else {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L8;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ',' + param1 + ')');
        }
    }

    final static boolean b(int param0, int param1, int param2) {
        int var3 = 0;
        boolean stackIn_1_0 = false;
        boolean stackIn_2_0 = false;
        boolean stackIn_3_0 = false;
        int stackIn_3_1 = 0;
        int stackIn_6_0 = 0;
        boolean stackOut_0_0 = false;
        boolean stackOut_2_0 = false;
        int stackOut_2_1 = 0;
        boolean stackOut_1_0 = false;
        int stackOut_1_1 = 0;
        int stackOut_4_0 = 0;
        L0: {
          var3 = -120 % ((param0 - 65) / 42);
          stackOut_0_0 = mpa.a(false, param1, param2);
          stackIn_2_0 = stackOut_0_0;
          stackIn_1_0 = stackOut_0_0;
          if ((param2 & 262144) == 0) {
            stackOut_2_0 = stackIn_2_0;
            stackOut_2_1 = 0;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            break L0;
          } else {
            stackOut_1_0 = stackIn_1_0;
            stackOut_1_1 = 1;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            break L0;
          }
        }
        if (stackIn_3_0 | stackIn_3_1 == 0) {
          if (vua.e(param2, param1, 13650)) {
            return true;
          } else {
            return false;
          }
        } else {
          stackOut_4_0 = 1;
          stackIn_6_0 = stackOut_4_0;
          return stackIn_6_0 != 0;
        }
    }

    abstract void a();

    abstract void c(int param0);

    final static roa a(boolean param0) {
        roa var1 = null;
        var1 = new roa();
        var1.field_f = new up(0, 5);
        if (!param0) {
          return (roa) null;
        } else {
          var1.field_f.b(1, 9);
          var1.field_d = 0;
          var1.field_h = 25;
          var1.field_p = -1;
          var1.field_k = 150;
          var1.field_o = 25;
          var1.field_n = 655360;
          var1.field_b = 1;
          return var1;
        }
    }

    static {
    }
}
