/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class u implements Runnable {
    static String[][] field_e;
    static ew[] field_j;
    private iw field_g;
    private wu field_l;
    private wu field_f;
    private bu field_a;
    private DataInputStream field_d;
    private int field_b;
    static wn field_h;
    private java.net.URL field_k;
    private wu field_i;
    static boolean field_c;

    final iw b(int param0) {
        if (param0 != 0) {
            return (iw) null;
        }
        if (!(this.field_b != 3)) {
            return this.field_g;
        }
        return null;
    }

    final synchronized boolean a(byte param0) {
        String discarded$3 = null;
        String discarded$4 = null;
        String discarded$5 = null;
        IOException var2 = null;
        OutputStream var3 = null;
        java.net.Socket var4 = null;
        CharSequence var5 = null;
        Throwable decompiledCaughtException = null;
        if (-3 >= (this.field_b ^ -1)) {
          return true;
        } else {
          L0: {
            if (-1 != (this.field_b ^ -1)) {
              break L0;
            } else {
              L1: {
                if (this.field_l == null) {
                  this.field_l = this.field_a.a(this.field_k, (byte) -122);
                  break L1;
                } else {
                  break L1;
                }
              }
              if (this.field_l.field_a != 0) {
                if ((this.field_l.field_a ^ -1) == -2) {
                  break L0;
                } else {
                  this.field_l = null;
                  this.field_b = this.field_b + 1;
                  return false;
                }
              } else {
                return false;
              }
            }
          }
          L2: {
            if (1 == this.field_b) {
              L3: {
                if (this.field_f != null) {
                  break L3;
                } else {
                  this.field_f = this.field_a.a(true, this.field_k.getHost(), 443);
                  break L3;
                }
              }
              if (-1 == (this.field_f.field_a ^ -1)) {
                return false;
              } else {
                if (this.field_f.field_a == 1) {
                  break L2;
                } else {
                  this.field_b = this.field_b + 1;
                  this.field_f = null;
                  return false;
                }
              }
            } else {
              break L2;
            }
          }
          if (null == this.field_d) {
            try {
              L4: {
                L5: {
                  if (this.field_b != 0) {
                    break L5;
                  } else {
                    this.field_d = (DataInputStream) (this.field_l.field_b);
                    break L5;
                  }
                }
                L6: {
                  if (1 == this.field_b) {
                    var4 = (java.net.Socket) (this.field_f.field_b);
                    var4.setSoTimeout(10000);
                    var3 = var4.getOutputStream();
                    var3.write(17);
                    var5 = (CharSequence) ((Object) ("JAGGRAB " + this.field_k.getFile() + "\n\n"));
                    var3.write(ok.a(var5, (byte) 106));
                    this.field_d = new DataInputStream(var4.getInputStream());
                    break L6;
                  } else {
                    break L6;
                  }
                }
                this.field_g.field_n = 0;
                break L4;
              }
            } catch (java.io.IOException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2 = (IOException) (Object) decompiledCaughtException;
              this.finalize();
              this.field_b = this.field_b + 1;
              if (param0 > 45) {
                L7: {
                  if (null == this.field_i) {
                    this.field_i = this.field_a.a(5, (byte) 125, (Runnable) (this));
                    break L7;
                  } else {
                    break L7;
                  }
                }
                if (-1 == (this.field_i.field_a ^ -1)) {
                  return false;
                } else {
                  L8: {
                    if (-2 != (this.field_i.field_a ^ -1)) {
                      this.finalize();
                      this.field_b = this.field_b + 1;
                      break L8;
                    } else {
                      break L8;
                    }
                  }
                  return false;
                }
              } else {
                L9: {
                  discarded$3 = u.a(false);
                  if (null == this.field_i) {
                    this.field_i = this.field_a.a(5, (byte) 125, (Runnable) (this));
                    break L9;
                  } else {
                    break L9;
                  }
                }
                if (-1 == (this.field_i.field_a ^ -1)) {
                  return false;
                } else {
                  L10: {
                    if (-2 != (this.field_i.field_a ^ -1)) {
                      this.finalize();
                      this.field_b = this.field_b + 1;
                      break L10;
                    } else {
                      break L10;
                    }
                  }
                  return false;
                }
              }
            }
            L11: {
              if (param0 > 45) {
                break L11;
              } else {
                discarded$4 = u.a(false);
                break L11;
              }
            }
            L12: {
              if (null == this.field_i) {
                this.field_i = this.field_a.a(5, (byte) 125, (Runnable) (this));
                break L12;
              } else {
                break L12;
              }
            }
            if (-1 == (this.field_i.field_a ^ -1)) {
              return false;
            } else {
              L13: {
                if (-2 != (this.field_i.field_a ^ -1)) {
                  this.finalize();
                  this.field_b = this.field_b + 1;
                  break L13;
                } else {
                  break L13;
                }
              }
              return false;
            }
          } else {
            L14: {
              if (param0 > 45) {
                break L14;
              } else {
                discarded$5 = u.a(false);
                break L14;
              }
            }
            L15: {
              if (null == this.field_i) {
                this.field_i = this.field_a.a(5, (byte) 125, (Runnable) (this));
                break L15;
              } else {
                break L15;
              }
            }
            if (-1 != (this.field_i.field_a ^ -1)) {
              if (-2 == (this.field_i.field_a ^ -1)) {
                return false;
              } else {
                this.finalize();
                this.field_b = this.field_b + 1;
                return false;
              }
            } else {
              return false;
            }
          }
        }
    }

    final static String a(boolean param0) {
        if (param0) {
          if (!nc.field_a) {
            if (us.field_e <= k.field_i) {
              if (k.field_i >= rd.field_i + us.field_e) {
                return null;
              } else {
                return mh.field_o;
              }
            } else {
              return null;
            }
          } else {
            return null;
          }
        } else {
          u.a(28);
          if (!nc.field_a) {
            if (us.field_e <= k.field_i) {
              if (k.field_i >= rd.field_i + us.field_e) {
                return null;
              } else {
                return mh.field_o;
              }
            } else {
              return null;
            }
          } else {
            return null;
          }
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
            var4 = Kickabout.field_G;
            try {
              L0: while (true) {
                L1: {
                  if (this.field_g.field_f.length <= this.field_g.field_n) {
                    break L1;
                  } else {
                    var1_int = this.field_d.read(this.field_g.field_f, this.field_g.field_n, -this.field_g.field_n + this.field_g.field_f.length);
                    if (0 > var1_int) {
                      break L1;
                    } else {
                      this.field_g.field_n = this.field_g.field_n + var1_int;
                      continue L0;
                    }
                  }
                }
                if (this.field_g.field_n == this.field_g.field_f.length) {
                  throw u.<RuntimeException>$cfr$sneakyThrow(new Exception("HG1: " + this.field_g.field_f.length + " " + this.field_k));
                } else {
                  var1 = this;
                  synchronized (var1) {
                    L2: {
                      this.finalize();
                      this.field_b = 3;
                      break L2;
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
                L3: {
                  this.finalize();
                  this.field_b = this.field_b + 1;
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

    public static void a(int param0) {
        field_h = null;
        field_j = null;
        if (param0 != -2) {
          field_e = (String[][]) null;
          field_e = (String[][]) null;
          return;
        } else {
          field_e = (String[][]) null;
          return;
        }
    }

    u(bu param0, java.net.URL param1, int param2) {
        try {
            this.field_a = param0;
            this.field_k = param1;
            this.field_g = new iw(param2);
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) ((Object) runtimeException), "u.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    protected final void finalize() {
        if (null != this.field_l) {
            if (null != this.field_l.field_b) {
                try {
                    ((DataInputStream) (this.field_l.field_b)).close();
                } catch (Exception exception) {
                }
            }
            this.field_l = null;
        }
        if (null != this.field_f) {
            if (null != this.field_f.field_b) {
                try {
                    ((java.net.Socket) (this.field_f.field_b)).close();
                } catch (Exception exception) {
                }
            }
            this.field_f = null;
        }
        if (this.field_d != null) {
            try {
                this.field_d.close();
            } catch (Exception exception) {
            }
            this.field_d = null;
        }
        this.field_i = null;
    }

    static {
        field_e = new String[][]{new String[]{"Left-click to tackle<nbsp>in the direction of the<nbsp>cursor.", "Right-click to switch character."}, new String[]{"Charge up a low<nbsp>kick with the left mouse button.", "Hold right-click to<nbsp>charge up a high<nbsp>pass."}};
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
