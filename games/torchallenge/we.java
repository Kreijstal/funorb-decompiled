/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class we implements Runnable {
    private mi field_k;
    static bf[] field_i;
    static ka[] field_m;
    private mi field_g;
    private mi field_n;
    static ge[] field_o;
    static int field_f;
    static ka[][] field_e;
    private uj field_b;
    private java.net.URL field_h;
    static String[][] field_c;
    private uf field_d;
    private DataInputStream field_a;
    static int[] field_l;
    private int field_p;
    static int field_j;

    protected final void finalize() {
        if (((we) this).field_k != null) {
            if (null != ((we) this).field_k.field_g) {
                try {
                    ((DataInputStream) ((we) this).field_k.field_g).close();
                } catch (Exception exception) {
                }
            }
            ((we) this).field_k = null;
        }
        if (null != ((we) this).field_g) {
            if (!(null == ((we) this).field_g.field_g)) {
                try {
                    ((java.net.Socket) ((we) this).field_g.field_g).close();
                } catch (Exception exception) {
                }
            }
            ((we) this).field_g = null;
        }
        if (!(((we) this).field_a == null)) {
            try {
                ((we) this).field_a.close();
            } catch (Exception exception) {
            }
            ((we) this).field_a = null;
        }
        ((we) this).field_n = null;
    }

    final static e a(nc param0) {
        e var2 = null;
        RuntimeException var2_ref = null;
        e stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        e stackOut_0_0 = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            var2 = new e(param0, (da) (Object) param0);
            tj.field_e.a((da) (Object) var2, -78);
            mj.field_a.a((qd) (Object) param0);
            stackOut_0_0 = (e) var2;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2_ref = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var2_ref;
            stackOut_2_1 = new StringBuilder().append("we.B(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw oj.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + 44 + 6222 + 41);
        }
        return stackIn_1_0;
    }

    final synchronized boolean a(boolean param0) {
        IOException var2 = null;
        OutputStream var3 = null;
        java.net.Socket var4 = null;
        CharSequence var5 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        if (((we) this).field_p < 2) {
          L0: {
            if (0 != ((we) this).field_p) {
              break L0;
            } else {
              L1: {
                if (null == ((we) this).field_k) {
                  ((we) this).field_k = ((we) this).field_b.a(((we) this).field_h, -125);
                  break L1;
                } else {
                  break L1;
                }
              }
              if (-1 == ((we) this).field_k.field_d) {
                return false;
              } else {
                if (-2 == ((we) this).field_k.field_d) {
                  break L0;
                } else {
                  ((we) this).field_k = null;
                  ((we) this).field_p = ((we) this).field_p + 1;
                  return false;
                }
              }
            }
          }
          L2: {
            if (((we) this).field_p == 1) {
              L3: {
                if (((we) this).field_g != null) {
                  break L3;
                } else {
                  ((we) this).field_g = ((we) this).field_b.a(443, ((we) this).field_h.getHost(), 431890200);
                  break L3;
                }
              }
              if (0 == ((we) this).field_g.field_d) {
                return false;
              } else {
                if (((we) this).field_g.field_d == 1) {
                  break L2;
                } else {
                  ((we) this).field_p = ((we) this).field_p + 1;
                  ((we) this).field_g = null;
                  return false;
                }
              }
            } else {
              break L2;
            }
          }
          L4: {
            if (null != ((we) this).field_a) {
              break L4;
            } else {
              try {
                L5: {
                  L6: {
                    if (((we) this).field_p == 0) {
                      ((we) this).field_a = (DataInputStream) ((we) this).field_k.field_g;
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                  L7: {
                    if (((we) this).field_p == 1) {
                      var4 = (java.net.Socket) ((we) this).field_g.field_g;
                      var4.setSoTimeout(10000);
                      var3 = var4.getOutputStream();
                      var3.write(17);
                      var5 = (CharSequence) (Object) ("JAGGRAB " + ((we) this).field_h.getFile() + "\n\n");
                      var3.write(pi.a(var5, 353));
                      ((we) this).field_a = new DataInputStream(var4.getInputStream());
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                  ((we) this).field_d.field_q = 0;
                  decompiledRegionSelector0 = 0;
                  break L5;
                }
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L8: {
                  var2 = (IOException) (Object) decompiledCaughtException;
                  ((we) this).finalize();
                  ((we) this).field_p = ((we) this).field_p + 1;
                  decompiledRegionSelector0 = 1;
                  break L8;
                }
              }
              if (decompiledRegionSelector0 == 0) {
                L9: {
                  if (null == ((we) this).field_n) {
                    ((we) this).field_n = ((we) this).field_b.a((Runnable) this, true, 5);
                    break L9;
                  } else {
                    break L9;
                  }
                }
                if (((we) this).field_n.field_d != 0) {
                  L10: {
                    if (((we) this).field_n.field_d == 1) {
                      break L10;
                    } else {
                      ((we) this).finalize();
                      ((we) this).field_p = ((we) this).field_p + 1;
                      break L10;
                    }
                  }
                  if (!param0) {
                    return true;
                  } else {
                    return false;
                  }
                } else {
                  return false;
                }
              } else {
                break L4;
              }
            }
          }
          L11: {
            if (null == ((we) this).field_n) {
              ((we) this).field_n = ((we) this).field_b.a((Runnable) this, true, 5);
              break L11;
            } else {
              break L11;
            }
          }
          if (((we) this).field_n.field_d != 0) {
            if (((we) this).field_n.field_d == 1) {
              if (!param0) {
                return true;
              } else {
                return false;
              }
            } else {
              ((we) this).finalize();
              ((we) this).field_p = ((we) this).field_p + 1;
              if (!param0) {
                return true;
              } else {
                return false;
              }
            }
          } else {
            return false;
          }
        } else {
          return true;
        }
    }

    public final void run() {
        try {
            int var1_int = 0;
            Object var1 = null;
            Exception var1_ref = null;
            Throwable var2 = null;
            Object var2_ref = null;
            Throwable var3 = null;
            int var4 = 0;
            Throwable decompiledCaughtException = null;
            var4 = TorChallenge.field_F ? 1 : 0;
            try {
              L0: while (true) {
                L1: {
                  if (((we) this).field_d.field_q >= ((we) this).field_d.field_m.length) {
                    break L1;
                  } else {
                    var1_int = ((we) this).field_a.read(((we) this).field_d.field_m, ((we) this).field_d.field_q, -((we) this).field_d.field_q + ((we) this).field_d.field_m.length);
                    if (var1_int < 0) {
                      break L1;
                    } else {
                      ((we) this).field_d.field_q = ((we) this).field_d.field_q + var1_int;
                      continue L0;
                    }
                  }
                }
                if (((we) this).field_d.field_q != ((we) this).field_d.field_m.length) {
                  var1 = this;
                  synchronized (var1) {
                    L2: {
                      ((we) this).finalize();
                      ((we) this).field_p = 3;
                      break L2;
                    }
                  }
                  return;
                } else {
                  throw we.<RuntimeException>$cfr$sneakyThrow(new Exception("HG1: " + ((we) this).field_d.field_m.length + " " + ((we) this).field_h));
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var1_ref = (Exception) (Object) decompiledCaughtException;
              var2_ref = this;
              synchronized (var2_ref) {
                L3: {
                  ((we) this).finalize();
                  ((we) this).field_p = ((we) this).field_p + 1;
                  break L3;
                }
              }
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static boolean b() {
        if (TorChallenge.field_H == null) {
            return false;
        }
        if (TorChallenge.field_H.f((byte) 123) == null) {
            return false;
        }
        return true;
    }

    final static int a(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        var4 = (-((param0 + 1) * param0) + param1 * (1 + param1)) / (2 * param0);
        return var4;
    }

    we(uj param0, java.net.URL param1, int param2) {
        try {
            ((we) this).field_h = param1;
            ((we) this).field_b = param0;
            ((we) this).field_d = new uf(param2);
        } catch (RuntimeException runtimeException) {
            throw oj.a((Throwable) (Object) runtimeException, "we.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 41);
        }
    }

    final uf b(int param0) {
        if (!(3 != ((we) this).field_p)) {
            return ((we) this).field_d;
        }
        int var2 = -78 % ((param0 - 79) / 33);
        return null;
    }

    public static void a() {
        field_l = null;
        field_m = null;
        field_e = null;
        field_i = null;
        field_c = null;
        field_o = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = new ka[6][2];
        field_l = new int[]{0, 1, 4, 1, 1, 1, 1, 1};
        field_f = 0;
        field_j = -1;
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
