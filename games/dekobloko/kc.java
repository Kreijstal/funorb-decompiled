/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class kc extends bh {
    int field_v;
    String[][] field_r;
    int field_n;
    int field_o;
    int[][] field_u;
    boolean field_p;
    long[][] field_t;
    static String field_s;
    static String field_q;

    final static void b(int param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = client.field_A ? 1 : 0;
        var2 = 0;
        var3 = gd.field_e;
        if (var3 >= 5) {
          if (var3 >= 105) {
            L0: {
              if (120 <= var3) {
                break L0;
              } else {
                var3 = -var3 + 120;
                var2 = -(var3 * var3 * 8192 / 3300) + 8192;
                break L0;
              }
            }
            if (param0 == 8192) {
              L1: {
                var4 = 1;
                var5 = 0;
                if (param1 != 1) {
                  break L1;
                } else {
                  var5 = 1;
                  break L1;
                }
              }
              L2: {
                if (param1 == 3) {
                  var4 = -1;
                  break L2;
                } else {
                  break L2;
                }
              }
              L3: {
                if (param1 == 4) {
                  var4 = 1;
                  var5 = 1;
                  break L3;
                } else {
                  break L3;
                }
              }
              L4: {
                if (param1 == 5) {
                  var4 = -1;
                  var5 = 1;
                  break L4;
                } else {
                  break L4;
                }
              }
              L5: {
                if (param1 == 6) {
                  var4 = 1;
                  var5 = -1;
                  break L5;
                } else {
                  break L5;
                }
              }
              L6: {
                L7: {
                  if (param1 == 7) {
                    break L7;
                  } else {
                    if (8 == param1) {
                      break L7;
                    } else {
                      break L6;
                    }
                  }
                }
                var4 = -1;
                var5 = -1;
                break L6;
              }
              L8: {
                if (11 == param1) {
                  var4 = -1;
                  break L8;
                } else {
                  break L8;
                }
              }
              L9: {
                if (param1 == 12) {
                  var4 = -1;
                  var5 = -1;
                  break L9;
                } else {
                  break L9;
                }
              }
              L10: {
                if (13 != param1) {
                  break L10;
                } else {
                  var5 = -1;
                  var4 = 1;
                  break L10;
                }
              }
              L11: {
                if (14 == param1) {
                  var5 = 1;
                  var4 = -1;
                  break L11;
                } else {
                  break L11;
                }
              }
              L12: {
                if (15 != param1) {
                  break L12;
                } else {
                  var4 = 1;
                  var5 = 1;
                  break L12;
                }
              }
              o.field_e = em.a(var5 * var2, var2 * var4, (byte) 90);
              return;
            } else {
              return;
            }
          } else {
            var2 = (-40960 + 16384 * var3) / 220;
            if (param0 == 8192) {
              L13: {
                var4 = 1;
                var5 = 0;
                if (param1 != 1) {
                  break L13;
                } else {
                  var5 = 1;
                  break L13;
                }
              }
              L14: {
                if (param1 == 3) {
                  var4 = -1;
                  break L14;
                } else {
                  break L14;
                }
              }
              L15: {
                if (param1 == 4) {
                  var4 = 1;
                  var5 = 1;
                  break L15;
                } else {
                  break L15;
                }
              }
              L16: {
                if (param1 == 5) {
                  var4 = -1;
                  var5 = 1;
                  break L16;
                } else {
                  break L16;
                }
              }
              L17: {
                if (param1 == 6) {
                  var4 = 1;
                  var5 = -1;
                  break L17;
                } else {
                  break L17;
                }
              }
              L18: {
                L19: {
                  if (param1 == 7) {
                    break L19;
                  } else {
                    if (8 == param1) {
                      break L19;
                    } else {
                      break L18;
                    }
                  }
                }
                var4 = -1;
                var5 = -1;
                break L18;
              }
              L20: {
                if (11 == param1) {
                  var4 = -1;
                  break L20;
                } else {
                  break L20;
                }
              }
              L21: {
                if (param1 == 12) {
                  var4 = -1;
                  var5 = -1;
                  break L21;
                } else {
                  break L21;
                }
              }
              L22: {
                if (13 != param1) {
                  break L22;
                } else {
                  var5 = -1;
                  var4 = 1;
                  break L22;
                }
              }
              L23: {
                if (14 == param1) {
                  var5 = 1;
                  var4 = -1;
                  break L23;
                } else {
                  break L23;
                }
              }
              L24: {
                if (15 != param1) {
                  break L24;
                } else {
                  var4 = 1;
                  var5 = 1;
                  break L24;
                }
              }
              o.field_e = em.a(var5 * var2, var2 * var4, (byte) 90);
              return;
            } else {
              return;
            }
          }
        } else {
          var2 = 8192 * (var3 * var3) / 1100;
          if (param0 == 8192) {
            L25: {
              var4 = 1;
              var5 = 0;
              if (param1 != 1) {
                break L25;
              } else {
                var5 = 1;
                break L25;
              }
            }
            L26: {
              if (param1 == 3) {
                var4 = -1;
                break L26;
              } else {
                break L26;
              }
            }
            L27: {
              if (param1 == 4) {
                var4 = 1;
                var5 = 1;
                break L27;
              } else {
                break L27;
              }
            }
            L28: {
              if (param1 == 5) {
                var4 = -1;
                var5 = 1;
                break L28;
              } else {
                break L28;
              }
            }
            L29: {
              if (param1 == 6) {
                var4 = 1;
                var5 = -1;
                break L29;
              } else {
                break L29;
              }
            }
            if (param1 != 7) {
              if (8 != param1) {
                L30: {
                  if (11 == param1) {
                    var4 = -1;
                    break L30;
                  } else {
                    break L30;
                  }
                }
                L31: {
                  if (param1 == 12) {
                    var4 = -1;
                    var5 = -1;
                    break L31;
                  } else {
                    break L31;
                  }
                }
                L32: {
                  if (13 != param1) {
                    break L32;
                  } else {
                    var5 = -1;
                    var4 = 1;
                    break L32;
                  }
                }
                L33: {
                  if (14 == param1) {
                    var5 = 1;
                    var4 = -1;
                    break L33;
                  } else {
                    break L33;
                  }
                }
                L34: {
                  if (15 != param1) {
                    break L34;
                  } else {
                    var4 = 1;
                    var5 = 1;
                    break L34;
                  }
                }
                o.field_e = em.a(var5 * var2, var2 * var4, (byte) 90);
                return;
              } else {
                L35: {
                  var4 = -1;
                  var5 = -1;
                  if (11 == param1) {
                    var4 = -1;
                    break L35;
                  } else {
                    break L35;
                  }
                }
                L36: {
                  if (param1 == 12) {
                    var4 = -1;
                    var5 = -1;
                    break L36;
                  } else {
                    break L36;
                  }
                }
                L37: {
                  if (13 != param1) {
                    break L37;
                  } else {
                    var5 = -1;
                    var4 = 1;
                    break L37;
                  }
                }
                L38: {
                  if (14 == param1) {
                    var5 = 1;
                    var4 = -1;
                    break L38;
                  } else {
                    break L38;
                  }
                }
                L39: {
                  if (15 != param1) {
                    break L39;
                  } else {
                    var4 = 1;
                    var5 = 1;
                    break L39;
                  }
                }
                o.field_e = em.a(var5 * var2, var2 * var4, (byte) 90);
                return;
              }
            } else {
              L40: {
                var4 = -1;
                var5 = -1;
                if (11 == param1) {
                  var4 = -1;
                  break L40;
                } else {
                  break L40;
                }
              }
              L41: {
                if (param1 == 12) {
                  var4 = -1;
                  var5 = -1;
                  break L41;
                } else {
                  break L41;
                }
              }
              L42: {
                if (13 != param1) {
                  break L42;
                } else {
                  var5 = -1;
                  var4 = 1;
                  break L42;
                }
              }
              L43: {
                if (14 == param1) {
                  var5 = 1;
                  var4 = -1;
                  break L43;
                } else {
                  break L43;
                }
              }
              L44: {
                if (15 != param1) {
                  break L44;
                } else {
                  var4 = 1;
                  var5 = 1;
                  break L44;
                }
              }
              o.field_e = em.a(var5 * var2, var2 * var4, (byte) 90);
              return;
            }
          } else {
            return;
          }
        }
    }

    final static ji a(boolean param0, int param1, int param2, boolean param3, boolean param4, boolean param5) {
        try {
            Object var6 = null;
            Object var7 = null;
            le var8 = null;
            Object stackIn_2_0 = null;
            ji stackIn_15_0 = null;
            Throwable decompiledCaughtException = null;
            ji stackOut_14_0 = null;
            Object stackOut_1_0 = null;
            try {
              L0: {
                if (!param4) {
                  L1: {
                    var6 = null;
                    var7 = null;
                    if (bl.field_U.field_i != null) {
                      mk.field_d = new nh(bl.field_U.field_i, 5200, 0);
                      bl.field_U.field_i = null;
                      var6 = (Object) (Object) new kh(255, mk.field_d, new nh(bl.field_U.field_l, 12000, 0), 2097152);
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                  L2: {
                    if (mk.field_d == null) {
                      break L2;
                    } else {
                      L3: {
                        if (ig.field_cc != null) {
                          break L3;
                        } else {
                          ig.field_cc = new nh[bl.field_U.field_o.length];
                          break L3;
                        }
                      }
                      L4: {
                        if (ig.field_cc[param2] != null) {
                          break L4;
                        } else {
                          ig.field_cc[param2] = new nh(bl.field_U.field_o[param2], 12000, 0);
                          bl.field_U.field_o[param2] = null;
                          break L4;
                        }
                      }
                      var7 = (Object) (Object) new kh(param2, mk.field_d, ig.field_cc[param2], 2097152);
                      break L2;
                    }
                  }
                  L5: {
                    var8 = sc.field_l.a((byte) -86, param2, (kh) var7, (kh) var6, param3);
                    if (!param5) {
                      break L5;
                    } else {
                      var8.b((byte) 0);
                      break L5;
                    }
                  }
                  stackOut_14_0 = new ji((of) (Object) var8, param0, param1);
                  stackIn_15_0 = stackOut_14_0;
                  break L0;
                } else {
                  stackOut_1_0 = null;
                  stackIn_2_0 = stackOut_1_0;
                  return (ji) (Object) stackIn_2_0;
                }
              }
            } catch (java.io.IOException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var6 = (Object) (Object) decompiledCaughtException;
              throw new RuntimeException(((IOException) var6).toString());
            }
            return stackIn_15_0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    kc() {
    }

    public static void a(int param0) {
        field_q = null;
        field_s = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = "In Multiplayer";
        field_s = "The Basics";
    }
}
