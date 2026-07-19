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
          this.field_e.a((byte) -114, param1);
          this.field_f = this.field_f + 1;
          return;
        } else {
          this.field_e.a((byte) -114, param1);
          this.field_f = this.field_f + 1;
          return;
        }
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
            return this.field_f;
        }
        return this.field_f;
    }

    public static void a(int param0) {
        field_d = null;
        field_b = null;
        if (param0 != -9598) {
            field_a = (nh) null;
            field_a = null;
            return;
        }
        field_a = null;
    }

    final static void a(int param0, fia param1, byte param2, uia param3) {
        try {
            byte[] array$1 = null;
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
            Object var15 = null;
            aj var15_ref = null;
            byte[][] var16 = null;
            String var17 = null;
            String var18 = null;
            byte[][] var19 = null;
            RuntimeException stackIn_45_0 = null;
            StringBuilder stackIn_45_1 = null;
            RuntimeException stackIn_46_0 = null;
            StringBuilder stackIn_46_1 = null;
            RuntimeException stackIn_47_0 = null;
            StringBuilder stackIn_47_1 = null;
            String stackIn_47_2 = null;
            RuntimeException stackIn_48_0 = null;
            StringBuilder stackIn_48_1 = null;
            RuntimeException stackIn_49_0 = null;
            StringBuilder stackIn_49_1 = null;
            RuntimeException stackIn_50_0 = null;
            StringBuilder stackIn_50_1 = null;
            String stackIn_50_2 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_44_0 = null;
            StringBuilder stackOut_44_1 = null;
            RuntimeException stackOut_46_0 = null;
            StringBuilder stackOut_46_1 = null;
            String stackOut_46_2 = null;
            RuntimeException stackOut_45_0 = null;
            StringBuilder stackOut_45_1 = null;
            String stackOut_45_2 = null;
            RuntimeException stackOut_47_0 = null;
            StringBuilder stackOut_47_1 = null;
            RuntimeException stackOut_49_0 = null;
            StringBuilder stackOut_49_1 = null;
            String stackOut_49_2 = null;
            RuntimeException stackOut_48_0 = null;
            StringBuilder stackOut_48_1 = null;
            String stackOut_48_2 = null;
            var14 = TombRacer.field_G ? 1 : 0;
            try {
              L0: {
                L1: {
                  var15_ref = new aj();
                  var15_ref.field_f = param3.h(255);
                  var15_ref.field_n = param3.e(-12);
                  var15_ref.field_i = new int[var15_ref.field_f];
                  var15_ref.field_k = new naa[var15_ref.field_f];
                  var15_ref.field_g = new byte[var15_ref.field_f][][];
                  var15_ref.field_h = new int[var15_ref.field_f];
                  var15_ref.field_j = new naa[var15_ref.field_f];
                  var15_ref.field_m = new int[var15_ref.field_f];
                  var5 = 0;
                  if (param2 == 72) {
                    break L1;
                  } else {
                    field_c = true;
                    break L1;
                  }
                }
                L2: while (true) {
                  L3: {
                    L4: {
                      if (var5 >= var15_ref.field_f) {
                        break L4;
                      } else {
                        try {
                          L5: {
                            var6_int = param3.h(255);
                            if (var14 != 0) {
                              decompiledRegionSelector0 = 0;
                              break L5;
                            } else {
                              L6: {
                                L7: {
                                  if (0 == var6_int) {
                                    break L7;
                                  } else {
                                    if (var6_int == 1) {
                                      break L7;
                                    } else {
                                      if (var6_int == 2) {
                                        break L7;
                                      } else {
                                        L8: {
                                          if ((var6_int ^ -1) == -4) {
                                            break L8;
                                          } else {
                                            if (-5 != (var6_int ^ -1)) {
                                              break L6;
                                            } else {
                                              break L8;
                                            }
                                          }
                                        }
                                        var17 = param3.e((byte) -76);
                                        var8 = param3.e((byte) -76);
                                        var9 = param3.h(param2 + 183);
                                        var10 = new String[var9];
                                        var11_int = 0;
                                        L9: while (true) {
                                          if (var9 <= var11_int) {
                                            L10: {
                                              L11: {
                                                var19 = new byte[var9][];
                                                var16 = var19;
                                                var11 = var16;
                                                if (3 == var6_int) {
                                                  var12_int = 0;
                                                  L12: while (true) {
                                                    if (var12_int >= var9) {
                                                      break L11;
                                                    } else {
                                                      var13 = param3.e(param2 ^ -87);
                                                      array$1 = new byte[var13];
                                                      var11[var12_int] = array$1;
                                                      param3.a(var19[var12_int], 0, -116, var13);
                                                      var12_int++;
                                                      if (var14 != 0) {
                                                        break L10;
                                                      } else {
                                                        continue L12;
                                                      }
                                                    }
                                                  }
                                                } else {
                                                  break L11;
                                                }
                                              }
                                              var15_ref.field_i[var5] = var6_int;
                                              break L10;
                                            }
                                            var12 = new Class[var9];
                                            var13 = 0;
                                            L13: while (true) {
                                              L14: {
                                                if (var9 <= var13) {
                                                  var15_ref.field_k[var5] = param1.a(26868, var12, var8, sg.a(var17, 1));
                                                  var15_ref.field_g[var5] = var19;
                                                  break L14;
                                                } else {
                                                  var12[var13] = sg.a(var10[var13], 1);
                                                  var13++;
                                                  if (var14 != 0) {
                                                    break L14;
                                                  } else {
                                                    continue L13;
                                                  }
                                                }
                                              }
                                              if (var14 == 0) {
                                                break L6;
                                              } else {
                                                break L7;
                                              }
                                            }
                                          } else {
                                            var10[var11_int] = param3.e((byte) -76);
                                            var11_int++;
                                            if (var14 != 0) {
                                              break L6;
                                            } else {
                                              continue L9;
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                                L15: {
                                  var18 = param3.e((byte) -76);
                                  var8 = param3.e((byte) -76);
                                  var9 = 0;
                                  if (1 == var6_int) {
                                    var9 = param3.e(param2 + 25);
                                    break L15;
                                  } else {
                                    break L15;
                                  }
                                }
                                var15_ref.field_i[var5] = var6_int;
                                var15_ref.field_h[var5] = var9;
                                var15_ref.field_j[var5] = param1.a(10355, var8, sg.a(var18, 1));
                                break L6;
                              }
                              decompiledRegionSelector0 = 1;
                              break L5;
                            }
                          }
                        } catch (java.lang.ClassNotFoundException decompiledCaughtParameter0) {
                          decompiledCaughtException = decompiledCaughtParameter0;
                          L16: {
                            var6 = (ClassNotFoundException) (Object) decompiledCaughtException;
                            var15_ref.field_m[var5] = -1;
                            decompiledRegionSelector0 = 1;
                            break L16;
                          }
                        } catch (java.lang.SecurityException decompiledCaughtParameter1) {
                          decompiledCaughtException = decompiledCaughtParameter1;
                          L17: {
                            var6_ref = (SecurityException) (Object) decompiledCaughtException;
                            var15_ref.field_m[var5] = -2;
                            decompiledRegionSelector0 = 1;
                            break L17;
                          }
                        } catch (java.lang.NullPointerException decompiledCaughtParameter2) {
                          decompiledCaughtException = decompiledCaughtParameter2;
                          L18: {
                            var6_ref2 = (NullPointerException) (Object) decompiledCaughtException;
                            var15_ref.field_m[var5] = -3;
                            decompiledRegionSelector0 = 1;
                            break L18;
                          }
                        } catch (java.lang.Exception decompiledCaughtParameter3) {
                          decompiledCaughtException = decompiledCaughtParameter3;
                          L19: {
                            var6_ref3 = (Exception) (Object) decompiledCaughtException;
                            var15_ref.field_m[var5] = -4;
                            decompiledRegionSelector0 = 1;
                            break L19;
                          }
                        } catch (java.lang.Throwable decompiledCaughtParameter4) {
                          decompiledCaughtException = decompiledCaughtParameter4;
                          L20: {
                            var6_ref4 = decompiledCaughtException;
                            var15_ref.field_m[var5] = -5;
                            decompiledRegionSelector0 = 1;
                            break L20;
                          }
                        }
                        if (decompiledRegionSelector0 == 0) {
                          break L3;
                        } else {
                          var5++;
                          if (var14 == 0) {
                            continue L2;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                    al.field_g.b((byte) -109, var15_ref);
                    break L3;
                  }
                  break L0;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter5) {
              decompiledCaughtException = decompiledCaughtParameter5;
              L21: {
                var4 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_44_0 = (RuntimeException) (var4);
                stackOut_44_1 = new StringBuilder().append("kq.I(").append(param0).append(',');
                stackIn_46_0 = stackOut_44_0;
                stackIn_46_1 = stackOut_44_1;
                stackIn_45_0 = stackOut_44_0;
                stackIn_45_1 = stackOut_44_1;
                if (param1 == null) {
                  stackOut_46_0 = (RuntimeException) ((Object) stackIn_46_0);
                  stackOut_46_1 = (StringBuilder) ((Object) stackIn_46_1);
                  stackOut_46_2 = "null";
                  stackIn_47_0 = stackOut_46_0;
                  stackIn_47_1 = stackOut_46_1;
                  stackIn_47_2 = stackOut_46_2;
                  break L21;
                } else {
                  stackOut_45_0 = (RuntimeException) ((Object) stackIn_45_0);
                  stackOut_45_1 = (StringBuilder) ((Object) stackIn_45_1);
                  stackOut_45_2 = "{...}";
                  stackIn_47_0 = stackOut_45_0;
                  stackIn_47_1 = stackOut_45_1;
                  stackIn_47_2 = stackOut_45_2;
                  break L21;
                }
              }
              L22: {
                stackOut_47_0 = (RuntimeException) ((Object) stackIn_47_0);
                stackOut_47_1 = ((StringBuilder) (Object) stackIn_47_1).append(stackIn_47_2).append(',').append(param2).append(',');
                stackIn_49_0 = stackOut_47_0;
                stackIn_49_1 = stackOut_47_1;
                stackIn_48_0 = stackOut_47_0;
                stackIn_48_1 = stackOut_47_1;
                if (param3 == null) {
                  stackOut_49_0 = (RuntimeException) ((Object) stackIn_49_0);
                  stackOut_49_1 = (StringBuilder) ((Object) stackIn_49_1);
                  stackOut_49_2 = "null";
                  stackIn_50_0 = stackOut_49_0;
                  stackIn_50_1 = stackOut_49_1;
                  stackIn_50_2 = stackOut_49_2;
                  break L22;
                } else {
                  stackOut_48_0 = (RuntimeException) ((Object) stackIn_48_0);
                  stackOut_48_1 = (StringBuilder) ((Object) stackIn_48_1);
                  stackOut_48_2 = "{...}";
                  stackIn_50_0 = stackOut_48_0;
                  stackIn_50_1 = stackOut_48_1;
                  stackIn_50_2 = stackOut_48_2;
                  break L22;
                }
              }
              throw tba.a((Throwable) ((Object) stackIn_50_0), stackIn_50_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static g a(int param0, int param1) {
        qg[] var2 = null;
        int var3 = 0;
        int var4 = 0;
        qg var4_ref_qg = null;
        g[] var5 = null;
        int var6 = 0;
        g var7 = null;
        int var8 = 0;
        qg[] var9 = null;
        int stackIn_2_0 = 0;
        int stackIn_2_1 = 0;
        int stackIn_5_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_9_1 = 0;
        int stackOut_1_0 = 0;
        int stackOut_1_1 = 0;
        int stackOut_4_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_8_1 = 0;
        var8 = TombRacer.field_G ? 1 : 0;
        var9 = cm.field_a;
        var2 = var9;
        var3 = 0;
        L0: while (true) {
          stackOut_1_0 = var3;
          stackOut_1_1 = var9.length;
          stackIn_2_0 = stackOut_1_0;
          stackIn_2_1 = stackOut_1_1;
          L1: while (true) {
            if (stackIn_2_0 < stackIn_2_1) {
              var4_ref_qg = var9[var3];
              var5 = var4_ref_qg.field_c;
              stackOut_4_0 = 0;
              stackIn_6_0 = stackOut_4_0;
              stackIn_5_0 = stackOut_4_0;
              if (var8 == 0) {
                var6 = stackIn_6_0;
                L2: while (true) {
                  if (var6 >= var5.length) {
                    var3++;
                    continue L0;
                  } else {
                    var7 = var5[var6];
                    stackOut_8_0 = param1 ^ -1;
                    stackOut_8_1 = var7.field_f ^ -1;
                    stackIn_2_0 = stackOut_8_0;
                    stackIn_2_1 = stackOut_8_1;
                    stackIn_9_0 = stackOut_8_0;
                    stackIn_9_1 = stackOut_8_1;
                    if (var8 != 0) {
                      continue L1;
                    } else {
                      if (stackIn_9_0 == stackIn_9_1) {
                        return var7;
                      } else {
                        var6++;
                        continue L2;
                      }
                    }
                  }
                }
              } else {
                var4 = stackIn_5_0;
                return null;
              }
            } else {
              var4 = -65 % ((param0 - 25) / 60);
              return null;
            }
          }
        }
    }

    final static void a(int param0, int param1, byte param2) {
        qpa var3 = null;
        if (ql.field_k != null) {
          if (param2 < 106) {
            field_a = (nh) null;
            var3 = new qpa();
            var3.b(param1, -123);
            var3.a(7, param0);
            hw.a((byte) -111, 1, 79, var3);
            return;
          } else {
            var3 = new qpa();
            var3.b(param1, -123);
            var3.a(7, param0);
            hw.a((byte) -111, 1, 79, var3);
            return;
          }
        } else {
          return;
        }
    }

    final void a(boolean param0) {
        this.field_e.c(-84);
        if (param0) {
            return;
        }
        this.field_f = 0;
    }

    final int a(byte param0) {
        boolean discarded$2 = false;
        if (param0 <= -35) {
          this.field_f = this.field_f - 1;
          if (this.field_e.b((byte) -26)) {
            return -1;
          } else {
            return this.field_e.a(104);
          }
        } else {
          discarded$2 = this.b(-122);
          this.field_f = this.field_f - 1;
          if (this.field_e.b((byte) -26)) {
            return -1;
          } else {
            return this.field_e.a(104);
          }
        }
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
