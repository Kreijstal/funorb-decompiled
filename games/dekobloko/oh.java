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
        if (!(3 != ((oh) this).field_k)) {
            return ((oh) this).field_a;
        }
        if (!param0) {
            return null;
        }
        ((oh) this).field_k = -68;
        return null;
    }

    final synchronized boolean a(int param0) {
        IOException var2 = null;
        OutputStream var3 = null;
        java.net.Socket var4 = null;
        CharSequence var5 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        if (2 > ((oh) this).field_k) {
          L0: {
            if (((oh) this).field_k == 0) {
              L1: {
                if (null != ((oh) this).field_o) {
                  break L1;
                } else {
                  ((oh) this).field_o = ((oh) this).field_m.a(((oh) this).field_j, (byte) 66);
                  break L1;
                }
              }
              if (((oh) this).field_o.field_c != 0) {
                if (((oh) this).field_o.field_c == 1) {
                  break L0;
                } else {
                  ((oh) this).field_o = null;
                  ((oh) this).field_k = ((oh) this).field_k + 1;
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
            if (((oh) this).field_k != 1) {
              break L2;
            } else {
              L3: {
                if (((oh) this).field_h == null) {
                  ((oh) this).field_h = ((oh) this).field_m.a(100, ((oh) this).field_j.getHost(), 443);
                  break L3;
                } else {
                  break L3;
                }
              }
              if (((oh) this).field_h.field_c == 0) {
                return false;
              } else {
                if (1 == ((oh) this).field_h.field_c) {
                  break L2;
                } else {
                  ((oh) this).field_k = ((oh) this).field_k + 1;
                  ((oh) this).field_h = null;
                  return false;
                }
              }
            }
          }
          L4: {
            if (null != ((oh) this).field_g) {
              break L4;
            } else {
              try {
                L5: {
                  L6: {
                    if (0 != ((oh) this).field_k) {
                      break L6;
                    } else {
                      ((oh) this).field_g = (DataInputStream) ((oh) this).field_o.field_b;
                      break L6;
                    }
                  }
                  L7: {
                    if (((oh) this).field_k == 1) {
                      var4 = (java.net.Socket) ((oh) this).field_h.field_b;
                      var4.setSoTimeout(10000);
                      var3 = var4.getOutputStream();
                      var3.write(17);
                      var5 = (CharSequence) (Object) ("JAGGRAB " + ((oh) this).field_j.getFile() + "\n\n");
                      var3.write(km.a(6216, var5));
                      ((oh) this).field_g = new DataInputStream(var4.getInputStream());
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                  ((oh) this).field_a.field_n = 0;
                  decompiledRegionSelector0 = 0;
                  break L5;
                }
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L8: {
                  var2 = (IOException) (Object) decompiledCaughtException;
                  ((oh) this).finalize();
                  ((oh) this).field_k = ((oh) this).field_k + 1;
                  decompiledRegionSelector0 = 1;
                  break L8;
                }
              }
              if (decompiledRegionSelector0 == 0) {
                L9: {
                  if (param0 < -89) {
                    break L9;
                  } else {
                    wl discarded$2 = ((oh) this).a(true);
                    break L9;
                  }
                }
                L10: {
                  if (null == ((oh) this).field_l) {
                    ((oh) this).field_l = ((oh) this).field_m.a((byte) 121, 5, (Runnable) this);
                    break L10;
                  } else {
                    break L10;
                  }
                }
                if (0 == ((oh) this).field_l.field_c) {
                  return false;
                } else {
                  if (((oh) this).field_l.field_c != 1) {
                    ((oh) this).finalize();
                    ((oh) this).field_k = ((oh) this).field_k + 1;
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
              if (null == ((oh) this).field_l) {
                ((oh) this).field_l = ((oh) this).field_m.a((byte) 121, 5, (Runnable) this);
                break L11;
              } else {
                break L11;
              }
            }
            if (0 == ((oh) this).field_l.field_c) {
              return false;
            } else {
              if (((oh) this).field_l.field_c != 1) {
                ((oh) this).finalize();
                ((oh) this).field_k = ((oh) this).field_k + 1;
                return false;
              } else {
                return false;
              }
            }
          } else {
            L12: {
              wl discarded$3 = ((oh) this).a(true);
              if (null == ((oh) this).field_l) {
                ((oh) this).field_l = ((oh) this).field_m.a((byte) 121, 5, (Runnable) this);
                break L12;
              } else {
                break L12;
              }
            }
            if (0 == ((oh) this).field_l.field_c) {
              return false;
            } else {
              if (((oh) this).field_l.field_c == 1) {
                return false;
              } else {
                ((oh) this).finalize();
                ((oh) this).field_k = ((oh) this).field_k + 1;
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
            stackOut_0_0 = lc.field_h.a(0, param0, "");
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var2;
            stackOut_2_1 = new StringBuilder().append("oh.B(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw dh.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + ',' + -15192 + ')');
        }
        return stackIn_1_0;
    }

    public final void run() {
        try {
            int var1_int = 0;
            Object var1 = null;
            Exception var1_ref = null;
            Throwable var2 = null;
            Object var2_ref = null;
            Throwable var3 = null;
            int var4 = 0;
            Throwable decompiledCaughtException = null;
            var4 = client.field_A ? 1 : 0;
            try {
              L0: while (true) {
                L1: {
                  if (((oh) this).field_a.field_n >= ((oh) this).field_a.field_r.length) {
                    break L1;
                  } else {
                    var1_int = ((oh) this).field_g.read(((oh) this).field_a.field_r, ((oh) this).field_a.field_n, -((oh) this).field_a.field_n + ((oh) this).field_a.field_r.length);
                    if (var1_int < 0) {
                      break L1;
                    } else {
                      ((oh) this).field_a.field_n = ((oh) this).field_a.field_n + var1_int;
                      continue L0;
                    }
                  }
                }
                if (((oh) this).field_a.field_r.length == ((oh) this).field_a.field_n) {
                  throw oh.<RuntimeException>$cfr$sneakyThrow(new Exception("HG1: " + ((oh) this).field_a.field_r.length + " " + ((oh) this).field_j));
                } else {
                  var1 = this;
                  synchronized (var1) {
                    L2: {
                      ((oh) this).finalize();
                      ((oh) this).field_k = 3;
                      break L2;
                    }
                  }
                  return;
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var1_ref = (Exception) (Object) decompiledCaughtException;
              var2_ref = this;
              synchronized (var2_ref) {
                L3: {
                  ((oh) this).finalize();
                  ((oh) this).field_k = ((oh) this).field_k + 1;
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
        field_f = null;
        field_i = null;
    }

    final static void a(byte param0) {
    }

    protected final void finalize() {
        if (null != ((oh) this).field_o) {
            if (!(((oh) this).field_o.field_b == null)) {
                try {
                    ((DataInputStream) ((oh) this).field_o.field_b).close();
                } catch (Exception exception) {
                }
            }
            ((oh) this).field_o = null;
        }
        if (((oh) this).field_h != null) {
            if (!(((oh) this).field_h.field_b == null)) {
                try {
                    ((java.net.Socket) ((oh) this).field_h.field_b).close();
                } catch (Exception exception) {
                }
            }
            ((oh) this).field_h = null;
        }
        if (!(((oh) this).field_g == null)) {
            try {
                ((oh) this).field_g.close();
            } catch (Exception exception) {
            }
            ((oh) this).field_g = null;
        }
        ((oh) this).field_l = null;
    }

    final static ui a(ji param0, int param1, String param2, pl param3, String param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        ui stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        ui stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            var5_int = param0.b(-1, param2);
            var6 = param0.a(var5_int, 13030, param4);
            stackOut_2_0 = jg.a(true, param3, var6, var5_int, param0);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var5;
            stackOut_4_1 = new StringBuilder().append("oh.C(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L1;
            }
          }
          L2: {
            stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',').append(91).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param2 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          L3: {
            stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param3 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          L4: {
            stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param4 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L4;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L4;
            }
          }
          throw dh.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ')');
        }
        return stackIn_3_0;
    }

    oh(fd param0, java.net.URL param1, int param2) {
        try {
            ((oh) this).field_j = param1;
            ((oh) this).field_m = param0;
            ((oh) this).field_a = new wl(param2);
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) (Object) runtimeException, "oh.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        field_n = 64;
        field_b = false;
        field_f = new char[]{'[', ']', '#'};
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
