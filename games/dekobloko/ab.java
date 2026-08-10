/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ab {
    static String field_a;
    static int field_e;
    static java.util.zip.CRC32 field_c;
    private be field_b;
    static int field_f;
    private be field_g;
    static String field_d;

    final static int e(int param0) {
        int var1 = 0;
        if (!(lg.field_W <= var1)) {
            var1 = lg.field_W;
        }
        if (var1 < bf.field_r) {
            var1 = bf.field_r;
        }
        if (param0 != -28199) {
            field_e = -18;
        }
        if (!(tg.field_e <= var1)) {
            var1 = tg.field_e;
        }
        return var1;
    }

    final be b(byte param0) {
        be var2 = this.field_g;
        if (!(var2 != this.field_b)) {
            this.field_g = null;
            return null;
        }
        if (param0 != 20) {
            return (be) null;
        }
        this.field_g = var2.field_p;
        return var2;
    }

    final void a(be param0, int param1) {
        be var4 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          L0: {
            L1: {
              if (param0.field_v != null) {
                param0.e((byte) 101);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              param0.field_p = this.field_b;
              param0.field_v = this.field_b.field_v;
              param0.field_v.field_p = param0;
              param0.field_p.field_v = param0;
              if (param1 == -7267) {
                break L2;
              } else {
                var4 = (be) null;
                this.a((be) null, 54);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var3);

            stackIn_8_1 = new StringBuilder().append("ab.F(");

            if (param0 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L3;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L3;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ')');
        }
    }

    final be a(byte param0) {
        be var2 = this.field_b.field_p;
        if (this.field_b == var2) {
            return null;
        }
        var2.e((byte) 94);
        int var3 = 27 / ((1 - param0) / 39);
        return var2;
    }

    final be b(int param0) {
        if (param0 != -2198) {
            this.b(61);
        }
        be var2 = this.field_b.field_p;
        if (this.field_b == var2) {
            this.field_g = null;
            return null;
        }
        this.field_g = var2.field_p;
        return var2;
    }

    final static long a(int param0, CharSequence param1) {
        long stackIn_23_0 = 0L;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        long var2_long = 0L;
        RuntimeException var2 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var7 = client.field_A ? 1 : 0;
        try {
          L0: {
            var2_long = 0L;
            var4 = param1.length();
            var5 = 0;
            L1: while (true) {
              L2: {
                if (var5 >= var4) {
                  break L2;
                } else {
                  L3: {
                    L4: {
                      var2_long = var2_long * 37L;
                      var6 = param1.charAt(var5);
                      if ((var6 ^ -1) > -66) {
                        break L4;
                      } else {
                        if (var6 > 90) {
                          break L4;
                        } else {
                          var2_long = var2_long + (long)(-65 + var6 + 1);
                          break L3;
                        }
                      }
                    }
                    L5: {
                      if (97 > var6) {
                        break L5;
                      } else {
                        if (var6 > 122) {
                          break L5;
                        } else {
                          var2_long = var2_long + (long)(-97 + (var6 + 1));
                          break L3;
                        }
                      }
                    }
                    if (var6 < 48) {
                      break L3;
                    } else {
                      if (57 < var6) {
                        break L3;
                      } else {
                        var2_long = var2_long + (long)(var6 + 27 - 48);
                        break L3;
                      }
                    }
                  }
                  if (var2_long >= 177917621779460413L) {
                    break L2;
                  } else {
                    var5++;
                    continue L1;
                  }
                }
              }
              L6: {
                if (param0 > 95) {
                  break L6;
                } else {
                  field_f = -6;
                  break L6;
                }
              }
              L7: while (true) {
                L8: {
                  if (0L != var2_long % 37L) {
                    break L8;
                  } else {
                    if (var2_long == 0L) {
                      break L8;
                    } else {
                      var2_long = var2_long / 37L;
                      continue L7;
                    }
                  }
                }
                stackIn_23_0 = var2_long;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var2 = decompiledCaughtException;
            stackIn_26_0 = (RuntimeException) (var2);

            stackIn_26_1 = new StringBuilder().append("ab.E(").append(param0).append(',');

            if (param1 == null) {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "null";
              break L9;
            } else {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "{...}";
              break L9;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_27_0), stackIn_27_2 + ')');
        }
        return stackIn_23_0;
    }

    final static boolean c(byte param0) {
        int var1 = 0;
        Object var2 = null;
        Object var2_ref = null;
        Throwable var3 = null;
        int stackIn_3_0 = 0;
        int stackIn_5_0 = 0;
        Throwable decompiledCaughtException = null;
        var1 = 108 % ((-69 - param0) / 50);
        var2_ref = f.field_r;
        synchronized (var2_ref) {
          L0: {
            if (ea.field_n != sf.field_B) {
              wh.field_c = pf.field_i[sf.field_B];
              el.field_G = bl.field_Z[sf.field_B];
              sf.field_B = 1 + sf.field_B & 127;
              stackIn_5_0 = 1;
              break L0;
            } else {
              stackIn_3_0 = 0;
              return stackIn_3_0 != 0;
            }
          }
        }
        return stackIn_5_0 != 0;
    }

    public static void d(int param0) {
        field_c = null;
        field_a = null;
        if (param0 != 1) {
            ab.e(-99);
        }
        field_d = null;
    }

    final int a(int param0) {
        int var4 = client.field_A ? 1 : 0;
        int var2 = param0;
        be var3 = this.field_b.field_p;
        while (var3 != this.field_b) {
            var2++;
            var3 = var3.field_p;
        }
        return var2;
    }

    final static boolean c(int param0) {
        int stackIn_7_0 = 0;
        L0: {
          if (param0 == 48) {
            break L0;
          } else {
            ab.c((byte) 45);
            break L0;
          }
        }
        L1: {
          L2: {
            if (null != kb.field_i) {
              break L2;
            } else {
              if (!jh.field_h) {
                stackIn_7_0 = 0;
                break L1;
              } else {
                break L2;
              }
            }
          }
          stackIn_7_0 = 1;
          break L1;
        }
        return stackIn_7_0 != 0;
    }

    public ab() {
        this.field_b = new be();
        this.field_b.field_v = this.field_b;
        this.field_b.field_p = this.field_b;
    }

    static {
        field_a = "Resign";
        field_e = 64;
        field_c = new java.util.zip.CRC32();
        field_d = "Unfortunately you are not eligible to create an account.";
    }
}
