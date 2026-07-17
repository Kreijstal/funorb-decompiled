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
        return fh.field_f;
    }

    final static void a(int param0, int param1, int param2, o param3, int param4, int param5) {
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
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_38_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        String stackOut_37_2 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        String stackOut_36_2 = null;
        var20 = wizardrun.field_H;
        try {
          L0: {
            L1: {
              var6_int = (param0 - param1 << 8) / param3.field_x;
              param4 = param4 + param3.field_v;
              var7 = param3.field_u * var6_int + (param1 << 8);
              param2 = param2 + param3.field_u;
              var8 = param2 - -(ed.field_h * param4);
              var9 = 0;
              if (param5 < -80) {
                break L1;
              } else {
                field_f = null;
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
                    if (param4 >= 0) {
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
                            var15 = var14 >> 8;
                            var16 = 256 - var15;
                            var14 = var14 + var6_int;
                            if (var15 >= 0) {
                              L10: {
                                int incrementValue$1 = var9;
                                var9++;
                                var17 = param3.field_B[incrementValue$1];
                                if (var17 != 0) {
                                  if (var15 <= 255) {
                                    var18 = ed.field_k[var8];
                                    var19 = 16711935 & (16711935 & var17) * var15 + (16711935 & var18) * var16 >> 8;
                                    ed.field_k[var8] = (kl.b(16711838, kl.b(65280, var18) * var16 + var15 * kl.b(var17, 65280)) >> 8) + var19;
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
                              param2++;
                              break L9;
                            } else {
                              var9++;
                              var8++;
                              param2++;
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
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var6 = decompiledCaughtException;
            stackOut_35_0 = (RuntimeException) var6;
            stackOut_35_1 = new StringBuilder().append("lb.H(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_37_0 = stackOut_35_0;
            stackIn_37_1 = stackOut_35_1;
            stackIn_36_0 = stackOut_35_0;
            stackIn_36_1 = stackOut_35_1;
            if (param3 == null) {
              stackOut_37_0 = (RuntimeException) (Object) stackIn_37_0;
              stackOut_37_1 = (StringBuilder) (Object) stackIn_37_1;
              stackOut_37_2 = "null";
              stackIn_38_0 = stackOut_37_0;
              stackIn_38_1 = stackOut_37_1;
              stackIn_38_2 = stackOut_37_2;
              break L11;
            } else {
              stackOut_36_0 = (RuntimeException) (Object) stackIn_36_0;
              stackOut_36_1 = (StringBuilder) (Object) stackIn_36_1;
              stackOut_36_2 = "{...}";
              stackIn_38_0 = stackOut_36_0;
              stackIn_38_1 = stackOut_36_1;
              stackIn_38_2 = stackOut_36_2;
              break L11;
            }
          }
          throw bd.a((Throwable) (Object) stackIn_38_0, stackIn_38_2 + 44 + param4 + 44 + param5 + 41);
        }
    }

    final int a(int param0) {
        int var2 = 46 / ((-57 - param0) / 42);
        return 1 + ((lb) this).field_a;
    }

    private final void a(byte param0, int param1, int param2) {
        if (param2 <= ((lb) this).field_a) {
          if (param0 <= 100) {
            return;
          } else {
            L0: {
              if (param2 >= ((lb) this).field_d.length) {
                this.c(param2, 65);
                break L0;
              } else {
                break L0;
              }
            }
            ((lb) this).field_d[param2] = param1;
            return;
          }
        } else {
          ((lb) this).field_a = param2;
          if (param0 <= 100) {
            return;
          } else {
            L1: {
              if (param2 >= ((lb) this).field_d.length) {
                this.c(param2, 65);
                break L1;
              } else {
                break L1;
              }
            }
            ((lb) this).field_d[param2] = param1;
            return;
          }
        }
    }

    public static void b(byte param0) {
        field_e = null;
        field_f = null;
    }

    final void e(int param0, int param1) {
        if (param0 != 16711838) {
          ((lb) this).field_d = null;
          this.a((byte) 103, param1, 1 + ((lb) this).field_a);
          return;
        } else {
          this.a((byte) 103, param1, 1 + ((lb) this).field_a);
          return;
        }
    }

    private final int b(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        var4 = wizardrun.field_H;
        var3 = ((lb) this).field_d.length;
        L0: while (true) {
          if (param0 < var3) {
            return var3;
          } else {
            if (((lb) this).field_b) {
              if (var3 == 0) {
                var3 = 1;
                continue L0;
              } else {
                var3 = var3 * ((lb) this).field_c;
                continue L0;
              }
            } else {
              var3 = var3 + ((lb) this).field_c;
              continue L0;
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
              try {
                var2 = new java.net.URL(param1.getCodeBase(), "toserverlist.ws");
                if (param0 >= 16) {
                  param1.getAppletContext().showDocument(jl.a(-119, var2, param1), "_top");
                  return;
                } else {
                  return;
                }
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var2_ref = (Exception) (Object) decompiledCaughtException;
                var2_ref.printStackTrace();
                return;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L0: {
                var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_6_0 = (RuntimeException) var2_ref2;
                stackOut_6_1 = new StringBuilder().append("lb.B(").append(param0).append(44);
                stackIn_8_0 = stackOut_6_0;
                stackIn_8_1 = stackOut_6_1;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                if (param1 == null) {
                  stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
                  stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
                  stackOut_8_2 = "null";
                  stackIn_9_0 = stackOut_8_0;
                  stackIn_9_1 = stackOut_8_1;
                  stackIn_9_2 = stackOut_8_2;
                  break L0;
                } else {
                  stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
                  stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
                  stackOut_7_2 = "{...}";
                  stackIn_9_0 = stackOut_7_0;
                  stackIn_9_1 = stackOut_7_1;
                  stackIn_9_2 = stackOut_7_2;
                  break L0;
                }
              }
              throw bd.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 41);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void d(int param0, int param1) {
        if (~param1 <= param0) {
          if (((lb) this).field_a >= param1) {
            if (((lb) this).field_a != param1) {
              g.a(((lb) this).field_d, param1 - -1, ((lb) this).field_d, param1, -param1 + ((lb) this).field_a);
              ((lb) this).field_a = ((lb) this).field_a - 1;
              return;
            } else {
              ((lb) this).field_a = ((lb) this).field_a - 1;
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
        g.a(((lb) this).field_d, 0, var5, 0, ((lb) this).field_d.length);
        int var4 = 0;
        ((lb) this).field_d = var5;
    }

    private lb() throws Throwable {
        throw new Error();
    }

    final int a(int param0, int param1) {
        if (param0 > -60) {
            Object var4 = null;
            lb.a(-122, (java.applet.Applet) null);
            if (!(((lb) this).field_a >= param1)) {
                throw new ArrayIndexOutOfBoundsException(param1);
            }
            return ((lb) this).field_d[param1];
        }
        if (!(((lb) this).field_a >= param1)) {
            throw new ArrayIndexOutOfBoundsException(param1);
        }
        return ((lb) this).field_d[param1];
    }

    static {
    }
}
