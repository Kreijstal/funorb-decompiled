/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

final class ll implements Runnable {
    private InputStream field_i;
    private int field_g;
    private int field_m;
    static int field_h;
    private OutputStream field_o;
    private ia field_b;
    private byte[] field_c;
    static String field_e;
    private boolean field_l;
    private java.net.Socket field_j;
    private vf field_n;
    static hm field_a;
    private boolean field_f;
    static int field_d;
    private int field_k;

    protected final void finalize() {
        ((ll) this).b(120);
    }

    ll(java.net.Socket param0, vf param1) throws IOException {
        this(param0, param1, 5000);
    }

    final void a(byte param0, byte[] param1, int param2, int param3) throws IOException {
        Object var5 = null;
        int var6 = 0;
        Throwable var7 = null;
        int var8 = 0;
        Throwable decompiledCaughtException = null;
        var8 = MinerDisturbance.field_ab;
        if (!((ll) this).field_l) {
          if (!((ll) this).field_f) {
            if (param0 >= 92) {
              L0: {
                if (null != ((ll) this).field_c) {
                  break L0;
                } else {
                  ((ll) this).field_c = new byte[((ll) this).field_g];
                  break L0;
                }
              }
              var5 = this;
              synchronized (var5) {
                L1: {
                  var6 = 0;
                  L2: while (true) {
                    if (param2 <= var6) {
                      L3: {
                        if (null != ((ll) this).field_b) {
                          break L3;
                        } else {
                          ((ll) this).field_b = ((ll) this).field_n.a((Runnable) this, (byte) 44, 3);
                          break L3;
                        }
                      }
                      this.notifyAll();
                      break L1;
                    } else {
                      ((ll) this).field_c[((ll) this).field_m] = param1[var6 + param3];
                      ((ll) this).field_m = (((ll) this).field_m + 1) % ((ll) this).field_g;
                      if (((ll) this).field_m == (((ll) this).field_k - -((ll) this).field_g + -100) % ((ll) this).field_g) {
                        throw new IOException();
                      } else {
                        var6++;
                        continue L2;
                      }
                    }
                  }
                }
              }
              return;
            } else {
              return;
            }
          } else {
            ((ll) this).field_f = false;
            throw new IOException();
          }
        } else {
          return;
        }
    }

    final void b(int param0) {
        Object var2 = null;
        InterruptedException var2_ref = null;
        Throwable var3 = null;
        int var4 = 0;
        Throwable decompiledCaughtException = null;
        var4 = MinerDisturbance.field_ab;
        if (!((ll) this).field_l) {
          var2 = this;
          synchronized (var2) {
            L0: {
              L1: {
                ((ll) this).field_l = true;
                if (param0 >= 84) {
                  break L1;
                } else {
                  int discarded$2 = ll.a((byte) 104, -28);
                  break L1;
                }
              }
              this.notifyAll();
              break L0;
            }
          }
          if (((ll) this).field_b != null) {
            L2: while (true) {
              if (((ll) this).field_b.field_c != 0) {
                if (((ll) this).field_b.field_c == 1) {
                  try {
                    L3: {
                      ((Thread) ((ll) this).field_b.field_a).join();
                      break L3;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    var2_ref = (InterruptedException) (Object) decompiledCaughtException;
                    ((ll) this).field_b = null;
                    return;
                  }
                  ((ll) this).field_b = null;
                  return;
                } else {
                  ((ll) this).field_b = null;
                  return;
                }
              } else {
                gf.a(1L, -10309);
                continue L2;
              }
            }
          } else {
            ((ll) this).field_b = null;
            return;
          }
        } else {
          return;
        }
    }

    public final void run() {
        try {
            IOException var1 = null;
            Exception var1_ref = null;
            int var1_int = 0;
            int var2 = 0;
            IOException var3 = null;
            Object var3_ref = null;
            int var6 = 0;
            Object var7 = null;
            Throwable decompiledCaughtException = null;
            var6 = MinerDisturbance.field_ab;
            try {
              L0: {
                L1: while (true) {
                  L2: {
                    var3_ref = this;
                    if (((ll) this).field_m == ((ll) this).field_k) {
                      if (((ll) this).field_l) {
                        try {
                          L3: {
                            L4: {
                              if (null != ((ll) this).field_i) {
                                ((ll) this).field_i.close();
                                break L4;
                              } else {
                                break L4;
                              }
                            }
                            L5: {
                              if (null == ((ll) this).field_o) {
                                break L5;
                              } else {
                                ((ll) this).field_o.close();
                                break L5;
                              }
                            }
                            L6: {
                              if (((ll) this).field_j == null) {
                                break L6;
                              } else {
                                ((ll) this).field_j.close();
                                break L6;
                              }
                            }
                            break L3;
                          }
                        } catch (java.io.IOException decompiledCaughtParameter0) {
                          decompiledCaughtException = decompiledCaughtParameter0;
                          L7: {
                            var1 = (IOException) (Object) decompiledCaughtException;
                            break L7;
                          }
                        }
                        ((ll) this).field_c = null;
                        break L0;
                      } else {
                        this.wait();
                        break L2;
                      }
                    } else {
                      break L2;
                    }
                  }
                  L8: {
                    if (((ll) this).field_m < ((ll) this).field_k) {
                      var1_int = -((ll) this).field_k + ((ll) this).field_g;
                      break L8;
                    } else {
                      var1_int = ((ll) this).field_m + -((ll) this).field_k;
                      break L8;
                    }
                  }
                  var2 = ((ll) this).field_k;
                  if (-1 > (var1_int ^ -1)) {
                    try {
                      L9: {
                        ((ll) this).field_o.write(((ll) this).field_c, var2, var1_int);
                        break L9;
                      }
                    } catch (java.lang.Exception decompiledCaughtParameter1) {
                      decompiledCaughtException = decompiledCaughtParameter1;
                      L10: {
                        var3 = (IOException) (Object) decompiledCaughtException;
                        ((ll) this).field_f = true;
                        break L10;
                      }
                    }
                    ((ll) this).field_k = (((ll) this).field_k - -var1_int) % ((ll) this).field_g;
                    try {
                      L11: {
                        L12: {
                          if (((ll) this).field_m != ((ll) this).field_k) {
                            break L12;
                          } else {
                            ((ll) this).field_o.flush();
                            break L12;
                          }
                        }
                        break L11;
                      }
                    } catch (java.lang.Exception decompiledCaughtParameter2) {
                      decompiledCaughtException = decompiledCaughtParameter2;
                      L13: {
                        var3 = (IOException) (Object) decompiledCaughtException;
                        ((ll) this).field_f = true;
                        break L13;
                      }
                    }
                    continue L1;
                  } else {
                    continue L1;
                  }
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter3) {
              decompiledCaughtException = decompiledCaughtParameter3;
              L14: {
                var1_ref = (Exception) (Object) decompiledCaughtException;
                var7 = null;
                di.a((Throwable) (Object) var1_ref, 1, (String) null);
                break L14;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static int a(byte param0, int param1) {
        if (param0 != -73) {
            int discarded$0 = ll.a((byte) -58, -86);
            return ke.a(param1, -21937, sb.field_t);
        }
        return ke.a(param1, -21937, sb.field_t);
    }

    final static void a(int param0) {
        Object var1 = null;
        Throwable var2 = null;
        Throwable decompiledCaughtException = null;
        L0: {
          if (param0 <= -46) {
            break L0;
          } else {
            field_a = null;
            break L0;
          }
        }
        if (null != lb.field_y) {
          var1 = (Object) (Object) lb.field_y;
          synchronized (var1) {
            L1: {
              lb.field_y = null;
              break L1;
            }
          }
          return;
        } else {
          return;
        }
    }

    final int c(int param0) throws IOException {
        if (!(!((ll) this).field_l)) {
            return 0;
        }
        if (param0 != 0) {
            return -37;
        }
        return ((ll) this).field_i.available();
    }

    public static void b(byte param0) {
        field_e = null;
        field_a = null;
        if (param0 == -121) {
            return;
        }
        ll.a(-77);
    }

    final void a(boolean param0, byte[] param1, int param2, int param3) throws IOException {
        int var5 = 0;
        int var6 = 0;
        var6 = MinerDisturbance.field_ab;
        if (!((ll) this).field_l) {
          L0: while (true) {
            if (-1 <= (param3 ^ -1)) {
              if (!param0) {
                return;
              } else {
                field_a = null;
                return;
              }
            } else {
              var5 = ((ll) this).field_i.read(param1, param2, param3);
              if (var5 > 0) {
                param2 = param2 + var5;
                param3 = param3 - var5;
                continue L0;
              } else {
                throw new EOFException();
              }
            }
          }
        } else {
          return;
        }
    }

    final int a(boolean param0) throws IOException {
        if (!param0) {
          if (((ll) this).field_l) {
            return 0;
          } else {
            return ((ll) this).field_i.read();
          }
        } else {
          ((ll) this).field_k = -72;
          if (((ll) this).field_l) {
            return 0;
          } else {
            return ((ll) this).field_i.read();
          }
        }
    }

    final void a(byte param0) throws IOException {
        int var2 = 0;
        if (!((ll) this).field_l) {
          var2 = -54 / ((param0 - 65) / 38);
          if (((ll) this).field_f) {
            ((ll) this).field_f = false;
            throw new IOException();
          } else {
            return;
          }
        } else {
          return;
        }
    }

    private ll(java.net.Socket param0, vf param1, int param2) throws IOException {
        ((ll) this).field_l = false;
        ((ll) this).field_f = false;
        ((ll) this).field_m = 0;
        ((ll) this).field_k = 0;
        ((ll) this).field_j = param0;
        ((ll) this).field_n = param1;
        ((ll) this).field_j.setSoTimeout(30000);
        ((ll) this).field_j.setTcpNoDelay(true);
        ((ll) this).field_i = ((ll) this).field_j.getInputStream();
        ((ll) this).field_o = ((ll) this).field_j.getOutputStream();
        ((ll) this).field_g = param2;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = 0;
        field_e = "Loading...";
    }
}
