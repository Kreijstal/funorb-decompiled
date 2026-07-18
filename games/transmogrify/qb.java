/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class qb implements Runnable {
    private ib field_d;
    static long field_k;
    private oa field_h;
    private DataInputStream field_g;
    private ib field_e;
    private ib field_j;
    private int field_c;
    static String[] field_f;
    static String field_a;
    private fe field_i;
    private java.net.URL field_b;

    protected final void finalize() {
        if (!(((qb) this).field_j == null)) {
            if (!(null == ((qb) this).field_j.field_g)) {
                try {
                    ((DataInputStream) ((qb) this).field_j.field_g).close();
                } catch (Exception exception) {
                }
            }
            ((qb) this).field_j = null;
        }
        if (!(((qb) this).field_d == null)) {
            if (((qb) this).field_d.field_g != null) {
                try {
                    ((java.net.Socket) ((qb) this).field_d.field_g).close();
                } catch (Exception exception) {
                }
            }
            ((qb) this).field_d = null;
        }
        if (((qb) this).field_g != null) {
            try {
                ((qb) this).field_g.close();
            } catch (Exception exception) {
            }
            ((qb) this).field_g = null;
        }
        ((qb) this).field_e = null;
    }

    public static void a() {
        field_f = null;
        field_a = null;
    }

    final synchronized boolean a(int param0) {
        IOException var2 = null;
        OutputStream var3 = null;
        java.net.Socket var4 = null;
        CharSequence var5 = null;
        Throwable decompiledCaughtException = null;
        if (((qb) this).field_c >= 2) {
          return true;
        } else {
          L0: {
            if (((qb) this).field_c == param0) {
              L1: {
                if (null != ((qb) this).field_j) {
                  break L1;
                } else {
                  ((qb) this).field_j = ((qb) this).field_i.a(-21377, ((qb) this).field_b);
                  break L1;
                }
              }
              if (((qb) this).field_j.field_c != 0) {
                if (((qb) this).field_j.field_c == 1) {
                  break L0;
                } else {
                  ((qb) this).field_j = null;
                  ((qb) this).field_c = ((qb) this).field_c + 1;
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
            if (((qb) this).field_c != 1) {
              break L2;
            } else {
              L3: {
                if (null != ((qb) this).field_d) {
                  break L3;
                } else {
                  ((qb) this).field_d = ((qb) this).field_i.a(88, ((qb) this).field_b.getHost(), 443);
                  break L3;
                }
              }
              if (((qb) this).field_d.field_c == 0) {
                return false;
              } else {
                if (((qb) this).field_d.field_c != 1) {
                  ((qb) this).field_d = null;
                  ((qb) this).field_c = ((qb) this).field_c + 1;
                  return false;
                } else {
                  break L2;
                }
              }
            }
          }
          if (((qb) this).field_g == null) {
            try {
              L4: {
                L5: {
                  if (((qb) this).field_c == 0) {
                    ((qb) this).field_g = (DataInputStream) ((qb) this).field_j.field_g;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                L6: {
                  if (((qb) this).field_c != 1) {
                    break L6;
                  } else {
                    var4 = (java.net.Socket) ((qb) this).field_d.field_g;
                    var4.setSoTimeout(10000);
                    var3 = var4.getOutputStream();
                    var3.write(17);
                    var5 = (CharSequence) (Object) ("JAGGRAB " + ((qb) this).field_b.getFile() + "\n\n");
                    var3.write(uk.a(14122, var5));
                    ((qb) this).field_g = new DataInputStream(var4.getInputStream());
                    break L6;
                  }
                }
                ((qb) this).field_h.field_h = 0;
                break L4;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2 = (IOException) (Object) decompiledCaughtException;
              ((qb) this).finalize();
              ((qb) this).field_c = ((qb) this).field_c + 1;
              if (null != ((qb) this).field_e) {
                if (0 == ((qb) this).field_e.field_c) {
                  return false;
                } else {
                  if (((qb) this).field_e.field_c == 1) {
                    return false;
                  } else {
                    ((qb) this).finalize();
                    ((qb) this).field_c = ((qb) this).field_c + 1;
                    return false;
                  }
                }
              } else {
                ((qb) this).field_e = ((qb) this).field_i.a((Runnable) this, 5, 65535);
                if (0 == ((qb) this).field_e.field_c) {
                  return false;
                } else {
                  if (((qb) this).field_e.field_c != 1) {
                    ((qb) this).finalize();
                    ((qb) this).field_c = ((qb) this).field_c + 1;
                    return false;
                  } else {
                    return false;
                  }
                }
              }
            }
            L7: {
              if (null != ((qb) this).field_e) {
                break L7;
              } else {
                ((qb) this).field_e = ((qb) this).field_i.a((Runnable) this, 5, 65535);
                break L7;
              }
            }
            if (0 == ((qb) this).field_e.field_c) {
              return false;
            } else {
              L8: {
                if (((qb) this).field_e.field_c == 1) {
                  break L8;
                } else {
                  ((qb) this).finalize();
                  ((qb) this).field_c = ((qb) this).field_c + 1;
                  break L8;
                }
              }
              return false;
            }
          } else {
            L9: {
              if (null != ((qb) this).field_e) {
                break L9;
              } else {
                ((qb) this).field_e = ((qb) this).field_i.a((Runnable) this, 5, 65535);
                break L9;
              }
            }
            if (0 == ((qb) this).field_e.field_c) {
              return false;
            } else {
              if (((qb) this).field_e.field_c == 1) {
                return false;
              } else {
                ((qb) this).finalize();
                ((qb) this).field_c = ((qb) this).field_c + 1;
                return false;
              }
            }
          }
        }
    }

    final oa b(int param0) {
        int var2 = 68 / ((param0 - 56) / 56);
        if (!(((qb) this).field_c != 3)) {
            return ((qb) this).field_h;
        }
        return null;
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
            var4 = Transmogrify.field_A ? 1 : 0;
            try {
              L0: while (true) {
                L1: {
                  if (((qb) this).field_h.field_h >= ((qb) this).field_h.field_g.length) {
                    break L1;
                  } else {
                    var1_int = ((qb) this).field_g.read(((qb) this).field_h.field_g, ((qb) this).field_h.field_h, ((qb) this).field_h.field_g.length - ((qb) this).field_h.field_h);
                    if (var1_int >= 0) {
                      ((qb) this).field_h.field_h = ((qb) this).field_h.field_h + var1_int;
                      continue L0;
                    } else {
                      break L1;
                    }
                  }
                }
                if (((qb) this).field_h.field_g.length == ((qb) this).field_h.field_h) {
                  throw qb.<RuntimeException>$cfr$sneakyThrow(new Exception("HG1: " + ((qb) this).field_h.field_g.length + " " + (Object) (Object) ((qb) this).field_b));
                } else {
                  var1 = this;
                  synchronized (var1) {
                    L2: {
                      ((qb) this).finalize();
                      ((qb) this).field_c = 3;
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
                  ((qb) this).field_c = ((qb) this).field_c + 1;
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

    qb(fe param0, java.net.URL param1, int param2) {
        try {
            ((qb) this).field_b = param1;
            ((qb) this).field_i = param0;
            ((qb) this).field_h = new oa(param2);
        } catch (RuntimeException runtimeException) {
            throw ch.a((Throwable) (Object) runtimeException, "qb.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static void a(int param0, int param1, oa param2, int param3, int param4) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              param2.f(6389, 12);
              param2.c(17, -159688920);
              param2.c(param4, -159688920);
              param2.c(param1, -159688920);
              param2.f(6389, param3);
              if (param0 >= 112) {
                break L1;
              } else {
                field_k = -61L;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("qb.C(").append(param0).append(',').append(param1).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param2 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw ch.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Reload game";
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
