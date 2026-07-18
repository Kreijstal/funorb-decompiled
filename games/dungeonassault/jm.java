/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jm {
    static String[] field_a;
    static String field_g;
    static String field_b;
    static cn field_i;
    static String field_e;
    static lh field_h;
    static int field_c;
    static String field_d;
    static md field_f;

    final static void a(int param0, int param1, int param2, int param3) {
        L0: {
          if (param1 % 7 == 0) {
            break L0;
          } else {
            if (!gm.field_d.field_k.a(-(param1 / 7) + (-1 + param1), (byte) 105)) {
              break L0;
            } else {
              ol.field_a[0].b(param3, param0, 256);
              break L0;
            }
          }
        }
        L1: {
          if (param1 % 7 == 6) {
            break L1;
          } else {
            if (gm.field_d.field_k.a(param1 + -(param1 / 7), (byte) 109)) {
              ol.field_a[2].b(param3, param0, 256);
              break L1;
            } else {
              break L1;
            }
          }
        }
        L2: {
          if (param2 == 3) {
            break L2;
          } else {
            jm.a(125, 94, 37, 21);
            break L2;
          }
        }
        L3: {
          if (6 >= param1) {
            if (42 <= param1) {
              break L3;
            } else {
              if (!gm.field_d.field_k.a(param1 - -42, (byte) 114)) {
                break L3;
              } else {
                ol.field_a[3].b(param3, param0, 256);
                break L3;
              }
            }
          } else {
            if (42 <= param1) {
              break L3;
            } else {
              if (!gm.field_d.field_k.a(param1 - -42, (byte) 114)) {
                break L3;
              } else {
                ol.field_a[3].b(param3, param0, 256);
                break L3;
              }
            }
          }
        }
    }

    final static void a(la param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        la var3 = null;
        int var4 = 0;
        Object var5 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        var4 = DungeonAssault.field_K;
        try {
          L0: {
            if (null != param0.field_d) {
              L1: {
                L2: {
                  if (0 != param0.field_o) {
                    break L2;
                  } else {
                    if (0 == param0.field_m) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                var2_int = 0;
                L3: while (true) {
                  if (var2_int >= ud.field_x) {
                    break L1;
                  } else {
                    L4: {
                      var3 = nb.field_a[var2_int];
                      if (var3.field_n != 2) {
                        break L4;
                      } else {
                        if (var3.field_o != param0.field_o) {
                          break L4;
                        } else {
                          if (var3.field_m == param0.field_m) {
                            return;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                    var2_int++;
                    continue L3;
                  }
                }
              }
              L5: {
                if (param1 == 116) {
                  break L5;
                } else {
                  var5 = null;
                  jm.a((la) null, (byte) 75);
                  break L5;
                }
              }
              L6: {
                if (null != param0.field_i) {
                  break L6;
                } else {
                  break L6;
                }
              }
              ul.a(param0, -440);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var2 = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) var2;
            stackOut_19_1 = new StringBuilder().append("jm.E(");
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param0 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L7;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L7;
            }
          }
          throw vk.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + ',' + param1 + ')');
        }
    }

    final static void a(int param0, int param1, cn[] param2, int param3, int param4) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        var10 = DungeonAssault.field_K;
        try {
          L0: {
            L1: {
              if (param2 == null) {
                break L1;
              } else {
                if (param1 <= 0) {
                  break L1;
                } else {
                  var5_int = param2[0].field_E;
                  var6 = param2[2].field_E;
                  var7 = param2[1].field_E;
                  param2[0].h(param0, param4);
                  param2[2].h(param0 - -param1 + -var6, param4);
                  gf.a(mk.field_i);
                  gf.a(param0 - -var5_int, param4, param1 + (param0 + -var6), param4 - -param2[1].field_G);
                  var8 = var5_int + param0;
                  var9 = param1 + param0 + -var6;
                  param0 = var8;
                  L2: while (true) {
                    if (var9 <= param0) {
                      gf.b(mk.field_i);
                      break L0;
                    } else {
                      param2[1].h(param0, param4);
                      param0 = param0 + var7;
                      continue L2;
                    }
                  }
                }
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var5;
            stackOut_10_1 = new StringBuilder().append("jm.F(").append(param0).append(',').append(param1).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param2 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          throw vk.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ',' + 0 + ',' + param4 + ')');
        }
    }

    final static void a(boolean param0) {
        bb.field_e = null;
        td.field_a = null;
    }

    public static void a(byte param0) {
        field_f = null;
        field_h = null;
        field_g = null;
        field_i = null;
        field_a = null;
        field_e = null;
        field_d = null;
        field_b = null;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        gf.e(param1, param4, 96, 4, 0);
        gf.e(param1 - 1, param4 + -1, 98, 6, 12632256);
        qe.b(param1 - 1, -1 + param4, 98, 6, 192, 64, 3, 192);
        if (param3 >= -73) {
            Object var6 = null;
            jm.a((la) null, (byte) 25);
        }
    }

    final static String a(byte param0, CharSequence param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        StringBuilder var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        Object stackIn_26_0 = null;
        String stackIn_28_0 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_27_0 = null;
        Object stackOut_25_0 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        var9 = DungeonAssault.field_K;
        try {
          L0: {
            if (param1 != null) {
              var2_int = 0;
              var3 = param1.length();
              L1: while (true) {
                L2: {
                  if (var3 <= var2_int) {
                    break L2;
                  } else {
                    if (!jc.a(param1.charAt(var2_int), 48)) {
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
                      if (!jc.a(param1.charAt(-1 + var3), -119)) {
                        break L4;
                      } else {
                        var3--;
                        continue L3;
                      }
                    }
                  }
                  var4 = -var2_int + var3;
                  if (var4 >= 1) {
                    if (var4 <= 12) {
                      var5 = new StringBuilder(var4);
                      var6 = var2_int;
                      L5: while (true) {
                        if (var3 <= var6) {
                          if (var5.length() != 0) {
                            stackOut_27_0 = var5.toString();
                            stackIn_28_0 = stackOut_27_0;
                            break L0;
                          } else {
                            stackOut_25_0 = null;
                            stackIn_26_0 = stackOut_25_0;
                            return (String) (Object) stackIn_26_0;
                          }
                        } else {
                          L6: {
                            var7 = param1.charAt(var6);
                            if (!il.a(true, (char) var7)) {
                              break L6;
                            } else {
                              var8 = tl.a((byte) -69, (char) var7);
                              if (0 != var8) {
                                StringBuilder discarded$1 = var5.append((char) var8);
                                break L6;
                              } else {
                                break L6;
                              }
                            }
                          }
                          var6++;
                          continue L5;
                        }
                      }
                    } else {
                      return null;
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
            stackOut_29_0 = (RuntimeException) var2;
            stackOut_29_1 = new StringBuilder().append("jm.B(").append(59).append(',');
            stackIn_31_0 = stackOut_29_0;
            stackIn_31_1 = stackOut_29_1;
            stackIn_30_0 = stackOut_29_0;
            stackIn_30_1 = stackOut_29_1;
            if (param1 == null) {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "null";
              stackIn_32_0 = stackOut_31_0;
              stackIn_32_1 = stackOut_31_1;
              stackIn_32_2 = stackOut_31_2;
              break L7;
            } else {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "{...}";
              stackIn_32_0 = stackOut_30_0;
              stackIn_32_1 = stackOut_30_1;
              stackIn_32_2 = stackOut_30_2;
              break L7;
            }
          }
          throw vk.a((Throwable) (Object) stackIn_32_0, stackIn_32_2 + ')');
        }
        return stackIn_28_0;
    }

    final static void a(int param0) {
        int var1 = 0;
        if (!(!ed.c(true))) {
            return;
        }
        if (!jn.field_c) {
            ac.field_B.d((byte) -80, 70);
            ac.field_B.b((byte) -106, ke.field_b);
            ac.field_B.a(6, oh.field_s);
        } else {
            ac.field_B.d((byte) -113, 71);
            ac.field_B.field_o = ac.field_B.field_o + 1;
            var1 = ac.field_B.field_o;
            ac.field_B.a(2, ip.field_j);
            ac.field_B.a(6, oh.field_s);
            ac.field_B.c(ac.field_B.field_o + -var1, -1);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = "A very large, well-muscled creature with the head of a bull and the body of a man. It wields a massive axe but wears little in the way of protective clothing.";
        field_e = "Names cannot start or end with space or underscore";
        field_b = "achievements to collect";
        field_a = new String[]{"Summon Zombie", "From the miscellaneous body parts found so frequently around a dungeon, the <%0> is able to assemble a zombie to scout the next room. The zombie is incapable of fighting or disarming traps. (Single use)"};
        field_d = "Most reptiles don't have eight legs. Saying that, most reptiles don't have a penchant for eating raiders.";
    }
}
