/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class af {
    static String[] field_c;
    static String field_b;
    static o field_a;
    fg[] field_d;
    static int field_e;

    final int a(int param0, String param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        var10 = wizardrun.field_H;
        if (param2 == 6454) {
          var5 = 0;
          var6 = 0;
          var7 = param1.length();
          var8 = 0;
          L0: while (true) {
            if (var8 >= var7) {
              if (0 >= var5) {
                return 0;
              } else {
                return (-param0 + param3 << 1204348264) / var5;
              }
            } else {
              var9 = param1.charAt(var8);
              if (var9 == 60) {
                var6 = 1;
                var8++;
                continue L0;
              } else {
                if (var9 != 62) {
                  if (var6 == 0) {
                    if (32 == var9) {
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
        } else {
          return 111;
        }
    }

    final static boolean a(CharSequence param0, byte param1) {
        if (param1 != 78) {
            field_e = 119;
        }
        return ga.a(param0, 10, 58, true);
    }

    final int a(int param0) {
        int var2 = 0;
        fg[] var3 = null;
        int var4 = 0;
        fg var5 = null;
        int var6 = 0;
        int var7 = 0;
        L0: {
          var7 = wizardrun.field_H;
          if (param0 <= -109) {
            break L0;
          } else {
            af.a(false);
            break L0;
          }
        }
        L1: {
          var2 = -1;
          if (null != ((af) this).field_d) {
            var3 = ((af) this).field_d;
            var4 = 0;
            L2: while (true) {
              if (var4 >= var3.length) {
                break L1;
              } else {
                var5 = var3[var4];
                if (var5 != null) {
                  var6 = var5.a(0);
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
          } else {
            break L1;
          }
        }
        return var2;
    }

    final int a(int param0, int param1) {
        int var4 = 0;
        fg var5 = null;
        int var6 = wizardrun.field_H;
        fg[] var7 = ((af) this).field_d;
        fg[] var3 = var7;
        for (var4 = 0; var7.length > var4; var4++) {
            var5 = var7[var4];
            if (param1 < var5.field_e.length) {
                return var5.field_e[param1];
            }
            param1 = param1 - (-1 + var5.field_e.length);
        }
        if (param0 != 62) {
            field_c = null;
            return 0;
        }
        return 0;
    }

    public static void a(boolean param0) {
        field_c = null;
        if (param0) {
            Object var2 = null;
            boolean discarded$0 = af.a((CharSequence) null, (byte) 104);
        }
        field_b = null;
        field_a = null;
    }

    final int a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        fg var6 = null;
        int var7 = 0;
        int var8 = 0;
        L0: {
          var8 = wizardrun.field_H;
          if (((af) this).field_d == null) {
            break L0;
          } else {
            if (((af) this).field_d.length == 0) {
              break L0;
            } else {
              if (param2 >= ((af) this).field_d[0].field_a) {
                if (((af) this).field_d[-1 + ((af) this).field_d.length].field_b < param2) {
                  return -1;
                } else {
                  if (-2 == (((af) this).field_d.length ^ -1)) {
                    return ((af) this).field_d[0].a(-1, param0);
                  } else {
                    if (param1 > 104) {
                      var4 = 0;
                      var5 = 0;
                      L1: while (true) {
                        if (var5 >= ((af) this).field_d.length) {
                          return -1;
                        } else {
                          L2: {
                            var6 = ((af) this).field_d[var5];
                            if (var6.field_a > param2) {
                              break L2;
                            } else {
                              if (param2 > var6.field_b) {
                                break L2;
                              } else {
                                var7 = var6.a(-1, param0);
                                if (-1 != var7) {
                                  return var7 + var4;
                                } else {
                                  return -1;
                                }
                              }
                            }
                          }
                          var4 = var4 + (var6.field_e.length + -1);
                          var5++;
                          continue L1;
                        }
                      }
                    } else {
                      return -9;
                    }
                  }
                }
              } else {
                break L0;
              }
            }
          }
        }
        return -1;
    }

    final int a(byte param0, int param1) {
        fg var4 = null;
        int var5 = wizardrun.field_H;
        int var3 = 0;
        if (param0 < 86) {
            Object var6 = null;
            boolean discarded$0 = af.a((CharSequence) null, (byte) -48);
        }
        while (var3 < ((af) this).field_d.length) {
            var4 = ((af) this).field_d[var3];
            if (param1 < var4.field_e.length) {
                return var3;
            }
            param1 = param1 - (-1 + var4.field_e.length);
            var3++;
        }
        return ((af) this).field_d.length;
    }

    final int b(int param0) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        if (param0 > 1) {
          L0: {
            L1: {
              if (((af) this).field_d == null) {
                break L1;
              } else {
                if ((((af) this).field_d.length ^ -1) >= -1) {
                  break L1;
                } else {
                  stackOut_4_0 = ((af) this).field_d[-1 + ((af) this).field_d.length].field_b + -((af) this).field_d[0].field_a;
                  stackIn_6_0 = stackOut_4_0;
                  break L0;
                }
              }
            }
            stackOut_5_0 = 0;
            stackIn_6_0 = stackOut_5_0;
            break L0;
          }
          return stackIn_6_0;
        } else {
          return -35;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "You have not yet submitted";
        field_c = new String[]{"Waiting for text", "Warte auf Text", "En attente du texte", "Aguardando textos", "Op tekst wachten", "Esperando a texto"};
        field_e = 20;
    }
}
