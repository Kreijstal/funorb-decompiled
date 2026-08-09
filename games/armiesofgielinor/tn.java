/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tn extends sf implements he {
    private fw field_bb;
    static rn field_ab;
    private fw field_fb;
    static wk[] field_eb;
    static jl field_cb;
    static byte[] field_db;
    static tg field_Z;
    static String field_X;
    static String field_Y;
    static int[][] field_W;

    public static void n(int param0) {
        field_ab = null;
        field_eb = null;
        field_db = null;
        field_X = null;
        field_Z = null;
        field_W = (int[][]) null;
        if (param0 != 0) {
            return;
        }
        field_Y = null;
        field_cb = null;
    }

    tn(gk param0) {
        super(param0, 200, 130);
        kb var2 = null;
        try {
            var2 = new kb(hw.field_z, (qo) null);
            var2.field_w = 80;
            var2.field_l = this.field_l;
            var2.field_B = 0;
            var2.field_p = 50;
            var2.field_k = (kh) ((Object) new lk(gl.field_e, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true));
            this.a((byte) 10, var2);
            if (nw.g(98)) {
                this.field_fb = this.a((qo) (this), true, tg.field_j);
            }
            this.field_bb = this.a((qo) (this), true, pd.field_f);
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "tn.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final void a(int param0, int param1, int param2, int param3, fw param4) {
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        try {
          L0: {
            L1: {
              if (param1 == 11) {
                break L1;
              } else {
                field_W = (int[][]) null;
                break L1;
              }
            }
            L2: {
              if (param4 != this.field_fb) {
                if (param4 == this.field_bb) {
                  this.o(1);
                  break L2;
                } else {
                  break L2;
                }
              } else {
                ed.a(false);
                this.o(param1 + -10);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var6);

            stackIn_10_1 = new StringBuilder().append("tn.N(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
    }

    private final void o(int param0) {
        if (param0 != 1) {
            bv var3 = (bv) null;
            tn.a(false, 35, (bv) null);
        }
        if (!(this.field_L)) {
            return;
        }
        this.field_L = false;
    }

    private final fw a(qo param0, boolean param1, String param2) {
        fw var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        fw stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var4 = new fw(param2, param0);
              if (param1) {
                break L1;
              } else {
                tn.a(false, -22, 101);
                break L1;
              }
            }
            var4.field_k = (kh) ((Object) new nu());
            var5 = -6 + this.field_w;
            this.field_w = this.field_w + 38;
            var4.a(15, -14 + this.field_l + -16, var5, 8192, 30);
            this.a((byte) 10, (kb) (var4));
            this.e(0);
            stackIn_3_0 = (fw) (var4);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4_ref = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var4_ref);

            stackIn_6_1 = new StringBuilder().append("tn.G(");

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
          L3: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_7_0), stackIn_10_2 + ')');
        }
        return stackIn_3_0;
    }

    final boolean a(kb param0, int param1, char param2, int param3) {
        RuntimeException var5 = null;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        boolean stackIn_12_0 = false;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (98 != param1) {
              if (param3 == -12215) {
                if (param1 != 99) {
                  stackIn_12_0 = super.a(param0, param1, param2, param3 + 0);
                  decompiledRegionSelector0 = 3;
                  break L0;
                } else {
                  this.field_bb.a(11, (kb) (this));
                  stackIn_10_0 = 1;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                stackIn_7_0 = 1;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              if (this.field_fb != null) {
                this.field_fb.a(11, (kb) (this));
                stackIn_4_0 = 1;
                decompiledRegionSelector0 = 0;
                break L0;
              } else {
                this.field_bb.a(11, (kb) (this));
                return true;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var5);

            stackIn_15_1 = new StringBuilder().append("tn.F(");

            if (param0 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L1;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L1;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_10_0 != 0;
            } else {
              return stackIn_12_0;
            }
          }
        }
    }

    final static void a(byte param0, wk[] param1) {
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int[] var14 = null;
        int[] var15 = null;
        var13 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 >= 67) {
                break L1;
              } else {
                field_ab = (rn) null;
                break L1;
              }
            }
            L2: {
              var2_int = 0;
              if ((param1.length ^ -1) != -7) {
                if ((param1.length ^ -1) != -8) {
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  break L2;
                }
              } else {
                var2_int = 1;
                break L2;
              }
            }
            var3 = 0;
            L3: while (true) {
              if (var3 >= param1.length) {
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                var15 = param1[var3].field_B;
                var14 = var15;
                var4 = var14;
                var5 = 16711680 & bo.field_g[var2_int + var3];
                var6 = 65280 & bo.field_g[var2_int + var3];
                var7 = 255 & bo.field_g[var3 - -var2_int];
                var8 = 0;
                L4: while (true) {
                  if (var15.length <= var8) {
                    var3++;
                    continue L3;
                  } else {
                    var9 = var15[var8] & 16711680;
                    var10 = 65280 & var15[var8];
                    var11 = 255 & var15[var8];
                    var12 = var15[var8] & -16777216;
                    if (var10 == var9 >> -705478136) {
                      if (var10 >> 2033572456 == var11) {
                        L5: {
                          if (var11 < 128) {
                            var11 = var11 << 1;
                            var4[var8] = oe.c(var12, oe.c(oe.c(rn.a(var5 * var11, -16777164) >>> 1440235560, rn.a(var11 * var6, 16711832) >>> 1822604168), rn.a(var7 * var11 >>> 1296372296, 754974975)));
                            break L5;
                          } else {
                            var4[var8] = oe.c(oe.c(oe.c(rn.a((256 - var11) * var5 + var11 * 16711680 + -2139095040 >>> 1559026023, 1727987712), rn.a(8355863, (-var11 + 256) * var6 + (var11 - 128) * 65280) >>> 382425191), (256 - var11) * var7 + 255 * var11 - 32640 >>> 1498552903), var12);
                            break L5;
                          }
                        }
                        var8++;
                        continue L4;
                      } else {
                        var8++;
                        continue L4;
                      }
                    } else {
                      var8++;
                      continue L4;
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var2 = decompiledCaughtException;
            stackIn_24_0 = (RuntimeException) (var2);

            stackIn_24_1 = new StringBuilder().append("tn.H(").append(param0).append(',');

            if (param1 == null) {
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
          throw ig.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static long a(boolean param0, int param1, bv param2) {
        RuntimeException var3 = null;
        long stackIn_2_0 = 0L;
        long stackIn_4_0 = 0L;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (!param0) {
              stackIn_4_0 = (long)de.a(-111, param2, 4, 14, 30, 20);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 100L;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var3);

            stackIn_7_1 = new StringBuilder().append("tn.C(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
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
          throw ig.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    final static wk[] a(boolean param0, int param1, int param2) {
        if (!param0) {
            bv var4 = (bv) null;
            tn.a(false, 58, (bv) null);
        }
        return ft.a(param1, (byte) -114, param2, 1);
    }

    static {
        field_ab = new rn();
        field_cb = new jl();
        field_Y = "You must play 1 more rated game before playing with the current options.";
        field_X = "Email (Login):";
        field_db = new byte[520];
        field_W = new int[][]{new int[]{100, 100, 100, 400, 400}, new int[]{200, 200, 700}, new int[]{200}};
    }
}
