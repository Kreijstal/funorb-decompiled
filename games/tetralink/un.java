/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class un implements Runnable {
    private vl field_i;
    private ie field_a;
    static int[] field_j;
    private vl field_b;
    private DataInputStream field_d;
    private vl field_h;
    private java.net.URL field_e;
    static long field_f;
    private bh field_g;
    private int field_c;

    final synchronized boolean b(byte param0) {
        int var2 = 0;
        IOException var3 = null;
        OutputStream var4 = null;
        java.net.Socket var5 = null;
        CharSequence var6 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        var2 = 21 / ((59 - param0) / 58);
        if (((un) this).field_c < 2) {
          L0: {
            if (((un) this).field_c != 0) {
              break L0;
            } else {
              L1: {
                if (null == ((un) this).field_h) {
                  ((un) this).field_h = ((un) this).field_a.a(false, ((un) this).field_e);
                  break L1;
                } else {
                  break L1;
                }
              }
              if (0 == ((un) this).field_h.field_d) {
                return false;
              } else {
                if (-2 != ((un) this).field_h.field_d) {
                  ((un) this).field_c = ((un) this).field_c + 1;
                  ((un) this).field_h = null;
                  return false;
                } else {
                  break L0;
                }
              }
            }
          }
          L2: {
            if (-2 == ((un) this).field_c) {
              L3: {
                if (((un) this).field_i != null) {
                  break L3;
                } else {
                  ((un) this).field_i = ((un) this).field_a.a(443, ((un) this).field_e.getHost(), (byte) 112);
                  break L3;
                }
              }
              if (0 != ((un) this).field_i.field_d) {
                if (((un) this).field_i.field_d == 1) {
                  break L2;
                } else {
                  ((un) this).field_c = ((un) this).field_c + 1;
                  ((un) this).field_i = null;
                  return false;
                }
              } else {
                return false;
              }
            } else {
              break L2;
            }
          }
          L4: {
            if (null != ((un) this).field_d) {
              break L4;
            } else {
              try {
                L5: {
                  L6: {
                    if (((un) this).field_c != 0) {
                      break L6;
                    } else {
                      ((un) this).field_d = (DataInputStream) ((un) this).field_h.field_f;
                      break L6;
                    }
                  }
                  L7: {
                    if (((un) this).field_c != 1) {
                      break L7;
                    } else {
                      var5 = (java.net.Socket) ((un) this).field_i.field_f;
                      var5.setSoTimeout(10000);
                      var4 = var5.getOutputStream();
                      var4.write(17);
                      var6 = (CharSequence) (Object) ("JAGGRAB " + ((un) this).field_e.getFile() + "\n\n");
                      var4.write(q.a(-125, var6));
                      ((un) this).field_d = new DataInputStream(var5.getInputStream());
                      break L7;
                    }
                  }
                  ((un) this).field_g.field_t = 0;
                  decompiledRegionSelector0 = 0;
                  break L5;
                }
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L8: {
                  var3 = (IOException) (Object) decompiledCaughtException;
                  ((un) this).finalize();
                  ((un) this).field_c = ((un) this).field_c + 1;
                  decompiledRegionSelector0 = 1;
                  break L8;
                }
              }
              if (decompiledRegionSelector0 == 0) {
                L9: {
                  if (((un) this).field_b == null) {
                    ((un) this).field_b = ((un) this).field_a.a((Runnable) this, -106, 5);
                    break L9;
                  } else {
                    break L9;
                  }
                }
                if (((un) this).field_b.field_d == 0) {
                  return false;
                } else {
                  if (1 != ((un) this).field_b.field_d) {
                    ((un) this).finalize();
                    ((un) this).field_c = ((un) this).field_c + 1;
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
          L10: {
            if (((un) this).field_b == null) {
              ((un) this).field_b = ((un) this).field_a.a((Runnable) this, -106, 5);
              break L10;
            } else {
              break L10;
            }
          }
          if (((un) this).field_b.field_d == 0) {
            return false;
          } else {
            if (1 != ((un) this).field_b.field_d) {
              ((un) this).finalize();
              ((un) this).field_c = ((un) this).field_c + 1;
              return false;
            } else {
              return false;
            }
          }
        } else {
          return true;
        }
    }

    public static void a(int param0) {
        field_j = null;
    }

    final bh a(byte param0) {
        if (((un) this).field_c == 3) {
          return ((un) this).field_g;
        } else {
          if (param0 == 79) {
            return null;
          } else {
            bh discarded$2 = ((un) this).a((byte) -122);
            return null;
          }
        }
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
            var4 = TetraLink.field_J;
            try {
              L0: while (true) {
                L1: {
                  if (((un) this).field_g.field_u.length <= ((un) this).field_g.field_t) {
                    break L1;
                  } else {
                    var1_int = ((un) this).field_d.read(((un) this).field_g.field_u, ((un) this).field_g.field_t, ((un) this).field_g.field_u.length + -((un) this).field_g.field_t);
                    if (var1_int < 0) {
                      break L1;
                    } else {
                      ((un) this).field_g.field_t = ((un) this).field_g.field_t + var1_int;
                      continue L0;
                    }
                  }
                }
                if (((un) this).field_g.field_t != ((un) this).field_g.field_u.length) {
                  var1 = this;
                  synchronized (var1) {
                    L2: {
                      ((un) this).finalize();
                      ((un) this).field_c = 3;
                      break L2;
                    }
                  }
                  return;
                } else {
                  throw un.<RuntimeException>$cfr$sneakyThrow(new Exception("HG1: " + ((un) this).field_g.field_u.length + " " + ((un) this).field_e));
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var1_ref = (Exception) (Object) decompiledCaughtException;
              var2_ref = this;
              synchronized (var2_ref) {
                L3: {
                  ((un) this).finalize();
                  ((un) this).field_c = ((un) this).field_c + 1;
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

    un(ie param0, java.net.URL param1, int param2) {
        try {
            ((un) this).field_e = param1;
            ((un) this).field_a = param0;
            ((un) this).field_g = new bh(param2);
        } catch (RuntimeException runtimeException) {
            throw oi.a((Throwable) (Object) runtimeException, "un.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 41);
        }
    }

    final static ig a(int param0, ah param1, int param2, int param3, ah param4) {
        RuntimeException var5 = null;
        Object stackIn_2_0 = null;
        Object stackIn_5_0 = null;
        ig stackIn_7_0 = null;
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
        RuntimeException decompiledCaughtException = null;
        ig stackOut_6_0 = null;
        Object stackOut_4_0 = null;
        Object stackOut_1_0 = null;
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
            if (param0 == -29082) {
              if (ia.a(param3, param4, param2, -58)) {
                stackOut_6_0 = fa.a(param0 + 28748, param1.a(param0 + 28976, param3, param2));
                stackIn_7_0 = stackOut_6_0;
                break L0;
              } else {
                stackOut_4_0 = null;
                stackIn_5_0 = stackOut_4_0;
                return (ig) (Object) stackIn_5_0;
              }
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (ig) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var5;
            stackOut_8_1 = new StringBuilder().append("un.B(").append(param0).append(44);
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L1;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L1;
            }
          }
          L2: {
            stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
            stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(44).append(param2).append(44).append(param3).append(44);
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param4 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L2;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L2;
            }
          }
          throw oi.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 41);
        }
        return stackIn_7_0;
    }

    protected final void finalize() {
        if (!(null == ((un) this).field_h)) {
            if (null != ((un) this).field_h.field_f) {
                try {
                    ((DataInputStream) ((un) this).field_h.field_f).close();
                } catch (Exception exception) {
                }
            }
            ((un) this).field_h = null;
        }
        if (null != ((un) this).field_i) {
            if (((un) this).field_i.field_f != null) {
                try {
                    ((java.net.Socket) ((un) this).field_i.field_f).close();
                } catch (Exception exception) {
                }
            }
            ((un) this).field_i = null;
        }
        if (!(((un) this).field_d == null)) {
            try {
                ((un) this).field_d.close();
            } catch (Exception exception) {
            }
            ((un) this).field_d = null;
        }
        ((un) this).field_b = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = new int[5];
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
