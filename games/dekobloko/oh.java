/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class oh implements Runnable {
    static int field_n;
    static w field_d;
    private java.net.URL field_j;
    private mh field_h;
    private DataInputStream field_g;
    private int field_k;
    private wl field_a;
    static char[] field_f;
    private fd field_m;
    static boolean field_b;
    private mh field_l;
    static ck field_e;
    static w field_i;
    static int[] field_c;
    private mh field_o;

    final wl a(boolean param0) {
        if (!(3 != this.field_k)) {
            return this.field_a;
        }
        if (!param0) {
            return null;
        }
        this.field_k = -68;
        return null;
    }

    final synchronized boolean a(int param0) {
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        IOException var2 = null;
        OutputStream var3 = null;
        java.net.Socket var4 = null;
        CharSequence var5 = null;
        if (2 > this.field_k) {
          L0: {
            if (this.field_k == 0) {
              L1: {
                if (null != this.field_o) {
                  break L1;
                } else {
                  this.field_o = this.field_m.a(this.field_j, (byte) 66);
                  break L1;
                }
              }
              if (this.field_o.field_c != 0) {
                if ((this.field_o.field_c ^ -1) == -2) {
                  break L0;
                } else {
                  this.field_o = null;
                  this.field_k = this.field_k + 1;
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
            if ((this.field_k ^ -1) != -2) {
              break L2;
            } else {
              L3: {
                if (this.field_h == null) {
                  this.field_h = this.field_m.a(100, this.field_j.getHost(), 443);
                  break L3;
                } else {
                  break L3;
                }
              }
              if (this.field_h.field_c == 0) {
                return false;
              } else {
                if (1 == this.field_h.field_c) {
                  break L2;
                } else {
                  this.field_k = this.field_k + 1;
                  this.field_h = null;
                  return false;
                }
              }
            }
          }
          L4: {
            if (null != this.field_g) {
              break L4;
            } else {
              try {
                L5: {
                  L6: {
                    if (0 != this.field_k) {
                      break L6;
                    } else {
                      this.field_g = (DataInputStream) (this.field_o.field_b);
                      break L6;
                    }
                  }
                  L7: {
                    if ((this.field_k ^ -1) == -2) {
                      var4 = (java.net.Socket) (this.field_h.field_b);
                      var4.setSoTimeout(10000);
                      var3 = var4.getOutputStream();
                      var3.write(17);
                      var5 = (CharSequence) ((Object) ("JAGGRAB " + this.field_j.getFile() + "\n\n"));
                      var3.write(km.a(6216, var5));
                      this.field_g = new DataInputStream(var4.getInputStream());
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                  this.field_a.field_n = 0;
                  decompiledRegionSelector0 = 0;
                  break L5;
                }
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L8: {
                  var2 = (IOException) (Object) decompiledCaughtException;
                  this.finalize();
                  this.field_k = this.field_k + 1;
                  decompiledRegionSelector0 = 1;
                  break L8;
                }
              }
              if (decompiledRegionSelector0 == 0) {
                L9: {
                  if (param0 < -89) {
                    break L9;
                  } else {
                    this.a(true);
                    break L9;
                  }
                }
                L10: {
                  if (null == this.field_l) {
                    this.field_l = this.field_m.a((byte) 121, 5, (Runnable) (this));
                    break L10;
                  } else {
                    break L10;
                  }
                }
                if (0 == this.field_l.field_c) {
                  return false;
                } else {
                  if (-2 != (this.field_l.field_c ^ -1)) {
                    this.finalize();
                    this.field_k = this.field_k + 1;
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
          if (param0 < -89) {
            L11: {
              if (null == this.field_l) {
                this.field_l = this.field_m.a((byte) 121, 5, (Runnable) (this));
                break L11;
              } else {
                break L11;
              }
            }
            if (0 == this.field_l.field_c) {
              return false;
            } else {
              if (-2 != (this.field_l.field_c ^ -1)) {
                this.finalize();
                this.field_k = this.field_k + 1;
                return false;
              } else {
                return false;
              }
            }
          } else {
            L12: {
              this.a(true);
              if (null == this.field_l) {
                this.field_l = this.field_m.a((byte) 121, 5, (Runnable) (this));
                break L12;
              } else {
                break L12;
              }
            }
            if (0 == this.field_l.field_c) {
              return false;
            } else {
              if (-2 == (this.field_l.field_c ^ -1)) {
                return false;
              } else {
                this.finalize();
                this.field_k = this.field_k + 1;
                return false;
              }
            }
          }
        } else {
          return true;
        }
    }

    final static byte[] a(String param0, int param1) {
        RuntimeException var2 = null;
        String var3 = null;
        byte[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == -15192) {
                break L1;
              } else {
                var3 = (String) null;
                oh.a((ji) null, -55, (String) null, (pl) null, (String) null);
                break L1;
              }
            }
            stackIn_3_0 = lc.field_h.a(0, param0, "");
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var2);

            stackIn_6_1 = new StringBuilder().append("oh.B(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    public final void run() {
        try {
            int var1_int = 0;
            Object var1 = null;
            Object var2 = null;
            Throwable var3 = null;
            int var4 = 0;
            Throwable decompiledCaughtException = null;
            var4 = client.field_A ? 1 : 0;
            try {
              L0: while (true) {
                L1: {
                  if (this.field_a.field_n >= this.field_a.field_r.length) {
                    break L1;
                  } else {
                    var1_int = this.field_g.read(this.field_a.field_r, this.field_a.field_n, -this.field_a.field_n + this.field_a.field_r.length);
                    if (var1_int < 0) {
                      break L1;
                    } else {
                      this.field_a.field_n = this.field_a.field_n + var1_int;
                      continue L0;
                    }
                  }
                }
                if (this.field_a.field_r.length == this.field_a.field_n) {
                  throw oh.<RuntimeException>$cfr$sneakyThrow(new Exception("HG1: " + this.field_a.field_r.length + " " + this.field_j));
                } else {
                  var1 = this;
                  synchronized (var1) {
                    L2: {
                      this.finalize();
                      this.field_k = 3;
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
                  this.field_k = this.field_k + 1;
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

    public static void b(boolean param0) {
        field_e = null;
        field_c = null;
        field_d = null;
        if (param0) {
            return;
        }
        field_f = null;
        field_i = null;
    }

    final static void a(byte param0) {
        if (param0 != 13) {
            String var2 = (String) null;
            oh.a((String) null, -97);
        }
    }

    protected final void finalize() {
        if (null != this.field_o) {
            if (!(this.field_o.field_b == null)) {
                try {
                    ((DataInputStream) (this.field_o.field_b)).close();
                } catch (Exception exception) {
                }
            }
            this.field_o = null;
        }
        if (this.field_h != null) {
            if (!(this.field_h.field_b == null)) {
                try {
                    ((java.net.Socket) (this.field_h.field_b)).close();
                } catch (Exception exception) {
                }
            }
            this.field_h = null;
        }
        if (!(this.field_g == null)) {
            try {
                this.field_g.close();
            } catch (Exception exception) {
            }
            this.field_g = null;
        }
        this.field_l = null;
    }

    final static ui a(ji param0, int param1, String param2, pl param3, String param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        ui stackIn_2_0 = null;
        ui stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 == 91) {
              var5_int = param0.b(param1 + -92, param2);
              var6 = param0.a(var5_int, param1 + 12939, param4);
              stackIn_4_0 = jg.a(true, param3, var6, var5_int, param0);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (ui) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var5);

            stackIn_7_1 = new StringBuilder().append("oh.C(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');

            if (param3 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L3;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_16_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',');

            if (param4 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L4;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L4;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_8_0), stackIn_17_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    oh(fd param0, java.net.URL param1, int param2) {
        try {
            this.field_j = param1;
            this.field_m = param0;
            this.field_a = new wl(param2);
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) ((Object) runtimeException), "oh.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        field_n = 64;
        field_b = false;
        field_f = new char[]{(char)91, (char)93, (char)35};
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
