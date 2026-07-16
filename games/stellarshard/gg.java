/*
 * Decompiled by CFR-JS 0.4.0.
 */
class gg {
    gg field_c;
    static oj field_b;
    long field_j;
    static long field_a;
    static int field_d;
    static int field_i;
    static byte[] field_e;
    static af field_f;
    gg field_g;
    static int[] field_h;

    final static void a(String param0, int param1) {
        df.a(param1 ^ -11, param0);
        we.a(false, param1 + 12660, ul.field_H);
        if (param1 == 97) {
            return;
        }
        gg.b((byte) -95);
    }

    final static String a(String param0, String param1, String param2, int param3) {
        int var4 = 0;
        int var5 = 0;
        String stackIn_5_0 = null;
        String stackIn_6_0 = null;
        String stackOut_4_0 = null;
        L0: {
          var5 = stellarshard.field_B;
          var4 = param0.indexOf(param2);
          if (param3 > 35) {
            break L0;
          } else {
            gg.a(-103, -1, -45, -55, 12);
            break L0;
          }
        }
        L1: while (true) {
          if (var4 != -1) {
            param0 = param0.substring(0, var4) + param1 + param0.substring(var4 - -param2.length());
            stackOut_4_0 = (String) param0;
            stackIn_6_0 = stackOut_4_0;
            stackIn_5_0 = stackOut_4_0;
            if (var5 == 0) {
              var4 = ((String) (Object) stackIn_6_0).indexOf(param2, var4 - -param1.length());
              continue L1;
            } else {
              return stackIn_5_0;
            }
          } else {
            return param0;
          }
        }
    }

    final boolean b(int param0) {
        if (!(((gg) this).field_c != null)) {
            return false;
        }
        if (param0 != 48) {
            field_i = -18;
            return true;
        }
        return true;
    }

    public static void b(byte param0) {
        field_b = null;
        field_f = null;
        field_h = null;
        if (param0 != -127) {
            field_a = 86L;
            field_e = null;
            return;
        }
        field_e = null;
    }

    final void c(int param0) {
        if (((gg) this).field_c == null) {
          return;
        } else {
          ((gg) this).field_c.field_g = ((gg) this).field_g;
          ((gg) this).field_g.field_c = ((gg) this).field_c;
          ((gg) this).field_g = null;
          if (param0 != 20) {
            field_b = null;
            ((gg) this).field_c = null;
            return;
          } else {
            ((gg) this).field_c = null;
            return;
          }
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        int var5 = -112 / ((param0 - -39) / 56);
        kg.d(false);
        ti.a(param4, param2, param1, param3);
    }

    final static String a(CharSequence param0, boolean param1) {
        int var2 = 0;
        char[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        char[] var7 = null;
        char[] var8 = null;
        char[] var9 = null;
        char[] var10 = null;
        L0: {
          var6 = stellarshard.field_B;
          var2 = param0.length();
          if (var2 > 20) {
            var2 = 20;
            break L0;
          } else {
            break L0;
          }
        }
        var10 = new char[var2];
        var9 = var10;
        var8 = var9;
        var7 = var8;
        var3 = var7;
        if (param1) {
          gg.a(-62, 112, -30, 61, -127);
          var4 = 0;
          L1: while (true) {
            L2: {
              if (var2 <= var4) {
                break L2;
              } else {
                L3: {
                  L4: {
                    L5: {
                      var5 = param0.charAt(var4);
                      if (var5 < 65) {
                        break L5;
                      } else {
                        if (var5 <= 90) {
                          break L4;
                        } else {
                          break L5;
                        }
                      }
                    }
                    L6: {
                      L7: {
                        L8: {
                          if (var5 < 97) {
                            break L8;
                          } else {
                            if (var5 <= 122) {
                              break L7;
                            } else {
                              break L8;
                            }
                          }
                        }
                        if (48 > var5) {
                          break L6;
                        } else {
                          if (var5 > 57) {
                            break L6;
                          } else {
                            break L7;
                          }
                        }
                      }
                      var3[var4] = (char)var5;
                      if (var6 == 0) {
                        break L3;
                      } else {
                        break L6;
                      }
                    }
                    var3[var4] = (char)95;
                    break L4;
                  }
                  var3[var4] = (char)(var5 + -65 - -97);
                  break L3;
                }
                var4++;
                if (var6 == 0) {
                  continue L1;
                } else {
                  break L2;
                }
              }
            }
            return new String(var10);
          }
        } else {
          var4 = 0;
          L9: while (true) {
            L10: {
              if (var2 <= var4) {
                break L10;
              } else {
                L11: {
                  L12: {
                    L13: {
                      var5 = param0.charAt(var4);
                      if (var5 < 65) {
                        break L13;
                      } else {
                        if (var5 <= 90) {
                          break L12;
                        } else {
                          break L13;
                        }
                      }
                    }
                    L14: {
                      L15: {
                        L16: {
                          if (var5 < 97) {
                            break L16;
                          } else {
                            if (var5 <= 122) {
                              break L15;
                            } else {
                              break L16;
                            }
                          }
                        }
                        if (48 > var5) {
                          break L14;
                        } else {
                          if (var5 > 57) {
                            break L14;
                          } else {
                            break L15;
                          }
                        }
                      }
                      var3[var4] = (char)var5;
                      if (var6 == 0) {
                        break L11;
                      } else {
                        break L14;
                      }
                    }
                    var3[var4] = (char)95;
                    break L12;
                  }
                  var3[var4] = (char)(var5 + -65 - -97);
                  break L11;
                }
                var4++;
                if (var6 == 0) {
                  continue L9;
                } else {
                  break L10;
                }
              }
            }
            return new String(var10);
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = 1;
        field_f = null;
        field_e = new byte[520];
        field_b = new oj();
        field_h = new int[1024];
    }
}
