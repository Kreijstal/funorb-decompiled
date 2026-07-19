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
            int stackIn_3_0 = 0;
            int stackIn_7_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_2_0 = 0;
            int stackOut_6_0 = 0;
            var4 = SolKnight.field_L ? 1 : 0;
            try {
              L0: while (true) {
                L1: {
                  L2: {
                    if (this.field_g.field_m >= this.field_g.field_l.length) {
                      break L2;
                    } else {
                      var1_int = this.field_d.read(this.field_g.field_l, this.field_g.field_m, this.field_g.field_l.length - this.field_g.field_m);
                      stackOut_2_0 = var1_int;
                      stackIn_7_0 = stackOut_2_0;
                      stackIn_3_0 = stackOut_2_0;
                      if (var4 != 0) {
                        break L1;
                      } else {
                        if (stackIn_3_0 < 0) {
                          break L2;
                        } else {
                          this.field_g.field_m = this.field_g.field_m + var1_int;
                          if (var4 == 0) {
                            continue L0;
                          } else {
                            break L2;
                          }
                        }
                      }
                    }
                  }
                  stackOut_6_0 = this.field_g.field_l.length ^ -1;
                  stackIn_7_0 = stackOut_6_0;
                  break L1;
                }
                if (stackIn_7_0 != (this.field_g.field_m ^ -1)) {
                  var1 = this;
                  synchronized (var1) {
                    L3: {
                      this.finalize();
                      this.field_c = 3;
                      break L3;
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
                L4: {
                  this.finalize();
                  this.field_c = this.field_c + 1;
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
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_0_0 = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            var2_int = param1.length;
            var3 = new byte[var2_int];
            fk.a(param1, 0, var3, 0, var2_int);
            var4 = -87 / ((66 - param0) / 49);
            stackOut_0_0 = (byte[]) (var3);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) (var2);
            stackOut_2_1 = new StringBuilder().append("na.D(").append(param0).append(',');
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) ((Object) stackIn_3_0);
              stackOut_3_1 = (StringBuilder) ((Object) stackIn_3_1);
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ')');
        }
        return stackIn_1_0;
    }

    public static void a(int param0) {
        String discarded$0 = null;
        field_j = null;
        if (param0 != -13357) {
            java.applet.Applet var2 = (java.applet.Applet) null;
            discarded$0 = na.a((String) null, (java.applet.Applet) null, -92);
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
            Throwable var3 = null;
            RuntimeException var3_ref = null;
            String[] var4 = null;
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            String var8 = null;
            String stackIn_11_0 = null;
            Object stackIn_16_0 = null;
            RuntimeException stackIn_18_0 = null;
            StringBuilder stackIn_18_1 = null;
            RuntimeException stackIn_19_0 = null;
            StringBuilder stackIn_19_1 = null;
            RuntimeException stackIn_20_0 = null;
            StringBuilder stackIn_20_1 = null;
            String stackIn_20_2 = null;
            RuntimeException stackIn_21_0 = null;
            StringBuilder stackIn_21_1 = null;
            RuntimeException stackIn_22_0 = null;
            StringBuilder stackIn_22_1 = null;
            RuntimeException stackIn_23_0 = null;
            StringBuilder stackIn_23_1 = null;
            String stackIn_23_2 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            Throwable decompiledCaughtException = null;
            String stackOut_10_0 = null;
            Object stackOut_15_0 = null;
            RuntimeException stackOut_17_0 = null;
            StringBuilder stackOut_17_1 = null;
            RuntimeException stackOut_19_0 = null;
            StringBuilder stackOut_19_1 = null;
            String stackOut_19_2 = null;
            RuntimeException stackOut_18_0 = null;
            StringBuilder stackOut_18_1 = null;
            String stackOut_18_2 = null;
            RuntimeException stackOut_20_0 = null;
            StringBuilder stackOut_20_1 = null;
            RuntimeException stackOut_22_0 = null;
            StringBuilder stackOut_22_1 = null;
            String stackOut_22_2 = null;
            RuntimeException stackOut_21_0 = null;
            StringBuilder stackOut_21_1 = null;
            String stackOut_21_2 = null;
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
                    var8 = (String) (fd.a(param1, "getcookies", (byte) 100));
                    var4 = b.a(var8, ';', true);
                    var5 = 0;
                    L3: while (true) {
                      if (var4.length <= var5) {
                        decompiledRegionSelector0 = 0;
                        break L2;
                      } else {
                        var6 = var4[var5].indexOf('=');
                        if (var7 == 0) {
                          L4: {
                            if (0 > var6) {
                              break L4;
                            } else {
                              if (var4[var5].substring(0, var6).trim().equals(param0)) {
                                stackOut_10_0 = var4[var5].substring(var6 + 1).trim();
                                stackIn_11_0 = stackOut_10_0;
                                decompiledRegionSelector0 = 1;
                                break L2;
                              } else {
                                break L4;
                              }
                            }
                          }
                          var5++;
                          continue L3;
                        } else {
                          return null;
                        }
                      }
                    }
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L5: {
                    var3 = decompiledCaughtException;
                    decompiledRegionSelector0 = 0;
                    break L5;
                  }
                }
                if (decompiledRegionSelector0 == 0) {
                  stackOut_15_0 = null;
                  stackIn_16_0 = stackOut_15_0;
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
                var3_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_17_0 = (RuntimeException) (var3_ref);
                stackOut_17_1 = new StringBuilder().append("na.A(");
                stackIn_19_0 = stackOut_17_0;
                stackIn_19_1 = stackOut_17_1;
                stackIn_18_0 = stackOut_17_0;
                stackIn_18_1 = stackOut_17_1;
                if (param0 == null) {
                  stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
                  stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
                  stackOut_19_2 = "null";
                  stackIn_20_0 = stackOut_19_0;
                  stackIn_20_1 = stackOut_19_1;
                  stackIn_20_2 = stackOut_19_2;
                  break L6;
                } else {
                  stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
                  stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
                  stackOut_18_2 = "{...}";
                  stackIn_20_0 = stackOut_18_0;
                  stackIn_20_1 = stackOut_18_1;
                  stackIn_20_2 = stackOut_18_2;
                  break L6;
                }
              }
              L7: {
                stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
                stackOut_20_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(',');
                stackIn_22_0 = stackOut_20_0;
                stackIn_22_1 = stackOut_20_1;
                stackIn_21_0 = stackOut_20_0;
                stackIn_21_1 = stackOut_20_1;
                if (param1 == null) {
                  stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
                  stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
                  stackOut_22_2 = "null";
                  stackIn_23_0 = stackOut_22_0;
                  stackIn_23_1 = stackOut_22_1;
                  stackIn_23_2 = stackOut_22_2;
                  break L7;
                } else {
                  stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
                  stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
                  stackOut_21_2 = "{...}";
                  stackIn_23_0 = stackOut_21_0;
                  stackIn_23_1 = stackOut_21_1;
                  stackIn_23_2 = stackOut_21_2;
                  break L7;
                }
              }
              throw fc.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ',' + param2 + ')');
            }
            if (decompiledRegionSelector1 == 0) {
              return (String) ((Object) stackIn_16_0);
            } else {
              return stackIn_11_0;
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
        IOException var2 = null;
        OutputStream var3 = null;
        java.net.Socket var4 = null;
        CharSequence var5 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
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
