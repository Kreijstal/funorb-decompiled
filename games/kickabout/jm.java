/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jm extends gn {
    static int field_e;
    byte[] field_k;
    static ut[] field_i;
    static int field_h;
    int field_j;
    long field_f;
    static ot field_g;

    final static og a(int param0, int param1, int param2, java.awt.Component param3) {
        try {
            Class var4 = null;
            Throwable var4_ref = null;
            RuntimeException var4_ref2 = null;
            og var5 = null;
            dh var5_ref = null;
            og stackIn_3_0 = null;
            dh stackIn_5_0 = null;
            RuntimeException stackIn_8_0 = null;
            StringBuilder stackIn_8_1 = null;
            RuntimeException stackIn_9_0 = null;
            StringBuilder stackIn_9_1 = null;
            String stackIn_9_2 = null;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                try {
                  L1: {
                    L2: {
                      if (param0 >= 49) {
                        break L2;
                      } else {
                        jm.a(93, true, 85);
                        break L2;
                      }
                    }
                    var4 = Class.forName("pm");
                    var5 = (og) (var4.newInstance());
                    var5.a(30, param1, param2, param3);
                    stackIn_3_0 = (og) (var5);
                    break L1;
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var4_ref = decompiledCaughtException;
                  var5_ref = new dh();
                  ((og) ((Object) var5_ref)).a(30, param1, param2, param3);
                  stackIn_5_0 = (dh) (var5_ref);
                  return (og) ((Object) stackIn_5_0);
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L3: {
                var4_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_8_0 = (RuntimeException) (var4_ref2);

                stackIn_8_1 = new StringBuilder().append("jm.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

                if (param3 == null) {
                  stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
                  stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
                  stackIn_9_2 = "null";
                  break L3;
                } else {
                  stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
                  stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
                  stackIn_9_2 = "{...}";
                  break L3;
                }
              }
              throw nb.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
            }
            return stackIn_3_0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void b(int param0) {
        if (param0 <= 25) {
            jm.a(111);
            pc.field_c = nj.a(82);
            cv.field_d = 0;
            return;
        }
        pc.field_c = nj.a(82);
        cv.field_d = 0;
    }

    final static void a(int param0, boolean param1, int param2) {
        int stackIn_31_0 = 0;
        int stackIn_35_0 = 0;
        int stackIn_38_1 = 0;
        int stackIn_74_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        hn var7 = null;
        tf var8 = null;
        var6 = Kickabout.field_G;
        try {
          L0: {
            L1: {
              if (null != ra.field_G) {
                cv.a((byte) 78);
                break L1;
              } else {
                break L1;
              }
            }
            if (cq.field_h.field_c != param0) {
              L2: {
                if (!(cq.field_h instanceof ta)) {
                  break L2;
                } else {
                  if (!nb.a(param2 + 66)) {
                    break L2;
                  } else {
                    og.a(false);
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              }
              L3: {
                if (!(cq.field_h instanceof ap)) {
                  break L3;
                } else {
                  if (null == um.field_e) {
                    break L3;
                  } else {
                    if (um.field_e.d((byte) 95)) {
                      var8 = um.field_e.e((byte) -123);
                      if (var8 == null) {
                        break L3;
                      } else {
                        if (var8.a(false) > 0) {
                          or.field_d.b(81, (byte) 127);
                          or.field_d.field_n = or.field_d.field_n + 2;
                          var4 = or.field_d.field_n;
                          or.field_d.a(param2 ^ -106, var8.a(false));
                          var7 = (hn) ((Object) var8.g(24009));
                          L4: while (true) {
                            if (var7 == null) {
                              or.field_d.d(-var4 + or.field_d.field_n, 62);
                              break L3;
                            } else {
                              var7.a(1, or.field_d);
                              var7 = (hn) ((Object) var8.c(param2 ^ -33));
                              continue L4;
                            }
                          }
                        } else {
                          break L3;
                        }
                      }
                    } else {
                      break L3;
                    }
                  }
                }
              }
              L5: {
                ra.field_G = lg.a(param0, 24939);
                if (26 != cq.field_h.field_c) {
                  break L5;
                } else {
                  if (ra.field_G instanceof ap) {
                    break L5;
                  } else {
                    if (la.a(param2 ^ -102)) {
                      break L5;
                    } else {
                      or.field_d.b(91, (byte) 114);
                      break L5;
                    }
                  }
                }
              }
              L6: {
                if (-13 != (cq.field_h.field_c ^ -1)) {
                  break L6;
                } else {
                  L7: {
                    if (sk.a((byte) 97) != tu.field_E.field_p) {
                      break L7;
                    } else {
                      if (gn.b((byte) -110) != tu.field_E.field_F) {
                        break L7;
                      } else {
                        L8: {
                          if (tu.field_E.field_A) {
                            stackIn_31_0 = 0;
                            break L8;
                          } else {
                            stackIn_31_0 = 1;
                            break L8;
                          }
                        }
                        if (stackIn_31_0 == (ei.field_n ? 1 : 0)) {
                          break L7;
                        } else {
                          L9: {
                            if (tu.field_E.field_d) {
                              stackIn_35_0 = 0;
                              break L9;
                            } else {
                              stackIn_35_0 = 1;
                              break L9;
                            }
                          }
                          L10: {


                            if (pf.field_c) {

                              stackIn_38_1 = 0;
                              break L10;
                            } else {

                              stackIn_38_1 = 1;
                              break L10;
                            }
                          }
                          if (stackIn_35_0 != stackIn_38_1) {
                            break L7;
                          } else {
                            L11: {
                              if (-2 != (tb.field_v ^ -1)) {
                                break L11;
                              } else {
                                if (!tu.field_E.field_L) {
                                  break L7;
                                } else {
                                  break L11;
                                }
                              }
                            }
                            if (tb.field_v != 0) {
                              break L6;
                            } else {
                              if (tu.field_E.field_L) {
                                break L7;
                              } else {
                                break L6;
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                  L12: {
                    var3_int = 0;
                    if (ei.field_n) {
                      var3_int = var3_int | 1;
                      break L12;
                    } else {
                      break L12;
                    }
                  }
                  L13: {
                    if ((tb.field_v ^ -1) != -2) {
                      break L13;
                    } else {
                      var3_int = var3_int | 2;
                      break L13;
                    }
                  }
                  L14: {
                    if (!pf.field_c) {
                      break L14;
                    } else {
                      var3_int = var3_int | 4;
                      break L14;
                    }
                  }
                  L15: {
                    var4 = gn.b((byte) -65);
                    if (255 >= var4) {
                      break L15;
                    } else {
                      var4 = 255;
                      break L15;
                    }
                  }
                  L16: {
                    var5 = sk.a((byte) 97);
                    if (-256 <= (var5 ^ -1)) {
                      break L16;
                    } else {
                      var5 = 255;
                      break L16;
                    }
                  }
                  L17: {
                    if (!la.a(100)) {
                      or.field_d.b(65, (byte) 119);
                      or.field_d.a(103, var5);
                      or.field_d.a(param2 ^ -113, var4);
                      or.field_d.a(param2 + 119, var3_int);
                      break L17;
                    } else {
                      break L17;
                    }
                  }
                  tu.field_E.field_p = sk.a((byte) 97);
                  tu.field_E.field_F = gn.b((byte) -95);
                  tu.field_E.field_d = pf.field_c;
                  tu.field_E.field_A = ei.field_n;
                  break L6;
                }
              }
              L18: {
                if (param2 == -2) {
                  break L18;
                } else {
                  field_e = -71;
                  break L18;
                }
              }
              L19: {
                if (!(cq.field_h instanceof qt)) {
                  ra.field_G.field_b = cq.field_h.field_c;
                  break L19;
                } else {
                  if (!(ra.field_G instanceof qt)) {
                    ra.field_G.field_b = cq.field_h.field_c;
                    break L19;
                  } else {
                    if (((qt) ((Object) ra.field_G)).a((qt) ((Object) cq.field_h), -4319)) {
                      break L19;
                    } else {
                      ra.field_G.field_b = cq.field_h.field_c;
                      break L19;
                    }
                  }
                }
              }
              L20: {
                L21: {
                  if (!(cq.field_h instanceof qt)) {
                    break L21;
                  } else {
                    if (!(ra.field_G instanceof qt)) {
                      break L21;
                    } else {
                      L22: {
                        if (!((qt) ((Object) ra.field_G)).a((qt) ((Object) cq.field_h), -4319)) {
                          stackIn_74_0 = 55;
                          break L22;
                        } else {
                          stackIn_74_0 = 56;
                          break L22;
                        }
                      }
                      var3_int = stackIn_74_0;
                      sp.c(var3_int, -119);
                      break L20;
                    }
                  }
                }
                L23: {
                  if (ra.field_G instanceof qt) {
                    break L23;
                  } else {
                    if (!(cq.field_h instanceof qt)) {
                      break L23;
                    } else {
                      sp.c(55, 22);
                      break L20;
                    }
                  }
                }
                if (cq.field_h instanceof qt) {
                  break L20;
                } else {
                  if (!(ra.field_G instanceof qt)) {
                    break L20;
                  } else {
                    sp.c(56, 49);
                    break L20;
                  }
                }
              }
              ce.field_I = 0;
              if (!(ra.field_G instanceof bd)) {
                if (ra.field_G instanceof qt) {
                  ((qt) ((Object) ra.field_G)).a(param2 + 2, 0, param1);
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  return;
                }
              } else {
                ((qt) ((Object) ra.field_G)).a(0, -1, param1);
                eq.a(1, param1);
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
          throw nb.a((Throwable) ((Object) var3), "jm.D(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    final static void a(int param0, int param1, int param2) {
        long var3;
        float var5;
        int var6;
        int var7;
        int var8;
        var3 = nj.a(-127);
        if (var3 >= up.field_b) {
          up.field_b = var3 + 25L;
          var5 = (float)param2 / (float)param0;
          var6 = vr.a(-2, rl.field_r);
          var7 = vr.a(-2, 1 + rl.field_r);
          if (param1 != 9863) {
            field_h = -66;
            var8 = var7 - var6;
            ga.field_R = (float)var6 + (float)var8 * var5;
            mf.field_Db = dg.field_c + ": " + (int)ga.field_R + "%";
            nm.field_g.b((byte) 63);
            return;
          } else {
            var8 = var7 - var6;
            ga.field_R = (float)var6 + (float)var8 * var5;
            mf.field_Db = dg.field_c + ": " + (int)ga.field_R + "%";
            nm.field_g.b((byte) 63);
            return;
          }
        } else {
          return;
        }
    }

    public static void a(int param0) {
        field_g = null;
        field_i = null;
        int var1 = 43 / ((32 - param0) / 58);
    }

    jm(long param0, int param1, byte[] param2) {
        try {
            this.field_f = param0;
            this.field_j = param1;
            this.field_k = param2;
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) ((Object) runtimeException), "jm.<init>(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
