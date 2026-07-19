/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lb {
    static String field_e;
    private int field_a;
    static String[] field_f;
    private int[] field_d;
    private boolean field_b;
    private int field_c;

    final static int a(byte param0) {
        if (param0 != 47) {
            field_f = (String[]) null;
            return fh.field_f;
        }
        return fh.field_f;
    }

    final static void a(int param0, int param1, int param2, o param3, int param4, int param5) {
        int incrementValue$1 = 0;
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
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
        int var20 = 0;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_36_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        String stackOut_35_2 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        var20 = wizardrun.field_H;
        try {
          L0: {
            L1: {
              var6_int = (param0 - param1 << -1229508728) / param3.field_x;
              param4 = param4 + param3.field_v;
              var7 = param3.field_u * var6_int + (param1 << 1434520104);
              param2 = param2 + param3.field_u;
              var8 = param2 - -(ed.field_h * param4);
              var9 = 0;
              if (param5 < -80) {
                break L1;
              } else {
                field_f = (String[]) null;
                break L1;
              }
            }
            L2: {
              var10 = param3.field_p;
              var11 = param3.field_z;
              var12 = ed.field_h + -var11;
              var13 = 0;
              if (ed.field_i > param4) {
                var14 = -param4 + ed.field_i;
                var9 = var9 + var14 * var11;
                param4 = ed.field_i;
                var10 = var10 - var14;
                var8 = var8 + var14 * ed.field_h;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (ed.field_c > param2) {
                var14 = ed.field_c - param2;
                var7 = var7 + var6_int * var14;
                var8 = var8 + var14;
                var9 = var9 + var14;
                var11 = var11 - var14;
                var12 = var12 + var14;
                param2 = ed.field_c;
                var13 = var13 + var14;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (ed.field_b >= var10 + param4) {
                break L4;
              } else {
                var10 = var10 - (param4 - -var10 - ed.field_b);
                break L4;
              }
            }
            L5: {
              if (ed.field_l >= param2 - -var11) {
                break L5;
              } else {
                var14 = -ed.field_l + var11 + param2;
                var11 = var11 - var14;
                var13 = var13 + var14;
                var12 = var12 + var14;
                break L5;
              }
            }
            L6: {
              if (0 >= var11) {
                break L6;
              } else {
                if (0 < var10) {
                  param4 = -var10;
                  L7: while (true) {
                    if (-1 >= (param4 ^ -1)) {
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      var14 = var7;
                      param2 = -var11;
                      L8: while (true) {
                        if (0 <= param2) {
                          var8 = var8 + var12;
                          var9 = var9 + var13;
                          param4++;
                          continue L7;
                        } else {
                          L9: {
                            var15 = var14 >> -642764376;
                            var16 = 256 - var15;
                            var14 = var14 + var6_int;
                            if (-1 >= (var15 ^ -1)) {
                              L10: {
                                incrementValue$1 = var9;
                                var9++;
                                var17 = param3.field_B[incrementValue$1];
                                if (var17 != 0) {
                                  if (var15 <= 255) {
                                    var18 = ed.field_k[var8];
                                    var19 = 16711935 & (16711935 & var17) * var15 + (16711935 & var18) * var16 >> -1754499640;
                                    ed.field_k[var8] = (kl.b(16711838, kl.b(65280, var18) * var16 + var15 * kl.b(var17, 65280)) >> -324843128) + var19;
                                    break L10;
                                  } else {
                                    ed.field_k[var8] = var17;
                                    break L10;
                                  }
                                } else {
                                  break L10;
                                }
                              }
                              var8++;
                              break L9;
                            } else {
                              var9++;
                              var8++;
                              break L9;
                            }
                          }
                          param2++;
                          continue L8;
                        }
                      }
                    }
                  }
                } else {
                  break L6;
                }
              }
            }
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var6 = decompiledCaughtException;
            stackOut_33_0 = (RuntimeException) (var6);
            stackOut_33_1 = new StringBuilder().append("lb.H(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_35_0 = stackOut_33_0;
            stackIn_35_1 = stackOut_33_1;
            stackIn_34_0 = stackOut_33_0;
            stackIn_34_1 = stackOut_33_1;
            if (param3 == null) {
              stackOut_35_0 = (RuntimeException) ((Object) stackIn_35_0);
              stackOut_35_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackOut_35_2 = "null";
              stackIn_36_0 = stackOut_35_0;
              stackIn_36_1 = stackOut_35_1;
              stackIn_36_2 = stackOut_35_2;
              break L11;
            } else {
              stackOut_34_0 = (RuntimeException) ((Object) stackIn_34_0);
              stackOut_34_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackOut_34_2 = "{...}";
              stackIn_36_0 = stackOut_34_0;
              stackIn_36_1 = stackOut_34_1;
              stackIn_36_2 = stackOut_34_2;
              break L11;
            }
          }
          throw bd.a((Throwable) ((Object) stackIn_36_0), stackIn_36_2 + ',' + param4 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final int a(int param0) {
        int var2 = 46 / ((-57 - param0) / 42);
        return 1 + this.field_a;
    }

    private final void a(byte param0, int param1, int param2) {
        if (param2 <= this.field_a) {
          if (param0 <= 100) {
            return;
          } else {
            L0: {
              if (param2 >= this.field_d.length) {
                this.c(param2, 65);
                break L0;
              } else {
                break L0;
              }
            }
            this.field_d[param2] = param1;
            return;
          }
        } else {
          this.field_a = param2;
          if (param0 <= 100) {
            return;
          } else {
            L1: {
              if (param2 >= this.field_d.length) {
                this.c(param2, 65);
                break L1;
              } else {
                break L1;
              }
            }
            this.field_d[param2] = param1;
            return;
          }
        }
    }

    public static void b(byte param0) {
        field_e = null;
        field_f = null;
        if (param0 != 55) {
            field_f = (String[]) null;
        }
    }

    final void e(int param0, int param1) {
        if (param0 != 16711838) {
          this.field_d = (int[]) null;
          this.a((byte) 103, param1, 1 + this.field_a);
          return;
        } else {
          this.a((byte) 103, param1, 1 + this.field_a);
          return;
        }
    }

    private final int b(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        java.applet.Applet var5 = null;
        var4 = wizardrun.field_H;
        if (param1 != 0) {
          var5 = (java.applet.Applet) null;
          lb.a(54, (java.applet.Applet) null);
          var3 = this.field_d.length;
          L0: while (true) {
            if (param0 < var3) {
              return var3;
            } else {
              if (this.field_b) {
                if (var3 == 0) {
                  var3 = 1;
                  continue L0;
                } else {
                  var3 = var3 * this.field_c;
                  continue L0;
                }
              } else {
                var3 = var3 + this.field_c;
                continue L0;
              }
            }
          }
        } else {
          var3 = this.field_d.length;
          L1: while (true) {
            if (param0 < var3) {
              return var3;
            } else {
              if (this.field_b) {
                if (var3 == 0) {
                  var3 = 1;
                  continue L1;
                } else {
                  var3 = var3 * this.field_c;
                  continue L1;
                }
              } else {
                var3 = var3 + this.field_c;
                continue L1;
              }
            }
          }
        }
    }

    final static void a(int param0, java.applet.Applet param1) {
        try {
            java.net.URL var2 = null;
            Exception var2_ref = null;
            RuntimeException var2_ref2 = null;
            RuntimeException stackIn_7_0 = null;
            StringBuilder stackIn_7_1 = null;
            RuntimeException stackIn_8_0 = null;
            StringBuilder stackIn_8_1 = null;
            RuntimeException stackIn_9_0 = null;
            StringBuilder stackIn_9_1 = null;
            String stackIn_9_2 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
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
                try {
                  L1: {
                    var2 = new java.net.URL(param1.getCodeBase(), "toserverlist.ws");
                    if (param0 >= 16) {
                      param1.getAppletContext().showDocument(jl.a(-119, var2, param1), "_top");
                      decompiledRegionSelector0 = 1;
                      break L1;
                    } else {
                      decompiledRegionSelector0 = 0;
                      break L1;
                    }
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var2_ref = (Exception) (Object) decompiledCaughtException;
                  var2_ref.printStackTrace();
                  return;
                }
                if (decompiledRegionSelector0 == 0) {
                  break L0;
                } else {
                  return;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L2: {
                var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_6_0 = (RuntimeException) (var2_ref2);
                stackOut_6_1 = new StringBuilder().append("lb.B(").append(param0).append(',');
                stackIn_8_0 = stackOut_6_0;
                stackIn_8_1 = stackOut_6_1;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                if (param1 == null) {
                  stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
                  stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
                  stackOut_8_2 = "null";
                  stackIn_9_0 = stackOut_8_0;
                  stackIn_9_1 = stackOut_8_1;
                  stackIn_9_2 = stackOut_8_2;
                  break L2;
                } else {
                  stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
                  stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
                  stackOut_7_2 = "{...}";
                  stackIn_9_0 = stackOut_7_0;
                  stackIn_9_1 = stackOut_7_1;
                  stackIn_9_2 = stackOut_7_2;
                  break L2;
                }
              }
              throw bd.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void d(int param0, int param1) {
        if ((param1 ^ -1) <= param0) {
          if (this.field_a >= param1) {
            if (this.field_a != param1) {
              g.a(this.field_d, param1 - -1, this.field_d, param1, -param1 + this.field_a);
              this.field_a = this.field_a - 1;
              return;
            } else {
              this.field_a = this.field_a - 1;
              return;
            }
          } else {
            throw new ArrayIndexOutOfBoundsException(param1);
          }
        } else {
          throw new ArrayIndexOutOfBoundsException(param1);
        }
    }

    private final void c(int param0, int param1) {
        int[] var5 = new int[this.b(param0, 0)];
        int[] var3 = var5;
        g.a(this.field_d, 0, var5, 0, this.field_d.length);
        int var4 = 80 % ((1 - param1) / 41);
        this.field_d = var5;
    }

    private lb() throws Throwable {
        throw new Error();
    }

    final int a(int param0, int param1) {
        if (param0 > -60) {
            java.applet.Applet var4 = (java.applet.Applet) null;
            lb.a(-122, (java.applet.Applet) null);
            if (!(this.field_a >= param1)) {
                throw new ArrayIndexOutOfBoundsException(param1);
            }
            return this.field_d[param1];
        }
        if (!(this.field_a >= param1)) {
            throw new ArrayIndexOutOfBoundsException(param1);
        }
        return this.field_d[param1];
    }

    static {
    }
}
