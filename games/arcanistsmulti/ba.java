/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ba {
    int field_n;
    byte[] field_l;
    static long field_a;
    byte[] field_h;
    static String field_c;
    int field_g;
    int field_e;
    int field_i;
    static int[] field_k;
    int field_m;
    int field_d;
    static String field_f;
    static int[] field_o;
    static String field_b;
    int field_j;

    public static void a(byte param0) {
        field_f = null;
        field_k = null;
        if (param0 <= 75) {
            return;
        }
        field_c = null;
        field_o = null;
        field_b = null;
    }

    final static String a(boolean param0, CharSequence param1, boolean param2) {
        int var3 = 0;
        String var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = ArcanistsMulti.field_G ? 1 : 0;
        if (param1 != null) {
          L0: {
            var3 = param1.length();
            if (1 > var3) {
              break L0;
            } else {
              if (var3 <= 12) {
                L1: {
                  var4 = gk.a(param1, -13);
                  if (var4 == null) {
                    break L1;
                  } else {
                    if ((var4.length() ^ -1) <= -2) {
                      L2: {
                        if (rk.a((byte) 117, var4.charAt(0))) {
                          break L2;
                        } else {
                          if (!rk.a((byte) 118, var4.charAt(-1 + var4.length()))) {
                            var5 = 0;
                            var6 = 0;
                            if (param2) {
                              L3: while (true) {
                                if (var6 >= param1.length()) {
                                  if ((var5 ^ -1) < -1) {
                                    return ua.field_H;
                                  } else {
                                    return null;
                                  }
                                } else {
                                  L4: {
                                    var7 = param1.charAt(var6);
                                    if (rk.a((byte) 123, (char) var7)) {
                                      var5++;
                                      break L4;
                                    } else {
                                      var5 = 0;
                                      break L4;
                                    }
                                  }
                                  if (2 <= var5) {
                                    if (!param0) {
                                      return ff.field_e;
                                    } else {
                                      var6++;
                                      continue L3;
                                    }
                                  } else {
                                    var6++;
                                    continue L3;
                                  }
                                }
                              }
                            } else {
                              return null;
                            }
                          } else {
                            break L2;
                          }
                        }
                      }
                      return ua.field_H;
                    } else {
                      break L1;
                    }
                  }
                }
                return lm.field_c;
              } else {
                break L0;
              }
            }
          }
          return lm.field_c;
        } else {
          return lm.field_c;
        }
    }

    final static void a(int param0) {
        if (param0 < 80) {
            ba.a((byte) 114);
        }
        g.field_e.a((byte) -92, (qm) (Object) new td());
    }

    final static void c(int param0) {
        if (param0 != 0) {
            ba.a(-120);
        }
        p.field_b.f(-120);
        if (null == ci.field_c) {
            ci.field_c = new gd(p.field_b, fg.field_o);
        }
        p.field_b.b((qm) (Object) ci.field_c, param0 + 15637);
    }

    final static void b(int param0) {
        try {
            IOException iOException = null;
            int var1 = 0;
            IOException var2 = null;
            int var3 = 0;
            Throwable decompiledCaughtException = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var3 = ArcanistsMulti.field_G ? 1 : 0;
                        if (jl.field_c == null) {
                            statePc = 2;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    }
                    case 1: {
                        jl.field_c.c(param0 ^ 16700264);
                        statePc = 2;
                        continue stateLoop;
                    }
                    case 2: {
                        if (null == ed.field_yb) {
                            statePc = 4;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    }
                    case 3: {
                        ed.field_yb.a((byte) 90);
                        statePc = 4;
                        continue stateLoop;
                    }
                    case 4: {
                        if (null != bm.field_e) {
                            statePc = 6;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    }
                    case 6: {
                        try {
                            bm.field_e.c((byte) -101);
                            statePc = 9;
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 8;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        iOException = (IOException) (Object) caughtException;
                        statePc = 9;
                        continue stateLoop;
                    }
                    case 9: {
                        if (null == bb.field_b) {
                            statePc = 17;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    }
                    case 10: {
                        var1 = 0;
                        statePc = 11;
                        continue stateLoop;
                    }
                    case 11: {
                        if (var1 >= bb.field_b.length) {
                            statePc = 17;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    }
                    case 12: {
                        if (null != bb.field_b[var1]) {
                            statePc = 14;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    }
                    case 13: {
                        var1++;
                        statePc = 11;
                        continue stateLoop;
                    }
                    case 14: {
                        try {
                            bb.field_b[var1].c((byte) -101);
                            statePc = 15;
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = 16;
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        var1++;
                        statePc = 11;
                        continue stateLoop;
                    }
                    case 16: {
                        var2 = (IOException) (Object) caughtException;
                        var1++;
                        statePc = 11;
                        continue stateLoop;
                    }
                    case 17: {
                        if (param0 == 11670) {
                            statePc = 19;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    }
                    case 18: {
                        field_f = null;
                        statePc = 19;
                        continue stateLoop;
                    }
                    case 19: {
                        return;
                    }
                    default: throw new IllegalStateException("invalid CFG state " + statePc);
                }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void d(int param0) {
        int var1 = -96 / ((param0 - -52) / 63);
        if (null != p.field_b) {
            p.field_b.h((byte) 83);
        }
        if (ci.field_c != null) {
            ci.field_c.k((byte) 61);
        }
        hb.f((byte) -102);
    }

    final static String a(int param0, int param1, byte param2, byte[] param3) {
        char[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        char[] var10 = null;
        char[] var11 = null;
        char[] var12 = null;
        var9 = ArcanistsMulti.field_G ? 1 : 0;
        var12 = new char[param1];
        var11 = var12;
        var10 = var11;
        var4 = var10;
        var5 = 0;
        var6 = 0;
        if (param2 < -122) {
          L0: while (true) {
            if (var6 >= param1) {
              return new String(var12, 0, var5);
            } else {
              var7 = param3[param0 + var6] & 255;
              if (var7 != 0) {
                L1: {
                  if (-129 < var7) {
                    break L1;
                  } else {
                    if (-161 <= var7) {
                      break L1;
                    } else {
                      L2: {
                        var8 = oc.field_a[-128 + var7];
                        if (0 != var8) {
                          break L2;
                        } else {
                          var8 = 63;
                          break L2;
                        }
                      }
                      var7 = var8;
                      break L1;
                    }
                  }
                }
                var5++;
                var10[var5] = (char)var7;
                var6++;
                continue L0;
              } else {
                var6++;
                continue L0;
              }
            }
          }
        } else {
          return null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Players";
        field_f = "Please wait...";
        field_k = new int[8192];
        field_b = "Reading Book of Flame";
    }
}
