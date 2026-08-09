/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

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
            fia stackIn_16_0;
            java.net.URL stackIn_16_1;
            java.net.URL stackIn_16_2;
            java.net.URL stackIn_16_3;
            StringBuilder stackIn_16_4;
            fia stackIn_17_0;
            java.net.URL stackIn_17_1;
            java.net.URL stackIn_17_2;
            java.net.URL stackIn_17_3;
            StringBuilder stackIn_17_4;
            String stackIn_17_5;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            String var3 = null;
            Exception var3_ref = null;
            naa var4 = null;
            DataInputStream var5 = null;
            int var6 = 0;
            String var7 = null;
            String var8 = null;
            String var9 = null;
            String var10 = null;
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
                  var3 = "";
                  if (param2 == null) {
                    break L2;
                  } else {
                    var3 = qi.a(107, param2);
                    break L2;
                  }
                }
                L3: {
                  if (param0 != null) {
                    L4: {
                      if (param2 != null) {
                        var3 = var3 + " | ";
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    var3 = var3 + param0;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                upa.a(var3, (byte) -24);
                var7 = qf.a(966747152, "%3a", ":", var3);
                var8 = qf.a(966747152, "%40", "@", var7);
                var9 = qf.a(966747152, "%26", "&", var8);
                var10 = qf.a(966747152, "%23", "#", var9);
                if (dfa.field_e == null) {
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  L5: {
                    stackIn_16_0 = nea.field_c;

                    stackIn_16_1 = null;

                    stackIn_16_2 = null;

                    stackIn_16_3 = dfa.field_e.getCodeBase();

                    stackIn_16_4 = new StringBuilder().append("clienterror.ws?c=").append(sua.field_L).append("&u=");

                    if (toa.field_f != null) {
                      stackIn_17_0 = (fia) ((Object) stackIn_16_0);
                      stackIn_17_1 = null;
                      stackIn_17_2 = null;
                      stackIn_17_3 = (java.net.URL) ((Object) stackIn_16_3);
                      stackIn_17_4 = (StringBuilder) ((Object) stackIn_16_4);
                      stackIn_17_5 = toa.field_f;
                      break L5;
                    } else {
                      stackIn_17_0 = (fia) ((Object) stackIn_16_0);
                      stackIn_17_1 = null;
                      stackIn_17_2 = null;
                      stackIn_17_3 = (java.net.URL) ((Object) stackIn_16_3);
                      stackIn_17_4 = (StringBuilder) ((Object) stackIn_16_4);
                      stackIn_17_5 = "" + ic.field_b;
                      break L5;
                    }
                  }
                  var4 = ((fia) (Object) stackIn_17_0).a(new java.net.URL(stackIn_17_3, stackIn_17_5 + "&v1=" + fia.field_e + "&v2=" + fia.field_v + "&e=" + var10), 122);
                  L6: while (true) {
                    if (var4.field_b != 0) {
                      L7: {
                        if (1 == var4.field_b) {
                          var5 = (DataInputStream) (var4.field_f);
                          var5.read();
                          var5.close();
                          break L7;
                        } else {
                          break L7;
                        }
                      }
                      decompiledRegionSelector0 = 1;
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
                var3_ref = (Exception) (Object) decompiledCaughtException;
                decompiledRegionSelector0 = 1;
                break L8;
              }
            }
            if (decompiledRegionSelector0 == 0) {
              return;
            } else {
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void c(int param0) {
        iea var2 = null;
        this.field_b.K(this.field_a);
        if (param0 != -31138) {
            return;
        }
        if (null != this.field_f) {
            var2 = this.field_f;
            this.field_f = this.field_f.field_b;
        } else {
            var2 = new iea();
        }
        var2.a(this.field_a[3], this.field_a[2], this.field_a[1], this.field_a[0], this.field_c, this.field_e, param0 ^ -31170);
        this.field_c = var2;
    }

    final void a(int param0, int param1, byte param2, int param3, int param4) {
        this.c(param2 ^ 31146);
        this.field_b.T(param4, param1, param0, param3);
        if (param2 != -12) {
            this.c(-41);
        }
    }

    final void a(int param0) {
        if (this.field_e != this.field_c.field_a) {
            this.field_b.d();
            if (!(this.field_c.field_a == null)) {
                this.field_b.a(this.field_c.field_a, true);
            }
            this.field_e = this.field_c.field_a;
        }
        this.field_b.KA(this.field_c.field_d, this.field_c.field_h, this.field_c.field_c, this.field_c.field_f);
        int var2 = -7 / ((param0 - 36) / 59);
        iea var3 = this.field_c;
        this.field_c = this.field_c.field_b;
        var3.field_b = this.field_f;
        var3.field_a = null;
        this.field_f = var3;
    }

    final static byte[] a(uia param0, int param1, boolean param2) throws Exception {
        int[] array$0 = null;
        Object stackIn_5_0 = null;
        Object stackIn_47_0 = null;
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        String stackIn_51_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
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
        int[] var31 = null;
        byte[] var32 = null;
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
                var28 = fqa.e(true);
                var25 = var28;
                var8 = var25;
                var31 = var8;
                var10_int = 0;
                L1: while (true) {
                  if ((var10_int ^ -1) <= -9) {
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
                            if (var11 <= var12) {
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
                            if (-9 >= (var11 ^ -1)) {
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
                      if (-1 > (var9 ^ -1)) {
                        var10 = new int[var9][];
                        var11 = 0;
                        L6: while (true) {
                          if (var11 >= var9) {
                            break L5;
                          } else {
                            var12 = param0.field_h;
                            L7: while (true) {
                              var13_int = param0.h(255);
                              if ((var13_int ^ -1) <= -129) {
                                continue L7;
                              } else {
                                array$0 = new int[31 + (-var12 + param0.field_h) * 7 >> -613839035];
                                ((Object[]) (var10))[var11] = array$0;
                                var13 = array$0;
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
                                    var14 = var14 + (var15 >> -1448925019);
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
                      if (param0.field_h < var6) {
                        L11: {
                          var11 = param0.h(255);
                          if (var11 > 0) {
                            var32 = new byte[var11];
                            param0.a(var32, 0, -101, var11);
                            break L11;
                          } else {
                            break L11;
                          }
                        }
                        var12 = var6 - param0.field_h;
                        if (0 >= var12) {
                          break L10;
                        } else {
                          var27 = new byte[var12];
                          var24 = var27;
                          var10 = var24;
                          param0.a(var27, 0, -93, var12);
                          break L10;
                        }
                      } else {
                        break L10;
                      }
                    }
                    if (param0.field_h <= var6) {
                      L12: {
                        if (param2) {
                          System.out.println("Loading funorbprofile local: achievements=" + wg.a(0, var28));
                          break L12;
                        } else {
                          break L12;
                        }
                      }
                      stackIn_47_0 = var10;
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      throw ssa.<RuntimeException>$cfr$sneakyThrow(new Exception("Local: data overrun: start=" + var5 + " length=" + var3_int + " end=" + var6 + " overranto=" + param0.field_h));
                    }
                  } else {
                    var31[var10_int] = 0;
                    var10_int++;
                    continue L1;
                  }
                }
              }
            } else {
              if (param2) {
                System.out.println("Loading funorbprofile local: blank");
                stackIn_5_0 = null;
                decompiledRegionSelector0 = 0;
                break L0;
              } else {
                return null;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L13: {
            var3 = decompiledCaughtException;
            stackIn_50_0 = (RuntimeException) (var3);

            stackIn_50_1 = new StringBuilder().append("ssa.B(");

            if (param0 == null) {
              stackIn_51_0 = (RuntimeException) ((Object) stackIn_50_0);
              stackIn_51_1 = (StringBuilder) ((Object) stackIn_50_1);
              stackIn_51_2 = "null";
              break L13;
            } else {
              stackIn_51_0 = (RuntimeException) ((Object) stackIn_50_0);
              stackIn_51_1 = (StringBuilder) ((Object) stackIn_50_1);
              stackIn_51_2 = "{...}";
              break L13;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_51_0), stackIn_51_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (byte[]) ((Object) stackIn_5_0);
        } else {
          return (byte[]) ((Object) stackIn_47_0);
        }
    }

    ssa(ha param0) {
        this.field_e = null;
        this.field_a = new int[4];
        try {
            this.field_b = param0;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "ssa.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static void b(int param0) {
        int incrementValue$16 = 0;
        int incrementValue$17 = 0;
        int incrementValue$18 = 0;
        int incrementValue$19 = 0;
        int incrementValue$20 = 0;
        int incrementValue$21 = 0;
        int incrementValue$22 = 0;
        int incrementValue$23 = 0;
        int[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1_ref = null;
        var4 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var5 = ow.field_q;
            var1 = var5;
            var2 = param0;
            var3 = var5.length;
            L1: while (true) {
              if (var2 >= var3) {
                break L0;
              } else {
                incrementValue$16 = var2;
                var2++;
                var5[incrementValue$16] = 0;
                incrementValue$17 = var2;
                var2++;
                var5[incrementValue$17] = 0;
                incrementValue$18 = var2;
                var2++;
                var5[incrementValue$18] = 0;
                incrementValue$19 = var2;
                var2++;
                var5[incrementValue$19] = 0;
                incrementValue$20 = var2;
                var2++;
                var5[incrementValue$20] = 0;
                incrementValue$21 = var2;
                var2++;
                var5[incrementValue$21] = 0;
                incrementValue$22 = var2;
                var2++;
                var5[incrementValue$22] = 0;
                incrementValue$23 = var2;
                var2++;
                var5[incrementValue$23] = 0;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var1_ref), "ssa.E(" + param0 + ')');
        }
    }

    public static void d(int param0) {
        field_g = null;
        field_d = null;
        if (param0 > -89) {
            field_d = (String) null;
        }
    }

    static {
        field_d = "Names should contain a maximum of 12 characters";
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
