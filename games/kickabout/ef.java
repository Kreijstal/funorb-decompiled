/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ef extends am {
    private int field_o;
    static String field_p;
    static String field_n;
    private byte[][] field_r;
    static String field_s;
    db[] field_q;

    public static void h(byte param0) {
        int var1 = 35 % ((-83 - param0) / 36);
        field_p = null;
        field_s = null;
        field_n = null;
    }

    final static boolean a(CharSequence param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int stackIn_4_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_10_0 = 0;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        var3 = Kickabout.field_G;
        try {
          L0: {
            if (!hw.a(param0, -26200, true)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (param1 == -9907) {
                  break L1;
                } else {
                  field_n = (String) null;
                  break L1;
                }
              }
              var2_int = 0;
              L2: while (true) {
                if (param0.length() <= var2_int) {
                  stackOut_13_0 = 1;
                  stackIn_14_0 = stackOut_13_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  if (ws.a(param0.charAt(var2_int), (byte) 121)) {
                    var2_int++;
                    continue L2;
                  } else {
                    stackOut_10_0 = 0;
                    stackIn_11_0 = stackOut_10_0;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) (var2);
            stackOut_15_1 = new StringBuilder().append("ef.A(");
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param0 == null) {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L3;
            } else {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L3;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_11_0 != 0;
          } else {
            return stackIn_14_0 != 0;
          }
        }
    }

    final boolean g(byte param0) {
        int var2 = 0;
        int[] var2_ref_int__ = null;
        int var3_int = 0;
        tf var3 = null;
        int var4 = 0;
        iw var5_ref_iw = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        iw var9 = null;
        int var10 = 0;
        Object var11 = null;
        je var12 = null;
        int var13 = 0;
        int[] var14 = null;
        je var15 = null;
        int var16 = 0;
        int[] var17 = null;
        int[] var21 = null;
        byte[] var28 = null;
        int[] var29 = null;
        byte[] var30 = null;
        var13 = Kickabout.field_G;
        if (this.field_q == null) {
          L0: {
            if (null == this.field_r) {
              if (!gd.field_c.b((byte) 20, this.field_o)) {
                return false;
              } else {
                var21 = gd.field_c.c(this.field_o, 4);
                var17 = var21;
                var14 = var17;
                var2_ref_int__ = var14;
                this.field_r = new byte[var21.length][];
                var3_int = 0;
                L1: while (true) {
                  if (var21.length <= var3_int) {
                    break L0;
                  } else {
                    this.field_r[var3_int] = gd.field_c.b(this.field_o, -32669, var21[var3_int]);
                    var3_int++;
                    continue L1;
                  }
                }
              }
            } else {
              break L0;
            }
          }
          var2 = 1;
          var16 = 0;
          var3_int = var16;
          L2: while (true) {
            if (var16 >= this.field_r.length) {
              if (var2 == 0) {
                return false;
              } else {
                var5 = 57 % ((param0 - 36) / 42);
                var3 = new tf();
                var4 = gd.field_c.a(true, this.field_o);
                this.field_q = new db[var4];
                var29 = gd.field_c.c(this.field_o, 4);
                var7 = 0;
                L3: while (true) {
                  if (var29.length <= var7) {
                    this.field_r = (byte[][]) null;
                    return true;
                  } else {
                    var30 = this.field_r[var7];
                    var9 = new iw(var30);
                    var9.field_n = 1;
                    var10 = var9.a((byte) 81);
                    var11 = null;
                    var12 = (je) ((Object) var3.g(24009));
                    L4: while (true) {
                      L5: {
                        if (var12 == null) {
                          break L5;
                        } else {
                          if (var12.field_l != var10) {
                            var12 = (je) ((Object) var3.c(33));
                            continue L4;
                          } else {
                            var11 = var12;
                            break L5;
                          }
                        }
                      }
                      L6: {
                        if (var11 == null) {
                          var15 = new je(var10, gs.field_d.a(0, var10));
                          var11 = var15;
                          var3.a(var15, 3);
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                      this.field_q[var29[var7]] = new db(var30, (je) (var11));
                      var7++;
                      continue L3;
                    }
                  }
                }
              }
            } else {
              var28 = this.field_r[var16];
              var5_ref_iw = new iw(var28);
              var5_ref_iw.field_n = 1;
              var6 = var5_ref_iw.a((byte) 81);
              var2 = var2 != 0 & gs.field_d.b(var6, 119) ? 1 : 0;
              var16++;
              continue L2;
            }
          }
        } else {
          return true;
        }
    }

    ef(int param0) {
        this.field_o = param0;
    }

    static {
        field_n = "Insufficient funds!";
        field_p = "Show all game chat";
        field_s = "<%0> goes through <%1> for making more passes than <%2>";
    }
}
