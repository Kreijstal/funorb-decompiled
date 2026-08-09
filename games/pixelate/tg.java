/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class tg {
    private boolean field_k;
    int field_p;
    int field_g;
    int field_o;
    eb field_t;
    eb field_s;
    int field_d;
    static String field_b;
    int field_q;
    static dj field_j;
    eb field_r;
    eb field_i;
    jl field_m;
    private int field_c;
    int field_e;
    eb field_a;
    static Random field_f;
    static String field_l;
    static String field_h;
    int field_n;

    public static void a(boolean param0) {
        field_f = null;
        if (!param0) {
            return;
        }
        field_j = null;
        field_l = null;
        field_b = null;
        field_h = null;
    }

    final void a(int param0, int param1, int param2, int param3, int param4, boolean param5) {
        String var8;
        if (param5) {
          var8 = (String) null;
          this.a((String) null, 6, 30, -19);
          t.b(param3, param0, param2, param1, param4);
          return;
        } else {
          t.b(param3, param0, param2, param1, param4);
          return;
        }
    }

    static long a(long param0, long param1) {
        return param0 | param1;
    }

    final void a(String param0, int param1, boolean param2, int param3) {
        RuntimeException var5 = null;
        String var6 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (!param2) {
              break L0;
            } else {
              var6 = (String) null;
              this.a((String) null, -42, -69, (byte) -38);
              break L0;
            }
          }
          if (this.field_k) {
            this.a(param0, param3, param1, (byte) 127);
            return;
          } else {
            this.a(param0, param1, param3, 109);
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var5);

            stackIn_8_1 = new StringBuilder().append("tg.J(");

            if (param0 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L1;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L1;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static boolean a(String param0, long param1, int param2, int param3, int[] param4) {
        te var6 = null;
        RuntimeException var6_ref = null;
        CharSequence var7 = null;
        int stackIn_2_0 = 0;
        int stackIn_7_0 = 0;
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
            if (cf.a(param1, param4, param0, param2, 500)) {
              L1: {
                if (param3 == (param2 ^ -1)) {
                  param2 = 0;
                  break L1;
                } else {
                  break L1;
                }
              }
              ce.field_d = param2;
              jo.field_k = param0;
              var7 = (CharSequence) ((Object) param0);
              fp.field_d = dh.a(var7, (byte) 26);
              fp.field_e = param1;
              var6 = ad.a(49, vl.field_L, param4, ue.field_t, ve.field_Ib);
              mh.a(var6, (byte) 127);
              stackIn_7_0 = 1;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6_ref = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var6_ref);

            stackIn_10_1 = new StringBuilder().append("tg.E(");

            if (param0 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L3;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L3;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_11_0), stackIn_14_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_7_0 != 0;
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        t.a(param2, param6, param4, param3, param1, param0);
        int var8 = -61 / ((-21 - param5) / 44);
    }

    private final void a(String param0, int param1, int param2, int param3) {
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        try {
          L0: {
            L1: {
              var5_int = this.field_m.c(param0);
              var6 = this.field_m.field_z + this.field_m.field_D;
              var7 = param2;
              if (param3 >= 27) {
                break L1;
              } else {
                this.field_e = 119;
                break L1;
              }
            }
            L2: {
              if (var5_int + var7 + 6 > t.field_j) {
                var7 = -var5_int + (t.field_j + -6);
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              var8 = -this.field_m.field_D + (param1 + 32);
              if (6 + (var6 + var8) <= t.field_d) {
                break L3;
              } else {
                var8 = -6 + (-var6 + t.field_d);
                break L3;
              }
            }
            t.a(var7, var8, 6 + var5_int, 6 + var6, this.field_c);
            t.d(1 + var7, 1 + var8, var5_int - -4, 4 + var6, this.field_e);
            this.field_m.a(param0, 3 + var7, this.field_m.field_D + (var8 + 3), this.field_c, -1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var5);

            stackIn_11_1 = new StringBuilder().append("tg.G(");

            if (param0 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L4;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L4;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final void a(String param0, int param1, int param2, byte param3) {
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
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
        var15 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            L1: {
              var5_int = this.field_p + this.field_n;
              var6 = this.field_g + this.field_o;
              var7 = this.field_q;
              if ((var7 ^ -1) == 0) {
                var7 = this.field_m.field_w - -this.field_m.field_z;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              L3: {
                var8 = t.field_j >> 521009762;
                var9 = this.field_m.c(param0);
                var10 = this.field_m.field_w + this.field_m.field_z;
                var11 = 1;
                if (var8 < var9) {
                  break L3;
                } else {
                  if (param0.indexOf("<br>") == -1) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              L4: {
                if (var9 > var8) {
                  var13 = var9 / var8;
                  var12 = var8 + (-1 + var13 + var9 % var8) / var13 * 2;
                  break L4;
                } else {
                  var12 = var8;
                  break L4;
                }
              }
              L5: {
                if (rf.field_j != null) {
                  break L5;
                } else {
                  rf.field_j = new String[16];
                  break L5;
                }
              }
              var11 = this.field_m.a(param0, new int[]{var12}, rf.field_j);
              var9 = 0;
              var10 = var10 + var7 * (var11 - 1);
              var13 = 0;
              L6: while (true) {
                if (var11 <= var13) {
                  break L2;
                } else {
                  L7: {
                    var14 = this.field_m.c(rf.field_j[var13]);
                    if (var9 >= var14) {
                      break L7;
                    } else {
                      var9 = var14;
                      break L7;
                    }
                  }
                  var13++;
                  continue L6;
                }
              }
            }
            L8: {
              var12 = param1;
              if (var5_int + (var9 + var12) > t.field_j) {
                var12 = -var5_int + t.field_j - var9;
                break L8;
              } else {
                break L8;
              }
            }
            L9: {
              var13 = 32 + param2 + -this.field_m.field_D;
              if (var6 + var10 + var13 > t.field_d) {
                var13 = param2 - var10 - var6;
                break L9;
              } else {
                break L9;
              }
            }
            if (param3 > 123) {
              t.a(var12, var13, var9 + var5_int, var10 - -var6, this.field_d);
              t.d(var12 + 1, 1 + var13, var9 - (-var5_int + 2), -2 + (var10 - -var6), this.field_e);
              this.field_m.a(param0, var12 - -this.field_n, var13 + this.field_o, var9, var10, this.field_c, -1, 0, 0, var7);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var5 = decompiledCaughtException;
            stackIn_32_0 = (RuntimeException) (var5);

            stackIn_32_1 = new StringBuilder().append("tg.C(");

            if (param0 == null) {
              stackIn_33_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "null";
              break L10;
            } else {
              stackIn_33_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "{...}";
              break L10;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_33_0), stackIn_33_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void a(int param0, jl param1) {
        uc var17 = null;
        w var4 = null;
        tf[] var5 = null;
        sa var16 = null;
        sa var18 = null;
        int var7_int = 0;
        w var6 = null;
        w var7 = null;
        f discarded$0 = null;
        hg discarded$1 = null;
        w var8 = null;
        tf[] var9 = null;
        tf[] var10 = null;
        tf dupTemp$2 = null;
        w var11 = null;
        w var12 = null;
        tf var13 = null;
        w var14 = null;
        w var19 = null;
        int var15 = Pixelate.field_H ? 1 : 0;
        try {
            var17 = new uc(param1, 2, 2, 2236962, 1, 1, 1, param1.field_z + (param1.field_w + 2));
            var17.field_g = 16777215;
            this.field_a = (eb) ((Object) var17);
            var4 = new w();
            var17.a(var4, (byte) 126);
            this.field_e = 5592405;
            this.field_p = 3;
            this.field_o = 3;
            var4.field_e = 15658734;
            var4.field_o = 11711154;
            this.field_d = 15658734;
            this.field_c = 15658734;
            this.field_q = -1;
            this.field_n = 3;
            this.field_m = param1;
            this.field_g = 3;
            var4.a(0, 7177).a(15658734, 15115).a(qa.a(8947848, 7829367, 10066329, 3), (byte) -65);
            var4.a(1, 7177).a(qa.a(11184810, 13421772, 10066329, param0 ^ 7), (byte) -65);
            var4.a(3, 7177).a(qa.a(8947848, 10066329, 7829367, 3), (byte) -65).a((byte) 124, 1).a(1, false);
            var5 = new tf[9];
            var16 = new sa(32, 32);
            var18 = var16;
            for (var7_int = 0; var18.field_G.length > var7_int; var7_int++) {
                var16.field_G[var7_int] = 1077952576;
            }
            var5[4] = (tf) ((Object) var18);
            var4.a(4, 7177).a(true, true).a(var5, (byte) -65);
            var4.a(5, 7177).a(og.a(0, true, 65793, 0, 0), (byte) -65).a(true, true).a(-1, 15115);
            this.field_r = (eb) ((Object) var4);
            var6 = new w(var4, true);
            var6.field_l = 0;
            var7 = new w(var4, true);
            var7.field_l = 0;
            var7.a(0, pg.a(8947848, (byte) -128));
            var7.a(1, 7177).a(pg.a(11184810, (byte) -93), (byte) -65).a(2236962, 15115);
            this.field_t = (eb) ((Object) new jo(param1, 2, 2, 16777215, -1, 5, 5, 15, 15, 4473924));
            discarded$0 = new f(param1, 2, 2, 16777215, -1, 16777215, 16729156, 4473924);
            discarded$1 = new hg(param1, 16777215, -1, 125269879, 4473924, 3, 268435455);
            var8 = new w();
            var17.a(var8, (byte) 126);
            var8.a(0, 7177).a(qa.a(15658734, 10066329, 7829367, 3), (byte) -65).a(1118481, 15115).a(-1, (byte) -68);
            var8.a(4, 7177).a(true, true).a(var5, (byte) -65);
            this.field_i = (eb) ((Object) var8);
            var9 = new tf[9];
            var10 = new tf[9];
            var9[4] = new tf(2, 1);
            var10[4] = new tf(1, 2);
            dupTemp$2 = var9[4];
            dupTemp$2.field_G = new int[]{6710886, 7829367};
            var10[param0].field_G = new int[]{6710886, 7829367};
            var11 = new w();
            var12 = new w();
            var11.a(122, 0, var9);
            var12.a(92, 0, var10);
            var13 = new tf(7, 4);
            var13.field_G = new int[]{8947848, 8947848, 8947848, 13421772, 8947848, 8947848, 8947848, 8947848, 8947848, 13421772, 13421772, 13421772, 8947848, 8947848, 8947848, 13421772, 13421772, 13421772, 13421772, 13421772, 8947848, 13421772, 13421772, 13421772, 13421772, 13421772, 13421772, 13421772};
            var14 = new w(var4, true);
            var14.a(param0 + 107, var13.a());
            var13.b();
            var14 = new w(var4, true);
            var14.a(79, var13.a());
            var13.b();
            var14 = new w(var4, true);
            var14.a(-8, var13.a());
            var13.b();
            var19 = new w(var4, true);
            var19.a(param0 ^ -20, var13);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "tg.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static byte[] a(boolean param0, boolean param1, Object param2) {
        byte[] var3 = null;
        RuntimeException var3_ref = null;
        gf var4 = null;
        Object stackIn_4_0 = null;
        byte[] stackIn_9_0 = null;
        byte[] stackIn_11_0 = null;
        byte[] stackIn_15_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (!param0) {
                break L1;
              } else {
                field_h = (String) null;
                break L1;
              }
            }
            if (param2 != null) {
              if (param2 instanceof byte[]) {
                var3 = (byte[]) (param2);
                if (!param1) {
                  stackIn_11_0 = (byte[]) (var3);
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  stackIn_9_0 = re.a(true, var3);
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              } else {
                if (param2 instanceof gf) {
                  var4 = (gf) (param2);
                  stackIn_15_0 = var4.b(32);
                  decompiledRegionSelector0 = 3;
                  break L0;
                } else {
                  throw new IllegalArgumentException();
                }
              }
            } else {
              stackIn_4_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackIn_19_0 = (RuntimeException) (var3_ref);

            stackIn_19_1 = new StringBuilder().append("tg.H(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L2;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L2;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (byte[]) ((Object) stackIn_4_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_9_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_11_0;
            } else {
              return stackIn_15_0;
            }
          }
        }
    }

    public tg() {
        this.field_k = true;
    }

    static {
        field_b = "Total Time: ";
        field_j = new dj();
        field_l = "<%0> must play <%1> more rated games before playing with the current options.";
        field_h = null;
    }
}
