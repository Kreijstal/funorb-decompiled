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
        RuntimeException var5 = null;
        qe var6 = null;
        String stackIn_3_0 = null;
        String stackIn_7_0 = null;
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
            if (!param0.b(-3)) {
              stackIn_3_0 = (String) (param1);
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (param3 == -22165) {
                  break L1;
                } else {
                  var6 = (qe) null;
                  lj.a((ak) null, (ak) null, 33, (ak) null, (qe) null);
                  break L1;
                }
              }
              stackIn_7_0 = param2 + " - " + param0.a(param4, (byte) -78) + "%";
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var5);

            stackIn_10_1 = new StringBuilder().append("lj.D(");

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


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');

            if (param1 == null) {
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
          L4: {


            stackIn_16_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',');

            if (param2 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L4;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L4;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_11_0), stackIn_17_2 + ',' + param3 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_7_0;
        }
    }

    final int a(boolean param0, int param1, int param2, byte[] param3) throws IOException {
        int var5_int = 0;
        RuntimeException var5 = null;
        int stackIn_4_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var5_int = this.field_e.read(param3, param1, param2);
              if (var5_int <= 0) {
                break L1;
              } else {
                this.field_a = this.field_a + (long)var5_int;
                break L1;
              }
            }
            if (!param0) {
              stackIn_6_0 = var5_int;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_4_0 = -112;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var5);

            stackIn_9_1 = new StringBuilder().append("lj.F(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          return stackIn_6_0;
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
        RuntimeException var3_ref = null;
        byte[] var4 = null;
        String var5 = null;
        String stackIn_5_0 = null;
        String stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        Throwable decompiledCaughtException = null;
        try {
          L0: {
            try {
              L1: {
                L2: {
                  if (param1 <= -28) {
                    break L2;
                  } else {
                    field_b = (String) null;
                    break L2;
                  }
                }
                L3: {
                  var3_int = param2.g(21231);
                  if (var3_int <= param0) {
                    break L3;
                  } else {
                    var3_int = param0;
                    break L3;
                  }
                }
                var4 = new byte[var3_int];
                param2.field_m = param2.field_m + kp.field_v.a(-1, var3_int, param2.field_k, 0, param2.field_m, var4);
                var5 = ui.a(true, var4, 0, var3_int);
                stackIn_5_0 = (String) (var5);
                break L1;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var3 = (Exception) (Object) decompiledCaughtException;
              stackIn_7_0 = "Cabbage";
              return stackIn_7_0;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L4: {
            var3_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var3_ref);

            stackIn_10_1 = new StringBuilder().append("lj.A(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L4;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L4;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
        return stackIn_5_0;
    }

    final void b(int param0) throws IOException {
        we var3;
        if (param0 == -5317) {
          if (this.field_e != null) {
            this.field_e.close();
            this.field_e = null;
            return;
          } else {
            return;
          }
        } else {
          var3 = (we) null;
          lj.a(-58, 20, (we) null);
          if (this.field_e == null) {
            return;
          } else {
            this.field_e.close();
            this.field_e = null;
            return;
          }
        }
    }

    final void a(boolean param0, long param1) throws IOException {
        this.field_e.seek(param1);
        this.field_a = param1;
        if (param0) {
            field_b = (String) null;
            return;
        }
    }

    final static sc a(byte param0) {
        int var1 = 125 / ((param0 - 14) / 56);
        return new sc(wc.d(0), wg.a(-5057));
    }

    final long b(byte param0) throws IOException {
        int var2 = 69 % ((param0 - 56) / 58);
        return this.field_e.length();
    }

    protected final void finalize() throws Throwable {
        if (this.field_e != null) {
            System.out.println("");
            this.b(-5317);
        }
    }

    lj(File param0, String param1, long param2) throws IOException {
        int var5_int = 0;
        try {
            if (0L == (param2 ^ -1L)) {
                param2 = 9223372036854775807L;
            }
            if ((param2 ^ -1L) > (param0.length() ^ -1L)) {
                param0.delete();
            }
            this.field_e = new RandomAccessFile(param0, param1);
            this.field_a = 0L;
            this.field_f = param2;
            var5_int = this.field_e.read();
            if ((var5_int ^ -1) != 0 && !param1.equals("r")) {
                this.field_e.seek(0L);
                this.field_e.write(var5_int);
            }
            this.field_e.seek(0L);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "lj.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final void a(int param0, byte[] param1, int param2, int param3) throws IOException {
        try {
            if (param3 > -68) {
                String var6 = (String) null;
                lj.a((fm) null, (String) null, (String) null, -29, 64);
            }
            if (!(this.field_a + (long)param0 <= this.field_f)) {
                this.field_e.seek(this.field_f);
                this.field_e.write(1);
                throw new EOFException();
            }
            this.field_e.write(param1, param2, param0);
            this.field_a = this.field_a + (long)param0;
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "lj.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static te a(ak param0, ak param1, int param2, ak param3, qe param4) {
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        te stackIn_29_0 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
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
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        String[] var8 = null;
        char[] var9 = null;
        int[] var10 = null;
        te[] var11 = null;
        int var12 = 0;
        qe var13_ref_qe = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        kp var16 = null;
        int var17 = 0;
        int[] var18 = null;
        char[] var19 = null;
        int[] var20 = null;
        char[] var21 = null;
        var17 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            if (param4 != null) {
              L1: {
                if (null == param4.field_z) {
                  stackIn_7_0 = 0;
                  break L1;
                } else {
                  stackIn_7_0 = param4.field_z.length;
                  break L1;
                }
              }
              L2: {
                var5_int = stackIn_7_0;
                if (param4.field_D != null) {
                  stackIn_10_0 = param4.field_D.length;
                  break L2;
                } else {
                  stackIn_10_0 = 0;
                  break L2;
                }
              }
              L3: {
                var6 = stackIn_10_0;
                var7 = var6 + var5_int;
                if (param2 < -18) {
                  break L3;
                } else {
                  field_b = (String) null;
                  break L3;
                }
              }
              L4: {
                var8 = new String[var7];
                var21 = new char[var7];
                var19 = var21;
                var9 = var19;
                var20 = new int[var7];
                var18 = var20;
                var10 = var18;
                var11 = new te[var7];
                if (param4.field_z == null) {
                  break L4;
                } else {
                  var12 = 0;
                  L5: while (true) {
                    if (param4.field_z.length <= var12) {
                      break L4;
                    } else {
                      var13_ref_qe = w.field_y.a(param4.field_z[var12], false);
                      var8[var12] = var13_ref_qe.field_C;
                      var9[var12] = param4.field_x[var12];
                      var11[var12] = lj.a(param0, param1, -113, param3, var13_ref_qe);
                      var12++;
                      continue L5;
                    }
                  }
                }
              }
              L6: {
                if (null != param4.field_D) {
                  var12 = var5_int;
                  var13 = 49;
                  var14 = 0;
                  L7: while (true) {
                    if (param4.field_D.length <= var14) {
                      break L6;
                    } else {
                      L8: {
                        var15 = param4.field_D[var14];
                        if (var15 == -1) {
                          var8[var12 - -var14] = ui.field_g;
                          var9[var14 + var12] = param4.field_t[var14];
                          var10[var12 + var14] = param4.field_D[var14];
                          break L8;
                        } else {
                          L9: {
                            var16 = jd.field_k.a(-21209, var15);
                            var8[var14 + var12] = var16.a((byte) -54);
                            var9[var12 + var14] = param4.field_t[var14];
                            if (0 >= var9[var14 + var12]) {
                              var13 = (char)(var13 + 1);
                              var9[var12 + var14] = (char)var13;
                              break L9;
                            } else {
                              break L9;
                            }
                          }
                          var10[var12 + var14] = param4.field_D[var14];
                          break L8;
                        }
                      }
                      var14++;
                      continue L7;
                    }
                  }
                } else {
                  break L6;
                }
              }
              stackIn_29_0 = new te(0L, param1, param3, param0, var11, var20, var8, var21);
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var5 = decompiledCaughtException;
            stackIn_32_0 = (RuntimeException) (var5);

            stackIn_32_1 = new StringBuilder().append("lj.E(");

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
          L11: {


            stackIn_35_1 = ((StringBuilder) (Object) stackIn_33_1).append(stackIn_33_2).append(',');

            if (param1 == null) {
              stackIn_33_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackIn_36_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackIn_36_2 = "null";
              break L11;
            } else {
              stackIn_33_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackIn_36_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackIn_36_2 = "{...}";
              break L11;
            }
          }
          L12: {


            stackIn_38_1 = ((StringBuilder) (Object) stackIn_36_1).append(stackIn_36_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_33_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackIn_39_1 = (StringBuilder) ((Object) stackIn_38_1);
              stackIn_39_2 = "null";
              break L12;
            } else {
              stackIn_33_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackIn_39_1 = (StringBuilder) ((Object) stackIn_38_1);
              stackIn_39_2 = "{...}";
              break L12;
            }
          }
          L13: {


            stackIn_41_1 = ((StringBuilder) (Object) stackIn_39_1).append(stackIn_39_2).append(',');

            if (param4 == null) {
              stackIn_33_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackIn_42_1 = (StringBuilder) ((Object) stackIn_41_1);
              stackIn_42_2 = "null";
              break L13;
            } else {
              stackIn_33_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackIn_42_1 = (StringBuilder) ((Object) stackIn_41_1);
              stackIn_42_2 = "{...}";
              break L13;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_33_0), stackIn_42_2 + ')');
        }
        return stackIn_29_0;
    }

    static {
        field_b = "<%0>/<%1>";
    }
}
