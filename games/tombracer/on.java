/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class on {
    private boolean field_c;
    private boolean field_a;
    static mr field_b;

    final void a(byte param0) {
        ((on) this).field_a = true;
        int var2 = -27 / ((55 - param0) / 56);
    }

    final boolean b(int param0) {
        if (param0 != -59) {
            boolean discarded$0 = ((on) this).b(-10);
        }
        return ((on) this).field_c;
    }

    public static void d(int param0) {
        if (param0 != 32) {
            return;
        }
        field_b = null;
    }

    final void c(int param0) {
        ((on) this).field_a = true;
        if (param0 > -18) {
            return;
        }
        ((on) this).field_c = true;
    }

    final static ha a(java.awt.Canvas param0, d param1, int param2, byte param3) {
        if (param3 >= -76) {
            return null;
        }
        return (ha) (Object) new cka(param0, param1, param2);
    }

    final void a(int param0) {
        if (param0 != 86) {
            return;
        }
        if (!((on) this).field_a) {
            ((on) this).field_c = false;
        }
        ((on) this).field_a = false;
    }

    final void b(byte param0) {
        ((on) this).field_a = false;
        ((on) this).field_c = false;
        if (param0 != 93) {
            ((on) this).field_a = true;
        }
    }

    final static String a(CharSequence param0, byte param1, boolean param2) {
        String var3 = null;
        int var4 = 0;
        int var5 = 0;
        Object var6 = null;
        var5 = TombRacer.field_G ? 1 : 0;
        var3 = mpa.a(-73, param2, param0);
        if (var3 == null) {
          L0: {
            if (param1 <= -37) {
              break L0;
            } else {
              var6 = null;
              ha discarded$2 = on.a((java.awt.Canvas) null, (d) null, 122, (byte) 69);
              break L0;
            }
          }
          var4 = 0;
          L1: while (true) {
            if (var4 < param0.length()) {
              if (!fqa.a(false, param0.charAt(var4))) {
                return jra.field_b;
              } else {
                var4++;
                continue L1;
              }
            } else {
              return null;
            }
          }
        } else {
          return var3;
        }
    }

    final static boolean a(byte param0, int param1) {
        int stackIn_26_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_25_0 = 0;
        L0: {
          if (param0 == 15) {
            break L0;
          } else {
            on.d(119);
            break L0;
          }
        }
        L1: {
          L2: {
            if (oj.field_tb[82]) {
              break L2;
            } else {
              if (oj.field_tb[86]) {
                break L2;
              } else {
                L3: {
                  L4: {
                    if (param1 > -17) {
                      break L4;
                    } else {
                      if (27 >= param1) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                  L5: {
                    if (param1 < 32) {
                      break L5;
                    } else {
                      if (-44 >= param1) {
                        break L3;
                      } else {
                        break L5;
                      }
                    }
                  }
                  L6: {
                    if (-49 < param1) {
                      break L6;
                    } else {
                      if (-59 >= param1) {
                        break L3;
                      } else {
                        break L6;
                      }
                    }
                  }
                  L7: {
                    if (64 > param1) {
                      break L7;
                    } else {
                      if (73 >= param1) {
                        break L3;
                      } else {
                        break L7;
                      }
                    }
                  }
                  if (-81 == param1) {
                    break L3;
                  } else {
                    if (param1 == 83) {
                      break L3;
                    } else {
                      if (-85 == param1) {
                        break L3;
                      } else {
                        if ((param1 ^ -1) == -86) {
                          break L3;
                        } else {
                          if ((param1 ^ -1) == -60) {
                            break L3;
                          } else {
                            if ((param1 ^ -1) == -75) {
                              break L3;
                            } else {
                              if ((param1 ^ -1) != -29) {
                                break L2;
                              } else {
                                break L3;
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
                stackOut_24_0 = 1;
                stackIn_26_0 = stackOut_24_0;
                break L1;
              }
            }
          }
          stackOut_25_0 = 0;
          stackIn_26_0 = stackOut_25_0;
          break L1;
        }
        return stackIn_26_0 != 0;
    }

    static {
    }
}
