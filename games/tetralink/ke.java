/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ke implements Runnable {
    private jo field_f;
    static String field_g;
    int field_d;
    static String field_e;
    private boolean field_a;
    static int field_c;
    private Thread field_b;

    final static hl a(byte param0) {
        if (param0 != -95) {
            hl discarded$0 = ke.a((byte) 83);
            return gk.a(21);
        }
        return gk.a(21);
    }

    final fd a(byte param0, sk param1, int param2) {
        fd var4 = null;
        Object var5 = null;
        fd var6 = null;
        int var7 = 0;
        Throwable var8 = null;
        int var9 = 0;
        fd stackIn_8_0 = null;
        Throwable decompiledCaughtException = null;
        fd stackOut_7_0 = null;
        var9 = TetraLink.field_J;
        var4 = new fd();
        var4.field_L = 1;
        var5 = (Object) (Object) ((ke) this).field_f;
        synchronized (var5) {
          L0: {
            var6 = (fd) (Object) ((ke) this).field_f.a((byte) 97);
            L1: while (true) {
              if (var6 == null) {
                var7 = 97 % ((param0 - 27) / 54);
                break L0;
              } else {
                L2: {
                  if ((var6.field_n ^ -1L) != ((long)param2 ^ -1L)) {
                    break L2;
                  } else {
                    if (var6.field_K != param1) {
                      break L2;
                    } else {
                      if ((var6.field_L ^ -1) == -3) {
                        var4.field_G = var6.field_G;
                        var4.field_v = false;
                        stackOut_7_0 = (fd) var4;
                        stackIn_8_0 = stackOut_7_0;
                        return stackIn_8_0;
                      } else {
                        break L2;
                      }
                    }
                  }
                }
                var6 = (fd) (Object) ((ke) this).field_f.a(false);
                continue L1;
              }
            }
          }
        }
        var4.field_G = param1.a((byte) -30, param2);
        var4.field_D = true;
        var4.field_v = false;
        return var4;
    }

    private final void a(fd param0, int param1) {
        Object var3 = null;
        Throwable var4 = null;
        Throwable decompiledCaughtException = null;
        var3 = (Object) (Object) ((ke) this).field_f;
        synchronized (var3) {
          L0: {
            L1: {
              ((ke) this).field_f.a((gb) (Object) param0, 0);
              if (param1 <= -49) {
                break L1;
              } else {
                ke.a(21);
                break L1;
              }
            }
            ((ke) this).field_d = ((ke) this).field_d + 1;
            ((Object) (Object) ((ke) this).field_f).notifyAll();
            break L0;
          }
        }
    }

    final static ud a(String param0, boolean param1) {
        String var2 = null;
        ud var3 = null;
        String var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        var5 = TetraLink.field_J;
        if (wb.field_f != null) {
          if (param0 != null) {
            if (param0.length() != 0) {
              var6 = (CharSequence) (Object) param0;
              var2 = cc.a(var6, (byte) 104);
              if (var2 != null) {
                var3 = (ud) (Object) wb.field_f.a((long)var2.hashCode(), 1);
                L0: while (true) {
                  if (var3 == null) {
                    if (!param1) {
                      return null;
                    } else {
                      field_e = null;
                      return null;
                    }
                  } else {
                    var7 = (CharSequence) (Object) var3.field_Mb;
                    var4 = cc.a(var7, (byte) 119);
                    if (var4.equals((Object) (Object) var2)) {
                      return var3;
                    } else {
                      var3 = (ud) (Object) wb.field_f.c(122);
                      continue L0;
                    }
                  }
                }
              } else {
                return null;
              }
            } else {
              return null;
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    public static void a(int param0) {
        if (param0 != 5) {
            field_g = null;
            field_e = null;
            field_g = null;
            return;
        }
        field_e = null;
        field_g = null;
    }

    final fd a(sk param0, int param1, int param2) {
        fd var4 = null;
        if (param2 < 75) {
          return null;
        } else {
          var4 = new fd();
          var4.field_n = (long)param1;
          var4.field_D = false;
          var4.field_K = param0;
          var4.field_L = 3;
          this.a(var4, -122);
          return var4;
        }
    }

    public final void run() {
        try {
            InterruptedException interruptedException = null;
            Object var2 = null;
            Exception var2_ref = null;
            Throwable var4 = null;
            int var5 = 0;
            Object var6 = null;
            fd var7 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            Throwable decompiledCaughtException = null;
            var5 = TetraLink.field_J;
            L0: while (true) {
              if (((ke) this).field_a) {
                return;
              } else {
                var2 = (Object) (Object) ((ke) this).field_f;
                synchronized (var2) {
                  L1: {
                    var7 = (fd) (Object) ((ke) this).field_f.c(-15464);
                    if (var7 != null) {
                      ((ke) this).field_d = ((ke) this).field_d - 1;
                      decompiledRegionSelector0 = 1;
                      break L1;
                    } else {
                      try {
                        L2: {
                          ((Object) (Object) ((ke) this).field_f).wait();
                          break L2;
                        }
                      } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
                        decompiledCaughtException = decompiledCaughtParameter0;
                        L3: {
                          interruptedException = (InterruptedException) (Object) decompiledCaughtException;
                          break L3;
                        }
                      }
                      decompiledRegionSelector0 = 0;
                      break L1;
                    }
                  }
                }
                if (decompiledRegionSelector0 == 0) {
                  continue L0;
                } else {
                  try {
                    L4: {
                      L5: {
                        if ((var7.field_L ^ -1) != -3) {
                          if (var7.field_L != 3) {
                            decompiledRegionSelector1 = 1;
                            break L4;
                          } else {
                            var7.field_G = var7.field_K.a((byte) -30, (int)var7.field_n);
                            var7.field_v = false;
                            break L5;
                          }
                        } else {
                          boolean discarded$1 = var7.field_K.a(var7.field_G, var7.field_G.length, 13061, (int)var7.field_n);
                          var7.field_v = false;
                          break L5;
                        }
                      }
                      decompiledRegionSelector1 = 0;
                      break L4;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter1) {
                    decompiledCaughtException = decompiledCaughtParameter1;
                    L6: {
                      var2_ref = (Exception) (Object) decompiledCaughtException;
                      var6 = null;
                      fk.a(-103, (Throwable) (Object) var2_ref, (String) null);
                      decompiledRegionSelector1 = 1;
                      break L6;
                    }
                  }
                  if (decompiledRegionSelector1 == 0) {
                    continue L0;
                  } else {
                    var7.field_v = false;
                    continue L0;
                  }
                }
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void b(int param0) {
        InterruptedException interruptedException = null;
        Object var2 = null;
        Throwable var3 = null;
        Throwable decompiledCaughtException = null;
        ((ke) this).field_a = true;
        if (param0 == -23641) {
          var2 = (Object) (Object) ((ke) this).field_f;
          synchronized (var2) {
            L0: {
              ((Object) (Object) ((ke) this).field_f).notifyAll();
              break L0;
            }
          }
          try {
            L1: {
              ((ke) this).field_b.join();
              break L1;
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            L2: {
              interruptedException = (InterruptedException) (Object) decompiledCaughtException;
              break L2;
            }
          }
          ((ke) this).field_b = null;
          return;
        } else {
          return;
        }
    }

    final fd a(int param0, int param1, byte[] param2, sk param3) {
        fd var5 = null;
        var5 = new fd();
        if (param0 > -16) {
          return null;
        } else {
          var5.field_G = param2;
          var5.field_n = (long)param1;
          var5.field_D = false;
          var5.field_K = param3;
          var5.field_L = 2;
          this.a(var5, -82);
          return var5;
        }
    }

    ke(ie param0) {
        ((ke) this).field_f = new jo();
        ((ke) this).field_d = 0;
        ((ke) this).field_a = false;
        vl var2 = param0.a((Runnable) this, 126, 5);
        while ((var2.field_d ^ -1) == -1) {
            tb.a(false, 10L);
        }
        if (-3 == (var2.field_d ^ -1)) {
            throw new RuntimeException();
        }
        ((ke) this).field_b = (Thread) var2.field_f;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "Please send me news and updates (I can unsubscribe at any time)";
        field_c = -1;
    }
}
