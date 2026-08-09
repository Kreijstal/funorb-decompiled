/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kt {
    static gf field_a;

    final static float[] a(byte param0, float[] param1, float param2) {
        float[] var3 = null;
        RuntimeException var3_ref = null;
        float[] var4 = null;
        float[] stackIn_2_0 = null;
        float[] stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var4 = new float[2];
            var3 = var4;
            if (param0 < -6) {
              var4[0] = (float)(Math.cos((double)param2) * (double)param1[0] - Math.sin((double)param2) * (double)param1[1]);
              var4[1] = (float)(Math.cos((double)param2) * (double)param1[1] + Math.sin((double)param2) * (double)param1[0]);
              stackIn_4_0 = (float[]) (var4);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (float[]) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var3_ref);

            stackIn_7_1 = new StringBuilder().append("kt.C(").append(param0).append(',');

            if (param1 == null) {
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
          throw qo.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    final static void b(byte param0) {
        if (param0 < 99) {
            return;
        }
        tn.b((byte) -113);
    }

    final static int a(int param0) {
        int stackIn_30_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        long var5 = 0L;
        int var7 = 0;
        int var8 = 0;
        var8 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            var1_int = 0;
            var2 = 0;
            L1: while (true) {
              if (!wd.c(-105)) {
                L2: {
                  nj.field_a.a(true, wg.b(jc.field_f, 1882601153, nb.field_a), wg.b(pi.field_e, 1882601153, ko.field_p));
                  if (nj.field_a.d(-31260)) {
                    var1_int = 1;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  L4: {
                    var4 = -89 / ((param0 - 67) / 48);
                    var3 = 0;
                    if (var1_int == 0) {
                      break L4;
                    } else {
                      if ((nj.field_a.field_g ^ -1) <= -1) {
                        var3 = jo.field_b[nj.field_a.field_g];
                        if (-3 == (var3 ^ -1)) {
                          ha.b(23639);
                          break L3;
                        } else {
                          if ((var3 ^ -1) != -6) {
                            break L3;
                          } else {
                            ha.b(23639);
                            break L3;
                          }
                        }
                      } else {
                        break L4;
                      }
                    }
                  }
                  if (var2 == 0) {
                    break L3;
                  } else {
                    if (cl.field_s != 2) {
                      ha.b(23639);
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                }
                L5: {
                  if (var3 != 0) {
                    break L5;
                  } else {
                    if (2 == cl.field_s) {
                      var5 = -iv.field_f + wq.a(-84);
                      var7 = (int)((10999L + -var5) / 1000L);
                      if ((var7 ^ -1) >= -1) {
                        var3 = 2;
                        ou.a(true, 5, (byte) 118);
                        break L5;
                      } else {
                        break L5;
                      }
                    } else {
                      break L5;
                    }
                  }
                }
                stackIn_30_0 = var3;
                break L0;
              } else {
                L6: {
                  nj.field_a.a((byte) 63);
                  if (!nj.field_a.d(-31260)) {
                    break L6;
                  } else {
                    var1_int = 1;
                    break L6;
                  }
                }
                if ((tg.field_a ^ -1) == -14) {
                  var2 = 1;
                  continue L1;
                } else {
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw qo.a((Throwable) ((Object) var1), "kt.A(" + param0 + ')');
        }
        return stackIn_30_0;
    }

    public static void a(byte param0) {
        field_a = null;
        if (param0 != -14) {
            field_a = (gf) null;
        }
    }

    static {
        field_a = new gf();
    }
}
