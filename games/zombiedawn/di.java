/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class di extends hp implements hh {
    private an field_N;
    private an field_F;
    static rh field_L;
    private an field_H;
    static int field_O;
    static int field_M;
    static boolean field_K;
    static boolean field_J;
    static String field_I;

    public static void b() {
        field_I = null;
        field_L = null;
    }

    final static void a(de param0, int param1, int param2, ec param3) {
        try {
            RuntimeException var4 = null;
            int var5 = 0;
            ClassNotFoundException var6 = null;
            SecurityException var6_ref = null;
            NullPointerException var6_ref2 = null;
            Exception var6_ref3 = null;
            Throwable var6_ref4 = null;
            int var6_int = 0;
            int var9 = 0;
            String[] var10 = null;
            int var11_int = 0;
            byte[][] var11 = null;
            int var12_int = 0;
            Class[] var12 = null;
            int var13 = 0;
            int var14 = 0;
            String var15 = null;
            String var16 = null;
            int var17 = 0;
            Object var18 = null;
            byte[][] var19 = null;
            String var20 = null;
            String var21 = null;
            byte[][] var22 = null;
            byte[][] var23 = null;
            byte[][] var24 = null;
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
            var14 = ZombieDawn.field_J;
            try {
              L0: {
                var18 = (Object) (Object) new n();
                ((n) var18).field_l = param0.d((byte) -118);
                ((n) var18).field_o = param0.c(102);
                ((n) var18).field_i = new byte[((n) var18).field_l][][];
                ((n) var18).field_q = new int[((n) var18).field_l];
                ((n) var18).field_m = new op[((n) var18).field_l];
                ((n) var18).field_n = new op[((n) var18).field_l];
                ((n) var18).field_j = new int[((n) var18).field_l];
                ((n) var18).field_h = new int[((n) var18).field_l];
                var5 = 0;
                L1: while (true) {
                  if (((n) var18).field_l <= var5) {
                    dj.field_l.a(0, (le) var18);
                    break L0;
                  } else {
                    try {
                      L2: {
                        L3: {
                          L4: {
                            var6_int = param0.d((byte) -124);
                            if (var6_int == 0) {
                              break L4;
                            } else {
                              if (var6_int == 1) {
                                break L4;
                              } else {
                                if (var6_int == 2) {
                                  break L4;
                                } else {
                                  L5: {
                                    if (var6_int == 3) {
                                      break L5;
                                    } else {
                                      if (var6_int == 4) {
                                        break L5;
                                      } else {
                                        break L3;
                                      }
                                    }
                                  }
                                  var20 = param0.a(true);
                                  var21 = param0.a(true);
                                  var9 = param0.d((byte) -122);
                                  var10 = new String[var9];
                                  var11_int = 0;
                                  L6: while (true) {
                                    if (~var9 >= ~var11_int) {
                                      L7: {
                                        var24 = new byte[var9][];
                                        var23 = var24;
                                        var22 = var23;
                                        var19 = var22;
                                        var11 = var19;
                                        if (3 == var6_int) {
                                          var12_int = 0;
                                          L8: while (true) {
                                            if (var12_int >= var9) {
                                              break L7;
                                            } else {
                                              var13 = param0.c(100);
                                              var11[var12_int] = new byte[var13];
                                              param0.a(var13, 0, var24[var12_int], 11240);
                                              var12_int++;
                                              continue L8;
                                            }
                                          }
                                        } else {
                                          break L7;
                                        }
                                      }
                                      ((n) var18).field_h[var5] = var6_int;
                                      var12 = new Class[var9];
                                      var17 = 0;
                                      var13 = var17;
                                      L9: while (true) {
                                        if (~var9 >= ~var17) {
                                          ((n) var18).field_m[var5] = param3.a(var12, tm.b((byte) 89, var20), rd.b(30, 225), var21);
                                          ((n) var18).field_i[var5] = var24;
                                          break L3;
                                        } else {
                                          var12[var17] = tm.b((byte) 72, var10[var17]);
                                          var17++;
                                          continue L9;
                                        }
                                      }
                                    } else {
                                      var10[var11_int] = param0.a(true);
                                      var11_int++;
                                      continue L6;
                                    }
                                  }
                                }
                              }
                            }
                          }
                          L10: {
                            var16 = param0.a(true);
                            var15 = param0.a(true);
                            var9 = 0;
                            if (var6_int == 1) {
                              var9 = param0.c(101);
                              break L10;
                            } else {
                              break L10;
                            }
                          }
                          ((n) var18).field_h[var5] = var6_int;
                          ((n) var18).field_j[var5] = var9;
                          ((n) var18).field_n[var5] = param3.a((byte) -113, var15, tm.b((byte) 70, var16));
                          break L3;
                        }
                        break L2;
                      }
                    } catch (java.lang.ClassNotFoundException decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L11: {
                        var6 = (ClassNotFoundException) (Object) decompiledCaughtException;
                        ((n) var18).field_q[var5] = -1;
                        break L11;
                      }
                    } catch (java.lang.Exception decompiledCaughtParameter3) {
                      decompiledCaughtException = decompiledCaughtParameter3;
                      L14: {
                        var6_ref3 = (Exception) (Object) decompiledCaughtException;
                        ((n) var18).field_q[var5] = -4;
                        break L14;
                      }
                    } catch (java.lang.Throwable decompiledCaughtParameter4) {
                      decompiledCaughtException = decompiledCaughtParameter4;
                      L15: {
                        var6_ref4 = decompiledCaughtException;
                        ((n) var18).field_q[var5] = -5;
                        break L15;
                      }
                    }
                    var5++;
                    continue L1;
                  }
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter5) {
              decompiledCaughtException = decompiledCaughtParameter5;
              L16: {
                var4 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_36_0 = (RuntimeException) var4;
                stackOut_36_1 = new StringBuilder().append("di.G(");
                stackIn_38_0 = stackOut_36_0;
                stackIn_38_1 = stackOut_36_1;
                stackIn_37_0 = stackOut_36_0;
                stackIn_37_1 = stackOut_36_1;
                if (param0 == null) {
                  stackOut_38_0 = (RuntimeException) (Object) stackIn_38_0;
                  stackOut_38_1 = (StringBuilder) (Object) stackIn_38_1;
                  stackOut_38_2 = "null";
                  stackIn_39_0 = stackOut_38_0;
                  stackIn_39_1 = stackOut_38_1;
                  stackIn_39_2 = stackOut_38_2;
                  break L16;
                } else {
                  stackOut_37_0 = (RuntimeException) (Object) stackIn_37_0;
                  stackOut_37_1 = (StringBuilder) (Object) stackIn_37_1;
                  stackOut_37_2 = "{...}";
                  stackIn_39_0 = stackOut_37_0;
                  stackIn_39_1 = stackOut_37_1;
                  stackIn_39_2 = stackOut_37_2;
                  break L16;
                }
              }
              L17: {
                stackOut_39_0 = (RuntimeException) (Object) stackIn_39_0;
                stackOut_39_1 = ((StringBuilder) (Object) stackIn_39_1).append(stackIn_39_2).append(44).append(30).append(44).append(param2).append(44);
                stackIn_41_0 = stackOut_39_0;
                stackIn_41_1 = stackOut_39_1;
                stackIn_40_0 = stackOut_39_0;
                stackIn_40_1 = stackOut_39_1;
                if (param3 == null) {
                  stackOut_41_0 = (RuntimeException) (Object) stackIn_41_0;
                  stackOut_41_1 = (StringBuilder) (Object) stackIn_41_1;
                  stackOut_41_2 = "null";
                  stackIn_42_0 = stackOut_41_0;
                  stackIn_42_1 = stackOut_41_1;
                  stackIn_42_2 = stackOut_41_2;
                  break L17;
                } else {
                  stackOut_40_0 = (RuntimeException) (Object) stackIn_40_0;
                  stackOut_40_1 = (StringBuilder) (Object) stackIn_40_1;
                  stackOut_40_2 = "{...}";
                  stackIn_42_0 = stackOut_40_0;
                  stackIn_42_1 = stackOut_40_1;
                  stackIn_42_2 = stackOut_40_2;
                  break L17;
                }
              }
              throw sh.a((Throwable) (Object) stackIn_42_0, stackIn_42_2 + 41);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(int param0, int param1, int param2, byte param3, int param4) {
        fa.field_p = param0;
        ma.field_k = param4;
        pf.field_g = param1;
        mh.field_G = param2;
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var5 = ((di) this).field_k + param2;
        int var6 = ((di) this).field_j - -param0;
        int discarded$0 = ia.field_e.a(tg.field_b, 20 + var5, 20 + var6, ((di) this).field_i - 40, ((di) this).field_n + -50, 16777215, -1, 1, 0, ia.field_e.field_I);
        super.a(param0, param1, param2, param3 + param3);
    }

    public final void a(int param0, int param1, an param2, int param3, int param4) {
        RuntimeException var6 = null;
        int var7 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        var7 = ZombieDawn.field_J;
        try {
          L0: {
            if (param1 == -6) {
              L1: {
                if (((di) this).field_H == param2) {
                  dj.a(109);
                  break L1;
                } else {
                  if (((di) this).field_F == param2) {
                    vj.d(69);
                    break L1;
                  } else {
                    if (((di) this).field_N != param2) {
                      break L1;
                    } else {
                      int discarded$30 = -50;
                      jp.b();
                      break L1;
                    }
                  }
                }
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var6;
            stackOut_10_1 = new StringBuilder().append("di.K(").append(param0).append(44).append(param1).append(44);
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param2 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L2;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L2;
            }
          }
          throw sh.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    final boolean a(int param0, int param1, ga param2, char param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int stackIn_2_0 = 0;
        boolean stackIn_6_0 = false;
        boolean stackIn_10_0 = false;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_5_0 = false;
        boolean stackOut_9_0 = false;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            if (!super.a(127, param1, param2, param3)) {
              if (param1 == 98) {
                stackOut_5_0 = ((di) this).b((byte) 123, param2);
                stackIn_6_0 = stackOut_5_0;
                return stackIn_6_0;
              } else {
                var5_int = -79 % ((-83 - param0) / 32);
                if (99 == param1) {
                  stackOut_9_0 = ((di) this).a(1, param2);
                  stackIn_10_0 = stackOut_9_0;
                  break L0;
                } else {
                  return false;
                }
              }
            } else {
              stackOut_1_0 = 1;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var5;
            stackOut_11_1 = new StringBuilder().append("di.I(").append(param0).append(44).append(param1).append(44);
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param2 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L1;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L1;
            }
          }
          throw sh.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 44 + param3 + 41);
        }
        return stackIn_10_0;
    }

    public di() {
        super(0, 0, 476, 225, (io) null);
        ((di) this).field_F = new an(hk.field_P, (sk) null);
        ((di) this).field_H = new an(vl.field_f, (sk) null);
        ((di) this).field_N = new an(hl.field_h, (sk) null);
        vm var1 = new vm();
        ((di) this).field_F.field_h = (io) (Object) var1;
        ((di) this).field_H.field_h = (io) (Object) var1;
        ((di) this).field_N.field_h = (io) (Object) var1;
        int var2 = 4;
        int var3 = 326;
        int var4 = -var2 + var3 >> 1;
        ((di) this).field_H.a(-90, -var2 + ((di) this).field_n + -48, -var3 + ((di) this).field_i >> 1, var4, 30);
        ((di) this).field_N.a(33, ((di) this).field_n - 48 + -var2, var2 + (var4 + (((di) this).field_i + -var3 >> 1)), var4, 30);
        ((di) this).field_F.a(-85, -78 + ((di) this).field_n - var2 * 2, -var3 + ((di) this).field_i >> 1, var3, 30);
        ((di) this).field_H.field_v = (sk) this;
        ((di) this).field_F.field_v = (sk) this;
        ((di) this).field_F.field_s = nk.field_f;
        ((di) this).field_N.field_v = (sk) this;
        ((di) this).field_N.field_s = fo.field_c;
        ((di) this).a((ga) (Object) ((di) this).field_H, 10);
        ((di) this).a((ga) (Object) ((di) this).field_F, 10);
        ((di) this).a((ga) (Object) ((di) this).field_N, 10);
    }

    final static v[] a() {
        int var3 = 0;
        int var4 = ZombieDawn.field_J;
        v[] var1 = new v[t.field_h];
        int var2 = 104;
        for (var3 = 0; t.field_h > var3; var3++) {
            var1[var3] = new v(gl.field_F, kd.field_pb, sl.field_d[var3], bo.field_o[var3], bn.field_c[var3], uf.field_n[var3], vj.field_m[var3], j.field_a);
        }
        no.f((byte) -79);
        return var1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_L = new rh();
        field_M = 20;
        field_I = "To Customer Support";
    }
}
