/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.net.URL;
import java.lang.String;

final class ssa {
    private iea field_c;
    private int[] field_a;
    private ha field_b;
    static String field_d;
    static jea field_g;
    private iea field_f;
    private nh field_e;

    final static void a(String param0, byte param1, Throwable param2) {
        try {
            Exception var3 = null;
            String var3_ref = null;
            naa var4 = null;
            DataInputStream var5 = null;
            int var6 = 0;
            String var7 = null;
            String var8 = null;
            String var9 = null;
            String var10 = null;
            fia stackIn_15_0 = null;
            java.net.URL stackIn_15_1 = null;
            java.net.URL stackIn_15_2 = null;
            java.net.URL stackIn_15_3 = null;
            StringBuilder stackIn_15_4 = null;
            fia stackIn_16_0 = null;
            java.net.URL stackIn_16_1 = null;
            java.net.URL stackIn_16_2 = null;
            java.net.URL stackIn_16_3 = null;
            StringBuilder stackIn_16_4 = null;
            fia stackIn_17_0 = null;
            java.net.URL stackIn_17_1 = null;
            java.net.URL stackIn_17_2 = null;
            java.net.URL stackIn_17_3 = null;
            StringBuilder stackIn_17_4 = null;
            String stackIn_17_5 = null;
            Throwable decompiledCaughtException = null;
            fia stackOut_14_0 = null;
            java.net.URL stackOut_14_1 = null;
            java.net.URL stackOut_14_2 = null;
            java.net.URL stackOut_14_3 = null;
            StringBuilder stackOut_14_4 = null;
            fia stackOut_16_0 = null;
            java.net.URL stackOut_16_1 = null;
            java.net.URL stackOut_16_2 = null;
            java.net.URL stackOut_16_3 = null;
            StringBuilder stackOut_16_4 = null;
            String stackOut_16_5 = null;
            fia stackOut_15_0 = null;
            java.net.URL stackOut_15_1 = null;
            java.net.URL stackOut_15_2 = null;
            java.net.URL stackOut_15_3 = null;
            StringBuilder stackOut_15_4 = null;
            String stackOut_15_5 = null;
            var6 = TombRacer.field_G ? 1 : 0;
            try {
              L0: {
                L1: {
                  if (param1 >= 112) {
                    break L1;
                  } else {
                    ssa.d(-5);
                    break L1;
                  }
                }
                L2: {
                  var3_ref = "";
                  if (param2 == null) {
                    break L2;
                  } else {
                    var3_ref = qi.a(107, param2);
                    break L2;
                  }
                }
                L3: {
                  if (param0 != null) {
                    L4: {
                      if (param2 != null) {
                        var3_ref = var3_ref + " | ";
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    var3_ref = var3_ref + param0;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                upa.a(var3_ref, (byte) -24);
                var7 = qf.a(966747152, "%3a", ":", var3_ref);
                var8 = qf.a(966747152, "%40", "@", var7);
                var9 = qf.a(966747152, "%26", "&", var8);
                var10 = qf.a(966747152, "%23", "#", var9);
                if (dfa.field_e == null) {
                  return;
                } else {
                  L5: {
                    stackOut_14_0 = nea.field_c;
                    stackOut_14_1 = null;
                    stackOut_14_2 = null;
                    stackOut_14_3 = dfa.field_e.getCodeBase();
                    stackOut_14_4 = new StringBuilder().append("clienterror.ws?c=").append(sua.field_L).append("&u=");
                    stackIn_16_0 = stackOut_14_0;
                    stackIn_16_1 = stackOut_14_1;
                    stackIn_16_2 = stackOut_14_2;
                    stackIn_16_3 = stackOut_14_3;
                    stackIn_16_4 = stackOut_14_4;
                    stackIn_15_0 = stackOut_14_0;
                    stackIn_15_1 = stackOut_14_1;
                    stackIn_15_2 = stackOut_14_2;
                    stackIn_15_3 = stackOut_14_3;
                    stackIn_15_4 = stackOut_14_4;
                    if (toa.field_f != null) {
                      stackOut_16_0 = (fia) (Object) stackIn_16_0;
                      stackOut_16_1 = null;
                      stackOut_16_2 = null;
                      stackOut_16_3 = (java.net.URL) (Object) stackIn_16_3;
                      stackOut_16_4 = (StringBuilder) (Object) stackIn_16_4;
                      stackOut_16_5 = toa.field_f;
                      stackIn_17_0 = stackOut_16_0;
                      stackIn_17_1 = stackOut_16_1;
                      stackIn_17_2 = stackOut_16_2;
                      stackIn_17_3 = stackOut_16_3;
                      stackIn_17_4 = stackOut_16_4;
                      stackIn_17_5 = stackOut_16_5;
                      break L5;
                    } else {
                      stackOut_15_0 = (fia) (Object) stackIn_15_0;
                      stackOut_15_1 = null;
                      stackOut_15_2 = null;
                      stackOut_15_3 = (java.net.URL) (Object) stackIn_15_3;
                      stackOut_15_4 = (StringBuilder) (Object) stackIn_15_4;
                      stackOut_15_5 = "" + ic.field_b;
                      stackIn_17_0 = stackOut_15_0;
                      stackIn_17_1 = stackOut_15_1;
                      stackIn_17_2 = stackOut_15_2;
                      stackIn_17_3 = stackOut_15_3;
                      stackIn_17_4 = stackOut_15_4;
                      stackIn_17_5 = stackOut_15_5;
                      break L5;
                    }
                  }
                  var4 = ((fia) (Object) stackIn_17_0).a(new java.net.URL(stackIn_17_3, stackIn_17_5 + "&v1=" + fia.field_e + "&v2=" + fia.field_v + "&e=" + var10), 122);
                  L6: while (true) {
                    if (var4.field_b != 0) {
                      L7: {
                        if (1 == var4.field_b) {
                          var5 = (DataInputStream) var4.field_f;
                          int discarded$1 = var5.read();
                          var5.close();
                          break L7;
                        } else {
                          break L7;
                        }
                      }
                      break L0;
                    } else {
                      vja.a(0, 1L);
                      continue L6;
                    }
                  }
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L8: {
                var3 = (Exception) (Object) decompiledCaughtException;
                break L8;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void c(int param0) {
        iea var2 = null;
        ((ssa) this).field_b.K(((ssa) this).field_a);
        if (param0 != -31138) {
            return;
        }
        if (null != ((ssa) this).field_f) {
            var2 = ((ssa) this).field_f;
            ((ssa) this).field_f = ((ssa) this).field_f.field_b;
        } else {
            var2 = new iea();
        }
        var2.a(((ssa) this).field_a[3], ((ssa) this).field_a[2], ((ssa) this).field_a[1], ((ssa) this).field_a[0], ((ssa) this).field_c, ((ssa) this).field_e, param0 ^ -31170);
        ((ssa) this).field_c = var2;
    }

    final void a(int param0, int param1, byte param2, int param3, int param4) {
        this.c(param2 ^ 31146);
        ((ssa) this).field_b.T(param4, param1, param0, param3);
        if (param2 != -12) {
            this.c(-41);
        }
    }

    final void a(int param0) {
        if (((ssa) this).field_e != ((ssa) this).field_c.field_a) {
            ((ssa) this).field_b.d();
            if (!(((ssa) this).field_c.field_a == null)) {
                ((ssa) this).field_b.a(((ssa) this).field_c.field_a, true);
            }
            ((ssa) this).field_e = ((ssa) this).field_c.field_a;
        }
        ((ssa) this).field_b.KA(((ssa) this).field_c.field_d, ((ssa) this).field_c.field_h, ((ssa) this).field_c.field_c, ((ssa) this).field_c.field_f);
        int var2 = -7 / ((param0 - 36) / 59);
        iea var3 = ((ssa) this).field_c;
        ((ssa) this).field_c = ((ssa) this).field_c.field_b;
        var3.field_b = ((ssa) this).field_f;
        var3.field_a = null;
        ((ssa) this).field_f = var3;
    }

    final static byte[] a(uia param0, int param1, boolean param2) throws Exception {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int[] var8 = null;
        int var9 = 0;
        int var10_int = 0;
        Object var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13_int = 0;
        int[] var13 = null;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int[] var19 = null;
        int[] var20 = null;
        uia var21 = null;
        uia var22 = null;
        byte[] var24 = null;
        int[] var25 = null;
        byte[] var27 = null;
        int[] var28 = null;
        byte[] var31 = null;
        int[] var32 = null;
        int[] var33 = null;
        byte[] var34 = null;
        byte[] var35 = null;
        int[] var36 = null;
        Object stackIn_3_0 = null;
        Object stackIn_42_0 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        String stackIn_46_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_41_0 = null;
        Object stackOut_2_0 = null;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        RuntimeException stackOut_45_0 = null;
        StringBuilder stackOut_45_1 = null;
        String stackOut_45_2 = null;
        RuntimeException stackOut_44_0 = null;
        StringBuilder stackOut_44_1 = null;
        String stackOut_44_2 = null;
        var17 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var4 = -82 % ((41 - param1) / 37);
            var3_int = param0.d(121);
            if (var3_int != 0) {
              var5 = param0.field_h;
              var6 = var5 + var3_int;
              var7 = param0.d(126);
              if (2 < var7) {
                throw ssa.<RuntimeException>$cfr$sneakyThrow(new Exception("Local: header error: version=" + var7));
              } else {
                var36 = fqa.e(true);
                var32 = var36;
                var28 = var32;
                var25 = var28;
                var8 = var25;
                var33 = var8;
                var10_int = 0;
                L1: while (true) {
                  if (var10_int >= 8) {
                    L2: {
                      if (var7 == 0) {
                        var8[0] = param0.e(105);
                        break L2;
                      } else {
                        if (1 != var7) {
                          var20 = var8;
                          var22 = param0;
                          var11 = var22.h(255);
                          var12 = 0;
                          L3: while (true) {
                            if (~var11 >= ~var12) {
                              break L2;
                            } else {
                              var20[var12] = var22.e(-35);
                              var12++;
                              continue L3;
                            }
                          }
                        } else {
                          var19 = var8;
                          var21 = param0;
                          var11 = 0;
                          L4: while (true) {
                            if (var11 >= 8) {
                              break L2;
                            } else {
                              var19[var11] = var21.e(100);
                              var11++;
                              continue L4;
                            }
                          }
                        }
                      }
                    }
                    L5: {
                      var9 = param0.h(255);
                      if (var9 > 0) {
                        var10 = (Object) (Object) new int[var9][];
                        var11 = 0;
                        L6: while (true) {
                          if (var11 >= var9) {
                            break L5;
                          } else {
                            var12 = param0.field_h;
                            L7: while (true) {
                              var13_int = param0.h(255);
                              if (var13_int >= 128) {
                                continue L7;
                              } else {
                                ((Object[]) var10)[var11] = (Object) (Object) new int[31 + (-var12 + param0.field_h) * 7 >> 5];
                                var13 = new int[31 + (-var12 + param0.field_h) * 7 >> 5];
                                param0.field_h = var12;
                                var14 = 0;
                                var15 = 0;
                                L8: while (true) {
                                  L9: {
                                    var16 = param0.h(255);
                                    var13[var14] = var13[var14] + (sea.c(var16, 127) << var15);
                                    if (var15 < 26) {
                                      break L9;
                                    } else {
                                      var13[var14 - -1] = var13[var14 - -1] + (sea.c(127, var16) >> -var15 + 32);
                                      break L9;
                                    }
                                  }
                                  if (var16 >= 128) {
                                    var15 += 7;
                                    var14 = var14 + (var15 >> 5);
                                    var15 = var15 & 31;
                                    continue L8;
                                  } else {
                                    var11++;
                                    continue L6;
                                  }
                                }
                              }
                            }
                          }
                        }
                      } else {
                        break L5;
                      }
                    }
                    L10: {
                      var10 = null;
                      if (~param0.field_h > ~var6) {
                        L11: {
                          var11 = param0.h(255);
                          if (var11 > 0) {
                            var34 = new byte[var11];
                            param0.a(var34, 0, -101, var11);
                            break L11;
                          } else {
                            break L11;
                          }
                        }
                        var12 = var6 - param0.field_h;
                        if (0 >= var12) {
                          break L10;
                        } else {
                          var35 = new byte[var12];
                          var31 = var35;
                          var27 = var31;
                          var24 = var27;
                          var10 = (Object) (Object) var24;
                          param0.a(var35, 0, -93, var12);
                          break L10;
                        }
                      } else {
                        break L10;
                      }
                    }
                    if (~param0.field_h >= ~var6) {
                      System.out.println("Loading funorbprofile local: achievements=" + wg.a(0, var36));
                      stackOut_41_0 = var10;
                      stackIn_42_0 = stackOut_41_0;
                      break L0;
                    } else {
                      throw ssa.<RuntimeException>$cfr$sneakyThrow(new Exception("Local: data overrun: start=" + var5 + " length=" + var3_int + " end=" + var6 + " overranto=" + param0.field_h));
                    }
                  } else {
                    var33[var10_int] = 0;
                    var10_int++;
                    continue L1;
                  }
                }
              }
            } else {
              System.out.println("Loading funorbprofile local: blank");
              stackOut_2_0 = null;
              stackIn_3_0 = stackOut_2_0;
              return (byte[]) (Object) stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L12: {
            var3 = decompiledCaughtException;
            stackOut_43_0 = (RuntimeException) var3;
            stackOut_43_1 = new StringBuilder().append("ssa.B(");
            stackIn_45_0 = stackOut_43_0;
            stackIn_45_1 = stackOut_43_1;
            stackIn_44_0 = stackOut_43_0;
            stackIn_44_1 = stackOut_43_1;
            if (param0 == null) {
              stackOut_45_0 = (RuntimeException) (Object) stackIn_45_0;
              stackOut_45_1 = (StringBuilder) (Object) stackIn_45_1;
              stackOut_45_2 = "null";
              stackIn_46_0 = stackOut_45_0;
              stackIn_46_1 = stackOut_45_1;
              stackIn_46_2 = stackOut_45_2;
              break L12;
            } else {
              stackOut_44_0 = (RuntimeException) (Object) stackIn_44_0;
              stackOut_44_1 = (StringBuilder) (Object) stackIn_44_1;
              stackOut_44_2 = "{...}";
              stackIn_46_0 = stackOut_44_0;
              stackIn_46_1 = stackOut_44_1;
              stackIn_46_2 = stackOut_44_2;
              break L12;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_46_0, stackIn_46_2 + 44 + param1 + 44 + 1 + 41);
        }
        return (byte[]) (Object) stackIn_42_0;
    }

    ssa(ha param0) {
        ((ssa) this).field_e = null;
        ((ssa) this).field_a = new int[4];
        try {
            ((ssa) this).field_b = param0;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "ssa.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    final static void b(int param0) {
        int[] var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var5 = ow.field_q;
            var1 = var5;
            var2 = 0;
            var3 = var5.length;
            L1: while (true) {
              if (var2 >= var3) {
                break L0;
              } else {
                int incrementValue$40 = var2;
                var2++;
                var5[incrementValue$40] = 0;
                int incrementValue$41 = var2;
                var2++;
                var5[incrementValue$41] = 0;
                int incrementValue$42 = var2;
                var2++;
                var5[incrementValue$42] = 0;
                int incrementValue$43 = var2;
                var2++;
                var5[incrementValue$43] = 0;
                int incrementValue$44 = var2;
                var2++;
                var5[incrementValue$44] = 0;
                int incrementValue$45 = var2;
                var2++;
                var5[incrementValue$45] = 0;
                int incrementValue$46 = var2;
                var2++;
                var5[incrementValue$46] = 0;
                int incrementValue$47 = var2;
                var2++;
                var5[incrementValue$47] = 0;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var1_ref, "ssa.E(" + 0 + 41);
        }
    }

    public static void d(int param0) {
        field_g = null;
        field_d = null;
        if (param0 > -89) {
            field_d = null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Names should contain a maximum of 12 characters";
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
