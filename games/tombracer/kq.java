/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kq {
    private bka field_e;
    static String field_d;
    static boolean field_c;
    static nh field_a;
    static String field_b;
    private int field_f;

    final void b(int param0, int param1) {
        if (param0 != 79) {
            kq.a(-1);
        }
        ((kq) this).field_e.a((byte) -114, param1);
        ((kq) this).field_f = ((kq) this).field_f + 1;
    }

    final boolean b(int param0) {
        if (param0 > -122) {
            return false;
        }
        return ((kq) this).field_f > 0 ? true : false;
    }

    final int b(byte param0) {
        if (param0 <= 85) {
            ((kq) this).field_e = null;
        }
        return ((kq) this).field_f;
    }

    public static void a(int param0) {
        field_d = null;
        field_b = null;
        if (param0 != -9598) {
            field_a = null;
        }
        field_a = null;
    }

    final static void a(int param0, fia param1, byte param2, uia param3) {
        try {
            RuntimeException var4 = null;
            int var5 = 0;
            ClassNotFoundException var6 = null;
            SecurityException var6_ref = null;
            NullPointerException var6_ref2 = null;
            Exception var6_ref3 = null;
            Throwable var6_ref4 = null;
            int var6_int = 0;
            String var8 = null;
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
            byte[][] var21 = null;
            byte[][] var22 = null;
            byte[][] var23 = null;
            RuntimeException stackIn_36_0 = null;
            StringBuilder stackIn_36_1 = null;
            RuntimeException stackIn_37_0 = null;
            StringBuilder stackIn_37_1 = null;
            RuntimeException stackIn_38_0 = null;
            StringBuilder stackIn_38_1 = null;
            String stackIn_38_2 = null;
            RuntimeException stackIn_39_0 = null;
            StringBuilder stackIn_39_1 = null;
            RuntimeException stackIn_40_0 = null;
            StringBuilder stackIn_40_1 = null;
            RuntimeException stackIn_41_0 = null;
            StringBuilder stackIn_41_1 = null;
            String stackIn_41_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_35_0 = null;
            StringBuilder stackOut_35_1 = null;
            RuntimeException stackOut_37_0 = null;
            StringBuilder stackOut_37_1 = null;
            String stackOut_37_2 = null;
            RuntimeException stackOut_36_0 = null;
            StringBuilder stackOut_36_1 = null;
            String stackOut_36_2 = null;
            RuntimeException stackOut_38_0 = null;
            StringBuilder stackOut_38_1 = null;
            RuntimeException stackOut_40_0 = null;
            StringBuilder stackOut_40_1 = null;
            String stackOut_40_2 = null;
            RuntimeException stackOut_39_0 = null;
            StringBuilder stackOut_39_1 = null;
            String stackOut_39_2 = null;
            var14 = TombRacer.field_G ? 1 : 0;
            try {
              L0: {
                L1: {
                  var18 = (Object) (Object) new aj();
                  ((aj) var18).field_f = param3.h(255);
                  ((aj) var18).field_n = param3.e(-12);
                  ((aj) var18).field_i = new int[((aj) var18).field_f];
                  ((aj) var18).field_k = new naa[((aj) var18).field_f];
                  ((aj) var18).field_g = new byte[((aj) var18).field_f][][];
                  ((aj) var18).field_h = new int[((aj) var18).field_f];
                  ((aj) var18).field_j = new naa[((aj) var18).field_f];
                  ((aj) var18).field_m = new int[((aj) var18).field_f];
                  var5 = 0;
                  if (param2 == 72) {
                    break L1;
                  } else {
                    field_c = true;
                    break L1;
                  }
                }
                L2: while (true) {
                  if (~var5 <= ~((aj) var18).field_f) {
                    al.field_g.b((byte) -109, (vg) var18);
                    break L0;
                  } else {
                    try {
                      L3: {
                        L4: {
                          L5: {
                            L6: {
                              var6_int = param3.h(255);
                              if (0 == var6_int) {
                                break L6;
                              } else {
                                if (var6_int == 1) {
                                  break L6;
                                } else {
                                  if (var6_int == 2) {
                                    break L6;
                                  } else {
                                    L7: {
                                      if (var6_int == 3) {
                                        break L7;
                                      } else {
                                        if (var6_int != 4) {
                                          break L5;
                                        } else {
                                          break L7;
                                        }
                                      }
                                    }
                                    var20 = param3.e((byte) -76);
                                    var8 = param3.e((byte) -76);
                                    var9 = param3.h(param2 + 183);
                                    var10 = new String[var9];
                                    var11_int = 0;
                                    L8: while (true) {
                                      if (var9 <= var11_int) {
                                        L9: {
                                          var23 = new byte[var9][];
                                          var22 = var23;
                                          var21 = var22;
                                          var19 = var21;
                                          var11 = var19;
                                          if (3 == var6_int) {
                                            var12_int = 0;
                                            L10: while (true) {
                                              if (var12_int >= var9) {
                                                break L9;
                                              } else {
                                                var13 = param3.e(param2 ^ -87);
                                                var11[var12_int] = new byte[var13];
                                                param3.a(var23[var12_int], 0, -116, var13);
                                                var12_int++;
                                                continue L10;
                                              }
                                            }
                                          } else {
                                            break L9;
                                          }
                                        }
                                        ((aj) var18).field_i[var5] = var6_int;
                                        var12 = new Class[var9];
                                        var17 = 0;
                                        var13 = var17;
                                        L11: while (true) {
                                          if (var9 <= var17) {
                                            ((aj) var18).field_k[var5] = param1.a(26868, var12, var8, sg.a(var20, 1));
                                            ((aj) var18).field_g[var5] = var23;
                                            break L4;
                                          } else {
                                            var12[var17] = sg.a(var10[var17], 1);
                                            var17++;
                                            continue L11;
                                          }
                                        }
                                      } else {
                                        var10[var11_int] = param3.e((byte) -76);
                                        var11_int++;
                                        continue L8;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                            L12: {
                              var16 = param3.e((byte) -76);
                              String dupTemp$1 = param3.e((byte) -76);
                              var15 = dupTemp$1;
                              var8 = dupTemp$1;
                              var9 = 0;
                              if (1 == var6_int) {
                                var9 = param3.e(param2 + 25);
                                break L12;
                              } else {
                                break L12;
                              }
                            }
                            ((aj) var18).field_i[var5] = var6_int;
                            ((aj) var18).field_h[var5] = var9;
                            ((aj) var18).field_j[var5] = param1.a(10355, var15, sg.a(var16, 1));
                            break L5;
                          }
                          break L4;
                        }
                        break L3;
                      }
                    } catch (java.lang.ClassNotFoundException decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L13: {
                        var6 = (ClassNotFoundException) (Object) decompiledCaughtException;
                        ((aj) var18).field_m[var5] = -1;
                        break L13;
                      }
                    } catch (java.lang.Exception decompiledCaughtParameter3) {
                      decompiledCaughtException = decompiledCaughtParameter3;
                      L16: {
                        var6_ref3 = (Exception) (Object) decompiledCaughtException;
                        ((aj) var18).field_m[var5] = -4;
                        break L16;
                      }
                    } catch (java.lang.Throwable decompiledCaughtParameter4) {
                      decompiledCaughtException = decompiledCaughtParameter4;
                      L17: {
                        var6_ref4 = decompiledCaughtException;
                        ((aj) var18).field_m[var5] = -5;
                        break L17;
                      }
                    }
                    var5++;
                    continue L2;
                  }
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter5) {
              decompiledCaughtException = decompiledCaughtParameter5;
              L18: {
                var4 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_35_0 = (RuntimeException) var4;
                stackOut_35_1 = new StringBuilder().append("kq.I(").append(param0).append(44);
                stackIn_37_0 = stackOut_35_0;
                stackIn_37_1 = stackOut_35_1;
                stackIn_36_0 = stackOut_35_0;
                stackIn_36_1 = stackOut_35_1;
                if (param1 == null) {
                  stackOut_37_0 = (RuntimeException) (Object) stackIn_37_0;
                  stackOut_37_1 = (StringBuilder) (Object) stackIn_37_1;
                  stackOut_37_2 = "null";
                  stackIn_38_0 = stackOut_37_0;
                  stackIn_38_1 = stackOut_37_1;
                  stackIn_38_2 = stackOut_37_2;
                  break L18;
                } else {
                  stackOut_36_0 = (RuntimeException) (Object) stackIn_36_0;
                  stackOut_36_1 = (StringBuilder) (Object) stackIn_36_1;
                  stackOut_36_2 = "{...}";
                  stackIn_38_0 = stackOut_36_0;
                  stackIn_38_1 = stackOut_36_1;
                  stackIn_38_2 = stackOut_36_2;
                  break L18;
                }
              }
              L19: {
                stackOut_38_0 = (RuntimeException) (Object) stackIn_38_0;
                stackOut_38_1 = ((StringBuilder) (Object) stackIn_38_1).append(stackIn_38_2).append(44).append(param2).append(44);
                stackIn_40_0 = stackOut_38_0;
                stackIn_40_1 = stackOut_38_1;
                stackIn_39_0 = stackOut_38_0;
                stackIn_39_1 = stackOut_38_1;
                if (param3 == null) {
                  stackOut_40_0 = (RuntimeException) (Object) stackIn_40_0;
                  stackOut_40_1 = (StringBuilder) (Object) stackIn_40_1;
                  stackOut_40_2 = "null";
                  stackIn_41_0 = stackOut_40_0;
                  stackIn_41_1 = stackOut_40_1;
                  stackIn_41_2 = stackOut_40_2;
                  break L19;
                } else {
                  stackOut_39_0 = (RuntimeException) (Object) stackIn_39_0;
                  stackOut_39_1 = (StringBuilder) (Object) stackIn_39_1;
                  stackOut_39_2 = "{...}";
                  stackIn_41_0 = stackOut_39_0;
                  stackIn_41_1 = stackOut_39_1;
                  stackIn_41_2 = stackOut_39_2;
                  break L19;
                }
              }
              throw tba.a((Throwable) (Object) stackIn_41_0, stackIn_41_2 + 41);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static g a(int param0, int param1) {
        int var3 = 0;
        qg var4_ref_qg = null;
        g[] var5 = null;
        int var6 = 0;
        g var7 = null;
        int var8 = TombRacer.field_G ? 1 : 0;
        qg[] var9 = cm.field_a;
        qg[] var2 = var9;
        for (var3 = 0; var3 < var9.length; var3++) {
            var4_ref_qg = var9[var3];
            var5 = var4_ref_qg.field_c;
            for (var6 = 0; var6 < var5.length; var6++) {
                var7 = var5[var6];
                if (!(param1 != var7.field_f)) {
                    return var7;
                }
            }
        }
        int var4 = -65 % ((param0 - 25) / 60);
        return null;
    }

    final static void a(int param0, int param1, byte param2) {
        if (ql.field_k == null) {
            return;
        }
        qpa var3 = new qpa();
        var3.b(param1, -123);
        var3.a(7, param0);
        hw.a((byte) -111, 1, 79, (bo) (Object) var3);
    }

    final void a(boolean param0) {
        ((kq) this).field_e.c(-84);
        if (param0) {
            return;
        }
        ((kq) this).field_f = 0;
    }

    final int a(byte param0) {
        if (param0 > -35) {
            boolean discarded$0 = ((kq) this).b(-122);
        }
        ((kq) this).field_f = ((kq) this).field_f - 1;
        if (((kq) this).field_e.b((byte) -26)) {
            return -1;
        }
        return ((kq) this).field_e.a(104);
    }

    public kq() {
        ((kq) this).field_e = new bka();
        ((kq) this).field_f = 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "DirectX";
        field_d = "High";
    }
}
