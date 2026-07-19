/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class wg implements Runnable {
    static int[] field_j;
    private DataInputStream field_g;
    private wf field_i;
    private ei field_f;
    private int field_d;
    private ei field_h;
    private ab field_a;
    static int field_e;
    private java.net.URL field_c;
    private ei field_b;

    protected final void finalize() {
        if (!(null == this.field_f)) {
            if (this.field_f.field_g != null) {
                try {
                    ((DataInputStream) (this.field_f.field_g)).close();
                } catch (Exception exception) {
                }
            }
            this.field_f = null;
        }
        if (!(null == this.field_h)) {
            if (!(null == this.field_h.field_g)) {
                try {
                    ((java.net.Socket) (this.field_h.field_g)).close();
                } catch (Exception exception) {
                }
            }
            this.field_h = null;
        }
        if (this.field_g != null) {
            try {
                this.field_g.close();
            } catch (Exception exception) {
            }
            this.field_g = null;
        }
        this.field_b = null;
    }

    final static int b(int param0) {
        int discarded$0 = 0;
        if (param0 != 13174) {
            discarded$0 = wg.b(57);
            return 1;
        }
        return 1;
    }

    public static void c(int param0) {
        if (param0 <= 115) {
            field_e = -22;
            field_j = null;
            return;
        }
        field_j = null;
    }

    final wf a(byte param0) {
        if (param0 != -65) {
            return (wf) null;
        }
        if (!(-4 != (this.field_d ^ -1))) {
            return this.field_i;
        }
        return null;
    }

    final synchronized boolean a(int param0) {
        IOException var2 = null;
        OutputStream var3 = null;
        java.net.Socket var4 = null;
        CharSequence var5 = null;
        Throwable decompiledCaughtException = null;
        if (this.field_d < 2) {
          L0: {
            if (0 == this.field_d) {
              L1: {
                if (null != this.field_f) {
                  break L1;
                } else {
                  this.field_f = this.field_a.a(-23816, this.field_c);
                  break L1;
                }
              }
              if (0 == this.field_f.field_b) {
                return false;
              } else {
                if (1 == this.field_f.field_b) {
                  break L0;
                } else {
                  this.field_d = this.field_d + 1;
                  this.field_f = null;
                  return false;
                }
              }
            } else {
              break L0;
            }
          }
          L2: {
            if (param0 >= 38) {
              break L2;
            } else {
              this.field_c = (java.net.URL) null;
              break L2;
            }
          }
          L3: {
            if (-2 != (this.field_d ^ -1)) {
              break L3;
            } else {
              L4: {
                if (null != this.field_h) {
                  break L4;
                } else {
                  this.field_h = this.field_a.a(443, (byte) 125, this.field_c.getHost());
                  break L4;
                }
              }
              if (0 != this.field_h.field_b) {
                if (-2 == (this.field_h.field_b ^ -1)) {
                  break L3;
                } else {
                  this.field_d = this.field_d + 1;
                  this.field_h = null;
                  return false;
                }
              } else {
                return false;
              }
            }
          }
          if (null == this.field_g) {
            try {
              L5: {
                L6: {
                  if (this.field_d != 0) {
                    break L6;
                  } else {
                    this.field_g = (DataInputStream) (this.field_f.field_g);
                    break L6;
                  }
                }
                L7: {
                  if (this.field_d == 1) {
                    var4 = (java.net.Socket) (this.field_h.field_g);
                    var4.setSoTimeout(10000);
                    var3 = var4.getOutputStream();
                    var3.write(17);
                    var5 = (CharSequence) ((Object) ("JAGGRAB " + this.field_c.getFile() + "\n\n"));
                    var3.write(cl.a((byte) -98, var5));
                    this.field_g = new DataInputStream(var4.getInputStream());
                    break L7;
                  } else {
                    break L7;
                  }
                }
                this.field_i.field_h = 0;
                break L5;
              }
            } catch (java.io.IOException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L8: {
                var2 = (IOException) (Object) decompiledCaughtException;
                this.finalize();
                this.field_d = this.field_d + 1;
                if (this.field_b == null) {
                  this.field_b = this.field_a.a((Runnable) (this), false, 5);
                  break L8;
                } else {
                  break L8;
                }
              }
              if (-1 == (this.field_b.field_b ^ -1)) {
                return false;
              } else {
                if (-2 != (this.field_b.field_b ^ -1)) {
                  this.finalize();
                  this.field_d = this.field_d + 1;
                  return false;
                } else {
                  return false;
                }
              }
            }
            L9: {
              if (this.field_b == null) {
                this.field_b = this.field_a.a((Runnable) (this), false, 5);
                break L9;
              } else {
                break L9;
              }
            }
            if (-1 == (this.field_b.field_b ^ -1)) {
              return false;
            } else {
              L10: {
                if (-2 == (this.field_b.field_b ^ -1)) {
                  break L10;
                } else {
                  this.finalize();
                  this.field_d = this.field_d + 1;
                  break L10;
                }
              }
              return false;
            }
          } else {
            L11: {
              if (this.field_b == null) {
                this.field_b = this.field_a.a((Runnable) (this), false, 5);
                break L11;
              } else {
                break L11;
              }
            }
            if (-1 == (this.field_b.field_b ^ -1)) {
              return false;
            } else {
              if (-2 != (this.field_b.field_b ^ -1)) {
                this.finalize();
                this.field_d = this.field_d + 1;
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

    public final void run() {
        try {
            int var1_int = 0;
            Exception var1 = null;
            Object var1_ref = null;
            Throwable var2 = null;
            Object var2_ref = null;
            Throwable var3 = null;
            int var4 = 0;
            int var5 = 0;
            int var6 = 0;
            Throwable decompiledCaughtException = null;
            var4 = Lexicominos.field_L ? 1 : 0;
            try {
              L0: while (true) {
                L1: {
                  L2: {
                    L3: {
                      if (this.field_i.field_h >= this.field_i.field_j.length) {
                        break L3;
                      } else {
                        var1_int = this.field_g.read(this.field_i.field_j, this.field_i.field_h, -this.field_i.field_h + this.field_i.field_j.length);
                        var6 = -1;
                        var5 = var1_int ^ -1;
                        if (var4 != 0) {
                          if (var5 == var6) {
                            break L1;
                          } else {
                            break L2;
                          }
                        } else {
                          L4: {
                            if (var5 <= var6) {
                              break L4;
                            } else {
                              if (var4 == 0) {
                                break L3;
                              } else {
                                break L4;
                              }
                            }
                          }
                          this.field_i.field_h = this.field_i.field_h + var1_int;
                          if (var4 == 0) {
                            continue L0;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                    if (this.field_i.field_h == this.field_i.field_j.length) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                  var1_ref = this;
                  synchronized (var1_ref) {
                    L5: {
                      this.finalize();
                      this.field_d = 3;
                      break L5;
                    }
                  }
                  return;
                }
                throw wg.<RuntimeException>$cfr$sneakyThrow(new Exception("HG1: " + this.field_i.field_j.length + " " + this.field_c));
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var1 = (Exception) (Object) decompiledCaughtException;
              var2_ref = this;
              synchronized (var2_ref) {
                L6: {
                  this.finalize();
                  this.field_d = this.field_d + 1;
                  break L6;
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

    wg(ab param0, java.net.URL param1, int param2) {
        try {
            this.field_a = param0;
            this.field_c = param1;
            this.field_i = new wf(param2);
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) ((Object) runtimeException), "wg.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        field_j = new int[8192];
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
