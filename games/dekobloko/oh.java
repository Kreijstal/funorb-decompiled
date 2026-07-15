/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class oh implements Runnable {
    static int field_n;
    static w field_d;
    private java.net.URL field_j;
    private mh field_h;
    private DataInputStream field_g;
    private int field_k;
    private wl field_a;
    static char[] field_f;
    private fd field_m;
    static boolean field_b;
    private mh field_l;
    static ck field_e;
    static w field_i;
    static int[] field_c;
    private mh field_o;

    final wl a(boolean param0) {
        if (!(3 != ((oh) this).field_k)) {
            return ((oh) this).field_a;
        }
        if (!param0) {
            return null;
        }
        ((oh) this).field_k = -68;
        return null;
    }

    final synchronized boolean a(int param0) {
        IOException var2 = null;
        OutputStream var3 = null;
        java.net.Socket var4 = null;
        CharSequence var5 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        if (2 > ((oh) this).field_k) {
          L0: {
            if (((oh) this).field_k == 0) {
              L1: {
                if (null != ((oh) this).field_o) {
                  break L1;
                } else {
                  ((oh) this).field_o = ((oh) this).field_m.a(((oh) this).field_j, (byte) 66);
                  break L1;
                }
              }
              if (((oh) this).field_o.field_c != 0) {
                if ((((oh) this).field_o.field_c ^ -1) == -2) {
                  break L0;
                } else {
                  ((oh) this).field_o = null;
                  ((oh) this).field_k = ((oh) this).field_k + 1;
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
            if ((((oh) this).field_k ^ -1) != -2) {
              break L2;
            } else {
              L3: {
                if (((oh) this).field_h == null) {
                  ((oh) this).field_h = ((oh) this).field_m.a(100, ((oh) this).field_j.getHost(), 443);
                  break L3;
                } else {
                  break L3;
                }
              }
              if (((oh) this).field_h.field_c == 0) {
                return false;
              } else {
                if (1 == ((oh) this).field_h.field_c) {
                  break L2;
                } else {
                  ((oh) this).field_k = ((oh) this).field_k + 1;
                  ((oh) this).field_h = null;
                  return false;
                }
              }
            }
          }
          L4: {
            if (null != ((oh) this).field_g) {
              break L4;
            } else {
              try {
                L5: {
                  L6: {
                    if (0 != ((oh) this).field_k) {
                      break L6;
                    } else {
                      ((oh) this).field_g = (DataInputStream) ((oh) this).field_o.field_b;
                      break L6;
                    }
                  }
                  L7: {
                    if ((((oh) this).field_k ^ -1) == -2) {
                      var4 = (java.net.Socket) ((oh) this).field_h.field_b;
                      var4.setSoTimeout(10000);
                      var3 = var4.getOutputStream();
                      var3.write(17);
                      var5 = (CharSequence) (Object) ("JAGGRAB " + ((oh) this).field_j.getFile() + "\n\n");
                      var3.write(km.a(6216, var5));
                      ((oh) this).field_g = new DataInputStream(var4.getInputStream());
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                  ((oh) this).field_a.field_n = 0;
                  decompiledRegionSelector0 = 0;
                  break L5;
                }
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L8: {
                  var2 = (IOException) (Object) decompiledCaughtException;
                  ((oh) this).finalize();
                  ((oh) this).field_k = ((oh) this).field_k + 1;
                  decompiledRegionSelector0 = 1;
                  break L8;
                }
              }
              if (decompiledRegionSelector0 == 0) {
                L9: {
                  if (param0 < -89) {
                    break L9;
                  } else {
                    wl discarded$2 = ((oh) this).a(true);
                    break L9;
                  }
                }
                L10: {
                  if (null == ((oh) this).field_l) {
                    ((oh) this).field_l = ((oh) this).field_m.a((byte) 121, 5, (Runnable) this);
                    break L10;
                  } else {
                    break L10;
                  }
                }
                if (0 == ((oh) this).field_l.field_c) {
                  return false;
                } else {
                  if (-2 != (((oh) this).field_l.field_c ^ -1)) {
                    ((oh) this).finalize();
                    ((oh) this).field_k = ((oh) this).field_k + 1;
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
          if (param0 < -89) {
            L11: {
              if (null == ((oh) this).field_l) {
                ((oh) this).field_l = ((oh) this).field_m.a((byte) 121, 5, (Runnable) this);
                break L11;
              } else {
                break L11;
              }
            }
            if (0 == ((oh) this).field_l.field_c) {
              return false;
            } else {
              if (-2 != (((oh) this).field_l.field_c ^ -1)) {
                ((oh) this).finalize();
                ((oh) this).field_k = ((oh) this).field_k + 1;
                return false;
              } else {
                return false;
              }
            }
          } else {
            L12: {
              wl discarded$3 = ((oh) this).a(true);
              if (null == ((oh) this).field_l) {
                ((oh) this).field_l = ((oh) this).field_m.a((byte) 121, 5, (Runnable) this);
                break L12;
              } else {
                break L12;
              }
            }
            if (0 == ((oh) this).field_l.field_c) {
              return false;
            } else {
              if (-2 == (((oh) this).field_l.field_c ^ -1)) {
                return false;
              } else {
                ((oh) this).finalize();
                ((oh) this).field_k = ((oh) this).field_k + 1;
                return false;
              }
            }
          }
        } else {
          return true;
        }
    }

    final static byte[] a(String param0, int param1) {
        Object var3 = null;
        if (param1 != -15192) {
          var3 = null;
          ui discarded$2 = oh.a((ji) null, -55, (String) null, (pl) null, (String) null);
          return lc.field_h.a(0, param0, "");
        } else {
          return lc.field_h.a(0, param0, "");
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
            var4 = client.field_A ? 1 : 0;
            try {
              L0: while (true) {
                L1: {
                  if (((oh) this).field_a.field_n >= ((oh) this).field_a.field_r.length) {
                    break L1;
                  } else {
                    var1_int = ((oh) this).field_g.read(((oh) this).field_a.field_r, ((oh) this).field_a.field_n, -((oh) this).field_a.field_n + ((oh) this).field_a.field_r.length);
                    if (var1_int < 0) {
                      break L1;
                    } else {
                      ((oh) this).field_a.field_n = ((oh) this).field_a.field_n + var1_int;
                      continue L0;
                    }
                  }
                }
                if (((oh) this).field_a.field_r.length == ((oh) this).field_a.field_n) {
                  throw oh.<RuntimeException>$cfr$sneakyThrow(new Exception("HG1: " + ((oh) this).field_a.field_r.length + " " + ((oh) this).field_j));
                } else {
                  var1 = this;
                  synchronized (var1) {
                    L2: {
                      ((oh) this).finalize();
                      ((oh) this).field_k = 3;
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
                  ((oh) this).finalize();
                  ((oh) this).field_k = ((oh) this).field_k + 1;
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

    public static void b(boolean param0) {
        field_e = null;
        field_c = null;
        field_d = null;
        if (param0) {
            return;
        }
        field_f = null;
        field_i = null;
    }

    final static void a(byte param0) {
        if (param0 != 13) {
            Object var2 = null;
            byte[] discarded$0 = oh.a((String) null, -97);
        }
    }

    protected final void finalize() {
        if (null != ((oh) this).field_o) {
            if (!(((oh) this).field_o.field_b == null)) {
                try {
                    ((DataInputStream) ((oh) this).field_o.field_b).close();
                } catch (Exception exception) {
                }
            }
            ((oh) this).field_o = null;
        }
        if (((oh) this).field_h != null) {
            if (!(((oh) this).field_h.field_b == null)) {
                try {
                    ((java.net.Socket) ((oh) this).field_h.field_b).close();
                } catch (Exception exception) {
                }
            }
            ((oh) this).field_h = null;
        }
        if (!(((oh) this).field_g == null)) {
            try {
                ((oh) this).field_g.close();
            } catch (Exception exception) {
            }
            ((oh) this).field_g = null;
        }
        ((oh) this).field_l = null;
    }

    final static ui a(ji param0, int param1, String param2, pl param3, String param4) {
        int var5 = 0;
        int var6 = 0;
        if (param1 != 91) {
          return null;
        } else {
          var5 = param0.b(param1 + -92, param2);
          var6 = param0.a(var5, param1 + 12939, param4);
          return jg.a(true, param3, var6, var5, param0);
        }
    }

    oh(fd param0, java.net.URL param1, int param2) {
        ((oh) this).field_j = param1;
        ((oh) this).field_m = param0;
        ((oh) this).field_a = new wl(param2);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = 64;
        field_b = false;
        field_f = new char[]{(char)91, (char)93, (char)35};
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
