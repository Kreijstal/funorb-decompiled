/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class bp extends un {
    static cj field_u;
    static int field_r;
    static ja field_s;
    static String[] field_v;
    static cj field_w;
    static String field_t;
    static boolean field_q;

    final re a(boolean param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        CharSequence var5 = null;
        re stackIn_2_0 = null;
        re stackIn_7_0 = null;
        Object stackIn_10_0 = null;
        re stackIn_12_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        re stackOut_11_0 = null;
        Object stackOut_9_0 = null;
        re stackOut_6_0 = null;
        re stackOut_1_0 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            var4 = (CharSequence) (Object) param1;
            if (ti.a((byte) 57, var4)) {
              L1: {
                var5 = (CharSequence) (Object) param1;
                var3_int = md.a(var5, -9159);
                if (var3_int <= 0) {
                  break L1;
                } else {
                  if (var3_int <= 130) {
                    if (!param0) {
                      stackOut_11_0 = db.field_b;
                      stackIn_12_0 = stackOut_11_0;
                      break L0;
                    } else {
                      stackOut_9_0 = null;
                      stackIn_10_0 = stackOut_9_0;
                      return (re) (Object) stackIn_10_0;
                    }
                  } else {
                    break L1;
                  }
                }
              }
              stackOut_6_0 = jq.field_b;
              stackIn_7_0 = stackOut_6_0;
              return stackIn_7_0;
            } else {
              stackOut_1_0 = jq.field_b;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var3;
            stackOut_13_1 = new StringBuilder().append("bp.F(").append(param0).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param1 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L2;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L2;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ')');
        }
        return stackIn_12_0;
    }

    final static void a(kj param0, boolean param1, int param2) {
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        ga var7 = null;
        ga var8 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        var6 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            var7 = ma.field_a;
            var8 = var7;
            var8.b((byte) -35, param2);
            var8.field_j = var8.field_j + 1;
            var4 = var8.field_j;
            var8.a(108, 1);
            var8.a(param0.field_i, (byte) -95);
            var8.a(param0.field_v, (byte) -76);
            var8.a(param0.field_t, (byte) -66);
            var8.b(-116, param0.field_w);
            var8.b(-99, param0.field_x);
            var8.b(122, param0.field_l);
            var8.b(-128, param0.field_k);
            var8.a(-83, param0.field_y.length);
            var5 = 0;
            L1: while (true) {
              if (var5 >= param0.field_y.length) {
                int discarded$1 = var8.f(var4, 118);
                var8.e(77, var8.field_j + -var4);
                break L0;
              } else {
                var7.b(52, param0.field_y[var5]);
                var5++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var3;
            stackOut_6_1 = new StringBuilder().append("bp.B(");
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ',' + true + ',' + param2 + ')');
        }
    }

    bp(pm param0) {
        super(param0);
    }

    public static void h() {
        field_s = null;
        field_t = null;
        field_v = null;
        field_w = null;
        field_u = null;
    }

    final static void a(int param0, k param1, go param2, int param3) {
        try {
            RuntimeException var4 = null;
            int var5 = 0;
            ClassNotFoundException var6 = null;
            SecurityException var6_ref = null;
            NullPointerException var6_ref2 = null;
            Exception var6_ref3 = null;
            Throwable var6_ref4 = null;
            int var6_int = 0;
            String var7 = null;
            String var8 = null;
            int var9 = 0;
            String[] var10 = null;
            int var11_int = 0;
            byte[][] var11 = null;
            int var12_int = 0;
            Class[] var12 = null;
            int var13 = 0;
            int var14 = 0;
            Object var15 = null;
            String var16 = null;
            String var17 = null;
            int var18 = 0;
            Object var19 = null;
            byte[][] var20 = null;
            String var21 = null;
            String var22 = null;
            byte[][] var23 = null;
            byte[][] var24 = null;
            byte[][] var25 = null;
            RuntimeException stackIn_37_0 = null;
            StringBuilder stackIn_37_1 = null;
            RuntimeException stackIn_38_0 = null;
            StringBuilder stackIn_38_1 = null;
            RuntimeException stackIn_39_0 = null;
            StringBuilder stackIn_39_1 = null;
            String stackIn_39_2 = null;
            RuntimeException stackIn_40_0 = null;
            StringBuilder stackIn_40_1 = null;
            RuntimeException stackIn_41_0 = null;
            StringBuilder stackIn_41_1 = null;
            RuntimeException stackIn_42_0 = null;
            StringBuilder stackIn_42_1 = null;
            String stackIn_42_2 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_36_0 = null;
            StringBuilder stackOut_36_1 = null;
            RuntimeException stackOut_38_0 = null;
            StringBuilder stackOut_38_1 = null;
            String stackOut_38_2 = null;
            RuntimeException stackOut_37_0 = null;
            StringBuilder stackOut_37_1 = null;
            String stackOut_37_2 = null;
            RuntimeException stackOut_39_0 = null;
            StringBuilder stackOut_39_1 = null;
            RuntimeException stackOut_41_0 = null;
            StringBuilder stackOut_41_1 = null;
            String stackOut_41_2 = null;
            RuntimeException stackOut_40_0 = null;
            StringBuilder stackOut_40_1 = null;
            String stackOut_40_2 = null;
            var14 = ZombieDawnMulti.field_E ? 1 : 0;
            try {
              L0: {
                var19 = (Object) (Object) new lp();
                ((lp) var19).field_n = param1.g(31365);
                ((lp) var19).field_r = param1.i(param3 + -1478490340);
                ((lp) var19).field_m = new di[((lp) var19).field_n];
                ((lp) var19).field_o = new byte[((lp) var19).field_n][][];
                ((lp) var19).field_g = new int[((lp) var19).field_n];
                ((lp) var19).field_q = new int[((lp) var19).field_n];
                ((lp) var19).field_l = new di[((lp) var19).field_n];
                ((lp) var19).field_i = new int[((lp) var19).field_n];
                var5 = 0;
                L1: while (true) {
                  if (((lp) var19).field_n <= var5) {
                    L2: {
                      we.field_k.a((br) var19, false);
                      if (param3 == -4) {
                        break L2;
                      } else {
                        var15 = null;
                        bp.a(-51, (k) null, (go) null, 59);
                        break L2;
                      }
                    }
                    break L0;
                  } else {
                    try {
                      L3: {
                        L4: {
                          L5: {
                            var6_int = param1.g(31365);
                            if (var6_int == 0) {
                              break L5;
                            } else {
                              if (var6_int == 1) {
                                break L5;
                              } else {
                                if (var6_int != 2) {
                                  if (var6_int == 3) {
                                    var21 = param1.f((byte) -32);
                                    var22 = param1.f((byte) -55);
                                    var9 = param1.g(31365);
                                    var10 = new String[var9];
                                    var11_int = 0;
                                    L6: while (true) {
                                      if (var9 <= var11_int) {
                                        L7: {
                                          var25 = new byte[var9][];
                                          var24 = var25;
                                          var23 = var24;
                                          var20 = var23;
                                          var11 = var20;
                                          if (var6_int == 3) {
                                            var12_int = 0;
                                            L8: while (true) {
                                              if (var9 <= var12_int) {
                                                break L7;
                                              } else {
                                                var13 = param1.i(-1478490344);
                                                var11[var12_int] = new byte[var13];
                                                param1.a(0, param3 + -6347, var13, var25[var12_int]);
                                                var12_int++;
                                                continue L8;
                                              }
                                            }
                                          } else {
                                            break L7;
                                          }
                                        }
                                        ((lp) var19).field_i[var5] = var6_int;
                                        var12 = new Class[var9];
                                        var18 = 0;
                                        var13 = var18;
                                        L9: while (true) {
                                          if (var9 <= var18) {
                                            ((lp) var19).field_l[var5] = param2.a(var12, false, mq.a(var21, (byte) -123), var22);
                                            ((lp) var19).field_o[var5] = var25;
                                            break L4;
                                          } else {
                                            var12[var18] = mq.a(var10[var18], (byte) -119);
                                            var18++;
                                            continue L9;
                                          }
                                        }
                                      } else {
                                        var10[var11_int] = param1.f((byte) -8);
                                        var11_int++;
                                        continue L6;
                                      }
                                    }
                                  } else {
                                    L10: {
                                      if (var6_int != 4) {
                                        break L10;
                                      } else {
                                        break L10;
                                      }
                                    }
                                    var5++;
                                    decompiledRegionSelector0 = 1;
                                    break L3;
                                  }
                                } else {
                                  break L5;
                                }
                              }
                            }
                          }
                          L11: {
                            var17 = param1.f((byte) -43);
                            var7 = var17;
                            var16 = param1.f((byte) -61);
                            var8 = var16;
                            var9 = 0;
                            if (var6_int != 1) {
                              break L11;
                            } else {
                              var9 = param1.i(param3 + -1478490340);
                              break L11;
                            }
                          }
                          ((lp) var19).field_i[var5] = var6_int;
                          ((lp) var19).field_q[var5] = var9;
                          ((lp) var19).field_m[var5] = param2.a((byte) -89, var16, mq.a(var17, (byte) -29));
                          break L4;
                        }
                        decompiledRegionSelector0 = 0;
                        break L3;
                      }
                    } catch (java.lang.ClassNotFoundException decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L12: {
                        var6 = (ClassNotFoundException) (Object) decompiledCaughtException;
                        ((lp) var19).field_g[var5] = -1;
                        decompiledRegionSelector0 = 0;
                        break L12;
                      }
                    } catch (java.lang.Exception decompiledCaughtParameter3) {
                      decompiledCaughtException = decompiledCaughtParameter3;
                      L15: {
                        var6_ref3 = (Exception) (Object) decompiledCaughtException;
                        ((lp) var19).field_g[var5] = -4;
                        decompiledRegionSelector0 = 0;
                        break L15;
                      }
                    } catch (java.lang.Throwable decompiledCaughtParameter4) {
                      decompiledCaughtException = decompiledCaughtParameter4;
                      L16: {
                        var6_ref4 = decompiledCaughtException;
                        ((lp) var19).field_g[var5] = -5;
                        decompiledRegionSelector0 = 0;
                        break L16;
                      }
                    }
                    if (decompiledRegionSelector0 == 0) {
                      var5++;
                      continue L1;
                    } else {
                      continue L1;
                    }
                  }
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter5) {
              decompiledCaughtException = decompiledCaughtParameter5;
              L17: {
                var4 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_36_0 = (RuntimeException) var4;
                stackOut_36_1 = new StringBuilder().append("bp.D(").append(param0).append(',');
                stackIn_38_0 = stackOut_36_0;
                stackIn_38_1 = stackOut_36_1;
                stackIn_37_0 = stackOut_36_0;
                stackIn_37_1 = stackOut_36_1;
                if (param1 == null) {
                  stackOut_38_0 = (RuntimeException) (Object) stackIn_38_0;
                  stackOut_38_1 = (StringBuilder) (Object) stackIn_38_1;
                  stackOut_38_2 = "null";
                  stackIn_39_0 = stackOut_38_0;
                  stackIn_39_1 = stackOut_38_1;
                  stackIn_39_2 = stackOut_38_2;
                  break L17;
                } else {
                  stackOut_37_0 = (RuntimeException) (Object) stackIn_37_0;
                  stackOut_37_1 = (StringBuilder) (Object) stackIn_37_1;
                  stackOut_37_2 = "{...}";
                  stackIn_39_0 = stackOut_37_0;
                  stackIn_39_1 = stackOut_37_1;
                  stackIn_39_2 = stackOut_37_2;
                  break L17;
                }
              }
              L18: {
                stackOut_39_0 = (RuntimeException) (Object) stackIn_39_0;
                stackOut_39_1 = ((StringBuilder) (Object) stackIn_39_1).append(stackIn_39_2).append(',');
                stackIn_41_0 = stackOut_39_0;
                stackIn_41_1 = stackOut_39_1;
                stackIn_40_0 = stackOut_39_0;
                stackIn_40_1 = stackOut_39_1;
                if (param2 == null) {
                  stackOut_41_0 = (RuntimeException) (Object) stackIn_41_0;
                  stackOut_41_1 = (StringBuilder) (Object) stackIn_41_1;
                  stackOut_41_2 = "null";
                  stackIn_42_0 = stackOut_41_0;
                  stackIn_42_1 = stackOut_41_1;
                  stackIn_42_2 = stackOut_41_2;
                  break L18;
                } else {
                  stackOut_40_0 = (RuntimeException) (Object) stackIn_40_0;
                  stackOut_40_1 = (StringBuilder) (Object) stackIn_40_1;
                  stackOut_40_2 = "{...}";
                  stackIn_42_0 = stackOut_40_0;
                  stackIn_42_1 = stackOut_40_1;
                  stackIn_42_2 = stackOut_40_2;
                  break L18;
                }
              }
              throw fa.a((Throwable) (Object) stackIn_42_0, stackIn_42_2 + ',' + param3 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final String a(String param0, int param1) {
        RuntimeException var3 = null;
        String stackIn_3_0 = null;
        Object stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_2_0 = null;
        Object stackOut_6_0 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            if (((bp) this).a(false, param0) == jq.field_b) {
              stackOut_2_0 = ob.field_z;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            } else {
              if (param1 != -1276425040) {
                stackOut_6_0 = null;
                stackIn_7_0 = stackOut_6_0;
                break L0;
              } else {
                return null;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var3;
            stackOut_9_1 = new StringBuilder().append("bp.C(");
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L1;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L1;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ',' + param1 + ')');
        }
        return (String) (Object) stackIn_7_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_v = new String[]{"Waiting for text", "Warte auf Text", "En attente du texte", "Aguardando textos", "Op tekst wachten", "Esperando a texto"};
        field_u = new cj();
    }
}
