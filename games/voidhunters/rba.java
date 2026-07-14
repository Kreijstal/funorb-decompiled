/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rba implements ntb {
    int field_h;
    static int field_a;
    int field_c;
    static byte[] field_g;
    int field_e;
    int field_d;
    static int[][] field_b;
    int field_i;
    int field_f;

    final void b(lta param0, int param1) {
        kq.a((float)((rba) this).field_f * param0.field_a, (byte) 55, param0.b(true, ((rba) this).field_c), qpb.a(false, ((rba) this).field_d, 13894143), param0.a(((rba) this).field_i, (byte) 124));
        this.a(param0, 8947848);
        int var3 = 97 % ((55 - param1) / 49);
    }

    public final boolean a(byte param0, tv param1) {
        rba var3 = null;
        int var4 = 0;
        var3 = (rba) (Object) param1;
        var4 = 3 % ((22 - param0) / 59);
        if (var3.field_i == var3.field_i) {
          if (var3.field_c == var3.field_c) {
            if (var3.field_f == var3.field_f) {
              if (var3.field_d == var3.field_d) {
                if (var3.field_e != var3.field_e) {
                  return true;
                } else {
                  return false;
                }
              } else {
                return true;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        } else {
          return true;
        }
    }

    public final void b(faa param0, int param1) {
        param0.a(-632, ((rba) this).field_i, 32);
        param0.a(-632, ((rba) this).field_c, 32);
        param0.a(-632, ((rba) this).field_f, 32);
        param0.a(-632, ((rba) this).field_d, 32);
        param0.a(-632, ((rba) this).field_e, 32);
        if (param1 > -109) {
            ((rba) this).field_f = -88;
        }
    }

    public final void a(tv param0, int param1) {
        int var4 = 0;
        rba var5 = null;
        L0: {
          var5 = (rba) (Object) param0;
          var4 = 0;
          if (var5.field_i == var5.field_i) {
            break L0;
          } else {
            var4 = 1;
            System.out.println("int x has changed. before=" + var5.field_i + ", now=" + var5.field_i);
            break L0;
          }
        }
        L1: {
          if (var5.field_c == var5.field_c) {
            break L1;
          } else {
            System.out.println("int y has changed. before=" + var5.field_c + ", now=" + var5.field_c);
            var4 = 1;
            break L1;
          }
        }
        L2: {
          if (var5.field_f == var5.field_f) {
            break L2;
          } else {
            var4 = 1;
            System.out.println("int radius has changed. before=" + var5.field_f + ", now=" + var5.field_f);
            break L2;
          }
        }
        L3: {
          if (var5.field_d != var5.field_d) {
            var4 = 1;
            System.out.println("int team has changed. before=" + var5.field_d + ", now=" + var5.field_d);
            break L3;
          } else {
            break L3;
          }
        }
        if (param1 > -19) {
          return;
        } else {
          L4: {
            if (var5.field_e == var5.field_e) {
              break L4;
            } else {
              var4 = 1;
              System.out.println("int capture_timer has changed. before=" + var5.field_e + ", now=" + var5.field_e);
              break L4;
            }
          }
          L5: {
            if (var4 != 0) {
              System.out.println("This instance of ResourceNode has changed");
              break L5;
            } else {
              break L5;
            }
          }
          return;
        }
    }

    final boolean a(int param0, byte param1, int param2) {
        int var5 = 72 / ((8 - param1) / 57);
        int var4 = param0 - ((rba) this).field_i;
        int var6 = param2 + -((rba) this).field_c;
        int var7 = ar.a(var4, (byte) 118, var6);
        return var7 <= ((rba) this).field_f ? true : false;
    }

    public final void b(byte param0, tv param1) {
        rba var5 = null;
        rba var6 = null;
        var5 = (rba) (Object) param1;
        var6 = var5;
        var6.field_d = var5.field_d;
        var6.field_f = var5.field_f;
        if (param0 <= 54) {
          return;
        } else {
          var6.field_c = var5.field_c;
          var6.field_i = var5.field_i;
          var6.field_e = var5.field_e;
          return;
        }
    }

    private final void a(lta param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        if (param1 != 8947848) {
          L0: {
            rba.a(false);
            if (((rba) this).field_e > 0) {
              var3 = param0.a(((rba) this).field_i + -((rba) this).field_f, (byte) 112);
              var4 = param0.b(true, ((rba) this).field_c - (-((rba) this).field_f + -8192));
              var5 = (int)(2.0f * (param0.field_a * (float)((rba) this).field_f));
              var6 = (int)(8192.0f * param0.field_a);
              uv.a(126, var3 - 1, var6 + 2, -1 + var4, 8947848, var5 + 2);
              var7 = qpb.a(false, ((rba) this).field_h, 13894143);
              var8 = rmb.a(-16777216, var7);
              ci.a(var4, var6, var8, ((rba) this).field_e * var5 / oq.field_G, var3, var7, 0);
              break L0;
            } else {
              break L0;
            }
          }
          return;
        } else {
          L1: {
            if (((rba) this).field_e > 0) {
              var3 = param0.a(((rba) this).field_i + -((rba) this).field_f, (byte) 112);
              var4 = param0.b(true, ((rba) this).field_c - (-((rba) this).field_f + -8192));
              var5 = (int)(2.0f * (param0.field_a * (float)((rba) this).field_f));
              var6 = (int)(8192.0f * param0.field_a);
              uv.a(126, var3 - 1, var6 + 2, -1 + var4, 8947848, var5 + 2);
              var7 = qpb.a(false, ((rba) this).field_h, 13894143);
              var8 = rmb.a(-16777216, var7);
              ci.a(var4, var6, var8, ((rba) this).field_e * var5 / oq.field_G, var3, var7, 0);
              break L1;
            } else {
              break L1;
            }
          }
          return;
        }
    }

    final static gpb a(int param0, boolean param1, java.awt.Canvas param2, int param3) {
        try {
            Class var4 = null;
            Throwable var4_ref = null;
            gpb var5 = null;
            hq var5_ref = null;
            Object var6 = null;
            gpb stackIn_3_0 = null;
            Throwable decompiledCaughtException = null;
            gpb stackOut_2_0 = null;
            try {
              L0: {
                var4 = Class.forName("du");
                if (param1) {
                  break L0;
                } else {
                  var6 = null;
                  gpb discarded$2 = rba.a(102, true, (java.awt.Canvas) null, -4);
                  break L0;
                }
              }
              var5 = (gpb) var4.newInstance();
              var5.a(4904, param0, param3, param2);
              stackOut_2_0 = (gpb) var5;
              stackIn_3_0 = stackOut_2_0;
            } catch (java.lang.Throwable decompiledCaughtParameter) {
              decompiledCaughtException = decompiledCaughtParameter;
              return stackIn_3_0;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
        return null;
    }

    public final void a(faa param0, boolean param1) {
        ((rba) this).field_i = param0.i(0, 32);
        ((rba) this).field_c = param0.i(0, 32);
        ((rba) this).field_f = param0.i(0, 32);
        if (param1) {
          ((rba) this).field_c = 51;
          ((rba) this).field_d = param0.i(0, 32);
          ((rba) this).field_e = param0.i(0, 32);
          return;
        } else {
          ((rba) this).field_d = param0.i(0, 32);
          ((rba) this).field_e = param0.i(0, 32);
          return;
        }
    }

    rba() {
    }

    public static void a(boolean param0) {
        if (param0) {
            field_g = null;
            field_g = null;
            field_b = null;
            return;
        }
        field_g = null;
        field_b = null;
    }

    rba(int param0, int param1) {
        ((rba) this).field_c = param1;
        ((rba) this).field_e = 0;
        ((rba) this).field_f = 131072;
        ((rba) this).field_i = param0;
        ((rba) this).field_d = -1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = 15;
        field_g = new byte[]{(byte) 0};
    }
}
