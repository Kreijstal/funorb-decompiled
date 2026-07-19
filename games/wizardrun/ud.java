/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ud implements Runnable {
    private jh field_h;
    private int field_g;
    private java.net.URL field_d;
    static sd field_c;
    private DataInputStream field_f;
    private vh field_k;
    private jh field_j;
    private jh field_e;
    static String field_a;
    static va field_b;
    private va field_i;

    final va b(int param0) {
        if ((this.field_g ^ -1) != param0) {
            return null;
        }
        return this.field_i;
    }

    final static void a(byte param0, boolean param1, java.awt.Canvas param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var4 = wizardrun.field_H;
        try {
          L0: {
            if (param0 > 35) {
              break L0;
            } else {
              ud.a(-40, -128);
              break L0;
            }
          }
          if (ri.field_a >= 10) {
            if (w.a((byte) -117)) {
              if (-1 == (ml.field_t ^ -1)) {
                uk.a((byte) -123, param1, false);
                fc.a((byte) 80, 0, param2, 0);
                return;
              } else {
                uc.a(false, param2);
                return;
              }
            } else {
              ed.d();
              dg.a(320, 240, (byte) -97);
              fc.a((byte) 80, 0, param2, 0);
              return;
            }
          } else {
            L1: {
              var3_int = 0;
              if (!pk.field_o) {
                break L1;
              } else {
                pk.field_o = false;
                var3_int = 1;
                break L1;
              }
            }
            ug.a(10487, var3_int != 0, dl.a(true), wj.g(17325), sa.field_e);
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) (var3);
            stackOut_13_1 = new StringBuilder().append("ud.E(").append(param0).append(',').append(param1).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param2 == null) {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L2;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L2;
            }
          }
          throw bd.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ')');
        }
    }

    public static void a(int param0) {
        field_a = null;
        field_b = null;
        field_c = null;
        if (param0 != 240) {
            java.awt.Canvas var2 = (java.awt.Canvas) null;
            ud.a((byte) -25, true, (java.awt.Canvas) null);
        }
    }

    public final void run() {
        try {
            int var1_int = 0;
            Object var1 = null;
            Object var2 = null;
            Throwable var3 = null;
            int var4 = 0;
            Throwable decompiledCaughtException = null;
            var4 = wizardrun.field_H;
            try {
              L0: while (true) {
                L1: {
                  if (this.field_i.field_m >= this.field_i.field_k.length) {
                    break L1;
                  } else {
                    var1_int = this.field_f.read(this.field_i.field_k, this.field_i.field_m, this.field_i.field_k.length - this.field_i.field_m);
                    if (0 > var1_int) {
                      break L1;
                    } else {
                      this.field_i.field_m = this.field_i.field_m + var1_int;
                      continue L0;
                    }
                  }
                }
                if (this.field_i.field_m != this.field_i.field_k.length) {
                  var1 = this;
                  synchronized (var1) {
                    L2: {
                      this.finalize();
                      this.field_g = 3;
                      break L2;
                    }
                  }
                  return;
                } else {
                  throw ud.<RuntimeException>$cfr$sneakyThrow(new Exception("HG1: " + this.field_i.field_k.length + " " + this.field_d));
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var1 = (Exception) (Object) decompiledCaughtException;
              var2 = this;
              synchronized (var2) {
                L3: {
                  this.finalize();
                  this.field_g = this.field_g + 1;
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

    final static void a(int param0, int param1) {
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        dc var5 = null;
        sc var6 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = wizardrun.field_H;
        try {
          L0: {
            var5 = (dc) ((Object) v.field_d.b((byte) 111));
            L1: while (true) {
              if (var5 == null) {
                var3 = 105 % ((param1 - -34) / 40);
                var6 = (sc) ((Object) tg.field_c.b((byte) 118));
                L2: while (true) {
                  if (var6 == null) {
                    break L0;
                  } else {
                    ld.a(param0, var6, 0);
                    var6 = (sc) ((Object) tg.field_c.d(8192));
                    continue L2;
                  }
                }
              } else {
                de.a(-14149, param0, var5);
                var5 = (dc) ((Object) v.field_d.d(8192));
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw bd.a((Throwable) ((Object) var2), "ud.B(" + param0 + ',' + param1 + ')');
        }
    }

    protected final void finalize() {
        if (!(this.field_h == null)) {
            if (!(this.field_h.field_e == null)) {
                try {
                    ((DataInputStream) (this.field_h.field_e)).close();
                } catch (Exception exception) {
                }
            }
            this.field_h = null;
        }
        if (null != this.field_j) {
            if (null != this.field_j.field_e) {
                try {
                    ((java.net.Socket) (this.field_j.field_e)).close();
                } catch (Exception exception) {
                }
            }
            this.field_j = null;
        }
        if (null != this.field_f) {
            try {
                this.field_f.close();
            } catch (Exception exception) {
            }
            this.field_f = null;
        }
        this.field_e = null;
    }

    final synchronized boolean c(int param0) {
        IOException var2 = null;
        OutputStream var3 = null;
        java.net.Socket var4 = null;
        CharSequence var5 = null;
        Throwable decompiledCaughtException = null;
        if (this.field_g >= 2) {
          return true;
        } else {
          L0: {
            if (-1 != (this.field_g ^ -1)) {
              break L0;
            } else {
              L1: {
                if (this.field_h != null) {
                  break L1;
                } else {
                  this.field_h = this.field_k.a(this.field_d, 127);
                  break L1;
                }
              }
              if (-1 == (this.field_h.field_a ^ -1)) {
                return false;
              } else {
                if (this.field_h.field_a == 1) {
                  break L0;
                } else {
                  this.field_h = null;
                  this.field_g = this.field_g + 1;
                  return false;
                }
              }
            }
          }
          L2: {
            if (1 == this.field_g) {
              L3: {
                if (null != this.field_j) {
                  break L3;
                } else {
                  this.field_j = this.field_k.a(this.field_d.getHost(), 443, (byte) -20);
                  break L3;
                }
              }
              if (this.field_j.field_a == 0) {
                return false;
              } else {
                if (-2 == (this.field_j.field_a ^ -1)) {
                  break L2;
                } else {
                  this.field_g = this.field_g + 1;
                  this.field_j = null;
                  return false;
                }
              }
            } else {
              break L2;
            }
          }
          if (this.field_f == null) {
            try {
              L4: {
                L5: {
                  if (this.field_g == 0) {
                    this.field_f = (DataInputStream) (this.field_h.field_e);
                    break L5;
                  } else {
                    break L5;
                  }
                }
                L6: {
                  if (this.field_g != 1) {
                    break L6;
                  } else {
                    var4 = (java.net.Socket) (this.field_j.field_e);
                    var4.setSoTimeout(10000);
                    var3 = var4.getOutputStream();
                    var3.write(17);
                    var5 = (CharSequence) ((Object) ("JAGGRAB " + this.field_d.getFile() + "\n\n"));
                    var3.write(wh.a((byte) -111, var5));
                    this.field_f = new DataInputStream(var4.getInputStream());
                    break L6;
                  }
                }
                this.field_i.field_m = 0;
                break L4;
              }
            } catch (java.io.IOException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L7: {
                var2 = (IOException) (Object) decompiledCaughtException;
                this.finalize();
                this.field_g = this.field_g + 1;
                if (this.field_e == null) {
                  this.field_e = this.field_k.a((byte) -82, (Runnable) (this), 5);
                  break L7;
                } else {
                  break L7;
                }
              }
              if (0 != this.field_e.field_a) {
                if (param0 <= 71) {
                  L8: {
                    ud.a(-20);
                    if (this.field_e.field_a != 1) {
                      this.finalize();
                      this.field_g = this.field_g + 1;
                      break L8;
                    } else {
                      break L8;
                    }
                  }
                  return false;
                } else {
                  L9: {
                    if (this.field_e.field_a != 1) {
                      this.finalize();
                      this.field_g = this.field_g + 1;
                      break L9;
                    } else {
                      break L9;
                    }
                  }
                  return false;
                }
              } else {
                return false;
              }
            }
            L10: {
              if (this.field_e == null) {
                this.field_e = this.field_k.a((byte) -82, (Runnable) (this), 5);
                break L10;
              } else {
                break L10;
              }
            }
            if (0 == this.field_e.field_a) {
              return false;
            } else {
              L11: {
                if (param0 > 71) {
                  break L11;
                } else {
                  ud.a(-20);
                  break L11;
                }
              }
              L12: {
                if (this.field_e.field_a != 1) {
                  this.finalize();
                  this.field_g = this.field_g + 1;
                  break L12;
                } else {
                  break L12;
                }
              }
              return false;
            }
          } else {
            L13: {
              if (this.field_e == null) {
                this.field_e = this.field_k.a((byte) -82, (Runnable) (this), 5);
                break L13;
              } else {
                break L13;
              }
            }
            if (0 != this.field_e.field_a) {
              L14: {
                if (param0 > 71) {
                  break L14;
                } else {
                  ud.a(-20);
                  break L14;
                }
              }
              if (this.field_e.field_a == 1) {
                return false;
              } else {
                this.finalize();
                this.field_g = this.field_g + 1;
                return false;
              }
            } else {
              return false;
            }
          }
        }
    }

    final static void a(o param0, boolean param1) {
        if (param1) {
            return;
        }
        try {
            ph.d(-31782);
            ed.a(param0.field_B, param0.field_x, param0.field_s);
        } catch (RuntimeException runtimeException) {
            throw bd.a((Throwable) ((Object) runtimeException), "ud.F(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    ud(vh param0, java.net.URL param1, int param2) {
        try {
            this.field_d = param1;
            this.field_k = param0;
            this.field_i = new va(param2);
        } catch (RuntimeException runtimeException) {
            throw bd.a((Throwable) ((Object) runtimeException), "ud.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        field_c = new sd(2);
        field_a = "Return to game";
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
