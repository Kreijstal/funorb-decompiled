/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class id {
    static int field_c;
    static int[] field_h;
    static String field_j;
    static char field_b;
    private int[] field_a;
    private int field_e;
    static String field_i;
    static int field_g;
    private boolean field_d;
    private int field_f;

    final static boolean a(boolean param0, boolean param1) {
        try {
            IOException var2 = null;
            ih var4 = null;
            ih var5 = null;
            int stackIn_11_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_10_0 = 0;
            int stackOut_9_0 = 0;
            L0: {
              if (gg.field_e == null) {
                gg.field_e = af.field_f.a(be.field_b, (byte) 32, a.field_d);
                break L0;
              } else {
                break L0;
              }
            }
            if (0 == gg.field_e.field_b) {
              return false;
            } else {
              long dupTemp$2 = lj.a((byte) -47);
              jd.field_n = dupTemp$2;
              ug.field_d = dupTemp$2;
              if (1 == gg.field_e.field_b) {
                try {
                  L1: {
                    L2: {
                      sg.field_h = new td((java.net.Socket) gg.field_e.field_e, af.field_f);
                      ud.field_b.field_i = 0;
                      var4 = ae.field_a;
                      var5 = var4;
                      rh.field_k = d.field_O;
                      var5.field_i = 0;
                      if (!param1) {
                        stackOut_10_0 = -1;
                        stackIn_11_0 = stackOut_10_0;
                        break L2;
                      } else {
                        stackOut_9_0 = -2;
                        stackIn_11_0 = stackOut_9_0;
                        break L2;
                      }
                    }
                    hc.field_j = stackIn_11_0;
                    rj.field_k = stackIn_11_0;
                    vi.field_a = stackIn_11_0;
                    ob.a(cj.field_b, j.field_g, (byte) -127, bb.field_E, (ni) (Object) ud.field_b);
                    dk.b((byte) 41, -1);
                    break L1;
                  }
                } catch (java.io.IOException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var2 = (IOException) (Object) decompiledCaughtException;
                  rh.field_k = wb.field_q;
                  gg.field_e = null;
                  return true;
                }
                gg.field_e = null;
                return true;
              } else {
                rh.field_k = wb.field_q;
                gg.field_e = null;
                return true;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(boolean param0) {
        if (bh.field_t == 10) {
          int discarded$4 = -17634;
          re.a();
          bh.field_t = 11;
          if (param0) {
            return;
          } else {
            rj.field_m = true;
            return;
          }
        } else {
          if (lk.a(-109)) {
            if (param0) {
              return;
            } else {
              rj.field_m = true;
              return;
            }
          } else {
            int discarded$5 = -17634;
            re.a();
            bh.field_t = 11;
            if (param0) {
              return;
            } else {
              rj.field_m = true;
              return;
            }
          }
        }
    }

    private final int a(int param0, boolean param1) {
        int var3 = 0;
        int var4 = 0;
        var4 = fleas.field_A ? 1 : 0;
        var3 = ((id) this).field_a.length;
        L0: while (true) {
          if (param0 < var3) {
            return var3;
          } else {
            if (((id) this).field_d) {
              if (0 != var3) {
                var3 = var3 * ((id) this).field_f;
                continue L0;
              } else {
                var3 = 1;
                continue L0;
              }
            } else {
              var3 = var3 + ((id) this).field_f;
              continue L0;
            }
          }
        }
    }

    private final void a(int param0, int param1, int param2) {
        if (((id) this).field_e >= param0) {
          L0: {
            if (param0 >= ((id) this).field_a.length) {
              this.a(0, param0);
              break L0;
            } else {
              break L0;
            }
          }
          if (param2 > -126) {
            int discarded$4 = ((id) this).b(-106);
            ((id) this).field_a[param0] = param1;
            return;
          } else {
            ((id) this).field_a[param0] = param1;
            return;
          }
        } else {
          L1: {
            ((id) this).field_e = param0;
            if (param0 >= ((id) this).field_a.length) {
              this.a(0, param0);
              break L1;
            } else {
              break L1;
            }
          }
          if (param2 <= -126) {
            ((id) this).field_a[param0] = param1;
            return;
          } else {
            int discarded$5 = ((id) this).b(-106);
            ((id) this).field_a[param0] = param1;
            return;
          }
        }
    }

    final int b(int param0, boolean param1) {
        if (param0 > ((id) this).field_e) {
          throw new ArrayIndexOutOfBoundsException(param0);
        } else {
          if (param1) {
            this.a(-40, -13, 81);
            return ((id) this).field_a[param0];
          } else {
            return ((id) this).field_a[param0];
          }
        }
    }

    final void b(int param0, int param1) {
        if (param0 == 1) {
          if (0 <= param1) {
            if (((id) this).field_e >= param1) {
              if (((id) this).field_e != param1) {
                dm.a(((id) this).field_a, 1 + param1, ((id) this).field_a, param1, -param1 + ((id) this).field_e);
                ((id) this).field_e = ((id) this).field_e - 1;
                return;
              } else {
                ((id) this).field_e = ((id) this).field_e - 1;
                return;
              }
            } else {
              throw new ArrayIndexOutOfBoundsException(param1);
            }
          } else {
            throw new ArrayIndexOutOfBoundsException(param1);
          }
        } else {
          this.a(-59, -73, 120);
          if (0 <= param1) {
            if (((id) this).field_e >= param1) {
              if (((id) this).field_e == param1) {
                ((id) this).field_e = ((id) this).field_e - 1;
                return;
              } else {
                dm.a(((id) this).field_a, 1 + param1, ((id) this).field_a, param1, -param1 + ((id) this).field_e);
                ((id) this).field_e = ((id) this).field_e - 1;
                return;
              }
            } else {
              throw new ArrayIndexOutOfBoundsException(param1);
            }
          } else {
            throw new ArrayIndexOutOfBoundsException(param1);
          }
        }
    }

    final static ob a(String param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String[] var3 = null;
        String[] var4 = null;
        int var5 = 0;
        String var6 = null;
        ob var7 = null;
        int var8 = 0;
        ob stackIn_4_0 = null;
        ob stackIn_8_0 = null;
        ob stackIn_12_0 = null;
        ob stackIn_18_0 = null;
        ob stackIn_21_0 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        ob stackOut_3_0 = null;
        ob stackOut_7_0 = null;
        ob stackOut_11_0 = null;
        ob stackOut_20_0 = null;
        ob stackOut_17_0 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        var8 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            var2_int = param0.length();
            if (var2_int == 0) {
              stackOut_3_0 = tf.field_H;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            } else {
              if (var2_int > 255) {
                stackOut_7_0 = hg.field_i;
                stackIn_8_0 = stackOut_7_0;
                return stackIn_8_0;
              } else {
                var3 = m.a('.', 114, param0);
                if (var3.length < 2) {
                  stackOut_11_0 = tf.field_H;
                  stackIn_12_0 = stackOut_11_0;
                  return stackIn_12_0;
                } else {
                  var4 = var3;
                  var5 = 0;
                  L1: while (true) {
                    if (var4.length <= var5) {
                      int discarded$2 = -23;
                      stackOut_20_0 = oa.a(var3[var3.length - 1]);
                      stackIn_21_0 = stackOut_20_0;
                      break L0;
                    } else {
                      var6 = var4[var5];
                      var7 = bj.a(-64, var6);
                      if (var7 != null) {
                        stackOut_17_0 = (ob) var7;
                        stackIn_18_0 = stackOut_17_0;
                        return stackIn_18_0;
                      } else {
                        var5++;
                        continue L1;
                      }
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) var2;
            stackOut_22_1 = new StringBuilder().append("id.J(");
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param0 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L2;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L2;
            }
          }
          throw pf.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + ',' + 31592 + ')');
        }
        return stackIn_21_0;
    }

    private final void a(int param0, int param1) {
        int[] var4 = new int[this.a(param1, true)];
        int[] var3 = var4;
        dm.a(((id) this).field_a, 0, var4, 0, ((id) this).field_a.length);
        ((id) this).field_a = var4;
    }

    final void a(byte param0, int param1) {
        this.a(((id) this).field_e - -1, param1, -127);
        int var3 = 56 / ((param0 - -33) / 51);
    }

    final int b(int param0) {
        if (param0 != 0) {
            id.a(true);
            return 1 + ((id) this).field_e;
        }
        return 1 + ((id) this).field_e;
    }

    final static boolean a(int param0) {
        return wi.field_f == ui.field_kb;
    }

    private id() throws Throwable {
        throw new Error();
    }

    public static void a() {
        int var1 = -8;
        field_i = null;
        field_j = null;
        field_h = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = new int[150];
        field_j = "This password contains your email address, and would be easy to guess";
        field_g = 0;
    }
}
