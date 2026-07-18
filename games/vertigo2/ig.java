/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

abstract class ig {
    int field_b;
    static short[] field_c;
    static String field_d;
    String field_a;

    final static void a(int param0, boolean param1) {
        int var2 = 0;
        int var3 = 0;
        var3 = Vertigo2.field_L ? 1 : 0;
        if (param0 != 9790) {
          ig.a(false, 96, 75, 14, 14, -20, -1);
          if (q.field_y <= 0) {
            if (!ag.b(49)) {
              L0: {
                var2 = 1;
                if (t.field_m != null) {
                  break L0;
                } else {
                  if (rr.field_C) {
                    bl.a(param1, var2, param0 ^ -24272);
                    break L0;
                  } else {
                    return;
                  }
                }
              }
              return;
            } else {
              L1: {
                var2 = 0;
                if (t.field_m != null) {
                  break L1;
                } else {
                  if (rr.field_C) {
                    bl.a(param1, var2, param0 ^ -24272);
                    break L1;
                  } else {
                    return;
                  }
                }
              }
              return;
            }
          } else {
            if (null != t.field_m) {
              dc.field_L = t.field_m.c((byte) 115);
              nm.b(false, 2);
              if (null == dc.field_L) {
                L2: {
                  var2 = 3;
                  if (t.field_m != null) {
                    break L2;
                  } else {
                    if (rr.field_C) {
                      bl.a(param1, var2, param0 ^ -24272);
                      break L2;
                    } else {
                      return;
                    }
                  }
                }
                return;
              } else {
                ap.a((java.awt.Canvas) (Object) dc.field_L, -8228);
                var2 = 2;
                if (t.field_m == null) {
                  if (!rr.field_C) {
                    return;
                  } else {
                    bl.a(param1, var2, param0 ^ -24272);
                    return;
                  }
                } else {
                  return;
                }
              }
            } else {
              dc.field_L = id.a(0, 0, (byte) 94, 640, gi.field_s, 480);
              if (null == dc.field_L) {
                var2 = 3;
                if (t.field_m == null) {
                  L3: {
                    if (rr.field_C) {
                      bl.a(param1, var2, param0 ^ -24272);
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  return;
                } else {
                  return;
                }
              } else {
                ap.a((java.awt.Canvas) (Object) dc.field_L, -8228);
                var2 = 2;
                if (t.field_m == null) {
                  L4: {
                    if (rr.field_C) {
                      bl.a(param1, var2, param0 ^ -24272);
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  return;
                } else {
                  return;
                }
              }
            }
          }
        } else {
          if (q.field_y <= 0) {
            if (!ag.b(49)) {
              var2 = 1;
              if (t.field_m == null) {
                if (rr.field_C) {
                  bl.a(param1, var2, param0 ^ -24272);
                  return;
                } else {
                  return;
                }
              } else {
                return;
              }
            } else {
              var2 = 0;
              if (t.field_m == null) {
                if (!rr.field_C) {
                  return;
                } else {
                  bl.a(param1, var2, param0 ^ -24272);
                  return;
                }
              } else {
                return;
              }
            }
          } else {
            if (null != t.field_m) {
              dc.field_L = t.field_m.c((byte) 115);
              nm.b(false, 2);
              if (null == dc.field_L) {
                var2 = 3;
                if (t.field_m == null) {
                  if (!rr.field_C) {
                    return;
                  } else {
                    bl.a(param1, var2, param0 ^ -24272);
                    return;
                  }
                } else {
                  return;
                }
              } else {
                ap.a((java.awt.Canvas) (Object) dc.field_L, -8228);
                var2 = 2;
                if (t.field_m == null) {
                  if (!rr.field_C) {
                    return;
                  } else {
                    bl.a(param1, var2, param0 ^ -24272);
                    return;
                  }
                } else {
                  return;
                }
              }
            } else {
              dc.field_L = id.a(0, 0, (byte) 94, 640, gi.field_s, 480);
              if (null != dc.field_L) {
                L5: {
                  ap.a((java.awt.Canvas) (Object) dc.field_L, -8228);
                  var2 = 2;
                  if (t.field_m != null) {
                    break L5;
                  } else {
                    if (rr.field_C) {
                      bl.a(param1, var2, param0 ^ -24272);
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                }
                return;
              } else {
                L6: {
                  var2 = 3;
                  if (t.field_m != null) {
                    break L6;
                  } else {
                    if (rr.field_C) {
                      bl.a(param1, var2, param0 ^ -24272);
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                }
                return;
              }
            }
          }
        }
    }

    final static void a(boolean param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        String var7 = null;
        if (param2 != ui.field_g) {
            var7 = up.field_D;
        } else {
            var7 = vj.field_e;
        }
        f.a(param4, param5, 115, param3, param6, var7, param1, param0);
    }

    public static void a(int param0) {
        if (param0 != -1) {
            ig.a(60, false);
            field_c = null;
            field_d = null;
            return;
        }
        field_c = null;
        field_d = null;
    }

    abstract java.net.Socket b(int param0) throws IOException;

    final static bk a(String param0, boolean param1) {
        RuntimeException var2 = null;
        Object var3 = null;
        bk stackIn_6_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        bk stackOut_5_0 = null;
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
              if (!param1) {
                break L1;
              } else {
                var3 = null;
                bk discarded$2 = ig.a((String) null, true);
                break L1;
              }
            }
            L2: {
              if (!cl.field_c.a((byte) -82)) {
                break L2;
              } else {
                if (param0.equals((Object) (Object) cl.field_c.d((byte) 105))) {
                  break L2;
                } else {
                  cl.field_c = qc.a(0, param0);
                  break L2;
                }
              }
            }
            stackOut_5_0 = cl.field_c;
            stackIn_6_0 = stackOut_5_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var2;
            stackOut_7_1 = new StringBuilder().append("ig.F(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
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
          throw wn.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ',' + param1 + ')');
        }
        return stackIn_6_0;
    }

    final java.net.Socket a(byte param0) throws IOException {
        if (param0 != -39) {
          ig.a(29);
          return new java.net.Socket(((ig) this).field_a, ((ig) this).field_b);
        } else {
          return new java.net.Socket(((ig) this).field_a, ((ig) this).field_b);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Encouraging rule breaking";
    }
}
