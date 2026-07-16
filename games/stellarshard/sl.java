/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class sl {
    static int[] field_a;
    static boolean field_c;
    private static sl field_e;
    private java.util.zip.Inflater field_f;
    static int field_b;
    static th field_d;

    public sl() {
        this(-1, 1000000, 1000000);
    }

    public static void a(int param0) {
        Object var2 = null;
        if (param0 > -115) {
          var2 = null;
          sl.a((java.awt.Component) null, (byte) 78);
          field_d = null;
          field_a = null;
          field_e = null;
          return;
        } else {
          field_d = null;
          field_a = null;
          field_e = null;
          return;
        }
    }

    final static void a(int param0, byte param1) {
        int var4 = stellarshard.field_B;
        ta var5 = (ta) (Object) eg.field_b.b(-86);
        while (var5 != null) {
            fb.a(param0, (byte) -118, var5);
            var5 = (ta) (Object) eg.field_b.b((byte) 55);
        }
        int var3 = -66 % ((param1 - 25) / 54);
    }

    final static byte[] a(byte param0, byte[] param1) {
        int var3 = 0;
        int var4 = 0;
        byte[] var5_ref_byte__ = null;
        int var5 = 0;
        byte[] var6 = null;
        Object var7 = null;
        Throwable var8 = null;
        Object var9 = null;
        ka var10 = null;
        byte[] var11 = null;
        byte[] var12 = null;
        byte[] var13 = null;
        byte[] var14 = null;
        byte[] var15 = null;
        byte[] var16 = null;
        byte[] var17 = null;
        byte[] var18 = null;
        Throwable decompiledCaughtException = null;
        L0: {
          var10 = new ka(param1);
          var3 = var10.f(4);
          if (param0 < -57) {
            break L0;
          } else {
            var9 = null;
            sl.a((String) null, 44, (byte) -44, (String[]) null);
            break L0;
          }
        }
        L1: {
          var4 = var10.b(false);
          if (-1 < (var4 ^ -1)) {
            break L1;
          } else {
            L2: {
              if (0 == of.field_B) {
                break L2;
              } else {
                if (var4 <= of.field_B) {
                  break L2;
                } else {
                  break L1;
                }
              }
            }
            if (var3 != 0) {
              L3: {
                var5 = var10.b(false);
                if (var5 < 0) {
                  break L3;
                } else {
                  L4: {
                    if (-1 == (of.field_B ^ -1)) {
                      break L4;
                    } else {
                      if (of.field_B >= var5) {
                        break L4;
                      } else {
                        break L3;
                      }
                    }
                  }
                  var18 = new byte[var5];
                  var16 = var18;
                  var14 = var16;
                  var12 = var14;
                  var6 = var12;
                  if (-2 == (var3 ^ -1)) {
                    int discarded$1 = j.a(var18, var5, param1, var4, 9);
                    return var6;
                  } else {
                    var7 = (Object) (Object) field_e;
                    synchronized (var7) {
                      L5: {
                        field_e.a(-1, var18, var10);
                        break L5;
                      }
                    }
                    return var6;
                  }
                }
              }
              throw new RuntimeException();
            } else {
              var17 = new byte[var4];
              var15 = var17;
              var13 = var15;
              var11 = var13;
              var5_ref_byte__ = var11;
              var10.a(0, (byte) -118, var4, var17);
              return var5_ref_byte__;
            }
          }
        }
        throw new RuntimeException();
    }

    final static void a(String param0, int param1, byte param2, String[] param3) {
        String[] var4 = null;
        int var5 = 0;
        Object var6 = null;
        int stackIn_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        var5 = stellarshard.field_B;
        el.field_E = ta.field_m;
        if (param2 < -15) {
          if ((param1 ^ -1) != -256) {
            if ((param1 ^ -1) <= -101) {
              if ((param1 ^ -1) < -106) {
                ed.field_d = fb.a(param1, true, param0);
                return;
              } else {
                var4 = param3;
                mk.a(var4, true);
                ed.field_d = gj.a(true, param3);
                return;
              }
            } else {
              ed.field_d = fb.a(param1, true, param0);
              return;
            }
          } else {
            L0: {
              if (u.field_k >= 13) {
                stackOut_5_0 = 0;
                stackIn_6_0 = stackOut_5_0;
                break L0;
              } else {
                stackOut_4_0 = 1;
                stackIn_6_0 = stackOut_4_0;
                break L0;
              }
            }
            ed.field_d = dg.a(stackIn_6_0 != 0, 0);
            var6 = null;
            mk.a((String[]) null, true);
            return;
          }
        } else {
          return;
        }
    }

    private final void a(int param0, byte[] param1, ka param2) {
        try {
            Exception exception = null;
            Throwable decompiledCaughtException = null;
            L0: {
              if (-32 != (param2.field_r[param2.field_k] ^ -1)) {
                break L0;
              } else {
                if ((param2.field_r[param2.field_k - -1] ^ -1) != 116) {
                  break L0;
                } else {
                  L1: {
                    if (((sl) this).field_f == null) {
                      ((sl) this).field_f = new java.util.zip.Inflater(true);
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                  try {
                    L2: {
                      ((sl) this).field_f.setInput(param2.field_r, param2.field_k - -10, -10 - param2.field_k - (8 - param2.field_r.length));
                      if (param0 == -1) {
                        int discarded$2 = ((sl) this).field_f.inflate(param1);
                        break L2;
                      } else {
                        return;
                      }
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    exception = (Exception) (Object) decompiledCaughtException;
                    ((sl) this).field_f.reset();
                    throw new RuntimeException("");
                  }
                  ((sl) this).field_f.reset();
                  return;
                }
              }
            }
            throw new RuntimeException("");
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(byte param0) {
        wd.field_c = false;
        if (param0 != 51) {
            field_b = -49;
            int discarded$0 = ae.field_N.f(4);
            return;
        }
        int discarded$1 = ae.field_N.f(4);
    }

    final static void a(java.awt.Component param0, byte param1) {
        param0.removeMouseListener((java.awt.event.MouseListener) (Object) sf.field_c);
        param0.removeMouseMotionListener((java.awt.event.MouseMotionListener) (Object) sf.field_c);
        param0.removeFocusListener((java.awt.event.FocusListener) (Object) sf.field_c);
        ib.field_g = 0;
        if (param1 < 89) {
            field_c = true;
        }
    }

    private sl(int param0, int param1, int param2) {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new int[12];
        field_e = new sl();
        field_b = 0;
    }
}
