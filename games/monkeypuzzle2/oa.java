/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oa extends jk {
    static pj field_J;
    static String field_E;
    static int field_G;
    static ai[] field_D;
    static int field_H;
    static String field_F;
    static boolean field_I;

    public static void a(boolean param0) {
        if (param0) {
          oa.a(false);
          field_J = null;
          field_E = null;
          field_D = null;
          field_F = null;
          return;
        } else {
          field_J = null;
          field_E = null;
          field_D = null;
          field_F = null;
          return;
        }
    }

    private oa(int param0, int param1, int param2, int param3, ml param4, of param5, we param6) {
        super(param0, param1, param2, param3, param4, param5);
        try {
            this.field_v = param6;
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) ((Object) runtimeException), "oa.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean a(byte param0, java.applet.Applet param1) {
        try {
            String var3 = null;
            String[] var4 = null;
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            String var8 = null;
            int stackIn_4_0 = 0;
            int stackIn_13_0 = 0;
            int stackIn_22_0 = 0;
            RuntimeException stackIn_25_0 = null;
            StringBuilder stackIn_25_1 = null;
            RuntimeException stackIn_26_0 = null;
            StringBuilder stackIn_26_1 = null;
            String stackIn_26_2 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            Throwable decompiledCaughtException = null;
            Throwable var2 = null;
            RuntimeException var2_ref = null;
            var7 = MonkeyPuzzle2.field_F ? 1 : 0;
            try {
              L0: {
                if (field_I) {
                  stackIn_4_0 = 1;
                  decompiledRegionSelector1 = 0;
                  break L0;
                } else {
                  try {
                    L1: {
                      var8 = "tuhstatbut";
                      var3 = (String) (mf.a(-26159, "getcookies", param1));
                      var4 = ma.a(126, ';', var3);
                      var5 = 0;
                      L2: while (true) {
                        if (var4.length <= var5) {
                          decompiledRegionSelector0 = 0;
                          break L1;
                        } else {
                          L3: {
                            var6 = var4[var5].indexOf('=');
                            if (-1 < (var6 ^ -1)) {
                              break L3;
                            } else {
                              if (var4[var5].substring(0, var6).trim().equals(var8)) {
                                stackIn_13_0 = 1;
                                decompiledRegionSelector0 = 1;
                                break L1;
                              } else {
                                break L3;
                              }
                            }
                          }
                          var5++;
                          continue L2;
                        }
                      }
                    }
                  } catch (java.lang.Throwable decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L4: {
                      var2 = decompiledCaughtException;
                      decompiledRegionSelector0 = 0;
                      break L4;
                    }
                  }
                  if (decompiledRegionSelector0 == 0) {
                    L5: {
                      if (param0 < -120) {
                        break L5;
                      } else {
                        field_D = (ai[]) null;
                        break L5;
                      }
                    }
                    L6: {
                      if (null == param1.getParameter("tuhstatbut")) {
                        stackIn_22_0 = 0;
                        break L6;
                      } else {
                        stackIn_22_0 = 1;
                        break L6;
                      }
                    }
                    decompiledRegionSelector1 = 1;
                    break L0;
                  } else {
                    decompiledRegionSelector1 = 2;
                    break L0;
                  }
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L7: {
                var2_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_25_0 = (RuntimeException) (var2_ref);

                stackIn_25_1 = new StringBuilder().append("oa.B(").append(param0).append(',');

                if (param1 == null) {
                  stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
                  stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
                  stackIn_26_2 = "null";
                  break L7;
                } else {
                  stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
                  stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
                  stackIn_26_2 = "{...}";
                  break L7;
                }
              }
              throw la.a((Throwable) ((Object) stackIn_26_0), stackIn_26_2 + ')');
            }
            if (decompiledRegionSelector1 == 0) {
              return stackIn_4_0 != 0;
            } else {
              if (decompiledRegionSelector1 == 1) {
                return stackIn_22_0 != 0;
              } else {
                return stackIn_13_0 != 0;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(int param0, int param1, we param2, int param3, int param4, int param5) {
        ee var7 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7_ref = null;
        try {
          L0: {
            L1: {
              L2: {
                super.a(param0, param1, param2, param3, param4 ^ param4, param5);
                var7 = od.field_n;
                if (var7 == null) {
                  break L2;
                } else {
                  if (!this.a(param1, param0, param5, param3, (byte) 45)) {
                    break L2;
                  } else {
                    if (this.field_o instanceof tc) {
                      ((tc) ((Object) this.field_o)).a((oa) (this), (byte) -27, var7);
                      od.field_n = null;
                      break L1;
                    } else {
                      if (!(var7.field_o instanceof tc)) {
                        break L2;
                      } else {
                        ((tc) ((Object) var7.field_o)).a((oa) (this), (byte) -27, var7);
                        od.field_n = null;
                        break L1;
                      }
                    }
                  }
                }
              }
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var7_ref = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var7_ref);

            stackIn_9_1 = new StringBuilder().append("oa.I(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final static void a(float param0, float[] param1, int param2) {
        try {
            param1[1] = param1[1] * param0;
            if (param2 <= 104) {
                field_F = (String) null;
            }
            param1[0] = param1[0] * param0;
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) ((Object) runtimeException), "oa.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static void j(int param0) {
        int stackIn_21_0 = 0;
        int stackIn_69_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        Object var2 = null;
        ki var2_ref = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        il var7 = null;
        var2 = null;
        var6 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            var1_int = 0;
            var2_ref = (ki) ((Object) ok.field_a.a((byte) -117));
            L1: while (true) {
              if (var2_ref == null) {
                var2_int = 0;
                L2: while (true) {
                  if (-4 >= (var2_int ^ -1)) {
                    L3: {
                      var2_ref = (ki) ((Object) ok.field_a.a((byte) -117));
                      if (param0 <= -79) {
                        break L3;
                      } else {
                        oa.a(true);
                        break L3;
                      }
                    }
                    L4: while (true) {
                      if (var2_ref == null) {
                        var2_ref = (ki) ((Object) ok.field_a.a((byte) -117));
                        L5: while (true) {
                          if (var2_ref == null) {
                            vl.field_j = var1_int != 0;
                            break L0;
                          } else {
                            L6: {
                              var2_ref.f(-7);
                              if (var2_ref.field_q - (float)var2_ref.field_y > (float)(hf.field_f.field_k + -90)) {
                                L7: {
                                  if (vl.field_j) {
                                    hf.field_f.d(-115);
                                    vl.field_j = false;
                                    break L7;
                                  } else {
                                    break L7;
                                  }
                                }
                                var1_int = 1;
                                break L6;
                              } else {
                                break L6;
                              }
                            }
                            L8: {
                              L9: {
                                if ((var2_ref.field_w ^ -1) == -2) {
                                  break L9;
                                } else {
                                  if (6 == var2_ref.field_w) {
                                    break L9;
                                  } else {
                                    if (var2_ref.field_w == 5) {
                                      break L9;
                                    } else {
                                      if (var2_ref.field_w != 0) {
                                        break L8;
                                      } else {
                                        break L9;
                                      }
                                    }
                                  }
                                }
                              }
                              if (!pa.a(var2_ref.field_I, (int)(var2_ref.field_B + (float)var2_ref.field_G), (int)var2_ref.field_q + var2_ref.field_y, sb.field_m, 80, 0)) {
                                break L8;
                              } else {
                                L10: {
                                  if (!jj.a(-32680, var2_ref, -80 + (var2_ref.field_G + (int)var2_ref.field_B), var2_ref.field_y + (int)var2_ref.field_q)) {
                                    stackIn_69_0 = 0;
                                    break L10;
                                  } else {
                                    stackIn_69_0 = 1;
                                    break L10;
                                  }
                                }
                                var3 = stackIn_69_0;
                                var2_ref.field_x = var2_ref.field_x | var3 != 0;
                                var2_ref.c((byte) -114);
                                var2_ref = (ki) ((Object) ok.field_a.d((byte) 63));
                                continue L5;
                              }
                            }
                            if (var2_ref.field_w != 3) {
                              var2_ref.c((byte) -114);
                              var2_ref = (ki) ((Object) ok.field_a.d((byte) 63));
                              continue L5;
                            } else {
                              if (-2 != (var2_ref.field_n ^ -1)) {
                                var2_ref.c((byte) -114);
                                var2_ref = (ki) ((Object) ok.field_a.d((byte) 63));
                                continue L5;
                              } else {
                                if ((var2_ref.field_C ^ -1) >= -5) {
                                  var2_ref.c((byte) -114);
                                  var2_ref = (ki) ((Object) ok.field_a.d((byte) 63));
                                  continue L5;
                                } else {
                                  var2_ref.field_t = ri.field_b;
                                  var2_ref.c((byte) -114);
                                  var2_ref = (ki) ((Object) ok.field_a.d((byte) 63));
                                  continue L5;
                                }
                              }
                            }
                          }
                        }
                      } else {
                        var2_ref.d((byte) 116);
                        var2_ref = (ki) ((Object) ok.field_a.d((byte) 63));
                        continue L4;
                      }
                    }
                  } else {
                    var7 = (il) ((Object) rf.field_a.a((byte) -117));
                    L11: while (true) {
                      if (var7 == null) {
                        var2_int++;
                        continue L2;
                      } else {
                        var7.e(5);
                        var7 = (il) ((Object) rf.field_a.d((byte) 63));
                        continue L11;
                      }
                    }
                  }
                }
              } else {
                L12: {
                  if (qb.field_b) {
                    if (2 != var2_ref.field_w) {
                      if (-4 == (var2_ref.field_w ^ -1)) {
                        h.a(4, true);
                        break L12;
                      } else {
                        if (var2_ref.field_w != 5) {
                          if (6 != var2_ref.field_w) {
                            break L12;
                          } else {
                            h.a(1, true);
                            break L12;
                          }
                        } else {
                          h.a(2, true);
                          break L12;
                        }
                      }
                    } else {
                      h.a(3, true);
                      break L12;
                    }
                  } else {
                    break L12;
                  }
                }
                L13: {
                  if (var2_ref.field_w == 6) {
                    if (!var2_ref.field_j) {
                      if (!var2_ref.field_x) {
                        stackIn_21_0 = 1;
                        break L13;
                      } else {
                        stackIn_21_0 = 0;
                        break L13;
                      }
                    } else {
                      stackIn_21_0 = 0;
                      break L13;
                    }
                  } else {
                    stackIn_21_0 = 0;
                    break L13;
                  }
                }
                L14: {
                  L15: {
                    var3 = stackIn_21_0;
                    var2_ref.g(122);
                    if (var3 == 0) {
                      break L15;
                    } else {
                      if (var2_ref.field_j) {
                        break L15;
                      } else {
                        if (-1 <= (var2_ref.field_m ^ -1)) {
                          break L15;
                        } else {
                          var4 = 0;
                          var5 = 0;
                          L16: while (true) {
                            L17: {
                              if (var2_ref.field_m <= var5) {
                                break L17;
                              } else {
                                if (-5 == (var2_ref.field_o[var5].field_w ^ -1)) {
                                  var5++;
                                  continue L16;
                                } else {
                                  var4 = 1;
                                  break L17;
                                }
                              }
                            }
                            if (var4 != 0) {
                              var2_ref.field_q = var2_ref.field_q + 2.0f;
                              break L14;
                            } else {
                              var2_ref.field_t = hd.field_u;
                              break L14;
                            }
                          }
                        }
                      }
                    }
                  }
                  if (!var2_ref.field_x) {
                    break L14;
                  } else {
                    if (var2_ref.field_w != 6) {
                      break L14;
                    } else {
                      if (var2_ref.field_m == 0) {
                        var2_ref.field_t = hd.field_u;
                        break L14;
                      } else {
                        break L14;
                      }
                    }
                  }
                }
                var2_ref = (ki) ((Object) ok.field_a.d((byte) 63));
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw la.a((Throwable) ((Object) var1), "oa.D(" + param0 + ')');
        }
    }

    static {
        field_J = new pj();
        field_G = -1;
        field_E = "Enter the name you'd prefer. This is the name displayed to other players.";
        field_F = "Please try again in a few minutes.";
    }
}
