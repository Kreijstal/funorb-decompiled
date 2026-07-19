/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class rf implements Runnable {
    private vi field_k;
    private int field_i;
    private pb field_c;
    private vi field_j;
    private le field_f;
    static String field_e;
    static ph field_d;
    static String field_g;
    private vi field_b;
    private java.net.URL field_a;
    private DataInputStream field_h;

    public final void run() {
        try {
            int var1_int = 0;
            Object var1 = null;
            Throwable var2 = null;
            Object var2_ref = null;
            Throwable var3 = null;
            int var4 = 0;
            Throwable decompiledCaughtException = null;
            var4 = Main.field_T;
            try {
              L0: {
                L1: while (true) {
                  L2: {
                    if (this.field_c.field_i >= this.field_c.field_g.length) {
                      break L2;
                    } else {
                      var1_int = this.field_h.read(this.field_c.field_g, this.field_c.field_i, this.field_c.field_g.length - this.field_c.field_i);
                      if (-1 < (var1_int ^ -1)) {
                        break L2;
                      } else {
                        this.field_c.field_i = this.field_c.field_i + var1_int;
                        continue L1;
                      }
                    }
                  }
                  if (this.field_c.field_i != this.field_c.field_g.length) {
                    var1 = this;
                    synchronized (var1) {
                      L3: {
                        this.finalize();
                        this.field_i = 3;
                        break L3;
                      }
                    }
                    break L0;
                  } else {
                    throw rf.<RuntimeException>$cfr$sneakyThrow(new Exception("HG1: " + this.field_c.field_g.length + " " + this.field_a));
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
                    this.field_i = this.field_i + 1;
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

    final static void c(int param0) {
        Object var1 = null;
        Throwable var2 = null;
        Throwable decompiledCaughtException = null;
        var1 = wc.field_B;
        synchronized (var1) {
          L0: {
            L1: {
              qd.field_a = qd.field_a + 1;
              k.field_c = ge.field_a;
              eg.field_b = r.field_s;
              ij.field_e = vd.field_s;
              d.field_s = oa.field_d;
              if (param0 <= -48) {
                break L1;
              } else {
                rf.b(-41);
                break L1;
              }
            }
            oa.field_d = false;
            dl.field_h = kk.field_b;
            ag.field_a = nl.field_d;
            jc.field_N = gk.field_b;
            kk.field_b = 0;
            break L0;
          }
        }
    }

    final synchronized boolean a(boolean param0) {
        IOException var2 = null;
        OutputStream var3 = null;
        java.net.Socket var4 = null;
        CharSequence var5 = null;
        Throwable decompiledCaughtException = null;
        if (this.field_i >= 2) {
          return true;
        } else {
          L0: {
            if (this.field_i == 0) {
              L1: {
                if (null != this.field_k) {
                  break L1;
                } else {
                  this.field_k = this.field_f.a(this.field_a, param0);
                  break L1;
                }
              }
              if (0 == this.field_k.field_a) {
                return false;
              } else {
                if (this.field_k.field_a == 1) {
                  break L0;
                } else {
                  this.field_i = this.field_i + 1;
                  this.field_k = null;
                  return false;
                }
              }
            } else {
              break L0;
            }
          }
          L2: {
            if (1 != this.field_i) {
              break L2;
            } else {
              L3: {
                if (this.field_j == null) {
                  this.field_j = this.field_f.a(this.field_a.getHost(), (byte) -78, 443);
                  break L3;
                } else {
                  break L3;
                }
              }
              if (0 == this.field_j.field_a) {
                return false;
              } else {
                if ((this.field_j.field_a ^ -1) == -2) {
                  break L2;
                } else {
                  this.field_i = this.field_i + 1;
                  this.field_j = null;
                  return false;
                }
              }
            }
          }
          L4: {
            if (this.field_h == null) {
              try {
                L5: {
                  L6: {
                    if (0 == this.field_i) {
                      this.field_h = (DataInputStream) (this.field_k.field_e);
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                  L7: {
                    if (1 == this.field_i) {
                      var4 = (java.net.Socket) (this.field_j.field_e);
                      var4.setSoTimeout(10000);
                      var3 = var4.getOutputStream();
                      var3.write(17);
                      var5 = (CharSequence) ((Object) ("JAGGRAB " + this.field_a.getFile() + "\n\n"));
                      var3.write(dd.a(var5, (byte) -127));
                      this.field_h = new DataInputStream(var4.getInputStream());
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                  this.field_c.field_i = 0;
                  break L5;
                }
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L8: {
                  var2 = (IOException) (Object) decompiledCaughtException;
                  this.finalize();
                  this.field_i = this.field_i + 1;
                  break L8;
                }
              }
              break L4;
            } else {
              break L4;
            }
          }
          L9: {
            if (this.field_b == null) {
              this.field_b = this.field_f.a(0, 5, (Runnable) (this));
              break L9;
            } else {
              break L9;
            }
          }
          if (param0) {
            if (0 != this.field_b.field_a) {
              if ((this.field_b.field_a ^ -1) != -2) {
                this.finalize();
                this.field_i = this.field_i + 1;
                return false;
              } else {
                return false;
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        }
    }

    final static boolean a(char param0, int param1) {
        char[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        char[] var6 = null;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_22_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_2_0 = 0;
        var5 = Main.field_T;
        try {
          L0: {
            if (!Character.isISOControl(param0)) {
              if (ph.a(param0, false)) {
                stackOut_6_0 = 1;
                stackIn_7_0 = stackOut_6_0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                var6 = kh.field_f;
                var2 = var6;
                var3 = param1;
                L1: while (true) {
                  if (var6.length <= var3) {
                    var2 = ok.field_a;
                    var3 = 0;
                    L2: while (true) {
                      if (var3 >= var2.length) {
                        stackOut_21_0 = 0;
                        stackIn_22_0 = stackOut_21_0;
                        decompiledRegionSelector0 = 4;
                        break L0;
                      } else {
                        var4 = var2[var3];
                        if (var4 == param0) {
                          stackOut_18_0 = 1;
                          stackIn_19_0 = stackOut_18_0;
                          decompiledRegionSelector0 = 3;
                          break L0;
                        } else {
                          var3++;
                          continue L2;
                        }
                      }
                    }
                  } else {
                    var4 = var6[var3];
                    if (param0 != var4) {
                      var3++;
                      continue L1;
                    } else {
                      stackOut_11_0 = 1;
                      stackIn_12_0 = stackOut_11_0;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    }
                  }
                }
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw ma.a((Throwable) ((Object) var2_ref), "rf.C(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_12_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_19_0 != 0;
              } else {
                return stackIn_22_0 != 0;
              }
            }
          }
        }
    }

    protected final void finalize() {
        if (!(null == this.field_k)) {
            if (null != this.field_k.field_e) {
                try {
                    ((DataInputStream) (this.field_k.field_e)).close();
                } catch (Exception exception) {
                }
            }
            this.field_k = null;
        }
        if (this.field_j != null) {
            if (null != this.field_j.field_e) {
                try {
                    ((java.net.Socket) (this.field_j.field_e)).close();
                } catch (Exception exception) {
                }
            }
            this.field_j = null;
        }
        if (null != this.field_h) {
            try {
                this.field_h.close();
            } catch (Exception exception) {
            }
            this.field_h = null;
        }
        this.field_b = null;
    }

    public static void b(int param0) {
        if (param0 != -19749) {
            return;
        }
        field_e = null;
        field_g = null;
        field_d = null;
    }

    final static void a(int param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = Main.field_T;
        try {
          L0: {
            L1: {
              ai.a(bd.field_F, param1, ei.field_f, 0, true, fk.field_h, 8192);
              if (param0 == -23243) {
                break L1;
              } else {
                rf.c(-100);
                break L1;
              }
            }
            var2_int = 0;
            L2: while (true) {
              if (ei.field_f <= var2_int) {
                L3: {
                  ai.a(ah.field_d, param1 + param1, ei.field_f + param1, param1, false, mf.field_g, 8192);
                  if (param1 < ei.field_f) {
                    ei.field_f = param1;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                break L0;
              } else {
                re.field_c[param1 + var2_int] = var2_int;
                var2_int++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ma.a((Throwable) ((Object) var2), "rf.E(" + param0 + ',' + param1 + ')');
        }
    }

    final pb a(int param0) {
        if (param0 >= -31) {
            return (pb) null;
        }
        if (this.field_i != 3) {
            return null;
        }
        return this.field_c;
    }

    rf(le param0, java.net.URL param1, int param2) {
        try {
            this.field_a = param1;
            this.field_f = param0;
            this.field_c = new pb(param2);
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) ((Object) runtimeException), "rf.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        field_e = "Difficulty: Easy";
        field_g = "If you do nothing the game will revert to normal view in <%0> second.";
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
