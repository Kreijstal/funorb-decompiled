/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class qc extends qa {
    static ul field_s;
    boolean field_x;
    boolean field_r;
    static int field_q;
    static cj field_u;
    static int field_v;
    static String field_w;
    volatile boolean field_t;

    final static void a(int param0, byte param1, ja[] param2, int param3, int param4) {
        int var5 = 0;
        int var6 = 0;
        L0: {
          L1: {
            var6 = ZombieDawnMulti.field_E ? 1 : 0;
            g.c();
            if (0 != param4) {
              break L1;
            } else {
              param2[param3].a();
              param2[param0].c(0, 0);
              oo.f(0, 0, 24, 24, 0, 128);
              if (0 == 0) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          if (1 == param4) {
            param2[param3].a();
            param2[param0].c(0, 0);
            var5 = 0;
            L2: while (true) {
              if (var5 >= 24) {
                break L0;
              } else {
                oo.b(var5, 0, 24, 0, var5 * 5);
                var5++;
                if (0 == 0) {
                  continue L2;
                } else {
                  break L0;
                }
              }
            }
          } else {
            L3: {
              if ((param4 ^ -1) != -3) {
                break L3;
              } else {
                param2[param3].a();
                param2[param0].c(0, 0);
                var5 = 0;
                L4: while (true) {
                  L5: {
                    if ((var5 ^ -1) <= -25) {
                      break L5;
                    } else {
                      oo.b(var5, 0, 24, 0, -(5 * var5) + 120);
                      var5++;
                      if (0 == 0) {
                        continue L4;
                      } else {
                        break L5;
                      }
                    }
                  }
                  if (0 == 0) {
                    break L0;
                  } else {
                    break L3;
                  }
                }
              }
            }
            L6: {
              if (3 != param4) {
                break L6;
              } else {
                param2[param3].a();
                param2[param0].c(0, 0);
                var5 = 0;
                L7: while (true) {
                  L8: {
                    if (var5 >= 24) {
                      break L8;
                    } else {
                      oo.c(0, var5, 24, 0, var5 * 5);
                      var5++;
                      if (0 == 0) {
                        continue L7;
                      } else {
                        break L8;
                      }
                    }
                  }
                  if (0 == 0) {
                    break L0;
                  } else {
                    break L6;
                  }
                }
              }
            }
            L9: {
              if (-5 != (param4 ^ -1)) {
                break L9;
              } else {
                param2[param3].a();
                param2[param0].c(0, 0);
                var5 = 0;
                L10: while (true) {
                  L11: {
                    if (var5 >= 24) {
                      break L11;
                    } else {
                      oo.c(0, var5, 24, 0, -(5 * var5) + 120);
                      var5++;
                      if (0 == 0) {
                        continue L10;
                      } else {
                        break L11;
                      }
                    }
                  }
                  if (0 == 0) {
                    break L0;
                  } else {
                    break L9;
                  }
                }
              }
            }
            L12: {
              if (-7 != (param4 ^ -1)) {
                break L12;
              } else {
                param2[param3].a();
                param2[param0].c(0, 0);
                var5 = 0;
                L13: while (true) {
                  L14: {
                    if (24 <= var5) {
                      break L14;
                    } else {
                      oo.c(var5 + 1, var5, 24 + -var5, 0, 5 * var5);
                      oo.b(var5, var5, -var5 + 24, 0, var5 * 5);
                      var5++;
                      if (0 == 0) {
                        continue L13;
                      } else {
                        break L14;
                      }
                    }
                  }
                  if (0 == 0) {
                    break L0;
                  } else {
                    break L12;
                  }
                }
              }
            }
            L15: {
              if (-9 != (param4 ^ -1)) {
                break L15;
              } else {
                param2[param3].a();
                param2[param0].c(0, 0);
                var5 = 0;
                L16: while (true) {
                  L17: {
                    if (24 <= var5) {
                      break L17;
                    } else {
                      oo.c(0, var5, var5 - -1, 0, -(var5 * 5) + 120);
                      oo.b(var5, 0, var5, 0, -(5 * var5) + 120);
                      var5++;
                      if (0 == 0) {
                        continue L16;
                      } else {
                        break L17;
                      }
                    }
                  }
                  if (0 == 0) {
                    break L0;
                  } else {
                    break L15;
                  }
                }
              }
            }
            L18: {
              if (7 != param4) {
                break L18;
              } else {
                param2[param3].a();
                param2[param0].c(0, 0);
                var5 = 0;
                L19: while (true) {
                  L20: {
                    if (-25 >= (var5 ^ -1)) {
                      break L20;
                    } else {
                      oo.c(0, var5, 24 - var5, 0, 5 * var5);
                      oo.b(var5, -var5 + 24, var5, 0, -(5 * var5) + 120);
                      var5++;
                      if (0 == 0) {
                        continue L19;
                      } else {
                        break L20;
                      }
                    }
                  }
                  if (0 == 0) {
                    break L0;
                  } else {
                    break L18;
                  }
                }
              }
            }
            if (-6 != (param4 ^ -1)) {
              break L0;
            } else {
              param2[param3].a();
              param2[param0].c(0, 0);
              var5 = 0;
              L21: while (true) {
                L22: {
                  if (var5 >= 24) {
                    break L22;
                  } else {
                    oo.c(-var5 + 24, var5, var5, 0, -(5 * var5) + 120);
                    oo.b(var5, 0, 24 - var5, 0, var5 * 5);
                    var5++;
                    if (0 == 0) {
                      continue L21;
                    } else {
                      break L22;
                    }
                  }
                }
                if (0 == 0) {
                  break L0;
                } else {
                  param2[param3].a();
                  param2[param0].c(0, 0);
                  var5 = 0;
                  L23: while (true) {
                    if (var5 >= 24) {
                      break L0;
                    } else {
                      oo.b(var5, 0, 24, 0, var5 * 5);
                      var5++;
                      if (0 == 0) {
                        continue L23;
                      } else {
                        break L0;
                      }
                    }
                  }
                }
              }
            }
          }
        }
        L24: {
          g.b();
          if (param1 == -126) {
            break L24;
          } else {
            field_q = 122;
            break L24;
          }
        }
    }

    abstract byte[] e(int param0);

    final static void a(br param0, br param1, int param2) {
        if (param2 != 0) {
          return;
        } else {
          L0: {
            if (param0.field_b == null) {
              break L0;
            } else {
              param0.a(true);
              break L0;
            }
          }
          param0.field_b = param1;
          param0.field_d = param1.field_d;
          param0.field_b.field_d = param0;
          param0.field_d.field_b = param0;
          return;
        }
    }

    public static void c(byte param0) {
        field_u = null;
        field_s = null;
        field_w = null;
        if (param0 < 97) {
            qc.c((byte) 22);
        }
    }

    final static String b(byte param0, String param1) {
        int var4 = 0;
        int var5 = ZombieDawnMulti.field_E ? 1 : 0;
        int var2 = param1.length();
        char[] var3 = new char[var2];
        if (param0 != -32) {
            field_u = null;
        }
        for (var4 = 0; var2 > var4; var4++) {
            var3[-var4 + -1 + var2] = param1.charAt(var4);
        }
        return new String(var3);
    }

    abstract int f(int param0);

    qc() {
        ((qc) this).field_t = true;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_w = "Hungry";
    }
}
