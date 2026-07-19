/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class we implements Runnable {
    private mi field_k;
    static bf[] field_i;
    static ka[] field_m;
    private mi field_g;
    private mi field_n;
    static ge[] field_o;
    static int field_f;
    static ka[][] field_e;
    private uj field_b;
    private java.net.URL field_h;
    static String[][] field_c;
    private uf field_d;
    private DataInputStream field_a;
    static int[] field_l;
    private int field_p;
    static int field_j;

    protected final void finalize() {
        if (this.field_k != null) {
            if (null != this.field_k.field_g) {
                try {
                    ((DataInputStream) (this.field_k.field_g)).close();
                } catch (Exception exception) {
                }
            }
            this.field_k = null;
        }
        if (null != this.field_g) {
            if (!(null == this.field_g.field_g)) {
                try {
                    ((java.net.Socket) (this.field_g.field_g)).close();
                } catch (Exception exception) {
                }
            }
            this.field_g = null;
        }
        if (!(this.field_a == null)) {
            try {
                this.field_a.close();
            } catch (Exception exception) {
            }
            this.field_a = null;
        }
        this.field_n = null;
    }

    final static e a(nc param0, int param1) {
        boolean discarded$2 = false;
        e var2 = null;
        RuntimeException var2_ref = null;
        e stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        e stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              var2 = new e(param0, param0);
              tj.field_e.a(var2, param1 + -6300);
              if (param1 == 6222) {
                break L1;
              } else {
                discarded$2 = we.b(false);
                break L1;
              }
            }
            mj.field_a.a(param0);
            stackOut_2_0 = (e) (var2);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var2_ref);
            stackOut_4_1 = new StringBuilder().append("we.B(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw oj.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    final synchronized boolean a(boolean param0) {
        IOException var2 = null;
        OutputStream var3 = null;
        java.net.Socket var4 = null;
        CharSequence var5 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        if ((this.field_p ^ -1) > -3) {
          L0: {
            if (0 != this.field_p) {
              break L0;
            } else {
              L1: {
                if (null == this.field_k) {
                  this.field_k = this.field_b.a(this.field_h, -125);
                  break L1;
                } else {
                  break L1;
                }
              }
              if (-1 == (this.field_k.field_d ^ -1)) {
                return false;
              } else {
                if (-2 == (this.field_k.field_d ^ -1)) {
                  break L0;
                } else {
                  this.field_k = null;
                  this.field_p = this.field_p + 1;
                  return false;
                }
              }
            }
          }
          L2: {
            if (this.field_p == 1) {
              L3: {
                if (this.field_g != null) {
                  break L3;
                } else {
                  this.field_g = this.field_b.a(443, this.field_h.getHost(), 431890200);
                  break L3;
                }
              }
              if (0 == this.field_g.field_d) {
                return false;
              } else {
                if (-2 == (this.field_g.field_d ^ -1)) {
                  break L2;
                } else {
                  this.field_p = this.field_p + 1;
                  this.field_g = null;
                  return false;
                }
              }
            } else {
              break L2;
            }
          }
          L4: {
            if (null != this.field_a) {
              break L4;
            } else {
              try {
                L5: {
                  L6: {
                    if (this.field_p == 0) {
                      this.field_a = (DataInputStream) (this.field_k.field_g);
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                  L7: {
                    if (-2 == (this.field_p ^ -1)) {
                      var4 = (java.net.Socket) (this.field_g.field_g);
                      var4.setSoTimeout(10000);
                      var3 = var4.getOutputStream();
                      var3.write(17);
                      var5 = (CharSequence) ((Object) ("JAGGRAB " + this.field_h.getFile() + "\n\n"));
                      var3.write(pi.a(var5, 353));
                      this.field_a = new DataInputStream(var4.getInputStream());
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                  this.field_d.field_q = 0;
                  decompiledRegionSelector0 = 0;
                  break L5;
                }
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L8: {
                  var2 = (IOException) (Object) decompiledCaughtException;
                  this.finalize();
                  this.field_p = this.field_p + 1;
                  decompiledRegionSelector0 = 1;
                  break L8;
                }
              }
              if (decompiledRegionSelector0 == 0) {
                L9: {
                  if (null == this.field_n) {
                    this.field_n = this.field_b.a((Runnable) (this), true, 5);
                    break L9;
                  } else {
                    break L9;
                  }
                }
                if (this.field_n.field_d != 0) {
                  L10: {
                    if (this.field_n.field_d == 1) {
                      break L10;
                    } else {
                      this.finalize();
                      this.field_p = this.field_p + 1;
                      break L10;
                    }
                  }
                  if (!param0) {
                    return true;
                  } else {
                    return false;
                  }
                } else {
                  return false;
                }
              } else {
                break L4;
              }
            }
          }
          L11: {
            if (null == this.field_n) {
              this.field_n = this.field_b.a((Runnable) (this), true, 5);
              break L11;
            } else {
              break L11;
            }
          }
          if (this.field_n.field_d != 0) {
            if (this.field_n.field_d == 1) {
              if (!param0) {
                return true;
              } else {
                return false;
              }
            } else {
              this.finalize();
              this.field_p = this.field_p + 1;
              if (!param0) {
                return true;
              } else {
                return false;
              }
            }
          } else {
            return false;
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
            Throwable decompiledCaughtException = null;
            var4 = TorChallenge.field_F ? 1 : 0;
            try {
              L0: while (true) {
                L1: {
                  if (this.field_d.field_q >= this.field_d.field_m.length) {
                    break L1;
                  } else {
                    var1_int = this.field_a.read(this.field_d.field_m, this.field_d.field_q, -this.field_d.field_q + this.field_d.field_m.length);
                    if (var1_int < 0) {
                      break L1;
                    } else {
                      this.field_d.field_q = this.field_d.field_q + var1_int;
                      continue L0;
                    }
                  }
                }
                if (this.field_d.field_q != this.field_d.field_m.length) {
                  var1 = this;
                  synchronized (var1) {
                    L2: {
                      this.finalize();
                      this.field_p = 3;
                      break L2;
                    }
                  }
                  return;
                } else {
                  throw we.<RuntimeException>$cfr$sneakyThrow(new Exception("HG1: " + this.field_d.field_m.length + " " + this.field_h));
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var1 = (Exception) (Object) decompiledCaughtException;
              var2 = this;
              synchronized (var2) {
                L3: {
                  this.finalize();
                  this.field_p = this.field_p + 1;
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

    final static boolean b(boolean param0) {
        boolean discarded$5 = false;
        if (!param0) {
          if (TorChallenge.field_H != null) {
            if (TorChallenge.field_H.f((byte) 123) == null) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          discarded$5 = we.b(false);
          if (TorChallenge.field_H != null) {
            if (TorChallenge.field_H.f((byte) 123) == null) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    final static int a(int param0, int param1, int param2) {
        int var3 = -60 % ((-25 - param2) / 38);
        int var4 = 0;
        var4 = (-((param0 + 1) * param0) + param1 * (1 + param1)) / (2 * param0);
        return var4;
    }

    we(uj param0, java.net.URL param1, int param2) {
        try {
            this.field_h = param1;
            this.field_b = param0;
            this.field_d = new uf(param2);
        } catch (RuntimeException runtimeException) {
            throw oj.a((Throwable) ((Object) runtimeException), "we.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final uf b(int param0) {
        if (!(3 != this.field_p)) {
            return this.field_d;
        }
        int var2 = -78 % ((param0 - 79) / 33);
        return null;
    }

    public static void a(int param0) {
        boolean discarded$2 = false;
        field_l = null;
        field_m = null;
        if (param0 != 25910) {
          discarded$2 = we.b(true);
          field_e = (ka[][]) null;
          field_i = null;
          field_c = (String[][]) null;
          field_o = null;
          return;
        } else {
          field_e = (ka[][]) null;
          field_i = null;
          field_c = (String[][]) null;
          field_o = null;
          return;
        }
    }

    static {
        field_e = new ka[6][2];
        field_l = new int[]{0, 1, 4, 1, 1, 1, 1, 1};
        field_f = 0;
        field_j = -1;
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
