/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mg {
    private boolean field_j;
    private boolean field_d;
    static boolean field_c;
    static String field_i;
    static jg[] field_g;
    static java.awt.Frame field_f;
    private hj[] field_h;
    static String field_e;
    static String field_k;
    private int field_a;
    private hj field_b;

    final static void a(int param0) {
        int var1 = (cf.field_w ^ -1) == 0 ? 0 : cf.field_w;
        ca.field_r = (kj.b(2, 10) ^ -1) == param0 ? 6 : 5;
        nm.field_b = ca.field_r == 6 ? tk.field_c[5][var1] : tk.field_c[var1][0];
        if (!pd.a(nm.field_b, true)) {
            qn.field_k = false;
            fl.field_j = false;
            on.field_r = -1;
            bl.field_r = null;
            sk.field_i = -1;
        } else {
            bl.field_r = new sg(nm.field_b, ca.field_r, false, false, -1, -1);
            ca.field_r = -1;
        }
        kk.field_j = false;
    }

    final mg a(int param0, int param1) {
        int[] var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        hj var10;
        int[] var11;
        int[] var12;
        var9 = HoldTheLine.field_D;
        var10 = this.field_b.e();
        var12 = var10.field_z;
        var11 = var12;
        var4 = var11;
        var5 = param1 & 16711935;
        var6 = param1 & 65280;
        var7 = 0;
        if (param0 == -4503) {
          L0: while (true) {
            if (var7 >= var12.length) {
              return new mg(var10, this.field_a, this.field_j, this.field_d);
            } else {
              var8 = var12[var7];
              if (-1 != (var8 ^ -1)) {
                if ((65535 & var8) == var8 >> -1425068536) {
                  var8 = var8 & 255;
                  var4[var7] = 1 + (pk.a(16711680, var6 * var8) + pk.a(var5 * var8, -16712192) >>> -113251128);
                  var7++;
                  continue L0;
                } else {
                  var7++;
                  continue L0;
                }
              } else {
                var7++;
                continue L0;
              }
            }
          }
        } else {
          return (mg) null;
        }
    }

    final void a(int param0, boolean param1) {
        if (param1) {
            return;
        }
        this.b(27854);
        this.field_a = param0;
    }

    final hj a(float param0, int param1) {
        int var3 = 0;
        int var4 = HoldTheLine.field_D;
        param0 = (float)((double)param0 * 10.185916357881302);
        if (param1 != 27788) {
            return (hj) null;
        }
        for (var3 = Math.round(param0); (var3 ^ -1) > -1; var3 += 64) {
        }
        while (var3 >= 64) {
            var3 -= 64;
        }
        return this.a(var3, (byte) 120);
    }

    final static int a(qi param0, String param1, String[] param2, byte param3, int param4) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int stackIn_5_0 = 0;
        int stackIn_24_0 = 0;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        StringBuilder stackIn_30_1 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        StringBuilder stackIn_33_1 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
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
        String var12 = null;
        int var13 = 0;
        int var14 = 0;
        var14 = HoldTheLine.field_D;
        try {
          L0: {
            L1: {
              var5_int = 62 / ((param3 - 29) / 60);
              var6 = param0.a(param1);
              if (param4 < var6) {
                break L1;
              } else {
                if (0 == (param1.indexOf("<br>") ^ -1)) {
                  param2[0] = param1;
                  stackIn_5_0 = 1;
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            var7 = (-1 + (param4 + var6)) / param4;
            param4 = var6 / var7;
            var7 = 0;
            var8 = 0;
            var9 = param1.length();
            var10 = 0;
            L2: while (true) {
              if (var10 >= var9) {
                L3: {
                  if (var8 >= var9) {
                    break L3;
                  } else {
                    incrementValue$0 = var7;
                    var7++;
                    param2[incrementValue$0] = param1.substring(var8, var9).trim();
                    break L3;
                  }
                }
                stackIn_24_0 = var7;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                L4: {
                  L5: {
                    var11 = param1.charAt(var10);
                    if (32 == var11) {
                      break L5;
                    } else {
                      if (var11 == 45) {
                        break L5;
                      } else {
                        break L4;
                      }
                    }
                  }
                  var12 = param1.substring(var8, 1 + var10).trim();
                  var13 = param0.a(var12);
                  if (param4 > var13) {
                    break L4;
                  } else {
                    var8 = var10 - -1;
                    incrementValue$1 = var7;
                    var7++;
                    param2[incrementValue$1] = var12;
                    break L4;
                  }
                }
                if (62 == var11) {
                  L6: {
                    if (param1.regionMatches(-3 + var10, "<br>", 0, 4)) {
                      incrementValue$2 = var7;
                      var7++;
                      param2[incrementValue$2] = param1.substring(var8, -3 + var10).trim();
                      var8 = var10 + 1;
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                  var10++;
                  continue L2;
                } else {
                  var10++;
                  continue L2;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var5 = decompiledCaughtException;
            stackIn_27_0 = (RuntimeException) (var5);

            stackIn_27_1 = new StringBuilder().append("mg.E(");

            if (param0 == null) {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "null";
              break L7;
            } else {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "{...}";
              break L7;
            }
          }
          L8: {


            stackIn_30_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_28_2).append(',');

            if (param1 == null) {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "null";
              break L8;
            } else {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "{...}";
              break L8;
            }
          }
          L9: {


            stackIn_33_1 = ((StringBuilder) (Object) stackIn_31_1).append(stackIn_31_2).append(',');

            if (param2 == null) {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "null";
              break L9;
            } else {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "{...}";
              break L9;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_28_0), stackIn_34_2 + ',' + param3 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0;
        } else {
          return stackIn_24_0;
        }
    }

    final static Object a(byte param0, byte[] param1, boolean param2) {
        la var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_2_0 = null;
        la stackIn_6_0 = null;
        Object stackIn_9_0 = null;
        byte[] stackIn_12_0 = null;
        byte[] stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 != null) {
              if (-137 > (param1.length ^ -1)) {
                var3 = new la();
                ((ej) ((Object) var3)).a(95, param1);
                stackIn_6_0 = (la) (var3);
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (param0 > 93) {
                  if (param2) {
                    stackIn_14_0 = sj.a(param1, (byte) -69);
                    decompiledRegionSelector0 = 4;
                    break L0;
                  } else {
                    stackIn_12_0 = (byte[]) (param1);
                    decompiledRegionSelector0 = 3;
                    break L0;
                  }
                } else {
                  stackIn_9_0 = (Object) null;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              }
            } else {
              stackIn_2_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var3_ref);

            stackIn_17_1 = new StringBuilder().append("mg.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L1;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L1;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_9_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_12_0;
              } else {
                return stackIn_14_0;
              }
            }
          }
        }
    }

    public static void a(byte param0) {
        field_g = null;
        field_k = null;
        if (param0 != -28) {
            return;
        }
        field_i = null;
        field_e = null;
        field_f = null;
    }

    private final void b(int param0) {
        this.field_h = new hj[64];
        if (param0 != 27854) {
            this.b(85);
        }
    }

    private final hj a(int param0, byte param1) {
        int var5 = 0;
        int var4 = 0;
        hj var6 = null;
        int var3 = 40 % ((2 - param1) / 63);
        if (this.field_h[param0] != null) {
        } else {
            var5 = this.field_b.field_o - -this.field_b.field_v;
            var4 = this.field_b.field_o - -this.field_b.field_v;
            var6 = new hj(var4, var5);
            vb.a(-128, var6);
            if (this.field_d) {
                this.field_b.a(15, 16384 + param0 * 1024, this.field_a, var4 >> -2135304671, var5 >> -1038939487);
            } else {
                this.field_b.b(var4 >> -1637533279, var5 >> -229593983, 16384 + param0 * 1024, this.field_a);
            }
            if (!this.field_j) {
                var6.c();
            }
            this.field_h[param0] = new hj(var6.field_s, var6.field_y);
            this.field_h[param0].field_z = var6.field_z;
            ug.b(-1);
        }
        return this.field_h[param0];
    }

    mg(hj param0, boolean param1, boolean param2) {
        try {
            this.field_d = param2 ? true : false;
            this.field_j = param1 ? true : false;
            this.field_b = param0;
            this.a(4096, false);
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) ((Object) runtimeException), "mg.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    mg(hj param0, int param1, boolean param2, boolean param3) {
        try {
            this.field_j = param2 ? true : false;
            this.field_d = param3 ? true : false;
            this.field_b = param0;
            this.a(param1, false);
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) ((Object) runtimeException), "mg.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    static {
        field_c = false;
        field_e = "Members";
        field_i = "Quit";
        field_k = "to keep fullscreen or";
    }
}
