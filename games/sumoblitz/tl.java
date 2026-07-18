/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class tl extends ms {
    static int field_t;
    int field_n;
    private int field_w;
    private int field_x;
    private int field_u;
    static int[] field_k;
    int field_m;
    int field_q;
    static String field_s;
    private int field_p;
    static int field_v;
    private int field_l;
    private int field_o;
    private jn field_r;

    final void a(int param0, ha param1) {
        RuntimeException var3 = null;
        int var4 = 0;
        nt var5 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        String stackIn_42_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        String stackOut_41_2 = null;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        String stackOut_40_2 = null;
        var4 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                L3: {
                  if (((tl) this).field_u % 10 <= 5) {
                    break L3;
                  } else {
                    if (((tl) this).field_q < 200) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                if (!((tl) this).g(0)) {
                  if (0 != ((tl) this).field_m) {
                    if (((tl) this).field_n == 2) {
                      ud.field_q[7].a((float)(((tl) this).field_x >> 8), (float)(((tl) this).field_o >> 8), 2048, 0, 1, 0, 2);
                      break L1;
                    } else {
                      if (((tl) this).field_n != 1) {
                        if (((tl) this).field_n == 0) {
                          ud.field_q[5].a((float)(((tl) this).field_x >> 8), (float)(((tl) this).field_o >> 8), 2048, 0, 1, 0, 2);
                          break L1;
                        } else {
                          if (((tl) this).field_n == 3) {
                            ud.field_q[8].a((float)(((tl) this).field_x >> 8), (float)(((tl) this).field_o >> 8), 2048, 0, 1, 0, 2);
                            break L1;
                          } else {
                            if (((tl) this).field_n != 4) {
                              break L1;
                            } else {
                              ud.field_q[9].a((float)(((tl) this).field_x >> 8), (float)(((tl) this).field_o >> 8), 2048, 0, 1, 0, 2);
                              break L1;
                            }
                          }
                        }
                      } else {
                        ud.field_q[6].a((float)(((tl) this).field_x >> 8), (float)(((tl) this).field_o >> 8), 2048, 0, 1, 0, 2);
                        break L1;
                      }
                    }
                  } else {
                    if (2 != ((tl) this).field_n) {
                      if (((tl) this).field_n == 1) {
                        ud.field_q[0].a((float)(((tl) this).field_x >> 8), (float)(((tl) this).field_o >> 8), 2048, 0, 1, 0, 2);
                        break L1;
                      } else {
                        if (((tl) this).field_n != 0) {
                          break L1;
                        } else {
                          ud.field_q[2].a((float)(((tl) this).field_x >> 8), (float)(((tl) this).field_o >> 8), 2048, 0, 1, 0, 2);
                          break L1;
                        }
                      }
                    } else {
                      ud.field_q[1].a((float)(((tl) this).field_x >> 8), (float)(((tl) this).field_o >> 8), 2048, 0, 1, 0, 2);
                      break L1;
                    }
                  }
                } else {
                  break L2;
                }
              }
              if (2 == ((tl) this).field_n) {
                ud.field_q[12].a((float)(((tl) this).field_x >> 8), (float)(((tl) this).field_o >> 8), 2048, 0, 1, 0, 2);
                break L1;
              } else {
                if (((tl) this).field_n != 1) {
                  if (0 == ((tl) this).field_n) {
                    ud.field_q[10].a((float)(((tl) this).field_x >> 8), (float)(((tl) this).field_o >> 8), 2048, 0, 1, 0, 2);
                    break L1;
                  } else {
                    if (3 != ((tl) this).field_n) {
                      if (((tl) this).field_n == 4) {
                        ud.field_q[14].a((float)(((tl) this).field_x >> 8), (float)(((tl) this).field_o >> 8), 2048, 0, 1, 0, 2);
                        break L1;
                      } else {
                        break L1;
                      }
                    } else {
                      ud.field_q[13].a((float)(((tl) this).field_x >> 8), (float)(((tl) this).field_o >> 8), 2048, 0, 1, 0, 2);
                      break L1;
                    }
                  }
                } else {
                  ud.field_q[11].a((float)(((tl) this).field_x >> 8), (float)(((tl) this).field_o >> 8), 2048, 0, 1, 0, 2);
                  break L1;
                }
              }
            }
            L4: {
              var5 = (nt) (Object) ((tl) this).field_r.b(126);
              if (param0 <= -53) {
                break L4;
              } else {
                boolean discarded$1 = ((tl) this).g(-26);
                break L4;
              }
            }
            L5: while (true) {
              if (var5 == null) {
                break L0;
              } else {
                var5.a(param1, -127);
                var5 = (nt) (Object) ((tl) this).field_r.d((byte) 18);
                continue L5;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3 = decompiledCaughtException;
            stackOut_39_0 = (RuntimeException) var3;
            stackOut_39_1 = new StringBuilder().append("tl.A(").append(param0).append(',');
            stackIn_41_0 = stackOut_39_0;
            stackIn_41_1 = stackOut_39_1;
            stackIn_40_0 = stackOut_39_0;
            stackIn_40_1 = stackOut_39_1;
            if (param1 == null) {
              stackOut_41_0 = (RuntimeException) (Object) stackIn_41_0;
              stackOut_41_1 = (StringBuilder) (Object) stackIn_41_1;
              stackOut_41_2 = "null";
              stackIn_42_0 = stackOut_41_0;
              stackIn_42_1 = stackOut_41_1;
              stackIn_42_2 = stackOut_41_2;
              break L6;
            } else {
              stackOut_40_0 = (RuntimeException) (Object) stackIn_40_0;
              stackOut_40_1 = (StringBuilder) (Object) stackIn_40_1;
              stackOut_40_2 = "{...}";
              stackIn_42_0 = stackOut_40_0;
              stackIn_42_1 = stackOut_40_1;
              stackIn_42_2 = stackOut_40_2;
              break L6;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_42_0, stackIn_42_2 + ')');
        }
    }

    final int d(int param0) {
        int var2 = 87 % ((param0 - 7) / 41);
        return ((tl) this).field_o;
    }

    private final int d(byte param0) {
        int var2 = 0;
        int var3 = 0;
        Object var4 = null;
        L0: {
          var3 = Sumoblitz.field_L ? 1 : 0;
          if (param0 >= 28) {
            break L0;
          } else {
            var4 = null;
            ((tl) this).a(77, (ha) null);
            break L0;
          }
        }
        L1: {
          var2 = -1414832128;
          if (((tl) this).field_n == 0) {
            var2 = -1442815829;
            break L1;
          } else {
            if (((tl) this).field_n != 1) {
              if (3 == ((tl) this).field_n) {
                var2 = -1426128896;
                break L1;
              } else {
                if (4 == ((tl) this).field_n) {
                  var2 = -1442796545;
                  break L1;
                } else {
                  break L1;
                }
              }
            } else {
              var2 = -1436548949;
              break L1;
            }
          }
        }
        return var2;
    }

    final boolean g(int param0) {
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0 == 0) {
            break L0;
          } else {
            ((tl) this).field_u = -46;
            break L0;
          }
        }
        L1: {
          L2: {
            if (0 != ((tl) this).field_w) {
              break L2;
            } else {
              if (0 == ((tl) this).field_p) {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                break L1;
              } else {
                break L2;
              }
            }
          }
          stackOut_5_0 = 1;
          stackIn_7_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_7_0 != 0;
    }

    final int c(byte param0) {
        if (param0 != 70) {
            int discarded$0 = this.d((byte) -57);
        }
        return ((tl) this).field_x;
    }

    final void c(int param0) {
        int var3 = 0;
        nt var4 = null;
        L0: {
          var3 = Sumoblitz.field_L ? 1 : 0;
          ((tl) this).field_o = ((tl) this).field_o + ((tl) this).field_p;
          ((tl) this).field_x = ((tl) this).field_x + ((tl) this).field_w;
          int discarded$5 = -114;
          if (this.e()) {
            L1: {
              if (((tl) this).field_w != 0) {
                break L1;
              } else {
                ((tl) this).field_w = 256;
                break L1;
              }
            }
            if (0 != ((tl) this).field_p) {
              break L0;
            } else {
              ((tl) this).field_p = 256;
              break L0;
            }
          } else {
            ((tl) this).field_p = 251 * ((tl) this).field_p / 256;
            ((tl) this).field_w = 251 * ((tl) this).field_w / 256;
            break L0;
          }
        }
        L2: {
          L3: {
            if (((tl) this).field_x > 13312) {
              break L3;
            } else {
              if (((tl) this).field_w <= 0) {
                L4: {
                  if (((tl) this).field_w != 0) {
                    break L4;
                  } else {
                    ((tl) this).field_w = 256;
                    break L4;
                  }
                }
                ((tl) this).field_w = -((tl) this).field_w;
                break L2;
              } else {
                break L3;
              }
            }
          }
          if (((tl) this).field_x <= -52 + rj.field_c << 8) {
            break L2;
          } else {
            if (((tl) this).field_w >= 0) {
              L5: {
                if (0 != ((tl) this).field_w) {
                  break L5;
                } else {
                  ((tl) this).field_w = -256;
                  break L5;
                }
              }
              ((tl) this).field_w = -((tl) this).field_w;
              break L2;
            } else {
              break L2;
            }
          }
        }
        L6: {
          L7: {
            if (((tl) this).field_o > 13312) {
              break L7;
            } else {
              if (((tl) this).field_p > 0) {
                break L7;
              } else {
                L8: {
                  if (((tl) this).field_p != 0) {
                    break L8;
                  } else {
                    ((tl) this).field_p = 256;
                    break L8;
                  }
                }
                ((tl) this).field_p = -((tl) this).field_p;
                break L6;
              }
            }
          }
          if (((tl) this).field_o <= rl.field_k - 52 << 8) {
            break L6;
          } else {
            if (0 <= ((tl) this).field_p) {
              L9: {
                if (((tl) this).field_p != 0) {
                  break L9;
                } else {
                  ((tl) this).field_p = 256;
                  break L9;
                }
              }
              ((tl) this).field_p = -((tl) this).field_p;
              break L6;
            } else {
              break L6;
            }
          }
        }
        L10: {
          if (1 != ((tl) this).field_m) {
            break L10;
          } else {
            L11: {
              if (((tl) this).field_w != 0) {
                break L11;
              } else {
                if (((tl) this).field_p == 0) {
                  break L10;
                } else {
                  break L11;
                }
              }
            }
            if (0 == ((tl) this).field_u % 2) {
              int discarded$6 = -96;
              int discarded$7 = -96;
              ((tl) this).field_r.a((ms) (Object) new eq(50, -1024 + (((tl) this).field_x - -fi.a(2048, he.field_o)) >> 8, -1024 + (((tl) this).field_o + fi.a(2048, he.field_o)) >> 8, this.d((byte) 105), 1 + ((tl) this).field_n, true), (byte) 39);
              break L10;
            } else {
              int discarded$8 = -96;
              int discarded$9 = -96;
              ((tl) this).field_r.a((ms) (Object) new eq(50, -1024 + (((tl) this).field_x + fi.a(2048, he.field_o)) >> 8, ((tl) this).field_o - (-fi.a(2048, he.field_o) + 1024) >> 8, this.d((byte) 65), 1 + ((tl) this).field_n, false), (byte) 39);
              break L10;
            }
          }
        }
        if (param0 == -31255) {
          var4 = (nt) (Object) ((tl) this).field_r.b(param0 ^ -31326);
          L12: while (true) {
            if (var4 == null) {
              ((tl) this).field_q = ((tl) this).field_q - 1;
              ((tl) this).field_u = ((tl) this).field_u + 1;
              return;
            } else {
              L13: {
                if (var4.a(-2567)) {
                  var4.b(false);
                  break L13;
                } else {
                  break L13;
                }
              }
              var4 = (nt) (Object) ((tl) this).field_r.d((byte) 18);
              continue L12;
            }
          }
        } else {
          return;
        }
    }

    private final boolean e() {
        cb var2 = null;
        nm var3 = null;
        int var4 = 0;
        int var5 = 0;
        var5 = Sumoblitz.field_L ? 1 : 0;
        var2 = new cb(is.field_c);
        var3 = (nm) (Object) var2.b((byte) -80);
        L0: while (true) {
          if (var3 != null) {
            L1: {
              var4 = (var3.field_m << 8) + ((tl) this).field_l;
              if (!wn.a(((tl) this).field_o, var4, -117, var3.field_q, ((tl) this).field_x, var3.field_l)) {
                break L1;
              } else {
                L2: {
                  if (3 == var3.field_y) {
                    break L2;
                  } else {
                    if (var3.field_y == 6) {
                      break L2;
                    } else {
                      break L1;
                    }
                  }
                }
                return true;
              }
            }
            var3 = (nm) (Object) var2.b(0);
            continue L0;
          } else {
            return false;
          }
        }
    }

    public static void f() {
        field_k = null;
        field_s = null;
    }

    final static void a(byte param0) {
        if (param0 >= -13) {
            return;
        }
        av.field_C = null;
        er.field_h = null;
        ag.field_d = null;
        iv.field_l = null;
        vg.field_k = null;
        we.field_B = null;
    }

    final int a(int param0) {
        if (param0 >= -32) {
            return 10;
        }
        return ((tl) this).field_l;
    }

    tl(int param0, int param1, int param2, int param3, int param4, int param5) {
        ((tl) this).field_m = param0;
        ((tl) this).field_w = param4;
        ((tl) this).field_q = 1000;
        ((tl) this).field_o = param3;
        ((tl) this).field_p = param5;
        ((tl) this).field_n = param1;
        ((tl) this).field_l = 5120;
        ((tl) this).field_x = param2;
        ((tl) this).field_r = new jn();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = new int[8192];
        field_v = 0;
    }
}
