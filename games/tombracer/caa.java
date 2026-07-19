/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class caa implements Runnable {
    private naa field_d;
    private naa field_c;
    private DataInputStream field_a;
    private uia field_h;
    private int field_f;
    static int field_i;
    private naa field_e;
    private java.net.URL field_b;
    private fia field_g;

    final static void a(ff param0, la param1, int param2) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        try {
          L0: {
            L1: {
              if (param2 > 90) {
                break L1;
              } else {
                caa.a(-49, -51, -30, 34, 111, -46);
                break L1;
              }
            }
            L2: {
              if (vpa.a(54)) {
                break L2;
              } else {
                if (!param0.k(-25319)) {
                  if (0 > param1.q((byte) -82)) {
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    ql.field_k.k(97, -2988);
                    ql.field_k.f(-1477662136, param1.q((byte) -82));
                    ql.field_k.f(-1477662136, param1.a((byte) 107));
                    decompiledRegionSelector0 = 2;
                    break L0;
                  }
                } else {
                  break L2;
                }
              }
            }
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            runtimeException = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) (runtimeException);
            stackOut_11_1 = new StringBuilder().append("caa.A(");
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L3;
            }
          }
          L4: {
            stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
            stackOut_14_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param1 == null) {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L4;
            } else {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L4;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    final synchronized boolean a(boolean param0) {
        IOException var2 = null;
        OutputStream var3 = null;
        java.net.Socket var4 = null;
        CharSequence var5 = null;
        Throwable decompiledCaughtException = null;
        if (-3 < (this.field_f ^ -1)) {
          L0: {
            if (this.field_f != 0) {
              break L0;
            } else {
              L1: {
                if (this.field_c != null) {
                  break L1;
                } else {
                  this.field_c = this.field_g.a(this.field_b, 74);
                  break L1;
                }
              }
              if (this.field_c.field_b == 0) {
                return false;
              } else {
                if ((this.field_c.field_b ^ -1) == -2) {
                  break L0;
                } else {
                  this.field_c = null;
                  this.field_f = this.field_f + 1;
                  return false;
                }
              }
            }
          }
          L2: {
            if (-2 == (this.field_f ^ -1)) {
              L3: {
                if (null == this.field_e) {
                  this.field_e = this.field_g.a(-24818, this.field_b.getHost(), 443);
                  break L3;
                } else {
                  break L3;
                }
              }
              if (this.field_e.field_b == 0) {
                return false;
              } else {
                if (this.field_e.field_b != 1) {
                  this.field_f = this.field_f + 1;
                  this.field_e = null;
                  return false;
                } else {
                  break L2;
                }
              }
            } else {
              break L2;
            }
          }
          if (this.field_a == null) {
            try {
              L4: {
                L5: {
                  if (0 == this.field_f) {
                    this.field_a = (DataInputStream) (this.field_c.field_f);
                    break L5;
                  } else {
                    break L5;
                  }
                }
                L6: {
                  if (1 != this.field_f) {
                    break L6;
                  } else {
                    var4 = (java.net.Socket) (this.field_e.field_f);
                    var4.setSoTimeout(10000);
                    var3 = var4.getOutputStream();
                    var3.write(17);
                    var5 = (CharSequence) ((Object) ("JAGGRAB " + this.field_b.getFile() + "\n\n"));
                    var3.write(us.a(var5, param0));
                    this.field_a = new DataInputStream(var4.getInputStream());
                    break L6;
                  }
                }
                this.field_h.field_h = 0;
                break L4;
              }
            } catch (java.io.IOException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L7: {
                var2 = (IOException) (Object) decompiledCaughtException;
                this.finalize();
                this.field_f = this.field_f + 1;
                if (null == this.field_d) {
                  this.field_d = this.field_g.a((Runnable) (this), 425, 5);
                  break L7;
                } else {
                  break L7;
                }
              }
              if (!param0) {
                if (this.field_d.field_b == 0) {
                  return false;
                } else {
                  L8: {
                    if (-2 != (this.field_d.field_b ^ -1)) {
                      this.finalize();
                      this.field_f = this.field_f + 1;
                      break L8;
                    } else {
                      break L8;
                    }
                  }
                  return false;
                }
              } else {
                this.field_a = (DataInputStream) null;
                if (this.field_d.field_b == 0) {
                  return false;
                } else {
                  L9: {
                    if (-2 != (this.field_d.field_b ^ -1)) {
                      this.finalize();
                      this.field_f = this.field_f + 1;
                      break L9;
                    } else {
                      break L9;
                    }
                  }
                  return false;
                }
              }
            }
            L10: {
              if (null == this.field_d) {
                this.field_d = this.field_g.a((Runnable) (this), 425, 5);
                break L10;
              } else {
                break L10;
              }
            }
            L11: {
              if (!param0) {
                break L11;
              } else {
                this.field_a = (DataInputStream) null;
                break L11;
              }
            }
            if (this.field_d.field_b == 0) {
              return false;
            } else {
              L12: {
                if (-2 != (this.field_d.field_b ^ -1)) {
                  this.finalize();
                  this.field_f = this.field_f + 1;
                  break L12;
                } else {
                  break L12;
                }
              }
              return false;
            }
          } else {
            L13: {
              if (null == this.field_d) {
                this.field_d = this.field_g.a((Runnable) (this), 425, 5);
                break L13;
              } else {
                break L13;
              }
            }
            L14: {
              if (!param0) {
                break L14;
              } else {
                this.field_a = (DataInputStream) null;
                break L14;
              }
            }
            if (this.field_d.field_b == 0) {
              return false;
            } else {
              if (-2 == (this.field_d.field_b ^ -1)) {
                return false;
              } else {
                this.finalize();
                this.field_f = this.field_f + 1;
                return false;
              }
            }
          }
        } else {
          return true;
        }
    }

    final static void a(byte param0) {
        bh.field_p = true;
        bja.a(pl.a((byte) 64), (byte) 126, 3);
        int var1 = 72 / ((param0 - 55) / 46);
        rba.field_a.e((byte) 106);
    }

    protected final void finalize() {
        if (null != this.field_c) {
            if (!(this.field_c.field_f == null)) {
                try {
                    ((DataInputStream) (this.field_c.field_f)).close();
                } catch (Exception exception) {
                }
            }
            this.field_c = null;
        }
        if (this.field_e != null) {
            if (!(null == this.field_e.field_f)) {
                try {
                    ((java.net.Socket) (this.field_e.field_f)).close();
                } catch (Exception exception) {
                }
            }
            this.field_e = null;
        }
        if (!(this.field_a == null)) {
            try {
                this.field_a.close();
            } catch (Exception exception) {
            }
            this.field_a = null;
        }
        this.field_d = null;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        RuntimeException decompiledCaughtException = null;
        var7 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param5 == 0) {
                break L1;
              } else {
                field_i = 59;
                break L1;
              }
            }
            var6_int = param3;
            L2: while (true) {
              if (param4 < var6_int) {
                break L0;
              } else {
                nra.a((byte) -55, param0, param1, vaa.field_a[var6_int], param2);
                var6_int++;
                if (var7 == 0) {
                  continue L2;
                } else {
                  return;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var6), "caa.B(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
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
            var4 = TombRacer.field_G ? 1 : 0;
            try {
              L0: while (true) {
                L1: {
                  L2: {
                    L3: {
                      if (this.field_h.field_g.length <= this.field_h.field_h) {
                        break L3;
                      } else {
                        var1_int = this.field_a.read(this.field_h.field_g, this.field_h.field_h, -this.field_h.field_h + this.field_h.field_g.length);
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
                          this.field_h.field_h = this.field_h.field_h + var1_int;
                          if (var4 == 0) {
                            continue L0;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                    if (this.field_h.field_g.length == this.field_h.field_h) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                  var1_ref = this;
                  synchronized (var1_ref) {
                    L5: {
                      this.finalize();
                      this.field_f = 3;
                      break L5;
                    }
                  }
                  return;
                }
                throw caa.<RuntimeException>$cfr$sneakyThrow(new Exception("HG1: " + this.field_h.field_g.length + " " + this.field_b));
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var1 = (Exception) (Object) decompiledCaughtException;
              var2_ref = this;
              synchronized (var2_ref) {
                L6: {
                  this.finalize();
                  this.field_f = this.field_f + 1;
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

    final uia b(byte param0) {
        uia discarded$9 = null;
        if (param0 >= -115) {
            discarded$9 = this.b((byte) 71);
            if (!(this.field_f != 3)) {
                return this.field_h;
            }
            return null;
        }
        if (!(this.field_f != 3)) {
            return this.field_h;
        }
        return null;
    }

    caa(fia param0, java.net.URL param1, int param2) {
        try {
            this.field_b = param1;
            this.field_g = param0;
            this.field_h = new uia(param2);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "caa.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        field_i = 2;
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
