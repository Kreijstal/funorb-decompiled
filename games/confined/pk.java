/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class pk implements Runnable {
    private bc field_i;
    private java.net.URL field_g;
    private DataInputStream field_h;
    private bc field_b;
    private df field_j;
    static String field_f;
    private kg field_d;
    private bc field_a;
    static int field_c;
    private int field_e;

    final kg a(int param0) {
        if ((this.field_e ^ -1) != param0) {
            return null;
        }
        return this.field_d;
    }

    public static void c(int param0) {
        if (param0 != -13541) {
            pk.c(46);
            field_f = null;
            return;
        }
        field_f = null;
    }

    protected final void finalize() {
        if (!(null == this.field_b)) {
            if (null != this.field_b.field_f) {
                try {
                    ((DataInputStream) (this.field_b.field_f)).close();
                } catch (Exception exception) {
                }
            }
            this.field_b = null;
        }
        if (this.field_i != null) {
            if (null != this.field_i.field_f) {
                try {
                    ((java.net.Socket) (this.field_i.field_f)).close();
                } catch (Exception exception) {
                }
            }
            this.field_i = null;
        }
        if (this.field_h != null) {
            try {
                this.field_h.close();
            } catch (Exception exception) {
            }
            this.field_h = null;
        }
        this.field_a = null;
    }

    final synchronized boolean b(int param0) {
        IOException var2 = null;
        OutputStream var3 = null;
        java.net.Socket var4 = null;
        CharSequence var5 = null;
        Throwable decompiledCaughtException = null;
        if (this.field_e >= 2) {
          return true;
        } else {
          L0: {
            if (0 == this.field_e) {
              L1: {
                if (null != this.field_b) {
                  break L1;
                } else {
                  this.field_b = this.field_j.a(param0 ^ 1, this.field_g);
                  break L1;
                }
              }
              if (this.field_b.field_g == 0) {
                return false;
              } else {
                if ((this.field_b.field_g ^ -1) == -2) {
                  break L0;
                } else {
                  this.field_b = null;
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
                if (this.field_i == null) {
                  this.field_i = this.field_j.a(443, param0 + -125, this.field_g.getHost());
                  break L3;
                } else {
                  break L3;
                }
              }
              if (this.field_i.field_g != 0) {
                if (this.field_i.field_g != 1) {
                  this.field_e = this.field_e + 1;
                  this.field_i = null;
                  return false;
                } else {
                  break L2;
                }
              } else {
                return false;
              }
            } else {
              break L2;
            }
          }
          if (this.field_h == null) {
            try {
              L4: {
                L5: {
                  if (-1 != (this.field_e ^ -1)) {
                    break L5;
                  } else {
                    this.field_h = (DataInputStream) (this.field_b.field_f);
                    break L5;
                  }
                }
                L6: {
                  if (-2 != (this.field_e ^ -1)) {
                    break L6;
                  } else {
                    var4 = (java.net.Socket) (this.field_i.field_f);
                    var4.setSoTimeout(10000);
                    var3 = var4.getOutputStream();
                    var3.write(17);
                    var5 = (CharSequence) ((Object) ("JAGGRAB " + this.field_g.getFile() + "\n\n"));
                    var3.write(ta.a((byte) -126, var5));
                    this.field_h = new DataInputStream(var4.getInputStream());
                    break L6;
                  }
                }
                this.field_d.field_n = 0;
                break L4;
              }
            } catch (java.io.IOException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2 = (IOException) (Object) decompiledCaughtException;
              this.finalize();
              this.field_e = this.field_e + 1;
              if (this.field_a != null) {
                if (0 != this.field_a.field_g) {
                  if (this.field_a.field_g != param0) {
                    this.finalize();
                    this.field_e = this.field_e + 1;
                    return false;
                  } else {
                    return false;
                  }
                } else {
                  return false;
                }
              } else {
                this.field_a = this.field_j.a((byte) 106, (Runnable) (this), 5);
                if (0 != this.field_a.field_g) {
                  if (this.field_a.field_g == param0) {
                    return false;
                  } else {
                    this.finalize();
                    this.field_e = this.field_e + 1;
                    return false;
                  }
                } else {
                  return false;
                }
              }
            }
            L7: {
              if (this.field_a != null) {
                break L7;
              } else {
                this.field_a = this.field_j.a((byte) 106, (Runnable) (this), 5);
                break L7;
              }
            }
            if (0 == this.field_a.field_g) {
              return false;
            } else {
              L8: {
                if (this.field_a.field_g == param0) {
                  break L8;
                } else {
                  this.finalize();
                  this.field_e = this.field_e + 1;
                  break L8;
                }
              }
              return false;
            }
          } else {
            L9: {
              if (this.field_a != null) {
                break L9;
              } else {
                this.field_a = this.field_j.a((byte) 106, (Runnable) (this), 5);
                break L9;
              }
            }
            if (0 != this.field_a.field_g) {
              if (this.field_a.field_g != param0) {
                this.finalize();
                this.field_e = this.field_e + 1;
                return false;
              } else {
                return false;
              }
            } else {
              return false;
            }
          }
        }
    }

    final static void a(boolean param0, String param1, java.applet.Applet param2, byte param3) {
        try {
            int var4_int = 0;
            java.net.MalformedURLException var4 = null;
            RuntimeException var4_ref = null;
            RuntimeException stackIn_9_0 = null;
            StringBuilder stackIn_9_1 = null;
            RuntimeException stackIn_10_0 = null;
            StringBuilder stackIn_10_1 = null;
            RuntimeException stackIn_11_0 = null;
            StringBuilder stackIn_11_1 = null;
            String stackIn_11_2 = null;
            RuntimeException stackIn_12_0 = null;
            StringBuilder stackIn_12_1 = null;
            RuntimeException stackIn_13_0 = null;
            StringBuilder stackIn_13_1 = null;
            RuntimeException stackIn_14_0 = null;
            StringBuilder stackIn_14_1 = null;
            String stackIn_14_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_8_0 = null;
            StringBuilder stackOut_8_1 = null;
            RuntimeException stackOut_10_0 = null;
            StringBuilder stackOut_10_1 = null;
            String stackOut_10_2 = null;
            RuntimeException stackOut_9_0 = null;
            StringBuilder stackOut_9_1 = null;
            String stackOut_9_2 = null;
            RuntimeException stackOut_11_0 = null;
            StringBuilder stackOut_11_1 = null;
            RuntimeException stackOut_13_0 = null;
            StringBuilder stackOut_13_1 = null;
            String stackOut_13_2 = null;
            RuntimeException stackOut_12_0 = null;
            StringBuilder stackOut_12_1 = null;
            String stackOut_12_2 = null;
            try {
              L0: {
                L1: {
                  if (!df.field_f.startsWith("win")) {
                    break L1;
                  } else {
                    if (ik.a(param1, -1)) {
                      break L0;
                    } else {
                      break L1;
                    }
                  }
                }
                try {
                  L2: {
                    var4_int = -70 / ((param3 - -9) / 51);
                    param2.getAppletContext().showDocument(new java.net.URL(param1), "_blank");
                    break L2;
                  }
                } catch (java.net.MalformedURLException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var4 = (java.net.MalformedURLException) (Object) decompiledCaughtException;
                  mb.a("MGR1: " + param1, true, (Throwable) null);
                  return;
                }
                return;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L3: {
                var4_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_8_0 = (RuntimeException) (var4_ref);
                stackOut_8_1 = new StringBuilder().append("pk.B(").append(param0).append(',');
                stackIn_10_0 = stackOut_8_0;
                stackIn_10_1 = stackOut_8_1;
                stackIn_9_0 = stackOut_8_0;
                stackIn_9_1 = stackOut_8_1;
                if (param1 == null) {
                  stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
                  stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
                  stackOut_10_2 = "null";
                  stackIn_11_0 = stackOut_10_0;
                  stackIn_11_1 = stackOut_10_1;
                  stackIn_11_2 = stackOut_10_2;
                  break L3;
                } else {
                  stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
                  stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
                  stackOut_9_2 = "{...}";
                  stackIn_11_0 = stackOut_9_0;
                  stackIn_11_1 = stackOut_9_1;
                  stackIn_11_2 = stackOut_9_2;
                  break L3;
                }
              }
              L4: {
                stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
                stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');
                stackIn_13_0 = stackOut_11_0;
                stackIn_13_1 = stackOut_11_1;
                stackIn_12_0 = stackOut_11_0;
                stackIn_12_1 = stackOut_11_1;
                if (param2 == null) {
                  stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
                  stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
                  stackOut_13_2 = "null";
                  stackIn_14_0 = stackOut_13_0;
                  stackIn_14_1 = stackOut_13_1;
                  stackIn_14_2 = stackOut_13_2;
                  break L4;
                } else {
                  stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
                  stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
                  stackOut_12_2 = "{...}";
                  stackIn_14_0 = stackOut_12_0;
                  stackIn_14_1 = stackOut_12_1;
                  stackIn_14_2 = stackOut_12_2;
                  break L4;
                }
              }
              throw sd.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param3 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
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
            var4 = Confined.field_J ? 1 : 0;
            try {
              L0: while (true) {
                L1: {
                  if (this.field_d.field_m.length <= this.field_d.field_n) {
                    break L1;
                  } else {
                    var1_int = this.field_h.read(this.field_d.field_m, this.field_d.field_n, this.field_d.field_m.length + -this.field_d.field_n);
                    if (-1 >= (var1_int ^ -1)) {
                      this.field_d.field_n = this.field_d.field_n + var1_int;
                      continue L0;
                    } else {
                      break L1;
                    }
                  }
                }
                if (this.field_d.field_n != this.field_d.field_m.length) {
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
                  throw pk.<RuntimeException>$cfr$sneakyThrow(new Exception("HG1: " + this.field_d.field_m.length + " " + this.field_g));
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

    pk(df param0, java.net.URL param1, int param2) {
        try {
            this.field_g = param1;
            this.field_j = param0;
            this.field_d = new kg(param2);
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) ((Object) runtimeException), "pk.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static void a(byte param0, String param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            if (param0 >= 10) {
              L1: {
                if (ie.field_a) {
                  break L1;
                } else {
                  hc.field_u = param1;
                  bg.field_f = 0;
                  break L1;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (runtimeException);
            stackOut_5_1 = new StringBuilder().append("pk.A(").append(param0).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    static {
        field_c = -1;
        field_f = "<col=FFFFFF>Disruption cannon:</col> operated similarly to the charge cannon but with <col=FFFFFF><%0></col>, this weapon fires a light-bending vortex that sucks things in and blows them up. It also gets bigger as it gets further away!";
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
