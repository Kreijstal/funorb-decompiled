/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sf {
    static ao field_d;
    static int field_g;
    static String field_c;
    static int field_e;
    static String field_f;
    static int field_b;
    static int field_a;

    public static void a(int param0) {
        if (param0 != 4) {
            return;
        }
        field_c = null;
        field_d = null;
        field_f = null;
    }

    final static fc a(byte param0, byte[] param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        fc stackIn_2_0 = null;
        bm stackIn_7_0 = null;
        Object stackIn_10_0 = null;
        bm stackIn_12_0 = null;
        bm stackIn_14_0 = null;
        bm stackIn_16_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 == -96) {
              var2_int = re.a(param1, 0, (byte) 77);
              if ((var2_int ^ -1) == -4) {
                stackIn_16_0 = gd.a(param1, (byte) 46);
                decompiledRegionSelector0 = 5;
                break L0;
              } else {
                if (4 == var2_int) {
                  stackIn_14_0 = ij.a(param1, 7);
                  decompiledRegionSelector0 = 4;
                  break L0;
                } else {
                  if (5 != var2_int) {
                    if (var2_int == 6) {
                      stackIn_12_0 = no.a((byte) 104, param1);
                      decompiledRegionSelector0 = 3;
                      break L0;
                    } else {
                      stackIn_10_0 = null;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    }
                  } else {
                    stackIn_7_0 = bo.a(param1, 24);
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              }
            } else {
              stackIn_2_0 = (fc) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackIn_19_0 = (RuntimeException) (var2);

            stackIn_19_1 = new StringBuilder().append("sf.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L1;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L1;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (fc) ((Object) stackIn_7_0);
          } else {
            if (decompiledRegionSelector0 == 2) {
              return (fc) ((Object) stackIn_10_0);
            } else {
              if (decompiledRegionSelector0 == 3) {
                return (fc) ((Object) stackIn_12_0);
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return (fc) ((Object) stackIn_14_0);
                } else {
                  return (fc) ((Object) stackIn_16_0);
                }
              }
            }
          }
        }
    }

    final static String a(int param0, int param1, String param2) {
        RuntimeException var3 = null;
        int var4 = 0;
        ga var5 = null;
        CharSequence var6 = null;
        String stackIn_3_0 = null;
        String stackIn_6_0 = null;
        String stackIn_9_0 = null;
        String stackIn_12_0 = null;
        String stackIn_15_0 = null;
        String stackIn_18_0 = null;
        Object stackIn_22_0 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var6 = (CharSequence) ((Object) param2);
            if (!em.a(var6, (byte) -38)) {
              stackIn_3_0 = u.field_f;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (!sf.a(1, param2)) {
                if ((ge.field_zb ^ -1) == -3) {
                  if (!hp.a(param2, 1020)) {
                    if (-101 < (fn.field_d ^ -1)) {
                      if (!kj.a((byte) -94, param2)) {
                        L1: {
                          if (param0 < -75) {
                            break L1;
                          } else {
                            field_d = (ao) null;
                            break L1;
                          }
                        }
                        var5 = ma.field_a;
                        var5.b((byte) -35, param1);
                        var5.field_j = var5.field_j + 1;
                        var4 = var5.field_j;
                        var5.a(125, 2);
                        var5.a(param2, (byte) 105);
                        var5.e(100, -var4 + var5.field_j);
                        stackIn_22_0 = null;
                        decompiledRegionSelector0 = 6;
                        break L0;
                      } else {
                        stackIn_18_0 = vl.a(lo.field_h, new String[]{param2}, 2);
                        decompiledRegionSelector0 = 5;
                        break L0;
                      }
                    } else {
                      stackIn_15_0 = th.field_c;
                      decompiledRegionSelector0 = 4;
                      break L0;
                    }
                  } else {
                    stackIn_12_0 = vl.a(lo.field_i, new String[]{param2}, 2);
                    decompiledRegionSelector0 = 3;
                    break L0;
                  }
                } else {
                  stackIn_9_0 = bg.field_d;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                stackIn_6_0 = hf.field_b;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_25_0 = (RuntimeException) (var3);

            stackIn_25_1 = new StringBuilder().append("sf.D(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "null";
              break L2;
            } else {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "{...}";
              break L2;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_26_0), stackIn_26_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_9_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_12_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_15_0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_18_0;
                  } else {
                    return (String) ((Object) stackIn_22_0);
                  }
                }
              }
            }
          }
        }
    }

    final static boolean a(int param0, String param1) {
        RuntimeException var2 = null;
        CharSequence var3 = null;
        int stackIn_2_0 = 0;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 == 1) {
              var3 = (CharSequence) ((Object) param1);
              stackIn_4_0 = kf.field_k.equals(tg.a(var3, false));
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
          L1: {
            var2 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var2);

            stackIn_7_1 = new StringBuilder().append("sf.B(").append(param0).append(',');

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
          throw fa.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_4_0;
        }
    }

    static {
        field_f = "Waiting for levels";
        field_g = 32;
        field_b = 17;
        field_e = 39;
        field_c = "<%0> cannot join; the game has started.";
        field_a = (640 - ((field_b - 1) * (-field_g + field_e) + field_g * field_b)) / 2;
        field_d = new ao(1, 2, 2, 0);
    }
}
