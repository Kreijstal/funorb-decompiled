/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class gd {
    static String field_o;
    static long[] field_k;
    ro field_l;
    static String field_a;
    ro field_h;
    ro field_f;
    ro field_g;
    long field_e;
    int field_c;
    fs field_n;
    fs field_b;
    volatile int field_d;
    volatile int field_j;
    byte field_m;
    fv field_i;

    final static ta a(ki param0, byte param1, String param2, String param3) {
        byte[] var4 = null;
        RuntimeException var4_ref = null;
        byte[] var5 = null;
        Object stackIn_2_0 = null;
        ta stackIn_5_0 = null;
        ta stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var5 = param0.a(param2, param3, -1);
            var4 = var5;
            if (var5 != null) {
              if (param1 < -1) {
                stackIn_7_0 = new ta(var5);
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackIn_5_0 = (ta) null;
                decompiledRegionSelector0 = 1;
                break L0;
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
            var4_ref = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var4_ref);

            stackIn_10_1 = new StringBuilder().append("gd.I(");

            if (param0 == null) {
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


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',').append(param1).append(',');

            if (param2 == null) {
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
          L3: {


            stackIn_16_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',');

            if (param3 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L3;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L3;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_11_0), stackIn_17_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (ta) ((Object) stackIn_2_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0;
          } else {
            return stackIn_7_0;
          }
        }
    }

    final fv a(int param0, boolean param1, int param2, byte param3, byte param4) {
        long var6 = (long)param2 + ((long)param0 << -440939808);
        fv var8 = new fv();
        var8.field_t = param1 ? true : false;
        var8.field_l = var6;
        var8.field_z = param4;
        int var9 = -16 % ((0 - param3) / 43);
        if (param1) {
            if (!((this.d(-2115911413) ^ -1) > -21)) {
                throw new RuntimeException();
            }
            this.field_l.a((pj) (var8), (byte) -118);
        } else {
            if (!(-21 < (this.a((byte) -120) ^ -1))) {
                throw new RuntimeException();
            }
            this.field_f.a((pj) (var8), (byte) -107);
        }
        return var8;
    }

    abstract void b(int param0);

    final static void a(int param0, int param1, jn param2, int param3, int param4, int param5) {
        float[] dupTemp$0 = null;
        int stackIn_6_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        float[] var8 = null;
        int var9 = 0;
        float[] var10 = null;
        float[] var11 = null;
        float[] var12 = null;
        float[] var13 = null;
        var9 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            if (param3 >= 59) {
              L1: {
                if ((ul.field_f ^ -1) != -2) {
                  stackIn_6_0 = 0;
                  break L1;
                } else {
                  stackIn_6_0 = 1;
                  break L1;
                }
              }
              var6_int = stackIn_6_0;
              var7 = 0;
              L2: while (true) {
                L3: {
                  if (var6_int == 0) {
                    stackIn_10_0 = 50;
                    break L3;
                  } else {
                    stackIn_10_0 = 25;
                    break L3;
                  }
                }
                if (stackIn_10_0 <= var7) {
                  var7 = 0;
                  L4: while (true) {
                    L5: {
                      if (var6_int == 0) {
                        stackIn_16_0 = 30;
                        break L5;
                      } else {
                        stackIn_16_0 = 25;
                        break L5;
                      }
                    }
                    if (stackIn_16_0 <= var7) {
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      var8 = new float[]{0.0f, (float)(-(1 + fi.a(param0, he.field_o, (byte) -96)))};
                      dupTemp$0 = kt.a((byte) -20, var8, (float)(0.017453292519943295 * (double)(2048.0f / (float)var7) + 0.0));
                      var11 = dupTemp$0;
                      var8 = dupTemp$0;
                      param2.a((ms) (new as(64, param4 - -((int)var11[0] << 1948240683), ((int)var11[1] << -2115911413) + param1, param5, -(int)var11[0] << 1300827400, -(int)var11[1] << 640547752, 1)), (byte) 39);
                      var7++;
                      continue L4;
                    }
                  }
                } else {
                  var8 = new float[]{0.0f, (float)(-(fi.a(param0, he.field_o, (byte) -96) + 1))};
                  var13 = kt.a((byte) -81, var8, (float)(0.017453292519943295 * (double)(2048.0f / (float)var7) + 0.0));
                  var12 = var13;
                  var10 = var12;
                  var8 = var10;
                  param2.a((ms) (new as(64, ((int)var13[0] << 1226501579) + param4, ((int)var13[1] << -1723807701) + param1, param5, -(int)var13[0] << -1759113560, -(int)var13[1] << -11870168, 0)), (byte) 39);
                  var7++;
                  continue L2;
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var6 = decompiledCaughtException;
            stackIn_21_0 = (RuntimeException) (var6);

            stackIn_21_1 = new StringBuilder().append("gd.M(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L6;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L6;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final boolean a(int param0) {
        int var2 = 111 / ((param0 - 76) / 32);
        return this.d(-2115911413) >= 20 ? true : false;
    }

    abstract void a(boolean param0, byte param1, Object param2);

    final static boolean b(byte param0) {
        rd var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        rd var4 = null;
        int stackIn_5_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_20_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 > 118) {
                break L1;
              } else {
                field_k = (long[]) null;
                break L1;
              }
            }
            var4 = (rd) ((Object) qr.field_c.b(100));
            var1 = var4;
            if (var1 != null) {
              var2 = 0;
              L2: while (true) {
                if (var1.field_p <= var2) {
                  stackIn_20_0 = 1;
                  decompiledRegionSelector0 = 3;
                  break L0;
                } else {
                  L3: {
                    if (null != var4.field_o[var2]) {
                      if (var4.field_o[var2].field_c == 0) {
                        stackIn_13_0 = 0;
                        decompiledRegionSelector0 = 1;
                        break L0;
                      } else {
                        break L3;
                      }
                    } else {
                      break L3;
                    }
                  }
                  L4: {
                    if (var4.field_s[var2] == null) {
                      break L4;
                    } else {
                      if (var4.field_s[var2].field_c != 0) {
                        break L4;
                      } else {
                        stackIn_17_0 = 0;
                        decompiledRegionSelector0 = 2;
                        break L0;
                      }
                    }
                  }
                  var2++;
                  continue L2;
                }
              }
            } else {
              stackIn_5_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw qo.a((Throwable) ((Object) var1_ref), "gd.K(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_13_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_17_0 != 0;
            } else {
              return stackIn_20_0 != 0;
            }
          }
        }
    }

    final int d(int param0) {
        if (param0 != -2115911413) {
          this.b(true);
          return this.field_l.a((byte) 2) + this.field_h.a((byte) 2);
        } else {
          return this.field_l.a((byte) 2) + this.field_h.a((byte) 2);
        }
    }

    final static lh a(byte param0, int param1) {
        lh var2;
        if (param0 != -82) {
          field_k = (long[]) null;
          var2 = new lh();
          no.field_d.a((ms) (var2), (byte) 39);
          jg.b(param0 + 11126, param1);
          return var2;
        } else {
          var2 = new lh();
          no.field_d.a((ms) (var2), (byte) 39);
          jg.b(param0 + 11126, param1);
          return var2;
        }
    }

    final boolean b(boolean param0) {
        String var3;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        if (!param0) {
          L0: {
            var3 = (String) null;
            gd.a((ki) null, (byte) -79, (String) null, (String) null);
            if ((this.a((byte) -100) ^ -1) > -21) {
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
            if ((this.a((byte) -100) ^ -1) > -21) {
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

    final int a(byte param0) {
        if (param0 >= -82) {
          this.field_n = (fs) null;
          return this.field_f.a((byte) 2) + this.field_g.a((byte) 2);
        } else {
          return this.field_f.a((byte) 2) + this.field_g.a((byte) 2);
        }
    }

    public static void a(boolean param0) {
        field_o = null;
        if (param0) {
            gd.a((byte) -88, 27);
            field_a = null;
            field_k = null;
            return;
        }
        field_a = null;
        field_k = null;
    }

    abstract void c(int param0);

    abstract boolean c(byte param0);

    gd() {
        this.field_l = new ro();
        this.field_h = new ro();
        this.field_f = new ro();
        this.field_g = new ro();
        this.field_n = new fs(6);
        this.field_d = 0;
        this.field_j = 0;
        this.field_m = (byte) 0;
        this.field_b = new fs(10);
    }

    static {
        field_k = new long[32];
        field_o = "ACHIEVEMENTS";
    }
}
