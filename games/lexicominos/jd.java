/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jd {
    static String field_b;
    static String field_d;
    static int field_c;
    static int field_a;

    public static void a(byte param0) {
        field_d = null;
        field_b = null;
        if (param0 >= -96) {
            field_c = 109;
        }
    }

    final static void a(java.awt.Canvas param0, int param1) {
        RuntimeException var2 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              r.a((java.awt.Component) ((Object) param0), 20);
              ph.a((java.awt.Component) ((Object) param0), 123);
              if (null != rk.field_c) {
                rk.field_c.a(3, (java.awt.Component) ((Object) param0));
                break L1;
              } else {
                break L1;
              }
            }
            if (param1 == 160) {
              break L0;
            } else {
              field_d = (String) null;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) (var2);
            stackOut_6_1 = new StringBuilder().append("jd.C(");
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ')');
        }
    }

    final static void a(boolean param0, boolean param1, int param2) {
        String var4 = null;
        if (param2 != 37) {
          jd.a((byte) 55);
          var4 = (String) null;
          rb.a((String) null, param1, param0, 14635);
          return;
        } else {
          var4 = (String) null;
          rb.a((String) null, param1, param0, 14635);
          return;
        }
    }

    final static java.awt.Container a(int param0) {
        int var1 = 68 / ((-25 - param0) / 41);
        if (ck.field_d != null) {
            return (java.awt.Container) ((Object) ck.field_d);
        }
        return (java.awt.Container) ((Object) kk.c(-14047));
    }

    final static boolean a(byte param0, char param1) {
        int stackIn_27_0 = 0;
        int stackIn_30_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_26_0 = 0;
        if (param0 == -16) {
          if (param1 < 48) {
            if (param1 < 65) {
              L0: {
                if (97 > param1) {
                  break L0;
                } else {
                  if (122 < param1) {
                    break L0;
                  } else {
                    return true;
                  }
                }
              }
              return false;
            } else {
              if (param1 <= 90) {
                stackOut_28_0 = 1;
                stackIn_30_0 = stackOut_28_0;
                return stackIn_30_0 != 0;
              } else {
                L1: {
                  L2: {
                    if (97 > param1) {
                      break L2;
                    } else {
                      if (122 < param1) {
                        break L2;
                      } else {
                        stackOut_25_0 = 1;
                        stackIn_27_0 = stackOut_25_0;
                        break L1;
                      }
                    }
                  }
                  stackOut_26_0 = 0;
                  stackIn_27_0 = stackOut_26_0;
                  break L1;
                }
                return stackIn_27_0 != 0;
              }
            }
          } else {
            if (param1 > 57) {
              if (param1 >= 65) {
                if (param1 > 90) {
                  if (97 <= param1) {
                    if (122 < param1) {
                      return false;
                    } else {
                      return true;
                    }
                  } else {
                    return false;
                  }
                } else {
                  return true;
                }
              } else {
                if (97 <= param1) {
                  if (122 < param1) {
                    return false;
                  } else {
                    return true;
                  }
                } else {
                  return false;
                }
              }
            } else {
              return true;
            }
          }
        } else {
          return false;
        }
    }

    final static String a(long param0, int param1) {
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        int var3 = 0;
        long var4 = 0L;
        StringBuilder var6 = null;
        long var7 = 0L;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = Lexicominos.field_L ? 1 : 0;
        if (-1L > (param0 ^ -1L)) {
          if ((param0 ^ -1L) > -6582952005840035282L) {
            if ((param0 % (long)param1 ^ -1L) == -1L) {
              return null;
            } else {
              var3 = 0;
              var4 = param0;
              L0: while (true) {
                L1: {
                  if ((var4 ^ -1L) == -1L) {
                    break L1;
                  } else {
                    var3++;
                    var4 = var4 / 37L;
                    if (var11 == 0) {
                      continue L0;
                    } else {
                      break L1;
                    }
                  }
                }
                var6 = new StringBuilder(var3);
                L2: while (true) {
                  L3: {
                    L4: {
                      if (-1L == (param0 ^ -1L)) {
                        break L4;
                      } else {
                        var7 = param0;
                        param0 = param0 / 37L;
                        var9 = jj.field_b[(int)(-(37L * param0) + var7)];
                        if (var11 != 0) {
                          break L3;
                        } else {
                          L5: {
                            if (95 == var9) {
                              var10 = -1 + var6.length();
                              var6.setCharAt(var10, Character.toUpperCase(var6.charAt(var10)));
                              var9 = 160;
                              break L5;
                            } else {
                              break L5;
                            }
                          }
                          discarded$2 = var6.append((char) var9);
                          if (var11 == 0) {
                            continue L2;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                    discarded$3 = var6.reverse();
                    var6.setCharAt(0, Character.toUpperCase(var6.charAt(0)));
                    break L3;
                  }
                  return var6.toString();
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

    static {
        field_a = 0;
        field_d = "Quit to website";
        field_b = "IO error - unable to communicate reliably with the data server. Please check any firewall/antivirus/filtering software.";
    }
}
