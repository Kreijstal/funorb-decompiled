/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class tl {
    static Random field_f;
    static int field_a;
    static ba field_c;
    static String field_e;
    static va field_h;
    static qj field_g;
    static int[] field_d;
    static int[] field_b;

    final static void a(int param0, ha param1, int param2) {
        se var5 = null;
        int var4 = 0;
        try {
            var5 = uk.field_b;
            if (param0 > -121) {
                field_h = (va) null;
            }
            var5.i(param2, 92);
            var5.field_i = var5.field_i + 1;
            var4 = var5.field_i;
            var5.a(1, -125);
            var5.a(param1.field_h, -85);
            var5.a(param1.field_i, -69);
            var5.b(param1.field_m, -1);
            var5.b(param1.field_n, -1);
            var5.b(param1.field_k, -1);
            var5.b(param1.field_f, -1);
            var5.e(-18951, var4);
            var5.c((byte) -77, -var4 + var5.field_i);
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) ((Object) runtimeException), "tl.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static int a(int param0, int param1, boolean param2, byte param3) {
        int var4 = 14 % ((1 - param3) / 43);
        return nk.a((byte) -97);
    }

    final static boolean a(java.applet.Applet param0, int param1) {
        try {
            String var2 = null;
            String var3 = null;
            String[] var4 = null;
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            int stackIn_4_0 = 0;
            int stackIn_7_0 = 0;
            int stackIn_13_0 = 0;
            int stackIn_20_0 = 0;
            RuntimeException stackIn_23_0 = null;
            StringBuilder stackIn_23_1 = null;
            RuntimeException stackIn_24_0 = null;
            StringBuilder stackIn_24_1 = null;
            String stackIn_24_2 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            Throwable decompiledCaughtException = null;
            Throwable var2_ref = null;
            RuntimeException var2_ref2 = null;
            var7 = OrbDefence.field_D ? 1 : 0;
            try {
              L0: {
                if (fa.field_b) {
                  stackIn_4_0 = 1;
                  decompiledRegionSelector1 = 0;
                  break L0;
                } else {
                  try {
                    L1: {
                      var2 = "tuhstatbut";
                      var3 = (String) (gm.a(-31183, "getcookies", param0));
                      var4 = g.a(param1 ^ -90, ';', var3);
                      if (param1 == 61) {
                        var5 = 0;
                        L2: while (true) {
                          if (var5 >= var4.length) {
                            decompiledRegionSelector0 = 1;
                            break L1;
                          } else {
                            L3: {
                              var6 = var4[var5].indexOf('=');
                              if (-1 < (var6 ^ -1)) {
                                break L3;
                              } else {
                                if (!var4[var5].substring(0, var6).trim().equals(var2)) {
                                  break L3;
                                } else {
                                  stackIn_13_0 = 1;
                                  decompiledRegionSelector0 = 2;
                                  break L1;
                                }
                              }
                            }
                            var5++;
                            continue L2;
                          }
                        }
                      } else {
                        stackIn_7_0 = 0;
                        decompiledRegionSelector0 = 0;
                        break L1;
                      }
                    }
                  } catch (java.lang.Throwable decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L4: {
                      var2_ref = decompiledCaughtException;
                      decompiledRegionSelector0 = 1;
                      break L4;
                    }
                  }
                  if (decompiledRegionSelector0 == 0) {
                    decompiledRegionSelector1 = 2;
                    break L0;
                  } else {
                    if (decompiledRegionSelector0 == 1) {
                      L5: {
                        if (param0.getParameter("tuhstatbut") == null) {
                          stackIn_20_0 = 0;
                          break L5;
                        } else {
                          stackIn_20_0 = 1;
                          break L5;
                        }
                      }
                      decompiledRegionSelector1 = 1;
                      break L0;
                    } else {
                      decompiledRegionSelector1 = 3;
                      break L0;
                    }
                  }
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L6: {
                var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_23_0 = (RuntimeException) (var2_ref2);

                stackIn_23_1 = new StringBuilder().append("tl.G(");

                if (param0 == null) {
                  stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
                  stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
                  stackIn_24_2 = "null";
                  break L6;
                } else {
                  stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
                  stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
                  stackIn_24_2 = "{...}";
                  break L6;
                }
              }
              throw dd.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ',' + param1 + ')');
            }
            if (decompiledRegionSelector1 == 0) {
              return stackIn_4_0 != 0;
            } else {
              if (decompiledRegionSelector1 == 1) {
                return stackIn_20_0 != 0;
              } else {
                if (decompiledRegionSelector1 == 2) {
                  return stackIn_7_0 != 0;
                } else {
                  return stackIn_13_0 != 0;
                }
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final boolean a(byte param0) {
        int stackIn_8_0 = 0;
        L0: {
          if (param0 == 74) {
            break L0;
          } else {
            this.a((byte) -102);
            break L0;
          }
        }
        L1: {
          L2: {
            if (this == da.field_m) {
              break L2;
            } else {
              if (this == lm.field_e) {
                break L2;
              } else {
                if (da.field_r != this) {
                  stackIn_8_0 = 0;
                  break L1;
                } else {
                  break L2;
                }
              }
            }
          }
          stackIn_8_0 = 1;
          break L1;
        }
        return stackIn_8_0 != 0;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static void a(byte param0, java.applet.Applet param1) {
        try {
            java.net.URL var2 = null;
            RuntimeException stackIn_8_0 = null;
            StringBuilder stackIn_8_1 = null;
            RuntimeException stackIn_9_0 = null;
            StringBuilder stackIn_9_1 = null;
            String stackIn_9_2 = null;
            Throwable decompiledCaughtException = null;
            Exception var2_ref = null;
            RuntimeException var2_ref2 = null;
            try {
              L0: {
                try {
                  L1: {
                    L2: {
                      if (param0 == -102) {
                        break L2;
                      } else {
                        field_a = 43;
                        break L2;
                      }
                    }
                    var2 = new java.net.URL(param1.getCodeBase(), "subscribe.ws");
                    param1.getAppletContext().showDocument(f.a(param1, var2, param0 ^ -3), "_top");
                    break L1;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L3: {
                    var2_ref = (Exception) (Object) decompiledCaughtException;
                    var2_ref.printStackTrace();
                    break L3;
                  }
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L4: {
                var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_8_0 = (RuntimeException) (var2_ref2);

                stackIn_8_1 = new StringBuilder().append("tl.E(").append(param0).append(',');

                if (param1 == null) {
                  stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
                  stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
                  stackIn_9_2 = "null";
                  break L4;
                } else {
                  stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
                  stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
                  stackIn_9_2 = "{...}";
                  break L4;
                }
              }
              throw dd.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(int param0) {
        field_b = null;
        field_e = null;
        field_d = null;
        field_f = null;
        if (param0 >= -88) {
            field_e = (String) null;
        }
        field_h = null;
        field_g = null;
        field_c = null;
    }

    final static void a(int param0, int param1, int param2) {
        L0: {
          if (param1 == 12105912) {
            break L0;
          } else {
            field_b = (int[]) null;
            break L0;
          }
        }
        L1: {
          L2: {
            if (kk.field_U == null) {
              break L2;
            } else {
              if (param0 > kk.field_U.length) {
                break L2;
              } else {
                break L1;
              }
            }
          }
          kk.field_U = new int[param0 * 2];
          break L1;
        }
        L3: {
          L4: {
            if (null == field_d) {
              break L4;
            } else {
              if (field_d.length >= param0) {
                break L3;
              } else {
                break L4;
              }
            }
          }
          field_d = new int[param0 * 2];
          break L3;
        }
        L5: {
          L6: {
            if (null == vl.field_g) {
              break L6;
            } else {
              if (param0 > vl.field_g.length) {
                break L6;
              } else {
                break L5;
              }
            }
          }
          vl.field_g = new int[param0 * 2];
          break L5;
        }
        L7: {
          L8: {
            if (null == th.field_f) {
              break L8;
            } else {
              if (th.field_f.length >= param0) {
                break L7;
              } else {
                break L8;
              }
            }
          }
          th.field_f = new int[param0 * 2];
          break L7;
        }
        L9: {
          L10: {
            if (null == ld.field_b) {
              break L10;
            } else {
              if (param0 <= ld.field_b.length) {
                break L9;
              } else {
                break L10;
              }
            }
          }
          ld.field_b = new int[param0 * 2];
          break L9;
        }
        L11: {
          L12: {
            if (rh.field_c == null) {
              break L12;
            } else {
              if (param0 <= rh.field_c.length) {
                break L11;
              } else {
                break L12;
              }
            }
          }
          rh.field_c = new int[param0 * 2];
          break L11;
        }
        L13: {
          L14: {
            if (bc.field_o == null) {
              break L14;
            } else {
              if (bc.field_o.length < param2 + param0) {
                break L14;
              } else {
                break L13;
              }
            }
          }
          bc.field_o = new int[(param2 + param0) * 2];
          break L13;
        }
        L15: {
          L16: {
            if (null == ql.field_c) {
              break L16;
            } else {
              if (ql.field_c.length >= param0) {
                break L15;
              } else {
                break L16;
              }
            }
          }
          ql.field_c = new boolean[param0 * 2];
          break L15;
        }
        qh.field_a = 2147483647;
        jl.field_d = -2147483648;
        am.field_e = 2147483647;
        hc.field_j = -2147483648;
        rc.field_d = 0;
    }

    final static void b(int param0) {
        ql.field_e = 0;
        if (param0 < 93) {
            field_g = (qj) null;
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        int var5_int = 0;
        int var6 = 0;
        int var8 = 0;
        int var9 = 0;
        int var7 = 0;
        int var10 = OrbDefence.field_D ? 1 : 0;
        try {
            ul.d(param2, param1, param3 - -1, 10000536);
            ul.d(param2, param1 - -param0, param3 + 1, 12105912);
            var5_int = 1;
            var6 = param0;
            if (var5_int + param1 < ul.field_d) {
                var5_int = -param1 + ul.field_d;
            }
            if (!(var6 + param1 <= ul.field_a)) {
                var6 = -param1 + ul.field_a;
            }
            for (var7 = var5_int; var7 < var6; var7++) {
                var8 = 152 - -(var7 * 48 / param0);
                var9 = var8 << 1882216976 | var8 << 840434568 | var8;
                ul.field_b[(var7 + param1) * ul.field_f + param2] = var9;
                ul.field_b[param3 + ul.field_f * (param1 - -var7) - -param2] = var9;
            }
            var7 = -80 % ((85 - param4) / 33);
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) ((Object) runtimeException), "tl.D(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    static {
        field_f = new Random();
        field_c = new ba(7, 0, 1, 1);
        field_h = new va();
    }
}
