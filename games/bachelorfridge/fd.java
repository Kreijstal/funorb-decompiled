/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fd extends ana {
    private taa field_F;
    private int field_w;
    private rr[] field_I;
    private int field_y;
    private cq field_G;
    static eaa field_z;
    tla field_B;
    private boolean field_v;
    private int field_x;
    static String field_E;
    static int[] field_D;

    final static pia a(byte param0, int param1, int param2, vr param3, vr param4) {
        RuntimeException var5 = null;
        pia stackIn_2_0 = null;
        pia stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 == -105) {
              if (g.a(param2, param1, param0 ^ 30847, param4)) {
                stackIn_7_0 = cea.a(param3.b(-56, param2, param1), 28450);
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                return null;
              }
            } else {
              stackIn_2_0 = (pia) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var5);

            stackIn_10_1 = new StringBuilder().append("fd.F(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L1;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');

            if (param4 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L2;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L2;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_11_0), stackIn_14_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_7_0;
        }
    }

    public static void d(int param0) {
        field_z = null;
        field_E = null;
        field_D = null;
        if (param0 != 0) {
            String[] var2 = (String[]) null;
            fd.a((int[]) null, (vr) null, -57, 54, (byte[]) null, (vr) null, true, (vr) null, (int[]) null, 67, (ee[]) null, (kv[][]) null, (kv[][]) null, (byte[]) null, (String[][]) null, (String[][]) null, (String[]) null);
        }
    }

    fd(gj param0, tla param1) {
        super(param0, param1);
        rr dupTemp$1 = null;
        int var3_int = 0;
        int var4 = 0;
        aj[] var5 = null;
        int var6 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        this.field_w = 0;
        this.field_y = 25;
        this.field_v = false;
        try {
          L0: {
            L1: {
              this.field_B = param1;
              if ((m.field_a.nextInt() & 1) != 0) {
                stackIn_4_0 = 0;
                break L1;
              } else {
                stackIn_4_0 = 1;
                break L1;
              }
            }
            var3_int = stackIn_4_0;
            var4 = this.field_B.field_u;
            var5 = this.field_B.field_t;
            this.field_I = new rr[var4];
            var6 = 0;
            L2: while (true) {
              if (var6 >= var4) {
                L3: {
                  if ((var4 ^ -1) >= -1) {
                    break L3;
                  } else {
                    this.field_F = this.field_I[var4 >> -379861375].e((byte) -120);
                    this.a(27799, this.field_F);
                    break L3;
                  }
                }
                break L0;
              } else {
                this.field_I[var6] = new rr(this.field_q, (fd) (this), var5[var6].field_c, var5[var6].field_a, var3_int != 0);
                dupTemp$1 = this.field_I[var6];
                dupTemp$1.field_w = dupTemp$1.field_w - var6 * this.field_y;
                var6++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var3);

            stackIn_12_1 = new StringBuilder().append("fd.<init>(");

            if (param0 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');

            if (param1 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L5;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L5;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_13_0), stackIn_16_2 + ')');
        }
    }

    private final void e(int param0) {
        if (this.field_G != null) {
            id.a(-95, this.field_G);
        }
        gka.a(-128, this.field_x);
        int var2 = -114 % ((param0 - -7) / 34);
    }

    final static void a(int[] param0, vr param1, int param2, int param3, byte[] param4, vr param5, boolean param6, vr param7, int[] param8, int param9, ee[] param10, kv[][] param11, kv[][] param12, byte[] param13, String[][] param14, String[][] param15, String[] param16) {
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        StringBuilder stackIn_8_1 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        StringBuilder stackIn_23_1 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        StringBuilder stackIn_26_1 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        StringBuilder stackIn_29_1 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        StringBuilder stackIn_32_1 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        StringBuilder stackIn_35_1 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_36_2 = null;
        StringBuilder stackIn_38_1 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_39_2 = null;
        StringBuilder stackIn_41_1 = null;
        StringBuilder stackIn_42_1 = null;
        String stackIn_42_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var17 = null;
        vr var18 = null;
        String[] var19 = null;
        try {
          L0: {
            L1: {
              var19 = (String[]) null;
              vh.a(param4, param8, param13, param10, 1, param0, param6, param5, param12, param14, param9, param16, param2, param1, (String[]) null, param11, param7, param15, 22914);
              if (param3 == 0) {
                break L1;
              } else {
                var18 = (vr) null;
                fd.a((byte) 115, 95, 37, (vr) null, (vr) null);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var17 = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (var17);

            stackIn_5_1 = new StringBuilder().append("fd.D(");

            if (param0 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_8_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(',');

            if (param1 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L3;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_11_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L4;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_14_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',');

            if (param5 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L5;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_17_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',').append(param6).append(',');

            if (param7 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L6;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L6;
            }
          }
          L7: {


            stackIn_20_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',');

            if (param8 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L7;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L7;
            }
          }
          L8: {


            stackIn_23_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_21_2).append(',').append(param9).append(',');

            if (param10 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L8;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L8;
            }
          }
          L9: {


            stackIn_26_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_24_2).append(',');

            if (param11 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "null";
              break L9;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "{...}";
              break L9;
            }
          }
          L10: {


            stackIn_29_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_27_2).append(',');

            if (param12 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "null";
              break L10;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "{...}";
              break L10;
            }
          }
          L11: {


            stackIn_32_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_30_2).append(',');

            if (param13 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "null";
              break L11;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "{...}";
              break L11;
            }
          }
          L12: {


            stackIn_35_1 = ((StringBuilder) (Object) stackIn_33_1).append(stackIn_33_2).append(',');

            if (param14 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_36_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackIn_36_2 = "null";
              break L12;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_36_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackIn_36_2 = "{...}";
              break L12;
            }
          }
          L13: {


            stackIn_38_1 = ((StringBuilder) (Object) stackIn_36_1).append(stackIn_36_2).append(',');

            if (param15 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_39_1 = (StringBuilder) ((Object) stackIn_38_1);
              stackIn_39_2 = "null";
              break L13;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_39_1 = (StringBuilder) ((Object) stackIn_38_1);
              stackIn_39_2 = "{...}";
              break L13;
            }
          }
          L14: {


            stackIn_41_1 = ((StringBuilder) (Object) stackIn_39_1).append(stackIn_39_2).append(',');

            if (param16 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_42_1 = (StringBuilder) ((Object) stackIn_41_1);
              stackIn_42_2 = "null";
              break L14;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_42_1 = (StringBuilder) ((Object) stackIn_41_1);
              stackIn_42_2 = "{...}";
              break L14;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_6_0), stackIn_42_2 + ')');
        }
    }

    final void c(int param0) {
        rr[] var2;
        int var3;
        rr var4;
        int var5;
        rr[] var6;
        var5 = BachelorFridge.field_y;
        var6 = this.field_I;
        var2 = var6;
        if (param0 <= -10) {
          var3 = 0;
          L0: while (true) {
            if (var3 >= var6.length) {
              return;
            } else {
              var4 = var6[var3];
              if (var4 != null) {
                var4.c(-44);
                var3++;
                continue L0;
              } else {
                var3++;
                continue L0;
              }
            }
          }
        } else {
          return;
        }
    }

    final static void a(boolean param0, int param1, boolean param2) {
        int var3 = 0;
        CharSequence var7 = null;
        String var4 = null;
        Object var5 = null;
        if (wh.field_p == null) {
        } else {
            var3 = wh.field_p.b(param2, 93);
            if (0 == var3) {
            } else {
                if (var3 == 2 && null != wh.field_p.field_Z) {
                    if (wh.field_p.field_Z.equals("")) {
                    } else {
                        if (wh.field_p.field_Z.charAt(0) == 91) {
                            var4 = wh.field_p.field_Z;
                        } else {
                            var7 = (CharSequence) ((Object) wh.field_p.field_Z);
                            var4 = fq.a(0, var7);
                            var5 = var4;
                            var5 = var4;
                        }
                        var5 = null;
                        if (!(-1 != (vaa.field_f ^ -1))) {
                            var5 = lda.a(-26181, param1, var4);
                        }
                        if (-2 == (vaa.field_f ^ -1)) {
                            var5 = via.a(param1, var4, -75);
                        }
                        if (vaa.field_f == 2) {
                            var5 = ip.a(var4, (byte) -80, param1);
                        }
                        if (-4 == (vaa.field_f ^ -1)) {
                            var5 = tha.a(2, var4, var4, param1);
                        }
                        if (!(var5 == null)) {
                            String var6 = (String) null;
                            vf.a(var4, 0, -101, (String) null, (String) (var5), 2);
                        }
                    }
                }
                wh.field_p = null;
                vaa.field_f = -1;
            }
        }
        if (!param0) {
            field_D = (int[]) null;
        }
    }

    final boolean c(byte param0) {
        int var2;
        int var3;
        rr[] var4;
        rr var4_ref;
        int var5;
        Object var6;
        int var7;
        rr[] var8;
        rr var9;
        rr var10;
        L0: {
          var7 = BachelorFridge.field_y;
          var2 = -3 % ((param0 - 71) / 47);
          if (this.field_v) {
            break L0;
          } else {
            this.field_x = bs.field_k;
            this.field_v = true;
            break L0;
          }
        }
        L1: {
          if ((bs.field_k ^ -1) < -1) {
            L2: {
              var3 = -2 + bs.field_k;
              if (0 > var3) {
                var3 = 0;
                break L2;
              } else {
                break L2;
              }
            }
            gka.a(-56, var3);
            break L1;
          } else {
            break L1;
          }
        }
        this.field_w = this.field_w + 1;
        if (this.field_m.a((byte) -106)) {
          return false;
        } else {
          L3: {
            if (null == this.field_F) {
              break L3;
            } else {
              if (!this.field_F.a((byte) -106)) {
                break L3;
              } else {
                return false;
              }
            }
          }
          L4: {
            if (this.field_w <= 128) {
              break L4;
            } else {
              if (this.field_G == null) {
                gka.a(107, 0);
                this.field_G = tw.a(je.a(rt.field_a[68], 384, 256), (byte) -36);
                break L4;
              } else {
                break L4;
              }
            }
          }
          var3 = 1;
          var8 = this.field_I;
          var4 = var8;
          var5 = 0;
          L5: while (true) {
            if (var5 >= var8.length) {
              L6: {
                if (-1 > (this.field_B.field_u ^ -1)) {
                  var10 = this.field_I[this.field_B.field_u >> 902122369];
                  var4_ref = var10;
                  if (var4_ref != null) {
                    var10.d(320);
                    break L6;
                  } else {
                    break L6;
                  }
                } else {
                  break L6;
                }
              }
              if (var3 == 0) {
                return false;
              } else {
                this.e(-86);
                return true;
              }
            } else {
              var9 = var8[var5];
              if (var9 != null) {
                if (!var9.b(21807)) {
                  var3 = 0;
                  var5++;
                  continue L5;
                } else {
                  var6 = null;
                  var5++;
                  continue L5;
                }
              } else {
                var5++;
                continue L5;
              }
            }
          }
        }
    }

    static {
        field_z = new eaa();
        field_E = "Passwords must be between 5 and 20 characters long";
    }
}
