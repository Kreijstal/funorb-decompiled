/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ur extends qr {
    static String field_yb;
    private qr field_Gb;
    private qr field_Fb;
    static gb field_zb;
    private qr field_xb;
    static String[] field_Bb;
    private qr field_Eb;
    static String field_Db;
    private qr field_Ab;
    private qr field_Cb;
    private int field_Hb;

    ur(long param0, qr param1, qr param2, qr param3, qr param4) {
        super(param0, (qr) null);
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
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        qr var9 = null;
        qr var10 = null;
        try {
          L0: {
            this.field_Fb = new qr(0L, param1);
            this.field_Cb = new qr(0L, param2);
            this.a(4, this.field_Fb);
            this.a(4, this.field_Cb);
            this.field_Gb = new qr(0L, (qr) null);
            this.a(4, this.field_Gb);
            this.field_xb = new qr(0L, param3);
            this.field_Eb = new qr(0L, param3);
            this.field_Eb.field_r = true;
            var9 = this.field_xb;
            var10 = var9;
            var10.field_r = true;
            this.field_Gb.a(4, this.field_xb);
            this.field_Gb.a(4, this.field_Eb);
            this.field_Ab = new qr(0L, param4);
            this.field_Ab.field_P = true;
            this.field_Gb.a(4, this.field_Ab);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var7 = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (var7);

            stackIn_5_1 = new StringBuilder().append("ur.<init>(").append(param0).append(',');

            if (param1 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L1;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_8_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(',');

            if (param2 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_11_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',');

            if (param3 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L3;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_14_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',');

            if (param4 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L4;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L4;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_6_0), stackIn_15_2 + ')');
        }
    }

    final boolean i(int param0) {
        if (this.field_xb.field_rb == 0) {
          if (0 != this.field_xb.field_ub) {
            L0: {
              if (this.field_Hb > 0) {
                this.field_Hb = this.field_Hb - 1;
                break L0;
              } else {
                break L0;
              }
            }
            if (0 == this.field_Hb) {
              if (this.field_Ab.field_N + this.field_Ab.field_w <= bb.field_b) {
                if (param0 <= 84) {
                  return true;
                } else {
                  return false;
                }
              } else {
                this.field_Hb = 3;
                return true;
              }
            } else {
              if (param0 <= 84) {
                return true;
              } else {
                return false;
              }
            }
          } else {
            if (param0 <= 84) {
              return true;
            } else {
              return false;
            }
          }
        } else {
          this.field_Hb = 20;
          return true;
        }
    }

    final int a(int param0, int param1, int param2, boolean param3) {
        int var5;
        int var6;
        int var7;
        int var8;
        L0: {
          var5 = 0;
          var6 = this.field_Gb.field_mb - this.field_Ab.field_mb;
          if (0 >= var6) {
            break L0;
          } else {
            var7 = this.field_Ab.field_db;
            var8 = -param2 + param1;
            var5 = (var6 / 2 + var8 * var7) / var6;
            break L0;
          }
        }
        if (param0 == -5639) {
          if (param3) {
            L1: {
              if (-1 >= (var5 ^ -1)) {
                break L1;
              } else {
                var5 = 0;
                break L1;
              }
            }
            if (var5 <= param1 + -param2) {
              return var5;
            } else {
              var5 = param1 - param2;
              return var5;
            }
          } else {
            L2: {
              if (-param2 + param1 < var5) {
                var5 = -param2 + param1;
                break L2;
              } else {
                break L2;
              }
            }
            if (0 <= var5) {
              return var5;
            } else {
              var5 = 0;
              return var5;
            }
          }
        } else {
          return 96;
        }
    }

    final boolean h(int param0) {
        if (param0 < -109) {
          if (-1 == (this.field_Fb.field_rb ^ -1)) {
            if (-1 != (this.field_Fb.field_ub ^ -1)) {
              if ((this.field_Hb ^ -1) >= -1) {
                if (this.field_Hb == 0) {
                  this.field_Hb = 3;
                  return true;
                } else {
                  return false;
                }
              } else {
                this.field_Hb = this.field_Hb - 1;
                if (this.field_Hb == 0) {
                  this.field_Hb = 3;
                  return true;
                } else {
                  return false;
                }
              }
            } else {
              return false;
            }
          } else {
            this.field_Hb = 20;
            return true;
          }
        } else {
          return false;
        }
    }

    final boolean g(byte param0) {
        int var2;
        if (-1 == (this.field_Eb.field_rb ^ -1)) {
          if (this.field_Eb.field_ub != 0) {
            L0: {
              if (this.field_Hb > 0) {
                this.field_Hb = this.field_Hb - 1;
                break L0;
              } else {
                break L0;
              }
            }
            if (this.field_Hb == 0) {
              if (bb.field_b < this.field_Ab.field_N - -this.field_Ab.field_w + (this.field_Ab.field_mb - -this.field_Ab.field_gb)) {
                var2 = 125 % ((param0 - -29) / 47);
                return false;
              } else {
                this.field_Hb = 3;
                return true;
              }
            } else {
              var2 = 125 % ((param0 - -29) / 47);
              return false;
            }
          } else {
            var2 = 125 % ((param0 - -29) / 47);
            return false;
          }
        } else {
          this.field_Hb = 20;
          return true;
        }
    }

    final void a(int param0, int param1, int param2, byte param3, int param4, int param5, int param6, int param7) {
        this.field_hb = param1;
        if (param3 != -77) {
          return;
        } else {
          this.field_mb = param7;
          this.field_db = param0;
          this.field_K = param2;
          this.a(param5, param3 + 97, param6, param4);
          return;
        }
    }

    final boolean g(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        if (param0 != -20641) {
          L0: {
            this.i(-86);
            if (this.field_Ab.field_ub == 0) {
              stackIn_8_0 = 0;
              break L0;
            } else {
              stackIn_8_0 = 1;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (this.field_Ab.field_ub == 0) {
              stackIn_4_0 = 0;
              break L1;
            } else {
              stackIn_4_0 = 1;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    final static void j(int param0) {
        if (param0 != 0) {
            return;
        }
        String var2 = (String) null;
        ce.a(ae.field_g, (String) null, (byte) 3);
    }

    final boolean f(boolean param0) {
        if (this.field_Cb.field_rb != 0) {
          this.field_Hb = 20;
          return true;
        } else {
          if (!param0) {
            if (this.field_Cb.field_ub != 0) {
              if (-1 <= (this.field_Hb ^ -1)) {
                if (0 != this.field_Hb) {
                  return false;
                } else {
                  this.field_Hb = 3;
                  return true;
                }
              } else {
                this.field_Hb = this.field_Hb - 1;
                if (0 == this.field_Hb) {
                  this.field_Hb = 3;
                  return true;
                } else {
                  return false;
                }
              }
            } else {
              return false;
            }
          } else {
            ur.f((byte) -12);
            if (this.field_Cb.field_ub != 0) {
              if (-1 > (this.field_Hb ^ -1)) {
                this.field_Hb = this.field_Hb - 1;
                if (0 != this.field_Hb) {
                  return false;
                } else {
                  this.field_Hb = 3;
                  return true;
                }
              } else {
                if (0 != this.field_Hb) {
                  return false;
                } else {
                  this.field_Hb = 3;
                  return true;
                }
              }
            } else {
              return false;
            }
          }
        }
    }

    final static void a(int param0, boolean param1, int param2) {
        if (param1) {
            return;
        }
        cb.field_n = param0;
        s.field_c = param2;
    }

    public static void f(byte param0) {
        field_Bb = null;
        field_Db = null;
        field_zb = null;
        if (param0 != -118) {
            return;
        }
        field_yb = null;
    }

    final static void a(bi[][] param0, int param1, byte[] param2, boolean param3, bc param4, int[] param5, bi[][] param6, String[] param7, String[] param8, int param9, byte[] param10, bc param11, bc param12, nk[] param13, String[][] param14, int param15, String[][] param16, int[] param17, int param18) {
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
        StringBuilder stackIn_44_1 = null;
        StringBuilder stackIn_45_1 = null;
        String stackIn_45_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var19 = null;
        String[] var20 = null;
        try {
          L0: {
            L1: {
              var20 = (String[]) null;
              fe.a(param3, param2, param10, param18, param5, param7, param1, param4, param11, param16, param12, param0, (String[]) null, param6, param14, param13, -128, param17, param8, 1);
              if (param9 <= -55) {
                break L1;
              } else {
                field_Db = (String) null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var19 = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (var19);

            stackIn_5_1 = new StringBuilder().append("ur.SA(");

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


            stackIn_8_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(',').append(param1).append(',');

            if (param2 == null) {
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


            stackIn_11_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',').append(param3).append(',');

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


            stackIn_17_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',');

            if (param6 == null) {
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

            if (param7 == null) {
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


            stackIn_23_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_21_2).append(',');

            if (param8 == null) {
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


            stackIn_26_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_24_2).append(',').append(param9).append(',');

            if (param10 == null) {
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

            if (param11 == null) {
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

            if (param12 == null) {
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

            if (param13 == null) {
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

            if (param14 == null) {
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


            stackIn_41_1 = ((StringBuilder) (Object) stackIn_39_1).append(stackIn_39_2).append(',').append(param15).append(',');

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
          L15: {


            stackIn_44_1 = ((StringBuilder) (Object) stackIn_42_1).append(stackIn_42_2).append(',');

            if (param17 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_45_1 = (StringBuilder) ((Object) stackIn_44_1);
              stackIn_45_2 = "null";
              break L15;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_45_1 = (StringBuilder) ((Object) stackIn_44_1);
              stackIn_45_2 = "{...}";
              break L15;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_6_0), stackIn_45_2 + ',' + param18 + ')');
        }
    }

    ur(long param0, ur param1) {
        this(param0, param1.field_Fb, param1.field_Cb, param1.field_xb, param1.field_Ab);
    }

    final static fs a(dc param0, int param1, ob param2) {
        RuntimeException var3 = null;
        fs stackIn_2_0 = null;
        fs stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 > 53) {
              stackIn_4_0 = us.a(param2, param0.field_v, 2);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (fs) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var3);

            stackIn_7_1 = new StringBuilder().append("ur.J(");

            if (param0 == null) {
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
          L2: {


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_8_0), stackIn_11_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        qr var14;
        qr var15;
        qr var16;
        qr var17;
        qr var18;
        qr var19;
        qr stackIn_11_0 = null;
        qr stackIn_11_1 = null;
        qr stackIn_11_2 = null;
        qr stackIn_12_0 = null;
        qr stackIn_12_1 = null;
        qr stackIn_12_2 = null;
        int stackIn_12_3 = 0;
        qr stackIn_23_0 = null;
        qr stackIn_23_1 = null;
        qr stackIn_23_2 = null;
        qr stackIn_24_0 = null;
        qr stackIn_24_1 = null;
        qr stackIn_24_2 = null;
        int stackIn_24_3 = 0;
        qr stackIn_32_0 = null;
        qr stackIn_32_1 = null;
        qr stackIn_32_2 = null;
        qr stackIn_33_0 = null;
        qr stackIn_33_1 = null;
        qr stackIn_33_2 = null;
        int stackIn_33_3 = 0;
        L0: {
          if (this.field_K * 2 > this.field_mb) {
            var6 = this.field_mb / 2;
            var5 = this.field_mb / 2;
            break L0;
          } else {
            var5 = this.field_K;
            var6 = -this.field_K + this.field_mb;
            break L0;
          }
        }
        var7 = var6 - var5;
        var8 = var7;
        if (0 < param2) {
          L1: {
            var8 = param0 * var8 / param2;
            if (var8 >= this.field_K) {
              break L1;
            } else {
              var8 = this.field_K;
              break L1;
            }
          }
          if (var7 >= var8) {
            L2: {
              var9 = -param0 + param2;
              var10 = var7 - var8;
              var11 = 0;
              if (0 < var9) {
                var11 = (param3 * var10 - -(var9 / 2)) / var9;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              var12 = var11 - -(var8 / 2);
              var14 = this.field_Fb;
              var14.field_mb = var5;
              var14.field_hb = 0;
              var14.field_db = 0;
              var14.field_K = this.field_K;
              var15 = this.field_Cb;
              var15.field_db = var6;
              var15.field_mb = -var6 + this.field_mb;
              if (param1 == 20) {
                break L3;
              } else {
                this.i(-87);
                break L3;
              }
            }
            L4: {
              var15.field_hb = 0;
              var15.field_K = this.field_K;
              var16 = this.field_Gb;
              var16.field_hb = 0;
              var16.field_db = var5;
              var16.field_K = this.field_K;
              var16.field_mb = var7;
              var17 = this.field_xb;
              var17.field_mb = var12;
              var17.field_K = this.field_K;
              var17.field_hb = 0;
              var17.field_db = 0;
              var18 = this.field_Eb;
              var18.field_mb = var7 + -var12;
              var18.field_db = var12;
              var18.field_hb = 0;
              var18.field_K = this.field_K;
              var19 = this.field_Ab;
              stackIn_32_0 = this.field_Fb;

              stackIn_32_1 = this.field_Cb;

              stackIn_32_2 = this.field_Gb;

              if (param2 <= param0) {
                stackIn_33_0 = (qr) ((Object) stackIn_32_0);
                stackIn_33_1 = (qr) ((Object) stackIn_32_1);
                stackIn_33_2 = (qr) ((Object) stackIn_32_2);
                stackIn_33_3 = 0;
                break L4;
              } else {
                stackIn_33_0 = (qr) ((Object) stackIn_32_0);
                stackIn_33_1 = (qr) ((Object) stackIn_32_1);
                stackIn_33_2 = (qr) ((Object) stackIn_32_2);
                stackIn_33_3 = 1;
                break L4;
              }
            }
            stackIn_33_2.field_s = stackIn_33_3 != 0;
            stackIn_33_1.field_s = stackIn_33_3 != 0;
            stackIn_33_0.field_s = stackIn_33_3 != 0;
            var19.field_db = var11;
            var19.field_K = this.field_K;
            var19.field_hb = 0;
            var19.field_mb = var8;
            return;
          } else {
            L5: {
              var8 = var7;
              var9 = -param0 + param2;
              var10 = var7 - var8;
              var11 = 0;
              if (0 < var9) {
                var11 = (param3 * var10 - -(var9 / 2)) / var9;
                break L5;
              } else {
                break L5;
              }
            }
            L6: {
              var12 = var11 - -(var8 / 2);
              var14 = this.field_Fb;
              var14.field_mb = var5;
              var14.field_hb = 0;
              var14.field_db = 0;
              var14.field_K = this.field_K;
              var15 = this.field_Cb;
              var15.field_db = var6;
              var15.field_mb = -var6 + this.field_mb;
              if (param1 == 20) {
                break L6;
              } else {
                this.i(-87);
                break L6;
              }
            }
            L7: {
              var15.field_hb = 0;
              var15.field_K = this.field_K;
              var16 = this.field_Gb;
              var16.field_hb = 0;
              var16.field_db = var5;
              var16.field_K = this.field_K;
              var16.field_mb = var7;
              var17 = this.field_xb;
              var17.field_mb = var12;
              var17.field_K = this.field_K;
              var17.field_hb = 0;
              var17.field_db = 0;
              var18 = this.field_Eb;
              var18.field_mb = var7 + -var12;
              var18.field_db = var12;
              var18.field_hb = 0;
              var18.field_K = this.field_K;
              var19 = this.field_Ab;
              stackIn_23_0 = this.field_Fb;

              stackIn_23_1 = this.field_Cb;

              stackIn_23_2 = this.field_Gb;

              if (param2 <= param0) {
                stackIn_24_0 = (qr) ((Object) stackIn_23_0);
                stackIn_24_1 = (qr) ((Object) stackIn_23_1);
                stackIn_24_2 = (qr) ((Object) stackIn_23_2);
                stackIn_24_3 = 0;
                break L7;
              } else {
                stackIn_24_0 = (qr) ((Object) stackIn_23_0);
                stackIn_24_1 = (qr) ((Object) stackIn_23_1);
                stackIn_24_2 = (qr) ((Object) stackIn_23_2);
                stackIn_24_3 = 1;
                break L7;
              }
            }
            stackIn_24_2.field_s = stackIn_24_3 != 0;
            stackIn_24_1.field_s = stackIn_24_3 != 0;
            stackIn_24_0.field_s = stackIn_24_3 != 0;
            var19.field_db = var11;
            var19.field_K = this.field_K;
            var19.field_hb = 0;
            var19.field_mb = var8;
            return;
          }
        } else {
          L8: {
            var9 = -param0 + param2;
            var10 = var7 - var8;
            var11 = 0;
            if (0 < var9) {
              var11 = (param3 * var10 - -(var9 / 2)) / var9;
              break L8;
            } else {
              break L8;
            }
          }
          L9: {
            var12 = var11 - -(var8 / 2);
            var14 = this.field_Fb;
            var14.field_mb = var5;
            var14.field_hb = 0;
            var14.field_db = 0;
            var14.field_K = this.field_K;
            var15 = this.field_Cb;
            var15.field_db = var6;
            var15.field_mb = -var6 + this.field_mb;
            if (param1 == 20) {
              break L9;
            } else {
              this.i(-87);
              break L9;
            }
          }
          L10: {
            var15.field_hb = 0;
            var15.field_K = this.field_K;
            var16 = this.field_Gb;
            var16.field_hb = 0;
            var16.field_db = var5;
            var16.field_K = this.field_K;
            var16.field_mb = var7;
            var17 = this.field_xb;
            var17.field_mb = var12;
            var17.field_K = this.field_K;
            var17.field_hb = 0;
            var17.field_db = 0;
            var18 = this.field_Eb;
            var18.field_mb = var7 + -var12;
            var18.field_db = var12;
            var18.field_hb = 0;
            var18.field_K = this.field_K;
            var19 = this.field_Ab;
            stackIn_11_0 = this.field_Fb;

            stackIn_11_1 = this.field_Cb;

            stackIn_11_2 = this.field_Gb;

            if (param2 <= param0) {
              stackIn_12_0 = (qr) ((Object) stackIn_11_0);
              stackIn_12_1 = (qr) ((Object) stackIn_11_1);
              stackIn_12_2 = (qr) ((Object) stackIn_11_2);
              stackIn_12_3 = 0;
              break L10;
            } else {
              stackIn_12_0 = (qr) ((Object) stackIn_11_0);
              stackIn_12_1 = (qr) ((Object) stackIn_11_1);
              stackIn_12_2 = (qr) ((Object) stackIn_11_2);
              stackIn_12_3 = 1;
              break L10;
            }
          }
          stackIn_12_2.field_s = stackIn_12_3 != 0;
          stackIn_12_1.field_s = stackIn_12_3 != 0;
          stackIn_12_0.field_s = stackIn_12_3 != 0;
          var19.field_db = var11;
          var19.field_K = this.field_K;
          var19.field_hb = 0;
          var19.field_mb = var8;
          return;
        }
    }

    static {
        field_Bb = new String[]{"Shattered", "Freezing", "Scorching", "Lost", "Cold", "Sundered", "Burning", "Wandering", "Enduring", "Ancient", "Chaos", "Potent", "Reborn", "Unseen", "Golden", "Beckoning", "Silent", "Waning", "Dancing", "Quantum", "Glittering", "Blackened"};
        field_yb = "Project is <%0>/5 complete.";
        field_Db = "Achievements";
    }
}
