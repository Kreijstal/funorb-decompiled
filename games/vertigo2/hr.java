/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hr extends ji {
    static String field_z;
    private int[][] field_B;
    private int field_E;
    private int[] field_y;
    private short[] field_F;
    static cr field_C;
    static int field_D;
    private int[] field_A;

    private final void b(byte param0) {
        int[] var10 = this.field_B[0];
        int[] var8 = var10;
        int[] var7 = var8;
        int[] var2 = var7;
        int var3 = 10 % ((param0 - 38) / 60);
        int[] var13 = this.field_B[1];
        int[] var5 = this.field_B[-2 + this.field_B.length];
        int[] var6 = this.field_B[-1 + this.field_B.length];
        this.field_y = new int[]{var5[0] + -var6[0] + var5[0], -var6[1] - (-var5[1] - var5[1])};
        this.field_A = new int[]{var10[0] + (var10[0] + -var13[0]), var10[1] - var13[1] + var10[1]};
    }

    final static void a(int param0, boolean param1) {
        RuntimeException var2 = null;
        int var3 = 0;
        vi var4 = null;
        s var5 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            var4 = (vi) ((Object) mc.field_i.a((byte) 100));
            L1: while (true) {
              if (var4 == null) {
                var5 = (s) ((Object) wg.field_i.a((byte) 100));
                L2: while (true) {
                  if (var5 == null) {
                    L3: {
                      if (param1) {
                        break L3;
                      } else {
                        field_z = (String) null;
                        break L3;
                      }
                    }
                    break L0;
                  } else {
                    mm.a(param0, var5, (byte) 108);
                    var5 = (s) ((Object) wg.field_i.b(125));
                    continue L2;
                  }
                }
              } else {
                aj.a(param0, 126, var4);
                var4 = (vi) ((Object) mc.field_i.b(40));
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wn.a((Throwable) ((Object) var2), "hr.J(" + param0 + ',' + param1 + ')');
        }
    }

    final static String h(int param0) {
        if (!(bf.field_b != un.field_Hb)) {
            return wn.field_d;
        }
        if (!(um.field_F != bf.field_b)) {
            return uk.field_u;
        }
        if (param0 > -85) {
            field_D = -44;
        }
        if (!cl.field_c.a((byte) -86)) {
            return uk.field_u;
        }
        return ff.field_u;
    }

    final static int i(int param0) {
        int discarded$0 = 0;
        if (param0 <= 25) {
            discarded$0 = hr.i(55);
        }
        return mf.field_b + ((rm.field_B << 214119524) + (oa.field_p << -248092638));
    }

    final int[] c(int param0, int param1) {
        int[] var5 = null;
        int var6 = 0;
        int var4 = 0;
        int var7 = Vertigo2.field_L ? 1 : 0;
        int[] var8 = this.field_x.a(param0, (byte) 67);
        int[] var3 = var8;
        if (param1 <= 91) {
            field_z = (String) null;
        }
        if (this.field_x.field_i) {
            var5 = this.a(0, -1, param0);
            for (var6 = 0; var6 < we.field_M; var6++) {
                var4 = var5[var6] >> -333336988;
                if (!(-1 >= (var4 ^ -1))) {
                    var4 = 0;
                }
                if (256 < var4) {
                    var4 = 256;
                }
                var8[var6] = this.field_F[var4];
            }
        }
        return var8;
    }

    private final int[] a(int param0, byte param1) {
        if (0 > param0) {
            return this.field_A;
        }
        if (param1 <= 49) {
            return (int[]) null;
        }
        if (!(this.field_B.length > param0)) {
            return this.field_y;
        }
        return this.field_B[param0];
    }

    public static void j(int param0) {
        if (param0 < 34) {
            return;
        }
        field_z = null;
        field_C = null;
    }

    final void a(byte param0, int param1, ed param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        var5 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            if (param0 == 110) {
              L1: {
                if (param1 == 0) {
                  this.field_E = param2.h(param0 ^ -101);
                  this.field_B = new int[param2.h(param0 + -121)][2];
                  var4_int = 0;
                  L2: while (true) {
                    if (var4_int >= this.field_B.length) {
                      break L1;
                    } else {
                      this.field_B[var4_int][0] = param2.a((byte) -11);
                      this.field_B[var4_int][1] = param2.a((byte) -11);
                      var4_int++;
                      continue L2;
                    }
                  }
                } else {
                  break L1;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) (var4);
            stackOut_9_1 = new StringBuilder().append("hr.C(").append(param0).append(',').append(param1).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param2 == null) {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static void a(boolean param0, boolean param1) {
        td.a(param0, param1, (byte) -77);
    }

    public hr() {
        super(1, true);
        this.field_F = new short[257];
        this.field_E = 0;
    }

    private final void g(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
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
        int var21 = 0;
        int[] var22 = null;
        int[] var24 = null;
        int[] var26 = null;
        int[] var34 = null;
        int[] var35 = null;
        int[] var36 = null;
        var21 = Vertigo2.field_L ? 1 : 0;
        if (param0 == 1) {
          L0: {
            var2 = this.field_E;
            if (var2 == 2) {
              var2 = 0;
              L1: while (true) {
                if (-258 >= (var2 ^ -1)) {
                  break L0;
                } else {
                  var4 = var2 << -76013852;
                  var3 = 1;
                  L2: while (true) {
                    L3: {
                      if (this.field_B.length + -1 <= var3) {
                        break L3;
                      } else {
                        if (var4 < this.field_B[var3][0]) {
                          break L3;
                        } else {
                          var3++;
                          continue L2;
                        }
                      }
                    }
                    L4: {
                      var22 = this.field_B[var3 - 1];
                      var34 = this.field_B[var3];
                      var7 = this.a(-2 + var3, (byte) 104)[1];
                      var8 = var22[1];
                      var9 = var34[1];
                      var10 = this.a(var3 + 1, (byte) 117)[1];
                      var11 = (-var22[0] + var4 << 1650595724) / (-var22[0] + var34[0]);
                      var12 = var11 * var11 >> -777894484;
                      var13 = var8 + -var9 + var10 + -var7;
                      var14 = -var13 + (-var8 + var7);
                      var15 = var9 + -var7;
                      var16 = var8;
                      var17 = var12 * (var11 * var13 >> -1033161588) >> 942271084;
                      var18 = var14 * var12 >> 93501292;
                      var19 = var11 * var15 >> -648172852;
                      var20 = var16 + (var19 + (var18 + var17));
                      if (32767 <= (var20 ^ -1)) {
                        var20 = -32767;
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    L5: {
                      if (-32769 < (var20 ^ -1)) {
                        break L5;
                      } else {
                        var20 = 32767;
                        break L5;
                      }
                    }
                    this.field_F[var2] = (short)var20;
                    var2++;
                    continue L1;
                  }
                }
              }
            } else {
              if ((var2 ^ -1) != -2) {
                var2 = 0;
                L6: while (true) {
                  if ((var2 ^ -1) <= -258) {
                    break L0;
                  } else {
                    var4 = var2 << -268015900;
                    var3 = 1;
                    L7: while (true) {
                      L8: {
                        if (-1 + this.field_B.length <= var3) {
                          break L8;
                        } else {
                          if (this.field_B[var3][0] > var4) {
                            break L8;
                          } else {
                            var3++;
                            continue L7;
                          }
                        }
                      }
                      L9: {
                        var26 = this.field_B[-1 + var3];
                        var36 = this.field_B[var3];
                        var7 = (-var26[0] + var4 << 1782569900) / (-var26[0] + var36[0]);
                        var8 = 4096 + -var7;
                        var9 = var36[1] * var7 + var8 * var26[1] >> 1567359148;
                        if ((var9 ^ -1) < 32767) {
                          break L9;
                        } else {
                          var9 = -32767;
                          break L9;
                        }
                      }
                      L10: {
                        if ((var9 ^ -1) > -32769) {
                          break L10;
                        } else {
                          var9 = 32767;
                          break L10;
                        }
                      }
                      this.field_F[var2] = (short)var9;
                      var2++;
                      continue L6;
                    }
                  }
                }
              } else {
                var2 = 0;
                L11: while (true) {
                  if (-258 >= (var2 ^ -1)) {
                    break L0;
                  } else {
                    var4 = var2 << -469215324;
                    var3 = 1;
                    L12: while (true) {
                      L13: {
                        if (var3 >= -1 + this.field_B.length) {
                          break L13;
                        } else {
                          if (var4 < this.field_B[var3][0]) {
                            break L13;
                          } else {
                            var3++;
                            continue L12;
                          }
                        }
                      }
                      L14: {
                        var24 = this.field_B[-1 + var3];
                        var35 = this.field_B[var3];
                        var7 = (-var24[0] + var4 << 677408748) / (-var24[0] + var35[0]);
                        var8 = 4096 + -qb.field_b[var7 >> 395495173 & 255] >> 168953441;
                        var9 = 4096 - var8;
                        var10 = var8 * var35[1] + var9 * var24[1] >> -738728660;
                        if (-32768 >= var10) {
                          var10 = -32767;
                          break L14;
                        } else {
                          break L14;
                        }
                      }
                      L15: {
                        if (var10 >= 32768) {
                          var10 = 32767;
                          break L15;
                        } else {
                          break L15;
                        }
                      }
                      this.field_F[var2] = (short)var10;
                      var2++;
                      continue L11;
                    }
                  }
                }
              }
            }
          }
          return;
        } else {
          return;
        }
    }

    final void a(int param0) {
        String discarded$0 = null;
        if (this.field_B == null) {
            this.field_B = new int[][]{new int[]{0, 0}, new int[]{4096, 4096}};
        }
        if (this.field_B.length < 2) {
            throw new RuntimeException("Curve operation requires at least two markers");
        }
        if ((this.field_E ^ -1) == -3) {
            this.b((byte) 125);
        }
        uk.d((byte) 66);
        this.g(1);
        if (param0 > -98) {
            discarded$0 = hr.h(104);
        }
    }

    static {
        field_z = "Real-life threats";
    }
}
