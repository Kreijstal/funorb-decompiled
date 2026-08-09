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
        int var4 = 0;
        q var5 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 > 72) {
                break L1;
              } else {
                this.field_g = false;
                break L1;
              }
            }
            var5 = (q) ((Object) this.field_e.a(-128, (long)param0.a(true)));
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
                    ft.a(var5, -201);
                    break L3;
                  }
                }
                var5 = (q) ((Object) this.field_e.b((byte) 27));
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var3);

            stackIn_11_1 = new StringBuilder().append("npa.A(");

            if (param0 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L4;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L4;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param1 + ')');
        }
    }

    final ffa[] b(int param0, int param1, int param2, int param3, int param4) {
        if (param1 != -1) {
            return (ffa[]) null;
        }
        return this.a(-1 + (param3 / 2 + param2), -(param3 / 2) + param2, -1 + (param0 + param4 / 2), (byte) -102, -(param4 / 2) + param0);
    }

    final ffa[] a(byte param0, ffa param1) {
        RuntimeException var3 = null;
        ffa[] stackIn_2_0 = null;
        ffa[] stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 == -26) {
              stackIn_4_0 = this.b(param1.e(9648), -1, param1.d(3), param1.c(-48), param1.a((byte) 55));
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (ffa[]) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var3);

            stackIn_7_1 = new StringBuilder().append("npa.K(").append(param0).append(',');

            if (param1 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    private final ffa[] a(int param0, int param1, int param2, int param3, int param4) {
        int fieldTemp$0 = 0;
        int var6;
        int var7;
        q var8;
        int var9;
        ffa var10;
        int var11;
        int var12;
        var12 = TombRacer.field_G ? 1 : 0;
        this.field_b.a(-2147483648, (byte) 7, 32, 2147483647, param1 >> this.field_c, param2 >> this.field_c, param3 >> this.field_c, param0 >> this.field_c, 2147483647, -2147483648);
        this.field_d = param4;
        L0: while (true) {
          if (this.field_b.field_d) {
            return this.b(0);
          } else {
            var6 = this.field_b.b((byte) 75);
            var7 = this.field_b.b(2);
            var8 = (q) ((Object) this.field_h.a((byte) -119, (long)ira.a(var6, var7, (byte) 36)));
            L1: while (true) {
              if (var8 == null) {
                this.field_b.d(113);
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
                        if (var11 >= this.field_d) {
                          break L4;
                        } else {
                          if (var10 == this.field_a[var11]) {
                            var9 = 0;
                            break L4;
                          } else {
                            var11++;
                            continue L3;
                          }
                        }
                      }
                      if (var9 != 0) {
                        fieldTemp$0 = this.field_d;
                        this.field_d = this.field_d + 1;
                        this.field_a[fieldTemp$0] = var8.a((byte) -96);
                        if (this.field_a.length > this.field_d) {
                          break L2;
                        } else {
                          return this.b(0);
                        }
                      } else {
                        break L2;
                      }
                    }
                  }
                }
                var8 = (q) ((Object) this.field_h.b(-128));
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
            return (-31 + (param1 >> this.field_c)) / 32;
        }
        return (param1 >> this.field_c) / 32;
    }

    private final ffa[] a(int param0, int param1, int param2, byte param3, int param4) {
        int fieldTemp$0 = 0;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        q var12;
        int var13;
        ffa var14;
        int var15;
        int var16;
        L0: {
          var16 = TombRacer.field_G ? 1 : 0;
          var6 = this.a(2, param1);
          if (param3 < -46) {
            break L0;
          } else {
            this.field_i = -110;
            break L0;
          }
        }
        var7 = this.a(2, param4);
        var8 = this.a(2, param0);
        var9 = this.a(2, param2);
        this.field_d = 0;
        var10 = var6;
        L1: while (true) {
          if (var8 < var10) {
            return this.b(0);
          } else {
            var11 = var7;
            L2: while (true) {
              if (var11 > var9) {
                var10++;
                continue L1;
              } else {
                var12 = (q) ((Object) this.field_h.a((byte) -80, (long)ira.a(var10, var11, (byte) -124)));
                L3: while (true) {
                  if (var12 != null) {
                    L4: {
                      if (var12.a(var10, var11, true)) {
                        var13 = 1;
                        var14 = var12.a((byte) -75);
                        var15 = 0;
                        L5: while (true) {
                          L6: {
                            if (var15 >= this.field_d) {
                              break L6;
                            } else {
                              if (this.field_a[var15] == var14) {
                                var13 = 0;
                                break L6;
                              } else {
                                var15++;
                                continue L5;
                              }
                            }
                          }
                          if (var13 != 0) {
                            fieldTemp$0 = this.field_d;
                            this.field_d = this.field_d + 1;
                            this.field_a[fieldTemp$0] = var12.a((byte) -71);
                            if (this.field_d < this.field_a.length) {
                              break L4;
                            } else {
                              return this.b(0);
                            }
                          } else {
                            break L4;
                          }
                        }
                      } else {
                        break L4;
                      }
                    }
                    var12 = (q) ((Object) this.field_h.b(-106));
                    continue L3;
                  } else {
                    var11++;
                    continue L2;
                  }
                }
              }
            }
          }
        }
    }

    public static void c(int param0) {
        if (param0 != -2147483648) {
            return;
        }
        field_f = null;
    }

    private final ffa[] b(int param0) {
        ffa[] var2 = new ffa[this.field_d];
        lua.a(this.field_a, param0, var2, 0, this.field_d);
        return var2;
    }

    final void b(ffa param0, int param1) {
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        q var9 = null;
        q var10 = null;
        int var11 = 0;
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
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  var8 = var4;
                  L2: while (true) {
                    if (var6 < var8) {
                      var7++;
                      continue L1;
                    } else {
                      L3: {
                        if (!this.field_g) {
                          break L3;
                        } else {
                          if (param0.a(32 << this.field_c, (gma) null, 113, 32 << this.field_c, var8 * 32 + 16 << this.field_c, (ffa) null, 32 * var7 + 16 << this.field_c, 0)) {
                            break L3;
                          } else {
                            var8++;
                            continue L2;
                          }
                        }
                      }
                      var9 = (q) ((Object) this.field_e.a(-121, (long)param0.a(true)));
                      L4: while (true) {
                        if (var9 == null) {
                          var10 = vw.a(var7, param0, var8, true);
                          this.field_e.a(param1 ^ -7074, var10, (long)param0.a(true));
                          this.field_h.a((long)var10.hashCode(), 115, var10);
                          var8++;
                          continue L2;
                        } else {
                          if (!var9.a(var8, var7, param0, 123)) {
                            var9 = (q) ((Object) this.field_e.b((byte) 35));
                            continue L4;
                          } else {
                            var8++;
                            continue L2;
                          }
                        }
                      }
                    }
                  }
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackIn_21_0 = (RuntimeException) (var3);

            stackIn_21_1 = new StringBuilder().append("npa.H(");

            if (param0 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L5;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L5;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final ffa[] a(pc param0, byte param1) {
        RuntimeException var3 = null;
        ffa[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 <= -4) {
                break L1;
              } else {
                this.field_b = (nf) null;
                break L1;
              }
            }
            stackIn_3_0 = this.a(param0.field_e, param0.field_d, param0.field_k, param0.field_a, 0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("npa.C(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    final void a(ffa param0, int param1) {
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        q var8 = null;
        int var9 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var9 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var3_int = this.a(2, param0.d(3) - param0.c(-14) / 2);
            var5 = -25 / ((param1 - 13) / 51);
            var4 = this.a(2, param0.e(9648) - param0.a((byte) 55) / 2);
            var6 = this.a(2, -1 + param0.d(3) - -(param0.c(-51) / 2));
            var7 = this.a(2, -1 + (param0.e(9648) + param0.a((byte) 55) / 2));
            var8 = (q) ((Object) this.field_e.a(-120, (long)param0.a(true)));
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
                      ft.a(var8, -201);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                }
                var8 = (q) ((Object) this.field_e.b((byte) 119));
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var3);

            stackIn_11_1 = new StringBuilder().append("npa.G(");

            if (param0 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L3;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L3;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param1 + ')');
        }
    }

    final static boolean a(int param0) {
        if (param0 != 32) {
            npa.c(-128);
        }
        return wt.field_d == gsa.field_y ? true : false;
    }

    private npa(int param0, boolean param1, int param2) {
        this.field_b = new nf();
        this.field_a = new ffa[128];
        this.field_i = 1 << param0;
        this.field_h = new ji(this.field_i);
        this.field_e = new af(this.field_i);
        this.field_g = param1 ? true : false;
        this.field_c = param2;
    }

    static {
        field_f = new nl("");
    }
}
