/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

final class vg {
    private int field_h;
    private int field_d;
    private lm[] field_a;
    static String field_e;
    private lm field_g;
    private lm field_c;
    private long field_b;
    static String field_f;

    final lm b(byte param0) {
        lm var2 = null;
        lm var3 = null;
        int var4 = 0;
        var4 = Pixelate.field_H ? 1 : 0;
        if (((vg) this).field_g != null) {
          var2 = ((vg) this).field_a[(int)((long)(-1 + ((vg) this).field_h) & ((vg) this).field_b)];
          if (param0 != 47) {
            lm discarded$1 = ((vg) this).a((byte) -113);
            L0: while (true) {
              if (((vg) this).field_g != var2) {
                if (((vg) this).field_g.field_q != ((vg) this).field_b) {
                  ((vg) this).field_g = ((vg) this).field_g.field_p;
                  continue L0;
                } else {
                  var3 = ((vg) this).field_g;
                  ((vg) this).field_g = ((vg) this).field_g.field_p;
                  return var3;
                }
              } else {
                ((vg) this).field_g = null;
                return null;
              }
            }
          } else {
            L1: while (true) {
              if (((vg) this).field_g != var2) {
                if (((vg) this).field_g.field_q != ((vg) this).field_b) {
                  ((vg) this).field_g = ((vg) this).field_g.field_p;
                  continue L1;
                } else {
                  var3 = ((vg) this).field_g;
                  ((vg) this).field_g = ((vg) this).field_g.field_p;
                  return var3;
                }
              } else {
                ((vg) this).field_g = null;
                return null;
              }
            }
          }
        } else {
          return null;
        }
    }

    final void a(boolean param0, lm param1, long param2) {
        lm var5 = null;
        try {
            if (!(param1.field_r == null)) {
                param1.e(17);
            }
            var5 = ((vg) this).field_a[(int)((long)(((vg) this).field_h - 1) & param2)];
            param1.field_r = var5.field_r;
            param1.field_p = var5;
            param1.field_r.field_p = param1;
            if (param0) {
                vg.b(-98, -4);
            }
            param1.field_p.field_r = param1;
            param1.field_q = param2;
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "vg.G(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 41);
        }
    }

    final static void a(long param0) {
        if (!(param0 > 0L)) {
            return;
        }
        if (0L != param0 % 10L) {
            ma.a((byte) 37, param0);
        } else {
            ma.a((byte) 37, -1L + param0);
            ma.a((byte) 37, 1L);
            return;
        }
    }

    final static ib a(byte param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        int stackIn_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        L0: {
          if (param1 < 10) {
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = ue.a(param1, (byte) 118);
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        var2 = stackIn_3_0;
        if (var2 == 0) {
          if (ok.a(tg.field_f, -128, 2) != 1) {
            return new ib(4, 3);
          } else {
            return new ib(3, 4);
          }
        } else {
          if (var2 == 1) {
            var3 = ok.a(tg.field_f, -121, 3);
            if (var3 == 0) {
              return new ib(3, 5);
            } else {
              if (var3 == 1) {
                return new ib(4, 4);
              } else {
                if (var3 == 2) {
                  return new ib(5, 3);
                } else {
                  return new ib(4, 4);
                }
              }
            }
          } else {
            if (2 == var2) {
              if (ok.a(tg.field_f, -103, 2) == 1) {
                return new ib(4, 5);
              } else {
                return new ib(5, 4);
              }
            } else {
              if (3 != var2) {
                return new ib(4, 4);
              } else {
                return new ib(5, 5);
              }
            }
          }
        }
    }

    final lm a(byte param0) {
        int var3 = 0;
        lm var4 = null;
        lm var5 = null;
        lm var29 = null;
        lm var57 = null;
        lm var58 = null;
        lm var59 = null;
        var3 = Pixelate.field_H ? 1 : 0;
        if (0 >= ((vg) this).field_d) {
          if (param0 != 50) {
            int discarded$6 = vg.a(-20, -121);
            L0: while (true) {
              if (((vg) this).field_d < ((vg) this).field_h) {
                int fieldTemp$7 = ((vg) this).field_d;
                ((vg) this).field_d = ((vg) this).field_d + 1;
                var4 = ((vg) this).field_a[fieldTemp$7].field_p;
                var59 = var4;
                if (var4 != ((vg) this).field_a[((vg) this).field_d - 1]) {
                  ((vg) this).field_c = var59.field_p;
                  return var59;
                } else {
                  continue L0;
                }
              } else {
                return null;
              }
            }
          } else {
            L1: while (true) {
              if (((vg) this).field_d < ((vg) this).field_h) {
                int fieldTemp$8 = ((vg) this).field_d;
                ((vg) this).field_d = ((vg) this).field_d + 1;
                var4 = ((vg) this).field_a[fieldTemp$8].field_p;
                var58 = var4;
                if (var4 != ((vg) this).field_a[((vg) this).field_d - 1]) {
                  ((vg) this).field_c = var58.field_p;
                  return var58;
                } else {
                  continue L1;
                }
              } else {
                return null;
              }
            }
          }
        } else {
          if (((vg) this).field_c == ((vg) this).field_a[((vg) this).field_d + -1]) {
            if (param0 != 50) {
              int discarded$9 = vg.a(-20, -121);
              L2: while (true) {
                if (((vg) this).field_d < ((vg) this).field_h) {
                  int fieldTemp$10 = ((vg) this).field_d;
                  ((vg) this).field_d = ((vg) this).field_d + 1;
                  var4 = ((vg) this).field_a[fieldTemp$10].field_p;
                  var29 = var4;
                  if (var4 != ((vg) this).field_a[((vg) this).field_d - 1]) {
                    ((vg) this).field_c = var29.field_p;
                    return var29;
                  } else {
                    continue L2;
                  }
                } else {
                  return null;
                }
              }
            } else {
              L3: while (true) {
                if (((vg) this).field_d < ((vg) this).field_h) {
                  int fieldTemp$11 = ((vg) this).field_d;
                  ((vg) this).field_d = ((vg) this).field_d + 1;
                  var4 = ((vg) this).field_a[fieldTemp$11].field_p;
                  var5 = var4;
                  if (var4 != ((vg) this).field_a[((vg) this).field_d - 1]) {
                    ((vg) this).field_c = var5.field_p;
                    return var5;
                  } else {
                    continue L3;
                  }
                } else {
                  return null;
                }
              }
            }
          } else {
            var57 = ((vg) this).field_c;
            ((vg) this).field_c = var57.field_p;
            return var57;
          }
        }
    }

    final static int a(int param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        var3 = Pixelate.field_H ? 1 : 0;
        if (param1 == ~param0) {
          return 0;
        } else {
          if (param0 < 0) {
            throw new IllegalArgumentException("");
          } else {
            if (param0 < 32768) {
              if (param0 < 128) {
                if (param0 < 8) {
                  if (param0 < 2) {
                    return 256;
                  } else {
                    var2 = 7;
                    param0 = param0 << (var2 << 1);
                    return bl.field_a[-32768 + param0] >> var2;
                  }
                } else {
                  if (32 <= param0) {
                    var2 = 5;
                    param0 = param0 << (var2 << 1);
                    return bl.field_a[-32768 + param0] >> var2;
                  } else {
                    var2 = 6;
                    param0 = param0 << (var2 << 1);
                    return bl.field_a[-32768 + param0] >> var2;
                  }
                }
              } else {
                if (param0 < 2048) {
                  if (512 <= param0) {
                    var2 = 3;
                    param0 = param0 << (var2 << 1);
                    return bl.field_a[-32768 + param0] >> var2;
                  } else {
                    var2 = 4;
                    param0 = param0 << (var2 << 1);
                    return bl.field_a[-32768 + param0] >> var2;
                  }
                } else {
                  if (param0 < 8192) {
                    var2 = 2;
                    param0 = param0 << (var2 << 1);
                    return bl.field_a[-32768 + param0] >> var2;
                  } else {
                    var2 = 1;
                    param0 = param0 << (var2 << 1);
                    return bl.field_a[-32768 + param0] >> var2;
                  }
                }
              }
            } else {
              if (131072 <= param0) {
                if (33554432 > param0) {
                  if (2097152 <= param0) {
                    if (param0 < 8388608) {
                      var2 = 3;
                      param0 = param0 >> (var2 << 1);
                      return bl.field_a[param0 + -32768] << var2;
                    } else {
                      var2 = 4;
                      param0 = param0 >> (var2 << 1);
                      return bl.field_a[param0 + -32768] << var2;
                    }
                  } else {
                    if (param0 < 524288) {
                      var2 = 1;
                      param0 = param0 >> (var2 << 1);
                      return bl.field_a[param0 + -32768] << var2;
                    } else {
                      var2 = 2;
                      param0 = param0 >> (var2 << 1);
                      return bl.field_a[param0 + -32768] << var2;
                    }
                  }
                } else {
                  if (param0 >= 536870912) {
                    var2 = 7;
                    param0 = param0 >> (var2 << 1);
                    return bl.field_a[param0 + -32768] << var2;
                  } else {
                    if (param0 >= 134217728) {
                      var2 = 6;
                      param0 = param0 >> (var2 << 1);
                      return bl.field_a[param0 + -32768] << var2;
                    } else {
                      var2 = 5;
                      param0 = param0 >> (var2 << 1);
                      return bl.field_a[param0 + -32768] << var2;
                    }
                  }
                }
              } else {
                return bl.field_a[-32768 + param0];
              }
            }
          }
        }
    }

    final lm a(int param0, long param1) {
        lm var4 = null;
        lm var5 = null;
        int var6 = 0;
        lm var7 = null;
        lm var8 = null;
        var6 = Pixelate.field_H ? 1 : 0;
        if (param0 == -11434) {
          ((vg) this).field_b = param1;
          var7 = ((vg) this).field_a[(int)(param1 & (long)(((vg) this).field_h + -1))];
          var4 = var7;
          ((vg) this).field_g = var7.field_p;
          L0: while (true) {
            if (((vg) this).field_g != var4) {
              if (~param1 != ~((vg) this).field_g.field_q) {
                ((vg) this).field_g = ((vg) this).field_g.field_p;
                continue L0;
              } else {
                var5 = ((vg) this).field_g;
                ((vg) this).field_g = ((vg) this).field_g.field_p;
                return var5;
              }
            } else {
              ((vg) this).field_g = null;
              return null;
            }
          }
        } else {
          ((vg) this).field_c = null;
          ((vg) this).field_b = param1;
          var8 = ((vg) this).field_a[(int)(param1 & (long)(((vg) this).field_h + -1))];
          var4 = var8;
          ((vg) this).field_g = var8.field_p;
          L1: while (true) {
            if (((vg) this).field_g != var4) {
              if (~param1 != ~((vg) this).field_g.field_q) {
                ((vg) this).field_g = ((vg) this).field_g.field_p;
                continue L1;
              } else {
                var5 = ((vg) this).field_g;
                ((vg) this).field_g = ((vg) this).field_g.field_p;
                return var5;
              }
            } else {
              ((vg) this).field_g = null;
              return null;
            }
          }
        }
    }

    final lm a(int param0) {
        ((vg) this).field_d = 0;
        if (param0 > -21) {
            ((vg) this).field_d = -64;
            return ((vg) this).a((byte) 50);
        }
        return ((vg) this).a((byte) 50);
    }

    final static void b(int param0, int param1) {
        try {
            IOException var2 = null;
            Throwable decompiledCaughtException = null;
            if (null == sh.field_e) {
              aa.field_f.field_m = 0;
              return;
            } else {
              L0: {
                if (param0 < 0) {
                  if (aa.field_f.field_m == 0) {
                    if (~hm.a(64) >= ~(aj.field_m + 10000L)) {
                      break L0;
                    } else {
                      aa.field_f.g(param0, 15514);
                      break L0;
                    }
                  } else {
                    if (aa.field_f.field_m != 0) {
                      break L0;
                    } else {
                      if (~hm.a(64) >= ~(aj.field_m + 10000L)) {
                        break L0;
                      } else {
                        aa.field_f.g(param0, 15514);
                        break L0;
                      }
                    }
                  }
                } else {
                  if (aa.field_f.field_m != 0) {
                    break L0;
                  } else {
                    if (~hm.a(64) >= ~(aj.field_m + 10000L)) {
                      break L0;
                    } else {
                      aa.field_f.g(param0, 15514);
                      break L0;
                    }
                  }
                }
              }
              L1: {
                if (aa.field_f.field_m > 0) {
                  {
                    L2: {
                      sh.field_e.a(aa.field_f.field_m, -98, 0, aa.field_f.field_k);
                      aj.field_m = hm.a(64);
                      break L2;
                    }
                  }
                  aa.field_f.field_m = 0;
                  break L1;
                } else {
                  break L1;
                }
              }
              if (param1 == 10000) {
                return;
              } else {
                int discarded$1 = 1;
                vg.a();
                return;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    vg(int param0) {
        int var2 = 0;
        lm var3 = null;
        ((vg) this).field_d = 0;
        ((vg) this).field_a = new lm[param0];
        ((vg) this).field_h = param0;
        var2 = 0;
        L0: while (true) {
          if (param0 > var2) {
            lm dupTemp$2 = new lm();
            var3 = dupTemp$2;
            ((vg) this).field_a[var2] = dupTemp$2;
            var3.field_r = var3;
            var3.field_p = var3;
            var2++;
            continue L0;
          } else {
            return;
          }
        }
    }

    public static void a() {
        field_e = null;
        field_f = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "<%0> has withdrawn the request to join.";
        field_f = "Join <%0>'s game";
    }
}
