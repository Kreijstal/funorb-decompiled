/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class c implements Iterator {
    private ce field_h;
    static String field_b;
    private uf field_g;
    static String field_c;
    private uf field_e;
    static String field_i;
    private int field_f;
    static String field_d;
    static char[] field_a;

    final static void a(byte param0, ci param1, int param2) {
        int[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        Object var8 = null;
        int[] var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        var7 = Terraphoenix.field_V;
        var12 = param1.field_z;
        var11 = var12;
        var10 = var11;
        var9 = var10;
        var3 = var9;
        var4 = 0;
        var5 = -1 + param1.field_t;
        L0: while (true) {
          if (var5 < 0) {
            var4 = 0;
            var5 = 0;
            L1: while (true) {
              if (var5 >= param1.field_t) {
                var4 = 0;
                var5 = -1 + param1.field_t;
                L2: while (true) {
                  if ((var5 ^ -1) > -1) {
                    L3: {
                      if (param0 == -86) {
                        break L3;
                      } else {
                        var8 = null;
                        c.a((byte) 118, (java.applet.Applet) null);
                        break L3;
                      }
                    }
                    return;
                  } else {
                    var6 = param1.field_r - 1;
                    L4: while (true) {
                      if (0 > var6) {
                        var5--;
                        continue L2;
                      } else {
                        if ((var12[var4] ^ -1) != -2) {
                          var4++;
                          var6--;
                          continue L4;
                        } else {
                          var4++;
                          var3[var4] = param2;
                          var6--;
                          continue L4;
                        }
                      }
                    }
                  }
                }
              } else {
                var6 = 0;
                L5: while (true) {
                  if (param1.field_r <= var6) {
                    var5++;
                    continue L1;
                  } else {
                    if (-1 == (var12[var4] ^ -1)) {
                      L6: {
                        if (0 >= var6) {
                          break L6;
                        } else {
                          if (var3[-1 + var4] <= 1) {
                            break L6;
                          } else {
                            var12[var4] = 1;
                            var4++;
                            var6++;
                            continue L5;
                          }
                        }
                      }
                      L7: {
                        if (-1 <= (var5 ^ -1)) {
                          break L7;
                        } else {
                          if ((var3[-param1.field_r + var4] ^ -1) >= -2) {
                            break L7;
                          } else {
                            var12[var4] = 1;
                            var4++;
                            var6++;
                            continue L5;
                          }
                        }
                      }
                      L8: {
                        if (param1.field_r - 1 <= var6) {
                          break L8;
                        } else {
                          if ((var3[var4 + 1] ^ -1) >= -2) {
                            break L8;
                          } else {
                            var12[var4] = 1;
                            var4++;
                            var6++;
                            continue L5;
                          }
                        }
                      }
                      if (param1.field_t - 1 > var5) {
                        if (var3[var4 + param1.field_r] > 1) {
                          var12[var4] = 1;
                          var4++;
                          var6++;
                          continue L5;
                        } else {
                          var4++;
                          var6++;
                          continue L5;
                        }
                      } else {
                        var4++;
                        var6++;
                        continue L5;
                      }
                    } else {
                      var4++;
                      var6++;
                      continue L5;
                    }
                  }
                }
              }
            }
          } else {
            var6 = param1.field_r + -1;
            L9: while (true) {
              if (0 > var6) {
                var5--;
                continue L0;
              } else {
                if (1 == var12[var4]) {
                  var4++;
                  var3[var4] = 2;
                  var6--;
                  continue L9;
                } else {
                  var4++;
                  var6--;
                  continue L9;
                }
              }
            }
          }
        }
    }

    public static void a(int param0) {
        field_c = null;
        field_b = null;
        field_a = null;
        field_i = null;
        if (param0 != 1) {
            boolean discarded$0 = c.b(125);
        }
        field_d = null;
    }

    public final boolean hasNext() {
        int var2 = 0;
        var2 = Terraphoenix.field_V;
        if (((c) this).field_e != ((c) this).field_h.field_a[-1 + ((c) this).field_f]) {
          return true;
        } else {
          L0: while (true) {
            if (((c) this).field_h.field_c <= ((c) this).field_f) {
              return false;
            } else {
              ((c) this).field_f = ((c) this).field_f + 1;
              if (((c) this).field_h.field_a[((c) this).field_f].field_d != ((c) this).field_h.field_a[((c) this).field_f - 1]) {
                ((c) this).field_e = ((c) this).field_h.field_a[-1 + ((c) this).field_f].field_d;
                return true;
              } else {
                ((c) this).field_e = ((c) this).field_h.field_a[((c) this).field_f - 1];
                continue L0;
              }
            }
          }
        }
    }

    public final void remove() {
        if (!(((c) this).field_g != null)) {
            throw new IllegalStateException();
        }
        ((c) this).field_g.b((byte) 12);
        ((c) this).field_g = null;
    }

    public final Object next() {
        uf var1 = null;
        int var2 = Terraphoenix.field_V;
        if (!(((c) this).field_h.field_a[-1 + ((c) this).field_f] == ((c) this).field_e)) {
            var1 = ((c) this).field_e;
            ((c) this).field_g = var1;
            ((c) this).field_e = var1.field_d;
            return (Object) (Object) var1;
        }
        do {
            if (((c) this).field_f >= ((c) this).field_h.field_c) {
                return null;
            }
            ((c) this).field_f = ((c) this).field_f + 1;
            var1 = ((c) this).field_h.field_a[((c) this).field_f].field_d;
        } while (((c) this).field_h.field_a[((c) this).field_f - 1] == var1);
        ((c) this).field_g = var1;
        ((c) this).field_e = var1.field_d;
        return (Object) (Object) var1;
    }

    final static void a(byte param0, java.applet.Applet param1) {
        try {
            java.net.URL var2 = null;
            if (param0 != -110) {
                return;
            }
            try {
                var2 = new java.net.URL(param1.getCodeBase(), "subscribe.ws");
                param1.getAppletContext().showDocument(bb.a((byte) 126, var2, param1), "_top");
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void a(boolean param0) {
        ((c) this).field_e = ((c) this).field_h.field_a[0].field_d;
        if (param0) {
            return;
        }
        ((c) this).field_f = 1;
        ((c) this).field_g = null;
    }

    c(ce param0) {
        ((c) this).field_g = null;
        ((c) this).field_h = param0;
        this.a(false);
    }

    final static boolean b(int param0) {
        int stackIn_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        L0: {
          if (param0 < -60) {
            break L0;
          } else {
            field_d = null;
            break L0;
          }
        }
        L1: {
          L2: {
            if (20 > uh.field_H) {
              break L2;
            } else {
              if (!wf.a(31996)) {
                break L2;
              } else {
                L3: {
                  if (0 >= db.field_b) {
                    break L3;
                  } else {
                    if (mi.a((byte) -95)) {
                      break L3;
                    } else {
                      break L2;
                    }
                  }
                }
                stackOut_8_0 = 0;
                stackIn_9_0 = stackOut_8_0;
                break L1;
              }
            }
          }
          stackOut_7_0 = 1;
          stackIn_9_0 = stackOut_7_0;
          break L1;
        }
        return stackIn_9_0 != 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "6000pts";
        field_b = "Build ";
        field_d = "Options Menu";
        field_a = new char[]{(char)32, (char)160, (char)95, (char)45, (char)224, (char)225, (char)226, (char)228, (char)227, (char)192, (char)193, (char)194, (char)196, (char)195, (char)232, (char)233, (char)234, (char)235, (char)200, (char)201, (char)202, (char)203, (char)237, (char)238, (char)239, (char)205, (char)206, (char)207, (char)242, (char)243, (char)244, (char)246, (char)245, (char)210, (char)211, (char)212, (char)214, (char)213, (char)249, (char)250, (char)251, (char)252, (char)217, (char)218, (char)219, (char)220, (char)231, (char)199, (char)255, (char)376, (char)241, (char)209, (char)223};
    }
}
