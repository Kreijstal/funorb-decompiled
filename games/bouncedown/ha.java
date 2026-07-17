/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ha implements Runnable {
    private wi field_a;
    private int field_e;
    private si field_i;
    private java.net.URL field_d;
    private mk field_f;
    private DataInputStream field_c;
    static String field_j;
    private mk field_h;
    static vf field_l;
    static String field_g;
    static String field_k;
    private mk field_n;
    static int field_b;
    static String field_m;

    final static void a(int param0, boolean param1) {
        of.a(true, param1, (byte) 95);
        int var2 = -40;
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
            var4 = Bounce.field_N;
            try {
              L0: while (true) {
                L1: {
                  if (((ha) this).field_a.field_i.length <= ((ha) this).field_a.field_h) {
                    break L1;
                  } else {
                    var1_int = ((ha) this).field_c.read(((ha) this).field_a.field_i, ((ha) this).field_a.field_h, -((ha) this).field_a.field_h + ((ha) this).field_a.field_i.length);
                    if (var1_int < 0) {
                      break L1;
                    } else {
                      ((ha) this).field_a.field_h = ((ha) this).field_a.field_h + var1_int;
                      continue L0;
                    }
                  }
                }
                if (((ha) this).field_a.field_h != ((ha) this).field_a.field_i.length) {
                  var1 = this;
                  synchronized (var1) {
                    L2: {
                      ((ha) this).finalize();
                      ((ha) this).field_e = 3;
                      break L2;
                    }
                  }
                  return;
                } else {
                  throw ha.<RuntimeException>$cfr$sneakyThrow(new Exception("HG1: " + ((ha) this).field_a.field_i.length + " " + ((ha) this).field_d));
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var1_ref = (Exception) (Object) decompiledCaughtException;
              var2_ref = this;
              synchronized (var2_ref) {
                L3: {
                  ((ha) this).finalize();
                  ((ha) this).field_e = ((ha) this).field_e + 1;
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

    final wi a(int param0) {
        if (((ha) this).field_e == 3) {
            return ((ha) this).field_a;
        }
        if (param0 == 11951) {
            return null;
        }
        return null;
    }

    final synchronized boolean a(byte param0) {
        IOException var2 = null;
        OutputStream var3 = null;
        java.net.Socket var4 = null;
        CharSequence var5 = null;
        Throwable decompiledCaughtException = null;
        if (((ha) this).field_e < 2) {
          L0: {
            if (((ha) this).field_e == 0) {
              L1: {
                if (((ha) this).field_n != null) {
                  break L1;
                } else {
                  ((ha) this).field_n = ((ha) this).field_i.a(((ha) this).field_d, false);
                  break L1;
                }
              }
              if (((ha) this).field_n.field_f == 0) {
                return false;
              } else {
                if (1 == ((ha) this).field_n.field_f) {
                  break L0;
                } else {
                  ((ha) this).field_n = null;
                  ((ha) this).field_e = ((ha) this).field_e + 1;
                  return false;
                }
              }
            } else {
              break L0;
            }
          }
          L2: {
            if (((ha) this).field_e == 1) {
              L3: {
                if (((ha) this).field_f == null) {
                  ((ha) this).field_f = ((ha) this).field_i.a(((ha) this).field_d.getHost(), 443, 0);
                  break L3;
                } else {
                  break L3;
                }
              }
              if (((ha) this).field_f.field_f == 0) {
                return false;
              } else {
                if (((ha) this).field_f.field_f == 1) {
                  break L2;
                } else {
                  ((ha) this).field_f = null;
                  ((ha) this).field_e = ((ha) this).field_e + 1;
                  return false;
                }
              }
            } else {
              break L2;
            }
          }
          if (null == ((ha) this).field_c) {
            try {
              L4: {
                L5: {
                  if (((ha) this).field_e == 0) {
                    ((ha) this).field_c = (DataInputStream) ((ha) this).field_n.field_e;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                L6: {
                  if (1 == ((ha) this).field_e) {
                    var4 = (java.net.Socket) ((ha) this).field_f.field_e;
                    var4.setSoTimeout(10000);
                    var3 = var4.getOutputStream();
                    var3.write(17);
                    var5 = (CharSequence) (Object) ("JAGGRAB " + ((ha) this).field_d.getFile() + "\n\n");
                    var3.write(wi.a(var5, true));
                    ((ha) this).field_c = new DataInputStream(var4.getInputStream());
                    break L6;
                  } else {
                    break L6;
                  }
                }
                ((ha) this).field_a.field_h = 0;
                break L4;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L7: {
                var2 = (IOException) (Object) decompiledCaughtException;
                ((ha) this).finalize();
                ((ha) this).field_e = ((ha) this).field_e + 1;
                if (((ha) this).field_h == null) {
                  ((ha) this).field_h = ((ha) this).field_i.a(5, (byte) -125, (Runnable) this);
                  break L7;
                } else {
                  break L7;
                }
              }
              if (((ha) this).field_h.field_f == 0) {
                return false;
              } else {
                if (1 == ((ha) this).field_h.field_f) {
                  if (param0 >= -46) {
                    ((ha) this).field_a = null;
                    return false;
                  } else {
                    return false;
                  }
                } else {
                  ((ha) this).finalize();
                  ((ha) this).field_e = ((ha) this).field_e + 1;
                  if (param0 < -46) {
                    return false;
                  } else {
                    ((ha) this).field_a = null;
                    return false;
                  }
                }
              }
            }
            L8: {
              if (((ha) this).field_h == null) {
                ((ha) this).field_h = ((ha) this).field_i.a(5, (byte) -125, (Runnable) this);
                break L8;
              } else {
                break L8;
              }
            }
            if (((ha) this).field_h.field_f == 0) {
              return false;
            } else {
              L9: {
                if (1 == ((ha) this).field_h.field_f) {
                  break L9;
                } else {
                  ((ha) this).finalize();
                  ((ha) this).field_e = ((ha) this).field_e + 1;
                  break L9;
                }
              }
              L10: {
                if (param0 < -46) {
                  break L10;
                } else {
                  ((ha) this).field_a = null;
                  break L10;
                }
              }
              return false;
            }
          } else {
            L11: {
              if (((ha) this).field_h == null) {
                ((ha) this).field_h = ((ha) this).field_i.a(5, (byte) -125, (Runnable) this);
                break L11;
              } else {
                break L11;
              }
            }
            if (((ha) this).field_h.field_f == 0) {
              return false;
            } else {
              L12: {
                if (1 == ((ha) this).field_h.field_f) {
                  break L12;
                } else {
                  ((ha) this).finalize();
                  ((ha) this).field_e = ((ha) this).field_e + 1;
                  break L12;
                }
              }
              if (param0 >= -46) {
                ((ha) this).field_a = null;
                return false;
              } else {
                return false;
              }
            }
          }
        } else {
          return true;
        }
    }

    final static void a(int param0, sa param1) {
        ii var3 = null;
        RuntimeException var3_ref = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          var3 = hh.field_p;
          var3.a(true, 3);
          var3.a(5, (byte) 98);
          var3.a(0, (byte) 65);
          var3.e(-750655096, param1.field_n);
          var3.a(param1.field_g, (byte) 63);
          var3.a(param1.field_m, (byte) 98);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L0: {
            var3_ref = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var3_ref;
            stackOut_2_1 = new StringBuilder().append("ha.D(").append(-17765).append(44);
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L0;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L0;
            }
          }
          throw ii.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + 44 + 3 + 41);
        }
    }

    public static void a(boolean param0) {
        field_g = null;
        field_k = null;
        field_j = null;
        field_l = null;
        if (param0) {
            ha.a(true);
            field_m = null;
            return;
        }
        field_m = null;
    }

    ha(si param0, java.net.URL param1, int param2) {
        try {
            ((ha) this).field_i = param0;
            ((ha) this).field_d = param1;
            ((ha) this).field_a = new wi(param2);
        } catch (RuntimeException runtimeException) {
            throw ii.a((Throwable) (Object) runtimeException, "ha.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 41);
        }
    }

    protected final void finalize() {
        if (!(null == ((ha) this).field_n)) {
            if (((ha) this).field_n.field_e != null) {
                try {
                    ((DataInputStream) ((ha) this).field_n.field_e).close();
                } catch (Exception exception) {
                }
            }
            ((ha) this).field_n = null;
        }
        if (((ha) this).field_f != null) {
            if (((ha) this).field_f.field_e != null) {
                try {
                    ((java.net.Socket) ((ha) this).field_f.field_e).close();
                } catch (Exception exception) {
                }
            }
            ((ha) this).field_f = null;
        }
        if (!(null == ((ha) this).field_c)) {
            try {
                ((ha) this).field_c.close();
            } catch (Exception exception) {
            }
            ((ha) this).field_c = null;
        }
        ((ha) this).field_h = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = "Email is valid";
        field_j = "Email: ";
        field_k = "Account created successfully!";
        field_m = "Orb coins: <%0>";
        field_b = -1;
        field_l = new vf();
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
