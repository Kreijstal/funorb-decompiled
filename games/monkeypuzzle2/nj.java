/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nj {
    static int field_d;
    static int field_a;
    static String[] field_c;
    static int field_b;

    final synchronized static byte[] a(int param0, int param1) {
        int fieldTemp$3 = 0;
        int fieldTemp$4 = 0;
        int fieldTemp$5 = 0;
        int dupTemp$6 = 0;
        byte[][] arrayValue$7 = null;
        byte[] var2_ref_byte__;
        int var2;
        byte[] var3;
        L0: {
          if (param0 == 0) {
            break L0;
          } else {
            field_a = 96;
            break L0;
          }
        }
        L1: {
          if ((param1 ^ -1) != -101) {
            break L1;
          } else {
            if ((fd.field_r ^ -1) >= -1) {
              break L1;
            } else {
              fieldTemp$3 = fd.field_r - 1;
              fd.field_r = fd.field_r - 1;
              var2_ref_byte__ = wa.field_a[fieldTemp$3];
              wa.field_a[fd.field_r] = null;
              return var2_ref_byte__;
            }
          }
        }
        L2: {
          if ((param1 ^ -1) != -5001) {
            break L2;
          } else {
            if (ak.field_r > 0) {
              fieldTemp$4 = ak.field_r - 1;
              ak.field_r = ak.field_r - 1;
              var2_ref_byte__ = hk.field_f[fieldTemp$4];
              hk.field_f[ak.field_r] = null;
              return var2_ref_byte__;
            } else {
              break L2;
            }
          }
        }
        L3: {
          if ((param1 ^ -1) != -30001) {
            break L3;
          } else {
            if (0 >= jg.field_lb) {
              break L3;
            } else {
              fieldTemp$5 = jg.field_lb - 1;
              jg.field_lb = jg.field_lb - 1;
              var2_ref_byte__ = bl.field_k[fieldTemp$5];
              bl.field_k[jg.field_lb] = null;
              return var2_ref_byte__;
            }
          }
        }
        L4: {
          if (me.field_g == null) {
            break L4;
          } else {
            var2 = 0;
            L5: while (true) {
              if (var2 >= tf.field_c.length) {
                break L4;
              } else {
                if (tf.field_c[var2] == param1) {
                  if ((me.field_i[var2] ^ -1) < -1) {
                    dupTemp$6 = me.field_i[var2] - 1;
                    arrayValue$7 = me.field_g[var2];
                    me.field_i[var2] = dupTemp$6;
                    var3 = arrayValue$7[dupTemp$6];
                    me.field_g[var2][me.field_i[var2]] = null;
                    return var3;
                  } else {
                    var2++;
                    continue L5;
                  }
                } else {
                  var2++;
                  continue L5;
                }
              }
            }
          }
        }
        return new byte[param1];
    }

    final static int a(boolean param0, int param1, String param2, String param3, boolean param4, int param5, String param6) {
        aj var7 = null;
        RuntimeException var7_ref = null;
        aj var8 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param4) {
                break L1;
              } else {
                nj.a(-90, 124);
                break L1;
              }
            }
            var7 = new aj(param3);
            var8 = new aj(param6);
            stackIn_3_0 = qh.a(param5, var8, -1, param0, var7, param1, param2);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var7_ref = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var7_ref);

            stackIn_6_1 = new StringBuilder().append("nj.C(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
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


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');

            if (param3 == null) {
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
          L4: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',').append(param4).append(',').append(param5).append(',');

            if (param6 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_7_0), stackIn_13_2 + ')');
        }
        return stackIn_3_0;
    }

    public static void a(int param0) {
        if (param0 != -151) {
            field_c = (String[]) null;
        }
        field_c = null;
    }

    final static void a(int param0, int param1, int param2) {
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        var8 = MonkeyPuzzle2.field_F ? 1 : 0;
        if ((uj.field_i ^ -1) > -1) {
          return;
        } else {
          L0: {
            var3 = param1 - 135;
            var4 = -35 + param2;
            var5 = 256;
            if ((uj.field_i ^ -1) <= -76) {
              break L0;
            } else {
              var5 = (uj.field_i << 148348328) / 75;
              break L0;
            }
          }
          L1: {
            if (param0 == -21639) {
              break L1;
            } else {
              field_c = (String[]) null;
              break L1;
            }
          }
          L2: {
            if (uj.field_i <= 200) {
              break L2;
            } else {
              var5 = (-uj.field_i + 250 << -1629282392) / 50;
              break L2;
            }
          }
          L3: {
            mc.a(-8497, rj.field_H);
            ig.b();
            ge.d();
            ec.b(-128);
            if (-257 < (var5 ^ -1)) {
              ge.c(0, 0, ge.field_h, ge.field_g, 0, 256 - var5);
              break L3;
            } else {
              break L3;
            }
          }
          L4: {
            tj.b(653);
            if ((uj.field_i ^ -1) <= -151) {
              ki.field_H.b(15 + var3, var4 + 10, var5);
              break L4;
            } else {
              rj.field_H.e(var3, var4);
              break L4;
            }
          }
          L5: {
            var6 = uj.field_i - 125;
            if (-1 <= (var6 ^ -1)) {
              break L5;
            } else {
              if (50 <= var6) {
                break L5;
              } else {
                if (var6 < 20) {
                  var7 = var6 * 256 / 20;
                  ca.field_f.c(var3, var4, var7);
                  break L5;
                } else {
                  if (var6 < 30) {
                    ca.field_f.c(var3, var4, 256);
                    break L5;
                  } else {
                    var7 = (50 - var6) * 256 / 20;
                    ca.field_f.c(var3, var4, var7);
                    break L5;
                  }
                }
              }
            }
          }
          L6: {
            var6 = -140 + uj.field_i;
            if (0 >= var6) {
              break L6;
            } else {
              L7: {
                var7 = 256;
                if ((var6 ^ -1) > -21) {
                  var7 = 256 * var6 / 20;
                  break L7;
                } else {
                  break L7;
                }
              }
              dj.field_b.b(var3 - -15, 10 + var4, var5 * var7 >> 44628424);
              break L6;
            }
          }
          return;
        }
    }

    static {
        field_c = new String[]{"Connection lost - attempting to reconnect", "Connection lost - attempting to reconnect.", "Connection lost - attempting to reconnect..", "Connection lost - attempting to reconnect..."};
        field_a = -1;
    }
}
