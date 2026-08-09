/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class im extends nv {
    static int field_n;
    static int[] field_o;
    private koa field_p;

    final static void a(int param0, boolean param1, qua param2, int param3) {
        RuntimeException var4 = null;
        qua var5 = null;
        sq stackIn_2_0;
        int stackIn_2_1;
        int stackIn_2_2;
        int stackIn_2_3;
        int stackIn_2_4;
        sq stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        int stackIn_3_2 = 0;
        int stackIn_3_3 = 0;
        int stackIn_3_4 = 0;
        int stackIn_3_5 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              stackIn_2_0 = tva.field_d;

              stackIn_2_1 = 256;

              stackIn_2_2 = param3;

              stackIn_2_3 = -44;

              stackIn_2_4 = 1000000;

              if (param1) {
                stackIn_3_0 = (sq) ((Object) stackIn_2_0);
                stackIn_3_1 = stackIn_2_1;
                stackIn_3_2 = stackIn_2_2;
                stackIn_3_3 = stackIn_2_3;
                stackIn_3_4 = stackIn_2_4;
                stackIn_3_5 = 0;
                break L1;
              } else {
                stackIn_3_0 = (sq) ((Object) stackIn_2_0);
                stackIn_3_1 = stackIn_2_1;
                stackIn_3_2 = stackIn_2_2;
                stackIn_3_3 = stackIn_2_3;
                stackIn_3_4 = stackIn_2_4;
                stackIn_3_5 = 1;
                break L1;
              }
            }
            ((sq) (Object) stackIn_3_0).a(stackIn_3_1, stackIn_3_2, (byte) stackIn_3_3, stackIn_3_4, stackIn_3_5 != 0, param2);
            if (param0 == 9) {
              break L0;
            } else {
              var5 = (qua) null;
              im.a(70, false, (qua) null, -114);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var4);

            stackIn_8_1 = new StringBuilder().append("im.H(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L2;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L2;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param3 + ')');
        }
    }

    im(la param0, kh param1, boolean param2) {
        super(param0, param1, param2);
        try {
            this.field_p = new koa(1, 1, param0.field_E, param1);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "im.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static jha a(int param0, String param1, int param2, int param3, String param4) {
        int var5_int = 0;
        int var6 = 0;
        jha stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var6 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              var5_int = 52 % ((20 - param2) / 58);
              if (param0 == 0) {
                param4 = "[" + cla.field_o.toUpperCase() + "] " + param4;
                break L1;
              } else {
                if (2 == param0) {
                  param1 = "<col=ff0000>" + param1 + "</col>";
                  param4 = "[" + dna.field_H.toUpperCase() + "] " + param4;
                  break L1;
                } else {
                  if (param3 < 0) {
                    break L1;
                  } else {
                    param4 = "<col=" + jm.field_k[param3] + ">" + param4 + "</col>";
                    break L1;
                  }
                }
              }
            }
            stackIn_8_0 = new jha(0, param4, param1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var5);

            stackIn_11_1 = new StringBuilder().append("im.U(").append(param0).append(',');

            if (param1 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L2;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_14_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L3;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L3;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_12_0), stackIn_15_2 + ')');
        }
        return stackIn_8_0;
    }

    final int a(boolean param0) {
        if (param0) {
            field_o = (int[]) null;
            return 28;
        }
        return 28;
    }

    im(la param0, boolean param1) {
        super(param0, param1);
        try {
            this.field_p = new koa(1, 1);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "im.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void g(int param0) {
        kh var3;
        if (param0 != -2) {
          var3 = (kh) null;
          this.a(false, (kh) null);
          super.g(param0 ^ 0);
          this.field_p.a(this.h((byte) 112), 8);
          return;
        } else {
          super.g(param0 ^ 0);
          this.field_p.a(this.h((byte) 112), 8);
          return;
        }
    }

    final void a(boolean param0, fsa param1) {
        try {
            super.a(param0, param1);
            param1.b((byte) -126, 3);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "im.Q(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final int a(int param0, int param1) {
        if (param1 > -48) {
            qua var4 = (qua) null;
            im.a(89, false, (qua) null, -34);
            return param0;
        }
        return param0;
    }

    public static void j(byte param0) {
        String var2;
        if (param0 != 124) {
          var2 = (String) null;
          im.a(21, (String) null, -123, -2, (String) null);
          field_o = null;
          return;
        } else {
          field_o = null;
          return;
        }
    }

    final koa g(byte param0) {
        if (param0 != 99) {
            field_o = (int[]) null;
            return this.field_p;
        }
        return this.field_p;
    }

    final void a(boolean param0, kh param1) {
        try {
            super.a(param0, param1);
            this.field_p.a(30489, this.h((byte) 122), param1);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "im.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static int a(int param0, int param1, int param2) {
        if (param2 == 1) {
          if (-1 >= (param1 ^ -1)) {
            if ((param1 ^ -1) < -1) {
              if (0 <= param0) {
                if ((param0 ^ -1) < -1) {
                  return 1024;
                } else {
                  return 2048;
                }
              } else {
                return 3072;
              }
            } else {
              if (0 <= param0) {
                if ((param0 ^ -1) >= -1) {
                  return 0;
                } else {
                  return 0;
                }
              } else {
                return 4096;
              }
            }
          } else {
            if (-1 >= (param0 ^ -1)) {
              if ((param0 ^ -1) < -1) {
                return -1024;
              } else {
                return -2048;
              }
            } else {
              return -3072;
            }
          }
        } else {
          field_o = (int[]) null;
          if (-1 >= (param1 ^ -1)) {
            if ((param1 ^ -1) < -1) {
              if (0 <= param0) {
                if ((param0 ^ -1) >= -1) {
                  return 2048;
                } else {
                  return 1024;
                }
              } else {
                return 3072;
              }
            } else {
              if (0 <= param0) {
                if ((param0 ^ -1) < -1) {
                  return 0;
                } else {
                  return 0;
                }
              } else {
                return 4096;
              }
            }
          } else {
            if (-1 >= (param0 ^ -1)) {
              if ((param0 ^ -1) < -1) {
                return -1024;
              } else {
                return -2048;
              }
            } else {
              return -3072;
            }
          }
        }
    }

    final void k(int param0) {
        lj[] var2;
        Object var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        la var12;
        ffa[] var13;
        ffa[] var14;
        int var15;
        ffa var16;
        Object var17;
        int var18;
        int var19;
        int var20;
        int var21;
        on var22;
        int var23;
        int var24;
        Object var25;
        int var26;
        lj[] var27;
        t var28;
        gma var29;
        var17 = null;
        var25 = null;
        var26 = TombRacer.field_G ? 1 : 0;
        var27 = this.field_p.c(1);
        var2 = var27;
        if (-1 != (var27.length ^ -1)) {
          L0: {
            var3 = null;
            if (!(var27[0] instanceof fsa)) {
              break L0;
            } else {
              var3 = (fsa) ((Object) var27[0]);
              break L0;
            }
          }
          if (var3 == null) {
            return;
          } else {
            if (param0 == 5418) {
              var4 = this.field_g.d(param0 + -5415);
              var5 = this.field_g.e(9648);
              var6 = this.field_g.c(-119);
              var7 = this.field_g.a((byte) 55);
              var8 = ((fsa) (var3)).d(3);
              var9 = ((fsa) (var3)).e(param0 ^ 12442);
              var10 = ((fsa) (var3)).c(param0 + -5510);
              var11 = ((fsa) (var3)).a((byte) 55);
              var12 = this.b(true);
              var13 = var12.field_u.b(var5, -1, var4, var6, var7);
              var14 = var13;
              var15 = 0;
              L1: while (true) {
                if (var14.length <= var15) {
                  return;
                } else {
                  var16 = var14[var15];
                  if (var16 instanceof t) {
                    var28 = (t) ((Object) var16);
                    if (var28.j((byte) -113)) {
                      if (var16 != this.field_g) {
                        if (!this.field_g.a(var16, true)) {
                          var18 = var16.d(3);
                          var19 = var16.e(9648);
                          var20 = var16.c(-128);
                          var21 = var16.a((byte) 55);
                          var18 = var18 + 5 * var20 / 100;
                          var19 = var19 + 5 * var21 / 100;
                          var20 = 9 * var20 / 10;
                          var21 = var21 * 9 / 10;
                          if (io.a(var6, var19, (byte) -93, var7, var18, var5, var21, var20, var4)) {
                            var22 = var28.c(false);
                            var22.a((byte) -44);
                            if (ck.a(var18, var21, var4, var6, var7, var19, (byte) 66, var5, var20)) {
                              var23 = -var4 + var18 + var8;
                              var24 = var19 + (var9 - var5);
                              if (ck.a(var23, var21, var8, var10, var11, var24, (byte) 99, var9, var20)) {
                                if (!var22.b(-59)) {
                                  L2: {
                                    if (!(var16 instanceof gma)) {
                                      break L2;
                                    } else {
                                      var29 = (gma) ((Object) var16);
                                      if (!var12.a(var16, var21, 2, 1, var24, var23, false, var29, var20)) {
                                        break L2;
                                      } else {
                                        var15++;
                                        continue L1;
                                      }
                                    }
                                  }
                                  var12.a(var19, var18, 8, 0, (byte) 6);
                                  var12.b(false).a(var19, var18, 0, -44);
                                  var12.b(false).a(var24, var23, 0, -40);
                                  var28.a(var24, var23, 2);
                                  var22.c(param0 ^ -5483);
                                  var15++;
                                  continue L1;
                                } else {
                                  var15++;
                                  continue L1;
                                }
                              } else {
                                var15++;
                                continue L1;
                              }
                            } else {
                              var15++;
                              continue L1;
                            }
                          } else {
                            var15++;
                            continue L1;
                          }
                        } else {
                          var15++;
                          continue L1;
                        }
                      } else {
                        var15++;
                        continue L1;
                      }
                    } else {
                      var15++;
                      continue L1;
                    }
                  } else {
                    var15++;
                    continue L1;
                  }
                }
              }
            } else {
              return;
            }
          }
        } else {
          return;
        }
    }

    static {
        field_n = 20;
    }
}
