/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class na implements Runnable {
    private gb field_g;
    private nj field_a;
    private dl field_h;
    private nj field_f;
    private int field_c;
    static boolean field_b;
    private java.net.URL field_e;
    private nj field_i;
    private DataInputStream field_d;
    static String[] field_j;

    public final void run() {
        try {
            int var1_int = 0;
            Object var1 = null;
            Object var2 = null;
            Throwable var3 = null;
            int var4 = 0;
            Throwable decompiledCaughtException = null;
            var4 = SolKnight.field_L ? 1 : 0;
            try {
              L0: while (true) {
                L1: {
                  if (this.field_g.field_m >= this.field_g.field_l.length) {
                    break L1;
                  } else {
                    var1_int = this.field_d.read(this.field_g.field_l, this.field_g.field_m, this.field_g.field_l.length - this.field_g.field_m);
                    if (var1_int < 0) {
                      break L1;
                    } else {
                      this.field_g.field_m = this.field_g.field_m + var1_int;
                      continue L0;
                    }
                  }
                }
                if (this.field_g.field_l.length != this.field_g.field_m) {
                  var1 = this;
                  synchronized (var1) {
                    L2: {
                      this.finalize();
                      this.field_c = 3;
                      break L2;
                    }
                  }
                  return;
                } else {
                  throw na.<RuntimeException>$cfr$sneakyThrow(new Exception("HG1: " + this.field_g.field_l.length + " " + this.field_e));
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var1 = (Exception) (Object) decompiledCaughtException;
              var2 = this;
              synchronized (var2) {
                L3: {
                  this.finalize();
                  this.field_c = this.field_c + 1;
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

    final gb a(boolean param0) {
        if (!(this.field_c != 3)) {
            return this.field_g;
        }
        if (param0) {
            return null;
        }
        na.a(110);
        return null;
    }

    final static byte[] a(int param0, byte[] param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        byte[] var3 = null;
        int var4 = 0;
        byte[] stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var2_int = param1.length;
            var3 = new byte[var2_int];
            fk.a(param1, 0, var3, 0, var2_int);
            var4 = -87 / ((66 - param0) / 49);
            stackIn_1_0 = (byte[]) (var3);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var2);

            stackIn_4_1 = new StringBuilder().append("na.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "null";
              break L1;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "{...}";
              break L1;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ')');
        }
        return stackIn_1_0;
    }

    public static void a(int param0) {
        field_j = null;
        if (param0 != -13357) {
            java.applet.Applet var2 = (java.applet.Applet) null;
            na.a((String) null, (java.applet.Applet) null, -92);
        }
    }

    protected final void finalize() {
        if (!(null == this.field_i)) {
            if (!(null == this.field_i.field_e)) {
                try {
                    ((DataInputStream) (this.field_i.field_e)).close();
                } catch (Exception exception) {
                }
            }
            this.field_i = null;
        }
        if (null != this.field_a) {
            if (!(this.field_a.field_e == null)) {
                try {
                    ((java.net.Socket) (this.field_a.field_e)).close();
                } catch (Exception exception) {
                }
            }
            this.field_a = null;
        }
        if (!(null == this.field_d)) {
            try {
                this.field_d.close();
            } catch (Exception exception) {
            }
            this.field_d = null;
        }
        this.field_f = null;
    }

    final static String a(String param0, java.applet.Applet param1, int param2) {
        try {
            String var3 = null;
            String[] var4 = null;
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            String stackIn_9_0 = null;
            Object stackIn_14_0 = null;
            RuntimeException stackIn_17_0 = null;
            StringBuilder stackIn_17_1 = null;
            RuntimeException stackIn_18_0 = null;
            StringBuilder stackIn_18_1 = null;
            String stackIn_18_2 = null;
            StringBuilder stackIn_20_1 = null;
            StringBuilder stackIn_21_1 = null;
            String stackIn_21_2 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            Throwable decompiledCaughtException = null;
            Throwable var3_ref = null;
            RuntimeException var3_ref2 = null;
            var7 = SolKnight.field_L ? 1 : 0;
            try {
              L0: {
                L1: {
                  if (param2 == -32574) {
                    break L1;
                  } else {
                    field_j = (String[]) null;
                    break L1;
                  }
                }
                try {
                  L2: {
                    var3 = (String) (fd.a(param1, "getcookies", (byte) 100));
                    var4 = b.a(var3, ';', true);
                    var5 = 0;
                    L3: while (true) {
                      if (var4.length <= var5) {
                        decompiledRegionSelector0 = 0;
                        break L2;
                      } else {
                        L4: {
                          var6 = var4[var5].indexOf('=');
                          if (0 > var6) {
                            break L4;
                          } else {
                            if (var4[var5].substring(0, var6).trim().equals(param0)) {
                              stackIn_9_0 = var4[var5].substring(var6 + 1).trim();
                              decompiledRegionSelector0 = 1;
                              break L2;
                            } else {
                              break L4;
                            }
                          }
                        }
                        var5++;
                        continue L3;
                      }
                    }
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L5: {
                    var3_ref = decompiledCaughtException;
                    decompiledRegionSelector0 = 0;
                    break L5;
                  }
                }
                if (decompiledRegionSelector0 == 0) {
                  stackIn_14_0 = null;
                  decompiledRegionSelector1 = 0;
                  break L0;
                } else {
                  decompiledRegionSelector1 = 1;
                  break L0;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L6: {
                var3_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_17_0 = (RuntimeException) (var3_ref2);

                stackIn_17_1 = new StringBuilder().append("na.A(");

                if (param0 == null) {
                  stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
                  stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
                  stackIn_18_2 = "null";
                  break L6;
                } else {
                  stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
                  stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
                  stackIn_18_2 = "{...}";
                  break L6;
                }
              }
              L7: {


                stackIn_20_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',');

                if (param1 == null) {
                  stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
                  stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
                  stackIn_21_2 = "null";
                  break L7;
                } else {
                  stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
                  stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
                  stackIn_21_2 = "{...}";
                  break L7;
                }
              }
              throw fc.a((Throwable) ((Object) stackIn_18_0), stackIn_21_2 + ',' + param2 + ')');
            }
            if (decompiledRegionSelector1 == 0) {
              return (String) ((Object) stackIn_14_0);
            } else {
              return stackIn_9_0;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    na(dl param0, java.net.URL param1, int param2) {
        try {
            this.field_h = param0;
            this.field_e = param1;
            this.field_g = new gb(param2);
        } catch (RuntimeException runtimeException) {
            throw fc.a((Throwable) ((Object) runtimeException), "na.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final synchronized boolean a(byte param0) {
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        IOException var2 = null;
        OutputStream var3 = null;
        java.net.Socket var4 = null;
        CharSequence var5 = null;
        if (2 <= this.field_c) {
          return true;
        } else {
          L0: {
            if (-1 == (this.field_c ^ -1)) {
              L1: {
                if (null == this.field_i) {
                  this.field_i = this.field_h.a(this.field_e, (byte) 68);
                  break L1;
                } else {
                  break L1;
                }
              }
              if (this.field_i.field_c == 0) {
                return false;
              } else {
                if (this.field_i.field_c != 1) {
                  this.field_i = null;
                  this.field_c = this.field_c + 1;
                  return false;
                } else {
                  break L0;
                }
              }
            } else {
              break L0;
            }
          }
          L2: {
            if ((this.field_c ^ -1) == -2) {
              L3: {
                if (null != this.field_a) {
                  break L3;
                } else {
                  this.field_a = this.field_h.a(this.field_e.getHost(), 443, -28148);
                  break L3;
                }
              }
              if (this.field_a.field_c != 0) {
                if (1 != this.field_a.field_c) {
                  this.field_c = this.field_c + 1;
                  this.field_a = null;
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
          L4: {
            if (null != this.field_d) {
              break L4;
            } else {
              try {
                L5: {
                  L6: {
                    if (-1 == (this.field_c ^ -1)) {
                      this.field_d = (DataInputStream) (this.field_i.field_e);
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                  L7: {
                    if ((this.field_c ^ -1) == -2) {
                      var4 = (java.net.Socket) (this.field_a.field_e);
                      var4.setSoTimeout(10000);
                      var3 = var4.getOutputStream();
                      var3.write(17);
                      var5 = (CharSequence) ((Object) ("JAGGRAB " + this.field_e.getFile() + "\n\n"));
                      var3.write(wb.a(65, var5));
                      this.field_d = new DataInputStream(var4.getInputStream());
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                  this.field_g.field_m = 0;
                  decompiledRegionSelector0 = 0;
                  break L5;
                }
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L8: {
                  var2 = (IOException) (Object) decompiledCaughtException;
                  this.finalize();
                  this.field_c = this.field_c + 1;
                  decompiledRegionSelector0 = 1;
                  break L8;
                }
              }
              if (decompiledRegionSelector0 == 0) {
                L9: {
                  if (null == this.field_f) {
                    this.field_f = this.field_h.a(5, -90, (Runnable) (this));
                    break L9;
                  } else {
                    break L9;
                  }
                }
                if (-1 == (this.field_f.field_c ^ -1)) {
                  return false;
                } else {
                  L10: {
                    if (this.field_f.field_c != 1) {
                      this.finalize();
                      this.field_c = this.field_c + 1;
                      break L10;
                    } else {
                      break L10;
                    }
                  }
                  if (param0 > -57) {
                    this.field_d = (DataInputStream) null;
                    return false;
                  } else {
                    return false;
                  }
                }
              } else {
                break L4;
              }
            }
          }
          L11: {
            if (null == this.field_f) {
              this.field_f = this.field_h.a(5, -90, (Runnable) (this));
              break L11;
            } else {
              break L11;
            }
          }
          if (-1 == (this.field_f.field_c ^ -1)) {
            return false;
          } else {
            L12: {
              if (this.field_f.field_c != 1) {
                this.finalize();
                this.field_c = this.field_c + 1;
                break L12;
              } else {
                break L12;
              }
            }
            if (param0 > -57) {
              this.field_d = (DataInputStream) null;
              return false;
            } else {
              return false;
            }
          }
        }
    }

    static {
        field_j = new String[]{"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
