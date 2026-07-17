/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class k extends rqa {
    static String field_p;
    static int field_r;
    static String field_q;
    static String field_o;

    public static void e(byte param0) {
        int var1 = 67 / ((36 - param0) / 39);
        field_q = null;
        field_o = null;
        field_p = null;
    }

    final static int a(byte param0, int param1, byte[] param2, int param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        var6 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              var4_int = -1;
              if (param0 == -69) {
                break L1;
              } else {
                k.e((byte) -96);
                break L1;
              }
            }
            var5 = param3;
            L2: while (true) {
              if (param1 <= var5) {
                var4_int = ~var4_int;
                stackOut_6_0 = var4_int;
                stackIn_7_0 = stackOut_6_0;
                break L0;
              } else {
                var4_int = var4_int >>> 8 ^ coa.field_d[255 & (var4_int ^ param2[var5])];
                var5++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var4;
            stackOut_8_1 = new StringBuilder().append("k.D(").append(param0).append(44).append(param1).append(44);
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param2 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 44 + param3 + 41);
        }
        return stackIn_7_0;
    }

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        nc stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        nc stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param1 <= -119) {
                break L1;
              } else {
                field_o = null;
                break L1;
              }
            }
            stackOut_2_0 = new nc(oq.field_c);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("k.A(");
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
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + param1 + 41);
        }
        return stackIn_3_0;
    }

    k(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static void a(int param0, boolean param1, String param2, boolean param3, byte param4) {
        RuntimeException var5 = null;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        String var11 = null;
        String stackIn_4_0 = null;
        String stackIn_24_0 = null;
        int stackIn_24_1 = 0;
        String stackIn_25_0 = null;
        int stackIn_25_1 = 0;
        String stackIn_26_0 = null;
        int stackIn_26_1 = 0;
        int stackIn_26_2 = 0;
        int stackIn_36_0 = 0;
        int stackIn_37_0 = 0;
        int stackIn_38_0 = 0;
        int stackIn_38_1 = 0;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        String stackIn_44_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_3_0 = null;
        String stackOut_2_0 = null;
        int stackOut_35_0 = 0;
        int stackOut_37_0 = 0;
        int stackOut_37_1 = 0;
        int stackOut_36_0 = 0;
        int stackOut_36_1 = 0;
        String stackOut_23_0 = null;
        int stackOut_23_1 = 0;
        String stackOut_25_0 = null;
        int stackOut_25_1 = 0;
        int stackOut_25_2 = 0;
        String stackOut_24_0 = null;
        int stackOut_24_1 = 0;
        int stackOut_24_2 = 0;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        String stackOut_43_2 = null;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        String stackOut_42_2 = null;
        var10 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              wia.field_a = true;
              ft.field_t = param0;
              var11 = param2;
              if (param1) {
                stackOut_3_0 = era.field_q;
                stackIn_4_0 = stackOut_3_0;
                break L1;
              } else {
                stackOut_2_0 = kg.field_s;
                stackIn_4_0 = stackOut_2_0;
                break L1;
              }
            }
            L2: {
              var6 = stackIn_4_0;
              if (ft.field_t != 0) {
                if (ft.field_t != 1) {
                  throw new IllegalArgumentException();
                } else {
                  var7 = wva.a(480, rea.field_e, 0, var11, oja.field_p);
                  var8 = var7 + 2;
                  aka.field_o = new int[var8];
                  db.field_o = new String[var8];
                  var9 = 0;
                  L3: while (true) {
                    if (var9 >= var8) {
                      kc.field_e = new int[1];
                      var9 = 0;
                      L4: while (true) {
                        if (var9 >= var7) {
                          db.field_o[-2 + var8] = "";
                          db.field_o[-1 + var8] = wm.field_b;
                          aka.field_o[-1 + var8] = 0;
                          kc.field_e[0] = 2;
                          break L2;
                        } else {
                          db.field_o[var9] = rea.field_e[var9];
                          var9++;
                          continue L4;
                        }
                      }
                    } else {
                      aka.field_o[var9] = -1;
                      var9++;
                      continue L3;
                    }
                  }
                }
              } else {
                var7 = wva.a(480, rea.field_e, 0, var11, oja.field_p);
                var8 = 3 + var7;
                aka.field_o = new int[var8];
                db.field_o = new String[var8];
                var9 = 0;
                L5: while (true) {
                  if (var8 <= var9) {
                    kc.field_e = new int[2];
                    var9 = 0;
                    L6: while (true) {
                      if (var9 >= var7) {
                        db.field_o[-3 + var8] = "";
                        db.field_o[var8 + -2] = var6;
                        aka.field_o[var8 + -2] = 0;
                        kc.field_e[0] = 1;
                        db.field_o[var8 + -1] = wm.field_b;
                        aka.field_o[-1 + var8] = 1;
                        kc.field_e[1] = 2;
                        break L2;
                      } else {
                        db.field_o[var9] = rea.field_e[var9];
                        var9++;
                        continue L6;
                      }
                    }
                  } else {
                    aka.field_o[var9] = -1;
                    var9++;
                    continue L5;
                  }
                }
              }
            }
            ei.field_c.field_c = kc.field_e.length;
            var7 = 0;
            var8 = 0;
            L7: while (true) {
              if (var8 >= db.field_o.length) {
                mtb.field_p = -(var7 >> 1) + var7 + alb.field_b;
                mua.field_d = alb.field_b + -(var7 >> 1);
                ot.field_b = (hwa.field_q - -pva.field_g << 1) * ei.field_c.field_c;
                var8 = 0;
                L8: while (true) {
                  if (db.field_o.length <= var8) {
                    nl.field_m = -(ot.field_b >> 1) + pba.field_r;
                    ei.field_c.a(param3, -1, 0, rkb.a(uia.field_b, 3841, kc.field_b));
                    break L0;
                  } else {
                    L9: {
                      stackOut_35_0 = ot.field_b;
                      stackIn_37_0 = stackOut_35_0;
                      stackIn_36_0 = stackOut_35_0;
                      if (aka.field_o[var8] >= 0) {
                        stackOut_37_0 = stackIn_37_0;
                        stackOut_37_1 = tba.field_o;
                        stackIn_38_0 = stackOut_37_0;
                        stackIn_38_1 = stackOut_37_1;
                        break L9;
                      } else {
                        stackOut_36_0 = stackIn_36_0;
                        stackOut_36_1 = whb.field_a;
                        stackIn_38_0 = stackOut_36_0;
                        stackIn_38_1 = stackOut_36_1;
                        break L9;
                      }
                    }
                    ot.field_b = stackIn_38_0 + stackIn_38_1;
                    var8++;
                    continue L8;
                  }
                }
              } else {
                L10: {
                  stackOut_23_0 = db.field_o[var8];
                  stackOut_23_1 = -42;
                  stackIn_25_0 = stackOut_23_0;
                  stackIn_25_1 = stackOut_23_1;
                  stackIn_24_0 = stackOut_23_0;
                  stackIn_24_1 = stackOut_23_1;
                  if (aka.field_o[var8] < 0) {
                    stackOut_25_0 = (String) (Object) stackIn_25_0;
                    stackOut_25_1 = stackIn_25_1;
                    stackOut_25_2 = 0;
                    stackIn_26_0 = stackOut_25_0;
                    stackIn_26_1 = stackOut_25_1;
                    stackIn_26_2 = stackOut_25_2;
                    break L10;
                  } else {
                    stackOut_24_0 = (String) (Object) stackIn_24_0;
                    stackOut_24_1 = stackIn_24_1;
                    stackOut_24_2 = 1;
                    stackIn_26_0 = stackOut_24_0;
                    stackIn_26_1 = stackOut_24_1;
                    stackIn_26_2 = stackOut_24_2;
                    break L10;
                  }
                }
                L11: {
                  var9 = lsa.a(stackIn_26_0, stackIn_26_1, stackIn_26_2 != 0);
                  if (aka.field_o[var8] != -1) {
                    var9 = var9 + ih.field_e * 2;
                    break L11;
                  } else {
                    break L11;
                  }
                }
                L12: {
                  if (var7 >= var9) {
                    break L12;
                  } else {
                    break L12;
                  }
                }
                var8++;
                continue L7;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L13: {
            var5 = decompiledCaughtException;
            stackOut_41_0 = (RuntimeException) var5;
            stackOut_41_1 = new StringBuilder().append("k.C(").append(param0).append(44).append(param1).append(44);
            stackIn_43_0 = stackOut_41_0;
            stackIn_43_1 = stackOut_41_1;
            stackIn_42_0 = stackOut_41_0;
            stackIn_42_1 = stackOut_41_1;
            if (param2 == null) {
              stackOut_43_0 = (RuntimeException) (Object) stackIn_43_0;
              stackOut_43_1 = (StringBuilder) (Object) stackIn_43_1;
              stackOut_43_2 = "null";
              stackIn_44_0 = stackOut_43_0;
              stackIn_44_1 = stackOut_43_1;
              stackIn_44_2 = stackOut_43_2;
              break L13;
            } else {
              stackOut_42_0 = (RuntimeException) (Object) stackIn_42_0;
              stackOut_42_1 = (StringBuilder) (Object) stackIn_42_1;
              stackOut_42_2 = "{...}";
              stackIn_44_0 = stackOut_42_0;
              stackIn_44_1 = stackOut_42_1;
              stackIn_44_2 = stackOut_42_2;
              break L13;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_44_0, stackIn_44_2 + 44 + param3 + 44 + 25 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = "Rating";
        field_r = 250;
        field_q = "This game option is not available in rated games.";
        field_o = "Capture and Hold";
    }
}
