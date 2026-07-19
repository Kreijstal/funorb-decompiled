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
        int discarded$0 = 0;
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
            discarded$0 = var5.e(-18951, var4);
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
            RuntimeException var2_ref = null;
            Throwable var2_ref2 = null;
            String var3 = null;
            String[] var4 = null;
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            int stackIn_4_0 = 0;
            int stackIn_7_0 = 0;
            int stackIn_11_0 = 0;
            int stackIn_14_0 = 0;
            int stackIn_21_0 = 0;
            RuntimeException stackIn_23_0 = null;
            StringBuilder stackIn_23_1 = null;
            RuntimeException stackIn_24_0 = null;
            StringBuilder stackIn_24_1 = null;
            RuntimeException stackIn_25_0 = null;
            StringBuilder stackIn_25_1 = null;
            String stackIn_25_2 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_3_0 = 0;
            int stackOut_10_0 = 0;
            int stackOut_13_0 = 0;
            int stackOut_6_0 = 0;
            int stackOut_20_0 = 0;
            int stackOut_19_0 = 0;
            RuntimeException stackOut_22_0 = null;
            StringBuilder stackOut_22_1 = null;
            RuntimeException stackOut_24_0 = null;
            StringBuilder stackOut_24_1 = null;
            String stackOut_24_2 = null;
            RuntimeException stackOut_23_0 = null;
            StringBuilder stackOut_23_1 = null;
            String stackOut_23_2 = null;
            var7 = OrbDefence.field_D ? 1 : 0;
            try {
              L0: {
                if (fa.field_b) {
                  stackOut_3_0 = 1;
                  stackIn_4_0 = stackOut_3_0;
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
                          L3: {
                            if (var5 >= var4.length) {
                              break L3;
                            } else {
                              var6 = var4[var5].indexOf('=');
                              stackOut_10_0 = -1;
                              stackIn_21_0 = stackOut_10_0;
                              stackIn_11_0 = stackOut_10_0;
                              if (var7 != 0) {
                                decompiledRegionSelector0 = 2;
                                break L1;
                              } else {
                                L4: {
                                  if (stackIn_11_0 < (var6 ^ -1)) {
                                    break L4;
                                  } else {
                                    if (!var4[var5].substring(0, var6).trim().equals(var2)) {
                                      break L4;
                                    } else {
                                      stackOut_13_0 = 1;
                                      stackIn_14_0 = stackOut_13_0;
                                      decompiledRegionSelector0 = 3;
                                      break L1;
                                    }
                                  }
                                }
                                var5++;
                                if (var7 == 0) {
                                  continue L2;
                                } else {
                                  break L3;
                                }
                              }
                            }
                          }
                          decompiledRegionSelector0 = 1;
                          break L1;
                        }
                      } else {
                        stackOut_6_0 = 0;
                        stackIn_7_0 = stackOut_6_0;
                        decompiledRegionSelector0 = 0;
                        break L1;
                      }
                    }
                  } catch (java.lang.Throwable decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L5: {
                      var2_ref2 = decompiledCaughtException;
                      decompiledRegionSelector0 = 1;
                      break L5;
                    }
                  }
                  if (decompiledRegionSelector0 == 0) {
                    decompiledRegionSelector1 = 2;
                    break L0;
                  } else {
                    L6: {
                      if (decompiledRegionSelector0 == 1) {
                        if (param0.getParameter("tuhstatbut") == null) {
                          stackOut_20_0 = 0;
                          stackIn_21_0 = stackOut_20_0;
                          break L6;
                        } else {
                          stackOut_19_0 = 1;
                          stackIn_21_0 = stackOut_19_0;
                          break L6;
                        }
                      } else {
                        if (decompiledRegionSelector0 == 2) {
                          break L6;
                        } else {
                          decompiledRegionSelector1 = 3;
                          break L0;
                        }
                      }
                    }
                    decompiledRegionSelector1 = 1;
                    break L0;
                  }
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L7: {
                var2_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_22_0 = (RuntimeException) (var2_ref);
                stackOut_22_1 = new StringBuilder().append("tl.G(");
                stackIn_24_0 = stackOut_22_0;
                stackIn_24_1 = stackOut_22_1;
                stackIn_23_0 = stackOut_22_0;
                stackIn_23_1 = stackOut_22_1;
                if (param0 == null) {
                  stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
                  stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
                  stackOut_24_2 = "null";
                  stackIn_25_0 = stackOut_24_0;
                  stackIn_25_1 = stackOut_24_1;
                  stackIn_25_2 = stackOut_24_2;
                  break L7;
                } else {
                  stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
                  stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
                  stackOut_23_2 = "{...}";
                  stackIn_25_0 = stackOut_23_0;
                  stackIn_25_1 = stackOut_23_1;
                  stackIn_25_2 = stackOut_23_2;
                  break L7;
                }
              }
              throw dd.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ',' + param1 + ')');
            }
            if (decompiledRegionSelector1 == 0) {
              return stackIn_4_0 != 0;
            } else {
              if (decompiledRegionSelector1 == 1) {
                return stackIn_21_0 != 0;
              } else {
                if (decompiledRegionSelector1 == 2) {
                  return stackIn_7_0 != 0;
                } else {
                  return stackIn_14_0 != 0;
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
        boolean discarded$6 = false;
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        if (param0 == 74) {
          if (this != da.field_m) {
            if (this != lm.field_e) {
              if (da.field_r == this) {
                return true;
              } else {
                return false;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        } else {
          discarded$6 = this.a((byte) -102);
          if (this != da.field_m) {
            if (this == lm.field_e) {
              return true;
            } else {
              L0: {
                if (da.field_r != this) {
                  stackOut_6_0 = 0;
                  stackIn_7_0 = stackOut_6_0;
                  break L0;
                } else {
                  stackOut_5_0 = 1;
                  stackIn_7_0 = stackOut_5_0;
                  break L0;
                }
              }
              return stackIn_7_0 != 0;
            }
          } else {
            return true;
          }
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static void a(byte param0, java.applet.Applet param1) {
        try {
            java.net.URL var2 = null;
            Exception var2_ref = null;
            RuntimeException var2_ref2 = null;
            RuntimeException stackIn_7_0 = null;
            StringBuilder stackIn_7_1 = null;
            RuntimeException stackIn_8_0 = null;
            StringBuilder stackIn_8_1 = null;
            RuntimeException stackIn_9_0 = null;
            StringBuilder stackIn_9_1 = null;
            String stackIn_9_2 = null;
            Throwable decompiledCaughtException = null;
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
                stackOut_6_0 = (RuntimeException) (var2_ref2);
                stackOut_6_1 = new StringBuilder().append("tl.E(").append(param0).append(',');
                stackIn_8_0 = stackOut_6_0;
                stackIn_8_1 = stackOut_6_1;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                if (param1 == null) {
                  stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
                  stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
                  stackOut_8_2 = "null";
                  stackIn_9_0 = stackOut_8_0;
                  stackIn_9_1 = stackOut_8_1;
                  stackIn_9_2 = stackOut_8_2;
                  break L4;
                } else {
                  stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
                  stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
                  stackOut_7_2 = "{...}";
                  stackIn_9_0 = stackOut_7_0;
                  stackIn_9_1 = stackOut_7_1;
                  stackIn_9_2 = stackOut_7_2;
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
          field_h = null;
          field_g = null;
          field_c = null;
          return;
        } else {
          field_h = null;
          field_g = null;
          field_c = null;
          return;
        }
    }

    final static void a(int param0, int param1, int param2) {
        if (param1 != 12105912) {
          L0: {
            L1: {
              field_b = (int[]) null;
              if (kk.field_U == null) {
                break L1;
              } else {
                if (param0 > kk.field_U.length) {
                  break L1;
                } else {
                  break L0;
                }
              }
            }
            kk.field_U = new int[param0 * 2];
            break L0;
          }
          if (null != field_d) {
            L2: {
              if (field_d.length >= param0) {
                break L2;
              } else {
                field_d = new int[param0 * 2];
                break L2;
              }
            }
            L3: {
              L4: {
                if (null == vl.field_g) {
                  break L4;
                } else {
                  if (param0 > vl.field_g.length) {
                    break L4;
                  } else {
                    break L3;
                  }
                }
              }
              vl.field_g = new int[param0 * 2];
              break L3;
            }
            L5: {
              if (null == th.field_f) {
                break L5;
              } else {
                if (th.field_f.length >= param0) {
                  if (null == ld.field_b) {
                    ld.field_b = new int[param0 * 2];
                    if (rh.field_c == null) {
                      L6: {
                        L7: {
                          rh.field_c = new int[param0 * 2];
                          if (bc.field_o == null) {
                            break L7;
                          } else {
                            if (bc.field_o.length < param2 + param0) {
                              break L7;
                            } else {
                              break L6;
                            }
                          }
                        }
                        bc.field_o = new int[(param2 + param0) * 2];
                        break L6;
                      }
                      L8: {
                        if (null == ql.field_c) {
                          break L8;
                        } else {
                          if (ql.field_c.length >= param0) {
                            qh.field_a = 2147483647;
                            jl.field_d = -2147483648;
                            am.field_e = 2147483647;
                            hc.field_j = -2147483648;
                            rc.field_d = 0;
                            return;
                          } else {
                            break L8;
                          }
                        }
                      }
                      ql.field_c = new boolean[param0 * 2];
                      qh.field_a = 2147483647;
                      jl.field_d = -2147483648;
                      am.field_e = 2147483647;
                      hc.field_j = -2147483648;
                      rc.field_d = 0;
                      return;
                    } else {
                      if (param0 <= rh.field_c.length) {
                        L9: {
                          L10: {
                            if (bc.field_o == null) {
                              break L10;
                            } else {
                              if (bc.field_o.length < param2 + param0) {
                                break L10;
                              } else {
                                break L9;
                              }
                            }
                          }
                          bc.field_o = new int[(param2 + param0) * 2];
                          break L9;
                        }
                        if (null == ql.field_c) {
                          ql.field_c = new boolean[param0 * 2];
                          qh.field_a = 2147483647;
                          jl.field_d = -2147483648;
                          am.field_e = 2147483647;
                          hc.field_j = -2147483648;
                          rc.field_d = 0;
                          return;
                        } else {
                          if (ql.field_c.length < param0) {
                            ql.field_c = new boolean[param0 * 2];
                            qh.field_a = 2147483647;
                            jl.field_d = -2147483648;
                            am.field_e = 2147483647;
                            hc.field_j = -2147483648;
                            rc.field_d = 0;
                            return;
                          } else {
                            qh.field_a = 2147483647;
                            jl.field_d = -2147483648;
                            am.field_e = 2147483647;
                            hc.field_j = -2147483648;
                            rc.field_d = 0;
                            return;
                          }
                        }
                      } else {
                        L11: {
                          L12: {
                            rh.field_c = new int[param0 * 2];
                            if (bc.field_o == null) {
                              break L12;
                            } else {
                              if (bc.field_o.length < param2 + param0) {
                                break L12;
                              } else {
                                break L11;
                              }
                            }
                          }
                          bc.field_o = new int[(param2 + param0) * 2];
                          break L11;
                        }
                        L13: {
                          if (null == ql.field_c) {
                            break L13;
                          } else {
                            if (ql.field_c.length >= param0) {
                              qh.field_a = 2147483647;
                              jl.field_d = -2147483648;
                              am.field_e = 2147483647;
                              hc.field_j = -2147483648;
                              rc.field_d = 0;
                              return;
                            } else {
                              break L13;
                            }
                          }
                        }
                        ql.field_c = new boolean[param0 * 2];
                        qh.field_a = 2147483647;
                        jl.field_d = -2147483648;
                        am.field_e = 2147483647;
                        hc.field_j = -2147483648;
                        rc.field_d = 0;
                        return;
                      }
                    }
                  } else {
                    if (param0 <= ld.field_b.length) {
                      if (rh.field_c == null) {
                        L14: {
                          L15: {
                            rh.field_c = new int[param0 * 2];
                            if (bc.field_o == null) {
                              break L15;
                            } else {
                              if (bc.field_o.length < param2 + param0) {
                                break L15;
                              } else {
                                break L14;
                              }
                            }
                          }
                          bc.field_o = new int[(param2 + param0) * 2];
                          break L14;
                        }
                        if (null == ql.field_c) {
                          ql.field_c = new boolean[param0 * 2];
                          qh.field_a = 2147483647;
                          jl.field_d = -2147483648;
                          am.field_e = 2147483647;
                          hc.field_j = -2147483648;
                          rc.field_d = 0;
                          return;
                        } else {
                          if (ql.field_c.length < param0) {
                            ql.field_c = new boolean[param0 * 2];
                            qh.field_a = 2147483647;
                            jl.field_d = -2147483648;
                            am.field_e = 2147483647;
                            hc.field_j = -2147483648;
                            rc.field_d = 0;
                            return;
                          } else {
                            qh.field_a = 2147483647;
                            jl.field_d = -2147483648;
                            am.field_e = 2147483647;
                            hc.field_j = -2147483648;
                            rc.field_d = 0;
                            return;
                          }
                        }
                      } else {
                        if (param0 <= rh.field_c.length) {
                          L16: {
                            L17: {
                              if (bc.field_o == null) {
                                break L17;
                              } else {
                                if (bc.field_o.length < param2 + param0) {
                                  break L17;
                                } else {
                                  break L16;
                                }
                              }
                            }
                            bc.field_o = new int[(param2 + param0) * 2];
                            break L16;
                          }
                          if (null == ql.field_c) {
                            ql.field_c = new boolean[param0 * 2];
                            qh.field_a = 2147483647;
                            jl.field_d = -2147483648;
                            am.field_e = 2147483647;
                            hc.field_j = -2147483648;
                            rc.field_d = 0;
                            return;
                          } else {
                            if (ql.field_c.length < param0) {
                              ql.field_c = new boolean[param0 * 2];
                              qh.field_a = 2147483647;
                              jl.field_d = -2147483648;
                              am.field_e = 2147483647;
                              hc.field_j = -2147483648;
                              rc.field_d = 0;
                              return;
                            } else {
                              qh.field_a = 2147483647;
                              jl.field_d = -2147483648;
                              am.field_e = 2147483647;
                              hc.field_j = -2147483648;
                              rc.field_d = 0;
                              return;
                            }
                          }
                        } else {
                          L18: {
                            L19: {
                              rh.field_c = new int[param0 * 2];
                              if (bc.field_o == null) {
                                break L19;
                              } else {
                                if (bc.field_o.length < param2 + param0) {
                                  break L19;
                                } else {
                                  break L18;
                                }
                              }
                            }
                            bc.field_o = new int[(param2 + param0) * 2];
                            break L18;
                          }
                          if (null == ql.field_c) {
                            ql.field_c = new boolean[param0 * 2];
                            qh.field_a = 2147483647;
                            jl.field_d = -2147483648;
                            am.field_e = 2147483647;
                            hc.field_j = -2147483648;
                            rc.field_d = 0;
                            return;
                          } else {
                            if (ql.field_c.length < param0) {
                              ql.field_c = new boolean[param0 * 2];
                              qh.field_a = 2147483647;
                              jl.field_d = -2147483648;
                              am.field_e = 2147483647;
                              hc.field_j = -2147483648;
                              rc.field_d = 0;
                              return;
                            } else {
                              qh.field_a = 2147483647;
                              jl.field_d = -2147483648;
                              am.field_e = 2147483647;
                              hc.field_j = -2147483648;
                              rc.field_d = 0;
                              return;
                            }
                          }
                        }
                      }
                    } else {
                      L20: {
                        L21: {
                          ld.field_b = new int[param0 * 2];
                          if (rh.field_c == null) {
                            break L21;
                          } else {
                            if (param0 <= rh.field_c.length) {
                              break L20;
                            } else {
                              break L21;
                            }
                          }
                        }
                        rh.field_c = new int[param0 * 2];
                        break L20;
                      }
                      L22: {
                        L23: {
                          if (bc.field_o == null) {
                            break L23;
                          } else {
                            if (bc.field_o.length < param2 + param0) {
                              break L23;
                            } else {
                              break L22;
                            }
                          }
                        }
                        bc.field_o = new int[(param2 + param0) * 2];
                        break L22;
                      }
                      if (null == ql.field_c) {
                        ql.field_c = new boolean[param0 * 2];
                        qh.field_a = 2147483647;
                        jl.field_d = -2147483648;
                        am.field_e = 2147483647;
                        hc.field_j = -2147483648;
                        rc.field_d = 0;
                        return;
                      } else {
                        if (ql.field_c.length < param0) {
                          ql.field_c = new boolean[param0 * 2];
                          qh.field_a = 2147483647;
                          jl.field_d = -2147483648;
                          am.field_e = 2147483647;
                          hc.field_j = -2147483648;
                          rc.field_d = 0;
                          return;
                        } else {
                          qh.field_a = 2147483647;
                          jl.field_d = -2147483648;
                          am.field_e = 2147483647;
                          hc.field_j = -2147483648;
                          rc.field_d = 0;
                          return;
                        }
                      }
                    }
                  }
                } else {
                  break L5;
                }
              }
            }
            L24: {
              L25: {
                th.field_f = new int[param0 * 2];
                if (null == ld.field_b) {
                  break L25;
                } else {
                  if (param0 <= ld.field_b.length) {
                    break L24;
                  } else {
                    break L25;
                  }
                }
              }
              ld.field_b = new int[param0 * 2];
              break L24;
            }
            L26: {
              L27: {
                if (rh.field_c == null) {
                  break L27;
                } else {
                  if (param0 <= rh.field_c.length) {
                    break L26;
                  } else {
                    break L27;
                  }
                }
              }
              rh.field_c = new int[param0 * 2];
              break L26;
            }
            L28: {
              L29: {
                if (bc.field_o == null) {
                  break L29;
                } else {
                  if (bc.field_o.length < param2 + param0) {
                    break L29;
                  } else {
                    break L28;
                  }
                }
              }
              bc.field_o = new int[(param2 + param0) * 2];
              break L28;
            }
            L30: {
              if (null == ql.field_c) {
                break L30;
              } else {
                if (ql.field_c.length >= param0) {
                  qh.field_a = 2147483647;
                  jl.field_d = -2147483648;
                  am.field_e = 2147483647;
                  hc.field_j = -2147483648;
                  rc.field_d = 0;
                  return;
                } else {
                  break L30;
                }
              }
            }
            ql.field_c = new boolean[param0 * 2];
            qh.field_a = 2147483647;
            jl.field_d = -2147483648;
            am.field_e = 2147483647;
            hc.field_j = -2147483648;
            rc.field_d = 0;
            return;
          } else {
            L31: {
              L32: {
                field_d = new int[param0 * 2];
                if (null == vl.field_g) {
                  break L32;
                } else {
                  if (param0 > vl.field_g.length) {
                    break L32;
                  } else {
                    break L31;
                  }
                }
              }
              vl.field_g = new int[param0 * 2];
              break L31;
            }
            L33: {
              if (null == th.field_f) {
                break L33;
              } else {
                if (th.field_f.length >= param0) {
                  if (null == ld.field_b) {
                    L34: {
                      L35: {
                        ld.field_b = new int[param0 * 2];
                        if (rh.field_c == null) {
                          break L35;
                        } else {
                          if (param0 <= rh.field_c.length) {
                            break L34;
                          } else {
                            break L35;
                          }
                        }
                      }
                      rh.field_c = new int[param0 * 2];
                      break L34;
                    }
                    L36: {
                      L37: {
                        if (bc.field_o == null) {
                          break L37;
                        } else {
                          if (bc.field_o.length < param2 + param0) {
                            break L37;
                          } else {
                            break L36;
                          }
                        }
                      }
                      bc.field_o = new int[(param2 + param0) * 2];
                      break L36;
                    }
                    L38: {
                      if (null == ql.field_c) {
                        break L38;
                      } else {
                        if (ql.field_c.length >= param0) {
                          qh.field_a = 2147483647;
                          jl.field_d = -2147483648;
                          am.field_e = 2147483647;
                          hc.field_j = -2147483648;
                          rc.field_d = 0;
                          return;
                        } else {
                          break L38;
                        }
                      }
                    }
                    ql.field_c = new boolean[param0 * 2];
                    qh.field_a = 2147483647;
                    jl.field_d = -2147483648;
                    am.field_e = 2147483647;
                    hc.field_j = -2147483648;
                    rc.field_d = 0;
                    return;
                  } else {
                    if (param0 <= ld.field_b.length) {
                      if (rh.field_c == null) {
                        L39: {
                          L40: {
                            rh.field_c = new int[param0 * 2];
                            if (bc.field_o == null) {
                              break L40;
                            } else {
                              if (bc.field_o.length < param2 + param0) {
                                break L40;
                              } else {
                                break L39;
                              }
                            }
                          }
                          bc.field_o = new int[(param2 + param0) * 2];
                          break L39;
                        }
                        L41: {
                          if (null == ql.field_c) {
                            break L41;
                          } else {
                            if (ql.field_c.length >= param0) {
                              qh.field_a = 2147483647;
                              jl.field_d = -2147483648;
                              am.field_e = 2147483647;
                              hc.field_j = -2147483648;
                              rc.field_d = 0;
                              return;
                            } else {
                              break L41;
                            }
                          }
                        }
                        ql.field_c = new boolean[param0 * 2];
                        qh.field_a = 2147483647;
                        jl.field_d = -2147483648;
                        am.field_e = 2147483647;
                        hc.field_j = -2147483648;
                        rc.field_d = 0;
                        return;
                      } else {
                        if (param0 <= rh.field_c.length) {
                          L42: {
                            L43: {
                              if (bc.field_o == null) {
                                break L43;
                              } else {
                                if (bc.field_o.length < param2 + param0) {
                                  break L43;
                                } else {
                                  break L42;
                                }
                              }
                            }
                            bc.field_o = new int[(param2 + param0) * 2];
                            break L42;
                          }
                          if (null == ql.field_c) {
                            ql.field_c = new boolean[param0 * 2];
                            qh.field_a = 2147483647;
                            jl.field_d = -2147483648;
                            am.field_e = 2147483647;
                            hc.field_j = -2147483648;
                            rc.field_d = 0;
                            return;
                          } else {
                            if (ql.field_c.length < param0) {
                              ql.field_c = new boolean[param0 * 2];
                              qh.field_a = 2147483647;
                              jl.field_d = -2147483648;
                              am.field_e = 2147483647;
                              hc.field_j = -2147483648;
                              rc.field_d = 0;
                              return;
                            } else {
                              qh.field_a = 2147483647;
                              jl.field_d = -2147483648;
                              am.field_e = 2147483647;
                              hc.field_j = -2147483648;
                              rc.field_d = 0;
                              return;
                            }
                          }
                        } else {
                          L44: {
                            L45: {
                              rh.field_c = new int[param0 * 2];
                              if (bc.field_o == null) {
                                break L45;
                              } else {
                                if (bc.field_o.length < param2 + param0) {
                                  break L45;
                                } else {
                                  break L44;
                                }
                              }
                            }
                            bc.field_o = new int[(param2 + param0) * 2];
                            break L44;
                          }
                          L46: {
                            if (null == ql.field_c) {
                              break L46;
                            } else {
                              if (ql.field_c.length >= param0) {
                                qh.field_a = 2147483647;
                                jl.field_d = -2147483648;
                                am.field_e = 2147483647;
                                hc.field_j = -2147483648;
                                rc.field_d = 0;
                                return;
                              } else {
                                break L46;
                              }
                            }
                          }
                          ql.field_c = new boolean[param0 * 2];
                          qh.field_a = 2147483647;
                          jl.field_d = -2147483648;
                          am.field_e = 2147483647;
                          hc.field_j = -2147483648;
                          rc.field_d = 0;
                          return;
                        }
                      }
                    } else {
                      L47: {
                        L48: {
                          ld.field_b = new int[param0 * 2];
                          if (rh.field_c == null) {
                            break L48;
                          } else {
                            if (param0 <= rh.field_c.length) {
                              break L47;
                            } else {
                              break L48;
                            }
                          }
                        }
                        rh.field_c = new int[param0 * 2];
                        break L47;
                      }
                      L49: {
                        L50: {
                          if (bc.field_o == null) {
                            break L50;
                          } else {
                            if (bc.field_o.length < param2 + param0) {
                              break L50;
                            } else {
                              break L49;
                            }
                          }
                        }
                        bc.field_o = new int[(param2 + param0) * 2];
                        break L49;
                      }
                      L51: {
                        if (null == ql.field_c) {
                          break L51;
                        } else {
                          if (ql.field_c.length >= param0) {
                            qh.field_a = 2147483647;
                            jl.field_d = -2147483648;
                            am.field_e = 2147483647;
                            hc.field_j = -2147483648;
                            rc.field_d = 0;
                            return;
                          } else {
                            break L51;
                          }
                        }
                      }
                      ql.field_c = new boolean[param0 * 2];
                      qh.field_a = 2147483647;
                      jl.field_d = -2147483648;
                      am.field_e = 2147483647;
                      hc.field_j = -2147483648;
                      rc.field_d = 0;
                      return;
                    }
                  }
                } else {
                  break L33;
                }
              }
            }
            L52: {
              L53: {
                th.field_f = new int[param0 * 2];
                if (null == ld.field_b) {
                  break L53;
                } else {
                  if (param0 <= ld.field_b.length) {
                    break L52;
                  } else {
                    break L53;
                  }
                }
              }
              ld.field_b = new int[param0 * 2];
              break L52;
            }
            L54: {
              L55: {
                if (rh.field_c == null) {
                  break L55;
                } else {
                  if (param0 <= rh.field_c.length) {
                    break L54;
                  } else {
                    break L55;
                  }
                }
              }
              rh.field_c = new int[param0 * 2];
              break L54;
            }
            L56: {
              L57: {
                if (bc.field_o == null) {
                  break L57;
                } else {
                  if (bc.field_o.length < param2 + param0) {
                    break L57;
                  } else {
                    break L56;
                  }
                }
              }
              bc.field_o = new int[(param2 + param0) * 2];
              break L56;
            }
            L58: {
              if (null == ql.field_c) {
                break L58;
              } else {
                if (ql.field_c.length >= param0) {
                  qh.field_a = 2147483647;
                  jl.field_d = -2147483648;
                  am.field_e = 2147483647;
                  hc.field_j = -2147483648;
                  rc.field_d = 0;
                  return;
                } else {
                  break L58;
                }
              }
            }
            ql.field_c = new boolean[param0 * 2];
            qh.field_a = 2147483647;
            jl.field_d = -2147483648;
            am.field_e = 2147483647;
            hc.field_j = -2147483648;
            rc.field_d = 0;
            return;
          }
        } else {
          L59: {
            L60: {
              if (kk.field_U == null) {
                break L60;
              } else {
                if (param0 > kk.field_U.length) {
                  break L60;
                } else {
                  break L59;
                }
              }
            }
            kk.field_U = new int[param0 * 2];
            break L59;
          }
          L61: {
            L62: {
              if (null == field_d) {
                break L62;
              } else {
                if (field_d.length >= param0) {
                  break L61;
                } else {
                  break L62;
                }
              }
            }
            field_d = new int[param0 * 2];
            break L61;
          }
          L63: {
            L64: {
              if (null == vl.field_g) {
                break L64;
              } else {
                if (param0 > vl.field_g.length) {
                  break L64;
                } else {
                  break L63;
                }
              }
            }
            vl.field_g = new int[param0 * 2];
            break L63;
          }
          L65: {
            if (null == th.field_f) {
              break L65;
            } else {
              if (th.field_f.length >= param0) {
                if (null == ld.field_b) {
                  L66: {
                    L67: {
                      ld.field_b = new int[param0 * 2];
                      if (rh.field_c == null) {
                        break L67;
                      } else {
                        if (param0 <= rh.field_c.length) {
                          break L66;
                        } else {
                          break L67;
                        }
                      }
                    }
                    rh.field_c = new int[param0 * 2];
                    break L66;
                  }
                  L68: {
                    L69: {
                      if (bc.field_o == null) {
                        break L69;
                      } else {
                        if (bc.field_o.length < param2 + param0) {
                          break L69;
                        } else {
                          break L68;
                        }
                      }
                    }
                    bc.field_o = new int[(param2 + param0) * 2];
                    break L68;
                  }
                  L70: {
                    if (null == ql.field_c) {
                      break L70;
                    } else {
                      if (ql.field_c.length >= param0) {
                        qh.field_a = 2147483647;
                        jl.field_d = -2147483648;
                        am.field_e = 2147483647;
                        hc.field_j = -2147483648;
                        rc.field_d = 0;
                        return;
                      } else {
                        break L70;
                      }
                    }
                  }
                  ql.field_c = new boolean[param0 * 2];
                  qh.field_a = 2147483647;
                  jl.field_d = -2147483648;
                  am.field_e = 2147483647;
                  hc.field_j = -2147483648;
                  rc.field_d = 0;
                  return;
                } else {
                  if (param0 <= ld.field_b.length) {
                    if (rh.field_c == null) {
                      L71: {
                        L72: {
                          rh.field_c = new int[param0 * 2];
                          if (bc.field_o == null) {
                            break L72;
                          } else {
                            if (bc.field_o.length < param2 + param0) {
                              break L72;
                            } else {
                              break L71;
                            }
                          }
                        }
                        bc.field_o = new int[(param2 + param0) * 2];
                        break L71;
                      }
                      L73: {
                        if (null == ql.field_c) {
                          break L73;
                        } else {
                          if (ql.field_c.length >= param0) {
                            qh.field_a = 2147483647;
                            jl.field_d = -2147483648;
                            am.field_e = 2147483647;
                            hc.field_j = -2147483648;
                            rc.field_d = 0;
                            return;
                          } else {
                            break L73;
                          }
                        }
                      }
                      ql.field_c = new boolean[param0 * 2];
                      qh.field_a = 2147483647;
                      jl.field_d = -2147483648;
                      am.field_e = 2147483647;
                      hc.field_j = -2147483648;
                      rc.field_d = 0;
                      return;
                    } else {
                      if (param0 <= rh.field_c.length) {
                        L74: {
                          L75: {
                            if (bc.field_o == null) {
                              break L75;
                            } else {
                              if (bc.field_o.length < param2 + param0) {
                                break L75;
                              } else {
                                break L74;
                              }
                            }
                          }
                          bc.field_o = new int[(param2 + param0) * 2];
                          break L74;
                        }
                        if (null == ql.field_c) {
                          ql.field_c = new boolean[param0 * 2];
                          qh.field_a = 2147483647;
                          jl.field_d = -2147483648;
                          am.field_e = 2147483647;
                          hc.field_j = -2147483648;
                          rc.field_d = 0;
                          return;
                        } else {
                          if (ql.field_c.length < param0) {
                            ql.field_c = new boolean[param0 * 2];
                            qh.field_a = 2147483647;
                            jl.field_d = -2147483648;
                            am.field_e = 2147483647;
                            hc.field_j = -2147483648;
                            rc.field_d = 0;
                            return;
                          } else {
                            qh.field_a = 2147483647;
                            jl.field_d = -2147483648;
                            am.field_e = 2147483647;
                            hc.field_j = -2147483648;
                            rc.field_d = 0;
                            return;
                          }
                        }
                      } else {
                        L76: {
                          L77: {
                            rh.field_c = new int[param0 * 2];
                            if (bc.field_o == null) {
                              break L77;
                            } else {
                              if (bc.field_o.length < param2 + param0) {
                                break L77;
                              } else {
                                break L76;
                              }
                            }
                          }
                          bc.field_o = new int[(param2 + param0) * 2];
                          break L76;
                        }
                        L78: {
                          if (null == ql.field_c) {
                            break L78;
                          } else {
                            if (ql.field_c.length >= param0) {
                              qh.field_a = 2147483647;
                              jl.field_d = -2147483648;
                              am.field_e = 2147483647;
                              hc.field_j = -2147483648;
                              rc.field_d = 0;
                              return;
                            } else {
                              break L78;
                            }
                          }
                        }
                        ql.field_c = new boolean[param0 * 2];
                        qh.field_a = 2147483647;
                        jl.field_d = -2147483648;
                        am.field_e = 2147483647;
                        hc.field_j = -2147483648;
                        rc.field_d = 0;
                        return;
                      }
                    }
                  } else {
                    L79: {
                      L80: {
                        ld.field_b = new int[param0 * 2];
                        if (rh.field_c == null) {
                          break L80;
                        } else {
                          if (param0 <= rh.field_c.length) {
                            break L79;
                          } else {
                            break L80;
                          }
                        }
                      }
                      rh.field_c = new int[param0 * 2];
                      break L79;
                    }
                    L81: {
                      L82: {
                        if (bc.field_o == null) {
                          break L82;
                        } else {
                          if (bc.field_o.length < param2 + param0) {
                            break L82;
                          } else {
                            break L81;
                          }
                        }
                      }
                      bc.field_o = new int[(param2 + param0) * 2];
                      break L81;
                    }
                    L83: {
                      if (null == ql.field_c) {
                        break L83;
                      } else {
                        if (ql.field_c.length >= param0) {
                          qh.field_a = 2147483647;
                          jl.field_d = -2147483648;
                          am.field_e = 2147483647;
                          hc.field_j = -2147483648;
                          rc.field_d = 0;
                          return;
                        } else {
                          break L83;
                        }
                      }
                    }
                    ql.field_c = new boolean[param0 * 2];
                    qh.field_a = 2147483647;
                    jl.field_d = -2147483648;
                    am.field_e = 2147483647;
                    hc.field_j = -2147483648;
                    rc.field_d = 0;
                    return;
                  }
                }
              } else {
                break L65;
              }
            }
          }
          L84: {
            L85: {
              th.field_f = new int[param0 * 2];
              if (null == ld.field_b) {
                break L85;
              } else {
                if (param0 <= ld.field_b.length) {
                  break L84;
                } else {
                  break L85;
                }
              }
            }
            ld.field_b = new int[param0 * 2];
            break L84;
          }
          L86: {
            L87: {
              if (rh.field_c == null) {
                break L87;
              } else {
                if (param0 <= rh.field_c.length) {
                  break L86;
                } else {
                  break L87;
                }
              }
            }
            rh.field_c = new int[param0 * 2];
            break L86;
          }
          L88: {
            L89: {
              if (bc.field_o == null) {
                break L89;
              } else {
                if (bc.field_o.length < param2 + param0) {
                  break L89;
                } else {
                  break L88;
                }
              }
            }
            bc.field_o = new int[(param2 + param0) * 2];
            break L88;
          }
          L90: {
            if (null == ql.field_c) {
              break L90;
            } else {
              if (ql.field_c.length >= param0) {
                qh.field_a = 2147483647;
                jl.field_d = -2147483648;
                am.field_e = 2147483647;
                hc.field_j = -2147483648;
                rc.field_d = 0;
                return;
              } else {
                break L90;
              }
            }
          }
          ql.field_c = new boolean[param0 * 2];
          qh.field_a = 2147483647;
          jl.field_d = -2147483648;
          am.field_e = 2147483647;
          hc.field_j = -2147483648;
          rc.field_d = 0;
          return;
        }
    }

    final static void b(int param0) {
        ql.field_e = 0;
        if (param0 < 93) {
            field_g = (qj) null;
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        RuntimeException decompiledCaughtException = null;
        var10 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              ul.d(param2, param1, param3 - -1, 10000536);
              ul.d(param2, param1 - -param0, param3 + 1, 12105912);
              var5_int = 1;
              var6 = param0;
              if (var5_int + param1 >= ul.field_d) {
                break L1;
              } else {
                var5_int = -param1 + ul.field_d;
                break L1;
              }
            }
            L2: {
              if (var6 + param1 > ul.field_a) {
                var6 = -param1 + ul.field_a;
                break L2;
              } else {
                break L2;
              }
            }
            var7 = var5_int;
            L3: while (true) {
              L4: {
                if (var7 >= var6) {
                  var7 = -80 % ((85 - param4) / 33);
                  break L4;
                } else {
                  var8 = 152 - -(var7 * 48 / param0);
                  var9 = var8 << 1882216976 | var8 << 840434568 | var8;
                  ul.field_b[(var7 + param1) * ul.field_f + param2] = var9;
                  ul.field_b[param3 + ul.field_f * (param1 - -var7) - -param2] = var9;
                  var7++;
                  if (var10 != 0) {
                    break L4;
                  } else {
                    continue L3;
                  }
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw dd.a((Throwable) ((Object) var5), "tl.D(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    static {
        field_f = new Random();
        field_c = new ba(7, 0, 1, 1);
        field_h = new va();
    }
}
