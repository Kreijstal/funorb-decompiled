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
        int var5 = 0;
        Object var6 = null;
        L0: {
          var5 = ((ei) this).field_g.read(param2, param3, param0);
          if (var5 > 0) {
            ((ei) this).field_c = ((ei) this).field_c + (long)var5;
            break L0;
          } else {
            break L0;
          }
        }
        if (param1 >= -43) {
          var6 = null;
          wd discarded$2 = ei.a(-65, (String[]) null);
          return var5;
        } else {
          return var5;
        }
    }

    final static wd a(int param0, String[] param1) {
        wd var2 = null;
        var2 = new wd(false);
        var2.field_c = param1;
        if (param0 != 2) {
          ei.a(33, true, false, true);
          return var2;
        } else {
          return var2;
        }
    }

    final static void a(int param0, boolean param1, boolean param2, boolean param3) {
        int var5 = 0;
        var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (0 == (param0 ^ -1)) {
          wl.a(19, param1);
          if (!param3) {
            return;
          } else {
            boolean discarded$15 = ei.a(49, -48);
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
                          L0: {
                            if (param0 == -2) {
                              qn.b();
                              break L0;
                            } else {
                              if (param0 == -4) {
                                break L0;
                              } else {
                                if (4 == (param0 ^ -1)) {
                                  qn.b();
                                  if (!param3) {
                                    return;
                                  } else {
                                    boolean discarded$16 = ei.a(49, -48);
                                    return;
                                  }
                                } else {
                                  if (-6 == param0) {
                                    ee.e(0);
                                    if (!param3) {
                                      return;
                                    } else {
                                      boolean discarded$17 = ei.a(49, -48);
                                      return;
                                    }
                                  } else {
                                    if (-7 == param0) {
                                      tl.b((byte) -90);
                                      if (!param3) {
                                        return;
                                      } else {
                                        boolean discarded$18 = ei.a(49, -48);
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
                                          boolean discarded$19 = ei.a(49, -48);
                                          return;
                                        }
                                      } else {
                                        wl.a(61, false);
                                        qn.d(0, 0, so.field_b.field_a, so.field_b.field_g);
                                        rq.field_p[param0].e(false);
                                        if (!param3) {
                                          return;
                                        } else {
                                          boolean discarded$20 = ei.a(49, -48);
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
                            boolean discarded$21 = ei.a(49, -48);
                            return;
                          }
                        } else {
                          wl.a(65, false);
                          qn.d(0, 0, so.field_b.field_a, so.field_b.field_g);
                          rq.field_p[param0].e(param3);
                          if (param3) {
                            boolean discarded$22 = ei.a(49, -48);
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
                          boolean discarded$23 = ei.a(49, -48);
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
                        boolean discarded$24 = ei.a(49, -48);
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
                      boolean discarded$25 = ei.a(49, -48);
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
              if (!param3) {
                return;
              } else {
                boolean discarded$28 = ei.a(49, -48);
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
              boolean discarded$29 = ei.a(49, -48);
              return;
            }
          }
        }
    }

    public static void a(int param0) {
        field_i = null;
        field_e = null;
        if (param0 >= -78) {
            field_e = null;
        }
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
        return -1 <= (param0 ^ -1) ? true : false;
    }

    final void a(int param0, int param1, int param2, byte[] param3) throws IOException {
        if (param0 == 1) {
          if ((((ei) this).field_f ^ -1L) > ((long)param2 + ((ei) this).field_c ^ -1L)) {
            ((ei) this).field_g.seek(((ei) this).field_f);
            ((ei) this).field_g.write(1);
            throw new EOFException();
          } else {
            ((ei) this).field_g.write(param3, param1, param2);
            ((ei) this).field_c = ((ei) this).field_c + (long)param2;
            return;
          }
        } else {
          field_h = 0;
          if ((((ei) this).field_f ^ -1L) > ((long)param2 + ((ei) this).field_c ^ -1L)) {
            ((ei) this).field_g.seek(((ei) this).field_f);
            ((ei) this).field_g.write(1);
            throw new EOFException();
          } else {
            ((ei) this).field_g.write(param3, param1, param2);
            ((ei) this).field_c = ((ei) this).field_c + (long)param2;
            return;
          }
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
        if (-1L == param2) {
            param2 = 9223372036854775807L;
        }
        if (param0.length() > param2) {
            boolean discarded$0 = param0.delete();
        }
        ((ei) this).field_g = new RandomAccessFile(param0, param1);
        ((ei) this).field_c = 0L;
        ((ei) this).field_f = param2;
        int var5 = ((ei) this).field_g.read();
        if ((var5 ^ -1) != 0) {
            // ifne L107
            ((ei) this).field_g.seek(0L);
            ((ei) this).field_g.write(var5);
        } else {
            ((ei) this).field_g.seek(0L);
            ((ei) this).field_g.seek(0L);
        }
        ((ei) this).field_g.seek(0L);
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
