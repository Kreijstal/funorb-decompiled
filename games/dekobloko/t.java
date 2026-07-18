/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class t extends bl {
    private int field_db;
    private int field_gb;
    private int field_eb;
    static String field_bb;
    static String field_ib;
    private int field_jb;
    static String[] field_cb;
    private int field_hb;
    private int field_fb;

    boolean h(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        if (((t) this).field_hb > 0) {
            var2 = ((t) this).field_jb;
            var3 = ((t) this).field_gb;
            int fieldTemp$0 = ((t) this).field_eb + 1;
            ((t) this).field_eb = ((t) this).field_eb + 1;
            if (((t) this).field_hb <= fieldTemp$0) {
                ((t) this).field_hb = 0;
                ((t) this).j((byte) -52);
            } else {
                var4 = (-((t) this).field_eb + 2 * ((t) this).field_hb) * ((t) this).field_eb;
                var5 = ((t) this).field_hb * ((t) this).field_hb;
                var2 = var4 * (((t) this).field_jb + -((t) this).field_db) / var5 + ((t) this).field_db;
                var3 = ((t) this).field_fb + var4 * (-((t) this).field_fb + ((t) this).field_gb) / var5;
            }
            ((t) this).a(110, var2, var3);
        }
        return super.h((byte) 90);
    }

    final void b(int param0, int param1, int param2, int param3) {
        if (param3 != 194) {
            ((t) this).b(35, 121, -128, 19);
        }
        if (param1 <= 0) {
            ((t) this).a(121, param0, param2);
            return;
        }
        ((t) this).field_hb = param1;
        ((t) this).field_gb = param2;
        ((t) this).field_db = ((t) this).field_t;
        ((t) this).field_fb = ((t) this).field_y;
        ((t) this).field_jb = param0;
        ((t) this).field_eb = 0;
    }

    final static void k(byte param0) {
        de.field_W.c((ce) (Object) new lg(), (byte) 121);
    }

    void j(int param0) {
        if (!(((t) this).field_hb > 0)) {
            return;
        }
        ((t) this).a(112, ((t) this).field_jb, ((t) this).field_gb);
        ((t) this).field_hb = 0;
        ((t) this).j((byte) -32);
        int var2 = 40 % ((param0 - -15) / 49);
    }

    final static boolean i(byte param0) {
        return hc.field_d >= 10 && ca.field_vb >= 13;
    }

    t(ka param0, int param1, int param2) {
        super(param0, param1, param2);
        ((t) this).field_eb = 0;
        ((t) this).field_hb = 0;
    }

    boolean f(byte param0) {
        ((t) this).j(38);
        return super.f((byte) 125);
    }

    void j(byte param0) {
        int var2 = -128 % ((param0 - 30) / 39);
    }

    final static void a(int param0, boolean param1) {
        uc.a(true, param1, 54);
    }

    void b(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        var16 = client.field_A ? 1 : 0;
        hk.d(6 + param2, 35 + param1, -12 + ((t) this).field_t, ((t) this).field_y - 40, 2105376, 0);
        var5 = 211;
        var4 = 35;
        var6 = 194;
        var7 = 0;
        var8 = param1;
        L0: while (true) {
          if (var4 <= var7) {
            var6 = 169;
            var4 = 22;
            var5 = 194;
            var7 = 0;
            var8 = param1 - -35;
            L1: while (true) {
              if (var7 >= var4) {
                jm.field_q.c(-90 + (param2 - -((t) this).field_t), 10 + param1);
                ng.a(c.field_m, -10 + ((t) this).field_t, param1 + 35, -1, 5 + param2);
                ng.a(g.field_O, ((t) this).field_t, param1 + (((t) this).field_y + -22), -1, param2);
                var4 = ((t) this).field_y + -79;
                var5 = 169;
                var6 = 127;
                var7 = 0;
                var8 = 57 + param1;
                L2: while (true) {
                  if (var7 >= var4) {
                    return;
                  } else {
                    var9 = var5 - -(var7 * (var6 + -var5) / var4);
                    var9 = var9 | (var9 << 16 | var9 << 8);
                    hk.a(param2, var8, 6, var9);
                    hk.a(-6 + (((t) this).field_t + param2), var8, 6, var9);
                    var8++;
                    var7++;
                    continue L2;
                  }
                }
              } else {
                var9 = (-var5 + var6) * var7 / var4 + var5;
                var9 = var9 | (var9 << 16 | var9 << 8);
                hk.a(param2, var8, 6, var9);
                hk.a(param2 + ((t) this).field_t + -6, var8, 6, var9);
                var7++;
                var8++;
                continue L1;
              }
            }
          } else {
            if (hk.field_h <= var8) {
              if (hk.field_b > var8) {
                L3: {
                  var9 = var5 - -((-var5 + var6) * var7 / var4);
                  var10 = 0;
                  var11 = ((t) this).field_t;
                  if (20 >= var7) {
                    L4: while (true) {
                      if (var10 > 20) {
                        break L3;
                      } else {
                        var12 = (20 + -var7) * (-var7 + 20) - -((-var10 + 20) * (20 + -var10));
                        if (462 >= var12) {
                          if (var12 >= 420) {
                            var13 = (-var12 + 462) * var9 / 42;
                            var13 = var13 | (var13 << 8 | var13 << 16);
                            hk.field_l[hk.field_j * var8 - -param2 - -var10] = var13;
                            var10++;
                            continue L4;
                          } else {
                            break L3;
                          }
                        } else {
                          var10++;
                          continue L4;
                        }
                      }
                    }
                  } else {
                    break L3;
                  }
                }
                L5: {
                  if (var7 <= 20) {
                    var12 = var11;
                    var11 -= 21;
                    var13 = 0;
                    L6: while (true) {
                      L7: {
                        if (20 < var13) {
                          break L7;
                        } else {
                          var14 = (-var7 + 20) * (20 + -var7) + var13 * var13;
                          if (var14 <= 462) {
                            if (420 > var14) {
                              var12 = var11 - -1;
                              var13++;
                              var11++;
                              continue L6;
                            } else {
                              var15 = (462 - var14) * var9 / 42;
                              var15 = var15 | (var15 << 8 | var15 << 16);
                              hk.field_l[param2 + var8 * hk.field_j + var11] = var15;
                              var13++;
                              var11++;
                              continue L6;
                            }
                          } else {
                            break L7;
                          }
                        }
                      }
                      var11 = var12;
                      break L5;
                    }
                  } else {
                    break L5;
                  }
                }
                var9 = var9 | (var9 << 16 | var9 << 8);
                hk.a(var10 + param2, var8, -var10 + var11, var9);
                var7++;
                var8++;
                continue L0;
              } else {
                var7++;
                var8++;
                continue L0;
              }
            } else {
              var7++;
              var8++;
              continue L0;
            }
          }
        }
    }

    final static pi[] a(String param0, ji param1, boolean param2, String param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        pi[] stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        pi[] stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            var4_int = param1.b(-1, param3);
            var5 = param1.a(var4_int, 13030, param0);
            stackOut_2_0 = on.a(var5, (byte) 37, var4_int, param1);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var4;
            stackOut_4_1 = new StringBuilder().append("t.MA(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L1;
            }
          }
          L2: {
            stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          L3: {
            stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',').append(false).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param3 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          throw dh.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ')');
        }
        return stackIn_3_0;
    }

    public static void l(byte param0) {
        field_bb = null;
        field_ib = null;
        field_cb = null;
    }

    final static hm k(int param0) {
        try {
            Throwable var1 = null;
            hm stackIn_2_0 = null;
            Throwable decompiledCaughtException = null;
            hm stackOut_1_0 = null;
            try {
              L0: {
                stackOut_1_0 = (hm) Class.forName("ag").newInstance();
                stackIn_2_0 = stackOut_1_0;
                break L0;
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var1 = decompiledCaughtException;
              return null;
            }
            return stackIn_2_0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_bb = "Matching Score: ";
        field_ib = "Animals";
        field_cb = new String[255];
    }
}
