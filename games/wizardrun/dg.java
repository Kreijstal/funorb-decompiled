/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dg {
    static int field_c;
    static int field_f;
    static boolean field_b;
    static String field_a;
    static int field_d;
    static int field_e;

    public static void c(int param0) {
        if (param0 != 256) {
          byte[] var2 = (byte[]) null;
          dg.a((byte[]) null, -61);
          field_a = null;
          return;
        }
        field_a = null;
    }

    final static boolean b(int param0) {
        int var1 = 118 / ((param0 + 4) / 48);
        ri.field_b = true;
        sb.field_c = d.a((byte) 91) + 15000L;
        return ml.field_t == 11 ? true : false;
    }

    final static void a(int param0, int param1, byte param2) {
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var7Lifetime1;
        int var7Lifetime2;
        int var8Lifetime1;
        int var8Lifetime2;
        var9 = wizardrun.field_H;
        if (jd.field_f < 0) {
          return;
        }
        var3 = -135 + param0;
        var4 = param1 - 35;
        var5 = 256;
        if (jd.field_f < 75) {
          var5 = (jd.field_f << 8) / 75;
        }
        if (jd.field_f > 200) {
          var5 = (-jd.field_f + 250 << 8) / 50;
        }
        ud.a(s.field_a, false);
        cj.c();
        var6 = 14 % ((param2 + 9) / 50);
        ed.d();
        gf.k(-120);
        if (var5 < 256) {
          ed.d(0, 0, ed.field_h, ed.field_d, 0, 256 - var5);
          bb.b(4);
          if (jd.field_f < 150) {
            s.field_a.a(var3, var4);
          } else {
            af.field_a.c(var3 + 15, var4 + 10, var5);
          }
        } else {
          bb.b(4);
          if (jd.field_f < 150) {
            s.field_a.a(var3, var4);
            var7 = jd.field_f - 125;
            if (var7 <= 0) {
              var7 = jd.field_f - 140;
              if (0 < var7) {
                var8 = 256;
                if (var7 < 20) {
                  var8 = 256 * var7 / 20;
                }
                ee.field_q.c(var3 + 15, 10 + var4, var5 * var8 >> 8);
              }
            } else {
              if (50 <= var7) {
                var7 = jd.field_f - 140;
                if (0 < var7) {
                  var8 = 256;
                  if (var7 < 20) {
                    var8 = 256 * var7 / 20;
                  }
                  ee.field_q.c(var3 + 15, 10 + var4, var5 * var8 >> 8);
                }
              } else {
                if (var7 < 20) {
                  var8 = var7 * 256 / 20;
                  ag.field_t.a(var3, var4, var8);
                  var7 = jd.field_f - 140;
                  if (0 < var7) {
                    var8 = 256;
                    if (var7 < 20) {
                      var8 = 256 * var7 / 20;
                    }
                    ee.field_q.c(var3 + 15, 10 + var4, var5 * var8 >> 8);
                  }
                } else {
                  if (var7 < 30) {
                    ag.field_t.a(var3, var4, 256);
                    var7 = jd.field_f - 140;
                    if (0 < var7) {
                      var8 = 256;
                      if (var7 < 20) {
                        var8 = 256 * var7 / 20;
                      }
                      ee.field_q.c(var3 + 15, 10 + var4, var5 * var8 >> 8);
                    }
                  } else {
                    var8 = (50 - var7) * 256 / 20;
                    ag.field_t.a(var3, var4, var8);
                    var7 = jd.field_f - 140;
                    if (0 < var7) {
                      var8 = 256;
                      if (var7 < 20) {
                        var8 = 256 * var7 / 20;
                      }
                      ee.field_q.c(var3 + 15, 10 + var4, var5 * var8 >> 8);
                    }
                  }
                }
              }
            }
            return;
          }
          af.field_a.c(var3 + 15, var4 + 10, var5);
        }
        var7Lifetime1 = jd.field_f - 125;
        if (var7Lifetime1 > 0 &&
          50 > var7Lifetime1) {
          if (var7Lifetime1 < 20) {
            var8Lifetime1 = var7Lifetime1 * 256 / 20;
            ag.field_t.a(var3, var4, var8Lifetime1);
          } else {
            if (var7Lifetime1 < 30) {
              ag.field_t.a(var3, var4, 256);
            } else {
              var8Lifetime1 = (50 - var7Lifetime1) * 256 / 20;
              ag.field_t.a(var3, var4, var8Lifetime1);
            }
          }
        }
        var7Lifetime2 = jd.field_f - 140;
        if (0 < var7Lifetime2) {
          var8Lifetime2 = 256;
          if (var7Lifetime2 < 20) {
            var8Lifetime2 = 256 * var7Lifetime2 / 20;
          }
          ee.field_q.c(var3 + 15, 10 + var4, var5 * var8Lifetime2 >> 8);
        }
        return;
    }

    final static String a(int param0) {
        if (fi.field_y == pl.field_E) {
          return we.field_a;
        }
        if (param0 != -21) {
          dg.c(-90);
          if (!we.field_c.a(true)) {
            return we.field_c.b((byte) 8);
          }
          if (pl.field_E != wc.field_j) {
            return rg.field_S;
          }
          return we.field_c.b((byte) 8);
        }
        if (!we.field_c.a(true)) {
          return we.field_c.b((byte) 8);
        }
        if (pl.field_E != wc.field_j) {
          return rg.field_S;
        }
        return we.field_c.b((byte) 8);
    }

    final static byte[] a(byte[] param0, int param1) {
        byte[] stackIn_2_0 = null;
        byte[] stackIn_10_0 = null;
        byte[] stackIn_24_0 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        Throwable decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        byte[] var5_ref_byte__ = null;
        byte[] var6 = null;
        Object var7 = null;
        va var9 = null;
        byte[] var10 = null;
        byte[] var11 = null;
        byte[] var12 = null;
        byte[] var13 = null;
        try {
          var9 = new va(param0);
          if (param1 != 31027) {
            stackIn_2_0 = (byte[]) null;
            return stackIn_2_0;
          }
          var3 = var9.f(255);
          var4 = var9.i(param1 - 30772);
          if (var4 >= 0 && (tc.field_k == 0 ||
            !(tc.field_k < var4))) {
            if (0 == var3) {
              var12 = new byte[var4];
              var10 = var12;
              var5_ref_byte__ = var10;
              var9.a(true, var4, var12, 0);
              stackIn_10_0 = var5_ref_byte__;
              return stackIn_10_0;
            }
            var5 = var9.i(param1 ^ 31180);
            if (var5 >= 0 && (tc.field_k == 0 ||
              !(tc.field_k < var5))) {
              var13 = new byte[var5];
              var11 = var13;
              var6 = var11;
              if (1 == var3) {
                li.a(var13, var5, param0, var4, 9);
              } else {
                var7 = re.field_I;
                synchronized (var7) {
                  re.field_I.a(var13, var9, param1 - 24115);
                }
              }
              stackIn_24_0 = var6;
              return stackIn_24_0;
            }
            throw new RuntimeException();
          }
          throw new RuntimeException();
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_27_0 = var2;
          stackIn_27_1 = new StringBuilder().append("dg.E(");
          if (param0 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_e = 0;
        field_b = true;
    }
}
