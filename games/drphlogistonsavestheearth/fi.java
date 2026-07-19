/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class fi implements Runnable {
    private il field_c;
    private bl field_i;
    private DataInputStream field_a;
    private int field_g;
    static int[] field_h;
    private od field_j;
    private il field_f;
    private java.net.URL field_d;
    private il field_b;
    static he[] field_e;

    final static String a(int param0, byte param1, int param2, CharSequence[] param3) {
        StringBuilder discarded$5 = null;
        StringBuilder discarded$6 = null;
        CharSequence var4 = null;
        int var4_int = 0;
        RuntimeException var4_ref = null;
        int var5 = 0;
        int var6_int = 0;
        StringBuilder var6 = null;
        CharSequence var7_ref_CharSequence = null;
        int var7 = 0;
        CharSequence var8 = null;
        int var9 = 0;
        CharSequence var10 = null;
        String stackIn_4_0 = null;
        String stackIn_9_0 = null;
        String stackIn_12_0 = null;
        String stackIn_26_0 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        String stackOut_3_0 = null;
        String stackOut_25_0 = null;
        String stackOut_11_0 = null;
        String stackOut_8_0 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        var9 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            if (0 == param0) {
              stackOut_3_0 = "";
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (param0 != 1) {
                if (param1 <= -16) {
                  var4_int = param2 + param0;
                  var5 = 0;
                  var6_int = param2;
                  L1: while (true) {
                    if (var4_int <= var6_int) {
                      var6 = new StringBuilder(var5);
                      var7 = param2;
                      L2: while (true) {
                        if (var7 >= var4_int) {
                          stackOut_25_0 = var6.toString();
                          stackIn_26_0 = stackOut_25_0;
                          decompiledRegionSelector0 = 3;
                          break L0;
                        } else {
                          L3: {
                            var8 = param3[var7];
                            if (var8 == null) {
                              discarded$5 = var6.append("null");
                              break L3;
                            } else {
                              discarded$6 = var6.append(var8);
                              break L3;
                            }
                          }
                          var7++;
                          continue L2;
                        }
                      }
                    } else {
                      L4: {
                        var7_ref_CharSequence = param3[var6_int];
                        if (var7_ref_CharSequence == null) {
                          var5 += 4;
                          break L4;
                        } else {
                          var5 = var5 + var7_ref_CharSequence.length();
                          break L4;
                        }
                      }
                      var6_int++;
                      continue L1;
                    }
                  }
                } else {
                  stackOut_11_0 = (String) null;
                  stackIn_12_0 = stackOut_11_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                var10 = param3[param2];
                var4 = var10;
                if (var4 == null) {
                  stackOut_8_0 = "null";
                  stackIn_9_0 = stackOut_8_0;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  return var10.toString();
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4_ref = decompiledCaughtException;
            stackOut_27_0 = (RuntimeException) (var4_ref);
            stackOut_27_1 = new StringBuilder().append("fi.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_29_0 = stackOut_27_0;
            stackIn_29_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param3 == null) {
              stackOut_29_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackOut_29_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L5;
            } else {
              stackOut_28_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackOut_28_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackOut_28_2 = "{...}";
              stackIn_30_0 = stackOut_28_0;
              stackIn_30_1 = stackOut_28_1;
              stackIn_30_2 = stackOut_28_2;
              break L5;
            }
          }
          throw ie.a((Throwable) ((Object) stackIn_30_0), stackIn_30_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_9_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_12_0;
            } else {
              return stackIn_26_0;
            }
          }
        }
    }

    final od a(byte param0) {
        if (param0 < 121) {
            this.field_c = (il) null;
        }
        if (3 != this.field_g) {
            return null;
        }
        return this.field_j;
    }

    public static void a(int param0) {
        field_e = null;
        field_h = null;
        if (param0 <= 100) {
            field_h = (int[]) null;
        }
    }

    public final void run() {
        try {
            int var1_int = 0;
            Object var1 = null;
            Throwable var2 = null;
            Object var2_ref = null;
            Throwable var3 = null;
            int var4 = 0;
            Throwable decompiledCaughtException = null;
            var4 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
            try {
              L0: {
                L1: while (true) {
                  L2: {
                    if (this.field_j.field_j >= this.field_j.field_h.length) {
                      break L2;
                    } else {
                      var1_int = this.field_a.read(this.field_j.field_h, this.field_j.field_j, -this.field_j.field_j + this.field_j.field_h.length);
                      if (-1 < (var1_int ^ -1)) {
                        break L2;
                      } else {
                        this.field_j.field_j = this.field_j.field_j + var1_int;
                        continue L1;
                      }
                    }
                  }
                  if (this.field_j.field_j != this.field_j.field_h.length) {
                    var1 = this;
                    synchronized (var1) {
                      L3: {
                        this.finalize();
                        this.field_g = 3;
                        break L3;
                      }
                    }
                    break L0;
                  } else {
                    throw fi.<RuntimeException>$cfr$sneakyThrow(new Exception("HG1: " + this.field_j.field_h.length + " " + this.field_d));
                  }
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L4: {
                var1 = (Exception) (Object) decompiledCaughtException;
                var2_ref = this;
                synchronized (var2_ref) {
                  L5: {
                    this.finalize();
                    this.field_g = this.field_g + 1;
                    break L5;
                  }
                }
                break L4;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final synchronized boolean b(int param0) {
        IOException var2 = null;
        OutputStream var3 = null;
        java.net.Socket var4 = null;
        CharSequence var5 = null;
        Throwable decompiledCaughtException = null;
        if (2 > this.field_g) {
          L0: {
            if (0 == this.field_g) {
              L1: {
                if (null == this.field_c) {
                  this.field_c = this.field_i.a(98, this.field_d);
                  break L1;
                } else {
                  break L1;
                }
              }
              if (this.field_c.field_b == 0) {
                return false;
              } else {
                if (1 == this.field_c.field_b) {
                  break L0;
                } else {
                  this.field_g = this.field_g + 1;
                  this.field_c = null;
                  return false;
                }
              }
            } else {
              break L0;
            }
          }
          L2: {
            if (param0 == this.field_g) {
              L3: {
                if (null == this.field_f) {
                  this.field_f = this.field_i.a(this.field_d.getHost(), 443, 44);
                  break L3;
                } else {
                  break L3;
                }
              }
              if (-1 == (this.field_f.field_b ^ -1)) {
                return false;
              } else {
                if (-2 == (this.field_f.field_b ^ -1)) {
                  break L2;
                } else {
                  this.field_g = this.field_g + 1;
                  this.field_f = null;
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
                    if (0 == this.field_g) {
                      this.field_a = (DataInputStream) (this.field_c.field_g);
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                  L7: {
                    if (1 == this.field_g) {
                      var4 = (java.net.Socket) (this.field_f.field_g);
                      var4.setSoTimeout(10000);
                      var3 = var4.getOutputStream();
                      var3.write(17);
                      var5 = (CharSequence) ((Object) ("JAGGRAB " + this.field_d.getFile() + "\n\n"));
                      var3.write(b.a((byte) -120, var5));
                      this.field_a = new DataInputStream(var4.getInputStream());
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                  this.field_j.field_j = 0;
                  break L5;
                }
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L8: {
                  var2 = (IOException) (Object) decompiledCaughtException;
                  this.finalize();
                  this.field_g = this.field_g + 1;
                  break L8;
                }
              }
              break L4;
            }
          }
          L9: {
            if (null != this.field_b) {
              break L9;
            } else {
              this.field_b = this.field_i.a((Runnable) (this), 5, (byte) 28);
              break L9;
            }
          }
          if (this.field_b.field_b != 0) {
            if ((this.field_b.field_b ^ -1) == -2) {
              return false;
            } else {
              this.finalize();
              this.field_g = this.field_g + 1;
              return false;
            }
          } else {
            return false;
          }
        } else {
          return true;
        }
    }

    protected final void finalize() {
        if (this.field_c != null) {
            if (null != this.field_c.field_g) {
                try {
                    ((DataInputStream) (this.field_c.field_g)).close();
                } catch (Exception exception) {
                }
            }
            this.field_c = null;
        }
        if (!(this.field_f == null)) {
            if (null != this.field_f.field_g) {
                try {
                    ((java.net.Socket) (this.field_f.field_g)).close();
                } catch (Exception exception) {
                }
            }
            this.field_f = null;
        }
        if (!(null == this.field_a)) {
            try {
                this.field_a.close();
            } catch (Exception exception) {
            }
            this.field_a = null;
        }
        this.field_b = null;
    }

    fi(bl param0, java.net.URL param1, int param2) {
        try {
            this.field_i = param0;
            this.field_d = param1;
            this.field_j = new od(param2);
        } catch (RuntimeException runtimeException) {
            throw ie.a((Throwable) ((Object) runtimeException), "fi.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
