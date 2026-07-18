/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vk implements os {
    static kia field_d;
    static oc[] field_e;
    static String field_a;
    static String[] field_c;
    static byte[] field_b;

    final static boolean b(int param0) {
        RuntimeException var1 = null;
        boolean stackIn_4_0 = false;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_3_0 = false;
        try {
          L0: {
            L1: {
              if (param0 > 27) {
                break L1;
              } else {
                field_b = null;
                break L1;
              }
            }
            stackOut_3_0 = al.field_j;
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var1, "vk.E(" + param0 + ')');
        }
        return stackIn_4_0;
    }

    final static int c(int param0) {
        RuntimeException var1 = null;
        int var1_int = 0;
        int var2 = 0;
        int var3 = 0;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        int stackIn_14_0 = 0;
        int stackIn_50_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_13_0 = 0;
        int stackOut_49_0 = 0;
        var7 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var1_int = 0;
            var2 = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (!es.a(true)) {
                    break L3;
                  } else {
                    L4: {
                      sa.field_r.c(102);
                      if (sa.field_r.a(false)) {
                        var1_int = 1;
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    if (fna.field_h != 13) {
                      continue L1;
                    } else {
                      var2 = 1;
                      if (var7 != 0) {
                        break L2;
                      } else {
                        if (var7 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                }
                if (param0 >= 53) {
                  sa.field_r.a(wg.a(1541709953, jm.field_m, lba.field_p), 73, wg.a(1541709953, jba.field_j, sta.field_B));
                  break L2;
                } else {
                  stackOut_13_0 = 95;
                  stackIn_14_0 = stackOut_13_0;
                  return stackIn_14_0;
                }
              }
              L5: {
                if (sa.field_r.a(false)) {
                  var1_int = 1;
                  break L5;
                } else {
                  break L5;
                }
              }
              L6: {
                L7: {
                  var3 = 0;
                  if (var1_int == 0) {
                    break L7;
                  } else {
                    if (sa.field_r.field_h < 0) {
                      break L7;
                    } else {
                      L8: {
                        var3 = hb.field_w[sa.field_r.field_h];
                        if (var3 == 2) {
                          break L8;
                        } else {
                          if (var3 != 5) {
                            break L6;
                          } else {
                            break L8;
                          }
                        }
                      }
                      ug.n(-18);
                      if (var7 == 0) {
                        break L6;
                      } else {
                        break L7;
                      }
                    }
                  }
                }
                if (var2 == 0) {
                  break L6;
                } else {
                  if (2 == mq.field_a) {
                    break L6;
                  } else {
                    ug.n(-18);
                    break L6;
                  }
                }
              }
              L9: {
                if (var3 != 0) {
                  break L9;
                } else {
                  if (2 == mq.field_a) {
                    var4 = bva.b((byte) -107) - ln.field_H;
                    var6 = (int)((-var4 + 10999L) / 1000L);
                    if (var6 <= 0) {
                      var3 = 2;
                      qna.a(1, true, 5);
                      break L9;
                    } else {
                      break L9;
                    }
                  } else {
                    break L9;
                  }
                }
              }
              stackOut_49_0 = var3;
              stackIn_50_0 = stackOut_49_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var1, "vk.D(" + param0 + ')');
        }
        return stackIn_50_0;
    }

    public static void a(int param0) {
        try {
            field_b = null;
            field_a = null;
            field_c = null;
            field_d = null;
            field_e = null;
            if (param0 != 0) {
                field_d = null;
            }
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "vk.C(" + param0 + ')');
        }
    }

    public final mva[] a(int param0, int param1) {
        RuntimeException var3 = null;
        wea[] stackIn_4_0 = null;
        RuntimeException decompiledCaughtException = null;
        wea[] stackOut_3_0 = null;
        try {
          L0: {
            L1: {
              if (param1 == -26955) {
                break L1;
              } else {
                field_a = null;
                break L1;
              }
            }
            stackOut_3_0 = new wea[param0];
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var3, "vk.B(" + param0 + ',' + param1 + ')');
        }
        return (mva[]) (Object) stackIn_4_0;
    }

    public final mva a(byte param0) {
        RuntimeException var2 = null;
        wea stackIn_4_0 = null;
        RuntimeException decompiledCaughtException = null;
        wea stackOut_3_0 = null;
        try {
          L0: {
            L1: {
              if (param0 <= -17) {
                break L1;
              } else {
                mva discarded$2 = ((vk) this).a((byte) 88);
                break L1;
              }
            }
            stackOut_3_0 = new wea();
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var2, "vk.A(" + param0 + ')');
        }
        return (mva) (Object) stackIn_4_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "These aren't just common or garden Lindemann totems. Hold <img=8><img=9> to shove them around like heavy rock flamethrowers.";
        field_c = new String[]{"<%0> forgot to dodge the boulder", "<%0> rolled with it", "<%0> was bowled over", "<%0> was smeared", "<%0> developed a serious crush", "<%0>'s interests include hard rock", "<%0> made a poor speedbump"};
        field_d = new kia();
    }
}
