/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class hi {
    bk[] field_c;
    static double[] field_d;
    static String field_b;
    static boolean field_a;

    final static sj a(String param0, byte param1) {
        if (param1 == -80) {
          if (pi.field_a != ll.field_C) {
            L0: {
              if (pi.field_a != ik.field_d) {
                break L0;
              } else {
                if (param0.equals((Object) (Object) ak.field_b)) {
                  pi.field_a = fk.field_Q;
                  return pm.field_f;
                } else {
                  break L0;
                }
              }
            }
            pi.field_a = ll.field_C;
            pm.field_f = null;
            ak.field_b = param0;
            return null;
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    final int a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        bk var6 = null;
        int var7 = 0;
        int var8 = 0;
        L0: {
          var8 = TetraLink.field_J;
          if (((hi) this).field_c == null) {
            break L0;
          } else {
            if (0 == ((hi) this).field_c.length) {
              break L0;
            } else {
              if (((hi) this).field_c[0].field_h > param1) {
                break L0;
              } else {
                if (param1 <= ((hi) this).field_c[((hi) this).field_c.length - 1].field_a) {
                  L1: {
                    if (param2 == 12024) {
                      break L1;
                    } else {
                      ((hi) this).field_c = null;
                      break L1;
                    }
                  }
                  if (1 != ((hi) this).field_c.length) {
                    var4 = 0;
                    var5 = 0;
                    L2: while (true) {
                      if (var5 >= ((hi) this).field_c.length) {
                        return -1;
                      } else {
                        L3: {
                          var6 = ((hi) this).field_c[var5];
                          if (param1 < var6.field_h) {
                            break L3;
                          } else {
                            if (param1 <= var6.field_a) {
                              var7 = var6.a((byte) 118, param0);
                              if (var7 != -1) {
                                return var7 + var4;
                              } else {
                                return -1;
                              }
                            } else {
                              break L3;
                            }
                          }
                        }
                        var4 = var4 + (var6.field_j.length - 1);
                        var5++;
                        continue L2;
                      }
                    }
                  } else {
                    return ((hi) this).field_c[0].a((byte) 109, param0);
                  }
                } else {
                  return -1;
                }
              }
            }
          }
        }
        return -1;
    }

    final int b(byte param0) {
        int var2 = 0;
        bk[] var3 = null;
        int var4 = 0;
        bk var5 = null;
        int var6 = 0;
        int var7 = 0;
        L0: {
          var7 = TetraLink.field_J;
          var2 = -1;
          if (param0 >= 29) {
            break L0;
          } else {
            field_d = null;
            break L0;
          }
        }
        L1: {
          if (((hi) this).field_c == null) {
            break L1;
          } else {
            var3 = ((hi) this).field_c;
            var4 = 0;
            L2: while (true) {
              if (var4 >= var3.length) {
                break L1;
              } else {
                var5 = var3[var4];
                if (var5 != null) {
                  var6 = var5.a((byte) -41);
                  if (var2 < var6) {
                    var2 = var6;
                    var4++;
                    continue L2;
                  } else {
                    var4++;
                    continue L2;
                  }
                } else {
                  var4++;
                  continue L2;
                }
              }
            }
          }
        }
        return var2;
    }

    final int a(int param0, boolean param1) {
        int var4 = 0;
        bk var5 = null;
        int var6 = TetraLink.field_J;
        bk[] var8 = ((hi) this).field_c;
        bk[] var3 = var8;
        if (!param1) {
            Object var7 = null;
            String[] discarded$0 = hi.a((String) null, 'ﾎ', 23);
        }
        for (var4 = 0; var4 < var8.length; var4++) {
            var5 = var8[var4];
            if (!(var5.field_j.length <= param0)) {
                return var5.field_j[param0];
            }
            param0 = param0 - (var5.field_j.length + -1);
        }
        return 0;
    }

    final int a(int param0, int param1) {
        int var3 = 0;
        bk var4 = null;
        int var5 = TetraLink.field_J;
        for (var3 = 0; ((hi) this).field_c.length > var3; var3++) {
            var4 = ((hi) this).field_c[var3];
            if (!(param0 >= var4.field_j.length)) {
                return var3;
            }
            param0 = param0 - (var4.field_j.length - 1);
        }
        if (param1 < 94) {
            int discarded$0 = ((hi) this).a(-30, -101);
        }
        return ((hi) this).field_c.length;
    }

    final static String[] a(String param0, char param1, int param2) {
        int var7 = 0;
        int var8 = 0;
        int var9 = TetraLink.field_J;
        CharSequence var10 = (CharSequence) (Object) param0;
        int var3 = en.a(param2 + -663, param1, var10);
        String[] var4 = new String[var3 + 1];
        int var5 = 0;
        if (param2 != 783) {
            return null;
        }
        int var6 = 0;
        for (var7 = 0; var3 > var7; var7++) {
            for (var8 = var6; param1 != param0.charAt(var8); var8++) {
            }
            int incrementValue$0 = var5;
            var5++;
            var4[incrementValue$0] = param0.substring(var6, var8);
            var6 = var8 - -1;
        }
        var4[var3] = param0.substring(var6);
        return var4;
    }

    final static void b(int param0) {
        io.field_h.setLength(0);
        sf.field_d = 0;
        if (param0 >= -33) {
            field_d = null;
        }
    }

    public static void a(byte param0) {
        field_d = null;
        if (param0 <= 55) {
            return;
        }
        field_b = null;
    }

    final static void a(int param0) {
        int var1 = -124 % ((-60 - param0) / 55);
        kb.a(false, rh.field_F);
    }

    final int a(boolean param0) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0) {
            break L0;
          } else {
            field_a = false;
            break L0;
          }
        }
        L1: {
          L2: {
            if (((hi) this).field_c == null) {
              break L2;
            } else {
              if (0 >= ((hi) this).field_c.length) {
                break L2;
              } else {
                stackOut_4_0 = ((hi) this).field_c[((hi) this).field_c.length + -1].field_a - ((hi) this).field_c[0].field_h;
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            }
          }
          stackOut_5_0 = 0;
          stackIn_6_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_6_0;
    }

    final int a(int param0, byte param1, int param2, String param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        var10 = TetraLink.field_J;
        var5 = 0;
        var6 = 0;
        var7 = param3.length();
        var8 = 0;
        L0: while (true) {
          if (var7 <= var8) {
            if (-1 > (var5 ^ -1)) {
              return (-param0 + param2 << -429032664) / var5;
            } else {
              if (param1 == -126) {
                return 0;
              } else {
                return -18;
              }
            }
          } else {
            var9 = param3.charAt(var8);
            if (var9 == 60) {
              var6 = 1;
              var8++;
              continue L0;
            } else {
              if (62 != var9) {
                if (var6 == 0) {
                  if (var9 == 32) {
                    var5++;
                    var8++;
                    continue L0;
                  } else {
                    var8++;
                    continue L0;
                  }
                } else {
                  var8++;
                  continue L0;
                }
              } else {
                var6 = 0;
                var8++;
                continue L0;
              }
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Drawn";
        field_a = false;
    }
}
