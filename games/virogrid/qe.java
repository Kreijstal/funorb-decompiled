/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class qe extends mi implements bo {
    private wa field_g;
    static String field_j;
    static boolean field_k;
    static int[] field_h;
    static int[] field_i;
    static int field_m;
    static String field_l;

    public static void b(byte param0) {
        field_i = null;
        field_l = null;
        if (param0 != -36) {
          qe.b((byte) 64);
          field_h = null;
          field_j = null;
          return;
        } else {
          field_h = null;
          field_j = null;
          return;
        }
    }

    qe(wa param0) {
        try {
            ((qe) this).field_g = param0;
        } catch (RuntimeException runtimeException) {
            throw kg.a((Throwable) (Object) runtimeException, "qe.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(byte param0, int param1) {
        pe var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = Virogrid.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              ag.field_c = param1;
              if (param0 >= 34) {
                break L1;
              } else {
                field_i = null;
                break L1;
              }
            }
            var2 = (pe) (Object) co.field_a.a((byte) -105);
            L2: while (true) {
              if (var2 == null) {
                L3: {
                  if (null == gk.field_f) {
                    break L3;
                  } else {
                    var2 = (pe) (Object) gk.field_f.a((byte) -124);
                    L4: while (true) {
                      if (var2 == null) {
                        break L3;
                      } else {
                        L5: {
                          if (!var2.field_h.b(false)) {
                            var2.a(false);
                            break L5;
                          } else {
                            var2.field_g.f(128 + var2.field_i * ag.field_c >> 8);
                            break L5;
                          }
                        }
                        var2 = (pe) (Object) gk.field_f.a(16213);
                        continue L4;
                      }
                    }
                  }
                }
                break L0;
              } else {
                L6: {
                  if (var2.field_h.b(false)) {
                    var2.field_g.f(ag.field_c * var2.field_i + 128 >> 8);
                    break L6;
                  } else {
                    var2.a(false);
                    break L6;
                  }
                }
                var2 = (pe) (Object) co.field_a.a(16213);
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw kg.a((Throwable) (Object) var2_ref, "qe.K(" + param0 + ',' + param1 + ')');
        }
    }

    abstract String a(int param0, String param1);

    public final void a(boolean param0, wa param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              if (!param0) {
                break L1;
              } else {
                boolean discarded$2 = ((qe) this).a(true);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("qe.T(").append(param0).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw kg.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ')');
        }
    }

    final wl f(int param0) {
        if (param0 != -843083384) {
            return null;
        }
        return ((qe) this).a(((qe) this).field_g.field_n, true);
    }

    final static int g() {
        if (dj.field_n >= 2) {
          if (ih.field_c != 0) {
            if (sj.field_l != null) {
              if (!sj.field_l.c(0)) {
                return 14;
              } else {
                if (!sj.field_l.a("", true)) {
                  return 29;
                } else {
                  if (sj.field_l.a((byte) -102, "")) {
                    if (td.field_a.c(0)) {
                      if (td.field_a.a((byte) -102, "commonui")) {
                        if (!jf.field_j.c(0)) {
                          return 71;
                        } else {
                          if (!jf.field_j.a((byte) -102, "commonui")) {
                            return 80;
                          } else {
                            if (qn.field_I.c(0)) {
                              if (qn.field_I.b(25867)) {
                                return 100;
                              } else {
                                return 86;
                              }
                            } else {
                              return 82;
                            }
                          }
                        }
                      } else {
                        return 57;
                      }
                    } else {
                      return 43;
                    }
                  } else {
                    return 29;
                  }
                }
              }
            } else {
              if (td.field_a.c(0)) {
                if (td.field_a.a((byte) -102, "commonui")) {
                  if (!jf.field_j.c(0)) {
                    return 71;
                  } else {
                    if (!jf.field_j.a((byte) -102, "commonui")) {
                      return 80;
                    } else {
                      if (qn.field_I.c(0)) {
                        if (!qn.field_I.b(25867)) {
                          return 86;
                        } else {
                          return 100;
                        }
                      } else {
                        return 82;
                      }
                    }
                  }
                } else {
                  return 57;
                }
              } else {
                return 43;
              }
            }
          } else {
            if (td.field_a.c(0)) {
              if (td.field_a.a((byte) -102, "commonui")) {
                if (!jf.field_j.c(0)) {
                  return 50;
                } else {
                  if (jf.field_j.a((byte) -102, "commonui")) {
                    if (qn.field_I.c(0)) {
                      if (qn.field_I.b(25867)) {
                        return 100;
                      } else {
                        return 80;
                      }
                    } else {
                      return 70;
                    }
                  } else {
                    return 60;
                  }
                }
              } else {
                return 40;
              }
            } else {
              return 20;
            }
          }
        } else {
          return 0;
        }
    }

    public final void a(wa param0, int param1) {
        if (param1 != 13) {
            return;
        }
        try {
            ((qe) this).b(false);
        } catch (RuntimeException runtimeException) {
            throw kg.a((Throwable) (Object) runtimeException, "qe.V(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final String c(int param0) {
        if (param0 >= -86) {
            return null;
        }
        return ((qe) this).a(-26358, ((qe) this).field_g.field_n);
    }

    final static int b(int param0, int param1) {
        int var2 = param1 >>> 1;
        var2 = var2 | var2 >>> 1;
        var2 = var2 | var2 >>> 2;
        var2 = var2 | var2 >>> 4;
        var2 = var2 | var2 >>> 8;
        var2 = var2 | var2 >>> 16;
        return ~var2 & param1;
    }

    public final boolean a(boolean param0) {
        Object var3 = null;
        int stackIn_5_0 = 0;
        int stackIn_11_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        if (param0) {
          if (null != ((qe) this).field_g.field_n) {
            if (0 == ((qe) this).field_g.field_n.length()) {
              return true;
            } else {
              return false;
            }
          } else {
            stackOut_9_0 = 1;
            stackIn_11_0 = stackOut_9_0;
            return stackIn_11_0 != 0;
          }
        } else {
          var3 = null;
          wl discarded$5 = ((qe) this).a((String) null, false);
          if (null == ((qe) this).field_g.field_n) {
            return true;
          } else {
            L0: {
              if (0 != ((qe) this).field_g.field_n.length()) {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                break L0;
              } else {
                stackOut_3_0 = 1;
                stackIn_5_0 = stackOut_3_0;
                break L0;
              }
            }
            return stackIn_5_0 != 0;
          }
        }
    }

    abstract wl a(String param0, boolean param1);

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = "Rating";
        field_l = "Please log in to access this feature.";
        field_h = new int[4];
        field_i = new int[8192];
    }
}
