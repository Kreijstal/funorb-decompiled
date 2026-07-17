/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class qb implements Runnable {
    private java.net.URL field_g;
    private DataInputStream field_k;
    static sd field_d;
    private wk field_c;
    private jj field_i;
    private wk field_h;
    private int field_e;
    private ed field_j;
    static int[] field_b;
    private wk field_a;
    static lg[] field_f;

    final static boolean a(CharSequence param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        boolean stackIn_1_0 = false;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_0_0 = false;
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
            var2_int = -68 % ((param1 - 30) / 50);
            stackOut_0_0 = tn.a(10, true, param0, -128);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var2;
            stackOut_2_1 = new StringBuilder().append("qb.E(");
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
          throw wn.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + 44 + param1 + 41);
        }
        return stackIn_1_0;
    }

    final static int a(int param0, int param1, boolean param2, int param3) {
        if (param3 != 10000) {
            Object var5 = null;
            boolean discarded$0 = qb.a((CharSequence) null, -15);
            return pk.a(1);
        }
        return pk.a(1);
    }

    protected final void finalize() {
        if (null != ((qb) this).field_a) {
            if (((qb) this).field_a.field_d != null) {
                try {
                    ((DataInputStream) ((qb) this).field_a.field_d).close();
                } catch (Exception exception) {
                }
            }
            ((qb) this).field_a = null;
        }
        if (null != ((qb) this).field_h) {
            if (!(((qb) this).field_h.field_d == null)) {
                try {
                    ((java.net.Socket) ((qb) this).field_h.field_d).close();
                } catch (Exception exception) {
                }
            }
            ((qb) this).field_h = null;
        }
        if (null != ((qb) this).field_k) {
            try {
                ((qb) this).field_k.close();
            } catch (Exception exception) {
            }
            ((qb) this).field_k = null;
        }
        ((qb) this).field_c = null;
    }

    final ed a(int param0) {
        if (~((qb) this).field_e != param0) {
            return null;
        }
        return ((qb) this).field_j;
    }

    final synchronized boolean b(int param0) {
        IOException var2 = null;
        OutputStream var3 = null;
        java.net.Socket var4 = null;
        CharSequence var5 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        if (((qb) this).field_e < 2) {
          L0: {
            if (~((qb) this).field_e == param0) {
              L1: {
                if (((qb) this).field_a == null) {
                  ((qb) this).field_a = ((qb) this).field_i.a(-90, ((qb) this).field_g);
                  break L1;
                } else {
                  break L1;
                }
              }
              if (((qb) this).field_a.field_b != 0) {
                if (((qb) this).field_a.field_b == 1) {
                  break L0;
                } else {
                  ((qb) this).field_a = null;
                  ((qb) this).field_e = ((qb) this).field_e + 1;
                  return false;
                }
              } else {
                return false;
              }
            } else {
              break L0;
            }
          }
          L2: {
            if (((qb) this).field_e != 1) {
              break L2;
            } else {
              L3: {
                if (null != ((qb) this).field_h) {
                  break L3;
                } else {
                  ((qb) this).field_h = ((qb) this).field_i.a(-82, 443, ((qb) this).field_g.getHost());
                  break L3;
                }
              }
              if (((qb) this).field_h.field_b != 0) {
                if (((qb) this).field_h.field_b != 1) {
                  ((qb) this).field_e = ((qb) this).field_e + 1;
                  ((qb) this).field_h = null;
                  return false;
                } else {
                  break L2;
                }
              } else {
                return false;
              }
            }
          }
          L4: {
            if (null != ((qb) this).field_k) {
              break L4;
            } else {
              try {
                L5: {
                  L6: {
                    if (((qb) this).field_e == 0) {
                      ((qb) this).field_k = (DataInputStream) ((qb) this).field_a.field_d;
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                  L7: {
                    if (1 == ((qb) this).field_e) {
                      var4 = (java.net.Socket) ((qb) this).field_h.field_d;
                      var4.setSoTimeout(10000);
                      var3 = var4.getOutputStream();
                      var3.write(17);
                      var5 = (CharSequence) (Object) ("JAGGRAB " + ((qb) this).field_g.getFile() + "\n\n");
                      var3.write(bo.a(var5, -711));
                      ((qb) this).field_k = new DataInputStream(var4.getInputStream());
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                  ((qb) this).field_j.field_u = 0;
                  decompiledRegionSelector0 = 0;
                  break L5;
                }
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L8: {
                  var2 = (IOException) (Object) decompiledCaughtException;
                  ((qb) this).finalize();
                  ((qb) this).field_e = ((qb) this).field_e + 1;
                  decompiledRegionSelector0 = 1;
                  break L8;
                }
              }
              if (decompiledRegionSelector0 == 0) {
                L9: {
                  if (null == ((qb) this).field_c) {
                    ((qb) this).field_c = ((qb) this).field_i.a(5, (Runnable) this, ~param0);
                    break L9;
                  } else {
                    break L9;
                  }
                }
                if (0 != ((qb) this).field_c.field_b) {
                  if (((qb) this).field_c.field_b == 1) {
                    return false;
                  } else {
                    ((qb) this).finalize();
                    ((qb) this).field_e = ((qb) this).field_e + 1;
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
          L10: {
            if (null == ((qb) this).field_c) {
              ((qb) this).field_c = ((qb) this).field_i.a(5, (Runnable) this, ~param0);
              break L10;
            } else {
              break L10;
            }
          }
          if (0 == ((qb) this).field_c.field_b) {
            return false;
          } else {
            L11: {
              if (((qb) this).field_c.field_b != 1) {
                ((qb) this).finalize();
                ((qb) this).field_e = ((qb) this).field_e + 1;
                break L11;
              } else {
                break L11;
              }
            }
            return false;
          }
        } else {
          return true;
        }
    }

    public static void a(byte param0) {
        field_b = null;
        field_d = null;
        field_f = null;
    }

    final static void a(int param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            fj.a(cq.field_i, 811497217, param0, q.field_x, ug.field_b, 0, true);
            var2_int = 0;
            L1: while (true) {
              if (cq.field_i <= var2_int) {
                fj.a(cq.field_i + param0, 811497217, param0 - -param0, f.field_y, id.field_d, param0, false);
                if (cq.field_i > param0) {
                  cq.field_i = param0;
                  break L0;
                } else {
                  return;
                }
              } else {
                ac.field_I[var2_int - -param0] = var2_int;
                var2_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wn.a((Throwable) (Object) var2, "qb.A(" + param0 + 44 + 2 + 41);
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
            var4 = Vertigo2.field_L ? 1 : 0;
            try {
              L0: while (true) {
                L1: {
                  if (((qb) this).field_j.field_p.length <= ((qb) this).field_j.field_u) {
                    break L1;
                  } else {
                    var1_int = ((qb) this).field_k.read(((qb) this).field_j.field_p, ((qb) this).field_j.field_u, ((qb) this).field_j.field_p.length - ((qb) this).field_j.field_u);
                    if (0 <= var1_int) {
                      ((qb) this).field_j.field_u = ((qb) this).field_j.field_u + var1_int;
                      continue L0;
                    } else {
                      break L1;
                    }
                  }
                }
                if (((qb) this).field_j.field_u == ((qb) this).field_j.field_p.length) {
                  throw qb.<RuntimeException>$cfr$sneakyThrow(new Exception("HG1: " + ((qb) this).field_j.field_p.length + " " + ((qb) this).field_g));
                } else {
                  var1 = this;
                  synchronized (var1) {
                    L2: {
                      ((qb) this).finalize();
                      ((qb) this).field_e = 3;
                      break L2;
                    }
                  }
                  return;
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var1_ref = (Exception) (Object) decompiledCaughtException;
              var2_ref = this;
              synchronized (var2_ref) {
                L3: {
                  ((qb) this).finalize();
                  ((qb) this).field_e = ((qb) this).field_e + 1;
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

    qb(jj param0, java.net.URL param1, int param2) {
        try {
            ((qb) this).field_i = param0;
            ((qb) this).field_g = param1;
            ((qb) this).field_j = new ed(param2);
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) (Object) runtimeException, "qb.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = new lg[2];
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
