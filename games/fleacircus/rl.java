/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class rl {
    private long field_f;
    static sf field_g;
    static mk field_b;
    static int[] field_e;
    static rh field_d;
    private long field_a;
    private RandomAccessFile field_c;

    final void a(long param0, byte param1) throws IOException {
        boolean discarded$0 = false;
        this.field_c.seek(param0);
        this.field_f = param0;
        if (param1 > -112) {
            rh var5 = (rh) null;
            discarded$0 = rl.a((rh) null, -27);
        }
    }

    final static boolean a(boolean param0) {
        if (!param0) {
            field_g = (sf) null;
        }
        return !uc.field_c.a(-19) ? true : false;
    }

    protected final void finalize() throws Throwable {
        if (this.field_c != null) {
            System.out.println("");
            this.b(-1);
        }
    }

    final static void a(String param0, int param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        try {
          L0: {
            ah.field_c = false;
            fk.field_D = false;
            if (param2 >= 85) {
              L1: {
                if (null == ok.field_x) {
                  break L1;
                } else {
                  if (ok.field_x.field_G) {
                    L2: {
                      var3_int = 1;
                      if (8 == param1) {
                        L3: {
                          L4: {
                            if (!jg.field_d) {
                              break L4;
                            } else {
                              param0 = me.field_c;
                              if (!fleas.field_A) {
                                break L3;
                              } else {
                                break L4;
                              }
                            }
                          }
                          param0 = o.field_g;
                          break L3;
                        }
                        param1 = 2;
                        lg.field_b.a((byte) -102, aa.field_s);
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                    L5: {
                      if (param1 == 10) {
                        l.a(0);
                        var3_int = 0;
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    L6: {
                      if (var3_int == 0) {
                        break L6;
                      } else {
                        L7: {
                          if (!fk.field_D) {
                            break L7;
                          } else {
                            param0 = db.a(ud.field_a, new String[]{param0}, true);
                            break L7;
                          }
                        }
                        L8: {
                          if (!ud.field_c) {
                            break L8;
                          } else {
                            param0 = k.field_e;
                            break L8;
                          }
                        }
                        ok.field_x.a((byte) -97, param1, param0);
                        break L6;
                      }
                    }
                    if (-257 == (param1 ^ -1)) {
                      break L1;
                    } else {
                      if ((param1 ^ -1) != -11) {
                        if (jg.field_d) {
                          break L1;
                        } else {
                          lg.field_b.a(-41);
                          break L1;
                        }
                      } else {
                        break L1;
                      }
                    }
                  } else {
                    break L1;
                  }
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var3 = decompiledCaughtException;
            stackOut_26_0 = (RuntimeException) (var3);
            stackOut_26_1 = new StringBuilder().append("rl.G(");
            stackIn_28_0 = stackOut_26_0;
            stackIn_28_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param0 == null) {
              stackOut_28_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackOut_28_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L9;
            } else {
              stackOut_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackOut_27_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackOut_27_2 = "{...}";
              stackIn_29_0 = stackOut_27_0;
              stackIn_29_1 = stackOut_27_1;
              stackIn_29_2 = stackOut_27_2;
              break L9;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_29_0), stackIn_29_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final int a(byte[] param0, int param1, int param2, int param3) throws IOException {
        int var5_int = 0;
        RuntimeException var5 = null;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              if (param2 == 0) {
                break L1;
              } else {
                this.field_a = -79L;
                break L1;
              }
            }
            L2: {
              var5_int = this.field_c.read(param0, param1, param3);
              if (-1 <= (var5_int ^ -1)) {
                break L2;
              } else {
                this.field_f = this.field_f + (long)var5_int;
                break L2;
              }
            }
            stackOut_4_0 = var5_int;
            stackIn_5_0 = stackOut_4_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) (var5);
            stackOut_6_1 = new StringBuilder().append("rl.E(");
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_5_0;
    }

    final static boolean a(rh param0, int param1) {
        RuntimeException var2 = null;
        int[] var3 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_2_0 = false;
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
              if (param1 == 0) {
                break L1;
              } else {
                var3 = (int[]) null;
                rl.a(21, -126, (int[]) null, -68, -71, 30, -52, -14, (byte) 65);
                break L1;
              }
            }
            stackOut_2_0 = param0.a(-77);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var2);
            stackOut_4_1 = new StringBuilder().append("rl.K(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    public static void a(int param0) {
        field_g = null;
        field_e = null;
        if (param0 != -930374320) {
            int[] var2 = (int[]) null;
            rl.a(111, -12, (int[]) null, 28, 28, 35, 6, -36, (byte) -75);
        }
        field_b = null;
        field_d = null;
    }

    final void a(byte param0, int param1, int param2, byte[] param3) throws IOException {
        if (param0 < 87) {
            return;
        }
        try {
            if (!(this.field_a >= (long)param1 - -this.field_f)) {
                this.field_c.seek(this.field_a);
                this.field_c.write(1);
                throw new EOFException();
            }
            this.field_c.write(param3, param2, param1);
            this.field_f = this.field_f + (long)param1;
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) ((Object) runtimeException), "rl.C(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final void b(int param0) throws IOException {
        if (param0 != -1) {
            return;
        }
        if (!(null == this.field_c)) {
            this.field_c.close();
            this.field_c = null;
        }
    }

    final static byte[] a(int param0, byte[] param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        byte[] var3 = null;
        byte[] stackIn_2_0 = null;
        byte[] stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_3_0 = null;
        byte[] stackOut_1_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            var2_int = param1.length;
            if (param0 == 1) {
              var3 = new byte[var2_int];
              dm.a(param1, 0, var3, 0, var2_int);
              stackOut_3_0 = (byte[]) (var3);
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = (byte[]) null;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var2);
            stackOut_5_1 = new StringBuilder().append("rl.B(").append(param0).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    final static java.applet.Applet a(byte param0) {
        if (null != sd.field_j) {
            return sd.field_j;
        }
        if (param0 > -49) {
            field_d = (rh) null;
        }
        return (java.applet.Applet) ((Object) pf.field_c);
    }

    final long c(int param0) throws IOException {
        boolean discarded$0 = false;
        if (param0 != 2049105808) {
            rh var3 = (rh) null;
            discarded$0 = rl.a((rh) null, -61);
        }
        return this.field_c.length();
    }

    final static void a(int param0, int param1, int[] param2, int param3, int param4, int param5, int param6, int param7, byte param8) {
        RuntimeException var9 = null;
        int var9_int = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int stackIn_34_0 = 0;
        int stackIn_34_1 = 0;
        int stackIn_51_0 = 0;
        int stackIn_51_1 = 0;
        RuntimeException stackIn_81_0 = null;
        StringBuilder stackIn_81_1 = null;
        RuntimeException stackIn_82_0 = null;
        StringBuilder stackIn_82_1 = null;
        RuntimeException stackIn_83_0 = null;
        StringBuilder stackIn_83_1 = null;
        String stackIn_83_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_33_0 = 0;
        int stackOut_33_1 = 0;
        int stackOut_50_0 = 0;
        int stackOut_50_1 = 0;
        RuntimeException stackOut_80_0 = null;
        StringBuilder stackOut_80_1 = null;
        RuntimeException stackOut_82_0 = null;
        StringBuilder stackOut_82_1 = null;
        String stackOut_82_2 = null;
        RuntimeException stackOut_81_0 = null;
        StringBuilder stackOut_81_1 = null;
        String stackOut_81_2 = null;
        var19 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              if ((param7 ^ -1) > -1) {
                break L1;
              } else {
                if (bl.field_i > param1) {
                  L2: {
                    if (-1 >= (param0 ^ -1)) {
                      break L2;
                    } else {
                      if (param6 >= 0) {
                        break L2;
                      } else {
                        if (-1 < (param3 ^ -1)) {
                          decompiledRegionSelector0 = 1;
                          break L0;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                  L3: {
                    if (bl.field_f > param0) {
                      break L3;
                    } else {
                      if (bl.field_f > param6) {
                        break L3;
                      } else {
                        if (bl.field_f > param3) {
                          break L3;
                        } else {
                          decompiledRegionSelector0 = 2;
                          break L0;
                        }
                      }
                    }
                  }
                  L4: {
                    if (param8 == -115) {
                      break L4;
                    } else {
                      rl.a(125);
                      break L4;
                    }
                  }
                  L5: {
                    L6: {
                      var14 = param7 - param1;
                      if (param4 != param1) {
                        break L6;
                      } else {
                        L7: {
                          L8: {
                            if (param7 != param1) {
                              break L8;
                            } else {
                              var11 = 0;
                              var12 = 0;
                              var9_int = param0 << -930374320;
                              var10 = param6 << 556950736;
                              if (var19 == 0) {
                                break L7;
                              } else {
                                break L8;
                              }
                            }
                          }
                          L9: {
                            var15 = -param4 + param7;
                            if (param6 <= param0) {
                              break L9;
                            } else {
                              var10 = param6 << -1455357968;
                              var11 = (param3 + -param0 << -1234607312) / var14;
                              var9_int = param0 << -2146856624;
                              var12 = (param3 - param6 << 694387952) / var15;
                              if (var19 == 0) {
                                break L7;
                              } else {
                                break L9;
                              }
                            }
                          }
                          var10 = param0 << -661359792;
                          var9_int = param6 << 1593149648;
                          var12 = (-param0 + param3 << -110628944) / var14;
                          var11 = (param3 + -param6 << 1155903504) / var15;
                          break L7;
                        }
                        var13 = 0;
                        if (param1 >= 0) {
                          break L5;
                        } else {
                          param1 = Math.min(-param1, -param1 + param4);
                          var10 = var10 + var12 * param1;
                          var9_int = var9_int + param1 * var11;
                          param1 = 0;
                          if (var19 == 0) {
                            break L5;
                          } else {
                            break L6;
                          }
                        }
                      }
                    }
                    L10: {
                      L11: {
                        var10 = param0 << -614037232;
                        var9_int = param0 << -614037232;
                        var15 = -param1 + param4;
                        var11 = (-param0 + param6 << 1988041232) / var15;
                        var12 = (param3 + -param0 << -1773292208) / var14;
                        if (var11 >= var12) {
                          break L11;
                        } else {
                          var13 = 0;
                          if (var19 == 0) {
                            break L10;
                          } else {
                            break L11;
                          }
                        }
                      }
                      var13 = 1;
                      var16 = var11;
                      var11 = var12;
                      var12 = var16;
                      break L10;
                    }
                    L12: {
                      L13: {
                        L14: {
                          if (param1 >= 0) {
                            break L14;
                          } else {
                            L15: {
                              if (0 > param4) {
                                break L15;
                              } else {
                                param1 = -param1;
                                var9_int = var9_int + var11 * param1;
                                var10 = var10 + param1 * var12;
                                param1 = 0;
                                if (var19 == 0) {
                                  break L14;
                                } else {
                                  break L15;
                                }
                              }
                            }
                            param1 = param4 + -param1;
                            var10 = var10 + param1 * var12;
                            var9_int = var9_int + var11 * param1;
                            param1 = param4;
                            if (var19 == 0) {
                              break L13;
                            } else {
                              break L14;
                            }
                          }
                        }
                        var16 = bl.field_b[param1];
                        L16: while (true) {
                          if (param1 >= param4) {
                            break L13;
                          } else {
                            var17 = var9_int >> -608062192;
                            stackOut_33_0 = var17 ^ -1;
                            stackOut_33_1 = bl.field_f ^ -1;
                            stackIn_51_0 = stackOut_33_0;
                            stackIn_51_1 = stackOut_33_1;
                            stackIn_34_0 = stackOut_33_0;
                            stackIn_34_1 = stackOut_33_1;
                            if (var19 != 0) {
                              break L12;
                            } else {
                              L17: {
                                if (stackIn_34_0 > stackIn_34_1) {
                                  L18: {
                                    var18 = (var10 >> 72852720) + -(var9_int >> 2049105808);
                                    if (var18 != 0) {
                                      break L18;
                                    } else {
                                      if ((var17 ^ -1) > -1) {
                                        break L17;
                                      } else {
                                        if (bl.field_f <= var17) {
                                          break L17;
                                        } else {
                                          rh.a(param5, var18, var17 - -var16, param2, (byte) -122);
                                          if (var19 == 0) {
                                            break L17;
                                          } else {
                                            break L18;
                                          }
                                        }
                                      }
                                    }
                                  }
                                  L19: {
                                    if (var18 + var17 < bl.field_f) {
                                      break L19;
                                    } else {
                                      var18 = -1 + (-var17 + bl.field_f);
                                      break L19;
                                    }
                                  }
                                  L20: {
                                    if (-1 < (var17 ^ -1)) {
                                      break L20;
                                    } else {
                                      rh.a(param5, var18, var17 - -var16, param2, (byte) -84);
                                      if (var19 == 0) {
                                        break L17;
                                      } else {
                                        break L20;
                                      }
                                    }
                                  }
                                  rh.a(param5, var17 + var18, var16, param2, (byte) -68);
                                  break L17;
                                } else {
                                  break L17;
                                }
                              }
                              param1++;
                              if (param1 < bl.field_i) {
                                var10 = var10 + var12;
                                var9_int = var9_int + var11;
                                var16 = var16 + gb.field_d;
                                continue L16;
                              } else {
                                decompiledRegionSelector0 = 3;
                                break L0;
                              }
                            }
                          }
                        }
                      }
                      stackOut_50_0 = param7;
                      stackOut_50_1 = -param4;
                      stackIn_51_0 = stackOut_50_0;
                      stackIn_51_1 = stackOut_50_1;
                      break L12;
                    }
                    L21: {
                      var16 = stackIn_51_0 + stackIn_51_1;
                      if (var16 == 0) {
                        break L21;
                      } else {
                        L22: {
                          L23: {
                            if (var13 == 0) {
                              break L23;
                            } else {
                              var10 = param6 << -427170832;
                              if (var19 == 0) {
                                break L22;
                              } else {
                                break L23;
                              }
                            }
                          }
                          var9_int = param6 << 2046612176;
                          break L22;
                        }
                        var17 = param3 << 1137524272;
                        var11 = (var17 - var9_int) / var16;
                        var12 = (-var10 + var17) / var16;
                        if (var19 == 0) {
                          break L5;
                        } else {
                          break L21;
                        }
                      }
                    }
                    var12 = 0;
                    var11 = 0;
                    break L5;
                  }
                  L24: {
                    if (0 > param1) {
                      param1 = -param1;
                      var9_int = var9_int + param1 * var11;
                      var10 = var10 + param1 * var12;
                      param1 = 0;
                      break L24;
                    } else {
                      break L24;
                    }
                  }
                  var15 = bl.field_b[param1];
                  L25: while (true) {
                    L26: {
                      if (param1 >= param7) {
                        break L26;
                      } else {
                        var16 = var9_int >> 242346640;
                        if (var19 != 0) {
                          break L26;
                        } else {
                          L27: {
                            if (var16 >= bl.field_f) {
                              break L27;
                            } else {
                              L28: {
                                var17 = -(var9_int >> 1880340560) + (var10 >> 1476034800);
                                if (var17 == 0) {
                                  break L28;
                                } else {
                                  L29: {
                                    if (bl.field_f > var16 + var17) {
                                      break L29;
                                    } else {
                                      var17 = -1 + -var16 + bl.field_f;
                                      break L29;
                                    }
                                  }
                                  L30: {
                                    if (var16 < 0) {
                                      break L30;
                                    } else {
                                      rh.a(param5, var17, var16 - -var15, param2, (byte) -98);
                                      if (var19 == 0) {
                                        break L27;
                                      } else {
                                        break L30;
                                      }
                                    }
                                  }
                                  rh.a(param5, var16 + var17, var15, param2, (byte) -113);
                                  if (var19 == 0) {
                                    break L27;
                                  } else {
                                    break L28;
                                  }
                                }
                              }
                              if (var16 < 0) {
                                break L27;
                              } else {
                                if (var16 < bl.field_f) {
                                  rh.a(param5, var17, var15 + var16, param2, (byte) -120);
                                  break L27;
                                } else {
                                  break L27;
                                }
                              }
                            }
                          }
                          param1++;
                          if (bl.field_i > param1) {
                            var9_int = var9_int + var11;
                            var15 = var15 + gb.field_d;
                            var10 = var10 + var12;
                            continue L25;
                          } else {
                            decompiledRegionSelector0 = 5;
                            break L0;
                          }
                        }
                      }
                    }
                    decompiledRegionSelector0 = 4;
                    break L0;
                  }
                } else {
                  break L1;
                }
              }
            }
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L31: {
            var9 = decompiledCaughtException;
            stackOut_80_0 = (RuntimeException) (var9);
            stackOut_80_1 = new StringBuilder().append("rl.A(").append(param0).append(',').append(param1).append(',');
            stackIn_82_0 = stackOut_80_0;
            stackIn_82_1 = stackOut_80_1;
            stackIn_81_0 = stackOut_80_0;
            stackIn_81_1 = stackOut_80_1;
            if (param2 == null) {
              stackOut_82_0 = (RuntimeException) ((Object) stackIn_82_0);
              stackOut_82_1 = (StringBuilder) ((Object) stackIn_82_1);
              stackOut_82_2 = "null";
              stackIn_83_0 = stackOut_82_0;
              stackIn_83_1 = stackOut_82_1;
              stackIn_83_2 = stackOut_82_2;
              break L31;
            } else {
              stackOut_81_0 = (RuntimeException) ((Object) stackIn_81_0);
              stackOut_81_1 = (StringBuilder) ((Object) stackIn_81_1);
              stackOut_81_2 = "{...}";
              stackIn_83_0 = stackOut_81_0;
              stackIn_83_1 = stackOut_81_1;
              stackIn_83_2 = stackOut_81_2;
              break L31;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_83_0), stackIn_83_2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return;
                } else {
                  return;
                }
              }
            }
          }
        }
    }

    rl(File param0, String param1, long param2) throws IOException {
        boolean discarded$0 = false;
        int var5_int = 0;
        try {
            if (param2 == -1L) {
                param2 = 9223372036854775807L;
            }
            if ((param2 ^ -1L) > (param0.length() ^ -1L)) {
                discarded$0 = param0.delete();
            }
            this.field_c = new RandomAccessFile(param0, param1);
            this.field_a = param2;
            this.field_f = 0L;
            var5_int = this.field_c.read();
            if ((var5_int ^ -1) != 0) {
                if (!param1.equals("r")) {
                    this.field_c.seek(0L);
                    this.field_c.write(var5_int);
                }
            }
            this.field_c.seek(0L);
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) ((Object) runtimeException), "rl.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
    }
}
