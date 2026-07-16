/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bh {
    static long field_c;
    private String field_b;
    static pf field_a;

    final static boolean a(int param0, char param1) {
        if (param0 == -1) {
          if (param1 >= 48) {
            if (param1 > 57) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          boolean discarded$6 = bh.a(98, '<');
          if (param1 >= 48) {
            if (param1 > 57) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    final static String b(byte param0) {
        String var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        String stackIn_9_0 = null;
        String stackIn_19_0 = null;
        String stackIn_26_0 = null;
        String stackIn_36_0 = null;
        String stackOut_25_0 = null;
        String stackOut_35_0 = null;
        String stackOut_8_0 = null;
        String stackOut_18_0 = null;
        var5 = stellarshard.field_B;
        var1 = "(" + ld.field_E + " " + t.field_e + " " + ig.field_y + ") " + ja.field_t;
        if (param0 < -94) {
          if (-1 > (ue.field_b ^ -1)) {
            var1 = var1 + ":";
            var2 = 0;
            L0: while (true) {
              if (var2 < ue.field_b) {
                L1: {
                  stackOut_25_0 = var1 + 32;
                  stackIn_36_0 = stackOut_25_0;
                  stackIn_26_0 = stackOut_25_0;
                  if (var5 != 0) {
                    break L1;
                  } else {
                    L2: {
                      L3: {
                        var1 = stackIn_26_0;
                        var3 = ae.field_N.field_r[var2] & 255;
                        var4 = var3 >> -769738108;
                        var3 = var3 & 15;
                        if (-11 >= (var4 ^ -1)) {
                          break L3;
                        } else {
                          var4 += 48;
                          if (var5 == 0) {
                            break L2;
                          } else {
                            break L3;
                          }
                        }
                      }
                      var4 += 55;
                      break L2;
                    }
                    L4: {
                      L5: {
                        if (var3 < 10) {
                          break L5;
                        } else {
                          var3 += 55;
                          if (var5 == 0) {
                            break L4;
                          } else {
                            break L5;
                          }
                        }
                      }
                      var3 += 48;
                      break L4;
                    }
                    var1 = var1 + (char)var4;
                    var1 = var1 + (char)var3;
                    var2++;
                    if (var5 == 0) {
                      continue L0;
                    } else {
                      stackOut_35_0 = (String) var1;
                      stackIn_36_0 = stackOut_35_0;
                      break L1;
                    }
                  }
                }
                return stackIn_36_0;
              } else {
                return var1;
              }
            }
          } else {
            return var1;
          }
        } else {
          boolean discarded$1 = bh.a(68, '￑');
          if (-1 > (ue.field_b ^ -1)) {
            var1 = var1 + ":";
            var2 = 0;
            L6: while (true) {
              if (var2 < ue.field_b) {
                L7: {
                  stackOut_8_0 = var1 + 32;
                  stackIn_19_0 = stackOut_8_0;
                  stackIn_9_0 = stackOut_8_0;
                  if (var5 != 0) {
                    break L7;
                  } else {
                    L8: {
                      L9: {
                        var1 = stackIn_9_0;
                        var3 = ae.field_N.field_r[var2] & 255;
                        var4 = var3 >> -769738108;
                        var3 = var3 & 15;
                        if (-11 >= (var4 ^ -1)) {
                          break L9;
                        } else {
                          var4 += 48;
                          if (var5 == 0) {
                            break L8;
                          } else {
                            break L9;
                          }
                        }
                      }
                      var4 += 55;
                      break L8;
                    }
                    L10: {
                      L11: {
                        if (var3 < 10) {
                          break L11;
                        } else {
                          var3 += 55;
                          if (var5 == 0) {
                            break L10;
                          } else {
                            break L11;
                          }
                        }
                      }
                      var3 += 48;
                      break L10;
                    }
                    var1 = var1 + (char)var4;
                    var1 = var1 + (char)var3;
                    var2++;
                    if (var5 == 0) {
                      continue L6;
                    } else {
                      stackOut_18_0 = (String) var1;
                      stackIn_19_0 = stackOut_18_0;
                      break L7;
                    }
                  }
                }
                return stackIn_19_0;
              } else {
                return var1;
              }
            }
          } else {
            return var1;
          }
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final boolean a(int param0, String param1) {
        int var3 = 5 / ((-61 - param0) / 44);
        return ((bh) this).field_b.equals((Object) (Object) param1);
    }

    public static void a(byte param0) {
        field_a = null;
        int var1 = 103 / ((param0 - -26) / 44);
    }

    final void a(java.applet.Applet param0, byte param1) {
        if (param1 != 73) {
          field_a = null;
          b.a(((bh) this).field_b, (byte) 38, 31536000L, "jagex-last-login-method", param0);
          return;
        } else {
          b.a(((bh) this).field_b, (byte) 38, 31536000L, "jagex-last-login-method", param0);
          return;
        }
    }

    bh(String param0) {
        ((bh) this).field_b = param0;
    }

    static {
    }
}
