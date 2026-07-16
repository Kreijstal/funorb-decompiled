/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class na implements Runnable {
    private gb field_g;
    private nj field_a;
    private dl field_h;
    private nj field_f;
    private int field_c;
    static boolean field_b;
    private java.net.URL field_e;
    private nj field_i;
    private DataInputStream field_d;
    static String[] field_j;

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
            var4 = SolKnight.field_L ? 1 : 0;
            try {
              L0: while (true) {
                L1: {
                  if (((na) this).field_g.field_m >= ((na) this).field_g.field_l.length) {
                    break L1;
                  } else {
                    var1_int = ((na) this).field_d.read(((na) this).field_g.field_l, ((na) this).field_g.field_m, ((na) this).field_g.field_l.length - ((na) this).field_g.field_m);
                    if (var1_int < 0) {
                      break L1;
                    } else {
                      ((na) this).field_g.field_m = ((na) this).field_g.field_m + var1_int;
                      continue L0;
                    }
                  }
                }
                if (((na) this).field_g.field_l.length != ((na) this).field_g.field_m) {
                  var1 = this;
                  synchronized (var1) {
                    L2: {
                      ((na) this).finalize();
                      ((na) this).field_c = 3;
                      break L2;
                    }
                  }
                  return;
                } else {
                  throw na.<RuntimeException>$cfr$sneakyThrow(new Exception("HG1: " + ((na) this).field_g.field_l.length + " " + ((na) this).field_e));
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var1_ref = (Exception) (Object) decompiledCaughtException;
              var2_ref = this;
              synchronized (var2_ref) {
                L3: {
                  ((na) this).finalize();
                  ((na) this).field_c = ((na) this).field_c + 1;
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

    final gb a(boolean param0) {
        if (!(((na) this).field_c != 3)) {
            return ((na) this).field_g;
        }
        if (param0) {
            return null;
        }
        na.a(110);
        return null;
    }

    final static byte[] a(int param0, byte[] param1) {
        int var2 = param1.length;
        byte[] var3 = new byte[var2];
        fk.a(param1, 0, var3, 0, var2);
        int var4 = -87 / ((66 - param0) / 49);
        return var3;
    }

    public static void a(int param0) {
        field_j = null;
        if (param0 != -13357) {
            Object var2 = null;
            String discarded$0 = na.a((String) null, (java.applet.Applet) null, -92);
        }
    }

    protected final void finalize() {
        if (!(null == ((na) this).field_i)) {
            if (!(null == ((na) this).field_i.field_e)) {
                try {
                    ((DataInputStream) ((na) this).field_i.field_e).close();
                } catch (Exception exception) {
                }
            }
            ((na) this).field_i = null;
        }
        if (null != ((na) this).field_a) {
            if (!(((na) this).field_a.field_e == null)) {
                try {
                    ((java.net.Socket) ((na) this).field_a.field_e).close();
                } catch (Exception exception) {
                }
            }
            ((na) this).field_a = null;
        }
        if (!(null == ((na) this).field_d)) {
            try {
                ((na) this).field_d.close();
            } catch (Exception exception) {
            }
            ((na) this).field_d = null;
        }
        ((na) this).field_f = null;
    }

    final static String a(String param0, java.applet.Applet param1, int param2) {
        try {
            String var3 = null;
            Throwable var3_ref = null;
            String[] var4 = null;
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            String stackIn_8_0 = null;
            Throwable decompiledCaughtException = null;
            String stackOut_7_0 = null;
            L0: {
              var7 = SolKnight.field_L ? 1 : 0;
              if (param2 == -32574) {
                break L0;
              } else {
                field_j = null;
                break L0;
              }
            }
            try {
              L1: {
                var3 = (String) fd.a(param1, "getcookies", (byte) 100);
                var4 = b.a(var3, ';', true);
                var5 = 0;
                L2: while (true) {
                  if (var4.length <= var5) {
                    break L1;
                  } else {
                    L3: {
                      var6 = var4[var5].indexOf('=');
                      if (0 > var6) {
                        break L3;
                      } else {
                        if (var4[var5].substring(0, var6).trim().equals((Object) (Object) param0)) {
                          stackOut_7_0 = var4[var5].substring(var6 + 1).trim();
                          stackIn_8_0 = stackOut_7_0;
                          return stackIn_8_0;
                        } else {
                          break L3;
                        }
                      }
                    }
                    var5++;
                    continue L2;
                  }
                }
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L4: {
                var3_ref = decompiledCaughtException;
                break L4;
              }
            }
            return null;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    na(dl param0, java.net.URL param1, int param2) {
        ((na) this).field_h = param0;
        ((na) this).field_e = param1;
        ((na) this).field_g = new gb(param2);
    }

    final synchronized boolean a(byte param0) {
        IOException var2 = null;
        OutputStream var3 = null;
        java.net.Socket var4 = null;
        CharSequence var5 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        if (2 <= ((na) this).field_c) {
          return true;
        } else {
          L0: {
            if (-1 == (((na) this).field_c ^ -1)) {
              L1: {
                if (null == ((na) this).field_i) {
                  ((na) this).field_i = ((na) this).field_h.a(((na) this).field_e, (byte) 68);
                  break L1;
                } else {
                  break L1;
                }
              }
              if (((na) this).field_i.field_c == 0) {
                return false;
              } else {
                if (((na) this).field_i.field_c != 1) {
                  ((na) this).field_i = null;
                  ((na) this).field_c = ((na) this).field_c + 1;
                  return false;
                } else {
                  break L0;
                }
              }
            } else {
              break L0;
            }
          }
          L2: {
            if ((((na) this).field_c ^ -1) == -2) {
              L3: {
                if (null != ((na) this).field_a) {
                  break L3;
                } else {
                  ((na) this).field_a = ((na) this).field_h.a(((na) this).field_e.getHost(), 443, -28148);
                  break L3;
                }
              }
              if (((na) this).field_a.field_c != 0) {
                if (1 != ((na) this).field_a.field_c) {
                  ((na) this).field_c = ((na) this).field_c + 1;
                  ((na) this).field_a = null;
                  return false;
                } else {
                  break L2;
                }
              } else {
                return false;
              }
            } else {
              break L2;
            }
          }
          L4: {
            if (null != ((na) this).field_d) {
              break L4;
            } else {
              try {
                L5: {
                  L6: {
                    if (-1 == (((na) this).field_c ^ -1)) {
                      ((na) this).field_d = (DataInputStream) ((na) this).field_i.field_e;
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                  L7: {
                    if ((((na) this).field_c ^ -1) == -2) {
                      var4 = (java.net.Socket) ((na) this).field_a.field_e;
                      var4.setSoTimeout(10000);
                      var3 = var4.getOutputStream();
                      var3.write(17);
                      var5 = (CharSequence) (Object) ("JAGGRAB " + ((na) this).field_e.getFile() + "\n\n");
                      var3.write(wb.a(65, var5));
                      ((na) this).field_d = new DataInputStream(var4.getInputStream());
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                  ((na) this).field_g.field_m = 0;
                  decompiledRegionSelector0 = 0;
                  break L5;
                }
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L8: {
                  var2 = (IOException) (Object) decompiledCaughtException;
                  ((na) this).finalize();
                  ((na) this).field_c = ((na) this).field_c + 1;
                  decompiledRegionSelector0 = 1;
                  break L8;
                }
              }
              if (decompiledRegionSelector0 == 0) {
                L9: {
                  if (null == ((na) this).field_f) {
                    ((na) this).field_f = ((na) this).field_h.a(5, -90, (Runnable) this);
                    break L9;
                  } else {
                    break L9;
                  }
                }
                if (-1 == (((na) this).field_f.field_c ^ -1)) {
                  return false;
                } else {
                  L10: {
                    if (((na) this).field_f.field_c != 1) {
                      ((na) this).finalize();
                      ((na) this).field_c = ((na) this).field_c + 1;
                      break L10;
                    } else {
                      break L10;
                    }
                  }
                  if (param0 > -57) {
                    ((na) this).field_d = null;
                    return false;
                  } else {
                    return false;
                  }
                }
              } else {
                break L4;
              }
            }
          }
          L11: {
            if (null == ((na) this).field_f) {
              ((na) this).field_f = ((na) this).field_h.a(5, -90, (Runnable) this);
              break L11;
            } else {
              break L11;
            }
          }
          if (-1 == (((na) this).field_f.field_c ^ -1)) {
            return false;
          } else {
            L12: {
              if (((na) this).field_f.field_c != 1) {
                ((na) this).finalize();
                ((na) this).field_c = ((na) this).field_c + 1;
                break L12;
              } else {
                break L12;
              }
            }
            if (param0 > -57) {
              ((na) this).field_d = null;
              return false;
            } else {
              return false;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = new String[]{"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
