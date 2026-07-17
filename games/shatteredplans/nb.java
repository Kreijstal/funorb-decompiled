/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nb {
    static int field_a;
    static String field_c;
    static bi[][] field_d;
    static int[] field_b;

    final static boolean a(char param0, int param1) {
        int var2 = 0;
        var2 = 101 / ((param1 - 30) / 59);
        if (param0 < 32) {
          L0: {
            if (param0 < 160) {
              break L0;
            } else {
              if (param0 > 255) {
                break L0;
              } else {
                return true;
              }
            }
          }
          L1: {
            if (param0 == 8364) {
              break L1;
            } else {
              if (param0 == 338) {
                break L1;
              } else {
                if (param0 == 8212) {
                  break L1;
                } else {
                  if (param0 == 339) {
                    break L1;
                  } else {
                    if (376 == param0) {
                      break L1;
                    } else {
                      return false;
                    }
                  }
                }
              }
            }
          }
          return true;
        } else {
          if (param0 > 126) {
            if (param0 >= 160) {
              if (param0 > 255) {
                L2: {
                  if (param0 == 8364) {
                    break L2;
                  } else {
                    if (param0 == 338) {
                      break L2;
                    } else {
                      if (param0 == 8212) {
                        break L2;
                      } else {
                        if (param0 == 339) {
                          break L2;
                        } else {
                          if (376 == param0) {
                            break L2;
                          } else {
                            return false;
                          }
                        }
                      }
                    }
                  }
                }
                return true;
              } else {
                return true;
              }
            } else {
              if (param0 != 8364) {
                if (param0 != 338) {
                  if (param0 != 8212) {
                    L3: {
                      if (param0 == 339) {
                        break L3;
                      } else {
                        if (376 == param0) {
                          break L3;
                        } else {
                          return false;
                        }
                      }
                    }
                    return true;
                  } else {
                    return true;
                  }
                } else {
                  return true;
                }
              } else {
                return true;
              }
            }
          } else {
            return true;
          }
        }
    }

    public static void a(byte param0) {
        field_d = null;
        if (param0 <= 99) {
          boolean discarded$2 = nb.a('￿', 111);
          field_b = null;
          field_c = null;
          return;
        } else {
          field_b = null;
          field_c = null;
          return;
        }
    }

    final static void a(int param0) {
        String var1 = null;
        if (!el.field_b) {
          throw new IllegalStateException();
        } else {
          if (null != ji.field_G) {
            ji.field_G.i((byte) -104);
            var1 = w.l(0);
            no.field_e = new ri(var1, (String) null, true, false, false);
            le.field_e.a(true, (vg) (Object) ae.field_f);
            ae.field_f.b((vg) (Object) no.field_e, 108);
            ae.field_f.n(7489);
            return;
          } else {
            var1 = w.l(0);
            no.field_e = new ri(var1, (String) null, true, false, false);
            le.field_e.a(true, (vg) (Object) ae.field_f);
            ae.field_f.b((vg) (Object) no.field_e, 108);
            ae.field_f.n(7489);
            return;
          }
        }
    }

    final static byte[] a(String param0, int param1) {
        RuntimeException var2 = null;
        byte[] stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param1 > 94) {
                break L1;
              } else {
                nb.a((byte) -57);
                break L1;
              }
            }
            stackOut_2_0 = ek.field_D.a(true, param0, "");
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var2;
            stackOut_4_1 = new StringBuilder().append("nb.B(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw r.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + param1 + 41);
        }
        return stackIn_3_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Please wait while we search.<br>Games usually start within a minute, provided the server is busy enough.<br><br>The longer you are forced to wait, the earlier in the list of players you are likely to appear.<br><br>If the game doesn't start, click 'Cancel' and then try choosing 'Don't mind' for more options or switching to a busier lobby.";
        field_b = new int[8192];
    }
}
