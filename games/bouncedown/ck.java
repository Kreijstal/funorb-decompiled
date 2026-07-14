/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ck implements uh {
    static si field_e;
    static int field_b;
    private long field_d;
    static int field_c;
    static String field_f;
    static int field_a;

    public final String c(byte param0) {
        if (((ck) this).b((byte) -127)) {
            return null;
        }
        if (param0 != 66) {
            return null;
        }
        if (350L + ((ck) this).field_d > fa.a(-96)) {
            return null;
        }
        return ((ck) this).a(8335);
    }

    public final vf a(byte param0) {
        if (((ck) this).b((byte) -62)) {
            return ha.field_l;
        }
        if (param0 < 121) {
            field_c = 111;
        }
        if (!((fa.a(81) ^ -1L) <= (((ck) this).field_d - -350L ^ -1L))) {
            return ui.field_o;
        }
        return ((ck) this).b(-1);
    }

    public static void f(byte param0) {
        field_e = null;
        field_f = null;
        if (param0 != -126) {
            ck.e((byte) -40);
        }
    }

    abstract vf b(int param0);

    abstract String a(int param0);

    public final void d(byte param0) {
        if (param0 <= 32) {
            String discarded$0 = ((ck) this).c((byte) 37);
        }
        ((ck) this).field_d = fa.a(-85);
    }

    final static ng a(String param0, String param1, long param2, int param3, boolean param4) {
        if (param3 <= 77) {
            field_e = null;
        }
        if (0L == param2) {
            if (param1 != null) {
                return (ng) (Object) new qe(param1, param0);
            }
        }
        if (param4) {
            return (ng) (Object) new ek(param2, param0);
        }
        return (ng) (Object) new ji(param2, param0);
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        var13 = Bounce.field_N;
        if (param4 == 14677) {
          L0: {
            var5 = param2 + param0;
            var6 = param3 + param1;
            if (na.field_g < param0) {
              stackOut_4_0 = param0;
              stackIn_5_0 = stackOut_4_0;
              break L0;
            } else {
              stackOut_3_0 = na.field_g;
              stackIn_5_0 = stackOut_3_0;
              break L0;
            }
          }
          L1: {
            var7 = stackIn_5_0;
            if (na.field_i < param3) {
              stackOut_7_0 = param3;
              stackIn_8_0 = stackOut_7_0;
              break L1;
            } else {
              stackOut_6_0 = na.field_i;
              stackIn_8_0 = stackOut_6_0;
              break L1;
            }
          }
          L2: {
            var8 = stackIn_8_0;
            if (na.field_b > var5) {
              stackOut_10_0 = var5;
              stackIn_11_0 = stackOut_10_0;
              break L2;
            } else {
              stackOut_9_0 = na.field_b;
              stackIn_11_0 = stackOut_9_0;
              break L2;
            }
          }
          L3: {
            var9 = stackIn_11_0;
            if (na.field_f <= var6) {
              stackOut_13_0 = na.field_f;
              stackIn_14_0 = stackOut_13_0;
              break L3;
            } else {
              stackOut_12_0 = var6;
              stackIn_14_0 = stackOut_12_0;
              break L3;
            }
          }
          L4: {
            var10 = stackIn_14_0;
            if (param0 < na.field_g) {
              break L4;
            } else {
              if (param0 < na.field_b) {
                var11 = var8 * na.field_e + param0;
                var12 = -var8 + (var10 + 1) >> -1702053183;
                L5: while (true) {
                  var12--;
                  if ((var12 ^ -1) > -1) {
                    break L4;
                  } else {
                    na.field_d[var11] = 16777215;
                    var11 = var11 + 2 * na.field_e;
                    continue L5;
                  }
                }
              } else {
                break L4;
              }
            }
          }
          L6: {
            if (na.field_i > param3) {
              break L6;
            } else {
              if (na.field_f > var6) {
                var11 = na.field_e * param3 - -var7;
                var12 = var9 + 1 - var7 >> -914102335;
                L7: while (true) {
                  var12--;
                  if ((var12 ^ -1) > -1) {
                    break L6;
                  } else {
                    na.field_d[var11] = 16777215;
                    var11 += 2;
                    continue L7;
                  }
                }
              } else {
                break L6;
              }
            }
          }
          L8: {
            if (var5 < na.field_g) {
              break L8;
            } else {
              if (var5 >= na.field_b) {
                break L8;
              } else {
                var11 = ((-param0 + var5 & 1) + var8) * na.field_e + var5;
                var12 = -var8 + 1 + var10 >> -737859103;
                L9: while (true) {
                  var12--;
                  if ((var12 ^ -1) > -1) {
                    break L8;
                  } else {
                    na.field_d[var11] = 16777215;
                    var11 = var11 + 2 * na.field_e;
                    continue L9;
                  }
                }
              }
            }
          }
          L10: {
            if (param3 < na.field_i) {
              break L10;
            } else {
              if (var6 >= na.field_f) {
                break L10;
              } else {
                var11 = (var6 + -param3 & 1) + var6 * na.field_e - -var7;
                var12 = -var7 + var9 + 1 >> -1305427967;
                L11: while (true) {
                  var12--;
                  if (-1 < (var12 ^ -1)) {
                    break L10;
                  } else {
                    na.field_d[var11] = 16777215;
                    var11 += 2;
                    continue L11;
                  }
                }
              }
            }
          }
          return;
        } else {
          return;
        }
    }

    final static boolean g(byte param0) {
        int var1 = -62 / ((49 - param0) / 62);
        return !pb.field_k.a(1000) ? true : false;
    }

    final static void e(byte param0) {
        d.a(ej.field_b, true, eb.field_z, 0);
        va.field_f = true;
        int var1 = -3 % ((param0 - 28) / 62);
    }

    final static String a(int param0, CharSequence param1) {
        int var2 = 0;
        char[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        char[] var7 = null;
        char[] var8 = null;
        L0: {
          var6 = Bounce.field_N;
          var2 = param1.length();
          if (20 >= var2) {
            break L0;
          } else {
            var2 = 20;
            break L0;
          }
        }
        L1: {
          var8 = new char[var2];
          var7 = var8;
          var3 = var7;
          if (param0 <= -57) {
            break L1;
          } else {
            ck.a(18, -113, 56, 101, 46);
            break L1;
          }
        }
        var4 = 0;
        L2: while (true) {
          if (var4 >= var2) {
            return new String(var8);
          } else {
            L3: {
              var5 = param1.charAt(var4);
              if (var5 < 65) {
                break L3;
              } else {
                if (var5 <= 90) {
                  var3[var4] = (char)(-65 + (var5 + 97));
                  var4++;
                  continue L2;
                } else {
                  break L3;
                }
              }
            }
            L4: {
              L5: {
                if (var5 < 97) {
                  break L5;
                } else {
                  if (var5 <= 122) {
                    break L4;
                  } else {
                    break L5;
                  }
                }
              }
              L6: {
                if (var5 < 48) {
                  break L6;
                } else {
                  if (var5 <= 57) {
                    break L4;
                  } else {
                    break L6;
                  }
                }
              }
              var3[var4] = (char)95;
              var4++;
              continue L2;
            }
            var3[var4] = (char)var5;
            var4++;
            continue L2;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = -1;
        field_c = -1;
        field_f = "Play free version";
        field_a = 0;
    }
}
