/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nb extends am {
    private boolean field_t;
    private boolean field_s;

    final static void g(byte param0) {
        int var1_int = 0;
        int var2 = 0;
        double var3 = 0.0;
        int var5 = 0;
        int var6 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        var5 = Torquing.field_u;
        try {
          L0: {
            be.a();
            id.field_c = new int[260];
            oe.field_b = 11;
            var2 = 90 % ((param0 - -4) / 60);
            var1_int = 0;
            L1: while (true) {
              if (var1_int >= 256) {
                var6 = 256;
                var1_int = var6;
                L2: while (true) {
                  if (id.field_c.length <= var6) {
                    break L0;
                  } else {
                    id.field_c[var6] = 255;
                    var6++;
                    continue L2;
                  }
                }
              } else {
                var3 = 15.0;
                id.field_c[var1_int] = (int)(255.0 * Math.pow((double)((float)var1_int / 256.0f), var3));
                var1_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw rb.a((Throwable) ((Object) var1), "nb.D(" + param0 + ')');
        }
    }

    public nb() {
        super(1, false);
        this.field_t = true;
        this.field_s = true;
    }

    final int[] a(byte param0, int param1) {
        int[] var4 = null;
        int var5 = 0;
        int var6 = Torquing.field_u;
        if (param0 < 86) {
            return (int[]) null;
        }
        int[] var7 = this.field_l.a(param1, 25657);
        int[] var3 = var7;
        if (!this.field_l.field_b) {
        } else {
            var4 = this.b(0, 0, this.field_t ? vp.field_I + -param1 : param1);
            if (!this.field_s) {
                dk.a(var4, 0, var7, 0, ci.field_c);
            } else {
                for (var5 = 0; var5 < ci.field_c; var5++) {
                    var3[var5] = var4[jh.field_A - var5];
                }
            }
        }
        return var3;
    }

    final int[][] a(int param0, int param1) {
        Object stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        int stackIn_6_2 = 0;
        int[][] var3;
        int[] var5;
        int[] var6;
        int[] var7;
        int[] var8;
        int[] var9;
        int[] var10;
        int var11;
        int var12;
        int[][] var13;
        int var14;
        int[][] var16;
        int[] var17;
        int[] var18;
        int[] var19;
        int[][] var21;
        int[] var22;
        int[] var23;
        int[] var24;
        int[][] var26;
        L0: {
          var12 = Torquing.field_u;
          var21 = this.field_r.a(param0 + 44258, param1);
          var16 = var21;
          var13 = var16;
          var3 = var13;
          if (param0 == -29116) {
            break L0;
          } else {
            nb.g((byte) 122);
            break L0;
          }
        }
        L1: {
          if (!this.field_r.field_b) {
            break L1;
          } else {
            L2: {
              stackIn_5_0 = this;

              stackIn_5_1 = 24066;

              if (this.field_t) {
                stackIn_6_0 = this;
                stackIn_6_1 = stackIn_5_1;
                stackIn_6_2 = -param1 + vp.field_I;
                break L2;
              } else {
                stackIn_6_0 = this;
                stackIn_6_1 = stackIn_5_1;
                stackIn_6_2 = param1;
                break L2;
              }
            }
            var26 = this.c(stackIn_6_1, stackIn_6_2, 0);
            var22 = var26[0];
            var17 = var22;
            var5 = var17;
            var23 = var26[1];
            var18 = var23;
            var6 = var18;
            var24 = var26[2];
            var19 = var24;
            var7 = var19;
            var8 = var21[0];
            var9 = var21[1];
            var10 = var21[2];
            if (!this.field_s) {
              var14 = 0;
              var11 = var14;
              L3: while (true) {
                if (var14 >= ci.field_c) {
                  break L1;
                } else {
                  var8[var14] = var22[var14];
                  var9[var14] = var23[var14];
                  var10[var14] = var24[var14];
                  var14++;
                  continue L3;
                }
              }
            } else {
              var11 = 0;
              L4: while (true) {
                if (var11 >= ci.field_c) {
                  break L1;
                } else {
                  var8[var11] = var5[jh.field_A + -var11];
                  var9[var11] = var6[-var11 + jh.field_A];
                  var10[var11] = var7[-var11 + jh.field_A];
                  var11++;
                  continue L4;
                }
              }
            }
          }
        }
        return var3;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        bi.field_p = param0;
        if (param1 >= -87) {
            return;
        }
        bp.field_f = param2;
        kp.field_d = param4;
        bp.field_e = param3;
    }

    final static void b(int param0) {
        if (param0 != 0) {
            return;
        }
        ug.a(param0 ^ -105);
        if (k.field_d != null) {
            tf.a(-93, k.field_d);
        }
        ee.a(true);
        qd.b(param0 ^ 1);
        ci.a(0);
        if (!(!pf.a((byte) -34))) {
            wa.field_d.f(121, 1);
            jd.a((byte) -81, 0);
        }
        ih.b(true);
    }

    final static String a(String param0, java.applet.Applet param1, byte param2) {
        try {
            String var3 = null;
            String[] var4 = null;
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            String stackIn_6_0 = null;
            Object stackIn_11_0 = null;
            RuntimeException stackIn_14_0 = null;
            StringBuilder stackIn_14_1 = null;
            RuntimeException stackIn_15_0 = null;
            StringBuilder stackIn_15_1 = null;
            String stackIn_15_2 = null;
            StringBuilder stackIn_17_1 = null;
            StringBuilder stackIn_18_1 = null;
            String stackIn_18_2 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            Throwable decompiledCaughtException = null;
            Throwable var3_ref = null;
            RuntimeException var3_ref2 = null;
            var8 = Torquing.field_u;
            try {
              L0: {
                try {
                  L1: {
                    var3 = (String) (hp.a(param1, (byte) -85, "getcookies"));
                    var4 = kc.a(';', var3, 0);
                    var5 = -110 / ((param2 - -25) / 51);
                    var6 = 0;
                    L2: while (true) {
                      if (var4.length <= var6) {
                        decompiledRegionSelector0 = 0;
                        break L1;
                      } else {
                        L3: {
                          var7 = var4[var6].indexOf('=');
                          if (-1 < (var7 ^ -1)) {
                            break L3;
                          } else {
                            if (!var4[var6].substring(0, var7).trim().equals(param0)) {
                              break L3;
                            } else {
                              stackIn_6_0 = var4[var6].substring(var7 + 1).trim();
                              decompiledRegionSelector0 = 1;
                              break L1;
                            }
                          }
                        }
                        var6++;
                        continue L2;
                      }
                    }
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L4: {
                    var3_ref = decompiledCaughtException;
                    decompiledRegionSelector0 = 0;
                    break L4;
                  }
                }
                if (decompiledRegionSelector0 == 0) {
                  stackIn_11_0 = null;
                  decompiledRegionSelector1 = 0;
                  break L0;
                } else {
                  decompiledRegionSelector1 = 1;
                  break L0;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L5: {
                var3_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_14_0 = (RuntimeException) (var3_ref2);

                stackIn_14_1 = new StringBuilder().append("nb.A(");

                if (param0 == null) {
                  stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
                  stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
                  stackIn_15_2 = "null";
                  break L5;
                } else {
                  stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
                  stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
                  stackIn_15_2 = "{...}";
                  break L5;
                }
              }
              L6: {


                stackIn_17_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',');

                if (param1 == null) {
                  stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
                  stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
                  stackIn_18_2 = "null";
                  break L6;
                } else {
                  stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
                  stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
                  stackIn_18_2 = "{...}";
                  break L6;
                }
              }
              throw rb.a((Throwable) ((Object) stackIn_15_0), stackIn_18_2 + ',' + param2 + ')');
            }
            if (decompiledRegionSelector1 == 0) {
              return (String) ((Object) stackIn_11_0);
            } else {
              return stackIn_6_0;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(fj param0, int param1, int param2) {
        int var4_int = 0;
        int var5 = 0;
        Object stackIn_9_0 = null;
        Object stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        Object stackIn_13_0 = null;
        Object stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        Object stackIn_17_0 = null;
        Object stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var5 = Torquing.field_u;
        try {
          L0: {
            L1: {
              var4_int = param2;
              if (var4_int != 0) {
                if ((var4_int ^ -1) != -2) {
                  if (-3 == (var4_int ^ -1)) {
                    L2: {
                      stackIn_17_0 = this;

                      if (-2 != (param0.i((byte) -101) ^ -1)) {
                        stackIn_18_0 = this;
                        stackIn_18_1 = 0;
                        break L2;
                      } else {
                        stackIn_18_0 = this;
                        stackIn_18_1 = 1;
                        break L2;
                      }
                    }
                    ((nb) (this)).field_p = stackIn_18_1 != 0;
                    break L1;
                  } else {
                    break L1;
                  }
                } else {
                  L3: {
                    stackIn_13_0 = this;

                    if ((param0.i((byte) -101) ^ -1) != -2) {
                      stackIn_14_0 = this;
                      stackIn_14_1 = 0;
                      break L3;
                    } else {
                      stackIn_14_0 = this;
                      stackIn_14_1 = 1;
                      break L3;
                    }
                  }
                  ((nb) (this)).field_t = stackIn_14_1 != 0;
                  break L1;
                }
              } else {
                L4: {
                  stackIn_9_0 = this;

                  if (1 != param0.i((byte) -101)) {
                    stackIn_10_0 = this;
                    stackIn_10_1 = 0;
                    break L4;
                  } else {
                    stackIn_10_0 = this;
                    stackIn_10_1 = 1;
                    break L4;
                  }
                }
                ((nb) (this)).field_s = stackIn_10_1 != 0;
                break L1;
              }
            }
            L5: {
              if (param1 == 35) {
                break L5;
              } else {
                this.field_s = false;
                break L5;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackIn_24_0 = (RuntimeException) (var4);

            stackIn_24_1 = new StringBuilder().append("nb.H(");

            if (param0 == null) {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L6;
            } else {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L6;
            }
          }
          throw rb.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
    }
}
