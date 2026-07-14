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
          if (-1 == (param1 % 7 ^ -1)) {
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
          if ((param1 % 7 ^ -1) == -7) {
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
        int var2 = 0;
        la var3 = null;
        int var4 = 0;
        Object var5 = null;
        var4 = DungeonAssault.field_K;
        if (null != param0.field_d) {
          L0: {
            L1: {
              if (0 != param0.field_o) {
                break L1;
              } else {
                if (0 == param0.field_m) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            var2 = 0;
            L2: while (true) {
              if (var2 >= ud.field_x) {
                break L0;
              } else {
                var3 = nb.field_a[var2];
                if (-3 == (var3.field_n ^ -1)) {
                  if (var3.field_o == param0.field_o) {
                    if (var3.field_m == param0.field_m) {
                      return;
                    } else {
                      var2++;
                      continue L2;
                    }
                  } else {
                    var2++;
                    continue L2;
                  }
                } else {
                  var2++;
                  continue L2;
                }
              }
            }
          }
          L3: {
            if (param1 == 116) {
              break L3;
            } else {
              var5 = null;
              jm.a((la) null, (byte) 75);
              break L3;
            }
          }
          L4: {
            if (null != param0.field_i) {
              break L4;
            } else {
              break L4;
            }
          }
          ul.a(param0, -440);
          return;
        } else {
          return;
        }
    }

    final static void a(int param0, int param1, cn[] param2, int param3, int param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = DungeonAssault.field_K;
        if (param2 != null) {
            if (!(-1 > (param1 ^ -1))) {
                return;
            }
            var5 = param2[0].field_E;
            var6 = param2[2].field_E;
            var7 = param2[1].field_E;
            param2[param3].h(param0, param4);
            param2[2].h(param0 - -param1 + -var6, param4);
            gf.a(mk.field_i);
            gf.a(param0 - -var5, param4, param1 + (param0 + -var6), param4 - -param2[1].field_G);
            var8 = var5 + param0;
            var9 = param1 + param0 + -var6;
            param0 = var8;
            while (var9 > param0) {
                param2[1].h(param0, param4);
                param0 = param0 + var7;
            }
            gf.b(mk.field_i);
            return;
        }
    }

    final static void a(boolean param0) {
        bb.field_e = null;
        td.field_a = null;
        if (param0) {
            Object var2 = null;
            jm.a((la) null, (byte) -11);
        }
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
        if (param0 >= -114) {
            field_i = null;
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        gf.e(param1, param4, param2, param0, 0);
        gf.e(param1 - 1, param4 + -1, param2 + 2, 2 + param0, 12632256);
        qe.b(param1 - 1, -1 + param4, 2 + param2, param0 + 2, 192, 64, 3, 192);
        if (param3 >= -73) {
            Object var6 = null;
            jm.a((la) null, (byte) 25);
        }
    }

    final static String a(byte param0, CharSequence param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        StringBuilder var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = DungeonAssault.field_K;
        if (param1 != null) {
          var2 = 0;
          var3 = param1.length();
          L0: while (true) {
            L1: {
              if (var3 <= var2) {
                break L1;
              } else {
                if (!jc.a(param1.charAt(var2), 48)) {
                  break L1;
                } else {
                  var2++;
                  continue L0;
                }
              }
            }
            L2: while (true) {
              L3: {
                if (var3 <= var2) {
                  break L3;
                } else {
                  if (!jc.a(param1.charAt(-1 + var3), -119)) {
                    break L3;
                  } else {
                    var3--;
                    continue L2;
                  }
                }
              }
              var4 = -var2 + var3;
              if ((var4 ^ -1) <= -2) {
                if (var4 <= 12) {
                  L4: {
                    var5 = new StringBuilder(var4);
                    if (param0 == 59) {
                      break L4;
                    } else {
                      jm.a(52, -105, -111, 63);
                      break L4;
                    }
                  }
                  var6 = var2;
                  L5: while (true) {
                    if (var3 <= var6) {
                      if (var5.length() != 0) {
                        return var5.toString();
                      } else {
                        return null;
                      }
                    } else {
                      var7 = param1.charAt(var6);
                      if (il.a(true, (char) var7)) {
                        var8 = tl.a((byte) -69, (char) var7);
                        if (0 != var8) {
                          StringBuilder discarded$1 = var5.append(var8);
                          var6++;
                          continue L5;
                        } else {
                          var6++;
                          continue L5;
                        }
                      } else {
                        var6++;
                        continue L5;
                      }
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
        if (param0 != -17573) {
            jm.a(false);
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
