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
        if (param0 <= 27) {
            field_b = (byte[]) null;
            return al.field_j;
        }
        return al.field_j;
    }

    final static int c(int param0) {
        RuntimeException var1 = null;
        int var1_int = 0;
        int var2 = 0;
        int var3 = 0;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        int stackIn_12_0 = 0;
        int stackIn_34_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_11_0 = 0;
        int stackOut_33_0 = 0;
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
                    if ((fna.field_h ^ -1) != -14) {
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
                  stackOut_11_0 = 95;
                  stackIn_12_0 = stackOut_11_0;
                  decompiledRegionSelector0 = 0;
                  break L0;
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
                    if (-1 < (sa.field_r.field_h ^ -1)) {
                      break L7;
                    } else {
                      L8: {
                        var3 = hb.field_w[sa.field_r.field_h];
                        if ((var3 ^ -1) == -3) {
                          break L8;
                        } else {
                          if (-6 != (var3 ^ -1)) {
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
                    if ((var6 ^ -1) >= -1) {
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
              stackOut_33_0 = var3;
              stackIn_34_0 = stackOut_33_0;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var1), "vk.D(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_12_0;
        } else {
          return stackIn_34_0;
        }
    }

    public static void a(int param0) {
        field_b = null;
        field_a = null;
        field_c = null;
        field_d = null;
        field_e = null;
        if (param0 != 0) {
            field_d = (kia) null;
        }
    }

    public final mva[] a(int param0, int param1) {
        if (param1 != -26955) {
            field_a = (String) null;
            return (mva[]) ((Object) new wea[param0]);
        }
        return (mva[]) ((Object) new wea[param0]);
    }

    public final mva a(byte param0) {
        mva discarded$0 = null;
        if (param0 > -17) {
            discarded$0 = this.a((byte) 88);
            return (mva) ((Object) new wea());
        }
        return (mva) ((Object) new wea());
    }

    static {
        field_a = "These aren't just common or garden Lindemann totems. Hold <img=8><img=9> to shove them around like heavy rock flamethrowers.";
        field_c = new String[]{"<%0> forgot to dodge the boulder", "<%0> rolled with it", "<%0> was bowled over", "<%0> was smeared", "<%0> developed a serious crush", "<%0>'s interests include hard rock", "<%0> made a poor speedbump"};
        field_d = new kia();
    }
}
