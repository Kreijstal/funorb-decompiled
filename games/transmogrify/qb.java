/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class qb implements Runnable {
    private ib field_d;
    static long field_k;
    private oa field_h;
    private DataInputStream field_g;
    private ib field_e;
    private ib field_j;
    private int field_c;
    static String[] field_f;
    static String field_a;
    private fe field_i;
    private java.net.URL field_b;

    protected final void finalize() {
        if (!(this.field_j == null)) {
            if (!(null == this.field_j.field_g)) {
                try {
                    ((DataInputStream) (this.field_j.field_g)).close();
                } catch (Exception exception) {
                }
            }
            this.field_j = null;
        }
        if (!(this.field_d == null)) {
            if (this.field_d.field_g != null) {
                try {
                    ((java.net.Socket) (this.field_d.field_g)).close();
                } catch (Exception exception) {
                }
            }
            this.field_d = null;
        }
        if (this.field_g != null) {
            try {
                this.field_g.close();
            } catch (Exception exception) {
            }
            this.field_g = null;
        }
        this.field_e = null;
    }

    public static void a(byte param0) {
        field_f = null;
        field_a = null;
        if (param0 != -62) {
            field_k = -124L;
        }
    }

    final synchronized boolean a(int param0) {
        IOException var2 = null;
        OutputStream var3 = null;
        java.net.Socket var4 = null;
        CharSequence var5 = null;
        Throwable decompiledCaughtException = null;
        if ((this.field_c ^ -1) <= -3) {
          return true;
        } else {
          L0: {
            if (this.field_c == param0) {
              L1: {
                if (null != this.field_j) {
                  break L1;
                } else {
                  this.field_j = this.field_i.a(-21377, this.field_b);
                  break L1;
                }
              }
              if (this.field_j.field_c != 0) {
                if (-2 == (this.field_j.field_c ^ -1)) {
                  break L0;
                } else {
                  this.field_j = null;
                  this.field_c = this.field_c + 1;
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
            if (-2 != (this.field_c ^ -1)) {
              break L2;
            } else {
              L3: {
                if (null != this.field_d) {
                  break L3;
                } else {
                  this.field_d = this.field_i.a(88, this.field_b.getHost(), 443);
                  break L3;
                }
              }
              if (this.field_d.field_c == 0) {
                return false;
              } else {
                if (this.field_d.field_c != 1) {
                  this.field_d = null;
                  this.field_c = this.field_c + 1;
                  return false;
                } else {
                  break L2;
                }
              }
            }
          }
          if (this.field_g == null) {
            try {
              L4: {
                L5: {
                  if (-1 == (this.field_c ^ -1)) {
                    this.field_g = (DataInputStream) (this.field_j.field_g);
                    break L5;
                  } else {
                    break L5;
                  }
                }
                L6: {
                  if (this.field_c != 1) {
                    break L6;
                  } else {
                    var4 = (java.net.Socket) (this.field_d.field_g);
                    var4.setSoTimeout(10000);
                    var3 = var4.getOutputStream();
                    var3.write(17);
                    var5 = (CharSequence) ((Object) ("JAGGRAB " + this.field_b.getFile() + "\n\n"));
                    var3.write(uk.a(14122, var5));
                    this.field_g = new DataInputStream(var4.getInputStream());
                    break L6;
                  }
                }
                this.field_h.field_h = 0;
                break L4;
              }
            } catch (java.io.IOException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2 = (IOException) (Object) decompiledCaughtException;
              this.finalize();
              this.field_c = this.field_c + 1;
              if (null != this.field_e) {
                if (0 == this.field_e.field_c) {
                  return false;
                } else {
                  if ((this.field_e.field_c ^ -1) != -2) {
                    this.finalize();
                    this.field_c = this.field_c + 1;
                    return false;
                  } else {
                    return false;
                  }
                }
              } else {
                this.field_e = this.field_i.a((Runnable) (this), 5, 65535);
                if (0 == this.field_e.field_c) {
                  return false;
                } else {
                  if ((this.field_e.field_c ^ -1) == -2) {
                    return false;
                  } else {
                    this.finalize();
                    this.field_c = this.field_c + 1;
                    return false;
                  }
                }
              }
            }
            L7: {
              if (null != this.field_e) {
                break L7;
              } else {
                this.field_e = this.field_i.a((Runnable) (this), 5, 65535);
                break L7;
              }
            }
            if (0 == this.field_e.field_c) {
              return false;
            } else {
              L8: {
                if ((this.field_e.field_c ^ -1) == -2) {
                  break L8;
                } else {
                  this.finalize();
                  this.field_c = this.field_c + 1;
                  break L8;
                }
              }
              return false;
            }
          } else {
            L9: {
              if (null != this.field_e) {
                break L9;
              } else {
                this.field_e = this.field_i.a((Runnable) (this), 5, 65535);
                break L9;
              }
            }
            if (0 == this.field_e.field_c) {
              return false;
            } else {
              if ((this.field_e.field_c ^ -1) != -2) {
                this.finalize();
                this.field_c = this.field_c + 1;
                return false;
              } else {
                return false;
              }
            }
          }
        }
    }

    final oa b(int param0) {
        int var2 = 68 / ((param0 - 56) / 56);
        if (!(-4 != (this.field_c ^ -1))) {
            return this.field_h;
        }
        return null;
    }

    public final void run() {
        try {
            int var1_int = 0;
            Object var1 = null;
            Object var2 = null;
            Throwable var3 = null;
            int var4 = 0;
            int stackIn_3_0 = 0;
            int stackIn_9_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_2_0 = 0;
            int stackOut_8_0 = 0;
            var4 = Transmogrify.field_A ? 1 : 0;
            try {
              L0: while (true) {
                L1: {
                  L2: {
                    if (this.field_h.field_h >= this.field_h.field_g.length) {
                      break L2;
                    } else {
                      var1_int = this.field_g.read(this.field_h.field_g, this.field_h.field_h, this.field_h.field_g.length - this.field_h.field_h);
                      stackOut_2_0 = var1_int;
                      stackIn_9_0 = stackOut_2_0;
                      stackIn_3_0 = stackOut_2_0;
                      if (var4 != 0) {
                        break L1;
                      } else {
                        L3: {
                          if (stackIn_3_0 >= 0) {
                            break L3;
                          } else {
                            if (var4 == 0) {
                              break L2;
                            } else {
                              break L3;
                            }
                          }
                        }
                        this.field_h.field_h = this.field_h.field_h + var1_int;
                        if (var4 == 0) {
                          continue L0;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                  stackOut_8_0 = this.field_h.field_g.length;
                  stackIn_9_0 = stackOut_8_0;
                  break L1;
                }
                if (stackIn_9_0 == this.field_h.field_h) {
                  throw qb.<RuntimeException>$cfr$sneakyThrow(new Exception("HG1: " + this.field_h.field_g.length + " " + this.field_b));
                } else {
                  var1 = this;
                  synchronized (var1) {
                    L4: {
                      this.finalize();
                      this.field_c = 3;
                      break L4;
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
                L5: {
                  this.finalize();
                  this.field_c = this.field_c + 1;
                  break L5;
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

    qb(fe param0, java.net.URL param1, int param2) {
        try {
            this.field_b = param1;
            this.field_i = param0;
            this.field_h = new oa(param2);
        } catch (RuntimeException runtimeException) {
            throw ch.a((Throwable) ((Object) runtimeException), "qb.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static void a(int param0, int param1, oa param2, int param3, int param4) {
        RuntimeException runtimeException = null;
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
            L1: {
              param2.f(6389, 12);
              param2.c(17, -159688920);
              param2.c(param4, -159688920);
              param2.c(param1, -159688920);
              param2.f(6389, param3);
              if (param0 >= 112) {
                break L1;
              } else {
                field_k = -61L;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) (runtimeException);
            stackOut_3_1 = new StringBuilder().append("qb.C(").append(param0).append(',').append(param1).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param2 == null) {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    static {
        field_a = "Reload game";
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
