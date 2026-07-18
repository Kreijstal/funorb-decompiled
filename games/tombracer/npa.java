/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class npa {
    private int field_i;
    private boolean field_g;
    static nl field_f;
    private ji field_h;
    private af field_e;
    private int field_c;
    private nf field_b;
    private int field_d;
    private ffa[] field_a;

    npa(boolean param0, int param1) {
        this(5, param0, param1);
    }

    final void a(ffa param0, byte param1) {
        RuntimeException var3 = null;
        int var4 = 0;
        q var5 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        var4 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 > 72) {
                break L1;
              } else {
                ((npa) this).field_g = false;
                break L1;
              }
            }
            var5 = (q) (Object) ((npa) this).field_e.a(-128, (long)param0.a(true));
            L2: while (true) {
              if (var5 == null) {
                break L0;
              } else {
                L3: {
                  if (param0 != var5.a((byte) -128)) {
                    break L3;
                  } else {
                    var5.p(100);
                    var5.c(-7975);
                    int discarded$4 = -201;
                    ft.a(var5);
                    break L3;
                  }
                }
                var5 = (q) (Object) ((npa) this).field_e.b((byte) 27);
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var3;
            stackOut_9_1 = new StringBuilder().append("npa.A(");
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
              break L4;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L4;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ',' + param1 + ')');
        }
    }

    final ffa[] b(int param0, int param1, int param2, int param3, int param4) {
        if (param1 != -1) {
            return null;
        }
        return this.a(-1 + (param3 / 2 + param2), -(param3 / 2) + param2, -1 + (param0 + param4 / 2), (byte) -102, -(param4 / 2) + param0);
    }

    final ffa[] a(byte param0, ffa param1) {
        RuntimeException var3 = null;
        Object stackIn_2_0 = null;
        ffa[] stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        ffa[] stackOut_3_0 = null;
        Object stackOut_1_0 = null;
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
            if (param0 == -26) {
              stackOut_3_0 = ((npa) this).b(param1.e(9648), -1, param1.d(3), param1.c(-48), param1.a((byte) 55));
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (ffa[]) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3;
            stackOut_5_1 = new StringBuilder().append("npa.K(").append(param0).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ')');
        }
        return stackIn_4_0;
    }

    private final ffa[] a(int param0, int param1, int param2, int param3) {
        int var6 = 0;
        int var7 = 0;
        q var8 = null;
        int var9 = 0;
        ffa var10 = null;
        int var11 = 0;
        int var12 = 0;
        var12 = TombRacer.field_G ? 1 : 0;
        ((npa) this).field_b.a(-2147483648, (byte) 7, 32, 2147483647, param1 >> ((npa) this).field_c, param2 >> ((npa) this).field_c, param3 >> ((npa) this).field_c, param0 >> ((npa) this).field_c, 2147483647, -2147483648);
        ((npa) this).field_d = 0;
        L0: while (true) {
          if (((npa) this).field_b.field_d) {
            int discarded$3 = 0;
            return this.b();
          } else {
            var6 = ((npa) this).field_b.b((byte) 75);
            var7 = ((npa) this).field_b.b(2);
            var8 = (q) (Object) ((npa) this).field_h.a((byte) -119, (long)ira.a(var6, var7, (byte) 36));
            L1: while (true) {
              if (var8 == null) {
                ((npa) this).field_b.d(113);
                continue L0;
              } else {
                L2: {
                  if (!var8.a(var6, var7, true)) {
                    break L2;
                  } else {
                    var9 = 1;
                    var10 = var8.a((byte) -80);
                    var11 = 0;
                    L3: while (true) {
                      L4: {
                        if (var11 >= ((npa) this).field_d) {
                          break L4;
                        } else {
                          if (var10 == ((npa) this).field_a[var11]) {
                            var9 = 0;
                            break L4;
                          } else {
                            var11++;
                            continue L3;
                          }
                        }
                      }
                      if (var9 != 0) {
                        int fieldTemp$4 = ((npa) this).field_d;
                        ((npa) this).field_d = ((npa) this).field_d + 1;
                        ((npa) this).field_a[fieldTemp$4] = var8.a((byte) -96);
                        if (((npa) this).field_a.length > ((npa) this).field_d) {
                          break L2;
                        } else {
                          int discarded$5 = 0;
                          return this.b();
                        }
                      } else {
                        break L2;
                      }
                    }
                  }
                }
                var8 = (q) (Object) ((npa) this).field_h.b(-128);
                continue L1;
              }
            }
          }
        }
    }

    private final int a(int param0, int param1) {
        if (param0 != 2) {
            return 112;
        }
        if (0 > param1) {
            return (-31 + (param1 >> ((npa) this).field_c)) / 32;
        }
        return (param1 >> ((npa) this).field_c) / 32;
    }

    private final ffa[] a(int param0, int param1, int param2, byte param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        q var12 = null;
        int var13 = 0;
        ffa var14 = null;
        int var15 = 0;
        int var16 = 0;
        var16 = TombRacer.field_G ? 1 : 0;
        var6 = this.a(2, param1);
        var7 = this.a(2, param4);
        var8 = this.a(2, param0);
        var9 = this.a(2, param2);
        ((npa) this).field_d = 0;
        var10 = var6;
        L0: while (true) {
          if (var8 < var10) {
            int discarded$3 = 0;
            return this.b();
          } else {
            var11 = var7;
            L1: while (true) {
              if (var11 > var9) {
                var10++;
                continue L0;
              } else {
                var12 = (q) (Object) ((npa) this).field_h.a((byte) -80, (long)ira.a(var10, var11, (byte) -124));
                L2: while (true) {
                  if (var12 != null) {
                    L3: {
                      if (var12.a(var10, var11, true)) {
                        var13 = 1;
                        var14 = var12.a((byte) -75);
                        var15 = 0;
                        L4: while (true) {
                          L5: {
                            if (var15 >= ((npa) this).field_d) {
                              break L5;
                            } else {
                              if (((npa) this).field_a[var15] == var14) {
                                var13 = 0;
                                break L5;
                              } else {
                                var15++;
                                continue L4;
                              }
                            }
                          }
                          if (var13 != 0) {
                            int fieldTemp$4 = ((npa) this).field_d;
                            ((npa) this).field_d = ((npa) this).field_d + 1;
                            ((npa) this).field_a[fieldTemp$4] = var12.a((byte) -71);
                            if (((npa) this).field_d < ((npa) this).field_a.length) {
                              break L3;
                            } else {
                              int discarded$5 = 0;
                              return this.b();
                            }
                          } else {
                            break L3;
                          }
                        }
                      } else {
                        break L3;
                      }
                    }
                    var12 = (q) (Object) ((npa) this).field_h.b(-106);
                    continue L2;
                  } else {
                    var11++;
                    continue L1;
                  }
                }
              }
            }
          }
        }
    }

    public static void c() {
        field_f = null;
    }

    private final ffa[] b() {
        ffa[] var2 = new ffa[((npa) this).field_d];
        lua.a((Object[]) (Object) ((npa) this).field_a, 0, (Object[]) (Object) var2, 0, ((npa) this).field_d);
        return var2;
    }

    final void b(ffa param0, int param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        q var9 = null;
        q var10 = null;
        int var11 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        var11 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var3_int = this.a(2, param0.d(param1 + -7070) - param0.c(-55) / 2);
            var4 = this.a(2, param0.e(9648) - param0.a((byte) 55) / 2);
            if (param1 == 7073) {
              var5 = this.a(param1 + -7071, -1 + param0.d(3) + param0.c(-58) / 2);
              var6 = this.a(2, param0.e(param1 + 2575) - (-(param0.a((byte) 55) / 2) + 1));
              var7 = var3_int;
              L1: while (true) {
                if (var5 < var7) {
                  break L0;
                } else {
                  var8 = var4;
                  L2: while (true) {
                    if (var6 < var8) {
                      var7++;
                      continue L1;
                    } else {
                      if (!((npa) this).field_g) {
                        var9 = (q) (Object) ((npa) this).field_e.a(-121, (long)param0.a(true));
                        if (var9 == null) {
                          int discarded$1 = 1;
                          var10 = vw.a(var7, param0, var8);
                          ((npa) this).field_e.a(param1 ^ -7074, (od) (Object) var10, (long)param0.a(true));
                          ((npa) this).field_h.a((long)var10.hashCode(), 115, (vg) (Object) var10);
                          var8++;
                          continue L2;
                        } else {
                          L3: {
                            if (var9.a(var8, var7, param0, 123)) {
                              break L3;
                            } else {
                              break L3;
                            }
                          }
                          var8++;
                          continue L2;
                        }
                      } else {
                        L4: {
                          if (!param0.a(32 << ((npa) this).field_c, (gma) null, 113, 32 << ((npa) this).field_c, var8 * 32 + 16 << ((npa) this).field_c, (ffa) null, 32 * var7 + 16 << ((npa) this).field_c, 0)) {
                            break L4;
                          } else {
                            break L4;
                          }
                        }
                        var8++;
                        continue L2;
                      }
                    }
                  }
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) var3;
            stackOut_18_1 = new StringBuilder().append("npa.H(");
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param0 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L5;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L5;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + ',' + param1 + ')');
        }
    }

    final ffa[] a(pc param0, byte param1) {
        RuntimeException var3 = null;
        ffa[] stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        ffa[] stackOut_2_0 = null;
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
              if (param1 <= -4) {
                break L1;
              } else {
                ((npa) this).field_b = null;
                break L1;
              }
            }
            int discarded$2 = 0;
            stackOut_2_0 = this.a(param0.field_e, param0.field_d, param0.field_k, param0.field_a);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("npa.C(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    final void a(ffa param0, int param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        q var8 = null;
        int var9 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        var9 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var3_int = this.a(2, param0.d(3) - param0.c(-14) / 2);
            var5 = -25 / ((param1 - 13) / 51);
            var4 = this.a(2, param0.e(9648) - param0.a((byte) 55) / 2);
            var6 = this.a(2, -1 + param0.d(3) - -(param0.c(-51) / 2));
            var7 = this.a(2, -1 + (param0.e(9648) + param0.a((byte) 55) / 2));
            var8 = (q) (Object) ((npa) this).field_e.a(-120, (long)param0.a(true));
            L1: while (true) {
              if (var8 == null) {
                break L0;
              } else {
                L2: {
                  if (var8.a((byte) -76) != param0) {
                    break L2;
                  } else {
                    if (!var8.a(var7, var6, var4, var3_int, -98)) {
                      var8.p(104);
                      var8.c(-7975);
                      int discarded$1 = -201;
                      ft.a(var8);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                }
                var8 = (q) (Object) ((npa) this).field_e.b((byte) 119);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var3;
            stackOut_9_1 = new StringBuilder().append("npa.G(");
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
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ',' + param1 + ')');
        }
    }

    final static boolean a() {
        return wt.field_d == gsa.field_y;
    }

    private npa(int param0, boolean param1, int param2) {
        ((npa) this).field_b = new nf();
        ((npa) this).field_a = new ffa[128];
        ((npa) this).field_i = 1 << param0;
        ((npa) this).field_h = new ji(((npa) this).field_i);
        ((npa) this).field_e = new af(((npa) this).field_i);
        ((npa) this).field_g = param1 ? true : false;
        ((npa) this).field_c = param2;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = new nl("");
    }
}
