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
        String[] var6 = null;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var5_int = this.field_g.read(param2, param3, param0);
              if (var5_int > 0) {
                this.field_c = this.field_c + (long)var5_int;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (param1 < -43) {
                break L2;
              } else {
                var6 = (String[]) null;
                ei.a(-65, (String[]) null);
                break L2;
              }
            }
            stackIn_6_0 = var5_int;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var5);

            stackIn_9_1 = new StringBuilder().append("ei.E(").append(param0).append(',').append(param1).append(',');

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
          throw ig.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param3 + ')');
        }
        return stackIn_6_0;
    }

    final static wd a(int param0, String[] param1) {
        wd var2 = null;
        RuntimeException var2_ref = null;
        wd stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
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
            stackIn_3_0 = (wd) (var2);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var2_ref);

            stackIn_6_1 = new StringBuilder().append("ei.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    final static void a(int param0, boolean param1, boolean param2, boolean param3) {
        int var5;
        var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (0 == (param0 ^ -1)) {
          wl.a(19, param1);
          if (!param3) {
            return;
          } else {
            ei.a(49, -48);
            return;
          }
        } else {
          if (19 != param0) {
            if (param0 != 25) {
              if (param0 != 1) {
                if (-25 != (param0 ^ -1)) {
                  if (param0 != 2) {
                    if (-18 != (param0 ^ -1)) {
                      if (-4 != (param0 ^ -1)) {
                        if (param0 != 4) {
                          if (param0 == -2) {
                            qn.b();
                            if (!param3) {
                              return;
                            } else {
                              ei.a(49, -48);
                              return;
                            }
                          } else {
                            if (param0 == -4) {
                              qn.b();
                              if (!param3) {
                                return;
                              } else {
                                ei.a(49, -48);
                                return;
                              }
                            } else {
                              if (4 == (param0 ^ -1)) {
                                qn.b();
                                if (!param3) {
                                  return;
                                } else {
                                  ei.a(49, -48);
                                  return;
                                }
                              } else {
                                if (-6 == param0) {
                                  ee.e(0);
                                  if (!param3) {
                                    return;
                                  } else {
                                    ei.a(49, -48);
                                    return;
                                  }
                                } else {
                                  if (-7 == param0) {
                                    tl.b((byte) -90);
                                    if (!param3) {
                                      return;
                                    } else {
                                      ei.a(49, -48);
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
                                        ei.a(49, -48);
                                        return;
                                      }
                                    } else {
                                      wl.a(61, false);
                                      qn.d(0, 0, so.field_b.field_a, so.field_b.field_g);
                                      rq.field_p[param0].e(false);
                                      if (!param3) {
                                        return;
                                      } else {
                                        ei.a(49, -48);
                                        return;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                        } else {
                          wl.a(65, false);
                          qn.d(0, 0, so.field_b.field_a, so.field_b.field_g);
                          rq.field_p[param0].e(param3);
                          if (param3) {
                            ei.a(49, -48);
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
                          ei.a(49, -48);
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
                        ei.a(49, -48);
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
                      ei.a(49, -48);
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
                    ei.a(49, -48);
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
                  ei.a(49, -48);
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
                ei.a(49, -48);
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
              ei.a(49, -48);
              return;
            }
          }
        }
    }

    public static void a(int param0) {
        field_i = null;
        field_e = null;
        if (param0 >= -78) {
            field_e = (int[]) null;
        }
    }

    protected final void finalize() throws Throwable {
        if (null != this.field_g) {
            System.out.println("");
            this.b(783);
        }
    }

    final void b(int param0) throws IOException {
        if (param0 != 783) {
            return;
        }
        if (!(null == this.field_g)) {
            this.field_g.close();
            this.field_g = null;
        }
    }

    final static boolean a(int param0, int param1) {
        if (param1 != 11906) {
            return false;
        }
        return -1 <= (param0 ^ -1) ? true : false;
    }

    final void a(int param0, int param1, int param2, byte[] param3) throws IOException {
        try {
            if (param0 != 1) {
                field_h = 0;
            }
            if ((this.field_f ^ -1L) > ((long)param2 + this.field_c ^ -1L)) {
                this.field_g.seek(this.field_f);
                this.field_g.write(1);
                throw new EOFException();
            }
            this.field_g.write(param3, param1, param2);
            this.field_c = this.field_c + (long)param2;
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "ei.H(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(long param0, int param1) throws IOException {
        this.field_g.seek(param0);
        this.field_c = param0;
        if (param1 < 102) {
            field_d = -103;
            return;
        }
    }

    final long a(boolean param0) throws IOException {
        if (!param0) {
            field_d = 51;
            return this.field_g.length();
        }
        return this.field_g.length();
    }

    ei(File param0, String param1, long param2) throws IOException {
        int var5_int = 0;
        try {
            if (-1L == param2) {
                param2 = 9223372036854775807L;
            }
            if (param0.length() > param2) {
                param0.delete();
            }
            this.field_g = new RandomAccessFile(param0, param1);
            this.field_c = 0L;
            this.field_f = param2;
            var5_int = this.field_g.read();
            if ((var5_int ^ -1) != 0 && !param1.equals("r")) {
                this.field_g.seek(0L);
                this.field_g.write(var5_int);
            }
            this.field_g.seek(0L);
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "ei.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        field_i = "Allies";
        field_b = false;
        field_e = ce.a(-104);
        field_d = 0;
    }
}
