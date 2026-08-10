/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fba implements ntb, ofa {
    private int field_b;
    private cda[] field_a;
    static String field_c;

    private final jo b(int param0, int param1, int param2, int param3) {
        int var5 = this.a(param3, param1, param0 + 8, param2);
        int var6 = param0 + this.field_a.length & var5;
        if (!(null != this.field_a[var6])) {
            this.field_a[var6] = new cda();
        }
        ppb.field_b = this.field_a[var6];
        return this.field_a[var6].a((byte) 120, param3, param1, param2);
    }

    final int a(int param0, int[] param1, int param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        var9 = VoidHunters.field_G;
        try {
          L0: {
            var5_int = this.a((byte) 93, param1, param2);
            var7 = 105 % ((-21 - param3) / 62);
            var6 = 0;
            var8 = 0;
            L1: while (true) {
              if (var5_int <= var8) {
                stackIn_5_0 = var6;
                break L0;
              } else {
                var6 = kpb.field_s[var8].a(-36, param0, var6);
                var8++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var5);

            stackIn_8_1 = new StringBuilder().append("fba.Q(").append(param0).append(',');

            if (param1 == null) {
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
          throw rta.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_5_0;
    }

    private final jo a(int param0, int param1, int param2, byte param3) {
        int var5 = this.a(param2, param1, 7, param0);
        cda var6 = this.field_a[-1 + this.field_a.length & var5];
        if (param3 < 108) {
            this.field_b = 69;
        }
        ppb.field_b = var6;
        if (var6 == null) {
            return null;
        }
        return var6.a(100, param0, param2, param1);
    }

    final void a(int[] param0, int param1, int param2, boolean param3, int param4) {
        int var6_int = 0;
        int var7 = 0;
        jo var8 = null;
        int var9 = VoidHunters.field_G;
        try {
            var6_int = this.a((byte) -102, param0, param2);
            for (var7 = param4; var7 < var6_int; var7++) {
                var8 = kpb.field_s[var7];
                sl.field_c[var7].a(param4 ^ -126);
                this.a(1, var8, param1);
            }
            if (!(!param3)) {
                this.a((byte) -63, param2, param1);
            }
            this.a(-15536);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "fba.EA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    private final int c(int param0, int param1) {
        jo discarded$0 = null;
        if (param1 > -21) {
            discarded$0 = this.a(-94, -43, -100, (byte) -113);
        }
        if (!(0 <= param0)) {
            param0 = param0 - 65536;
        }
        return param0 / 65536;
    }

    final void a(int[] param0, byte param1) {
        try {
            int var3_int = 123 % ((6 - param1) / 45);
            ah.field_o[3] = param0[3];
            ah.field_o[0] = param0[0];
            ah.field_o[2] = param0[2];
            ah.field_o[1] = param0[1];
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "fba.U(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    private final void b(int param0, int param1) {
        int var3 = 0;
        int var4 = VoidHunters.field_G;
        for (var3 = 1 + param0; var3 < bs.field_c; var3++) {
            kpb.field_s[var3] = null;
            sl.field_c[var3] = null;
        }
        if (param1 <= 72) {
            this.field_b = -33;
        }
        bs.field_c = param0;
    }

    public final boolean a(byte param0, tv param1) {
        fba var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        boolean stackIn_1_0 = false;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var3 = (fba) ((Object) param1);
            var4 = 43 / ((param0 - 22) / 59);
            stackIn_1_0 = dn.a(var3.field_a, false, 1, this.field_a, 122);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var3_ref);

            stackIn_4_1 = new StringBuilder().append("fba.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "null";
              break L1;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "{...}";
              break L1;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ')');
        }
        return stackIn_1_0;
    }

    final void a(int param0, int[] param1, int param2, byte param3) {
        try {
            this.a(param1, param0, param2, false, 0);
            if (param3 >= -15) {
                field_c = (String) null;
            }
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "fba.G(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void a(int[] param0, byte param1, int param2, int param3) {
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var7 = VoidHunters.field_G;
        try {
          L0: {
            var5_int = this.b((byte) -123, param0, param3);
            var6 = 0;
            L1: while (true) {
              if (var6 >= var5_int) {
                L2: {
                  this.a(-15536);
                  if (param1 >= 1) {
                    break L2;
                  } else {
                    this.field_a = (cda[]) null;
                    break L2;
                  }
                }
                break L0;
              } else {
                kpb.field_s[var6].a(param2, -13251);
                sl.field_c[var6].a(-111);
                var6++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var5);

            stackIn_9_1 = new StringBuilder().append("fba.K(");

            if (param0 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final void a(boolean param0, int param1, int param2, int param3, int param4) {
        jo var6 = this.b(-1, param1, param3, param4);
        if (!param0) {
            this.a((byte) -57, 94, 86);
        }
        var6.a(param2, -13251);
        ppb.field_b.a(-112);
    }

    private final int b(byte param0, int[] param1, int param2) {
        int incrementValue$1 = 0;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        jo var11 = null;
        int var12 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        var12 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              var4_int = this.c(param1[0], -110);
              var5 = this.c(param1[1], -80);
              if (param0 < -37) {
                break L1;
              } else {
                field_c = (String) null;
                break L1;
              }
            }
            var6 = this.a(param1[2], (byte) 19);
            var7 = this.a(param1[3], (byte) 19);
            var8 = 0;
            var9 = var4_int;
            L2: while (true) {
              if (var5 < var9) {
                this.b(var8, 93);
                stackIn_10_0 = var8;
                break L0;
              } else {
                var10 = var6;
                L3: while (true) {
                  if (var10 > var7) {
                    var9++;
                    continue L2;
                  } else {
                    var11 = this.b(-1, var10, param2, var9);
                    sl.field_c[var8] = ppb.field_b;
                    incrementValue$1 = var8;
                    var8++;
                    kpb.field_s[incrementValue$1] = var11;
                    var10++;
                    continue L3;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var4);

            stackIn_13_1 = new StringBuilder().append("fba.I(").append(param0).append(',');

            if (param1 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L4;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L4;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param2 + ')');
        }
        return stackIn_10_0;
    }

    private final int a(int param0, int param1, int param2, int param3) {
        int var5 = 11 * param3 + param2 * param1 + 3 * param0;
        return var5;
    }

    final int a(byte param0, int[] param1, int param2) {
        int incrementValue$1 = 0;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        jo var12 = null;
        int var13 = 0;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        var13 = VoidHunters.field_G;
        try {
          L0: {
            var5 = -18 % ((35 - param0) / 54);
            var4_int = this.c(param1[0], -35);
            var6 = this.c(param1[1], -109);
            var7 = this.a(param1[2], (byte) 19);
            var8 = this.a(param1[3], (byte) 19);
            var9 = 0;
            var10 = var4_int;
            L1: while (true) {
              if (var10 > var6) {
                this.b(var9, 88);
                stackIn_14_0 = var9;
                break L0;
              } else {
                var11 = var7;
                L2: while (true) {
                  if (var11 > var8) {
                    var10++;
                    continue L1;
                  } else {
                    L3: {
                      var12 = this.a(param2, var11, var10, (byte) 110);
                      if (var12 != null) {
                        L4: {
                          if (sl.field_c.length <= var9) {
                            this.b((byte) -16);
                            break L4;
                          } else {
                            break L4;
                          }
                        }
                        sl.field_c[var9] = ppb.field_b;
                        incrementValue$1 = var9;
                        var9++;
                        kpb.field_s[incrementValue$1] = var12;
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    var11++;
                    continue L2;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var4);

            stackIn_17_1 = new StringBuilder().append("fba.R(").append(param0).append(',');

            if (param1 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L5;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L5;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ',' + param2 + ')');
        }
        return stackIn_14_0;
    }

    final int a(int param0, int param1) {
        if (param0 > -75) {
            this.field_b = 57;
        }
        return this.a(-1, ah.field_o, param1, 74);
    }

    public static void b(int param0) {
        field_c = null;
        if (param0 <= 112) {
            field_c = (String) null;
        }
    }

    public final void a(tv param0, int param1) {
        fba var3 = null;
        int var4 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          L0: {
            L1: {
              var3 = (fba) ((Object) param0);
              tja.a(var3.field_a, 1, this.field_a, false, 5547);
              var4 = 0;
              if (!dn.a(var3.field_a, false, 1, this.field_a, -99)) {
                break L1;
              } else {
                var4 = 1;
                System.out.println("PartitionZoneList[] zonelists has changed. ");
                break L1;
              }
            }
            L2: {
              if (param1 <= -19) {
                break L2;
              } else {
                field_c = (String) null;
                break L2;
              }
            }
            L3: {
              if (var4 != 0) {
                System.out.println("This instance of PartitioningManager has changed");
                break L3;
              } else {
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var3_ref);

            stackIn_10_1 = new StringBuilder().append("fba.F(");

            if (param0 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L4;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L4;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ')');
        }
    }

    public final void b(faa param0, int param1) {
        jo discarded$1 = null;
        faa var3 = null;
        cda[] var4 = null;
        int var5 = 0;
        cda[] var6 = null;
        int var7 = 0;
        cda var8 = null;
        int var9 = 0;
        int stackIn_6_0 = 0;
        faa stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        faa stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        int stackIn_13_2 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var9 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              var3 = param0;
              var4 = this.field_a;
              if (param1 < -109) {
                break L1;
              } else {
                discarded$1 = this.b(-108, -16, 66, 92);
                break L1;
              }
            }
            L2: {
              if (var4 == null) {
                stackIn_6_0 = 0;
                break L2;
              } else {
                stackIn_6_0 = var4.length;
                break L2;
              }
            }
            L3: {
              var5 = stackIn_6_0;
              var3.a(-632, var5, 10);
              if (var5 != 0) {
                var6 = var4;
                var7 = 0;
                L4: while (true) {
                  if (var6.length <= var7) {
                    break L3;
                  } else {
                    L5: {
                      var8 = var6[var7];
                      stackIn_12_0 = (faa) (var3);

                      stackIn_12_1 = 53;

                      if (var8 == null) {
                        stackIn_13_0 = (faa) ((Object) stackIn_12_0);
                        stackIn_13_1 = stackIn_12_1;
                        stackIn_13_2 = 0;
                        break L5;
                      } else {
                        stackIn_13_0 = (faa) ((Object) stackIn_12_0);
                        stackIn_13_1 = stackIn_12_1;
                        stackIn_13_2 = 1;
                        break L5;
                      }
                    }
                    L6: {
                      if (vq.a(stackIn_13_0, stackIn_13_1, stackIn_13_2 != 0)) {
                        stb.a(2, 1, var3, var8);
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    var7++;
                    continue L4;
                  }
                }
              } else {
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3_ref = decompiledCaughtException;
            stackIn_20_0 = (RuntimeException) (var3_ref);

            stackIn_20_1 = new StringBuilder().append("fba.B(");

            if (param0 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L7;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L7;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ',' + param1 + ')');
        }
    }

    private final void a(int param0, int param1, int param2, int param3, int param4) {
        if (param3 != 2) {
            return;
        }
        jo var6 = this.a(param2, param1, param0, (byte) 114);
        if (var6 != null) {
            ppb.field_b.a(param3 + -14);
            this.a(1, var6, param4);
        }
    }

    private final void b(byte param0) {
        int var3_int = 0;
        int var4 = 0;
        int var5 = VoidHunters.field_G;
        cda[] var6 = new cda[sl.field_c.length * 2];
        cda[] var2 = var6;
        for (var3_int = 0; sl.field_c.length > var3_int; var3_int++) {
            var6[var3_int] = sl.field_c[var3_int];
        }
        sl.field_c = var2;
        if (param0 != -16) {
            this.field_b = -122;
        }
        jo[] var3 = new jo[2 * kpb.field_s.length];
        for (var4 = 0; var4 < kpb.field_s.length; var4++) {
            var3[var4] = kpb.field_s[var4];
        }
        kpb.field_s = var3;
    }

    public final void b(byte param0, tv param1) {
        fba var3 = (fba) ((Object) param1);
        if (!(var3.field_b != this.field_b)) {
            return;
        }
        try {
            if (param0 < 54) {
                field_c = (String) null;
            }
            var3.field_b = this.field_b;
            var3.field_a = (cda[]) ((Object) sqb.a(var3.field_a, this.field_a, 1, mjb.field_c, false));
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "fba.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private final void a(byte param0) {
        this.field_a = new cda[1023];
        if (param0 != -10) {
            this.field_a = (cda[]) null;
        }
    }

    private final void a(int param0) {
        int fieldTemp$0 = fha.field_p;
        fha.field_p = fha.field_p + 1;
        this.field_b = fieldTemp$0;
        if (param0 != -15536) {
            this.field_b = -3;
        }
    }

    private final void a(byte param0, int param1, int param2) {
        int var4;
        cda var5;
        int var6;
        var6 = VoidHunters.field_G;
        if (param0 <= -61) {
          var4 = 0;
          L0: while (true) {
            if (var4 >= this.field_a.length) {
              return;
            } else {
              var5 = this.field_a[var4];
              if (var5 != null) {
                var5.a(param2, param1, (byte) -21);
                var4++;
                continue L0;
              } else {
                var4++;
                continue L0;
              }
            }
          }
        } else {
          return;
        }
    }

    final void a(int param0, int param1, int param2, int[] param3) {
        RuntimeException stackIn_62_0 = null;
        StringBuilder stackIn_62_1 = null;
        RuntimeException stackIn_63_0 = null;
        StringBuilder stackIn_63_1 = null;
        String stackIn_63_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
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
        var15 = VoidHunters.field_G;
        try {
          L0: {
            if (-1 < (param1 ^ -1)) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                var5_int = this.c(ah.field_o[0], -78);
                var6 = this.c(ah.field_o[1], param0 + -43);
                var7 = this.a(ah.field_o[2], (byte) 19);
                var8 = this.a(ah.field_o[3], (byte) 19);
                var9 = this.c(param3[0], -81);
                var10 = this.c(param3[param0], -110);
                var11 = this.a(param3[2], (byte) 19);
                var12 = this.a(param3[3], (byte) 19);
                if (var5_int != var9) {
                  break L1;
                } else {
                  if (var6 != var10) {
                    break L1;
                  } else {
                    if (var11 != var7) {
                      break L1;
                    } else {
                      if (var12 == var8) {
                        decompiledRegionSelector0 = 1;
                        break L0;
                      } else {
                        break L1;
                      }
                    }
                  }
                }
              }
              var13 = var5_int;
              L2: while (true) {
                if (var9 <= var13) {
                  var13 = var10 - -1;
                  L3: while (true) {
                    if (var13 > var6) {
                      var13 = var7;
                      L4: while (true) {
                        if (var13 >= var11) {
                          var13 = var12 - -1;
                          L5: while (true) {
                            if (var13 > var8) {
                              var13 = var9;
                              L6: while (true) {
                                if (var5_int <= var13) {
                                  var13 = var6 - -1;
                                  L7: while (true) {
                                    if (var13 > var10) {
                                      var13 = var11;
                                      L8: while (true) {
                                        if (var7 <= var13) {
                                          var13 = 1 + var8;
                                          L9: while (true) {
                                            if (var13 > var12) {
                                              this.a(-15536);
                                              decompiledRegionSelector0 = 2;
                                              break L0;
                                            } else {
                                              var14 = var9;
                                              L10: while (true) {
                                                if (var14 > var10) {
                                                  var13++;
                                                  continue L9;
                                                } else {
                                                  this.a(true, var13, param2, param1, var14);
                                                  var14++;
                                                  continue L10;
                                                }
                                              }
                                            }
                                          }
                                        } else {
                                          var14 = var9;
                                          L11: while (true) {
                                            if (var10 < var14) {
                                              var13++;
                                              continue L8;
                                            } else {
                                              this.a(true, var13, param2, param1, var14);
                                              var14++;
                                              continue L11;
                                            }
                                          }
                                        }
                                      }
                                    } else {
                                      var14 = var11;
                                      L12: while (true) {
                                        if (var14 > var12) {
                                          var13++;
                                          continue L7;
                                        } else {
                                          this.a(true, var14, param2, param1, var13);
                                          var14++;
                                          continue L12;
                                        }
                                      }
                                    }
                                  }
                                } else {
                                  var14 = var11;
                                  L13: while (true) {
                                    if (var14 > var12) {
                                      var13++;
                                      continue L6;
                                    } else {
                                      this.a(true, var14, param2, param1, var13);
                                      var14++;
                                      continue L13;
                                    }
                                  }
                                }
                              }
                            } else {
                              var14 = var5_int;
                              L14: while (true) {
                                if (var14 > var6) {
                                  var13++;
                                  continue L5;
                                } else {
                                  this.a(var14, var13, param1, 2, param2);
                                  var14++;
                                  continue L14;
                                }
                              }
                            }
                          }
                        } else {
                          var14 = var5_int;
                          L15: while (true) {
                            if (var6 < var14) {
                              var13++;
                              continue L4;
                            } else {
                              this.a(var14, var13, param1, 2, param2);
                              var14++;
                              continue L15;
                            }
                          }
                        }
                      }
                    } else {
                      var14 = var7;
                      L16: while (true) {
                        if (var8 < var14) {
                          var13++;
                          continue L3;
                        } else {
                          this.a(var13, var14, param1, 2, param2);
                          var14++;
                          continue L16;
                        }
                      }
                    }
                  }
                } else {
                  var14 = var7;
                  L17: while (true) {
                    if (var8 < var14) {
                      var13++;
                      continue L2;
                    } else {
                      this.a(var13, var14, param1, 2, param2);
                      var14++;
                      continue L17;
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L18: {
            var5 = decompiledCaughtException;
            stackIn_62_0 = (RuntimeException) (var5);

            stackIn_62_1 = new StringBuilder().append("fba.W(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_63_0 = (RuntimeException) ((Object) stackIn_62_0);
              stackIn_63_1 = (StringBuilder) ((Object) stackIn_62_1);
              stackIn_63_2 = "null";
              break L18;
            } else {
              stackIn_63_0 = (RuntimeException) ((Object) stackIn_62_0);
              stackIn_63_1 = (StringBuilder) ((Object) stackIn_62_1);
              stackIn_63_2 = "{...}";
              break L18;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_63_0), stackIn_63_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    public final void a(faa param0, boolean param1) {
        if (param1) {
            return;
        }
        try {
            this.field_a = (cda[]) ((Object) kcb.a(10, mjb.field_c, param0, 1, -102, this.field_a));
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "fba.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    private final int a(int param0, byte param1) {
        int discarded$0 = 0;
        if (param1 != 19) {
            discarded$0 = this.a(-36, 62, -65, -108);
        }
        if (!(0 <= param0)) {
            param0 = param0 - 65536;
        }
        return param0 / 65536;
    }

    fba() {
        this.field_b = 0;
        this.a(-15536);
        this.a((byte) -10);
    }

    private final void a(int param0, jo param1, int param2) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        cda var10 = null;
        tv var12 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          L0: {
            L1: {
              if (param1.c(param2, 8)) {
                var5 = param1.field_h;
                var6 = param1.field_b;
                var7 = param1.field_f;
                var8 = this.a(var5, var6, 7, var7);
                var9 = var8 & this.field_a.length - 1;
                var10 = this.field_a[var9];
                if (var10 == null) {
                  break L1;
                } else {
                  if (var10.b(var7, param0 + -6776, var6, var5)) {
                    this.field_a[var9] = null;
                    break L1;
                  } else {
                    break L1;
                  }
                }
              } else {
                break L1;
              }
            }
            L2: {
              if (param0 == 1) {
                break L2;
              } else {
                var12 = (tv) null;
                this.a((byte) 36, (tv) null);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var4);

            stackIn_11_1 = new StringBuilder().append("fba.DA(").append(param0).append(',');

            if (param1 == null) {
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
          throw rta.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param2 + ')');
        }
    }

    static {
        field_c = "No votes";
    }
}
