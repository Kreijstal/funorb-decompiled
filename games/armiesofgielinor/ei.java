/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ei {
    private long field_f;
    static int field_h;
    static String field_i;
    private RandomAccessFile field_g;
    static int[] field_e;
    static boolean field_b;
    static int field_a;
    private long field_c;
    static volatile int field_d;

    final int a(int param0, int param1, byte[] param2, int param3) throws IOException {
        int var5_int = 0;
        RuntimeException var5 = null;
        Object var6 = null;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              var5_int = ((ei) this).field_g.read(param2, param3, param0);
              if (var5_int > 0) {
                ((ei) this).field_c = ((ei) this).field_c + (long)var5_int;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (param1 < -43) {
                break L2;
              } else {
                var6 = null;
                wd discarded$2 = ei.a(-65, (String[]) null);
                break L2;
              }
            }
            stackOut_5_0 = var5_int;
            stackIn_6_0 = stackOut_5_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var5;
            stackOut_7_1 = new StringBuilder().append("ei.E(").append(param0).append(44).append(param1).append(44);
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param2 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 44 + param3 + 41);
        }
        return stackIn_6_0;
    }

    final static wd a(int param0, String[] param1) {
        wd var2 = null;
        RuntimeException var2_ref = null;
        wd stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        wd stackOut_2_0 = null;
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
              var2 = new wd(false);
              var2.field_c = param1;
              if (param0 == 2) {
                break L1;
              } else {
                ei.a(33, true, false, true);
                break L1;
              }
            }
            stackOut_2_0 = (wd) var2;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var2_ref;
            stackOut_4_1 = new StringBuilder().append("ei.B(").append(param0).append(44);
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
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
          throw ig.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 41);
        }
        return stackIn_3_0;
    }

    final static void a(int param0, boolean param1, boolean param2, boolean param3) {
        int var5 = 0;
        var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (param0 == -1) {
          wl.a(19, true);
          if (!param3) {
            return;
          } else {
            boolean discarded$17 = ei.a(49, -48);
            return;
          }
        } else {
          if (19 != param0) {
            if (param0 != 25) {
              if (param0 != 1) {
                if (param0 != 24) {
                  if (param0 != 2) {
                    if (param0 != 17) {
                      if (param0 != 3) {
                        if (param0 != 4) {
                          L0: {
                            if (param0 == -2) {
                              qn.b();
                              break L0;
                            } else {
                              if (param0 == -4) {
                                break L0;
                              } else {
                                if (param0 == -5) {
                                  qn.b();
                                  if (!param3) {
                                    return;
                                  } else {
                                    boolean discarded$18 = ei.a(49, -48);
                                    return;
                                  }
                                } else {
                                  if (-6 == param0) {
                                    int discarded$19 = 0;
                                    ee.e();
                                    if (!param3) {
                                      return;
                                    } else {
                                      boolean discarded$20 = ei.a(49, -48);
                                      return;
                                    }
                                  } else {
                                    if (-7 == param0) {
                                      int discarded$21 = -90;
                                      tl.b();
                                      if (!param3) {
                                        return;
                                      } else {
                                        boolean discarded$22 = ei.a(49, -48);
                                        return;
                                      }
                                    } else {
                                      if (!param2) {
                                        jg.field_m.f(so.field_b.field_a / 2 - jg.field_m.field_A / 2, -(jg.field_m.field_x / 2) + so.field_b.field_g / 2);
                                        qn.d(0, 0, so.field_b.field_a, so.field_b.field_g);
                                        rq.field_p[param0].e(false);
                                        if (!param3) {
                                          return;
                                        } else {
                                          boolean discarded$23 = ei.a(49, -48);
                                          return;
                                        }
                                      } else {
                                        wl.a(61, false);
                                        qn.d(0, 0, so.field_b.field_a, so.field_b.field_g);
                                        rq.field_p[param0].e(false);
                                        if (!param3) {
                                          return;
                                        } else {
                                          boolean discarded$24 = ei.a(49, -48);
                                          return;
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                          qn.b();
                          if (!param3) {
                            return;
                          } else {
                            boolean discarded$25 = ei.a(49, -48);
                            return;
                          }
                        } else {
                          wl.a(65, false);
                          qn.d(0, 0, so.field_b.field_a, so.field_b.field_g);
                          rq.field_p[param0].e(param3);
                          if (param3) {
                            boolean discarded$26 = ei.a(49, -48);
                            return;
                          } else {
                            return;
                          }
                        }
                      } else {
                        wl.a(65, false);
                        qn.d(0, 0, so.field_b.field_a, so.field_b.field_g);
                        rq.field_p[param0].e(param3);
                        if (param3) {
                          boolean discarded$27 = ei.a(49, -48);
                          return;
                        } else {
                          return;
                        }
                      }
                    } else {
                      wl.a(65, false);
                      qn.d(0, 0, so.field_b.field_a, so.field_b.field_g);
                      rq.field_p[param0].e(param3);
                      if (param3) {
                        boolean discarded$28 = ei.a(49, -48);
                        return;
                      } else {
                        return;
                      }
                    }
                  } else {
                    wl.a(65, false);
                    qn.d(0, 0, so.field_b.field_a, so.field_b.field_g);
                    rq.field_p[param0].e(param3);
                    if (param3) {
                      boolean discarded$29 = ei.a(49, -48);
                      return;
                    } else {
                      return;
                    }
                  }
                } else {
                  wl.a(65, false);
                  qn.d(0, 0, so.field_b.field_a, so.field_b.field_g);
                  rq.field_p[param0].e(param3);
                  if (param3) {
                    boolean discarded$30 = ei.a(49, -48);
                    return;
                  } else {
                    return;
                  }
                }
              } else {
                wl.a(65, false);
                qn.d(0, 0, so.field_b.field_a, so.field_b.field_g);
                rq.field_p[param0].e(param3);
                if (param3) {
                  boolean discarded$31 = ei.a(49, -48);
                  return;
                } else {
                  return;
                }
              }
            } else {
              wl.a(65, false);
              qn.d(0, 0, so.field_b.field_a, so.field_b.field_g);
              rq.field_p[param0].e(param3);
              if (!param3) {
                return;
              } else {
                boolean discarded$32 = ei.a(49, -48);
                return;
              }
            }
          } else {
            wl.a(65, false);
            qn.d(0, 0, so.field_b.field_a, so.field_b.field_g);
            rq.field_p[param0].e(param3);
            if (!param3) {
              return;
            } else {
              boolean discarded$33 = ei.a(49, -48);
              return;
            }
          }
        }
    }

    public static void a() {
        field_i = null;
        field_e = null;
    }

    protected final void finalize() throws Throwable {
        if (null != ((ei) this).field_g) {
            System.out.println("");
            ((ei) this).b(783);
        }
    }

    final void b(int param0) throws IOException {
        if (param0 != 783) {
            return;
        }
        if (!(null == ((ei) this).field_g)) {
            ((ei) this).field_g.close();
            ((ei) this).field_g = null;
        }
    }

    final static boolean a(int param0, int param1) {
        if (param1 != 11906) {
            return false;
        }
        return param0 <= 0 ? true : false;
    }

    final void a(int param0, int param1, int param2, byte[] param3) throws IOException {
        try {
            if (param0 != 1) {
                field_h = 0;
            }
            if (~((ei) this).field_f > ~((long)param2 + ((ei) this).field_c)) {
                ((ei) this).field_g.seek(((ei) this).field_f);
                ((ei) this).field_g.write(1);
                throw new EOFException();
            }
            ((ei) this).field_g.write(param3, param1, param2);
            ((ei) this).field_c = ((ei) this).field_c + (long)param2;
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) (Object) runtimeException, "ei.H(" + param0 + 44 + param1 + 44 + param2 + 44 + (param3 != null ? "{...}" : "null") + 41);
        }
    }

    final void a(long param0, int param1) throws IOException {
        ((ei) this).field_g.seek(param0);
        ((ei) this).field_c = param0;
        if (param1 < 102) {
            field_d = -103;
            return;
        }
    }

    final long a(boolean param0) throws IOException {
        if (!param0) {
            field_d = 51;
            return ((ei) this).field_g.length();
        }
        return ((ei) this).field_g.length();
    }

    ei(File param0, String param1, long param2) throws IOException {
        int var5_int = 0;
        try {
            if (-1L == param2) {
                param2 = 9223372036854775807L;
            }
            if (param0.length() > param2) {
                boolean discarded$0 = param0.delete();
            }
            ((ei) this).field_g = new RandomAccessFile(param0, param1);
            ((ei) this).field_c = 0L;
            ((ei) this).field_f = param2;
            var5_int = ((ei) this).field_g.read();
            if (var5_int != -1) {
                if (!param1.equals((Object) (Object) "r")) {
                    ((ei) this).field_g.seek(0L);
                    ((ei) this).field_g.write(var5_int);
                }
            }
            ((ei) this).field_g.seek(0L);
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) (Object) runtimeException, "ei.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = "Allies";
        field_b = false;
        field_e = ce.a(-104);
        field_d = 0;
    }
}
