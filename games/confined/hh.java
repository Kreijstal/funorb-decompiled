/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hh {
    static df field_c;
    static jb field_d;
    static String field_a;
    static String field_b;

    final static boolean a(int param0) {
        if (param0 != -13613) {
            field_d = (jb) null;
        }
        return rk.field_f;
    }

    final static String a(int param0, CharSequence param1) {
        StringBuilder discarded$0 = null;
        Object stackIn_16_0 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        StringBuilder var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = Confined.field_J ? 1 : 0;
        try {
          L0: {
            if (param1 != null) {
              var2_int = param0;
              var3 = param1.length();
              L1: while (true) {
                L2: {
                  if (var3 <= var2_int) {
                    break L2;
                  } else {
                    if (!bg.a(175, param1.charAt(var2_int))) {
                      break L2;
                    } else {
                      var2_int++;
                      continue L1;
                    }
                  }
                }
                L3: while (true) {
                  L4: {
                    if (var3 <= var2_int) {
                      break L4;
                    } else {
                      if (!bg.a(param0 + 175, param1.charAt(-1 + var3))) {
                        break L4;
                      } else {
                        var3--;
                        continue L3;
                      }
                    }
                  }
                  var4 = -var2_int + var3;
                  if (var4 >= 1) {
                    if (-13 <= (var4 ^ -1)) {
                      var5 = new StringBuilder(var4);
                      var6 = var2_int;
                      L5: while (true) {
                        if (var6 >= var3) {
                          if (var5.length() != 0) {
                            return var5.toString();
                          } else {
                            return null;
                          }
                        } else {
                          L6: {
                            var7 = param1.charAt(var6);
                            if (!vb.a((byte) -37, (char) var7)) {
                              break L6;
                            } else {
                              var8 = i.a((char) var7, (byte) -98);
                              if (var8 == 0) {
                                break L6;
                              } else {
                                discarded$0 = var5.append((char) var8);
                                break L6;
                              }
                            }
                          }
                          var6++;
                          continue L5;
                        }
                      }
                    } else {
                      stackIn_16_0 = null;
                      break L0;
                    }
                  } else {
                    return null;
                  }
                }
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var2 = decompiledCaughtException;
            stackIn_29_0 = (RuntimeException) (var2);

            stackIn_29_1 = new StringBuilder().append("hh.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_30_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "null";
              break L7;
            } else {
              stackIn_30_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "{...}";
              break L7;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_30_0), stackIn_30_2 + ')');
        }
        return (String) ((Object) stackIn_16_0);
    }

    final static void a(oc param0, int param1) {
        int dupTemp$0 = 0;
        int fieldTemp$1 = 0;
        int incrementValue$2 = 0;
        int dupTemp$3 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = Confined.field_J ? 1 : 0;
        try {
          L0: {
            var2_int = 0;
            L1: while (true) {
              if ((var2_int ^ -1) <= -4) {
                var2_int = 0;
                L2: while (true) {
                  if (en.field_a <= var2_int) {
                    dupTemp$0 = param0.a(80);
                    jj.field_lb[dupTemp$0] = jj.field_lb[dupTemp$0] + 1;
                    var3 = -16 / ((4 - param1) / 48);
                    var2_int = 0;
                    var4 = 0;
                    L3: while (true) {
                      if (var4 >= en.field_a) {
                        en.field_a = var2_int;
                        fieldTemp$1 = en.field_a;
                        en.field_a = en.field_a + 1;
                        kl.field_R[fieldTemp$1] = param0;
                        break L0;
                      } else {
                        L4: {
                          L5: {
                            if (param0.field_a == kl.field_R[var4].field_a) {
                              var5 = kl.field_R[var4].a(-97);
                              if (um.field_b < jj.field_lb[var5]) {
                                jj.field_lb[var5] = jj.field_lb[var5] - 1;
                                break L4;
                              } else {
                                break L5;
                              }
                            } else {
                              break L5;
                            }
                          }
                          incrementValue$2 = var2_int;
                          var2_int++;
                          kl.field_R[incrementValue$2] = kl.field_R[var4];
                          break L4;
                        }
                        var4++;
                        continue L3;
                      }
                    }
                  } else {
                    L6: {
                      if ((param0.field_a ^ -1) == (kl.field_R[var2_int].field_a ^ -1)) {
                        dupTemp$3 = kl.field_R[var2_int].a(-79);
                        jj.field_lb[dupTemp$3] = jj.field_lb[dupTemp$3] + 1;
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    var2_int++;
                    continue L2;
                  }
                }
              } else {
                jj.field_lb[var2_int] = 0;
                var2_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var2 = decompiledCaughtException;
            stackIn_23_0 = (RuntimeException) (var2);

            stackIn_23_1 = new StringBuilder().append("hh.B(");

            if (param0 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L7;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L7;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ',' + param1 + ')');
        }
    }

    public static void a(byte param0) {
        field_a = null;
        field_c = null;
        field_b = null;
        field_d = null;
        if (param0 > -77) {
            field_d = (jb) null;
        }
    }

    final static tl[] a(df param0, int param1) {
        tl[] stackIn_4_0 = null;
        tl[] stackIn_13_0 = null;
        tl[] stackIn_18_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int[] var3 = null;
        tl[] var4 = null;
        int var5 = 0;
        tl var6 = null;
        int var7 = 0;
        bc var8 = null;
        int[] var9 = null;
        int[] var10 = null;
        var7 = Confined.field_J ? 1 : 0;
        try {
          L0: {
            if (!param0.c(-123)) {
              stackIn_4_0 = new tl[]{};
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (param1 > 65) {
                  break L1;
                } else {
                  hh.a((byte) -108);
                  break L1;
                }
              }
              var8 = param0.a(5);
              L2: while (true) {
                if (-1 != (var8.field_g ^ -1)) {
                  if (var8.field_g == 2) {
                    stackIn_13_0 = new tl[]{};
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    var10 = (int[]) (var8.field_f);
                    var9 = var10;
                    var3 = var9;
                    var4 = new tl[var10.length >> 619893154];
                    var5 = 0;
                    L3: while (true) {
                      if (var4.length <= var5) {
                        stackIn_18_0 = (tl[]) (var4);
                        decompiledRegionSelector0 = 2;
                        break L0;
                      } else {
                        var6 = new tl();
                        var4[var5] = var6;
                        var6.field_j = var3[var5 << -1970432862];
                        var6.field_c = var3[1 + (var5 << -1843892222)];
                        var6.field_h = var3[(var5 << 1991853282) - -2];
                        var6.field_k = var3[(var5 << 2106683330) - -3];
                        var5++;
                        continue L3;
                      }
                    }
                  }
                } else {
                  jd.a(1, 10L);
                  continue L2;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackIn_21_0 = (RuntimeException) (var2);

            stackIn_21_1 = new StringBuilder().append("hh.C(");

            if (param0 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L4;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L4;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_13_0;
          } else {
            return stackIn_18_0;
          }
        }
    }

    static {
        field_a = "Orb points: ";
        field_b = "Achievements";
    }
}
