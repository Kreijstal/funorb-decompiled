/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class sk implements Runnable {
    private DataInputStream field_b;
    private int field_g;
    private java.net.URL field_c;
    private od field_e;
    private ni field_d;
    private ce field_f;
    private od field_h;
    private od field_a;

    final ni a(int param0) {
        if (param0 < 83) {
            return null;
        }
        if (((sk) this).field_g != 3) {
            return null;
        }
        return ((sk) this).field_d;
    }

    final synchronized boolean c(byte param0) {
        IOException var2 = null;
        OutputStream var3 = null;
        java.net.Socket var4 = null;
        CharSequence var5 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        if (-3 < ((sk) this).field_g) {
          L0: {
            if (-1 == ((sk) this).field_g) {
              L1: {
                if (((sk) this).field_h != null) {
                  break L1;
                } else {
                  ((sk) this).field_h = ((sk) this).field_f.a(((sk) this).field_c, -34);
                  break L1;
                }
              }
              if (((sk) this).field_h.field_b != 0) {
                if (1 == ((sk) this).field_h.field_b) {
                  break L0;
                } else {
                  ((sk) this).field_h = null;
                  ((sk) this).field_g = ((sk) this).field_g + 1;
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
            if (param0 > 41) {
              break L2;
            } else {
              ((sk) this).field_c = null;
              break L2;
            }
          }
          L3: {
            if (1 == ((sk) this).field_g) {
              L4: {
                if (null == ((sk) this).field_e) {
                  ((sk) this).field_e = ((sk) this).field_f.a(443, (byte) 32, ((sk) this).field_c.getHost());
                  break L4;
                } else {
                  break L4;
                }
              }
              if (0 != ((sk) this).field_e.field_b) {
                if (((sk) this).field_e.field_b != 1) {
                  ((sk) this).field_e = null;
                  ((sk) this).field_g = ((sk) this).field_g + 1;
                  return false;
                } else {
                  break L3;
                }
              } else {
                return false;
              }
            } else {
              break L3;
            }
          }
          L5: {
            if (((sk) this).field_b != null) {
              break L5;
            } else {
              try {
                L6: {
                  L7: {
                    if (((sk) this).field_g == 0) {
                      ((sk) this).field_b = (DataInputStream) ((sk) this).field_h.field_e;
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                  L8: {
                    if (1 == ((sk) this).field_g) {
                      var4 = (java.net.Socket) ((sk) this).field_e.field_e;
                      var4.setSoTimeout(10000);
                      var3 = var4.getOutputStream();
                      var3.write(17);
                      var5 = (CharSequence) (Object) ("JAGGRAB " + ((sk) this).field_c.getFile() + "\n\n");
                      var3.write(ea.a(-18428, var5));
                      ((sk) this).field_b = new DataInputStream(var4.getInputStream());
                      break L8;
                    } else {
                      break L8;
                    }
                  }
                  ((sk) this).field_d.field_i = 0;
                  decompiledRegionSelector0 = 0;
                  break L6;
                }
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L9: {
                  var2 = (IOException) (Object) decompiledCaughtException;
                  ((sk) this).finalize();
                  ((sk) this).field_g = ((sk) this).field_g + 1;
                  decompiledRegionSelector0 = 1;
                  break L9;
                }
              }
              if (decompiledRegionSelector0 == 0) {
                L10: {
                  if (((sk) this).field_a != null) {
                    break L10;
                  } else {
                    ((sk) this).field_a = ((sk) this).field_f.a(4532, (Runnable) this, 5);
                    break L10;
                  }
                }
                if (((sk) this).field_a.field_b != 0) {
                  if (((sk) this).field_a.field_b == 1) {
                    return false;
                  } else {
                    ((sk) this).finalize();
                    ((sk) this).field_g = ((sk) this).field_g + 1;
                    return false;
                  }
                } else {
                  return false;
                }
              } else {
                break L5;
              }
            }
          }
          if (((sk) this).field_a != null) {
            if (((sk) this).field_a.field_b == 0) {
              return false;
            } else {
              L11: {
                if (((sk) this).field_a.field_b != 1) {
                  ((sk) this).finalize();
                  ((sk) this).field_g = ((sk) this).field_g + 1;
                  break L11;
                } else {
                  break L11;
                }
              }
              return false;
            }
          } else {
            ((sk) this).field_a = ((sk) this).field_f.a(4532, (Runnable) this, 5);
            if (((sk) this).field_a.field_b == 0) {
              return false;
            } else {
              L12: {
                if (((sk) this).field_a.field_b != 1) {
                  ((sk) this).finalize();
                  ((sk) this).field_g = ((sk) this).field_g + 1;
                  break L12;
                } else {
                  break L12;
                }
              }
              return false;
            }
          }
        } else {
          return true;
        }
    }

    final static void a(int param0, String param1) {
        if (param0 != 0) {
          return;
        } else {
          int discarded$2 = -66;
          System.out.println("Error: " + tj.a("%0a", param1, "\n"));
          return;
        }
    }

    final static void b() {
        int[] var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int[] var6 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            var6 = ed.field_c;
            var1 = var6;
            var2 = 0;
            var3 = var6.length;
            L1: while (true) {
              if (var3 <= var2) {
                break L0;
              } else {
                int incrementValue$40 = var2;
                var2++;
                var1[incrementValue$40] = 0;
                int incrementValue$41 = var2;
                var2++;
                var1[incrementValue$41] = 0;
                int incrementValue$42 = var2;
                var2++;
                var1[incrementValue$42] = 0;
                int incrementValue$43 = var2;
                var2++;
                var1[incrementValue$43] = 0;
                int incrementValue$44 = var2;
                var2++;
                var1[incrementValue$44] = 0;
                int incrementValue$45 = var2;
                var2++;
                var1[incrementValue$45] = 0;
                int incrementValue$46 = var2;
                var2++;
                var1[incrementValue$46] = 0;
                int incrementValue$47 = var2;
                var2++;
                var1[incrementValue$47] = 0;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw pf.a((Throwable) (Object) var1_ref, "sk.D(" + -80 + 41);
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
            var4 = fleas.field_A ? 1 : 0;
            try {
              L0: while (true) {
                L1: {
                  if (((sk) this).field_d.field_i >= ((sk) this).field_d.field_k.length) {
                    break L1;
                  } else {
                    var1_int = ((sk) this).field_b.read(((sk) this).field_d.field_k, ((sk) this).field_d.field_i, -((sk) this).field_d.field_i + ((sk) this).field_d.field_k.length);
                    if (0 > var1_int) {
                      break L1;
                    } else {
                      ((sk) this).field_d.field_i = ((sk) this).field_d.field_i + var1_int;
                      continue L0;
                    }
                  }
                }
                if (((sk) this).field_d.field_i == ((sk) this).field_d.field_k.length) {
                  throw sk.<RuntimeException>$cfr$sneakyThrow(new Exception("HG1: " + ((sk) this).field_d.field_k.length + " " + ((sk) this).field_c));
                } else {
                  var1 = this;
                  synchronized (var1) {
                    L2: {
                      ((sk) this).finalize();
                      ((sk) this).field_g = 3;
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
                  ((sk) this).finalize();
                  ((sk) this).field_g = ((sk) this).field_g + 1;
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

    final static java.awt.Container a() {
        if (!(cb.field_t == null)) {
            return (java.awt.Container) (Object) cb.field_t;
        }
        return (java.awt.Container) (Object) rl.a((byte) -117);
    }

    sk(ce param0, java.net.URL param1, int param2) {
        try {
            ((sk) this).field_f = param0;
            ((sk) this).field_c = param1;
            ((sk) this).field_d = new ni(param2);
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) (Object) runtimeException, "sk.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 41);
        }
    }

    final static void a(int param0, qc param1, int param2, int param3, qc param4) {
        id.field_c = 2;
        try {
            ae.field_c = 8;
            ge.field_h = 8;
            qg.field_b = param1;
            ub.field_a = param4;
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) (Object) runtimeException, "sk.F(" + 8 + 44 + (param1 != null ? "{...}" : "null") + 44 + 8 + 44 + 443 + 44 + (param4 != null ? "{...}" : "null") + 44 + 2 + 41);
        }
    }

    protected final void finalize() {
        if (!(null == ((sk) this).field_h)) {
            if (!(((sk) this).field_h.field_e == null)) {
                try {
                    ((DataInputStream) ((sk) this).field_h.field_e).close();
                } catch (Exception exception) {
                }
            }
            ((sk) this).field_h = null;
        }
        if (!(((sk) this).field_e == null)) {
            if (!(((sk) this).field_e.field_e == null)) {
                try {
                    ((java.net.Socket) ((sk) this).field_e.field_e).close();
                } catch (Exception exception) {
                }
            }
            ((sk) this).field_e = null;
        }
        if (null != ((sk) this).field_b) {
            try {
                ((sk) this).field_b.close();
            } catch (Exception exception) {
            }
            ((sk) this).field_b = null;
        }
        ((sk) this).field_a = null;
    }

    static {
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
