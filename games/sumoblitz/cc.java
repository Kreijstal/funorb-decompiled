/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class cc implements Runnable {
    private jr field_c;
    private DataInputStream field_h;
    private java.net.URL field_a;
    private fs field_d;
    private int field_g;
    private jr field_f;
    private jr field_e;
    static int field_j;
    private wi field_b;
    static ck field_i;

    protected final void finalize() {
        if (this.field_e != null) {
            if (!(null == this.field_e.field_d)) {
                try {
                    ((DataInputStream) (this.field_e.field_d)).close();
                } catch (Exception exception) {
                }
            }
            this.field_e = null;
        }
        if (this.field_f != null) {
            if (null != this.field_f.field_d) {
                try {
                    ((java.net.Socket) (this.field_f.field_d)).close();
                } catch (Exception exception) {
                }
            }
            this.field_f = null;
        }
        if (!(null == this.field_h)) {
            try {
                this.field_h.close();
            } catch (Exception exception) {
            }
            this.field_h = null;
        }
        this.field_c = null;
    }

    final synchronized boolean a(byte param0) {
        int var2 = 0;
        IOException var3 = null;
        OutputStream var4 = null;
        java.net.Socket var5 = null;
        CharSequence var6 = null;
        Throwable decompiledCaughtException = null;
        if (this.field_g < 2) {
          L0: {
            var2 = 4 / ((param0 - -41) / 43);
            if (this.field_g == 0) {
              L1: {
                if (this.field_e == null) {
                  this.field_e = this.field_b.a((byte) 107, this.field_a);
                  break L1;
                } else {
                  break L1;
                }
              }
              if (0 != this.field_e.field_c) {
                if (1 == this.field_e.field_c) {
                  break L0;
                } else {
                  this.field_e = null;
                  this.field_g = this.field_g + 1;
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
            if (-2 != (this.field_g ^ -1)) {
              break L2;
            } else {
              L3: {
                if (this.field_f == null) {
                  this.field_f = this.field_b.a((byte) 51, this.field_a.getHost(), 443);
                  break L3;
                } else {
                  break L3;
                }
              }
              if (-1 != (this.field_f.field_c ^ -1)) {
                if (-2 != (this.field_f.field_c ^ -1)) {
                  this.field_f = null;
                  this.field_g = this.field_g + 1;
                  return false;
                } else {
                  break L2;
                }
              } else {
                return false;
              }
            }
          }
          if (this.field_h == null) {
            try {
              L4: {
                L5: {
                  if (0 == this.field_g) {
                    this.field_h = (DataInputStream) (this.field_e.field_d);
                    break L5;
                  } else {
                    break L5;
                  }
                }
                L6: {
                  if (this.field_g == 1) {
                    var5 = (java.net.Socket) (this.field_f.field_d);
                    var5.setSoTimeout(10000);
                    var4 = var5.getOutputStream();
                    var4.write(17);
                    var6 = (CharSequence) ((Object) ("JAGGRAB " + this.field_a.getFile() + "\n\n"));
                    var4.write(mb.a(var6, (byte) 32));
                    this.field_h = new DataInputStream(var5.getInputStream());
                    break L6;
                  } else {
                    break L6;
                  }
                }
                this.field_d.field_p = 0;
                break L4;
              }
            } catch (java.io.IOException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L7: {
                var3 = (IOException) (Object) decompiledCaughtException;
                this.finalize();
                this.field_g = this.field_g + 1;
                if (null == this.field_c) {
                  this.field_c = this.field_b.a(true, (Runnable) (this), 5);
                  break L7;
                } else {
                  break L7;
                }
              }
              if (0 != this.field_c.field_c) {
                if (this.field_c.field_c != 1) {
                  this.finalize();
                  this.field_g = this.field_g + 1;
                  return false;
                } else {
                  return false;
                }
              } else {
                return false;
              }
            }
            L8: {
              if (null == this.field_c) {
                this.field_c = this.field_b.a(true, (Runnable) (this), 5);
                break L8;
              } else {
                break L8;
              }
            }
            if (0 == this.field_c.field_c) {
              return false;
            } else {
              L9: {
                if (this.field_c.field_c == 1) {
                  break L9;
                } else {
                  this.finalize();
                  this.field_g = this.field_g + 1;
                  break L9;
                }
              }
              return false;
            }
          } else {
            L10: {
              if (null == this.field_c) {
                this.field_c = this.field_b.a(true, (Runnable) (this), 5);
                break L10;
              } else {
                break L10;
              }
            }
            if (0 != this.field_c.field_c) {
              if (this.field_c.field_c != 1) {
                this.finalize();
                this.field_g = this.field_g + 1;
                return false;
              } else {
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

    public final void run() {
        try {
            int var1_int = 0;
            Object var1 = null;
            Object var2 = null;
            Throwable var3 = null;
            int var4 = 0;
            int stackIn_3_0 = 0;
            int stackIn_7_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_2_0 = 0;
            int stackOut_6_0 = 0;
            var4 = Sumoblitz.field_L ? 1 : 0;
            try {
              L0: while (true) {
                L1: {
                  L2: {
                    if (this.field_d.field_p >= this.field_d.field_n.length) {
                      break L2;
                    } else {
                      var1_int = this.field_h.read(this.field_d.field_n, this.field_d.field_p, -this.field_d.field_p + this.field_d.field_n.length);
                      stackOut_2_0 = var1_int;
                      stackIn_7_0 = stackOut_2_0;
                      stackIn_3_0 = stackOut_2_0;
                      if (var4 != 0) {
                        break L1;
                      } else {
                        if (stackIn_3_0 < 0) {
                          break L2;
                        } else {
                          this.field_d.field_p = this.field_d.field_p + var1_int;
                          if (var4 == 0) {
                            continue L0;
                          } else {
                            break L2;
                          }
                        }
                      }
                    }
                  }
                  stackOut_6_0 = this.field_d.field_n.length;
                  stackIn_7_0 = stackOut_6_0;
                  break L1;
                }
                if (stackIn_7_0 == this.field_d.field_p) {
                  throw cc.<RuntimeException>$cfr$sneakyThrow(new Exception("HG1: " + this.field_d.field_n.length + " " + this.field_a));
                } else {
                  var1 = this;
                  synchronized (var1) {
                    L3: {
                      this.finalize();
                      this.field_g = 3;
                      break L3;
                    }
                  }
                  return;
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var1 = (Exception) (Object) decompiledCaughtException;
              var2 = this;
              synchronized (var2) {
                L4: {
                  this.finalize();
                  this.field_g = this.field_g + 1;
                  break L4;
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

    final fs b(byte param0) {
        if (3 == this.field_g) {
          return this.field_d;
        } else {
          if (param0 == 126) {
            return null;
          } else {
            this.field_a = (java.net.URL) null;
            return null;
          }
        }
    }

    cc(wi param0, java.net.URL param1, int param2) {
        try {
            this.field_b = param0;
            this.field_a = param1;
            this.field_d = new fs(param2);
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) ((Object) runtimeException), "cc.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    public static void a(int param0) {
        if (param0 < 121) {
            cc.a(82);
            field_i = null;
            return;
        }
        field_i = null;
    }

    static {
        field_i = new ck();
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
