/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class fa implements Runnable {
    static String field_d;
    private java.net.URL field_b;
    private wo field_l;
    private wo field_a;
    private vh field_o;
    private int field_n;
    static int[] field_k;
    static String field_c;
    static int field_j;
    static String field_g;
    private hd field_h;
    static String field_f;
    static String field_e;
    private wo field_i;
    private DataInputStream field_m;

    protected final void finalize() {
        if (!(this.field_a == null)) {
            if (this.field_a.field_f != null) {
                try {
                    ((DataInputStream) (this.field_a.field_f)).close();
                } catch (Exception exception) {
                }
            }
            this.field_a = null;
        }
        if (null != this.field_i) {
            if (!(null == this.field_i.field_f)) {
                try {
                    ((java.net.Socket) (this.field_i.field_f)).close();
                } catch (Exception exception) {
                }
            }
            this.field_i = null;
        }
        if (!(null == this.field_m)) {
            try {
                this.field_m.close();
            } catch (Exception exception) {
            }
            this.field_m = null;
        }
        this.field_l = null;
    }

    final synchronized boolean b(int param0) {
        IOException var2 = null;
        OutputStream var3 = null;
        java.net.Socket var4 = null;
        CharSequence var5 = null;
        Throwable decompiledCaughtException = null;
        if (this.field_n < 2) {
          L0: {
            if (-1 != (this.field_n ^ -1)) {
              break L0;
            } else {
              L1: {
                if (this.field_a == null) {
                  this.field_a = this.field_h.a(this.field_b, false);
                  break L1;
                } else {
                  break L1;
                }
              }
              if (0 != this.field_a.field_g) {
                if ((this.field_a.field_g ^ -1) == -2) {
                  break L0;
                } else {
                  this.field_n = this.field_n + 1;
                  this.field_a = null;
                  return false;
                }
              } else {
                return false;
              }
            }
          }
          L2: {
            if ((this.field_n ^ -1) != -2) {
              break L2;
            } else {
              L3: {
                if (null == this.field_i) {
                  this.field_i = this.field_h.a(443, (byte) 124, this.field_b.getHost());
                  break L3;
                } else {
                  break L3;
                }
              }
              if (this.field_i.field_g == 0) {
                return false;
              } else {
                if (1 == this.field_i.field_g) {
                  break L2;
                } else {
                  this.field_i = null;
                  this.field_n = this.field_n + 1;
                  return false;
                }
              }
            }
          }
          if (null == this.field_m) {
            try {
              L4: {
                L5: {
                  if (this.field_n == 0) {
                    this.field_m = (DataInputStream) (this.field_a.field_f);
                    break L5;
                  } else {
                    break L5;
                  }
                }
                L6: {
                  if (1 == this.field_n) {
                    var4 = (java.net.Socket) (this.field_i.field_f);
                    var4.setSoTimeout(10000);
                    var3 = var4.getOutputStream();
                    var3.write(17);
                    var5 = (CharSequence) ((Object) ("JAGGRAB " + this.field_b.getFile() + "\n\n"));
                    var3.write(nr.a(var5, false));
                    this.field_m = new DataInputStream(var4.getInputStream());
                    break L6;
                  } else {
                    break L6;
                  }
                }
                this.field_o.field_q = 0;
                break L4;
              }
            } catch (java.io.IOException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2 = (IOException) (Object) decompiledCaughtException;
              this.finalize();
              this.field_n = this.field_n + 1;
              if (this.field_l != null) {
                if (param0 == this.field_l.field_g) {
                  return false;
                } else {
                  if (-2 != (this.field_l.field_g ^ -1)) {
                    this.finalize();
                    this.field_n = this.field_n + 1;
                    return false;
                  } else {
                    return false;
                  }
                }
              } else {
                this.field_l = this.field_h.a(5, 0, (Runnable) (this));
                if (param0 == this.field_l.field_g) {
                  return false;
                } else {
                  if (-2 == (this.field_l.field_g ^ -1)) {
                    return false;
                  } else {
                    this.finalize();
                    this.field_n = this.field_n + 1;
                    return false;
                  }
                }
              }
            }
            L7: {
              if (this.field_l != null) {
                break L7;
              } else {
                this.field_l = this.field_h.a(5, 0, (Runnable) (this));
                break L7;
              }
            }
            if (param0 == this.field_l.field_g) {
              return false;
            } else {
              L8: {
                if (-2 == (this.field_l.field_g ^ -1)) {
                  break L8;
                } else {
                  this.finalize();
                  this.field_n = this.field_n + 1;
                  break L8;
                }
              }
              return false;
            }
          } else {
            L9: {
              if (this.field_l != null) {
                break L9;
              } else {
                this.field_l = this.field_h.a(5, 0, (Runnable) (this));
                break L9;
              }
            }
            if (param0 == this.field_l.field_g) {
              return false;
            } else {
              if (-2 != (this.field_l.field_g ^ -1)) {
                this.finalize();
                this.field_n = this.field_n + 1;
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
            var4 = ArmiesOfGielinor.field_M ? 1 : 0;
            try {
              L0: while (true) {
                L1: {
                  L2: {
                    L3: {
                      if (this.field_o.field_o.length <= this.field_o.field_q) {
                        break L3;
                      } else {
                        var1_int = this.field_m.read(this.field_o.field_o, this.field_o.field_q, -this.field_o.field_q + this.field_o.field_o.length);
                        var6 = var1_int;
                        var5 = 0;
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
                          this.field_o.field_q = this.field_o.field_q + var1_int;
                          if (var4 == 0) {
                            continue L0;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                    if (this.field_o.field_q == this.field_o.field_o.length) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                  var1_ref = this;
                  synchronized (var1_ref) {
                    L5: {
                      this.finalize();
                      this.field_n = 3;
                      break L5;
                    }
                  }
                  return;
                }
                throw fa.<RuntimeException>$cfr$sneakyThrow(new Exception("HG1: " + this.field_o.field_o.length + " " + this.field_b));
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var1 = (Exception) (Object) decompiledCaughtException;
              var2_ref = this;
              synchronized (var2_ref) {
                L6: {
                  this.finalize();
                  this.field_n = this.field_n + 1;
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

    final vh a(int param0) {
        if (param0 != this.field_n) {
            return null;
        }
        return this.field_o;
    }

    public static void a(byte param0) {
        field_f = null;
        field_k = null;
        if (param0 < 48) {
            return;
        }
        field_e = null;
        field_d = null;
        field_c = null;
        field_g = null;
    }

    fa(hd param0, java.net.URL param1, int param2) {
        try {
            this.field_h = param0;
            this.field_b = param1;
            this.field_o = new vh(param2);
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "fa.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        field_d = "Name is available";
        field_k = new int[8192];
        field_j = -1;
        field_g = "Escort all allied leaders to the map exit.";
        field_c = "Hide game chat";
        field_e = "Offer unrated rematch";
        field_f = "(Guard)";
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
