/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dl extends rb {
    static jb field_p;
    private int field_q;
    private fc field_l;
    static pa[] field_n;
    static long field_o;
    static vd[] field_m;

    public static void l(byte param0) {
        try {
            field_m = null;
            field_n = null;
            field_p = null;
            if (param0 <= 91) {
                dl.l((byte) -94);
            }
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) (Object) runtimeException, "dl.B(" + param0 + ')');
        }
    }

    final void g(int param0, int param1) {
        if (param0 < 35) {
            return;
        }
        try {
            int fieldTemp$0 = ((dl) this).field_g;
            ((dl) this).field_g = ((dl) this).field_g + 1;
            ((dl) this).field_f[fieldTemp$0] = (byte)(((dl) this).field_l.b(256) + param1);
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) (Object) runtimeException, "dl.I(" + param0 + ',' + param1 + ')');
        }
    }

    final void a(byte[] param0, int param1, int param2, boolean param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var6 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (!param3) {
                break L1;
              } else {
                field_o = 102L;
                break L1;
              }
            }
            var5_int = 0;
            L2: while (true) {
              L3: {
                L4: {
                  if (~param1 >= ~var5_int) {
                    break L4;
                  } else {
                    int fieldTemp$2 = ((dl) this).field_g;
                    ((dl) this).field_g = ((dl) this).field_g + 1;
                    param0[param2 + var5_int] = (byte)(((dl) this).field_f[fieldTemp$2] + -((dl) this).field_l.b(256));
                    var5_int++;
                    if (var6 != 0) {
                      break L3;
                    } else {
                      if (var6 == 0) {
                        continue L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                break L3;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var5;
            stackOut_11_1 = new StringBuilder().append("dl.E(");
            stackIn_14_0 = stackOut_11_0;
            stackIn_14_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L5;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_15_0 = stackOut_12_0;
              stackIn_15_1 = stackOut_12_1;
              stackIn_15_2 = stackOut_12_2;
              break L5;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void j(int param0) {
        try {
            ((dl) this).field_q = 8 * ((dl) this).field_g;
            int var2_int = -79 / ((-15 - param0) / 44);
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) (Object) runtimeException, "dl.A(" + param0 + ')');
        }
    }

    final void m(byte param0) {
        try {
            ((dl) this).field_g = (((dl) this).field_q + 7) / 8;
            if (param0 <= 33) {
                field_n = null;
            }
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) (Object) runtimeException, "dl.C(" + param0 + ')');
        }
    }

    dl(byte[] param0) {
        super(param0);
    }

    final static String k(byte param0) {
        RuntimeException var1 = null;
        String var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_5_0 = 0;
        int stackIn_5_1 = 0;
        int stackIn_21_0 = 0;
        int stackIn_21_1 = 0;
        String stackIn_25_0 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_4_1 = 0;
        byte stackOut_20_0 = 0;
        int stackOut_20_1 = 0;
        String stackOut_24_0 = null;
        var5 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                var1_ref = "(" + ga.field_l + " " + kg.field_b + " " + hi.field_w + ") " + qs.field_b;
                if (ag.field_s <= 0) {
                  break L2;
                } else {
                  var1_ref = var1_ref + ":";
                  var2 = 0;
                  L3: while (true) {
                    if (ag.field_s <= var2) {
                      break L2;
                    } else {
                      var1_ref = var1_ref + ' ';
                      var3 = nm.field_c.field_f[var2] & 255;
                      var4 = var3 >> 1380495364;
                      stackOut_4_0 = var4;
                      stackOut_4_1 = 10;
                      stackIn_21_0 = stackOut_4_0;
                      stackIn_21_1 = stackOut_4_1;
                      stackIn_5_0 = stackOut_4_0;
                      stackIn_5_1 = stackOut_4_1;
                      if (var5 != 0) {
                        break L1;
                      } else {
                        L4: {
                          L5: {
                            if (stackIn_5_0 >= stackIn_5_1) {
                              break L5;
                            } else {
                              var4 += 48;
                              if (var5 == 0) {
                                break L4;
                              } else {
                                break L5;
                              }
                            }
                          }
                          var4 += 55;
                          break L4;
                        }
                        L6: {
                          L7: {
                            var3 = var3 & 15;
                            if (var3 >= 10) {
                              break L7;
                            } else {
                              var3 += 48;
                              if (var5 == 0) {
                                break L6;
                              } else {
                                break L7;
                              }
                            }
                          }
                          var3 += 55;
                          break L6;
                        }
                        var1_ref = var1_ref + (char)var4;
                        var1_ref = var1_ref + (char)var3;
                        var2++;
                        if (var5 == 0) {
                          continue L3;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                }
              }
              stackOut_20_0 = param0;
              stackOut_20_1 = 65;
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              break L1;
            }
            L8: {
              if (stackIn_21_0 == stackIn_21_1) {
                break L8;
              } else {
                String discarded$1 = dl.k((byte) -78);
                break L8;
              }
            }
            stackOut_24_0 = (String) var1_ref;
            stackIn_25_0 = stackOut_24_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw pn.a((Throwable) (Object) var1, "dl.H(" + param0 + ')');
        }
        return stackIn_25_0;
    }

    final void a(boolean param0, int[] param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            L1: {
              if (param0) {
                break L1;
              } else {
                ((dl) this).a(true, (int[]) null);
                break L1;
              }
            }
            ((dl) this).field_l = new fc(param1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3;
            stackOut_5_1 = new StringBuilder().append("dl.F(").append(param0).append(',');
            stackIn_8_0 = stackOut_5_0;
            stackIn_8_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_9_0 = stackOut_6_0;
              stackIn_9_1 = stackOut_6_1;
              stackIn_9_2 = stackOut_6_2;
              break L2;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ')');
        }
    }

    dl(int param0) {
        super(param0);
    }

    final int j(byte param0) {
        RuntimeException var2 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        try {
          L0: {
            L1: {
              if (param0 <= -1) {
                break L1;
              } else {
                field_p = null;
                break L1;
              }
            }
            int fieldTemp$2 = ((dl) this).field_g;
            ((dl) this).field_g = ((dl) this).field_g + 1;
            stackOut_3_0 = 255 & ((dl) this).field_f[fieldTemp$2] - ((dl) this).field_l.b(256);
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw pn.a((Throwable) (Object) var2, "dl.G(" + param0 + ')');
        }
        return stackIn_4_0;
    }

    final int b(byte param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int stackIn_11_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        var7 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            var3_int = ((dl) this).field_q >> 947512803;
            var4 = 8 - (((dl) this).field_q & 7);
            var6 = 97 / ((17 - param0) / 60);
            ((dl) this).field_q = ((dl) this).field_q + param1;
            var5 = 0;
            L1: while (true) {
              L2: {
                L3: {
                  L4: {
                    if (param1 <= var4) {
                      break L4;
                    } else {
                      int incrementValue$2 = var3_int;
                      var3_int++;
                      var5 = var5 + ((kp.field_f[var4] & ((dl) this).field_f[incrementValue$2]) << param1 + -var4);
                      param1 = param1 - var4;
                      var4 = 8;
                      if (var7 != 0) {
                        break L3;
                      } else {
                        if (var7 == 0) {
                          continue L1;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                  if (param1 != var4) {
                    break L3;
                  } else {
                    var5 = var5 + (kp.field_f[var4] & ((dl) this).field_f[var3_int]);
                    if (var7 == 0) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                var5 = var5 + (((dl) this).field_f[var3_int] >> -param1 + var4 & kp.field_f[param1]);
                break L2;
              }
              stackOut_10_0 = var5;
              stackIn_11_0 = stackOut_10_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw pn.a((Throwable) (Object) var3, "dl.D(" + param0 + ',' + param1 + ')');
        }
        return stackIn_11_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = new jb();
    }
}
