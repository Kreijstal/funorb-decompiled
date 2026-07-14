/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class lla {
    private int field_g;
    static int field_h;
    static int field_e;
    private java.util.zip.Inflater field_j;
    ds field_f;
    private java.util.zip.Deflater field_i;
    private java.util.zip.CRC32 field_a;
    private int field_d;
    static int field_b;
    private int field_c;

    final byte[] a(int param0, byte[] param1) {
        ds var3 = new ds(param1);
        var3.field_e = -4 + param1.length;
        int var4 = var3.i(11468);
        var3.field_e = param0;
        byte[] var5 = new byte[var4];
        ((lla) this).a(20773, var5, var3);
        return var5;
    }

    public lla() {
        this(-1, 1000000, 1000000);
    }

    final void a(int param0, byte[] param1, ds param2) {
        try {
            Exception exception = null;
            Throwable decompiledCaughtException = null;
            L0: {
              if (param2.field_h[param2.field_e] != 31) {
                break L0;
              } else {
                if (-117 == param2.field_h[param2.field_e + 1]) {
                  L1: {
                    if (((lla) this).field_j == null) {
                      ((lla) this).field_j = new java.util.zip.Inflater(true);
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                  try {
                    L2: {
                      ((lla) this).field_j.setInput(param2.field_h, param2.field_e + 10, -10 - (param2.field_e - -8) + param2.field_h.length);
                      if (param0 == 20773) {
                        break L2;
                      } else {
                        field_e = 59;
                        break L2;
                      }
                    }
                    int discarded$2 = ((lla) this).field_j.inflate(param1);
                  } catch (java.lang.Exception decompiledCaughtParameter) {
                    decompiledCaughtException = decompiledCaughtParameter;
                  }
                  exception = (Exception) (Object) decompiledCaughtException;
                  ((lla) this).field_j.reset();
                  throw new RuntimeException("");
                } else {
                  break L0;
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

    final void a(int param0, int param1, byte[] param2, int param3) {
        try {
            int var5 = 0;
            int var6 = 0;
            byte[] var7 = null;
            int var8 = 0;
            byte[] var9 = null;
            byte[] var10 = null;
            byte[] var11 = null;
            byte[] var12 = null;
            byte[] var14 = null;
            byte[] var15 = null;
            var8 = VoidHunters.field_G;
            if (null == ((lla) this).field_f) {
              ((lla) this).field_i = new java.util.zip.Deflater(((lla) this).field_c, true);
              ((lla) this).field_a = new java.util.zip.CRC32();
              ((lla) this).field_f = new ds(((lla) this).field_g);
              ((lla) this).field_f.a(0, pb.field_f, -1, pb.field_f.length);
              ((lla) this).field_a.update(param2, param1, param3);
              ((lla) this).field_i.setInput(param2, param1, param3);
              ((lla) this).field_i.finish();
              var5 = 1;
              L0: while (true) {
                L1: {
                  var6 = ((lla) this).field_f.field_h.length + -((lla) this).field_f.field_e;
                  if ((var6 ^ -1) > -9) {
                    var15 = new byte[((lla) this).field_d + ((lla) this).field_f.field_h.length];
                    var12 = var15;
                    var10 = var12;
                    var9 = var10;
                    var7 = var9;
                    cua.a(((lla) this).field_f.field_h, 0, var15, 0, ((lla) this).field_f.field_e);
                    var6 = var6 + ((lla) this).field_d;
                    ((lla) this).field_f.field_h = var7;
                    if (var5 == 0) {
                      break L1;
                    } else {
                      var5 = 0;
                      System.out.println("[blue]Warning: GZIP deflate buffer required expanding[/blue]");
                      break L1;
                    }
                  } else {
                    break L1;
                  }
                }
                if (((lla) this).field_i.finished()) {
                  ((lla) this).field_f.a((byte) 103, (int)((lla) this).field_a.getValue());
                  if (param0 < 72) {
                    return;
                  } else {
                    ((lla) this).field_f.a((byte) 93, ((lla) this).field_i.getTotalIn());
                    ((lla) this).field_i.reset();
                    ((lla) this).field_a.reset();
                    return;
                  }
                } else {
                  ((lla) this).field_f.field_e = ((lla) this).field_f.field_e + ((lla) this).field_i.deflate(((lla) this).field_f.field_h, ((lla) this).field_f.field_e, var6);
                  continue L0;
                }
              }
            } else {
              ((lla) this).field_f.field_e = pb.field_f.length;
              ((lla) this).field_a.update(param2, param1, param3);
              ((lla) this).field_i.setInput(param2, param1, param3);
              ((lla) this).field_i.finish();
              var5 = 1;
              L2: while (true) {
                L3: {
                  var6 = ((lla) this).field_f.field_h.length + -((lla) this).field_f.field_e;
                  if ((var6 ^ -1) > -9) {
                    var14 = new byte[((lla) this).field_d + ((lla) this).field_f.field_h.length];
                    var11 = var14;
                    var10 = var11;
                    var9 = var10;
                    var7 = var9;
                    cua.a(((lla) this).field_f.field_h, 0, var14, 0, ((lla) this).field_f.field_e);
                    var6 = var6 + ((lla) this).field_d;
                    ((lla) this).field_f.field_h = var7;
                    if (var5 == 0) {
                      break L3;
                    } else {
                      var5 = 0;
                      System.out.println("[blue]Warning: GZIP deflate buffer required expanding[/blue]");
                      break L3;
                    }
                  } else {
                    break L3;
                  }
                }
                if (((lla) this).field_i.finished()) {
                  ((lla) this).field_f.a((byte) 103, (int)((lla) this).field_a.getValue());
                  if (param0 < 72) {
                    return;
                  } else {
                    ((lla) this).field_f.a((byte) 93, ((lla) this).field_i.getTotalIn());
                    ((lla) this).field_i.reset();
                    ((lla) this).field_a.reset();
                    return;
                  }
                } else {
                  ((lla) this).field_f.field_e = ((lla) this).field_f.field_e + ((lla) this).field_i.deflate(((lla) this).field_f.field_h, ((lla) this).field_f.field_e, var6);
                  continue L2;
                }
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private lla(int param0, int param1, int param2) {
        ((lla) this).field_d = param2;
        ((lla) this).field_g = param1;
        ((lla) this).field_c = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = 2;
        field_b = 200;
        field_e = field_b / 2;
    }
}
