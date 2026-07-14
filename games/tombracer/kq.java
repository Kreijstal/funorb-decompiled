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
            aj var18 = null;
            byte[][] var19 = null;
            String var20 = null;
            byte[][] var21 = null;
            byte[][] var22 = null;
            byte[][] var23 = null;
            Throwable decompiledCaughtException = null;
            L0: {
              var14 = TombRacer.field_G ? 1 : 0;
              var18 = new aj();
              var18.field_f = param3.h(255);
              var18.field_n = param3.e(-12);
              var18.field_i = new int[var18.field_f];
              var18.field_k = new naa[var18.field_f];
              var18.field_g = new byte[var18.field_f][][];
              var18.field_h = new int[var18.field_f];
              var18.field_j = new naa[var18.field_f];
              var18.field_m = new int[var18.field_f];
              var5 = 0;
              if (param2 == 72) {
                break L0;
              } else {
                field_c = true;
                break L0;
              }
            }
            L1: while (true) {
              if (var5 >= var18.field_f) {
                var6_ref4 = decompiledCaughtException;
                var18.field_m[var5] = -5;
                var5++;
              } else {
                try {
                  L2: {
                    L3: {
                      var6_int = param3.h(255);
                      if (0 == var6_int) {
                        break L3;
                      } else {
                        if (var6_int == 1) {
                          break L3;
                        } else {
                          if (var6_int == 2) {
                            break L3;
                          } else {
                            L4: {
                              if (var6_int == -4) {
                                break L4;
                              } else {
                                if (-5 == var6_int) {
                                  break L4;
                                } else {
                                  var5++;
                                  break L2;
                                }
                              }
                            }
                            var20 = param3.e((byte) -76);
                            var8 = param3.e((byte) -76);
                            var9 = param3.h(param2 + 183);
                            var10 = new String[var9];
                            var11_int = 0;
                            L5: while (true) {
                              if (var9 <= var11_int) {
                                L6: {
                                  var23 = new byte[var9][];
                                  var22 = var23;
                                  var21 = var22;
                                  var19 = var21;
                                  var11 = var19;
                                  if (3 == var6_int) {
                                    var12_int = 0;
                                    L7: while (true) {
                                      if (var12_int >= var9) {
                                        break L6;
                                      } else {
                                        var13 = param3.e(param2 ^ -87);
                                        var11[var12_int] = new byte[var13];
                                        param3.a(var23[var12_int], 0, -116, var13);
                                        var12_int++;
                                        continue L7;
                                      }
                                    }
                                  } else {
                                    break L6;
                                  }
                                }
                                var18.field_i[var5] = var6_int;
                                var12 = new Class[var9];
                                var17 = 0;
                                var13 = var17;
                                L8: while (true) {
                                  if (var9 <= var17) {
                                    var18.field_k[var5] = param1.a(26868, var12, var8, sg.a(var20, 1));
                                    var18.field_g[var5] = var23;
                                    var5++;
                                    break L2;
                                  } else {
                                    var12[var17] = sg.a(var10[var17], 1);
                                    var17++;
                                    continue L8;
                                  }
                                }
                              } else {
                                var10[var11_int] = param3.e((byte) -76);
                                var11_int++;
                                continue L5;
                              }
                            }
                          }
                        }
                      }
                    }
                    L9: {
                      var16 = param3.e((byte) -76);
                      var15 = param3.e((byte) -76);
                      var8 = param3.e((byte) -76);
                      var9 = 0;
                      if (1 == var6_int) {
                        var9 = param3.e(param2 + 25);
                        break L9;
                      } else {
                        break L9;
                      }
                    }
                    var18.field_i[var5] = var6_int;
                    var18.field_h[var5] = var9;
                    var18.field_j[var5] = param1.a(10355, var15, sg.a(var16, 1));
                    break L2;
                  }
                } catch (java.lang.ClassNotFoundException decompiledCaughtParameter) {
                  decompiledCaughtException = decompiledCaughtParameter;
                  var5++;
                } catch (java.lang.Exception decompiledCaughtParameter) {
                  decompiledCaughtException = decompiledCaughtParameter;
                  var6_ref2 = (NullPointerException) (Object) decompiledCaughtException;
                  var18.field_m[var5] = -3;
                  var5++;
                } catch (java.lang.Throwable decompiledCaughtParameter) {
                  decompiledCaughtException = decompiledCaughtParameter;
                  var6_ref3 = (Exception) (Object) decompiledCaughtException;
                  var18.field_m[var5] = -4;
                  var5++;
                }
                continue L1;
              }
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
        if (param2 < 106) {
            field_a = null;
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
