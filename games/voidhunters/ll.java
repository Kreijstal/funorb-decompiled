/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

final class ll extends rqa {
    static aja field_p;
    static boolean field_o;

    final static int a() {
        int var1 = -17;
        ho.field_a.a(0);
        if (ff.field_o.e(0)) {
            return 0;
        }
        int discarded$0 = -6269;
        return vq.g();
    }

    ll(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        nc stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        nc stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param1 <= -119) {
                break L1;
              } else {
                field_o = false;
                break L1;
              }
            }
            stackOut_2_0 = new nc((Object) (Object) frb.a(15, 75));
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("ll.A(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    public static void e(int param0) {
        field_p = null;
    }

    final static void e() {
        Exception exception = null;
        Object var1 = null;
        File var1_ref = null;
        Throwable decompiledCaughtException = null;
        var1 = null;
        try {
          L0: {
            var1_ref = lfb.a(ata.field_L, (byte) 34);
            break L0;
          }
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            exception = (Exception) (Object) decompiledCaughtException;
            break L1;
          }
        }
        if (var1_ref == null) {
          return;
        } else {
          int discarded$2 = -48;
          exception = (Exception) asa.a(var1_ref);
          if (!((Object) exception instanceof Hashtable)) {
            return;
          } else {
            wqb.field_e = (Hashtable) (Object) exception;
            return;
          }
        }
    }

    final static int a(boolean param0, byte param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_61_0 = 0;
        int stackIn_65_0 = 0;
        int stackIn_68_0 = 0;
        int stackIn_74_0 = 0;
        int stackIn_77_0 = 0;
        int stackIn_80_0 = 0;
        int stackIn_82_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_64_0 = 0;
        int stackOut_60_0 = 0;
        int stackOut_66_0 = 0;
        int stackOut_81_0 = 0;
        int stackOut_73_0 = 0;
        int stackOut_76_0 = 0;
        int stackOut_67_0 = 0;
        int stackOut_79_0 = 0;
        var5 = VoidHunters.field_G;
        try {
          L0: {
            ao.field_o = ao.field_o + 65536;
            L1: while (true) {
              int discarded$2 = 74;
              if (jca.a(si.field_r, ao.field_o) < 65536) {
                L2: {
                  var2_int = -1;
                  if (lqa.field_p != null) {
                    var2_int = lqa.field_p.length;
                    break L2;
                  } else {
                    if (via.field_a == null) {
                      break L2;
                    } else {
                      var2_int = via.field_a.length;
                      break L2;
                    }
                  }
                }
                L3: {
                  if (var2_int != -1) {
                    L4: {
                      if (si.field_s <= otb.field_q) {
                        break L4;
                      } else {
                        L5: {
                          otb.field_q = otb.field_q + 1;
                          if (si.field_p >= otb.field_q) {
                            break L5;
                          } else {
                            L6: {
                              if (null == lqa.field_p) {
                                break L6;
                              } else {
                                if (null == lqa.field_p[pa.field_b]) {
                                  break L6;
                                } else {
                                  break L5;
                                }
                              }
                            }
                            otb.field_q = otb.field_q - 1;
                            break L4;
                          }
                        }
                        if (otb.field_q < si.field_s) {
                          break L4;
                        } else {
                          if (lqa.field_p[(pa.field_b - -1) % var2_int] == null) {
                            otb.field_q = otb.field_q - 1;
                            break L4;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                    L7: {
                      if (otb.field_q >= si.field_s) {
                        otb.field_q = otb.field_q - si.field_s;
                        if (!gt.field_q) {
                          pa.field_b = pa.field_b - 1;
                          if (pa.field_b >= 0) {
                            break L7;
                          } else {
                            pa.field_b = pa.field_b + var2_int;
                            break L7;
                          }
                        } else {
                          pa.field_b = pa.field_b + 1;
                          if (var2_int <= pa.field_b) {
                            pa.field_b = pa.field_b - var2_int;
                            break L7;
                          } else {
                            break L7;
                          }
                        }
                      } else {
                        break L7;
                      }
                    }
                    if (otb.field_q <= si.field_p) {
                      break L3;
                    } else {
                      gt.field_q = true;
                      break L3;
                    }
                  } else {
                    break L3;
                  }
                }
                L8: {
                  if (so.field_e != null) {
                    L9: {
                      var3 = 357 + -(so.field_e.field_n / 2);
                      var4 = 0;
                      if (pba.field_o == 0) {
                        break L9;
                      } else {
                        if (var3 >= qs.field_a) {
                          break L9;
                        } else {
                          if (qs.field_a < var3 + so.field_e.field_p) {
                            L10: {
                              if (269 - so.field_e.field_q >= oq.field_H) {
                                break L10;
                              } else {
                                if (269 <= oq.field_H) {
                                  break L10;
                                } else {
                                  otb.field_q = si.field_s;
                                  gt.field_q = false;
                                  var4 = 1;
                                  break L10;
                                }
                              }
                            }
                            if (oq.field_H <= 586) {
                              break L9;
                            } else {
                              if (oq.field_H < 586 + so.field_e.field_q) {
                                otb.field_q = si.field_s;
                                var4 = 1;
                                gt.field_q = true;
                                break L9;
                              } else {
                                break L9;
                              }
                            }
                          } else {
                            break L9;
                          }
                        }
                      }
                    }
                    if (var4 != 0) {
                      break L8;
                    } else {
                      if (otb.field_q <= si.field_p) {
                        break L8;
                      } else {
                        if (var3 >= uia.field_b) {
                          break L8;
                        } else {
                          if (so.field_e.field_p + var3 > uia.field_b) {
                            L11: {
                              if (269 + -so.field_e.field_q >= kc.field_b) {
                                break L11;
                              } else {
                                if (kc.field_b >= 269) {
                                  break L11;
                                } else {
                                  otb.field_q = si.field_p;
                                  break L11;
                                }
                              }
                            }
                            if (586 >= kc.field_b) {
                              break L8;
                            } else {
                              if (kc.field_b < so.field_e.field_q + 586) {
                                otb.field_q = si.field_p;
                                break L8;
                              } else {
                                break L8;
                              }
                            }
                          } else {
                            break L8;
                          }
                        }
                      }
                    }
                  } else {
                    break L8;
                  }
                }
                var3 = 1;
                if (param0) {
                  L12: {
                    nna.field_z.a(pmb.a(-1, qs.field_a, oq.field_H), 5620, pmb.a(-1, uia.field_b, kc.field_b));
                    if (nna.field_z.e((byte) -120)) {
                      if (nna.field_z.field_j != 0) {
                        if (nna.field_z.field_j == 1) {
                          stackOut_64_0 = 2;
                          stackIn_65_0 = stackOut_64_0;
                          return stackIn_65_0;
                        } else {
                          break L12;
                        }
                      } else {
                        stackOut_60_0 = 3;
                        stackIn_61_0 = stackOut_60_0;
                        return stackIn_61_0;
                      }
                    } else {
                      break L12;
                    }
                  }
                  stackOut_66_0 = 127;
                  stackIn_68_0 = stackOut_66_0;
                  L13: while (true) {
                    if (!ata.e()) {
                      stackOut_81_0 = 0;
                      stackIn_82_0 = stackOut_81_0;
                      break L0;
                    } else {
                      L14: {
                        nna.field_z.a(false, 0);
                        if (nna.field_z.e((byte) -127)) {
                          if (0 == nna.field_z.field_j) {
                            stackOut_73_0 = 3;
                            stackIn_74_0 = stackOut_73_0;
                            return stackIn_74_0;
                          } else {
                            if (nna.field_z.field_j != 1) {
                              break L14;
                            } else {
                              stackOut_76_0 = 1;
                              stackIn_77_0 = stackOut_76_0;
                              return stackIn_77_0;
                            }
                          }
                        } else {
                          break L14;
                        }
                      }
                      if (pma.field_o != 13) {
                        stackOut_67_0 = 127;
                        stackIn_68_0 = stackOut_67_0;
                        continue L13;
                      } else {
                        stackOut_79_0 = 1;
                        stackIn_80_0 = stackOut_79_0;
                        return stackIn_80_0;
                      }
                    }
                  }
                } else {
                  return 0;
                }
              } else {
                ao.field_o = ao.field_o - si.field_r;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw rta.a((Throwable) (Object) var2, "ll.B(" + param0 + ',' + 40 + ')');
        }
        return stackIn_82_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = true;
    }
}
