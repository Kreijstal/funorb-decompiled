/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class caa implements Runnable {
    private naa field_d;
    private naa field_c;
    private DataInputStream field_a;
    private uia field_h;
    private int field_f;
    static int field_i;
    private naa field_e;
    private java.net.URL field_b;
    private fia field_g;

    final static void a(ff param0, la param1, int param2) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        try {
          L0: {
            L1: {
              if (vpa.a(54)) {
                break L1;
              } else {
                if (!param0.k(-25319)) {
                  if (0 > param1.q((byte) -82)) {
                    return;
                  } else {
                    ql.field_k.k(97, -2988);
                    ql.field_k.f(-1477662136, param1.q((byte) -82));
                    ql.field_k.f(-1477662136, param1.a((byte) 107));
                    break L0;
                  }
                } else {
                  break L1;
                }
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) runtimeException;
            stackOut_9_1 = new StringBuilder().append("caa.A(");
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L2;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L2;
            }
          }
          L3: {
            stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
            stackOut_12_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(44);
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param1 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L3;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L3;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 44 + 108 + 41);
        }
    }

    final synchronized boolean a(boolean param0) {
        IOException var2 = null;
        OutputStream var3 = null;
        java.net.Socket var4 = null;
        CharSequence var5 = null;
        Throwable decompiledCaughtException = null;
        if (((caa) this).field_f < 2) {
          L0: {
            if (((caa) this).field_f != 0) {
              break L0;
            } else {
              L1: {
                if (((caa) this).field_c != null) {
                  break L1;
                } else {
                  ((caa) this).field_c = ((caa) this).field_g.a(((caa) this).field_b, 74);
                  break L1;
                }
              }
              if (((caa) this).field_c.field_b == 0) {
                return false;
              } else {
                if (((caa) this).field_c.field_b == 1) {
                  break L0;
                } else {
                  ((caa) this).field_c = null;
                  ((caa) this).field_f = ((caa) this).field_f + 1;
                  return false;
                }
              }
            }
          }
          L2: {
            if (((caa) this).field_f == 1) {
              L3: {
                if (null == ((caa) this).field_e) {
                  ((caa) this).field_e = ((caa) this).field_g.a(-24818, ((caa) this).field_b.getHost(), 443);
                  break L3;
                } else {
                  break L3;
                }
              }
              if (((caa) this).field_e.field_b == 0) {
                return false;
              } else {
                if (((caa) this).field_e.field_b != 1) {
                  ((caa) this).field_f = ((caa) this).field_f + 1;
                  ((caa) this).field_e = null;
                  return false;
                } else {
                  break L2;
                }
              }
            } else {
              break L2;
            }
          }
          if (((caa) this).field_a == null) {
            try {
              L4: {
                L5: {
                  if (0 == ((caa) this).field_f) {
                    ((caa) this).field_a = (DataInputStream) ((caa) this).field_c.field_f;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                L6: {
                  if (1 != ((caa) this).field_f) {
                    break L6;
                  } else {
                    var4 = (java.net.Socket) ((caa) this).field_e.field_f;
                    var4.setSoTimeout(10000);
                    var3 = var4.getOutputStream();
                    var3.write(17);
                    var5 = (CharSequence) (Object) ("JAGGRAB " + ((caa) this).field_b.getFile() + "\n\n");
                    var3.write(us.a(var5, param0));
                    ((caa) this).field_a = new DataInputStream(var4.getInputStream());
                    break L6;
                  }
                }
                ((caa) this).field_h.field_h = 0;
                break L4;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L7: {
                var2 = (IOException) (Object) decompiledCaughtException;
                ((caa) this).finalize();
                ((caa) this).field_f = ((caa) this).field_f + 1;
                if (null == ((caa) this).field_d) {
                  ((caa) this).field_d = ((caa) this).field_g.a((Runnable) this, 425, 5);
                  break L7;
                } else {
                  break L7;
                }
              }
              if (!param0) {
                if (((caa) this).field_d.field_b == 0) {
                  return false;
                } else {
                  L8: {
                    if (((caa) this).field_d.field_b != 1) {
                      ((caa) this).finalize();
                      ((caa) this).field_f = ((caa) this).field_f + 1;
                      break L8;
                    } else {
                      break L8;
                    }
                  }
                  return false;
                }
              } else {
                ((caa) this).field_a = null;
                if (((caa) this).field_d.field_b == 0) {
                  return false;
                } else {
                  L9: {
                    if (((caa) this).field_d.field_b != 1) {
                      ((caa) this).finalize();
                      ((caa) this).field_f = ((caa) this).field_f + 1;
                      break L9;
                    } else {
                      break L9;
                    }
                  }
                  return false;
                }
              }
            }
            L10: {
              if (null == ((caa) this).field_d) {
                ((caa) this).field_d = ((caa) this).field_g.a((Runnable) this, 425, 5);
                break L10;
              } else {
                break L10;
              }
            }
            L11: {
              if (!param0) {
                break L11;
              } else {
                ((caa) this).field_a = null;
                break L11;
              }
            }
            if (((caa) this).field_d.field_b == 0) {
              return false;
            } else {
              L12: {
                if (((caa) this).field_d.field_b != 1) {
                  ((caa) this).finalize();
                  ((caa) this).field_f = ((caa) this).field_f + 1;
                  break L12;
                } else {
                  break L12;
                }
              }
              return false;
            }
          } else {
            L13: {
              if (null == ((caa) this).field_d) {
                ((caa) this).field_d = ((caa) this).field_g.a((Runnable) this, 425, 5);
                break L13;
              } else {
                break L13;
              }
            }
            L14: {
              if (!param0) {
                break L14;
              } else {
                ((caa) this).field_a = null;
                break L14;
              }
            }
            if (((caa) this).field_d.field_b == 0) {
              return false;
            } else {
              if (((caa) this).field_d.field_b != 1) {
                ((caa) this).finalize();
                ((caa) this).field_f = ((caa) this).field_f + 1;
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

    final static void a(byte param0) {
        bh.field_p = true;
        bja.a(pl.a((byte) 64), (byte) 126, 3);
        int var1 = 72 / ((param0 - 55) / 46);
        rba.field_a.e((byte) 106);
    }

    protected final void finalize() {
        if (null != ((caa) this).field_c) {
            if (!(((caa) this).field_c.field_f == null)) {
                try {
                    ((DataInputStream) ((caa) this).field_c.field_f).close();
                } catch (Exception exception) {
                }
            }
            ((caa) this).field_c = null;
        }
        if (((caa) this).field_e != null) {
            if (!(null == ((caa) this).field_e.field_f)) {
                try {
                    ((java.net.Socket) ((caa) this).field_e.field_f).close();
                } catch (Exception exception) {
                }
            }
            ((caa) this).field_e = null;
        }
        if (!(((caa) this).field_a == null)) {
            try {
                ((caa) this).field_a.close();
            } catch (Exception exception) {
            }
            ((caa) this).field_a = null;
        }
        ((caa) this).field_d = null;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        RuntimeException decompiledCaughtException = null;
        var7 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param5 == 0) {
                break L1;
              } else {
                field_i = 59;
                break L1;
              }
            }
            var6_int = param3;
            L2: while (true) {
              if (param4 < var6_int) {
                break L0;
              } else {
                nra.a((byte) -55, param0, param1, vaa.field_a[var6_int], param2);
                var6_int++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var6, "caa.B(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 41);
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
            var4 = TombRacer.field_G ? 1 : 0;
            try {
              L0: while (true) {
                L1: {
                  if (((caa) this).field_h.field_g.length <= ((caa) this).field_h.field_h) {
                    break L1;
                  } else {
                    var1_int = ((caa) this).field_a.read(((caa) this).field_h.field_g, ((caa) this).field_h.field_h, -((caa) this).field_h.field_h + ((caa) this).field_h.field_g.length);
                    if (var1_int >= 0) {
                      ((caa) this).field_h.field_h = ((caa) this).field_h.field_h + var1_int;
                      continue L0;
                    } else {
                      break L1;
                    }
                  }
                }
                if (((caa) this).field_h.field_g.length == ((caa) this).field_h.field_h) {
                  throw caa.<RuntimeException>$cfr$sneakyThrow(new Exception("HG1: " + ((caa) this).field_h.field_g.length + " " + ((caa) this).field_b));
                } else {
                  var1 = this;
                  synchronized (var1) {
                    L2: {
                      ((caa) this).finalize();
                      ((caa) this).field_f = 3;
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
                  ((caa) this).finalize();
                  ((caa) this).field_f = ((caa) this).field_f + 1;
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

    final uia b(byte param0) {
        if (param0 >= -115) {
            uia discarded$9 = ((caa) this).b((byte) 71);
            if (!(((caa) this).field_f != 3)) {
                return ((caa) this).field_h;
            }
            return null;
        }
        if (!(((caa) this).field_f != 3)) {
            return ((caa) this).field_h;
        }
        return null;
    }

    caa(fia param0, java.net.URL param1, int param2) {
        try {
            ((caa) this).field_b = param1;
            ((caa) this).field_g = param0;
            ((caa) this).field_h = new uia(param2);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "caa.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = 2;
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
