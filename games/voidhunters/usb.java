/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class usb extends oda {
    private int[] field_v;
    private int[] field_y;
    private int field_B;
    private int field_z;
    private int[] field_A;
    int field_w;
    private int field_x;

    private final void a(int param0, byte param1, int param2) {
        int var4 = 0;
        shb[] var5 = null;
        shb[] var6 = null;
        shb[] var7 = null;
        int stackIn_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        L0: {
          if (null != ((usb) this).field_y) {
            stackOut_2_0 = ((usb) this).field_y.length;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 0;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        var4 = stackIn_3_0;
        if (param1 == -83) {
          var7 = new shb[var4 * param0];
          var5 = var7;
          if (null != ((usb) this).field_u) {
            if (0 < ((usb) this).field_u.length) {
              if (var7.length > 0) {
                if (param2 <= 0) {
                  ((usb) this).field_u = var5;
                  return;
                } else {
                  cua.a((Object[]) (Object) ((usb) this).field_u, 0, (Object[]) (Object) var5, 0, Math.min(param2, param0) * var4);
                  ((usb) this).field_u = var5;
                  return;
                }
              } else {
                ((usb) this).field_u = var5;
                return;
              }
            } else {
              ((usb) this).field_u = var5;
              return;
            }
          } else {
            ((usb) this).field_u = var5;
            return;
          }
        } else {
          ((usb) this).field_z = 55;
          var6 = new shb[var4 * param0];
          var5 = var6;
          if (null != ((usb) this).field_u) {
            if (0 < ((usb) this).field_u.length) {
              if (var6.length > 0) {
                if (param2 <= 0) {
                  ((usb) this).field_u = var5;
                  return;
                } else {
                  cua.a((Object[]) (Object) ((usb) this).field_u, 0, (Object[]) (Object) var5, 0, Math.min(param2, param0) * var4);
                  ((usb) this).field_u = var5;
                  return;
                }
              } else {
                ((usb) this).field_u = var5;
                return;
              }
            } else {
              ((usb) this).field_u = var5;
              return;
            }
          } else {
            ((usb) this).field_u = var5;
            return;
          }
        }
    }

    private final void b(int param0, int param1, int param2) {
        int var4 = 0;
        int[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int[] var8 = null;
        int[] var9 = null;
        int stackIn_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        L0: {
          var7 = VoidHunters.field_G;
          if (((usb) this).field_A != null) {
            stackOut_2_0 = ((usb) this).field_A.length;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 0;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        var4 = stackIn_3_0;
        var9 = new int[var4 * param0];
        var8 = var9;
        var5 = var8;
        if (null != ((usb) this).field_v) {
          if (((usb) this).field_v.length > 0) {
            var9 = var8;
            if (var9.length > 0) {
              if (param2 > 0) {
                var6 = 0;
                L1: while (true) {
                  if (var4 <= var6) {
                    ((usb) this).field_v = var5;
                    if (param1 >= -49) {
                      ((usb) this).field_w = -51;
                      return;
                    } else {
                      return;
                    }
                  } else {
                    cua.a(((usb) this).field_v, param2 * var6, var5, param0 * var6, Math.min(param2, param0));
                    var6++;
                    continue L1;
                  }
                }
              } else {
                ((usb) this).field_v = var5;
                if (param1 >= -49) {
                  ((usb) this).field_w = -51;
                  return;
                } else {
                  return;
                }
              }
            } else {
              ((usb) this).field_v = var5;
              if (param1 >= -49) {
                ((usb) this).field_w = -51;
                return;
              } else {
                return;
              }
            }
          } else {
            ((usb) this).field_v = var5;
            if (param1 >= -49) {
              ((usb) this).field_w = -51;
              return;
            } else {
              return;
            }
          }
        } else {
          ((usb) this).field_v = var5;
          if (param1 >= -49) {
            ((usb) this).field_w = -51;
            return;
          } else {
            return;
          }
        }
    }

    usb(int param0, int param1, int param2, int param3, wwa param4, int param5, int param6) {
        super(param0, param1, param2, param3, param4);
        int[] var10 = null;
        int[] var9 = null;
        ((usb) this).field_w = 92;
        ((usb) this).field_B = 0;
        try {
            var10 = new int[param5];
            int[] var8 = var10;
            cua.a(var10, 0, param5, 1);
            var9 = new int[param6];
            cua.a(var9, 0, param6, 1);
            this.a(0, var10);
            this.a((byte) -115, var9);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "usb.<init>(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + (param4 != null ? "{...}" : "null") + 44 + param5 + 44 + param6 + 41);
        }
    }

    final void d(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        shb var5 = null;
        int var6 = 0;
        var6 = VoidHunters.field_G;
        var2 = 0;
        if (param0 == 16777215) {
          var3 = 0;
          L0: while (true) {
            if (((usb) this).field_u.length > var2) {
              if (var3 < ((usb) this).field_A.length) {
                var4 = 0;
                L1: while (true) {
                  if (var2 >= ((usb) this).field_u.length) {
                    var3++;
                    var3++;
                    continue L0;
                  } else {
                    if (var4 < ((usb) this).field_y.length) {
                      int incrementValue$1 = var2;
                      var2++;
                      var5 = ((usb) this).field_u[incrementValue$1];
                      if (var5 != null) {
                        this.a(var3, (byte) 72, var4, var5);
                        var4++;
                        continue L1;
                      } else {
                        var4++;
                        continue L1;
                      }
                    } else {
                      var3++;
                      continue L0;
                    }
                  }
                }
              } else {
                return;
              }
            } else {
              return;
            }
          }
        } else {
          return;
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        super.a(param0, param1, param2, param3, param4);
    }

    final void a(shb param0, byte param1, int param2) {
        int var4_int = 0;
        int var5 = 0;
        try {
            var4_int = ((usb) this).field_B % ((usb) this).field_y.length;
            if (param1 > -10) {
                ((usb) this).field_w = 54;
            }
            var5 = ((usb) this).field_B / ((usb) this).field_y.length;
            ((usb) this).field_v[((usb) this).field_B] = param2;
            ((usb) this).field_u[((usb) this).field_B] = param0;
            if (param0 != null) {
                this.a(var5, (byte) 104, var4_int, param0);
            }
            ((usb) this).field_B = ((usb) this).field_B + 1;
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "usb.D(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 41);
        }
    }

    private final void a(byte param0, int[] param1) {
        int var4 = 0;
        int var5 = 0;
        int[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = VoidHunters.field_G;
        try {
            int var3_int = 9 % ((-48 - param0) / 36);
            var4 = ((usb) this).field_A == null ? 0 : ((usb) this).field_A.length;
            var5 = param1.length;
            ((usb) this).field_A = param1;
            var6 = param1;
            var7 = 0;
            var8 = 0;
            while (var6.length > var7) {
                var8 = var8 + var6[var7];
                var6[var7] = var8 + var6[var7];
                var7++;
            }
            this.a(var5, (byte) -83, var4);
            this.b(var5, (byte) -100, var4);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "usb.I(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final void c(int param0, int param1, int param2) {
        Object var5 = null;
        if (param0 != -6) {
          var5 = null;
          boolean discarded$2 = ((usb) this).a(-108, 52, 75, -20, (shb) null, -91, (byte) 106);
          ((usb) this).field_x = param1;
          ((usb) this).field_z = param2;
          return;
        } else {
          ((usb) this).field_x = param1;
          ((usb) this).field_z = param2;
          return;
        }
    }

    private final void b(int param0, byte param1, int param2) {
        int var4 = 0;
        int[] var5 = null;
        int var6 = 0;
        int stackIn_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        L0: {
          if (((usb) this).field_y != null) {
            stackOut_2_0 = ((usb) this).field_y.length;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 0;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        var4 = stackIn_3_0;
        var5 = new int[var4 * param0];
        var6 = -71 % ((-51 - param1) / 35);
        if (null != ((usb) this).field_v) {
          if (((usb) this).field_v.length > 0) {
            if (var5.length > 0) {
              if (param2 <= 0) {
                ((usb) this).field_v = var5;
                return;
              } else {
                cua.a(((usb) this).field_v, 0, var5, 0, Math.min(param2, param0) * var4);
                ((usb) this).field_v = var5;
                return;
              }
            } else {
              ((usb) this).field_v = var5;
              return;
            }
          } else {
            ((usb) this).field_v = var5;
            return;
          }
        } else {
          ((usb) this).field_v = var5;
          return;
        }
    }

    final boolean a(int param0, int param1, int param2, int param3, shb param4, int param5, byte param6) {
        RuntimeException var8 = null;
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
              if (param6 <= -17) {
                break L1;
              } else {
                ((usb) this).field_x = 25;
                break L1;
              }
            }
            stackOut_2_0 = super.a(param0, param1, param2, param3, param4, param5, (byte) -120);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var8 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var8;
            stackOut_4_1 = new StringBuilder().append("usb.S(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44);
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param4 == null) {
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
          throw rta.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + param5 + 44 + param6 + 41);
        }
        return stackIn_3_0;
    }

    private final void a(int param0, int[] param1) {
        int var3_int = 0;
        int var4 = 0;
        int[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = VoidHunters.field_G;
        try {
            var3_int = null != ((usb) this).field_y ? ((usb) this).field_y.length : 0;
            var4 = param1.length;
            ((usb) this).field_y = param1;
            var5 = param1;
            var6 = 0;
            var7 = param0;
            while (var5.length > var6) {
                var7 = var7 + var5[var6];
                var5[var6] = var7 + var5[var6];
                var6++;
            }
            this.c(var3_int, (byte) -86, var4);
            this.b(var4, param0 + -70, var3_int);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "usb.M(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    private final void a(int param0, byte param1, int param2, shb param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
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
        int stackIn_4_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_36_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_6_1 = 0;
        int stackOut_5_0 = 0;
        int stackOut_5_1 = 0;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        String stackOut_35_2 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        var20 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              var5_int = ((usb) this).field_y[-1 + ((usb) this).field_y.length];
              var6 = ((usb) this).field_A[((usb) this).field_A.length - 1];
              if (0 >= param2) {
                stackOut_3_0 = 0;
                stackIn_4_0 = stackOut_3_0;
                break L1;
              } else {
                stackOut_2_0 = ((usb) this).field_y[param2 + -1];
                stackIn_4_0 = stackOut_2_0;
                break L1;
              }
            }
            L2: {
              var7 = stackIn_4_0 * ((usb) this).field_h / var5_int;
              stackOut_4_0 = ((usb) this).field_f;
              stackIn_6_0 = stackOut_4_0;
              stackIn_5_0 = stackOut_4_0;
              if (0 >= param0) {
                stackOut_6_0 = stackIn_6_0;
                stackOut_6_1 = 0;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                break L2;
              } else {
                stackOut_5_0 = stackIn_5_0;
                stackOut_5_1 = ((usb) this).field_A[param0 + -1];
                stackIn_7_0 = stackOut_5_0;
                stackIn_7_1 = stackOut_5_1;
                break L2;
              }
            }
            L3: {
              var8 = stackIn_7_0 * stackIn_7_1 / var6;
              var9 = ((usb) this).field_y[param2] * ((usb) this).field_h / var5_int;
              var10 = ((usb) this).field_f * ((usb) this).field_A[param0] / var6;
              var11 = param0 * ((usb) this).field_y.length - -param2;
              var12 = ((usb) this).field_v[var11] & 48;
              var13 = 192 & ((usb) this).field_v[var11];
              var14 = param3.field_g;
              if (param1 > 45) {
                break L3;
              } else {
                ((usb) this).c(14, 96, 93);
                break L3;
              }
            }
            L4: {
              L5: {
                var15 = param3.field_r;
                var16 = param3.field_h;
                var17 = param3.field_f;
                if (var16 >= -var7 + var9) {
                  break L5;
                } else {
                  if ((1 & ((usb) this).field_v[var11]) == 0) {
                    break L5;
                  } else {
                    var16 = -var7 + var9;
                    var14 = var7;
                    break L4;
                  }
                }
              }
              L6: {
                if (~(var9 + -var7) <= ~var16) {
                  break L6;
                } else {
                  if ((4 & ((usb) this).field_v[var11]) == 0) {
                    break L6;
                  } else {
                    var16 = -var7 + var9;
                    var14 = var7;
                    break L4;
                  }
                }
              }
              if (16 == var12) {
                var14 = -var16 + var9 + var7 >> 1;
                break L4;
              } else {
                if (var12 == 32) {
                  var14 = -var16 + var9;
                  break L4;
                } else {
                  var14 = var7;
                  break L4;
                }
              }
            }
            L7: {
              L8: {
                if (var17 >= var10 - var8) {
                  break L8;
                } else {
                  if ((((usb) this).field_v[var11] & 2) == 0) {
                    break L8;
                  } else {
                    var17 = var10 - var8;
                    var15 = var8;
                    break L7;
                  }
                }
              }
              L9: {
                if (~(var10 - var8) <= ~var17) {
                  break L9;
                } else {
                  if ((8 & ((usb) this).field_v[var11]) == 0) {
                    break L9;
                  } else {
                    var17 = var10 - var8;
                    var15 = var8;
                    break L7;
                  }
                }
              }
              if (var13 != 64) {
                if (var13 == 128) {
                  var15 = var10 + -var17;
                  break L7;
                } else {
                  var15 = var8;
                  break L7;
                }
              } else {
                var15 = -var17 + var10 + var8 >> 1;
                break L7;
              }
            }
            var18 = ((usb) this).field_z;
            var19 = ((usb) this).field_x;
            param3.a(var18 + var14, -(var18 * 2) + var16, -(2 * var19) + var17, 1, var15 - -var19);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var5 = decompiledCaughtException;
            stackOut_33_0 = (RuntimeException) var5;
            stackOut_33_1 = new StringBuilder().append("usb.H(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_35_0 = stackOut_33_0;
            stackIn_35_1 = stackOut_33_1;
            stackIn_34_0 = stackOut_33_0;
            stackIn_34_1 = stackOut_33_1;
            if (param3 == null) {
              stackOut_35_0 = (RuntimeException) (Object) stackIn_35_0;
              stackOut_35_1 = (StringBuilder) (Object) stackIn_35_1;
              stackOut_35_2 = "null";
              stackIn_36_0 = stackOut_35_0;
              stackIn_36_1 = stackOut_35_1;
              stackIn_36_2 = stackOut_35_2;
              break L10;
            } else {
              stackOut_34_0 = (RuntimeException) (Object) stackIn_34_0;
              stackOut_34_1 = (StringBuilder) (Object) stackIn_34_1;
              stackOut_34_2 = "{...}";
              stackIn_36_0 = stackOut_34_0;
              stackIn_36_1 = stackOut_34_1;
              stackIn_36_2 = stackOut_34_2;
              break L10;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_36_0, stackIn_36_2 + 41);
        }
    }

    final boolean a(int param0, int param1, shb param2, char param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        Object var6 = null;
        int stackIn_3_0 = 0;
        boolean stackIn_11_0 = false;
        boolean stackIn_13_0 = false;
        boolean stackIn_15_0 = false;
        boolean stackIn_17_0 = false;
        int stackIn_21_0 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        boolean stackOut_12_0 = false;
        boolean stackOut_14_0 = false;
        boolean stackOut_16_0 = false;
        int stackOut_20_0 = 0;
        boolean stackOut_10_0 = false;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        try {
          L0: {
            if (super.a(param0, param1, param2, param3)) {
              stackOut_2_0 = 1;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            } else {
              var5_int = param1;
              if (var5_int != 98) {
                if (var5_int == 99) {
                  stackOut_12_0 = ((usb) this).a(((usb) this).field_y.length, param2, 0);
                  stackIn_13_0 = stackOut_12_0;
                  return stackIn_13_0;
                } else {
                  if (96 == var5_int) {
                    stackOut_14_0 = ((usb) this).a(param2, (byte) -123);
                    stackIn_15_0 = stackOut_14_0;
                    return stackIn_15_0;
                  } else {
                    if (97 == var5_int) {
                      stackOut_16_0 = ((usb) this).b(param2, (byte) 39);
                      stackIn_17_0 = stackOut_16_0;
                      return stackIn_17_0;
                    } else {
                      L1: {
                        if (param0 == -15834) {
                          break L1;
                        } else {
                          var6 = null;
                          usb.a(-25, (no) null, (String) null, 107, 85, 63, 106);
                          break L1;
                        }
                      }
                      stackOut_20_0 = 0;
                      stackIn_21_0 = stackOut_20_0;
                      break L0;
                    }
                  }
                }
              } else {
                stackOut_10_0 = ((usb) this).a(param2, 103, ((usb) this).field_y.length);
                stackIn_11_0 = stackOut_10_0;
                return stackIn_11_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) var5;
            stackOut_22_1 = new StringBuilder().append("usb.N(").append(param0).append(44).append(param1).append(44);
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param2 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L2;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L2;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + 44 + param3 + 41);
        }
        return stackIn_21_0 != 0;
    }

    final static void a(int param0, no param1, String param2, int param3, int param4, int param5, int param6) {
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            L1: {
              var7_int = param1.b(param2);
              var8 = param1.field_A + param1.field_o;
              var9 = param3;
              if (dma.field_g < var7_int + (var9 - -6)) {
                var9 = -var7_int + (dma.field_g - 6);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              var10 = 32 + (-param1.field_o + param0);
              if (dma.field_j >= var8 + var10 - -6) {
                break L2;
              } else {
                var10 = -var8 + (dma.field_j - 6);
                break L2;
              }
            }
            dma.b(var9, var10, 6 + var7_int, 6 + var8, param5);
            dma.d(param4 + var9, var10 - -1, 4 + var7_int, var8 + 4, param6);
            param1.c(param2, 3 + var9, param1.field_o + (var10 + 3), param5, -1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var7 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var7;
            stackOut_7_1 = new StringBuilder().append("usb.P(").append(param0).append(44);
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          L4: {
            stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(44);
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param2 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + param6 + 41);
        }
    }

    private final void c(int param0, byte param1, int param2) {
        int var4 = 0;
        shb[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int stackIn_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        L0: {
          var7 = VoidHunters.field_G;
          if (null != ((usb) this).field_A) {
            stackOut_2_0 = ((usb) this).field_A.length;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 0;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        var4 = stackIn_3_0;
        var5 = new shb[param2 * var4];
        if (null != ((usb) this).field_u) {
          if (((usb) this).field_u.length > 0) {
            if (var5.length > 0) {
              if (param0 > 0) {
                var6 = 0;
                L1: while (true) {
                  if (var4 > var6) {
                    cua.a((Object[]) (Object) ((usb) this).field_u, param0 * var6, (Object[]) (Object) var5, param2 * var6, Math.min(param0, param2));
                    var6++;
                    continue L1;
                  } else {
                    ((usb) this).field_u = var5;
                    var6 = -67 % ((param1 - 32) / 58);
                    return;
                  }
                }
              } else {
                ((usb) this).field_u = var5;
                var6 = -67 % ((param1 - 32) / 58);
                return;
              }
            } else {
              ((usb) this).field_u = var5;
              var6 = -67 % ((param1 - 32) / 58);
              return;
            }
          } else {
            ((usb) this).field_u = var5;
            var6 = -67 % ((param1 - 32) / 58);
            return;
          }
        } else {
          ((usb) this).field_u = var5;
          var6 = -67 % ((param1 - 32) / 58);
          return;
        }
    }

    static {
    }
}
