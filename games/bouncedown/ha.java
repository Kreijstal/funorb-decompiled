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
        int var2 = -40 / ((param0 - 64) / 51);
    }

    public final void run() {
        try {
            int var1_int = 0;
            Object var1 = null;
            Object var2 = null;
            Throwable var3 = null;
            int var4 = 0;
            Throwable decompiledCaughtException = null;
            var4 = Bounce.field_N;
            try {
              L0: while (true) {
                L1: {
                  if (this.field_a.field_i.length <= this.field_a.field_h) {
                    break L1;
                  } else {
                    var1_int = this.field_c.read(this.field_a.field_i, this.field_a.field_h, -this.field_a.field_h + this.field_a.field_i.length);
                    if (-1 < (var1_int ^ -1)) {
                      break L1;
                    } else {
                      this.field_a.field_h = this.field_a.field_h + var1_int;
                      continue L0;
                    }
                  }
                }
                if (this.field_a.field_h != this.field_a.field_i.length) {
                  var1 = this;
                  synchronized (var1) {
                    L2: {
                      this.finalize();
                      this.field_e = 3;
                      break L2;
                    }
                  }
                  return;
                } else {
                  throw ha.<RuntimeException>$cfr$sneakyThrow(new Exception("HG1: " + this.field_a.field_i.length + " " + this.field_d));
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var1 = (Exception) (Object) decompiledCaughtException;
              var2 = this;
              synchronized (var2) {
                L3: {
                  this.finalize();
                  this.field_e = this.field_e + 1;
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
        if (this.field_e == 3) {
            return this.field_a;
        }
        if (param0 == 11951) {
            return null;
        }
        return (wi) null;
    }

    final synchronized boolean a(byte param0) {
        IOException var2 = null;
        OutputStream var3 = null;
        java.net.Socket var4 = null;
        CharSequence var5 = null;
        Throwable decompiledCaughtException = null;
        if (this.field_e < 2) {
          L0: {
            if (-1 == (this.field_e ^ -1)) {
              L1: {
                if (this.field_n != null) {
                  break L1;
                } else {
                  this.field_n = this.field_i.a(this.field_d, false);
                  break L1;
                }
              }
              if (-1 == (this.field_n.field_f ^ -1)) {
                return false;
              } else {
                if (1 == this.field_n.field_f) {
                  break L0;
                } else {
                  this.field_n = null;
                  this.field_e = this.field_e + 1;
                  return false;
                }
              }
            } else {
              break L0;
            }
          }
          L2: {
            if (-2 == (this.field_e ^ -1)) {
              L3: {
                if (this.field_f == null) {
                  this.field_f = this.field_i.a(this.field_d.getHost(), 443, 0);
                  break L3;
                } else {
                  break L3;
                }
              }
              if (this.field_f.field_f == 0) {
                return false;
              } else {
                if ((this.field_f.field_f ^ -1) == -2) {
                  break L2;
                } else {
                  this.field_f = null;
                  this.field_e = this.field_e + 1;
                  return false;
                }
              }
            } else {
              break L2;
            }
          }
          if (null == this.field_c) {
            try {
              L4: {
                L5: {
                  if (-1 == (this.field_e ^ -1)) {
                    this.field_c = (DataInputStream) (this.field_n.field_e);
                    break L5;
                  } else {
                    break L5;
                  }
                }
                L6: {
                  if (1 == this.field_e) {
                    var4 = (java.net.Socket) (this.field_f.field_e);
                    var4.setSoTimeout(10000);
                    var3 = var4.getOutputStream();
                    var3.write(17);
                    var5 = (CharSequence) ((Object) ("JAGGRAB " + this.field_d.getFile() + "\n\n"));
                    var3.write(wi.a(var5, true));
                    this.field_c = new DataInputStream(var4.getInputStream());
                    break L6;
                  } else {
                    break L6;
                  }
                }
                this.field_a.field_h = 0;
                break L4;
              }
            } catch (java.io.IOException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L7: {
                var2 = (IOException) (Object) decompiledCaughtException;
                this.finalize();
                this.field_e = this.field_e + 1;
                if (this.field_h == null) {
                  this.field_h = this.field_i.a(5, (byte) -125, (Runnable) (this));
                  break L7;
                } else {
                  break L7;
                }
              }
              if (this.field_h.field_f == 0) {
                return false;
              } else {
                if (1 == this.field_h.field_f) {
                  if (param0 >= -46) {
                    this.field_a = (wi) null;
                    return false;
                  } else {
                    return false;
                  }
                } else {
                  this.finalize();
                  this.field_e = this.field_e + 1;
                  if (param0 < -46) {
                    return false;
                  } else {
                    this.field_a = (wi) null;
                    return false;
                  }
                }
              }
            }
            L8: {
              if (this.field_h == null) {
                this.field_h = this.field_i.a(5, (byte) -125, (Runnable) (this));
                break L8;
              } else {
                break L8;
              }
            }
            if (this.field_h.field_f == 0) {
              return false;
            } else {
              L9: {
                if (1 == this.field_h.field_f) {
                  break L9;
                } else {
                  this.finalize();
                  this.field_e = this.field_e + 1;
                  break L9;
                }
              }
              L10: {
                if (param0 < -46) {
                  break L10;
                } else {
                  this.field_a = (wi) null;
                  break L10;
                }
              }
              return false;
            }
          } else {
            L11: {
              if (this.field_h == null) {
                this.field_h = this.field_i.a(5, (byte) -125, (Runnable) (this));
                break L11;
              } else {
                break L11;
              }
            }
            if (this.field_h.field_f == 0) {
              return false;
            } else {
              L12: {
                if (1 == this.field_h.field_f) {
                  break L12;
                } else {
                  this.finalize();
                  this.field_e = this.field_e + 1;
                  break L12;
                }
              }
              if (param0 >= -46) {
                this.field_a = (wi) null;
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

    final static void a(int param0, sa param1, int param2) {
        ii var3 = null;
        RuntimeException var3_ref = null;
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
            var3 = hh.field_p;
            var3.a(true, param2);
            var3.a(5, (byte) 98);
            var3.a(0, (byte) 65);
            var3.e(param0 ^ 750670611, param1.field_n);
            var3.a(param1.field_g, (byte) 63);
            var3.a(param1.field_m, (byte) 98);
            if (param0 == -17765) {
              break L0;
            } else {
              ha.a(true);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) (var3_ref);
            stackOut_3_1 = new StringBuilder().append("ha.D(").append(param0).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L1;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L1;
            }
          }
          throw ii.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param2 + ')');
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
            this.field_i = param0;
            this.field_d = param1;
            this.field_a = new wi(param2);
        } catch (RuntimeException runtimeException) {
            throw ii.a((Throwable) ((Object) runtimeException), "ha.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    protected final void finalize() {
        if (!(null == this.field_n)) {
            if (this.field_n.field_e != null) {
                try {
                    ((DataInputStream) (this.field_n.field_e)).close();
                } catch (Exception exception) {
                }
            }
            this.field_n = null;
        }
        if (this.field_f != null) {
            if (this.field_f.field_e != null) {
                try {
                    ((java.net.Socket) (this.field_f.field_e)).close();
                } catch (Exception exception) {
                }
            }
            this.field_f = null;
        }
        if (!(null == this.field_c)) {
            try {
                this.field_c.close();
            } catch (Exception exception) {
            }
            this.field_c = null;
        }
        this.field_h = null;
    }

    static {
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
