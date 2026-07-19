/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class fk implements Runnable {
    private wj field_g;
    static String field_f;
    private DataInputStream field_r;
    static gh field_q;
    private gi field_b;
    private wj field_s;
    static String field_p;
    static nb field_i;
    private int field_j;
    static fh field_d;
    static String field_n;
    private java.net.URL field_k;
    private pn field_m;
    private wj field_o;
    static boolean field_h;
    static boolean field_c;
    static String field_l;
    static String field_a;
    static int field_e;

    public final void run() {
        try {
            int var1_int = 0;
            Object var1 = null;
            Object var2 = null;
            Throwable var3 = null;
            int var4 = 0;
            Throwable decompiledCaughtException = null;
            var4 = SteelSentinels.field_G;
            try {
              L0: while (true) {
                L1: {
                  if (this.field_b.field_t.length <= this.field_b.field_p) {
                    break L1;
                  } else {
                    var1_int = this.field_r.read(this.field_b.field_t, this.field_b.field_p, -this.field_b.field_p + this.field_b.field_t.length);
                    if (0 > var1_int) {
                      break L1;
                    } else {
                      this.field_b.field_p = this.field_b.field_p + var1_int;
                      continue L0;
                    }
                  }
                }
                if (this.field_b.field_p == this.field_b.field_t.length) {
                  throw fk.<RuntimeException>$cfr$sneakyThrow(new Exception("HG1: " + this.field_b.field_t.length + " " + this.field_k));
                } else {
                  var1 = this;
                  synchronized (var1) {
                    L2: {
                      this.finalize();
                      this.field_j = 3;
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
                  this.field_j = this.field_j + 1;
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

    final gi b(int param0) {
        if (!(this.field_j != param0)) {
            return this.field_b;
        }
        return null;
    }

    final static boolean a(int param0) {
        boolean discarded$9 = false;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != 0) {
          L0: {
            discarded$9 = fk.a(-111);
            if (null == kc.field_y) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (null == kc.field_y) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    public static void a(byte param0) {
        field_p = null;
        field_a = null;
        if (param0 != -64) {
          return;
        } else {
          field_q = null;
          field_d = null;
          field_i = null;
          field_f = null;
          field_l = null;
          field_n = null;
          return;
        }
    }

    fk(pn param0, java.net.URL param1, int param2) {
        try {
            this.field_m = param0;
            this.field_k = param1;
            this.field_b = new gi(param2);
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) ((Object) runtimeException), "fk.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static gh b(byte param0) {
        if (param0 < 13) {
            return (gh) null;
        }
        return mj.field_Sb.field_Ub;
    }

    final synchronized boolean c(int param0) {
        IOException var2 = null;
        OutputStream var3 = null;
        java.net.Socket var4 = null;
        CharSequence var5 = null;
        Throwable decompiledCaughtException = null;
        if (this.field_j >= 2) {
          return true;
        } else {
          L0: {
            if (0 == this.field_j) {
              L1: {
                if (null == this.field_o) {
                  this.field_o = this.field_m.a(this.field_k, 112);
                  break L1;
                } else {
                  break L1;
                }
              }
              if (0 != this.field_o.field_a) {
                if (1 != this.field_o.field_a) {
                  this.field_o = null;
                  this.field_j = this.field_j + 1;
                  return false;
                } else {
                  break L0;
                }
              } else {
                return false;
              }
            } else {
              break L0;
            }
          }
          L2: {
            if (1 != this.field_j) {
              break L2;
            } else {
              L3: {
                if (null != this.field_g) {
                  break L3;
                } else {
                  this.field_g = this.field_m.a(this.field_k.getHost(), 443, param0 + 376255346);
                  break L3;
                }
              }
              if (this.field_g.field_a != 0) {
                if (-2 == (this.field_g.field_a ^ -1)) {
                  break L2;
                } else {
                  this.field_g = null;
                  this.field_j = this.field_j + 1;
                  return false;
                }
              } else {
                return false;
              }
            }
          }
          if (this.field_r == null) {
            try {
              L4: {
                L5: {
                  if (0 != this.field_j) {
                    break L5;
                  } else {
                    this.field_r = (DataInputStream) (this.field_o.field_c);
                    break L5;
                  }
                }
                L6: {
                  if (-2 != (this.field_j ^ -1)) {
                    break L6;
                  } else {
                    var4 = (java.net.Socket) (this.field_g.field_c);
                    var4.setSoTimeout(10000);
                    var3 = var4.getOutputStream();
                    var3.write(17);
                    var5 = (CharSequence) ((Object) ("JAGGRAB " + this.field_k.getFile() + "\n\n"));
                    var3.write(km.a(param0 + -88, var5));
                    this.field_r = new DataInputStream(var4.getInputStream());
                    break L6;
                  }
                }
                this.field_b.field_p = 0;
                break L4;
              }
            } catch (java.io.IOException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L7: {
                var2 = (IOException) (Object) decompiledCaughtException;
                this.finalize();
                this.field_j = this.field_j + 1;
                if (null == this.field_s) {
                  this.field_s = this.field_m.a(param0 ^ -4, 5, (Runnable) (this));
                  break L7;
                } else {
                  break L7;
                }
              }
              if (0 == this.field_s.field_a) {
                return false;
              } else {
                if (param0 != (this.field_s.field_a ^ -1)) {
                  this.finalize();
                  this.field_j = this.field_j + 1;
                  return false;
                } else {
                  return false;
                }
              }
            }
            L8: {
              if (null == this.field_s) {
                this.field_s = this.field_m.a(param0 ^ -4, 5, (Runnable) (this));
                break L8;
              } else {
                break L8;
              }
            }
            if (0 == this.field_s.field_a) {
              return false;
            } else {
              L9: {
                if (param0 == (this.field_s.field_a ^ -1)) {
                  break L9;
                } else {
                  this.finalize();
                  this.field_j = this.field_j + 1;
                  break L9;
                }
              }
              return false;
            }
          } else {
            L10: {
              if (null == this.field_s) {
                this.field_s = this.field_m.a(param0 ^ -4, 5, (Runnable) (this));
                break L10;
              } else {
                break L10;
              }
            }
            if (0 == this.field_s.field_a) {
              return false;
            } else {
              if (param0 != (this.field_s.field_a ^ -1)) {
                this.finalize();
                this.field_j = this.field_j + 1;
                return false;
              } else {
                return false;
              }
            }
          }
        }
    }

    protected final void finalize() {
        if (null != this.field_o) {
            if (null != this.field_o.field_c) {
                try {
                    ((DataInputStream) (this.field_o.field_c)).close();
                } catch (Exception exception) {
                }
            }
            this.field_o = null;
        }
        if (null != this.field_g) {
            if (this.field_g.field_c != null) {
                try {
                    ((java.net.Socket) (this.field_g.field_c)).close();
                } catch (Exception exception) {
                }
            }
            this.field_g = null;
        }
        if (!(this.field_r == null)) {
            try {
                this.field_r.close();
            } catch (Exception exception) {
            }
            this.field_r = null;
        }
        this.field_s = null;
    }

    static {
        field_f = "Campaigns";
        field_n = "Remove <%0> from ignore list";
        field_p = "<%0> has left the lobby.";
        field_c = false;
        field_l = "MELEE";
        field_e = 0;
        field_a = "This is <%0>'s RuneScape clan if they have one.";
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
