/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class li implements Runnable {
    private op field_j;
    private op field_b;
    private ec field_g;
    static v field_i;
    private DataInputStream field_e;
    static String field_f;
    private de field_a;
    private java.net.URL field_d;
    private op field_k;
    static v[] field_h;
    private int field_c;

    public static void b(int param0) {
        int var1 = 121 / ((30 - param0) / 34);
        field_i = null;
        field_f = null;
        field_h = null;
    }

    final synchronized boolean a(int param0) {
        IOException var2 = null;
        OutputStream var3 = null;
        java.net.Socket var4 = null;
        CharSequence var5 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        if (((li) this).field_c < 2) {
          L0: {
            if (0 == ((li) this).field_c) {
              L1: {
                if (null == ((li) this).field_b) {
                  ((li) this).field_b = ((li) this).field_g.a(7645, ((li) this).field_d);
                  break L1;
                } else {
                  break L1;
                }
              }
              if (0 != ((li) this).field_b.field_f) {
                if (((li) this).field_b.field_f != 1) {
                  ((li) this).field_b = null;
                  ((li) this).field_c = ((li) this).field_c + 1;
                  return false;
                } else {
                  break L0;
                }
              } else {
                return false;
              }
            } else {
              break L0;
            }
          }
          L2: {
            if (-2 != (((li) this).field_c ^ -1)) {
              break L2;
            } else {
              L3: {
                if (null == ((li) this).field_k) {
                  ((li) this).field_k = ((li) this).field_g.a(2, ((li) this).field_d.getHost(), 443);
                  break L3;
                } else {
                  break L3;
                }
              }
              if ((((li) this).field_k.field_f ^ -1) == -1) {
                return false;
              } else {
                if (-2 == (((li) this).field_k.field_f ^ -1)) {
                  break L2;
                } else {
                  ((li) this).field_k = null;
                  ((li) this).field_c = ((li) this).field_c + 1;
                  return false;
                }
              }
            }
          }
          L4: {
            if (null != ((li) this).field_e) {
              break L4;
            } else {
              try {
                L5: {
                  L6: {
                    if (((li) this).field_c == 0) {
                      ((li) this).field_e = (DataInputStream) ((li) this).field_b.field_d;
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                  L7: {
                    if ((((li) this).field_c ^ -1) == -2) {
                      var4 = (java.net.Socket) ((li) this).field_k.field_d;
                      var4.setSoTimeout(10000);
                      var3 = var4.getOutputStream();
                      var3.write(17);
                      var5 = (CharSequence) (Object) ("JAGGRAB " + ((li) this).field_d.getFile() + "\n\n");
                      var3.write(pd.a((byte) 67, var5));
                      ((li) this).field_e = new DataInputStream(var4.getInputStream());
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                  ((li) this).field_a.field_j = 0;
                  decompiledRegionSelector0 = 0;
                  break L5;
                }
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L8: {
                  var2 = (IOException) (Object) decompiledCaughtException;
                  ((li) this).finalize();
                  ((li) this).field_c = ((li) this).field_c + 1;
                  decompiledRegionSelector0 = 1;
                  break L8;
                }
              }
              if (decompiledRegionSelector0 == 0) {
                L9: {
                  if (param0 > 53) {
                    break L9;
                  } else {
                    ((li) this).field_g = null;
                    break L9;
                  }
                }
                L10: {
                  if (null != ((li) this).field_j) {
                    break L10;
                  } else {
                    ((li) this).field_j = ((li) this).field_g.a(5, (Runnable) this, true);
                    break L10;
                  }
                }
                if (((li) this).field_j.field_f == 0) {
                  return false;
                } else {
                  if (((li) this).field_j.field_f == 1) {
                    return false;
                  } else {
                    ((li) this).finalize();
                    ((li) this).field_c = ((li) this).field_c + 1;
                    return false;
                  }
                }
              } else {
                break L4;
              }
            }
          }
          if (param0 > 53) {
            if (null != ((li) this).field_j) {
              if (((li) this).field_j.field_f == 0) {
                return false;
              } else {
                if (((li) this).field_j.field_f == 1) {
                  return false;
                } else {
                  ((li) this).finalize();
                  ((li) this).field_c = ((li) this).field_c + 1;
                  return false;
                }
              }
            } else {
              ((li) this).field_j = ((li) this).field_g.a(5, (Runnable) this, true);
              if (((li) this).field_j.field_f == 0) {
                return false;
              } else {
                if (((li) this).field_j.field_f == 1) {
                  return false;
                } else {
                  ((li) this).finalize();
                  ((li) this).field_c = ((li) this).field_c + 1;
                  return false;
                }
              }
            }
          } else {
            ((li) this).field_g = null;
            if (null == ((li) this).field_j) {
              ((li) this).field_j = ((li) this).field_g.a(5, (Runnable) this, true);
              if (((li) this).field_j.field_f == 0) {
                return false;
              } else {
                if (((li) this).field_j.field_f != 1) {
                  ((li) this).finalize();
                  ((li) this).field_c = ((li) this).field_c + 1;
                  return false;
                } else {
                  return false;
                }
              }
            } else {
              if (((li) this).field_j.field_f == 0) {
                return false;
              } else {
                if (((li) this).field_j.field_f == 1) {
                  return false;
                } else {
                  ((li) this).finalize();
                  ((li) this).field_c = ((li) this).field_c + 1;
                  return false;
                }
              }
            }
          }
        } else {
          return true;
        }
    }

    final static void a(int param0, wk param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int stackIn_11_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_13_1 = 0;
        int stackIn_16_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_12_1 = 0;
        int stackOut_11_0 = 0;
        int stackOut_11_1 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        var10 = ZombieDawn.field_J;
        if (-2 == (sh.field_e ^ -1)) {
          if (og.field_A) {
            L0: {
              var2 = param1.a(ne.field_c.a(true), (byte) -92);
              var3 = param1.a(ne.field_c.f(param0 ^ -237220996), 0);
              var4 = fb.a(1311979239, (int)(3L * tp.field_p << -962049851)) >> 41074287;
              stackOut_10_0 = -8;
              stackIn_12_0 = stackOut_10_0;
              stackIn_11_0 = stackOut_10_0;
              if ((var4 ^ -1) > -1) {
                stackOut_12_0 = stackIn_12_0;
                stackOut_12_1 = var2;
                stackIn_13_0 = stackOut_12_0;
                stackIn_13_1 = stackOut_12_1;
                break L0;
              } else {
                stackOut_11_0 = stackIn_11_0;
                stackOut_11_1 = var2 - var4;
                stackIn_13_0 = stackOut_11_0;
                stackIn_13_1 = stackOut_11_1;
                break L0;
              }
            }
            L1: {
              var5 = stackIn_13_0 + stackIn_13_1;
              if (var4 >= 0) {
                stackOut_15_0 = var2;
                stackIn_16_0 = stackOut_15_0;
                break L1;
              } else {
                stackOut_14_0 = -var4 + var2;
                stackIn_16_0 = stackOut_14_0;
                break L1;
              }
            }
            var6 = stackIn_16_0 + 8;
            bi.a(var5, -1 + var3, -var5 + var6, 3, 0, 128);
            var7 = 0;
            L2: while (true) {
              if (-101 >= (var7 ^ -1)) {
                if (param0 != -18996) {
                  field_h = null;
                  return;
                } else {
                  return;
                }
              } else {
                if (0 < pl.field_t[var7].field_H) {
                  var8 = param1.a(pl.field_t[var7].a(true), (byte) -108) - -4;
                  var9 = 4 + param1.a(pl.field_t[var7].f(237239984), 0);
                  bi.a(var8, var9, 0);
                  var7++;
                  continue L2;
                } else {
                  var7++;
                  var7++;
                  continue L2;
                }
              }
            }
          } else {
            if (param0 == -18996) {
              return;
            } else {
              field_h = null;
              return;
            }
          }
        } else {
          if (param0 == -18996) {
            return;
          } else {
            field_h = null;
            return;
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
            var4 = ZombieDawn.field_J;
            try {
              L0: while (true) {
                L1: {
                  if (((li) this).field_a.field_j >= ((li) this).field_a.field_h.length) {
                    break L1;
                  } else {
                    var1_int = ((li) this).field_e.read(((li) this).field_a.field_h, ((li) this).field_a.field_j, -((li) this).field_a.field_j + ((li) this).field_a.field_h.length);
                    if (var1_int >= 0) {
                      ((li) this).field_a.field_j = ((li) this).field_a.field_j + var1_int;
                      continue L0;
                    } else {
                      break L1;
                    }
                  }
                }
                if (((li) this).field_a.field_j == ((li) this).field_a.field_h.length) {
                  throw li.<RuntimeException>$cfr$sneakyThrow(new Exception("HG1: " + ((li) this).field_a.field_h.length + " " + ((li) this).field_d));
                } else {
                  var1 = this;
                  synchronized (var1) {
                    L2: {
                      ((li) this).finalize();
                      ((li) this).field_c = 3;
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
                  ((li) this).finalize();
                  ((li) this).field_c = ((li) this).field_c + 1;
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

    final static void a(boolean param0) {
        bi.a(vh.field_b, id.field_M - -84, 640, 335, 0, 128);
        hk.field_H.b(vh.field_b, id.field_M + 84);
        if (param0) {
            field_h = null;
        }
    }

    li(ec param0, java.net.URL param1, int param2) {
        ((li) this).field_d = param1;
        ((li) this).field_g = param0;
        ((li) this).field_a = new de(param2);
    }

    final de a(byte param0) {
        if (param0 != -118) {
            return null;
        }
        if (!((((li) this).field_c ^ -1) != -4)) {
            return ((li) this).field_a;
        }
        return null;
    }

    protected final void finalize() {
        if (!(((li) this).field_b == null)) {
            if (!(null == ((li) this).field_b.field_d)) {
                try {
                    ((DataInputStream) ((li) this).field_b.field_d).close();
                } catch (Exception exception) {
                }
            }
            ((li) this).field_b = null;
        }
        if (!(null == ((li) this).field_k)) {
            if (((li) this).field_k.field_d != null) {
                try {
                    ((java.net.Socket) ((li) this).field_k.field_d).close();
                } catch (Exception exception) {
                }
            }
            ((li) this).field_k = null;
        }
        if (null != ((li) this).field_e) {
            try {
                ((li) this).field_e.close();
            } catch (Exception exception) {
            }
            ((li) this).field_e = null;
        }
        ((li) this).field_j = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "<%0>/<%1>";
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
