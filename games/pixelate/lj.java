/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class lj {
    static int field_d;
    private RandomAccessFile field_e;
    static String field_b;
    private long field_a;
    private long field_f;
    static al field_g;
    static fm field_c;

    final static String a(fm param0, String param1, String param2, int param3, int param4) {
        if (!(param0.b(-3))) {
            return param1;
        }
        if (param3 != -22165) {
            Object var6 = null;
            te discarded$0 = lj.a((ak) null, (ak) null, 33, (ak) null, (qe) null);
        }
        return param2 + " - " + param0.a(param4, (byte) -78) + "%";
    }

    final int a(boolean param0, int param1, int param2, byte[] param3) throws IOException {
        int var5 = 0;
        var5 = ((lj) this).field_e.read(param3, param1, param2);
        if (var5 <= 0) {
          if (param0) {
            return -112;
          } else {
            return var5;
          }
        } else {
          ((lj) this).field_a = ((lj) this).field_a + (long)var5;
          if (param0) {
            return -112;
          } else {
            return var5;
          }
        }
    }

    public static void a(int param0) {
        if (param0 != -1) {
            return;
        }
        field_b = null;
        field_c = null;
        field_g = null;
    }

    final static String a(int param0, int param1, we param2) {
        int var3_int = 0;
        Exception var3 = null;
        byte[] var4 = null;
        String var5 = null;
        String stackIn_5_0 = null;
        Throwable decompiledCaughtException = null;
        String stackOut_4_0 = null;
        try {
          L0: {
            L1: {
              if (param1 <= -28) {
                break L1;
              } else {
                field_b = null;
                break L1;
              }
            }
            L2: {
              var3_int = param2.g(21231);
              if (var3_int <= param0) {
                break L2;
              } else {
                var3_int = param0;
                break L2;
              }
            }
            var4 = new byte[var3_int];
            param2.field_m = param2.field_m + kp.field_v.a(-1, var3_int, param2.field_k, 0, param2.field_m, var4);
            var5 = ui.a(true, var4, 0, var3_int);
            stackOut_4_0 = (String) var5;
            stackIn_5_0 = stackOut_4_0;
            break L0;
          }
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = (Exception) (Object) decompiledCaughtException;
          return "Cabbage";
        }
        return stackIn_5_0;
    }

    final void b(int param0) throws IOException {
        Object var3 = null;
        if (param0 == -5317) {
          if (((lj) this).field_e != null) {
            ((lj) this).field_e.close();
            ((lj) this).field_e = null;
            return;
          } else {
            return;
          }
        } else {
          var3 = null;
          String discarded$4 = lj.a(-58, 20, (we) null);
          if (((lj) this).field_e == null) {
            return;
          } else {
            ((lj) this).field_e.close();
            ((lj) this).field_e = null;
            return;
          }
        }
    }

    final void a(boolean param0, long param1) throws IOException {
        ((lj) this).field_e.seek(param1);
        ((lj) this).field_a = param1;
        if (param0) {
            field_b = null;
            return;
        }
    }

    final static sc a(byte param0) {
        int var1 = 125 / ((param0 - 14) / 56);
        return new sc(wc.d(0), wg.a(-5057));
    }

    final long b(byte param0) throws IOException {
        int var2 = 69 % ((param0 - 56) / 58);
        return ((lj) this).field_e.length();
    }

    protected final void finalize() throws Throwable {
        if (((lj) this).field_e != null) {
            System.out.println("");
            ((lj) this).b(-5317);
        }
    }

    lj(File param0, String param1, long param2) throws IOException {
        int var5 = 0;
        L0: {
          if (0L != (param2 ^ -1L)) {
            break L0;
          } else {
            param2 = 9223372036854775807L;
            break L0;
          }
        }
        L1: {
          if ((param2 ^ -1L) <= (param0.length() ^ -1L)) {
            break L1;
          } else {
            boolean discarded$2 = param0.delete();
            break L1;
          }
        }
        ((lj) this).field_e = new RandomAccessFile(param0, param1);
        ((lj) this).field_a = 0L;
        ((lj) this).field_f = param2;
        var5 = ((lj) this).field_e.read();
        if ((var5 ^ -1) == 0) {
          ((lj) this).field_e.seek(0L);
          return;
        } else {
          if (param1.equals((Object) (Object) "r")) {
            ((lj) this).field_e.seek(0L);
            return;
          } else {
            ((lj) this).field_e.seek(0L);
            ((lj) this).field_e.write(var5);
            ((lj) this).field_e.seek(0L);
            return;
          }
        }
    }

    final void a(int param0, byte[] param1, int param2, int param3) throws IOException {
        if (param3 > -68) {
            Object var6 = null;
            String discarded$8 = lj.a((fm) null, (String) null, (String) null, -29, 64);
            if (!(((lj) this).field_a + (long)param0 <= ((lj) this).field_f)) {
                ((lj) this).field_e.seek(((lj) this).field_f);
                ((lj) this).field_e.write(1);
                throw new EOFException();
            }
            ((lj) this).field_e.write(param1, param2, param0);
            ((lj) this).field_a = ((lj) this).field_a + (long)param0;
            return;
        }
        if (!(((lj) this).field_a + (long)param0 <= ((lj) this).field_f)) {
            ((lj) this).field_e.seek(((lj) this).field_f);
            ((lj) this).field_e.write(1);
            throw new EOFException();
        }
        ((lj) this).field_e.write(param1, param2, param0);
        ((lj) this).field_a = ((lj) this).field_a + (long)param0;
    }

    final static te a(ak param0, ak param1, int param2, ak param3, qe param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        String[] var8 = null;
        char[] var9 = null;
        int[] var10 = null;
        te[] var11 = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var17 = 0;
        int[] var18 = null;
        char[] var19 = null;
        int[] var20 = null;
        char[] var21 = null;
        qe var24 = null;
        kp var25 = null;
        int[] var26 = null;
        char[] var27 = null;
        int[] var28 = null;
        char[] var29 = null;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        var17 = Pixelate.field_H ? 1 : 0;
        if (param4 != null) {
          L0: {
            if (null == param4.field_z) {
              stackOut_5_0 = 0;
              stackIn_6_0 = stackOut_5_0;
              break L0;
            } else {
              stackOut_4_0 = param4.field_z.length;
              stackIn_6_0 = stackOut_4_0;
              break L0;
            }
          }
          L1: {
            var5 = stackIn_6_0;
            if (param4.field_D != null) {
              stackOut_8_0 = param4.field_D.length;
              stackIn_9_0 = stackOut_8_0;
              break L1;
            } else {
              stackOut_7_0 = 0;
              stackIn_9_0 = stackOut_7_0;
              break L1;
            }
          }
          L2: {
            var6 = stackIn_9_0;
            var7 = var6 + var5;
            if (param2 < -18) {
              break L2;
            } else {
              field_b = null;
              break L2;
            }
          }
          L3: {
            var8 = new String[var7];
            var29 = new char[var7];
            var27 = var29;
            var21 = var27;
            var19 = var21;
            var9 = var19;
            var28 = new int[var7];
            var26 = var28;
            var20 = var26;
            var18 = var20;
            var10 = var18;
            var11 = new te[var7];
            if (param4.field_z == null) {
              break L3;
            } else {
              var12 = 0;
              L4: while (true) {
                if (param4.field_z.length <= var12) {
                  break L3;
                } else {
                  var24 = w.field_y.a(param4.field_z[var12], false);
                  var8[var12] = var24.field_C;
                  var9[var12] = param4.field_x[var12];
                  var11[var12] = lj.a(param0, param1, -113, param3, var24);
                  var12++;
                  continue L4;
                }
              }
            }
          }
          L5: {
            if (null != param4.field_D) {
              var12 = var5;
              var13 = 49;
              var14 = 0;
              L6: while (true) {
                if (param4.field_D.length <= var14) {
                  break L5;
                } else {
                  var15 = param4.field_D[var14];
                  if (var15 == -1) {
                    var8[var12 - -var14] = ui.field_g;
                    var9[var14 + var12] = param4.field_t[var14];
                    var10[var12 + var14] = param4.field_D[var14];
                    var14++;
                    continue L6;
                  } else {
                    L7: {
                      var25 = jd.field_k.a(-21209, var15);
                      var8[var14 + var12] = var25.a((byte) -54);
                      var9[var12 + var14] = param4.field_t[var14];
                      if (0 >= var9[var14 + var12]) {
                        var13 = (char)(var13 + 1);
                        var9[var12 + var14] = (char)var13;
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                    var10[var12 + var14] = param4.field_D[var14];
                    var14++;
                    var14++;
                    continue L6;
                  }
                }
              }
            } else {
              break L5;
            }
          }
          return new te(0L, param1, param3, param0, var11, var28, var8, var29);
        } else {
          return null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "<%0>/<%1>";
    }
}
