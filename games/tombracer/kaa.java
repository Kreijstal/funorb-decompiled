/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kaa implements isa {
    private il field_c;
    private int field_a;
    private int field_b;

    final static byte[] a(int param0, byte[] param1, int param2) {
        byte[] var4 = new byte[param2];
        byte[] var3 = var4;
        lua.a(param1, param0, var4, 0, param2);
        return var4;
    }

    final static void a(byte param0) {
        bta.field_q = 0;
        ni.field_c = true;
        if (param0 <= 31) {
            Object var2 = null;
            byte[] discarded$0 = kaa.a(-119, (byte[]) null, -9);
        }
    }

    final static boolean a(int param0, int param1, boolean param2) {
        int stackIn_4_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_6_1 = 0;
        int stackOut_5_0 = 0;
        int stackOut_5_1 = 0;
        if (param2) {
          return false;
        } else {
          L0: {
            if (-1 == (24 & param1 ^ -1)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L0;
            }
          }
          L1: {
            stackOut_4_0 = stackIn_4_0;
            stackIn_6_0 = stackOut_4_0;
            stackIn_5_0 = stackOut_4_0;
            if ((544 & param1) != -545) {
              stackOut_6_0 = stackIn_6_0;
              stackOut_6_1 = 0;
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              break L1;
            } else {
              stackOut_5_0 = stackIn_5_0;
              stackOut_5_1 = 1;
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              break L1;
            }
          }
          return (stackIn_7_0 | stackIn_7_1) != 0;
        }
    }

    public final void a(ae param0, int param1, int param2, int param3, boolean param4) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        Object var12 = null;
        int stackIn_24_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_23_0 = 0;
        L0: {
          var11 = TombRacer.field_G ? 1 : 0;
          if (param0.field_f) {
            stackOut_22_0 = 3249872;
            stackIn_24_0 = stackOut_22_0;
            break L0;
          } else {
            if (!param0.b((byte) -34)) {
              stackOut_23_0 = 2188450;
              stackIn_24_0 = stackOut_23_0;
              break L0;
            } else {
              L1: {
                var6 = 3249872;
                if (param2 == 16777215) {
                  break L1;
                } else {
                  var12 = null;
                  byte[] discarded$5 = kaa.a(91, (byte[]) null, 83);
                  break L1;
                }
              }
              int discarded$6 = ((kaa) this).field_c.a("<u=" + Integer.toString(var6, 16) + ">" + param0.field_o + "</u>", param0.field_i + param1, param0.field_n + param3, param0.field_m, param0.field_p, var6, -1, ((kaa) this).field_a, ((kaa) this).field_b, ((kaa) this).field_c.field_k + ((kaa) this).field_c.field_w);
              if (param0.b((byte) -34)) {
                L2: {
                  var7 = ((kaa) this).field_c.b(param0.field_o);
                  var8 = ((kaa) this).field_c.field_k + ((kaa) this).field_c.field_w;
                  var9 = param1 + param0.field_i;
                  var10 = param3 + param0.field_n;
                  if (-3 != (((kaa) this).field_a ^ -1)) {
                    if (((kaa) this).field_a == 1) {
                      var9 = var9 + (param0.field_m - var7 >> -955317823);
                      break L2;
                    } else {
                      L3: {
                        if (-3 == ((kaa) this).field_b) {
                          var10 = var10 + (-var8 + param0.field_p);
                          break L3;
                        } else {
                          if (-2 != ((kaa) this).field_b) {
                            break L3;
                          } else {
                            var10 = var10 + (param0.field_p - var8 >> -1746807167);
                            break L3;
                          }
                        }
                      }
                      nn.a(var9 - 2, 2 + var10, var8, var7 + 4, false);
                      return;
                    }
                  } else {
                    var9 = var9 + (-var7 + param0.field_m);
                    break L2;
                  }
                }
                if (-3 != ((kaa) this).field_b) {
                  if (-2 == ((kaa) this).field_b) {
                    var10 = var10 + (param0.field_p - var8 >> -1746807167);
                    nn.a(var9 - 2, 2 + var10, var8, var7 + 4, false);
                    return;
                  } else {
                    nn.a(var9 - 2, 2 + var10, var8, var7 + 4, false);
                    return;
                  }
                } else {
                  var10 = var10 + (-var8 + param0.field_p);
                  nn.a(var9 - 2, 2 + var10, var8, var7 + 4, false);
                  return;
                }
              } else {
                return;
              }
            }
          }
        }
        var6 = stackIn_24_0;
        if (param2 == 16777215) {
          int discarded$7 = ((kaa) this).field_c.a("<u=" + Integer.toString(var6, 16) + ">" + param0.field_o + "</u>", param0.field_i + param1, param0.field_n + param3, param0.field_m, param0.field_p, var6, -1, ((kaa) this).field_a, ((kaa) this).field_b, ((kaa) this).field_c.field_k + ((kaa) this).field_c.field_w);
          if (param0.b((byte) -34)) {
            var7 = ((kaa) this).field_c.b(param0.field_o);
            var8 = ((kaa) this).field_c.field_k + ((kaa) this).field_c.field_w;
            var9 = param1 + param0.field_i;
            var10 = param3 + param0.field_n;
            if (-3 != ((kaa) this).field_a) {
              if (((kaa) this).field_a == 1) {
                var9 = var9 + (param0.field_m - var7 >> -955317823);
                if (-3 != ((kaa) this).field_b) {
                  if (-2 == ((kaa) this).field_b) {
                    var10 = var10 + (param0.field_p - var8 >> -1746807167);
                    nn.a(var9 - 2, 2 + var10, var8, var7 + 4, false);
                    return;
                  } else {
                    nn.a(var9 - 2, 2 + var10, var8, var7 + 4, false);
                    return;
                  }
                } else {
                  var10 = var10 + (-var8 + param0.field_p);
                  nn.a(var9 - 2, 2 + var10, var8, var7 + 4, false);
                  return;
                }
              } else {
                if (-3 != ((kaa) this).field_b) {
                  if (-2 != ((kaa) this).field_b) {
                    nn.a(var9 - 2, 2 + var10, var8, var7 + 4, false);
                    return;
                  } else {
                    var10 = var10 + (param0.field_p - var8 >> -1746807167);
                    nn.a(var9 - 2, 2 + var10, var8, var7 + 4, false);
                    return;
                  }
                } else {
                  var10 = var10 + (-var8 + param0.field_p);
                  nn.a(var9 - 2, 2 + var10, var8, var7 + 4, false);
                  return;
                }
              }
            } else {
              var9 = var9 + (-var7 + param0.field_m);
              if (-3 != ((kaa) this).field_b) {
                if (-2 != (((kaa) this).field_b ^ -1)) {
                  nn.a(var9 - 2, 2 + var10, var8, var7 + 4, false);
                  return;
                } else {
                  var10 = var10 + (param0.field_p - var8 >> -1746807167);
                  nn.a(var9 - 2, 2 + var10, var8, var7 + 4, false);
                  return;
                }
              } else {
                var10 = var10 + (-var8 + param0.field_p);
                nn.a(var9 - 2, 2 + var10, var8, var7 + 4, false);
                return;
              }
            }
          } else {
            return;
          }
        } else {
          var12 = null;
          byte[] discarded$8 = kaa.a(91, (byte[]) null, 83);
          int discarded$9 = ((kaa) this).field_c.a("<u=" + Integer.toString(var6, 16) + ">" + param0.field_o + "</u>", param0.field_i + param1, param0.field_n + param3, param0.field_m, param0.field_p, var6, -1, ((kaa) this).field_a, ((kaa) this).field_b, ((kaa) this).field_c.field_k + ((kaa) this).field_c.field_w);
          if (param0.b((byte) -34)) {
            var7 = ((kaa) this).field_c.b(param0.field_o);
            var8 = ((kaa) this).field_c.field_k + ((kaa) this).field_c.field_w;
            var9 = param1 + param0.field_i;
            var10 = param3 + param0.field_n;
            if (-3 != ((kaa) this).field_a) {
              if (((kaa) this).field_a == 1) {
                var9 = var9 + (param0.field_m - var7 >> -955317823);
                if (-3 != ((kaa) this).field_b) {
                  if (-2 != ((kaa) this).field_b) {
                    nn.a(var9 - 2, 2 + var10, var8, var7 + 4, false);
                    return;
                  } else {
                    var10 = var10 + (param0.field_p - var8 >> -1746807167);
                    nn.a(var9 - 2, 2 + var10, var8, var7 + 4, false);
                    return;
                  }
                } else {
                  var10 = var10 + (-var8 + param0.field_p);
                  nn.a(var9 - 2, 2 + var10, var8, var7 + 4, false);
                  return;
                }
              } else {
                if (-3 != ((kaa) this).field_b) {
                  if (-2 != ((kaa) this).field_b) {
                    nn.a(var9 - 2, 2 + var10, var8, var7 + 4, false);
                    return;
                  } else {
                    var10 = var10 + (param0.field_p - var8 >> -1746807167);
                    nn.a(var9 - 2, 2 + var10, var8, var7 + 4, false);
                    return;
                  }
                } else {
                  var10 = var10 + (-var8 + param0.field_p);
                  nn.a(var9 - 2, 2 + var10, var8, var7 + 4, false);
                  return;
                }
              }
            } else {
              var9 = var9 + (-var7 + param0.field_m);
              if (-3 != ((kaa) this).field_b) {
                if (-2 != (((kaa) this).field_b ^ -1)) {
                  nn.a(var9 - 2, 2 + var10, var8, var7 + 4, false);
                  return;
                } else {
                  var10 = var10 + (param0.field_p - var8 >> -1746807167);
                  nn.a(var9 - 2, 2 + var10, var8, var7 + 4, false);
                  return;
                }
              } else {
                var10 = var10 + (-var8 + param0.field_p);
                nn.a(var9 - 2, 2 + var10, var8, var7 + 4, false);
                return;
              }
            }
          } else {
            return;
          }
        }
    }

    public kaa() {
        ((kaa) this).field_b = 1;
        ((kaa) this).field_a = 1;
        ((kaa) this).field_c = mj.field_J;
    }

    kaa(il param0, int param1, int param2) {
        ((kaa) this).field_c = param0;
        ((kaa) this).field_a = param1;
        ((kaa) this).field_b = param2;
    }

    static {
    }
}
