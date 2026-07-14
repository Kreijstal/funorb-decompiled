/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hf {
    int field_f;
    String field_e;
    String field_b;
    static volatile boolean field_a;
    um field_c;
    static int field_g;
    String field_d;

    final static boolean a(boolean param0, CharSequence param1, int param2, int param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        var12 = Chess.field_G;
        var4 = 66 / ((param2 - 78) / 40);
        if (2 <= param3) {
          if (param3 <= 36) {
            var5 = 0;
            var6 = 0;
            var7 = 0;
            var8 = param1.length();
            var9 = 0;
            L0: while (true) {
              if (var8 > var9) {
                L1: {
                  var10 = param1.charAt(var9);
                  if (var9 != 0) {
                    break L1;
                  } else {
                    if (var10 == 45) {
                      var5 = 1;
                      var9++;
                      continue L0;
                    } else {
                      if (var10 != 43) {
                        break L1;
                      } else {
                        if (!param0) {
                          break L1;
                        } else {
                          var9++;
                          continue L0;
                        }
                      }
                    }
                  }
                }
                L2: {
                  L3: {
                    if (var10 < 48) {
                      break L3;
                    } else {
                      if (var10 > 57) {
                        break L3;
                      } else {
                        var10 -= 48;
                        break L2;
                      }
                    }
                  }
                  L4: {
                    if (var10 < 65) {
                      break L4;
                    } else {
                      if (var10 > 90) {
                        break L4;
                      } else {
                        var10 -= 55;
                        break L2;
                      }
                    }
                  }
                  L5: {
                    if (var10 < 97) {
                      break L5;
                    } else {
                      if (var10 > 122) {
                        break L5;
                      } else {
                        var10 -= 87;
                        break L2;
                      }
                    }
                  }
                  return false;
                }
                if (param3 <= var10) {
                  return false;
                } else {
                  L6: {
                    if (var5 == 0) {
                      break L6;
                    } else {
                      var10 = -var10;
                      break L6;
                    }
                  }
                  var11 = var7 * param3 - -var10;
                  if (var11 / param3 == var7) {
                    var6 = 1;
                    var7 = var11;
                    var9++;
                    continue L0;
                  } else {
                    return false;
                  }
                }
              } else {
                return var6 != 0;
              }
            }
          } else {
            throw new IllegalArgumentException("" + param3);
          }
        } else {
          throw new IllegalArgumentException("" + param3);
        }
    }

    final static int a(int param0, int param1, int param2) {
        int var3 = 0;
        if (param1 != 1022407519) {
          field_a = true;
          var3 = param0 >>> 1022407519;
          return (var3 + param0) / param2 - var3;
        } else {
          var3 = param0 >>> 1022407519;
          return (var3 + param0) / param2 - var3;
        }
    }

    final static String a(int param0, int param1, String param2) {
        int var4 = 0;
        nk var5 = null;
        nk var6 = null;
        nk var7 = null;
        CharSequence var8 = null;
        var8 = (CharSequence) (Object) param2;
        if (!ed.a(var8, 21257)) {
          return qj.field_a;
        } else {
          if ((ld.field_g ^ -1) != -3) {
            return tf.field_k;
          } else {
            if (qd.a((byte) 13, param2)) {
              return ed.field_a;
            } else {
              if (!ah.a(param2, 54)) {
                if (100 <= wg.field_w) {
                  if (-1 > (cl.field_d ^ -1)) {
                    if ((wg.field_w ^ -1) <= -201) {
                      return df.field_c;
                    } else {
                      if (va.a(param2, -19554)) {
                        return oc.a(uh.field_n, new String[1], (byte) -42);
                      } else {
                        var7 = qn.field_U;
                        var5 = var7;
                        var7.f(param0, -88);
                        var7.field_l = var7.field_l + 1;
                        var4 = var7.field_l;
                        if (param1 <= 72) {
                          return null;
                        } else {
                          var7.c(0, (byte) -115);
                          var7.a(-113, param2);
                          var7.a(-var4 + var7.field_l, -1);
                          return null;
                        }
                      }
                    }
                  } else {
                    return df.field_c;
                  }
                } else {
                  if ((wg.field_w ^ -1) <= -201) {
                    return df.field_c;
                  } else {
                    if (va.a(param2, -19554)) {
                      return oc.a(uh.field_n, new String[1], (byte) -42);
                    } else {
                      var6 = qn.field_U;
                      var6.f(param0, -88);
                      var6.field_l = var6.field_l + 1;
                      var4 = var6.field_l;
                      if (param1 <= 72) {
                        return null;
                      } else {
                        var6.c(0, (byte) -115);
                        var6.a(-113, param2);
                        var6.a(-var4 + var6.field_l, -1);
                        return null;
                      }
                    }
                  }
                }
              } else {
                return oc.a(i.field_b, new String[1], (byte) -108);
              }
            }
          }
        }
    }

    private hf() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = false;
        field_g = 0;
    }
}
