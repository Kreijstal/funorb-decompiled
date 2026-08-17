/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

abstract class ca {
    int field_e;
    static Random field_i;
    String field_a;
    static String field_h;
    static String field_b;
    static int field_c;
    static int[] field_f;
    static long field_g;
    static String field_d;

    final static boolean c(int param0) {
        int stackIn_8_0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          L0: {
            L1: {
              if (param0 == -25945) {
                break L1;
              } else {
                field_b = (String) null;
                break L1;
              }
            }
            L2: {
              L3: {
                if (fn.field_R < 10) {
                  break L3;
                } else {
                  if (bh.field_r) {
                    break L3;
                  } else {
                    if (r.d(0)) {
                      break L3;
                    } else {
                      stackIn_8_0 = 1;
                      break L2;
                    }
                  }
                }
              }
              stackIn_8_0 = 0;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw oi.a((Throwable) ((Object) var1), "ca.L(" + param0 + ')');
        }
        return stackIn_8_0 != 0;
    }

    public static void d(int param0) {
        field_i = null;
        field_b = null;
        field_h = null;
        field_d = null;
        if (param0 != 0) {
            return;
        }
        try {
            field_f = null;
        } catch (RuntimeException runtimeException) {
            throw oi.a((Throwable) ((Object) runtimeException), "ca.J(" + param0 + ')');
        }
    }

    final static void b(int param0) {
        int var1_int = 0;
        int var2 = 0;
        try {
            var1_int = nn.f((byte) -102);
            var2 = ed.h(32768);
            nm.field_o.a(ab.field_Q - fl.field_b, ja.field_j + -ng.field_D, (byte) -21, (ng.field_D << -2027189439) + var1_int, var2 + (fl.field_b << 2017412225));
            if (param0 >= -2) {
                ca.a(false, (byte) 121);
            }
            na.c(true);
        } catch (RuntimeException runtimeException) {
            throw oi.a((Throwable) ((Object) runtimeException), "ca.G(" + param0 + ')');
        }
    }

    final static void a(float param0, float param1, int param2) {
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          L0: {
            if (cl.field_g != 2) {
              L1: {
                rn.field_d = rn.field_d + param0;
                if ((cl.field_g ^ -1) == -2) {
                  cl.field_g = 0;
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                if (rn.field_d < 64.0f) {
                  rn.field_d = 64.0f;
                  break L2;
                } else {
                  break L2;
                }
              }
              L3: {
                if (rn.field_d <= 440.0f) {
                  break L3;
                } else {
                  rn.field_d = 440.0f;
                  break L3;
                }
              }
              dj.field_h = dj.field_h + param1;
              ti.field_g[0] = (double)rn.field_d * Math.sin((double)dj.field_h);
              ti.field_g[2] = (double)rn.field_d * Math.cos((double)dj.field_h);
              eo.a(param2 ^ 2505);
              ah.field_a = dh.field_e;
              if (param2 == -2452) {
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                field_i = (Random) null;
                return;
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw oi.a((Throwable) ((Object) var3), "ca.H(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final java.net.Socket a(int param0) throws IOException {
        RuntimeException var2 = null;
        java.net.Socket stackIn_2_0 = null;
        java.net.Socket stackIn_5_0 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 == -1) {
              stackIn_5_0 = new java.net.Socket(this.field_a, this.field_e);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (java.net.Socket) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw oi.a((Throwable) ((Object) var2), "ca.K(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_5_0;
        }
    }

    abstract java.net.Socket a(byte param0) throws IOException;

    final static void a(boolean param0, byte param1) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        var3 = TetraLink.field_J;
        try {
          L0: {
            L1: {
              L2: {
                if (param0) {
                  break L2;
                } else {
                  if (qb.field_N == null) {
                    break L2;
                  } else {
                    break L1;
                  }
                }
              }
              lg.field_S = false;
              break L1;
            }
            L3: {
              if (param0) {
                if (0 >= qd.field_ab) {
                  if (-1 <= (ng.field_t ^ -1)) {
                    if (-1 <= (am.field_f ^ -1)) {
                      break L3;
                    } else {
                      am.field_f = am.field_f - 1;
                      break L3;
                    }
                  } else {
                    ng.field_t = ng.field_t - 1;
                    break L3;
                  }
                } else {
                  qd.field_ab = qd.field_ab - 1;
                  break L3;
                }
              } else {
                if (qb.field_N == null) {
                  if (qe.field_a != null) {
                    if ((qd.field_ab ^ -1) >= -1) {
                      if ((am.field_f ^ -1) >= -1) {
                        if (ma.field_f > ng.field_t) {
                          L4: {
                            if (ng.field_t == 0) {
                              ic.a(true, (byte) -128);
                              break L4;
                            } else {
                              break L4;
                            }
                          }
                          ng.field_t = ng.field_t + 1;
                          break L3;
                        } else {
                          break L3;
                        }
                      } else {
                        am.field_f = am.field_f - 1;
                        break L3;
                      }
                    } else {
                      qd.field_ab = qd.field_ab - 1;
                      break L3;
                    }
                  } else {
                    lg.field_S = false;
                    if (ng.field_t > 0) {
                      ng.field_t = ng.field_t - 1;
                      break L3;
                    } else {
                      if ((am.field_f ^ -1) < -1) {
                        am.field_f = am.field_f - 1;
                        break L3;
                      } else {
                        if (qd.field_ab < ma.field_f) {
                          L5: {
                            if (0 != qd.field_ab) {
                              break L5;
                            } else {
                              pd.b(false);
                              break L5;
                            }
                          }
                          qd.field_ab = qd.field_ab + 1;
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                } else {
                  if (qd.field_ab > 0) {
                    qd.field_ab = qd.field_ab - 1;
                    break L3;
                  } else {
                    if (-1 <= (ng.field_t ^ -1)) {
                      if (am.field_f < ma.field_f) {
                        L6: {
                          if (-1 == (am.field_f ^ -1)) {
                            ic.a(false, (byte) -128);
                            break L6;
                          } else {
                            break L6;
                          }
                        }
                        am.field_f = am.field_f + 1;
                        break L3;
                      } else {
                        break L3;
                      }
                    } else {
                      ng.field_t = ng.field_t - 1;
                      break L3;
                    }
                  }
                }
              }
            }
            if (param1 == 16) {
              break L0;
            } else {
              ca.b(-74);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw oi.a((Throwable) ((Object) var2), "ca.I(" + param0 + ',' + param1 + ')');
        }
    }

    static {
        field_i = new Random();
        field_h = "Shortcut Reference";
        field_b = "Decline invitation to <%0>'s game";
        field_f = new int[4];
        field_d = "(1 player wants to join)";
    }
}
