/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class mb {
    private boolean field_a;
    static String field_e;
    private int[] field_b;
    private int field_g;
    static int field_c;
    static int[] field_d;
    private int field_f;

    final static boolean a(boolean param0, int param1) {
        try {
            int var2 = 0;
            uf var2_ref_uf = null;
            IOException var2_ref_IOException = null;
            int stackIn_9_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_8_0 = 0;
            int stackOut_7_0 = 0;
            L0: {
              if (k.field_c != null) {
                break L0;
              } else {
                k.field_c = lf.field_f.a(114, mc.field_e, hc.field_a);
                break L0;
              }
            }
            if (k.field_c.field_c != 0) {
              long dupTemp$2 = ik.a(4);
              el.field_J = dupTemp$2;
              p.field_a = dupTemp$2;
              if (k.field_c.field_c == 1) {
                try {
                  L1: {
                    L2: {
                      qc.field_s = new qk((java.net.Socket) k.field_c.field_b, lf.field_f);
                      var2_ref_uf = de.field_V;
                      we.field_b.field_n = 0;
                      ph.field_xb = ba.field_f;
                      if (!param0) {
                        stackOut_8_0 = -1;
                        stackIn_9_0 = stackOut_8_0;
                        break L2;
                      } else {
                        stackOut_7_0 = -2;
                        stackIn_9_0 = stackOut_7_0;
                        break L2;
                      }
                    }
                    lg.field_U = stackIn_9_0;
                    bb.field_d = stackIn_9_0;
                    kf.field_L = stackIn_9_0;
                    var2_ref_uf.field_n = 0;
                    gi.a(kb.field_g, l.field_c, 17, (wl) (Object) we.field_b, qk.field_a);
                    wj.c(4792, -1);
                    break L1;
                  }
                } catch (java.io.IOException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var2_ref_IOException = (IOException) (Object) decompiledCaughtException;
                  ph.field_xb = kl.field_B;
                  k.field_c = null;
                  var2 = 79 / ((param1 - 21) / 48);
                  return true;
                }
                k.field_c = null;
                var2 = 79 / ((param1 - 21) / 48);
                return true;
              } else {
                ph.field_xb = kl.field_B;
                k.field_c = null;
                var2 = 79 / ((param1 - 21) / 48);
                return true;
              }
            } else {
              return false;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final int a(int param0) {
        int var2 = 97 % ((param0 - 37) / 50);
        return ((mb) this).field_g + 1;
    }

    final static String a(int param0, hl param1) {
        Object var2 = null;
        String var3 = null;
        int var4 = 0;
        String var5 = null;
        String stackIn_31_0 = null;
        Object stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        Object stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        Object stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_30_0 = null;
        Object stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        Object stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        Object stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        var4 = client.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              var2 = null;
              if (param1.field_p == null) {
                break L1;
              } else {
                L2: {
                  var5 = param1.field_p;
                  var3 = var5;
                  var3 = var5;
                  if (param1.field_l == 1) {
                    var2 = (Object) (Object) ("<img=0>" + var5);
                    break L2;
                  } else {
                    break L2;
                  }
                }
                if (param1.field_l == 2) {
                  var2 = (Object) (Object) ("<img=1>" + var2);
                  var3 = (String) var2;
                  var3 = (String) var2;
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            L3: {
              var3 = "";
              if (2 == param1.field_m) {
                if (!param1.field_j) {
                  L4: {
                    if (0 != param1.field_i) {
                      break L4;
                    } else {
                      if (param1.field_n != 0) {
                        break L4;
                      } else {
                        var3 = cm.a((byte) 90, oj.field_b, new String[1]);
                        break L3;
                      }
                    }
                  }
                  var3 = cm.a((byte) 110, im.field_j, new String[1]);
                  break L3;
                } else {
                  break L3;
                }
              } else {
                L5: {
                  if (0 != param1.field_m) {
                    break L5;
                  } else {
                    if (ii.field_q) {
                      var3 = "[" + uc.field_b + "] ";
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                }
                L6: {
                  if (param1.field_m != 1) {
                    break L6;
                  } else {
                    var3 = "[" + cm.a((byte) 125, hf.field_a, new String[1]) + "] ";
                    break L6;
                  }
                }
                L7: {
                  if (4 != param1.field_m) {
                    break L7;
                  } else {
                    if (f.field_q != null) {
                      var3 = "[" + f.field_q + "] ";
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                }
                L8: {
                  if (param1.field_m != 3) {
                    break L8;
                  } else {
                    var3 = "[#" + param1.field_g + "] ";
                    break L8;
                  }
                }
                if (!param1.field_j) {
                  var3 = var3 + var2 + ": ";
                  break L3;
                } else {
                  break L3;
                }
              }
            }
            stackOut_30_0 = (String) var3;
            stackIn_31_0 = stackOut_30_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var2 = (Object) (Object) decompiledCaughtException;
            stackOut_32_0 = var2;
            stackOut_32_1 = new StringBuilder().append("mb.D(").append(106).append(44);
            stackIn_34_0 = stackOut_32_0;
            stackIn_34_1 = stackOut_32_1;
            stackIn_33_0 = stackOut_32_0;
            stackIn_33_1 = stackOut_32_1;
            if (param1 == null) {
              stackOut_34_0 = stackIn_34_0;
              stackOut_34_1 = (StringBuilder) (Object) stackIn_34_1;
              stackOut_34_2 = "null";
              stackIn_35_0 = stackOut_34_0;
              stackIn_35_1 = stackOut_34_1;
              stackIn_35_2 = stackOut_34_2;
              break L9;
            } else {
              stackOut_33_0 = stackIn_33_0;
              stackOut_33_1 = (StringBuilder) (Object) stackIn_33_1;
              stackOut_33_2 = "{...}";
              stackIn_35_0 = stackOut_33_0;
              stackIn_35_1 = stackOut_33_1;
              stackIn_35_2 = stackOut_33_2;
              break L9;
            }
          }
          throw dh.a((Throwable) (Object) stackIn_35_0, stackIn_35_2 + 41);
        }
        return stackIn_31_0;
    }

    final int b(int param0, int param1) {
        if (param0 <= ((mb) this).field_g) {
          if (param1 != 0) {
            ((mb) this).field_f = -5;
            return ((mb) this).field_b[param0];
          } else {
            return ((mb) this).field_b[param0];
          }
        } else {
          throw new ArrayIndexOutOfBoundsException(param0);
        }
    }

    private final void a(int param0, int param1) {
        int[] var4 = new int[this.a((byte) -63, param0)];
        int[] var3 = var4;
        an.a(((mb) this).field_b, 0, var4, 0, ((mb) this).field_b.length);
        ((mb) this).field_b = var4;
    }

    private final int a(byte param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        var4 = client.field_A ? 1 : 0;
        var3 = ((mb) this).field_b.length;
        L0: while (true) {
          if (param1 < var3) {
            return var3;
          } else {
            if (!((mb) this).field_a) {
              var3 = var3 + ((mb) this).field_f;
              continue L0;
            } else {
              if (var3 == 0) {
                var3 = 1;
                continue L0;
              } else {
                var3 = var3 * ((mb) this).field_f;
                continue L0;
              }
            }
          }
        }
    }

    private final void a(byte param0, int param1, int param2) {
        if (((mb) this).field_g < param1) {
            ((mb) this).field_g = param1;
            return;
        }
    }

    private mb() throws Throwable {
        throw new Error();
    }

    final static int a(boolean param0, int param1, byte param2, int param3, int param4) {
        int var5 = 256 + param1 * (-param4 + param3);
        if (!(!param0)) {
            var5 += 64;
        }
        return var5;
    }

    final void a(int param0, boolean param1) {
        if (param1) {
          field_e = null;
          this.a((byte) 114, ((mb) this).field_g - -1, param0);
          return;
        } else {
          this.a((byte) 114, ((mb) this).field_g - -1, param0);
          return;
        }
    }

    public static void a() {
        field_e = null;
        field_d = null;
    }

    final void c(int param0, int param1) {
        if (param1 >= 0) {
          if (((mb) this).field_g >= param1) {
            if (param0 > -25) {
              L0: {
                ((mb) this).field_f = 15;
                if (((mb) this).field_g != param1) {
                  an.a(((mb) this).field_b, param1 + 1, ((mb) this).field_b, param1, ((mb) this).field_g + -param1);
                  break L0;
                } else {
                  break L0;
                }
              }
              ((mb) this).field_g = ((mb) this).field_g - 1;
              return;
            } else {
              L1: {
                if (((mb) this).field_g != param1) {
                  an.a(((mb) this).field_b, param1 + 1, ((mb) this).field_b, param1, ((mb) this).field_g + -param1);
                  break L1;
                } else {
                  break L1;
                }
              }
              ((mb) this).field_g = ((mb) this).field_g - 1;
              return;
            }
          } else {
            throw new ArrayIndexOutOfBoundsException(param1);
          }
        } else {
          throw new ArrayIndexOutOfBoundsException(param1);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "Special Items";
    }
}
