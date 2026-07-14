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
        byte[] var5 = null;
        var5 = param0.a(param2, param3, -1);
        var4 = var5;
        if (var5 != null) {
          if (param1 >= -1) {
            return null;
          } else {
            return new ta(var5);
          }
        } else {
          return null;
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
            if (!(((gd) this).d(-2115911413) > -21)) {
                throw new RuntimeException();
            }
            ((gd) this).field_l.a((pj) (Object) var8, (byte) -118);
        } else {
            if (!(-21 > ((gd) this).a((byte) -120))) {
                throw new RuntimeException();
            }
            ((gd) this).field_f.a((pj) (Object) var8, (byte) -107);
        }
        return var8;
    }

    abstract void b(int param0);

    final static void a(int param0, int param1, jn param2, int param3, int param4, int param5) {
        int var6 = 0;
        int var7 = 0;
        float[] var8 = null;
        int var9 = 0;
        float[] var10 = null;
        float[] var11 = null;
        float[] var12 = null;
        float[] var13 = null;
        float[] var14 = null;
        float[] var15 = null;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_14_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        var9 = Sumoblitz.field_L ? 1 : 0;
        if (param3 < 59) {
          return;
        } else {
          L0: {
            if ((ul.field_f ^ -1) != -2) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L0;
            }
          }
          var6 = stackIn_4_0;
          var7 = 0;
          L1: while (true) {
            L2: {
              if (var6 == 0) {
                stackOut_7_0 = 50;
                stackIn_8_0 = stackOut_7_0;
                break L2;
              } else {
                stackOut_6_0 = 25;
                stackIn_8_0 = stackOut_6_0;
                break L2;
              }
            }
            if (stackIn_8_0 <= var7) {
              var7 = 0;
              L3: while (true) {
                L4: {
                  if (var6 == 0) {
                    stackOut_13_0 = 30;
                    stackIn_14_0 = stackOut_13_0;
                    break L4;
                  } else {
                    stackOut_12_0 = 25;
                    stackIn_14_0 = stackOut_12_0;
                    break L4;
                  }
                }
                if (stackIn_14_0 <= var7) {
                  return;
                } else {
                  var8 = new float[]{0.0f, (float)(-(1 + fi.a(param0, he.field_o, (byte) -96)))};
                  var11 = kt.a((byte) -20, var8, (float)(0.017453292519943295 * (double)(2048.0f / (float)var7) + 0.0));
                  var8 = kt.a((byte) -20, var8, (float)(0.017453292519943295 * (double)(2048.0f / (float)var7) + 0.0));
                  param2.a((ms) (Object) new as(64, param4 - -((int)var11[0] << 1948240683), ((int)var11[1] << -2115911413) + param1, param5, -(int)var11[0] << 1300827400, -(int)var11[1] << 640547752, 1), (byte) 39);
                  var7++;
                  continue L3;
                }
              }
            } else {
              var8 = new float[]{0.0f, (float)(-(fi.a(param0, he.field_o, (byte) -96) + 1))};
              var15 = kt.a((byte) -81, var8, (float)(0.017453292519943295 * (double)(2048.0f / (float)var7) + 0.0));
              var14 = var15;
              var13 = var14;
              var12 = var13;
              var10 = var12;
              var8 = var10;
              param2.a((ms) (Object) new as(64, ((int)var15[0] << 1226501579) + param4, ((int)var15[1] << -1723807701) + param1, param5, -(int)var15[0] << -1759113560, -(int)var15[1] << -11870168, 0), (byte) 39);
              var7++;
              continue L1;
            }
          }
        }
    }

    final boolean a(int param0) {
        int var2 = 111 / ((param0 - 76) / 32);
        return ((gd) this).d(-2115911413) >= 20 ? true : false;
    }

    abstract void a(boolean param0, byte param1, Object param2);

    final static boolean b(byte param0) {
        int var2 = 0;
        int var3 = 0;
        rd var5 = null;
        rd var6 = null;
        rd var7 = null;
        rd var8 = null;
        var3 = Sumoblitz.field_L ? 1 : 0;
        if (param0 > 118) {
          var8 = (rd) (Object) qr.field_c.b(100);
          var7 = var8;
          if (var7 != null) {
            var2 = 0;
            L0: while (true) {
              if (var7.field_p > var2) {
                L1: {
                  if (null != var8.field_o[var2]) {
                    if (var8.field_o[var2].field_c == 0) {
                      return false;
                    } else {
                      break L1;
                    }
                  } else {
                    break L1;
                  }
                }
                if (var8.field_s[var2] == null) {
                  var2++;
                  var2++;
                  continue L0;
                } else {
                  if (var8.field_s[var2].field_c == 0) {
                    return false;
                  } else {
                    var2++;
                    continue L0;
                  }
                }
              } else {
                return true;
              }
            }
          } else {
            return false;
          }
        } else {
          field_k = null;
          var6 = (rd) (Object) qr.field_c.b(100);
          var5 = var6;
          if (var5 != null) {
            var2 = 0;
            L2: while (true) {
              if (var5.field_p > var2) {
                L3: {
                  if (null != var6.field_o[var2]) {
                    if (var6.field_o[var2].field_c == 0) {
                      return false;
                    } else {
                      break L3;
                    }
                  } else {
                    break L3;
                  }
                }
                if (var6.field_s[var2] == null) {
                  var2++;
                  var2++;
                  continue L2;
                } else {
                  if (var6.field_s[var2].field_c == 0) {
                    return false;
                  } else {
                    var2++;
                    continue L2;
                  }
                }
              } else {
                return true;
              }
            }
          } else {
            return false;
          }
        }
    }

    final int d(int param0) {
        if (param0 != -2115911413) {
          boolean discarded$2 = ((gd) this).b(true);
          return ((gd) this).field_l.a((byte) 2) + ((gd) this).field_h.a((byte) 2);
        } else {
          return ((gd) this).field_l.a((byte) 2) + ((gd) this).field_h.a((byte) 2);
        }
    }

    final static lh a(byte param0, int param1) {
        lh var2 = null;
        if (param0 != -82) {
          field_k = null;
          var2 = new lh();
          no.field_d.a((ms) (Object) var2, (byte) 39);
          jg.b(param0 + 11126, param1);
          return var2;
        } else {
          var2 = new lh();
          no.field_d.a((ms) (Object) var2, (byte) 39);
          jg.b(param0 + 11126, param1);
          return var2;
        }
    }

    final boolean b(boolean param0) {
        Object var3 = null;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (!param0) {
          L0: {
            var3 = null;
            ta discarded$6 = gd.a((ki) null, (byte) -79, (String) null, (String) null);
            if ((((gd) this).a((byte) -100) ^ -1) > -21) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if ((((gd) this).a((byte) -100) ^ -1) > -21) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    final int a(byte param0) {
        if (param0 >= -82) {
          ((gd) this).field_n = null;
          return ((gd) this).field_f.a((byte) 2) + ((gd) this).field_g.a((byte) 2);
        } else {
          return ((gd) this).field_f.a((byte) 2) + ((gd) this).field_g.a((byte) 2);
        }
    }

    public static void a(boolean param0) {
        field_o = null;
        if (param0) {
            lh discarded$0 = gd.a((byte) -88, 27);
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
        ((gd) this).field_l = new ro();
        ((gd) this).field_h = new ro();
        ((gd) this).field_f = new ro();
        ((gd) this).field_g = new ro();
        ((gd) this).field_n = new fs(6);
        ((gd) this).field_d = 0;
        ((gd) this).field_j = 0;
        ((gd) this).field_m = (byte) 0;
        ((gd) this).field_b = new fs(10);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = new long[32];
        field_o = "ACHIEVEMENTS";
    }
}
