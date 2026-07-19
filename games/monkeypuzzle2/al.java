/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

abstract class al {
    int field_a;
    String field_b;

    final static boolean a(ad param0, byte param1) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_3_0 = false;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            if (param1 > 19) {
              stackOut_3_0 = param0.b(0);
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = 1;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var2);
            stackOut_5_1 = new StringBuilder().append("al.G(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_4_0;
        }
    }

    abstract java.net.Socket a(int param0) throws IOException;

    final static void a(int param0, byte param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = MonkeyPuzzle2.field_F ? 1 : 0;
        var2 = -50 / ((param1 - -40) / 48);
        var4 = aa.field_a;
        if (-2 != (var4 ^ -1)) {
          if ((var4 ^ -1) != -3) {
            if ((var4 ^ -1) == -4) {
              tj.field_a.c(0, 0);
              return;
            } else {
              return;
            }
          } else {
            if (var5 != 0) {
              if ((var4 ^ -1) != -4) {
                return;
              } else {
                tj.field_a.c(0, 0);
                return;
              }
            } else {
              ne.field_a[1].b(0, 0);
              var3 = 50 - -(int)(ia.a(true, 0.14000000059604645f * (float)param0) * 30.0f + 10.0f * ha.a((byte) 51, (float)param0 * 0.11999999731779099f));
              ne.field_a[0].b(0, 0, var3);
              ge.h(80, 0, 560, 480);
              ik.field_p[i.field_n].b(100, 0, 70);
              cl.field_c[sk.field_G].b(0, 0, 100);
              ge.b();
              return;
            }
          }
        } else {
          if (var5 == 0) {
            ib.field_b.a(0, 0);
            var4 = (int)(20.0f * ia.a(true, (float)param0 * 0.009999999776482582f)) + 70;
            m.field_k.b(0, 0, var4);
            if (var5 != 0) {
              ne.field_a[1].b(0, 0);
              var3 = 50 - -(int)(ia.a(true, 0.14000000059604645f * (float)param0) * 30.0f + 10.0f * ha.a((byte) 51, (float)param0 * 0.11999999731779099f));
              ne.field_a[0].b(0, 0, var3);
              ge.h(80, 0, 560, 480);
              ik.field_p[i.field_n].b(100, 0, 70);
              cl.field_c[sk.field_G].b(0, 0, 100);
              ge.b();
              if (var5 == 0) {
                return;
              } else {
                tj.field_a.c(0, 0);
                return;
              }
            } else {
              return;
            }
          } else {
            if ((var4 ^ -1) == -3) {
              if (var5 == 0) {
                ne.field_a[1].b(0, 0);
                var3 = 50 - -(int)(ia.a(true, 0.14000000059604645f * (float)param0) * 30.0f + 10.0f * ha.a((byte) 51, (float)param0 * 0.11999999731779099f));
                ne.field_a[0].b(0, 0, var3);
                ge.h(80, 0, 560, 480);
                ik.field_p[i.field_n].b(100, 0, 70);
                cl.field_c[sk.field_G].b(0, 0, 100);
                ge.b();
                if (var5 != 0) {
                  tj.field_a.c(0, 0);
                  return;
                } else {
                  return;
                }
              } else {
                if ((var4 ^ -1) != -4) {
                  return;
                } else {
                  tj.field_a.c(0, 0);
                  return;
                }
              }
            } else {
              if ((var4 ^ -1) != -4) {
                return;
              } else {
                tj.field_a.c(0, 0);
                return;
              }
            }
          }
        }
    }

    final static String a(char param0, int param1, int param2) {
        char[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        char[] var6 = null;
        var5 = MonkeyPuzzle2.field_F ? 1 : 0;
        if (param2 != 12663) {
          return (String) null;
        } else {
          var6 = new char[param1];
          var3 = var6;
          var4 = 0;
          L0: while (true) {
            L1: {
              if (param1 <= var4) {
                break L1;
              } else {
                var6[var4] = param0;
                var4++;
                if (var5 == 0) {
                  continue L0;
                } else {
                  break L1;
                }
              }
            }
            return new String(var6);
          }
        }
    }

    final static void a(byte param0, int param1) {
        try {
            String discarded$2 = null;
            IOException iOException = null;
            Throwable decompiledCaughtException = null;
            L0: {
              if (param0 == -71) {
                break L0;
              } else {
                discarded$2 = al.a('ﾑ', -120, -100);
                break L0;
              }
            }
            L1: {
              if (null == ol.field_g) {
                break L1;
              } else {
                L2: {
                  if (0 > param1) {
                    break L2;
                  } else {
                    if (dk.field_h == wh.field_b) {
                      break L2;
                    } else {
                      break L1;
                    }
                  }
                }
                L3: {
                  if (gf.field_c.field_h != 0) {
                    break L3;
                  } else {
                    if (10000L + qg.field_d < pf.a(0)) {
                      gf.field_c.b(true, param1);
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                }
                L4: {
                  if (0 >= gf.field_c.field_h) {
                    break L4;
                  } else {
                    try {
                      L5: {
                        ol.field_g.a(gf.field_c.field_g, 0, (byte) 122, gf.field_c.field_h);
                        qg.field_d = pf.a(param0 + 71);
                        break L5;
                      }
                    } catch (java.io.IOException decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L6: {
                        iOException = (IOException) (Object) decompiledCaughtException;
                        gk.a(-1);
                        break L6;
                      }
                    }
                    gf.field_c.field_h = 0;
                    break L4;
                  }
                }
                return;
              }
            }
            gf.field_c.field_h = 0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static int a(byte param0) {
        if (param0 != 113) {
            al.a(-92, (byte) 8);
            return fd.field_s;
        }
        return fd.field_s;
    }

    final static void c(byte param0) {
        int var1 = pf.a((byte) -92, 3);
        cj.a((byte) 108, ke.field_h[25 + var1]);
        if (param0 > -80) {
            return;
        }
    }

    final java.net.Socket b(byte param0) throws IOException {
        if (param0 < 120) {
          this.field_a = 127;
          return new java.net.Socket(this.field_b, this.field_a);
        } else {
          return new java.net.Socket(this.field_b, this.field_a);
        }
    }

    final static int a(int param0, int param1, boolean param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_3_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_17_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_14_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_2_0 = 0;
        var4 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            if (param2) {
              var3_int = 1;
              L1: while (true) {
                L2: {
                  L3: {
                    L4: {
                      if ((param1 ^ -1) >= -2) {
                        break L4;
                      } else {
                        var6 = param1 & 1;
                        var5 = 0;
                        if (var4 != 0) {
                          if (var5 != var6) {
                            break L2;
                          } else {
                            break L3;
                          }
                        } else {
                          L5: {
                            if (var5 != var6) {
                              var3_int = var3_int * param0;
                              break L5;
                            } else {
                              break L5;
                            }
                          }
                          param1 = param1 >> 1;
                          param0 = param0 * param0;
                          if (var4 == 0) {
                            continue L1;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                    if (-2 != (param1 ^ -1)) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                  stackOut_14_0 = param0 * var3_int;
                  stackIn_15_0 = stackOut_14_0;
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
                stackOut_16_0 = var3_int;
                stackIn_17_0 = stackOut_16_0;
                decompiledRegionSelector0 = 2;
                break L0;
              }
            } else {
              stackOut_2_0 = -124;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw la.a((Throwable) ((Object) var3), "al.I(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_15_0;
          } else {
            return stackIn_17_0;
          }
        }
    }

    static {
    }
}
