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
        this.field_e.a((byte) -114, param1);
        this.field_f = this.field_f + 1;
    }

    final boolean b(int param0) {
        if (param0 > -122) {
            return false;
        }
        return this.field_f > 0 ? true : false;
    }

    final int b(byte param0) {
        if (param0 <= 85) {
            this.field_e = (bka) null;
        }
        return this.field_f;
    }

    public static void a(int param0) {
        field_d = null;
        field_b = null;
        if (param0 != -9598) {
            field_a = (nh) null;
        }
        field_a = null;
    }

    final static void a(int param0, fia param1, byte param2, uia param3) {
        try {
            byte[] array$0 = null;
            String dupTemp$1 = null;
            RuntimeException stackIn_38_0 = null;
            StringBuilder stackIn_38_1 = null;
            RuntimeException stackIn_39_0 = null;
            StringBuilder stackIn_39_1 = null;
            String stackIn_39_2 = null;
            StringBuilder stackIn_41_1 = null;
            StringBuilder stackIn_42_1 = null;
            String stackIn_42_2 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            RuntimeException var4 = null;
            int var5 = 0;
            int var6_int = 0;
            ClassNotFoundException var6 = null;
            SecurityException var6_ref = null;
            NullPointerException var6_ref2 = null;
            Exception var6_ref3 = null;
            Throwable var6_ref4 = null;
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
            var14 = TombRacer.field_G ? 1 : 0;
            try {
              L0: {
                L1: {
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
                    break L1;
                  } else {
                    field_c = true;
                    break L1;
                  }
                }
                L2: while (true) {
                  if (var5 >= var18.field_f) {
                    al.field_g.b((byte) -109, var18);
                    break L0;
                  } else {
                    try {
                      L3: {
                        L4: {
                          L5: {
                            var6_int = param3.h(255);
                            if (0 == var6_int) {
                              break L5;
                            } else {
                              if (var6_int == 1) {
                                break L5;
                              } else {
                                if (var6_int == 2) {
                                  break L5;
                                } else {
                                  L6: {
                                    if ((var6_int ^ -1) == -4) {
                                      break L6;
                                    } else {
                                      if (-5 == (var6_int ^ -1)) {
                                        break L6;
                                      } else {
                                        var5++;
                                        decompiledRegionSelector0 = 0;
                                        break L3;
                                      }
                                    }
                                  }
                                  var20 = param3.e((byte) -76);
                                  var8 = param3.e((byte) -76);
                                  var9 = param3.h(param2 + 183);
                                  var10 = new String[var9];
                                  var11_int = 0;
                                  L7: while (true) {
                                    if (var9 <= var11_int) {
                                      L8: {
                                        var21 = new byte[var9][];
                                        var19 = var21;
                                        var11 = var19;
                                        if (3 == var6_int) {
                                          var12_int = 0;
                                          L9: while (true) {
                                            if (var12_int >= var9) {
                                              break L8;
                                            } else {
                                              var13 = param3.e(param2 ^ -87);
                                              array$0 = new byte[var13];
                                              var11[var12_int] = array$0;
                                              param3.a(var21[var12_int], 0, -116, var13);
                                              var12_int++;
                                              continue L9;
                                            }
                                          }
                                        } else {
                                          break L8;
                                        }
                                      }
                                      var18.field_i[var5] = var6_int;
                                      var12 = new Class[var9];
                                      var17 = 0;
                                      var13 = var17;
                                      L10: while (true) {
                                        if (var9 <= var17) {
                                          var18.field_k[var5] = param1.a(26868, var12, var8, sg.a(var20, 1));
                                          var18.field_g[var5] = var21;
                                          break L4;
                                        } else {
                                          var12[var17] = sg.a(var10[var17], 1);
                                          var17++;
                                          continue L10;
                                        }
                                      }
                                    } else {
                                      var10[var11_int] = param3.e((byte) -76);
                                      var11_int++;
                                      continue L7;
                                    }
                                  }
                                }
                              }
                            }
                          }
                          L11: {
                            var16 = param3.e((byte) -76);
                            dupTemp$1 = param3.e((byte) -76);
                            var15 = dupTemp$1;
                            var8 = dupTemp$1;
                            var9 = 0;
                            if (1 == var6_int) {
                              var9 = param3.e(param2 + 25);
                              break L11;
                            } else {
                              break L11;
                            }
                          }
                          var18.field_i[var5] = var6_int;
                          var18.field_h[var5] = var9;
                          var18.field_j[var5] = param1.a(10355, var15, sg.a(var16, 1));
                          break L4;
                        }
                        decompiledRegionSelector0 = 1;
                        break L3;
                      }
                    } catch (java.lang.ClassNotFoundException decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L12: {
                        var6 = (ClassNotFoundException) (Object) decompiledCaughtException;
                        var18.field_m[var5] = -1;
                        decompiledRegionSelector0 = 1;
                        break L12;
                      }
                    } catch (java.lang.SecurityException decompiledCaughtParameter1) {
                      decompiledCaughtException = decompiledCaughtParameter1;
                      L13: {
                        var6_ref = (SecurityException) (Object) decompiledCaughtException;
                        var18.field_m[var5] = -2;
                        decompiledRegionSelector0 = 1;
                        break L13;
                      }
                    } catch (java.lang.NullPointerException decompiledCaughtParameter2) {
                      decompiledCaughtException = decompiledCaughtParameter2;
                      L14: {
                        var6_ref2 = (NullPointerException) (Object) decompiledCaughtException;
                        var18.field_m[var5] = -3;
                        decompiledRegionSelector0 = 1;
                        break L14;
                      }
                    } catch (java.lang.Exception decompiledCaughtParameter3) {
                      decompiledCaughtException = decompiledCaughtParameter3;
                      L15: {
                        var6_ref3 = (Exception) (Object) decompiledCaughtException;
                        var18.field_m[var5] = -4;
                        decompiledRegionSelector0 = 1;
                        break L15;
                      }
                    } catch (java.lang.Throwable decompiledCaughtParameter4) {
                      decompiledCaughtException = decompiledCaughtParameter4;
                      L16: {
                        var6_ref4 = decompiledCaughtException;
                        var18.field_m[var5] = -5;
                        decompiledRegionSelector0 = 1;
                        break L16;
                      }
                    }
                    if (decompiledRegionSelector0 == 0) {
                      continue L2;
                    } else {
                      var5++;
                      continue L2;
                    }
                  }
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter5) {
              decompiledCaughtException = decompiledCaughtParameter5;
              L17: {
                var4 = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_38_0 = (RuntimeException) (var4);

                stackIn_38_1 = new StringBuilder().append("kq.I(").append(param0).append(',');

                if (param1 == null) {
                  stackIn_39_0 = (RuntimeException) ((Object) stackIn_38_0);
                  stackIn_39_1 = (StringBuilder) ((Object) stackIn_38_1);
                  stackIn_39_2 = "null";
                  break L17;
                } else {
                  stackIn_39_0 = (RuntimeException) ((Object) stackIn_38_0);
                  stackIn_39_1 = (StringBuilder) ((Object) stackIn_38_1);
                  stackIn_39_2 = "{...}";
                  break L17;
                }
              }
              L18: {


                stackIn_41_1 = ((StringBuilder) (Object) stackIn_39_1).append(stackIn_39_2).append(',').append(param2).append(',');

                if (param3 == null) {
                  stackIn_39_0 = (RuntimeException) ((Object) stackIn_39_0);
                  stackIn_42_1 = (StringBuilder) ((Object) stackIn_41_1);
                  stackIn_42_2 = "null";
                  break L18;
                } else {
                  stackIn_39_0 = (RuntimeException) ((Object) stackIn_39_0);
                  stackIn_42_1 = (StringBuilder) ((Object) stackIn_41_1);
                  stackIn_42_2 = "{...}";
                  break L18;
                }
              }
              throw tba.a((Throwable) ((Object) stackIn_39_0), stackIn_42_2 + ')');
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
                if (!((param1 ^ -1) != (var7.field_f ^ -1))) {
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
            field_a = (nh) null;
        }
        qpa var3 = new qpa();
        var3.b(param1, -123);
        var3.a(7, param0);
        hw.a((byte) -111, 1, 79, var3);
    }

    final void a(boolean param0) {
        this.field_e.c(-84);
        if (param0) {
            return;
        }
        this.field_f = 0;
    }

    final int a(byte param0) {
        if (param0 > -35) {
            this.b(-122);
        }
        this.field_f = this.field_f - 1;
        if (this.field_e.b((byte) -26)) {
            return -1;
        }
        return this.field_e.a(104);
    }

    public kq() {
        this.field_e = new bka();
        this.field_f = 0;
    }

    static {
        field_b = "DirectX";
        field_d = "High";
    }
}
