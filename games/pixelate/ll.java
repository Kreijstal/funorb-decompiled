/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ll implements Runnable {
    private java.net.URL field_b;
    private int field_n;
    private ei field_j;
    static tg field_c;
    static String field_g;
    private ei field_e;
    static String field_k;
    static String field_p;
    static tf[] field_m;
    private cb field_h;
    private we field_l;
    static String field_f;
    private DataInputStream field_o;
    static String field_i;
    static int field_a;
    private ei field_d;

    final static void a(byte param0, int param1, int param2, int param3) {
        ce.field_b = param1;
        if (param0 > -112) {
            field_f = null;
            sl.field_l = param2;
            qo.field_s = param3;
            return;
        }
        sl.field_l = param2;
        qo.field_s = param3;
    }

    final static uj a(long param0, int param1) {
        if (param1 != 14428) {
            return null;
        }
        return (uj) (Object) eh.field_f.a(-11434, param0);
    }

    protected final void finalize() {
        if (((ll) this).field_e != null) {
            if (!(((ll) this).field_e.field_e == null)) {
                try {
                    ((DataInputStream) ((ll) this).field_e.field_e).close();
                } catch (Exception exception) {
                }
            }
            ((ll) this).field_e = null;
        }
        if (!(((ll) this).field_d == null)) {
            if (!(((ll) this).field_d.field_e == null)) {
                try {
                    ((java.net.Socket) ((ll) this).field_d.field_e).close();
                } catch (Exception exception) {
                }
            }
            ((ll) this).field_d = null;
        }
        if (!(((ll) this).field_o == null)) {
            try {
                ((ll) this).field_o.close();
            } catch (Exception exception) {
            }
            ((ll) this).field_o = null;
        }
        ((ll) this).field_j = null;
    }

    public static void a(byte param0) {
        field_i = null;
        field_g = null;
        field_k = null;
        field_m = null;
        field_p = null;
        field_c = null;
        field_f = null;
    }

    final we a(int param0) {
        if (((ll) this).field_n != param0) {
            return null;
        }
        return ((ll) this).field_l;
    }

    final synchronized boolean b(byte param0) {
        IOException var2 = null;
        OutputStream var3 = null;
        java.net.Socket var4 = null;
        CharSequence var5 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        if (2 <= ((ll) this).field_n) {
          return true;
        } else {
          L0: {
            if (((ll) this).field_n != 0) {
              break L0;
            } else {
              L1: {
                if (((ll) this).field_e == null) {
                  ((ll) this).field_e = ((ll) this).field_h.a((byte) -44, ((ll) this).field_b);
                  break L1;
                } else {
                  break L1;
                }
              }
              if (((ll) this).field_e.field_b == 0) {
                return false;
              } else {
                if (1 == ((ll) this).field_e.field_b) {
                  break L0;
                } else {
                  ((ll) this).field_n = ((ll) this).field_n + 1;
                  ((ll) this).field_e = null;
                  return false;
                }
              }
            }
          }
          L2: {
            if (((ll) this).field_n == 1) {
              L3: {
                if (null != ((ll) this).field_d) {
                  break L3;
                } else {
                  ((ll) this).field_d = ((ll) this).field_h.a(20278, ((ll) this).field_b.getHost(), 443);
                  break L3;
                }
              }
              if (((ll) this).field_d.field_b == 0) {
                return false;
              } else {
                if (1 != ((ll) this).field_d.field_b) {
                  ((ll) this).field_d = null;
                  ((ll) this).field_n = ((ll) this).field_n + 1;
                  return false;
                } else {
                  break L2;
                }
              }
            } else {
              break L2;
            }
          }
          L4: {
            if (((ll) this).field_o != null) {
              break L4;
            } else {
              try {
                L5: {
                  L6: {
                    if (0 == ((ll) this).field_n) {
                      ((ll) this).field_o = (DataInputStream) ((ll) this).field_e.field_e;
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                  L7: {
                    if (1 == ((ll) this).field_n) {
                      var4 = (java.net.Socket) ((ll) this).field_d.field_e;
                      var4.setSoTimeout(10000);
                      var3 = var4.getOutputStream();
                      var3.write(17);
                      var5 = (CharSequence) (Object) ("JAGGRAB " + ((ll) this).field_b.getFile() + "\n\n");
                      var3.write(gk.b(var5, 353));
                      ((ll) this).field_o = new DataInputStream(var4.getInputStream());
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                  ((ll) this).field_l.field_m = 0;
                  decompiledRegionSelector0 = 0;
                  break L5;
                }
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L8: {
                  var2 = (IOException) (Object) decompiledCaughtException;
                  ((ll) this).finalize();
                  ((ll) this).field_n = ((ll) this).field_n + 1;
                  decompiledRegionSelector0 = 1;
                  break L8;
                }
              }
              if (decompiledRegionSelector0 == 0) {
                if (param0 == -87) {
                  L9: {
                    if (((ll) this).field_j != null) {
                      break L9;
                    } else {
                      ((ll) this).field_j = ((ll) this).field_h.a(5, (Runnable) this, (byte) -123);
                      break L9;
                    }
                  }
                  if (((ll) this).field_j.field_b != 0) {
                    if (((ll) this).field_j.field_b != 1) {
                      ((ll) this).finalize();
                      ((ll) this).field_n = ((ll) this).field_n + 1;
                      return false;
                    } else {
                      return false;
                    }
                  } else {
                    return false;
                  }
                } else {
                  return true;
                }
              } else {
                break L4;
              }
            }
          }
          if (param0 == -87) {
            if (((ll) this).field_j != null) {
              if (((ll) this).field_j.field_b != 0) {
                if (((ll) this).field_j.field_b != 1) {
                  ((ll) this).finalize();
                  ((ll) this).field_n = ((ll) this).field_n + 1;
                  return false;
                } else {
                  return false;
                }
              } else {
                return false;
              }
            } else {
              ((ll) this).field_j = ((ll) this).field_h.a(5, (Runnable) this, (byte) -123);
              if (((ll) this).field_j.field_b != 0) {
                if (((ll) this).field_j.field_b == 1) {
                  return false;
                } else {
                  ((ll) this).finalize();
                  ((ll) this).field_n = ((ll) this).field_n + 1;
                  return false;
                }
              } else {
                return false;
              }
            }
          } else {
            return true;
          }
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
            var4 = Pixelate.field_H ? 1 : 0;
            try {
              L0: while (true) {
                L1: {
                  if (((ll) this).field_l.field_k.length <= ((ll) this).field_l.field_m) {
                    break L1;
                  } else {
                    var1_int = ((ll) this).field_o.read(((ll) this).field_l.field_k, ((ll) this).field_l.field_m, -((ll) this).field_l.field_m + ((ll) this).field_l.field_k.length);
                    if (var1_int >= 0) {
                      ((ll) this).field_l.field_m = ((ll) this).field_l.field_m + var1_int;
                      continue L0;
                    } else {
                      break L1;
                    }
                  }
                }
                if (((ll) this).field_l.field_m == ((ll) this).field_l.field_k.length) {
                  throw ll.<RuntimeException>$cfr$sneakyThrow(new Exception("HG1: " + ((ll) this).field_l.field_k.length + " " + ((ll) this).field_b));
                } else {
                  var1 = this;
                  synchronized (var1) {
                    L2: {
                      ((ll) this).finalize();
                      ((ll) this).field_n = 3;
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
                  ((ll) this).finalize();
                  ((ll) this).field_n = ((ll) this).field_n + 1;
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

    ll(cb param0, java.net.URL param1, int param2) {
        try {
            ((ll) this).field_h = param0;
            ((ll) this).field_b = param1;
            ((ll) this).field_l = new we(param2);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "ll.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = "You must be a member to play with the current options.";
        field_k = "Unable to connect to the data server. Please check any firewall you are using.";
        field_f = "You must play <%1> more rated games before playing with the current options.";
        field_p = "<%0> has lost connection.";
        field_i = "Click or press F10 to open Quick Chat";
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
